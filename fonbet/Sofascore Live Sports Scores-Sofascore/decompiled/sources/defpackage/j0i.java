package defpackage;

import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.sql.Time;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class j0i extends u4k {
    public static final hh0 c = new hh0(2);
    public static final hh0 d = new hh0(3);
    public final /* synthetic */ int a;
    public final SimpleDateFormat b;

    public j0i(int i) {
        this.a = i;
        switch (i) {
            case 1:
                this.b = new SimpleDateFormat("hh:mm:ss a");
                break;
            default:
                this.b = new SimpleDateFormat("MMM d, yyyy");
                break;
        }
    }

    @Override // defpackage.u4k
    public final Object a(JsonReader jsonReader) {
        Date parse;
        Time time;
        switch (this.a) {
            case 0:
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.nextNull();
                    return null;
                }
                String nextString = jsonReader.nextString();
                try {
                    synchronized (this) {
                        parse = this.b.parse(nextString);
                    }
                    return new java.sql.Date(parse.getTime());
                } catch (ParseException e) {
                    eg4.a(wt3.q("Failed parsing '", nextString, "' as SQL Date; at path "), jsonReader.getPreviousPath(), e);
                    return null;
                }
            default:
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.nextNull();
                    return null;
                }
                String nextString2 = jsonReader.nextString();
                try {
                    synchronized (this) {
                        time = new Time(this.b.parse(nextString2).getTime());
                    }
                    return time;
                } catch (ParseException e2) {
                    eg4.a(wt3.q("Failed parsing '", nextString2, "' as SQL Time; at path "), jsonReader.getPreviousPath(), e2);
                    return null;
                }
        }
    }

    @Override // defpackage.u4k
    public final void b(JsonWriter jsonWriter, Object obj) {
        String format;
        String format2;
        switch (this.a) {
            case 0:
                java.sql.Date date = (java.sql.Date) obj;
                if (date == null) {
                    jsonWriter.nullValue();
                    return;
                }
                synchronized (this) {
                    format = this.b.format((Date) date);
                }
                jsonWriter.value(format);
                return;
            default:
                Time time = (Time) obj;
                if (time == null) {
                    jsonWriter.nullValue();
                    return;
                }
                synchronized (this) {
                    format2 = this.b.format((Date) time);
                }
                jsonWriter.value(format2);
                return;
        }
    }
}
