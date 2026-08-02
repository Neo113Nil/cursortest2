package ru.ozon.app.android.travel.feature.tours.widgets.toursSorting.presentation;

import OT.a;
import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import c20.r;
import d20.AbstractC6065b;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import l10.i;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.tours.widgets.toursSorting.data.ToursSortingDTO;
import ru.ozon.app.android.travel.feature.tours.widgets.toursSorting.di.ToursSortingComponent;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u0000 \u00192\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0019B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J%\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00030\u000b2\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rJ\u001d\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00030\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0013R\u001a\u0010\u0015\u001a\u00020\u00148\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001a"}, d2 = {"Lru/ozon/app/android/travel/feature/tours/widgets/toursSorting/presentation/ToursSortingViewMapper;", "Lc20/r;", "Lru/ozon/app/android/travel/feature/tours/widgets/toursSorting/data/ToursSortingDTO;", "Lru/ozon/app/android/travel/feature/tours/widgets/toursSorting/presentation/ToursSortingVO;", "Lru/ozon/app/android/travel/feature/tours/widgets/toursSorting/di/ToursSortingComponent;", "component", "<init>", "(Lru/ozon/app/android/travel/feature/tours/widgets/toursSorting/di/ToursSortingComponent;)V", "state", "Ll20/d;", "info", "", "map", "(Lru/ozon/app/android/travel/feature/tours/widgets/toursSorting/data/ToursSortingDTO;Ll20/d;)Ljava/util/List;", "Ll10/i;", "container", "Ld20/b;", "createHolder", "(Ll10/i;)Ld20/b;", "Lru/ozon/app/android/travel/feature/tours/widgets/toursSorting/di/ToursSortingComponent;", "Lc20/r$a;", "viewType", "Lc20/r$a;", "getViewType", "()Lc20/r$a;", "Companion", "tours_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ToursSortingViewMapper extends r<ToursSortingDTO, ToursSortingVO> {

    @NotNull
    private final ToursSortingComponent component;

    @NotNull
    private final r.a viewType;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/travel/feature/tours/widgets/toursSorting/presentation/ToursSortingViewMapper$Companion;", "", "<init>", "()V", "VERTICAL_PADDING", "", "tours_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public ToursSortingViewMapper(@NotNull ToursSortingComponent component) {
        Intrinsics.checkNotNullParameter(component, "component");
        this.component = component;
        this.viewType = r.a.SINGLE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final View createHolder$lambda$1(i iVar, LinearLayout it) {
        Intrinsics.checkNotNullParameter(it, "it");
        Context L11 = iVar.L();
        Intrinsics.checkNotNullExpressionValue(L11, "<get-context>(...)");
        ToursSortingView toursSortingView = new ToursSortingView(L11);
        toursSortingView.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        Context context = toursSortingView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        toursSortingView.setPadding(toursSortingView.getPaddingLeft(), ResourceExtKt.toPx(8, context), toursSortingView.getPaddingRight(), toursSortingView.getPaddingBottom());
        return toursSortingView;
    }

    @Override // c20.r
    @NotNull
    public AbstractC6065b<ToursSortingVO> createHolder(@NotNull i container) {
        Intrinsics.checkNotNullParameter(container, "container");
        return new ToursSortingWidgetViewHolder(container, new a(1, container));
    }

    @Override // c20.r
    @NotNull
    public r.a getViewType() {
        return this.viewType;
    }

    @Override // m20.InterfaceC8046a
    @NotNull
    public List<ToursSortingVO> map(@NotNull ToursSortingDTO state, @NotNull d info) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(info, "info");
        return this.component.getMapper().invoke(state, info);
    }
}
