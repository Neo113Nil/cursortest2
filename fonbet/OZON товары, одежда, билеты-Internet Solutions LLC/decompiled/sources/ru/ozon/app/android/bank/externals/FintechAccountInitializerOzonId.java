package ru.ozon.app.android.bank.externals;

import android.webkit.WebView;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.fintech.lib.FintechCoreLib;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u0000 \f2\u00020\u0001:\u0001\fB\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\u000b\u001a\u00020\nR \u0010\u0006\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lru/ozon/app/android/bank/externals/FintechAccountInitializerOzonId;", "", "fintechCoreLib", "Lru/ozon/fintech/lib/FintechCoreLib;", "<init>", "(Lru/ozon/fintech/lib/FintechCoreLib;)V", "webViewCreationCallbacks", "", "Lkotlin/Function1;", "Landroid/webkit/WebView;", "", "init", "Companion", "ozonbank_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class FintechAccountInitializerOzonId {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static Function1<? super WebView, Unit> observeCookieChanged;

    @NotNull
    private final Set<Function1<WebView, Unit>> webViewCreationCallbacks;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R&\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005X\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lru/ozon/app/android/bank/externals/FintechAccountInitializerOzonId$Companion;", "", "<init>", "()V", "observeCookieChanged", "Lkotlin/Function1;", "Landroid/webkit/WebView;", "", "getObserveCookieChanged", "()Lkotlin/jvm/functions/Function1;", "setObserveCookieChanged", "(Lkotlin/jvm/functions/Function1;)V", "ozonbank_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final Function1<WebView, Unit> getObserveCookieChanged() {
            Function1 function1 = FintechAccountInitializerOzonId.observeCookieChanged;
            if (function1 != null) {
                return function1;
            }
            Intrinsics.n("observeCookieChanged");
            throw null;
        }

        public final void setObserveCookieChanged(@NotNull Function1<? super WebView, Unit> function1) {
            Intrinsics.checkNotNullParameter(function1, "<set-?>");
            FintechAccountInitializerOzonId.observeCookieChanged = function1;
        }

        private Companion() {
        }
    }

    public FintechAccountInitializerOzonId(@NotNull FintechCoreLib fintechCoreLib) {
        Intrinsics.checkNotNullParameter(fintechCoreLib, "fintechCoreLib");
        this.webViewCreationCallbacks = fintechCoreLib.getFintechAuthInteractor().s();
    }

    public final void init() {
        this.webViewCreationCallbacks.add(INSTANCE.getObserveCookieChanged());
    }
}
