package ru.ozon.app.android.travel.feature.general.services.widgets.infoPopup.v4.presentation;

import Am.C2438a;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.GradientDrawable;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import gk0.q;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import kotlin.reflect.m;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.molecules.view.copyInput.CopyInputView;
import ru.ozon.app.android.travel.molecules.view.textInfoCells.TextInfoCellsView;
import ru.ozon.app.android.travel.utils.delegate.PreCreationViewPoolDelegate;
import ru.ozon.uni.android.atom.badge.BadgeView;
import ru.ozon.uni.android.atom.image.Image;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikitsdk.ext.ViewExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.af.AtomsAdapter;
import ru.ozon.uni.atoms.af.layout.VerticalAtomsLayout;
import ru.ozon.uni.atoms.utils.ContainerExtKt;
import ru.ozon.uni.atoms.v3.containers.SingleAtom;
import ru.ozon.uni.atoms.v3.holders.dsBadge.BadgeHolderKt;
import ru.ozon.uni.atoms.v3.holders.image.ImageHolderKt;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;
import ru.ozon.uni.core.UniColors;

@Metadata(d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0000\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J&\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020+2\u0016\u0010,\u001a\u0012\u0012\u0004\u0012\u00020.\u0012\u0004\u0012\u00020)0-j\u0002`/J\b\u00100\u001a\u00020)H\u0002J\b\u00101\u001a\u00020)H\u0002J\b\u00102\u001a\u00020)H\u0002J\u001a\u00103\u001a\u00020)2\b\u00104\u001a\u0004\u0018\u0001052\u0006\u00106\u001a\u000207H\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\f\u001a\u00020\r8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u000e\u0010\u000fR\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\u0014\u001a\u00020\u00158BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0018\u0010\u0011\u001a\u0004\b\u0016\u0010\u0017R\u000e\u0010\u0019\u001a\u00020\u001aX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u001cX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u001eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020 X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\"X\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010#\u001a\u00020$8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b'\u0010\u0011\u001a\u0004\b%\u0010&¨\u00068"}, d2 = {"Lru/ozon/app/android/travel/feature/general/services/widgets/infoPopup/v4/presentation/InfoPopupV4View;", "Landroid/widget/LinearLayout;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "dp4", "", "dp6", "dp8", "dp10", "defaultMargin", "itemImage", "Lru/ozon/uni/android/atom/image/Image;", "getItemImage", "()Lru/ozon/uni/android/atom/image/Image;", "itemImage$delegate", "Lru/ozon/app/android/travel/utils/delegate/PreCreationViewPoolDelegate;", "textCellsView", "Lru/ozon/app/android/travel/molecules/view/textInfoCells/TextInfoCellsView;", "cellLabel", "Lru/ozon/uni/android/atom/text/TextAtomV2View;", "getCellLabel", "()Lru/ozon/uni/android/atom/text/TextAtomV2View;", "cellLabel$delegate", "layoutShape", "Landroid/graphics/drawable/GradientDrawable;", "cellsAdapter", "Lru/ozon/uni/atoms/af/AtomsAdapter;", "cellsView", "Lru/ozon/uni/atoms/af/layout/VerticalAtomsLayout;", "notionCell", "Lru/ozon/uni/atoms/v3/containers/SingleAtom;", "copyInput", "Lru/ozon/app/android/travel/molecules/view/copyInput/CopyInputView;", "badge", "Lru/ozon/uni/android/atom/badge/BadgeView;", "getBadge", "()Lru/ozon/uni/android/atom/badge/BadgeView;", "badge$delegate", "bind", "", "item", "Lru/ozon/app/android/travel/feature/general/services/widgets/infoPopup/v4/presentation/InfoPopupV4VO;", "actionHandler", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "Lru/ozon/app/android/action/BuildedActionHandler;", "addViews", "expandBadgeClickArea", "clearExpandedBadgeClickArea", "constructLayout", "backgroundColor", "", "radius", "", "services_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class InfoPopupV4View extends LinearLayout {
    static final /* synthetic */ m<Object>[] $$delegatedProperties = {C2438a.c(InfoPopupV4View.class, "itemImage", "getItemImage()Lru/ozon/uni/android/atom/image/Image;", 0), C2438a.c(InfoPopupV4View.class, "cellLabel", "getCellLabel()Lru/ozon/uni/android/atom/text/TextAtomV2View;", 0), C2438a.c(InfoPopupV4View.class, "badge", "getBadge()Lru/ozon/uni/android/atom/badge/BadgeView;", 0)};
    public static final int $stable = 8;

    /* renamed from: badge$delegate, reason: from kotlin metadata */
    @NotNull
    private final PreCreationViewPoolDelegate badge;

    /* renamed from: cellLabel$delegate, reason: from kotlin metadata */
    @NotNull
    private final PreCreationViewPoolDelegate cellLabel;

    @NotNull
    private final AtomsAdapter cellsAdapter;

    @NotNull
    private final VerticalAtomsLayout cellsView;

    @NotNull
    private final CopyInputView copyInput;
    private final int defaultMargin;
    private final int dp10;
    private final int dp4;
    private final int dp6;
    private final int dp8;

    /* renamed from: itemImage$delegate, reason: from kotlin metadata */
    @NotNull
    private final PreCreationViewPoolDelegate itemImage;

    @NotNull
    private final GradientDrawable layoutShape;

    @NotNull
    private final SingleAtom notionCell;

    @NotNull
    private final TextInfoCellsView textCellsView;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InfoPopupV4View(@NotNull Context context) {
        super(context);
        int i11;
        Intrinsics.checkNotNullParameter(context, "context");
        int px = ResourceExtKt.toPx(4, context);
        this.dp4 = px;
        this.dp6 = ResourceExtKt.toPx(6, context);
        int px2 = ResourceExtKt.toPx(8, context);
        this.dp8 = px2;
        this.dp10 = ResourceExtKt.toPx(10, context);
        int px3 = ResourceExtKt.toPx(16, context);
        this.defaultMargin = px3;
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        this.itemImage = new PreCreationViewPoolDelegate(context2, N.b(Image.class), new InfoPopupV4View$special$$inlined$preCreationViewPool$default$1(this), new InfoPopupV4View$special$$inlined$preCreationViewPool$default$2(this));
        TextInfoCellsView textInfoCellsView = new TextInfoCellsView(context, null, 0, 6, null);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.setMargins(px3, 0, px3, 0);
        textInfoCellsView.setLayoutParams(layoutParams);
        textInfoCellsView.setNestedScrollingEnabled(false);
        this.textCellsView = textInfoCellsView;
        Context context3 = getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
        this.cellLabel = new PreCreationViewPoolDelegate(context3, N.b(TextAtomV2View.class), new InfoPopupV4View$special$$inlined$preCreationViewPool$default$3(this), new InfoPopupV4View$special$$inlined$preCreationViewPool$default$4(this));
        GradientDrawable gradientDrawable = new GradientDrawable();
        this.layoutShape = gradientDrawable;
        AtomsAdapter atomsAdapter = new AtomsAdapter(null, null, null, null, 15, null);
        this.cellsAdapter = atomsAdapter;
        VerticalAtomsLayout verticalAtomsLayout = new VerticalAtomsLayout(context, null, 0, 6, null);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams2.setMargins(px3, px, px3, 0);
        verticalAtomsLayout.setLayoutParams(layoutParams2);
        verticalAtomsLayout.setClipToOutline(true);
        verticalAtomsLayout.setAdapter(atomsAdapter);
        verticalAtomsLayout.setBackground(gradientDrawable);
        this.cellsView = verticalAtomsLayout;
        SingleAtom singleAtom = (SingleAtom) q.f64554a.i(N.b(SingleAtom.class), context);
        if (singleAtom == null) {
            i11 = 1;
            singleAtom = new SingleAtom(context, null, 0, 0, 14, null);
        } else {
            i11 = 1;
        }
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams3.setMargins(px3, px2, px3, 0);
        singleAtom.setLayoutParams(layoutParams3);
        this.notionCell = singleAtom;
        CopyInputView copyInputView = new CopyInputView(context);
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams4.setMargins(px3, px2, px3, 0);
        copyInputView.setLayoutParams(layoutParams4);
        this.copyInput = copyInputView;
        Context context4 = getContext();
        Intrinsics.checkNotNullExpressionValue(context4, "getContext(...)");
        this.badge = new PreCreationViewPoolDelegate(context4, N.b(BadgeView.class), new InfoPopupV4View$special$$inlined$preCreationViewPool$default$5(this), new InfoPopupV4View$special$$inlined$preCreationViewPool$default$6(this));
        setOrientation(i11);
        addViews();
    }

    private final void addViews() {
        addView(getItemImage());
        addView(this.textCellsView);
        addView(getCellLabel());
        addView(this.cellsView);
        addView(this.notionCell);
        addView(this.copyInput);
        addView(getBadge());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void clearExpandedBadgeClickArea() {
        setTouchDelegate(null);
    }

    private final void constructLayout(String backgroundColor, float radius) {
        GradientDrawable gradientDrawable = this.layoutShape;
        gradientDrawable.setCornerRadius(radius);
        StyleParser styleParser = StyleParser.INSTANCE;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        gradientDrawable.setColor(styleParser.parseColor(context, backgroundColor, UniColors.CLEAR_LIGHT_KEY_0.getResId()));
    }

    private final void expandBadgeClickArea() {
        if (!isLaidOut() || isLayoutRequested()) {
            addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: ru.ozon.app.android.travel.feature.general.services.widgets.infoPopup.v4.presentation.InfoPopupV4View$expandBadgeClickArea$$inlined$doOnLayout$1
                @Override // android.view.View.OnLayoutChangeListener
                public void onLayoutChange(@NotNull View view, int left, int top, int right, int bottom, int oldLeft, int oldTop, int oldRight, int oldBottom) {
                    view.removeOnLayoutChangeListener(this);
                    Rect rect = new Rect();
                    InfoPopupV4View.this.getBadge().getHitRect(rect);
                    Context context = InfoPopupV4View.this.getContext();
                    Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                    int px = ResourceExtKt.toPx(36, context);
                    if (px <= rect.height()) {
                        InfoPopupV4View.this.clearExpandedBadgeClickArea();
                    } else {
                        rect.inset(0, (rect.height() - px) / 2);
                        InfoPopupV4View.this.setTouchDelegate(new TouchDelegate(rect, InfoPopupV4View.this.getBadge()));
                    }
                }
            });
            return;
        }
        Rect rect = new Rect();
        getBadge().getHitRect(rect);
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        int px = ResourceExtKt.toPx(36, context);
        if (px <= rect.height()) {
            clearExpandedBadgeClickArea();
        } else {
            rect.inset(0, (rect.height() - px) / 2);
            setTouchDelegate(new TouchDelegate(rect, getBadge()));
        }
    }

    private final TextAtomV2View getCellLabel() {
        return (TextAtomV2View) this.cellLabel.getValue(this, $$delegatedProperties[1]);
    }

    private final Image getItemImage() {
        return (Image) this.itemImage.getValue(this, $$delegatedProperties[0]);
    }

    public final void bind(@NotNull InfoPopupV4VO item, @NotNull Function1<? super AtomAction, Unit> actionHandler) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        ImageHolderKt.bindOrGone$default(getItemImage(), item.getImageInfo(), null, 2, null);
        this.textCellsView.bindOrGone(item.getTextCells(), actionHandler);
        TextHolderKt.bindOrGone$default(getCellLabel(), item.getCellBlock().getLabel(), null, 2, null);
        AtomsAdapter atomsAdapter = this.cellsAdapter;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        atomsAdapter.bind(context, item.getCellBlock().getCells());
        if (item.getAreCellBlockVisible()) {
            constructLayout(item.getCellBlock().getBackgroundColor(), item.getCellBlock().getRadius());
            this.cellsAdapter.setOnAction(actionHandler);
            ViewExtKt.show(this.cellsView);
            int i11 = item.getCellBlock().getLabel() == null ? this.defaultMargin : this.dp4;
            ViewGroup.LayoutParams layoutParams = this.cellsView.getLayoutParams();
            ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
            if (marginLayoutParams == null || marginLayoutParams.topMargin != i11) {
                VerticalAtomsLayout verticalAtomsLayout = this.cellsView;
                ViewGroup.LayoutParams layoutParams2 = verticalAtomsLayout.getLayoutParams();
                if (layoutParams2 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                }
                ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
                marginLayoutParams2.topMargin = i11;
                verticalAtomsLayout.setLayoutParams(marginLayoutParams2);
            }
        } else {
            ViewExtKt.gone(this.cellsView);
        }
        ContainerExtKt.bindOrGone$default(this.notionCell, item.getNote(), false, 2, null);
        this.copyInput.bindOrGone(item.getCopyInput(), actionHandler);
        if (item.getDetailsLinkBadge() != null) {
            BadgeHolderKt.bind(getBadge(), item.getDetailsLinkBadge(), actionHandler);
            expandBadgeClickArea();
        } else {
            ViewExtKt.gone(getBadge());
            clearExpandedBadgeClickArea();
        }
    }

    @NotNull
    public final BadgeView getBadge() {
        return (BadgeView) this.badge.getValue(this, $$delegatedProperties[2]);
    }
}
