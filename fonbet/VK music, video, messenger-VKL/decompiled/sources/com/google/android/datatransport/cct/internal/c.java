package com.google.android.datatransport.cct.internal;

import androidx.annotation.Nullable;
import com.google.android.datatransport.cct.internal.ComplianceData;
import xsna.cm5;
import xsna.mfq;

/* compiled from: AutoValue_ComplianceData.java */
/* loaded from: classes.dex */
public final class c extends ComplianceData {
    public final mfq a;
    public final ComplianceData.ProductIdOrigin b;

    /* compiled from: AutoValue_ComplianceData.java */
    /* loaded from: classes12.dex */
    public static final class a extends ComplianceData.a {
        public cm5 a;
        public ComplianceData.ProductIdOrigin b;

        public final c a() {
            return new c(this.a, this.b);
        }

        public final a b(@Nullable cm5 cm5Var) {
            this.a = cm5Var;
            return this;
        }

        public final a c(@Nullable ComplianceData.ProductIdOrigin productIdOrigin) {
            this.b = productIdOrigin;
            return this;
        }
    }

    public c(cm5 cm5Var, ComplianceData.ProductIdOrigin productIdOrigin) {
        this.a = cm5Var;
        this.b = productIdOrigin;
    }

    @Override // com.google.android.datatransport.cct.internal.ComplianceData
    @Nullable
    public final mfq a() {
        return this.a;
    }

    @Override // com.google.android.datatransport.cct.internal.ComplianceData
    @Nullable
    public final ComplianceData.ProductIdOrigin b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ComplianceData)) {
            return false;
        }
        ComplianceData complianceData = (ComplianceData) obj;
        mfq mfqVar = this.a;
        if (mfqVar == null) {
            if (complianceData.a() != null) {
                return false;
            }
        } else if (!mfqVar.equals(complianceData.a())) {
            return false;
        }
        ComplianceData.ProductIdOrigin productIdOrigin = this.b;
        return productIdOrigin == null ? complianceData.b() == null : productIdOrigin.equals(complianceData.b());
    }

    public final int hashCode() {
        mfq mfqVar = this.a;
        int hashCode = ((mfqVar == null ? 0 : mfqVar.hashCode()) ^ 1000003) * 1000003;
        ComplianceData.ProductIdOrigin productIdOrigin = this.b;
        return (productIdOrigin != null ? productIdOrigin.hashCode() : 0) ^ hashCode;
    }

    public final String toString() {
        return "ComplianceData{privacyContext=" + this.a + ", productIdOrigin=" + this.b + "}";
    }
}
