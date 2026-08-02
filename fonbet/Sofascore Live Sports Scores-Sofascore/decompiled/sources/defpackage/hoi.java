package defpackage;

import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public abstract class hoi extends sq3 implements mt8 {
    private final int arity;

    public hoi(int i, rq3 rq3Var) {
        super(rq3Var);
        this.arity = i;
    }

    @Override // defpackage.mt8
    public int getArity() {
        return this.arity;
    }

    @Override // defpackage.h21
    @NotNull
    public String toString() {
        if (getCompletion() != null) {
            return super.toString();
        }
        String renderLambdaToString = duf.a.renderLambdaToString(this);
        renderLambdaToString.getClass();
        return renderLambdaToString;
    }
}
