package com.moloco.sdk.internal.publisher.nativead;

import com.mbridge.msdk.foundation.download.Command;
import com.moloco.sdk.internal.MolocoLogger;
import com.moloco.sdk.internal.services.b0;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.h0;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.r;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.v;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.f1;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.g1;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.o;
import defpackage.a70;
import defpackage.ak9;
import defpackage.aq4;
import defpackage.b28;
import defpackage.bwh;
import defpackage.db2;
import defpackage.ez2;
import defpackage.fsf;
import defpackage.gk9;
import defpackage.ij9;
import defpackage.ku3;
import defpackage.l6g;
import defpackage.lu3;
import defpackage.ml4;
import defpackage.n8k;
import defpackage.n9e;
import defpackage.o89;
import defpackage.pm0;
import defpackage.s9a;
import defpackage.sq3;
import defpackage.t89;
import defpackage.vh9;
import defpackage.wj9;
import defpackage.xw3;
import defpackage.y6a;
import defpackage.yaa;
import defpackage.yj9;
import defpackage.zi9;
import java.io.File;
import java.io.FileOutputStream;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.text.Charsets;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class n implements o {
    public Object a;
    public Object b;
    public final Object c;
    public final Object d;

    public n(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.k kVar, b0 b0Var, com.moloco.sdk.internal.error.b bVar, vh9 vh9Var) {
        kVar.getClass();
        b0Var.getClass();
        bVar.getClass();
        vh9Var.getClass();
        this.a = kVar;
        this.b = b0Var;
        this.c = bVar;
        this.d = vh9Var;
    }

    public static com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.h a(File file, aq4 aq4Var, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.c cVar) {
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.f fVar = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.f.h;
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.f fVar2 = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.f.e;
        int i = aq4Var.d().a;
        if (400 <= i && i < 500) {
            MolocoLogger.error$default(MolocoLogger.INSTANCE, "ChunkedMediaDownloader", "Failed to fetch media from url: " + aq4Var.b().c().getUrl() + ", status: " + aq4Var.d(), null, false, 12, null);
            cVar.a(new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.e(fVar2));
            return fVar2;
        }
        if (500 > i || i >= 600) {
            return new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.g(file);
        }
        MolocoLogger.error$default(MolocoLogger.INSTANCE, "ChunkedMediaDownloader", "Failed to fetch media from url: " + aq4Var.b().c().getUrl() + ", status: " + aq4Var.d(), null, false, 12, null);
        cVar.a(new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.e(fVar));
        return fVar;
    }

    public static void e(File file, aq4 aq4Var) {
        o89 a = aq4Var.a();
        List list = zi9.a;
        String str = a.get(Command.HTTP_HEADER_ETAG);
        if (str != null) {
            MolocoLogger.info$default(MolocoLogger.INSTANCE, "ChunkedMediaDownloader", "ETag: ".concat(str), null, false, 12, null);
            b28.b(i(file), str, Charsets.UTF_8);
        } else {
            MolocoLogger.warn$default(MolocoLogger.INSTANCE, "ChunkedMediaDownloader", "No ETag in header", null, false, 12, null);
            i(file).delete();
        }
    }

    public static boolean h(File file) {
        return file.exists() && !j(file).exists();
    }

    public static File i(File file) {
        return new File(file.getParent(), file.getName() + ".etag");
    }

    public static File j(File file) {
        return new File(file.getParent(), file.getName() + ".range");
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object b(File file, aq4 aq4Var, sq3 sq3Var) {
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.b bVar;
        lu3 lu3Var;
        int i;
        Object K;
        aq4 aq4Var2;
        File file2;
        Object A;
        n nVar;
        aq4 aq4Var3;
        n nVar2 = this;
        if (sq3Var instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.b) {
            bVar = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.b) sq3Var;
            int i2 = bVar.w;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                bVar.w = i2 - Integer.MIN_VALUE;
                Object obj = bVar.u;
                lu3Var = lu3.a;
                i = bVar.w;
                if (i != 0) {
                    y6a.M(obj);
                    MolocoLogger molocoLogger = MolocoLogger.INSTANCE;
                    MolocoLogger.info$default(molocoLogger, "ChunkedMediaDownloader", "Range header not supported, downloading full file", null, false, 12, null);
                    if (file.exists()) {
                        MolocoLogger.info$default(molocoLogger, "ChunkedMediaDownloader", "Deleting existing file and fully re-downloading it", null, false, 12, null);
                        file.delete();
                    }
                    bVar.r = nVar2;
                    bVar.s = file;
                    bVar.t = aq4Var;
                    bVar.w = 1;
                    K = ml4.K(aq4Var, bVar);
                    if (K != lu3Var) {
                        aq4Var2 = aq4Var;
                        file2 = file;
                    }
                    return lu3Var;
                }
                if (i != 1) {
                    if (i != 2) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    aq4Var3 = bVar.t;
                    file2 = bVar.s;
                    nVar = bVar.r;
                    y6a.M(obj);
                    long longValue = ((Number) obj).longValue();
                    MolocoLogger molocoLogger2 = MolocoLogger.INSTANCE;
                    nVar.getClass();
                    MolocoLogger.info$default(molocoLogger2, "ChunkedMediaDownloader", "Downloaded full response: " + xw3.B(aq4Var3) + " and saved to disk: " + longValue + " bytes, file size: " + file2.length(), null, false, 12, null);
                    return Unit.a;
                }
                aq4 aq4Var4 = bVar.t;
                file2 = bVar.s;
                n nVar3 = bVar.r;
                y6a.M(obj);
                aq4Var2 = aq4Var4;
                nVar2 = nVar3;
                K = obj;
                ez2 P = n9e.P(file2);
                bVar.r = nVar2;
                bVar.s = file2;
                bVar.t = aq4Var2;
                bVar.w = 2;
                A = l6g.A((db2) K, P, bVar);
                if (A != lu3Var) {
                    nVar = nVar2;
                    aq4Var3 = aq4Var2;
                    obj = A;
                    long longValue2 = ((Number) obj).longValue();
                    MolocoLogger molocoLogger22 = MolocoLogger.INSTANCE;
                    nVar.getClass();
                    MolocoLogger.info$default(molocoLogger22, "ChunkedMediaDownloader", "Downloaded full response: " + xw3.B(aq4Var3) + " and saved to disk: " + longValue2 + " bytes, file size: " + file2.length(), null, false, 12, null);
                    return Unit.a;
                }
                return lu3Var;
            }
        }
        bVar = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.b(nVar2, sq3Var);
        Object obj2 = bVar.u;
        lu3Var = lu3.a;
        i = bVar.w;
        if (i != 0) {
        }
        ez2 P2 = n9e.P(file2);
        bVar.r = nVar2;
        bVar.s = file2;
        bVar.t = aq4Var2;
        bVar.w = 2;
        A = l6g.A((db2) K, P2, bVar);
        if (A != lu3Var) {
        }
        return lu3Var;
    }

    public Object d(String str, final long j, final int i, final String str2, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.c cVar) {
        vh9 vh9Var = (vh9) this.d;
        yj9 yj9Var = new yj9();
        pm0 pm0Var = ak9.a;
        n8k.b(yj9Var.a, str);
        gk9.a(yj9Var, new com.moloco.sdk.acm.db.e(this, 6));
        new Function1() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.a
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                t89 t89Var = (t89) obj;
                t89Var.getClass();
                StringBuilder sb = new StringBuilder("bytes=");
                long j2 = j;
                sb.append(j2);
                sb.append('-');
                sb.append(Math.min(j2 + ((k) this.a).a, i));
                String sb2 = sb.toString();
                MolocoLogger molocoLogger = MolocoLogger.INSTANCE;
                List list = zi9.a;
                MolocoLogger.info$default(molocoLogger, "ChunkedMediaDownloader", "Adding Range header: ".concat(sb2), null, false, 12, null);
                t89Var.i(Command.HTTP_HEADER_RANGE, sb2);
                String str3 = str2;
                if (str3 != null) {
                    MolocoLogger.info$default(molocoLogger, "ChunkedMediaDownloader", "Adding If-Range header: ".concat(str3), null, false, 12, null);
                    t89Var.i("If-Range", str3);
                    MolocoLogger.info$default(molocoLogger, "ChunkedMediaDownloader", "Adding ETag header: ".concat(str3), null, false, 12, null);
                    t89Var.i(Command.HTTP_HEADER_ETAG, str3);
                }
                return Unit.a;
            }
        }.invoke(yj9Var.a());
        yj9Var.d(ij9.b);
        return new wj9(yj9Var, vh9Var).i(cVar);
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.o
    public void destroy() {
        fsf fsfVar = (fsf) this.d;
        fsf fsfVar2 = (fsf) this.c;
        fsf fsfVar3 = (fsf) this.b;
        Integer num = (Integer) this.a;
        if (num != null) {
            v.a.remove(Integer.valueOf(num.intValue()));
        }
        r rVar = (r) fsfVar3.a;
        if (rVar != null) {
            rVar.destroy();
        }
        fsfVar3.a = null;
        h0 h0Var = (h0) fsfVar2.a;
        if (h0Var != null) {
            h0Var.destroy();
        }
        fsfVar2.a = null;
        ku3 ku3Var = (ku3) fsfVar.a;
        if (ku3Var != null) {
            s9a.o(ku3Var, null);
        }
        fsfVar.a = null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x007e, code lost:
    
        if (r1 == r3) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0080, code lost:
    
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x005a, code lost:
    
        if (r4 == r3) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x007e -> B:11:0x0081). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object f(File file, aq4 aq4Var, sq3 sq3Var) {
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.d dVar;
        int i;
        File file2;
        Object K;
        n nVar;
        db2 db2Var;
        File file3;
        n nVar2 = this;
        if (sq3Var instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.d) {
            dVar = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.d) sq3Var;
            int i2 = dVar.w;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                dVar.w = i2 - Integer.MIN_VALUE;
                Object obj = dVar.u;
                lu3 lu3Var = lu3.a;
                i = dVar.w;
                if (i != 0) {
                    y6a.M(obj);
                    dVar.r = nVar2;
                    file2 = file;
                    dVar.s = file2;
                    dVar.w = 1;
                    K = ml4.K(aq4Var, dVar);
                } else if (i == 1) {
                    File file4 = dVar.s;
                    n nVar3 = dVar.r;
                    y6a.M(obj);
                    file2 = file4;
                    nVar2 = nVar3;
                    K = obj;
                } else {
                    if (i != 2) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    db2Var = dVar.t;
                    file3 = dVar.s;
                    nVar = dVar.r;
                    y6a.M(obj);
                    bwh bwhVar = (bwh) obj;
                    while (true) {
                        bwhVar.getClass();
                        if (bwhVar.w()) {
                            break;
                        }
                        byte[] M = yaa.M(bwhVar, -1);
                        file3.getClass();
                        FileOutputStream fileOutputStream = new FileOutputStream(file3, true);
                        try {
                            fileOutputStream.write(M);
                            Unit unit = Unit.a;
                            fileOutputStream.close();
                            MolocoLogger molocoLogger = MolocoLogger.INSTANCE;
                            nVar.getClass();
                            MolocoLogger.info$default(molocoLogger, "ChunkedMediaDownloader", "dst file length: " + file3.length() + " bytes", null, false, 12, null);
                        } finally {
                        }
                    }
                    if (db2Var.h()) {
                        return Unit.a;
                    }
                    dVar.r = nVar;
                    dVar.s = file3;
                    dVar.t = db2Var;
                    dVar.w = 2;
                    obj = l6g.P(db2Var, ((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.k) nVar.a).a * 2, dVar);
                }
                nVar = nVar2;
                db2Var = (db2) K;
                file3 = file2;
                if (db2Var.h()) {
                }
            }
        }
        dVar = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.d(nVar2, sq3Var);
        Object obj2 = dVar.u;
        lu3 lu3Var2 = lu3.a;
        i = dVar.w;
        if (i != 0) {
        }
        nVar = nVar2;
        db2Var = (db2) K;
        file3 = file2;
        if (db2Var.h()) {
        }
    }

    public void g() {
        List list = (List) this.a;
        if (list != null) {
            ((f1) this.d).a(list, null, null, null);
            this.a = null;
        }
    }

    public n(Integer num, fsf fsfVar, fsf fsfVar2, fsf fsfVar3) {
        this.a = num;
        this.b = fsfVar;
        this.c = fsfVar2;
        this.d = fsfVar3;
    }

    public n(List list, List list2, com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.k kVar) {
        this.a = list;
        this.b = list2;
        this.c = kVar;
        this.d = new LinkedHashSet();
    }

    public n(List list, List list2, List list3) {
        f1 b = g1.b();
        b.getClass();
        this.a = list;
        this.b = list2;
        this.c = list3;
        this.d = b;
    }
}
