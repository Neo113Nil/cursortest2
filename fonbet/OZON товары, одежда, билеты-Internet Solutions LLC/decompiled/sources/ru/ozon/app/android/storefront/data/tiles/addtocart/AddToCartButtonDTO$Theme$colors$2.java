package ru.ozon.app.android.storefront.data.tiles.addtocart;

import Sc.o;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.storefront.data.tiles.addtocart.AddToCartButtonDTO;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lru/ozon/app/android/storefront/data/tiles/addtocart/AddToCartButtonDTO$Theme$Colors;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
final class AddToCartButtonDTO$Theme$colors$2 extends AbstractC7737t implements Function0<AddToCartButtonDTO.Theme.Colors> {
    final /* synthetic */ AddToCartButtonDTO.Theme this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AddToCartButtonDTO$Theme$colors$2(AddToCartButtonDTO.Theme theme) {
        super(0);
        this.this$0 = theme;
    }

    @Override // kotlin.jvm.functions.Function0
    public final AddToCartButtonDTO.Theme.Colors invoke() {
        AddToCartButtonDTO.Theme.Colors resolveColors;
        AddToCartButtonDTO.Theme theme = this.this$0;
        if (theme instanceof AddToCartButtonDTO.Theme.StyleWrapper) {
            resolveColors = AddToCartButtonDTOKt.resolveColors(((AddToCartButtonDTO.Theme.StyleWrapper) theme).getStyle());
            return resolveColors;
        }
        if (theme instanceof AddToCartButtonDTO.Theme.Colors) {
            return (AddToCartButtonDTO.Theme.Colors) theme;
        }
        throw new o();
    }
}
