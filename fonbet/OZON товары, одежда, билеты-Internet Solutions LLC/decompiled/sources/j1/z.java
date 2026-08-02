package j1;

import androidx.compose.ui.focus.FocusTargetNode;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;

/* loaded from: classes8.dex */
final class z extends AbstractC7737t implements Function0<Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ FocusTargetNode f68749b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    z(FocusTargetNode focusTargetNode) {
        super(0);
        this.f68749b = focusTargetNode;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        this.f68749b.N1();
        return Unit.f71690a;
    }
}
