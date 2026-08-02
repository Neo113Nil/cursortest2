package com.vk.profile.design.compose.header;

import com.vk.profile.design.compose.header.AuthorHeaderConfig;
import com.vk.profile.design.compose.header.a;
import com.vk.profile.design.compose.header.b;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import xsna.drm0;
import xsna.e43;

/* compiled from: AuthorHeaderConfig.kt */
/* loaded from: classes5.dex */
public final class c {
    public static final int a(List list) {
        int i = 0;
        if (list == null || list.isEmpty()) {
            return 0;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (!drm0.N((String) it.next()) && (i = i + 1) < 0) {
                e43.s();
                throw null;
            }
        }
        return i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final String b(AuthorHeaderConfig.Header header, boolean z) {
        String str = null;
        if (!z || !(header.b instanceof b.C1661b)) {
            return null;
        }
        a aVar = header.a;
        if (aVar instanceof a.C1660a) {
            Iterator it = ((a.C1660a) aVar).a.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                if (!drm0.N((String) next)) {
                    str = next;
                    break;
                }
            }
            str = str;
        } else {
            if (!(aVar instanceof a.b)) {
                throw new NoWhenBranchMatchedException();
            }
            String str2 = ((a.b) aVar).a;
            if (!drm0.N(str2)) {
                str = str2;
            }
        }
        return str == null ? "" : str;
    }
}
