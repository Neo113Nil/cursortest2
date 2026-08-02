package com.vk.superapp.vkpay.checkout.feature.success.states;

import java.io.Serializable;
import xsna.vu5;

/* compiled from: StatusState.kt */
/* loaded from: classes6.dex */
public final class Icon implements Serializable {
    private final int iconRes;
    private final int tint;

    public Icon(int i, int i2) {
        this.iconRes = i;
        this.tint = i2;
    }

    public final int d() {
        return this.iconRes;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Icon)) {
            return false;
        }
        Icon icon = (Icon) obj;
        return this.iconRes == icon.iconRes && this.tint == icon.tint;
    }

    public final int g() {
        return this.tint;
    }

    public final int hashCode() {
        return Integer.hashCode(this.tint) + (Integer.hashCode(this.iconRes) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Icon(iconRes=");
        sb.append(this.iconRes);
        sb.append(", tint=");
        return vu5.b(sb, this.tint, ')');
    }
}
