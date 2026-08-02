package com.vungle.ads.fpd;

import com.ironsource.U3;
import defpackage.iw8;
import defpackage.l98;
import defpackage.q79;
import defpackage.uf3;
import defpackage.uhi;
import defpackage.uye;
import defpackage.wf3;
import defpackage.wx4;
import defpackage.yhk;
import defpackage.z8e;
import java.util.Map;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u001a\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ \u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0014\u001a\u00020\u00118VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"com/vungle/ads/fpd/FirstPartyData.$serializer", "Liw8;", "Lcom/vungle/ads/fpd/FirstPartyData;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/vungle/ads/fpd/FirstPartyData;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", U3.i.X, "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/vungle/ads/fpd/FirstPartyData;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "vungle-ads_release"}, k = 1, mv = {1, 7, 1})
@wx4
/* loaded from: classes6.dex */
public final class FirstPartyData$$serializer implements iw8 {

    @NotNull
    public static final FirstPartyData$$serializer INSTANCE;
    public static final /* synthetic */ SerialDescriptor descriptor;

    static {
        FirstPartyData$$serializer firstPartyData$$serializer = new FirstPartyData$$serializer();
        INSTANCE = firstPartyData$$serializer;
        uye uyeVar = new uye("com.vungle.ads.fpd.FirstPartyData", firstPartyData$$serializer, 6);
        uyeVar.j("model_version", true);
        uyeVar.j("session_context", true);
        uyeVar.j("demographic", true);
        uyeVar.j("location", true);
        uyeVar.j("revenue", true);
        uyeVar.j("custom_data", true);
        descriptor = uyeVar;
    }

    @Override // defpackage.iw8
    @NotNull
    public KSerializer[] childSerializers() {
        uhi uhiVar = uhi.a;
        return new KSerializer[]{uhiVar, l98.W(SessionContext$$serializer.INSTANCE), l98.W(Demographic$$serializer.INSTANCE), l98.W(Location$$serializer.INSTANCE), l98.W(Revenue$$serializer.INSTANCE), l98.W(new q79(uhiVar, uhiVar, 1))};
    }

    @Override // defpackage.dy4
    @NotNull
    public FirstPartyData deserialize(@NotNull Decoder decoder) {
        decoder.getClass();
        SerialDescriptor descriptor2 = getDescriptor();
        uf3 b = decoder.b(descriptor2);
        boolean z = true;
        int i = 0;
        Object obj = null;
        String str = null;
        Object obj2 = null;
        Object obj3 = null;
        Object obj4 = null;
        Object obj5 = null;
        while (z) {
            int o = b.o(descriptor2);
            switch (o) {
                case -1:
                    z = false;
                    break;
                case 0:
                    str = b.n(descriptor2, 0);
                    i |= 1;
                    break;
                case 1:
                    obj = b.i(descriptor2, 1, SessionContext$$serializer.INSTANCE, obj);
                    i |= 2;
                    break;
                case 2:
                    obj2 = b.i(descriptor2, 2, Demographic$$serializer.INSTANCE, obj2);
                    i |= 4;
                    break;
                case 3:
                    obj3 = b.i(descriptor2, 3, Location$$serializer.INSTANCE, obj3);
                    i |= 8;
                    break;
                case 4:
                    obj4 = b.i(descriptor2, 4, Revenue$$serializer.INSTANCE, obj4);
                    i |= 16;
                    break;
                case 5:
                    uhi uhiVar = uhi.a;
                    obj5 = b.i(descriptor2, 5, new q79(uhiVar, uhiVar, 1), obj5);
                    i |= 32;
                    break;
                default:
                    yhk.e(o);
                    return null;
            }
        }
        b.c(descriptor2);
        return new FirstPartyData(i, str, (SessionContext) obj, (Demographic) obj2, (Location) obj3, (Revenue) obj4, (Map) obj5, null);
    }

    @Override // defpackage.dy4
    @NotNull
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public void serialize(@NotNull Encoder encoder, @NotNull FirstPartyData value) {
        encoder.getClass();
        value.getClass();
        SerialDescriptor descriptor2 = getDescriptor();
        wf3 b = encoder.b(descriptor2);
        FirstPartyData.write$Self(value, b, descriptor2);
        b.c(descriptor2);
    }

    @Override // defpackage.iw8
    @NotNull
    public KSerializer[] typeParametersSerializers() {
        return z8e.e;
    }
}
