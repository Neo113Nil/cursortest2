package defpackage;

import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.TimeZone;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class og2 implements Iterator, eia {
    public final fg2 a;
    public final int b;
    public final int c;
    public final Function1 d;
    public final Calendar e;
    public Integer f;

    public og2(fg2 fg2Var, fg2 fg2Var2, int i, int i2, Integer num, Function1 function1) {
        this.a = fg2Var2;
        this.b = i;
        this.c = i2;
        this.d = function1;
        Calendar calendar = Calendar.getInstance();
        calendar.getClass();
        fg2Var.b(calendar);
        calendar.setTimeZone(TimeZone.getTimeZone("GMT"));
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        this.e = calendar;
        this.f = num;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int d = this.a.d();
        Calendar calendar = this.e;
        return d >= (calendar.get(5) | ((calendar.get(1) << 9) | (calendar.get(2) << 5)));
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i;
        Calendar calendar = this.e;
        Date time = calendar.getTime();
        time.getClass();
        Object invoke = this.d.invoke(time);
        Integer num = this.f;
        if (num != null) {
            this.f = null;
            i = num.intValue();
        } else {
            i = this.c;
        }
        calendar.add(this.b, i);
        return invoke;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
