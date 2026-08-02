package ph0;

import De.C2862e;
import Sc.InterfaceC4008j;
import Sc.k;
import Sc.s;
import android.content.Context;
import android.content.SharedPreferences;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import xe.C10727i;
import xe.M;

/* loaded from: classes3.dex */
public final class h<T> implements f<T> {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Context f80559a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final String f80560b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final C2862e f80561c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final AbstractC7737t f80562d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final Je.d f80563e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j f80564f;

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.push.sdk.internal.debug.UnfinishedActionsTrackerImpl$markActionFinished$1", f = "UnfinishedActionsTracker.kt", l = {}, m = "invokeSuspend")
    static final class a extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ h<T> f80565d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ String f80566e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(h<T> hVar, String str, kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
            this.f80565d = hVar;
            this.f80566e = str;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new a(this.f80565d, this.f80566e, dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((a) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            s.b(obj);
            SharedPreferences e11 = h.e(this.f80565d);
            Intrinsics.checkNotNullExpressionValue(e11, "access$getSharedPreferences(...)");
            SharedPreferences.Editor edit = e11.edit();
            edit.remove(this.f80566e);
            edit.commit();
            return Unit.f71690a;
        }
    }

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.push.sdk.internal.debug.UnfinishedActionsTrackerImpl$markActionStarted$1", f = "UnfinishedActionsTracker.kt", l = {}, m = "invokeSuspend")
    static final class b extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ h<T> f80567d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ String f80568e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(h<T> hVar, String str, kotlin.coroutines.d<? super b> dVar) {
            super(2, dVar);
            this.f80567d = hVar;
            this.f80568e = str;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new b(this.f80567d, this.f80568e, dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((b) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            s.b(obj);
            SharedPreferences e11 = h.e(this.f80567d);
            Intrinsics.checkNotNullExpressionValue(e11, "access$getSharedPreferences(...)");
            SharedPreferences.Editor edit = e11.edit();
            edit.putString(this.f80568e, "");
            edit.commit();
            return Unit.f71690a;
        }
    }

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.push.sdk.internal.debug.UnfinishedActionsTrackerImpl$trackUnfinishedActions$1", f = "UnfinishedActionsTracker.kt", l = {}, m = "invokeSuspend")
    static final class c extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ h<T> f80569d;

        static final class a extends AbstractC7737t implements Function0<String> {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ int f80570b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(int i11) {
                super(0);
                this.f80570b = i11;
            }

            @Override // kotlin.jvm.functions.Function0
            public final String invoke() {
                return K00.b.e(this.f80570b, " unfinished actions were found.", new StringBuilder());
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(h<T> hVar, kotlin.coroutines.d<? super c> dVar) {
            super(2, dVar);
            this.f80569d = hVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new c(this.f80569d, dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((c) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            s.b(obj);
            h<T> hVar = this.f80569d;
            int size = h.e(hVar).getAll().size();
            if (size > 0) {
                SharedPreferences e11 = h.e(hVar);
                Intrinsics.checkNotNullExpressionValue(e11, "access$getSharedPreferences(...)");
                SharedPreferences.Editor edit = e11.edit();
                edit.clear();
                edit.commit();
                int i11 = sh0.b.f98783c;
                sh0.b.e(((h) hVar).f80560b, sj.f.b(new Pair("count", new Integer(size))), Boolean.FALSE, new a(size));
            }
            return Unit.f71690a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public h(@NotNull Context context, @NotNull String logTag, @NotNull C2862e actionsTrackerScope, @NotNull Function1 actionDataToIdMapper) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(logTag, "logTag");
        Intrinsics.checkNotNullParameter(actionsTrackerScope, "actionsTrackerScope");
        Intrinsics.checkNotNullParameter(actionDataToIdMapper, "actionDataToIdMapper");
        this.f80559a = context;
        this.f80560b = logTag;
        this.f80561c = actionsTrackerScope;
        this.f80562d = (AbstractC7737t) actionDataToIdMapper;
        this.f80563e = Je.e.a();
        this.f80564f = k.b(new i(this));
    }

    public static final SharedPreferences e(h hVar) {
        return (SharedPreferences) hVar.f80564f.getValue();
    }

    @Override // ph0.f
    public final void a() {
        C10727i.c(this.f80561c, null, null, new g(this, new c(this, null), null), 3);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [kotlin.jvm.functions.Function1, kotlin.jvm.internal.t] */
    public final void f(T t2) {
        String str = (String) this.f80562d.invoke(t2);
        if (str == null) {
            return;
        }
        C10727i.c(this.f80561c, null, null, new g(this, new a(this, str, null), null), 3);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [kotlin.jvm.functions.Function1, kotlin.jvm.internal.t] */
    public final void g(T t2) {
        String str = (String) this.f80562d.invoke(t2);
        if (str == null) {
            return;
        }
        C10727i.c(this.f80561c, null, null, new g(this, new b(this, str, null), null), 3);
    }
}
