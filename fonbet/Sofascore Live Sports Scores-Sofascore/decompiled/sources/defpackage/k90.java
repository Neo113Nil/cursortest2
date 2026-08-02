package defpackage;

import android.text.SegmentFinder;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class k90 extends SegmentFinder {
    public final /* synthetic */ c0l a;

    public k90(c0l c0lVar) {
        this.a = c0lVar;
    }

    public final int nextEndBoundary(int i) {
        return this.a.f(i);
    }

    public final int nextStartBoundary(int i) {
        return this.a.c(i);
    }

    public final int previousEndBoundary(int i) {
        return this.a.g(i);
    }

    public final int previousStartBoundary(int i) {
        return this.a.e(i);
    }
}
