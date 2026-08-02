package com.vk.superapp.vksteps.utils;

import xsna.epx;
import xsna.pmi0;
import xsna.shy;
import xsna.tn;
import xsna.urd0;

/* compiled from: GoogleFitResponseParser.kt */
/* loaded from: classes6.dex */
public final class FieldInfo {

    @pmi0("format")
    private final int format;

    @pmi0("isOptional")
    private final Boolean isOptional;

    @pmi0("name")
    private final String name;

    @pmi0("value")
    private final String value;

    public FieldInfo(String str, String str2, int i, Boolean bool) {
        this.name = str;
        this.value = str2;
        this.format = i;
        this.isOptional = bool;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FieldInfo)) {
            return false;
        }
        FieldInfo fieldInfo = (FieldInfo) obj;
        return epx.f(this.name, fieldInfo.name) && epx.f(this.value, fieldInfo.value) && this.format == fieldInfo.format && epx.f(this.isOptional, fieldInfo.isOptional);
    }

    public final int hashCode() {
        int a = shy.a(this.format, urd0.a(this.name.hashCode() * 31, 31, this.value), 31);
        Boolean bool = this.isOptional;
        return a + (bool == null ? 0 : bool.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FieldInfo(name=");
        sb.append(this.name);
        sb.append(", value=");
        sb.append(this.value);
        sb.append(", format=");
        sb.append(this.format);
        sb.append(", isOptional=");
        return tn.a(sb, this.isOptional, ')');
    }
}
