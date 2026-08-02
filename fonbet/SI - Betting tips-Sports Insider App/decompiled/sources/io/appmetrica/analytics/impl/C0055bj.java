package io.appmetrica.analytics.impl;

import android.app.Activity;
import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.model.ScreenInfo;
import io.appmetrica.analytics.coreutils.internal.AndroidUtils;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* renamed from: io.appmetrica.analytics.impl.bj, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0055bj implements InterfaceC0292l {

    /* renamed from: a, reason: collision with root package name */
    public Ve f13454a;

    /* renamed from: b, reason: collision with root package name */
    public ScreenInfo f13455b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f13456c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f13457d;

    /* renamed from: e, reason: collision with root package name */
    public final C0029aj f13458e = new C0029aj();

    /* renamed from: f, reason: collision with root package name */
    public WeakReference f13459f = new WeakReference(null);

    public final synchronized void a(@NotNull Activity activity) {
        this.f13459f = new WeakReference(activity);
        if (!this.f13457d) {
            this.f13455b = a((Context) activity).p();
            this.f13456c = a((Context) activity).t();
            this.f13457d = true;
        }
        if (this.f13455b == null) {
            c(activity);
        }
    }

    @Nullable
    public final synchronized ScreenInfo b(@NotNull Context context) {
        try {
            if (!this.f13457d) {
                this.f13455b = a(context).p();
                this.f13456c = a(context).t();
                this.f13457d = true;
            }
            c((Context) this.f13459f.get());
            if (this.f13455b == null) {
                if (!AndroidUtils.isApiAchieved(30)) {
                    c(context);
                } else if (!this.f13456c) {
                    c(context);
                    this.f13456c = true;
                    a(context).v();
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f13455b;
    }

    public final void c(Context context) {
        if (context != null) {
            this.f13458e.getClass();
            ScreenInfo a7 = C0029aj.a(context);
            if (a7 == null || Intrinsics.areEqual(a7, this.f13455b)) {
                return;
            }
            this.f13455b = a7;
            a(context).a(this.f13455b);
        }
    }

    public final Ve a(Context context) {
        if (this.f13454a == null) {
            this.f13454a = new Ve(C0040b4.l().c(context).a(context));
        }
        Ve ve2 = this.f13454a;
        Intrinsics.checkNotNull(ve2);
        return ve2;
    }

    public final void a(@NotNull Ve ve2) {
        this.f13454a = ve2;
    }
}
