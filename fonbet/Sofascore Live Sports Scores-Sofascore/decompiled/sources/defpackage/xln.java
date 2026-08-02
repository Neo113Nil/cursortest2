package defpackage;

import android.view.ViewGroup;
import java.util.HashSet;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public abstract class xln implements l21 {
    public final ViewGroup a;
    public final z3p b;
    public final HashSet c;
    public nxn d;
    public boolean e;

    public xln(ViewGroup viewGroup) {
        m3p m3pVar = q3p.b;
        v4p v4pVar = v4p.e;
        this.b = f4p.g;
        this.c = new HashSet();
        this.d = null;
        this.e = false;
        this.a = viewGroup;
    }

    @Override // defpackage.l21
    public final ViewGroup a() {
        return this.a;
    }
}
