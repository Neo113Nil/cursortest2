package com.henninghall.date_picker;

import com.facebook.hermes.intl.Constants;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.devsupport.StackTraceHelper;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Locale;
import java.util.TimeZone;

/* loaded from: classes3.dex */
public class n {

    /* renamed from: a, reason: collision with root package name */
    public Calendar f38592a = null;

    /* renamed from: b, reason: collision with root package name */
    public final Sb.a f38593b = new Sb.a();

    /* renamed from: c, reason: collision with root package name */
    public final Sb.j f38594c = new Sb.j();

    /* renamed from: d, reason: collision with root package name */
    public final Sb.f f38595d = new Sb.f();

    /* renamed from: e, reason: collision with root package name */
    public final Sb.l f38596e = new Sb.l();

    /* renamed from: f, reason: collision with root package name */
    public final Sb.i f38597f = new Sb.i();

    /* renamed from: g, reason: collision with root package name */
    public final Sb.h f38598g = new Sb.h();

    /* renamed from: h, reason: collision with root package name */
    public final Sb.g f38599h = new Sb.g();

    /* renamed from: i, reason: collision with root package name */
    public final Sb.m f38600i = new Sb.m();

    /* renamed from: j, reason: collision with root package name */
    public final Sb.c f38601j = new Sb.c();

    /* renamed from: k, reason: collision with root package name */
    public final Sb.e f38602k = new Sb.e();

    /* renamed from: l, reason: collision with root package name */
    public final Sb.d f38603l = new Sb.d();

    /* renamed from: m, reason: collision with root package name */
    public final Sb.b f38604m = new Sb.b();

    /* renamed from: n, reason: collision with root package name */
    public final HashMap f38605n = new a();

    /* renamed from: o, reason: collision with root package name */
    public d f38606o = new d(this);

    public class a extends HashMap {
        public a() {
            put("date", n.this.f38593b);
            put("mode", n.this.f38594c);
            put(Constants.LOCALE, n.this.f38595d);
            put("textColor", n.this.f38596e);
            put("minuteInterval", n.this.f38597f);
            put("minimumDate", n.this.f38598g);
            put("maximumDate", n.this.f38599h);
            put("timezoneOffsetInMinutes", n.this.f38600i);
            put("height", n.this.f38601j);
            put("is24hourSource", n.this.f38602k);
            put(StackTraceHelper.ID_KEY, n.this.f38603l);
            put("dividerColor", n.this.f38604m);
        }
    }

    public Calendar A() {
        Calendar o10 = o();
        int y10 = y();
        if (y10 <= 1) {
            return o10;
        }
        o10.add(12, -(Integer.parseInt(new SimpleDateFormat("mm", u()).format(o10.getTime())) % y10));
        return (Calendar) o10.clone();
    }

    public final Sb.k B(String str) {
        return (Sb.k) this.f38605n.get(str);
    }

    public String C() {
        return (String) this.f38596e.a();
    }

    public TimeZone D() {
        try {
            String str = (String) this.f38600i.a();
            if (str != null && !str.equals("")) {
                int parseInt = Integer.parseInt(str);
                int abs = Math.abs(parseInt);
                char c10 = parseInt < 0 ? '-' : '+';
                int floor = (int) Math.floor(abs / 60.0f);
                return TimeZone.getTimeZone("GMT" + c10 + floor + ":" + o.k(abs - (floor * 60)));
            }
            return TimeZone.getDefault();
        } catch (Exception e10) {
            e10.printStackTrace();
            return TimeZone.getDefault();
        }
    }

    public void E(Calendar calendar) {
        this.f38592a = calendar;
    }

    public void F(String str, Dynamic dynamic) {
        B(str).b(dynamic);
    }

    public final Calendar m(Sb.k kVar) {
        Calendar g10 = o.g((String) kVar.a(), D());
        n(g10);
        return g10;
    }

    public final void n(Calendar calendar) {
        if (calendar == null) {
            return;
        }
        calendar.set(13, 0);
        calendar.set(14, 0);
    }

    public final Calendar o() {
        return o.g(s(), D());
    }

    public String p() {
        return (String) this.f38604m.a();
    }

    public String q() {
        return (String) this.f38603l.a();
    }

    public Rb.a r() {
        return (Rb.a) this.f38602k.a();
    }

    public String s() {
        return (String) this.f38593b.a();
    }

    public Calendar t() {
        return this.f38592a;
    }

    public Locale u() {
        return (Locale) this.f38595d.a();
    }

    public String v() {
        return this.f38595d.f();
    }

    public Calendar w() {
        return m(this.f38599h);
    }

    public Calendar x() {
        return m(this.f38598g);
    }

    public int y() {
        return ((Integer) this.f38597f.a()).intValue();
    }

    public Rb.b z() {
        return (Rb.b) this.f38594c.a();
    }
}
