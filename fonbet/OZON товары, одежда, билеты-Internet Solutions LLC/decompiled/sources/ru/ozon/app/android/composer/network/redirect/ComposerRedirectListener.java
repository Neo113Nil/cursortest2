package ru.ozon.app.android.composer.network.redirect;

import L00.j;
import Qj0.U;
import Sc.InterfaceC4008j;
import Sc.o;
import a10.InterfaceC4918f;
import a10.k;
import android.annotation.SuppressLint;
import android.net.Uri;
import android.util.LruCache;
import com.google.android.gms.common.internal.ImagesContract;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import org.jetbrains.annotations.NotNull;
import qj.C9067a;
import ru.ozon.app.android.analytics.performance.PerformanceTrackerDelegate;
import ru.ozon.tracker.performance.ServerTimingsParser;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u0000  2\u00020\u0001:\u0001 B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J'\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0017¢\u0006\u0004\b\u0011\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0012R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0013R\u001b\u0010\u0019\u001a\u00020\u00148BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R'\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u001b0\u001a8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001c\u0010\u0016\u001a\u0004\b\u001d\u0010\u001e¨\u0006!"}, d2 = {"Lru/ozon/app/android/composer/network/redirect/ComposerRedirectListener;", "La10/f;", "Lqj/a;", "networkInfoProvider", "Lru/ozon/app/android/analytics/performance/PerformanceTrackerDelegate;", "tracker", "<init>", "(Lqj/a;Lru/ozon/app/android/analytics/performance/PerformanceTrackerDelegate;)V", "", "uuid", "LL00/j;", "response", "La10/k;", "type", "", "onRedirect", "(Ljava/lang/String;LL00/j;La10/k;)V", "onRedirectCompleted", "Lqj/a;", "Lru/ozon/app/android/analytics/performance/PerformanceTrackerDelegate;", "Lru/ozon/tracker/performance/ServerTimingsParser;", "serverTimingsParser$delegate", "LSc/j;", "getServerTimingsParser", "()Lru/ozon/tracker/performance/ServerTimingsParser;", "serverTimingsParser", "Landroid/util/LruCache;", "LQj0/U;", "serverRedirectTraces$delegate", "getServerRedirectTraces", "()Landroid/util/LruCache;", "serverRedirectTraces", "Companion", "composer_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ComposerRedirectListener implements InterfaceC4918f {

    @NotNull
    private final C9067a networkInfoProvider;

    /* renamed from: serverRedirectTraces$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j serverRedirectTraces;

    /* renamed from: serverTimingsParser$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j serverTimingsParser;

    @NotNull
    private final PerformanceTrackerDelegate tracker;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0005H\u0000¢\u0006\u0002\b\bR\u000e\u0010\u0004\u001a\u00020\u0005X\u0080T¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lru/ozon/app/android/composer/network/redirect/ComposerRedirectListener$Companion;", "", "<init>", "()V", "REDIRECT_KEY", "", "getRedirectUrl", "location", "getRedirectUrl$composer_prodGoogleAllVendorsRelease", "composer_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final String getRedirectUrl$composer_prodGoogleAllVendorsRelease(@NotNull String location) {
            Uri parse;
            String queryParameter;
            Intrinsics.checkNotNullParameter(location, "location");
            return (h.e0(location, "ozon://", false) || (parse = Uri.parse(location)) == null || (queryParameter = parse.getQueryParameter(ImagesContract.URL)) == null) ? location : queryParameter;
        }

        private Companion() {
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes11.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[k.values().length];
            try {
                iArr[k.REGULAR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[k.SERVER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public ComposerRedirectListener(@NotNull C9067a networkInfoProvider, @NotNull PerformanceTrackerDelegate tracker) {
        Intrinsics.checkNotNullParameter(networkInfoProvider, "networkInfoProvider");
        Intrinsics.checkNotNullParameter(tracker, "tracker");
        this.networkInfoProvider = networkInfoProvider;
        this.tracker = tracker;
        this.serverTimingsParser = Sc.k.b(ComposerRedirectListener$serverTimingsParser$2.INSTANCE);
        this.serverRedirectTraces = Sc.k.b(ComposerRedirectListener$serverRedirectTraces$2.INSTANCE);
    }

    private final LruCache<String, U> getServerRedirectTraces() {
        return (LruCache) this.serverRedirectTraces.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ServerTimingsParser getServerTimingsParser() {
        return (ServerTimingsParser) this.serverTimingsParser.getValue();
    }

    @Override // a10.InterfaceC4918f
    public void onRedirect(@NotNull String uuid, @NotNull j response, @NotNull k type) {
        Intrinsics.checkNotNullParameter(uuid, "uuid");
        Intrinsics.checkNotNullParameter(response, "response");
        Intrinsics.checkNotNullParameter(type, "type");
        int i11 = WhenMappings.$EnumSwitchMapping$0[type.ordinal()];
        if (i11 == 1) {
            this.tracker.removeTrace(uuid);
        } else {
            if (i11 != 2) {
                throw new o();
            }
            U removeTrace = this.tracker.removeTrace(uuid);
            if (removeTrace == null) {
                return;
            }
            getServerRedirectTraces().put(uuid, removeTrace);
        }
    }

    @Override // a10.InterfaceC4918f
    @SuppressLint({"MissingPermission"})
    public void onRedirectCompleted(@NotNull String uuid, @NotNull j response, @NotNull k type) {
        Intrinsics.checkNotNullParameter(uuid, "uuid");
        Intrinsics.checkNotNullParameter(response, "response");
        Intrinsics.checkNotNullParameter(type, "type");
        if (type != k.SERVER || this.tracker.hasTrace(uuid)) {
            return;
        }
        U remove = getServerRedirectTraces().remove(response.h().k());
        if (remove != null) {
            this.tracker.beginTrace(remove);
        } else {
            this.tracker.beginTrace(uuid, new ComposerRedirectListener$onRedirectCompleted$1(response, this, response.e()));
        }
    }
}
