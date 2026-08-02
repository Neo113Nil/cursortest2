package d2;

import B1.V;
import B1.W;
import B1.Y;
import B1.m0;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import org.jetbrains.annotations.NotNull;

/* renamed from: d2.t, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C6062t implements V {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ C6034K f61074a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Z1.s f61075b;

    /* renamed from: d2.t$a */
    static final class a extends AbstractC7737t implements Function1<m0.a, Unit> {

        /* renamed from: b, reason: collision with root package name */
        public static final a f61076b = new a(1);

        @Override // kotlin.jvm.functions.Function1
        public final /* bridge */ /* synthetic */ Unit invoke(m0.a aVar) {
            return Unit.f71690a;
        }
    }

    C6062t(C6034K c6034k, Z1.s sVar) {
        this.f61074a = c6034k;
        this.f61075b = sVar;
    }

    @Override // B1.V
    @NotNull
    /* renamed from: measure-3p2s80s */
    public final W mo2measure3p2s80s(@NotNull Y y11, @NotNull List<? extends B1.U> list, long j11) {
        W z02;
        this.f61074a.i(this.f61075b);
        z02 = y11.z0(0, 0, kotlin.collections.U.c(), a.f61076b);
        return z02;
    }
}
