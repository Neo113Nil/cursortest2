package ru.ozon.app.android.ugc.core.widgets.commentsListV3.presentation.commentV3;

import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.U;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.pdp.utils.ComposerExtKt;
import ru.ozon.uni.android.haptic.HapticToken;
import ru.ozon.uni.android.haptic.HapticVibrator;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "isSelected", "", "action", "Lru/ozon/uni/atoms/af/AtomAction;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
final class CommentFooterView$bind$onAction$1 extends AbstractC7737t implements Function2<Boolean, AtomAction, Unit> {
    final /* synthetic */ Function1<AtomAction, Unit> $actionHandler;
    final /* synthetic */ CommentFooterView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    CommentFooterView$bind$onAction$1(CommentFooterView commentFooterView, Function1<? super AtomAction, Unit> function1) {
        super(2);
        this.this$0 = commentFooterView;
        this.$actionHandler = function1;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Boolean bool, AtomAction atomAction) {
        invoke(bool.booleanValue(), atomAction);
        return Unit.f71690a;
    }

    public final void invoke(boolean z11, AtomAction action) {
        Intrinsics.checkNotNullParameter(action, "action");
        if (action instanceof AtomAction.Click) {
            AtomAction.Click click = (AtomAction.Click) action;
            if (Intrinsics.d(click.getId(), "like")) {
                if (!z11) {
                    HapticVibrator.INSTANCE.vibrate(this.this$0, HapticToken.HEAVY);
                }
                action = ComposerExtKt.addAdditionalParams(click, (Map<String, String>) U.i(new Pair("isReactionSelected", String.valueOf(z11))));
            }
        }
        this.$actionHandler.invoke(action);
    }
}
