package com.vk.im.engine.utils;

import com.vk.core.serialize.Serializer;
import com.vk.dto.attaches.Attach;
import com.vk.dto.attaches.AttachAudioMsg;
import com.vk.dto.attaches.AttachGift;
import com.vk.dto.attaches.AttachWithDownload;
import com.vk.dto.attaches.AttachWithTranscription;
import com.vk.dto.common.Peer;
import com.vk.im.engine.models.attaches.AttachCall;
import com.vk.im.engine.models.attaches.AttachGroupCall;
import com.vk.im.engine.models.attaches.AttachUgcSticker;
import com.vk.im.engine.models.attaches.AttachVideo;
import com.vk.im.engine.models.attaches.AttachVideoMsg;
import com.vk.im.engine.models.credentials.UserCredentials;
import com.vk.im.engine.models.dialogs.ChatSettings;
import com.vk.im.engine.models.dialogs.Dialog;
import com.vk.im.engine.models.messages.Msg;
import com.vk.im.engine.models.messages.MsgFromUser;
import com.vk.im.engine.models.messages.NestedMsg;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import xsna.a1w;
import xsna.bh10;
import xsna.c3v;
import xsna.drm0;
import xsna.e43;
import xsna.epx;
import xsna.i5g;
import xsna.izs;
import xsna.j0r;
import xsna.j5g;
import xsna.o25;
import xsna.p7x;
import xsna.pzv;
import xsna.q1w;
import xsna.qoy;
import xsna.rli0;
import xsna.s3j0;
import xsna.ug30;
import xsna.uki0;
import xsna.ulp0;
import xsna.ulz;
import xsna.vu5;
import xsna.x3w;
import xsna.xuo0;

/* compiled from: MsgPermissionHelper.kt */
/* loaded from: classes2.dex */
public final class a {
    public static final long a = TimeUnit.MINUTES.toSeconds(30);
    public static final List<Peer.Type> b = e43.l(Peer.Type.USER, Peer.Type.GROUP, Peer.Type.CHAT);

    /* compiled from: MsgPermissionHelper.kt */
    /* renamed from: com.vk.im.engine.utils.a$a, reason: collision with other inner class name */
    public static final class C1128a {
        public final ug30 a;
        public final Dialog b;
        public final Collection<Msg> c;
        public final pzv d;
        public final Peer e;
        public final boolean f;
        public final boolean g;
        public final long h;
        public final int i;

        /* JADX WARN: Multi-variable type inference failed */
        public C1128a(ug30 ug30Var, Dialog dialog, Collection<? extends Msg> collection, pzv pzvVar, Peer peer, boolean z, boolean z2, long j, int i) {
            this.a = ug30Var;
            this.b = dialog;
            this.c = collection;
            this.d = pzvVar;
            this.e = peer;
            this.f = z;
            this.g = z2;
            this.h = j;
            this.i = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C1128a)) {
                return false;
            }
            C1128a c1128a = (C1128a) obj;
            return epx.f(this.a, c1128a.a) && epx.f(this.b, c1128a.b) && epx.f(this.c, c1128a.c) && epx.f(this.d, c1128a.d) && epx.f(this.e, c1128a.e) && this.f == c1128a.f && this.g == c1128a.g && this.h == c1128a.h && this.i == c1128a.i;
        }

        public final int hashCode() {
            return Integer.hashCode(this.i) + bh10.a(qoy.b(qoy.b(bh10.a((this.d.hashCode() + s3j0.a((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, this.c, 31)) * 31, 31, this.e.b), 31, this.f), 31, this.g), 31, this.h);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Args(action=");
            sb.append(this.a);
            sb.append(", dialog=");
            sb.append(this.b);
            sb.append(", messages=");
            sb.append(this.c);
            sb.append(", imConfig=");
            sb.append(this.d);
            sb.append(", currentMember=");
            sb.append(this.e);
            sb.append(", canWrite=");
            sb.append(this.f);
            sb.append(", msgRequestStatusIsSuccessful=");
            sb.append(this.g);
            sb.append(", dialogId=");
            sb.append(this.h);
            sb.append(", pinnedMsgCnvId=");
            return vu5.b(sb, this.i, ')');
        }
    }

    /* compiled from: _Sequences.kt */
    public static final class b implements izs<Object, Boolean> {
        public static final b b = new b();

        @Override // xsna.izs
        public final Boolean invoke(Object obj) {
            return Boolean.valueOf(obj instanceof AttachUgcSticker);
        }
    }

    public static boolean a(MsgFromUser msgFromUser) {
        c3v c3vVar = new c3v(3);
        msgFromUser.getClass();
        return com.vk.im.engine.models.messages.a.Q7(msgFromUser, c3vVar, true) != null;
    }

    public static boolean b(MsgFromUser msgFromUser) {
        ulz ulzVar = new ulz(6);
        msgFromUser.getClass();
        return com.vk.im.engine.models.messages.a.Q7(msgFromUser, ulzVar, true) != null;
    }

    public static boolean c(Collection collection, uki0 uki0Var) {
        Collection collection2 = collection;
        uki0 y = rli0.y(rli0.h(rli0.x(new ulp0(rli0.j(rli0.p(new i5g(collection2), new j0r(8)), b.b), new p7x(7)), uki0Var)), 2);
        if (rli0.g(y) <= 1) {
            if ((collection2 instanceof Collection) && collection2.isEmpty()) {
                return false;
            }
            Iterator it = collection2.iterator();
            while (it.hasNext()) {
                if (c(((com.vk.im.engine.models.messages.a) it.next()).q7(), y)) {
                }
            }
            return false;
        }
        return true;
    }

    public static boolean d(com.vk.im.engine.models.messages.a aVar) {
        List<Attach> K0 = aVar.K0();
        if (!(K0 instanceof Collection) || !K0.isEmpty()) {
            Iterator<T> it = K0.iterator();
            while (it.hasNext()) {
                if (((Attach) it.next()) instanceof AttachUgcSticker) {
                    return true;
                }
            }
        }
        List<NestedMsg> q7 = aVar.q7();
        if ((q7 instanceof Collection) && q7.isEmpty()) {
            return false;
        }
        Iterator<T> it2 = q7.iterator();
        while (it2.hasNext()) {
            if (d((NestedMsg) it2.next())) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:107:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0192 A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean e(pzv pzvVar, Dialog dialog, Collection collection) {
        Peer peer;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        if (pzvVar != null) {
            x3w x3wVar = pzvVar.a;
            if (dialog != null && collection != null) {
                Peer peer2 = x3wVar.c;
                peer2.getClass();
                if (peer2.Ab(Peer.Type.GROUP)) {
                    peer = x3wVar.c;
                } else {
                    UserCredentials m = pzvVar.m();
                    if (m == null || (peer = m.d()) == null) {
                        Serializer.c<Peer> cVar = Peer.CREATOR;
                        peer = Peer.Unknown.e;
                    }
                }
                boolean contains = pzvVar.u.contains(dialog.Sb());
                boolean f = epx.f(dialog.Zb(), peer);
                boolean k = dialog.Xb().k();
                ChatSettings Hb = dialog.Hb();
                boolean z7 = Hb != null ? Hb.h : false;
                ChatSettings Hb2 = dialog.Hb();
                Peer peer3 = Hb2 != null ? Hb2.d : null;
                ChatSettings Hb3 = dialog.Hb();
                Set<Peer> set = Hb3 != null ? Hb3.e : null;
                ChatSettings Hb4 = dialog.Hb();
                boolean z8 = Hb4 != null ? Hb4.i : false;
                ChatSettings Hb5 = dialog.Hb();
                boolean z9 = Hb5 != null ? Hb5.j : false;
                ChatSettings Hb6 = dialog.Hb();
                boolean z10 = Hb6 != null ? Hb6.s : false;
                boolean Gb = dialog.Gb();
                Collection<Msg> collection2 = collection;
                Collection collection3 = collection2;
                if (collection3.isEmpty()) {
                    z = true;
                    z3 = true;
                    z2 = false;
                } else {
                    for (Msg msg : collection2) {
                        z2 = false;
                        z = true;
                        if (!(msg instanceof MsgFromUser) || a((MsgFromUser) msg)) {
                            z3 = false;
                            break;
                        }
                    }
                    z = true;
                    z2 = false;
                    z3 = true;
                }
                if (!collection3.isEmpty()) {
                    Iterator it = collection2.iterator();
                    while (it.hasNext()) {
                        if (!((Msg) it.next()).Qb()) {
                            z4 = z2;
                            break;
                        }
                    }
                }
                z4 = z;
                ArrayList arrayList = new ArrayList();
                for (Object obj : collection2) {
                    boolean z11 = contains;
                    boolean z12 = z4;
                    if (((Msg) obj).Jb(peer)) {
                        arrayList.add(obj);
                    }
                    z4 = z12;
                    contains = z11;
                }
                boolean z13 = contains;
                boolean z14 = z4;
                ArrayList arrayList2 = new ArrayList();
                for (Object obj2 : collection2) {
                    if (!((Msg) obj2).Jb(peer)) {
                        arrayList2.add(obj2);
                    }
                }
                boolean z15 = collection.size() == arrayList.size() ? z : z2;
                if (peer3 != null) {
                    if (!arrayList2.isEmpty()) {
                        Iterator it2 = arrayList2.iterator();
                        while (it2.hasNext()) {
                            if (((Msg) it2.next()).Jb(peer3)) {
                            }
                        }
                    }
                    z5 = z2;
                    if (set != null) {
                        if (!arrayList2.isEmpty()) {
                            Iterator it3 = arrayList2.iterator();
                            while (it3.hasNext()) {
                                if (set.contains(((Msg) it3.next()).getFrom())) {
                                }
                            }
                        }
                        z6 = z2;
                        return (z13 || f || !k || z7 || z8 || z9 || !Gb || !z3 || !z14) ? z2 : (z15 || !(!z10 || z5 || z6)) ? z : z2;
                    }
                    z6 = z;
                    return (z13 || f || !k || z7 || z8 || z9 || !Gb || !z3 || !z14) ? z2 : (z15 || !(!z10 || z5 || z6)) ? z : z2;
                }
                z5 = z;
                if (set != null) {
                }
                z6 = z;
                if (z13) {
                }
            }
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
    public static boolean f(C1128a c1128a) {
        boolean z;
        int i;
        Collection<Msg> collection = c1128a.c;
        pzv pzvVar = c1128a.d;
        Dialog dialog = c1128a.b;
        Object Z = j5g.Z(collection);
        MsgFromUser msgFromUser = Z instanceof MsgFromUser ? (MsgFromUser) Z : null;
        Peer peer = c1128a.e;
        if (msgFromUser != null) {
            boolean z2 = dialog.Gb() && dialog.Xb().k();
            xuo0.a.getClass();
            boolean z3 = xuo0.a() - msgFromUser.g < pzvVar.r || ((i = c1128a.i) != 0 && msgFromUser.d == i) || dialog.Jc();
            boolean contains = pzvVar.u.contains(dialog.Sb());
            boolean z4 = msgFromUser.Qb() || msgFromUser.Pb();
            long j = peer.b;
            Serializer.c<Peer> cVar = Peer.CREATOR;
            boolean Jb = msgFromUser.Jb(Peer.a.b(j));
            Set set = (Set) pzvVar.w0.getValue();
            if (!(set instanceof Collection) || !set.isEmpty()) {
                Iterator it = set.iterator();
                while (it.hasNext()) {
                    if (drm0.D(msgFromUser.F, (String) it.next(), true)) {
                        z = false;
                        break;
                    }
                }
            }
            z = true;
            if (z4 && Jb && z2 && z3 && !contains && z && !msgFromUser.D) {
                return true;
            }
        }
        return false;
    }

    public static boolean g(C1128a c1128a) {
        int i;
        Msg msg = (Msg) j5g.Z(c1128a.c);
        if (msg != null && f(c1128a) && (msg instanceof MsgFromUser)) {
            MsgFromUser msgFromUser = (MsgFromUser) msg;
            if (msgFromUser.da()) {
                AttachWithTranscription attachWithTranscription = (AttachWithTranscription) j5g.a0(msgFromUser.m9(AttachWithTranscription.class, false, false));
                if (attachWithTranscription == null ? false : attachWithTranscription.j3()) {
                    ArrayList<Attach> arrayList = msgFromUser.H;
                    if (arrayList == null || !arrayList.isEmpty()) {
                        i = 0;
                        for (Attach attach : arrayList) {
                            if (attach instanceof AttachAudioMsg) {
                                AttachAudioMsg attachAudioMsg = (AttachAudioMsg) attach;
                                if (i(attachAudioMsg.f) && attachAudioMsg.m == 2 && attachAudioMsg.o) {
                                }
                            }
                            i++;
                            if (i < 0) {
                                e43.s();
                                throw null;
                            }
                        }
                    } else {
                        i = 0;
                    }
                    if (i == 0) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static boolean h(Msg msg) {
        if (!(msg instanceof MsgFromUser) || !msg.Qb()) {
            return false;
        }
        MsgFromUser msgFromUser = (MsgFromUser) msg;
        return (a(msgFromUser) || b(msgFromUser) || msgFromUser.dc() || !msg.Lb()) ? false : true;
    }

    public static boolean i(int i) {
        return ((long) i) <= a;
    }

    public static boolean j(Msg msg) {
        if (!msg.Mb() || !(msg instanceof MsgFromUser) || !msg.Lb()) {
            return false;
        }
        ArrayList<Attach> arrayList = ((MsgFromUser) msg).H;
        if (arrayList != null && arrayList.isEmpty()) {
            return true;
        }
        for (Attach attach : arrayList) {
            if ((attach instanceof AttachCall) || (attach instanceof AttachGroupCall)) {
                return false;
            }
            if (attach instanceof AttachGift) {
                a1w a1wVar = q1w.a;
                if (a1wVar == null) {
                    a1wVar = null;
                }
                if (!a1wVar.r().h.K()) {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean k(Dialog dialog, Msg msg) {
        return l(dialog, msg == null ? null : Collections.singletonList(msg));
    }

    public static boolean l(Dialog dialog, Collection collection) {
        boolean z;
        boolean z2;
        boolean sc = dialog != null ? dialog.sc() : false;
        if (collection != null) {
            Collection collection2 = collection;
            if (!collection2.isEmpty()) {
                Iterator it = collection2.iterator();
                while (it.hasNext()) {
                    if (((Msg) it.next()).Qb()) {
                        z = true;
                        break;
                    }
                }
            }
        }
        z = false;
        if (collection != null) {
            Collection<Msg> collection3 = collection;
            if (!(collection3 instanceof Collection) || !collection3.isEmpty()) {
                for (Msg msg : collection3) {
                    if (msg.Qb() && msg.Ib() && !msg.D) {
                        z2 = true;
                        break;
                    }
                }
            }
        }
        z2 = false;
        return (sc && z) || z2;
    }

    public static boolean m(C1128a c1128a, boolean z) {
        Collection<Msg> collection = c1128a.c;
        if (!o25.b(o25.a()) || collection.size() != 1) {
            return false;
        }
        Object X = j5g.X(collection);
        com.vk.im.engine.models.messages.a aVar = X instanceof com.vk.im.engine.models.messages.a ? (com.vk.im.engine.models.messages.a) X : null;
        if (aVar == null) {
            return false;
        }
        List<Attach> K0 = aVar.K0();
        ArrayList arrayList = new ArrayList();
        for (Object obj : K0) {
            if (obj instanceof AttachWithDownload) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            AttachWithDownload attachWithDownload = (AttachWithDownload) next;
            if (attachWithDownload instanceof AttachVideo ? ((AttachVideo) attachWithDownload).j() : attachWithDownload instanceof AttachVideoMsg ? ((AttachVideoMsg) attachWithDownload).j() : true) {
                arrayList2.add(next);
            }
        }
        int size = arrayList2.size();
        if (z) {
            if (size != 1) {
                return false;
            }
        } else if (size <= 1) {
            return false;
        }
        return true;
    }
}
