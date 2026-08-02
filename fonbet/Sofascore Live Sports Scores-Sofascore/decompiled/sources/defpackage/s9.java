package defpackage;

import java.text.BreakIterator;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class s9 extends r9 {
    public static s9 e;
    public static s9 f;
    public final /* synthetic */ int c;
    public BreakIterator d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s9(int i) {
        super(0, false);
        this.c = i;
    }

    public final void G(String str) {
        switch (this.c) {
            case 0:
                this.a = str;
                BreakIterator breakIterator = this.d;
                if (breakIterator != null) {
                    breakIterator.setText(str);
                    return;
                } else {
                    Intrinsics.i("impl");
                    throw null;
                }
            default:
                this.a = str;
                BreakIterator breakIterator2 = this.d;
                if (breakIterator2 != null) {
                    breakIterator2.setText(str);
                    return;
                } else {
                    Intrinsics.i("impl");
                    throw null;
                }
        }
    }

    public boolean H(int i) {
        if (i <= 0 || !I(i - 1)) {
            return false;
        }
        return i == p().length() || !I(i);
    }

    public boolean I(int i) {
        if (i < 0 || i >= p().length()) {
            return false;
        }
        return Character.isLetterOrDigit(p().codePointAt(i));
    }

    @Override // defpackage.r9
    public final int[] g(int i) {
        switch (this.c) {
            case 0:
                int length = p().length();
                if (length <= 0 || i >= length) {
                    return null;
                }
                if (i < 0) {
                    i = 0;
                }
                do {
                    BreakIterator breakIterator = this.d;
                    if (breakIterator == null) {
                        Intrinsics.i("impl");
                        throw null;
                    }
                    boolean isBoundary = breakIterator.isBoundary(i);
                    BreakIterator breakIterator2 = this.d;
                    if (isBoundary) {
                        if (breakIterator2 == null) {
                            Intrinsics.i("impl");
                            throw null;
                        }
                        int following = breakIterator2.following(i);
                        if (following == -1) {
                            return null;
                        }
                        return l(i, following);
                    }
                    if (breakIterator2 == null) {
                        Intrinsics.i("impl");
                        throw null;
                    }
                    i = breakIterator2.following(i);
                } while (i != -1);
                return null;
            default:
                if (p().length() <= 0 || i >= p().length()) {
                    return null;
                }
                if (i < 0) {
                    i = 0;
                }
                while (!I(i) && (!I(i) || (i != 0 && I(i - 1)))) {
                    BreakIterator breakIterator3 = this.d;
                    if (breakIterator3 == null) {
                        Intrinsics.i("impl");
                        throw null;
                    }
                    i = breakIterator3.following(i);
                    if (i == -1) {
                        return null;
                    }
                }
                BreakIterator breakIterator4 = this.d;
                if (breakIterator4 == null) {
                    Intrinsics.i("impl");
                    throw null;
                }
                int following2 = breakIterator4.following(i);
                if (following2 == -1 || !H(following2)) {
                    return null;
                }
                return l(i, following2);
        }
    }

    @Override // defpackage.r9
    public final int[] y(int i) {
        switch (this.c) {
            case 0:
                int length = p().length();
                if (length <= 0 || i <= 0) {
                    return null;
                }
                if (i > length) {
                    i = length;
                }
                do {
                    BreakIterator breakIterator = this.d;
                    if (breakIterator == null) {
                        Intrinsics.i("impl");
                        throw null;
                    }
                    boolean isBoundary = breakIterator.isBoundary(i);
                    BreakIterator breakIterator2 = this.d;
                    if (isBoundary) {
                        if (breakIterator2 == null) {
                            Intrinsics.i("impl");
                            throw null;
                        }
                        int preceding = breakIterator2.preceding(i);
                        if (preceding == -1) {
                            return null;
                        }
                        return l(preceding, i);
                    }
                    if (breakIterator2 == null) {
                        Intrinsics.i("impl");
                        throw null;
                    }
                    i = breakIterator2.preceding(i);
                } while (i != -1);
                return null;
            default:
                int length2 = p().length();
                if (length2 <= 0 || i <= 0) {
                    return null;
                }
                if (i > length2) {
                    i = length2;
                }
                while (i > 0 && !I(i - 1) && !H(i)) {
                    BreakIterator breakIterator3 = this.d;
                    if (breakIterator3 == null) {
                        Intrinsics.i("impl");
                        throw null;
                    }
                    i = breakIterator3.preceding(i);
                    if (i == -1) {
                        return null;
                    }
                }
                BreakIterator breakIterator4 = this.d;
                if (breakIterator4 == null) {
                    Intrinsics.i("impl");
                    throw null;
                }
                int preceding2 = breakIterator4.preceding(i);
                if (preceding2 == -1 || !I(preceding2)) {
                    return null;
                }
                if (preceding2 == 0 || !I(preceding2 - 1)) {
                    return l(preceding2, i);
                }
                return null;
        }
    }
}
