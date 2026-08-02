package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final /* synthetic */ class wbj implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Function0 b;
    public final /* synthetic */ Function0 c;

    public /* synthetic */ wbj(Function0 function0, Function0 function02, int i) {
        this.a = i;
        this.b = function0;
        this.c = function02;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        Function0 function0 = this.c;
        Function0 function02 = this.b;
        switch (i) {
            case 0:
                r8j r8jVar = (r8j) obj;
                function02.invoke();
                if (function0 != null ? ((Boolean) function0.invoke()).booleanValue() : true) {
                    r8jVar.close();
                }
                return Unit.a;
            default:
                ell ellVar = (ell) obj;
                ellVar.getClass();
                if (Intrinsics.c(ellVar, dll.a)) {
                    function02.invoke();
                } else {
                    if (!Intrinsics.c(ellVar, cll.a)) {
                        zzl.b();
                        return null;
                    }
                    function0.invoke();
                }
                return Unit.a;
        }
    }
}
