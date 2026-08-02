package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class a4e extends e4e {
    public final rfb a;
    public final rfb b;

    public a4e(rfb rfbVar, rfb rfbVar2) {
        this.a = rfbVar;
        this.b = rfbVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a4e)) {
            return false;
        }
        a4e a4eVar = (a4e) obj;
        return this.a.equals(a4eVar.a) && Intrinsics.c(this.b, a4eVar.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        rfb rfbVar = this.b;
        return hashCode + (rfbVar == null ? 0 : rfbVar.hashCode());
    }

    public final String toString() {
        String str = "PageEvent.LoadStateUpdate (\n                    |   sourceLoadStates: " + this.a + "\n                    ";
        rfb rfbVar = this.b;
        if (rfbVar != null) {
            str = str + "|   mediatorLoadStates: " + rfbVar + '\n';
        }
        return dii.d(str.concat("|)"));
    }
}
