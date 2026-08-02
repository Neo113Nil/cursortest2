package com.google.gson.internal.bind;

import Jb.c;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.internal.d;
import com.google.gson.internal.i;
import com.google.gson.q;
import com.google.gson.reflect.TypeToken;
import com.google.gson.v;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.ParsePosition;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* loaded from: classes3.dex */
public final class DateTypeAdapter extends TypeAdapter {

    /* renamed from: b, reason: collision with root package name */
    public static final v f38122b = new v() { // from class: com.google.gson.internal.bind.DateTypeAdapter.1
        @Override // com.google.gson.v
        public TypeAdapter create(Gson gson, TypeToken typeToken) {
            if (typeToken.getRawType() == Date.class) {
                return new DateTypeAdapter();
            }
            return null;
        }
    };

    /* renamed from: a, reason: collision with root package name */
    public final List f38123a;

    public DateTypeAdapter() {
        ArrayList arrayList = new ArrayList();
        this.f38123a = arrayList;
        Locale locale = Locale.US;
        arrayList.add(DateFormat.getDateTimeInstance(2, 2, locale));
        if (!Locale.getDefault().equals(locale)) {
            arrayList.add(DateFormat.getDateTimeInstance(2, 2));
        }
        if (d.d()) {
            arrayList.add(i.c(2, 2));
        }
    }

    public final Date a(Jb.a aVar) {
        String M02 = aVar.M0();
        synchronized (this.f38123a) {
            try {
                Iterator it = this.f38123a.iterator();
                while (it.hasNext()) {
                    try {
                        return ((DateFormat) it.next()).parse(M02);
                    } catch (ParseException unused) {
                    }
                }
                try {
                    return Hb.a.c(M02, new ParsePosition(0));
                } catch (ParseException e10) {
                    throw new q("Failed parsing '" + M02 + "' as Date; at path " + aVar.U(), e10);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.google.gson.TypeAdapter
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public Date read(Jb.a aVar) {
        if (aVar.Y1() != Jb.b.NULL) {
            return a(aVar);
        }
        aVar.n1();
        return null;
    }

    @Override // com.google.gson.TypeAdapter
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public void write(c cVar, Date date) {
        String format;
        if (date == null) {
            cVar.T1();
            return;
        }
        DateFormat dateFormat = (DateFormat) this.f38123a.get(0);
        synchronized (this.f38123a) {
            format = dateFormat.format(date);
        }
        cVar.k2(format);
    }
}
