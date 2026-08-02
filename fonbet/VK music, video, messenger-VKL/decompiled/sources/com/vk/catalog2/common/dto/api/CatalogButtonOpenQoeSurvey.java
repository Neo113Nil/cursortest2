package com.vk.catalog2.common.dto.api;

import com.vk.core.serialize.Serializer;
import xsna.epx;
import xsna.vu5;
import xsna.zcl;

/* compiled from: CatalogButton.kt */
/* loaded from: classes16.dex */
public final class CatalogButtonOpenQoeSurvey extends CatalogButton {
    public static final Serializer.c<CatalogButtonOpenQoeSurvey> CREATOR = new a();
    public final String c;
    public final String d;
    public final String e;
    public final int f;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<CatalogButtonOpenQoeSurvey> {
        @Override // com.vk.core.serialize.Serializer.c
        public final CatalogButtonOpenQoeSurvey a(Serializer serializer) {
            String H = serializer.H();
            if (H == null) {
                H = "";
            }
            return new CatalogButtonOpenQoeSurvey(H, serializer.H(), serializer.H(), serializer.u());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CatalogButtonOpenQoeSurvey[i];
        }
    }

    public /* synthetic */ CatalogButtonOpenQoeSurvey(String str, String str2, String str3, int i, int i2, zcl zclVar) {
        this(str, (i2 & 2) != 0 ? null : str2, (i2 & 4) != 0 ? null : str3, i);
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.j0(this.c);
        serializer.j0(this.d);
        serializer.j0(this.e);
        serializer.S(this.f);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CatalogButtonOpenQoeSurvey)) {
            return false;
        }
        CatalogButtonOpenQoeSurvey catalogButtonOpenQoeSurvey = (CatalogButtonOpenQoeSurvey) obj;
        return epx.f(this.c, catalogButtonOpenQoeSurvey.c) && epx.f(this.d, catalogButtonOpenQoeSurvey.d) && epx.f(this.e, catalogButtonOpenQoeSurvey.e) && this.f == catalogButtonOpenQoeSurvey.f;
    }

    @Override // com.vk.catalog2.common.dto.api.CatalogButton
    public final String getType() {
        return this.c;
    }

    public final int hashCode() {
        int hashCode = this.c.hashCode() * 31;
        String str = this.d;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.e;
        return Integer.hashCode(this.f) + ((hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CatalogButtonOpenQoeSurvey(type=");
        sb.append(this.c);
        sb.append(", hintId=");
        sb.append(this.d);
        sb.append(", consumeReason=");
        sb.append(this.e);
        sb.append(", surveyId=");
        return vu5.b(sb, this.f, ')');
    }

    @Override // com.vk.catalog2.common.dto.api.CatalogButton
    public final String zb() {
        return this.d;
    }

    public CatalogButtonOpenQoeSurvey(String str, String str2, String str3, int i) {
        super(null);
        this.c = str;
        this.d = str2;
        this.e = str3;
        this.f = i;
    }
}
