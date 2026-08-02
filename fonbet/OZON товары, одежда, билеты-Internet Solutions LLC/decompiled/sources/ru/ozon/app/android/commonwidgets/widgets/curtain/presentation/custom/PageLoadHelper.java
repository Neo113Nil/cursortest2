package ru.ozon.app.android.commonwidgets.widgets.curtain.presentation.custom;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.common.ui.customcurtain.CurtainCustomVO;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\fH\u0016¨\u0006\r"}, d2 = {"Lru/ozon/app/android/commonwidgets/widgets/curtain/presentation/custom/PageLoadHelper;", "Lru/ozon/app/android/commonwidgets/widgets/curtain/presentation/custom/ShowHelper;", "ref", "Lru/ozon/app/android/composer/ComposerReferences;", "actionHandler", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "<init>", "(Lru/ozon/app/android/composer/ComposerReferences;Lkotlin/jvm/functions/Function1;)V", "show", "item", "Lru/ozon/app/android/common/ui/customcurtain/CurtainCustomVO;", "commonwidgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class PageLoadHelper extends ShowHelper {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PageLoadHelper(@NotNull ComposerReferences ref, @NotNull Function1<? super AtomAction, Unit> actionHandler) {
        super(ref, actionHandler);
        Intrinsics.checkNotNullParameter(ref, "ref");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
    }

    public void show(@NotNull CurtainCustomVO item) {
        Intrinsics.checkNotNullParameter(item, "item");
        showCurtain(item);
        updateVisibility(item);
    }
}
