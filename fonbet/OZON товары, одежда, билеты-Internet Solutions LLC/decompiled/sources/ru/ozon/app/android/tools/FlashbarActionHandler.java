package ru.ozon.app.android.tools;

import Sc.o;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l10.InterfaceC7851b;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.ComposerNavigator;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.uni.android.flashbar.callback.OnActionClickListener;
import ru.ozon.uni.android.flashbar.model.RestrictionAction;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0017\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lru/ozon/app/android/tools/FlashbarActionHandler;", "Lru/ozon/uni/android/flashbar/callback/OnActionClickListener;", "refs", "Lru/ozon/app/android/composer/ComposerReferences;", "<init>", "(Lru/ozon/app/android/composer/ComposerReferences;)V", "onAction", "", "action", "Lru/ozon/uni/android/flashbar/model/RestrictionAction;", "composer_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public class FlashbarActionHandler implements OnActionClickListener {

    @NotNull
    private final ComposerReferences refs;

    public FlashbarActionHandler(@NotNull ComposerReferences refs) {
        Intrinsics.checkNotNullParameter(refs, "refs");
        this.refs = refs;
    }

    @Override // ru.ozon.uni.android.flashbar.callback.OnActionClickListener
    public void onAction(@NotNull RestrictionAction action) {
        Intrinsics.checkNotNullParameter(action, "action");
        if (action instanceof RestrictionAction.OpenDeeplinkAction) {
            ComposerNavigator.DefaultImpls.openDeeplink$default(this.refs.getNavigator(), ((RestrictionAction.OpenDeeplinkAction) action).getDeeplink(), null, 2, null);
            return;
        }
        if (action instanceof RestrictionAction.RefreshAction) {
            RestrictionAction.RefreshAction refreshAction = (RestrictionAction.RefreshAction) action;
            InterfaceC7851b.a.a(this.refs.getController(), refreshAction.getDeeplink(), refreshAction.getParams(), null, null, 12);
        } else {
            if (!(action instanceof RestrictionAction.ScrollAction)) {
                throw new o();
            }
            InterfaceC7851b.a.c(this.refs.getController(), ((RestrictionAction.ScrollAction) action).getWidgetId(), null, 6);
        }
    }
}
