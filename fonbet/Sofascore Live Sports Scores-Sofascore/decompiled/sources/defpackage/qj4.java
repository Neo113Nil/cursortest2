package defpackage;

import androidx.compose.runtime.e;
import java.time.LocalDate;
import java.util.Locale;
import kotlin.ranges.IntRange;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class qj4 {
    public final IntRange a;
    public final Locale b;
    public final kg2 c;
    public final e1d d;
    public final e1d e;
    public e1d f;
    public e1d g;

    public qj4(Long l, IntRange intRange, di4 di4Var, Locale locale) {
        this.a = intRange;
        this.b = locale;
        kg2 kg2Var = new kg2(locale);
        this.c = kg2Var;
        this.d = e.f(di4Var);
        lg2 b = kg2Var.b(l.longValue());
        if (!intRange.d(b.a)) {
            eg2 d = kg2Var.d();
            b = kg2Var.c(LocalDate.of(d.a, d.b, 1));
        }
        this.e = e.f(b);
    }

    public final Long a() {
        eg2 eg2Var = (eg2) ((eoh) this.f).getValue();
        if (eg2Var != null) {
            return Long.valueOf(eg2Var.d);
        }
        return null;
    }
}
