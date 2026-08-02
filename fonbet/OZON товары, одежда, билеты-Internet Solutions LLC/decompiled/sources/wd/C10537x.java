package wd;

import java.util.Collection;
import java.util.Iterator;
import je.F0;
import kotlin.jvm.functions.Function0;
import td.InterfaceC9857w;

/* renamed from: wd.x, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
final class C10537x implements Function0<Collection<InterfaceC9857w>> {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ F0 f104340a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ AbstractC10539z f104341b;

    C10537x(AbstractC10539z abstractC10539z, F0 f02) {
        this.f104341b = abstractC10539z;
        this.f104340a = f02;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Collection<InterfaceC9857w> invoke() {
        te.h hVar = new te.h();
        Iterator<? extends InterfaceC9857w> it = this.f104341b.o().iterator();
        while (it.hasNext()) {
            hVar.add(it.next().b2(this.f104340a));
        }
        return hVar;
    }
}
