package defpackage;

import com.sofascore.model.network.response.serializers.EnumCaches;
import com.sofascore.model.network.response.serializers.EnumSerializerKt;
import com.sofascore.results.firebase.announcement.FantasyRemoteAnnouncementLocation;
import com.sofascore.results.firebase.announcement.FantasyRemoteAnnouncementSeverity;
import com.sofascore.results.firebase.announcement.FantasyRemoteAnnouncementType;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class nf7 implements KSerializer {
    public final /* synthetic */ int a = 0;
    public final g7f b = aik.g("EnumSerializer", d7f.n);
    public final /* synthetic */ Enum c;

    public nf7(FantasyRemoteAnnouncementLocation fantasyRemoteAnnouncementLocation) {
        this.c = fantasyRemoteAnnouncementLocation;
    }

    @Override // defpackage.dy4
    public final Object deserialize(Decoder decoder) {
        int i = this.a;
        Enum r3 = this.c;
        switch (i) {
            case 0:
                decoder.getClass();
                String z = decoder.z();
                EnumCaches enumCaches = EnumCaches.INSTANCE;
                FantasyRemoteAnnouncementLocation fantasyRemoteAnnouncementLocation = (FantasyRemoteAnnouncementLocation) enumCaches.enumBySerialName(FantasyRemoteAnnouncementLocation.class, z);
                if (fantasyRemoteAnnouncementLocation != null) {
                    return fantasyRemoteAnnouncementLocation;
                }
                FantasyRemoteAnnouncementLocation fantasyRemoteAnnouncementLocation2 = (FantasyRemoteAnnouncementLocation) enumCaches.enumByName(FantasyRemoteAnnouncementLocation.class, z);
                return fantasyRemoteAnnouncementLocation2 == null ? r3 : fantasyRemoteAnnouncementLocation2;
            case 1:
                decoder.getClass();
                String z2 = decoder.z();
                EnumCaches enumCaches2 = EnumCaches.INSTANCE;
                FantasyRemoteAnnouncementSeverity fantasyRemoteAnnouncementSeverity = (FantasyRemoteAnnouncementSeverity) enumCaches2.enumBySerialName(FantasyRemoteAnnouncementSeverity.class, z2);
                if (fantasyRemoteAnnouncementSeverity != null) {
                    return fantasyRemoteAnnouncementSeverity;
                }
                FantasyRemoteAnnouncementSeverity fantasyRemoteAnnouncementSeverity2 = (FantasyRemoteAnnouncementSeverity) enumCaches2.enumByName(FantasyRemoteAnnouncementSeverity.class, z2);
                return fantasyRemoteAnnouncementSeverity2 == null ? r3 : fantasyRemoteAnnouncementSeverity2;
            default:
                decoder.getClass();
                String z3 = decoder.z();
                EnumCaches enumCaches3 = EnumCaches.INSTANCE;
                FantasyRemoteAnnouncementType fantasyRemoteAnnouncementType = (FantasyRemoteAnnouncementType) enumCaches3.enumBySerialName(FantasyRemoteAnnouncementType.class, z3);
                if (fantasyRemoteAnnouncementType != null) {
                    return fantasyRemoteAnnouncementType;
                }
                FantasyRemoteAnnouncementType fantasyRemoteAnnouncementType2 = (FantasyRemoteAnnouncementType) enumCaches3.enumByName(FantasyRemoteAnnouncementType.class, z3);
                return fantasyRemoteAnnouncementType2 == null ? r3 : fantasyRemoteAnnouncementType2;
        }
    }

    @Override // defpackage.dy4
    public final SerialDescriptor getDescriptor() {
        int i = this.a;
        return this.b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        switch (this.a) {
            case 0:
                Enum r2 = (Enum) obj;
                encoder.getClass();
                r2.getClass();
                String serialName = EnumSerializerKt.getSerialName(r2);
                if (serialName == null) {
                    serialName = r2.name();
                }
                encoder.F(serialName);
                break;
            case 1:
                Enum r22 = (Enum) obj;
                encoder.getClass();
                r22.getClass();
                String serialName2 = EnumSerializerKt.getSerialName(r22);
                if (serialName2 == null) {
                    serialName2 = r22.name();
                }
                encoder.F(serialName2);
                break;
            default:
                Enum r23 = (Enum) obj;
                encoder.getClass();
                r23.getClass();
                String serialName3 = EnumSerializerKt.getSerialName(r23);
                if (serialName3 == null) {
                    serialName3 = r23.name();
                }
                encoder.F(serialName3);
                break;
        }
    }

    public nf7(FantasyRemoteAnnouncementSeverity fantasyRemoteAnnouncementSeverity) {
        this.c = fantasyRemoteAnnouncementSeverity;
    }

    public nf7(FantasyRemoteAnnouncementType fantasyRemoteAnnouncementType) {
        this.c = fantasyRemoteAnnouncementType;
    }
}
