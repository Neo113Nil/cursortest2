package kotlin.coroutines;

import B3.D;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.K;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class c implements CoroutineContext, Serializable {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final CoroutineContext f71761a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final CoroutineContext.Element f71762b;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0002\u0018\u0000 \u00062\u00060\u0001j\u0002`\u0002:\u0001\u0007J\u000f\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\b"}, d2 = {"Lkotlin/coroutines/c$a;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "", "readResolve", "()Ljava/lang/Object;", "b", "a", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes10.dex */
    private static final class a implements Serializable {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final CoroutineContext[] f71764a;

        public a(@NotNull CoroutineContext[] elements) {
            Intrinsics.checkNotNullParameter(elements, "elements");
            this.f71764a = elements;
        }

        private final Object readResolve() {
            CoroutineContext coroutineContext = g.f71771a;
            for (CoroutineContext coroutineContext2 : this.f71764a) {
                coroutineContext = coroutineContext.plus(coroutineContext2);
            }
            return coroutineContext;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "acc", "Lkotlin/coroutines/CoroutineContext$Element;", "element", "a", "(Ljava/lang/String;Lkotlin/coroutines/CoroutineContext$Element;)Ljava/lang/String;"}, k = 3, mv = {1, 9, 0})
    /* loaded from: classes10.dex */
    static final class b extends AbstractC7737t implements Function2<String, CoroutineContext.Element, String> {

        /* renamed from: b, reason: collision with root package name */
        public static final b f71765b = new b(2);

        b() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke(String acc, CoroutineContext.Element element) {
            Intrinsics.checkNotNullParameter(acc, "acc");
            Intrinsics.checkNotNullParameter(element, "element");
            if (acc.length() == 0) {
                return element.toString();
            }
            return acc + ", " + element;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "<anonymous parameter 0>", "Lkotlin/coroutines/CoroutineContext$Element;", "element", "a", "(Lkotlin/Unit;Lkotlin/coroutines/CoroutineContext$Element;)V"}, k = 3, mv = {1, 9, 0})
    /* renamed from: kotlin.coroutines.c$c, reason: collision with other inner class name */
    /* loaded from: classes10.dex */
    static final class C1188c extends AbstractC7737t implements Function2<Unit, CoroutineContext.Element, Unit> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ CoroutineContext[] f71766b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ K f71767c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C1188c(CoroutineContext[] coroutineContextArr, K k11) {
            super(2);
            this.f71766b = coroutineContextArr;
            this.f71767c = k11;
        }

        public final void a(Unit unit, CoroutineContext.Element element) {
            Intrinsics.checkNotNullParameter(unit, "<anonymous parameter 0>");
            Intrinsics.checkNotNullParameter(element, "element");
            K k11 = this.f71767c;
            int i11 = k11.f71785a;
            k11.f71785a = i11 + 1;
            this.f71766b[i11] = element;
        }

        @Override // kotlin.jvm.functions.Function2
        public final /* bridge */ /* synthetic */ Unit invoke(Unit unit, CoroutineContext.Element element) {
            a(unit, element);
            return Unit.f71690a;
        }
    }

    public c(@NotNull CoroutineContext left, @NotNull CoroutineContext.Element element) {
        Intrinsics.checkNotNullParameter(left, "left");
        Intrinsics.checkNotNullParameter(element, "element");
        this.f71761a = left;
        this.f71762b = element;
    }

    private final int a() {
        int i11 = 2;
        c cVar = this;
        while (true) {
            CoroutineContext coroutineContext = cVar.f71761a;
            cVar = coroutineContext instanceof c ? (c) coroutineContext : null;
            if (cVar == null) {
                return i11;
            }
            i11++;
        }
    }

    private final Object writeReplace() {
        int a11 = a();
        CoroutineContext[] coroutineContextArr = new CoroutineContext[a11];
        K k11 = new K();
        fold(Unit.f71690a, new C1188c(coroutineContextArr, k11));
        if (k11.f71785a == a11) {
            return new a(coroutineContextArr);
        }
        throw new IllegalStateException("Check failed.");
    }

    public final boolean equals(Object obj) {
        boolean z11;
        if (this == obj) {
            return true;
        }
        if (obj instanceof c) {
            c cVar = (c) obj;
            if (cVar.a() == a()) {
                c cVar2 = this;
                while (true) {
                    CoroutineContext.Element element = cVar2.f71762b;
                    if (!Intrinsics.d(cVar.get(element.getKey()), element)) {
                        z11 = false;
                        break;
                    }
                    CoroutineContext coroutineContext = cVar2.f71761a;
                    if (!(coroutineContext instanceof c)) {
                        Intrinsics.g(coroutineContext, "null cannot be cast to non-null type kotlin.coroutines.CoroutineContext.Element");
                        CoroutineContext.Element element2 = (CoroutineContext.Element) coroutineContext;
                        z11 = Intrinsics.d(cVar.get(element2.getKey()), element2);
                        break;
                    }
                    cVar2 = (c) coroutineContext;
                }
                if (z11) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final <R> R fold(R r11, @NotNull Function2<? super R, ? super CoroutineContext.Element, ? extends R> operation) {
        Intrinsics.checkNotNullParameter(operation, "operation");
        return operation.invoke((Object) this.f71761a.fold(r11, operation), this.f71762b);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final <E extends CoroutineContext.Element> E get(@NotNull CoroutineContext.a<E> key) {
        Intrinsics.checkNotNullParameter(key, "key");
        c cVar = this;
        while (true) {
            E e11 = (E) cVar.f71762b.get(key);
            if (e11 != null) {
                return e11;
            }
            CoroutineContext coroutineContext = cVar.f71761a;
            if (!(coroutineContext instanceof c)) {
                return (E) coroutineContext.get(key);
            }
            cVar = (c) coroutineContext;
        }
    }

    public final int hashCode() {
        return this.f71762b.hashCode() + this.f71761a.hashCode();
    }

    @Override // kotlin.coroutines.CoroutineContext
    @NotNull
    public final CoroutineContext minusKey(@NotNull CoroutineContext.a<?> key) {
        Intrinsics.checkNotNullParameter(key, "key");
        CoroutineContext.Element element = this.f71762b;
        CoroutineContext.Element element2 = element.get(key);
        CoroutineContext coroutineContext = this.f71761a;
        if (element2 != null) {
            return coroutineContext;
        }
        CoroutineContext minusKey = coroutineContext.minusKey(key);
        return minusKey == coroutineContext ? this : minusKey == g.f71771a ? element : new c(minusKey, element);
    }

    @Override // kotlin.coroutines.CoroutineContext
    @NotNull
    public final CoroutineContext plus(@NotNull CoroutineContext context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return context == g.f71771a ? this : (CoroutineContext) context.fold(this, f.f71770b);
    }

    @NotNull
    public final String toString() {
        return D.c(new StringBuilder("["), (String) fold("", b.f71765b), ']');
    }
}
