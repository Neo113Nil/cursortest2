package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import java.util.HashMap;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class Gb implements InterfaceC0244j2 {

    /* renamed from: a, reason: collision with root package name */
    public final C0322m4 f12257a;

    public Gb(@NonNull C0322m4 c0322m4) {
        this.f12257a = c0322m4;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0244j2
    public final C0163fo a(@NonNull Cdo cdo, @NonNull C0163fo c0163fo) {
        int i5 = cdo.f13623b;
        int i10 = this.f12257a.f14228a;
        if (i5 == i10) {
            if (((C0163fo) ((HashMap) cdo.f13622a.get(c0163fo.f13786b)).get(new String(c0163fo.f13785a))) != null) {
                ((HashMap) cdo.f13622a.get(c0163fo.f13786b)).put(new String(c0163fo.f13785a), c0163fo);
                return c0163fo;
            }
        } else if (i5 < i10) {
            ((HashMap) cdo.f13622a.get(c0163fo.f13786b)).put(new String(c0163fo.f13785a), c0163fo);
            cdo.f13623b++;
        }
        return c0163fo;
    }
}
