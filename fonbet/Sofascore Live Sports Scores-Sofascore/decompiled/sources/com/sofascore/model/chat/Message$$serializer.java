package com.sofascore.model.chat;

import androidx.core.app.NotificationCompat;
import com.ironsource.L6;
import com.ironsource.U3;
import com.ironsource.mediationsdk.metadata.a;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
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
import java.util.Map;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/sofascore/model/chat/Message.$serializer", "Liw8;", "Lcom/sofascore/model/chat/Message;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", U3.i.X, "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/sofascore/model/chat/Message;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/sofascore/model/chat/Message;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
@wx4
/* loaded from: classes5.dex */
public final /* synthetic */ class Message$$serializer implements iw8 {

    @NotNull
    public static final Message$$serializer INSTANCE;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        Message$$serializer message$$serializer = new Message$$serializer();
        INSTANCE = message$$serializer;
        uye uyeVar = new uye("com.sofascore.model.chat.Message", message$$serializer, 25);
        uyeVar.j("text", false);
        uyeVar.j("user", false);
        uyeVar.j("timestamp", false);
        uyeVar.j("votes", true);
        uyeVar.j("reports", true);
        uyeVar.j("isAirCashMessage", true);
        uyeVar.j("id", true);
        uyeVar.j("image", true);
        uyeVar.j("unReportCount", true);
        uyeVar.j("parent", true);
        uyeVar.j("deletedParentMessage", true);
        uyeVar.j("countryFlag", true);
        uyeVar.j("type", true);
        uyeVar.j("isServer", true);
        uyeVar.j("isLinkify", true);
        uyeVar.j("isAd", true);
        uyeVar.j(L6.q, true);
        uyeVar.j("sanctioned", true);
        uyeVar.j("system", true);
        uyeVar.j("voted", true);
        uyeVar.j("deleted", true);
        uyeVar.j("reported", true);
        uyeVar.j("hiddenFor", true);
        uyeVar.j("visibleFor", true);
        uyeVar.j("trans", true);
        descriptor = uyeVar;
    }

    private Message$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.iw8
    @NotNull
    public final KSerializer[] childSerializers() {
        joa[] joaVarArr;
        joaVarArr = Message.$childSerializers;
        uhi uhiVar = uhi.a;
        a7a a7aVar = a7a.a;
        gz1 gz1Var = gz1.a;
        return new KSerializer[]{uhiVar, l98.W(ChatUser$$serializer.INSTANCE), lkb.a, a7aVar, a7aVar, gz1Var, a7aVar, l98.W(ChatImage$$serializer.INSTANCE), a7aVar, l98.W(INSTANCE), l98.W(gz1Var), l98.W(uhiVar), joaVarArr[12].getValue(), gz1Var, gz1Var, gz1Var, uhiVar, gz1Var, gz1Var, gz1Var, gz1Var, gz1Var, l98.W(uhiVar), l98.W(uhiVar), l98.W((KSerializer) joaVarArr[24].getValue())};
    }

    @Override // defpackage.dy4
    @NotNull
    public final Message deserialize(@NotNull Decoder decoder) {
        joa[] joaVarArr;
        long j;
        int i;
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        uf3 b = decoder.b(serialDescriptor);
        joaVarArr = Message.$childSerializers;
        long j2 = 0;
        String str = null;
        Type type = null;
        String str2 = null;
        Boolean bool = null;
        String str3 = null;
        ChatImage chatImage = null;
        Message message = null;
        int i2 = 0;
        Map map = null;
        ChatUser chatUser = null;
        int i3 = 0;
        int i4 = 0;
        boolean z = false;
        int i5 = 0;
        int i6 = 0;
        boolean z2 = true;
        String str4 = null;
        boolean z3 = false;
        boolean z4 = false;
        boolean z5 = false;
        String str5 = null;
        boolean z6 = false;
        boolean z7 = false;
        boolean z8 = false;
        boolean z9 = false;
        boolean z10 = false;
        while (z2) {
            int o = b.o(serialDescriptor);
            switch (o) {
                case -1:
                    j = j2;
                    z2 = false;
                    j2 = j;
                case 0:
                    j = j2;
                    str4 = b.n(serialDescriptor, 0);
                    i2 |= 1;
                    j2 = j;
                case 1:
                    j = j2;
                    chatUser = (ChatUser) b.i(serialDescriptor, 1, ChatUser$$serializer.INSTANCE, chatUser);
                    i2 |= 2;
                    j2 = j;
                case 2:
                    j2 = b.g(serialDescriptor, 2);
                    i2 |= 4;
                case 3:
                    j = j2;
                    i3 = b.l(serialDescriptor, 3);
                    i2 |= 8;
                    j2 = j;
                case 4:
                    j = j2;
                    i4 = b.l(serialDescriptor, 4);
                    i2 |= 16;
                    j2 = j;
                case 5:
                    j = j2;
                    z = b.B(serialDescriptor, 5);
                    i2 |= 32;
                    j2 = j;
                case 6:
                    j = j2;
                    i5 = b.l(serialDescriptor, 6);
                    i2 |= 64;
                    j2 = j;
                case 7:
                    j = j2;
                    chatImage = (ChatImage) b.i(serialDescriptor, 7, ChatImage$$serializer.INSTANCE, chatImage);
                    i2 |= 128;
                    j2 = j;
                case 8:
                    j = j2;
                    i6 = b.l(serialDescriptor, 8);
                    i2 |= NotificationCompat.FLAG_LOCAL_ONLY;
                    j2 = j;
                case 9:
                    j = j2;
                    message = (Message) b.i(serialDescriptor, 9, INSTANCE, message);
                    i2 |= 512;
                    j2 = j;
                case 10:
                    j = j2;
                    bool = (Boolean) b.i(serialDescriptor, 10, gz1.a, bool);
                    i2 |= 1024;
                    j2 = j;
                case 11:
                    j = j2;
                    str2 = (String) b.i(serialDescriptor, 11, uhi.a, str2);
                    i2 |= a.o;
                    j2 = j;
                case 12:
                    j = j2;
                    type = (Type) b.w(serialDescriptor, 12, (dy4) joaVarArr[12].getValue(), type);
                    i2 |= 4096;
                    j2 = j;
                case 13:
                    j = j2;
                    z3 = b.B(serialDescriptor, 13);
                    i2 |= 8192;
                    j2 = j;
                case 14:
                    j = j2;
                    z4 = b.B(serialDescriptor, 14);
                    i2 |= 16384;
                    j2 = j;
                case 15:
                    j = j2;
                    z5 = b.B(serialDescriptor, 15);
                    i = 32768;
                    i2 |= i;
                    j2 = j;
                case 16:
                    j = j2;
                    str5 = b.n(serialDescriptor, 16);
                    i = C.DEFAULT_BUFFER_SEGMENT_SIZE;
                    i2 |= i;
                    j2 = j;
                case 17:
                    j = j2;
                    z6 = b.B(serialDescriptor, 17);
                    i = 131072;
                    i2 |= i;
                    j2 = j;
                case 18:
                    j = j2;
                    z7 = b.B(serialDescriptor, 18);
                    i = 262144;
                    i2 |= i;
                    j2 = j;
                case 19:
                    j = j2;
                    z8 = b.B(serialDescriptor, 19);
                    i = 524288;
                    i2 |= i;
                    j2 = j;
                case 20:
                    j = j2;
                    z9 = b.B(serialDescriptor, 20);
                    i = ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
                    i2 |= i;
                    j2 = j;
                case 21:
                    j = j2;
                    z10 = b.B(serialDescriptor, 21);
                    i = 2097152;
                    i2 |= i;
                    j2 = j;
                case 22:
                    j = j2;
                    str = (String) b.i(serialDescriptor, 22, uhi.a, str);
                    i = 4194304;
                    i2 |= i;
                    j2 = j;
                case 23:
                    j = j2;
                    str3 = (String) b.i(serialDescriptor, 23, uhi.a, str3);
                    i = 8388608;
                    i2 |= i;
                    j2 = j;
                case 24:
                    j = j2;
                    map = (Map) b.i(serialDescriptor, 24, (dy4) joaVarArr[24].getValue(), map);
                    i = C.DEFAULT_MUXED_BUFFER_SIZE;
                    i2 |= i;
                    j2 = j;
                default:
                    yhk.e(o);
                    return null;
            }
        }
        b.c(serialDescriptor);
        return new Message(i2, str4, chatUser, j2, i3, i4, z, i5, chatImage, i6, message, bool, str2, type, z3, z4, z5, str5, z6, z7, z8, z9, z10, str, str3, map, null);
    }

    @Override // defpackage.dy4
    @NotNull
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(@NotNull Encoder encoder, @NotNull Message value) {
        encoder.getClass();
        value.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        wf3 b = encoder.b(serialDescriptor);
        Message.write$Self$model_release(value, b, serialDescriptor);
        b.c(serialDescriptor);
    }

    @Override // defpackage.iw8
    @NotNull
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return z8e.e;
    }
}
