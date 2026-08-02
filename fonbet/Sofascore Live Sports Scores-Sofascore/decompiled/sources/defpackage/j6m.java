package defpackage;

import android.database.Cursor;
import android.os.CancellationSignal;
import com.blaze.blazesdk.features.moments.models.local.MomentLikedStatus;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class j6m extends frl {
    public final k6g a;
    public final hvl b;
    public final jzl c;
    public final e3m d;

    public j6m(k6g k6gVar) {
        this.a = k6gVar;
        this.b = new hvl(k6gVar);
        this.c = new jzl(k6gVar);
        this.d = new e3m(k6gVar);
    }

    @Override // defpackage.frl
    public final int a(String str, boolean z) {
        k6g k6gVar = this.a;
        k6gVar.assertNotSuspendingTransaction();
        jzl jzlVar = this.c;
        mni a = jzlVar.a();
        a.q(1, z ? 1L : 0L);
        if (str == null) {
            a.s(2);
        } else {
            a.m0(2, str);
        }
        k6gVar.beginTransaction();
        try {
            int F = a.F();
            k6gVar.setTransactionSuccessful();
            return F;
        } finally {
            k6gVar.endTransaction();
            jzlVar.m(a);
        }
    }

    @Override // defpackage.frl
    public final long b(MomentLikedStatus momentLikedStatus) {
        k6g k6gVar = this.a;
        k6gVar.assertNotSuspendingTransaction();
        k6gVar.beginTransaction();
        try {
            long z = this.b.z(momentLikedStatus);
            k6gVar.setTransactionSuccessful();
            return z;
        } finally {
            k6gVar.endTransaction();
        }
    }

    @Override // defpackage.frl
    public final void c() {
        k6g k6gVar = this.a;
        k6gVar.assertNotSuspendingTransaction();
        e3m e3mVar = this.d;
        mni a = e3mVar.a();
        k6gVar.beginTransaction();
        try {
            a.F();
            k6gVar.setTransactionSuccessful();
        } finally {
            k6gVar.endTransaction();
            e3mVar.m(a);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x001f, code lost:
    
        if (r3.getInt(0) != 0) goto L11;
     */
    @Override // defpackage.frl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean d(String str) {
        boolean z = true;
        r6g e = r6g.e(1, "SELECT is_liked FROM moments_liked_status WHERE moment_id == ?");
        e.m0(1, str);
        k6g k6gVar = this.a;
        k6gVar.assertNotSuspendingTransaction();
        Cursor query = k6gVar.query(e, (CancellationSignal) null);
        try {
            if (query.moveToFirst()) {
            }
            z = false;
            return z;
        } finally {
            query.close();
            e.release();
        }
    }
}
