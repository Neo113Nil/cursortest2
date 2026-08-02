package com.sofascore.model.chat;

import androidx.core.app.NotificationCompat;
import com.ironsource.U3;
import com.sofascore.model.profile.UserBadge;
import com.sofascore.model.profile.UserBadgeSerializer;
import defpackage.a7a;
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
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/sofascore/model/chat/ChatUser.$serializer", "Liw8;", "Lcom/sofascore/model/chat/ChatUser;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", U3.i.X, "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/sofascore/model/chat/ChatUser;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/sofascore/model/chat/ChatUser;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
@wx4
/* loaded from: classes5.dex */
public final /* synthetic */ class ChatUser$$serializer implements iw8 {

    @NotNull
    public static final ChatUser$$serializer INSTANCE;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        ChatUser$$serializer chatUser$$serializer = new ChatUser$$serializer();
        INSTANCE = chatUser$$serializer;
        uye uyeVar = new uye("com.sofascore.model.chat.ChatUser", chatUser$$serializer, 11);
        uyeVar.j("id", false);
        uyeVar.j("nickname", false);
        uyeVar.j("isLoggedIn", true);
        uyeVar.j("chatAdmin", true);
        uyeVar.j("banned", true);
        uyeVar.j("chatModerator", true);
        uyeVar.j("color", true);
        uyeVar.j("chatFlag", true);
        uyeVar.j("chatWarnings", true);
        uyeVar.j("chatBans", true);
        uyeVar.j("userBadge", true);
        descriptor = uyeVar;
    }

    private ChatUser$$serializer() {
    }

    @Override // defpackage.iw8
    @NotNull
    public final KSerializer[] childSerializers() {
        uhi uhiVar = uhi.a;
        KSerializer W = l98.W(uhiVar);
        KSerializer W2 = l98.W(uhiVar);
        KSerializer W3 = l98.W(UserBadgeSerializer.INSTANCE);
        gz1 gz1Var = gz1.a;
        a7a a7aVar = a7a.a;
        return new KSerializer[]{uhiVar, uhiVar, gz1Var, gz1Var, gz1Var, gz1Var, W, W2, a7aVar, a7aVar, W3};
    }

    @Override // defpackage.dy4
    @NotNull
    public final ChatUser deserialize(@NotNull Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        uf3 b = decoder.b(serialDescriptor);
        ChatUser chatUser = null;
        boolean z = true;
        UserBadge userBadge = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        int i = 0;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        boolean z5 = false;
        int i2 = 0;
        int i3 = 0;
        while (z) {
            int o = b.o(serialDescriptor);
            switch (o) {
                case -1:
                    z = false;
                    continue;
                case 0:
                    str = b.n(serialDescriptor, 0);
                    i |= 1;
                    break;
                case 1:
                    str2 = b.n(serialDescriptor, 1);
                    i |= 2;
                    break;
                case 2:
                    z2 = b.B(serialDescriptor, 2);
                    i |= 4;
                    break;
                case 3:
                    z3 = b.B(serialDescriptor, 3);
                    i |= 8;
                    break;
                case 4:
                    z4 = b.B(serialDescriptor, 4);
                    i |= 16;
                    break;
                case 5:
                    z5 = b.B(serialDescriptor, 5);
                    i |= 32;
                    break;
                case 6:
                    str3 = (String) b.i(serialDescriptor, 6, uhi.a, str3);
                    i |= 64;
                    break;
                case 7:
                    str4 = (String) b.i(serialDescriptor, 7, uhi.a, str4);
                    i |= 128;
                    break;
                case 8:
                    i2 = b.l(serialDescriptor, 8);
                    i |= NotificationCompat.FLAG_LOCAL_ONLY;
                    break;
                case 9:
                    i3 = b.l(serialDescriptor, 9);
                    i |= 512;
                    break;
                case 10:
                    userBadge = (UserBadge) b.i(serialDescriptor, 10, UserBadgeSerializer.INSTANCE, userBadge);
                    i |= 1024;
                    break;
                default:
                    yhk.e(o);
                    return chatUser;
            }
            chatUser = null;
        }
        b.c(serialDescriptor);
        return new ChatUser(i, str, str2, z2, z3, z4, z5, str3, str4, i2, i3, userBadge, (t5h) null);
    }

    @Override // defpackage.dy4
    @NotNull
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(@NotNull Encoder encoder, @NotNull ChatUser value) {
        encoder.getClass();
        value.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        wf3 b = encoder.b(serialDescriptor);
        ChatUser.write$Self$model_release(value, b, serialDescriptor);
        b.c(serialDescriptor);
    }

    @Override // defpackage.iw8
    @NotNull
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return z8e.e;
    }
}
