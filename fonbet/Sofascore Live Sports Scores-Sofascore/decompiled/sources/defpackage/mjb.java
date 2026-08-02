package defpackage;

import com.sofascore.results.R;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public enum mjb {
    GOOGLE(new q9k(R.string.google_login_text), R.drawable.ic_google, false),
    FACEBOOK(new q9k(R.string.facebook_login_text), R.drawable.ic_facebook, true);

    public final q9k a;
    public final int b;
    public final boolean c;

    mjb(q9k q9kVar, int i, boolean z) {
        this.a = q9kVar;
        this.b = i;
        this.c = z;
    }
}
