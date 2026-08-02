package com.google.gson.internal.sql;

import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import xsna.rtp0;
import xsna.t33;
import xsna.xtp0;

/* loaded from: classes.dex */
final class SqlDateTypeAdapter extends TypeAdapter<Date> {
    public static final rtp0 b = new rtp0() { // from class: com.google.gson.internal.sql.SqlDateTypeAdapter.1
        @Override // xsna.rtp0
        public final <T> TypeAdapter<T> a(Gson gson, xtp0<T> xtp0Var) {
            if (xtp0Var.getRawType() == Date.class) {
                return new SqlDateTypeAdapter(0);
            }
            return null;
        }
    };
    public final SimpleDateFormat a;

    public /* synthetic */ SqlDateTypeAdapter(int i) {
        this();
    }

    @Override // com.google.gson.TypeAdapter
    public final Date b(JsonReader jsonReader) throws IOException {
        java.util.Date parse;
        if (jsonReader.peek() == JsonToken.NULL) {
            jsonReader.nextNull();
            return null;
        }
        String nextString = jsonReader.nextString();
        try {
            synchronized (this) {
                parse = this.a.parse(nextString);
            }
            return new Date(parse.getTime());
        } catch (ParseException e) {
            StringBuilder a = t33.a("Failed parsing '", nextString, "' as SQL Date; at path ");
            a.append(jsonReader.getPreviousPath());
            throw new JsonSyntaxException(a.toString(), e);
        }
    }

    @Override // com.google.gson.TypeAdapter
    public final void c(JsonWriter jsonWriter, Date date) throws IOException {
        String format;
        Date date2 = date;
        if (date2 == null) {
            jsonWriter.nullValue();
            return;
        }
        synchronized (this) {
            format = this.a.format((java.util.Date) date2);
        }
        jsonWriter.value(format);
    }

    private SqlDateTypeAdapter() {
        this.a = new SimpleDateFormat("MMM d, yyyy");
    }
}
