package com.google.gson.internal.sql;

import com.google.gson.j;
import com.google.gson.r;
import com.google.gson.reflect.TypeToken;
import com.google.gson.x;
import com.google.gson.y;
import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.TimeZone;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
final class SqlDateTypeAdapter extends x {

    /* renamed from: b, reason: collision with root package name */
    public static final y f6351b = new y() { // from class: com.google.gson.internal.sql.SqlDateTypeAdapter.1
        @Override // com.google.gson.y
        public final x a(j jVar, TypeToken typeToken) {
            if (typeToken.getRawType() == Date.class) {
                return new SqlDateTypeAdapter(0);
            }
            return null;
        }
    };

    /* renamed from: a, reason: collision with root package name */
    public final SimpleDateFormat f6352a;

    public /* synthetic */ SqlDateTypeAdapter(int i5) {
        this();
    }

    @Override // com.google.gson.x
    public final Object b(r9.a aVar) {
        Date date;
        if (aVar.i0() == 9) {
            aVar.c0();
            return null;
        }
        String f02 = aVar.f0();
        synchronized (this) {
            TimeZone timeZone = this.f6352a.getTimeZone();
            try {
                try {
                    date = new Date(this.f6352a.parse(f02).getTime());
                } catch (ParseException e7) {
                    throw new r("Failed parsing '" + f02 + "' as SQL Date; at path " + aVar.z(true), e7);
                }
            } finally {
                this.f6352a.setTimeZone(timeZone);
            }
        }
        return date;
    }

    @Override // com.google.gson.x
    public final void c(r9.b bVar, Object obj) {
        String format;
        Date date = (Date) obj;
        if (date == null) {
            bVar.C();
            return;
        }
        synchronized (this) {
            format = this.f6352a.format((java.util.Date) date);
        }
        bVar.W(format);
    }

    private SqlDateTypeAdapter() {
        this.f6352a = new SimpleDateFormat("MMM d, yyyy");
    }
}
