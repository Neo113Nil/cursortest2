package ru.ozon.app.android.regulardraw.widgets.entryBannerWidget.v2.presentation;

import androidx.lifecycle.w0;
import androidx.lifecycle.x0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.v2.ActionV2Repository;
import ru.ozon.app.android.regulardraw.widgets.entryBannerWidget.v2.presentation.EntryBannerVI;
import ru.ozon.uni.atoms.af.AtomAction;
import xe.C10727i;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\r\u0010\u000b\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\rR\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lru/ozon/app/android/regulardraw/widgets/entryBannerWidget/v2/presentation/EntryBannerViewModel;", "Landroidx/lifecycle/w0;", "Lru/ozon/app/android/action/v2/ActionV2Repository;", "actionRepository", "<init>", "(Lru/ozon/app/android/action/v2/ActionV2Repository;)V", "Lru/ozon/app/android/regulardraw/widgets/entryBannerWidget/v2/presentation/EntryBannerVI$Content;", "content", "", "onWidgetAppeared", "(Lru/ozon/app/android/regulardraw/widgets/entryBannerWidget/v2/presentation/EntryBannerVI$Content;)V", "onGoneAwayFromScreen", "()V", "Lru/ozon/app/android/action/v2/ActionV2Repository;", "", "lastTrackedContent", "Ljava/lang/Object;", "regulardraw_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class EntryBannerViewModel extends w0 {

    @NotNull
    private final ActionV2Repository actionRepository;
    private Object lastTrackedContent;

    public EntryBannerViewModel(@NotNull ActionV2Repository actionRepository) {
        Intrinsics.checkNotNullParameter(actionRepository, "actionRepository");
        this.actionRepository = actionRepository;
    }

    public final void onGoneAwayFromScreen() {
        this.lastTrackedContent = null;
    }

    public final void onWidgetAppeared(@NotNull EntryBannerVI.Content content) {
        Intrinsics.checkNotNullParameter(content, "content");
        Object obj = this.lastTrackedContent;
        if (obj == null || !obj.equals(content)) {
            this.lastTrackedContent = content;
            AtomAction viewAction = content.getViewAction();
            AtomAction.ComposerAction composerAction = viewAction instanceof AtomAction.ComposerAction ? (AtomAction.ComposerAction) viewAction : null;
            if (composerAction != null) {
                C10727i.c(x0.a(this), null, null, new EntryBannerViewModel$onWidgetAppeared$1$1(this, composerAction, null), 3);
            }
        }
    }
}
