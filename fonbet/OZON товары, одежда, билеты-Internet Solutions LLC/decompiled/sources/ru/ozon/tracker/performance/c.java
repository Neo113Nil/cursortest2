package ru.ozon.tracker.performance;

import androidx.recyclerview.widget.LinearLayoutManager;
import java.util.ArrayList;
import kotlin.coroutines.jvm.internal.e;
import kotlin.jvm.internal.M;
import org.jetbrains.annotations.NotNull;
import ru.ozon.tracker.performance.model.TraceEntity;

@e(c = "ru.ozon.tracker.performance.TraceMapper", f = "TraceMapper.kt", l = {187}, m = "createTraceEntity")
/* loaded from: classes7.dex */
final class c extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: A, reason: collision with root package name */
    M f97783A;

    /* renamed from: B, reason: collision with root package name */
    M f97784B;

    /* renamed from: C, reason: collision with root package name */
    M f97785C;

    /* renamed from: D, reason: collision with root package name */
    M f97786D;

    /* renamed from: E, reason: collision with root package name */
    M f97787E;

    /* renamed from: F, reason: collision with root package name */
    M f97788F;

    /* renamed from: G, reason: collision with root package name */
    M f97789G;

    /* renamed from: H, reason: collision with root package name */
    M f97790H;

    /* renamed from: I, reason: collision with root package name */
    M f97791I;

    /* renamed from: J, reason: collision with root package name */
    ArrayList f97792J;

    /* renamed from: K, reason: collision with root package name */
    ArrayList f97793K;

    /* renamed from: L, reason: collision with root package name */
    TraceEntity.VideoMetric f97794L;

    /* renamed from: M, reason: collision with root package name */
    ArrayList f97795M;

    /* renamed from: N, reason: collision with root package name */
    /* synthetic */ Object f97796N;

    /* renamed from: O, reason: collision with root package name */
    final /* synthetic */ d f97797O;

    /* renamed from: P, reason: collision with root package name */
    int f97798P;

    /* renamed from: d, reason: collision with root package name */
    d f97799d;

    /* renamed from: e, reason: collision with root package name */
    M f97800e;

    /* renamed from: f, reason: collision with root package name */
    M f97801f;

    /* renamed from: g, reason: collision with root package name */
    M f97802g;

    /* renamed from: h, reason: collision with root package name */
    M f97803h;

    /* renamed from: i, reason: collision with root package name */
    M f97804i;

    /* renamed from: j, reason: collision with root package name */
    M f97805j;

    /* renamed from: k, reason: collision with root package name */
    M f97806k;

    /* renamed from: l, reason: collision with root package name */
    M f97807l;

    /* renamed from: m, reason: collision with root package name */
    M f97808m;

    /* renamed from: n, reason: collision with root package name */
    M f97809n;

    /* renamed from: o, reason: collision with root package name */
    M f97810o;

    /* renamed from: p, reason: collision with root package name */
    M f97811p;

    /* renamed from: q, reason: collision with root package name */
    M f97812q;

    /* renamed from: r, reason: collision with root package name */
    M f97813r;

    /* renamed from: s, reason: collision with root package name */
    M f97814s;

    /* renamed from: t, reason: collision with root package name */
    M f97815t;

    /* renamed from: u, reason: collision with root package name */
    M f97816u;

    /* renamed from: v, reason: collision with root package name */
    M f97817v;

    /* renamed from: w, reason: collision with root package name */
    M f97818w;

    /* renamed from: x, reason: collision with root package name */
    M f97819x;

    /* renamed from: y, reason: collision with root package name */
    M f97820y;

    /* renamed from: z, reason: collision with root package name */
    M f97821z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    c(d dVar, kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
        this.f97797O = dVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f97796N = obj;
        this.f97798P |= LinearLayoutManager.INVALID_OFFSET;
        return this.f97797O.b(null, this);
    }
}
