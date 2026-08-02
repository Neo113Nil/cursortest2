package ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.data.logger;

import Sc.InterfaceC4008j;
import Sc.k;
import T00.e;
import j20.C7244b;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.U;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.ozonLogger.core.c;
import ru.ozon.app.android.network.abtool.FeatureChecker;
import ru.ozon.app.android.utils.LazyUtilsKt;
import sj.d;
import sj.f;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J!\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u00062\n\u0010\n\u001a\u00060\bj\u0002`\t¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000eR\u001b\u0010\u0014\u001a\u00020\u000f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001b\u0010\u0017\u001a\u00020\u00158BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0011\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001a"}, d2 = {"Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/data/logger/TileGrid2Logger;", "", "Lru/ozon/app/android/network/abtool/FeatureChecker;", "featureChecker", "<init>", "(Lru/ozon/app/android/network/abtool/FeatureChecker;)V", "Lj20/b;", "state", "Ljava/lang/Exception;", "Lkotlin/Exception;", "exception", "", "logDecodingError", "(Lj20/b;Ljava/lang/Exception;)V", "Lru/ozon/app/android/network/abtool/FeatureChecker;", "Lsj/d;", "logger$delegate", "LSc/j;", "getLogger", "()Lsj/d;", "logger", "", "isParseErrorLogEnabled$delegate", "isParseErrorLogEnabled", "()Z", "Companion", "universalwidgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class TileGrid2Logger {

    @NotNull
    private final FeatureChecker featureChecker;

    /* renamed from: isParseErrorLogEnabled$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j isParseErrorLogEnabled;

    /* renamed from: logger$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j logger;

    public TileGrid2Logger(@NotNull FeatureChecker featureChecker) {
        Intrinsics.checkNotNullParameter(featureChecker, "featureChecker");
        this.featureChecker = featureChecker;
        this.logger = k.b(TileGrid2Logger$logger$2.INSTANCE);
        this.isParseErrorLogEnabled = LazyUtilsKt.unsafeLazy(new TileGrid2Logger$isParseErrorLogEnabled$2(this));
    }

    private final d getLogger() {
        return (d) this.logger.getValue();
    }

    private final boolean isParseErrorLogEnabled() {
        return ((Boolean) this.isParseErrorLogEnabled.getValue()).booleanValue();
    }

    public final void logDecodingError(@NotNull C7244b state, @NotNull Exception exception) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(exception, "exception");
        if (isParseErrorLogEnabled()) {
            Pair pair = new Pair("state_id", state.c().c());
            Pair pair2 = new Pair("widget_name", state.c().i());
            e h11 = state.a().h();
            getLogger().f(c.ERROR, "Failed to decode TileGrid2", f.a(U.j(pair, pair2, new Pair("page_url", h11 != null ? h11.j() : null), new Pair("decoding_error", exception.toString()))), Boolean.FALSE);
        }
    }
}
