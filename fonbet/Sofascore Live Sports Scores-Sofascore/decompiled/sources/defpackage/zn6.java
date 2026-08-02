package defpackage;

import com.sofascore.model.newNetwork.Highlight;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class zn6 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Function1 b;

    public /* synthetic */ zn6(int i, Function1 function1) {
        this.a = i;
        this.b = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        long j;
        switch (this.a) {
            case 0:
                mp6 mp6Var = (mp6) obj;
                mp6Var.getClass();
                this.b.invoke(new sob(mp6Var));
                return Unit.a;
            case 1:
                mp6 mp6Var2 = (mp6) obj;
                mp6Var2.getClass();
                this.b.invoke(new sob(mp6Var2));
                return Unit.a;
            case 2:
                do7 do7Var = (do7) obj;
                do7Var.getClass();
                this.b.invoke(new yob(do7Var));
                return Unit.a;
            case 3:
                mp6 mp6Var3 = (mp6) obj;
                mp6Var3.getClass();
                this.b.invoke(new sob(mp6Var3));
                return Unit.a;
            case 4:
                mp6 mp6Var4 = (mp6) obj;
                mp6Var4.getClass();
                this.b.invoke(new fb7(mp6Var4));
                return Unit.a;
            case 5:
                this.b.invoke(new af7(((Number) obj).intValue()));
                return Unit.a;
            case 6:
                rnh rnhVar = (rnh) obj;
                synchronized (snh.c) {
                    j = snh.e;
                    snh.e = 1 + j;
                }
                return new iof(j, rnhVar, this.b);
            case 7:
                return this.b.invoke(Long.valueOf(((Number) obj).longValue() / 1000000));
            default:
                f2c f2cVar = (f2c) obj;
                f2cVar.getClass();
                if (f2cVar instanceof w1c) {
                    Function1 function1 = this.b;
                    r5c r5cVar = ((w1c) f2cVar).a;
                    Highlight highlight = r5cVar.a;
                    Highlight highlight2 = r5cVar.a;
                    function1.invoke(new xhl(highlight.getId(), highlight2.getTitle(), highlight2.getUrl()));
                }
                return Unit.a;
        }
    }
}
