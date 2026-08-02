package com.google.ads.interactivemedia.v3.impl.data;

import com.google.ads.interactivemedia.v3.impl.data.ObstructionListData;
import defpackage.a70;
import defpackage.q3p;
import defpackage.wt3;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
final class AutoValue_ObstructionListData extends ObstructionListData {
    private final q3p obstructions;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static final class Builder extends ObstructionListData.Builder {
        private q3p obstructions;

        @Override // com.google.ads.interactivemedia.v3.impl.data.ObstructionListData.Builder
        public ObstructionListData build() {
            q3p q3pVar = this.obstructions;
            byte[] bArr = null;
            if (q3pVar != null) {
                return new AutoValue_ObstructionListData(q3pVar, bArr);
            }
            a70.r("Missing required properties: obstructions");
            return null;
        }

        @Override // com.google.ads.interactivemedia.v3.impl.data.ObstructionListData.Builder
        public ObstructionListData.Builder obstructions(List<ObstructionListData.ObstructionData> list) {
            this.obstructions = q3p.u(list);
            return this;
        }
    }

    private AutoValue_ObstructionListData(q3p q3pVar) {
        this.obstructions = q3pVar;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ObstructionListData) {
            return this.obstructions.equals(((ObstructionListData) obj).obstructions());
        }
        return false;
    }

    public int hashCode() {
        return this.obstructions.hashCode() ^ 1000003;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.ObstructionListData
    public q3p obstructions() {
        return this.obstructions;
    }

    public String toString() {
        String valueOf = String.valueOf(this.obstructions);
        return wt3.m("ObstructionListData{obstructions=", valueOf, new StringBuilder(valueOf.length() + 34), "}");
    }

    public /* synthetic */ AutoValue_ObstructionListData(q3p q3pVar, byte[] bArr) {
        this(q3pVar);
    }
}
