package oi;

import j$.util.Objects;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes3.dex */
public class q extends RuntimeException {
    private final int code;
    private final String message;
    private final transient s0<?> response;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public q(s0 s0Var) {
        super(r0.toString());
        Objects.requireNonNull(s0Var, "response == null");
        StringBuilder sb2 = new StringBuilder("HTTP ");
        gh.o0 o0Var = s0Var.f21334a;
        sb2.append(o0Var.f10276d);
        sb2.append(" ");
        sb2.append(o0Var.f10275c);
        this.code = o0Var.f10276d;
        this.message = o0Var.f10275c;
        this.response = s0Var;
    }

    public int code() {
        return this.code;
    }

    public String message() {
        return this.message;
    }

    public s0<?> response() {
        return this.response;
    }
}
