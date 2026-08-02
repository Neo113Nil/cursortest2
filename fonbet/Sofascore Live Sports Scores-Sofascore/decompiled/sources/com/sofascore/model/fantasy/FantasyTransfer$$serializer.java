package com.sofascore.model.fantasy;

import androidx.core.app.NotificationCompat;
import com.ironsource.U3;
import com.sofascore.model.mvvm.model.Player;
import com.sofascore.model.mvvm.model.Player$$serializer;
import defpackage.a7a;
import defpackage.h75;
import defpackage.iw8;
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
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/sofascore/model/fantasy/FantasyTransfer.$serializer", "Liw8;", "Lcom/sofascore/model/fantasy/FantasyTransfer;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", U3.i.X, "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/sofascore/model/fantasy/FantasyTransfer;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/sofascore/model/fantasy/FantasyTransfer;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
@wx4
/* loaded from: classes5.dex */
public final /* synthetic */ class FantasyTransfer$$serializer implements iw8 {

    @NotNull
    public static final FantasyTransfer$$serializer INSTANCE;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        FantasyTransfer$$serializer fantasyTransfer$$serializer = new FantasyTransfer$$serializer();
        INSTANCE = fantasyTransfer$$serializer;
        uye uyeVar = new uye("com.sofascore.model.fantasy.FantasyTransfer", fantasyTransfer$$serializer, 10);
        uyeVar.j("playerIn", false);
        uyeVar.j("playerOut", false);
        uyeVar.j("priceIn", false);
        uyeVar.j("priceOut", false);
        uyeVar.j("teamIdIn", false);
        uyeVar.j("teamIdOut", false);
        uyeVar.j("teamNameCodeIn", false);
        uyeVar.j("teamNameCodeOut", false);
        uyeVar.j("fantasyPlayerIdIn", false);
        uyeVar.j("fantasyPlayerIdOut", false);
        descriptor = uyeVar;
    }

    private FantasyTransfer$$serializer() {
    }

    @Override // defpackage.iw8
    @NotNull
    public final KSerializer[] childSerializers() {
        Player$$serializer player$$serializer = Player$$serializer.INSTANCE;
        h75 h75Var = h75.a;
        a7a a7aVar = a7a.a;
        uhi uhiVar = uhi.a;
        return new KSerializer[]{player$$serializer, player$$serializer, h75Var, h75Var, a7aVar, a7aVar, uhiVar, uhiVar, a7aVar, a7aVar};
    }

    @Override // defpackage.dy4
    @NotNull
    public final FantasyTransfer deserialize(@NotNull Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        uf3 b = decoder.b(serialDescriptor);
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        Player player = null;
        Player player2 = null;
        String str = null;
        String str2 = null;
        double d = 0.0d;
        double d2 = 0.0d;
        boolean z = true;
        while (z) {
            int o = b.o(serialDescriptor);
            switch (o) {
                case -1:
                    z = false;
                    break;
                case 0:
                    player = (Player) b.w(serialDescriptor, 0, Player$$serializer.INSTANCE, player);
                    i |= 1;
                    break;
                case 1:
                    player2 = (Player) b.w(serialDescriptor, 1, Player$$serializer.INSTANCE, player2);
                    i |= 2;
                    break;
                case 2:
                    d = b.D(serialDescriptor, 2);
                    i |= 4;
                    break;
                case 3:
                    d2 = b.D(serialDescriptor, 3);
                    i |= 8;
                    break;
                case 4:
                    i2 = b.l(serialDescriptor, 4);
                    i |= 16;
                    break;
                case 5:
                    i3 = b.l(serialDescriptor, 5);
                    i |= 32;
                    break;
                case 6:
                    str = b.n(serialDescriptor, 6);
                    i |= 64;
                    break;
                case 7:
                    str2 = b.n(serialDescriptor, 7);
                    i |= 128;
                    break;
                case 8:
                    i4 = b.l(serialDescriptor, 8);
                    i |= NotificationCompat.FLAG_LOCAL_ONLY;
                    break;
                case 9:
                    i5 = b.l(serialDescriptor, 9);
                    i |= 512;
                    break;
                default:
                    yhk.e(o);
                    return null;
            }
        }
        b.c(serialDescriptor);
        return new FantasyTransfer(i, player, player2, d, d2, i2, i3, str, str2, i4, i5, null);
    }

    @Override // defpackage.dy4
    @NotNull
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(@NotNull Encoder encoder, @NotNull FantasyTransfer value) {
        encoder.getClass();
        value.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        wf3 b = encoder.b(serialDescriptor);
        FantasyTransfer.write$Self$model_release(value, b, serialDescriptor);
        b.c(serialDescriptor);
    }

    @Override // defpackage.iw8
    @NotNull
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return z8e.e;
    }
}
