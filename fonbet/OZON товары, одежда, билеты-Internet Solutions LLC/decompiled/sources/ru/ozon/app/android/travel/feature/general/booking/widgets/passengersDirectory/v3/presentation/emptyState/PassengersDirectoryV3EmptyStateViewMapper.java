package ru.ozon.app.android.travel.feature.general.booking.widgets.passengersDirectory.v3.presentation.emptyState;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import k20.C7473e;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.widgets.v2.WidgetViewMapper2;
import ru.ozon.app.android.travel.feature.general.booking.widgets.passengersDirectory.v3.data.PassengersDirectoryV3DTO;
import ru.ozon.app.android.travel.feature.general.booking.widgets.passengersDirectory.v3.di.PassengersDirectoryV3Component;
import ru.ozon.app.android.travel.molecules.view.emptyState.v2.EmptyStateV2View;
import ru.ozon.app.android.travel.utils.RoundedBackgroundProducer;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;

@Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J+\u0010\u001c\u001a\u0012\u0012\u0004\u0012\u00020\u00020\u001aj\b\u0012\u0004\u0012\u00020\u0002`\u001b2\n\u0010\u0019\u001a\u00060\u0017j\u0002`\u0018H\u0016¢\u0006\u0004\b\u001c\u0010\u001dR<\u0010\"\u001a$\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u001f\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00040 j\b\u0012\u0004\u0012\u00020\u0004`!0\u001e8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R0\u0010)\u001a\u001e\u0012\u0004\u0012\u00020\u0003\u0012\b\u0012\u00060&j\u0002`'\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u000e0\u001e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b(\u0010%¨\u0006*"}, d2 = {"Lru/ozon/app/android/travel/feature/general/booking/widgets/passengersDirectory/v3/presentation/emptyState/PassengersDirectoryV3EmptyStateViewMapper;", "Lru/ozon/app/android/composer/widgets/v2/WidgetViewMapper2;", "Lru/ozon/app/android/travel/feature/general/booking/widgets/passengersDirectory/v3/di/PassengersDirectoryV3Component;", "Lru/ozon/app/android/travel/feature/general/booking/widgets/passengersDirectory/v3/data/PassengersDirectoryV3DTO;", "Lru/ozon/app/android/travel/feature/general/booking/widgets/passengersDirectory/v3/presentation/emptyState/PassengersDirectoryV3EmptyStateVO;", "<init>", "()V", "", "state", "", "canMap", "(Ljava/lang/Object;)Z", "Landroid/content/Context;", "context", "", "Landroidx/recyclerview/widget/RecyclerView$n;", "getDecorators", "(Landroid/content/Context;)Ljava/util/List;", "Landroid/view/ViewGroup;", "parent", "Landroid/view/View;", "createView", "(Landroid/view/ViewGroup;)Landroid/view/View;", "Lk20/g;", "Lru/ozon/app/android/composer/widgets/v2/di/ComposerWidgetComponentStorage;", "storage", "Lk20/e;", "Lru/ozon/app/android/composer/widgets/v2/di/WidgetComponent;", "widgetComponent", "(Lk20/g;)Lk20/e;", "Lkotlin/Function2;", "Lru/ozon/app/android/composer/ComposerReferences;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "holderProducer", "Lkotlin/jvm/functions/Function2;", "getHolderProducer", "()Lkotlin/jvm/functions/Function2;", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "getMapper", "mapper", "booking_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class PassengersDirectoryV3EmptyStateViewMapper extends WidgetViewMapper2<PassengersDirectoryV3Component, PassengersDirectoryV3DTO, PassengersDirectoryV3EmptyStateVO> {

    @NotNull
    private final Function2<View, ComposerReferences, k<PassengersDirectoryV3EmptyStateVO>> holderProducer = new PassengersDirectoryV3EmptyStateViewMapper$holderProducer$1(this);

    @Override // ru.ozon.composer.ui.widget.g, m20.InterfaceC8046a
    public boolean canMap(Object state) {
        return (state instanceof PassengersDirectoryV3DTO) && ((PassengersDirectoryV3DTO) state).getEmptyState() != null;
    }

    @Override // ru.ozon.composer.ui.widget.g
    @NotNull
    public View createView(@NotNull ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Context context = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        EmptyStateV2View emptyStateV2View = new EmptyStateV2View(context);
        RoundedBackgroundProducer roundedBackgroundProducer = new RoundedBackgroundProducer();
        Context context2 = emptyStateV2View.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        int themeColor = ThemeExtKt.themeColor(context2, R$attr.layerFloor1);
        Context context3 = emptyStateV2View.getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
        emptyStateV2View.setBackground(roundedBackgroundProducer.produce(themeColor, ResourceExtKt.toPxF(24, context3)));
        emptyStateV2View.setLayoutParams(new ViewGroup.MarginLayoutParams(-1, -2));
        return emptyStateV2View;
    }

    @Override // ru.ozon.composer.ui.widget.g
    @NotNull
    public List<RecyclerView.n> getDecorators(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return C7714v.a0(new PassengersDirectoryV3EmptyStateDecoration(context));
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    /* renamed from: getHolderProducer */
    public Function2<View, ComposerReferences, k<PassengersDirectoryV3EmptyStateVO>> mo614getHolderProducer() {
        return this.holderProducer;
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    public Function2<PassengersDirectoryV3DTO, d, List<PassengersDirectoryV3EmptyStateVO>> getMapper() {
        return component().getEmptyStateMapper();
    }

    @Override // ru.ozon.app.android.composer.widgets.v2.ViewMapper2
    @NotNull
    public C7473e<PassengersDirectoryV3Component> widgetComponent(@NotNull C7475g storage) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        return PassengersDirectoryV3Component.INSTANCE.create(storage);
    }
}
