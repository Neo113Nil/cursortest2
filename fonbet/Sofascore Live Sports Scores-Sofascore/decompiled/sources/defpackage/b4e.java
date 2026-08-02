package defpackage;

import java.util.Collection;
import java.util.Iterator;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class b4e extends sq3 {
    public Function2 r;
    public Collection s;
    public Iterator t;
    public Object u;
    public /* synthetic */ Object v;
    public final /* synthetic */ d4e w;
    public int x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b4e(d4e d4eVar, sq3 sq3Var) {
        super(sq3Var);
        this.w = d4eVar;
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        this.v = obj;
        this.x |= Integer.MIN_VALUE;
        return this.w.a(null, this);
    }
}
