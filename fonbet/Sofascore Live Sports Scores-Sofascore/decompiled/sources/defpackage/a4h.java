package defpackage;

import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class a4h {
    public final String a;
    public final Function2 b;
    public final boolean c;

    public a4h(String str, Function2 function2) {
        this.a = str;
        this.b = function2;
    }

    public final String toString() {
        return "AccessibilityKey: " + this.a;
    }

    public /* synthetic */ a4h(String str) {
        this(str, ned.G);
    }

    public a4h(String str, int i) {
        this(str);
        this.c = true;
    }

    public a4h(String str, boolean z, Function2 function2) {
        this(str, function2);
        this.c = z;
    }
}
