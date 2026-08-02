package androidx.biometric;

import android.content.DialogInterface;
import android.os.Handler;
import android.os.Looper;
import androidx.biometric.BiometricPrompt;
import androidx.biometric.a;
import androidx.lifecycle.B;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.Q;
import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public class BiometricViewModel extends Q {

    /* renamed from: B, reason: collision with root package name */
    public boolean f17427B;

    /* renamed from: C, reason: collision with root package name */
    public boolean f17428C;

    /* renamed from: D, reason: collision with root package name */
    public boolean f17429D;

    /* renamed from: E, reason: collision with root package name */
    public boolean f17430E;

    /* renamed from: F, reason: collision with root package name */
    public boolean f17431F;

    /* renamed from: G, reason: collision with root package name */
    public B f17432G;

    /* renamed from: H, reason: collision with root package name */
    public B f17433H;

    /* renamed from: I, reason: collision with root package name */
    public B f17434I;

    /* renamed from: J, reason: collision with root package name */
    public B f17435J;

    /* renamed from: K, reason: collision with root package name */
    public B f17436K;

    /* renamed from: M, reason: collision with root package name */
    public B f17438M;

    /* renamed from: O, reason: collision with root package name */
    public B f17440O;

    /* renamed from: P, reason: collision with root package name */
    public B f17441P;

    /* renamed from: s, reason: collision with root package name */
    public Executor f17442s;

    /* renamed from: t, reason: collision with root package name */
    public BiometricPrompt.a f17443t;

    /* renamed from: u, reason: collision with root package name */
    public BiometricPrompt.d f17444u;

    /* renamed from: v, reason: collision with root package name */
    public BiometricPrompt.c f17445v;

    /* renamed from: w, reason: collision with root package name */
    public androidx.biometric.a f17446w;

    /* renamed from: x, reason: collision with root package name */
    public f f17447x;

    /* renamed from: y, reason: collision with root package name */
    public DialogInterface.OnClickListener f17448y;

    /* renamed from: z, reason: collision with root package name */
    public CharSequence f17449z;

    /* renamed from: A, reason: collision with root package name */
    public int f17426A = 0;

    /* renamed from: L, reason: collision with root package name */
    public boolean f17437L = true;

    /* renamed from: N, reason: collision with root package name */
    public int f17439N = 0;

    public class a extends BiometricPrompt.a {
        public a() {
        }
    }

    public static final class b extends a.d {

        /* renamed from: a, reason: collision with root package name */
        public final WeakReference f17451a;

        public b(BiometricViewModel biometricViewModel) {
            this.f17451a = new WeakReference(biometricViewModel);
        }

        @Override // androidx.biometric.a.d
        public void a(int i10, CharSequence charSequence) {
            if (this.f17451a.get() == null || ((BiometricViewModel) this.f17451a.get()).z() || !((BiometricViewModel) this.f17451a.get()).x()) {
                return;
            }
            ((BiometricViewModel) this.f17451a.get()).H(new androidx.biometric.c(i10, charSequence));
        }

        @Override // androidx.biometric.a.d
        public void b() {
            if (this.f17451a.get() == null || !((BiometricViewModel) this.f17451a.get()).x()) {
                return;
            }
            ((BiometricViewModel) this.f17451a.get()).I(true);
        }

        @Override // androidx.biometric.a.d
        public void c(CharSequence charSequence) {
            if (this.f17451a.get() != null) {
                ((BiometricViewModel) this.f17451a.get()).J(charSequence);
            }
        }

        @Override // androidx.biometric.a.d
        public void d(BiometricPrompt.b bVar) {
            if (this.f17451a.get() == null || !((BiometricViewModel) this.f17451a.get()).x()) {
                return;
            }
            if (bVar.a() == -1) {
                bVar = new BiometricPrompt.b(bVar.b(), ((BiometricViewModel) this.f17451a.get()).r());
            }
            ((BiometricViewModel) this.f17451a.get()).K(bVar);
        }
    }

    public static class c implements Executor {

        /* renamed from: a, reason: collision with root package name */
        public final Handler f17452a = new Handler(Looper.getMainLooper());

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            this.f17452a.post(runnable);
        }
    }

    public static class d implements DialogInterface.OnClickListener {

        /* renamed from: a, reason: collision with root package name */
        public final WeakReference f17453a;

        public d(BiometricViewModel biometricViewModel) {
            this.f17453a = new WeakReference(biometricViewModel);
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            if (this.f17453a.get() != null) {
                ((BiometricViewModel) this.f17453a.get()).Y(true);
            }
        }
    }

    public static void c0(B b10, Object obj) {
        if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
            b10.setValue(obj);
        } else {
            b10.postValue(obj);
        }
    }

    public boolean A() {
        return this.f17430E;
    }

    public LiveData B() {
        if (this.f17438M == null) {
            this.f17438M = new B();
        }
        return this.f17438M;
    }

    public boolean C() {
        return this.f17437L;
    }

    public boolean D() {
        return this.f17431F;
    }

    public LiveData E() {
        if (this.f17436K == null) {
            this.f17436K = new B();
        }
        return this.f17436K;
    }

    public boolean F() {
        return this.f17427B;
    }

    public void G() {
        this.f17443t = null;
    }

    public void H(androidx.biometric.c cVar) {
        if (this.f17433H == null) {
            this.f17433H = new B();
        }
        c0(this.f17433H, cVar);
    }

    public void I(boolean z10) {
        if (this.f17435J == null) {
            this.f17435J = new B();
        }
        c0(this.f17435J, Boolean.valueOf(z10));
    }

    public void J(CharSequence charSequence) {
        if (this.f17434I == null) {
            this.f17434I = new B();
        }
        c0(this.f17434I, charSequence);
    }

    public void K(BiometricPrompt.b bVar) {
        if (this.f17432G == null) {
            this.f17432G = new B();
        }
        c0(this.f17432G, bVar);
    }

    public void L(boolean z10) {
        this.f17428C = z10;
    }

    public void M(int i10) {
        this.f17426A = i10;
    }

    public void N(BiometricPrompt.a aVar) {
        this.f17443t = aVar;
    }

    public void O(Executor executor) {
        this.f17442s = executor;
    }

    public void P(boolean z10) {
        this.f17429D = z10;
    }

    public void Q(BiometricPrompt.c cVar) {
        this.f17445v = cVar;
    }

    public void R(boolean z10) {
        this.f17430E = z10;
    }

    public void S(boolean z10) {
        if (this.f17438M == null) {
            this.f17438M = new B();
        }
        c0(this.f17438M, Boolean.valueOf(z10));
    }

    public void T(boolean z10) {
        this.f17437L = z10;
    }

    public void U(CharSequence charSequence) {
        if (this.f17441P == null) {
            this.f17441P = new B();
        }
        c0(this.f17441P, charSequence);
    }

    public void V(int i10) {
        this.f17439N = i10;
    }

    public void W(int i10) {
        if (this.f17440O == null) {
            this.f17440O = new B();
        }
        c0(this.f17440O, Integer.valueOf(i10));
    }

    public void X(boolean z10) {
        this.f17431F = z10;
    }

    public void Y(boolean z10) {
        if (this.f17436K == null) {
            this.f17436K = new B();
        }
        c0(this.f17436K, Boolean.valueOf(z10));
    }

    public void Z(CharSequence charSequence) {
        this.f17449z = charSequence;
    }

    public void a0(BiometricPrompt.d dVar) {
        this.f17444u = dVar;
    }

    public void b0(boolean z10) {
        this.f17427B = z10;
    }

    public int d() {
        BiometricPrompt.d dVar = this.f17444u;
        if (dVar != null) {
            return androidx.biometric.b.b(dVar, this.f17445v);
        }
        return 0;
    }

    public androidx.biometric.a e() {
        if (this.f17446w == null) {
            this.f17446w = new androidx.biometric.a(new b(this));
        }
        return this.f17446w;
    }

    public B f() {
        if (this.f17433H == null) {
            this.f17433H = new B();
        }
        return this.f17433H;
    }

    public LiveData g() {
        if (this.f17434I == null) {
            this.f17434I = new B();
        }
        return this.f17434I;
    }

    public LiveData h() {
        if (this.f17432G == null) {
            this.f17432G = new B();
        }
        return this.f17432G;
    }

    public int i() {
        return this.f17426A;
    }

    public f j() {
        if (this.f17447x == null) {
            this.f17447x = new f();
        }
        return this.f17447x;
    }

    public BiometricPrompt.a k() {
        if (this.f17443t == null) {
            this.f17443t = new a();
        }
        return this.f17443t;
    }

    public Executor l() {
        Executor executor = this.f17442s;
        return executor != null ? executor : new c();
    }

    public BiometricPrompt.c m() {
        return this.f17445v;
    }

    public CharSequence n() {
        BiometricPrompt.d dVar = this.f17444u;
        if (dVar != null) {
            return dVar.b();
        }
        return null;
    }

    public LiveData o() {
        if (this.f17441P == null) {
            this.f17441P = new B();
        }
        return this.f17441P;
    }

    public int p() {
        return this.f17439N;
    }

    public LiveData q() {
        if (this.f17440O == null) {
            this.f17440O = new B();
        }
        return this.f17440O;
    }

    public int r() {
        int d10 = d();
        return (!androidx.biometric.b.d(d10) || androidx.biometric.b.c(d10)) ? -1 : 2;
    }

    public DialogInterface.OnClickListener s() {
        if (this.f17448y == null) {
            this.f17448y = new d(this);
        }
        return this.f17448y;
    }

    public CharSequence t() {
        CharSequence charSequence = this.f17449z;
        if (charSequence != null) {
            return charSequence;
        }
        BiometricPrompt.d dVar = this.f17444u;
        if (dVar != null) {
            return dVar.c();
        }
        return null;
    }

    public CharSequence u() {
        BiometricPrompt.d dVar = this.f17444u;
        if (dVar != null) {
            return dVar.d();
        }
        return null;
    }

    public CharSequence v() {
        BiometricPrompt.d dVar = this.f17444u;
        if (dVar != null) {
            return dVar.e();
        }
        return null;
    }

    public LiveData w() {
        if (this.f17435J == null) {
            this.f17435J = new B();
        }
        return this.f17435J;
    }

    public boolean x() {
        return this.f17428C;
    }

    public boolean y() {
        BiometricPrompt.d dVar = this.f17444u;
        return dVar == null || dVar.f();
    }

    public boolean z() {
        return this.f17429D;
    }
}
