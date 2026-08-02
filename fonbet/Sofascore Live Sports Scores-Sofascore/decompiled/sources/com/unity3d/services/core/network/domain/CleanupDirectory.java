package com.unity3d.services.core.network.domain;

import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.unity3d.ads.core.log.Logger;
import defpackage.a65;
import defpackage.b5h;
import defpackage.c28;
import defpackage.c38;
import defpackage.d38;
import defpackage.i5h;
import defpackage.km5;
import defpackage.oh0;
import defpackage.qs2;
import defpackage.w4h;
import defpackage.z85;
import java.io.File;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.io.FileWalkDirection;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J!\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0086\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/unity3d/services/core/network/domain/CleanupDirectory;", "", "logger", "Lcom/unity3d/ads/core/log/Logger;", "<init>", "(Lcom/unity3d/ads/core/log/Logger;)V", "invoke", "", "directory", "Ljava/io/File;", "sizeLimitMb", "", "ageLimitMs", "", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class CleanupDirectory {

    @NotNull
    private final Logger logger;

    public CleanupDirectory(@NotNull Logger logger) {
        logger.getClass();
        this.logger = logger;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Pair invoke$lambda$3(Pair pair, File file) {
        pair.getClass();
        file.getClass();
        return new Pair(Long.valueOf(((Number) pair.a).longValue() - file.length()), CollectionsKt.x0((List) pair.b, file));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v12, types: [java.util.List] */
    public final void invoke(@NotNull File directory, int sizeLimitMb, long ageLimitMs) {
        ?? r10;
        directory.getClass();
        if (!directory.exists() || !directory.isDirectory()) {
            this.logger.debug("Directory does not exist or is not a directory: " + directory + ", nothing to clean up.");
            return;
        }
        d38 g = i5h.g(c28.e(directory, FileWalkDirection.a), CleanupDirectory$invoke$cachedFiles$1.INSTANCE);
        c38 c38Var = new c38(g);
        long j = 0;
        long j2 = 0;
        while (c38Var.hasNext()) {
            j2 += ((File) c38Var.next()).length();
        }
        long currentTimeMillis = System.currentTimeMillis();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        c38 c38Var2 = new c38(g);
        while (c38Var2.hasNext()) {
            Object next = c38Var2.next();
            if (((File) next).lastModified() + ageLimitMs < currentTimeMillis) {
                arrayList.add(next);
            } else {
                arrayList2.add(next);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            j += ((File) it.next()).length();
        }
        long j3 = j2 - j;
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            ((File) it2.next()).delete();
        }
        long j4 = sizeLimitMb * ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
        if (j3 > j4) {
            Object obj = null;
            w4h a = b5h.a(new z85(new Pair(Long.valueOf(j3), km5.a), new a65(new oh0(arrayList2, 1), new Comparator() { // from class: com.unity3d.services.core.network.domain.CleanupDirectory$invoke$$inlined$sortedBy$1
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.util.Comparator
                public final int compare(T t, T t2) {
                    return Long.valueOf(((File) t).lastModified()).compareTo(Long.valueOf(((File) t2).lastModified()));
                }
            }, 2), new qs2(1), null));
            while (true) {
                if (!a.hasNext()) {
                    break;
                }
                Object next2 = a.next();
                if (((Number) ((Pair) next2).a).longValue() <= j4) {
                    obj = next2;
                    break;
                }
            }
            Pair pair = (Pair) obj;
            if (pair != null && (r10 = (List) pair.b) != 0) {
                arrayList2 = r10;
            }
            Iterator it3 = arrayList2.iterator();
            while (it3.hasNext()) {
                ((File) it3.next()).delete();
            }
        }
    }
}
