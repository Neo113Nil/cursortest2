package com.vk.auth.entername;

import android.net.Uri;
import com.vk.superapp.core.api.models.VkGender;
import com.vk.superapp.multiaccount.api.SimpleDate;
import xsna.alb0;
import xsna.epx;
import xsna.urd0;

/* compiled from: EnterProfileContract.kt */
/* loaded from: classes15.dex */
public final class a {
    public final String a;
    public final String b;
    public final SimpleDate c;
    public final VkGender d;
    public final Uri e;
    public static final C0399a f = new C0399a();
    private static final a STUB = new a("", "", SimpleDate.e.getSTUB(), VkGender.UNDEFINED, null);

    /* compiled from: EnterProfileContract.kt */
    /* renamed from: com.vk.auth.entername.a$a, reason: collision with other inner class name */
    public static final class C0399a {
        public final a getSTUB() {
            return a.STUB;
        }
    }

    public a(String str, String str2, SimpleDate simpleDate, VkGender vkGender, Uri uri) {
        this.a = str;
        this.b = str2;
        this.c = simpleDate;
        this.d = vkGender;
        this.e = uri;
    }

    public static a b(a aVar, String str, String str2, SimpleDate simpleDate, VkGender vkGender, Uri uri, int i) {
        if ((i & 1) != 0) {
            str = aVar.a;
        }
        String str3 = str;
        if ((i & 2) != 0) {
            str2 = aVar.b;
        }
        String str4 = str2;
        if ((i & 4) != 0) {
            simpleDate = aVar.c;
        }
        SimpleDate simpleDate2 = simpleDate;
        if ((i & 8) != 0) {
            vkGender = aVar.d;
        }
        VkGender vkGender2 = vkGender;
        if ((i & 16) != 0) {
            uri = aVar.e;
        }
        aVar.getClass();
        return new a(str3, str4, simpleDate2, vkGender2, uri);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return epx.f(this.a, aVar.a) && epx.f(this.b, aVar.b) && epx.f(this.c, aVar.c) && this.d == aVar.d && epx.f(this.e, aVar.e);
    }

    public final int hashCode() {
        int hashCode = (this.d.hashCode() + ((this.c.hashCode() + urd0.a(this.a.hashCode() * 31, 31, this.b)) * 31)) * 31;
        Uri uri = this.e;
        return hashCode + (uri == null ? 0 : uri.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ProfileData(firstName=");
        sb.append(this.a);
        sb.append(", lastName=");
        sb.append(this.b);
        sb.append(", birthday=");
        sb.append(this.c);
        sb.append(", gender=");
        sb.append(this.d);
        sb.append(", avatarUri=");
        return alb0.b(sb, this.e, ')');
    }
}
