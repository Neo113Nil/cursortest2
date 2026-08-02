package ru.ozon.app.android.search.dialogsearchscreen.withTopFilters;

import A00.a;
import Ae.C2399j;
import Ae.C2408n0;
import Ae.InterfaceC2395h;
import Ae.M0;
import B90.V;
import Cw.ViewOnClickListenerC2787a;
import GZ.j;
import Sc.InterfaceC3999a;
import Sg.a;
import Vg.d;
import WZ.t;
import a00.C4908c;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.Editable;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.activity.C;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.fragment.app.ComponentCallbacksC5392m;
import androidx.fragment.app.FragmentContainerView;
import androidx.fragment.app.Q;
import androidx.fragment.app.r;
import androidx.lifecycle.AbstractC5434v;
import androidx.lifecycle.C5427n;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.InterfaceC5431s;
import androidx.lifecycle.J;
import androidx.lifecycle.K;
import androidx.lifecycle.w0;
import androidx.lifecycle.z0;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import b20.C5521a;
import com.google.android.flexbox.FlexboxLayoutManager;
import com.google.android.material.appbar.AppBarLayout;
import eI.e;
import ei0.InterfaceC6369b;
import gi.C6739a;
import gi.C6740b;
import hi.InterfaceC6958a;
import i10.C6997c;
import i10.h;
import i10.k;
import j10.InterfaceC7238a;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import l10.InterfaceC7851b;
import l10.i;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.action.custom.di.CustomActionHandlersComponentApi;
import ru.ozon.app.android.analytics.di.AnalyticsComponentApi;
import ru.ozon.app.android.analytics.extensions.AnalyticsExtensionsKt;
import ru.ozon.app.android.analytics.modules.tokenized.TokenizedAnalyticsExtensionsKt;
import ru.ozon.app.android.analytics.screen.storage.di.AnalyticsScreenStorageComponentApi;
import ru.ozon.app.android.common.SearchUrlPrefetchService;
import ru.ozon.app.android.common.filterWidgets.filters.presentation.category.FilterSharedViewModel;
import ru.ozon.app.android.composer.ComposerFragmentController;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.navigations.destinations.ComposerFragmentDestination;
import ru.ozon.app.android.composer.navigations.destinations.ComposerScreenContainer;
import ru.ozon.app.android.composer.universalscreen.view.ComposerFragment;
import ru.ozon.app.android.composer.universalscreen.view.ComposerScreenConfig;
import ru.ozon.app.android.composer.view.ComposerViewExtensionKt;
import ru.ozon.app.android.domain.flags.RedesignedSearchBarEnabled;
import ru.ozon.app.android.navigation.di.NavigationComponentApi;
import ru.ozon.app.android.network.abtool.FeatureChecker;
import ru.ozon.app.android.search.R$id;
import ru.ozon.app.android.search.databinding.FragmentDialogSearchCoordinatorBinding;
import ru.ozon.app.android.search.dialogsearchscreen.DialogSearchViewModel;
import ru.ozon.app.android.search.dialogsearchscreen.searchbar.common.PageRefreshState;
import ru.ozon.app.android.search.dialogsearchscreen.searchbar.filter.DialogFilterTagsAdapter;
import ru.ozon.app.android.search.dialogsearchscreen.searchbar.tapTags.DialogTapTagsAdapter;
import ru.ozon.app.android.search.dialogsearchscreen.searchbar.view.DialogSearchBarView;
import ru.ozon.app.android.search.dialogsearchscreen.utils.AppBarLayoutExtKt;
import ru.ozon.app.android.search.dialogsearchscreen.utils.RecyclerViewAnimationExtKt;
import ru.ozon.app.android.search.dialogsearchscreen.withTopFilters.DialogSearchTopFiltersFragment;
import ru.ozon.app.android.search.flags.KeepSuggestionsEnabledFlag;
import ru.ozon.app.android.search.views.searchShimmer.SearchShimmer;
import ru.ozon.app.android.search.widgets.commonTapTags.DialogSearchClearHistory;
import ru.ozon.app.android.search.widgets.commonTapTags.DialogSearchHistoryTapTagClickKey;
import ru.ozon.app.android.search.widgets.dialogSearchBar.data.DialogSearchBarDTO;
import ru.ozon.app.android.search.widgets.dialogSearchBar.data.api.ActionType;
import ru.ozon.app.android.search.widgets.dialogSearchBar.di.DialogSearchBarComponent;
import ru.ozon.app.android.search.widgets.dialogSearchBar.presentation.DialogSearchBarVO;
import ru.ozon.app.android.search.widgets.searchbar.presentation.searchBar.ClearSearchTextViewModel;
import ru.ozon.app.android.search.widgets.searchbar.shimmer.SearchSkeleton;
import ru.ozon.app.android.uikit.utils.DelayedVisibilityHandler;
import ru.ozon.app.android.utils.KeyboardUtils;
import ru.ozon.app.android.utils.KeyboardUtilsKt;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.composer.ui.widget.l;
import ru.ozon.tracker.model.EventEntity;
import ru.ozon.tracker.sendEvent.ActionType;
import ru.ozon.uni.R$color;
import ru.ozon.uni.android.controls.buttonV3.IconButtonV3View;
import ru.ozon.uni.android.uikit.common.SimpleTextWatcher;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.af.pool.CacheHolder;
import ru.ozon.uni.atoms.af.pool.RecycledAtomPool;
import ru.ozon.uni.atoms.data.common.Paddings;
import ru.ozon.uni.atoms.data.controls.button.IconButtonV3DTO;
import ru.ozon.uni.atoms.data.controls.tag.TagButtonDTO;
import ru.ozon.uni.atoms.data.indicator.IndicatorDTO;
import xe.B0;

@Metadata(d1 = {"\u0000\u0088\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007*\u0006þ\u0001\u0081\u0002\u0087\u0002\b\u0001\u0018\u0000 \u0090\u00022\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0002\u0090\u0002B\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0019\u0010\u000e\u001a\u00020\t2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0017¢\u0006\u0004\b\u000e\u0010\u000fJ+\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0011\u001a\u00020\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\u00122\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0017¢\u0006\u0004\b\u0015\u0010\u0016J!\u0010\u0018\u001a\u00020\t2\u0006\u0010\u0017\u001a\u00020\u00142\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0017¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\tH\u0017¢\u0006\u0004\b\u001a\u0010\u0006J)\u0010 \u001a\u00020\t2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u001b2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eH\u0016¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\tH\u0017¢\u0006\u0004\b\"\u0010\u0006J\u000f\u0010#\u001a\u00020\tH\u0016¢\u0006\u0004\b#\u0010\u0006J\u0011\u0010%\u001a\u0004\u0018\u00010$H\u0016¢\u0006\u0004\b%\u0010&J\u0017\u0010)\u001a\n\u0018\u00010'j\u0004\u0018\u0001`(H\u0016¢\u0006\u0004\b)\u0010*J)\u00100\u001a\u00020\t2\u0006\u0010+\u001a\u00020\u00012\u0006\u0010-\u001a\u00020,2\b\u0010/\u001a\u0004\u0018\u00010.H\u0016¢\u0006\u0004\b0\u00101J+\u00107\u001a\u0002062\b\u0010\u0017\u001a\u0004\u0018\u0001022\u0006\u00103\u001a\u00020\u001b2\b\u00105\u001a\u0004\u0018\u000104H\u0016¢\u0006\u0004\b7\u00108J\u000f\u00109\u001a\u00020\tH\u0002¢\u0006\u0004\b9\u0010\u0006J\u0017\u0010;\u001a\u00020\t2\u0006\u0010:\u001a\u00020\u001bH\u0002¢\u0006\u0004\b;\u0010<J\u001f\u0010@\u001a\u00020\t2\u000e\u0010?\u001a\n\u0018\u00010=j\u0004\u0018\u0001`>H\u0002¢\u0006\u0004\b@\u0010AJ#\u0010B\u001a\u00020\t2\n\u0010?\u001a\u00060=j\u0002`>2\u0006\u0010\u0013\u001a\u00020.H\u0002¢\u0006\u0004\bB\u0010CJ\u0013\u0010E\u001a\u00020\t*\u00020DH\u0002¢\u0006\u0004\bE\u0010FJ\u000f\u0010G\u001a\u00020\tH\u0002¢\u0006\u0004\bG\u0010\u0006J!\u0010K\u001a\u00020\t2\u0006\u0010I\u001a\u00020H2\b\b\u0002\u0010J\u001a\u000206H\u0002¢\u0006\u0004\bK\u0010LJ\u000f\u0010M\u001a\u00020\tH\u0002¢\u0006\u0004\bM\u0010\u0006J\u000f\u0010N\u001a\u00020\tH\u0002¢\u0006\u0004\bN\u0010\u0006J\u000f\u0010O\u001a\u00020\tH\u0002¢\u0006\u0004\bO\u0010\u0006J\u000f\u0010P\u001a\u00020\tH\u0002¢\u0006\u0004\bP\u0010\u0006J\u000f\u0010Q\u001a\u00020\tH\u0002¢\u0006\u0004\bQ\u0010\u0006J\u000f\u0010R\u001a\u00020\tH\u0002¢\u0006\u0004\bR\u0010\u0006J\u0017\u0010T\u001a\u00020\t2\u0006\u0010S\u001a\u000206H\u0002¢\u0006\u0004\bT\u0010UJ\u0017\u0010X\u001a\u00020\t2\u0006\u0010W\u001a\u00020VH\u0002¢\u0006\u0004\bX\u0010YJ\u0019\u0010\\\u001a\u00020\t2\b\u0010[\u001a\u0004\u0018\u00010ZH\u0002¢\u0006\u0004\b\\\u0010]J\u000f\u0010^\u001a\u000206H\u0002¢\u0006\u0004\b^\u0010_J\u0019\u0010b\u001a\u0002062\b\u0010a\u001a\u0004\u0018\u00010`H\u0002¢\u0006\u0004\bb\u0010cJ#\u0010h\u001a\u00020\t2\b\u0010e\u001a\u0004\u0018\u00010d2\b\u0010g\u001a\u0004\u0018\u00010fH\u0002¢\u0006\u0004\bh\u0010iJ\u001f\u0010m\u001a\u00020\t2\u000e\u0010l\u001a\n\u0012\u0004\u0012\u00020k\u0018\u00010jH\u0002¢\u0006\u0004\bm\u0010nJ\u001f\u0010p\u001a\u00020\t2\u000e\u0010l\u001a\n\u0012\u0004\u0012\u00020o\u0018\u00010jH\u0002¢\u0006\u0004\bp\u0010nJ\u0017\u0010r\u001a\u00020\t2\u0006\u0010q\u001a\u00020\u001bH\u0002¢\u0006\u0004\br\u0010<J\u0017\u0010t\u001a\u00020\t2\u0006\u0010s\u001a\u00020`H\u0002¢\u0006\u0004\bt\u0010uJ\u0019\u0010v\u001a\u00020\t2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0002¢\u0006\u0004\bv\u0010\u000fJ\u0017\u0010w\u001a\u00020\t2\u0006\u0010-\u001a\u00020,H\u0002¢\u0006\u0004\bw\u0010xJ\u0017\u0010z\u001a\u00020\t2\u0006\u00105\u001a\u00020yH\u0002¢\u0006\u0004\bz\u0010{J\u000f\u0010|\u001a\u00020\tH\u0002¢\u0006\u0004\b|\u0010\u0006J=\u0010\u0081\u0001\u001a\u00020\t2\u0006\u0010s\u001a\u00020`2\f\u0010~\u001a\b\u0012\u0004\u0012\u00020\t0}2\u0013\u0010\u0080\u0001\u001a\u000e\u0012\u0004\u0012\u00020`\u0012\u0004\u0012\u00020\t0\u007fH\u0002¢\u0006\u0006\b\u0081\u0001\u0010\u0082\u0001J#\u0010\u0084\u0001\u001a\u0004\u0018\u00010V*\r\u0012\b\u0012\u00060=j\u0002`>0\u0083\u0001H\u0002¢\u0006\u0006\b\u0084\u0001\u0010\u0085\u0001J\u0011\u0010\u0086\u0001\u001a\u00020\tH\u0002¢\u0006\u0005\b\u0086\u0001\u0010\u0006J\u0014\u0010\u0087\u0001\u001a\u0004\u0018\u00010\tH\u0002¢\u0006\u0006\b\u0087\u0001\u0010\u0088\u0001J\u001c\u0010\u008a\u0001\u001a\u00020\t2\t\u0010\u0089\u0001\u001a\u0004\u0018\u00010`H\u0002¢\u0006\u0005\b\u008a\u0001\u0010uJ\u001c\u0010\u008b\u0001\u001a\u00020\t2\t\u0010\u0089\u0001\u001a\u0004\u0018\u00010`H\u0002¢\u0006\u0005\b\u008b\u0001\u0010uJ\u0014\u0010\u008c\u0001\u001a\u0004\u0018\u00010\u0003H\u0002¢\u0006\u0006\b\u008c\u0001\u0010\u008d\u0001J\u0011\u0010\u008e\u0001\u001a\u00020\tH\u0002¢\u0006\u0005\b\u008e\u0001\u0010\u0006J\u0011\u0010\u008f\u0001\u001a\u00020\tH\u0002¢\u0006\u0005\b\u008f\u0001\u0010\u0006J\u0011\u0010\u0090\u0001\u001a\u00020\tH\u0002¢\u0006\u0005\b\u0090\u0001\u0010\u0006J\u0011\u0010\u0091\u0001\u001a\u00020\tH\u0002¢\u0006\u0005\b\u0091\u0001\u0010\u0006J\u0011\u0010\u0092\u0001\u001a\u00020\tH\u0002¢\u0006\u0005\b\u0092\u0001\u0010\u0006J\u0015\u0010\u0093\u0001\u001a\u00020\t*\u00020DH\u0002¢\u0006\u0005\b\u0093\u0001\u0010FJ\u0015\u0010\u0094\u0001\u001a\u00020\t*\u00020DH\u0002¢\u0006\u0005\b\u0094\u0001\u0010FJ\u0015\u0010\u0095\u0001\u001a\u00020\t*\u00020DH\u0002¢\u0006\u0005\b\u0095\u0001\u0010FJ\u0011\u0010\u0096\u0001\u001a\u00020\tH\u0002¢\u0006\u0005\b\u0096\u0001\u0010\u0006J\u0017\u0010\u0098\u0001\u001a\u00020\t*\u00030\u0097\u0001H\u0002¢\u0006\u0006\b\u0098\u0001\u0010\u0099\u0001J\u0011\u0010\u009a\u0001\u001a\u00020\tH\u0002¢\u0006\u0005\b\u009a\u0001\u0010\u0006J#\u0010\u009d\u0001\u001a\u00020\t*\u00030\u0097\u00012\n\u0010\u009c\u0001\u001a\u0005\u0018\u00010\u009b\u0001H\u0002¢\u0006\u0006\b\u009d\u0001\u0010\u009e\u0001J\"\u0010\u009f\u0001\u001a\u00020\t*\u00030\u0097\u00012\t\u0010\u0089\u0001\u001a\u0004\u0018\u00010`H\u0002¢\u0006\u0006\b\u009f\u0001\u0010 \u0001J$\u0010£\u0001\u001a\u00020\t2\u0010\u00105\u001a\f\u0018\u00010¡\u0001j\u0005\u0018\u0001`¢\u0001H\u0002¢\u0006\u0006\b£\u0001\u0010¤\u0001J&\u0010¥\u0001\u001a\u00020\t2\u0012\b\u0002\u00105\u001a\f\u0018\u00010¡\u0001j\u0005\u0018\u0001`¢\u0001H\u0002¢\u0006\u0006\b¥\u0001\u0010¤\u0001R\u001a\u0010§\u0001\u001a\u00030¦\u00018\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\b§\u0001\u0010¨\u0001R\u001b\u0010©\u0001\u001a\u0004\u0018\u00010.8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b©\u0001\u0010ª\u0001R\u001a\u0010¬\u0001\u001a\u00030«\u00018\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\b¬\u0001\u0010\u00ad\u0001R\"\u0010¯\u0001\u001a\u000b\u0012\u0004\u0012\u00020=\u0018\u00010®\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¯\u0001\u0010°\u0001R\u001c\u0010²\u0001\u001a\u0005\u0018\u00010±\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b²\u0001\u0010³\u0001R\u001c\u0010µ\u0001\u001a\u0005\u0018\u00010´\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bµ\u0001\u0010¶\u0001R\u001a\u0010¸\u0001\u001a\u00030·\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¸\u0001\u0010¹\u0001R\u001a\u0010»\u0001\u001a\u00030º\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b»\u0001\u0010¼\u0001R\u001c\u0010¾\u0001\u001a\u0005\u0018\u00010½\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¾\u0001\u0010¿\u0001R\u001c\u0010Á\u0001\u001a\u0005\u0018\u00010À\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÁ\u0001\u0010Â\u0001R\u001c\u0010Ä\u0001\u001a\u0005\u0018\u00010Ã\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÄ\u0001\u0010Å\u0001R#\u0010È\u0001\u001a\f\u0018\u00010Æ\u0001j\u0005\u0018\u0001`Ç\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÈ\u0001\u0010É\u0001R\u001c\u0010Ë\u0001\u001a\u0005\u0018\u00010Ê\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bË\u0001\u0010Ì\u0001R\u001c\u0010Î\u0001\u001a\u0005\u0018\u00010Í\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÎ\u0001\u0010Ï\u0001R(\u0010Ñ\u0001\u001a\u0011\u0012\u0005\u0012\u00030Ð\u0001\u0012\u0004\u0012\u00020\t\u0018\u00010\u007f8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÑ\u0001\u0010Ò\u0001R\u001b\u0010Ó\u0001\u001a\u0004\u0018\u00010,8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÓ\u0001\u0010Ô\u0001R\u001c\u0010Ö\u0001\u001a\u0005\u0018\u00010Õ\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÖ\u0001\u0010×\u0001R#\u0010Ú\u0001\u001a\f\u0018\u00010Ø\u0001j\u0005\u0018\u0001`Ù\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÚ\u0001\u0010Û\u0001R\u001c\u0010Ý\u0001\u001a\u0005\u0018\u00010Ü\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÝ\u0001\u0010Þ\u0001R\u001c\u0010à\u0001\u001a\u0005\u0018\u00010ß\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bà\u0001\u0010á\u0001R\u001c\u0010ã\u0001\u001a\u0005\u0018\u00010â\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bã\u0001\u0010ä\u0001R\u001c\u0010æ\u0001\u001a\u0005\u0018\u00010å\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bæ\u0001\u0010ç\u0001R\u001c\u0010é\u0001\u001a\u0005\u0018\u00010è\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bé\u0001\u0010ê\u0001R\u001c\u0010ì\u0001\u001a\u0005\u0018\u00010ë\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bì\u0001\u0010í\u0001R\u0019\u0010î\u0001\u001a\u0002068\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bî\u0001\u0010ï\u0001R\u0019\u0010ð\u0001\u001a\u0002068\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bð\u0001\u0010ï\u0001R#\u0010ó\u0001\u001a\f\u0012\u0005\u0012\u00030ò\u0001\u0018\u00010ñ\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bó\u0001\u0010ô\u0001R!\u0010õ\u0001\u001a\n\u0018\u00010=j\u0004\u0018\u0001`>8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bõ\u0001\u0010ö\u0001R\u0018\u0010ø\u0001\u001a\u00030÷\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bø\u0001\u0010ù\u0001R\u001c\u0010ú\u0001\u001a\u0005\u0018\u00010ë\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bú\u0001\u0010í\u0001R\u0019\u0010û\u0001\u001a\u0002068\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bû\u0001\u0010ï\u0001R\u0019\u0010ü\u0001\u001a\u00020\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bü\u0001\u0010ý\u0001R\u0018\u0010ÿ\u0001\u001a\u00030þ\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÿ\u0001\u0010\u0080\u0002R\u0018\u0010\u0082\u0002\u001a\u00030\u0081\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0082\u0002\u0010\u0083\u0002R\u0018\u0010\u0085\u0002\u001a\u00030\u0084\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0085\u0002\u0010\u0086\u0002R\u0018\u0010\u0088\u0002\u001a\u00030\u0087\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0088\u0002\u0010\u0089\u0002R\u0018\u0010\u008b\u0002\u001a\u00030\u008a\u00028\u0002X\u0083\u0004¢\u0006\b\n\u0006\b\u008b\u0002\u0010\u008c\u0002R\u0018\u0010\u008f\u0002\u001a\u00030´\u00018BX\u0082\u0004¢\u0006\b\u001a\u0006\b\u008d\u0002\u0010\u008e\u0002¨\u0006\u0091\u0002"}, d2 = {"Lru/ozon/app/android/search/dialogsearchscreen/withTopFilters/DialogSearchTopFiltersFragment;", "Landroidx/fragment/app/m;", "Lru/ozon/app/android/composer/universalscreen/view/ComposerFragment$Host;", "Lru/ozon/uni/atoms/af/pool/CacheHolder;", "Landroid/widget/TextView$OnEditorActionListener;", "<init>", "()V", "Landroid/content/Context;", "context", "", "onAttach", "(Landroid/content/Context;)V", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "view", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "onPause", "", "requestCode", "resultCode", "Landroid/content/Intent;", "data", "onActivityResult", "(IILandroid/content/Intent;)V", "onDestroyView", "onDestroy", "Lru/ozon/uni/atoms/af/pool/RecycledAtomPool;", "getRecycledAtomPool", "()Lru/ozon/uni/atoms/af/pool/RecycledAtomPool;", "Lfk0/c;", "Lru/ozon/app/android/uikit/pool/ViewPool;", "getViewPool", "()Lfk0/c;", "fragment", "Lru/ozon/app/android/composer/ComposerFragmentController;", "composer", "Ll10/i;", "composerContainer", "onComposerCreated", "(Landroidx/fragment/app/m;Lru/ozon/app/android/composer/ComposerFragmentController;Ll10/i;)V", "Landroid/widget/TextView;", "actionId", "Landroid/view/KeyEvent;", "event", "", "onEditorAction", "(Landroid/widget/TextView;ILandroid/view/KeyEvent;)Z", "saveCollapsingState", "offset", "setAppBarOffset", "(I)V", "Lru/ozon/composer/ui/widget/l;", "Lru/ozon/app/android/composer/view/ComposerViewObject;", "viewItem", "parsePlaceholders", "(Lru/ozon/composer/ui/widget/l;)V", "addNewPlaceholder", "(Lru/ozon/composer/ui/widget/l;Ll10/i;)V", "Lru/ozon/app/android/search/dialogsearchscreen/searchbar/view/DialogSearchBarView;", "applySearchBarRedesign", "(Lru/ozon/app/android/search/dialogsearchscreen/searchbar/view/DialogSearchBarView;)V", "removeOldPlaceholder", "Lru/ozon/app/android/search/dialogsearchscreen/searchbar/common/PageRefreshState;", "pageRefreshState", "needToClearCache", "refreshPage", "(Lru/ozon/app/android/search/dialogsearchscreen/searchbar/common/PageRefreshState;Z)V", "subscribeSearchBarModel", "subscribeInsertNestedWidgets", "clearNestedWidgetJob", "subscribePageRefreshModel", "subscribeTapTagQuery", "subscribeSearchInputState", "disabled", "disableFilterButtons", "(Z)V", "Lru/ozon/app/android/search/widgets/dialogSearchBar/presentation/DialogSearchBarVO;", "model", "updateSearchBar", "(Lru/ozon/app/android/search/widgets/dialogSearchBar/presentation/DialogSearchBarVO;)V", "Lru/ozon/app/android/search/widgets/dialogSearchBar/data/DialogSearchBarDTO$SearchBarStyles;", "searchBarStyles", "updateSearchBarPaddings", "(Lru/ozon/app/android/search/widgets/dialogSearchBar/data/DialogSearchBarDTO$SearchBarStyles;)V", "hasSuggestionsInBackstack", "()Z", "", "inputText", "isNeedToSetInputFromModel", "(Ljava/lang/String;)Z", "Lru/ozon/uni/atoms/data/indicator/IndicatorDTO;", "indicatorDTO", "Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "iconDTO", "setupFilterIcon", "(Lru/ozon/uni/atoms/data/indicator/IndicatorDTO;Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;)V", "", "Lru/ozon/uni/atoms/data/controls/tag/TagButtonDTO;", "list", "setFilters", "(Ljava/util/List;)V", "Lru/ozon/app/android/search/widgets/dialogSearchBar/presentation/DialogSearchBarVO$TapTagVO;", "setTapTags", "maxRow", "updateTapTagsMaxRows", "deeplink", "openFilters", "(Ljava/lang/String;)V", "addChildComposerFragment", "observeComposerStateAndEvents", "(Lru/ozon/app/android/composer/ComposerFragmentController;)V", "LA00/a$J;", "handleComposerUpdateEvent", "(LA00/a$J;)V", "handleComposerFirstLoadEvent", "Lkotlin/Function0;", "loadingAction", "Lkotlin/Function1;", "successAction", "observePrefetchLoad", "(Ljava/lang/String;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;)V", "Li10/c;", "getUpdatedSearchBarVO", "(Li10/c;)Lru/ozon/app/android/search/widgets/dialogSearchBar/presentation/DialogSearchBarVO;", "showShimmer", "hideShimmer", "()Lkotlin/Unit;", "newText", "onTextChanged", "sendSearchAnalyticsEvent", "getCacheHolder", "()Lru/ozon/uni/atoms/af/pool/CacheHolder;", "setUpKeyboardAnimationCallback", "observeLifecycleContainer", "navigateBack", "goToPreviousPage", "setupBackButtonNavigation", "setBackButtonClickListener", "setClearButtonClickListener", "setInitialSearchBarHint", "clearTextOnPreviousPage", "Landroid/widget/EditText;", "toggleKeyboard", "(Landroid/widget/EditText;)V", "hideActivityKeyboard", "Lru/ozon/app/android/search/widgets/dialogSearchBar/presentation/DialogSearchBarVO$ReturnKeyType;", "returnType", "setReturnKeyType", "(Landroid/widget/EditText;Lru/ozon/app/android/search/widgets/dialogSearchBar/presentation/DialogSearchBarVO$ReturnKeyType;)V", "setTextWithSelection", "(Landroid/widget/EditText;Ljava/lang/String;)V", "LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "trackViewEvent", "(LWZ/t;)V", "trackNonViewEvent", "Lru/ozon/app/android/composer/ComposerReferences;", "references", "Lru/ozon/app/android/composer/ComposerReferences;", "screenContainer", "Ll10/i;", "Lru/ozon/app/android/common/SearchUrlPrefetchService;", "searchUrlPrefetchService", "Lru/ozon/app/android/common/SearchUrlPrefetchService;", "Lj10/a;", "composerStore", "Lj10/a;", "Lru/ozon/app/android/search/dialogsearchscreen/withTopFilters/CollapsingCoordinatorImpl;", "collapsingCoordinator", "Lru/ozon/app/android/search/dialogsearchscreen/withTopFilters/CollapsingCoordinatorImpl;", "Lru/ozon/app/android/search/databinding/FragmentDialogSearchCoordinatorBinding;", "_binding", "Lru/ozon/app/android/search/databinding/FragmentDialogSearchCoordinatorBinding;", "Lru/ozon/app/android/search/dialogsearchscreen/withTopFilters/SkeletonCreator;", "skeletonCreator", "Lru/ozon/app/android/search/dialogsearchscreen/withTopFilters/SkeletonCreator;", "Landroid/os/Handler;", "mHandler", "Landroid/os/Handler;", "Lru/ozon/app/android/common/filterWidgets/filters/presentation/category/FilterSharedViewModel;", "filtersSharedViewModel", "Lru/ozon/app/android/common/filterWidgets/filters/presentation/category/FilterSharedViewModel;", "Lru/ozon/app/android/search/dialogsearchscreen/DialogSearchViewModel;", "viewModel", "Lru/ozon/app/android/search/dialogsearchscreen/DialogSearchViewModel;", "Lru/ozon/app/android/search/widgets/searchbar/presentation/searchBar/ClearSearchTextViewModel;", "clearSearchTextViewModel", "Lru/ozon/app/android/search/widgets/searchbar/presentation/searchBar/ClearSearchTextViewModel;", "LWZ/l;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedAnalytics;", "tokenizedAnalytics", "LWZ/l;", "LGZ/k;", "routeFactory", "LGZ/k;", "LHZ/a;", "deeplinkHandlersCache", "LHZ/a;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "composerFragmentController", "Lru/ozon/app/android/composer/ComposerFragmentController;", "Lru/ozon/app/android/uikit/utils/DelayedVisibilityHandler;", "shimmerDelayedVisibilityHandler", "Lru/ozon/app/android/uikit/utils/DelayedVisibilityHandler;", "LVg/d;", "Lru/ozon/app/android/action/custom/CustomActionHandlersStoreFactory;", "customActionHandlersStoreFactory", "LVg/d;", "Lei0/b;", "ozonTracker", "Lei0/b;", "LSg/a;", "analyticsScreenStorage", "LSg/a;", "Lru/ozon/app/android/network/abtool/FeatureChecker;", "featureChecker", "Lru/ozon/app/android/network/abtool/FeatureChecker;", "Lru/ozon/app/android/search/dialogsearchscreen/searchbar/filter/DialogFilterTagsAdapter;", "filtersAdapter", "Lru/ozon/app/android/search/dialogsearchscreen/searchbar/filter/DialogFilterTagsAdapter;", "Lru/ozon/app/android/search/dialogsearchscreen/searchbar/tapTags/DialogTapTagsAdapter;", "tapTagsAdapter", "Lru/ozon/app/android/search/dialogsearchscreen/searchbar/tapTags/DialogTapTagsAdapter;", "Lxe/B0;", "subscriptionPageRefreshJob", "Lxe/B0;", "wasTextAlreadySet", "Z", "isNeedToResetScroll", "Lb20/a;", "Ll20/c;", "nestedViewHolder", "Lru/ozon/composer/ui/widget/k;", "oldPlaceholderViewItem", "Lru/ozon/composer/ui/widget/l;", "Lru/ozon/app/android/search/dialogsearchscreen/withTopFilters/DialogSearchPlaceholderManager;", "dialogSearchPlaceholderManager", "Lru/ozon/app/android/search/dialogsearchscreen/withTopFilters/DialogSearchPlaceholderManager;", "nestedWidgetsJob", "suggestionsWasInBackstack", "tapTagsMaxRows", "I", "ru/ozon/app/android/search/dialogsearchscreen/withTopFilters/DialogSearchTopFiltersFragment$onBackPressedListener$1", "onBackPressedListener", "Lru/ozon/app/android/search/dialogsearchscreen/withTopFilters/DialogSearchTopFiltersFragment$onBackPressedListener$1;", "ru/ozon/app/android/search/dialogsearchscreen/withTopFilters/DialogSearchTopFiltersFragment$editTextTextWatcher$1", "editTextTextWatcher", "Lru/ozon/app/android/search/dialogsearchscreen/withTopFilters/DialogSearchTopFiltersFragment$editTextTextWatcher$1;", "Landroid/view/View$OnFocusChangeListener;", "onFocusChangedListener", "Landroid/view/View$OnFocusChangeListener;", "ru/ozon/app/android/search/dialogsearchscreen/withTopFilters/DialogSearchTopFiltersFragment$scrollListener$1", "scrollListener", "Lru/ozon/app/android/search/dialogsearchscreen/withTopFilters/DialogSearchTopFiltersFragment$scrollListener$1;", "Landroid/view/View$OnTouchListener;", "touchListener", "Landroid/view/View$OnTouchListener;", "getBinding", "()Lru/ozon/app/android/search/databinding/FragmentDialogSearchCoordinatorBinding;", "binding", "Companion", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class DialogSearchTopFiltersFragment extends ComponentCallbacksC5392m implements ComposerFragment.Host, CacheHolder, TextView.OnEditorActionListener {
    private FragmentDialogSearchCoordinatorBinding _binding;
    private Function1<? super AtomAction, Unit> actionHandler;
    private a analyticsScreenStorage;
    private ClearSearchTextViewModel clearSearchTextViewModel;
    private CollapsingCoordinatorImpl collapsingCoordinator;
    private ComposerFragmentController composerFragmentController;
    private InterfaceC7238a<l> composerStore;
    private d customActionHandlersStoreFactory;
    private HZ.a deeplinkHandlersCache;
    private FeatureChecker featureChecker;
    private DialogFilterTagsAdapter filtersAdapter;
    private FilterSharedViewModel filtersSharedViewModel;
    private k nestedViewHolder;
    private B0 nestedWidgetsJob;
    private l oldPlaceholderViewItem;
    private InterfaceC6369b ozonTracker;
    private ComposerReferences references;
    private GZ.k routeFactory;
    private i screenContainer;
    private SearchUrlPrefetchService searchUrlPrefetchService;
    private DelayedVisibilityHandler shimmerDelayedVisibilityHandler;
    private B0 subscriptionPageRefreshJob;
    private boolean suggestionsWasInBackstack;
    private DialogTapTagsAdapter tapTagsAdapter;
    private int tapTagsMaxRows;
    private WZ.l tokenizedAnalytics;
    private DialogSearchViewModel viewModel;
    private boolean wasTextAlreadySet;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private static final int defaultSearchBottomPadding = ResourceExtKt.toPx(10);

    @NotNull
    private SkeletonCreator skeletonCreator = new DialogSearchSkeletonCreatorImpl();

    @NotNull
    private Handler mHandler = new Handler(Looper.getMainLooper());
    private boolean isNeedToResetScroll = true;

    @NotNull
    private final DialogSearchPlaceholderManager dialogSearchPlaceholderManager = new DialogSearchPlaceholderManager();

    @NotNull
    private final DialogSearchTopFiltersFragment$onBackPressedListener$1 onBackPressedListener = new C() { // from class: ru.ozon.app.android.search.dialogsearchscreen.withTopFilters.DialogSearchTopFiltersFragment$onBackPressedListener$1
        {
            super(true);
        }

        @Override // androidx.activity.C
        public void handleOnBackPressed() {
            DialogSearchTopFiltersFragment.this.goToPreviousPage();
        }
    };

    @NotNull
    private final DialogSearchTopFiltersFragment$editTextTextWatcher$1 editTextTextWatcher = new SimpleTextWatcher() { // from class: ru.ozon.app.android.search.dialogsearchscreen.withTopFilters.DialogSearchTopFiltersFragment$editTextTextWatcher$1
        @Override // ru.ozon.uni.android.uikit.common.SimpleTextWatcher, android.text.TextWatcher
        public void afterTextChanged(Editable text) {
            Intrinsics.checkNotNullParameter(text, "text");
            DialogSearchTopFiltersFragment.this.onTextChanged(text.toString());
        }
    };

    @NotNull
    private final View.OnFocusChangeListener onFocusChangedListener = new View.OnFocusChangeListener() { // from class: eI.d
        @Override // android.view.View.OnFocusChangeListener
        public final void onFocusChange(View view, boolean z11) {
            DialogSearchTopFiltersFragment.onFocusChangedListener$lambda$0(DialogSearchTopFiltersFragment.this, view, z11);
        }
    };

    @NotNull
    private final DialogSearchTopFiltersFragment$scrollListener$1 scrollListener = new RecyclerView.t() { // from class: ru.ozon.app.android.search.dialogsearchscreen.withTopFilters.DialogSearchTopFiltersFragment$scrollListener$1
        @Override // androidx.recyclerview.widget.RecyclerView.t
        public void onScrollStateChanged(RecyclerView recyclerView, int newState) {
            FragmentDialogSearchCoordinatorBinding binding;
            DialogSearchViewModel dialogSearchViewModel;
            DialogSearchViewModel dialogSearchViewModel2;
            DialogSearchViewModel dialogSearchViewModel3;
            Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
            super.onScrollStateChanged(recyclerView, newState);
            if (newState == 1) {
                DialogSearchTopFiltersFragment dialogSearchTopFiltersFragment = DialogSearchTopFiltersFragment.this;
                binding = dialogSearchTopFiltersFragment.getBinding();
                dialogSearchTopFiltersFragment.toggleKeyboard(binding.dialogSearchBarView.getSearchInput());
                DialogSearchTopFiltersFragment dialogSearchTopFiltersFragment2 = DialogSearchTopFiltersFragment.this;
                dialogSearchViewModel = dialogSearchTopFiltersFragment2.viewModel;
                dialogSearchTopFiltersFragment2.trackViewEvent(dialogSearchViewModel != null ? dialogSearchViewModel.getPageInteractionEvent() : null);
                dialogSearchViewModel2 = DialogSearchTopFiltersFragment.this.viewModel;
                if (dialogSearchViewModel2 != null) {
                    ActionType actionType = ActionType.SCROLL;
                    dialogSearchViewModel3 = DialogSearchTopFiltersFragment.this.viewModel;
                    dialogSearchViewModel2.sendInteraction(actionType, dialogSearchViewModel3 != null ? dialogSearchViewModel3.getRefreshUrl() : null);
                }
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:12:0x002b, code lost:
        
            r2 = r1.this$0.collapsingCoordinator;
         */
        @Override // androidx.recyclerview.widget.RecyclerView.t
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void onScrolled(RecyclerView recyclerView, int dx, int dy) {
            CollapsingCoordinatorImpl collapsingCoordinatorImpl;
            CollapsingCoordinatorImpl collapsingCoordinatorImpl2;
            Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
            super.onScrolled(recyclerView, dx, dy);
            if (dy == 0) {
                return;
            }
            collapsingCoordinatorImpl = DialogSearchTopFiltersFragment.this.collapsingCoordinator;
            if (collapsingCoordinatorImpl != null) {
                collapsingCoordinatorImpl.setStartScrolling(true);
            }
            RecyclerView.o layoutManager = recyclerView.getLayoutManager();
            LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
            if (linearLayoutManager == null || linearLayoutManager.findFirstCompletelyVisibleItemPosition() != 0 || collapsingCoordinatorImpl2 == null) {
                return;
            }
            collapsingCoordinatorImpl2.onTopReached();
        }
    };

    @SuppressLint({"ClickableViewAccessibility"})
    @NotNull
    private final View.OnTouchListener touchListener = new e(this, 0);

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0005R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\tX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lru/ozon/app/android/search/dialogsearchscreen/withTopFilters/DialogSearchTopFiltersFragment$Companion;", "", "<init>", "()V", "KEY_EXTRA_COMPOSER_SCREEN_CONFIG", "", "KEY_EXTRA_SEARCH_BAR_HINT", "TAG_COMPOSER_CHILD_FRAGMENT", "DEFAULT_HEIGHT", "", "DEFAULT_SIZE", "defaultSearchBottomPadding", "newInstance", "Lru/ozon/app/android/search/dialogsearchscreen/withTopFilters/DialogSearchTopFiltersFragment;", "screenConfig", "Lru/ozon/app/android/composer/universalscreen/view/ComposerScreenConfig;", "searchBarHint", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final DialogSearchTopFiltersFragment newInstance(@NotNull ComposerScreenConfig screenConfig, @NotNull String searchBarHint) {
            Intrinsics.checkNotNullParameter(screenConfig, "screenConfig");
            Intrinsics.checkNotNullParameter(searchBarHint, "searchBarHint");
            DialogSearchTopFiltersFragment dialogSearchTopFiltersFragment = new DialogSearchTopFiltersFragment();
            dialogSearchTopFiltersFragment.setArguments(androidx.core.os.d.b(new Pair("KeyExtraComposerScreenConfig", screenConfig), new Pair("KeyExtraSearchBarHint", searchBarHint)));
            return dialogSearchTopFiltersFragment;
        }

        private Companion() {
        }
    }

    private final void addChildComposerFragment(Bundle savedInstanceState) {
        Bundle arguments;
        ComposerScreenConfig composerScreenConfig;
        if (savedInstanceState != null || (arguments = getArguments()) == null || (composerScreenConfig = (ComposerScreenConfig) arguments.getParcelable("KeyExtraComposerScreenConfig")) == null) {
            return;
        }
        ComposerFragment newInstance$default = ComposerFragment.Companion.newInstance$default(ComposerFragment.INSTANCE, composerScreenConfig, ComposerFragment.DisplayMode.REGULAR, null, 4, null);
        Q p11 = getChildFragmentManager().p();
        p11.b(R$id.composerContainer, newInstance$default, "TagComposerChildFragment");
        p11.i();
    }

    private final void addNewPlaceholder(l viewItem, i container) {
        if (this.oldPlaceholderViewItem != null) {
            removeOldPlaceholder();
        }
        this.nestedViewHolder = this.dialogSearchPlaceholderManager.m961addNestedWidgetT4d_Ons(viewItem, getBinding(), container);
        this.oldPlaceholderViewItem = viewItem;
    }

    private final void applySearchBarRedesign(DialogSearchBarView dialogSearchBarView) {
        FrameLayout frameLayout = getBinding().dialogSearchBarContainer;
        DialogSearchBarView.Companion companion = DialogSearchBarView.INSTANCE;
        frameLayout.setPadding(companion.getRedesignedHorizontalPaddings(), companion.getRedesignedHorizontalPaddings(), companion.getRedesignedHorizontalPaddings(), getBinding().dialogSearchBarContainer.getPaddingBottom());
        RecyclerView recyclerView = getBinding().tapTags;
        recyclerView.setPadding(companion.getRedesignedHorizontalPaddings(), recyclerView.getPaddingTop(), companion.getRedesignedHorizontalPaddings(), companion.getRedesignedBottomTapTagsPadding());
        dialogSearchBarView.applyRedesign();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void clearNestedWidgetJob() {
        B0 b02 = this.nestedWidgetsJob;
        if (b02 != null) {
            b02.j(null);
        }
        this.nestedWidgetsJob = null;
    }

    private final void clearTextOnPreviousPage() {
        if (hasSuggestionsInBackstack()) {
            ClearSearchTextViewModel clearSearchTextViewModel = this.clearSearchTextViewModel;
            if (clearSearchTextViewModel != null) {
                clearSearchTextViewModel.setNeedClearText(true);
            }
            ComposerReferences composerReferences = this.references;
            if (composerReferences != null) {
                composerReferences.getNavigator().popBackStack();
            } else {
                Intrinsics.n("references");
                throw null;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void disableFilterButtons(boolean disabled) {
        DialogSearchBarView dialogSearchBarView = getBinding().dialogSearchBarView;
        dialogSearchBarView.disable(dialogSearchBarView.getFilterIcon(), disabled);
        dialogSearchBarView.disable(dialogSearchBarView.getActiveFilterIcon(), disabled);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final FragmentDialogSearchCoordinatorBinding getBinding() {
        FragmentDialogSearchCoordinatorBinding fragmentDialogSearchCoordinatorBinding = this._binding;
        Intrinsics.f(fragmentDialogSearchCoordinatorBinding);
        return fragmentDialogSearchCoordinatorBinding;
    }

    private final CacheHolder getCacheHolder() {
        InterfaceC5431s g02 = getChildFragmentManager().g0("TagComposerChildFragment");
        if (g02 instanceof CacheHolder) {
            return (CacheHolder) g02;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x003b A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final DialogSearchBarVO getUpdatedSearchBarVO(C6997c<l> c6997c) {
        c cVar;
        List<l> a11;
        Object obj;
        k.b<l> h11 = c6997c.h();
        if (h11 != null && (a11 = h11.a()) != null) {
            Iterator<T> it = a11.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (((l) obj).d() instanceof DialogSearchBarVO) {
                    break;
                }
            }
            l lVar = (l) obj;
            if (lVar != null) {
                cVar = lVar.d();
                if (cVar instanceof DialogSearchBarVO) {
                    return null;
                }
                return (DialogSearchBarVO) cVar;
            }
        }
        cVar = null;
        if (cVar instanceof DialogSearchBarVO) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void goToPreviousPage() {
        FeatureChecker featureChecker = this.featureChecker;
        boolean z11 = false;
        if (featureChecker != null && featureChecker.isEnabled(KeepSuggestionsEnabledFlag.INSTANCE)) {
            z11 = true;
        }
        if (hasSuggestionsInBackstack() && !z11) {
            ComposerReferences composerReferences = this.references;
            if (composerReferences == null) {
                Intrinsics.n("references");
                throw null;
            }
            composerReferences.getNavigator().popBackStack();
        }
        ComposerReferences composerReferences2 = this.references;
        if (composerReferences2 != null) {
            composerReferences2.getNavigator().popBackStack();
        } else {
            Intrinsics.n("references");
            throw null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleComposerFirstLoadEvent() {
        QZ.a<l> J11;
        InterfaceC7238a<l> r11;
        C6997c<l> b11;
        h l11;
        String j11;
        DialogSearchViewModel dialogSearchViewModel;
        if (!this.suggestionsWasInBackstack) {
            showShimmer();
            return;
        }
        i iVar = this.screenContainer;
        if (iVar == null || (J11 = iVar.J()) == null || (r11 = J11.r()) == null || (b11 = r11.b()) == null || (l11 = b11.l()) == null || (j11 = l11.j()) == null || (dialogSearchViewModel = this.viewModel) == null) {
            return;
        }
        dialogSearchViewModel.sendInteraction(ActionType.REDIRECT_TO_DIALOG, j11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleComposerUpdateEvent(a.J event) {
        DialogSearchViewModel dialogSearchViewModel;
        a.J.InterfaceC0007a d11 = event.d();
        if (d11 instanceof DialogSearchHistoryTapTagClickKey) {
            AtomAction action = ((DialogSearchHistoryTapTagClickKey) d11).getAction();
            AtomAction.Click click = action instanceof AtomAction.Click ? (AtomAction.Click) action : null;
            if (click == null || (dialogSearchViewModel = this.viewModel) == null) {
                return;
            }
            dialogSearchViewModel.handleTapTagAction(click, click.getId());
            return;
        }
        if (d11 instanceof DialogSearchClearHistory) {
            ComposerReferences composerReferences = this.references;
            if (composerReferences != null) {
                InterfaceC7851b.a.e(composerReferences.getController(), null, null, null, 7);
            } else {
                Intrinsics.n("references");
                throw null;
            }
        }
    }

    private final boolean hasSuggestionsInBackstack() {
        String name;
        int l02 = getParentFragmentManager().l0();
        if (l02 >= 2 && (name = getParentFragmentManager().k0(l02 - 2).getName()) != null) {
            return Intrinsics.d(Uri.parse(name).getAuthority(), "searchSuggestions");
        }
        return false;
    }

    private final void hideActivityKeyboard() {
        r activity = getActivity();
        if (activity != null) {
            KeyboardUtils.INSTANCE.hideKeyboard(activity);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Unit hideShimmer() {
        FragmentContainerView composerContainer = getBinding().composerContainer;
        Intrinsics.checkNotNullExpressionValue(composerContainer, "composerContainer");
        composerContainer.setVisibility(0);
        DelayedVisibilityHandler delayedVisibilityHandler = this.shimmerDelayedVisibilityHandler;
        if (delayedVisibilityHandler == null) {
            return null;
        }
        delayedVisibilityHandler.hide();
        return Unit.f71690a;
    }

    private final boolean isNeedToSetInputFromModel(String inputText) {
        if (inputText == null || inputText.length() == 0) {
            return false;
        }
        Editable text = getBinding().dialogSearchBarView.getSearchInput().getText();
        return (text == null || text.length() == 0) && !this.wasTextAlreadySet;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void navigateBack() {
        this.mHandler.post(new N9.c(this, 2));
    }

    private final void observeComposerStateAndEvents(ComposerFragmentController composer) {
        InterfaceC7238a<l> composerStore = composer.getComposerStore();
        InterfaceC2395h<C6997c<l>> state = composerStore.getState();
        AbstractC5434v lifecycle = getViewLifecycleOwner().getLifecycle();
        AbstractC5434v.b bVar = AbstractC5434v.b.STARTED;
        C2408n0 c2408n0 = new C2408n0(C5427n.a(state, lifecycle, bVar), new DialogSearchTopFiltersFragment$observeComposerStateAndEvents$1(this, null));
        J viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        C2399j.C(c2408n0, K.a(viewLifecycleOwner));
        C2408n0 c2408n02 = new C2408n0(C5427n.a(composerStore.getEvents(), getViewLifecycleOwner().getLifecycle(), bVar), new DialogSearchTopFiltersFragment$observeComposerStateAndEvents$2(this, composer, null));
        J viewLifecycleOwner2 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner2, "getViewLifecycleOwner(...)");
        C2399j.C(c2408n02, K.a(viewLifecycleOwner2));
    }

    private final void observeLifecycleContainer() {
        ComposerReferences composerReferences = this.references;
        if (composerReferences == null) {
            Intrinsics.n("references");
            throw null;
        }
        final AbstractC5434v c11 = U7.d.c(composerReferences);
        c11.a(new DefaultLifecycleObserver() { // from class: ru.ozon.app.android.search.dialogsearchscreen.withTopFilters.DialogSearchTopFiltersFragment$observeLifecycleContainer$1
            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public void onDestroy(J owner) {
                Handler handler;
                CollapsingCoordinatorImpl collapsingCoordinatorImpl;
                FragmentDialogSearchCoordinatorBinding binding;
                ru.ozon.composer.ui.widget.k kVar;
                Intrinsics.checkNotNullParameter(owner, "owner");
                handler = DialogSearchTopFiltersFragment.this.mHandler;
                handler.removeCallbacksAndMessages(null);
                collapsingCoordinatorImpl = DialogSearchTopFiltersFragment.this.collapsingCoordinator;
                if (collapsingCoordinatorImpl != null) {
                    collapsingCoordinatorImpl.onClear();
                }
                c11.e(this);
                binding = DialogSearchTopFiltersFragment.this.getBinding();
                binding.dialogSearchBarView.cancelArrowAnimation();
                DialogSearchTopFiltersFragment.this.clearNestedWidgetJob();
                kVar = DialogSearchTopFiltersFragment.this.nestedViewHolder;
                if (kVar != null) {
                    C5521a.c(kVar, AbstractC5434v.b.DESTROYED);
                }
                DialogSearchTopFiltersFragment.this.collapsingCoordinator = null;
            }

            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public void onPause(J owner) {
                FragmentDialogSearchCoordinatorBinding binding;
                Intrinsics.checkNotNullParameter(owner, "owner");
                super.onPause(owner);
                if (Build.VERSION.SDK_INT >= 30) {
                    binding = DialogSearchTopFiltersFragment.this.getBinding();
                    binding.dialogSearchBarView.getSearchInput().setWindowInsetsAnimationCallback(null);
                }
            }

            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public void onResume(J owner) {
                Intrinsics.checkNotNullParameter(owner, "owner");
                super.onResume(owner);
                DialogSearchTopFiltersFragment.this.setUpKeyboardAnimationCallback();
            }

            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public void onStart(J owner) {
                FragmentDialogSearchCoordinatorBinding binding;
                DialogSearchTopFiltersFragment$editTextTextWatcher$1 dialogSearchTopFiltersFragment$editTextTextWatcher$1;
                ComposerReferences composerReferences2;
                View view;
                RecyclerView composerRecyclerView;
                DialogSearchTopFiltersFragment$scrollListener$1 dialogSearchTopFiltersFragment$scrollListener$1;
                View.OnTouchListener onTouchListener;
                Intrinsics.checkNotNullParameter(owner, "owner");
                binding = DialogSearchTopFiltersFragment.this.getBinding();
                AppCompatEditText searchInput = binding.dialogSearchBarView.getSearchInput();
                dialogSearchTopFiltersFragment$editTextTextWatcher$1 = DialogSearchTopFiltersFragment.this.editTextTextWatcher;
                searchInput.addTextChangedListener(dialogSearchTopFiltersFragment$editTextTextWatcher$1);
                composerReferences2 = DialogSearchTopFiltersFragment.this.references;
                if (composerReferences2 == null) {
                    Intrinsics.n("references");
                    throw null;
                }
                ComponentCallbacksC5392m c12 = composerReferences2.getContainer().c();
                if (c12 == null || (view = c12.getView()) == null || (composerRecyclerView = ComposerViewExtensionKt.composerRecyclerView(view)) == null) {
                    return;
                }
                DialogSearchTopFiltersFragment dialogSearchTopFiltersFragment = DialogSearchTopFiltersFragment.this;
                dialogSearchTopFiltersFragment$scrollListener$1 = dialogSearchTopFiltersFragment.scrollListener;
                composerRecyclerView.addOnScrollListener(dialogSearchTopFiltersFragment$scrollListener$1);
                onTouchListener = dialogSearchTopFiltersFragment.touchListener;
                composerRecyclerView.setOnTouchListener(onTouchListener);
                composerRecyclerView.setItemAnimator(null);
            }

            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public void onStop(J owner) {
                FragmentDialogSearchCoordinatorBinding binding;
                DialogSearchTopFiltersFragment$editTextTextWatcher$1 dialogSearchTopFiltersFragment$editTextTextWatcher$1;
                ComposerReferences composerReferences2;
                View view;
                RecyclerView composerRecyclerView;
                DialogSearchTopFiltersFragment$scrollListener$1 dialogSearchTopFiltersFragment$scrollListener$1;
                Intrinsics.checkNotNullParameter(owner, "owner");
                super.onStop(owner);
                binding = DialogSearchTopFiltersFragment.this.getBinding();
                AppCompatEditText searchInput = binding.dialogSearchBarView.getSearchInput();
                dialogSearchTopFiltersFragment$editTextTextWatcher$1 = DialogSearchTopFiltersFragment.this.editTextTextWatcher;
                searchInput.removeTextChangedListener(dialogSearchTopFiltersFragment$editTextTextWatcher$1);
                composerReferences2 = DialogSearchTopFiltersFragment.this.references;
                if (composerReferences2 == null) {
                    Intrinsics.n("references");
                    throw null;
                }
                ComponentCallbacksC5392m c12 = composerReferences2.getContainer().c();
                if (c12 == null || (view = c12.getView()) == null || (composerRecyclerView = ComposerViewExtensionKt.composerRecyclerView(view)) == null) {
                    return;
                }
                dialogSearchTopFiltersFragment$scrollListener$1 = DialogSearchTopFiltersFragment.this.scrollListener;
                composerRecyclerView.removeOnScrollListener(dialogSearchTopFiltersFragment$scrollListener$1);
                composerRecyclerView.setOnTouchListener(null);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void observePrefetchLoad(String deeplink, Function0<Unit> loadingAction, Function1<? super String, Unit> successAction) {
        ComposerReferences composerReferences = this.references;
        if (composerReferences == null) {
            Intrinsics.n("references");
            throw null;
        }
        C4908c g10 = composerReferences.getContainer().g();
        SearchUrlPrefetchService searchUrlPrefetchService = this.searchUrlPrefetchService;
        if (searchUrlPrefetchService != null) {
            searchUrlPrefetchService.navigateWhenRequestPrefetched(deeplink, g10, successAction, loadingAction);
        } else {
            Intrinsics.n("searchUrlPrefetchService");
            throw null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onComposerCreated$lambda$17(DialogSearchTopFiltersFragment dialogSearchTopFiltersFragment) {
        Integer prevOffset;
        DialogSearchViewModel dialogSearchViewModel = dialogSearchTopFiltersFragment.viewModel;
        if ((dialogSearchViewModel != null ? dialogSearchViewModel.getCollapsingState() : null) == DialogSearchScrollingState.COLLAPSED) {
            dialogSearchTopFiltersFragment.getBinding().appBarLayout.t(false, false);
            return;
        }
        DialogSearchViewModel dialogSearchViewModel2 = dialogSearchTopFiltersFragment.viewModel;
        if (dialogSearchViewModel2 == null || (prevOffset = dialogSearchViewModel2.getPrevOffset()) == null) {
            return;
        }
        dialogSearchTopFiltersFragment.setAppBarOffset(prevOffset.intValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onFocusChangedListener$lambda$0(DialogSearchTopFiltersFragment dialogSearchTopFiltersFragment, View view, boolean z11) {
        FragmentContainerView composerContainer = dialogSearchTopFiltersFragment.getBinding().composerContainer;
        Intrinsics.checkNotNullExpressionValue(composerContainer, "composerContainer");
        RecyclerView composerRecyclerViewOrNull = ComposerViewExtensionKt.composerRecyclerViewOrNull(composerContainer);
        if (composerRecyclerViewOrNull != null) {
            composerRecyclerViewOrNull.stopScroll();
        }
        if (!z11) {
            CollapsingCoordinatorImpl collapsingCoordinatorImpl = dialogSearchTopFiltersFragment.collapsingCoordinator;
            if (collapsingCoordinatorImpl != null) {
                collapsingCoordinatorImpl.setSearchMaxLines(1);
                return;
            }
            return;
        }
        DialogSearchTopFiltersFragment$onFocusChangedListener$1$afterFocusingAction$1 dialogSearchTopFiltersFragment$onFocusChangedListener$1$afterFocusingAction$1 = new DialogSearchTopFiltersFragment$onFocusChangedListener$1$afterFocusingAction$1(dialogSearchTopFiltersFragment);
        AppBarLayout appBarLayout = dialogSearchTopFiltersFragment.getBinding().appBarLayout;
        Intrinsics.checkNotNullExpressionValue(appBarLayout, "appBarLayout");
        if (AppBarLayoutExtKt.currentOffset(appBarLayout) != 0) {
            AppBarLayout appBarLayout2 = dialogSearchTopFiltersFragment.getBinding().appBarLayout;
            Intrinsics.checkNotNullExpressionValue(appBarLayout2, "appBarLayout");
            AppBarLayoutExtKt.onAlmostCompletelyExpanded(appBarLayout2, new DialogSearchTopFiltersFragment$onFocusChangedListener$1$1(dialogSearchTopFiltersFragment, dialogSearchTopFiltersFragment$onFocusChangedListener$1$afterFocusingAction$1));
            dialogSearchTopFiltersFragment.getBinding().appBarLayout.t(true, true);
            return;
        }
        CollapsingCoordinatorImpl collapsingCoordinatorImpl2 = dialogSearchTopFiltersFragment.collapsingCoordinator;
        if (collapsingCoordinatorImpl2 != null) {
            collapsingCoordinatorImpl2.setSearchMaxLines(2);
        }
        dialogSearchTopFiltersFragment$onFocusChangedListener$1$afterFocusingAction$1.invoke();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onTextChanged(String newText) {
        DialogSearchBarView dialogSearchBarView = getBinding().dialogSearchBarView;
        boolean z11 = newText == null || newText.length() == 0;
        dialogSearchBarView.changeVisibilityGradientForMultilineInput();
        dialogSearchBarView.getClearIcon().setVisibility(z11 ? 8 : 0);
        DialogSearchViewModel dialogSearchViewModel = this.viewModel;
        if (dialogSearchViewModel != null) {
            dialogSearchViewModel.onQueryChanged(newText);
        }
        if (z11) {
            clearTextOnPreviousPage();
        }
        DialogSearchViewModel dialogSearchViewModel2 = this.viewModel;
        if (!Intrinsics.d(newText, dialogSearchViewModel2 != null ? dialogSearchViewModel2.getOldText() : null)) {
            DialogSearchViewModel dialogSearchViewModel3 = this.viewModel;
            if ((dialogSearchViewModel3 != null ? dialogSearchViewModel3.getOldText() : null) != null) {
                sendSearchAnalyticsEvent(newText);
            }
        }
        DialogSearchViewModel dialogSearchViewModel4 = this.viewModel;
        if (dialogSearchViewModel4 != null) {
            dialogSearchViewModel4.setOldText(newText);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void openFilters(String deeplink) {
        j b11;
        HZ.a aVar;
        IZ.a b12;
        GZ.k kVar = this.routeFactory;
        if (kVar == null || (b11 = GZ.k.b(kVar, deeplink, null, 6)) == null || (aVar = this.deeplinkHandlersCache) == null || (b12 = aVar.b(b11)) == null) {
            return;
        }
        Context requireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
        Object destination = b12.getDestination(requireContext, b11);
        ComposerScreenContainer composerScreenContainer = destination instanceof ComposerScreenContainer ? (ComposerScreenContainer) destination : null;
        if (composerScreenContainer == null) {
            return;
        }
        ComposerReferences composerReferences = this.references;
        if (composerReferences != null) {
            composerReferences.getNavigator().navigate(new ComposerFragmentDestination(composerScreenContainer.getScreenConfig(), "filters", null, false, false, null, false, false, null, 508, null), 9001);
        } else {
            Intrinsics.n("references");
            throw null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void parsePlaceholders(l viewItem) {
        CollapsingCoordinatorImpl collapsingCoordinatorImpl;
        if (viewItem == null) {
            removeOldPlaceholder();
            return;
        }
        i iVar = this.screenContainer;
        if (iVar != null) {
            CollapsingCoordinatorImpl collapsingCoordinatorImpl2 = this.collapsingCoordinator;
            if ((collapsingCoordinatorImpl2 == null || !collapsingCoordinatorImpl2.hasDefaultView()) && ((collapsingCoordinatorImpl = this.collapsingCoordinator) == null || !collapsingCoordinatorImpl.hasTagList())) {
                addNewPlaceholder(viewItem, iVar);
                return;
            }
            if (this.dialogSearchPlaceholderManager.arePlaceHoldersTheSame(viewItem, this.oldPlaceholderViewItem)) {
                return;
            }
            if (!l.class.equals(this.oldPlaceholderViewItem != null ? l.class : null)) {
                addNewPlaceholder(viewItem, iVar);
                return;
            }
            ru.ozon.composer.ui.widget.k kVar = this.nestedViewHolder;
            if (kVar != null) {
                C5521a.a(kVar, viewItem, iVar.c0());
            }
        }
    }

    private final void refreshPage(PageRefreshState pageRefreshState, boolean needToClearCache) {
        if (pageRefreshState.getIsNeedToTrackSearchEvent()) {
            DialogSearchViewModel dialogSearchViewModel = this.viewModel;
            trackNonViewEvent(dialogSearchViewModel != null ? dialogSearchViewModel.getPageRefreshEvent() : null);
        }
        this.isNeedToResetScroll = true;
        DialogSearchViewModel dialogSearchViewModel2 = this.viewModel;
        if (dialogSearchViewModel2 != null) {
            dialogSearchViewModel2.setNeedToClearCache(needToClearCache);
        }
        String url = pageRefreshState.getUrl();
        if (url != null) {
            ComposerReferences composerReferences = this.references;
            if (composerReferences != null) {
                InterfaceC7851b.a.e(composerReferences.getController(), url, null, null, 6);
            } else {
                Intrinsics.n("references");
                throw null;
            }
        }
    }

    static /* synthetic */ void refreshPage$default(DialogSearchTopFiltersFragment dialogSearchTopFiltersFragment, PageRefreshState pageRefreshState, boolean z11, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z11 = true;
        }
        dialogSearchTopFiltersFragment.refreshPage(pageRefreshState, z11);
    }

    private final void removeOldPlaceholder() {
        View defaultView;
        View tagList;
        CollapsingCoordinatorImpl collapsingCoordinatorImpl = this.collapsingCoordinator;
        if (collapsingCoordinatorImpl != null && (tagList = collapsingCoordinatorImpl.getTagList()) != null) {
            getBinding().collapsingToolbar.removeView(tagList);
        }
        CollapsingCoordinatorImpl collapsingCoordinatorImpl2 = this.collapsingCoordinator;
        if (collapsingCoordinatorImpl2 != null && (defaultView = collapsingCoordinatorImpl2.getDefaultView()) != null) {
            getBinding().collapsingToolbar.removeView(defaultView);
        }
        ru.ozon.composer.ui.widget.k kVar = this.nestedViewHolder;
        if (kVar != null) {
            C5521a.c(kVar, AbstractC5434v.b.DESTROYED);
        }
        this.oldPlaceholderViewItem = null;
    }

    private final void saveCollapsingState() {
        DialogSearchViewModel dialogSearchViewModel = this.viewModel;
        if (dialogSearchViewModel != null) {
            CollapsingCoordinatorImpl collapsingCoordinatorImpl = this.collapsingCoordinator;
            dialogSearchViewModel.setPrevOffset(collapsingCoordinatorImpl != null ? Integer.valueOf(collapsingCoordinatorImpl.getPrevOffset()) : null);
        }
        DialogSearchViewModel dialogSearchViewModel2 = this.viewModel;
        if (dialogSearchViewModel2 != null) {
            CollapsingCoordinatorImpl collapsingCoordinatorImpl2 = this.collapsingCoordinator;
            dialogSearchViewModel2.setCollapsingState(collapsingCoordinatorImpl2 != null ? collapsingCoordinatorImpl2.getCollapsingState() : null);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void sendSearchAnalyticsEvent(String newText) {
        Sg.a d11;
        InterfaceC6369b interfaceC6369b = this.ozonTracker;
        if (interfaceC6369b != null) {
            ActionType.Custom custom = new ActionType.Custom("query_input");
            String str = null;
            String str2 = null;
            Long l11 = null;
            Long l12 = null;
            Integer num = null;
            Long l13 = null;
            String str3 = null;
            String str4 = null;
            EventEntity.Widget widget = new EventEntity.Widget(null, "catalog.dialogSearchBar", str, str2, l11, null, null, null, l12, num, null, l13, null, str3, null, str4, null, null, null, null, 1048573, null);
            EventEntity.Properties properties = new EventEntity.Properties(null, str, str2, l11, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, l12, num, 0 == true ? 1 : 0, l13, 0 == true ? 1 : 0, str3, 0 == true ? 1 : 0, str4, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, null, 0 == true ? 1 : 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, String.valueOf(newText), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, -131073, 16383, null);
            Sg.a aVar = this.analyticsScreenStorage;
            interfaceC6369b.sendEvent(custom, (r27 & 2) != 0 ? null : null, (r27 & 4) != 0 ? null : properties, (r27 & 8) != 0 ? null : null, (r27 & 16) != 0 ? null : widget, AnalyticsExtensionsKt.toPage((aVar == null || (d11 = aVar.d()) == null) ? null : d11.a()), (r27 & 64) != 0 ? null : null, null, null, null, null, null, null, null, null, null);
        }
    }

    private final void setAppBarOffset(int offset) {
        FragmentDialogSearchCoordinatorBinding binding = getBinding();
        ViewGroup.LayoutParams layoutParams = binding.appBarLayout.getLayoutParams();
        CoordinatorLayout.f fVar = layoutParams instanceof CoordinatorLayout.f ? (CoordinatorLayout.f) layoutParams : null;
        if (fVar == null) {
            return;
        }
        CoordinatorLayout.c c11 = fVar.c();
        AppBarLayout.Behavior behavior = c11 instanceof AppBarLayout.Behavior ? (AppBarLayout.Behavior) c11 : null;
        if (behavior == null) {
            behavior = new AppBarLayout.Behavior();
        }
        AppBarLayout.Behavior behavior2 = behavior;
        int abs = Math.abs(offset);
        behavior2.e(0);
        CoordinatorLayout coordinatorLayout = getBinding().searchCoordinatorLayout;
        AppBarLayout appBarLayout = binding.appBarLayout;
        FragmentContainerView composerContainer = getBinding().composerContainer;
        Intrinsics.checkNotNullExpressionValue(composerContainer, "composerContainer");
        behavior2.p(coordinatorLayout, appBarLayout, ComposerViewExtensionKt.composerRecyclerView(composerContainer), abs, new int[]{0, 0});
    }

    private final void setBackButtonClickListener(DialogSearchBarView dialogSearchBarView) {
        dialogSearchBarView.getArrowBackIcon().setOnClickListener(new ViewOnClickListenerC2787a(this, 10));
    }

    private final void setClearButtonClickListener(DialogSearchBarView dialogSearchBarView) {
        dialogSearchBarView.getClearIcon().setOnClickListener(new BS.a(dialogSearchBarView, 10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setClearButtonClickListener$lambda$38(DialogSearchBarView dialogSearchBarView, View view) {
        dialogSearchBarView.getSearchInput().requestFocus();
        Editable text = dialogSearchBarView.getSearchInput().getText();
        if (text != null) {
            text.clear();
        }
        KeyboardUtilsKt.showKeyboard(dialogSearchBarView.getSearchInput());
        dialogSearchBarView.changeVisibilityGradientForMultilineInput();
    }

    private final void setFilters(List<TagButtonDTO> list) {
        DialogFilterTagsAdapter dialogFilterTagsAdapter = this.filtersAdapter;
        if (dialogFilterTagsAdapter != null) {
            dialogFilterTagsAdapter.submitList(list);
        }
    }

    private final void setInitialSearchBarHint(DialogSearchBarView dialogSearchBarView) {
        String string;
        Bundle arguments = getArguments();
        if (arguments == null || (string = arguments.getString("KeyExtraSearchBarHint")) == null || string.length() <= 0) {
            return;
        }
        dialogSearchBarView.getSearchInput().setHint(string);
    }

    private final void setReturnKeyType(EditText editText, DialogSearchBarVO.ReturnKeyType returnKeyType) {
        editText.setImeOptions(returnKeyType == DialogSearchBarVO.ReturnKeyType.TYPE_DONE ? 6 : 3);
    }

    private final void setTapTags(List<DialogSearchBarVO.TapTagVO> list) {
        RecyclerView tapTags = getBinding().tapTags;
        Intrinsics.checkNotNullExpressionValue(tapTags, "tapTags");
        if (tapTags.getVisibility() == 0) {
            RecyclerView tapTags2 = getBinding().tapTags;
            Intrinsics.checkNotNullExpressionValue(tapTags2, "tapTags");
            DialogSearchTopFiltersFragment$setTapTags$1 dialogSearchTopFiltersFragment$setTapTags$1 = new DialogSearchTopFiltersFragment$setTapTags$1(this);
            CollapsingCoordinatorImpl collapsingCoordinatorImpl = this.collapsingCoordinator;
            RecyclerViewAnimationExtKt.updateTapTagsWithAnimation(tapTags2, list, dialogSearchTopFiltersFragment$setTapTags$1, collapsingCoordinatorImpl != null ? collapsingCoordinatorImpl.getTapTagsHeightOnGlobalLayoutListener() : null);
        } else {
            DialogTapTagsAdapter dialogTapTagsAdapter = this.tapTagsAdapter;
            if (dialogTapTagsAdapter != null) {
                dialogTapTagsAdapter.submitList(list);
            }
        }
        CollapsingCoordinatorImpl collapsingCoordinatorImpl2 = this.collapsingCoordinator;
        if (collapsingCoordinatorImpl2 != null) {
            collapsingCoordinatorImpl2.onTapTagsUpdated(list);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setTextWithSelection(EditText editText, String str) {
        if (str != null) {
            editText.setText(str);
            editText.setSelection(str.length());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setUpKeyboardAnimationCallback() {
        if (Build.VERSION.SDK_INT >= 30) {
            AppCompatEditText searchInput = getBinding().dialogSearchBarView.getSearchInput();
            searchInput.setWindowInsetsAnimationCallback(new DialogSearchTopFiltersFragment$setUpKeyboardAnimationCallback$1$1(searchInput, this));
        }
    }

    private final void setupBackButtonNavigation() {
        androidx.activity.J onBackPressedDispatcher;
        r activity = getActivity();
        if (activity == null || (onBackPressedDispatcher = activity.getOnBackPressedDispatcher()) == null) {
            return;
        }
        J viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        onBackPressedDispatcher.h(viewLifecycleOwner, this.onBackPressedListener);
    }

    private final void setupFilterIcon(IndicatorDTO indicatorDTO, IconButtonV3DTO iconDTO) {
        DialogSearchBarView dialogSearchBarView = getBinding().dialogSearchBarView;
        dialogSearchBarView.getFilterIcon().bindFilterIcon(indicatorDTO, iconDTO, this.actionHandler);
        dialogSearchBarView.getActiveFilterIcon().bindFilterIcon(indicatorDTO, iconDTO, this.actionHandler);
        disableFilterButtons(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showShimmer() {
        FragmentDialogSearchCoordinatorBinding binding = getBinding();
        FragmentContainerView composerContainer = binding.composerContainer;
        Intrinsics.checkNotNullExpressionValue(composerContainer, "composerContainer");
        composerContainer.setVisibility(8);
        DelayedVisibilityHandler delayedVisibilityHandler = this.shimmerDelayedVisibilityHandler;
        if (delayedVisibilityHandler != null) {
            delayedVisibilityHandler.show();
        }
        binding.shimmer.startAnimation();
    }

    private final void subscribeInsertNestedWidgets() {
        InterfaceC2395h<l> nestedWidgetsFlow;
        InterfaceC2395h o11;
        clearNestedWidgetJob();
        DialogSearchViewModel dialogSearchViewModel = this.viewModel;
        B0 b02 = null;
        if (dialogSearchViewModel != null && (nestedWidgetsFlow = dialogSearchViewModel.getNestedWidgetsFlow()) != null && (o11 = C2399j.o(nestedWidgetsFlow)) != null) {
            b02 = C2399j.C(new C2408n0(o11, new DialogSearchTopFiltersFragment$subscribeInsertNestedWidgets$1(this, null)), K.a(this));
        }
        this.nestedWidgetsJob = b02;
    }

    private final void subscribePageRefreshModel() {
        InterfaceC2395h<PageRefreshState> pageRefreshModelFlow;
        B0 b02 = this.subscriptionPageRefreshJob;
        B0 b03 = null;
        if (b02 != null) {
            b02.j(null);
        }
        DialogSearchViewModel dialogSearchViewModel = this.viewModel;
        if (dialogSearchViewModel != null && (pageRefreshModelFlow = dialogSearchViewModel.getPageRefreshModelFlow()) != null) {
            C2408n0 c2408n0 = new C2408n0(pageRefreshModelFlow, new DialogSearchTopFiltersFragment$subscribePageRefreshModel$1(this, null));
            J viewLifecycleOwner = getViewLifecycleOwner();
            Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
            b03 = C2399j.C(c2408n0, K.a(viewLifecycleOwner));
        }
        this.subscriptionPageRefreshJob = b03;
    }

    private final void subscribeSearchBarModel() {
        InterfaceC2395h<DialogSearchBarVO> searchBarModelFlow;
        DialogSearchViewModel dialogSearchViewModel = this.viewModel;
        if (dialogSearchViewModel == null || (searchBarModelFlow = dialogSearchViewModel.getSearchBarModelFlow()) == null) {
            return;
        }
        C2399j.C(new C2408n0(searchBarModelFlow, new DialogSearchTopFiltersFragment$subscribeSearchBarModel$1(this, null)), K.a(this));
    }

    private final void subscribeSearchInputState() {
        M0<Boolean> searchInputDisableState;
        DialogSearchViewModel dialogSearchViewModel = this.viewModel;
        if (dialogSearchViewModel == null || (searchInputDisableState = dialogSearchViewModel.getSearchInputDisableState()) == null) {
            return;
        }
        C2408n0 c2408n0 = new C2408n0(searchInputDisableState, new DialogSearchTopFiltersFragment$subscribeSearchInputState$1(this, null));
        J viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        C2399j.C(c2408n0, K.a(viewLifecycleOwner));
    }

    private final void subscribeTapTagQuery() {
        InterfaceC2395h<String> tapTagQueryFlow;
        DialogSearchViewModel dialogSearchViewModel = this.viewModel;
        if (dialogSearchViewModel == null || (tapTagQueryFlow = dialogSearchViewModel.getTapTagQueryFlow()) == null) {
            return;
        }
        C2408n0 c2408n0 = new C2408n0(tapTagQueryFlow, new DialogSearchTopFiltersFragment$subscribeTapTagQuery$1(this, null));
        J viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        C2399j.C(c2408n0, K.a(viewLifecycleOwner));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void toggleKeyboard(EditText editText) {
        editText.clearFocus();
        KeyboardUtilsKt.hideKeyboard(editText);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean touchListener$lambda$1(DialogSearchTopFiltersFragment dialogSearchTopFiltersFragment, View view, MotionEvent motionEvent) {
        KeyboardUtilsKt.hideKeyboard(dialogSearchTopFiltersFragment.getBinding().dialogSearchBarView.getSearchInput());
        return false;
    }

    private final void trackNonViewEvent(t event) {
        WZ.l lVar;
        if (event == null || (lVar = this.tokenizedAnalytics) == null) {
            return;
        }
        TokenizedAnalyticsExtensionsKt.processClickEvents$default(lVar, event, null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void trackViewEvent(t event) {
        WZ.l lVar;
        if (event == null || (lVar = this.tokenizedAnalytics) == null) {
            return;
        }
        TokenizedAnalyticsExtensionsKt.processViewEvents$default(lVar, event, null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateSearchBar(DialogSearchBarVO model) {
        Editable text;
        Integer maxRows;
        DialogSearchBarView dialogSearchBarView = getBinding().dialogSearchBarView;
        AppCompatEditText searchInput = dialogSearchBarView.getSearchInput();
        DialogSearchBarVO.ReturnKeyInfoVO returnKey = model.getReturnKey();
        setReturnKeyType(searchInput, returnKey != null ? returnKey.getType() : null);
        dialogSearchBarView.getSearchInput().setOnEditorActionListener(this);
        if (isNeedToSetInputFromModel(model.getInputText())) {
            setTextWithSelection(dialogSearchBarView.getSearchInput(), model.getInputText());
        }
        updateSearchBarPaddings(model.getSearchBarStyles());
        dialogSearchBarView.bindRightButton(model.getRightButton(), this.actionHandler);
        DialogSearchBarVO.TagsListVO usedTags = model.getUsedTags();
        setFilters(usedTags != null ? usedTags.getItems() : null);
        DialogSearchBarVO.TapTagOptionsVO tapTagOptions = model.getTapTagOptions();
        updateTapTagsMaxRows((tapTagOptions == null || (maxRows = tapTagOptions.getMaxRows()) == null) ? 3 : maxRows.intValue());
        DialogSearchBarVO.TapTagOptionsVO tapTagOptions2 = model.getTapTagOptions();
        setTapTags(tapTagOptions2 != null ? tapTagOptions2.getItems() : null);
        DialogSearchBarVO.AllFiltersButtonVO allFilters = model.getAllFilters();
        IndicatorDTO indicator = allFilters != null ? allFilters.getIndicator() : null;
        DialogSearchBarVO.AllFiltersButtonVO allFilters2 = model.getAllFilters();
        setupFilterIcon(indicator, allFilters2 != null ? allFilters2.getButton() : null);
        IconButtonV3View clearIcon = dialogSearchBarView.getClearIcon();
        Editable text2 = dialogSearchBarView.getSearchInput().getText();
        clearIcon.setVisibility(!(text2 == null || text2.length() == 0) ? 0 : 8);
        DialogSearchBarView.changeVisibilityGradientForEndInput$default(dialogSearchBarView, false, 1, null);
        if (!this.wasTextAlreadySet && !hasSuggestionsInBackstack() && (text = dialogSearchBarView.getSearchInput().getText()) != null && text.length() == 0) {
            dialogSearchBarView.getSearchInput().requestFocus();
            KeyboardUtilsKt.showKeyboard(dialogSearchBarView.getSearchInput());
        }
        dialogSearchBarView.getSearchInput().setHint(model.getPlaceholder());
        this.wasTextAlreadySet = true;
    }

    private final void updateSearchBarPaddings(DialogSearchBarDTO.SearchBarStyles searchBarStyles) {
        DialogSearchBarDTO.SearchPaddings paddings;
        Paddings bottomPadding;
        FragmentDialogSearchCoordinatorBinding binding = getBinding();
        int px = (searchBarStyles == null || (paddings = searchBarStyles.getPaddings()) == null || (bottomPadding = paddings.getBottomPadding()) == null) ? defaultSearchBottomPadding : ResourceExtKt.toPx(bottomPadding.getPx());
        if (binding.dialogSearchBarContainer.getPaddingBottom() != px) {
            FrameLayout dialogSearchBarContainer = binding.dialogSearchBarContainer;
            Intrinsics.checkNotNullExpressionValue(dialogSearchBarContainer, "dialogSearchBarContainer");
            dialogSearchBarContainer.setPadding(dialogSearchBarContainer.getPaddingLeft(), dialogSearchBarContainer.getPaddingTop(), dialogSearchBarContainer.getPaddingRight(), px);
        }
    }

    private final void updateTapTagsMaxRows(final int maxRow) {
        if (this.tapTagsMaxRows != maxRow) {
            this.tapTagsMaxRows = maxRow;
            RecyclerView recyclerView = getBinding().tapTags;
            final Context context = getContext();
            recyclerView.setLayoutManager(new FlexboxLayoutManager(context) { // from class: ru.ozon.app.android.search.dialogsearchscreen.withTopFilters.DialogSearchTopFiltersFragment$updateTapTagsMaxRows$1
                @Override // com.google.android.flexbox.FlexboxLayoutManager, com.google.android.flexbox.a
                public List<com.google.android.flexbox.c> getFlexLinesInternal() {
                    List<com.google.android.flexbox.c> flexLinesInternal = super.getFlexLinesInternal();
                    int size = flexLinesInternal.size();
                    int i11 = maxRow;
                    if (size > i11) {
                        flexLinesInternal.subList(i11, size).clear();
                    }
                    setFlexLines(flexLinesInternal);
                    return flexLinesInternal;
                }

                @Override // com.google.android.flexbox.FlexboxLayoutManager, androidx.recyclerview.widget.RecyclerView.o
                public void onLayoutChildren(RecyclerView.v recycler, RecyclerView.A state) {
                    try {
                        super.onLayoutChildren(recycler, state);
                    } catch (IndexOutOfBoundsException e11) {
                        Lm0.a.f17149a.e(e11);
                    }
                }
            });
        }
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
    public fk0.c getPrefetchViewPool() {
        CacheHolder cacheHolder = getCacheHolder();
        if (cacheHolder != null) {
            return cacheHolder.getPrefetchViewPool();
        }
        return null;
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        ComponentCallbacksC5392m g02 = getChildFragmentManager().g0("TagComposerChildFragment");
        if (g02 != null) {
            g02.onActivityResult(requestCode, resultCode, data);
        }
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    public void onAttach(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        if (NavigationComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component NavigationComponentApi is not DiComponent");
        }
        C6740b dependencyStorage = C6739a.a(context, NavigationComponentApi.class).getDependencyStorage();
        if (NavigationComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component NavigationComponentApi is not DiComponent");
        }
        this.routeFactory = ((NavigationComponentApi) dependencyStorage.b(NavigationComponentApi.class)).getRouteFactory();
        if (NavigationComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component NavigationComponentApi is not DiComponent");
        }
        C6740b dependencyStorage2 = C6739a.a(context, NavigationComponentApi.class).getDependencyStorage();
        if (NavigationComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component NavigationComponentApi is not DiComponent");
        }
        this.deeplinkHandlersCache = ((NavigationComponentApi) dependencyStorage2.b(NavigationComponentApi.class)).getDeeplinkHandlersCache();
        if (AnalyticsComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component AnalyticsComponentApi is not DiComponent");
        }
        C6740b dependencyStorage3 = C6739a.a(context, AnalyticsComponentApi.class).getDependencyStorage();
        if (AnalyticsComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component AnalyticsComponentApi is not DiComponent");
        }
        this.ozonTracker = ((AnalyticsComponentApi) dependencyStorage3.b(AnalyticsComponentApi.class)).getOzonTracker();
        if (AnalyticsScreenStorageComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component AnalyticsScreenStorageComponentApi is not DiComponent");
        }
        C6740b dependencyStorage4 = C6739a.a(context, AnalyticsScreenStorageComponentApi.class).getDependencyStorage();
        if (AnalyticsScreenStorageComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component AnalyticsScreenStorageComponentApi is not DiComponent");
        }
        this.analyticsScreenStorage = ((AnalyticsScreenStorageComponentApi) dependencyStorage4.b(AnalyticsScreenStorageComponentApi.class)).getAnalyticsScreenStorage();
        if (CustomActionHandlersComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component CustomActionHandlersComponentApi is not DiComponent");
        }
        C6740b dependencyStorage5 = C6739a.a(context, CustomActionHandlersComponentApi.class).getDependencyStorage();
        if (CustomActionHandlersComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component CustomActionHandlersComponentApi is not DiComponent");
        }
        this.customActionHandlersStoreFactory = ((CustomActionHandlersComponentApi) dependencyStorage5.b(CustomActionHandlersComponentApi.class)).getCustomActionHandlersStoreFactory();
        super.onAttach(context);
    }

    @Override // ru.ozon.app.android.composer.universalscreen.view.ComposerFragment.Host
    @InterfaceC3999a
    public void onComposerCreated(@NotNull ComponentCallbacksC5392m componentCallbacksC5392m, @NotNull ComposerFragmentController composerFragmentController) {
        ComposerFragment.Host.DefaultImpls.onComposerCreated(this, componentCallbacksC5392m, composerFragmentController);
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    @SuppressLint({"LifecycleMethodsOrder"})
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        addChildComposerFragment(savedInstanceState);
        this.suggestionsWasInBackstack = hasSuggestionsInBackstack();
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    @SuppressLint({"LifecycleMethodsOrder"})
    @NotNull
    public View onCreateView(@NotNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        FragmentDialogSearchCoordinatorBinding inflate = FragmentDialogSearchCoordinatorBinding.inflate(inflater, container, false);
        SearchShimmer searchShimmer = inflate.shimmer;
        Context requireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
        SearchSkeleton searchSkeleton = new SearchSkeleton(requireContext, null, 0, 0, true, 14, null);
        SkeletonCreator skeletonCreator = this.skeletonCreator;
        Context requireContext2 = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext2, "requireContext(...)");
        searchSkeleton.addSkeletonElements(skeletonCreator.getSkeletonElements(requireContext2));
        searchShimmer.addView(searchSkeleton);
        this._binding = inflate;
        SkeletonCreator skeletonCreator2 = this.skeletonCreator;
        SearchShimmer shimmer = getBinding().shimmer;
        Intrinsics.checkNotNullExpressionValue(shimmer, "shimmer");
        skeletonCreator2.configureShimmer(shimmer);
        SearchShimmer shimmer2 = getBinding().shimmer;
        Intrinsics.checkNotNullExpressionValue(shimmer2, "shimmer");
        this.shimmerDelayedVisibilityHandler = new DelayedVisibilityHandler(shimmer2, 0L, 2, null);
        FrameLayout constraintLayout = getBinding().getConstraintLayout();
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "getRoot(...)");
        return constraintLayout;
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    public void onDestroy() {
        super.onDestroy();
        this._binding = null;
        this.shimmerDelayedVisibilityHandler = null;
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    @SuppressLint({"LifecycleMethodsOrder"})
    public void onDestroyView() {
        super.onDestroyView();
        if (!this.suggestionsWasInBackstack) {
            hideActivityKeyboard();
            DialogSearchBarView dialogSearchBarView = getBinding().dialogSearchBarView;
            dialogSearchBarView.clearFocus();
            KeyboardUtilsKt.hideKeyboard(dialogSearchBarView.getSearchInput());
        }
        this.screenContainer = null;
        B0 b02 = this.subscriptionPageRefreshJob;
        if (b02 != null) {
            b02.j(null);
        }
        this.subscriptionPageRefreshJob = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v2, types: [kotlin.jvm.internal.DefaultConstructorMarker] */
    /* JADX WARN: Type inference failed for: r6v8 */
    @Override // android.widget.TextView.OnEditorActionListener
    public boolean onEditorAction(TextView view, int actionId, KeyEvent event) {
        boolean z11 = false;
        if (actionId == 3 || actionId == 6) {
            DialogSearchViewModel dialogSearchViewModel = this.viewModel;
            String str = 0;
            trackNonViewEvent(dialogSearchViewModel != null ? dialogSearchViewModel.getReturnKeyEvent() : null);
            DialogSearchViewModel dialogSearchViewModel2 = this.viewModel;
            if (dialogSearchViewModel2 != null) {
                String refreshUrlByEnter = dialogSearchViewModel2.getRefreshUrlByEnter(String.valueOf(view != null ? view.getText() : null));
                if (refreshUrlByEnter != null) {
                    refreshPage(new PageRefreshState(refreshUrlByEnter, z11, 2, str), false);
                    KeyboardUtilsKt.toggleKeyboard(this);
                }
            }
            DialogSearchViewModel dialogSearchViewModel3 = this.viewModel;
            if (dialogSearchViewModel3 != null) {
                ru.ozon.app.android.search.widgets.dialogSearchBar.data.api.ActionType actionType = ru.ozon.app.android.search.widgets.dialogSearchBar.data.api.ActionType.ENTER;
                if (dialogSearchViewModel3 != null) {
                    str = dialogSearchViewModel3.getEnterUrl(String.valueOf(view != null ? view.getText() : null));
                }
                dialogSearchViewModel3.sendInteraction(actionType, str);
            }
        }
        return false;
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    @SuppressLint({"LifecycleMethodsOrder"})
    public void onPause() {
        super.onPause();
        saveCollapsingState();
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    @SuppressLint({"LifecycleMethodsOrder"})
    public void onViewCreated(@NotNull View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        setupBackButtonNavigation();
        DialogSearchBarView dialogSearchBarView = getBinding().dialogSearchBarView;
        Intrinsics.f(dialogSearchBarView);
        setInitialSearchBarHint(dialogSearchBarView);
        setClearButtonClickListener(dialogSearchBarView);
        setBackButtonClickListener(dialogSearchBarView);
        dialogSearchBarView.getSearchInput().setOnFocusChangeListener(this.onFocusChangedListener);
        dialogSearchBarView.playArrowAnimation(!this.wasTextAlreadySet);
    }

    @Override // ru.ozon.app.android.composer.universalscreen.view.ComposerFragment.Host
    public void onComposerCreated(@NotNull ComponentCallbacksC5392m fragment, @NotNull ComposerFragmentController composer, i composerContainer) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        Intrinsics.checkNotNullParameter(composer, "composer");
        this.composerFragmentController = composer;
        this.references = composer.getReferences();
        if (composerContainer == null) {
            return;
        }
        this.screenContainer = composerContainer;
        this.composerStore = composer.getComposerStore();
        ComposerReferences composerReferences = this.references;
        if (composerReferences == null) {
            Intrinsics.n("references");
            throw null;
        }
        final DialogSearchBarComponent dialogSearchBarComponent = (DialogSearchBarComponent) composerReferences.getWidgetComponent(DialogSearchBarComponent.class);
        ComposerReferences composerReferences2 = this.references;
        if (composerReferences2 == null) {
            Intrinsics.n("references");
            throw null;
        }
        this.filtersSharedViewModel = (FilterSharedViewModel) new z0(composerReferences2.getViewModelOwnerProvider().b(), new z0.c() { // from class: ru.ozon.app.android.search.dialogsearchscreen.withTopFilters.DialogSearchTopFiltersFragment$onComposerCreated$$inlined$sharedViewModel$1
            @Override // androidx.lifecycle.z0.c, androidx.lifecycle.z0.b
            public <T extends w0> T create(Class<T> modelClass) {
                Intrinsics.checkNotNullParameter(modelClass, "modelClass");
                FilterSharedViewModel filterSharedViewModel = DialogSearchBarComponent.this.getFilterSharedViewModel();
                Intrinsics.g(filterSharedViewModel, "null cannot be cast to non-null type T of ru.ozon.app.android.utils.lifecycle.ViewModelExtKt.vmFactory.<no name provided>.create");
                return filterSharedViewModel;
            }
        }).a(FilterSharedViewModel.class);
        this.viewModel = dialogSearchBarComponent.getViewModel();
        this.featureChecker = dialogSearchBarComponent.getFeatureChecker();
        ComposerReferences composerReferences3 = this.references;
        if (composerReferences3 == null) {
            Intrinsics.n("references");
            throw null;
        }
        this.clearSearchTextViewModel = (ClearSearchTextViewModel) new z0(composerReferences3.getViewModelOwnerProvider().b(), new z0.c() { // from class: ru.ozon.app.android.search.dialogsearchscreen.withTopFilters.DialogSearchTopFiltersFragment$onComposerCreated$$inlined$sharedViewModel$2
            @Override // androidx.lifecycle.z0.c, androidx.lifecycle.z0.b
            public <T extends w0> T create(Class<T> modelClass) {
                Intrinsics.checkNotNullParameter(modelClass, "modelClass");
                ClearSearchTextViewModel clearSearchTextViewModel = DialogSearchBarComponent.this.getClearSearchTextViewModel();
                Intrinsics.g(clearSearchTextViewModel, "null cannot be cast to non-null type T of ru.ozon.app.android.utils.lifecycle.ViewModelExtKt.vmFactory.<no name provided>.create");
                return clearSearchTextViewModel;
            }
        }).a(ClearSearchTextViewModel.class);
        this.tokenizedAnalytics = dialogSearchBarComponent.getTokenizedAnalytics();
        this.searchUrlPrefetchService = dialogSearchBarComponent.getSearchUrlPrefetchService();
        Function1<AtomAction, Unit> buildHandler = new ActionHandler.Builder(composer.getReferences(), composer.getComposerOverlayItemsHelper(), DialogSearchBarVO.class).onPreProcess(new DialogSearchTopFiltersFragment$onComposerCreated$3(this)).customActionHandlers(new DialogSearchTopFiltersFragment$onComposerCreated$4(this)).buildHandler();
        SearchUrlPrefetchService searchUrlPrefetchService = this.searchUrlPrefetchService;
        if (searchUrlPrefetchService == null) {
            Intrinsics.n("searchUrlPrefetchService");
            throw null;
        }
        FeatureChecker featureChecker = this.featureChecker;
        boolean z11 = false;
        this.tapTagsAdapter = new DialogTapTagsAdapter(buildHandler, searchUrlPrefetchService, featureChecker != null && featureChecker.isEnabled(RedesignedSearchBarEnabled.INSTANCE));
        this.filtersAdapter = new DialogFilterTagsAdapter(buildHandler);
        this.actionHandler = buildHandler;
        View view = fragment.getView();
        if (view != null) {
            AppBarLayout composerAppbar = ComposerViewExtensionKt.composerAppbar(view);
            if (composerAppbar != null) {
                ViewExtKt.gone(composerAppbar);
            }
            Toolbar composerToolbar = ComposerViewExtensionKt.composerToolbar(view);
            if (composerToolbar != null) {
                ViewGroup.LayoutParams layoutParams = composerToolbar.getLayoutParams();
                if (layoutParams == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                }
                layoutParams.height = 0;
                composerToolbar.setLayoutParams(layoutParams);
            }
            ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
            if (layoutParams2 == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            }
            layoutParams2.width = -1;
            layoutParams2.height = -1;
            view.setLayoutParams(layoutParams2);
        }
        observeLifecycleContainer();
        DialogSearchViewModel dialogSearchViewModel = this.viewModel;
        if (dialogSearchViewModel != null) {
            dialogSearchViewModel.subscribeSearchValue();
        }
        subscribeSearchBarModel();
        subscribeInsertNestedWidgets();
        subscribePageRefreshModel();
        subscribeTapTagQuery();
        subscribeSearchInputState();
        FragmentDialogSearchCoordinatorBinding binding = getBinding();
        binding.dialogSearchBarView.getFilterTags().setAdapter(this.filtersAdapter);
        binding.tapTags.setAdapter(this.tapTagsAdapter);
        binding.tapTags.setItemAnimator(null);
        FeatureChecker featureChecker2 = this.featureChecker;
        if (featureChecker2 != null && featureChecker2.isEnabled(RedesignedSearchBarEnabled.INSTANCE)) {
            DialogSearchBarView dialogSearchBarView = binding.dialogSearchBarView;
            Intrinsics.checkNotNullExpressionValue(dialogSearchBarView, "dialogSearchBarView");
            applySearchBarRedesign(dialogSearchBarView);
        }
        FragmentContainerView composerContainer2 = getBinding().composerContainer;
        Intrinsics.checkNotNullExpressionValue(composerContainer2, "composerContainer");
        RecyclerView composerRecyclerViewOrNull = ComposerViewExtensionKt.composerRecyclerViewOrNull(composerContainer2);
        if (composerRecyclerViewOrNull != null) {
            composerRecyclerViewOrNull.setPadding(composerRecyclerViewOrNull.getPaddingLeft(), ResourceExtKt.toPx(26), composerRecyclerViewOrNull.getPaddingRight(), composerRecyclerViewOrNull.getPaddingBottom());
        }
        observeComposerStateAndEvents(composer);
        View view2 = fragment.getView();
        if (view2 != null) {
            int color = androidx.core.content.a.getColor(requireContext(), R$color.transparent);
            ComposerViewExtensionKt.composerContainer(view2).setBackgroundColor(color);
            RecyclerView composerRecyclerView = ComposerViewExtensionKt.composerRecyclerView(view2);
            composerRecyclerView.setBackgroundColor(color);
            composerRecyclerView.setClipToPadding(false);
            composerRecyclerView.setOverScrollMode(2);
        }
        FragmentDialogSearchCoordinatorBinding fragmentDialogSearchCoordinatorBinding = this._binding;
        FeatureChecker featureChecker3 = this.featureChecker;
        if (featureChecker3 != null && featureChecker3.isEnabled(RedesignedSearchBarEnabled.INSTANCE)) {
            z11 = true;
        }
        CollapsingCoordinatorImpl collapsingCoordinatorImpl = new CollapsingCoordinatorImpl(fragmentDialogSearchCoordinatorBinding, z11);
        collapsingCoordinatorImpl.configAppBar();
        collapsingCoordinatorImpl.setSearchMaxLines(1);
        collapsingCoordinatorImpl.subscribeSearchBarHeightChanges();
        collapsingCoordinatorImpl.subscribeTapTagsHeightChanges();
        collapsingCoordinatorImpl.hideFilters();
        DialogSearchViewModel dialogSearchViewModel2 = this.viewModel;
        collapsingCoordinatorImpl.restoreCollapsingState(dialogSearchViewModel2 != null ? dialogSearchViewModel2.getCollapsingState() : null);
        collapsingCoordinatorImpl.restoreCollapsingUi();
        this.collapsingCoordinator = collapsingCoordinatorImpl;
        this.mHandler.post(new V(this, 4));
    }
}
