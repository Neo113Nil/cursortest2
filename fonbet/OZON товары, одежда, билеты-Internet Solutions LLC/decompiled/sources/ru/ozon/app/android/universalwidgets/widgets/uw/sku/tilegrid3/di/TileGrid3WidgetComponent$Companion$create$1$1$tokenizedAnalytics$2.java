package ru.ozon.app.android.universalwidgets.widgets.uw.sku.tilegrid3.di;

import WZ.l;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.composer.di.composer.RetainComposerComponentApi;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LWZ/l;", "invoke", "()LWZ/l;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes2.dex */
final class TileGrid3WidgetComponent$Companion$create$1$1$tokenizedAnalytics$2 extends AbstractC7737t implements Function0<l> {
    final /* synthetic */ TileGrid3WidgetComponent$Companion$create$1$1 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TileGrid3WidgetComponent$Companion$create$1$1$tokenizedAnalytics$2(TileGrid3WidgetComponent$Companion$create$1$1 tileGrid3WidgetComponent$Companion$create$1$1) {
        super(0);
        this.this$0 = tileGrid3WidgetComponent$Companion$create$1$1;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final l invoke() {
        RetainComposerComponentApi retainComposerComponentApi;
        retainComposerComponentApi = this.this$0.retainComposerComponentApi;
        return retainComposerComponentApi.getTokenizedAnalytics();
    }
}
