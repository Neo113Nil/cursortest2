package ru.ozon.app.android.pdp.widgets.othersellers.data;

import Ak.C2436a;
import B90.C2619v;
import D40.a;
import Fm.C3051a;
import G.g;
import N3.C3660k;
import T7.P;
import Tl.b;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.squareup.moshi.j;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.atoms.data.cells.CellAtom;
import ru.ozon.app.android.ugc.core.widgets.reviewGalleryV2.data.ReviewGalleryV2DTO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.badge.Badge;
import ru.ozon.uni.atoms.data.price.Price;
import ru.ozon.uni.atoms.data.texts.TextAtom;
import ru.ozon.uni.atoms.utils.OzonSpannableString;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0002!\"B?\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rJ\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\bHÆ\u0003J\u0017\u0010\u0019\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nHÆ\u0003JI\u0010\u001a\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nHÆ\u0001J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001J\t\u0010 \u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u001f\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006#"}, d2 = {"Lru/ozon/app/android/pdp/widgets/othersellers/data/OtherSellersDTO;", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "", "sellers", "", "Lru/ozon/app/android/pdp/widgets/othersellers/data/OtherSellersDTO$Seller;", "otherSellers", "Lru/ozon/app/android/pdp/widgets/othersellers/data/OtherSellersDTO$OtherSellers;", "trackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Ljava/lang/String;Ljava/util/List;Lru/ozon/app/android/pdp/widgets/othersellers/data/OtherSellersDTO$OtherSellers;Ljava/util/Map;)V", "getTitle", "()Ljava/lang/String;", "getSellers", "()Ljava/util/List;", "getOtherSellers", "()Lru/ozon/app/android/pdp/widgets/othersellers/data/OtherSellersDTO$OtherSellers;", "getTrackingInfo", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "Seller", "OtherSellers", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class OtherSellersDTO {
    public static final int $stable = 8;
    private final OtherSellers otherSellers;

    @NotNull
    private final List<Seller> sellers;
    private final String title;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\t\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u0017\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\t\u0018\u00010\bHÆ\u0003JC\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\t\u0018\u00010\bHÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u001f\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\t\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001e"}, d2 = {"Lru/ozon/app/android/pdp/widgets/othersellers/data/OtherSellersDTO$OtherSellers;", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "", "subtitle", "action", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "trackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lru/ozon/uni/atoms/data/AtomActionDTO;Ljava/util/Map;)V", "getTitle", "()Ljava/lang/String;", "getSubtitle", "getAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "getTrackingInfo", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class OtherSellers {
        public static final int $stable = 8;
        private final AtomActionDTO action;
        private final String subtitle;

        @NotNull
        private final String title;
        private final Map<String, TokenizedTrackingInfo> trackingInfo;

        public OtherSellers(@NotNull String title, String str, AtomActionDTO atomActionDTO, Map<String, TokenizedTrackingInfo> map) {
            Intrinsics.checkNotNullParameter(title, "title");
            this.title = title;
            this.subtitle = str;
            this.action = atomActionDTO;
            this.trackingInfo = map;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ OtherSellers copy$default(OtherSellers otherSellers, String str, String str2, AtomActionDTO atomActionDTO, Map map, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = otherSellers.title;
            }
            if ((i11 & 2) != 0) {
                str2 = otherSellers.subtitle;
            }
            if ((i11 & 4) != 0) {
                atomActionDTO = otherSellers.action;
            }
            if ((i11 & 8) != 0) {
                map = otherSellers.trackingInfo;
            }
            return otherSellers.copy(str, str2, atomActionDTO, map);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        /* renamed from: component2, reason: from getter */
        public final String getSubtitle() {
            return this.subtitle;
        }

        /* renamed from: component3, reason: from getter */
        public final AtomActionDTO getAction() {
            return this.action;
        }

        public final Map<String, TokenizedTrackingInfo> component4() {
            return this.trackingInfo;
        }

        @NotNull
        public final OtherSellers copy(@NotNull String title, String subtitle, AtomActionDTO action, Map<String, TokenizedTrackingInfo> trackingInfo) {
            Intrinsics.checkNotNullParameter(title, "title");
            return new OtherSellers(title, subtitle, action, trackingInfo);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof OtherSellers)) {
                return false;
            }
            OtherSellers otherSellers = (OtherSellers) other;
            return Intrinsics.d(this.title, otherSellers.title) && Intrinsics.d(this.subtitle, otherSellers.subtitle) && Intrinsics.d(this.action, otherSellers.action) && Intrinsics.d(this.trackingInfo, otherSellers.trackingInfo);
        }

        public final AtomActionDTO getAction() {
            return this.action;
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

        public int hashCode() {
            int hashCode = this.title.hashCode() * 31;
            String str = this.subtitle;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            AtomActionDTO atomActionDTO = this.action;
            int hashCode3 = (hashCode2 + (atomActionDTO == null ? 0 : atomActionDTO.hashCode())) * 31;
            Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
            return hashCode3 + (map != null ? map.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            String str = this.title;
            String str2 = this.subtitle;
            return a.d(C3660k.d("OtherSellers(title=", str, ", subtitle=", str2, ", action="), this.action, ", trackingInfo=", this.trackingInfo, ")");
        }
    }

    @Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b,\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001:\u0002LMBÏ\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012\u0012\u0014\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0014\u0012\u0014\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0014\u0012\u0014\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0014\u0012\u0014\u0010\u0018\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0014\u0012\u0014\u0010\u0019\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0014\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u001b¢\u0006\u0004\b\u001c\u0010\u001dJ\t\u00107\u001a\u00020\u0003HÆ\u0003J\u000b\u00108\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u00109\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010:\u001a\u0004\u0018\u00010\tHÆ\u0003J\t\u0010;\u001a\u00020\u000bHÆ\u0003J\t\u0010<\u001a\u00020\rHÆ\u0003J\u0011\u0010=\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000fHÆ\u0003J\u000b\u0010>\u001a\u0004\u0018\u00010\u0012HÆ\u0003J\u0017\u0010?\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0014HÆ\u0003J\u0017\u0010@\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0014HÆ\u0003J\u0017\u0010A\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0014HÆ\u0003J\u0017\u0010B\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0014HÆ\u0003J\u0017\u0010C\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0014HÆ\u0003J\u0010\u0010D\u001a\u0004\u0018\u00010\u001bHÆ\u0003¢\u0006\u0002\u00105Jò\u0001\u0010E\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00122\u0016\b\u0002\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u00142\u0016\b\u0002\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u00142\u0016\b\u0002\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u00142\u0016\b\u0002\u0010\u0018\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u00142\u0016\b\u0002\u0010\u0019\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00142\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u001bHÆ\u0001¢\u0006\u0002\u0010FJ\u0013\u0010G\u001a\u00020H2\b\u0010I\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010J\u001a\u00020\u001bHÖ\u0001J\t\u0010K\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'R\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b(\u0010)R\u0019\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b*\u0010+R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0012¢\u0006\b\n\u0000\u001a\u0004\b,\u0010-R\u001f\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0014¢\u0006\b\n\u0000\u001a\u0004\b.\u0010/R\u001f\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0014¢\u0006\b\n\u0000\u001a\u0004\b0\u0010/R\u001f\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0014¢\u0006\b\n\u0000\u001a\u0004\b1\u0010/R\u001f\u0010\u0018\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0014¢\u0006\b\n\u0000\u001a\u0004\b2\u0010/R\u001f\u0010\u0019\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0014¢\u0006\b\n\u0000\u001a\u0004\b3\u0010/R\u0015\u0010\u001a\u001a\u0004\u0018\u00010\u001b¢\u0006\n\n\u0002\u00106\u001a\u0004\b4\u00105¨\u0006N"}, d2 = {"Lru/ozon/app/android/pdp/widgets/othersellers/data/OtherSellersDTO$Seller;", "", "sku", "", "deeplink", "", "label", "Lru/ozon/uni/atoms/data/badge/Badge;", ReviewGalleryV2DTO.ReviewGalleryV2Item.ItemsContainerDTO.PRODUCT_RATING_FIELD_NAME, "Lru/ozon/app/android/pdp/widgets/othersellers/data/OtherSellersDTO$Seller$Rating;", "price", "Lru/ozon/uni/atoms/data/price/Price;", AppMeasurementSdk.ConditionalUserProperty.NAME, "Lru/ozon/uni/atoms/data/texts/TextAtom;", "cells", "", "Lru/ozon/app/android/atoms/data/cells/CellAtom$CellAtomWithSubtitle$CellWithSubtitle24Icon;", "legalInfo", "Lru/ozon/app/android/pdp/widgets/othersellers/data/OtherSellersDTO$Seller$LegalInfo;", "trackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "toCartTrackingInfo", "toFavTrackingInfo", "unfavTrackingInfo", "params", "selectedDeliverySchema", "", "<init>", "(JLjava/lang/String;Lru/ozon/uni/atoms/data/badge/Badge;Lru/ozon/app/android/pdp/widgets/othersellers/data/OtherSellersDTO$Seller$Rating;Lru/ozon/uni/atoms/data/price/Price;Lru/ozon/uni/atoms/data/texts/TextAtom;Ljava/util/List;Lru/ozon/app/android/pdp/widgets/othersellers/data/OtherSellersDTO$Seller$LegalInfo;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Ljava/lang/Integer;)V", "getSku", "()J", "getDeeplink", "()Ljava/lang/String;", "getLabel", "()Lru/ozon/uni/atoms/data/badge/Badge;", "getProductRating", "()Lru/ozon/app/android/pdp/widgets/othersellers/data/OtherSellersDTO$Seller$Rating;", "getPrice", "()Lru/ozon/uni/atoms/data/price/Price;", "getName", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "getCells", "()Ljava/util/List;", "getLegalInfo", "()Lru/ozon/app/android/pdp/widgets/othersellers/data/OtherSellersDTO$Seller$LegalInfo;", "getTrackingInfo", "()Ljava/util/Map;", "getToCartTrackingInfo", "getToFavTrackingInfo", "getUnfavTrackingInfo", "getParams", "getSelectedDeliverySchema", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "copy", "(JLjava/lang/String;Lru/ozon/uni/atoms/data/badge/Badge;Lru/ozon/app/android/pdp/widgets/othersellers/data/OtherSellersDTO$Seller$Rating;Lru/ozon/uni/atoms/data/price/Price;Lru/ozon/uni/atoms/data/texts/TextAtom;Ljava/util/List;Lru/ozon/app/android/pdp/widgets/othersellers/data/OtherSellersDTO$Seller$LegalInfo;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Ljava/lang/Integer;)Lru/ozon/app/android/pdp/widgets/othersellers/data/OtherSellersDTO$Seller;", "equals", "", "other", "hashCode", "toString", "LegalInfo", "Rating", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @j(generateAdapter = true)
    public static final /* data */ class Seller {
        public static final int $stable = 8;
        private final List<CellAtom.CellAtomWithSubtitle.CellWithSubtitle24Icon> cells;
        private final String deeplink;
        private final Badge label;
        private final LegalInfo legalInfo;

        @NotNull
        private final TextAtom name;
        private final Map<String, String> params;

        @NotNull
        private final Price price;
        private final Rating productRating;
        private final Integer selectedDeliverySchema;
        private final long sku;
        private final Map<String, TokenizedTrackingInfo> toCartTrackingInfo;
        private final Map<String, TokenizedTrackingInfo> toFavTrackingInfo;
        private final Map<String, TokenizedTrackingInfo> trackingInfo;
        private final Map<String, TokenizedTrackingInfo> unfavTrackingInfo;

        @j(generateAdapter = true)
        @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J\u0017\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007HÆ\u0003J5\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u0016\b\u0002\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u001f\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001b"}, d2 = {"Lru/ozon/app/android/pdp/widgets/othersellers/data/OtherSellersDTO$Seller$LegalInfo;", "", "image", "", "text", "Lru/ozon/uni/atoms/utils/OzonSpannableString;", "trackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Ljava/lang/String;Lru/ozon/uni/atoms/utils/OzonSpannableString;Ljava/util/Map;)V", "getImage", "()Ljava/lang/String;", "getText", "()Lru/ozon/uni/atoms/utils/OzonSpannableString;", "getTrackingInfo", "()Ljava/util/Map;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class LegalInfo {
            public static final int $stable = 8;

            @NotNull
            private final String image;

            @NotNull
            private final OzonSpannableString text;
            private final Map<String, TokenizedTrackingInfo> trackingInfo;

            public LegalInfo(@NotNull String image, @NotNull OzonSpannableString text, Map<String, TokenizedTrackingInfo> map) {
                Intrinsics.checkNotNullParameter(image, "image");
                Intrinsics.checkNotNullParameter(text, "text");
                this.image = image;
                this.text = text;
                this.trackingInfo = map;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ LegalInfo copy$default(LegalInfo legalInfo, String str, OzonSpannableString ozonSpannableString, Map map, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    str = legalInfo.image;
                }
                if ((i11 & 2) != 0) {
                    ozonSpannableString = legalInfo.text;
                }
                if ((i11 & 4) != 0) {
                    map = legalInfo.trackingInfo;
                }
                return legalInfo.copy(str, ozonSpannableString, map);
            }

            @NotNull
            /* renamed from: component1, reason: from getter */
            public final String getImage() {
                return this.image;
            }

            @NotNull
            /* renamed from: component2, reason: from getter */
            public final OzonSpannableString getText() {
                return this.text;
            }

            public final Map<String, TokenizedTrackingInfo> component3() {
                return this.trackingInfo;
            }

            @NotNull
            public final LegalInfo copy(@NotNull String image, @NotNull OzonSpannableString text, Map<String, TokenizedTrackingInfo> trackingInfo) {
                Intrinsics.checkNotNullParameter(image, "image");
                Intrinsics.checkNotNullParameter(text, "text");
                return new LegalInfo(image, text, trackingInfo);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof LegalInfo)) {
                    return false;
                }
                LegalInfo legalInfo = (LegalInfo) other;
                return Intrinsics.d(this.image, legalInfo.image) && Intrinsics.d(this.text, legalInfo.text) && Intrinsics.d(this.trackingInfo, legalInfo.trackingInfo);
            }

            @NotNull
            public final String getImage() {
                return this.image;
            }

            @NotNull
            public final OzonSpannableString getText() {
                return this.text;
            }

            public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
                return this.trackingInfo;
            }

            public int hashCode() {
                int c11 = P.c(this.text, this.image.hashCode() * 31, 31);
                Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
                return c11 + (map == null ? 0 : map.hashCode());
            }

            @NotNull
            public String toString() {
                String str = this.image;
                OzonSpannableString ozonSpannableString = this.text;
                Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
                StringBuilder sb2 = new StringBuilder("LegalInfo(image=");
                sb2.append(str);
                sb2.append(", text=");
                sb2.append((Object) ozonSpannableString);
                sb2.append(", trackingInfo=");
                return P.f(sb2, map, ")");
            }
        }

        @j(generateAdapter = true)
        @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/pdp/widgets/othersellers/data/OtherSellersDTO$Seller$Rating;", "", "rating", "", "text", "", "<init>", "(FLjava/lang/String;)V", "getRating", "()F", "getText", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Rating {
            public static final int $stable = 0;
            private final float rating;

            @NotNull
            private final String text;

            public Rating(float f7, @NotNull String text) {
                Intrinsics.checkNotNullParameter(text, "text");
                this.rating = f7;
                this.text = text;
            }

            public static /* synthetic */ Rating copy$default(Rating rating, float f7, String str, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    f7 = rating.rating;
                }
                if ((i11 & 2) != 0) {
                    str = rating.text;
                }
                return rating.copy(f7, str);
            }

            /* renamed from: component1, reason: from getter */
            public final float getRating() {
                return this.rating;
            }

            @NotNull
            /* renamed from: component2, reason: from getter */
            public final String getText() {
                return this.text;
            }

            @NotNull
            public final Rating copy(float rating, @NotNull String text) {
                Intrinsics.checkNotNullParameter(text, "text");
                return new Rating(rating, text);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Rating)) {
                    return false;
                }
                Rating rating = (Rating) other;
                return Float.compare(this.rating, rating.rating) == 0 && Intrinsics.d(this.text, rating.text);
            }

            public final float getRating() {
                return this.rating;
            }

            @NotNull
            public final String getText() {
                return this.text;
            }

            public int hashCode() {
                return this.text.hashCode() + (Float.hashCode(this.rating) * 31);
            }

            @NotNull
            public String toString() {
                return "Rating(rating=" + this.rating + ", text=" + this.text + ")";
            }
        }

        public Seller(long j11, String str, Badge badge, Rating rating, @NotNull Price price, @NotNull TextAtom name, List<CellAtom.CellAtomWithSubtitle.CellWithSubtitle24Icon> list, LegalInfo legalInfo, Map<String, TokenizedTrackingInfo> map, Map<String, TokenizedTrackingInfo> map2, Map<String, TokenizedTrackingInfo> map3, Map<String, TokenizedTrackingInfo> map4, Map<String, String> map5, Integer num) {
            Intrinsics.checkNotNullParameter(price, "price");
            Intrinsics.checkNotNullParameter(name, "name");
            this.sku = j11;
            this.deeplink = str;
            this.label = badge;
            this.productRating = rating;
            this.price = price;
            this.name = name;
            this.cells = list;
            this.legalInfo = legalInfo;
            this.trackingInfo = map;
            this.toCartTrackingInfo = map2;
            this.toFavTrackingInfo = map3;
            this.unfavTrackingInfo = map4;
            this.params = map5;
            this.selectedDeliverySchema = num;
        }

        /* renamed from: component1, reason: from getter */
        public final long getSku() {
            return this.sku;
        }

        public final Map<String, TokenizedTrackingInfo> component10() {
            return this.toCartTrackingInfo;
        }

        public final Map<String, TokenizedTrackingInfo> component11() {
            return this.toFavTrackingInfo;
        }

        public final Map<String, TokenizedTrackingInfo> component12() {
            return this.unfavTrackingInfo;
        }

        public final Map<String, String> component13() {
            return this.params;
        }

        /* renamed from: component14, reason: from getter */
        public final Integer getSelectedDeliverySchema() {
            return this.selectedDeliverySchema;
        }

        /* renamed from: component2, reason: from getter */
        public final String getDeeplink() {
            return this.deeplink;
        }

        /* renamed from: component3, reason: from getter */
        public final Badge getLabel() {
            return this.label;
        }

        /* renamed from: component4, reason: from getter */
        public final Rating getProductRating() {
            return this.productRating;
        }

        @NotNull
        /* renamed from: component5, reason: from getter */
        public final Price getPrice() {
            return this.price;
        }

        @NotNull
        /* renamed from: component6, reason: from getter */
        public final TextAtom getName() {
            return this.name;
        }

        public final List<CellAtom.CellAtomWithSubtitle.CellWithSubtitle24Icon> component7() {
            return this.cells;
        }

        /* renamed from: component8, reason: from getter */
        public final LegalInfo getLegalInfo() {
            return this.legalInfo;
        }

        public final Map<String, TokenizedTrackingInfo> component9() {
            return this.trackingInfo;
        }

        @NotNull
        public final Seller copy(long sku, String deeplink, Badge label, Rating productRating, @NotNull Price price, @NotNull TextAtom name, List<CellAtom.CellAtomWithSubtitle.CellWithSubtitle24Icon> cells, LegalInfo legalInfo, Map<String, TokenizedTrackingInfo> trackingInfo, Map<String, TokenizedTrackingInfo> toCartTrackingInfo, Map<String, TokenizedTrackingInfo> toFavTrackingInfo, Map<String, TokenizedTrackingInfo> unfavTrackingInfo, Map<String, String> params, Integer selectedDeliverySchema) {
            Intrinsics.checkNotNullParameter(price, "price");
            Intrinsics.checkNotNullParameter(name, "name");
            return new Seller(sku, deeplink, label, productRating, price, name, cells, legalInfo, trackingInfo, toCartTrackingInfo, toFavTrackingInfo, unfavTrackingInfo, params, selectedDeliverySchema);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Seller)) {
                return false;
            }
            Seller seller = (Seller) other;
            return this.sku == seller.sku && Intrinsics.d(this.deeplink, seller.deeplink) && Intrinsics.d(this.label, seller.label) && Intrinsics.d(this.productRating, seller.productRating) && Intrinsics.d(this.price, seller.price) && Intrinsics.d(this.name, seller.name) && Intrinsics.d(this.cells, seller.cells) && Intrinsics.d(this.legalInfo, seller.legalInfo) && Intrinsics.d(this.trackingInfo, seller.trackingInfo) && Intrinsics.d(this.toCartTrackingInfo, seller.toCartTrackingInfo) && Intrinsics.d(this.toFavTrackingInfo, seller.toFavTrackingInfo) && Intrinsics.d(this.unfavTrackingInfo, seller.unfavTrackingInfo) && Intrinsics.d(this.params, seller.params) && Intrinsics.d(this.selectedDeliverySchema, seller.selectedDeliverySchema);
        }

        public final List<CellAtom.CellAtomWithSubtitle.CellWithSubtitle24Icon> getCells() {
            return this.cells;
        }

        public final String getDeeplink() {
            return this.deeplink;
        }

        public final Badge getLabel() {
            return this.label;
        }

        public final LegalInfo getLegalInfo() {
            return this.legalInfo;
        }

        @NotNull
        public final TextAtom getName() {
            return this.name;
        }

        public final Map<String, String> getParams() {
            return this.params;
        }

        @NotNull
        public final Price getPrice() {
            return this.price;
        }

        public final Rating getProductRating() {
            return this.productRating;
        }

        public final Integer getSelectedDeliverySchema() {
            return this.selectedDeliverySchema;
        }

        public final long getSku() {
            return this.sku;
        }

        public final Map<String, TokenizedTrackingInfo> getToCartTrackingInfo() {
            return this.toCartTrackingInfo;
        }

        public final Map<String, TokenizedTrackingInfo> getToFavTrackingInfo() {
            return this.toFavTrackingInfo;
        }

        public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
            return this.trackingInfo;
        }

        public final Map<String, TokenizedTrackingInfo> getUnfavTrackingInfo() {
            return this.unfavTrackingInfo;
        }

        public int hashCode() {
            int hashCode = Long.hashCode(this.sku) * 31;
            String str = this.deeplink;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            Badge badge = this.label;
            int hashCode3 = (hashCode2 + (badge == null ? 0 : badge.hashCode())) * 31;
            Rating rating = this.productRating;
            int b11 = C2619v.b(C3051a.a(this.price, (hashCode3 + (rating == null ? 0 : rating.hashCode())) * 31, 31), 31, this.name);
            List<CellAtom.CellAtomWithSubtitle.CellWithSubtitle24Icon> list = this.cells;
            int hashCode4 = (b11 + (list == null ? 0 : list.hashCode())) * 31;
            LegalInfo legalInfo = this.legalInfo;
            int hashCode5 = (hashCode4 + (legalInfo == null ? 0 : legalInfo.hashCode())) * 31;
            Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
            int hashCode6 = (hashCode5 + (map == null ? 0 : map.hashCode())) * 31;
            Map<String, TokenizedTrackingInfo> map2 = this.toCartTrackingInfo;
            int hashCode7 = (hashCode6 + (map2 == null ? 0 : map2.hashCode())) * 31;
            Map<String, TokenizedTrackingInfo> map3 = this.toFavTrackingInfo;
            int hashCode8 = (hashCode7 + (map3 == null ? 0 : map3.hashCode())) * 31;
            Map<String, TokenizedTrackingInfo> map4 = this.unfavTrackingInfo;
            int hashCode9 = (hashCode8 + (map4 == null ? 0 : map4.hashCode())) * 31;
            Map<String, String> map5 = this.params;
            int hashCode10 = (hashCode9 + (map5 == null ? 0 : map5.hashCode())) * 31;
            Integer num = this.selectedDeliverySchema;
            return hashCode10 + (num != null ? num.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            long j11 = this.sku;
            String str = this.deeplink;
            Badge badge = this.label;
            Rating rating = this.productRating;
            Price price = this.price;
            TextAtom textAtom = this.name;
            List<CellAtom.CellAtomWithSubtitle.CellWithSubtitle24Icon> list = this.cells;
            LegalInfo legalInfo = this.legalInfo;
            Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
            Map<String, TokenizedTrackingInfo> map2 = this.toCartTrackingInfo;
            Map<String, TokenizedTrackingInfo> map3 = this.toFavTrackingInfo;
            Map<String, TokenizedTrackingInfo> map4 = this.unfavTrackingInfo;
            Map<String, String> map5 = this.params;
            Integer num = this.selectedDeliverySchema;
            StringBuilder c11 = C2436a.c(j11, "Seller(sku=", ", deeplink=", str);
            c11.append(", label=");
            c11.append(badge);
            c11.append(", productRating=");
            c11.append(rating);
            c11.append(", price=");
            c11.append(price);
            c11.append(", name=");
            c11.append(textAtom);
            c11.append(", cells=");
            c11.append(list);
            c11.append(", legalInfo=");
            c11.append(legalInfo);
            c11.append(", trackingInfo=");
            c11.append(map);
            c11.append(", toCartTrackingInfo=");
            c11.append(map2);
            c11.append(", toFavTrackingInfo=");
            c11.append(map3);
            c11.append(", unfavTrackingInfo=");
            c11.append(map4);
            c11.append(", params=");
            c11.append(map5);
            c11.append(", selectedDeliverySchema=");
            c11.append(num);
            c11.append(")");
            return c11.toString();
        }
    }

    public OtherSellersDTO(String str, @NotNull List<Seller> sellers, OtherSellers otherSellers, Map<String, TokenizedTrackingInfo> map) {
        Intrinsics.checkNotNullParameter(sellers, "sellers");
        this.title = str;
        this.sellers = sellers;
        this.otherSellers = otherSellers;
        this.trackingInfo = map;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ OtherSellersDTO copy$default(OtherSellersDTO otherSellersDTO, String str, List list, OtherSellers otherSellers, Map map, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = otherSellersDTO.title;
        }
        if ((i11 & 2) != 0) {
            list = otherSellersDTO.sellers;
        }
        if ((i11 & 4) != 0) {
            otherSellers = otherSellersDTO.otherSellers;
        }
        if ((i11 & 8) != 0) {
            map = otherSellersDTO.trackingInfo;
        }
        return otherSellersDTO.copy(str, list, otherSellers, map);
    }

    /* renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @NotNull
    public final List<Seller> component2() {
        return this.sellers;
    }

    /* renamed from: component3, reason: from getter */
    public final OtherSellers getOtherSellers() {
        return this.otherSellers;
    }

    public final Map<String, TokenizedTrackingInfo> component4() {
        return this.trackingInfo;
    }

    @NotNull
    public final OtherSellersDTO copy(String title, @NotNull List<Seller> sellers, OtherSellers otherSellers, Map<String, TokenizedTrackingInfo> trackingInfo) {
        Intrinsics.checkNotNullParameter(sellers, "sellers");
        return new OtherSellersDTO(title, sellers, otherSellers, trackingInfo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OtherSellersDTO)) {
            return false;
        }
        OtherSellersDTO otherSellersDTO = (OtherSellersDTO) other;
        return Intrinsics.d(this.title, otherSellersDTO.title) && Intrinsics.d(this.sellers, otherSellersDTO.sellers) && Intrinsics.d(this.otherSellers, otherSellersDTO.otherSellers) && Intrinsics.d(this.trackingInfo, otherSellersDTO.trackingInfo);
    }

    public final OtherSellers getOtherSellers() {
        return this.otherSellers;
    }

    @NotNull
    public final List<Seller> getSellers() {
        return this.sellers;
    }

    public final String getTitle() {
        return this.title;
    }

    public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
        return this.trackingInfo;
    }

    public int hashCode() {
        String str = this.title;
        int b11 = g.b((str == null ? 0 : str.hashCode()) * 31, 31, this.sellers);
        OtherSellers otherSellers = this.otherSellers;
        int hashCode = (b11 + (otherSellers == null ? 0 : otherSellers.hashCode())) * 31;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        return hashCode + (map != null ? map.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.title;
        List<Seller> list = this.sellers;
        OtherSellers otherSellers = this.otherSellers;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        StringBuilder f7 = b.f("OtherSellersDTO(title=", str, ", sellers=", ", otherSellers=", list);
        f7.append(otherSellers);
        f7.append(", trackingInfo=");
        f7.append(map);
        f7.append(")");
        return f7.toString();
    }
}
