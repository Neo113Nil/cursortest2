package ru.ozon.app.android.product.skuthinscroll.presentation;

import B0.C2454a;
import G.g;
import Kk.C3532b;
import WZ.t;
import android.os.Parcelable;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.account.adult.presenter.AdultVO;
import ru.ozon.app.android.favorites.data.favoritebutton.favoriteproduct.FavoriteProductMolecule;
import ru.ozon.app.android.product.skuthinscroll.data.SkuThinScrollHeaderDTO;
import ru.ozon.app.android.product.skuthinscroll.data.SkuThinScrollItemDTO;
import ru.ozon.app.android.product.skuthinscroll.data.SkuThinScrollWidth;
import ru.ozon.app.android.product.tileContentItems.vo.TileContentItem;
import ru.ozon.app.android.ugc.core.widgets.commentsListV3.data.CommentV3DTO;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.TestInfo;
import ru.ozon.uni.atoms.data.controls.button.IconButtonV3DTO;
import ru.ozon.uni.atoms.data.icon.IconDTO;

@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001b\b\u0086\b\u0018\u00002\u00060\u0001j\u0002`\u0002:\u00017BW\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\u000e\u0010\u0012\u001a\n\u0018\u00010\u0010j\u0004\u0018\u0001`\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bHÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010 \u001a\u0004\b!\u0010\"R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010#\u001a\u0004\b$\u0010%R\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006¢\u0006\f\n\u0004\b\t\u0010&\u001a\u0004\b'\u0010(R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010)\u001a\u0004\b*\u0010+R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\r\u0010,\u001a\u0004\b-\u0010.R$\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010/\u001a\u0004\b0\u00101\"\u0004\b2\u00103R\u001f\u0010\u0012\u001a\n\u0018\u00010\u0010j\u0004\u0018\u0001`\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u00104\u001a\u0004\b5\u00106¨\u00068"}, d2 = {"Lru/ozon/app/android/product/skuthinscroll/presentation/SkuThinScrollVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "Lru/ozon/app/android/product/skuthinscroll/data/SkuThinScrollHeaderDTO;", CommentV3DTO.HEADER_FIELD_NAME, "", "Lru/ozon/app/android/product/skuthinscroll/presentation/SkuThinScrollVO$ItemVO;", "items", "Lru/ozon/uni/atoms/data/TestInfo;", "testInfo", "Lru/ozon/app/android/product/skuthinscroll/data/SkuThinScrollWidth;", "width", "Landroid/os/Parcelable;", "layoutManagerState", "LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "tokenizedEvent", "<init>", "(JLru/ozon/app/android/product/skuthinscroll/data/SkuThinScrollHeaderDTO;Ljava/util/List;Lru/ozon/uni/atoms/data/TestInfo;Lru/ozon/app/android/product/skuthinscroll/data/SkuThinScrollWidth;Landroid/os/Parcelable;LWZ/t;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/app/android/product/skuthinscroll/data/SkuThinScrollHeaderDTO;", "getHeader", "()Lru/ozon/app/android/product/skuthinscroll/data/SkuThinScrollHeaderDTO;", "Ljava/util/List;", "getItems", "()Ljava/util/List;", "Lru/ozon/uni/atoms/data/TestInfo;", "getTestInfo", "()Lru/ozon/uni/atoms/data/TestInfo;", "Lru/ozon/app/android/product/skuthinscroll/data/SkuThinScrollWidth;", "getWidth", "()Lru/ozon/app/android/product/skuthinscroll/data/SkuThinScrollWidth;", "Landroid/os/Parcelable;", "getLayoutManagerState", "()Landroid/os/Parcelable;", "setLayoutManagerState", "(Landroid/os/Parcelable;)V", "LWZ/t;", "getTokenizedEvent", "()LWZ/t;", "ItemVO", "product_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class SkuThinScrollVO implements l20.c {
    private final SkuThinScrollHeaderDTO header;
    private final long id;

    @NotNull
    private final List<ItemVO> items;
    private Parcelable layoutManagerState;
    private final TestInfo testInfo;
    private final t tokenizedEvent;
    private final SkuThinScrollWidth width;

    public SkuThinScrollVO(long j11, SkuThinScrollHeaderDTO skuThinScrollHeaderDTO, @NotNull List<ItemVO> items, TestInfo testInfo, SkuThinScrollWidth skuThinScrollWidth, Parcelable parcelable, t tVar) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.id = j11;
        this.header = skuThinScrollHeaderDTO;
        this.items = items;
        this.testInfo = testInfo;
        this.width = skuThinScrollWidth;
        this.layoutManagerState = parcelable;
        this.tokenizedEvent = tVar;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SkuThinScrollVO)) {
            return false;
        }
        SkuThinScrollVO skuThinScrollVO = (SkuThinScrollVO) other;
        return this.id == skuThinScrollVO.id && Intrinsics.d(this.header, skuThinScrollVO.header) && Intrinsics.d(this.items, skuThinScrollVO.items) && Intrinsics.d(this.testInfo, skuThinScrollVO.testInfo) && this.width == skuThinScrollVO.width && Intrinsics.d(this.layoutManagerState, skuThinScrollVO.layoutManagerState) && Intrinsics.d(this.tokenizedEvent, skuThinScrollVO.tokenizedEvent);
    }

    public final SkuThinScrollHeaderDTO getHeader() {
        return this.header;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    @NotNull
    public final List<ItemVO> getItems() {
        return this.items;
    }

    public final Parcelable getLayoutManagerState() {
        return this.layoutManagerState;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    public final TestInfo getTestInfo() {
        return this.testInfo;
    }

    public final t getTokenizedEvent() {
        return this.tokenizedEvent;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        int hashCode = Long.hashCode(this.id) * 31;
        SkuThinScrollHeaderDTO skuThinScrollHeaderDTO = this.header;
        int b11 = g.b((hashCode + (skuThinScrollHeaderDTO == null ? 0 : skuThinScrollHeaderDTO.hashCode())) * 31, 31, this.items);
        TestInfo testInfo = this.testInfo;
        int hashCode2 = (b11 + (testInfo == null ? 0 : testInfo.hashCode())) * 31;
        SkuThinScrollWidth skuThinScrollWidth = this.width;
        int hashCode3 = (hashCode2 + (skuThinScrollWidth == null ? 0 : skuThinScrollWidth.hashCode())) * 31;
        Parcelable parcelable = this.layoutManagerState;
        int hashCode4 = (hashCode3 + (parcelable == null ? 0 : parcelable.hashCode())) * 31;
        t tVar = this.tokenizedEvent;
        return hashCode4 + (tVar != null ? tVar.hashCode() : 0);
    }

    public final void setLayoutManagerState(Parcelable parcelable) {
        this.layoutManagerState = parcelable;
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        SkuThinScrollHeaderDTO skuThinScrollHeaderDTO = this.header;
        List<ItemVO> list = this.items;
        TestInfo testInfo = this.testInfo;
        SkuThinScrollWidth skuThinScrollWidth = this.width;
        Parcelable parcelable = this.layoutManagerState;
        t tVar = this.tokenizedEvent;
        StringBuilder sb2 = new StringBuilder("SkuThinScrollVO(id=");
        sb2.append(j11);
        sb2.append(", header=");
        sb2.append(skuThinScrollHeaderDTO);
        sb2.append(", items=");
        sb2.append(list);
        sb2.append(", testInfo=");
        sb2.append(testInfo);
        sb2.append(", width=");
        sb2.append(skuThinScrollWidth);
        sb2.append(", layoutManagerState=");
        sb2.append(parcelable);
        return Lh.a.b(sb2, ", tokenizedEvent=", tVar, ")");
    }

    public /* synthetic */ SkuThinScrollVO(long j11, SkuThinScrollHeaderDTO skuThinScrollHeaderDTO, List list, TestInfo testInfo, SkuThinScrollWidth skuThinScrollWidth, Parcelable parcelable, t tVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(j11, skuThinScrollHeaderDTO, list, testInfo, skuThinScrollWidth, (i11 & 32) != 0 ? null : parcelable, tVar);
    }

    @Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b&\b\u0086\b\u0018\u0000 E2\u00020\u0001:\u0002EFB\u0083\u0001\u0012\u000e\u0010\u0004\u001a\n\u0018\u00010\u0002j\u0004\u0018\u0001`\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\u0006\u0010\u0017\u001a\u00020\f\u0012\b\b\u0002\u0010\u0018\u001a\u00020\f¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001f\u001a\u00020\u001eHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010#\u001a\u00020\f2\b\u0010\"\u001a\u0004\u0018\u00010!HÖ\u0003¢\u0006\u0004\b#\u0010$R\u001f\u0010\u0004\u001a\n\u0018\u00010\u0002j\u0004\u0018\u0001`\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010%\u001a\u0004\b&\u0010'R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010(\u001a\u0004\b)\u0010*R\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006¢\u0006\f\n\u0004\b\t\u0010+\u001a\u0004\b,\u0010-R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010.\u001a\u0004\b/\u00100R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u00101\u001a\u0004\b2\u00103R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u00104\u001a\u0004\b5\u00106R\u0017\u0010\u0011\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u00107\u001a\u0004\b8\u00109R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0012\u0010(\u001a\u0004\b:\u0010*R\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010;\u001a\u0004\b<\u0010=R\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0006¢\u0006\f\n\u0004\b\u0016\u0010>\u001a\u0004\b?\u0010@R\"\u0010\u0017\u001a\u00020\f8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0017\u00101\u001a\u0004\bA\u00103\"\u0004\bB\u0010CR\"\u0010\u0018\u001a\u00020\f8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0018\u00101\u001a\u0004\b\u0018\u00103\"\u0004\bD\u0010C¨\u0006G"}, d2 = {"Lru/ozon/app/android/product/skuthinscroll/presentation/SkuThinScrollVO$ItemVO;", "Lru/ozon/app/android/account/adult/presenter/AdultVO;", "LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "tokenizedEvent", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "icon", "", "Lru/ozon/app/android/product/tileContentItems/vo/TileContentItem;", "stateElements", "Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "button", "", "showBorder", "Lru/ozon/uni/atoms/af/AtomAction;", "action", "Lru/ozon/app/android/product/skuthinscroll/data/SkuThinScrollWidth;", "width", "blurPlaceholderImage", "Lru/ozon/app/android/product/skuthinscroll/data/SkuThinScrollItemDTO$AddToCartButton;", "addToCartButton", "", "productId", "shouldBlur", FavoriteProductMolecule.IS_ADULT_PARAMS_NAME, "<init>", "(LWZ/t;Lru/ozon/uni/atoms/data/icon/IconDTO;Ljava/util/List;Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;ZLru/ozon/uni/atoms/af/AtomAction;Lru/ozon/app/android/product/skuthinscroll/data/SkuThinScrollWidth;Lru/ozon/uni/atoms/data/icon/IconDTO;Lru/ozon/app/android/product/skuthinscroll/data/SkuThinScrollItemDTO$AddToCartButton;Ljava/lang/Long;ZZ)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "LWZ/t;", "getTokenizedEvent", "()LWZ/t;", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "getIcon", "()Lru/ozon/uni/atoms/data/icon/IconDTO;", "Ljava/util/List;", "getStateElements", "()Ljava/util/List;", "Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "getButton", "()Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "Z", "getShowBorder", "()Z", "Lru/ozon/uni/atoms/af/AtomAction;", "getAction", "()Lru/ozon/uni/atoms/af/AtomAction;", "Lru/ozon/app/android/product/skuthinscroll/data/SkuThinScrollWidth;", "getWidth", "()Lru/ozon/app/android/product/skuthinscroll/data/SkuThinScrollWidth;", "getBlurPlaceholderImage", "Lru/ozon/app/android/product/skuthinscroll/data/SkuThinScrollItemDTO$AddToCartButton;", "getAddToCartButton", "()Lru/ozon/app/android/product/skuthinscroll/data/SkuThinScrollItemDTO$AddToCartButton;", "Ljava/lang/Long;", "getProductId", "()Ljava/lang/Long;", "getShouldBlur", "setShouldBlur", "(Z)V", "setAdult", "Companion", "ActionParams", "product_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ItemVO implements AdultVO {
        private final AtomAction action;
        private final SkuThinScrollItemDTO.AddToCartButton addToCartButton;
        private final IconDTO blurPlaceholderImage;
        private final IconButtonV3DTO button;
        private final IconDTO icon;
        private boolean isAdult;
        private final Long productId;
        private boolean shouldBlur;
        private final boolean showBorder;

        @NotNull
        private final List<TileContentItem> stateElements;
        private final t tokenizedEvent;

        @NotNull
        private final SkuThinScrollWidth width;

        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\f\b\u0080\b\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0015\u001a\u0004\b\u0016\u0010\rR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001b"}, d2 = {"Lru/ozon/app/android/product/skuthinscroll/presentation/SkuThinScrollVO$ItemVO$ActionParams;", "", "", "sku", "", "quantity", "selectedDeliverySchema", "<init>", "(JILjava/lang/Long;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getSku", "()J", "I", "getQuantity", "Ljava/lang/Long;", "getSelectedDeliverySchema", "()Ljava/lang/Long;", "Companion", "product_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class ActionParams {

            /* renamed from: Companion, reason: from kotlin metadata */
            @NotNull
            public static final Companion INSTANCE = new Companion(null);
            private final int quantity;
            private final Long selectedDeliverySchema;
            private final long sku;

            @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001e\u0010\b\u001a\u0004\u0018\u00010\t2\u0014\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u000bR\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lru/ozon/app/android/product/skuthinscroll/presentation/SkuThinScrollVO$ItemVO$ActionParams$Companion;", "", "<init>", "()V", "SKU_KEY", "", "QUANTITY_KEY", "SELECTED_DELIVERY_SCHEMA_KEY", "safeValueOf", "Lru/ozon/app/android/product/skuthinscroll/presentation/SkuThinScrollVO$ItemVO$ActionParams;", "params", "", "product_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
            public static final class Companion {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public final ActionParams safeValueOf(Map<String, String> params) {
                    String str;
                    Long y02;
                    Integer w02;
                    if (params == null || (str = params.get("sku")) == null || (y02 = h.y0(str)) == null) {
                        return null;
                    }
                    long longValue = y02.longValue();
                    String str2 = params.get("quantity");
                    int intValue = (str2 == null || (w02 = h.w0(str2)) == null) ? 0 : w02.intValue();
                    String str3 = params.get("selectedDeliverySchema");
                    return new ActionParams(longValue, intValue, str3 != null ? h.y0(str3) : null);
                }

                private Companion() {
                }
            }

            public ActionParams(long j11, int i11, Long l11) {
                this.sku = j11;
                this.quantity = i11;
                this.selectedDeliverySchema = l11;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof ActionParams)) {
                    return false;
                }
                ActionParams actionParams = (ActionParams) other;
                return this.sku == actionParams.sku && this.quantity == actionParams.quantity && Intrinsics.d(this.selectedDeliverySchema, actionParams.selectedDeliverySchema);
            }

            public final int getQuantity() {
                return this.quantity;
            }

            public final Long getSelectedDeliverySchema() {
                return this.selectedDeliverySchema;
            }

            public final long getSku() {
                return this.sku;
            }

            public int hashCode() {
                int a11 = C2454a.a(this.quantity, Long.hashCode(this.sku) * 31, 31);
                Long l11 = this.selectedDeliverySchema;
                return a11 + (l11 == null ? 0 : l11.hashCode());
            }

            @NotNull
            public String toString() {
                long j11 = this.sku;
                int i11 = this.quantity;
                Long l11 = this.selectedDeliverySchema;
                StringBuilder b11 = Ql.c.b(j11, "ActionParams(sku=", i11, ", quantity=");
                b11.append(", selectedDeliverySchema=");
                b11.append(l11);
                b11.append(")");
                return b11.toString();
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public ItemVO(t tVar, IconDTO iconDTO, @NotNull List<? extends TileContentItem> stateElements, IconButtonV3DTO iconButtonV3DTO, boolean z11, AtomAction atomAction, @NotNull SkuThinScrollWidth width, IconDTO iconDTO2, SkuThinScrollItemDTO.AddToCartButton addToCartButton, Long l11, boolean z12, boolean z13) {
            Intrinsics.checkNotNullParameter(stateElements, "stateElements");
            Intrinsics.checkNotNullParameter(width, "width");
            this.tokenizedEvent = tVar;
            this.icon = iconDTO;
            this.stateElements = stateElements;
            this.button = iconButtonV3DTO;
            this.showBorder = z11;
            this.action = atomAction;
            this.width = width;
            this.blurPlaceholderImage = iconDTO2;
            this.addToCartButton = addToCartButton;
            this.productId = l11;
            this.shouldBlur = z12;
            this.isAdult = z13;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ItemVO)) {
                return false;
            }
            ItemVO itemVO = (ItemVO) other;
            return Intrinsics.d(this.tokenizedEvent, itemVO.tokenizedEvent) && Intrinsics.d(this.icon, itemVO.icon) && Intrinsics.d(this.stateElements, itemVO.stateElements) && Intrinsics.d(this.button, itemVO.button) && this.showBorder == itemVO.showBorder && Intrinsics.d(this.action, itemVO.action) && this.width == itemVO.width && Intrinsics.d(this.blurPlaceholderImage, itemVO.blurPlaceholderImage) && Intrinsics.d(this.addToCartButton, itemVO.addToCartButton) && Intrinsics.d(this.productId, itemVO.productId) && this.shouldBlur == itemVO.shouldBlur && this.isAdult == itemVO.isAdult;
        }

        public final AtomAction getAction() {
            return this.action;
        }

        public final SkuThinScrollItemDTO.AddToCartButton getAddToCartButton() {
            return this.addToCartButton;
        }

        public final IconDTO getBlurPlaceholderImage() {
            return this.blurPlaceholderImage;
        }

        public final IconButtonV3DTO getButton() {
            return this.button;
        }

        public final IconDTO getIcon() {
            return this.icon;
        }

        public final Long getProductId() {
            return this.productId;
        }

        public boolean getShouldBlur() {
            return this.shouldBlur;
        }

        public final boolean getShowBorder() {
            return this.showBorder;
        }

        @NotNull
        public final List<TileContentItem> getStateElements() {
            return this.stateElements;
        }

        public final t getTokenizedEvent() {
            return this.tokenizedEvent;
        }

        @NotNull
        public final SkuThinScrollWidth getWidth() {
            return this.width;
        }

        public int hashCode() {
            t tVar = this.tokenizedEvent;
            int hashCode = (tVar == null ? 0 : tVar.hashCode()) * 31;
            IconDTO iconDTO = this.icon;
            int b11 = g.b((hashCode + (iconDTO == null ? 0 : iconDTO.hashCode())) * 31, 31, this.stateElements);
            IconButtonV3DTO iconButtonV3DTO = this.button;
            int a11 = C3532b.a((b11 + (iconButtonV3DTO == null ? 0 : iconButtonV3DTO.hashCode())) * 31, 31, this.showBorder);
            AtomAction atomAction = this.action;
            int hashCode2 = (this.width.hashCode() + ((a11 + (atomAction == null ? 0 : atomAction.hashCode())) * 31)) * 31;
            IconDTO iconDTO2 = this.blurPlaceholderImage;
            int hashCode3 = (hashCode2 + (iconDTO2 == null ? 0 : iconDTO2.hashCode())) * 31;
            SkuThinScrollItemDTO.AddToCartButton addToCartButton = this.addToCartButton;
            int hashCode4 = (hashCode3 + (addToCartButton == null ? 0 : addToCartButton.hashCode())) * 31;
            Long l11 = this.productId;
            return Boolean.hashCode(this.isAdult) + C3532b.a((hashCode4 + (l11 != null ? l11.hashCode() : 0)) * 31, 31, this.shouldBlur);
        }

        @Override // ru.ozon.app.android.account.adult.presenter.AdultVO
        /* renamed from: isAdult, reason: from getter */
        public boolean getIsAdult() {
            return this.isAdult;
        }

        @Override // ru.ozon.app.android.account.adult.presenter.AdultVO
        public void setShouldBlur(boolean z11) {
            this.shouldBlur = z11;
        }

        @NotNull
        public String toString() {
            return "ItemVO(tokenizedEvent=" + this.tokenizedEvent + ", icon=" + this.icon + ", stateElements=" + this.stateElements + ", button=" + this.button + ", showBorder=" + this.showBorder + ", action=" + this.action + ", width=" + this.width + ", blurPlaceholderImage=" + this.blurPlaceholderImage + ", addToCartButton=" + this.addToCartButton + ", productId=" + this.productId + ", shouldBlur=" + this.shouldBlur + ", isAdult=" + this.isAdult + ")";
        }

        public /* synthetic */ ItemVO(t tVar, IconDTO iconDTO, List list, IconButtonV3DTO iconButtonV3DTO, boolean z11, AtomAction atomAction, SkuThinScrollWidth skuThinScrollWidth, IconDTO iconDTO2, SkuThinScrollItemDTO.AddToCartButton addToCartButton, Long l11, boolean z12, boolean z13, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(tVar, iconDTO, list, iconButtonV3DTO, z11, atomAction, skuThinScrollWidth, iconDTO2, addToCartButton, l11, z12, (i11 & 2048) != 0 ? z12 : z13);
        }
    }
}
