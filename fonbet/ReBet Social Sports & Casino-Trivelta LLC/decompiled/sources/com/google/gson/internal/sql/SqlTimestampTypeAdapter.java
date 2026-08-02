package com.google.gson.internal.sql;

import Jb.c;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.reflect.TypeToken;
import com.google.gson.v;
import java.sql.Timestamp;
import java.util.Date;

/* loaded from: classes3.dex */
class SqlTimestampTypeAdapter extends TypeAdapter {

    /* renamed from: b, reason: collision with root package name */
    public static final v f38320b = new v() { // from class: com.google.gson.internal.sql.SqlTimestampTypeAdapter.1
        @Override // com.google.gson.v
        public TypeAdapter create(Gson gson, TypeToken typeToken) {
            if (typeToken.getRawType() == Timestamp.class) {
                return new SqlTimestampTypeAdapter(gson.p(Date.class));
            }
            return null;
        }
    };

    /* renamed from: a, reason: collision with root package name */
    public final TypeAdapter f38321a;

    @Override // com.google.gson.TypeAdapter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public Timestamp read(Jb.a aVar) {
        Date date = (Date) this.f38321a.read(aVar);
        if (date != null) {
            return new Timestamp(date.getTime());
        }
        return null;
    }

    @Override // com.google.gson.TypeAdapter
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void write(c cVar, Timestamp timestamp) {
        this.f38321a.write(cVar, timestamp);
    }

    public SqlTimestampTypeAdapter(TypeAdapter typeAdapter) {
        this.f38321a = typeAdapter;
    }
}
