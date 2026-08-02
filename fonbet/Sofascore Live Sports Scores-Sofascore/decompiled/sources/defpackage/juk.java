package defpackage;

import android.view.View;
import java.util.Comparator;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class juk implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        duk dukVar = (duk) ((View) obj).getLayoutParams();
        duk dukVar2 = (duk) ((View) obj2).getLayoutParams();
        boolean z = dukVar.a;
        return z != dukVar2.a ? z ? 1 : -1 : dukVar.e - dukVar2.e;
    }
}
