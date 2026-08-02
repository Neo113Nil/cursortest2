package ru.ozon.app.android.travel.feature.avia.widgets.aviaSearchResult.legacy.fragment;

import Ae.C2399j;
import Ae.C2408n0;
import BM.a;
import WZ.e;
import WZ.g;
import WZ.h;
import WZ.l;
import WZ.t;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.os.d;
import androidx.fragment.app.ComponentCallbacksC5392m;
import androidx.fragment.app.Q;
import androidx.lifecycle.AbstractC5434v;
import androidx.lifecycle.C5427n;
import androidx.lifecycle.InterfaceC5431s;
import androidx.lifecycle.J;
import androidx.lifecycle.K;
import androidx.lifecycle.P;
import androidx.lifecycle.W;
import androidx.lifecycle.w0;
import androidx.lifecycle.z0;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import fk0.c;
import j10.InterfaceC7238a;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import l10.InterfaceC7851b;
import l10.i;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.analytics.modules.tokenized.TokenizedAnalyticsExtensionsKt;
import ru.ozon.app.android.composer.ComposerFragmentController;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.universalscreen.view.ComposerFragment;
import ru.ozon.app.android.composer.universalscreen.view.ComposerScreenConfig;
import ru.ozon.app.android.composer.view.ComposerViewExtensionKt;
import ru.ozon.app.android.travel.feature.avia.R$id;
import ru.ozon.app.android.travel.feature.avia.databinding.FragmentAviaSearchResultBinding;
import ru.ozon.app.android.travel.feature.avia.widgets.aviaSearchResult.legacy.di.AviaSearchResultComponent;
import ru.ozon.app.android.travel.feature.avia.widgets.aviaSearchResult.legacy.fragment.AviaSearchResultFragment;
import ru.ozon.app.android.travel.feature.avia.widgets.aviaSearchResult.legacy.pool.AviaSearchResultViewPool;
import ru.ozon.app.android.travel.feature.avia.widgets.aviaSearchResult.legacy.presentation.AviaSearchResultVO;
import ru.ozon.app.android.travel.feature.avia.widgets.aviaSearchResult.legacy.presentation.adapter.AviaSearchResultAdapter;
import ru.ozon.app.android.travel.feature.avia.widgets.aviaSearchResult.legacy.presentation.adapter.AviaSearchResultDecoration;
import ru.ozon.app.android.travel.feature.avia.widgets.aviaSearchResult.legacy.viewModel.AviaSearchResultViewModel;
import ru.ozon.app.android.travel.molecules.view.errorState.ErrorStateVO;
import ru.ozon.app.android.travel.molecules.view.errorState.ErrorStateView;
import ru.ozon.app.android.travel.utils.utils.TimerHelper;
import ru.ozon.uni.android.flashbar.factory.FlashbarFactory;
import ru.ozon.uni.android.uikit.extensions.view.ContextExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.af.pool.CacheHolder;
import ru.ozon.uni.atoms.af.pool.RecycledAtomPool;
import ru.ozon.uni.atoms.data.AtomActionDTO;

@Metadata(d1 = {"\u0000\u0096\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 \u008f\u00012\u00020\u00012\u00020\u00022\u00020\u0003:\u0002\u008f\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0019\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ+\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J!\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u000f2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J)\u0010\u001a\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u00152\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\bH\u0016¢\u0006\u0004\b\u001c\u0010\u0005J\u000f\u0010\u001d\u001a\u00020\bH\u0016¢\u0006\u0004\b\u001d\u0010\u0005J\u001f\u0010!\u001a\u00020\b2\u0006\u0010\u001e\u001a\u00020\u00012\u0006\u0010 \u001a\u00020\u001fH\u0016¢\u0006\u0004\b!\u0010\"J\u0011\u0010$\u001a\u0004\u0018\u00010#H\u0016¢\u0006\u0004\b$\u0010%J\u0017\u0010(\u001a\n\u0018\u00010&j\u0004\u0018\u0001`'H\u0016¢\u0006\u0004\b(\u0010)J\u0011\u0010*\u001a\u0004\u0018\u00010\u0003H\u0002¢\u0006\u0004\b*\u0010+J1\u00103\u001a\u00020\b2\u0006\u0010-\u001a\u00020,2\b\u0010/\u001a\u0004\u0018\u00010.2\u000e\u00102\u001a\n\u0018\u000100j\u0004\u0018\u0001`1H\u0002¢\u0006\u0004\b3\u00104J\u001f\u00105\u001a\u00020\b2\u000e\u00102\u001a\n\u0018\u000100j\u0004\u0018\u0001`1H\u0002¢\u0006\u0004\b5\u00106J;\u0010=\u001a\u00020\b2\u0006\u00108\u001a\u0002072\b\u0010/\u001a\u0004\u0018\u0001092\u000e\u0010:\u001a\n\u0018\u000100j\u0004\u0018\u0001`12\b\u0010<\u001a\u0004\u0018\u00010;H\u0002¢\u0006\u0004\b=\u0010>J\u001d\u0010A\u001a\u00060?j\u0002`@2\b\u0010<\u001a\u0004\u0018\u00010;H\u0002¢\u0006\u0004\bA\u0010BJ\u0017\u0010C\u001a\u00020\b2\u0006\u0010/\u001a\u00020.H\u0002¢\u0006\u0004\bC\u0010DJ\u001f\u0010F\u001a\u00020\b2\u0006\u0010/\u001a\u00020.2\u0006\u0010E\u001a\u00020\u0015H\u0002¢\u0006\u0004\bF\u0010GJ\u000f\u0010H\u001a\u00020\bH\u0002¢\u0006\u0004\bH\u0010\u0005J\u000f\u0010I\u001a\u00020\bH\u0002¢\u0006\u0004\bI\u0010\u0005J\u000f\u0010J\u001a\u00020\bH\u0002¢\u0006\u0004\bJ\u0010\u0005J\u0019\u0010K\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\bK\u0010\nJ\u0017\u0010L\u001a\u00020\b2\u0006\u0010\u001e\u001a\u00020\u0001H\u0002¢\u0006\u0004\bL\u0010MJ\u0017\u0010N\u001a\u00020\b2\u0006\u0010 \u001a\u00020\u001fH\u0002¢\u0006\u0004\bN\u0010OJ\u0019\u0010R\u001a\u00020\b2\b\u0010Q\u001a\u0004\u0018\u00010PH\u0002¢\u0006\u0004\bR\u0010SJ\u0017\u0010T\u001a\u00020\b2\u0006\u0010/\u001a\u00020.H\u0002¢\u0006\u0004\bT\u0010DJ\u000f\u0010U\u001a\u00020\bH\u0002¢\u0006\u0004\bU\u0010\u0005J\u0017\u0010W\u001a\u00020\b2\u0006\u0010V\u001a\u000207H\u0002¢\u0006\u0004\bW\u0010XJ\u000f\u0010Y\u001a\u00020\bH\u0002¢\u0006\u0004\bY\u0010\u0005J\u000f\u0010Z\u001a\u00020\bH\u0002¢\u0006\u0004\bZ\u0010\u0005J\u000f\u0010[\u001a\u00020\bH\u0002¢\u0006\u0004\b[\u0010\u0005J\u000f\u0010\\\u001a\u00020\bH\u0002¢\u0006\u0004\b\\\u0010\u0005J\u000f\u0010]\u001a\u00020\bH\u0002¢\u0006\u0004\b]\u0010\u0005J\u000f\u0010^\u001a\u00020\bH\u0002¢\u0006\u0004\b^\u0010\u0005J\u0017\u0010`\u001a\u00020\b2\u0006\u0010/\u001a\u00020_H\u0002¢\u0006\u0004\b`\u0010aJ\u000f\u0010b\u001a\u00020\bH\u0002¢\u0006\u0004\bb\u0010\u0005R\u0018\u0010d\u001a\u0004\u0018\u00010c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bd\u0010eR\u0018\u0010g\u001a\u0004\u0018\u00010f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bg\u0010hR\u0018\u0010j\u001a\u0004\u0018\u00010i8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bj\u0010kR\u0018\u0010m\u001a\u0004\u0018\u00010l8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bm\u0010nR*\u0010q\u001a\u0016\u0012\u0004\u0012\u00020.\u0012\u0004\u0012\u00020\b\u0018\u00010oj\u0004\u0018\u0001`p8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bq\u0010rR\u0018\u0010t\u001a\u0004\u0018\u00010s8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bt\u0010uR\u0018\u0010w\u001a\u0004\u0018\u00010v8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bw\u0010xR\u0018\u0010z\u001a\u0004\u0018\u00010y8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bz\u0010{R\u0016\u0010|\u001a\u00020,8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b|\u0010}R\u0019\u0010\u007f\u001a\u0004\u0018\u00010~8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u007f\u0010\u0080\u0001R#\u0010\u0083\u0001\u001a\f\u0018\u00010\u0081\u0001j\u0005\u0018\u0001`\u0082\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0083\u0001\u0010\u0084\u0001R\u001c\u0010\u0086\u0001\u001a\u0005\u0018\u00010\u0085\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0086\u0001\u0010\u0087\u0001R\u001f\u0010\u008a\u0001\u001a\n\u0012\u0005\u0012\u00030\u0089\u00010\u0088\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u008a\u0001\u0010\u008b\u0001R\u0017\u0010\u008e\u0001\u001a\u00020f8BX\u0082\u0004¢\u0006\b\u001a\u0006\b\u008c\u0001\u0010\u008d\u0001¨\u0006\u0090\u0001"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/aviaSearchResult/legacy/fragment/AviaSearchResultFragment;", "Landroidx/fragment/app/m;", "Lru/ozon/app/android/composer/universalscreen/view/ComposerFragment$Host;", "Lru/ozon/uni/atoms/af/pool/CacheHolder;", "<init>", "()V", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "view", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "", "requestCode", "resultCode", "Landroid/content/Intent;", "data", "onActivityResult", "(IILandroid/content/Intent;)V", "onDestroyView", "onDestroy", "fragment", "Lru/ozon/app/android/composer/ComposerFragmentController;", "composer", "onComposerCreated", "(Landroidx/fragment/app/m;Lru/ozon/app/android/composer/ComposerFragmentController;)V", "Lru/ozon/uni/atoms/af/pool/RecycledAtomPool;", "getRecycledAtomPool", "()Lru/ozon/uni/atoms/af/pool/RecycledAtomPool;", "Lfk0/c;", "Lru/ozon/app/android/uikit/pool/ViewPool;", "getViewPool", "()Lfk0/c;", "getCacheHolder", "()Lru/ozon/uni/atoms/af/pool/CacheHolder;", "", "isBonusPay", "Lru/ozon/uni/atoms/af/AtomAction;", "action", "LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "event", "changeBonusStateAndTrackAnalytics", "(ZLru/ozon/uni/atoms/af/AtomAction;LWZ/t;)V", "processViewEvent", "(LWZ/t;)V", "", "itemId", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "trackingInfo", "", "totalPrice", "selectLuggageAndTrackAnalytics", "(JLru/ozon/uni/atoms/data/AtomActionDTO;LWZ/t;Ljava/lang/String;)V", "LWZ/e;", "Lru/ozon/app/android/analytics/modules/tokenized/CustomParamsModifier;", "getCustomParamsModifier", "(Ljava/lang/String;)LWZ/e;", "onImageBannerClicked", "(Lru/ozon/uni/atoms/af/AtomAction;)V", "position", "processBannerClick", "(Lru/ozon/uni/atoms/af/AtomAction;I)V", "setUpStateView", "setUpRecyclerView", "observeLiveData", "addChildComposerFragment", "removeComposerRootViewMinHeight", "(Landroidx/fragment/app/m;)V", "observeComposerState", "(Lru/ozon/app/android/composer/ComposerFragmentController;)V", "Lru/ozon/app/android/travel/molecules/view/errorState/ErrorStateVO;", "error", "showError", "(Lru/ozon/app/android/travel/molecules/view/errorState/ErrorStateVO;)V", "handleAction", "showFlashBarError", "timeLimit", "startTimer", "(J)V", "stopTimer", "releaseComposerRelatedObjects", "removeOnScrollListener", "saveLayoutManagerState", "restoreLayoutManagerState", "removeUpdateVoObserver", "Lru/ozon/app/android/travel/feature/avia/widgets/aviaSearchResult/legacy/viewModel/AviaSearchResultViewModel$TrackingData;", "trackUpdateAnalytics", "(Lru/ozon/app/android/travel/feature/avia/widgets/aviaSearchResult/legacy/viewModel/AviaSearchResultViewModel$TrackingData;)V", "setUpScrollListener", "Lru/ozon/app/android/travel/feature/avia/widgets/aviaSearchResult/legacy/viewModel/AviaSearchResultViewModel;", "viewModel", "Lru/ozon/app/android/travel/feature/avia/widgets/aviaSearchResult/legacy/viewModel/AviaSearchResultViewModel;", "Lru/ozon/app/android/travel/feature/avia/databinding/FragmentAviaSearchResultBinding;", "_binding", "Lru/ozon/app/android/travel/feature/avia/databinding/FragmentAviaSearchResultBinding;", "Lru/ozon/app/android/travel/feature/avia/widgets/aviaSearchResult/legacy/pool/AviaSearchResultViewPool;", "searchResultPool", "Lru/ozon/app/android/travel/feature/avia/widgets/aviaSearchResult/legacy/pool/AviaSearchResultViewPool;", "Lru/ozon/app/android/composer/ComposerReferences;", "references", "Lru/ozon/app/android/composer/ComposerReferences;", "Lkotlin/Function1;", "Lru/ozon/app/android/action/BuildedActionHandler;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "Lru/ozon/app/android/travel/feature/avia/widgets/aviaSearchResult/legacy/presentation/adapter/AviaSearchResultAdapter;", "searchResultAdapter", "Lru/ozon/app/android/travel/feature/avia/widgets/aviaSearchResult/legacy/presentation/adapter/AviaSearchResultAdapter;", "Lru/ozon/app/android/travel/utils/utils/TimerHelper;", "timerHelper", "Lru/ozon/app/android/travel/utils/utils/TimerHelper;", "Landroid/os/Parcelable;", "layoutManagerState", "Landroid/os/Parcelable;", "isComposerRecreated", "Z", "Lru/ozon/app/android/travel/feature/avia/widgets/aviaSearchResult/legacy/presentation/adapter/AviaSearchResultDecoration;", "aviaSearchResultDecoration", "Lru/ozon/app/android/travel/feature/avia/widgets/aviaSearchResult/legacy/presentation/adapter/AviaSearchResultDecoration;", "LWZ/l;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedAnalytics;", "tokenizedAnalytics", "LWZ/l;", "Landroidx/recyclerview/widget/RecyclerView$t;", "scrollListener", "Landroidx/recyclerview/widget/RecyclerView$t;", "Landroidx/lifecycle/W;", "Lru/ozon/app/android/travel/feature/avia/widgets/aviaSearchResult/legacy/viewModel/AviaSearchResultViewModel$UpdateVoResult;", "updateVoObserver", "Landroidx/lifecycle/W;", "getBinding", "()Lru/ozon/app/android/travel/feature/avia/databinding/FragmentAviaSearchResultBinding;", "binding", "Companion", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class AviaSearchResultFragment extends ComponentCallbacksC5392m implements ComposerFragment.Host, CacheHolder {
    private FragmentAviaSearchResultBinding _binding;
    private Function1<? super AtomAction, Unit> actionHandler;
    private AviaSearchResultDecoration aviaSearchResultDecoration;
    private boolean isComposerRecreated;
    private Parcelable layoutManagerState;
    private ComposerReferences references;
    private RecyclerView.t scrollListener;
    private AviaSearchResultAdapter searchResultAdapter;
    private AviaSearchResultViewPool searchResultPool;
    private TimerHelper timerHelper;
    private l tokenizedAnalytics;

    @NotNull
    private final W<AviaSearchResultViewModel.UpdateVoResult> updateVoObserver = new a(this, 0);
    private AviaSearchResultViewModel viewModel;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/aviaSearchResult/legacy/fragment/AviaSearchResultFragment$Companion;", "", "<init>", "()V", "KEY_EXTRA_COMPOSER_SCREEN_CONFIG", "", "TAG_COMPOSER_CHILD_FRAGMENT", "newInstance", "Lru/ozon/app/android/travel/feature/avia/widgets/aviaSearchResult/legacy/fragment/AviaSearchResultFragment;", "screenConfig", "Lru/ozon/app/android/composer/universalscreen/view/ComposerScreenConfig;", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final AviaSearchResultFragment newInstance(@NotNull ComposerScreenConfig screenConfig) {
            Intrinsics.checkNotNullParameter(screenConfig, "screenConfig");
            AviaSearchResultFragment aviaSearchResultFragment = new AviaSearchResultFragment();
            aviaSearchResultFragment.setArguments(d.b(new Pair("travel.KeyExtraComposerScreenConfig", screenConfig)));
            return aviaSearchResultFragment;
        }

        private Companion() {
        }
    }

    private final void addChildComposerFragment(Bundle savedInstanceState) {
        Bundle arguments;
        ComposerScreenConfig composerScreenConfig;
        if (savedInstanceState != null || (arguments = getArguments()) == null || (composerScreenConfig = (ComposerScreenConfig) arguments.getParcelable("travel.KeyExtraComposerScreenConfig")) == null) {
            return;
        }
        ComposerFragment newInstance$default = ComposerFragment.Companion.newInstance$default(ComposerFragment.INSTANCE, composerScreenConfig, ComposerFragment.DisplayMode.BOTTOM_SHEET_WRAP, null, 4, null);
        Q p11 = getChildFragmentManager().p();
        p11.b(R$id.aviaSearchResultComposerFragmentContainer, newInstance$default, "travel.TagComposerChildFragment");
        p11.k();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void changeBonusStateAndTrackAnalytics(boolean isBonusPay, AtomAction action, t event) {
        l lVar;
        if (event != null && (lVar = this.tokenizedAnalytics) != null) {
            TokenizedAnalyticsExtensionsKt.processClickEvents$default(lVar, event, null, 2, null);
        }
        AviaSearchResultViewModel aviaSearchResultViewModel = this.viewModel;
        if (aviaSearchResultViewModel != null) {
            aviaSearchResultViewModel.changeBonusStateUpdate(isBonusPay, action);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final FragmentAviaSearchResultBinding getBinding() {
        FragmentAviaSearchResultBinding fragmentAviaSearchResultBinding = this._binding;
        Intrinsics.f(fragmentAviaSearchResultBinding);
        return fragmentAviaSearchResultBinding;
    }

    private final CacheHolder getCacheHolder() {
        InterfaceC5431s g02 = getChildFragmentManager().g0("travel.TagComposerChildFragment");
        if (g02 instanceof CacheHolder) {
            return (CacheHolder) g02;
        }
        return null;
    }

    private final e getCustomParamsModifier(final String totalPrice) {
        return new e() { // from class: BM.b
            @Override // WZ.e
            public final g modifyParams(UZ.a aVar, g gVar) {
                g customParamsModifier$lambda$10;
                customParamsModifier$lambda$10 = AviaSearchResultFragment.getCustomParamsModifier$lambda$10(totalPrice, (UZ.d) aVar, gVar);
                return customParamsModifier$lambda$10;
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g getCustomParamsModifier$lambda$10(String str, UZ.a aVar, g params) {
        Intrinsics.checkNotNullParameter(aVar, "<unused var>");
        Intrinsics.checkNotNullParameter(params, "params");
        LinkedHashMap a11 = h.a(params.b());
        a11.put("status", String.valueOf(str));
        return g.a(params, a11, null, 2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleAction(AtomAction action) {
        InterfaceC7851b controller;
        if (!(action instanceof AtomAction.Refresh)) {
            Function1<? super AtomAction, Unit> function1 = this.actionHandler;
            if (function1 != null) {
                function1.invoke(action);
                return;
            }
            return;
        }
        ComposerReferences composerReferences = this.references;
        if (composerReferences == null || (controller = composerReferences.getController()) == null) {
            return;
        }
        InterfaceC7851b.a.e(controller, ((AtomAction.Refresh) action).getLink(), null, null, 6);
    }

    private final void observeComposerState(ComposerFragmentController composer) {
        InterfaceC7238a<ru.ozon.composer.ui.widget.l> composerStore = composer.getComposerStore();
        C2408n0 c2408n0 = new C2408n0(C5427n.a(composerStore.getState(), getViewLifecycleOwner().getLifecycle(), AbstractC5434v.b.STARTED), new AviaSearchResultFragment$observeComposerState$1(this, composerStore, null));
        J viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        C2399j.C(c2408n0, K.a(viewLifecycleOwner));
    }

    private final void observeLiveData() {
        AviaSearchResultViewModel aviaSearchResultViewModel = this.viewModel;
        if (aviaSearchResultViewModel != null) {
            aviaSearchResultViewModel.updateVoLiveData().observeForever(this.updateVoObserver);
            aviaSearchResultViewModel.resultLiveData().observe(getViewLifecycleOwner(), new AviaSearchResultFragmentKt$sam$androidx_lifecycle_Observer$0(new AviaSearchResultFragment$observeLiveData$1$1(this)));
            aviaSearchResultViewModel.errorLiveData().observe(getViewLifecycleOwner(), new AviaSearchResultFragmentKt$sam$androidx_lifecycle_Observer$0(new AviaSearchResultFragment$observeLiveData$1$2(this)));
            aviaSearchResultViewModel.itemUpdateLiveData().observe(getViewLifecycleOwner(), new AviaSearchResultFragmentKt$sam$androidx_lifecycle_Observer$0(new AviaSearchResultFragment$observeLiveData$1$3(this)));
            aviaSearchResultViewModel.quickFiltersSkeletonLiveData().observe(getViewLifecycleOwner(), new AviaSearchResultFragmentKt$sam$androidx_lifecycle_Observer$0(new AviaSearchResultFragment$observeLiveData$1$4(this)));
            aviaSearchResultViewModel.progressBarLiveData().observe(getViewLifecycleOwner(), new AviaSearchResultFragmentKt$sam$androidx_lifecycle_Observer$0(new AviaSearchResultFragment$observeLiveData$1$5(this, aviaSearchResultViewModel)));
            aviaSearchResultViewModel.skeletonLiveData().observe(getViewLifecycleOwner(), new AviaSearchResultFragmentKt$sam$androidx_lifecycle_Observer$0(new AviaSearchResultFragment$observeLiveData$1$6(this)));
            aviaSearchResultViewModel.contentVisibilityLiveData().observe(getViewLifecycleOwner(), new AviaSearchResultFragmentKt$sam$androidx_lifecycle_Observer$0(new AviaSearchResultFragment$observeLiveData$1$7(this)));
            aviaSearchResultViewModel.timerLiveData().observe(getViewLifecycleOwner(), new AviaSearchResultFragmentKt$sam$androidx_lifecycle_Observer$0(new AviaSearchResultFragment$observeLiveData$1$8(this)));
            aviaSearchResultViewModel.actionSuccessLiveData().observe(getViewLifecycleOwner(), new AviaSearchResultFragmentKt$sam$androidx_lifecycle_Observer$0(new AviaSearchResultFragment$observeLiveData$1$9(this)));
            aviaSearchResultViewModel.actionErrorLiveData().observe(getViewLifecycleOwner(), new AviaSearchResultFragmentKt$sam$androidx_lifecycle_Observer$0(new AviaSearchResultFragment$observeLiveData$1$10(this)));
            aviaSearchResultViewModel.preloaderTitleLiveData().observe(getViewLifecycleOwner(), new AviaSearchResultFragmentKt$sam$androidx_lifecycle_Observer$0(new AviaSearchResultFragment$observeLiveData$1$11(getBinding().aviaSearchResultProgressBarView)));
            aviaSearchResultViewModel.preloaderProgressLiveData().observe(getViewLifecycleOwner(), new AviaSearchResultFragmentKt$sam$androidx_lifecycle_Observer$0(new AviaSearchResultFragment$observeLiveData$1$12(getBinding().aviaSearchResultProgressBarView)));
            aviaSearchResultViewModel.trackingLiveData().observe(getViewLifecycleOwner(), new AviaSearchResultFragmentKt$sam$androidx_lifecycle_Observer$0(new AviaSearchResultFragment$observeLiveData$1$13(this)));
            aviaSearchResultViewModel.toggleActionLiveData().observe(getViewLifecycleOwner(), new AviaSearchResultFragmentKt$sam$androidx_lifecycle_Observer$0(new AviaSearchResultFragment$observeLiveData$1$14(this)));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onImageBannerClicked(AtomAction action) {
        Function1<? super AtomAction, Unit> function1 = this.actionHandler;
        if (function1 != null) {
            function1.invoke(action);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void processBannerClick(AtomAction action, int position) {
        if (action instanceof AtomAction.ComposerAction) {
            AviaSearchResultViewModel aviaSearchResultViewModel = this.viewModel;
            if (aviaSearchResultViewModel != null) {
                aviaSearchResultViewModel.onBannerClicked((AtomAction.ComposerAction) action, position);
                return;
            }
            return;
        }
        Function1<? super AtomAction, Unit> function1 = this.actionHandler;
        if (function1 != null) {
            function1.invoke(action);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void processViewEvent(t event) {
        l lVar;
        if (event == null || (lVar = this.tokenizedAnalytics) == null) {
            return;
        }
        TokenizedAnalyticsExtensionsKt.processViewEvents$default(lVar, event, null, 2, null);
    }

    private final void releaseComposerRelatedObjects() {
        this.references = null;
        this.actionHandler = null;
        this.searchResultAdapter = null;
    }

    private final void removeComposerRootViewMinHeight(ComponentCallbacksC5392m fragment) {
        ViewGroup composerContainer;
        View view = fragment.getView();
        if (view == null || (composerContainer = ComposerViewExtensionKt.composerContainer(view)) == null) {
            return;
        }
        composerContainer.setMinimumHeight(0);
    }

    private final void removeOnScrollListener() {
        RecyclerView.t tVar = this.scrollListener;
        if (tVar != null) {
            getBinding().aviaSearchResultRecyclerView.removeOnScrollListener(tVar);
        }
    }

    private final void removeUpdateVoObserver() {
        P<AviaSearchResultViewModel.UpdateVoResult> updateVoLiveData;
        AviaSearchResultViewModel aviaSearchResultViewModel = this.viewModel;
        if (aviaSearchResultViewModel == null || (updateVoLiveData = aviaSearchResultViewModel.updateVoLiveData()) == null) {
            return;
        }
        updateVoLiveData.removeObserver(this.updateVoObserver);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void restoreLayoutManagerState() {
        if (this.layoutManagerState != null) {
            RecyclerView.o layoutManager = getBinding().aviaSearchResultRecyclerView.getLayoutManager();
            if (layoutManager != null) {
                layoutManager.onRestoreInstanceState(this.layoutManagerState);
            }
            this.layoutManagerState = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void saveLayoutManagerState() {
        RecyclerView.o layoutManager = getBinding().aviaSearchResultRecyclerView.getLayoutManager();
        this.layoutManagerState = layoutManager != null ? layoutManager.onSaveInstanceState() : null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void selectLuggageAndTrackAnalytics(long itemId, AtomActionDTO action, t trackingInfo, String totalPrice) {
        l lVar;
        if (trackingInfo != null && (lVar = this.tokenizedAnalytics) != null) {
            TokenizedAnalyticsExtensionsKt.processClickEvents(lVar, trackingInfo, getCustomParamsModifier(totalPrice));
        }
        AviaSearchResultViewModel aviaSearchResultViewModel = this.viewModel;
        if (aviaSearchResultViewModel != null) {
            aviaSearchResultViewModel.selectLuggage(action, itemId);
        }
    }

    private final void setUpRecyclerView() {
        RecyclerView recyclerView = getBinding().aviaSearchResultRecyclerView;
        Context context = recyclerView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        this.aviaSearchResultDecoration = new AviaSearchResultDecoration(context);
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext()));
        recyclerView.setAdapter(this.searchResultAdapter);
        int itemDecorationCount = recyclerView.getItemDecorationCount();
        for (int i11 = 0; i11 < itemDecorationCount; i11++) {
            recyclerView.removeItemDecorationAt(i11);
        }
        AviaSearchResultDecoration aviaSearchResultDecoration = this.aviaSearchResultDecoration;
        if (aviaSearchResultDecoration != null) {
            recyclerView.addItemDecoration(aviaSearchResultDecoration);
        }
        removeOnScrollListener();
        setUpScrollListener();
        RecyclerView.t tVar = this.scrollListener;
        if (tVar != null) {
            recyclerView.addOnScrollListener(tVar);
        }
    }

    private final void setUpScrollListener() {
        this.scrollListener = new RecyclerView.t() { // from class: ru.ozon.app.android.travel.feature.avia.widgets.aviaSearchResult.legacy.fragment.AviaSearchResultFragment$setUpScrollListener$1
            @Override // androidx.recyclerview.widget.RecyclerView.t
            public void onScrolled(RecyclerView recyclerView, int dx, int dy) {
                AviaSearchResultViewModel aviaSearchResultViewModel;
                AviaSearchResultViewModel aviaSearchResultViewModel2;
                l lVar;
                Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
                if (dy > 0) {
                    RecyclerView.o layoutManager = recyclerView.getLayoutManager();
                    LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
                    if (linearLayoutManager == null) {
                        return;
                    }
                    int findFirstVisibleItemPosition = linearLayoutManager.findFirstVisibleItemPosition();
                    int findLastVisibleItemPosition = linearLayoutManager.findLastVisibleItemPosition();
                    aviaSearchResultViewModel = AviaSearchResultFragment.this.viewModel;
                    List<t> eventsByRange = aviaSearchResultViewModel != null ? aviaSearchResultViewModel.getEventsByRange(findFirstVisibleItemPosition, findLastVisibleItemPosition) : null;
                    if (eventsByRange != null) {
                        AviaSearchResultFragment aviaSearchResultFragment = AviaSearchResultFragment.this;
                        for (t tVar : eventsByRange) {
                            lVar = aviaSearchResultFragment.tokenizedAnalytics;
                            if (lVar != null) {
                                TokenizedAnalyticsExtensionsKt.processViewEvents$default(lVar, tVar, null, 2, null);
                            }
                        }
                    }
                    aviaSearchResultViewModel2 = AviaSearchResultFragment.this.viewModel;
                    if (aviaSearchResultViewModel2 != null) {
                        aviaSearchResultViewModel2.loadNextPage(findLastVisibleItemPosition);
                    }
                }
            }
        };
    }

    private final void setUpStateView() {
        getBinding().aviaSearchResultScreenStateView.setListener(new AviaSearchResultFragment$setUpStateView$1(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showError(ErrorStateVO error) {
        ErrorStateView errorStateView = getBinding().aviaSearchResultErrorStateView;
        Intrinsics.f(errorStateView);
        errorStateView.setVisibility(error != null ? 0 : 8);
        if (error != null) {
            errorStateView.bind(error, this.actionHandler);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showFlashBarError() {
        ViewGroup rootView = ContextExtKt.getRootView(this);
        if (rootView != null) {
            FlashbarFactory flashbarFactory = FlashbarFactory.INSTANCE;
            J viewLifecycleOwner = getViewLifecycleOwner();
            Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
            FlashbarFactory.createDefaultError$default(flashbarFactory, rootView, null, null, null, null, null, viewLifecycleOwner, 62, null).show();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void startTimer(long timeLimit) {
        TimerHelper timerHelper = this.timerHelper;
        if (timerHelper != null) {
            timerHelper.stopTimer();
        }
        TimerHelper timerHelper2 = new TimerHelper(getViewLifecycleOwner().getLifecycle());
        this.timerHelper = timerHelper2;
        AviaSearchResultViewModel aviaSearchResultViewModel = this.viewModel;
        if (aviaSearchResultViewModel != null) {
            TimerHelper.startTimer$default(timerHelper2, Long.valueOf(timeLimit), new AviaSearchResultFragment$startTimer$1$1(aviaSearchResultViewModel), (Function1) null, 4, (Object) null);
        }
    }

    private final void stopTimer() {
        TimerHelper timerHelper = this.timerHelper;
        if (timerHelper != null) {
            timerHelper.stopTimer();
        }
        this.timerHelper = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void trackUpdateAnalytics(AviaSearchResultViewModel.TrackingData action) {
        l lVar;
        l lVar2;
        Map<String, String> trackingPayloads = action.getTrackingPayloads();
        if (trackingPayloads != null && (lVar2 = this.tokenizedAnalytics) != null) {
            lVar2.e(trackingPayloads);
        }
        t trackingInfo = action.getTrackingInfo();
        if (trackingInfo == null || (lVar = this.tokenizedAnalytics) == null) {
            return;
        }
        TokenizedAnalyticsExtensionsKt.processComposerEvents$default(lVar, trackingInfo, null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void updateVoObserver$lambda$0(AviaSearchResultFragment aviaSearchResultFragment, AviaSearchResultViewModel.UpdateVoResult result) {
        ComposerReferences composerReferences;
        InterfaceC7851b controller;
        InterfaceC7851b controller2;
        Intrinsics.checkNotNullParameter(result, "result");
        ComposerReferences composerReferences2 = aviaSearchResultFragment.references;
        if (composerReferences2 != null && (controller2 = composerReferences2.getController()) != null) {
            controller2.update(result.getVo());
        }
        if (!result.getShouldRefresh() || (composerReferences = aviaSearchResultFragment.references) == null || (controller = composerReferences.getController()) == null) {
            return;
        }
        InterfaceC7851b.a.e(controller, null, null, null, 7);
    }

    @Override // ru.ozon.uni.atoms.af.pool.CacheHolder
    /* renamed from: getRecycledAtomPool */
    public RecycledAtomPool getAtomPool() {
        CacheHolder cacheHolder = getCacheHolder();
        if (cacheHolder != null) {
            return cacheHolder.getAtomPool();
        }
        return null;
    }

    @Override // fk0.d
    /* renamed from: getViewPool */
    public c getPrefetchViewPool() {
        CacheHolder cacheHolder = getCacheHolder();
        if (cacheHolder != null) {
            return cacheHolder.getPrefetchViewPool();
        }
        return null;
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        ComponentCallbacksC5392m g02 = getChildFragmentManager().g0("travel.TagComposerChildFragment");
        if (g02 != null) {
            g02.onActivityResult(requestCode, resultCode, data);
        }
    }

    @Override // ru.ozon.app.android.composer.universalscreen.view.ComposerFragment.Host
    public void onComposerCreated(@NotNull ComponentCallbacksC5392m componentCallbacksC5392m, @NotNull ComposerFragmentController composerFragmentController, i iVar) {
        ComposerFragment.Host.DefaultImpls.onComposerCreated(this, componentCallbacksC5392m, composerFragmentController, iVar);
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        addChildComposerFragment(savedInstanceState);
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    @NotNull
    public View onCreateView(@NotNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        this._binding = FragmentAviaSearchResultBinding.inflate(inflater, container, false);
        ConstraintLayout constraintLayout = getBinding().getConstraintLayout();
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "getRoot(...)");
        return constraintLayout;
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    public void onDestroy() {
        removeUpdateVoObserver();
        stopTimer();
        super.onDestroy();
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    public void onDestroyView() {
        releaseComposerRelatedObjects();
        removeOnScrollListener();
        super.onDestroyView();
        this._binding = null;
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    public void onViewCreated(@NotNull View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        setUpStateView();
    }

    @Override // ru.ozon.app.android.composer.universalscreen.view.ComposerFragment.Host
    public void onComposerCreated(@NotNull ComponentCallbacksC5392m fragment, @NotNull ComposerFragmentController composer) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        Intrinsics.checkNotNullParameter(composer, "composer");
        removeComposerRootViewMinHeight(fragment);
        this.isComposerRecreated = true;
        ComposerReferences references = composer.getReferences();
        final AviaSearchResultComponent aviaSearchResultComponent = (AviaSearchResultComponent) references.getWidgetComponent(AviaSearchResultComponent.class);
        this.tokenizedAnalytics = aviaSearchResultComponent.getTokenizedAnalytics();
        AviaSearchResultViewModel aviaSearchResultViewModel = (AviaSearchResultViewModel) new z0(references.getViewModelOwnerProvider().a(), new z0.c() { // from class: ru.ozon.app.android.travel.feature.avia.widgets.aviaSearchResult.legacy.fragment.AviaSearchResultFragment$onComposerCreated$lambda$4$$inlined$viewModel$1
            @Override // androidx.lifecycle.z0.c, androidx.lifecycle.z0.b
            public <T extends w0> T create(Class<T> modelClass) {
                Intrinsics.checkNotNullParameter(modelClass, "modelClass");
                AviaSearchResultViewModel aviaSearchResultViewModel2 = AviaSearchResultComponent.this.getAviaSearchResultViewModel().get();
                Intrinsics.g(aviaSearchResultViewModel2, "null cannot be cast to non-null type T of ru.ozon.app.android.utils.lifecycle.ViewModelExtKt.vmFactory.<no name provided>.create");
                return aviaSearchResultViewModel2;
            }
        }).a(AviaSearchResultViewModel.class);
        this.viewModel = aviaSearchResultViewModel;
        AviaSearchResultViewPool aviaSearchResultViewPool = aviaSearchResultComponent.getAviaSearchResultViewPool();
        this.searchResultPool = aviaSearchResultViewPool;
        if (aviaSearchResultViewPool != null) {
            Context requireContext = requireContext();
            Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
            aviaSearchResultViewPool.setContext(requireContext);
        }
        AviaSearchResultViewPool aviaSearchResultViewPool2 = this.searchResultPool;
        if (aviaSearchResultViewPool2 != null) {
            aviaSearchResultViewPool2.setLifecycleOwner(this);
        }
        observeLiveData();
        this.references = references;
        Function1<AtomAction, Unit> buildHandler = new ActionHandler.Builder(composer.getReferences(), composer.getComposerOverlayItemsHelper(), AviaSearchResultVO.class).onPreProcess(new AviaSearchResultFragment$onComposerCreated$2(this)).onComposerAction(new AviaSearchResultFragment$onComposerCreated$3(this)).onClick(new AviaSearchResultFragment$onComposerCreated$4(this)).buildHandler();
        AviaSearchResultFragment$onComposerCreated$5$1 aviaSearchResultFragment$onComposerCreated$5$1 = new AviaSearchResultFragment$onComposerCreated$5$1(this);
        AviaSearchResultFragment$onComposerCreated$5$2 aviaSearchResultFragment$onComposerCreated$5$2 = new AviaSearchResultFragment$onComposerCreated$5$2(aviaSearchResultViewModel);
        RecyclerView.u viewPool = composer.getReferences().getComposerViewPoolProvider().getViewPool();
        AviaSearchResultFragment$onComposerCreated$5$3 aviaSearchResultFragment$onComposerCreated$5$3 = new AviaSearchResultFragment$onComposerCreated$5$3(this);
        this.searchResultAdapter = new AviaSearchResultAdapter(buildHandler, new AviaSearchResultFragment$onComposerCreated$5$6(this), aviaSearchResultViewPool, aviaSearchResultFragment$onComposerCreated$5$1, viewPool, new AviaSearchResultFragment$onComposerCreated$5$4(this), aviaSearchResultFragment$onComposerCreated$5$2, aviaSearchResultFragment$onComposerCreated$5$3, new AviaSearchResultFragment$onComposerCreated$5$5(this));
        this.actionHandler = buildHandler;
        setUpRecyclerView();
        observeComposerState(composer);
    }
}
