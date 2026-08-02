package c1;

import java.io.File;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public class l0 implements a {

    /* renamed from: a, reason: collision with root package name */
    public final File f3420a;

    /* renamed from: b, reason: collision with root package name */
    public final AtomicBoolean f3421b;

    public l0(File file) {
        Intrinsics.checkNotNullParameter(file, "file");
        g1.f serializer = g1.f.f9708a;
        Intrinsics.checkNotNullParameter(serializer, "serializer");
        this.f3420a = file;
        this.f3421b = new AtomicBoolean(false);
    }

    @Override // c1.a
    public final void close() {
        this.f3421b.set(true);
    }
}
