package kc0;

import com.vk.id.VKIDAuthFail;
import com.vk.id.onetap.common.OneTapOAuth;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
final class x extends AbstractC7737t implements Function2<OneTapOAuth, VKIDAuthFail, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ C7645c f71414b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    x(C7645c c7645c) {
        super(2);
        this.f71414b = c7645c;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(OneTapOAuth oneTapOAuth, VKIDAuthFail vKIDAuthFail) {
        VKIDAuthFail fail = vKIDAuthFail;
        Intrinsics.checkNotNullParameter(fail, "fail");
        C7629C C11 = this.f71414b.C();
        C11.getClass();
        Intrinsics.checkNotNullParameter(fail, "fail");
        C11.N0(fail);
        return Unit.f71690a;
    }
}
