package com.google.gson.internal.bind;

import Jb.c;
import com.google.gson.TypeAdapter;
import com.google.gson.internal.d;
import com.google.gson.internal.i;
import com.google.gson.q;
import com.google.gson.v;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Objects;

/* loaded from: classes3.dex */
public final class DefaultDateTypeAdapter<T extends Date> extends TypeAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final b f38124a;

    /* renamed from: b, reason: collision with root package name */
    public final List f38125b;

    public static abstract class b {

        /* renamed from: b, reason: collision with root package name */
        public static final b f38126b = new a(Date.class);

        /* renamed from: a, reason: collision with root package name */
        public final Class f38127a;

        public class a extends b {
            public a(Class cls) {
                super(cls);
            }

            @Override // com.google.gson.internal.bind.DefaultDateTypeAdapter.b
            public Date d(Date date) {
                return date;
            }
        }

        public b(Class cls) {
            this.f38127a = cls;
        }

        public final v a(int i10, int i11) {
            return c(new DefaultDateTypeAdapter(this, i10, i11));
        }

        public final v b(String str) {
            return c(new DefaultDateTypeAdapter(this, str));
        }

        public final v c(DefaultDateTypeAdapter defaultDateTypeAdapter) {
            return TypeAdapters.b(this.f38127a, defaultDateTypeAdapter);
        }

        public abstract Date d(Date date);
    }

    private Date a(Jb.a aVar) {
        String M02 = aVar.M0();
        synchronized (this.f38125b) {
            try {
                Iterator it = this.f38125b.iterator();
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
        if (aVar.Y1() == Jb.b.NULL) {
            aVar.n1();
            return null;
        }
        return this.f38124a.d(a(aVar));
    }

    @Override // com.google.gson.TypeAdapter
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public void write(c cVar, Date date) {
        String format;
        if (date == null) {
            cVar.T1();
            return;
        }
        DateFormat dateFormat = (DateFormat) this.f38125b.get(0);
        synchronized (this.f38125b) {
            format = dateFormat.format(date);
        }
        cVar.k2(format);
    }

    public String toString() {
        DateFormat dateFormat = (DateFormat) this.f38125b.get(0);
        if (dateFormat instanceof SimpleDateFormat) {
            return "DefaultDateTypeAdapter(" + ((SimpleDateFormat) dateFormat).toPattern() + ')';
        }
        return "DefaultDateTypeAdapter(" + dateFormat.getClass().getSimpleName() + ')';
    }

    public DefaultDateTypeAdapter(b bVar, String str) {
        ArrayList arrayList = new ArrayList();
        this.f38125b = arrayList;
        Objects.requireNonNull(bVar);
        this.f38124a = bVar;
        Locale locale = Locale.US;
        arrayList.add(new SimpleDateFormat(str, locale));
        if (Locale.getDefault().equals(locale)) {
            return;
        }
        arrayList.add(new SimpleDateFormat(str));
    }

    public DefaultDateTypeAdapter(b bVar, int i10, int i11) {
        ArrayList arrayList = new ArrayList();
        this.f38125b = arrayList;
        Objects.requireNonNull(bVar);
        this.f38124a = bVar;
        Locale locale = Locale.US;
        arrayList.add(DateFormat.getDateTimeInstance(i10, i11, locale));
        if (!Locale.getDefault().equals(locale)) {
            arrayList.add(DateFormat.getDateTimeInstance(i10, i11));
        }
        if (d.d()) {
            arrayList.add(i.c(i10, i11));
        }
    }
}
