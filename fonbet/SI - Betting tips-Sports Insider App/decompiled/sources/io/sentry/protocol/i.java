package io.sentry.protocol;

import com.sports.insider.data.repository.room.live.LiveTable;
import io.sentry.ILogger;
import io.sentry.b3;
import io.sentry.c2;
import java.util.AbstractMap;
import java.util.Arrays;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class i implements c2 {

    /* renamed from: a, reason: collision with root package name */
    public String f16809a;

    /* renamed from: b, reason: collision with root package name */
    public String f16810b;

    /* renamed from: c, reason: collision with root package name */
    public String f16811c;

    /* renamed from: d, reason: collision with root package name */
    public v f16812d;

    /* renamed from: e, reason: collision with root package name */
    public v f16813e;

    /* renamed from: f, reason: collision with root package name */
    public String f16814f;

    /* renamed from: g, reason: collision with root package name */
    public AbstractMap f16815g;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return y4.a.s(this.f16809a, iVar.f16809a) && y4.a.s(this.f16810b, iVar.f16810b) && y4.a.s(this.f16811c, iVar.f16811c) && y4.a.s(this.f16812d, iVar.f16812d) && y4.a.s(this.f16813e, iVar.f16813e) && y4.a.s(this.f16814f, iVar.f16814f) && y4.a.s(this.f16815g, iVar.f16815g);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f16809a, this.f16810b, this.f16811c, this.f16812d, this.f16813e, this.f16814f, this.f16815g});
    }

    @Override // io.sentry.c2
    public final void serialize(b3 b3Var, ILogger iLogger) {
        l1.a aVar = (l1.a) b3Var;
        aVar.j();
        aVar.u(LiveTable.messageColumn);
        aVar.K(this.f16809a);
        if (this.f16810b != null) {
            aVar.u("contact_email");
            aVar.K(this.f16810b);
        }
        if (this.f16811c != null) {
            aVar.u("name");
            aVar.K(this.f16811c);
        }
        if (this.f16812d != null) {
            aVar.u("associated_event_id");
            this.f16812d.serialize(aVar, iLogger);
        }
        if (this.f16813e != null) {
            aVar.u("replay_id");
            this.f16813e.serialize(aVar, iLogger);
        }
        if (this.f16814f != null) {
            aVar.u("url");
            aVar.K(this.f16814f);
        }
        AbstractMap abstractMap = this.f16815g;
        if (abstractMap != null) {
            for (String str : abstractMap.keySet()) {
                Object obj = this.f16815g.get(str);
                aVar.u(str);
                aVar.H(iLogger, obj);
            }
        }
        aVar.o();
    }

    public final String toString() {
        return "Feedback{message='" + this.f16809a + "', contactEmail='" + this.f16810b + "', name='" + this.f16811c + "', associatedEventId=" + this.f16812d + ", replayId=" + this.f16813e + ", url='" + this.f16814f + "', unknown=" + this.f16815g + '}';
    }
}
