package defpackage;

import com.sofascore.results.firebase.announcement.FantasyRemoteAnnouncementLocation;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class of7 implements KSerializer {
    public static final of7 b = new of7();
    public final /* synthetic */ nf7 a = new nf7(FantasyRemoteAnnouncementLocation.EVERYWHERE);

    @Override // defpackage.dy4
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        return (FantasyRemoteAnnouncementLocation) this.a.deserialize(decoder);
    }

    @Override // defpackage.dy4
    public final SerialDescriptor getDescriptor() {
        return this.a.b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        FantasyRemoteAnnouncementLocation fantasyRemoteAnnouncementLocation = (FantasyRemoteAnnouncementLocation) obj;
        encoder.getClass();
        fantasyRemoteAnnouncementLocation.getClass();
        this.a.serialize(encoder, fantasyRemoteAnnouncementLocation);
    }
}
