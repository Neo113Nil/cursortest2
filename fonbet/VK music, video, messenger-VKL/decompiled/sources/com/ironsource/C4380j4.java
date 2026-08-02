package com.ironsource;

import android.util.Log;
import com.ironsource.InterfaceC4345h4;
import com.ironsource.sdk.utils.IronSourceStorageUtils;
import com.ironsource.sdk.utils.SDKUtils;
import kotlin.Result;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.text.Regex;
import org.json.JSONObject;
import xsna.epx;
import xsna.fo8;
import xsna.fw3;
import xsna.izs;
import xsna.nbr;
import xsna.s3q0;

/* renamed from: com.ironsource.j4, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C4380j4 implements InterfaceC4580u7 {
    private final C4327g4 a;
    private final izs<C4671z8, Object> b;
    private final InterfaceC4670z7 c;
    private final InterfaceC4488p4 d;
    private C4671z8 f;
    private long g;
    private final C4264cd h;
    private final String e = "j4";
    private String i = "";

    /* renamed from: com.ironsource.j4$a */
    public /* synthetic */ class a extends FunctionReferenceImpl implements izs<Result<? extends C4671z8>, s3q0> {
        public a(Object obj) {
            super(1, obj, C4380j4.class, "onHtmlDownloadFinished", "onHtmlDownloadFinished(Ljava/lang/Object;)V", 0);
        }

        public final void a(Object obj) {
            ((C4380j4) this.receiver).b(obj);
        }

        @Override // xsna.izs
        public /* bridge */ /* synthetic */ s3q0 invoke(Result<? extends C4671z8> result) {
            a(result.d());
            return s3q0.a;
        }
    }

    /* renamed from: com.ironsource.j4$b */
    public /* synthetic */ class b extends FunctionReferenceImpl implements izs<Result<? extends JSONObject>, s3q0> {
        public b(Object obj) {
            super(1, obj, C4380j4.class, "onAbTestDownloadFinished", "onAbTestDownloadFinished(Ljava/lang/Object;)V", 0);
        }

        public final void a(Object obj) {
            ((C4380j4) this.receiver).a(obj);
        }

        @Override // xsna.izs
        public /* bridge */ /* synthetic */ s3q0 invoke(Result<? extends JSONObject> result) {
            a(result.d());
            return s3q0.a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C4380j4(C4327g4 c4327g4, izs<? super C4671z8, ? extends Object> izsVar, InterfaceC4670z7 interfaceC4670z7, InterfaceC4488p4 interfaceC4488p4) {
        this.a = c4327g4;
        this.b = izsVar;
        this.c = interfaceC4670z7;
        this.d = interfaceC4488p4;
        this.f = new C4671z8(c4327g4.d(), "mobileController_0.html");
        this.g = interfaceC4488p4.a();
        this.h = new C4264cd(c4327g4.a());
    }

    @Override // com.ironsource.InterfaceC4580u7
    public C4671z8 c() {
        return this.f;
    }

    public final izs<C4671z8, Object> d() {
        return this.b;
    }

    public final InterfaceC4488p4 a() {
        return this.d;
    }

    @Override // com.ironsource.InterfaceC4580u7
    public void b() {
        this.g = this.d.a();
        new C4250c(new C4268d(this.h), fo8.a(this.a.d(), "/temp"), this.c, new b(this)).m();
    }

    @Override // com.ironsource.InterfaceC4580u7
    public boolean a(C4671z8 c4671z8) {
        return new Regex("mobileController(_\\d+)?\\.html").f(c4671z8.getName());
    }

    private final C4363i4 a(String str) {
        return new C4363i4(new Cg(this.h, str), fw3.c(this.a.d(), "/mobileController_", str, ".html"), this.c, new a(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final void b(Object obj) {
        boolean z = obj instanceof Result.Failure;
        if (!z) {
            C4671z8 c4671z8 = (C4671z8) (z ? null : obj);
            if (!epx.f(c4671z8 != null ? c4671z8.getAbsolutePath() : null, this.f.getAbsolutePath())) {
                try {
                    IronSourceStorageUtils.deleteFile(this.f);
                    nbr.k(c4671z8, this.f, true, 4);
                } catch (Exception e) {
                    C4452n4.d().a(e);
                    Log.e(this.e, "Unable to copy downloaded mobileController.html to cache folder: " + e.getMessage());
                }
                this.f = c4671z8;
            }
            new InterfaceC4345h4.b(this.a.b(), this.g, this.d).a();
        } else {
            new InterfaceC4345h4.a(this.a.b()).a();
        }
        izs<C4671z8, Object> izsVar = this.b;
        if (z) {
            obj = null;
        }
        izsVar.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(Object obj) {
        if (obj instanceof Result.Failure) {
            obj = null;
        }
        JSONObject jSONObject = (JSONObject) obj;
        if (jSONObject != null && !epx.f(jSONObject.optString("htmlBuildNumber"), "")) {
            SDKUtils.updateControllerConfig("abTestMap", jSONObject);
            String string = jSONObject.getString("htmlBuildNumber");
            this.i = string;
            C4363i4 a2 = a(string);
            if (a2.j()) {
                C4671z8 k = a2.k();
                this.f = k;
                this.b.invoke(k);
                return;
            }
            a2.m();
            return;
        }
        a("0").m();
    }
}
