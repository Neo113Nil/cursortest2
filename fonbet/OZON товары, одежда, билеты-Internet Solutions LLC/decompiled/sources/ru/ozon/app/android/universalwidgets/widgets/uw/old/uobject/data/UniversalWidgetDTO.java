package ru.ozon.app.android.universalwidgets.widgets.uw.old.uobject.data;

import B0.C2454a;
import B90.C2616s;
import B90.C2618u;
import Ef0.c;
import G.g;
import HY.b;
import N3.C3660k;
import Nh.a;
import Sc.o;
import T7.P;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.squareup.moshi.i;
import com.squareup.moshi.j;
import java.math.BigDecimal;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.ads.common.pixel.data.PixelDTO;
import ru.ozon.app.android.favorites.data.favoritebutton.favoriteproduct.FavoriteProductMolecule;
import ru.ozon.app.android.ugc.core.widgets.commentsListV3.data.CommentV3DTO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.app.android.universalwidgets.widgets.uw.old.uobject.model.ObjectItemsVO;
import ru.ozon.composer.ui.widget.h;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.common.CornerRadius;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.data.image.ImageDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u001b\b\u0087\b\u0018\u0000 >2\u00020\u0001:\u0006>?@ABCB?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b\u0012\n\b\u0001\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0013\u0010\u0011\u001a\u00020\u0010*\u00020\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0018\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0012\u0010 \u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b \u0010!JP\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b2\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\u000bHÆ\u0001¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b&\u0010'J\u001a\u0010*\u001a\u00020)2\b\u0010(\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b*\u0010+R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010,\u001a\u0004\b-\u0010\u0019R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010.\u001a\u0004\b/\u0010\u001bR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u00100\u001a\u0004\b1\u0010\u001dR\u001f\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\n\u00102\u001a\u0004\b3\u0010\u001fR\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\f\u00104\u001a\u0004\b5\u0010!R\u0017\u00106\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b6\u00107\u001a\u0004\b8\u00109R\u0017\u0010:\u001a\u00020)8\u0006¢\u0006\f\n\u0004\b:\u0010;\u001a\u0004\b:\u0010<R\u0017\u0010=\u001a\u00020)8\u0006¢\u0006\f\n\u0004\b=\u0010;\u001a\u0004\b=\u0010<¨\u0006D"}, d2 = {"Lru/ozon/app/android/universalwidgets/widgets/uw/old/uobject/data/UniversalWidgetDTO;", "", "Lru/ozon/app/android/universalwidgets/widgets/uw/old/uobject/data/UniversalWidgetDTO$DesignTypeDTO;", "designType", "Lru/ozon/app/android/universalwidgets/widgets/uw/old/uobject/data/UniversalWidgetDTO$FooterDTO;", CommentV3DTO.FOOTER_FIELD_NAME, "Lru/ozon/app/android/universalwidgets/widgets/uw/old/uobject/data/UniversalWidgetDTO$HeaderDTO;", CommentV3DTO.HEADER_FIELD_NAME, "", "Lru/ozon/app/android/universalwidgets/widgets/uw/old/uobject/data/UniversalWidgetDTO$ItemDTO;", "items", "Lru/ozon/app/android/universalwidgets/widgets/uw/old/uobject/data/UniversalWidgetDTO$ObjectGrid3NewDTO;", "objectGrid3New", "<init>", "(Lru/ozon/app/android/universalwidgets/widgets/uw/old/uobject/data/UniversalWidgetDTO$DesignTypeDTO;Lru/ozon/app/android/universalwidgets/widgets/uw/old/uobject/data/UniversalWidgetDTO$FooterDTO;Lru/ozon/app/android/universalwidgets/widgets/uw/old/uobject/data/UniversalWidgetDTO$HeaderDTO;Ljava/util/List;Lru/ozon/app/android/universalwidgets/widgets/uw/old/uobject/data/UniversalWidgetDTO$ObjectGrid3NewDTO;)V", "", "Lru/ozon/composer/ui/widget/h;", "toViewType", "(Ljava/lang/String;)Lru/ozon/composer/ui/widget/h;", "Lru/ozon/app/android/universalwidgets/widgets/uw/old/uobject/model/ObjectItemsVO$Paddings$Position;", "position", "", "fetchPadding", "(Lru/ozon/app/android/universalwidgets/widgets/uw/old/uobject/model/ObjectItemsVO$Paddings$Position;)I", "component1", "()Lru/ozon/app/android/universalwidgets/widgets/uw/old/uobject/data/UniversalWidgetDTO$DesignTypeDTO;", "component2", "()Lru/ozon/app/android/universalwidgets/widgets/uw/old/uobject/data/UniversalWidgetDTO$FooterDTO;", "component3", "()Lru/ozon/app/android/universalwidgets/widgets/uw/old/uobject/data/UniversalWidgetDTO$HeaderDTO;", "component4", "()Ljava/util/List;", "component5", "()Lru/ozon/app/android/universalwidgets/widgets/uw/old/uobject/data/UniversalWidgetDTO$ObjectGrid3NewDTO;", "copy", "(Lru/ozon/app/android/universalwidgets/widgets/uw/old/uobject/data/UniversalWidgetDTO$DesignTypeDTO;Lru/ozon/app/android/universalwidgets/widgets/uw/old/uobject/data/UniversalWidgetDTO$FooterDTO;Lru/ozon/app/android/universalwidgets/widgets/uw/old/uobject/data/UniversalWidgetDTO$HeaderDTO;Ljava/util/List;Lru/ozon/app/android/universalwidgets/widgets/uw/old/uobject/data/UniversalWidgetDTO$ObjectGrid3NewDTO;)Lru/ozon/app/android/universalwidgets/widgets/uw/old/uobject/data/UniversalWidgetDTO;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/app/android/universalwidgets/widgets/uw/old/uobject/data/UniversalWidgetDTO$DesignTypeDTO;", "getDesignType", "Lru/ozon/app/android/universalwidgets/widgets/uw/old/uobject/data/UniversalWidgetDTO$FooterDTO;", "getFooter", "Lru/ozon/app/android/universalwidgets/widgets/uw/old/uobject/data/UniversalWidgetDTO$HeaderDTO;", "getHeader", "Ljava/util/List;", "getItems", "Lru/ozon/app/android/universalwidgets/widgets/uw/old/uobject/data/UniversalWidgetDTO$ObjectGrid3NewDTO;", "getObjectGrid3New", "viewType", "Lru/ozon/composer/ui/widget/h;", "getViewType", "()Lru/ozon/composer/ui/widget/h;", "isStubFooter", "Z", "()Z", "isStubHeader", "Companion", "DesignTypeDTO", "FooterDTO", "HeaderDTO", "ItemDTO", "ObjectGrid3NewDTO", "universalwidgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class UniversalWidgetDTO {
    private static final int DEFAULT_PADDING = UiExtKt.toPx(16);
    private static final int dp4 = UiExtKt.toPx(4);

    @NotNull
    private final DesignTypeDTO designType;
    private final FooterDTO footer;
    private final HeaderDTO header;
    private final boolean isStubFooter;
    private final boolean isStubHeader;
    private final List<ItemDTO> items;
    private final ObjectGrid3NewDTO objectGrid3New;

    @NotNull
    private final h viewType;

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BO\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rJ\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u001c\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u0014J\u0017\u0010\u001d\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nHÆ\u0003Jb\u0010\u001e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nHÆ\u0001¢\u0006\u0002\u0010\u001fJ\u0013\u0010 \u001a\u00020\b2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\"\u001a\u00020#HÖ\u0001J\t\u0010$\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000fR\u0015\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010\u0015\u001a\u0004\b\u0013\u0010\u0014R\u001f\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017¨\u0006%"}, d2 = {"Lru/ozon/app/android/universalwidgets/widgets/uw/old/uobject/data/UniversalWidgetDTO$FooterDTO;", "", "type", "", "id", SelectionItemFormDTO.TITLE_FIELD_NAME, "deeplink", "disclosure", "", "trackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/util/Map;)V", "getType", "()Ljava/lang/String;", "getId", "getTitle", "getDeeplink", "getDisclosure", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getTrackingInfo", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/util/Map;)Lru/ozon/app/android/universalwidgets/widgets/uw/old/uobject/data/UniversalWidgetDTO$FooterDTO;", "equals", "other", "hashCode", "", "toString", "universalwidgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class FooterDTO {
        private final String deeplink;
        private final Boolean disclosure;
        private final String id;
        private final String title;
        private final Map<String, TokenizedTrackingInfo> trackingInfo;
        private final String type;

        public FooterDTO(String str, String str2, String str3, String str4, Boolean bool, Map<String, TokenizedTrackingInfo> map) {
            this.type = str;
            this.id = str2;
            this.title = str3;
            this.deeplink = str4;
            this.disclosure = bool;
            this.trackingInfo = map;
        }

        public static /* synthetic */ FooterDTO copy$default(FooterDTO footerDTO, String str, String str2, String str3, String str4, Boolean bool, Map map, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = footerDTO.type;
            }
            if ((i11 & 2) != 0) {
                str2 = footerDTO.id;
            }
            if ((i11 & 4) != 0) {
                str3 = footerDTO.title;
            }
            if ((i11 & 8) != 0) {
                str4 = footerDTO.deeplink;
            }
            if ((i11 & 16) != 0) {
                bool = footerDTO.disclosure;
            }
            if ((i11 & 32) != 0) {
                map = footerDTO.trackingInfo;
            }
            Boolean bool2 = bool;
            Map map2 = map;
            return footerDTO.copy(str, str2, str3, str4, bool2, map2);
        }

        /* renamed from: component1, reason: from getter */
        public final String getType() {
            return this.type;
        }

        /* renamed from: component2, reason: from getter */
        public final String getId() {
            return this.id;
        }

        /* renamed from: component3, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        /* renamed from: component4, reason: from getter */
        public final String getDeeplink() {
            return this.deeplink;
        }

        /* renamed from: component5, reason: from getter */
        public final Boolean getDisclosure() {
            return this.disclosure;
        }

        public final Map<String, TokenizedTrackingInfo> component6() {
            return this.trackingInfo;
        }

        @NotNull
        public final FooterDTO copy(String type, String id2, String title, String deeplink, Boolean disclosure, Map<String, TokenizedTrackingInfo> trackingInfo) {
            return new FooterDTO(type, id2, title, deeplink, disclosure, trackingInfo);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof FooterDTO)) {
                return false;
            }
            FooterDTO footerDTO = (FooterDTO) other;
            return Intrinsics.d(this.type, footerDTO.type) && Intrinsics.d(this.id, footerDTO.id) && Intrinsics.d(this.title, footerDTO.title) && Intrinsics.d(this.deeplink, footerDTO.deeplink) && Intrinsics.d(this.disclosure, footerDTO.disclosure) && Intrinsics.d(this.trackingInfo, footerDTO.trackingInfo);
        }

        public final String getDeeplink() {
            return this.deeplink;
        }

        public final Boolean getDisclosure() {
            return this.disclosure;
        }

        public final String getId() {
            return this.id;
        }

        public final String getTitle() {
            return this.title;
        }

        public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
            return this.trackingInfo;
        }

        public final String getType() {
            return this.type;
        }

        public int hashCode() {
            String str = this.type;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.id;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.title;
            int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.deeplink;
            int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
            Boolean bool = this.disclosure;
            int hashCode5 = (hashCode4 + (bool == null ? 0 : bool.hashCode())) * 31;
            Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
            return hashCode5 + (map != null ? map.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            String str = this.type;
            String str2 = this.id;
            String str3 = this.title;
            String str4 = this.deeplink;
            Boolean bool = this.disclosure;
            Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
            StringBuilder d11 = C3660k.d("FooterDTO(type=", str, ", id=", str2, ", title=");
            a.h(d11, str3, ", deeplink=", str4, ", disclosure=");
            d11.append(bool);
            d11.append(", trackingInfo=");
            d11.append(map);
            d11.append(")");
            return d11.toString();
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BW\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\u0014\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u001f\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010\u0016J\u0017\u0010 \u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bHÆ\u0003Jl\u0010!\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\u0016\b\u0002\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bHÆ\u0001¢\u0006\u0002\u0010\"J\u0013\u0010#\u001a\u00020\t2\b\u0010$\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010%\u001a\u00020&HÖ\u0001J\t\u0010'\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0010R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0010R\u0015\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\n\n\u0002\u0010\u0017\u001a\u0004\b\u0015\u0010\u0016R\u001f\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019¨\u0006("}, d2 = {"Lru/ozon/app/android/universalwidgets/widgets/uw/old/uobject/data/UniversalWidgetDTO$HeaderDTO;", "", "type", "", "id", SelectionItemFormDTO.TITLE_FIELD_NAME, "subtitle", "deeplink", "disclosure", "", "trackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/util/Map;)V", "getType", "()Ljava/lang/String;", "getId", "getTitle", "getSubtitle", "getDeeplink", "getDisclosure", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getTrackingInfo", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/util/Map;)Lru/ozon/app/android/universalwidgets/widgets/uw/old/uobject/data/UniversalWidgetDTO$HeaderDTO;", "equals", "other", "hashCode", "", "toString", "universalwidgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class HeaderDTO {
        private final String deeplink;
        private final Boolean disclosure;
        private final String id;
        private final String subtitle;

        @NotNull
        private final String title;
        private final Map<String, TokenizedTrackingInfo> trackingInfo;
        private final String type;

        public HeaderDTO(String str, String str2, @NotNull String title, String str3, String str4, Boolean bool, Map<String, TokenizedTrackingInfo> map) {
            Intrinsics.checkNotNullParameter(title, "title");
            this.type = str;
            this.id = str2;
            this.title = title;
            this.subtitle = str3;
            this.deeplink = str4;
            this.disclosure = bool;
            this.trackingInfo = map;
        }

        public static /* synthetic */ HeaderDTO copy$default(HeaderDTO headerDTO, String str, String str2, String str3, String str4, String str5, Boolean bool, Map map, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = headerDTO.type;
            }
            if ((i11 & 2) != 0) {
                str2 = headerDTO.id;
            }
            if ((i11 & 4) != 0) {
                str3 = headerDTO.title;
            }
            if ((i11 & 8) != 0) {
                str4 = headerDTO.subtitle;
            }
            if ((i11 & 16) != 0) {
                str5 = headerDTO.deeplink;
            }
            if ((i11 & 32) != 0) {
                bool = headerDTO.disclosure;
            }
            if ((i11 & 64) != 0) {
                map = headerDTO.trackingInfo;
            }
            Boolean bool2 = bool;
            Map map2 = map;
            String str6 = str5;
            String str7 = str3;
            return headerDTO.copy(str, str2, str7, str4, str6, bool2, map2);
        }

        /* renamed from: component1, reason: from getter */
        public final String getType() {
            return this.type;
        }

        /* renamed from: component2, reason: from getter */
        public final String getId() {
            return this.id;
        }

        @NotNull
        /* renamed from: component3, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        /* renamed from: component4, reason: from getter */
        public final String getSubtitle() {
            return this.subtitle;
        }

        /* renamed from: component5, reason: from getter */
        public final String getDeeplink() {
            return this.deeplink;
        }

        /* renamed from: component6, reason: from getter */
        public final Boolean getDisclosure() {
            return this.disclosure;
        }

        public final Map<String, TokenizedTrackingInfo> component7() {
            return this.trackingInfo;
        }

        @NotNull
        public final HeaderDTO copy(String type, String id2, @NotNull String title, String subtitle, String deeplink, Boolean disclosure, Map<String, TokenizedTrackingInfo> trackingInfo) {
            Intrinsics.checkNotNullParameter(title, "title");
            return new HeaderDTO(type, id2, title, subtitle, deeplink, disclosure, trackingInfo);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof HeaderDTO)) {
                return false;
            }
            HeaderDTO headerDTO = (HeaderDTO) other;
            return Intrinsics.d(this.type, headerDTO.type) && Intrinsics.d(this.id, headerDTO.id) && Intrinsics.d(this.title, headerDTO.title) && Intrinsics.d(this.subtitle, headerDTO.subtitle) && Intrinsics.d(this.deeplink, headerDTO.deeplink) && Intrinsics.d(this.disclosure, headerDTO.disclosure) && Intrinsics.d(this.trackingInfo, headerDTO.trackingInfo);
        }

        public final String getDeeplink() {
            return this.deeplink;
        }

        public final Boolean getDisclosure() {
            return this.disclosure;
        }

        public final String getId() {
            return this.id;
        }

        public final String getSubtitle() {
            return this.subtitle;
        }

        @NotNull
        public final String getTitle() {
            return this.title;
        }

        public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
            return this.trackingInfo;
        }

        public final String getType() {
            return this.type;
        }

        public int hashCode() {
            String str = this.type;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.id;
            int a11 = g.a((hashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.title);
            String str3 = this.subtitle;
            int hashCode2 = (a11 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.deeplink;
            int hashCode3 = (hashCode2 + (str4 == null ? 0 : str4.hashCode())) * 31;
            Boolean bool = this.disclosure;
            int hashCode4 = (hashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
            Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
            return hashCode4 + (map != null ? map.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            String str = this.type;
            String str2 = this.id;
            String str3 = this.title;
            String str4 = this.subtitle;
            String str5 = this.deeplink;
            Boolean bool = this.disclosure;
            Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
            StringBuilder d11 = C3660k.d("HeaderDTO(type=", str, ", id=", str2, ", title=");
            a.h(d11, str3, ", subtitle=", str4, ", deeplink=");
            Sh.a.d(bool, str5, ", disclosure=", ", trackingInfo=", d11);
            return P.f(d11, map, ")");
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\bD\b\u0087\b\u0018\u00002\u00020\u0001B\u0093\u0002\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0015\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u001e\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\u0015\u0012\u0014\u0010 \u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\"\u0018\u00010!\u0012\u000e\u0010#\u001a\n\u0012\u0004\u0012\u00020%\u0018\u00010$¢\u0006\u0004\b&\u0010'J\u0010\u0010J\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010)J\u000b\u0010K\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u0010L\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010.J\u000b\u0010M\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010N\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010O\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010P\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010Q\u001a\u0004\u0018\u00010\rHÆ\u0003J\u0010\u0010R\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010)J\u000b\u0010S\u001a\u0004\u0018\u00010\rHÆ\u0003J\u000b\u0010T\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010U\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u0010V\u001a\u0004\u0018\u00010\u0013HÆ\u0003¢\u0006\u0002\u0010;J\u0010\u0010W\u001a\u0004\u0018\u00010\u0015HÆ\u0003¢\u0006\u0002\u0010=J\u0010\u0010X\u001a\u0004\u0018\u00010\u0015HÆ\u0003¢\u0006\u0002\u0010=J\u0010\u0010Y\u001a\u0004\u0018\u00010\u0015HÆ\u0003¢\u0006\u0002\u0010=J\u000b\u0010Z\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u0010[\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010)J\u000b\u0010\\\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010]\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010^\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010_\u001a\u0004\u0018\u00010\u001eHÆ\u0003J\u0010\u0010`\u001a\u0004\u0018\u00010\u0015HÆ\u0003¢\u0006\u0002\u0010=J\u0017\u0010a\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\"\u0018\u00010!HÆ\u0003J\u0011\u0010b\u001a\n\u0012\u0004\u0012\u00020%\u0018\u00010$HÆ\u0003JÌ\u0002\u0010c\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u00152\u0016\b\u0002\u0010 \u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\"\u0018\u00010!2\u0010\b\u0002\u0010#\u001a\n\u0012\u0004\u0012\u00020%\u0018\u00010$HÆ\u0001¢\u0006\u0002\u0010dJ\u0013\u0010e\u001a\u00020\u00152\b\u0010f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010g\u001a\u00020\u0003HÖ\u0001J\t\u0010h\u001a\u00020\u0005HÖ\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010*\u001a\u0004\b(\u0010)R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b+\u0010,R\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010/\u001a\u0004\b-\u0010.R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b0\u0010,R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b1\u0010,R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b2\u0010,R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b3\u0010,R\u0013\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b4\u00105R\u0015\u0010\u000e\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010*\u001a\u0004\b6\u0010)R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b7\u00105R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b8\u0010,R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b9\u0010,R\u0015\u0010\u0012\u001a\u0004\u0018\u00010\u0013¢\u0006\n\n\u0002\u0010<\u001a\u0004\b:\u0010;R\u0015\u0010\u0014\u001a\u0004\u0018\u00010\u0015¢\u0006\n\n\u0002\u0010>\u001a\u0004\b\u0014\u0010=R\u0015\u0010\u0016\u001a\u0004\u0018\u00010\u0015¢\u0006\n\n\u0002\u0010>\u001a\u0004\b\u0016\u0010=R\u0015\u0010\u0017\u001a\u0004\u0018\u00010\u0015¢\u0006\n\n\u0002\u0010>\u001a\u0004\b\u0017\u0010=R\u0013\u0010\u0018\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b?\u0010,R\u0015\u0010\u0019\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010*\u001a\u0004\b@\u0010)R\u0013\u0010\u001a\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\bA\u0010,R\u0013\u0010\u001b\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\bB\u0010,R\u0013\u0010\u001c\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\bC\u0010,R\u0013\u0010\u001d\u001a\u0004\u0018\u00010\u001e¢\u0006\b\n\u0000\u001a\u0004\bD\u0010ER\u0015\u0010\u001f\u001a\u0004\u0018\u00010\u0015¢\u0006\n\n\u0002\u0010>\u001a\u0004\b\u001f\u0010=R\u001f\u0010 \u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\"\u0018\u00010!¢\u0006\b\n\u0000\u001a\u0004\bF\u0010GR\u0019\u0010#\u001a\n\u0012\u0004\u0012\u00020%\u0018\u00010$¢\u0006\b\n\u0000\u001a\u0004\bH\u0010I¨\u0006i"}, d2 = {"Lru/ozon/app/android/universalwidgets/widgets/uw/old/uobject/data/UniversalWidgetDTO$ItemDTO;", "", "index", "", "type", "", "id", "", "brand", SelectionItemFormDTO.TITLE_FIELD_NAME, "subtitle", "image", "price", "Ljava/math/BigDecimal;", "discount", "finalPrice", "link", "deeplink", "rating", "", FavoriteProductMolecule.IS_ADULT_PARAMS_NAME, "", "isFavorite", "isInCart", "marketLabel", "commentsCount", "advert", "algorithm", "advId", "adBadge", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "isImageBackgroundHidden", "trackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "pixel", "", "Lru/ozon/app/android/ads/common/pixel/data/PixelDTO;", "<init>", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/lang/Integer;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Float;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;Ljava/lang/Boolean;Ljava/util/Map;Ljava/util/List;)V", "getIndex", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getType", "()Ljava/lang/String;", "getId", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getBrand", "getTitle", "getSubtitle", "getImage", "getPrice", "()Ljava/math/BigDecimal;", "getDiscount", "getFinalPrice", "getLink", "getDeeplink", "getRating", "()Ljava/lang/Float;", "Ljava/lang/Float;", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getMarketLabel", "getCommentsCount", "getAdvert", "getAlgorithm", "getAdvId", "getAdBadge", "()Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "getTrackingInfo", "()Ljava/util/Map;", "getPixel", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "component21", "component22", "component23", "component24", "component25", "copy", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/lang/Integer;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Float;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;Ljava/lang/Boolean;Ljava/util/Map;Ljava/util/List;)Lru/ozon/app/android/universalwidgets/widgets/uw/old/uobject/data/UniversalWidgetDTO$ItemDTO;", "equals", "other", "hashCode", "toString", "universalwidgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ItemDTO {
        private final BadgeDTO adBadge;
        private final String advId;
        private final String advert;
        private final String algorithm;
        private final String brand;
        private final Integer commentsCount;
        private final String deeplink;
        private final Integer discount;
        private final BigDecimal finalPrice;
        private final Long id;
        private final String image;
        private final Integer index;
        private final Boolean isAdult;
        private final Boolean isFavorite;
        private final Boolean isImageBackgroundHidden;
        private final Boolean isInCart;
        private final String link;
        private final String marketLabel;
        private final List<PixelDTO> pixel;
        private final BigDecimal price;
        private final Float rating;
        private final String subtitle;
        private final String title;
        private final Map<String, TokenizedTrackingInfo> trackingInfo;
        private final String type;

        public ItemDTO(Integer num, String str, Long l11, String str2, String str3, String str4, String str5, BigDecimal bigDecimal, Integer num2, BigDecimal bigDecimal2, String str6, String str7, Float f7, Boolean bool, Boolean bool2, Boolean bool3, String str8, Integer num3, String str9, String str10, String str11, BadgeDTO badgeDTO, Boolean bool4, Map<String, TokenizedTrackingInfo> map, List<PixelDTO> list) {
            this.index = num;
            this.type = str;
            this.id = l11;
            this.brand = str2;
            this.title = str3;
            this.subtitle = str4;
            this.image = str5;
            this.price = bigDecimal;
            this.discount = num2;
            this.finalPrice = bigDecimal2;
            this.link = str6;
            this.deeplink = str7;
            this.rating = f7;
            this.isAdult = bool;
            this.isFavorite = bool2;
            this.isInCart = bool3;
            this.marketLabel = str8;
            this.commentsCount = num3;
            this.advert = str9;
            this.algorithm = str10;
            this.advId = str11;
            this.adBadge = badgeDTO;
            this.isImageBackgroundHidden = bool4;
            this.trackingInfo = map;
            this.pixel = list;
        }

        public static /* synthetic */ ItemDTO copy$default(ItemDTO itemDTO, Integer num, String str, Long l11, String str2, String str3, String str4, String str5, BigDecimal bigDecimal, Integer num2, BigDecimal bigDecimal2, String str6, String str7, Float f7, Boolean bool, Boolean bool2, Boolean bool3, String str8, Integer num3, String str9, String str10, String str11, BadgeDTO badgeDTO, Boolean bool4, Map map, List list, int i11, Object obj) {
            List list2;
            Map map2;
            Integer num4 = (i11 & 1) != 0 ? itemDTO.index : num;
            String str12 = (i11 & 2) != 0 ? itemDTO.type : str;
            Long l12 = (i11 & 4) != 0 ? itemDTO.id : l11;
            String str13 = (i11 & 8) != 0 ? itemDTO.brand : str2;
            String str14 = (i11 & 16) != 0 ? itemDTO.title : str3;
            String str15 = (i11 & 32) != 0 ? itemDTO.subtitle : str4;
            String str16 = (i11 & 64) != 0 ? itemDTO.image : str5;
            BigDecimal bigDecimal3 = (i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? itemDTO.price : bigDecimal;
            Integer num5 = (i11 & 256) != 0 ? itemDTO.discount : num2;
            BigDecimal bigDecimal4 = (i11 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? itemDTO.finalPrice : bigDecimal2;
            String str17 = (i11 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? itemDTO.link : str6;
            String str18 = (i11 & 2048) != 0 ? itemDTO.deeplink : str7;
            Float f11 = (i11 & 4096) != 0 ? itemDTO.rating : f7;
            Boolean bool5 = (i11 & 8192) != 0 ? itemDTO.isAdult : bool;
            Integer num6 = num4;
            Boolean bool6 = (i11 & 16384) != 0 ? itemDTO.isFavorite : bool2;
            Boolean bool7 = (i11 & 32768) != 0 ? itemDTO.isInCart : bool3;
            String str19 = (i11 & 65536) != 0 ? itemDTO.marketLabel : str8;
            Integer num7 = (i11 & 131072) != 0 ? itemDTO.commentsCount : num3;
            String str20 = (i11 & 262144) != 0 ? itemDTO.advert : str9;
            String str21 = (i11 & 524288) != 0 ? itemDTO.algorithm : str10;
            String str22 = (i11 & 1048576) != 0 ? itemDTO.advId : str11;
            BadgeDTO badgeDTO2 = (i11 & 2097152) != 0 ? itemDTO.adBadge : badgeDTO;
            Boolean bool8 = (i11 & 4194304) != 0 ? itemDTO.isImageBackgroundHidden : bool4;
            Map map3 = (i11 & 8388608) != 0 ? itemDTO.trackingInfo : map;
            if ((i11 & 16777216) != 0) {
                map2 = map3;
                list2 = itemDTO.pixel;
            } else {
                list2 = list;
                map2 = map3;
            }
            return itemDTO.copy(num6, str12, l12, str13, str14, str15, str16, bigDecimal3, num5, bigDecimal4, str17, str18, f11, bool5, bool6, bool7, str19, num7, str20, str21, str22, badgeDTO2, bool8, map2, list2);
        }

        /* renamed from: component1, reason: from getter */
        public final Integer getIndex() {
            return this.index;
        }

        /* renamed from: component10, reason: from getter */
        public final BigDecimal getFinalPrice() {
            return this.finalPrice;
        }

        /* renamed from: component11, reason: from getter */
        public final String getLink() {
            return this.link;
        }

        /* renamed from: component12, reason: from getter */
        public final String getDeeplink() {
            return this.deeplink;
        }

        /* renamed from: component13, reason: from getter */
        public final Float getRating() {
            return this.rating;
        }

        /* renamed from: component14, reason: from getter */
        public final Boolean getIsAdult() {
            return this.isAdult;
        }

        /* renamed from: component15, reason: from getter */
        public final Boolean getIsFavorite() {
            return this.isFavorite;
        }

        /* renamed from: component16, reason: from getter */
        public final Boolean getIsInCart() {
            return this.isInCart;
        }

        /* renamed from: component17, reason: from getter */
        public final String getMarketLabel() {
            return this.marketLabel;
        }

        /* renamed from: component18, reason: from getter */
        public final Integer getCommentsCount() {
            return this.commentsCount;
        }

        /* renamed from: component19, reason: from getter */
        public final String getAdvert() {
            return this.advert;
        }

        /* renamed from: component2, reason: from getter */
        public final String getType() {
            return this.type;
        }

        /* renamed from: component20, reason: from getter */
        public final String getAlgorithm() {
            return this.algorithm;
        }

        /* renamed from: component21, reason: from getter */
        public final String getAdvId() {
            return this.advId;
        }

        /* renamed from: component22, reason: from getter */
        public final BadgeDTO getAdBadge() {
            return this.adBadge;
        }

        /* renamed from: component23, reason: from getter */
        public final Boolean getIsImageBackgroundHidden() {
            return this.isImageBackgroundHidden;
        }

        public final Map<String, TokenizedTrackingInfo> component24() {
            return this.trackingInfo;
        }

        public final List<PixelDTO> component25() {
            return this.pixel;
        }

        /* renamed from: component3, reason: from getter */
        public final Long getId() {
            return this.id;
        }

        /* renamed from: component4, reason: from getter */
        public final String getBrand() {
            return this.brand;
        }

        /* renamed from: component5, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        /* renamed from: component6, reason: from getter */
        public final String getSubtitle() {
            return this.subtitle;
        }

        /* renamed from: component7, reason: from getter */
        public final String getImage() {
            return this.image;
        }

        /* renamed from: component8, reason: from getter */
        public final BigDecimal getPrice() {
            return this.price;
        }

        /* renamed from: component9, reason: from getter */
        public final Integer getDiscount() {
            return this.discount;
        }

        @NotNull
        public final ItemDTO copy(Integer index, String type, Long id2, String brand, String title, String subtitle, String image, BigDecimal price, Integer discount, BigDecimal finalPrice, String link, String deeplink, Float rating, Boolean isAdult, Boolean isFavorite, Boolean isInCart, String marketLabel, Integer commentsCount, String advert, String algorithm, String advId, BadgeDTO adBadge, Boolean isImageBackgroundHidden, Map<String, TokenizedTrackingInfo> trackingInfo, List<PixelDTO> pixel) {
            return new ItemDTO(index, type, id2, brand, title, subtitle, image, price, discount, finalPrice, link, deeplink, rating, isAdult, isFavorite, isInCart, marketLabel, commentsCount, advert, algorithm, advId, adBadge, isImageBackgroundHidden, trackingInfo, pixel);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ItemDTO)) {
                return false;
            }
            ItemDTO itemDTO = (ItemDTO) other;
            return Intrinsics.d(this.index, itemDTO.index) && Intrinsics.d(this.type, itemDTO.type) && Intrinsics.d(this.id, itemDTO.id) && Intrinsics.d(this.brand, itemDTO.brand) && Intrinsics.d(this.title, itemDTO.title) && Intrinsics.d(this.subtitle, itemDTO.subtitle) && Intrinsics.d(this.image, itemDTO.image) && Intrinsics.d(this.price, itemDTO.price) && Intrinsics.d(this.discount, itemDTO.discount) && Intrinsics.d(this.finalPrice, itemDTO.finalPrice) && Intrinsics.d(this.link, itemDTO.link) && Intrinsics.d(this.deeplink, itemDTO.deeplink) && Intrinsics.d(this.rating, itemDTO.rating) && Intrinsics.d(this.isAdult, itemDTO.isAdult) && Intrinsics.d(this.isFavorite, itemDTO.isFavorite) && Intrinsics.d(this.isInCart, itemDTO.isInCart) && Intrinsics.d(this.marketLabel, itemDTO.marketLabel) && Intrinsics.d(this.commentsCount, itemDTO.commentsCount) && Intrinsics.d(this.advert, itemDTO.advert) && Intrinsics.d(this.algorithm, itemDTO.algorithm) && Intrinsics.d(this.advId, itemDTO.advId) && Intrinsics.d(this.adBadge, itemDTO.adBadge) && Intrinsics.d(this.isImageBackgroundHidden, itemDTO.isImageBackgroundHidden) && Intrinsics.d(this.trackingInfo, itemDTO.trackingInfo) && Intrinsics.d(this.pixel, itemDTO.pixel);
        }

        public final BadgeDTO getAdBadge() {
            return this.adBadge;
        }

        public final String getAdvId() {
            return this.advId;
        }

        public final String getAdvert() {
            return this.advert;
        }

        public final String getAlgorithm() {
            return this.algorithm;
        }

        public final String getBrand() {
            return this.brand;
        }

        public final Integer getCommentsCount() {
            return this.commentsCount;
        }

        public final String getDeeplink() {
            return this.deeplink;
        }

        public final Integer getDiscount() {
            return this.discount;
        }

        public final BigDecimal getFinalPrice() {
            return this.finalPrice;
        }

        public final Long getId() {
            return this.id;
        }

        public final String getImage() {
            return this.image;
        }

        public final Integer getIndex() {
            return this.index;
        }

        public final String getLink() {
            return this.link;
        }

        public final String getMarketLabel() {
            return this.marketLabel;
        }

        public final List<PixelDTO> getPixel() {
            return this.pixel;
        }

        public final BigDecimal getPrice() {
            return this.price;
        }

        public final Float getRating() {
            return this.rating;
        }

        public final String getSubtitle() {
            return this.subtitle;
        }

        public final String getTitle() {
            return this.title;
        }

        public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
            return this.trackingInfo;
        }

        public final String getType() {
            return this.type;
        }

        public int hashCode() {
            Integer num = this.index;
            int hashCode = (num == null ? 0 : num.hashCode()) * 31;
            String str = this.type;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            Long l11 = this.id;
            int hashCode3 = (hashCode2 + (l11 == null ? 0 : l11.hashCode())) * 31;
            String str2 = this.brand;
            int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.title;
            int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.subtitle;
            int hashCode6 = (hashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.image;
            int hashCode7 = (hashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
            BigDecimal bigDecimal = this.price;
            int hashCode8 = (hashCode7 + (bigDecimal == null ? 0 : bigDecimal.hashCode())) * 31;
            Integer num2 = this.discount;
            int hashCode9 = (hashCode8 + (num2 == null ? 0 : num2.hashCode())) * 31;
            BigDecimal bigDecimal2 = this.finalPrice;
            int hashCode10 = (hashCode9 + (bigDecimal2 == null ? 0 : bigDecimal2.hashCode())) * 31;
            String str6 = this.link;
            int hashCode11 = (hashCode10 + (str6 == null ? 0 : str6.hashCode())) * 31;
            String str7 = this.deeplink;
            int hashCode12 = (hashCode11 + (str7 == null ? 0 : str7.hashCode())) * 31;
            Float f7 = this.rating;
            int hashCode13 = (hashCode12 + (f7 == null ? 0 : f7.hashCode())) * 31;
            Boolean bool = this.isAdult;
            int hashCode14 = (hashCode13 + (bool == null ? 0 : bool.hashCode())) * 31;
            Boolean bool2 = this.isFavorite;
            int hashCode15 = (hashCode14 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
            Boolean bool3 = this.isInCart;
            int hashCode16 = (hashCode15 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
            String str8 = this.marketLabel;
            int hashCode17 = (hashCode16 + (str8 == null ? 0 : str8.hashCode())) * 31;
            Integer num3 = this.commentsCount;
            int hashCode18 = (hashCode17 + (num3 == null ? 0 : num3.hashCode())) * 31;
            String str9 = this.advert;
            int hashCode19 = (hashCode18 + (str9 == null ? 0 : str9.hashCode())) * 31;
            String str10 = this.algorithm;
            int hashCode20 = (hashCode19 + (str10 == null ? 0 : str10.hashCode())) * 31;
            String str11 = this.advId;
            int hashCode21 = (hashCode20 + (str11 == null ? 0 : str11.hashCode())) * 31;
            BadgeDTO badgeDTO = this.adBadge;
            int hashCode22 = (hashCode21 + (badgeDTO == null ? 0 : badgeDTO.hashCode())) * 31;
            Boolean bool4 = this.isImageBackgroundHidden;
            int hashCode23 = (hashCode22 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
            Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
            int hashCode24 = (hashCode23 + (map == null ? 0 : map.hashCode())) * 31;
            List<PixelDTO> list = this.pixel;
            return hashCode24 + (list != null ? list.hashCode() : 0);
        }

        public final Boolean isAdult() {
            return this.isAdult;
        }

        public final Boolean isFavorite() {
            return this.isFavorite;
        }

        public final Boolean isImageBackgroundHidden() {
            return this.isImageBackgroundHidden;
        }

        public final Boolean isInCart() {
            return this.isInCart;
        }

        @NotNull
        public String toString() {
            Integer num = this.index;
            String str = this.type;
            Long l11 = this.id;
            String str2 = this.brand;
            String str3 = this.title;
            String str4 = this.subtitle;
            String str5 = this.image;
            BigDecimal bigDecimal = this.price;
            Integer num2 = this.discount;
            BigDecimal bigDecimal2 = this.finalPrice;
            String str6 = this.link;
            String str7 = this.deeplink;
            Float f7 = this.rating;
            Boolean bool = this.isAdult;
            Boolean bool2 = this.isFavorite;
            Boolean bool3 = this.isInCart;
            String str8 = this.marketLabel;
            Integer num3 = this.commentsCount;
            String str9 = this.advert;
            String str10 = this.algorithm;
            String str11 = this.advId;
            BadgeDTO badgeDTO = this.adBadge;
            Boolean bool4 = this.isImageBackgroundHidden;
            Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
            List<PixelDTO> list = this.pixel;
            StringBuilder sb2 = new StringBuilder("ItemDTO(index=");
            sb2.append(num);
            sb2.append(", type=");
            sb2.append(str);
            sb2.append(", id=");
            sb2.append(l11);
            sb2.append(", brand=");
            sb2.append(str2);
            sb2.append(", title=");
            a.h(sb2, str3, ", subtitle=", str4, ", image=");
            sb2.append(str5);
            sb2.append(", price=");
            sb2.append(bigDecimal);
            sb2.append(", discount=");
            sb2.append(num2);
            sb2.append(", finalPrice=");
            sb2.append(bigDecimal2);
            sb2.append(", link=");
            a.h(sb2, str6, ", deeplink=", str7, ", rating=");
            sb2.append(f7);
            sb2.append(", isAdult=");
            sb2.append(bool);
            sb2.append(", isFavorite=");
            D3.h.h(sb2, bool2, ", isInCart=", bool3, ", marketLabel=");
            C2454a.f(num3, str8, ", commentsCount=", ", advert=", sb2);
            a.h(sb2, str9, ", algorithm=", str10, ", advId=");
            sb2.append(str11);
            sb2.append(", adBadge=");
            sb2.append(badgeDTO);
            sb2.append(", isImageBackgroundHidden=");
            sb2.append(bool4);
            sb2.append(", trackingInfo=");
            sb2.append(map);
            sb2.append(", pixel=");
            return C2618u.h(sb2, list, ")");
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ObjectItemsVO.Paddings.Position.values().length];
            try {
                iArr[ObjectItemsVO.Paddings.Position.TOP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ObjectItemsVO.Paddings.Position.LEFT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ObjectItemsVO.Paddings.Position.RIGHT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ObjectItemsVO.Paddings.Position.BOTTOM.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public UniversalWidgetDTO(@NotNull DesignTypeDTO designType, FooterDTO footerDTO, HeaderDTO headerDTO, List<ItemDTO> list, @i(name = "object") ObjectGrid3NewDTO objectGrid3NewDTO) {
        String title;
        Intrinsics.checkNotNullParameter(designType, "designType");
        this.designType = designType;
        this.footer = footerDTO;
        this.header = headerDTO;
        this.items = list;
        this.objectGrid3New = objectGrid3NewDTO;
        this.viewType = toViewType(designType.getType());
        boolean z11 = true;
        this.isStubFooter = footerDTO == null || (title = footerDTO.getTitle()) == null || kotlin.text.h.K(title);
        if (headerDTO != null && !kotlin.text.h.K(headerDTO.getTitle())) {
            z11 = false;
        }
        this.isStubHeader = z11;
    }

    public static /* synthetic */ UniversalWidgetDTO copy$default(UniversalWidgetDTO universalWidgetDTO, DesignTypeDTO designTypeDTO, FooterDTO footerDTO, HeaderDTO headerDTO, List list, ObjectGrid3NewDTO objectGrid3NewDTO, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            designTypeDTO = universalWidgetDTO.designType;
        }
        if ((i11 & 2) != 0) {
            footerDTO = universalWidgetDTO.footer;
        }
        if ((i11 & 4) != 0) {
            headerDTO = universalWidgetDTO.header;
        }
        if ((i11 & 8) != 0) {
            list = universalWidgetDTO.items;
        }
        if ((i11 & 16) != 0) {
            objectGrid3NewDTO = universalWidgetDTO.objectGrid3New;
        }
        ObjectGrid3NewDTO objectGrid3NewDTO2 = objectGrid3NewDTO;
        HeaderDTO headerDTO2 = headerDTO;
        return universalWidgetDTO.copy(designTypeDTO, footerDTO, headerDTO2, list, objectGrid3NewDTO2);
    }

    private final h toViewType(String str) {
        return Intrinsics.d(str, "object.grid1") ? h.f.f94874b : Intrinsics.d(str, "object.grid3") ? h.c.f94871b : h.b.f94870b;
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final DesignTypeDTO getDesignType() {
        return this.designType;
    }

    /* renamed from: component2, reason: from getter */
    public final FooterDTO getFooter() {
        return this.footer;
    }

    /* renamed from: component3, reason: from getter */
    public final HeaderDTO getHeader() {
        return this.header;
    }

    public final List<ItemDTO> component4() {
        return this.items;
    }

    /* renamed from: component5, reason: from getter */
    public final ObjectGrid3NewDTO getObjectGrid3New() {
        return this.objectGrid3New;
    }

    @NotNull
    public final UniversalWidgetDTO copy(@NotNull DesignTypeDTO designType, FooterDTO footer, HeaderDTO header, List<ItemDTO> items, @i(name = "object") ObjectGrid3NewDTO objectGrid3New) {
        Intrinsics.checkNotNullParameter(designType, "designType");
        return new UniversalWidgetDTO(designType, footer, header, items, objectGrid3New);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UniversalWidgetDTO)) {
            return false;
        }
        UniversalWidgetDTO universalWidgetDTO = (UniversalWidgetDTO) other;
        return Intrinsics.d(this.designType, universalWidgetDTO.designType) && Intrinsics.d(this.footer, universalWidgetDTO.footer) && Intrinsics.d(this.header, universalWidgetDTO.header) && Intrinsics.d(this.items, universalWidgetDTO.items) && Intrinsics.d(this.objectGrid3New, universalWidgetDTO.objectGrid3New);
    }

    public final int fetchPadding(@NotNull ObjectItemsVO.Paddings.Position position) {
        Intrinsics.checkNotNullParameter(position, "position");
        if (!this.isStubFooter || !this.isStubHeader) {
            int i11 = WhenMappings.$EnumSwitchMapping$0[position.ordinal()];
            if (i11 == 1) {
                return dp4;
            }
            if (i11 != 2 && i11 != 3) {
                if (i11 == 4) {
                    return dp4;
                }
                throw new o();
            }
            return DEFAULT_PADDING;
        }
        DesignTypeDTO.OptionsDTO options = this.designType.getOptions();
        if (options == null) {
            return DEFAULT_PADDING;
        }
        int i12 = WhenMappings.$EnumSwitchMapping$0[position.ordinal()];
        Integer num = null;
        if (i12 == 1) {
            Integer paddingTop = options.getPaddingTop();
            if (paddingTop != null) {
                num = Integer.valueOf(UiExtKt.toPx(paddingTop.intValue()));
            }
        } else if (i12 == 2) {
            Integer paddingLeft = options.getPaddingLeft();
            if (paddingLeft != null) {
                num = Integer.valueOf(UiExtKt.toPx(paddingLeft.intValue()));
            }
        } else if (i12 == 3) {
            Integer paddingRight = options.getPaddingRight();
            if (paddingRight != null) {
                num = Integer.valueOf(UiExtKt.toPx(paddingRight.intValue()));
            }
        } else {
            if (i12 != 4) {
                throw new o();
            }
            Integer paddingBottom = options.getPaddingBottom();
            if (paddingBottom != null) {
                num = Integer.valueOf(UiExtKt.toPx(paddingBottom.intValue()));
            }
        }
        return num != null ? num.intValue() : DEFAULT_PADDING;
    }

    @NotNull
    public final DesignTypeDTO getDesignType() {
        return this.designType;
    }

    public final FooterDTO getFooter() {
        return this.footer;
    }

    public final HeaderDTO getHeader() {
        return this.header;
    }

    public final List<ItemDTO> getItems() {
        return this.items;
    }

    public final ObjectGrid3NewDTO getObjectGrid3New() {
        return this.objectGrid3New;
    }

    @NotNull
    public final h getViewType() {
        return this.viewType;
    }

    public int hashCode() {
        int hashCode = this.designType.hashCode() * 31;
        FooterDTO footerDTO = this.footer;
        int hashCode2 = (hashCode + (footerDTO == null ? 0 : footerDTO.hashCode())) * 31;
        HeaderDTO headerDTO = this.header;
        int hashCode3 = (hashCode2 + (headerDTO == null ? 0 : headerDTO.hashCode())) * 31;
        List<ItemDTO> list = this.items;
        int hashCode4 = (hashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        ObjectGrid3NewDTO objectGrid3NewDTO = this.objectGrid3New;
        return hashCode4 + (objectGrid3NewDTO != null ? objectGrid3NewDTO.hashCode() : 0);
    }

    /* renamed from: isStubFooter, reason: from getter */
    public final boolean getIsStubFooter() {
        return this.isStubFooter;
    }

    /* renamed from: isStubHeader, reason: from getter */
    public final boolean getIsStubHeader() {
        return this.isStubHeader;
    }

    @NotNull
    public String toString() {
        return "UniversalWidgetDTO(designType=" + this.designType + ", footer=" + this.footer + ", header=" + this.header + ", items=" + this.items + ", objectGrid3New=" + this.objectGrid3New + ")";
    }

    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0001*B]\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0005\u0012\u0014\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u001d\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0014J\u0010\u0010\u001e\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0014J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u000b0\nHÆ\u0003J\u0010\u0010!\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0014J\u0017\u0010\"\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000eHÆ\u0003Jr\u0010#\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00052\u0016\b\u0002\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000eHÆ\u0001¢\u0006\u0002\u0010$J\u0013\u0010%\u001a\u00020\u00052\b\u0010&\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010'\u001a\u00020(HÖ\u0001J\t\u0010)\u001a\u00020\bHÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0015\u001a\u0004\b\u0004\u0010\u0014R\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0015\u001a\u0004\b\u0006\u0010\u0014R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0015\u0010\f\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0015\u001a\u0004\b\f\u0010\u0014R\u001f\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001b¨\u0006+"}, d2 = {"Lru/ozon/app/android/universalwidgets/widgets/uw/old/uobject/data/UniversalWidgetDTO$ObjectGrid3NewDTO;", "", "uwHeader", "Lru/ozon/android/composerCommonViewKit/header/data/HeaderDTO;", "isTopRounded", "", "isBottomRounded", "backgroundColor", "", "items", "", "Lru/ozon/app/android/universalwidgets/widgets/uw/old/uobject/data/UniversalWidgetDTO$ObjectGrid3NewDTO$ObjectGrid3NewItemDTO;", "isTextInsideCard", "trackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Lru/ozon/android/composerCommonViewKit/header/data/HeaderDTO;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/util/List;Ljava/lang/Boolean;Ljava/util/Map;)V", "getUwHeader", "()Lru/ozon/android/composerCommonViewKit/header/data/HeaderDTO;", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getBackgroundColor", "()Ljava/lang/String;", "getItems", "()Ljava/util/List;", "getTrackingInfo", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "(Lru/ozon/android/composerCommonViewKit/header/data/HeaderDTO;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/util/List;Ljava/lang/Boolean;Ljava/util/Map;)Lru/ozon/app/android/universalwidgets/widgets/uw/old/uobject/data/UniversalWidgetDTO$ObjectGrid3NewDTO;", "equals", "other", "hashCode", "", "toString", "ObjectGrid3NewItemDTO", "universalwidgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @j(generateAdapter = true)
    public static final /* data */ class ObjectGrid3NewDTO {
        private final String backgroundColor;
        private final Boolean isBottomRounded;
        private final Boolean isTextInsideCard;
        private final Boolean isTopRounded;

        @NotNull
        private final List<ObjectGrid3NewItemDTO> items;
        private final Map<String, TokenizedTrackingInfo> trackingInfo;
        private final ru.ozon.android.composerCommonViewKit.header.data.HeaderDTO uwHeader;

        public ObjectGrid3NewDTO(ru.ozon.android.composerCommonViewKit.header.data.HeaderDTO headerDTO, Boolean bool, Boolean bool2, String str, @NotNull List<ObjectGrid3NewItemDTO> items, Boolean bool3, Map<String, TokenizedTrackingInfo> map) {
            Intrinsics.checkNotNullParameter(items, "items");
            this.uwHeader = headerDTO;
            this.isTopRounded = bool;
            this.isBottomRounded = bool2;
            this.backgroundColor = str;
            this.items = items;
            this.isTextInsideCard = bool3;
            this.trackingInfo = map;
        }

        public static /* synthetic */ ObjectGrid3NewDTO copy$default(ObjectGrid3NewDTO objectGrid3NewDTO, ru.ozon.android.composerCommonViewKit.header.data.HeaderDTO headerDTO, Boolean bool, Boolean bool2, String str, List list, Boolean bool3, Map map, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                headerDTO = objectGrid3NewDTO.uwHeader;
            }
            if ((i11 & 2) != 0) {
                bool = objectGrid3NewDTO.isTopRounded;
            }
            if ((i11 & 4) != 0) {
                bool2 = objectGrid3NewDTO.isBottomRounded;
            }
            if ((i11 & 8) != 0) {
                str = objectGrid3NewDTO.backgroundColor;
            }
            if ((i11 & 16) != 0) {
                list = objectGrid3NewDTO.items;
            }
            if ((i11 & 32) != 0) {
                bool3 = objectGrid3NewDTO.isTextInsideCard;
            }
            if ((i11 & 64) != 0) {
                map = objectGrid3NewDTO.trackingInfo;
            }
            Boolean bool4 = bool3;
            Map map2 = map;
            List list2 = list;
            Boolean bool5 = bool2;
            return objectGrid3NewDTO.copy(headerDTO, bool, bool5, str, list2, bool4, map2);
        }

        /* renamed from: component1, reason: from getter */
        public final ru.ozon.android.composerCommonViewKit.header.data.HeaderDTO getUwHeader() {
            return this.uwHeader;
        }

        /* renamed from: component2, reason: from getter */
        public final Boolean getIsTopRounded() {
            return this.isTopRounded;
        }

        /* renamed from: component3, reason: from getter */
        public final Boolean getIsBottomRounded() {
            return this.isBottomRounded;
        }

        /* renamed from: component4, reason: from getter */
        public final String getBackgroundColor() {
            return this.backgroundColor;
        }

        @NotNull
        public final List<ObjectGrid3NewItemDTO> component5() {
            return this.items;
        }

        /* renamed from: component6, reason: from getter */
        public final Boolean getIsTextInsideCard() {
            return this.isTextInsideCard;
        }

        public final Map<String, TokenizedTrackingInfo> component7() {
            return this.trackingInfo;
        }

        @NotNull
        public final ObjectGrid3NewDTO copy(ru.ozon.android.composerCommonViewKit.header.data.HeaderDTO uwHeader, Boolean isTopRounded, Boolean isBottomRounded, String backgroundColor, @NotNull List<ObjectGrid3NewItemDTO> items, Boolean isTextInsideCard, Map<String, TokenizedTrackingInfo> trackingInfo) {
            Intrinsics.checkNotNullParameter(items, "items");
            return new ObjectGrid3NewDTO(uwHeader, isTopRounded, isBottomRounded, backgroundColor, items, isTextInsideCard, trackingInfo);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ObjectGrid3NewDTO)) {
                return false;
            }
            ObjectGrid3NewDTO objectGrid3NewDTO = (ObjectGrid3NewDTO) other;
            return Intrinsics.d(this.uwHeader, objectGrid3NewDTO.uwHeader) && Intrinsics.d(this.isTopRounded, objectGrid3NewDTO.isTopRounded) && Intrinsics.d(this.isBottomRounded, objectGrid3NewDTO.isBottomRounded) && Intrinsics.d(this.backgroundColor, objectGrid3NewDTO.backgroundColor) && Intrinsics.d(this.items, objectGrid3NewDTO.items) && Intrinsics.d(this.isTextInsideCard, objectGrid3NewDTO.isTextInsideCard) && Intrinsics.d(this.trackingInfo, objectGrid3NewDTO.trackingInfo);
        }

        public final String getBackgroundColor() {
            return this.backgroundColor;
        }

        @NotNull
        public final List<ObjectGrid3NewItemDTO> getItems() {
            return this.items;
        }

        public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
            return this.trackingInfo;
        }

        public final ru.ozon.android.composerCommonViewKit.header.data.HeaderDTO getUwHeader() {
            return this.uwHeader;
        }

        public int hashCode() {
            ru.ozon.android.composerCommonViewKit.header.data.HeaderDTO headerDTO = this.uwHeader;
            int hashCode = (headerDTO == null ? 0 : headerDTO.hashCode()) * 31;
            Boolean bool = this.isTopRounded;
            int hashCode2 = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
            Boolean bool2 = this.isBottomRounded;
            int hashCode3 = (hashCode2 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
            String str = this.backgroundColor;
            int b11 = g.b((hashCode3 + (str == null ? 0 : str.hashCode())) * 31, 31, this.items);
            Boolean bool3 = this.isTextInsideCard;
            int hashCode4 = (b11 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
            Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
            return hashCode4 + (map != null ? map.hashCode() : 0);
        }

        public final Boolean isBottomRounded() {
            return this.isBottomRounded;
        }

        public final Boolean isTextInsideCard() {
            return this.isTextInsideCard;
        }

        public final Boolean isTopRounded() {
            return this.isTopRounded;
        }

        @NotNull
        public String toString() {
            ru.ozon.android.composerCommonViewKit.header.data.HeaderDTO headerDTO = this.uwHeader;
            Boolean bool = this.isTopRounded;
            Boolean bool2 = this.isBottomRounded;
            String str = this.backgroundColor;
            List<ObjectGrid3NewItemDTO> list = this.items;
            Boolean bool3 = this.isTextInsideCard;
            Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
            StringBuilder sb2 = new StringBuilder("ObjectGrid3NewDTO(uwHeader=");
            sb2.append(headerDTO);
            sb2.append(", isTopRounded=");
            sb2.append(bool);
            sb2.append(", isBottomRounded=");
            b.c(bool2, ", backgroundColor=", str, ", items=", sb2);
            sb2.append(list);
            sb2.append(", isTextInsideCard=");
            sb2.append(bool3);
            sb2.append(", trackingInfo=");
            return P.f(sb2, map, ")");
        }

        @j(generateAdapter = true)
        @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u001e\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001Bo\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\u0016\b\u0002\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\t\u0010#\u001a\u00020\u0003HÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u0010&\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u0019J\u000b\u0010'\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u000eHÆ\u0003J\u0017\u0010*\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010HÆ\u0003Jx\u0010+\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\u0016\b\u0002\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010HÆ\u0001¢\u0006\u0002\u0010,J\u0013\u0010-\u001a\u00020\b2\b\u0010.\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010/\u001a\u000200HÖ\u0001J\t\u00101\u001a\u00020\nHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0017R\u0015\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010\u001a\u001a\u0004\b\u0007\u0010\u0019R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u001f\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"¨\u00062"}, d2 = {"Lru/ozon/app/android/universalwidgets/widgets/uw/old/uobject/data/UniversalWidgetDTO$ObjectGrid3NewDTO$ObjectGrid3NewItemDTO;", "", "image", "Lru/ozon/uni/atoms/data/image/ImageDTO;", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/text/TextDTO;", "subtitle", FavoriteProductMolecule.IS_ADULT_PARAMS_NAME, "", "blurPlaceholderImage", "", "adBadge", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "action", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "trackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Lru/ozon/uni/atoms/data/image/ImageDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Ljava/lang/Boolean;Ljava/lang/String;Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;Lru/ozon/uni/atoms/data/AtomActionDTO;Ljava/util/Map;)V", "getImage", "()Lru/ozon/uni/atoms/data/image/ImageDTO;", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getSubtitle", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getBlurPlaceholderImage", "()Ljava/lang/String;", "getAdBadge", "()Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "getAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "getTrackingInfo", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "(Lru/ozon/uni/atoms/data/image/ImageDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Ljava/lang/Boolean;Ljava/lang/String;Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;Lru/ozon/uni/atoms/data/AtomActionDTO;Ljava/util/Map;)Lru/ozon/app/android/universalwidgets/widgets/uw/old/uobject/data/UniversalWidgetDTO$ObjectGrid3NewDTO$ObjectGrid3NewItemDTO;", "equals", "other", "hashCode", "", "toString", "universalwidgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class ObjectGrid3NewItemDTO {
            private final AtomActionDTO action;
            private final BadgeDTO adBadge;
            private final String blurPlaceholderImage;

            @NotNull
            private final ImageDTO image;
            private final Boolean isAdult;
            private final TextDTO subtitle;
            private final TextDTO title;
            private final Map<String, TokenizedTrackingInfo> trackingInfo;

            public ObjectGrid3NewItemDTO(@NotNull ImageDTO image, TextDTO textDTO, TextDTO textDTO2, Boolean bool, String str, BadgeDTO badgeDTO, AtomActionDTO atomActionDTO, Map<String, TokenizedTrackingInfo> map) {
                Intrinsics.checkNotNullParameter(image, "image");
                this.image = image;
                this.title = textDTO;
                this.subtitle = textDTO2;
                this.isAdult = bool;
                this.blurPlaceholderImage = str;
                this.adBadge = badgeDTO;
                this.action = atomActionDTO;
                this.trackingInfo = map;
            }

            public static /* synthetic */ ObjectGrid3NewItemDTO copy$default(ObjectGrid3NewItemDTO objectGrid3NewItemDTO, ImageDTO imageDTO, TextDTO textDTO, TextDTO textDTO2, Boolean bool, String str, BadgeDTO badgeDTO, AtomActionDTO atomActionDTO, Map map, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    imageDTO = objectGrid3NewItemDTO.image;
                }
                if ((i11 & 2) != 0) {
                    textDTO = objectGrid3NewItemDTO.title;
                }
                if ((i11 & 4) != 0) {
                    textDTO2 = objectGrid3NewItemDTO.subtitle;
                }
                if ((i11 & 8) != 0) {
                    bool = objectGrid3NewItemDTO.isAdult;
                }
                if ((i11 & 16) != 0) {
                    str = objectGrid3NewItemDTO.blurPlaceholderImage;
                }
                if ((i11 & 32) != 0) {
                    badgeDTO = objectGrid3NewItemDTO.adBadge;
                }
                if ((i11 & 64) != 0) {
                    atomActionDTO = objectGrid3NewItemDTO.action;
                }
                if ((i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
                    map = objectGrid3NewItemDTO.trackingInfo;
                }
                AtomActionDTO atomActionDTO2 = atomActionDTO;
                Map map2 = map;
                String str2 = str;
                BadgeDTO badgeDTO2 = badgeDTO;
                return objectGrid3NewItemDTO.copy(imageDTO, textDTO, textDTO2, bool, str2, badgeDTO2, atomActionDTO2, map2);
            }

            @NotNull
            /* renamed from: component1, reason: from getter */
            public final ImageDTO getImage() {
                return this.image;
            }

            /* renamed from: component2, reason: from getter */
            public final TextDTO getTitle() {
                return this.title;
            }

            /* renamed from: component3, reason: from getter */
            public final TextDTO getSubtitle() {
                return this.subtitle;
            }

            /* renamed from: component4, reason: from getter */
            public final Boolean getIsAdult() {
                return this.isAdult;
            }

            /* renamed from: component5, reason: from getter */
            public final String getBlurPlaceholderImage() {
                return this.blurPlaceholderImage;
            }

            /* renamed from: component6, reason: from getter */
            public final BadgeDTO getAdBadge() {
                return this.adBadge;
            }

            /* renamed from: component7, reason: from getter */
            public final AtomActionDTO getAction() {
                return this.action;
            }

            public final Map<String, TokenizedTrackingInfo> component8() {
                return this.trackingInfo;
            }

            @NotNull
            public final ObjectGrid3NewItemDTO copy(@NotNull ImageDTO image, TextDTO title, TextDTO subtitle, Boolean isAdult, String blurPlaceholderImage, BadgeDTO adBadge, AtomActionDTO action, Map<String, TokenizedTrackingInfo> trackingInfo) {
                Intrinsics.checkNotNullParameter(image, "image");
                return new ObjectGrid3NewItemDTO(image, title, subtitle, isAdult, blurPlaceholderImage, adBadge, action, trackingInfo);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof ObjectGrid3NewItemDTO)) {
                    return false;
                }
                ObjectGrid3NewItemDTO objectGrid3NewItemDTO = (ObjectGrid3NewItemDTO) other;
                return Intrinsics.d(this.image, objectGrid3NewItemDTO.image) && Intrinsics.d(this.title, objectGrid3NewItemDTO.title) && Intrinsics.d(this.subtitle, objectGrid3NewItemDTO.subtitle) && Intrinsics.d(this.isAdult, objectGrid3NewItemDTO.isAdult) && Intrinsics.d(this.blurPlaceholderImage, objectGrid3NewItemDTO.blurPlaceholderImage) && Intrinsics.d(this.adBadge, objectGrid3NewItemDTO.adBadge) && Intrinsics.d(this.action, objectGrid3NewItemDTO.action) && Intrinsics.d(this.trackingInfo, objectGrid3NewItemDTO.trackingInfo);
            }

            public final AtomActionDTO getAction() {
                return this.action;
            }

            public final BadgeDTO getAdBadge() {
                return this.adBadge;
            }

            public final String getBlurPlaceholderImage() {
                return this.blurPlaceholderImage;
            }

            @NotNull
            public final ImageDTO getImage() {
                return this.image;
            }

            public final TextDTO getSubtitle() {
                return this.subtitle;
            }

            public final TextDTO getTitle() {
                return this.title;
            }

            public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
                return this.trackingInfo;
            }

            public int hashCode() {
                int hashCode = this.image.hashCode() * 31;
                TextDTO textDTO = this.title;
                int hashCode2 = (hashCode + (textDTO == null ? 0 : textDTO.hashCode())) * 31;
                TextDTO textDTO2 = this.subtitle;
                int hashCode3 = (hashCode2 + (textDTO2 == null ? 0 : textDTO2.hashCode())) * 31;
                Boolean bool = this.isAdult;
                int hashCode4 = (hashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
                String str = this.blurPlaceholderImage;
                int hashCode5 = (hashCode4 + (str == null ? 0 : str.hashCode())) * 31;
                BadgeDTO badgeDTO = this.adBadge;
                int hashCode6 = (hashCode5 + (badgeDTO == null ? 0 : badgeDTO.hashCode())) * 31;
                AtomActionDTO atomActionDTO = this.action;
                int hashCode7 = (hashCode6 + (atomActionDTO == null ? 0 : atomActionDTO.hashCode())) * 31;
                Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
                return hashCode7 + (map != null ? map.hashCode() : 0);
            }

            public final Boolean isAdult() {
                return this.isAdult;
            }

            @NotNull
            public String toString() {
                ImageDTO imageDTO = this.image;
                TextDTO textDTO = this.title;
                TextDTO textDTO2 = this.subtitle;
                Boolean bool = this.isAdult;
                String str = this.blurPlaceholderImage;
                BadgeDTO badgeDTO = this.adBadge;
                AtomActionDTO atomActionDTO = this.action;
                Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
                StringBuilder d11 = C2616s.d("ObjectGrid3NewItemDTO(image=", imageDTO, ", title=", textDTO, ", subtitle=");
                d11.append(textDTO2);
                d11.append(", isAdult=");
                d11.append(bool);
                d11.append(", blurPlaceholderImage=");
                d11.append(str);
                d11.append(", adBadge=");
                d11.append(badgeDTO);
                d11.append(", action=");
                return D40.a.d(d11, atomActionDTO, ", trackingInfo=", map, ")");
            }

            public /* synthetic */ ObjectGrid3NewItemDTO(ImageDTO imageDTO, TextDTO textDTO, TextDTO textDTO2, Boolean bool, String str, BadgeDTO badgeDTO, AtomActionDTO atomActionDTO, Map map, int i11, DefaultConstructorMarker defaultConstructorMarker) {
                this(imageDTO, (i11 & 2) != 0 ? null : textDTO, (i11 & 4) != 0 ? null : textDTO2, (i11 & 8) != 0 ? null : bool, (i11 & 16) != 0 ? null : str, (i11 & 32) != 0 ? null : badgeDTO, (i11 & 64) != 0 ? null : atomActionDTO, (i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? null : map);
            }
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0015B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/universalwidgets/widgets/uw/old/uobject/data/UniversalWidgetDTO$DesignTypeDTO;", "", "type", "", "options", "Lru/ozon/app/android/universalwidgets/widgets/uw/old/uobject/data/UniversalWidgetDTO$DesignTypeDTO$OptionsDTO;", "<init>", "(Ljava/lang/String;Lru/ozon/app/android/universalwidgets/widgets/uw/old/uobject/data/UniversalWidgetDTO$DesignTypeDTO$OptionsDTO;)V", "getType", "()Ljava/lang/String;", "getOptions", "()Lru/ozon/app/android/universalwidgets/widgets/uw/old/uobject/data/UniversalWidgetDTO$DesignTypeDTO$OptionsDTO;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "OptionsDTO", "universalwidgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @j(generateAdapter = true)
    public static final /* data */ class DesignTypeDTO {
        private final OptionsDTO options;

        @NotNull
        private final String type;

        public DesignTypeDTO(@NotNull String type, OptionsDTO optionsDTO) {
            Intrinsics.checkNotNullParameter(type, "type");
            this.type = type;
            this.options = optionsDTO;
        }

        public static /* synthetic */ DesignTypeDTO copy$default(DesignTypeDTO designTypeDTO, String str, OptionsDTO optionsDTO, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = designTypeDTO.type;
            }
            if ((i11 & 2) != 0) {
                optionsDTO = designTypeDTO.options;
            }
            return designTypeDTO.copy(str, optionsDTO);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getType() {
            return this.type;
        }

        /* renamed from: component2, reason: from getter */
        public final OptionsDTO getOptions() {
            return this.options;
        }

        @NotNull
        public final DesignTypeDTO copy(@NotNull String type, OptionsDTO options) {
            Intrinsics.checkNotNullParameter(type, "type");
            return new DesignTypeDTO(type, options);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof DesignTypeDTO)) {
                return false;
            }
            DesignTypeDTO designTypeDTO = (DesignTypeDTO) other;
            return Intrinsics.d(this.type, designTypeDTO.type) && Intrinsics.d(this.options, designTypeDTO.options);
        }

        public final OptionsDTO getOptions() {
            return this.options;
        }

        @NotNull
        public final String getType() {
            return this.type;
        }

        public int hashCode() {
            int hashCode = this.type.hashCode() * 31;
            OptionsDTO optionsDTO = this.options;
            return hashCode + (optionsDTO == null ? 0 : optionsDTO.hashCode());
        }

        @NotNull
        public String toString() {
            return "DesignTypeDTO(type=" + this.type + ", options=" + this.options + ")";
        }

        @j(generateAdapter = true)
        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b.\b\u0087\b\u0018\u00002\u00020\u0001B\u009f\u0001\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\f\u001a\u0004\u0018\u00010\t\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010,\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0018J\u0010\u0010-\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0018J\u000b\u0010.\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010/\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u0010\u00100\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010\u001fJ\u0010\u00101\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010\u001fJ\u000b\u00102\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u0010\u00103\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010\u001fJ\u000b\u00104\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u0010\u00105\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010\u001fJ\u0010\u00106\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010\u001fJ\u0010\u00107\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010\u001fJ\u0010\u00108\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010\u001fJ\u000b\u00109\u001a\u0004\u0018\u00010\u0013HÆ\u0003J\u0010\u0010:\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0018JÂ\u0001\u0010;\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010<J\u0013\u0010=\u001a\u00020\u00032\b\u0010>\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010?\u001a\u00020\tHÖ\u0001J\t\u0010@\u001a\u00020\u0006HÖ\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0019\u001a\u0004\b\u0017\u0010\u0018R\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0019\u001a\u0004\b\u001a\u0010\u0018R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001cR\u0015\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\n\n\u0002\u0010 \u001a\u0004\b\u001e\u0010\u001fR\u0015\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\n\n\u0002\u0010 \u001a\u0004\b!\u0010\u001fR\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u001cR\u0015\u0010\f\u001a\u0004\u0018\u00010\t¢\u0006\n\n\u0002\u0010 \u001a\u0004\b#\u0010\u001fR\u0013\u0010\r\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u001cR\u0015\u0010\u000e\u001a\u0004\u0018\u00010\t¢\u0006\n\n\u0002\u0010 \u001a\u0004\b%\u0010\u001fR\u0015\u0010\u000f\u001a\u0004\u0018\u00010\t¢\u0006\n\n\u0002\u0010 \u001a\u0004\b&\u0010\u001fR\u0015\u0010\u0010\u001a\u0004\u0018\u00010\t¢\u0006\n\n\u0002\u0010 \u001a\u0004\b'\u0010\u001fR\u0015\u0010\u0011\u001a\u0004\u0018\u00010\t¢\u0006\n\n\u0002\u0010 \u001a\u0004\b(\u0010\u001fR\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0013¢\u0006\b\n\u0000\u001a\u0004\b)\u0010*R\u0015\u0010\u0014\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0019\u001a\u0004\b+\u0010\u0018¨\u0006A"}, d2 = {"Lru/ozon/app/android/universalwidgets/widgets/uw/old/uobject/data/UniversalWidgetDTO$DesignTypeDTO$OptionsDTO;", "", "itemsAreFaded", "", "imageGrey", "textAlign", "", "textColor", "width", "", "height", "style", "span", "backgroundColor", "paddingTop", "paddingBottom", "paddingLeft", "paddingRight", "cornerRadius", "Lru/ozon/uni/atoms/data/common/CornerRadius;", "hidePagination", "<init>", "(Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Lru/ozon/uni/atoms/data/common/CornerRadius;Ljava/lang/Boolean;)V", "getItemsAreFaded", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getImageGrey", "getTextAlign", "()Ljava/lang/String;", "getTextColor", "getWidth", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getHeight", "getStyle", "getSpan", "getBackgroundColor", "getPaddingTop", "getPaddingBottom", "getPaddingLeft", "getPaddingRight", "getCornerRadius", "()Lru/ozon/uni/atoms/data/common/CornerRadius;", "getHidePagination", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "copy", "(Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Lru/ozon/uni/atoms/data/common/CornerRadius;Ljava/lang/Boolean;)Lru/ozon/app/android/universalwidgets/widgets/uw/old/uobject/data/UniversalWidgetDTO$DesignTypeDTO$OptionsDTO;", "equals", "other", "hashCode", "toString", "universalwidgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class OptionsDTO {
            private final String backgroundColor;
            private final CornerRadius cornerRadius;
            private final Integer height;
            private final Boolean hidePagination;
            private final Boolean imageGrey;
            private final Boolean itemsAreFaded;
            private final Integer paddingBottom;
            private final Integer paddingLeft;
            private final Integer paddingRight;
            private final Integer paddingTop;
            private final Integer span;
            private final String style;
            private final String textAlign;
            private final String textColor;
            private final Integer width;

            public OptionsDTO(Boolean bool, Boolean bool2, String str, String str2, Integer num, Integer num2, String str3, Integer num3, String str4, Integer num4, Integer num5, Integer num6, Integer num7, CornerRadius cornerRadius, Boolean bool3) {
                this.itemsAreFaded = bool;
                this.imageGrey = bool2;
                this.textAlign = str;
                this.textColor = str2;
                this.width = num;
                this.height = num2;
                this.style = str3;
                this.span = num3;
                this.backgroundColor = str4;
                this.paddingTop = num4;
                this.paddingBottom = num5;
                this.paddingLeft = num6;
                this.paddingRight = num7;
                this.cornerRadius = cornerRadius;
                this.hidePagination = bool3;
            }

            /* renamed from: component1, reason: from getter */
            public final Boolean getItemsAreFaded() {
                return this.itemsAreFaded;
            }

            /* renamed from: component10, reason: from getter */
            public final Integer getPaddingTop() {
                return this.paddingTop;
            }

            /* renamed from: component11, reason: from getter */
            public final Integer getPaddingBottom() {
                return this.paddingBottom;
            }

            /* renamed from: component12, reason: from getter */
            public final Integer getPaddingLeft() {
                return this.paddingLeft;
            }

            /* renamed from: component13, reason: from getter */
            public final Integer getPaddingRight() {
                return this.paddingRight;
            }

            /* renamed from: component14, reason: from getter */
            public final CornerRadius getCornerRadius() {
                return this.cornerRadius;
            }

            /* renamed from: component15, reason: from getter */
            public final Boolean getHidePagination() {
                return this.hidePagination;
            }

            /* renamed from: component2, reason: from getter */
            public final Boolean getImageGrey() {
                return this.imageGrey;
            }

            /* renamed from: component3, reason: from getter */
            public final String getTextAlign() {
                return this.textAlign;
            }

            /* renamed from: component4, reason: from getter */
            public final String getTextColor() {
                return this.textColor;
            }

            /* renamed from: component5, reason: from getter */
            public final Integer getWidth() {
                return this.width;
            }

            /* renamed from: component6, reason: from getter */
            public final Integer getHeight() {
                return this.height;
            }

            /* renamed from: component7, reason: from getter */
            public final String getStyle() {
                return this.style;
            }

            /* renamed from: component8, reason: from getter */
            public final Integer getSpan() {
                return this.span;
            }

            /* renamed from: component9, reason: from getter */
            public final String getBackgroundColor() {
                return this.backgroundColor;
            }

            @NotNull
            public final OptionsDTO copy(Boolean itemsAreFaded, Boolean imageGrey, String textAlign, String textColor, Integer width, Integer height, String style, Integer span, String backgroundColor, Integer paddingTop, Integer paddingBottom, Integer paddingLeft, Integer paddingRight, CornerRadius cornerRadius, Boolean hidePagination) {
                return new OptionsDTO(itemsAreFaded, imageGrey, textAlign, textColor, width, height, style, span, backgroundColor, paddingTop, paddingBottom, paddingLeft, paddingRight, cornerRadius, hidePagination);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof OptionsDTO)) {
                    return false;
                }
                OptionsDTO optionsDTO = (OptionsDTO) other;
                return Intrinsics.d(this.itemsAreFaded, optionsDTO.itemsAreFaded) && Intrinsics.d(this.imageGrey, optionsDTO.imageGrey) && Intrinsics.d(this.textAlign, optionsDTO.textAlign) && Intrinsics.d(this.textColor, optionsDTO.textColor) && Intrinsics.d(this.width, optionsDTO.width) && Intrinsics.d(this.height, optionsDTO.height) && Intrinsics.d(this.style, optionsDTO.style) && Intrinsics.d(this.span, optionsDTO.span) && Intrinsics.d(this.backgroundColor, optionsDTO.backgroundColor) && Intrinsics.d(this.paddingTop, optionsDTO.paddingTop) && Intrinsics.d(this.paddingBottom, optionsDTO.paddingBottom) && Intrinsics.d(this.paddingLeft, optionsDTO.paddingLeft) && Intrinsics.d(this.paddingRight, optionsDTO.paddingRight) && this.cornerRadius == optionsDTO.cornerRadius && Intrinsics.d(this.hidePagination, optionsDTO.hidePagination);
            }

            public final String getBackgroundColor() {
                return this.backgroundColor;
            }

            public final CornerRadius getCornerRadius() {
                return this.cornerRadius;
            }

            public final Integer getHeight() {
                return this.height;
            }

            public final Boolean getHidePagination() {
                return this.hidePagination;
            }

            public final Boolean getImageGrey() {
                return this.imageGrey;
            }

            public final Boolean getItemsAreFaded() {
                return this.itemsAreFaded;
            }

            public final Integer getPaddingBottom() {
                return this.paddingBottom;
            }

            public final Integer getPaddingLeft() {
                return this.paddingLeft;
            }

            public final Integer getPaddingRight() {
                return this.paddingRight;
            }

            public final Integer getPaddingTop() {
                return this.paddingTop;
            }

            public final Integer getSpan() {
                return this.span;
            }

            public final String getStyle() {
                return this.style;
            }

            public final String getTextAlign() {
                return this.textAlign;
            }

            public final String getTextColor() {
                return this.textColor;
            }

            public final Integer getWidth() {
                return this.width;
            }

            public int hashCode() {
                Boolean bool = this.itemsAreFaded;
                int hashCode = (bool == null ? 0 : bool.hashCode()) * 31;
                Boolean bool2 = this.imageGrey;
                int hashCode2 = (hashCode + (bool2 == null ? 0 : bool2.hashCode())) * 31;
                String str = this.textAlign;
                int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
                String str2 = this.textColor;
                int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
                Integer num = this.width;
                int hashCode5 = (hashCode4 + (num == null ? 0 : num.hashCode())) * 31;
                Integer num2 = this.height;
                int hashCode6 = (hashCode5 + (num2 == null ? 0 : num2.hashCode())) * 31;
                String str3 = this.style;
                int hashCode7 = (hashCode6 + (str3 == null ? 0 : str3.hashCode())) * 31;
                Integer num3 = this.span;
                int hashCode8 = (hashCode7 + (num3 == null ? 0 : num3.hashCode())) * 31;
                String str4 = this.backgroundColor;
                int hashCode9 = (hashCode8 + (str4 == null ? 0 : str4.hashCode())) * 31;
                Integer num4 = this.paddingTop;
                int hashCode10 = (hashCode9 + (num4 == null ? 0 : num4.hashCode())) * 31;
                Integer num5 = this.paddingBottom;
                int hashCode11 = (hashCode10 + (num5 == null ? 0 : num5.hashCode())) * 31;
                Integer num6 = this.paddingLeft;
                int hashCode12 = (hashCode11 + (num6 == null ? 0 : num6.hashCode())) * 31;
                Integer num7 = this.paddingRight;
                int hashCode13 = (hashCode12 + (num7 == null ? 0 : num7.hashCode())) * 31;
                CornerRadius cornerRadius = this.cornerRadius;
                int hashCode14 = (hashCode13 + (cornerRadius == null ? 0 : cornerRadius.hashCode())) * 31;
                Boolean bool3 = this.hidePagination;
                return hashCode14 + (bool3 != null ? bool3.hashCode() : 0);
            }

            @NotNull
            public String toString() {
                Boolean bool = this.itemsAreFaded;
                Boolean bool2 = this.imageGrey;
                String str = this.textAlign;
                String str2 = this.textColor;
                Integer num = this.width;
                Integer num2 = this.height;
                String str3 = this.style;
                Integer num3 = this.span;
                String str4 = this.backgroundColor;
                Integer num4 = this.paddingTop;
                Integer num5 = this.paddingBottom;
                Integer num6 = this.paddingLeft;
                Integer num7 = this.paddingRight;
                CornerRadius cornerRadius = this.cornerRadius;
                Boolean bool3 = this.hidePagination;
                StringBuilder sb2 = new StringBuilder("OptionsDTO(itemsAreFaded=");
                sb2.append(bool);
                sb2.append(", imageGrey=");
                sb2.append(bool2);
                sb2.append(", textAlign=");
                a.h(sb2, str, ", textColor=", str2, ", width=");
                c.e(sb2, num, ", height=", num2, ", style=");
                C2454a.f(num3, str3, ", span=", ", backgroundColor=", sb2);
                C2454a.f(num4, str4, ", paddingTop=", ", paddingBottom=", sb2);
                c.e(sb2, num5, ", paddingLeft=", num6, ", paddingRight=");
                sb2.append(num7);
                sb2.append(", cornerRadius=");
                sb2.append(cornerRadius);
                sb2.append(", hidePagination=");
                return D3.g.d(sb2, bool3, ")");
            }

            public /* synthetic */ OptionsDTO(Boolean bool, Boolean bool2, String str, String str2, Integer num, Integer num2, String str3, Integer num3, String str4, Integer num4, Integer num5, Integer num6, Integer num7, CornerRadius cornerRadius, Boolean bool3, int i11, DefaultConstructorMarker defaultConstructorMarker) {
                this((i11 & 1) != 0 ? Boolean.FALSE : bool, bool2, str, str2, num, num2, str3, num3, str4, num4, num5, num6, num7, cornerRadius, bool3);
            }
        }
    }
}
