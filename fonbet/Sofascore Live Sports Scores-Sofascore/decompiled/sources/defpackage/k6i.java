package defpackage;

import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final /* synthetic */ class k6i implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ r6i b;

    public /* synthetic */ k6i(r6i r6iVar, int i) {
        this.a = i;
        this.b = r6iVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i;
        int i2 = this.a;
        r6i r6iVar = this.b;
        switch (i2) {
            case 0:
                Iterator it = r6iVar.g.iterator();
                int i3 = 0;
                while (it.hasNext()) {
                    i3 += ((View) it.next()).getHeight();
                }
                return Boolean.valueOf(i3 == 0);
            case 1:
                return Boolean.valueOf(r6iVar.p);
            default:
                ArrayList arrayList = r6iVar.i;
                ListIterator listIterator = arrayList.listIterator(arrayList.size());
                while (true) {
                    if (!listIterator.hasPrevious()) {
                        i = -1;
                    } else if (((m6i) listIterator.previous()) instanceof o6i) {
                        i = listIterator.nextIndex();
                    }
                }
                return Integer.valueOf(i);
        }
    }
}
