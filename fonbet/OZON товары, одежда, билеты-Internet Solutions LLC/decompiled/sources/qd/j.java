package qd;

import java.util.Arrays;
import java.util.Collection;
import kotlin.jvm.functions.Function0;
import td.InterfaceC9827S;

/* loaded from: classes.dex */
final class j implements Function0<Collection<InterfaceC9827S>> {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ m f81834a;

    j(m mVar) {
        this.f81834a = mVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Collection<InterfaceC9827S> invoke() {
        m mVar = this.f81834a;
        return Arrays.asList(mVar.q().v(s.f81865l), mVar.q().v(s.f81867n), mVar.q().v(s.f81868o), mVar.q().v(s.f81866m));
    }
}
