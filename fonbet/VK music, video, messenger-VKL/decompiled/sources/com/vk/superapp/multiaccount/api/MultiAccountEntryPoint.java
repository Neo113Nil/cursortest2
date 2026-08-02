package com.vk.superapp.multiaccount.api;

import android.os.Parcel;
import android.os.Parcelable;
import com.huawei.hms.hihealth.data.DeviceInfo;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import java.util.List;
import ru.ok.android.api.methods.users.changePassword.ChangePasswordApiRequestV1;
import xsna.e43;
import xsna.zcl;

/* compiled from: MultiAccountEntryPoint.kt */
/* loaded from: classes6.dex */
public abstract class MultiAccountEntryPoint implements Parcelable {
    public static final List<Class<? extends MultiAccountEntryPoint>> c = e43.l(Settings.class, SettingsLogout.class, SuperappMenu.class, ProfileMenu.class);
    public final String b;

    /* compiled from: MultiAccountEntryPoint.kt */
    public static final class AuthorPage extends MultiAccountEntryPoint {
        public static final AuthorPage d = new AuthorPage("author_page", null);
        public static final Parcelable.Creator<AuthorPage> CREATOR = new a();

        /* compiled from: MultiAccountEntryPoint.kt */
        public static final class a implements Parcelable.Creator<AuthorPage> {
            @Override // android.os.Parcelable.Creator
            public final AuthorPage createFromParcel(Parcel parcel) {
                parcel.readInt();
                return AuthorPage.d;
            }

            @Override // android.os.Parcelable.Creator
            public final AuthorPage[] newArray(int i) {
                return new AuthorPage[i];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof AuthorPage);
        }

        public final int hashCode() {
            return -87389660;
        }

        public final String toString() {
            return "AuthorPage";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(1);
        }
    }

    /* compiled from: MultiAccountEntryPoint.kt */
    public static final class Deeplink extends MultiAccountEntryPoint {
        public static final Deeplink d = new Deeplink("deeplink", null);
        public static final Parcelable.Creator<Deeplink> CREATOR = new a();

        /* compiled from: MultiAccountEntryPoint.kt */
        public static final class a implements Parcelable.Creator<Deeplink> {
            @Override // android.os.Parcelable.Creator
            public final Deeplink createFromParcel(Parcel parcel) {
                parcel.readInt();
                return Deeplink.d;
            }

            @Override // android.os.Parcelable.Creator
            public final Deeplink[] newArray(int i) {
                return new Deeplink[i];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Deeplink);
        }

        public final int hashCode() {
            return -473204528;
        }

        public final String toString() {
            return "Deeplink";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(1);
        }
    }

    /* compiled from: MultiAccountEntryPoint.kt */
    public static final class LK extends MultiAccountEntryPoint {
        public static final LK d = new LK("lk_vkid", null);
        public static final Parcelable.Creator<LK> CREATOR = new a();

        /* compiled from: MultiAccountEntryPoint.kt */
        public static final class a implements Parcelable.Creator<LK> {
            @Override // android.os.Parcelable.Creator
            public final LK createFromParcel(Parcel parcel) {
                parcel.readInt();
                return LK.d;
            }

            @Override // android.os.Parcelable.Creator
            public final LK[] newArray(int i) {
                return new LK[i];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof LK);
        }

        public final int hashCode() {
            return 1096574665;
        }

        public final String toString() {
            return "LK";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(1);
        }
    }

    /* compiled from: MultiAccountEntryPoint.kt */
    public static final class Logout extends MultiAccountEntryPoint {
        public static final Logout d = new Logout(ChangePasswordApiRequestV1.PARAM_NAME_LOGOUT_ALL, null);
        public static final Parcelable.Creator<Logout> CREATOR = new a();

        /* compiled from: MultiAccountEntryPoint.kt */
        public static final class a implements Parcelable.Creator<Logout> {
            @Override // android.os.Parcelable.Creator
            public final Logout createFromParcel(Parcel parcel) {
                parcel.readInt();
                return Logout.d;
            }

            @Override // android.os.Parcelable.Creator
            public final Logout[] newArray(int i) {
                return new Logout[i];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Logout);
        }

        public final int hashCode() {
            return -571102732;
        }

        public final String toString() {
            return "Logout";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(1);
        }
    }

    /* compiled from: MultiAccountEntryPoint.kt */
    public static final class LongTap extends MultiAccountEntryPoint {
        public static final LongTap d = new LongTap("long_tap", null);
        public static final Parcelable.Creator<LongTap> CREATOR = new a();

        /* compiled from: MultiAccountEntryPoint.kt */
        public static final class a implements Parcelable.Creator<LongTap> {
            @Override // android.os.Parcelable.Creator
            public final LongTap createFromParcel(Parcel parcel) {
                parcel.readInt();
                return LongTap.d;
            }

            @Override // android.os.Parcelable.Creator
            public final LongTap[] newArray(int i) {
                return new LongTap[i];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof LongTap);
        }

        public final int hashCode() {
            return -518121379;
        }

        public final String toString() {
            return "LongTap";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(1);
        }
    }

    /* compiled from: MultiAccountEntryPoint.kt */
    public static final class Miniapp extends MultiAccountEntryPoint {
        public static final Miniapp d = new Miniapp("web_app", null);
        public static final Parcelable.Creator<Miniapp> CREATOR = new a();

        /* compiled from: MultiAccountEntryPoint.kt */
        public static final class a implements Parcelable.Creator<Miniapp> {
            @Override // android.os.Parcelable.Creator
            public final Miniapp createFromParcel(Parcel parcel) {
                parcel.readInt();
                return Miniapp.d;
            }

            @Override // android.os.Parcelable.Creator
            public final Miniapp[] newArray(int i) {
                return new Miniapp[i];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Miniapp);
        }

        public final int hashCode() {
            return 197679936;
        }

        public final String toString() {
            return "Miniapp";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(1);
        }
    }

    /* compiled from: MultiAccountEntryPoint.kt */
    public static final class ProfileMenu extends MultiAccountEntryPoint {
        public static final ProfileMenu d = new ProfileMenu();
        public static final Parcelable.Creator<ProfileMenu> CREATOR = new a();

        /* compiled from: MultiAccountEntryPoint.kt */
        public static final class a implements Parcelable.Creator<ProfileMenu> {
            @Override // android.os.Parcelable.Creator
            public final ProfileMenu createFromParcel(Parcel parcel) {
                parcel.readInt();
                return ProfileMenu.d;
            }

            @Override // android.os.Parcelable.Creator
            public final ProfileMenu[] newArray(int i) {
                return new ProfileMenu[i];
            }
        }

        public ProfileMenu() {
            super(CommonConstant.SCOPE.SCOPE_ACCOUNT_PROFILE, null);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof ProfileMenu);
        }

        public final int hashCode() {
            return 1064612990;
        }

        public final String toString() {
            return "ProfileMenu";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(1);
        }
    }

    /* compiled from: MultiAccountEntryPoint.kt */
    public static final class Push extends MultiAccountEntryPoint {
        public static final Push d = new Push("push", null);
        public static final Parcelable.Creator<Push> CREATOR = new a();

        /* compiled from: MultiAccountEntryPoint.kt */
        public static final class a implements Parcelable.Creator<Push> {
            @Override // android.os.Parcelable.Creator
            public final Push createFromParcel(Parcel parcel) {
                parcel.readInt();
                return Push.d;
            }

            @Override // android.os.Parcelable.Creator
            public final Push[] newArray(int i) {
                return new Push[i];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Push);
        }

        public final int hashCode() {
            return 1541428740;
        }

        public final String toString() {
            return "Push";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(1);
        }
    }

    /* compiled from: MultiAccountEntryPoint.kt */
    public static final class QrWebToApp extends MultiAccountEntryPoint {
        public static final QrWebToApp d = new QrWebToApp("mobile_qr", null);
        public static final Parcelable.Creator<QrWebToApp> CREATOR = new a();

        /* compiled from: MultiAccountEntryPoint.kt */
        public static final class a implements Parcelable.Creator<QrWebToApp> {
            @Override // android.os.Parcelable.Creator
            public final QrWebToApp createFromParcel(Parcel parcel) {
                parcel.readInt();
                return QrWebToApp.d;
            }

            @Override // android.os.Parcelable.Creator
            public final QrWebToApp[] newArray(int i) {
                return new QrWebToApp[i];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof QrWebToApp);
        }

        public final int hashCode() {
            return 127362909;
        }

        public final String toString() {
            return "QrWebToApp";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(1);
        }
    }

    /* compiled from: MultiAccountEntryPoint.kt */
    public static final class QrWithCode extends MultiAccountEntryPoint {
        public static final QrWithCode d = new QrWithCode("qr_with_code", null);
        public static final Parcelable.Creator<QrWithCode> CREATOR = new a();

        /* compiled from: MultiAccountEntryPoint.kt */
        public static final class a implements Parcelable.Creator<QrWithCode> {
            @Override // android.os.Parcelable.Creator
            public final QrWithCode createFromParcel(Parcel parcel) {
                parcel.readInt();
                return QrWithCode.d;
            }

            @Override // android.os.Parcelable.Creator
            public final QrWithCode[] newArray(int i) {
                return new QrWithCode[i];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof QrWithCode);
        }

        public final int hashCode() {
            return -85061506;
        }

        public final String toString() {
            return "QrWithCode";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(1);
        }
    }

    /* compiled from: MultiAccountEntryPoint.kt */
    public static final class Restore extends MultiAccountEntryPoint {
        public static final Restore d = new Restore("restore", null);
        public static final Parcelable.Creator<Restore> CREATOR = new a();

        /* compiled from: MultiAccountEntryPoint.kt */
        public static final class a implements Parcelable.Creator<Restore> {
            @Override // android.os.Parcelable.Creator
            public final Restore createFromParcel(Parcel parcel) {
                parcel.readInt();
                return Restore.d;
            }

            @Override // android.os.Parcelable.Creator
            public final Restore[] newArray(int i) {
                return new Restore[i];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Restore);
        }

        public final int hashCode() {
            return 230673252;
        }

        public final String toString() {
            return "Restore";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(1);
        }
    }

    /* compiled from: MultiAccountEntryPoint.kt */
    public static final class Settings extends MultiAccountEntryPoint {
        public static final Settings d = new Settings();
        public static final Parcelable.Creator<Settings> CREATOR = new a();

        /* compiled from: MultiAccountEntryPoint.kt */
        public static final class a implements Parcelable.Creator<Settings> {
            @Override // android.os.Parcelable.Creator
            public final Settings createFromParcel(Parcel parcel) {
                parcel.readInt();
                return Settings.d;
            }

            @Override // android.os.Parcelable.Creator
            public final Settings[] newArray(int i) {
                return new Settings[i];
            }
        }

        public Settings() {
            super("settings", null);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Settings);
        }

        public final int hashCode() {
            return 332193293;
        }

        public final String toString() {
            return "Settings";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(1);
        }
    }

    /* compiled from: MultiAccountEntryPoint.kt */
    public static final class SettingsLogout extends MultiAccountEntryPoint {
        public static final SettingsLogout d = new SettingsLogout();
        public static final Parcelable.Creator<SettingsLogout> CREATOR = new a();

        /* compiled from: MultiAccountEntryPoint.kt */
        public static final class a implements Parcelable.Creator<SettingsLogout> {
            @Override // android.os.Parcelable.Creator
            public final SettingsLogout createFromParcel(Parcel parcel) {
                parcel.readInt();
                return SettingsLogout.d;
            }

            @Override // android.os.Parcelable.Creator
            public final SettingsLogout[] newArray(int i) {
                return new SettingsLogout[i];
            }
        }

        public SettingsLogout() {
            super("settings_logout", null);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof SettingsLogout);
        }

        public final int hashCode() {
            return -371432969;
        }

        public final String toString() {
            return "SettingsLogout";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(1);
        }
    }

    /* compiled from: MultiAccountEntryPoint.kt */
    public static final class Sharing extends MultiAccountEntryPoint {
        public static final Sharing d = new Sharing("share_external", null);
        public static final Parcelable.Creator<Sharing> CREATOR = new a();

        /* compiled from: MultiAccountEntryPoint.kt */
        public static final class a implements Parcelable.Creator<Sharing> {
            @Override // android.os.Parcelable.Creator
            public final Sharing createFromParcel(Parcel parcel) {
                parcel.readInt();
                return Sharing.d;
            }

            @Override // android.os.Parcelable.Creator
            public final Sharing[] newArray(int i) {
                return new Sharing[i];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Sharing);
        }

        public final int hashCode() {
            return 1187375538;
        }

        public final String toString() {
            return "Sharing";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(1);
        }
    }

    /* compiled from: MultiAccountEntryPoint.kt */
    public static final class SuperappMenu extends MultiAccountEntryPoint {
        public static final SuperappMenu d = new SuperappMenu();
        public static final Parcelable.Creator<SuperappMenu> CREATOR = new a();

        /* compiled from: MultiAccountEntryPoint.kt */
        public static final class a implements Parcelable.Creator<SuperappMenu> {
            @Override // android.os.Parcelable.Creator
            public final SuperappMenu createFromParcel(Parcel parcel) {
                parcel.readInt();
                return SuperappMenu.d;
            }

            @Override // android.os.Parcelable.Creator
            public final SuperappMenu[] newArray(int i) {
                return new SuperappMenu[i];
            }
        }

        public SuperappMenu() {
            super("services_menu", null);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof SuperappMenu);
        }

        public final int hashCode() {
            return 1519872047;
        }

        public final String toString() {
            return "SuperappMenu";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(1);
        }
    }

    /* compiled from: MultiAccountEntryPoint.kt */
    public static final class Unknown extends MultiAccountEntryPoint {
        public static final Unknown d = new Unknown("unknown", null);
        public static final Parcelable.Creator<Unknown> CREATOR = new a();

        /* compiled from: MultiAccountEntryPoint.kt */
        public static final class a implements Parcelable.Creator<Unknown> {
            @Override // android.os.Parcelable.Creator
            public final Unknown createFromParcel(Parcel parcel) {
                parcel.readInt();
                return Unknown.d;
            }

            @Override // android.os.Parcelable.Creator
            public final Unknown[] newArray(int i) {
                return new Unknown[i];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Unknown);
        }

        public final int hashCode() {
            return -1151687392;
        }

        public final String toString() {
            return DeviceInfo.STR_TYPE_UNKNOWN;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(1);
        }
    }

    /* compiled from: MultiAccountEntryPoint.kt */
    public static final class VideoOfflineRelated extends MultiAccountEntryPoint {
        public static final VideoOfflineRelated d = new VideoOfflineRelated("video_offline_related", null);
        public static final Parcelable.Creator<VideoOfflineRelated> CREATOR = new a();

        /* compiled from: MultiAccountEntryPoint.kt */
        public static final class a implements Parcelable.Creator<VideoOfflineRelated> {
            @Override // android.os.Parcelable.Creator
            public final VideoOfflineRelated createFromParcel(Parcel parcel) {
                parcel.readInt();
                return VideoOfflineRelated.d;
            }

            @Override // android.os.Parcelable.Creator
            public final VideoOfflineRelated[] newArray(int i) {
                return new VideoOfflineRelated[i];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof VideoOfflineRelated);
        }

        public final int hashCode() {
            return 1175496185;
        }

        public final String toString() {
            return "VideoOfflineRelated";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(1);
        }
    }

    /* compiled from: MultiAccountEntryPoint.kt */
    public static final class VkVideoMainKids extends MultiAccountEntryPoint {
        public static final VkVideoMainKids d = new VkVideoMainKids("main_related", null);
        public static final Parcelable.Creator<VkVideoMainKids> CREATOR = new a();

        /* compiled from: MultiAccountEntryPoint.kt */
        public static final class a implements Parcelable.Creator<VkVideoMainKids> {
            @Override // android.os.Parcelable.Creator
            public final VkVideoMainKids createFromParcel(Parcel parcel) {
                parcel.readInt();
                return VkVideoMainKids.d;
            }

            @Override // android.os.Parcelable.Creator
            public final VkVideoMainKids[] newArray(int i) {
                return new VkVideoMainKids[i];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof VkVideoMainKids);
        }

        public final int hashCode() {
            return 1729769346;
        }

        public final String toString() {
            return "VkVideoMainKids";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(1);
        }
    }

    /* compiled from: MultiAccountEntryPoint.kt */
    public static final class VkVideoOnboardingMainTab extends MultiAccountEntryPoint {
        public static final VkVideoOnboardingMainTab d = new VkVideoOnboardingMainTab("vkvideo_home_tab", null);
        public static final Parcelable.Creator<VkVideoOnboardingMainTab> CREATOR = new a();

        /* compiled from: MultiAccountEntryPoint.kt */
        public static final class a implements Parcelable.Creator<VkVideoOnboardingMainTab> {
            @Override // android.os.Parcelable.Creator
            public final VkVideoOnboardingMainTab createFromParcel(Parcel parcel) {
                parcel.readInt();
                return VkVideoOnboardingMainTab.d;
            }

            @Override // android.os.Parcelable.Creator
            public final VkVideoOnboardingMainTab[] newArray(int i) {
                return new VkVideoOnboardingMainTab[i];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof VkVideoOnboardingMainTab);
        }

        public final int hashCode() {
            return 1362398277;
        }

        public final String toString() {
            return "VkVideoOnboardingMainTab";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(1);
        }
    }

    /* compiled from: MultiAccountEntryPoint.kt */
    public static final class VkVideoOnboardingProfile extends MultiAccountEntryPoint {
        public static final VkVideoOnboardingProfile d = new VkVideoOnboardingProfile("vkvideo_profile_button", null);
        public static final Parcelable.Creator<VkVideoOnboardingProfile> CREATOR = new a();

        /* compiled from: MultiAccountEntryPoint.kt */
        public static final class a implements Parcelable.Creator<VkVideoOnboardingProfile> {
            @Override // android.os.Parcelable.Creator
            public final VkVideoOnboardingProfile createFromParcel(Parcel parcel) {
                parcel.readInt();
                return VkVideoOnboardingProfile.d;
            }

            @Override // android.os.Parcelable.Creator
            public final VkVideoOnboardingProfile[] newArray(int i) {
                return new VkVideoOnboardingProfile[i];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof VkVideoOnboardingProfile);
        }

        public final int hashCode() {
            return 221960914;
        }

        public final String toString() {
            return "VkVideoOnboardingProfile";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(1);
        }
    }

    /* compiled from: MultiAccountEntryPoint.kt */
    public static final class VkVideoOnboardingSettingsBanner extends MultiAccountEntryPoint {
        public static final VkVideoOnboardingSettingsBanner d = new VkVideoOnboardingSettingsBanner("vkvideo_settings_banner", null);
        public static final Parcelable.Creator<VkVideoOnboardingSettingsBanner> CREATOR = new a();

        /* compiled from: MultiAccountEntryPoint.kt */
        public static final class a implements Parcelable.Creator<VkVideoOnboardingSettingsBanner> {
            @Override // android.os.Parcelable.Creator
            public final VkVideoOnboardingSettingsBanner createFromParcel(Parcel parcel) {
                parcel.readInt();
                return VkVideoOnboardingSettingsBanner.d;
            }

            @Override // android.os.Parcelable.Creator
            public final VkVideoOnboardingSettingsBanner[] newArray(int i) {
                return new VkVideoOnboardingSettingsBanner[i];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof VkVideoOnboardingSettingsBanner);
        }

        public final int hashCode() {
            return 2051080166;
        }

        public final String toString() {
            return "VkVideoOnboardingSettingsBanner";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(1);
        }
    }

    /* compiled from: MultiAccountEntryPoint.kt */
    public static final class VkVideoProfile extends MultiAccountEntryPoint {
        public static final VkVideoProfile d = new VkVideoProfile(CommonConstant.SCOPE.SCOPE_ACCOUNT_PROFILE, null);
        public static final Parcelable.Creator<VkVideoProfile> CREATOR = new a();

        /* compiled from: MultiAccountEntryPoint.kt */
        public static final class a implements Parcelable.Creator<VkVideoProfile> {
            @Override // android.os.Parcelable.Creator
            public final VkVideoProfile createFromParcel(Parcel parcel) {
                parcel.readInt();
                return VkVideoProfile.d;
            }

            @Override // android.os.Parcelable.Creator
            public final VkVideoProfile[] newArray(int i) {
                return new VkVideoProfile[i];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof VkVideoProfile);
        }

        public final int hashCode() {
            return 577938029;
        }

        public final String toString() {
            return "VkVideoProfile";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(1);
        }
    }

    /* compiled from: MultiAccountEntryPoint.kt */
    public static final class VkVideoSettings extends MultiAccountEntryPoint {
        public static final VkVideoSettings d = new VkVideoSettings("settings", null);
        public static final Parcelable.Creator<VkVideoSettings> CREATOR = new a();

        /* compiled from: MultiAccountEntryPoint.kt */
        public static final class a implements Parcelable.Creator<VkVideoSettings> {
            @Override // android.os.Parcelable.Creator
            public final VkVideoSettings createFromParcel(Parcel parcel) {
                parcel.readInt();
                return VkVideoSettings.d;
            }

            @Override // android.os.Parcelable.Creator
            public final VkVideoSettings[] newArray(int i) {
                return new VkVideoSettings[i];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof VkVideoSettings);
        }

        public final int hashCode() {
            return -1121862689;
        }

        public final String toString() {
            return "VkVideoSettings";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(1);
        }
    }

    public MultiAccountEntryPoint(String str, zcl zclVar) {
        this.b = str;
    }

    public final String d() {
        return this.b;
    }
}
