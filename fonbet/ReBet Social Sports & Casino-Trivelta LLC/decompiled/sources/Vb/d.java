package Vb;

import android.graphics.Paint;
import com.henninghall.date_picker.n;
import i3.C4527h;
import java.util.ArrayList;
import java.util.Calendar;

/* loaded from: classes3.dex */
public class d extends g {

    /* renamed from: f, reason: collision with root package name */
    public final com.henninghall.date_picker.g f12852f;

    public d(com.henninghall.date_picker.pickers.a aVar, n nVar) {
        super(aVar, nVar);
        this.f12852f = new com.henninghall.date_picker.g(this.f12853a);
    }

    @Override // Vb.g
    public String e() {
        return this.f12853a.f38606o.g() ? C4527h.f48087o : "HH";
    }

    @Override // Vb.g
    public Paint.Align k() {
        return Paint.Align.RIGHT;
    }

    @Override // Vb.g
    public ArrayList n() {
        Calendar calendar = Calendar.getInstance();
        calendar.set(2000, 0, 0, 0, 0, 0);
        ArrayList arrayList = new ArrayList();
        int i10 = this.f12853a.f38606o.g() ? 12 : 24;
        for (int i11 = 0; i11 < i10; i11++) {
            arrayList.add(this.f12857e.format(calendar.getTime()));
            calendar.add(11, 1);
        }
        return arrayList;
    }

    @Override // Vb.g
    public String s(String str) {
        return this.f12852f.b(str);
    }

    @Override // Vb.g
    public boolean u() {
        return this.f12853a.z() != Rb.b.date;
    }

    @Override // Vb.g
    public boolean v() {
        return true;
    }
}
