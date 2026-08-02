package lf0;

import hf0.AbstractC6947b;
import java.net.URLEncoder;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
final class i extends AbstractC7737t implements Function1<Pair<? extends AbstractC6947b<?>, ? extends Object>, CharSequence> {

    /* renamed from: b, reason: collision with root package name */
    public static final i f73304b = new i(1);

    @Override // kotlin.jvm.functions.Function1
    public final CharSequence invoke(Pair<? extends AbstractC6947b<?>, ? extends Object> pair) {
        String valueOf;
        Pair<? extends AbstractC6947b<?>, ? extends Object> it = pair;
        Intrinsics.checkNotNullParameter(it, "it");
        it.e().getClass();
        Object f7 = it.f();
        if (f7 instanceof String) {
            String str = (String) f7;
            Intrinsics.checkNotNullParameter(str, "<this>");
            String encode = URLEncoder.encode(str, "UTF-8");
            Intrinsics.checkNotNullExpressionValue(encode, "encode(...)");
            valueOf = kotlin.text.h.X(encode, "+", "%20", false);
        } else {
            valueOf = String.valueOf(f7);
        }
        return Nk.a.b("null=", valueOf);
    }
}
