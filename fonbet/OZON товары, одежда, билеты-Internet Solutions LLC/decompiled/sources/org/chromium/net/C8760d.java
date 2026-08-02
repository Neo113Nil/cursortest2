package org.chromium.net;

import java.util.Comparator;
import org.chromium.net.g;

/* renamed from: org.chromium.net.d, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C8760d implements Comparator<g.a> {
    @Override // java.util.Comparator
    public final int compare(g.a aVar, g.a aVar2) {
        int signum;
        g.a aVar3 = aVar;
        g.a aVar4 = aVar2;
        if (g.PROVIDER_NAME_FALLBACK.equals(aVar3.f78696a.getName())) {
            return 1;
        }
        if (g.PROVIDER_NAME_FALLBACK.equals(aVar4.f78696a.getName())) {
            return -1;
        }
        String version = aVar3.f78696a.getVersion();
        String version2 = aVar4.f78696a.getVersion();
        if (version == null || version2 == null) {
            throw new IllegalArgumentException("The input values cannot be null");
        }
        String[] split = version.split("\\.");
        String[] split2 = version2.split("\\.");
        for (int i11 = 0; i11 < split.length && i11 < split2.length; i11++) {
            try {
                int parseInt = Integer.parseInt(split[i11]);
                int parseInt2 = Integer.parseInt(split2[i11]);
                if (parseInt != parseInt2) {
                    signum = Integer.signum(parseInt - parseInt2);
                    break;
                }
            } catch (NumberFormatException e11) {
                throw new IllegalArgumentException(Sh.b.c("Unable to convert version segments into integers: ", split[i11], " & ", split2[i11]), e11);
            }
        }
        signum = Integer.signum(split.length - split2.length);
        return -signum;
    }
}
