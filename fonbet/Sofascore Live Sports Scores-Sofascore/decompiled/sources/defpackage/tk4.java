package defpackage;

import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.ParsePosition;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.Locale;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class tk4 extends u4k {
    public static final hh0 c = new hh0(1);
    public static final j13 d = new j13(new tk4(tjj.b), 1);
    public final /* synthetic */ int a = 0;
    public final Object b;

    public tk4() {
        ArrayList arrayList = new ArrayList();
        this.b = arrayList;
        Locale locale = Locale.US;
        arrayList.add(DateFormat.getDateTimeInstance(2, 2, locale));
        if (!Locale.getDefault().equals(locale)) {
            arrayList.add(DateFormat.getDateTimeInstance(2, 2));
        }
        if (qda.a >= 9) {
            arrayList.add(u0a.A(2, 2));
        }
    }

    @Override // defpackage.u4k
    public final Object a(JsonReader jsonReader) {
        Date b;
        switch (this.a) {
            case 0:
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
                return b;
            default:
                JsonToken peek = jsonReader.peek();
                int i = bjd.a[peek.ordinal()];
                if (i == 1) {
                    jsonReader.nextNull();
                    return null;
                }
                if (i == 2 || i == 3) {
                    return ((ujj) this.b).a(jsonReader);
                }
                StringBuilder sb = new StringBuilder("Expecting number, got: ");
                sb.append(peek);
                String path = jsonReader.getPath();
                sb.append("; at path ");
                sb.append(path);
                throw new yga(sb.toString());
        }
    }

    @Override // defpackage.u4k
    public final void b(JsonWriter jsonWriter, Object obj) {
        String format;
        switch (this.a) {
            case 0:
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
                jsonWriter.value((Number) obj);
                return;
        }
    }

    public tk4(ujj ujjVar) {
        this.b = ujjVar;
    }
}
