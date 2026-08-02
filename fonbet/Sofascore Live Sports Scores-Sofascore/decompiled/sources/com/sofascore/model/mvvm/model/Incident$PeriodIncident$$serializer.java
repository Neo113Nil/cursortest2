package com.sofascore.model.mvvm.model;

import androidx.core.app.NotificationCompat;
import com.ironsource.U3;
import com.ironsource.mediationsdk.metadata.a;
import com.sofascore.model.mvvm.model.Incident;
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
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/sofascore/model/mvvm/model/Incident.PeriodIncident.$serializer", "Liw8;", "Lcom/sofascore/model/mvvm/model/Incident$PeriodIncident;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", U3.i.X, "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/sofascore/model/mvvm/model/Incident$PeriodIncident;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/sofascore/model/mvvm/model/Incident$PeriodIncident;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
@wx4
/* loaded from: classes5.dex */
public final /* synthetic */ class Incident$PeriodIncident$$serializer implements iw8 {

    @NotNull
    public static final Incident$PeriodIncident$$serializer INSTANCE;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        Incident$PeriodIncident$$serializer incident$PeriodIncident$$serializer = new Incident$PeriodIncident$$serializer();
        INSTANCE = incident$PeriodIncident$$serializer;
        uye uyeVar = new uye("com.sofascore.model.mvvm.model.Incident.PeriodIncident", incident$PeriodIncident$$serializer, 15);
        uyeVar.j("incidentType", false);
        uyeVar.j("isHome", false);
        uyeVar.j("time", false);
        uyeVar.j("addedTime", false);
        uyeVar.j("homeScore", false);
        uyeVar.j("awayScore", false);
        uyeVar.j("text", false);
        uyeVar.j("isLive", false);
        uyeVar.j("incidentClass", false);
        uyeVar.j("id", true);
        uyeVar.j("reversedPeriodTime", true);
        uyeVar.j("reversedPeriodTimeSeconds", true);
        uyeVar.j("periodTimeSeconds", true);
        uyeVar.j("timeSeconds", true);
        uyeVar.j("period", false);
        descriptor = uyeVar;
    }

    private Incident$PeriodIncident$$serializer() {
    }

    @Override // defpackage.iw8
    @NotNull
    public final KSerializer[] childSerializers() {
        uhi uhiVar = uhi.a;
        gz1 gz1Var = gz1.a;
        KSerializer W = l98.W(gz1Var);
        a7a a7aVar = a7a.a;
        return new KSerializer[]{uhiVar, W, l98.W(a7aVar), l98.W(a7aVar), l98.W(a7aVar), l98.W(a7aVar), uhiVar, gz1Var, l98.W(uhiVar), l98.W(a7aVar), l98.W(a7aVar), l98.W(a7aVar), l98.W(a7aVar), l98.W(a7aVar), l98.W(uhiVar)};
    }

    @Override // defpackage.dy4
    @NotNull
    public final Incident.PeriodIncident deserialize(@NotNull Decoder decoder) {
        Boolean bool;
        boolean z;
        Integer num;
        boolean z2;
        Boolean bool2;
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        uf3 b = decoder.b(serialDescriptor);
        Integer num2 = null;
        Integer num3 = null;
        Integer num4 = null;
        Integer num5 = null;
        String str = null;
        int i = 0;
        Integer num6 = null;
        Boolean bool3 = null;
        Integer num7 = null;
        Integer num8 = null;
        Integer num9 = null;
        Integer num10 = null;
        String str2 = null;
        boolean z3 = false;
        boolean z4 = true;
        String str3 = null;
        String str4 = null;
        while (z4) {
            int o = b.o(serialDescriptor);
            switch (o) {
                case -1:
                    num = num2;
                    z2 = z3;
                    bool2 = bool3;
                    z4 = false;
                    bool3 = bool2;
                    num2 = num;
                    z3 = z2;
                case 0:
                    num = num2;
                    z2 = z3;
                    bool2 = bool3;
                    str3 = b.n(serialDescriptor, 0);
                    i |= 1;
                    bool3 = bool2;
                    num2 = num;
                    z3 = z2;
                case 1:
                    z2 = z3;
                    num = num2;
                    bool3 = (Boolean) b.i(serialDescriptor, 1, gz1.a, bool3);
                    i |= 2;
                    num2 = num;
                    z3 = z2;
                case 2:
                    bool = bool3;
                    z = z3;
                    num7 = (Integer) b.i(serialDescriptor, 2, a7a.a, num7);
                    i |= 4;
                    z3 = z;
                    bool3 = bool;
                case 3:
                    bool = bool3;
                    z = z3;
                    num8 = (Integer) b.i(serialDescriptor, 3, a7a.a, num8);
                    i |= 8;
                    z3 = z;
                    bool3 = bool;
                case 4:
                    bool = bool3;
                    z = z3;
                    num9 = (Integer) b.i(serialDescriptor, 4, a7a.a, num9);
                    i |= 16;
                    z3 = z;
                    bool3 = bool;
                case 5:
                    bool = bool3;
                    z = z3;
                    num10 = (Integer) b.i(serialDescriptor, 5, a7a.a, num10);
                    i |= 32;
                    z3 = z;
                    bool3 = bool;
                case 6:
                    bool = bool3;
                    str4 = b.n(serialDescriptor, 6);
                    i |= 64;
                    bool3 = bool;
                case 7:
                    bool = bool3;
                    z3 = b.B(serialDescriptor, 7);
                    i |= 128;
                    bool3 = bool;
                case 8:
                    bool = bool3;
                    z = z3;
                    str = (String) b.i(serialDescriptor, 8, uhi.a, str);
                    i |= NotificationCompat.FLAG_LOCAL_ONLY;
                    z3 = z;
                    bool3 = bool;
                case 9:
                    bool = bool3;
                    z = z3;
                    num4 = (Integer) b.i(serialDescriptor, 9, a7a.a, num4);
                    i |= 512;
                    z3 = z;
                    bool3 = bool;
                case 10:
                    bool = bool3;
                    z = z3;
                    num3 = (Integer) b.i(serialDescriptor, 10, a7a.a, num3);
                    i |= 1024;
                    z3 = z;
                    bool3 = bool;
                case 11:
                    bool = bool3;
                    z = z3;
                    num2 = (Integer) b.i(serialDescriptor, 11, a7a.a, num2);
                    i |= a.o;
                    z3 = z;
                    bool3 = bool;
                case 12:
                    bool = bool3;
                    z = z3;
                    num5 = (Integer) b.i(serialDescriptor, 12, a7a.a, num5);
                    i |= 4096;
                    z3 = z;
                    bool3 = bool;
                case 13:
                    bool = bool3;
                    z = z3;
                    num6 = (Integer) b.i(serialDescriptor, 13, a7a.a, num6);
                    i |= 8192;
                    z3 = z;
                    bool3 = bool;
                case 14:
                    z = z3;
                    bool = bool3;
                    str2 = (String) b.i(serialDescriptor, 14, uhi.a, str2);
                    i |= 16384;
                    z3 = z;
                    bool3 = bool;
                default:
                    yhk.e(o);
                    return null;
            }
        }
        boolean z5 = z3;
        b.c(serialDescriptor);
        return new Incident.PeriodIncident(i, str3, bool3, num7, num8, num9, num10, str4, z5, str, num4, num3, num2, num5, num6, str2, (t5h) null);
    }

    @Override // defpackage.dy4
    @NotNull
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(@NotNull Encoder encoder, @NotNull Incident.PeriodIncident value) {
        encoder.getClass();
        value.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        wf3 b = encoder.b(serialDescriptor);
        Incident.PeriodIncident.write$Self$model_release(value, b, serialDescriptor);
        b.c(serialDescriptor);
    }

    @Override // defpackage.iw8
    @NotNull
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return z8e.e;
    }
}
