package ru.ozon.app.android.regulardraw.widgets.lotteryResult.core;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import l20.C7854a;
import ru.ozon.app.android.regulardraw.widgets.lotteryResult.presentation.LotteryResultVI;
import ru.ozon.composer.compose.widget.i;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ll20/a;", "invoke", "()Ll20/a;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes13.dex */
final class LotteryResultWidgetKt$LotteryResultWidget$1$3$2$1$actionHandler$1$1 extends AbstractC7737t implements Function0<C7854a> {
    final /* synthetic */ i<LotteryResultVI> $this_content;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    LotteryResultWidgetKt$LotteryResultWidget$1$3$2$1$actionHandler$1$1(i<LotteryResultVI> iVar) {
        super(0);
        this.$this_content = iVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final C7854a invoke() {
        return this.$this_content.getViewItem();
    }
}
