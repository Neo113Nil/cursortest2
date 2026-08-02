package com.vk.dto.common.clips;

import com.vk.core.serialize.Serializer;
import org.json.JSONObject;
import xsna.aay;
import xsna.bxx;
import xsna.epx;
import xsna.ho8;
import xsna.s3q0;
import xsna.w9y;
import xsna.zcl;

/* compiled from: ClipsLinkAttachment.kt */
/* loaded from: classes18.dex */
public final class ClipsLinkAttachment extends Serializer.StreamParcelableAdapter implements bxx {
    public static final Serializer.c<ClipsLinkAttachment> CREATOR = new b();
    public static final a d = new a();
    public final String b;
    public final String c;

    /* compiled from: JsonParser.kt */
    public static final class a extends aay<ClipsLinkAttachment> {
        @Override // xsna.aay
        public final ClipsLinkAttachment a(JSONObject jSONObject) {
            return new ClipsLinkAttachment(jSONObject);
        }
    }

    /* compiled from: Serializer.kt */
    public static final class b extends Serializer.c<ClipsLinkAttachment> {
        @Override // com.vk.core.serialize.Serializer.c
        public final ClipsLinkAttachment a(Serializer serializer) {
            return new ClipsLinkAttachment(serializer.H(), serializer.H());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ClipsLinkAttachment[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ClipsLinkAttachment() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.j0(this.b);
        serializer.j0(this.c);
    }

    @Override // xsna.bxx
    public final JSONObject e5() {
        w9y w9yVar = new w9y();
        w9yVar.e(this.b, "link_title");
        w9yVar.e(this.c, "link_url");
        s3q0 s3q0Var = s3q0.a;
        return w9yVar.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ClipsLinkAttachment)) {
            return false;
        }
        ClipsLinkAttachment clipsLinkAttachment = (ClipsLinkAttachment) obj;
        return epx.f(this.b, clipsLinkAttachment.b) && epx.f(this.c, clipsLinkAttachment.c);
    }

    public final int hashCode() {
        String str = this.b;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.c;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ClipsLinkAttachment(title=");
        sb.append(this.b);
        sb.append(", linkUrl=");
        return ho8.a(sb, this.c, ')');
    }

    public /* synthetic */ ClipsLinkAttachment(String str, String str2, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2);
    }

    public ClipsLinkAttachment(String str, String str2) {
        this.b = str;
        this.c = str2;
    }

    public ClipsLinkAttachment(JSONObject jSONObject) {
        this(jSONObject.optString("link_title"), jSONObject.optString("link_url"));
    }
}
