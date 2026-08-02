package com.google.android.gms.internal.measurement;

import com.google.android.gms.common.internal.ShowFirstParty;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@ShowFirstParty
/* loaded from: classes3.dex */
public final class zzbu {
    public static volatile zzbu b;
    public final CopyOnWriteArrayList a = new CopyOnWriteArrayList();

    private zzbu() {
    }

    public static zzbu a() {
        if (b == null) {
            synchronized (zzbu.class) {
                try {
                    if (b == null) {
                        b = new zzbu();
                    }
                } finally {
                }
            }
        }
        return b;
    }
}
