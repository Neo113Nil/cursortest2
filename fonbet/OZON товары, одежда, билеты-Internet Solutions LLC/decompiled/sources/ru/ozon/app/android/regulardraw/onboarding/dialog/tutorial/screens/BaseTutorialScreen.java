package ru.ozon.app.android.regulardraw.onboarding.dialog.tutorial.screens;

import android.view.ViewGroup;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.regulardraw.onboarding.dialog.tutorial.data.TutorialScreenModel;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\b!\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u001b\u0010\t\u001a\u00020\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eR\u0016\u0010\u0010\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lru/ozon/app/android/regulardraw/onboarding/dialog/tutorial/screens/BaseTutorialScreen;", "Lru/ozon/app/android/regulardraw/onboarding/dialog/tutorial/data/TutorialScreenModel;", "T", "", "<init>", "()V", "Lkotlin/Function0;", "", "action", "doOnClick", "(Lkotlin/jvm/functions/Function0;)V", "Landroid/view/ViewGroup;", "container", "fitsSystemWindow", "(Landroid/view/ViewGroup;)V", "", "isScreenClicked", "Z", "regulardraw_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public abstract class BaseTutorialScreen<T extends TutorialScreenModel> {
    private boolean isScreenClicked;

    public final void doOnClick(@NotNull Function0<Unit> action) {
        Intrinsics.checkNotNullParameter(action, "action");
        if (this.isScreenClicked) {
            return;
        }
        this.isScreenClicked = true;
        action.invoke();
    }

    public final void fitsSystemWindow(@NotNull ViewGroup container) {
        Intrinsics.checkNotNullParameter(container, "container");
        container.setFitsSystemWindows(true);
        container.requestApplyInsets();
    }
}
