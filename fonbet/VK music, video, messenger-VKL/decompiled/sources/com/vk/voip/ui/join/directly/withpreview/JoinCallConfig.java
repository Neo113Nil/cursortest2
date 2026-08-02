package com.vk.voip.ui.join.directly.withpreview;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.core.serialize.Serializer;
import com.vk.core.voip.VoipCallSource;
import com.vk.voip.api.id.CallId;
import com.vk.voip.api.join.JoinData;
import defpackage.q0;
import xsna.epx;
import xsna.ho8;
import xsna.qoy;
import xsna.urd0;
import xsna.zcl;

/* compiled from: JoinCallConfig.kt */
/* loaded from: classes7.dex */
public final class JoinCallConfig implements Parcelable {
    public static final Parcelable.Creator<JoinCallConfig> CREATOR = new a();
    public final String b;
    public final ConfigCallPreview c;
    public final JoinData d;
    public final CallId e;
    public final VoipCallSource f;
    public final JoinAs g;
    public final boolean h;
    public final boolean i;

    /* compiled from: JoinCallConfig.kt */
    public static final class ConfigCallPreview implements Parcelable {
        public static final Parcelable.Creator<ConfigCallPreview> CREATOR = new a();
        public final int b;
        public final String c;

        /* compiled from: JoinCallConfig.kt */
        public static final class a implements Parcelable.Creator<ConfigCallPreview> {
            @Override // android.os.Parcelable.Creator
            public final ConfigCallPreview createFromParcel(Parcel parcel) {
                return new ConfigCallPreview(parcel.readInt(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final ConfigCallPreview[] newArray(int i) {
                return new ConfigCallPreview[i];
            }
        }

        public ConfigCallPreview(int i, String str) {
            this.b = i;
            this.c = str;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ConfigCallPreview)) {
                return false;
            }
            ConfigCallPreview configCallPreview = (ConfigCallPreview) obj;
            return this.b == configCallPreview.b && epx.f(this.c, configCallPreview.c);
        }

        public final int hashCode() {
            int hashCode = Integer.hashCode(this.b) * 31;
            String str = this.c;
            return hashCode + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ConfigCallPreview(usersCount=");
            sb.append(this.b);
            sb.append(", callName=");
            return ho8.a(sb, this.c, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.b);
            parcel.writeString(this.c);
        }
    }

    /* compiled from: JoinCallConfig.kt */
    public static final class JoinAs implements Parcelable {
        public static final Parcelable.Creator<JoinAs> CREATOR = new a();
        public final boolean b;
        public final boolean c;
        public final boolean d;

        /* compiled from: JoinCallConfig.kt */
        public static final class a implements Parcelable.Creator<JoinAs> {
            @Override // android.os.Parcelable.Creator
            public final JoinAs createFromParcel(Parcel parcel) {
                return new JoinAs(parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final JoinAs[] newArray(int i) {
                return new JoinAs[i];
            }
        }

        public JoinAs() {
            this(false, false, false, 7, null);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof JoinAs)) {
                return false;
            }
            JoinAs joinAs = (JoinAs) obj;
            return this.b == joinAs.b && this.c == joinAs.c && this.d == joinAs.d;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.d) + qoy.b(Boolean.hashCode(this.b) * 31, 31, this.c);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("JoinAs(joinAsGroupEnabled=");
            sb.append(this.b);
            sb.append(", joinAsAnonymousEnabled=");
            sb.append(this.c);
            sb.append(", joinWithChangedNameEnabled=");
            return q0.a(sb, this.d, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.b ? 1 : 0);
            parcel.writeInt(this.c ? 1 : 0);
            parcel.writeInt(this.d ? 1 : 0);
        }

        public JoinAs(boolean z, boolean z2, boolean z3) {
            this.b = z;
            this.c = z2;
            this.d = z3;
        }

        public /* synthetic */ JoinAs(boolean z, boolean z2, boolean z3, int i, zcl zclVar) {
            this((i & 1) != 0 ? true : z, (i & 2) != 0 ? true : z2, (i & 4) != 0 ? true : z3);
        }
    }

    /* compiled from: JoinCallConfig.kt */
    public static final class a implements Parcelable.Creator<JoinCallConfig> {
        @Override // android.os.Parcelable.Creator
        public final JoinCallConfig createFromParcel(Parcel parcel) {
            VoipCallSource voipCallSource;
            JoinData joinData;
            CallId callId;
            String readString = parcel.readString();
            ConfigCallPreview createFromParcel = parcel.readInt() == 0 ? null : ConfigCallPreview.CREATOR.createFromParcel(parcel);
            JoinData joinData2 = (JoinData) parcel.readParcelable(JoinCallConfig.class.getClassLoader());
            CallId callId2 = (CallId) parcel.readParcelable(JoinCallConfig.class.getClassLoader());
            VoipCallSource voipCallSource2 = (VoipCallSource) parcel.readParcelable(JoinCallConfig.class.getClassLoader());
            JoinAs createFromParcel2 = JoinAs.CREATOR.createFromParcel(parcel);
            boolean z = false;
            boolean z2 = parcel.readInt() != 0;
            if (parcel.readInt() != 0) {
                voipCallSource = voipCallSource2;
                joinData = joinData2;
                callId = callId2;
                z = true;
            } else {
                voipCallSource = voipCallSource2;
                joinData = joinData2;
                callId = callId2;
            }
            return new JoinCallConfig(readString, createFromParcel, joinData, callId, voipCallSource, createFromParcel2, z2, z);
        }

        @Override // android.os.Parcelable.Creator
        public final JoinCallConfig[] newArray(int i) {
            return new JoinCallConfig[i];
        }
    }

    public JoinCallConfig(String str, ConfigCallPreview configCallPreview, JoinData joinData, CallId callId, VoipCallSource voipCallSource, JoinAs joinAs, boolean z, boolean z2) {
        this.b = str;
        this.c = configCallPreview;
        this.d = joinData;
        this.e = callId;
        this.f = voipCallSource;
        this.g = joinAs;
        this.h = z;
        this.i = z2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof JoinCallConfig)) {
            return false;
        }
        JoinCallConfig joinCallConfig = (JoinCallConfig) obj;
        return epx.f(this.b, joinCallConfig.b) && epx.f(this.c, joinCallConfig.c) && epx.f(this.d, joinCallConfig.d) && epx.f(this.e, joinCallConfig.e) && epx.f(this.f, joinCallConfig.f) && epx.f(this.g, joinCallConfig.g) && this.h == joinCallConfig.h && this.i == joinCallConfig.i;
    }

    public final int hashCode() {
        int hashCode = this.b.hashCode() * 31;
        ConfigCallPreview configCallPreview = this.c;
        int hashCode2 = (hashCode + (configCallPreview == null ? 0 : configCallPreview.hashCode())) * 31;
        JoinData joinData = this.d;
        return Boolean.hashCode(this.i) + qoy.b((this.g.hashCode() + ((this.f.hashCode() + urd0.a((hashCode2 + (joinData != null ? joinData.hashCode() : 0)) * 31, 31, this.e.b)) * 31)) * 31, 31, this.h);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("JoinCallConfig(vkJoinLink=");
        sb.append(this.b);
        sb.append(", callPreview=");
        sb.append(this.c);
        sb.append(", joinData=");
        sb.append(this.d);
        sb.append(", callId=");
        sb.append(this.e);
        sb.append(", callSource=");
        sb.append(this.f);
        sb.append(", joinAs=");
        sb.append(this.g);
        sb.append(", withVideo=");
        sb.append(this.h);
        sb.append(", useLoader=");
        return q0.a(sb, this.i, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.b);
        ConfigCallPreview configCallPreview = this.c;
        if (configCallPreview == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            configCallPreview.writeToParcel(parcel, i);
        }
        parcel.writeParcelable(this.d, i);
        parcel.writeParcelable(this.e, i);
        parcel.writeParcelable(this.f, i);
        this.g.writeToParcel(parcel, i);
        parcel.writeInt(this.h ? 1 : 0);
        parcel.writeInt(this.i ? 1 : 0);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public JoinCallConfig(String str, ConfigCallPreview configCallPreview, JoinData joinData, CallId callId, VoipCallSource voipCallSource, JoinAs joinAs, boolean z, boolean z2, int i, zcl zclVar) {
        this(str, r5, r6, r7, voipCallSource, (i & 32) != 0 ? new JoinAs(false, false, false, 7, null) : joinAs, (i & 64) != 0 ? false : z, (i & 128) != 0 ? true : z2);
        CallId callId2;
        ConfigCallPreview configCallPreview2 = (i & 2) != 0 ? null : configCallPreview;
        JoinData joinData2 = (i & 4) != 0 ? null : joinData;
        if ((i & 8) != 0) {
            Serializer.c<CallId> cVar = CallId.CREATOR;
            callId2 = CallId.e;
        } else {
            callId2 = callId;
        }
    }
}
