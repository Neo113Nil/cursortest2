package com.vk.im.engine.models.account;

import com.vk.core.serialize.Serializer;
import java.util.List;
import xsna.epx;
import xsna.fw3;
import xsna.ms9;
import xsna.urd0;
import xsna.zcl;

/* compiled from: PrivacySetting.kt */
/* loaded from: classes.dex */
public final class PrivacySetting extends Serializer.StreamParcelableAdapter {
    public static final Serializer.c<PrivacySetting> CREATOR = new a();
    public final String b;
    public final String c;
    public final String d;
    public final List<PrivacyRule> e;
    public final List<String> f;

    /* compiled from: Serializer.kt */
    /* loaded from: classes2.dex */
    public static final class a extends Serializer.c<PrivacySetting> {
        @Override // com.vk.core.serialize.Serializer.c
        public final PrivacySetting a(Serializer serializer) {
            return new PrivacySetting(serializer, null);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new PrivacySetting[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public PrivacySetting(String str, String str2, String str3, List<? extends PrivacyRule> list, List<String> list2) {
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = list;
        this.f = list2;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.j0(this.b);
        serializer.j0(this.c);
        serializer.j0(this.d);
        serializer.W(this.e);
        serializer.h0(this.f);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PrivacySetting)) {
            return false;
        }
        PrivacySetting privacySetting = (PrivacySetting) obj;
        return epx.f(this.b, privacySetting.b) && epx.f(this.c, privacySetting.c) && epx.f(this.d, privacySetting.d) && epx.f(this.e, privacySetting.e) && epx.f(this.f, privacySetting.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + fw3.a(urd0.a(urd0.a(this.b.hashCode() * 31, 31, this.c), 31, this.d), 31, this.e);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PrivacySetting(key=");
        sb.append(this.b);
        sb.append(", title=");
        sb.append(this.c);
        sb.append(", sectionKey=");
        sb.append(this.d);
        sb.append(", value=");
        sb.append(this.e);
        sb.append(", possibleRules=");
        return ms9.a(')', sb, this.f);
    }

    public PrivacySetting(Serializer serializer, zcl zclVar) {
        this(serializer.H(), serializer.H(), serializer.H(), serializer.k(PrivacyRule.class), serializer.D());
    }
}
