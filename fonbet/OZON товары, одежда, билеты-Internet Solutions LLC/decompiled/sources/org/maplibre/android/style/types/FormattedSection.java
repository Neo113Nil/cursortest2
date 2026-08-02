package org.maplibre.android.style.types;

import C.o0;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import java.util.Arrays;
import java.util.HashMap;
import org.maplibre.android.utils.b;

@Keep
/* loaded from: classes10.dex */
public class FormattedSection {
    private Number fontScale;
    private String[] fontStack;
    private String text;
    private String textColor;

    public FormattedSection(@NonNull String str) {
        this(str, null, null, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            FormattedSection formattedSection = (FormattedSection) obj;
            String str = this.text;
            if (str == null ? formattedSection.text != null : !str.equals(formattedSection.text)) {
                return false;
            }
            Number number = this.fontScale;
            if (number == null ? formattedSection.fontScale != null : !number.equals(formattedSection.fontScale)) {
                return false;
            }
            if (!Arrays.equals(this.fontStack, formattedSection.fontStack)) {
                return false;
            }
            String str2 = this.textColor;
            String str3 = formattedSection.textColor;
            if (str2 != null) {
                return str2.equals(str3);
            }
            if (str3 == null) {
                return true;
            }
        }
        return false;
    }

    public Number getFontScale() {
        return this.fontScale;
    }

    public String[] getFontStack() {
        return this.fontStack;
    }

    @NonNull
    public String getText() {
        return this.text;
    }

    public String getTextColor() {
        return this.textColor;
    }

    public int hashCode() {
        String str = this.text;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        Number number = this.fontScale;
        int hashCode2 = (((hashCode + (number != null ? number.hashCode() : 0)) * 31) + Arrays.hashCode(this.fontStack)) * 31;
        String str2 = this.textColor;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public void setFontScale(Number number) {
        this.fontScale = number;
    }

    public void setFontStack(String[] strArr) {
        this.fontStack = strArr;
    }

    public void setTextColor(String str) {
        this.textColor = str;
    }

    Object[] toArray() {
        HashMap hashMap = new HashMap();
        hashMap.put("font-scale", this.fontScale);
        hashMap.put("text-font", this.fontStack);
        hashMap.put("text-color", this.textColor);
        return new Object[]{this.text, hashMap};
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("FormattedSection{text='");
        sb2.append(this.text);
        sb2.append("', fontScale=");
        sb2.append(this.fontScale);
        sb2.append(", fontStack=");
        sb2.append(Arrays.toString(this.fontStack));
        sb2.append(", textColor='");
        return o0.c(sb2, this.textColor, "'}");
    }

    public FormattedSection(@NonNull String str, Number number, String[] strArr, String str2) {
        this.text = str;
        this.fontScale = number;
        this.fontStack = strArr;
        this.textColor = str2;
    }

    public void setTextColor(int i11) {
        this.textColor = b.a(i11);
    }

    void setTextColor(@NonNull Object obj) {
        setTextColor((String) obj);
    }

    @Deprecated
    public FormattedSection(@NonNull String str, Number number, String[] strArr) {
        this(str, number, strArr, null);
    }

    @Deprecated
    public FormattedSection(@NonNull String str, Number number) {
        this(str, number, null, null);
    }

    @Deprecated
    public FormattedSection(@NonNull String str, String[] strArr) {
        this(str, null, strArr, null);
    }
}
