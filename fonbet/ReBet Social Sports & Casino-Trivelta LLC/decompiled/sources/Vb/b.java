package Vb;

import android.graphics.Paint;
import com.henninghall.date_picker.n;
import java.util.ArrayList;
import java.util.Calendar;

/* loaded from: classes3.dex */
public class b extends g {
    public b(com.henninghall.date_picker.pickers.a aVar, n nVar) {
        super(aVar, nVar);
    }

    @Override // Vb.g
    public String e() {
        return com.henninghall.date_picker.h.a(this.f12853a.v());
    }

    @Override // Vb.g
    public Paint.Align k() {
        return Paint.Align.RIGHT;
    }

    @Override // Vb.g
    public ArrayList n() {
        Calendar calendar = Calendar.getInstance();
        ArrayList arrayList = new ArrayList();
        calendar.set(2, 0);
        calendar.set(5, 1);
        for (int i10 = 1; i10 <= 31; i10++) {
            arrayList.add(h(calendar));
            calendar.add(5, 1);
        }
        return arrayList;
    }

    @Override // Vb.g
    public boolean u() {
        return this.f12853a.z() == Rb.b.date;
    }

    @Override // Vb.g
    public boolean v() {
        return true;
    }
}
