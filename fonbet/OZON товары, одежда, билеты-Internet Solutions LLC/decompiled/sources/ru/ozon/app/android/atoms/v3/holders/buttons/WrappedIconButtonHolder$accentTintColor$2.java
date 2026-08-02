package ru.ozon.app.android.atoms.v3.holders.buttons;

import android.content.Context;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Integer;"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class WrappedIconButtonHolder$accentTintColor$2 extends AbstractC7737t implements Function0<Integer> {
    final /* synthetic */ WrappedIconButtonHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    WrappedIconButtonHolder$accentTintColor$2(WrappedIconButtonHolder wrappedIconButtonHolder) {
        super(0);
        this.this$0 = wrappedIconButtonHolder;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final Integer invoke() {
        Context context;
        context = this.this$0.getContext();
        return Integer.valueOf(ThemeExtKt.themeColor(context, R$attr.oz_semantic_accent_primary));
    }
}
