package androidx.fragment.app;

import android.view.View;
import android.view.ViewGroup;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final /* synthetic */ class c implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1877a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1878b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f1879c;

    public /* synthetic */ c(int i5, Object obj, Object obj2) {
        this.f1877a = i5;
        this.f1878b = obj;
        this.f1879c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f1877a) {
            case 0:
                s this$0 = (s) this.f1878b;
                f2 operation = (f2) this.f1879c;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNullParameter(operation, "$operation");
                this$0.a(operation);
                break;
            default:
                p this$02 = (p) this.f1878b;
                ViewGroup container = (ViewGroup) this.f1879c;
                Intrinsics.checkNotNullParameter(this$02, "this$0");
                Intrinsics.checkNotNullParameter(container, "$container");
                Iterator it = this$02.f2020c.iterator();
                while (it.hasNext()) {
                    f2 f2Var = ((q) it.next()).f1994a;
                    View view = f2Var.f1905c.getView();
                    if (view != null) {
                        f2Var.f1903a.a(view, container);
                    }
                }
                break;
        }
    }
}
