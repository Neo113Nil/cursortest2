package f4;

import android.webkit.MimeTypeMap;
import c4.b0;
import d4.q;
import java.util.Locale;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import okio.Okio;
import okio.Path;
import q4.n;
import v4.m;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class k implements h {

    /* renamed from: a, reason: collision with root package name */
    public final b0 f9457a;

    /* renamed from: b, reason: collision with root package name */
    public final n f9458b;

    public k(b0 b0Var, n nVar) {
        this.f9457a = b0Var;
        this.f9458b = nVar;
    }

    @Override // f4.h
    public final Object a(Continuation continuation) {
        b0 b0Var = this.f9457a;
        String str = b0Var.f3573e;
        if (str == null) {
            str = "";
        }
        int F = StringsKt.F(str, '!', 0, false, 6);
        if (F == -1) {
            throw new IllegalStateException(("Invalid jar:file URI: " + b0Var).toString());
        }
        Path.Companion companion = Path.INSTANCE;
        String substring = str.substring(0, F);
        Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
        String str2 = null;
        Path path = Path.Companion.get$default(companion, substring, false, 1, (Object) null);
        String substring2 = str.substring(F + 1, str.length());
        Intrinsics.checkNotNullExpressionValue(substring2, "substring(...)");
        Path path2 = Path.Companion.get$default(companion, substring2, false, 1, (Object) null);
        q a7 = ci.c.a(path2, Okio.openZip(this.f9458b.f22012f, path), null, null, 28);
        String V = StringsKt.V('.', path2.name(), "");
        if (!StringsKt.H(V)) {
            String lowerCase = V.toLowerCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
            str2 = (String) m.f24427a.get(lowerCase);
            if (str2 == null) {
                str2 = MimeTypeMap.getSingleton().getMimeTypeFromExtension(lowerCase);
            }
        }
        return new l(a7, str2, d4.h.f8130c);
    }
}
