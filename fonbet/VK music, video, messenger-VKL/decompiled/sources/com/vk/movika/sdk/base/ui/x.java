package com.vk.movika.sdk.base.ui;

import com.vk.log.L;
import com.vk.log.LoggerOutputTarget;
import com.vk.movika.sdk.base.logic.dto.c;
import com.vk.movika.sdk.base.model.Chapter;
import com.vk.movika.sdk.base.model.EventTag;
import com.vk.movika.sdk.base.ui.d;
import com.vk.movika.sdk.base.ui.l0;
import com.vk.movika.sdk.base.ui.y;
import com.vk.movika.sdk.player.base.listener.PlaybackStateListener;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.b6l;
import xsna.b7q;
import xsna.c5g;
import xsna.e43;
import xsna.epx;
import xsna.go9;
import xsna.gzs;
import xsna.j5g;
import xsna.mj80;
import xsna.s3q0;
import xsna.sht0;
import xsna.spj;
import xsna.vua0;
import xsna.wzs;
import xsna.xk80;
import xsna.zhy0;

@b6l(c = "com.vk.movika.sdk.base.ui.CoreInteractivePlayer$3", f = "CoreInteractivePlayer.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class x extends SuspendLambda implements wzs<l0, spj<? super s3q0>, Object> {
    public /* synthetic */ Object a;
    public final /* synthetic */ y b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(y yVar, spj<? super x> spjVar) {
        super(2, spjVar);
        this.b = yVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        x xVar = new x(this.b, spjVar);
        xVar.a = obj;
        return xVar;
    }

    @Override // xsna.wzs
    public final Object invoke(l0 l0Var, spj<? super s3q0> spjVar) {
        return ((x) create(l0Var, spjVar)).invokeSuspend(s3q0.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x002c, code lost:
    
        if ((com.vk.movika.sdk.utils.f.b.b - 1) <= 0) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x003c, code lost:
    
        if ((com.vk.movika.sdk.utils.f.b.b - 1) <= 0) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x004a, code lost:
    
        if ((com.vk.movika.sdk.utils.f.b.b - 1) <= 0) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x001c, code lost:
    
        if ((com.vk.movika.sdk.utils.f.b.b - 1) <= 0) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x001e, code lost:
    
        com.vk.movika.sdk.utils.c.a(r5, null);
     */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Iterable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v28, types: [java.lang.Object, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r2v15, types: [java.lang.Object, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r2v19, types: [java.lang.Object, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r3v23, types: [java.lang.Object, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r4v22, types: [java.lang.Object, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r7v16, types: [java.lang.Object, java.util.Collection] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        int i;
        final Chapter chapter;
        l0.a aVar;
        String str;
        Boolean bool;
        sht0 sht0Var;
        com.vk.movika.sdk.base.model.o oVar;
        Chapter chapter2;
        List<com.vk.movika.sdk.base.model.f> list;
        List<? extends com.vk.movika.sdk.base.model.k> list2;
        List<com.vk.movika.sdk.base.model.f> list3;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        kotlin.a.a(obj);
        l0 l0Var = (l0) this.a;
        final y yVar = this.b;
        v0 v0Var = yVar.r;
        if (!yVar.p.b) {
            if (yVar.j != null) {
                if (yVar.m.isEmpty()) {
                    if (!yVar.p.c) {
                        com.vk.movika.sdk.utils.c.b(yVar, null, new k(0, l0Var, yVar));
                        d dVar = yVar.x;
                        if (dVar == null && com.vk.movika.sdk.utils.f.b.b - 2 <= 0) {
                            com.vk.movika.sdk.utils.c.a(yVar, null);
                        }
                        Chapter chapter3 = l0Var.b;
                        long j = l0Var.h;
                        com.vk.movika.sdk.base.model.o oVar2 = l0Var.j;
                        List<com.vk.movika.sdk.base.model.f> list4 = l0Var.e;
                        Chapter chapter4 = l0Var.c;
                        l0.a aVar2 = l0Var.k;
                        if (chapter3 == null || chapter4 != null) {
                            i = 1;
                        } else {
                            PlaybackStateListener.PlaybackState playbackState = v0Var.b.q;
                            i = 1;
                            boolean z = playbackState != null && (playbackState == PlaybackStateListener.PlaybackState.ENDED || playbackState == PlaybackStateListener.PlaybackState.IDLE);
                            ArrayList arrayList = new ArrayList();
                            for (Object obj2 : list4) {
                                if (com.vk.movika.sdk.base.utils.d.c((com.vk.movika.sdk.base.model.f) obj2)) {
                                    arrayList.add(obj2);
                                }
                            }
                            boolean z2 = arrayList.isEmpty() || com.vk.movika.sdk.base.logic.processor.actions.openuri.d.b(arrayList);
                            if (z && z2 && aVar2.m != null) {
                                yVar.w(new c.d(chapter3), false);
                            }
                        }
                        if (chapter3 != null) {
                            String str2 = chapter3.a;
                            List<? extends com.vk.movika.sdk.base.model.k> list5 = aVar2.k;
                            boolean z3 = aVar2.a;
                            if (list5 == null) {
                                list5 = EmptyList.b;
                            }
                            if (yVar.i != null) {
                                if (aVar2.d) {
                                    v0Var.f.clear();
                                    v0Var.d.b.t();
                                    oVar = oVar2;
                                    list3 = list4;
                                    v0Var.s(0L);
                                    yVar.s(chapter3, dVar, EmptyList.b);
                                    yVar.g = j5g.v0(new g(yVar, 0), yVar.g);
                                } else {
                                    oVar = oVar2;
                                    list3 = list4;
                                }
                                if (aVar2.e) {
                                    if (com.vk.movika.sdk.utils.f.b.b - 1 <= 0) {
                                        com.vk.movika.sdk.utils.c.a(yVar, null);
                                    }
                                    v0Var.f.clear();
                                    v0Var.d.b.t();
                                    v0Var.s(j);
                                    yVar.v(chapter3.d, j);
                                    yVar.g = j5g.v0(new defpackage.e0(i, yVar, l0Var), yVar.g);
                                }
                                if (aVar2.b) {
                                    yVar.s(chapter3, dVar, list5);
                                }
                                chapter = chapter4;
                                chapter2 = chapter3;
                                aVar = aVar2;
                                list = list3;
                                list2 = list5;
                            } else {
                                oVar = oVar2;
                                if (com.vk.movika.sdk.utils.f.b.b - 1 <= 0) {
                                    com.vk.movika.sdk.utils.c.a(yVar, null);
                                }
                                h hVar = new h(j, yVar, chapter3, 0);
                                chapter2 = chapter3;
                                v0Var.h.put(str2, chapter2);
                                aVar = aVar2;
                                chapter = chapter4;
                                list = list4;
                                list2 = list5;
                                t0 t0Var = new t0(j, v0Var, hVar, 0);
                                com.vk.movika.sdk.player.base.model.a p = v0Var.p(chapter2);
                                if (p != null) {
                                    v0Var.i.a(p, new w0(t0Var, p));
                                }
                                yVar.r(chapter2);
                                yVar.i = chapter2;
                                yVar.g = j5g.v0(new f(yVar, 0), yVar.g);
                            }
                            List<com.vk.movika.sdk.base.model.f> t0 = j5g.t0(list, j5g.S0(yVar.k));
                            List<com.vk.movika.sdk.base.model.f> t02 = j5g.t0(yVar.k, j5g.S0(list));
                            ArrayList arrayList2 = new ArrayList();
                            for (Object obj3 : list2) {
                                if (obj3 instanceof com.vk.movika.sdk.base.model.f) {
                                    arrayList2.add(obj3);
                                }
                            }
                            ArrayList arrayList3 = new ArrayList(c5g.u(arrayList2, 10));
                            Iterator it = arrayList2.iterator();
                            while (it.hasNext()) {
                                arrayList3.add(((com.vk.movika.sdk.base.model.f) it.next()).a);
                            }
                            for (com.vk.movika.sdk.base.model.f fVar : t02) {
                                if (dVar != null) {
                                    dVar.i(new d.a.g(fVar, arrayList3.contains(fVar.a)));
                                }
                                EventTag eventTag = new EventTag(fVar, EventTag.Type.TIMEOUT);
                                v0 v0Var2 = yVar.r;
                                v0Var2.getClass();
                                v0Var2.f.remove(eventTag);
                                v0Var2.d.b.u(eventTag);
                            }
                            yVar.t(chapter2, t0, oVar, dVar);
                            yVar.k = list;
                            ArrayList arrayList4 = new ArrayList();
                            for (Object obj4 : list) {
                                if (com.vk.movika.sdk.base.utils.d.c((com.vk.movika.sdk.base.model.f) obj4)) {
                                    arrayList4.add(obj4);
                                }
                            }
                            yVar.u(v0Var.b.q);
                            if (oVar != null && (oVar != yVar.o || z3)) {
                                yVar.o = oVar;
                                if (z3) {
                                    yVar.n = null;
                                }
                                yVar.g = j5g.v0(new com.vk.movika.sdk.base.flow.binding.j(1, yVar, l0Var), yVar.g);
                            }
                        } else {
                            chapter = chapter4;
                            aVar = aVar2;
                        }
                        if (chapter != null) {
                            final boolean z4 = aVar.c;
                            com.vk.movika.sdk.player.base.components.a aVar3 = v0Var.d;
                            HashMap hashMap = v0Var.h;
                            mj80 mj80Var = aVar3.c;
                            xk80 xk80Var = mj80Var.c;
                            com.vk.movika.sdk.player.base.model.a aVar4 = mj80Var.t;
                            if (aVar4 == null) {
                                Integer q = vua0.q(xk80Var);
                                if (q != null) {
                                    int intValue = q.intValue();
                                    b7q g0 = xk80Var.g0();
                                    if (g0 != null && intValue < g0.a.size() - 1) {
                                        try {
                                            sht0Var = g0.a(intValue + 1);
                                        } catch (Throwable unused) {
                                            sht0Var = null;
                                        }
                                        if (sht0Var != null) {
                                            HashMap hashMap2 = ((mj80) mj80Var.r.c).p;
                                            aVar4 = (com.vk.movika.sdk.player.base.model.a) hashMap2.get(sht0Var);
                                            if (aVar4 == null) {
                                                L l = L.a;
                                                l.getClass();
                                                if (!L.m(LoggerOutputTarget.NONE)) {
                                                    L.u(l, L.LogType.w, new Object[]{"OnePlayerComponents", "PlayerItemResolver: Can not resolve PlayerItem for source = " + sht0Var + ";\n\tsourceToItem = " + hashMap2});
                                                }
                                            }
                                        }
                                    }
                                }
                                aVar4 = null;
                            }
                            Chapter chapter5 = aVar4 != null ? (Chapter) hashMap.get(aVar4.b) : null;
                            if (aVar4 == null || chapter5 != null) {
                                str = null;
                            } else {
                                str = null;
                                com.vk.movika.sdk.utils.c.c(v0Var, "PlayerController", null, new r0(0, aVar4, v0Var), 2);
                            }
                            String str3 = yVar.p.d;
                            String str4 = chapter.a;
                            final boolean f = epx.f(str3, str4);
                            final Chapter chapter6 = chapter5;
                            com.vk.movika.sdk.utils.c.b(yVar, str, new gzs() { // from class: com.vk.movika.sdk.base.ui.q
                                @Override // xsna.gzs
                                public final Object invoke() {
                                    String a = zhy0.a("isPlayNextChapter = ", z4);
                                    String b = go9.b("requestedNextChapter = ", chapter.a);
                                    String b2 = go9.b("enqueuedSetNextChapterId = ", yVar.p.d);
                                    String a2 = zhy0.a("isEnqueuedSame = ", f);
                                    Chapter chapter7 = chapter6;
                                    return go9.b("handleNextChapterState: ", j5g.g0(e43.l(a, b, b2, a2, go9.b("inPlayerNextChapter = ", chapter7 != null ? chapter7.a : null)), ", ", null, null, 0, null, 62));
                                }
                            });
                            if (!f || z4) {
                                y.d dVar2 = yVar.p;
                                yVar.p = y.d.a(dVar2, null, false, chapter.a, Boolean.valueOf(z4 || ((bool = dVar2.e) != null && bool.booleanValue())), 15);
                                r rVar = new r(0, yVar, v0Var);
                                if (epx.f(chapter6 != null ? chapter6.a : null, str4)) {
                                    rVar.invoke();
                                } else if (!f) {
                                    hashMap.put(str4, chapter);
                                    s0 s0Var = new s0(0, v0Var, rVar);
                                    com.vk.movika.sdk.player.base.model.a p2 = v0Var.p(chapter);
                                    if (p2 != null) {
                                        v0Var.i.a(p2, new w0(s0Var, p2));
                                    }
                                }
                            }
                        }
                        yVar.w = l0Var.g;
                        int i2 = 0;
                        ArrayList v0 = j5g.v0(new l(i2, yVar, l0Var), yVar.g);
                        yVar.g = v0;
                        ArrayList v02 = j5g.v0(new defpackage.f0(2, aVar, yVar), v0);
                        yVar.g = v02;
                        ArrayList v03 = j5g.v0(new p(i2, aVar, yVar), v02);
                        yVar.g = v03;
                        String str5 = aVar.m;
                        if (str5 != null) {
                            yVar.g = j5g.v0(new s(i2, yVar, str5), v03);
                        }
                        boolean z5 = l0Var.d;
                        boolean z6 = l0Var.i;
                        if (com.vk.movika.sdk.utils.f.b.b - 1 <= 0) {
                            com.vk.movika.sdk.utils.c.a(yVar, null);
                        }
                        yVar.p = y.d.a(yVar.p, Boolean.valueOf(z5), false, null, null, 62);
                        if (z5 || z6) {
                            mj80 mj80Var2 = v0Var.d.a;
                            mj80Var2.v = true;
                            mj80Var2.c.pause();
                        } else {
                            mj80 mj80Var3 = v0Var.d.a;
                            mj80Var3.v = false;
                            mj80Var3.c.resume();
                        }
                        if (z5) {
                            if (dVar != null) {
                                dVar.i(new d.a.c(v0Var.o(v0Var.d.a.q())));
                            }
                        } else if (dVar != null) {
                            dVar.i(new d.a.C1314d(v0Var.o(v0Var.d.a.q())));
                        }
                        if (dVar != null) {
                            dVar.i(new d.a.C1313a(z6));
                        }
                        yVar.g = j5g.v0(new n(yVar, z5), yVar.g);
                        if (!aVar.l.isEmpty()) {
                            yVar.g = j5g.v0(new m(0, yVar, l0Var), yVar.g);
                        }
                        if (dVar != null) {
                            dVar.i(new d.a.i(!l0Var.m));
                        }
                        boolean z7 = yVar.v;
                        boolean z8 = l0Var.l;
                        if (z7 != z8 && z8 != z7) {
                            yVar.v = z8;
                            yVar.w(new c.m(z8), true);
                        }
                        ?? r0 = yVar.g;
                        yVar.g = EmptyList.b;
                        Iterator it2 = r0.iterator();
                        while (it2.hasNext()) {
                            ((gzs) it2.next()).invoke();
                        }
                    }
                }
            }
        }
        return s3q0.a;
    }
}
