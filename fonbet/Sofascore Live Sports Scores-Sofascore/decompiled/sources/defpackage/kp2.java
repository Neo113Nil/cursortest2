package defpackage;

import java.util.Iterator;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public abstract class kp2 implements Iterable, eia {

    @NotNull
    public static final jp2 c = new jp2(null);
    public final char a;
    public final char b;

    public kp2(char c2, char c3) {
        this.a = c2;
        this.b = (char) vha.v(c2, c3, 1);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new lp2(this.a, this.b);
    }
}
