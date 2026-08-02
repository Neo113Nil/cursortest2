package Vb;

import android.graphics.Paint;
import com.henninghall.date_picker.n;
import java.util.ArrayList;
import java.util.Calendar;

/* loaded from: classes3.dex */
public class a extends g {
    public a(com.henninghall.date_picker.pickers.a aVar, n nVar) {
        super(aVar, nVar);
    }

    @Override // Vb.g
    public String e() {
        return this.f12853a.f38606o.g() ? " a " : "";
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
        calendar.set(11, 0);
        arrayList.add(this.f12857e.format(calendar.getTime()));
        calendar.add(11, 12);
        arrayList.add(this.f12857e.format(calendar.getTime()));
        return arrayList;
    }

    @Override // Vb.g
    public boolean u() {
        return this.f12853a.f38606o.g() && this.f12853a.z() != Rb.b.date;
    }

    @Override // Vb.g
    public boolean v() {
        return false;
    }
}
