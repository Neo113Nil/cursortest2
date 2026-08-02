package ru.ozon.app.android.travel.feature.general.booking.widgets.additionalServices.view;

import Im.a;
import Sc.o;
import android.content.Context;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import gk0.q;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.general.booking.R$id;
import ru.ozon.app.android.travel.feature.general.booking.widgets.additionalServices.presentation.AdditionalServicesVO;
import ru.ozon.app.android.travel.feature.general.booking.widgets.additionalServices.presentation.cell.AdditionalServicesCellsAdapter;
import ru.ozon.app.android.travel.utils.RoundedBackgroundProducer;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.controls.buttonV3.ButtonV3View;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.v3.holders.controls.buttonV3.ButtonV3HolderKt;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;

@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\"\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u00160\u001aJ\u000e\u0010\u001c\u001a\u00020\u00162\u0006\u0010\u001d\u001a\u00020\u001eJ\b\u0010\u001f\u001a\u00020\u0016H\u0002J\b\u0010 \u001a\u00020\u0016H\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006!"}, d2 = {"Lru/ozon/app/android/travel/feature/general/booking/widgets/additionalServices/view/AdditionalServicesView;", "Landroid/widget/LinearLayout;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "dp2", "", "dp6", "dp8", "dp16", "dp24f", "", "backgroundColor", "titleTAV", "Lru/ozon/uni/android/atom/text/TextAtomV2View;", "subtitleTAV", "cellsRV", "Landroidx/recyclerview/widget/RecyclerView;", "showMoreButtonBV", "Lru/ozon/uni/android/controls/buttonV3/ButtonV3View;", "bindOrGone", "", "item", "Lru/ozon/app/android/travel/feature/general/booking/widgets/additionalServices/presentation/AdditionalServicesVO;", "actionHandler", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "setupCellsRecyclerView", "cellsAdapter", "Lru/ozon/app/android/travel/feature/general/booking/widgets/additionalServices/presentation/cell/AdditionalServicesCellsAdapter;", "setupRoot", "addViews", "booking_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class AdditionalServicesView extends LinearLayout {
    private final int backgroundColor;

    @NotNull
    private final RecyclerView cellsRV;
    private final int dp16;
    private final int dp2;
    private final float dp24f;
    private final int dp6;
    private final int dp8;

    @NotNull
    private final ButtonV3View showMoreButtonBV;

    @NotNull
    private final TextAtomV2View subtitleTAV;

    @NotNull
    private final TextAtomV2View titleTAV;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AdditionalServicesView(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        int px = ResourceExtKt.toPx(2, context);
        this.dp2 = px;
        int px2 = ResourceExtKt.toPx(6, context);
        this.dp6 = px2;
        int px3 = ResourceExtKt.toPx(8, context);
        this.dp8 = px3;
        int px4 = ResourceExtKt.toPx(16, context);
        this.dp16 = px4;
        this.dp24f = ResourceExtKt.toPxF(24, context);
        this.backgroundColor = ThemeExtKt.themeColor(context, R$attr.layerFloor1);
        q qVar = q.f64554a;
        TextAtomV2View textAtomV2View = (TextAtomV2View) qVar.g(N.b(TextAtomV2View.class), context);
        LinearLayout.LayoutParams a11 = a.a(textAtomV2View, R$id.additionalServicesTitleTAV, -1, -2);
        a11.setMargins(px4, px4, px4, 0);
        textAtomV2View.setLayoutParams(a11);
        textAtomV2View.setTextIsSelectable(false);
        this.titleTAV = textAtomV2View;
        TextAtomV2View textAtomV2View2 = (TextAtomV2View) qVar.g(N.b(TextAtomV2View.class), context);
        LinearLayout.LayoutParams a12 = a.a(textAtomV2View2, R$id.additionalServicesSubtitleTAV, -1, -2);
        a12.setMargins(px4, px, px4, 0);
        textAtomV2View2.setLayoutParams(a12);
        textAtomV2View2.setTextIsSelectable(false);
        this.subtitleTAV = textAtomV2View2;
        RecyclerView recyclerView = new RecyclerView(context);
        recyclerView.setId(R$id.additionalServicesCellsRV);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.topMargin = px3;
        recyclerView.setLayoutParams(layoutParams);
        recyclerView.setLayoutManager(new LinearLayoutManager(context));
        recyclerView.setNestedScrollingEnabled(false);
        this.cellsRV = recyclerView;
        ButtonV3View buttonV3View = (ButtonV3View) qVar.i(N.b(ButtonV3View.class), context);
        if (buttonV3View == null) {
            buttonV3View = new ButtonV3View(context, null, 0, 0, 14, null);
            buttonV3View.setId(R$id.additionalServicesShowMoreButtonBV);
            LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
            layoutParams2.setMargins(px4, px2, px4, 0);
            buttonV3View.setLayoutParams(layoutParams2);
        }
        this.showMoreButtonBV = buttonV3View;
        setupRoot();
        addViews();
    }

    private final void addViews() {
        addView(this.titleTAV);
        addView(this.subtitleTAV);
        addView(this.cellsRV);
        addView(this.showMoreButtonBV);
    }

    private final void setupRoot() {
        setBackground(new RoundedBackgroundProducer().produce(this.backgroundColor, this.dp24f));
        setOrientation(1);
    }

    public final void bindOrGone(@NotNull AdditionalServicesVO item, @NotNull Function1<? super AtomAction, Unit> actionHandler) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        AdditionalServicesVO.State state = item.getState();
        if (state instanceof AdditionalServicesVO.State.Initial) {
            setVisibility(8);
            return;
        }
        if (!(state instanceof AdditionalServicesVO.State.Loaded)) {
            throw new o();
        }
        AdditionalServicesVO.State.Loaded loaded = (AdditionalServicesVO.State.Loaded) state;
        TextHolderKt.bind$default(this.titleTAV, loaded.getTitle(), null, 2, null);
        TextHolderKt.bindOrGone$default(this.subtitleTAV, loaded.getSubtitle(), null, 2, null);
        ButtonV3HolderKt.bindOrGone(this.showMoreButtonBV, loaded.getShowMoreButton(), actionHandler);
        setPadding(0, 0, 0, this.showMoreButtonBV.getVisibility() == 0 ? this.dp16 : this.dp8);
        setVisibility(0);
    }

    public final void setupCellsRecyclerView(@NotNull AdditionalServicesCellsAdapter cellsAdapter) {
        Intrinsics.checkNotNullParameter(cellsAdapter, "cellsAdapter");
        this.cellsRV.setAdapter(cellsAdapter);
        this.cellsRV.setItemAnimator(null);
    }
}
