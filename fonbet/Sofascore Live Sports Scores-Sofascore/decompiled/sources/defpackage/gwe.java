package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class gwe extends f8b {
    @Override // defpackage.f8b
    public final int calculateTimeForScrolling(int i) {
        return Math.max(50, super.calculateTimeForScrolling(i));
    }

    @Override // defpackage.f8b
    public final int getVerticalSnapPreference() {
        return -1;
    }
}
