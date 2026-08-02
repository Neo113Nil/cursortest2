package nm0;

import Ve.Dr;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.auth.api.proxy.AuthApiStatusCodes;
import kotlin.jvm.internal.Intrinsics;
import ru.rustore.sdk.review.errors.RuStoreInvalidReviewInfo;
import ru.rustore.sdk.review.errors.RuStoreRequestLimitReached;
import ru.rustore.sdk.review.errors.RuStoreReviewExists;
import ru.rustore.sdk.review.model.ReviewInfo;
import wl0.C10568a;
import zl0.C11151b;

/* loaded from: classes4.dex */
public abstract class n extends Binder implements IInterface {
    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i11, Parcel parcel, Parcel parcel2, int i12) {
        Object gVar;
        if (i11 >= 1 && i11 <= 16777215) {
            parcel.enforceInterface("ru.vk.store.provider.review.RequestReviewFlowCallback");
        }
        if (i11 == 1598968902) {
            parcel2.writeString("ru.vk.store.provider.review.RequestReviewFlowCallback");
            return true;
        }
        if (i11 == 1) {
            Bundle reviewInfo = (Bundle) (parcel.readInt() != 0 ? Bundle.CREATOR.createFromParcel(parcel) : null);
            Intrinsics.checkNotNullParameter(reviewInfo, "reviewInfo");
            o oVar = o.this;
            oVar.f77412c.invoke(new ReviewInfo(reviewInfo));
            C11151b.b(oVar.f77410a, oVar);
        } else {
            if (i11 != 2) {
                return super.onTransact(i11, parcel, parcel2, i12);
            }
            int readInt = parcel.readInt();
            String readString = parcel.readString();
            o oVar2 = o.this;
            Dr dr = oVar2.f77413d;
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
            dr.invoke(gVar);
            C11151b.b(oVar2.f77410a, oVar2);
        }
        parcel2.writeNoException();
        return true;
    }
}
