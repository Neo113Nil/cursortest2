package ru.ozon.app.android.account.orders.barcode.presentation;

import i10.h;
import kotlin.Metadata;
import kotlin.collections.e0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.account.orders.core.OrientationLockConfigurator;
import ru.ozon.app.android.composer.universalscreen.view.ComposerFragment;
import ru.ozon.app.android.composer.universalscreen.view.ComposerScreenConfig;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lru/ozon/app/android/composer/universalscreen/view/ComposerFragment;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
final class BarcodeFragment$barcodesComposerFragment$2 extends AbstractC7737t implements Function0<ComposerFragment> {
    final /* synthetic */ BarcodeFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    BarcodeFragment$barcodesComposerFragment$2(BarcodeFragment barcodeFragment) {
        super(0);
        this.this$0 = barcodeFragment;
    }

    @Override // kotlin.jvm.functions.Function0
    public final ComposerFragment invoke() {
        String string = this.this$0.requireArguments().getString("ARG_DEEPLINK");
        Intrinsics.f(string);
        return ComposerFragment.Companion.newInstance$default(ComposerFragment.INSTANCE, new ComposerScreenConfig(new h.c.a(string, (String) null, (String) null, 14), null, false, null, false, false, false, false, null, false, false, false, e0.h(OrientationLockConfigurator.class), null, null, null, false, null, null, null, false, false, null, null, 16773086, null), null, null, 6, null);
    }
}
