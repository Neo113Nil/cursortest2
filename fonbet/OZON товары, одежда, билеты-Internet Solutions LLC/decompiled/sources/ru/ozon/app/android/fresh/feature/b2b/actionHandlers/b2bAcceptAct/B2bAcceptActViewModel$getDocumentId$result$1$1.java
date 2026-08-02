package ru.ozon.app.android.fresh.feature.b2b.actionHandlers.b2bAcceptAct;

import Sc.s;
import Wc.a;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import ru.ozon.android.composerCommonViewKit.parsing.JsonParser;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)Ljava/lang/String;"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.fresh.feature.b2b.actionHandlers.b2bAcceptAct.B2bAcceptActViewModel$getDocumentId$result$1$1", f = "B2bAcceptActViewModel.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes12.dex */
final class B2bAcceptActViewModel$getDocumentId$result$1$1 extends j implements Function2<M, d<? super String>, Object> {
    final /* synthetic */ JsonParser $jsonDeserializer;
    final /* synthetic */ String $postData;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    B2bAcceptActViewModel$getDocumentId$result$1$1(JsonParser jsonParser, String str, d<? super B2bAcceptActViewModel$getDocumentId$result$1$1> dVar) {
        super(2, dVar);
        this.$jsonDeserializer = jsonParser;
        this.$postData = str;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new B2bAcceptActViewModel$getDocumentId$result$1$1(this.$jsonDeserializer, this.$postData, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        s.b(obj);
        Object obj2 = ((Map) this.$jsonDeserializer.fromJson(this.$postData, Map.class)).get("documentId");
        if (obj2 instanceof String) {
            return (String) obj2;
        }
        return null;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super String> dVar) {
        return ((B2bAcceptActViewModel$getDocumentId$result$1$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
