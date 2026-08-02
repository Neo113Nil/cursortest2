package Tg;

import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Typography;

/* loaded from: classes3.dex */
public class x extends IllegalStateException {

    /* renamed from: a, reason: collision with root package name */
    public final transient Xg.c f11989a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(Xg.c response, String cachedResponseText) {
        super("Bad response: " + response + ". Text: \"" + cachedResponseText + Typography.quote);
        Intrinsics.checkNotNullParameter(response, "response");
        Intrinsics.checkNotNullParameter(cachedResponseText, "cachedResponseText");
        this.f11989a = response;
    }
}
