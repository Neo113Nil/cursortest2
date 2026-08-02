package com.vk.api.generated.calls.dto;

import android.os.Parcel;
import android.os.Parcelable;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.epx;
import xsna.pmi0;
import xsna.qoy;
import xsna.sn;
import xsna.tn;
import xsna.zcl;

/* compiled from: CallsSettingsDto.kt */
/* loaded from: classes14.dex */
public final class CallsSettingsDto implements Parcelable {
    public static final Parcelable.Creator<CallsSettingsDto> CREATOR = new a();

    @pmi0("no_stickers")
    private final boolean noStickers;

    @pmi0(SignalingProtocol.KEY_SHOW_CHAT_HISTORY)
    private final boolean showChatHistory;

    @pmi0("suspicious_call")
    private final Boolean suspiciousCall;

    /* compiled from: CallsSettingsDto.kt */
    public static final class a implements Parcelable.Creator<CallsSettingsDto> {
        @Override // android.os.Parcelable.Creator
        public final CallsSettingsDto createFromParcel(Parcel parcel) {
            Boolean valueOf;
            boolean z = parcel.readInt() != 0;
            boolean z2 = parcel.readInt() != 0;
            if (parcel.readInt() == 0) {
                valueOf = null;
            } else {
                valueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new CallsSettingsDto(z, z2, valueOf);
        }

        @Override // android.os.Parcelable.Creator
        public final CallsSettingsDto[] newArray(int i) {
            return new CallsSettingsDto[i];
        }
    }

    public CallsSettingsDto(boolean z, boolean z2, Boolean bool) {
        this.noStickers = z;
        this.showChatHistory = z2;
        this.suspiciousCall = bool;
    }

    public final boolean d() {
        return this.showChatHistory;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final Boolean e() {
        return this.suspiciousCall;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CallsSettingsDto)) {
            return false;
        }
        CallsSettingsDto callsSettingsDto = (CallsSettingsDto) obj;
        return this.noStickers == callsSettingsDto.noStickers && this.showChatHistory == callsSettingsDto.showChatHistory && epx.f(this.suspiciousCall, callsSettingsDto.suspiciousCall);
    }

    public final int hashCode() {
        int b = qoy.b(Boolean.hashCode(this.noStickers) * 31, 31, this.showChatHistory);
        Boolean bool = this.suspiciousCall;
        return b + (bool == null ? 0 : bool.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CallsSettingsDto(noStickers=");
        sb.append(this.noStickers);
        sb.append(", showChatHistory=");
        sb.append(this.showChatHistory);
        sb.append(", suspiciousCall=");
        return tn.a(sb, this.suspiciousCall, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.noStickers ? 1 : 0);
        parcel.writeInt(this.showChatHistory ? 1 : 0);
        Boolean bool = this.suspiciousCall;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool);
        }
    }

    public /* synthetic */ CallsSettingsDto(boolean z, boolean z2, Boolean bool, int i, zcl zclVar) {
        this(z, z2, (i & 4) != 0 ? null : bool);
    }
}
