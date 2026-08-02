package io.intercom.android.sdk.models;

import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.facebook.share.internal.ShareConstants;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OpenMessengerResponse.kt */
@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\"\n\u0002\u0010\b\n\u0002\b\u0004\b\u0081\b\u0018\u00002\u00020\u0001:\u000234Ba\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\u0006\u0010\u000f\u001a\u00020\f\u0012\u0006\u0010\u0010\u001a\u00020\f¢\u0006\u0004\b\u0011\u0010\u0012J\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\t\u0010#\u001a\u00020\u0003HÆ\u0003J\t\u0010$\u001a\u00020\u0003HÆ\u0003J\t\u0010%\u001a\u00020\u0003HÆ\u0003J\t\u0010&\u001a\u00020\u0003HÆ\u0003J\t\u0010'\u001a\u00020\u0003HÆ\u0003J\t\u0010(\u001a\u00020\nHÆ\u0003J\t\u0010)\u001a\u00020\fHÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u000eHÆ\u0003J\t\u0010+\u001a\u00020\fHÆ\u0003J\t\u0010,\u001a\u00020\fHÆ\u0003Jy\u0010-\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\f2\b\b\u0002\u0010\u0010\u001a\u00020\fHÇ\u0001J\u0013\u0010.\u001a\u00020\f2\b\u0010/\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u00100\u001a\u000201H×\u0001J\t\u00102\u001a\u00020\u0003H×\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0014R\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0014R\u0016\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0014R\u0016\u0010\b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0014R\u0016\u0010\t\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0016\u0010\u000b\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0018\u0010\r\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0016\u0010\u000f\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001dR\u0016\u0010\u0010\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001d¨\u00065"}, d2 = {"Lio/intercom/android/sdk/models/Header;", "", "backgroundColor", "", "backgroundColorDark", "foregroundPrimaryColor", "foregroundPrimaryColorDark", "foregroundSecondaryColor", "foregroundSecondaryColorDark", "collapsed", "Lio/intercom/android/sdk/models/Header$Collapsed;", "displayActiveIndicator", "", "expanded", "Lio/intercom/android/sdk/models/Header$Expanded;", "useBotHeader", "hideGreeting", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lio/intercom/android/sdk/models/Header$Collapsed;ZLio/intercom/android/sdk/models/Header$Expanded;ZZ)V", "getBackgroundColor", "()Ljava/lang/String;", "getBackgroundColorDark", "getForegroundPrimaryColor", "getForegroundPrimaryColorDark", "getForegroundSecondaryColor", "getForegroundSecondaryColorDark", "getCollapsed", "()Lio/intercom/android/sdk/models/Header$Collapsed;", "getDisplayActiveIndicator", "()Z", "getExpanded", "()Lio/intercom/android/sdk/models/Header$Expanded;", "getUseBotHeader", "getHideGreeting", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "copy", "equals", "other", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "Collapsed", "Expanded", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class Header {
    public static final int $stable = 8;

    @SerializedName("background_color")
    private final String backgroundColor;

    @SerializedName("background_color_dark")
    private final String backgroundColorDark;

    @SerializedName("collapsed")
    private final Collapsed collapsed;

    @SerializedName("display_active_indicator")
    private final boolean displayActiveIndicator;

    @SerializedName("expanded")
    private final Expanded expanded;

    @SerializedName("foreground_primary_color")
    private final String foregroundPrimaryColor;

    @SerializedName("foreground_primary_color_dark")
    private final String foregroundPrimaryColorDark;

    @SerializedName("foreground_secondary_color")
    private final String foregroundSecondaryColor;

    @SerializedName("foreground_secondary_color_dark")
    private final String foregroundSecondaryColorDark;

    @SerializedName("hide_greeting")
    private final boolean hideGreeting;

    @SerializedName("use_bot_header")
    private final boolean useBotHeader;

    public static /* synthetic */ Header copy$default(Header header, String str, String str2, String str3, String str4, String str5, String str6, Collapsed collapsed, boolean z, Expanded expanded, boolean z2, boolean z3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = header.backgroundColor;
        }
        if ((i & 2) != 0) {
            str2 = header.backgroundColorDark;
        }
        if ((i & 4) != 0) {
            str3 = header.foregroundPrimaryColor;
        }
        if ((i & 8) != 0) {
            str4 = header.foregroundPrimaryColorDark;
        }
        if ((i & 16) != 0) {
            str5 = header.foregroundSecondaryColor;
        }
        if ((i & 32) != 0) {
            str6 = header.foregroundSecondaryColorDark;
        }
        if ((i & 64) != 0) {
            collapsed = header.collapsed;
        }
        if ((i & 128) != 0) {
            z = header.displayActiveIndicator;
        }
        if ((i & 256) != 0) {
            expanded = header.expanded;
        }
        if ((i & 512) != 0) {
            z2 = header.useBotHeader;
        }
        if ((i & 1024) != 0) {
            z3 = header.hideGreeting;
        }
        boolean z4 = z2;
        boolean z5 = z3;
        boolean z6 = z;
        Expanded expanded2 = expanded;
        String str7 = str6;
        Collapsed collapsed2 = collapsed;
        String str8 = str5;
        String str9 = str3;
        return header.copy(str, str2, str9, str4, str8, str7, collapsed2, z6, expanded2, z4, z5);
    }

    /* renamed from: component1, reason: from getter */
    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    /* renamed from: component10, reason: from getter */
    public final boolean getUseBotHeader() {
        return this.useBotHeader;
    }

    /* renamed from: component11, reason: from getter */
    public final boolean getHideGreeting() {
        return this.hideGreeting;
    }

    /* renamed from: component2, reason: from getter */
    public final String getBackgroundColorDark() {
        return this.backgroundColorDark;
    }

    /* renamed from: component3, reason: from getter */
    public final String getForegroundPrimaryColor() {
        return this.foregroundPrimaryColor;
    }

    /* renamed from: component4, reason: from getter */
    public final String getForegroundPrimaryColorDark() {
        return this.foregroundPrimaryColorDark;
    }

    /* renamed from: component5, reason: from getter */
    public final String getForegroundSecondaryColor() {
        return this.foregroundSecondaryColor;
    }

    /* renamed from: component6, reason: from getter */
    public final String getForegroundSecondaryColorDark() {
        return this.foregroundSecondaryColorDark;
    }

    /* renamed from: component7, reason: from getter */
    public final Collapsed getCollapsed() {
        return this.collapsed;
    }

    /* renamed from: component8, reason: from getter */
    public final boolean getDisplayActiveIndicator() {
        return this.displayActiveIndicator;
    }

    /* renamed from: component9, reason: from getter */
    public final Expanded getExpanded() {
        return this.expanded;
    }

    public final Header copy(String backgroundColor, String backgroundColorDark, String foregroundPrimaryColor, String foregroundPrimaryColorDark, String foregroundSecondaryColor, String foregroundSecondaryColorDark, Collapsed collapsed, boolean displayActiveIndicator, Expanded expanded, boolean useBotHeader, boolean hideGreeting) {
        Intrinsics.checkNotNullParameter(backgroundColor, "backgroundColor");
        Intrinsics.checkNotNullParameter(backgroundColorDark, "backgroundColorDark");
        Intrinsics.checkNotNullParameter(foregroundPrimaryColor, "foregroundPrimaryColor");
        Intrinsics.checkNotNullParameter(foregroundPrimaryColorDark, "foregroundPrimaryColorDark");
        Intrinsics.checkNotNullParameter(foregroundSecondaryColor, "foregroundSecondaryColor");
        Intrinsics.checkNotNullParameter(foregroundSecondaryColorDark, "foregroundSecondaryColorDark");
        Intrinsics.checkNotNullParameter(collapsed, "collapsed");
        return new Header(backgroundColor, backgroundColorDark, foregroundPrimaryColor, foregroundPrimaryColorDark, foregroundSecondaryColor, foregroundSecondaryColorDark, collapsed, displayActiveIndicator, expanded, useBotHeader, hideGreeting);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Header)) {
            return false;
        }
        Header header = (Header) other;
        return Intrinsics.areEqual(this.backgroundColor, header.backgroundColor) && Intrinsics.areEqual(this.backgroundColorDark, header.backgroundColorDark) && Intrinsics.areEqual(this.foregroundPrimaryColor, header.foregroundPrimaryColor) && Intrinsics.areEqual(this.foregroundPrimaryColorDark, header.foregroundPrimaryColorDark) && Intrinsics.areEqual(this.foregroundSecondaryColor, header.foregroundSecondaryColor) && Intrinsics.areEqual(this.foregroundSecondaryColorDark, header.foregroundSecondaryColorDark) && Intrinsics.areEqual(this.collapsed, header.collapsed) && this.displayActiveIndicator == header.displayActiveIndicator && Intrinsics.areEqual(this.expanded, header.expanded) && this.useBotHeader == header.useBotHeader && this.hideGreeting == header.hideGreeting;
    }

    public int hashCode() {
        int hashCode = ((((((((((((((this.backgroundColor.hashCode() * 31) + this.backgroundColorDark.hashCode()) * 31) + this.foregroundPrimaryColor.hashCode()) * 31) + this.foregroundPrimaryColorDark.hashCode()) * 31) + this.foregroundSecondaryColor.hashCode()) * 31) + this.foregroundSecondaryColorDark.hashCode()) * 31) + this.collapsed.hashCode()) * 31) + Boolean.hashCode(this.displayActiveIndicator)) * 31;
        Expanded expanded = this.expanded;
        return ((((hashCode + (expanded == null ? 0 : expanded.hashCode())) * 31) + Boolean.hashCode(this.useBotHeader)) * 31) + Boolean.hashCode(this.hideGreeting);
    }

    public String toString() {
        return "Header(backgroundColor=" + this.backgroundColor + ", backgroundColorDark=" + this.backgroundColorDark + ", foregroundPrimaryColor=" + this.foregroundPrimaryColor + ", foregroundPrimaryColorDark=" + this.foregroundPrimaryColorDark + ", foregroundSecondaryColor=" + this.foregroundSecondaryColor + ", foregroundSecondaryColorDark=" + this.foregroundSecondaryColorDark + ", collapsed=" + this.collapsed + ", displayActiveIndicator=" + this.displayActiveIndicator + ", expanded=" + this.expanded + ", useBotHeader=" + this.useBotHeader + ", hideGreeting=" + this.hideGreeting + ')';
    }

    public Header(String backgroundColor, String backgroundColorDark, String foregroundPrimaryColor, String foregroundPrimaryColorDark, String foregroundSecondaryColor, String foregroundSecondaryColorDark, Collapsed collapsed, boolean z, Expanded expanded, boolean z2, boolean z3) {
        Intrinsics.checkNotNullParameter(backgroundColor, "backgroundColor");
        Intrinsics.checkNotNullParameter(backgroundColorDark, "backgroundColorDark");
        Intrinsics.checkNotNullParameter(foregroundPrimaryColor, "foregroundPrimaryColor");
        Intrinsics.checkNotNullParameter(foregroundPrimaryColorDark, "foregroundPrimaryColorDark");
        Intrinsics.checkNotNullParameter(foregroundSecondaryColor, "foregroundSecondaryColor");
        Intrinsics.checkNotNullParameter(foregroundSecondaryColorDark, "foregroundSecondaryColorDark");
        Intrinsics.checkNotNullParameter(collapsed, "collapsed");
        this.backgroundColor = backgroundColor;
        this.backgroundColorDark = backgroundColorDark;
        this.foregroundPrimaryColor = foregroundPrimaryColor;
        this.foregroundPrimaryColorDark = foregroundPrimaryColorDark;
        this.foregroundSecondaryColor = foregroundSecondaryColor;
        this.foregroundSecondaryColorDark = foregroundSecondaryColorDark;
        this.collapsed = collapsed;
        this.displayActiveIndicator = z;
        this.expanded = expanded;
        this.useBotHeader = z2;
        this.hideGreeting = z3;
    }

    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    public final String getBackgroundColorDark() {
        return this.backgroundColorDark;
    }

    public final String getForegroundPrimaryColor() {
        return this.foregroundPrimaryColor;
    }

    public final String getForegroundPrimaryColorDark() {
        return this.foregroundPrimaryColorDark;
    }

    public final String getForegroundSecondaryColor() {
        return this.foregroundSecondaryColor;
    }

    public final String getForegroundSecondaryColorDark() {
        return this.foregroundSecondaryColorDark;
    }

    public final Collapsed getCollapsed() {
        return this.collapsed;
    }

    public final boolean getDisplayActiveIndicator() {
        return this.displayActiveIndicator;
    }

    public final Expanded getExpanded() {
        return this.expanded;
    }

    public final boolean getUseBotHeader() {
        return this.useBotHeader;
    }

    public final boolean getHideGreeting() {
        return this.hideGreeting;
    }

    /* compiled from: OpenMessengerResponse.kt */
    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u001dB-\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0007HÆ\u0003J7\u0010\u0016\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\u0007HÇ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010\u001a\u001a\u00020\u001bH×\u0001J\t\u0010\u001c\u001a\u00020\u0007H×\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010¨\u0006\u001e"}, d2 = {"Lio/intercom/android/sdk/models/Header$Collapsed;", "", "avatarDetails", "Lio/intercom/android/sdk/models/AvatarDetails;", "icon", "Lio/intercom/android/sdk/models/Header$Collapsed$HeaderIconType;", "subtitle", "", "title", "<init>", "(Lio/intercom/android/sdk/models/AvatarDetails;Lio/intercom/android/sdk/models/Header$Collapsed$HeaderIconType;Ljava/lang/String;Ljava/lang/String;)V", "getAvatarDetails", "()Lio/intercom/android/sdk/models/AvatarDetails;", "getIcon", "()Lio/intercom/android/sdk/models/Header$Collapsed$HeaderIconType;", "getSubtitle", "()Ljava/lang/String;", "getTitle", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "HeaderIconType", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Collapsed {
        public static final int $stable = 8;

        @SerializedName("avatar_details")
        private final AvatarDetails avatarDetails;

        @SerializedName("icon")
        private final HeaderIconType icon;

        @SerializedName("subtitle")
        private final String subtitle;

        @SerializedName("title")
        private final String title;

        public static /* synthetic */ Collapsed copy$default(Collapsed collapsed, AvatarDetails avatarDetails, HeaderIconType headerIconType, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                avatarDetails = collapsed.avatarDetails;
            }
            if ((i & 2) != 0) {
                headerIconType = collapsed.icon;
            }
            if ((i & 4) != 0) {
                str = collapsed.subtitle;
            }
            if ((i & 8) != 0) {
                str2 = collapsed.title;
            }
            return collapsed.copy(avatarDetails, headerIconType, str, str2);
        }

        /* renamed from: component1, reason: from getter */
        public final AvatarDetails getAvatarDetails() {
            return this.avatarDetails;
        }

        /* renamed from: component2, reason: from getter */
        public final HeaderIconType getIcon() {
            return this.icon;
        }

        /* renamed from: component3, reason: from getter */
        public final String getSubtitle() {
            return this.subtitle;
        }

        /* renamed from: component4, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        public final Collapsed copy(AvatarDetails avatarDetails, HeaderIconType icon, String subtitle, String title) {
            Intrinsics.checkNotNullParameter(title, "title");
            return new Collapsed(avatarDetails, icon, subtitle, title);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Collapsed)) {
                return false;
            }
            Collapsed collapsed = (Collapsed) other;
            return Intrinsics.areEqual(this.avatarDetails, collapsed.avatarDetails) && this.icon == collapsed.icon && Intrinsics.areEqual(this.subtitle, collapsed.subtitle) && Intrinsics.areEqual(this.title, collapsed.title);
        }

        public int hashCode() {
            AvatarDetails avatarDetails = this.avatarDetails;
            int hashCode = (avatarDetails == null ? 0 : avatarDetails.hashCode()) * 31;
            HeaderIconType headerIconType = this.icon;
            int hashCode2 = (hashCode + (headerIconType == null ? 0 : headerIconType.hashCode())) * 31;
            String str = this.subtitle;
            return ((hashCode2 + (str != null ? str.hashCode() : 0)) * 31) + this.title.hashCode();
        }

        public String toString() {
            return "Collapsed(avatarDetails=" + this.avatarDetails + ", icon=" + this.icon + ", subtitle=" + this.subtitle + ", title=" + this.title + ')';
        }

        public Collapsed(AvatarDetails avatarDetails, HeaderIconType headerIconType, String str, String title) {
            Intrinsics.checkNotNullParameter(title, "title");
            this.avatarDetails = avatarDetails;
            this.icon = headerIconType;
            this.subtitle = str;
            this.title = title;
        }

        public final AvatarDetails getAvatarDetails() {
            return this.avatarDetails;
        }

        public final HeaderIconType getIcon() {
            return this.icon;
        }

        public final String getSubtitle() {
            return this.subtitle;
        }

        public final String getTitle() {
            return this.title;
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: OpenMessengerResponse.kt */
        @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lio/intercom/android/sdk/models/Header$Collapsed$HeaderIconType;", "", "<init>", "(Ljava/lang/String;I)V", "CLOCK", "AI", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class HeaderIconType {
            private static final /* synthetic */ EnumEntries $ENTRIES;
            private static final /* synthetic */ HeaderIconType[] $VALUES;

            @SerializedName("clock")
            public static final HeaderIconType CLOCK = new HeaderIconType("CLOCK", 0);

            @SerializedName("ai")
            public static final HeaderIconType AI = new HeaderIconType("AI", 1);

            private static final /* synthetic */ HeaderIconType[] $values() {
                return new HeaderIconType[]{CLOCK, AI};
            }

            public static EnumEntries<HeaderIconType> getEntries() {
                return $ENTRIES;
            }

            private HeaderIconType(String str, int i) {
            }

            static {
                HeaderIconType[] $values = $values();
                $VALUES = $values;
                $ENTRIES = EnumEntriesKt.enumEntries($values);
            }

            public static HeaderIconType valueOf(String str) {
                return (HeaderIconType) Enum.valueOf(HeaderIconType.class, str);
            }

            public static HeaderIconType[] values() {
                return (HeaderIconType[]) $VALUES.clone();
            }
        }
    }

    /* compiled from: OpenMessengerResponse.kt */
    @kotlin.Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001:\u0004#$%&BC\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0005\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0005\u0012\u0006\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\u000f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\b0\u0005HÆ\u0003J\u000f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\n0\u0005HÆ\u0003J\t\u0010\u001b\u001a\u00020\fHÆ\u0003JO\u0010\u001c\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u00052\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00052\b\b\u0002\u0010\u000b\u001a\u00020\fHÇ\u0001J\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010 \u001a\u00020!H×\u0001J\t\u0010\"\u001a\u00020\fH×\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u001c\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0012R\u0016\u0010\u000b\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016¨\u0006'"}, d2 = {"Lio/intercom/android/sdk/models/Header$Expanded;", "", "avatarDetails", "Lio/intercom/android/sdk/models/AvatarDetails;", "body", "", "Lio/intercom/android/sdk/models/Header$Expanded$Body;", "footer", "Lio/intercom/android/sdk/models/Header$Expanded$Footer;", "socialAccounts", "Lio/intercom/android/sdk/models/Header$Expanded$SocialAccount;", "title", "", "<init>", "(Lio/intercom/android/sdk/models/AvatarDetails;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/lang/String;)V", "getAvatarDetails", "()Lio/intercom/android/sdk/models/AvatarDetails;", "getBody", "()Ljava/util/List;", "getFooter", "getSocialAccounts", "getTitle", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "Body", "Footer", "SocialAccount", "Style", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Expanded {
        public static final int $stable = 8;

        @SerializedName("avatar_details")
        private final AvatarDetails avatarDetails;

        @SerializedName("body")
        private final List<Body> body;

        @SerializedName("footer")
        private final List<Footer> footer;

        @SerializedName("social_accounts")
        private final List<SocialAccount> socialAccounts;

        @SerializedName("title")
        private final String title;

        public static /* synthetic */ Expanded copy$default(Expanded expanded, AvatarDetails avatarDetails, List list, List list2, List list3, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                avatarDetails = expanded.avatarDetails;
            }
            if ((i & 2) != 0) {
                list = expanded.body;
            }
            if ((i & 4) != 0) {
                list2 = expanded.footer;
            }
            if ((i & 8) != 0) {
                list3 = expanded.socialAccounts;
            }
            if ((i & 16) != 0) {
                str = expanded.title;
            }
            String str2 = str;
            List list4 = list2;
            return expanded.copy(avatarDetails, list, list4, list3, str2);
        }

        /* renamed from: component1, reason: from getter */
        public final AvatarDetails getAvatarDetails() {
            return this.avatarDetails;
        }

        public final List<Body> component2() {
            return this.body;
        }

        public final List<Footer> component3() {
            return this.footer;
        }

        public final List<SocialAccount> component4() {
            return this.socialAccounts;
        }

        /* renamed from: component5, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        public final Expanded copy(AvatarDetails avatarDetails, List<Body> body, List<Footer> footer, List<SocialAccount> socialAccounts, String title) {
            Intrinsics.checkNotNullParameter(body, "body");
            Intrinsics.checkNotNullParameter(footer, "footer");
            Intrinsics.checkNotNullParameter(socialAccounts, "socialAccounts");
            Intrinsics.checkNotNullParameter(title, "title");
            return new Expanded(avatarDetails, body, footer, socialAccounts, title);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Expanded)) {
                return false;
            }
            Expanded expanded = (Expanded) other;
            return Intrinsics.areEqual(this.avatarDetails, expanded.avatarDetails) && Intrinsics.areEqual(this.body, expanded.body) && Intrinsics.areEqual(this.footer, expanded.footer) && Intrinsics.areEqual(this.socialAccounts, expanded.socialAccounts) && Intrinsics.areEqual(this.title, expanded.title);
        }

        public int hashCode() {
            AvatarDetails avatarDetails = this.avatarDetails;
            return ((((((((avatarDetails == null ? 0 : avatarDetails.hashCode()) * 31) + this.body.hashCode()) * 31) + this.footer.hashCode()) * 31) + this.socialAccounts.hashCode()) * 31) + this.title.hashCode();
        }

        public String toString() {
            return "Expanded(avatarDetails=" + this.avatarDetails + ", body=" + this.body + ", footer=" + this.footer + ", socialAccounts=" + this.socialAccounts + ", title=" + this.title + ')';
        }

        public Expanded(AvatarDetails avatarDetails, List<Body> body, List<Footer> footer, List<SocialAccount> socialAccounts, String title) {
            Intrinsics.checkNotNullParameter(body, "body");
            Intrinsics.checkNotNullParameter(footer, "footer");
            Intrinsics.checkNotNullParameter(socialAccounts, "socialAccounts");
            Intrinsics.checkNotNullParameter(title, "title");
            this.avatarDetails = avatarDetails;
            this.body = body;
            this.footer = footer;
            this.socialAccounts = socialAccounts;
            this.title = title;
        }

        public final AvatarDetails getAvatarDetails() {
            return this.avatarDetails;
        }

        public final List<Body> getBody() {
            return this.body;
        }

        public final List<Footer> getFooter() {
            return this.footer;
        }

        public final List<SocialAccount> getSocialAccounts() {
            return this.socialAccounts;
        }

        public final String getTitle() {
            return this.title;
        }

        /* compiled from: OpenMessengerResponse.kt */
        @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0005HÆ\u0003J)\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÇ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010\u0017\u001a\u00020\u0018H×\u0001J\t\u0010\u0019\u001a\u00020\u0005H×\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR \u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\f\"\u0004\b\u000e\u0010\u000f¨\u0006\u001a"}, d2 = {"Lio/intercom/android/sdk/models/Header$Expanded$Body;", "", "style", "Lio/intercom/android/sdk/models/Header$Expanded$Style;", "text", "", "color", "<init>", "(Lio/intercom/android/sdk/models/Header$Expanded$Style;Ljava/lang/String;Ljava/lang/String;)V", "getStyle", "()Lio/intercom/android/sdk/models/Header$Expanded$Style;", "getText", "()Ljava/lang/String;", "getColor", "setColor", "(Ljava/lang/String;)V", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Body {
            public static final int $stable = 8;

            @SerializedName("color")
            private String color;

            @SerializedName("style")
            private final Style style;

            @SerializedName("text")
            private final String text;

            public static /* synthetic */ Body copy$default(Body body, Style style, String str, String str2, int i, Object obj) {
                if ((i & 1) != 0) {
                    style = body.style;
                }
                if ((i & 2) != 0) {
                    str = body.text;
                }
                if ((i & 4) != 0) {
                    str2 = body.color;
                }
                return body.copy(style, str, str2);
            }

            /* renamed from: component1, reason: from getter */
            public final Style getStyle() {
                return this.style;
            }

            /* renamed from: component2, reason: from getter */
            public final String getText() {
                return this.text;
            }

            /* renamed from: component3, reason: from getter */
            public final String getColor() {
                return this.color;
            }

            public final Body copy(Style style, String text, String color) {
                Intrinsics.checkNotNullParameter(style, "style");
                Intrinsics.checkNotNullParameter(text, "text");
                return new Body(style, text, color);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Body)) {
                    return false;
                }
                Body body = (Body) other;
                return this.style == body.style && Intrinsics.areEqual(this.text, body.text) && Intrinsics.areEqual(this.color, body.color);
            }

            public int hashCode() {
                int hashCode = ((this.style.hashCode() * 31) + this.text.hashCode()) * 31;
                String str = this.color;
                return hashCode + (str == null ? 0 : str.hashCode());
            }

            public String toString() {
                return "Body(style=" + this.style + ", text=" + this.text + ", color=" + this.color + ')';
            }

            public Body(Style style, String text, String str) {
                Intrinsics.checkNotNullParameter(style, "style");
                Intrinsics.checkNotNullParameter(text, "text");
                this.style = style;
                this.text = text;
                this.color = str;
            }

            public final Style getStyle() {
                return this.style;
            }

            public final String getText() {
                return this.text;
            }

            public final String getColor() {
                return this.color;
            }

            public final void setColor(String str) {
                this.color = str;
            }
        }

        /* compiled from: OpenMessengerResponse.kt */
        @kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\bHÆ\u0003J5\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bHÇ\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010\u001c\u001a\u00020\u001dH×\u0001J\t\u0010\u001e\u001a\u00020\u0005H×\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR \u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u000e\"\u0004\b\u0010\u0010\u0011R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u001f"}, d2 = {"Lio/intercom/android/sdk/models/Header$Expanded$Footer;", "", "style", "Lio/intercom/android/sdk/models/Header$Expanded$Style;", "text", "", "color", "avatarDetails", "Lio/intercom/android/sdk/models/AvatarDetails;", "<init>", "(Lio/intercom/android/sdk/models/Header$Expanded$Style;Ljava/lang/String;Ljava/lang/String;Lio/intercom/android/sdk/models/AvatarDetails;)V", "getStyle", "()Lio/intercom/android/sdk/models/Header$Expanded$Style;", "getText", "()Ljava/lang/String;", "getColor", "setColor", "(Ljava/lang/String;)V", "getAvatarDetails", "()Lio/intercom/android/sdk/models/AvatarDetails;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Footer {
            public static final int $stable = 8;

            @SerializedName("avatar_details")
            private final AvatarDetails avatarDetails;

            @SerializedName("color")
            private String color;

            @SerializedName("style")
            private final Style style;

            @SerializedName("text")
            private final String text;

            public static /* synthetic */ Footer copy$default(Footer footer, Style style, String str, String str2, AvatarDetails avatarDetails, int i, Object obj) {
                if ((i & 1) != 0) {
                    style = footer.style;
                }
                if ((i & 2) != 0) {
                    str = footer.text;
                }
                if ((i & 4) != 0) {
                    str2 = footer.color;
                }
                if ((i & 8) != 0) {
                    avatarDetails = footer.avatarDetails;
                }
                return footer.copy(style, str, str2, avatarDetails);
            }

            /* renamed from: component1, reason: from getter */
            public final Style getStyle() {
                return this.style;
            }

            /* renamed from: component2, reason: from getter */
            public final String getText() {
                return this.text;
            }

            /* renamed from: component3, reason: from getter */
            public final String getColor() {
                return this.color;
            }

            /* renamed from: component4, reason: from getter */
            public final AvatarDetails getAvatarDetails() {
                return this.avatarDetails;
            }

            public final Footer copy(Style style, String text, String color, AvatarDetails avatarDetails) {
                Intrinsics.checkNotNullParameter(style, "style");
                Intrinsics.checkNotNullParameter(text, "text");
                return new Footer(style, text, color, avatarDetails);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Footer)) {
                    return false;
                }
                Footer footer = (Footer) other;
                return this.style == footer.style && Intrinsics.areEqual(this.text, footer.text) && Intrinsics.areEqual(this.color, footer.color) && Intrinsics.areEqual(this.avatarDetails, footer.avatarDetails);
            }

            public int hashCode() {
                int hashCode = ((this.style.hashCode() * 31) + this.text.hashCode()) * 31;
                String str = this.color;
                int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
                AvatarDetails avatarDetails = this.avatarDetails;
                return hashCode2 + (avatarDetails != null ? avatarDetails.hashCode() : 0);
            }

            public String toString() {
                return "Footer(style=" + this.style + ", text=" + this.text + ", color=" + this.color + ", avatarDetails=" + this.avatarDetails + ')';
            }

            public Footer(Style style, String text, String str, AvatarDetails avatarDetails) {
                Intrinsics.checkNotNullParameter(style, "style");
                Intrinsics.checkNotNullParameter(text, "text");
                this.style = style;
                this.text = text;
                this.color = str;
                this.avatarDetails = avatarDetails;
            }

            public final Style getStyle() {
                return this.style;
            }

            public final String getText() {
                return this.text;
            }

            public final String getColor() {
                return this.color;
            }

            public final void setColor(String str) {
                this.color = str;
            }

            public final AvatarDetails getAvatarDetails() {
                return this.avatarDetails;
            }
        }

        /* compiled from: OpenMessengerResponse.kt */
        @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J1\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÇ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010\u0016\u001a\u00020\u0017H×\u0001J\t\u0010\u0018\u001a\u00020\u0003H×\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u0019"}, d2 = {"Lio/intercom/android/sdk/models/Header$Expanded$SocialAccount;", "", "provider", "", "profileUrl", "imageUrl", "username", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getProvider", "()Ljava/lang/String;", "getProfileUrl", "getImageUrl", "getUsername", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class SocialAccount {
            public static final int $stable = 0;

            @SerializedName("image_url")
            private final String imageUrl;

            @SerializedName("profile_url")
            private final String profileUrl;

            @SerializedName("provider")
            private final String provider;

            @SerializedName("username")
            private final String username;

            public static /* synthetic */ SocialAccount copy$default(SocialAccount socialAccount, String str, String str2, String str3, String str4, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = socialAccount.provider;
                }
                if ((i & 2) != 0) {
                    str2 = socialAccount.profileUrl;
                }
                if ((i & 4) != 0) {
                    str3 = socialAccount.imageUrl;
                }
                if ((i & 8) != 0) {
                    str4 = socialAccount.username;
                }
                return socialAccount.copy(str, str2, str3, str4);
            }

            /* renamed from: component1, reason: from getter */
            public final String getProvider() {
                return this.provider;
            }

            /* renamed from: component2, reason: from getter */
            public final String getProfileUrl() {
                return this.profileUrl;
            }

            /* renamed from: component3, reason: from getter */
            public final String getImageUrl() {
                return this.imageUrl;
            }

            /* renamed from: component4, reason: from getter */
            public final String getUsername() {
                return this.username;
            }

            public final SocialAccount copy(String provider, String profileUrl, String imageUrl, String username) {
                Intrinsics.checkNotNullParameter(provider, "provider");
                Intrinsics.checkNotNullParameter(profileUrl, "profileUrl");
                Intrinsics.checkNotNullParameter(imageUrl, "imageUrl");
                Intrinsics.checkNotNullParameter(username, "username");
                return new SocialAccount(provider, profileUrl, imageUrl, username);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof SocialAccount)) {
                    return false;
                }
                SocialAccount socialAccount = (SocialAccount) other;
                return Intrinsics.areEqual(this.provider, socialAccount.provider) && Intrinsics.areEqual(this.profileUrl, socialAccount.profileUrl) && Intrinsics.areEqual(this.imageUrl, socialAccount.imageUrl) && Intrinsics.areEqual(this.username, socialAccount.username);
            }

            public int hashCode() {
                return (((((this.provider.hashCode() * 31) + this.profileUrl.hashCode()) * 31) + this.imageUrl.hashCode()) * 31) + this.username.hashCode();
            }

            public String toString() {
                return "SocialAccount(provider=" + this.provider + ", profileUrl=" + this.profileUrl + ", imageUrl=" + this.imageUrl + ", username=" + this.username + ')';
            }

            public SocialAccount(String provider, String profileUrl, String imageUrl, String username) {
                Intrinsics.checkNotNullParameter(provider, "provider");
                Intrinsics.checkNotNullParameter(profileUrl, "profileUrl");
                Intrinsics.checkNotNullParameter(imageUrl, "imageUrl");
                Intrinsics.checkNotNullParameter(username, "username");
                this.provider = provider;
                this.profileUrl = profileUrl;
                this.imageUrl = imageUrl;
                this.username = username;
            }

            public final String getProvider() {
                return this.provider;
            }

            public final String getProfileUrl() {
                return this.profileUrl;
            }

            public final String getImageUrl() {
                return this.imageUrl;
            }

            public final String getUsername() {
                return this.username;
            }
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: OpenMessengerResponse.kt */
        @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\n\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lio/intercom/android/sdk/models/Header$Expanded$Style;", "", "<init>", "(Ljava/lang/String;I)V", "UNKNOWN", "H1", "PARAGRAPH", "GREETING", "INTRO", ShareConstants.QUOTE, "CAPTION", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Style {
            private static final /* synthetic */ EnumEntries $ENTRIES;
            private static final /* synthetic */ Style[] $VALUES;
            public static final Style UNKNOWN = new Style("UNKNOWN", 0);

            @SerializedName("h1")
            public static final Style H1 = new Style("H1", 1);

            @SerializedName("paragraph")
            public static final Style PARAGRAPH = new Style("PARAGRAPH", 2);

            @SerializedName("greeting")
            public static final Style GREETING = new Style("GREETING", 3);

            @SerializedName("intro")
            public static final Style INTRO = new Style("INTRO", 4);

            @SerializedName(ShareConstants.WEB_DIALOG_PARAM_QUOTE)
            public static final Style QUOTE = new Style(ShareConstants.QUOTE, 5);

            @SerializedName(ShareConstants.FEED_CAPTION_PARAM)
            public static final Style CAPTION = new Style("CAPTION", 6);

            private static final /* synthetic */ Style[] $values() {
                return new Style[]{UNKNOWN, H1, PARAGRAPH, GREETING, INTRO, QUOTE, CAPTION};
            }

            public static EnumEntries<Style> getEntries() {
                return $ENTRIES;
            }

            private Style(String str, int i) {
            }

            static {
                Style[] $values = $values();
                $VALUES = $values;
                $ENTRIES = EnumEntriesKt.enumEntries($values);
            }

            public static Style valueOf(String str) {
                return (Style) Enum.valueOf(Style.class, str);
            }

            public static Style[] values() {
                return (Style[]) $VALUES.clone();
            }
        }
    }
}
