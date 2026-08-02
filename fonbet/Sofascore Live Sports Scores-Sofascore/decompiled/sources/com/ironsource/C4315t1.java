package com.ironsource;

import android.os.OutcomeReceiver;
import defpackage.p2g;
import defpackage.rq3;
import defpackage.u2g;
import defpackage.w2g;
import kotlin.Unit;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.t1, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C4315t1 {

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    /* renamed from: com.ironsource.t1$a */
    public static final class a implements OutcomeReceiver {
        final /* synthetic */ rq3<Unit> a;

        /* JADX WARN: Multi-variable type inference failed */
        public a(rq3<? super Unit> rq3Var) {
            this.a = rq3Var;
        }

        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onError(@NotNull Exception exc) {
            exc.getClass();
            rq3<Unit> rq3Var = this.a;
            p2g p2gVar = w2g.b;
            rq3Var.resumeWith(new u2g(exc));
        }

        public void onResult(@Nullable Object obj) {
            rq3<Unit> rq3Var = this.a;
            p2g p2gVar = w2g.b;
            rq3Var.resumeWith(Unit.a);
        }
    }

    @NotNull
    public static final OutcomeReceiver a(@NotNull rq3<? super Unit> rq3Var) {
        rq3Var.getClass();
        return new a(rq3Var);
    }
}
