package defpackage;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.s;
import java.util.ArrayList;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class ep8 implements dp8 {
    public final String a;
    public final int b;
    public final int c;
    public final /* synthetic */ s d;

    public ep8(s sVar, String str, int i, int i2) {
        this.d = sVar;
        this.a = str;
        this.b = i;
        this.c = i2;
    }

    @Override // defpackage.dp8
    public final boolean a(ArrayList arrayList, ArrayList arrayList2) {
        Fragment fragment = this.d.A;
        if (fragment != null && this.b < 0 && this.a == null && fragment.getChildFragmentManager().W(-1, 0)) {
            return false;
        }
        return this.d.X(arrayList, arrayList2, this.a, this.b, this.c);
    }
}
