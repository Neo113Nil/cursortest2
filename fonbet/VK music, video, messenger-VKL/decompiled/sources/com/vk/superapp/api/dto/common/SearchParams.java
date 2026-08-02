package com.vk.superapp.api.dto.common;

import com.vk.core.serialize.Serializer;
import com.vk.superapp.api.dto.identity.WebCity;
import xsna.brm0;

/* compiled from: SearchParams.kt */
/* loaded from: classes6.dex */
public abstract class SearchParams extends Serializer.StreamParcelableAdapter {
    public int b;
    public WebCity c;

    /* compiled from: SearchParams.kt */
    public static final class a {
        public final StringBuilder a = new StringBuilder();

        public final void a(String str) {
            StringBuilder sb = this.a;
            if (sb.length() == 0) {
                sb.append(brm0.o(str));
            } else {
                sb.append(", ");
                sb.append(brm0.t(str));
            }
        }

        public final String toString() {
            return this.a.toString();
        }
    }

    public boolean I() {
        return this.b == 0;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public void O7(Serializer serializer) {
        serializer.S(this.b);
        serializer.i0(this.c);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SearchParams) && this.b == ((SearchParams) obj).b;
    }

    public int hashCode() {
        return this.b;
    }

    public void reset() {
        zb(null);
    }

    public final void zb(WebCity webCity) {
        this.b = webCity != null ? webCity.b : 0;
        this.c = webCity;
    }
}
