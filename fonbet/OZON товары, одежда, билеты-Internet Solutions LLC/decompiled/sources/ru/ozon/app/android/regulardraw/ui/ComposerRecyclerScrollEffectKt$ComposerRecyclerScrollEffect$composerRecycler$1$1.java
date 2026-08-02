package ru.ozon.app.android.regulardraw.ui;

import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/ViewGroup;", "invoke", "(Landroid/view/ViewGroup;)Ljava/lang/Boolean;"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
final class ComposerRecyclerScrollEffectKt$ComposerRecyclerScrollEffect$composerRecycler$1$1 extends AbstractC7737t implements Function1<ViewGroup, Boolean> {
    public static final ComposerRecyclerScrollEffectKt$ComposerRecyclerScrollEffect$composerRecycler$1$1 INSTANCE = new ComposerRecyclerScrollEffectKt$ComposerRecyclerScrollEffect$composerRecycler$1$1();

    ComposerRecyclerScrollEffectKt$ComposerRecyclerScrollEffect$composerRecycler$1$1() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(ViewGroup it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Boolean.valueOf(it instanceof CoordinatorLayout);
    }
}
