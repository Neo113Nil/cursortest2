package ru.ozon.fintech.ui.dots.attacher;

import IC.b;
import d70.g;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.fintech.ui.dots.BaseDotsIndicator;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b \u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u001b\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00028\u0000¢\u0006\u0002\u0010\u000bJ\u0017\u0010\f\u001a\u0004\u0018\u00018\u00012\u0006\u0010\n\u001a\u00028\u0000H&¢\u0006\u0002\u0010\rJ+\u0010\u000e\u001a\u00020\u00072\u0006\u0010\n\u001a\u00028\u00002\u0006\u0010\u000f\u001a\u00028\u00012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00070\u0011H&¢\u0006\u0002\u0010\u0012J\u001d\u0010\u0013\u001a\u00020\u00142\u0006\u0010\n\u001a\u00028\u00002\u0006\u0010\u000f\u001a\u00028\u0001H&¢\u0006\u0002\u0010\u0015¨\u0006\u0016"}, d2 = {"Lru/ozon/fintech/ui/dots/attacher/DotsIndicatorAttacher;", "Attachable", "Adapter", "", "<init>", "()V", "setup", "", "baseDotsIndicator", "Lru/ozon/fintech/ui/dots/BaseDotsIndicator;", "attachable", "(Lru/ozon/fintech/ui/dots/BaseDotsIndicator;Ljava/lang/Object;)V", "getAdapterFromAttachable", "(Ljava/lang/Object;)Ljava/lang/Object;", "registerAdapterDataChangedObserver", "adapter", "onChanged", "Lkotlin/Function0;", "(Ljava/lang/Object;Ljava/lang/Object;Lkotlin/jvm/functions/Function0;)V", "buildPager", "Lru/ozon/fintech/ui/dots/BaseDotsIndicator$Pager;", "(Ljava/lang/Object;Ljava/lang/Object;)Lru/ozon/fintech/ui/dots/BaseDotsIndicator$Pager;", "fintech-ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class DotsIndicatorAttacher<Attachable, Adapter> {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setup$lambda$1(BaseDotsIndicator baseDotsIndicator) {
        baseDotsIndicator.post(new b(baseDotsIndicator, 4));
        return Unit.f71690a;
    }

    @NotNull
    public abstract BaseDotsIndicator.Pager buildPager(Attachable attachable, Adapter adapter);

    public abstract Adapter getAdapterFromAttachable(Attachable attachable);

    public abstract void registerAdapterDataChangedObserver(Attachable attachable, Adapter adapter, @NotNull Function0<Unit> onChanged);

    public final void setup(@NotNull BaseDotsIndicator baseDotsIndicator, Attachable attachable) {
        Intrinsics.checkNotNullParameter(baseDotsIndicator, "baseDotsIndicator");
        Adapter adapterFromAttachable = getAdapterFromAttachable(attachable);
        if (adapterFromAttachable == null) {
            throw new IllegalStateException("Please set an adapter to the view pager (1 or 2) or the recycler before initializing the dots indicator");
        }
        registerAdapterDataChangedObserver(attachable, adapterFromAttachable, new g(baseDotsIndicator, 3));
        baseDotsIndicator.setPager(buildPager(attachable, adapterFromAttachable));
        baseDotsIndicator.refreshDots();
    }
}
