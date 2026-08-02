package gh;

import com.google.android.gms.internal.measurement.d5;
import com.google.android.gms.tasks.Task;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes3.dex */
public final class p implements w7.a {

    /* renamed from: a, reason: collision with root package name */
    public final List f10288a;

    public p(int i5, List callsToExecute) {
        switch (i5) {
            case 1:
                this.f10288a = callsToExecute;
                break;
            default:
                Intrinsics.checkNotNullParameter(callsToExecute, "callsToExecute");
                this.f10288a = callsToExecute;
                break;
        }
    }

    @Override // w7.a
    public /* bridge */ /* synthetic */ Object f(Task task) {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.f10288a);
        return d5.q(arrayList);
    }
}
