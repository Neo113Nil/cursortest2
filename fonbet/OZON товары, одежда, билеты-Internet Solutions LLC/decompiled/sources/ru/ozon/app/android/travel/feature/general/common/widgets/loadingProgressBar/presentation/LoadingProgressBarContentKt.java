package ru.ozon.app.android.travel.feature.general.common.widgets.loadingProgressBar.presentation;

import A0.h;
import D1.InterfaceC2801g;
import Ep.a;
import Fr.g;
import J0.I1;
import K00.b;
import S0.A0;
import S0.C3969l;
import S0.F1;
import S0.InterfaceC3967k;
import S0.J0;
import S0.Q;
import WZ.l;
import androidx.compose.foundation.layout.C5179b;
import androidx.compose.foundation.layout.C5193p;
import androidx.compose.foundation.layout.C5194q;
import androidx.compose.foundation.layout.T;
import androidx.compose.foundation.layout.a0;
import androidx.compose.ui.c;
import androidx.compose.ui.e;
import androidx.lifecycle.AbstractC5434v;
import b00.f;
import e1.InterfaceC6250b;
import e3.i;
import i1.C6988h;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l1.y0;
import m0.C7980b;
import m0.C7984d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.general.common.widgets.loadingProgressBar.presentation.LoadingProgressBarVI;
import ru.ozon.uni.android.ds.compose.component.text.DsTextAtomKt;
import ru.ozon.uni.android.ds.compose.util.DsSpacings;
import ru.ozon.uni.atoms.data.common.CornerRadius;
import ru.ozon.uni.atoms.data.text.TextDTO;
import ru.ozon.uni.core.repository.UniTheme;
import u0.E;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a\u001f\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/loadingProgressBar/presentation/LoadingProgressBarVI;", "state", "Lru/ozon/app/android/travel/feature/general/common/widgets/loadingProgressBar/presentation/LoadingProgressBarViewModel;", "viewModel", "", "LoadingProgressBarContent", "(Lru/ozon/app/android/travel/feature/general/common/widgets/loadingProgressBar/presentation/LoadingProgressBarVI;Lru/ozon/app/android/travel/feature/general/common/widgets/loadingProgressBar/presentation/LoadingProgressBarViewModel;LS0/k;I)V", "common_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class LoadingProgressBarContentKt {
    public static final void LoadingProgressBarContent(@NotNull LoadingProgressBarVI state, @NotNull LoadingProgressBarViewModel viewModel, InterfaceC3967k interfaceC3967k, int i11) {
        int i12;
        Object obj;
        e b11;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        C3969l u11 = interfaceC3967k.u(-1086628994);
        if ((i11 & 6) == 0) {
            i12 = (u11.F(state) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= u11.F(viewModel) ? 32 : 16;
        }
        if ((i12 & 19) == 18 && u11.b()) {
            u11.j();
        } else {
            l lVar = (l) u11.m(f.e());
            AbstractC5434v.a aVar = AbstractC5434v.a.ON_RESUME;
            u11.o(1288292946);
            boolean F11 = u11.F(state) | u11.F(lVar);
            Object C11 = u11.C();
            if (F11 || C11 == InterfaceC3967k.a.a()) {
                C11 = new LoadingProgressBarContentKt$LoadingProgressBarContent$1$1(state, lVar);
                u11.x(C11);
            }
            u11.k();
            i.a(aVar, null, (Function0) C11, u11, 6);
            u11.o(1288296896);
            Object C12 = u11.C();
            if (C12 == InterfaceC3967k.a.a()) {
                C12 = C7984d.a(viewModel.calculateProgress());
                u11.x(C12);
            }
            C7980b c7980b = (C7980b) C12;
            u11.k();
            u11.o(1288300071);
            boolean F12 = u11.F(viewModel) | u11.F(state) | u11.F(c7980b);
            Object C13 = u11.C();
            if (F12 || C13 == InterfaceC3967k.a.a()) {
                C13 = new LoadingProgressBarContentKt$LoadingProgressBarContent$2$1(viewModel, state, c7980b, null);
                u11.x(C13);
            }
            u11.k();
            Q.e(u11, state, (Function2) C13);
            Iterator<T> it = state.getLoaderStates().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                } else {
                    obj = it.next();
                    if (((Number) c7980b.k()).floatValue() >= ((LoadingProgressBarVI.LoaderState) obj).getPercent()) {
                        break;
                    }
                }
            }
            LoadingProgressBarVI.LoaderState loaderState = (LoadingProgressBarVI.LoaderState) obj;
            if (loaderState == null) {
                loaderState = (LoadingProgressBarVI.LoaderState) C7714v.Z(state.getLoaderStates());
            }
            e.a aVar2 = e.f40358c0;
            e e11 = a0.e(aVar2, 1.0f);
            UniTheme uniTheme = UniTheme.INSTANCE;
            int i13 = UniTheme.$stable;
            b11 = androidx.compose.foundation.e.b(e11, uniTheme.getColors(u11, i13).getLayerFloor0(), y0.a());
            C5194q a11 = C5193p.a(C5179b.g(), InterfaceC6250b.a.k(), u11, 0);
            int I11 = u11.I();
            A0 d11 = u11.d();
            e f7 = c.f(u11, b11);
            Function0 a12 = g.a(InterfaceC2801g.f5440U, u11);
            if (u11.t()) {
                u11.H(a12);
            } else {
                u11.e();
            }
            Function2 g10 = b.g(u11, a11, u11, d11);
            if (u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I11))) {
                a.d(I11, u11, I11, g10);
            }
            F1.b(u11, f7, InterfaceC2801g.a.f());
            TextDTO title = loaderState != null ? loaderState.getTitle() : null;
            u11.o(5491102);
            if (title != null) {
                DsTextAtomKt.DsTextAtom(title, a0.e(aVar2, 1.0f), u11, 48, 0);
            }
            u11.k();
            float floatValue = ((Number) c7980b.k()).floatValue();
            e e12 = a0.e(aVar2, 1.0f);
            DsSpacings dsSpacings = DsSpacings.INSTANCE;
            I1.b(floatValue, C6988h.a(a0.f(T.h(e12, dsSpacings.m1861getDp8D9Ej5fM(), 0.0f, 2), dsSpacings.m1854getDp4D9Ej5fM()), h.b(CornerRadius.RADIUS_200.m1866getDpD9Ej5fM())), uniTheme.getColors(u11, i13).getGraphicActionPrimary(), uniTheme.getColors(u11, i13).getGraphicNeutral(), u11, 1, 0);
            E.a(u11, a0.f(aVar2, dsSpacings.m1854getDp4D9Ej5fM()));
            u11.f();
        }
        J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new LoadingProgressBarContentKt$LoadingProgressBarContent$4(state, viewModel, i11));
        }
    }
}
