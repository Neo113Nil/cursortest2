package ru.ozon.android.composerCommonViewKit.plainText.pesentation;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.composer.ui.widget.k;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0014¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\r¨\u0006\u000e"}, d2 = {"Lru/ozon/android/composerCommonViewKit/plainText/pesentation/PlainTextViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/android/composerCommonViewKit/plainText/pesentation/PlainTextVO;", "Lru/ozon/android/composerCommonViewKit/plainText/pesentation/PlainTextView;", "containerView", "<init>", "(Lru/ozon/android/composerCommonViewKit/plainText/pesentation/PlainTextView;)V", "item", "Ll20/d;", "info", "", "bind", "(Lru/ozon/android/composerCommonViewKit/plainText/pesentation/PlainTextVO;Ll20/d;)V", "Lru/ozon/android/composerCommonViewKit/plainText/pesentation/PlainTextView;", "common-view-kit_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class PlainTextViewHolder extends k<PlainTextVO> {

    @NotNull
    private final PlainTextView containerView;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlainTextViewHolder(@NotNull PlainTextView containerView) {
        super(containerView);
        Intrinsics.checkNotNullParameter(containerView, "containerView");
        this.containerView = containerView;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull PlainTextVO item, @NotNull d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        this.containerView.bind(item);
    }
}
