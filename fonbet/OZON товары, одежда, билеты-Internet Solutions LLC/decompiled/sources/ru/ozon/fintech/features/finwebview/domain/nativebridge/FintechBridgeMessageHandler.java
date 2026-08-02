package ru.ozon.fintech.features.finwebview.domain.nativebridge;

import android.app.Application;
import android.webkit.JavascriptInterface;
import androidx.annotation.Keep;
import androidx.recyclerview.widget.LinearLayoutManager;
import fd.InterfaceC6512o;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;
import xe.C10720e0;
import xe.C10727i;
import xe.M;

@Keep
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\b\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\t\b\u0001\u0018\u0000 &2\u00020\u0001:\u0001'B\u0087\u0001\u0012.\u0010\u0007\u001a*\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0002j\u0002`\u0006\u0012(\u0010\n\u001a$\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00030\bj\u0002`\t\u0012\u001c\u0010\r\u001a\u0018\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u000bj\u0002`\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0018\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u0003H\u0082@¢\u0006\u0004\b\u0013\u0010\u0014J\u0019\u0010\u0016\u001a\u00020\u00052\b\u0010\u0015\u001a\u0004\u0018\u00010\u0003H\u0017¢\u0006\u0004\b\u0016\u0010\u0017J\u0019\u0010\u0018\u001a\u00020\u00032\b\u0010\u0015\u001a\u0004\u0018\u00010\u0003H\u0017¢\u0006\u0004\b\u0018\u0010\u0019J\u0019\u0010\r\u001a\u00020\u00032\b\u0010\u0015\u001a\u0004\u0018\u00010\u0003H\u0017¢\u0006\u0004\b\r\u0010\u0019J\u0019\u0010\u001a\u001a\u00020\u00032\b\u0010\u0012\u001a\u0004\u0018\u00010\u0003H\u0017¢\u0006\u0004\b\u001a\u0010\u0019R<\u0010\u0007\u001a*\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0002j\u0002`\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u001bR6\u0010\n\u001a$\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00030\bj\u0002`\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u001cR*\u0010\r\u001a\u0018\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u000bj\u0002`\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u001dR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u001eR\"\u0010 \u001a\u00020\u001f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%¨\u0006("}, d2 = {"Lru/ozon/fintech/features/finwebview/domain/nativebridge/FintechBridgeMessageHandler;", "Lru/ozon/fintech/features/finwebview/domain/nativebridge/JavaScriptInterface;", "Lkotlin/Function5;", "", "", "", "Lru/ozon/fintech/features/finwebview/domain/nativebridge/HandleJsCall;", "handleJsCall", "Lkotlin/Function4;", "Lru/ozon/fintech/features/finwebview/domain/nativebridge/HandleJsCallSync;", "handleJsCallSync", "Lkotlin/Function2;", "Lru/ozon/fintech/features/finwebview/domain/nativebridge/CheckMethodCall;", "checkMethod", "Landroid/app/Application;", "application", "<init>", "(Lfd/p;Lfd/o;Lkotlin/jvm/functions/Function2;Landroid/app/Application;)V", "fileName", "readFileData", "(Ljava/lang/String;Lkotlin/coroutines/d;)Ljava/lang/Object;", "parametersJson", "call", "(Ljava/lang/String;)V", "callSync", "(Ljava/lang/String;)Ljava/lang/String;", "getFile", "Lfd/p;", "Lfd/o;", "Lkotlin/jvm/functions/Function2;", "Landroid/app/Application;", "", "shouldItHandle", "Z", "getShouldItHandle", "()Z", "setShouldItHandle", "(Z)V", "Companion", "a", "finwebview_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class FintechBridgeMessageHandler implements JavaScriptInterface {

    @NotNull
    private static final String BASE_64_DIR = "base64";
    private static final int BUFFER_BYTES = 10240;

    @NotNull
    private static final String CALLBACK_UUID_JSON_FIELD_NAME = "callback_uuid";

    @NotNull
    private static final String DATA_JSON_FIELD_NAME = "data";

    @NotNull
    private static final String INTERFACE_GROUP_JSON_FIELD_NAME = "handler";

    @NotNull
    private static final String INTERFACE_NAME_JSON_FIELD_NAME = "interface";

    @NotNull
    private static final String TAG = "ScriptMessageHandler";

    @NotNull
    private static final String VERSION_JSON_FIELD_NAME = "version";

    @NotNull
    private final Application application;

    @NotNull
    private final Function2<String, String, String> checkMethod;

    @NotNull
    private final fd.p<String, String, String, String, Integer, Unit> handleJsCall;

    @NotNull
    private final InterfaceC6512o<String, String, String, Integer, String> handleJsCallSync;
    private boolean shouldItHandle;

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.fintech.features.finwebview.domain.nativebridge.FintechBridgeMessageHandler$getFile$1", f = "FintechBridgeMessageHandler.kt", l = {117}, m = "invokeSuspend")
    static final class b extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super String>, Object> {

        /* renamed from: d, reason: collision with root package name */
        String f95504d;

        /* renamed from: e, reason: collision with root package name */
        int f95505e;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ String f95507g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(String str, kotlin.coroutines.d<? super b> dVar) {
            super(2, dVar);
            this.f95507g = str;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return FintechBridgeMessageHandler.this.new b(this.f95507g, dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super String> dVar) {
            return ((b) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        /* JADX WARN: Removed duplicated region for block: B:12:? A[RETURN, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:9:0x005e  */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            String str;
            String str2;
            String str3;
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f95505e;
            if (i11 == 0) {
                Sc.s.b(obj);
                FintechBridgeMessageHandler fintechBridgeMessageHandler = FintechBridgeMessageHandler.this;
                if (!fintechBridgeMessageHandler.getShouldItHandle() || (str = this.f95507g) == null) {
                    return "";
                }
                try {
                    this.f95504d = str;
                    this.f95505e = 1;
                    obj = fintechBridgeMessageHandler.readFileData(str, this);
                    if (obj == aVar) {
                        return aVar;
                    }
                    str2 = str;
                } catch (Exception e11) {
                    e = e11;
                    str2 = str;
                    L80.a.b(FintechBridgeMessageHandler.TAG, "Can't read file = " + str2 + " with error = " + e.getMessage());
                    str3 = "";
                    if (str3 == null) {
                    }
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                str2 = this.f95504d;
                try {
                    Sc.s.b(obj);
                } catch (Exception e12) {
                    e = e12;
                    L80.a.b(FintechBridgeMessageHandler.TAG, "Can't read file = " + str2 + " with error = " + e.getMessage());
                    str3 = "";
                    if (str3 == null) {
                    }
                }
            }
            str3 = (String) obj;
            return str3 == null ? "" : str3;
        }
    }

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.fintech.features.finwebview.domain.nativebridge.FintechBridgeMessageHandler", f = "FintechBridgeMessageHandler.kt", l = {127}, m = "readFileData")
    static final class c extends kotlin.coroutines.jvm.internal.c {

        /* renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f95508d;

        /* renamed from: f, reason: collision with root package name */
        int f95510f;

        c(kotlin.coroutines.d<? super c> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f95508d = obj;
            this.f95510f |= LinearLayoutManager.INVALID_OFFSET;
            return FintechBridgeMessageHandler.this.readFileData(null, this);
        }
    }

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.fintech.features.finwebview.domain.nativebridge.FintechBridgeMessageHandler$readFileData$2", f = "FintechBridgeMessageHandler.kt", l = {}, m = "invokeSuspend")
    static final class d extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super String>, Object> {

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ String f95512e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(String str, kotlin.coroutines.d<? super d> dVar) {
            super(2, dVar);
            this.f95512e = str;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return FintechBridgeMessageHandler.this.new d(this.f95512e, dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super String> dVar) {
            return ((d) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            Sc.s.b(obj);
            File file = new File(FintechBridgeMessageHandler.this.application.getFilesDir(), FintechBridgeMessageHandler.BASE_64_DIR);
            File file2 = new File(file, this.f95512e);
            String name = file2.getName();
            Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
            if (name.length() <= 0 || Intrinsics.d(file2.getName(), ".") || Intrinsics.d(file2.getName(), "..")) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            String canonicalPath = file2.getCanonicalPath();
            String str = file.getCanonicalPath() + "/";
            Intrinsics.f(canonicalPath);
            if (!kotlin.text.h.e0(canonicalPath, str, false)) {
                throw new IllegalArgumentException("Security Exception: Path traversal");
            }
            StringBuilder sb2 = new StringBuilder();
            FileInputStream fileInputStream = new FileInputStream(file2);
            try {
                InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream, Charsets.UTF_8);
                try {
                    char[] cArr = new char[FintechBridgeMessageHandler.BUFFER_BYTES];
                    while (true) {
                        int read = inputStreamReader.read(cArr);
                        if (read == -1) {
                            Unit unit = Unit.f71690a;
                            inputStreamReader.close();
                            fileInputStream.close();
                            file2.delete();
                            return sb2.toString();
                        }
                        sb2.append(cArr, 0, read);
                    }
                } finally {
                }
            } finally {
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public FintechBridgeMessageHandler(@NotNull fd.p<? super String, ? super String, ? super String, ? super String, ? super Integer, Unit> handleJsCall, @NotNull InterfaceC6512o<? super String, ? super String, ? super String, ? super Integer, String> handleJsCallSync, @NotNull Function2<? super String, ? super String, String> checkMethod, @NotNull Application application) {
        Intrinsics.checkNotNullParameter(handleJsCall, "handleJsCall");
        Intrinsics.checkNotNullParameter(handleJsCallSync, "handleJsCallSync");
        Intrinsics.checkNotNullParameter(checkMethod, "checkMethod");
        Intrinsics.checkNotNullParameter(application, "application");
        this.handleJsCall = handleJsCall;
        this.handleJsCallSync = handleJsCallSync;
        this.checkMethod = checkMethod;
        this.application = application;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object readFileData(String str, kotlin.coroutines.d<? super String> dVar) {
        c cVar;
        int i11;
        if (dVar instanceof c) {
            cVar = (c) dVar;
            int i12 = cVar.f95510f;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                cVar.f95510f = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = cVar.f95508d;
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                i11 = cVar.f95510f;
                if (i11 != 0) {
                    Sc.s.b(obj);
                    C10720e0 c10720e0 = C10720e0.f105451a;
                    He.b bVar = He.b.f10879b;
                    d dVar2 = new d(str, null);
                    cVar.f95510f = 1;
                    obj = C10727i.f(bVar, dVar2, cVar);
                    if (obj == aVar) {
                        return aVar;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Sc.s.b(obj);
                }
                Intrinsics.checkNotNullExpressionValue(obj, "withContext(...)");
                return obj;
            }
        }
        cVar = new c(dVar);
        Object obj2 = cVar.f95508d;
        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
        i11 = cVar.f95510f;
        if (i11 != 0) {
        }
        Intrinsics.checkNotNullExpressionValue(obj2, "withContext(...)");
        return obj2;
    }

    @Override // ru.ozon.fintech.features.finwebview.domain.nativebridge.JavaScriptInterface
    @JavascriptInterface
    public void call(String parametersJson) {
        if (!this.shouldItHandle || parametersJson == null) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(parametersJson);
            L80.a.a(TAG, parametersJson);
            String optString = jSONObject.optString(DATA_JSON_FIELD_NAME);
            String optString2 = jSONObject.optString(CALLBACK_UUID_JSON_FIELD_NAME);
            String optString3 = jSONObject.optString(INTERFACE_GROUP_JSON_FIELD_NAME);
            String optString4 = jSONObject.optString(INTERFACE_NAME_JSON_FIELD_NAME);
            int optInt = jSONObject.optInt(VERSION_JSON_FIELD_NAME, 1);
            fd.p<String, String, String, String, Integer, Unit> pVar = this.handleJsCall;
            Intrinsics.f(optString3);
            Intrinsics.f(optString4);
            Intrinsics.f(optString2);
            Intrinsics.f(optString);
            pVar.invoke(optString3, optString4, optString2, optString, Integer.valueOf(optInt));
        } catch (JSONException e11) {
            L80.a.b(TAG, "Error parse JSON object");
            L80.a.c(TAG, null, e11);
        }
    }

    @Override // ru.ozon.fintech.features.finwebview.domain.nativebridge.JavaScriptInterface
    @JavascriptInterface
    @NotNull
    public String callSync(String parametersJson) {
        if (!this.shouldItHandle || parametersJson == null) {
            return "";
        }
        try {
            JSONObject jSONObject = new JSONObject(parametersJson);
            String optString = jSONObject.optString(DATA_JSON_FIELD_NAME);
            String optString2 = jSONObject.optString(INTERFACE_GROUP_JSON_FIELD_NAME);
            String optString3 = jSONObject.optString(INTERFACE_NAME_JSON_FIELD_NAME);
            int optInt = jSONObject.optInt(VERSION_JSON_FIELD_NAME, 1);
            InterfaceC6512o<String, String, String, Integer, String> interfaceC6512o = this.handleJsCallSync;
            Intrinsics.f(optString2);
            Intrinsics.f(optString3);
            Intrinsics.f(optString);
            return interfaceC6512o.invoke(optString2, optString3, optString, Integer.valueOf(optInt));
        } catch (JSONException e11) {
            L80.a.b(TAG, "Error parse JSON object e=" + e11);
            return "";
        }
    }

    @Override // ru.ozon.fintech.features.finwebview.domain.nativebridge.JavaScriptInterface
    @JavascriptInterface
    @NotNull
    public String checkMethod(String parametersJson) {
        if (!this.shouldItHandle || parametersJson == null) {
            return "";
        }
        try {
            JSONObject jSONObject = new JSONObject(parametersJson);
            String optString = jSONObject.optString(INTERFACE_GROUP_JSON_FIELD_NAME);
            String optString2 = jSONObject.optString(INTERFACE_NAME_JSON_FIELD_NAME);
            Function2<String, String, String> function2 = this.checkMethod;
            Intrinsics.f(optString);
            Intrinsics.f(optString2);
            return function2.invoke(optString, optString2);
        } catch (JSONException e11) {
            L80.a.b(TAG, "Error parse JSON object e=" + e11);
            return "";
        }
    }

    @Override // ru.ozon.fintech.features.finwebview.domain.nativebridge.JavaScriptInterface
    @JavascriptInterface
    @NotNull
    public String getFile(String fileName) {
        return (String) C10727i.d(kotlin.coroutines.g.f71771a, new b(fileName, null));
    }

    public final boolean getShouldItHandle() {
        return this.shouldItHandle;
    }

    public final void setShouldItHandle(boolean z11) {
        this.shouldItHandle = z11;
    }
}
