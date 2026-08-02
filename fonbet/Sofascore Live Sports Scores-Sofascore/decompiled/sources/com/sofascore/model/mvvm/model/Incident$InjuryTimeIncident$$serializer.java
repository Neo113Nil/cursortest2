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
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/sofascore/model/mvvm/model/Incident.InjuryTimeIncident.$serializer", "Liw8;", "Lcom/sofascore/model/mvvm/model/Incident$InjuryTimeIncident;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", U3.i.X, "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/sofascore/model/mvvm/model/Incident$InjuryTimeIncident;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/sofascore/model/mvvm/model/Incident$InjuryTimeIncident;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
@wx4
/* loaded from: classes5.dex */
public final /* synthetic */ class Incident$InjuryTimeIncident$$serializer implements iw8 {

    @NotNull
    public static final Incident$InjuryTimeIncident$$serializer INSTANCE;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        Incident$InjuryTimeIncident$$serializer incident$InjuryTimeIncident$$serializer = new Incident$InjuryTimeIncident$$serializer();
        INSTANCE = incident$InjuryTimeIncident$$serializer;
        uye uyeVar = new uye("com.sofascore.model.mvvm.model.Incident.InjuryTimeIncident", incident$InjuryTimeIncident$$serializer, 13);
        uyeVar.j("incidentType", false);
        uyeVar.j("isHome", false);
        uyeVar.j("time", false);
        uyeVar.j("addedTime", false);
        uyeVar.j("length", false);
        uyeVar.j("incidentClass", false);
        uyeVar.j("id", true);
        uyeVar.j("reversedPeriodTime", true);
        uyeVar.j("reversedPeriodTimeSeconds", true);
        uyeVar.j("periodTimeSeconds", true);
        uyeVar.j("timeSeconds", true);
        uyeVar.j("homeScore", true);
        uyeVar.j("awayScore", true);
        descriptor = uyeVar;
    }

    private Incident$InjuryTimeIncident$$serializer() {
    }

    @Override // defpackage.iw8
    @NotNull
    public final KSerializer[] childSerializers() {
        uhi uhiVar = uhi.a;
        KSerializer W = l98.W(gz1.a);
        a7a a7aVar = a7a.a;
        return new KSerializer[]{uhiVar, W, l98.W(a7aVar), l98.W(a7aVar), a7aVar, l98.W(uhiVar), l98.W(a7aVar), l98.W(a7aVar), l98.W(a7aVar), l98.W(a7aVar), l98.W(a7aVar), l98.W(a7aVar), l98.W(a7aVar)};
    }

    @Override // defpackage.dy4
    @NotNull
    public final Incident.InjuryTimeIncident deserialize(@NotNull Decoder decoder) {
        int i;
        String str;
        String str2;
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        uf3 b = decoder.b(serialDescriptor);
        Integer num = null;
        Integer num2 = null;
        Integer num3 = null;
        Integer num4 = null;
        Integer num5 = null;
        int i2 = 0;
        String str3 = null;
        Boolean bool = null;
        Integer num6 = null;
        Integer num7 = null;
        int i3 = 0;
        String str4 = null;
        Integer num8 = null;
        Integer num9 = null;
        boolean z = true;
        while (z) {
            int o = b.o(serialDescriptor);
            switch (o) {
                case -1:
                    str2 = str3;
                    z = false;
                    str3 = str2;
                case 0:
                    i = i3;
                    i2 |= 1;
                    str3 = b.n(serialDescriptor, 0);
                    i3 = i;
                case 1:
                    str = str3;
                    i = i3;
                    bool = (Boolean) b.i(serialDescriptor, 1, gz1.a, bool);
                    i2 |= 2;
                    str3 = str;
                    i3 = i;
                case 2:
                    str = str3;
                    i = i3;
                    num6 = (Integer) b.i(serialDescriptor, 2, a7a.a, num6);
                    i2 |= 4;
                    str3 = str;
                    i3 = i;
                case 3:
                    str = str3;
                    i = i3;
                    num7 = (Integer) b.i(serialDescriptor, 3, a7a.a, num7);
                    i2 |= 8;
                    str3 = str;
                    i3 = i;
                case 4:
                    str2 = str3;
                    i3 = b.l(serialDescriptor, 4);
                    i2 |= 16;
                    str3 = str2;
                case 5:
                    str = str3;
                    i = i3;
                    str4 = (String) b.i(serialDescriptor, 5, uhi.a, str4);
                    i2 |= 32;
                    str3 = str;
                    i3 = i;
                case 6:
                    str = str3;
                    i = i3;
                    num8 = (Integer) b.i(serialDescriptor, 6, a7a.a, num8);
                    i2 |= 64;
                    str3 = str;
                    i3 = i;
                case 7:
                    str = str3;
                    i = i3;
                    num9 = (Integer) b.i(serialDescriptor, 7, a7a.a, num9);
                    i2 |= 128;
                    str3 = str;
                    i3 = i;
                case 8:
                    str = str3;
                    i = i3;
                    num5 = (Integer) b.i(serialDescriptor, 8, a7a.a, num5);
                    i2 |= NotificationCompat.FLAG_LOCAL_ONLY;
                    str3 = str;
                    i3 = i;
                case 9:
                    str = str3;
                    i = i3;
                    num3 = (Integer) b.i(serialDescriptor, 9, a7a.a, num3);
                    i2 |= 512;
                    str3 = str;
                    i3 = i;
                case 10:
                    str = str3;
                    i = i3;
                    num2 = (Integer) b.i(serialDescriptor, 10, a7a.a, num2);
                    i2 |= 1024;
                    str3 = str;
                    i3 = i;
                case 11:
                    str = str3;
                    i = i3;
                    num = (Integer) b.i(serialDescriptor, 11, a7a.a, num);
                    i2 |= a.o;
                    str3 = str;
                    i3 = i;
                case 12:
                    str = str3;
                    i = i3;
                    num4 = (Integer) b.i(serialDescriptor, 12, a7a.a, num4);
                    i2 |= 4096;
                    str3 = str;
                    i3 = i;
                default:
                    yhk.e(o);
                    return null;
            }
        }
        b.c(serialDescriptor);
        return new Incident.InjuryTimeIncident(i2, str3, bool, num6, num7, i3, str4, num8, num9, num5, num3, num2, num, num4, (t5h) null);
    }

    @Override // defpackage.dy4
    @NotNull
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(@NotNull Encoder encoder, @NotNull Incident.InjuryTimeIncident value) {
        encoder.getClass();
        value.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        wf3 b = encoder.b(serialDescriptor);
        Incident.InjuryTimeIncident.write$Self$model_release(value, b, serialDescriptor);
        b.c(serialDescriptor);
    }

    @Override // defpackage.iw8
    @NotNull
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return z8e.e;
    }
}
