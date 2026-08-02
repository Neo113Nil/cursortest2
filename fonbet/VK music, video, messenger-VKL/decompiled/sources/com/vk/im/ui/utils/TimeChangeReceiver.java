package com.vk.im.ui.utils;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.gzs;
import xsna.s3q0;

/* compiled from: TimeChangeReceiver.kt */
/* loaded from: classes2.dex */
public final class TimeChangeReceiver {
    public final Context a;
    public final FunctionReferenceImpl b;
    public final TimeChangeReceiver$receiver$1 c = new BroadcastReceiver() { // from class: com.vk.im.ui.utils.TimeChangeReceiver$receiver$1
        /* JADX WARN: Type inference failed for: r1v2, types: [kotlin.jvm.internal.FunctionReferenceImpl, xsna.gzs] */
        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            TimeChangeReceiver.this.b.invoke();
        }
    };

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [com.vk.im.ui.utils.TimeChangeReceiver$receiver$1] */
    public TimeChangeReceiver(Context context, gzs<s3q0> gzsVar) {
        this.a = context;
        this.b = (FunctionReferenceImpl) gzsVar;
    }
}
