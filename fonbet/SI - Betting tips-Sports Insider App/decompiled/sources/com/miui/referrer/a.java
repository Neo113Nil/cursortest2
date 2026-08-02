package com.miui.referrer;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import com.miui.referrer.IGetAppsReferrerService;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class a implements IGetAppsReferrerService {

    /* renamed from: f, reason: collision with root package name */
    public static IGetAppsReferrerService f6828f;

    /* renamed from: a, reason: collision with root package name */
    public IBinder f6829a;

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f6829a;
    }

    @Override // com.miui.referrer.IGetAppsReferrerService
    public final Bundle referrerBundle(Bundle bundle) {
        Bundle bundle2;
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.miui.referrer.IGetAppsReferrerService");
            if (bundle != null) {
                obtain.writeInt(1);
                bundle.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            if (this.f6829a.transact(1, obtain, obtain2, 0) || IGetAppsReferrerService.Stub.getDefaultImpl() == null) {
                obtain2.readException();
                bundle2 = obtain2.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(obtain2) : null;
            } else {
                bundle2 = IGetAppsReferrerService.Stub.getDefaultImpl().referrerBundle(bundle);
            }
            obtain2.recycle();
            obtain.recycle();
            return bundle2;
        } catch (Throwable th2) {
            obtain2.recycle();
            obtain.recycle();
            throw th2;
        }
    }
}
