package com.sofascore.model.network.response;

import androidx.core.app.NotificationCompat;
import com.ironsource.U3;
import com.sofascore.model.mvvm.model.Lineups;
import com.sofascore.model.mvvm.model.Lineups$$serializer;
import defpackage.a7a;
import defpackage.dy4;
import defpackage.gz1;
import defpackage.h75;
import defpackage.iw8;
import defpackage.joa;
import defpackage.l98;
import defpackage.uf3;
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
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/sofascore/model/network/response/LineupsResponse.$serializer", "Liw8;", "Lcom/sofascore/model/network/response/LineupsResponse;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", U3.i.X, "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/sofascore/model/network/response/LineupsResponse;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/sofascore/model/network/response/LineupsResponse;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
@wx4
/* loaded from: classes5.dex */
public final /* synthetic */ class LineupsResponse$$serializer implements iw8 {

    @NotNull
    public static final LineupsResponse$$serializer INSTANCE;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        LineupsResponse$$serializer lineupsResponse$$serializer = new LineupsResponse$$serializer();
        INSTANCE = lineupsResponse$$serializer;
        uye uyeVar = new uye("com.sofascore.model.network.response.LineupsResponse", lineupsResponse$$serializer, 11);
        uyeVar.j("head", true);
        uyeVar.j("error", true);
        uyeVar.j("confirmed", false);
        uyeVar.j("home", false);
        uyeVar.j("away", false);
        uyeVar.j("statisticalVersion", false);
        uyeVar.j("firstTeamAverageRating", true);
        uyeVar.j("secondTeamAverageRating", true);
        uyeVar.j("pregameRatingShown", true);
        uyeVar.j("avgRatingVersion", true);
        uyeVar.j("shouldReverseTeams", true);
        descriptor = uyeVar;
    }

    private LineupsResponse$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.iw8
    @NotNull
    public final KSerializer[] childSerializers() {
        joa[] joaVarArr;
        joaVarArr = LineupsResponse.$childSerializers;
        HeadResponse$$serializer headResponse$$serializer = HeadResponse$$serializer.INSTANCE;
        gz1 gz1Var = gz1.a;
        Lineups$$serializer lineups$$serializer = Lineups$$serializer.INSTANCE;
        h75 h75Var = h75.a;
        return new KSerializer[]{l98.W(headResponse$$serializer), l98.W(headResponse$$serializer), gz1Var, lineups$$serializer, lineups$$serializer, l98.W(a7a.a), h75Var, h75Var, gz1Var, joaVarArr[9].getValue(), gz1Var};
    }

    @Override // defpackage.dy4
    @NotNull
    public final LineupsResponse deserialize(@NotNull Decoder decoder) {
        joa[] joaVarArr;
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        uf3 b = decoder.b(serialDescriptor);
        joaVarArr = LineupsResponse.$childSerializers;
        LineupsResponse lineupsResponse = null;
        int i = 0;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        HeadResponse headResponse = null;
        HeadResponse headResponse2 = null;
        Lineups lineups = null;
        Lineups lineups2 = null;
        Integer num = null;
        double d = 0.0d;
        double d2 = 0.0d;
        boolean z4 = true;
        TeamAverageRatingVersion teamAverageRatingVersion = null;
        while (z4) {
            int o = b.o(serialDescriptor);
            switch (o) {
                case -1:
                    z4 = false;
                    continue;
                case 0:
                    headResponse = (HeadResponse) b.i(serialDescriptor, 0, HeadResponse$$serializer.INSTANCE, headResponse);
                    i |= 1;
                    break;
                case 1:
                    headResponse2 = (HeadResponse) b.i(serialDescriptor, 1, HeadResponse$$serializer.INSTANCE, headResponse2);
                    i |= 2;
                    break;
                case 2:
                    z = b.B(serialDescriptor, 2);
                    i |= 4;
                    break;
                case 3:
                    lineups = (Lineups) b.w(serialDescriptor, 3, Lineups$$serializer.INSTANCE, lineups);
                    i |= 8;
                    break;
                case 4:
                    lineups2 = (Lineups) b.w(serialDescriptor, 4, Lineups$$serializer.INSTANCE, lineups2);
                    i |= 16;
                    break;
                case 5:
                    num = (Integer) b.i(serialDescriptor, 5, a7a.a, num);
                    i |= 32;
                    break;
                case 6:
                    d = b.D(serialDescriptor, 6);
                    i |= 64;
                    break;
                case 7:
                    d2 = b.D(serialDescriptor, 7);
                    i |= 128;
                    break;
                case 8:
                    z2 = b.B(serialDescriptor, 8);
                    i |= NotificationCompat.FLAG_LOCAL_ONLY;
                    break;
                case 9:
                    teamAverageRatingVersion = (TeamAverageRatingVersion) b.w(serialDescriptor, 9, (dy4) joaVarArr[9].getValue(), teamAverageRatingVersion);
                    i |= 512;
                    break;
                case 10:
                    z3 = b.B(serialDescriptor, 10);
                    i |= 1024;
                    continue;
                default:
                    yhk.e(o);
                    return lineupsResponse;
            }
            lineupsResponse = null;
        }
        b.c(serialDescriptor);
        return new LineupsResponse(i, headResponse, headResponse2, z, lineups, lineups2, num, d, d2, z2, teamAverageRatingVersion, z3, null);
    }

    @Override // defpackage.dy4
    @NotNull
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(@NotNull Encoder encoder, @NotNull LineupsResponse value) {
        encoder.getClass();
        value.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        wf3 b = encoder.b(serialDescriptor);
        LineupsResponse.write$Self$model_release(value, b, serialDescriptor);
        b.c(serialDescriptor);
    }

    @Override // defpackage.iw8
    @NotNull
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return z8e.e;
    }
}
