package com.google.gson.internal.bind;

import com.google.gson.JsonSyntaxException;
import com.google.gson.TypeAdapter;
import com.google.gson.internal.bind.TypeAdapters;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.Locale;
import xsna.dov;
import xsna.rtp0;
import xsna.skd;
import xsna.t33;
import xsna.yxx;

/* loaded from: classes13.dex */
public final class DefaultDateTypeAdapter<T extends Date> extends TypeAdapter<T> {
    public final a<T> a;
    public final ArrayList b;

    public DefaultDateTypeAdapter() {
        throw null;
    }

    public DefaultDateTypeAdapter(a aVar, String str) {
        ArrayList arrayList = new ArrayList();
        this.b = arrayList;
        aVar.getClass();
        this.a = aVar;
        Locale locale = Locale.US;
        arrayList.add(new SimpleDateFormat(str, locale));
        if (Locale.getDefault().equals(locale)) {
            return;
        }
        arrayList.add(new SimpleDateFormat(str));
    }

    @Override // com.google.gson.TypeAdapter
    public final Object b(JsonReader jsonReader) throws IOException {
        Date b;
        if (jsonReader.peek() == JsonToken.NULL) {
            jsonReader.nextNull();
            return null;
        }
        String nextString = jsonReader.nextString();
        synchronized (this.b) {
            try {
                Iterator it = this.b.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        try {
                            b = dov.b(nextString, new ParsePosition(0));
                            break;
                        } catch (ParseException e) {
                            StringBuilder a2 = t33.a("Failed parsing '", nextString, "' as Date; at path ");
                            a2.append(jsonReader.getPreviousPath());
                            throw new JsonSyntaxException(a2.toString(), (Throwable) e);
                        }
                    }
                    try {
                        b = ((DateFormat) it.next()).parse(nextString);
                    } catch (ParseException unused) {
                    }
                }
            } finally {
            }
        }
        return this.a.c(b);
    }

    @Override // com.google.gson.TypeAdapter
    public final void c(JsonWriter jsonWriter, Object obj) throws IOException {
        String format;
        Date date = (Date) obj;
        if (date == null) {
            jsonWriter.nullValue();
            return;
        }
        DateFormat dateFormat = (DateFormat) this.b.get(0);
        synchronized (this.b) {
            format = dateFormat.format(date);
        }
        jsonWriter.value(format);
    }

    public final String toString() {
        DateFormat dateFormat = (DateFormat) this.b.get(0);
        if (dateFormat instanceof SimpleDateFormat) {
            return "DefaultDateTypeAdapter(" + ((SimpleDateFormat) dateFormat).toPattern() + ')';
        }
        return "DefaultDateTypeAdapter(" + dateFormat.getClass().getSimpleName() + ')';
    }

    public DefaultDateTypeAdapter(a aVar, int i, int i2) {
        ArrayList arrayList = new ArrayList();
        this.b = arrayList;
        aVar.getClass();
        this.a = aVar;
        Locale locale = Locale.US;
        arrayList.add(DateFormat.getDateTimeInstance(i, i2, locale));
        if (!Locale.getDefault().equals(locale)) {
            arrayList.add(DateFormat.getDateTimeInstance(i, i2));
        }
        if (yxx.a()) {
            arrayList.add(skd.f(i, i2));
        }
    }

    /* loaded from: classes.dex */
    public static abstract class a<T extends Date> {
        public static final C0147a b = new C0147a(Date.class);
        public final Class<T> a;

        public a(Class<T> cls) {
            this.a = cls;
        }

        public final rtp0 a(int i, int i2) {
            DefaultDateTypeAdapter defaultDateTypeAdapter = new DefaultDateTypeAdapter(this, i, i2);
            rtp0 rtp0Var = TypeAdapters.a;
            return new TypeAdapters.AnonymousClass31(this.a, defaultDateTypeAdapter);
        }

        public final rtp0 b(String str) {
            DefaultDateTypeAdapter defaultDateTypeAdapter = new DefaultDateTypeAdapter(this, str);
            rtp0 rtp0Var = TypeAdapters.a;
            return new TypeAdapters.AnonymousClass31(this.a, defaultDateTypeAdapter);
        }

        public abstract T c(Date date);

        /* renamed from: com.google.gson.internal.bind.DefaultDateTypeAdapter$a$a, reason: collision with other inner class name */
        public class C0147a extends a<Date> {
            @Override // com.google.gson.internal.bind.DefaultDateTypeAdapter.a
            public final Date c(Date date) {
                return date;
            }
        }
    }
}
