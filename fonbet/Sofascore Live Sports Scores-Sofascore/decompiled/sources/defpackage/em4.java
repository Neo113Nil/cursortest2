package defpackage;

import java.io.Serializable;

/* loaded from: classes6.dex */
public final class em4 extends IllegalStateException {
    public final /* synthetic */ int a;
    public Serializable b;

    public em4(xh9 xh9Var) {
        this.a = 2;
        xh9Var.getClass();
        this.b = "Response already received: " + xh9Var;
    }

    @Override // java.lang.Throwable
    public Throwable getCause() {
        switch (this.a) {
            case 0:
                return (Exception) this.b;
            case 1:
                return (Exception) this.b;
            default:
                return super.getCause();
        }
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        switch (this.a) {
            case 2:
                return (String) this.b;
            default:
                return super.getMessage();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ em4(String str, int i) {
        super(str);
        this.a = i;
    }
}
