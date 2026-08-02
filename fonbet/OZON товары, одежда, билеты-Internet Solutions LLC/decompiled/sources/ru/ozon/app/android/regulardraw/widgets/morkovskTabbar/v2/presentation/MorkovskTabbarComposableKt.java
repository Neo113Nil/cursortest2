package ru.ozon.app.android.regulardraw.widgets.morkovskTabbar.v2.presentation;

import S0.C3969l;
import S0.C3996z;
import S0.InterfaceC3967k;
import S0.J0;
import Tg.b;
import a00.h;
import a1.c;
import androidx.compose.ui.platform.C5239d1;
import androidx.lifecycle.w0;
import androidx.lifecycle.z0;
import b00.f;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.regulardraw.widgets.morkovskTabbar.v2.presentation.tab.MorkovskTabbarTabController;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a+\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0001¢\u0006\u0004\b\u0006\u0010\u0007\u001a!\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lru/ozon/app/android/regulardraw/widgets/morkovskTabbar/v2/presentation/MorkovskTabbarVI;", "state", "Lkotlin/Function1;", "LTg/b;", "", "onAtomAction", "MorkovskTabbarComposable", "(Lru/ozon/app/android/regulardraw/widgets/morkovskTabbar/v2/presentation/MorkovskTabbarVI;Lkotlin/jvm/functions/Function1;LS0/k;I)V", "", "widgetId", "", "tabIndex", "Lru/ozon/app/android/regulardraw/widgets/morkovskTabbar/v2/presentation/tab/MorkovskTabbarTabController;", "tabController", "(JILS0/k;I)Lru/ozon/app/android/regulardraw/widgets/morkovskTabbar/v2/presentation/tab/MorkovskTabbarTabController;", "regulardraw_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class MorkovskTabbarComposableKt {
    public static final void MorkovskTabbarComposable(@NotNull MorkovskTabbarVI state, @NotNull Function1<? super b, Unit> onAtomAction, InterfaceC3967k interfaceC3967k, int i11) {
        int i12;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(onAtomAction, "onAtomAction");
        C3969l u11 = interfaceC3967k.u(-1341312808);
        if ((i11 & 6) == 0) {
            i12 = (u11.n(state) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= u11.F(onAtomAction) ? 32 : 16;
        }
        if ((i12 & 19) == 18 && u11.b()) {
            u11.j();
        } else {
            C3996z.a(LocalPinTriggerModifierKt.getLocalPinTriggerAnimation().c(LocalPinTriggerModifierKt.rememberPinTriggerAnimation(u11, 0)), c.c(-954260456, new MorkovskTabbarComposableKt$MorkovskTabbarComposable$1(state, onAtomAction), u11), u11, 56);
        }
        J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new MorkovskTabbarComposableKt$MorkovskTabbarComposable$2(state, onAtomAction, i11));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MorkovskTabbarTabController tabController(long j11, int i11, InterfaceC3967k interfaceC3967k, int i12) {
        if (((Boolean) interfaceC3967k.m(C5239d1.a())).booleanValue()) {
            return null;
        }
        return ((MorkovskTabbarViewModel) new z0(((h) interfaceC3967k.m(f.f())).a(), new z0.c() { // from class: ru.ozon.app.android.regulardraw.widgets.morkovskTabbar.v2.presentation.MorkovskTabbarComposableKt$tabController$$inlined$viewModel$1
            @Override // androidx.lifecycle.z0.c, androidx.lifecycle.z0.b
            public <T extends w0> T create(Class<T> modelClass) {
                Intrinsics.checkNotNullParameter(modelClass, "modelClass");
                return new MorkovskTabbarViewModel();
            }
        }).a(MorkovskTabbarViewModel.class)).getTabController(j11, i11);
    }
}
