package ru.ozon.app.android.regulardraw.widgets.entryBannerWidget.v1.data;

import C.o0;
import G.g;
import Gl.C3124a;
import Nh.a;
import Ns.b;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.squareup.moshi.j;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0081\b\u0018\u00002\u00020\u0001:\u0001\u0016B\u001f\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0006HÆ\u0003J%\u0010\u000f\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0006HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/regulardraw/widgets/entryBannerWidget/v1/data/EntryBannerWidgetDTO;", "", "banners", "", "Lru/ozon/app/android/regulardraw/widgets/entryBannerWidget/v1/data/EntryBannerWidgetDTO$Banner;", "backgroundColor", "", "<init>", "(Ljava/util/List;Ljava/lang/String;)V", "getBanners", "()Ljava/util/List;", "getBackgroundColor", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "Banner", "regulardraw_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class EntryBannerWidgetDTO {
    public static final int $stable = 8;
    private final String backgroundColor;

    @NotNull
    private final List<Banner> banners;

    @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u001e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u00016Bk\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\r\u001a\u00020\n\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\u0014\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\t\u0010%\u001a\u00020\u0003HÆ\u0003J\t\u0010&\u001a\u00020\u0005HÆ\u0003J\t\u0010'\u001a\u00020\u0003HÆ\u0003J\t\u0010(\u001a\u00020\bHÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\nHÆ\u0003J\t\u0010*\u001a\u00020\nHÆ\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\nHÆ\u0003J\t\u0010,\u001a\u00020\nHÆ\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\u0017\u0010.\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011HÆ\u0003J\u0081\u0001\u0010/\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\u000b\u001a\u00020\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\r\u001a\u00020\n2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0016\b\u0002\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011HÆ\u0001J\u0013\u00100\u001a\u0002012\b\u00102\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00103\u001a\u000204HÖ\u0001J\t\u00105\u001a\u00020\nHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0016R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\u000b\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001dR\u0013\u0010\f\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001dR\u0011\u0010\r\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001dR\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u001f\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$¨\u00067"}, d2 = {"Lru/ozon/app/android/regulardraw/widgets/entryBannerWidget/v1/data/EntryBannerWidgetDTO$Banner;", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/text/TextDTO;", "titleBadge", "Lru/ozon/app/android/regulardraw/widgets/entryBannerWidget/v1/data/EntryBannerWidgetDTO$Banner$TitleBadge;", "subtitle", "badge", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "underImage", "", "animationName", "overImage", "backgroundColor", "action", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "trackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/app/android/regulardraw/widgets/entryBannerWidget/v1/data/EntryBannerWidgetDTO$Banner$TitleBadge;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lru/ozon/uni/atoms/data/AtomActionDTO;Ljava/util/Map;)V", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getTitleBadge", "()Lru/ozon/app/android/regulardraw/widgets/entryBannerWidget/v1/data/EntryBannerWidgetDTO$Banner$TitleBadge;", "getSubtitle", "getBadge", "()Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "getUnderImage", "()Ljava/lang/String;", "getAnimationName", "getOverImage", "getBackgroundColor", "getAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "getTrackingInfo", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "copy", "equals", "", "other", "hashCode", "", "toString", "TitleBadge", "regulardraw_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @j(generateAdapter = true)
    public static final /* data */ class Banner {
        public static final int $stable = 8;
        private final AtomActionDTO action;

        @NotNull
        private final String animationName;

        @NotNull
        private final String backgroundColor;

        @NotNull
        private final BadgeDTO badge;
        private final String overImage;

        @NotNull
        private final TextDTO subtitle;

        @NotNull
        private final TextDTO title;

        @NotNull
        private final TitleBadge titleBadge;
        private final Map<String, TokenizedTrackingInfo> trackingInfo;
        private final String underImage;

        @j(generateAdapter = true)
        @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\f¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/regulardraw/widgets/entryBannerWidget/v1/data/EntryBannerWidgetDTO$Banner$TitleBadge;", "", "text", "Lru/ozon/uni/atoms/data/text/TextDTO;", "icon", "", "backgroundColor", "<init>", "(Lru/ozon/uni/atoms/data/text/TextDTO;Ljava/lang/String;Ljava/lang/String;)V", "getText", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getIcon", "()Ljava/lang/String;", "getBackgroundColor", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "regulardraw_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class TitleBadge {
            public static final int $stable = 0;

            @NotNull
            private final String backgroundColor;

            @NotNull
            private final String icon;

            @NotNull
            private final TextDTO text;

            public TitleBadge(@NotNull TextDTO text, @NotNull String icon, @NotNull String backgroundColor) {
                Intrinsics.checkNotNullParameter(text, "text");
                Intrinsics.checkNotNullParameter(icon, "icon");
                Intrinsics.checkNotNullParameter(backgroundColor, "backgroundColor");
                this.text = text;
                this.icon = icon;
                this.backgroundColor = backgroundColor;
            }

            public static /* synthetic */ TitleBadge copy$default(TitleBadge titleBadge, TextDTO textDTO, String str, String str2, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    textDTO = titleBadge.text;
                }
                if ((i11 & 2) != 0) {
                    str = titleBadge.icon;
                }
                if ((i11 & 4) != 0) {
                    str2 = titleBadge.backgroundColor;
                }
                return titleBadge.copy(textDTO, str, str2);
            }

            @NotNull
            /* renamed from: component1, reason: from getter */
            public final TextDTO getText() {
                return this.text;
            }

            @NotNull
            /* renamed from: component2, reason: from getter */
            public final String getIcon() {
                return this.icon;
            }

            @NotNull
            /* renamed from: component3, reason: from getter */
            public final String getBackgroundColor() {
                return this.backgroundColor;
            }

            @NotNull
            public final TitleBadge copy(@NotNull TextDTO text, @NotNull String icon, @NotNull String backgroundColor) {
                Intrinsics.checkNotNullParameter(text, "text");
                Intrinsics.checkNotNullParameter(icon, "icon");
                Intrinsics.checkNotNullParameter(backgroundColor, "backgroundColor");
                return new TitleBadge(text, icon, backgroundColor);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof TitleBadge)) {
                    return false;
                }
                TitleBadge titleBadge = (TitleBadge) other;
                return Intrinsics.d(this.text, titleBadge.text) && Intrinsics.d(this.icon, titleBadge.icon) && Intrinsics.d(this.backgroundColor, titleBadge.backgroundColor);
            }

            @NotNull
            public final String getBackgroundColor() {
                return this.backgroundColor;
            }

            @NotNull
            public final String getIcon() {
                return this.icon;
            }

            @NotNull
            public final TextDTO getText() {
                return this.text;
            }

            public int hashCode() {
                return this.backgroundColor.hashCode() + g.a(this.text.hashCode() * 31, 31, this.icon);
            }

            @NotNull
            public String toString() {
                TextDTO textDTO = this.text;
                String str = this.icon;
                return o0.c(D3.g.f("TitleBadge(text=", textDTO, ", icon=", str, ", backgroundColor="), this.backgroundColor, ")");
            }
        }

        public Banner(@NotNull TextDTO title, @NotNull TitleBadge titleBadge, @NotNull TextDTO subtitle, @NotNull BadgeDTO badge, String str, @NotNull String animationName, String str2, @NotNull String backgroundColor, AtomActionDTO atomActionDTO, Map<String, TokenizedTrackingInfo> map) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(titleBadge, "titleBadge");
            Intrinsics.checkNotNullParameter(subtitle, "subtitle");
            Intrinsics.checkNotNullParameter(badge, "badge");
            Intrinsics.checkNotNullParameter(animationName, "animationName");
            Intrinsics.checkNotNullParameter(backgroundColor, "backgroundColor");
            this.title = title;
            this.titleBadge = titleBadge;
            this.subtitle = subtitle;
            this.badge = badge;
            this.underImage = str;
            this.animationName = animationName;
            this.overImage = str2;
            this.backgroundColor = backgroundColor;
            this.action = atomActionDTO;
            this.trackingInfo = map;
        }

        public static /* synthetic */ Banner copy$default(Banner banner, TextDTO textDTO, TitleBadge titleBadge, TextDTO textDTO2, BadgeDTO badgeDTO, String str, String str2, String str3, String str4, AtomActionDTO atomActionDTO, Map map, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                textDTO = banner.title;
            }
            if ((i11 & 2) != 0) {
                titleBadge = banner.titleBadge;
            }
            if ((i11 & 4) != 0) {
                textDTO2 = banner.subtitle;
            }
            if ((i11 & 8) != 0) {
                badgeDTO = banner.badge;
            }
            if ((i11 & 16) != 0) {
                str = banner.underImage;
            }
            if ((i11 & 32) != 0) {
                str2 = banner.animationName;
            }
            if ((i11 & 64) != 0) {
                str3 = banner.overImage;
            }
            if ((i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
                str4 = banner.backgroundColor;
            }
            if ((i11 & 256) != 0) {
                atomActionDTO = banner.action;
            }
            if ((i11 & UserVerificationMethods.USER_VERIFY_NONE) != 0) {
                map = banner.trackingInfo;
            }
            AtomActionDTO atomActionDTO2 = atomActionDTO;
            Map map2 = map;
            String str5 = str3;
            String str6 = str4;
            String str7 = str;
            String str8 = str2;
            return banner.copy(textDTO, titleBadge, textDTO2, badgeDTO, str7, str8, str5, str6, atomActionDTO2, map2);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final TextDTO getTitle() {
            return this.title;
        }

        public final Map<String, TokenizedTrackingInfo> component10() {
            return this.trackingInfo;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final TitleBadge getTitleBadge() {
            return this.titleBadge;
        }

        @NotNull
        /* renamed from: component3, reason: from getter */
        public final TextDTO getSubtitle() {
            return this.subtitle;
        }

        @NotNull
        /* renamed from: component4, reason: from getter */
        public final BadgeDTO getBadge() {
            return this.badge;
        }

        /* renamed from: component5, reason: from getter */
        public final String getUnderImage() {
            return this.underImage;
        }

        @NotNull
        /* renamed from: component6, reason: from getter */
        public final String getAnimationName() {
            return this.animationName;
        }

        /* renamed from: component7, reason: from getter */
        public final String getOverImage() {
            return this.overImage;
        }

        @NotNull
        /* renamed from: component8, reason: from getter */
        public final String getBackgroundColor() {
            return this.backgroundColor;
        }

        /* renamed from: component9, reason: from getter */
        public final AtomActionDTO getAction() {
            return this.action;
        }

        @NotNull
        public final Banner copy(@NotNull TextDTO title, @NotNull TitleBadge titleBadge, @NotNull TextDTO subtitle, @NotNull BadgeDTO badge, String underImage, @NotNull String animationName, String overImage, @NotNull String backgroundColor, AtomActionDTO action, Map<String, TokenizedTrackingInfo> trackingInfo) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(titleBadge, "titleBadge");
            Intrinsics.checkNotNullParameter(subtitle, "subtitle");
            Intrinsics.checkNotNullParameter(badge, "badge");
            Intrinsics.checkNotNullParameter(animationName, "animationName");
            Intrinsics.checkNotNullParameter(backgroundColor, "backgroundColor");
            return new Banner(title, titleBadge, subtitle, badge, underImage, animationName, overImage, backgroundColor, action, trackingInfo);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Banner)) {
                return false;
            }
            Banner banner = (Banner) other;
            return Intrinsics.d(this.title, banner.title) && Intrinsics.d(this.titleBadge, banner.titleBadge) && Intrinsics.d(this.subtitle, banner.subtitle) && Intrinsics.d(this.badge, banner.badge) && Intrinsics.d(this.underImage, banner.underImage) && Intrinsics.d(this.animationName, banner.animationName) && Intrinsics.d(this.overImage, banner.overImage) && Intrinsics.d(this.backgroundColor, banner.backgroundColor) && Intrinsics.d(this.action, banner.action) && Intrinsics.d(this.trackingInfo, banner.trackingInfo);
        }

        public final AtomActionDTO getAction() {
            return this.action;
        }

        @NotNull
        public final String getAnimationName() {
            return this.animationName;
        }

        @NotNull
        public final String getBackgroundColor() {
            return this.backgroundColor;
        }

        @NotNull
        public final BadgeDTO getBadge() {
            return this.badge;
        }

        public final String getOverImage() {
            return this.overImage;
        }

        @NotNull
        public final TextDTO getSubtitle() {
            return this.subtitle;
        }

        @NotNull
        public final TextDTO getTitle() {
            return this.title;
        }

        @NotNull
        public final TitleBadge getTitleBadge() {
            return this.titleBadge;
        }

        public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
            return this.trackingInfo;
        }

        public final String getUnderImage() {
            return this.underImage;
        }

        public int hashCode() {
            int c11 = C3124a.c(this.badge, b.a(this.subtitle, (this.titleBadge.hashCode() + (this.title.hashCode() * 31)) * 31, 31), 31);
            String str = this.underImage;
            int a11 = g.a((c11 + (str == null ? 0 : str.hashCode())) * 31, 31, this.animationName);
            String str2 = this.overImage;
            int a12 = g.a((a11 + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.backgroundColor);
            AtomActionDTO atomActionDTO = this.action;
            int hashCode = (a12 + (atomActionDTO == null ? 0 : atomActionDTO.hashCode())) * 31;
            Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
            return hashCode + (map != null ? map.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            TextDTO textDTO = this.title;
            TitleBadge titleBadge = this.titleBadge;
            TextDTO textDTO2 = this.subtitle;
            BadgeDTO badgeDTO = this.badge;
            String str = this.underImage;
            String str2 = this.animationName;
            String str3 = this.overImage;
            String str4 = this.backgroundColor;
            AtomActionDTO atomActionDTO = this.action;
            Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
            StringBuilder sb2 = new StringBuilder("Banner(title=");
            sb2.append(textDTO);
            sb2.append(", titleBadge=");
            sb2.append(titleBadge);
            sb2.append(", subtitle=");
            sb2.append(textDTO2);
            sb2.append(", badge=");
            sb2.append(badgeDTO);
            sb2.append(", underImage=");
            a.h(sb2, str, ", animationName=", str2, ", overImage=");
            a.h(sb2, str3, ", backgroundColor=", str4, ", action=");
            return D40.a.d(sb2, atomActionDTO, ", trackingInfo=", map, ")");
        }
    }

    public EntryBannerWidgetDTO(@NotNull List<Banner> banners, String str) {
        Intrinsics.checkNotNullParameter(banners, "banners");
        this.banners = banners;
        this.backgroundColor = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ EntryBannerWidgetDTO copy$default(EntryBannerWidgetDTO entryBannerWidgetDTO, List list, String str, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = entryBannerWidgetDTO.banners;
        }
        if ((i11 & 2) != 0) {
            str = entryBannerWidgetDTO.backgroundColor;
        }
        return entryBannerWidgetDTO.copy(list, str);
    }

    @NotNull
    public final List<Banner> component1() {
        return this.banners;
    }

    /* renamed from: component2, reason: from getter */
    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    @NotNull
    public final EntryBannerWidgetDTO copy(@NotNull List<Banner> banners, String backgroundColor) {
        Intrinsics.checkNotNullParameter(banners, "banners");
        return new EntryBannerWidgetDTO(banners, backgroundColor);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EntryBannerWidgetDTO)) {
            return false;
        }
        EntryBannerWidgetDTO entryBannerWidgetDTO = (EntryBannerWidgetDTO) other;
        return Intrinsics.d(this.banners, entryBannerWidgetDTO.banners) && Intrinsics.d(this.backgroundColor, entryBannerWidgetDTO.backgroundColor);
    }

    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    @NotNull
    public final List<Banner> getBanners() {
        return this.banners;
    }

    public int hashCode() {
        int hashCode = this.banners.hashCode() * 31;
        String str = this.backgroundColor;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    @NotNull
    public String toString() {
        return Bi.b.e("EntryBannerWidgetDTO(banners=", ", backgroundColor=", this.backgroundColor, ")", this.banners);
    }
}
