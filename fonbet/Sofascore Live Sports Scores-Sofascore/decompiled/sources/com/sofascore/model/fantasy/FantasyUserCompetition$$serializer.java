package com.sofascore.model.fantasy;

import androidx.core.app.NotificationCompat;
import com.ironsource.U3;
import com.ironsource.mediationsdk.metadata.a;
import defpackage.a7a;
import defpackage.c88;
import defpackage.iw8;
import defpackage.l98;
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
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/sofascore/model/fantasy/FantasyUserCompetition.$serializer", "Liw8;", "Lcom/sofascore/model/fantasy/FantasyUserCompetition;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", U3.i.X, "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/sofascore/model/fantasy/FantasyUserCompetition;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/sofascore/model/fantasy/FantasyUserCompetition;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
@wx4
/* loaded from: classes5.dex */
public final /* synthetic */ class FantasyUserCompetition$$serializer implements iw8 {

    @NotNull
    public static final FantasyUserCompetition$$serializer INSTANCE;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        FantasyUserCompetition$$serializer fantasyUserCompetition$$serializer = new FantasyUserCompetition$$serializer();
        INSTANCE = fantasyUserCompetition$$serializer;
        uye uyeVar = new uye("com.sofascore.model.fantasy.FantasyUserCompetition", fantasyUserCompetition$$serializer, 12);
        uyeVar.j("id", false);
        uyeVar.j("fantasyCompetition", false);
        uyeVar.j("joinedInRound", false);
        uyeVar.j("name", false);
        uyeVar.j("score", false);
        uyeVar.j("averageScore", false);
        uyeVar.j("currentRoundScore", false);
        uyeVar.j("userName", false);
        uyeVar.j("tripleCaptains", false);
        uyeVar.j("freeHits", false);
        uyeVar.j("wildcards", false);
        uyeVar.j("globalRank", false);
        descriptor = uyeVar;
    }

    private FantasyUserCompetition$$serializer() {
    }

    @Override // defpackage.iw8
    @NotNull
    public final KSerializer[] childSerializers() {
        a7a a7aVar = a7a.a;
        KSerializer W = l98.W(a7aVar);
        KSerializer W2 = l98.W(c88.a);
        KSerializer W3 = l98.W(a7aVar);
        KSerializer W4 = l98.W(a7aVar);
        uhi uhiVar = uhi.a;
        return new KSerializer[]{a7aVar, FantasyCompetition$$serializer.INSTANCE, FantasyRound$$serializer.INSTANCE, uhiVar, W, W2, W3, uhiVar, a7aVar, a7aVar, a7aVar, W4};
    }

    @Override // defpackage.dy4
    @NotNull
    public final FantasyUserCompetition deserialize(@NotNull Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        uf3 b = decoder.b(serialDescriptor);
        FantasyUserCompetition fantasyUserCompetition = null;
        boolean z = true;
        Integer num = null;
        FantasyCompetition fantasyCompetition = null;
        FantasyRound fantasyRound = null;
        String str = null;
        Integer num2 = null;
        Float f = null;
        Integer num3 = null;
        String str2 = null;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        while (z) {
            int o = b.o(serialDescriptor);
            switch (o) {
                case -1:
                    z = false;
                    continue;
                case 0:
                    i2 = b.l(serialDescriptor, 0);
                    i |= 1;
                    break;
                case 1:
                    fantasyCompetition = (FantasyCompetition) b.w(serialDescriptor, 1, FantasyCompetition$$serializer.INSTANCE, fantasyCompetition);
                    i |= 2;
                    break;
                case 2:
                    fantasyRound = (FantasyRound) b.w(serialDescriptor, 2, FantasyRound$$serializer.INSTANCE, fantasyRound);
                    i |= 4;
                    break;
                case 3:
                    str = b.n(serialDescriptor, 3);
                    i |= 8;
                    break;
                case 4:
                    num2 = (Integer) b.i(serialDescriptor, 4, a7a.a, num2);
                    i |= 16;
                    break;
                case 5:
                    f = (Float) b.i(serialDescriptor, 5, c88.a, f);
                    i |= 32;
                    break;
                case 6:
                    num3 = (Integer) b.i(serialDescriptor, 6, a7a.a, num3);
                    i |= 64;
                    break;
                case 7:
                    str2 = b.n(serialDescriptor, 7);
                    i |= 128;
                    break;
                case 8:
                    i3 = b.l(serialDescriptor, 8);
                    i |= NotificationCompat.FLAG_LOCAL_ONLY;
                    break;
                case 9:
                    i4 = b.l(serialDescriptor, 9);
                    i |= 512;
                    break;
                case 10:
                    i5 = b.l(serialDescriptor, 10);
                    i |= 1024;
                    break;
                case 11:
                    num = (Integer) b.i(serialDescriptor, 11, a7a.a, num);
                    i |= a.o;
                    break;
                default:
                    yhk.e(o);
                    return fantasyUserCompetition;
            }
            fantasyUserCompetition = null;
        }
        b.c(serialDescriptor);
        return new FantasyUserCompetition(i, i2, fantasyCompetition, fantasyRound, str, num2, f, num3, str2, i3, i4, i5, num, null);
    }

    @Override // defpackage.dy4
    @NotNull
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(@NotNull Encoder encoder, @NotNull FantasyUserCompetition value) {
        encoder.getClass();
        value.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        wf3 b = encoder.b(serialDescriptor);
        FantasyUserCompetition.write$Self$model_release(value, b, serialDescriptor);
        b.c(serialDescriptor);
    }

    @Override // defpackage.iw8
    @NotNull
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return z8e.e;
    }
}
