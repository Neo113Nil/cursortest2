package ru.ozon.app.android.network.cronet;

import We.G;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LWe/G;", "invoke", "()LWe/G;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes6.dex */
final class CronetQuicChecker$h2HeadRequest$2 extends AbstractC7737t implements Function0<G> {
    final /* synthetic */ CronetQuicChecker this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CronetQuicChecker$h2HeadRequest$2(CronetQuicChecker cronetQuicChecker) {
        super(0);
        this.this$0 = cronetQuicChecker;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final G invoke() {
        String str;
        G.a aVar = new G.a();
        aVar.f(null, "HEAD");
        str = this.this$0.apiUrl;
        aVar.k(str + "composer-api.bx/_action/appConnectionCheckH2");
        aVar.i(Object.class, "quic_check_request_tag");
        return aVar.b();
    }
}
