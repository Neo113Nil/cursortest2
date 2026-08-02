package defpackage;

import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class cjc {
    public static final CopyOnWriteArraySet d = new CopyOnWriteArraySet();
    public final String a;
    public final String b;
    public final List c;

    public cjc(String str, String str2, List list) {
        this.a = str;
        this.b = str2;
        this.c = list;
    }

    public static final CopyOnWriteArraySet a() {
        if (cw3.a.contains(cjc.class)) {
            return null;
        }
        try {
            return d;
        } catch (Throwable th) {
            cw3.a(cjc.class, th);
            return null;
        }
    }

    public final String b() {
        if (cw3.a.contains(this)) {
            return null;
        }
        try {
            return this.a;
        } catch (Throwable th) {
            cw3.a(this, th);
            return null;
        }
    }
}
