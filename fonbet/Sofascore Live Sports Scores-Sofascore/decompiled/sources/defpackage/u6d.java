package defpackage;

import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final /* synthetic */ class u6d implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ p6d b;

    public /* synthetic */ u6d(p6d p6dVar, int i) {
        this.a = i;
        this.b = p6dVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        boolean contains;
        int i = this.a;
        p6d p6dVar = this.b;
        String str = (String) obj;
        switch (i) {
            case 0:
                str.getClass();
                contains = p6dVar.c().contains(str);
                break;
            default:
                str.getClass();
                contains = p6dVar.c().contains(str);
                break;
        }
        return Boolean.valueOf(!contains);
    }
}
