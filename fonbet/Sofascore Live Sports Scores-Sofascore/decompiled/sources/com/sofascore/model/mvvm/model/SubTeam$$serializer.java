package com.sofascore.model.mvvm.model;

import androidx.core.app.NotificationCompat;
import com.ironsource.U3;
import com.ironsource.Y1;
import defpackage.a7a;
import defpackage.gz1;
import defpackage.iw8;
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
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/sofascore/model/mvvm/model/SubTeam.$serializer", "Liw8;", "Lcom/sofascore/model/mvvm/model/SubTeam;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", U3.i.X, "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/sofascore/model/mvvm/model/SubTeam;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/sofascore/model/mvvm/model/SubTeam;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
@wx4
/* loaded from: classes5.dex */
public final /* synthetic */ class SubTeam$$serializer implements iw8 {

    @NotNull
    public static final SubTeam$$serializer INSTANCE;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        SubTeam$$serializer subTeam$$serializer = new SubTeam$$serializer();
        INSTANCE = subTeam$$serializer;
        uye uyeVar = new uye("com.sofascore.model.mvvm.model.SubTeam", subTeam$$serializer, 10);
        uyeVar.j("id", false);
        uyeVar.j("name", false);
        uyeVar.j("slug", false);
        uyeVar.j("userCount", false);
        uyeVar.j("type", false);
        uyeVar.j(Y1.e, true);
        uyeVar.j("national", false);
        uyeVar.j("shortName", false);
        uyeVar.j("country", false);
        uyeVar.j("fieldTranslations", false);
        descriptor = uyeVar;
    }

    private SubTeam$$serializer() {
    }

    @Override // defpackage.iw8
    @NotNull
    public final KSerializer[] childSerializers() {
        uhi uhiVar = uhi.a;
        KSerializer W = l98.W(uhiVar);
        KSerializer W2 = l98.W(uhiVar);
        KSerializer W3 = l98.W(Country$$serializer.INSTANCE);
        KSerializer W4 = l98.W(FieldTranslations$$serializer.INSTANCE);
        a7a a7aVar = a7a.a;
        gz1 gz1Var = gz1.a;
        return new KSerializer[]{a7aVar, W, uhiVar, lkb.a, a7aVar, gz1Var, gz1Var, W2, W3, W4};
    }

    @Override // defpackage.dy4
    @NotNull
    public final SubTeam deserialize(@NotNull Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        uf3 b = decoder.b(serialDescriptor);
        long j = 0;
        FieldTranslations fieldTranslations = null;
        boolean z = true;
        String str = null;
        Country country = null;
        int i = 0;
        int i2 = 0;
        String str2 = null;
        String str3 = null;
        int i3 = 0;
        boolean z2 = false;
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
                    str2 = (String) b.i(serialDescriptor, 1, uhi.a, str2);
                    i |= 2;
                    break;
                case 2:
                    str3 = b.n(serialDescriptor, 2);
                    i |= 4;
                    break;
                case 3:
                    j = b.g(serialDescriptor, 3);
                    i |= 8;
                    break;
                case 4:
                    i3 = b.l(serialDescriptor, 4);
                    i |= 16;
                    break;
                case 5:
                    z2 = b.B(serialDescriptor, 5);
                    i |= 32;
                    break;
                case 6:
                    z3 = b.B(serialDescriptor, 6);
                    i |= 64;
                    break;
                case 7:
                    str = (String) b.i(serialDescriptor, 7, uhi.a, str);
                    i |= 128;
                    break;
                case 8:
                    country = (Country) b.i(serialDescriptor, 8, Country$$serializer.INSTANCE, country);
                    i |= NotificationCompat.FLAG_LOCAL_ONLY;
                    break;
                case 9:
                    fieldTranslations = (FieldTranslations) b.i(serialDescriptor, 9, FieldTranslations$$serializer.INSTANCE, fieldTranslations);
                    i |= 512;
                    break;
                default:
                    yhk.e(o);
                    return null;
            }
        }
        b.c(serialDescriptor);
        return new SubTeam(i, i2, str2, str3, j, i3, z2, z3, str, country, fieldTranslations, (t5h) null);
    }

    @Override // defpackage.dy4
    @NotNull
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(@NotNull Encoder encoder, @NotNull SubTeam value) {
        encoder.getClass();
        value.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        wf3 b = encoder.b(serialDescriptor);
        SubTeam.write$Self$model_release(value, b, serialDescriptor);
        b.c(serialDescriptor);
    }

    @Override // defpackage.iw8
    @NotNull
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return z8e.e;
    }
}
