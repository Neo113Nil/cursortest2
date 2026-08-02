package ru.ozon.app.android.universalwidgets.widgets.uw.sku.tilescroll.di;

import android.content.Context;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.di.provider.component.ContextComponentDependencies;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroid/content/Context;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
final class TileScrollComponent$Companion$create$1$1$appContext$2 extends AbstractC7737t implements Function0<Context> {
    final /* synthetic */ TileScrollComponent$Companion$create$1$1 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TileScrollComponent$Companion$create$1$1$appContext$2(TileScrollComponent$Companion$create$1$1 tileScrollComponent$Companion$create$1$1) {
        super(0);
        this.this$0 = tileScrollComponent$Companion$create$1$1;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final Context invoke() {
        ContextComponentDependencies contextComponentDependencies;
        contextComponentDependencies = this.this$0.contextDependencies;
        return contextComponentDependencies.getContext();
    }
}
