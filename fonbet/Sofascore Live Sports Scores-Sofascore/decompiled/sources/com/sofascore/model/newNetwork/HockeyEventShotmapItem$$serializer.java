package com.sofascore.model.newNetwork;

import com.ironsource.U3;
import com.sofascore.model.mvvm.model.Player;
import com.sofascore.model.mvvm.model.Player$$serializer;
import com.sofascore.model.mvvm.model.Team;
import com.sofascore.model.network.response.SearchResponseKt;
import defpackage.a7a;
import defpackage.c88;
import defpackage.dy4;
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
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/sofascore/model/newNetwork/HockeyEventShotmapItem.$serializer", "Liw8;", "Lcom/sofascore/model/newNetwork/HockeyEventShotmapItem;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", U3.i.X, "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/sofascore/model/newNetwork/HockeyEventShotmapItem;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/sofascore/model/newNetwork/HockeyEventShotmapItem;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
@wx4
/* loaded from: classes5.dex */
public final /* synthetic */ class HockeyEventShotmapItem$$serializer implements iw8 {

    @NotNull
    public static final HockeyEventShotmapItem$$serializer INSTANCE;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        HockeyEventShotmapItem$$serializer hockeyEventShotmapItem$$serializer = new HockeyEventShotmapItem$$serializer();
        INSTANCE = hockeyEventShotmapItem$$serializer;
        uye uyeVar = new uye("com.sofascore.model.newNetwork.HockeyEventShotmapItem", hockeyEventShotmapItem$$serializer, 7);
        uyeVar.j(SearchResponseKt.PLAYER_ENTITY, false);
        uyeVar.j("team", false);
        uyeVar.j("id", false);
        uyeVar.j("x", false);
        uyeVar.j("y", false);
        uyeVar.j("type", false);
        uyeVar.j("period", false);
        descriptor = uyeVar;
    }

    private HockeyEventShotmapItem$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.iw8
    @NotNull
    public final KSerializer[] childSerializers() {
        joa[] joaVarArr;
        joaVarArr = HockeyEventShotmapItem.$childSerializers;
        a7a a7aVar = a7a.a;
        c88 c88Var = c88.a;
        return new KSerializer[]{Player$$serializer.INSTANCE, joaVarArr[1].getValue(), a7aVar, c88Var, c88Var, a7aVar, l98.W(uhi.a)};
    }

    @Override // defpackage.dy4
    @NotNull
    public final HockeyEventShotmapItem deserialize(@NotNull Decoder decoder) {
        joa[] joaVarArr;
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        uf3 b = decoder.b(serialDescriptor);
        joaVarArr = HockeyEventShotmapItem.$childSerializers;
        HockeyEventShotmapItem hockeyEventShotmapItem = null;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        Player player = null;
        Team team = null;
        String str = null;
        float f = 0.0f;
        float f2 = 0.0f;
        boolean z = true;
        while (z) {
            int o = b.o(serialDescriptor);
            switch (o) {
                case -1:
                    z = false;
                    continue;
                case 0:
                    player = (Player) b.w(serialDescriptor, 0, Player$$serializer.INSTANCE, player);
                    i |= 1;
                    break;
                case 1:
                    team = (Team) b.w(serialDescriptor, 1, (dy4) joaVarArr[1].getValue(), team);
                    i |= 2;
                    break;
                case 2:
                    i2 = b.l(serialDescriptor, 2);
                    i |= 4;
                    break;
                case 3:
                    f = b.s(serialDescriptor, 3);
                    i |= 8;
                    break;
                case 4:
                    f2 = b.s(serialDescriptor, 4);
                    i |= 16;
                    break;
                case 5:
                    i3 = b.l(serialDescriptor, 5);
                    i |= 32;
                    break;
                case 6:
                    str = (String) b.i(serialDescriptor, 6, uhi.a, str);
                    i |= 64;
                    break;
                default:
                    yhk.e(o);
                    return hockeyEventShotmapItem;
            }
            hockeyEventShotmapItem = null;
        }
        b.c(serialDescriptor);
        return new HockeyEventShotmapItem(i, player, team, i2, f, f2, i3, str, null);
    }

    @Override // defpackage.dy4
    @NotNull
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(@NotNull Encoder encoder, @NotNull HockeyEventShotmapItem value) {
        encoder.getClass();
        value.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        wf3 b = encoder.b(serialDescriptor);
        HockeyEventShotmapItem.write$Self$model_release(value, b, serialDescriptor);
        b.c(serialDescriptor);
    }

    @Override // defpackage.iw8
    @NotNull
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return z8e.e;
    }
}
