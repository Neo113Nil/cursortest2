package ru.ozon.app.android.ugc.view.sheet;

import androidx.core.app.t;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.sheet.AtomActionSheetHandler;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.ugc.view.sheet.bind.ActionSheetInfo;
import ru.ozon.app.android.ugc.view.sheet.bind.ReviewActionSheetHandler;
import ru.ozon.app.android.uikit.R$string;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \f*\b\b\u0000\u0010\u0001*\u00020\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003:\u0001\fB\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lru/ozon/app/android/ugc/view/sheet/ShareReviewActionSheetHandler;", "T", "Lru/ozon/app/android/ugc/view/sheet/bind/ActionSheetInfo;", "Lru/ozon/app/android/ugc/view/sheet/bind/ReviewActionSheetHandler;", "refs", "Lru/ozon/app/android/composer/ComposerReferences;", "<init>", "(Lru/ozon/app/android/composer/ComposerReferences;)V", "handle", "", "action", "Lru/ozon/uni/atoms/af/AtomAction;", "Companion", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ShareReviewActionSheetHandler<T extends ActionSheetInfo> extends ReviewActionSheetHandler<T> {

    @NotNull
    private final ComposerReferences refs;
    public static final int $stable = ComposerReferences.$stable;

    public ShareReviewActionSheetHandler(@NotNull ComposerReferences refs) {
        Intrinsics.checkNotNullParameter(refs, "refs");
        this.refs = refs;
    }

    @Override // ru.ozon.app.android.ugc.view.sheet.bind.ReviewActionSheetHandler
    public boolean handle(@NotNull AtomAction action) {
        Intrinsics.checkNotNullParameter(action, "action");
        if (!(action instanceof AtomAction.Click)) {
            return false;
        }
        AtomAction.Click click = (AtomAction.Click) action;
        if (AtomActionSheetHandler.SheetAction.INSTANCE.fromValue(click.getId()) != AtomActionSheetHandler.SheetAction.SHARE) {
            return false;
        }
        t.a aVar = new t.a(this.refs.getContainer().i());
        aVar.g("text/plain");
        aVar.f(click.getLink());
        aVar.c(R$string.common_action_share);
        aVar.h();
        return true;
    }
}
