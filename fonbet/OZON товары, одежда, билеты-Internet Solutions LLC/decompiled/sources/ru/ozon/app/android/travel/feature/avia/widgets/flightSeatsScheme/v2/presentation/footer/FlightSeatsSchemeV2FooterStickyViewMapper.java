package ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v2.presentation.footer;

import A00.a;
import Pc.a;
import a00.h;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.InsetDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.lifecycle.w0;
import androidx.lifecycle.z0;
import c20.r;
import d20.AbstractC6065b;
import d20.InterfaceC6068e;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import l10.i;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.R$string;
import ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v2.data.FlightSeatsSchemeV2DTO;
import ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v2.di.FlightSeatsSchemeV2Component;
import ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v2.presentation.FlightSeatsSchemeV2VI;
import ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v2.presentation.FlightSeatsSchemeV2ViewModel;
import ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v2.presentation.footer.FlightSeatsSchemeV2FooterStickyViewMapper;
import ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v2.presentation.footer.view.FlightSeatsSchemeV2FooterBlockView;
import ru.ozon.app.android.uikit.text.StringProvider;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.core.UniColors;

@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ%\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00030\u00102\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J!\u0010\u0016\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001b\u0010\u001cR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001dR\u001a\u0010\u001f\u001a\u00020\u001e8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R&\u0010$\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030#0\u00108\u0016X\u0096\u0004¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'¨\u0006("}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v2/presentation/footer/FlightSeatsSchemeV2FooterStickyViewMapper;", "Lc20/r;", "Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v2/data/FlightSeatsSchemeV2DTO;", "Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v2/presentation/FlightSeatsSchemeV2VI;", "Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v2/di/FlightSeatsSchemeV2Component;", "component", "<init>", "(Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v2/di/FlightSeatsSchemeV2Component;)V", "Landroid/content/Context;", "context", "Landroid/graphics/drawable/Drawable;", "produceBackground", "(Landroid/content/Context;)Landroid/graphics/drawable/Drawable;", "state", "Ll20/d;", "info", "", "map", "(Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v2/data/FlightSeatsSchemeV2DTO;Ll20/d;)Ljava/util/List;", "LA00/a$J$a;", "update", "oldItem", "handleUpdate", "(LA00/a$J$a;Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v2/presentation/FlightSeatsSchemeV2VI;)Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v2/presentation/FlightSeatsSchemeV2VI;", "Ll10/i;", "container", "Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v2/presentation/footer/FlightSeatsSchemeV2FooterWidgetViewHolder;", "createHolder", "(Ll10/i;)Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v2/presentation/footer/FlightSeatsSchemeV2FooterWidgetViewHolder;", "Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v2/di/FlightSeatsSchemeV2Component;", "Lc20/r$a;", "viewType", "Lc20/r$a;", "getViewType", "()Lc20/r$a;", "Ljava/lang/Class;", "supportedUpdates", "Ljava/util/List;", "getSupportedUpdates", "()Ljava/util/List;", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class FlightSeatsSchemeV2FooterStickyViewMapper extends r<FlightSeatsSchemeV2DTO, FlightSeatsSchemeV2VI> {

    @NotNull
    private final FlightSeatsSchemeV2Component component;

    @NotNull
    private final List<Class<FlightSeatsSchemeV2VI>> supportedUpdates;

    @NotNull
    private final r.a viewType;

    public FlightSeatsSchemeV2FooterStickyViewMapper(@NotNull FlightSeatsSchemeV2Component component) {
        Intrinsics.checkNotNullParameter(component, "component");
        this.component = component;
        this.viewType = r.a.SINGLE;
        this.supportedUpdates = C7714v.a0(FlightSeatsSchemeV2VI.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final View createHolder$lambda$1(FlightSeatsSchemeV2FooterStickyViewMapper flightSeatsSchemeV2FooterStickyViewMapper, LinearLayout parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Context context = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        FlightSeatsSchemeV2FooterBlockView flightSeatsSchemeV2FooterBlockView = new FlightSeatsSchemeV2FooterBlockView(context);
        Context context2 = flightSeatsSchemeV2FooterBlockView.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        int px = ResourceExtKt.toPx(16, context2);
        Context context3 = flightSeatsSchemeV2FooterBlockView.getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
        int px2 = ResourceExtKt.toPx(8, context3);
        flightSeatsSchemeV2FooterBlockView.setTag(StringProvider.getString(R$string.common_tag_not_affect_offset));
        Context context4 = flightSeatsSchemeV2FooterBlockView.getContext();
        Intrinsics.checkNotNullExpressionValue(context4, "getContext(...)");
        flightSeatsSchemeV2FooterBlockView.setBackground(flightSeatsSchemeV2FooterStickyViewMapper.produceBackground(context4));
        flightSeatsSchemeV2FooterBlockView.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        flightSeatsSchemeV2FooterBlockView.setPadding(0, px, 0, px2);
        return flightSeatsSchemeV2FooterBlockView;
    }

    private final Drawable produceBackground(Context context) {
        float pxF = ResourceExtKt.toPxF(20, context);
        int px = ResourceExtKt.toPx(-2, context);
        int px2 = ResourceExtKt.toPx(1, context);
        int color = context.getColor(UniColors.GRAPHIC_STROKE_STICKY.getResId());
        int themeColor = ThemeExtKt.themeColor(context, R$attr.layerFloor1);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setColor(themeColor);
        gradientDrawable.setStroke(px2, color);
        gradientDrawable.setCornerRadii(new float[]{pxF, pxF, pxF, pxF, 0.0f, 0.0f, 0.0f, 0.0f});
        return new InsetDrawable((Drawable) gradientDrawable, px, 0, px, px);
    }

    @Override // c20.r, I00.d
    @NotNull
    public List<Class<FlightSeatsSchemeV2VI>> getSupportedUpdates() {
        return this.supportedUpdates;
    }

    @Override // c20.r
    @NotNull
    public r.a getViewType() {
        return this.viewType;
    }

    @Override // c20.r
    @NotNull
    public AbstractC6065b<FlightSeatsSchemeV2VI> createHolder(@NotNull i container) {
        Intrinsics.checkNotNullParameter(container, "container");
        h a02 = container.a0();
        final a<FlightSeatsSchemeV2ViewModel> viewModelProvider = this.component.getViewModelProvider();
        w0 a11 = new z0(a02.a(), new z0.c() { // from class: ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v2.presentation.footer.FlightSeatsSchemeV2FooterStickyViewMapper$createHolder$$inlined$viewModel$1
            @Override // androidx.lifecycle.z0.c, androidx.lifecycle.z0.b
            public <T extends w0> T create(Class<T> modelClass) {
                Intrinsics.checkNotNullParameter(modelClass, "modelClass");
                FlightSeatsSchemeV2ViewModel flightSeatsSchemeV2ViewModel = (FlightSeatsSchemeV2ViewModel) a.this.get();
                Intrinsics.g(flightSeatsSchemeV2ViewModel, "null cannot be cast to non-null type T of ru.ozon.app.android.utils.lifecycle.ViewModelExtKt.vmFactory.<no name provided>.create");
                return flightSeatsSchemeV2ViewModel;
            }
        }).a(FlightSeatsSchemeV2ViewModel.class);
        Intrinsics.checkNotNullExpressionValue(a11, "viewModel(...)");
        return new FlightSeatsSchemeV2FooterWidgetViewHolder(container, (FlightSeatsSchemeV2ViewModel) a11, this.component.getCustomActionHandlersStoreFactory(), new InterfaceC6068e() { // from class: SM.a
            @Override // d20.InterfaceC6068e
            public final View create(ViewGroup viewGroup) {
                View createHolder$lambda$1;
                createHolder$lambda$1 = FlightSeatsSchemeV2FooterStickyViewMapper.createHolder$lambda$1(FlightSeatsSchemeV2FooterStickyViewMapper.this, (LinearLayout) viewGroup);
                return createHolder$lambda$1;
            }
        });
    }

    @Override // c20.r, I00.d
    public FlightSeatsSchemeV2VI handleUpdate(@NotNull a.J.InterfaceC0007a update, @NotNull FlightSeatsSchemeV2VI oldItem) {
        Intrinsics.checkNotNullParameter(update, "update");
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        if (update instanceof FlightSeatsSchemeV2VI) {
            return (FlightSeatsSchemeV2VI) update;
        }
        return null;
    }

    @Override // m20.InterfaceC8046a
    @NotNull
    public List<FlightSeatsSchemeV2VI> map(@NotNull FlightSeatsSchemeV2DTO state, @NotNull d info) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(info, "info");
        return this.component.getFlightSeatsSchemeMapper().invoke(state, info);
    }
}
