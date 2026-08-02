package com.appsflyer.internal;

import android.net.Uri;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.appsflyer.AFLogger;
import com.appsflyer.internal.components.network.http.exceptions.ParsingException;
import com.appsflyer.sdk_base.logger.LogTag;
import com.appsflyer.share.attribution.AppsFlyerRequestListener;
import com.appsflyer.share.network.http.ResponseNetwork;
import com.ironsource.Ua;
import com.unity3d.services.UnityAdsConstants;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.UUID;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class AFe1bSDK extends AFe1oSDK<Map<String, String>> {
    private String AFLoggerLogLevel;
    private final AFd1tSDK afDebugLog;
    private String afErrorLog;
    private final UUID afInfoLog;
    private String afWarnLog;

    @Nullable
    public AFa1ySDK e;
    public final boolean i;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public interface AFa1ySDK {
        void AFKeystoreWrapper(String str);

        void unregisterClient(Map<String, String> map);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AFe1bSDK(@NonNull AFc1aSDK aFc1aSDK, @NonNull UUID uuid, @NonNull Uri uri) {
        super(AFd1aSDK.i, new AFe1zSDK[]{AFd1aSDK.registerClient}, aFc1aSDK, uuid.toString());
        String path;
        boolean z = false;
        this.afDebugLog = aFc1aSDK.d();
        this.afInfoLog = uuid;
        try {
            String host = uri.getHost();
            if (host != null && host.length() != 0 && (path = uri.getPath()) != null && path.length() != 0) {
                try {
                    Object[] objArr = {uri, aFc1aSDK.onPause()};
                    Map map = AFb1ySDK.getInstance;
                    Object obj = map.get(-130779650);
                    if (obj == null) {
                        obj = ((Class) AFb1ySDK.AFLogger((ViewConfiguration.getScrollFriction() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (ViewConfiguration.getScrollFriction() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)) + 36, ((byte) KeyEvent.getModifierMetaStateMask()) + 1, (char) (TextUtils.getOffsetBefore("", 0) + 31739))).getDeclaredConstructor(Uri.class, AFa1mSDK.class);
                        map.put(-130779650, obj);
                    }
                    Object newInstance = ((Constructor) obj).newInstance(objArr);
                    try {
                        Object obj2 = map.get(-1563021701);
                        if (obj2 == null) {
                            obj2 = ((Class) AFb1ySDK.AFLogger(37 - KeyEvent.normalizeMetaState(0), KeyEvent.getMaxKeyCode() >> 16, (char) ((ViewConfiguration.getScrollDefaultDelay() >> 16) + 31739))).getMethod("registerClient", null);
                            map.put(-1563021701, obj2);
                        }
                        Object invoke = ((Method) obj2).invoke(newInstance, null);
                        try {
                            Object obj3 = map.get(2130924844);
                            if (obj3 == null) {
                                obj3 = ((Class) AFb1ySDK.AFLogger(51 - TextUtils.indexOf((CharSequence) "", '0', 0), TextUtils.getCapsMode("", 0, 0) + 37, (char) (ViewConfiguration.getScrollBarFadeDuration() >> 16))).getMethod("unregisterClient", null);
                                map.put(2130924844, obj3);
                            }
                            boolean booleanValue = ((Boolean) ((Method) obj3).invoke(invoke, null)).booleanValue();
                            try {
                                Object obj4 = map.get(510437835);
                                if (obj4 == null) {
                                    obj4 = ((Class) AFb1ySDK.AFLogger((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 53, 38 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), (char) TextUtils.getTrimmedLength(""))).getMethod("AFKeystoreWrapper", null);
                                    map.put(510437835, obj4);
                                }
                                z = ((Boolean) ((Method) obj4).invoke(invoke, null)).booleanValue();
                                String[] split = uri.getPath().split("/");
                                if (booleanValue && split.length == 3) {
                                    this.AFLoggerLogLevel = split[1];
                                    this.afWarnLog = split[2];
                                    this.afErrorLog = uri.toString();
                                }
                            } catch (Throwable th) {
                                Throwable cause = th.getCause();
                                if (cause == null) {
                                    throw th;
                                }
                                throw cause;
                            }
                        } catch (Throwable th2) {
                            Throwable cause2 = th2.getCause();
                            if (cause2 == null) {
                                throw th2;
                            }
                            throw cause2;
                        }
                    } catch (Throwable th3) {
                        Throwable cause3 = th3.getCause();
                        if (cause3 == null) {
                            throw th3;
                        }
                        throw cause3;
                    }
                } catch (Throwable th4) {
                    Throwable cause4 = th4.getCause();
                    if (cause4 == null) {
                        throw th4;
                    }
                    throw cause4;
                }
            }
        } catch (Exception e) {
            AFLogger.INSTANCE.e(LogTag.DDL, "OneLinkValidator: reflection init failed", e, false, false);
        }
        this.i = z;
    }

    @Override // com.appsflyer.internal.AFe1oSDK, com.appsflyer.internal.AFe1vSDK
    public final void AFLogger() {
        ResponseNetwork responseNetwork;
        super.AFLogger();
        AFa1ySDK aFa1ySDK = this.e;
        if (aFa1ySDK != null) {
            if (this.AFKeystoreWrapper == AFd1bSDK.SUCCESS && (responseNetwork = ((AFe1oSDK) this).w) != null) {
                aFa1ySDK.unregisterClient((Map) responseNetwork.getBody());
                return;
            }
            Throwable force = force();
            if (!(force instanceof ParsingException)) {
                String str = this.afErrorLog;
                aFa1ySDK.AFKeystoreWrapper(str != null ? str : "Can't get OneLink data");
            } else if (((ParsingException) force).getRawResponse().isSuccessful()) {
                aFa1ySDK.AFKeystoreWrapper("Can't parse one link data");
            } else {
                String str2 = this.afErrorLog;
                aFa1ySDK.AFKeystoreWrapper(str2 != null ? str2 : "Can't get OneLink data");
            }
        }
    }

    @Override // com.appsflyer.internal.AFe1oSDK
    @Nullable
    public final AppsFlyerRequestListener AFLoggerLogLevel() {
        return null;
    }

    @Override // com.appsflyer.internal.AFe1oSDK
    public final boolean a_() {
        return false;
    }

    public final boolean afDebugLog() {
        return (TextUtils.isEmpty(this.AFLoggerLogLevel) || TextUtils.isEmpty(this.afWarnLog) || this.AFLoggerLogLevel.equals("app")) ? false : true;
    }

    @Override // com.appsflyer.internal.AFe1oSDK
    public final boolean afInfoLog() {
        return false;
    }

    @Override // com.appsflyer.internal.AFe1oSDK
    public final AFd1qSDK<Map<String, String>> d(@NonNull String str) {
        return this.afDebugLog.unregisterClient(this.AFLoggerLogLevel, this.afWarnLog, this.afInfoLog, str);
    }

    @Override // com.appsflyer.internal.AFe1oSDK, com.appsflyer.internal.AFe1vSDK
    public final long registerClient() {
        return Ua.C;
    }

    @Override // com.appsflyer.internal.AFe1oSDK, com.appsflyer.internal.AFe1vSDK
    public final boolean d() {
        return false;
    }
}
