package defpackage;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Iterator;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class pg2 implements Iterable, eia {
    public final /* synthetic */ Calendar a;
    public final /* synthetic */ SimpleDateFormat b;

    public pg2(Calendar calendar, SimpleDateFormat simpleDateFormat) {
        this.a = calendar;
        this.b = simpleDateFormat;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new og2(new fg2(this.a), new fg2(), 2, 1, null, new oi(this.b, 3));
    }
}
