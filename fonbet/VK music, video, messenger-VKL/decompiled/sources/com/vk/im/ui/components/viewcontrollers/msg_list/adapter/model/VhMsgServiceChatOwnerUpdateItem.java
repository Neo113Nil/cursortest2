package com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model;

import androidx.annotation.CheckResult;
import com.vk.dto.attaches.Attach;
import com.vk.dto.common.Peer;
import com.vk.im.engine.models.ProfilesInfo;
import com.vk.im.engine.models.messages.Msg;
import com.vk.im.engine.models.messages.MsgChatOwnerUpdate;
import com.vk.im.engine.models.messages.NestedMsg;
import com.vk.im.ui.components.viewcontrollers.msg_list.entry.AdapterEntryType;
import defpackage.q0;
import xsna.asp;
import xsna.epx;
import xsna.oh30;
import xsna.pm0;
import xsna.qtd0;
import xsna.uk30;
import xsna.y060;
import xsna.zrp;

/* compiled from: ChatListModels.kt */
/* loaded from: classes2.dex */
public final class VhMsgServiceChatOwnerUpdateItem implements g {
    public final c b;
    public final AdapterEntryType c;
    public final qtd0 d;
    public final Peer e;
    public final Type f;
    public final boolean g;
    public MsgChatOwnerUpdate h;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ChatListModels.kt */
    public static final class Type {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Type[] $VALUES;
        public static final Type ANY_ADMIN;
        public static final Type ANY_USER;
        public static final Type CHANGED;
        public static final Type USER;

        static {
            Type type = new Type("CHANGED", 0);
            CHANGED = type;
            Type type2 = new Type("ANY_USER", 1);
            ANY_USER = type2;
            Type type3 = new Type("USER", 2);
            USER = type3;
            Type type4 = new Type("ANY_ADMIN", 3);
            ANY_ADMIN = type4;
            Type[] typeArr = {type, type2, type3, type4};
            $VALUES = typeArr;
            $ENTRIES = new asp(typeArr);
        }

        public Type() {
            throw null;
        }

        public static Type valueOf(String str) {
            return (Type) Enum.valueOf(Type.class, str);
        }

        public static Type[] values() {
            return (Type[]) $VALUES.clone();
        }
    }

    public VhMsgServiceChatOwnerUpdateItem(c cVar, AdapterEntryType adapterEntryType, qtd0 qtd0Var, Peer peer, Type type, boolean z) {
        this.b = cVar;
        this.c = adapterEntryType;
        this.d = qtd0Var;
        this.e = peer;
        this.f = type;
        this.g = z;
    }

    @Override // com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g
    public final boolean B() {
        return false;
    }

    @Override // com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g
    public final NestedMsg D0() {
        return null;
    }

    @Override // com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g
    public final c E0() {
        return this.b;
    }

    @Override // com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g
    public final CharSequence K() {
        return null;
    }

    @Override // com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g
    public final boolean K0() {
        return false;
    }

    @Override // xsna.ol8
    public final oh30 M0() {
        return null;
    }

    @Override // com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g
    public final Msg Q() {
        return this.h;
    }

    @Override // com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g
    public final g X(uk30 uk30Var) {
        VhMsgServiceChatOwnerUpdateItem vhMsgServiceChatOwnerUpdateItem = new VhMsgServiceChatOwnerUpdateItem(this.b, this.c, uk30Var.e.Bb(this.e), this.e, this.f, uk30Var.q);
        vhMsgServiceChatOwnerUpdateItem.h = this.h;
        return vhMsgServiceChatOwnerUpdateItem;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VhMsgServiceChatOwnerUpdateItem)) {
            return false;
        }
        VhMsgServiceChatOwnerUpdateItem vhMsgServiceChatOwnerUpdateItem = (VhMsgServiceChatOwnerUpdateItem) obj;
        return epx.f(this.b, vhMsgServiceChatOwnerUpdateItem.b) && this.c == vhMsgServiceChatOwnerUpdateItem.c && epx.f(this.d, vhMsgServiceChatOwnerUpdateItem.d) && epx.f(this.e, vhMsgServiceChatOwnerUpdateItem.e) && this.f == vhMsgServiceChatOwnerUpdateItem.f && this.g == vhMsgServiceChatOwnerUpdateItem.g;
    }

    public final int hashCode() {
        c cVar = this.b;
        int c = pm0.c(this.c, (cVar == null ? 0 : cVar.hashCode()) * 31, 31);
        qtd0 qtd0Var = this.d;
        int hashCode = (c + (qtd0Var == null ? 0 : qtd0Var.hashCode())) * 31;
        Peer peer = this.e;
        return Boolean.hashCode(this.g) + ((this.f.hashCode() + ((hashCode + (peer != null ? Long.hashCode(peer.b) : 0)) * 31)) * 31);
    }

    @Override // com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g
    public final AdapterEntryType l() {
        return this.c;
    }

    @Override // com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g
    public final boolean q() {
        return false;
    }

    @Override // com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g
    public final y060 q0() {
        return null;
    }

    @Override // com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g
    public final a s0() {
        return null;
    }

    @Override // com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g
    public final int t() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VhMsgServiceChatOwnerUpdateItem(msgMeta=");
        sb.append(this.b);
        sb.append(", viewType=");
        sb.append(this.c);
        sb.append(", msgFromProfile=");
        sb.append(this.d);
        sb.append(", memberFrom=");
        sb.append(this.e);
        sb.append(", type=");
        sb.append(this.f);
        sb.append(", isBackgroundSet=");
        return q0.a(sb, this.g, ')');
    }

    @Override // com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g, xsna.zwk
    public final long v() {
        return 0L;
    }

    @Override // com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g
    public final boolean w0() {
        return false;
    }

    @Override // com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g
    public final Attach x() {
        return null;
    }

    @Override // com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g
    @CheckResult
    public final g n(oh30 oh30Var) {
        return this;
    }

    @Override // com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g
    @CheckResult
    public final g u(boolean z) {
        return this;
    }

    @Override // com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g
    @CheckResult
    public final g y(boolean z) {
        return this;
    }

    @Override // com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g
    @CheckResult
    public final g s(ProfilesInfo profilesInfo, uk30 uk30Var) {
        return this;
    }

    @Override // com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g
    @CheckResult
    public final g B0(g gVar, g gVar2, uk30 uk30Var) {
        return this;
    }

    @Override // com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g
    @CheckResult
    public final g H(Boolean bool, Boolean bool2, Integer num) {
        return this;
    }
}
