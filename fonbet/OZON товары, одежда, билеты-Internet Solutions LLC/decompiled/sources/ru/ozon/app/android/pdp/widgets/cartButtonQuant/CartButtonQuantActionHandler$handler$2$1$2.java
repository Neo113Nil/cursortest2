package ru.ozon.app.android.pdp.widgets.cartButtonQuant;

import Tl.b;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lru/ozon/uni/atoms/af/AtomAction$Click;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
final class CartButtonQuantActionHandler$handler$2$1$2 extends AbstractC7737t implements Function1<AtomAction.Click, Unit> {
    final /* synthetic */ CartQuantView $this_with;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CartButtonQuantActionHandler$handler$2$1$2(CartQuantView cartQuantView) {
        super(1);
        this.$this_with = cartQuantView;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(AtomAction.Click click) {
        invoke2(click);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(AtomAction.Click click) {
        String str;
        Function1<String, Unit> showinfoDigitalModal;
        if (b.i(click, "it", "addToCart")) {
            Map<String, String> params = click.getParams();
            if (params != null && (str = params.get("infoDigitalModalDeeplink")) != null && (showinfoDigitalModal = this.$this_with.getShowinfoDigitalModal()) != null) {
                showinfoDigitalModal.invoke(str);
            }
            Map<String, String> params2 = click.getParams();
            String str2 = params2 != null ? params2.get("recommendationsDeeplink") : null;
            AtomAction parseAdditionalAction = CartButtonQuantActionHandler.INSTANCE.parseAdditionalAction(click.getParams());
            Function2<String, AtomAction, Unit> onAddToCartClick = this.$this_with.getOnAddToCartClick();
            if (onAddToCartClick != null) {
                onAddToCartClick.invoke(str2, parseAdditionalAction);
            }
        }
    }
}
