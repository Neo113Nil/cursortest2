package com.sofascore.model.cuptree;

import androidx.core.app.NotificationCompat;
import com.ironsource.C4227o2;
import com.ironsource.U3;
import com.ironsource.mediationsdk.metadata.a;
import com.sofascore.model.mvvm.model.StatusKt;
import com.sofascore.model.mvvm.model.Venue;
import com.sofascore.model.mvvm.model.Venue$$serializer;
import defpackage.a7a;
import defpackage.dy4;
import defpackage.gz1;
import defpackage.iw8;
import defpackage.joa;
import defpackage.l98;
import defpackage.lkb;
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
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/sofascore/model/cuptree/CupTreeBlock.$serializer", "Liw8;", "Lcom/sofascore/model/cuptree/CupTreeBlock;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", U3.i.X, "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/sofascore/model/cuptree/CupTreeBlock;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/sofascore/model/cuptree/CupTreeBlock;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
@wx4
/* loaded from: classes5.dex */
public final /* synthetic */ class CupTreeBlock$$serializer implements iw8 {

    @NotNull
    public static final CupTreeBlock$$serializer INSTANCE;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        CupTreeBlock$$serializer cupTreeBlock$$serializer = new CupTreeBlock$$serializer();
        INSTANCE = cupTreeBlock$$serializer;
        uye uyeVar = new uye("com.sofascore.model.cuptree.CupTreeBlock", cupTreeBlock$$serializer, 14);
        uyeVar.j("blockId", false);
        uyeVar.j(C4227o2.u, true);
        uyeVar.j(StatusKt.STATUS_FINISHED, true);
        uyeVar.j("hasNextRoundLink", false);
        uyeVar.j("eventInProgress", true);
        uyeVar.j("result", false);
        uyeVar.j("homeTeamScore", false);
        uyeVar.j("awayTeamScore", false);
        uyeVar.j("participants", false);
        uyeVar.j("events", false);
        uyeVar.j("blocksNotGrouped", true);
        uyeVar.j("seriesStartDateTimestamp", true);
        uyeVar.j("automaticProgression", false);
        uyeVar.j("venue", false);
        descriptor = uyeVar;
    }

    private CupTreeBlock$$serializer() {
    }

    @Override // defpackage.iw8
    @NotNull
    public final KSerializer[] childSerializers() {
        joa[] joaVarArr;
        joaVarArr = CupTreeBlock.$childSerializers;
        gz1 gz1Var = gz1.a;
        KSerializer W = l98.W(gz1Var);
        uhi uhiVar = uhi.a;
        KSerializer W2 = l98.W(uhiVar);
        KSerializer W3 = l98.W(uhiVar);
        KSerializer W4 = l98.W(uhiVar);
        KSerializer W5 = l98.W((KSerializer) joaVarArr[8].getValue());
        KSerializer W6 = l98.W((KSerializer) joaVarArr[9].getValue());
        KSerializer W7 = l98.W(Venue$$serializer.INSTANCE);
        a7a a7aVar = a7a.a;
        return new KSerializer[]{a7aVar, a7aVar, gz1Var, W, gz1Var, W2, W3, W4, W5, W6, gz1Var, lkb.a, gz1Var, W7};
    }

    @Override // defpackage.dy4
    @NotNull
    public final CupTreeBlock deserialize(@NotNull Decoder decoder) {
        joa[] joaVarArr;
        joa[] joaVarArr2;
        boolean z;
        joa[] joaVarArr3;
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        uf3 b = decoder.b(serialDescriptor);
        joaVarArr = CupTreeBlock.$childSerializers;
        long j = 0;
        Venue venue = null;
        List list = null;
        List list2 = null;
        boolean z2 = true;
        String str = null;
        String str2 = null;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        boolean z3 = false;
        Boolean bool = null;
        boolean z4 = false;
        String str3 = null;
        boolean z5 = false;
        boolean z6 = false;
        while (z2) {
            int o = b.o(serialDescriptor);
            switch (o) {
                case -1:
                    z2 = false;
                case 0:
                    joaVarArr2 = joaVarArr;
                    z = z2;
                    i2 = b.l(serialDescriptor, 0);
                    i |= 1;
                    joaVarArr = joaVarArr2;
                    z2 = z;
                case 1:
                    joaVarArr3 = joaVarArr;
                    i3 = b.l(serialDescriptor, 1);
                    i |= 2;
                    joaVarArr = joaVarArr3;
                case 2:
                    joaVarArr3 = joaVarArr;
                    z3 = b.B(serialDescriptor, 2);
                    i |= 4;
                    joaVarArr = joaVarArr3;
                case 3:
                    joaVarArr2 = joaVarArr;
                    z = z2;
                    bool = (Boolean) b.i(serialDescriptor, 3, gz1.a, bool);
                    i |= 8;
                    joaVarArr = joaVarArr2;
                    z2 = z;
                case 4:
                    joaVarArr3 = joaVarArr;
                    z4 = b.B(serialDescriptor, 4);
                    i |= 16;
                    joaVarArr = joaVarArr3;
                case 5:
                    joaVarArr2 = joaVarArr;
                    z = z2;
                    str3 = (String) b.i(serialDescriptor, 5, uhi.a, str3);
                    i |= 32;
                    joaVarArr = joaVarArr2;
                    z2 = z;
                case 6:
                    joaVarArr2 = joaVarArr;
                    z = z2;
                    str = (String) b.i(serialDescriptor, 6, uhi.a, str);
                    i |= 64;
                    joaVarArr = joaVarArr2;
                    z2 = z;
                case 7:
                    joaVarArr2 = joaVarArr;
                    z = z2;
                    str2 = (String) b.i(serialDescriptor, 7, uhi.a, str2);
                    i |= 128;
                    joaVarArr = joaVarArr2;
                    z2 = z;
                case 8:
                    joaVarArr2 = joaVarArr;
                    z = z2;
                    list2 = (List) b.i(serialDescriptor, 8, (dy4) joaVarArr2[8].getValue(), list2);
                    i |= NotificationCompat.FLAG_LOCAL_ONLY;
                    joaVarArr = joaVarArr2;
                    z2 = z;
                case 9:
                    joaVarArr2 = joaVarArr;
                    z = z2;
                    list = (List) b.i(serialDescriptor, 9, (dy4) joaVarArr2[9].getValue(), list);
                    i |= 512;
                    joaVarArr = joaVarArr2;
                    z2 = z;
                case 10:
                    joaVarArr3 = joaVarArr;
                    z5 = b.B(serialDescriptor, 10);
                    i |= 1024;
                    joaVarArr = joaVarArr3;
                case 11:
                    joaVarArr3 = joaVarArr;
                    j = b.g(serialDescriptor, 11);
                    i |= a.o;
                    joaVarArr = joaVarArr3;
                case 12:
                    joaVarArr3 = joaVarArr;
                    z6 = b.B(serialDescriptor, 12);
                    i |= 4096;
                    joaVarArr = joaVarArr3;
                case 13:
                    joaVarArr2 = joaVarArr;
                    z = z2;
                    venue = (Venue) b.i(serialDescriptor, 13, Venue$$serializer.INSTANCE, venue);
                    i |= 8192;
                    joaVarArr = joaVarArr2;
                    z2 = z;
                default:
                    yhk.e(o);
                    return null;
            }
        }
        b.c(serialDescriptor);
        return new CupTreeBlock(i, i2, i3, z3, bool, z4, str3, str, str2, list2, list, z5, j, z6, venue, (t5h) null);
    }

    @Override // defpackage.dy4
    @NotNull
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(@NotNull Encoder encoder, @NotNull CupTreeBlock value) {
        encoder.getClass();
        value.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        wf3 b = encoder.b(serialDescriptor);
        CupTreeBlock.write$Self$model_release(value, b, serialDescriptor);
        b.c(serialDescriptor);
    }

    @Override // defpackage.iw8
    @NotNull
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return z8e.e;
    }
}
