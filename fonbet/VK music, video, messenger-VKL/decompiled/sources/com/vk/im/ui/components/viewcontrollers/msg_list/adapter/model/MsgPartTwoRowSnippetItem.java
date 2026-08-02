package com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model;

import androidx.annotation.CheckResult;
import com.huawei.hms.hihealth.data.DeviceInfo;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.vk.dto.attaches.Attach;
import com.vk.im.engine.models.ProfilesInfo;
import com.vk.im.engine.models.messages.Msg;
import com.vk.im.engine.models.messages.NestedMsg;
import com.vk.im.ui.components.viewcontrollers.msg_list.entry.AdapterEntryType;
import ru.ok.android.api.core.ApiInvocationException;
import xsna.asp;
import xsna.en;
import xsna.epx;
import xsna.ir30;
import xsna.jr30;
import xsna.nsr0;
import xsna.oh30;
import xsna.ol8;
import xsna.pm0;
import xsna.qoy;
import xsna.shy;
import xsna.uk30;
import xsna.urd0;
import xsna.zrp;

/* compiled from: ChatListPartModels.kt */
/* loaded from: classes2.dex */
public final class MsgPartTwoRowSnippetItem implements ir30, ol8 {
    public final jr30 b;
    public final int c;
    public final String d;
    public final String e;
    public final boolean f;
    public final String g;
    public final String h;
    public final MsgPartTwoRowSnippetItemType i;
    public final AdapterEntryType j;
    public final oh30 k;
    public Msg l;
    public NestedMsg m;
    public Attach n;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ChatListPartModels.kt */
    public static final class MsgPartTwoRowSnippetItemType {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ MsgPartTwoRowSnippetItemType[] $VALUES;
        public static final MsgPartTwoRowSnippetItemType AttachHighlight;
        public static final MsgPartTwoRowSnippetItemType AttachPoll;
        public static final MsgPartTwoRowSnippetItemType AttachWall;
        public static final MsgPartTwoRowSnippetItemType Unknown;

        static {
            MsgPartTwoRowSnippetItemType msgPartTwoRowSnippetItemType = new MsgPartTwoRowSnippetItemType("AttachWall", 0);
            AttachWall = msgPartTwoRowSnippetItemType;
            MsgPartTwoRowSnippetItemType msgPartTwoRowSnippetItemType2 = new MsgPartTwoRowSnippetItemType("AttachPoll", 1);
            AttachPoll = msgPartTwoRowSnippetItemType2;
            MsgPartTwoRowSnippetItemType msgPartTwoRowSnippetItemType3 = new MsgPartTwoRowSnippetItemType("AttachHighlight", 2);
            AttachHighlight = msgPartTwoRowSnippetItemType3;
            MsgPartTwoRowSnippetItemType msgPartTwoRowSnippetItemType4 = new MsgPartTwoRowSnippetItemType(DeviceInfo.STR_TYPE_UNKNOWN, 3);
            Unknown = msgPartTwoRowSnippetItemType4;
            MsgPartTwoRowSnippetItemType[] msgPartTwoRowSnippetItemTypeArr = {msgPartTwoRowSnippetItemType, msgPartTwoRowSnippetItemType2, msgPartTwoRowSnippetItemType3, msgPartTwoRowSnippetItemType4};
            $VALUES = msgPartTwoRowSnippetItemTypeArr;
            $ENTRIES = new asp(msgPartTwoRowSnippetItemTypeArr);
        }

        public MsgPartTwoRowSnippetItemType() {
            throw null;
        }

        public static MsgPartTwoRowSnippetItemType valueOf(String str) {
            return (MsgPartTwoRowSnippetItemType) Enum.valueOf(MsgPartTwoRowSnippetItemType.class, str);
        }

        public static MsgPartTwoRowSnippetItemType[] values() {
            return (MsgPartTwoRowSnippetItemType[]) $VALUES.clone();
        }
    }

    public MsgPartTwoRowSnippetItem(jr30 jr30Var, int i, String str, String str2, boolean z, String str3, String str4, MsgPartTwoRowSnippetItemType msgPartTwoRowSnippetItemType, AdapterEntryType adapterEntryType, oh30 oh30Var) {
        this.b = jr30Var;
        this.c = i;
        this.d = str;
        this.e = str2;
        this.f = z;
        this.g = str3;
        this.h = str4;
        this.i = msgPartTwoRowSnippetItemType;
        this.j = adapterEntryType;
        this.k = oh30Var;
    }

    public static MsgPartTwoRowSnippetItem c(MsgPartTwoRowSnippetItem msgPartTwoRowSnippetItem, jr30 jr30Var, oh30 oh30Var, int i) {
        if ((i & 1) != 0) {
            jr30Var = msgPartTwoRowSnippetItem.b;
        }
        jr30 jr30Var2 = jr30Var;
        int i2 = msgPartTwoRowSnippetItem.c;
        String str = msgPartTwoRowSnippetItem.d;
        String str2 = msgPartTwoRowSnippetItem.e;
        boolean z = msgPartTwoRowSnippetItem.f;
        String str3 = msgPartTwoRowSnippetItem.g;
        String str4 = msgPartTwoRowSnippetItem.h;
        MsgPartTwoRowSnippetItemType msgPartTwoRowSnippetItemType = msgPartTwoRowSnippetItem.i;
        AdapterEntryType adapterEntryType = msgPartTwoRowSnippetItem.j;
        if ((i & 512) != 0) {
            oh30Var = msgPartTwoRowSnippetItem.k;
        }
        return new MsgPartTwoRowSnippetItem(jr30Var2, i2, str, str2, z, str3, str4, msgPartTwoRowSnippetItemType, adapterEntryType, oh30Var);
    }

    @Override // xsna.ol8
    public final oh30 M0() {
        return this.k;
    }

    @Override // xsna.ir30
    public final Attach a() {
        return this.n;
    }

    @Override // xsna.ir30
    public final ir30 b(uk30 uk30Var, nsr0 nsr0Var, g gVar, g gVar2) {
        MsgPartTwoRowSnippetItem c = c(this, uk30Var.i(nsr0Var, gVar2, gVar), null, IronSourceError.ERROR_RV_SHOW_CALLED_DURING_SHOW);
        c.n = this.n;
        c.m = this.m;
        c.l = this.l;
        return c;
    }

    @Override // xsna.ir30
    public final ir30 d(uk30 uk30Var, nsr0 nsr0Var, g gVar, g gVar2) {
        MsgPartTwoRowSnippetItem c = c(this, uk30Var.i(nsr0Var, gVar2, gVar), null, IronSourceError.ERROR_RV_SHOW_CALLED_DURING_SHOW);
        c.n = this.n;
        c.m = this.m;
        c.l = this.l;
        return c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MsgPartTwoRowSnippetItem)) {
            return false;
        }
        MsgPartTwoRowSnippetItem msgPartTwoRowSnippetItem = (MsgPartTwoRowSnippetItem) obj;
        return epx.f(this.b, msgPartTwoRowSnippetItem.b) && this.c == msgPartTwoRowSnippetItem.c && epx.f(this.d, msgPartTwoRowSnippetItem.d) && epx.f(this.e, msgPartTwoRowSnippetItem.e) && this.f == msgPartTwoRowSnippetItem.f && epx.f(this.g, msgPartTwoRowSnippetItem.g) && epx.f(this.h, msgPartTwoRowSnippetItem.h) && this.i == msgPartTwoRowSnippetItem.i && this.j == msgPartTwoRowSnippetItem.j && epx.f(this.k, msgPartTwoRowSnippetItem.k);
    }

    public final int hashCode() {
        int b = qoy.b(urd0.a(urd0.a(shy.a(this.c, this.b.hashCode() * 31, 31), 31, this.d), 31, this.e), 31, this.f);
        String str = this.g;
        int hashCode = (b + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.h;
        int c = pm0.c(this.j, (this.i.hashCode() + ((hashCode + (str2 == null ? 0 : str2.hashCode())) * 31)) * 31, 31);
        oh30 oh30Var = this.k;
        return c + (oh30Var != null ? oh30Var.hashCode() : 0);
    }

    @Override // xsna.ir30
    public final AdapterEntryType l() {
        return this.j;
    }

    @Override // xsna.ir30
    public final ir30 n(oh30 oh30Var) {
        MsgPartTwoRowSnippetItem c = c(this, null, oh30Var, ApiInvocationException.ErrorCodes.IDS_BLOCKED);
        c.n = this.n;
        c.m = this.m;
        c.l = this.l;
        return c;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MsgPartTwoRowSnippetItem(timeStatus=");
        sb.append(this.b);
        sb.append(", valueNestedLevel=");
        sb.append(this.c);
        sb.append(", attachText=");
        sb.append(this.d);
        sb.append(", poolQuestion=");
        sb.append(this.e);
        sb.append(", attachHighlightIsDeleted=");
        sb.append(this.f);
        sb.append(", attachHighlightOwnerFirstNameGen=");
        sb.append(this.g);
        sb.append(", attachHighlightOwnerName=");
        sb.append(this.h);
        sb.append(", type=");
        sb.append(this.i);
        sb.append(", viewType=");
        sb.append(this.j);
        sb.append(", bubbleStyle=");
        return en.d(sb, this.k, ')');
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
