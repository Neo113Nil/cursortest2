package qe;

import kotlin.jvm.functions.Function1;

/* renamed from: qe.B, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
final class C9027B implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    private final AbstractC9028C f81937a;

    public C9027B(AbstractC9028C abstractC9028C) {
        this.f81937a = abstractC9028C;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return Integer.valueOf(AbstractC9028C.a(this.f81937a, (String) obj));
    }
}
