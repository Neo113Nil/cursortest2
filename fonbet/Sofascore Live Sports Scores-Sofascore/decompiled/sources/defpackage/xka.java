package defpackage;

import java.io.Serializable;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public abstract class xka implements mt8, Serializable {
    private final int arity;

    public xka(int i) {
        this.arity = i;
    }

    @Override // defpackage.mt8
    public int getArity() {
        return this.arity;
    }

    @NotNull
    public String toString() {
        String renderLambdaToString = duf.a.renderLambdaToString(this);
        renderLambdaToString.getClass();
        return renderLambdaToString;
    }
}
