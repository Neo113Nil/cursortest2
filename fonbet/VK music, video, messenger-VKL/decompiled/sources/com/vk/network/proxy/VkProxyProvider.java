package com.vk.network.proxy;

import android.net.Uri;
import com.vk.core.preference.Preference;
import com.vk.log.L;
import com.vk.network.proxy.data.model.VkProxyNetwork;
import com.vk.network.proxy.verifier.VkProxyPoll;
import io.jsonwebtoken.JwtParser;
import io.reactivex.rxjava3.core.q;
import io.reactivex.rxjava3.core.w;
import io.reactivex.rxjava3.functions.f;
import io.reactivex.rxjava3.functions.l;
import io.reactivex.rxjava3.internal.functions.a;
import io.reactivex.rxjava3.internal.functions.b;
import io.reactivex.rxjava3.internal.operators.observable.b0;
import io.reactivex.rxjava3.internal.operators.observable.j1;
import io.reactivex.rxjava3.internal.operators.observable.y;
import io.reactivex.rxjava3.subjects.j;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptyList;
import org.webrtc.PeerConnectionFactory;
import xsna.acj;
import xsna.asp;
import xsna.cli0;
import xsna.dev0;
import xsna.drm0;
import xsna.fev0;
import xsna.fw3;
import xsna.gev0;
import xsna.gq40;
import xsna.im;
import xsna.j5g;
import xsna.jev0;
import xsna.kev0;
import xsna.kug0;
import xsna.lev0;
import xsna.ltg0;
import xsna.pev0;
import xsna.q9k;
import xsna.s3q0;
import xsna.s9e0;
import xsna.urd0;
import xsna.v9e0;
import xsna.zdp;
import xsna.zrp;
import xsna.zvi0;

/* compiled from: VkProxyProvider.kt */
/* loaded from: classes.dex */
public final class VkProxyProvider implements dev0 {
    public final kev0 b;
    public final jev0 c;
    public final pev0 d;
    public final s9e0 e;
    public volatile State f;
    public final ReentrantLock g;
    public final Condition h;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: VkProxyProvider.kt */
    public static final class State {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ State[] $VALUES;
        public static final State Enabled;
        public static final State Forbidden;
        public static final State Initialization;
        public static final State Initialized;
        public static final State Verification;

        static {
            State state = new State("Initialization", 0);
            Initialization = state;
            State state2 = new State("Initialized", 1);
            Initialized = state2;
            State state3 = new State("Verification", 2);
            Verification = state3;
            State state4 = new State(PeerConnectionFactory.TRIAL_ENABLED, 3);
            Enabled = state4;
            State state5 = new State("Forbidden", 4);
            Forbidden = state5;
            State[] stateArr = {state, state2, state3, state4, state5};
            $VALUES = stateArr;
            $ENTRIES = new asp(stateArr);
        }

        public State() {
            throw null;
        }

        public static State valueOf(String str) {
            return (State) Enum.valueOf(State.class, str);
        }

        public static State[] values() {
            return (State[]) $VALUES.clone();
        }
    }

    /* compiled from: VkProxyProvider.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;

        static {
            int[] iArr = new int[VkProxyNetwork.Status.values().length];
            try {
                iArr[VkProxyNetwork.Status.BLOCKED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[VkProxyNetwork.Status.ENABLED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[State.values().length];
            try {
                iArr2[State.Initialization.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[State.Enabled.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[State.Forbidden.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[State.Verification.ordinal()] = 4;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[State.Initialized.ordinal()] = 5;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[VkProxyPoll.values().length];
            try {
                iArr3[VkProxyPoll.NEXT.ordinal()] = 1;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr3[VkProxyPoll.SUCCESS.ordinal()] = 2;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr3[VkProxyPoll.ERROR.ordinal()] = 3;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr3[VkProxyPoll.CANCEL.ordinal()] = 4;
            } catch (NoSuchFieldError unused11) {
            }
            $EnumSwitchMapping$2 = iArr3;
        }
    }

    public VkProxyProvider(kev0 kev0Var, jev0 jev0Var, pev0 pev0Var, s9e0 s9e0Var, w wVar) {
        b.a aVar = b.a;
        a.q qVar = io.reactivex.rxjava3.internal.functions.a.a;
        this.b = kev0Var;
        this.c = jev0Var;
        this.d = pev0Var;
        this.e = s9e0Var;
        this.f = State.Initialization;
        ReentrantLock reentrantLock = new ReentrantLock();
        this.g = reentrantLock;
        this.h = reentrantLock.newCondition();
        if (!pev0Var.a.d) {
            pev0Var.j.U(new l(new im(3)) { // from class: xsna.ekr
                @Override // io.reactivex.rxjava3.functions.l
                public Object apply(Object obj2) {
                    return s3q0.a;
                }
            }).a0(wVar).subscribe(new zvi0(new fev0(this), 1));
            j<VkProxyNetwork> jVar = pev0Var.d.a;
            jVar.getClass();
            new y(jVar, qVar, aVar).a0(wVar).subscribe(new ltg0(new cli0(this, 1), 1));
            return;
        }
        j1 U = pev0Var.j.U(new l(new im(3)) { // from class: xsna.ekr
            @Override // io.reactivex.rxjava3.functions.l
            public Object apply(Object obj2) {
                return s3q0.a;
            }
        });
        zdp zdpVar = new zdp(new kug0(2), 1);
        a.l lVar = io.reactivex.rxjava3.internal.functions.a.d;
        a.k kVar = io.reactivex.rxjava3.internal.functions.a.c;
        b0 E = U.E(zdpVar, lVar, kVar, kVar);
        j<VkProxyNetwork> jVar2 = pev0Var.d.a;
        jVar2.getClass();
        y yVar = new y(jVar2, qVar, aVar);
        final gev0 gev0Var = new gev0();
        q.m(E, yVar.E(new f() { // from class: xsna.hev0
            @Override // io.reactivex.rxjava3.functions.f
            public final void accept(Object obj) {
                gev0.this.invoke(obj);
            }
        }, lVar, kVar, kVar), new urd0()).a0(wVar).subscribe(new acj(new gq40(this, 1), 2));
    }

    @Override // xsna.dev0
    public final boolean a() {
        return this.d.b();
    }

    @Override // xsna.dev0
    public final Uri b(Uri uri) {
        String str = this.d.g;
        if (isEnabled() && !drm0.N(str) && c(uri)) {
            return uri.buildUpon().authority(str).build();
        }
        return null;
    }

    @Override // xsna.dev0
    public final boolean c(Uri uri) {
        String host;
        v9e0 v9e0Var;
        List list;
        String str;
        if (isEnabled() && (host = uri.getHost()) != null && (v9e0Var = this.d.h) != null) {
            Set<Integer> set = v9e0Var.b;
            List j = pev0.k.j(0, host);
            if (!j.isEmpty()) {
                ListIterator listIterator = j.listIterator(j.size());
                while (listIterator.hasPrevious()) {
                    if (((String) listIterator.previous()).length() != 0) {
                        list = j5g.H0(j, listIterator.nextIndex() + 1);
                        break;
                    }
                }
            }
            list = EmptyList.b;
            Set<Integer> set2 = set;
            if (!(set2 instanceof Collection) || !set2.isEmpty()) {
                Iterator<T> it = set2.iterator();
                while (it.hasNext()) {
                    int intValue = ((Number) it.next()).intValue();
                    int size = list.size();
                    if (size < intValue) {
                        str = null;
                    } else if (size == intValue) {
                        str = host;
                    } else {
                        String str2 = "";
                        for (int i = size - intValue; i < size; i++) {
                            StringBuilder e = fw3.e(str2);
                            e.append((String) list.get(i));
                            str2 = e.toString();
                            if (i != size - 1) {
                                str2 = str2 + JwtParser.SEPARATOR_CHAR;
                            }
                        }
                        str = str2;
                    }
                    if (str == null ? false : v9e0Var.a.contains(str)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final void d() {
        ReentrantLock reentrantLock = this.g;
        reentrantLock.lock();
        try {
            if (this.d.a()) {
                if (this.d.b()) {
                    L.e("Proxy is unavailable at this moment!");
                }
            } else {
                this.e.a();
                this.f = g();
                isEnabled();
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // xsna.dev0
    public final void disable() {
        ReentrantLock reentrantLock = this.g;
        reentrantLock.lock();
        try {
            e();
            Preference.I("NetworkProxy", "proxy_user_state_changed", true);
            this.f = State.Forbidden;
            s3q0 s3q0Var = s3q0.a;
        } finally {
            reentrantLock.unlock();
        }
    }

    public final void e() {
        ReentrantLock reentrantLock = this.g;
        reentrantLock.lock();
        try {
            if (this.f == State.Forbidden) {
                return;
            }
            if (this.f == State.Enabled) {
                this.c.a();
            }
            this.d.g = "";
            Preference.F(-1L, "NetworkProxy", "last_enabled_time");
            Preference.I("NetworkProxy", "is_last_enabled_proxy", false);
            s3q0 s3q0Var = s3q0.a;
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // xsna.dev0
    public final boolean enable() {
        State state;
        if (this.f == State.Enabled) {
            if (this.d.b()) {
                L.e("Proxy has already Enabled");
            }
            return true;
        }
        State state2 = this.f;
        State state3 = State.Forbidden;
        boolean z = state2 == state3 || this.d.a();
        if (this.d.b()) {
            if (this.f == state3) {
                L.e("Proxy is Forbidden");
            }
            if (this.d.a()) {
                L.e("Proxy is unavailable at this moment!");
            }
        }
        if (z) {
            return false;
        }
        ReentrantLock reentrantLock = this.g;
        reentrantLock.lock();
        boolean z2 = false;
        while (true) {
            try {
                try {
                    if (this.f != State.Initialization) {
                        State state4 = this.f;
                        State state5 = State.Verification;
                        if (state4 != state5) {
                            int i = a.$EnumSwitchMapping$1[this.f.ordinal()];
                            if (i != 1) {
                                if (i == 2 || i == 3) {
                                    state = this.f;
                                } else if (i != 4) {
                                    if (i != 5) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    this.f = state5;
                                    state = g();
                                }
                                this.f = state;
                                boolean z3 = this.f == State.Enabled;
                                this.h.signalAll();
                                return z3;
                            }
                            throw new IllegalStateException("Initialization and Verification must be blocked!");
                        }
                    }
                    if (z2) {
                        L.e("Proxy still in " + this.f);
                        this.h.signalAll();
                        return false;
                    }
                    L.e("Await for initialize proxy");
                    this.h.await(3000L, TimeUnit.MILLISECONDS);
                    z2 = true;
                } catch (Throwable th) {
                    this.h.signalAll();
                    throw th;
                }
            } finally {
                reentrantLock.unlock();
            }
        }
    }

    public final boolean f() {
        ReentrantLock reentrantLock = this.g;
        reentrantLock.lock();
        try {
            this.e.a();
            this.f = State.Initialized;
            return enable();
        } finally {
            reentrantLock.unlock();
        }
    }

    public final State g() {
        long min;
        L.e("Start proxy verification...");
        s9e0 s9e0Var = this.e;
        if ((s9e0Var.c < 1 ? 0L : Math.abs(System.currentTimeMillis() - s9e0Var.c)) >= s9e0Var.a) {
            s9e0Var.a();
        }
        if (s9e0Var.d < 0) {
            s9e0Var.d = 5000L;
            min = 0;
        } else {
            s9e0Var.c = System.currentTimeMillis();
            min = Math.min((long) (5000 * s9e0Var.b), 300000L);
            s9e0Var.d = min;
            s9e0Var.b *= 1.5f;
        }
        if (min > 0) {
            L.e(q9k.d("Proxy backoff - ", min, '!'));
            return this.f;
        }
        State state = this.f;
        State state2 = State.Enabled;
        if (state != state2) {
            this.d.c();
        }
        L.e("Proxy versifying...");
        VkProxyPoll d = this.b.d();
        if (d == VkProxyPoll.SUCCESS) {
            this.e.a();
        }
        int i = a.$EnumSwitchMapping$2[d.ordinal()];
        if (i != 1 && i != 2) {
            if (i == 3) {
                e();
                return State.Forbidden;
            }
            if (i == 4) {
                return State.Initialized;
            }
            throw new NoWhenBranchMatchedException();
        }
        ReentrantLock reentrantLock = this.g;
        reentrantLock.lock();
        try {
            if (this.f != state2) {
                jev0 jev0Var = this.c;
                jev0Var.b.a(String.valueOf(jev0Var.c.incrementAndGet()), jev0Var.d.getNetworkOperator(), jev0Var.a.getResources().getConfiguration().locale);
            }
            Preference.F(System.currentTimeMillis(), "NetworkProxy", "last_enabled_time");
            Preference.I("NetworkProxy", "is_last_enabled_proxy", true);
            s3q0 s3q0Var = s3q0.a;
            return state2;
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // xsna.dev0
    public final String getHost() {
        return this.d.g;
    }

    @Override // xsna.dev0
    public final lev0 getStat() {
        return this.d.b;
    }

    @Override // xsna.dev0
    public final boolean isEnabled() {
        return this.f == State.Enabled;
    }

    @Override // xsna.dev0
    public final boolean refresh() {
        ReentrantLock reentrantLock = this.g;
        reentrantLock.lock();
        try {
            Preference.I("NetworkProxy", "proxy_user_state_changed", false);
            return f();
        } finally {
            reentrantLock.unlock();
        }
    }
}
