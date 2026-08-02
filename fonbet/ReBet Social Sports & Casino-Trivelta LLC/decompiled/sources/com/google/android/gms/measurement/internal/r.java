package com.google.android.gms.measurement.internal;

import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import com.google.android.gms.common.internal.AbstractC3191o;
import com.google.android.gms.internal.measurement.zzhr;
import com.google.android.gms.internal.measurement.zzhs;
import com.twilio.voice.EventKeys;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public final String f34257a;

    /* renamed from: b, reason: collision with root package name */
    public long f34258b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C3357t f34259c;

    public r(C3357t c3357t, String str) {
        Objects.requireNonNull(c3357t);
        this.f34259c = c3357t;
        AbstractC3191o.g(str);
        this.f34257a = str;
        this.f34258b = -1L;
    }

    public final List a() {
        List arrayList = new ArrayList();
        Cursor cursor = null;
        try {
            try {
                cursor = this.f34259c.u0().query("raw_events", new String[]{"rowid", "name", EventKeys.TIMESTAMP, "metadata_fingerprint", EventKeys.DATA, "realtime"}, "app_id = ? and rowid > ?", new String[]{this.f34257a, String.valueOf(this.f34258b)}, null, null, "rowid", "1000");
                if (cursor.moveToFirst()) {
                    do {
                        long j10 = cursor.getLong(0);
                        long j11 = cursor.getLong(3);
                        boolean z10 = cursor.getLong(5) == 1;
                        byte[] blob = cursor.getBlob(4);
                        if (j10 > this.f34258b) {
                            this.f34258b = j10;
                        }
                        try {
                            zzhr zzhrVar = (zzhr) X6.W(zzhs.zzk(), blob);
                            String string = cursor.getString(1);
                            if (string == null) {
                                string = "";
                            }
                            zzhrVar.zzl(string);
                            zzhrVar.zzo(cursor.getLong(2));
                            arrayList.add(new C3334q(j10, j11, z10, (zzhs) zzhrVar.zzbc()));
                        } catch (IOException e10) {
                            this.f34259c.f33578a.a().o().c("Data loss. Failed to merge raw event. appId", C3392x2.x(this.f34257a), e10);
                        }
                    } while (cursor.moveToNext());
                } else {
                    arrayList = Collections.EMPTY_LIST;
                }
            } catch (SQLiteException e11) {
                this.f34259c.f33578a.a().o().c("Data loss. Error querying raw events batch. appId", C3392x2.x(this.f34257a), e11);
            }
            return arrayList;
        } finally {
            if (0 != 0) {
                cursor.close();
            }
        }
    }

    public r(C3357t c3357t, String str, long j10) {
        Objects.requireNonNull(c3357t);
        this.f34259c = c3357t;
        AbstractC3191o.g(str);
        this.f34257a = str;
        this.f34258b = c3357t.b0("select rowid from raw_events where app_id = ? and timestamp < ? order by rowid desc limit 1", new String[]{str, String.valueOf(j10)}, -1L);
    }
}
