package com.google.android.gms.internal.measurement;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzafy extends RuntimeException {
    public zzafy() {
        super("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
    }

    public final zzaeh d() {
        return new zzaeh(getMessage());
    }
}
