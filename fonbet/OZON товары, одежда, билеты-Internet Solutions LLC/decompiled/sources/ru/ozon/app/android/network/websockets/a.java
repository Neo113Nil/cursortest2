package ru.ozon.app.android.network.websockets;

import hg.InterfaceC6948a;
import java.util.concurrent.atomic.AtomicLong;
import qc.o;

/* loaded from: classes12.dex */
public final /* synthetic */ class a implements o {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AtomicLong f92940a;

    public /* synthetic */ a(AtomicLong atomicLong) {
        this.f92940a = atomicLong;
    }

    @Override // qc.o
    public final Object apply(Object obj) {
        InterfaceC6948a invoke$lambda$0;
        invoke$lambda$0 = OzonWebSocketImpl$getSocketFlowable$3.invoke$lambda$0(this.f92940a, obj);
        return invoke$lambda$0;
    }
}
