package ru.ozon.app.android.pdp.ui.configurators.ugc;

import Sc.InterfaceC4008j;
import WZ.l;
import WZ.t;
import a00.h;
import android.content.Intent;
import android.os.Parcelable;
import androidx.lifecycle.B0;
import androidx.lifecycle.J;
import androidx.lifecycle.w0;
import androidx.lifecycle.z0;
import kotlin.Metadata;
import kotlin.collections.C7705l;
import kotlin.jvm.internal.Intrinsics;
import l10.InterfaceC7851b;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.ConfiguratorReferences;
import ru.ozon.app.android.composer.universalscreen.view.ComposerScreenConfig;
import ru.ozon.app.android.pdp.ui.configurators.analitycs.TokenizedAnalyticsExtKt;
import ru.ozon.app.android.pdp.ui.configurators.ugc.listReviews.ListReviewSortsViewModel;
import ru.ozon.app.android.pdp.utils.DelegatesKt;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0014¢\u0006\u0004\b\b\u0010\tJ)\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0015R\u0018\u0010\u0016\u001a\u0004\u0018\u00010\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u001b\u0010\u001d\u001a\u00020\u00188BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001e"}, d2 = {"Lru/ozon/app/android/pdp/ui/configurators/ugc/ReviewConfigurator;", "Lru/ozon/app/android/composer/universalscreen/view/ComposerScreenConfig$PageConfigurator;", "LPc/a;", "Lru/ozon/app/android/pdp/ui/configurators/ugc/listReviews/ListReviewSortsViewModel;", "pListReviewSortsViewModel", "<init>", "(LPc/a;)V", "", "onComposerInitialized", "()V", "", "requestCode", "resultCode", "Landroid/content/Intent;", "data", "onActivityResult", "(IILandroid/content/Intent;)V", "Landroidx/lifecycle/J;", "owner", "onDestroy", "(Landroidx/lifecycle/J;)V", "LPc/a;", "listReviewSortsViewModel", "Lru/ozon/app/android/pdp/ui/configurators/ugc/listReviews/ListReviewSortsViewModel;", "Lru/ozon/app/android/pdp/ui/configurators/ugc/ReportAbuseResultNotificationBinder;", "reportAbuseResultNotificationBinder$delegate", "LSc/j;", "getReportAbuseResultNotificationBinder", "()Lru/ozon/app/android/pdp/ui/configurators/ugc/ReportAbuseResultNotificationBinder;", "reportAbuseResultNotificationBinder", "configurators_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ReviewConfigurator extends ComposerScreenConfig.PageConfigurator {
    private ListReviewSortsViewModel listReviewSortsViewModel;

    @NotNull
    private final Pc.a<ListReviewSortsViewModel> pListReviewSortsViewModel;

    /* renamed from: reportAbuseResultNotificationBinder$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j reportAbuseResultNotificationBinder;

    public ReviewConfigurator(@NotNull Pc.a<ListReviewSortsViewModel> pListReviewSortsViewModel) {
        Intrinsics.checkNotNullParameter(pListReviewSortsViewModel, "pListReviewSortsViewModel");
        this.pListReviewSortsViewModel = pListReviewSortsViewModel;
        this.reportAbuseResultNotificationBinder = DelegatesKt.lazyUnsafe(new ReviewConfigurator$reportAbuseResultNotificationBinder$2(this));
    }

    private final ReportAbuseResultNotificationBinder getReportAbuseResultNotificationBinder() {
        return (ReportAbuseResultNotificationBinder) this.reportAbuseResultNotificationBinder.getValue();
    }

    @Override // ru.ozon.app.android.composer.universalscreen.view.ComposerScreenConfig.PageConfigurator
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        String str;
        ConfiguratorReferences references;
        InterfaceC7851b controller;
        Parcelable parcelable;
        ConfiguratorReferences references2;
        l tokenizedAnalytics;
        if (resultCode == -1 && requestCode == 34255 && data != null) {
            String[] stringArrayExtra = data.getStringArrayExtra("ru.ozon.app.android.reviews.widgets.listreviews.presentation.sorts.KEY_SORTS_IS_ACTION_ARRAY");
            String[] stringArrayExtra2 = data.getStringArrayExtra("ru.ozon.app.android.commonwidgets.widgets.sortsbottomsheetdialog.KEY_SORTS_DEEPLINK_ARRAY");
            Parcelable[] parcelableArrayExtra = data.getParcelableArrayExtra("ru.ozon.app.android.commonwidgets.widgets.sortsbottomsheetdialog.KEY_SORTS_TRACKING_INFO_ARRAY");
            int intExtra = data.getIntExtra("KEY_SELECTED_POSITION", -1);
            Integer valueOf = Integer.valueOf(intExtra);
            if (intExtra == -1) {
                valueOf = null;
            }
            if (valueOf != null) {
                int intValue = valueOf.intValue();
                if ((stringArrayExtra != null ? (String) C7705l.K(intValue, stringArrayExtra) : null) != null) {
                    ListReviewSortsViewModel listReviewSortsViewModel = this.listReviewSortsViewModel;
                    if (listReviewSortsViewModel != null) {
                        listReviewSortsViewModel.invokeSort(intValue);
                        return;
                    }
                    return;
                }
                if (parcelableArrayExtra != null && (parcelable = (Parcelable) C7705l.K(intValue, parcelableArrayExtra)) != null) {
                    t tVar = parcelable instanceof t ? (t) parcelable : null;
                    if (tVar != null && (references2 = getReferences()) != null && (tokenizedAnalytics = references2.getTokenizedAnalytics()) != null) {
                        TokenizedAnalyticsExtKt.processNonViewEvents(tokenizedAnalytics, tVar);
                    }
                }
                if (stringArrayExtra2 == null || (str = (String) C7705l.K(intValue, stringArrayExtra2)) == null || (references = getReferences()) == null || (controller = references.getController()) == null) {
                    return;
                }
                InterfaceC7851b.a.a(controller, str, null, null, null, 14);
            }
        }
    }

    @Override // ru.ozon.app.android.composer.universalscreen.view.ComposerScreenConfig.PageConfigurator
    protected void onComposerInitialized() {
        h viewModelOwnerProvider;
        B0 a11;
        ConfiguratorReferences references = getReferences();
        this.listReviewSortsViewModel = (references == null || (viewModelOwnerProvider = references.getViewModelOwnerProvider()) == null || (a11 = viewModelOwnerProvider.a()) == null) ? null : (ListReviewSortsViewModel) new z0(a11, new z0.c() { // from class: ru.ozon.app.android.pdp.ui.configurators.ugc.ReviewConfigurator$onComposerInitialized$$inlined$createViewModel$1
            @Override // androidx.lifecycle.z0.c, androidx.lifecycle.z0.b
            public <T extends w0> T create(Class<T> modelClass) {
                Pc.a aVar;
                Intrinsics.checkNotNullParameter(modelClass, "modelClass");
                aVar = ReviewConfigurator.this.pListReviewSortsViewModel;
                ListReviewSortsViewModel listReviewSortsViewModel = (ListReviewSortsViewModel) aVar.get();
                Intrinsics.g(listReviewSortsViewModel, "null cannot be cast to non-null type T of ru.ozon.app.android.utils.lifecycle.ViewModelExtKt.vmFactory.<no name provided>.create");
                return listReviewSortsViewModel;
            }
        }).a(ListReviewSortsViewModel.class);
        getReportAbuseResultNotificationBinder().setupFragmentResultListener(false);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onDestroy(@NotNull J owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        getReportAbuseResultNotificationBinder().clearFragmentResultListener();
        this.listReviewSortsViewModel = null;
    }
}
