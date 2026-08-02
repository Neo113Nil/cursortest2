package com.giphy.sdk.core.models;

import Gb.c;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.react.devsupport.StackTraceHelper;
import io.agora.rtc2.internal.AudioRoutingController;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b2\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B½\u0002\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u000e\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u001c\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u001d\u001a\u00020\u000e\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u001fJ\t\u0010@\u001a\u00020AHÖ\u0001J\u0019\u0010B\u001a\u00020C2\u0006\u0010D\u001a\u00020E2\u0006\u0010F\u001a\u00020AHÖ\u0001R\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010!R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u0010!R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b$\u0010!R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b%\u0010!R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b&\u0010!R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b'\u0010!R\u0018\u0010\n\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b(\u0010!R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b)\u0010!R\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b*\u0010!R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b+\u0010!R\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b,\u0010!R\u0016\u0010\r\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010-R\u001e\u0010\u001d\u001a\u00020\u000e8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010-\"\u0004\b.\u0010/R\u0016\u0010\u0019\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010-R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b0\u0010!R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b1\u0010!R\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b2\u0010!R\u0018\u0010\u0016\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b3\u0010!R\u0013\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b4\u0010!R\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b5\u0010!R \u0010\u001e\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b6\u0010!\"\u0004\b7\u00108R\u001a\u0010\t\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b9\u0010!\"\u0004\b:\u00108R\u001e\u0010\u001c\u001a\u00020\u000e8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b;\u0010-\"\u0004\b<\u0010/R\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b=\u0010!R\u0018\u0010\u001a\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b>\u0010!R\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b?\u0010!¨\u0006G"}, d2 = {"Lcom/giphy/sdk/core/models/User;", "Landroid/os/Parcelable;", StackTraceHelper.ID_KEY, "", "avatarUrl", "avatar", "bannerUrl", "bannerImage", "profileUrl", "username", "displayName", "email", "twitter", "isPublic", "", "attributionDisplayName", "name", "description", "aboutBio", "facebookUrl", "twitterUrl", "instagramUrl", "tumblrUrl", "tiktokUrl", "youtubeUrl", "isSuppressChrome", "websiteUrl", "websiteDisplayUrl", "verified", "isStaff", "userType", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;ZZLjava/lang/String;)V", "getAboutBio", "()Ljava/lang/String;", "getAttributionDisplayName", "getAvatar", "getAvatarUrl", "getBannerImage", "getBannerUrl", "getDescription", "getDisplayName", "getEmail", "getFacebookUrl", "getId", "getInstagramUrl", "()Z", "setStaff", "(Z)V", "getName", "getProfileUrl", "getTiktokUrl", "getTumblrUrl", "getTwitter", "getTwitterUrl", "getUserType", "setUserType", "(Ljava/lang/String;)V", "getUsername", "setUsername", "getVerified", "setVerified", "getWebsiteDisplayUrl", "getWebsiteUrl", "getYoutubeUrl", "describeContents", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "giphy-ui-2.3.17_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class User implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<User> CREATOR = new Creator();

    @c("about_bio")
    @Nullable
    private final String aboutBio;

    @c("attribution_display_name")
    @Nullable
    private final String attributionDisplayName;

    @c("avatar")
    @Nullable
    private final String avatar;

    @c("avatar_url")
    @Nullable
    private final String avatarUrl;

    @c("banner_image")
    @Nullable
    private final String bannerImage;

    @c("banner_url")
    @Nullable
    private final String bannerUrl;

    @Nullable
    private final String description;

    @c("display_name")
    @Nullable
    private final String displayName;

    @c("email")
    @Nullable
    private final String email;

    @c("facebook_url")
    @Nullable
    private final String facebookUrl;

    @Nullable
    private final String id;

    @c("instagram_url")
    @Nullable
    private final String instagramUrl;

    @c("is_public")
    private final boolean isPublic;

    @c("is_staff")
    private boolean isStaff;

    @c("suppress_chrome")
    private final boolean isSuppressChrome;

    @Nullable
    private final String name;

    @c("profile_url")
    @Nullable
    private final String profileUrl;

    @c("tiktok_url")
    @Nullable
    private final String tiktokUrl;

    @c("tumblr_url")
    @Nullable
    private final String tumblrUrl;

    @Nullable
    private final String twitter;

    @c("twitter_url")
    @Nullable
    private final String twitterUrl;

    @c("user_type")
    @Nullable
    private String userType;

    @NotNull
    private String username;

    @c("is_verified")
    private boolean verified;

    @c("website_display_url")
    @Nullable
    private final String websiteDisplayUrl;

    @c("website_url")
    @Nullable
    private final String websiteUrl;

    @c("youtube_url")
    @Nullable
    private final String youtubeUrl;

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<User> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final User createFromParcel(@NotNull Parcel parcel) {
            boolean z10;
            boolean z11;
            boolean z12;
            boolean z13;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            String readString4 = parcel.readString();
            String readString5 = parcel.readString();
            String readString6 = parcel.readString();
            String readString7 = parcel.readString();
            String readString8 = parcel.readString();
            String readString9 = parcel.readString();
            String readString10 = parcel.readString();
            boolean z14 = false;
            if (parcel.readInt() != 0) {
                z10 = false;
                z14 = true;
                z11 = true;
            } else {
                z10 = false;
                z11 = true;
            }
            String readString11 = parcel.readString();
            boolean z15 = z11;
            String readString12 = parcel.readString();
            String readString13 = parcel.readString();
            String readString14 = parcel.readString();
            String readString15 = parcel.readString();
            String readString16 = parcel.readString();
            String readString17 = parcel.readString();
            String readString18 = parcel.readString();
            String readString19 = parcel.readString();
            boolean z16 = z15;
            String readString20 = parcel.readString();
            if (parcel.readInt() != 0) {
                z12 = z16;
            } else {
                z12 = z16;
                z16 = z10;
            }
            String readString21 = parcel.readString();
            boolean z17 = z12;
            String readString22 = parcel.readString();
            if (parcel.readInt() != 0) {
                z13 = z17;
            } else {
                z13 = z17;
                z17 = z10;
            }
            if (parcel.readInt() == 0) {
                z13 = z10;
            }
            return new User(readString, readString2, readString3, readString4, readString5, readString6, readString7, readString8, readString9, readString10, z14, readString11, readString12, readString13, readString14, readString15, readString16, readString17, readString18, readString19, readString20, z16, readString21, readString22, z17, z13, parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final User[] newArray(int i10) {
            return new User[i10];
        }
    }

    public User(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @NotNull String username, @Nullable String str7, @Nullable String str8, @Nullable String str9, boolean z10, @Nullable String str10, @Nullable String str11, @Nullable String str12, @Nullable String str13, @Nullable String str14, @Nullable String str15, @Nullable String str16, @Nullable String str17, @Nullable String str18, @Nullable String str19, boolean z11, @Nullable String str20, @Nullable String str21, boolean z12, boolean z13, @Nullable String str22) {
        Intrinsics.checkNotNullParameter(username, "username");
        this.id = str;
        this.avatarUrl = str2;
        this.avatar = str3;
        this.bannerUrl = str4;
        this.bannerImage = str5;
        this.profileUrl = str6;
        this.username = username;
        this.displayName = str7;
        this.email = str8;
        this.twitter = str9;
        this.isPublic = z10;
        this.attributionDisplayName = str10;
        this.name = str11;
        this.description = str12;
        this.aboutBio = str13;
        this.facebookUrl = str14;
        this.twitterUrl = str15;
        this.instagramUrl = str16;
        this.tumblrUrl = str17;
        this.tiktokUrl = str18;
        this.youtubeUrl = str19;
        this.isSuppressChrome = z11;
        this.websiteUrl = str20;
        this.websiteDisplayUrl = str21;
        this.verified = z12;
        this.isStaff = z13;
        this.userType = str22;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Nullable
    public final String getAboutBio() {
        return this.aboutBio;
    }

    @Nullable
    public final String getAttributionDisplayName() {
        return this.attributionDisplayName;
    }

    @Nullable
    public final String getAvatar() {
        return this.avatar;
    }

    @Nullable
    public final String getAvatarUrl() {
        return this.avatarUrl;
    }

    @Nullable
    public final String getBannerImage() {
        return this.bannerImage;
    }

    @Nullable
    public final String getBannerUrl() {
        return this.bannerUrl;
    }

    @Nullable
    public final String getDescription() {
        return this.description;
    }

    @Nullable
    public final String getDisplayName() {
        return this.displayName;
    }

    @Nullable
    public final String getEmail() {
        return this.email;
    }

    @Nullable
    public final String getFacebookUrl() {
        return this.facebookUrl;
    }

    @Nullable
    public final String getId() {
        return this.id;
    }

    @Nullable
    public final String getInstagramUrl() {
        return this.instagramUrl;
    }

    @Nullable
    public final String getName() {
        return this.name;
    }

    @Nullable
    public final String getProfileUrl() {
        return this.profileUrl;
    }

    @Nullable
    public final String getTiktokUrl() {
        return this.tiktokUrl;
    }

    @Nullable
    public final String getTumblrUrl() {
        return this.tumblrUrl;
    }

    @Nullable
    public final String getTwitter() {
        return this.twitter;
    }

    @Nullable
    public final String getTwitterUrl() {
        return this.twitterUrl;
    }

    @Nullable
    public final String getUserType() {
        return this.userType;
    }

    @NotNull
    public final String getUsername() {
        return this.username;
    }

    public final boolean getVerified() {
        return this.verified;
    }

    @Nullable
    public final String getWebsiteDisplayUrl() {
        return this.websiteDisplayUrl;
    }

    @Nullable
    public final String getWebsiteUrl() {
        return this.websiteUrl;
    }

    @Nullable
    public final String getYoutubeUrl() {
        return this.youtubeUrl;
    }

    /* renamed from: isPublic, reason: from getter */
    public final boolean getIsPublic() {
        return this.isPublic;
    }

    /* renamed from: isStaff, reason: from getter */
    public final boolean getIsStaff() {
        return this.isStaff;
    }

    /* renamed from: isSuppressChrome, reason: from getter */
    public final boolean getIsSuppressChrome() {
        return this.isSuppressChrome;
    }

    public final void setStaff(boolean z10) {
        this.isStaff = z10;
    }

    public final void setUserType(@Nullable String str) {
        this.userType = str;
    }

    public final void setUsername(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.username = str;
    }

    public final void setVerified(boolean z10) {
        this.verified = z10;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeString(this.id);
        parcel.writeString(this.avatarUrl);
        parcel.writeString(this.avatar);
        parcel.writeString(this.bannerUrl);
        parcel.writeString(this.bannerImage);
        parcel.writeString(this.profileUrl);
        parcel.writeString(this.username);
        parcel.writeString(this.displayName);
        parcel.writeString(this.email);
        parcel.writeString(this.twitter);
        parcel.writeInt(this.isPublic ? 1 : 0);
        parcel.writeString(this.attributionDisplayName);
        parcel.writeString(this.name);
        parcel.writeString(this.description);
        parcel.writeString(this.aboutBio);
        parcel.writeString(this.facebookUrl);
        parcel.writeString(this.twitterUrl);
        parcel.writeString(this.instagramUrl);
        parcel.writeString(this.tumblrUrl);
        parcel.writeString(this.tiktokUrl);
        parcel.writeString(this.youtubeUrl);
        parcel.writeInt(this.isSuppressChrome ? 1 : 0);
        parcel.writeString(this.websiteUrl);
        parcel.writeString(this.websiteDisplayUrl);
        parcel.writeInt(this.verified ? 1 : 0);
        parcel.writeInt(this.isStaff ? 1 : 0);
        parcel.writeString(this.userType);
    }

    public /* synthetic */ User(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, boolean z10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, boolean z11, String str21, String str22, boolean z12, boolean z13, String str23, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? null : str2, (i10 & 4) != 0 ? null : str3, (i10 & 8) != 0 ? null : str4, (i10 & 16) != 0 ? null : str5, (i10 & 32) != 0 ? null : str6, str7, (i10 & 128) != 0 ? null : str8, (i10 & 256) != 0 ? null : str9, (i10 & 512) != 0 ? null : str10, (i10 & 1024) != 0 ? false : z10, (i10 & 2048) != 0 ? null : str11, (i10 & 4096) != 0 ? null : str12, (i10 & 8192) != 0 ? null : str13, (i10 & 16384) != 0 ? null : str14, (32768 & i10) != 0 ? null : str15, (65536 & i10) != 0 ? null : str16, (131072 & i10) != 0 ? null : str17, (262144 & i10) != 0 ? null : str18, (524288 & i10) != 0 ? null : str19, (1048576 & i10) != 0 ? null : str20, (2097152 & i10) != 0 ? false : z11, (4194304 & i10) != 0 ? null : str21, (8388608 & i10) != 0 ? null : str22, (16777216 & i10) != 0 ? false : z12, (33554432 & i10) != 0 ? false : z13, (i10 & AudioRoutingController.DEVICE_OUT_USB_HEADSET) != 0 ? null : str23);
    }
}
