package defpackage;

import android.content.Context;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ExecutorService;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class zin {
    public final Context a;
    public final n8p b = n8p.q();
    public final mqn c;
    public final t6o d;
    public final l6n e;
    public final c0l f;
    public final List g;
    public final bqn h;
    public final gbo i;
    public final w8o j;
    public final rbo k;
    public final wco l;
    public final dco m;
    public final b7p n;
    public final e6o o;
    public p4o p;
    public b2p q;

    public zin(mqn mqnVar, Context context, mr9 mr9Var, gbo gboVar, pic picVar, ExecutorService executorService) {
        List synchronizedList = Collections.synchronizedList(new ArrayList(1));
        this.g = synchronizedList;
        this.q = u1p.a;
        this.c = mqnVar;
        this.a = context;
        this.h = (bqn) mr9Var;
        this.i = gboVar;
        b7p T = qha.T(executorService);
        this.n = T;
        t6o t6oVar = new t6o(mqnVar, picVar);
        this.d = t6oVar;
        c0l c0lVar = new c0l(t6oVar);
        this.f = c0lVar;
        this.e = new l6n(mqnVar, gboVar, t6oVar, c0lVar, synchronizedList, T, context);
        this.o = new e6o(context, T, t6oVar, mr9Var, mqnVar.f);
        jca.d0("A given DisplayContainer may only be used once", !gboVar.e);
        gboVar.e = true;
        this.j = new w8o();
        this.k = new rbo(context, T, t6oVar);
        wco wcoVar = new wco(context, T, t6oVar, T.b(new t3n(7, context, T, t6oVar)));
        this.l = wcoVar;
        ViewGroup viewGroup = gboVar.a;
        vdb vdbVar = mqnVar.b;
        this.m = new dco(mqnVar, wcoVar, viewGroup, (w2o) vdbVar.h);
        c8n c8nVar = new c8n(this);
        ((Set) vdbVar.i).add(c8nVar);
        if (vdbVar.a) {
            c8nVar.zza();
        }
    }
}
