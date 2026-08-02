package r1;

import android.text.TextUtils;
import b1.C2334C;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class t implements C2334C.a {

    /* renamed from: a, reason: collision with root package name */
    public final String f63906a;

    /* renamed from: b, reason: collision with root package name */
    public final String f63907b;

    /* renamed from: c, reason: collision with root package name */
    public final List f63908c;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final int f63909a;

        /* renamed from: b, reason: collision with root package name */
        public final int f63910b;

        /* renamed from: c, reason: collision with root package name */
        public final String f63911c;

        /* renamed from: d, reason: collision with root package name */
        public final String f63912d;

        /* renamed from: e, reason: collision with root package name */
        public final String f63913e;

        /* renamed from: f, reason: collision with root package name */
        public final String f63914f;

        public a(int i10, int i11, String str, String str2, String str3, String str4) {
            this.f63909a = i10;
            this.f63910b = i11;
            this.f63911c = str;
            this.f63912d = str2;
            this.f63913e = str3;
            this.f63914f = str4;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && a.class == obj.getClass()) {
                a aVar = (a) obj;
                if (this.f63909a == aVar.f63909a && this.f63910b == aVar.f63910b && TextUtils.equals(this.f63911c, aVar.f63911c) && TextUtils.equals(this.f63912d, aVar.f63912d) && TextUtils.equals(this.f63913e, aVar.f63913e) && TextUtils.equals(this.f63914f, aVar.f63914f)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            int i10 = ((this.f63909a * 31) + this.f63910b) * 31;
            String str = this.f63911c;
            int hashCode = (i10 + (str != null ? str.hashCode() : 0)) * 31;
            String str2 = this.f63912d;
            int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            String str3 = this.f63913e;
            int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
            String str4 = this.f63914f;
            return hashCode3 + (str4 != null ? str4.hashCode() : 0);
        }
    }

    public t(String str, String str2, List list) {
        this.f63906a = str;
        this.f63907b = str2;
        this.f63908c = Collections.unmodifiableList(new ArrayList(list));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && t.class == obj.getClass()) {
            t tVar = (t) obj;
            if (TextUtils.equals(this.f63906a, tVar.f63906a) && TextUtils.equals(this.f63907b, tVar.f63907b) && this.f63908c.equals(tVar.f63908c)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        String str = this.f63906a;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f63907b;
        return ((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + this.f63908c.hashCode();
    }

    public String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("HlsTrackMetadataEntry");
        if (this.f63906a != null) {
            str = " [" + this.f63906a + ", " + this.f63907b + "]";
        } else {
            str = "";
        }
        sb2.append(str);
        return sb2.toString();
    }
}
