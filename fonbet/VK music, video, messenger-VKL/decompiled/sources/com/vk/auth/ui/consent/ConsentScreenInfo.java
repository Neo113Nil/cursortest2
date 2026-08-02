package com.vk.auth.ui.consent;

import com.vk.auth.main.TermsLink;
import com.vk.core.serialize.Serializer;
import com.vk.superapp.api.dto.auth.VkAuthAppScope;
import java.util.List;
import xsna.epx;
import xsna.ms9;
import xsna.urd0;

/* compiled from: ConsentScreenInfo.kt */
/* loaded from: classes15.dex */
public final class ConsentScreenInfo extends Serializer.StreamParcelableAdapter {
    public static final Serializer.c<ConsentScreenInfo> CREATOR = new a();
    public final Integer b;
    public final String c;
    public final String d;
    public final List<VkAuthAppScope> e;
    public final List<TermsLink> f;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<ConsentScreenInfo> {
        @Override // com.vk.core.serialize.Serializer.c
        public final ConsentScreenInfo a(Serializer serializer) {
            return new ConsentScreenInfo(serializer.v(), serializer.H(), serializer.H(), serializer.l(VkAuthAppScope.class.getClassLoader()), serializer.B(TermsLink.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ConsentScreenInfo[i];
        }
    }

    public ConsentScreenInfo(Integer num, String str, String str2, List<VkAuthAppScope> list, List<TermsLink> list2) {
        this.b = num;
        this.c = str;
        this.d = str2;
        this.e = list;
        this.f = list2;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.V(this.b);
        serializer.j0(this.c);
        serializer.j0(this.d);
        serializer.W(this.e);
        serializer.f0(this.f);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ConsentScreenInfo)) {
            return false;
        }
        ConsentScreenInfo consentScreenInfo = (ConsentScreenInfo) obj;
        return epx.f(this.b, consentScreenInfo.b) && epx.f(this.c, consentScreenInfo.c) && epx.f(this.d, consentScreenInfo.d) && epx.f(this.e, consentScreenInfo.e) && epx.f(this.f, consentScreenInfo.f);
    }

    public final int hashCode() {
        Integer num = this.b;
        int a2 = urd0.a(urd0.a((num == null ? 0 : num.hashCode()) * 31, 31, this.c), 31, this.d);
        List<VkAuthAppScope> list = this.e;
        return this.f.hashCode() + ((a2 + (list != null ? list.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ConsentScreenInfo(clientId=");
        sb.append(this.b);
        sb.append(", clientName=");
        sb.append(this.c);
        sb.append(", clientIconUrl=");
        sb.append(this.d);
        sb.append(", scopeList=");
        sb.append(this.e);
        sb.append(", listOfPolicyLinks=");
        return ms9.a(')', sb, this.f);
    }
}
