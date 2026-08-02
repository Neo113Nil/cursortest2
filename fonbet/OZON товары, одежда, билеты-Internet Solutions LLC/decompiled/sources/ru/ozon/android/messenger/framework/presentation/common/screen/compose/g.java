package ru.ozon.android.messenger.framework.presentation.common.screen.compose;

import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;

/* loaded from: classes10.dex */
final class g extends AbstractC7737t implements Function0<Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Function1<Map<String, TokenizedTrackingInfo>, Unit> f91074b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ Map<String, TokenizedTrackingInfo> f91075c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    g(Function1<? super Map<String, TokenizedTrackingInfo>, Unit> function1, Map<String, TokenizedTrackingInfo> map) {
        super(0);
        this.f91074b = function1;
        this.f91075c = map;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        Function1<Map<String, TokenizedTrackingInfo>, Unit> function1 = this.f91074b;
        if (function1 != null) {
            function1.invoke(this.f91075c);
        }
        return Unit.f71690a;
    }
}
