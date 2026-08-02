package ru.ozon.app.android.fresh.feature.b2b.actionHandlers.b2bAcceptAct;

import Ae.C2399j;
import Ae.M0;
import Ae.O0;
import Ae.x0;
import He.b;
import Sc.o;
import Sc.s;
import Wc.a;
import androidx.lifecycle.w0;
import androidx.recyclerview.widget.LinearLayoutManager;
import kotlin.Metadata;
import kotlin.coroutines.d;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.composerCommonViewKit.parsing.JsonParser;
import ru.ozon.app.android.fresh.feature.b2b.actionHandlers.b2bAcceptAct.data.B2bAcceptActParams;
import ru.ozon.app.android.utils.Result;
import xe.C10720e0;
import xe.C10727i;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 \u001f2\u00020\u0001:\u0002\u001f B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J&\u0010\u000b\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\u00062\n\u0010\n\u001a\u00060\bj\u0002`\tH\u0082@¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ)\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u00112\n\u0010\n\u001a\u00060\bj\u0002`\t¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0015R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001d\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00170\u001a8\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e¨\u0006!"}, d2 = {"Lru/ozon/app/android/fresh/feature/b2b/actionHandlers/b2bAcceptAct/B2bAcceptActViewModel;", "Landroidx/lifecycle/w0;", "Lru/ozon/app/android/fresh/feature/b2b/actionHandlers/b2bAcceptAct/B2bAcceptActRepository;", "repository", "<init>", "(Lru/ozon/app/android/fresh/feature/b2b/actionHandlers/b2bAcceptAct/B2bAcceptActRepository;)V", "", "postData", "Lru/ozon/android/composerCommonViewKit/parsing/JsonParser;", "Lru/ozon/app/android/network/serialize/JsonDeserializer;", "jsonDeserializer", "getDocumentId", "(Ljava/lang/String;Lru/ozon/android/composerCommonViewKit/parsing/JsonParser;Lkotlin/coroutines/d;)Ljava/lang/Object;", "", "discardScreenState", "()V", "actionName", "Lru/ozon/app/android/fresh/feature/b2b/actionHandlers/b2bAcceptAct/data/B2bAcceptActParams;", "acceptActParams", "acceptAct", "(Ljava/lang/String;Lru/ozon/app/android/fresh/feature/b2b/actionHandlers/b2bAcceptAct/data/B2bAcceptActParams;Lru/ozon/android/composerCommonViewKit/parsing/JsonParser;)V", "Lru/ozon/app/android/fresh/feature/b2b/actionHandlers/b2bAcceptAct/B2bAcceptActRepository;", "LAe/x0;", "Lru/ozon/app/android/fresh/feature/b2b/actionHandlers/b2bAcceptAct/B2bAcceptActViewModel$ScreenState;", "_screenState", "LAe/x0;", "LAe/M0;", "screenState", "LAe/M0;", "getScreenState", "()LAe/M0;", "Companion", "ScreenState", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class B2bAcceptActViewModel extends w0 {

    @NotNull
    private final x0<ScreenState> _screenState;

    @NotNull
    private final B2bAcceptActRepository repository;

    @NotNull
    private final M0<ScreenState> screenState;
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\b\t\n\u000b¨\u0006\f"}, d2 = {"Lru/ozon/app/android/fresh/feature/b2b/actionHandlers/b2bAcceptAct/B2bAcceptActViewModel$ScreenState;", "", "<init>", "()V", "Idle", "Loading", "Error", "Success", "Lru/ozon/app/android/fresh/feature/b2b/actionHandlers/b2bAcceptAct/B2bAcceptActViewModel$ScreenState$Error;", "Lru/ozon/app/android/fresh/feature/b2b/actionHandlers/b2bAcceptAct/B2bAcceptActViewModel$ScreenState$Idle;", "Lru/ozon/app/android/fresh/feature/b2b/actionHandlers/b2bAcceptAct/B2bAcceptActViewModel$ScreenState$Loading;", "Lru/ozon/app/android/fresh/feature/b2b/actionHandlers/b2bAcceptAct/B2bAcceptActViewModel$ScreenState$Success;", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static abstract class ScreenState {

        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lru/ozon/app/android/fresh/feature/b2b/actionHandlers/b2bAcceptAct/B2bAcceptActViewModel$ScreenState$Error;", "Lru/ozon/app/android/fresh/feature/b2b/actionHandlers/b2bAcceptAct/B2bAcceptActViewModel$ScreenState;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Error extends ScreenState {

            @NotNull
            public static final Error INSTANCE = new Error();

            private Error() {
                super(null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof Error);
            }

            public int hashCode() {
                return 2125706845;
            }

            @NotNull
            public String toString() {
                return "Error";
            }
        }

        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lru/ozon/app/android/fresh/feature/b2b/actionHandlers/b2bAcceptAct/B2bAcceptActViewModel$ScreenState$Idle;", "Lru/ozon/app/android/fresh/feature/b2b/actionHandlers/b2bAcceptAct/B2bAcceptActViewModel$ScreenState;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Idle extends ScreenState {

            @NotNull
            public static final Idle INSTANCE = new Idle();

            private Idle() {
                super(null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof Idle);
            }

            public int hashCode() {
                return 207224031;
            }

            @NotNull
            public String toString() {
                return "Idle";
            }
        }

        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lru/ozon/app/android/fresh/feature/b2b/actionHandlers/b2bAcceptAct/B2bAcceptActViewModel$ScreenState$Loading;", "Lru/ozon/app/android/fresh/feature/b2b/actionHandlers/b2bAcceptAct/B2bAcceptActViewModel$ScreenState;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Loading extends ScreenState {

            @NotNull
            public static final Loading INSTANCE = new Loading();

            private Loading() {
                super(null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof Loading);
            }

            public int hashCode() {
                return 215483473;
            }

            @NotNull
            public String toString() {
                return "Loading";
            }
        }

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/fresh/feature/b2b/actionHandlers/b2bAcceptAct/B2bAcceptActViewModel$ScreenState$Success;", "Lru/ozon/app/android/fresh/feature/b2b/actionHandlers/b2bAcceptAct/B2bAcceptActViewModel$ScreenState;", "Lru/ozon/app/android/fresh/feature/b2b/actionHandlers/b2bAcceptAct/data/B2bAcceptActParams;", "params", "<init>", "(Lru/ozon/app/android/fresh/feature/b2b/actionHandlers/b2bAcceptAct/data/B2bAcceptActParams;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/app/android/fresh/feature/b2b/actionHandlers/b2bAcceptAct/data/B2bAcceptActParams;", "getParams", "()Lru/ozon/app/android/fresh/feature/b2b/actionHandlers/b2bAcceptAct/data/B2bAcceptActParams;", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Success extends ScreenState {

            @NotNull
            private final B2bAcceptActParams params;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Success(@NotNull B2bAcceptActParams params) {
                super(null);
                Intrinsics.checkNotNullParameter(params, "params");
                this.params = params;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Success) && Intrinsics.d(this.params, ((Success) other).params);
            }

            @NotNull
            public final B2bAcceptActParams getParams() {
                return this.params;
            }

            public int hashCode() {
                return this.params.hashCode();
            }

            @NotNull
            public String toString() {
                return "Success(params=" + this.params + ")";
            }
        }

        public /* synthetic */ ScreenState(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ScreenState() {
        }
    }

    public B2bAcceptActViewModel(@NotNull B2bAcceptActRepository repository) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        this.repository = repository;
        x0<ScreenState> a11 = O0.a(ScreenState.Idle.INSTANCE);
        this._screenState = a11;
        this.screenState = C2399j.b(a11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't wrap try/catch for region: R(10:0|1|(2:3|(7:5|6|7|(1:(1:10)(2:23|24))(3:25|26|(1:28))|11|12|(1:21)(2:14|(2:16|17)(2:19|20))))|31|6|7|(0)(0)|11|12|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0028, code lost:
    
        r6 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x004f, code lost:
    
        r6 = new ru.ozon.app.android.utils.Result.Failure(r6);
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object getDocumentId(String str, JsonParser jsonParser, d<? super String> dVar) {
        B2bAcceptActViewModel$getDocumentId$1 b2bAcceptActViewModel$getDocumentId$1;
        int i11;
        Object failure;
        if (dVar instanceof B2bAcceptActViewModel$getDocumentId$1) {
            b2bAcceptActViewModel$getDocumentId$1 = (B2bAcceptActViewModel$getDocumentId$1) dVar;
            int i12 = b2bAcceptActViewModel$getDocumentId$1.label;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                b2bAcceptActViewModel$getDocumentId$1.label = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = b2bAcceptActViewModel$getDocumentId$1.result;
                a aVar = a.COROUTINE_SUSPENDED;
                i11 = b2bAcceptActViewModel$getDocumentId$1.label;
                if (i11 != 0) {
                    s.b(obj);
                    C10720e0 c10720e0 = C10720e0.f105451a;
                    b bVar = b.f10879b;
                    B2bAcceptActViewModel$getDocumentId$result$1$1 b2bAcceptActViewModel$getDocumentId$result$1$1 = new B2bAcceptActViewModel$getDocumentId$result$1$1(jsonParser, str, null);
                    b2bAcceptActViewModel$getDocumentId$1.label = 1;
                    obj = C10727i.f(bVar, b2bAcceptActViewModel$getDocumentId$result$1$1, b2bAcceptActViewModel$getDocumentId$1);
                    if (obj == aVar) {
                        return aVar;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    s.b(obj);
                }
                failure = new Result.Success((String) obj);
                if (!(failure instanceof Result.Failure)) {
                    return null;
                }
                if (failure instanceof Result.Success) {
                    return (String) ((Result.Success) failure).getValue();
                }
                throw new o();
            }
        }
        b2bAcceptActViewModel$getDocumentId$1 = new B2bAcceptActViewModel$getDocumentId$1(this, dVar);
        Object obj2 = b2bAcceptActViewModel$getDocumentId$1.result;
        a aVar2 = a.COROUTINE_SUSPENDED;
        i11 = b2bAcceptActViewModel$getDocumentId$1.label;
        if (i11 != 0) {
        }
        failure = new Result.Success((String) obj2);
        if (!(failure instanceof Result.Failure)) {
        }
    }

    public final void acceptAct(@NotNull String actionName, @NotNull B2bAcceptActParams acceptActParams, @NotNull JsonParser jsonDeserializer) {
        Intrinsics.checkNotNullParameter(actionName, "actionName");
        Intrinsics.checkNotNullParameter(acceptActParams, "acceptActParams");
        Intrinsics.checkNotNullParameter(jsonDeserializer, "jsonDeserializer");
        if (acceptActParams.getPostData() == null) {
            this._screenState.setValue(ScreenState.Error.INSTANCE);
        } else {
            C10727i.c(androidx.lifecycle.x0.a(this), null, null, new B2bAcceptActViewModel$acceptAct$1(this, acceptActParams, jsonDeserializer, actionName, null), 3);
        }
    }

    public final void discardScreenState() {
        this._screenState.setValue(ScreenState.Idle.INSTANCE);
    }

    @NotNull
    public final M0<ScreenState> getScreenState() {
        return this.screenState;
    }
}
