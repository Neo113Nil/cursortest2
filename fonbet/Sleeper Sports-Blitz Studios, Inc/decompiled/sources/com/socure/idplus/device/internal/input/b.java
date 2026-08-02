package com.socure.idplus.device.internal.input;

import android.os.Handler;
import android.os.Message;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public final int f859a;
    public final com.socure.idplus.device.internal.thread.b b;
    public boolean c;

    public b(int i, com.socure.idplus.device.internal.thread.c socureThread) {
        Intrinsics.checkNotNullParameter(socureThread, "socureThread");
        this.f859a = i;
        this.b = socureThread;
    }

    public final void a(Object obj) {
        if (this.c) {
            com.socure.idplus.device.internal.thread.b bVar = this.b;
            int i = this.f859a;
            com.socure.idplus.device.internal.thread.c cVar = (com.socure.idplus.device.internal.thread.c) bVar;
            cVar.getClass();
            Message obtain = Message.obtain();
            obtain.what = i;
            obtain.obj = obj;
            Handler handler = cVar.f899a;
            if (handler != null) {
                handler.sendMessage(obtain);
            }
        }
    }

    public final void a() {
        this.c = true;
    }
}
