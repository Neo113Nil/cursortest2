package com.ironsource;

import android.util.Log;
import com.ironsource.InterfaceC2449h4;
import com.ironsource.sdk.utils.IronSourceStorageUtils;
import com.ironsource.sdk.utils.SDKUtils;
import kotlin.Result;
import kotlin.Unit;
import kotlin.io.FilesKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import org.json.JSONObject;

/* renamed from: com.ironsource.j4, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C2484j4 implements InterfaceC2666t7 {
    private final C2431g4 a;
    private final Function1<C2757y8, Object> b;
    private final InterfaceC2756y7 c;
    private final InterfaceC2592p4 d;
    private final String e;
    private C2757y8 f;
    private long g;
    private final C2368cd h;
    private String i;

    /* renamed from: com.ironsource.j4$a */
    /* synthetic */ class a extends FunctionReferenceImpl implements Function1<Result<? extends C2757y8>, Unit> {
        a(Object obj) {
            super(1, obj, C2484j4.class, "onHtmlDownloadFinished", "onHtmlDownloadFinished(Ljava/lang/Object;)V", 0);
        }

        public final void a(Object obj) {
            ((C2484j4) this.receiver).b(obj);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Result<? extends C2757y8> result) {
            a(result.getValue());
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.ironsource.j4$b */
    /* synthetic */ class b extends FunctionReferenceImpl implements Function1<Result<? extends JSONObject>, Unit> {
        b(Object obj) {
            super(1, obj, C2484j4.class, "onAbTestDownloadFinished", "onAbTestDownloadFinished(Ljava/lang/Object;)V", 0);
        }

        public final void a(Object obj) {
            ((C2484j4) this.receiver).a(obj);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Result<? extends JSONObject> result) {
            a(result.getValue());
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C2484j4(C2431g4 config, Function1<? super C2757y8, ? extends Object> onFinish, InterfaceC2756y7 downloadManager, InterfaceC2592p4 currentTimeProvider) {
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(onFinish, "onFinish");
        Intrinsics.checkNotNullParameter(downloadManager, "downloadManager");
        Intrinsics.checkNotNullParameter(currentTimeProvider, "currentTimeProvider");
        this.a = config;
        this.b = onFinish;
        this.c = downloadManager;
        this.d = currentTimeProvider;
        this.e = "j4";
        this.f = new C2757y8(config.d(), "mobileController_0.html");
        this.g = currentTimeProvider.a();
        this.h = new C2368cd(config.a());
        this.i = "";
    }

    @Override // com.ironsource.InterfaceC2666t7
    public C2757y8 c() {
        return this.f;
    }

    public final Function1<C2757y8, Object> d() {
        return this.b;
    }

    public final InterfaceC2592p4 a() {
        return this.d;
    }

    @Override // com.ironsource.InterfaceC2666t7
    public void b() {
        this.g = this.d.a();
        new C2354c(new C2372d(this.h), this.a.d() + "/temp", this.c, new b(this)).m();
    }

    @Override // com.ironsource.InterfaceC2666t7
    public boolean a(C2757y8 file) {
        Intrinsics.checkNotNullParameter(file, "file");
        String name = file.getName();
        Intrinsics.checkNotNullExpressionValue(name, "file.name");
        return new Regex("mobileController(_\\d+)?\\.html").matches(name);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(Object obj) {
        if (Result.m11186isFailureimpl(obj)) {
            obj = null;
        }
        JSONObject jSONObject = (JSONObject) obj;
        if (jSONObject != null && !Intrinsics.areEqual(jSONObject.optString("htmlBuildNumber"), "")) {
            SDKUtils.updateControllerConfig("abTestMap", jSONObject);
            String string = jSONObject.getString("htmlBuildNumber");
            Intrinsics.checkNotNullExpressionValue(string, "abTestMapAsJson.getString(\"htmlBuildNumber\")");
            this.i = string;
            C2467i4 a2 = a(string);
            if (a2.j()) {
                C2757y8 k = a2.k();
                this.f = k;
                this.b.invoke(k);
                return;
            }
            a2.m();
            return;
        }
        a("0").m();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final void b(Object obj) {
        if (Result.m11187isSuccessimpl(obj)) {
            C2757y8 c2757y8 = (C2757y8) (Result.m11186isFailureimpl(obj) ? null : obj);
            if (!Intrinsics.areEqual(c2757y8 != null ? c2757y8.getAbsolutePath() : null, this.f.getAbsolutePath())) {
                try {
                    IronSourceStorageUtils.deleteFile(this.f);
                    Intrinsics.checkNotNull(c2757y8);
                    FilesKt.copyTo$default(c2757y8, this.f, true, 0, 4, null);
                } catch (Exception e) {
                    C2556n4.d().a(e);
                    Log.e(this.e, "Unable to copy downloaded mobileController.html to cache folder: " + e.getMessage());
                }
                Intrinsics.checkNotNull(c2757y8);
                this.f = c2757y8;
            }
            new InterfaceC2449h4.b(this.a.b(), this.g, this.d).a();
        } else {
            new InterfaceC2449h4.a(this.a.b()).a();
        }
        Function1<C2757y8, Object> function1 = this.b;
        if (Result.m11186isFailureimpl(obj)) {
            obj = null;
        }
        function1.invoke(obj);
    }

    private final C2467i4 a(String str) {
        return new C2467i4(new C2729wg(this.h, str), this.a.d() + "/mobileController_" + str + ".html", this.c, new a(this));
    }
}
