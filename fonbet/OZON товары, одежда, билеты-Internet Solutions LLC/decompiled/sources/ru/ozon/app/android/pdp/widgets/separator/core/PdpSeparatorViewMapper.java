package ru.ozon.app.android.pdp.widgets.separator.core;

import android.view.View;
import android.view.ViewGroup;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l10.i;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pdp.R$id;
import ru.ozon.app.android.pdp.flags.PdpSeparatorComposeWidgetEnabled;
import ru.ozon.app.android.pdp.utils.Dimens;
import ru.ozon.app.android.pdp.widgets.separator.data.PdpSeparatorDTO;
import ru.ozon.app.android.pdp.widgets.separator.di.PdpSeparatorComponent;
import ru.ozon.app.android.pdp.widgets.separator.presentation.PdpSeparatorVO;
import ru.ozon.app.android.pdp.widgets.separator.presentation.PdpSeparatorViewHolder;
import ru.ozon.composer.ui.widget.g;
import ru.ozon.composer.ui.widget.k;

@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\b\u0001\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J%\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00030\u000b2\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rJ%\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00030\u00122\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0019\u0010\u001b\u001a\u00020\u001a2\b\u0010\b\u001a\u0004\u0018\u00010\u0019H\u0016¢\u0006\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001c\u0010!\u001a\u0004\u0018\u00010 8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$¨\u0006%"}, d2 = {"Lru/ozon/app/android/pdp/widgets/separator/core/PdpSeparatorViewMapper;", "Lru/ozon/composer/ui/widget/g;", "Lru/ozon/app/android/pdp/widgets/separator/data/PdpSeparatorDTO;", "Lru/ozon/app/android/pdp/widgets/separator/presentation/PdpSeparatorVO;", "Lru/ozon/app/android/pdp/widgets/separator/di/PdpSeparatorComponent;", "component", "<init>", "(Lru/ozon/app/android/pdp/widgets/separator/di/PdpSeparatorComponent;)V", "state", "Ll20/d;", "info", "", "map", "(Lru/ozon/app/android/pdp/widgets/separator/data/PdpSeparatorDTO;Ll20/d;)Ljava/util/List;", "Ll10/i;", "container", "Landroid/view/View;", "view", "Lru/ozon/composer/ui/widget/k;", "createHolder", "(Ll10/i;Landroid/view/View;)Lru/ozon/composer/ui/widget/k;", "Landroid/view/ViewGroup;", "parent", "createView", "(Landroid/view/ViewGroup;)Landroid/view/View;", "", "", "canMap", "(Ljava/lang/Object;)Z", "Lru/ozon/app/android/pdp/widgets/separator/di/PdpSeparatorComponent;", "getComponent", "()Lru/ozon/app/android/pdp/widgets/separator/di/PdpSeparatorComponent;", "", "layout", "Ljava/lang/Integer;", "getLayout", "()Ljava/lang/Integer;", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class PdpSeparatorViewMapper extends g<PdpSeparatorDTO, PdpSeparatorVO> {

    @NotNull
    private final PdpSeparatorComponent component;
    private final Integer layout;

    public PdpSeparatorViewMapper(@NotNull PdpSeparatorComponent component) {
        Intrinsics.checkNotNullParameter(component, "component");
        this.component = component;
    }

    @Override // ru.ozon.composer.ui.widget.g, m20.InterfaceC8046a
    public boolean canMap(Object state) {
        return (state instanceof PdpSeparatorDTO) && !this.component.getFeatureChecker().isEnabled(PdpSeparatorComposeWidgetEnabled.INSTANCE);
    }

    @Override // ru.ozon.composer.ui.widget.g
    @NotNull
    /* renamed from: createHolder */
    public k<PdpSeparatorVO> createHolder2(@NotNull i container, @NotNull View view) {
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(view, "view");
        return new PdpSeparatorViewHolder(view, container);
    }

    @Override // ru.ozon.composer.ui.widget.g
    @NotNull
    public View createView(@NotNull ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        View view = new View(parent.getContext());
        view.setId(R$id.pdpSeparatorV);
        view.setLayoutParams(new ViewGroup.LayoutParams(-1, Dimens.INSTANCE.getDP_8()));
        return view;
    }

    @Override // ru.ozon.composer.ui.widget.g
    public Integer getLayout() {
        return this.layout;
    }

    @Override // m20.InterfaceC8046a
    @NotNull
    public List<PdpSeparatorVO> map(@NotNull PdpSeparatorDTO state, @NotNull d info) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(info, "info");
        return this.component.getMapper().invoke(state, info);
    }
}
