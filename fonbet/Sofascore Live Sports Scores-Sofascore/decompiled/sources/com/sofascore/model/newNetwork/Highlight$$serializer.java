package com.sofascore.model.newNetwork;

import androidx.core.app.NotificationCompat;
import com.ironsource.U3;
import com.ironsource.mediationsdk.metadata.a;
import defpackage.a7a;
import defpackage.dy4;
import defpackage.gz1;
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
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/sofascore/model/newNetwork/Highlight.$serializer", "Liw8;", "Lcom/sofascore/model/newNetwork/Highlight;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", U3.i.X, "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/sofascore/model/newNetwork/Highlight;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/sofascore/model/newNetwork/Highlight;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
@wx4
/* loaded from: classes5.dex */
public final /* synthetic */ class Highlight$$serializer implements iw8 {

    @NotNull
    public static final Highlight$$serializer INSTANCE;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        Highlight$$serializer highlight$$serializer = new Highlight$$serializer();
        INSTANCE = highlight$$serializer;
        uye uyeVar = new uye("com.sofascore.model.newNetwork.Highlight", highlight$$serializer, 14);
        uyeVar.j("id", false);
        uyeVar.j("title", false);
        uyeVar.j("subtitle", false);
        uyeVar.j("thumbnailUrl", false);
        uyeVar.j("url", false);
        uyeVar.j("mediaType", false);
        uyeVar.j("keyHighlight", false);
        uyeVar.j("forCountries", false);
        uyeVar.j("createdAtTimestamp", false);
        uyeVar.j("sourceUrl", false);
        uyeVar.j("livestream", false);
        uyeVar.j("directStreamUrl", true);
        uyeVar.j("videoUrl", true);
        uyeVar.j("watched", true);
        descriptor = uyeVar;
    }

    private Highlight$$serializer() {
    }

    @Override // defpackage.iw8
    @NotNull
    public final KSerializer[] childSerializers() {
        joa[] joaVarArr;
        joaVarArr = Highlight.$childSerializers;
        uhi uhiVar = uhi.a;
        KSerializer W = l98.W(uhiVar);
        gz1 gz1Var = gz1.a;
        KSerializer W2 = l98.W((KSerializer) joaVarArr[7].getValue());
        KSerializer W3 = l98.W(gz1Var);
        KSerializer W4 = l98.W(uhiVar);
        a7a a7aVar = a7a.a;
        return new KSerializer[]{a7aVar, uhiVar, uhiVar, W, uhiVar, a7aVar, gz1Var, W2, lkb.a, uhiVar, W3, W4, uhiVar, gz1Var};
    }

    @Override // defpackage.dy4
    @NotNull
    public final Highlight deserialize(@NotNull Decoder decoder) {
        joa[] joaVarArr;
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        uf3 b = decoder.b(serialDescriptor);
        joaVarArr = Highlight.$childSerializers;
        long j = 0;
        String str = null;
        boolean z = true;
        List list = null;
        Boolean bool = null;
        int i = 0;
        int i2 = 0;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        int i3 = 0;
        boolean z2 = false;
        String str6 = null;
        String str7 = null;
        boolean z3 = false;
        while (z) {
            int o = b.o(serialDescriptor);
            switch (o) {
                case -1:
                    z = false;
                    break;
                case 0:
                    i2 = b.l(serialDescriptor, 0);
                    i |= 1;
                    break;
                case 1:
                    str2 = b.n(serialDescriptor, 1);
                    i |= 2;
                    break;
                case 2:
                    str3 = b.n(serialDescriptor, 2);
                    i |= 4;
                    break;
                case 3:
                    str4 = (String) b.i(serialDescriptor, 3, uhi.a, str4);
                    i |= 8;
                    break;
                case 4:
                    str5 = b.n(serialDescriptor, 4);
                    i |= 16;
                    break;
                case 5:
                    i3 = b.l(serialDescriptor, 5);
                    i |= 32;
                    break;
                case 6:
                    z2 = b.B(serialDescriptor, 6);
                    i |= 64;
                    break;
                case 7:
                    list = (List) b.i(serialDescriptor, 7, (dy4) joaVarArr[7].getValue(), list);
                    i |= 128;
                    break;
                case 8:
                    j = b.g(serialDescriptor, 8);
                    i |= NotificationCompat.FLAG_LOCAL_ONLY;
                    break;
                case 9:
                    str6 = b.n(serialDescriptor, 9);
                    i |= 512;
                    break;
                case 10:
                    bool = (Boolean) b.i(serialDescriptor, 10, gz1.a, bool);
                    i |= 1024;
                    break;
                case 11:
                    str = (String) b.i(serialDescriptor, 11, uhi.a, str);
                    i |= a.o;
                    break;
                case 12:
                    str7 = b.n(serialDescriptor, 12);
                    i |= 4096;
                    break;
                case 13:
                    z3 = b.B(serialDescriptor, 13);
                    i |= 8192;
                    break;
                default:
                    yhk.e(o);
                    return null;
            }
        }
        b.c(serialDescriptor);
        return new Highlight(i, i2, str2, str3, str4, str5, i3, z2, list, j, str6, bool, str, str7, z3, null);
    }

    @Override // defpackage.dy4
    @NotNull
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(@NotNull Encoder encoder, @NotNull Highlight value) {
        encoder.getClass();
        value.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        wf3 b = encoder.b(serialDescriptor);
        Highlight.write$Self$model_release(value, b, serialDescriptor);
        b.c(serialDescriptor);
    }

    @Override // defpackage.iw8
    @NotNull
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return z8e.e;
    }
}
