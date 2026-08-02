package com.ironsource;

import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class Ne {

    @Nullable
    private final String a;

    @Nullable
    private final List<String> b;
    private final boolean c;

    public Ne(@Nullable String str, @Nullable List<String> list, boolean z) {
        this.a = str;
        this.b = list;
        this.c = z;
    }

    public final boolean a() {
        boolean z = this.c;
        List<String> list = this.b;
        if (z) {
            if (list != null && !list.isEmpty()) {
                for (String str : list) {
                    String str2 = this.a;
                    if (str2 != null && kotlin.text.c.v(str2, str, false)) {
                        return true;
                    }
                }
            }
            return false;
        }
        if (list != null && !list.isEmpty()) {
            for (String str3 : list) {
                String str4 = this.a;
                if (str4 != null && StringsKt.J(str4, str3, false)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Nullable
    public final String b() {
        return this.a;
    }

    public /* synthetic */ Ne(String str, List list, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, list, (i & 4) != 0 ? false : z);
    }
}
