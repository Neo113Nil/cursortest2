package defpackage;

import com.google.android.gms.internal.wearable.zzel;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class lvn {
    public final Object a;
    public final int b;

    public lvn(int i, zzel zzelVar) {
        this.a = zzelVar;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof lvn)) {
            return false;
        }
        lvn lvnVar = (lvn) obj;
        return this.a == lvnVar.a && this.b == lvnVar.b;
    }

    public final int hashCode() {
        return (System.identityHashCode(this.a) * 65535) + this.b;
    }
}
