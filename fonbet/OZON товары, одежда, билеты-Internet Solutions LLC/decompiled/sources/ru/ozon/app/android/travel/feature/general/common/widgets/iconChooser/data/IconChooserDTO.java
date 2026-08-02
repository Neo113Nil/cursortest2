package ru.ozon.app.android.travel.feature.general.common.widgets.iconChooser.data;

import Fj.c;
import G.g;
import K1.G;
import com.squareup.moshi.j;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.aspect.AspectDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0081\b\u0018\u00002\u00020\u0001:\u0002\"#B=\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0018\u00010\n¢\u0006\u0004\b\r\u0010\u000eJ\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\t\u0010\u0019\u001a\u00020\bHÆ\u0003J\u0017\u0010\u001a\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0018\u00010\nHÆ\u0003JG\u0010\u001b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0018\u00010\nHÆ\u0001J\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001f\u001a\u00020 HÖ\u0001J\t\u0010!\u001a\u00020\u000bHÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u001f\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016¨\u0006$"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/iconChooser/data/IconChooserDTO;", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/text/TextDTO;", "iconSelectors", "", "Lru/ozon/app/android/travel/feature/general/common/widgets/iconChooser/data/IconChooserDTO$IconSelector;", "selectedStyle", "Lru/ozon/app/android/travel/feature/general/common/widgets/iconChooser/data/IconChooserDTO$SelectedStyle;", "trackingInfo", "", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Lru/ozon/uni/atoms/data/text/TextDTO;Ljava/util/List;Lru/ozon/app/android/travel/feature/general/common/widgets/iconChooser/data/IconChooserDTO$SelectedStyle;Ljava/util/Map;)V", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getIconSelectors", "()Ljava/util/List;", "getSelectedStyle", "()Lru/ozon/app/android/travel/feature/general/common/widgets/iconChooser/data/IconChooserDTO$SelectedStyle;", "getTrackingInfo", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "IconSelector", "SelectedStyle", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class IconChooserDTO {
    public static final int $stable = 8;

    @NotNull
    private final List<IconSelector> iconSelectors;

    @NotNull
    private final SelectedStyle selectedStyle;
    private final TextDTO title;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\f\u001a\u00020\u0003H\u0016J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J'\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/iconChooser/data/IconChooserDTO$SelectedStyle;", "", "aspectBorderColor", "", "selectedTypographyToken", "selectedTextColor", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAspectBorderColor", "()Ljava/lang/String;", "getSelectedTypographyToken", "getSelectedTextColor", "toString", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class SelectedStyle {
        public static final int $stable = 0;

        @NotNull
        private final String aspectBorderColor;

        @NotNull
        private final String selectedTextColor;

        @NotNull
        private final String selectedTypographyToken;

        public SelectedStyle(@NotNull String aspectBorderColor, @NotNull String selectedTypographyToken, @NotNull String selectedTextColor) {
            Intrinsics.checkNotNullParameter(aspectBorderColor, "aspectBorderColor");
            Intrinsics.checkNotNullParameter(selectedTypographyToken, "selectedTypographyToken");
            Intrinsics.checkNotNullParameter(selectedTextColor, "selectedTextColor");
            this.aspectBorderColor = aspectBorderColor;
            this.selectedTypographyToken = selectedTypographyToken;
            this.selectedTextColor = selectedTextColor;
        }

        public static /* synthetic */ SelectedStyle copy$default(SelectedStyle selectedStyle, String str, String str2, String str3, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = selectedStyle.aspectBorderColor;
            }
            if ((i11 & 2) != 0) {
                str2 = selectedStyle.selectedTypographyToken;
            }
            if ((i11 & 4) != 0) {
                str3 = selectedStyle.selectedTextColor;
            }
            return selectedStyle.copy(str, str2, str3);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getAspectBorderColor() {
            return this.aspectBorderColor;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final String getSelectedTypographyToken() {
            return this.selectedTypographyToken;
        }

        @NotNull
        /* renamed from: component3, reason: from getter */
        public final String getSelectedTextColor() {
            return this.selectedTextColor;
        }

        @NotNull
        public final SelectedStyle copy(@NotNull String aspectBorderColor, @NotNull String selectedTypographyToken, @NotNull String selectedTextColor) {
            Intrinsics.checkNotNullParameter(aspectBorderColor, "aspectBorderColor");
            Intrinsics.checkNotNullParameter(selectedTypographyToken, "selectedTypographyToken");
            Intrinsics.checkNotNullParameter(selectedTextColor, "selectedTextColor");
            return new SelectedStyle(aspectBorderColor, selectedTypographyToken, selectedTextColor);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SelectedStyle)) {
                return false;
            }
            SelectedStyle selectedStyle = (SelectedStyle) other;
            return Intrinsics.d(this.aspectBorderColor, selectedStyle.aspectBorderColor) && Intrinsics.d(this.selectedTypographyToken, selectedStyle.selectedTypographyToken) && Intrinsics.d(this.selectedTextColor, selectedStyle.selectedTextColor);
        }

        @NotNull
        public final String getAspectBorderColor() {
            return this.aspectBorderColor;
        }

        @NotNull
        public final String getSelectedTextColor() {
            return this.selectedTextColor;
        }

        @NotNull
        public final String getSelectedTypographyToken() {
            return this.selectedTypographyToken;
        }

        public int hashCode() {
            return this.selectedTextColor.hashCode() + g.a(this.aspectBorderColor.hashCode() * 31, 31, this.selectedTypographyToken);
        }

        @NotNull
        public String toString() {
            StringBuilder sb2 = new StringBuilder();
            c.f("@SelectedStyle with aspectBorderColor=", this.aspectBorderColor, ",", sb2);
            c.f("selectedTypographyToken=", this.selectedTypographyToken, ",", sb2);
            sb2.append("selectedTextColor=" + this.selectedTextColor);
            String sb3 = sb2.toString();
            Intrinsics.checkNotNullExpressionValue(sb3, "toString(...)");
            return sb3;
        }
    }

    public IconChooserDTO(TextDTO textDTO, @NotNull List<IconSelector> iconSelectors, @NotNull SelectedStyle selectedStyle, Map<String, TokenizedTrackingInfo> map) {
        Intrinsics.checkNotNullParameter(iconSelectors, "iconSelectors");
        Intrinsics.checkNotNullParameter(selectedStyle, "selectedStyle");
        this.title = textDTO;
        this.iconSelectors = iconSelectors;
        this.selectedStyle = selectedStyle;
        this.trackingInfo = map;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ IconChooserDTO copy$default(IconChooserDTO iconChooserDTO, TextDTO textDTO, List list, SelectedStyle selectedStyle, Map map, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            textDTO = iconChooserDTO.title;
        }
        if ((i11 & 2) != 0) {
            list = iconChooserDTO.iconSelectors;
        }
        if ((i11 & 4) != 0) {
            selectedStyle = iconChooserDTO.selectedStyle;
        }
        if ((i11 & 8) != 0) {
            map = iconChooserDTO.trackingInfo;
        }
        return iconChooserDTO.copy(textDTO, list, selectedStyle, map);
    }

    /* renamed from: component1, reason: from getter */
    public final TextDTO getTitle() {
        return this.title;
    }

    @NotNull
    public final List<IconSelector> component2() {
        return this.iconSelectors;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final SelectedStyle getSelectedStyle() {
        return this.selectedStyle;
    }

    public final Map<String, TokenizedTrackingInfo> component4() {
        return this.trackingInfo;
    }

    @NotNull
    public final IconChooserDTO copy(TextDTO title, @NotNull List<IconSelector> iconSelectors, @NotNull SelectedStyle selectedStyle, Map<String, TokenizedTrackingInfo> trackingInfo) {
        Intrinsics.checkNotNullParameter(iconSelectors, "iconSelectors");
        Intrinsics.checkNotNullParameter(selectedStyle, "selectedStyle");
        return new IconChooserDTO(title, iconSelectors, selectedStyle, trackingInfo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof IconChooserDTO)) {
            return false;
        }
        IconChooserDTO iconChooserDTO = (IconChooserDTO) other;
        return Intrinsics.d(this.title, iconChooserDTO.title) && Intrinsics.d(this.iconSelectors, iconChooserDTO.iconSelectors) && Intrinsics.d(this.selectedStyle, iconChooserDTO.selectedStyle) && Intrinsics.d(this.trackingInfo, iconChooserDTO.trackingInfo);
    }

    @NotNull
    public final List<IconSelector> getIconSelectors() {
        return this.iconSelectors;
    }

    @NotNull
    public final SelectedStyle getSelectedStyle() {
        return this.selectedStyle;
    }

    public final TextDTO getTitle() {
        return this.title;
    }

    public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
        return this.trackingInfo;
    }

    public int hashCode() {
        TextDTO textDTO = this.title;
        int hashCode = (this.selectedStyle.hashCode() + g.b((textDTO == null ? 0 : textDTO.hashCode()) * 31, 31, this.iconSelectors)) * 31;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        return hashCode + (map != null ? map.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        TextDTO textDTO = this.title;
        List<IconSelector> list = this.iconSelectors;
        SelectedStyle selectedStyle = this.selectedStyle;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        StringBuilder e11 = G.e("IconChooserDTO(title=", textDTO, ", iconSelectors=", list, ", selectedStyle=");
        e11.append(selectedStyle);
        e11.append(", trackingInfo=");
        e11.append(map);
        e11.append(")");
        return e11.toString();
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\u0014\u001a\u00020\u0005H\u0016J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0005HÆ\u0003JA\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000f¨\u0006 "}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/iconChooser/data/IconChooserDTO$IconSelector;", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/text/TextDTO;", "androidName", "", "iOSName", "enabledAspect", "Lru/ozon/uni/atoms/data/aspect/AspectDTO;", "notchIcon", "<init>", "(Lru/ozon/uni/atoms/data/text/TextDTO;Ljava/lang/String;Ljava/lang/String;Lru/ozon/uni/atoms/data/aspect/AspectDTO;Ljava/lang/String;)V", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getAndroidName", "()Ljava/lang/String;", "getIOSName", "getEnabledAspect", "()Lru/ozon/uni/atoms/data/aspect/AspectDTO;", "getNotchIcon", "toString", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class IconSelector {
        public static final int $stable = AspectDTO.$stable;

        @NotNull
        private final String androidName;
        private final AspectDTO enabledAspect;
        private final String iOSName;
        private final String notchIcon;

        @NotNull
        private final TextDTO title;

        public IconSelector(@NotNull TextDTO title, @NotNull String androidName, String str, AspectDTO aspectDTO, String str2) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(androidName, "androidName");
            this.title = title;
            this.androidName = androidName;
            this.iOSName = str;
            this.enabledAspect = aspectDTO;
            this.notchIcon = str2;
        }

        public static /* synthetic */ IconSelector copy$default(IconSelector iconSelector, TextDTO textDTO, String str, String str2, AspectDTO aspectDTO, String str3, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                textDTO = iconSelector.title;
            }
            if ((i11 & 2) != 0) {
                str = iconSelector.androidName;
            }
            if ((i11 & 4) != 0) {
                str2 = iconSelector.iOSName;
            }
            if ((i11 & 8) != 0) {
                aspectDTO = iconSelector.enabledAspect;
            }
            if ((i11 & 16) != 0) {
                str3 = iconSelector.notchIcon;
            }
            String str4 = str3;
            String str5 = str2;
            return iconSelector.copy(textDTO, str, str5, aspectDTO, str4);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final TextDTO getTitle() {
            return this.title;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final String getAndroidName() {
            return this.androidName;
        }

        /* renamed from: component3, reason: from getter */
        public final String getIOSName() {
            return this.iOSName;
        }

        /* renamed from: component4, reason: from getter */
        public final AspectDTO getEnabledAspect() {
            return this.enabledAspect;
        }

        /* renamed from: component5, reason: from getter */
        public final String getNotchIcon() {
            return this.notchIcon;
        }

        @NotNull
        public final IconSelector copy(@NotNull TextDTO title, @NotNull String androidName, String iOSName, AspectDTO enabledAspect, String notchIcon) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(androidName, "androidName");
            return new IconSelector(title, androidName, iOSName, enabledAspect, notchIcon);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof IconSelector)) {
                return false;
            }
            IconSelector iconSelector = (IconSelector) other;
            return Intrinsics.d(this.title, iconSelector.title) && Intrinsics.d(this.androidName, iconSelector.androidName) && Intrinsics.d(this.iOSName, iconSelector.iOSName) && Intrinsics.d(this.enabledAspect, iconSelector.enabledAspect) && Intrinsics.d(this.notchIcon, iconSelector.notchIcon);
        }

        @NotNull
        public final String getAndroidName() {
            return this.androidName;
        }

        public final AspectDTO getEnabledAspect() {
            return this.enabledAspect;
        }

        public final String getIOSName() {
            return this.iOSName;
        }

        public final String getNotchIcon() {
            return this.notchIcon;
        }

        @NotNull
        public final TextDTO getTitle() {
            return this.title;
        }

        public int hashCode() {
            int a11 = g.a(this.title.hashCode() * 31, 31, this.androidName);
            String str = this.iOSName;
            int hashCode = (a11 + (str == null ? 0 : str.hashCode())) * 31;
            AspectDTO aspectDTO = this.enabledAspect;
            int hashCode2 = (hashCode + (aspectDTO == null ? 0 : aspectDTO.hashCode())) * 31;
            String str2 = this.notchIcon;
            return hashCode2 + (str2 != null ? str2.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("@IconChooserDTO with title=" + ((Object) this.title.getText()) + ",");
            c.f("androidName=", this.androidName, ",", sb2);
            sb2.append("aspect=" + this.enabledAspect);
            String sb3 = sb2.toString();
            Intrinsics.checkNotNullExpressionValue(sb3, "toString(...)");
            return sb3;
        }

        public /* synthetic */ IconSelector(TextDTO textDTO, String str, String str2, AspectDTO aspectDTO, String str3, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(textDTO, str, (i11 & 4) != 0 ? null : str2, aspectDTO, (i11 & 16) != 0 ? null : str3);
        }
    }
}
