package rl0;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.rustore.sdk.appupdate.model.AppUpdateInfo;

/* renamed from: rl0.c, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C9292c extends AbstractC7737t implements Function1<wl0.c, Unit> {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ lm0.e<AppUpdateInfo> f83671b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9292c(lm0.e<AppUpdateInfo> eVar) {
        super(1);
        this.f83671b = eVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(wl0.c cVar) {
        wl0.c error = cVar;
        Intrinsics.checkNotNullParameter(error, "error");
        this.f83671b.a(error);
        return Unit.f71690a;
    }
}
