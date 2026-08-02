package com.appsflyer.internal;

import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u000b\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n"}, d2 = {"Lcom/appsflyer/internal/AFb1sSDK;", "", "Lcom/appsflyer/internal/AFa1mSDK;", "values", "<init>", "(Lcom/appsflyer/internal/AFa1mSDK;)V", "", "afInfoLog", "()V", "getRevenue", "Lcom/appsflyer/internal/AFa1mSDK;", "getMediationNetwork"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AFb1sSDK {

    /* renamed from: getRevenue, reason: from kotlin metadata */
    private final AFa1mSDK getMediationNetwork;

    public AFb1sSDK(AFa1mSDK aFa1mSDK) {
        Intrinsics.checkNotNullParameter(aFa1mSDK, "");
        this.getMediationNetwork = aFa1mSDK;
    }

    public final void afInfoLog() {
        try {
            Object obj = AFa1vSDK.AFLogger.get(-466359253);
            if (obj == null) {
                obj = ((Class) AFa1vSDK.AFAdRevenueData((char) TextUtils.indexOf("", "", 0), (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 321, Drawable.resolveOpacity(0, 0) + 35)).getDeclaredConstructor(null);
                AFa1vSDK.AFLogger.put(-466359253, obj);
            }
            Object newInstance = ((Constructor) obj).newInstance(null);
            Object[] objArr = {this.getMediationNetwork};
            Object obj2 = AFa1vSDK.AFLogger.get(-1674440049);
            if (obj2 == null) {
                obj2 = ((Class) AFa1vSDK.AFAdRevenueData((char) (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), 321 - ((byte) KeyEvent.getModifierMetaStateMask()), (ViewConfiguration.getPressedStateDuration() >> 16) + 35)).getMethod("AFAdRevenueData", AFa1mSDK.class);
                AFa1vSDK.AFLogger.put(-1674440049, obj2);
            }
            ((Method) obj2).invoke(newInstance, objArr);
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }
}
