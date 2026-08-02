package x3;

import C.o0;
import android.text.TextUtils;
import g.C6594f;
import j3.t;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes8.dex */
public final class d implements t.a {

    /* renamed from: a, reason: collision with root package name */
    public final String f104951a;

    /* renamed from: b, reason: collision with root package name */
    public final String f104952b;

    /* renamed from: c, reason: collision with root package name */
    public final List<a> f104953c;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final int f104954a;

        /* renamed from: b, reason: collision with root package name */
        public final int f104955b;

        /* renamed from: c, reason: collision with root package name */
        public final String f104956c;

        /* renamed from: d, reason: collision with root package name */
        public final String f104957d;

        /* renamed from: e, reason: collision with root package name */
        public final String f104958e;

        /* renamed from: f, reason: collision with root package name */
        public final String f104959f;

        public a(String str, String str2, int i11, int i12, String str3, String str4) {
            this.f104954a = i11;
            this.f104955b = i12;
            this.f104956c = str;
            this.f104957d = str2;
            this.f104958e = str3;
            this.f104959f = str4;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && a.class == obj.getClass()) {
                a aVar = (a) obj;
                if (this.f104954a == aVar.f104954a && this.f104955b == aVar.f104955b && TextUtils.equals(this.f104956c, aVar.f104956c) && TextUtils.equals(this.f104957d, aVar.f104957d) && TextUtils.equals(this.f104958e, aVar.f104958e) && TextUtils.equals(this.f104959f, aVar.f104959f)) {
                    return true;
                }
            }
            return false;
        }

        public final int hashCode() {
            int i11 = ((this.f104954a * 31) + this.f104955b) * 31;
            String str = this.f104956c;
            int hashCode = (i11 + (str != null ? str.hashCode() : 0)) * 31;
            String str2 = this.f104957d;
            int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            String str3 = this.f104958e;
            int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
            String str4 = this.f104959f;
            return hashCode3 + (str4 != null ? str4.hashCode() : 0);
        }
    }

    public d(String str, String str2, List<a> list) {
        this.f104951a = str;
        this.f104952b = str2;
        this.f104953c = Collections.unmodifiableList(new ArrayList(list));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && d.class == obj.getClass()) {
            d dVar = (d) obj;
            if (TextUtils.equals(this.f104951a, dVar.f104951a) && TextUtils.equals(this.f104952b, dVar.f104952b) && this.f104953c.equals(dVar.f104953c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f104951a;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f104952b;
        return this.f104953c.hashCode() + ((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("HlsTrackMetadataEntry");
        String str = this.f104951a;
        sb2.append(str != null ? o0.c(C6594f.b(" [", str, ", "), this.f104952b, "]") : "");
        return sb2.toString();
    }
}
