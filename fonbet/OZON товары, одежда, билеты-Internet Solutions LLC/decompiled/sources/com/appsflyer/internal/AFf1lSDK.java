package com.appsflyer.internal;

import android.net.Uri;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.annotation.NonNull;
import com.appsflyer.AFLogger;
import com.appsflyer.attribution.AppsFlyerRequestListener;
import com.appsflyer.internal.components.network.http.ResponseNetwork;
import com.appsflyer.internal.components.network.http.exceptions.ParsingException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.UUID;

/* loaded from: classes8.dex */
public final class AFf1lSDK extends AFf1rSDK<Map<String, String>> {
    private final UUID afErrorLog;
    private String afInfoLog;

    /* renamed from: e, reason: collision with root package name */
    public AFa1vSDK f57423e;
    private final AFe1wSDK force;

    /* renamed from: i, reason: collision with root package name */
    private final boolean f57424i;

    /* renamed from: v, reason: collision with root package name */
    private String f57425v;

    /* renamed from: w, reason: collision with root package name */
    private String f57426w;

    public interface AFa1vSDK {
        void values(String str);

        void values(Map<String, String> map);
    }

    public AFf1lSDK(@NonNull AFd1mSDK aFd1mSDK, @NonNull UUID uuid, @NonNull Uri uri) {
        super(AFf1zSDK.ONELINK, new AFf1zSDK[]{AFf1zSDK.RC_CDN}, aFd1mSDK, uuid.toString());
        this.force = aFd1mSDK.AFKeystoreWrapper();
        this.afErrorLog = uuid;
        boolean z11 = false;
        try {
            if (!AFc1rSDK.AFInAppEventType(uri.getHost()) && !AFc1rSDK.AFInAppEventType(uri.getPath())) {
                try {
                    Object[] objArr = {uri, aFd1mSDK.afWarnLog()};
                    Map<Integer, Object> map = AFc1iSDK.afErrorLog;
                    Object obj = map.get(-33252961);
                    if (obj == null) {
                        obj = ((Class) AFc1iSDK.AFInAppEventParameterName(View.getDefaultSize(0, 0) + 36, (char) (1 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))), ViewConfiguration.getJumpTapTimeout() >> 16)).getDeclaredConstructor(Uri.class, AFc1uSDK.class);
                        map.put(-33252961, obj);
                    }
                    Object newInstance = ((Constructor) obj).newInstance(objArr);
                    try {
                        Object obj2 = map.get(-1814091915);
                        if (obj2 == null) {
                            obj2 = ((Class) AFc1iSDK.AFInAppEventParameterName((ViewConfiguration.getLongPressTimeout() >> 16) + 36, (char) ((-1) - TextUtils.indexOf((CharSequence) "", '0', 0)), ViewConfiguration.getKeyRepeatTimeout() >> 16)).getMethod("AFInAppEventType", null);
                            map.put(-1814091915, obj2);
                        }
                        Object invoke = ((Method) obj2).invoke(newInstance, null);
                        try {
                            Object obj3 = map.get(-1435527598);
                            if (obj3 == null) {
                                obj3 = ((Class) AFc1iSDK.AFInAppEventParameterName(51 - (KeyEvent.getMaxKeyCode() >> 16), (char) (18308 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1))), (ViewConfiguration.getJumpTapTimeout() >> 16) + 36)).getMethod("AFInAppEventParameterName", null);
                                map.put(-1435527598, obj3);
                            }
                            boolean booleanValue = ((Boolean) ((Method) obj3).invoke(invoke, null)).booleanValue();
                            try {
                                Object obj4 = map.get(2045606441);
                                if (obj4 == null) {
                                    obj4 = ((Class) AFc1iSDK.AFInAppEventParameterName(51 - TextUtils.getOffsetBefore("", 0), (char) (18307 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))), AndroidCharacter.getMirror('0') - '\f')).getMethod("valueOf", null);
                                    map.put(2045606441, obj4);
                                }
                                z11 = ((Boolean) ((Method) obj4).invoke(invoke, null)).booleanValue();
                                String[] split = uri.getPath().split("/");
                                if (booleanValue && split.length == 3) {
                                    this.f57426w = split[1];
                                    this.afInfoLog = split[2];
                                    this.f57425v = uri.toString();
                                }
                            } catch (Throwable th2) {
                                Throwable cause = th2.getCause();
                                if (cause == null) {
                                    throw th2;
                                }
                                throw cause;
                            }
                        } catch (Throwable th3) {
                            Throwable cause2 = th3.getCause();
                            if (cause2 == null) {
                                throw th3;
                            }
                            throw cause2;
                        }
                    } catch (Throwable th4) {
                        Throwable cause3 = th4.getCause();
                        if (cause3 == null) {
                            throw th4;
                        }
                        throw cause3;
                    }
                } catch (Throwable th5) {
                    Throwable cause4 = th5.getCause();
                    if (cause4 == null) {
                        throw th5;
                    }
                    throw cause4;
                }
            }
        } catch (Exception e11) {
            AFLogger.afErrorLogForExcManagerOnly("OneLinkValidator: reflection init failed", e11);
        }
        this.f57424i = z11;
    }

    @Override // com.appsflyer.internal.AFf1rSDK, com.appsflyer.internal.AFe1eSDK
    public final boolean AFInAppEventParameterName() {
        return false;
    }

    @Override // com.appsflyer.internal.AFf1rSDK, com.appsflyer.internal.AFe1eSDK
    public final long AFInAppEventType() {
        return 3000L;
    }

    @Override // com.appsflyer.internal.AFf1rSDK, com.appsflyer.internal.AFe1eSDK
    public final void AFKeystoreWrapper() {
        ResponseNetwork responseNetwork;
        super.AFKeystoreWrapper();
        AFa1vSDK aFa1vSDK = this.f57423e;
        if (aFa1vSDK != null) {
            if (this.AFInAppEventType == AFe1dSDK.SUCCESS && (responseNetwork = this.AFLogger) != null) {
                aFa1vSDK.values((Map<String, String>) responseNetwork.getBody());
                return;
            }
            Throwable e11 = e();
            if (!(e11 instanceof ParsingException)) {
                String str = this.f57425v;
                aFa1vSDK.values(str != null ? str : "Can't get OneLink data");
            } else if (((ParsingException) e11).getRawResponse().isSuccessful()) {
                aFa1vSDK.values("Can't parse one link data");
            } else {
                String str2 = this.f57425v;
                aFa1vSDK.values(str2 != null ? str2 : "Can't get OneLink data");
            }
        }
    }

    public final boolean i() {
        return this.f57424i;
    }

    @Override // com.appsflyer.internal.AFf1rSDK
    protected final AppsFlyerRequestListener registerClient() {
        return null;
    }

    @Override // com.appsflyer.internal.AFf1rSDK
    protected final boolean unregisterClient() {
        return false;
    }

    @Override // com.appsflyer.internal.AFf1rSDK
    protected final boolean v() {
        return false;
    }

    @Override // com.appsflyer.internal.AFf1rSDK
    protected final AFe1uSDK<Map<String, String>> valueOf(@NonNull String str) {
        return this.force.values(this.f57426w, this.afInfoLog, this.afErrorLog, str);
    }

    public final boolean w() {
        return (TextUtils.isEmpty(this.f57426w) || TextUtils.isEmpty(this.afInfoLog) || this.f57426w.equals("app")) ? false : true;
    }
}
