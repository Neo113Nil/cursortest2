package com.sofascore.model.newNetwork;

import androidx.core.app.NotificationCompat;
import com.ironsource.U3;
import com.ironsource.mediationsdk.metadata.a;
import com.sofascore.model.mvvm.model.Player;
import com.sofascore.model.mvvm.model.Player$$serializer;
import com.sofascore.model.network.response.SearchResponseKt;
import defpackage.a7a;
import defpackage.gz1;
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
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/sofascore/model/newNetwork/FootballShotmapItem.$serializer", "Liw8;", "Lcom/sofascore/model/newNetwork/FootballShotmapItem;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", U3.i.X, "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/sofascore/model/newNetwork/FootballShotmapItem;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/sofascore/model/newNetwork/FootballShotmapItem;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
@wx4
/* loaded from: classes5.dex */
public final /* synthetic */ class FootballShotmapItem$$serializer implements iw8 {

    @NotNull
    public static final FootballShotmapItem$$serializer INSTANCE;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        FootballShotmapItem$$serializer footballShotmapItem$$serializer = new FootballShotmapItem$$serializer();
        INSTANCE = footballShotmapItem$$serializer;
        uye uyeVar = new uye("com.sofascore.model.newNetwork.FootballShotmapItem", footballShotmapItem$$serializer, 15);
        uyeVar.j("id", false);
        uyeVar.j("shotType", false);
        uyeVar.j("goalType", false);
        uyeVar.j("situation", false);
        uyeVar.j("bodyPart", false);
        uyeVar.j("goalMouthLocation", false);
        uyeVar.j("shootoutOrder", false);
        uyeVar.j("time", false);
        uyeVar.j("timeSeconds", false);
        uyeVar.j("addedTime", false);
        uyeVar.j("xg", false);
        uyeVar.j("xgot", false);
        uyeVar.j(SearchResponseKt.PLAYER_ENTITY, false);
        uyeVar.j("isHome", false);
        uyeVar.j("draw", false);
        descriptor = uyeVar;
    }

    private FootballShotmapItem$$serializer() {
    }

    @Override // defpackage.iw8
    @NotNull
    public final KSerializer[] childSerializers() {
        a7a a7aVar = a7a.a;
        uhi uhiVar = uhi.a;
        KSerializer W = l98.W(uhiVar);
        KSerializer W2 = l98.W(uhiVar);
        KSerializer W3 = l98.W(uhiVar);
        KSerializer W4 = l98.W(a7aVar);
        KSerializer W5 = l98.W(a7aVar);
        KSerializer W6 = l98.W(a7aVar);
        h75 h75Var = h75.a;
        return new KSerializer[]{a7aVar, uhiVar, W, uhiVar, W2, W3, W4, a7aVar, W5, W6, l98.W(h75Var), l98.W(h75Var), Player$$serializer.INSTANCE, gz1.a, Coordinates$$serializer.INSTANCE};
    }

    @Override // defpackage.dy4
    @NotNull
    public final FootballShotmapItem deserialize(@NotNull Decoder decoder) {
        String str;
        String str2;
        String str3;
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        uf3 b = decoder.b(serialDescriptor);
        Double d = null;
        Double d2 = null;
        Integer num = null;
        Player player = null;
        Integer num2 = null;
        int i = 0;
        Coordinates coordinates = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        String str8 = null;
        Integer num3 = null;
        int i2 = 0;
        boolean z = true;
        int i3 = 0;
        boolean z2 = false;
        while (z) {
            int o = b.o(serialDescriptor);
            switch (o) {
                case -1:
                    str = str6;
                    z = false;
                    str6 = str;
                case 0:
                    str2 = str4;
                    str = str6;
                    i3 = b.l(serialDescriptor, 0);
                    i |= 1;
                    str4 = str2;
                    str6 = str;
                case 1:
                    str = str6;
                    i |= 2;
                    str4 = b.n(serialDescriptor, 1);
                    str6 = str;
                case 2:
                    str2 = str4;
                    str = str6;
                    str5 = (String) b.i(serialDescriptor, 2, uhi.a, str5);
                    i |= 4;
                    str4 = str2;
                    str6 = str;
                case 3:
                    str3 = str4;
                    str6 = b.n(serialDescriptor, 3);
                    i |= 8;
                    str4 = str3;
                case 4:
                    str2 = str4;
                    str = str6;
                    str7 = (String) b.i(serialDescriptor, 4, uhi.a, str7);
                    i |= 16;
                    str4 = str2;
                    str6 = str;
                case 5:
                    str2 = str4;
                    str = str6;
                    str8 = (String) b.i(serialDescriptor, 5, uhi.a, str8);
                    i |= 32;
                    str4 = str2;
                    str6 = str;
                case 6:
                    str2 = str4;
                    str = str6;
                    num3 = (Integer) b.i(serialDescriptor, 6, a7a.a, num3);
                    i |= 64;
                    str4 = str2;
                    str6 = str;
                case 7:
                    str3 = str4;
                    i2 = b.l(serialDescriptor, 7);
                    i |= 128;
                    str4 = str3;
                case 8:
                    str2 = str4;
                    str = str6;
                    num2 = (Integer) b.i(serialDescriptor, 8, a7a.a, num2);
                    i |= NotificationCompat.FLAG_LOCAL_ONLY;
                    str4 = str2;
                    str6 = str;
                case 9:
                    str2 = str4;
                    str = str6;
                    num = (Integer) b.i(serialDescriptor, 9, a7a.a, num);
                    i |= 512;
                    str4 = str2;
                    str6 = str;
                case 10:
                    str2 = str4;
                    str = str6;
                    d2 = (Double) b.i(serialDescriptor, 10, h75.a, d2);
                    i |= 1024;
                    str4 = str2;
                    str6 = str;
                case 11:
                    str2 = str4;
                    str = str6;
                    d = (Double) b.i(serialDescriptor, 11, h75.a, d);
                    i |= a.o;
                    str4 = str2;
                    str6 = str;
                case 12:
                    str2 = str4;
                    str = str6;
                    player = (Player) b.w(serialDescriptor, 12, Player$$serializer.INSTANCE, player);
                    i |= 4096;
                    str4 = str2;
                    str6 = str;
                case 13:
                    str3 = str4;
                    z2 = b.B(serialDescriptor, 13);
                    i |= 8192;
                    str4 = str3;
                case 14:
                    str2 = str4;
                    str = str6;
                    coordinates = (Coordinates) b.w(serialDescriptor, 14, Coordinates$$serializer.INSTANCE, coordinates);
                    i |= 16384;
                    str4 = str2;
                    str6 = str;
                default:
                    yhk.e(o);
                    return null;
            }
        }
        b.c(serialDescriptor);
        return new FootballShotmapItem(i, i3, str4, str5, str6, str7, str8, num3, i2, num2, num, d2, d, player, z2, coordinates, null);
    }

    @Override // defpackage.dy4
    @NotNull
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(@NotNull Encoder encoder, @NotNull FootballShotmapItem value) {
        encoder.getClass();
        value.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        wf3 b = encoder.b(serialDescriptor);
        FootballShotmapItem.write$Self$model_release(value, b, serialDescriptor);
        b.c(serialDescriptor);
    }

    @Override // defpackage.iw8
    @NotNull
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return z8e.e;
    }
}
