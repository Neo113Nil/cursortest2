package ec;

import android.app.Activity;
import android.os.Looper;
import android.util.Log;
import androidx.biometric.BiometricPrompt;
import androidx.fragment.app.AbstractActivityC2168s;
import cc.AbstractC2912d;
import cc.InterfaceC2910b;
import com.facebook.react.bridge.AssertionException;
import com.facebook.react.bridge.ReactApplicationContext;
import dc.C4051a;
import java.nio.charset.Charset;
import java.security.Key;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;

/* loaded from: classes3.dex */
public class e extends BiometricPrompt.a implements c {

    /* renamed from: a, reason: collision with root package name */
    public final ReactApplicationContext f45908a;

    /* renamed from: b, reason: collision with root package name */
    public BiometricPrompt.d f45909b;

    /* renamed from: c, reason: collision with root package name */
    public InterfaceC2910b.C0446b f45910c;

    /* renamed from: d, reason: collision with root package name */
    public InterfaceC2910b.c f45911d;

    /* renamed from: e, reason: collision with root package name */
    public Throwable f45912e;

    /* renamed from: f, reason: collision with root package name */
    public final AbstractC2912d f45913f;

    /* renamed from: g, reason: collision with root package name */
    public final Executor f45914g;

    /* renamed from: h, reason: collision with root package name */
    public C4200a f45915h;

    /* renamed from: i, reason: collision with root package name */
    public final ReentrantLock f45916i;

    /* renamed from: j, reason: collision with root package name */
    public final Condition f45917j;

    /* renamed from: k, reason: collision with root package name */
    public final String f45918k;

    public /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[b.values().length];
            try {
                iArr[b.f45904a.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[b.f45905b.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public e(ReactApplicationContext reactContext, InterfaceC2910b storage, BiometricPrompt.d promptInfo) {
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
        Intrinsics.checkNotNullParameter(storage, "storage");
        Intrinsics.checkNotNullParameter(promptInfo, "promptInfo");
        this.f45908a = reactContext;
        this.f45909b = promptInfo;
        this.f45913f = (AbstractC2912d) storage;
        ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor();
        Intrinsics.checkNotNullExpressionValue(newSingleThreadExecutor, "newSingleThreadExecutor(...)");
        this.f45914g = newSingleThreadExecutor;
        ReentrantLock reentrantLock = new ReentrantLock();
        this.f45916i = reentrantLock;
        this.f45917j = reentrantLock.newCondition();
        this.f45918k = e.class.getSimpleName();
    }

    public static final void q(e eVar) {
        eVar.p();
    }

    @Override // ec.c
    public void a(InterfaceC2910b.C0446b c0446b, Throwable th2) {
        ReentrantLock reentrantLock = this.f45916i;
        reentrantLock.lock();
        try {
            m(c0446b);
            o(th2);
            this.f45917j.signalAll();
            Unit unit = Unit.INSTANCE;
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // ec.c
    public InterfaceC2910b.C0446b b() {
        return this.f45910c;
    }

    @Override // ec.c
    public void c(C4200a context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f45915h = context;
        if (com.oblador.keychain.b.e(this.f45908a)) {
            p();
            return;
        }
        C4051a c4051a = new C4051a("Could not start biometric Authentication. No permissions granted.");
        int i10 = a.$EnumSwitchMapping$0[context.b().ordinal()];
        if (i10 == 1) {
            e(null, c4051a);
        } else {
            if (i10 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            a(null, c4051a);
        }
    }

    @Override // ec.c
    public InterfaceC2910b.c d() {
        return this.f45911d;
    }

    @Override // ec.c
    public void e(InterfaceC2910b.c cVar, Throwable th2) {
        ReentrantLock reentrantLock = this.f45916i;
        reentrantLock.lock();
        try {
            n(cVar);
            o(th2);
            this.f45917j.signalAll();
            Unit unit = Unit.INSTANCE;
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // androidx.biometric.BiometricPrompt.a
    public void f(int i10, CharSequence errString) {
        Intrinsics.checkNotNullParameter(errString, "errString");
        C4051a c4051a = new C4051a("code: " + i10 + ", msg: " + ((Object) errString));
        C4200a c4200a = this.f45915h;
        b b10 = c4200a != null ? c4200a.b() : null;
        int i11 = b10 == null ? -1 : a.$EnumSwitchMapping$0[b10.ordinal()];
        if (i11 == -1) {
            Log.e(this.f45918k, "No operation context available");
        } else if (i11 == 1) {
            e(null, c4051a);
        } else {
            if (i11 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            a(null, c4051a);
        }
    }

    @Override // ec.c
    public Throwable getError() {
        return this.f45912e;
    }

    @Override // androidx.biometric.BiometricPrompt.a
    public void h(BiometricPrompt.b result) {
        Intrinsics.checkNotNullParameter(result, "result");
        try {
            C4200a c4200a = this.f45915h;
            if (c4200a == null) {
                throw new NullPointerException("Crypto context is not assigned yet.");
            }
            b b10 = c4200a != null ? c4200a.b() : null;
            int i10 = b10 == null ? -1 : a.$EnumSwitchMapping$0[b10.ordinal()];
            if (i10 == -1) {
                Log.e(this.f45918k, "No operation context available");
                return;
            }
            if (i10 != 1) {
                if (i10 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                AbstractC2912d abstractC2912d = this.f45913f;
                C4200a c4200a2 = this.f45915h;
                Intrinsics.checkNotNull(c4200a2);
                Key a10 = c4200a2.a();
                C4200a c4200a3 = this.f45915h;
                Intrinsics.checkNotNull(c4200a3);
                String k10 = abstractC2912d.k(a10, c4200a3.d());
                AbstractC2912d abstractC2912d2 = this.f45913f;
                C4200a c4200a4 = this.f45915h;
                Intrinsics.checkNotNull(c4200a4);
                Key a11 = c4200a4.a();
                C4200a c4200a5 = this.f45915h;
                Intrinsics.checkNotNull(c4200a5);
                a(new InterfaceC2910b.C0446b(k10, abstractC2912d2.k(a11, c4200a5.c()), null, 4, null), null);
                return;
            }
            AbstractC2912d abstractC2912d3 = this.f45913f;
            C4200a c4200a6 = this.f45915h;
            Intrinsics.checkNotNull(c4200a6);
            Key a12 = c4200a6.a();
            C4200a c4200a7 = this.f45915h;
            Intrinsics.checkNotNull(c4200a7);
            byte[] d10 = c4200a7.d();
            Charset charset = Charsets.UTF_8;
            byte[] m10 = abstractC2912d3.m(a12, new String(d10, charset));
            AbstractC2912d abstractC2912d4 = this.f45913f;
            C4200a c4200a8 = this.f45915h;
            Intrinsics.checkNotNull(c4200a8);
            Key a13 = c4200a8.a();
            C4200a c4200a9 = this.f45915h;
            Intrinsics.checkNotNull(c4200a9);
            e(new InterfaceC2910b.c(m10, abstractC2912d4.m(a13, new String(c4200a9.c(), charset)), this.f45913f), null);
        } catch (Throwable th2) {
            C4200a c4200a10 = this.f45915h;
            b b11 = c4200a10 != null ? c4200a10.b() : null;
            int i11 = b11 == null ? -1 : a.$EnumSwitchMapping$0[b11.ordinal()];
            if (i11 == -1) {
                Log.e(this.f45918k, "No operation context available");
            } else if (i11 == 1) {
                e(null, th2);
            } else {
                if (i11 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                a(null, th2);
            }
        }
    }

    public final BiometricPrompt j(AbstractActivityC2168s activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        BiometricPrompt biometricPrompt = new BiometricPrompt(activity, this.f45914g, this);
        biometricPrompt.a(this.f45909b);
        return biometricPrompt;
    }

    public final AbstractActivityC2168s k() {
        Activity currentActivity = this.f45908a.getCurrentActivity();
        AbstractActivityC2168s abstractActivityC2168s = currentActivity instanceof AbstractActivityC2168s ? (AbstractActivityC2168s) currentActivity : null;
        if (abstractActivityC2168s != null) {
            return abstractActivityC2168s;
        }
        throw new NullPointerException("Not assigned current activity");
    }

    public final String l() {
        return this.f45918k;
    }

    public void m(InterfaceC2910b.C0446b c0446b) {
        this.f45910c = c0446b;
    }

    public void n(InterfaceC2910b.c cVar) {
        this.f45911d = cVar;
    }

    public void o(Throwable th2) {
        this.f45912e = th2;
    }

    public void p() {
        AbstractActivityC2168s k10 = k();
        if (Intrinsics.areEqual(Thread.currentThread(), Looper.getMainLooper().getThread())) {
            j(k10);
        } else {
            k10.runOnUiThread(new Runnable() { // from class: ec.d
                @Override // java.lang.Runnable
                public final void run() {
                    e.q(e.this);
                }
            });
            r();
        }
    }

    public void r() {
        if (Intrinsics.areEqual(Thread.currentThread(), Looper.getMainLooper().getThread())) {
            throw new AssertionException("method should not be executed from MAIN thread");
        }
        Log.i(this.f45918k, "blocking thread. waiting for done UI operation.");
        try {
            ReentrantLock reentrantLock = this.f45916i;
            reentrantLock.lock();
            try {
                this.f45917j.await();
                Unit unit = Unit.INSTANCE;
                reentrantLock.unlock();
            } catch (Throwable th2) {
                reentrantLock.unlock();
                throw th2;
            }
        } catch (InterruptedException unused) {
        }
        Log.i(this.f45918k, "unblocking thread.");
    }
}
