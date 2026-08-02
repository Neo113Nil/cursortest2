package ru.ozon.android.messenger.framework.data.local;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;
import qj.C9067a;
import ru.ozon.android.messenger.framework.data.repository.Y;

/* loaded from: classes10.dex */
public final class q implements Jb.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f87623a;

    /* renamed from: b, reason: collision with root package name */
    private final Jb.e f87624b;

    public /* synthetic */ q(Object obj, Jb.e eVar, int i11) {
        this.f87623a = i11;
        this.f87624b = eVar;
    }

    @Override // Pc.a
    public final Object get() {
        C9067a c9067a;
        Object obj;
        C9067a c9067a2;
        switch (this.f87623a) {
            case 0:
                return new p((Context) ((Jb.f) this.f87624b).get());
            case 1:
                Context context = (Context) ((Jb.f) this.f87624b).get();
                Intrinsics.checkNotNullParameter(context, "context");
                Intrinsics.checkNotNullParameter(context, "context");
                c9067a = C9067a.f82186h;
                if (c9067a != null) {
                    return c9067a;
                }
                obj = C9067a.f82185g;
                synchronized (obj) {
                    c9067a2 = C9067a.f82186h;
                    if (c9067a2 == null) {
                        c9067a2 = new C9067a(context);
                        C9067a.f82186h = c9067a2;
                    }
                }
                return c9067a2;
            default:
                Y impl = (Y) ((ru.ozon.android.messenger.blocks.alert.b) this.f87624b).get();
                Intrinsics.checkNotNullParameter(impl, "impl");
                return impl;
        }
    }

    public q(Jb.f fVar) {
        this.f87623a = 0;
        this.f87624b = fVar;
    }
}
