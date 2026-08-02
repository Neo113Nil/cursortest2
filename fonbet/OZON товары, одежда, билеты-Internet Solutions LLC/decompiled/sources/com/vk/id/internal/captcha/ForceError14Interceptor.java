package com.vk.id.internal.captcha;

import We.B;
import We.C;
import We.F;
import We.L;
import We.M;
import androidx.recyclerview.widget.m;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.cabinet.activationtitle.data.DiscountCodeResponse;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nR\u0016\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000bR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/vk/id/internal/captcha/ForceError14Interceptor;", "LWe/B;", "", "redirectUri", "<init>", "(Ljava/lang/String;)V", "LWe/B$a;", "chain", "LWe/L;", "intercept", "(LWe/B$a;)LWe/L;", "Ljava/lang/String;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "once", "Ljava/util/concurrent/atomic/AtomicBoolean;", "vkid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class ForceError14Interceptor implements B {

    @NotNull
    private final AtomicBoolean once = new AtomicBoolean(true);
    private final String redirectUri;

    public ForceError14Interceptor(String str) {
        this.redirectUri = str;
    }

    @Override // We.B
    @NotNull
    public L intercept(@NotNull B.a chain) {
        Intrinsics.checkNotNullParameter(chain, "chain");
        if (!this.once.getAndSet(false)) {
            return chain.proceed(chain.request());
        }
        L.a aVar = new L.a();
        aVar.r(chain.request());
        aVar.o(F.HTTP_2);
        aVar.l(DiscountCodeResponse.RESULT_OK);
        M.Companion companion = M.INSTANCE;
        String E02 = h.E0("\n                            {\n                                \"error\": {\n                                    \"error_code\": 14,\n                                    \"error_msg\": \"Captcha needed\",\n                                    \"request_params\": [\n                                    ],\n                                    \"redirect_uri\": \"" + this.redirectUri + "\",\n                                    \"captcha_sid\": \"679747455055\",\n                                    \"is_refresh_enabled\": true,\n                                    \"captcha_img\": \"https:\\/\\/vk.ru\\/captcha.php?sid=679747455055&source=check_user_action_validate%2Bmail_send&app_id=6287487&device_id=&s=1&resized=1\",\n                                    \"captcha_ts\": 1741099026.324000,\n                                    \"captcha_attempt\": 1,\n                                    \"captcha_ratio\": 2.600000,\n                                    \"is_sound_captcha_available\": true,\n                                    \"captcha_track\": \"https:\\/\\/vk.ru\\/sound_captcha.php?captcha_sid=679747455055&act=get&source=check_user_action_validate%2Bmail_send&app_id=6287487&device_id=\",\n                                    \"uiux_changes\": true\n                                }\n                            }\n                ");
        C.f33536g.getClass();
        C b11 = C.a.b("application/json; charset=utf-8");
        companion.getClass();
        aVar.b(M.Companion.a(E02, b11));
        aVar.f(m.e.DEFAULT_DRAG_ANIMATION_DURATION);
        return aVar.c();
    }
}
