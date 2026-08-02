package com.google.gson.internal.sql;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.sql.Timestamp;
import java.util.Date;
import xsna.rtp0;
import xsna.xtp0;

/* loaded from: classes.dex */
class SqlTimestampTypeAdapter extends TypeAdapter<Timestamp> {
    public static final rtp0 b = new rtp0() { // from class: com.google.gson.internal.sql.SqlTimestampTypeAdapter.1
        @Override // xsna.rtp0
        public final <T> TypeAdapter<T> a(Gson gson, xtp0<T> xtp0Var) {
            if (xtp0Var.getRawType() == Timestamp.class) {
                return new SqlTimestampTypeAdapter(gson.getAdapter(Date.class));
            }
            return null;
        }
    };
    public final TypeAdapter<Date> a;

    public SqlTimestampTypeAdapter() {
        throw null;
    }

    public SqlTimestampTypeAdapter(TypeAdapter typeAdapter) {
        this.a = typeAdapter;
    }

    @Override // com.google.gson.TypeAdapter
    public final Timestamp b(JsonReader jsonReader) throws IOException {
        Date b2 = this.a.b(jsonReader);
        if (b2 != null) {
            return new Timestamp(b2.getTime());
        }
        return null;
    }

    @Override // com.google.gson.TypeAdapter
    public final void c(JsonWriter jsonWriter, Timestamp timestamp) throws IOException {
        this.a.c(jsonWriter, timestamp);
    }
}
