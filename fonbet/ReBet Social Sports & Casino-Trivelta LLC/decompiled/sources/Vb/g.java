package Vb;

import android.graphics.Paint;
import com.henninghall.date_picker.n;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import java.util.Locale;

/* loaded from: classes3.dex */
public abstract class g {

    /* renamed from: a, reason: collision with root package name */
    public final n f12853a;

    /* renamed from: b, reason: collision with root package name */
    public Calendar f12854b;

    /* renamed from: c, reason: collision with root package name */
    public ArrayList f12855c = new ArrayList();

    /* renamed from: d, reason: collision with root package name */
    public com.henninghall.date_picker.pickers.a f12856d;

    /* renamed from: e, reason: collision with root package name */
    public SimpleDateFormat f12857e;

    public g(com.henninghall.date_picker.pickers.a aVar, n nVar) {
        this.f12853a = nVar;
        this.f12856d = aVar;
        this.f12857e = new SimpleDateFormat(e(), nVar.u());
        aVar.setTextAlign(k());
        aVar.setWrapSelectorWheel(v());
    }

    public void a(Calendar calendar) {
        this.f12856d.b(g(calendar));
    }

    public String b() {
        return s(m(f()));
    }

    public final String[] c(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(s((String) it.next()));
        }
        return (String[]) arrayList2.toArray(new String[0]);
    }

    public final SimpleDateFormat d(Locale locale) {
        return new SimpleDateFormat(e(), locale);
    }

    public abstract String e();

    public final int f() {
        return this.f12856d.getValue();
    }

    public final int g(Calendar calendar) {
        this.f12857e.setTimeZone(this.f12853a.D());
        return this.f12855c.indexOf(this.f12857e.format(calendar.getTime()));
    }

    public String h(Calendar calendar) {
        return j(calendar, this.f12853a.u());
    }

    public String i(int i10) {
        if (!u()) {
            return this.f12857e.format(this.f12854b.getTime());
        }
        int size = this.f12855c.size();
        return m(((f() + size) - i10) % size);
    }

    public final String j(Calendar calendar, Locale locale) {
        return d(locale).format(calendar.getTime());
    }

    public abstract Paint.Align k();

    public String l() {
        return !u() ? this.f12857e.format(this.f12854b.getTime()) : m(f());
    }

    public String m(int i10) {
        return (String) this.f12855c.get(i10);
    }

    public abstract ArrayList n();

    public final void o() {
        this.f12856d.setMinValue(0);
        this.f12856d.setMaxValue(0);
        ArrayList n10 = n();
        this.f12855c = n10;
        this.f12856d.setDisplayedValues(c(n10));
        this.f12856d.setMaxValue(this.f12855c.size() - 1);
    }

    public void p() {
        this.f12857e = new SimpleDateFormat(e(), this.f12853a.u());
        if (u()) {
            o();
        }
    }

    public void q(String str) {
        this.f12856d.setDividerColor(str);
    }

    public void r(Calendar calendar) {
        this.f12857e.setTimeZone(this.f12853a.D());
        this.f12854b = calendar;
        int g10 = g(calendar);
        if (g10 > -1) {
            if (this.f12856d.getValue() == 0) {
                this.f12856d.setValue(g10);
            } else {
                this.f12856d.b(g10);
            }
        }
    }

    public void t() {
        this.f12856d.setVisibility(u() ? 0 : 8);
    }

    public abstract boolean u();

    public abstract boolean v();

    public String s(String str) {
        return str;
    }
}
