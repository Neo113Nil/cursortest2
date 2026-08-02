package rf;

import java.io.File;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public abstract class i {

    /* renamed from: a, reason: collision with root package name */
    public final File f22506a;

    public i(File root) {
        Intrinsics.checkNotNullParameter(root, "root");
        this.f22506a = root;
    }

    public abstract File a();
}
