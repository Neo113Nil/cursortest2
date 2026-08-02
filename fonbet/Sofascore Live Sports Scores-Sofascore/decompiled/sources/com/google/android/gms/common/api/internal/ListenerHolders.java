package com.google.android.gms.common.api.internal;

import android.os.Looper;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@KeepForSdk
/* loaded from: classes3.dex */
public class ListenerHolders {
    public final Set a = Collections.newSetFromMap(new WeakHashMap());

    public static ListenerHolder a(Looper looper, Object obj, String str) {
        Preconditions.j(obj, "Listener must not be null");
        Preconditions.j(looper, "Looper must not be null");
        return new ListenerHolder(looper, obj, str);
    }
}
