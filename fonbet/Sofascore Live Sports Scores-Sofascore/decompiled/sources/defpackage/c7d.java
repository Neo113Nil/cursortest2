package defpackage;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final /* synthetic */ class c7d implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ axj b;

    public /* synthetic */ c7d(axj axjVar, int i) {
        this.a = i;
        this.b = axjVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        axj axjVar = this.b;
        switch (i) {
            case 0:
                return Boolean.valueOf(axjVar.g.h() != Long.MIN_VALUE);
            case 1:
                if (Intrinsics.c(((eoh) axjVar.d).getValue(), axjVar.a.w()) && axjVar.g.h() == Long.MIN_VALUE && !((Boolean) ((eoh) axjVar.h).getValue()).booleanValue()) {
                    r1 = false;
                }
                return Boolean.valueOf(r1);
            default:
                return Long.valueOf(axjVar.b());
        }
    }
}
