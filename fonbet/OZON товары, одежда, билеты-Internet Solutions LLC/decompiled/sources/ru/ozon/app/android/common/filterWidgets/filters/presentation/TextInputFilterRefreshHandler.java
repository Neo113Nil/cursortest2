package ru.ozon.app.android.common.filterWidgets.filters.presentation;

import B0.C2454a;
import IO.a;
import WZ.e;
import WZ.g;
import android.net.Uri;
import com.google.android.gms.common.internal.ImagesContract;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.throttle.HandlersInhibitor;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\b\u0000\u0018\u0000 $2\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u0001$B\u0017\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\r\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u001b\u0010\u0011\u001a\u00060\u000fj\u0002`\u00102\u0006\u0010\f\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J \u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u0003H\u0096\u0002¢\u0006\u0004\b\u0014\u0010\u0015J7\u0010\u001a\u001a\u00020\u00042\b\u0010\u000b\u001a\u0004\u0018\u00010\u00032\b\u0010\u0017\u001a\u0004\u0018\u00010\u00162\u0014\u0010\u0019\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0018¢\u0006\u0004\b\u001a\u0010\u001bR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u001cR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u001dR\u0018\u0010\u001e\u001a\u0004\u0018\u00010\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0018\u0010 \u001a\u0004\u0018\u00010\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010!R$\u0010\"\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010#¨\u0006%"}, d2 = {"Lru/ozon/app/android/common/filterWidgets/filters/presentation/TextInputFilterRefreshHandler;", "Lkotlin/Function2;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "", "Lru/ozon/app/android/composer/throttle/HandlersInhibitor;", "handlersInhibitor", "Lru/ozon/app/android/composer/ComposerReferences;", "refs", "<init>", "(Lru/ozon/app/android/composer/throttle/HandlersInhibitor;Lru/ozon/app/android/composer/ComposerReferences;)V", ImagesContract.URL, AppMeasurementSdk.ConditionalUserProperty.VALUE, "modifyUrl", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "LWZ/e;", "Lru/ozon/app/android/analytics/modules/tokenized/CustomParamsModifier;", "modifyAnalyticsData", "(Ljava/lang/String;)LWZ/e;", "action", "invoke", "(Lru/ozon/uni/atoms/af/AtomAction;Ljava/lang/String;)V", "", "id", "Lkotlin/Function1;", "actionHandler", "bind", "(Ljava/lang/String;Ljava/lang/Long;Lkotlin/jvm/functions/Function1;)V", "Lru/ozon/app/android/composer/throttle/HandlersInhibitor;", "Lru/ozon/app/android/composer/ComposerReferences;", "originalUrl", "Ljava/lang/String;", "voId", "Ljava/lang/Long;", "defaultActionHandler", "Lkotlin/jvm/functions/Function1;", "Companion", "filter-widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class TextInputFilterRefreshHandler implements Function2<AtomAction, String, Unit> {
    private Function1<? super AtomAction, Unit> defaultActionHandler;

    @NotNull
    private final HandlersInhibitor handlersInhibitor;
    private String originalUrl;

    @NotNull
    private final ComposerReferences refs;
    private Long voId;

    public TextInputFilterRefreshHandler(@NotNull HandlersInhibitor handlersInhibitor, @NotNull ComposerReferences refs) {
        Intrinsics.checkNotNullParameter(handlersInhibitor, "handlersInhibitor");
        Intrinsics.checkNotNullParameter(refs, "refs");
        this.handlersInhibitor = handlersInhibitor;
        this.refs = refs;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final e modifyAnalyticsData(String value) {
        return new a(C2454a.b("filterValue", value), 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g modifyAnalyticsData$lambda$2(Map map, UZ.a aVar, g params) {
        Intrinsics.checkNotNullParameter(aVar, "<unused var>");
        Intrinsics.checkNotNullParameter(params, "params");
        return g.a(params, map, null, 2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String modifyUrl(String url, String value) {
        String encode = Uri.encode(value);
        Intrinsics.checkNotNullExpressionValue(encode, "encode(...)");
        return h.X(url, "{value}", encode, false);
    }

    public final void bind(String url, Long id2, Function1<? super AtomAction, Unit> actionHandler) {
        this.originalUrl = url;
        this.voId = id2;
        this.defaultActionHandler = actionHandler;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(AtomAction atomAction, String str) {
        invoke2(atomAction, str);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public void invoke2(@NotNull AtomAction action, @NotNull String value) {
        TextInputFilterRefreshHandler textInputFilterRefreshHandler;
        String link;
        Intrinsics.checkNotNullParameter(action, "action");
        Intrinsics.checkNotNullParameter(value, "value");
        Unit unit = null;
        AtomAction.Refresh refresh = action instanceof AtomAction.Refresh ? (AtomAction.Refresh) action : null;
        if (refresh == null || (link = refresh.getLink()) == null) {
            textInputFilterRefreshHandler = this;
        } else {
            String str = this.originalUrl;
            if (str != null) {
                textInputFilterRefreshHandler = this;
                HandlersInhibitor.run$default(this.handlersInhibitor, 0L, new TextInputFilterRefreshHandler$invoke$1$1$1(textInputFilterRefreshHandler, link, value, str, action), 1, null);
                unit = Unit.f71690a;
            } else {
                textInputFilterRefreshHandler = this;
            }
            if (unit != null) {
                return;
            }
        }
        Function1<? super AtomAction, Unit> function1 = textInputFilterRefreshHandler.defaultActionHandler;
        if (function1 != null) {
            function1.invoke(action);
            Unit unit2 = Unit.f71690a;
        }
    }
}
