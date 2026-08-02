package defpackage;

import com.sofascore.model.mvvm.model.Event;
import com.sofascore.model.newNetwork.Highlight;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class rxb {
    public final Event a;
    public final wn1 b;
    public final Highlight c;
    public final String d;
    public final String e;
    public final Integer f;
    public final r2f g;
    public final boolean h;

    public rxb(Event event, wn1 wn1Var, Highlight highlight, String str, String str2, Integer num, r2f r2fVar, boolean z) {
        this.a = event;
        this.b = wn1Var;
        this.c = highlight;
        this.d = str;
        this.e = str2;
        this.f = num;
        this.g = r2fVar;
        this.h = z;
    }

    public static rxb a(rxb rxbVar, r2f r2fVar, int i) {
        Event event = rxbVar.a;
        wn1 wn1Var = rxbVar.b;
        Highlight highlight = rxbVar.c;
        String str = rxbVar.d;
        String str2 = rxbVar.e;
        Integer num = rxbVar.f;
        if ((i & 64) != 0) {
            r2fVar = rxbVar.g;
        }
        return new rxb(event, wn1Var, highlight, str, str2, num, r2fVar, (i & 128) != 0 ? rxbVar.h : true);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rxb)) {
            return false;
        }
        rxb rxbVar = (rxb) obj;
        return this.a.equals(rxbVar.a) && this.b.equals(rxbVar.b) && this.c.equals(rxbVar.c) && Intrinsics.c(this.d, rxbVar.d) && Intrinsics.c(this.e, rxbVar.e) && Intrinsics.c(this.f, rxbVar.f) && this.g.equals(rxbVar.g) && this.h == rxbVar.h;
    }

    public final int hashCode() {
        int hashCode = (this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31;
        String str = this.d;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.e;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.f;
        return Boolean.hashCode(this.h) + ((this.g.hashCode() + ((hashCode3 + (num != null ? num.hashCode() : 0)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MatchdayHighlightUiModel(event=");
        sb.append(this.a);
        sb.append(", basicEventData=");
        sb.append(this.b);
        sb.append(", highlight=");
        sb.append(this.c);
        sb.append(", groupName=");
        sb.append(this.d);
        sb.append(", roundName=");
        me4.o(this.f, this.e, ", roundNumber=", ", potmState=", sb);
        sb.append(this.g);
        sb.append(", watched=");
        sb.append(this.h);
        sb.append(")");
        return sb.toString();
    }
}
