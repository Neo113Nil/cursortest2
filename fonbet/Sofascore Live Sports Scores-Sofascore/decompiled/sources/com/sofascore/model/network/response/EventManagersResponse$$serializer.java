package com.sofascore.model.network.response;

import com.ironsource.U3;
import com.sofascore.model.mvvm.model.Manager;
import com.sofascore.model.mvvm.model.Manager$$serializer;
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
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/sofascore/model/network/response/EventManagersResponse.$serializer", "Liw8;", "Lcom/sofascore/model/network/response/EventManagersResponse;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", U3.i.X, "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/sofascore/model/network/response/EventManagersResponse;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/sofascore/model/network/response/EventManagersResponse;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
@wx4
/* loaded from: classes5.dex */
public final /* synthetic */ class EventManagersResponse$$serializer implements iw8 {

    @NotNull
    public static final EventManagersResponse$$serializer INSTANCE;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        EventManagersResponse$$serializer eventManagersResponse$$serializer = new EventManagersResponse$$serializer();
        INSTANCE = eventManagersResponse$$serializer;
        uye uyeVar = new uye("com.sofascore.model.network.response.EventManagersResponse", eventManagersResponse$$serializer, 7);
        uyeVar.j("head", true);
        uyeVar.j("error", true);
        uyeVar.j("homeManager", false);
        uyeVar.j("awayManager", false);
        uyeVar.j("homeManagerName", false);
        uyeVar.j("awayManagerName", false);
        uyeVar.j("shouldReverseTeams", true);
        descriptor = uyeVar;
    }

    private EventManagersResponse$$serializer() {
    }

    @Override // defpackage.iw8
    @NotNull
    public final KSerializer[] childSerializers() {
        HeadResponse$$serializer headResponse$$serializer = HeadResponse$$serializer.INSTANCE;
        KSerializer W = l98.W(headResponse$$serializer);
        KSerializer W2 = l98.W(headResponse$$serializer);
        Manager$$serializer manager$$serializer = Manager$$serializer.INSTANCE;
        KSerializer W3 = l98.W(manager$$serializer);
        KSerializer W4 = l98.W(manager$$serializer);
        uhi uhiVar = uhi.a;
        return new KSerializer[]{W, W2, W3, W4, l98.W(uhiVar), l98.W(uhiVar), gz1.a};
    }

    @Override // defpackage.dy4
    @NotNull
    public final EventManagersResponse deserialize(@NotNull Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        uf3 b = decoder.b(serialDescriptor);
        boolean z = true;
        int i = 0;
        boolean z2 = false;
        HeadResponse headResponse = null;
        HeadResponse headResponse2 = null;
        Manager manager = null;
        Manager manager2 = null;
        String str = null;
        String str2 = null;
        while (z) {
            int o = b.o(serialDescriptor);
            switch (o) {
                case -1:
                    z = false;
                    break;
                case 0:
                    headResponse = (HeadResponse) b.i(serialDescriptor, 0, HeadResponse$$serializer.INSTANCE, headResponse);
                    i |= 1;
                    break;
                case 1:
                    headResponse2 = (HeadResponse) b.i(serialDescriptor, 1, HeadResponse$$serializer.INSTANCE, headResponse2);
                    i |= 2;
                    break;
                case 2:
                    manager = (Manager) b.i(serialDescriptor, 2, Manager$$serializer.INSTANCE, manager);
                    i |= 4;
                    break;
                case 3:
                    manager2 = (Manager) b.i(serialDescriptor, 3, Manager$$serializer.INSTANCE, manager2);
                    i |= 8;
                    break;
                case 4:
                    str = (String) b.i(serialDescriptor, 4, uhi.a, str);
                    i |= 16;
                    break;
                case 5:
                    str2 = (String) b.i(serialDescriptor, 5, uhi.a, str2);
                    i |= 32;
                    break;
                case 6:
                    z2 = b.B(serialDescriptor, 6);
                    i |= 64;
                    break;
                default:
                    yhk.e(o);
                    return null;
            }
        }
        b.c(serialDescriptor);
        return new EventManagersResponse(i, headResponse, headResponse2, manager, manager2, str, str2, z2, null);
    }

    @Override // defpackage.dy4
    @NotNull
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(@NotNull Encoder encoder, @NotNull EventManagersResponse value) {
        encoder.getClass();
        value.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        wf3 b = encoder.b(serialDescriptor);
        EventManagersResponse.write$Self$model_release(value, b, serialDescriptor);
        b.c(serialDescriptor);
    }

    @Override // defpackage.iw8
    @NotNull
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return z8e.e;
    }
}
