package com.sofascore.model.profile;

import androidx.core.app.NotificationCompat;
import com.ironsource.U3;
import com.sofascore.model.odds.OddsChoice;
import com.sofascore.model.odds.OddsChoice$$serializer;
import defpackage.a7a;
import defpackage.c88;
import defpackage.iw8;
import defpackage.l98;
import defpackage.t5h;
import defpackage.uf3;
import defpackage.uhi;
import defpackage.uye;
import defpackage.wf3;
import defpackage.wx4;
import defpackage.yhk;
import defpackage.z8e;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/sofascore/model/profile/VoteStatistics.$serializer", "Liw8;", "Lcom/sofascore/model/profile/VoteStatistics;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", U3.i.X, "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/sofascore/model/profile/VoteStatistics;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/sofascore/model/profile/VoteStatistics;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
@wx4
/* loaded from: classes5.dex */
public final /* synthetic */ class VoteStatistics$$serializer implements iw8 {

    @NotNull
    public static final VoteStatistics$$serializer INSTANCE;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        VoteStatistics$$serializer voteStatistics$$serializer = new VoteStatistics$$serializer();
        INSTANCE = voteStatistics$$serializer;
        uye uyeVar = new uye("com.sofascore.model.profile.VoteStatistics", voteStatistics$$serializer, 11);
        uyeVar.j(U3.i.l, false);
        uyeVar.j("correct", false);
        uyeVar.j("avgCorrectOdds", false);
        uyeVar.j("percentage", false);
        uyeVar.j("ranking", false);
        uyeVar.j("rankingMove", true);
        uyeVar.j("correctVotesWithOdds", true);
        uyeVar.j("totalVotesWithOdds", true);
        uyeVar.j("correctVotesWithoutOdds", true);
        uyeVar.j("totalVotesWithoutOdds", true);
        uyeVar.j("roi", false);
        descriptor = uyeVar;
    }

    private VoteStatistics$$serializer() {
    }

    @Override // defpackage.iw8
    @NotNull
    public final KSerializer[] childSerializers() {
        KSerializer W = l98.W(OddsChoice$$serializer.INSTANCE);
        uhi uhiVar = uhi.a;
        a7a a7aVar = a7a.a;
        return new KSerializer[]{uhiVar, uhiVar, W, uhiVar, uhiVar, a7aVar, a7aVar, a7aVar, a7aVar, a7aVar, c88.a};
    }

    @Override // defpackage.dy4
    @NotNull
    public final VoteStatistics deserialize(@NotNull Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        uf3 b = decoder.b(serialDescriptor);
        VoteStatistics voteStatistics = null;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        String str = null;
        String str2 = null;
        OddsChoice oddsChoice = null;
        String str3 = null;
        String str4 = null;
        float f = 0.0f;
        boolean z = true;
        while (z) {
            int o = b.o(serialDescriptor);
            switch (o) {
                case -1:
                    z = false;
                    continue;
                case 0:
                    str = b.n(serialDescriptor, 0);
                    i |= 1;
                    break;
                case 1:
                    str2 = b.n(serialDescriptor, 1);
                    i |= 2;
                    break;
                case 2:
                    oddsChoice = (OddsChoice) b.i(serialDescriptor, 2, OddsChoice$$serializer.INSTANCE, oddsChoice);
                    i |= 4;
                    break;
                case 3:
                    str3 = b.n(serialDescriptor, 3);
                    i |= 8;
                    continue;
                case 4:
                    str4 = b.n(serialDescriptor, 4);
                    i |= 16;
                    continue;
                case 5:
                    i2 = b.l(serialDescriptor, 5);
                    i |= 32;
                    continue;
                case 6:
                    i3 = b.l(serialDescriptor, 6);
                    i |= 64;
                    continue;
                case 7:
                    i4 = b.l(serialDescriptor, 7);
                    i |= 128;
                    continue;
                case 8:
                    i5 = b.l(serialDescriptor, 8);
                    i |= NotificationCompat.FLAG_LOCAL_ONLY;
                    continue;
                case 9:
                    i6 = b.l(serialDescriptor, 9);
                    i |= 512;
                    continue;
                case 10:
                    f = b.s(serialDescriptor, 10);
                    i |= 1024;
                    continue;
                default:
                    yhk.e(o);
                    return voteStatistics;
            }
            voteStatistics = null;
        }
        b.c(serialDescriptor);
        return new VoteStatistics(i, str, str2, oddsChoice, str3, str4, i2, i3, i4, i5, i6, f, (t5h) null);
    }

    @Override // defpackage.dy4
    @NotNull
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(@NotNull Encoder encoder, @NotNull VoteStatistics value) {
        encoder.getClass();
        value.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        wf3 b = encoder.b(serialDescriptor);
        VoteStatistics.write$Self$model_release(value, b, serialDescriptor);
        b.c(serialDescriptor);
    }

    @Override // defpackage.iw8
    @NotNull
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return z8e.e;
    }
}
