package com.google.gson.internal.sql;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.n;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import com.google.gson.t;
import java.io.IOException;
import java.sql.Time;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

/* loaded from: classes.dex */
final class SqlTimeTypeAdapter extends TypeAdapter<Time> {

    /* renamed from: b, reason: collision with root package name */
    static final t f60005b = new t() { // from class: com.google.gson.internal.sql.SqlTimeTypeAdapter.1
        @Override // com.google.gson.t
        public final <T> TypeAdapter<T> create(Gson gson, com.google.gson.reflect.a<T> aVar) {
            if (aVar.getRawType() == Time.class) {
                return new SqlTimeTypeAdapter(0);
            }
            return null;
        }
    };

    /* renamed from: a, reason: collision with root package name */
    private final SimpleDateFormat f60006a;

    /* synthetic */ SqlTimeTypeAdapter(int i11) {
        this();
    }

    @Override // com.google.gson.TypeAdapter
    public final Time read(JsonReader jsonReader) throws IOException {
        Time time;
        if (jsonReader.peek() == JsonToken.NULL) {
            jsonReader.nextNull();
            return null;
        }
        String nextString = jsonReader.nextString();
        synchronized (this) {
            TimeZone timeZone = this.f60006a.getTimeZone();
            try {
                try {
                    time = new Time(this.f60006a.parse(nextString).getTime());
                } catch (ParseException e11) {
                    throw new n("Failed parsing '" + nextString + "' as SQL Time; at path " + jsonReader.getPreviousPath(), e11);
                }
            } finally {
                this.f60006a.setTimeZone(timeZone);
            }
        }
        return time;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(JsonWriter jsonWriter, Time time) throws IOException {
        String format;
        Time time2 = time;
        if (time2 == null) {
            jsonWriter.nullValue();
            return;
        }
        synchronized (this) {
            format = this.f60006a.format((Date) time2);
        }
        jsonWriter.value(format);
    }

    private SqlTimeTypeAdapter() {
        this.f60006a = new SimpleDateFormat("hh:mm:ss a");
    }
}
