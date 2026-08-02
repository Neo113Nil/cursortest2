package ru.ozon.app.android.travel.feature.general.main.widgets.priceCalendarHeader.v3.presentation;

import A00.a;
import MQ.a;
import a00.h;
import a00.j;
import android.view.View;
import android.widget.LinearLayout;
import androidx.lifecycle.w0;
import c20.r;
import java.util.List;
import k20.C7473e;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import l10.i;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.widgets.v2.overlay.OverlayWidgetScreenViewItemMapper2;
import ru.ozon.app.android.travel.calendar.viewModel.CalendarViewModel;
import ru.ozon.app.android.travel.feature.general.main.R$layout;
import ru.ozon.app.android.travel.feature.general.main.widgets.priceCalendarHeader.v3.data.PriceCalendarHeaderV3DTO;
import ru.ozon.app.android.travel.feature.general.main.widgets.priceCalendarHeader.v3.di.PriceCalendarHeaderV3Component;
import ru.ozon.uni.android.uikit.extensions.view.ViewGroupExtKt;

@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006J!\u0010\n\u001a\u0004\u0018\u00010\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J%\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00040\u00142\u0006\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J!\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00020\u001a2\n\u0010\u0019\u001a\u00060\u0017j\u0002`\u0018H\u0016¢\u0006\u0004\b\u001b\u0010\u001cR\u001a\u0010\u001e\u001a\u00020\u001d8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R&\u0010$\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020#0\"0\u00148\u0016X\u0096\u0004¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'¨\u0006("}, d2 = {"Lru/ozon/app/android/travel/feature/general/main/widgets/priceCalendarHeader/v3/presentation/PriceCalendarHeaderV3OverlayViewMapper;", "Lru/ozon/app/android/composer/widgets/v2/overlay/OverlayWidgetScreenViewItemMapper2;", "Lru/ozon/app/android/travel/feature/general/main/widgets/priceCalendarHeader/v3/di/PriceCalendarHeaderV3Component;", "Lru/ozon/app/android/travel/feature/general/main/widgets/priceCalendarHeader/v3/data/PriceCalendarHeaderV3DTO;", "Lru/ozon/app/android/travel/feature/general/main/widgets/priceCalendarHeader/v3/presentation/PriceCalendarHeaderV3VO;", "<init>", "()V", "LA00/a$J$a;", "update", "oldItem", "handleUpdate", "(LA00/a$J$a;Lru/ozon/app/android/travel/feature/general/main/widgets/priceCalendarHeader/v3/presentation/PriceCalendarHeaderV3VO;)Lru/ozon/app/android/travel/feature/general/main/widgets/priceCalendarHeader/v3/presentation/PriceCalendarHeaderV3VO;", "Ll10/i;", "container", "Lru/ozon/app/android/travel/feature/general/main/widgets/priceCalendarHeader/v3/presentation/PriceCalendarHeaderV3WidgetViewHolder;", "createHolder", "(Ll10/i;)Lru/ozon/app/android/travel/feature/general/main/widgets/priceCalendarHeader/v3/presentation/PriceCalendarHeaderV3WidgetViewHolder;", "state", "Ll20/d;", "info", "", "map", "(Lru/ozon/app/android/travel/feature/general/main/widgets/priceCalendarHeader/v3/data/PriceCalendarHeaderV3DTO;Ll20/d;)Ljava/util/List;", "Lk20/g;", "Lru/ozon/app/android/composer/widgets/v2/di/ComposerWidgetComponentStorage;", "storage", "Lk20/e;", "widgetComponent", "(Lk20/g;)Lk20/e;", "Lc20/r$a;", "viewType", "Lc20/r$a;", "getViewType", "()Lc20/r$a;", "Ljava/lang/Class;", "Lru/ozon/app/android/travel/feature/general/main/widgets/priceCalendarHeader/v3/presentation/PriceCalendarHeaderV3Update;", "supportedUpdates", "Ljava/util/List;", "getSupportedUpdates", "()Ljava/util/List;", "main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class PriceCalendarHeaderV3OverlayViewMapper extends OverlayWidgetScreenViewItemMapper2<PriceCalendarHeaderV3Component, PriceCalendarHeaderV3DTO, PriceCalendarHeaderV3VO> {

    @NotNull
    private final r.a viewType = r.a.SINGLE;

    @NotNull
    private final List<Class<PriceCalendarHeaderV3Update>> supportedUpdates = C7714v.a0(PriceCalendarHeaderV3Update.class);

    /* JADX INFO: Access modifiers changed from: private */
    public static final View createHolder$lambda$0(LinearLayout parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        return ViewGroupExtKt.inflate(parent, R$layout.widget_price_calendar_header_v3);
    }

    @Override // c20.r, I00.d
    @NotNull
    public List<Class<PriceCalendarHeaderV3Update>> getSupportedUpdates() {
        return this.supportedUpdates;
    }

    @Override // c20.r
    @NotNull
    public r.a getViewType() {
        return this.viewType;
    }

    @Override // ru.ozon.app.android.composer.widgets.v2.ViewMapper2
    @NotNull
    public C7473e<PriceCalendarHeaderV3Component> widgetComponent(@NotNull C7475g storage) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        return PriceCalendarHeaderV3Component.INSTANCE.create(storage);
    }

    @Override // c20.r
    @NotNull
    public PriceCalendarHeaderV3WidgetViewHolder createHolder(@NotNull i container) {
        Intrinsics.checkNotNullParameter(container, "container");
        PriceCalendarHeaderV3WidgetViewModel priceCalendarHeaderV3WidgetViewModel = component().getWidgetViewModelProvider().get();
        Intrinsics.checkNotNullExpressionValue(priceCalendarHeaderV3WidgetViewModel, "get(...)");
        h a02 = container.a0();
        return new PriceCalendarHeaderV3WidgetViewHolder(container, priceCalendarHeaderV3WidgetViewModel, (CalendarViewModel) ((w0) j.a(a02.a(), N.b(CalendarViewModel.class), new PriceCalendarHeaderV3OverlayViewMapper$createHolder$1(this)).getValue()), new a(1));
    }

    @Override // c20.r, I00.d
    public PriceCalendarHeaderV3VO handleUpdate(@NotNull a.J.InterfaceC0007a update, @NotNull PriceCalendarHeaderV3VO oldItem) {
        Intrinsics.checkNotNullParameter(update, "update");
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        if (update instanceof PriceCalendarHeaderV3Update) {
            return PriceCalendarHeaderV3VO.copy$default(oldItem, 0L, null, ((PriceCalendarHeaderV3Update) update).getNewContent(), 3, null);
        }
        return null;
    }

    @Override // m20.InterfaceC8046a
    @NotNull
    public List<PriceCalendarHeaderV3VO> map(@NotNull PriceCalendarHeaderV3DTO state, @NotNull d info) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(info, "info");
        return component().getMapper().invoke(state, info);
    }
}
