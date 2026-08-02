package ru.ozon.app.android.commonwidgets.widgets.restrictions.presentation;

import WZ.t;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.analytics.modules.tokenized.TokenizedAnalyticsExtensionsKt;
import ru.ozon.app.android.commonwidgets.widgets.restrictions.presentation.RestrictionsVO;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.session.deleteAccount.data.DeleteAccountApiResponse;
import ru.ozon.app.android.tools.FlashbarActionHandler;
import ru.ozon.uni.android.flashbar.model.RestrictionAction;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lru/ozon/app/android/commonwidgets/widgets/restrictions/presentation/CartFlashbarActionHandler;", "Lru/ozon/app/android/tools/FlashbarActionHandler;", "refs", "Lru/ozon/app/android/composer/ComposerReferences;", DeleteAccountApiResponse.Error.TYPE_RESTRICTION, "Lru/ozon/app/android/commonwidgets/widgets/restrictions/presentation/RestrictionsVO$RestrictionVO;", "<init>", "(Lru/ozon/app/android/composer/ComposerReferences;Lru/ozon/app/android/commonwidgets/widgets/restrictions/presentation/RestrictionsVO$RestrictionVO;)V", "onAction", "", "action", "Lru/ozon/uni/android/flashbar/model/RestrictionAction;", "widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class CartFlashbarActionHandler extends FlashbarActionHandler {

    @NotNull
    private final ComposerReferences refs;

    @NotNull
    private final RestrictionsVO.RestrictionVO restriction;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CartFlashbarActionHandler(@NotNull ComposerReferences refs, @NotNull RestrictionsVO.RestrictionVO restriction) {
        super(refs);
        Intrinsics.checkNotNullParameter(refs, "refs");
        Intrinsics.checkNotNullParameter(restriction, "restriction");
        this.refs = refs;
        this.restriction = restriction;
    }

    @Override // ru.ozon.app.android.tools.FlashbarActionHandler, ru.ozon.uni.android.flashbar.callback.OnActionClickListener
    public void onAction(@NotNull RestrictionAction action) {
        Intrinsics.checkNotNullParameter(action, "action");
        if (!(action instanceof RestrictionAction.ScrollAction)) {
            super.onAction(action);
            t event = this.restriction.getEvent();
            if (event != null) {
                TokenizedAnalyticsExtensionsKt.processNonViewEvents$default(this.refs.getTokenizedAnalytics(), event, null, 2, null);
                return;
            }
            return;
        }
        if (this.refs.getContainer().a() != null) {
            this.refs.getController().c(((RestrictionAction.ScrollAction) action).getWidgetId(), Integer.valueOf(ResourceExtKt.toPx(40)), false);
        }
        t event2 = this.restriction.getEvent();
        if (event2 != null) {
            TokenizedAnalyticsExtensionsKt.processNonViewEvents$default(this.refs.getTokenizedAnalytics(), event2, null, 2, null);
        }
    }
}
