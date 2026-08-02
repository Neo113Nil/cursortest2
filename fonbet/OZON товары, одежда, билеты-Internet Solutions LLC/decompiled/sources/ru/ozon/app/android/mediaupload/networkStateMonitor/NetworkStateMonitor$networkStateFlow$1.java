package ru.ozon.app.android.mediaupload.networkStateMonitor;

import Sc.s;
import Wc.a;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkRequest;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ze.u;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lze/u;", "", "", "<anonymous>", "(Lze/u;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.mediaupload.networkStateMonitor.NetworkStateMonitor$networkStateFlow$1", f = "NetworkStateMonitor.kt", l = {34}, m = "invokeSuspend")
/* loaded from: classes12.dex */
final class NetworkStateMonitor$networkStateFlow$1 extends j implements Function2<u<? super Boolean>, d<? super Unit>, Object> {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ NetworkStateMonitor this$0;

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.mediaupload.networkStateMonitor.NetworkStateMonitor$networkStateFlow$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends AbstractC7737t implements Function0<Unit> {
        final /* synthetic */ NetworkStateMonitor$networkStateFlow$1$networkCallback$1 $networkCallback;
        final /* synthetic */ NetworkStateMonitor this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(NetworkStateMonitor networkStateMonitor, NetworkStateMonitor$networkStateFlow$1$networkCallback$1 networkStateMonitor$networkStateFlow$1$networkCallback$1) {
            super(0);
            this.this$0 = networkStateMonitor;
            this.$networkCallback = networkStateMonitor$networkStateFlow$1$networkCallback$1;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            ConnectivityManager connectivityManager;
            connectivityManager = this.this$0.connectivityManager;
            connectivityManager.unregisterNetworkCallback(this.$networkCallback);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    NetworkStateMonitor$networkStateFlow$1(NetworkStateMonitor networkStateMonitor, d<? super NetworkStateMonitor$networkStateFlow$1> dVar) {
        super(2, dVar);
        this.this$0 = networkStateMonitor;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        NetworkStateMonitor$networkStateFlow$1 networkStateMonitor$networkStateFlow$1 = new NetworkStateMonitor$networkStateFlow$1(this.this$0, dVar);
        networkStateMonitor$networkStateFlow$1.L$0 = obj;
        return networkStateMonitor$networkStateFlow$1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v4, types: [android.net.ConnectivityManager$NetworkCallback, ru.ozon.app.android.mediaupload.networkStateMonitor.NetworkStateMonitor$networkStateFlow$1$networkCallback$1] */
    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        boolean currentConnectionState;
        ConnectivityManager connectivityManager;
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 == 0) {
            s.b(obj);
            final u uVar = (u) this.L$0;
            currentConnectionState = this.this$0.getCurrentConnectionState();
            uVar.b(Boolean.valueOf(currentConnectionState));
            ?? r12 = new ConnectivityManager.NetworkCallback() { // from class: ru.ozon.app.android.mediaupload.networkStateMonitor.NetworkStateMonitor$networkStateFlow$1$networkCallback$1
                @Override // android.net.ConnectivityManager.NetworkCallback
                public void onLost(Network network) {
                    Intrinsics.checkNotNullParameter(network, "network");
                    uVar.b(Boolean.FALSE);
                }

                @Override // android.net.ConnectivityManager.NetworkCallback
                public void onUnavailable() {
                    uVar.b(Boolean.FALSE);
                }
            };
            NetworkRequest build = new NetworkRequest.Builder().addCapability(12).build();
            connectivityManager = this.this$0.connectivityManager;
            connectivityManager.registerNetworkCallback(build, (ConnectivityManager.NetworkCallback) r12);
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, r12);
            this.label = 1;
            if (ze.s.a(uVar, anonymousClass1, this) == aVar) {
                return aVar;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
        }
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(u<? super Boolean> uVar, d<? super Unit> dVar) {
        return ((NetworkStateMonitor$networkStateFlow$1) create(uVar, dVar)).invokeSuspend(Unit.f71690a);
    }
}
