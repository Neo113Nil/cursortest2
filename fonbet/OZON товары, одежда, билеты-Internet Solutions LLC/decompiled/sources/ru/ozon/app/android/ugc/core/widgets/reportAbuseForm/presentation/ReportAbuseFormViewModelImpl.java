package ru.ozon.app.android.ugc.core.widgets.reportAbuseForm.presentation;

import Ae.E0;
import androidx.lifecycle.w0;
import androidx.lifecycle.x0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.v2.ActionV2Repository;
import ru.ozon.app.android.ugc.core.widgets.reportAbuseForm.presentation.ReportAbuseFormViewModel;
import ru.ozon.uni.atoms.af.AtomAction;
import xe.C10727i;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002B\u0011\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u000eR \u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R \u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\n0\u000f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0012\u001a\u0004\b\u0016\u0010\u0014R\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/reportAbuseForm/presentation/ReportAbuseFormViewModelImpl;", "Landroidx/lifecycle/w0;", "Lru/ozon/app/android/ugc/core/widgets/reportAbuseForm/presentation/ReportAbuseFormViewModel;", "Lru/ozon/app/android/action/v2/ActionV2Repository;", "actionV2Repository", "<init>", "(Lru/ozon/app/android/action/v2/ActionV2Repository;)V", "", "observeViewIntent", "()V", "Lru/ozon/app/android/ugc/core/widgets/reportAbuseForm/presentation/ReportAbuseFormViewModel$ViewIntent;", "viewIntent", "onViewIntent", "(Lru/ozon/app/android/ugc/core/widgets/reportAbuseForm/presentation/ReportAbuseFormViewModel$ViewIntent;)V", "Lru/ozon/app/android/action/v2/ActionV2Repository;", "LAe/w0;", "Lru/ozon/app/android/ugc/core/widgets/reportAbuseForm/presentation/ReportAbuseFormViewModel$SingleEvent;", "singleEvent", "LAe/w0;", "getSingleEvent", "()LAe/w0;", "viewIntents", "getViewIntents", "Lru/ozon/uni/atoms/af/AtomAction;", "action", "Lru/ozon/uni/atoms/af/AtomAction;", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ReportAbuseFormViewModelImpl extends w0 implements ReportAbuseFormViewModel {
    private AtomAction action;

    @NotNull
    private final ActionV2Repository actionV2Repository;

    @NotNull
    private final Ae.w0<ReportAbuseFormViewModel.SingleEvent> singleEvent;

    @NotNull
    private final Ae.w0<ReportAbuseFormViewModel.ViewIntent> viewIntents;

    public ReportAbuseFormViewModelImpl(@NotNull ActionV2Repository actionV2Repository) {
        Intrinsics.checkNotNullParameter(actionV2Repository, "actionV2Repository");
        this.actionV2Repository = actionV2Repository;
        this.singleEvent = E0.b(0, 0, null, 7);
        this.viewIntents = E0.b(0, 0, null, 7);
        observeViewIntent();
    }

    private final void observeViewIntent() {
        C10727i.c(x0.a(this), null, null, new ReportAbuseFormViewModelImpl$observeViewIntent$1(this, null), 3);
    }

    @Override // ru.ozon.app.android.ugc.core.widgets.reportAbuseForm.presentation.ReportAbuseFormViewModel
    @NotNull
    public Ae.w0<ReportAbuseFormViewModel.ViewIntent> getViewIntents() {
        return this.viewIntents;
    }

    @Override // ru.ozon.app.android.ugc.core.widgets.reportAbuseForm.presentation.ReportAbuseFormViewModel
    public void onViewIntent(@NotNull ReportAbuseFormViewModel.ViewIntent viewIntent) {
        Intrinsics.checkNotNullParameter(viewIntent, "viewIntent");
        C10727i.c(x0.a(this), null, null, new ReportAbuseFormViewModelImpl$onViewIntent$1(this, viewIntent, null), 3);
    }

    @Override // ru.ozon.app.android.ugc.core.widgets.reportAbuseForm.presentation.ReportAbuseFormViewModel
    @NotNull
    public Ae.w0<ReportAbuseFormViewModel.SingleEvent> getSingleEvent() {
        return this.singleEvent;
    }
}
