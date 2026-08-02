package defpackage;

import com.appsflyer.internal.i;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public class wo0 extends Exception {
    public wo0(String str) {
        super(i.h(str, "Bad Content-Type format: ", str));
    }

    public wo0() {
        super("Remote configuration cannot be empty");
    }
}
