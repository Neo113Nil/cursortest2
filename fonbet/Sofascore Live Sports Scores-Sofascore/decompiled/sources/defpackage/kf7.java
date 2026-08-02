package defpackage;

import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import com.sofascore.results.firebase.announcement.FantasyRemoteAnnouncement;
import com.sofascore.results.firebase.announcement.FantasyRemoteAnnouncementLocation;
import com.sofascore.results.firebase.announcement.FantasyRemoteAnnouncementSeverity;
import com.sofascore.results.firebase.announcement.FantasyRemoteAnnouncementType;
import java.util.List;
import java.util.Map;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final /* synthetic */ class kf7 implements iw8 {
    public static final kf7 a;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        kf7 kf7Var = new kf7();
        a = kf7Var;
        uye uyeVar = new uye("com.sofascore.results.firebase.announcement.FantasyRemoteAnnouncement", kf7Var, 8);
        uyeVar.j("type", false);
        uyeVar.j("location", false);
        uyeVar.j("severity", false);
        uyeVar.j(PglCryptUtils.KEY_MESSAGE, false);
        uyeVar.j("translations", true);
        uyeVar.j("competitions", true);
        uyeVar.j("countries", true);
        uyeVar.j("users", true);
        descriptor = uyeVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.iw8
    public final KSerializer[] childSerializers() {
        joa[] joaVarArr;
        joaVarArr = FantasyRemoteAnnouncement.$childSerializers;
        return new KSerializer[]{sf7.b, of7.b, qf7.b, uhi.a, joaVarArr[4].getValue(), joaVarArr[5].getValue(), joaVarArr[6].getValue(), joaVarArr[7].getValue()};
    }

    @Override // defpackage.dy4
    public final Object deserialize(Decoder decoder) {
        joa[] joaVarArr;
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        uf3 b = decoder.b(serialDescriptor);
        joaVarArr = FantasyRemoteAnnouncement.$childSerializers;
        Object obj = null;
        boolean z = true;
        List list = null;
        FantasyRemoteAnnouncementType fantasyRemoteAnnouncementType = null;
        FantasyRemoteAnnouncementLocation fantasyRemoteAnnouncementLocation = null;
        FantasyRemoteAnnouncementSeverity fantasyRemoteAnnouncementSeverity = null;
        String str = null;
        Map map = null;
        List list2 = null;
        List list3 = null;
        int i = 0;
        while (z) {
            int o = b.o(serialDescriptor);
            switch (o) {
                case -1:
                    z = false;
                    break;
                case 0:
                    fantasyRemoteAnnouncementType = (FantasyRemoteAnnouncementType) b.w(serialDescriptor, 0, sf7.b, fantasyRemoteAnnouncementType);
                    i |= 1;
                    break;
                case 1:
                    fantasyRemoteAnnouncementLocation = (FantasyRemoteAnnouncementLocation) b.w(serialDescriptor, 1, of7.b, fantasyRemoteAnnouncementLocation);
                    i |= 2;
                    break;
                case 2:
                    fantasyRemoteAnnouncementSeverity = (FantasyRemoteAnnouncementSeverity) b.w(serialDescriptor, 2, qf7.b, fantasyRemoteAnnouncementSeverity);
                    i |= 4;
                    break;
                case 3:
                    str = b.n(serialDescriptor, 3);
                    i |= 8;
                    break;
                case 4:
                    map = (Map) b.w(serialDescriptor, 4, (dy4) joaVarArr[4].getValue(), map);
                    i |= 16;
                    break;
                case 5:
                    list2 = (List) b.w(serialDescriptor, 5, (dy4) joaVarArr[5].getValue(), list2);
                    i |= 32;
                    break;
                case 6:
                    list3 = (List) b.w(serialDescriptor, 6, (dy4) joaVarArr[6].getValue(), list3);
                    i |= 64;
                    break;
                case 7:
                    list = (List) b.w(serialDescriptor, 7, (dy4) joaVarArr[7].getValue(), list);
                    i |= 128;
                    break;
                default:
                    yhk.e(o);
                    return obj;
            }
            obj = null;
        }
        b.c(serialDescriptor);
        return new FantasyRemoteAnnouncement(i, fantasyRemoteAnnouncementType, fantasyRemoteAnnouncementLocation, fantasyRemoteAnnouncementSeverity, str, map, list2, list3, list, (t5h) null);
    }

    @Override // defpackage.dy4
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        FantasyRemoteAnnouncement fantasyRemoteAnnouncement = (FantasyRemoteAnnouncement) obj;
        encoder.getClass();
        fantasyRemoteAnnouncement.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        wf3 b = encoder.b(serialDescriptor);
        FantasyRemoteAnnouncement.write$Self$mobile_release(fantasyRemoteAnnouncement, b, serialDescriptor);
        b.c(serialDescriptor);
    }
}
