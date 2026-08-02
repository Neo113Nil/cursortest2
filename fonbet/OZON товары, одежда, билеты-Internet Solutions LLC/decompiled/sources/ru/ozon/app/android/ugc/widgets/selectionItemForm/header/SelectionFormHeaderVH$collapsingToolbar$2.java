package ru.ozon.app.android.ugc.widgets.selectionItemForm.header;

import com.google.android.material.appbar.CollapsingToolbarLayout;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import l10.i;
import ru.ozon.app.android.composer.view.ComposerViewExtensionKt;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/google/android/material/appbar/CollapsingToolbarLayout;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
final class SelectionFormHeaderVH$collapsingToolbar$2 extends AbstractC7737t implements Function0<CollapsingToolbarLayout> {
    final /* synthetic */ SelectionFormHeaderVH this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SelectionFormHeaderVH$collapsingToolbar$2(SelectionFormHeaderVH selectionFormHeaderVH) {
        super(0);
        this.this$0 = selectionFormHeaderVH;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final CollapsingToolbarLayout invoke() {
        i iVar;
        iVar = this.this$0.container;
        CollapsingToolbarLayout composerCollapsingToolbar = ComposerViewExtensionKt.composerCollapsingToolbar(iVar.Y());
        if (composerCollapsingToolbar != null) {
            return composerCollapsingToolbar;
        }
        throw new IllegalArgumentException("Required value was null.");
    }
}
