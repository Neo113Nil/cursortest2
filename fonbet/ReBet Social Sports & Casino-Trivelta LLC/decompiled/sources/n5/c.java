package n5;

import Bh.s;
import Dh.g;
import java.time.Duration;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.DurationKt;
import kotlin.time.DurationUnit;
import o5.C5815b;

/* loaded from: classes2.dex */
public final class c implements InterfaceC5670a {

    /* renamed from: a, reason: collision with root package name */
    public final C5815b f57010a;

    /* renamed from: b, reason: collision with root package name */
    public final Dh.a f57011b;

    /* renamed from: c, reason: collision with root package name */
    public s f57012c;

    public c(M5.a sessionManager, long j10, C5815b spanExporter) {
        Duration ofSeconds;
        Intrinsics.checkNotNullParameter(sessionManager, "sessionManager");
        Intrinsics.checkNotNullParameter(spanExporter, "spanExporter");
        this.f57010a = spanExporter;
        g J10 = Dh.a.J(a());
        ofSeconds = Duration.ofSeconds(kotlin.time.Duration.m1489getInWholeSecondsimpl(DurationKt.toDuration(j10, DurationUnit.MILLISECONDS)), kotlin.time.Duration.m1491getNanosecondsComponentimpl(r4));
        Intrinsics.checkNotNullExpressionValue(ofSeconds, "toComponents-impl(...)");
        Dh.a a10 = J10.c(ofSeconds).a();
        this.f57011b = a10;
        s b10 = s.r().a(a10).b();
        Intrinsics.checkNotNullExpressionValue(b10, "build(...)");
        this.f57012c = b10;
    }

    @Override // n5.InterfaceC5670a
    public C5815b a() {
        return this.f57010a;
    }

    @Override // n5.InterfaceC5670a
    public s b() {
        return this.f57012c;
    }

    @Override // n5.InterfaceC5670a
    public void shutdown() {
        a().shutdown();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ c(M5.a aVar, long j10, C5815b c5815b, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(r1, j10, c5815b);
        M5.a aVar2;
        j10 = (i10 & 2) != 0 ? 2000L : j10;
        if ((i10 & 4) != 0) {
            aVar2 = aVar;
            c5815b = new C5815b(aVar2, null, null, null, 14, null);
        } else {
            aVar2 = aVar;
        }
    }
}
