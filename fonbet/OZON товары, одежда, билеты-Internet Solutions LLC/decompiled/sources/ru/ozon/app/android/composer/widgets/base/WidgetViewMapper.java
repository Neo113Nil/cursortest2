package ru.ozon.app.android.composer.widgets.base;

import A00.a;
import android.view.View;
import android.view.ViewGroup;
import j10.h;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l10.e;
import l10.i;
import l20.c;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.composer.ui.widget.g;
import ru.ozon.composer.ui.widget.h;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.composer.ui.widget.l;

@Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b'\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0004*\u00020\u00032\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005B\u0007¢\u0006\u0004\b\u0006\u0010\u0007J/\u0010\u000e\u001a\u0012\u0012\u0004\u0012\u00028\u00010\fj\b\u0012\u0004\u0012\u00028\u0001`\r2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0013\u001a\u00020\u00122\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J!\u0010\u0018\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J%\u0010\u001e\u001a\b\u0012\u0004\u0012\u00028\u00010\u001d2\u0006\u0010\u001a\u001a\u00028\u00002\u0006\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u001f\u0010\"\u001a\u00020!2\u0006\u0010\u001a\u001a\u00028\u00002\u0006\u0010 \u001a\u00028\u0001H\u0016¢\u0006\u0004\b\"\u0010#J5\u0010\u0013\u001a\u00020\u00122\u0006\u0010%\u001a\u00020$2\u0006\u0010&\u001a\u00020\u00102\u0006\u0010(\u001a\u00020'2\f\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00100)H\u0016¢\u0006\u0004\b\u0013\u0010+R6\u0010-\u001a\u0018\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00028\u0001\u0012\u0006\u0012\u0004\u0018\u00018\u0001\u0018\u00010,8\u0016X\u0097\u0004¢\u0006\u0012\n\u0004\b-\u0010.\u0012\u0004\b1\u0010\u0007\u001a\u0004\b/\u00100R,\u00103\u001a\u001a\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u001b\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u001d0,8&X¦\u0004¢\u0006\u0006\u001a\u0004\b2\u00100R6\u00105\u001a$\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020'\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00028\u00010\fj\b\u0012\u0004\u0012\u00028\u0001`\r0,8&X¦\u0004¢\u0006\u0006\u001a\u0004\b4\u00100¨\u00066"}, d2 = {"Lru/ozon/app/android/composer/widgets/base/WidgetViewMapper;", "", "S", "Ll20/c;", "I", "Lru/ozon/composer/ui/widget/g;", "<init>", "()V", "Ll10/i;", "container", "Landroid/view/View;", "view", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "createHolder", "(Ll10/i;Landroid/view/View;)Lru/ozon/composer/ui/widget/k;", "Lru/ozon/composer/ui/widget/l;", "viewItem", "", "constructLayout", "(Ll10/i;Lru/ozon/composer/ui/widget/l;)V", "LA00/a$J$a;", "update", "oldItem", "handleUpdate", "(LA00/a$J$a;Ll20/c;)Ll20/c;", "state", "Ll20/d;", "info", "", "map", "(Ljava/lang/Object;Ll20/d;)Ljava/util/List;", "item", "Lru/ozon/composer/ui/widget/h;", "getWidgetSpan", "(Ljava/lang/Object;Ll20/c;)Lru/ozon/composer/ui/widget/h;", "Landroid/view/ViewGroup;", "composerRootView", "viewObject", "Lru/ozon/app/android/composer/ComposerReferences;", "references", "Lj10/h;", "viewItemHelper", "(Landroid/view/ViewGroup;Lru/ozon/composer/ui/widget/l;Lru/ozon/app/android/composer/ComposerReferences;Lj10/h;)V", "Lkotlin/Function2;", "updateConsumer", "Lkotlin/jvm/functions/Function2;", "getUpdateConsumer", "()Lkotlin/jvm/functions/Function2;", "getUpdateConsumer$annotations", "getMapper", "mapper", "getHolderProducer", "holderProducer", "composer_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public abstract class WidgetViewMapper<S, I extends c> extends g<S, I> {
    private final Function2<a.J.InterfaceC0007a, I, I> updateConsumer;

    public void constructLayout(@NotNull ViewGroup composerRootView, @NotNull l viewObject, @NotNull ComposerReferences references, @NotNull h<l> viewItemHelper) {
        Intrinsics.checkNotNullParameter(composerRootView, "composerRootView");
        Intrinsics.checkNotNullParameter(viewObject, "viewObject");
        Intrinsics.checkNotNullParameter(references, "references");
        Intrinsics.checkNotNullParameter(viewItemHelper, "viewItemHelper");
    }

    @Override // ru.ozon.composer.ui.widget.g
    @NotNull
    public k<I> createHolder(@NotNull i container, @NotNull View view) {
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(view, "view");
        Function2<View, ComposerReferences, k<I>> mo614getHolderProducer = mo614getHolderProducer();
        e V11 = container.V();
        Intrinsics.g(V11, "null cannot be cast to non-null type ru.ozon.app.android.composer.ComposerReferences");
        return mo614getHolderProducer.invoke(view, (ComposerReferences) V11);
    }

    @NotNull
    /* renamed from: getHolderProducer */
    public abstract Function2<View, ComposerReferences, k<I>> mo614getHolderProducer();

    @NotNull
    public abstract Function2<S, d, List<I>> getMapper();

    public Function2<a.J.InterfaceC0007a, I, I> getUpdateConsumer() {
        return this.updateConsumer;
    }

    @Override // ru.ozon.composer.ui.widget.g, ru.ozon.composer.ui.widget.e
    @NotNull
    public ru.ozon.composer.ui.widget.h getWidgetSpan(@NotNull S state, @NotNull I item) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(item, "item");
        return h.f.f94874b;
    }

    @Override // ru.ozon.composer.ui.widget.g, I00.d
    public I handleUpdate(@NotNull a.J.InterfaceC0007a update, @NotNull I oldItem) {
        Intrinsics.checkNotNullParameter(update, "update");
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        Function2<a.J.InterfaceC0007a, I, I> updateConsumer = getUpdateConsumer();
        if (updateConsumer != null) {
            return updateConsumer.invoke(update, oldItem);
        }
        return null;
    }

    @Override // m20.InterfaceC8046a
    @NotNull
    public List<I> map(@NotNull S state, @NotNull d info) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(info, "info");
        return getMapper().invoke(state, info);
    }

    @Override // ru.ozon.composer.ui.widget.g
    public void constructLayout(@NotNull i container, @NotNull l viewItem) {
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(viewItem, "viewItem");
        ViewGroup Z11 = container.Z();
        e V11 = container.V();
        Intrinsics.g(V11, "null cannot be cast to non-null type ru.ozon.app.android.composer.ComposerReferences");
        constructLayout(Z11, viewItem, (ComposerReferences) V11, container.J().p());
    }
}
