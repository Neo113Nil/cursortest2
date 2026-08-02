package defpackage;

import com.google.android.gms.common.internal.Preconditions;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public abstract class dy3 extends Exception {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dy3(CharSequence charSequence, String str) {
        super(charSequence != null ? charSequence.toString() : null);
        str.getClass();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dy3(String str, Throwable th) {
        super(str, th);
        Preconditions.g(str, "Detail message must not be empty");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dy3(String str) {
        super(str);
        Preconditions.g(str, "Detail message must not be empty");
    }
}
