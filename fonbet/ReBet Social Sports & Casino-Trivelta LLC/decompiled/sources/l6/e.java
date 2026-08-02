package l6;

import android.util.Log;
import java.lang.reflect.Method;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public static final e f55641a = new e();

    /* renamed from: b, reason: collision with root package name */
    public static final String f55642b = e.class.getCanonicalName();

    /* renamed from: c, reason: collision with root package name */
    public static Class f55643c;

    public static final void a() {
        d("UnityFacebookSDKPlugin", "CaptureViewHierarchy", "");
    }

    public static final void c(String str) {
        d("UnityFacebookSDKPlugin", "OnReceiveMapping", str);
    }

    public static final void d(String str, String str2, String str3) {
        try {
            if (f55643c == null) {
                f55643c = f55641a.b();
            }
            Class cls = f55643c;
            if (cls == null) {
                Intrinsics.throwUninitializedPropertyAccessException("unityPlayer");
                throw null;
            }
            Method method = cls.getMethod("UnitySendMessage", String.class, String.class, String.class);
            Class cls2 = f55643c;
            if (cls2 != null) {
                method.invoke(cls2, str, str2, str3);
            } else {
                Intrinsics.throwUninitializedPropertyAccessException("unityPlayer");
                throw null;
            }
        } catch (Exception e10) {
            Log.e(f55642b, "Failed to send message to Unity", e10);
        }
    }

    public final Class b() {
        Class<?> cls = Class.forName("com.unity3d.player.UnityPlayer");
        Intrinsics.checkNotNullExpressionValue(cls, "forName(UNITY_PLAYER_CLASS)");
        return cls;
    }
}
