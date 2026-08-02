package defpackage;

import java.io.IOException;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class sq7 extends jn8 {
    public final /* synthetic */ int b = 0;
    public boolean c;
    public final Function1 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sq7(ejh ejhVar, Function1 function1) {
        super(ejhVar);
        ejhVar.getClass();
        this.d = function1;
    }

    @Override // defpackage.jn8, defpackage.ejh
    public final void W(x52 x52Var, long j) {
        int i = this.b;
        Function1 function1 = this.d;
        switch (i) {
            case 0:
                x52Var.getClass();
                if (this.c) {
                    x52Var.skip(j);
                    break;
                } else {
                    try {
                        this.a.W(x52Var, j);
                        break;
                    } catch (IOException e) {
                        this.c = true;
                        function1.invoke(e);
                        return;
                    }
                }
            default:
                if (this.c) {
                    x52Var.skip(j);
                    break;
                } else {
                    try {
                        super.W(x52Var, j);
                        break;
                    } catch (IOException e2) {
                        this.c = true;
                        ((oo) function1).invoke(e2);
                    }
                }
        }
    }

    @Override // defpackage.jn8, defpackage.ejh, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        int i = this.b;
        Function1 function1 = this.d;
        switch (i) {
            case 0:
                try {
                    super.close();
                    break;
                } catch (IOException e) {
                    this.c = true;
                    function1.invoke(e);
                }
            default:
                try {
                    super.close();
                    break;
                } catch (IOException e2) {
                    this.c = true;
                    ((oo) function1).invoke(e2);
                    return;
                }
        }
    }

    @Override // defpackage.jn8, defpackage.ejh, java.io.Flushable
    public final void flush() {
        int i = this.b;
        Function1 function1 = this.d;
        switch (i) {
            case 0:
                if (!this.c) {
                    try {
                        super.flush();
                        break;
                    } catch (IOException e) {
                        this.c = true;
                        function1.invoke(e);
                    }
                }
                break;
            default:
                try {
                    super.flush();
                    break;
                } catch (IOException e2) {
                    this.c = true;
                    ((oo) function1).invoke(e2);
                    return;
                }
        }
    }

    public sq7(ejh ejhVar, oo ooVar) {
        super(ejhVar);
        this.d = ooVar;
    }
}
