package ru.ozon.app.android.search.searchscreen.presentation.components.searchresults.common.data.image;

import B90.C2618u;
import Bk.C2638a;
import G.g;
import N3.C3660k;
import T7.P;
import Xc.a;
import Xc.b;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.squareup.moshi.i;
import com.squareup.moshi.j;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.storefront.data.tiles.common.ContentMode;
import ru.ozon.moshi.adapters.serialize.proto.ProtoOneOf;
import ru.ozon.moshi.adapters.serialize.proto.ProtoOneOfSignature;
import ru.ozon.uni.atoms.data.badge.Badge;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b%\n\u0002\u0010\b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001:\u0003=>?B\u0085\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\u0014\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011\u0012\u000e\b\u0001\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\t\u0010+\u001a\u00020\u0003HÆ\u0003J\u000b\u0010,\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\bHÆ\u0003J\u0010\u0010/\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010 J\u000b\u00100\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00101\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00102\u001a\u0004\u0018\u00010\u000eHÆ\u0003J\u000b\u00103\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0017\u00104\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011HÆ\u0003J\u000f\u00105\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014HÆ\u0003J \u0001\u00106\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00032\u0016\b\u0002\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u00112\u000e\b\u0003\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014HÆ\u0001¢\u0006\u0002\u00107J\u0013\u00108\u001a\u00020\n2\b\u00109\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010:\u001a\u00020;HÖ\u0001J\t\u0010<\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001bR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0015\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\n\n\u0002\u0010!\u001a\u0004\b\u001f\u0010 R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0019R\u0013\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u0019R\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u0019R\u001f\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(R\u0017\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014¢\u0006\b\n\u0000\u001a\u0004\b)\u0010*¨\u0006@"}, d2 = {"Lru/ozon/app/android/search/searchscreen/presentation/components/searchresults/common/data/image/TileImageComponent;", "", "imageRatio", "", "leftBottomBadge", "Lru/ozon/uni/atoms/data/badge/Badge;", "secondLeftBottomBadge", "paranja", "Lru/ozon/app/android/search/searchscreen/presentation/components/searchresults/common/data/image/TileImageComponent$Paranja;", "shouldBlur", "", "blurPlaceholderImage", "overlayTitle", "theme", "Lru/ozon/app/android/search/searchscreen/presentation/components/searchresults/common/data/image/TileImageComponent$TileImageTheme;", "logo", "pinchToZoomTrackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "items", "", "Lru/ozon/app/android/search/searchscreen/presentation/components/searchresults/common/data/image/TileImageComponent$TileItemDTO;", "<init>", "(Ljava/lang/String;Lru/ozon/uni/atoms/data/badge/Badge;Lru/ozon/uni/atoms/data/badge/Badge;Lru/ozon/app/android/search/searchscreen/presentation/components/searchresults/common/data/image/TileImageComponent$Paranja;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Lru/ozon/app/android/search/searchscreen/presentation/components/searchresults/common/data/image/TileImageComponent$TileImageTheme;Ljava/lang/String;Ljava/util/Map;Ljava/util/List;)V", "getImageRatio", "()Ljava/lang/String;", "getLeftBottomBadge", "()Lru/ozon/uni/atoms/data/badge/Badge;", "getSecondLeftBottomBadge", "getParanja", "()Lru/ozon/app/android/search/searchscreen/presentation/components/searchresults/common/data/image/TileImageComponent$Paranja;", "getShouldBlur", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getBlurPlaceholderImage", "getOverlayTitle", "getTheme", "()Lru/ozon/app/android/search/searchscreen/presentation/components/searchresults/common/data/image/TileImageComponent$TileImageTheme;", "getLogo", "getPinchToZoomTrackingInfo", "()Ljava/util/Map;", "getItems", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "copy", "(Ljava/lang/String;Lru/ozon/uni/atoms/data/badge/Badge;Lru/ozon/uni/atoms/data/badge/Badge;Lru/ozon/app/android/search/searchscreen/presentation/components/searchresults/common/data/image/TileImageComponent$Paranja;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Lru/ozon/app/android/search/searchscreen/presentation/components/searchresults/common/data/image/TileImageComponent$TileImageTheme;Ljava/lang/String;Ljava/util/Map;Ljava/util/List;)Lru/ozon/app/android/search/searchscreen/presentation/components/searchresults/common/data/image/TileImageComponent;", "equals", "other", "hashCode", "", "toString", "TileImageTheme", "Paranja", "TileItemDTO", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class TileImageComponent {
    public static final int $stable = 8;
    private final String blurPlaceholderImage;

    @NotNull
    private final String imageRatio;

    @NotNull
    private final List<TileItemDTO> items;
    private final Badge leftBottomBadge;
    private final String logo;
    private final String overlayTitle;
    private final Paranja paranja;
    private final Map<String, TokenizedTrackingInfo> pinchToZoomTrackingInfo;
    private final Badge secondLeftBottomBadge;
    private final Boolean shouldBlur;
    private final TileImageTheme theme;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lru/ozon/app/android/search/searchscreen/presentation/components/searchresults/common/data/image/TileImageComponent$Paranja;", "", "<init>", "(Ljava/lang/String;I)V", "PARANJA_BOTH_THEMES", "PARANJA_DARK_THEME", "PARANJA_DISABLED", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Paranja {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ Paranja[] $VALUES;

        @i(name = "PARANJA_BOTH_THEMES")
        public static final Paranja PARANJA_BOTH_THEMES = new Paranja("PARANJA_BOTH_THEMES", 0);

        @i(name = "PARANJA_DARK_THEME")
        public static final Paranja PARANJA_DARK_THEME = new Paranja("PARANJA_DARK_THEME", 1);

        @i(name = "PARANJA_DISABLED")
        public static final Paranja PARANJA_DISABLED = new Paranja("PARANJA_DISABLED", 2);

        private static final /* synthetic */ Paranja[] $values() {
            return new Paranja[]{PARANJA_BOTH_THEMES, PARANJA_DARK_THEME, PARANJA_DISABLED};
        }

        static {
            Paranja[] $values = $values();
            $VALUES = $values;
            $ENTRIES = b.a($values);
        }

        private Paranja(String str, int i11) {
        }

        public static Paranja valueOf(String str) {
            return (Paranja) Enum.valueOf(Paranja.class, str);
        }

        public static Paranja[] values() {
            return (Paranja[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/search/searchscreen/presentation/components/searchresults/common/data/image/TileImageComponent$TileImageTheme;", "", "<init>", "(Ljava/lang/String;I)V", "THEME_TYPE_INVALID", "THEME_TYPE_WAVE", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class TileImageTheme {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ TileImageTheme[] $VALUES;

        @i(name = "THEME_TYPE_INVALID")
        public static final TileImageTheme THEME_TYPE_INVALID = new TileImageTheme("THEME_TYPE_INVALID", 0);

        @i(name = "THEME_TYPE_WAVE")
        public static final TileImageTheme THEME_TYPE_WAVE = new TileImageTheme("THEME_TYPE_WAVE", 1);

        private static final /* synthetic */ TileImageTheme[] $values() {
            return new TileImageTheme[]{THEME_TYPE_INVALID, THEME_TYPE_WAVE};
        }

        static {
            TileImageTheme[] $values = $values();
            $VALUES = $values;
            $ENTRIES = b.a($values);
        }

        private TileImageTheme(String str, int i11) {
        }

        public static TileImageTheme valueOf(String str) {
            return (TileImageTheme) Enum.valueOf(TileImageTheme.class, str);
        }

        public static TileImageTheme[] values() {
            return (TileImageTheme[]) $VALUES.clone();
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lru/ozon/app/android/search/searchscreen/presentation/components/searchresults/common/data/image/TileImageComponent$TileItemDTO;", "", "<init>", "()V", "ImageDTO", "VideoDTO", "Lru/ozon/app/android/search/searchscreen/presentation/components/searchresults/common/data/image/TileImageComponent$TileItemDTO$ImageDTO;", "Lru/ozon/app/android/search/searchscreen/presentation/components/searchresults/common/data/image/TileImageComponent$TileItemDTO$VideoDTO;", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static abstract class TileItemDTO {
        public static final int $stable = 0;

        @j(generateAdapter = true)
        @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/search/searchscreen/presentation/components/searchresults/common/data/image/TileImageComponent$TileItemDTO$ImageDTO;", "Lru/ozon/app/android/search/searchscreen/presentation/components/searchresults/common/data/image/TileImageComponent$TileItemDTO;", "link", "", "contentMode", "Lru/ozon/app/android/storefront/data/tiles/common/ContentMode;", "<init>", "(Ljava/lang/String;Lru/ozon/app/android/storefront/data/tiles/common/ContentMode;)V", "getLink", "()Ljava/lang/String;", "getContentMode", "()Lru/ozon/app/android/storefront/data/tiles/common/ContentMode;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class ImageDTO extends TileItemDTO {
            public static final int $stable = 0;
            private final ContentMode contentMode;

            @NotNull
            private final String link;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ImageDTO(@NotNull String link, ContentMode contentMode) {
                super(null);
                Intrinsics.checkNotNullParameter(link, "link");
                this.link = link;
                this.contentMode = contentMode;
            }

            public static /* synthetic */ ImageDTO copy$default(ImageDTO imageDTO, String str, ContentMode contentMode, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    str = imageDTO.link;
                }
                if ((i11 & 2) != 0) {
                    contentMode = imageDTO.contentMode;
                }
                return imageDTO.copy(str, contentMode);
            }

            @NotNull
            /* renamed from: component1, reason: from getter */
            public final String getLink() {
                return this.link;
            }

            /* renamed from: component2, reason: from getter */
            public final ContentMode getContentMode() {
                return this.contentMode;
            }

            @NotNull
            public final ImageDTO copy(@NotNull String link, ContentMode contentMode) {
                Intrinsics.checkNotNullParameter(link, "link");
                return new ImageDTO(link, contentMode);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof ImageDTO)) {
                    return false;
                }
                ImageDTO imageDTO = (ImageDTO) other;
                return Intrinsics.d(this.link, imageDTO.link) && this.contentMode == imageDTO.contentMode;
            }

            public final ContentMode getContentMode() {
                return this.contentMode;
            }

            @NotNull
            public final String getLink() {
                return this.link;
            }

            public int hashCode() {
                int hashCode = this.link.hashCode() * 31;
                ContentMode contentMode = this.contentMode;
                return hashCode + (contentMode == null ? 0 : contentMode.hashCode());
            }

            @NotNull
            public String toString() {
                return "ImageDTO(link=" + this.link + ", contentMode=" + this.contentMode + ")";
            }
        }

        public /* synthetic */ TileItemDTO(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u001eB-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\bHÆ\u0003J5\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aHÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001f"}, d2 = {"Lru/ozon/app/android/search/searchscreen/presentation/components/searchresults/common/data/image/TileImageComponent$TileItemDTO$VideoDTO;", "Lru/ozon/app/android/search/searchscreen/presentation/components/searchresults/common/data/image/TileImageComponent$TileItemDTO;", "preview", "", "link", "tracking", "Lru/ozon/app/android/search/searchscreen/presentation/components/searchresults/common/data/image/TileImageComponent$TileItemDTO$VideoDTO$VideoTracking;", "previewContentMode", "Lru/ozon/app/android/storefront/data/tiles/common/ContentMode;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lru/ozon/app/android/search/searchscreen/presentation/components/searchresults/common/data/image/TileImageComponent$TileItemDTO$VideoDTO$VideoTracking;Lru/ozon/app/android/storefront/data/tiles/common/ContentMode;)V", "getPreview", "()Ljava/lang/String;", "getLink", "getTracking", "()Lru/ozon/app/android/search/searchscreen/presentation/components/searchresults/common/data/image/TileImageComponent$TileItemDTO$VideoDTO$VideoTracking;", "getPreviewContentMode", "()Lru/ozon/app/android/storefront/data/tiles/common/ContentMode;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "", "hashCode", "", "toString", "VideoTracking", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        @j(generateAdapter = true)
        public static final /* data */ class VideoDTO extends TileItemDTO {
            public static final int $stable = 8;

            @NotNull
            private final String link;

            @NotNull
            private final String preview;
            private final ContentMode previewContentMode;
            private final VideoTracking tracking;

            @j(generateAdapter = true)
            @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BI\u0012\u0014\u0010\u0002\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003\u0012\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003\u0012\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003HÆ\u0003J\u0017\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003HÆ\u0003J\u0017\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003HÆ\u0003JQ\u0010\u0011\u001a\u00020\u00002\u0016\b\u0002\u0010\u0002\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00032\u0016\b\u0002\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00032\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0004HÖ\u0001R\u001f\u0010\u0002\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u001f\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u001f\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000b¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/search/searchscreen/presentation/components/searchresults/common/data/image/TileImageComponent$TileItemDTO$VideoDTO$VideoTracking;", "", "startedTrackingInfo", "", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "finishedTrackingInfo", "interruptedTrackingInfo", "<init>", "(Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;)V", "getStartedTrackingInfo", "()Ljava/util/Map;", "getFinishedTrackingInfo", "getInterruptedTrackingInfo", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
            /* loaded from: classes13.dex */
            public static final /* data */ class VideoTracking {
                public static final int $stable = 8;
                private final Map<String, TokenizedTrackingInfo> finishedTrackingInfo;
                private final Map<String, TokenizedTrackingInfo> interruptedTrackingInfo;
                private final Map<String, TokenizedTrackingInfo> startedTrackingInfo;

                public VideoTracking(Map<String, TokenizedTrackingInfo> map, Map<String, TokenizedTrackingInfo> map2, Map<String, TokenizedTrackingInfo> map3) {
                    this.startedTrackingInfo = map;
                    this.finishedTrackingInfo = map2;
                    this.interruptedTrackingInfo = map3;
                }

                /* JADX WARN: Multi-variable type inference failed */
                public static /* synthetic */ VideoTracking copy$default(VideoTracking videoTracking, Map map, Map map2, Map map3, int i11, Object obj) {
                    if ((i11 & 1) != 0) {
                        map = videoTracking.startedTrackingInfo;
                    }
                    if ((i11 & 2) != 0) {
                        map2 = videoTracking.finishedTrackingInfo;
                    }
                    if ((i11 & 4) != 0) {
                        map3 = videoTracking.interruptedTrackingInfo;
                    }
                    return videoTracking.copy(map, map2, map3);
                }

                public final Map<String, TokenizedTrackingInfo> component1() {
                    return this.startedTrackingInfo;
                }

                public final Map<String, TokenizedTrackingInfo> component2() {
                    return this.finishedTrackingInfo;
                }

                public final Map<String, TokenizedTrackingInfo> component3() {
                    return this.interruptedTrackingInfo;
                }

                @NotNull
                public final VideoTracking copy(Map<String, TokenizedTrackingInfo> startedTrackingInfo, Map<String, TokenizedTrackingInfo> finishedTrackingInfo, Map<String, TokenizedTrackingInfo> interruptedTrackingInfo) {
                    return new VideoTracking(startedTrackingInfo, finishedTrackingInfo, interruptedTrackingInfo);
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof VideoTracking)) {
                        return false;
                    }
                    VideoTracking videoTracking = (VideoTracking) other;
                    return Intrinsics.d(this.startedTrackingInfo, videoTracking.startedTrackingInfo) && Intrinsics.d(this.finishedTrackingInfo, videoTracking.finishedTrackingInfo) && Intrinsics.d(this.interruptedTrackingInfo, videoTracking.interruptedTrackingInfo);
                }

                public final Map<String, TokenizedTrackingInfo> getFinishedTrackingInfo() {
                    return this.finishedTrackingInfo;
                }

                public final Map<String, TokenizedTrackingInfo> getInterruptedTrackingInfo() {
                    return this.interruptedTrackingInfo;
                }

                public final Map<String, TokenizedTrackingInfo> getStartedTrackingInfo() {
                    return this.startedTrackingInfo;
                }

                public int hashCode() {
                    Map<String, TokenizedTrackingInfo> map = this.startedTrackingInfo;
                    int hashCode = (map == null ? 0 : map.hashCode()) * 31;
                    Map<String, TokenizedTrackingInfo> map2 = this.finishedTrackingInfo;
                    int hashCode2 = (hashCode + (map2 == null ? 0 : map2.hashCode())) * 31;
                    Map<String, TokenizedTrackingInfo> map3 = this.interruptedTrackingInfo;
                    return hashCode2 + (map3 != null ? map3.hashCode() : 0);
                }

                @NotNull
                public String toString() {
                    Map<String, TokenizedTrackingInfo> map = this.startedTrackingInfo;
                    Map<String, TokenizedTrackingInfo> map2 = this.finishedTrackingInfo;
                    Map<String, TokenizedTrackingInfo> map3 = this.interruptedTrackingInfo;
                    StringBuilder sb2 = new StringBuilder("VideoTracking(startedTrackingInfo=");
                    sb2.append(map);
                    sb2.append(", finishedTrackingInfo=");
                    sb2.append(map2);
                    sb2.append(", interruptedTrackingInfo=");
                    return P.f(sb2, map3, ")");
                }
            }

            public /* synthetic */ VideoDTO(String str, String str2, VideoTracking videoTracking, ContentMode contentMode, int i11, DefaultConstructorMarker defaultConstructorMarker) {
                this(str, str2, videoTracking, (i11 & 8) != 0 ? ContentMode.SCALE_ASPECT_FILL : contentMode);
            }

            public static /* synthetic */ VideoDTO copy$default(VideoDTO videoDTO, String str, String str2, VideoTracking videoTracking, ContentMode contentMode, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    str = videoDTO.preview;
                }
                if ((i11 & 2) != 0) {
                    str2 = videoDTO.link;
                }
                if ((i11 & 4) != 0) {
                    videoTracking = videoDTO.tracking;
                }
                if ((i11 & 8) != 0) {
                    contentMode = videoDTO.previewContentMode;
                }
                return videoDTO.copy(str, str2, videoTracking, contentMode);
            }

            @NotNull
            /* renamed from: component1, reason: from getter */
            public final String getPreview() {
                return this.preview;
            }

            @NotNull
            /* renamed from: component2, reason: from getter */
            public final String getLink() {
                return this.link;
            }

            /* renamed from: component3, reason: from getter */
            public final VideoTracking getTracking() {
                return this.tracking;
            }

            /* renamed from: component4, reason: from getter */
            public final ContentMode getPreviewContentMode() {
                return this.previewContentMode;
            }

            @NotNull
            public final VideoDTO copy(@NotNull String preview, @NotNull String link, VideoTracking tracking, ContentMode previewContentMode) {
                Intrinsics.checkNotNullParameter(preview, "preview");
                Intrinsics.checkNotNullParameter(link, "link");
                return new VideoDTO(preview, link, tracking, previewContentMode);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof VideoDTO)) {
                    return false;
                }
                VideoDTO videoDTO = (VideoDTO) other;
                return Intrinsics.d(this.preview, videoDTO.preview) && Intrinsics.d(this.link, videoDTO.link) && Intrinsics.d(this.tracking, videoDTO.tracking) && this.previewContentMode == videoDTO.previewContentMode;
            }

            @NotNull
            public final String getLink() {
                return this.link;
            }

            @NotNull
            public final String getPreview() {
                return this.preview;
            }

            public final ContentMode getPreviewContentMode() {
                return this.previewContentMode;
            }

            public final VideoTracking getTracking() {
                return this.tracking;
            }

            public int hashCode() {
                int a11 = g.a(this.preview.hashCode() * 31, 31, this.link);
                VideoTracking videoTracking = this.tracking;
                int hashCode = (a11 + (videoTracking == null ? 0 : videoTracking.hashCode())) * 31;
                ContentMode contentMode = this.previewContentMode;
                return hashCode + (contentMode != null ? contentMode.hashCode() : 0);
            }

            @NotNull
            public String toString() {
                String str = this.preview;
                String str2 = this.link;
                VideoTracking videoTracking = this.tracking;
                ContentMode contentMode = this.previewContentMode;
                StringBuilder d11 = C3660k.d("VideoDTO(preview=", str, ", link=", str2, ", tracking=");
                d11.append(videoTracking);
                d11.append(", previewContentMode=");
                d11.append(contentMode);
                d11.append(")");
                return d11.toString();
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public VideoDTO(@NotNull String preview, @NotNull String link, VideoTracking videoTracking, ContentMode contentMode) {
                super(null);
                Intrinsics.checkNotNullParameter(preview, "preview");
                Intrinsics.checkNotNullParameter(link, "link");
                this.preview = preview;
                this.link = link;
                this.tracking = videoTracking;
                this.previewContentMode = contentMode;
            }
        }

        private TileItemDTO() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public TileImageComponent(@NotNull String imageRatio, Badge badge, Badge badge2, Paranja paranja, Boolean bool, String str, String str2, TileImageTheme tileImageTheme, String str3, Map<String, TokenizedTrackingInfo> map, @ProtoOneOfSignature.Container({@ProtoOneOfSignature(name = "image", type = TileItemDTO.ImageDTO.class), @ProtoOneOfSignature(name = "video", type = TileItemDTO.VideoDTO.class)}) @NotNull @ProtoOneOf(label = "type") List<? extends TileItemDTO> items) {
        Intrinsics.checkNotNullParameter(imageRatio, "imageRatio");
        Intrinsics.checkNotNullParameter(items, "items");
        this.imageRatio = imageRatio;
        this.leftBottomBadge = badge;
        this.secondLeftBottomBadge = badge2;
        this.paranja = paranja;
        this.shouldBlur = bool;
        this.blurPlaceholderImage = str;
        this.overlayTitle = str2;
        this.theme = tileImageTheme;
        this.logo = str3;
        this.pinchToZoomTrackingInfo = map;
        this.items = items;
    }

    public static /* synthetic */ TileImageComponent copy$default(TileImageComponent tileImageComponent, String str, Badge badge, Badge badge2, Paranja paranja, Boolean bool, String str2, String str3, TileImageTheme tileImageTheme, String str4, Map map, List list, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = tileImageComponent.imageRatio;
        }
        if ((i11 & 2) != 0) {
            badge = tileImageComponent.leftBottomBadge;
        }
        if ((i11 & 4) != 0) {
            badge2 = tileImageComponent.secondLeftBottomBadge;
        }
        if ((i11 & 8) != 0) {
            paranja = tileImageComponent.paranja;
        }
        if ((i11 & 16) != 0) {
            bool = tileImageComponent.shouldBlur;
        }
        if ((i11 & 32) != 0) {
            str2 = tileImageComponent.blurPlaceholderImage;
        }
        if ((i11 & 64) != 0) {
            str3 = tileImageComponent.overlayTitle;
        }
        if ((i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
            tileImageTheme = tileImageComponent.theme;
        }
        if ((i11 & 256) != 0) {
            str4 = tileImageComponent.logo;
        }
        if ((i11 & UserVerificationMethods.USER_VERIFY_NONE) != 0) {
            map = tileImageComponent.pinchToZoomTrackingInfo;
        }
        if ((i11 & UserVerificationMethods.USER_VERIFY_ALL) != 0) {
            list = tileImageComponent.items;
        }
        Map map2 = map;
        List list2 = list;
        TileImageTheme tileImageTheme2 = tileImageTheme;
        String str5 = str4;
        String str6 = str2;
        String str7 = str3;
        Boolean bool2 = bool;
        Badge badge3 = badge2;
        return tileImageComponent.copy(str, badge, badge3, paranja, bool2, str6, str7, tileImageTheme2, str5, map2, list2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getImageRatio() {
        return this.imageRatio;
    }

    public final Map<String, TokenizedTrackingInfo> component10() {
        return this.pinchToZoomTrackingInfo;
    }

    @NotNull
    public final List<TileItemDTO> component11() {
        return this.items;
    }

    /* renamed from: component2, reason: from getter */
    public final Badge getLeftBottomBadge() {
        return this.leftBottomBadge;
    }

    /* renamed from: component3, reason: from getter */
    public final Badge getSecondLeftBottomBadge() {
        return this.secondLeftBottomBadge;
    }

    /* renamed from: component4, reason: from getter */
    public final Paranja getParanja() {
        return this.paranja;
    }

    /* renamed from: component5, reason: from getter */
    public final Boolean getShouldBlur() {
        return this.shouldBlur;
    }

    /* renamed from: component6, reason: from getter */
    public final String getBlurPlaceholderImage() {
        return this.blurPlaceholderImage;
    }

    /* renamed from: component7, reason: from getter */
    public final String getOverlayTitle() {
        return this.overlayTitle;
    }

    /* renamed from: component8, reason: from getter */
    public final TileImageTheme getTheme() {
        return this.theme;
    }

    /* renamed from: component9, reason: from getter */
    public final String getLogo() {
        return this.logo;
    }

    @NotNull
    public final TileImageComponent copy(@NotNull String imageRatio, Badge leftBottomBadge, Badge secondLeftBottomBadge, Paranja paranja, Boolean shouldBlur, String blurPlaceholderImage, String overlayTitle, TileImageTheme theme, String logo, Map<String, TokenizedTrackingInfo> pinchToZoomTrackingInfo, @ProtoOneOfSignature.Container({@ProtoOneOfSignature(name = "image", type = TileItemDTO.ImageDTO.class), @ProtoOneOfSignature(name = "video", type = TileItemDTO.VideoDTO.class)}) @NotNull @ProtoOneOf(label = "type") List<? extends TileItemDTO> items) {
        Intrinsics.checkNotNullParameter(imageRatio, "imageRatio");
        Intrinsics.checkNotNullParameter(items, "items");
        return new TileImageComponent(imageRatio, leftBottomBadge, secondLeftBottomBadge, paranja, shouldBlur, blurPlaceholderImage, overlayTitle, theme, logo, pinchToZoomTrackingInfo, items);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TileImageComponent)) {
            return false;
        }
        TileImageComponent tileImageComponent = (TileImageComponent) other;
        return Intrinsics.d(this.imageRatio, tileImageComponent.imageRatio) && Intrinsics.d(this.leftBottomBadge, tileImageComponent.leftBottomBadge) && Intrinsics.d(this.secondLeftBottomBadge, tileImageComponent.secondLeftBottomBadge) && this.paranja == tileImageComponent.paranja && Intrinsics.d(this.shouldBlur, tileImageComponent.shouldBlur) && Intrinsics.d(this.blurPlaceholderImage, tileImageComponent.blurPlaceholderImage) && Intrinsics.d(this.overlayTitle, tileImageComponent.overlayTitle) && this.theme == tileImageComponent.theme && Intrinsics.d(this.logo, tileImageComponent.logo) && Intrinsics.d(this.pinchToZoomTrackingInfo, tileImageComponent.pinchToZoomTrackingInfo) && Intrinsics.d(this.items, tileImageComponent.items);
    }

    public final String getBlurPlaceholderImage() {
        return this.blurPlaceholderImage;
    }

    @NotNull
    public final String getImageRatio() {
        return this.imageRatio;
    }

    @NotNull
    public final List<TileItemDTO> getItems() {
        return this.items;
    }

    public final Badge getLeftBottomBadge() {
        return this.leftBottomBadge;
    }

    public final String getLogo() {
        return this.logo;
    }

    public final String getOverlayTitle() {
        return this.overlayTitle;
    }

    public final Paranja getParanja() {
        return this.paranja;
    }

    public final Map<String, TokenizedTrackingInfo> getPinchToZoomTrackingInfo() {
        return this.pinchToZoomTrackingInfo;
    }

    public final Badge getSecondLeftBottomBadge() {
        return this.secondLeftBottomBadge;
    }

    public final Boolean getShouldBlur() {
        return this.shouldBlur;
    }

    public final TileImageTheme getTheme() {
        return this.theme;
    }

    public int hashCode() {
        int hashCode = this.imageRatio.hashCode() * 31;
        Badge badge = this.leftBottomBadge;
        int hashCode2 = (hashCode + (badge == null ? 0 : badge.hashCode())) * 31;
        Badge badge2 = this.secondLeftBottomBadge;
        int hashCode3 = (hashCode2 + (badge2 == null ? 0 : badge2.hashCode())) * 31;
        Paranja paranja = this.paranja;
        int hashCode4 = (hashCode3 + (paranja == null ? 0 : paranja.hashCode())) * 31;
        Boolean bool = this.shouldBlur;
        int hashCode5 = (hashCode4 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str = this.blurPlaceholderImage;
        int hashCode6 = (hashCode5 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.overlayTitle;
        int hashCode7 = (hashCode6 + (str2 == null ? 0 : str2.hashCode())) * 31;
        TileImageTheme tileImageTheme = this.theme;
        int hashCode8 = (hashCode7 + (tileImageTheme == null ? 0 : tileImageTheme.hashCode())) * 31;
        String str3 = this.logo;
        int hashCode9 = (hashCode8 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Map<String, TokenizedTrackingInfo> map = this.pinchToZoomTrackingInfo;
        return this.items.hashCode() + ((hashCode9 + (map != null ? map.hashCode() : 0)) * 31);
    }

    @NotNull
    public String toString() {
        String str = this.imageRatio;
        Badge badge = this.leftBottomBadge;
        Badge badge2 = this.secondLeftBottomBadge;
        Paranja paranja = this.paranja;
        Boolean bool = this.shouldBlur;
        String str2 = this.blurPlaceholderImage;
        String str3 = this.overlayTitle;
        TileImageTheme tileImageTheme = this.theme;
        String str4 = this.logo;
        Map<String, TokenizedTrackingInfo> map = this.pinchToZoomTrackingInfo;
        List<TileItemDTO> list = this.items;
        StringBuilder sb2 = new StringBuilder("TileImageComponent(imageRatio=");
        sb2.append(str);
        sb2.append(", leftBottomBadge=");
        sb2.append(badge);
        sb2.append(", secondLeftBottomBadge=");
        sb2.append(badge2);
        sb2.append(", paranja=");
        sb2.append(paranja);
        sb2.append(", shouldBlur=");
        HY.b.c(bool, ", blurPlaceholderImage=", str2, ", overlayTitle=", sb2);
        sb2.append(str3);
        sb2.append(", theme=");
        sb2.append(tileImageTheme);
        sb2.append(", logo=");
        C2638a.e(sb2, str4, ", pinchToZoomTrackingInfo=", map, ", items=");
        return C2618u.h(sb2, list, ")");
    }
}
