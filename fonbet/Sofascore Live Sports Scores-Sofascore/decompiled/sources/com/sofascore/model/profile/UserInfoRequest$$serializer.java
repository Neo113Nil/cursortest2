package com.sofascore.model.profile;

import androidx.core.app.NotificationCompat;
import com.ironsource.U3;
import com.ironsource.mediationsdk.metadata.a;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
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
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/sofascore/model/profile/UserInfoRequest.$serializer", "Liw8;", "Lcom/sofascore/model/profile/UserInfoRequest;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", U3.i.X, "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/sofascore/model/profile/UserInfoRequest;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/sofascore/model/profile/UserInfoRequest;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
@wx4
/* loaded from: classes5.dex */
public final /* synthetic */ class UserInfoRequest$$serializer implements iw8 {

    @NotNull
    public static final UserInfoRequest$$serializer INSTANCE;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        UserInfoRequest$$serializer userInfoRequest$$serializer = new UserInfoRequest$$serializer();
        INSTANCE = userInfoRequest$$serializer;
        uye uyeVar = new uye("com.sofascore.model.profile.UserInfoRequest", userInfoRequest$$serializer, 12);
        uyeVar.j("deviceType", false);
        uyeVar.j("version", false);
        uyeVar.j("sdk", false);
        uyeVar.j("language", false);
        uyeVar.j("country", false);
        uyeVar.j("timezone", false);
        uyeVar.j("devMod", false);
        uyeVar.j(TtmlNode.TAG_REGION, false);
        uyeVar.j("regionName", false);
        uyeVar.j("advertisingId", false);
        uyeVar.j("uuid", true);
        uyeVar.j("keepOldData", true);
        descriptor = uyeVar;
    }

    private UserInfoRequest$$serializer() {
    }

    @Override // defpackage.iw8
    @NotNull
    public final KSerializer[] childSerializers() {
        uhi uhiVar = uhi.a;
        KSerializer W = l98.W(uhiVar);
        KSerializer W2 = l98.W(uhiVar);
        KSerializer W3 = l98.W(uhiVar);
        KSerializer W4 = l98.W(uhiVar);
        KSerializer W5 = l98.W(uhiVar);
        KSerializer W6 = l98.W(gz1.a);
        a7a a7aVar = a7a.a;
        return new KSerializer[]{uhiVar, a7aVar, a7aVar, uhiVar, uhiVar, a7aVar, W, W2, W3, W4, W5, W6};
    }

    @Override // defpackage.dy4
    @NotNull
    public final UserInfoRequest deserialize(@NotNull Decoder decoder) {
        String str;
        boolean z;
        boolean z2;
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        uf3 b = decoder.b(serialDescriptor);
        Boolean bool = null;
        String str2 = null;
        String str3 = null;
        boolean z3 = true;
        String str4 = null;
        int i = 0;
        String str5 = null;
        int i2 = 0;
        int i3 = 0;
        String str6 = null;
        String str7 = null;
        int i4 = 0;
        String str8 = null;
        String str9 = null;
        while (z3) {
            int o = b.o(serialDescriptor);
            switch (o) {
                case -1:
                    str = str5;
                    z3 = false;
                    str5 = str;
                case 0:
                    z2 = z3;
                    i |= 1;
                    str5 = b.n(serialDescriptor, 0);
                    z3 = z2;
                case 1:
                    z2 = z3;
                    i2 = b.l(serialDescriptor, 1);
                    i |= 2;
                    z3 = z2;
                case 2:
                    z2 = z3;
                    i3 = b.l(serialDescriptor, 2);
                    i |= 4;
                    z3 = z2;
                case 3:
                    z2 = z3;
                    str6 = b.n(serialDescriptor, 3);
                    i |= 8;
                    z3 = z2;
                case 4:
                    z2 = z3;
                    str7 = b.n(serialDescriptor, 4);
                    i |= 16;
                    z3 = z2;
                case 5:
                    z2 = z3;
                    i4 = b.l(serialDescriptor, 5);
                    i |= 32;
                    z3 = z2;
                case 6:
                    z = z3;
                    str = str5;
                    str8 = (String) b.i(serialDescriptor, 6, uhi.a, str8);
                    i |= 64;
                    z3 = z;
                    str5 = str;
                case 7:
                    z = z3;
                    str = str5;
                    str9 = (String) b.i(serialDescriptor, 7, uhi.a, str9);
                    i |= 128;
                    z3 = z;
                    str5 = str;
                case 8:
                    z = z3;
                    str = str5;
                    str4 = (String) b.i(serialDescriptor, 8, uhi.a, str4);
                    i |= NotificationCompat.FLAG_LOCAL_ONLY;
                    z3 = z;
                    str5 = str;
                case 9:
                    z = z3;
                    str = str5;
                    str3 = (String) b.i(serialDescriptor, 9, uhi.a, str3);
                    i |= 512;
                    z3 = z;
                    str5 = str;
                case 10:
                    z = z3;
                    str = str5;
                    str2 = (String) b.i(serialDescriptor, 10, uhi.a, str2);
                    i |= 1024;
                    z3 = z;
                    str5 = str;
                case 11:
                    z = z3;
                    str = str5;
                    bool = (Boolean) b.i(serialDescriptor, 11, gz1.a, bool);
                    i |= a.o;
                    z3 = z;
                    str5 = str;
                default:
                    yhk.e(o);
                    return null;
            }
        }
        b.c(serialDescriptor);
        return new UserInfoRequest(i, str5, i2, i3, str6, str7, i4, str8, str9, str4, str3, str2, bool, null);
    }

    @Override // defpackage.dy4
    @NotNull
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(@NotNull Encoder encoder, @NotNull UserInfoRequest value) {
        encoder.getClass();
        value.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        wf3 b = encoder.b(serialDescriptor);
        UserInfoRequest.write$Self$model_release(value, b, serialDescriptor);
        b.c(serialDescriptor);
    }

    @Override // defpackage.iw8
    @NotNull
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return z8e.e;
    }
}
