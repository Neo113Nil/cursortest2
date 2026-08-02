package e4;

import kotlin.coroutines.CoroutineContext;
import okio.FileSystem;
import okio.Path;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class h implements a {

    /* renamed from: a, reason: collision with root package name */
    public final FileSystem f8612a;

    /* renamed from: b, reason: collision with root package name */
    public final e f8613b;

    public h(long j, CoroutineContext coroutineContext, FileSystem fileSystem, Path path) {
        this.f8612a = fileSystem;
        this.f8613b = new e(j, coroutineContext, fileSystem, path);
    }
}
