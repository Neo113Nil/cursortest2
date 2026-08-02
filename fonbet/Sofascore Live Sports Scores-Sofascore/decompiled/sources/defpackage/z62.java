package defpackage;

import android.os.Bundle;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class z62 implements g72 {
    public final CharSequence a;

    public /* synthetic */ z62(CharSequence charSequence) {
        this.a = charSequence;
    }

    @Override // defpackage.g72
    public final void a(Bundle bundle, String str) {
        bundle.putCharSequence(str, this.a);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof z62) {
            return Intrinsics.c(this.a, ((z62) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        CharSequence charSequence = this.a;
        if (charSequence == null) {
            return 0;
        }
        return charSequence.hashCode();
    }

    public final String toString() {
        return "CharSequenceVal(value=" + ((Object) this.a) + ")";
    }
}
