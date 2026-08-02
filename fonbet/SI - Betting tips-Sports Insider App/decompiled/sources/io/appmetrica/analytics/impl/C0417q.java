package io.appmetrica.analytics.impl;

import android.app.Activity;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* renamed from: io.appmetrica.analytics.impl.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0417q {

    /* renamed from: a, reason: collision with root package name */
    public final WeakHashMap f14492a = new WeakHashMap();

    public final boolean a(Activity activity, EnumC0392p enumC0392p) {
        if (activity != null && this.f14492a.get(activity) == enumC0392p) {
            return false;
        }
        if (activity == null) {
            return true;
        }
        this.f14492a.put(activity, enumC0392p);
        return true;
    }
}
