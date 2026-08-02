package ru.ozon.app.android.checkoutcomposer.split.data;

import B0.C2454a;
import Bi.b;
import Co.a;
import D40.d;
import El.C2971a;
import G.g;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.squareup.moshi.j;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.composerCommonViewKit.islandSeparator.data.IslandSeparatorDTO;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.cart.ui.tooltip.CartTooltipVOKt;
import ru.ozon.app.android.checkoutcomposer.common.promoIcon.PromoIconPosition;
import ru.ozon.app.android.checkoutcomposer.common.splitDynamicElements.data.DynamicElementDTO;
import ru.ozon.app.android.checkoutcomposer.split.presentation.elements.carouselSelector.LogosCarouselVO;
import ru.ozon.app.android.checkoutcomposer.split.presentation.elements.tagList.TagListVO;
import ru.ozon.app.android.checkoutgeo.checkout.data.Paddings;
import ru.ozon.app.android.checkoutgeo.checkout.views.checkoutCellList.CheckoutCellListDTO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.moshi.adapters.serialize.proto.ProtoOneOf;
import ru.ozon.moshi.adapters.serialize.proto.ProtoOneOfSignature;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.common.TooltipDTO;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.controls.tag.TagButtonDTO;
import ru.ozon.uni.atoms.data.disclaimer.DisclaimerDTO;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.atoms.data.tabs.TabsDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@ProtoOneOfSignature.Container({@ProtoOneOfSignature(name = DynamicElementDTO.TAG_LIST, type = SplitTagListDTO.class), @ProtoOneOfSignature(name = DynamicElementDTO.LOGOS_CAROUSEL, type = SplitLogosCarouselDTO.class), @ProtoOneOfSignature(name = "verticalSpacer", type = SplitVerticalSpacerDTO.class), @ProtoOneOfSignature(name = "separator", type = SplitSeparatorDTO.class), @ProtoOneOfSignature(name = DynamicElementDTO.TABS, type = SplitTabsDTO.class), @ProtoOneOfSignature(name = DynamicElementDTO.PRODUCTS_BLOCK, type = SplitProductsBlockDTO.class), @ProtoOneOfSignature(name = "cell", type = SplitCellDTO.class), @ProtoOneOfSignature(name = "cellList", type = CheckoutCellListDTO.class), @ProtoOneOfSignature(name = "islandSeparator", type = IslandSeparatorDTO.class), @ProtoOneOfSignature(name = SelectionItemFormDTO.DISCLAIMER_FIELD_NAME, type = SplitDisclaimerDTO.class)})
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b1\u0018\u00002\u00020\u0001:\b\u0004\u0005\u0006\u0007\b\t\n\u000bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\b\f\r\u000e\u000f\u0010\u0011\u0012\u0013¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/checkoutcomposer/split/data/SplitElementDTO;", "", "<init>", "()V", "SplitTagListDTO", "SplitLogosCarouselDTO", "SplitVerticalSpacerDTO", "SplitSeparatorDTO", "SplitTabsDTO", "SplitProductsBlockDTO", "SplitDisclaimerDTO", "SplitCellDTO", "Lru/ozon/app/android/checkoutcomposer/split/data/SplitElementDTO$SplitCellDTO;", "Lru/ozon/app/android/checkoutcomposer/split/data/SplitElementDTO$SplitDisclaimerDTO;", "Lru/ozon/app/android/checkoutcomposer/split/data/SplitElementDTO$SplitLogosCarouselDTO;", "Lru/ozon/app/android/checkoutcomposer/split/data/SplitElementDTO$SplitProductsBlockDTO;", "Lru/ozon/app/android/checkoutcomposer/split/data/SplitElementDTO$SplitSeparatorDTO;", "Lru/ozon/app/android/checkoutcomposer/split/data/SplitElementDTO$SplitTabsDTO;", "Lru/ozon/app/android/checkoutcomposer/split/data/SplitElementDTO$SplitTagListDTO;", "Lru/ozon/app/android/checkoutcomposer/split/data/SplitElementDTO$SplitVerticalSpacerDTO;", "checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@ProtoOneOf(label = "type")
/* loaded from: classes11.dex */
public abstract class SplitElementDTO {
    public static final int $stable = 0;

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B#\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0002\u0010\fJ\t\u0010\u0015\u001a\u00020\u0006HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\bHÆ\u0003J0\u0010\u0017\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0002\u0010\u0018J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cHÖ\u0003J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J\t\u0010\u001f\u001a\u00020 HÖ\u0001R\u001e\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0096\u000e¢\u0006\u0010\n\u0002\u0010\u000f\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006!"}, d2 = {"Lru/ozon/app/android/checkoutcomposer/split/data/SplitElementDTO$SplitCellDTO;", "Lru/ozon/app/android/checkoutcomposer/split/data/SplitElementDTO;", "Lru/ozon/app/android/checkoutcomposer/split/data/Indexed;", "index", "", "content", "Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "paddings", "Lru/ozon/app/android/checkoutgeo/checkout/data/Paddings;", "<init>", "(Ljava/lang/Long;Lru/ozon/uni/atoms/data/dsCell/CellDTO;Lru/ozon/app/android/checkoutgeo/checkout/data/Paddings;)V", "getIndex", "()Ljava/lang/Long;", "setIndex", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "getContent", "()Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "getPaddings", "()Lru/ozon/app/android/checkoutgeo/checkout/data/Paddings;", "component1", "component2", "component3", "copy", "(Ljava/lang/Long;Lru/ozon/uni/atoms/data/dsCell/CellDTO;Lru/ozon/app/android/checkoutgeo/checkout/data/Paddings;)Lru/ozon/app/android/checkoutcomposer/split/data/SplitElementDTO$SplitCellDTO;", "equals", "", "other", "", "hashCode", "", "toString", "", "checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class SplitCellDTO extends SplitElementDTO implements Indexed {
        public static final int $stable = 8;

        @NotNull
        private final CellDTO content;
        private Long index;
        private final Paddings paddings;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SplitCellDTO(Long l11, @NotNull CellDTO content, Paddings paddings) {
            super(null);
            Intrinsics.checkNotNullParameter(content, "content");
            this.index = l11;
            this.content = content;
            this.paddings = paddings;
        }

        public static /* synthetic */ SplitCellDTO copy$default(SplitCellDTO splitCellDTO, Long l11, CellDTO cellDTO, Paddings paddings, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                l11 = splitCellDTO.index;
            }
            if ((i11 & 2) != 0) {
                cellDTO = splitCellDTO.content;
            }
            if ((i11 & 4) != 0) {
                paddings = splitCellDTO.paddings;
            }
            return splitCellDTO.copy(l11, cellDTO, paddings);
        }

        /* renamed from: component1, reason: from getter */
        public final Long getIndex() {
            return this.index;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final CellDTO getContent() {
            return this.content;
        }

        /* renamed from: component3, reason: from getter */
        public final Paddings getPaddings() {
            return this.paddings;
        }

        @NotNull
        public final SplitCellDTO copy(Long index, @NotNull CellDTO content, Paddings paddings) {
            Intrinsics.checkNotNullParameter(content, "content");
            return new SplitCellDTO(index, content, paddings);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SplitCellDTO)) {
                return false;
            }
            SplitCellDTO splitCellDTO = (SplitCellDTO) other;
            return Intrinsics.d(this.index, splitCellDTO.index) && Intrinsics.d(this.content, splitCellDTO.content) && Intrinsics.d(this.paddings, splitCellDTO.paddings);
        }

        @NotNull
        public final CellDTO getContent() {
            return this.content;
        }

        public Long getIndex() {
            return this.index;
        }

        public final Paddings getPaddings() {
            return this.paddings;
        }

        public int hashCode() {
            Long l11 = this.index;
            int c11 = b.c(this.content, (l11 == null ? 0 : l11.hashCode()) * 31, 31);
            Paddings paddings = this.paddings;
            return c11 + (paddings != null ? paddings.hashCode() : 0);
        }

        @Override // ru.ozon.app.android.checkoutcomposer.split.data.Indexed
        public void setIndex(Long l11) {
            this.index = l11;
        }

        @NotNull
        public String toString() {
            return "SplitCellDTO(index=" + this.index + ", content=" + this.content + ", paddings=" + this.paddings + ")";
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B#\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0002\u0010\fJ\t\u0010\u0015\u001a\u00020\u0006HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\bHÆ\u0003J0\u0010\u0017\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0002\u0010\u0018J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cHÖ\u0003J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J\t\u0010\u001f\u001a\u00020 HÖ\u0001R\u001e\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0096\u000e¢\u0006\u0010\n\u0002\u0010\u000f\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006!"}, d2 = {"Lru/ozon/app/android/checkoutcomposer/split/data/SplitElementDTO$SplitDisclaimerDTO;", "Lru/ozon/app/android/checkoutcomposer/split/data/SplitElementDTO;", "Lru/ozon/app/android/checkoutcomposer/split/data/Indexed;", "index", "", "content", "Lru/ozon/uni/atoms/data/disclaimer/DisclaimerDTO;", "paddings", "Lru/ozon/app/android/checkoutgeo/checkout/data/Paddings;", "<init>", "(Ljava/lang/Long;Lru/ozon/uni/atoms/data/disclaimer/DisclaimerDTO;Lru/ozon/app/android/checkoutgeo/checkout/data/Paddings;)V", "getIndex", "()Ljava/lang/Long;", "setIndex", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "getContent", "()Lru/ozon/uni/atoms/data/disclaimer/DisclaimerDTO;", "getPaddings", "()Lru/ozon/app/android/checkoutgeo/checkout/data/Paddings;", "component1", "component2", "component3", "copy", "(Ljava/lang/Long;Lru/ozon/uni/atoms/data/disclaimer/DisclaimerDTO;Lru/ozon/app/android/checkoutgeo/checkout/data/Paddings;)Lru/ozon/app/android/checkoutcomposer/split/data/SplitElementDTO$SplitDisclaimerDTO;", "equals", "", "other", "", "hashCode", "", "toString", "", "checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class SplitDisclaimerDTO extends SplitElementDTO implements Indexed {
        public static final int $stable = 8;

        @NotNull
        private final DisclaimerDTO content;
        private Long index;
        private final Paddings paddings;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SplitDisclaimerDTO(Long l11, @NotNull DisclaimerDTO content, Paddings paddings) {
            super(null);
            Intrinsics.checkNotNullParameter(content, "content");
            this.index = l11;
            this.content = content;
            this.paddings = paddings;
        }

        public static /* synthetic */ SplitDisclaimerDTO copy$default(SplitDisclaimerDTO splitDisclaimerDTO, Long l11, DisclaimerDTO disclaimerDTO, Paddings paddings, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                l11 = splitDisclaimerDTO.index;
            }
            if ((i11 & 2) != 0) {
                disclaimerDTO = splitDisclaimerDTO.content;
            }
            if ((i11 & 4) != 0) {
                paddings = splitDisclaimerDTO.paddings;
            }
            return splitDisclaimerDTO.copy(l11, disclaimerDTO, paddings);
        }

        /* renamed from: component1, reason: from getter */
        public final Long getIndex() {
            return this.index;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final DisclaimerDTO getContent() {
            return this.content;
        }

        /* renamed from: component3, reason: from getter */
        public final Paddings getPaddings() {
            return this.paddings;
        }

        @NotNull
        public final SplitDisclaimerDTO copy(Long index, @NotNull DisclaimerDTO content, Paddings paddings) {
            Intrinsics.checkNotNullParameter(content, "content");
            return new SplitDisclaimerDTO(index, content, paddings);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SplitDisclaimerDTO)) {
                return false;
            }
            SplitDisclaimerDTO splitDisclaimerDTO = (SplitDisclaimerDTO) other;
            return Intrinsics.d(this.index, splitDisclaimerDTO.index) && Intrinsics.d(this.content, splitDisclaimerDTO.content) && Intrinsics.d(this.paddings, splitDisclaimerDTO.paddings);
        }

        @NotNull
        public final DisclaimerDTO getContent() {
            return this.content;
        }

        public Long getIndex() {
            return this.index;
        }

        public final Paddings getPaddings() {
            return this.paddings;
        }

        public int hashCode() {
            Long l11 = this.index;
            int hashCode = (this.content.hashCode() + ((l11 == null ? 0 : l11.hashCode()) * 31)) * 31;
            Paddings paddings = this.paddings;
            return hashCode + (paddings != null ? paddings.hashCode() : 0);
        }

        @Override // ru.ozon.app.android.checkoutcomposer.split.data.Indexed
        public void setIndex(Long l11) {
            this.index = l11;
        }

        @NotNull
        public String toString() {
            return "SplitDisclaimerDTO(index=" + this.index + ", content=" + this.content + ", paddings=" + this.paddings + ")";
        }
    }

    @Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\"\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002:\u0001?Bo\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\u0014\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0012\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010-\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0002\u0010\u001aJ\t\u0010.\u001a\u00020\u0006HÆ\u0003J\t\u0010/\u001a\u00020\u0006HÆ\u0003J\u000b\u00100\u001a\u0004\u0018\u00010\tHÆ\u0003J\u0011\u00101\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bHÆ\u0003J\u000b\u00102\u001a\u0004\u0018\u00010\u000eHÆ\u0003J\u000b\u00103\u001a\u0004\u0018\u00010\u0010HÆ\u0003J\u0017\u00104\u001a\u0010\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0012HÆ\u0003J\u000b\u00105\u001a\u0004\u0018\u00010\u0016HÆ\u0003J\u0088\u0001\u00106\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\u0016\b\u0002\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u00122\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0016HÆ\u0001¢\u0006\u0002\u00107J\u0013\u00108\u001a\u0002092\b\u0010:\u001a\u0004\u0018\u00010;HÖ\u0003J\t\u0010<\u001a\u00020=HÖ\u0001J\t\u0010>\u001a\u00020\u0013HÖ\u0001R\u001e\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0096\u000e¢\u0006\u0010\n\u0002\u0010\u001d\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001fR\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0019\u0010\n\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(R\u001f\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0012¢\u0006\b\n\u0000\u001a\u0004\b)\u0010*R\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u0016¢\u0006\b\n\u0000\u001a\u0004\b+\u0010,¨\u0006@"}, d2 = {"Lru/ozon/app/android/checkoutcomposer/split/data/SplitElementDTO$SplitProductsBlockDTO;", "Lru/ozon/app/android/checkoutcomposer/split/data/SplitElementDTO;", "Lru/ozon/app/android/checkoutcomposer/split/data/Indexed;", "index", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/text/TextDTO;", "subtitle", "badge", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "promotedProducts", "", "Lru/ozon/app/android/checkoutcomposer/split/data/SplitElementDTO$SplitProductsBlockDTO$PromotedProduct;", "button", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "action", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "trackingInfo", "", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "paddings", "Lru/ozon/app/android/checkoutgeo/checkout/data/Paddings;", "<init>", "(Ljava/lang/Long;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;Ljava/util/List;Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;Lru/ozon/uni/atoms/data/AtomActionDTO;Ljava/util/Map;Lru/ozon/app/android/checkoutgeo/checkout/data/Paddings;)V", "getIndex", "()Ljava/lang/Long;", "setIndex", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getSubtitle", "getBadge", "()Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "getPromotedProducts", "()Ljava/util/List;", "getButton", "()Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "getAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "getTrackingInfo", "()Ljava/util/Map;", "getPaddings", "()Lru/ozon/app/android/checkoutgeo/checkout/data/Paddings;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/Long;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;Ljava/util/List;Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;Lru/ozon/uni/atoms/data/AtomActionDTO;Ljava/util/Map;Lru/ozon/app/android/checkoutgeo/checkout/data/Paddings;)Lru/ozon/app/android/checkoutcomposer/split/data/SplitElementDTO$SplitProductsBlockDTO;", "equals", "", "other", "", "hashCode", "", "toString", "PromotedProduct", "checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @j(generateAdapter = true)
    public static final /* data */ class SplitProductsBlockDTO extends SplitElementDTO implements Indexed {
        public static final int $stable = 8;
        private final AtomActionDTO action;
        private final BadgeDTO badge;
        private final ButtonV3DTO button;
        private Long index;
        private final Paddings paddings;
        private final List<PromotedProduct> promotedProducts;

        @NotNull
        private final TextDTO subtitle;

        @NotNull
        private final TextDTO title;
        private final Map<String, TokenizedTrackingInfo> trackingInfo;

        @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u001eB-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\bHÆ\u0003J7\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001f"}, d2 = {"Lru/ozon/app/android/checkoutcomposer/split/data/SplitElementDTO$SplitProductsBlockDTO$PromotedProduct;", "", "image", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "promoIcon", "promoIconPosition", "Lru/ozon/app/android/checkoutcomposer/common/promoIcon/PromoIconPosition;", "tooltip", "Lru/ozon/app/android/checkoutcomposer/split/data/SplitElementDTO$SplitProductsBlockDTO$PromotedProduct$ProductTooltip;", "<init>", "(Lru/ozon/uni/atoms/data/icon/IconDTO;Lru/ozon/uni/atoms/data/icon/IconDTO;Lru/ozon/app/android/checkoutcomposer/common/promoIcon/PromoIconPosition;Lru/ozon/app/android/checkoutcomposer/split/data/SplitElementDTO$SplitProductsBlockDTO$PromotedProduct$ProductTooltip;)V", "getImage", "()Lru/ozon/uni/atoms/data/icon/IconDTO;", "getPromoIcon", "getPromoIconPosition", "()Lru/ozon/app/android/checkoutcomposer/common/promoIcon/PromoIconPosition;", "getTooltip", "()Lru/ozon/app/android/checkoutcomposer/split/data/SplitElementDTO$SplitProductsBlockDTO$PromotedProduct$ProductTooltip;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "", "ProductTooltip", "checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        @j(generateAdapter = true)
        public static final /* data */ class PromotedProduct {
            public static final int $stable = 8;

            @NotNull
            private final IconDTO image;
            private final IconDTO promoIcon;
            private final PromoIconPosition promoIconPosition;
            private final ProductTooltip tooltip;

            @j(generateAdapter = true)
            @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001BK\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\u0014\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u0005HÆ\u0003J\t\u0010!\u001a\u00020\u0007HÆ\u0003J\u0010\u0010\"\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010\u0018J\u0010\u0010#\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0002\u0010\u001bJ\u0017\u0010$\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000e\u0018\u00010\rHÆ\u0003J^\u0010%\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0016\b\u0002\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000e\u0018\u00010\rHÆ\u0001¢\u0006\u0002\u0010&J\u0013\u0010'\u001a\u00020(2\b\u0010)\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010*\u001a\u00020\tHÖ\u0001J\t\u0010+\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0015\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\n\n\u0002\u0010\u0019\u001a\u0004\b\u0017\u0010\u0018R\u0015\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\n\n\u0002\u0010\u001c\u001a\u0004\b\u001a\u0010\u001bR\u001f\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001e¨\u0006,"}, d2 = {"Lru/ozon/app/android/checkoutcomposer/split/data/SplitElementDTO$SplitProductsBlockDTO$PromotedProduct$ProductTooltip;", "", "backgroundColor", "", "message", "Lru/ozon/uni/atoms/data/text/TextDTO;", "closeIcon", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "displayTimeInSeconds", "", "delayTimeInSeconds", "", "trackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Ljava/lang/String;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/icon/IconDTO;Ljava/lang/Integer;Ljava/lang/Double;Ljava/util/Map;)V", "getBackgroundColor", "()Ljava/lang/String;", "getMessage", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getCloseIcon", "()Lru/ozon/uni/atoms/data/icon/IconDTO;", "getDisplayTimeInSeconds", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getDelayTimeInSeconds", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getTrackingInfo", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "(Ljava/lang/String;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/icon/IconDTO;Ljava/lang/Integer;Ljava/lang/Double;Ljava/util/Map;)Lru/ozon/app/android/checkoutcomposer/split/data/SplitElementDTO$SplitProductsBlockDTO$PromotedProduct$ProductTooltip;", "equals", "", "other", "hashCode", "toString", "checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
            public static final /* data */ class ProductTooltip {
                public static final int $stable = 8;
                private final String backgroundColor;

                @NotNull
                private final IconDTO closeIcon;
                private final Double delayTimeInSeconds;
                private final Integer displayTimeInSeconds;

                @NotNull
                private final TextDTO message;
                private final Map<String, TokenizedTrackingInfo> trackingInfo;

                public ProductTooltip(String str, @NotNull TextDTO message, @NotNull IconDTO closeIcon, Integer num, Double d11, Map<String, TokenizedTrackingInfo> map) {
                    Intrinsics.checkNotNullParameter(message, "message");
                    Intrinsics.checkNotNullParameter(closeIcon, "closeIcon");
                    this.backgroundColor = str;
                    this.message = message;
                    this.closeIcon = closeIcon;
                    this.displayTimeInSeconds = num;
                    this.delayTimeInSeconds = d11;
                    this.trackingInfo = map;
                }

                public static /* synthetic */ ProductTooltip copy$default(ProductTooltip productTooltip, String str, TextDTO textDTO, IconDTO iconDTO, Integer num, Double d11, Map map, int i11, Object obj) {
                    if ((i11 & 1) != 0) {
                        str = productTooltip.backgroundColor;
                    }
                    if ((i11 & 2) != 0) {
                        textDTO = productTooltip.message;
                    }
                    if ((i11 & 4) != 0) {
                        iconDTO = productTooltip.closeIcon;
                    }
                    if ((i11 & 8) != 0) {
                        num = productTooltip.displayTimeInSeconds;
                    }
                    if ((i11 & 16) != 0) {
                        d11 = productTooltip.delayTimeInSeconds;
                    }
                    if ((i11 & 32) != 0) {
                        map = productTooltip.trackingInfo;
                    }
                    Double d12 = d11;
                    Map map2 = map;
                    return productTooltip.copy(str, textDTO, iconDTO, num, d12, map2);
                }

                /* renamed from: component1, reason: from getter */
                public final String getBackgroundColor() {
                    return this.backgroundColor;
                }

                @NotNull
                /* renamed from: component2, reason: from getter */
                public final TextDTO getMessage() {
                    return this.message;
                }

                @NotNull
                /* renamed from: component3, reason: from getter */
                public final IconDTO getCloseIcon() {
                    return this.closeIcon;
                }

                /* renamed from: component4, reason: from getter */
                public final Integer getDisplayTimeInSeconds() {
                    return this.displayTimeInSeconds;
                }

                /* renamed from: component5, reason: from getter */
                public final Double getDelayTimeInSeconds() {
                    return this.delayTimeInSeconds;
                }

                public final Map<String, TokenizedTrackingInfo> component6() {
                    return this.trackingInfo;
                }

                @NotNull
                public final ProductTooltip copy(String backgroundColor, @NotNull TextDTO message, @NotNull IconDTO closeIcon, Integer displayTimeInSeconds, Double delayTimeInSeconds, Map<String, TokenizedTrackingInfo> trackingInfo) {
                    Intrinsics.checkNotNullParameter(message, "message");
                    Intrinsics.checkNotNullParameter(closeIcon, "closeIcon");
                    return new ProductTooltip(backgroundColor, message, closeIcon, displayTimeInSeconds, delayTimeInSeconds, trackingInfo);
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof ProductTooltip)) {
                        return false;
                    }
                    ProductTooltip productTooltip = (ProductTooltip) other;
                    return Intrinsics.d(this.backgroundColor, productTooltip.backgroundColor) && Intrinsics.d(this.message, productTooltip.message) && Intrinsics.d(this.closeIcon, productTooltip.closeIcon) && Intrinsics.d(this.displayTimeInSeconds, productTooltip.displayTimeInSeconds) && Intrinsics.d(this.delayTimeInSeconds, productTooltip.delayTimeInSeconds) && Intrinsics.d(this.trackingInfo, productTooltip.trackingInfo);
                }

                public final String getBackgroundColor() {
                    return this.backgroundColor;
                }

                @NotNull
                public final IconDTO getCloseIcon() {
                    return this.closeIcon;
                }

                public final Double getDelayTimeInSeconds() {
                    return this.delayTimeInSeconds;
                }

                public final Integer getDisplayTimeInSeconds() {
                    return this.displayTimeInSeconds;
                }

                @NotNull
                public final TextDTO getMessage() {
                    return this.message;
                }

                public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
                    return this.trackingInfo;
                }

                public int hashCode() {
                    String str = this.backgroundColor;
                    int a11 = C2971a.a(this.closeIcon, Ns.b.a(this.message, (str == null ? 0 : str.hashCode()) * 31, 31), 31);
                    Integer num = this.displayTimeInSeconds;
                    int hashCode = (a11 + (num == null ? 0 : num.hashCode())) * 31;
                    Double d11 = this.delayTimeInSeconds;
                    int hashCode2 = (hashCode + (d11 == null ? 0 : d11.hashCode())) * 31;
                    Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
                    return hashCode2 + (map != null ? map.hashCode() : 0);
                }

                @NotNull
                public String toString() {
                    String str = this.backgroundColor;
                    TextDTO textDTO = this.message;
                    IconDTO iconDTO = this.closeIcon;
                    Integer num = this.displayTimeInSeconds;
                    Double d11 = this.delayTimeInSeconds;
                    Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
                    StringBuilder b11 = a.b("ProductTooltip(backgroundColor=", textDTO, str, ", message=", ", closeIcon=");
                    b11.append(iconDTO);
                    b11.append(", displayTimeInSeconds=");
                    b11.append(num);
                    b11.append(", delayTimeInSeconds=");
                    b11.append(d11);
                    b11.append(", trackingInfo=");
                    b11.append(map);
                    b11.append(")");
                    return b11.toString();
                }
            }

            public PromotedProduct(@NotNull IconDTO image, IconDTO iconDTO, PromoIconPosition promoIconPosition, ProductTooltip productTooltip) {
                Intrinsics.checkNotNullParameter(image, "image");
                this.image = image;
                this.promoIcon = iconDTO;
                this.promoIconPosition = promoIconPosition;
                this.tooltip = productTooltip;
            }

            public static /* synthetic */ PromotedProduct copy$default(PromotedProduct promotedProduct, IconDTO iconDTO, IconDTO iconDTO2, PromoIconPosition promoIconPosition, ProductTooltip productTooltip, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    iconDTO = promotedProduct.image;
                }
                if ((i11 & 2) != 0) {
                    iconDTO2 = promotedProduct.promoIcon;
                }
                if ((i11 & 4) != 0) {
                    promoIconPosition = promotedProduct.promoIconPosition;
                }
                if ((i11 & 8) != 0) {
                    productTooltip = promotedProduct.tooltip;
                }
                return promotedProduct.copy(iconDTO, iconDTO2, promoIconPosition, productTooltip);
            }

            @NotNull
            /* renamed from: component1, reason: from getter */
            public final IconDTO getImage() {
                return this.image;
            }

            /* renamed from: component2, reason: from getter */
            public final IconDTO getPromoIcon() {
                return this.promoIcon;
            }

            /* renamed from: component3, reason: from getter */
            public final PromoIconPosition getPromoIconPosition() {
                return this.promoIconPosition;
            }

            /* renamed from: component4, reason: from getter */
            public final ProductTooltip getTooltip() {
                return this.tooltip;
            }

            @NotNull
            public final PromotedProduct copy(@NotNull IconDTO image, IconDTO promoIcon, PromoIconPosition promoIconPosition, ProductTooltip tooltip) {
                Intrinsics.checkNotNullParameter(image, "image");
                return new PromotedProduct(image, promoIcon, promoIconPosition, tooltip);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof PromotedProduct)) {
                    return false;
                }
                PromotedProduct promotedProduct = (PromotedProduct) other;
                return Intrinsics.d(this.image, promotedProduct.image) && Intrinsics.d(this.promoIcon, promotedProduct.promoIcon) && this.promoIconPosition == promotedProduct.promoIconPosition && Intrinsics.d(this.tooltip, promotedProduct.tooltip);
            }

            @NotNull
            public final IconDTO getImage() {
                return this.image;
            }

            public final IconDTO getPromoIcon() {
                return this.promoIcon;
            }

            public final PromoIconPosition getPromoIconPosition() {
                return this.promoIconPosition;
            }

            public final ProductTooltip getTooltip() {
                return this.tooltip;
            }

            public int hashCode() {
                int hashCode = this.image.hashCode() * 31;
                IconDTO iconDTO = this.promoIcon;
                int hashCode2 = (hashCode + (iconDTO == null ? 0 : iconDTO.hashCode())) * 31;
                PromoIconPosition promoIconPosition = this.promoIconPosition;
                int hashCode3 = (hashCode2 + (promoIconPosition == null ? 0 : promoIconPosition.hashCode())) * 31;
                ProductTooltip productTooltip = this.tooltip;
                return hashCode3 + (productTooltip != null ? productTooltip.hashCode() : 0);
            }

            @NotNull
            public String toString() {
                return "PromotedProduct(image=" + this.image + ", promoIcon=" + this.promoIcon + ", promoIconPosition=" + this.promoIconPosition + ", tooltip=" + this.tooltip + ")";
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SplitProductsBlockDTO(Long l11, @NotNull TextDTO title, @NotNull TextDTO subtitle, BadgeDTO badgeDTO, List<PromotedProduct> list, ButtonV3DTO buttonV3DTO, AtomActionDTO atomActionDTO, Map<String, TokenizedTrackingInfo> map, Paddings paddings) {
            super(null);
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(subtitle, "subtitle");
            this.index = l11;
            this.title = title;
            this.subtitle = subtitle;
            this.badge = badgeDTO;
            this.promotedProducts = list;
            this.button = buttonV3DTO;
            this.action = atomActionDTO;
            this.trackingInfo = map;
            this.paddings = paddings;
        }

        public static /* synthetic */ SplitProductsBlockDTO copy$default(SplitProductsBlockDTO splitProductsBlockDTO, Long l11, TextDTO textDTO, TextDTO textDTO2, BadgeDTO badgeDTO, List list, ButtonV3DTO buttonV3DTO, AtomActionDTO atomActionDTO, Map map, Paddings paddings, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                l11 = splitProductsBlockDTO.index;
            }
            if ((i11 & 2) != 0) {
                textDTO = splitProductsBlockDTO.title;
            }
            if ((i11 & 4) != 0) {
                textDTO2 = splitProductsBlockDTO.subtitle;
            }
            if ((i11 & 8) != 0) {
                badgeDTO = splitProductsBlockDTO.badge;
            }
            if ((i11 & 16) != 0) {
                list = splitProductsBlockDTO.promotedProducts;
            }
            if ((i11 & 32) != 0) {
                buttonV3DTO = splitProductsBlockDTO.button;
            }
            if ((i11 & 64) != 0) {
                atomActionDTO = splitProductsBlockDTO.action;
            }
            if ((i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
                map = splitProductsBlockDTO.trackingInfo;
            }
            if ((i11 & 256) != 0) {
                paddings = splitProductsBlockDTO.paddings;
            }
            Map map2 = map;
            Paddings paddings2 = paddings;
            ButtonV3DTO buttonV3DTO2 = buttonV3DTO;
            AtomActionDTO atomActionDTO2 = atomActionDTO;
            List list2 = list;
            TextDTO textDTO3 = textDTO2;
            return splitProductsBlockDTO.copy(l11, textDTO, textDTO3, badgeDTO, list2, buttonV3DTO2, atomActionDTO2, map2, paddings2);
        }

        /* renamed from: component1, reason: from getter */
        public final Long getIndex() {
            return this.index;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final TextDTO getTitle() {
            return this.title;
        }

        @NotNull
        /* renamed from: component3, reason: from getter */
        public final TextDTO getSubtitle() {
            return this.subtitle;
        }

        /* renamed from: component4, reason: from getter */
        public final BadgeDTO getBadge() {
            return this.badge;
        }

        public final List<PromotedProduct> component5() {
            return this.promotedProducts;
        }

        /* renamed from: component6, reason: from getter */
        public final ButtonV3DTO getButton() {
            return this.button;
        }

        /* renamed from: component7, reason: from getter */
        public final AtomActionDTO getAction() {
            return this.action;
        }

        public final Map<String, TokenizedTrackingInfo> component8() {
            return this.trackingInfo;
        }

        /* renamed from: component9, reason: from getter */
        public final Paddings getPaddings() {
            return this.paddings;
        }

        @NotNull
        public final SplitProductsBlockDTO copy(Long index, @NotNull TextDTO title, @NotNull TextDTO subtitle, BadgeDTO badge, List<PromotedProduct> promotedProducts, ButtonV3DTO button, AtomActionDTO action, Map<String, TokenizedTrackingInfo> trackingInfo, Paddings paddings) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(subtitle, "subtitle");
            return new SplitProductsBlockDTO(index, title, subtitle, badge, promotedProducts, button, action, trackingInfo, paddings);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SplitProductsBlockDTO)) {
                return false;
            }
            SplitProductsBlockDTO splitProductsBlockDTO = (SplitProductsBlockDTO) other;
            return Intrinsics.d(this.index, splitProductsBlockDTO.index) && Intrinsics.d(this.title, splitProductsBlockDTO.title) && Intrinsics.d(this.subtitle, splitProductsBlockDTO.subtitle) && Intrinsics.d(this.badge, splitProductsBlockDTO.badge) && Intrinsics.d(this.promotedProducts, splitProductsBlockDTO.promotedProducts) && Intrinsics.d(this.button, splitProductsBlockDTO.button) && Intrinsics.d(this.action, splitProductsBlockDTO.action) && Intrinsics.d(this.trackingInfo, splitProductsBlockDTO.trackingInfo) && Intrinsics.d(this.paddings, splitProductsBlockDTO.paddings);
        }

        public final AtomActionDTO getAction() {
            return this.action;
        }

        public final BadgeDTO getBadge() {
            return this.badge;
        }

        public final ButtonV3DTO getButton() {
            return this.button;
        }

        public Long getIndex() {
            return this.index;
        }

        public final Paddings getPaddings() {
            return this.paddings;
        }

        public final List<PromotedProduct> getPromotedProducts() {
            return this.promotedProducts;
        }

        @NotNull
        public final TextDTO getSubtitle() {
            return this.subtitle;
        }

        @NotNull
        public final TextDTO getTitle() {
            return this.title;
        }

        public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
            return this.trackingInfo;
        }

        public int hashCode() {
            Long l11 = this.index;
            int a11 = Ns.b.a(this.subtitle, Ns.b.a(this.title, (l11 == null ? 0 : l11.hashCode()) * 31, 31), 31);
            BadgeDTO badgeDTO = this.badge;
            int hashCode = (a11 + (badgeDTO == null ? 0 : badgeDTO.hashCode())) * 31;
            List<PromotedProduct> list = this.promotedProducts;
            int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
            ButtonV3DTO buttonV3DTO = this.button;
            int hashCode3 = (hashCode2 + (buttonV3DTO == null ? 0 : buttonV3DTO.hashCode())) * 31;
            AtomActionDTO atomActionDTO = this.action;
            int hashCode4 = (hashCode3 + (atomActionDTO == null ? 0 : atomActionDTO.hashCode())) * 31;
            Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
            int hashCode5 = (hashCode4 + (map == null ? 0 : map.hashCode())) * 31;
            Paddings paddings = this.paddings;
            return hashCode5 + (paddings != null ? paddings.hashCode() : 0);
        }

        @Override // ru.ozon.app.android.checkoutcomposer.split.data.Indexed
        public void setIndex(Long l11) {
            this.index = l11;
        }

        @NotNull
        public String toString() {
            Long l11 = this.index;
            TextDTO textDTO = this.title;
            TextDTO textDTO2 = this.subtitle;
            BadgeDTO badgeDTO = this.badge;
            List<PromotedProduct> list = this.promotedProducts;
            ButtonV3DTO buttonV3DTO = this.button;
            AtomActionDTO atomActionDTO = this.action;
            Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
            Paddings paddings = this.paddings;
            StringBuilder sb2 = new StringBuilder("SplitProductsBlockDTO(index=");
            sb2.append(l11);
            sb2.append(", title=");
            sb2.append(textDTO);
            sb2.append(", subtitle=");
            sb2.append(textDTO2);
            sb2.append(", badge=");
            sb2.append(badgeDTO);
            sb2.append(", promotedProducts=");
            sb2.append(list);
            sb2.append(", button=");
            sb2.append(buttonV3DTO);
            sb2.append(", action=");
            Sh.b.f(sb2, atomActionDTO, ", trackingInfo=", map, ", paddings=");
            sb2.append(paddings);
            sb2.append(")");
            return sb2.toString();
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B#\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0002\u0010\fJ\t\u0010\u0015\u001a\u00020\u0006HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\bHÆ\u0003J0\u0010\u0017\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0002\u0010\u0018J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cHÖ\u0003J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J\t\u0010\u001f\u001a\u00020\u0006HÖ\u0001R\u001e\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0096\u000e¢\u0006\u0010\n\u0002\u0010\u000f\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006 "}, d2 = {"Lru/ozon/app/android/checkoutcomposer/split/data/SplitElementDTO$SplitSeparatorDTO;", "Lru/ozon/app/android/checkoutcomposer/split/data/SplitElementDTO;", "Lru/ozon/app/android/checkoutcomposer/split/data/Indexed;", "index", "", "color", "", "paddings", "Lru/ozon/app/android/checkoutgeo/checkout/data/Paddings;", "<init>", "(Ljava/lang/Long;Ljava/lang/String;Lru/ozon/app/android/checkoutgeo/checkout/data/Paddings;)V", "getIndex", "()Ljava/lang/Long;", "setIndex", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "getColor", "()Ljava/lang/String;", "getPaddings", "()Lru/ozon/app/android/checkoutgeo/checkout/data/Paddings;", "component1", "component2", "component3", "copy", "(Ljava/lang/Long;Ljava/lang/String;Lru/ozon/app/android/checkoutgeo/checkout/data/Paddings;)Lru/ozon/app/android/checkoutcomposer/split/data/SplitElementDTO$SplitSeparatorDTO;", "equals", "", "other", "", "hashCode", "", "toString", "checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class SplitSeparatorDTO extends SplitElementDTO implements Indexed {
        public static final int $stable = 8;

        @NotNull
        private final String color;
        private Long index;
        private final Paddings paddings;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SplitSeparatorDTO(Long l11, @NotNull String color, Paddings paddings) {
            super(null);
            Intrinsics.checkNotNullParameter(color, "color");
            this.index = l11;
            this.color = color;
            this.paddings = paddings;
        }

        public static /* synthetic */ SplitSeparatorDTO copy$default(SplitSeparatorDTO splitSeparatorDTO, Long l11, String str, Paddings paddings, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                l11 = splitSeparatorDTO.index;
            }
            if ((i11 & 2) != 0) {
                str = splitSeparatorDTO.color;
            }
            if ((i11 & 4) != 0) {
                paddings = splitSeparatorDTO.paddings;
            }
            return splitSeparatorDTO.copy(l11, str, paddings);
        }

        /* renamed from: component1, reason: from getter */
        public final Long getIndex() {
            return this.index;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final String getColor() {
            return this.color;
        }

        /* renamed from: component3, reason: from getter */
        public final Paddings getPaddings() {
            return this.paddings;
        }

        @NotNull
        public final SplitSeparatorDTO copy(Long index, @NotNull String color, Paddings paddings) {
            Intrinsics.checkNotNullParameter(color, "color");
            return new SplitSeparatorDTO(index, color, paddings);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SplitSeparatorDTO)) {
                return false;
            }
            SplitSeparatorDTO splitSeparatorDTO = (SplitSeparatorDTO) other;
            return Intrinsics.d(this.index, splitSeparatorDTO.index) && Intrinsics.d(this.color, splitSeparatorDTO.color) && Intrinsics.d(this.paddings, splitSeparatorDTO.paddings);
        }

        @NotNull
        public final String getColor() {
            return this.color;
        }

        public Long getIndex() {
            return this.index;
        }

        public final Paddings getPaddings() {
            return this.paddings;
        }

        public int hashCode() {
            Long l11 = this.index;
            int a11 = g.a((l11 == null ? 0 : l11.hashCode()) * 31, 31, this.color);
            Paddings paddings = this.paddings;
            return a11 + (paddings != null ? paddings.hashCode() : 0);
        }

        @Override // ru.ozon.app.android.checkoutcomposer.split.data.Indexed
        public void setIndex(Long l11) {
            this.index = l11;
        }

        @NotNull
        public String toString() {
            return "SplitSeparatorDTO(index=" + this.index + ", color=" + this.color + ", paddings=" + this.paddings + ")";
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0016\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B-\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0002\u0010\u000eJ\t\u0010\u001a\u001a\u00020\u0006HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\bHÆ\u0003J\u0010\u0010\u001c\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010\u0017J<\u0010\u001d\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\nHÆ\u0001¢\u0006\u0002\u0010\u001eJ\u0013\u0010\u001f\u001a\u00020\n2\b\u0010 \u001a\u0004\u0018\u00010!HÖ\u0003J\t\u0010\"\u001a\u00020#HÖ\u0001J\t\u0010$\u001a\u00020%HÖ\u0001R\u001e\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0096\u000e¢\u0006\u0010\n\u0002\u0010\u0011\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0015\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\n\n\u0002\u0010\u0018\u001a\u0004\b\u0016\u0010\u0017¨\u0006&"}, d2 = {"Lru/ozon/app/android/checkoutcomposer/split/data/SplitElementDTO$SplitTabsDTO;", "Lru/ozon/app/android/checkoutcomposer/split/data/SplitElementDTO;", "Lru/ozon/app/android/checkoutcomposer/split/data/Indexed;", "index", "", "content", "Lru/ozon/uni/atoms/data/tabs/TabsDTO;", "paddings", "Lru/ozon/app/android/checkoutgeo/checkout/data/Paddings;", "shouldDisableShadow", "", "<init>", "(Ljava/lang/Long;Lru/ozon/uni/atoms/data/tabs/TabsDTO;Lru/ozon/app/android/checkoutgeo/checkout/data/Paddings;Ljava/lang/Boolean;)V", "getIndex", "()Ljava/lang/Long;", "setIndex", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "getContent", "()Lru/ozon/uni/atoms/data/tabs/TabsDTO;", "getPaddings", "()Lru/ozon/app/android/checkoutgeo/checkout/data/Paddings;", "getShouldDisableShadow", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/Long;Lru/ozon/uni/atoms/data/tabs/TabsDTO;Lru/ozon/app/android/checkoutgeo/checkout/data/Paddings;Ljava/lang/Boolean;)Lru/ozon/app/android/checkoutcomposer/split/data/SplitElementDTO$SplitTabsDTO;", "equals", "other", "", "hashCode", "", "toString", "", "checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class SplitTabsDTO extends SplitElementDTO implements Indexed {
        public static final int $stable = 8;

        @NotNull
        private final TabsDTO content;
        private Long index;
        private final Paddings paddings;
        private final Boolean shouldDisableShadow;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SplitTabsDTO(Long l11, @NotNull TabsDTO content, Paddings paddings, Boolean bool) {
            super(null);
            Intrinsics.checkNotNullParameter(content, "content");
            this.index = l11;
            this.content = content;
            this.paddings = paddings;
            this.shouldDisableShadow = bool;
        }

        public static /* synthetic */ SplitTabsDTO copy$default(SplitTabsDTO splitTabsDTO, Long l11, TabsDTO tabsDTO, Paddings paddings, Boolean bool, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                l11 = splitTabsDTO.index;
            }
            if ((i11 & 2) != 0) {
                tabsDTO = splitTabsDTO.content;
            }
            if ((i11 & 4) != 0) {
                paddings = splitTabsDTO.paddings;
            }
            if ((i11 & 8) != 0) {
                bool = splitTabsDTO.shouldDisableShadow;
            }
            return splitTabsDTO.copy(l11, tabsDTO, paddings, bool);
        }

        /* renamed from: component1, reason: from getter */
        public final Long getIndex() {
            return this.index;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final TabsDTO getContent() {
            return this.content;
        }

        /* renamed from: component3, reason: from getter */
        public final Paddings getPaddings() {
            return this.paddings;
        }

        /* renamed from: component4, reason: from getter */
        public final Boolean getShouldDisableShadow() {
            return this.shouldDisableShadow;
        }

        @NotNull
        public final SplitTabsDTO copy(Long index, @NotNull TabsDTO content, Paddings paddings, Boolean shouldDisableShadow) {
            Intrinsics.checkNotNullParameter(content, "content");
            return new SplitTabsDTO(index, content, paddings, shouldDisableShadow);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SplitTabsDTO)) {
                return false;
            }
            SplitTabsDTO splitTabsDTO = (SplitTabsDTO) other;
            return Intrinsics.d(this.index, splitTabsDTO.index) && Intrinsics.d(this.content, splitTabsDTO.content) && Intrinsics.d(this.paddings, splitTabsDTO.paddings) && Intrinsics.d(this.shouldDisableShadow, splitTabsDTO.shouldDisableShadow);
        }

        @NotNull
        public final TabsDTO getContent() {
            return this.content;
        }

        public Long getIndex() {
            return this.index;
        }

        public final Paddings getPaddings() {
            return this.paddings;
        }

        public final Boolean getShouldDisableShadow() {
            return this.shouldDisableShadow;
        }

        public int hashCode() {
            Long l11 = this.index;
            int hashCode = (this.content.hashCode() + ((l11 == null ? 0 : l11.hashCode()) * 31)) * 31;
            Paddings paddings = this.paddings;
            int hashCode2 = (hashCode + (paddings == null ? 0 : paddings.hashCode())) * 31;
            Boolean bool = this.shouldDisableShadow;
            return hashCode2 + (bool != null ? bool.hashCode() : 0);
        }

        @Override // ru.ozon.app.android.checkoutcomposer.split.data.Indexed
        public void setIndex(Long l11) {
            this.index = l11;
        }

        @NotNull
        public String toString() {
            return "SplitTabsDTO(index=" + this.index + ", content=" + this.content + ", paddings=" + this.paddings + ", shouldDisableShadow=" + this.shouldDisableShadow + ")";
        }
    }

    @Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002:\u0001'B3\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0002\u0010\u000fJ\u000f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u000bHÆ\u0003JB\u0010\u001d\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000bHÆ\u0001¢\u0006\u0002\u0010\u001eJ\u0013\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\"HÖ\u0003J\t\u0010#\u001a\u00020$HÖ\u0001J\t\u0010%\u001a\u00020&HÖ\u0001R\u001e\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0096\u000e¢\u0006\u0010\n\u0002\u0010\u0012\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018¨\u0006("}, d2 = {"Lru/ozon/app/android/checkoutcomposer/split/data/SplitElementDTO$SplitTagListDTO;", "Lru/ozon/app/android/checkoutcomposer/split/data/SplitElementDTO;", "Lru/ozon/app/android/checkoutcomposer/split/data/Indexed;", "index", "", "buttons", "", "Lru/ozon/uni/atoms/data/controls/tag/TagButtonDTO;", "tooltip", "Lru/ozon/app/android/checkoutcomposer/split/data/SplitElementDTO$SplitTagListDTO$Tooltip;", "paddings", "Lru/ozon/app/android/checkoutgeo/checkout/data/Paddings;", "<init>", "(Ljava/lang/Long;Ljava/util/List;Lru/ozon/app/android/checkoutcomposer/split/data/SplitElementDTO$SplitTagListDTO$Tooltip;Lru/ozon/app/android/checkoutgeo/checkout/data/Paddings;)V", "getIndex", "()Ljava/lang/Long;", "setIndex", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "getButtons", "()Ljava/util/List;", "getTooltip", "()Lru/ozon/app/android/checkoutcomposer/split/data/SplitElementDTO$SplitTagListDTO$Tooltip;", "getPaddings", "()Lru/ozon/app/android/checkoutgeo/checkout/data/Paddings;", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/Long;Ljava/util/List;Lru/ozon/app/android/checkoutcomposer/split/data/SplitElementDTO$SplitTagListDTO$Tooltip;Lru/ozon/app/android/checkoutgeo/checkout/data/Paddings;)Lru/ozon/app/android/checkoutcomposer/split/data/SplitElementDTO$SplitTagListDTO;", "equals", "", "other", "", "hashCode", "", "toString", "", "Tooltip", "checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @j(generateAdapter = true)
    public static final /* data */ class SplitTagListDTO extends SplitElementDTO implements Indexed {
        public static final int $stable = 8;

        @NotNull
        private final List<TagButtonDTO> buttons;
        private Long index;
        private final Paddings paddings;
        private final Tooltip tooltip;

        @j(generateAdapter = true)
        @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u0006\u0010\u0013\u001a\u00020\u0014J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0010J\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0010J:\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0002\u0010\u001aJ\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\u0005HÖ\u0001J\t\u0010\u001f\u001a\u00020 HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u000f\u0010\u0010R\u0015\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u0012\u0010\u0010¨\u0006!"}, d2 = {"Lru/ozon/app/android/checkoutcomposer/split/data/SplitElementDTO$SplitTagListDTO$Tooltip;", "", "tooltip", "Lru/ozon/uni/atoms/data/common/TooltipDTO;", "index", "", "timeout", "", "showDelay", "<init>", "(Lru/ozon/uni/atoms/data/common/TooltipDTO;ILjava/lang/Long;Ljava/lang/Long;)V", "getTooltip", "()Lru/ozon/uni/atoms/data/common/TooltipDTO;", "getIndex", "()I", "getTimeout", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getShowDelay", "toVO", "Lru/ozon/app/android/checkoutcomposer/split/presentation/elements/tagList/TagListVO$TagItemVO$TooltipVO;", "component1", "component2", "component3", "component4", "copy", "(Lru/ozon/uni/atoms/data/common/TooltipDTO;ILjava/lang/Long;Ljava/lang/Long;)Lru/ozon/app/android/checkoutcomposer/split/data/SplitElementDTO$SplitTagListDTO$Tooltip;", "equals", "", "other", "hashCode", "toString", "", "checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Tooltip {
            public static final int $stable = TooltipDTO.$stable;
            private final int index;
            private final Long showDelay;
            private final Long timeout;

            @NotNull
            private final TooltipDTO tooltip;

            public Tooltip(@NotNull TooltipDTO tooltip, int i11, Long l11, Long l12) {
                Intrinsics.checkNotNullParameter(tooltip, "tooltip");
                this.tooltip = tooltip;
                this.index = i11;
                this.timeout = l11;
                this.showDelay = l12;
            }

            public static /* synthetic */ Tooltip copy$default(Tooltip tooltip, TooltipDTO tooltipDTO, int i11, Long l11, Long l12, int i12, Object obj) {
                if ((i12 & 1) != 0) {
                    tooltipDTO = tooltip.tooltip;
                }
                if ((i12 & 2) != 0) {
                    i11 = tooltip.index;
                }
                if ((i12 & 4) != 0) {
                    l11 = tooltip.timeout;
                }
                if ((i12 & 8) != 0) {
                    l12 = tooltip.showDelay;
                }
                return tooltip.copy(tooltipDTO, i11, l11, l12);
            }

            @NotNull
            /* renamed from: component1, reason: from getter */
            public final TooltipDTO getTooltip() {
                return this.tooltip;
            }

            /* renamed from: component2, reason: from getter */
            public final int getIndex() {
                return this.index;
            }

            /* renamed from: component3, reason: from getter */
            public final Long getTimeout() {
                return this.timeout;
            }

            /* renamed from: component4, reason: from getter */
            public final Long getShowDelay() {
                return this.showDelay;
            }

            @NotNull
            public final Tooltip copy(@NotNull TooltipDTO tooltip, int index, Long timeout, Long showDelay) {
                Intrinsics.checkNotNullParameter(tooltip, "tooltip");
                return new Tooltip(tooltip, index, timeout, showDelay);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Tooltip)) {
                    return false;
                }
                Tooltip tooltip = (Tooltip) other;
                return Intrinsics.d(this.tooltip, tooltip.tooltip) && this.index == tooltip.index && Intrinsics.d(this.timeout, tooltip.timeout) && Intrinsics.d(this.showDelay, tooltip.showDelay);
            }

            public final int getIndex() {
                return this.index;
            }

            public final Long getShowDelay() {
                return this.showDelay;
            }

            public final Long getTimeout() {
                return this.timeout;
            }

            @NotNull
            public final TooltipDTO getTooltip() {
                return this.tooltip;
            }

            public int hashCode() {
                int a11 = C2454a.a(this.index, this.tooltip.hashCode() * 31, 31);
                Long l11 = this.timeout;
                int hashCode = (a11 + (l11 == null ? 0 : l11.hashCode())) * 31;
                Long l12 = this.showDelay;
                return hashCode + (l12 != null ? l12.hashCode() : 0);
            }

            @NotNull
            public String toString() {
                return "Tooltip(tooltip=" + this.tooltip + ", index=" + this.index + ", timeout=" + this.timeout + ", showDelay=" + this.showDelay + ")";
            }

            @NotNull
            public final TagListVO.TagItemVO.TooltipVO toVO() {
                return new TagListVO.TagItemVO.TooltipVO(CartTooltipVOKt.toCartTooltipVO(this.tooltip), this.index, this.timeout, this.showDelay);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SplitTagListDTO(Long l11, @NotNull List<TagButtonDTO> buttons, Tooltip tooltip, Paddings paddings) {
            super(null);
            Intrinsics.checkNotNullParameter(buttons, "buttons");
            this.index = l11;
            this.buttons = buttons;
            this.tooltip = tooltip;
            this.paddings = paddings;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ SplitTagListDTO copy$default(SplitTagListDTO splitTagListDTO, Long l11, List list, Tooltip tooltip, Paddings paddings, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                l11 = splitTagListDTO.index;
            }
            if ((i11 & 2) != 0) {
                list = splitTagListDTO.buttons;
            }
            if ((i11 & 4) != 0) {
                tooltip = splitTagListDTO.tooltip;
            }
            if ((i11 & 8) != 0) {
                paddings = splitTagListDTO.paddings;
            }
            return splitTagListDTO.copy(l11, list, tooltip, paddings);
        }

        /* renamed from: component1, reason: from getter */
        public final Long getIndex() {
            return this.index;
        }

        @NotNull
        public final List<TagButtonDTO> component2() {
            return this.buttons;
        }

        /* renamed from: component3, reason: from getter */
        public final Tooltip getTooltip() {
            return this.tooltip;
        }

        /* renamed from: component4, reason: from getter */
        public final Paddings getPaddings() {
            return this.paddings;
        }

        @NotNull
        public final SplitTagListDTO copy(Long index, @NotNull List<TagButtonDTO> buttons, Tooltip tooltip, Paddings paddings) {
            Intrinsics.checkNotNullParameter(buttons, "buttons");
            return new SplitTagListDTO(index, buttons, tooltip, paddings);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SplitTagListDTO)) {
                return false;
            }
            SplitTagListDTO splitTagListDTO = (SplitTagListDTO) other;
            return Intrinsics.d(this.index, splitTagListDTO.index) && Intrinsics.d(this.buttons, splitTagListDTO.buttons) && Intrinsics.d(this.tooltip, splitTagListDTO.tooltip) && Intrinsics.d(this.paddings, splitTagListDTO.paddings);
        }

        @NotNull
        public final List<TagButtonDTO> getButtons() {
            return this.buttons;
        }

        public Long getIndex() {
            return this.index;
        }

        public final Paddings getPaddings() {
            return this.paddings;
        }

        public final Tooltip getTooltip() {
            return this.tooltip;
        }

        public int hashCode() {
            Long l11 = this.index;
            int b11 = g.b((l11 == null ? 0 : l11.hashCode()) * 31, 31, this.buttons);
            Tooltip tooltip = this.tooltip;
            int hashCode = (b11 + (tooltip == null ? 0 : tooltip.hashCode())) * 31;
            Paddings paddings = this.paddings;
            return hashCode + (paddings != null ? paddings.hashCode() : 0);
        }

        @Override // ru.ozon.app.android.checkoutcomposer.split.data.Indexed
        public void setIndex(Long l11) {
            this.index = l11;
        }

        @NotNull
        public String toString() {
            return "SplitTagListDTO(index=" + this.index + ", buttons=" + this.buttons + ", tooltip=" + this.tooltip + ", paddings=" + this.paddings + ")";
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B\u0019\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0002\u0010\nJ\t\u0010\u0011\u001a\u00020\u0006HÆ\u0003J$\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001¢\u0006\u0002\u0010\u0013J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0006HÖ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001R\u001e\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0096\u000e¢\u0006\u0010\n\u0002\u0010\r\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001b"}, d2 = {"Lru/ozon/app/android/checkoutcomposer/split/data/SplitElementDTO$SplitVerticalSpacerDTO;", "Lru/ozon/app/android/checkoutcomposer/split/data/SplitElementDTO;", "Lru/ozon/app/android/checkoutcomposer/split/data/Indexed;", "index", "", "spacing", "", "<init>", "(Ljava/lang/Long;I)V", "getIndex", "()Ljava/lang/Long;", "setIndex", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "getSpacing", "()I", "component1", "component2", "copy", "(Ljava/lang/Long;I)Lru/ozon/app/android/checkoutcomposer/split/data/SplitElementDTO$SplitVerticalSpacerDTO;", "equals", "", "other", "", "hashCode", "toString", "", "checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class SplitVerticalSpacerDTO extends SplitElementDTO implements Indexed {
        public static final int $stable = 8;
        private Long index;
        private final int spacing;

        public SplitVerticalSpacerDTO(Long l11, int i11) {
            super(null);
            this.index = l11;
            this.spacing = i11;
        }

        public static /* synthetic */ SplitVerticalSpacerDTO copy$default(SplitVerticalSpacerDTO splitVerticalSpacerDTO, Long l11, int i11, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                l11 = splitVerticalSpacerDTO.index;
            }
            if ((i12 & 2) != 0) {
                i11 = splitVerticalSpacerDTO.spacing;
            }
            return splitVerticalSpacerDTO.copy(l11, i11);
        }

        /* renamed from: component1, reason: from getter */
        public final Long getIndex() {
            return this.index;
        }

        /* renamed from: component2, reason: from getter */
        public final int getSpacing() {
            return this.spacing;
        }

        @NotNull
        public final SplitVerticalSpacerDTO copy(Long index, int spacing) {
            return new SplitVerticalSpacerDTO(index, spacing);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SplitVerticalSpacerDTO)) {
                return false;
            }
            SplitVerticalSpacerDTO splitVerticalSpacerDTO = (SplitVerticalSpacerDTO) other;
            return Intrinsics.d(this.index, splitVerticalSpacerDTO.index) && this.spacing == splitVerticalSpacerDTO.spacing;
        }

        public Long getIndex() {
            return this.index;
        }

        public final int getSpacing() {
            return this.spacing;
        }

        public int hashCode() {
            Long l11 = this.index;
            return Integer.hashCode(this.spacing) + ((l11 == null ? 0 : l11.hashCode()) * 31);
        }

        @Override // ru.ozon.app.android.checkoutcomposer.split.data.Indexed
        public void setIndex(Long l11) {
            this.index = l11;
        }

        @NotNull
        public String toString() {
            return "SplitVerticalSpacerDTO(index=" + this.index + ", spacing=" + this.spacing + ")";
        }
    }

    public /* synthetic */ SplitElementDTO(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private SplitElementDTO() {
    }

    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002:\u0001'B1\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0002\u0010\u000fJ\u000f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003J\u0010\u0010\u001c\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010\u0016J\t\u0010\u001d\u001a\u00020\u000bHÆ\u0003J@\u0010\u001e\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\n\u001a\u00020\u000bHÆ\u0001¢\u0006\u0002\u0010\u001fJ\u0013\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010#HÖ\u0003J\t\u0010$\u001a\u00020\tHÖ\u0001J\t\u0010%\u001a\u00020&HÖ\u0001R\u001e\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0096\u000e¢\u0006\u0010\n\u0002\u0010\u0012\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0015\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\n\n\u0002\u0010\u0017\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019¨\u0006("}, d2 = {"Lru/ozon/app/android/checkoutcomposer/split/data/SplitElementDTO$SplitLogosCarouselDTO;", "Lru/ozon/app/android/checkoutcomposer/split/data/SplitElementDTO;", "Lru/ozon/app/android/checkoutcomposer/split/data/Indexed;", "index", "", "elements", "", "Lru/ozon/app/android/checkoutcomposer/split/data/SplitElementDTO$SplitLogosCarouselDTO$LogosElement;", "scrollPosition", "", "paddings", "Lru/ozon/app/android/checkoutgeo/checkout/data/Paddings;", "<init>", "(Ljava/lang/Long;Ljava/util/List;Ljava/lang/Integer;Lru/ozon/app/android/checkoutgeo/checkout/data/Paddings;)V", "getIndex", "()Ljava/lang/Long;", "setIndex", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "getElements", "()Ljava/util/List;", "getScrollPosition", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getPaddings", "()Lru/ozon/app/android/checkoutgeo/checkout/data/Paddings;", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/Long;Ljava/util/List;Ljava/lang/Integer;Lru/ozon/app/android/checkoutgeo/checkout/data/Paddings;)Lru/ozon/app/android/checkoutcomposer/split/data/SplitElementDTO$SplitLogosCarouselDTO;", "equals", "", "other", "", "hashCode", "toString", "", "LogosElement", "checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @j(generateAdapter = true)
    public static final /* data */ class SplitLogosCarouselDTO extends SplitElementDTO implements Indexed {
        public static final int $stable = 8;

        @NotNull
        private final List<LogosElement> elements;
        private Long index;

        @NotNull
        private final Paddings paddings;
        private final Integer scrollPosition;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SplitLogosCarouselDTO(Long l11, @NotNull List<LogosElement> elements, Integer num, @NotNull Paddings paddings) {
            super(null);
            Intrinsics.checkNotNullParameter(elements, "elements");
            Intrinsics.checkNotNullParameter(paddings, "paddings");
            this.index = l11;
            this.elements = elements;
            this.scrollPosition = num;
            this.paddings = paddings;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ SplitLogosCarouselDTO copy$default(SplitLogosCarouselDTO splitLogosCarouselDTO, Long l11, List list, Integer num, Paddings paddings, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                l11 = splitLogosCarouselDTO.index;
            }
            if ((i11 & 2) != 0) {
                list = splitLogosCarouselDTO.elements;
            }
            if ((i11 & 4) != 0) {
                num = splitLogosCarouselDTO.scrollPosition;
            }
            if ((i11 & 8) != 0) {
                paddings = splitLogosCarouselDTO.paddings;
            }
            return splitLogosCarouselDTO.copy(l11, list, num, paddings);
        }

        /* renamed from: component1, reason: from getter */
        public final Long getIndex() {
            return this.index;
        }

        @NotNull
        public final List<LogosElement> component2() {
            return this.elements;
        }

        /* renamed from: component3, reason: from getter */
        public final Integer getScrollPosition() {
            return this.scrollPosition;
        }

        @NotNull
        /* renamed from: component4, reason: from getter */
        public final Paddings getPaddings() {
            return this.paddings;
        }

        @NotNull
        public final SplitLogosCarouselDTO copy(Long index, @NotNull List<LogosElement> elements, Integer scrollPosition, @NotNull Paddings paddings) {
            Intrinsics.checkNotNullParameter(elements, "elements");
            Intrinsics.checkNotNullParameter(paddings, "paddings");
            return new SplitLogosCarouselDTO(index, elements, scrollPosition, paddings);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SplitLogosCarouselDTO)) {
                return false;
            }
            SplitLogosCarouselDTO splitLogosCarouselDTO = (SplitLogosCarouselDTO) other;
            return Intrinsics.d(this.index, splitLogosCarouselDTO.index) && Intrinsics.d(this.elements, splitLogosCarouselDTO.elements) && Intrinsics.d(this.scrollPosition, splitLogosCarouselDTO.scrollPosition) && Intrinsics.d(this.paddings, splitLogosCarouselDTO.paddings);
        }

        @NotNull
        public final List<LogosElement> getElements() {
            return this.elements;
        }

        public Long getIndex() {
            return this.index;
        }

        @NotNull
        public final Paddings getPaddings() {
            return this.paddings;
        }

        public final Integer getScrollPosition() {
            return this.scrollPosition;
        }

        public int hashCode() {
            Long l11 = this.index;
            int b11 = g.b((l11 == null ? 0 : l11.hashCode()) * 31, 31, this.elements);
            Integer num = this.scrollPosition;
            return this.paddings.hashCode() + ((b11 + (num != null ? num.hashCode() : 0)) * 31);
        }

        @Override // ru.ozon.app.android.checkoutcomposer.split.data.Indexed
        public void setIndex(Long l11) {
            this.index = l11;
        }

        @NotNull
        public String toString() {
            return "SplitLogosCarouselDTO(index=" + this.index + ", elements=" + this.elements + ", scrollPosition=" + this.scrollPosition + ", paddings=" + this.paddings + ")";
        }

        @j(generateAdapter = true)
        @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BM\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0006\u0010\u001a\u001a\u00020\u001bJ\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0007HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u0017\u0010 \u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0018\u00010\nHÆ\u0003J\u0010\u0010!\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0018J^\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0018\u00010\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010#J\u0013\u0010$\u001a\u00020\u00032\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010&\u001a\u00020'HÖ\u0001J\t\u0010(\u001a\u00020\u000bHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0010R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u001f\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0015\u0010\r\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0019\u001a\u0004\b\r\u0010\u0018¨\u0006)"}, d2 = {"Lru/ozon/app/android/checkoutcomposer/split/data/SplitElementDTO$SplitLogosCarouselDTO$LogosElement;", "", "isSelected", "", "action", "Lru/ozon/uni/atoms/data/AtomActionDTO;", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/text/TextDTO;", "subtitle", "trackingInfo", "", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "isSelectable", "<init>", "(ZLru/ozon/uni/atoms/data/AtomActionDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Ljava/util/Map;Ljava/lang/Boolean;)V", "()Z", "getAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getSubtitle", "getTrackingInfo", "()Ljava/util/Map;", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "toVO", "Lru/ozon/app/android/checkoutcomposer/split/presentation/elements/carouselSelector/LogosCarouselVO$LogosElementVO;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "(ZLru/ozon/uni/atoms/data/AtomActionDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Ljava/util/Map;Ljava/lang/Boolean;)Lru/ozon/app/android/checkoutcomposer/split/data/SplitElementDTO$SplitLogosCarouselDTO$LogosElement;", "equals", "other", "hashCode", "", "toString", "checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class LogosElement {
            public static final int $stable = 8;
            private final AtomActionDTO action;
            private final Boolean isSelectable;
            private final boolean isSelected;
            private final TextDTO subtitle;

            @NotNull
            private final TextDTO title;
            private final Map<String, TokenizedTrackingInfo> trackingInfo;

            public LogosElement(boolean z11, AtomActionDTO atomActionDTO, @NotNull TextDTO title, TextDTO textDTO, Map<String, TokenizedTrackingInfo> map, Boolean bool) {
                Intrinsics.checkNotNullParameter(title, "title");
                this.isSelected = z11;
                this.action = atomActionDTO;
                this.title = title;
                this.subtitle = textDTO;
                this.trackingInfo = map;
                this.isSelectable = bool;
            }

            public static /* synthetic */ LogosElement copy$default(LogosElement logosElement, boolean z11, AtomActionDTO atomActionDTO, TextDTO textDTO, TextDTO textDTO2, Map map, Boolean bool, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    z11 = logosElement.isSelected;
                }
                if ((i11 & 2) != 0) {
                    atomActionDTO = logosElement.action;
                }
                if ((i11 & 4) != 0) {
                    textDTO = logosElement.title;
                }
                if ((i11 & 8) != 0) {
                    textDTO2 = logosElement.subtitle;
                }
                if ((i11 & 16) != 0) {
                    map = logosElement.trackingInfo;
                }
                if ((i11 & 32) != 0) {
                    bool = logosElement.isSelectable;
                }
                Map map2 = map;
                Boolean bool2 = bool;
                return logosElement.copy(z11, atomActionDTO, textDTO, textDTO2, map2, bool2);
            }

            /* renamed from: component1, reason: from getter */
            public final boolean getIsSelected() {
                return this.isSelected;
            }

            /* renamed from: component2, reason: from getter */
            public final AtomActionDTO getAction() {
                return this.action;
            }

            @NotNull
            /* renamed from: component3, reason: from getter */
            public final TextDTO getTitle() {
                return this.title;
            }

            /* renamed from: component4, reason: from getter */
            public final TextDTO getSubtitle() {
                return this.subtitle;
            }

            public final Map<String, TokenizedTrackingInfo> component5() {
                return this.trackingInfo;
            }

            /* renamed from: component6, reason: from getter */
            public final Boolean getIsSelectable() {
                return this.isSelectable;
            }

            @NotNull
            public final LogosElement copy(boolean isSelected, AtomActionDTO action, @NotNull TextDTO title, TextDTO subtitle, Map<String, TokenizedTrackingInfo> trackingInfo, Boolean isSelectable) {
                Intrinsics.checkNotNullParameter(title, "title");
                return new LogosElement(isSelected, action, title, subtitle, trackingInfo, isSelectable);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof LogosElement)) {
                    return false;
                }
                LogosElement logosElement = (LogosElement) other;
                return this.isSelected == logosElement.isSelected && Intrinsics.d(this.action, logosElement.action) && Intrinsics.d(this.title, logosElement.title) && Intrinsics.d(this.subtitle, logosElement.subtitle) && Intrinsics.d(this.trackingInfo, logosElement.trackingInfo) && Intrinsics.d(this.isSelectable, logosElement.isSelectable);
            }

            public final AtomActionDTO getAction() {
                return this.action;
            }

            public final TextDTO getSubtitle() {
                return this.subtitle;
            }

            @NotNull
            public final TextDTO getTitle() {
                return this.title;
            }

            public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
                return this.trackingInfo;
            }

            public int hashCode() {
                int hashCode = Boolean.hashCode(this.isSelected) * 31;
                AtomActionDTO atomActionDTO = this.action;
                int a11 = Ns.b.a(this.title, (hashCode + (atomActionDTO == null ? 0 : atomActionDTO.hashCode())) * 31, 31);
                TextDTO textDTO = this.subtitle;
                int hashCode2 = (a11 + (textDTO == null ? 0 : textDTO.hashCode())) * 31;
                Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
                int hashCode3 = (hashCode2 + (map == null ? 0 : map.hashCode())) * 31;
                Boolean bool = this.isSelectable;
                return hashCode3 + (bool != null ? bool.hashCode() : 0);
            }

            public final Boolean isSelectable() {
                return this.isSelectable;
            }

            public final boolean isSelected() {
                return this.isSelected;
            }

            @NotNull
            public String toString() {
                boolean z11 = this.isSelected;
                AtomActionDTO atomActionDTO = this.action;
                TextDTO textDTO = this.title;
                TextDTO textDTO2 = this.subtitle;
                Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
                Boolean bool = this.isSelectable;
                StringBuilder sb2 = new StringBuilder("LogosElement(isSelected=");
                sb2.append(z11);
                sb2.append(", action=");
                sb2.append(atomActionDTO);
                sb2.append(", title=");
                d.e(", subtitle=", ", trackingInfo=", sb2, textDTO, textDTO2);
                sb2.append(map);
                sb2.append(", isSelectable=");
                sb2.append(bool);
                sb2.append(")");
                return sb2.toString();
            }

            @NotNull
            public final LogosCarouselVO.LogosElementVO toVO() {
                boolean z11 = this.isSelected;
                TextDTO textDTO = this.title;
                TextDTO textDTO2 = this.subtitle;
                AtomActionDTO atomActionDTO = this.action;
                Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
                Boolean bool = this.isSelectable;
                return new LogosCarouselVO.LogosElementVO(z11, textDTO, textDTO2, atomActionDTO, map, bool != null ? bool.booleanValue() : false);
            }

            public /* synthetic */ LogosElement(boolean z11, AtomActionDTO atomActionDTO, TextDTO textDTO, TextDTO textDTO2, Map map, Boolean bool, int i11, DefaultConstructorMarker defaultConstructorMarker) {
                this((i11 & 1) != 0 ? false : z11, atomActionDTO, textDTO, textDTO2, map, bool);
            }
        }
    }
}
