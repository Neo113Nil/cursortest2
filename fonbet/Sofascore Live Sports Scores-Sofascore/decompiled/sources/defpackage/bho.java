package defpackage;

import com.google.android.gms.internal.ads.zzgua;
import java.io.Serializable;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class bho extends zzgua implements Serializable {
    public final Pattern a;

    public bho(Pattern pattern) {
        pattern.getClass();
        this.a = pattern;
    }

    public final aho a(CharSequence charSequence) {
        return new aho(this.a.matcher(charSequence));
    }

    public final String toString() {
        return this.a.toString();
    }
}
