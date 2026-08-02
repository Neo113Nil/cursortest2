package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final /* synthetic */ class bkb implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ b9j b;

    public /* synthetic */ bkb(b9j b9jVar, int i) {
        this.a = i;
        this.b = b9jVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        b9j b9jVar = this.b;
        switch (i) {
            case 0:
                b9jVar.a(((dnd) obj).a, k03.f);
                break;
            case 1:
                mze mzeVar = (mze) obj;
                b9jVar.d(qea.E(mzeVar, false));
                mzeVar.a();
                break;
            default:
                mze mzeVar2 = (mze) obj;
                b9jVar.d(qea.E(mzeVar2, false));
                mzeVar2.a();
                break;
        }
        return Unit.a;
    }
}
