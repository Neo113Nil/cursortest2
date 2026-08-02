package com.ironsource.adqualitysdk.sdk.i;

import com.ironsource.adqualitysdk.sdk.StringFog;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.adqualitysdk.sdk.i.ᵛ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public abstract class AbstractC0857 extends AbstractC0287 {

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final AbstractC0287 f2874;

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final AbstractC0287 f2875;

    public AbstractC0857(AbstractC0287 abstractC0287, AbstractC0287 abstractC02872) {
        this.f2875 = abstractC0287;
        this.f2874 = abstractC02872;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0287
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!super.equals(obj)) {
            return false;
        }
        AbstractC0857 abstractC0857 = (AbstractC0857) obj;
        AbstractC0287 abstractC0287 = this.f2875;
        if (abstractC0287 == null ? abstractC0857.f2875 != null : !abstractC0287.equals(abstractC0857.f2875)) {
            return false;
        }
        AbstractC0287 abstractC02872 = this.f2874;
        return abstractC02872 != null ? abstractC02872.equals(abstractC0857.f2874) : abstractC0857.f2874 == null;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0287
    public int hashCode() {
        AbstractC0287 abstractC0287 = this.f2875;
        int hashCode = (abstractC0287 != null ? abstractC0287.hashCode() : 0) * 31;
        AbstractC0287 abstractC02872 = this.f2874;
        return hashCode + (abstractC02872 != null ? abstractC02872.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f2875.toString());
        sb.append(StringFog.decrypt("UQ==\n", "CoNnYDXmxXo=\n"));
        sb.append(this.f2874.toString());
        return AbstractC1133.m662("Gw==\n", "RvnTqrh+W2E=\n", sb);
    }
}
