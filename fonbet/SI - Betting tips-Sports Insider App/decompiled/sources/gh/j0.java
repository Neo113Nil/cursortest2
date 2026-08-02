package gh;

import java.io.File;
import kotlin.jvm.internal.Intrinsics;
import okio.BufferedSink;
import okio.Okio;
import okio.Source;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes3.dex */
public final class j0 extends m0 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b0 f10230b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ File f10231c;

    public j0(b0 b0Var, File file) {
        this.f10230b = b0Var;
        this.f10231c = file;
    }

    @Override // gh.m0
    public final long a() {
        return this.f10231c.length();
    }

    @Override // gh.m0
    public final b0 b() {
        return this.f10230b;
    }

    @Override // gh.m0
    public final void d(BufferedSink sink) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        Source source = Okio.source(this.f10231c);
        try {
            sink.writeAll(source);
            com.google.android.play.core.appupdate.b.g(source, null);
        } finally {
        }
    }
}
