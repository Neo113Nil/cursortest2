package rl0;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import java.util.Date;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import rl0.X;
import ru.rustore.sdk.appupdate.errors.RemoteProviderErrors;
import ru.rustore.sdk.appupdate.model.AppUpdateInfo;
import zl0.C11151b;

/* loaded from: classes4.dex */
public abstract class V extends Binder implements IInterface {
    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i11, Parcel parcel, Parcel parcel2, int i12) {
        if (i11 >= 1 && i11 <= 16777215) {
            parcel.enforceInterface("ru.vk.store.provider.appupdate.GetAppUpdateInfoCallback");
        }
        if (i11 == 1598968902) {
            parcel2.writeString("ru.vk.store.provider.appupdate.GetAppUpdateInfoCallback");
            return true;
        }
        if (i11 != 1) {
            if (i11 != 2) {
                return super.onTransact(i11, parcel, parcel2, i12);
            }
            int readInt = parcel.readInt();
            String errorMessage = parcel.readString();
            X.a aVar = (X.a) this;
            Intrinsics.checkNotNullParameter(errorMessage, "errorMessage");
            X x11 = X.this;
            C9292c c9292c = x11.f83653f;
            wl0.c error = RemoteProviderErrors.INSTANCE.toRuStoreException(readInt, errorMessage);
            Intrinsics.checkNotNullParameter(error, "error");
            c9292c.f83671b.a(error);
            Unit unit = Unit.f71690a;
            C11151b.b(x11.f83648a, aVar.f83655f);
            parcel2.writeNoException();
            return true;
        }
        Bundle bundle = (Bundle) (parcel.readInt() != 0 ? Bundle.CREATOR.createFromParcel(parcel) : null);
        X.a aVar2 = (X.a) this;
        Intrinsics.checkNotNullParameter(bundle, "updateInfoBundle");
        X x12 = X.this;
        Q q11 = x12.f83649b;
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        long j11 = bundle.getLong("APPLICATION_ID", 0L);
        String string = bundle.getString("APP_NAME");
        String str = string == null ? "" : string;
        String string2 = bundle.getString("ICON_URL");
        String str2 = string2 == null ? "" : string2;
        long j12 = bundle.getLong("FILE_SIZE", 0L);
        String string3 = bundle.getString("PACKAGE_NAME");
        String str3 = string3 == null ? "" : string3;
        String string4 = bundle.getString("AVAILABLE_VERSION_NAME");
        String str4 = string4 == null ? "" : string4;
        long j13 = bundle.getLong("AVAILABLE_VERSION_CODE_LONG", bundle.getInt("AVAILABLE_VERSION_CODE"));
        int i13 = bundle.getInt("INSTALL_STATUS", 0);
        int i14 = bundle.getInt("UPDATE_AVAILABILITY", 0);
        int f7 = kotlin.ranges.h.f(bundle.getInt("UPDATE_PRIORITY", 0), new IntRange(0, 5, 1));
        Date time = q11.f83635b.f83644a.getTime();
        Intrinsics.checkNotNullExpressionValue(time, "calendar.time");
        String string5 = bundle.getString("UPDATED_AT", time.toString());
        Intrinsics.checkNotNullExpressionValue(string5, "bundle.getString(\n      …w().toString(),\n        )");
        String string6 = bundle.getString("whatsNew");
        AppUpdateInfo appUpdateInfo = q11.f83634a.create$sdk_public_appupdate_release(j11, str, str2, j12, str3, str4, j13, i13, i14, f7, string5, string6 == null ? "" : string6);
        C9290a c9290a = x12.f83652e;
        Intrinsics.checkNotNullParameter(appUpdateInfo, "appUpdateInfo");
        c9290a.f83664b.b(appUpdateInfo);
        Unit unit2 = Unit.f71690a;
        C11151b.b(x12.f83648a, aVar2.f83655f);
        parcel2.writeNoException();
        return true;
    }
}
