package com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model;

import androidx.annotation.CheckResult;
import com.huawei.hms.hihealth.data.DeviceInfo;
import com.vk.dto.attaches.Attach;
import com.vk.dto.common.Peer;
import com.vk.im.engine.models.CallState;
import com.vk.im.engine.models.ProfilesInfo;
import com.vk.im.engine.models.messages.Msg;
import com.vk.im.engine.models.messages.NestedMsg;
import com.vk.im.ui.components.viewcontrollers.msg_list.entry.AdapterEntryType;
import java.util.List;
import xsna.asp;
import xsna.bh10;
import xsna.en;
import xsna.epx;
import xsna.fw3;
import xsna.ir30;
import xsna.jr30;
import xsna.nsr0;
import xsna.oh30;
import xsna.ol8;
import xsna.pm0;
import xsna.qoy;
import xsna.rxd0;
import xsna.shy;
import xsna.uk30;
import xsna.zrp;

/* compiled from: ChatListPartModels.kt */
/* loaded from: classes2.dex */
public final class MsgPartGroupCallHolderItem implements ir30, ol8 {
    public final jr30 b;
    public final Peer c;
    public final rxd0 d;
    public final int e;
    public final String f;
    public final String g;
    public final List<Long> h;
    public final boolean i;
    public final int j;
    public final CallState k;
    public final int l;
    public final AttachGroupCallInProgressType m;
    public final AdapterEntryType n;
    public final oh30 o;
    public Msg p;
    public NestedMsg q;
    public Attach r;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ChatListPartModels.kt */
    public static final class AttachGroupCallInProgressType {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ AttachGroupCallInProgressType[] $VALUES;
        public static final AttachGroupCallInProgressType AttachGroupCallFinished;
        public static final AttachGroupCallInProgressType AttachGroupCallInProgress;
        public static final AttachGroupCallInProgressType Unknown;

        static {
            AttachGroupCallInProgressType attachGroupCallInProgressType = new AttachGroupCallInProgressType("AttachGroupCallInProgress", 0);
            AttachGroupCallInProgress = attachGroupCallInProgressType;
            AttachGroupCallInProgressType attachGroupCallInProgressType2 = new AttachGroupCallInProgressType("AttachGroupCallFinished", 1);
            AttachGroupCallFinished = attachGroupCallInProgressType2;
            AttachGroupCallInProgressType attachGroupCallInProgressType3 = new AttachGroupCallInProgressType(DeviceInfo.STR_TYPE_UNKNOWN, 2);
            Unknown = attachGroupCallInProgressType3;
            AttachGroupCallInProgressType[] attachGroupCallInProgressTypeArr = {attachGroupCallInProgressType, attachGroupCallInProgressType2, attachGroupCallInProgressType3};
            $VALUES = attachGroupCallInProgressTypeArr;
            $ENTRIES = new asp(attachGroupCallInProgressTypeArr);
        }

        public AttachGroupCallInProgressType() {
            throw null;
        }

        public static AttachGroupCallInProgressType valueOf(String str) {
            return (AttachGroupCallInProgressType) Enum.valueOf(AttachGroupCallInProgressType.class, str);
        }

        public static AttachGroupCallInProgressType[] values() {
            return (AttachGroupCallInProgressType[]) $VALUES.clone();
        }
    }

    public MsgPartGroupCallHolderItem(jr30 jr30Var, Peer peer, rxd0 rxd0Var, int i, String str, String str2, List<Long> list, boolean z, int i2, CallState callState, int i3, AttachGroupCallInProgressType attachGroupCallInProgressType, AdapterEntryType adapterEntryType, oh30 oh30Var) {
        this.b = jr30Var;
        this.c = peer;
        this.d = rxd0Var;
        this.e = i;
        this.f = str;
        this.g = str2;
        this.h = list;
        this.i = z;
        this.j = i2;
        this.k = callState;
        this.l = i3;
        this.m = attachGroupCallInProgressType;
        this.n = adapterEntryType;
        this.o = oh30Var;
    }

    public static MsgPartGroupCallHolderItem c(MsgPartGroupCallHolderItem msgPartGroupCallHolderItem, jr30 jr30Var, Peer peer, oh30 oh30Var, int i) {
        return new MsgPartGroupCallHolderItem((i & 1) != 0 ? msgPartGroupCallHolderItem.b : jr30Var, (i & 2) != 0 ? msgPartGroupCallHolderItem.c : peer, msgPartGroupCallHolderItem.d, msgPartGroupCallHolderItem.e, msgPartGroupCallHolderItem.f, msgPartGroupCallHolderItem.g, msgPartGroupCallHolderItem.h, msgPartGroupCallHolderItem.i, msgPartGroupCallHolderItem.j, msgPartGroupCallHolderItem.k, msgPartGroupCallHolderItem.l, msgPartGroupCallHolderItem.m, msgPartGroupCallHolderItem.n, (i & 8192) != 0 ? msgPartGroupCallHolderItem.o : oh30Var);
    }

    @Override // xsna.ol8
    public final oh30 M0() {
        return this.o;
    }

    @Override // xsna.ir30
    public final Attach a() {
        return this.r;
    }

    @Override // xsna.ir30
    public final ir30 b(uk30 uk30Var, nsr0 nsr0Var, g gVar, g gVar2) {
        MsgPartGroupCallHolderItem c = c(this, uk30Var.i(nsr0Var, gVar2, gVar), uk30Var.l, null, 16380);
        c.r = this.r;
        c.q = this.q;
        c.p = this.p;
        return c;
    }

    @Override // xsna.ir30
    public final ir30 d(uk30 uk30Var, nsr0 nsr0Var, g gVar, g gVar2) {
        MsgPartGroupCallHolderItem c = c(this, uk30Var.i(nsr0Var, gVar2, gVar), null, null, 16382);
        c.r = this.r;
        c.q = this.q;
        c.p = this.p;
        return c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MsgPartGroupCallHolderItem)) {
            return false;
        }
        MsgPartGroupCallHolderItem msgPartGroupCallHolderItem = (MsgPartGroupCallHolderItem) obj;
        return epx.f(this.b, msgPartGroupCallHolderItem.b) && epx.f(this.c, msgPartGroupCallHolderItem.c) && epx.f(this.d, msgPartGroupCallHolderItem.d) && this.e == msgPartGroupCallHolderItem.e && epx.f(this.f, msgPartGroupCallHolderItem.f) && epx.f(this.g, msgPartGroupCallHolderItem.g) && epx.f(this.h, msgPartGroupCallHolderItem.h) && this.i == msgPartGroupCallHolderItem.i && this.j == msgPartGroupCallHolderItem.j && this.k == msgPartGroupCallHolderItem.k && this.l == msgPartGroupCallHolderItem.l && this.m == msgPartGroupCallHolderItem.m && this.n == msgPartGroupCallHolderItem.n && epx.f(this.o, msgPartGroupCallHolderItem.o);
    }

    public final int hashCode() {
        int a = bh10.a(this.b.hashCode() * 31, 31, this.c.b);
        rxd0 rxd0Var = this.d;
        int a2 = shy.a(this.e, (a + (rxd0Var == null ? 0 : rxd0Var.hashCode())) * 31, 31);
        String str = this.f;
        int hashCode = (a2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.g;
        int c = pm0.c(this.n, (this.m.hashCode() + shy.a(this.l, (this.k.hashCode() + shy.a(this.j, qoy.b(fw3.a((hashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.h), 31, this.i), 31)) * 31, 31)) * 31, 31);
        oh30 oh30Var = this.o;
        return c + (oh30Var != null ? oh30Var.hashCode() : 0);
    }

    @Override // xsna.ir30
    public final AdapterEntryType l() {
        return this.n;
    }

    @Override // xsna.ir30
    public final ir30 n(oh30 oh30Var) {
        MsgPartGroupCallHolderItem c = c(this, null, null, oh30Var, 8191);
        c.r = this.r;
        c.q = this.q;
        c.p = this.p;
        return c;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MsgPartGroupCallHolderItem(timeStatus=");
        sb.append(this.b);
        sb.append(", currentMember=");
        sb.append(this.c);
        sb.append(", profileMediators=");
        sb.append(this.d);
        sb.append(", valueNestedLevel=");
        sb.append(this.e);
        sb.append(", attachJoinLink=");
        sb.append(this.f);
        sb.append(", attachVkJoinLink=");
        sb.append(this.g);
        sb.append(", participantsIds=");
        sb.append(this.h);
        sb.append(", isOutgoing=");
        sb.append(this.i);
        sb.append(", attachDuration=");
        sb.append(this.j);
        sb.append(", state=");
        sb.append(this.k);
        sb.append(", allParticipantsTotalParticipantsCount=");
        sb.append(this.l);
        sb.append(", type=");
        sb.append(this.m);
        sb.append(", viewType=");
        sb.append(this.n);
        sb.append(", bubbleStyle=");
        return en.d(sb, this.o, ')');
    }

    @Override // xsna.ir30
    @CheckResult
    public final ir30 u(boolean z) {
        return this;
    }

    @Override // xsna.ir30
    @CheckResult
    public final ir30 d0(Boolean bool, Boolean bool2) {
        return this;
    }

    @Override // xsna.ir30
    @CheckResult
    public final ir30 s(ProfilesInfo profilesInfo, uk30 uk30Var) {
        return this;
    }
}
