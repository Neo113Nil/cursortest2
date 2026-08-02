package com.vk.subscription.impl;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.vk.dto.common.id.UserId;
import com.vk.subscription.api.SubscribeStatus;
import com.vk.subscription.impl.RxUsersSubscriptionBusImpl;
import io.reactivex.rxjava3.internal.functions.a;
import io.reactivex.rxjava3.internal.operators.observable.c0;
import io.reactivex.rxjava3.subjects.f;
import java.util.concurrent.atomic.AtomicInteger;
import xsna.ewg0;
import xsna.fkq0;
import xsna.kym0;
import xsna.ryw;

/* compiled from: RxUsersSubscriptionBusImpl.kt */
/* loaded from: classes11.dex */
public final class RxUsersSubscriptionBusImpl extends BroadcastReceiver implements ewg0 {
    public static final /* synthetic */ int f = 0;
    public final f<kym0> b;
    public final AtomicInteger c;
    public final c0 d;
    public final IntentFilter e;

    public RxUsersSubscriptionBusImpl() {
        f<kym0> fVar = new f<>();
        this.b = fVar;
        this.c = new AtomicInteger(0);
        final ryw rywVar = new ryw(this, 1);
        this.d = new c0(new c0(fVar, new io.reactivex.rxjava3.functions.f() { // from class: xsna.fwg0
            @Override // io.reactivex.rxjava3.functions.f
            public final void accept(Object obj) {
                int i = RxUsersSubscriptionBusImpl.f;
                ryw.this.invoke(obj);
            }
        }, a.c), a.d, new io.reactivex.rxjava3.functions.a() { // from class: xsna.gwg0
            @Override // io.reactivex.rxjava3.functions.a
            public final void run() {
                RxUsersSubscriptionBusImpl rxUsersSubscriptionBusImpl = RxUsersSubscriptionBusImpl.this;
                if (rxUsersSubscriptionBusImpl.c.decrementAndGet() == 0) {
                    Context context = e43.a;
                    if (context == null) {
                        context = null;
                    }
                    context.unregisterReceiver(rxUsersSubscriptionBusImpl);
                }
            }
        });
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.vkontakte.android.ACTION_FRIEND_STATUS_CHANGED");
        intentFilter.addAction("com.vkontakte.android.ACTION_GROUP_STATUS_CHANGED");
        this.e = intentFilter;
    }

    @Override // xsna.ewg0
    public final c0 a() {
        return this.d;
    }

    @Override // xsna.ewg0
    public final void b(kym0 kym0Var) {
        this.b.onNext(kym0Var);
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        SubscribeStatus a;
        UserId userId = (UserId) intent.getParcelableExtra("id");
        if (userId == null) {
            return;
        }
        int intExtra = intent.getIntExtra("status", 0);
        if (fkq0.b(userId)) {
            SubscribeStatus.Companion.getClass();
            a = SubscribeStatus.a.b(intExtra);
        } else {
            SubscribeStatus.Companion.getClass();
            a = SubscribeStatus.a.a(intExtra);
        }
        this.b.onNext(new kym0(a, userId, null, null, 12));
    }
}
