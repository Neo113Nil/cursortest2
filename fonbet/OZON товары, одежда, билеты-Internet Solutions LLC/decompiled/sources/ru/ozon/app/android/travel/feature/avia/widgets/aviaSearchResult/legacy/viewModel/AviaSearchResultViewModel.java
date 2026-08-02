package ru.ozon.app.android.travel.feature.avia.widgets.aviaSearchResult.legacy.viewModel;

import AW.d;
import B0.C2454a;
import BF.b;
import Bc.m;
import Bc.r;
import DM.c;
import DM.f;
import DM.g;
import DM.h;
import DM.i;
import DM.j;
import Ec.e;
import Pk0.a;
import WZ.t;
import androidx.lifecycle.C5415f;
import androidx.lifecycle.P;
import androidx.lifecycle.V;
import androidx.lifecycle.w0;
import androidx.lifecycle.x0;
import h3.C6788a;
import io.reactivex.C;
import io.reactivex.y;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.collections.K;
import kotlin.collections.U;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import mc.C8125a;
import nc.C8486a;
import org.jetbrains.annotations.NotNull;
import qc.InterfaceC9019a;
import ru.ozon.app.android.action.v2.ActionV2Repository;
import ru.ozon.app.android.action.v2.models.ActionV2Request;
import ru.ozon.app.android.logger.LoggerExtKt;
import ru.ozon.app.android.travel.feature.avia.widgets.aviaSearchResult.legacy.data.AviaSearchResultV3DTO;
import ru.ozon.app.android.travel.feature.avia.widgets.aviaSearchResult.legacy.data.v3.AviaSearchResultApi;
import ru.ozon.app.android.travel.feature.avia.widgets.aviaSearchResult.legacy.data.v3.AviaSearchResultV3Mapper;
import ru.ozon.app.android.travel.feature.avia.widgets.aviaSearchResult.legacy.data.v3.AviaSearchV3SelectLuggageResponse;
import ru.ozon.app.android.travel.feature.avia.widgets.aviaSearchResult.legacy.presentation.AviaSearchResultVO;
import ru.ozon.app.android.travel.feature.avia.widgets.aviaSearchResult.legacy.viewModel.AviaSearchResultViewModel;
import ru.ozon.app.android.travel.molecules.view.dropDownBanner.DropDownBannerVO;
import ru.ozon.app.android.travel.molecules.view.errorState.ErrorStateVO;
import ru.ozon.app.android.travel.molecules.view.searchPreloader.animator.SearchPreloaderAnimator;
import ru.ozon.app.android.utils.livedata.SingleLiveEvent;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import sc.C9656b;
import tc.InterfaceC9800b;
import wc.C10479H;
import wc.C10493n;
import wc.C10495p;
import wc.v;
import xe.B0;
import xe.C10720e0;
import xe.C10727i;

@Metadata(d1 = {"\u0000þ\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0001\u0018\u00002\u00020\u0001:\b\u0093\u0001\u0094\u0001\u0095\u0001\u0096\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0014¢\u0006\u0004\b\r\u0010\u000eJ\u0013\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0013\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u000f¢\u0006\u0004\b\u0014\u0010\u0012J\u0015\u0010\u0016\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00150\u000f¢\u0006\u0004\b\u0016\u0010\u0012J\u0013\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u000f¢\u0006\u0004\b\u0018\u0010\u0012J\u0013\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u000f¢\u0006\u0004\b\u001a\u0010\u0012J\u0013\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00190\u000f¢\u0006\u0004\b\u001b\u0010\u0012J\u0013\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00190\u000f¢\u0006\u0004\b\u001c\u0010\u0012J\u0013\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00190\u000f¢\u0006\u0004\b\u001d\u0010\u0012J\u0013\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0\u000f¢\u0006\u0004\b\u001f\u0010\u0012J\u0013\u0010!\u001a\b\u0012\u0004\u0012\u00020 0\u000f¢\u0006\u0004\b!\u0010\u0012J\u0013\u0010\"\u001a\b\u0012\u0004\u0012\u00020\f0\u000f¢\u0006\u0004\b\"\u0010\u0012J\u0013\u0010$\u001a\b\u0012\u0004\u0012\u00020#0\u000f¢\u0006\u0004\b$\u0010\u0012J\u0013\u0010&\u001a\b\u0012\u0004\u0012\u00020%0\u000f¢\u0006\u0004\b&\u0010\u0012J\u0013\u0010(\u001a\b\u0012\u0004\u0012\u00020'0\u000f¢\u0006\u0004\b(\u0010\u0012J\u0013\u0010)\u001a\b\u0012\u0004\u0012\u00020 0\u000f¢\u0006\u0004\b)\u0010\u0012J\u0015\u0010,\u001a\u00020\f2\u0006\u0010+\u001a\u00020*¢\u0006\u0004\b,\u0010-J\r\u0010.\u001a\u00020\f¢\u0006\u0004\b.\u0010\u000eJ\u001f\u00102\u001a\u00020\f2\b\u00100\u001a\u0004\u0018\u00010/2\u0006\u00101\u001a\u00020\u0017¢\u0006\u0004\b2\u00103J-\u00107\u001a\u00020\f2\b\u00104\u001a\u0004\u0018\u00010%2\u0014\u00106\u001a\u0010\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020%\u0018\u000105¢\u0006\u0004\b7\u00108J\r\u00109\u001a\u00020\f¢\u0006\u0004\b9\u0010\u000eJ\u001f\u0010;\u001a\u00020\f2\u0006\u0010:\u001a\u00020\u00192\b\u00100\u001a\u0004\u0018\u00010 ¢\u0006\u0004\b;\u0010<J\u0015\u0010?\u001a\u00020\f2\u0006\u0010>\u001a\u00020=¢\u0006\u0004\b?\u0010@J!\u0010E\u001a\u00020\f2\n\u0010C\u001a\u00060Aj\u0002`B2\u0006\u0010D\u001a\u00020=¢\u0006\u0004\bE\u0010FJ\u001d\u0010H\u001a\u00020\f2\u0006\u00100\u001a\u00020G2\u0006\u0010D\u001a\u00020=¢\u0006\u0004\bH\u0010IJ\u0015\u0010K\u001a\u00020\f2\u0006\u0010J\u001a\u00020=¢\u0006\u0004\bK\u0010@J\r\u0010L\u001a\u00020\f¢\u0006\u0004\bL\u0010\u000eJ'\u0010R\u001a\f\u0012\b\u0012\u00060Pj\u0002`Q0O2\u0006\u0010M\u001a\u00020=2\u0006\u0010N\u001a\u00020=¢\u0006\u0004\bR\u0010SJ'\u0010V\u001a\b\u0012\u0004\u0012\u00020U0T*\b\u0012\u0004\u0012\u00020U0T2\u0006\u0010:\u001a\u00020\u0019H\u0002¢\u0006\u0004\bV\u0010WJ\u0017\u0010Y\u001a\u00020\u00192\u0006\u0010X\u001a\u00020*H\u0002¢\u0006\u0004\bY\u0010ZJ\u0017\u0010[\u001a\u00020\f2\u0006\u0010+\u001a\u00020*H\u0002¢\u0006\u0004\b[\u0010-J\u000f\u0010\\\u001a\u00020\fH\u0002¢\u0006\u0004\b\\\u0010\u000eJe\u0010f\u001a\u00020\f\"\u0004\b\u0000\u0010]\"\u0004\b\u0001\u0010^2\f\u0010`\u001a\b\u0012\u0004\u0012\u00028\u00000_2\u0012\u0010b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010a2\u0012\u0010c\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\f0a2\u0012\u0010e\u001a\u000e\u0012\u0004\u0012\u00020d\u0012\u0004\u0012\u00020\f0aH\u0002¢\u0006\u0004\bf\u0010gJ\u001f\u0010j\u001a\u00020\f2\u0006\u0010h\u001a\u00020U2\u0006\u0010i\u001a\u00020\u0019H\u0002¢\u0006\u0004\bj\u0010kJ\u0019\u0010m\u001a\u00020\f2\b\u0010l\u001a\u0004\u0018\u00010\u0015H\u0002¢\u0006\u0004\bm\u0010nJ\u000f\u0010o\u001a\u00020\fH\u0002¢\u0006\u0004\bo\u0010\u000eJ\u000f\u0010p\u001a\u00020\fH\u0002¢\u0006\u0004\bp\u0010\u000eJ\u000f\u0010q\u001a\u00020\fH\u0002¢\u0006\u0004\bq\u0010\u000eJ\u000f\u0010r\u001a\u00020\fH\u0002¢\u0006\u0004\br\u0010\u000eJ\u000f\u0010s\u001a\u00020\fH\u0002¢\u0006\u0004\bs\u0010\u000eJ\u000f\u0010t\u001a\u00020\fH\u0002¢\u0006\u0004\bt\u0010\u000eJ\u000f\u0010u\u001a\u00020\fH\u0002¢\u0006\u0004\bu\u0010\u000eJ\u000f\u0010v\u001a\u00020\fH\u0002¢\u0006\u0004\bv\u0010\u000eJ\u000f\u0010w\u001a\u00020\fH\u0002¢\u0006\u0004\bw\u0010\u000eJ\u000f\u0010x\u001a\u00020\fH\u0002¢\u0006\u0004\bx\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010yR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010zR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010{R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010|R\u0014\u0010~\u001a\u00020}8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b~\u0010\u007fR\u0016\u0010\u0080\u0001\u001a\u00020}8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0080\u0001\u0010\u007fR\u001c\u0010\u0011\u001a\t\u0012\u0004\u0012\u00020\u00100\u0081\u00018\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0011\u0010\u0082\u0001R\u001c\u0010\u0014\u001a\t\u0012\u0004\u0012\u00020\u00130\u0083\u00018\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0014\u0010\u0084\u0001R\u001e\u0010\u0016\u001a\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u00150\u0083\u00018\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0016\u0010\u0084\u0001R\u001c\u0010\u0018\u001a\t\u0012\u0004\u0012\u00020\u00170\u0083\u00018\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0018\u0010\u0084\u0001R\u001c\u0010\u001a\u001a\t\u0012\u0004\u0012\u00020\u00190\u0083\u00018\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u001a\u0010\u0084\u0001R\u001c\u0010\u001b\u001a\t\u0012\u0004\u0012\u00020\u00190\u0083\u00018\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u001b\u0010\u0084\u0001R\u001c\u0010\u001c\u001a\t\u0012\u0004\u0012\u00020\u00190\u0083\u00018\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u001c\u0010\u0084\u0001R\u001c\u0010\u001d\u001a\t\u0012\u0004\u0012\u00020\u00190\u0083\u00018\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u001d\u0010\u0084\u0001R\u001c\u0010\u001f\u001a\t\u0012\u0004\u0012\u00020\u001e0\u0081\u00018\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u001f\u0010\u0082\u0001R\u001c\u0010!\u001a\t\u0012\u0004\u0012\u00020 0\u0081\u00018\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b!\u0010\u0082\u0001R\u001c\u0010$\u001a\t\u0012\u0004\u0012\u00020#0\u0081\u00018\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b$\u0010\u0082\u0001R\u001c\u0010\"\u001a\t\u0012\u0004\u0012\u00020\f0\u0081\u00018\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\"\u0010\u0082\u0001R\u001c\u0010)\u001a\t\u0012\u0004\u0012\u00020 0\u0081\u00018\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b)\u0010\u0082\u0001R\u0019\u0010\u0085\u0001\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0085\u0001\u0010\u0086\u0001R\u0019\u0010\u0087\u0001\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0087\u0001\u0010\u0086\u0001R\u0019\u0010\u0088\u0001\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0088\u0001\u0010\u0086\u0001R\u0019\u0010\u0089\u0001\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0089\u0001\u0010\u0086\u0001R\u0019\u0010\u008a\u0001\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008a\u0001\u0010\u0086\u0001R\"\u0010\u008c\u0001\u001a\u000b\u0012\u0004\u0012\u00020\f\u0018\u00010\u008b\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008c\u0001\u0010\u008d\u0001R\u001c\u0010\u008f\u0001\u001a\u0005\u0018\u00010\u008e\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008f\u0001\u0010\u0090\u0001R\u0019\u0010\u0091\u0001\u001a\u00020*8\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\b\u0091\u0001\u0010\u0092\u0001¨\u0006\u0097\u0001"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/aviaSearchResult/legacy/viewModel/AviaSearchResultViewModel;", "Landroidx/lifecycle/w0;", "Lru/ozon/app/android/travel/feature/avia/widgets/aviaSearchResult/legacy/data/v3/AviaSearchResultApi;", "api", "Lru/ozon/app/android/action/v2/ActionV2Repository;", "actionRepository", "Lru/ozon/app/android/travel/feature/avia/widgets/aviaSearchResult/legacy/data/v3/AviaSearchResultV3Mapper;", "mapperV3", "Lru/ozon/app/android/travel/molecules/view/searchPreloader/animator/SearchPreloaderAnimator;", "preloaderAnimator", "<init>", "(Lru/ozon/app/android/travel/feature/avia/widgets/aviaSearchResult/legacy/data/v3/AviaSearchResultApi;Lru/ozon/app/android/action/v2/ActionV2Repository;Lru/ozon/app/android/travel/feature/avia/widgets/aviaSearchResult/legacy/data/v3/AviaSearchResultV3Mapper;Lru/ozon/app/android/travel/molecules/view/searchPreloader/animator/SearchPreloaderAnimator;)V", "", "onCleared", "()V", "Landroidx/lifecycle/P;", "Lru/ozon/app/android/travel/feature/avia/widgets/aviaSearchResult/legacy/viewModel/AviaSearchResultViewModel$UpdateVoResult;", "updateVoLiveData", "()Landroidx/lifecycle/P;", "Lru/ozon/app/android/travel/feature/avia/widgets/aviaSearchResult/legacy/viewModel/AviaSearchResultViewModel$Result;", "resultLiveData", "Lru/ozon/app/android/travel/molecules/view/errorState/ErrorStateVO;", "errorLiveData", "", "timerLiveData", "", "quickFiltersSkeletonLiveData", "progressBarLiveData", "skeletonLiveData", "contentVisibilityLiveData", "Lru/ozon/app/android/travel/feature/avia/widgets/aviaSearchResult/legacy/viewModel/AviaSearchResultViewModel$ItemUpdateResult;", "itemUpdateLiveData", "Lru/ozon/uni/atoms/af/AtomAction;", "actionSuccessLiveData", "actionErrorLiveData", "Lru/ozon/app/android/travel/feature/avia/widgets/aviaSearchResult/legacy/viewModel/AviaSearchResultViewModel$TrackingData;", "trackingLiveData", "", "preloaderTitleLiveData", "", "preloaderProgressLiveData", "toggleActionLiveData", "Lru/ozon/app/android/travel/feature/avia/widgets/aviaSearchResult/legacy/presentation/AviaSearchResultVO;", "vo", "initialize", "(Lru/ozon/app/android/travel/feature/avia/widgets/aviaSearchResult/legacy/presentation/AviaSearchResultVO;)V", "onMoveActionPreProcess", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "action", "itemId", "selectLuggage", "(Lru/ozon/uni/atoms/data/AtomActionDTO;J)V", "actionName", "", "params", "performAction", "(Ljava/lang/String;Ljava/util/Map;)V", "onTimerWentOff", "isBonusPay", "changeBonusStateUpdate", "(ZLru/ozon/uni/atoms/af/AtomAction;)V", "", "lastVisibleItemPosition", "loadNextPage", "(I)V", "Lru/ozon/app/android/travel/feature/avia/widgets/aviaSearchResult/legacy/presentation/AviaSearchResultVO$AviaSearchResultItemVO$DropDownBannerItem;", "Lru/ozon/app/android/travel/feature/avia/widgets/aviaSearchResult/legacy/presentation/adapter/DropDownBannerItem;", "dropDownItem", "position", "onDropDownBannerClicked", "(Lru/ozon/app/android/travel/feature/avia/widgets/aviaSearchResult/legacy/presentation/AviaSearchResultVO$AviaSearchResultItemVO$DropDownBannerItem;I)V", "Lru/ozon/uni/atoms/af/AtomAction$ComposerAction;", "onBannerClicked", "(Lru/ozon/uni/atoms/af/AtomAction$ComposerAction;I)V", "width", "startPreloaderAnimation", "stopPreloaderAnimation", "from", "to", "", "LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "getEventsByRange", "(II)Ljava/util/List;", "", "Lru/ozon/app/android/travel/feature/avia/widgets/aviaSearchResult/legacy/presentation/AviaSearchResultVO$AviaSearchResultItemVO;", "applyBonusPayState", "(Ljava/util/List;Z)Ljava/util/List;", "newVo", "isAlreadyPolling", "(Lru/ozon/app/android/travel/feature/avia/widgets/aviaSearchResult/legacy/presentation/AviaSearchResultVO;)Z", "saveInitialViewObject", "pollFlights", "T", "R", "Lio/reactivex/y;", "source", "Lkotlin/Function1;", "mapper", "onSuccess", "", "onError", "handleAction", "(Lio/reactivex/y;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "item", "shouldShowError", "updateItem", "(Lru/ozon/app/android/travel/feature/avia/widgets/aviaSearchResult/legacy/presentation/AviaSearchResultVO$AviaSearchResultItemVO;Z)V", "error", "showError", "(Lru/ozon/app/android/travel/molecules/view/errorState/ErrorStateVO;)V", "hideError", "showContent", "hideContent", "showQuickFiltersSkeleton", "hideQuickFiltersSkeleton", "showProgressBar", "hideProgressBar", "showSkeleton", "hideSkeleton", "clearAllDisposables", "Lru/ozon/app/android/travel/feature/avia/widgets/aviaSearchResult/legacy/data/v3/AviaSearchResultApi;", "Lru/ozon/app/android/action/v2/ActionV2Repository;", "Lru/ozon/app/android/travel/feature/avia/widgets/aviaSearchResult/legacy/data/v3/AviaSearchResultV3Mapper;", "Lru/ozon/app/android/travel/molecules/view/searchPreloader/animator/SearchPreloaderAnimator;", "Lnc/a;", "luggageSelectionDisposables", "Lnc/a;", "pollFlightsDisposables", "Lru/ozon/app/android/utils/livedata/SingleLiveEvent;", "Lru/ozon/app/android/utils/livedata/SingleLiveEvent;", "Landroidx/lifecycle/V;", "Landroidx/lifecycle/V;", "isUpdatingBonusPayViaAction", "Z", "isBonusPayUpdate", "isPaginationCompleted", "isLoadingNextPage", "isBonusSync", "Lkotlin/Function0;", "showProgressAction", "Lkotlin/jvm/functions/Function0;", "Lxe/B0;", "bannerJob", "Lxe/B0;", "lastVo", "Lru/ozon/app/android/travel/feature/avia/widgets/aviaSearchResult/legacy/presentation/AviaSearchResultVO;", "UpdateVoResult", "Result", "ItemUpdateResult", "TrackingData", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class AviaSearchResultViewModel extends w0 {

    @NotNull
    private final SingleLiveEvent<Unit> actionErrorLiveData;

    @NotNull
    private final ActionV2Repository actionRepository;

    @NotNull
    private final SingleLiveEvent<AtomAction> actionSuccessLiveData;

    @NotNull
    private final AviaSearchResultApi api;
    private B0 bannerJob;

    @NotNull
    private final V<Boolean> contentVisibilityLiveData;

    @NotNull
    private final V<ErrorStateVO> errorLiveData;
    private boolean isBonusPayUpdate;
    private boolean isBonusSync;
    private boolean isLoadingNextPage;
    private boolean isPaginationCompleted;
    private boolean isUpdatingBonusPayViaAction;

    @NotNull
    private final SingleLiveEvent<ItemUpdateResult> itemUpdateLiveData;
    private AviaSearchResultVO lastVo;

    @NotNull
    private final C8486a luggageSelectionDisposables;

    @NotNull
    private final AviaSearchResultV3Mapper mapperV3;

    @NotNull
    private final C8486a pollFlightsDisposables;

    @NotNull
    private final SearchPreloaderAnimator preloaderAnimator;

    @NotNull
    private final V<Boolean> progressBarLiveData;

    @NotNull
    private final V<Boolean> quickFiltersSkeletonLiveData;

    @NotNull
    private final V<Result> resultLiveData;
    private Function0<Unit> showProgressAction;

    @NotNull
    private final V<Boolean> skeletonLiveData;

    @NotNull
    private final V<Long> timerLiveData;

    @NotNull
    private final SingleLiveEvent<AtomAction> toggleActionLiveData;

    @NotNull
    private final SingleLiveEvent<TrackingData> trackingLiveData;

    @NotNull
    private final SingleLiveEvent<UpdateVoResult> updateVoLiveData;

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0011\u001a\u00020\u00072\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u001b\u0010\u0004\u001a\u00060\u0002j\u0002`\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0016\u001a\u0004\b\u0017\u0010\u000fR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/aviaSearchResult/legacy/viewModel/AviaSearchResultViewModel$ItemUpdateResult;", "", "Lru/ozon/app/android/travel/feature/avia/widgets/aviaSearchResult/legacy/presentation/AviaSearchResultVO$AviaSearchResultItemVO;", "Lru/ozon/app/android/travel/feature/avia/widgets/aviaSearchResult/legacy/presentation/adapter/AviaSearchItem;", "newItem", "", "position", "", "shouldShowError", "<init>", "(Lru/ozon/app/android/travel/feature/avia/widgets/aviaSearchResult/legacy/presentation/AviaSearchResultVO$AviaSearchResultItemVO;IZ)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/app/android/travel/feature/avia/widgets/aviaSearchResult/legacy/presentation/AviaSearchResultVO$AviaSearchResultItemVO;", "getNewItem", "()Lru/ozon/app/android/travel/feature/avia/widgets/aviaSearchResult/legacy/presentation/AviaSearchResultVO$AviaSearchResultItemVO;", "I", "getPosition", "Z", "getShouldShowError", "()Z", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ItemUpdateResult {

        @NotNull
        private final AviaSearchResultVO.AviaSearchResultItemVO newItem;
        private final int position;
        private final boolean shouldShowError;

        public ItemUpdateResult(@NotNull AviaSearchResultVO.AviaSearchResultItemVO newItem, int i11, boolean z11) {
            Intrinsics.checkNotNullParameter(newItem, "newItem");
            this.newItem = newItem;
            this.position = i11;
            this.shouldShowError = z11;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ItemUpdateResult)) {
                return false;
            }
            ItemUpdateResult itemUpdateResult = (ItemUpdateResult) other;
            return Intrinsics.d(this.newItem, itemUpdateResult.newItem) && this.position == itemUpdateResult.position && this.shouldShowError == itemUpdateResult.shouldShowError;
        }

        @NotNull
        public final AviaSearchResultVO.AviaSearchResultItemVO getNewItem() {
            return this.newItem;
        }

        public final int getPosition() {
            return this.position;
        }

        public final boolean getShouldShowError() {
            return this.shouldShowError;
        }

        public int hashCode() {
            return Boolean.hashCode(this.shouldShowError) + C2454a.a(this.position, this.newItem.hashCode() * 31, 31);
        }

        @NotNull
        public String toString() {
            AviaSearchResultVO.AviaSearchResultItemVO aviaSearchResultItemVO = this.newItem;
            int i11 = this.position;
            boolean z11 = this.shouldShowError;
            StringBuilder sb2 = new StringBuilder("ItemUpdateResult(newItem=");
            sb2.append(aviaSearchResultItemVO);
            sb2.append(", position=");
            sb2.append(i11);
            sb2.append(", shouldShowError=");
            return a.a(")", sb2, z11);
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0018\u00010\u0002j\u0004\u0018\u0001`\u0003\u0012\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u001f\u0010\u0004\u001a\n\u0018\u00010\u0002j\u0004\u0018\u0001`\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R%\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/aviaSearchResult/legacy/viewModel/AviaSearchResultViewModel$TrackingData;", "", "LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "trackingInfo", "", "", "trackingPayloads", "<init>", "(LWZ/t;Ljava/util/Map;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "LWZ/t;", "getTrackingInfo", "()LWZ/t;", "Ljava/util/Map;", "getTrackingPayloads", "()Ljava/util/Map;", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class TrackingData {
        private final t trackingInfo;
        private final Map<String, String> trackingPayloads;

        /* JADX WARN: Multi-variable type inference failed */
        public TrackingData() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof TrackingData)) {
                return false;
            }
            TrackingData trackingData = (TrackingData) other;
            return Intrinsics.d(this.trackingInfo, trackingData.trackingInfo) && Intrinsics.d(this.trackingPayloads, trackingData.trackingPayloads);
        }

        public final t getTrackingInfo() {
            return this.trackingInfo;
        }

        public final Map<String, String> getTrackingPayloads() {
            return this.trackingPayloads;
        }

        public int hashCode() {
            t tVar = this.trackingInfo;
            int hashCode = (tVar == null ? 0 : tVar.hashCode()) * 31;
            Map<String, String> map = this.trackingPayloads;
            return hashCode + (map != null ? map.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "TrackingData(trackingInfo=" + this.trackingInfo + ", trackingPayloads=" + this.trackingPayloads + ")";
        }

        public TrackingData(t tVar, Map<String, String> map) {
            this.trackingInfo = tVar;
            this.trackingPayloads = map;
        }

        public /* synthetic */ TrackingData(t tVar, Map map, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? null : tVar, (i11 & 2) != 0 ? null : map);
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u000f\u001a\u00020\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/aviaSearchResult/legacy/viewModel/AviaSearchResultViewModel$UpdateVoResult;", "", "Lru/ozon/app/android/travel/feature/avia/widgets/aviaSearchResult/legacy/presentation/AviaSearchResultVO;", "vo", "", "shouldRefresh", "<init>", "(Lru/ozon/app/android/travel/feature/avia/widgets/aviaSearchResult/legacy/presentation/AviaSearchResultVO;Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/app/android/travel/feature/avia/widgets/aviaSearchResult/legacy/presentation/AviaSearchResultVO;", "getVo", "()Lru/ozon/app/android/travel/feature/avia/widgets/aviaSearchResult/legacy/presentation/AviaSearchResultVO;", "Z", "getShouldRefresh", "()Z", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class UpdateVoResult {
        private final boolean shouldRefresh;

        @NotNull
        private final AviaSearchResultVO vo;

        public UpdateVoResult(@NotNull AviaSearchResultVO vo, boolean z11) {
            Intrinsics.checkNotNullParameter(vo, "vo");
            this.vo = vo;
            this.shouldRefresh = z11;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof UpdateVoResult)) {
                return false;
            }
            UpdateVoResult updateVoResult = (UpdateVoResult) other;
            return Intrinsics.d(this.vo, updateVoResult.vo) && this.shouldRefresh == updateVoResult.shouldRefresh;
        }

        public final boolean getShouldRefresh() {
            return this.shouldRefresh;
        }

        @NotNull
        public final AviaSearchResultVO getVo() {
            return this.vo;
        }

        public int hashCode() {
            return Boolean.hashCode(this.shouldRefresh) + (this.vo.hashCode() * 31);
        }

        @NotNull
        public String toString() {
            return "UpdateVoResult(vo=" + this.vo + ", shouldRefresh=" + this.shouldRefresh + ")";
        }
    }

    public AviaSearchResultViewModel(@NotNull AviaSearchResultApi api, @NotNull ActionV2Repository actionRepository, @NotNull AviaSearchResultV3Mapper mapperV3, @NotNull SearchPreloaderAnimator preloaderAnimator) {
        Intrinsics.checkNotNullParameter(api, "api");
        Intrinsics.checkNotNullParameter(actionRepository, "actionRepository");
        Intrinsics.checkNotNullParameter(mapperV3, "mapperV3");
        Intrinsics.checkNotNullParameter(preloaderAnimator, "preloaderAnimator");
        this.api = api;
        this.actionRepository = actionRepository;
        this.mapperV3 = mapperV3;
        this.preloaderAnimator = preloaderAnimator;
        this.luggageSelectionDisposables = new C8486a();
        this.pollFlightsDisposables = new C8486a();
        this.updateVoLiveData = new SingleLiveEvent<>();
        this.resultLiveData = new V<>();
        this.errorLiveData = new V<>();
        this.timerLiveData = new V<>();
        this.quickFiltersSkeletonLiveData = new V<>();
        this.progressBarLiveData = new V<>();
        this.skeletonLiveData = new V<>();
        this.contentVisibilityLiveData = new V<>();
        this.itemUpdateLiveData = new SingleLiveEvent<>();
        this.actionSuccessLiveData = new SingleLiveEvent<>();
        this.trackingLiveData = new SingleLiveEvent<>();
        this.actionErrorLiveData = new SingleLiveEvent<>();
        this.toggleActionLiveData = new SingleLiveEvent<>();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<AviaSearchResultVO.AviaSearchResultItemVO> applyBonusPayState(List<AviaSearchResultVO.AviaSearchResultItemVO> list, boolean z11) {
        List<AviaSearchResultVO.AviaSearchResultItemVO> list2 = list;
        ArrayList arrayList = new ArrayList(C7714v.z(list2, 10));
        for (Object obj : list2) {
            if (obj instanceof AviaSearchResultVO.AviaSearchResultItemVO.FlightItemV3) {
                obj = AviaSearchResultVO.AviaSearchResultItemVO.FlightItemV3.copy$default((AviaSearchResultVO.AviaSearchResultItemVO.FlightItemV3) obj, 0L, false, 0L, null, null, false, null, null, null, null, null, false, null, null, null, null, null, false, null, null, null, z11, 2097151, null);
            } else if (obj instanceof AviaSearchResultVO.AviaSearchResultItemVO.BonusToggleItem) {
                obj = AviaSearchResultVO.AviaSearchResultItemVO.BonusToggleItem.copy$default((AviaSearchResultVO.AviaSearchResultItemVO.BonusToggleItem) obj, 0L, null, null, null, z11, null, null, null, null, 495, null);
            }
            arrayList.add(obj);
        }
        return C7714v.W0(arrayList);
    }

    private final void clearAllDisposables() {
        C5415f.a(this).d();
        this.luggageSelectionDisposables.d();
        this.pollFlightsDisposables.d();
        B0 b02 = this.bannerJob;
        if (b02 != null) {
            b02.j(null);
        }
    }

    private final <T, R> void handleAction(y<T> source, Function1<? super T, ? extends R> mapper, Function1<? super R, Unit> onSuccess, Function1<? super Throwable, Unit> onError) {
        C5415f.a(this).d();
        C5415f.a(this).a(new r(source.j(Mc.a.b()).g(Mc.a.a()), new BF.a(mapper, 2)).g(C8125a.a()).h(new b(onSuccess, 1), new DM.b(onError, 0)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object handleAction$lambda$18(Function1 function1, Object p02) {
        Intrinsics.checkNotNullParameter(p02, "p0");
        return function1.invoke(p02);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void hideContent() {
        this.contentVisibilityLiveData.setValue(Boolean.FALSE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void hideError() {
        showError(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void hideProgressBar() {
        this.progressBarLiveData.setValue(Boolean.FALSE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void hideQuickFiltersSkeleton() {
        this.quickFiltersSkeletonLiveData.setValue(Boolean.FALSE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void hideSkeleton() {
        this.skeletonLiveData.setValue(Boolean.FALSE);
    }

    private final boolean isAlreadyPolling(AviaSearchResultVO newVo) {
        AviaSearchResultVO aviaSearchResultVO;
        if (this.pollFlightsDisposables.f() <= 0 || (aviaSearchResultVO = this.lastVo) == null) {
            return false;
        }
        if (aviaSearchResultVO == null) {
            Intrinsics.n("lastVo");
            throw null;
        }
        Map<String, String> params = aviaSearchResultVO.getPollingAction().getParams();
        String str = params != null ? params.get("searchId") : null;
        Map<String, String> params2 = newVo.getPollingAction().getParams();
        return Intrinsics.d(str, params2 != null ? params2.get("searchId") : null);
    }

    private final void pollFlights() {
        C g10 = new r(new m(y.f(Unit.f71690a), new g(new AviaSearchResultViewModel$pollFlights$1(this), 0)).j(Mc.a.b()).g(Mc.a.a()), new h(new AviaSearchResultViewModel$pollFlights$2(this), 0)).g(C8125a.a());
        C10493n c10493n = new C10493n(new C10495p(new C10479H(g10 instanceof InterfaceC9800b ? ((InterfaceC9800b) g10).a() : new Bc.y(g10), new d(this)), new i(new AviaSearchResultViewModel$pollFlights$4(this), 0)), new j(this));
        CJ.a aVar = new CJ.a(new AviaSearchResultViewModel$pollFlights$6(this), 1);
        CJ.b bVar = new CJ.b(new AviaSearchResultViewModel$pollFlights$7(this), 1);
        v vVar = v.INSTANCE;
        C9656b.c(vVar, "onSubscribe is null");
        e eVar = new e(aVar, bVar, vVar);
        c10493n.i(eVar);
        this.pollFlightsDisposables.a(eVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C pollFlights$lambda$10(Function1 function1, Object p02) {
        Intrinsics.checkNotNullParameter(p02, "p0");
        return (C) function1.invoke(p02);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AviaSearchResultVO pollFlights$lambda$11(Function1 function1, Object p02) {
        Intrinsics.checkNotNullParameter(p02, "p0");
        return (AviaSearchResultVO) function1.invoke(p02);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean pollFlights$lambda$12(AviaSearchResultViewModel aviaSearchResultViewModel) {
        AviaSearchResultVO aviaSearchResultVO = aviaSearchResultViewModel.lastVo;
        if (aviaSearchResultVO != null) {
            return aviaSearchResultVO.getIsAllDone();
        }
        Intrinsics.n("lastVo");
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void pollFlights$lambda$14(AviaSearchResultViewModel aviaSearchResultViewModel) {
        aviaSearchResultViewModel.pollFlightsDisposables.d();
    }

    private final void saveInitialViewObject(AviaSearchResultVO vo) {
        AviaSearchResultVO aviaSearchResultVO;
        AviaSearchResultVO aviaSearchResultVO2 = this.lastVo;
        if (aviaSearchResultVO2 != null && !this.isBonusPayUpdate && !this.isUpdatingBonusPayViaAction) {
            if (aviaSearchResultVO2 == null) {
                Intrinsics.n("lastVo");
                throw null;
            }
            if (aviaSearchResultVO2.getIsBonusPay() != vo.getIsBonusPay()) {
                AviaSearchResultVO aviaSearchResultVO3 = this.lastVo;
                if (aviaSearchResultVO3 == null) {
                    Intrinsics.n("lastVo");
                    throw null;
                }
                if (aviaSearchResultVO3.getApplyCachedBonusPay()) {
                    AviaSearchResultVO aviaSearchResultVO4 = this.lastVo;
                    if (aviaSearchResultVO4 == null) {
                        Intrinsics.n("lastVo");
                        throw null;
                    }
                    boolean isBonusPay = aviaSearchResultVO4.getIsBonusPay();
                    boolean applyCachedBonusPay = vo.getApplyCachedBonusPay();
                    List<AviaSearchResultVO.AviaSearchResultItemVO> resultItems = vo.getResultItems();
                    AviaSearchResultVO aviaSearchResultVO5 = this.lastVo;
                    if (aviaSearchResultVO5 == null) {
                        Intrinsics.n("lastVo");
                        throw null;
                    }
                    aviaSearchResultVO = AviaSearchResultVO.copy$default(vo, 0L, null, applyBonusPayState(resultItems, aviaSearchResultVO5.getIsBonusPay()), null, null, null, null, null, false, isBonusPay, applyCachedBonusPay, 507, null);
                    this.isBonusSync = true;
                    this.updateVoLiveData.setValue(new UpdateVoResult(aviaSearchResultVO, false));
                    this.lastVo = aviaSearchResultVO;
                    this.isUpdatingBonusPayViaAction = false;
                    this.isBonusPayUpdate = false;
                    this.isPaginationCompleted = false;
                    this.isLoadingNextPage = false;
                }
            }
        }
        aviaSearchResultVO = vo;
        this.lastVo = aviaSearchResultVO;
        this.isUpdatingBonusPayViaAction = false;
        this.isBonusPayUpdate = false;
        this.isPaginationCompleted = false;
        this.isLoadingNextPage = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AviaSearchResultVO.AviaSearchResultItemVO.FlightItemV3 selectLuggage$lambda$1(Function1 function1, Object p02) {
        Intrinsics.checkNotNullParameter(p02, "p0");
        return (AviaSearchResultVO.AviaSearchResultItemVO.FlightItemV3) function1.invoke(p02);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void selectLuggage$lambda$4(AviaSearchResultViewModel aviaSearchResultViewModel, AviaSearchResultVO.AviaSearchResultItemVO.Flight flight) {
        flight.setProgressVisible(false);
        aviaSearchResultViewModel.updateItem(flight, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showContent() {
        this.contentVisibilityLiveData.setValue(Boolean.TRUE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showError(ErrorStateVO error) {
        this.errorLiveData.setValue(error);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showProgressBar() {
        this.progressBarLiveData.setValue(Boolean.TRUE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showQuickFiltersSkeleton() {
        this.quickFiltersSkeletonLiveData.setValue(Boolean.TRUE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showSkeleton() {
        this.skeletonLiveData.setValue(Boolean.TRUE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateItem(AviaSearchResultVO.AviaSearchResultItemVO item, boolean shouldShowError) {
        AviaSearchResultVO aviaSearchResultVO = this.lastVo;
        if (aviaSearchResultVO == null) {
            Intrinsics.n("lastVo");
            throw null;
        }
        Iterator<AviaSearchResultVO.AviaSearchResultItemVO> it = aviaSearchResultVO.getResultItems().iterator();
        int i11 = 0;
        while (true) {
            if (!it.hasNext()) {
                i11 = -1;
                break;
            } else if (it.next().getId() == item.getId()) {
                break;
            } else {
                i11++;
            }
        }
        if (i11 == -1) {
            return;
        }
        AviaSearchResultVO aviaSearchResultVO2 = this.lastVo;
        if (aviaSearchResultVO2 == null) {
            Intrinsics.n("lastVo");
            throw null;
        }
        aviaSearchResultVO2.getResultItems().set(i11, item);
        this.itemUpdateLiveData.setValue(new ItemUpdateResult(item, i11, shouldShowError));
    }

    @NotNull
    public final P<Unit> actionErrorLiveData() {
        return this.actionErrorLiveData;
    }

    @NotNull
    public final P<AtomAction> actionSuccessLiveData() {
        return this.actionSuccessLiveData;
    }

    public final void changeBonusStateUpdate(boolean isBonusPay, AtomAction action) {
        if (action != null) {
            this.isUpdatingBonusPayViaAction = true;
            this.toggleActionLiveData.setValue(action);
            return;
        }
        AviaSearchResultVO aviaSearchResultVO = this.lastVo;
        if (aviaSearchResultVO == null) {
            Intrinsics.n("lastVo");
            throw null;
        }
        if (isBonusPay != aviaSearchResultVO.getIsBonusPay()) {
            this.isBonusPayUpdate = true;
            SingleLiveEvent<UpdateVoResult> singleLiveEvent = this.updateVoLiveData;
            AviaSearchResultVO aviaSearchResultVO2 = this.lastVo;
            if (aviaSearchResultVO2 == null) {
                Intrinsics.n("lastVo");
                throw null;
            }
            if (aviaSearchResultVO2 != null) {
                singleLiveEvent.setValue(new UpdateVoResult(AviaSearchResultVO.copy$default(aviaSearchResultVO2, 0L, null, applyBonusPayState(aviaSearchResultVO2.getResultItems(), isBonusPay), null, null, null, null, null, false, isBonusPay, false, 1531, null), false));
            } else {
                Intrinsics.n("lastVo");
                throw null;
            }
        }
    }

    @NotNull
    public final P<Boolean> contentVisibilityLiveData() {
        return this.contentVisibilityLiveData;
    }

    @NotNull
    public final P<ErrorStateVO> errorLiveData() {
        return this.errorLiveData;
    }

    @NotNull
    public final List<t> getEventsByRange(int from, int to) {
        if (from >= 0 && to >= 0) {
            AviaSearchResultVO aviaSearchResultVO = this.lastVo;
            if (aviaSearchResultVO == null) {
                Intrinsics.n("lastVo");
                throw null;
            }
            if (aviaSearchResultVO.getResultItems().size() > to) {
                AviaSearchResultVO aviaSearchResultVO2 = this.lastVo;
                if (aviaSearchResultVO2 == null) {
                    Intrinsics.n("lastVo");
                    throw null;
                }
                List<AviaSearchResultVO.AviaSearchResultItemVO> E02 = C7714v.E0(aviaSearchResultVO2.getResultItems(), new IntRange(from, to, 1));
                ArrayList arrayList = new ArrayList();
                for (AviaSearchResultVO.AviaSearchResultItemVO aviaSearchResultItemVO : E02) {
                    AviaSearchResultVO.AviaSearchResultItemVO.FlightItemV3 flightItemV3 = aviaSearchResultItemVO instanceof AviaSearchResultVO.AviaSearchResultItemVO.FlightItemV3 ? (AviaSearchResultVO.AviaSearchResultItemVO.FlightItemV3) aviaSearchResultItemVO : null;
                    if (flightItemV3 != null) {
                        arrayList.add(flightItemV3);
                    }
                }
                ArrayList arrayList2 = new ArrayList();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    t viewTrackingInfo = ((AviaSearchResultVO.AviaSearchResultItemVO.FlightItemV3) it.next()).getViewTrackingInfo();
                    if (viewTrackingInfo != null) {
                        arrayList2.add(viewTrackingInfo);
                    }
                }
                return arrayList2;
            }
        }
        return K.f71697a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void initialize(@NotNull AviaSearchResultVO vo) {
        Intrinsics.checkNotNullParameter(vo, "vo");
        if (isAlreadyPolling(vo)) {
            return;
        }
        this.pollFlightsDisposables.d();
        if (this.isBonusSync) {
            this.isBonusSync = false;
            return;
        }
        saveInitialViewObject(vo);
        hideQuickFiltersSkeleton();
        hideProgressBar();
        hideSkeleton();
        AviaSearchResultVO aviaSearchResultVO = this.lastVo;
        Function0 function0 = null;
        Object[] objArr = 0;
        if (aviaSearchResultVO == null) {
            Intrinsics.n("lastVo");
            throw null;
        }
        if (aviaSearchResultVO.getTimeoutMs() == null) {
            hideContent();
            AviaSearchResultVO aviaSearchResultVO2 = this.lastVo;
            if (aviaSearchResultVO2 != null) {
                showError(aviaSearchResultVO2.getErrorMsg());
                return;
            } else {
                Intrinsics.n("lastVo");
                throw null;
            }
        }
        AviaSearchResultVO aviaSearchResultVO3 = this.lastVo;
        if (aviaSearchResultVO3 == null) {
            Intrinsics.n("lastVo");
            throw null;
        }
        if (!aviaSearchResultVO3.getIsAllDone()) {
            this.showProgressAction = new AviaSearchResultViewModel$initialize$1(this);
            pollFlights();
            return;
        }
        hideError();
        showContent();
        V<Long> v11 = this.timerLiveData;
        AviaSearchResultVO aviaSearchResultVO4 = this.lastVo;
        if (aviaSearchResultVO4 == null) {
            Intrinsics.n("lastVo");
            throw null;
        }
        v11.setValue(aviaSearchResultVO4.getTimeoutMs());
        V<Result> v12 = this.resultLiveData;
        AviaSearchResultVO aviaSearchResultVO5 = this.lastVo;
        if (aviaSearchResultVO5 != null) {
            v12.setValue(new Result(aviaSearchResultVO5.getResultItems(), function0, 2, objArr == true ? 1 : 0));
        } else {
            Intrinsics.n("lastVo");
            throw null;
        }
    }

    @NotNull
    public final P<ItemUpdateResult> itemUpdateLiveData() {
        return this.itemUpdateLiveData;
    }

    public final void loadNextPage(int lastVisibleItemPosition) {
        AviaSearchResultVO aviaSearchResultVO = this.lastVo;
        if (aviaSearchResultVO == null) {
            Intrinsics.n("lastVo");
            throw null;
        }
        if (!aviaSearchResultVO.getIsAllDone() || this.isPaginationCompleted || this.isLoadingNextPage) {
            return;
        }
        AviaSearchResultVO aviaSearchResultVO2 = this.lastVo;
        if (aviaSearchResultVO2 == null) {
            Intrinsics.n("lastVo");
            throw null;
        }
        if (aviaSearchResultVO2.getResultItems().size() - lastVisibleItemPosition > 7) {
            return;
        }
        AviaSearchResultVO aviaSearchResultVO3 = this.lastVo;
        if (aviaSearchResultVO3 == null) {
            Intrinsics.n("lastVo");
            throw null;
        }
        AtomActionDTO lazyLoadAction = aviaSearchResultVO3.getLazyLoadAction();
        Map<String, String> params = lazyLoadAction.getParams();
        if (params == null) {
            params = U.c();
        }
        AviaSearchResultVO aviaSearchResultVO4 = this.lastVo;
        if (aviaSearchResultVO4 == null) {
            Intrinsics.n("lastVo");
            throw null;
        }
        LinkedHashMap m11 = U.m(params, U.l(new Pair("offset", String.valueOf(aviaSearchResultVO4.getResultItems().size()))));
        String link = lazyLoadAction.getLink();
        if (link == null) {
            link = "";
        }
        this.isLoadingNextPage = true;
        handleAction(this.actionRepository.callAction(new ActionV2Request(m11, link, true), AviaSearchResultV3DTO.class), new AviaSearchResultViewModel$loadNextPage$1(this), new AviaSearchResultViewModel$loadNextPage$2(this), new AviaSearchResultViewModel$loadNextPage$3(this));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onBannerClicked(@NotNull AtomAction.ComposerAction action, int position) {
        Intrinsics.checkNotNullParameter(action, "action");
        AviaSearchResultVO aviaSearchResultVO = this.lastVo;
        Function0 function0 = null;
        Object[] objArr = 0;
        if (aviaSearchResultVO == null) {
            Intrinsics.n("lastVo");
            throw null;
        }
        if (C7714v.Q(position, aviaSearchResultVO.getResultItems()) instanceof AviaSearchResultVO.AviaSearchResultItemVO.BannerItem) {
            AviaSearchResultVO aviaSearchResultVO2 = this.lastVo;
            if (aviaSearchResultVO2 == null) {
                Intrinsics.n("lastVo");
                throw null;
            }
            aviaSearchResultVO2.getResultItems().remove(position);
            SingleLiveEvent<UpdateVoResult> singleLiveEvent = this.updateVoLiveData;
            AviaSearchResultVO aviaSearchResultVO3 = this.lastVo;
            if (aviaSearchResultVO3 == null) {
                Intrinsics.n("lastVo");
                throw null;
            }
            singleLiveEvent.setValue(new UpdateVoResult(aviaSearchResultVO3, false));
            V<Result> v11 = this.resultLiveData;
            AviaSearchResultVO aviaSearchResultVO4 = this.lastVo;
            if (aviaSearchResultVO4 == null) {
                Intrinsics.n("lastVo");
                throw null;
            }
            v11.setValue(new Result(aviaSearchResultVO4.getResultItems(), function0, 2, objArr == true ? 1 : 0));
            B0 b02 = this.bannerJob;
            if (b02 != null) {
                b02.j(null);
            }
            C6788a a11 = x0.a(this);
            C10720e0 c10720e0 = C10720e0.f105451a;
            this.bannerJob = C10727i.c(a11, He.b.f10879b, null, new AviaSearchResultViewModel$onBannerClicked$1(this, action, null), 2);
        }
    }

    @Override // androidx.lifecycle.w0
    protected void onCleared() {
        stopPreloaderAnimation();
        clearAllDisposables();
        super.onCleared();
    }

    public final void onDropDownBannerClicked(@NotNull AviaSearchResultVO.AviaSearchResultItemVO.DropDownBannerItem dropDownItem, int position) {
        Intrinsics.checkNotNullParameter(dropDownItem, "dropDownItem");
        AviaSearchResultVO.AviaSearchResultItemVO.DropDownBannerItem copy$default = AviaSearchResultVO.AviaSearchResultItemVO.DropDownBannerItem.copy$default(dropDownItem, 0L, DropDownBannerVO.copy$default(dropDownItem.getBanner(), false, null, null, null, null, !r3.getIsExpanded(), 31, null), 1, null);
        AviaSearchResultVO aviaSearchResultVO = this.lastVo;
        if (aviaSearchResultVO == null) {
            Intrinsics.n("lastVo");
            throw null;
        }
        aviaSearchResultVO.getResultItems().set(position, copy$default);
        this.itemUpdateLiveData.setValue(new ItemUpdateResult(copy$default, position, false));
    }

    public final void onMoveActionPreProcess() {
        this.luggageSelectionDisposables.d();
    }

    public final void onTimerWentOff() {
        clearAllDisposables();
        hideContent();
        AviaSearchResultVO aviaSearchResultVO = this.lastVo;
        if (aviaSearchResultVO != null) {
            showError(aviaSearchResultVO.getTimeoutMsg());
        } else {
            Intrinsics.n("lastVo");
            throw null;
        }
    }

    public final void performAction(String actionName, Map<String, String> params) {
        AviaSearchResultApi aviaSearchResultApi = this.api;
        if (actionName == null) {
            actionName = "";
        }
        if (params == null) {
            params = U.c();
        }
        handleAction(aviaSearchResultApi.performAction(actionName, params), AviaSearchResultViewModel$performAction$1.INSTANCE, new AviaSearchResultViewModel$performAction$2(this.actionSuccessLiveData), new AviaSearchResultViewModel$performAction$3(this));
    }

    @NotNull
    public final P<Float> preloaderProgressLiveData() {
        return this.preloaderAnimator.getAnimationProgress();
    }

    @NotNull
    public final P<String> preloaderTitleLiveData() {
        return this.preloaderAnimator.getTitleProgress();
    }

    @NotNull
    public final P<Boolean> progressBarLiveData() {
        return this.progressBarLiveData;
    }

    @NotNull
    public final P<Boolean> quickFiltersSkeletonLiveData() {
        return this.quickFiltersSkeletonLiveData;
    }

    @NotNull
    public final P<Result> resultLiveData() {
        return this.resultLiveData;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v9, types: [DM.d] */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v5, types: [java.lang.Object] */
    public final void selectLuggage(AtomActionDTO action, long itemId) {
        AviaSearchResultVO.AviaSearchResultItemVO.Flight flight;
        AviaSearchResultVO aviaSearchResultVO = this.lastVo;
        if (aviaSearchResultVO == null) {
            Intrinsics.n("lastVo");
            throw null;
        }
        if (aviaSearchResultVO.getIsAllDone()) {
            this.luggageSelectionDisposables.d();
            String link = action != null ? action.getLink() : null;
            if (link == null) {
                link = "";
            }
            Map<String, String> params = action != null ? action.getParams() : null;
            if (params == null) {
                params = U.c();
            }
            AviaSearchResultVO aviaSearchResultVO2 = this.lastVo;
            if (aviaSearchResultVO2 == null) {
                Intrinsics.n("lastVo");
                throw null;
            }
            Iterator it = aviaSearchResultVO2.getResultItems().iterator();
            while (true) {
                if (!it.hasNext()) {
                    flight = 0;
                    break;
                } else {
                    flight = it.next();
                    if (((AviaSearchResultVO.AviaSearchResultItemVO) flight).getId() == itemId) {
                        break;
                    }
                }
            }
            final AviaSearchResultVO.AviaSearchResultItemVO.Flight flight2 = flight instanceof AviaSearchResultVO.AviaSearchResultItemVO.Flight ? flight : null;
            if (flight2 == null) {
                LoggerExtKt.sendNonFatal$default(new ClassCastException(), "Cannot be cast to AviaSearchResultVO.AviaSearchResultItemVO.Flight in AviaSearchResultViewModel", null, null, 12, null);
            } else {
                this.luggageSelectionDisposables.a(new Bc.g(new Bc.i(new r(this.actionRepository.callAction(new ActionV2Request(params, link, true), AviaSearchV3SelectLuggageResponse.class).j(Mc.a.b()), new DM.a(new AviaSearchResultViewModel$selectLuggage$1(this, flight2), 0)).g(C8125a.a()), new c(new AviaSearchResultViewModel$selectLuggage$2(this, flight2), 0)), new InterfaceC9019a() { // from class: DM.d
                    @Override // qc.InterfaceC9019a
                    public final void run() {
                        AviaSearchResultViewModel.selectLuggage$lambda$4(AviaSearchResultViewModel.this, flight2);
                    }
                }).h(new DM.e(new AviaSearchResultViewModel$selectLuggage$4(this), 0), new f(new AviaSearchResultViewModel$selectLuggage$5(this, flight2), 0)));
            }
        }
    }

    @NotNull
    public final P<Boolean> skeletonLiveData() {
        return this.skeletonLiveData;
    }

    public final void startPreloaderAnimation(int width) {
        this.preloaderAnimator.startAnimation(x0.a(this), width);
    }

    public final void stopPreloaderAnimation() {
        this.preloaderAnimator.stopAnimation();
    }

    @NotNull
    public final P<Long> timerLiveData() {
        return this.timerLiveData;
    }

    @NotNull
    public final P<AtomAction> toggleActionLiveData() {
        return this.toggleActionLiveData;
    }

    @NotNull
    public final P<TrackingData> trackingLiveData() {
        return this.trackingLiveData;
    }

    @NotNull
    public final P<UpdateVoResult> updateVoLiveData() {
        return this.updateVoLiveData;
    }

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\u0010\u0010\u0005\u001a\f\u0012\b\u0012\u00060\u0003j\u0002`\u00040\u0002\u0012\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R!\u0010\u0005\u001a\f\u0012\b\u0012\u00060\u0003j\u0002`\u00040\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001f\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\b\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/aviaSearchResult/legacy/viewModel/AviaSearchResultViewModel$Result;", "", "", "Lru/ozon/app/android/travel/feature/avia/widgets/aviaSearchResult/legacy/presentation/AviaSearchResultVO$AviaSearchResultItemVO;", "Lru/ozon/app/android/travel/feature/avia/widgets/aviaSearchResult/legacy/presentation/adapter/AviaSearchItem;", "resultItems", "Lkotlin/Function0;", "", "postAction", "<init>", "(Ljava/util/List;Lkotlin/jvm/functions/Function0;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getResultItems", "()Ljava/util/List;", "Lkotlin/jvm/functions/Function0;", "getPostAction", "()Lkotlin/jvm/functions/Function0;", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Result {
        private final Function0<Unit> postAction;

        @NotNull
        private final List<AviaSearchResultVO.AviaSearchResultItemVO> resultItems;

        /* JADX WARN: Multi-variable type inference failed */
        public Result(@NotNull List<? extends AviaSearchResultVO.AviaSearchResultItemVO> resultItems, Function0<Unit> function0) {
            Intrinsics.checkNotNullParameter(resultItems, "resultItems");
            this.resultItems = resultItems;
            this.postAction = function0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Result)) {
                return false;
            }
            Result result = (Result) other;
            return Intrinsics.d(this.resultItems, result.resultItems) && Intrinsics.d(this.postAction, result.postAction);
        }

        public final Function0<Unit> getPostAction() {
            return this.postAction;
        }

        @NotNull
        public final List<AviaSearchResultVO.AviaSearchResultItemVO> getResultItems() {
            return this.resultItems;
        }

        public int hashCode() {
            int hashCode = this.resultItems.hashCode() * 31;
            Function0<Unit> function0 = this.postAction;
            return hashCode + (function0 == null ? 0 : function0.hashCode());
        }

        @NotNull
        public String toString() {
            return "Result(resultItems=" + this.resultItems + ", postAction=" + this.postAction + ")";
        }

        public /* synthetic */ Result(List list, Function0 function0, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(list, (i11 & 2) != 0 ? null : function0);
        }
    }
}
