package defpackage;

import com.sofascore.model.newNetwork.mediaposts.MediaType;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final /* synthetic */ class gl6 implements Function1 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ ct8 b;
    public final /* synthetic */ int c;
    public final /* synthetic */ z39 d;

    public /* synthetic */ gl6(ct8 ct8Var, int i, z39 z39Var) {
        this.b = ct8Var;
        this.c = i;
        this.d = z39Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        z39 z39Var = this.d;
        int i2 = this.c;
        ct8 ct8Var = this.b;
        switch (i) {
            case 0:
                il6 il6Var = (il6) obj;
                il6Var.getClass();
                MediaType mediaType = MediaType.ExternalVideo;
                String str = il6Var.l;
                String str2 = il6Var.i;
                boolean z = il6Var.o;
                gv9 gv9Var = z39Var.m;
                ArrayList arrayList = new ArrayList(k13.r(gv9Var, 10));
                Iterator<E> it = gv9Var.iterator();
                while (it.hasNext()) {
                    arrayList.add(Integer.valueOf(((il6) it.next()).g));
                }
                ct8Var.invoke(new dw7(mediaType, str, str2, z, arrayList, z39Var.n), Integer.valueOf(i2), Integer.valueOf(il6Var.g));
                break;
            default:
                pw7 pw7Var = (pw7) obj;
                pw7Var.getClass();
                ct8Var.invoke(pw7Var, Integer.valueOf(i2), Integer.valueOf(((il6) z39Var.m.get(i2)).g));
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ gl6(ct8 ct8Var, z39 z39Var, int i) {
        this.b = ct8Var;
        this.d = z39Var;
        this.c = i;
    }
}
