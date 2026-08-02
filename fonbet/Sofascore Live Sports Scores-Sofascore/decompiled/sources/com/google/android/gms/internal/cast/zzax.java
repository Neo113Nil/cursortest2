package com.google.android.gms.internal.cast;

import com.google.android.gms.cast.internal.Logger;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzax extends com.google.android.gms.cast.framework.zzab {
    public static final Logger c = new Logger("AppVisibilityProxy", null);
    public static final int d = 1;
    public final Set a = Collections.synchronizedSet(new HashSet());
    public int b = d;
}
