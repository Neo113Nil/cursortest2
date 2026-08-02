package ru.ozon.app.android.storefront.stories.playstoriesv3.presentation.fragments;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Boolean;"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
final class BaseStoryV3Fragment$isSmallPhone$2 extends AbstractC7737t implements Function0<Boolean> {
    final /* synthetic */ BaseStoryV3Fragment<T> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    BaseStoryV3Fragment$isSmallPhone$2(BaseStoryV3Fragment<T> baseStoryV3Fragment) {
        super(0);
        this.this$0 = baseStoryV3Fragment;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final Boolean invoke() {
        return Boolean.valueOf(((float) this.this$0.getResources().getDisplayMetrics().widthPixels) / ((float) this.this$0.getResources().getDisplayMetrics().heightPixels) >= 0.514f);
    }
}
