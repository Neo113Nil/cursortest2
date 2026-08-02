package ru.ozon.app.android.travel.feature.hotels.map.widgets.hotelsPageMapPreview.v2.view;

import Am.C2438a;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import kotlin.reflect.m;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.partpayment.formpage.data.FormPageDTO;
import ru.ozon.app.android.travel.feature.hotels.map.widgets.hotelsPageMapPreview.v2.presentation.HotelsPageMapPreviewV2VO;
import ru.ozon.app.android.travel.utils.delegate.PreCreationViewPoolDelegate;
import ru.ozon.app.android.travel.utils.utils.RoundedOutlineProvider;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.mapsdk.OzonMapView;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.cell.CellView;
import ru.ozon.uni.android.controls.buttonV3.IconButtonV3View;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.android.uikit.extensions.view.LayoutExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.controls.button.IconButtonV3DTO;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;
import ru.ozon.uni.atoms.v3.holders.cell.CellHolderKt;
import ru.ozon.uni.atoms.v3.holders.controls.buttonV3.IconButtonV3HolderKt;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;

@Metadata(d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\u000b2\u0006\u0010#\u001a\u00020\u000bH\u0014J0\u0010$\u001a\u00020!2\u0006\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020\u000b2\u0006\u0010(\u001a\u00020\u000b2\u0006\u0010)\u001a\u00020\u000b2\u0006\u0010*\u001a\u00020\u000bH\u0014J\"\u0010+\u001a\u00020!2\u0006\u0010,\u001a\u00020-2\u0012\u0010.\u001a\u000e\u0012\u0004\u0012\u000200\u0012\u0004\u0012\u00020!0/J\u0010\u00101\u001a\u00020!2\u0006\u00102\u001a\u000203H\u0002J\u0010\u00104\u001a\u00020!2\u0006\u00105\u001a\u000203H\u0002J$\u00106\u001a\u00020!2\u0006\u00107\u001a\u0002082\u0012\u0010.\u001a\u000e\u0012\u0004\u0012\u000200\u0012\u0004\u0012\u00020!0/H\u0002J\u0016\u00109\u001a\u00020!2\f\u0010:\u001a\b\u0012\u0004\u0012\u00020<0;H\u0002J\u0010\u0010=\u001a\u00020>2\u0006\u0010?\u001a\u00020&H\u0002R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\u000e\u001a\u00020\u000f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0010\u0010\u0011R\u001b\u0010\u0014\u001a\u00020\u000f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0013\u001a\u0004\b\u0015\u0010\u0011R\u001b\u0010\u0017\u001a\u00020\u00188BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u0013\u001a\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001dX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001dX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006@"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsPageMapPreview/v2/view/MapPreviewV2View;", "Landroid/view/ViewGroup;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "map", "Lru/ozon/mapsdk/OzonMapView;", "getMap", "()Lru/ozon/mapsdk/OzonMapView;", "dp16", "", "dp8", "dp4", "titleTav", "Lru/ozon/uni/android/atom/text/TextAtomV2View;", "getTitleTav", "()Lru/ozon/uni/android/atom/text/TextAtomV2View;", "titleTav$delegate", "Lru/ozon/app/android/travel/utils/delegate/PreCreationViewPoolDelegate;", "addressTav", "getAddressTav", "addressTav$delegate", "copyIbv", "Lru/ozon/uni/android/controls/buttonV3/IconButtonV3View;", "getCopyIbv", "()Lru/ozon/uni/android/controls/buttonV3/IconButtonV3View;", "copyIbv$delegate", "pointsOfInterest", "", "Lru/ozon/uni/android/cell/CellView;", "cachedCellView", "onMeasure", "", "widthMeasureSpec", "heightMeasureSpec", "onLayout", "changed", "", "left", "top", "right", "bottom", "bind", "vo", "Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsPageMapPreview/v2/presentation/HotelsPageMapPreviewV2VO;", "onAction", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "bindTitle", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/text/TextDTO;", "bindAddress", FormPageDTO.Field.FIELD_TYPE_ADDRESS, "bindCopyButton", "copyButton", "Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "bindPointsOfInterest", "items", "", "Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "createPointViewLayoutParams", "Landroid/view/ViewGroup$LayoutParams;", "needBottomMargin", "map_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class MapPreviewV2View extends ViewGroup {
    static final /* synthetic */ m<Object>[] $$delegatedProperties = {C2438a.c(MapPreviewV2View.class, "titleTav", "getTitleTav()Lru/ozon/uni/android/atom/text/TextAtomV2View;", 0), C2438a.c(MapPreviewV2View.class, "addressTav", "getAddressTav()Lru/ozon/uni/android/atom/text/TextAtomV2View;", 0), C2438a.c(MapPreviewV2View.class, "copyIbv", "getCopyIbv()Lru/ozon/uni/android/controls/buttonV3/IconButtonV3View;", 0)};

    /* renamed from: addressTav$delegate, reason: from kotlin metadata */
    @NotNull
    private final PreCreationViewPoolDelegate addressTav;

    @NotNull
    private final List<CellView> cachedCellView;

    /* renamed from: copyIbv$delegate, reason: from kotlin metadata */
    @NotNull
    private final PreCreationViewPoolDelegate copyIbv;
    private final int dp16;
    private final int dp4;
    private final int dp8;

    @NotNull
    private final OzonMapView map;

    @NotNull
    private final List<CellView> pointsOfInterest;

    /* renamed from: titleTav$delegate, reason: from kotlin metadata */
    @NotNull
    private final PreCreationViewPoolDelegate titleTav;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MapPreviewV2View(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        OzonMapView ozonMapView = new OzonMapView(context, null, 6);
        ozonMapView.setLayoutParams(new ViewGroup.LayoutParams(-1, ResourceExtKt.toPx(92, context)));
        ozonMapView.setOutlineProvider(new RoundedOutlineProvider(ResourceExtKt.toPxF(8, context)));
        ozonMapView.setClipToOutline(true);
        this.map = ozonMapView;
        this.dp16 = ResourceExtKt.toPx(16, context);
        this.dp8 = ResourceExtKt.toPx(8, context);
        this.dp4 = ResourceExtKt.toPx(4, context);
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        this.titleTav = new PreCreationViewPoolDelegate(context2, N.b(TextAtomV2View.class), new MapPreviewV2View$special$$inlined$preCreationViewPool$default$1(this), new MapPreviewV2View$special$$inlined$preCreationViewPool$default$2());
        Context context3 = getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
        this.addressTav = new PreCreationViewPoolDelegate(context3, N.b(TextAtomV2View.class), new MapPreviewV2View$special$$inlined$preCreationViewPool$default$3(this), new MapPreviewV2View$special$$inlined$preCreationViewPool$default$4());
        Context context4 = getContext();
        Intrinsics.checkNotNullExpressionValue(context4, "getContext(...)");
        this.copyIbv = new PreCreationViewPoolDelegate(context4, N.b(IconButtonV3View.class), new MapPreviewV2View$special$$inlined$preCreationViewPool$default$5(this), new MapPreviewV2View$special$$inlined$preCreationViewPool$default$6());
        this.pointsOfInterest = new ArrayList();
        ArrayList arrayList = new ArrayList(3);
        for (int i11 = 0; i11 < 3; i11++) {
            Context context5 = getContext();
            Intrinsics.checkNotNullExpressionValue(context5, "getContext(...)");
            arrayList.add((CellView) new PreCreationViewPoolDelegate(context5, N.b(CellView.class), new MapPreviewV2View$cachedCellView$lambda$5$$inlined$preCreationViewPool$default$1(this), new MapPreviewV2View$cachedCellView$lambda$5$$inlined$preCreationViewPool$default$2()).getValue());
        }
        this.cachedCellView = arrayList;
        setBackgroundColor(ThemeExtKt.themeColor(context, R$attr.layerFloor1));
        int i12 = this.dp16;
        setPadding(i12, 0, i12, 0);
        addViewInLayout(getTitleTav(), -1, getTitleTav().getLayoutParams(), false);
        addViewInLayout(getAddressTav(), -1, getAddressTav().getLayoutParams(), false);
        addViewInLayout(getCopyIbv(), -1, getCopyIbv().getLayoutParams(), false);
        OzonMapView ozonMapView2 = this.map;
        addViewInLayout(ozonMapView2, -1, ozonMapView2.getLayoutParams(), false);
    }

    private final void bindAddress(TextDTO address) {
        TextHolderKt.bind$default(getAddressTav(), address, null, 2, null);
    }

    private final void bindCopyButton(IconButtonV3DTO copyButton, Function1<? super AtomAction, Unit> onAction) {
        IconButtonV3HolderKt.bind(getCopyIbv(), copyButton, onAction);
    }

    private final void bindPointsOfInterest(List<CellDTO> items) {
        for (CellView cellView : this.pointsOfInterest) {
            this.cachedCellView.add(cellView);
            removeView(cellView);
        }
        this.pointsOfInterest.clear();
        int i11 = 0;
        for (Object obj : items) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                C7714v.O0();
                throw null;
            }
            CellDTO cellDTO = (CellDTO) obj;
            CellView cellView2 = (CellView) C7714v.x0(this.cachedCellView);
            if (cellView2 == null) {
                Context context = getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                cellView2 = (CellView) new PreCreationViewPoolDelegate(context, N.b(CellView.class), new MapPreviewV2View$bindPointsOfInterest$lambda$11$$inlined$preCreationViewPool$default$1(this), new MapPreviewV2View$bindPointsOfInterest$lambda$11$$inlined$preCreationViewPool$default$2(this)).getValue();
            }
            cellView2.setLayoutParams(createPointViewLayoutParams(i11 != C7714v.P(items)));
            CellHolderKt.bind$default(cellView2, cellDTO, null, 2, null);
            this.pointsOfInterest.add(cellView2);
            addViewInLayout(cellView2, -1, cellView2.getLayoutParams(), false);
            i11 = i12;
        }
    }

    private final void bindTitle(TextDTO title) {
        TextHolderKt.bind$default(getTitleTav(), title, null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ViewGroup.LayoutParams createPointViewLayoutParams(boolean needBottomMargin) {
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-1, -2);
        if (needBottomMargin) {
            marginLayoutParams.bottomMargin = this.dp8;
        }
        return marginLayoutParams;
    }

    private final TextAtomV2View getAddressTav() {
        return (TextAtomV2View) this.addressTav.getValue(this, $$delegatedProperties[1]);
    }

    private final IconButtonV3View getCopyIbv() {
        return (IconButtonV3View) this.copyIbv.getValue(this, $$delegatedProperties[2]);
    }

    private final TextAtomV2View getTitleTav() {
        return (TextAtomV2View) this.titleTav.getValue(this, $$delegatedProperties[0]);
    }

    public final void bind(@NotNull HotelsPageMapPreviewV2VO vo, @NotNull Function1<? super AtomAction, Unit> onAction) {
        Intrinsics.checkNotNullParameter(vo, "vo");
        Intrinsics.checkNotNullParameter(onAction, "onAction");
        bindTitle(vo.getTitle());
        bindAddress(vo.getAddress());
        bindCopyButton(vo.getCopyButton(), onAction);
        bindPointsOfInterest(vo.getPointsOfInterests());
        requestLayout();
    }

    @NotNull
    public final OzonMapView getMap() {
        return this.map;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean changed, int left, int top, int right, int bottom) {
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        LayoutExtKt.layoutLeftTop(getTitleTav(), paddingLeft, paddingTop);
        int measuredHeight = getTitleTav().getMeasuredHeight() + this.dp4 + paddingTop;
        LayoutExtKt.layoutLeftTop(getAddressTav(), paddingLeft, measuredHeight);
        LayoutExtKt.layoutRightTop(getCopyIbv(), getMeasuredWidth() - getPaddingRight(), ((getAddressTav().getMeasuredHeight() - getCopyIbv().getMeasuredHeight()) / 2) + measuredHeight);
        int measuredHeight2 = getAddressTav().getMeasuredHeight() + this.dp8 + measuredHeight;
        LayoutExtKt.layoutLeftTop(this.map, paddingLeft, measuredHeight2);
        int measuredHeight3 = this.map.getMeasuredHeight() + this.dp16 + measuredHeight2;
        int i11 = 0;
        for (Object obj : this.pointsOfInterest) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                C7714v.O0();
                throw null;
            }
            CellView cellView = (CellView) obj;
            LayoutExtKt.layoutLeftTop(cellView, paddingLeft, measuredHeight3);
            if (i11 != C7714v.P(this.pointsOfInterest)) {
                int measuredHeight4 = cellView.getMeasuredHeight();
                ViewGroup.LayoutParams layoutParams = cellView.getLayoutParams();
                ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
                measuredHeight3 = measuredHeight4 + (marginLayoutParams != null ? marginLayoutParams.bottomMargin : 0) + measuredHeight3;
            }
            i11 = i12;
        }
    }

    @Override // android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        measureChild(getTitleTav(), widthMeasureSpec, heightMeasureSpec);
        measureChild(getCopyIbv(), widthMeasureSpec, heightMeasureSpec);
        measureChild(getAddressTav(), View.MeasureSpec.makeMeasureSpec((View.MeasureSpec.getSize(widthMeasureSpec) - getCopyIbv().getMeasuredWidth()) - this.dp16, LinearLayoutManager.INVALID_OFFSET), heightMeasureSpec);
        measureChild(this.map, widthMeasureSpec, heightMeasureSpec);
        int i11 = 0;
        int i12 = 0;
        for (Object obj : this.pointsOfInterest) {
            int i13 = i12 + 1;
            if (i12 < 0) {
                C7714v.O0();
                throw null;
            }
            CellView cellView = (CellView) obj;
            measureChild(cellView, widthMeasureSpec, heightMeasureSpec);
            int measuredHeight = cellView.getMeasuredHeight();
            ViewGroup.LayoutParams layoutParams = cellView.getLayoutParams();
            ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
            i11 += measuredHeight + (marginLayoutParams != null ? marginLayoutParams.bottomMargin : 0);
            i12 = i13;
        }
        setMeasuredDimension(widthMeasureSpec, View.MeasureSpec.makeMeasureSpec(this.map.getMeasuredHeight() + Math.max(getCopyIbv().getMeasuredHeight(), getAddressTav().getMeasuredHeight()) + getTitleTav().getMeasuredHeight() + this.dp4 + this.dp8 + this.dp16 + i11, 1073741824));
    }
}
