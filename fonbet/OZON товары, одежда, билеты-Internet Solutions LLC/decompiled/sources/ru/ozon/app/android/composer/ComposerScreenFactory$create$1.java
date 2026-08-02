package ru.ozon.app.android.composer;

import i10.C6997c;
import i10.h;
import i10.j;
import i10.l;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.M;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.composer.universalscreen.view.ComposerScreenConfig;
import ru.ozon.composer.ui.widget.l;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Li10/c;", "Lru/ozon/composer/ui/widget/l;", "invoke", "()Li10/c;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes6.dex */
final class ComposerScreenFactory$create$1 extends AbstractC7737t implements Function0<C6997c<l>> {
    final /* synthetic */ ComposerScreenConfig $config;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ComposerScreenFactory$create$1(ComposerScreenConfig composerScreenConfig) {
        super(0);
        this.$config = composerScreenConfig;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final C6997c<l> invoke() {
        h.c pageRef = this.$config.getPageRef();
        Set<String> notRemovableNoUi = this.$config.getNotRemovableNoUi();
        if (notRemovableNoUi == null) {
            notRemovableNoUi = M.f71699a;
        }
        boolean skipComposerFrequencyLoadCheck = this.$config.getSkipComposerFrequencyLoadCheck();
        l.a loader = this.$config.getAppearanceConfig().getLoader();
        if (loader == null) {
            loader = new l.a.C1079a(0L, null, 3);
        }
        i10.l loader2 = new i10.l(false, false, loader);
        Intrinsics.checkNotNullParameter(loader2, "loader");
        return C6997c.a.a(pageRef, new j(null, loader2, false, false, null), skipComposerFrequencyLoadCheck, notRemovableNoUi);
    }
}
