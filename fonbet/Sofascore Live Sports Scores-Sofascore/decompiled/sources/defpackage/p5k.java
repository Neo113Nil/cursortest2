package defpackage;

import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class p5k extends anf {
    public final /* synthetic */ TypeVariable p;
    public final /* synthetic */ anf q;

    public p5k(TypeVariable typeVariable, anf anfVar) {
        super(4);
        this.p = typeVariable;
        this.q = anfVar;
    }

    @Override // defpackage.anf
    public final Type e(TypeVariable typeVariable, p5k p5kVar) {
        return typeVariable.getGenericDeclaration().equals(this.p.getGenericDeclaration()) ? typeVariable : this.q.e(typeVariable, p5kVar);
    }
}
