package com.vk.voip.ui.groupcalls.list;

import com.vk.voip.dto.call_member.CallMemberId;
import com.vk.voip.ui.groupcalls.GroupCallViewModel;
import com.vk.voip.ui.groupcalls.list.a;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.epx;
import xsna.g0t;
import xsna.kiu;
import xsna.xzs;

/* compiled from: ListGroupCallView.kt */
/* loaded from: classes7.dex */
public final /* synthetic */ class b implements a.InterfaceC2054a, g0t {
    public final /* synthetic */ GroupCallViewModel b;

    public b(GroupCallViewModel groupCallViewModel) {
        this.b = groupCallViewModel;
    }

    public final kiu a(CallMemberId callMemberId) {
        this.b.getClass();
        return GroupCallViewModel.b(callMemberId);
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof a.InterfaceC2054a) && (obj instanceof g0t)) {
            return epx.f(getFunctionDelegate(), ((g0t) obj).getFunctionDelegate());
        }
        return false;
    }

    @Override // xsna.g0t
    public final xzs<?> getFunctionDelegate() {
        return new FunctionReferenceImpl(1, this.b, GroupCallViewModel.class, "findByMemberId", "findByMemberId(Lcom/vk/voip/dto/call_member/CallMemberId;)Lcom/vk/voip/ui/groupcalls/GroupCallParticipantViewModel;", 0);
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }
}
