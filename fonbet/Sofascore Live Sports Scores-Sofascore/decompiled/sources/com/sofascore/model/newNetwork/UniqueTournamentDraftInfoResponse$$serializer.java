package com.sofascore.model.newNetwork;

import com.ironsource.U3;
import defpackage.gz1;
import defpackage.iw8;
import defpackage.l98;
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
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/sofascore/model/newNetwork/UniqueTournamentDraftInfoResponse.$serializer", "Liw8;", "Lcom/sofascore/model/newNetwork/UniqueTournamentDraftInfoResponse;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", U3.i.X, "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/sofascore/model/newNetwork/UniqueTournamentDraftInfoResponse;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/sofascore/model/newNetwork/UniqueTournamentDraftInfoResponse;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
@wx4
/* loaded from: classes5.dex */
public final /* synthetic */ class UniqueTournamentDraftInfoResponse$$serializer implements iw8 {

    @NotNull
    public static final UniqueTournamentDraftInfoResponse$$serializer INSTANCE;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        UniqueTournamentDraftInfoResponse$$serializer uniqueTournamentDraftInfoResponse$$serializer = new UniqueTournamentDraftInfoResponse$$serializer();
        INSTANCE = uniqueTournamentDraftInfoResponse$$serializer;
        uye uyeVar = new uye("com.sofascore.model.newNetwork.UniqueTournamentDraftInfoResponse", uniqueTournamentDraftInfoResponse$$serializer, 5);
        uyeVar.j("lotteryYear", false);
        uyeVar.j("prospectsYear", false);
        uyeVar.j("draft", false);
        uyeVar.j("previousDraft", false);
        uyeVar.j("hasLotteryDraw", true);
        descriptor = uyeVar;
    }

    private UniqueTournamentDraftInfoResponse$$serializer() {
    }

    @Override // defpackage.iw8
    @NotNull
    public final KSerializer[] childSerializers() {
        uhi uhiVar = uhi.a;
        KSerializer W = l98.W(uhiVar);
        KSerializer W2 = l98.W(uhiVar);
        UniqueTournamentDraftYear$$serializer uniqueTournamentDraftYear$$serializer = UniqueTournamentDraftYear$$serializer.INSTANCE;
        return new KSerializer[]{W, W2, l98.W(uniqueTournamentDraftYear$$serializer), l98.W(uniqueTournamentDraftYear$$serializer), gz1.a};
    }

    @Override // defpackage.dy4
    @NotNull
    public final UniqueTournamentDraftInfoResponse deserialize(@NotNull Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        uf3 b = decoder.b(serialDescriptor);
        boolean z = true;
        int i = 0;
        boolean z2 = false;
        String str = null;
        String str2 = null;
        UniqueTournamentDraftYear uniqueTournamentDraftYear = null;
        UniqueTournamentDraftYear uniqueTournamentDraftYear2 = null;
        while (z) {
            int o = b.o(serialDescriptor);
            if (o == -1) {
                z = false;
            } else if (o == 0) {
                str = (String) b.i(serialDescriptor, 0, uhi.a, str);
                i |= 1;
            } else if (o == 1) {
                str2 = (String) b.i(serialDescriptor, 1, uhi.a, str2);
                i |= 2;
            } else if (o == 2) {
                uniqueTournamentDraftYear = (UniqueTournamentDraftYear) b.i(serialDescriptor, 2, UniqueTournamentDraftYear$$serializer.INSTANCE, uniqueTournamentDraftYear);
                i |= 4;
            } else if (o == 3) {
                uniqueTournamentDraftYear2 = (UniqueTournamentDraftYear) b.i(serialDescriptor, 3, UniqueTournamentDraftYear$$serializer.INSTANCE, uniqueTournamentDraftYear2);
                i |= 8;
            } else {
                if (o != 4) {
                    yhk.e(o);
                    return null;
                }
                z2 = b.B(serialDescriptor, 4);
                i |= 16;
            }
        }
        b.c(serialDescriptor);
        return new UniqueTournamentDraftInfoResponse(i, str, str2, uniqueTournamentDraftYear, uniqueTournamentDraftYear2, z2, (t5h) null);
    }

    @Override // defpackage.dy4
    @NotNull
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(@NotNull Encoder encoder, @NotNull UniqueTournamentDraftInfoResponse value) {
        encoder.getClass();
        value.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        wf3 b = encoder.b(serialDescriptor);
        UniqueTournamentDraftInfoResponse.write$Self$model_release(value, b, serialDescriptor);
        b.c(serialDescriptor);
    }

    @Override // defpackage.iw8
    @NotNull
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return z8e.e;
    }
}
