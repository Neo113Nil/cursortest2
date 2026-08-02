package com.sofascore.model.mvvm.model;

import androidx.core.app.NotificationCompat;
import com.fyber.inneractive.sdk.external.InneractiveMediationNameConsts;
import com.ironsource.U3;
import com.ironsource.mediationsdk.metadata.a;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import defpackage.a7a;
import defpackage.iw8;
import defpackage.l98;
import defpackage.lkb;
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
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/sofascore/model/mvvm/model/Time.$serializer", "Liw8;", "Lcom/sofascore/model/mvvm/model/Time;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", U3.i.X, "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/sofascore/model/mvvm/model/Time;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/sofascore/model/mvvm/model/Time;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
@wx4
/* loaded from: classes5.dex */
public final /* synthetic */ class Time$$serializer implements iw8 {

    @NotNull
    public static final Time$$serializer INSTANCE;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        Time$$serializer time$$serializer = new Time$$serializer();
        INSTANCE = time$$serializer;
        uye uyeVar = new uye("com.sofascore.model.mvvm.model.Time", time$$serializer, 21);
        uyeVar.j("played", false);
        uyeVar.j("periodLength", false);
        uyeVar.j("overtimeLength", false);
        uyeVar.j("totalPeriodCount", false);
        uyeVar.j("initial", false);
        uyeVar.j(InneractiveMediationNameConsts.MAX, false);
        uyeVar.j("currentPeriodStartTimestamp", false);
        uyeVar.j("extra", false);
        uyeVar.j("period1", false);
        uyeVar.j("period2", false);
        uyeVar.j("period3", false);
        uyeVar.j("period4", false);
        uyeVar.j("period5", false);
        uyeVar.j("overtime", false);
        uyeVar.j("penalties", false);
        uyeVar.j("injuryTime1", false);
        uyeVar.j("injuryTime2", false);
        uyeVar.j("injuryTime3", false);
        uyeVar.j("injuryTime4", false);
        uyeVar.j("lastPeriodEndTimestamp", false);
        uyeVar.j("statusTime", true);
        descriptor = uyeVar;
    }

    private Time$$serializer() {
    }

    @Override // defpackage.iw8
    @NotNull
    public final KSerializer[] childSerializers() {
        a7a a7aVar = a7a.a;
        KSerializer W = l98.W(a7aVar);
        KSerializer W2 = l98.W(a7aVar);
        KSerializer W3 = l98.W(a7aVar);
        KSerializer W4 = l98.W(a7aVar);
        lkb lkbVar = lkb.a;
        return new KSerializer[]{W, W2, W3, W4, l98.W(lkbVar), l98.W(lkbVar), l98.W(lkbVar), l98.W(lkbVar), l98.W(lkbVar), l98.W(lkbVar), l98.W(lkbVar), l98.W(lkbVar), l98.W(lkbVar), l98.W(lkbVar), l98.W(lkbVar), l98.W(lkbVar), l98.W(lkbVar), l98.W(lkbVar), l98.W(lkbVar), l98.W(lkbVar), l98.W(StatusTime$$serializer.INSTANCE)};
    }

    @Override // defpackage.dy4
    @NotNull
    public final Time deserialize(@NotNull Decoder decoder) {
        Long l;
        Long l2;
        int i;
        Long l3;
        Integer num;
        Long l4;
        Long l5;
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        uf3 b = decoder.b(serialDescriptor);
        Long l6 = null;
        Long l7 = null;
        Long l8 = null;
        Long l9 = null;
        Long l10 = null;
        int i2 = 0;
        Long l11 = null;
        Long l12 = null;
        Long l13 = null;
        Long l14 = null;
        Long l15 = null;
        Long l16 = null;
        Long l17 = null;
        StatusTime statusTime = null;
        boolean z = true;
        Integer num2 = null;
        Integer num3 = null;
        Integer num4 = null;
        Integer num5 = null;
        Long l18 = null;
        Long l19 = null;
        Long l20 = null;
        Long l21 = null;
        while (z) {
            int o = b.o(serialDescriptor);
            switch (o) {
                case -1:
                    l3 = l6;
                    num = num2;
                    z = false;
                    l7 = l7;
                    l10 = l10;
                    num2 = num;
                    l6 = l3;
                case 0:
                    l3 = l6;
                    num = (Integer) b.i(serialDescriptor, 0, a7a.a, num2);
                    i2 |= 1;
                    l7 = l7;
                    l10 = l10;
                    l8 = l8;
                    num2 = num;
                    l6 = l3;
                case 1:
                    l3 = l6;
                    l4 = l8;
                    l5 = l10;
                    num3 = (Integer) b.i(serialDescriptor, 1, a7a.a, num3);
                    i2 |= 2;
                    num4 = num4;
                    l10 = l5;
                    l8 = l4;
                    l6 = l3;
                case 2:
                    l3 = l6;
                    l4 = l8;
                    l5 = l10;
                    num4 = (Integer) b.i(serialDescriptor, 2, a7a.a, num4);
                    i2 |= 4;
                    l10 = l5;
                    l8 = l4;
                    l6 = l3;
                case 3:
                    l3 = l6;
                    l4 = l8;
                    l5 = l10;
                    num5 = (Integer) b.i(serialDescriptor, 3, a7a.a, num5);
                    i2 |= 8;
                    l10 = l5;
                    l8 = l4;
                    l6 = l3;
                case 4:
                    l3 = l6;
                    l4 = l8;
                    l5 = l10;
                    l18 = (Long) b.i(serialDescriptor, 4, lkb.a, l18);
                    i2 |= 16;
                    l10 = l5;
                    l8 = l4;
                    l6 = l3;
                case 5:
                    l3 = l6;
                    l4 = l8;
                    l5 = l10;
                    l19 = (Long) b.i(serialDescriptor, 5, lkb.a, l19);
                    i2 |= 32;
                    l10 = l5;
                    l8 = l4;
                    l6 = l3;
                case 6:
                    l3 = l6;
                    l4 = l8;
                    l5 = l10;
                    l20 = (Long) b.i(serialDescriptor, 6, lkb.a, l20);
                    i2 |= 64;
                    l10 = l5;
                    l8 = l4;
                    l6 = l3;
                case 7:
                    l3 = l6;
                    l4 = l8;
                    l5 = l10;
                    l21 = (Long) b.i(serialDescriptor, 7, lkb.a, l21);
                    i2 |= 128;
                    l10 = l5;
                    l8 = l4;
                    l6 = l3;
                case 8:
                    l3 = l6;
                    l4 = l8;
                    l10 = (Long) b.i(serialDescriptor, 8, lkb.a, l10);
                    i2 |= NotificationCompat.FLAG_LOCAL_ONLY;
                    l8 = l4;
                    l6 = l3;
                case 9:
                    l3 = l6;
                    l8 = (Long) b.i(serialDescriptor, 9, lkb.a, l8);
                    i2 |= 512;
                    l10 = l10;
                    l6 = l3;
                case 10:
                    l = l8;
                    l2 = l10;
                    l7 = (Long) b.i(serialDescriptor, 10, lkb.a, l7);
                    i2 |= 1024;
                    l10 = l2;
                    l8 = l;
                case 11:
                    l = l8;
                    l2 = l10;
                    l6 = (Long) b.i(serialDescriptor, 11, lkb.a, l6);
                    i2 |= a.o;
                    l10 = l2;
                    l8 = l;
                case 12:
                    l = l8;
                    l2 = l10;
                    l9 = (Long) b.i(serialDescriptor, 12, lkb.a, l9);
                    i2 |= 4096;
                    l10 = l2;
                    l8 = l;
                case 13:
                    l = l8;
                    l2 = l10;
                    l11 = (Long) b.i(serialDescriptor, 13, lkb.a, l11);
                    i2 |= 8192;
                    l10 = l2;
                    l8 = l;
                case 14:
                    l = l8;
                    l2 = l10;
                    l12 = (Long) b.i(serialDescriptor, 14, lkb.a, l12);
                    i2 |= 16384;
                    l10 = l2;
                    l8 = l;
                case 15:
                    l = l8;
                    l2 = l10;
                    l13 = (Long) b.i(serialDescriptor, 15, lkb.a, l13);
                    i = 32768;
                    i2 |= i;
                    l10 = l2;
                    l8 = l;
                case 16:
                    l = l8;
                    l2 = l10;
                    l14 = (Long) b.i(serialDescriptor, 16, lkb.a, l14);
                    i = C.DEFAULT_BUFFER_SEGMENT_SIZE;
                    i2 |= i;
                    l10 = l2;
                    l8 = l;
                case 17:
                    l = l8;
                    l2 = l10;
                    l15 = (Long) b.i(serialDescriptor, 17, lkb.a, l15);
                    i = 131072;
                    i2 |= i;
                    l10 = l2;
                    l8 = l;
                case 18:
                    l = l8;
                    l2 = l10;
                    l16 = (Long) b.i(serialDescriptor, 18, lkb.a, l16);
                    i = 262144;
                    i2 |= i;
                    l10 = l2;
                    l8 = l;
                case 19:
                    l = l8;
                    l2 = l10;
                    l17 = (Long) b.i(serialDescriptor, 19, lkb.a, l17);
                    i = 524288;
                    i2 |= i;
                    l10 = l2;
                    l8 = l;
                case 20:
                    l2 = l10;
                    l = l8;
                    statusTime = (StatusTime) b.i(serialDescriptor, 20, StatusTime$$serializer.INSTANCE, statusTime);
                    i = ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
                    i2 |= i;
                    l10 = l2;
                    l8 = l;
                default:
                    yhk.e(o);
                    return null;
            }
        }
        Long l22 = l6;
        Long l23 = l10;
        Integer num6 = num2;
        Integer num7 = num3;
        Integer num8 = num4;
        b.c(serialDescriptor);
        StatusTime statusTime2 = statusTime;
        Long l24 = l17;
        return new Time(i2, num6, num7, num8, num5, l18, l19, l20, l21, l23, l8, l7, l22, l9, l11, l12, l13, l14, l15, l16, l24, statusTime2, null);
    }

    @Override // defpackage.dy4
    @NotNull
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(@NotNull Encoder encoder, @NotNull Time value) {
        encoder.getClass();
        value.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        wf3 b = encoder.b(serialDescriptor);
        Time.write$Self$model_release(value, b, serialDescriptor);
        b.c(serialDescriptor);
    }

    @Override // defpackage.iw8
    @NotNull
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return z8e.e;
    }
}
