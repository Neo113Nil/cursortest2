package ru.ozon.app.android.pdp.widgets.richContent.presentation.mainWidgetRecycler;

import Ve.C4636t5;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pdp.databinding.WidgetRichContentBulletListItemBinding;
import ru.ozon.app.android.pdp.widgets.richContent.presentation.RichContentVO;
import ru.ozon.app.android.pdp.widgets.richContent.presentation.binderDelegate.RichContentBulletListBinderDelegate;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u0000 \u000b2\u00020\u00012\u00020\u0002:\u0001\u000bB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lru/ozon/app/android/pdp/widgets/richContent/presentation/mainWidgetRecycler/RichContentBulletListViewHolder;", "Lru/ozon/app/android/pdp/widgets/richContent/presentation/mainWidgetRecycler/RichContentItemViewHolder;", "Lru/ozon/app/android/pdp/widgets/richContent/presentation/binderDelegate/RichContentBulletListBinderDelegate;", "binding", "Lru/ozon/app/android/pdp/databinding/WidgetRichContentBulletListItemBinding;", "<init>", "(Lru/ozon/app/android/pdp/databinding/WidgetRichContentBulletListItemBinding;)V", "bind", "", "item", "Lru/ozon/app/android/pdp/widgets/richContent/presentation/RichContentVO$Item$ListItem$BulletList;", "Companion", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class RichContentBulletListViewHolder extends RichContentItemViewHolder implements RichContentBulletListBinderDelegate {

    @NotNull
    private final WidgetRichContentBulletListItemBinding binding;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, d2 = {"Lru/ozon/app/android/pdp/widgets/richContent/presentation/mainWidgetRecycler/RichContentBulletListViewHolder$Companion;", "", "<init>", "()V", "create", "Lru/ozon/app/android/pdp/widgets/richContent/presentation/mainWidgetRecycler/RichContentBulletListViewHolder;", "parent", "Landroid/view/ViewGroup;", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final RichContentBulletListViewHolder create(@NotNull ViewGroup parent) {
            WidgetRichContentBulletListItemBinding inflate = WidgetRichContentBulletListItemBinding.inflate(C4636t5.a(parent, "parent"), parent, false);
            Intrinsics.checkNotNullExpressionValue(inflate, "inflate(...)");
            return new RichContentBulletListViewHolder(inflate);
        }

        private Companion() {
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public RichContentBulletListViewHolder(@NotNull WidgetRichContentBulletListItemBinding binding) {
        super(r0, null);
        Intrinsics.checkNotNullParameter(binding, "binding");
        ConstraintLayout constraintLayout = binding.getConstraintLayout();
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "getRoot(...)");
        this.binding = binding;
    }

    public final void bind(@NotNull RichContentVO.Item.ListItem.BulletList item) {
        Intrinsics.checkNotNullParameter(item, "item");
        bindBulletList(this.binding, item);
    }

    public void bindBulletList(@NotNull WidgetRichContentBulletListItemBinding widgetRichContentBulletListItemBinding, @NotNull RichContentVO.Item.ListItem.BulletList bulletList) {
        RichContentBulletListBinderDelegate.DefaultImpls.bindBulletList(this, widgetRichContentBulletListItemBinding, bulletList);
    }
}
