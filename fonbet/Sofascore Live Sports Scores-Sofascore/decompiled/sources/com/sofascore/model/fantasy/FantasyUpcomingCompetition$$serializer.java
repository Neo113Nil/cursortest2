package com.sofascore.model.fantasy;

import com.ironsource.U3;
import com.sofascore.model.mvvm.model.Category;
import com.sofascore.model.mvvm.model.Category$$serializer;
import defpackage.a7a;
import defpackage.dy4;
import defpackage.gz1;
import defpackage.iw8;
import defpackage.joa;
import defpackage.l98;
import defpackage.t5h;
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
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/sofascore/model/fantasy/FantasyUpcomingCompetition.$serializer", "Liw8;", "Lcom/sofascore/model/fantasy/FantasyUpcomingCompetition;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", U3.i.X, "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/sofascore/model/fantasy/FantasyUpcomingCompetition;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/sofascore/model/fantasy/FantasyUpcomingCompetition;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
@wx4
/* loaded from: classes5.dex */
public final /* synthetic */ class FantasyUpcomingCompetition$$serializer implements iw8 {

    @NotNull
    public static final FantasyUpcomingCompetition$$serializer INSTANCE;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        FantasyUpcomingCompetition$$serializer fantasyUpcomingCompetition$$serializer = new FantasyUpcomingCompetition$$serializer();
        INSTANCE = fantasyUpcomingCompetition$$serializer;
        uye uyeVar = new uye("com.sofascore.model.fantasy.FantasyUpcomingCompetition", fantasyUpcomingCompetition$$serializer, 8);
        uyeVar.j("id", false);
        uyeVar.j("type", true);
        uyeVar.j("name", false);
        uyeVar.j("uniqueTournamentId", false);
        uyeVar.j("category", false);
        uyeVar.j("countries", false);
        uyeVar.j("isAlpha", false);
        uyeVar.j("isOfficial", false);
        descriptor = uyeVar;
    }

    private FantasyUpcomingCompetition$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.iw8
    @NotNull
    public final KSerializer[] childSerializers() {
        joa[] joaVarArr;
        joaVarArr = FantasyUpcomingCompetition.$childSerializers;
        a7a a7aVar = a7a.a;
        gz1 gz1Var = gz1.a;
        return new KSerializer[]{a7aVar, joaVarArr[1].getValue(), uhi.a, l98.W(a7aVar), Category$$serializer.INSTANCE, l98.W((KSerializer) joaVarArr[5].getValue()), gz1Var, gz1Var};
    }

    @Override // defpackage.dy4
    @NotNull
    public final FantasyUpcomingCompetition deserialize(@NotNull Decoder decoder) {
        joa[] joaVarArr;
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        uf3 b = decoder.b(serialDescriptor);
        joaVarArr = FantasyUpcomingCompetition.$childSerializers;
        FantasyUpcomingCompetition fantasyUpcomingCompetition = null;
        boolean z = true;
        int i = 0;
        int i2 = 0;
        boolean z2 = false;
        boolean z3 = false;
        FantasyCompetitionType fantasyCompetitionType = null;
        String str = null;
        Integer num = null;
        Category category = null;
        List list = null;
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
                    fantasyCompetitionType = (FantasyCompetitionType) b.w(serialDescriptor, 1, (dy4) joaVarArr[1].getValue(), fantasyCompetitionType);
                    i |= 2;
                    break;
                case 2:
                    str = b.n(serialDescriptor, 2);
                    i |= 4;
                    break;
                case 3:
                    num = (Integer) b.i(serialDescriptor, 3, a7a.a, num);
                    i |= 8;
                    break;
                case 4:
                    category = (Category) b.w(serialDescriptor, 4, Category$$serializer.INSTANCE, category);
                    i |= 16;
                    break;
                case 5:
                    list = (List) b.i(serialDescriptor, 5, (dy4) joaVarArr[5].getValue(), list);
                    i |= 32;
                    break;
                case 6:
                    z2 = b.B(serialDescriptor, 6);
                    i |= 64;
                    continue;
                case 7:
                    z3 = b.B(serialDescriptor, 7);
                    i |= 128;
                    continue;
                default:
                    yhk.e(o);
                    return fantasyUpcomingCompetition;
            }
            fantasyUpcomingCompetition = null;
        }
        b.c(serialDescriptor);
        return new FantasyUpcomingCompetition(i, i2, fantasyCompetitionType, str, num, category, list, z2, z3, (t5h) null);
    }

    @Override // defpackage.dy4
    @NotNull
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(@NotNull Encoder encoder, @NotNull FantasyUpcomingCompetition value) {
        encoder.getClass();
        value.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        wf3 b = encoder.b(serialDescriptor);
        FantasyUpcomingCompetition.write$Self$model_release(value, b, serialDescriptor);
        b.c(serialDescriptor);
    }

    @Override // defpackage.iw8
    @NotNull
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return z8e.e;
    }
}
