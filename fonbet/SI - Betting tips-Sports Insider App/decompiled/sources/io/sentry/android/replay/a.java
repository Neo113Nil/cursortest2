package io.sentry.android.replay;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.text.Regex;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class a extends Lambda implements Function0 {

    /* renamed from: f, reason: collision with root package name */
    public static final a f15938f;

    /* renamed from: g, reason: collision with root package name */
    public static final a f15939g;

    /* renamed from: h, reason: collision with root package name */
    public static final a f15940h;

    /* renamed from: i, reason: collision with root package name */
    public static final a f15941i;
    public static final a j;

    /* renamed from: k, reason: collision with root package name */
    public static final a f15942k;

    /* renamed from: l, reason: collision with root package name */
    public static final a f15943l;

    /* renamed from: m, reason: collision with root package name */
    public static final a f15944m;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f15945e;

    static {
        int i5 = 0;
        f15938f = new a(i5, 0);
        f15939g = new a(i5, 1);
        f15940h = new a(i5, 2);
        f15941i = new a(i5, 3);
        j = new a(i5, 4);
        f15942k = new a(i5, 5);
        f15943l = new a(i5, 6);
        f15944m = new a(i5, 7);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(int i5, int i10) {
        super(i5);
        this.f15945e = i10;
    }

    /* JADX WARN: Type inference failed for: r0v11, types: [gf.i, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v15, types: [gf.i, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v6, types: [gf.i, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Method method;
        switch (this.f15945e) {
            case 0:
                return new Regex("_[a-z]");
            case 1:
                return new io.sentry.util.i();
            case 2:
                s sVar = new s();
                new Handler(Looper.getMainLooper()).postAtFrontOfQueue(new io.sentry.android.core.f(7, sVar));
                return sVar;
            case 3:
                Class cls = (Class) y.f16170a.getValue();
                if (cls == null) {
                    return null;
                }
                Field declaredField = cls.getDeclaredField("mViews");
                declaredField.setAccessible(true);
                return declaredField;
            case 4:
                try {
                    return Class.forName("android.view.WindowManagerGlobal");
                } catch (Throwable th2) {
                    Log.w("WindowManagerSpy", th2);
                    return null;
                }
            case 5:
                Class cls2 = (Class) y.f16170a.getValue();
                if (cls2 == null || (method = cls2.getMethod("getInstance", null)) == null) {
                    return null;
                }
                return method.invoke(null, null);
            case 6:
                try {
                    return Class.forName("com.android.internal.policy.DecorView");
                } catch (Throwable th3) {
                    Log.d("WindowSpy", "Unexpected exception loading DecorView on API " + Build.VERSION.SDK_INT, th3);
                    return null;
                }
            default:
                Class cls3 = (Class) d0.f16023a.getValue();
                if (cls3 == null) {
                    return null;
                }
                try {
                    Field declaredField2 = cls3.getDeclaredField("mWindow");
                    declaredField2.setAccessible(true);
                    return declaredField2;
                } catch (NoSuchFieldException e7) {
                    Log.d("WindowSpy", "Unexpected exception retrieving " + cls3 + "#mWindow on API " + Build.VERSION.SDK_INT, e7);
                    return null;
                }
        }
    }
}
