package com.vk.im.engine.commands.channels;

import java.util.List;
import xsna.asp;
import xsna.bpn0;
import xsna.bz2;
import xsna.d9w;
import xsna.epx;
import xsna.hy2;
import xsna.le6;
import xsna.ms9;
import xsna.s3q0;
import xsna.w2w;
import xsna.zrp;

/* compiled from: ChannelInviteUsersCmd.kt */
/* loaded from: classes2.dex */
public final class ChannelInviteUsersCmd extends le6<s3q0> {
    public final long b;
    public final InviteOptions c;
    public final List<Long> d;
    public final bpn0 e = new bpn0(new hy2(3));

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ChannelInviteUsersCmd.kt */
    public static final class InviteOptions {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ InviteOptions[] $VALUES;
        public static final InviteOptions ALL;
        public static final InviteOptions NOT_DEFINED;
        public static final InviteOptions SUBSCRIBERS;

        static {
            InviteOptions inviteOptions = new InviteOptions("ALL", 0);
            ALL = inviteOptions;
            InviteOptions inviteOptions2 = new InviteOptions("SUBSCRIBERS", 1);
            SUBSCRIBERS = inviteOptions2;
            InviteOptions inviteOptions3 = new InviteOptions("NOT_DEFINED", 2);
            NOT_DEFINED = inviteOptions3;
            InviteOptions[] inviteOptionsArr = {inviteOptions, inviteOptions2, inviteOptions3};
            $VALUES = inviteOptionsArr;
            $ENTRIES = new asp(inviteOptionsArr);
        }

        public InviteOptions() {
            throw null;
        }

        public static InviteOptions valueOf(String str) {
            return (InviteOptions) Enum.valueOf(InviteOptions.class, str);
        }

        public static InviteOptions[] values() {
            return (InviteOptions[]) $VALUES.clone();
        }
    }

    public ChannelInviteUsersCmd(long j, InviteOptions inviteOptions, List<Long> list) {
        this.b = j;
        this.c = inviteOptions;
        this.d = list;
    }

    @Override // xsna.le6
    public final s3q0 e(w2w w2wVar) {
        InviteOptions inviteOptions = InviteOptions.NOT_DEFINED;
        List<Long> list = this.d;
        InviteOptions inviteOptions2 = this.c;
        if (inviteOptions2 != inviteOptions || !list.isEmpty()) {
            try {
                bz2.c(new a(this.b, inviteOptions2, list), null);
            } catch (Throwable th) {
                ((d9w) this.e.getValue()).a(th);
            }
        }
        return s3q0.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChannelInviteUsersCmd)) {
            return false;
        }
        ChannelInviteUsersCmd channelInviteUsersCmd = (ChannelInviteUsersCmd) obj;
        return this.b == channelInviteUsersCmd.b && this.c == channelInviteUsersCmd.c && epx.f(this.d, channelInviteUsersCmd.d);
    }

    @Override // xsna.le6, xsna.e1w
    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + (Long.hashCode(this.b) * 31)) * 31);
    }

    @Override // xsna.e1w
    public final String toString() {
        StringBuilder sb = new StringBuilder("ChannelInviteUsersCmd(channelId=");
        sb.append(this.b);
        sb.append(", options=");
        sb.append(this.c);
        sb.append(", users=");
        return ms9.a(')', sb, this.d);
    }
}
