package com.vk.im.engine.internal.longpoll.response_handler;

import android.util.SparseArray;
import com.ironsource.X3;
import com.vk.core.apps.BuildInfo;
import com.vk.dto.common.Peer;
import com.vk.im.engine.internal.longpoll.MissedLoaderContactsNotFoundException;
import com.vk.im.engine.internal.longpoll.response_handler.a;
import com.vk.im.engine.internal.longpoll.tasks.ContactAddLpTask;
import com.vk.im.engine.internal.longpoll.tasks.ContactRemoveLpTask;
import com.vk.im.engine.models.LongPollType;
import com.vk.im.engine.models.typing.ComposingType;
import com.vk.im.reporters.api.engine.LongPollExpiredReporter;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.jvm.internal.Ref$ObjectRef;
import xsna.a500;
import xsna.a5b;
import xsna.abm;
import xsna.ahm;
import xsna.aqm;
import xsna.ayf;
import xsna.b1b;
import xsna.bam;
import xsna.bbm;
import xsna.bmm;
import xsna.bqm;
import xsna.byf;
import xsna.c1b;
import xsna.c400;
import xsna.c5g;
import xsna.c7p;
import xsna.cam;
import xsna.chm;
import xsna.cva;
import xsna.cvk;
import xsna.cyf;
import xsna.czr;
import xsna.d5b;
import xsna.d5q0;
import xsna.dbb;
import xsna.dhm;
import xsna.dyf;
import xsna.e500;
import xsna.e5q0;
import xsna.e900;
import xsna.ebb;
import xsna.ehm;
import xsna.eim;
import xsna.ekm;
import xsna.elq0;
import xsna.epx;
import xsna.f400;
import xsna.f7b;
import xsna.fcm;
import xsna.fhm;
import xsna.fim;
import xsna.flq0;
import xsna.fua;
import xsna.fxf;
import xsna.g2x0;
import xsna.g7b;
import xsna.gcm;
import xsna.gua;
import xsna.h7p;
import xsna.hdb;
import xsna.hjm;
import xsna.hxf;
import xsna.hyr;
import xsna.hzr;
import xsna.i0s;
import xsna.i5q0;
import xsna.i9m;
import xsna.ibj;
import xsna.idb;
import xsna.ihm;
import xsna.ixf;
import xsna.iyr;
import xsna.izr;
import xsna.j5g;
import xsna.j5q0;
import xsna.j9m;
import xsna.jd3;
import xsna.jdb;
import xsna.jhm;
import xsna.jjm;
import xsna.jxf;
import xsna.k9m;
import xsna.kdb;
import xsna.khm;
import xsna.kjm;
import xsna.kxf;
import xsna.l400;
import xsna.l9m;
import xsna.ld3;
import xsna.ljm;
import xsna.lxf;
import xsna.m400;
import xsna.m4b;
import xsna.m9m;
import xsna.meb;
import xsna.mgm;
import xsna.mua;
import xsna.mxf;
import xsna.n9m;
import xsna.neb;
import xsna.nim;
import xsna.nqm;
import xsna.nua;
import xsna.nxf;
import xsna.o1b;
import xsna.o4b;
import xsna.o6b;
import xsna.o9m;
import xsna.oim;
import xsna.ojm;
import xsna.os20;
import xsna.oxf;
import xsna.p1b;
import xsna.p6b;
import xsna.pd3;
import xsna.pou;
import xsna.pxf;
import xsna.q0s;
import xsna.q8q0;
import xsna.q8w;
import xsna.qdb;
import xsna.qim;
import xsna.qjm;
import xsna.qua;
import xsna.qxf;
import xsna.r4b;
import xsna.r8b;
import xsna.r8q0;
import xsna.rdb;
import xsna.rim;
import xsna.rjm;
import xsna.rn00;
import xsna.rua;
import xsna.rxa;
import xsna.rxf;
import xsna.s3q0;
import xsna.s4b;
import xsna.s5f0;
import xsna.s6p;
import xsna.sxa;
import xsna.sxf;
import xsna.t4b;
import xsna.t5f0;
import xsna.t8m;
import xsna.tfm;
import xsna.tmm;
import xsna.tpm;
import xsna.txf;
import xsna.u0b;
import xsna.u4b;
import xsna.ucj;
import xsna.udm;
import xsna.ufm;
import xsna.umm;
import xsna.uua;
import xsna.uxf;
import xsna.v0b;
import xsna.v28;
import xsna.v5p;
import xsna.vdm;
import xsna.vpm;
import xsna.vua;
import xsna.vxa;
import xsna.vxf;
import xsna.w28;
import xsna.w2w;
import xsna.w5p;
import xsna.wcb;
import xsna.whm;
import xsna.wjm;
import xsna.wrb;
import xsna.wri;
import xsna.wta;
import xsna.wua;
import xsna.wxf;
import xsna.wyr;
import xsna.wza;
import xsna.x6p;
import xsna.x8c;
import xsna.xc9;
import xsna.xcb;
import xsna.xfm;
import xsna.xgl0;
import xsna.xgm;
import xsna.xhm;
import xsna.xnp0;
import xsna.xpm;
import xsna.xri;
import xsna.xta;
import xsna.xua;
import xsna.xxf;
import xsna.xza;
import xsna.yaj;
import xsna.ycm;
import xsna.yfm;
import xsna.ygm;
import xsna.yhb;
import xsna.yhm;
import xsna.yjm;
import xsna.ynp0;
import xsna.ypm;
import xsna.z1s;
import xsna.z300;
import xsna.z4b;
import xsna.zcm;
import xsna.zgm;
import xsna.zhm;
import xsna.zim;
import xsna.znp0;
import xsna.zxf;

/* compiled from: LongPollLiveEventsHandlerImpl.kt */
/* loaded from: classes2.dex */
public class LongPollLiveEventsHandlerImpl {
    public final w2w a;
    public final a500.a b;

    /* compiled from: LongPollLiveEventsHandlerImpl.kt */
    public static final class LoopedMissedLoaderLongPollLiveChannelsException extends Exception {
    }

    /* compiled from: LongPollLiveEventsHandlerImpl.kt */
    public static final class LoopedMissedLoaderLongPollLiveMessagesException extends Exception {
    }

    /* compiled from: LongPollLiveEventsHandlerImpl.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[LongPollType.values().length];
            try {
                iArr[LongPollType.MESSAGES.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[LongPollType.CHANNELS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public LongPollLiveEventsHandlerImpl(w2w w2wVar, a500.a aVar) {
        this.a = w2wVar;
        this.b = aVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [T, xsna.c400] */
    /* JADX WARN: Type inference failed for: r0v11, types: [T, xsna.c400] */
    public final void a(List<? extends e900> list, com.vk.im.engine.internal.longpoll.response_handler.a aVar, String str) {
        Object failure;
        com.vk.im.engine.internal.longpoll.response_handler.a aVar2;
        Iterator<? extends e900> it;
        e500 xuaVar;
        e500 rjmVar;
        e500 pxfVar;
        w2w w2wVar = this.a;
        xgl0 I0 = w2wVar.I0();
        m400 z = w2wVar.K().z();
        ArrayList arrayList = new ArrayList();
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        ref$ObjectRef.element = new c400();
        z300 z300Var = new z300();
        Iterator<? extends e900> it2 = list.iterator();
        while (true) {
            boolean hasNext = it2.hasNext();
            a500.a aVar3 = this.b;
            if (!hasNext) {
                z.a();
                Iterator it3 = arrayList.iterator();
                while (it3.hasNext()) {
                    e500 e500Var = (e500) it3.next();
                    aVar3.b();
                    if (e500Var.b) {
                        throw new IllegalStateException("Prepare data already called!");
                    }
                    e500Var.b = true;
                    e500Var.c();
                }
                try {
                    c(arrayList, (c400) ref$ObjectRef.element, aVar.getType());
                    failure = s3q0.a;
                } catch (Throwable th) {
                    failure = new Result.Failure(th);
                }
                Throwable a2 = Result.a(failure);
                if (a2 == null) {
                    aVar2 = aVar;
                } else {
                    if (!(a2 instanceof LoopedMissedLoaderLongPollLiveMessagesException) && !(a2 instanceof LoopedMissedLoaderLongPollLiveChannelsException) && !(a2 instanceof MissedLoaderContactsNotFoundException)) {
                        throw a2;
                    }
                    if (BuildInfo.h()) {
                        cvk.w(a2.getMessage(), true);
                    }
                    com.vk.metrics.eventtracking.b.a.a(a2);
                    ?? c400Var = new c400();
                    aVar2 = aVar;
                    e(aVar2, arrayList, c400Var);
                    ref$ObjectRef.element = c400Var;
                    failure = s3q0.a;
                }
                kotlin.a.a(failure);
                z.b(list);
                I0.u(new l400(0, ref$ObjectRef, this, aVar2, arrayList));
                Iterator it4 = arrayList.iterator();
                while (it4.hasNext()) {
                    e500 e500Var2 = (e500) it4.next();
                    e500Var2.d((c400) ref$ObjectRef.element);
                    e500Var2.b(z300Var);
                }
                w2wVar.T0(this, z300Var.n(w2wVar, str, aVar.getType()));
                w2wVar.U0().d(z300Var.q, ComposingType.TEXT);
                w2wVar.U0().d(z300Var.r, ComposingType.AUDIO);
                w2wVar.U0().d(z300Var.s, ComposingType.PHOTO);
                w2wVar.U0().d(z300Var.t, ComposingType.VIDEO);
                w2wVar.U0().d(z300Var.v, ComposingType.FILE);
                w2wVar.U0().d(z300Var.u, ComposingType.VIDEO_MSG);
                w2wVar.U0().c(z300Var.w);
                return;
            }
            e900 next = it2.next();
            aVar3.b();
            boolean z2 = next instanceof ekm;
            w2w w2wVar2 = this.a;
            if (z2) {
                xuaVar = new vdm(w2wVar2, ((ekm) next).a);
            } else if (next instanceof udm) {
                xuaVar = new vdm(w2wVar2, ((udm) next).a);
            } else {
                if (next instanceof zgm) {
                    zgm zgmVar = (zgm) next;
                    Peer peer = zgmVar.a;
                    Peer peer2 = zgmVar.b;
                    if (epx.f(peer2, w2wVar2.H0())) {
                        pxfVar = new ojm(w2wVar2, peer);
                        it = it2;
                        xuaVar = pxfVar;
                    } else {
                        it = it2;
                        xuaVar = new ahm(w2wVar2, peer, peer2);
                    }
                } else if (next instanceof eim) {
                    eim eimVar = (eim) next;
                    xuaVar = new fim(w2wVar2, eimVar.a, eimVar.b);
                } else if (next instanceof jhm) {
                    xuaVar = new khm(w2wVar2, ((jhm) next).a);
                } else if (next instanceof ehm) {
                    ehm ehmVar = (ehm) next;
                    Peer peer3 = ehmVar.a;
                    Peer peer4 = ehmVar.b;
                    if (epx.f(peer4, w2wVar2.H0())) {
                        xuaVar = new mgm(w2wVar2, peer3);
                    } else {
                        rjmVar = new fhm(w2wVar2, peer3, peer4, true);
                        it = it2;
                        xuaVar = rjmVar;
                    }
                } else if (next instanceof chm) {
                    chm chmVar = (chm) next;
                    xuaVar = new dhm(w2wVar2, chmVar.a, chmVar.b);
                } else if (next instanceof i9m) {
                    i9m i9mVar = (i9m) next;
                    xuaVar = new ahm(w2wVar2, i9mVar.a, i9mVar.b);
                } else if (next instanceof jjm) {
                    jjm jjmVar = (jjm) next;
                    xuaVar = new fhm(w2wVar2, jjmVar.a, jjmVar.b, false);
                } else if (next instanceof hjm) {
                    hjm hjmVar = (hjm) next;
                    xuaVar = new fhm(w2wVar2, hjmVar.a, hjmVar.b, false);
                } else if (next instanceof t8m) {
                    xuaVar = new wrb(((t8m) next).a);
                } else if (next instanceof l9m) {
                    xuaVar = new m9m(w2wVar2, (l9m) next);
                } else if (next instanceof n9m) {
                    xuaVar = new o9m(w2wVar2, (n9m) next);
                } else if (next instanceof nim) {
                    xuaVar = new oim(w2wVar2, (nim) next);
                } else if (next instanceof qim) {
                    xuaVar = new rim(w2wVar2, (qim) next);
                } else if (next instanceof tfm) {
                    xuaVar = new ufm(w2wVar2, (tfm) next);
                } else if (next instanceof zim) {
                    xuaVar = new vdm(w2wVar2, ((zim) next).a);
                } else if (next instanceof xgm) {
                    xgm xgmVar = (xgm) next;
                    xuaVar = new ygm(w2wVar2, xgmVar.a, xgmVar.b);
                } else if (next instanceof yhm) {
                    yhm yhmVar = (yhm) next;
                    xuaVar = new zhm(w2wVar2, yhmVar.a, yhmVar.b);
                } else if (next instanceof whm) {
                    whm whmVar = (whm) next;
                    xuaVar = new xhm(w2wVar2, whmVar.a, whmVar.b);
                } else if (next instanceof bbm) {
                    xuaVar = new abm(w2wVar2, ((bbm) next).a);
                } else {
                    if (next instanceof wjm) {
                        wjm wjmVar = (wjm) next;
                        rjmVar = new yjm(w2wVar2, wjmVar.a, wjmVar.b, wjmVar.c, wjmVar.d);
                    } else if (next instanceof xfm) {
                        xfm xfmVar = (xfm) next;
                        xuaVar = new yfm(w2wVar2, xfmVar.a, xfmVar.b);
                    } else if (next instanceof fxf) {
                        xuaVar = new hxf(w2wVar2, (fxf) next);
                    } else if (next instanceof mxf) {
                        xuaVar = new nxf(w2wVar2, (mxf) next);
                    } else if (next instanceof sxf) {
                        sxf sxfVar = (sxf) next;
                        rjmVar = new txf(w2wVar2, sxfVar.a, sxfVar.b, null, null, null);
                    } else if (next instanceof dyf) {
                        dyf dyfVar = (dyf) next;
                        rjmVar = new txf(w2wVar2, dyfVar.a, dyfVar.b, dyfVar.c, dyfVar.d, dyfVar.e);
                    } else {
                        if (next instanceof ixf) {
                            ixf ixfVar = (ixf) next;
                            int i = ixfVar.b;
                            Peer peer5 = ixfVar.a;
                            pxfVar = ixfVar.c ? new jxf(w2wVar2, peer5, i) : new zxf(w2wVar2, peer5, i);
                        } else if (next instanceof cyf) {
                            cyf cyfVar = (cyf) next;
                            int i2 = cyfVar.b;
                            Peer peer6 = cyfVar.a;
                            pxfVar = cyfVar.c ? new jxf(w2wVar2, peer6, i2) : new zxf(w2wVar2, peer6, i2);
                        } else if (next instanceof oxf) {
                            oxf oxfVar = (oxf) next;
                            int i3 = oxfVar.b;
                            Peer peer7 = oxfVar.a;
                            pxfVar = oxfVar.c ? new pxf(w2wVar2, peer7, i3) : new zxf(w2wVar2, peer7, i3);
                        } else if (next instanceof qxf) {
                            qxf qxfVar = (qxf) next;
                            xuaVar = new rxf(w2wVar2, qxfVar.a, qxfVar.b, qxfVar.c);
                        } else if (next instanceof wxf) {
                            wxf wxfVar = (wxf) next;
                            xuaVar = new fcm(w2wVar2, wxfVar.a, wxfVar.b, wxfVar.c);
                        } else if (next instanceof xxf) {
                            xxf xxfVar = (xxf) next;
                            xuaVar = new gcm(w2wVar2, xxfVar.a, xxfVar.b);
                        } else if (next instanceof uxf) {
                            uxf uxfVar = (uxf) next;
                            xuaVar = new vxf(w2wVar2, uxfVar.a, uxfVar.b, uxfVar.c);
                        } else if (next instanceof wri) {
                            wri wriVar = (wri) next;
                            xuaVar = new xri(wriVar.a, wriVar.b, wriVar.e);
                        } else {
                            if (next instanceof d5q0) {
                                d5q0 d5q0Var = (d5q0) next;
                                it = it2;
                                rjmVar = new e5q0(w2wVar2, d5q0Var.a, d5q0Var.b, Boolean.valueOf(d5q0Var.c), d5q0Var.d, -1, d5q0Var.e, d5q0Var.f, d5q0Var.g, -1);
                            } else {
                                it = it2;
                                if (next instanceof elq0) {
                                    xuaVar = new flq0((elq0) next);
                                } else if (next instanceof kxf) {
                                    kxf kxfVar = (kxf) next;
                                    xuaVar = new lxf(w2wVar2, kxfVar.a, kxfVar.b, kxfVar.c);
                                } else if (next instanceof ayf) {
                                    ayf ayfVar = (ayf) next;
                                    xuaVar = new byf(w2wVar2, ayfVar.a, ayfVar.b);
                                } else if (next instanceof v28) {
                                    xuaVar = new w28(w2wVar2, (v28) next);
                                } else if (next instanceof c7p) {
                                    xuaVar = new h7p(w2wVar2, ((c7p) next).a);
                                } else if (next instanceof s6p) {
                                    xuaVar = new x6p(w2wVar2, ((s6p) next).a);
                                } else if (next instanceof g2x0) {
                                    xuaVar = new xc9("CallsLpTask");
                                } else if (next instanceof v5p) {
                                    xuaVar = new w5p("EduCalendarLpTask");
                                } else if (next instanceof bam) {
                                    bam bamVar = (bam) next;
                                    Peer peer8 = bamVar.a;
                                    xuaVar = bamVar.b ? new cam(w2wVar2, peer8) : new bmm(w2wVar2, peer8);
                                } else if (next instanceof yaj.a) {
                                    xuaVar = new ContactAddLpTask(w2wVar2, ((yaj.a) next).a);
                                } else if (next instanceof yaj.d) {
                                    xuaVar = new ContactRemoveLpTask(w2wVar2, ((yaj.d) next).a);
                                } else if (next.equals(yaj.b.a)) {
                                    xuaVar = new ucj(w2wVar2);
                                } else if (next.equals(yaj.c.a)) {
                                    xuaVar = new ibj(w2wVar2);
                                } else if (next instanceof ynp0.b) {
                                    ynp0.b bVar = (ynp0.b) next;
                                    rjmVar = new znp0(bVar.a, bVar.b, bVar.c, bVar.d, bVar.e, w2wVar2);
                                } else if (next instanceof ynp0.a) {
                                    ynp0.a aVar4 = (ynp0.a) next;
                                    xuaVar = new xnp0(aVar4.a, aVar4.b, aVar4.c, w2wVar2);
                                } else if (next instanceof q0s) {
                                    xuaVar = new bqm(((q0s) next).a, w2wVar2);
                                } else if (next instanceof hyr) {
                                    hyr hyrVar = (hyr) next;
                                    xuaVar = new tpm(hyrVar.a, hyrVar.b, hyrVar.c, w2wVar2);
                                } else if (next instanceof iyr) {
                                    xuaVar = new vpm(((iyr) next).a, w2wVar2);
                                } else if (next instanceof czr) {
                                    czr czrVar = (czr) next;
                                    xuaVar = new ypm(new xpm(czrVar.a, czrVar.b, null, null, null, 28), w2wVar2);
                                } else if (next instanceof izr) {
                                    izr izrVar = (izr) next;
                                    xuaVar = new ypm(new xpm(izrVar.a, null, izrVar.b, null, null, 26), w2wVar2);
                                } else if (next instanceof hzr) {
                                    hzr hzrVar = (hzr) next;
                                    xuaVar = new ypm(new xpm(hzrVar.a, null, null, hzrVar.b, null, 22), w2wVar2);
                                } else if (next instanceof z1s) {
                                    xuaVar = new nqm(((z1s) next).a, w2wVar2);
                                } else if (next instanceof wyr) {
                                    xuaVar = new aqm(((wyr) next).a, w2wVar2);
                                } else if (next instanceof i0s) {
                                    i0s i0sVar = (i0s) next;
                                    xuaVar = new ypm(new xpm(i0sVar.a, null, null, null, Integer.valueOf(i0sVar.b), 14), w2wVar2);
                                } else if (next instanceof m4b) {
                                    m4b m4bVar = (m4b) next;
                                    rjmVar = new o4b(w2wVar2, m4bVar.a, m4bVar.b, m4bVar.c, 16);
                                } else if (next instanceof wcb) {
                                    wcb wcbVar = (wcb) next;
                                    xuaVar = new xcb(w2wVar2, wcbVar.a, wcbVar.b, wcbVar.c);
                                } else if (next instanceof dbb) {
                                    dbb dbbVar = (dbb) next;
                                    xuaVar = new ebb(w2wVar2, dbbVar.a, dbbVar.b, dbbVar.c);
                                } else if (next instanceof gua) {
                                    xuaVar = new fua(w2wVar2, ((gua) next).a);
                                } else if (next instanceof rdb) {
                                    xuaVar = new qdb(w2wVar2, ((rdb) next).a);
                                } else if (next instanceof meb) {
                                    meb mebVar = (meb) next;
                                    xuaVar = new neb(w2wVar2, mebVar.a, mebVar.b, mebVar.c);
                                } else if (next instanceof r8b) {
                                    r8b r8bVar = (r8b) next;
                                    xuaVar = new yhb(w2wVar2, r8bVar.a, r8bVar.b);
                                } else if (next instanceof r4b) {
                                    r4b r4bVar = (r4b) next;
                                    xuaVar = new s4b(w2wVar2, r4bVar.a, r4bVar.b);
                                } else if (next instanceof t4b) {
                                    t4b t4bVar = (t4b) next;
                                    xuaVar = new u4b(w2wVar2, t4bVar.a, t4bVar.b, t4bVar.c);
                                } else if (next instanceof f7b) {
                                    f7b f7bVar = (f7b) next;
                                    xuaVar = new g7b(w2wVar2, f7bVar.a, f7bVar.b);
                                } else if (next instanceof u0b) {
                                    xuaVar = new v0b(w2wVar2, ((u0b) next).a);
                                } else if (next instanceof b1b) {
                                    xuaVar = new c1b(w2wVar2, ((b1b) next).a);
                                } else if (next instanceof rxa) {
                                    xuaVar = new sxa(w2wVar2, ((rxa) next).a);
                                } else if (next instanceof hdb) {
                                    xuaVar = new idb(w2wVar2, ((hdb) next).a);
                                } else if (next instanceof d5b) {
                                    d5b d5bVar = (d5b) next;
                                    Peer peer9 = d5bVar.a;
                                    SparseArray sparseArray = new SparseArray(1);
                                    sparseArray.put(d5bVar.b, d5bVar.c);
                                    s3q0 s3q0Var = s3q0.a;
                                    rjmVar = new o4b(w2wVar2, peer9, sparseArray, false, 8);
                                } else if (next instanceof wta) {
                                    wta wtaVar = (wta) next;
                                    xuaVar = new xta(w2wVar2, wtaVar.a, wtaVar.b, wtaVar.c);
                                } else if (next instanceof qua) {
                                    qua quaVar = (qua) next;
                                    xuaVar = new rua(w2wVar2, quaVar.a, quaVar.b, quaVar.c);
                                } else if (next instanceof o1b) {
                                    o1b o1bVar = (o1b) next;
                                    xuaVar = new p1b(w2wVar2, o1bVar.a, o1bVar.b);
                                } else if (next instanceof uua) {
                                    uua uuaVar = (uua) next;
                                    xuaVar = new vua(w2wVar2, uuaVar.a, uuaVar.b);
                                } else if (next instanceof jdb) {
                                    jdb jdbVar = (jdb) next;
                                    xuaVar = new kdb(w2wVar2, jdbVar.a, jdbVar.b);
                                } else if (next instanceof mua) {
                                    mua muaVar = (mua) next;
                                    xuaVar = new nua(w2wVar2, muaVar.a, muaVar.b);
                                } else if (next instanceof z4b) {
                                    z4b z4bVar = (z4b) next;
                                    xuaVar = new a5b(w2wVar2, z4bVar.a, z4bVar.b, z4bVar.c);
                                } else if (next instanceof o6b) {
                                    o6b o6bVar = (o6b) next;
                                    xuaVar = new p6b(w2wVar2, o6bVar.a, o6bVar.b);
                                } else if (next instanceof s5f0) {
                                    s5f0 s5f0Var = (s5f0) next;
                                    rjmVar = new t5f0(w2wVar2, s5f0Var.b, s5f0Var.c, s5f0Var.d, s5f0Var.e, s5f0Var.f, s5f0Var.a);
                                } else if (next instanceof i5q0) {
                                    i5q0 i5q0Var = (i5q0) next;
                                    xuaVar = new j5q0(w2wVar2, i5q0Var.a, i5q0Var.b);
                                } else if (next instanceof j9m) {
                                    j9m j9mVar = (j9m) next;
                                    xuaVar = new k9m(w2wVar2, j9mVar.a.b, j9mVar.b);
                                } else if (next instanceof ycm) {
                                    ycm ycmVar = (ycm) next;
                                    xuaVar = new zcm(w2wVar2, ycmVar.a.b, ycmVar.b);
                                } else if (next instanceof kjm) {
                                    kjm kjmVar = (kjm) next;
                                    xuaVar = new ljm(w2wVar2, kjmVar.a.b, kjmVar.b);
                                } else if (next instanceof qjm) {
                                    qjm qjmVar = (qjm) next;
                                    rjmVar = new rjm(w2wVar2, qjmVar.a.b, qjmVar.b, qjmVar.c);
                                } else if (next instanceof umm) {
                                    umm ummVar = (umm) next;
                                    umm.a aVar5 = ummVar.a;
                                    Peer peer10 = ummVar.b;
                                    Peer peer11 = ummVar.c;
                                    xuaVar = epx.f(peer11, w2wVar2.H0()) ? new tmm(w2wVar2, peer10, aVar5) : new ihm(w2wVar2, peer10, peer11, !epx.f(aVar5, umm.a.c.a));
                                } else if (next instanceof q8q0) {
                                    xuaVar = new r8q0(w2wVar2);
                                } else if (next instanceof vxa) {
                                    xuaVar = new cva(w2wVar2, ((vxa) next).a);
                                } else if (next instanceof wza) {
                                    wza wzaVar = (wza) next;
                                    xuaVar = new xza(w2wVar2, wzaVar.a, wzaVar.b);
                                } else {
                                    if (!(next instanceof wua)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    wua wuaVar = (wua) next;
                                    xuaVar = new xua(w2wVar2, wuaVar.a, wuaVar.b);
                                }
                            }
                            xuaVar = rjmVar;
                        }
                        it = it2;
                        xuaVar = pxfVar;
                    }
                    it = it2;
                    xuaVar = rjmVar;
                }
                arrayList.add(xuaVar);
                it2 = it;
            }
            it = it2;
            arrayList.add(xuaVar);
            it2 = it;
        }
    }

    public boolean b(com.vk.im.engine.internal.longpoll.response_handler.a aVar) {
        return true;
    }

    public final void c(ArrayList arrayList, c400 c400Var, LongPollType longPollType) {
        f400 f400Var = new f400();
        HashSet hashSet = new HashSet();
        w2w w2wVar = this.a;
        os20 os20Var = new os20(w2wVar, w2wVar.c(), w2wVar.getDeviceId(), null, null);
        while (true) {
            f400Var.f();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                e500 e500Var = (e500) it.next();
                this.b.b();
                e500Var.a(c400Var, f400Var);
            }
            if (f400Var.g()) {
                return;
            }
            int i = 2;
            if (!hashSet.add(Integer.valueOf(f400Var.hashCode()))) {
                ArrayList arrayList2 = new ArrayList(c5g.u(arrayList, 10));
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(((e500) it2.next()).a);
                }
                String g0 = j5g.g0(rn00.x(pou.a(new x8c(arrayList2))), null, null, null, 0, new q8w(i), 31);
                StringBuilder sb = new StringBuilder("Infinite Loop | ");
                StringBuilder sb2 = new StringBuilder("Missing=[");
                LinkedHashSet linkedHashSet = f400Var.a;
                if (!linkedHashSet.isEmpty()) {
                    sb2.append("chatsInfoIds=" + linkedHashSet + ',');
                }
                LinkedHashMap linkedHashMap = f400Var.b;
                if (!linkedHashMap.isEmpty()) {
                    sb2.append("chatMemberInfoIds=" + linkedHashMap + ',');
                }
                LinkedHashSet linkedHashSet2 = f400Var.c;
                if (!linkedHashSet2.isEmpty()) {
                    sb2.append("conversationDialogIds=" + linkedHashSet2 + ',');
                }
                LinkedHashMap linkedHashMap2 = f400Var.d;
                if (!linkedHashMap2.isEmpty()) {
                    sb2.append("messageCnvIds=" + linkedHashMap2 + ',');
                }
                LinkedHashSet linkedHashSet3 = f400Var.e;
                if (!linkedHashSet3.isEmpty()) {
                    sb2.append("contactIds=" + linkedHashSet3 + ',');
                }
                LinkedHashSet linkedHashSet4 = f400Var.f;
                if (!linkedHashSet4.isEmpty()) {
                    sb2.append("userIds=" + linkedHashSet4 + ',');
                }
                LinkedHashSet linkedHashSet5 = f400Var.g;
                if (!linkedHashSet5.isEmpty()) {
                    sb2.append("emailIds=" + linkedHashSet5 + ',');
                }
                LinkedHashSet linkedHashSet6 = f400Var.h;
                if (!linkedHashSet6.isEmpty()) {
                    sb2.append("groupIds=" + linkedHashSet6 + ',');
                }
                LinkedHashSet linkedHashSet7 = f400Var.i;
                if (!linkedHashSet7.isEmpty()) {
                    sb2.append("channelIds=" + linkedHashSet7 + ',');
                }
                LinkedHashMap linkedHashMap3 = f400Var.j;
                if (!linkedHashMap3.isEmpty()) {
                    sb2.append("channelMessageIds=" + linkedHashMap3 + ',');
                }
                if (f400Var.k) {
                    sb2.append("channelsCounterIsMissed,");
                }
                LinkedHashMap linkedHashMap4 = f400Var.n;
                if (!linkedHashMap4.isEmpty()) {
                    sb2.append("incognitoIds=" + linkedHashMap4 + ',');
                }
                LinkedHashSet linkedHashSet8 = f400Var.m;
                if (!linkedHashSet8.isEmpty()) {
                    sb2.append("missedFolderIds=" + linkedHashSet8);
                }
                sb2.append(X3.j.e);
                sb.append(sb2.toString());
                sb.append(" | ");
                sb.append(g0);
                String sb3 = sb.toString();
                int i2 = a.$EnumSwitchMapping$0[longPollType.ordinal()];
                if (i2 == 1) {
                    throw new LoopedMissedLoaderLongPollLiveMessagesException(sb3);
                }
                if (i2 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                throw new LoopedMissedLoaderLongPollLiveChannelsException(sb3);
            }
            os20Var.a(f400Var, c400Var, new os20.a[]{os20.a.e.a, os20.a.m.a, os20.a.h.a, os20.a.j.a, os20.a.f.a, os20.a.d.a, os20.a.l.a, os20.a.C3469a.a, os20.a.c.a, os20.a.b.a, os20.a.k.a, os20.a.i.a}, null);
            c400Var.o = true;
        }
    }

    public final void e(com.vk.im.engine.internal.longpoll.response_handler.a aVar, ArrayList arrayList, c400 c400Var) {
        e500 ld3Var;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            e500 e500Var = (e500) it.next();
            if (!(e500Var instanceof neb) && !(e500Var instanceof e5q0) && !(e500Var instanceof bqm) && !(e500Var instanceof v0b) && !(e500Var instanceof idb)) {
                it.remove();
            }
        }
        boolean equals = aVar.equals(a.c.a);
        w2w w2wVar = this.a;
        if (equals) {
            ld3Var = new pd3(w2wVar, LongPollExpiredReporter.Reason.LOOPED_MISSED_LOADER);
        } else if (aVar.equals(a.C1117a.a)) {
            ld3Var = new ld3(w2wVar, LongPollExpiredReporter.Reason.LOOPED_MISSED_LOADER, false);
        } else {
            if (!(aVar instanceof a.b)) {
                throw new NoWhenBranchMatchedException();
            }
            String str = ((a.b) aVar).a;
            ld3Var = str == null ? new ld3(w2wVar, LongPollExpiredReporter.Reason.LOOPED_MISSED_LOADER, true) : new jd3(w2wVar, str);
        }
        arrayList.add(0, ld3Var);
        c(arrayList, c400Var, aVar.getType());
    }

    public void d(com.vk.im.engine.internal.longpoll.response_handler.a aVar) {
    }
}
