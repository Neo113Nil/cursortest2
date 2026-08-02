package Vb;

import android.graphics.Paint;
import com.henninghall.date_picker.n;
import com.henninghall.date_picker.o;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;

/* loaded from: classes3.dex */
public class c extends g {

    /* renamed from: h, reason: collision with root package name */
    public static int f12849h = 150;

    /* renamed from: f, reason: collision with root package name */
    public String f12850f;

    /* renamed from: g, reason: collision with root package name */
    public HashMap f12851g;

    public c(com.henninghall.date_picker.pickers.a aVar, n nVar) {
        super(aVar, nVar);
    }

    public final Calendar A() {
        Calendar w10 = this.f12853a.w();
        Calendar x10 = this.f12853a.x();
        if (x10 != null) {
            return (Calendar) x10.clone();
        }
        if (w10 != null) {
            Calendar calendar = (Calendar) w10.clone();
            calendar.add(5, (-calendar.getActualMaximum(6)) / 2);
            return calendar;
        }
        Calendar A10 = this.f12853a.A();
        A10.add(5, (-f12849h) / 2);
        return A10;
    }

    public final String B(Calendar calendar) {
        return this.f12857e.format(calendar.getTime());
    }

    public final Calendar C(Calendar calendar) {
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        return calendar;
    }

    public final String D(String str) {
        String i10 = o.i(this.f12853a.u());
        return Character.isUpperCase(str.charAt(0)) ? o.a(i10) : i10;
    }

    @Override // Vb.g
    public String e() {
        return com.henninghall.date_picker.h.b(this.f12853a.u()).replace("EEEE", "EEE").replace("MMMM", "MMM");
    }

    @Override // Vb.g
    public Paint.Align k() {
        return Paint.Align.RIGHT;
    }

    @Override // Vb.g
    public ArrayList n() {
        ArrayList arrayList = new ArrayList();
        this.f12851g = new HashMap();
        Calendar A10 = A();
        Calendar z10 = z();
        do {
            String B10 = B(A10);
            arrayList.add(B10);
            this.f12851g.put(B10, w(A10));
            if (o.f(A10)) {
                this.f12850f = B10;
            }
            A10.add(5, 1);
        } while (!C((Calendar) A10.clone()).after(z10));
        return arrayList;
    }

    @Override // Vb.g
    public String s(String str) {
        return str.equals(this.f12850f) ? D(str) : (String) this.f12851g.get(str);
    }

    @Override // Vb.g
    public boolean u() {
        return this.f12853a.z() == Rb.b.datetime;
    }

    @Override // Vb.g
    public boolean v() {
        return false;
    }

    public final String w(Calendar calendar) {
        return x().format(calendar.getTime());
    }

    public final SimpleDateFormat x() {
        return new SimpleDateFormat(y(), this.f12853a.u());
    }

    public final String y() {
        return com.henninghall.date_picker.h.d(this.f12853a.v());
    }

    public final Calendar z() {
        Calendar w10 = this.f12853a.w();
        Calendar x10 = this.f12853a.x();
        if (w10 != null) {
            return (Calendar) w10.clone();
        }
        if (x10 != null) {
            Calendar calendar = (Calendar) x10.clone();
            calendar.add(5, calendar.getActualMaximum(6) / 2);
            return calendar;
        }
        Calendar A10 = this.f12853a.A();
        A10.add(5, f12849h / 2);
        return A10;
    }
}
