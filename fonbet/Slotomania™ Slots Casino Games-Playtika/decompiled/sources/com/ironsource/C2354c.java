package com.ironsource;

import com.ironsource.sdk.utils.IronSourceStorageUtils;
import com.safedk.android.internal.partials.IronSourceNetworkBridge;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* renamed from: com.ironsource.c, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2354c implements InterfaceC2414f5<JSONObject> {
    private final W5 a;
    private final String b;
    private final InterfaceC2756y7 c;
    private final Function1<Result<? extends JSONObject>, Unit> d;
    private C2757y8 e;

    /* JADX WARN: Multi-variable type inference failed */
    public C2354c(W5 fileUrl, String destinationPath, InterfaceC2756y7 downloadManager, Function1<? super Result<? extends JSONObject>, Unit> onFinish) {
        Intrinsics.checkNotNullParameter(fileUrl, "fileUrl");
        Intrinsics.checkNotNullParameter(destinationPath, "destinationPath");
        Intrinsics.checkNotNullParameter(downloadManager, "downloadManager");
        Intrinsics.checkNotNullParameter(onFinish, "onFinish");
        this.a = fileUrl;
        this.b = destinationPath;
        this.c = downloadManager;
        this.d = onFinish;
        this.e = new C2757y8(c(), X3.i);
    }

    @Override // com.ironsource.Nc
    public void a(C2757y8 file) {
        Intrinsics.checkNotNullParameter(file, "file");
        if (Intrinsics.areEqual(file.getName(), X3.i)) {
            try {
                JSONObject c = c(file);
                Function1<Result<? extends JSONObject>, Unit> i = i();
                Result.Companion companion = Result.INSTANCE;
                i.invoke(Result.m11179boximpl(Result.m11180constructorimpl(c)));
            } catch (Exception e) {
                C2556n4.d().a(e);
                Function1<Result<? extends JSONObject>, Unit> i2 = i();
                Result.Companion companion2 = Result.INSTANCE;
                i2.invoke(Result.m11179boximpl(Result.m11180constructorimpl(ResultKt.createFailure(e))));
            }
        }
    }

    @Override // com.ironsource.InterfaceC2414f5
    public void b(C2757y8 c2757y8) {
        Intrinsics.checkNotNullParameter(c2757y8, "<set-?>");
        this.e = c2757y8;
    }

    @Override // com.ironsource.InterfaceC2414f5
    public String c() {
        return this.b;
    }

    @Override // com.ironsource.InterfaceC2414f5
    public W5 d() {
        return this.a;
    }

    @Override // com.ironsource.InterfaceC2414f5
    public Function1<Result<? extends JSONObject>, Unit> i() {
        return this.d;
    }

    @Override // com.ironsource.InterfaceC2414f5
    public C2757y8 k() {
        return this.e;
    }

    @Override // com.ironsource.InterfaceC2414f5
    public InterfaceC2756y7 l() {
        return this.c;
    }

    private final JSONObject c(C2757y8 c2757y8) {
        return IronSourceNetworkBridge.jsonObjectInit(IronSourceStorageUtils.readFile(c2757y8));
    }

    @Override // com.ironsource.Nc
    public void a(C2757y8 c2757y8, C2596p8 error) {
        Intrinsics.checkNotNullParameter(error, "error");
        Function1<Result<? extends JSONObject>, Unit> i = i();
        Result.Companion companion = Result.INSTANCE;
        i.invoke(Result.m11179boximpl(Result.m11180constructorimpl(ResultKt.createFailure(new Exception("Unable to download abTestMap.json: " + error.b())))));
    }
}
