package ru.ozon.app.android.common.filterWidgets.filters.presentation;

import A00.a;
import B0.C2454a;
import WZ.t;
import com.google.android.gms.common.internal.ImagesContract;
import i10.h;
import i10.l;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import l10.InterfaceC7851b;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.analytics.modules.tokenized.TokenizedAnalyticsExtensionsKt;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.TrackingInfoMapperKt;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0000\u0018\u0000 \"2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\"B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\f\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\f\u0010\rJS\u0010\u0017\u001a\u00020\u00032\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0014\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00132\u000e\b\u0002\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00130\u0015¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0019R\u0018\u0010\u001a\u001a\u0004\u0018\u00010\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0018\u0010\u001c\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u001eR\u001c\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00130\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u001fR$\u0010 \u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010!¨\u0006#"}, d2 = {"Lru/ozon/app/android/common/filterWidgets/filters/presentation/CustomRefreshHandler;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "Lru/ozon/app/android/composer/ComposerReferences;", "refs", "<init>", "(Lru/ozon/app/android/composer/ComposerReferences;)V", "Li10/h$b;", "getPostProcessingInfo", "()Li10/h$b;", "action", "invoke", "(Lru/ozon/uni/atoms/af/AtomAction;)V", "", ImagesContract.URL, "", "id", "actionHandler", "", "scrollWidgetKey", "Lkotlin/Function0;", "scrollOffsetCallback", "bind", "(Ljava/lang/String;Ljava/lang/Long;Lkotlin/jvm/functions/Function1;Ljava/lang/Integer;Lkotlin/jvm/functions/Function0;)V", "Lru/ozon/app/android/composer/ComposerReferences;", "originalUrl", "Ljava/lang/String;", "voId", "Ljava/lang/Long;", "Ljava/lang/Integer;", "Lkotlin/jvm/functions/Function0;", "defaultActionHandler", "Lkotlin/jvm/functions/Function1;", "Companion", "filter-widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class CustomRefreshHandler implements Function1<AtomAction, Unit> {
    private Function1<? super AtomAction, Unit> defaultActionHandler;
    private String originalUrl;

    @NotNull
    private final ComposerReferences refs;

    @NotNull
    private Function0<Integer> scrollOffsetCallback;
    private Integer scrollWidgetKey;
    private Long voId;

    public CustomRefreshHandler(@NotNull ComposerReferences refs) {
        Intrinsics.checkNotNullParameter(refs, "refs");
        this.refs = refs;
        this.scrollOffsetCallback = CustomRefreshHandler$scrollOffsetCallback$1.INSTANCE;
    }

    public static /* synthetic */ void bind$default(CustomRefreshHandler customRefreshHandler, String str, Long l11, Function1 function1, Integer num, Function0 function0, int i11, Object obj) {
        if ((i11 & 8) != 0) {
            num = null;
        }
        Integer num2 = num;
        if ((i11 & 16) != 0) {
            function0 = CustomRefreshHandler$bind$1.INSTANCE;
        }
        customRefreshHandler.bind(str, l11, function1, num2, function0);
    }

    private final h.b getPostProcessingInfo() {
        Integer num = this.scrollWidgetKey;
        return new h.b(num != null ? new a.C.d(num.intValue(), this.scrollOffsetCallback.invoke().intValue(), 28, false) : null, new l.a.b(0L, 0, 1));
    }

    public final void bind(String url, Long id2, Function1<? super AtomAction, Unit> actionHandler, Integer scrollWidgetKey, @NotNull Function0<Integer> scrollOffsetCallback) {
        Intrinsics.checkNotNullParameter(scrollOffsetCallback, "scrollOffsetCallback");
        this.scrollWidgetKey = scrollWidgetKey;
        this.scrollOffsetCallback = scrollOffsetCallback;
        this.originalUrl = url;
        this.voId = id2;
        this.defaultActionHandler = actionHandler;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(AtomAction atomAction) {
        invoke2(atomAction);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public void invoke2(@NotNull AtomAction action) {
        String link;
        t mapToTokenizedEvent$default;
        Intrinsics.checkNotNullParameter(action, "action");
        Unit unit = null;
        AtomAction.Refresh refresh = action instanceof AtomAction.Refresh ? (AtomAction.Refresh) action : null;
        if (refresh != null && (link = refresh.getLink()) != null) {
            String str = this.originalUrl;
            if (str != null) {
                InterfaceC7851b.a.a(this.refs.getController(), link, C2454a.b("originalUrl", str), null, getPostProcessingInfo(), 4);
                Map<String, TokenizedTrackingInfo> trackingInfo = ((AtomAction.Refresh) action).getTrackingInfo();
                if (trackingInfo != null && (mapToTokenizedEvent$default = TrackingInfoMapperKt.mapToTokenizedEvent$default(trackingInfo, this.voId, null, 2, null)) != null) {
                    TokenizedAnalyticsExtensionsKt.processNonViewEvents$default(this.refs.getTokenizedAnalytics(), mapToTokenizedEvent$default, null, 2, null);
                    unit = Unit.f71690a;
                }
            }
            if (unit != null) {
                return;
            }
        }
        Function1<? super AtomAction, Unit> function1 = this.defaultActionHandler;
        if (function1 != null) {
            function1.invoke(action);
            Unit unit2 = Unit.f71690a;
        }
    }
}
