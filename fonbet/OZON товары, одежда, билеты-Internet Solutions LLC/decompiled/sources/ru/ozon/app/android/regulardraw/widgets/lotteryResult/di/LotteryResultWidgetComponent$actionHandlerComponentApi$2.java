package ru.ozon.app.android.regulardraw.widgets.lotteryResult.di;

import Ug.a;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LUg/a;", "invoke", "()LUg/a;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes13.dex */
final class LotteryResultWidgetComponent$actionHandlerComponentApi$2 extends AbstractC7737t implements Function0<a> {
    final /* synthetic */ C7475g $storage;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    LotteryResultWidgetComponent$actionHandlerComponentApi$2(C7475g c7475g) {
        super(0);
        this.$storage = c7475g;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final a invoke() {
        return (a) this.$storage.getComponent(a.class);
    }
}
