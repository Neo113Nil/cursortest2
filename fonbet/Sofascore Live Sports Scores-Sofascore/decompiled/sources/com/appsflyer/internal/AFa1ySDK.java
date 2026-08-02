package com.appsflyer.internal;

import android.content.Context;
import com.appsflyer.AFLogger;
import com.appsflyer.sdk_base.logger.AFLoggerBase;
import com.appsflyer.sdk_base.logger.LogTag;
import com.appsflyer.sdk_base.util.JsonUtils;
import defpackage.d7a;
import defpackage.dmi;
import defpackage.p2g;
import defpackage.u2g;
import defpackage.w2g;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\n\u0010\u000b"}, d2 = {"Lcom/appsflyer/internal/AFa1ySDK;", "Lcom/appsflyer/internal/AFa1uSDK;", "<init>", "()V", "Landroid/content/Context;", "p0", "", "registerClient", "(Landroid/content/Context;)V", "Lorg/json/JSONObject;", "d", "(Landroid/content/Context;)Lorg/json/JSONObject;"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class AFa1ySDK implements AFa1uSDK {

    @NotNull
    public static final AFa1ySDK INSTANCE = new AFa1ySDK();

    private AFa1ySDK() {
    }

    private static JSONObject d(Context p0) {
        JSONObject jSONObject = null;
        try {
            InputStream open = p0.getAssets().open("af_init_config.json");
            open.getClass();
            try {
                String E = d7a.E(new BufferedReader(new InputStreamReader(open, Charsets.UTF_8), 8192));
                open.close();
                JSONObject jSONObject2 = new JSONObject(E);
                try {
                    AFLoggerBase.d$default(AFLogger.INSTANCE, LogTag.INIT_BY_CONFIG, "Configuration file af_init_config.json loaded successfully", false, 4, null);
                    return jSONObject2;
                } catch (FileNotFoundException unused) {
                    jSONObject = jSONObject2;
                    AFLoggerBase.d$default(AFLogger.INSTANCE, LogTag.INIT_BY_CONFIG, "Configuration file af_init_config.json not found, skipping", false, 4, null);
                    return jSONObject;
                } catch (IOException e) {
                    e = e;
                    jSONObject = jSONObject2;
                    IOException iOException = e;
                    AFLoggerBase.e$default(AFLogger.INSTANCE, LogTag.INIT_BY_CONFIG, String.valueOf(iOException.getMessage()), iOException, false, false, false, false, 120, null);
                    return jSONObject;
                } catch (JSONException e2) {
                    e = e2;
                    jSONObject = jSONObject2;
                    JSONException jSONException = e;
                    AFLoggerBase.e$default(AFLogger.INSTANCE, LogTag.INIT_BY_CONFIG, String.valueOf(jSONException.getMessage()), jSONException, false, false, false, false, 120, null);
                    return jSONObject;
                } catch (Throwable th) {
                    th = th;
                    jSONObject = jSONObject2;
                    Throwable th2 = th;
                    AFLoggerBase.e$default(AFLogger.INSTANCE, LogTag.INIT_BY_CONFIG, String.valueOf(th2.getMessage()), th2, false, false, false, false, 120, null);
                    return jSONObject;
                }
            } finally {
            }
        } catch (FileNotFoundException unused2) {
        } catch (IOException e3) {
            e = e3;
        } catch (JSONException e4) {
            e = e4;
        } catch (Throwable th3) {
            th = th3;
        }
    }

    public final void registerClient(@NotNull Context p0) {
        Object u2gVar;
        Object obj;
        p0.getClass();
        JSONObject d = d(p0);
        try {
            p2g p2gVar = w2g.b;
            u2gVar = d != null ? JsonUtils.toMap(d) : null;
        } catch (Throwable th) {
            p2g p2gVar2 = w2g.b;
            u2gVar = new u2g(th);
        }
        Throwable a = w2g.a(u2gVar);
        if (a != null) {
            AFLoggerBase.e$default(AFLogger.INSTANCE, LogTag.INIT_BY_CONFIG, dmi.q("Failed to parse config: ", a.getMessage()), a, false, false, false, false, 120, null);
        }
        if (u2gVar instanceof u2g) {
            u2gVar = null;
        }
        Map map = (Map) u2gVar;
        if (map == null) {
            return;
        }
        AFLoggerBase.d$default(AFLogger.INSTANCE, LogTag.INIT_BY_CONFIG, "Starting to apply configuration from af_init_config.json", false, 4, null);
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            Object value = entry.getValue();
            if (value != null) {
                Iterator<E> it = AFa1qSDK.unregisterClient().iterator();
                while (true) {
                    if (it.hasNext()) {
                        obj = it.next();
                        if (Intrinsics.c(((AFa1qSDK) obj).registerClient, str)) {
                            break;
                        }
                    } else {
                        obj = null;
                        break;
                    }
                }
                AFa1qSDK aFa1qSDK = (AFa1qSDK) obj;
                if (aFa1qSDK == null) {
                    AFLoggerBase.i$default(AFLogger.INSTANCE, LogTag.INIT_BY_CONFIG, "Unsupported values have been inserted to the config file", false, 4, null);
                } else {
                    try {
                        aFa1qSDK.d.invoke(value);
                    } catch (Throwable th2) {
                        AFLoggerBase.e$default(AFLogger.INSTANCE, LogTag.INIT_BY_CONFIG, "Wrong Argument type was passed in the initconfig.json file.", th2, false, false, false, false, 120, null);
                    }
                }
            }
        }
        AFLoggerBase.d$default(AFLogger.INSTANCE, LogTag.INIT_BY_CONFIG, "Successfully applied configuration from af_init_config.json", false, 4, null);
    }
}
