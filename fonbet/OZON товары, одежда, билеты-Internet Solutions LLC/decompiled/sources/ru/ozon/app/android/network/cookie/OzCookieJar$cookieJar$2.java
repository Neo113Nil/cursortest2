package ru.ozon.app.android.network.cookie;

import Ob0.a;
import We.InterfaceC4875q;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LWe/q;", "invoke", "()LWe/q;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes6.dex */
final class OzCookieJar$cookieJar$2 extends AbstractC7737t implements Function0<InterfaceC4875q> {
    final /* synthetic */ OzCookieJar this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    OzCookieJar$cookieJar$2(OzCookieJar ozCookieJar) {
        super(0);
        this.this$0 = ozCookieJar;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final InterfaceC4875q invoke() {
        a aVar;
        aVar = this.this$0.ozonIdAppApi;
        return aVar.getCookieJar();
    }
}
