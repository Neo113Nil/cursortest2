package ru.ozon.app.android.fresh.checkout.widgets.premiumPointsTrain.data;

import B3.p;
import C.o0;
import D3.g;
import K1.G;
import N3.C3660k;
import Nh.a;
import T7.P;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.squareup.moshi.j;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.moshi.adapters.serialize.proto.ProtoOneOf;
import ru.ozon.moshi.adapters.serialize.proto.ProtoOneOfSignature;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@ProtoOneOfSignature.Container({@ProtoOneOfSignature(name = "singleCarriageTrain", type = SingleCarriageTrainFresh.class), @ProtoOneOfSignature(name = "multipleCarriageTrain", type = MultipleCarriageTrainFresh.class)})
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u00042\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0007\b¨\u0006\t"}, d2 = {"Lru/ozon/app/android/fresh/checkout/widgets/premiumPointsTrain/data/FreshPremiumPointsTrainDTO;", "", "<init>", "()V", "Companion", "SingleCarriageTrainFresh", "MultipleCarriageTrainFresh", "Lru/ozon/app/android/fresh/checkout/widgets/premiumPointsTrain/data/FreshPremiumPointsTrainDTO$MultipleCarriageTrainFresh;", "Lru/ozon/app/android/fresh/checkout/widgets/premiumPointsTrain/data/FreshPremiumPointsTrainDTO$SingleCarriageTrainFresh;", "widgets-checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@ProtoOneOf(label = "type")
/* loaded from: classes12.dex */
public abstract class FreshPremiumPointsTrainDTO {
    public static final int $stable = 0;

    @NotNull
    public static final String MULTIPLE_CARRIAGE_TRAIN = "multipleCarriageTrain";

    @NotNull
    public static final String SINGLE_CARRIAGE_TRAIN = "singleCarriageTrain";

    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u001eB7\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0018\u00010\b¢\u0006\u0004\b\u000b\u0010\fJ\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003J\u0017\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0018\u00010\bHÆ\u0003J?\u0010\u0016\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0018\u00010\bHÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aHÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\tHÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0019\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u001f\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001f"}, d2 = {"Lru/ozon/app/android/fresh/checkout/widgets/premiumPointsTrain/data/FreshPremiumPointsTrainDTO$MultipleCarriageTrainFresh;", "Lru/ozon/app/android/fresh/checkout/widgets/premiumPointsTrain/data/FreshPremiumPointsTrainDTO;", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/text/TextDTO;", "premiumPointsItems", "", "Lru/ozon/app/android/fresh/checkout/widgets/premiumPointsTrain/data/FreshPremiumPointsTrainDTO$MultipleCarriageTrainFresh$PremiumPointsItem;", "trackingInfo", "", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Lru/ozon/uni/atoms/data/text/TextDTO;Ljava/util/List;Ljava/util/Map;)V", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getPremiumPointsItems", "()Ljava/util/List;", "getTrackingInfo", "()Ljava/util/Map;", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "PremiumPointsItem", "widgets-checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @j(generateAdapter = true)
    public static final /* data */ class MultipleCarriageTrainFresh extends FreshPremiumPointsTrainDTO {
        public static final int $stable = 8;
        private final List<PremiumPointsItem> premiumPointsItems;
        private final TextDTO title;
        private final Map<String, TokenizedTrackingInfo> trackingInfo;

        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"Lru/ozon/app/android/fresh/checkout/widgets/premiumPointsTrain/data/FreshPremiumPointsTrainDTO$MultipleCarriageTrainFresh$PremiumPointsItem;", "", "<init>", "()V", "HeadCarriage", "TailCarriage", "SignItem", "Lru/ozon/app/android/fresh/checkout/widgets/premiumPointsTrain/data/FreshPremiumPointsTrainDTO$MultipleCarriageTrainFresh$PremiumPointsItem$HeadCarriage;", "Lru/ozon/app/android/fresh/checkout/widgets/premiumPointsTrain/data/FreshPremiumPointsTrainDTO$MultipleCarriageTrainFresh$PremiumPointsItem$SignItem;", "Lru/ozon/app/android/fresh/checkout/widgets/premiumPointsTrain/data/FreshPremiumPointsTrainDTO$MultipleCarriageTrainFresh$PremiumPointsItem$TailCarriage;", "widgets-checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        @ProtoOneOfSignature.Container({@ProtoOneOfSignature(name = "headCarriage", type = HeadCarriage.class), @ProtoOneOfSignature(name = "tailCarriage", type = TailCarriage.class), @ProtoOneOfSignature(name = "signItem", type = SignItem.class)})
        @ProtoOneOf(label = "type")
        public static abstract class PremiumPointsItem {
            public static final int $stable = 0;

            @j(generateAdapter = true)
            @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BC\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\bHÆ\u0003J\u0017\u0010\u001b\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nHÆ\u0003JO\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nHÆ\u0001J\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010 HÖ\u0003J\t\u0010!\u001a\u00020\"HÖ\u0001J\t\u0010#\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u001f\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016¨\u0006$"}, d2 = {"Lru/ozon/app/android/fresh/checkout/widgets/premiumPointsTrain/data/FreshPremiumPointsTrainDTO$MultipleCarriageTrainFresh$PremiumPointsItem$HeadCarriage;", "Lru/ozon/app/android/fresh/checkout/widgets/premiumPointsTrain/data/FreshPremiumPointsTrainDTO$MultipleCarriageTrainFresh$PremiumPointsItem;", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/text/TextDTO;", "icon", "", "iconTint", "action", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "trackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Lru/ozon/uni/atoms/data/text/TextDTO;Ljava/lang/String;Ljava/lang/String;Lru/ozon/uni/atoms/data/AtomActionDTO;Ljava/util/Map;)V", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getIcon", "()Ljava/lang/String;", "getIconTint", "getAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "getTrackingInfo", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "", "hashCode", "", "toString", "widgets-checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
            public static final /* data */ class HeadCarriage extends PremiumPointsItem {
                public static final int $stable = 8;
                private final AtomActionDTO action;
                private final String icon;
                private final String iconTint;

                @NotNull
                private final TextDTO title;
                private final Map<String, TokenizedTrackingInfo> trackingInfo;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public HeadCarriage(@NotNull TextDTO title, String str, String str2, AtomActionDTO atomActionDTO, Map<String, TokenizedTrackingInfo> map) {
                    super(null);
                    Intrinsics.checkNotNullParameter(title, "title");
                    this.title = title;
                    this.icon = str;
                    this.iconTint = str2;
                    this.action = atomActionDTO;
                    this.trackingInfo = map;
                }

                public static /* synthetic */ HeadCarriage copy$default(HeadCarriage headCarriage, TextDTO textDTO, String str, String str2, AtomActionDTO atomActionDTO, Map map, int i11, Object obj) {
                    if ((i11 & 1) != 0) {
                        textDTO = headCarriage.title;
                    }
                    if ((i11 & 2) != 0) {
                        str = headCarriage.icon;
                    }
                    if ((i11 & 4) != 0) {
                        str2 = headCarriage.iconTint;
                    }
                    if ((i11 & 8) != 0) {
                        atomActionDTO = headCarriage.action;
                    }
                    if ((i11 & 16) != 0) {
                        map = headCarriage.trackingInfo;
                    }
                    Map map2 = map;
                    String str3 = str2;
                    return headCarriage.copy(textDTO, str, str3, atomActionDTO, map2);
                }

                @NotNull
                /* renamed from: component1, reason: from getter */
                public final TextDTO getTitle() {
                    return this.title;
                }

                /* renamed from: component2, reason: from getter */
                public final String getIcon() {
                    return this.icon;
                }

                /* renamed from: component3, reason: from getter */
                public final String getIconTint() {
                    return this.iconTint;
                }

                /* renamed from: component4, reason: from getter */
                public final AtomActionDTO getAction() {
                    return this.action;
                }

                public final Map<String, TokenizedTrackingInfo> component5() {
                    return this.trackingInfo;
                }

                @NotNull
                public final HeadCarriage copy(@NotNull TextDTO title, String icon, String iconTint, AtomActionDTO action, Map<String, TokenizedTrackingInfo> trackingInfo) {
                    Intrinsics.checkNotNullParameter(title, "title");
                    return new HeadCarriage(title, icon, iconTint, action, trackingInfo);
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof HeadCarriage)) {
                        return false;
                    }
                    HeadCarriage headCarriage = (HeadCarriage) other;
                    return Intrinsics.d(this.title, headCarriage.title) && Intrinsics.d(this.icon, headCarriage.icon) && Intrinsics.d(this.iconTint, headCarriage.iconTint) && Intrinsics.d(this.action, headCarriage.action) && Intrinsics.d(this.trackingInfo, headCarriage.trackingInfo);
                }

                public final AtomActionDTO getAction() {
                    return this.action;
                }

                public final String getIcon() {
                    return this.icon;
                }

                public final String getIconTint() {
                    return this.iconTint;
                }

                @NotNull
                public final TextDTO getTitle() {
                    return this.title;
                }

                public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
                    return this.trackingInfo;
                }

                public int hashCode() {
                    int hashCode = this.title.hashCode() * 31;
                    String str = this.icon;
                    int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
                    String str2 = this.iconTint;
                    int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
                    AtomActionDTO atomActionDTO = this.action;
                    int hashCode4 = (hashCode3 + (atomActionDTO == null ? 0 : atomActionDTO.hashCode())) * 31;
                    Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
                    return hashCode4 + (map != null ? map.hashCode() : 0);
                }

                @NotNull
                public String toString() {
                    TextDTO textDTO = this.title;
                    String str = this.icon;
                    String str2 = this.iconTint;
                    AtomActionDTO atomActionDTO = this.action;
                    Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
                    StringBuilder f7 = g.f("HeadCarriage(title=", textDTO, ", icon=", str, ", iconTint=");
                    p.c(str2, ", action=", ", trackingInfo=", f7, atomActionDTO);
                    return P.f(f7, map, ")");
                }
            }

            @j(generateAdapter = true)
            @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\fJ\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J0\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u0013J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\n¨\u0006\u001a"}, d2 = {"Lru/ozon/app/android/fresh/checkout/widgets/premiumPointsTrain/data/FreshPremiumPointsTrainDTO$MultipleCarriageTrainFresh$PremiumPointsItem$SignItem;", "Lru/ozon/app/android/fresh/checkout/widgets/premiumPointsTrain/data/FreshPremiumPointsTrainDTO$MultipleCarriageTrainFresh$PremiumPointsItem;", "signIcon", "", "signSize", "", "signIconTint", "<init>", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;)V", "getSignIcon", "()Ljava/lang/String;", "getSignSize", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getSignIconTint", "component1", "component2", "component3", "copy", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;)Lru/ozon/app/android/fresh/checkout/widgets/premiumPointsTrain/data/FreshPremiumPointsTrainDTO$MultipleCarriageTrainFresh$PremiumPointsItem$SignItem;", "equals", "", "other", "", "hashCode", "toString", "widgets-checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
            public static final /* data */ class SignItem extends PremiumPointsItem {
                public static final int $stable = 0;

                @NotNull
                private final String signIcon;
                private final String signIconTint;
                private final Integer signSize;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public SignItem(@NotNull String signIcon, Integer num, String str) {
                    super(null);
                    Intrinsics.checkNotNullParameter(signIcon, "signIcon");
                    this.signIcon = signIcon;
                    this.signSize = num;
                    this.signIconTint = str;
                }

                public static /* synthetic */ SignItem copy$default(SignItem signItem, String str, Integer num, String str2, int i11, Object obj) {
                    if ((i11 & 1) != 0) {
                        str = signItem.signIcon;
                    }
                    if ((i11 & 2) != 0) {
                        num = signItem.signSize;
                    }
                    if ((i11 & 4) != 0) {
                        str2 = signItem.signIconTint;
                    }
                    return signItem.copy(str, num, str2);
                }

                @NotNull
                /* renamed from: component1, reason: from getter */
                public final String getSignIcon() {
                    return this.signIcon;
                }

                /* renamed from: component2, reason: from getter */
                public final Integer getSignSize() {
                    return this.signSize;
                }

                /* renamed from: component3, reason: from getter */
                public final String getSignIconTint() {
                    return this.signIconTint;
                }

                @NotNull
                public final SignItem copy(@NotNull String signIcon, Integer signSize, String signIconTint) {
                    Intrinsics.checkNotNullParameter(signIcon, "signIcon");
                    return new SignItem(signIcon, signSize, signIconTint);
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof SignItem)) {
                        return false;
                    }
                    SignItem signItem = (SignItem) other;
                    return Intrinsics.d(this.signIcon, signItem.signIcon) && Intrinsics.d(this.signSize, signItem.signSize) && Intrinsics.d(this.signIconTint, signItem.signIconTint);
                }

                @NotNull
                public final String getSignIcon() {
                    return this.signIcon;
                }

                public final String getSignIconTint() {
                    return this.signIconTint;
                }

                public final Integer getSignSize() {
                    return this.signSize;
                }

                public int hashCode() {
                    int hashCode = this.signIcon.hashCode() * 31;
                    Integer num = this.signSize;
                    int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
                    String str = this.signIconTint;
                    return hashCode2 + (str != null ? str.hashCode() : 0);
                }

                @NotNull
                public String toString() {
                    String str = this.signIcon;
                    Integer num = this.signSize;
                    return o0.c(J0.P.b("SignItem(signIcon=", str, num, ", signSize=", ", signIconTint="), this.signIconTint, ")");
                }
            }

            @j(generateAdapter = true)
            @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001Bk\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\u0014\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u0017\u0010%\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000e\u0018\u00010\rHÆ\u0003J\u007f\u0010&\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0016\b\u0002\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000e\u0018\u00010\rHÆ\u0001J\u0013\u0010'\u001a\u00020(2\b\u0010)\u001a\u0004\u0018\u00010*HÖ\u0003J\t\u0010+\u001a\u00020,HÖ\u0001J\t\u0010-\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0012R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0012R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0012R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0012R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0012R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u001f\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001c¨\u0006."}, d2 = {"Lru/ozon/app/android/fresh/checkout/widgets/premiumPointsTrain/data/FreshPremiumPointsTrainDTO$MultipleCarriageTrainFresh$PremiumPointsItem$TailCarriage;", "Lru/ozon/app/android/fresh/checkout/widgets/premiumPointsTrain/data/FreshPremiumPointsTrainDTO$MultipleCarriageTrainFresh$PremiumPointsItem;", SelectionItemFormDTO.TITLE_FIELD_NAME, "", "titleTintColor", "points", "pointsIcon", "pointsTintColor", "statusIcon", "statusIconTint", "action", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "trackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lru/ozon/uni/atoms/data/AtomActionDTO;Ljava/util/Map;)V", "getTitle", "()Ljava/lang/String;", "getTitleTintColor", "getPoints", "getPointsIcon", "getPointsTintColor", "getStatusIcon", "getStatusIconTint", "getAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "getTrackingInfo", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "", "hashCode", "", "toString", "widgets-checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
            public static final /* data */ class TailCarriage extends PremiumPointsItem {
                public static final int $stable = 8;
                private final AtomActionDTO action;
                private final String points;
                private final String pointsIcon;
                private final String pointsTintColor;
                private final String statusIcon;
                private final String statusIconTint;

                @NotNull
                private final String title;
                private final String titleTintColor;
                private final Map<String, TokenizedTrackingInfo> trackingInfo;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public TailCarriage(@NotNull String title, String str, String str2, String str3, String str4, String str5, String str6, AtomActionDTO atomActionDTO, Map<String, TokenizedTrackingInfo> map) {
                    super(null);
                    Intrinsics.checkNotNullParameter(title, "title");
                    this.title = title;
                    this.titleTintColor = str;
                    this.points = str2;
                    this.pointsIcon = str3;
                    this.pointsTintColor = str4;
                    this.statusIcon = str5;
                    this.statusIconTint = str6;
                    this.action = atomActionDTO;
                    this.trackingInfo = map;
                }

                public static /* synthetic */ TailCarriage copy$default(TailCarriage tailCarriage, String str, String str2, String str3, String str4, String str5, String str6, String str7, AtomActionDTO atomActionDTO, Map map, int i11, Object obj) {
                    if ((i11 & 1) != 0) {
                        str = tailCarriage.title;
                    }
                    if ((i11 & 2) != 0) {
                        str2 = tailCarriage.titleTintColor;
                    }
                    if ((i11 & 4) != 0) {
                        str3 = tailCarriage.points;
                    }
                    if ((i11 & 8) != 0) {
                        str4 = tailCarriage.pointsIcon;
                    }
                    if ((i11 & 16) != 0) {
                        str5 = tailCarriage.pointsTintColor;
                    }
                    if ((i11 & 32) != 0) {
                        str6 = tailCarriage.statusIcon;
                    }
                    if ((i11 & 64) != 0) {
                        str7 = tailCarriage.statusIconTint;
                    }
                    if ((i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
                        atomActionDTO = tailCarriage.action;
                    }
                    if ((i11 & 256) != 0) {
                        map = tailCarriage.trackingInfo;
                    }
                    AtomActionDTO atomActionDTO2 = atomActionDTO;
                    Map map2 = map;
                    String str8 = str6;
                    String str9 = str7;
                    String str10 = str5;
                    String str11 = str3;
                    return tailCarriage.copy(str, str2, str11, str4, str10, str8, str9, atomActionDTO2, map2);
                }

                @NotNull
                /* renamed from: component1, reason: from getter */
                public final String getTitle() {
                    return this.title;
                }

                /* renamed from: component2, reason: from getter */
                public final String getTitleTintColor() {
                    return this.titleTintColor;
                }

                /* renamed from: component3, reason: from getter */
                public final String getPoints() {
                    return this.points;
                }

                /* renamed from: component4, reason: from getter */
                public final String getPointsIcon() {
                    return this.pointsIcon;
                }

                /* renamed from: component5, reason: from getter */
                public final String getPointsTintColor() {
                    return this.pointsTintColor;
                }

                /* renamed from: component6, reason: from getter */
                public final String getStatusIcon() {
                    return this.statusIcon;
                }

                /* renamed from: component7, reason: from getter */
                public final String getStatusIconTint() {
                    return this.statusIconTint;
                }

                /* renamed from: component8, reason: from getter */
                public final AtomActionDTO getAction() {
                    return this.action;
                }

                public final Map<String, TokenizedTrackingInfo> component9() {
                    return this.trackingInfo;
                }

                @NotNull
                public final TailCarriage copy(@NotNull String title, String titleTintColor, String points, String pointsIcon, String pointsTintColor, String statusIcon, String statusIconTint, AtomActionDTO action, Map<String, TokenizedTrackingInfo> trackingInfo) {
                    Intrinsics.checkNotNullParameter(title, "title");
                    return new TailCarriage(title, titleTintColor, points, pointsIcon, pointsTintColor, statusIcon, statusIconTint, action, trackingInfo);
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof TailCarriage)) {
                        return false;
                    }
                    TailCarriage tailCarriage = (TailCarriage) other;
                    return Intrinsics.d(this.title, tailCarriage.title) && Intrinsics.d(this.titleTintColor, tailCarriage.titleTintColor) && Intrinsics.d(this.points, tailCarriage.points) && Intrinsics.d(this.pointsIcon, tailCarriage.pointsIcon) && Intrinsics.d(this.pointsTintColor, tailCarriage.pointsTintColor) && Intrinsics.d(this.statusIcon, tailCarriage.statusIcon) && Intrinsics.d(this.statusIconTint, tailCarriage.statusIconTint) && Intrinsics.d(this.action, tailCarriage.action) && Intrinsics.d(this.trackingInfo, tailCarriage.trackingInfo);
                }

                public final AtomActionDTO getAction() {
                    return this.action;
                }

                public final String getPoints() {
                    return this.points;
                }

                public final String getPointsIcon() {
                    return this.pointsIcon;
                }

                public final String getPointsTintColor() {
                    return this.pointsTintColor;
                }

                public final String getStatusIcon() {
                    return this.statusIcon;
                }

                public final String getStatusIconTint() {
                    return this.statusIconTint;
                }

                @NotNull
                public final String getTitle() {
                    return this.title;
                }

                public final String getTitleTintColor() {
                    return this.titleTintColor;
                }

                public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
                    return this.trackingInfo;
                }

                public int hashCode() {
                    int hashCode = this.title.hashCode() * 31;
                    String str = this.titleTintColor;
                    int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
                    String str2 = this.points;
                    int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
                    String str3 = this.pointsIcon;
                    int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
                    String str4 = this.pointsTintColor;
                    int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
                    String str5 = this.statusIcon;
                    int hashCode6 = (hashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
                    String str6 = this.statusIconTint;
                    int hashCode7 = (hashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
                    AtomActionDTO atomActionDTO = this.action;
                    int hashCode8 = (hashCode7 + (atomActionDTO == null ? 0 : atomActionDTO.hashCode())) * 31;
                    Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
                    return hashCode8 + (map != null ? map.hashCode() : 0);
                }

                @NotNull
                public String toString() {
                    String str = this.title;
                    String str2 = this.titleTintColor;
                    String str3 = this.points;
                    String str4 = this.pointsIcon;
                    String str5 = this.pointsTintColor;
                    String str6 = this.statusIcon;
                    String str7 = this.statusIconTint;
                    AtomActionDTO atomActionDTO = this.action;
                    Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
                    StringBuilder d11 = C3660k.d("TailCarriage(title=", str, ", titleTintColor=", str2, ", points=");
                    a.h(d11, str3, ", pointsIcon=", str4, ", pointsTintColor=");
                    a.h(d11, str5, ", statusIcon=", str6, ", statusIconTint=");
                    p.c(str7, ", action=", ", trackingInfo=", d11, atomActionDTO);
                    return P.f(d11, map, ")");
                }
            }

            public /* synthetic */ PremiumPointsItem(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private PremiumPointsItem() {
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public MultipleCarriageTrainFresh(TextDTO textDTO, List<? extends PremiumPointsItem> list, Map<String, TokenizedTrackingInfo> map) {
            super(null);
            this.title = textDTO;
            this.premiumPointsItems = list;
            this.trackingInfo = map;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ MultipleCarriageTrainFresh copy$default(MultipleCarriageTrainFresh multipleCarriageTrainFresh, TextDTO textDTO, List list, Map map, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                textDTO = multipleCarriageTrainFresh.title;
            }
            if ((i11 & 2) != 0) {
                list = multipleCarriageTrainFresh.premiumPointsItems;
            }
            if ((i11 & 4) != 0) {
                map = multipleCarriageTrainFresh.trackingInfo;
            }
            return multipleCarriageTrainFresh.copy(textDTO, list, map);
        }

        /* renamed from: component1, reason: from getter */
        public final TextDTO getTitle() {
            return this.title;
        }

        public final List<PremiumPointsItem> component2() {
            return this.premiumPointsItems;
        }

        public final Map<String, TokenizedTrackingInfo> component3() {
            return this.trackingInfo;
        }

        @NotNull
        public final MultipleCarriageTrainFresh copy(TextDTO title, List<? extends PremiumPointsItem> premiumPointsItems, Map<String, TokenizedTrackingInfo> trackingInfo) {
            return new MultipleCarriageTrainFresh(title, premiumPointsItems, trackingInfo);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof MultipleCarriageTrainFresh)) {
                return false;
            }
            MultipleCarriageTrainFresh multipleCarriageTrainFresh = (MultipleCarriageTrainFresh) other;
            return Intrinsics.d(this.title, multipleCarriageTrainFresh.title) && Intrinsics.d(this.premiumPointsItems, multipleCarriageTrainFresh.premiumPointsItems) && Intrinsics.d(this.trackingInfo, multipleCarriageTrainFresh.trackingInfo);
        }

        public final List<PremiumPointsItem> getPremiumPointsItems() {
            return this.premiumPointsItems;
        }

        public final TextDTO getTitle() {
            return this.title;
        }

        public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
            return this.trackingInfo;
        }

        public int hashCode() {
            TextDTO textDTO = this.title;
            int hashCode = (textDTO == null ? 0 : textDTO.hashCode()) * 31;
            List<PremiumPointsItem> list = this.premiumPointsItems;
            int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
            Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
            return hashCode2 + (map != null ? map.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            TextDTO textDTO = this.title;
            List<PremiumPointsItem> list = this.premiumPointsItems;
            return P.f(G.e("MultipleCarriageTrainFresh(title=", textDTO, ", premiumPointsItems=", list, ", trackingInfo="), this.trackingInfo, ")");
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BA\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\bHÆ\u0003J\u0017\u0010\u001b\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nHÆ\u0003JM\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nHÆ\u0001J\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010 HÖ\u0003J\t\u0010!\u001a\u00020\"HÖ\u0001J\t\u0010#\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u001f\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016¨\u0006$"}, d2 = {"Lru/ozon/app/android/fresh/checkout/widgets/premiumPointsTrain/data/FreshPremiumPointsTrainDTO$SingleCarriageTrainFresh;", "Lru/ozon/app/android/fresh/checkout/widgets/premiumPointsTrain/data/FreshPremiumPointsTrainDTO;", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/text/TextDTO;", "statusIcon", "", "statusIconTint", "action", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "trackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Lru/ozon/uni/atoms/data/text/TextDTO;Ljava/lang/String;Ljava/lang/String;Lru/ozon/uni/atoms/data/AtomActionDTO;Ljava/util/Map;)V", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getStatusIcon", "()Ljava/lang/String;", "getStatusIconTint", "getAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "getTrackingInfo", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "", "hashCode", "", "toString", "widgets-checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class SingleCarriageTrainFresh extends FreshPremiumPointsTrainDTO {
        public static final int $stable = 8;
        private final AtomActionDTO action;

        @NotNull
        private final String statusIcon;
        private final String statusIconTint;

        @NotNull
        private final TextDTO title;
        private final Map<String, TokenizedTrackingInfo> trackingInfo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SingleCarriageTrainFresh(@NotNull TextDTO title, @NotNull String statusIcon, String str, AtomActionDTO atomActionDTO, Map<String, TokenizedTrackingInfo> map) {
            super(null);
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(statusIcon, "statusIcon");
            this.title = title;
            this.statusIcon = statusIcon;
            this.statusIconTint = str;
            this.action = atomActionDTO;
            this.trackingInfo = map;
        }

        public static /* synthetic */ SingleCarriageTrainFresh copy$default(SingleCarriageTrainFresh singleCarriageTrainFresh, TextDTO textDTO, String str, String str2, AtomActionDTO atomActionDTO, Map map, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                textDTO = singleCarriageTrainFresh.title;
            }
            if ((i11 & 2) != 0) {
                str = singleCarriageTrainFresh.statusIcon;
            }
            if ((i11 & 4) != 0) {
                str2 = singleCarriageTrainFresh.statusIconTint;
            }
            if ((i11 & 8) != 0) {
                atomActionDTO = singleCarriageTrainFresh.action;
            }
            if ((i11 & 16) != 0) {
                map = singleCarriageTrainFresh.trackingInfo;
            }
            Map map2 = map;
            String str3 = str2;
            return singleCarriageTrainFresh.copy(textDTO, str, str3, atomActionDTO, map2);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final TextDTO getTitle() {
            return this.title;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final String getStatusIcon() {
            return this.statusIcon;
        }

        /* renamed from: component3, reason: from getter */
        public final String getStatusIconTint() {
            return this.statusIconTint;
        }

        /* renamed from: component4, reason: from getter */
        public final AtomActionDTO getAction() {
            return this.action;
        }

        public final Map<String, TokenizedTrackingInfo> component5() {
            return this.trackingInfo;
        }

        @NotNull
        public final SingleCarriageTrainFresh copy(@NotNull TextDTO title, @NotNull String statusIcon, String statusIconTint, AtomActionDTO action, Map<String, TokenizedTrackingInfo> trackingInfo) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(statusIcon, "statusIcon");
            return new SingleCarriageTrainFresh(title, statusIcon, statusIconTint, action, trackingInfo);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SingleCarriageTrainFresh)) {
                return false;
            }
            SingleCarriageTrainFresh singleCarriageTrainFresh = (SingleCarriageTrainFresh) other;
            return Intrinsics.d(this.title, singleCarriageTrainFresh.title) && Intrinsics.d(this.statusIcon, singleCarriageTrainFresh.statusIcon) && Intrinsics.d(this.statusIconTint, singleCarriageTrainFresh.statusIconTint) && Intrinsics.d(this.action, singleCarriageTrainFresh.action) && Intrinsics.d(this.trackingInfo, singleCarriageTrainFresh.trackingInfo);
        }

        public final AtomActionDTO getAction() {
            return this.action;
        }

        @NotNull
        public final String getStatusIcon() {
            return this.statusIcon;
        }

        public final String getStatusIconTint() {
            return this.statusIconTint;
        }

        @NotNull
        public final TextDTO getTitle() {
            return this.title;
        }

        public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
            return this.trackingInfo;
        }

        public int hashCode() {
            int a11 = G.g.a(this.title.hashCode() * 31, 31, this.statusIcon);
            String str = this.statusIconTint;
            int hashCode = (a11 + (str == null ? 0 : str.hashCode())) * 31;
            AtomActionDTO atomActionDTO = this.action;
            int hashCode2 = (hashCode + (atomActionDTO == null ? 0 : atomActionDTO.hashCode())) * 31;
            Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
            return hashCode2 + (map != null ? map.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            TextDTO textDTO = this.title;
            String str = this.statusIcon;
            String str2 = this.statusIconTint;
            AtomActionDTO atomActionDTO = this.action;
            Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
            StringBuilder f7 = g.f("SingleCarriageTrainFresh(title=", textDTO, ", statusIcon=", str, ", statusIconTint=");
            p.c(str2, ", action=", ", trackingInfo=", f7, atomActionDTO);
            return P.f(f7, map, ")");
        }
    }

    public /* synthetic */ FreshPremiumPointsTrainDTO(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private FreshPremiumPointsTrainDTO() {
    }
}
