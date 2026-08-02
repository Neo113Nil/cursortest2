package gh;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.TypeIntrinsics;

/* renamed from: gh.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4382c {

    /* renamed from: e, reason: collision with root package name */
    public static final a f47430e = new a(null);

    /* renamed from: f, reason: collision with root package name */
    public static final List f47431f = new ArrayList();

    /* renamed from: a, reason: collision with root package name */
    public final C4387h f47432a;

    /* renamed from: b, reason: collision with root package name */
    public final AbstractC4388i f47433b;

    /* renamed from: c, reason: collision with root package name */
    public List f47434c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f47435d;

    /* renamed from: gh.c$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public a() {
        }
    }

    public C4382c(C4387h phase, AbstractC4388i relation, List interceptors) {
        Intrinsics.checkNotNullParameter(phase, "phase");
        Intrinsics.checkNotNullParameter(relation, "relation");
        Intrinsics.checkNotNullParameter(interceptors, "interceptors");
        this.f47432a = phase;
        this.f47433b = relation;
        this.f47434c = interceptors;
        this.f47435d = true;
    }

    public final void a(Function3 interceptor) {
        Intrinsics.checkNotNullParameter(interceptor, "interceptor");
        if (this.f47435d) {
            d();
        }
        this.f47434c.add(interceptor);
    }

    public final void b(List destination) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        List list = this.f47434c;
        if (destination instanceof ArrayList) {
            ((ArrayList) destination).ensureCapacity(destination.size() + list.size());
        }
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            destination.add(list.get(i10));
        }
    }

    public final List c() {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.f47434c);
        return arrayList;
    }

    public final void d() {
        this.f47434c = c();
        this.f47435d = false;
    }

    public final C4387h e() {
        return this.f47432a;
    }

    public final AbstractC4388i f() {
        return this.f47433b;
    }

    public final int g() {
        return this.f47434c.size();
    }

    public final boolean h() {
        return this.f47434c.isEmpty();
    }

    public final List i() {
        this.f47435d = true;
        return this.f47434c;
    }

    public String toString() {
        return "Phase `" + this.f47432a.a() + "`, " + g() + " handlers";
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C4382c(C4387h phase, AbstractC4388i relation) {
        this(phase, relation, TypeIntrinsics.asMutableList(r0));
        Intrinsics.checkNotNullParameter(phase, "phase");
        Intrinsics.checkNotNullParameter(relation, "relation");
        List list = f47431f;
        Intrinsics.checkNotNull(list, "null cannot be cast to non-null type kotlin.collections.MutableList<kotlin.Function3<io.ktor.util.pipeline.PipelineContext<TSubject of io.ktor.util.pipeline.PhaseContent, Call of io.ktor.util.pipeline.PhaseContent>, TSubject of io.ktor.util.pipeline.PhaseContent, kotlin.coroutines.Continuation<kotlin.Unit>, kotlin.Any?>{ io.ktor.util.pipeline.PipelineKt.PipelineInterceptorFunction<TSubject of io.ktor.util.pipeline.PhaseContent, Call of io.ktor.util.pipeline.PhaseContent> }>");
        if (!list.isEmpty()) {
            throw new IllegalStateException("The shared empty array list has been modified");
        }
    }
}
