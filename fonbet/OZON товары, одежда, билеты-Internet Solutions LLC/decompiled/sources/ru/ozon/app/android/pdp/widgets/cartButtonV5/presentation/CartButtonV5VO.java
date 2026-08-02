package ru.ozon.app.android.pdp.widgets.cartButtonV5.presentation;

import B0.C2454a;
import Kk.C3532b;
import Pk0.g;
import WZ.t;
import Xc.a;
import Xc.b;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pdp.widgets.cartButtonV4.relatedProductsBottomSheet.CurtainTrackingInfoVO;
import ru.ozon.app.android.pdp.widgets.cartButtonV5.data.CartButtonV5DTO;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionDTO;

@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u001f\b\u0081\b\u0018\u00002\u00020\u0001:\u0003:;<B_\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\u000e\u0010\u000f\u001a\n\u0018\u00010\rj\u0004\u0018\u0001`\u000e\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015Jx\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0010\b\u0002\u0010\u000f\u001a\n\u0018\u00010\rj\u0004\u0018\u0001`\u000e2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00102\b\b\u0002\u0010\u0013\u001a\u00020\u0012HÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010 \u001a\u00020\u00042\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eHÖ\u0003¢\u0006\u0004\b \u0010!R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\"\u001a\u0004\b#\u0010$R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010%\u001a\u0004\b\u0005\u0010&R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010'\u001a\u0004\b(\u0010)R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010*\u001a\u0004\b+\u0010,R\u0019\u0010\n\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\n\u0010*\u001a\u0004\b-\u0010,R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010.\u001a\u0004\b/\u00100R\u001f\u0010\u000f\u001a\n\u0018\u00010\rj\u0004\u0018\u0001`\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u00101\u001a\u0004\b2\u00103R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u00104\u001a\u0004\b5\u00106R\u0017\u0010\u0013\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b\u0013\u00107\u001a\u0004\b8\u00109¨\u0006="}, d2 = {"Lru/ozon/app/android/pdp/widgets/cartButtonV5/presentation/CartButtonV5VO;", "Ll20/c;", "", "id", "", "isStickyTransparent", "", "stickyCornerRadius", "Lru/ozon/app/android/pdp/widgets/cartButtonV5/presentation/CartButtonV5VO$CartButton;", "cartButton", "secondCartButton", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "asyncAction", "LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "tokenizedEvent", "Lru/ozon/app/android/pdp/widgets/cartButtonV5/presentation/CartButtonV5VO$RelatedProductsCurtainVO;", "relatedProduct", "Lru/ozon/app/android/pdp/widgets/cartButtonV5/presentation/CartButtonV5Configuration;", "buttonConfiguration", "<init>", "(JZFLru/ozon/app/android/pdp/widgets/cartButtonV5/presentation/CartButtonV5VO$CartButton;Lru/ozon/app/android/pdp/widgets/cartButtonV5/presentation/CartButtonV5VO$CartButton;Lru/ozon/uni/atoms/data/AtomActionDTO;LWZ/t;Lru/ozon/app/android/pdp/widgets/cartButtonV5/presentation/CartButtonV5VO$RelatedProductsCurtainVO;Lru/ozon/app/android/pdp/widgets/cartButtonV5/presentation/CartButtonV5Configuration;)V", "copy", "(JZFLru/ozon/app/android/pdp/widgets/cartButtonV5/presentation/CartButtonV5VO$CartButton;Lru/ozon/app/android/pdp/widgets/cartButtonV5/presentation/CartButtonV5VO$CartButton;Lru/ozon/uni/atoms/data/AtomActionDTO;LWZ/t;Lru/ozon/app/android/pdp/widgets/cartButtonV5/presentation/CartButtonV5VO$RelatedProductsCurtainVO;Lru/ozon/app/android/pdp/widgets/cartButtonV5/presentation/CartButtonV5Configuration;)Lru/ozon/app/android/pdp/widgets/cartButtonV5/presentation/CartButtonV5VO;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Z", "()Z", "F", "getStickyCornerRadius", "()F", "Lru/ozon/app/android/pdp/widgets/cartButtonV5/presentation/CartButtonV5VO$CartButton;", "getCartButton", "()Lru/ozon/app/android/pdp/widgets/cartButtonV5/presentation/CartButtonV5VO$CartButton;", "getSecondCartButton", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "getAsyncAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "LWZ/t;", "getTokenizedEvent", "()LWZ/t;", "Lru/ozon/app/android/pdp/widgets/cartButtonV5/presentation/CartButtonV5VO$RelatedProductsCurtainVO;", "getRelatedProduct", "()Lru/ozon/app/android/pdp/widgets/cartButtonV5/presentation/CartButtonV5VO$RelatedProductsCurtainVO;", "Lru/ozon/app/android/pdp/widgets/cartButtonV5/presentation/CartButtonV5Configuration;", "getButtonConfiguration", "()Lru/ozon/app/android/pdp/widgets/cartButtonV5/presentation/CartButtonV5Configuration;", "CartButton", "RelatedProductsCurtainVO", "CartType", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class CartButtonV5VO implements c {
    private final AtomActionDTO asyncAction;

    @NotNull
    private final CartButtonV5Configuration buttonConfiguration;

    @NotNull
    private final CartButton cartButton;
    private final long id;
    private final boolean isStickyTransparent;
    private final RelatedProductsCurtainVO relatedProduct;
    private final CartButton secondCartButton;
    private final float stickyCornerRadius;
    private final t tokenizedEvent;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/pdp/widgets/cartButtonV5/presentation/CartButtonV5VO$CartType;", "", "<init>", "(Ljava/lang/String;I)V", "FIRST", "SECOND", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class CartType {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ CartType[] $VALUES;
        public static final CartType FIRST = new CartType("FIRST", 0);
        public static final CartType SECOND = new CartType("SECOND", 1);

        private static final /* synthetic */ CartType[] $values() {
            return new CartType[]{FIRST, SECOND};
        }

        static {
            CartType[] $values = $values();
            $VALUES = $values;
            $ENTRIES = b.a($values);
        }

        private CartType(String str, int i11) {
        }

        public static CartType valueOf(String str) {
            return (CartType) Enum.valueOf(CartType.class, str);
        }

        public static CartType[] values() {
            return (CartType[]) $VALUES.clone();
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\tR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/pdp/widgets/cartButtonV5/presentation/CartButtonV5VO$RelatedProductsCurtainVO;", "", "", "link", "Lru/ozon/app/android/pdp/widgets/cartButtonV4/relatedProductsBottomSheet/CurtainTrackingInfoVO;", "trackingInfo", "<init>", "(Ljava/lang/String;Lru/ozon/app/android/pdp/widgets/cartButtonV4/relatedProductsBottomSheet/CurtainTrackingInfoVO;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getLink", "Lru/ozon/app/android/pdp/widgets/cartButtonV4/relatedProductsBottomSheet/CurtainTrackingInfoVO;", "getTrackingInfo", "()Lru/ozon/app/android/pdp/widgets/cartButtonV4/relatedProductsBottomSheet/CurtainTrackingInfoVO;", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class RelatedProductsCurtainVO {

        @NotNull
        private final String link;
        private final CurtainTrackingInfoVO trackingInfo;

        public RelatedProductsCurtainVO(@NotNull String link, CurtainTrackingInfoVO curtainTrackingInfoVO) {
            Intrinsics.checkNotNullParameter(link, "link");
            this.link = link;
            this.trackingInfo = curtainTrackingInfoVO;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof RelatedProductsCurtainVO)) {
                return false;
            }
            RelatedProductsCurtainVO relatedProductsCurtainVO = (RelatedProductsCurtainVO) other;
            return Intrinsics.d(this.link, relatedProductsCurtainVO.link) && Intrinsics.d(this.trackingInfo, relatedProductsCurtainVO.trackingInfo);
        }

        @NotNull
        public final String getLink() {
            return this.link;
        }

        public final CurtainTrackingInfoVO getTrackingInfo() {
            return this.trackingInfo;
        }

        public int hashCode() {
            int hashCode = this.link.hashCode() * 31;
            CurtainTrackingInfoVO curtainTrackingInfoVO = this.trackingInfo;
            return hashCode + (curtainTrackingInfoVO == null ? 0 : curtainTrackingInfoVO.hashCode());
        }

        @NotNull
        public String toString() {
            return "RelatedProductsCurtainVO(link=" + this.link + ", trackingInfo=" + this.trackingInfo + ")";
        }
    }

    public CartButtonV5VO(long j11, boolean z11, float f7, @NotNull CartButton cartButton, CartButton cartButton2, AtomActionDTO atomActionDTO, t tVar, RelatedProductsCurtainVO relatedProductsCurtainVO, @NotNull CartButtonV5Configuration buttonConfiguration) {
        Intrinsics.checkNotNullParameter(cartButton, "cartButton");
        Intrinsics.checkNotNullParameter(buttonConfiguration, "buttonConfiguration");
        this.id = j11;
        this.isStickyTransparent = z11;
        this.stickyCornerRadius = f7;
        this.cartButton = cartButton;
        this.secondCartButton = cartButton2;
        this.asyncAction = atomActionDTO;
        this.tokenizedEvent = tVar;
        this.relatedProduct = relatedProductsCurtainVO;
        this.buttonConfiguration = buttonConfiguration;
    }

    public static /* synthetic */ CartButtonV5VO copy$default(CartButtonV5VO cartButtonV5VO, long j11, boolean z11, float f7, CartButton cartButton, CartButton cartButton2, AtomActionDTO atomActionDTO, t tVar, RelatedProductsCurtainVO relatedProductsCurtainVO, CartButtonV5Configuration cartButtonV5Configuration, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            j11 = cartButtonV5VO.id;
        }
        long j12 = j11;
        if ((i11 & 2) != 0) {
            z11 = cartButtonV5VO.isStickyTransparent;
        }
        boolean z12 = z11;
        if ((i11 & 4) != 0) {
            f7 = cartButtonV5VO.stickyCornerRadius;
        }
        return cartButtonV5VO.copy(j12, z12, f7, (i11 & 8) != 0 ? cartButtonV5VO.cartButton : cartButton, (i11 & 16) != 0 ? cartButtonV5VO.secondCartButton : cartButton2, (i11 & 32) != 0 ? cartButtonV5VO.asyncAction : atomActionDTO, (i11 & 64) != 0 ? cartButtonV5VO.tokenizedEvent : tVar, (i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? cartButtonV5VO.relatedProduct : relatedProductsCurtainVO, (i11 & 256) != 0 ? cartButtonV5VO.buttonConfiguration : cartButtonV5Configuration);
    }

    @NotNull
    public final CartButtonV5VO copy(long id2, boolean isStickyTransparent, float stickyCornerRadius, @NotNull CartButton cartButton, CartButton secondCartButton, AtomActionDTO asyncAction, t tokenizedEvent, RelatedProductsCurtainVO relatedProduct, @NotNull CartButtonV5Configuration buttonConfiguration) {
        Intrinsics.checkNotNullParameter(cartButton, "cartButton");
        Intrinsics.checkNotNullParameter(buttonConfiguration, "buttonConfiguration");
        return new CartButtonV5VO(id2, isStickyTransparent, stickyCornerRadius, cartButton, secondCartButton, asyncAction, tokenizedEvent, relatedProduct, buttonConfiguration);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CartButtonV5VO)) {
            return false;
        }
        CartButtonV5VO cartButtonV5VO = (CartButtonV5VO) other;
        return this.id == cartButtonV5VO.id && this.isStickyTransparent == cartButtonV5VO.isStickyTransparent && Float.compare(this.stickyCornerRadius, cartButtonV5VO.stickyCornerRadius) == 0 && Intrinsics.d(this.cartButton, cartButtonV5VO.cartButton) && Intrinsics.d(this.secondCartButton, cartButtonV5VO.secondCartButton) && Intrinsics.d(this.asyncAction, cartButtonV5VO.asyncAction) && Intrinsics.d(this.tokenizedEvent, cartButtonV5VO.tokenizedEvent) && Intrinsics.d(this.relatedProduct, cartButtonV5VO.relatedProduct) && Intrinsics.d(this.buttonConfiguration, cartButtonV5VO.buttonConfiguration);
    }

    public final AtomActionDTO getAsyncAction() {
        return this.asyncAction;
    }

    @NotNull
    public final CartButtonV5Configuration getButtonConfiguration() {
        return this.buttonConfiguration;
    }

    @NotNull
    public final CartButton getCartButton() {
        return this.cartButton;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    public final RelatedProductsCurtainVO getRelatedProduct() {
        return this.relatedProduct;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    public final CartButton getSecondCartButton() {
        return this.secondCartButton;
    }

    public final float getStickyCornerRadius() {
        return this.stickyCornerRadius;
    }

    public final t getTokenizedEvent() {
        return this.tokenizedEvent;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        int hashCode = (this.cartButton.hashCode() + Pk0.b.a(this.stickyCornerRadius, C3532b.a(Long.hashCode(this.id) * 31, 31, this.isStickyTransparent), 31)) * 31;
        CartButton cartButton = this.secondCartButton;
        int hashCode2 = (hashCode + (cartButton == null ? 0 : cartButton.hashCode())) * 31;
        AtomActionDTO atomActionDTO = this.asyncAction;
        int hashCode3 = (hashCode2 + (atomActionDTO == null ? 0 : atomActionDTO.hashCode())) * 31;
        t tVar = this.tokenizedEvent;
        int hashCode4 = (hashCode3 + (tVar == null ? 0 : tVar.hashCode())) * 31;
        RelatedProductsCurtainVO relatedProductsCurtainVO = this.relatedProduct;
        return this.buttonConfiguration.hashCode() + ((hashCode4 + (relatedProductsCurtainVO != null ? relatedProductsCurtainVO.hashCode() : 0)) * 31);
    }

    /* renamed from: isStickyTransparent, reason: from getter */
    public final boolean getIsStickyTransparent() {
        return this.isStickyTransparent;
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        boolean z11 = this.isStickyTransparent;
        float f7 = this.stickyCornerRadius;
        CartButton cartButton = this.cartButton;
        CartButton cartButton2 = this.secondCartButton;
        AtomActionDTO atomActionDTO = this.asyncAction;
        t tVar = this.tokenizedEvent;
        RelatedProductsCurtainVO relatedProductsCurtainVO = this.relatedProduct;
        CartButtonV5Configuration cartButtonV5Configuration = this.buttonConfiguration;
        StringBuilder c11 = Bl.b.c(j11, "CartButtonV5VO(id=", ", isStickyTransparent=", z11);
        c11.append(", stickyCornerRadius=");
        c11.append(f7);
        c11.append(", cartButton=");
        c11.append(cartButton);
        c11.append(", secondCartButton=");
        c11.append(cartButton2);
        c11.append(", asyncAction=");
        c11.append(atomActionDTO);
        c11.append(", tokenizedEvent=");
        c11.append(tVar);
        c11.append(", relatedProduct=");
        c11.append(relatedProductsCurtainVO);
        c11.append(", buttonConfiguration=");
        c11.append(cartButtonV5Configuration);
        c11.append(")");
        return c11.toString();
    }

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b(\b\u0087\b\u0018\u00002\u00020\u0001B\u0099\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000b\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u000e\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u000e\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\b\u0018\u0010\u0019J´\u0001\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u000e2\b\b\u0002\u0010\u0012\u001a\u00020\u000e2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u000e2\b\b\u0002\u0010\u0015\u001a\u00020\u00042\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010!\u001a\u00020\u00042\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b!\u0010\"R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010#\u001a\u0004\b$\u0010%R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010&\u001a\u0004\b\u0005\u0010'R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010(\u001a\u0004\b)\u0010*R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\b\u0010(\u001a\u0004\b+\u0010*R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u0010,\u001a\u0004\b-\u0010.R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010/\u001a\u0004\b0\u0010\u001dR\u0019\u0010\r\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\r\u0010/\u001a\u0004\b1\u0010\u001dR\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u00102\u001a\u0004\b3\u0010\u001fR\u0017\u0010\u0010\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u0010\u00102\u001a\u0004\b4\u0010\u001fR\u0017\u0010\u0011\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u0011\u00102\u001a\u0004\b5\u0010\u001fR\u0017\u0010\u0012\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u0012\u00102\u001a\u0004\b6\u0010\u001fR\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b\u0013\u00107\u001a\u0004\b8\u00109R\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b\u0014\u00107\u001a\u0004\b:\u00109R\u0017\u0010\u0015\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010&\u001a\u0004\b\u0015\u0010'R\u0019\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0006¢\u0006\f\n\u0004\b\u0017\u0010;\u001a\u0004\b<\u0010=¨\u0006>"}, d2 = {"Lru/ozon/app/android/pdp/widgets/cartButtonV5/presentation/CartButtonV5VO$CartButton;", "", "Lru/ozon/app/android/pdp/widgets/cartButtonV5/presentation/CartButtonV5VO$CartType;", "cartType", "", "isInCart", "Lru/ozon/app/android/pdp/widgets/cartButtonV5/data/CartButtonV5DTO$CartButton$Button;", "toCart", "inCart", "Lru/ozon/app/android/pdp/widgets/cartButtonV5/data/CartButtonV5DTO$CartButton$AdditionalButton;", "additionalButton", "", "sku", "deliverySchema", "", "freeRest", "minAddToCartQuantity", "inCartQuantity", "multiplicityValue", "quantMultiplicityValue", "otherQuantMultiplicityValue", "isHowLoader", "Lru/ozon/uni/atoms/af/AtomAction;", "dismissAction", "<init>", "(Lru/ozon/app/android/pdp/widgets/cartButtonV5/presentation/CartButtonV5VO$CartType;ZLru/ozon/app/android/pdp/widgets/cartButtonV5/data/CartButtonV5DTO$CartButton$Button;Lru/ozon/app/android/pdp/widgets/cartButtonV5/data/CartButtonV5DTO$CartButton$Button;Lru/ozon/app/android/pdp/widgets/cartButtonV5/data/CartButtonV5DTO$CartButton$AdditionalButton;Ljava/lang/String;Ljava/lang/String;IIIILjava/lang/Integer;Ljava/lang/Integer;ZLru/ozon/uni/atoms/af/AtomAction;)V", "copy", "(Lru/ozon/app/android/pdp/widgets/cartButtonV5/presentation/CartButtonV5VO$CartType;ZLru/ozon/app/android/pdp/widgets/cartButtonV5/data/CartButtonV5DTO$CartButton$Button;Lru/ozon/app/android/pdp/widgets/cartButtonV5/data/CartButtonV5DTO$CartButton$Button;Lru/ozon/app/android/pdp/widgets/cartButtonV5/data/CartButtonV5DTO$CartButton$AdditionalButton;Ljava/lang/String;Ljava/lang/String;IIIILjava/lang/Integer;Ljava/lang/Integer;ZLru/ozon/uni/atoms/af/AtomAction;)Lru/ozon/app/android/pdp/widgets/cartButtonV5/presentation/CartButtonV5VO$CartButton;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/app/android/pdp/widgets/cartButtonV5/presentation/CartButtonV5VO$CartType;", "getCartType", "()Lru/ozon/app/android/pdp/widgets/cartButtonV5/presentation/CartButtonV5VO$CartType;", "Z", "()Z", "Lru/ozon/app/android/pdp/widgets/cartButtonV5/data/CartButtonV5DTO$CartButton$Button;", "getToCart", "()Lru/ozon/app/android/pdp/widgets/cartButtonV5/data/CartButtonV5DTO$CartButton$Button;", "getInCart", "Lru/ozon/app/android/pdp/widgets/cartButtonV5/data/CartButtonV5DTO$CartButton$AdditionalButton;", "getAdditionalButton", "()Lru/ozon/app/android/pdp/widgets/cartButtonV5/data/CartButtonV5DTO$CartButton$AdditionalButton;", "Ljava/lang/String;", "getSku", "getDeliverySchema", "I", "getFreeRest", "getMinAddToCartQuantity", "getInCartQuantity", "getMultiplicityValue", "Ljava/lang/Integer;", "getQuantMultiplicityValue", "()Ljava/lang/Integer;", "getOtherQuantMultiplicityValue", "Lru/ozon/uni/atoms/af/AtomAction;", "getDismissAction", "()Lru/ozon/uni/atoms/af/AtomAction;", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class CartButton {
        private final CartButtonV5DTO.CartButton.AdditionalButton additionalButton;

        @NotNull
        private final CartType cartType;
        private final String deliverySchema;
        private final AtomAction dismissAction;
        private final int freeRest;
        private final CartButtonV5DTO.CartButton.Button inCart;
        private final int inCartQuantity;
        private final boolean isHowLoader;
        private final boolean isInCart;
        private final int minAddToCartQuantity;
        private final int multiplicityValue;
        private final Integer otherQuantMultiplicityValue;
        private final Integer quantMultiplicityValue;
        private final String sku;

        @NotNull
        private final CartButtonV5DTO.CartButton.Button toCart;

        public CartButton(@NotNull CartType cartType, boolean z11, @NotNull CartButtonV5DTO.CartButton.Button toCart, CartButtonV5DTO.CartButton.Button button, CartButtonV5DTO.CartButton.AdditionalButton additionalButton, String str, String str2, int i11, int i12, int i13, int i14, Integer num, Integer num2, boolean z12, AtomAction atomAction) {
            Intrinsics.checkNotNullParameter(cartType, "cartType");
            Intrinsics.checkNotNullParameter(toCart, "toCart");
            this.cartType = cartType;
            this.isInCart = z11;
            this.toCart = toCart;
            this.inCart = button;
            this.additionalButton = additionalButton;
            this.sku = str;
            this.deliverySchema = str2;
            this.freeRest = i11;
            this.minAddToCartQuantity = i12;
            this.inCartQuantity = i13;
            this.multiplicityValue = i14;
            this.quantMultiplicityValue = num;
            this.otherQuantMultiplicityValue = num2;
            this.isHowLoader = z12;
            this.dismissAction = atomAction;
        }

        @NotNull
        public final CartButton copy(@NotNull CartType cartType, boolean isInCart, @NotNull CartButtonV5DTO.CartButton.Button toCart, CartButtonV5DTO.CartButton.Button inCart, CartButtonV5DTO.CartButton.AdditionalButton additionalButton, String sku, String deliverySchema, int freeRest, int minAddToCartQuantity, int inCartQuantity, int multiplicityValue, Integer quantMultiplicityValue, Integer otherQuantMultiplicityValue, boolean isHowLoader, AtomAction dismissAction) {
            Intrinsics.checkNotNullParameter(cartType, "cartType");
            Intrinsics.checkNotNullParameter(toCart, "toCart");
            return new CartButton(cartType, isInCart, toCart, inCart, additionalButton, sku, deliverySchema, freeRest, minAddToCartQuantity, inCartQuantity, multiplicityValue, quantMultiplicityValue, otherQuantMultiplicityValue, isHowLoader, dismissAction);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof CartButton)) {
                return false;
            }
            CartButton cartButton = (CartButton) other;
            return this.cartType == cartButton.cartType && this.isInCart == cartButton.isInCart && Intrinsics.d(this.toCart, cartButton.toCart) && Intrinsics.d(this.inCart, cartButton.inCart) && Intrinsics.d(this.additionalButton, cartButton.additionalButton) && Intrinsics.d(this.sku, cartButton.sku) && Intrinsics.d(this.deliverySchema, cartButton.deliverySchema) && this.freeRest == cartButton.freeRest && this.minAddToCartQuantity == cartButton.minAddToCartQuantity && this.inCartQuantity == cartButton.inCartQuantity && this.multiplicityValue == cartButton.multiplicityValue && Intrinsics.d(this.quantMultiplicityValue, cartButton.quantMultiplicityValue) && Intrinsics.d(this.otherQuantMultiplicityValue, cartButton.otherQuantMultiplicityValue) && this.isHowLoader == cartButton.isHowLoader && Intrinsics.d(this.dismissAction, cartButton.dismissAction);
        }

        public final CartButtonV5DTO.CartButton.AdditionalButton getAdditionalButton() {
            return this.additionalButton;
        }

        @NotNull
        public final CartType getCartType() {
            return this.cartType;
        }

        public final String getDeliverySchema() {
            return this.deliverySchema;
        }

        public final AtomAction getDismissAction() {
            return this.dismissAction;
        }

        public final int getFreeRest() {
            return this.freeRest;
        }

        public final CartButtonV5DTO.CartButton.Button getInCart() {
            return this.inCart;
        }

        public final int getInCartQuantity() {
            return this.inCartQuantity;
        }

        public final int getMinAddToCartQuantity() {
            return this.minAddToCartQuantity;
        }

        public final int getMultiplicityValue() {
            return this.multiplicityValue;
        }

        public final Integer getOtherQuantMultiplicityValue() {
            return this.otherQuantMultiplicityValue;
        }

        public final Integer getQuantMultiplicityValue() {
            return this.quantMultiplicityValue;
        }

        public final String getSku() {
            return this.sku;
        }

        @NotNull
        public final CartButtonV5DTO.CartButton.Button getToCart() {
            return this.toCart;
        }

        public int hashCode() {
            int hashCode = (this.toCart.hashCode() + C3532b.a(this.cartType.hashCode() * 31, 31, this.isInCart)) * 31;
            CartButtonV5DTO.CartButton.Button button = this.inCart;
            int hashCode2 = (hashCode + (button == null ? 0 : button.hashCode())) * 31;
            CartButtonV5DTO.CartButton.AdditionalButton additionalButton = this.additionalButton;
            int hashCode3 = (hashCode2 + (additionalButton == null ? 0 : additionalButton.hashCode())) * 31;
            String str = this.sku;
            int hashCode4 = (hashCode3 + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.deliverySchema;
            int a11 = C2454a.a(this.multiplicityValue, C2454a.a(this.inCartQuantity, C2454a.a(this.minAddToCartQuantity, C2454a.a(this.freeRest, (hashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31, 31), 31), 31), 31);
            Integer num = this.quantMultiplicityValue;
            int hashCode5 = (a11 + (num == null ? 0 : num.hashCode())) * 31;
            Integer num2 = this.otherQuantMultiplicityValue;
            int a12 = C3532b.a((hashCode5 + (num2 == null ? 0 : num2.hashCode())) * 31, 31, this.isHowLoader);
            AtomAction atomAction = this.dismissAction;
            return a12 + (atomAction != null ? atomAction.hashCode() : 0);
        }

        /* renamed from: isInCart, reason: from getter */
        public final boolean getIsInCart() {
            return this.isInCart;
        }

        @NotNull
        public String toString() {
            CartType cartType = this.cartType;
            boolean z11 = this.isInCart;
            CartButtonV5DTO.CartButton.Button button = this.toCart;
            CartButtonV5DTO.CartButton.Button button2 = this.inCart;
            CartButtonV5DTO.CartButton.AdditionalButton additionalButton = this.additionalButton;
            String str = this.sku;
            String str2 = this.deliverySchema;
            int i11 = this.freeRest;
            int i12 = this.minAddToCartQuantity;
            int i13 = this.inCartQuantity;
            int i14 = this.multiplicityValue;
            Integer num = this.quantMultiplicityValue;
            Integer num2 = this.otherQuantMultiplicityValue;
            boolean z12 = this.isHowLoader;
            AtomAction atomAction = this.dismissAction;
            StringBuilder sb2 = new StringBuilder("CartButton(cartType=");
            sb2.append(cartType);
            sb2.append(", isInCart=");
            sb2.append(z11);
            sb2.append(", toCart=");
            sb2.append(button);
            sb2.append(", inCart=");
            sb2.append(button2);
            sb2.append(", additionalButton=");
            sb2.append(additionalButton);
            sb2.append(", sku=");
            sb2.append(str);
            sb2.append(", deliverySchema=");
            g.d(i11, str2, ", freeRest=", ", minAddToCartQuantity=", sb2);
            Ek.a.f(i12, i13, ", inCartQuantity=", ", multiplicityValue=", sb2);
            sb2.append(i14);
            sb2.append(", quantMultiplicityValue=");
            sb2.append(num);
            sb2.append(", otherQuantMultiplicityValue=");
            sb2.append(num2);
            sb2.append(", isHowLoader=");
            sb2.append(z12);
            sb2.append(", dismissAction=");
            return B6.b.b(sb2, atomAction, ")");
        }

        public /* synthetic */ CartButton(CartType cartType, boolean z11, CartButtonV5DTO.CartButton.Button button, CartButtonV5DTO.CartButton.Button button2, CartButtonV5DTO.CartButton.AdditionalButton additionalButton, String str, String str2, int i11, int i12, int i13, int i14, Integer num, Integer num2, boolean z12, AtomAction atomAction, int i15, DefaultConstructorMarker defaultConstructorMarker) {
            this(cartType, z11, button, button2, additionalButton, str, str2, (i15 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? 0 : i11, (i15 & 256) != 0 ? 1 : i12, (i15 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? 0 : i13, (i15 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? 1 : i14, num, num2, (i15 & 8192) != 0 ? false : z12, (i15 & 16384) != 0 ? null : atomAction);
        }
    }
}
