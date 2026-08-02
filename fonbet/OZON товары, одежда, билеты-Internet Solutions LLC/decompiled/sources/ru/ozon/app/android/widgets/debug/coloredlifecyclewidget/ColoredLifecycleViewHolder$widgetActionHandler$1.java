package ru.ozon.app.android.widgets.debug.coloredlifecyclewidget;

import Tg.b;
import android.widget.Toast;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LTg/b;", "action", "", "invoke", "(LTg/b;)Ljava/lang/Boolean;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes3.dex */
final class ColoredLifecycleViewHolder$widgetActionHandler$1 extends AbstractC7737t implements Function1<b, Boolean> {
    final /* synthetic */ ColoredLifecycleViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ColoredLifecycleViewHolder$widgetActionHandler$1(ColoredLifecycleViewHolder coloredLifecycleViewHolder) {
        super(1);
        this.this$0 = coloredLifecycleViewHolder;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(b action) {
        Intrinsics.checkNotNullParameter(action, "action");
        if (!(action instanceof AtomAction.Click) || !Intrinsics.d(((AtomAction.Click) action).getId(), "preprocess")) {
            return Boolean.FALSE;
        }
        Toast.makeText(this.this$0.getContext(), "onPreProcess was invoked", 0).show();
        return Boolean.TRUE;
    }
}
