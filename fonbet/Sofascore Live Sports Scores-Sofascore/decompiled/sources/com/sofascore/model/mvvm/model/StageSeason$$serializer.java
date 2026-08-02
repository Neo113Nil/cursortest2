package com.sofascore.model.mvvm.model;

import com.ironsource.U3;
import com.sofascore.model.network.response.SearchResponseKt;
import defpackage.a7a;
import defpackage.iw8;
import defpackage.l98;
import defpackage.lkb;
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
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/sofascore/model/mvvm/model/StageSeason.$serializer", "Liw8;", "Lcom/sofascore/model/mvvm/model/StageSeason;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", U3.i.X, "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/sofascore/model/mvvm/model/StageSeason;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/sofascore/model/mvvm/model/StageSeason;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
@wx4
/* loaded from: classes5.dex */
public final /* synthetic */ class StageSeason$$serializer implements iw8 {

    @NotNull
    public static final StageSeason$$serializer INSTANCE;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        StageSeason$$serializer stageSeason$$serializer = new StageSeason$$serializer();
        INSTANCE = stageSeason$$serializer;
        uye uyeVar = new uye("com.sofascore.model.mvvm.model.StageSeason", stageSeason$$serializer, 7);
        uyeVar.j(SearchResponseKt.UNIQUE_STAGE_ENTITY, false);
        uyeVar.j("description", false);
        uyeVar.j("slug", false);
        uyeVar.j("year", false);
        uyeVar.j("id", false);
        uyeVar.j("startDateTimestamp", false);
        uyeVar.j("endDateTimestamp", false);
        descriptor = uyeVar;
    }

    private StageSeason$$serializer() {
    }

    @Override // defpackage.iw8
    @NotNull
    public final KSerializer[] childSerializers() {
        KSerializer W = l98.W(UniqueStage$$serializer.INSTANCE);
        uhi uhiVar = uhi.a;
        KSerializer W2 = l98.W(uhiVar);
        KSerializer W3 = l98.W(uhiVar);
        lkb lkbVar = lkb.a;
        return new KSerializer[]{W, uhiVar, W2, W3, a7a.a, l98.W(lkbVar), l98.W(lkbVar)};
    }

    @Override // defpackage.dy4
    @NotNull
    public final StageSeason deserialize(@NotNull Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        uf3 b = decoder.b(serialDescriptor);
        boolean z = true;
        int i = 0;
        int i2 = 0;
        UniqueStage uniqueStage = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        Long l = null;
        Long l2 = null;
        while (z) {
            int o = b.o(serialDescriptor);
            switch (o) {
                case -1:
                    z = false;
                    break;
                case 0:
                    uniqueStage = (UniqueStage) b.i(serialDescriptor, 0, UniqueStage$$serializer.INSTANCE, uniqueStage);
                    i |= 1;
                    break;
                case 1:
                    str = b.n(serialDescriptor, 1);
                    i |= 2;
                    break;
                case 2:
                    str2 = (String) b.i(serialDescriptor, 2, uhi.a, str2);
                    i |= 4;
                    break;
                case 3:
                    str3 = (String) b.i(serialDescriptor, 3, uhi.a, str3);
                    i |= 8;
                    break;
                case 4:
                    i2 = b.l(serialDescriptor, 4);
                    i |= 16;
                    break;
                case 5:
                    l = (Long) b.i(serialDescriptor, 5, lkb.a, l);
                    i |= 32;
                    break;
                case 6:
                    l2 = (Long) b.i(serialDescriptor, 6, lkb.a, l2);
                    i |= 64;
                    break;
                default:
                    yhk.e(o);
                    return null;
            }
        }
        b.c(serialDescriptor);
        return new StageSeason(i, uniqueStage, str, str2, str3, i2, l, l2, null);
    }

    @Override // defpackage.dy4
    @NotNull
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(@NotNull Encoder encoder, @NotNull StageSeason value) {
        encoder.getClass();
        value.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        wf3 b = encoder.b(serialDescriptor);
        StageSeason.write$Self$model_release(value, b, serialDescriptor);
        b.c(serialDescriptor);
    }

    @Override // defpackage.iw8
    @NotNull
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return z8e.e;
    }
}
