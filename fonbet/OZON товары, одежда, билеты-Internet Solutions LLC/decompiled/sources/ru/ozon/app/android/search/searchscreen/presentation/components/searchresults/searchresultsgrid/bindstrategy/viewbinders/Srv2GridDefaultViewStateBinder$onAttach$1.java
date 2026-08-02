package ru.ozon.app.android.search.searchscreen.presentation.components.searchresults.searchresultsgrid.bindstrategy.viewbinders;

import DM.e;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.J;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import nc.C8486a;
import nc.InterfaceC8487b;
import ru.ozon.app.android.account.adult.presenter.AdultDelegate;
import ru.ozon.app.android.utils.rx.RxExtKt;

@Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"ru/ozon/app/android/search/searchscreen/presentation/components/searchresults/searchresultsgrid/bindstrategy/viewbinders/Srv2GridDefaultViewStateBinder$onAttach$1", "Landroidx/lifecycle/DefaultLifecycleObserver;", "Landroidx/lifecycle/J;", "owner", "", "onCreate", "(Landroidx/lifecycle/J;)V", "onDestroy", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class Srv2GridDefaultViewStateBinder$onAttach$1 implements DefaultLifecycleObserver {
    final /* synthetic */ Srv2GridDefaultViewStateBinder this$0;

    Srv2GridDefaultViewStateBinder$onAttach$1(Srv2GridDefaultViewStateBinder srv2GridDefaultViewStateBinder) {
        this.this$0 = srv2GridDefaultViewStateBinder;
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onCreate(J owner) {
        C8486a c8486a;
        AdultDelegate adultDelegate;
        Intrinsics.checkNotNullParameter(owner, "owner");
        if (this.this$0.getItem().getIsAdult()) {
            c8486a = this.this$0.disposables;
            adultDelegate = this.this$0.adultDelegate;
            InterfaceC8487b subscribe = adultDelegate.observeItem().subscribe(new e(new Srv2GridDefaultViewStateBinder$onAttach$1$onCreate$1(this.this$0), 7));
            Intrinsics.checkNotNullExpressionValue(subscribe, "subscribe(...)");
            RxExtKt.plusAssign(c8486a, subscribe);
        }
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onDestroy(J owner) {
        C8486a c8486a;
        AdultDelegate adultDelegate;
        Intrinsics.checkNotNullParameter(owner, "owner");
        c8486a = this.this$0.disposables;
        c8486a.d();
        adultDelegate = this.this$0.adultDelegate;
        adultDelegate.clear();
        this.this$0.getViewHolder().getLifecycle().e(this);
    }
}
