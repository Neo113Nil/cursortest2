package io.sentry.util.network;

import io.sentry.ILogger;
import io.sentry.SentryLevel;
import io.sentry.util.network.NetworkBody;
import io.sentry.vendor.gson.stream.JsonReader;
import io.sentry.vendor.gson.stream.JsonToken;
import java.io.StringReader;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;

/* loaded from: classes9.dex */
public final class NetworkBodyParser {
    private NetworkBodyParser() {
    }

    public static NetworkBody fromBytes(byte[] bArr, String str, String str2, int i, ILogger iLogger) {
        if (bArr == null || bArr.length == 0) {
            return null;
        }
        if (str != null && isBinaryContentType(str)) {
            return new NetworkBody("[Binary data, " + bArr.length + " bytes, type: " + str + "]");
        }
        if (str2 == null) {
            str2 = "UTF-8";
        }
        try {
            return parse(new String(bArr, 0, Math.min(bArr.length, i), str2), str, bArr.length > i, iLogger);
        } catch (UnsupportedEncodingException e) {
            iLogger.log(SentryLevel.WARNING, "Failed to decode bytes: " + e.getMessage(), new Object[0]);
            return new NetworkBody("[Failed to decode bytes, " + bArr.length + " bytes]", Collections.singletonList(NetworkBody.NetworkBodyWarning.BODY_PARSE_ERROR));
        }
    }

    private static NetworkBody parse(String str, String str2, boolean z, ILogger iLogger) {
        if (str == null || str.isEmpty()) {
            return null;
        }
        if (str2 != null) {
            String lowerCase = str2.toLowerCase(Locale.ROOT);
            if (lowerCase.contains("application/x-www-form-urlencoded")) {
                return parseFormUrlEncoded(str, z, iLogger);
            }
            if (lowerCase.contains("application/json")) {
                return parseJson(str, z, iLogger);
            }
        }
        return new NetworkBody(str, z ? Collections.singletonList(NetworkBody.NetworkBodyWarning.TEXT_TRUNCATED) : null);
    }

    private static NetworkBody parseJson(String str, boolean z, ILogger iLogger) {
        List singletonList;
        try {
            JsonReader jsonReader = new JsonReader(new StringReader(str));
            try {
                SaferJsonParser.Result parse = SaferJsonParser.parse(jsonReader);
                Object obj = parse.data;
                if (obj == null && !z && !parse.errored && !parse.hitMaxDepth) {
                    NetworkBody networkBody = new NetworkBody(null);
                    jsonReader.close();
                    return networkBody;
                }
                if (!z && !parse.hitMaxDepth) {
                    singletonList = parse.errored ? Collections.singletonList(NetworkBody.NetworkBodyWarning.INVALID_JSON) : null;
                    NetworkBody networkBody2 = new NetworkBody(obj, singletonList);
                    jsonReader.close();
                    return networkBody2;
                }
                singletonList = Collections.singletonList(NetworkBody.NetworkBodyWarning.JSON_TRUNCATED);
                NetworkBody networkBody22 = new NetworkBody(obj, singletonList);
                jsonReader.close();
                return networkBody22;
            } finally {
            }
        } catch (Exception e) {
            if (iLogger != null) {
                iLogger.log(SentryLevel.WARNING, "Failed to parse JSON: " + e.getMessage(), new Object[0]);
            }
            return new NetworkBody(null, Collections.singletonList(NetworkBody.NetworkBodyWarning.INVALID_JSON));
        }
    }

    private static NetworkBody parseFormUrlEncoded(String str, boolean z, ILogger iLogger) {
        try {
            HashMap hashMap = new HashMap();
            for (String str2 : str.split("&", -1)) {
                int indexOf = str2.indexOf("=");
                if (indexOf > 0) {
                    String decode = URLDecoder.decode(str2.substring(0, indexOf), "UTF-8");
                    String decode2 = indexOf < str2.length() + (-1) ? URLDecoder.decode(str2.substring(indexOf + 1), "UTF-8") : "";
                    if (hashMap.containsKey(decode)) {
                        Object obj = hashMap.get(decode);
                        if (obj instanceof List) {
                            ((List) obj).add(decode2);
                        } else {
                            ArrayList arrayList = new ArrayList();
                            arrayList.add((String) obj);
                            arrayList.add(decode2);
                            hashMap.put(decode, arrayList);
                        }
                    } else {
                        hashMap.put(decode, decode2);
                    }
                }
            }
            return new NetworkBody(hashMap, z ? Collections.singletonList(NetworkBody.NetworkBodyWarning.TEXT_TRUNCATED) : null);
        } catch (UnsupportedEncodingException e) {
            if (iLogger != null) {
                iLogger.log(SentryLevel.WARNING, "Failed to parse form data: " + e.getMessage(), new Object[0]);
            }
            return new NetworkBody(null, Collections.singletonList(NetworkBody.NetworkBodyWarning.BODY_PARSE_ERROR));
        }
    }

    private static boolean isBinaryContentType(String str) {
        String lowerCase = str.toLowerCase(Locale.ROOT);
        return lowerCase.contains("image/") || lowerCase.contains("video/") || lowerCase.contains("audio/") || lowerCase.contains("application/octet-stream") || lowerCase.contains("application/pdf") || lowerCase.contains("application/zip") || lowerCase.contains("application/gzip");
    }

    private static class SaferJsonParser {
        private static final int MAX_DEPTH = 100;
        final Result result = new Result(null);

        private static class Result {
            private Object data;
            private boolean errored;
            private boolean hitMaxDepth;

            private Result() {
            }

            /* synthetic */ Result(AnonymousClass1 anonymousClass1) {
                this();
            }
        }

        private SaferJsonParser() {
        }

        public static Result parse(JsonReader jsonReader) {
            SaferJsonParser saferJsonParser = new SaferJsonParser();
            saferJsonParser.result.data = saferJsonParser.parse(jsonReader, 0);
            return saferJsonParser.result;
        }

        private Object parse(JsonReader jsonReader, int i) {
            if (this.result.errored) {
                return null;
            }
            if (i >= 100) {
                this.result.hitMaxDepth = true;
                return null;
            }
            try {
                switch (AnonymousClass1.$SwitchMap$io$sentry$vendor$gson$stream$JsonToken[jsonReader.peek().ordinal()]) {
                    case 1:
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        try {
                            jsonReader.beginObject();
                            while (jsonReader.hasNext() && !this.result.errored) {
                                linkedHashMap.put(jsonReader.nextName(), parse(jsonReader, i + 1));
                            }
                            jsonReader.endObject();
                            return linkedHashMap;
                        } catch (Exception unused) {
                            this.result.errored = true;
                            return linkedHashMap;
                        }
                    case 2:
                        ArrayList arrayList = new ArrayList();
                        try {
                            jsonReader.beginArray();
                            while (jsonReader.hasNext() && !this.result.errored) {
                                arrayList.add(parse(jsonReader, i + 1));
                            }
                            jsonReader.endArray();
                            return arrayList;
                        } catch (Exception unused2) {
                            this.result.errored = true;
                            return arrayList;
                        }
                    case 3:
                        return jsonReader.nextString();
                    case 4:
                        return Double.valueOf(jsonReader.nextDouble());
                    case 5:
                        return Boolean.valueOf(jsonReader.nextBoolean());
                    case 6:
                        jsonReader.nextNull();
                        return null;
                    default:
                        this.result.errored = true;
                        return null;
                }
            } catch (Exception unused3) {
                this.result.errored = true;
                return null;
            }
            this.result.errored = true;
            return null;
        }
    }

    /* renamed from: io.sentry.util.network.NetworkBodyParser$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$io$sentry$vendor$gson$stream$JsonToken;

        static {
            int[] iArr = new int[JsonToken.values().length];
            $SwitchMap$io$sentry$vendor$gson$stream$JsonToken = iArr;
            try {
                iArr[JsonToken.BEGIN_OBJECT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$io$sentry$vendor$gson$stream$JsonToken[JsonToken.BEGIN_ARRAY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$io$sentry$vendor$gson$stream$JsonToken[JsonToken.STRING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$io$sentry$vendor$gson$stream$JsonToken[JsonToken.NUMBER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$io$sentry$vendor$gson$stream$JsonToken[JsonToken.BOOLEAN.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$io$sentry$vendor$gson$stream$JsonToken[JsonToken.NULL.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }
}
