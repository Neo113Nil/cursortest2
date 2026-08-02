package ru.ozon.app.android.web;

import android.R;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Integer;"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
final class TransparentNavbarWebFragment$transparentColor$2 extends AbstractC7737t implements Function0<Integer> {
    final /* synthetic */ TransparentNavbarWebFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TransparentNavbarWebFragment$transparentColor$2(TransparentNavbarWebFragment transparentNavbarWebFragment) {
        super(0);
        this.this$0 = transparentNavbarWebFragment;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final Integer invoke() {
        return Integer.valueOf(androidx.core.content.a.getColor(this.this$0.requireContext(), R.color.transparent));
    }
}
