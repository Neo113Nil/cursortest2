package io.appmetrica.analytics.profile;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.impl.C0018a8;
import io.appmetrica.analytics.impl.C0322m4;
import io.appmetrica.analytics.impl.C0471s4;
import io.appmetrica.analytics.impl.C0498t6;
import io.appmetrica.analytics.impl.Gb;
import io.appmetrica.analytics.impl.InterfaceC0137eo;
import io.appmetrica.analytics.impl.Wm;
import io.appmetrica.analytics.impl.Xm;
import io.appmetrica.analytics.impl.Yk;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public class FirstPartyDataTelegramLoginSha256Attribute {

    /* renamed from: a, reason: collision with root package name */
    private final C0498t6 f15270a = new C0498t6("appmetrica_1pd_telegram_sha256", new C0018a8(), new Gb(new C0322m4(100)));

    /* renamed from: b, reason: collision with root package name */
    private final Yk f15271b;

    public FirstPartyDataTelegramLoginSha256Attribute(Yk yk) {
        this.f15271b = yk;
    }

    @NonNull
    public UserProfileUpdate<? extends InterfaceC0137eo> withTelegramLoginValues(@NonNull String... strArr) {
        return withTelegramLoginValues(Arrays.asList(strArr));
    }

    @NonNull
    public UserProfileUpdate<? extends InterfaceC0137eo> withTelegramLoginValues(@NonNull Iterable<String> iterable) {
        String str = this.f15270a.f14668c;
        ArrayList a7 = this.f15271b.a(iterable);
        Xm xm = new Xm(200, "First party data telegram logins attribute", PublicLogger.getAnonymousInstance());
        C0498t6 c0498t6 = this.f15270a;
        return new UserProfileUpdate<>(new Wm(str, a7, 10, xm, c0498t6.f14666a, new C0471s4(c0498t6.f14667b)));
    }
}
