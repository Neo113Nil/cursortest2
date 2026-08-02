package ru.ozon.app.android.account.adult.presenter;

import io.reactivex.p;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\u0010\u0005\u001a&\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001 \u0002*\u0012\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lio/reactivex/p;", "", "kotlin.jvm.PlatformType", "invoke", "()Lio/reactivex/p;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes6.dex */
final class AdultHandlerImpl$isUserAdultChangedObservable$2 extends AbstractC7737t implements Function0<p<Boolean>> {
    final /* synthetic */ AdultHandlerImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AdultHandlerImpl$isUserAdultChangedObservable$2(AdultHandlerImpl adultHandlerImpl) {
        super(0);
        this.this$0 = adultHandlerImpl;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final p<Boolean> invoke() {
        return this.this$0.observeUserAdultState().skip(1L).distinctUntilChanged();
    }
}
