package yh0;

import P4.f;
import fh0.C6568c;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;

/* renamed from: yh0.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C10904b extends AbstractC7737t implements Function0<String> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ C6568c f106651b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ boolean f106652c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C10904b(C6568c c6568c, boolean z11) {
        super(0);
        this.f106651b = c6568c;
        this.f106652c = z11;
    }

    @Override // kotlin.jvm.functions.Function0
    public final String invoke() {
        C6568c c6568c = this.f106651b;
        int n11 = c6568c.n();
        boolean r11 = c6568c.r();
        StringBuilder f7 = f.f(n11, "Will NOT show notification with id ", " because titleOrBodyIsNotBlank = ");
        f7.append(this.f106652c);
        f7.append(", silent = ");
        f7.append(r11);
        return f7.toString();
    }
}
