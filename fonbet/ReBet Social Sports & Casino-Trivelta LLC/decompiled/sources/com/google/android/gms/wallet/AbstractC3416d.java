package com.google.android.gms.wallet;

import android.accounts.Account;
import android.content.Context;
import com.google.android.gms.common.api.C3117a;
import com.google.android.gms.common.internal.AbstractC3189m;
import com.google.android.gms.internal.wallet.zzab;
import com.google.android.gms.internal.wallet.zzr;
import com.google.android.gms.internal.wallet.zzz;
import ha.InterfaceC4492a;
import java.util.Locale;

/* renamed from: com.google.android.gms.wallet.d, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC3416d {

    /* renamed from: a, reason: collision with root package name */
    public static final C3117a f34612a;

    /* renamed from: b, reason: collision with root package name */
    public static final C3117a.g f34613b;

    /* renamed from: c, reason: collision with root package name */
    public static final C3117a.AbstractC0488a f34614c;

    /* renamed from: d, reason: collision with root package name */
    public static final InterfaceC4492a f34615d;

    /* renamed from: e, reason: collision with root package name */
    public static final zzr f34616e;

    /* renamed from: f, reason: collision with root package name */
    public static final zzz f34617f;

    /* renamed from: com.google.android.gms.wallet.d$a */
    public static final class a implements C3117a.d.InterfaceC0489a {

        /* renamed from: a, reason: collision with root package name */
        public final int f34618a;

        /* renamed from: b, reason: collision with root package name */
        public final int f34619b;

        /* renamed from: c, reason: collision with root package name */
        public final Account f34620c;

        /* renamed from: d, reason: collision with root package name */
        public final boolean f34621d;

        /* renamed from: com.google.android.gms.wallet.d$a$a, reason: collision with other inner class name */
        public static final class C0493a {

            /* renamed from: a, reason: collision with root package name */
            public int f34622a = 3;

            /* renamed from: b, reason: collision with root package name */
            public int f34623b = 1;

            /* renamed from: c, reason: collision with root package name */
            public boolean f34624c = true;

            public a a() {
                return new a(this);
            }

            public C0493a b(int i10) {
                if (i10 != 0) {
                    if (i10 == 0) {
                        i10 = 0;
                    } else if (i10 != 2 && i10 != 1 && i10 != 23 && i10 != 3) {
                        throw new IllegalArgumentException(String.format(Locale.US, "Invalid environment value %d", Integer.valueOf(i10)));
                    }
                }
                this.f34622a = i10;
                return this;
            }
        }

        public a(C0493a c0493a) {
            this.f34618a = c0493a.f34622a;
            this.f34619b = c0493a.f34623b;
            this.f34621d = c0493a.f34624c;
            this.f34620c = null;
        }

        public boolean equals(Object obj) {
            if (obj instanceof a) {
                a aVar = (a) obj;
                if (AbstractC3189m.b(Integer.valueOf(this.f34618a), Integer.valueOf(aVar.f34618a)) && AbstractC3189m.b(Integer.valueOf(this.f34619b), Integer.valueOf(aVar.f34619b)) && AbstractC3189m.b(null, null) && AbstractC3189m.b(Boolean.valueOf(this.f34621d), Boolean.valueOf(aVar.f34621d))) {
                    return true;
                }
            }
            return false;
        }

        @Override // com.google.android.gms.common.api.C3117a.d.InterfaceC0489a
        public Account getAccount() {
            return null;
        }

        public int hashCode() {
            return AbstractC3189m.c(Integer.valueOf(this.f34618a), Integer.valueOf(this.f34619b), null, Boolean.valueOf(this.f34621d));
        }
    }

    static {
        C3117a.g gVar = new C3117a.g();
        f34613b = gVar;
        o oVar = new o();
        f34614c = oVar;
        f34612a = new C3117a("Wallet.API", oVar, gVar);
        f34616e = new zzr();
        f34615d = new zzab();
        f34617f = new zzz();
    }

    public static C3415c a(Context context, a aVar) {
        return new C3415c(context, aVar);
    }
}
