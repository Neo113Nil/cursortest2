package com.intercom.reactnative;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableMapKeySetIterator;
import com.facebook.react.bridge.ReadableType;
import com.facebook.react.bridge.WritableMap;
import io.intercom.android.sdk.AuthToken;
import io.intercom.android.sdk.Company;
import io.intercom.android.sdk.Intercom;
import io.intercom.android.sdk.UserAttributes;
import io.intercom.android.sdk.identity.Registration;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes8.dex */
public class IntercomHelpers {
    public static Intercom.Visibility stringToVisibility(String str) {
        if (str.equalsIgnoreCase("VISIBLE")) {
            return Intercom.Visibility.VISIBLE;
        }
        return Intercom.Visibility.GONE;
    }

    public static int stringToLogLevel(String str) {
        str.hashCode();
        switch (str) {
            case "INFO":
                return 4;
            case "WARN":
                return 5;
            case "DEBUG":
                return 3;
            case "ERROR":
                return 6;
            case "VERBOSE":
                return 2;
            case "ASSERT":
                return 7;
            default:
                return 8;
        }
    }

    public static Date parseDateFromTimestamp(Number number) {
        return new Date(number.longValue() * 1000);
    }

    public static Company buildCompany(ReadableMap readableMap) {
        if (!readableMap.hasKey("id")) {
            return null;
        }
        Company.Builder builder = new Company.Builder();
        builder.withCompanyId(readableMap.getString("id"));
        if (readableMap.hasKey("name")) {
            builder.withName(readableMap.getString("name"));
        }
        if (readableMap.hasKey("plan")) {
            builder.withPlan(readableMap.getString("plan"));
        }
        if (readableMap.hasKey("monthlySpend")) {
            builder.withMonthlySpend(Integer.valueOf(readableMap.getInt("monthlySpend")));
        }
        if (readableMap.hasKey("createdAt")) {
            builder.withCreatedAt(Long.valueOf(readableMap.getInt("createdAt")));
        }
        if (readableMap.hasKey("customAttributes")) {
            builder.withCustomAttributes(deconstructReadableMap(readableMap.getMap("customAttributes"), false));
        }
        return builder.build();
    }

    public static Map<String, Object> deconstructReadableMap(ReadableMap readableMap, Boolean bool) {
        ReadableMapKeySetIterator keySetIterator = readableMap.keySetIterator();
        HashMap hashMap = new HashMap();
        while (keySetIterator.hasNextKey()) {
            String nextKey = keySetIterator.nextKey();
            switch (AnonymousClass1.$SwitchMap$com$facebook$react$bridge$ReadableType[readableMap.getType(nextKey).ordinal()]) {
                case 1:
                    hashMap.put(nextKey, null);
                    break;
                case 2:
                    hashMap.put(nextKey, Boolean.valueOf(readableMap.getBoolean(nextKey)));
                    break;
                case 3:
                    hashMap.put(nextKey, Double.valueOf(readableMap.getDouble(nextKey)));
                    break;
                case 4:
                    hashMap.put(nextKey, readableMap.getString(nextKey));
                    break;
                case 5:
                    if (!bool.booleanValue()) {
                        break;
                    } else {
                        hashMap.put(nextKey, deconstructReadableMap(readableMap.getMap(nextKey), true));
                        break;
                    }
                case 6:
                    if (!bool.booleanValue()) {
                        break;
                    } else {
                        hashMap.put(nextKey, recursivelyDeconstructReadableArray(readableMap.getArray(nextKey)));
                        break;
                    }
                default:
                    throw new IllegalArgumentException("Could not convert object with key: " + nextKey + ".");
            }
        }
        return hashMap;
    }

    /* renamed from: com.intercom.reactnative.IntercomHelpers$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$facebook$react$bridge$ReadableType;

        static {
            int[] iArr = new int[ReadableType.values().length];
            $SwitchMap$com$facebook$react$bridge$ReadableType = iArr;
            try {
                iArr[ReadableType.Null.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$facebook$react$bridge$ReadableType[ReadableType.Boolean.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$facebook$react$bridge$ReadableType[ReadableType.Number.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$facebook$react$bridge$ReadableType[ReadableType.String.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$facebook$react$bridge$ReadableType[ReadableType.Map.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$facebook$react$bridge$ReadableType[ReadableType.Array.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    public static List<Object> recursivelyDeconstructReadableArray(ReadableArray readableArray) {
        ArrayList arrayList = new ArrayList(readableArray.size());
        for (int i = 0; i < readableArray.size(); i++) {
            switch (AnonymousClass1.$SwitchMap$com$facebook$react$bridge$ReadableType[readableArray.getType(i).ordinal()]) {
                case 1:
                    arrayList.add(i, null);
                    break;
                case 2:
                    arrayList.add(i, Boolean.valueOf(readableArray.getBoolean(i)));
                    break;
                case 3:
                    arrayList.add(i, Double.valueOf(readableArray.getDouble(i)));
                    break;
                case 4:
                    arrayList.add(i, readableArray.getString(i));
                    break;
                case 5:
                    arrayList.add(i, deconstructReadableMap(readableArray.getMap(i), true));
                    break;
                case 6:
                    arrayList.add(i, recursivelyDeconstructReadableArray(readableArray.getArray(i)));
                    break;
                default:
                    throw new IllegalArgumentException("Could not convert object at index " + i + ".");
            }
        }
        return arrayList;
    }

    public static List<String> readableArrayToStringList(ReadableArray readableArray) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < readableArray.size(); i++) {
            if (AnonymousClass1.$SwitchMap$com$facebook$react$bridge$ReadableType[readableArray.getType(i).ordinal()] == 4) {
                arrayList.add(i, readableArray.getString(i));
            }
        }
        return arrayList;
    }

    public static UserAttributes buildUserAttributes(ReadableMap readableMap) {
        String nextKey;
        int i;
        UserAttributes.Builder builder = new UserAttributes.Builder();
        ReadableMapKeySetIterator keySetIterator = readableMap.keySetIterator();
        while (keySetIterator.hasNextKey()) {
            nextKey = keySetIterator.nextKey();
            nextKey.hashCode();
            switch (nextKey) {
                case "companies":
                    ReadableArray array = readableMap.getArray(nextKey);
                    for (i = 0; i < array.size(); i++) {
                        Company buildCompany = buildCompany(array.getMap(i));
                        if (buildCompany != null) {
                            builder.withCompany(buildCompany);
                        }
                    }
                    break;
                case "unsubscribedFromEmails":
                    builder.withUnsubscribedFromEmails(Boolean.valueOf(readableMap.getBoolean(nextKey)));
                    break;
                case "signedUpAt":
                    builder.withSignedUpAt(parseDateFromTimestamp(Integer.valueOf(readableMap.getInt(nextKey))));
                    break;
                case "userId":
                    builder.withUserId(readableMap.getString(nextKey));
                    break;
                case "name":
                    builder.withName(readableMap.getString(nextKey));
                    break;
                case "email":
                    builder.withEmail(readableMap.getString(nextKey));
                    break;
                case "phone":
                    builder.withPhone(readableMap.getString(nextKey));
                    break;
                case "languageOverride":
                    builder.withLanguageOverride(readableMap.getString(nextKey));
                    break;
                case "customAttributes":
                    if (readableMap.getType(nextKey) == ReadableType.Map) {
                        builder.withCustomAttributes(deconstructReadableMap(readableMap.getMap(nextKey), false));
                        break;
                    } else {
                        break;
                    }
            }
        }
        return builder.build();
    }

    public static String getValueAsStringForKey(ReadableMap readableMap, String str) {
        int i = AnonymousClass1.$SwitchMap$com$facebook$react$bridge$ReadableType[readableMap.getType(str).ordinal()];
        if (i == 3) {
            return String.valueOf(readableMap.getInt(str));
        }
        if (i == 4) {
            return readableMap.getString(str);
        }
        throw new IllegalArgumentException("Value for Key: \"" + str + "\" should be a String");
    }

    public static WritableMap deconstructRegistration(Registration registration) {
        WritableMap createMap = Arguments.createMap();
        if (registration.getEmail() != null) {
            createMap.putString("email", registration.getEmail());
        }
        if (registration.getUserId() != null) {
            createMap.putString("userId", registration.getUserId());
        }
        return createMap;
    }

    public static List<AuthToken> buildAuthTokensList(ReadableMap readableMap) {
        ArrayList arrayList = new ArrayList();
        ReadableMapKeySetIterator keySetIterator = readableMap.keySetIterator();
        while (keySetIterator.hasNextKey()) {
            String nextKey = keySetIterator.nextKey();
            if (readableMap.getType(nextKey) == ReadableType.String) {
                String string = readableMap.getString(nextKey);
                if (nextKey != null && string != null && !nextKey.isEmpty() && !string.isEmpty()) {
                    arrayList.add(new AuthToken(nextKey, string));
                }
            }
        }
        return arrayList;
    }
}
