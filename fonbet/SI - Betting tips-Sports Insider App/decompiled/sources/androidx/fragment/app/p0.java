package androidx.fragment.app;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.MenuItem;
import android.view.View;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public abstract class p0 extends e.j implements c0.a {

    /* renamed from: w, reason: collision with root package name */
    public boolean f2036w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f2037x;

    /* renamed from: u, reason: collision with root package name */
    public final f0 f2034u = new f0(2, new o0(this));

    /* renamed from: v, reason: collision with root package name */
    public final androidx.lifecycle.g0 f2035v = new androidx.lifecycle.g0(this);

    /* renamed from: y, reason: collision with root package name */
    public boolean f2038y = true;

    public p0() {
        this.f8419d.f21928b.c("android:support:lifecycle", new l0(0, this));
        final int i5 = 0;
        c(new p0.a(this) { // from class: androidx.fragment.app.m0

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ p0 f2001b;

            {
                this.f2001b = this;
            }

            @Override // p0.a
            public final void accept(Object obj) {
                switch (i5) {
                    case 0:
                        this.f2001b.f2034u.a();
                        break;
                    default:
                        this.f2001b.f2034u.a();
                        break;
                }
            }
        });
        final int i10 = 1;
        p0.a listener = new p0.a(this) { // from class: androidx.fragment.app.m0

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ p0 f2001b;

            {
                this.f2001b = this;
            }

            @Override // p0.a
            public final void accept(Object obj) {
                switch (i10) {
                    case 0:
                        this.f2001b.f2034u.a();
                        break;
                    default:
                        this.f2001b.f2034u.a();
                        break;
                }
            }
        };
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f8426l.add(listener);
        o(new f.a() { // from class: androidx.fragment.app.n0
            @Override // f.a
            public final void a(e.j jVar) {
                o0 o0Var = (o0) p0.this.f2034u.f1902b;
                o0Var.f2089d.b(o0Var, o0Var, null);
            }
        });
    }

    public static boolean s(j1 j1Var) {
        androidx.lifecycle.x xVar = androidx.lifecycle.x.f2255c;
        boolean z5 = false;
        for (Fragment fragment : j1Var.f1965c.f()) {
            if (fragment != null) {
                if (fragment.getHost() != null) {
                    z5 |= s(fragment.getChildFragmentManager());
                }
                b2 b2Var = fragment.mViewLifecycleOwner;
                if (b2Var != null) {
                    b2Var.b();
                    if (b2Var.f1875e.f2169d.a(androidx.lifecycle.x.f2256d)) {
                        fragment.mViewLifecycleOwner.f1875e.g(xVar);
                        z5 = true;
                    }
                }
                if (fragment.mLifecycleRegistry.f2169d.a(androidx.lifecycle.x.f2256d)) {
                    fragment.mLifecycleRegistry.g(xVar);
                    z5 = true;
                }
            }
        }
        return z5;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x003a, code lost:
    
        if (r0.equals("--list-dumpables") == false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x004a, code lost:
    
        if (android.os.Build.VERSION.SDK_INT < 33) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0043, code lost:
    
        if (r0.equals("--dump-dumpable") == false) goto L37;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        if (strArr != null && strArr.length != 0) {
            String str2 = strArr[0];
            switch (str2.hashCode()) {
                case -645125871:
                    if (str2.equals("--translation") && Build.VERSION.SDK_INT >= 31) {
                    }
                    break;
                case 100470631:
                    break;
                case 472614934:
                    break;
                case 1159329357:
                    if (str2.equals("--contentcapture") && Build.VERSION.SDK_INT >= 29) {
                    }
                    break;
                case 1455016274:
                    if (str2.equals("--autofill") && Build.VERSION.SDK_INT >= 26) {
                    }
                    break;
            }
            return;
        }
        printWriter.print(str);
        printWriter.print("Local FragmentActivity ");
        printWriter.print(Integer.toHexString(System.identityHashCode(this)));
        printWriter.println(" State:");
        String str3 = str + "  ";
        printWriter.print(str3);
        printWriter.print("mCreated=");
        printWriter.print(this.f2036w);
        printWriter.print(" mResumed=");
        printWriter.print(this.f2037x);
        printWriter.print(" mStopped=");
        printWriter.print(this.f2038y);
        if (getApplication() != null) {
            v1.a.a(this).b(str3, printWriter);
        }
        ((o0) this.f2034u.f1902b).f2089d.v(str, fileDescriptor, printWriter, strArr);
    }

    @Override // e.j, android.app.Activity
    public void onActivityResult(int i5, int i10, Intent intent) {
        this.f2034u.a();
        super.onActivityResult(i5, i10, intent);
    }

    @Override // e.j, c0.f, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f2035v.e(androidx.lifecycle.w.ON_CREATE);
        k1 k1Var = ((o0) this.f2034u.f1902b).f2089d;
        k1Var.H = false;
        k1Var.I = false;
        k1Var.O.f2008g = false;
        k1Var.u(1);
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory2
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        View onCreateView = ((o0) this.f2034u.f1902b).f2089d.f1968f.onCreateView(view, str, context, attributeSet);
        return onCreateView == null ? super.onCreateView(view, str, context, attributeSet) : onCreateView;
    }

    @Override // android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        ((o0) this.f2034u.f1902b).f2089d.l();
        this.f2035v.e(androidx.lifecycle.w.ON_DESTROY);
    }

    @Override // e.j, android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i5, MenuItem menuItem) {
        if (super.onMenuItemSelected(i5, menuItem)) {
            return true;
        }
        if (i5 == 6) {
            return ((o0) this.f2034u.f1902b).f2089d.j(menuItem);
        }
        return false;
    }

    @Override // android.app.Activity
    public final void onPause() {
        super.onPause();
        this.f2037x = false;
        ((o0) this.f2034u.f1902b).f2089d.u(5);
        this.f2035v.e(androidx.lifecycle.w.ON_PAUSE);
    }

    @Override // android.app.Activity
    public void onPostResume() {
        super.onPostResume();
        this.f2035v.e(androidx.lifecycle.w.ON_RESUME);
        k1 k1Var = ((o0) this.f2034u.f1902b).f2089d;
        k1Var.H = false;
        k1Var.I = false;
        k1Var.O.f2008g = false;
        k1Var.u(7);
    }

    @Override // e.j, android.app.Activity
    public final void onRequestPermissionsResult(int i5, String[] strArr, int[] iArr) {
        this.f2034u.a();
        super.onRequestPermissionsResult(i5, strArr, iArr);
    }

    @Override // android.app.Activity
    public void onResume() {
        f0 f0Var = this.f2034u;
        f0Var.a();
        super.onResume();
        this.f2037x = true;
        ((o0) f0Var.f1902b).f2089d.z(true);
    }

    @Override // android.app.Activity
    public void onStart() {
        f0 f0Var = this.f2034u;
        f0Var.a();
        o0 o0Var = (o0) f0Var.f1902b;
        super.onStart();
        this.f2038y = false;
        if (!this.f2036w) {
            this.f2036w = true;
            k1 k1Var = o0Var.f2089d;
            k1Var.H = false;
            k1Var.I = false;
            k1Var.O.f2008g = false;
            k1Var.u(4);
        }
        o0Var.f2089d.z(true);
        this.f2035v.e(androidx.lifecycle.w.ON_START);
        k1 k1Var2 = o0Var.f2089d;
        k1Var2.H = false;
        k1Var2.I = false;
        k1Var2.O.f2008g = false;
        k1Var2.u(5);
    }

    @Override // android.app.Activity
    public final void onStateNotSaved() {
        this.f2034u.a();
    }

    @Override // android.app.Activity
    public void onStop() {
        k1 r5;
        super.onStop();
        this.f2038y = true;
        do {
            r5 = r();
            androidx.lifecycle.x xVar = androidx.lifecycle.x.f2253a;
        } while (s(r5));
        k1 k1Var = ((o0) this.f2034u.f1902b).f2089d;
        k1Var.I = true;
        k1Var.O.f2008g = true;
        k1Var.u(4);
        this.f2035v.e(androidx.lifecycle.w.ON_STOP);
    }

    public final k1 r() {
        return ((o0) this.f2034u.f1902b).f2089d;
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        View onCreateView = ((o0) this.f2034u.f1902b).f2089d.f1968f.onCreateView(null, str, context, attributeSet);
        return onCreateView == null ? super.onCreateView(str, context, attributeSet) : onCreateView;
    }
}
