package nm0;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.auth.api.proxy.AuthApiStatusCodes;
import ru.rustore.sdk.review.errors.RuStoreInvalidReviewInfo;
import ru.rustore.sdk.review.errors.RuStoreRequestLimitReached;
import ru.rustore.sdk.review.errors.RuStoreReviewExists;
import wl0.C10568a;
import zl0.C11151b;

/* loaded from: classes4.dex */
public abstract class k extends Binder implements IInterface {
    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i11, Parcel parcel, Parcel parcel2, int i12) {
        Object gVar;
        if (i11 >= 1 && i11 <= 16777215) {
            parcel.enforceInterface("ru.vk.store.provider.review.LaunchReviewFlowCallback");
        }
        if (i11 == 1598968902) {
            parcel2.writeString("ru.vk.store.provider.review.LaunchReviewFlowCallback");
            return true;
        }
        if (i11 == 1) {
            j jVar = j.this;
            jVar.f77404d.invoke();
            C11151b.b(jVar.f77401a, jVar);
        } else {
            if (i11 != 2) {
                return super.onTransact(i11, parcel, parcel2, i12);
            }
            int readInt = parcel.readInt();
            String readString = parcel.readString();
            j jVar2 = j.this;
            w wVar = jVar2.f77405e;
            if (readInt == 1001) {
                gVar = new wl0.g();
            } else if (readInt == 1004) {
                gVar = new wl0.f();
            } else if (readInt != 1005) {
                switch (readInt) {
                    case AuthApiStatusCodes.AUTH_API_ACCESS_FORBIDDEN /* 3001 */:
                        gVar = new RuStoreRequestLimitReached();
                        break;
                    case AuthApiStatusCodes.AUTH_API_CLIENT_ERROR /* 3002 */:
                        gVar = new RuStoreReviewExists();
                        break;
                    case AuthApiStatusCodes.AUTH_API_SERVER_ERROR /* 3003 */:
                        gVar = new RuStoreInvalidReviewInfo();
                        break;
                    default:
                        if (readString == null) {
                            readString = "";
                        }
                        gVar = new wl0.c(readString);
                        break;
                }
            } else {
                gVar = new C10568a();
            }
            wVar.invoke(gVar);
            C11151b.b(jVar2.f77401a, jVar2);
        }
        parcel2.writeNoException();
        return true;
    }
}
