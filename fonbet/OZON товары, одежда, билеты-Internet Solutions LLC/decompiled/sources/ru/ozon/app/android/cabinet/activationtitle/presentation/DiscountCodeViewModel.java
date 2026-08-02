package ru.ozon.app.android.cabinet.activationtitle.presentation;

import B0.A0;
import Bc.r;
import Bc.u;
import DJ.e;
import L9.c;
import We.M;
import androidx.lifecycle.w0;
import com.squareup.moshi.j;
import io.reactivex.C;
import io.reactivex.y;
import java.net.ConnectException;
import java.net.UnknownHostException;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import nc.C8486a;
import nc.InterfaceC8487b;
import org.jetbrains.annotations.NotNull;
import qc.o;
import retrofit2.HttpException;
import retrofit2.Response;
import ru.ozon.android.composerCommonViewKit.parsing.JsonParser;
import ru.ozon.app.android.account.R$string;
import ru.ozon.app.android.cabinet.activationtitle.data.CodeActivationAnalytics;
import ru.ozon.app.android.cabinet.activationtitle.data.DiscountCodeRepository;
import ru.ozon.app.android.cabinet.activationtitle.data.DiscountCodeResponse;
import ru.ozon.app.android.cabinet.activationtitle.presentation.DiscountCodeViewModel;
import ru.ozon.app.android.uikit.text.StringProvider;
import ru.ozon.app.android.utils.livedata.SingleLiveEvent;
import ru.ozon.app.android.utils.rx.RxExtKt;

@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001:\u0002/0B%\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u001b\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0014¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0017\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\r¢\u0006\u0004\b\u0017\u0010\u0018J\u0019\u0010\u001c\u001a\u00020\u00132\n\u0010\u001b\u001a\u00060\u0019j\u0002`\u001a¢\u0006\u0004\b\u001c\u0010\u001dJ\r\u0010\u001e\u001a\u00020\u0013¢\u0006\u0004\b\u001e\u0010\u0015R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001fR\u0018\u0010\u0006\u001a\u00060\u0004j\u0002`\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010 R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010!R\u001d\u0010$\u001a\b\u0012\u0004\u0012\u00020#0\"8\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u0014\u0010)\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\"\u0010-\u001a\u0010\u0012\f\u0012\n ,*\u0004\u0018\u00010\r0\r0+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.¨\u00061"}, d2 = {"Lru/ozon/app/android/cabinet/activationtitle/presentation/DiscountCodeViewModel;", "Landroidx/lifecycle/w0;", "Lru/ozon/app/android/cabinet/activationtitle/data/DiscountCodeRepository;", "repository", "Lru/ozon/android/composerCommonViewKit/parsing/JsonParser;", "Lru/ozon/app/android/network/serialize/JsonDeserializer;", "jsonDeserializer", "Lru/ozon/app/android/cabinet/activationtitle/data/CodeActivationAnalytics;", "analytics", "<init>", "(Lru/ozon/app/android/cabinet/activationtitle/data/DiscountCodeRepository;Lru/ozon/android/composerCommonViewKit/parsing/JsonParser;Lru/ozon/app/android/cabinet/activationtitle/data/CodeActivationAnalytics;)V", "", "e", "", "handleError", "(Ljava/lang/Throwable;)Ljava/lang/String;", "errorBody", "getErrorMessage", "(Ljava/lang/String;)Ljava/lang/String;", "", "onCleared", "()V", "code", "applyDiscountCode", "(Ljava/lang/String;)V", "LSg/a;", "Lru/ozon/app/android/analytics/AnalyticsScreenStorage;", "parentScreenStorage", "initCodeAnalytics", "(LSg/a;)V", "trackCodeAnalytic", "Lru/ozon/app/android/cabinet/activationtitle/data/DiscountCodeRepository;", "Lru/ozon/android/composerCommonViewKit/parsing/JsonParser;", "Lru/ozon/app/android/cabinet/activationtitle/data/CodeActivationAnalytics;", "Lru/ozon/app/android/utils/livedata/SingleLiveEvent;", "Lru/ozon/app/android/cabinet/activationtitle/presentation/DiscountCodeViewModel$Action;", "singleAction", "Lru/ozon/app/android/utils/livedata/SingleLiveEvent;", "getSingleAction", "()Lru/ozon/app/android/utils/livedata/SingleLiveEvent;", "Lnc/a;", "compositeDisposable", "Lnc/a;", "LL9/c;", "kotlin.jvm.PlatformType", "applyDiscountListener", "LL9/c;", "Action", "CsmaErrorBody", "cabinet_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class DiscountCodeViewModel extends w0 {

    @NotNull
    private final CodeActivationAnalytics analytics;

    @NotNull
    private final c<String> applyDiscountListener;

    @NotNull
    private final C8486a compositeDisposable;

    @NotNull
    private final JsonParser jsonDeserializer;

    @NotNull
    private final DiscountCodeRepository repository;

    @NotNull
    private final SingleLiveEvent<Action> singleAction;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\b\u001a*\u0012\u000e\b\u0001\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004 \u0005*\u0014\u0012\u000e\b\u0001\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004\u0018\u00010\u00030\u00032\u000b\u0010\u0002\u001a\u00070\u0000¢\u0006\u0002\b\u0001H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"", "Lkotlin/jvm/internal/EnhancedNullability;", "code", "Lio/reactivex/C;", "Lru/ozon/app/android/cabinet/activationtitle/presentation/DiscountCodeViewModel$Action;", "kotlin.jvm.PlatformType", "invoke", "(Ljava/lang/String;)Lio/reactivex/C;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
    /* renamed from: ru.ozon.app.android.cabinet.activationtitle.presentation.DiscountCodeViewModel$1, reason: invalid class name */
    static final class AnonymousClass1 extends AbstractC7737t implements Function1<String, C<? extends Action>> {

        @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u000b\u0010\u0003\u001a\u00070\u0004¢\u0006\u0002\b\u0005H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"<anonymous>", "Lru/ozon/app/android/cabinet/activationtitle/presentation/DiscountCodeViewModel$Action;", "kotlin.jvm.PlatformType", "it", "Lru/ozon/app/android/cabinet/activationtitle/data/DiscountCodeResponse;", "Lkotlin/jvm/internal/EnhancedNullability;", "invoke", "(Lru/ozon/app/android/cabinet/activationtitle/data/DiscountCodeResponse;)Lru/ozon/app/android/cabinet/activationtitle/presentation/DiscountCodeViewModel$Action;"}, k = 3, mv = {2, 0, 0}, xi = 48)
        /* renamed from: ru.ozon.app.android.cabinet.activationtitle.presentation.DiscountCodeViewModel$1$1, reason: invalid class name and collision with other inner class name */
        static final class C17351 extends AbstractC7737t implements Function1<DiscountCodeResponse, Action> {
            public static final C17351 INSTANCE = new C17351();

            C17351() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Action invoke(DiscountCodeResponse it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return new Action.Success(it.getMessage());
            }
        }

        AnonymousClass1() {
            super(1);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Action invoke$lambda$0(Function1 function1, Object p02) {
            Intrinsics.checkNotNullParameter(p02, "p0");
            return (Action) function1.invoke(p02);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Action invoke$lambda$1(DiscountCodeViewModel discountCodeViewModel, Throwable it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return new Action.Error(discountCodeViewModel.handleError(it));
        }

        @Override // kotlin.jvm.functions.Function1
        public final C<? extends Action> invoke(String code) {
            Intrinsics.checkNotNullParameter(code, "code");
            y<DiscountCodeResponse> applyDiscountCode = DiscountCodeViewModel.this.repository.applyDiscountCode(code);
            final C17351 c17351 = C17351.INSTANCE;
            o oVar = new o() { // from class: ru.ozon.app.android.cabinet.activationtitle.presentation.a
                @Override // qc.o
                public final Object apply(Object obj) {
                    DiscountCodeViewModel.Action invoke$lambda$0;
                    invoke$lambda$0 = DiscountCodeViewModel.AnonymousClass1.invoke$lambda$0(Function1.this, obj);
                    return invoke$lambda$0;
                }
            };
            applyDiscountCode.getClass();
            r rVar = new r(applyDiscountCode, oVar);
            final DiscountCodeViewModel discountCodeViewModel = DiscountCodeViewModel.this;
            return new u(rVar, new o() { // from class: ru.ozon.app.android.cabinet.activationtitle.presentation.b
                @Override // qc.o
                public final Object apply(Object obj) {
                    DiscountCodeViewModel.Action invoke$lambda$1;
                    invoke$lambda$1 = DiscountCodeViewModel.AnonymousClass1.invoke$lambda$1(DiscountCodeViewModel.this, (Throwable) obj);
                    return invoke$lambda$1;
                }
            });
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "it", "Lru/ozon/app/android/cabinet/activationtitle/presentation/DiscountCodeViewModel$Action;", "kotlin.jvm.PlatformType", "invoke", "(Lru/ozon/app/android/cabinet/activationtitle/presentation/DiscountCodeViewModel$Action;)V"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.cabinet.activationtitle.presentation.DiscountCodeViewModel$2, reason: invalid class name */
    static final class AnonymousClass2 extends AbstractC7737t implements Function1<Action, Unit> {
        AnonymousClass2() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Action action) {
            invoke2(action);
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(Action action) {
            DiscountCodeViewModel.this.getSingleAction().postValue(action);
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lru/ozon/app/android/cabinet/activationtitle/presentation/DiscountCodeViewModel$Action;", "", "<init>", "()V", "Success", "Error", "Lru/ozon/app/android/cabinet/activationtitle/presentation/DiscountCodeViewModel$Action$Error;", "Lru/ozon/app/android/cabinet/activationtitle/presentation/DiscountCodeViewModel$Action$Success;", "cabinet_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static abstract class Action {

        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0011\u0010\u0007¨\u0006\u0012"}, d2 = {"Lru/ozon/app/android/cabinet/activationtitle/presentation/DiscountCodeViewModel$Action$Error;", "Lru/ozon/app/android/cabinet/activationtitle/presentation/DiscountCodeViewModel$Action;", "", "message", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getMessage", "cabinet_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Error extends Action {
            private final String message;

            /* JADX WARN: Multi-variable type inference failed */
            public Error() {
                this(null, 1, 0 == true ? 1 : 0);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Error) && Intrinsics.d(this.message, ((Error) other).message);
            }

            public final String getMessage() {
                return this.message;
            }

            public int hashCode() {
                String str = this.message;
                if (str == null) {
                    return 0;
                }
                return str.hashCode();
            }

            @NotNull
            public String toString() {
                return A0.b("Error(message=", this.message, ")");
            }

            public Error(String str) {
                super(null);
                this.message = str;
            }

            public /* synthetic */ Error(String str, int i11, DefaultConstructorMarker defaultConstructorMarker) {
                this((i11 & 1) != 0 ? null : str);
            }
        }

        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0011\u0010\u0007¨\u0006\u0012"}, d2 = {"Lru/ozon/app/android/cabinet/activationtitle/presentation/DiscountCodeViewModel$Action$Success;", "Lru/ozon/app/android/cabinet/activationtitle/presentation/DiscountCodeViewModel$Action;", "", "message", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getMessage", "cabinet_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Success extends Action {

            @NotNull
            private final String message;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Success(@NotNull String message) {
                super(null);
                Intrinsics.checkNotNullParameter(message, "message");
                this.message = message;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Success) && Intrinsics.d(this.message, ((Success) other).message);
            }

            @NotNull
            public final String getMessage() {
                return this.message;
            }

            public int hashCode() {
                return this.message.hashCode();
            }

            @NotNull
            public String toString() {
                return A0.b("Success(message=", this.message, ")");
            }
        }

        public /* synthetic */ Action(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Action() {
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0010"}, d2 = {"Lru/ozon/app/android/cabinet/activationtitle/presentation/DiscountCodeViewModel$CsmaErrorBody;", "", "error", "", "<init>", "(Ljava/lang/String;)V", "getError", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "cabinet_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class CsmaErrorBody {

        @NotNull
        private final String error;

        public CsmaErrorBody(@NotNull String error) {
            Intrinsics.checkNotNullParameter(error, "error");
            this.error = error;
        }

        public static /* synthetic */ CsmaErrorBody copy$default(CsmaErrorBody csmaErrorBody, String str, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = csmaErrorBody.error;
            }
            return csmaErrorBody.copy(str);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getError() {
            return this.error;
        }

        @NotNull
        public final CsmaErrorBody copy(@NotNull String error) {
            Intrinsics.checkNotNullParameter(error, "error");
            return new CsmaErrorBody(error);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof CsmaErrorBody) && Intrinsics.d(this.error, ((CsmaErrorBody) other).error);
        }

        @NotNull
        public final String getError() {
            return this.error;
        }

        public int hashCode() {
            return this.error.hashCode();
        }

        @NotNull
        public String toString() {
            return A0.b("CsmaErrorBody(error=", this.error, ")");
        }
    }

    public DiscountCodeViewModel(@NotNull DiscountCodeRepository repository, @NotNull JsonParser jsonDeserializer, @NotNull CodeActivationAnalytics analytics) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        Intrinsics.checkNotNullParameter(jsonDeserializer, "jsonDeserializer");
        Intrinsics.checkNotNullParameter(analytics, "analytics");
        this.repository = repository;
        this.jsonDeserializer = jsonDeserializer;
        this.analytics = analytics;
        this.singleAction = new SingleLiveEvent<>();
        C8486a c8486a = new C8486a();
        this.compositeDisposable = c8486a;
        c<String> c11 = c.c();
        Intrinsics.checkNotNullExpressionValue(c11, "create(...)");
        this.applyDiscountListener = c11;
        InterfaceC8487b subscribe = c11.throttleFirst(2L, TimeUnit.SECONDS).switchMapSingle(new e(new AnonymousClass1(), 3)).subscribeOn(Mc.a.b()).subscribe(new Hs.b(new AnonymousClass2(), 1));
        Intrinsics.checkNotNullExpressionValue(subscribe, "subscribe(...)");
        RxExtKt.plusAssign(c8486a, subscribe);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C _init_$lambda$0(Function1 function1, Object p02) {
        Intrinsics.checkNotNullParameter(p02, "p0");
        return (C) function1.invoke(p02);
    }

    private final String getErrorMessage(String errorBody) {
        return ((CsmaErrorBody) this.jsonDeserializer.fromJson(errorBody, CsmaErrorBody.class)).getError();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String handleError(Throwable e11) {
        M errorBody;
        String errorMessage;
        if (e11 instanceof UnknownHostException) {
            return StringProvider.getString(R$string.common_message_not_internet);
        }
        if (e11 instanceof ConnectException) {
            return StringProvider.getString(R$string.common_message_no_connection);
        }
        if (!(e11 instanceof HttpException)) {
            return null;
        }
        Response<?> response = ((HttpException) e11).response();
        return (response == null || (errorBody = response.errorBody()) == null || (errorMessage = getErrorMessage(errorBody.string())) == null) ? StringProvider.getString(ru.ozon.app.android.uikit.R$string.error_common_message_service_error) : errorMessage;
    }

    public final void applyDiscountCode(@NotNull String code) {
        Intrinsics.checkNotNullParameter(code, "code");
        this.applyDiscountListener.accept(code);
    }

    @NotNull
    public final SingleLiveEvent<Action> getSingleAction() {
        return this.singleAction;
    }

    public final void initCodeAnalytics(@NotNull Sg.a parentScreenStorage) {
        Intrinsics.checkNotNullParameter(parentScreenStorage, "parentScreenStorage");
        this.analytics.init(parentScreenStorage);
    }

    @Override // androidx.lifecycle.w0
    protected void onCleared() {
        super.onCleared();
        this.compositeDisposable.d();
    }

    public final void trackCodeAnalytic() {
        this.analytics.trackCodeActivation();
    }
}
