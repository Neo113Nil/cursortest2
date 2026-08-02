package Vb;

import android.graphics.Paint;
import com.henninghall.date_picker.n;
import java.util.ArrayList;
import java.util.Calendar;

/* loaded from: classes3.dex */
public class f extends g {
    public f(com.henninghall.date_picker.pickers.a aVar, n nVar) {
        super(aVar, nVar);
    }

    @Override // Vb.g
    public String e() {
        return "LLLL";
    }

    @Override // Vb.g
    public Paint.Align k() {
        return Paint.Align.LEFT;
    }

    @Override // Vb.g
    public ArrayList n() {
        ArrayList arrayList = new ArrayList();
        Calendar calendar = Calendar.getInstance();
        calendar.set(2, 0);
        for (int i10 = 0; i10 <= 11; i10++) {
            arrayList.add(h(calendar));
            calendar.add(2, 1);
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
