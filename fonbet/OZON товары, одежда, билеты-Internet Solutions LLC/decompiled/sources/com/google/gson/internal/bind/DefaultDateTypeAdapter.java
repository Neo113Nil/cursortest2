package com.google.gson.internal.bind;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.internal.bind.TypeAdapters;
import com.google.gson.internal.i;
import com.google.gson.internal.p;
import com.google.gson.n;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import com.google.gson.t;
import g.C6594f;
import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.Locale;
import java.util.Objects;
import java.util.TimeZone;

/* loaded from: classes.dex */
public final class DefaultDateTypeAdapter<T extends Date> extends TypeAdapter<T> {

    /* renamed from: c, reason: collision with root package name */
    public static final t f59835c = new t() { // from class: com.google.gson.internal.bind.DefaultDateTypeAdapter.1
        @Override // com.google.gson.t
        public final <T> TypeAdapter<T> create(Gson gson, com.google.gson.reflect.a<T> aVar) {
            if (aVar.getRawType() == Date.class) {
                return new DefaultDateTypeAdapter(a.f59838b, 2, 2);
            }
            return null;
        }

        public final String toString() {
            return "DefaultDateTypeAdapter#DEFAULT_STYLE_FACTORY";
        }
    };

    /* renamed from: a, reason: collision with root package name */
    private final a<T> f59836a;

    /* renamed from: b, reason: collision with root package name */
    private final ArrayList f59837b;

    public static abstract class a<T extends Date> {

        /* renamed from: b, reason: collision with root package name */
        public static final a<Date> f59838b = new C0909a(Date.class);

        /* renamed from: a, reason: collision with root package name */
        private final Class<T> f59839a;

        /* renamed from: com.google.gson.internal.bind.DefaultDateTypeAdapter$a$a, reason: collision with other inner class name */
        final class C0909a extends a<Date> {
            @Override // com.google.gson.internal.bind.DefaultDateTypeAdapter.a
            protected final Date b(Date date) {
                return date;
            }
        }

        protected a(Class<T> cls) {
            this.f59839a = cls;
        }

        public final t a(int i11, int i12) {
            DefaultDateTypeAdapter defaultDateTypeAdapter = new DefaultDateTypeAdapter(this, i11, i12);
            t tVar = TypeAdapters.f59899a;
            return new TypeAdapters.AnonymousClass29(this.f59839a, defaultDateTypeAdapter);
        }

        protected abstract T b(Date date);
    }

    private DefaultDateTypeAdapter() {
        throw null;
    }

    DefaultDateTypeAdapter(a aVar, int i11, int i12) {
        ArrayList arrayList = new ArrayList();
        this.f59837b = arrayList;
        Objects.requireNonNull(aVar);
        this.f59836a = aVar;
        Locale locale = Locale.US;
        arrayList.add(DateFormat.getDateTimeInstance(i11, i12, locale));
        if (!Locale.getDefault().equals(locale)) {
            arrayList.add(DateFormat.getDateTimeInstance(i11, i12));
        }
        if (i.a()) {
            arrayList.add(p.b(i11, i12));
        }
    }

    @Override // com.google.gson.TypeAdapter
    public final Object read(JsonReader jsonReader) throws IOException {
        Date b11;
        if (jsonReader.peek() == JsonToken.NULL) {
            jsonReader.nextNull();
            return null;
        }
        String nextString = jsonReader.nextString();
        synchronized (this.f59837b) {
            try {
                Iterator it = this.f59837b.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        try {
                            b11 = K8.a.b(nextString, new ParsePosition(0));
                            break;
                        } catch (ParseException e11) {
                            StringBuilder b12 = C6594f.b("Failed parsing '", nextString, "' as Date; at path ");
                            b12.append(jsonReader.getPreviousPath());
                            throw new n(b12.toString(), e11);
                        }
                    }
                    DateFormat dateFormat = (DateFormat) it.next();
                    TimeZone timeZone = dateFormat.getTimeZone();
                    try {
                        try {
                            b11 = dateFormat.parse(nextString);
                            break;
                        } finally {
                            dateFormat.setTimeZone(timeZone);
                        }
                    } catch (ParseException unused) {
                        dateFormat.setTimeZone(timeZone);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return this.f59836a.b(b11);
    }

    public final String toString() {
        DateFormat dateFormat = (DateFormat) this.f59837b.get(0);
        if (dateFormat instanceof SimpleDateFormat) {
            return "DefaultDateTypeAdapter(" + ((SimpleDateFormat) dateFormat).toPattern() + ')';
        }
        return "DefaultDateTypeAdapter(" + dateFormat.getClass().getSimpleName() + ')';
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(JsonWriter jsonWriter, Object obj) throws IOException {
        String format;
        Date date = (Date) obj;
        if (date == null) {
            jsonWriter.nullValue();
            return;
        }
        DateFormat dateFormat = (DateFormat) this.f59837b.get(0);
        synchronized (this.f59837b) {
            format = dateFormat.format(date);
        }
        jsonWriter.value(format);
    }
}
