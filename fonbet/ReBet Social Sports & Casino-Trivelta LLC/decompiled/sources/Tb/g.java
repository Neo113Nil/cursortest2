package Tb;

import android.view.View;
import com.henninghall.date_picker.n;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TimeZone;

/* loaded from: classes3.dex */
public class g implements f {

    /* renamed from: a, reason: collision with root package name */
    public final i f11405a;

    /* renamed from: b, reason: collision with root package name */
    public final n f11406b;

    /* renamed from: c, reason: collision with root package name */
    public final e f11407c;

    /* renamed from: d, reason: collision with root package name */
    public final View f11408d;

    /* renamed from: e, reason: collision with root package name */
    public c f11409e;

    /* renamed from: f, reason: collision with root package name */
    public Set f11410f = new HashSet();

    public g(i iVar, n nVar, e eVar, View view) {
        this.f11405a = iVar;
        this.f11407c = eVar;
        this.f11406b = nVar;
        this.f11408d = view;
    }

    @Override // Tb.f
    public void a(Vb.g gVar) {
        if (this.f11405a.A()) {
            return;
        }
        if (!d()) {
            Calendar e10 = e();
            if (e10 != null) {
                this.f11407c.c(e10);
                return;
            }
            return;
        }
        Calendar g10 = g();
        if (g10 == null) {
            return;
        }
        Calendar x10 = this.f11406b.x();
        if (x10 != null && g10.before(x10)) {
            this.f11407c.c(x10);
            return;
        }
        Calendar w10 = this.f11406b.w();
        if (w10 != null && g10.after(w10)) {
            this.f11407c.c(w10);
            return;
        }
        String e11 = this.f11407c.e();
        this.f11407c.i(g10);
        com.henninghall.date_picker.e.d(g10, e11, this.f11406b.q(), this.f11408d);
    }

    @Override // Tb.f
    public void b(Vb.g gVar) {
        c cVar = this.f11405a.A() ? c.spinning : c.idle;
        if (cVar.equals(this.f11409e)) {
            return;
        }
        this.f11409e = cVar;
        com.henninghall.date_picker.e.e(cVar, this.f11406b.q(), this.f11408d);
        Iterator it = this.f11410f.iterator();
        while (it.hasNext()) {
            ((d) it.next()).a(cVar);
        }
    }

    public void c(d dVar) {
        this.f11410f.add(dVar);
    }

    public final boolean d() {
        SimpleDateFormat f10 = f();
        String r10 = this.f11405a.r();
        try {
            f10.setLenient(false);
            f10.parse(r10);
            return true;
        } catch (ParseException unused) {
            return false;
        }
    }

    public final Calendar e() {
        SimpleDateFormat f10 = f();
        f10.setLenient(false);
        for (int i10 = 0; i10 < 10; i10++) {
            try {
                String s10 = this.f11405a.s(i10);
                Calendar calendar = Calendar.getInstance(this.f11406b.D());
                calendar.setTime(f10.parse(s10));
                return calendar;
            } catch (ParseException unused) {
            }
        }
        return null;
    }

    public final SimpleDateFormat f() {
        TimeZone D10 = this.f11406b.D();
        SimpleDateFormat d10 = this.f11407c.d();
        d10.setTimeZone(D10);
        return d10;
    }

    public final Calendar g() {
        SimpleDateFormat f10 = f();
        String r10 = this.f11405a.r();
        Calendar calendar = Calendar.getInstance(this.f11406b.D());
        try {
            f10.setLenient(true);
            calendar.setTime(f10.parse(r10));
            return calendar;
        } catch (ParseException e10) {
            e10.printStackTrace();
            return null;
        }
    }
}
