package androidx.fragment.app;

import android.util.Log;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final /* synthetic */ class m implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1997a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f2 f1998b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p f1999c;

    public /* synthetic */ m(f2 f2Var, p pVar, int i5) {
        this.f1997a = i5;
        this.f1998b = f2Var;
        this.f1999c = pVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f1997a) {
            case 0:
                f2 operation = this.f1998b;
                Intrinsics.checkNotNullParameter(operation, "$operation");
                p this$0 = this.f1999c;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                if (j1.L(2)) {
                    Log.v("FragmentManager", "Transition for operation " + operation + " has completed");
                }
                operation.c(this$0);
                break;
            default:
                f2 operation2 = this.f1998b;
                Intrinsics.checkNotNullParameter(operation2, "$operation");
                p this$02 = this.f1999c;
                Intrinsics.checkNotNullParameter(this$02, "this$0");
                if (j1.L(2)) {
                    Log.v("FragmentManager", "Transition for operation " + operation2 + " has completed");
                }
                operation2.c(this$02);
                break;
        }
    }
}
