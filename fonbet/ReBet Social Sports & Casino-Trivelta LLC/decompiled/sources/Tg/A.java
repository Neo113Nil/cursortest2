package Tg;

import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Typography;

/* loaded from: classes3.dex */
public final class A extends x {

    /* renamed from: b, reason: collision with root package name */
    public final String f11796b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public A(Xg.c response, String cachedResponseText) {
        super(response, cachedResponseText);
        Intrinsics.checkNotNullParameter(response, "response");
        Intrinsics.checkNotNullParameter(cachedResponseText, "cachedResponseText");
        this.f11796b = "Server error(" + response.r().e().getMethod().d() + ' ' + response.r().e().getUrl() + ": " + response.f() + ". Text: \"" + cachedResponseText + Typography.quote;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return this.f11796b;
    }
}
