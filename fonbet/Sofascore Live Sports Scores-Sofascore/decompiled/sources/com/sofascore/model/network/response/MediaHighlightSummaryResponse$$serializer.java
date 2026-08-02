package com.sofascore.model.network.response;

import com.ironsource.U3;
import com.sofascore.model.network.response.serializers.MediaHighlightedItemSerializer;
import defpackage.a7a;
import defpackage.dy4;
import defpackage.iw8;
import defpackage.joa;
import defpackage.l98;
import defpackage.uf3;
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
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/sofascore/model/network/response/MediaHighlightSummaryResponse.$serializer", "Liw8;", "Lcom/sofascore/model/network/response/MediaHighlightSummaryResponse;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", U3.i.X, "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/sofascore/model/network/response/MediaHighlightSummaryResponse;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/sofascore/model/network/response/MediaHighlightSummaryResponse;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
@wx4
/* loaded from: classes5.dex */
public final /* synthetic */ class MediaHighlightSummaryResponse$$serializer implements iw8 {

    @NotNull
    public static final MediaHighlightSummaryResponse$$serializer INSTANCE;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        MediaHighlightSummaryResponse$$serializer mediaHighlightSummaryResponse$$serializer = new MediaHighlightSummaryResponse$$serializer();
        INSTANCE = mediaHighlightSummaryResponse$$serializer;
        uye uyeVar = new uye("com.sofascore.model.network.response.MediaHighlightSummaryResponse", mediaHighlightSummaryResponse$$serializer, 3);
        uyeVar.j("highlightedItem", false);
        uyeVar.j("mediaItems", false);
        uyeVar.j("itemsCount", false);
        descriptor = uyeVar;
    }

    private MediaHighlightSummaryResponse$$serializer() {
    }

    @Override // defpackage.iw8
    @NotNull
    public final KSerializer[] childSerializers() {
        joa[] joaVarArr;
        joaVarArr = MediaHighlightSummaryResponse.$childSerializers;
        return new KSerializer[]{l98.W(MediaHighlightedItemSerializer.INSTANCE), l98.W((KSerializer) joaVarArr[1].getValue()), l98.W(a7a.a)};
    }

    @Override // defpackage.dy4
    @NotNull
    public final MediaHighlightSummaryResponse deserialize(@NotNull Decoder decoder) {
        joa[] joaVarArr;
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        uf3 b = decoder.b(serialDescriptor);
        joaVarArr = MediaHighlightSummaryResponse.$childSerializers;
        boolean z = true;
        int i = 0;
        MediaHighlightedItem mediaHighlightedItem = null;
        List list = null;
        Integer num = null;
        while (z) {
            int o = b.o(serialDescriptor);
            if (o == -1) {
                z = false;
            } else if (o == 0) {
                mediaHighlightedItem = (MediaHighlightedItem) b.i(serialDescriptor, 0, MediaHighlightedItemSerializer.INSTANCE, mediaHighlightedItem);
                i |= 1;
            } else if (o == 1) {
                list = (List) b.i(serialDescriptor, 1, (dy4) joaVarArr[1].getValue(), list);
                i |= 2;
            } else {
                if (o != 2) {
                    yhk.e(o);
                    return null;
                }
                num = (Integer) b.i(serialDescriptor, 2, a7a.a, num);
                i |= 4;
            }
        }
        b.c(serialDescriptor);
        return new MediaHighlightSummaryResponse(i, mediaHighlightedItem, list, num, null);
    }

    @Override // defpackage.dy4
    @NotNull
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(@NotNull Encoder encoder, @NotNull MediaHighlightSummaryResponse value) {
        encoder.getClass();
        value.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        wf3 b = encoder.b(serialDescriptor);
        MediaHighlightSummaryResponse.write$Self$model_release(value, b, serialDescriptor);
        b.c(serialDescriptor);
    }

    @Override // defpackage.iw8
    @NotNull
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return z8e.e;
    }
}
