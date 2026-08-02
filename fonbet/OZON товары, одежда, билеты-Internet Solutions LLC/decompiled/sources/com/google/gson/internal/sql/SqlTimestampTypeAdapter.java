package com.google.gson.internal.sql;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.google.gson.t;
import java.io.IOException;
import java.sql.Timestamp;
import java.util.Date;

/* loaded from: classes.dex */
class SqlTimestampTypeAdapter extends TypeAdapter<Timestamp> {

    /* renamed from: b, reason: collision with root package name */
    static final t f60007b = new t() { // from class: com.google.gson.internal.sql.SqlTimestampTypeAdapter.1
        @Override // com.google.gson.t
        public final <T> TypeAdapter<T> create(Gson gson, com.google.gson.reflect.a<T> aVar) {
            if (aVar.getRawType() == Timestamp.class) {
                return new SqlTimestampTypeAdapter(gson.f(Date.class));
            }
            return null;
        }
    };

    /* renamed from: a, reason: collision with root package name */
    private final TypeAdapter<Date> f60008a;

    private SqlTimestampTypeAdapter() {
        throw null;
    }

    SqlTimestampTypeAdapter(TypeAdapter typeAdapter) {
        this.f60008a = typeAdapter;
    }

    @Override // com.google.gson.TypeAdapter
    public final Timestamp read(JsonReader jsonReader) throws IOException {
        Date read = this.f60008a.read(jsonReader);
        if (read != null) {
            return new Timestamp(read.getTime());
        }
        return null;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(JsonWriter jsonWriter, Timestamp timestamp) throws IOException {
        this.f60008a.write(jsonWriter, timestamp);
    }
}
