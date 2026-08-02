package defpackage;

import com.sofascore.results.firebase.announcement.FantasyRemoteAnnouncementSeverity;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class qf7 implements KSerializer {
    public static final qf7 b = new qf7();
    public final /* synthetic */ nf7 a = new nf7(FantasyRemoteAnnouncementSeverity.INFO);

    @Override // defpackage.dy4
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        return (FantasyRemoteAnnouncementSeverity) this.a.deserialize(decoder);
    }

    @Override // defpackage.dy4
    public final SerialDescriptor getDescriptor() {
        return this.a.b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        FantasyRemoteAnnouncementSeverity fantasyRemoteAnnouncementSeverity = (FantasyRemoteAnnouncementSeverity) obj;
        encoder.getClass();
        fantasyRemoteAnnouncementSeverity.getClass();
        this.a.serialize(encoder, fantasyRemoteAnnouncementSeverity);
    }
}
