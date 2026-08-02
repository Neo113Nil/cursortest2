package defpackage;

import android.graphics.Bitmap;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final /* synthetic */ class xz4 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Function1 b;
    public final /* synthetic */ e1d c;

    public /* synthetic */ xz4(Function1 function1, e1d e1dVar, int i) {
        this.a = i;
        this.b = function1;
        this.c = e1dVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        e1d e1dVar = this.c;
        Function1 function1 = this.b;
        switch (i) {
            case 0:
                String str = (String) obj;
                str.getClass();
                e1dVar.setValue(str);
                function1.invoke(str);
                break;
            case 1:
                Boolean bool = (Boolean) obj;
                boolean booleanValue = bool.booleanValue();
                e1dVar.setValue(bool);
                function1.invoke(new zvb(booleanValue));
                break;
            case 2:
                ie8 ie8Var = (ie8) obj;
                ie8Var.getClass();
                e1dVar.setValue(Boolean.valueOf(ie8Var.d()));
                if (function1 != null) {
                    function1.invoke(Boolean.valueOf(ie8Var.d()));
                }
                break;
            case 3:
                Bitmap bitmap = (Bitmap) obj;
                bitmap.getClass();
                e1dVar.setValue(Boolean.FALSE);
                function1.invoke(bitmap);
                break;
            default:
                e1dVar.setValue(Boolean.valueOf(!((Boolean) e1dVar.getValue()).booleanValue()));
                Boolean bool2 = (Boolean) e1dVar.getValue();
                bool2.getClass();
                function1.invoke(bool2);
                break;
        }
        return Unit.a;
    }
}
