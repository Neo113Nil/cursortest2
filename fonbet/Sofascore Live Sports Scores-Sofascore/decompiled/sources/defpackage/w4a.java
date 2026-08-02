package defpackage;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final /* synthetic */ class w4a implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ x4a b;

    public /* synthetic */ w4a(x4a x4aVar, int i) {
        this.a = i;
        this.b = x4aVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        x4a x4aVar = this.b;
        jyj jyjVar = (jyj) obj;
        switch (i) {
            case 0:
                jyjVar.getClass();
                x4a x4aVar2 = (x4a) jyjVar;
                w8l w8lVar = x4aVar.p;
                if (!Intrinsics.c(x4aVar2.o, w8lVar)) {
                    x4aVar2.o = w8lVar;
                    x4aVar2.l1();
                }
                return iyj.b;
            default:
                jyjVar.getClass();
                x4aVar.o = ((x4a) jyjVar).p;
                return Boolean.FALSE;
        }
    }
}
