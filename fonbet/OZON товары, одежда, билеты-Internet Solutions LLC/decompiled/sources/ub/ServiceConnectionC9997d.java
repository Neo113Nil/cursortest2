package ub;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: ub.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ServiceConnectionC9997d implements ServiceConnection {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ AbstractC9996c<IInterface> f100462a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Za.d f100463b;

    ServiceConnectionC9997d(Za.d dVar, AbstractC9996c abstractC9996c) {
        this.f100462a = abstractC9996c;
        this.f100463b = dVar;
    }

    @Override // android.content.ServiceConnection
    public final void onBindingDied(ComponentName name) {
        Intrinsics.checkNotNullParameter(name, "name");
        AbstractC9996c.h(this.f100462a, name);
    }

    @Override // android.content.ServiceConnection
    public final void onNullBinding(ComponentName name) {
        Intrinsics.checkNotNullParameter(name, "name");
        this.f100463b.b("Null binding from " + name.getPackageName(), null);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName name, IBinder service) {
        AtomicBoolean atomicBoolean;
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(service, "service");
        AbstractC9996c<IInterface> abstractC9996c = this.f100462a;
        atomicBoolean = ((AbstractC9996c) abstractC9996c).f100455i;
        atomicBoolean.set(true);
        AbstractC9996c.i(abstractC9996c, name, service);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName name) {
        Intrinsics.checkNotNullParameter(name, "name");
        AbstractC9996c.j(this.f100462a, name);
    }
}
