package ru.ozon.app.android.cart.cartSplitV2.v2.util.swipeToDelete;

import androidx.recyclerview.widget.LinearLayoutManager;
import com.google.protobuf.DescriptorProtos$FileOptions;
import kotlin.Metadata;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.c;
import kotlin.coroutines.jvm.internal.e;
import org.jetbrains.annotations.NotNull;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@e(c = "ru.ozon.app.android.cart.cartSplitV2.v2.util.swipeToDelete.SwipeOnboarding", f = "SwipeOnboarding.kt", l = {DescriptorProtos$FileOptions.CC_ENABLE_ARENAS_FIELD_NUMBER, 34}, m = "startOnboarding")
/* loaded from: classes11.dex */
final class SwipeOnboarding$startOnboarding$1 extends c {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ SwipeOnboarding this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SwipeOnboarding$startOnboarding$1(SwipeOnboarding swipeOnboarding, d<? super SwipeOnboarding$startOnboarding$1> dVar) {
        super(dVar);
        this.this$0 = swipeOnboarding;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= LinearLayoutManager.INVALID_OFFSET;
        return this.this$0.startOnboarding(this);
    }
}
