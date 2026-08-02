package com.google.gson.internal.sql;

import Jb.b;
import Jb.c;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.q;
import com.google.gson.reflect.TypeToken;
import com.google.gson.v;
import java.sql.Date;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

/* loaded from: classes3.dex */
final class SqlDateTypeAdapter extends TypeAdapter {

    /* renamed from: b, reason: collision with root package name */
    public static final v f38316b = new v() { // from class: com.google.gson.internal.sql.SqlDateTypeAdapter.1
        @Override // com.google.gson.v
        public TypeAdapter create(Gson gson, TypeToken typeToken) {
            if (typeToken.getRawType() == Date.class) {
                return new SqlDateTypeAdapter();
            }
            return null;
        }
    };

    /* renamed from: a, reason: collision with root package name */
    public final DateFormat f38317a;

    @Override // com.google.gson.TypeAdapter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public Date read(Jb.a aVar) {
        java.util.Date parse;
        if (aVar.Y1() == b.NULL) {
            aVar.n1();
            return null;
        }
        String M02 = aVar.M0();
        try {
            synchronized (this) {
                parse = this.f38317a.parse(M02);
            }
            return new Date(parse.getTime());
        } catch (ParseException e10) {
            throw new q("Failed parsing '" + M02 + "' as SQL Date; at path " + aVar.U(), e10);
        }
    }

    @Override // com.google.gson.TypeAdapter
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void write(c cVar, Date date) {
        String format;
        if (date == null) {
            cVar.T1();
            return;
        }
        synchronized (this) {
            format = this.f38317a.format((java.util.Date) date);
        }
        cVar.k2(format);
    }

    private SqlDateTypeAdapter() {
        this.f38317a = new SimpleDateFormat("MMM d, yyyy");
    }
}
