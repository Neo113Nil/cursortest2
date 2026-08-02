package com.sofascore.model.mvvm.model;

import androidx.core.app.NotificationCompat;
import com.ironsource.U3;
import com.ironsource.mediationsdk.metadata.a;
import com.sofascore.model.mvvm.model.Incident;
import com.sofascore.model.network.response.SearchResponseKt;
import defpackage.a7a;
import defpackage.gz1;
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
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/sofascore/model/mvvm/model/Incident.VarDecisionIncident.$serializer", "Liw8;", "Lcom/sofascore/model/mvvm/model/Incident$VarDecisionIncident;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", U3.i.X, "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/sofascore/model/mvvm/model/Incident$VarDecisionIncident;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/sofascore/model/mvvm/model/Incident$VarDecisionIncident;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
@wx4
/* loaded from: classes5.dex */
public final /* synthetic */ class Incident$VarDecisionIncident$$serializer implements iw8 {

    @NotNull
    public static final Incident$VarDecisionIncident$$serializer INSTANCE;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        Incident$VarDecisionIncident$$serializer incident$VarDecisionIncident$$serializer = new Incident$VarDecisionIncident$$serializer();
        INSTANCE = incident$VarDecisionIncident$$serializer;
        uye uyeVar = new uye("com.sofascore.model.mvvm.model.Incident.VarDecisionIncident", incident$VarDecisionIncident$$serializer, 14);
        uyeVar.j("id", false);
        uyeVar.j("incidentType", false);
        uyeVar.j("isHome", false);
        uyeVar.j("time", false);
        uyeVar.j("addedTime", false);
        uyeVar.j(SearchResponseKt.PLAYER_ENTITY, false);
        uyeVar.j("confirmed", false);
        uyeVar.j("incidentClass", false);
        uyeVar.j("reversedPeriodTime", true);
        uyeVar.j("reversedPeriodTimeSeconds", true);
        uyeVar.j("periodTimeSeconds", true);
        uyeVar.j("timeSeconds", true);
        uyeVar.j("homeScore", true);
        uyeVar.j("awayScore", true);
        descriptor = uyeVar;
    }

    private Incident$VarDecisionIncident$$serializer() {
    }

    @Override // defpackage.iw8
    @NotNull
    public final KSerializer[] childSerializers() {
        a7a a7aVar = a7a.a;
        KSerializer W = l98.W(a7aVar);
        uhi uhiVar = uhi.a;
        gz1 gz1Var = gz1.a;
        return new KSerializer[]{W, uhiVar, l98.W(gz1Var), l98.W(a7aVar), l98.W(a7aVar), l98.W(Player$$serializer.INSTANCE), gz1Var, l98.W(uhiVar), l98.W(a7aVar), l98.W(a7aVar), l98.W(a7aVar), l98.W(a7aVar), l98.W(a7aVar), l98.W(a7aVar)};
    }

    @Override // defpackage.dy4
    @NotNull
    public final Incident.VarDecisionIncident deserialize(@NotNull Decoder decoder) {
        Integer num;
        boolean z;
        Integer num2;
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        uf3 b = decoder.b(serialDescriptor);
        Integer num3 = null;
        Integer num4 = null;
        Integer num5 = null;
        Integer num6 = null;
        Integer num7 = null;
        int i = 0;
        Integer num8 = null;
        Integer num9 = null;
        Boolean bool = null;
        Integer num10 = null;
        Integer num11 = null;
        Player player = null;
        boolean z2 = false;
        String str = null;
        boolean z3 = true;
        String str2 = null;
        while (z3) {
            int o = b.o(serialDescriptor);
            switch (o) {
                case -1:
                    num2 = num3;
                    z3 = false;
                    num3 = num2;
                case 0:
                    num2 = num3;
                    num8 = (Integer) b.i(serialDescriptor, 0, a7a.a, num8);
                    i |= 1;
                    z2 = z2;
                    num3 = num2;
                case 1:
                    num = num8;
                    str2 = b.n(serialDescriptor, 1);
                    i |= 2;
                    num8 = num;
                case 2:
                    num = num8;
                    z = z2;
                    bool = (Boolean) b.i(serialDescriptor, 2, gz1.a, bool);
                    i |= 4;
                    z2 = z;
                    num8 = num;
                case 3:
                    num = num8;
                    z = z2;
                    num10 = (Integer) b.i(serialDescriptor, 3, a7a.a, num10);
                    i |= 8;
                    z2 = z;
                    num8 = num;
                case 4:
                    num = num8;
                    z = z2;
                    num11 = (Integer) b.i(serialDescriptor, 4, a7a.a, num11);
                    i |= 16;
                    z2 = z;
                    num8 = num;
                case 5:
                    num = num8;
                    z = z2;
                    player = (Player) b.i(serialDescriptor, 5, Player$$serializer.INSTANCE, player);
                    i |= 32;
                    z2 = z;
                    num8 = num;
                case 6:
                    num = num8;
                    z2 = b.B(serialDescriptor, 6);
                    i |= 64;
                    num8 = num;
                case 7:
                    num = num8;
                    z = z2;
                    str = (String) b.i(serialDescriptor, 7, uhi.a, str);
                    i |= 128;
                    z2 = z;
                    num8 = num;
                case 8:
                    num = num8;
                    z = z2;
                    num7 = (Integer) b.i(serialDescriptor, 8, a7a.a, num7);
                    i |= NotificationCompat.FLAG_LOCAL_ONLY;
                    z2 = z;
                    num8 = num;
                case 9:
                    num = num8;
                    z = z2;
                    num5 = (Integer) b.i(serialDescriptor, 9, a7a.a, num5);
                    i |= 512;
                    z2 = z;
                    num8 = num;
                case 10:
                    num = num8;
                    z = z2;
                    num4 = (Integer) b.i(serialDescriptor, 10, a7a.a, num4);
                    i |= 1024;
                    z2 = z;
                    num8 = num;
                case 11:
                    num = num8;
                    z = z2;
                    num3 = (Integer) b.i(serialDescriptor, 11, a7a.a, num3);
                    i |= a.o;
                    z2 = z;
                    num8 = num;
                case 12:
                    num = num8;
                    z = z2;
                    num6 = (Integer) b.i(serialDescriptor, 12, a7a.a, num6);
                    i |= 4096;
                    z2 = z;
                    num8 = num;
                case 13:
                    z = z2;
                    num = num8;
                    num9 = (Integer) b.i(serialDescriptor, 13, a7a.a, num9);
                    i |= 8192;
                    z2 = z;
                    num8 = num;
                default:
                    yhk.e(o);
                    return null;
            }
        }
        b.c(serialDescriptor);
        return new Incident.VarDecisionIncident(i, num8, str2, bool, num10, num11, player, z2, str, num7, num5, num4, num3, num6, num9, (t5h) null);
    }

    @Override // defpackage.dy4
    @NotNull
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(@NotNull Encoder encoder, @NotNull Incident.VarDecisionIncident value) {
        encoder.getClass();
        value.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        wf3 b = encoder.b(serialDescriptor);
        Incident.VarDecisionIncident.write$Self$model_release(value, b, serialDescriptor);
        b.c(serialDescriptor);
    }

    @Override // defpackage.iw8
    @NotNull
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return z8e.e;
    }
}
