package ru.ozon.app.android.common.actionHandlers.applySorting;

import A00.a;
import Aq.RunnableC2442a;
import android.os.Handler;
import android.os.Looper;
import androidx.lifecycle.w0;
import i10.h;
import i10.l;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.custom.CustomActionHandler;
import ru.ozon.app.android.composer.ComposerExtKt;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u001b\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\bH\u0014¢\u0006\u0004\b\u0010\u0010\u0003J\u001d\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\r\u0010\u0015\u001a\u00020\b¢\u0006\u0004\b\u0015\u0010\u0003R\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u001a"}, d2 = {"Lru/ozon/app/android/common/actionHandlers/applySorting/ApplySortingViewModel;", "Landroidx/lifecycle/w0;", "<init>", "()V", "Lru/ozon/uni/atoms/af/AtomAction$Click;", "action", "Lru/ozon/app/android/composer/ComposerReferences;", "refs", "", "refreshAfterApplySorting", "(Lru/ozon/uni/atoms/af/AtomAction$Click;Lru/ozon/app/android/composer/ComposerReferences;)V", "", "scrollPosition", "Li10/h$b;", "getScrollOneTimePostProcessing", "(Ljava/lang/String;)Li10/h$b;", "onCleared", "Lru/ozon/app/android/action/custom/CustomActionHandler$HandlerReferences;", "handlerRefs", "applySortingWithDelay", "(Lru/ozon/uni/atoms/af/AtomAction$Click;Lru/ozon/app/android/action/custom/CustomActionHandler$HandlerReferences;)V", "cancelApplySorting", "Landroid/os/Handler;", "handler", "Landroid/os/Handler;", "Companion", "action-handlers_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class ApplySortingViewModel extends w0 {

    @NotNull
    private static final Companion Companion = new Companion(null);

    @NotNull
    private final Handler handler = new Handler(Looper.getMainLooper());

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0086T¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lru/ozon/app/android/common/actionHandlers/applySorting/ApplySortingViewModel$Companion;", "", "<init>", "()V", "DEFAULT_DEBOUNCE", "", "SCROLL_POSITION_KEY", "", "TOP_POSITION_VALUE", "START_POSITION", "", "action-handlers_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void applySortingWithDelay$lambda$2$lambda$1(ComposerReferences composerReferences, ApplySortingViewModel applySortingViewModel, AtomAction.Click click) {
        composerReferences.getNavigator().popBackStack();
        applySortingViewModel.refreshAfterApplySorting(click, composerReferences);
    }

    private final h.b getScrollOneTimePostProcessing(String scrollPosition) {
        l.a.b bVar = null;
        if (Intrinsics.d(scrollPosition, "top")) {
            return new h.b(new a.C.C0000a(0, false), bVar, 2);
        }
        return null;
    }

    private final void refreshAfterApplySorting(AtomAction.Click action, ComposerReferences refs) {
        Map<String, String> params = action.getParams();
        ComposerExtKt.sendRefreshToTargetFragment$default(refs.getContainer(), action.getLink(), getScrollOneTimePostProcessing(params != null ? params.get("scrollPosition") : null), null, null, 12, null);
    }

    public final void applySortingWithDelay(@NotNull AtomAction.Click action, @NotNull CustomActionHandler.HandlerReferences handlerRefs) {
        Intrinsics.checkNotNullParameter(action, "action");
        Intrinsics.checkNotNullParameter(handlerRefs, "handlerRefs");
        ComposerReferences refs = handlerRefs.getRefs();
        Long voId = handlerRefs.getVoId();
        if (voId != null) {
            refs.getController().update(new ApplySortingUpdateVO(voId.longValue()));
        }
        this.handler.removeCallbacksAndMessages(null);
        this.handler.postDelayed(new RunnableC2442a(refs, this, action, 0), 150L);
    }

    public final void cancelApplySorting() {
        this.handler.removeCallbacksAndMessages(null);
    }

    @Override // androidx.lifecycle.w0
    protected void onCleared() {
        this.handler.removeCallbacksAndMessages(null);
    }
}
