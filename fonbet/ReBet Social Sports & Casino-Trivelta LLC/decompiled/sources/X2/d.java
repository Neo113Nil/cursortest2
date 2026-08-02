package X2;

import android.database.Cursor;
import androidx.room.A;
import androidx.room.w;
import androidx.work.impl.model.Preference;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class d implements c {

    /* renamed from: a, reason: collision with root package name */
    public final w f13421a;

    /* renamed from: b, reason: collision with root package name */
    public final androidx.room.k f13422b;

    public class a extends androidx.room.k {
        public a(w wVar) {
            super(wVar);
        }

        @Override // androidx.room.G
        public String createQuery() {
            return "INSERT OR REPLACE INTO `Preference` (`key`,`long_value`) VALUES (?,?)";
        }

        @Override // androidx.room.k
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public void bind(E2.k kVar, Preference preference) {
            kVar.P0(1, preference.getKey());
            if (preference.getValue() == null) {
                kVar.C1(2);
            } else {
                kVar.h1(2, preference.getValue().longValue());
            }
        }
    }

    public d(w wVar) {
        this.f13421a = wVar;
        this.f13422b = new a(wVar);
    }

    public static List c() {
        return Collections.EMPTY_LIST;
    }

    @Override // X2.c
    public void a(Preference preference) {
        this.f13421a.assertNotSuspendingTransaction();
        this.f13421a.beginTransaction();
        try {
            this.f13422b.e(preference);
            this.f13421a.setTransactionSuccessful();
        } finally {
            this.f13421a.endTransaction();
        }
    }

    @Override // X2.c
    public Long b(String str) {
        A r10 = A.r("SELECT long_value FROM Preference where `key`=?", 1);
        r10.P0(1, str);
        this.f13421a.assertNotSuspendingTransaction();
        Long l10 = null;
        Cursor c10 = A2.b.c(this.f13421a, r10, false, null);
        try {
            if (c10.moveToFirst() && !c10.isNull(0)) {
                l10 = Long.valueOf(c10.getLong(0));
            }
            return l10;
        } finally {
            c10.close();
            r10.U();
        }
    }
}
