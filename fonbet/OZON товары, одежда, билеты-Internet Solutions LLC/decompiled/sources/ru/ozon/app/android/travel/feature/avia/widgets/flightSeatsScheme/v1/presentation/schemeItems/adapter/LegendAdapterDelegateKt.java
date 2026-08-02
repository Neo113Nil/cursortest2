package ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v1.presentation.schemeItems.adapter;

import android.content.Context;
import android.util.TypedValue;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.R;
import ru.ozon.app.android.adapterdelegates.AdapterDelegate;
import ru.ozon.app.android.adapterdelegates.dsl.DslViewBindingListAdapterDelegate;
import ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v1.presentation.schemeItems.FlightSeatsSchemeItem;
import ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v1.presentation.schemeItems.view.LegendView;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000*\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a(\u0010\u0000\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u00012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005H\u0000\u001a\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0002¨\u0006\f"}, d2 = {"legendAdapterDelegate", "Lru/ozon/app/android/adapterdelegates/AdapterDelegate;", "", "Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v1/presentation/schemeItems/FlightSeatsSchemeItem;", "onAction", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "createLegendView", "Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v1/presentation/schemeItems/view/LegendView;", "context", "Landroid/content/Context;", "avia_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class LegendAdapterDelegateKt {
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final LegendView createLegendView(Context context) {
        LegendView legendView = new LegendView(context, null, 2, 0 == true ? 1 : 0);
        legendView.setLayoutParams(new RecyclerView.p(-1, -2));
        int px = ResourceExtKt.toPx(16, context);
        legendView.setPadding(px, px, px, px);
        legendView.setBackgroundColor(ThemeExtKt.themeColor(context, R$attr.layerFloor1));
        legendView.setClipToOutline(true);
        legendView.setOutlineProvider(new RoundedOutlineProvider(ResourceExtKt.toPxF(20, context)));
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.selectableItemBackground, typedValue, true);
        legendView.setForeground(androidx.core.content.a.getDrawable(context, typedValue.resourceId));
        return legendView;
    }

    @NotNull
    public static final AdapterDelegate<List<FlightSeatsSchemeItem>> legendAdapterDelegate(@NotNull Function1<? super AtomAction, Unit> onAction) {
        Intrinsics.checkNotNullParameter(onAction, "onAction");
        return new DslViewBindingListAdapterDelegate(LegendAdapterDelegateKt$legendAdapterDelegate$1.INSTANCE, LegendAdapterDelegateKt$legendAdapterDelegate$$inlined$adapterDelegateViewBinding$default$1.INSTANCE, new LegendAdapterDelegateKt$legendAdapterDelegate$2(onAction), LegendAdapterDelegateKt$legendAdapterDelegate$$inlined$adapterDelegateViewBinding$default$2.INSTANCE);
    }
}
