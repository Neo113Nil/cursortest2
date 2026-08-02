package defpackage;

import java.io.IOException;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class sgi extends IOException {
    public final tp5 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sgi(tp5 tp5Var) {
        super("stream was reset: " + tp5Var);
        tp5Var.getClass();
        this.a = tp5Var;
    }
}
