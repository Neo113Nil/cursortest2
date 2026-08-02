package Vb;

import android.graphics.Paint;
import com.henninghall.date_picker.n;
import java.util.ArrayList;
import java.util.Calendar;

/* loaded from: classes3.dex */
public class h extends g {

    /* renamed from: f, reason: collision with root package name */
    public int f12858f;

    /* renamed from: g, reason: collision with root package name */
    public int f12859g;

    public h(com.henninghall.date_picker.pickers.a aVar, n nVar) {
        super(aVar, nVar);
        this.f12858f = 1900;
        this.f12859g = 2100;
    }

    @Override // Vb.g
    public String e() {
        return com.henninghall.date_picker.h.g(this.f12853a.v());
    }

    @Override // Vb.g
    public Paint.Align k() {
        return Paint.Align.RIGHT;
    }

    @Override // Vb.g
    public ArrayList n() {
        ArrayList arrayList = new ArrayList();
        Calendar calendar = Calendar.getInstance();
        int x10 = x();
        int w10 = w() - x10;
        calendar.set(1, x10);
        for (int i10 = 0; i10 <= w10; i10++) {
            arrayList.add(h(calendar));
            calendar.add(1, 1);
        }
        return arrayList;
    }

    @Override // Vb.g
    public boolean u() {
        return this.f12853a.z() == Rb.b.date;
    }

    @Override // Vb.g
    public boolean v() {
        return false;
    }

    public final int w() {
        return this.f12853a.w() == null ? this.f12859g : this.f12853a.w().get(1);
    }

    public final int x() {
        return this.f12853a.x() == null ? this.f12858f : this.f12853a.x().get(1);
    }
}
