package com.ironsource;

import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.ironsource.i4, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C2467i4 implements InterfaceC2414f5<C2757y8> {
    private final W5 a;
    private final String b;
    private final InterfaceC2756y7 c;
    private final Function1<Result<? extends C2757y8>, Unit> d;
    private C2757y8 e;

    /* JADX WARN: Multi-variable type inference failed */
    public C2467i4(W5 fileUrl, String destinationPath, InterfaceC2756y7 downloadManager, Function1<? super Result<? extends C2757y8>, Unit> onFinish) {
        Intrinsics.checkNotNullParameter(fileUrl, "fileUrl");
        Intrinsics.checkNotNullParameter(destinationPath, "destinationPath");
        Intrinsics.checkNotNullParameter(downloadManager, "downloadManager");
        Intrinsics.checkNotNullParameter(onFinish, "onFinish");
        this.a = fileUrl;
        this.b = destinationPath;
        this.c = downloadManager;
        this.d = onFinish;
        this.e = new C2757y8(c());
    }

    @Override // com.ironsource.Nc
    public void a(C2757y8 file) {
        Intrinsics.checkNotNullParameter(file, "file");
        Function1<Result<? extends C2757y8>, Unit> i = i();
        Result.Companion companion = Result.INSTANCE;
        i.invoke(Result.m11179boximpl(Result.m11180constructorimpl(file)));
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
    public Function1<Result<? extends C2757y8>, Unit> i() {
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

    @Override // com.ironsource.Nc
    public void a(C2757y8 c2757y8, C2596p8 error) {
        Intrinsics.checkNotNullParameter(error, "error");
        Function1<Result<? extends C2757y8>, Unit> i = i();
        Result.Companion companion = Result.INSTANCE;
        i.invoke(Result.m11179boximpl(Result.m11180constructorimpl(ResultKt.createFailure(new Exception("Unable to download mobileController.html: " + error.b())))));
    }
}
