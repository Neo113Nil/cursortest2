package t6;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import java.util.Objects;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.R;
import ru.ozon.fintech.wallet.manager.domain.mpay.a;
import t6.C9772g;
import v6.ServiceConnectionC10259c;

/* renamed from: t6.e, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C9770e {

    /* renamed from: t6.e$a */
    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f99211a;

        static {
            int[] iArr = new int[EnumC9766a.values().length];
            f99211a = iArr;
            try {
                iArr[EnumC9766a.ERROR_MIRPAY_INVALID_DATA.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f99211a[EnumC9766a.ERROR_MIRPAY_CONFLICT_DATA.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f99211a[EnumC9766a.ERROR_MIRPAY_CARD_EXPIRED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f99211a[EnumC9766a.ERROR_MIRPAY_NOT_SUPPORTED_CARD.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f99211a[EnumC9766a.ERROR_MIRPAY_REJECTED_BY_ISSUER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f99211a[EnumC9766a.ERROR_MIRPAY_ACCESS_DENIED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f99211a[EnumC9766a.ERROR_MIRPAY_INTERNAL_ERROR.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* renamed from: t6.e$b */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        private final C9772g.b f99212a;

        /* renamed from: b, reason: collision with root package name */
        private final String f99213b;

        b(String str, C9772g.b bVar) {
            this.f99212a = bVar;
            this.f99213b = str;
        }

        public final C9772g.b a() {
            return this.f99212a;
        }

        public final String b() {
            return this.f99213b;
        }
    }

    public static /* synthetic */ void a(Context context, ServiceConnectionC10259c.InterfaceC2223c interfaceC2223c, a.b bVar) {
        try {
            c(context, interfaceC2223c);
        } catch (C9772g e11) {
            bVar.b(e11);
        }
    }

    public static void b(Context context, String str, a.b bVar) {
        new Handler(Looper.getMainLooper()).post(new com.appsflyer.internal.b(context, new C9769d(str, bVar), bVar));
    }

    private static void c(Context context, ServiceConnectionC10259c.InterfaceC2223c interfaceC2223c) throws C9772g {
        try {
            if (context.bindService(new Intent().setClassName(context.getString(R.string.remote_service_package_name), "com.ekassir.mirpay.app.services.SdkHostService"), new ServiceConnectionC10259c(context, interfaceC2223c), 1)) {
            } else {
                throw new C9772g("Failed to bind remote service", C9772g.b.INTERNAL_ERROR);
            }
        } catch (SecurityException e11) {
            throw new C9772g("Failed to bind remote service", C9772g.b.INTERNAL_ERROR, e11);
        }
    }

    public static b d(@NotNull Intent intent) throws C9772g {
        EnumC9766a a11;
        C9772g.b bVar;
        String str;
        Objects.requireNonNull(intent);
        String stringExtra = intent.getStringExtra("status");
        C9772g.b bVar2 = null;
        if (stringExtra == null || (a11 = EnumC9766a.a(stringExtra)) == EnumC9766a.MIRPAY_CANCELLED) {
            return null;
        }
        if (a11 == EnumC9766a.MIRPAY_SUCCESS) {
            str = intent.getStringExtra("referenceId");
            if (str == null) {
                throw new C9772g("Enrollment ended with success, but no referenceId was returned", C9772g.b.INTERNAL_ERROR);
            }
        } else {
            switch (a.f99211a[a11.ordinal()]) {
                case 1:
                    bVar = C9772g.b.INVALID_DATA;
                    break;
                case 2:
                    bVar = C9772g.b.CONFLICT_DATA;
                    break;
                case 3:
                    bVar = C9772g.b.CARD_EXPIRED;
                    break;
                case 4:
                    bVar = C9772g.b.NOT_SUPPORTED_CARD;
                    break;
                case 5:
                    bVar = C9772g.b.REJECTED_BY_ISSUER;
                    break;
                case 6:
                    bVar = C9772g.b.ACCESS_DENIED;
                    break;
                case 7:
                    bVar = C9772g.b.INTERNAL_ERROR;
                    break;
                default:
                    throw new C9772g("Failed to convert to error type: " + a11, C9772g.b.INTERNAL_ERROR);
            }
            bVar2 = bVar;
            str = null;
        }
        return new b(str, bVar2);
    }
}
