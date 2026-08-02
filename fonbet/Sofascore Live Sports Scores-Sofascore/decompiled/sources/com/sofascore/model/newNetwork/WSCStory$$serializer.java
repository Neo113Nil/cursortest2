package com.sofascore.model.newNetwork;

import androidx.core.app.NotificationCompat;
import com.ironsource.U3;
import defpackage.dy4;
import defpackage.gz1;
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
import java.util.List;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/sofascore/model/newNetwork/WSCStory.$serializer", "Liw8;", "Lcom/sofascore/model/newNetwork/WSCStory;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", U3.i.X, "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/sofascore/model/newNetwork/WSCStory;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/sofascore/model/newNetwork/WSCStory;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
@wx4
/* loaded from: classes5.dex */
public final /* synthetic */ class WSCStory$$serializer implements iw8 {

    @NotNull
    public static final WSCStory$$serializer INSTANCE;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        WSCStory$$serializer wSCStory$$serializer = new WSCStory$$serializer();
        INSTANCE = wSCStory$$serializer;
        uye uyeVar = new uye("com.sofascore.model.newNetwork.WSCStory", wSCStory$$serializer, 11);
        uyeVar.j("id", false);
        uyeVar.j("title", false);
        uyeVar.j("sdkId", false);
        uyeVar.j("game", false);
        uyeVar.j("live", false);
        uyeVar.j("storyThumbnailUrl", false);
        uyeVar.j("storyThumbnailUrls", false);
        uyeVar.j("storyUrl", false);
        uyeVar.j("isImageBasedStory", false);
        uyeVar.j("type", false);
        uyeVar.j("thumbnailUrl", true);
        descriptor = uyeVar;
    }

    private WSCStory$$serializer() {
    }

    @Override // defpackage.iw8
    @NotNull
    public final KSerializer[] childSerializers() {
        joa[] joaVarArr;
        joaVarArr = WSCStory.$childSerializers;
        uhi uhiVar = uhi.a;
        KSerializer W = l98.W(WSCGameData$$serializer.INSTANCE);
        gz1 gz1Var = gz1.a;
        return new KSerializer[]{uhiVar, uhiVar, uhiVar, W, gz1Var, l98.W(uhiVar), l98.W((KSerializer) joaVarArr[6].getValue()), l98.W(uhiVar), l98.W(gz1Var), l98.W(uhiVar), uhiVar};
    }

    @Override // defpackage.dy4
    @NotNull
    public final WSCStory deserialize(@NotNull Decoder decoder) {
        joa[] joaVarArr;
        joa[] joaVarArr2;
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        uf3 b = decoder.b(serialDescriptor);
        joaVarArr = WSCStory.$childSerializers;
        String str = null;
        Boolean bool = null;
        boolean z = true;
        String str2 = null;
        int i = 0;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        WSCGameData wSCGameData = null;
        boolean z2 = false;
        String str6 = null;
        List list = null;
        String str7 = null;
        while (z) {
            int o = b.o(serialDescriptor);
            switch (o) {
                case -1:
                    joaVarArr2 = joaVarArr;
                    z = false;
                    break;
                case 0:
                    joaVarArr2 = joaVarArr;
                    str3 = b.n(serialDescriptor, 0);
                    i |= 1;
                    break;
                case 1:
                    joaVarArr2 = joaVarArr;
                    str4 = b.n(serialDescriptor, 1);
                    i |= 2;
                    break;
                case 2:
                    joaVarArr2 = joaVarArr;
                    str5 = b.n(serialDescriptor, 2);
                    i |= 4;
                    break;
                case 3:
                    joaVarArr2 = joaVarArr;
                    wSCGameData = (WSCGameData) b.i(serialDescriptor, 3, WSCGameData$$serializer.INSTANCE, wSCGameData);
                    i |= 8;
                    break;
                case 4:
                    joaVarArr2 = joaVarArr;
                    z2 = b.B(serialDescriptor, 4);
                    i |= 16;
                    break;
                case 5:
                    joaVarArr2 = joaVarArr;
                    str6 = (String) b.i(serialDescriptor, 5, uhi.a, str6);
                    i |= 32;
                    break;
                case 6:
                    joaVarArr2 = joaVarArr;
                    list = (List) b.i(serialDescriptor, 6, (dy4) joaVarArr2[6].getValue(), list);
                    i |= 64;
                    break;
                case 7:
                    joaVarArr2 = joaVarArr;
                    str2 = (String) b.i(serialDescriptor, 7, uhi.a, str2);
                    i |= 128;
                    break;
                case 8:
                    joaVarArr2 = joaVarArr;
                    bool = (Boolean) b.i(serialDescriptor, 8, gz1.a, bool);
                    i |= NotificationCompat.FLAG_LOCAL_ONLY;
                    break;
                case 9:
                    joaVarArr2 = joaVarArr;
                    str = (String) b.i(serialDescriptor, 9, uhi.a, str);
                    i |= 512;
                    break;
                case 10:
                    str7 = b.n(serialDescriptor, 10);
                    i |= 1024;
                    continue;
                default:
                    yhk.e(o);
                    return null;
            }
            joaVarArr = joaVarArr2;
        }
        b.c(serialDescriptor);
        return new WSCStory(i, str3, str4, str5, wSCGameData, z2, str6, list, str2, bool, str, str7, null);
    }

    @Override // defpackage.dy4
    @NotNull
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(@NotNull Encoder encoder, @NotNull WSCStory value) {
        encoder.getClass();
        value.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        wf3 b = encoder.b(serialDescriptor);
        WSCStory.write$Self$model_release(value, b, serialDescriptor);
        b.c(serialDescriptor);
    }

    @Override // defpackage.iw8
    @NotNull
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return z8e.e;
    }
}
