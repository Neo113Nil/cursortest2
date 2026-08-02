package n3;

import androidx.work.impl.WorkDatabase;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final WorkDatabase f20834a;

    public f(WorkDatabase workDatabase, int i5) {
        switch (i5) {
            case 1:
                this.f20834a = workDatabase;
                break;
            default:
                Intrinsics.checkNotNullParameter(workDatabase, "workDatabase");
                this.f20834a = workDatabase;
                break;
        }
    }
}
