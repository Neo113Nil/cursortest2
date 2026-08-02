package com.appsflyer.internal;

import android.graphics.Color;
import android.media.AudioTrack;
import android.text.TextUtils;
import android.view.View;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\t\u001a\u00020\u0005¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0003\u0010\u0004R\u0014\u0010\b\u001a\u00020\u00058\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/appsflyer/internal/AFb1sSDK;", "", "", "afInfoLog", "()V", "Lcom/appsflyer/internal/AFa1pSDK;", "values", "Lcom/appsflyer/internal/AFa1pSDK;", "AFKeystoreWrapper", "p0", "<init>", "(Lcom/appsflyer/internal/AFa1pSDK;)V"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class AFb1sSDK {

    /* renamed from: values, reason: from kotlin metadata */
    @NotNull
    private final AFa1pSDK AFKeystoreWrapper;

    public AFb1sSDK(@NotNull AFa1pSDK aFa1pSDK) {
        Intrinsics.checkNotNullParameter(aFa1pSDK, "");
        this.AFKeystoreWrapper = aFa1pSDK;
    }

    public final void afInfoLog() {
        try {
            Map<Integer, Object> map = AFc1iSDK.afErrorLog;
            Object obj = map.get(-250535178);
            if (obj == null) {
                obj = ((Class) AFc1iSDK.AFInAppEventParameterName(37 - TextUtils.getOffsetBefore("", 0), (char) (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), 87 - TextUtils.indexOf("", "", 0, 0))).getDeclaredConstructor(null);
                map.put(-250535178, obj);
            }
            Object newInstance = ((Constructor) obj).newInstance(null);
            try {
                Object[] objArr = {this.AFKeystoreWrapper};
                Object obj2 = map.get(557114797);
                if (obj2 == null) {
                    obj2 = ((Class) AFc1iSDK.AFInAppEventParameterName(37 - View.resolveSize(0, 0), (char) ((-1) - TextUtils.lastIndexOf("", '0')), Color.rgb(0, 0, 0) + 16777303)).getMethod("valueOf", AFa1pSDK.class);
                    map.put(557114797, obj2);
                }
                ((Method) obj2).invoke(newInstance, objArr);
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
    }
}
