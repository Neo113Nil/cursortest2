package ru.ozon.app.android.commonwidgets.widgets.curtain.presentation.custom;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.common.ui.customcurtain.CurtainCustomVO;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\b&\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\f\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u000e\u0010\rR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R \u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0012¨\u0006\u0013"}, d2 = {"Lru/ozon/app/android/commonwidgets/widgets/curtain/presentation/custom/ShowHelper;", "", "Lru/ozon/app/android/composer/ComposerReferences;", "ref", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "actionHandler", "<init>", "(Lru/ozon/app/android/composer/ComposerReferences;Lkotlin/jvm/functions/Function1;)V", "Lru/ozon/app/android/common/ui/customcurtain/CurtainCustomVO;", "item", "showCurtain", "(Lru/ozon/app/android/common/ui/customcurtain/CurtainCustomVO;)V", "updateVisibility", "Lru/ozon/app/android/composer/ComposerReferences;", "getRef", "()Lru/ozon/app/android/composer/ComposerReferences;", "Lkotlin/jvm/functions/Function1;", "commonwidgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public abstract class ShowHelper {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final ComposerReferences ref;

    /* JADX WARN: Multi-variable type inference failed */
    public ShowHelper(@NotNull ComposerReferences ref, @NotNull Function1<? super AtomAction, Unit> actionHandler) {
        Intrinsics.checkNotNullParameter(ref, "ref");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        this.ref = ref;
        this.actionHandler = actionHandler;
    }

    @NotNull
    public final ComposerReferences getRef() {
        return this.ref;
    }

    public final void showCurtain(@NotNull CurtainCustomVO item) {
        Intrinsics.checkNotNullParameter(item, "item");
        this.actionHandler.invoke(AtomActionMapperKt.toAtomAction(item.getAction(), item.getTrackingInfo()));
        this.actionHandler.invoke(new AtomAction.ViewAction(item.getTrackingInfo(), null, 2, null));
    }

    public final void updateVisibility(@NotNull CurtainCustomVO item) {
        Intrinsics.checkNotNullParameter(item, "item");
        this.ref.getController().m(item.getId());
    }
}
