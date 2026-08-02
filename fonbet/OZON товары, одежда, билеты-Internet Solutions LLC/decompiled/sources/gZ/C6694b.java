package gZ;

import iZ.C7036c;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import xe.C10720e0;

/* renamed from: gZ.b, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
final class C6694b extends AbstractC7737t implements Function0<C7036c> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ C6695c f64169b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C6694b(C6695c c6695c) {
        super(0);
        this.f64169b = c6695c;
    }

    @Override // kotlin.jvm.functions.Function0
    public final C7036c invoke() {
        iZ.f fVar;
        C7036c.a aVar;
        C6695c c6695c = this.f64169b;
        fVar = c6695c.f64171b;
        if (fVar == null) {
            return null;
        }
        aVar = c6695c.f64172c;
        return aVar.a(c6695c.e(), fVar, C10720e0.a());
    }
}
