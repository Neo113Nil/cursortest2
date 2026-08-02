package ru.ozon.android.messenger.framework.presentation.common.view.recycler;

import X4.a;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.messenger.framework.analytics.MessengerTrackingInfo;
import ru.ozon.android.messenger.framework.presentation.models.g;
import ru.ozon.app.android.messenger.R$id;
import ru.ozon.app.android.messenger.databinding.MMessageBaseLayoutBinding;
import ru.ozon.app.android.messenger.databinding.MNoTypeLayoutBinding;

/* loaded from: classes10.dex */
public abstract class q<T extends ru.ozon.android.messenger.framework.presentation.models.g, B extends X4.a> {

    @NotNull
    private final B binding;
    private T boundedData;
    private ru.ozon.android.messenger.framework.presentation.models.p boundedItemInfo;

    @NotNull
    private final ru.ozon.android.messenger.framework.core.d references;

    public static final class a implements ViewTreeObserver.OnGlobalLayoutListener {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ViewGroup f91260a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ View f91261b;

        public a(ViewGroup viewGroup, View view) {
            this.f91260a = viewGroup;
            this.f91261b = view;
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public final void onGlobalLayout() {
            ViewGroup viewGroup = this.f91260a;
            if (viewGroup.getMeasuredWidth() <= 0 || viewGroup.getMeasuredHeight() <= 0) {
                return;
            }
            viewGroup.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            int width = viewGroup.getWidth();
            View view = this.f91261b;
            if (width > view.getWidth()) {
                ru.ozon.android.messenger.utils.view.s.h(view, viewGroup.getWidth());
            }
        }
    }

    public q(@NotNull B binding, @NotNull ru.ozon.android.messenger.framework.core.d references) {
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(references, "references");
        this.binding = binding;
        this.references = references;
    }

    public void bind(@NotNull T block, @NotNull ru.ozon.android.messenger.framework.presentation.models.p itemInfo, @NotNull ru.ozon.android.messenger.framework.presentation.models.d blockInfo, Object obj) {
        Map<String, MessengerTrackingInfo> l11;
        Intrinsics.checkNotNullParameter(block, "block");
        Intrinsics.checkNotNullParameter(itemInfo, "itemInfo");
        Intrinsics.checkNotNullParameter(blockInfo, "blockInfo");
        this.boundedData = block;
        this.boundedItemInfo = itemInfo;
        if (!(itemInfo instanceof ru.ozon.android.messenger.framework.presentation.models.s) || (l11 = ((ru.ozon.android.messenger.framework.presentation.models.s) itemInfo).l()) == null) {
            return;
        }
        this.references.c().s(l11);
    }

    protected final ViewGroup findBubbleMsgContainer() {
        MMessageBaseLayoutBinding messageContainerBindingOrNull = getMessageContainerBindingOrNull();
        if (messageContainerBindingOrNull != null) {
            return messageContainerBindingOrNull.bubbleContainerLl;
        }
        return null;
    }

    @NotNull
    public final B getBinding() {
        return this.binding;
    }

    public final T getBoundedData() {
        return this.boundedData;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @NotNull
    public final Context getContext() {
        Context context = this.binding.getRoot().getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        return context;
    }

    protected final MMessageBaseLayoutBinding getMessageContainerBindingOrNull() {
        ViewGroup viewGroup = (ViewGroup) this.binding.getRoot().getRootView().findViewById(R$id.messageItemRootLl);
        if (viewGroup != null) {
            return MMessageBaseLayoutBinding.bind(viewGroup);
        }
        return null;
    }

    protected final MNoTypeLayoutBinding getNoTypeContainerBindingOrNull() {
        ViewGroup viewGroup = (ViewGroup) this.binding.getRoot().getRootView().findViewById(R$id.noTypeContainerLl);
        if (viewGroup != null) {
            return MNoTypeLayoutBinding.bind(viewGroup);
        }
        return null;
    }

    protected final void makeViewInMultipleFilledWidth(@NotNull View targetView) {
        ViewGroup findBubbleMsgContainer;
        Intrinsics.checkNotNullParameter(targetView, "targetView");
        ru.ozon.android.messenger.framework.presentation.models.p pVar = this.boundedItemInfo;
        if ((pVar != null ? pVar.a() : 0) <= 1 || (findBubbleMsgContainer = findBubbleMsgContainer()) == null) {
            return;
        }
        findBubbleMsgContainer.getViewTreeObserver().addOnGlobalLayoutListener(new a(findBubbleMsgContainer, targetView));
    }

    public void onRecycle() {
    }

    public void trackView(@NotNull T block) {
        Intrinsics.checkNotNullParameter(block, "block");
    }

    protected final void withBinding(@NotNull Function1<? super B, Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        block.invoke(this.binding);
    }
}
