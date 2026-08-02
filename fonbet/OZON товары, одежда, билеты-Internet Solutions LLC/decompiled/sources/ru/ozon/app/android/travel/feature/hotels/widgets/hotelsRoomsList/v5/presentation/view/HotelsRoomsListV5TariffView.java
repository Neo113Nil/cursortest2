package ru.ozon.app.android.travel.feature.hotels.widgets.hotelsRoomsList.v5.presentation.view;

import Am.C2438a;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.Space;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import kotlin.reflect.m;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.hotels.R$id;
import ru.ozon.app.android.travel.feature.hotels.widgets.hotelsRoomsList.v5.presentation.rooms.TariffVO;
import ru.ozon.app.android.travel.feature.hotels.widgets.hotelsRoomsList.v5.presentation.rooms.adapters.services.HotelsRoomsListV5ServicesAdapter;
import ru.ozon.app.android.travel.feature.hotels.widgets.hotelsRoomsList.v5.presentation.rooms.adapters.services.HotelsRoomsListV5ServicesItemDecoration;
import ru.ozon.app.android.travel.molecules.dto.counterInput.v2.CounterInputV2DTO;
import ru.ozon.app.android.travel.molecules.utils.ShapeDrawableWithBorder;
import ru.ozon.app.android.travel.molecules.view.counterInput.v2.CounterInputV2View;
import ru.ozon.app.android.travel.molecules.view.counterInput.v2.CounterInputV2ViewKt;
import ru.ozon.app.android.travel.utils.delegate.PreCreationViewPoolDelegate;
import ru.ozon.uni.android.atom.badge.BadgeView;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.controls.buttonV3.ButtonV3View;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.v3.holders.controls.buttonV3.ButtonV3HolderKt;
import ru.ozon.uni.atoms.v3.holders.dsBadge.BadgeHolderKt;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;
import ru.ozon.uni.core.UniColors;

@Metadata(d1 = {"\u0000¬\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\r\u001a\u00020\b2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J9\u0010\u001a\u001a\u00020\b2\b\u0010\u0014\u001a\u0004\u0018\u00010\u00132\u0016\u0010\u0018\u001a\u0012\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\b0\u0015j\u0002`\u00172\u0006\u0010\u0019\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0015\u0010\u001e\u001a\u00020\b2\u0006\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b\u001e\u0010\u001fJ\u0015\u0010\"\u001a\u00020\b2\u0006\u0010!\u001a\u00020 ¢\u0006\u0004\b\"\u0010#R6\u0010$\u001a\u0016\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\b\u0018\u00010\u0015j\u0004\u0018\u0001`\u00178\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R$\u0010\u0018\u001a\u0012\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\b0\u0015j\u0002`\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010%R\u0014\u0010+\u001a\u00020*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0014\u0010-\u001a\u00020*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010,R\u0014\u0010.\u001a\u00020*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010,R\u0014\u0010/\u001a\u00020*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u0010,R\u0014\u00100\u001a\u00020*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u0010,R\u0014\u00101\u001a\u00020*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u0010,R\u0014\u00102\u001a\u00020*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u0010,R\u0014\u00104\u001a\u0002038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105R\u0014\u00106\u001a\u0002038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00105R\u0014\u00108\u001a\u0002078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00109R\u0014\u0010:\u001a\u00020*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010,R\u0014\u0010;\u001a\u00020*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010,R\u001b\u0010A\u001a\u00020<8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b=\u0010>\u001a\u0004\b?\u0010@R\u0014\u0010C\u001a\u00020B8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bC\u0010DR\u001b\u0010G\u001a\u00020<8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bE\u0010>\u001a\u0004\bF\u0010@R\u0014\u0010I\u001a\u00020H8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bI\u0010JR\u0014\u0010L\u001a\u00020K8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bL\u0010MR\u001b\u0010R\u001a\u00020N8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bO\u0010>\u001a\u0004\bP\u0010QR\u0014\u0010T\u001a\u00020S8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bT\u0010UR\u001b\u0010Z\u001a\u00020V8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bW\u0010>\u001a\u0004\bX\u0010YR\u0014\u0010\\\u001a\u00020[8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\\\u0010]¨\u0006^"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsRoomsList/v5/presentation/view/HotelsRoomsListV5TariffView;", "Landroid/widget/LinearLayout;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "", "isCompactWidth", "", "bindWidthParam", "(Z)V", "", "borderColor", "bindBorderColor", "(Ljava/lang/String;)V", "", "button", "bindActionButton", "(Ljava/lang/Object;)V", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "specialTariffBadge", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "Lru/ozon/app/android/action/BuildedActionHandler;", "onClickListener", "isSpecialBadgeHeight", "bindSpecialTariffBadge", "(Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;Lkotlin/jvm/functions/Function1;Z)V", "Landroidx/recyclerview/widget/RecyclerView$u;", "pool", "setRecyclerViewPool", "(Landroidx/recyclerview/widget/RecyclerView$u;)V", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsRoomsList/v5/presentation/rooms/TariffVO;", "item", "bind", "(Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsRoomsList/v5/presentation/rooms/TariffVO;)V", "onAction", "Lkotlin/jvm/functions/Function1;", "getOnAction", "()Lkotlin/jvm/functions/Function1;", "setOnAction", "(Lkotlin/jvm/functions/Function1;)V", "", "dp4", "I", "dp6", "dp8", "dp10", "dp16", "dp24", "dp36", "", "dp1f", "F", "dp16f", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsRoomsList/v5/presentation/rooms/adapters/services/HotelsRoomsListV5ServicesAdapter;", "serviceAdapter", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsRoomsList/v5/presentation/rooms/adapters/services/HotelsRoomsListV5ServicesAdapter;", "screenWidth", "compactCardWidth", "Lru/ozon/uni/android/atom/badge/BadgeView;", "hotelsRoomsListSpecialTariffBadgeBv$delegate", "Lru/ozon/app/android/travel/utils/delegate/PreCreationViewPoolDelegate;", "getHotelsRoomsListSpecialTariffBadgeBv", "()Lru/ozon/uni/android/atom/badge/BadgeView;", "hotelsRoomsListSpecialTariffBadgeBv", "Landroidx/recyclerview/widget/RecyclerView;", "hotelsRoomsListServicesRv", "Landroidx/recyclerview/widget/RecyclerView;", "hotelsRoomsListServiceBv$delegate", "getHotelsRoomsListServiceBv", "hotelsRoomsListServiceBv", "Landroid/widget/Space;", "hotelsRoomsListSpacer", "Landroid/widget/Space;", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsRoomsList/v5/presentation/view/PriceWithMilesViewGroup;", "hotelsRoomsListFl", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsRoomsList/v5/presentation/view/PriceWithMilesViewGroup;", "Lru/ozon/uni/android/controls/buttonV3/ButtonV3View;", "hotelsRoomsListButtonBv$delegate", "getHotelsRoomsListButtonBv", "()Lru/ozon/uni/android/controls/buttonV3/ButtonV3View;", "hotelsRoomsListButtonBv", "Lru/ozon/app/android/travel/molecules/view/counterInput/v2/CounterInputV2View;", "hotelsRoomsListCounterCiv", "Lru/ozon/app/android/travel/molecules/view/counterInput/v2/CounterInputV2View;", "Lru/ozon/uni/android/atom/text/TextAtomV2View;", "hotelsRoomsListRoomsAvailableTav$delegate", "getHotelsRoomsListRoomsAvailableTav", "()Lru/ozon/uni/android/atom/text/TextAtomV2View;", "hotelsRoomsListRoomsAvailableTav", "Lru/ozon/app/android/travel/molecules/utils/ShapeDrawableWithBorder;", "shapeDrawableWithBorder", "Lru/ozon/app/android/travel/molecules/utils/ShapeDrawableWithBorder;", "hotels_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class HotelsRoomsListV5TariffView extends LinearLayout {
    static final /* synthetic */ m<Object>[] $$delegatedProperties = {C2438a.c(HotelsRoomsListV5TariffView.class, "hotelsRoomsListSpecialTariffBadgeBv", "getHotelsRoomsListSpecialTariffBadgeBv()Lru/ozon/uni/android/atom/badge/BadgeView;", 0), C2438a.c(HotelsRoomsListV5TariffView.class, "hotelsRoomsListServiceBv", "getHotelsRoomsListServiceBv()Lru/ozon/uni/android/atom/badge/BadgeView;", 0), C2438a.c(HotelsRoomsListV5TariffView.class, "hotelsRoomsListButtonBv", "getHotelsRoomsListButtonBv()Lru/ozon/uni/android/controls/buttonV3/ButtonV3View;", 0), C2438a.c(HotelsRoomsListV5TariffView.class, "hotelsRoomsListRoomsAvailableTav", "getHotelsRoomsListRoomsAvailableTav()Lru/ozon/uni/android/atom/text/TextAtomV2View;", 0)};
    public static final int $stable = 8;
    private final int compactCardWidth;
    private final int dp10;
    private final int dp16;
    private final float dp16f;
    private final float dp1f;
    private final int dp24;
    private final int dp36;
    private final int dp4;
    private final int dp6;
    private final int dp8;

    /* renamed from: hotelsRoomsListButtonBv$delegate, reason: from kotlin metadata */
    @NotNull
    private final PreCreationViewPoolDelegate hotelsRoomsListButtonBv;

    @NotNull
    private final CounterInputV2View hotelsRoomsListCounterCiv;

    @NotNull
    private final PriceWithMilesViewGroup hotelsRoomsListFl;

    /* renamed from: hotelsRoomsListRoomsAvailableTav$delegate, reason: from kotlin metadata */
    @NotNull
    private final PreCreationViewPoolDelegate hotelsRoomsListRoomsAvailableTav;

    /* renamed from: hotelsRoomsListServiceBv$delegate, reason: from kotlin metadata */
    @NotNull
    private final PreCreationViewPoolDelegate hotelsRoomsListServiceBv;

    @NotNull
    private final RecyclerView hotelsRoomsListServicesRv;

    @NotNull
    private final Space hotelsRoomsListSpacer;

    /* renamed from: hotelsRoomsListSpecialTariffBadgeBv$delegate, reason: from kotlin metadata */
    @NotNull
    private final PreCreationViewPoolDelegate hotelsRoomsListSpecialTariffBadgeBv;
    private Function1<? super AtomAction, Unit> onAction;

    @NotNull
    private final Function1<AtomAction, Unit> onClickListener;
    private final int screenWidth;

    @NotNull
    private final HotelsRoomsListV5ServicesAdapter serviceAdapter;

    @NotNull
    private final ShapeDrawableWithBorder shapeDrawableWithBorder;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HotelsRoomsListV5TariffView(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.onClickListener = new HotelsRoomsListV5TariffView$onClickListener$1(this);
        this.dp4 = UiExtKt.toPx(4, context);
        int px = UiExtKt.toPx(6, context);
        this.dp6 = px;
        this.dp8 = UiExtKt.toPx(8, context);
        int px2 = UiExtKt.toPx(10, context);
        this.dp10 = px2;
        int px3 = UiExtKt.toPx(16, context);
        this.dp16 = px3;
        this.dp24 = UiExtKt.toPx(24, context);
        this.dp36 = UiExtKt.toPx(36, context);
        float pxF = ResourceExtKt.toPxF(1, context);
        this.dp1f = pxF;
        this.dp16f = ResourceExtKt.toPxF(16, context);
        HotelsRoomsListV5ServicesAdapter hotelsRoomsListV5ServicesAdapter = new HotelsRoomsListV5ServicesAdapter();
        this.serviceAdapter = hotelsRoomsListV5ServicesAdapter;
        int i11 = context.getResources().getConfiguration().smallestScreenWidthDp;
        this.screenWidth = i11;
        int i12 = (int) (i11 * 0.75f);
        this.compactCardWidth = UiExtKt.toPx(i12 < 280 ? 280 : i12, context);
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        this.hotelsRoomsListSpecialTariffBadgeBv = new PreCreationViewPoolDelegate(context2, N.b(BadgeView.class), new HotelsRoomsListV5TariffView$special$$inlined$preCreationViewPool$default$1(this), new HotelsRoomsListV5TariffView$special$$inlined$preCreationViewPool$default$2(this));
        RecyclerView recyclerView = new RecyclerView(context);
        recyclerView.setId(R$id.hotelsRoomsListV5ServicesRv);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.setMarginStart(px3);
        layoutParams.setMarginEnd(px3);
        recyclerView.setLayoutParams(layoutParams);
        recyclerView.setLayoutManager(new LinearLayoutManager(context));
        recyclerView.setNestedScrollingEnabled(false);
        recyclerView.setItemAnimator(null);
        recyclerView.setAdapter(hotelsRoomsListV5ServicesAdapter);
        recyclerView.addItemDecoration(new HotelsRoomsListV5ServicesItemDecoration(context));
        this.hotelsRoomsListServicesRv = recyclerView;
        Context context3 = getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
        this.hotelsRoomsListServiceBv = new PreCreationViewPoolDelegate(context3, N.b(BadgeView.class), new HotelsRoomsListV5TariffView$special$$inlined$preCreationViewPool$default$3(this), new HotelsRoomsListV5TariffView$special$$inlined$preCreationViewPool$default$4(this));
        Space space = new Space(context);
        space.setId(R$id.hotelsRoomsListV5Spacer);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, 0);
        layoutParams2.weight = 1.0f;
        space.setLayoutParams(layoutParams2);
        this.hotelsRoomsListSpacer = space;
        PriceWithMilesViewGroup priceWithMilesViewGroup = new PriceWithMilesViewGroup(context);
        priceWithMilesViewGroup.setId(R$id.hotelsRoomsListV5Fl);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams3.topMargin = px2;
        layoutParams3.setMarginStart(px3);
        layoutParams3.setMarginEnd(px3);
        layoutParams3.bottomMargin = px;
        priceWithMilesViewGroup.setLayoutParams(layoutParams3);
        this.hotelsRoomsListFl = priceWithMilesViewGroup;
        Context context4 = getContext();
        Intrinsics.checkNotNullExpressionValue(context4, "getContext(...)");
        this.hotelsRoomsListButtonBv = new PreCreationViewPoolDelegate(context4, N.b(ButtonV3View.class), new HotelsRoomsListV5TariffView$special$$inlined$preCreationViewPool$default$5(this), new HotelsRoomsListV5TariffView$special$$inlined$preCreationViewPool$default$6(this));
        CounterInputV2View counterInputV2View = new CounterInputV2View(context, null, 0, 6, null);
        counterInputV2View.setId(R$id.hotelsRoomsListV5CounterCiv);
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams4.setMarginStart(px3);
        layoutParams4.setMarginEnd(px3);
        counterInputV2View.setLayoutParams(layoutParams4);
        this.hotelsRoomsListCounterCiv = counterInputV2View;
        Context context5 = getContext();
        Intrinsics.checkNotNullExpressionValue(context5, "getContext(...)");
        this.hotelsRoomsListRoomsAvailableTav = new PreCreationViewPoolDelegate(context5, N.b(TextAtomV2View.class), new HotelsRoomsListV5TariffView$special$$inlined$preCreationViewPool$default$7(this), new HotelsRoomsListV5TariffView$special$$inlined$preCreationViewPool$default$8(this));
        Float valueOf = Float.valueOf(pxF);
        float[] fArr = new float[8];
        for (int i13 = 0; i13 < 8; i13++) {
            fArr[i13] = this.dp16f;
        }
        float[] fArr2 = new float[8];
        for (int i14 = 0; i14 < 8; i14++) {
            fArr2[i14] = this.dp16f;
        }
        this.shapeDrawableWithBorder = new ShapeDrawableWithBorder(context, valueOf, fArr, fArr2);
        setOrientation(1);
        addView(getHotelsRoomsListSpecialTariffBadgeBv());
        addView(this.hotelsRoomsListServicesRv);
        addView(getHotelsRoomsListServiceBv());
        addView(this.hotelsRoomsListSpacer);
        addView(this.hotelsRoomsListFl);
        addView(getHotelsRoomsListButtonBv());
        addView(this.hotelsRoomsListCounterCiv);
        addView(getHotelsRoomsListRoomsAvailableTav());
    }

    private final void bindActionButton(Object button) {
        ButtonV3HolderKt.bindOrGone(getHotelsRoomsListButtonBv(), button instanceof ButtonV3DTO ? (ButtonV3DTO) button : null, this.onClickListener);
        CounterInputV2ViewKt.bindOrGone(this.hotelsRoomsListCounterCiv, button instanceof CounterInputV2DTO ? (CounterInputV2DTO) button : null, this.onClickListener);
    }

    private final void bindBorderColor(String borderColor) {
        ShapeDrawableWithBorder shapeDrawableWithBorder = this.shapeDrawableWithBorder;
        if (borderColor == null) {
            borderColor = UniColors.GRAPHIC_NEUTRAL.getToken();
        }
        ShapeDrawableWithBorder.setBorderColor$default(shapeDrawableWithBorder, borderColor, 0, 2, null);
    }

    private final void bindSpecialTariffBadge(BadgeDTO specialTariffBadge, Function1<? super AtomAction, Unit> onClickListener, boolean isSpecialBadgeHeight) {
        BadgeHolderKt.bindOrGone(getHotelsRoomsListSpecialTariffBadgeBv(), specialTariffBadge, onClickListener);
        if (isSpecialBadgeHeight) {
            setBackground(new InsetDrawable((Drawable) this.shapeDrawableWithBorder, 0, this.dp8, 0, 0));
            setPadding(0, specialTariffBadge != null ? 0 : this.dp24, 0, this.dp16);
        } else {
            setBackground(new InsetDrawable((Drawable) this.shapeDrawableWithBorder, 0, 0, 0, 0));
            int i11 = this.dp16;
            setPadding(0, i11, 0, i11);
        }
    }

    private final void bindWidthParam(boolean isCompactWidth) {
        int i11 = isCompactWidth ? this.compactCardWidth : -1;
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams == null || layoutParams.width == i11) {
            return;
        }
        layoutParams.width = i11;
        setLayoutParams(layoutParams);
    }

    private final ButtonV3View getHotelsRoomsListButtonBv() {
        return (ButtonV3View) this.hotelsRoomsListButtonBv.getValue(this, $$delegatedProperties[2]);
    }

    private final TextAtomV2View getHotelsRoomsListRoomsAvailableTav() {
        return (TextAtomV2View) this.hotelsRoomsListRoomsAvailableTav.getValue(this, $$delegatedProperties[3]);
    }

    private final BadgeView getHotelsRoomsListServiceBv() {
        return (BadgeView) this.hotelsRoomsListServiceBv.getValue(this, $$delegatedProperties[1]);
    }

    private final BadgeView getHotelsRoomsListSpecialTariffBadgeBv() {
        return (BadgeView) this.hotelsRoomsListSpecialTariffBadgeBv.getValue(this, $$delegatedProperties[0]);
    }

    public final void bind(@NotNull TariffVO item) {
        Intrinsics.checkNotNullParameter(item, "item");
        this.serviceAdapter.setOnAction(this.onClickListener);
        bindSpecialTariffBadge(item.getSpecialTariffBadge(), this.onClickListener, item.getIsSpecialBadgeHeight());
        this.serviceAdapter.submitList(item.getServices());
        BadgeHolderKt.bindOrGone(getHotelsRoomsListServiceBv(), item.getServiceBadge(), this.onClickListener);
        this.hotelsRoomsListFl.bind(item.getPrice(), item.getBadge(), this.onClickListener);
        bindWidthParam(item.getIsCompactWidth());
        bindBorderColor(item.getBorderColor());
        bindActionButton(item.getActionButton());
        TextHolderKt.bindOrGone$default(getHotelsRoomsListRoomsAvailableTav(), item.getRoomsAvailable(), null, 2, null);
    }

    public final Function1<AtomAction, Unit> getOnAction() {
        return this.onAction;
    }

    public final void setOnAction(Function1<? super AtomAction, Unit> function1) {
        this.onAction = function1;
    }

    public final void setRecyclerViewPool(@NotNull RecyclerView.u pool) {
        Intrinsics.checkNotNullParameter(pool, "pool");
        this.hotelsRoomsListServicesRv.setRecycledViewPool(pool);
    }
}
