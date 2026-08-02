package ru.ozon.app.android.travel.feature.avia.shared.flightDetails;

import B3.D;
import WZ.l;
import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import androidx.lifecycle.J;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.favorites.data.favoritebutton.favoriteproduct.model.AnalyticData;
import ru.ozon.app.android.favorites.ui.favoritebutton.favoriteproduct.ui.delegate.ProductFavoriteDelegateProvider;
import ru.ozon.app.android.travel.feature.avia.shared.flightDetails.adapter.FlightDetailsAdapter;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J!\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u000b\u0010\fJS\u0010\u0019\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\r2\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\n0\u000f2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00142\u0010\b\u0002\u0010\u0018\u001a\n\u0018\u00010\u0016j\u0004\u0018\u0001`\u0017¢\u0006\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001c\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\u001f\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0018\u0010\"\u001a\u0004\u0018\u00010!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010#¨\u0006$"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/shared/flightDetails/FlightDetailsView;", "Landroidx/recyclerview/widget/RecyclerView;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Lru/ozon/app/android/travel/feature/avia/shared/flightDetails/FlightDetailsVO;", "item", "Lru/ozon/app/android/favorites/data/favoritebutton/favoriteproduct/model/AnalyticData;", "analyticData", "", "bind", "(Lru/ozon/app/android/travel/feature/avia/shared/flightDetails/FlightDetailsVO;Lru/ozon/app/android/favorites/data/favoritebutton/favoriteproduct/model/AnalyticData;)V", "Landroidx/lifecycle/J;", "lifecycleOwner", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "onAction", "Lru/ozon/app/android/favorites/ui/favoritebutton/favoriteproduct/ui/delegate/ProductFavoriteDelegateProvider;", "favoriteProductDelegateProvider", "Lru/ozon/app/android/composer/ComposerReferences;", "references", "LWZ/l;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedAnalytics;", "tokenizedAnalytics", "setupAdapter", "(Landroidx/lifecycle/J;Lkotlin/jvm/functions/Function1;Lru/ozon/app/android/favorites/ui/favoritebutton/favoriteproduct/ui/delegate/ProductFavoriteDelegateProvider;Lru/ozon/app/android/composer/ComposerReferences;LWZ/l;)V", "", "dpf16", "F", "Landroid/graphics/drawable/GradientDrawable;", "backgroundDrawable", "Landroid/graphics/drawable/GradientDrawable;", "Lru/ozon/app/android/travel/feature/avia/shared/flightDetails/adapter/FlightDetailsAdapter;", "listAdapter", "Lru/ozon/app/android/travel/feature/avia/shared/flightDetails/adapter/FlightDetailsAdapter;", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class FlightDetailsView extends RecyclerView {

    @NotNull
    private final GradientDrawable backgroundDrawable;
    private final float dpf16;
    private FlightDetailsAdapter listAdapter;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlightDetailsView(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.dpf16 = ResourceExtKt.toPxF(16, context);
        GradientDrawable b11 = D.b(0);
        b11.setColor(ThemeExtKt.themeColor(context, R$attr.layerFloor1));
        this.backgroundDrawable = b11;
        setAdapter(this.listAdapter);
        setLayoutManager(new LinearLayoutManager(context, 1, false));
        setBackground(b11);
    }

    public static /* synthetic */ void bind$default(FlightDetailsView flightDetailsView, FlightDetailsVO flightDetailsVO, AnalyticData analyticData, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            analyticData = null;
        }
        flightDetailsView.bind(flightDetailsVO, analyticData);
    }

    public static /* synthetic */ void setupAdapter$default(FlightDetailsView flightDetailsView, J j11, Function1 function1, ProductFavoriteDelegateProvider productFavoriteDelegateProvider, ComposerReferences composerReferences, l lVar, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            productFavoriteDelegateProvider = null;
        }
        if ((i11 & 8) != 0) {
            composerReferences = null;
        }
        if ((i11 & 16) != 0) {
            lVar = null;
        }
        flightDetailsView.setupAdapter(j11, function1, productFavoriteDelegateProvider, composerReferences, lVar);
    }

    public final void bind(@NotNull FlightDetailsVO item, AnalyticData analyticData) {
        Intrinsics.checkNotNullParameter(item, "item");
        FlightDetailsAdapter flightDetailsAdapter = this.listAdapter;
        if (flightDetailsAdapter != null) {
            flightDetailsAdapter.setAnalyticsData(analyticData);
        }
        FlightDetailsAdapter flightDetailsAdapter2 = this.listAdapter;
        if (flightDetailsAdapter2 != null) {
            flightDetailsAdapter2.submitList(item.getList());
        }
        float f7 = item.getAreTopCornersRounded() ? this.dpf16 : 0.0f;
        float f11 = item.getAreBottomCornersRounded() ? this.dpf16 : 0.0f;
        this.backgroundDrawable.setCornerRadii(new float[]{f7, f7, f7, f7, f11, f11, f11, f11});
    }

    public final void setupAdapter(@NotNull J lifecycleOwner, @NotNull Function1<? super AtomAction, Unit> onAction, ProductFavoriteDelegateProvider favoriteProductDelegateProvider, ComposerReferences references, l tokenizedAnalytics) {
        Intrinsics.checkNotNullParameter(lifecycleOwner, "lifecycleOwner");
        Intrinsics.checkNotNullParameter(onAction, "onAction");
        FlightDetailsAdapter flightDetailsAdapter = new FlightDetailsAdapter(lifecycleOwner, onAction, favoriteProductDelegateProvider, references, tokenizedAnalytics);
        this.listAdapter = flightDetailsAdapter;
        setAdapter(flightDetailsAdapter);
    }
}
