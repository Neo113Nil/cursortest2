package io.appmetrica.analytics.identifiers.impl;

import android.content.Context;
import android.content.Intent;
import android.os.Parcel;
import io.appmetrica.analytics.coreapi.internal.identifiers.IdentifierStatus;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class q implements b {

    /* renamed from: a, reason: collision with root package name */
    public final f f11821a;

    public q(@NotNull f fVar) {
        this.f11821a = fVar;
    }

    @Override // io.appmetrica.analytics.identifiers.impl.b
    @NotNull
    public final c a(@NotNull Context context) {
        c cVar;
        try {
            try {
                try {
                    try {
                        c b10 = b(context);
                        try {
                            this.f11821a.b(context);
                            return b10;
                        } catch (Throwable unused) {
                            return b10;
                        }
                    } catch (g e7) {
                        String message = e7.getMessage();
                        if (message == null) {
                            message = "unknown exception while binding yandex adv_id service";
                        }
                        cVar = new c(IdentifierStatus.IDENTIFIER_PROVIDER_UNAVAILABLE, null, message, 2);
                        this.f11821a.b(context);
                        return cVar;
                    }
                } catch (l e9) {
                    String message2 = e9.getMessage();
                    if (message2 == null) {
                        message2 = "No yandex adv_id service";
                    }
                    cVar = new c(IdentifierStatus.IDENTIFIER_PROVIDER_UNAVAILABLE, null, message2, 2);
                    this.f11821a.b(context);
                    return cVar;
                } catch (Throwable th2) {
                    return new c(IdentifierStatus.UNKNOWN, null, "exception while fetching yandex adv_id: " + th2.getMessage(), 2);
                }
            } catch (Throwable unused2) {
                return cVar;
            }
        } finally {
            try {
                this.f11821a.b(context);
            } catch (Throwable unused3) {
            }
        }
    }

    public final c b(Context context) {
        s sVar = (s) ((u) this.f11821a.a(context));
        sVar.getClass();
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.yandex.android.advid.service.YandexAdvIdInterface");
            sVar.f11823a.transact(1, obtain, obtain2, 0);
            obtain2.readException();
            String readString = obtain2.readString();
            obtain2.recycle();
            obtain.recycle();
            obtain = Parcel.obtain();
            obtain2 = Parcel.obtain();
            try {
                obtain.writeInterfaceToken("com.yandex.android.advid.service.YandexAdvIdInterface");
                sVar.f11823a.transact(2, obtain, obtain2, 0);
                obtain2.readException();
                boolean z5 = obtain2.readInt() != 0;
                obtain2.recycle();
                obtain.recycle();
                return new c(IdentifierStatus.OK, new a("yandex", readString, Boolean.valueOf(z5)), null, 4);
            } finally {
            }
        } finally {
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public q() {
        this(new f(r1, p.f11820a, "yandex"));
        Intent intent;
        intent = r.f11822a;
    }
}
