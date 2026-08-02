package oa;

import com.vk.id.VKIDUser;
import com.vk.id.group.subscription.common.fail.VKIDGroupSubscriptionFail;
import com.vk.id.internal.auth.app.SilentAuthInfoUtils;
import com.vk.id.onetap.compose.button.auth.VKIDButtonKt;
import com.vk.id.onetap.compose.onetap.OneTapKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.fintech.ui.ActionResult2UI;

/* renamed from: oa.a, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final /* synthetic */ class C8678a implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f77860a;

    public /* synthetic */ C8678a(int i11) {
        this.f77860a = i11;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        String calculateDigestBase64$lambda$0;
        Unit VKIDButton$lambda$1$lambda$0;
        Unit OneTap$lambda$13$lambda$12;
        switch (this.f77860a) {
            case 0:
                calculateDigestBase64$lambda$0 = SilentAuthInfoUtils.calculateDigestBase64$lambda$0((byte[]) obj);
                return calculateDigestBase64$lambda$0;
            case 1:
                Intrinsics.checkNotNullParameter((ActionResult2UI) obj, "<unused var>");
                return Unit.f71690a;
            case 2:
                VKIDButton$lambda$1$lambda$0 = VKIDButtonKt.VKIDButton$lambda$1$lambda$0((VKIDUser) obj);
                return VKIDButton$lambda$1$lambda$0;
            default:
                OneTap$lambda$13$lambda$12 = OneTapKt.OneTap$lambda$13$lambda$12((VKIDGroupSubscriptionFail) obj);
                return OneTap$lambda$13$lambda$12;
        }
    }
}
