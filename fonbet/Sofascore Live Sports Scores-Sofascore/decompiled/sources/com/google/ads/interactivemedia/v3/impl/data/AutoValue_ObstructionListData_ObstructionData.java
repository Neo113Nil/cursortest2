package com.google.ads.interactivemedia.v3.impl.data;

import androidx.annotation.Nullable;
import com.google.ads.interactivemedia.v3.impl.data.ObstructionListData;
import defpackage.a70;
import defpackage.bf3;
import defpackage.bs8;
import defpackage.yhk;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
final class AutoValue_ObstructionListData_ObstructionData extends ObstructionListData.ObstructionData {
    private final boolean attached;
    private final BoundingRectData bounds;

    @Nullable
    private final String detailedReason;
    private final boolean hidden;
    private final bs8 purpose;
    private final String type;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static final class Builder extends ObstructionListData.ObstructionData.Builder {
        private boolean attached;
        private BoundingRectData bounds;
        private String detailedReason;
        private boolean hidden;
        private bs8 purpose;
        private byte set$0;
        private String type;

        @Override // com.google.ads.interactivemedia.v3.impl.data.ObstructionListData.ObstructionData.Builder
        public ObstructionListData.ObstructionData.Builder attached(boolean z) {
            this.attached = z;
            this.set$0 = (byte) (this.set$0 | 1);
            return this;
        }

        @Override // com.google.ads.interactivemedia.v3.impl.data.ObstructionListData.ObstructionData.Builder
        public ObstructionListData.ObstructionData.Builder bounds(BoundingRectData boundingRectData) {
            if (boundingRectData != null) {
                this.bounds = boundingRectData;
                return this;
            }
            yhk.s("Null bounds");
            return null;
        }

        @Override // com.google.ads.interactivemedia.v3.impl.data.ObstructionListData.ObstructionData.Builder
        public ObstructionListData.ObstructionData build() {
            BoundingRectData boundingRectData;
            bs8 bs8Var;
            String str;
            if (this.set$0 == 3 && (boundingRectData = this.bounds) != null && (bs8Var = this.purpose) != null && (str = this.type) != null) {
                return new AutoValue_ObstructionListData_ObstructionData(this.attached, boundingRectData, this.detailedReason, this.hidden, bs8Var, str, null);
            }
            StringBuilder sb = new StringBuilder();
            if ((this.set$0 & 1) == 0) {
                sb.append(" attached");
            }
            if (this.bounds == null) {
                sb.append(" bounds");
            }
            if ((this.set$0 & 2) == 0) {
                sb.append(" hidden");
            }
            if (this.purpose == null) {
                sb.append(" purpose");
            }
            if (this.type == null) {
                sb.append(" type");
            }
            a70.r("Missing required properties:".concat(sb.toString()));
            return null;
        }

        @Override // com.google.ads.interactivemedia.v3.impl.data.ObstructionListData.ObstructionData.Builder
        public ObstructionListData.ObstructionData.Builder detailedReason(@Nullable String str) {
            this.detailedReason = str;
            return this;
        }

        @Override // com.google.ads.interactivemedia.v3.impl.data.ObstructionListData.ObstructionData.Builder
        public ObstructionListData.ObstructionData.Builder hidden(boolean z) {
            this.hidden = z;
            this.set$0 = (byte) (this.set$0 | 2);
            return this;
        }

        @Override // com.google.ads.interactivemedia.v3.impl.data.ObstructionListData.ObstructionData.Builder
        public ObstructionListData.ObstructionData.Builder purpose(bs8 bs8Var) {
            if (bs8Var != null) {
                this.purpose = bs8Var;
                return this;
            }
            yhk.s("Null purpose");
            return null;
        }

        @Override // com.google.ads.interactivemedia.v3.impl.data.ObstructionListData.ObstructionData.Builder
        public ObstructionListData.ObstructionData.Builder type(String str) {
            if (str != null) {
                this.type = str;
                return this;
            }
            yhk.s("Null type");
            return null;
        }
    }

    private AutoValue_ObstructionListData_ObstructionData(boolean z, BoundingRectData boundingRectData, @Nullable String str, boolean z2, bs8 bs8Var, String str2) {
        this.attached = z;
        this.bounds = boundingRectData;
        this.detailedReason = str;
        this.hidden = z2;
        this.purpose = bs8Var;
        this.type = str2;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.ObstructionListData.ObstructionData
    public boolean attached() {
        return this.attached;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.ObstructionListData.ObstructionData
    public BoundingRectData bounds() {
        return this.bounds;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.ObstructionListData.ObstructionData
    @Nullable
    public String detailedReason() {
        return this.detailedReason;
    }

    public boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof ObstructionListData.ObstructionData) {
            ObstructionListData.ObstructionData obstructionData = (ObstructionListData.ObstructionData) obj;
            if (this.attached == obstructionData.attached() && this.bounds.equals(obstructionData.bounds()) && ((str = this.detailedReason) != null ? str.equals(obstructionData.detailedReason()) : obstructionData.detailedReason() == null) && this.hidden == obstructionData.hidden() && this.purpose.equals(obstructionData.purpose()) && this.type.equals(obstructionData.type())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int hashCode = (((true != this.attached ? 1237 : 1231) ^ 1000003) * 1000003) ^ this.bounds.hashCode();
        String str = this.detailedReason;
        return this.type.hashCode() ^ (((((((hashCode * 1000003) ^ (str == null ? 0 : str.hashCode())) * 1000003) ^ (true != this.hidden ? 1237 : 1231)) * 1000003) ^ this.purpose.hashCode()) * 1000003);
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.ObstructionListData.ObstructionData
    public boolean hidden() {
        return this.hidden;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.ObstructionListData.ObstructionData
    public bs8 purpose() {
        return this.purpose;
    }

    public String toString() {
        bs8 bs8Var = this.purpose;
        String valueOf = String.valueOf(this.bounds);
        String valueOf2 = String.valueOf(bs8Var);
        boolean z = this.attached;
        int length = String.valueOf(z).length();
        int length2 = valueOf.length();
        String str = this.detailedReason;
        int length3 = String.valueOf(str).length();
        boolean z2 = this.hidden;
        int length4 = String.valueOf(z2).length();
        int length5 = valueOf2.length();
        String str2 = this.type;
        StringBuilder sb = new StringBuilder(length + 34 + length2 + 17 + length3 + 9 + length4 + 10 + length5 + 7 + String.valueOf(str2).length() + 1);
        sb.append("ObstructionData{attached=");
        sb.append(z);
        sb.append(", bounds=");
        sb.append(valueOf);
        sb.append(", detailedReason=");
        sb.append(str);
        sb.append(", hidden=");
        sb.append(z2);
        bf3.v(sb, ", purpose=", valueOf2, ", type=", str2);
        sb.append("}");
        return sb.toString();
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.ObstructionListData.ObstructionData
    public String type() {
        return this.type;
    }

    public /* synthetic */ AutoValue_ObstructionListData_ObstructionData(boolean z, BoundingRectData boundingRectData, String str, boolean z2, bs8 bs8Var, String str2, byte[] bArr) {
        this(z, boundingRectData, str, z2, bs8Var, str2);
    }
}
