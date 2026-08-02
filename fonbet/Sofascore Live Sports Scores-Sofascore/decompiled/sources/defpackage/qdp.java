package defpackage;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.Locale;
import java.util.TimeZone;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class qdp extends map {
    public static final odp c = new odp();
    public final p4h a;
    public final ArrayList b;

    public qdp() {
        p4h p4hVar = p4h.q;
        ArrayList arrayList = new ArrayList();
        this.b = arrayList;
        this.a = p4hVar;
        Locale locale = Locale.US;
        arrayList.add(DateFormat.getDateTimeInstance(2, 2, locale));
        if (!Locale.getDefault().equals(locale)) {
            arrayList.add(DateFormat.getDateTimeInstance(2, 2));
        }
        if (ubp.a >= 9) {
            arrayList.add(new SimpleDateFormat("MMM d, yyyy h:mm:ss a", locale));
        }
    }

    @Override // defpackage.map
    public final Object read(e7n e7nVar) {
        Date a;
        if (e7nVar.Q0() == 9) {
            e7nVar.j0();
            return null;
        }
        ArrayList arrayList = this.b;
        String f0 = e7nVar.f0();
        synchronized (arrayList) {
            try {
                Iterator it = arrayList.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        try {
                            a = c6n.a(f0, new ParsePosition(0));
                            break;
                        } catch (ParseException e) {
                            throw new o9p(16, sep.b((byte) 35, f0, e7nVar, "Failed parsing '", "' as Date; at path "), e);
                        }
                    }
                    DateFormat dateFormat = (DateFormat) it.next();
                    TimeZone timeZone = dateFormat.getTimeZone();
                    try {
                        try {
                            a = dateFormat.parse(f0);
                            break;
                        } finally {
                            dateFormat.setTimeZone(timeZone);
                        }
                    } catch (ParseException unused) {
                        dateFormat.setTimeZone(timeZone);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.a.getClass();
        return a;
    }

    public final String toString() {
        DateFormat dateFormat = (DateFormat) this.b.get(0);
        if (dateFormat instanceof SimpleDateFormat) {
            String pattern = ((SimpleDateFormat) dateFormat).toPattern();
            StringBuilder sb = new StringBuilder(fn0.c(24, pattern));
            sb.append("DefaultDateTypeAdapter(");
            sb.append(pattern);
            sb.append(")");
            return sb.toString();
        }
        String simpleName = dateFormat.getClass().getSimpleName();
        StringBuilder sb2 = new StringBuilder(simpleName.length() + 24);
        sb2.append("DefaultDateTypeAdapter(");
        sb2.append(simpleName);
        sb2.append(")");
        return sb2.toString();
    }

    @Override // defpackage.map
    public final /* bridge */ /* synthetic */ void write(f7n f7nVar, Object obj) {
        String format;
        Date date = (Date) obj;
        if (date == null) {
            f7nVar.f0();
            return;
        }
        ArrayList arrayList = this.b;
        DateFormat dateFormat = (DateFormat) arrayList.get(0);
        synchronized (arrayList) {
            format = dateFormat.format(date);
        }
        f7nVar.H(format);
    }
}
