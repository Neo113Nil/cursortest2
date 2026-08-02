package nb0;

import G.g;
import java.net.URLEncoder;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: nb0.a, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
final class C8483a extends AbstractC7737t implements Function1<Pair<? extends String, ? extends String>, CharSequence> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ C8485c f76721b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C8483a(C8485c c8485c) {
        super(1);
        this.f76721b = c8485c;
    }

    @Override // kotlin.jvm.functions.Function1
    public final CharSequence invoke(Pair<? extends String, ? extends String> pair) {
        String str;
        Pair<? extends String, ? extends String> pair2 = pair;
        Intrinsics.checkNotNullParameter(pair2, "<destruct>");
        String a11 = pair2.a();
        String b11 = pair2.b();
        if (b11 != null) {
            this.f76721b.getClass();
            str = URLEncoder.encode(b11, "UTF-8");
            Intrinsics.checkNotNullExpressionValue(str, "encode(...)");
        } else {
            str = null;
        }
        return g.c(a11, "=", str);
    }
}
