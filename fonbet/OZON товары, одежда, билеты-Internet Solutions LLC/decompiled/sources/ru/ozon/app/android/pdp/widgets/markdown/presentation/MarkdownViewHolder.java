package ru.ozon.app.android.pdp.widgets.markdown.presentation;

import GZ.g;
import android.graphics.Rect;
import android.view.View;
import android.widget.TextView;
import androidx.lifecycle.AbstractC5434v;
import androidx.lifecycle.J;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.C7735q;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pdp.databinding.PdpWidgetMarkdownBinding;
import ru.ozon.app.android.pdp.ui.configurators.base.BindingWidgetViewHolder;
import ru.ozon.app.android.pdp.widgets.markdown.presentation.MarkdownViewHolder;
import ru.ozon.app.android.pdp.widgets.markdown.presentation.characteristics.CharacteristicsAdapter;
import ru.ozon.app.android.uikit.view.recycler.decoration.CustomDividerDecoration;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u001f\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0012\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0010H\u0014¢\u0006\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0017R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0018R\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0019R\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u001aR\u0014\u0010\u001e\u001a\u00020\u001b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001d¨\u0006\u001f"}, d2 = {"Lru/ozon/app/android/pdp/widgets/markdown/presentation/MarkdownViewHolder;", "Lru/ozon/app/android/pdp/ui/configurators/base/BindingWidgetViewHolder;", "Lru/ozon/app/android/pdp/widgets/markdown/presentation/MarkdownVO;", "Lru/ozon/app/android/pdp/databinding/PdpWidgetMarkdownBinding;", "Landroid/view/View;", "containerView", "Lru/ozon/app/android/pdp/widgets/markdown/presentation/characteristics/CharacteristicsAdapter;", "characteristicsAdapter", "LGZ/g;", "router", "<init>", "(Landroid/view/View;Lru/ozon/app/android/pdp/widgets/markdown/presentation/characteristics/CharacteristicsAdapter;LGZ/g;)V", "", "updateUi", "()V", "item", "Ll20/d;", "info", "bind", "(Lru/ozon/app/android/pdp/widgets/markdown/presentation/MarkdownVO;Ll20/d;)V", "Landroid/view/View;", "getContainerView", "()Landroid/view/View;", "Lru/ozon/app/android/pdp/widgets/markdown/presentation/characteristics/CharacteristicsAdapter;", "LGZ/g;", "Lru/ozon/app/android/pdp/widgets/markdown/presentation/MarkdownVO;", "Ll20/d;", "Landroidx/lifecycle/v;", "getLifecycle", "()Landroidx/lifecycle/v;", "lifecycle", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class MarkdownViewHolder extends BindingWidgetViewHolder<MarkdownVO, PdpWidgetMarkdownBinding> {

    @NotNull
    private final CharacteristicsAdapter characteristicsAdapter;

    @NotNull
    private final View containerView;
    private d info;
    private MarkdownVO item;

    @NotNull
    private final g router;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.pdp.widgets.markdown.presentation.MarkdownViewHolder$1, reason: invalid class name */
    /* synthetic */ class AnonymousClass1 extends C7735q implements Function1<View, PdpWidgetMarkdownBinding> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        AnonymousClass1() {
            super(1, PdpWidgetMarkdownBinding.class, "bind", "bind(Landroid/view/View;)Lru/ozon/app/android/pdp/databinding/PdpWidgetMarkdownBinding;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public final PdpWidgetMarkdownBinding invoke(View p02) {
            Intrinsics.checkNotNullParameter(p02, "p0");
            return PdpWidgetMarkdownBinding.bind(p02);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Lru/ozon/app/android/pdp/databinding/PdpWidgetMarkdownBinding;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.pdp.widgets.markdown.presentation.MarkdownViewHolder$2, reason: invalid class name */
    static final class AnonymousClass2 extends AbstractC7737t implements Function1<PdpWidgetMarkdownBinding, Unit> {
        AnonymousClass2() {
            super(1);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void invoke$lambda$1(MarkdownViewHolder markdownViewHolder, View view) {
            String deeplink;
            MarkdownVO markdownVO = markdownViewHolder.item;
            if (markdownVO == null || (deeplink = markdownVO.getDeeplink()) == null || deeplink.length() <= 0) {
                return;
            }
            g.a.a(markdownViewHolder.router, markdownVO.getDeeplink(), null, null, 6);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(PdpWidgetMarkdownBinding pdpWidgetMarkdownBinding) {
            invoke2(pdpWidgetMarkdownBinding);
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(PdpWidgetMarkdownBinding binding) {
            Intrinsics.checkNotNullParameter(binding, "$this$binding");
            binding.characteristicsRv.setAdapter(MarkdownViewHolder.this.characteristicsAdapter);
            TextView textView = binding.markdownDetailsTv;
            final MarkdownViewHolder markdownViewHolder = MarkdownViewHolder.this;
            textView.setOnClickListener(new View.OnClickListener() { // from class: ru.ozon.app.android.pdp.widgets.markdown.presentation.a
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    MarkdownViewHolder.AnonymousClass2.invoke$lambda$1(MarkdownViewHolder.this, view);
                }
            });
            binding.characteristicsRv.addItemDecoration(new CustomDividerDecoration(ResourceExtKt.toPx(18), MarkdownViewHolder.this.itemView.getContext()) { // from class: ru.ozon.app.android.pdp.widgets.markdown.presentation.MarkdownViewHolder.2.2
                final /* synthetic */ int $topOffset;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(r9, 1, 0, false, 12, null);
                    Intrinsics.f(r9);
                }

                @Override // ru.ozon.app.android.uikit.view.recycler.decoration.CustomDividerDecoration
                public boolean drawFor(RecyclerView parent, View child) {
                    Intrinsics.checkNotNullParameter(parent, "parent");
                    Intrinsics.checkNotNullParameter(child, "child");
                    return false;
                }

                @Override // ru.ozon.app.android.uikit.view.recycler.decoration.CustomDividerDecoration, androidx.recyclerview.widget.RecyclerView.n
                public void getItemOffsets(Rect outRect, View child, RecyclerView parent, RecyclerView.A state) {
                    Intrinsics.checkNotNullParameter(outRect, "outRect");
                    Intrinsics.checkNotNullParameter(child, "child");
                    Intrinsics.checkNotNullParameter(parent, "parent");
                    Intrinsics.checkNotNullParameter(state, "state");
                    Integer valueOf = Integer.valueOf(parent.getChildAdapterPosition(child));
                    int intValue = valueOf.intValue();
                    if (!isValidPos(intValue, parent.getAdapter()) || intValue <= 0) {
                        valueOf = null;
                    }
                    if (valueOf != null) {
                        outRect.top = this.$topOffset;
                    }
                }
            });
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MarkdownViewHolder(@NotNull View containerView, @NotNull CharacteristicsAdapter characteristicsAdapter, @NotNull g router) {
        super(containerView, AnonymousClass1.INSTANCE);
        Intrinsics.checkNotNullParameter(containerView, "containerView");
        Intrinsics.checkNotNullParameter(characteristicsAdapter, "characteristicsAdapter");
        Intrinsics.checkNotNullParameter(router, "router");
        this.containerView = containerView;
        this.characteristicsAdapter = characteristicsAdapter;
        this.router = router;
        binding(new AnonymousClass2());
    }

    private final void updateUi() {
        binding(new MarkdownViewHolder$updateUi$1(this));
    }

    @Override // jk0.j, androidx.lifecycle.J
    @NotNull
    public AbstractC5434v getLifecycle() {
        Object context = this.itemView.getContext();
        Intrinsics.g(context, "null cannot be cast to non-null type androidx.lifecycle.LifecycleOwner");
        return ((J) context).getLifecycle();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull MarkdownVO item, @NotNull d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        this.item = item;
        this.info = info;
        updateUi();
    }
}
