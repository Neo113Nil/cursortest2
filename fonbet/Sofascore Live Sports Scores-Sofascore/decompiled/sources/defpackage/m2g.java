package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public abstract class m2g extends l2g implements mt8 {
    private final int r;

    public m2g(int i, rq3 rq3Var) {
        super(rq3Var);
        this.r = i;
    }

    @Override // defpackage.mt8
    public final int getArity() {
        return this.r;
    }

    @Override // defpackage.h21
    public final String toString() {
        if (getCompletion() != null) {
            return super.toString();
        }
        String renderLambdaToString = duf.a.renderLambdaToString(this);
        renderLambdaToString.getClass();
        return renderLambdaToString;
    }
}
