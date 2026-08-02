package ru.ozon.app.android.cscore.copybutton;

import FK.a;
import android.view.View;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.RestrictionsUtilsKt;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.cscore.copybutton.models.CopyButtonDTO;
import ru.ozon.app.android.cscore.copybutton.models.CopyButtonVO;
import ru.ozon.app.android.cscore.databinding.WidgetOrderDetailCopyItemBinding;
import ru.ozon.app.android.pikazon.extensions.ContextExtKt;
import ru.ozon.composer.ui.widget.k;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0014¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u000fR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lru/ozon/app/android/cscore/copybutton/CopyButtonViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/cscore/copybutton/models/CopyButtonVO;", "Landroid/view/View;", "containerView", "Lru/ozon/app/android/composer/ComposerReferences;", "composerReferences", "<init>", "(Landroid/view/View;Lru/ozon/app/android/composer/ComposerReferences;)V", "item", "Ll20/d;", "info", "", "bind", "(Lru/ozon/app/android/cscore/copybutton/models/CopyButtonVO;Ll20/d;)V", "Lru/ozon/app/android/composer/ComposerReferences;", "Lru/ozon/app/android/cscore/databinding/WidgetOrderDetailCopyItemBinding;", "binding", "Lru/ozon/app/android/cscore/databinding/WidgetOrderDetailCopyItemBinding;", "csma_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class CopyButtonViewHolder extends k<CopyButtonVO> {

    @NotNull
    private final WidgetOrderDetailCopyItemBinding binding;

    @NotNull
    private final ComposerReferences composerReferences;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CopyButtonViewHolder(@NotNull View containerView, @NotNull ComposerReferences composerReferences) {
        super(containerView);
        Intrinsics.checkNotNullParameter(containerView, "containerView");
        Intrinsics.checkNotNullParameter(composerReferences, "composerReferences");
        this.composerReferences = composerReferences;
        WidgetOrderDetailCopyItemBinding bind = WidgetOrderDetailCopyItemBinding.bind(containerView);
        Intrinsics.checkNotNullExpressionValue(bind, "bind(...)");
        this.binding = bind;
        containerView.setOnClickListener(new a(this, 9));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$0(CopyButtonViewHolder copyButtonViewHolder, View view) {
        CopyButtonVO boundedData = copyButtonViewHolder.getBoundedData();
        if (boundedData == null) {
            return;
        }
        CopyButtonDTO.Action copyAction = boundedData.getCopyAction();
        RestrictionsUtilsKt.showRestrictionAndCopy(copyButtonViewHolder.composerReferences, copyAction.getClipboardText(), copyAction.getRestrictionMessage());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull CopyButtonVO item, @NotNull d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        this.binding.ivCopyButton.setBackground(ContextExtKt.loadIconByString(getContext(), item.getIcon()));
    }
}
