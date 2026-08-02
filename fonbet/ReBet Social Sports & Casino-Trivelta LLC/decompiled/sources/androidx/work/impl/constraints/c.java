package androidx.work.impl.constraints;

import Q2.AbstractC1508t;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkRequest;
import androidx.work.impl.constraints.b;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import kotlin.text.StringsKt;

/* loaded from: classes.dex */
public final class c extends ConnectivityManager.NetworkCallback {

    /* renamed from: b, reason: collision with root package name */
    public static final a f23860b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    public final Function1 f23861a;

    public static final class a {

        /* renamed from: androidx.work.impl.constraints.c$a$a, reason: collision with other inner class name */
        public static final class C0421a extends Lambda implements Function0 {

            /* renamed from: d, reason: collision with root package name */
            public final /* synthetic */ Ref.BooleanRef f23862d;

            /* renamed from: e, reason: collision with root package name */
            public final /* synthetic */ ConnectivityManager f23863e;

            /* renamed from: f, reason: collision with root package name */
            public final /* synthetic */ c f23864f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0421a(Ref.BooleanRef booleanRef, ConnectivityManager connectivityManager, c cVar) {
                super(0);
                this.f23862d = booleanRef;
                this.f23863e = connectivityManager;
                this.f23864f = cVar;
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Object invoke() {
                m53invoke();
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m53invoke() {
                String str;
                if (this.f23862d.element) {
                    AbstractC1508t e10 = AbstractC1508t.e();
                    str = j.f23894a;
                    e10.a(str, "NetworkRequestConstraintController unregister callback");
                    this.f23863e.unregisterNetworkCallback(this.f23864f);
                }
            }
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Function0 a(ConnectivityManager connManager, NetworkRequest networkRequest, Function1 onConstraintState) {
            String str;
            String str2;
            Intrinsics.checkNotNullParameter(connManager, "connManager");
            Intrinsics.checkNotNullParameter(networkRequest, "networkRequest");
            Intrinsics.checkNotNullParameter(onConstraintState, "onConstraintState");
            c cVar = new c(onConstraintState, null);
            Ref.BooleanRef booleanRef = new Ref.BooleanRef();
            try {
                AbstractC1508t e10 = AbstractC1508t.e();
                str2 = j.f23894a;
                e10.a(str2, "NetworkRequestConstraintController register callback");
                connManager.registerNetworkCallback(networkRequest, cVar);
                booleanRef.element = true;
            } catch (RuntimeException e11) {
                String name = e11.getClass().getName();
                Intrinsics.checkNotNullExpressionValue(name, "ex.javaClass.name");
                if (!StringsKt.endsWith$default(name, "TooManyRequestsException", false, 2, (Object) null)) {
                    throw e11;
                }
                AbstractC1508t e12 = AbstractC1508t.e();
                str = j.f23894a;
                e12.b(str, "NetworkRequestConstraintController couldn't register callback", e11);
                onConstraintState.invoke(new b.C0420b(7));
            }
            return new C0421a(booleanRef, connManager, cVar);
        }

        public a() {
        }
    }

    public /* synthetic */ c(Function1 function1, DefaultConstructorMarker defaultConstructorMarker) {
        this(function1);
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
        String str;
        Intrinsics.checkNotNullParameter(network, "network");
        Intrinsics.checkNotNullParameter(networkCapabilities, "networkCapabilities");
        AbstractC1508t e10 = AbstractC1508t.e();
        str = j.f23894a;
        e10.a(str, "NetworkRequestConstraintController onCapabilitiesChanged callback");
        this.f23861a.invoke(b.a.f23858a);
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public void onLost(Network network) {
        String str;
        Intrinsics.checkNotNullParameter(network, "network");
        AbstractC1508t e10 = AbstractC1508t.e();
        str = j.f23894a;
        e10.a(str, "NetworkRequestConstraintController onLost callback");
        this.f23861a.invoke(new b.C0420b(7));
    }

    public c(Function1 function1) {
        this.f23861a = function1;
    }
}
