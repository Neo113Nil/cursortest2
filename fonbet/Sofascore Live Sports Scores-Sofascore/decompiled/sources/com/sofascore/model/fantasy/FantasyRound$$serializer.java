package com.sofascore.model.fantasy;

import androidx.core.app.NotificationCompat;
import com.ironsource.U3;
import com.ironsource.mediationsdk.metadata.a;
import defpackage.a7a;
import defpackage.c88;
import defpackage.gz1;
import defpackage.iw8;
import defpackage.l98;
import defpackage.lkb;
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
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/sofascore/model/fantasy/FantasyRound.$serializer", "Liw8;", "Lcom/sofascore/model/fantasy/FantasyRound;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", U3.i.X, "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/sofascore/model/fantasy/FantasyRound;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/sofascore/model/fantasy/FantasyRound;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
@wx4
/* loaded from: classes5.dex */
public final /* synthetic */ class FantasyRound$$serializer implements iw8 {

    @NotNull
    public static final FantasyRound$$serializer INSTANCE;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        FantasyRound$$serializer fantasyRound$$serializer = new FantasyRound$$serializer();
        INSTANCE = fantasyRound$$serializer;
        uye uyeVar = new uye("com.sofascore.model.fantasy.FantasyRound", fantasyRound$$serializer, 15);
        uyeVar.j("id", false);
        uyeVar.j("sequence", false);
        uyeVar.j("name", false);
        uyeVar.j("averageScore", false);
        uyeVar.j("highScore", false);
        uyeVar.j("maxPointsUserAccountId", false);
        uyeVar.j("startTimestamp", false);
        uyeVar.j("endTimestamp", false);
        uyeVar.j("deadlineTimestamp", false);
        uyeVar.j("fantasyCompetitionId", false);
        uyeVar.j("maxPlayersFromSameTeam", false);
        uyeVar.j("revealTimestamp", false);
        uyeVar.j("isPlaceholderRound", false);
        uyeVar.j("isFinalized", false);
        uyeVar.j("rebuildSquadActive", false);
        descriptor = uyeVar;
    }

    private FantasyRound$$serializer() {
    }

    @Override // defpackage.iw8
    @NotNull
    public final KSerializer[] childSerializers() {
        a7a a7aVar = a7a.a;
        uhi uhiVar = uhi.a;
        KSerializer W = l98.W(c88.a);
        KSerializer W2 = l98.W(a7aVar);
        KSerializer W3 = l98.W(uhiVar);
        lkb lkbVar = lkb.a;
        KSerializer W4 = l98.W(lkbVar);
        gz1 gz1Var = gz1.a;
        return new KSerializer[]{a7aVar, a7aVar, uhiVar, W, W2, W3, lkbVar, lkbVar, lkbVar, a7aVar, a7aVar, W4, gz1Var, gz1Var, gz1Var};
    }

    @Override // defpackage.dy4
    @NotNull
    public final FantasyRound deserialize(@NotNull Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        uf3 b = decoder.b(serialDescriptor);
        FantasyRound fantasyRound = null;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        String str = null;
        Float f = null;
        Integer num = null;
        String str2 = null;
        long j = 0;
        long j2 = 0;
        long j3 = 0;
        boolean z4 = true;
        Long l = null;
        while (z4) {
            int o = b.o(serialDescriptor);
            switch (o) {
                case -1:
                    z4 = false;
                    continue;
                case 0:
                    i2 = b.l(serialDescriptor, 0);
                    i |= 1;
                    break;
                case 1:
                    i3 = b.l(serialDescriptor, 1);
                    i |= 2;
                    break;
                case 2:
                    str = b.n(serialDescriptor, 2);
                    i |= 4;
                    break;
                case 3:
                    f = (Float) b.i(serialDescriptor, 3, c88.a, f);
                    i |= 8;
                    break;
                case 4:
                    num = (Integer) b.i(serialDescriptor, 4, a7a.a, num);
                    i |= 16;
                    break;
                case 5:
                    str2 = (String) b.i(serialDescriptor, 5, uhi.a, str2);
                    i |= 32;
                    break;
                case 6:
                    j = b.g(serialDescriptor, 6);
                    i |= 64;
                    break;
                case 7:
                    j2 = b.g(serialDescriptor, 7);
                    i |= 128;
                    break;
                case 8:
                    j3 = b.g(serialDescriptor, 8);
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
                    l = (Long) b.i(serialDescriptor, 11, lkb.a, l);
                    i |= a.o;
                    break;
                case 12:
                    z = b.B(serialDescriptor, 12);
                    i |= 4096;
                    continue;
                case 13:
                    z2 = b.B(serialDescriptor, 13);
                    i |= 8192;
                    continue;
                case 14:
                    z3 = b.B(serialDescriptor, 14);
                    i |= 16384;
                    continue;
                default:
                    yhk.e(o);
                    return fantasyRound;
            }
            fantasyRound = null;
        }
        b.c(serialDescriptor);
        return new FantasyRound(i, i2, i3, str, f, num, str2, j, j2, j3, i4, i5, l, z, z2, z3, null);
    }

    @Override // defpackage.dy4
    @NotNull
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(@NotNull Encoder encoder, @NotNull FantasyRound value) {
        encoder.getClass();
        value.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        wf3 b = encoder.b(serialDescriptor);
        FantasyRound.write$Self$model_release(value, b, serialDescriptor);
        b.c(serialDescriptor);
    }

    @Override // defpackage.iw8
    @NotNull
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return z8e.e;
    }
}
