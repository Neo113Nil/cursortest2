package com.google.gson.internal.sql;

import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.sql.Time;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import xsna.rtp0;
import xsna.t33;
import xsna.xtp0;

/* loaded from: classes.dex */
final class SqlTimeTypeAdapter extends TypeAdapter<Time> {
    public static final rtp0 b = new rtp0() { // from class: com.google.gson.internal.sql.SqlTimeTypeAdapter.1
        @Override // xsna.rtp0
        public final <T> TypeAdapter<T> a(Gson gson, xtp0<T> xtp0Var) {
            if (xtp0Var.getRawType() == Time.class) {
                return new SqlTimeTypeAdapter(0);
            }
            return null;
        }
    };
    public final SimpleDateFormat a;

    public /* synthetic */ SqlTimeTypeAdapter(int i) {
        this();
    }

    @Override // com.google.gson.TypeAdapter
    public final Time b(JsonReader jsonReader) throws IOException {
        Time time;
        if (jsonReader.peek() == JsonToken.NULL) {
            jsonReader.nextNull();
            return null;
        }
        String nextString = jsonReader.nextString();
        try {
            synchronized (this) {
                time = new Time(this.a.parse(nextString).getTime());
            }
            return time;
        } catch (ParseException e) {
            StringBuilder a = t33.a("Failed parsing '", nextString, "' as SQL Time; at path ");
            a.append(jsonReader.getPreviousPath());
            throw new JsonSyntaxException(a.toString(), e);
        }
    }

    @Override // com.google.gson.TypeAdapter
    public final void c(JsonWriter jsonWriter, Time time) throws IOException {
        String format;
        Time time2 = time;
        if (time2 == null) {
            jsonWriter.nullValue();
            return;
        }
        synchronized (this) {
            format = this.a.format((Date) time2);
        }
        jsonWriter.value(format);
    }

    private SqlTimeTypeAdapter() {
        this.a = new SimpleDateFormat("hh:mm:ss a");
    }
}
