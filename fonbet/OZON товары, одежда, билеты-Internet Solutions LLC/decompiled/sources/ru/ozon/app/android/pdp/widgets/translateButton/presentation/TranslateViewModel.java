package ru.ozon.app.android.pdp.widgets.translateButton.presentation;

import Ae.B0;
import Ae.C0;
import Ae.C2399j;
import Ae.E0;
import Ae.InterfaceC2395h;
import B0.C2454a;
import B90.C2618u;
import Wc.a;
import androidx.lifecycle.w0;
import androidx.lifecycle.x0;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.U;
import kotlin.coroutines.d;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.widgets.async.data.ComposerAsyncWidgetRepository;
import ru.ozon.app.android.pdp.widgets.translateButton.data.TranslateAttributesRepository;
import ru.ozon.uni.atoms.af.AtomAction;
import xe.C10727i;
import z00.g;
import ze.EnumC11113a;

@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010#\n\u0002\u0010\t\n\u0002\b\u0005\b\u0001\u0018\u0000 02\u00020\u0001:\u000201B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0082@¢\u0006\u0004\b\u000b\u0010\fJ#\u0010\u0012\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\r2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f¢\u0006\u0004\b\u0012\u0010\u0013J-\u0010\u0019\u001a\u00020\n\"\b\b\u0000\u0010\u0015*\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u00102\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00000\u0017¢\u0006\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001bR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001cR\u001a\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u001d\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u001e0!8\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u001a\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00140\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010 R\u001d\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00140'8\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R\u001a\u0010.\u001a\b\u0012\u0004\u0012\u00020-0,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/¨\u00062"}, d2 = {"Lru/ozon/app/android/pdp/widgets/translateButton/presentation/TranslateViewModel;", "Landroidx/lifecycle/w0;", "Lru/ozon/app/android/pdp/widgets/translateButton/data/TranslateAttributesRepository;", "translateAttributesRepository", "Lru/ozon/app/android/composer/widgets/async/data/ComposerAsyncWidgetRepository;", "repository", "<init>", "(Lru/ozon/app/android/pdp/widgets/translateButton/data/TranslateAttributesRepository;Lru/ozon/app/android/composer/widgets/async/data/ComposerAsyncWidgetRepository;)V", "", "e", "", "handleError", "(Ljava/lang/Throwable;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Lru/ozon/uni/atoms/af/AtomAction$Click;", "action", "", "", "attributeKeys", "translateProductAttributes", "(Lru/ozon/uni/atoms/af/AtomAction$Click;Ljava/util/List;)V", "", "DTO", "asyncData", "Ljava/lang/Class;", "stateType", "fetchAsyncWidget", "(Ljava/lang/String;Ljava/lang/Class;)V", "Lru/ozon/app/android/pdp/widgets/translateButton/data/TranslateAttributesRepository;", "Lru/ozon/app/android/composer/widgets/async/data/ComposerAsyncWidgetRepository;", "LAe/w0;", "Lru/ozon/app/android/pdp/widgets/translateButton/presentation/TranslateViewModel$TranslateState;", "_translateState", "LAe/w0;", "LAe/h;", "translateState", "LAe/h;", "getTranslateState", "()LAe/h;", "_widgetUpdate", "LAe/B0;", "widgetUpdate", "LAe/B0;", "getWidgetUpdate", "()LAe/B0;", "", "", "translatedWidgets", "Ljava/util/Set;", "Companion", "TranslateState", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class TranslateViewModel extends w0 {

    @NotNull
    private final Ae.w0<TranslateState> _translateState;

    @NotNull
    private final Ae.w0<Object> _widgetUpdate;

    @NotNull
    private final ComposerAsyncWidgetRepository repository;

    @NotNull
    private final TranslateAttributesRepository translateAttributesRepository;

    @NotNull
    private final InterfaceC2395h<TranslateState> translateState;

    @NotNull
    private final Set<Long> translatedWidgets;

    @NotNull
    private final B0<Object> widgetUpdate;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @NotNull
    private static final Map<String, Map<String, String>> params = U.i(new Pair("extraBody", C2454a.b("action", "actionTranslate")));

    /* JADX INFO: Access modifiers changed from: private */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R)\u0010\t\u001a\u001a\u0012\u0004\u0012\u00020\u0005\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\n0\n¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lru/ozon/app/android/pdp/widgets/translateButton/presentation/TranslateViewModel$Companion;", "", "<init>", "()V", "PARAMS_SKU", "", "EXTRA_BODY_PARAMS", "ACTION_PARAMS", "ACTION_TRANSLATE", "params", "", "getParams", "()Ljava/util/Map;", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final Map<String, Map<String, String>> getParams() {
            return TranslateViewModel.params;
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\b\t\n\u000b¨\u0006\f"}, d2 = {"Lru/ozon/app/android/pdp/widgets/translateButton/presentation/TranslateViewModel$TranslateState;", "", "<init>", "()V", "Loading", "Translated", "Success", "Error", "Lru/ozon/app/android/pdp/widgets/translateButton/presentation/TranslateViewModel$TranslateState$Error;", "Lru/ozon/app/android/pdp/widgets/translateButton/presentation/TranslateViewModel$TranslateState$Loading;", "Lru/ozon/app/android/pdp/widgets/translateButton/presentation/TranslateViewModel$TranslateState$Success;", "Lru/ozon/app/android/pdp/widgets/translateButton/presentation/TranslateViewModel$TranslateState$Translated;", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static abstract class TranslateState {

        @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\u00022\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0003\u0010\u0011¨\u0006\u0012"}, d2 = {"Lru/ozon/app/android/pdp/widgets/translateButton/presentation/TranslateViewModel$TranslateState$Error;", "Lru/ozon/app/android/pdp/widgets/translateButton/presentation/TranslateViewModel$TranslateState;", "", "isNetworkError", "<init>", "(Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "()Z", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Error extends TranslateState {
            private final boolean isNetworkError;

            public Error() {
                this(false, 1, null);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Error) && this.isNetworkError == ((Error) other).isNetworkError;
            }

            public int hashCode() {
                return Boolean.hashCode(this.isNetworkError);
            }

            /* renamed from: isNetworkError, reason: from getter */
            public final boolean getIsNetworkError() {
                return this.isNetworkError;
            }

            @NotNull
            public String toString() {
                return C2618u.g("Error(isNetworkError=", ")", this.isNetworkError);
            }

            public Error(boolean z11) {
                super(null);
                this.isNetworkError = z11;
            }

            public /* synthetic */ Error(boolean z11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
                this((i11 & 1) != 0 ? false : z11);
            }
        }

        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lru/ozon/app/android/pdp/widgets/translateButton/presentation/TranslateViewModel$TranslateState$Loading;", "Lru/ozon/app/android/pdp/widgets/translateButton/presentation/TranslateViewModel$TranslateState;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Loading extends TranslateState {

            @NotNull
            public static final Loading INSTANCE = new Loading();

            private Loading() {
                super(null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof Loading);
            }

            public int hashCode() {
                return -615812295;
            }

            @NotNull
            public String toString() {
                return "Loading";
            }
        }

        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lru/ozon/app/android/pdp/widgets/translateButton/presentation/TranslateViewModel$TranslateState$Success;", "Lru/ozon/app/android/pdp/widgets/translateButton/presentation/TranslateViewModel$TranslateState;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Success extends TranslateState {

            @NotNull
            public static final Success INSTANCE = new Success();

            private Success() {
                super(null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof Success);
            }

            public int hashCode() {
                return 1475334656;
            }

            @NotNull
            public String toString() {
                return "Success";
            }
        }

        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lru/ozon/app/android/pdp/widgets/translateButton/presentation/TranslateViewModel$TranslateState$Translated;", "Lru/ozon/app/android/pdp/widgets/translateButton/presentation/TranslateViewModel$TranslateState;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Translated extends TranslateState {

            @NotNull
            public static final Translated INSTANCE = new Translated();

            private Translated() {
                super(null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof Translated);
            }

            public int hashCode() {
                return 306186681;
            }

            @NotNull
            public String toString() {
                return "Translated";
            }
        }

        public /* synthetic */ TranslateState(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TranslateState() {
        }
    }

    public TranslateViewModel(@NotNull TranslateAttributesRepository translateAttributesRepository, @NotNull ComposerAsyncWidgetRepository repository) {
        Intrinsics.checkNotNullParameter(translateAttributesRepository, "translateAttributesRepository");
        Intrinsics.checkNotNullParameter(repository, "repository");
        this.translateAttributesRepository = translateAttributesRepository;
        this.repository = repository;
        C0 b11 = E0.b(0, 1, EnumC11113a.DROP_OLDEST, 1);
        this._translateState = b11;
        this.translateState = C2399j.a(b11);
        C0 b12 = E0.b(0, 0, null, 7);
        this._widgetUpdate = b12;
        this.widgetUpdate = C2399j.a(b12);
        this.translatedWidgets = new LinkedHashSet();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object handleError(Throwable th2, d<? super Unit> dVar) {
        Object emit = this._translateState.emit(g.c(th2) ? new TranslateState.Error(true) : new TranslateState.Error(false), dVar);
        return emit == a.COROUTINE_SUSPENDED ? emit : Unit.f71690a;
    }

    public final <DTO> void fetchAsyncWidget(@NotNull String asyncData, @NotNull Class<DTO> stateType) {
        Intrinsics.checkNotNullParameter(asyncData, "asyncData");
        Intrinsics.checkNotNullParameter(stateType, "stateType");
        C10727i.c(x0.a(this), null, null, new TranslateViewModel$fetchAsyncWidget$1(this, asyncData, stateType, null), 3);
    }

    @NotNull
    public final InterfaceC2395h<TranslateState> getTranslateState() {
        return this.translateState;
    }

    @NotNull
    public final B0<Object> getWidgetUpdate() {
        return this.widgetUpdate;
    }

    public final void translateProductAttributes(@NotNull AtomAction.Click action, @NotNull List<String> attributeKeys) {
        Intrinsics.checkNotNullParameter(action, "action");
        Intrinsics.checkNotNullParameter(attributeKeys, "attributeKeys");
        C10727i.c(x0.a(this), null, null, new TranslateViewModel$translateProductAttributes$1(action, this, attributeKeys, null), 3);
    }
}
