package com.sofascore.model.network.response;

import androidx.core.app.NotificationCompat;
import com.ironsource.U3;
import com.ironsource.mediationsdk.metadata.a;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.sofascore.model.network.response.EventStatisticsItem;
import defpackage.a7a;
import defpackage.dy4;
import defpackage.gz1;
import defpackage.h75;
import defpackage.iw8;
import defpackage.joa;
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
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/sofascore/model/network/response/EventStatisticsItem.$serializer", "Liw8;", "Lcom/sofascore/model/network/response/EventStatisticsItem;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", U3.i.X, "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/sofascore/model/network/response/EventStatisticsItem;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/sofascore/model/network/response/EventStatisticsItem;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
@wx4
/* loaded from: classes5.dex */
public final /* synthetic */ class EventStatisticsItem$$serializer implements iw8 {

    @NotNull
    public static final EventStatisticsItem$$serializer INSTANCE;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        EventStatisticsItem$$serializer eventStatisticsItem$$serializer = new EventStatisticsItem$$serializer();
        INSTANCE = eventStatisticsItem$$serializer;
        uye uyeVar = new uye("com.sofascore.model.network.response.EventStatisticsItem", eventStatisticsItem$$serializer, 19);
        uyeVar.j("name", false);
        uyeVar.j("home", false);
        uyeVar.j("away", false);
        uyeVar.j("compareCode", false);
        uyeVar.j("otherPlayerSelected", true);
        uyeVar.j("statisticsType", false);
        uyeVar.j("valueType", false);
        uyeVar.j("homeValue", false);
        uyeVar.j("awayValue", false);
        uyeVar.j("homeTotal", false);
        uyeVar.j("awayTotal", false);
        uyeVar.j("renderType", false);
        uyeVar.j(U3.i.W, true);
        uyeVar.j("avgRatingVersion", true);
        uyeVar.j("hideDivider", true);
        uyeVar.j("roundTop", true);
        uyeVar.j("roundBottom", true);
        uyeVar.j("shouldReverseTeams", true);
        uyeVar.j("shouldRoundToInt", true);
        descriptor = uyeVar;
    }

    private EventStatisticsItem$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.iw8
    @NotNull
    public final KSerializer[] childSerializers() {
        joa[] joaVarArr;
        joaVarArr = EventStatisticsItem.$childSerializers;
        uhi uhiVar = uhi.a;
        a7a a7aVar = a7a.a;
        gz1 gz1Var = gz1.a;
        h75 h75Var = h75.a;
        return new KSerializer[]{uhiVar, uhiVar, uhiVar, a7aVar, gz1Var, uhiVar, uhiVar, h75Var, h75Var, l98.W(h75Var), l98.W(h75Var), l98.W(a7aVar), l98.W((KSerializer) joaVarArr[12].getValue()), joaVarArr[13].getValue(), gz1Var, gz1Var, gz1Var, gz1Var, gz1Var};
    }

    @Override // defpackage.dy4
    @NotNull
    public final EventStatisticsItem deserialize(@NotNull Decoder decoder) {
        joa[] joaVarArr;
        joa[] joaVarArr2;
        int i;
        joa[] joaVarArr3;
        boolean z;
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        uf3 b = decoder.b(serialDescriptor);
        joaVarArr = EventStatisticsItem.$childSerializers;
        double d = 0.0d;
        double d2 = 0.0d;
        TeamAverageRatingVersion teamAverageRatingVersion = null;
        EventStatisticsItem.SpecialEventStatisticType specialEventStatisticType = null;
        Integer num = null;
        boolean z2 = true;
        Double d3 = null;
        Double d4 = null;
        int i2 = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        int i3 = 0;
        boolean z3 = false;
        String str4 = null;
        String str5 = null;
        boolean z4 = false;
        boolean z5 = false;
        boolean z6 = false;
        boolean z7 = false;
        boolean z8 = false;
        while (z2) {
            int o = b.o(serialDescriptor);
            switch (o) {
                case -1:
                    z2 = false;
                case 0:
                    joaVarArr3 = joaVarArr;
                    z = z2;
                    str = b.n(serialDescriptor, 0);
                    i2 |= 1;
                    joaVarArr = joaVarArr3;
                    z2 = z;
                case 1:
                    joaVarArr2 = joaVarArr;
                    str2 = b.n(serialDescriptor, 1);
                    i2 |= 2;
                    joaVarArr = joaVarArr2;
                case 2:
                    joaVarArr2 = joaVarArr;
                    str3 = b.n(serialDescriptor, 2);
                    i2 |= 4;
                    joaVarArr = joaVarArr2;
                case 3:
                    joaVarArr2 = joaVarArr;
                    i3 = b.l(serialDescriptor, 3);
                    i2 |= 8;
                    joaVarArr = joaVarArr2;
                case 4:
                    joaVarArr2 = joaVarArr;
                    z3 = b.B(serialDescriptor, 4);
                    i2 |= 16;
                    joaVarArr = joaVarArr2;
                case 5:
                    joaVarArr2 = joaVarArr;
                    str4 = b.n(serialDescriptor, 5);
                    i2 |= 32;
                    joaVarArr = joaVarArr2;
                case 6:
                    joaVarArr2 = joaVarArr;
                    str5 = b.n(serialDescriptor, 6);
                    i2 |= 64;
                    joaVarArr = joaVarArr2;
                case 7:
                    joaVarArr2 = joaVarArr;
                    d = b.D(serialDescriptor, 7);
                    i2 |= 128;
                    joaVarArr = joaVarArr2;
                case 8:
                    joaVarArr2 = joaVarArr;
                    d2 = b.D(serialDescriptor, 8);
                    i2 |= NotificationCompat.FLAG_LOCAL_ONLY;
                    joaVarArr = joaVarArr2;
                case 9:
                    joaVarArr3 = joaVarArr;
                    z = z2;
                    d3 = (Double) b.i(serialDescriptor, 9, h75.a, d3);
                    i2 |= 512;
                    joaVarArr = joaVarArr3;
                    z2 = z;
                case 10:
                    joaVarArr3 = joaVarArr;
                    z = z2;
                    d4 = (Double) b.i(serialDescriptor, 10, h75.a, d4);
                    i2 |= 1024;
                    joaVarArr = joaVarArr3;
                    z2 = z;
                case 11:
                    joaVarArr3 = joaVarArr;
                    z = z2;
                    num = (Integer) b.i(serialDescriptor, 11, a7a.a, num);
                    i2 |= a.o;
                    joaVarArr = joaVarArr3;
                    z2 = z;
                case 12:
                    joaVarArr3 = joaVarArr;
                    z = z2;
                    specialEventStatisticType = (EventStatisticsItem.SpecialEventStatisticType) b.i(serialDescriptor, 12, (dy4) joaVarArr3[12].getValue(), specialEventStatisticType);
                    i2 |= 4096;
                    joaVarArr = joaVarArr3;
                    z2 = z;
                case 13:
                    joaVarArr3 = joaVarArr;
                    z = z2;
                    teamAverageRatingVersion = (TeamAverageRatingVersion) b.w(serialDescriptor, 13, (dy4) joaVarArr3[13].getValue(), teamAverageRatingVersion);
                    i2 |= 8192;
                    joaVarArr = joaVarArr3;
                    z2 = z;
                case 14:
                    joaVarArr2 = joaVarArr;
                    z4 = b.B(serialDescriptor, 14);
                    i2 |= 16384;
                    joaVarArr = joaVarArr2;
                case 15:
                    joaVarArr2 = joaVarArr;
                    z5 = b.B(serialDescriptor, 15);
                    i = 32768;
                    i2 |= i;
                    joaVarArr = joaVarArr2;
                case 16:
                    joaVarArr2 = joaVarArr;
                    z6 = b.B(serialDescriptor, 16);
                    i = C.DEFAULT_BUFFER_SEGMENT_SIZE;
                    i2 |= i;
                    joaVarArr = joaVarArr2;
                case 17:
                    joaVarArr2 = joaVarArr;
                    z7 = b.B(serialDescriptor, 17);
                    i = 131072;
                    i2 |= i;
                    joaVarArr = joaVarArr2;
                case 18:
                    joaVarArr2 = joaVarArr;
                    z8 = b.B(serialDescriptor, 18);
                    i = 262144;
                    i2 |= i;
                    joaVarArr = joaVarArr2;
                default:
                    yhk.e(o);
                    return null;
            }
        }
        b.c(serialDescriptor);
        return new EventStatisticsItem(i2, str, str2, str3, i3, z3, str4, str5, d, d2, d3, d4, num, specialEventStatisticType, teamAverageRatingVersion, z4, z5, z6, z7, z8, null);
    }

    @Override // defpackage.dy4
    @NotNull
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(@NotNull Encoder encoder, @NotNull EventStatisticsItem value) {
        encoder.getClass();
        value.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        wf3 b = encoder.b(serialDescriptor);
        EventStatisticsItem.write$Self$model_release(value, b, serialDescriptor);
        b.c(serialDescriptor);
    }

    @Override // defpackage.iw8
    @NotNull
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return z8e.e;
    }
}
