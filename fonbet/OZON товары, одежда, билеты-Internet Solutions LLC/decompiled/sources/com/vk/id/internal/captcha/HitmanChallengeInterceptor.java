package com.vk.id.internal.captcha;

import We.B;
import We.C;
import We.F;
import We.L;
import We.M;
import androidx.recyclerview.widget.m;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.cabinet.activationtitle.data.DiscountCodeResponse;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/vk/id/internal/captcha/HitmanChallengeInterceptor;", "LWe/B;", "<init>", "()V", "LWe/B$a;", "chain", "LWe/L;", "intercept", "(LWe/B$a;)LWe/L;", "vkid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class HitmanChallengeInterceptor implements B {
    @Override // We.B
    @NotNull
    public L intercept(@NotNull B.a chain) {
        Intrinsics.checkNotNullParameter(chain, "chain");
        String d11 = chain.request().d("X-Challenge-Solution");
        if (d11 != null && !h.K(d11)) {
            return chain.proceed(chain.request());
        }
        L.a aVar = new L.a();
        aVar.f(m.e.DEFAULT_DRAG_ANIMATION_DURATION);
        aVar.r(chain.request());
        aVar.o(F.HTTP_2);
        aVar.l(DiscountCodeResponse.RESULT_OK);
        M.Companion companion = M.INSTANCE;
        C.f33536g.getClass();
        C b11 = C.a.b("application/json; charset=utf-8");
        companion.getClass();
        aVar.b(M.Companion.a("", b11));
        aVar.i("X-Challenge", "required");
        aVar.i("X-Challenge-Url", "/challenge.html");
        return aVar.c();
    }
}
