package com.appsflyer.internal;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.appsflyer.AFLogger;
import com.appsflyer.internal.AFe1bSDK;
import com.appsflyer.internal.AFe1ySDK.AnonymousClass1;
import com.appsflyer.sdk_base.logger.LogTag;
import com.appsflyer.share.deeplink.DeepLink;
import com.appsflyer.share.deeplink.DeepLinkListener;
import com.appsflyer.share.deeplink.DeepLinkResult;
import com.ironsource.U3;
import com.ironsource.Ua;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class AFa1mSDK {

    @Nullable
    public DeepLinkListener AFLogger;
    public String d;
    private final AFc1aSDK e;

    @Nullable
    public String[] force;
    public Map<String, String> registerClient;

    @NonNull
    public List<List<String>> unregisterClient = new ArrayList();
    public long AFKeystoreWrapper = Ua.C;

    @NonNull
    public final List<String> v = new ArrayList();

    public AFa1mSDK(@NonNull AFc1aSDK aFc1aSDK) {
        this.e = aFc1aSDK;
    }

    @Nullable
    private static String AFLogger(@Nullable String str) {
        if (str == null) {
            return null;
        }
        if (!str.matches("fb\\d*?://authorize.*") || !str.contains("access_token")) {
            return str;
        }
        int indexOf = str.indexOf(63);
        String substring = indexOf == -1 ? "" : str.substring(indexOf);
        if (substring.length() == 0) {
            return str;
        }
        ArrayList arrayList = new ArrayList();
        if (substring.contains(U3.j.c)) {
            arrayList = new ArrayList(Arrays.asList(substring.split(U3.j.c)));
        } else {
            arrayList.add(substring);
        }
        StringBuilder sb = new StringBuilder();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            String str2 = (String) it.next();
            if (str2.contains("access_token")) {
                it.remove();
            } else {
                if (sb.length() != 0) {
                    sb.append(U3.j.c);
                } else if (!str2.startsWith("?")) {
                    sb.append("?");
                }
                sb.append(str2);
            }
        }
        return str.replace(substring, sb.toString());
    }

    @Nullable
    private Uri d_(Object obj, Iterator<String> it) {
        while (obj != JSONObject.NULL) {
            if (!it.hasNext()) {
                Uri parse = Uri.parse(obj.toString());
                if (parse == null || parse.getScheme() == null || parse.getHost() == null) {
                    return null;
                }
                return parse;
            }
            try {
                obj = new JSONObject(obj.toString()).get(it.next());
            } catch (JSONException e) {
                AFLogger.INSTANCE.e(LogTag.DDL, "Failed to parse deeplink from recursive JSON search", e, false, false);
                return null;
            }
        }
        return null;
    }

    private void unregisterClient() {
        try {
            this.e.setUserEmails().unregisterClient();
        } catch (Throwable th) {
            AFLogger aFLogger = AFLogger.INSTANCE;
            LogTag logTag = LogTag.DDL;
            StringBuilder sb = new StringBuilder("Could not notify deeplink extraction finished: ");
            sb.append(th.getMessage());
            aFLogger.d(logTag, sb.toString());
        }
    }

    public final void AFKeystoreWrapper(Map<String, String> map) {
        DeepLinkResult deepLinkResult;
        if (this.AFLogger != null) {
            try {
                try {
                    deepLinkResult = new DeepLinkResult(DeepLink.parseFromOaoa(map).setDeferred(false), null);
                } catch (JSONException e) {
                    AFLogger.INSTANCE.e(LogTag.DDL, "Error occurred", e, true);
                    deepLinkResult = new DeepLinkResult(null, DeepLinkResult.Error.UNEXPECTED);
                }
                registerClient(deepLinkResult);
            } catch (Throwable th) {
                registerClient(new DeepLinkResult(null, null));
                throw th;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x008b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:44:? A[LOOP:0: B:32:0x005d->B:44:?, LOOP_END, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b_(AFa1hSDK aFa1hSDK, Intent intent, Context context) {
        boolean z;
        String string;
        Uri d_;
        AFc1dSDK aFc1dSDK = (AFc1dSDK) this.e;
        if (context != null) {
            aFc1dSDK.registerClient.d = context.getApplicationContext();
        }
        if (intent == null) {
            AFLogger.INSTANCE.d(LogTag.DDL, "Intent is null, skipping deeplink processing");
        } else if (new AFi1eSDK(intent).d("af_consumed")) {
            AFLogger.INSTANCE.d(LogTag.DDL, "skipping re-use of previously consumed deeplink w/af_consumed");
        } else {
            Uri uri = null;
            Uri data = "android.intent.action.VIEW".equals(intent.getAction()) ? intent.getData() : null;
            Bundle extras = intent.getExtras();
            if (!this.unregisterClient.isEmpty() && extras != null) {
                Iterator<List<String>> it = this.unregisterClient.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    List<String> next = it.next();
                    if (next != null) {
                        Iterator<String> it2 = next.iterator();
                        if (it2.hasNext() && (string = extras.getString(it2.next())) != null) {
                            d_ = d_(string, it2);
                            if (d_ == null) {
                                AFLogger.INSTANCE.d(LogTag.DDL, "Deeplink extracted from push notification payload at path: ".concat(String.valueOf(next)));
                                AFj1tSDK.d(aFa1hSDK.AFLogger).put("payloadKey", this.unregisterClient);
                                AFa1kSDK aFa1kSDK = aFa1hSDK.AFKeystoreWrapper;
                                if (aFa1kSDK != null) {
                                    aFa1kSDK.d(aFa1hSDK.AFLogger);
                                }
                                uri = d_;
                            }
                        }
                    }
                    d_ = null;
                    if (d_ == null) {
                    }
                }
            }
            for (Uri uri2 : Arrays.asList(data, uri)) {
                if (uri2 != null) {
                    new AFi1eSDK(intent).P_("af_consumed", System.currentTimeMillis());
                    c_(aFa1hSDK, uri2);
                    z = true;
                    break;
                }
            }
            AFLogger.INSTANCE.d(LogTag.DDL, "No deep link detected");
        }
        z = false;
        if (!z && this.AFLogger != null && this.e.AFKeystoreWrapper().AFKeystoreWrapper.d("appsFlyerCount", 0) == 0 && !this.e.registerClient().registerClient("ddl_sent")) {
            AFe1ySDK afWarnLog = this.e.afWarnLog();
            afWarnLog.unregisterClient.execute(afWarnLog.new AnonymousClass1(new AFe1jSDK(this.e)));
        }
        if (!z) {
            unregisterClient();
        }
        this.e.registerClient().unregisterClient("ddl_sent", true);
    }

    public final void c_(AFa1hSDK aFa1hSDK, Uri uri) {
        if (this.e.valueOf().d != null) {
            if (this.v.isEmpty()) {
                f_(aFa1hSDK, uri, null);
                return;
            }
            AFe1ySDK afWarnLog = this.e.afWarnLog();
            afWarnLog.unregisterClient.execute(afWarnLog.new AnonymousClass1(new AFe1eSDK(this, aFa1hSDK, uri, this.v)));
        }
    }

    public final boolean e_(@Nullable Intent intent) {
        if (intent == null) {
            return false;
        }
        return ("android.intent.action.VIEW".equals(intent.getAction()) && intent.getData() != null) || !this.unregisterClient.isEmpty();
    }

    public final void f_(AFa1hSDK aFa1hSDK, Uri uri, @Nullable Uri uri2) {
        if (!aFa1hSDK.AFLogger.containsKey("af_deeplink")) {
            String AFLogger = AFLogger(uri.toString());
            String str = this.d;
            if (str != null && this.registerClient != null && AFLogger.contains(str)) {
                Uri.Builder buildUpon = Uri.parse(AFLogger).buildUpon();
                Uri.Builder buildUpon2 = Uri.EMPTY.buildUpon();
                for (Map.Entry<String, String> entry : this.registerClient.entrySet()) {
                    buildUpon.appendQueryParameter(entry.getKey(), entry.getValue());
                    buildUpon2.appendQueryParameter(entry.getKey(), entry.getValue());
                }
                AFLogger = buildUpon.build().toString();
                aFa1hSDK.AFLogger.put("appended_query_params", buildUpon2.build().getEncodedQuery());
                AFa1kSDK aFa1kSDK = aFa1hSDK.AFKeystoreWrapper;
                if (aFa1kSDK != null) {
                    aFa1kSDK.d(aFa1hSDK.AFLogger);
                }
            }
            aFa1hSDK.AFLogger.put("af_deeplink", AFLogger);
            AFa1kSDK aFa1kSDK2 = aFa1hSDK.AFKeystoreWrapper;
            if (aFa1kSDK2 != null) {
                aFa1kSDK2.d(aFa1hSDK.AFLogger);
            }
        }
        unregisterClient();
        final HashMap hashMap = new HashMap();
        hashMap.put("link", uri.toString());
        if (uri2 != null) {
            hashMap.put("original_link", uri2.toString());
        }
        AFi1cSDK.S_(this.e.AFKeystoreWrapper().r_(), hashMap, uri);
        AFe1bSDK aFe1bSDK = new AFe1bSDK(this.e, UUID.randomUUID(), uri);
        if (aFe1bSDK.i) {
            aFa1hSDK.AFLogger.put("isBrandedDomain", Boolean.TRUE);
            AFa1kSDK aFa1kSDK3 = aFa1hSDK.AFKeystoreWrapper;
            if (aFa1kSDK3 != null) {
                aFa1kSDK3.d(aFa1hSDK.AFLogger);
            }
        }
        if (!aFe1bSDK.afDebugLog()) {
            AFKeystoreWrapper(hashMap);
            return;
        }
        aFe1bSDK.e = new AFe1bSDK.AFa1ySDK() { // from class: com.appsflyer.internal.AFa1mSDK.4
            @Override // com.appsflyer.internal.AFe1bSDK.AFa1ySDK
            public final void AFKeystoreWrapper(String str2) {
                AFa1mSDK.this.registerClient(str2, DeepLinkResult.Error.NETWORK);
            }

            @Override // com.appsflyer.internal.AFe1bSDK.AFa1ySDK
            public final void unregisterClient(Map<String, String> map) {
                for (String str2 : map.keySet()) {
                    hashMap.put(str2, map.get(str2));
                }
                AFa1mSDK.this.AFKeystoreWrapper(hashMap);
            }
        };
        AFe1ySDK afWarnLog = this.e.afWarnLog();
        afWarnLog.unregisterClient.execute(afWarnLog.new AnonymousClass1(aFe1bSDK));
    }

    public final void registerClient(DeepLinkResult deepLinkResult) {
        if (this.AFLogger == null) {
            AFLogger.INSTANCE.d(LogTag.DDL, "skipping, no callback registered");
            return;
        }
        AFLogger aFLogger = AFLogger.INSTANCE;
        LogTag logTag = LogTag.DDL;
        StringBuilder sb = new StringBuilder("Calling onDeepLinking with:\n");
        sb.append(deepLinkResult.toString());
        aFLogger.d(logTag, sb.toString());
        try {
            this.AFLogger.onDeepLinking(deepLinkResult);
        } catch (Throwable th) {
            AFLogger.INSTANCE.e(LogTag.DDL, th.getLocalizedMessage() != null ? th.getLocalizedMessage() : "Error in onDeepLinking callback execution", th);
        }
    }

    public final void registerClient(String str, DeepLinkResult.Error error) {
        if (this.AFLogger != null) {
            AFLogger.INSTANCE.d(LogTag.DDL, "Error occurred: ".concat(String.valueOf(str)));
            registerClient(new DeepLinkResult(null, error));
        }
    }
}
