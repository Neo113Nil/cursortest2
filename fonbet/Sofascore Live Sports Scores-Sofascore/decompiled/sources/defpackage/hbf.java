package defpackage;

import androidx.webkit.ProfileStore;
import java.lang.reflect.InvocationHandler;
import java.util.List;
import org.chromium.support_lib_boundary.ProfileBoundaryInterface;
import org.chromium.support_lib_boundary.ProfileStoreBoundaryInterface;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class hbf implements ProfileStore {
    public static hbf b;
    public final ProfileStoreBoundaryInterface a;

    public hbf(ProfileStoreBoundaryInterface profileStoreBoundaryInterface) {
        this.a = profileStoreBoundaryInterface;
    }

    @Override // androidx.webkit.ProfileStore
    public final boolean deleteProfile(String str) {
        if (y0l.i.b()) {
            return this.a.deleteProfile(str);
        }
        throw y0l.a();
    }

    @Override // androidx.webkit.ProfileStore
    public final List getAllProfileNames() {
        if (y0l.i.b()) {
            return this.a.getAllProfileNames();
        }
        throw y0l.a();
    }

    @Override // androidx.webkit.ProfileStore
    public final m8f getOrCreateProfile(String str) {
        if (y0l.i.b()) {
            return new yia((ProfileBoundaryInterface) s02.E(ProfileBoundaryInterface.class, this.a.getOrCreateProfile(str)), 11);
        }
        throw y0l.a();
    }

    @Override // androidx.webkit.ProfileStore
    public final m8f getProfile(String str) {
        if (!y0l.i.b()) {
            throw y0l.a();
        }
        InvocationHandler profile = this.a.getProfile(str);
        if (profile != null) {
            return new yia((ProfileBoundaryInterface) s02.E(ProfileBoundaryInterface.class, profile), 11);
        }
        return null;
    }
}
