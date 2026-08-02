package s00;

import Bl0.C2652m;
import S0.C3969l;
import S0.InterfaceC3967k;
import S0.J0;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.android.ds.compose.component.cell.DsCellAtomKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;
import t00.AbstractC9720b;
import u00.m;

/* renamed from: s00.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C9577b {

    /* renamed from: s00.b$a */
    static final class a extends AbstractC7737t implements Function1<AtomAction, Unit> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ m f98093b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ AbstractC9720b.C2174b f98094c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(m mVar, AbstractC9720b.C2174b c2174b) {
            super(1);
            this.f98093b = mVar;
            this.f98094c = c2174b;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(AtomAction atomAction) {
            AtomAction it = atomAction;
            Intrinsics.checkNotNullParameter(it, "it");
            this.f98093b.g0(this.f98094c);
            return Unit.f71690a;
        }
    }

    /* renamed from: s00.b$b, reason: collision with other inner class name */
    static final class C2160b extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ AbstractC9720b.C2174b f98095b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ m f98096c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C2160b(AbstractC9720b.C2174b c2174b, m mVar, int i11) {
            super(2);
            this.f98095b = c2174b;
            this.f98096c = mVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
            num.intValue();
            int e11 = C2652m.e(1);
            C9577b.a(this.f98095b, this.f98096c, interfaceC3967k, e11);
            return Unit.f71690a;
        }
    }

    public static final void a(@NotNull AbstractC9720b.C2174b item, @NotNull m viewModel, InterfaceC3967k interfaceC3967k, int i11) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        C3969l u11 = interfaceC3967k.u(118171366);
        if ((((u11.F(item) ? 4 : 2) | i11 | (u11.F(viewModel) ? 32 : 16)) & 19) == 18 && u11.b()) {
            u11.j();
        } else {
            CellDTO b11 = item.b();
            u11.o(-661440095);
            boolean F11 = u11.F(viewModel) | u11.F(item);
            Object C11 = u11.C();
            if (F11 || C11 == InterfaceC3967k.a.a()) {
                C11 = new a(viewModel, item);
                u11.x(C11);
            }
            u11.k();
            DsCellAtomKt.DsCellAtom(b11, null, (Function1) C11, u11, CellDTO.$stable, 2);
        }
        J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new C2160b(item, viewModel, i11));
        }
    }
}
