package com.vk.channels.impl.channel_screen;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import io.reactivex.rxjava3.core.q;
import io.reactivex.rxjava3.internal.functions.a;
import io.reactivex.rxjava3.internal.operators.observable.a0;
import io.reactivex.rxjava3.internal.operators.observable.c0;
import io.reactivex.rxjava3.subjects.d;
import xsna.c5q0;
import xsna.g620;
import xsna.h53;
import xsna.k5j0;
import xsna.mcj0;

/* compiled from: UnreadCounterDataSource.kt */
/* loaded from: classes16.dex */
public final class UnreadCounterDataSourceImpl implements c5q0 {
    public final Context a;
    public final d<Integer> b;
    public boolean c;
    public final UnreadCounterDataSourceImpl$broadcastReceiver$1 d;
    public final a0 e;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.vk.channels.impl.channel_screen.UnreadCounterDataSourceImpl$broadcastReceiver$1] */
    public UnreadCounterDataSourceImpl(Context context) {
        this.a = context;
        d<Integer> O0 = d.O0(Integer.valueOf(g620.g()));
        this.b = O0;
        this.d = new BroadcastReceiver() { // from class: com.vk.channels.impl.channel_screen.UnreadCounterDataSourceImpl$broadcastReceiver$1
            @Override // android.content.BroadcastReceiver
            public final void onReceive(Context context2, Intent intent) {
                String action = intent.getAction();
                if (action != null && action.hashCode() == -1414915502 && action.equals("com.vkontakte.android.COUNTERS_UPDATED")) {
                    UnreadCounterDataSourceImpl.this.b.onNext(Integer.valueOf(g620.g()));
                }
            }
        };
        this.e = new a0(new c0(O0, new k5j0(new mcj0(this, 14), 10), a.c), new h53(this, 6));
    }

    @Override // xsna.c5q0
    public final q<Integer> a() {
        return this.e;
    }
}
