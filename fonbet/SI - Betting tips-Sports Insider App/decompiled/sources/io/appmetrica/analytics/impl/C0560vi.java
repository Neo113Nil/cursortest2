package io.appmetrica.analytics.impl;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* renamed from: io.appmetrica.analytics.impl.vi, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0560vi extends C0316ln {

    /* renamed from: d, reason: collision with root package name */
    public final RunnableC0535ui f14799d;

    /* renamed from: e, reason: collision with root package name */
    public final ICommonExecutor f14800e;

    public C0560vi(@NonNull X4 x42, @NonNull Kl kl, @NonNull ICommonExecutor iCommonExecutor) {
        super(x42, kl);
        this.f14799d = new RunnableC0535ui(this);
        this.f14800e = iCommonExecutor;
    }

    @Override // io.appmetrica.analytics.impl.C0316ln
    public final void a() {
        this.f14800e.remove(this.f14799d);
    }

    @Override // io.appmetrica.analytics.impl.C0316ln
    public final void f() {
        this.f14216b.a();
        C0285kh c0285kh = (C0285kh) ((X4) this.f14215a).f13151k.a();
        if (c0285kh.f14131k.a(c0285kh.j)) {
            String str = c0285kh.f14133m;
            if (TextUtils.isEmpty(str) || "-1".equals(str)) {
                return;
            }
            try {
                a(Vd.a((X4) this.f14215a));
            } catch (Throwable unused) {
            }
        }
    }

    @Override // io.appmetrica.analytics.impl.C0316ln
    public final void g() {
        this.f14800e.executeDelayed(this.f14799d, TimeUnit.SECONDS.toMillis(1L));
    }

    public final void h() {
        if (this.f14217c.get()) {
            return;
        }
        this.f14800e.remove(this.f14799d);
        if (((C0285kh) ((X4) this.f14215a).f13151k.a()).f14128g > 0) {
            this.f14800e.executeDelayed(this.f14799d, TimeUnit.SECONDS.toMillis(((C0285kh) ((X4) this.f14215a).f13151k.a()).f14128g));
        }
    }
}
