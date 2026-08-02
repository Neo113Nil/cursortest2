package com.google.android.gms.cast;

import android.os.Bundle;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import defpackage.t8p;
import java.util.Arrays;
import java.util.Set;
import java.util.UUID;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class Cast {
    public static final /* synthetic */ int a = 0;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public interface ApplicationConnectionResult extends Result {
        ApplicationMetadata E0();

        String getSessionId();

        boolean j0();

        String n0();
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Deprecated
    public interface CastApi {
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static final class CastOptions implements Api.ApiOptions.HasOptions {
        public final CastDevice a;
        public final t8p b;
        public final Bundle c;
        public final String d = UUID.randomUUID().toString();

        /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
        public static final class Builder {
            public final CastDevice a;
            public final t8p b;
            public Bundle c;

            public Builder(CastDevice castDevice, t8p t8pVar) {
                Preconditions.j(castDevice, "CastDevice parameter cannot be null");
                this.a = castDevice;
                this.b = t8pVar;
            }
        }

        public /* synthetic */ CastOptions(Builder builder) {
            this.a = builder.a;
            this.b = builder.b;
            this.c = builder.c;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof CastOptions)) {
                return false;
            }
            CastOptions castOptions = (CastOptions) obj;
            if (!Objects.a(this.a, castOptions.a)) {
                return false;
            }
            Bundle bundle = castOptions.c;
            Bundle bundle2 = this.c;
            if (bundle2 != null && bundle != null) {
                if (bundle2.size() != bundle.size()) {
                    return false;
                }
                Set<String> keySet = bundle2.keySet();
                if (!keySet.containsAll(bundle.keySet())) {
                    return false;
                }
                for (String str : keySet) {
                    if (!Objects.a(bundle2.get(str), bundle.get(str))) {
                        return false;
                    }
                }
            } else if (bundle2 != bundle) {
                return false;
            }
            return Objects.a(this.d, castOptions.d);
        }

        public final int hashCode() {
            return Arrays.hashCode(new Object[]{this.a, this.c, 0, this.d});
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public interface MessageReceivedCallback {
        void a(String str);
    }

    static {
        new Api("Cast.API", new d(), com.google.android.gms.cast.internal.zzal.a);
        new zzm();
    }

    private Cast() {
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static class Listener {
        public void d() {
        }

        public void e() {
        }

        public void g() {
        }

        public void a(int i) {
        }

        public void b(int i) {
        }

        public void c(ApplicationMetadata applicationMetadata) {
        }

        public void f(int i) {
        }
    }
}
