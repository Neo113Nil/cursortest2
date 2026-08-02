package ru.ozon.app.android.abtool.presentation.abvariants.recycler;

import android.content.Context;
import androidx.core.content.res.g;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.abtool.R$color;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Integer;"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
final class RoundedCornersItemDecoration$bgColor$2 extends AbstractC7737t implements Function0<Integer> {
    final /* synthetic */ RoundedCornersItemDecoration this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RoundedCornersItemDecoration$bgColor$2(RoundedCornersItemDecoration roundedCornersItemDecoration) {
        super(0);
        this.this$0 = roundedCornersItemDecoration;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final Integer invoke() {
        Context context;
        context = this.this$0.context;
        return Integer.valueOf(g.b(context.getResources(), R$color.ab_white_100, null));
    }
}
