package ru.ozon.app.android.pdp.widgets.richContent.presentation.mainWidgetRecycler;

import Ve.C4636t5;
import android.graphics.drawable.Drawable;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pdp.databinding.WidgetRichContentImageListItemBinding;
import ru.ozon.app.android.pdp.widgets.richContent.presentation.RichContentVO;
import ru.ozon.app.android.pdp.widgets.richContent.presentation.binderDelegate.RichContentImageListBinderDelegate;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u0000 \u000e2\u00020\u00012\u00020\u0002:\u0001\u000eB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u001e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u000e\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\fR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lru/ozon/app/android/pdp/widgets/richContent/presentation/mainWidgetRecycler/RichContentImageListViewHolder;", "Lru/ozon/app/android/pdp/widgets/richContent/presentation/mainWidgetRecycler/RichContentItemViewHolder;", "Lru/ozon/app/android/pdp/widgets/richContent/presentation/binderDelegate/RichContentImageListBinderDelegate;", "binding", "Lru/ozon/app/android/pdp/databinding/WidgetRichContentImageListItemBinding;", "<init>", "(Lru/ozon/app/android/pdp/databinding/WidgetRichContentImageListItemBinding;)V", "bind", "", "item", "Lru/ozon/app/android/pdp/widgets/richContent/presentation/RichContentVO$Item$ListItem$ImageList;", "backgroundColor", "Lkotlin/Function0;", "Landroid/graphics/drawable/Drawable;", "Companion", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class RichContentImageListViewHolder extends RichContentItemViewHolder implements RichContentImageListBinderDelegate {

    @NotNull
    private final WidgetRichContentImageListItemBinding binding;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, d2 = {"Lru/ozon/app/android/pdp/widgets/richContent/presentation/mainWidgetRecycler/RichContentImageListViewHolder$Companion;", "", "<init>", "()V", "create", "Lru/ozon/app/android/pdp/widgets/richContent/presentation/mainWidgetRecycler/RichContentImageListViewHolder;", "parent", "Landroid/view/ViewGroup;", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final RichContentImageListViewHolder create(@NotNull ViewGroup parent) {
            WidgetRichContentImageListItemBinding inflate = WidgetRichContentImageListItemBinding.inflate(C4636t5.a(parent, "parent"), parent, false);
            Intrinsics.checkNotNullExpressionValue(inflate, "inflate(...)");
            return new RichContentImageListViewHolder(inflate);
        }

        private Companion() {
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public RichContentImageListViewHolder(@NotNull WidgetRichContentImageListItemBinding binding) {
        super(r0, null);
        Intrinsics.checkNotNullParameter(binding, "binding");
        ConstraintLayout constraintLayout = binding.getConstraintLayout();
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "getRoot(...)");
        this.binding = binding;
    }

    public final void bind(@NotNull RichContentVO.Item.ListItem.ImageList item, @NotNull Function0<? extends Drawable> backgroundColor) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(backgroundColor, "backgroundColor");
        bindImageList(this.binding, item, backgroundColor);
    }

    public void bindImageList(@NotNull WidgetRichContentImageListItemBinding widgetRichContentImageListItemBinding, @NotNull RichContentVO.Item.ListItem.ImageList imageList, @NotNull Function0<? extends Drawable> function0) {
        RichContentImageListBinderDelegate.DefaultImpls.bindImageList(this, widgetRichContentImageListItemBinding, imageList, function0);
    }
}
