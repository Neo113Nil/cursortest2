package com.vk.stat.scheme;

import com.vk.stat.scheme.SchemeStat$TypeAction;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.qoy;
import xsna.urd0;
import xsna.zcl;

/* compiled from: MobileOfficialAppsCallsStat.kt */
/* loaded from: classes5.dex */
public final class MobileOfficialAppsCallsStat$TypeVoipErrorItem implements SchemeStat$TypeAction.b {

    @pmi0("exception_type")
    private final String exceptionType;

    @pmi0("from_peer_id")
    private final String fromPeerId;

    @pmi0("has_network")
    private final Boolean hasNetwork;

    @pmi0("is_group_call")
    private final boolean isGroupCall;

    @pmi0("is_incoming_call")
    private final boolean isIncomingCall;

    @pmi0("to_peer_id")
    private final String toPeerId;

    public MobileOfficialAppsCallsStat$TypeVoipErrorItem(String str, String str2, boolean z, boolean z2, Boolean bool, String str3) {
        this.fromPeerId = str;
        this.toPeerId = str2;
        this.isGroupCall = z;
        this.isIncomingCall = z2;
        this.hasNetwork = bool;
        this.exceptionType = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MobileOfficialAppsCallsStat$TypeVoipErrorItem)) {
            return false;
        }
        MobileOfficialAppsCallsStat$TypeVoipErrorItem mobileOfficialAppsCallsStat$TypeVoipErrorItem = (MobileOfficialAppsCallsStat$TypeVoipErrorItem) obj;
        return epx.f(this.fromPeerId, mobileOfficialAppsCallsStat$TypeVoipErrorItem.fromPeerId) && epx.f(this.toPeerId, mobileOfficialAppsCallsStat$TypeVoipErrorItem.toPeerId) && this.isGroupCall == mobileOfficialAppsCallsStat$TypeVoipErrorItem.isGroupCall && this.isIncomingCall == mobileOfficialAppsCallsStat$TypeVoipErrorItem.isIncomingCall && epx.f(this.hasNetwork, mobileOfficialAppsCallsStat$TypeVoipErrorItem.hasNetwork) && epx.f(this.exceptionType, mobileOfficialAppsCallsStat$TypeVoipErrorItem.exceptionType);
    }

    public final int hashCode() {
        int b = qoy.b(qoy.b(urd0.a(this.fromPeerId.hashCode() * 31, 31, this.toPeerId), 31, this.isGroupCall), 31, this.isIncomingCall);
        Boolean bool = this.hasNetwork;
        int hashCode = (b + (bool == null ? 0 : bool.hashCode())) * 31;
        String str = this.exceptionType;
        return hashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TypeVoipErrorItem(fromPeerId=");
        sb.append(this.fromPeerId);
        sb.append(", toPeerId=");
        sb.append(this.toPeerId);
        sb.append(", isGroupCall=");
        sb.append(this.isGroupCall);
        sb.append(", isIncomingCall=");
        sb.append(this.isIncomingCall);
        sb.append(", hasNetwork=");
        sb.append(this.hasNetwork);
        sb.append(", exceptionType=");
        return ho8.a(sb, this.exceptionType, ')');
    }

    public /* synthetic */ MobileOfficialAppsCallsStat$TypeVoipErrorItem(String str, String str2, boolean z, boolean z2, Boolean bool, String str3, int i, zcl zclVar) {
        this(str, str2, z, z2, (i & 16) != 0 ? null : bool, (i & 32) != 0 ? null : str3);
    }
}
