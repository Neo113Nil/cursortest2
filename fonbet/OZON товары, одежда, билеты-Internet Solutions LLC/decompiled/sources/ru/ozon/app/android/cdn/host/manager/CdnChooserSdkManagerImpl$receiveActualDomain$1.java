package ru.ozon.app.android.cdn.host.manager;

import ZY.a;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;

@Metadata(d1 = {"\u0000\f\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"", "LZY/a$c;", "invoke", "()Ljava/util/List;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes6.dex */
final class CdnChooserSdkManagerImpl$receiveActualDomain$1 extends AbstractC7737t implements Function0<List<? extends a.c>> {
    final /* synthetic */ CdnChooserSdkManagerImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CdnChooserSdkManagerImpl$receiveActualDomain$1(CdnChooserSdkManagerImpl cdnChooserSdkManagerImpl) {
        super(0);
        this.this$0 = cdnChooserSdkManagerImpl;
    }

    @Override // kotlin.jvm.functions.Function0
    public final List<? extends a.c> invoke() {
        YY.a aVar;
        aVar = this.this$0.cdnChooserSdk;
        return ((a) aVar.a().getValue()).b();
    }
}
