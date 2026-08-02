package com.sofascore.model.buzzer;

import androidx.core.app.NotificationCompat;
import com.ironsource.U3;
import com.ironsource.mediationsdk.metadata.a;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import defpackage.a7a;
import defpackage.iw8;
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
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/sofascore/model/buzzer/TileReasonCount.$serializer", "Liw8;", "Lcom/sofascore/model/buzzer/TileReasonCount;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", U3.i.X, "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/sofascore/model/buzzer/TileReasonCount;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/sofascore/model/buzzer/TileReasonCount;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
@wx4
/* loaded from: classes5.dex */
public final /* synthetic */ class TileReasonCount$$serializer implements iw8 {

    @NotNull
    public static final TileReasonCount$$serializer INSTANCE;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        TileReasonCount$$serializer tileReasonCount$$serializer = new TileReasonCount$$serializer();
        INSTANCE = tileReasonCount$$serializer;
        uye uyeVar = new uye("com.sofascore.model.buzzer.TileReasonCount", tileReasonCount$$serializer, 18);
        uyeVar.j(BuzzerConfigResponseKt.TOP_EVENT, false);
        uyeVar.j(BuzzerConfigResponseKt.TOP_FOOTBALL_EVENT_PLAYER_PERFORMANCE, false);
        uyeVar.j(BuzzerConfigResponseKt.TOP_BASKETBALL_EVENT_PLAYER_PERFORMANCE, false);
        uyeVar.j(BuzzerConfigResponseKt.ATP_SINGLES_RANKING_CHANGE, false);
        uyeVar.j(BuzzerConfigResponseKt.WTA_SINGLES_RANKING_CHANGE, false);
        uyeVar.j(BuzzerConfigResponseKt.FIFA_RANKING_CHANGE, false);
        uyeVar.j(BuzzerConfigResponseKt.SURPRISE_EVENT_RESULT, false);
        uyeVar.j(BuzzerConfigResponseKt.UT_KEY_MOMENT, false);
        uyeVar.j(BuzzerConfigResponseKt.CUP_PROGRESSION, false);
        uyeVar.j(BuzzerConfigResponseKt.FORMULA_ONE, false);
        uyeVar.j(BuzzerConfigResponseKt.INTERESTING_STATISTIC, false);
        uyeVar.j(BuzzerConfigResponseKt.TRANSFER, false);
        uyeVar.j(BuzzerConfigResponseKt.MMA_EVENT, false);
        uyeVar.j(BuzzerConfigResponseKt.TEAM_OF_THE_WEEK, false);
        uyeVar.j(BuzzerConfigResponseKt.DETAILED_STATISTIC, false);
        uyeVar.j(BuzzerConfigResponseKt.SOFASCORE_RATING, false);
        uyeVar.j(BuzzerConfigResponseKt.WEEKLY_CHALLENGE, false);
        uyeVar.j(BuzzerConfigResponseKt.AI_INSIGHTS, false);
        descriptor = uyeVar;
    }

    private TileReasonCount$$serializer() {
    }

    @Override // defpackage.iw8
    @NotNull
    public final KSerializer[] childSerializers() {
        a7a a7aVar = a7a.a;
        return new KSerializer[]{a7aVar, a7aVar, a7aVar, a7aVar, a7aVar, a7aVar, a7aVar, a7aVar, a7aVar, a7aVar, a7aVar, a7aVar, a7aVar, a7aVar, a7aVar, a7aVar, a7aVar, a7aVar};
    }

    @Override // defpackage.dy4
    @NotNull
    public final TileReasonCount deserialize(@NotNull Decoder decoder) {
        int i;
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        uf3 b = decoder.b(serialDescriptor);
        boolean z = true;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        int i17 = 0;
        int i18 = 0;
        int i19 = 0;
        int i20 = 0;
        while (z) {
            int o = b.o(serialDescriptor);
            switch (o) {
                case -1:
                    z = false;
                    continue;
                case 0:
                    i3 = b.l(serialDescriptor, 0);
                    i2 |= 1;
                    continue;
                case 1:
                    i4 = b.l(serialDescriptor, 1);
                    i2 |= 2;
                    continue;
                case 2:
                    i5 = b.l(serialDescriptor, 2);
                    i2 |= 4;
                    continue;
                case 3:
                    i6 = b.l(serialDescriptor, 3);
                    i2 |= 8;
                    continue;
                case 4:
                    i7 = b.l(serialDescriptor, 4);
                    i2 |= 16;
                    continue;
                case 5:
                    i8 = b.l(serialDescriptor, 5);
                    i2 |= 32;
                    continue;
                case 6:
                    i9 = b.l(serialDescriptor, 6);
                    i2 |= 64;
                    continue;
                case 7:
                    i10 = b.l(serialDescriptor, 7);
                    i2 |= 128;
                    continue;
                case 8:
                    i11 = b.l(serialDescriptor, 8);
                    i2 |= NotificationCompat.FLAG_LOCAL_ONLY;
                    continue;
                case 9:
                    i12 = b.l(serialDescriptor, 9);
                    i2 |= 512;
                    continue;
                case 10:
                    i13 = b.l(serialDescriptor, 10);
                    i2 |= 1024;
                    continue;
                case 11:
                    i14 = b.l(serialDescriptor, 11);
                    i2 |= a.o;
                    continue;
                case 12:
                    i15 = b.l(serialDescriptor, 12);
                    i2 |= 4096;
                    continue;
                case 13:
                    i16 = b.l(serialDescriptor, 13);
                    i2 |= 8192;
                    continue;
                case 14:
                    i17 = b.l(serialDescriptor, 14);
                    i2 |= 16384;
                    continue;
                case 15:
                    i18 = b.l(serialDescriptor, 15);
                    i = 32768;
                    break;
                case 16:
                    i19 = b.l(serialDescriptor, 16);
                    i = C.DEFAULT_BUFFER_SEGMENT_SIZE;
                    break;
                case 17:
                    i20 = b.l(serialDescriptor, 17);
                    i = 131072;
                    break;
                default:
                    yhk.e(o);
                    return null;
            }
            i2 |= i;
        }
        b.c(serialDescriptor);
        return new TileReasonCount(i2, i3, i4, i5, i6, i7, i8, i9, i10, i11, i12, i13, i14, i15, i16, i17, i18, i19, i20, null);
    }

    @Override // defpackage.dy4
    @NotNull
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(@NotNull Encoder encoder, @NotNull TileReasonCount value) {
        encoder.getClass();
        value.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        wf3 b = encoder.b(serialDescriptor);
        TileReasonCount.write$Self$model_release(value, b, serialDescriptor);
        b.c(serialDescriptor);
    }

    @Override // defpackage.iw8
    @NotNull
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return z8e.e;
    }
}
