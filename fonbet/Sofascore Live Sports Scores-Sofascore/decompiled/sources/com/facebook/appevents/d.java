package com.facebook.appevents;

import java.io.ObjectStreamException;
import java.io.Serializable;
import org.json.JSONException;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class d implements Serializable {
    public final String a;
    public final String b;
    public final boolean c;
    public final boolean d;

    public d(String str, String str2, boolean z, boolean z2) {
        str.getClass();
        str2.getClass();
        this.a = str;
        this.b = str2;
        this.c = z;
        this.d = z2;
    }

    private final Object readResolve() throws JSONException, ObjectStreamException {
        return new e(this.a, this.b, this.c, this.d);
    }
}
