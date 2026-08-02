package defpackage;

import android.R;
import android.os.Build;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class r30 {
    public final s30 a;
    public final p30 b;
    public final p30 c;
    public final View d;

    public r30(s30 s30Var, p30 p30Var, p30 p30Var2, View view) {
        this.a = s30Var;
        this.b = p30Var;
        this.c = p30Var2;
        this.d = view;
    }

    public final boolean a(Menu menu) {
        int i;
        f8j f8jVar = (f8j) this.b.invoke();
        int i2 = 0;
        if (Intrinsics.c(f8jVar, null)) {
            return false;
        }
        menu.clear();
        List list = f8jVar.a;
        int size = list.size();
        int i3 = 1;
        int i4 = 1;
        for (int i5 = 0; i5 < size; i5++) {
            e8j e8jVar = (e8j) list.get(i5);
            if (e8jVar instanceof m8j) {
                i = i3 + 1;
                Object obj = e8jVar.a;
                m8j m8jVar = (m8j) e8jVar;
                MenuItem add = menu.add(i4, Intrinsics.c(obj, l6g.e) ? R.id.cut : Intrinsics.c(obj, l6g.f) ? R.id.copy : Intrinsics.c(obj, l6g.g) ? R.id.paste : Intrinsics.c(obj, l6g.h) ? R.id.selectAll : Intrinsics.c(obj, l6g.i) ? R.id.autofill : i3, i3, m8jVar.b);
                add.setShowAsAction(2);
                add.setOnMenuItemClickListener(new q30(i2, m8jVar, this));
            } else {
                if (e8jVar instanceof s8j) {
                    if (Build.VERSION.SDK_INT >= 28) {
                        i = i3 + 1;
                        s8j s8jVar = (s8j) e8jVar;
                        c90.a(menu, i3, this.d.getContext(), s8jVar.b, s8jVar.c);
                    }
                } else if (e8jVar instanceof q8j) {
                    i4++;
                }
            }
            i3 = i;
        }
        return true;
    }
}
