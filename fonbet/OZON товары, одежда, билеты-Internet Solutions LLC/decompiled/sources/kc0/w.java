package kc0;

import com.vk.id.AccessToken;
import com.vk.id.onetap.common.OneTapOAuth;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
final class w extends AbstractC7737t implements Function2<OneTapOAuth, AccessToken, Unit> {

    /* renamed from: b, reason: collision with root package name */
    public static final w f71413b = new w(2);

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(OneTapOAuth oneTapOAuth, AccessToken accessToken) {
        Intrinsics.checkNotNullParameter(accessToken, "<unused var>");
        return Unit.f71690a;
    }
}
