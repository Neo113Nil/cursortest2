package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class e extends h {
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.f a;

    public e(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.f fVar) {
        this.a = fVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e) && this.a.equals(((e) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Failure(failure=" + this.a + ')';
    }
}
