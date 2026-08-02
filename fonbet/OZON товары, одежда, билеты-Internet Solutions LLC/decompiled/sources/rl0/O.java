package rl0;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import rl0.S;
import ru.rustore.sdk.appupdate.errors.RemoteProviderErrors;
import zl0.C11151b;

/* loaded from: classes4.dex */
public abstract class O extends Binder implements IInterface {
    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i11, Parcel parcel, Parcel parcel2, int i12) {
        if (i11 >= 1 && i11 <= 16777215) {
            parcel.enforceInterface("ru.vk.store.provider.appupdate.CompleteUpdateFlowCallback");
        }
        if (i11 == 1598968902) {
            parcel2.writeString("ru.vk.store.provider.appupdate.CompleteUpdateFlowCallback");
            return true;
        }
        if (i11 == 1) {
            S.a aVar = (S.a) this;
            S s11 = S.this;
            ((lm0.e) s11.f83638c.f77397c).b(Unit.f71690a);
            C11151b.b(s11.f83636a, aVar.f83641f);
            parcel2.writeNoException();
            return true;
        }
        if (i11 != 2) {
            return super.onTransact(i11, parcel, parcel2, i12);
        }
        int readInt = parcel.readInt();
        String errorMessage = parcel.readString();
        S.a aVar2 = (S.a) this;
        Intrinsics.checkNotNullParameter(errorMessage, "errorMessage");
        S s12 = S.this;
        d0 d0Var = s12.f83639d;
        wl0.c error = RemoteProviderErrors.INSTANCE.toRuStoreException(readInt, errorMessage);
        Intrinsics.checkNotNullParameter(error, "error");
        d0Var.f83675b.a(error);
        Unit unit = Unit.f71690a;
        C11151b.b(s12.f83636a, aVar2.f83641f);
        parcel2.writeNoException();
        return true;
    }
}
