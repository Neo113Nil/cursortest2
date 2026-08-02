package ru.ozon.app.android.storefront.widgets.naviBlocks.data;

import B90.C2619v;
import N3.C3660k;
import T7.P;
import Ve.C4636t5;
import Xc.a;
import Xc.b;
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
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.badge.Badge;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.atoms.data.texts.TextAtom;

@j(generateAdapter = true)
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0081\b\u0018\u0000 \u00172\u00020\u0001:\u0003\u0017\u0018\u0019B\u001f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J%\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u001a"}, d2 = {"Lru/ozon/app/android/storefront/widgets/naviBlocks/data/NaviBlocksDTO;", "", "roundedCorners", "Lru/ozon/app/android/storefront/widgets/naviBlocks/data/NaviBlocksDTO$RoundedCornersDTO;", "blocks", "", "Lru/ozon/app/android/storefront/widgets/naviBlocks/data/NaviBlocksDTO$NaviBlockDTO;", "<init>", "(Lru/ozon/app/android/storefront/widgets/naviBlocks/data/NaviBlocksDTO$RoundedCornersDTO;Ljava/util/List;)V", "getRoundedCorners", "()Lru/ozon/app/android/storefront/widgets/naviBlocks/data/NaviBlocksDTO$RoundedCornersDTO;", "getBlocks", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "Companion", "RoundedCornersDTO", "NaviBlockDTO", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class NaviBlocksDTO {

    @NotNull
    private final List<NaviBlockDTO> blocks;
    private final RoundedCornersDTO roundedCorners;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private static final int SINGLE_BLOCK_HEIGHT = ResourceExtKt.toPx(UserVerificationMethods.USER_VERIFY_PATTERN);

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lru/ozon/app/android/storefront/widgets/naviBlocks/data/NaviBlocksDTO$Companion;", "", "<init>", "()V", "SINGLE_BLOCK_HEIGHT", "", "getSINGLE_BLOCK_HEIGHT", "()I", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int getSINGLE_BLOCK_HEIGHT() {
            return NaviBlocksDTO.SINGLE_BLOCK_HEIGHT;
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lru/ozon/app/android/storefront/widgets/naviBlocks/data/NaviBlocksDTO$NaviBlockDTO;", "", "<init>", "()V", "SquareSingleDTO", "SquareCoupleDTO", "Lru/ozon/app/android/storefront/widgets/naviBlocks/data/NaviBlocksDTO$NaviBlockDTO$SquareCoupleDTO;", "Lru/ozon/app/android/storefront/widgets/naviBlocks/data/NaviBlocksDTO$NaviBlockDTO$SquareSingleDTO;", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @ProtoOneOfSignature.Container({@ProtoOneOfSignature(name = "squareSingle", type = SquareSingleDTO.class), @ProtoOneOfSignature(name = "squareCouple", type = SquareCoupleDTO.class)})
    @ProtoOneOf(label = "type")
    public static abstract class NaviBlockDTO {
        public static final int $stable = 0;

        @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0015B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/storefront/widgets/naviBlocks/data/NaviBlocksDTO$NaviBlockDTO$SquareCoupleDTO;", "Lru/ozon/app/android/storefront/widgets/naviBlocks/data/NaviBlocksDTO$NaviBlockDTO;", "topItem", "Lru/ozon/app/android/storefront/widgets/naviBlocks/data/NaviBlocksDTO$NaviBlockDTO$SquareCoupleDTO$NaviBlockItemDTO;", "bottomItem", "<init>", "(Lru/ozon/app/android/storefront/widgets/naviBlocks/data/NaviBlocksDTO$NaviBlockDTO$SquareCoupleDTO$NaviBlockItemDTO;Lru/ozon/app/android/storefront/widgets/naviBlocks/data/NaviBlocksDTO$NaviBlockDTO$SquareCoupleDTO$NaviBlockItemDTO;)V", "getTopItem", "()Lru/ozon/app/android/storefront/widgets/naviBlocks/data/NaviBlocksDTO$NaviBlockDTO$SquareCoupleDTO$NaviBlockItemDTO;", "getBottomItem", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "NaviBlockItemDTO", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        @j(generateAdapter = true)
        public static final /* data */ class SquareCoupleDTO extends NaviBlockDTO {
            public static final int $stable = 8;

            @NotNull
            private final NaviBlockItemDTO bottomItem;

            @NotNull
            private final NaviBlockItemDTO topItem;

            @j(generateAdapter = true)
            @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BW\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\u0014\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0006HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u0017\u0010#\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000e\u0018\u00010\rHÆ\u0003Jg\u0010$\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0016\b\u0002\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000e\u0018\u00010\rHÆ\u0001J\u0013\u0010%\u001a\u00020&2\b\u0010'\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010(\u001a\u00020)HÖ\u0001J\t\u0010*\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0015R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u001f\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001c¨\u0006+"}, d2 = {"Lru/ozon/app/android/storefront/widgets/naviBlocks/data/NaviBlocksDTO$NaviBlockDTO$SquareCoupleDTO$NaviBlockItemDTO;", "", "backgroundColor", "", "image", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/texts/TextAtom;", "titleDisclosure", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "subtitle", "action", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "trackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/data/icon/IconDTO;Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/data/AtomActionDTO;Ljava/util/Map;)V", "getBackgroundColor", "()Ljava/lang/String;", "getImage", "getTitle", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "getTitleDisclosure", "()Lru/ozon/uni/atoms/data/icon/IconDTO;", "getSubtitle", "getAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "getTrackingInfo", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "", "toString", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
            public static final /* data */ class NaviBlockItemDTO {
                public static final int $stable = 8;
                private final AtomActionDTO action;
                private final String backgroundColor;
                private final String image;
                private final TextAtom subtitle;

                @NotNull
                private final TextAtom title;
                private final IconDTO titleDisclosure;
                private final Map<String, TokenizedTrackingInfo> trackingInfo;

                public NaviBlockItemDTO(String str, String str2, @NotNull TextAtom title, IconDTO iconDTO, TextAtom textAtom, AtomActionDTO atomActionDTO, Map<String, TokenizedTrackingInfo> map) {
                    Intrinsics.checkNotNullParameter(title, "title");
                    this.backgroundColor = str;
                    this.image = str2;
                    this.title = title;
                    this.titleDisclosure = iconDTO;
                    this.subtitle = textAtom;
                    this.action = atomActionDTO;
                    this.trackingInfo = map;
                }

                public static /* synthetic */ NaviBlockItemDTO copy$default(NaviBlockItemDTO naviBlockItemDTO, String str, String str2, TextAtom textAtom, IconDTO iconDTO, TextAtom textAtom2, AtomActionDTO atomActionDTO, Map map, int i11, Object obj) {
                    if ((i11 & 1) != 0) {
                        str = naviBlockItemDTO.backgroundColor;
                    }
                    if ((i11 & 2) != 0) {
                        str2 = naviBlockItemDTO.image;
                    }
                    if ((i11 & 4) != 0) {
                        textAtom = naviBlockItemDTO.title;
                    }
                    if ((i11 & 8) != 0) {
                        iconDTO = naviBlockItemDTO.titleDisclosure;
                    }
                    if ((i11 & 16) != 0) {
                        textAtom2 = naviBlockItemDTO.subtitle;
                    }
                    if ((i11 & 32) != 0) {
                        atomActionDTO = naviBlockItemDTO.action;
                    }
                    if ((i11 & 64) != 0) {
                        map = naviBlockItemDTO.trackingInfo;
                    }
                    AtomActionDTO atomActionDTO2 = atomActionDTO;
                    Map map2 = map;
                    TextAtom textAtom3 = textAtom2;
                    TextAtom textAtom4 = textAtom;
                    return naviBlockItemDTO.copy(str, str2, textAtom4, iconDTO, textAtom3, atomActionDTO2, map2);
                }

                /* renamed from: component1, reason: from getter */
                public final String getBackgroundColor() {
                    return this.backgroundColor;
                }

                /* renamed from: component2, reason: from getter */
                public final String getImage() {
                    return this.image;
                }

                @NotNull
                /* renamed from: component3, reason: from getter */
                public final TextAtom getTitle() {
                    return this.title;
                }

                /* renamed from: component4, reason: from getter */
                public final IconDTO getTitleDisclosure() {
                    return this.titleDisclosure;
                }

                /* renamed from: component5, reason: from getter */
                public final TextAtom getSubtitle() {
                    return this.subtitle;
                }

                /* renamed from: component6, reason: from getter */
                public final AtomActionDTO getAction() {
                    return this.action;
                }

                public final Map<String, TokenizedTrackingInfo> component7() {
                    return this.trackingInfo;
                }

                @NotNull
                public final NaviBlockItemDTO copy(String backgroundColor, String image, @NotNull TextAtom title, IconDTO titleDisclosure, TextAtom subtitle, AtomActionDTO action, Map<String, TokenizedTrackingInfo> trackingInfo) {
                    Intrinsics.checkNotNullParameter(title, "title");
                    return new NaviBlockItemDTO(backgroundColor, image, title, titleDisclosure, subtitle, action, trackingInfo);
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof NaviBlockItemDTO)) {
                        return false;
                    }
                    NaviBlockItemDTO naviBlockItemDTO = (NaviBlockItemDTO) other;
                    return Intrinsics.d(this.backgroundColor, naviBlockItemDTO.backgroundColor) && Intrinsics.d(this.image, naviBlockItemDTO.image) && Intrinsics.d(this.title, naviBlockItemDTO.title) && Intrinsics.d(this.titleDisclosure, naviBlockItemDTO.titleDisclosure) && Intrinsics.d(this.subtitle, naviBlockItemDTO.subtitle) && Intrinsics.d(this.action, naviBlockItemDTO.action) && Intrinsics.d(this.trackingInfo, naviBlockItemDTO.trackingInfo);
                }

                public final AtomActionDTO getAction() {
                    return this.action;
                }

                public final String getBackgroundColor() {
                    return this.backgroundColor;
                }

                public final String getImage() {
                    return this.image;
                }

                public final TextAtom getSubtitle() {
                    return this.subtitle;
                }

                @NotNull
                public final TextAtom getTitle() {
                    return this.title;
                }

                public final IconDTO getTitleDisclosure() {
                    return this.titleDisclosure;
                }

                public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
                    return this.trackingInfo;
                }

                public int hashCode() {
                    String str = this.backgroundColor;
                    int hashCode = (str == null ? 0 : str.hashCode()) * 31;
                    String str2 = this.image;
                    int b11 = C2619v.b((hashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.title);
                    IconDTO iconDTO = this.titleDisclosure;
                    int hashCode2 = (b11 + (iconDTO == null ? 0 : iconDTO.hashCode())) * 31;
                    TextAtom textAtom = this.subtitle;
                    int hashCode3 = (hashCode2 + (textAtom == null ? 0 : textAtom.hashCode())) * 31;
                    AtomActionDTO atomActionDTO = this.action;
                    int hashCode4 = (hashCode3 + (atomActionDTO == null ? 0 : atomActionDTO.hashCode())) * 31;
                    Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
                    return hashCode4 + (map != null ? map.hashCode() : 0);
                }

                @NotNull
                public String toString() {
                    String str = this.backgroundColor;
                    String str2 = this.image;
                    TextAtom textAtom = this.title;
                    IconDTO iconDTO = this.titleDisclosure;
                    TextAtom textAtom2 = this.subtitle;
                    AtomActionDTO atomActionDTO = this.action;
                    Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
                    StringBuilder d11 = C3660k.d("NaviBlockItemDTO(backgroundColor=", str, ", image=", str2, ", title=");
                    d11.append(textAtom);
                    d11.append(", titleDisclosure=");
                    d11.append(iconDTO);
                    d11.append(", subtitle=");
                    d11.append(textAtom2);
                    d11.append(", action=");
                    d11.append(atomActionDTO);
                    d11.append(", trackingInfo=");
                    return P.f(d11, map, ")");
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public SquareCoupleDTO(@NotNull NaviBlockItemDTO topItem, @NotNull NaviBlockItemDTO bottomItem) {
                super(null);
                Intrinsics.checkNotNullParameter(topItem, "topItem");
                Intrinsics.checkNotNullParameter(bottomItem, "bottomItem");
                this.topItem = topItem;
                this.bottomItem = bottomItem;
            }

            public static /* synthetic */ SquareCoupleDTO copy$default(SquareCoupleDTO squareCoupleDTO, NaviBlockItemDTO naviBlockItemDTO, NaviBlockItemDTO naviBlockItemDTO2, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    naviBlockItemDTO = squareCoupleDTO.topItem;
                }
                if ((i11 & 2) != 0) {
                    naviBlockItemDTO2 = squareCoupleDTO.bottomItem;
                }
                return squareCoupleDTO.copy(naviBlockItemDTO, naviBlockItemDTO2);
            }

            @NotNull
            /* renamed from: component1, reason: from getter */
            public final NaviBlockItemDTO getTopItem() {
                return this.topItem;
            }

            @NotNull
            /* renamed from: component2, reason: from getter */
            public final NaviBlockItemDTO getBottomItem() {
                return this.bottomItem;
            }

            @NotNull
            public final SquareCoupleDTO copy(@NotNull NaviBlockItemDTO topItem, @NotNull NaviBlockItemDTO bottomItem) {
                Intrinsics.checkNotNullParameter(topItem, "topItem");
                Intrinsics.checkNotNullParameter(bottomItem, "bottomItem");
                return new SquareCoupleDTO(topItem, bottomItem);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof SquareCoupleDTO)) {
                    return false;
                }
                SquareCoupleDTO squareCoupleDTO = (SquareCoupleDTO) other;
                return Intrinsics.d(this.topItem, squareCoupleDTO.topItem) && Intrinsics.d(this.bottomItem, squareCoupleDTO.bottomItem);
            }

            @NotNull
            public final NaviBlockItemDTO getBottomItem() {
                return this.bottomItem;
            }

            @NotNull
            public final NaviBlockItemDTO getTopItem() {
                return this.topItem;
            }

            public int hashCode() {
                return this.bottomItem.hashCode() + (this.topItem.hashCode() * 31);
            }

            @NotNull
            public String toString() {
                return "SquareCoupleDTO(topItem=" + this.topItem + ", bottomItem=" + this.bottomItem + ")";
            }
        }

        @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0019B\u001f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\nJ\u000f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J*\u0010\u0010\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001¢\u0006\u0002\u0010\u0011J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u001a"}, d2 = {"Lru/ozon/app/android/storefront/widgets/naviBlocks/data/NaviBlocksDTO$NaviBlockDTO$SquareSingleDTO;", "Lru/ozon/app/android/storefront/widgets/naviBlocks/data/NaviBlocksDTO$NaviBlockDTO;", "frameDuration", "", "frames", "", "Lru/ozon/app/android/storefront/widgets/naviBlocks/data/NaviBlocksDTO$NaviBlockDTO$SquareSingleDTO$FrameDTO;", "<init>", "(Ljava/lang/Integer;Ljava/util/List;)V", "getFrameDuration", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getFrames", "()Ljava/util/List;", "component1", "component2", "copy", "(Ljava/lang/Integer;Ljava/util/List;)Lru/ozon/app/android/storefront/widgets/naviBlocks/data/NaviBlocksDTO$NaviBlockDTO$SquareSingleDTO;", "equals", "", "other", "", "hashCode", "toString", "", "FrameDTO", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        @j(generateAdapter = true)
        public static final /* data */ class SquareSingleDTO extends NaviBlockDTO {
            public static final int $stable = 8;
            private final Integer frameDuration;

            @NotNull
            private final List<FrameDTO> frames;

            @j(generateAdapter = true)
            @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BW\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\u0014\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0006HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u0017\u0010#\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000e\u0018\u00010\rHÆ\u0003Jg\u0010$\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0016\b\u0002\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000e\u0018\u00010\rHÆ\u0001J\u0013\u0010%\u001a\u00020&2\b\u0010'\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010(\u001a\u00020)HÖ\u0001J\t\u0010*\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0015R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u001f\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001c¨\u0006+"}, d2 = {"Lru/ozon/app/android/storefront/widgets/naviBlocks/data/NaviBlocksDTO$NaviBlockDTO$SquareSingleDTO$FrameDTO;", "", "backgroundColor", "", "image", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/texts/TextAtom;", "subtitle", "badge", "Lru/ozon/uni/atoms/data/badge/Badge;", "action", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "trackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/data/badge/Badge;Lru/ozon/uni/atoms/data/AtomActionDTO;Ljava/util/Map;)V", "getBackgroundColor", "()Ljava/lang/String;", "getImage", "getTitle", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "getSubtitle", "getBadge", "()Lru/ozon/uni/atoms/data/badge/Badge;", "getAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "getTrackingInfo", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "", "toString", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
            public static final /* data */ class FrameDTO {
                public static final int $stable = 8;
                private final AtomActionDTO action;
                private final String backgroundColor;
                private final Badge badge;
                private final String image;
                private final TextAtom subtitle;

                @NotNull
                private final TextAtom title;
                private final Map<String, TokenizedTrackingInfo> trackingInfo;

                public FrameDTO(String str, String str2, @NotNull TextAtom title, TextAtom textAtom, Badge badge, AtomActionDTO atomActionDTO, Map<String, TokenizedTrackingInfo> map) {
                    Intrinsics.checkNotNullParameter(title, "title");
                    this.backgroundColor = str;
                    this.image = str2;
                    this.title = title;
                    this.subtitle = textAtom;
                    this.badge = badge;
                    this.action = atomActionDTO;
                    this.trackingInfo = map;
                }

                public static /* synthetic */ FrameDTO copy$default(FrameDTO frameDTO, String str, String str2, TextAtom textAtom, TextAtom textAtom2, Badge badge, AtomActionDTO atomActionDTO, Map map, int i11, Object obj) {
                    if ((i11 & 1) != 0) {
                        str = frameDTO.backgroundColor;
                    }
                    if ((i11 & 2) != 0) {
                        str2 = frameDTO.image;
                    }
                    if ((i11 & 4) != 0) {
                        textAtom = frameDTO.title;
                    }
                    if ((i11 & 8) != 0) {
                        textAtom2 = frameDTO.subtitle;
                    }
                    if ((i11 & 16) != 0) {
                        badge = frameDTO.badge;
                    }
                    if ((i11 & 32) != 0) {
                        atomActionDTO = frameDTO.action;
                    }
                    if ((i11 & 64) != 0) {
                        map = frameDTO.trackingInfo;
                    }
                    AtomActionDTO atomActionDTO2 = atomActionDTO;
                    Map map2 = map;
                    Badge badge2 = badge;
                    TextAtom textAtom3 = textAtom;
                    return frameDTO.copy(str, str2, textAtom3, textAtom2, badge2, atomActionDTO2, map2);
                }

                /* renamed from: component1, reason: from getter */
                public final String getBackgroundColor() {
                    return this.backgroundColor;
                }

                /* renamed from: component2, reason: from getter */
                public final String getImage() {
                    return this.image;
                }

                @NotNull
                /* renamed from: component3, reason: from getter */
                public final TextAtom getTitle() {
                    return this.title;
                }

                /* renamed from: component4, reason: from getter */
                public final TextAtom getSubtitle() {
                    return this.subtitle;
                }

                /* renamed from: component5, reason: from getter */
                public final Badge getBadge() {
                    return this.badge;
                }

                /* renamed from: component6, reason: from getter */
                public final AtomActionDTO getAction() {
                    return this.action;
                }

                public final Map<String, TokenizedTrackingInfo> component7() {
                    return this.trackingInfo;
                }

                @NotNull
                public final FrameDTO copy(String backgroundColor, String image, @NotNull TextAtom title, TextAtom subtitle, Badge badge, AtomActionDTO action, Map<String, TokenizedTrackingInfo> trackingInfo) {
                    Intrinsics.checkNotNullParameter(title, "title");
                    return new FrameDTO(backgroundColor, image, title, subtitle, badge, action, trackingInfo);
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof FrameDTO)) {
                        return false;
                    }
                    FrameDTO frameDTO = (FrameDTO) other;
                    return Intrinsics.d(this.backgroundColor, frameDTO.backgroundColor) && Intrinsics.d(this.image, frameDTO.image) && Intrinsics.d(this.title, frameDTO.title) && Intrinsics.d(this.subtitle, frameDTO.subtitle) && Intrinsics.d(this.badge, frameDTO.badge) && Intrinsics.d(this.action, frameDTO.action) && Intrinsics.d(this.trackingInfo, frameDTO.trackingInfo);
                }

                public final AtomActionDTO getAction() {
                    return this.action;
                }

                public final String getBackgroundColor() {
                    return this.backgroundColor;
                }

                public final Badge getBadge() {
                    return this.badge;
                }

                public final String getImage() {
                    return this.image;
                }

                public final TextAtom getSubtitle() {
                    return this.subtitle;
                }

                @NotNull
                public final TextAtom getTitle() {
                    return this.title;
                }

                public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
                    return this.trackingInfo;
                }

                public int hashCode() {
                    String str = this.backgroundColor;
                    int hashCode = (str == null ? 0 : str.hashCode()) * 31;
                    String str2 = this.image;
                    int b11 = C2619v.b((hashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.title);
                    TextAtom textAtom = this.subtitle;
                    int hashCode2 = (b11 + (textAtom == null ? 0 : textAtom.hashCode())) * 31;
                    Badge badge = this.badge;
                    int hashCode3 = (hashCode2 + (badge == null ? 0 : badge.hashCode())) * 31;
                    AtomActionDTO atomActionDTO = this.action;
                    int hashCode4 = (hashCode3 + (atomActionDTO == null ? 0 : atomActionDTO.hashCode())) * 31;
                    Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
                    return hashCode4 + (map != null ? map.hashCode() : 0);
                }

                @NotNull
                public String toString() {
                    String str = this.backgroundColor;
                    String str2 = this.image;
                    TextAtom textAtom = this.title;
                    TextAtom textAtom2 = this.subtitle;
                    Badge badge = this.badge;
                    AtomActionDTO atomActionDTO = this.action;
                    Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
                    StringBuilder d11 = C3660k.d("FrameDTO(backgroundColor=", str, ", image=", str2, ", title=");
                    C4636t5.c(", subtitle=", ", badge=", d11, textAtom, textAtom2);
                    d11.append(badge);
                    d11.append(", action=");
                    d11.append(atomActionDTO);
                    d11.append(", trackingInfo=");
                    return P.f(d11, map, ")");
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public SquareSingleDTO(Integer num, @NotNull List<FrameDTO> frames) {
                super(null);
                Intrinsics.checkNotNullParameter(frames, "frames");
                this.frameDuration = num;
                this.frames = frames;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ SquareSingleDTO copy$default(SquareSingleDTO squareSingleDTO, Integer num, List list, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    num = squareSingleDTO.frameDuration;
                }
                if ((i11 & 2) != 0) {
                    list = squareSingleDTO.frames;
                }
                return squareSingleDTO.copy(num, list);
            }

            /* renamed from: component1, reason: from getter */
            public final Integer getFrameDuration() {
                return this.frameDuration;
            }

            @NotNull
            public final List<FrameDTO> component2() {
                return this.frames;
            }

            @NotNull
            public final SquareSingleDTO copy(Integer frameDuration, @NotNull List<FrameDTO> frames) {
                Intrinsics.checkNotNullParameter(frames, "frames");
                return new SquareSingleDTO(frameDuration, frames);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof SquareSingleDTO)) {
                    return false;
                }
                SquareSingleDTO squareSingleDTO = (SquareSingleDTO) other;
                return Intrinsics.d(this.frameDuration, squareSingleDTO.frameDuration) && Intrinsics.d(this.frames, squareSingleDTO.frames);
            }

            public final Integer getFrameDuration() {
                return this.frameDuration;
            }

            @NotNull
            public final List<FrameDTO> getFrames() {
                return this.frames;
            }

            public int hashCode() {
                Integer num = this.frameDuration;
                return this.frames.hashCode() + ((num == null ? 0 : num.hashCode()) * 31);
            }

            @NotNull
            public String toString() {
                return "SquareSingleDTO(frameDuration=" + this.frameDuration + ", frames=" + this.frames + ")";
            }
        }

        public /* synthetic */ NaviBlockDTO(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private NaviBlockDTO() {
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lru/ozon/app/android/storefront/widgets/naviBlocks/data/NaviBlocksDTO$RoundedCornersDTO;", "", "<init>", "(Ljava/lang/String;I)V", "NONE", "TOP", "BOTTOM", "ALL", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class RoundedCornersDTO {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ RoundedCornersDTO[] $VALUES;
        public static final RoundedCornersDTO NONE = new RoundedCornersDTO("NONE", 0);
        public static final RoundedCornersDTO TOP = new RoundedCornersDTO("TOP", 1);
        public static final RoundedCornersDTO BOTTOM = new RoundedCornersDTO("BOTTOM", 2);
        public static final RoundedCornersDTO ALL = new RoundedCornersDTO("ALL", 3);

        private static final /* synthetic */ RoundedCornersDTO[] $values() {
            return new RoundedCornersDTO[]{NONE, TOP, BOTTOM, ALL};
        }

        static {
            RoundedCornersDTO[] $values = $values();
            $VALUES = $values;
            $ENTRIES = b.a($values);
        }

        private RoundedCornersDTO(String str, int i11) {
        }

        public static RoundedCornersDTO valueOf(String str) {
            return (RoundedCornersDTO) Enum.valueOf(RoundedCornersDTO.class, str);
        }

        public static RoundedCornersDTO[] values() {
            return (RoundedCornersDTO[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public NaviBlocksDTO(RoundedCornersDTO roundedCornersDTO, @NotNull List<? extends NaviBlockDTO> blocks) {
        Intrinsics.checkNotNullParameter(blocks, "blocks");
        this.roundedCorners = roundedCornersDTO;
        this.blocks = blocks;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ NaviBlocksDTO copy$default(NaviBlocksDTO naviBlocksDTO, RoundedCornersDTO roundedCornersDTO, List list, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            roundedCornersDTO = naviBlocksDTO.roundedCorners;
        }
        if ((i11 & 2) != 0) {
            list = naviBlocksDTO.blocks;
        }
        return naviBlocksDTO.copy(roundedCornersDTO, list);
    }

    /* renamed from: component1, reason: from getter */
    public final RoundedCornersDTO getRoundedCorners() {
        return this.roundedCorners;
    }

    @NotNull
    public final List<NaviBlockDTO> component2() {
        return this.blocks;
    }

    @NotNull
    public final NaviBlocksDTO copy(RoundedCornersDTO roundedCorners, @NotNull List<? extends NaviBlockDTO> blocks) {
        Intrinsics.checkNotNullParameter(blocks, "blocks");
        return new NaviBlocksDTO(roundedCorners, blocks);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NaviBlocksDTO)) {
            return false;
        }
        NaviBlocksDTO naviBlocksDTO = (NaviBlocksDTO) other;
        return this.roundedCorners == naviBlocksDTO.roundedCorners && Intrinsics.d(this.blocks, naviBlocksDTO.blocks);
    }

    @NotNull
    public final List<NaviBlockDTO> getBlocks() {
        return this.blocks;
    }

    public final RoundedCornersDTO getRoundedCorners() {
        return this.roundedCorners;
    }

    public int hashCode() {
        RoundedCornersDTO roundedCornersDTO = this.roundedCorners;
        return this.blocks.hashCode() + ((roundedCornersDTO == null ? 0 : roundedCornersDTO.hashCode()) * 31);
    }

    @NotNull
    public String toString() {
        return "NaviBlocksDTO(roundedCorners=" + this.roundedCorners + ", blocks=" + this.blocks + ")";
    }
}
