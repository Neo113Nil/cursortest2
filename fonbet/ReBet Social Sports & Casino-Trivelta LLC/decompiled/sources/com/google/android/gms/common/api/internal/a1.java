package com.google.android.gms.common.api.internal;

import android.os.RemoteException;
import com.google.android.gms.common.api.Status;

/* loaded from: classes2.dex */
public abstract class a1 {

    /* renamed from: a, reason: collision with root package name */
    public final int f32435a;

    public a1(int i10) {
        this.f32435a = i10;
    }

    public static /* bridge */ /* synthetic */ Status e(RemoteException remoteException) {
        return new Status(19, remoteException.getClass().getSimpleName() + ": " + remoteException.getLocalizedMessage());
    }

    public abstract void a(Status status);

    public abstract void b(Exception exc);

    public abstract void c(C3147o0 c3147o0);

    public abstract void d(D d10, boolean z10);
}
