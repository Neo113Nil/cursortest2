package ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v2.presentation.header;

import A00.a;
import VM.a;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import c20.r;
import d20.AbstractC6065b;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import l10.i;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v2.data.FlightSeatsSchemeV2DTO;
import ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v2.di.FlightSeatsSchemeV2Component;
import ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v2.presentation.FlightSeatsSchemeV2VI;
import ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v2.presentation.header.view.FlightSeatsSchemeV2HeaderBlockView;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J%\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00030\u000b2\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rJ\u001d\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00030\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J!\u0010\u0016\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0018R\u001a\u0010\u001a\u001a\u00020\u00198\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR&\u0010\u001f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u001e0\u000b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"¨\u0006#"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v2/presentation/header/FlightSeatsSchemeV2HeaderBlockStickyViewMapper;", "Lc20/r;", "Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v2/data/FlightSeatsSchemeV2DTO;", "Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v2/presentation/FlightSeatsSchemeV2VI;", "Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v2/di/FlightSeatsSchemeV2Component;", "component", "<init>", "(Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v2/di/FlightSeatsSchemeV2Component;)V", "state", "Ll20/d;", "info", "", "map", "(Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v2/data/FlightSeatsSchemeV2DTO;Ll20/d;)Ljava/util/List;", "Ll10/i;", "container", "Ld20/b;", "createHolder", "(Ll10/i;)Ld20/b;", "LA00/a$J$a;", "update", "oldItem", "handleUpdate", "(LA00/a$J$a;Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v2/presentation/FlightSeatsSchemeV2VI;)Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v2/presentation/FlightSeatsSchemeV2VI;", "Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v2/di/FlightSeatsSchemeV2Component;", "Lc20/r$a;", "viewType", "Lc20/r$a;", "getViewType", "()Lc20/r$a;", "Ljava/lang/Class;", "supportedUpdates", "Ljava/util/List;", "getSupportedUpdates", "()Ljava/util/List;", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class FlightSeatsSchemeV2HeaderBlockStickyViewMapper extends r<FlightSeatsSchemeV2DTO, FlightSeatsSchemeV2VI> {

    @NotNull
    private final FlightSeatsSchemeV2Component component;

    @NotNull
    private final List<Class<FlightSeatsSchemeV2VI>> supportedUpdates;

    @NotNull
    private final r.a viewType;

    public FlightSeatsSchemeV2HeaderBlockStickyViewMapper(@NotNull FlightSeatsSchemeV2Component component) {
        Intrinsics.checkNotNullParameter(component, "component");
        this.component = component;
        this.viewType = r.a.SINGLE;
        this.supportedUpdates = C7714v.a0(FlightSeatsSchemeV2VI.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final View createHolder$lambda$1(LinearLayout parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Context context = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        FlightSeatsSchemeV2HeaderBlockView flightSeatsSchemeV2HeaderBlockView = new FlightSeatsSchemeV2HeaderBlockView(context);
        flightSeatsSchemeV2HeaderBlockView.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        return flightSeatsSchemeV2HeaderBlockView;
    }

    @Override // c20.r
    @NotNull
    public AbstractC6065b<FlightSeatsSchemeV2VI> createHolder(@NotNull i container) {
        Intrinsics.checkNotNullParameter(container, "container");
        return new FlightSeatsSchemeV2HeaderBlockWidgetViewHolder(container, new a());
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
