package ru.ozon.app.android.commonwidgets.widgets.curtain.presentation.custom;

import A00.a;
import androidx.lifecycle.AbstractC5434v;
import androidx.lifecycle.W;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.common.ui.customcurtain.CurtainCustomVO;
import ru.ozon.app.android.commonwidgets.widgets.curtain.presentation.custom.PageLoadWithCustomLogicHelper;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u0018\u0010\u0010\u001a\u0004\u0018\u00010\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/commonwidgets/widgets/curtain/presentation/custom/PageLoadWithCustomLogicHelper;", "Lru/ozon/app/android/commonwidgets/widgets/curtain/presentation/custom/ShowHelper;", "Lru/ozon/app/android/composer/ComposerReferences;", "ref", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "actionHandler", "<init>", "(Lru/ozon/app/android/composer/ComposerReferences;Lkotlin/jvm/functions/Function1;)V", TokenizedTrackingInfo.ACTION_UNSUBSCRIBE, "()V", "Lru/ozon/app/android/common/ui/customcurtain/CurtainCustomVO;", "item", "show", "(Lru/ozon/app/android/common/ui/customcurtain/CurtainCustomVO;)V", "currentItem", "Lru/ozon/app/android/common/ui/customcurtain/CurtainCustomVO;", "Landroidx/lifecycle/W;", "LA00/a;", "observer", "Landroidx/lifecycle/W;", "commonwidgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class PageLoadWithCustomLogicHelper extends ShowHelper {
    private CurtainCustomVO currentItem;

    @NotNull
    private final W<a> observer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PageLoadWithCustomLogicHelper(@NotNull final ComposerReferences ref, @NotNull Function1<? super AtomAction, Unit> actionHandler) {
        super(ref, actionHandler);
        Intrinsics.checkNotNullParameter(ref, "ref");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        this.observer = new W() { // from class: or.a
            @Override // androidx.lifecycle.W
            public final void onChanged(Object obj) {
                PageLoadWithCustomLogicHelper.observer$lambda$1(ComposerReferences.this, this, (A00.a) obj);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void observer$lambda$1(ComposerReferences composerReferences, PageLoadWithCustomLogicHelper pageLoadWithCustomLogicHelper, a event) {
        Intrinsics.checkNotNullParameter(event, "event");
        boolean a11 = composerReferences.getContainer().g().getLifecycle().b().a(AbstractC5434v.b.STARTED);
        if ((event instanceof a.C2370k) && a11) {
            CurtainCustomVO curtainCustomVO = pageLoadWithCustomLogicHelper.currentItem;
            if (curtainCustomVO != null) {
                pageLoadWithCustomLogicHelper.showCurtain(curtainCustomVO);
            }
            pageLoadWithCustomLogicHelper.unsubscribe();
            pageLoadWithCustomLogicHelper.currentItem = null;
        }
    }

    private final void unsubscribe() {
        getRef().getController().getEvents().removeObserver(this.observer);
    }

    public void show(@NotNull CurtainCustomVO item) {
        Intrinsics.checkNotNullParameter(item, "item");
        this.currentItem = item;
        getRef().getController().getEvents().observe(getRef().getContainer().g(), this.observer);
        updateVisibility(item);
    }
}
