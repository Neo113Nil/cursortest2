package com.vk.movika.sdk.base.ui;

import android.view.View;
import com.vk.feed.core.models.news.NewsEntry;
import com.vk.voip.ui.broadcast.fragments.config.BroadcastConfigFragment;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import ru.ok.face.pipeline_frugal.FaceMorphingPipeline;
import ru.ok.tensorflow.entity.Detection;
import ru.ok.tensorflow.util.Function;
import xsna.aj50;
import xsna.aq40;
import xsna.b420;
import xsna.by1;
import xsna.bzp0;
import xsna.com;
import xsna.cpp;
import xsna.cts;
import xsna.ekh;
import xsna.g8l;
import xsna.g9l;
import xsna.h9l;
import xsna.haa;
import xsna.hda;
import xsna.i600;
import xsna.ihz;
import xsna.it80;
import xsna.j5g;
import xsna.ka;
import xsna.ke9;
import xsna.l8k;
import xsna.laa;
import xsna.me9;
import xsna.mqp;
import xsna.mx4;
import xsna.n8z0;
import xsna.n9l;
import xsna.ngl;
import xsna.njz0;
import xsna.ov50;
import xsna.q5e;
import xsna.qi6;
import xsna.r6k;
import xsna.rjz0;
import xsna.ub9;
import xsna.v63;
import xsna.xla;
import xsna.xx0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class p0 implements io.reactivex.rxjava3.functions.l, io.reactivex.rxjava3.functions.m, ub9.c, io.reactivex.rxjava3.functions.k, ihz.a, ngl.a, qi6.b, Function, h9l, n8z0.b {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ p0(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, xsna.fqp] */
    @Override // xsna.qi6.b
    public void a(View view, NewsEntry newsEntry, NewsEntry newsEntry2, int i) {
        ((mqp) this.c).c.G5(view, newsEntry, newsEntry2, i);
    }

    @Override // io.reactivex.rxjava3.functions.l
    public Object apply(Object obj) {
        Detection lambda$process$0;
        int i = this.b;
        Object obj2 = this.c;
        switch (i) {
            case 1:
                return (io.reactivex.rxjava3.core.b0) ((ka) obj2).invoke(obj);
            case 2:
                return (it80) ((xx0) obj2).invoke(obj);
            case 3:
                return (i600) ((mx4) obj2).invoke(obj);
            case 4:
                int i2 = BroadcastConfigFragment.U;
                return (it80) ((com.vk.voip.ui.menu.feature.a) obj2).invoke(obj);
            case 5:
            case 6:
            case 7:
            case 12:
            case 13:
            case 16:
            case 18:
            case 19:
            case 23:
            case 25:
            default:
                return (List) ((aj50) obj2).invoke(obj);
            case 8:
                return (Pair) ((com.vk.voip.ui.menu.feature.a) obj2).invoke(obj);
            case 9:
                return (hda) ((xx0) obj2).invoke(obj);
            case 10:
                return (NewsEntry) ((q5e) obj2).invoke(obj);
            case 11:
                return (io.reactivex.rxjava3.core.b0) ((com.vk.voip.ui.menu.feature.a) obj2).invoke(obj);
            case 14:
                return (io.reactivex.rxjava3.core.t) ((xx0) obj2).invoke(obj);
            case 15:
                return (r6k.a) ((xx0) obj2).invoke(obj);
            case 17:
                return (io.reactivex.rxjava3.core.b0) ((v63) obj2).invoke(obj);
            case 20:
                lambda$process$0 = ((FaceMorphingPipeline) obj2).lambda$process$0((Detection) obj);
                return lambda$process$0;
            case 21:
                return (List) ((com) obj2).invoke(obj);
            case 22:
                return (cts) ((com) obj2).invoke(obj);
            case 24:
                return (b420) ((com) obj2).invoke(obj);
            case 26:
                return (List) ((com) obj2).invoke(obj);
            case 27:
                return (List) ((com) obj2).invoke(obj);
        }
    }

    @Override // xsna.ub9.c
    public Object attachCompleter(ub9.a aVar) {
        me9 me9Var = (me9) this.c;
        me9Var.d.execute(new ke9(0, me9Var, aVar));
        return "addCaptureRequestOptions";
    }

    @Override // io.reactivex.rxjava3.functions.k
    public Object b(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7) {
        laa laaVar = ((haa) this.c).b;
        aq40 aq40Var = laaVar.r;
        List O0 = j5g.O0(laaVar.f.z());
        aq40Var.getClass();
        return aq40.a(aq40Var, (List) obj, (List) obj2, false, (List) obj3, (List) obj4, (List) obj5, (List) obj6, O0, (Map) obj7, null, 1536);
    }

    @Override // xsna.ngl.a
    public void e(bzp0.c cVar) {
        cpp cppVar = (cpp) ((com.vk.auth.enterphone.a) this.c).a;
        if (cppVar != null) {
            cppVar.m2(cVar.a);
        }
    }

    @Override // xsna.n8z0.b
    public void f(njz0 njz0Var, xla xlaVar) {
        ((ov50) this.c).c((rjz0) njz0Var, xlaVar);
    }

    @Override // xsna.ihz.a
    public void invoke(Object obj) {
        ((by1) obj).J((g8l) this.c);
    }

    @Override // xsna.h9l
    public g9l provide() {
        return (n9l) this.c;
    }

    @Override // io.reactivex.rxjava3.functions.m
    public boolean test(Object obj) {
        switch (this.b) {
            case 5:
                return ((Boolean) ((xx0) this.c).invoke(obj)).booleanValue();
            case 12:
                return ((Boolean) ((xx0) this.c).invoke(obj)).booleanValue();
            case 13:
                return ((Boolean) ((ekh) this.c).invoke(obj)).booleanValue();
            default:
                return ((Boolean) ((l8k) this.c).invoke(obj)).booleanValue();
        }
    }

    public /* synthetic */ p0(by1.a aVar, g8l g8lVar) {
        this.b = 16;
        this.c = g8lVar;
    }
}
