package androidx.webkit;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import defpackage.a1l;
import defpackage.hbf;
import defpackage.m8f;
import defpackage.y0l;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public interface ProfileStore {
    @NonNull
    static ProfileStore getInstance() {
        if (!y0l.i.b()) {
            throw y0l.a();
        }
        hbf hbfVar = hbf.b;
        if (hbfVar != null) {
            return hbfVar;
        }
        hbf hbfVar2 = new hbf(a1l.a.getProfileStore());
        hbf.b = hbfVar2;
        return hbfVar2;
    }

    boolean deleteProfile(@NonNull String str);

    @NonNull
    List<String> getAllProfileNames();

    @NonNull
    m8f getOrCreateProfile(@NonNull String str);

    @Nullable
    m8f getProfile(@NonNull String str);
}
