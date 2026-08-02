package ru.ozon.app.android.ugc.widgets.productVariant.presentation;

import G.g;
import Ih.a;
import Ns.b;
import T7.P;
import WZ.t;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0014\b\u0081\b\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0001+BC\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\f\u001a\u00020\b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0017\u0010\u0007\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001e\u001a\u0004\b!\u0010 R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\"\u001a\u0004\b#\u0010\u0012R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010$\u001a\u0004\b%\u0010&R\u0017\u0010\f\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\f\u0010\"\u001a\u0004\b'\u0010\u0012R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010(\u001a\u0004\b)\u0010*¨\u0006,"}, d2 = {"Lru/ozon/app/android/ugc/widgets/productVariant/presentation/ProductVariantVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "Lru/ozon/uni/atoms/data/text/TextDTO;", "productName", "productDescription", "", "productImage", "Lru/ozon/app/android/ugc/widgets/productVariant/presentation/ProductVariantVO$ChangeVariantButton;", "changeVariantButton", "backgroundColor", "LWZ/t;", "tokenizedEvent", "<init>", "(JLru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Ljava/lang/String;Lru/ozon/app/android/ugc/widgets/productVariant/presentation/ProductVariantVO$ChangeVariantButton;Ljava/lang/String;LWZ/t;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getProductName", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getProductDescription", "Ljava/lang/String;", "getProductImage", "Lru/ozon/app/android/ugc/widgets/productVariant/presentation/ProductVariantVO$ChangeVariantButton;", "getChangeVariantButton", "()Lru/ozon/app/android/ugc/widgets/productVariant/presentation/ProductVariantVO$ChangeVariantButton;", "getBackgroundColor", "LWZ/t;", "getTokenizedEvent", "()LWZ/t;", "ChangeVariantButton", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class ProductVariantVO implements c {

    @NotNull
    private final String backgroundColor;
    private final ChangeVariantButton changeVariantButton;
    private final long id;

    @NotNull
    private final TextDTO productDescription;

    @NotNull
    private final String productImage;

    @NotNull
    private final TextDTO productName;
    private final t tokenizedEvent;

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR%\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\t\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"Lru/ozon/app/android/ugc/widgets/productVariant/presentation/ProductVariantVO$ChangeVariantButton;", "", "Lru/ozon/uni/atoms/data/text/TextDTO;", "changeVariantText", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "action", "", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "trackingInfo", "<init>", "(Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/AtomActionDTO;Ljava/util/Map;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getChangeVariantText", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "getAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "Ljava/util/Map;", "getTrackingInfo", "()Ljava/util/Map;", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ChangeVariantButton {

        @NotNull
        private final AtomActionDTO action;

        @NotNull
        private final TextDTO changeVariantText;
        private final Map<String, TokenizedTrackingInfo> trackingInfo;

        public ChangeVariantButton(@NotNull TextDTO changeVariantText, @NotNull AtomActionDTO action, Map<String, TokenizedTrackingInfo> map) {
            Intrinsics.checkNotNullParameter(changeVariantText, "changeVariantText");
            Intrinsics.checkNotNullParameter(action, "action");
            this.changeVariantText = changeVariantText;
            this.action = action;
            this.trackingInfo = map;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ChangeVariantButton)) {
                return false;
            }
            ChangeVariantButton changeVariantButton = (ChangeVariantButton) other;
            return Intrinsics.d(this.changeVariantText, changeVariantButton.changeVariantText) && Intrinsics.d(this.action, changeVariantButton.action) && Intrinsics.d(this.trackingInfo, changeVariantButton.trackingInfo);
        }

        @NotNull
        public final AtomActionDTO getAction() {
            return this.action;
        }

        @NotNull
        public final TextDTO getChangeVariantText() {
            return this.changeVariantText;
        }

        public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
            return this.trackingInfo;
        }

        public int hashCode() {
            int b11 = a.b(this.action, this.changeVariantText.hashCode() * 31, 31);
            Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
            return b11 + (map == null ? 0 : map.hashCode());
        }

        @NotNull
        public String toString() {
            TextDTO textDTO = this.changeVariantText;
            AtomActionDTO atomActionDTO = this.action;
            Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
            StringBuilder sb2 = new StringBuilder("ChangeVariantButton(changeVariantText=");
            sb2.append(textDTO);
            sb2.append(", action=");
            sb2.append(atomActionDTO);
            sb2.append(", trackingInfo=");
            return P.f(sb2, map, ")");
        }
    }

    public ProductVariantVO(long j11, @NotNull TextDTO productName, @NotNull TextDTO productDescription, @NotNull String productImage, ChangeVariantButton changeVariantButton, @NotNull String backgroundColor, t tVar) {
        Intrinsics.checkNotNullParameter(productName, "productName");
        Intrinsics.checkNotNullParameter(productDescription, "productDescription");
        Intrinsics.checkNotNullParameter(productImage, "productImage");
        Intrinsics.checkNotNullParameter(backgroundColor, "backgroundColor");
        this.id = j11;
        this.productName = productName;
        this.productDescription = productDescription;
        this.productImage = productImage;
        this.changeVariantButton = changeVariantButton;
        this.backgroundColor = backgroundColor;
        this.tokenizedEvent = tVar;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ProductVariantVO)) {
            return false;
        }
        ProductVariantVO productVariantVO = (ProductVariantVO) other;
        return this.id == productVariantVO.id && Intrinsics.d(this.productName, productVariantVO.productName) && Intrinsics.d(this.productDescription, productVariantVO.productDescription) && Intrinsics.d(this.productImage, productVariantVO.productImage) && Intrinsics.d(this.changeVariantButton, productVariantVO.changeVariantButton) && Intrinsics.d(this.backgroundColor, productVariantVO.backgroundColor) && Intrinsics.d(this.tokenizedEvent, productVariantVO.tokenizedEvent);
    }

    @NotNull
    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    public final ChangeVariantButton getChangeVariantButton() {
        return this.changeVariantButton;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    @NotNull
    public final TextDTO getProductDescription() {
        return this.productDescription;
    }

    @NotNull
    public final String getProductImage() {
        return this.productImage;
    }

    @NotNull
    public final TextDTO getProductName() {
        return this.productName;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    public final t getTokenizedEvent() {
        return this.tokenizedEvent;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        int a11 = g.a(b.a(this.productDescription, b.a(this.productName, Long.hashCode(this.id) * 31, 31), 31), 31, this.productImage);
        ChangeVariantButton changeVariantButton = this.changeVariantButton;
        int a12 = g.a((a11 + (changeVariantButton == null ? 0 : changeVariantButton.hashCode())) * 31, 31, this.backgroundColor);
        t tVar = this.tokenizedEvent;
        return a12 + (tVar != null ? tVar.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        TextDTO textDTO = this.productName;
        TextDTO textDTO2 = this.productDescription;
        String str = this.productImage;
        ChangeVariantButton changeVariantButton = this.changeVariantButton;
        String str2 = this.backgroundColor;
        t tVar = this.tokenizedEvent;
        StringBuilder b11 = TY.a.b("ProductVariantVO(id=", j11, ", productName=", textDTO);
        b11.append(", productDescription=");
        b11.append(textDTO2);
        b11.append(", productImage=");
        b11.append(str);
        b11.append(", changeVariantButton=");
        b11.append(changeVariantButton);
        b11.append(", backgroundColor=");
        b11.append(str2);
        return Lh.a.b(b11, ", tokenizedEvent=", tVar, ")");
    }
}
