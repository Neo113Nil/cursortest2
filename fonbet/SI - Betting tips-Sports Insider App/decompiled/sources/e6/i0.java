package e6;

import android.app.Activity;
import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import androidx.transition.n0;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class i0 extends Fragment implements h {

    /* renamed from: b, reason: collision with root package name */
    public static final WeakHashMap f8716b = new WeakHashMap();

    /* renamed from: a, reason: collision with root package name */
    public final n0 f8717a = new n0();

    @Override // android.app.Fragment
    public final void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        Iterator it = ((Map) this.f8717a.f2734c).values().iterator();
        while (it.hasNext()) {
            ((n) it.next()).getClass();
        }
    }

    @Override // e6.h
    public final n g() {
        return (n) n.class.cast(((Map) this.f8717a.f2734c).get("ConnectionlessLifecycleHelper"));
    }

    @Override // e6.h
    public final Activity j() {
        return getActivity();
    }

    @Override // android.app.Fragment
    public final void onActivityResult(int i5, int i10, Intent intent) {
        super.onActivityResult(i5, i10, intent);
        this.f8717a.k(i5, i10, intent);
    }

    @Override // android.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f8717a.j(bundle);
    }

    @Override // android.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        n0 n0Var = this.f8717a;
        n0Var.f2733b = 5;
        Iterator it = ((Map) n0Var.f2734c).values().iterator();
        while (it.hasNext()) {
            ((n) it.next()).getClass();
        }
    }

    @Override // android.app.Fragment
    public final void onResume() {
        super.onResume();
        n0 n0Var = this.f8717a;
        n0Var.f2733b = 3;
        Iterator it = ((Map) n0Var.f2734c).values().iterator();
        while (it.hasNext()) {
            ((n) it.next()).e();
        }
    }

    @Override // android.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        this.f8717a.l(bundle);
    }

    @Override // android.app.Fragment
    public final void onStart() {
        super.onStart();
        n0 n0Var = this.f8717a;
        n0Var.f2733b = 2;
        for (n nVar : ((Map) n0Var.f2734c).values()) {
            nVar.f8728b = true;
            nVar.e();
        }
    }

    @Override // android.app.Fragment
    public final void onStop() {
        super.onStop();
        n0 n0Var = this.f8717a;
        n0Var.f2733b = 4;
        Iterator it = ((Map) n0Var.f2734c).values().iterator();
        while (it.hasNext()) {
            ((n) it.next()).c();
        }
    }

    @Override // e6.h
    public final void u(n nVar) {
        this.f8717a.i(nVar);
    }
}
