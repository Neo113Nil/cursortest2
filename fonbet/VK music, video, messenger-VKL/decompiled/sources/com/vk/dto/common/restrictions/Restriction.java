package com.vk.dto.common.restrictions;

import com.vk.core.serialize.Serializer;
import xsna.epx;
import xsna.qoy;
import xsna.urd0;

/* compiled from: Restriction.kt */
/* loaded from: classes18.dex */
public abstract class Restriction extends Serializer.StreamParcelableAdapter {
    public final String b;
    public final String c;
    public final boolean d;
    public final RestrictionButton e;

    public Restriction(String str, String str2, boolean z, RestrictionButton restrictionButton) {
        this.b = str;
        this.c = str2;
        this.d = z;
        this.e = restrictionButton;
    }

    public final boolean Ab() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!getClass().equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        Restriction restriction = (Restriction) obj;
        return epx.f(this.b, restriction.b) && epx.f(this.c, restriction.c) && this.d == restriction.d && epx.f(this.e, restriction.e);
    }

    public final String getTitle() {
        return this.b;
    }

    public final int hashCode() {
        int b = qoy.b(urd0.a(this.b.hashCode() * 31, 31, this.c), 31, this.d);
        RestrictionButton restrictionButton = this.e;
        return b + (restrictionButton != null ? restrictionButton.hashCode() : 0);
    }

    public String toString() {
        return "Restriction(title='" + this.b + "', text='" + this.c + "', isBlurred=" + this.d + ", button=" + this.e + ')';
    }

    public final RestrictionButton zb() {
        return this.e;
    }
}
