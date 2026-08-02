package com.vk.stat.scheme;

import com.vk.stat.scheme.SchemeStat$NavigationScreenInfoItem;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: SchemeStat.kt */
/* loaded from: classes5.dex */
public final class SchemeStat$TypeAutotestItem implements SchemeStat$NavigationScreenInfoItem.b {

    @pmi0("test_class")
    private final String testClass;

    @pmi0("test_name")
    private final String testName;

    /* JADX WARN: Multi-variable type inference failed */
    public SchemeStat$TypeAutotestItem() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SchemeStat$TypeAutotestItem)) {
            return false;
        }
        SchemeStat$TypeAutotestItem schemeStat$TypeAutotestItem = (SchemeStat$TypeAutotestItem) obj;
        return epx.f(this.testClass, schemeStat$TypeAutotestItem.testClass) && epx.f(this.testName, schemeStat$TypeAutotestItem.testName);
    }

    public final int hashCode() {
        String str = this.testClass;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.testName;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TypeAutotestItem(testClass=");
        sb.append(this.testClass);
        sb.append(", testName=");
        return ho8.a(sb, this.testName, ')');
    }

    public SchemeStat$TypeAutotestItem(String str, String str2) {
        this.testClass = str;
        this.testName = str2;
    }

    public /* synthetic */ SchemeStat$TypeAutotestItem(String str, String str2, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2);
    }
}
