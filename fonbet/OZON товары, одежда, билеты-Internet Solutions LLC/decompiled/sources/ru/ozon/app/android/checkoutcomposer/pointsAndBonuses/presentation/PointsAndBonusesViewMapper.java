package ru.ozon.app.android.checkoutcomposer.pointsAndBonuses.presentation;

import Sc.InterfaceC4008j;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.checkoutcomposer.pointsAndBonuses.data.PointsAndBonusesDTO;
import ru.ozon.app.android.checkoutcomposer.pointsAndBonuses.di.PointsAndBonusesWidgetComponent;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.widgets.base.WidgetViewMapper;
import ru.ozon.composer.ui.widget.k;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\rR\u001b\u0010\u0013\u001a\u00020\u000e8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R<\u0010\u0018\u001a$\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0015\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00030\u0016j\b\u0012\u0004\u0012\u00020\u0003`\u00170\u00148\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"Lru/ozon/app/android/checkoutcomposer/pointsAndBonuses/presentation/PointsAndBonusesViewMapper;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewMapper;", "Lru/ozon/app/android/checkoutcomposer/pointsAndBonuses/data/PointsAndBonusesDTO;", "Lru/ozon/app/android/checkoutcomposer/pointsAndBonuses/presentation/PointsAndBonusesVO;", "Lru/ozon/app/android/checkoutcomposer/pointsAndBonuses/di/PointsAndBonusesWidgetComponent;", "component", "<init>", "(Lru/ozon/app/android/checkoutcomposer/pointsAndBonuses/di/PointsAndBonusesWidgetComponent;)V", "Landroid/view/ViewGroup;", "parent", "Landroid/view/View;", "createView", "(Landroid/view/ViewGroup;)Landroid/view/View;", "Lru/ozon/app/android/checkoutcomposer/pointsAndBonuses/di/PointsAndBonusesWidgetComponent;", "Lru/ozon/app/android/checkoutcomposer/pointsAndBonuses/presentation/PointsAndBonusesMapper;", "mapper$delegate", "LSc/j;", "getMapper", "()Lru/ozon/app/android/checkoutcomposer/pointsAndBonuses/presentation/PointsAndBonusesMapper;", "mapper", "Lkotlin/Function2;", "Lru/ozon/app/android/composer/ComposerReferences;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "holderProducer", "Lkotlin/jvm/functions/Function2;", "getHolderProducer", "()Lkotlin/jvm/functions/Function2;", "checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class PointsAndBonusesViewMapper extends WidgetViewMapper<PointsAndBonusesDTO, PointsAndBonusesVO> {

    @NotNull
    private final PointsAndBonusesWidgetComponent component;

    @NotNull
    private final Function2<View, ComposerReferences, k<PointsAndBonusesVO>> holderProducer;

    /* renamed from: mapper$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j mapper;

    public PointsAndBonusesViewMapper(@NotNull PointsAndBonusesWidgetComponent component) {
        Intrinsics.checkNotNullParameter(component, "component");
        this.component = component;
        this.mapper = Sc.k.b(new PointsAndBonusesViewMapper$mapper$2(this));
        this.holderProducer = new PointsAndBonusesViewMapper$holderProducer$1(this);
    }

    @Override // ru.ozon.composer.ui.widget.g
    @NotNull
    public View createView(@NotNull ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        LinearLayout linearLayout = new LinearLayout(parent.getContext());
        linearLayout.setOrientation(1);
        linearLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        return linearLayout;
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    /* renamed from: getHolderProducer */
    public Function2<View, ComposerReferences, k<PointsAndBonusesVO>> mo614getHolderProducer() {
        return this.holderProducer;
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    public Function2<PointsAndBonusesDTO, d, List<PointsAndBonusesVO>> getMapper() {
        return (PointsAndBonusesMapper) this.mapper.getValue();
    }
}
