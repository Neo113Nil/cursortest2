package ru.ozon.app.android.pdp.view.shared;

import S0.A1;
import S0.C3969l;
import S0.InterfaceC3967k;
import S0.J0;
import S0.n1;
import android.view.View;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import fd.InterfaceC6511n;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pdp.ui.configurators.pdp.tab.PdpTabsSelectionState;
import ru.ozon.app.android.pdp.ui.configurators.pdp.tab.TabEmbeddedViewObject;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a5\u0010\u0006\u001a\u00020\u0004\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00028\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00040\u0003H\u0007¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\n²\u0006\u000e\u0010\t\u001a\u0004\u0018\u00010\b8\nX\u008a\u0084\u0002"}, d2 = {"Lru/ozon/app/android/pdp/ui/configurators/pdp/tab/TabEmbeddedViewObject;", "T", "item", "Lkotlin/Function1;", "", "content", "TabEmbeddedComposable", "(Lru/ozon/app/android/pdp/ui/configurators/pdp/tab/TabEmbeddedViewObject;Lfd/n;LS0/k;I)V", "Lru/ozon/app/android/pdp/ui/configurators/pdp/tab/PdpTabsSelectionState$TabGroup;", "tabState", "pdp_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class TabEmbeddedComposableKt {
    public static final <T extends TabEmbeddedViewObject> void TabEmbeddedComposable(@NotNull T item, @NotNull InterfaceC6511n<? super T, ? super InterfaceC3967k, ? super Integer, Unit> content, InterfaceC3967k interfaceC3967k, int i11) {
        int i12;
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(content, "content");
        C3969l u11 = interfaceC3967k.u(604039287);
        if ((i11 & 6) == 0) {
            i12 = ((i11 & 8) == 0 ? u11.n(item) : u11.F(item) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= u11.F(content) ? 32 : 16;
        }
        if ((i12 & 19) == 18 && u11.b()) {
            u11.j();
        } else {
            View view = (View) u11.m(AndroidCompositionLocals_androidKt.h());
            PdpTabsSelectionState pdpTabsSelectionState = PdpTabsSelectionState.INSTANCE;
            PdpTabsSelectionState.TabGroup TabEmbeddedComposable$lambda$0 = TabEmbeddedComposable$lambda$0(n1.a(pdpTabsSelectionState.observeChanges(), pdpTabsSelectionState.value(), null, u11, PdpTabsSelectionState.TabGroup.$stable << 3, 2));
            String tabGroupId = item.getTabGroupId();
            u11.o(-993838539);
            boolean n11 = u11.n(TabEmbeddedComposable$lambda$0) | u11.n(tabGroupId);
            Object C11 = u11.C();
            if (n11 || C11 == InterfaceC3967k.a.a()) {
                C11 = Boolean.valueOf((tabGroupId == null || h.K(tabGroupId)) || TabEmbeddedComposable$lambda$0 == null || Intrinsics.d(TabEmbeddedComposable$lambda$0.getSelectedGroupId(), tabGroupId) || !TabEmbeddedComposable$lambda$0.getGroupIds().contains(tabGroupId));
                u11.x(C11);
            }
            boolean booleanValue = ((Boolean) C11).booleanValue();
            u11.k();
            if (booleanValue) {
                content.invoke(item, u11, Integer.valueOf(i12 & 126));
                view.requestLayout();
            }
        }
        J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new TabEmbeddedComposableKt$TabEmbeddedComposable$1(item, content, i11));
        }
    }

    private static final PdpTabsSelectionState.TabGroup TabEmbeddedComposable$lambda$0(A1<PdpTabsSelectionState.TabGroup> a12) {
        return a12.getValue();
    }
}
