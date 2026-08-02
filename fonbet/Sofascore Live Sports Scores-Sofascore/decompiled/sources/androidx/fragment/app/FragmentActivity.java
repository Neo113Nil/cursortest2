package androidx.fragment.app;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.MenuItem;
import android.view.View;
import androidx.activity.ComponentActivity;
import defpackage.d6b;
import defpackage.e6b;
import defpackage.egb;
import defpackage.fp8;
import defpackage.hpo;
import defpackage.qb3;
import defpackage.rb3;
import defpackage.vn8;
import defpackage.wn8;
import defpackage.y6b;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public class FragmentActivity extends ComponentActivity {
    public static final /* synthetic */ int g = 0;
    public boolean d;
    public boolean e;
    public final hpo b = new hpo(new wn8(this));
    public final y6b c = new y6b(this, true);
    public boolean f = true;

    public FragmentActivity() {
        getSavedStateRegistry().c("android:support:lifecycle", new qb3(this, 2));
        addOnConfigurationChangedListener(new vn8(this, 0));
        int i = 1;
        addOnNewIntentListener(new vn8(this, i));
        addOnContextAvailableListener(new rb3(this, i));
    }

    public static boolean l(s sVar) {
        e6b e6bVar = e6b.c;
        boolean z = false;
        for (Fragment fragment : sVar.c.f()) {
            if (fragment != null) {
                if (fragment.getHost() != null) {
                    z |= l(fragment.getChildFragmentManager());
                }
                w wVar = fragment.mViewLifecycleOwner;
                if (wVar != null) {
                    wVar.b();
                    if (wVar.e.i.compareTo(e6b.d) >= 0) {
                        fragment.mViewLifecycleOwner.e.i(e6bVar);
                        z = true;
                    }
                }
                if (fragment.mLifecycleRegistry.i.compareTo(e6b.d) >= 0) {
                    fragment.mLifecycleRegistry.i(e6bVar);
                    z = true;
                }
            }
        }
        return z;
    }

    @Override // android.app.Activity
    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        if (shouldDumpInternalState(strArr)) {
            printWriter.print(str);
            printWriter.print("Local FragmentActivity ");
            printWriter.print(Integer.toHexString(System.identityHashCode(this)));
            printWriter.println(" State:");
            String str2 = str + "  ";
            printWriter.print(str2);
            printWriter.print("mCreated=");
            printWriter.print(this.d);
            printWriter.print(" mResumed=");
            printWriter.print(this.e);
            printWriter.print(" mStopped=");
            printWriter.print(this.f);
            if (getApplication() != null) {
                egb.a(this).b(str2, printWriter);
            }
            ((wn8) this.b.a).d.v(str, fileDescriptor, printWriter, strArr);
        }
    }

    public final fp8 k() {
        return ((wn8) this.b.a).d;
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        this.b.A();
        super.onActivityResult(i, i2, intent);
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.c.g(d6b.ON_CREATE);
        fp8 fp8Var = ((wn8) this.b.a).d;
        fp8Var.I = false;
        fp8Var.J = false;
        fp8Var.P.g = false;
        fp8Var.u(1);
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        View onCreateView = ((wn8) this.b.a).d.f.onCreateView(null, str, context, attributeSet);
        return onCreateView == null ? super.onCreateView(str, context, attributeSet) : onCreateView;
    }

    @Override // android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        ((wn8) this.b.a).d.l();
        this.c.g(d6b.ON_DESTROY);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i, MenuItem menuItem) {
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        if (i == 6) {
            return ((wn8) this.b.a).d.j(menuItem);
        }
        return false;
    }

    @Override // android.app.Activity
    public void onPause() {
        super.onPause();
        this.e = false;
        ((wn8) this.b.a).d.u(5);
        this.c.g(d6b.ON_PAUSE);
    }

    @Override // android.app.Activity
    public void onPostResume() {
        super.onPostResume();
        this.c.g(d6b.ON_RESUME);
        fp8 fp8Var = ((wn8) this.b.a).d;
        fp8Var.I = false;
        fp8Var.J = false;
        fp8Var.P.g = false;
        fp8Var.u(7);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        this.b.A();
        super.onRequestPermissionsResult(i, strArr, iArr);
    }

    @Override // android.app.Activity
    public void onResume() {
        hpo hpoVar = this.b;
        hpoVar.A();
        super.onResume();
        this.e = true;
        ((wn8) hpoVar.a).d.z(true);
    }

    @Override // android.app.Activity
    public void onStart() {
        hpo hpoVar = this.b;
        hpoVar.A();
        wn8 wn8Var = (wn8) hpoVar.a;
        super.onStart();
        this.f = false;
        if (!this.d) {
            this.d = true;
            fp8 fp8Var = wn8Var.d;
            fp8Var.I = false;
            fp8Var.J = false;
            fp8Var.P.g = false;
            fp8Var.u(4);
        }
        wn8Var.d.z(true);
        this.c.g(d6b.ON_START);
        fp8 fp8Var2 = wn8Var.d;
        fp8Var2.I = false;
        fp8Var2.J = false;
        fp8Var2.P.g = false;
        fp8Var2.u(5);
    }

    @Override // android.app.Activity
    public final void onStateNotSaved() {
        this.b.A();
    }

    @Override // android.app.Activity
    public void onStop() {
        fp8 k;
        super.onStop();
        this.f = true;
        do {
            k = k();
            e6b e6bVar = e6b.a;
        } while (l(k));
        fp8 fp8Var = ((wn8) this.b.a).d;
        fp8Var.J = true;
        fp8Var.P.g = true;
        fp8Var.u(4);
        this.c.g(d6b.ON_STOP);
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory2
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        View onCreateView = ((wn8) this.b.a).d.f.onCreateView(view, str, context, attributeSet);
        return onCreateView == null ? super.onCreateView(view, str, context, attributeSet) : onCreateView;
    }
}
