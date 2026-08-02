package com.vk.common.links;

import android.os.Bundle;
import com.vk.core.serialize.Serializer;
import java.util.Iterator;
import java.util.Objects;
import org.json.JSONObject;
import xsna.uf3;
import xsna.zcl;

/* compiled from: AwayLink.kt */
/* loaded from: classes17.dex */
public final class AwayLink extends Serializer.StreamParcelableAdapter {
    public static final Serializer.c<AwayLink> CREATOR = new b();
    public final String b;
    public final Bundle c;

    /* compiled from: AwayLink.kt */
    public static final class a {
        public static Bundle a(JSONObject jSONObject) {
            JSONObject optJSONObject = jSONObject.optJSONObject("away_params");
            if (optJSONObject == null) {
                return null;
            }
            Bundle bundle = new Bundle();
            Iterator<String> keys = optJSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                bundle.putString(next, optJSONObject.optString(next, ""));
            }
            return bundle;
        }
    }

    /* compiled from: Serializer.kt */
    public static final class b extends Serializer.c<AwayLink> {
        @Override // com.vk.core.serialize.Serializer.c
        public final AwayLink a(Serializer serializer) {
            return new AwayLink(serializer.H(), serializer.o(AwayLink.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new AwayLink[i];
        }
    }

    public /* synthetic */ AwayLink(String str, Bundle bundle, int i, zcl zclVar) {
        this(str, (i & 2) != 0 ? null : bundle);
    }

    public static final Bundle zb(JSONObject jSONObject) {
        return a.a(jSONObject);
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.j0(this.b);
        serializer.K(this.c);
    }

    public final boolean equals(Object obj) {
        AwayLink awayLink = obj instanceof AwayLink ? (AwayLink) obj : null;
        return Objects.equals(this.b, awayLink != null ? awayLink.b : null);
    }

    public final int hashCode() {
        return Objects.hash(this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AwayLink(url=");
        sb.append(this.b);
        sb.append(", awayParams=");
        return uf3.c(sb, this.c, ')');
    }

    public AwayLink(String str, Bundle bundle) {
        this.b = str;
        this.c = bundle;
    }
}
