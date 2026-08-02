package io.appmetrica.analytics.logger.common.impl;

import java.util.ArrayList;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final e f15083a;

    public b() {
        this(new e());
    }

    public final ArrayList a(String str) {
        String[] split = str.split("\\n");
        ArrayList arrayList = new ArrayList();
        for (String str2 : split) {
            int i5 = 0;
            while (str2.length() > i5) {
                int length = str2.length();
                int i10 = i5 + 3800;
                int min = Math.min(length, i10);
                if (length > i10) {
                    int a7 = e.a(this.f15083a.f15088a.matcher(str2), i5, min);
                    length = a7 == -1 ? min : a7 + 1;
                }
                arrayList.add(str2.substring(i5, length));
                i5 = length;
            }
        }
        return arrayList;
    }

    public b(e eVar) {
        this.f15083a = eVar;
    }
}
