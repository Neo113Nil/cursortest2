package ru.ozon.app.android.rfbs.deliverycomplain.presentation;

import Ae.B0;
import Ae.C0;
import Ae.C2399j;
import Ae.E0;
import B0.A0;
import B90.C2618u;
import androidx.lifecycle.w0;
import androidx.lifecycle.x0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.account.orders.OrderChangePreferences;
import ru.ozon.app.android.csma.api.ComposerActionApi;
import ru.ozon.app.android.rfbs.deliverycomplain.presentation.models.SendComplainParams;
import xe.C10727i;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0018B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\rR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u000eR\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u001d\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00100\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/rfbs/deliverycomplain/presentation/ComplainViewModel;", "Landroidx/lifecycle/w0;", "Lru/ozon/app/android/csma/api/ComposerActionApi;", "api", "Lru/ozon/app/android/account/orders/OrderChangePreferences;", "prefs", "<init>", "(Lru/ozon/app/android/csma/api/ComposerActionApi;Lru/ozon/app/android/account/orders/OrderChangePreferences;)V", "Lru/ozon/app/android/rfbs/deliverycomplain/presentation/models/SendComplainParams;", "params", "", "sendComplain", "(Lru/ozon/app/android/rfbs/deliverycomplain/presentation/models/SendComplainParams;)V", "Lru/ozon/app/android/csma/api/ComposerActionApi;", "Lru/ozon/app/android/account/orders/OrderChangePreferences;", "LAe/w0;", "Lru/ozon/app/android/rfbs/deliverycomplain/presentation/ComplainViewModel$Action;", "_actions", "LAe/w0;", "LAe/B0;", "actions", "LAe/B0;", "getActions", "()LAe/B0;", "Action", "cs-orders_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ComplainViewModel extends w0 {

    @NotNull
    private final Ae.w0<Action> _actions;

    @NotNull
    private final B0<Action> actions;

    @NotNull
    private final ComposerActionApi api;

    @NotNull
    private final OrderChangePreferences prefs;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"Lru/ozon/app/android/rfbs/deliverycomplain/presentation/ComplainViewModel$Action;", "", "<init>", "()V", "Error", "Success", "Loader", "Lru/ozon/app/android/rfbs/deliverycomplain/presentation/ComplainViewModel$Action$Error;", "Lru/ozon/app/android/rfbs/deliverycomplain/presentation/ComplainViewModel$Action$Loader;", "Lru/ozon/app/android/rfbs/deliverycomplain/presentation/ComplainViewModel$Action$Success;", "cs-orders_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static abstract class Action {

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/ozon/app/android/rfbs/deliverycomplain/presentation/ComplainViewModel$Action$Error;", "Lru/ozon/app/android/rfbs/deliverycomplain/presentation/ComplainViewModel$Action;", "<init>", "()V", "cs-orders_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Error extends Action {

            @NotNull
            public static final Error INSTANCE = new Error();

            private Error() {
                super(null);
            }
        }

        @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\u00022\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lru/ozon/app/android/rfbs/deliverycomplain/presentation/ComplainViewModel$Action$Loader;", "Lru/ozon/app/android/rfbs/deliverycomplain/presentation/ComplainViewModel$Action;", "", "show", "<init>", "(Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "getShow", "()Z", "cs-orders_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Loader extends Action {
            private final boolean show;

            public Loader(boolean z11) {
                super(null);
                this.show = z11;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Loader) && this.show == ((Loader) other).show;
            }

            public final boolean getShow() {
                return this.show;
            }

            public int hashCode() {
                return Boolean.hashCode(this.show);
            }

            @NotNull
            public String toString() {
                return C2618u.g("Loader(show=", ")", this.show);
            }
        }

        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0011\u0010\u0007¨\u0006\u0012"}, d2 = {"Lru/ozon/app/android/rfbs/deliverycomplain/presentation/ComplainViewModel$Action$Success;", "Lru/ozon/app/android/rfbs/deliverycomplain/presentation/ComplainViewModel$Action;", "", "refreshUrl", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getRefreshUrl", "cs-orders_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Success extends Action {

            @NotNull
            private final String refreshUrl;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Success(@NotNull String refreshUrl) {
                super(null);
                Intrinsics.checkNotNullParameter(refreshUrl, "refreshUrl");
                this.refreshUrl = refreshUrl;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Success) && Intrinsics.d(this.refreshUrl, ((Success) other).refreshUrl);
            }

            @NotNull
            public final String getRefreshUrl() {
                return this.refreshUrl;
            }

            public int hashCode() {
                return this.refreshUrl.hashCode();
            }

            @NotNull
            public String toString() {
                return A0.b("Success(refreshUrl=", this.refreshUrl, ")");
            }
        }

        public /* synthetic */ Action(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Action() {
        }
    }

    public ComplainViewModel(@NotNull ComposerActionApi api, @NotNull OrderChangePreferences prefs) {
        Intrinsics.checkNotNullParameter(api, "api");
        Intrinsics.checkNotNullParameter(prefs, "prefs");
        this.api = api;
        this.prefs = prefs;
        C0 b11 = E0.b(0, 0, null, 6);
        this._actions = b11;
        this.actions = C2399j.a(b11);
    }

    @NotNull
    public final B0<Action> getActions() {
        return this.actions;
    }

    public final void sendComplain(@NotNull SendComplainParams params) {
        Intrinsics.checkNotNullParameter(params, "params");
        C10727i.c(x0.a(this), null, null, new ComplainViewModel$sendComplain$1(this, params, null), 3);
    }
}
