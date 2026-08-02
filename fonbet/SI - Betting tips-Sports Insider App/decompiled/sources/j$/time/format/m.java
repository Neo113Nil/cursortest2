package j$.time.format;

import java.text.ParsePosition;
import kotlin.jvm.internal.CharCompanionObject;

/* loaded from: classes2.dex */
public class m {

    /* renamed from: a, reason: collision with root package name */
    public String f17421a;

    /* renamed from: b, reason: collision with root package name */
    public String f17422b;

    /* renamed from: c, reason: collision with root package name */
    public final char f17423c;

    /* renamed from: d, reason: collision with root package name */
    public m f17424d;

    /* renamed from: e, reason: collision with root package name */
    public m f17425e;

    public boolean b(char c2, char c8) {
        return c2 == c8;
    }

    public m(String str, String str2, m mVar) {
        this.f17421a = str;
        this.f17422b = str2;
        this.f17424d = mVar;
        if (str.isEmpty()) {
            this.f17423c = CharCompanionObject.MAX_VALUE;
        } else {
            this.f17423c = this.f17421a.charAt(0);
        }
    }

    public final String c(CharSequence charSequence, ParsePosition parsePosition) {
        int index = parsePosition.getIndex();
        int length = charSequence.length();
        if (!e(charSequence, index, length)) {
            return null;
        }
        int length2 = this.f17421a.length() + index;
        m mVar = this.f17424d;
        if (mVar != null && length2 != length) {
            while (true) {
                if (b(mVar.f17423c, charSequence.charAt(length2))) {
                    parsePosition.setIndex(length2);
                    String c2 = mVar.c(charSequence, parsePosition);
                    if (c2 != null) {
                        return c2;
                    }
                } else {
                    mVar = mVar.f17425e;
                    if (mVar == null) {
                        break;
                    }
                }
            }
        }
        parsePosition.setIndex(length2);
        return this.f17422b;
    }

    public m d(String str, String str2, m mVar) {
        return new m(str, str2, mVar);
    }

    public boolean e(CharSequence charSequence, int i5, int i10) {
        if (charSequence instanceof String) {
            return ((String) charSequence).startsWith(this.f17421a, i5);
        }
        int length = this.f17421a.length();
        if (length > i10 - i5) {
            return false;
        }
        int i11 = 0;
        while (true) {
            int i12 = length - 1;
            if (length <= 0) {
                return true;
            }
            int i13 = i11 + 1;
            int i14 = i5 + 1;
            if (!b(this.f17421a.charAt(i11), charSequence.charAt(i5))) {
                return false;
            }
            i5 = i14;
            length = i12;
            i11 = i13;
        }
    }

    public final boolean a(String str, String str2) {
        int i5 = 0;
        while (i5 < str.length() && i5 < this.f17421a.length() && b(str.charAt(i5), this.f17421a.charAt(i5))) {
            i5++;
        }
        if (i5 == this.f17421a.length()) {
            if (i5 < str.length()) {
                String substring = str.substring(i5);
                for (m mVar = this.f17424d; mVar != null; mVar = mVar.f17425e) {
                    if (b(mVar.f17423c, substring.charAt(0))) {
                        return mVar.a(substring, str2);
                    }
                }
                m d10 = d(substring, str2, null);
                d10.f17425e = this.f17424d;
                this.f17424d = d10;
                return true;
            }
            this.f17422b = str2;
            return true;
        }
        m d11 = d(this.f17421a.substring(i5), this.f17422b, this.f17424d);
        this.f17421a = str.substring(0, i5);
        this.f17424d = d11;
        if (i5 < str.length()) {
            this.f17424d.f17425e = d(str.substring(i5), str2, null);
            this.f17422b = null;
            return true;
        }
        this.f17422b = str2;
        return true;
    }
}
