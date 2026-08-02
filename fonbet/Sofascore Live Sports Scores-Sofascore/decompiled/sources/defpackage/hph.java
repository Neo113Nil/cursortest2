package defpackage;

import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final /* synthetic */ class hph implements fja {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ wd8 b;
    public final /* synthetic */ Object c;

    public /* synthetic */ hph(wd8 wd8Var, e1d e1dVar) {
        this.b = wd8Var;
        this.c = e1dVar;
    }

    @Override // defpackage.fja
    public final void a(y9j y9jVar) {
        int i = this.a;
        wd8 wd8Var = this.b;
        Object obj = this.c;
        switch (i) {
            case 0:
                wd8.a(wd8Var);
                ((e1d) obj).setValue(Boolean.FALSE);
                break;
            default:
                ((Function0) obj).invoke();
                wd8.a(wd8Var);
                break;
        }
    }

    public /* synthetic */ hph(Function0 function0, wd8 wd8Var) {
        this.c = function0;
        this.b = wd8Var;
    }
}
