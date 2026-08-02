package com.vk.movika.sdk.base.ui;

import android.database.sqlite.SQLiteDoneException;
import android.database.sqlite.SQLiteStatement;
import android.os.SystemClock;
import com.vk.metrics.eventtracking.Event;
import com.vk.movika.sdk.base.model.Chapter;
import com.vk.stat.model.DevNullEventKey;
import com.vk.stat.scheme.SchemeStat$TypeDevNullItem;
import xsna.gzs;
import xsna.hrr0;
import xsna.k1q;
import xsna.l5m;
import xsna.s3q0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class h implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ long c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ h(long j, Object obj, Object obj2, int i) {
        this.b = i;
        this.d = obj;
        this.e = obj2;
        this.c = j;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        switch (this.b) {
            case 0:
                y yVar = (y) this.d;
                Chapter chapter = (Chapter) this.e;
                yVar.v(chapter.d, this.c);
                return s3q0.a;
            case 1:
                k1q k1qVar = (k1q) this.d;
                Event event = (Event) this.e;
                long j = this.c;
                SQLiteStatement sQLiteStatement = (SQLiteStatement) k1qVar.j.getValue();
                sQLiteStatement.clearBindings();
                boolean z = true;
                sQLiteStatement.bindString(1, event.a.c);
                sQLiteStatement.bindLong(2, k1qVar.e);
                sQLiteStatement.bindLong(3, j);
                try {
                    if (sQLiteStatement.simpleQueryForString() != null) {
                        z = false;
                    }
                } catch (SQLiteDoneException unused) {
                }
                return Boolean.valueOf(z);
            default:
                hrr0 hrr0Var = (hrr0) this.d;
                long j2 = this.c;
                String str = (String) this.e;
                if (hrr0Var.a) {
                    return s3q0.a;
                }
                hrr0Var.a = true;
                long elapsedRealtime = SystemClock.elapsedRealtime() - j2;
                l5m l5mVar = new l5m(null, null, 3);
                l5mVar.g = new SchemeStat$TypeDevNullItem(DevNullEventKey.CATALOG_VH_FIRST_DRAW_DURATION.h(), null, String.valueOf(elapsedRealtime), null, str, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -22, 3, null);
                l5mVar.q();
                return s3q0.a;
        }
    }

    public /* synthetic */ h(hrr0 hrr0Var, long j, String str) {
        this.b = 2;
        this.d = hrr0Var;
        this.c = j;
        this.e = str;
    }
}
