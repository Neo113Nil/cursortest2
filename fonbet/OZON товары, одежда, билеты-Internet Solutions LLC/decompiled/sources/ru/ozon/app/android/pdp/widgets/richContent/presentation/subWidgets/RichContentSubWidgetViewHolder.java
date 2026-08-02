package ru.ozon.app.android.pdp.widgets.richContent.presentation.subWidgets;

import Sc.InterfaceC4008j;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.pdp.ui.configurators.pdp.tab.TabEmbeddedWidgetViewHolder;
import ru.ozon.app.android.pdp.utils.DelegatesKt;
import ru.ozon.app.android.pdp.widgets.richContent.presentation.RichContentVoWrapper;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b!\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00028\u0000H&¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00028\u0000¢\u0006\u0004\b\u000e\u0010\rR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u000fR\u001d\u0010\u0015\u001a\u0004\u0018\u00010\u00108DX\u0084\u0084\u0002¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R'\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u000b0\u00168DX\u0084\u0084\u0002¢\u0006\f\n\u0004\b\u0018\u0010\u0012\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001c"}, d2 = {"Lru/ozon/app/android/pdp/widgets/richContent/presentation/subWidgets/RichContentSubWidgetViewHolder;", "Lru/ozon/app/android/pdp/widgets/richContent/presentation/RichContentVoWrapper;", "T", "Lru/ozon/app/android/pdp/ui/configurators/pdp/tab/TabEmbeddedWidgetViewHolder;", "Landroid/view/View;", "view", "Lru/ozon/app/android/composer/ComposerReferences;", "refs", "<init>", "(Landroid/view/View;Lru/ozon/app/android/composer/ComposerReferences;)V", "item", "", "bindSubWidget", "(Lru/ozon/app/android/pdp/widgets/richContent/presentation/RichContentVoWrapper;)V", "bind", "Landroid/view/View;", "Landroid/graphics/drawable/Drawable;", "backgroundColor$delegate", "LSc/j;", "getBackgroundColor", "()Landroid/graphics/drawable/Drawable;", "backgroundColor", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler$delegate", "getActionHandler", "()Lkotlin/jvm/functions/Function1;", "actionHandler", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public abstract class RichContentSubWidgetViewHolder<T extends RichContentVoWrapper> extends TabEmbeddedWidgetViewHolder<T> {

    /* renamed from: actionHandler$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j actionHandler;

    /* renamed from: backgroundColor$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j backgroundColor;

    @NotNull
    private final View view;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RichContentSubWidgetViewHolder(@NotNull View view, @NotNull ComposerReferences refs) {
        super(view, refs, null, 4, null);
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(refs, "refs");
        this.view = view;
        this.backgroundColor = DelegatesKt.lazyUnsafe(new RichContentSubWidgetViewHolder$backgroundColor$2(this));
        this.actionHandler = DelegatesKt.lazyUnsafe(new RichContentSubWidgetViewHolder$actionHandler$2(refs, this));
    }

    public abstract void bindSubWidget(@NotNull T item);

    /* JADX INFO: Access modifiers changed from: protected */
    @NotNull
    public final Function1<AtomAction, Unit> getActionHandler() {
        return (Function1) this.actionHandler.getValue();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final Drawable getBackgroundColor() {
        return (Drawable) this.backgroundColor.getValue();
    }

    @Override // ru.ozon.app.android.pdp.ui.configurators.pdp.tab.TabEmbeddedWidgetViewHolder
    public final void bind(@NotNull T item) {
        Intrinsics.checkNotNullParameter(item, "item");
        if (item.getIsExpanded()) {
            bindSubWidget(item);
            return;
        }
        View view = this.view;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        int i11 = layoutParams.height;
        layoutParams.height = 0;
        if (i11 == 0) {
            return;
        }
        view.setLayoutParams(layoutParams);
    }
}
