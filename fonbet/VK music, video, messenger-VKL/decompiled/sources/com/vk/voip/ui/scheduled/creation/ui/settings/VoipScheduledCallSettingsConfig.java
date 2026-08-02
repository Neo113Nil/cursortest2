package com.vk.voip.ui.scheduled.creation.ui.settings;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.voip.ui.call_list.scheduled.ScheduledScreenSharingMuteOption;
import com.vk.voip.ui.call_list.scheduled.feature.model.ScheduledAudioMuteOption;
import com.vk.voip.ui.call_list.scheduled.feature.model.ScheduledVideoMuteOption;
import com.vk.voip.ui.call_list.scheduled.feature.model.ScheduledWatchTogetherOption;
import defpackage.q0;
import xsna.epx;
import xsna.qoy;

/* compiled from: VoipScheduledCallSettingsConfig.kt */
/* loaded from: classes7.dex */
public final class VoipScheduledCallSettingsConfig implements Parcelable {
    public static final Parcelable.Creator<VoipScheduledCallSettingsConfig> CREATOR = new a();
    public final CallSettings b;

    /* compiled from: VoipScheduledCallSettingsConfig.kt */
    public static final class CallSettings implements Parcelable {
        public static final Parcelable.Creator<CallSettings> CREATOR = new a();
        public final boolean b;
        public final boolean c;
        public final boolean d;
        public final ScheduledAudioMuteOption e;
        public final ScheduledVideoMuteOption f;
        public final ScheduledWatchTogetherOption g;
        public final ScheduledScreenSharingMuteOption h;
        public final boolean i;
        public final boolean j;

        /* compiled from: VoipScheduledCallSettingsConfig.kt */
        public static final class a implements Parcelable.Creator<CallSettings> {
            @Override // android.os.Parcelable.Creator
            public final CallSettings createFromParcel(Parcel parcel) {
                boolean z;
                boolean z2;
                boolean z3;
                ScheduledAudioMuteOption scheduledAudioMuteOption;
                ScheduledWatchTogetherOption scheduledWatchTogetherOption;
                boolean z4;
                ScheduledVideoMuteOption scheduledVideoMuteOption;
                ScheduledScreenSharingMuteOption scheduledScreenSharingMuteOption;
                boolean z5;
                boolean z6 = false;
                boolean z7 = true;
                boolean z8 = parcel.readInt() != 0;
                if (parcel.readInt() != 0) {
                    z = false;
                    z6 = true;
                } else {
                    z = false;
                }
                if (parcel.readInt() != 0) {
                    z2 = true;
                } else {
                    z2 = true;
                    z7 = z;
                }
                ScheduledAudioMuteOption valueOf = ScheduledAudioMuteOption.valueOf(parcel.readString());
                ScheduledVideoMuteOption valueOf2 = ScheduledVideoMuteOption.valueOf(parcel.readString());
                ScheduledWatchTogetherOption createFromParcel = ScheduledWatchTogetherOption.CREATOR.createFromParcel(parcel);
                ScheduledScreenSharingMuteOption valueOf3 = ScheduledScreenSharingMuteOption.valueOf(parcel.readString());
                if (parcel.readInt() != 0) {
                    z3 = z;
                    scheduledAudioMuteOption = valueOf;
                    scheduledWatchTogetherOption = createFromParcel;
                    z4 = z2;
                } else {
                    z3 = z;
                    scheduledAudioMuteOption = valueOf;
                    scheduledWatchTogetherOption = createFromParcel;
                    z4 = z3;
                }
                if (parcel.readInt() != 0) {
                    z5 = z2;
                    scheduledVideoMuteOption = valueOf2;
                    scheduledScreenSharingMuteOption = valueOf3;
                } else {
                    scheduledVideoMuteOption = valueOf2;
                    scheduledScreenSharingMuteOption = valueOf3;
                    z5 = z3;
                }
                return new CallSettings(z8, z6, z7, scheduledAudioMuteOption, scheduledVideoMuteOption, scheduledWatchTogetherOption, scheduledScreenSharingMuteOption, z4, z5);
            }

            @Override // android.os.Parcelable.Creator
            public final CallSettings[] newArray(int i) {
                return new CallSettings[i];
            }
        }

        public CallSettings(boolean z, boolean z2, boolean z3, ScheduledAudioMuteOption scheduledAudioMuteOption, ScheduledVideoMuteOption scheduledVideoMuteOption, ScheduledWatchTogetherOption scheduledWatchTogetherOption, ScheduledScreenSharingMuteOption scheduledScreenSharingMuteOption, boolean z4, boolean z5) {
            this.b = z;
            this.c = z2;
            this.d = z3;
            this.e = scheduledAudioMuteOption;
            this.f = scheduledVideoMuteOption;
            this.g = scheduledWatchTogetherOption;
            this.h = scheduledScreenSharingMuteOption;
            this.i = z4;
            this.j = z5;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof CallSettings)) {
                return false;
            }
            CallSettings callSettings = (CallSettings) obj;
            return this.b == callSettings.b && this.c == callSettings.c && this.d == callSettings.d && this.e == callSettings.e && this.f == callSettings.f && epx.f(this.g, callSettings.g) && this.h == callSettings.h && this.i == callSettings.i && this.j == callSettings.j;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.j) + qoy.b((this.h.hashCode() + ((this.g.hashCode() + ((this.f.hashCode() + ((this.e.hashCode() + qoy.b(qoy.b(Boolean.hashCode(this.b) * 31, 31, this.c), 31, this.d)) * 31)) * 31)) * 31)) * 31, 31, this.i);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("CallSettings(isWaitingHallEnabled=");
            sb.append(this.b);
            sb.append(", isAnonymousJoinEnabled=");
            sb.append(this.c);
            sb.append(", isFeedbackEnabled=");
            sb.append(this.d);
            sb.append(", audioMuteOption=");
            sb.append(this.e);
            sb.append(", videoMuteOption=");
            sb.append(this.f);
            sb.append(", isWatchTogetherOption=");
            sb.append(this.g);
            sb.append(", screenSharingMuteOption=");
            sb.append(this.h);
            sb.append(", onlyAdminCanRecord=");
            sb.append(this.i);
            sb.append(", shouldShowChatHistory=");
            return q0.a(sb, this.j, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.b ? 1 : 0);
            parcel.writeInt(this.c ? 1 : 0);
            parcel.writeInt(this.d ? 1 : 0);
            parcel.writeString(this.e.name());
            parcel.writeString(this.f.name());
            this.g.writeToParcel(parcel, i);
            parcel.writeString(this.h.name());
            parcel.writeInt(this.i ? 1 : 0);
            parcel.writeInt(this.j ? 1 : 0);
        }
    }

    /* compiled from: VoipScheduledCallSettingsConfig.kt */
    public static final class a implements Parcelable.Creator<VoipScheduledCallSettingsConfig> {
        @Override // android.os.Parcelable.Creator
        public final VoipScheduledCallSettingsConfig createFromParcel(Parcel parcel) {
            return new VoipScheduledCallSettingsConfig(CallSettings.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final VoipScheduledCallSettingsConfig[] newArray(int i) {
            return new VoipScheduledCallSettingsConfig[i];
        }
    }

    public VoipScheduledCallSettingsConfig(CallSettings callSettings) {
        this.b = callSettings;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof VoipScheduledCallSettingsConfig) && epx.f(this.b, ((VoipScheduledCallSettingsConfig) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return "VoipScheduledCallSettingsConfig(settings=" + this.b + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.b.writeToParcel(parcel, i);
    }
}
