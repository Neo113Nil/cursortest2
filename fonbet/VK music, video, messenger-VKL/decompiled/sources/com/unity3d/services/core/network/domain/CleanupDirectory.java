package com.unity3d.services.core.network.domain;

import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.unity3d.ads.core.log.Logger;
import java.io.File;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import xsna.g5z;
import xsna.hfr;
import xsna.i5g;
import xsna.j5g;
import xsna.jw5;
import xsna.kc4;
import xsna.nbr;
import xsna.pli0;
import xsna.qli0;
import xsna.rli0;
import xsna.vki0;

/* compiled from: CleanupDirectory.kt */
/* loaded from: classes14.dex */
public final class CleanupDirectory {
    private final Logger logger;

    public CleanupDirectory(Logger logger) {
        this.logger = logger;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Pair invoke$lambda$3(Pair pair, File file) {
        return new Pair(Long.valueOf(((Number) pair.d()).longValue() - file.length()), j5g.v0(file, (List) pair.g()));
    }

    public final void invoke(File file, int i, long j) {
        List list;
        if (!file.exists() || !file.isDirectory()) {
            this.logger.debug("Directory does not exist or is not a directory: " + file + ", nothing to clean up.");
            return;
        }
        hfr j2 = rli0.j(nbr.u(file), CleanupDirectory$invoke$cachedFiles$1.INSTANCE);
        hfr.a aVar = new hfr.a(j2);
        long j3 = 0;
        long j4 = 0;
        while (aVar.hasNext()) {
            j4 += ((File) aVar.next()).length();
        }
        long currentTimeMillis = System.currentTimeMillis();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        hfr.a aVar2 = new hfr.a(j2);
        while (aVar2.hasNext()) {
            Object next = aVar2.next();
            if (((File) next).lastModified() + j < currentTimeMillis) {
                arrayList.add(next);
            } else {
                arrayList2.add(next);
            }
        }
        Pair pair = new Pair(arrayList, arrayList2);
        List list2 = (List) pair.d();
        List list3 = (List) pair.g();
        List list4 = list2;
        Iterator it = list4.iterator();
        while (it.hasNext()) {
            j3 += ((File) it.next()).length();
        }
        long j5 = j4 - j3;
        Iterator it2 = list4.iterator();
        while (it2.hasNext()) {
            ((File) it2.next()).delete();
        }
        long j6 = i * ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
        if (j5 > j6) {
            Object obj = null;
            vki0 b = g5z.b(new pli0(new Pair(Long.valueOf(j5), EmptyList.b), new qli0(new i5g(list3), new Comparator() { // from class: com.unity3d.services.core.network.domain.CleanupDirectory$invoke$$inlined$sortedBy$1
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.util.Comparator
                public final int compare(T t, T t2) {
                    return jw5.b(Long.valueOf(((File) t).lastModified()), Long.valueOf(((File) t2).lastModified()));
                }
            }), new kc4((byte) 0, 1), null));
            while (true) {
                if (!b.hasNext()) {
                    break;
                }
                Object next2 = b.next();
                if (((Number) ((Pair) next2).d()).longValue() <= j6) {
                    obj = next2;
                    break;
                }
            }
            Pair pair2 = (Pair) obj;
            if (pair2 != null && (list = (List) pair2.g()) != null) {
                list3 = list;
            }
            Iterator it3 = list3.iterator();
            while (it3.hasNext()) {
                ((File) it3.next()).delete();
            }
        }
    }
}
