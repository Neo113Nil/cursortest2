package com.vk.voip.ui.scheduled.creation.feature.models;

import com.vk.core.serialize.Serializer;
import com.vk.dto.common.im.ImageList;
import com.vk.voip.api.id.CallId;
import com.vk.voip.ui.call_list.scheduled.ScheduledScreenSharingMuteOption;
import com.vk.voip.ui.call_list.scheduled.feature.model.ScheduledAudioMuteOption;
import com.vk.voip.ui.call_list.scheduled.feature.model.ScheduledCallRecurrence;
import com.vk.voip.ui.call_list.scheduled.feature.model.ScheduledVideoMuteOption;
import com.vk.voip.ui.call_list.scheduled.feature.model.ScheduledWatchTogetherOption;
import com.vk.voip.userid.CallsUserId;
import xsna.epx;
import xsna.mvo0;
import xsna.s49;
import xsna.x5h0;

/* compiled from: VoipScheduledCallInput.kt */
/* loaded from: classes7.dex */
public final class VoipScheduledCallInput extends Serializer.StreamParcelableAdapter {
    public static final Serializer.c<VoipScheduledCallInput> CREATOR = new a();
    public final x5h0 b;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<VoipScheduledCallInput> {
        @Override // com.vk.core.serialize.Serializer.c
        public final VoipScheduledCallInput a(Serializer serializer) {
            return new VoipScheduledCallInput(serializer);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new VoipScheduledCallInput[i];
        }
    }

    public VoipScheduledCallInput(x5h0 x5h0Var) {
        this.b = x5h0Var;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        x5h0 x5h0Var = this.b;
        CallId callId = x5h0Var.a;
        mvo0 mvo0Var = x5h0Var.f;
        serializer.j0(callId.b);
        serializer.L(x5h0Var.r ? (byte) 1 : (byte) 0);
        serializer.j0(x5h0Var.b);
        serializer.e0(x5h0Var.c);
        serializer.j0(x5h0Var.d);
        serializer.j0(x5h0Var.i);
        serializer.Y(x5h0Var.g);
        serializer.S(x5h0Var.e.ordinal());
        serializer.Y(x5h0Var.h);
        serializer.L(x5h0Var.k ? (byte) 1 : (byte) 0);
        serializer.L(x5h0Var.l ? (byte) 1 : (byte) 0);
        serializer.L(x5h0Var.q ? (byte) 1 : (byte) 0);
        serializer.S(x5h0Var.n.ordinal());
        serializer.S(x5h0Var.o.ordinal());
        ScheduledWatchTogetherOption scheduledWatchTogetherOption = x5h0Var.p;
        serializer.L(scheduledWatchTogetherOption.b ? (byte) 1 : (byte) 0);
        serializer.L(scheduledWatchTogetherOption.c ? (byte) 1 : (byte) 0);
        serializer.L(x5h0Var.m ? (byte) 1 : (byte) 0);
        serializer.S(x5h0Var.t.ordinal());
        serializer.L(x5h0Var.u ? (byte) 1 : (byte) 0);
        s49 s49Var = x5h0Var.j;
        serializer.L(s49Var != null ? (byte) 1 : (byte) 0);
        if (s49Var != null) {
            serializer.Y(s49Var.a);
            serializer.j0(s49Var.b);
            serializer.e0(s49Var.c);
        }
        serializer.L(mvo0Var != null ? (byte) 1 : (byte) 0);
        if (mvo0Var != null) {
            serializer.Y(mvo0Var.a);
        }
        serializer.Y(x5h0Var.s);
        serializer.L(x5h0Var.v ? (byte) 1 : (byte) 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof VoipScheduledCallInput) && epx.f(this.b, ((VoipScheduledCallInput) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return "VoipScheduledCallInput(call=" + this.b + ')';
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public VoipScheduledCallInput(Serializer serializer) {
        this(new x5h0(r1, r23, r22, r25, r6, serializer.m() ? new mvo0(serializer.w()) : null, r7, r9, r11, r1, r13, r14, r15, r16, r17, r12, r19, r20, serializer.w(), ScheduledScreenSharingMuteOption.values()[serializer.u()], serializer.m(), serializer.m()));
        String str;
        CallsUserId callsUserId;
        String str2;
        s49 s49Var;
        String str3;
        String H = serializer.H();
        CallId callId = new CallId(H == null ? "" : H);
        boolean m = serializer.m();
        String H2 = serializer.H();
        H2 = H2 == null ? "" : H2;
        CallsUserId callsUserId2 = (CallsUserId) serializer.A(CallsUserId.class.getClassLoader());
        String H3 = serializer.H();
        H3 = H3 == null ? "" : H3;
        String H4 = serializer.H();
        String str4 = H4 == null ? "" : H4;
        long w = serializer.w();
        ScheduledCallRecurrence scheduledCallRecurrence = ScheduledCallRecurrence.values()[serializer.u()];
        long w2 = serializer.w();
        boolean m2 = serializer.m();
        boolean m3 = serializer.m();
        boolean m4 = serializer.m();
        ScheduledAudioMuteOption scheduledAudioMuteOption = ScheduledAudioMuteOption.values()[serializer.u()];
        ScheduledVideoMuteOption scheduledVideoMuteOption = ScheduledVideoMuteOption.values()[serializer.u()];
        ScheduledWatchTogetherOption scheduledWatchTogetherOption = new ScheduledWatchTogetherOption(serializer.m(), serializer.m());
        boolean m5 = serializer.m();
        if (serializer.m()) {
            str = H2;
            long w3 = serializer.w();
            String H5 = serializer.H();
            if (H5 == null) {
                callsUserId = callsUserId2;
                str3 = "";
            } else {
                callsUserId = callsUserId2;
                str3 = H5;
            }
            str2 = H3;
            s49Var = new s49(w3, str3, (ImageList) serializer.A(ImageList.class.getClassLoader()));
        } else {
            str = H2;
            callsUserId = callsUserId2;
            str2 = H3;
            s49Var = null;
        }
    }
}
