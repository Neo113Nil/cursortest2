package defpackage;

import com.google.gson.Gson;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.lang.reflect.Array;
import java.lang.reflect.Type;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.Locale;
import java.util.Objects;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class ih0 extends u4k {
    public static final hh0 d = new hh0(0);
    public final /* synthetic */ int a = 1;
    public final Object b;
    public final Object c;

    public ih0(io4 io4Var, int i, int i2) {
        ArrayList arrayList = new ArrayList();
        this.b = arrayList;
        Objects.requireNonNull(io4Var);
        this.c = io4Var;
        Locale locale = Locale.US;
        arrayList.add(DateFormat.getDateTimeInstance(i, i2, locale));
        if (!Locale.getDefault().equals(locale)) {
            arrayList.add(DateFormat.getDateTimeInstance(i, i2));
        }
        if (qda.a >= 9) {
            arrayList.add(u0a.A(i, i2));
        }
    }

    @Override // defpackage.u4k
    public final Object a(JsonReader jsonReader) {
        Date b;
        Collection collection = null;
        switch (this.a) {
            case 0:
                Class cls = (Class) this.c;
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.nextNull();
                    return null;
                }
                ArrayList arrayList = new ArrayList();
                jsonReader.beginArray();
                while (jsonReader.hasNext()) {
                    arrayList.add(((u4k) ((w4k) this.b).c).a(jsonReader));
                }
                jsonReader.endArray();
                int size = arrayList.size();
                if (!cls.isPrimitive()) {
                    return arrayList.toArray((Object[]) Array.newInstance((Class<?>) cls, size));
                }
                Object newInstance = Array.newInstance((Class<?>) cls, size);
                for (int i = 0; i < size; i++) {
                    Array.set(newInstance, i, arrayList.get(i));
                }
                return newInstance;
            case 1:
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.nextNull();
                } else {
                    collection = (Collection) ((pjd) this.c).n();
                    jsonReader.beginArray();
                    while (jsonReader.hasNext()) {
                        collection.add(((u4k) ((w4k) this.b).c).a(jsonReader));
                    }
                    jsonReader.endArray();
                }
                return collection;
            case 2:
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.nextNull();
                    return null;
                }
                String nextString = jsonReader.nextString();
                synchronized (((ArrayList) this.b)) {
                    try {
                        Iterator it = ((ArrayList) this.b).iterator();
                        while (true) {
                            if (it.hasNext()) {
                                try {
                                    b = ((DateFormat) it.next()).parse(nextString);
                                } catch (ParseException unused) {
                                }
                            } else {
                                try {
                                    b = bn9.b(nextString, new ParsePosition(0));
                                } catch (ParseException e) {
                                    eg4.a(wt3.q("Failed parsing '", nextString, "' as Date; at path "), jsonReader.getPreviousPath(), e);
                                    return null;
                                }
                            }
                        }
                    } finally {
                    }
                }
                return ((io4) this.c).a(b);
            default:
                Class cls2 = (Class) this.c;
                Object a = ((x4k) this.b).c.a(jsonReader);
                if (a == null || cls2.isInstance(a)) {
                    return a;
                }
                throw new yga("Expected a " + cls2.getName() + " but was " + a.getClass().getName() + "; at path " + jsonReader.getPreviousPath());
        }
    }

    @Override // defpackage.u4k
    public final void b(JsonWriter jsonWriter, Object obj) {
        String format;
        switch (this.a) {
            case 0:
                if (obj == null) {
                    jsonWriter.nullValue();
                    return;
                }
                jsonWriter.beginArray();
                int length = Array.getLength(obj);
                for (int i = 0; i < length; i++) {
                    ((w4k) this.b).b(jsonWriter, Array.get(obj, i));
                }
                jsonWriter.endArray();
                return;
            case 1:
                Collection collection = (Collection) obj;
                if (collection == null) {
                    jsonWriter.nullValue();
                    return;
                }
                jsonWriter.beginArray();
                Iterator it = collection.iterator();
                while (it.hasNext()) {
                    ((w4k) this.b).b(jsonWriter, it.next());
                }
                jsonWriter.endArray();
                return;
            case 2:
                Date date = (Date) obj;
                if (date == null) {
                    jsonWriter.nullValue();
                    return;
                }
                DateFormat dateFormat = (DateFormat) ((ArrayList) this.b).get(0);
                synchronized (((ArrayList) this.b)) {
                    format = dateFormat.format(date);
                }
                jsonWriter.value(format);
                return;
            default:
                ((x4k) this.b).c.b(jsonWriter, obj);
                return;
        }
    }

    public String toString() {
        switch (this.a) {
            case 2:
                DateFormat dateFormat = (DateFormat) ((ArrayList) this.b).get(0);
                if (dateFormat instanceof SimpleDateFormat) {
                    return "DefaultDateTypeAdapter(" + ((SimpleDateFormat) dateFormat).toPattern() + ')';
                }
                return "DefaultDateTypeAdapter(" + dateFormat.getClass().getSimpleName() + ')';
            default:
                return super.toString();
        }
    }

    public ih0(io4 io4Var, String str) {
        ArrayList arrayList = new ArrayList();
        this.b = arrayList;
        Objects.requireNonNull(io4Var);
        this.c = io4Var;
        Locale locale = Locale.US;
        arrayList.add(new SimpleDateFormat(str, locale));
        if (Locale.getDefault().equals(locale)) {
            return;
        }
        arrayList.add(new SimpleDateFormat(str));
    }

    public ih0(x4k x4kVar, Class cls) {
        this.b = x4kVar;
        this.c = cls;
    }

    public ih0(Gson gson, u4k u4kVar, Class cls) {
        this.b = new w4k(gson, u4kVar, cls);
        this.c = cls;
    }

    public ih0(Gson gson, Type type, u4k u4kVar, pjd pjdVar) {
        this.b = new w4k(gson, u4kVar, type);
        this.c = pjdVar;
    }
}
