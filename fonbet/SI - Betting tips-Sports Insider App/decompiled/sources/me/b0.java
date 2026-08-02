package me;

import android.os.CountDownTimer;
import androidx.lifecycle.k1;
import androidx.lifecycle.p0;
import hg.d1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class b0 extends CountDownTimer {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20607a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ k1 f20608b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(long j, c0 c0Var) {
        super(j, 1000L);
        this.f20608b = c0Var;
    }

    @Override // android.os.CountDownTimer
    public final void onFinish() {
        switch (this.f20607a) {
            case 0:
                d1 d1Var = ((c0) this.f20608b).f20640w;
                Boolean bool = Boolean.FALSE;
                d1Var.getClass();
                d1Var.k(null, bool);
                break;
        }
    }

    @Override // android.os.CountDownTimer
    public final void onTick(long j) {
        switch (this.f20607a) {
            case 0:
                c0 c0Var = (c0) this.f20608b;
                d1 d1Var = c0Var.f20641x;
                Long valueOf = Long.valueOf(j / 1000);
                d1Var.getClass();
                d1Var.k(null, valueOf);
                c0Var.f20642y.j(io.sentry.config.a.B(j));
                break;
            default:
                oe.g gVar = (oe.g) this.f20608b;
                p0 p0Var = gVar.f21189h;
                we.a aVar = gVar.f21190i;
                p0Var.h(Boolean.valueOf(aVar != null ? Intrinsics.areEqual(aVar.d(), Boolean.TRUE) : false));
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(oe.g gVar, long j) {
        super(j, 3000L);
        this.f20608b = gVar;
    }

    private final void a() {
    }
}
