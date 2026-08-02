package com.vk.im.ui.components.common;

import com.vk.core.apps.BuildInfo;
import com.vk.dto.attaches.Attach;
import com.vk.dto.attaches.AttachAudioMsg;
import com.vk.dto.attaches.AttachGift;
import com.vk.dto.attaches.AttachGraffiti;
import com.vk.dto.attaches.AttachImage;
import com.vk.dto.attaches.AttachMarket;
import com.vk.dto.attaches.AttachSyncState;
import com.vk.dto.attaches.AttachWidget;
import com.vk.dto.attaches.AttachWithDownload;
import com.vk.dto.attaches.AttachWithTranscription;
import com.vk.dto.common.Peer;
import com.vk.dto.common.VideoFile;
import com.vk.dto.messages.MsgSyncState;
import com.vk.im.engine.models.attaches.AttachCall;
import com.vk.im.engine.models.attaches.AttachGroupCall;
import com.vk.im.engine.models.attaches.AttachHighlight;
import com.vk.im.engine.models.attaches.AttachLink;
import com.vk.im.engine.models.attaches.AttachSticker;
import com.vk.im.engine.models.attaches.AttachUgcSticker;
import com.vk.im.engine.models.attaches.AttachVideo;
import com.vk.im.engine.models.attaches.AttachVideoMsg;
import com.vk.im.engine.models.attaches.miniapp.MiniAppSnippetDataAttach;
import com.vk.im.engine.models.dialogs.ChatSettings;
import com.vk.im.engine.models.dialogs.Dialog;
import com.vk.im.engine.models.messages.Msg;
import com.vk.im.engine.models.messages.MsgFromUser;
import com.vk.im.engine.models.messages.PinnedMsg;
import com.vk.im.engine.utils.a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import xsna.a1w;
import xsna.d37;
import xsna.drm0;
import xsna.e43;
import xsna.epx;
import xsna.g5g;
import xsna.ghp;
import xsna.gtx0;
import xsna.j5g;
import xsna.mb8;
import xsna.pzv;
import xsna.ug30;

/* compiled from: MsgActionHelper.kt */
/* loaded from: classes2.dex */
public final class a {
    /* JADX WARN: Code restructure failed: missing block: B:123:0x0264, code lost:
    
        if (r1 != false) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x02a3, code lost:
    
        if (r1 != false) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:198:0x033f, code lost:
    
        if (r0.C2() == true) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:207:0x03f5, code lost:
    
        if (r1 == 0) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x014e, code lost:
    
        if (r18.Xb().k() != false) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:327:0x0495, code lost:
    
        if (r1 != false) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:373:0x050f, code lost:
    
        if (r1.Lb() != false) goto L338;
     */
    /* JADX WARN: Code restructure failed: missing block: B:402:0x056a, code lost:
    
        if (r1.Lb() != false) goto L338;
     */
    /* JADX WARN: Code restructure failed: missing block: B:425:0x05bc, code lost:
    
        if (r0 == false) goto L338;
     */
    /* JADX WARN: Code restructure failed: missing block: B:450:0x0633, code lost:
    
        if (r1 != false) goto L338;
     */
    /* JADX WARN: Code restructure failed: missing block: B:475:0x0654, code lost:
    
        if (com.vk.im.engine.utils.a.j((com.vk.im.engine.models.messages.Msg) xsna.j5g.X(r19)) != false) goto L338;
     */
    /* JADX WARN: Code restructure failed: missing block: B:485:0x0681, code lost:
    
        if (((com.vk.im.engine.models.messages.MsgFromUser) r0).S.isEmpty() == false) goto L338;
     */
    /* JADX WARN: Code restructure failed: missing block: B:500:0x06be, code lost:
    
        if (r0 != false) goto L376;
     */
    /* JADX WARN: Code restructure failed: missing block: B:527:0x0718, code lost:
    
        if (r1 != false) goto L338;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0214, code lost:
    
        if (r1 != false) goto L39;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0807 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:309:0x0152 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:310:? A[LOOP:9: B:294:0x0413->B:310:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00bf A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:450:0x0633  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:525:0x0712  */
    /* JADX WARN: Removed duplicated region for block: B:559:0x077a  */
    /* JADX WARN: Removed duplicated region for block: B:568:0x0799  */
    /* JADX WARN: Removed duplicated region for block: B:602:0x077d  */
    /* JADX WARN: Type inference failed for: r5v91, types: [java.lang.Object, kotlin.Lazy] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static ArrayList a(a1w a1wVar, Dialog dialog, Collection collection) {
        int i;
        boolean z;
        MsgFromUser msgFromUser;
        ArrayList<Attach> arrayList;
        Peer peer;
        boolean z2;
        boolean z3;
        boolean m;
        boolean z4;
        boolean z5;
        AttachWithTranscription attachWithTranscription;
        int i2;
        boolean z6;
        boolean z7;
        pzv r = a1wVar != null ? a1wVar.r() : null;
        if (r == null || collection == null) {
            return new ArrayList();
        }
        List l = e43.l(ug30.o.a, ug30.d0.a, ug30.n.a, ug30.t.a, ug30.q.a, ug30.r.a, ug30.i.a, ug30.m.a, ug30.c.a, ug30.j.a, ug30.f.a, ug30.l.a, ug30.e0.a, ug30.g.a, ug30.h.a, ug30.p.a, ug30.b0.a, ug30.c0.c, ug30.a0.a, ug30.e.a, ug30.s.a, ug30.a.a, new ug30.d(0), new ug30.w(true), new ug30.x(true), ug30.y.a);
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : l) {
            ug30 ug30Var = (ug30) obj;
            PinnedMsg dc = dialog.dc();
            if (dc != null) {
                Integer valueOf = Integer.valueOf(dc.c);
                if (dc.m) {
                    valueOf = null;
                }
                if (valueOf != null) {
                    i = valueOf.intValue();
                    List<Peer.Type> list = com.vk.im.engine.utils.a.b;
                    Peer q = a1wVar.q();
                    a.C1128a c1128a = new a.C1128a(ug30Var, dialog, collection, r, q, dialog.Gb(), dialog.Xb().k(), dialog.Sb().longValue(), i);
                    List<Peer.Type> list2 = com.vk.im.engine.utils.a.b;
                    if (!(ug30Var instanceof ug30.t)) {
                        Collection<Msg> collection2 = collection;
                        if (!(collection2 instanceof Collection) || !collection2.isEmpty()) {
                            for (Msg msg : collection2) {
                                if (!(msg instanceof MsgFromUser) || !msg.Pb()) {
                                    break;
                                }
                            }
                        }
                        if (dialog.Gb()) {
                        }
                        m = false;
                    } else if (ug30Var instanceof ug30.i) {
                        ArrayList E = g5g.E(collection, com.vk.im.engine.models.messages.a.class);
                        ArrayList arrayList3 = new ArrayList();
                        Iterator it = E.iterator();
                        while (it.hasNext()) {
                            g5g.y(((com.vk.im.engine.models.messages.a) it.next()).m9(AttachWithDownload.class, true, false), arrayList3);
                        }
                        if (!arrayList3.isEmpty()) {
                            Iterator it2 = arrayList3.iterator();
                            while (it2.hasNext()) {
                                AttachWithDownload attachWithDownload = (AttachWithDownload) it2.next();
                                if (attachWithDownload instanceof AttachVideo ? ((AttachVideo) attachWithDownload).j() : attachWithDownload instanceof AttachVideoMsg ? ((AttachVideoMsg) attachWithDownload).j() : true) {
                                    m = true;
                                    break;
                                }
                            }
                        }
                        m = false;
                    } else if (ug30Var instanceof ug30.q) {
                        Collection<Msg> collection3 = collection;
                        if (!collection3.isEmpty()) {
                            for (Msg msg2 : collection3) {
                                if ((msg2 instanceof MsgFromUser) && msg2.Qb()) {
                                    MsgFromUser msgFromUser2 = (MsgFromUser) msg2;
                                    if (!com.vk.im.engine.utils.a.a(msgFromUser2) && !com.vk.im.engine.utils.a.b(msgFromUser2) && !msg2.D) {
                                    }
                                }
                                z7 = false;
                            }
                        }
                        z7 = true;
                        boolean z8 = dialog.Gb() && dialog.Xb().k() && list2.contains(dialog.bc());
                        if (z7) {
                        }
                        m = false;
                    } else if (ug30Var instanceof ug30.m) {
                        Collection collection4 = collection;
                        if (!(collection4 instanceof Collection) || !collection4.isEmpty()) {
                            Iterator it3 = collection4.iterator();
                            while (it3.hasNext()) {
                                if (!com.vk.im.engine.utils.a.h((Msg) it3.next())) {
                                    z6 = false;
                                    break;
                                }
                            }
                        }
                        z6 = true;
                        boolean z9 = dialog.Xb().k() && list2.contains(dialog.bc()) && !dialog.sc();
                        if (z6) {
                        }
                        m = false;
                    } else if (ug30Var instanceof ug30.r) {
                        if (collection.size() == 1) {
                            Msg msg3 = (Msg) j5g.X(collection);
                            q.getClass();
                            boolean z10 = (!dialog.vc() || dialog.sc() || q.Ab(Peer.Type.GROUP)) ? false : true;
                            if (!msg3.Jb(q)) {
                                if (com.vk.im.engine.utils.a.h(msg3)) {
                                }
                            }
                        }
                        m = false;
                    } else {
                        if (ug30Var instanceof ug30.c) {
                            Collection<Msg> collection5 = collection;
                            if (!(collection5 instanceof Collection) || !collection5.isEmpty()) {
                                for (Msg msg4 : collection5) {
                                    if (msg4 instanceof MsgFromUser) {
                                        MsgFromUser msgFromUser3 = (MsgFromUser) msg4;
                                        if (!com.vk.im.engine.utils.a.a(msgFromUser3) && !com.vk.im.engine.utils.a.b(msgFromUser3) && com.vk.im.engine.models.messages.a.Q7(msgFromUser3, new d37(27), true) == null && !msg4.D && !msgFromUser3.da()) {
                                        }
                                    }
                                    m = false;
                                }
                            }
                            m = true;
                            break;
                        }
                        if (ug30Var instanceof ug30.j) {
                            Object Z = j5g.Z(collection);
                            MsgFromUser msgFromUser4 = Z instanceof MsgFromUser ? (MsgFromUser) Z : null;
                            if (com.vk.im.engine.utils.a.f(c1128a) && msgFromUser4 != null) {
                                if (msgFromUser4.F.length() == 0 && msgFromUser4.H.size() == 1) {
                                    Object Y = j5g.Y(msgFromUser4.H);
                                    AttachVideo attachVideo = Y instanceof AttachVideo ? (AttachVideo) Y : null;
                                    if (attachVideo != null) {
                                        VideoFile videoFile = attachVideo.b;
                                        if (videoFile != null) {
                                        }
                                    }
                                }
                                if (!msgFromUser4.da()) {
                                    ArrayList<Attach> arrayList4 = msgFromUser4.H;
                                    if (arrayList4 == null || !arrayList4.isEmpty()) {
                                        i2 = 0;
                                        for (Attach attach : arrayList4) {
                                            if (!(attach instanceof AttachAudioMsg) && !(attach instanceof AttachSticker) && !(attach instanceof AttachUgcSticker) && !(attach instanceof AttachGraffiti) && !(attach instanceof AttachGift)) {
                                                if (attach instanceof AttachMarket) {
                                                    continue;
                                                } else if (!(attach instanceof AttachHighlight) && !(attach instanceof AttachWidget)) {
                                                    if (attach instanceof AttachVideo) {
                                                        AttachSyncState attachSyncState = ((AttachVideo) attach).n;
                                                        if (attachSyncState != AttachSyncState.DONE && attachSyncState != AttachSyncState.REJECTED) {
                                                        }
                                                    } else if (attach instanceof AttachLink) {
                                                        Set set = (Set) r.w0.getValue();
                                                        if (!(set instanceof Collection) || !set.isEmpty()) {
                                                            Iterator it4 = set.iterator();
                                                            while (it4.hasNext()) {
                                                                if (drm0.D(((AttachLink) attach).e, (String) it4.next(), true)) {
                                                                }
                                                            }
                                                        }
                                                    } else if (!(attach instanceof AttachCall) && !(attach instanceof AttachGroupCall) && !(attach instanceof MiniAppSnippetDataAttach)) {
                                                    }
                                                }
                                            }
                                            i2++;
                                            if (i2 < 0) {
                                                e43.s();
                                                throw null;
                                            }
                                        }
                                    } else {
                                        i2 = 0;
                                    }
                                }
                            }
                            m = false;
                        } else {
                            if (ug30Var instanceof ug30.f) {
                                Collection<Msg> collection6 = collection;
                                if (!(collection6 instanceof Collection) || !collection6.isEmpty()) {
                                    for (Msg msg5 : collection6) {
                                        if ((msg5 instanceof MsgFromUser) && !msg5.D) {
                                            MsgFromUser msgFromUser5 = (MsgFromUser) msg5;
                                            if ((!msgFromUser5.da() || (attachWithTranscription = (AttachWithTranscription) j5g.a0(msgFromUser5.m9(AttachWithTranscription.class, false, false))) == null) ? false : attachWithTranscription.j3()) {
                                                z5 = true;
                                                if (z5) {
                                                    m = false;
                                                }
                                            }
                                        }
                                        z5 = false;
                                        if (z5) {
                                        }
                                    }
                                }
                                m = true;
                                break;
                            }
                            if (ug30Var instanceof ug30.l) {
                                m = com.vk.im.engine.utils.a.g(c1128a);
                            } else if (ug30Var instanceof ug30.g) {
                                Collection<Msg> collection7 = collection;
                                if (!(collection7 instanceof Collection) || !collection7.isEmpty()) {
                                    for (Msg msg6 : collection7) {
                                        if (!(msg6 instanceof MsgFromUser) || com.vk.im.engine.utils.a.a((MsgFromUser) msg6)) {
                                            z4 = false;
                                            break;
                                        }
                                    }
                                }
                                z4 = true;
                                boolean k = dialog.Xb().k();
                                if (z4) {
                                }
                                m = false;
                            } else {
                                if (ug30Var instanceof ug30.h) {
                                    m = com.vk.im.engine.utils.a.e(r, dialog, collection);
                                } else if (ug30Var instanceof ug30.p) {
                                    if (collection.size() == 1) {
                                        PinnedMsg dc2 = dialog.dc();
                                        int i3 = dc2 != null ? dc2.c : 0;
                                        Msg msg7 = (Msg) j5g.X(collection);
                                        ChatSettings Hb = dialog.Hb();
                                        if ((Hb != null ? Hb.q : false) && dialog.uc() && !dialog.sc() && dialog.Gb() && dialog.Xb().k() && (msg7 instanceof MsgFromUser)) {
                                            MsgFromUser msgFromUser6 = (MsgFromUser) msg7;
                                            if (!com.vk.im.engine.utils.a.a(msgFromUser6)) {
                                                if (!com.vk.im.engine.utils.a.b(msgFromUser6)) {
                                                    if (msgFromUser6.o == MsgSyncState.DONE) {
                                                        if (msg7.d != i3) {
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    m = false;
                                } else if (ug30Var instanceof ug30.b0) {
                                    if (collection.size() == 1) {
                                        PinnedMsg dc3 = dialog.dc();
                                        int i4 = dc3 != null ? dc3.c : 0;
                                        Msg msg8 = (Msg) j5g.X(collection);
                                        ChatSettings Hb2 = dialog.Hb();
                                        if (Hb2 != null ? Hb2.q : false) {
                                            if (dialog.uc()) {
                                                if (dialog.Gb()) {
                                                    if (dialog.Xb().k()) {
                                                        if (msg8 instanceof MsgFromUser) {
                                                            if (((MsgFromUser) msg8).o == MsgSyncState.DONE) {
                                                                if (msg8.d == i4) {
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    m = false;
                                } else if (ug30Var instanceof ug30.w) {
                                    m = com.vk.im.engine.utils.a.m(c1128a, true);
                                } else if (ug30Var instanceof ug30.x) {
                                    m = com.vk.im.engine.utils.a.m(c1128a, false);
                                } else {
                                    if (!(ug30Var instanceof ug30.c0) && !(ug30Var instanceof ug30.z)) {
                                        if (ug30Var instanceof ug30.a0) {
                                            if (collection.size() == 1) {
                                                q.getClass();
                                                boolean Ab = q.Ab(Peer.Type.GROUP);
                                                Msg msg9 = (Msg) j5g.X(collection);
                                                if (msg9.Mb()) {
                                                    if (msg9 instanceof MsgFromUser) {
                                                        if (((MsgFromUser) msg9).k8()) {
                                                        }
                                                    }
                                                }
                                            }
                                        } else if (!(ug30Var instanceof ug30.e)) {
                                            if (ug30Var instanceof ug30.s) {
                                                Collection<gtx0> collection8 = collection;
                                                if (!(collection8 instanceof Collection) || !collection8.isEmpty()) {
                                                    for (gtx0 gtx0Var : collection8) {
                                                        if (!(gtx0Var instanceof MsgFromUser)) {
                                                            break;
                                                        }
                                                        MsgFromUser msgFromUser7 = (MsgFromUser) gtx0Var;
                                                        if ((!msgFromUser7.i && !com.vk.im.engine.utils.a.d((com.vk.im.engine.models.messages.a) gtx0Var)) || com.vk.im.engine.utils.a.a(msgFromUser7)) {
                                                            break;
                                                        }
                                                    }
                                                }
                                                ArrayList arrayList5 = new ArrayList();
                                                for (Object obj2 : collection8) {
                                                    if (obj2 instanceof com.vk.im.engine.models.messages.a) {
                                                        arrayList5.add(obj2);
                                                    }
                                                }
                                                if (!com.vk.im.engine.utils.a.c(arrayList5, ghp.a)) {
                                                    z3 = true;
                                                    boolean k2 = dialog.Xb().k();
                                                    if (z3) {
                                                    }
                                                }
                                                z3 = false;
                                                boolean k22 = dialog.Xb().k();
                                                if (z3) {
                                                }
                                            } else if (ug30Var instanceof ug30.o) {
                                                if (dialog.T8()) {
                                                    if (collection.size() == 1) {
                                                    }
                                                }
                                            } else if (ug30Var instanceof ug30.d0) {
                                                if (dialog.T8() && collection.size() == 1) {
                                                    Msg msg10 = (Msg) j5g.X(collection);
                                                    if (com.vk.im.engine.utils.a.j(msg10)) {
                                                    }
                                                }
                                            } else if (ug30Var instanceof ug30.n) {
                                                q.getClass();
                                                boolean Ab2 = q.Ab(Peer.Type.GROUP);
                                                Object Z2 = j5g.Z(collection);
                                                MsgFromUser msgFromUser8 = Z2 instanceof MsgFromUser ? (MsgFromUser) Z2 : null;
                                                if (msgFromUser8 != null) {
                                                    if (dialog.uc()) {
                                                        if (!msgFromUser8.i) {
                                                            if (msgFromUser8.o == MsgSyncState.DONE) {
                                                                if (msgFromUser8.d <= dialog.gc()) {
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            } else if (ug30Var instanceof ug30.e0) {
                                                Object Z3 = j5g.Z(collection);
                                                MsgFromUser msgFromUser9 = Z3 instanceof MsgFromUser ? (MsgFromUser) Z3 : null;
                                                if (msgFromUser9 != null) {
                                                    ChatSettings Hb3 = dialog.Hb();
                                                    if (Hb3 != null) {
                                                        Set<Peer> set2 = Hb3.e;
                                                        Peer peer2 = Hb3.d;
                                                        boolean z11 = epx.f(peer2, q) || set2.contains(q);
                                                        boolean z12 = (set2.contains(msgFromUser9.h) || epx.f(peer2, msgFromUser9.h)) ? false : true;
                                                        if (z11 && z12) {
                                                            z2 = true;
                                                            if (msgFromUser9.i) {
                                                                if (dialog.uc()) {
                                                                }
                                                            }
                                                        }
                                                    }
                                                    z2 = false;
                                                    if (msgFromUser9.i) {
                                                    }
                                                }
                                            } else if (ug30Var instanceof ug30.y) {
                                                if (!BuildInfo.t()) {
                                                    ChatSettings Hb4 = dialog.Hb();
                                                    boolean z13 = (Hb4 == null || Hb4.N) ? false : true;
                                                    boolean sc = dialog.sc();
                                                    ChatSettings Hb5 = dialog.Hb();
                                                    if (!((Hb5 == null || (peer = Hb5.d) == null) ? false : peer.Ab(Peer.Type.GROUP))) {
                                                        Peer.Type type = Peer.Type.GROUP;
                                                        if (!(dialog.bc() == type)) {
                                                            q.getClass();
                                                            if (!q.Ab(type)) {
                                                                z = false;
                                                                if (!z13 && !sc && !z) {
                                                                    Object Z4 = j5g.Z(collection);
                                                                    msgFromUser = !(Z4 instanceof MsgFromUser) ? (MsgFromUser) Z4 : null;
                                                                    if (msgFromUser != null && ((arrayList = msgFromUser.H) == null || !arrayList.isEmpty())) {
                                                                        for (Attach attach2 : arrayList) {
                                                                            if (attach2 instanceof AttachImage) {
                                                                                if (((AttachImage) attach2).v == null) {
                                                                                    m = true;
                                                                                    break;
                                                                                }
                                                                            } else if (attach2 instanceof AttachVideo) {
                                                                                AttachVideo attachVideo2 = (AttachVideo) attach2;
                                                                                if (attachVideo2.j() && attachVideo2.b.O() == null) {
                                                                                    m = true;
                                                                                    break;
                                                                                }
                                                                            } else if (attach2 instanceof AttachVideoMsg) {
                                                                                AttachVideoMsg attachVideoMsg = (AttachVideoMsg) attach2;
                                                                                if (attachVideoMsg.j() && attachVideoMsg.b.O() == null) {
                                                                                    m = true;
                                                                                    break;
                                                                                }
                                                                            } else {
                                                                                continue;
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                    z = true;
                                                    if (!z13) {
                                                        Object Z42 = j5g.Z(collection);
                                                        if (!(Z42 instanceof MsgFromUser)) {
                                                        }
                                                        if (msgFromUser != null) {
                                                            while (r0.hasNext()) {
                                                            }
                                                        }
                                                    }
                                                }
                                            } else if (!(ug30Var instanceof ug30.b) && !(ug30Var instanceof ug30.a) && !(ug30Var instanceof ug30.d) && !epx.f(ug30Var, ug30.v.a) && !epx.f(ug30Var, ug30.u.a) && !(ug30Var instanceof ug30.k)) {
                                                throw new NoWhenBranchMatchedException();
                                            }
                                        }
                                    }
                                    m = false;
                                }
                                mb8 mb8Var = r.a.e;
                                if (m) {
                                    arrayList2.add(obj);
                                }
                            }
                        }
                    }
                    mb8 mb8Var2 = r.a.e;
                    if (m) {
                    }
                }
            }
            i = 0;
            List<Peer.Type> list3 = com.vk.im.engine.utils.a.b;
            Peer q2 = a1wVar.q();
            a.C1128a c1128a2 = new a.C1128a(ug30Var, dialog, collection, r, q2, dialog.Gb(), dialog.Xb().k(), dialog.Sb().longValue(), i);
            List<Peer.Type> list22 = com.vk.im.engine.utils.a.b;
            if (!(ug30Var instanceof ug30.t)) {
            }
            mb8 mb8Var22 = r.a.e;
            if (m) {
            }
        }
        return new ArrayList(arrayList2);
    }
}
