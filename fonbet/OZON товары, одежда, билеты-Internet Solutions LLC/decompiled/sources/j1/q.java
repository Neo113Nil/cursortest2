package j1;

import androidx.compose.ui.focus.FocusTargetNode;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;

/* loaded from: classes8.dex */
final class q extends AbstractC7737t implements Function1<FocusTargetNode, Boolean> {

    /* renamed from: b, reason: collision with root package name */
    public static final q f68737b = new q(1);

    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(FocusTargetNode focusTargetNode) {
        Boolean i11 = y.i(focusTargetNode, 7);
        return Boolean.valueOf(i11 != null ? i11.booleanValue() : false);
    }
}
