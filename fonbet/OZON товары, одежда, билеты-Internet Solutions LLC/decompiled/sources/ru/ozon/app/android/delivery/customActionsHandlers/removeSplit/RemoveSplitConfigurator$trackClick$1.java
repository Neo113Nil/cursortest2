package ru.ozon.app.android.delivery.customActionsHandlers.removeSplit;

import Sc.s;
import WZ.l;
import WZ.t;
import Wc.a;
import Y9.b;
import android.content.Intent;
import com.squareup.moshi.D;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import ru.ozon.android.composerCommonViewKit.parsing.JsonParser;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.analytics.modules.tokenized.TokenizedAnalyticsExtensionsKt;
import ru.ozon.app.android.composer.ConfiguratorReferences;
import ru.ozon.app.android.composer.TrackingInfoMapperKt;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.delivery.customActionsHandlers.removeSplit.RemoveSplitConfigurator$trackClick$1", f = "RemoveSplitConfigurator.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes11.dex */
final class RemoveSplitConfigurator$trackClick$1 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ Intent $data;
    int label;
    final /* synthetic */ RemoveSplitConfigurator this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RemoveSplitConfigurator$trackClick$1(Intent intent, RemoveSplitConfigurator removeSplitConfigurator, d<? super RemoveSplitConfigurator$trackClick$1> dVar) {
        super(2, dVar);
        this.$data = intent;
        this.this$0 = removeSplitConfigurator;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new RemoveSplitConfigurator$trackClick$1(this.$data, this.this$0, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        String str;
        JsonParser jsonParser;
        l tokenizedAnalytics;
        a aVar = a.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        s.b(obj);
        b e11 = D.e(Map.class, String.class, TokenizedTrackingInfo.class);
        Intent intent = this.$data;
        Long l11 = intent != null ? new Long(intent.getLongExtra("EXTRA_WIDGET_ID", 0L)) : null;
        Intent intent2 = this.$data;
        if (intent2 == null || (str = intent2.getStringExtra("EXTRA_RETURN_TRACKING_INFO")) == null) {
            str = "";
        }
        jsonParser = this.this$0.jsonDeserializer;
        t tokenizedEvent$default = TrackingInfoMapperKt.toTokenizedEvent$default((Map) jsonParser.fromJson(str, e11), l11, null, 2, null);
        ConfiguratorReferences references = this.this$0.getReferences();
        if (references != null && (tokenizedAnalytics = references.getTokenizedAnalytics()) != null) {
            TokenizedAnalyticsExtensionsKt.processClickEvents$default(tokenizedAnalytics, tokenizedEvent$default, null, 2, null);
        }
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((RemoveSplitConfigurator$trackClick$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
