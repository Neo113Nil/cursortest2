package com.roxiemobile.androidcommons.data.mapper.adapter;

import com.google.gson.TypeAdapter;
import com.google.gson.n;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* loaded from: classes9.dex */
public class DateAdapter extends TypeAdapter<Date> {

    /* renamed from: a, reason: collision with root package name */
    private static final ThreadLocal<SimpleDateFormat> f60339a = new a();

    final class a extends ThreadLocal<SimpleDateFormat> {
        @Override // java.lang.ThreadLocal
        protected final SimpleDateFormat initialValue() {
            return new SimpleDateFormat("yyyy-MM-dd", Locale.ENGLISH);
        }
    }

    @Override // com.google.gson.TypeAdapter
    public final Date read(JsonReader jsonReader) throws IOException {
        if (jsonReader.peek() == JsonToken.NULL) {
            jsonReader.nextNull();
            return null;
        }
        try {
            return f60339a.get().parse(jsonReader.nextString());
        } catch (ParseException e11) {
            throw new n((Throwable) e11);
        }
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(JsonWriter jsonWriter, Date date) throws IOException {
        Date date2 = date;
        jsonWriter.value(date2 != null ? f60339a.get().format(date2) : null);
    }
}
