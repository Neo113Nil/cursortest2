package com.sofascore.model.mvvm.model;

import com.ironsource.U3;
import defpackage.a7a;
import defpackage.dy4;
import defpackage.iw8;
import defpackage.joa;
import defpackage.l98;
import defpackage.lkb;
import defpackage.uf3;
import defpackage.uhi;
import defpackage.uye;
import defpackage.wf3;
import defpackage.wx4;
import defpackage.yhk;
import defpackage.z8e;
import java.util.List;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/sofascore/model/mvvm/model/StandingsTable.$serializer", "Liw8;", "Lcom/sofascore/model/mvvm/model/StandingsTable;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", U3.i.X, "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/sofascore/model/mvvm/model/StandingsTable;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/sofascore/model/mvvm/model/StandingsTable;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
@wx4
/* loaded from: classes5.dex */
public final /* synthetic */ class StandingsTable$$serializer implements iw8 {

    @NotNull
    public static final StandingsTable$$serializer INSTANCE;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        StandingsTable$$serializer standingsTable$$serializer = new StandingsTable$$serializer();
        INSTANCE = standingsTable$$serializer;
        uye uyeVar = new uye("com.sofascore.model.mvvm.model.StandingsTable", standingsTable$$serializer, 8);
        uyeVar.j("id", false);
        uyeVar.j("name", false);
        uyeVar.j("rows", false);
        uyeVar.j("tournament", false);
        uyeVar.j("tieBreakingRule", false);
        uyeVar.j("descriptions", false);
        uyeVar.j("updatedAtTimestamp", false);
        uyeVar.j("bucket", false);
        descriptor = uyeVar;
    }

    private StandingsTable$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.iw8
    @NotNull
    public final KSerializer[] childSerializers() {
        joa[] joaVarArr;
        joaVarArr = StandingsTable.$childSerializers;
        return new KSerializer[]{a7a.a, uhi.a, joaVarArr[2].getValue(), Tournament$$serializer.INSTANCE, l98.W(Description$$serializer.INSTANCE), joaVarArr[5].getValue(), l98.W(lkb.a), l98.W((KSerializer) joaVarArr[7].getValue())};
    }

    @Override // defpackage.dy4
    @NotNull
    public final StandingsTable deserialize(@NotNull Decoder decoder) {
        joa[] joaVarArr;
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        uf3 b = decoder.b(serialDescriptor);
        joaVarArr = StandingsTable.$childSerializers;
        StandingsTable standingsTable = null;
        boolean z = true;
        StandingsBucket standingsBucket = null;
        String str = null;
        List list = null;
        Tournament tournament = null;
        Description description = null;
        List list2 = null;
        Long l = null;
        int i = 0;
        int i2 = 0;
        while (z) {
            int o = b.o(serialDescriptor);
            switch (o) {
                case -1:
                    z = false;
                    continue;
                case 0:
                    i2 = b.l(serialDescriptor, 0);
                    i |= 1;
                    break;
                case 1:
                    str = b.n(serialDescriptor, 1);
                    i |= 2;
                    break;
                case 2:
                    list = (List) b.w(serialDescriptor, 2, (dy4) joaVarArr[2].getValue(), list);
                    i |= 4;
                    break;
                case 3:
                    tournament = (Tournament) b.w(serialDescriptor, 3, Tournament$$serializer.INSTANCE, tournament);
                    i |= 8;
                    break;
                case 4:
                    description = (Description) b.i(serialDescriptor, 4, Description$$serializer.INSTANCE, description);
                    i |= 16;
                    break;
                case 5:
                    list2 = (List) b.w(serialDescriptor, 5, (dy4) joaVarArr[5].getValue(), list2);
                    i |= 32;
                    break;
                case 6:
                    l = (Long) b.i(serialDescriptor, 6, lkb.a, l);
                    i |= 64;
                    break;
                case 7:
                    standingsBucket = (StandingsBucket) b.i(serialDescriptor, 7, (dy4) joaVarArr[7].getValue(), standingsBucket);
                    i |= 128;
                    break;
                default:
                    yhk.e(o);
                    return standingsTable;
            }
            standingsTable = null;
        }
        b.c(serialDescriptor);
        return new StandingsTable(i, i2, str, list, tournament, description, list2, l, standingsBucket, null);
    }

    @Override // defpackage.dy4
    @NotNull
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(@NotNull Encoder encoder, @NotNull StandingsTable value) {
        encoder.getClass();
        value.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        wf3 b = encoder.b(serialDescriptor);
        StandingsTable.write$Self$model_release(value, b, serialDescriptor);
        b.c(serialDescriptor);
    }

    @Override // defpackage.iw8
    @NotNull
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return z8e.e;
    }
}
