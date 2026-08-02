package com.google.android.gms.internal.measurement;

import android.text.TextUtils;
import defpackage.hv9;
import java.util.UUID;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public abstract class zzww {
    public abstract hv9 a();

    public abstract hv9 b();

    public abstract UUID c();

    public abstract long d();

    public final String toString() {
        return TextUtils.join(" -> ", a());
    }
}
