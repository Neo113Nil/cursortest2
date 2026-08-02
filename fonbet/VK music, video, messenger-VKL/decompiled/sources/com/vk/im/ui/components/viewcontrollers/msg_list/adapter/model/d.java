package com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model;

import androidx.annotation.CheckResult;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.vk.dto.attaches.Attach;
import com.vk.dto.common.Peer;
import com.vk.dto.common.im.ImageList;
import com.vk.im.engine.models.ProfilesInfo;
import com.vk.im.engine.models.messages.Msg;
import com.vk.im.engine.models.messages.NestedMsg;
import com.vk.im.ui.components.viewcontrollers.msg_list.entry.AdapterEntryType;
import defpackage.q0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.collections.EmptySet;
import xsna.bh10;
import xsna.epx;
import xsna.ir30;
import xsna.j5g;
import xsna.l6u;
import xsna.nsr0;
import xsna.oh30;
import xsna.qoy;
import xsna.qtd0;
import xsna.shy;
import xsna.uk30;
import xsna.urd0;

/* compiled from: ChatListPartModels.kt */
/* loaded from: classes2.dex */
public final class d implements ir30 {
    public final int b;
    public final Peer c;
    public final ImageList d;
    public final String e;
    public final CharSequence f;
    public final boolean g;
    public final CharSequence h;
    public final List<Peer> i;
    public final List<ImageList> j;
    public final int k;
    public final boolean l;
    public final AdapterEntryType m = AdapterEntryType.TYPE_NESTED_FORWARD;
    public Msg n;

    /* compiled from: ChatListPartModels.kt */
    public static final class a {
        /* JADX WARN: Multi-variable type inference failed */
        public static Set a(Msg msg, Integer num) {
            com.vk.im.engine.models.messages.a aVar = msg instanceof com.vk.im.engine.models.messages.a ? (com.vk.im.engine.models.messages.a) msg : null;
            NestedMsg X5 = aVar != null ? aVar.X5(new l6u(num, 16)) : null;
            if (X5 == null || !X5.db()) {
                return EmptySet.b;
            }
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            Iterator it = X5.X1().iterator();
            while (it.hasNext()) {
                NestedMsg nestedMsg = (NestedMsg) it.next();
                if (linkedHashSet.size() < 3) {
                    linkedHashSet.add(nestedMsg.f);
                    Iterator it2 = nestedMsg.X1().iterator();
                    while (it2.hasNext()) {
                        b((NestedMsg) it2.next(), linkedHashSet);
                    }
                }
            }
            return linkedHashSet;
        }

        public static void b(NestedMsg nestedMsg, LinkedHashSet linkedHashSet) {
            if (linkedHashSet.size() >= 3) {
                return;
            }
            linkedHashSet.add(nestedMsg.f);
            Iterator it = nestedMsg.X1().iterator();
            while (it.hasNext()) {
                b((NestedMsg) it.next(), linkedHashSet);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public d(int i, Peer peer, ImageList imageList, String str, CharSequence charSequence, boolean z, CharSequence charSequence2, List<? extends Peer> list, List<ImageList> list2, int i2, boolean z2) {
        this.b = i;
        this.c = peer;
        this.d = imageList;
        this.e = str;
        this.f = charSequence;
        this.g = z;
        this.h = charSequence2;
        this.i = list;
        this.j = list2;
        this.k = i2;
        this.l = z2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static d c(d dVar, ImageList imageList, String str, CharSequence charSequence, List list, ArrayList arrayList, boolean z, int i) {
        int i2 = dVar.b;
        Peer peer = dVar.c;
        if ((i & 4) != 0) {
            imageList = dVar.d;
        }
        ImageList imageList2 = imageList;
        if ((i & 8) != 0) {
            str = dVar.e;
        }
        return new d(i2, peer, imageList2, str, (i & 16) != 0 ? dVar.f : charSequence, dVar.g, dVar.h, (i & 128) != 0 ? dVar.i : list, (i & 256) != 0 ? dVar.j : arrayList, dVar.k, (i & 1024) != 0 ? dVar.l : z);
    }

    @Override // xsna.ir30
    public final Attach a() {
        return null;
    }

    @Override // xsna.ir30
    public final ir30 b(uk30 uk30Var, nsr0 nsr0Var, g gVar, g gVar2) {
        d c = c(this, null, null, null, null, null, uk30Var.f(nsr0Var, gVar), IronSourceError.ERROR_RV_SHOW_CALLED_WRONG_STATE);
        c.n = this.n;
        return c;
    }

    @Override // xsna.ir30
    public final ir30 d(uk30 uk30Var, nsr0 nsr0Var, g gVar, g gVar2) {
        d c = c(this, null, null, null, null, null, uk30Var.f(nsr0Var, gVar), IronSourceError.ERROR_RV_SHOW_CALLED_WRONG_STATE);
        c.n = this.n;
        return c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.b == dVar.b && epx.f(this.c, dVar.c) && epx.f(this.d, dVar.d) && epx.f(this.e, dVar.e) && epx.f(this.f, dVar.f) && this.g == dVar.g && epx.f(this.h, dVar.h) && epx.f(this.i, dVar.i) && epx.f(this.j, dVar.j) && this.k == dVar.k && this.l == dVar.l;
    }

    public final int hashCode() {
        int a2 = bh10.a(Integer.hashCode(this.b) * 31, 31, this.c.b);
        ImageList imageList = this.d;
        int a3 = urd0.a((a2 + (imageList == null ? 0 : imageList.b.hashCode())) * 31, 31, this.e);
        CharSequence charSequence = this.f;
        int b = qoy.b((a3 + (charSequence == null ? 0 : charSequence.hashCode())) * 31, 31, this.g);
        CharSequence charSequence2 = this.h;
        int hashCode = (b + (charSequence2 == null ? 0 : charSequence2.hashCode())) * 31;
        List<Peer> list = this.i;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        List<ImageList> list2 = this.j;
        return Boolean.hashCode(this.l) + shy.a(this.k, (hashCode2 + (list2 != null ? list2.hashCode() : 0)) * 31, 31);
    }

    @Override // xsna.ir30
    public final AdapterEntryType l() {
        return this.m;
    }

    @Override // xsna.ir30
    public final ir30 s(ProfilesInfo profilesInfo, uk30 uk30Var) {
        Set a2 = a.a(this.n, Integer.valueOf(this.b));
        qtd0 Bb = profilesInfo.Bb(this.c);
        CharSequence i = uk30Var.f0.i(Bb);
        ImageList C8 = Bb != null ? Bb.C8() : null;
        String name = Bb != null ? Bb.name() : null;
        if (name == null) {
            name = "";
        }
        String str = name;
        Set set = a2;
        List O0 = j5g.O0(set);
        ArrayList arrayList = new ArrayList();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            qtd0 Bb2 = profilesInfo.Bb((Peer) it.next());
            ImageList C82 = Bb2 != null ? Bb2.C8() : null;
            if (C82 != null) {
                arrayList.add(C82);
            }
        }
        d c = c(this, C8, str, i, O0, arrayList, false, 1635);
        c.n = this.n;
        return c;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MsgPartNestedForwardHolderItem(nestedMsgLocalId=");
        sb.append(this.b);
        sb.append(", authorPeer=");
        sb.append(this.c);
        sb.append(", avatarImages=");
        sb.append(this.d);
        sb.append(", profileName=");
        sb.append(this.e);
        sb.append(", formattedName=");
        sb.append((Object) this.f);
        sb.append(", hasTextBody=");
        sb.append(this.g);
        sb.append(", formattedBody=");
        sb.append((Object) this.h);
        sb.append(", nestedAuthorPeers=");
        sb.append(this.i);
        sb.append(", nestedAuthorAvatarImages=");
        sb.append(this.j);
        sb.append(", nestedForwardsCount=");
        sb.append(this.k);
        sb.append(", isGradientBubble=");
        return q0.a(sb, this.l, ')');
    }

    @Override // xsna.ir30
    @CheckResult
    public final ir30 n(oh30 oh30Var) {
        return this;
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
}
