package com.google.gson.internal.sql;

import Jb.b;
import Jb.c;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.q;
import com.google.gson.reflect.TypeToken;
import com.google.gson.v;
import java.sql.Time;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/* loaded from: classes3.dex */
final class SqlTimeTypeAdapter extends TypeAdapter {

    /* renamed from: b, reason: collision with root package name */
    public static final v f38318b = new v() { // from class: com.google.gson.internal.sql.SqlTimeTypeAdapter.1
        @Override // com.google.gson.v
        public TypeAdapter create(Gson gson, TypeToken typeToken) {
            if (typeToken.getRawType() == Time.class) {
                return new SqlTimeTypeAdapter();
            }
            return null;
        }
    };

    /* renamed from: a, reason: collision with root package name */
    public final DateFormat f38319a;

    @Override // com.google.gson.TypeAdapter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public Time read(Jb.a aVar) {
        Time time;
        if (aVar.Y1() == b.NULL) {
            aVar.n1();
            return null;
        }
        String M02 = aVar.M0();
        try {
            synchronized (this) {
                time = new Time(this.f38319a.parse(M02).getTime());
            }
            return time;
        } catch (ParseException e10) {
            throw new q("Failed parsing '" + M02 + "' as SQL Time; at path " + aVar.U(), e10);
        }
    }

    @Override // com.google.gson.TypeAdapter
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void write(c cVar, Time time) {
        String format;
        if (time == null) {
            cVar.T1();
            return;
        }
        synchronized (this) {
            format = this.f38319a.format((Date) time);
        }
        cVar.k2(format);
    }

    private SqlTimeTypeAdapter() {
        this.f38319a = new SimpleDateFormat("hh:mm:ss a");
    }
}
