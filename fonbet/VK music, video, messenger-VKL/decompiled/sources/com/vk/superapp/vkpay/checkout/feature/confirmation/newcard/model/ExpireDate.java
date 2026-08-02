package com.vk.superapp.vkpay.checkout.feature.confirmation.newcard.model;

import androidx.credentials.exceptions.publickeycredential.DomExceptionUtils;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.text.Regex;
import xsna.c5g;
import xsna.drm0;
import xsna.v1v;

/* compiled from: ExpireDate.kt */
/* loaded from: classes6.dex */
public final class ExpireDate implements Serializable {
    public static final Regex b = new Regex("\\d{2}/\\d{2}");
    private final int month;
    private final int year;

    /* compiled from: ExpireDate.kt */
    public static final class a {
        public static ExpireDate a(String str) {
            if (!ExpireDate.b.f(str)) {
                throw new IllegalArgumentException("Date must have dd/mm format");
            }
            List c0 = drm0.c0(str, new String[]{DomExceptionUtils.SEPARATOR}, 0, 6);
            ArrayList arrayList = new ArrayList(c5g.u(c0, 10));
            Iterator it = c0.iterator();
            while (it.hasNext()) {
                arrayList.add(Integer.valueOf(Integer.parseInt((String) it.next())));
            }
            return new ExpireDate(((java.lang.Number) arrayList.get(0)).intValue(), ((java.lang.Number) arrayList.get(1)).intValue());
        }
    }

    public ExpireDate(int i, int i2) {
        this.month = i;
        this.year = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ExpireDate)) {
            return false;
        }
        ExpireDate expireDate = (ExpireDate) obj;
        return this.month == expireDate.month && this.year == expireDate.year;
    }

    public final int hashCode() {
        return Integer.hashCode(this.year) + (Integer.hashCode(this.month) * 31);
    }

    public final String toString() {
        String valueOf;
        int i = this.month;
        if (i < 10) {
            valueOf = "0" + this.month;
        } else {
            valueOf = String.valueOf(i);
        }
        StringBuilder b2 = v1v.b(valueOf, '/');
        b2.append(this.year);
        return b2.toString();
    }
}
