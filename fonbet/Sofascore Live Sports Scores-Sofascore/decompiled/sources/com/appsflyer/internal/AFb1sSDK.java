package com.appsflyer.internal;

import android.graphics.Color;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.Map;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\t\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\r\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0016\u0010\u0010\u001a\u0004\u0018\u00010\u00048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f"}, d2 = {"Lcom/appsflyer/internal/AFb1sSDK;", "", "Lcom/appsflyer/internal/AFh1zSDK;", "event", "", "rawData", "<init>", "(Lcom/appsflyer/internal/AFh1zSDK;[B)V", "", "afInfoLog", "()V", "registerClient", "Lcom/appsflyer/internal/AFh1zSDK;", "d", "AFLogger", "[B", "AFKeystoreWrapper"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class AFb1sSDK {

    /* renamed from: AFLogger, reason: from kotlin metadata */
    @Nullable
    private final byte[] AFKeystoreWrapper;

    /* renamed from: registerClient, reason: from kotlin metadata */
    @NotNull
    private final AFh1zSDK d;

    public AFb1sSDK(@NotNull AFh1zSDK aFh1zSDK, @Nullable byte[] bArr) {
        aFh1zSDK.getClass();
        this.d = aFh1zSDK;
        this.AFKeystoreWrapper = bArr;
    }

    public final void afInfoLog() {
        try {
            Map map = AFb1ySDK.getInstance;
            Object obj = map.get(1805662040);
            if (obj == null) {
                obj = ((Class) AFb1ySDK.AFLogger((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 36, (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 89, (char) (20964 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))))).getDeclaredConstructor(null);
                map.put(1805662040, obj);
            }
            Object newInstance = ((Constructor) obj).newInstance(null);
            Object[] objArr = {this.d, this.AFKeystoreWrapper};
            Object obj2 = map.get(-1507342521);
            if (obj2 == null) {
                obj2 = ((Class) AFb1ySDK.AFLogger(Color.rgb(0, 0, 0) + 16777253, 89 - ((Process.getThreadPriority(0) + 20) >> 6), (char) (20963 - TextUtils.getCapsMode("", 0, 0)))).getMethod("d", AFh1zSDK.class, byte[].class);
                map.put(-1507342521, obj2);
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
