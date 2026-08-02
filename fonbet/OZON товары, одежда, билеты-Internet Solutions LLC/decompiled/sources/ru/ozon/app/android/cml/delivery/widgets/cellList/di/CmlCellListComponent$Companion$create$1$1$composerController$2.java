package ru.ozon.app.android.cml.delivery.widgets.cellList.di;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import l10.InterfaceC7851b;
import ru.ozon.app.android.composer.di.composer.RetainComposerComponentApi;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00060\u0000j\u0002`\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ll10/b;", "Lru/ozon/app/android/composer/ComposerController;", "invoke", "()Ll10/b;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes11.dex */
final class CmlCellListComponent$Companion$create$1$1$composerController$2 extends AbstractC7737t implements Function0<InterfaceC7851b> {
    final /* synthetic */ RetainComposerComponentApi $retainComposerApi;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CmlCellListComponent$Companion$create$1$1$composerController$2(RetainComposerComponentApi retainComposerComponentApi) {
        super(0);
        this.$retainComposerApi = retainComposerComponentApi;
    }

    @Override // kotlin.jvm.functions.Function0
    public final InterfaceC7851b invoke() {
        return this.$retainComposerApi.getComposerController();
    }
}
