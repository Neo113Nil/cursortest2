package ru.ozon.app.android.fresh.main.widgets.catalogTile.data;

import B3.p;
import D40.a;
import G.g;
import Ns.b;
import T7.P;
import Ul.C4070a;
import V.e;
import com.squareup.moshi.j;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.common.Paddings;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0081\b\u0018\u00002\u00020\u0001:\u0004&'()BG\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\u0014\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fJ\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\t\u0010\u001c\u001a\u00020\bHÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\nHÆ\u0003J\u0017\u0010\u001e\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\r\u0018\u00010\fHÆ\u0003JQ\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\u0016\b\u0002\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\r\u0018\u00010\fHÆ\u0001J\u0013\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010#\u001a\u00020$HÖ\u0001J\t\u0010%\u001a\u00020\nHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u001f\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019¨\u0006*"}, d2 = {"Lru/ozon/app/android/fresh/main/widgets/catalogTile/data/CatalogTileDTO;", "", "preset", "Lru/ozon/app/android/fresh/main/widgets/catalogTile/data/TilePreset;", "tiles", "", "Lru/ozon/app/android/fresh/main/widgets/catalogTile/data/CatalogTileDTO$TileDTO;", "spacers", "Lru/ozon/app/android/fresh/main/widgets/catalogTile/data/CatalogTileDTO$PaddingsDTO;", "backgroundColor", "", "trackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Lru/ozon/app/android/fresh/main/widgets/catalogTile/data/TilePreset;Ljava/util/List;Lru/ozon/app/android/fresh/main/widgets/catalogTile/data/CatalogTileDTO$PaddingsDTO;Ljava/lang/String;Ljava/util/Map;)V", "getPreset", "()Lru/ozon/app/android/fresh/main/widgets/catalogTile/data/TilePreset;", "getTiles", "()Ljava/util/List;", "getSpacers", "()Lru/ozon/app/android/fresh/main/widgets/catalogTile/data/CatalogTileDTO$PaddingsDTO;", "getBackgroundColor", "()Ljava/lang/String;", "getTrackingInfo", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "PaddingsDTO", "TileDTO", "FavoriteBadge", "Gradient", "widgets-main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class CatalogTileDTO {
    private final String backgroundColor;

    @NotNull
    private final TilePreset preset;

    @NotNull
    private final PaddingsDTO spacers;

    @NotNull
    private final List<TileDTO> tiles;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BI\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\u0014\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0007HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u0017\u0010\"\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u000e\u0018\u00010\rHÆ\u0003JW\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0016\b\u0002\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u000e\u0018\u00010\rHÆ\u0001J\u0013\u0010$\u001a\u00020%2\b\u0010&\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010'\u001a\u00020(HÖ\u0001J\t\u0010)\u001a\u00020\tHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u001f\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001c¨\u0006*"}, d2 = {"Lru/ozon/app/android/fresh/main/widgets/catalogTile/data/CatalogTileDTO$FavoriteBadge;", "", "icon", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "text", "Lru/ozon/uni/atoms/data/text/TextDTO;", "gradient", "Lru/ozon/app/android/fresh/main/widgets/catalogTile/data/CatalogTileDTO$Gradient;", "borderColor", "", "action", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "trackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Lru/ozon/uni/atoms/data/icon/IconDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/app/android/fresh/main/widgets/catalogTile/data/CatalogTileDTO$Gradient;Ljava/lang/String;Lru/ozon/uni/atoms/data/AtomActionDTO;Ljava/util/Map;)V", "getIcon", "()Lru/ozon/uni/atoms/data/icon/IconDTO;", "getText", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getGradient", "()Lru/ozon/app/android/fresh/main/widgets/catalogTile/data/CatalogTileDTO$Gradient;", "getBorderColor", "()Ljava/lang/String;", "getAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "getTrackingInfo", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "widgets-main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class FavoriteBadge {
        private final AtomActionDTO action;
        private final String borderColor;

        @NotNull
        private final Gradient gradient;

        @NotNull
        private final IconDTO icon;

        @NotNull
        private final TextDTO text;
        private final Map<String, TokenizedTrackingInfo> trackingInfo;

        public FavoriteBadge(@NotNull IconDTO icon, @NotNull TextDTO text, @NotNull Gradient gradient, String str, AtomActionDTO atomActionDTO, Map<String, TokenizedTrackingInfo> map) {
            Intrinsics.checkNotNullParameter(icon, "icon");
            Intrinsics.checkNotNullParameter(text, "text");
            Intrinsics.checkNotNullParameter(gradient, "gradient");
            this.icon = icon;
            this.text = text;
            this.gradient = gradient;
            this.borderColor = str;
            this.action = atomActionDTO;
            this.trackingInfo = map;
        }

        public static /* synthetic */ FavoriteBadge copy$default(FavoriteBadge favoriteBadge, IconDTO iconDTO, TextDTO textDTO, Gradient gradient, String str, AtomActionDTO atomActionDTO, Map map, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                iconDTO = favoriteBadge.icon;
            }
            if ((i11 & 2) != 0) {
                textDTO = favoriteBadge.text;
            }
            if ((i11 & 4) != 0) {
                gradient = favoriteBadge.gradient;
            }
            if ((i11 & 8) != 0) {
                str = favoriteBadge.borderColor;
            }
            if ((i11 & 16) != 0) {
                atomActionDTO = favoriteBadge.action;
            }
            if ((i11 & 32) != 0) {
                map = favoriteBadge.trackingInfo;
            }
            AtomActionDTO atomActionDTO2 = atomActionDTO;
            Map map2 = map;
            return favoriteBadge.copy(iconDTO, textDTO, gradient, str, atomActionDTO2, map2);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final IconDTO getIcon() {
            return this.icon;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final TextDTO getText() {
            return this.text;
        }

        @NotNull
        /* renamed from: component3, reason: from getter */
        public final Gradient getGradient() {
            return this.gradient;
        }

        /* renamed from: component4, reason: from getter */
        public final String getBorderColor() {
            return this.borderColor;
        }

        /* renamed from: component5, reason: from getter */
        public final AtomActionDTO getAction() {
            return this.action;
        }

        public final Map<String, TokenizedTrackingInfo> component6() {
            return this.trackingInfo;
        }

        @NotNull
        public final FavoriteBadge copy(@NotNull IconDTO icon, @NotNull TextDTO text, @NotNull Gradient gradient, String borderColor, AtomActionDTO action, Map<String, TokenizedTrackingInfo> trackingInfo) {
            Intrinsics.checkNotNullParameter(icon, "icon");
            Intrinsics.checkNotNullParameter(text, "text");
            Intrinsics.checkNotNullParameter(gradient, "gradient");
            return new FavoriteBadge(icon, text, gradient, borderColor, action, trackingInfo);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof FavoriteBadge)) {
                return false;
            }
            FavoriteBadge favoriteBadge = (FavoriteBadge) other;
            return Intrinsics.d(this.icon, favoriteBadge.icon) && Intrinsics.d(this.text, favoriteBadge.text) && Intrinsics.d(this.gradient, favoriteBadge.gradient) && Intrinsics.d(this.borderColor, favoriteBadge.borderColor) && Intrinsics.d(this.action, favoriteBadge.action) && Intrinsics.d(this.trackingInfo, favoriteBadge.trackingInfo);
        }

        public final AtomActionDTO getAction() {
            return this.action;
        }

        public final String getBorderColor() {
            return this.borderColor;
        }

        @NotNull
        public final Gradient getGradient() {
            return this.gradient;
        }

        @NotNull
        public final IconDTO getIcon() {
            return this.icon;
        }

        @NotNull
        public final TextDTO getText() {
            return this.text;
        }

        public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
            return this.trackingInfo;
        }

        public int hashCode() {
            int hashCode = (this.gradient.hashCode() + b.a(this.text, this.icon.hashCode() * 31, 31)) * 31;
            String str = this.borderColor;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            AtomActionDTO atomActionDTO = this.action;
            int hashCode3 = (hashCode2 + (atomActionDTO == null ? 0 : atomActionDTO.hashCode())) * 31;
            Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
            return hashCode3 + (map != null ? map.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            IconDTO iconDTO = this.icon;
            TextDTO textDTO = this.text;
            Gradient gradient = this.gradient;
            String str = this.borderColor;
            AtomActionDTO atomActionDTO = this.action;
            Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
            StringBuilder i11 = Bi.b.i("FavoriteBadge(icon=", ", text=", ", gradient=", iconDTO, textDTO);
            i11.append(gradient);
            i11.append(", borderColor=");
            i11.append(str);
            i11.append(", action=");
            return a.d(i11, atomActionDTO, ", trackingInfo=", map, ")");
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, d2 = {"Lru/ozon/app/android/fresh/main/widgets/catalogTile/data/CatalogTileDTO$Gradient;", "", "startColor", "", "endColor", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getStartColor", "()Ljava/lang/String;", "getEndColor", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "widgets-main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Gradient {

        @NotNull
        private final String endColor;

        @NotNull
        private final String startColor;

        public Gradient(@NotNull String startColor, @NotNull String endColor) {
            Intrinsics.checkNotNullParameter(startColor, "startColor");
            Intrinsics.checkNotNullParameter(endColor, "endColor");
            this.startColor = startColor;
            this.endColor = endColor;
        }

        public static /* synthetic */ Gradient copy$default(Gradient gradient, String str, String str2, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = gradient.startColor;
            }
            if ((i11 & 2) != 0) {
                str2 = gradient.endColor;
            }
            return gradient.copy(str, str2);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getStartColor() {
            return this.startColor;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final String getEndColor() {
            return this.endColor;
        }

        @NotNull
        public final Gradient copy(@NotNull String startColor, @NotNull String endColor) {
            Intrinsics.checkNotNullParameter(startColor, "startColor");
            Intrinsics.checkNotNullParameter(endColor, "endColor");
            return new Gradient(startColor, endColor);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Gradient)) {
                return false;
            }
            Gradient gradient = (Gradient) other;
            return Intrinsics.d(this.startColor, gradient.startColor) && Intrinsics.d(this.endColor, gradient.endColor);
        }

        @NotNull
        public final String getEndColor() {
            return this.endColor;
        }

        @NotNull
        public final String getStartColor() {
            return this.startColor;
        }

        public int hashCode() {
            return this.endColor.hashCode() + (this.startColor.hashCode() * 31);
        }

        @NotNull
        public String toString() {
            return e.a("Gradient(startColor=", this.startColor, ", endColor=", this.endColor, ")");
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J;\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000b¨\u0006\u001d"}, d2 = {"Lru/ozon/app/android/fresh/main/widgets/catalogTile/data/CatalogTileDTO$PaddingsDTO;", "", "left", "Lru/ozon/uni/atoms/data/common/Paddings;", "top", "right", "bottom", "between", "<init>", "(Lru/ozon/uni/atoms/data/common/Paddings;Lru/ozon/uni/atoms/data/common/Paddings;Lru/ozon/uni/atoms/data/common/Paddings;Lru/ozon/uni/atoms/data/common/Paddings;Lru/ozon/uni/atoms/data/common/Paddings;)V", "getLeft", "()Lru/ozon/uni/atoms/data/common/Paddings;", "getTop", "getRight", "getBottom", "getBetween", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "", "widgets-main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class PaddingsDTO {

        @NotNull
        private final Paddings between;

        @NotNull
        private final Paddings bottom;

        @NotNull
        private final Paddings left;

        @NotNull
        private final Paddings right;

        @NotNull
        private final Paddings top;

        public PaddingsDTO() {
            this(null, null, null, null, null, 31, null);
        }

        public static /* synthetic */ PaddingsDTO copy$default(PaddingsDTO paddingsDTO, Paddings paddings, Paddings paddings2, Paddings paddings3, Paddings paddings4, Paddings paddings5, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                paddings = paddingsDTO.left;
            }
            if ((i11 & 2) != 0) {
                paddings2 = paddingsDTO.top;
            }
            if ((i11 & 4) != 0) {
                paddings3 = paddingsDTO.right;
            }
            if ((i11 & 8) != 0) {
                paddings4 = paddingsDTO.bottom;
            }
            if ((i11 & 16) != 0) {
                paddings5 = paddingsDTO.between;
            }
            Paddings paddings6 = paddings5;
            Paddings paddings7 = paddings3;
            return paddingsDTO.copy(paddings, paddings2, paddings7, paddings4, paddings6);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final Paddings getLeft() {
            return this.left;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final Paddings getTop() {
            return this.top;
        }

        @NotNull
        /* renamed from: component3, reason: from getter */
        public final Paddings getRight() {
            return this.right;
        }

        @NotNull
        /* renamed from: component4, reason: from getter */
        public final Paddings getBottom() {
            return this.bottom;
        }

        @NotNull
        /* renamed from: component5, reason: from getter */
        public final Paddings getBetween() {
            return this.between;
        }

        @NotNull
        public final PaddingsDTO copy(@NotNull Paddings left, @NotNull Paddings top, @NotNull Paddings right, @NotNull Paddings bottom, @NotNull Paddings between) {
            Intrinsics.checkNotNullParameter(left, "left");
            Intrinsics.checkNotNullParameter(top, "top");
            Intrinsics.checkNotNullParameter(right, "right");
            Intrinsics.checkNotNullParameter(bottom, "bottom");
            Intrinsics.checkNotNullParameter(between, "between");
            return new PaddingsDTO(left, top, right, bottom, between);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PaddingsDTO)) {
                return false;
            }
            PaddingsDTO paddingsDTO = (PaddingsDTO) other;
            return this.left == paddingsDTO.left && this.top == paddingsDTO.top && this.right == paddingsDTO.right && this.bottom == paddingsDTO.bottom && this.between == paddingsDTO.between;
        }

        @NotNull
        public final Paddings getBetween() {
            return this.between;
        }

        @NotNull
        public final Paddings getBottom() {
            return this.bottom;
        }

        @NotNull
        public final Paddings getLeft() {
            return this.left;
        }

        @NotNull
        public final Paddings getRight() {
            return this.right;
        }

        @NotNull
        public final Paddings getTop() {
            return this.top;
        }

        public int hashCode() {
            return this.between.hashCode() + GR.b.b(this.bottom, GR.b.b(this.right, GR.b.b(this.top, this.left.hashCode() * 31, 31), 31), 31);
        }

        @NotNull
        public String toString() {
            Paddings paddings = this.left;
            Paddings paddings2 = this.top;
            Paddings paddings3 = this.right;
            Paddings paddings4 = this.bottom;
            Paddings paddings5 = this.between;
            StringBuilder b11 = p.b("PaddingsDTO(left=", paddings, ", top=", paddings2, ", right=");
            Lh.a.e(b11, paddings3, ", bottom=", paddings4, ", between=");
            return D40.b.b(b11, paddings5, ")");
        }

        public PaddingsDTO(@NotNull Paddings left, @NotNull Paddings top, @NotNull Paddings right, @NotNull Paddings bottom, @NotNull Paddings between) {
            Intrinsics.checkNotNullParameter(left, "left");
            Intrinsics.checkNotNullParameter(top, "top");
            Intrinsics.checkNotNullParameter(right, "right");
            Intrinsics.checkNotNullParameter(bottom, "bottom");
            Intrinsics.checkNotNullParameter(between, "between");
            this.left = left;
            this.top = top;
            this.right = right;
            this.bottom = bottom;
            this.between = between;
        }

        public /* synthetic */ PaddingsDTO(Paddings paddings, Paddings paddings2, Paddings paddings3, Paddings paddings4, Paddings paddings5, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? Paddings.PADDING_300 : paddings, (i11 & 2) != 0 ? Paddings.PADDING_100 : paddings2, (i11 & 4) != 0 ? Paddings.PADDING_300 : paddings3, (i11 & 8) != 0 ? Paddings.PADDING_100 : paddings4, (i11 & 16) != 0 ? Paddings.PADDING_200 : paddings5);
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BM\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\u0014\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\r\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fJ\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0017\u0010 \u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\r\u0018\u00010\fHÆ\u0003J[\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\u0016\b\u0002\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\r\u0018\u00010\fHÆ\u0001J\u0013\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010%\u001a\u00020&HÖ\u0001J\t\u0010'\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0011R\u001f\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\r\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001a¨\u0006("}, d2 = {"Lru/ozon/app/android/fresh/main/widgets/catalogTile/data/CatalogTileDTO$TileDTO;", "", "image", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/text/TextDTO;", "action", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "badge", "Lru/ozon/app/android/fresh/main/widgets/catalogTile/data/CatalogTileDTO$FavoriteBadge;", "backgroundColor", "trackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Ljava/lang/String;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/AtomActionDTO;Lru/ozon/app/android/fresh/main/widgets/catalogTile/data/CatalogTileDTO$FavoriteBadge;Ljava/lang/String;Ljava/util/Map;)V", "getImage", "()Ljava/lang/String;", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "getBadge", "()Lru/ozon/app/android/fresh/main/widgets/catalogTile/data/CatalogTileDTO$FavoriteBadge;", "getBackgroundColor", "getTrackingInfo", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "widgets-main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class TileDTO {
        private final AtomActionDTO action;
        private final String backgroundColor;
        private final FavoriteBadge badge;

        @NotNull
        private final String image;
        private final TextDTO title;
        private final Map<String, TokenizedTrackingInfo> trackingInfo;

        public TileDTO(@NotNull String image, TextDTO textDTO, AtomActionDTO atomActionDTO, FavoriteBadge favoriteBadge, String str, Map<String, TokenizedTrackingInfo> map) {
            Intrinsics.checkNotNullParameter(image, "image");
            this.image = image;
            this.title = textDTO;
            this.action = atomActionDTO;
            this.badge = favoriteBadge;
            this.backgroundColor = str;
            this.trackingInfo = map;
        }

        public static /* synthetic */ TileDTO copy$default(TileDTO tileDTO, String str, TextDTO textDTO, AtomActionDTO atomActionDTO, FavoriteBadge favoriteBadge, String str2, Map map, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = tileDTO.image;
            }
            if ((i11 & 2) != 0) {
                textDTO = tileDTO.title;
            }
            if ((i11 & 4) != 0) {
                atomActionDTO = tileDTO.action;
            }
            if ((i11 & 8) != 0) {
                favoriteBadge = tileDTO.badge;
            }
            if ((i11 & 16) != 0) {
                str2 = tileDTO.backgroundColor;
            }
            if ((i11 & 32) != 0) {
                map = tileDTO.trackingInfo;
            }
            String str3 = str2;
            Map map2 = map;
            return tileDTO.copy(str, textDTO, atomActionDTO, favoriteBadge, str3, map2);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getImage() {
            return this.image;
        }

        /* renamed from: component2, reason: from getter */
        public final TextDTO getTitle() {
            return this.title;
        }

        /* renamed from: component3, reason: from getter */
        public final AtomActionDTO getAction() {
            return this.action;
        }

        /* renamed from: component4, reason: from getter */
        public final FavoriteBadge getBadge() {
            return this.badge;
        }

        /* renamed from: component5, reason: from getter */
        public final String getBackgroundColor() {
            return this.backgroundColor;
        }

        public final Map<String, TokenizedTrackingInfo> component6() {
            return this.trackingInfo;
        }

        @NotNull
        public final TileDTO copy(@NotNull String image, TextDTO title, AtomActionDTO action, FavoriteBadge badge, String backgroundColor, Map<String, TokenizedTrackingInfo> trackingInfo) {
            Intrinsics.checkNotNullParameter(image, "image");
            return new TileDTO(image, title, action, badge, backgroundColor, trackingInfo);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof TileDTO)) {
                return false;
            }
            TileDTO tileDTO = (TileDTO) other;
            return Intrinsics.d(this.image, tileDTO.image) && Intrinsics.d(this.title, tileDTO.title) && Intrinsics.d(this.action, tileDTO.action) && Intrinsics.d(this.badge, tileDTO.badge) && Intrinsics.d(this.backgroundColor, tileDTO.backgroundColor) && Intrinsics.d(this.trackingInfo, tileDTO.trackingInfo);
        }

        public final AtomActionDTO getAction() {
            return this.action;
        }

        public final String getBackgroundColor() {
            return this.backgroundColor;
        }

        public final FavoriteBadge getBadge() {
            return this.badge;
        }

        @NotNull
        public final String getImage() {
            return this.image;
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
            AtomActionDTO atomActionDTO = this.action;
            int hashCode3 = (hashCode2 + (atomActionDTO == null ? 0 : atomActionDTO.hashCode())) * 31;
            FavoriteBadge favoriteBadge = this.badge;
            int hashCode4 = (hashCode3 + (favoriteBadge == null ? 0 : favoriteBadge.hashCode())) * 31;
            String str = this.backgroundColor;
            int hashCode5 = (hashCode4 + (str == null ? 0 : str.hashCode())) * 31;
            Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
            return hashCode5 + (map != null ? map.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            String str = this.image;
            TextDTO textDTO = this.title;
            AtomActionDTO atomActionDTO = this.action;
            FavoriteBadge favoriteBadge = this.badge;
            String str2 = this.backgroundColor;
            Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
            StringBuilder b11 = Co.a.b("TileDTO(image=", textDTO, str, ", title=", ", action=");
            b11.append(atomActionDTO);
            b11.append(", badge=");
            b11.append(favoriteBadge);
            b11.append(", backgroundColor=");
            return C4070a.a(b11, str2, ", trackingInfo=", map, ")");
        }
    }

    public CatalogTileDTO(@NotNull TilePreset preset, @NotNull List<TileDTO> tiles, @NotNull PaddingsDTO spacers, String str, Map<String, TokenizedTrackingInfo> map) {
        Intrinsics.checkNotNullParameter(preset, "preset");
        Intrinsics.checkNotNullParameter(tiles, "tiles");
        Intrinsics.checkNotNullParameter(spacers, "spacers");
        this.preset = preset;
        this.tiles = tiles;
        this.spacers = spacers;
        this.backgroundColor = str;
        this.trackingInfo = map;
    }

    public static /* synthetic */ CatalogTileDTO copy$default(CatalogTileDTO catalogTileDTO, TilePreset tilePreset, List list, PaddingsDTO paddingsDTO, String str, Map map, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            tilePreset = catalogTileDTO.preset;
        }
        if ((i11 & 2) != 0) {
            list = catalogTileDTO.tiles;
        }
        if ((i11 & 4) != 0) {
            paddingsDTO = catalogTileDTO.spacers;
        }
        if ((i11 & 8) != 0) {
            str = catalogTileDTO.backgroundColor;
        }
        if ((i11 & 16) != 0) {
            map = catalogTileDTO.trackingInfo;
        }
        Map map2 = map;
        PaddingsDTO paddingsDTO2 = paddingsDTO;
        return catalogTileDTO.copy(tilePreset, list, paddingsDTO2, str, map2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final TilePreset getPreset() {
        return this.preset;
    }

    @NotNull
    public final List<TileDTO> component2() {
        return this.tiles;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final PaddingsDTO getSpacers() {
        return this.spacers;
    }

    /* renamed from: component4, reason: from getter */
    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    public final Map<String, TokenizedTrackingInfo> component5() {
        return this.trackingInfo;
    }

    @NotNull
    public final CatalogTileDTO copy(@NotNull TilePreset preset, @NotNull List<TileDTO> tiles, @NotNull PaddingsDTO spacers, String backgroundColor, Map<String, TokenizedTrackingInfo> trackingInfo) {
        Intrinsics.checkNotNullParameter(preset, "preset");
        Intrinsics.checkNotNullParameter(tiles, "tiles");
        Intrinsics.checkNotNullParameter(spacers, "spacers");
        return new CatalogTileDTO(preset, tiles, spacers, backgroundColor, trackingInfo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CatalogTileDTO)) {
            return false;
        }
        CatalogTileDTO catalogTileDTO = (CatalogTileDTO) other;
        return this.preset == catalogTileDTO.preset && Intrinsics.d(this.tiles, catalogTileDTO.tiles) && Intrinsics.d(this.spacers, catalogTileDTO.spacers) && Intrinsics.d(this.backgroundColor, catalogTileDTO.backgroundColor) && Intrinsics.d(this.trackingInfo, catalogTileDTO.trackingInfo);
    }

    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    @NotNull
    public final TilePreset getPreset() {
        return this.preset;
    }

    @NotNull
    public final PaddingsDTO getSpacers() {
        return this.spacers;
    }

    @NotNull
    public final List<TileDTO> getTiles() {
        return this.tiles;
    }

    public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
        return this.trackingInfo;
    }

    public int hashCode() {
        int hashCode = (this.spacers.hashCode() + g.b(this.preset.hashCode() * 31, 31, this.tiles)) * 31;
        String str = this.backgroundColor;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        return hashCode2 + (map != null ? map.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        TilePreset tilePreset = this.preset;
        List<TileDTO> list = this.tiles;
        PaddingsDTO paddingsDTO = this.spacers;
        String str = this.backgroundColor;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        StringBuilder sb2 = new StringBuilder("CatalogTileDTO(preset=");
        sb2.append(tilePreset);
        sb2.append(", tiles=");
        sb2.append(list);
        sb2.append(", spacers=");
        sb2.append(paddingsDTO);
        sb2.append(", backgroundColor=");
        sb2.append(str);
        sb2.append(", trackingInfo=");
        return P.f(sb2, map, ")");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ CatalogTileDTO(TilePreset tilePreset, List list, PaddingsDTO paddingsDTO, String str, Map map, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(tilePreset, list, r12, r13, r14);
        Map map2;
        String str2;
        PaddingsDTO paddingsDTO2;
        if ((i11 & 4) != 0) {
            map2 = map;
            str2 = str;
            paddingsDTO2 = new PaddingsDTO(null, null, null, null, null, 31, null);
        } else {
            map2 = map;
            str2 = str;
            paddingsDTO2 = paddingsDTO;
        }
    }
}
