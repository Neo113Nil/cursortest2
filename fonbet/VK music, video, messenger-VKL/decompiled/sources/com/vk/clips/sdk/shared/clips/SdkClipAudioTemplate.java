package com.vk.clips.sdk.shared.clips;

import com.huawei.hms.framework.common.BundleUtil;
import com.vk.core.serialize.Serializer;
import org.json.JSONObject;
import xsna.aay;
import xsna.arm0;
import xsna.bxx;
import xsna.drm0;
import xsna.epx;
import xsna.ho8;
import xsna.s3q0;
import xsna.vu5;
import xsna.w9y;

/* compiled from: SdkClipAudioTemplate.kt */
/* loaded from: classes17.dex */
public final class SdkClipAudioTemplate extends Serializer.StreamParcelableAdapter implements bxx {
    public static final Serializer.c<SdkClipAudioTemplate> CREATOR = new c();
    public final String b;

    /* compiled from: SdkClipAudioTemplate.kt */
    public static final class a {
        public final int a;
        public final long b;

        public a(int i, long j) {
            this.a = i;
            this.b = j;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a == aVar.a && this.b == aVar.b;
        }

        public final int hashCode() {
            return Long.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("TemplateInfo(id=");
            sb.append(this.a);
            sb.append(", ownerId=");
            return vu5.a(')', this.b, sb);
        }
    }

    /* compiled from: JsonParser.kt */
    public static final class b extends aay<SdkClipAudioTemplate> {
        @Override // xsna.aay
        public final SdkClipAudioTemplate a(JSONObject jSONObject) {
            return new SdkClipAudioTemplate(jSONObject);
        }
    }

    /* compiled from: Serializer.kt */
    public static final class c extends Serializer.c<SdkClipAudioTemplate> {
        @Override // com.vk.core.serialize.Serializer.c
        public final SdkClipAudioTemplate a(Serializer serializer) {
            return new SdkClipAudioTemplate(serializer.H());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new SdkClipAudioTemplate[i];
        }
    }

    static {
        new b();
    }

    public SdkClipAudioTemplate(String str) {
        this.b = str;
    }

    public final a Ab() {
        String str = this.b;
        int K = drm0.K(0, 6, str, BundleUtil.UNDERLINE_TAG, false);
        Integer valueOf = Integer.valueOf(K);
        if (K < 0) {
            valueOf = null;
        }
        if (valueOf != null) {
            int intValue = valueOf.intValue();
            Long n = arm0.n(str.substring(0, intValue));
            if (n != null) {
                long longValue = n.longValue();
                Integer m = arm0.m(10, str.substring(intValue + 1));
                if (m != null) {
                    return new a(m.intValue(), longValue);
                }
            }
        }
        return null;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.j0(this.b);
    }

    @Override // xsna.bxx
    public final JSONObject e5() {
        w9y w9yVar = new w9y();
        w9yVar.e(this.b, "raw_id");
        s3q0 s3q0Var = s3q0.a;
        return w9yVar.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SdkClipAudioTemplate) && epx.f(this.b, ((SdkClipAudioTemplate) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return ho8.a(new StringBuilder("SdkClipAudioTemplate(rawId="), this.b, ')');
    }

    public final String zb() {
        return this.b;
    }

    public SdkClipAudioTemplate(JSONObject jSONObject) {
        this(jSONObject.getString("raw_id"));
    }
}
