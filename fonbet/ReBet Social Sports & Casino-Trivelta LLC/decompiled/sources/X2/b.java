package X2;

import android.database.Cursor;
import androidx.room.A;
import androidx.room.w;
import androidx.work.impl.model.Dependency;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class b implements X2.a {

    /* renamed from: a, reason: collision with root package name */
    public final w f13418a;

    /* renamed from: b, reason: collision with root package name */
    public final androidx.room.k f13419b;

    public class a extends androidx.room.k {
        public a(w wVar) {
            super(wVar);
        }

        @Override // androidx.room.G
        public String createQuery() {
            return "INSERT OR IGNORE INTO `Dependency` (`work_spec_id`,`prerequisite_id`) VALUES (?,?)";
        }

        @Override // androidx.room.k
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public void bind(E2.k kVar, Dependency dependency) {
            kVar.P0(1, dependency.getWorkSpecId());
            kVar.P0(2, dependency.getPrerequisiteId());
        }
    }

    public b(w wVar) {
        this.f13418a = wVar;
        this.f13419b = new a(wVar);
    }

    public static List e() {
        return Collections.EMPTY_LIST;
    }

    @Override // X2.a
    public void a(Dependency dependency) {
        this.f13418a.assertNotSuspendingTransaction();
        this.f13418a.beginTransaction();
        try {
            this.f13419b.e(dependency);
            this.f13418a.setTransactionSuccessful();
        } finally {
            this.f13418a.endTransaction();
        }
    }

    @Override // X2.a
    public List b(String str) {
        A r10 = A.r("SELECT work_spec_id FROM dependency WHERE prerequisite_id=?", 1);
        r10.P0(1, str);
        this.f13418a.assertNotSuspendingTransaction();
        Cursor c10 = A2.b.c(this.f13418a, r10, false, null);
        try {
            ArrayList arrayList = new ArrayList(c10.getCount());
            while (c10.moveToNext()) {
                arrayList.add(c10.getString(0));
            }
            return arrayList;
        } finally {
            c10.close();
            r10.U();
        }
    }

    @Override // X2.a
    public boolean c(String str) {
        A r10 = A.r("SELECT COUNT(*)=0 FROM dependency WHERE work_spec_id=? AND prerequisite_id IN (SELECT id FROM workspec WHERE state!=2)", 1);
        r10.P0(1, str);
        this.f13418a.assertNotSuspendingTransaction();
        boolean z10 = false;
        Cursor c10 = A2.b.c(this.f13418a, r10, false, null);
        try {
            if (c10.moveToFirst()) {
                z10 = c10.getInt(0) != 0;
            }
            return z10;
        } finally {
            c10.close();
            r10.U();
        }
    }

    @Override // X2.a
    public boolean d(String str) {
        A r10 = A.r("SELECT COUNT(*)>0 FROM dependency WHERE prerequisite_id=?", 1);
        r10.P0(1, str);
        this.f13418a.assertNotSuspendingTransaction();
        boolean z10 = false;
        Cursor c10 = A2.b.c(this.f13418a, r10, false, null);
        try {
            if (c10.moveToFirst()) {
                z10 = c10.getInt(0) != 0;
            }
            return z10;
        } finally {
            c10.close();
            r10.U();
        }
    }
}
