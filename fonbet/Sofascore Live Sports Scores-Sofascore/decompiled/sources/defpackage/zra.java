package defpackage;

import java.util.ArrayList;
import kotlin.Pair;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class zra {
    public final /* synthetic */ ArrayList a;

    public zra(ArrayList arrayList) {
        this.a = arrayList;
    }

    public final void a(long j, tc3 tc3Var) {
        if (j != Long.MIN_VALUE && j <= -4611686018427387904L) {
            a70.p("You may not specify item ids less than -4611686018427387904 in a Glance\nwidget. These are reserved.");
        } else {
            this.a.add(new Pair(Long.valueOf(j), tc3Var));
        }
    }
}
