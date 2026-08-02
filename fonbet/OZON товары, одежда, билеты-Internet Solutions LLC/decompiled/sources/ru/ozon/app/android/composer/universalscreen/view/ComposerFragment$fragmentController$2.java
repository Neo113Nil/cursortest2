package ru.ozon.app.android.composer.universalscreen.view;

import a00.C4910e;
import a00.C4911f;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import l10.f;
import ru.ozon.app.android.composer.ComposerFragmentController;
import ru.ozon.app.android.composer.di.Widget;
import wZ.C10464f;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lru/ozon/app/android/composer/ComposerFragmentController;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class ComposerFragment$fragmentController$2 extends AbstractC7737t implements Function0<ComposerFragmentController> {
    final /* synthetic */ ComposerFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ComposerFragment$fragmentController$2(ComposerFragment composerFragment) {
        super(0);
        this.this$0 = composerFragment;
    }

    @Override // kotlin.jvm.functions.Function0
    public final ComposerFragmentController invoke() {
        f.e displayMode;
        ComposerFragment composerFragment = this.this$0;
        ComposerScreenConfig config = composerFragment.getConfig();
        C4911f c4911f = new C4911f(this.this$0);
        ComposerFragment composerFragment2 = this.this$0;
        C4910e c4910e = new C4910e(composerFragment2, C10464f.a(composerFragment2));
        Set<Widget> widgets = this.this$0.getWidgets();
        displayMode = this.this$0.displayMode();
        return new ComposerFragmentController(composerFragment, config, c4911f, c4910e, widgets, displayMode, this.this$0.getInterceptors(), this.this$0.getErrorStateFactory(), this.this$0.getInitialWidgetsProvider());
    }
}
