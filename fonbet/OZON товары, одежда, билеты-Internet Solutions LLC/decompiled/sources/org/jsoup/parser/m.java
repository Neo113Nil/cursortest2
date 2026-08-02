package org.jsoup.parser;

import Of.C3707a;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.util.Objects;

/* loaded from: classes10.dex */
public final class m implements Cloneable {

    /* renamed from: a, reason: collision with root package name */
    String f79568a;

    /* renamed from: b, reason: collision with root package name */
    String f79569b;

    /* renamed from: c, reason: collision with root package name */
    String f79570c;

    /* renamed from: d, reason: collision with root package name */
    int f79571d;

    m(String str, String str2, String str3) {
        this.f79571d = 0;
        this.f79569b = str;
        this.f79570c = str2;
        this.f79568a = str3;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final m clone() {
        try {
            return (m) super.clone();
        } catch (CloneNotSupportedException e11) {
            throw new RuntimeException(e11);
        }
    }

    public final String b() {
        return this.f79569b;
    }

    public final boolean c(int i11) {
        return (i11 & this.f79571d) != 0;
    }

    public final boolean d() {
        return (this.f79571d & 4) != 0;
    }

    public final boolean e() {
        return (this.f79571d & 2) != 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return Objects.equals(this.f79569b, mVar.f79569b) && Objects.equals(this.f79568a, mVar.f79568a) && Objects.equals(this.f79570c, mVar.f79570c) && this.f79571d == mVar.f79571d;
    }

    public final boolean f() {
        return (this.f79571d & 4) == 0;
    }

    public final boolean g() {
        return (this.f79571d & 1) != 0;
    }

    public final boolean h() {
        int i11 = this.f79571d;
        return ((i11 & 16) == 0 && (i11 & 2) == 0) ? false : true;
    }

    public final int hashCode() {
        return Objects.hash(this.f79569b, this.f79568a);
    }

    public final String i() {
        return this.f79568a;
    }

    public final String j() {
        return this.f79570c;
    }

    public final boolean k() {
        return (this.f79571d & 64) != 0;
    }

    public final void l(int i11) {
        this.f79571d = i11 | this.f79571d | 1;
    }

    final I m() {
        if (c(UserVerificationMethods.USER_VERIFY_PATTERN)) {
            return I.Rcdata;
        }
        if (c(256)) {
            return I.Rawtext;
        }
        return null;
    }

    public final String toString() {
        return this.f79569b;
    }

    public m(String str) {
        this("#root", C3707a.b("#root"), str);
    }
}
