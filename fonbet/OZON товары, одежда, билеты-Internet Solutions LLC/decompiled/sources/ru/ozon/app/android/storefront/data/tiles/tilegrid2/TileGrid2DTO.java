package ru.ozon.app.android.storefront.data.tiles.tilegrid2;

import D3.g;
import Fj.c;
import com.squareup.moshi.i;
import com.squareup.moshi.j;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.composerCommonViewKit.header.data.HeaderDTO;
import ru.ozon.app.android.storefront.data.tiles.blur.BlurMoleculeContentDTO;
import ru.ozon.app.android.storefront.data.tiles.common.TileTheme;
import ru.ozon.app.android.storefront.data.tiles.tilegrid2.TileItemDTO;
import ru.ozon.app.android.ugc.core.widgets.commentsListV3.data.CommentV3DTO;
import ru.ozon.moshi.adapters.serialize.collection.JsonCollectionDecoding;
import ru.ozon.moshi.adapters.serialize.proto.ProtoOneOf;
import ru.ozon.moshi.adapters.serialize.proto.ProtoOneOfSignature;
import ru.ozon.uni.atoms.data.TestInfo;
import ru.ozon.uni.atoms.data.common.CommonAtomIconDTO;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0003/01BS\u0012\u0010\b\u0001\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\u0010\b\u0001\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\u0011\u0010!\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\"\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u000eHÆ\u0003J]\u0010'\u001a\u00020\u00002\u0010\b\u0003\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\u0010\b\u0003\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000eHÆ\u0001J\u0013\u0010(\u001a\u00020)2\b\u0010*\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010+\u001a\u00020,HÖ\u0001J\t\u0010-\u001a\u00020.HÖ\u0001R$\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R$\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0015\u0010\u0012\u001a\u0004\b\u0016\u0010\u0014R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00060\u00038F¢\u0006\u0006\u001a\u0004\b \u0010\u0014¨\u00062"}, d2 = {"Lru/ozon/app/android/storefront/data/tiles/tilegrid2/TileGrid2DTO;", "", "productItems", "", "Lru/ozon/app/android/storefront/data/tiles/tilegrid2/TileGrid2ItemDTO;", "mixedItems", "Lru/ozon/app/android/storefront/data/tiles/tilegrid2/TileItemDTO;", "options", "Lru/ozon/app/android/storefront/data/tiles/tilegrid2/TileGrid2DTO$Options;", "testInfo", "Lru/ozon/uni/atoms/data/TestInfo;", CommentV3DTO.HEADER_FIELD_NAME, "Lru/ozon/android/composerCommonViewKit/header/data/HeaderDTO;", "sharedData", "Lru/ozon/app/android/storefront/data/tiles/tilegrid2/TileGrid2DTO$SharedData;", "<init>", "(Ljava/util/List;Ljava/util/List;Lru/ozon/app/android/storefront/data/tiles/tilegrid2/TileGrid2DTO$Options;Lru/ozon/uni/atoms/data/TestInfo;Lru/ozon/android/composerCommonViewKit/header/data/HeaderDTO;Lru/ozon/app/android/storefront/data/tiles/tilegrid2/TileGrid2DTO$SharedData;)V", "getProductItems$annotations", "()V", "getProductItems", "()Ljava/util/List;", "getMixedItems$annotations", "getMixedItems", "getOptions", "()Lru/ozon/app/android/storefront/data/tiles/tilegrid2/TileGrid2DTO$Options;", "getTestInfo", "()Lru/ozon/uni/atoms/data/TestInfo;", "getHeader", "()Lru/ozon/android/composerCommonViewKit/header/data/HeaderDTO;", "getSharedData", "()Lru/ozon/app/android/storefront/data/tiles/tilegrid2/TileGrid2DTO$SharedData;", "items", "getItems", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "", "Options", "SharedData", "OverlayItem", "tiles_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class TileGrid2DTO {
    private final HeaderDTO header;
    private final List<TileItemDTO> mixedItems;
    private final Options options;
    private final List<TileGrid2ItemDTO> productItems;
    private final SharedData sharedData;
    private final TestInfo testInfo;

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\fJ\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\fJ\u000b\u0010\u0016\u001a\u0004\u0018\u00010\bHÆ\u0003J>\u0010\u0017\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0002\u0010\u0018J\u0013\u0010\u0019\u001a\u00020\u00032\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u0005HÖ\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u0010\u0010\fR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001e"}, d2 = {"Lru/ozon/app/android/storefront/data/tiles/tilegrid2/TileGrid2DTO$Options;", "", "badgesInCorner", "", "backgroundColor", "", "enableParanja", "theme", "Lru/ozon/app/android/storefront/data/tiles/common/TileTheme;", "<init>", "(Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Boolean;Lru/ozon/app/android/storefront/data/tiles/common/TileTheme;)V", "getBadgesInCorner", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getBackgroundColor", "()Ljava/lang/String;", "getEnableParanja", "getTheme", "()Lru/ozon/app/android/storefront/data/tiles/common/TileTheme;", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Boolean;Lru/ozon/app/android/storefront/data/tiles/common/TileTheme;)Lru/ozon/app/android/storefront/data/tiles/tilegrid2/TileGrid2DTO$Options;", "equals", "other", "hashCode", "", "toString", "tiles_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Options {
        private final String backgroundColor;
        private final Boolean badgesInCorner;
        private final Boolean enableParanja;
        private final TileTheme theme;

        public Options(Boolean bool, String str, Boolean bool2, TileTheme tileTheme) {
            this.badgesInCorner = bool;
            this.backgroundColor = str;
            this.enableParanja = bool2;
            this.theme = tileTheme;
        }

        public static /* synthetic */ Options copy$default(Options options, Boolean bool, String str, Boolean bool2, TileTheme tileTheme, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                bool = options.badgesInCorner;
            }
            if ((i11 & 2) != 0) {
                str = options.backgroundColor;
            }
            if ((i11 & 4) != 0) {
                bool2 = options.enableParanja;
            }
            if ((i11 & 8) != 0) {
                tileTheme = options.theme;
            }
            return options.copy(bool, str, bool2, tileTheme);
        }

        /* renamed from: component1, reason: from getter */
        public final Boolean getBadgesInCorner() {
            return this.badgesInCorner;
        }

        /* renamed from: component2, reason: from getter */
        public final String getBackgroundColor() {
            return this.backgroundColor;
        }

        /* renamed from: component3, reason: from getter */
        public final Boolean getEnableParanja() {
            return this.enableParanja;
        }

        /* renamed from: component4, reason: from getter */
        public final TileTheme getTheme() {
            return this.theme;
        }

        @NotNull
        public final Options copy(Boolean badgesInCorner, String backgroundColor, Boolean enableParanja, TileTheme theme) {
            return new Options(badgesInCorner, backgroundColor, enableParanja, theme);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Options)) {
                return false;
            }
            Options options = (Options) other;
            return Intrinsics.d(this.badgesInCorner, options.badgesInCorner) && Intrinsics.d(this.backgroundColor, options.backgroundColor) && Intrinsics.d(this.enableParanja, options.enableParanja) && this.theme == options.theme;
        }

        public final String getBackgroundColor() {
            return this.backgroundColor;
        }

        public final Boolean getBadgesInCorner() {
            return this.badgesInCorner;
        }

        public final Boolean getEnableParanja() {
            return this.enableParanja;
        }

        public final TileTheme getTheme() {
            return this.theme;
        }

        public int hashCode() {
            Boolean bool = this.badgesInCorner;
            int hashCode = (bool == null ? 0 : bool.hashCode()) * 31;
            String str = this.backgroundColor;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            Boolean bool2 = this.enableParanja;
            int hashCode3 = (hashCode2 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
            TileTheme tileTheme = this.theme;
            return hashCode3 + (tileTheme != null ? tileTheme.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            Boolean bool = this.badgesInCorner;
            String str = this.backgroundColor;
            Boolean bool2 = this.enableParanja;
            TileTheme tileTheme = this.theme;
            StringBuilder e11 = g.e("Options(badgesInCorner=", bool, ", backgroundColor=", str, ", enableParanja=");
            e11.append(bool2);
            e11.append(", theme=");
            e11.append(tileTheme);
            e11.append(")");
            return e11.toString();
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bJ\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u0010\u0010\u0018\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010\u0013J>\u0010\u0019\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0002\u0010\u001aJ\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001J\t\u0010 \u001a\u00020\u0007HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0015\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\n\n\u0002\u0010\u0014\u001a\u0004\b\u0012\u0010\u0013¨\u0006!"}, d2 = {"Lru/ozon/app/android/storefront/data/tiles/tilegrid2/TileGrid2DTO$OverlayItem;", "", "icon", "Lru/ozon/uni/atoms/data/common/CommonAtomIconDTO;", "text", "Lru/ozon/uni/atoms/data/text/TextDTO;", "backgroundColor", "", "alpha", "", "<init>", "(Lru/ozon/uni/atoms/data/common/CommonAtomIconDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Ljava/lang/String;Ljava/lang/Float;)V", "getIcon", "()Lru/ozon/uni/atoms/data/common/CommonAtomIconDTO;", "getText", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getBackgroundColor", "()Ljava/lang/String;", "getAlpha", "()Ljava/lang/Float;", "Ljava/lang/Float;", "component1", "component2", "component3", "component4", "copy", "(Lru/ozon/uni/atoms/data/common/CommonAtomIconDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Ljava/lang/String;Ljava/lang/Float;)Lru/ozon/app/android/storefront/data/tiles/tilegrid2/TileGrid2DTO$OverlayItem;", "equals", "", "other", "hashCode", "", "toString", "tiles_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class OverlayItem {
        private final Float alpha;
        private final String backgroundColor;
        private final CommonAtomIconDTO icon;
        private final TextDTO text;

        public OverlayItem(CommonAtomIconDTO commonAtomIconDTO, TextDTO textDTO, String str, Float f7) {
            this.icon = commonAtomIconDTO;
            this.text = textDTO;
            this.backgroundColor = str;
            this.alpha = f7;
        }

        public static /* synthetic */ OverlayItem copy$default(OverlayItem overlayItem, CommonAtomIconDTO commonAtomIconDTO, TextDTO textDTO, String str, Float f7, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                commonAtomIconDTO = overlayItem.icon;
            }
            if ((i11 & 2) != 0) {
                textDTO = overlayItem.text;
            }
            if ((i11 & 4) != 0) {
                str = overlayItem.backgroundColor;
            }
            if ((i11 & 8) != 0) {
                f7 = overlayItem.alpha;
            }
            return overlayItem.copy(commonAtomIconDTO, textDTO, str, f7);
        }

        /* renamed from: component1, reason: from getter */
        public final CommonAtomIconDTO getIcon() {
            return this.icon;
        }

        /* renamed from: component2, reason: from getter */
        public final TextDTO getText() {
            return this.text;
        }

        /* renamed from: component3, reason: from getter */
        public final String getBackgroundColor() {
            return this.backgroundColor;
        }

        /* renamed from: component4, reason: from getter */
        public final Float getAlpha() {
            return this.alpha;
        }

        @NotNull
        public final OverlayItem copy(CommonAtomIconDTO icon, TextDTO text, String backgroundColor, Float alpha) {
            return new OverlayItem(icon, text, backgroundColor, alpha);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof OverlayItem)) {
                return false;
            }
            OverlayItem overlayItem = (OverlayItem) other;
            return Intrinsics.d(this.icon, overlayItem.icon) && Intrinsics.d(this.text, overlayItem.text) && Intrinsics.d(this.backgroundColor, overlayItem.backgroundColor) && Intrinsics.d(this.alpha, overlayItem.alpha);
        }

        public final Float getAlpha() {
            return this.alpha;
        }

        public final String getBackgroundColor() {
            return this.backgroundColor;
        }

        public final CommonAtomIconDTO getIcon() {
            return this.icon;
        }

        public final TextDTO getText() {
            return this.text;
        }

        public int hashCode() {
            CommonAtomIconDTO commonAtomIconDTO = this.icon;
            int hashCode = (commonAtomIconDTO == null ? 0 : commonAtomIconDTO.hashCode()) * 31;
            TextDTO textDTO = this.text;
            int hashCode2 = (hashCode + (textDTO == null ? 0 : textDTO.hashCode())) * 31;
            String str = this.backgroundColor;
            int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
            Float f7 = this.alpha;
            return hashCode3 + (f7 != null ? f7.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "OverlayItem(icon=" + this.icon + ", text=" + this.text + ", backgroundColor=" + this.backgroundColor + ", alpha=" + this.alpha + ")";
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B;\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\f\u0010\rJ\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0017\u0010\u0018\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u000bHÆ\u0003JE\u0010\u001a\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0016\b\u0002\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000bHÆ\u0001J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001J\t\u0010 \u001a\u00020\bHÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u001f\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006!"}, d2 = {"Lru/ozon/app/android/storefront/data/tiles/tilegrid2/TileGrid2DTO$SharedData;", "", "kebabIcon", "Lru/ozon/uni/atoms/data/common/CommonAtomIconDTO;", "overlayItem", "Lru/ozon/app/android/storefront/data/tiles/tilegrid2/TileGrid2DTO$OverlayItem;", "blurItemInfo", "", "", "Lru/ozon/app/android/storefront/data/tiles/blur/BlurMoleculeContentDTO;", "bannerBadge", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "<init>", "(Lru/ozon/uni/atoms/data/common/CommonAtomIconDTO;Lru/ozon/app/android/storefront/data/tiles/tilegrid2/TileGrid2DTO$OverlayItem;Ljava/util/Map;Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;)V", "getKebabIcon", "()Lru/ozon/uni/atoms/data/common/CommonAtomIconDTO;", "getOverlayItem", "()Lru/ozon/app/android/storefront/data/tiles/tilegrid2/TileGrid2DTO$OverlayItem;", "getBlurItemInfo", "()Ljava/util/Map;", "getBannerBadge", "()Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "tiles_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class SharedData {
        private final BadgeDTO bannerBadge;
        private final Map<String, BlurMoleculeContentDTO> blurItemInfo;
        private final CommonAtomIconDTO kebabIcon;
        private final OverlayItem overlayItem;

        public SharedData(CommonAtomIconDTO commonAtomIconDTO, OverlayItem overlayItem, Map<String, BlurMoleculeContentDTO> map, BadgeDTO badgeDTO) {
            this.kebabIcon = commonAtomIconDTO;
            this.overlayItem = overlayItem;
            this.blurItemInfo = map;
            this.bannerBadge = badgeDTO;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ SharedData copy$default(SharedData sharedData, CommonAtomIconDTO commonAtomIconDTO, OverlayItem overlayItem, Map map, BadgeDTO badgeDTO, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                commonAtomIconDTO = sharedData.kebabIcon;
            }
            if ((i11 & 2) != 0) {
                overlayItem = sharedData.overlayItem;
            }
            if ((i11 & 4) != 0) {
                map = sharedData.blurItemInfo;
            }
            if ((i11 & 8) != 0) {
                badgeDTO = sharedData.bannerBadge;
            }
            return sharedData.copy(commonAtomIconDTO, overlayItem, map, badgeDTO);
        }

        /* renamed from: component1, reason: from getter */
        public final CommonAtomIconDTO getKebabIcon() {
            return this.kebabIcon;
        }

        /* renamed from: component2, reason: from getter */
        public final OverlayItem getOverlayItem() {
            return this.overlayItem;
        }

        public final Map<String, BlurMoleculeContentDTO> component3() {
            return this.blurItemInfo;
        }

        /* renamed from: component4, reason: from getter */
        public final BadgeDTO getBannerBadge() {
            return this.bannerBadge;
        }

        @NotNull
        public final SharedData copy(CommonAtomIconDTO kebabIcon, OverlayItem overlayItem, Map<String, BlurMoleculeContentDTO> blurItemInfo, BadgeDTO bannerBadge) {
            return new SharedData(kebabIcon, overlayItem, blurItemInfo, bannerBadge);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SharedData)) {
                return false;
            }
            SharedData sharedData = (SharedData) other;
            return Intrinsics.d(this.kebabIcon, sharedData.kebabIcon) && Intrinsics.d(this.overlayItem, sharedData.overlayItem) && Intrinsics.d(this.blurItemInfo, sharedData.blurItemInfo) && Intrinsics.d(this.bannerBadge, sharedData.bannerBadge);
        }

        public final BadgeDTO getBannerBadge() {
            return this.bannerBadge;
        }

        public final Map<String, BlurMoleculeContentDTO> getBlurItemInfo() {
            return this.blurItemInfo;
        }

        public final CommonAtomIconDTO getKebabIcon() {
            return this.kebabIcon;
        }

        public final OverlayItem getOverlayItem() {
            return this.overlayItem;
        }

        public int hashCode() {
            CommonAtomIconDTO commonAtomIconDTO = this.kebabIcon;
            int hashCode = (commonAtomIconDTO == null ? 0 : commonAtomIconDTO.hashCode()) * 31;
            OverlayItem overlayItem = this.overlayItem;
            int hashCode2 = (hashCode + (overlayItem == null ? 0 : overlayItem.hashCode())) * 31;
            Map<String, BlurMoleculeContentDTO> map = this.blurItemInfo;
            int hashCode3 = (hashCode2 + (map == null ? 0 : map.hashCode())) * 31;
            BadgeDTO badgeDTO = this.bannerBadge;
            return hashCode3 + (badgeDTO != null ? badgeDTO.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "SharedData(kebabIcon=" + this.kebabIcon + ", overlayItem=" + this.overlayItem + ", blurItemInfo=" + this.blurItemInfo + ", bannerBadge=" + this.bannerBadge + ")";
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public TileGrid2DTO(@i(name = "items") List<TileGrid2ItemDTO> list, @ProtoOneOfSignature.Container({@ProtoOneOfSignature(name = "product", type = TileGrid2ItemDTO.class), @ProtoOneOfSignature(name = "banner", type = TileItemDTO.TileGrid2BannerDTO.class)}) @i(name = "tiles") @ProtoOneOf(label = "type") List<? extends TileItemDTO> list2, Options options, TestInfo testInfo, HeaderDTO headerDTO, SharedData sharedData) {
        this.productItems = list;
        this.mixedItems = list2;
        this.options = options;
        this.testInfo = testInfo;
        this.header = headerDTO;
        this.sharedData = sharedData;
    }

    public static /* synthetic */ TileGrid2DTO copy$default(TileGrid2DTO tileGrid2DTO, List list, List list2, Options options, TestInfo testInfo, HeaderDTO headerDTO, SharedData sharedData, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = tileGrid2DTO.productItems;
        }
        if ((i11 & 2) != 0) {
            list2 = tileGrid2DTO.mixedItems;
        }
        if ((i11 & 4) != 0) {
            options = tileGrid2DTO.options;
        }
        if ((i11 & 8) != 0) {
            testInfo = tileGrid2DTO.testInfo;
        }
        if ((i11 & 16) != 0) {
            headerDTO = tileGrid2DTO.header;
        }
        if ((i11 & 32) != 0) {
            sharedData = tileGrid2DTO.sharedData;
        }
        HeaderDTO headerDTO2 = headerDTO;
        SharedData sharedData2 = sharedData;
        return tileGrid2DTO.copy(list, list2, options, testInfo, headerDTO2, sharedData2);
    }

    @JsonCollectionDecoding
    public static /* synthetic */ void getMixedItems$annotations() {
    }

    @JsonCollectionDecoding
    public static /* synthetic */ void getProductItems$annotations() {
    }

    public final List<TileGrid2ItemDTO> component1() {
        return this.productItems;
    }

    public final List<TileItemDTO> component2() {
        return this.mixedItems;
    }

    /* renamed from: component3, reason: from getter */
    public final Options getOptions() {
        return this.options;
    }

    /* renamed from: component4, reason: from getter */
    public final TestInfo getTestInfo() {
        return this.testInfo;
    }

    /* renamed from: component5, reason: from getter */
    public final HeaderDTO getHeader() {
        return this.header;
    }

    /* renamed from: component6, reason: from getter */
    public final SharedData getSharedData() {
        return this.sharedData;
    }

    @NotNull
    public final TileGrid2DTO copy(@i(name = "items") List<TileGrid2ItemDTO> productItems, @ProtoOneOfSignature.Container({@ProtoOneOfSignature(name = "product", type = TileGrid2ItemDTO.class), @ProtoOneOfSignature(name = "banner", type = TileItemDTO.TileGrid2BannerDTO.class)}) @i(name = "tiles") @ProtoOneOf(label = "type") List<? extends TileItemDTO> mixedItems, Options options, TestInfo testInfo, HeaderDTO header, SharedData sharedData) {
        return new TileGrid2DTO(productItems, mixedItems, options, testInfo, header, sharedData);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TileGrid2DTO)) {
            return false;
        }
        TileGrid2DTO tileGrid2DTO = (TileGrid2DTO) other;
        return Intrinsics.d(this.productItems, tileGrid2DTO.productItems) && Intrinsics.d(this.mixedItems, tileGrid2DTO.mixedItems) && Intrinsics.d(this.options, tileGrid2DTO.options) && Intrinsics.d(this.testInfo, tileGrid2DTO.testInfo) && Intrinsics.d(this.header, tileGrid2DTO.header) && Intrinsics.d(this.sharedData, tileGrid2DTO.sharedData);
    }

    public final HeaderDTO getHeader() {
        return this.header;
    }

    @NotNull
    public final List<TileItemDTO> getItems() {
        List<TileGrid2ItemDTO> list = this.productItems;
        if (list != null) {
            return list;
        }
        List<TileItemDTO> list2 = this.mixedItems;
        if (list2 != null) {
            return list2;
        }
        throw new IllegalStateException("At least one array must be non-null");
    }

    public final List<TileItemDTO> getMixedItems() {
        return this.mixedItems;
    }

    public final Options getOptions() {
        return this.options;
    }

    public final List<TileGrid2ItemDTO> getProductItems() {
        return this.productItems;
    }

    public final SharedData getSharedData() {
        return this.sharedData;
    }

    public final TestInfo getTestInfo() {
        return this.testInfo;
    }

    public int hashCode() {
        List<TileGrid2ItemDTO> list = this.productItems;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        List<TileItemDTO> list2 = this.mixedItems;
        int hashCode2 = (hashCode + (list2 == null ? 0 : list2.hashCode())) * 31;
        Options options = this.options;
        int hashCode3 = (hashCode2 + (options == null ? 0 : options.hashCode())) * 31;
        TestInfo testInfo = this.testInfo;
        int hashCode4 = (hashCode3 + (testInfo == null ? 0 : testInfo.hashCode())) * 31;
        HeaderDTO headerDTO = this.header;
        int hashCode5 = (hashCode4 + (headerDTO == null ? 0 : headerDTO.hashCode())) * 31;
        SharedData sharedData = this.sharedData;
        return hashCode5 + (sharedData != null ? sharedData.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        List<TileGrid2ItemDTO> list = this.productItems;
        List<TileItemDTO> list2 = this.mixedItems;
        Options options = this.options;
        TestInfo testInfo = this.testInfo;
        HeaderDTO headerDTO = this.header;
        SharedData sharedData = this.sharedData;
        StringBuilder d11 = c.d("TileGrid2DTO(productItems=", list, ", mixedItems=", ", options=", list2);
        d11.append(options);
        d11.append(", testInfo=");
        d11.append(testInfo);
        d11.append(", header=");
        d11.append(headerDTO);
        d11.append(", sharedData=");
        d11.append(sharedData);
        d11.append(")");
        return d11.toString();
    }
}
