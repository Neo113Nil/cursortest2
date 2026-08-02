package com.google.android.gms.measurement.internal;

import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.zzhr;
import com.google.android.gms.internal.measurement.zzhs;
import defpackage.hkn;
import defpackage.tjn;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzau {
    public final String a;
    public long b;
    public final /* synthetic */ hkn c;

    public zzau(hkn hknVar, String str, long j) {
        this.c = hknVar;
        Preconditions.f(str);
        this.a = str;
        this.b = hknVar.n0("select rowid from raw_events where app_id = ? and timestamp < ? order by rowid desc limit 1", new String[]{str, String.valueOf(j)}, -1L);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.util.List] */
    public final List a() {
        ArrayList arrayList;
        hkn hknVar = this.c;
        zzic zzicVar = (zzic) hknVar.b;
        ArrayList arrayList2 = new ArrayList();
        String valueOf = String.valueOf(this.b);
        String str = this.a;
        String[] strArr = {str, valueOf};
        Cursor cursor = null;
        try {
            try {
                cursor = hknVar.H0().query("raw_events", new String[]{"rowid", "name", "timestamp", "metadata_fingerprint", "data", "realtime", "elapsed_time"}, "app_id = ? and rowid > ?", strArr, null, null, "rowid", "1000");
                if (cursor.moveToFirst()) {
                    do {
                        long j = cursor.getLong(0);
                        long j2 = cursor.getLong(3);
                        boolean z = cursor.getLong(5) == 1;
                        long j3 = cursor.getLong(6);
                        byte[] blob = cursor.getBlob(4);
                        if (j > this.b) {
                            this.b = j;
                        }
                        try {
                            zzhr zzhrVar = (zzhr) zzpk.B0(zzhs.O(), blob);
                            String string = cursor.getString(1);
                            if (string == null) {
                                string = "";
                            }
                            zzhrVar.w(string);
                            long j4 = cursor.getLong(2);
                            zzhrVar.k();
                            ((zzhs) zzhrVar.b).V(j4);
                            zzhrVar.k();
                            ((zzhs) zzhrVar.b).y(j3);
                            arrayList2.add(new tjn(j, j2, z, (zzhs) zzhrVar.m()));
                        } catch (IOException e) {
                            zzgu zzguVar = zzicVar.f;
                            zzic.m(zzguVar);
                            zzguVar.g.c(zzgu.U(str), e, "Data loss. Failed to merge raw event. appId");
                        }
                    } while (cursor.moveToNext());
                } else {
                    arrayList = Collections.EMPTY_LIST;
                }
            } catch (SQLiteException e2) {
                zzgu zzguVar2 = zzicVar.f;
                zzic.m(zzguVar2);
                zzguVar2.g.c(zzgu.U(str), e2, "Data loss. Error querying raw events batch. appId");
                arrayList = arrayList2;
            }
            return arrayList;
        } finally {
            if (0 != 0) {
                cursor.close();
            }
        }
    }

    public zzau(hkn hknVar, String str) {
        this.c = hknVar;
        Preconditions.f(str);
        this.a = str;
        this.b = -1L;
    }
}
