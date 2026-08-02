package ru.ozon.app.android.fresh.feature.b2b.actionHandlers.b2bDownloadFile;

import Ae.C2399j;
import Ae.M0;
import Ae.O0;
import Ae.x0;
import He.b;
import Sc.o;
import Sc.s;
import Wc.a;
import We.M;
import androidx.lifecycle.w0;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.io.File;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.coroutines.d;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import org.jetbrains.annotations.NotNull;
import retrofit2.Response;
import ru.ozon.android.composerCommonViewKit.parsing.JsonParser;
import ru.ozon.app.android.utils.Result;
import xe.C10720e0;
import xe.C10727i;

@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 (2\u00020\u0001:\u0002()B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J*\u0010\f\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0082@¢\u0006\u0004\b\f\u0010\rJ&\u0010\u0012\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000e\u001a\u00020\n2\n\u0010\u0011\u001a\u00060\u000fj\u0002`\u0010H\u0082@¢\u0006\u0004\b\u0012\u0010\u0013J\u001d\u0010\u0016\u001a\u00020\n2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00060\u0014H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\r\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u0019\u0010\u001aJ1\u0010\u001c\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\n2\n\u0010\u0011\u001a\u00060\u000fj\u0002`\u0010¢\u0006\u0004\b\u001c\u0010\u001dR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001eR\u001a\u0010!\u001a\b\u0012\u0004\u0012\u00020 0\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u001d\u0010$\u001a\b\u0012\u0004\u0012\u00020 0#8\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'¨\u0006*"}, d2 = {"Lru/ozon/app/android/fresh/feature/b2b/actionHandlers/b2bDownloadFile/B2bDownloadFileViewModel;", "Landroidx/lifecycle/w0;", "Lru/ozon/app/android/fresh/feature/b2b/actionHandlers/b2bDownloadFile/B2bDownloadFileRepository;", "repository", "<init>", "(Lru/ozon/app/android/fresh/feature/b2b/actionHandlers/b2bDownloadFile/B2bDownloadFileRepository;)V", "LWe/M;", "body", "Ljava/io/File;", "cacheDir", "", "fileName", "saveToFile", "(LWe/M;Ljava/io/File;Ljava/lang/String;Lkotlin/coroutines/d;)Ljava/lang/Object;", "postData", "Lru/ozon/android/composerCommonViewKit/parsing/JsonParser;", "Lru/ozon/app/android/network/serialize/JsonDeserializer;", "jsonDeserializer", "getFileId", "(Ljava/lang/String;Lru/ozon/android/composerCommonViewKit/parsing/JsonParser;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Lretrofit2/Response;", "response", "getFileNameFromResponse", "(Lretrofit2/Response;)Ljava/lang/String;", "", "discardScreenState", "()V", "actionName", "downloadFile", "(Ljava/lang/String;Ljava/io/File;Ljava/lang/String;Lru/ozon/android/composerCommonViewKit/parsing/JsonParser;)V", "Lru/ozon/app/android/fresh/feature/b2b/actionHandlers/b2bDownloadFile/B2bDownloadFileRepository;", "LAe/x0;", "Lru/ozon/app/android/fresh/feature/b2b/actionHandlers/b2bDownloadFile/B2bDownloadFileViewModel$ScreenState;", "_screenState", "LAe/x0;", "LAe/M0;", "screenState", "LAe/M0;", "getScreenState", "()LAe/M0;", "Companion", "ScreenState", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class B2bDownloadFileViewModel extends w0 {

    @NotNull
    private final x0<ScreenState> _screenState;

    @NotNull
    private final B2bDownloadFileRepository repository;

    @NotNull
    private final M0<ScreenState> screenState;
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\b\t\n\u000b¨\u0006\f"}, d2 = {"Lru/ozon/app/android/fresh/feature/b2b/actionHandlers/b2bDownloadFile/B2bDownloadFileViewModel$ScreenState;", "", "<init>", "()V", "Idle", "Loading", "Error", "Success", "Lru/ozon/app/android/fresh/feature/b2b/actionHandlers/b2bDownloadFile/B2bDownloadFileViewModel$ScreenState$Error;", "Lru/ozon/app/android/fresh/feature/b2b/actionHandlers/b2bDownloadFile/B2bDownloadFileViewModel$ScreenState$Idle;", "Lru/ozon/app/android/fresh/feature/b2b/actionHandlers/b2bDownloadFile/B2bDownloadFileViewModel$ScreenState$Loading;", "Lru/ozon/app/android/fresh/feature/b2b/actionHandlers/b2bDownloadFile/B2bDownloadFileViewModel$ScreenState$Success;", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static abstract class ScreenState {

        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lru/ozon/app/android/fresh/feature/b2b/actionHandlers/b2bDownloadFile/B2bDownloadFileViewModel$ScreenState$Error;", "Lru/ozon/app/android/fresh/feature/b2b/actionHandlers/b2bDownloadFile/B2bDownloadFileViewModel$ScreenState;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
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
                return -1182764787;
            }

            @NotNull
            public String toString() {
                return "Error";
            }
        }

        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lru/ozon/app/android/fresh/feature/b2b/actionHandlers/b2bDownloadFile/B2bDownloadFileViewModel$ScreenState$Idle;", "Lru/ozon/app/android/fresh/feature/b2b/actionHandlers/b2bDownloadFile/B2bDownloadFileViewModel$ScreenState;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
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
                return -592237521;
            }

            @NotNull
            public String toString() {
                return "Idle";
            }
        }

        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lru/ozon/app/android/fresh/feature/b2b/actionHandlers/b2bDownloadFile/B2bDownloadFileViewModel$ScreenState$Loading;", "Lru/ozon/app/android/fresh/feature/b2b/actionHandlers/b2bDownloadFile/B2bDownloadFileViewModel$ScreenState;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
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
                return -949955839;
            }

            @NotNull
            public String toString() {
                return "Loading";
            }
        }

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/fresh/feature/b2b/actionHandlers/b2bDownloadFile/B2bDownloadFileViewModel$ScreenState$Success;", "Lru/ozon/app/android/fresh/feature/b2b/actionHandlers/b2bDownloadFile/B2bDownloadFileViewModel$ScreenState;", "Ljava/io/File;", "file", "<init>", "(Ljava/io/File;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/io/File;", "getFile", "()Ljava/io/File;", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Success extends ScreenState {

            @NotNull
            private final File file;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Success(@NotNull File file) {
                super(null);
                Intrinsics.checkNotNullParameter(file, "file");
                this.file = file;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Success) && Intrinsics.d(this.file, ((Success) other).file);
            }

            @NotNull
            public final File getFile() {
                return this.file;
            }

            public int hashCode() {
                return this.file.hashCode();
            }

            @NotNull
            public String toString() {
                return "Success(file=" + this.file + ")";
            }
        }

        public /* synthetic */ ScreenState(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ScreenState() {
        }
    }

    public B2bDownloadFileViewModel(@NotNull B2bDownloadFileRepository repository) {
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
    public final Object getFileId(String str, JsonParser jsonParser, d<? super String> dVar) {
        B2bDownloadFileViewModel$getFileId$1 b2bDownloadFileViewModel$getFileId$1;
        int i11;
        Object failure;
        if (dVar instanceof B2bDownloadFileViewModel$getFileId$1) {
            b2bDownloadFileViewModel$getFileId$1 = (B2bDownloadFileViewModel$getFileId$1) dVar;
            int i12 = b2bDownloadFileViewModel$getFileId$1.label;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                b2bDownloadFileViewModel$getFileId$1.label = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = b2bDownloadFileViewModel$getFileId$1.result;
                a aVar = a.COROUTINE_SUSPENDED;
                i11 = b2bDownloadFileViewModel$getFileId$1.label;
                if (i11 != 0) {
                    s.b(obj);
                    C10720e0 c10720e0 = C10720e0.f105451a;
                    b bVar = b.f10879b;
                    B2bDownloadFileViewModel$getFileId$result$1$1 b2bDownloadFileViewModel$getFileId$result$1$1 = new B2bDownloadFileViewModel$getFileId$result$1$1(jsonParser, str, null);
                    b2bDownloadFileViewModel$getFileId$1.label = 1;
                    obj = C10727i.f(bVar, b2bDownloadFileViewModel$getFileId$result$1$1, b2bDownloadFileViewModel$getFileId$1);
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
        b2bDownloadFileViewModel$getFileId$1 = new B2bDownloadFileViewModel$getFileId$1(this, dVar);
        Object obj2 = b2bDownloadFileViewModel$getFileId$1.result;
        a aVar2 = a.COROUTINE_SUSPENDED;
        i11 = b2bDownloadFileViewModel$getFileId$1.label;
        if (i11 != 0) {
        }
        failure = new Result.Success((String) obj2);
        if (!(failure instanceof Result.Failure)) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String getFileNameFromResponse(Response<M> response) {
        List m11;
        String str;
        String str2;
        String c11 = response.headers().c("Content-Disposition");
        if (c11 == null || (m11 = h.m(c11, new String[]{";"}, 0, 6)) == null || (str = (String) C7714v.Z(m11)) == null || (str2 = (String) C7714v.Z(h.m(str, new String[]{"="}, 0, 6))) == null) {
            return "temp";
        }
        String lowerCase = h.X(h.X(h.X(h.X(str2, "\\", "", false), "\"", "", false), "'", "", false), " ", "", false).toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        return h.o0(lowerCase, ".", lowerCase);
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
    public final Object saveToFile(M m11, File file, String str, d<? super File> dVar) {
        B2bDownloadFileViewModel$saveToFile$1 b2bDownloadFileViewModel$saveToFile$1;
        int i11;
        Object failure;
        if (dVar instanceof B2bDownloadFileViewModel$saveToFile$1) {
            b2bDownloadFileViewModel$saveToFile$1 = (B2bDownloadFileViewModel$saveToFile$1) dVar;
            int i12 = b2bDownloadFileViewModel$saveToFile$1.label;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                b2bDownloadFileViewModel$saveToFile$1.label = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = b2bDownloadFileViewModel$saveToFile$1.result;
                a aVar = a.COROUTINE_SUSPENDED;
                i11 = b2bDownloadFileViewModel$saveToFile$1.label;
                if (i11 != 0) {
                    s.b(obj);
                    C10720e0 c10720e0 = C10720e0.f105451a;
                    b bVar = b.f10879b;
                    B2bDownloadFileViewModel$saveToFile$result$1$1 b2bDownloadFileViewModel$saveToFile$result$1$1 = new B2bDownloadFileViewModel$saveToFile$result$1$1(m11, file, str, null);
                    b2bDownloadFileViewModel$saveToFile$1.label = 1;
                    obj = C10727i.f(bVar, b2bDownloadFileViewModel$saveToFile$result$1$1, b2bDownloadFileViewModel$saveToFile$1);
                    if (obj == aVar) {
                        return aVar;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    s.b(obj);
                }
                failure = new Result.Success((File) obj);
                if (!(failure instanceof Result.Failure)) {
                    return null;
                }
                if (failure instanceof Result.Success) {
                    return (File) ((Result.Success) failure).getValue();
                }
                throw new o();
            }
        }
        b2bDownloadFileViewModel$saveToFile$1 = new B2bDownloadFileViewModel$saveToFile$1(this, dVar);
        Object obj2 = b2bDownloadFileViewModel$saveToFile$1.result;
        a aVar2 = a.COROUTINE_SUSPENDED;
        i11 = b2bDownloadFileViewModel$saveToFile$1.label;
        if (i11 != 0) {
        }
        failure = new Result.Success((File) obj2);
        if (!(failure instanceof Result.Failure)) {
        }
    }

    public final void discardScreenState() {
        this._screenState.setValue(ScreenState.Idle.INSTANCE);
    }

    public final void downloadFile(@NotNull String actionName, @NotNull File cacheDir, @NotNull String postData, @NotNull JsonParser jsonDeserializer) {
        Intrinsics.checkNotNullParameter(actionName, "actionName");
        Intrinsics.checkNotNullParameter(cacheDir, "cacheDir");
        Intrinsics.checkNotNullParameter(postData, "postData");
        Intrinsics.checkNotNullParameter(jsonDeserializer, "jsonDeserializer");
        C10727i.c(androidx.lifecycle.x0.a(this), null, null, new B2bDownloadFileViewModel$downloadFile$1(this, postData, jsonDeserializer, actionName, cacheDir, null), 3);
    }

    @NotNull
    public final M0<ScreenState> getScreenState() {
        return this.screenState;
    }
}
