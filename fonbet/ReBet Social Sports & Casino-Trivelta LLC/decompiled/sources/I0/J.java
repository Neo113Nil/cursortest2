package I0;

import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class J implements CoroutineContext.Element {

    /* renamed from: c, reason: collision with root package name */
    public static final a f5077c = new a(null);

    /* renamed from: d, reason: collision with root package name */
    public static final String f5078d = "Calling updateData inside updateData on the same DataStore instance is not supported\nsince updates made in the parent updateData call will not be visible to the nested\nupdateData call. See https://issuetracker.google.com/issues/241760537 for details.";

    /* renamed from: a, reason: collision with root package name */
    public final J f5079a;

    /* renamed from: b, reason: collision with root package name */
    public final C1346k f5080b;

    public static final class a {

        /* renamed from: I0.J$a$a, reason: collision with other inner class name */
        public static final class C0106a implements CoroutineContext.Key {

            /* renamed from: a, reason: collision with root package name */
            public static final C0106a f5081a = new C0106a();
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public a() {
        }
    }

    public J(J j10, C1346k instance) {
        Intrinsics.checkNotNullParameter(instance, "instance");
        this.f5079a = j10;
        this.f5080b = instance;
    }

    public final void a(InterfaceC1344i candidate) {
        Intrinsics.checkNotNullParameter(candidate, "candidate");
        if (this.f5080b == candidate) {
            throw new IllegalStateException(f5078d.toString());
        }
        J j10 = this.f5079a;
        if (j10 != null) {
            j10.a(candidate);
        }
    }

    @Override // kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
    public Object fold(Object obj, Function2 function2) {
        return CoroutineContext.Element.DefaultImpls.fold(this, obj, function2);
    }

    @Override // kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
    public CoroutineContext.Element get(CoroutineContext.Key key) {
        return CoroutineContext.Element.DefaultImpls.get(this, key);
    }

    @Override // kotlin.coroutines.CoroutineContext.Element
    public CoroutineContext.Key getKey() {
        return a.C0106a.f5081a;
    }

    @Override // kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
    public CoroutineContext minusKey(CoroutineContext.Key key) {
        return CoroutineContext.Element.DefaultImpls.minusKey(this, key);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public CoroutineContext plus(CoroutineContext coroutineContext) {
        return CoroutineContext.Element.DefaultImpls.plus(this, coroutineContext);
    }
}
