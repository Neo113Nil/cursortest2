package ru.ozon.app.android.pdp.widgets.aspectsV2.core.applybutton;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import c20.r;
import d20.AbstractC6065b;
import d20.InterfaceC6068e;
import java.util.List;
import k20.C7473e;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import l10.i;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.widgets.v2.overlay.OverlayWidgetScreenViewItemMapper2;
import ru.ozon.app.android.pdp.R$layout;
import ru.ozon.app.android.pdp.databinding.WidgetAspectsFullApplyButtonLayoutBinding;
import ru.ozon.app.android.pdp.widgets.aspectsCompactV2.data.AspectsDTO;
import ru.ozon.app.android.pdp.widgets.aspectsV2.core.applybutton.ApplyButtonViewMapper;
import ru.ozon.app.android.pdp.widgets.aspectsV2.di.AspectsComponent;
import ru.ozon.app.android.pdp.widgets.aspectsV2.presentation.applybutton.ApplyButtonVO;
import ru.ozon.app.android.pdp.widgets.aspectsV2.presentation.applybutton.ApplyButtonViewHolder;
import ru.ozon.uni.android.uikit.extensions.view.ViewGroupExtKt;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;

@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006J%\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\n2\u0006\u0010\u0007\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0007\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u001d\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00040\u00132\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J+\u0010\u001b\u001a\u0012\u0012\u0004\u0012\u00020\u00020\u0019j\b\u0012\u0004\u0012\u00020\u0002`\u001a2\n\u0010\u0018\u001a\u00060\u0016j\u0002`\u0017H\u0016¢\u0006\u0004\b\u001b\u0010\u001cR\u001a\u0010\u001e\u001a\u00020\u001d8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!¨\u0006\""}, d2 = {"Lru/ozon/app/android/pdp/widgets/aspectsV2/core/applybutton/ApplyButtonViewMapper;", "Lru/ozon/app/android/composer/widgets/v2/overlay/OverlayWidgetScreenViewItemMapper2;", "Lru/ozon/app/android/pdp/widgets/aspectsV2/di/AspectsComponent;", "Lru/ozon/app/android/pdp/widgets/aspectsCompactV2/data/AspectsDTO$AspectButton;", "Lru/ozon/app/android/pdp/widgets/aspectsV2/presentation/applybutton/ApplyButtonVO;", "<init>", "()V", "state", "Ll20/d;", "info", "", "map", "(Lru/ozon/app/android/pdp/widgets/aspectsCompactV2/data/AspectsDTO$AspectButton;Ll20/d;)Ljava/util/List;", "", "", "canMap", "(Ljava/lang/Object;)Z", "Ll10/i;", "container", "Ld20/b;", "createHolder", "(Ll10/i;)Ld20/b;", "Lk20/g;", "Lru/ozon/app/android/composer/widgets/v2/di/ComposerWidgetComponentStorage;", "storage", "Lk20/e;", "Lru/ozon/app/android/composer/widgets/v2/di/WidgetComponent;", "widgetComponent", "(Lk20/g;)Lk20/e;", "Lc20/r$a;", "viewType", "Lc20/r$a;", "getViewType", "()Lc20/r$a;", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ApplyButtonViewMapper extends OverlayWidgetScreenViewItemMapper2<AspectsComponent, AspectsDTO.AspectButton, ApplyButtonVO> {

    @NotNull
    private final r.a viewType = r.a.SINGLE;

    /* JADX INFO: Access modifiers changed from: private */
    public static final View createHolder$lambda$0(WidgetAspectsFullApplyButtonLayoutBinding widgetAspectsFullApplyButtonLayoutBinding, LinearLayout it) {
        Intrinsics.checkNotNullParameter(it, "it");
        FrameLayout constraintLayout = widgetAspectsFullApplyButtonLayoutBinding.getConstraintLayout();
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "getRoot(...)");
        return constraintLayout;
    }

    @Override // c20.r, m20.InterfaceC8046a
    public boolean canMap(Object state) {
        return (state instanceof AspectsDTO.AspectButton) && ((AspectsDTO.AspectButton) state).getButton() != null;
    }

    @Override // c20.r
    @NotNull
    public AbstractC6065b<ApplyButtonVO> createHolder(@NotNull i container) {
        Intrinsics.checkNotNullParameter(container, "container");
        final WidgetAspectsFullApplyButtonLayoutBinding bind = WidgetAspectsFullApplyButtonLayoutBinding.bind(ViewGroupExtKt.inflate(container.Z(), R$layout.widget_aspects_full_apply_button_layout));
        Intrinsics.checkNotNullExpressionValue(bind, "bind(...)");
        return new ApplyButtonViewHolder(container, bind, component().getCustomActionHandlersStoreFactory(), new InterfaceC6068e() { // from class: TC.a
            @Override // d20.InterfaceC6068e
            public final View create(ViewGroup viewGroup) {
                View createHolder$lambda$0;
                createHolder$lambda$0 = ApplyButtonViewMapper.createHolder$lambda$0(WidgetAspectsFullApplyButtonLayoutBinding.this, (LinearLayout) viewGroup);
                return createHolder$lambda$0;
            }
        });
    }

    @Override // c20.r
    @NotNull
    public r.a getViewType() {
        return this.viewType;
    }

    @Override // ru.ozon.app.android.composer.widgets.v2.ViewMapper2
    @NotNull
    public C7473e<AspectsComponent> widgetComponent(@NotNull C7475g storage) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        return AspectsComponent.INSTANCE.create(storage);
    }

    @Override // m20.InterfaceC8046a
    @NotNull
    public List<ApplyButtonVO> map(@NotNull AspectsDTO.AspectButton state, @NotNull d info) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(info, "info");
        long hashCode = info.d().hashCode();
        ButtonV3Atom.LargeButton button = state.getButton();
        Intrinsics.f(button);
        return C7714v.a0(new ApplyButtonVO(hashCode, button));
    }
}
