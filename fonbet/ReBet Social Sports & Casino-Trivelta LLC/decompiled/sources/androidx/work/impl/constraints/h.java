package androidx.work.impl.constraints;

import Q2.AbstractC1508t;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkRequest;
import androidx.work.impl.constraints.b;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes.dex */
public final class h extends ConnectivityManager.NetworkCallback {

    /* renamed from: a, reason: collision with root package name */
    public static final h f23881a = new h();

    /* renamed from: b, reason: collision with root package name */
    public static final Object f23882b = new Object();

    /* renamed from: c, reason: collision with root package name */
    public static final Map f23883c = new LinkedHashMap();

    /* renamed from: d, reason: collision with root package name */
    public static NetworkCapabilities f23884d;

    /* renamed from: e, reason: collision with root package name */
    public static boolean f23885e;

    public static final class a extends Lambda implements Function0 {

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ Function1 f23886d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ ConnectivityManager f23887e;

        /* renamed from: f, reason: collision with root package name */
        public final /* synthetic */ h f23888f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Function1 function1, ConnectivityManager connectivityManager, h hVar) {
            super(0);
            this.f23886d = function1;
            this.f23887e = connectivityManager;
            this.f23888f = hVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m55invoke();
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m55invoke() {
            String str;
            Object obj = h.f23882b;
            Function1 function1 = this.f23886d;
            ConnectivityManager connectivityManager = this.f23887e;
            h hVar = this.f23888f;
            synchronized (obj) {
                try {
                    h.f23883c.remove(function1);
                    if (h.f23883c.isEmpty()) {
                        AbstractC1508t e10 = AbstractC1508t.e();
                        str = j.f23894a;
                        e10.a(str, "NetworkRequestConstraintController unregister shared callback");
                        connectivityManager.unregisterNetworkCallback(hVar);
                        h hVar2 = h.f23881a;
                        hVar2.e(null);
                        hVar2.f(false);
                    }
                    Unit unit = Unit.INSTANCE;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    public final Function0 c(ConnectivityManager connManager, NetworkRequest networkRequest, Function1 onConstraintState) {
        String str;
        boolean canBeSatisfiedBy;
        String str2;
        Intrinsics.checkNotNullParameter(connManager, "connManager");
        Intrinsics.checkNotNullParameter(networkRequest, "networkRequest");
        Intrinsics.checkNotNullParameter(onConstraintState, "onConstraintState");
        synchronized (f23882b) {
            try {
                Map map = f23883c;
                boolean isEmpty = map.isEmpty();
                map.put(onConstraintState, networkRequest);
                if (isEmpty) {
                    AbstractC1508t e10 = AbstractC1508t.e();
                    str2 = j.f23894a;
                    e10.a(str2, "NetworkRequestConstraintController register shared callback");
                    connManager.registerDefaultNetworkCallback(this);
                }
                AbstractC1508t e11 = AbstractC1508t.e();
                str = j.f23894a;
                e11.a(str, "NetworkRequestConstraintController send initial capabilities");
                canBeSatisfiedBy = networkRequest.canBeSatisfiedBy(f23881a.d(connManager));
                onConstraintState.invoke(canBeSatisfiedBy ? b.a.f23858a : new b.C0420b(7));
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return new a(onConstraintState, connManager, this);
    }

    public final NetworkCapabilities d(ConnectivityManager connectivityManager) {
        Intrinsics.checkNotNullParameter(connectivityManager, "<this>");
        if (f23885e) {
            return f23884d;
        }
        NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork());
        f23884d = networkCapabilities;
        f23885e = true;
        return networkCapabilities;
    }

    public final void e(NetworkCapabilities networkCapabilities) {
        f23884d = networkCapabilities;
    }

    public final void f(boolean z10) {
        f23885e = z10;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
        String str;
        boolean canBeSatisfiedBy;
        Intrinsics.checkNotNullParameter(network, "network");
        Intrinsics.checkNotNullParameter(networkCapabilities, "networkCapabilities");
        AbstractC1508t e10 = AbstractC1508t.e();
        str = j.f23894a;
        e10.a(str, "NetworkRequestConstraintController onCapabilitiesChanged callback");
        synchronized (f23882b) {
            try {
                f23884d = networkCapabilities;
                for (Map.Entry entry : f23883c.entrySet()) {
                    Function1 function1 = (Function1) entry.getKey();
                    canBeSatisfiedBy = ((NetworkRequest) entry.getValue()).canBeSatisfiedBy(networkCapabilities);
                    function1.invoke(canBeSatisfiedBy ? b.a.f23858a : new b.C0420b(7));
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public void onLost(Network network) {
        String str;
        Intrinsics.checkNotNullParameter(network, "network");
        AbstractC1508t e10 = AbstractC1508t.e();
        str = j.f23894a;
        e10.a(str, "NetworkRequestConstraintController onLost callback");
        synchronized (f23882b) {
            try {
                f23884d = null;
                Iterator it = f23883c.keySet().iterator();
                while (it.hasNext()) {
                    ((Function1) it.next()).invoke(new b.C0420b(7));
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
