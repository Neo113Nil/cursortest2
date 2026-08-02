package defpackage;

import android.media.MediaCodec;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.util.Pair;
import android.util.SparseArray;
import android.widget.TextView;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import androidx.preference.PreferenceFragmentCompat;
import androidx.preference.PreferenceScreen;
import com.facebook.internal.e0;
import com.sofascore.model.mvvm.model.Event;
import com.sofascore.model.mvvm.model.Time;
import java.lang.ref.WeakReference;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class gl0 extends Handler {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gl0(v9c v9cVar) {
        super(Looper.getMainLooper());
        this.a = 6;
        this.b = v9cVar;
    }

    private final void a(Message message) {
        kl0 kl0Var = (kl0) this.b;
        int i = message.what;
        il0 il0Var = null;
        if (i == 1) {
            il0 il0Var2 = (il0) message.obj;
            try {
                kl0Var.a.queueInputBuffer(il0Var2.a, 0, il0Var2.b, il0Var2.d, il0Var2.e);
            } catch (RuntimeException e) {
                AtomicReference atomicReference = kl0Var.d;
                while (!atomicReference.compareAndSet(null, e) && atomicReference.get() == null) {
                }
            }
            il0Var = il0Var2;
        } else if (i == 2) {
            il0 il0Var3 = (il0) message.obj;
            int i2 = il0Var3.a;
            MediaCodec.CryptoInfo cryptoInfo = il0Var3.c;
            long j = il0Var3.d;
            int i3 = il0Var3.e;
            try {
                if (Build.VERSION.SDK_INT >= 31) {
                    kl0Var.a.queueSecureInputBuffer(i2, 0, cryptoInfo, j, i3);
                } else {
                    synchronized (kl0.h) {
                        kl0Var.a.queueSecureInputBuffer(i2, 0, cryptoInfo, j, i3);
                    }
                }
            } catch (RuntimeException e2) {
                AtomicReference atomicReference2 = kl0Var.d;
                while (!atomicReference2.compareAndSet(null, e2) && atomicReference2.get() == null) {
                }
            }
            il0Var = il0Var3;
        } else if (i == 3) {
            kl0Var.e.c();
        } else if (i != 4) {
            AtomicReference atomicReference3 = kl0Var.d;
            IllegalStateException illegalStateException = new IllegalStateException(String.valueOf(i));
            while (!atomicReference3.compareAndSet(null, illegalStateException) && atomicReference3.get() == null) {
            }
        } else {
            try {
                kl0Var.a.setParameters((Bundle) message.obj);
            } catch (RuntimeException e3) {
                AtomicReference atomicReference4 = kl0Var.d;
                while (!atomicReference4.compareAndSet(null, e3) && atomicReference4.get() == null) {
                }
            }
        }
        if (il0Var != null) {
            ArrayDeque arrayDeque = kl0.g;
            synchronized (arrayDeque) {
                arrayDeque.add(il0Var);
            }
        }
    }

    private final void b(Message message) {
        eja ejaVar;
        Set set;
        Pair pair = (Pair) message.obj;
        Object obj = pair.first;
        Object obj2 = pair.second;
        int i = message.what;
        if (i == 1) {
            oo4 oo4Var = (oo4) this.b;
            z41 z41Var = oo4Var.c;
            if (obj == oo4Var.z) {
                if (oo4Var.p == 2 || oo4Var.h()) {
                    oo4Var.z = null;
                    if (obj2 instanceof Exception) {
                        z41Var.t(false, (Exception) obj2);
                        return;
                    }
                    try {
                        oo4Var.b.provideProvisionResponse(((q4c) obj2).a);
                        z41Var.c = null;
                        HashSet hashSet = (HashSet) z41Var.b;
                        hv9 v = hv9.v(hashSet);
                        hashSet.clear();
                        av9 listIterator = v.listIterator(0);
                        while (listIterator.hasNext()) {
                            oo4 oo4Var2 = (oo4) listIterator.next();
                            if (oo4Var2.k()) {
                                oo4Var2.g(true);
                            }
                        }
                        return;
                    } catch (Exception e) {
                        z41Var.t(true, e);
                        return;
                    }
                }
                return;
            }
            return;
        }
        if (i != 2) {
            return;
        }
        oo4 oo4Var3 = (oo4) this.b;
        if (obj == oo4Var3.x && oo4Var3.h()) {
            oo4Var3.x = null;
            synchronized (oo4Var3.o) {
                dja djaVar = oo4Var3.y;
                djaVar.getClass();
                ejaVar = new eja();
                djaVar.a.g();
                oo4Var3.y = null;
            }
            if ((obj2 instanceof Exception) || (obj2 instanceof NoSuchMethodError)) {
                oo4Var3.j((Throwable) obj2, false);
                return;
            }
            try {
                byte[] bArr = ((q4c) obj2).a;
                byte[] provideKeyResponse = oo4Var3.b.provideKeyResponse(oo4Var3.v, bArr);
                if (oo4Var3.w != null && provideKeyResponse != null && provideKeyResponse.length != 0) {
                    oo4Var3.w = provideKeyResponse;
                }
                oo4Var3.p = 4;
                at3 at3Var = oo4Var3.h;
                synchronized (at3Var.a) {
                    set = at3Var.c;
                }
                Iterator it = set.iterator();
                while (it.hasNext()) {
                    ((cc5) it.next()).a(ejaVar);
                }
            } catch (Exception e2) {
                e = e2;
                oo4Var3.j(e, true);
            } catch (NoSuchMethodError e3) {
                e = e3;
                oo4Var3.j(e, true);
            }
        }
    }

    private final void c(Message message) {
        dcc dccVar;
        ccc cccVar;
        gl0 gl0Var;
        ccc cccVar2;
        if (message.what == 1) {
            synchronized (((ccc) this.b).b) {
                dccVar = (dcc) ((WeakReference) ((ccc) this.b).d).get();
                cccVar = (ccc) this.b;
                gl0Var = (gl0) cccVar.e;
            }
            if (dccVar != null) {
                synchronized (dccVar.c) {
                    cccVar2 = dccVar.h;
                }
                if (cccVar != cccVar2 || gl0Var == null) {
                    return;
                }
                dccVar.d((icc) message.obj);
                ((ccc) this.b).b(dccVar, gl0Var);
                dccVar.d(null);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00ca A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Type inference failed for: r13v2, types: [hl0] */
    /* JADX WARN: Type inference failed for: r1v14, types: [a9p] */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v17, types: [a9p] */
    /* JADX WARN: Type inference failed for: r1v4, types: [hl0] */
    @Override // android.os.Handler
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void handleMessage(Message message) {
        ?? r1;
        switch (this.a) {
            case 0:
                jl0 jl0Var = (jl0) this.b;
                int i = message.what;
                if (i == 0) {
                    ?? r13 = (hl0) message.obj;
                    try {
                        jl0Var.a.queueInputBuffer(r13.a, 0, r13.b, r13.d, r13.e);
                    } catch (RuntimeException e) {
                        AtomicReference atomicReference = jl0Var.d;
                        while (!atomicReference.compareAndSet(null, e) && atomicReference.get() == null) {
                        }
                    }
                    r4 = r13;
                } else if (i == 1) {
                    ?? r12 = (hl0) message.obj;
                    int i2 = r12.a;
                    MediaCodec.CryptoInfo cryptoInfo = r12.c;
                    long j = r12.d;
                    int i3 = r12.e;
                    try {
                        synchronized (jl0.h) {
                            jl0Var.a.queueSecureInputBuffer(i2, 0, cryptoInfo, j, i3);
                        }
                    } catch (RuntimeException e2) {
                        AtomicReference atomicReference2 = jl0Var.d;
                        while (!atomicReference2.compareAndSet(null, e2) && atomicReference2.get() == null) {
                        }
                    }
                    r4 = r12;
                } else if (i != 2) {
                    AtomicReference atomicReference3 = jl0Var.d;
                    IllegalStateException illegalStateException = new IllegalStateException(String.valueOf(i));
                    while (!atomicReference3.compareAndSet(null, illegalStateException) && atomicReference3.get() == null) {
                    }
                } else {
                    jl0Var.e.j();
                }
                if (r4 != null) {
                    ArrayDeque arrayDeque = jl0.g;
                    synchronized (arrayDeque) {
                        arrayDeque.add(r4);
                    }
                    return;
                }
                return;
            case 1:
                a(message);
                return;
            case 2:
                b(message);
                return;
            case 3:
                byte[] bArr = (byte[]) message.obj;
                if (bArr == null) {
                    return;
                }
                Iterator it = ((so4) this.b).l.iterator();
                while (it.hasNext()) {
                    oo4 oo4Var = (oo4) it.next();
                    oo4Var.m();
                    if (Arrays.equals(oo4Var.v, bArr)) {
                        if (message.what == 2 && oo4Var.p == 4) {
                            String str = nik.a;
                            oo4Var.g(false);
                            return;
                        }
                        return;
                    }
                }
                return;
            case 4:
                message.getClass();
                xu7 xu7Var = (xu7) this.b;
                f92 f92Var = xu7Var.d;
                if (f92Var.c.isAttachedToWindow()) {
                    Event event = xu7Var.i;
                    if (event != null) {
                        Time time = event.getTime();
                        r4 = time != null ? time.getStatusTime() : null;
                        if (ok3.z(event)) {
                            xu7Var.f(event);
                        } else if (r4 != null) {
                            l4a.K((TextView) f92Var.r, z8e.t(r4, xe6.c().b, false));
                        } else {
                            ((TextView) f92Var.r).setText(pd0.u(xu7Var.b, event));
                        }
                    }
                    sendEmptyMessageDelayed(0, 1000L);
                    return;
                }
                return;
            case 5:
                if (message.what != 1) {
                    super.handleMessage(message);
                    return;
                } else {
                    ((LocalBroadcastManager) this.b).executePendingBroadcasts();
                    return;
                }
            case 6:
                int i4 = message.what;
                int i5 = message.arg1;
                Object obj = message.obj;
                Bundle peekData = message.peekData();
                SparseArray sparseArray = ((v9c) this.b).j;
                dvf dvfVar = (dvf) sparseArray.get(i5);
                if (dvfVar == null) {
                    return;
                }
                sparseArray.remove(i5);
                if (i4 == 3) {
                    dvfVar.a((Bundle) obj);
                    return;
                } else {
                    if (i4 != 4) {
                        return;
                    }
                    if (peekData != null) {
                        peekData.getString("error");
                    }
                    Objects.toString((Bundle) obj);
                    return;
                }
            case 7:
                dac dacVar = (dac) this.b;
                gl0 gl0Var = dacVar.x;
                int i6 = message.what;
                if (i6 == 1) {
                    dacVar.f((List) message.obj);
                    return;
                }
                if (i6 == 2) {
                    if (dacVar.j.isEmpty()) {
                        dacVar.i(2);
                        gl0Var.removeMessages(2);
                        gl0Var.removeMessages(3);
                        gl0Var.sendMessageDelayed(gl0Var.obtainMessage(3), 15000L);
                        return;
                    }
                    return;
                }
                if (i6 == 3 && dacVar.j.isEmpty()) {
                    dacVar.i(3);
                    gl0Var.removeMessages(2);
                    gl0Var.removeMessages(3);
                    gl0Var.removeMessages(1);
                    dacVar.g.h(dacVar.h);
                    return;
                }
                return;
            case 8:
                if (message.what != 1) {
                    return;
                }
                tac tacVar = (tac) this.b;
                List list = (List) message.obj;
                tacVar.q = SystemClock.uptimeMillis();
                tacVar.k.clear();
                tacVar.k.addAll(list);
                tacVar.l.o();
                return;
            case 9:
                bbc bbcVar = (bbc) this.b;
                int i7 = message.what;
                if (i7 == 1) {
                    bbcVar.m();
                    return;
                } else {
                    if (i7 == 2 && bbcVar.x != null) {
                        bbcVar.x = null;
                        bbcVar.n();
                        return;
                    }
                    return;
                }
            case 10:
                gbc gbcVar = (gbc) this.b;
                int i8 = message.what;
                if (i8 != 1) {
                    if (i8 != 2) {
                        return;
                    }
                    gbcVar.f = false;
                    gbcVar.h(gbcVar.e);
                    return;
                }
                gbcVar.h = false;
                hpo hpoVar = gbcVar.d;
                if (hpoVar != null) {
                    hbc hbcVar = gbcVar.g;
                    yz8 yz8Var = (yz8) hpoVar.a;
                    nbc d = yz8Var.d(gbcVar);
                    if (d != null) {
                        yz8Var.o(d, hbcVar);
                        return;
                    }
                    return;
                }
                return;
            case 11:
                c(message);
                return;
            case 12:
                if (message.what != 1) {
                    return;
                }
                PreferenceFragmentCompat preferenceFragmentCompat = (PreferenceFragmentCompat) this.b;
                PreferenceScreen preferenceScreen = (PreferenceScreen) preferenceFragmentCompat.b.g;
                if (preferenceScreen != null) {
                    preferenceFragmentCompat.c.setAdapter(preferenceFragmentCompat.k(preferenceScreen));
                    preferenceScreen.i();
                    return;
                }
                return;
            case 13:
                Set set = cw3.a;
                if (set.contains(this)) {
                    return;
                }
                try {
                    if (set.contains(this)) {
                        return;
                    }
                    try {
                        message.getClass();
                        e0 e0Var = (e0) this.b;
                        if (message.what == e0Var.g) {
                            Bundle data = message.getData();
                            if (data.getString("com.facebook.platform.status.ERROR_TYPE") != null) {
                                e0Var.a(null);
                            } else {
                                e0Var.a(data);
                            }
                            try {
                                e0Var.a.unbindService(e0Var);
                                return;
                            } catch (IllegalArgumentException unused) {
                                return;
                            }
                        }
                        return;
                    } catch (Throwable th) {
                        cw3.a(this, th);
                        return;
                    }
                } catch (Throwable th2) {
                    cw3.a(this, th2);
                    return;
                }
            default:
                b9p b9pVar = (b9p) this.b;
                int i9 = message.what;
                if (i9 == 1) {
                    r1 = (a9p) message.obj;
                    try {
                        b9pVar.a.queueInputBuffer(r1.a, 0, r1.b, r1.d, r1.e);
                    } catch (RuntimeException e3) {
                        AtomicReference atomicReference4 = b9pVar.d;
                        while (!atomicReference4.compareAndSet(null, e3) && atomicReference4.get() == null) {
                        }
                    }
                } else {
                    if (i9 != 2) {
                        if (i9 == 3) {
                            b9pVar.e.a();
                        } else if (i9 != 4) {
                            AtomicReference atomicReference5 = b9pVar.d;
                            IllegalStateException illegalStateException2 = new IllegalStateException(String.valueOf(i9));
                            while (!atomicReference5.compareAndSet(null, illegalStateException2) && atomicReference5.get() == null) {
                            }
                        } else {
                            try {
                                b9pVar.a.setParameters((Bundle) message.obj);
                            } catch (RuntimeException e4) {
                                AtomicReference atomicReference6 = b9pVar.d;
                                while (!atomicReference6.compareAndSet(null, e4) && atomicReference6.get() == null) {
                                }
                            }
                        }
                        if (r4 == null) {
                            ArrayDeque arrayDeque2 = b9p.g;
                            synchronized (arrayDeque2) {
                                arrayDeque2.add(r4);
                            }
                            return;
                        }
                        return;
                    }
                    r1 = (a9p) message.obj;
                    int i10 = r1.a;
                    MediaCodec.CryptoInfo cryptoInfo2 = r1.c;
                    long j2 = r1.d;
                    int i11 = r1.e;
                    try {
                        if (Build.VERSION.SDK_INT >= 31) {
                            b9pVar.a.queueSecureInputBuffer(i10, 0, cryptoInfo2, j2, i11);
                        } else {
                            synchronized (b9p.h) {
                                b9pVar.a.queueSecureInputBuffer(i10, 0, cryptoInfo2, j2, i11);
                            }
                        }
                    } catch (RuntimeException e5) {
                        AtomicReference atomicReference7 = b9pVar.d;
                        while (!atomicReference7.compareAndSet(null, e5) && atomicReference7.get() == null) {
                        }
                    }
                }
                r4 = r1;
                if (r4 == null) {
                }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ gl0(Object obj, Looper looper, int i) {
        super(looper);
        this.a = i;
        this.b = obj;
    }

    public /* synthetic */ gl0(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }
}
