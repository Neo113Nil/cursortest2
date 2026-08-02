package com.google.gson.internal.bind;

import com.google.gson.internal.f;
import com.google.gson.j;
import com.google.gson.r;
import com.google.gson.reflect.TypeToken;
import com.google.gson.x;
import com.google.gson.y;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.Locale;
import java.util.TimeZone;
import r4.k;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class DefaultDateTypeAdapter<T extends Date> extends x {

    /* renamed from: c, reason: collision with root package name */
    public static final y f6231c = new y() { // from class: com.google.gson.internal.bind.DefaultDateTypeAdapter.1
        @Override // com.google.gson.y
        public final x a(j jVar, TypeToken typeToken) {
            if (typeToken.getRawType() == Date.class) {
                return new DefaultDateTypeAdapter();
            }
            return null;
        }

        public final String toString() {
            return "DefaultDateTypeAdapter#DEFAULT_STYLE_FACTORY";
        }
    };

    /* renamed from: a, reason: collision with root package name */
    public final a f6232a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f6233b;

    public DefaultDateTypeAdapter() {
        ArrayList arrayList = new ArrayList();
        this.f6233b = arrayList;
        this.f6232a = b.f6276a;
        Locale locale = Locale.US;
        arrayList.add(DateFormat.getDateTimeInstance(2, 2, locale));
        if (!Locale.getDefault().equals(locale)) {
            arrayList.add(DateFormat.getDateTimeInstance(2, 2));
        }
        if (f.f6318a >= 9) {
            arrayList.add(new SimpleDateFormat(k.m("MMM d, yyyy", " ", "h:mm:ss a"), locale));
        }
    }

    @Override // com.google.gson.x
    public final Object b(r9.a aVar) {
        Date b10;
        if (aVar.i0() == 9) {
            aVar.c0();
            return null;
        }
        String f02 = aVar.f0();
        synchronized (this.f6233b) {
            try {
                Iterator it = this.f6233b.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        try {
                            b10 = p9.a.b(f02, new ParsePosition(0));
                            break;
                        } catch (ParseException e7) {
                            StringBuilder p10 = d9.e.p("Failed parsing '", f02, "' as Date; at path ");
                            p10.append(aVar.z(true));
                            throw new r(p10.toString(), e7);
                        }
                    }
                    DateFormat dateFormat = (DateFormat) it.next();
                    TimeZone timeZone = dateFormat.getTimeZone();
                    try {
                        try {
                            b10 = dateFormat.parse(f02);
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
        this.f6232a.getClass();
        return b10;
    }

    @Override // com.google.gson.x
    public final void c(r9.b bVar, Object obj) {
        String format;
        Date date = (Date) obj;
        if (date == null) {
            bVar.C();
            return;
        }
        DateFormat dateFormat = (DateFormat) this.f6233b.get(0);
        synchronized (this.f6233b) {
            format = dateFormat.format(date);
        }
        bVar.W(format);
    }

    public final String toString() {
        DateFormat dateFormat = (DateFormat) this.f6233b.get(0);
        if (dateFormat instanceof SimpleDateFormat) {
            return "DefaultDateTypeAdapter(" + ((SimpleDateFormat) dateFormat).toPattern() + ')';
        }
        return "DefaultDateTypeAdapter(" + dateFormat.getClass().getSimpleName() + ')';
    }
}
