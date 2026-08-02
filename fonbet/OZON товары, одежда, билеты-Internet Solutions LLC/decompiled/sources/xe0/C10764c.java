package xe0;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import xe.B0;
import xe.H0;

/* renamed from: xe0.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C10764c extends AbstractC7737t implements Function0<Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ AbstractC10765d f105519b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C10764c(AbstractC10765d abstractC10765d) {
        super(0);
        this.f105519b = abstractC10765d;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        B0 r11 = this.f105519b.r();
        if (r11 != null) {
            ((H0) r11).j(null);
        }
        return Unit.f71690a;
    }
}
