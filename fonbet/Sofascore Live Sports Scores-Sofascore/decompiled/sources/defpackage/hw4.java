package defpackage;

import androidx.work.impl.WorkDatabase;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final /* synthetic */ class hw4 implements Callable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ hw4(int i, Object obj, Object obj2, Object obj3) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        int i = this.a;
        Object obj = this.d;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (i) {
            case 0:
                return ((iw4) obj3).a.submit(new mc3(24, (Callable) obj2, (t9d) obj));
            default:
                String str = (String) obj;
                WorkDatabase workDatabase = ((g8f) obj3).e;
                scl h = workDatabase.h();
                h.getClass();
                str.getClass();
                ((ArrayList) obj2).addAll((List) gz8.S(h.a, true, false, new cfi(str, 20)));
                return workDatabase.g().e(str);
        }
    }
}
