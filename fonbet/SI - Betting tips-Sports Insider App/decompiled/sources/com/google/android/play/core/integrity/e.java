package com.google.android.play.core.integrity;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import d8.m;
import d8.n;
import d8.o;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class e extends o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ byte[] f6030b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Long f6031c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ w7.g f6032d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ IntegrityTokenRequest f6033e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ g f6034f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(g gVar, w7.g gVar2, byte[] bArr, Long l6, w7.g gVar3, IntegrityTokenRequest integrityTokenRequest) {
        super(gVar2);
        this.f6034f = gVar;
        this.f6030b = bArr;
        this.f6031c = l6;
        this.f6032d = gVar3;
        this.f6033e = integrityTokenRequest;
    }

    @Override // d8.o
    public final void a(Exception exc) {
        if (exc instanceof d8.d) {
            super.a(new a(-9, exc));
        } else {
            super.a(exc);
        }
    }

    @Override // d8.o
    public final void b() {
        w7.g gVar = this.f6032d;
        g gVar2 = this.f6034f;
        try {
            m mVar = gVar2.f6041d.f8292n;
            Bundle a7 = g.a(gVar2, this.f6030b, this.f6031c);
            f fVar = new f(gVar2, gVar);
            d8.k kVar = (d8.k) mVar;
            kVar.getClass();
            Parcel obtain = Parcel.obtain();
            obtain.writeInterfaceToken("com.google.android.play.core.integrity.protocol.IIntegrityService");
            int i5 = d8.i.f8297a;
            obtain.writeInt(1);
            a7.writeToParcel(obtain, 0);
            obtain.writeStrongBinder(fVar);
            try {
                kVar.f8299a.transact(2, obtain, null, 1);
            } finally {
                obtain.recycle();
            }
        } catch (RemoteException e7) {
            n nVar = gVar2.f6038a;
            Object[] objArr = {this.f6033e};
            nVar.getClass();
            if (Log.isLoggable("PlayCore", 6)) {
                Log.e("PlayCore", n.b(nVar.f8301a, "requestIntegrityToken(%s)", objArr), e7);
            }
            gVar.c(new a(-100, e7));
        }
    }
}
