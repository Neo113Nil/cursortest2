package f4;

import android.webkit.MimeTypeMap;
import c4.b0;
import c4.p;
import d4.q;
import java.util.Locale;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import okio.Path;
import q4.n;
import v4.m;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class i implements h {

    /* renamed from: a, reason: collision with root package name */
    public final b0 f9452a;

    /* renamed from: b, reason: collision with root package name */
    public final n f9453b;

    public i(b0 b0Var, n nVar) {
        this.f9452a = b0Var;
        this.f9453b = nVar;
    }

    @Override // f4.h
    public final Object a(Continuation continuation) {
        Path.Companion companion = Path.INSTANCE;
        String g10 = p.g(this.f9452a);
        if (g10 == null) {
            throw new IllegalStateException("filePath == null");
        }
        String str = null;
        Path path = Path.Companion.get$default(companion, g10, false, 1, (Object) null);
        q a7 = ci.c.a(path, this.f9453b.f22012f, null, null, 28);
        String V = StringsKt.V('.', path.name(), "");
        if (!StringsKt.H(V)) {
            String lowerCase = V.toLowerCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
            str = (String) m.f24427a.get(lowerCase);
            if (str == null) {
                str = MimeTypeMap.getSingleton().getMimeTypeFromExtension(lowerCase);
            }
        }
        return new l(a7, str, d4.h.f8130c);
    }
}
