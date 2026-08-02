package Og;

import ch.AbstractC2922B;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.KClass;
import kotlin.text.StringsKt;

/* loaded from: classes3.dex */
public final class c extends UnsupportedOperationException {

    /* renamed from: a, reason: collision with root package name */
    public final String f8645a;

    public static final class a extends Lambda implements Function1 {

        /* renamed from: d, reason: collision with root package name */
        public static final a f8646d = new a();

        public a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final CharSequence invoke(Pair pair) {
            Intrinsics.checkNotNullParameter(pair, "<name for destructuring parameter 0>");
            return ((String) pair.component1()) + ": " + ((String) pair.component2()) + '\n';
        }
    }

    public c(Xg.c response, KClass from, KClass to) {
        Intrinsics.checkNotNullParameter(response, "response");
        Intrinsics.checkNotNullParameter(from, "from");
        Intrinsics.checkNotNullParameter(to, "to");
        this.f8645a = StringsKt.trimMargin$default("No transformation found: " + from + " -> " + to + "\n        |with response from " + Xg.e.d(response).getUrl() + ":\n        |status: " + response.f() + "\n        |response headers: \n        |" + CollectionsKt.joinToString$default(AbstractC2922B.f(response.a()), null, null, null, 0, null, a.f8646d, 31, null) + "\n    ", null, 1, null);
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return this.f8645a;
    }
}
