package com.google.ads.interactivemedia.v3.impl.data;

import android.view.View;
import androidx.annotation.Nullable;
import com.google.ads.interactivemedia.v3.impl.data.FriendlyObstructionImpl;
import defpackage.a70;
import defpackage.bf3;
import defpackage.bs8;
import defpackage.wt3;
import defpackage.yhk;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
final class AutoValue_FriendlyObstructionImpl extends FriendlyObstructionImpl {

    @Nullable
    private final String detailedReason;
    private final bs8 purpose;
    private final View view;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static final class Builder implements FriendlyObstructionImpl.Builder {
        private String detailedReason;
        private bs8 purpose;
        private View view;

        @Override // com.google.ads.interactivemedia.v3.impl.data.FriendlyObstructionImpl.Builder
        public FriendlyObstructionImpl build() {
            bs8 bs8Var;
            View view = this.view;
            byte[] bArr = null;
            if (view != null && (bs8Var = this.purpose) != null) {
                return new AutoValue_FriendlyObstructionImpl(view, bs8Var, this.detailedReason, bArr);
            }
            StringBuilder sb = new StringBuilder();
            if (this.view == null) {
                sb.append(" view");
            }
            if (this.purpose == null) {
                sb.append(" purpose");
            }
            a70.r("Missing required properties:".concat(sb.toString()));
            return null;
        }

        @Override // com.google.ads.interactivemedia.v3.impl.data.FriendlyObstructionImpl.Builder
        public FriendlyObstructionImpl.Builder detailedReason(@Nullable String str) {
            this.detailedReason = str;
            return this;
        }

        @Override // com.google.ads.interactivemedia.v3.impl.data.FriendlyObstructionImpl.Builder
        public FriendlyObstructionImpl.Builder purpose(bs8 bs8Var) {
            if (bs8Var != null) {
                this.purpose = bs8Var;
                return this;
            }
            yhk.s("Null purpose");
            return null;
        }

        @Override // com.google.ads.interactivemedia.v3.impl.data.FriendlyObstructionImpl.Builder
        public FriendlyObstructionImpl.Builder view(View view) {
            if (view != null) {
                this.view = view;
                return this;
            }
            yhk.s("Null view");
            return null;
        }
    }

    private AutoValue_FriendlyObstructionImpl(View view, bs8 bs8Var, @Nullable String str) {
        this.view = view;
        this.purpose = bs8Var;
        this.detailedReason = str;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.FriendlyObstructionImpl
    @Nullable
    public String detailedReason() {
        return this.detailedReason;
    }

    public boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof FriendlyObstructionImpl) {
            FriendlyObstructionImpl friendlyObstructionImpl = (FriendlyObstructionImpl) obj;
            if (this.view.equals(friendlyObstructionImpl.view()) && this.purpose.equals(friendlyObstructionImpl.purpose()) && ((str = this.detailedReason) != null ? str.equals(friendlyObstructionImpl.detailedReason()) : friendlyObstructionImpl.detailedReason() == null)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int hashCode = ((this.view.hashCode() ^ 1000003) * 1000003) ^ this.purpose.hashCode();
        String str = this.detailedReason;
        return (str == null ? 0 : str.hashCode()) ^ (hashCode * 1000003);
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.FriendlyObstructionImpl
    public bs8 purpose() {
        return this.purpose;
    }

    public String toString() {
        bs8 bs8Var = this.purpose;
        String valueOf = String.valueOf(this.view);
        String valueOf2 = String.valueOf(bs8Var);
        int length = valueOf.length();
        int length2 = valueOf2.length();
        String str = this.detailedReason;
        StringBuilder sb = new StringBuilder(wt3.h(length, 39, length2, 17, String.valueOf(str).length()) + 1);
        bf3.v(sb, "FriendlyObstructionImpl{view=", valueOf, ", purpose=", valueOf2);
        return wt3.m(", detailedReason=", str, sb, "}");
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.FriendlyObstructionImpl
    public View view() {
        return this.view;
    }

    public /* synthetic */ AutoValue_FriendlyObstructionImpl(View view, bs8 bs8Var, String str, byte[] bArr) {
        this(view, bs8Var, str);
    }
}
