package io.appmetrica.analytics.impl;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.IBinder;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class L1 {

    /* renamed from: d, reason: collision with root package name */
    public static A1 f12497d;

    /* renamed from: a, reason: collision with root package name */
    public final Context f12498a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC0643z1 f12499b;

    /* renamed from: c, reason: collision with root package name */
    public BinderC0618y1 f12500c;

    public L1(@NotNull Context context, @NotNull InterfaceC0643z1 interfaceC0643z1) {
        this.f12498a = context;
        this.f12499b = interfaceC0643z1;
    }

    public final void b() {
        C0353na.a(this.f12498a);
        PublicLogger.INSTANCE.init(this.f12498a);
        Context context = this.f12498a;
        InterfaceC0643z1 interfaceC0643z1 = this.f12499b;
        if (f12497d == null) {
            B1 b12 = new B1(context, interfaceC0643z1, new C0093d5(context));
            C0133ek c0133ek = C0353na.I.f14340v;
            E1 e12 = new E1(b12);
            LinkedHashMap linkedHashMap = c0133ek.f13704a;
            Object obj = linkedHashMap.get(1);
            if (obj == null) {
                obj = new ArrayList();
                linkedHashMap.put(1, obj);
            }
            ((List) obj).add(e12);
            f12497d = b12;
        }
        A1 a12 = f12497d;
        if (a12 != null) {
            this.f12500c = new BinderC0618y1(a12);
            C0353na c0353na = C0353na.I;
            c0353na.f14326f = new C0337mj(c0353na.f14321a, new C0362nj(a12));
            ((B1) a12).onCreate();
        }
    }

    public final boolean c(@NotNull Intent intent) {
        A1 a12 = f12497d;
        if (a12 != null) {
            ((B1) a12).b(intent);
        }
        String action = intent.getAction();
        return (action == null || !kotlin.text.z.o(action, "io.appmetrica.analytics.ACTION_SERVICE_WAKELOCK", false)) && intent.getData() == null;
    }

    public final void d() {
        f12497d = null;
    }

    public final void a(@NotNull Intent intent, int i5) {
        A1 a12 = f12497d;
        if (a12 != null) {
            ((C0517u0) ((B1) a12).f12022c).f14692a.stopSelf(i5);
        }
    }

    public final void c() {
        A1 a12 = f12497d;
        if (a12 != null) {
            ((B1) a12).onDestroy();
        }
    }

    public final int a(@NotNull Intent intent, int i5, int i10) {
        A1 a12 = f12497d;
        if (a12 == null) {
            return 2;
        }
        ((C0517u0) ((B1) a12).f12022c).f14692a.stopSelf(i10);
        return 2;
    }

    @NotNull
    public final IBinder a(@NotNull Intent intent) {
        A1 a12 = f12497d;
        if (a12 != null) {
            ((B1) a12).a(intent);
        }
        String action = intent.getAction();
        if (action != null && kotlin.text.z.o(action, "io.appmetrica.analytics.ACTION_SERVICE_WAKELOCK", false)) {
            return new Co();
        }
        BinderC0618y1 binderC0618y1 = this.f12500c;
        if (binderC0618y1 != null) {
            return binderC0618y1;
        }
        Intrinsics.throwUninitializedPropertyAccessException("coreBinder");
        return null;
    }

    public final void a(@NotNull Configuration configuration) {
        if (f12497d != null) {
            C0353na.I.v().a(configuration);
        }
    }

    public final void b(@NotNull Intent intent) {
        A1 a12 = f12497d;
        if (a12 != null) {
            ((B1) a12).c(intent);
        }
    }
}
