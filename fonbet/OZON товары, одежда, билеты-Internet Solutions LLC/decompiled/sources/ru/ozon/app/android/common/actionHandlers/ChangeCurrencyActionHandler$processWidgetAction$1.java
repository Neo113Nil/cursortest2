package ru.ozon.app.android.common.actionHandlers;

import Sc.s;
import Tg.b;
import Vg.f;
import WZ.t;
import Wc.a;
import io.reactivex.AbstractC7094b;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.account.currency.CurrencyRepository;
import ru.ozon.app.android.analytics.modules.tokenized.TokenizedAnalyticsExtensionsKt;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.TrackingInfoMapperKt;
import ru.ozon.uni.atoms.af.AtomAction;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.common.actionHandlers.ChangeCurrencyActionHandler$processWidgetAction$1", f = "ChangeCurrencyActionHandler.kt", l = {54}, m = "invokeSuspend")
/* loaded from: classes11.dex */
final class ChangeCurrencyActionHandler$processWidgetAction$1 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ b $action;
    final /* synthetic */ String $link;
    final /* synthetic */ Map<String, String> $params;
    final /* synthetic */ ComposerReferences $refs;
    final /* synthetic */ f.a $widgetInfo;
    int label;
    final /* synthetic */ ChangeCurrencyActionHandler this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ChangeCurrencyActionHandler$processWidgetAction$1(ChangeCurrencyActionHandler changeCurrencyActionHandler, String str, Map<String, String> map, ComposerReferences composerReferences, f.a aVar, b bVar, d<? super ChangeCurrencyActionHandler$processWidgetAction$1> dVar) {
        super(2, dVar);
        this.this$0 = changeCurrencyActionHandler;
        this.$link = str;
        this.$params = map;
        this.$refs = composerReferences;
        this.$widgetInfo = aVar;
        this.$action = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new ChangeCurrencyActionHandler$processWidgetAction$1(this.this$0, this.$link, this.$params, this.$refs, this.$widgetInfo, this.$action, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        CurrencyRepository currencyRepository;
        t mapToTokenizedEvent$default;
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        try {
            if (i11 == 0) {
                s.b(obj);
                currencyRepository = this.this$0.currencyRepository;
                AbstractC7094b changeCurrency = currencyRepository.changeCurrency(this.$link, this.$params);
                this.label = 1;
                if (Ge.f.a(changeCurrency, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                s.b(obj);
            }
            this.$refs.getController().update(new UpdateCellRadioSelectionKey(this.$widgetInfo.c().f()));
            Map<String, TokenizedTrackingInfo> trackingInfo = ((AtomAction.ComposerAction) this.$action).getTrackingInfo();
            if (trackingInfo != null && (mapToTokenizedEvent$default = TrackingInfoMapperKt.mapToTokenizedEvent$default(trackingInfo, new Long(this.$widgetInfo.c().f()), null, 2, null)) != null) {
                TokenizedAnalyticsExtensionsKt.processNonViewEvents$default(this.$refs.getTokenizedAnalytics(), mapToTokenizedEvent$default, null, 2, null);
            }
        } finally {
            try {
                return Unit.f71690a;
            } finally {
            }
        }
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((ChangeCurrencyActionHandler$processWidgetAction$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
