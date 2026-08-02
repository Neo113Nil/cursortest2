package com.sofascore.results.fantasy.onboarding.steps;

import com.sofascore.results.fantasy.onboarding.steps.FantasyOnboardingStepsNavigation;
import defpackage.a7a;
import defpackage.iw8;
import defpackage.uf3;
import defpackage.uye;
import defpackage.wf3;
import defpackage.yhk;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final /* synthetic */ class b implements iw8 {
    public static final b a;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        b bVar = new b();
        a = bVar;
        uye uyeVar = new uye("com.sofascore.results.fantasy.onboarding.steps.FantasyOnboardingStepsNavigation.JoinLeague", bVar, 1);
        uyeVar.j("competitionId", false);
        descriptor = uyeVar;
    }

    @Override // defpackage.iw8
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{a7a.a};
    }

    @Override // defpackage.dy4
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        uf3 b = decoder.b(serialDescriptor);
        boolean z = true;
        int i = 0;
        int i2 = 0;
        while (z) {
            int o = b.o(serialDescriptor);
            if (o == -1) {
                z = false;
            } else {
                if (o != 0) {
                    yhk.e(o);
                    return null;
                }
                i2 = b.l(serialDescriptor, 0);
                i = 1;
            }
        }
        b.c(serialDescriptor);
        return new FantasyOnboardingStepsNavigation.JoinLeague(i, i2);
    }

    @Override // defpackage.dy4
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        FantasyOnboardingStepsNavigation.JoinLeague joinLeague = (FantasyOnboardingStepsNavigation.JoinLeague) obj;
        encoder.getClass();
        joinLeague.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        wf3 b = encoder.b(serialDescriptor);
        b.u(0, joinLeague.a, serialDescriptor);
        b.c(serialDescriptor);
    }
}
