package ru.ozon.app.android.fresh.feature.b2b.widgets.legaldocs.presentation.emptyState;

import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatImageView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.fresh.feature.b2b.databinding.WidgetLegalDocsEmptyBinding;
import ru.ozon.app.android.pikazon.extensions.ImageViewExtKt;
import ru.ozon.composer.ui.widget.k;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0014¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\r¨\u0006\u000e"}, d2 = {"Lru/ozon/app/android/fresh/feature/b2b/widgets/legaldocs/presentation/emptyState/LegalDocsEmptyViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/fresh/feature/b2b/widgets/legaldocs/presentation/emptyState/LegalDocsEmptyVO;", "Lru/ozon/app/android/fresh/feature/b2b/databinding/WidgetLegalDocsEmptyBinding;", "binding", "<init>", "(Lru/ozon/app/android/fresh/feature/b2b/databinding/WidgetLegalDocsEmptyBinding;)V", "item", "Ll20/d;", "info", "", "bind", "(Lru/ozon/app/android/fresh/feature/b2b/widgets/legaldocs/presentation/emptyState/LegalDocsEmptyVO;Ll20/d;)V", "Lru/ozon/app/android/fresh/feature/b2b/databinding/WidgetLegalDocsEmptyBinding;", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class LegalDocsEmptyViewHolder extends k<LegalDocsEmptyVO> {

    @NotNull
    private final WidgetLegalDocsEmptyBinding binding;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public LegalDocsEmptyViewHolder(@NotNull WidgetLegalDocsEmptyBinding binding) {
        super(r0);
        Intrinsics.checkNotNullParameter(binding, "binding");
        LinearLayout constraintLayout = binding.getConstraintLayout();
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "getRoot(...)");
        this.binding = binding;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull LegalDocsEmptyVO item, @NotNull d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        WidgetLegalDocsEmptyBinding widgetLegalDocsEmptyBinding = this.binding;
        AppCompatImageView imageIV = widgetLegalDocsEmptyBinding.imageIV;
        Intrinsics.checkNotNullExpressionValue(imageIV, "imageIV");
        ImageViewExtKt.loadImageOrGone(imageIV, item.getImage());
        widgetLegalDocsEmptyBinding.titleTAV.setText(item.getTitle());
        widgetLegalDocsEmptyBinding.messageTAV.setText(item.getMessage());
    }
}
