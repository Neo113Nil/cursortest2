package ru.ozon.app.android.pdp.widgets.richContent.presentation.subWidgets.list;

import android.graphics.drawable.Drawable;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.pdp.databinding.WidgetRichContentImageListItemBinding;
import ru.ozon.app.android.pdp.widgets.richContent.presentation.RichContentVO;
import ru.ozon.app.android.pdp.widgets.richContent.presentation.binderDelegate.RichContentImageListBinderDelegate;
import ru.ozon.app.android.pdp.widgets.richContent.presentation.subWidgets.RichContentSubWidgetViewHolder;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\f\u0010\rR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lru/ozon/app/android/pdp/widgets/richContent/presentation/subWidgets/list/RichContentImageListWidgetViewHolder;", "Lru/ozon/app/android/pdp/widgets/richContent/presentation/subWidgets/RichContentSubWidgetViewHolder;", "Lru/ozon/app/android/pdp/widgets/richContent/presentation/subWidgets/list/RichContentImageListVoWrapper;", "Lru/ozon/app/android/pdp/widgets/richContent/presentation/binderDelegate/RichContentImageListBinderDelegate;", "Lru/ozon/app/android/pdp/databinding/WidgetRichContentImageListItemBinding;", "binding", "Lru/ozon/app/android/composer/ComposerReferences;", "refs", "<init>", "(Lru/ozon/app/android/pdp/databinding/WidgetRichContentImageListItemBinding;Lru/ozon/app/android/composer/ComposerReferences;)V", "item", "", "bindSubWidget", "(Lru/ozon/app/android/pdp/widgets/richContent/presentation/subWidgets/list/RichContentImageListVoWrapper;)V", "Lru/ozon/app/android/pdp/databinding/WidgetRichContentImageListItemBinding;", "getBinding", "()Lru/ozon/app/android/pdp/databinding/WidgetRichContentImageListItemBinding;", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class RichContentImageListWidgetViewHolder extends RichContentSubWidgetViewHolder<RichContentImageListVoWrapper> implements RichContentImageListBinderDelegate {

    @NotNull
    private final WidgetRichContentImageListItemBinding binding;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public RichContentImageListWidgetViewHolder(@NotNull WidgetRichContentImageListItemBinding binding, @NotNull ComposerReferences refs) {
        super(r0, refs);
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(refs, "refs");
        ConstraintLayout constraintLayout = binding.getConstraintLayout();
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "getRoot(...)");
        this.binding = binding;
    }

    public void bindImageList(@NotNull WidgetRichContentImageListItemBinding widgetRichContentImageListItemBinding, @NotNull RichContentVO.Item.ListItem.ImageList imageList, @NotNull Function0<? extends Drawable> function0) {
        RichContentImageListBinderDelegate.DefaultImpls.bindImageList(this, widgetRichContentImageListItemBinding, imageList, function0);
    }

    @Override // ru.ozon.app.android.pdp.widgets.richContent.presentation.subWidgets.RichContentSubWidgetViewHolder
    public void bindSubWidget(@NotNull RichContentImageListVoWrapper item) {
        Intrinsics.checkNotNullParameter(item, "item");
        bindImageList(this.binding, item.getItem(), new C(this) { // from class: ru.ozon.app.android.pdp.widgets.richContent.presentation.subWidgets.list.RichContentImageListWidgetViewHolder$bindSubWidget$1
            @Override // kotlin.jvm.internal.C, kotlin.reflect.n
            public Object get() {
                Drawable backgroundColor;
                backgroundColor = ((RichContentImageListWidgetViewHolder) this.receiver).getBackgroundColor();
                return backgroundColor;
            }
        });
    }
}
