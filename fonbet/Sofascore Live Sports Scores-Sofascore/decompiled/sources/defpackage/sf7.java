package defpackage;

import com.sofascore.results.firebase.announcement.FantasyRemoteAnnouncementType;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class sf7 implements KSerializer {
    public static final sf7 b = new sf7();
    public final /* synthetic */ nf7 a = new nf7(FantasyRemoteAnnouncementType.OTHER);

    @Override // defpackage.dy4
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        return (FantasyRemoteAnnouncementType) this.a.deserialize(decoder);
    }

    @Override // defpackage.dy4
    public final SerialDescriptor getDescriptor() {
        return this.a.b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        FantasyRemoteAnnouncementType fantasyRemoteAnnouncementType = (FantasyRemoteAnnouncementType) obj;
        encoder.getClass();
        fantasyRemoteAnnouncementType.getClass();
        this.a.serialize(encoder, fantasyRemoteAnnouncementType);
    }
}
