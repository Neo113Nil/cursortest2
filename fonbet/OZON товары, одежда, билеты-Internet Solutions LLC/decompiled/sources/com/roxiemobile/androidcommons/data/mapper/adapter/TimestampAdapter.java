package com.roxiemobile.androidcommons.data.mapper.adapter;

import com.google.gson.TypeAdapter;
import com.google.gson.n;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* loaded from: classes9.dex */
public class TimestampAdapter extends TypeAdapter<Timestamp> {

    /* renamed from: a, reason: collision with root package name */
    private static final ThreadLocal<SimpleDateFormat> f60344a = new a();

    final class a extends ThreadLocal<SimpleDateFormat> {
        @Override // java.lang.ThreadLocal
        protected final SimpleDateFormat initialValue() {
            return new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssZ", Locale.ENGLISH);
        }
    }

    @Override // com.google.gson.TypeAdapter
    public final Timestamp read(JsonReader jsonReader) throws IOException {
        if (jsonReader.peek() == JsonToken.NULL) {
            jsonReader.nextNull();
            return null;
        }
        try {
            return new Timestamp(f60344a.get().parse(jsonReader.nextString().replace("Z", "+0000")).getTime());
        } catch (ParseException e11) {
            throw new n((Throwable) e11);
        }
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(JsonWriter jsonWriter, Timestamp timestamp) throws IOException {
        Timestamp timestamp2 = timestamp;
        jsonWriter.value(timestamp2 != null ? f60344a.get().format((Date) timestamp2) : null);
    }
}
