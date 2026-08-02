package ru.ozon.app.android.search.widgets.feedbackForm.common;

import Sc.InterfaceC4008j;
import Sc.k;
import UZ.a;
import UZ.d;
import WZ.e;
import WZ.g;
import WZ.l;
import WZ.t;
import WZ.x;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.U;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.analytics.modules.tokenized.TokenizedAnalyticsExtensionsKt;
import ru.ozon.app.android.search.widgets.feedbackForm.common.FeedbackAnalyticDelegate;
import ru.ozon.app.android.search.widgets.feedbackForm.common.searchAnalytics.SearchAnalyticsRepository;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.tracker.model.TrinityEventEntityKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.utils.OzonSpannableString;
import xe.C10727i;
import xe.M;

@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u0000 *2\u00020\u0001:\u0001*B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ#\u0010\u0011\u001a\u00060\u000fj\u0002`\u00102\u0006\u0010\r\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J1\u0010\u001a\u001a\u00020\n2\n\u0010\u0015\u001a\u00060\u0013j\u0002`\u00142\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u001a\u0010\u001bJ1\u0010\u001f\u001a\u00020\n2\n\u0010\u0015\u001a\u00060\u0013j\u0002`\u00142\u000e\u0010\u001e\u001a\n\u0018\u00010\u001cj\u0004\u0018\u0001`\u001d2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u001f\u0010 J)\u0010!\u001a\u00020\n2\n\u0010\u0015\u001a\u00060\u0013j\u0002`\u00142\u000e\u0010\u001e\u001a\n\u0018\u00010\u001cj\u0004\u0018\u0001`\u001d¢\u0006\u0004\b!\u0010\"R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010#R\u001b\u0010)\u001a\u00020$8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(¨\u0006+"}, d2 = {"Lru/ozon/app/android/search/widgets/feedbackForm/common/FeedbackAnalyticDelegate;", "", "Lru/ozon/app/android/search/widgets/feedbackForm/common/searchAnalytics/SearchAnalyticsRepository;", "searchAnalyticsRepository", "<init>", "(Lru/ozon/app/android/search/widgets/feedbackForm/common/searchAnalytics/SearchAnalyticsRepository;)V", "Lru/ozon/app/android/search/widgets/feedbackForm/common/CustomSearchAnalyticsData;", "customSearchAnalytics", "", TrinityEventEntityKt.ACTION_TYPE_JSON_NAME, "", "sendCustomSearchAnalytics", "(Lru/ozon/app/android/search/widgets/feedbackForm/common/CustomSearchAnalyticsData;Ljava/lang/String;)V", SelectionItemFormDTO.TITLE_FIELD_NAME, "customUserText", "LWZ/e;", "Lru/ozon/app/android/analytics/modules/tokenized/CustomParamsModifier;", "modifyAnalyticsData", "(Ljava/lang/String;Ljava/lang/String;)LWZ/e;", "LWZ/l;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedAnalytics;", "tokenizedAnalytics", "Lru/ozon/uni/atoms/af/AtomAction$Dismiss;", "action", "", "voId", "sendSubmitAnalytics", "(LWZ/l;Lru/ozon/uni/atoms/af/AtomAction$Dismiss;JLru/ozon/app/android/search/widgets/feedbackForm/common/CustomSearchAnalyticsData;)V", "LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "tokenizedEvent", "sendSkipAnalytics", "(LWZ/l;LWZ/t;Lru/ozon/app/android/search/widgets/feedbackForm/common/CustomSearchAnalyticsData;)V", "sendViewAnalytics", "(LWZ/l;LWZ/t;)V", "Lru/ozon/app/android/search/widgets/feedbackForm/common/searchAnalytics/SearchAnalyticsRepository;", "Lxe/M;", "coroutineScope$delegate", "LSc/j;", "getCoroutineScope", "()Lxe/M;", "coroutineScope", "Companion", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class FeedbackAnalyticDelegate {

    /* renamed from: coroutineScope$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j coroutineScope;

    @NotNull
    private final SearchAnalyticsRepository searchAnalyticsRepository;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lru/ozon/app/android/search/widgets/feedbackForm/common/FeedbackAnalyticDelegate$Companion;", "", "<init>", "()V", "SKIP_ACTION_TYPE", "", "SUBMIT_ACTION_TYPE", "SELECTED_OPTION_TITLE_KEY", "SELECTED_OPTION_CUSTOM_TEXT_KEY", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public FeedbackAnalyticDelegate(@NotNull SearchAnalyticsRepository searchAnalyticsRepository) {
        Intrinsics.checkNotNullParameter(searchAnalyticsRepository, "searchAnalyticsRepository");
        this.searchAnalyticsRepository = searchAnalyticsRepository;
        this.coroutineScope = k.b(FeedbackAnalyticDelegate$coroutineScope$2.INSTANCE);
    }

    private final M getCoroutineScope() {
        return (M) this.coroutineScope.getValue();
    }

    private final e modifyAnalyticsData(final String title, final String customUserText) {
        return new e() { // from class: sI.a
            @Override // WZ.e
            public final g modifyParams(UZ.a aVar, g gVar) {
                g modifyAnalyticsData$lambda$4;
                modifyAnalyticsData$lambda$4 = FeedbackAnalyticDelegate.modifyAnalyticsData$lambda$4(title, customUserText, (d) aVar, gVar);
                return modifyAnalyticsData$lambda$4;
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g modifyAnalyticsData$lambda$4(String str, String str2, a aVar, g params) {
        Intrinsics.checkNotNullParameter(aVar, "<unused var>");
        Intrinsics.checkNotNullParameter(params, "params");
        return g.a(params, U.j(new Pair("dimension4", str), new Pair("dimension5", str2)), null, 2);
    }

    private final void sendCustomSearchAnalytics(CustomSearchAnalyticsData customSearchAnalytics, String actionType) {
        if (customSearchAnalytics.getActionName() == null) {
            return;
        }
        C10727i.c(getCoroutineScope(), null, null, new FeedbackAnalyticDelegate$sendCustomSearchAnalytics$1$1(this, customSearchAnalytics, actionType, null), 3);
    }

    public final void sendSkipAnalytics(@NotNull l tokenizedAnalytics, t tokenizedEvent, @NotNull CustomSearchAnalyticsData customSearchAnalytics) {
        Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
        Intrinsics.checkNotNullParameter(customSearchAnalytics, "customSearchAnalytics");
        if (tokenizedEvent != null) {
            TokenizedAnalyticsExtensionsKt.processClickEvents$default(tokenizedAnalytics, tokenizedEvent, null, 2, null);
        }
        sendCustomSearchAnalytics(customSearchAnalytics, "skip");
    }

    public final void sendSubmitAnalytics(@NotNull l tokenizedAnalytics, @NotNull AtomAction.Dismiss action, long voId, @NotNull CustomSearchAnalyticsData customSearchAnalytics) {
        OzonSpannableString selectCellTitle;
        Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
        Intrinsics.checkNotNullParameter(action, "action");
        Intrinsics.checkNotNullParameter(customSearchAnalytics, "customSearchAnalytics");
        sendCustomSearchAnalytics(customSearchAnalytics, "submit");
        Map<String, TokenizedTrackingInfo> trackingInfo = action.getTrackingInfo();
        if (trackingInfo != null) {
            Long valueOf = Long.valueOf(voId);
            Intrinsics.checkNotNullParameter(trackingInfo, "<this>");
            t b11 = x.b(trackingInfo, valueOf, null);
            if (b11 == null || (selectCellTitle = customSearchAnalytics.getSelectCellTitle()) == null) {
                return;
            }
            String obj = selectCellTitle.toString();
            Intrinsics.checkNotNullExpressionValue(obj, "toString(...)");
            String optionText = customSearchAnalytics.getOptionText();
            if (optionText == null) {
                optionText = "";
            }
            TokenizedAnalyticsExtensionsKt.processClickEvents(tokenizedAnalytics, b11, modifyAnalyticsData(obj, optionText));
        }
    }

    public final void sendViewAnalytics(@NotNull l tokenizedAnalytics, t tokenizedEvent) {
        Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
        if (tokenizedEvent != null) {
            TokenizedAnalyticsExtensionsKt.processViewEvents$default(tokenizedAnalytics, tokenizedEvent, null, 2, null);
        }
    }
}
