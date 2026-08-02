package com.sofascore.model.mvvm.model;

import androidx.core.app.NotificationCompat;
import com.ironsource.U3;
import com.ironsource.mediationsdk.metadata.a;
import com.sofascore.model.network.response.SearchResponseKt;
import defpackage.a7a;
import defpackage.h75;
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
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/sofascore/model/mvvm/model/Batsman.$serializer", "Liw8;", "Lcom/sofascore/model/mvvm/model/Batsman;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", U3.i.X, "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/sofascore/model/mvvm/model/Batsman;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/sofascore/model/mvvm/model/Batsman;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
@wx4
/* loaded from: classes5.dex */
public final /* synthetic */ class Batsman$$serializer implements iw8 {

    @NotNull
    public static final Batsman$$serializer INSTANCE;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        Batsman$$serializer batsman$$serializer = new Batsman$$serializer();
        INSTANCE = batsman$$serializer;
        uye uyeVar = new uye("com.sofascore.model.mvvm.model.Batsman", batsman$$serializer, 14);
        uyeVar.j(SearchResponseKt.PLAYER_ENTITY, false);
        uyeVar.j("playerName", false);
        uyeVar.j("score", false);
        uyeVar.j("balls", false);
        uyeVar.j("s4", false);
        uyeVar.j("s6", false);
        uyeVar.j("wicketTypeId", false);
        uyeVar.j("wicketTypeName", false);
        uyeVar.j("fowScore", false);
        uyeVar.j("fowOver", false);
        uyeVar.j("wicketBowler", false);
        uyeVar.j("wicketBowlerName", false);
        uyeVar.j("wicketCatch", false);
        uyeVar.j("wicketCatchName", false);
        descriptor = uyeVar;
    }

    private Batsman$$serializer() {
    }

    @Override // defpackage.iw8
    @NotNull
    public final KSerializer[] childSerializers() {
        Player$$serializer player$$serializer = Player$$serializer.INSTANCE;
        uhi uhiVar = uhi.a;
        KSerializer W = l98.W(uhiVar);
        a7a a7aVar = a7a.a;
        return new KSerializer[]{player$$serializer, W, l98.W(a7aVar), l98.W(a7aVar), l98.W(a7aVar), l98.W(a7aVar), l98.W(a7aVar), l98.W(uhiVar), l98.W(a7aVar), l98.W(h75.a), l98.W(player$$serializer), l98.W(uhiVar), l98.W(player$$serializer), l98.W(uhiVar)};
    }

    @Override // defpackage.dy4
    @NotNull
    public final Batsman deserialize(@NotNull Decoder decoder) {
        String str;
        Integer num;
        String str2;
        Integer num2;
        Player player;
        Player player2;
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        uf3 b = decoder.b(serialDescriptor);
        String str3 = null;
        Player player3 = null;
        Double d = null;
        Player player4 = null;
        Integer num3 = null;
        int i = 0;
        String str4 = null;
        String str5 = null;
        Integer num4 = null;
        Integer num5 = null;
        Integer num6 = null;
        Integer num7 = null;
        Integer num8 = null;
        String str6 = null;
        boolean z = true;
        Player player5 = null;
        while (z) {
            int o = b.o(serialDescriptor);
            switch (o) {
                case -1:
                    str2 = str3;
                    num2 = num4;
                    player = player5;
                    player2 = player3;
                    z = false;
                    player3 = player2;
                    num4 = num2;
                    player5 = player;
                    str3 = str2;
                case 0:
                    str2 = str3;
                    num2 = num4;
                    Player player6 = player5;
                    player2 = player3;
                    player = (Player) b.w(serialDescriptor, 0, Player$$serializer.INSTANCE, player6);
                    i |= 1;
                    str5 = str5;
                    player3 = player2;
                    num4 = num2;
                    player5 = player;
                    str3 = str2;
                case 1:
                    str2 = str3;
                    str5 = (String) b.i(serialDescriptor, 1, uhi.a, str5);
                    i |= 2;
                    num4 = num4;
                    str3 = str2;
                case 2:
                    str2 = str3;
                    num4 = (Integer) b.i(serialDescriptor, 2, a7a.a, num4);
                    i |= 4;
                    str5 = str5;
                    str3 = str2;
                case 3:
                    str = str5;
                    num = num4;
                    num5 = (Integer) b.i(serialDescriptor, 3, a7a.a, num5);
                    i |= 8;
                    str5 = str;
                    num4 = num;
                case 4:
                    str = str5;
                    num = num4;
                    num6 = (Integer) b.i(serialDescriptor, 4, a7a.a, num6);
                    i |= 16;
                    str5 = str;
                    num4 = num;
                case 5:
                    str = str5;
                    num = num4;
                    num7 = (Integer) b.i(serialDescriptor, 5, a7a.a, num7);
                    i |= 32;
                    str5 = str;
                    num4 = num;
                case 6:
                    str = str5;
                    num = num4;
                    num8 = (Integer) b.i(serialDescriptor, 6, a7a.a, num8);
                    i |= 64;
                    str5 = str;
                    num4 = num;
                case 7:
                    str = str5;
                    num = num4;
                    str6 = (String) b.i(serialDescriptor, 7, uhi.a, str6);
                    i |= 128;
                    str5 = str;
                    num4 = num;
                case 8:
                    str = str5;
                    num = num4;
                    num3 = (Integer) b.i(serialDescriptor, 8, a7a.a, num3);
                    i |= NotificationCompat.FLAG_LOCAL_ONLY;
                    str5 = str;
                    num4 = num;
                case 9:
                    str = str5;
                    num = num4;
                    d = (Double) b.i(serialDescriptor, 9, h75.a, d);
                    i |= 512;
                    str5 = str;
                    num4 = num;
                case 10:
                    str = str5;
                    num = num4;
                    player3 = (Player) b.i(serialDescriptor, 10, Player$$serializer.INSTANCE, player3);
                    i |= 1024;
                    str5 = str;
                    num4 = num;
                case 11:
                    str = str5;
                    num = num4;
                    str3 = (String) b.i(serialDescriptor, 11, uhi.a, str3);
                    i |= a.o;
                    str5 = str;
                    num4 = num;
                case 12:
                    str = str5;
                    num = num4;
                    player4 = (Player) b.i(serialDescriptor, 12, Player$$serializer.INSTANCE, player4);
                    i |= 4096;
                    str5 = str;
                    num4 = num;
                case 13:
                    str = str5;
                    num = num4;
                    str4 = (String) b.i(serialDescriptor, 13, uhi.a, str4);
                    i |= 8192;
                    str5 = str;
                    num4 = num;
                default:
                    yhk.e(o);
                    return null;
            }
        }
        String str7 = str3;
        Player player7 = player5;
        b.c(serialDescriptor);
        return new Batsman(i, player7, str5, num4, num5, num6, num7, num8, str6, num3, d, player3, str7, player4, str4, null);
    }

    @Override // defpackage.dy4
    @NotNull
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(@NotNull Encoder encoder, @NotNull Batsman value) {
        encoder.getClass();
        value.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        wf3 b = encoder.b(serialDescriptor);
        Batsman.write$Self$model_release(value, b, serialDescriptor);
        b.c(serialDescriptor);
    }

    @Override // defpackage.iw8
    @NotNull
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return z8e.e;
    }
}
