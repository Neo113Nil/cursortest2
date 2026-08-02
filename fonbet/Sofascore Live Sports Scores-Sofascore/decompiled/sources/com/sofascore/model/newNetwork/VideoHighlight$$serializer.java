package com.sofascore.model.newNetwork;

import com.ironsource.U3;
import defpackage.a7a;
import defpackage.gz1;
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
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/sofascore/model/newNetwork/VideoHighlight.$serializer", "Liw8;", "Lcom/sofascore/model/newNetwork/VideoHighlight;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", U3.i.X, "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/sofascore/model/newNetwork/VideoHighlight;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/sofascore/model/newNetwork/VideoHighlight;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
@wx4
/* loaded from: classes5.dex */
public final /* synthetic */ class VideoHighlight$$serializer implements iw8 {

    @NotNull
    public static final VideoHighlight$$serializer INSTANCE;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        VideoHighlight$$serializer videoHighlight$$serializer = new VideoHighlight$$serializer();
        INSTANCE = videoHighlight$$serializer;
        uye uyeVar = new uye("com.sofascore.model.newNetwork.VideoHighlight", videoHighlight$$serializer, 8);
        uyeVar.j("id", false);
        uyeVar.j("url", false);
        uyeVar.j("title", false);
        uyeVar.j("description", false);
        uyeVar.j("embeddable", false);
        uyeVar.j("thumbnailUrl", false);
        uyeVar.j("subtitle", true);
        uyeVar.j("videoUrl", true);
        descriptor = uyeVar;
    }

    private VideoHighlight$$serializer() {
    }

    @Override // defpackage.iw8
    @NotNull
    public final KSerializer[] childSerializers() {
        uhi uhiVar = uhi.a;
        return new KSerializer[]{a7a.a, uhiVar, l98.W(uhiVar), l98.W(uhiVar), l98.W(gz1.a), l98.W(uhiVar), l98.W(uhiVar), uhiVar};
    }

    @Override // defpackage.dy4
    @NotNull
    public final VideoHighlight deserialize(@NotNull Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        uf3 b = decoder.b(serialDescriptor);
        VideoHighlight videoHighlight = null;
        boolean z = true;
        int i = 0;
        int i2 = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        Boolean bool = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
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
                    str2 = (String) b.i(serialDescriptor, 2, uhi.a, str2);
                    i |= 4;
                    break;
                case 3:
                    str3 = (String) b.i(serialDescriptor, 3, uhi.a, str3);
                    i |= 8;
                    break;
                case 4:
                    bool = (Boolean) b.i(serialDescriptor, 4, gz1.a, bool);
                    i |= 16;
                    break;
                case 5:
                    str4 = (String) b.i(serialDescriptor, 5, uhi.a, str4);
                    i |= 32;
                    break;
                case 6:
                    str5 = (String) b.i(serialDescriptor, 6, uhi.a, str5);
                    i |= 64;
                    break;
                case 7:
                    str6 = b.n(serialDescriptor, 7);
                    i |= 128;
                    continue;
                default:
                    yhk.e(o);
                    return videoHighlight;
            }
            videoHighlight = null;
        }
        b.c(serialDescriptor);
        return new VideoHighlight(i, i2, str, str2, str3, bool, str4, str5, str6, null);
    }

    @Override // defpackage.dy4
    @NotNull
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(@NotNull Encoder encoder, @NotNull VideoHighlight value) {
        encoder.getClass();
        value.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        wf3 b = encoder.b(serialDescriptor);
        VideoHighlight.write$Self$model_release(value, b, serialDescriptor);
        b.c(serialDescriptor);
    }

    @Override // defpackage.iw8
    @NotNull
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return z8e.e;
    }
}
