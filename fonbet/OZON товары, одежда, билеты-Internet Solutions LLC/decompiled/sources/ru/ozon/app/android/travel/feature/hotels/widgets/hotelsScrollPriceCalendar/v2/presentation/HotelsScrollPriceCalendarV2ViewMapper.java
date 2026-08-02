package ru.ozon.app.android.travel.feature.hotels.widgets.hotelsScrollPriceCalendar.v2.presentation;

import A00.a;
import Pc.a;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import h20.InterfaceC6786a;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.widgets.base.WidgetViewMapper;
import ru.ozon.app.android.travel.feature.hotels.widgets.hotelsScrollPriceCalendar.v2.data.HotelsScrollPriceCalendarV2DTO;
import ru.ozon.app.android.travel.feature.hotels.widgets.hotelsScrollPriceCalendar.v2.di.HotelsScrollPriceCalendarV2Component;
import ru.ozon.app.android.travel.feature.hotels.widgets.hotelsScrollPriceCalendar.v2.view.HotelsScrollPriceCalendarV2View;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;

@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J!\u0010\u000b\u001a\u0004\u0018\u00010\u00032\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0012R\"\u0010\u0015\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00140\u00138\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R,\u0010\u001c\u001a\u0014\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u001b0\u00198\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR&\u0010#\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\"0!0 8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R,\u0010)\u001a\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020'\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030 0\u00198VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b(\u0010\u001f¨\u0006*"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsScrollPriceCalendar/v2/presentation/HotelsScrollPriceCalendarV2ViewMapper;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewMapper;", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsScrollPriceCalendar/v2/data/HotelsScrollPriceCalendarV2DTO;", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsScrollPriceCalendar/v2/presentation/HotelsScrollPriceCalendarV2VI;", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsScrollPriceCalendar/v2/di/HotelsScrollPriceCalendarV2Component;", "component", "<init>", "(Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsScrollPriceCalendar/v2/di/HotelsScrollPriceCalendarV2Component;)V", "LA00/a$J$a;", "update", "oldItem", "handleUpdate", "(LA00/a$J$a;Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsScrollPriceCalendar/v2/presentation/HotelsScrollPriceCalendarV2VI;)Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsScrollPriceCalendar/v2/presentation/HotelsScrollPriceCalendarV2VI;", "Landroid/view/ViewGroup;", "parent", "Landroid/view/View;", "createView", "(Landroid/view/ViewGroup;)Landroid/view/View;", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsScrollPriceCalendar/v2/di/HotelsScrollPriceCalendarV2Component;", "LPc/a;", "Lh20/a;", "viewModelWidgetProvider", "LPc/a;", "getViewModelWidgetProvider", "()LPc/a;", "Lkotlin/Function2;", "Lru/ozon/app/android/composer/ComposerReferences;", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsScrollPriceCalendar/v2/presentation/HotelsScrollPriceCalendarV2WidgetViewHolder;", "holderProducer", "Lkotlin/jvm/functions/Function2;", "getHolderProducer", "()Lkotlin/jvm/functions/Function2;", "", "Ljava/lang/Class;", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsScrollPriceCalendar/v2/presentation/HotelsScrollPriceCalendarV2Update;", "supportedUpdates", "Ljava/util/List;", "getSupportedUpdates", "()Ljava/util/List;", "Ll20/d;", "getMapper", "mapper", "hotels_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class HotelsScrollPriceCalendarV2ViewMapper extends WidgetViewMapper<HotelsScrollPriceCalendarV2DTO, HotelsScrollPriceCalendarV2VI> {

    @NotNull
    private final HotelsScrollPriceCalendarV2Component component;

    @NotNull
    private final Function2<View, ComposerReferences, HotelsScrollPriceCalendarV2WidgetViewHolder> holderProducer;

    @NotNull
    private final List<Class<HotelsScrollPriceCalendarV2Update>> supportedUpdates;

    @NotNull
    private final a<? extends InterfaceC6786a> viewModelWidgetProvider;

    public HotelsScrollPriceCalendarV2ViewMapper(@NotNull HotelsScrollPriceCalendarV2Component component) {
        Intrinsics.checkNotNullParameter(component, "component");
        this.component = component;
        this.viewModelWidgetProvider = component.getWidgetViewModelProvider();
        this.holderProducer = new HotelsScrollPriceCalendarV2ViewMapper$holderProducer$1(this);
        this.supportedUpdates = C7714v.a0(HotelsScrollPriceCalendarV2Update.class);
    }

    @Override // ru.ozon.composer.ui.widget.g
    @NotNull
    public View createView(@NotNull ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Context context = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        HotelsScrollPriceCalendarV2View hotelsScrollPriceCalendarV2View = new HotelsScrollPriceCalendarV2View(context);
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -2);
        Context context2 = hotelsScrollPriceCalendarV2View.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        hotelsScrollPriceCalendarV2View.setBackgroundColor(ThemeExtKt.themeColor(context2, R$attr.layerFloor1));
        hotelsScrollPriceCalendarV2View.setLayoutParams(layoutParams);
        return hotelsScrollPriceCalendarV2View;
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    /* renamed from: getHolderProducer */
    public Function2<View, ComposerReferences, k<HotelsScrollPriceCalendarV2VI>> mo614getHolderProducer() {
        return this.holderProducer;
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    public Function2<HotelsScrollPriceCalendarV2DTO, d, List<HotelsScrollPriceCalendarV2VI>> getMapper() {
        return this.component.getMapper();
    }

    @Override // ru.ozon.composer.ui.widget.g, I00.d
    @NotNull
    public List<Class<HotelsScrollPriceCalendarV2Update>> getSupportedUpdates() {
        return this.supportedUpdates;
    }

    @Override // ru.ozon.composer.ui.widget.g
    @NotNull
    public a<? extends InterfaceC6786a> getViewModelWidgetProvider() {
        return this.viewModelWidgetProvider;
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper, ru.ozon.composer.ui.widget.g, I00.d
    public HotelsScrollPriceCalendarV2VI handleUpdate(@NotNull a.J.InterfaceC0007a update, @NotNull HotelsScrollPriceCalendarV2VI oldItem) {
        Intrinsics.checkNotNullParameter(update, "update");
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        if (update instanceof HotelsScrollPriceCalendarV2Update) {
            return HotelsScrollPriceCalendarV2VI.copy$default(oldItem, 0L, ((HotelsScrollPriceCalendarV2Update) update).getNewState(), null, 5, null);
        }
        return null;
    }
}
