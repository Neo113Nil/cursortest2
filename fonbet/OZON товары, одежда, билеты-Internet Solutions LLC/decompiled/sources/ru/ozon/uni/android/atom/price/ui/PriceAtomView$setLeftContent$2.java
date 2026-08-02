package ru.ozon.uni.android.atom.price.ui;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.uni.atoms.data.price.PriceDTO;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lru/ozon/uni/atoms/data/price/PriceDTO$Component;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
final class PriceAtomView$setLeftContent$2 extends AbstractC7737t implements Function1<PriceDTO.Component, CharSequence> {
    public static final PriceAtomView$setLeftContent$2 INSTANCE = new PriceAtomView$setLeftContent$2();

    PriceAtomView$setLeftContent$2() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final CharSequence invoke(PriceDTO.Component it) {
        Intrinsics.checkNotNullParameter(it, "it");
        String text = it.getText();
        if (text != null) {
            return text;
        }
        String icon = it.getIcon();
        return icon != null ? icon : "";
    }
}
