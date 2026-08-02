package ru.ozon.app.android.travel.feature.general.main.widgets.priceCalendarFooter.v3.presentation;

import A00.a;
import Pc.a;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.lifecycle.w0;
import androidx.lifecycle.z0;
import c20.r;
import d20.AbstractC6065b;
import java.util.List;
import k20.C7473e;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import l10.i;
import l10.v;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.R$id;
import ru.ozon.app.android.composer.R$string;
import ru.ozon.app.android.composer.widgets.v2.overlay.OverlayWidgetScreenViewItemMapper2;
import ru.ozon.app.android.travel.calendar.viewModel.CalendarViewModel;
import ru.ozon.app.android.travel.feature.general.main.widgets.priceCalendarFooter.v3.data.PriceCalendarFooterV3DTO;
import ru.ozon.app.android.travel.feature.general.main.widgets.priceCalendarFooter.v3.di.PriceCalendarFooterV3Component;
import ru.ozon.app.android.travel.feature.general.main.widgets.priceCalendarFooter.v3.presentation.view.PriceCalendarFooterV3View;
import ru.ozon.app.android.travel.utils.placeholder.NestedWidgetsManager;
import ru.ozon.app.android.travel.utils.placeholder.PlaceholderParser;
import ru.ozon.app.android.uikit.text.StringProvider;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;

@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006J)\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\u000b2\u0006\u0010\u0007\u001a\u00020\u00032\n\u0010\n\u001a\u00060\bj\u0002`\tH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0011\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u001d\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00040\u00152\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J!\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00020\u001b2\n\u0010\u001a\u001a\u00060\u0018j\u0002`\u0019H\u0016¢\u0006\u0004\b\u001c\u0010\u001dR\u001a\u0010\u001f\u001a\u00020\u001e8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R&\u0010%\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020$0#0\u000b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(¨\u0006)"}, d2 = {"Lru/ozon/app/android/travel/feature/general/main/widgets/priceCalendarFooter/v3/presentation/PriceCalendarFooterV3BottomViewMapper;", "Lru/ozon/app/android/composer/widgets/v2/overlay/OverlayWidgetScreenViewItemMapper2;", "Lru/ozon/app/android/travel/feature/general/main/widgets/priceCalendarFooter/v3/di/PriceCalendarFooterV3Component;", "Lru/ozon/app/android/travel/feature/general/main/widgets/priceCalendarFooter/v3/data/PriceCalendarFooterV3DTO;", "Lru/ozon/app/android/travel/feature/general/main/widgets/priceCalendarFooter/v3/presentation/PriceCalendarFooterV3VO;", "<init>", "()V", "state", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "info", "", "map", "(Lru/ozon/app/android/travel/feature/general/main/widgets/priceCalendarFooter/v3/data/PriceCalendarFooterV3DTO;Ll20/d;)Ljava/util/List;", "LA00/a$J$a;", "update", "oldItem", "handleUpdate", "(LA00/a$J$a;Lru/ozon/app/android/travel/feature/general/main/widgets/priceCalendarFooter/v3/presentation/PriceCalendarFooterV3VO;)Lru/ozon/app/android/travel/feature/general/main/widgets/priceCalendarFooter/v3/presentation/PriceCalendarFooterV3VO;", "Ll10/i;", "container", "Ld20/b;", "createHolder", "(Ll10/i;)Ld20/b;", "Lk20/g;", "Lru/ozon/app/android/composer/widgets/v2/di/ComposerWidgetComponentStorage;", "storage", "Lk20/e;", "widgetComponent", "(Lk20/g;)Lk20/e;", "Lc20/r$a;", "viewType", "Lc20/r$a;", "getViewType", "()Lc20/r$a;", "Ljava/lang/Class;", "Lru/ozon/app/android/travel/feature/general/main/widgets/priceCalendarFooter/v3/presentation/PriceCalendarFooterV3Update;", "supportedUpdates", "Ljava/util/List;", "getSupportedUpdates", "()Ljava/util/List;", "main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class PriceCalendarFooterV3BottomViewMapper extends OverlayWidgetScreenViewItemMapper2<PriceCalendarFooterV3Component, PriceCalendarFooterV3DTO, PriceCalendarFooterV3VO> {

    @NotNull
    private final r.a viewType = r.a.SINGLE;

    @NotNull
    private final List<Class<PriceCalendarFooterV3Update>> supportedUpdates = C7714v.a0(PriceCalendarFooterV3Update.class);

    /* JADX INFO: Access modifiers changed from: private */
    public static final View createHolder$lambda$2(LinearLayout parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Context context = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        PriceCalendarFooterV3View priceCalendarFooterV3View = new PriceCalendarFooterV3View(context);
        Context context2 = priceCalendarFooterV3View.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        int px = ResourceExtKt.toPx(16, context2);
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-1, -2);
        marginLayoutParams.topMargin = px;
        priceCalendarFooterV3View.setLayoutParams(marginLayoutParams);
        priceCalendarFooterV3View.setPadding(px, px, px, px);
        priceCalendarFooterV3View.setElevation(px);
        priceCalendarFooterV3View.setClickable(true);
        priceCalendarFooterV3View.setVisibility(8);
        priceCalendarFooterV3View.setTag(StringProvider.getString(R$string.common_tag_not_affect_offset));
        priceCalendarFooterV3View.setTag(R$id.skip_composer_default_widget_background, Unit.f71690a);
        return priceCalendarFooterV3View;
    }

    @Override // c20.r
    @NotNull
    public AbstractC6065b<PriceCalendarFooterV3VO> createHolder(@NotNull i container) {
        Intrinsics.checkNotNullParameter(container, "container");
        PriceCalendarFooterV3WidgetViewModel priceCalendarFooterV3WidgetViewModel = component().getWidgetViewModelProvider().get();
        Intrinsics.checkNotNullExpressionValue(priceCalendarFooterV3WidgetViewModel, "get(...)");
        PriceCalendarFooterV3WidgetViewModel priceCalendarFooterV3WidgetViewModel2 = priceCalendarFooterV3WidgetViewModel;
        v b02 = container.b0();
        final a<CalendarViewModel> calendarViewModelProvider = component().getCalendarViewModelProvider();
        w0 a11 = new z0(b02.a(), new z0.c() { // from class: ru.ozon.app.android.travel.feature.general.main.widgets.priceCalendarFooter.v3.presentation.PriceCalendarFooterV3BottomViewMapper$createHolder$$inlined$viewModel$1
            @Override // androidx.lifecycle.z0.c, androidx.lifecycle.z0.b
            public <T extends w0> T create(Class<T> modelClass) {
                Intrinsics.checkNotNullParameter(modelClass, "modelClass");
                CalendarViewModel calendarViewModel = (CalendarViewModel) a.this.get();
                Intrinsics.g(calendarViewModel, "null cannot be cast to non-null type T of ru.ozon.app.android.utils.lifecycle.ViewModelExtKt.vmFactory.<no name provided>.create");
                return calendarViewModel;
            }
        }).a(CalendarViewModel.class);
        Intrinsics.checkNotNullExpressionValue(a11, "viewModel(...)");
        return new PriceCalendarFooterV3WidgetViewHolder(container, component().getCustomActionHandlersStoreFactory(), priceCalendarFooterV3WidgetViewModel2, (CalendarViewModel) a11, new PlaceholderParser("content"), new NestedWidgetsManager(container, container.d0(), container.c0()), component().getPerformanceTrackerDelegate(), new MN.a(1));
    }

    @Override // c20.r, I00.d
    @NotNull
    public List<Class<PriceCalendarFooterV3Update>> getSupportedUpdates() {
        return this.supportedUpdates;
    }

    @Override // c20.r
    @NotNull
    public r.a getViewType() {
        return this.viewType;
    }

    @Override // ru.ozon.app.android.composer.widgets.v2.ViewMapper2
    @NotNull
    public C7473e<PriceCalendarFooterV3Component> widgetComponent(@NotNull C7475g storage) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        return PriceCalendarFooterV3Component.INSTANCE.create(storage);
    }

    @Override // c20.r, I00.d
    public PriceCalendarFooterV3VO handleUpdate(@NotNull a.J.InterfaceC0007a update, @NotNull PriceCalendarFooterV3VO oldItem) {
        Intrinsics.checkNotNullParameter(update, "update");
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        if (update instanceof PriceCalendarFooterV3Update) {
            return PriceCalendarFooterV3VO.copy$default(oldItem, 0L, null, ((PriceCalendarFooterV3Update) update).getNewContent(), 3, null);
        }
        return null;
    }

    @Override // m20.InterfaceC8046a
    @NotNull
    public List<PriceCalendarFooterV3VO> map(@NotNull PriceCalendarFooterV3DTO state, @NotNull d info) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(info, "info");
        return component().getMapper().invoke(state, info);
    }
}
