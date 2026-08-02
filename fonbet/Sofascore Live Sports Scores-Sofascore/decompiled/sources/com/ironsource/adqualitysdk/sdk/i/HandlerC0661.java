package com.ironsource.adqualitysdk.sdk.i;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.adqualitysdk.sdk.i.ᒪ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class HandlerC0661 extends Handler {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ C0656 f2260;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HandlerC0661(C0656 c0656, Looper looper) {
        super(looper);
        this.f2260 = c0656;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        int size;
        AbstractC0658[] abstractC0658Arr;
        if (message.what != 1) {
            super.handleMessage(message);
            return;
        }
        C0656 c0656 = this.f2260;
        do {
            synchronized (c0656.f2254) {
                try {
                    size = c0656.f2252.size();
                    if (size <= 0) {
                        return;
                    }
                    abstractC0658Arr = new AbstractC0658[size];
                    c0656.f2252.toArray(abstractC0658Arr);
                    c0656.f2252.clear();
                } catch (Throwable th) {
                    throw th;
                }
            }
        } while (size <= 0);
        AbstractC0658 abstractC0658 = abstractC0658Arr[0];
        throw null;
    }
}
