package com.vk.movika.sdk.base.ui;

import com.vk.movika.sdk.base.d;
import com.vk.movika.sdk.base.e;
import com.vk.movika.sdk.base.logic.dto.c;
import com.vk.movika.sdk.base.model.Chapter;
import com.vk.movika.sdk.base.model.EventTag;
import com.vk.movika.sdk.base.presenter.a;
import com.vk.movika.sdk.base.presenter.d;
import com.vk.movika.sdk.base.ui.d;
import com.vk.movika.sdk.player.base.listener.PlaybackStateListener;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptySet;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.random.XorWowRandom;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.FlowKt__EmittersKt$onStart$$inlined$unsafeFlow$1;
import kotlinx.coroutines.flow.FlowKt__ErrorsKt$catch$$inlined$unsafeFlow$1;
import kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1;
import kotlinx.coroutines.flow.FlowKt__TransformKt$runningFold$$inlined$unsafeFlow$1;
import xsna.b6l;
import xsna.bdn;
import xsna.caj0;
import xsna.d1b;
import xsna.e43;
import xsna.epx;
import xsna.g5g;
import xsna.ge00;
import xsna.hpj;
import xsna.ie00;
import xsna.izg0;
import xsna.j5g;
import xsna.ksr;
import xsna.lsr;
import xsna.lyd;
import xsna.mtr;
import xsna.qoy;
import xsna.qz9;
import xsna.rsr;
import xsna.s3q0;
import xsna.spj;
import xsna.wgl;
import xsna.xq;
import xsna.zvj;

/* loaded from: classes3.dex */
public class y implements com.vk.movika.sdk.base.b, com.vk.movika.sdk.base.a, com.vk.movika.sdk.common.c {
    public static final a Companion = new a();
    public final b b;
    public final com.vk.movika.sdk.base.logic.a c;
    public final m0 d;
    public final ge00 e;
    public final ArrayList<com.vk.movika.sdk.common.c> f;
    public Object g;
    public final hpj h;
    public Chapter i;
    public com.vk.movika.sdk.base.model.s j;
    public List<com.vk.movika.sdk.base.model.f> k;
    public Object l;
    public Object m;
    public com.vk.movika.sdk.base.model.o n;
    public com.vk.movika.sdk.base.model.o o;
    public d p;
    public final com.vk.movika.sdk.base.logic.d q;
    public final v0 r;
    public final c s;
    public final com.vk.movika.sdk.base.presenter.d t;
    public final caj0 u;
    public boolean v;
    public List<com.vk.movika.sdk.base.model.i> w;
    public com.vk.movika.sdk.base.ui.d x;

    public static final class a {
    }

    public static final class b {
        public final boolean a = false;
        public final boolean b = true;
        public final boolean c = false;

        public b(int i) {
        }
    }

    public final class c implements com.vk.movika.sdk.base.interactive.a {
        public c() {
        }
    }

    public static final class d {
        public final Boolean a;
        public final boolean b;
        public final boolean c;
        public final String d;
        public final Boolean e;

        public d() {
            this(0);
        }

        public static d a(d dVar, Boolean bool, boolean z, String str, Boolean bool2, int i) {
            if ((i & 1) != 0) {
                bool = dVar.a;
            }
            Boolean bool3 = bool;
            boolean z2 = (i & 2) != 0 ? dVar.b : true;
            dVar.getClass();
            if ((i & 8) != 0) {
                z = dVar.c;
            }
            boolean z3 = z;
            if ((i & 16) != 0) {
                str = dVar.d;
            }
            String str2 = str;
            if ((i & 32) != 0) {
                bool2 = dVar.e;
            }
            dVar.getClass();
            return new d(bool3, z2, z3, str2, bool2);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return epx.f(this.a, dVar.a) && this.b == dVar.b && this.c == dVar.c && epx.f(this.d, dVar.d) && epx.f(this.e, dVar.e);
        }

        public final int hashCode() {
            Boolean bool = this.a;
            int b = qoy.b(qoy.b(qoy.b((bool == null ? 0 : bool.hashCode()) * 31, 31, this.b), 31, false), 31, this.c);
            String str = this.d;
            int hashCode = (b + (str == null ? 0 : str.hashCode())) * 31;
            Boolean bool2 = this.e;
            return hashCode + (bool2 != null ? bool2.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("InternalState(isPaused=");
            sb.append(this.a);
            sb.append(", isDestroyed=");
            sb.append(this.b);
            sb.append(", isSdkBroken=false, isClearing=");
            sb.append(this.c);
            sb.append(", enqueuedSetNextChapterId=");
            sb.append(this.d);
            sb.append(", enqueuedPlayNext=");
            return xq.d(sb, this.e, ")");
        }

        public d(Boolean bool, boolean z, boolean z2, String str, Boolean bool2) {
            this.a = bool;
            this.b = z;
            this.c = z2;
            this.d = str;
            this.e = bool2;
        }

        public /* synthetic */ d(int i) {
            this(null, false, false, null, null);
        }
    }

    public y(com.vk.movika.sdk.player.base.components.a aVar, b bVar) {
        XorWowRandom b2 = qz9.b(System.currentTimeMillis());
        com.vk.movika.sdk.base.logic.a aVar2 = new com.vk.movika.sdk.base.logic.a();
        m0 m0Var = new m0();
        this.b = bVar;
        this.c = aVar2;
        this.d = m0Var;
        bdn bdnVar = bdn.a;
        ge00 ge00Var = ie00.a;
        this.e = ge00Var;
        wgl wglVar = wgl.c;
        ArrayList<com.vk.movika.sdk.common.c> arrayList = new ArrayList<>(2);
        this.f = arrayList;
        EmptyList emptyList = EmptyList.b;
        this.g = emptyList;
        final hpj a2 = zvj.a(ge00Var);
        arrayList.add(new com.vk.movika.sdk.common.c() { // from class: com.vk.movika.sdk.base.ui.o
            @Override // com.vk.movika.sdk.common.c
            public final void destroy() {
                zvj.c(hpj.this, null);
            }
        });
        this.h = a2;
        this.k = emptyList;
        this.l = emptyList;
        this.m = EmptySet.b;
        int i = 0;
        this.p = new d(i);
        this.q = new com.vk.movika.sdk.base.logic.d();
        v0 v0Var = new v0(aVar, new j(this, i));
        this.r = v0Var;
        this.s = new c();
        com.vk.movika.sdk.base.presenter.d dVar = new com.vk.movika.sdk.base.presenter.d(new com.vk.movika.sdk.base.logic.interactor.s(bVar.b), new com.vk.movika.sdk.base.logic.interactor.o(b2, new com.vk.ecomm.catalog.impl.geo.a(aVar2, new com.vk.movika.sdk.base.logic.b()), bVar.c), new com.vk.movika.sdk.base.presenter.e());
        this.t = dVar;
        caj0 a3 = lyd.a(16, 16, BufferOverflow.DROP_OLDEST);
        this.u = a3;
        arrayList.add(m0Var);
        rsr.s(new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(rsr.q(rsr.i(new com.vk.movika.sdk.base.flow.binding.e(v0Var, null)), wglVar), new d0(this, null)), a2);
        rsr.s(new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(rsr.q(rsr.i(new com.vk.movika.sdk.base.flow.binding.f(v0Var, null)), wglVar), new e0(this, null)), a2);
        rsr.s(new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(rsr.q(rsr.i(new com.vk.movika.sdk.base.flow.binding.b(v0Var, null)), wglVar), new c0(this, null)), a2);
        final com.vk.catalog.mvi.section.screen.impl.ui.c cVar = new com.vk.catalog.mvi.section.screen.impl.ui.c(rsr.i(new com.vk.movika.sdk.base.flow.binding.d(v0Var, null)), 1);
        List l = e43.l(new ksr<com.vk.movika.sdk.base.logic.dto.c>() { // from class: com.vk.movika.sdk.base.ui.CoreInteractivePlayer$getIntents$$inlined$mapNotNull$1

            /* renamed from: com.vk.movika.sdk.base.ui.CoreInteractivePlayer$getIntents$$inlined$mapNotNull$1$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements lsr {
                public final /* synthetic */ lsr b;
                public final /* synthetic */ y c;

                @b6l(c = "com.vk.movika.sdk.base.ui.CoreInteractivePlayer$getIntents$$inlined$mapNotNull$1$2", f = "CoreInteractivePlayer.kt", l = {Sdk.SDKError.Reason.PRIVACY_ICON_FALLBACK_ERROR_VALUE}, m = "emit")
                /* renamed from: com.vk.movika.sdk.base.ui.CoreInteractivePlayer$getIntents$$inlined$mapNotNull$1$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends ContinuationImpl {
                    public /* synthetic */ Object a;
                    public int b;

                    public AnonymousClass1(spj spjVar) {
                        super(spjVar);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        this.a = obj;
                        this.b |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(lsr lsrVar, y yVar) {
                    this.b = lsrVar;
                    this.c = yVar;
                }

                /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
                @Override // xsna.lsr
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object emit(Object obj, spj spjVar) {
                    AnonymousClass1 anonymousClass1;
                    int i;
                    if (spjVar instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) spjVar;
                        int i2 = anonymousClass1.b;
                        if ((i2 & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.b = i2 - Integer.MIN_VALUE;
                            Object obj2 = anonymousClass1.a;
                            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                            i = anonymousClass1.b;
                            if (i != 0) {
                                kotlin.a.a(obj2);
                                EventTag eventTag = (EventTag) obj;
                                int i3 = com.vk.movika.sdk.utils.f.b.b - 1;
                                y yVar = this.c;
                                com.vk.movika.sdk.base.logic.dto.c cVar = null;
                                if (i3 <= 0) {
                                    com.vk.movika.sdk.utils.c.a(yVar, null);
                                    Objects.toString(eventTag);
                                }
                                EventTag.Type type = eventTag.b;
                                com.vk.movika.sdk.base.model.f fVar = eventTag.a;
                                if (type == EventTag.Type.BIND) {
                                    cVar = new c.b(fVar);
                                } else if (yVar.k.contains(fVar)) {
                                    cVar = new c.C1298c(fVar);
                                }
                                if (cVar != null) {
                                    anonymousClass1.b = 1;
                                    if (this.b.emit(cVar, anonymousClass1) == coroutineSingletons) {
                                        return coroutineSingletons;
                                    }
                                }
                            } else {
                                if (i != 1) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                kotlin.a.a(obj2);
                            }
                            return s3q0.a;
                        }
                    }
                    anonymousClass1 = new AnonymousClass1(spjVar);
                    Object obj22 = anonymousClass1.a;
                    CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = anonymousClass1.b;
                    if (i != 0) {
                    }
                    return s3q0.a;
                }
            }

            @Override // xsna.ksr
            public final Object collect(lsr<? super com.vk.movika.sdk.base.logic.dto.c> lsrVar, spj spjVar) {
                Object collect = com.vk.catalog.mvi.section.screen.impl.ui.c.this.collect(new AnonymousClass2(lsrVar, this), spjVar);
                return collect == CoroutineSingletons.COROUTINE_SUSPENDED ? collect : s3q0.a;
            }
        }, a3);
        int i2 = mtr.a;
        d1b d1bVar = new d1b(l, EmptyCoroutineContext.b, -2, BufferOverflow.SUSPEND);
        if (com.vk.movika.sdk.utils.f.b.b - 1 <= 0) {
            com.vk.movika.sdk.utils.c.a(dVar, "GamePresenterImpl");
        }
        rsr.s(rsr.q(new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(new FlowKt__ErrorsKt$catch$$inlined$unsafeFlow$1(new FlowKt__EmittersKt$onStart$$inlined$unsafeFlow$1(rsr.q(new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(new FlowKt__TransformKt$runningFold$$inlined$unsafeFlow$1(new l0(null, null, null, false, null, 0L, null, 16383), new a.e(new izg0(new com.vk.movika.sdk.utils.j(new a.f(new a.g(new FlowKt__TransformKt$runningFold$$inlined$unsafeFlow$1(new d.c(null, null), d1bVar, new a.h(dVar, null)), dVar), dVar), new a.i(2, dVar, com.vk.movika.sdk.base.presenter.d.class, "extractInitDistributeActionState", "extractInitDistributeActionState(Lcom/vk/movika/sdk/base/presenter/GamePresenterImpl$WithManifest;)Lcom/vk/movika/sdk/base/presenter/GamePresenterImpl$WithManifest;", 4), new a.j(dVar, null), null))), new a.k(dVar, null)), new a.l(dVar, null)), wglVar), new u(this, null)), new w(this, null)), new x(this, null)), ge00Var), a2);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object x(y yVar, com.vk.movika.sdk.player.base.model.a aVar, ContinuationImpl continuationImpl) {
        a0 a0Var;
        int i;
        yVar.getClass();
        if (continuationImpl instanceof a0) {
            a0Var = (a0) continuationImpl;
            int i2 = a0Var.c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                a0Var.c = i2 - Integer.MIN_VALUE;
                Object obj = a0Var.a;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = a0Var.c;
                if (i != 0) {
                    kotlin.a.a(obj);
                    Chapter chapter = yVar.i;
                    if (chapter == null) {
                        return s3q0.a;
                    }
                    com.vk.movika.sdk.base.model.s sVar = yVar.j;
                    Chapter chapter2 = null;
                    if (sVar != null) {
                        chapter2 = sVar.a(aVar != null ? aVar.b : null);
                    }
                    if (chapter2 != null) {
                        com.vk.movika.sdk.base.logic.dto.c nVar = new c.n(chapter, chapter2);
                        a0Var.c = 1;
                        obj = yVar.q(nVar, a0Var);
                        if (obj == obj2) {
                            return obj2;
                        }
                    }
                    return s3q0.a;
                }
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.a.a(obj);
                ((Boolean) obj).getClass();
                return s3q0.a;
            }
        }
        a0Var = new a0(yVar, continuationImpl);
        Object obj3 = a0Var.a;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = a0Var.c;
        if (i != 0) {
        }
        ((Boolean) obj3).getClass();
        return s3q0.a;
    }

    public final void A(com.vk.movika.sdk.base.ui.d dVar) {
        this.x = dVar;
        if (dVar != null) {
            this.b.getClass();
            dVar.i(new d.a.f(0));
            Chapter chapter = this.i;
            List<com.vk.movika.sdk.base.model.f> list = this.k;
            com.vk.movika.sdk.base.model.o oVar = this.n;
            if (oVar == null) {
                oVar = this.o;
            }
            t(chapter, list, oVar, dVar);
            dVar.i(new d.a.i(this.t.d.m));
        }
    }

    @Override // com.vk.movika.sdk.base.b
    public final List<com.vk.movika.sdk.base.model.f> a() {
        return this.k;
    }

    @Override // com.vk.movika.sdk.base.b
    public final com.vk.movika.sdk.base.e b(Long l) {
        Object obj;
        Set set;
        v0 v0Var = this.r;
        long o = v0Var.o(v0Var.d.a.q());
        com.vk.movika.sdk.base.presenter.d dVar = this.t;
        com.vk.movika.sdk.base.model.s sVar = dVar.d.a;
        if (sVar == null) {
            return e.f.a;
        }
        com.vk.movika.sdk.base.logic.interactor.o oVar = dVar.b;
        com.vk.movika.sdk.base.logic.e eVar = dVar.c;
        oVar.a(sVar).d.getClass();
        Chapter a2 = sVar.a(eVar.b);
        List b2 = a2 != null ? com.vk.movika.sdk.base.utils.d.b(a2.d) : EmptyList.b;
        if (!b2.isEmpty()) {
            if (com.vk.movika.sdk.base.logic.processor.actions.a.d(eVar, sVar).isEmpty()) {
                Set<com.vk.movika.sdk.base.model.d> set2 = eVar.e;
                if (set2 != null && !set2.isEmpty()) {
                    if (set2.isEmpty()) {
                        set = EmptySet.b;
                    } else {
                        HashSet hashSet = new HashSet(set2.size());
                        Iterator<T> it = set2.iterator();
                        while (it.hasNext()) {
                            hashSet.add(((com.vk.movika.sdk.base.model.d) it.next()).a);
                        }
                        set = hashSet;
                    }
                    ArrayList arrayList = new ArrayList();
                    for (Object obj2 : b2) {
                        if (!set.contains(((com.vk.movika.sdk.base.model.f) obj2).a)) {
                            arrayList.add(obj2);
                        }
                    }
                    b2 = arrayList;
                }
                long longValue = l != null ? l.longValue() : 0L;
                if (longValue < 750) {
                    longValue = 750;
                }
                ArrayList arrayList2 = new ArrayList();
                for (Object obj3 : b2) {
                    com.vk.movika.sdk.base.model.f fVar = (com.vk.movika.sdk.base.model.f) obj3;
                    if (fVar.c > o && com.vk.movika.sdk.base.utils.d.c(fVar)) {
                        arrayList2.add(obj3);
                    }
                }
                Iterator it2 = arrayList2.iterator();
                if (it2.hasNext()) {
                    Object next = it2.next();
                    if (it2.hasNext()) {
                        long j = ((com.vk.movika.sdk.base.model.f) next).c;
                        do {
                            Object next2 = it2.next();
                            long j2 = ((com.vk.movika.sdk.base.model.f) next2).c;
                            if (j > j2) {
                                next = next2;
                                j = j2;
                            }
                        } while (it2.hasNext());
                    }
                    obj = next;
                } else {
                    obj = null;
                }
                com.vk.movika.sdk.base.model.f fVar2 = (com.vk.movika.sdk.base.model.f) obj;
                if (b2.isEmpty()) {
                    return e.c.a;
                }
                if (fVar2 != null) {
                    long j3 = fVar2.c;
                    if (o < j3) {
                        return o >= j3 - longValue ? e.C1292e.a : e.a.a;
                    }
                }
            }
            return e.b.a;
        }
        return e.d.a;
    }

    @Override // com.vk.movika.sdk.base.a
    public final com.vk.movika.sdk.base.observable.z c() {
        return this.d.z;
    }

    @Override // com.vk.movika.sdk.base.b
    public final Chapter d() {
        return this.i;
    }

    @Override // com.vk.movika.sdk.base.a
    public final com.vk.movika.sdk.base.observable.t e() {
        return this.d.f;
    }

    @Override // com.vk.movika.sdk.base.a
    public final com.vk.movika.sdk.base.observable.f f() {
        return this.d.u;
    }

    @Override // com.vk.movika.sdk.base.b
    public final long g() {
        v0 v0Var = this.r;
        return v0Var.o(v0Var.d.a.q());
    }

    @Override // com.vk.movika.sdk.player.base.observable.b
    public final void h(com.vk.movika.sdk.player.base.listener.a aVar) {
        this.r.h(aVar);
    }

    @Override // com.vk.movika.sdk.base.a
    public final com.vk.movika.sdk.base.observable.x j() {
        return this.d.s;
    }

    @Override // com.vk.movika.sdk.base.a
    public final com.vk.movika.sdk.base.observable.d k() {
        return this.d.m;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0049 A[RETURN] */
    @Override // com.vk.movika.sdk.base.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final com.vk.movika.sdk.base.d l() {
        com.vk.movika.sdk.base.d dVar;
        List<com.vk.movika.sdk.base.model.c> list;
        com.vk.movika.sdk.base.presenter.d dVar2 = this.t;
        com.vk.movika.sdk.base.model.s sVar = dVar2.d.a;
        if (sVar != null) {
            com.vk.movika.sdk.base.logic.interactor.o oVar = dVar2.b;
            com.vk.movika.sdk.base.logic.e eVar = dVar2.c;
            oVar.a(sVar).d.getClass();
            Chapter a2 = sVar.a(eVar.b);
            com.vk.movika.sdk.base.model.o oVar2 = eVar.j;
            if (oVar2 != null && (list = oVar2.h) != null) {
                if (list.isEmpty()) {
                    list = null;
                }
                if (list != null) {
                    dVar = com.vk.movika.sdk.base.model.m.c(a2) ? d.b.a : list.size() == 1 ? d.C1289d.a : d.a.a;
                    if (dVar != null) {
                        return dVar;
                    }
                }
            }
            dVar = d.c.a;
            if (dVar != null) {
            }
        }
        return d.e.a;
    }

    @Override // com.vk.movika.sdk.player.base.components.c
    public final void m(long j, Object obj) {
        this.r.q(j, obj, true);
    }

    @Override // com.vk.movika.sdk.player.base.observable.b
    public final void n(com.vk.movika.sdk.player.base.listener.a aVar) {
        this.r.n(aVar);
    }

    @Override // com.vk.movika.sdk.base.a
    public final com.vk.movika.sdk.base.observable.b o() {
        return this.d.q;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object q(com.vk.movika.sdk.base.logic.dto.c cVar, ContinuationImpl continuationImpl) {
        f0 f0Var;
        int i;
        if (continuationImpl instanceof f0) {
            f0Var = (f0) continuationImpl;
            int i2 = f0Var.c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                f0Var.c = i2 - Integer.MIN_VALUE;
                Object obj = f0Var.a;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = f0Var.c;
                boolean z = true;
                if (i != 0) {
                    kotlin.a.a(obj);
                    if (this.p.b) {
                        z = false;
                    } else {
                        f0Var.c = 1;
                        if (this.u.emit(cVar, f0Var) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.a.a(obj);
                }
                return Boolean.valueOf(z);
            }
        }
        f0Var = new f0(this, continuationImpl);
        Object obj2 = f0Var.a;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = f0Var.c;
        boolean z2 = true;
        if (i != 0) {
        }
        return Boolean.valueOf(z2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v10, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r3v1, types: [T, com.vk.movika.sdk.base.ui.j0, com.vk.movika.sdk.player.base.components.b$a] */
    public final void r(Chapter chapter) {
        ArrayList arrayList = chapter.e;
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (((com.vk.movika.sdk.base.model.a) next).e == null) {
                arrayList2.add(next);
            }
        }
        ArrayList arrayList3 = new ArrayList();
        Iterator it2 = arrayList2.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            com.vk.movika.sdk.base.model.a aVar = (com.vk.movika.sdk.base.model.a) it2.next();
            com.vk.movika.sdk.base.model.s sVar = this.j;
            Chapter a2 = sVar != null ? sVar.a(aVar.c) : null;
            if (a2 != null) {
                arrayList3.add(a2);
            }
        }
        boolean z = this.b.a;
        v0 v0Var = this.r;
        i0 i0Var = v0Var.i;
        if (!z) {
            Iterator it3 = arrayList3.iterator();
            while (it3.hasNext()) {
                com.vk.movika.sdk.player.base.model.a p = v0Var.p((Chapter) it3.next());
                if (p != null) {
                    i0Var.a(p, new w0(null, p));
                }
            }
            return;
        }
        q0 q0Var = new q0(v0Var, 0);
        ArrayList arrayList4 = new ArrayList();
        Iterator it4 = arrayList3.iterator();
        while (it4.hasNext()) {
            com.vk.movika.sdk.player.base.model.a p2 = v0Var.p((Chapter) it4.next());
            if (p2 != null) {
                arrayList4.add(p2);
            }
        }
        i0Var.getClass();
        if (arrayList4.isEmpty()) {
            EmptyList emptyList = EmptyList.b;
            q0Var.invoke(emptyList, emptyList);
            return;
        }
        Ref$BooleanRef ref$BooleanRef = new Ref$BooleanRef();
        ArrayList arrayList5 = new ArrayList(arrayList4);
        com.vk.movika.sdk.player.base.model.a aVar2 = (com.vk.movika.sdk.player.base.model.a) g5g.G(arrayList5);
        ArrayList arrayList6 = new ArrayList();
        ArrayList arrayList7 = new ArrayList();
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        ?? j0Var = new j0(ref$BooleanRef, arrayList6, arrayList7, arrayList5, i0Var, ref$ObjectRef, q0Var);
        ref$ObjectRef.element = j0Var;
        i0Var.a(aVar2, j0Var);
    }

    /* JADX WARN: Type inference failed for: r5v3, types: [java.lang.Object, java.util.Collection] */
    public final void s(Chapter chapter, com.vk.movika.sdk.base.ui.d dVar, List<? extends com.vk.movika.sdk.base.model.k> list) {
        if (com.vk.movika.sdk.utils.f.b.b - 1 <= 0) {
            com.vk.movika.sdk.utils.c.a(this, null);
            String str = chapter.a;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (obj instanceof com.vk.movika.sdk.base.model.f) {
                arrayList.add(obj);
            }
        }
        if (dVar != null) {
            dVar.i(new d.a.f(arrayList));
        }
        v(chapter.d, 0L);
        r(chapter);
        this.i = chapter;
        this.g = j5g.v0(new f(this, 0), this.g);
    }

    public final void t(Chapter chapter, List<com.vk.movika.sdk.base.model.f> list, com.vk.movika.sdk.base.model.o oVar, com.vk.movika.sdk.base.ui.d dVar) {
        if (list.isEmpty()) {
            return;
        }
        v0 v0Var = this.r;
        long o = v0Var.o(v0Var.d.a.q());
        for (com.vk.movika.sdk.base.model.f fVar : list) {
            if (dVar != null) {
                dVar.i(new d.a.h(fVar, o, new i(0, this, chapter), oVar, this.s));
            }
        }
        if (dVar != null) {
            dVar.p();
        }
    }

    public final void u(PlaybackStateListener.PlaybackState playbackState) {
        if (playbackState == null) {
            return;
        }
        v0 v0Var = this.r;
        long o = v0Var.o(v0Var.d.a.q());
        com.vk.movika.sdk.base.ui.d dVar = this.x;
        if (dVar == null && com.vk.movika.sdk.utils.f.b.b - 2 <= 0) {
            com.vk.movika.sdk.utils.c.a(this, null);
        }
        if (dVar != null) {
            dVar.i(new d.a.e(o, playbackState));
        }
    }

    public final void v(ArrayList arrayList, long j) {
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            com.vk.movika.sdk.base.model.f fVar = (com.vk.movika.sdk.base.model.f) it.next();
            long j2 = fVar.c;
            Long l = fVar.d;
            EventTag eventTag = new EventTag(fVar, EventTag.Type.BIND);
            v0 v0Var = this.r;
            v0Var.getClass();
            if (j < j2 + 1000) {
                v0Var.q(j2, eventTag, false);
            }
            if (l != null && l.longValue() >= j) {
                long longValue = l.longValue();
                EventTag eventTag2 = new EventTag(fVar, EventTag.Type.TIMEOUT);
                if (j < 1000 + longValue) {
                    v0Var.q(longValue, eventTag2, false);
                }
            }
        }
    }

    /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object, java.util.Set] */
    /* JADX WARN: Type inference failed for: r4v8, types: [java.lang.Object, java.util.Collection] */
    public final boolean w(com.vk.movika.sdk.base.logic.dto.c cVar, boolean z) {
        if (this.p.b) {
            return false;
        }
        if (z && !this.m.isEmpty()) {
            if (com.vk.movika.sdk.utils.f.b.b - 1 <= 0) {
                com.vk.movika.sdk.utils.c.a(this, null);
                Objects.toString(cVar);
            }
            this.l = j5g.v0(cVar, this.l);
            return true;
        }
        boolean e = this.u.e(cVar);
        if (!e && com.vk.movika.sdk.utils.f.b.b - 2 <= 0) {
            com.vk.movika.sdk.utils.c.a(this, null);
            Objects.toString(cVar);
        }
        return e;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.Collection] */
    public final void y() {
        boolean z = true;
        if (com.vk.movika.sdk.utils.f.b.b - 1 <= 0) {
            com.vk.movika.sdk.utils.c.a(this, null);
        }
        v0 v0Var = this.r;
        if (w(new c.g(Long.valueOf(v0Var.o(v0Var.d.a.q()))), true)) {
            this.p = d.a(this.p, Boolean.TRUE, false, null, null, 62);
            this.g = j5g.v0(new n(this, z), this.g);
        }
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, java.util.Collection] */
    public final void z() {
        if (com.vk.movika.sdk.utils.f.b.b - 1 <= 0) {
            com.vk.movika.sdk.utils.c.a(this, null);
        }
        v0 v0Var = this.r;
        if (w(new c.h(Long.valueOf(v0Var.o(v0Var.d.a.q()))), true)) {
            this.p = d.a(this.p, Boolean.FALSE, false, null, null, 62);
            this.g = j5g.v0(new n(this, false), this.g);
        }
    }
}
