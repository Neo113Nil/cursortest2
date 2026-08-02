package com.applovin.impl;

import android.text.SpannedString;
import com.applovin.impl.t2;

/* loaded from: classes2.dex */
public class x4 extends t2 {
    public x4(String str) {
        super(t2.c.SECTION);
        this.c = new SpannedString(str);
    }

    public String toString() {
        return "SectionListItemViewModel{text=" + ((Object) this.c) + "}";
    }
}
