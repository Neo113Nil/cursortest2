package Vb;

import android.graphics.Paint;
import com.henninghall.date_picker.n;
import java.util.ArrayList;
import java.util.Calendar;

/* loaded from: classes3.dex */
public class e extends g {
    public e(com.henninghall.date_picker.pickers.a aVar, n nVar) {
        super(aVar, nVar);
    }

    @Override // Vb.g
    public String e() {
        return "mm";
    }

    @Override // Vb.g
    public Paint.Align k() {
        return this.f12853a.f38606o.f() ? Paint.Align.LEFT : Paint.Align.RIGHT;
    }

    @Override // Vb.g
    public ArrayList n() {
        Calendar calendar = Calendar.getInstance();
        ArrayList arrayList = new ArrayList();
        int i10 = 0;
        calendar.set(12, 0);
        while (i10 < 60) {
            arrayList.add(this.f12857e.format(calendar.getTime()));
            calendar.add(12, this.f12853a.y());
            i10 += this.f12853a.y();
        }
        return arrayList;
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
