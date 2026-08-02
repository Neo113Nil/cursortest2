package ru.ozon.app.android.action;

import Sc.o;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.U;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.analytics.ActionUsageAnalytics;
import ru.ozon.app.android.action.analytics.ActionUsageAnalyticsData;
import ru.ozon.app.android.action.analytics.ActionUsageAnalyticsTracking;
import ru.ozon.app.android.action.di.ActionComponentApi;
import ru.ozon.app.android.composer.ComposerNavigator;
import ru.ozon.app.android.composer.throttle.HandlersInhibitor;
import ru.ozon.app.android.composer.universalscreen.view.ComposerFragment;
import ru.ozon.app.android.composer.universalscreen.view.ComposerScreenConfig;
import ru.ozon.composer.ui.widget.l;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000²\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0016\b\u0017\u0018\u00002\u00020\u0001:\u0002bcB\u009b\u0001\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012&\u0010\t\u001a\"\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00060\u0005\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\b0\u00070\u0004\u0012\u0014\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\n\u0018\u00010\u0007\u0012\u0014\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\n\u0018\u00010\u0007\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u001a\u0010\u0013\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u00040\u0011\u0012\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u0015\u0010\u0019\u001a\u00020\b2\u0006\u0010\u0018\u001a\u00020\u0006¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001b\u001a\u00020\n2\u0006\u0010\u0018\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001d\u001a\u00020\n2\u0006\u0010\u0018\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u001d\u0010\u001cJ\u0017\u0010\u001e\u001a\u00020\b2\u0006\u0010\u0018\u001a\u00020\u0006H\u0004¢\u0006\u0004\b\u001e\u0010\u001aJ\u0017\u0010\u001f\u001a\u00020\b2\u0006\u0010\u0018\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u001f\u0010\u001aJ-\u0010\"\u001a\u00020\b2\u0006\u0010 \u001a\u00020\u00122\u0014\b\u0002\u0010!\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00010\u0004H\u0014¢\u0006\u0004\b\"\u0010#J\u0017\u0010%\u001a\u00020\b2\u0006\u0010\u0018\u001a\u00020$H\u0014¢\u0006\u0004\b%\u0010&J\u0017\u0010(\u001a\u00020\b2\u0006\u0010\u0018\u001a\u00020'H\u0014¢\u0006\u0004\b(\u0010)J\u0011\u0010+\u001a\u0004\u0018\u00010*H\u0014¢\u0006\u0004\b+\u0010,J\u000f\u0010-\u001a\u00020\bH\u0004¢\u0006\u0004\b-\u0010.J\u001d\u00100\u001a\u00020\b2\f\u0010/\u001a\b\u0012\u0004\u0012\u00020\b0\u0011H\u0004¢\u0006\u0004\b0\u00101J\u0017\u00103\u001a\u00020\b2\u0006\u0010\u0018\u001a\u000202H\u0002¢\u0006\u0004\b3\u00104J\u0017\u00106\u001a\u00020\b2\u0006\u0010\u0018\u001a\u000205H\u0002¢\u0006\u0004\b6\u00107J\u0017\u00109\u001a\u00020\b2\u0006\u0010\u0018\u001a\u000208H\u0002¢\u0006\u0004\b9\u0010:J\u0017\u0010<\u001a\u00020\b2\u0006\u0010\u0018\u001a\u00020;H\u0002¢\u0006\u0004\b<\u0010=J\u0017\u0010?\u001a\u00020\b2\u0006\u0010\u0018\u001a\u00020>H\u0002¢\u0006\u0004\b?\u0010@J\u0017\u0010B\u001a\u00020\b2\u0006\u0010\u0018\u001a\u00020AH\u0002¢\u0006\u0004\bB\u0010CJ\u0017\u0010E\u001a\u00020\b2\u0006\u0010\u0018\u001a\u00020DH\u0002¢\u0006\u0004\bE\u0010FJ\u0017\u0010H\u001a\u00020\b2\u0006\u0010\u0018\u001a\u00020GH\u0002¢\u0006\u0004\bH\u0010IJ\u0017\u0010K\u001a\u00020\b2\u0006\u0010\u0018\u001a\u00020JH\u0002¢\u0006\u0004\bK\u0010LJ/\u0010M\u001a\u00020\b2\b\u0010 \u001a\u0004\u0018\u00010\u00122\u0014\u0010!\u001a\u0010\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0004H\u0002¢\u0006\u0004\bM\u0010#J\u0017\u0010P\u001a\u00020\b2\u0006\u0010O\u001a\u00020NH\u0002¢\u0006\u0004\bP\u0010QR\u001a\u0010\u0003\u001a\u00020\u00028\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\u0003\u0010R\u001a\u0004\bS\u0010TR:\u0010\t\u001a\"\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00060\u0005\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\b0\u00070\u00048\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\t\u0010U\u001a\u0004\bV\u0010WR(\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\n\u0018\u00010\u00078\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\u000b\u0010X\u001a\u0004\bY\u0010ZR(\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\n\u0018\u00010\u00078\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\f\u0010X\u001a\u0004\b[\u0010ZR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\u000e\u0010\\\u001a\u0004\b]\u0010^R\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010_R(\u0010\u0013\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u00040\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010`R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010a¨\u0006d"}, d2 = {"Lru/ozon/app/android/action/BaseActionHandler;", "", "Lru/ozon/app/android/action/BaseActionHandler$Configs;", "configs", "", "Ljava/lang/Class;", "Lru/ozon/uni/atoms/af/AtomAction;", "Lkotlin/Function1;", "", "handlers", "", "preProcessHandler", "customAnalyticHandler", "Lru/ozon/app/android/composer/throttle/HandlersInhibitor;", "uiClickInhibitor", "Lru/ozon/app/android/composer/ComposerNavigator;", "navigator", "Lkotlin/Function0;", "", "nestedPageProvider", "Lru/ozon/app/android/action/analytics/ActionUsageAnalyticsTracking;", "usageAnalyticsTracking", "<init>", "(Lru/ozon/app/android/action/BaseActionHandler$Configs;Ljava/util/Map;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lru/ozon/app/android/composer/throttle/HandlersInhibitor;Lru/ozon/app/android/composer/ComposerNavigator;Lkotlin/jvm/functions/Function0;Lru/ozon/app/android/action/analytics/ActionUsageAnalyticsTracking;)V", "action", "handle", "(Lru/ozon/uni/atoms/af/AtomAction;)V", "processCustomAction", "(Lru/ozon/uni/atoms/af/AtomAction;)Z", "processDefaultAction", "sendAnalytics", "handleDefaultAnalytics", "link", "parameters", "openDeeplink", "(Ljava/lang/String;Ljava/util/Map;)V", "Lru/ozon/uni/atoms/af/AtomAction$Dismiss;", "handleDismiss", "(Lru/ozon/uni/atoms/af/AtomAction$Dismiss;)V", "Lru/ozon/uni/atoms/af/AtomAction$DismissRedirect;", "handleDismissRedirect", "(Lru/ozon/uni/atoms/af/AtomAction$DismissRedirect;)V", "Lru/ozon/composer/ui/widget/l;", "getWidgetViewItem", "()Lru/ozon/composer/ui/widget/l;", "dismiss", "()V", "block", "performWithThrottling", "(Lkotlin/jvm/functions/Function0;)V", "Lru/ozon/uni/atoms/af/AtomAction$Move;", "handleMove", "(Lru/ozon/uni/atoms/af/AtomAction$Move;)V", "Lru/ozon/uni/atoms/af/AtomAction$Click;", "handleClick", "(Lru/ozon/uni/atoms/af/AtomAction$Click;)V", "Lru/ozon/uni/atoms/af/AtomAction$OpenNestedPage;", "handleOpenNestedPage", "(Lru/ozon/uni/atoms/af/AtomAction$OpenNestedPage;)V", "Lru/ozon/uni/atoms/af/AtomAction$OpenComposerNestedPage;", "handleOpenComposerNestedPage", "(Lru/ozon/uni/atoms/af/AtomAction$OpenComposerNestedPage;)V", "Lru/ozon/uni/atoms/af/AtomAction$ComposerAction;", "handleComposerAction", "(Lru/ozon/uni/atoms/af/AtomAction$ComposerAction;)V", "Lru/ozon/uni/atoms/af/AtomAction$TextChange;", "handleTextChange", "(Lru/ozon/uni/atoms/af/AtomAction$TextChange;)V", "Lru/ozon/uni/atoms/af/AtomAction$InvalidAction;", "handleInvalidAction", "(Lru/ozon/uni/atoms/af/AtomAction$InvalidAction;)V", "Lru/ozon/uni/atoms/af/AtomAction$ViewAction;", "handleViewAction", "(Lru/ozon/uni/atoms/af/AtomAction$ViewAction;)V", "Lru/ozon/uni/atoms/af/AtomAction$IgnoreViewPoolViewAction;", "handleIgnoreViewPoolViewAction", "(Lru/ozon/uni/atoms/af/AtomAction$IgnoreViewPoolViewAction;)V", "dismissAndRedirect", "Lru/ozon/app/android/action/analytics/ActionUsageAnalyticsData;", "usageAnalyticsData", "trackActionUsageAnalytics", "(Lru/ozon/app/android/action/analytics/ActionUsageAnalyticsData;)V", "Lru/ozon/app/android/action/BaseActionHandler$Configs;", "getConfigs", "()Lru/ozon/app/android/action/BaseActionHandler$Configs;", "Ljava/util/Map;", "getHandlers", "()Ljava/util/Map;", "Lkotlin/jvm/functions/Function1;", "getPreProcessHandler", "()Lkotlin/jvm/functions/Function1;", "getCustomAnalyticHandler", "Lru/ozon/app/android/composer/throttle/HandlersInhibitor;", "getUiClickInhibitor", "()Lru/ozon/app/android/composer/throttle/HandlersInhibitor;", "Lru/ozon/app/android/composer/ComposerNavigator;", "Lkotlin/jvm/functions/Function0;", "Lru/ozon/app/android/action/analytics/ActionUsageAnalyticsTracking;", "Configs", "Builder", "action_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public class BaseActionHandler {

    @NotNull
    private final Configs configs;
    private final Function1<AtomAction, Boolean> customAnalyticHandler;

    @NotNull
    private final Map<Class<? extends AtomAction>, Function1<AtomAction, Unit>> handlers;

    @NotNull
    private final ComposerNavigator navigator;

    @NotNull
    private final Function0<Map<String, String>> nestedPageProvider;
    private final Function1<AtomAction, Boolean> preProcessHandler;
    private final HandlersInhibitor uiClickInhibitor;

    @NotNull
    private final ActionUsageAnalyticsTracking usageAnalyticsTracking;

    @Metadata(d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\b\b\u0017\u0018\u0000 P*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0001PB\u0019\b\u0004\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u001b\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0013\u001a\u00028\u00002\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0017\u001a\u00028\u00002\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0018J!\u0010\u001a\u001a\u00028\u00002\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00110\f¢\u0006\u0004\b\u001a\u0010\u001bJ!\u0010\u001c\u001a\u00028\u00002\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00110\f¢\u0006\u0004\b\u001c\u0010\u001bJ!\u0010\u001e\u001a\u00028\u00002\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u000e0\f¢\u0006\u0004\b\u001e\u0010\u001bJ!\u0010 \u001a\u00028\u00002\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\u000e0\f¢\u0006\u0004\b \u0010\u001bJ!\u0010\"\u001a\u00028\u00002\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\u000e0\f¢\u0006\u0004\b\"\u0010\u001bJ!\u0010$\u001a\u00028\u00002\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020\u000e0\f¢\u0006\u0004\b$\u0010\u001bJ\u0015\u0010'\u001a\u00028\u00002\u0006\u0010&\u001a\u00020%¢\u0006\u0004\b'\u0010(R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010)R\u001a\u0010\u0006\u001a\u00020\u00058\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\u0006\u0010*\u001a\u0004\b+\u0010,R:\u0010/\u001a\"\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\r0.\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\f0-8\u0004X\u0084\u0004¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102R8\u00106\u001a\u0018\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u000205\u0012\u0004\u0012\u000205\u0018\u000104\u0018\u0001038\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b6\u00107\u001a\u0004\b8\u00109\"\u0004\b:\u0010;R0\u0010<\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u0011\u0018\u00010\f8\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b<\u0010=\u001a\u0004\b>\u0010\u0010\"\u0004\b?\u0010@R0\u0010\u001c\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u0011\u0018\u00010\f8\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010=\u001a\u0004\bA\u0010\u0010\"\u0004\bB\u0010@R$\u0010C\u001a\u0004\u0018\u00010%8\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\bC\u0010D\u001a\u0004\bE\u0010F\"\u0004\bG\u0010HR\"\u0010J\u001a\u00020I8\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\bJ\u0010K\u001a\u0004\bL\u0010M\"\u0004\bN\u0010O¨\u0006Q"}, d2 = {"Lru/ozon/app/android/action/BaseActionHandler$Builder;", "T", "", "Lru/ozon/app/android/composer/ComposerNavigator;", "navigator", "Lru/ozon/app/android/action/analytics/ActionUsageAnalyticsTracking;", "usageAnalyticsTracking", "<init>", "(Lru/ozon/app/android/composer/ComposerNavigator;Lru/ozon/app/android/action/analytics/ActionUsageAnalyticsTracking;)V", "Lru/ozon/app/android/action/BaseActionHandler;", "build", "()Lru/ozon/app/android/action/BaseActionHandler;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "buildHandler", "()Lkotlin/jvm/functions/Function1;", "", "wrapContent", "configureBottomSheetWrapContent", "(Z)Ljava/lang/Object;", "Lru/ozon/app/android/composer/universalscreen/view/ComposerScreenConfig$BottomSheetConfig;", "config", "configureBottomSheet", "(Lru/ozon/app/android/composer/universalscreen/view/ComposerScreenConfig$BottomSheetConfig;)Ljava/lang/Object;", "handler", "onPreProcess", "(Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "customAnalyticHandler", "Lru/ozon/uni/atoms/af/AtomAction$Click;", "onClick", "Lru/ozon/uni/atoms/af/AtomAction$TextChange;", "onTextChanged", "Lru/ozon/uni/atoms/af/AtomAction$InvalidAction;", "onInvalidAction", "Lru/ozon/uni/atoms/af/AtomAction$ComposerAction;", "onComposerAction", "Lru/ozon/app/android/composer/throttle/HandlersInhibitor;", "inhibitor", "enableClickThrottling", "(Lru/ozon/app/android/composer/throttle/HandlersInhibitor;)Ljava/lang/Object;", "Lru/ozon/app/android/composer/ComposerNavigator;", "Lru/ozon/app/android/action/analytics/ActionUsageAnalyticsTracking;", "getUsageAnalyticsTracking", "()Lru/ozon/app/android/action/analytics/ActionUsageAnalyticsTracking;", "", "Ljava/lang/Class;", "handlers", "Ljava/util/Map;", "getHandlers", "()Ljava/util/Map;", "Lkotlin/Function0;", "", "", "nestedPageProvider", "Lkotlin/jvm/functions/Function0;", "getNestedPageProvider", "()Lkotlin/jvm/functions/Function0;", "setNestedPageProvider", "(Lkotlin/jvm/functions/Function0;)V", "preProcessHandler", "Lkotlin/jvm/functions/Function1;", "getPreProcessHandler", "setPreProcessHandler", "(Lkotlin/jvm/functions/Function1;)V", "getCustomAnalyticHandler", "setCustomAnalyticHandler", "uiClickInhibitor", "Lru/ozon/app/android/composer/throttle/HandlersInhibitor;", "getUiClickInhibitor", "()Lru/ozon/app/android/composer/throttle/HandlersInhibitor;", "setUiClickInhibitor", "(Lru/ozon/app/android/composer/throttle/HandlersInhibitor;)V", "Lru/ozon/app/android/action/BaseActionHandler$Configs;", "configs", "Lru/ozon/app/android/action/BaseActionHandler$Configs;", "getConfigs", "()Lru/ozon/app/android/action/BaseActionHandler$Configs;", "setConfigs", "(Lru/ozon/app/android/action/BaseActionHandler$Configs;)V", "Companion", "action_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static class Builder<T> {

        @NotNull
        private Configs configs;
        private Function1<? super AtomAction, Boolean> customAnalyticHandler;

        @NotNull
        private final Map<Class<? extends AtomAction>, Function1<AtomAction, Unit>> handlers;

        @NotNull
        private final ComposerNavigator navigator;
        private Function0<? extends Map<String, String>> nestedPageProvider;
        private Function1<? super AtomAction, Boolean> preProcessHandler;
        private HandlersInhibitor uiClickInhibitor;

        @NotNull
        private final ActionUsageAnalyticsTracking usageAnalyticsTracking;

        /* renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);
        public static final int $stable = 8;

        @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J#\u0010\u0004\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00050\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0086\u0002¨\u0006\n"}, d2 = {"Lru/ozon/app/android/action/BaseActionHandler$Builder$Companion;", "", "<init>", "()V", "invoke", "Lru/ozon/app/android/action/BaseActionHandler$Builder;", "navigator", "Lru/ozon/app/android/composer/ComposerNavigator;", "usageAnalyticsTracking", "Lru/ozon/app/android/action/analytics/ActionUsageAnalyticsTracking;", "action_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @NotNull
            public final Builder<Builder<?>> invoke(@NotNull ComposerNavigator navigator, @NotNull ActionUsageAnalyticsTracking usageAnalyticsTracking) {
                Intrinsics.checkNotNullParameter(navigator, "navigator");
                Intrinsics.checkNotNullParameter(usageAnalyticsTracking, "usageAnalyticsTracking");
                return new Builder<>(navigator, usageAnalyticsTracking);
            }

            private Companion() {
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        protected Builder(@NotNull ComposerNavigator navigator, @NotNull ActionUsageAnalyticsTracking usageAnalyticsTracking) {
            Intrinsics.checkNotNullParameter(navigator, "navigator");
            Intrinsics.checkNotNullParameter(usageAnalyticsTracking, "usageAnalyticsTracking");
            this.navigator = navigator;
            this.usageAnalyticsTracking = usageAnalyticsTracking;
            this.handlers = new LinkedHashMap();
            this.configs = new Configs(null, 1, 0 == true ? 1 : 0);
        }

        private final BaseActionHandler build() {
            ComposerNavigator composerNavigator = this.navigator;
            Configs configs = this.configs;
            Function0 function0 = this.nestedPageProvider;
            if (function0 == null) {
                function0 = BaseActionHandler$Builder$build$1.INSTANCE;
            }
            return new BaseActionHandler(configs, this.handlers, this.preProcessHandler, this.customAnalyticHandler, this.uiClickInhibitor, composerNavigator, function0, this.usageAnalyticsTracking);
        }

        @NotNull
        public Function1<AtomAction, Unit> buildHandler() {
            return new BaseActionHandler$Builder$buildHandler$1(build());
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final T configureBottomSheet(@NotNull ComposerScreenConfig.BottomSheetConfig config) {
            Intrinsics.checkNotNullParameter(config, "config");
            this.configs = new Configs(config);
            return this;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final T configureBottomSheetWrapContent(boolean wrapContent) {
            ComposerScreenConfig.BottomSheetConfig bottomSheetConfig;
            ComposerFragment.DisplayMode displayMode = wrapContent ? ComposerFragment.DisplayMode.BOTTOM_SHEET_WRAP : ComposerFragment.DisplayMode.BOTTOM_SHEET_FULL;
            ComposerScreenConfig.BottomSheetConfig bottomSheetConfig2 = this.configs.getBottomSheetConfig();
            if (bottomSheetConfig2 == null || (bottomSheetConfig = ComposerScreenConfig.BottomSheetConfig.copy$default(bottomSheetConfig2, displayMode, false, false, null, 0, false, false, false, false, false, false, 2046, null)) == null) {
                bottomSheetConfig = new ComposerScreenConfig.BottomSheetConfig(displayMode, false, false, null, 0, false, false, false, false, false, false, 2046, null);
            }
            this.configs = new Configs(bottomSheetConfig);
            return this;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final T customAnalyticHandler(@NotNull Function1<? super AtomAction, Boolean> handler) {
            Intrinsics.checkNotNullParameter(handler, "handler");
            this.customAnalyticHandler = handler;
            return this;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final T enableClickThrottling(@NotNull HandlersInhibitor inhibitor) {
            Intrinsics.checkNotNullParameter(inhibitor, "inhibitor");
            this.uiClickInhibitor = inhibitor;
            return this;
        }

        @NotNull
        protected final Configs getConfigs() {
            return this.configs;
        }

        protected final Function1<AtomAction, Boolean> getCustomAnalyticHandler() {
            return this.customAnalyticHandler;
        }

        @NotNull
        protected final Map<Class<? extends AtomAction>, Function1<AtomAction, Unit>> getHandlers() {
            return this.handlers;
        }

        protected final Function0<Map<String, String>> getNestedPageProvider() {
            return this.nestedPageProvider;
        }

        protected final Function1<AtomAction, Boolean> getPreProcessHandler() {
            return this.preProcessHandler;
        }

        protected final HandlersInhibitor getUiClickInhibitor() {
            return this.uiClickInhibitor;
        }

        @NotNull
        protected final ActionUsageAnalyticsTracking getUsageAnalyticsTracking() {
            return this.usageAnalyticsTracking;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final T onClick(@NotNull Function1<? super AtomAction.Click, Unit> handler) {
            Intrinsics.checkNotNullParameter(handler, "handler");
            Map<Class<? extends AtomAction>, Function1<AtomAction, Unit>> map = this.handlers;
            U.g(1, handler);
            map.put(AtomAction.Click.class, handler);
            return this;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final T onComposerAction(@NotNull Function1<? super AtomAction.ComposerAction, Unit> handler) {
            Intrinsics.checkNotNullParameter(handler, "handler");
            Map<Class<? extends AtomAction>, Function1<AtomAction, Unit>> map = this.handlers;
            U.g(1, handler);
            map.put(AtomAction.ComposerAction.class, handler);
            return this;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final T onInvalidAction(@NotNull Function1<? super AtomAction.InvalidAction, Unit> handler) {
            Intrinsics.checkNotNullParameter(handler, "handler");
            Map<Class<? extends AtomAction>, Function1<AtomAction, Unit>> map = this.handlers;
            U.g(1, handler);
            map.put(AtomAction.InvalidAction.class, handler);
            return this;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final T onPreProcess(@NotNull Function1<? super AtomAction, Boolean> handler) {
            Intrinsics.checkNotNullParameter(handler, "handler");
            this.preProcessHandler = handler;
            return this;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final T onTextChanged(@NotNull Function1<? super AtomAction.TextChange, Unit> handler) {
            Intrinsics.checkNotNullParameter(handler, "handler");
            Map<Class<? extends AtomAction>, Function1<AtomAction, Unit>> map = this.handlers;
            U.g(1, handler);
            map.put(AtomAction.TextChange.class, handler);
            return this;
        }

        protected final void setNestedPageProvider(Function0<? extends Map<String, String>> function0) {
            this.nestedPageProvider = function0;
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lru/ozon/app/android/action/BaseActionHandler$Configs;", "", "Lru/ozon/app/android/composer/universalscreen/view/ComposerScreenConfig$BottomSheetConfig;", "bottomSheetConfig", "<init>", "(Lru/ozon/app/android/composer/universalscreen/view/ComposerScreenConfig$BottomSheetConfig;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/app/android/composer/universalscreen/view/ComposerScreenConfig$BottomSheetConfig;", "getBottomSheetConfig", "()Lru/ozon/app/android/composer/universalscreen/view/ComposerScreenConfig$BottomSheetConfig;", "action_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Configs {
        public static final int $stable = ComposerScreenConfig.BottomSheetConfig.$stable;
        private final ComposerScreenConfig.BottomSheetConfig bottomSheetConfig;

        /* JADX WARN: Multi-variable type inference failed */
        public Configs() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Configs) && Intrinsics.d(this.bottomSheetConfig, ((Configs) other).bottomSheetConfig);
        }

        public final ComposerScreenConfig.BottomSheetConfig getBottomSheetConfig() {
            return this.bottomSheetConfig;
        }

        public int hashCode() {
            ComposerScreenConfig.BottomSheetConfig bottomSheetConfig = this.bottomSheetConfig;
            if (bottomSheetConfig == null) {
                return 0;
            }
            return bottomSheetConfig.hashCode();
        }

        @NotNull
        public String toString() {
            return "Configs(bottomSheetConfig=" + this.bottomSheetConfig + ")";
        }

        public Configs(ComposerScreenConfig.BottomSheetConfig bottomSheetConfig) {
            this.bottomSheetConfig = bottomSheetConfig;
        }

        public /* synthetic */ Configs(ComposerScreenConfig.BottomSheetConfig bottomSheetConfig, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? null : bottomSheetConfig);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected BaseActionHandler(@NotNull Configs configs, @NotNull Map<Class<? extends AtomAction>, ? extends Function1<? super AtomAction, Unit>> handlers, Function1<? super AtomAction, Boolean> function1, Function1<? super AtomAction, Boolean> function12, HandlersInhibitor handlersInhibitor, @NotNull ComposerNavigator navigator, @NotNull Function0<? extends Map<String, String>> nestedPageProvider, @NotNull ActionUsageAnalyticsTracking usageAnalyticsTracking) {
        Intrinsics.checkNotNullParameter(configs, "configs");
        Intrinsics.checkNotNullParameter(handlers, "handlers");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(nestedPageProvider, "nestedPageProvider");
        Intrinsics.checkNotNullParameter(usageAnalyticsTracking, "usageAnalyticsTracking");
        this.configs = configs;
        this.handlers = handlers;
        this.preProcessHandler = function1;
        this.customAnalyticHandler = function12;
        this.uiClickInhibitor = handlersInhibitor;
        this.navigator = navigator;
        this.nestedPageProvider = nestedPageProvider;
        this.usageAnalyticsTracking = usageAnalyticsTracking;
    }

    private final void dismissAndRedirect(String link, Map<String, ? extends Object> parameters) {
        dismiss();
        if (link != null) {
            if (parameters == null) {
                parameters = kotlin.collections.U.c();
            }
            openDeeplink(link, parameters);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleClick(AtomAction.Click action) {
        Function1<AtomAction, Unit> function1 = this.handlers.get(AtomAction.Click.class);
        if (function1 != null) {
            function1.invoke(action);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleComposerAction(AtomAction.ComposerAction action) {
        Function1<AtomAction, Unit> function1 = this.handlers.get(AtomAction.ComposerAction.class);
        if (function1 != null) {
            function1.invoke(action);
        }
    }

    private final void handleIgnoreViewPoolViewAction(AtomAction.IgnoreViewPoolViewAction action) {
        Function1<AtomAction, Unit> function1 = this.handlers.get(AtomAction.IgnoreViewPoolViewAction.class);
        if (function1 != null) {
            function1.invoke(action);
        }
    }

    private final void handleInvalidAction(AtomAction.InvalidAction action) {
        Function1<AtomAction, Unit> function1 = this.handlers.get(AtomAction.InvalidAction.class);
        if (function1 != null) {
            function1.invoke(action);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleMove(AtomAction.Move action) {
        String link = action.getLink();
        if (link != null) {
            Map<String, String> params = action.getParams();
            if (params == null) {
                params = kotlin.collections.U.c();
            }
            openDeeplink(link, params);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleOpenComposerNestedPage(AtomAction.OpenComposerNestedPage action) {
        WidgetActionHandlerKt.openComposerNestedPage(this.navigator, action, this.configs.getBottomSheetConfig());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleOpenNestedPage(AtomAction.OpenNestedPage action) {
        WidgetActionHandlerKt.openNestedPage(this.navigator, action, this.nestedPageProvider.invoke(), this.configs.getBottomSheetConfig());
    }

    private final void handleTextChange(AtomAction.TextChange action) {
        Function1<AtomAction, Unit> function1 = this.handlers.get(AtomAction.TextChange.class);
        if (function1 != null) {
            function1.invoke(action);
        }
    }

    private final void handleViewAction(AtomAction.ViewAction action) {
        Function1<AtomAction, Unit> function1 = this.handlers.get(AtomAction.ViewAction.class);
        if (function1 != null) {
            function1.invoke(action);
        }
    }

    private final void trackActionUsageAnalytics(ActionUsageAnalyticsData usageAnalyticsData) {
        ActionUsageAnalyticsTracking actionUsageAnalyticsTracking = this.usageAnalyticsTracking;
        if (actionUsageAnalyticsTracking instanceof ActionUsageAnalyticsTracking.Directly) {
            ActionUsageAnalytics actionUsageAnalytics = ((ActionUsageAnalyticsTracking.Directly) actionUsageAnalyticsTracking).getActionUsageAnalytics();
            if (actionUsageAnalytics.shouldTrack$action_prodGoogleAllVendorsRelease(usageAnalyticsData)) {
                actionUsageAnalytics.trackActionInvocation$action_prodGoogleAllVendorsRelease(usageAnalyticsData, null);
                return;
            }
            return;
        }
        if (!(actionUsageAnalyticsTracking instanceof ActionUsageAnalyticsTracking.ByComponentStorage)) {
            throw new o();
        }
        ActionUsageAnalytics actionUsageAnalytics2 = ((ActionComponentApi) ((ActionUsageAnalyticsTracking.ByComponentStorage) actionUsageAnalyticsTracking).getComponentStorage().getComponent(ActionComponentApi.class)).getActionUsageAnalytics();
        if (actionUsageAnalytics2.shouldTrack$action_prodGoogleAllVendorsRelease(usageAnalyticsData)) {
            actionUsageAnalytics2.trackActionInvocation$action_prodGoogleAllVendorsRelease(usageAnalyticsData, getWidgetViewItem());
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void dismiss() {
        this.navigator.popBackStack();
    }

    protected l getWidgetViewItem() {
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void handle(@NotNull AtomAction action) {
        Intrinsics.checkNotNullParameter(action, "action");
        if (action instanceof AtomAction.HasUsageAnalytics) {
            AtomAction.HasUsageAnalytics.UsageAnalytics usageAnalytics = ((AtomAction.HasUsageAnalytics) action).getUsageAnalytics();
            trackActionUsageAnalytics(new ActionUsageAnalyticsData(usageAnalytics != null ? usageAnalytics.getRawBehavior() : null, action.getId()));
        }
        Function1<AtomAction, Boolean> function1 = this.preProcessHandler;
        if (function1 != null && function1.invoke(action).booleanValue()) {
            sendAnalytics(action);
        } else {
            if (processCustomAction(action)) {
                return;
            }
            sendAnalytics(action);
            processDefaultAction(action);
        }
    }

    protected void handleDefaultAnalytics(@NotNull AtomAction action) {
        Intrinsics.checkNotNullParameter(action, "action");
    }

    protected void handleDismiss(@NotNull AtomAction.Dismiss action) {
        Intrinsics.checkNotNullParameter(action, "action");
        dismiss();
    }

    protected void handleDismissRedirect(@NotNull AtomAction.DismissRedirect action) {
        Intrinsics.checkNotNullParameter(action, "action");
        dismissAndRedirect(action.getLink(), action.getParams());
    }

    protected void openDeeplink(@NotNull String link, @NotNull Map<String, ? extends Object> parameters) {
        Intrinsics.checkNotNullParameter(link, "link");
        Intrinsics.checkNotNullParameter(parameters, "parameters");
        this.navigator.openDeeplink(link, parameters);
    }

    protected final void performWithThrottling(@NotNull Function0<Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        HandlersInhibitor handlersInhibitor = this.uiClickInhibitor;
        if (handlersInhibitor != null) {
            HandlersInhibitor.run$default(handlersInhibitor, 0L, new BaseActionHandler$performWithThrottling$1(block), 1, null);
        } else {
            block.invoke();
        }
    }

    protected boolean processCustomAction(@NotNull AtomAction action) {
        Intrinsics.checkNotNullParameter(action, "action");
        return false;
    }

    protected boolean processDefaultAction(@NotNull AtomAction action) {
        Intrinsics.checkNotNullParameter(action, "action");
        if (action instanceof AtomAction.Move) {
            performWithThrottling(new BaseActionHandler$processDefaultAction$1(this, action));
            return true;
        }
        if (action instanceof AtomAction.Click) {
            performWithThrottling(new BaseActionHandler$processDefaultAction$2(this, action));
            return true;
        }
        if (action instanceof AtomAction.OpenNestedPage) {
            performWithThrottling(new BaseActionHandler$processDefaultAction$3(this, action));
            return true;
        }
        if (action instanceof AtomAction.OpenComposerNestedPage) {
            performWithThrottling(new BaseActionHandler$processDefaultAction$4(this, action));
            return true;
        }
        if (action instanceof AtomAction.Dismiss) {
            performWithThrottling(new BaseActionHandler$processDefaultAction$5(this, action));
            return true;
        }
        if (action instanceof AtomAction.DismissRedirect) {
            performWithThrottling(new BaseActionHandler$processDefaultAction$6(this, action));
            return true;
        }
        if (action instanceof AtomAction.ComposerAction) {
            performWithThrottling(new BaseActionHandler$processDefaultAction$7(this, action));
            return true;
        }
        if (action instanceof AtomAction.TextChange) {
            handleTextChange((AtomAction.TextChange) action);
            return true;
        }
        if (action instanceof AtomAction.InvalidAction) {
            handleInvalidAction((AtomAction.InvalidAction) action);
            return true;
        }
        if (action instanceof AtomAction.ViewAction) {
            handleViewAction((AtomAction.ViewAction) action);
            return true;
        }
        if (!(action instanceof AtomAction.IgnoreViewPoolViewAction)) {
            return false;
        }
        handleIgnoreViewPoolViewAction((AtomAction.IgnoreViewPoolViewAction) action);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void sendAnalytics(@NotNull AtomAction action) {
        Intrinsics.checkNotNullParameter(action, "action");
        Function1<AtomAction, Boolean> function1 = this.customAnalyticHandler;
        if (function1 == null || !function1.invoke(action).booleanValue()) {
            handleDefaultAnalytics(action);
        }
    }
}
