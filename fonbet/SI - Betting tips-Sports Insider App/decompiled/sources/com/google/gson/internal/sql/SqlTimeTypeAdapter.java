package com.google.gson.internal.sql;

import com.google.gson.j;
import com.google.gson.r;
import com.google.gson.reflect.TypeToken;
import com.google.gson.x;
import com.google.gson.y;
import java.sql.Time;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
final class SqlTimeTypeAdapter extends x {

    /* renamed from: b, reason: collision with root package name */
    public static final y f6353b = new y() { // from class: com.google.gson.internal.sql.SqlTimeTypeAdapter.1
        @Override // com.google.gson.y
        public final x a(j jVar, TypeToken typeToken) {
            if (typeToken.getRawType() == Time.class) {
                return new SqlTimeTypeAdapter(0);
            }
            return null;
        }
    };

    /* renamed from: a, reason: collision with root package name */
    public final SimpleDateFormat f6354a;

    public /* synthetic */ SqlTimeTypeAdapter(int i5) {
        this();
    }

    @Override // com.google.gson.x
    public final Object b(r9.a aVar) {
        Time time;
        if (aVar.i0() == 9) {
            aVar.c0();
            return null;
        }
        String f02 = aVar.f0();
        synchronized (this) {
            TimeZone timeZone = this.f6354a.getTimeZone();
            try {
                try {
                    time = new Time(this.f6354a.parse(f02).getTime());
                } catch (ParseException e7) {
                    throw new r("Failed parsing '" + f02 + "' as SQL Time; at path " + aVar.z(true), e7);
                }
            } finally {
                this.f6354a.setTimeZone(timeZone);
            }
        }
        return time;
    }

    @Override // com.google.gson.x
    public final void c(r9.b bVar, Object obj) {
        String format;
        Time time = (Time) obj;
        if (time == null) {
            bVar.C();
            return;
        }
        synchronized (this) {
            format = this.f6354a.format((Date) time);
        }
        bVar.W(format);
    }

    private SqlTimeTypeAdapter() {
        this.f6354a = new SimpleDateFormat("hh:mm:ss a");
    }
}
