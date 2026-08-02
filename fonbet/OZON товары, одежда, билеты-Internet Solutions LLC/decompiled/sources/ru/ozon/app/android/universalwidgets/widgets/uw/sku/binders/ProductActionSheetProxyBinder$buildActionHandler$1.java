package ru.ozon.app.android.universalwidgets.widgets.uw.sku.binders;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.product.TileActionSheetHandler;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "Lru/ozon/uni/atoms/af/AtomAction;", "invoke", "(Lru/ozon/uni/atoms/af/AtomAction;)Ljava/lang/Boolean;"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
final class ProductActionSheetProxyBinder$buildActionHandler$1 extends AbstractC7737t implements Function1<AtomAction, Boolean> {
    final /* synthetic */ ProductActionSheetProxyBinder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ProductActionSheetProxyBinder$buildActionHandler$1(ProductActionSheetProxyBinder productActionSheetProxyBinder) {
        super(1);
        this.this$0 = productActionSheetProxyBinder;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(AtomAction it) {
        TileActionSheetHandler tileActionSheetHandler;
        Intrinsics.checkNotNullParameter(it, "it");
        tileActionSheetHandler = this.this$0.atomActionSheetHandler;
        return Boolean.valueOf(tileActionSheetHandler != null ? tileActionSheetHandler.handle(it) : false);
    }
}
