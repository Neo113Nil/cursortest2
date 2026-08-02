package ru.ozon.app.android.checkoutgeo.location;

import io.reactivex.InterfaceC7095c;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;

/* JADX INFO: Add missing generic type declarations: [TResult] */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u000e\u0010\u0003\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "TResult", "it", "kotlin.jvm.PlatformType", "invoke", "(Ljava/lang/Object;)V"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
final class GoogleLocationDataSourceImpl$asCompletable$1$1<TResult> extends AbstractC7737t implements Function1<TResult, Unit> {
    final /* synthetic */ InterfaceC7095c $emitter;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    GoogleLocationDataSourceImpl$asCompletable$1$1(InterfaceC7095c interfaceC7095c) {
        super(1);
        this.$emitter = interfaceC7095c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Object obj) {
        invoke2((GoogleLocationDataSourceImpl$asCompletable$1$1<TResult>) obj);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(TResult tresult) {
        this.$emitter.onComplete();
    }
}
