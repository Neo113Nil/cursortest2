package kc0;

import Ae.C0;
import Ae.C2399j;
import Ae.C2408n0;
import Ae.E0;
import Ae.InterfaceC2395h;
import De.C2862e;
import Sc.InterfaceC4008j;
import h3.C6788a;
import id0.C7050a;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.b;
import org.jetbrains.annotations.NotNull;
import ve.EnumC10311b;
import ze.EnumC11113a;

/* loaded from: classes3.dex */
public final class T {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final C0 f71308a;

    public T(@NotNull C6788a parentScope, @NotNull InterfaceC2395h stateTrackActionFlow, @NotNull InterfaceC4008j trackingRepository) {
        Intrinsics.checkNotNullParameter(parentScope, "parentScope");
        Intrinsics.checkNotNullParameter(stateTrackActionFlow, "stateTrackActionFlow");
        Intrinsics.checkNotNullParameter(trackingRepository, "trackingRepository");
        C0 b11 = E0.b(0, 1, EnumC11113a.DROP_OLDEST, 1);
        this.f71308a = b11;
        C2862e g10 = xe.N.g(parentScope, new S(xe.J.f105405n0));
        C2399j.C(new C2408n0(stateTrackActionFlow, new C7642P(2, this, T.class, "onInputFocused", "onInputFocused(Ljava/lang/String;)V", 4)), g10);
        b.Companion companion = kotlin.time.b.INSTANCE;
        C2399j.C(new C2408n0(C2399j.n(b11, kotlin.time.c.g(300, EnumC10311b.MILLISECONDS)), new Q(2, trackingRepository.getValue(), C7050a.class, "track", "track(Ljava/lang/String;)V", 4)), g10);
    }

    public final void a(@NotNull String trackAction) {
        Intrinsics.checkNotNullParameter(trackAction, "trackAction");
        this.f71308a.tryEmit(trackAction);
    }
}
