package ru.ozon.app.android.search.dialogsearchscreen;

import Ae.C2399j;
import Ae.C2406m0;
import Ae.E0;
import Ae.InterfaceC2395h;
import Ae.M0;
import Ae.O0;
import Ae.x0;
import GZ.g;
import K1.G;
import Sc.r;
import Sc.s;
import WZ.t;
import Xc.a;
import Xc.b;
import android.net.Uri;
import androidx.lifecycle.w0;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.google.android.gms.actions.SearchIntents;
import com.google.android.gms.common.internal.ImagesContract;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.net.URLDecoder;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Comparator;
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
import kotlin.coroutines.d;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.composer.TrackingInfoMapperKt;
import ru.ozon.app.android.composer.widgets.async.data.ComposerAsyncWidgetRepository;
import ru.ozon.app.android.search.common.analytics.TokenizedAnalyticsHelper;
import ru.ozon.app.android.search.dialogsearchscreen.searchbar.common.PageRefreshState;
import ru.ozon.app.android.search.dialogsearchscreen.withTopFilters.DialogSearchScrollingState;
import ru.ozon.app.android.search.widgets.dialogSearchBar.data.DialogSearchBarMapper;
import ru.ozon.app.android.search.widgets.dialogSearchBar.data.api.ActionType;
import ru.ozon.app.android.search.widgets.dialogSearchBar.data.api.DialogSearchInteractionsApi;
import ru.ozon.app.android.search.widgets.dialogSearchBar.data.api.DialogSearchInteractionsRequest;
import ru.ozon.app.android.search.widgets.dialogSearchBar.presentation.DialogSearchBarVO;
import ru.ozon.app.android.search.widgets.utils.SearchAiUtilsKt;
import ru.ozon.app.android.utils.UriExtKt;
import ru.ozon.composer.ui.widget.l;
import ru.ozon.tracker.model.TrinityEventEntityKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import xe.B0;
import xe.C10727i;

@Metadata(d1 = {"\u0000Ô\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u001d\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010%\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 ±\u00012\u00020\u0001:\u0004±\u0001²\u0001B5\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\n\u0010\f\u001a\u00060\nj\u0002`\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0014¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0018\u001a\u00020\u000f2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u001d\u0010\u001d\u001a\u00020\u000f2\u000e\u0010\u001c\u001a\n\u0018\u00010\u001aj\u0004\u0018\u0001`\u001b¢\u0006\u0004\b\u001d\u0010\u001eJ\r\u0010\u001f\u001a\u00020\u000f¢\u0006\u0004\b\u001f\u0010\u0011J\u0015\u0010\"\u001a\u00020\u000f2\u0006\u0010!\u001a\u00020 ¢\u0006\u0004\b\"\u0010#J\u0019\u0010%\u001a\u0004\u0018\u00010\u00162\b\u0010$\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\b%\u0010&J9\u0010-\u001a\u00020\u000f2\u0006\u0010(\u001a\u00020'2\u0006\u0010)\u001a\u00020\u00162\u0006\u0010*\u001a\u00020\u00162\b\u0010+\u001a\u0004\u0018\u00010\u00162\b\u0010,\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\b-\u0010.J\u0019\u0010/\u001a\u0004\u0018\u00010\u00162\b\u0010$\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\b/\u0010&J\u001f\u00103\u001a\u00020\u000f2\u0006\u00101\u001a\u0002002\b\u00102\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\b3\u00104J\u0015\u00107\u001a\n\u0018\u000105j\u0004\u0018\u0001`6¢\u0006\u0004\b7\u00108J\u0015\u00109\u001a\n\u0018\u000105j\u0004\u0018\u0001`6¢\u0006\u0004\b9\u00108J\u0015\u0010:\u001a\n\u0018\u000105j\u0004\u0018\u0001`6¢\u0006\u0004\b:\u00108J\u001f\u0010>\u001a\u00020\u000f2\u0006\u0010<\u001a\u00020;2\b\u0010=\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\b>\u0010?J\r\u0010@\u001a\u00020\u000f¢\u0006\u0004\b@\u0010\u0011J1\u0010C\u001a\u00020\u000f2\u0006\u0010<\u001a\u00020;2\u0006\u0010=\u001a\u00020\u00162\u0010\b\u0002\u0010B\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010AH\u0002¢\u0006\u0004\bC\u0010DJ\u001b\u0010F\u001a\u0004\u0018\u00010\u00162\b\u0010E\u001a\u0004\u0018\u00010\u0016H\u0002¢\u0006\u0004\bF\u0010&J%\u0010G\u001a\u0004\u0018\u00010\u00162\b\u0010E\u001a\u0004\u0018\u00010\u00162\b\u0010$\u001a\u0004\u0018\u00010\u0016H\u0002¢\u0006\u0004\bG\u0010HJ\u0017\u0010J\u001a\u00020\u000f2\u0006\u0010I\u001a\u00020\u0016H\u0002¢\u0006\u0004\bJ\u0010\u0019J\u0017\u0010L\u001a\u00020\u000f2\u0006\u0010K\u001a\u000200H\u0002¢\u0006\u0004\bL\u0010MJ\u0017\u0010N\u001a\u00020\u000f2\u0006\u0010$\u001a\u00020\u0016H\u0002¢\u0006\u0004\bN\u0010\u0019J\u0017\u0010P\u001a\u00020\u000f2\u0006\u0010O\u001a\u00020\u0012H\u0002¢\u0006\u0004\bP\u0010\u0015J\u0017\u0010Q\u001a\u00020 2\u0006\u0010O\u001a\u00020\u0012H\u0002¢\u0006\u0004\bQ\u0010RJ\u0017\u0010T\u001a\u00020\u000f2\u0006\u0010S\u001a\u00020\u0016H\u0002¢\u0006\u0004\bT\u0010\u0019J$\u0010W\u001a\u00020\u000f2\b\u0010U\u001a\u0004\u0018\u00010\u00162\b\b\u0002\u0010V\u001a\u00020 H\u0082@¢\u0006\u0004\bW\u0010XJ\u0017\u0010Y\u001a\u00020\u00162\u0006\u0010U\u001a\u00020\u0016H\u0002¢\u0006\u0004\bY\u0010&J#\u0010\\\u001a\u00020 2\b\u0010Z\u001a\u0004\u0018\u00010\u00162\b\u0010[\u001a\u0004\u0018\u00010\u0016H\u0002¢\u0006\u0004\b\\\u0010]J+\u0010a\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00160`0_2\b\u0010^\u001a\u0004\u0018\u00010\u0016H\u0002¢\u0006\u0004\ba\u0010bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010cR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010dR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010eR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010fR\u0018\u0010\f\u001a\u00060\nj\u0002`\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010gR$\u0010h\u001a\u0004\u0018\u00010\u00168\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bh\u0010i\u001a\u0004\bj\u0010k\"\u0004\bl\u0010\u0019R$\u0010m\u001a\u0004\u0018\u00010\u00168\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bm\u0010i\u001a\u0004\bn\u0010k\"\u0004\bo\u0010\u0019R$\u0010p\u001a\u0004\u0018\u00010'8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bp\u0010q\u001a\u0004\br\u0010s\"\u0004\bt\u0010uR$\u0010w\u001a\u0004\u0018\u00010v8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bw\u0010x\u001a\u0004\by\u0010z\"\u0004\b{\u0010|R$\u0010}\u001a\u0004\u0018\u00010\u00168\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b}\u0010i\u001a\u0004\b~\u0010k\"\u0004\b\u007f\u0010\u0019R(\u0010\u0080\u0001\u001a\u00020 8\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0006\b\u0080\u0001\u0010\u0081\u0001\u001a\u0006\b\u0082\u0001\u0010\u0083\u0001\"\u0005\b\u0084\u0001\u0010#R$\u0010\u0086\u0001\u001a\u000f\u0012\u0004\u0012\u00020;\u0012\u0004\u0012\u00020\u00160\u0085\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0086\u0001\u0010\u0087\u0001R\u0018\u0010S\u001a\u0004\u0018\u00010\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bS\u0010iR\u0018\u0010\u0088\u0001\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0088\u0001\u0010iR\u0019\u0010\u0089\u0001\u001a\u00020 8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0089\u0001\u0010\u0081\u0001R\u001b\u0010\u008a\u0001\u001a\u0004\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008a\u0001\u0010\u008b\u0001R\u001c\u0010\u008d\u0001\u001a\u0005\u0018\u00010\u008c\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008d\u0001\u0010\u008e\u0001R\u0018\u0010\u008f\u0001\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u008f\u0001\u0010iR\u0019\u0010\u0090\u0001\u001a\u00020 8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0090\u0001\u0010\u0081\u0001R\u001a\u0010\u0091\u0001\u001a\u0004\u0018\u00010\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0091\u0001\u0010iR\u001f\u0010\u0094\u0001\u001a\n\u0012\u0005\u0012\u00030\u0093\u00010\u0092\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0094\u0001\u0010\u0095\u0001R\u001c\u0010\u0097\u0001\u001a\u0005\u0018\u00010\u0096\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0097\u0001\u0010\u0098\u0001R\u001c\u0010\u0099\u0001\u001a\u0005\u0018\u00010\u0096\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0099\u0001\u0010\u0098\u0001R\u001e\u0010\u009a\u0001\u001a\t\u0012\u0004\u0012\u00020\u00120\u0092\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u009a\u0001\u0010\u0095\u0001R \u0010\u009b\u0001\u001a\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u00160\u0092\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u009b\u0001\u0010\u0095\u0001R \u0010\u009c\u0001\u001a\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u00160\u0092\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u009c\u0001\u0010\u0095\u0001R&\u0010\u009d\u0001\u001a\u0011\u0012\f\u0012\n\u0018\u00010\u001aj\u0004\u0018\u0001`\u001b0\u0092\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u009d\u0001\u0010\u0095\u0001R\u001e\u0010\u009f\u0001\u001a\t\u0012\u0004\u0012\u00020 0\u009e\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u009f\u0001\u0010 \u0001R\u001c\u0010¤\u0001\u001a\n\u0012\u0005\u0012\u00030\u0093\u00010¡\u00018F¢\u0006\b\u001a\u0006\b¢\u0001\u0010£\u0001R\u001b\u0010¦\u0001\u001a\t\u0012\u0004\u0012\u00020\u00120¡\u00018F¢\u0006\b\u001a\u0006\b¥\u0001\u0010£\u0001R\u001d\u0010¨\u0001\u001a\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u00160¡\u00018F¢\u0006\b\u001a\u0006\b§\u0001\u0010£\u0001R#\u0010ª\u0001\u001a\u0011\u0012\f\u0012\n\u0018\u00010\u001aj\u0004\u0018\u0001`\u001b0¡\u00018F¢\u0006\b\u001a\u0006\b©\u0001\u0010£\u0001R\u001b\u0010®\u0001\u001a\t\u0012\u0004\u0012\u00020 0«\u00018F¢\u0006\b\u001a\u0006\b¬\u0001\u0010\u00ad\u0001R\u001e\u0010°\u0001\u001a\t\u0012\u0004\u0012\u00020\u00160¡\u00018BX\u0082\u0004¢\u0006\b\u001a\u0006\b¯\u0001\u0010£\u0001¨\u0006³\u0001"}, d2 = {"Lru/ozon/app/android/search/dialogsearchscreen/DialogSearchViewModel;", "Landroidx/lifecycle/w0;", "Lru/ozon/app/android/search/widgets/dialogSearchBar/data/DialogSearchBarMapper;", "mapper", "Lru/ozon/app/android/composer/widgets/async/data/ComposerAsyncWidgetRepository;", "asyncWidgetRepository", "LGZ/g;", "router", "Lru/ozon/app/android/search/widgets/dialogSearchBar/data/api/DialogSearchInteractionsApi;", "dialogSearchInteractionsApi", "LWZ/l;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedAnalytics;", "tokenizedAnalytics", "<init>", "(Lru/ozon/app/android/search/widgets/dialogSearchBar/data/DialogSearchBarMapper;Lru/ozon/app/android/composer/widgets/async/data/ComposerAsyncWidgetRepository;LGZ/g;Lru/ozon/app/android/search/widgets/dialogSearchBar/data/api/DialogSearchInteractionsApi;LWZ/l;)V", "", "onCleared", "()V", "Lru/ozon/app/android/search/widgets/dialogSearchBar/presentation/DialogSearchBarVO;", "model", "onSearchBarModelUpdated", "(Lru/ozon/app/android/search/widgets/dialogSearchBar/presentation/DialogSearchBarVO;)V", "", AppMeasurementSdk.ConditionalUserProperty.VALUE, "onQueryChanged", "(Ljava/lang/String;)V", "Lru/ozon/composer/ui/widget/l;", "Lru/ozon/app/android/composer/view/ComposerViewObject;", "nestedWidget", "insertNestedWidget", "(Lru/ozon/composer/ui/widget/l;)V", "subscribeSearchValue", "", "isDisable", "onSearchInputState", "(Z)V", "text", "getRefreshUrlByEnter", "(Ljava/lang/String;)Ljava/lang/String;", "", "minTextLength", "searchUrl", "suggestUrl", "cellToken", "widgetToken", "handleRedirectToGlobalAction", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getEnterUrl", "Lru/ozon/uni/atoms/af/AtomAction$Click;", "atomAction", "actionId", "handleTapTagAction", "(Lru/ozon/uni/atoms/af/AtomAction$Click;Ljava/lang/String;)V", "LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "getPageInteractionEvent", "()LWZ/t;", "getReturnKeyEvent", "getPageRefreshEvent", "Lru/ozon/app/android/search/widgets/dialogSearchBar/data/api/ActionType;", TrinityEventEntityKt.ACTION_TYPE_JSON_NAME, "pageUrl", "sendInteraction", "(Lru/ozon/app/android/search/widgets/dialogSearchBar/data/api/ActionType;Ljava/lang/String;)V", "clearInteractions", "Lkotlin/Function0;", "onSuccess", "sendInteractionInternal", "(Lru/ozon/app/android/search/widgets/dialogSearchBar/data/api/ActionType;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V", "composerCurrentLink", "getUrlToRefreshByEnter", "getAiDialogUrlForRefresh", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "searchValue", "handleSearchValue", "action", "onTapTagClicked", "(Lru/ozon/uni/atoms/af/AtomAction$Click;)V", "processAsyncEvent", "vo", "handlePageRefresh", "shouldRefreshPage", "(Lru/ozon/app/android/search/widgets/dialogSearchBar/presentation/DialogSearchBarVO;)Z", "asyncData", "setAsyncData", ImagesContract.URL, "isNeedToTrackSearchEvent", "refreshPage", "(Ljava/lang/String;ZLkotlin/coroutines/d;)Ljava/lang/Object;", "decodeUrl", "url1", "url2", "areUrlsEqualIgnoringParamOrder", "(Ljava/lang/String;Ljava/lang/String;)Z", SearchIntents.EXTRA_QUERY, "", "Lkotlin/Pair;", "parseDecodedParams", "(Ljava/lang/String;)Ljava/util/List;", "Lru/ozon/app/android/search/widgets/dialogSearchBar/data/DialogSearchBarMapper;", "Lru/ozon/app/android/composer/widgets/async/data/ComposerAsyncWidgetRepository;", "LGZ/g;", "Lru/ozon/app/android/search/widgets/dialogSearchBar/data/api/DialogSearchInteractionsApi;", "LWZ/l;", "currentPage", "Ljava/lang/String;", "getCurrentPage", "()Ljava/lang/String;", "setCurrentPage", "refreshUrl", "getRefreshUrl", "setRefreshUrl", "prevOffset", "Ljava/lang/Integer;", "getPrevOffset", "()Ljava/lang/Integer;", "setPrevOffset", "(Ljava/lang/Integer;)V", "Lru/ozon/app/android/search/dialogsearchscreen/withTopFilters/DialogSearchScrollingState;", "collapsingState", "Lru/ozon/app/android/search/dialogsearchscreen/withTopFilters/DialogSearchScrollingState;", "getCollapsingState", "()Lru/ozon/app/android/search/dialogsearchscreen/withTopFilters/DialogSearchScrollingState;", "setCollapsingState", "(Lru/ozon/app/android/search/dialogsearchscreen/withTopFilters/DialogSearchScrollingState;)V", "oldText", "getOldText", "setOldText", "needToClearCache", "Z", "getNeedToClearCache", "()Z", "setNeedToClearCache", "", "lastTrackedLinks", "Ljava/util/Map;", "prevSearchValue", "wasTextChangedByTapTag", "localSearchBarModel", "Lru/ozon/app/android/search/widgets/dialogSearchBar/presentation/DialogSearchBarVO;", "Lru/ozon/app/android/search/widgets/dialogSearchBar/presentation/DialogSearchBarVO$RefreshInfoVO;", "widgetRefreshModel", "Lru/ozon/app/android/search/widgets/dialogSearchBar/presentation/DialogSearchBarVO$RefreshInfoVO;", "currentSearchQuery", "isFirstInputSet", "lastRefreshedSText", "LAe/w0;", "Lru/ozon/app/android/search/dialogsearchscreen/searchbar/common/PageRefreshState;", "_pageRefreshModel", "LAe/w0;", "Lxe/B0;", "pageRefreshJob", "Lxe/B0;", "widgetRefreshJob", "_searchBarModel", "_tapTagQuery", "_searchQuery", "_nestedWidgets", "LAe/x0;", "_searchInputDisableState", "LAe/x0;", "LAe/h;", "getPageRefreshModelFlow", "()LAe/h;", "pageRefreshModelFlow", "getSearchBarModelFlow", "searchBarModelFlow", "getTapTagQueryFlow", "tapTagQueryFlow", "getNestedWidgetsFlow", "nestedWidgetsFlow", "LAe/M0;", "getSearchInputDisableState", "()LAe/M0;", "searchInputDisableState", "getSearchQueryFlow", "searchQueryFlow", "Companion", "TapTagActions", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class DialogSearchViewModel extends w0 {

    @NotNull
    private final Ae.w0<l> _nestedWidgets;

    @NotNull
    private final Ae.w0<PageRefreshState> _pageRefreshModel;

    @NotNull
    private final Ae.w0<DialogSearchBarVO> _searchBarModel;

    @NotNull
    private final x0<Boolean> _searchInputDisableState;

    @NotNull
    private final Ae.w0<String> _searchQuery;

    @NotNull
    private final Ae.w0<String> _tapTagQuery;
    private String asyncData;

    @NotNull
    private final ComposerAsyncWidgetRepository asyncWidgetRepository;
    private DialogSearchScrollingState collapsingState;
    private String currentPage;

    @NotNull
    private String currentSearchQuery;

    @NotNull
    private final DialogSearchInteractionsApi dialogSearchInteractionsApi;
    private boolean isFirstInputSet;
    private String lastRefreshedSText;

    @NotNull
    private final Map<ActionType, String> lastTrackedLinks;
    private DialogSearchBarVO localSearchBarModel;

    @NotNull
    private final DialogSearchBarMapper mapper;
    private boolean needToClearCache;
    private String oldText;
    private B0 pageRefreshJob;
    private Integer prevOffset;

    @NotNull
    private String prevSearchValue;
    private String refreshUrl;

    @NotNull
    private final g router;

    @NotNull
    private final WZ.l tokenizedAnalytics;
    private boolean wasTextChangedByTapTag;
    private B0 widgetRefreshJob;
    private DialogSearchBarVO.RefreshInfoVO widgetRefreshModel;
    public static final int $stable = 8;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"Lru/ozon/app/android/search/dialogsearchscreen/DialogSearchViewModel$TapTagActions;", "", "actionId", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getActionId", "()Ljava/lang/String;", "APPLY_TEXT_TAG", "APPLY_FILTER_TAG", "REMOVE_USED_FILTER_TAG", "APPLY_HISTORY_TAG", "DELETE_USED_TAGS", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class TapTagActions {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ TapTagActions[] $VALUES;

        @NotNull
        private final String actionId;
        public static final TapTagActions APPLY_TEXT_TAG = new TapTagActions("APPLY_TEXT_TAG", 0, "applyTextTag");
        public static final TapTagActions APPLY_FILTER_TAG = new TapTagActions("APPLY_FILTER_TAG", 1, "applyFilterTag");
        public static final TapTagActions REMOVE_USED_FILTER_TAG = new TapTagActions("REMOVE_USED_FILTER_TAG", 2, "removeUsedFilterTag");
        public static final TapTagActions APPLY_HISTORY_TAG = new TapTagActions("APPLY_HISTORY_TAG", 3, "applyHistoryTag");
        public static final TapTagActions DELETE_USED_TAGS = new TapTagActions("DELETE_USED_TAGS", 4, "deleteUsedTag");

        private static final /* synthetic */ TapTagActions[] $values() {
            return new TapTagActions[]{APPLY_TEXT_TAG, APPLY_FILTER_TAG, REMOVE_USED_FILTER_TAG, APPLY_HISTORY_TAG, DELETE_USED_TAGS};
        }

        static {
            TapTagActions[] $values = $values();
            $VALUES = $values;
            $ENTRIES = b.a($values);
        }

        private TapTagActions(String str, int i11, String str2) {
            this.actionId = str2;
        }

        public static TapTagActions valueOf(String str) {
            return (TapTagActions) Enum.valueOf(TapTagActions.class, str);
        }

        public static TapTagActions[] values() {
            return (TapTagActions[]) $VALUES.clone();
        }

        @NotNull
        public final String getActionId() {
            return this.actionId;
        }
    }

    public DialogSearchViewModel(@NotNull DialogSearchBarMapper mapper, @NotNull ComposerAsyncWidgetRepository asyncWidgetRepository, @NotNull g router, @NotNull DialogSearchInteractionsApi dialogSearchInteractionsApi, @NotNull WZ.l tokenizedAnalytics) {
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(asyncWidgetRepository, "asyncWidgetRepository");
        Intrinsics.checkNotNullParameter(router, "router");
        Intrinsics.checkNotNullParameter(dialogSearchInteractionsApi, "dialogSearchInteractionsApi");
        Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
        this.mapper = mapper;
        this.asyncWidgetRepository = asyncWidgetRepository;
        this.router = router;
        this.dialogSearchInteractionsApi = dialogSearchInteractionsApi;
        this.tokenizedAnalytics = tokenizedAnalytics;
        this.needToClearCache = true;
        this.lastTrackedLinks = new LinkedHashMap();
        this.prevSearchValue = "";
        this.currentSearchQuery = "";
        this.isFirstInputSet = true;
        this._pageRefreshModel = E0.b(0, 0, null, 7);
        this._searchBarModel = E0.b(0, 0, null, 7);
        this._tapTagQuery = E0.b(0, 0, null, 7);
        this._searchQuery = E0.b(0, 0, null, 7);
        this._nestedWidgets = E0.b(0, 0, null, 7);
        this._searchInputDisableState = O0.a(Boolean.FALSE);
    }

    private final boolean areUrlsEqualIgnoringParamOrder(String url1, String url2) {
        if (url1 == null || url1.length() == 0 || url2 == null || url2.length() == 0) {
            return false;
        }
        if (Intrinsics.d(url1, url2)) {
            return true;
        }
        Uri parse = Uri.parse(UriExtKt.removeSchema(url1));
        Uri parse2 = Uri.parse(UriExtKt.removeSchema(url2));
        String path = parse.getPath();
        String D02 = path != null ? h.D0(path, '/') : null;
        String path2 = parse2.getPath();
        if (!Intrinsics.d(D02, path2 != null ? h.D0(path2, '/') : null)) {
            return false;
        }
        List<Pair<String, String>> parseDecodedParams = parseDecodedParams(parse.getEncodedQuery());
        List<Pair<String, String>> parseDecodedParams2 = parseDecodedParams(parse2.getEncodedQuery());
        if (parseDecodedParams.size() != parseDecodedParams2.size()) {
            return false;
        }
        return Intrinsics.d(C7714v.I0(new Comparator() { // from class: ru.ozon.app.android.search.dialogsearchscreen.DialogSearchViewModel$areUrlsEqualIgnoringParamOrder$$inlined$sortedBy$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t2, T t11) {
                return Vc.a.b((String) ((Pair) t2).e(), (String) ((Pair) t11).e());
            }
        }, parseDecodedParams), C7714v.I0(new Comparator() { // from class: ru.ozon.app.android.search.dialogsearchscreen.DialogSearchViewModel$areUrlsEqualIgnoringParamOrder$$inlined$sortedBy$2
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t2, T t11) {
                return Vc.a.b((String) ((Pair) t2).e(), (String) ((Pair) t11).e());
            }
        }, parseDecodedParams2));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [Sc.r$b] */
    private final String decodeUrl(String url) {
        String str;
        try {
            r.Companion companion = r.INSTANCE;
            str = URLDecoder.decode(url, StandardCharsets.UTF_8.name());
        } catch (Throwable th2) {
            r.Companion companion2 = r.INSTANCE;
            str = s.a(th2);
        }
        if (!(str instanceof r.b)) {
            url = str;
        }
        return url;
    }

    private final String getAiDialogUrlForRefresh(String composerCurrentLink, String text) {
        String X9;
        Uri parse;
        Uri removeQueryParameter;
        Uri.Builder replaceQueryParameter;
        Uri build;
        Uri.Builder replaceQueryParameter2;
        Uri uri = null;
        if (text == null || text.length() == 0) {
            return null;
        }
        if (composerCurrentLink != null && (X9 = h.X(composerCurrentLink, "/", "", false)) != null && (parse = Uri.parse(X9)) != null && (removeQueryParameter = ru.ozon.app.android.network.utils.UriExtKt.removeQueryParameter(parse, "ai_results_id")) != null && (replaceQueryParameter = ru.ozon.app.android.network.utils.UriExtKt.replaceQueryParameter(removeQueryParameter, "text", text)) != null && (build = replaceQueryParameter.build()) != null && (replaceQueryParameter2 = ru.ozon.app.android.network.utils.UriExtKt.replaceQueryParameter(build, "ai_mode", "init")) != null) {
            uri = replaceQueryParameter2.build();
        }
        return G.b(uri, "ozon://");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final InterfaceC2395h<String> getSearchQueryFlow() {
        return new C2406m0(this._searchQuery);
    }

    private final String getUrlToRefreshByEnter(String composerCurrentLink) {
        DialogSearchBarVO.ReturnKeyInfoVO returnKey;
        CommonControlSettings pressControl;
        AtomActionDTO action;
        String link;
        DialogSearchBarVO dialogSearchBarVO = this.localSearchBarModel;
        if (dialogSearchBarVO == null || (returnKey = dialogSearchBarVO.getReturnKey()) == null || (pressControl = returnKey.getPressControl()) == null || (action = pressControl.getAction()) == null || (link = action.getLink()) == null || areUrlsEqualIgnoringParamOrder(link, composerCurrentLink)) {
            return null;
        }
        return link;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handlePageRefresh(DialogSearchBarVO vo) {
        Uri parse;
        String queryParameter;
        if (shouldRefreshPage(vo)) {
            B0 b02 = this.pageRefreshJob;
            if (b02 != null) {
                b02.j(null);
            }
            String inputText = vo.getInputText();
            String str = inputText == null ? "" : inputText;
            DialogSearchBarVO.RefreshInfoVO pageRefresh = vo.getPageRefresh();
            String url = pageRefresh != null ? pageRefresh.getUrl() : null;
            this.pageRefreshJob = C10727i.c(androidx.lifecycle.x0.a(this), null, null, new DialogSearchViewModel$handlePageRefresh$1(vo, str, this, (url == null || (parse = Uri.parse(url)) == null || (queryParameter = parse.getQueryParameter("s_text")) == null) ? "" : queryParameter, url, null), 3);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleSearchValue(String searchValue) {
        if (searchValue.length() == 0 && this.prevSearchValue.length() > 0) {
            C10727i.c(androidx.lifecycle.x0.a(this), null, null, new DialogSearchViewModel$handleSearchValue$1(this, null), 3);
            return;
        }
        if (!this.wasTextChangedByTapTag && !SearchAiUtilsKt.isAiMode(this.currentPage)) {
            processAsyncEvent(searchValue);
        }
        this.wasTextChangedByTapTag = false;
    }

    private final void onTapTagClicked(AtomAction.Click action) {
        Map<String, String> params = action.getParams();
        C10727i.c(androidx.lifecycle.x0.a(this), null, null, new DialogSearchViewModel$onTapTagClicked$1(params != null ? params.get("result_text") : null, this, action, null), 3);
    }

    private final List<Pair<String, String>> parseDecodedParams(String query) {
        List m11;
        if (query == null || (m11 = h.m(query, new String[]{"&"}, 0, 6)) == null) {
            return K.f71697a;
        }
        List list = m11;
        ArrayList arrayList = new ArrayList(C7714v.z(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            List m12 = h.m((String) it.next(), new String[]{"="}, 2, 2);
            arrayList.add(new Pair(decodeUrl((String) m12.get(0)), decodeUrl((String) (1 < m12.size() ? m12.get(1) : ""))));
        }
        return arrayList;
    }

    private final void processAsyncEvent(String text) {
        String str;
        if (text.length() == 0 || (str = this.asyncData) == null) {
            return;
        }
        DialogSearchBarVO.RefreshInfoVO refreshInfoVO = this.widgetRefreshModel;
        String url = refreshInfoVO != null ? refreshInfoVO.getUrl() : null;
        if (url == null) {
            url = "";
        }
        String decodeUrl = decodeUrl(url);
        String X9 = h.X(text, "\n", "", false);
        LinkedHashMap l11 = U.l(new Pair(ImagesContract.URL, h.X(h.X(decodeUrl, "{text}", X9, false), "{p_text}", this.prevSearchValue, false)));
        B0 b02 = this.widgetRefreshJob;
        if (b02 != null) {
            b02.j(null);
        }
        this.widgetRefreshJob = C10727i.c(androidx.lifecycle.x0.a(this), null, null, new DialogSearchViewModel$processAsyncEvent$1(this, str, l11, X9, null), 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object refreshPage(String str, boolean z11, d<? super Unit> dVar) {
        DialogSearchViewModel$refreshPage$1 dialogSearchViewModel$refreshPage$1;
        int i11;
        DialogSearchViewModel dialogSearchViewModel;
        if (dVar instanceof DialogSearchViewModel$refreshPage$1) {
            dialogSearchViewModel$refreshPage$1 = (DialogSearchViewModel$refreshPage$1) dVar;
            int i12 = dialogSearchViewModel$refreshPage$1.label;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                dialogSearchViewModel$refreshPage$1.label = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = dialogSearchViewModel$refreshPage$1.result;
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                i11 = dialogSearchViewModel$refreshPage$1.label;
                if (i11 != 0) {
                    s.b(obj);
                    Ae.w0<PageRefreshState> w0Var = this._pageRefreshModel;
                    PageRefreshState pageRefreshState = new PageRefreshState(str, z11);
                    dialogSearchViewModel$refreshPage$1.L$0 = this;
                    dialogSearchViewModel$refreshPage$1.L$1 = str;
                    dialogSearchViewModel$refreshPage$1.label = 1;
                    if (w0Var.emit(pageRefreshState, dialogSearchViewModel$refreshPage$1) == aVar) {
                        return aVar;
                    }
                    dialogSearchViewModel = this;
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    str = (String) dialogSearchViewModel$refreshPage$1.L$1;
                    dialogSearchViewModel = (DialogSearchViewModel) dialogSearchViewModel$refreshPage$1.L$0;
                    s.b(obj);
                }
                dialogSearchViewModel.refreshUrl = str;
                return Unit.f71690a;
            }
        }
        dialogSearchViewModel$refreshPage$1 = new DialogSearchViewModel$refreshPage$1(this, dVar);
        Object obj2 = dialogSearchViewModel$refreshPage$1.result;
        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
        i11 = dialogSearchViewModel$refreshPage$1.label;
        if (i11 != 0) {
        }
        dialogSearchViewModel.refreshUrl = str;
        return Unit.f71690a;
    }

    static /* synthetic */ Object refreshPage$default(DialogSearchViewModel dialogSearchViewModel, String str, boolean z11, d dVar, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z11 = true;
        }
        return dialogSearchViewModel.refreshPage(str, z11, dVar);
    }

    private final void sendInteractionInternal(ActionType actionType, String pageUrl, Function0<Unit> onSuccess) {
        C10727i.c(androidx.lifecycle.x0.a(this), null, null, new DialogSearchViewModel$sendInteractionInternal$1(this, new DialogSearchInteractionsRequest(actionType, pageUrl), onSuccess, null), 3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ void sendInteractionInternal$default(DialogSearchViewModel dialogSearchViewModel, ActionType actionType, String str, Function0 function0, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            function0 = null;
        }
        dialogSearchViewModel.sendInteractionInternal(actionType, str, function0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setAsyncData(String asyncData) {
        this.asyncData = asyncData;
    }

    private final boolean shouldRefreshPage(DialogSearchBarVO vo) {
        String url;
        Uri parse;
        DialogSearchBarVO.RefreshInfoVO pageRefresh = vo.getPageRefresh();
        String queryParameter = (pageRefresh == null || (url = pageRefresh.getUrl()) == null || (parse = Uri.parse(url)) == null) ? null : parse.getQueryParameter("s_text");
        return !(queryParameter == null || queryParameter.length() == 0);
    }

    public final void clearInteractions() {
        if (this.needToClearCache) {
            this.lastTrackedLinks.clear();
        }
        this.needToClearCache = true;
    }

    public final DialogSearchScrollingState getCollapsingState() {
        return this.collapsingState;
    }

    public final String getEnterUrl(String text) {
        DialogSearchBarVO.ReturnKeyInfoVO returnKey;
        CommonControlSettings pressControl;
        AtomActionDTO action;
        if (SearchAiUtilsKt.isAiMode(this.currentPage)) {
            return getAiDialogUrlForRefresh(this.currentPage, text);
        }
        DialogSearchBarVO dialogSearchBarVO = this.localSearchBarModel;
        if (dialogSearchBarVO == null || (returnKey = dialogSearchBarVO.getReturnKey()) == null || (pressControl = returnKey.getPressControl()) == null || (action = pressControl.getAction()) == null) {
            return null;
        }
        return action.getLink();
    }

    @NotNull
    public final InterfaceC2395h<l> getNestedWidgetsFlow() {
        return this._nestedWidgets;
    }

    public final String getOldText() {
        return this.oldText;
    }

    public final t getPageInteractionEvent() {
        DialogSearchBarVO dialogSearchBarVO = this.localSearchBarModel;
        if (dialogSearchBarVO != null) {
            return dialogSearchBarVO.getPageInteraction();
        }
        return null;
    }

    public final t getPageRefreshEvent() {
        DialogSearchBarVO.RefreshInfoVO pageRefresh;
        DialogSearchBarVO dialogSearchBarVO = this.localSearchBarModel;
        if (dialogSearchBarVO == null || (pageRefresh = dialogSearchBarVO.getPageRefresh()) == null) {
            return null;
        }
        return pageRefresh.getTracking();
    }

    @NotNull
    public final InterfaceC2395h<PageRefreshState> getPageRefreshModelFlow() {
        return new C2406m0(this._pageRefreshModel);
    }

    public final Integer getPrevOffset() {
        return this.prevOffset;
    }

    public final String getRefreshUrl() {
        return this.refreshUrl;
    }

    public final String getRefreshUrlByEnter(String text) {
        return SearchAiUtilsKt.isAiMode(this.currentPage) ? getAiDialogUrlForRefresh(this.currentPage, text) : getUrlToRefreshByEnter(this.currentPage);
    }

    public final t getReturnKeyEvent() {
        DialogSearchBarVO.ReturnKeyInfoVO returnKey;
        CommonControlSettings pressControl;
        Map<String, TokenizedTrackingInfo> trackingInfo;
        DialogSearchBarVO dialogSearchBarVO = this.localSearchBarModel;
        if (dialogSearchBarVO == null || (returnKey = dialogSearchBarVO.getReturnKey()) == null || (pressControl = returnKey.getPressControl()) == null || (trackingInfo = pressControl.getTrackingInfo()) == null) {
            return null;
        }
        DialogSearchBarVO dialogSearchBarVO2 = this.localSearchBarModel;
        return TrackingInfoMapperKt.mapToTokenizedEvent$default(trackingInfo, dialogSearchBarVO2 != null ? Long.valueOf(dialogSearchBarVO2.getId()) : null, null, 2, null);
    }

    @NotNull
    public final InterfaceC2395h<DialogSearchBarVO> getSearchBarModelFlow() {
        return C2399j.o(this._searchBarModel);
    }

    @NotNull
    public final M0<Boolean> getSearchInputDisableState() {
        return C2399j.b(this._searchInputDisableState);
    }

    @NotNull
    public final InterfaceC2395h<String> getTapTagQueryFlow() {
        return this._tapTagQuery;
    }

    public final void handleRedirectToGlobalAction(int minTextLength, @NotNull String searchUrl, @NotNull String suggestUrl, String cellToken, String widgetToken) {
        Intrinsics.checkNotNullParameter(searchUrl, "searchUrl");
        Intrinsics.checkNotNullParameter(suggestUrl, "suggestUrl");
        if (this.currentSearchQuery.length() >= minTextLength) {
            TokenizedAnalyticsHelper.INSTANCE.processSearchClick(this.tokenizedAnalytics, widgetToken, cellToken, this.currentSearchQuery);
            suggestUrl = ru.ozon.app.android.network.utils.UriExtKt.replaceQueryParameter(Uri.parse(searchUrl), "text", this.currentSearchQuery).toString();
        }
        Intrinsics.f(suggestUrl);
        g.a.a(this.router, suggestUrl, null, null, 6);
    }

    public final void handleTapTagAction(@NotNull AtomAction.Click atomAction, String actionId) {
        Intrinsics.checkNotNullParameter(atomAction, "atomAction");
        if (Intrinsics.d(actionId, TapTagActions.APPLY_TEXT_TAG.getActionId())) {
            onTapTagClicked(atomAction);
            return;
        }
        if (Intrinsics.d(actionId, TapTagActions.APPLY_FILTER_TAG.getActionId())) {
            onTapTagClicked(atomAction);
            return;
        }
        if (Intrinsics.d(actionId, TapTagActions.REMOVE_USED_FILTER_TAG.getActionId())) {
            onTapTagClicked(atomAction);
        } else if (Intrinsics.d(actionId, TapTagActions.APPLY_HISTORY_TAG.getActionId())) {
            onTapTagClicked(atomAction);
        } else if (Intrinsics.d(actionId, TapTagActions.DELETE_USED_TAGS.getActionId())) {
            onTapTagClicked(atomAction);
        }
    }

    public final void insertNestedWidget(l nestedWidget) {
        C10727i.c(androidx.lifecycle.x0.a(this), null, null, new DialogSearchViewModel$insertNestedWidget$1(this, nestedWidget, null), 3);
    }

    @Override // androidx.lifecycle.w0
    protected void onCleared() {
        super.onCleared();
        B0 b02 = this.pageRefreshJob;
        if (b02 != null) {
            b02.j(null);
        }
        B0 b03 = this.widgetRefreshJob;
        if (b03 != null) {
            b03.j(null);
        }
        this.pageRefreshJob = null;
        this.widgetRefreshJob = null;
        this.localSearchBarModel = null;
        this.widgetRefreshModel = null;
    }

    public final void onQueryChanged(String value) {
        C10727i.c(androidx.lifecycle.x0.a(this), null, null, new DialogSearchViewModel$onQueryChanged$1(this, value, null), 3);
    }

    public final void onSearchBarModelUpdated(@NotNull DialogSearchBarVO model) {
        Intrinsics.checkNotNullParameter(model, "model");
        C10727i.c(androidx.lifecycle.x0.a(this), null, null, new DialogSearchViewModel$onSearchBarModelUpdated$1(this, model, null), 3);
    }

    public final void onSearchInputState(boolean isDisable) {
        C10727i.c(androidx.lifecycle.x0.a(this), null, null, new DialogSearchViewModel$onSearchInputState$1(this, isDisable, null), 3);
    }

    public final void sendInteraction(@NotNull ActionType actionType, String pageUrl) {
        Intrinsics.checkNotNullParameter(actionType, "actionType");
        if (areUrlsEqualIgnoringParamOrder(pageUrl, this.lastTrackedLinks.get(actionType)) || pageUrl == null) {
            return;
        }
        sendInteractionInternal$default(this, actionType, pageUrl, null, 4, null);
        this.lastTrackedLinks.put(actionType, pageUrl);
    }

    public final void setCollapsingState(DialogSearchScrollingState dialogSearchScrollingState) {
        this.collapsingState = dialogSearchScrollingState;
    }

    public final void setCurrentPage(String str) {
        this.currentPage = str;
    }

    public final void setNeedToClearCache(boolean z11) {
        this.needToClearCache = z11;
    }

    public final void setOldText(String str) {
        this.oldText = str;
    }

    public final void setPrevOffset(Integer num) {
        this.prevOffset = num;
    }

    public final void setRefreshUrl(String str) {
        this.refreshUrl = str;
    }

    public final void subscribeSearchValue() {
        C10727i.c(androidx.lifecycle.x0.a(this), null, null, new DialogSearchViewModel$subscribeSearchValue$1(this, null), 3);
    }
}
