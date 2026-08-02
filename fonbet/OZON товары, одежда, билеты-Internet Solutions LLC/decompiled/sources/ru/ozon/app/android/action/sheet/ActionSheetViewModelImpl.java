package ru.ozon.app.android.action.sheet;

import AF.a;
import AF.b;
import Bc.r;
import Bt.C2673b;
import androidx.lifecycle.C5415f;
import androidx.lifecycle.V;
import androidx.lifecycle.w0;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import mc.C8125a;
import nc.C8486a;
import nc.InterfaceC8487b;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.sheet.ActionSheetViewModel;
import ru.ozon.app.android.action.v2.ActionV2Repository;
import ru.ozon.app.android.action.v2.models.ActionV2Request;
import ru.ozon.app.android.utils.livedata.SingleLiveEvent;
import ru.ozon.app.android.utils.rx.RxExtKt;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0011\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J+\u0010\r\u001a\u00020\f2\b\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\t\u001a\u00020\u00072\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0015R \u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00168\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR,\u0010\u001e\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u001d0\u001c8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010\"R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010#R\u0016\u0010\t\u001a\u00020\u00078\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\t\u0010\"¨\u0006$"}, d2 = {"Lru/ozon/app/android/action/sheet/ActionSheetViewModelImpl;", "Lru/ozon/app/android/action/sheet/ActionSheetViewModel;", "Landroidx/lifecycle/w0;", "Lru/ozon/app/android/action/v2/ActionV2Repository;", "repository", "<init>", "(Lru/ozon/app/android/action/v2/ActionV2Repository;)V", "", "currentPageUrl", "actionPath", "Lru/ozon/app/android/action/sheet/AnalyticsInfo;", "analyticsInfo", "", "bindInitialRemote", "(Ljava/lang/String;Ljava/lang/String;Lru/ozon/app/android/action/sheet/AnalyticsInfo;)V", "Lru/ozon/app/android/action/sheet/ActionSheetVO;", "actionSheet", "bindInitialLocal", "(Lru/ozon/app/android/action/sheet/ActionSheetVO;)V", "refresh", "()V", "Lru/ozon/app/android/action/v2/ActionV2Repository;", "Landroidx/lifecycle/V;", "Lru/ozon/app/android/action/sheet/ActionSheetViewModel$ScreenState;", "screenState", "Landroidx/lifecycle/V;", "getScreenState", "()Landroidx/lifecycle/V;", "Lru/ozon/app/android/utils/livedata/SingleLiveEvent;", "", "analyticIsLoaded", "Lru/ozon/app/android/utils/livedata/SingleLiveEvent;", "getAnalyticIsLoaded", "()Lru/ozon/app/android/utils/livedata/SingleLiveEvent;", "Ljava/lang/String;", "Lru/ozon/app/android/action/sheet/AnalyticsInfo;", "action_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class ActionSheetViewModelImpl extends w0 implements ActionSheetViewModel {
    private String actionPath;

    @NotNull
    private final SingleLiveEvent<Map<String, String>> analyticIsLoaded;
    private AnalyticsInfo analyticsInfo;
    private String currentPageUrl;

    @NotNull
    private final ActionV2Repository repository;

    @NotNull
    private final V<ActionSheetViewModel.ScreenState> screenState;

    public ActionSheetViewModelImpl(@NotNull ActionV2Repository repository) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        this.repository = repository;
        this.screenState = new V<>();
        this.analyticIsLoaded = new SingleLiveEvent<>();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ActionSheetVO bindInitialRemote$lambda$0(Function1 function1, Object p02) {
        Intrinsics.checkNotNullParameter(p02, "p0");
        return (ActionSheetVO) function1.invoke(p02);
    }

    @Override // ru.ozon.app.android.action.sheet.ActionSheetViewModel
    public void bindInitialLocal(@NotNull ActionSheetVO actionSheet) {
        Intrinsics.checkNotNullParameter(actionSheet, "actionSheet");
        getScreenState().setValue(new ActionSheetViewModel.ScreenState.Content(actionSheet));
    }

    @Override // ru.ozon.app.android.action.sheet.ActionSheetViewModel
    public void bindInitialRemote(String currentPageUrl, @NotNull String actionPath, AnalyticsInfo analyticsInfo) {
        Intrinsics.checkNotNullParameter(actionPath, "actionPath");
        this.currentPageUrl = currentPageUrl;
        this.actionPath = actionPath;
        this.analyticsInfo = analyticsInfo;
        C5415f.a(this).d();
        C8486a a11 = C5415f.a(this);
        InterfaceC8487b h11 = new r(this.repository.requestActionSheet(new ActionV2Request(null, actionPath, false, 5, null), currentPageUrl, analyticsInfo).g(C8125a.a()), new C2673b(new ActionSheetViewModelImpl$bindInitialRemote$1(this), 8)).h(new a(new ActionSheetViewModelImpl$bindInitialRemote$2(this), 14), new b(new ActionSheetViewModelImpl$bindInitialRemote$3(this), 13));
        Intrinsics.checkNotNullExpressionValue(h11, "subscribe(...)");
        RxExtKt.plusAssign(a11, h11);
    }

    @Override // ru.ozon.app.android.action.sheet.ActionSheetViewModel
    public void refresh() {
        getScreenState().postValue(ActionSheetViewModel.ScreenState.Loading.INSTANCE);
        String str = this.currentPageUrl;
        String str2 = this.actionPath;
        if (str2 != null) {
            bindInitialRemote(str, str2, this.analyticsInfo);
        } else {
            Intrinsics.n("actionPath");
            throw null;
        }
    }

    @Override // ru.ozon.app.android.action.sheet.ActionSheetViewModel
    @NotNull
    public SingleLiveEvent<Map<String, String>> getAnalyticIsLoaded() {
        return this.analyticIsLoaded;
    }

    @Override // ru.ozon.app.android.action.sheet.ActionSheetViewModel
    @NotNull
    public V<ActionSheetViewModel.ScreenState> getScreenState() {
        return this.screenState;
    }
}
