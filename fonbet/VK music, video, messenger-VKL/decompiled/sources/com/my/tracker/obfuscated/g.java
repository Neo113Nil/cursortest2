package com.my.tracker.obfuscated;

import xsna.vu5;

/* loaded from: classes.dex */
public final class g {
    public final String a;
    public final int b;

    public g(String str, int i) {
        this.a = str;
        this.b = i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("AppSetIdData{id='");
        sb.append(this.a);
        sb.append("', scope=");
        return vu5.b(sb, this.b, '}');
    }
}
