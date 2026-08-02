package com.google.gson.internal.bind;

import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.ParsePosition;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.Locale;
import xsna.dov;
import xsna.rtp0;
import xsna.skd;
import xsna.t33;
import xsna.xtp0;
import xsna.yxx;

/* loaded from: classes.dex */
public final class DateTypeAdapter extends TypeAdapter<Date> {
    public static final rtp0 b = new rtp0() { // from class: com.google.gson.internal.bind.DateTypeAdapter.1
        @Override // xsna.rtp0
        public final <T> TypeAdapter<T> a(Gson gson, xtp0<T> xtp0Var) {
            if (xtp0Var.getRawType() == Date.class) {
                return new DateTypeAdapter();
            }
            return null;
        }
    };
    public final ArrayList a;

    public DateTypeAdapter() {
        ArrayList arrayList = new ArrayList();
        this.a = arrayList;
        Locale locale = Locale.US;
        arrayList.add(DateFormat.getDateTimeInstance(2, 2, locale));
        if (!Locale.getDefault().equals(locale)) {
            arrayList.add(DateFormat.getDateTimeInstance(2, 2));
        }
        if (yxx.a()) {
            arrayList.add(skd.f(2, 2));
        }
    }

    @Override // com.google.gson.TypeAdapter
    public final Date b(JsonReader jsonReader) throws IOException {
        if (jsonReader.peek() == JsonToken.NULL) {
            jsonReader.nextNull();
            return null;
        }
        String nextString = jsonReader.nextString();
        synchronized (this.a) {
            try {
                Iterator it = this.a.iterator();
                while (it.hasNext()) {
                    try {
                        return ((DateFormat) it.next()).parse(nextString);
                    } catch (ParseException unused) {
                    }
                }
                try {
                    return dov.b(nextString, new ParsePosition(0));
                } catch (ParseException e) {
                    StringBuilder a = t33.a("Failed parsing '", nextString, "' as Date; at path ");
                    a.append(jsonReader.getPreviousPath());
                    throw new JsonSyntaxException(a.toString(), e);
                }
            } finally {
            }
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
        DateFormat dateFormat = (DateFormat) this.a.get(0);
        synchronized (this.a) {
            format = dateFormat.format(date2);
        }
        jsonWriter.value(format);
    }
}
