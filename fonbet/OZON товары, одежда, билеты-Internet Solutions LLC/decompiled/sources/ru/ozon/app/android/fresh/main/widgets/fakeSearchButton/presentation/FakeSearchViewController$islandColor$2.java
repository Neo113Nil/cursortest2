package ru.ozon.app.android.fresh.main.widgets.fakeSearchButton.presentation;

import android.content.Context;
import androidx.core.content.a;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.uni.core.UniColors;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Integer;"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
final class FakeSearchViewController$islandColor$2 extends AbstractC7737t implements Function0<Integer> {
    final /* synthetic */ FakeSearchViewController this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FakeSearchViewController$islandColor$2(FakeSearchViewController fakeSearchViewController) {
        super(0);
        this.this$0 = fakeSearchViewController;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final Integer invoke() {
        Context context;
        context = this.this$0.getContext();
        return Integer.valueOf(a.getColor(context, UniColors.LAYER_FLOOR_1.getResId()));
    }
}
