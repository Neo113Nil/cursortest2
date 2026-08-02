package ru.ozon.app.android.pdp.widgets.wholesaleInputButton.presentation;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.ViewGroup;
import java.net.URLDecoder;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lru/ozon/uni/atoms/af/AtomAction$Click;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
final class WholesaleInputButtonWidgetViewHolder$actionHandler$1 extends AbstractC7737t implements Function1<AtomAction.Click, Unit> {
    final /* synthetic */ WholesaleInputButtonWidgetViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    WholesaleInputButtonWidgetViewHolder$actionHandler$1(WholesaleInputButtonWidgetViewHolder wholesaleInputButtonWidgetViewHolder) {
        super(1);
        this.this$0 = wholesaleInputButtonWidgetViewHolder;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(AtomAction.Click click) {
        invoke2(click);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(AtomAction.Click it) {
        Integer num;
        ViewGroup composerContainer;
        Context context;
        Intrinsics.checkNotNullParameter(it, "it");
        num = this.this$0.currentCount;
        if (num != null) {
            WholesaleInputButtonWidgetViewHolder wholesaleInputButtonWidgetViewHolder = this.this$0;
            int intValue = num.intValue();
            String decode = URLDecoder.decode(it.getLink(), "UTF-8");
            Intrinsics.f(decode);
            Intent intent = new Intent("android.intent.action.SENDTO", Uri.parse(h.X(decode, "{{quantity}}", String.valueOf(intValue), false)));
            wholesaleInputButtonWidgetViewHolder.afterMailTo = true;
            composerContainer = wholesaleInputButtonWidgetViewHolder.getComposerContainer();
            if (composerContainer == null || (context = composerContainer.getContext()) == null) {
                return;
            }
            context.startActivity(intent);
        }
    }
}
