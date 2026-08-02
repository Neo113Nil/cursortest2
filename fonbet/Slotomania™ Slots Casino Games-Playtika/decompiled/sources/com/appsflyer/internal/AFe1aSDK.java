package com.appsflyer.internal;

import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.net.Uri;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.appsflyer.AFLogger;
import com.appsflyer.attribution.AppsFlyerRequestListener;
import com.appsflyer.internal.components.network.http.exceptions.ParsingException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.UUID;

/* loaded from: classes6.dex */
public final class AFe1aSDK extends AFe1kSDK<Map<String, String>> {
    private final UUID AFKeystoreWrapper;
    public AFa1ySDK component1;
    private String copy;
    private final AFd1lSDK copydefault;
    private String equals;
    private final boolean hashCode;
    private String toString;

    public interface AFa1ySDK {
        void getMediationNetwork(Map<String, String> map);

        void getMonetizationNetwork(String str);
    }

    @Override // com.appsflyer.internal.AFe1kSDK
    protected final boolean a_() {
        return false;
    }

    @Override // com.appsflyer.internal.AFe1kSDK
    protected final AppsFlyerRequestListener component2() {
        return null;
    }

    @Override // com.appsflyer.internal.AFe1kSDK
    protected final boolean copydefault() {
        return false;
    }

    @Override // com.appsflyer.internal.AFe1kSDK, com.appsflyer.internal.AFe1tSDK
    public final boolean getMonetizationNetwork() {
        return false;
    }

    @Override // com.appsflyer.internal.AFe1kSDK, com.appsflyer.internal.AFe1tSDK
    public final long getRevenue() {
        return 3000L;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AFe1aSDK(AFc1fSDK aFc1fSDK, UUID uuid, Uri uri) {
        super(AFe1uSDK.ONELINK, new AFe1uSDK[]{AFe1uSDK.RC_CDN}, aFc1fSDK, uuid.toString());
        boolean z = false;
        this.copydefault = aFc1fSDK.getMediationNetwork();
        this.AFKeystoreWrapper = uuid;
        try {
            if (!AFj1eSDK.getCurrencyIso4217Code(uri.getHost()) && !AFj1eSDK.getCurrencyIso4217Code(uri.getPath())) {
                try {
                    Object[] objArr = {uri, aFc1fSDK.e()};
                    Object obj = AFa1gSDK.e.get(-1818301876);
                    if (obj == null) {
                        obj = ((Class) AFa1gSDK.getMonetizationNetwork((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 35, View.MeasureSpec.getMode(0), (char) ((ViewConfiguration.getEdgeSlop() >> 16) + 47578))).getDeclaredConstructor(Uri.class, AFa1oSDK.class);
                        AFa1gSDK.e.put(-1818301876, obj);
                    }
                    Object newInstance = ((Constructor) obj).newInstance(objArr);
                    try {
                        Object obj2 = AFa1gSDK.e.get(16757637);
                        if (obj2 == null) {
                            obj2 = ((Class) AFa1gSDK.getMonetizationNetwork((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 35, View.MeasureSpec.getSize(0), (char) (47578 - View.getDefaultSize(0, 0)))).getMethod("AFAdRevenueData", null);
                            AFa1gSDK.e.put(16757637, obj2);
                        }
                        Object invoke = ((Method) obj2).invoke(newInstance, null);
                        try {
                            Object obj3 = AFa1gSDK.e.get(-1025312280);
                            if (obj3 == null) {
                                obj3 = ((Class) AFa1gSDK.getMonetizationNetwork('c' - AndroidCharacter.getMirror('0'), 37 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), (char) ((KeyEvent.getMaxKeyCode() >> 16) + 9730))).getMethod("getMonetizationNetwork", null);
                                AFa1gSDK.e.put(-1025312280, obj3);
                            }
                            boolean booleanValue = ((Boolean) ((Method) obj3).invoke(invoke, null)).booleanValue();
                            try {
                                Object obj4 = AFa1gSDK.e.get(-478838153);
                                if (obj4 == null) {
                                    obj4 = ((Class) AFa1gSDK.getMonetizationNetwork(51 - Drawable.resolveOpacity(0, 0), TextUtils.getTrimmedLength("") + 36, (char) ((ViewConfiguration.getMaximumFlingVelocity() >> 16) + 9730))).getMethod("getMediationNetwork", null);
                                    AFa1gSDK.e.put(-478838153, obj4);
                                }
                                z = ((Boolean) ((Method) obj4).invoke(invoke, null)).booleanValue();
                                String[] split = uri.getPath().split("/");
                                if (booleanValue && split.length == 3) {
                                    this.toString = split[1];
                                    this.equals = split[2];
                                    this.copy = uri.toString();
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
            AFLogger.afErrorLogForExcManagerOnly("OneLinkValidator: reflection init failed", e);
        }
        this.hashCode = z;
    }

    public final boolean copy() {
        return (TextUtils.isEmpty(this.toString) || TextUtils.isEmpty(this.equals) || this.toString.equals("app")) ? false : true;
    }

    public final boolean equals() {
        return this.hashCode;
    }

    @Override // com.appsflyer.internal.AFe1kSDK, com.appsflyer.internal.AFe1tSDK
    public final void getCurrencyIso4217Code() {
        super.getCurrencyIso4217Code();
        AFa1ySDK aFa1ySDK = this.component1;
        if (aFa1ySDK != null) {
            if (this.getMediationNetwork == AFe1rSDK.SUCCESS && ((AFe1kSDK) this).component2 != null) {
                aFa1ySDK.getMediationNetwork((Map) ((AFe1kSDK) this).component2.getBody());
                return;
            }
            Throwable component3 = component3();
            if (component3 instanceof ParsingException) {
                if (((ParsingException) component3).getRawResponse().isSuccessful()) {
                    aFa1ySDK.getMonetizationNetwork("Can't parse one link data");
                    return;
                } else {
                    String str = this.copy;
                    aFa1ySDK.getMonetizationNetwork(str != null ? str : "Can't get OneLink data");
                    return;
                }
            }
            String str2 = this.copy;
            aFa1ySDK.getMonetizationNetwork(str2 != null ? str2 : "Can't get OneLink data");
        }
    }

    @Override // com.appsflyer.internal.AFe1kSDK
    protected final AFd1mSDK<Map<String, String>> getMediationNetwork(String str) {
        return this.copydefault.getCurrencyIso4217Code(this.toString, this.equals, this.AFKeystoreWrapper, str);
    }
}
