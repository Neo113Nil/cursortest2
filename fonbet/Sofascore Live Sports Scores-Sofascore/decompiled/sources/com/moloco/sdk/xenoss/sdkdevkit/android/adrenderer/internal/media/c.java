package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media;

import com.moloco.sdk.internal.MolocoLogger;
import com.moloco.sdk.internal.publisher.nativead.n;
import com.moloco.sdk.internal.services.b0;
import defpackage.a70;
import defpackage.aq4;
import defpackage.b28;
import defpackage.hoi;
import defpackage.ku3;
import defpackage.lu3;
import defpackage.ndd;
import defpackage.rq3;
import defpackage.xw3;
import defpackage.y6a;
import defpackage.zi9;
import java.io.File;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsKt;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class c extends hoi implements Function2 {
    public final /* synthetic */ File A;
    public final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.c B;
    public final /* synthetic */ String C;
    public int r;
    public int s;
    public int t;
    public int u;
    public long v;
    public String w;
    public int x;
    public final /* synthetic */ n y;
    public final /* synthetic */ String z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(n nVar, String str, File file, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.c cVar, String str2, rq3 rq3Var) {
        super(2, rq3Var);
        this.y = nVar;
        this.z = str;
        this.A = file;
        this.B = cVar;
        this.C = str2;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        return new c(this.y, this.z, this.A, this.B, this.C, rq3Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((c) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:125:0x0139 A[Catch: Exception -> 0x0469, TRY_LEAVE, TryCatch #2 {Exception -> 0x0469, blocks: (B:123:0x012e, B:125:0x0139, B:134:0x0190, B:136:0x019a, B:148:0x0122), top: B:147:0x0122 }] */
    /* JADX WARN: Removed duplicated region for block: B:129:0x015f A[Catch: Exception -> 0x0050, TryCatch #0 {Exception -> 0x0050, blocks: (B:10:0x0036, B:99:0x006b, B:102:0x0094, B:105:0x00b6, B:108:0x00cb, B:110:0x00de, B:112:0x00e8, B:114:0x00f1, B:117:0x00f7, B:119:0x00fd, B:121:0x0105, B:122:0x012c, B:127:0x013d, B:129:0x015f, B:131:0x0187, B:132:0x018a, B:146:0x0113), top: B:2:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0190 A[Catch: Exception -> 0x0469, TRY_ENTER, TryCatch #2 {Exception -> 0x0469, blocks: (B:123:0x012e, B:125:0x0139, B:134:0x0190, B:136:0x019a, B:148:0x0122), top: B:147:0x0122 }] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x01dd A[Catch: Exception -> 0x01e6, TryCatch #6 {Exception -> 0x01e6, blocks: (B:16:0x01b0, B:22:0x01d5, B:24:0x01dd, B:27:0x01ec), top: B:15:0x01b0 }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x01ec A[Catch: Exception -> 0x01e6, TRY_LEAVE, TryCatch #6 {Exception -> 0x01e6, blocks: (B:16:0x01b0, B:22:0x01d5, B:24:0x01dd, B:27:0x01ec), top: B:15:0x01b0 }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0255 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0256 A[Catch: Exception -> 0x02e9, TryCatch #3 {Exception -> 0x02e9, blocks: (B:41:0x024b, B:44:0x0256, B:46:0x029f, B:48:0x02e4, B:49:0x02ee, B:52:0x0321, B:55:0x0353, B:59:0x0373, B:61:0x038e, B:63:0x0393, B:65:0x03a5, B:70:0x030e, B:71:0x03ca, B:72:0x03cf, B:74:0x03d0, B:91:0x0444, B:93:0x0460, B:94:0x0463), top: B:40:0x024b }] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x038e A[Catch: Exception -> 0x02e9, TryCatch #3 {Exception -> 0x02e9, blocks: (B:41:0x024b, B:44:0x0256, B:46:0x029f, B:48:0x02e4, B:49:0x02ee, B:52:0x0321, B:55:0x0353, B:59:0x0373, B:61:0x038e, B:63:0x0393, B:65:0x03a5, B:70:0x030e, B:71:0x03ca, B:72:0x03cf, B:74:0x03d0, B:91:0x0444, B:93:0x0460, B:94:0x0463), top: B:40:0x024b }] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0393 A[Catch: Exception -> 0x02e9, TryCatch #3 {Exception -> 0x02e9, blocks: (B:41:0x024b, B:44:0x0256, B:46:0x029f, B:48:0x02e4, B:49:0x02ee, B:52:0x0321, B:55:0x0353, B:59:0x0373, B:61:0x038e, B:63:0x0393, B:65:0x03a5, B:70:0x030e, B:71:0x03ca, B:72:0x03cf, B:74:0x03d0, B:91:0x0444, B:93:0x0460, B:94:0x0463), top: B:40:0x024b }] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x03a5 A[Catch: Exception -> 0x02e9, TryCatch #3 {Exception -> 0x02e9, blocks: (B:41:0x024b, B:44:0x0256, B:46:0x029f, B:48:0x02e4, B:49:0x02ee, B:52:0x0321, B:55:0x0353, B:59:0x0373, B:61:0x038e, B:63:0x0393, B:65:0x03a5, B:70:0x030e, B:71:0x03ca, B:72:0x03cf, B:74:0x03d0, B:91:0x0444, B:93:0x0460, B:94:0x0463), top: B:40:0x024b }] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0444 A[Catch: Exception -> 0x02e9, TryCatch #3 {Exception -> 0x02e9, blocks: (B:41:0x024b, B:44:0x0256, B:46:0x029f, B:48:0x02e4, B:49:0x02ee, B:52:0x0321, B:55:0x0353, B:59:0x0373, B:61:0x038e, B:63:0x0393, B:65:0x03a5, B:70:0x030e, B:71:0x03ca, B:72:0x03cf, B:74:0x03d0, B:91:0x0444, B:93:0x0460, B:94:0x0463), top: B:40:0x024b }] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:75:0x0421 -> B:12:0x0428). Please report as a decompilation issue!!! */
    @Override // defpackage.h21
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        String str;
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.c cVar;
        int i;
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.a aVar;
        File file;
        long length;
        int i2;
        int i3;
        int i4;
        String a;
        long j;
        int i5;
        String a2;
        List split$default;
        String str2;
        String str3;
        String str4;
        f fVar;
        String str5;
        long j2;
        int i6;
        String str6;
        n nVar;
        int i7;
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.a aVar2;
        String str7;
        int i8;
        long j3;
        int i9;
        String str8;
        int i10;
        h a3;
        List split$default2;
        List split$default3;
        List split$default4;
        int parseInt;
        n nVar2;
        int i11;
        String str9;
        int i12;
        long j4;
        Object obj2;
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.c cVar2;
        long j5;
        String str10 = ": ";
        f fVar2 = f.n;
        String str11 = "Content-Range";
        lu3 lu3Var = lu3.a;
        int i13 = this.x;
        String str12 = this.z;
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.c cVar3 = this.B;
        File file2 = this.A;
        n nVar3 = this.y;
        try {
            if (i13 == 0) {
                y6a.M(obj);
                MolocoLogger molocoLogger = MolocoLogger.INSTANCE;
                MolocoLogger.info$default(molocoLogger, "ChunkedMediaDownloader", "Fetching asset from network: ".concat(str12), null, false, 12, null);
                try {
                    File j6 = n.j(file2);
                    a2 = j6.exists() ? b28.a(j6) : null;
                } catch (NumberFormatException e) {
                    e = e;
                }
                if (a2 != null) {
                    try {
                        split$default = StringsKt__StringsKt.split$default(a2, new String[]{"/"}, false, 0, 6, null);
                    } catch (NumberFormatException e2) {
                        e = e2;
                        NumberFormatException numberFormatException = e;
                        molocoLogger = MolocoLogger.INSTANCE;
                        MolocoLogger.error$default(molocoLogger, "ChunkedMediaDownloader", "Failed to read range file", numberFormatException, false, 8, null);
                        try {
                            n.j(file2).delete();
                            i = Integer.MAX_VALUE;
                            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.g gVar = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.i.a;
                            cVar3.a = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.f(file2, gVar);
                            aVar = cVar3.c;
                            if (aVar != null) {
                            }
                            file = file2;
                            length = file.length();
                            MolocoLogger.info$default(molocoLogger, "ChunkedMediaDownloader", "Previous tmpfile bytes: " + length, null, false, 12, null);
                            if (i == length) {
                            }
                        } catch (Exception e3) {
                            e = e3;
                            str = str12;
                            cVar = cVar3;
                            Exception exc = e;
                            f a4 = l.a(exc);
                            MolocoLogger.error$default(MolocoLogger.INSTANCE, "ChunkedMediaDownloader", "Failed to fetch media from url: " + str + " due to error: " + a4, exc, false, 8, null);
                            cVar.a(new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.e(a4));
                            return a4;
                        }
                    }
                    if (split$default != null && (str2 = (String) CollectionsKt.h0(split$default)) != null) {
                        i = Integer.parseInt(str2);
                        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.g gVar2 = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.i.a;
                        cVar3.a = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.f(file2, gVar2);
                        aVar = cVar3.c;
                        if (aVar != null) {
                            aVar.invoke(file2, gVar2);
                        }
                        file = file2;
                        length = file.length();
                        MolocoLogger.info$default(molocoLogger, "ChunkedMediaDownloader", "Previous tmpfile bytes: " + length, null, false, 12, null);
                        if (i == length) {
                            MolocoLogger.info$default(molocoLogger, "ChunkedMediaDownloader", "File already downloaded, skipping download", null, false, 12, null);
                            n.i(file).delete();
                            n.j(file).delete();
                            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.d dVar = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.d(file);
                            cVar3.a = dVar;
                            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.b bVar = cVar3.d;
                            if (bVar != null) {
                                bVar.invoke(dVar);
                            }
                            return new g(file);
                        }
                        File i14 = n.i(file);
                        i2 = -1;
                        i3 = 1;
                        i4 = i;
                        a = i14.exists() ? b28.a(i14) : null;
                        j = length;
                        i5 = 0;
                        if (i3 != 0) {
                        }
                    }
                }
                i = Integer.MAX_VALUE;
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.g gVar22 = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.i.a;
                cVar3.a = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.f(file2, gVar22);
                aVar = cVar3.c;
                if (aVar != null) {
                }
                file = file2;
                length = file.length();
                MolocoLogger.info$default(molocoLogger, "ChunkedMediaDownloader", "Previous tmpfile bytes: " + length, null, false, 12, null);
                if (i == length) {
                }
            } else if (i13 == 1) {
                i5 = this.t;
                long j7 = this.v;
                int i15 = this.s;
                int i16 = this.r;
                String str13 = this.w;
                y6a.M(obj);
                nVar2 = nVar3;
                i12 = i16;
                i11 = i15;
                str9 = str13;
                file = file2;
                str3 = str12;
                j4 = j7;
                obj2 = obj;
                if (((Boolean) obj2).booleanValue()) {
                }
            } else if (i13 == 2) {
                int i17 = this.t;
                long j8 = this.v;
                int i18 = this.s;
                int i19 = this.r;
                String str14 = this.w;
                y6a.M(obj);
                i9 = i17;
                i10 = i18;
                i8 = i19;
                str7 = str14;
                file = file2;
                cVar = cVar3;
                str8 = str12;
                nVar = nVar3;
                j3 = j8;
                fVar = fVar2;
                aq4 aq4Var = (aq4) obj;
                str = str8;
                a3 = n.a(file, aq4Var, cVar);
                long j9 = j3;
                if (!(a3 instanceof f)) {
                }
            } else if (i13 == 3) {
                int i20 = this.u;
                long j10 = this.v;
                i2 = this.t;
                int i21 = this.s;
                int i22 = this.r;
                String str15 = this.w;
                y6a.M(obj);
                str = str12;
                str4 = ": ";
                str5 = "Content-Range";
                i6 = i21;
                i4 = i22;
                file = file2;
                cVar = cVar3;
                str6 = str15;
                nVar = nVar3;
                i5 = i20;
                j2 = j10;
                fVar = fVar2;
                lu3 lu3Var2 = lu3Var;
                String str16 = str6;
                i7 = i6;
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.g gVar3 = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.g(file.length(), i4);
                cVar.a = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.f(file, gVar3);
                aVar2 = cVar.c;
                if (aVar2 != null) {
                }
                if (i7 == 0) {
                }
                if (i3 != 0) {
                }
            } else {
                if (i13 != 4) {
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                i5 = this.t;
                long j11 = this.v;
                int i23 = this.s;
                int i24 = this.r;
                String str17 = this.w;
                y6a.M(obj);
                str = str12;
                String str18 = ": ";
                fVar = fVar2;
                lu3 lu3Var3 = lu3Var;
                String str19 = str17;
                i4 = i24;
                i2 = i23;
                file = file2;
                cVar = cVar3;
                String str20 = "Content-Range";
                long j12 = j11;
                nVar = nVar3;
                nVar3 = nVar;
                j = j12;
                str10 = str18;
                str11 = str20;
                lu3Var = lu3Var3;
                cVar3 = cVar;
                fVar2 = fVar;
                i3 = 0;
                a = str19;
                str12 = str;
                if (i3 != 0) {
                    str3 = str12;
                    try {
                        b0 b0Var = (b0) nVar3.b;
                        this.w = a;
                        this.r = i4;
                        this.s = i2;
                        this.v = j;
                        this.t = i5;
                        long j13 = j;
                        this.x = 1;
                        obj2 = b0Var.a(5000L, this);
                        if (obj2 != lu3Var) {
                            String str21 = a;
                            nVar2 = nVar3;
                            i12 = i4;
                            i11 = i2;
                            str9 = str21;
                            j4 = j13;
                            if (((Boolean) obj2).booleanValue()) {
                                cVar3.a(new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.e(fVar2));
                                return fVar2;
                            }
                            try {
                                try {
                                    int i25 = i5 + 1;
                                    MolocoLogger molocoLogger2 = MolocoLogger.INSTANCE;
                                    StringBuilder sb = new StringBuilder();
                                    sb.append("Making request to fetch chunk: ");
                                    sb.append(i25);
                                    sb.append(" for remainingBytes: ");
                                    sb.append(i11);
                                    MolocoLogger.info$default(molocoLogger2, "ChunkedMediaDownloader", sb.toString(), null, false, 12, null);
                                    this.w = str9;
                                    this.r = i12;
                                    this.s = i11;
                                    this.v = j4;
                                    this.t = i25;
                                    this.x = 2;
                                    Object d = nVar.d(str8, j5, i12, str9, this);
                                    if (d != lu3Var) {
                                        try {
                                            i9 = i25;
                                            obj = d;
                                            i10 = i11;
                                            str7 = str9;
                                            i8 = i12;
                                            j3 = j5;
                                            fVar = fVar2;
                                            aq4 aq4Var2 = (aq4) obj;
                                            a3 = n.a(file, aq4Var2, cVar);
                                            long j92 = j3;
                                            if (!(a3 instanceof f)) {
                                                return a3;
                                            }
                                            n.e(file, aq4Var2);
                                            MolocoLogger molocoLogger3 = MolocoLogger.INSTANCE;
                                            StringBuilder sb2 = new StringBuilder();
                                            sb2.append("ResponseCode: ");
                                            sb2.append(aq4Var2.d().a);
                                            sb2.append(", ");
                                            List list = zi9.a;
                                            sb2.append("Content-Length");
                                            sb2.append(str10);
                                            sb2.append(xw3.B(aq4Var2));
                                            MolocoLogger.info$default(molocoLogger3, "ChunkedMediaDownloader", sb2.toString(), null, false, 12, null);
                                            String str22 = aq4Var2.a().get(str11);
                                            if (str22 != null) {
                                                MolocoLogger.info$default(molocoLogger3, "ChunkedMediaDownloader", "Content range header is available, " + str11 + str10 + str22, null, false, 12, null);
                                                b28.b(n.j(file), str22, Charsets.UTF_8);
                                                split$default2 = StringsKt__StringsKt.split$default(str22, new String[]{"/"}, false, 0, 6, null);
                                                int parseInt2 = Integer.parseInt((String) CollectionsKt.h0(split$default2));
                                                Long B = xw3.B(aq4Var2);
                                                long longValue = B != null ? B.longValue() : 0L;
                                                str4 = str10;
                                                str5 = str11;
                                                split$default3 = StringsKt__StringsKt.split$default(str22, new String[]{"/"}, false, 0, 6, null);
                                                String str23 = (String) CollectionsKt.Y(split$default3);
                                                boolean J = StringsKt.J(str23, "-", false);
                                                if (!J) {
                                                    parseInt = parseInt2;
                                                } else {
                                                    if (!J) {
                                                        throw new ndd();
                                                    }
                                                    split$default4 = StringsKt__StringsKt.split$default(str23, new String[]{"-"}, false, 0, 6, null);
                                                    parseInt = Integer.parseInt((String) CollectionsKt.h0(split$default4));
                                                }
                                                i2 = (parseInt2 - parseInt) - 1;
                                                MolocoLogger.info$default(molocoLogger3, "ChunkedMediaDownloader", "maxRange: " + parseInt2 + ", Response contentLength: " + longValue, null, false, 12, null);
                                                int i26 = i2 > 0 ? 1 : 0;
                                                j2 = j92 + longValue;
                                                this.w = str7;
                                                this.r = parseInt2;
                                                this.s = i26;
                                                this.t = i2;
                                                this.v = j2;
                                                this.u = i9;
                                                this.x = 3;
                                                if (nVar.f(file, aq4Var2, this) != lu3Var) {
                                                    String str24 = str7;
                                                    i4 = parseInt2;
                                                    i5 = i9;
                                                    i6 = i26;
                                                    str6 = str24;
                                                    lu3 lu3Var22 = lu3Var;
                                                    String str162 = str6;
                                                    i7 = i6;
                                                    com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.g gVar32 = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.g(file.length(), i4);
                                                    cVar.a = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.f(file, gVar32);
                                                    aVar2 = cVar.c;
                                                    if (aVar2 != null) {
                                                        aVar2.invoke(file, gVar32);
                                                    }
                                                    if (i7 == 0) {
                                                        MolocoLogger.info$default(MolocoLogger.INSTANCE, "ChunkedMediaDownloader", "Server has more data", null, false, 12, null);
                                                        nVar3 = nVar;
                                                        j = j2;
                                                        cVar3 = cVar;
                                                        str11 = str5;
                                                        fVar2 = fVar;
                                                        lu3Var = lu3Var22;
                                                        str12 = str;
                                                        a = str162;
                                                        i3 = i7;
                                                        str10 = str4;
                                                    } else {
                                                        MolocoLogger.info$default(MolocoLogger.INSTANCE, "ChunkedMediaDownloader", "Server does not have more data to send", null, false, 12, null);
                                                        nVar3 = nVar;
                                                        j = j2;
                                                        cVar3 = cVar;
                                                        str11 = str5;
                                                        fVar2 = fVar;
                                                        lu3Var = lu3Var22;
                                                        str12 = str;
                                                        a = str162;
                                                        i3 = i7;
                                                        str10 = str4;
                                                    }
                                                    if (i3 != 0) {
                                                        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.c cVar4 = cVar3;
                                                        n.i(file).delete();
                                                        n.j(file).delete();
                                                        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.d dVar2 = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.d(file);
                                                        cVar4.a = dVar2;
                                                        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.b bVar2 = cVar4.d;
                                                        if (bVar2 != null) {
                                                            bVar2.invoke(dVar2);
                                                        }
                                                        return new g(file);
                                                    }
                                                }
                                            } else {
                                                str18 = str10;
                                                StringBuilder sb3 = new StringBuilder();
                                                str20 = str11;
                                                sb3.append(str20);
                                                sb3.append(" is not available");
                                                MolocoLogger.warn$default(molocoLogger3, "ChunkedMediaDownloader", sb3.toString(), null, false, 12, null);
                                                ((com.moloco.sdk.internal.error.b) nVar.c).a("CONTENT_RANGE_NOT_AVAILABLE", new com.moloco.sdk.internal.error.a(this.C));
                                                this.w = str7;
                                                this.r = i8;
                                                this.s = i10;
                                                j12 = j92;
                                                this.v = j12;
                                                this.t = i9;
                                                this.x = 4;
                                                Object b = nVar.b(file, aq4Var2, this);
                                                lu3Var3 = lu3Var;
                                                if (b == lu3Var3) {
                                                    return lu3Var3;
                                                }
                                                int i27 = i8;
                                                i2 = i10;
                                                i5 = i9;
                                                str19 = str7;
                                                i4 = i27;
                                                nVar3 = nVar;
                                                j = j12;
                                                str10 = str18;
                                                str11 = str20;
                                                lu3Var = lu3Var3;
                                                cVar3 = cVar;
                                                fVar2 = fVar;
                                                i3 = 0;
                                                a = str19;
                                                str12 = str;
                                                if (i3 != 0) {
                                                }
                                            }
                                        } catch (Exception e4) {
                                            e = e4;
                                            Exception exc2 = e;
                                            f a42 = l.a(exc2);
                                            MolocoLogger.error$default(MolocoLogger.INSTANCE, "ChunkedMediaDownloader", "Failed to fetch media from url: " + str + " due to error: " + a42, exc2, false, 8, null);
                                            cVar.a(new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.e(a42));
                                            return a42;
                                        }
                                        str = str8;
                                    }
                                } catch (Exception e5) {
                                    e = e5;
                                    str = str3;
                                    cVar = cVar2;
                                }
                                cVar2 = cVar3;
                            } catch (Exception e6) {
                                e = e6;
                                str = str8;
                                Exception exc22 = e;
                                f a422 = l.a(exc22);
                                MolocoLogger.error$default(MolocoLogger.INSTANCE, "ChunkedMediaDownloader", "Failed to fetch media from url: " + str + " due to error: " + a422, exc22, false, 8, null);
                                cVar.a(new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.e(a422));
                                return a422;
                            }
                            j5 = j4;
                            nVar = nVar2;
                            str8 = str3;
                            cVar = cVar2;
                        }
                        return lu3Var;
                    } catch (Exception e7) {
                        e = e7;
                        cVar = cVar3;
                        str = str3;
                        Exception exc222 = e;
                        f a4222 = l.a(exc222);
                        MolocoLogger.error$default(MolocoLogger.INSTANCE, "ChunkedMediaDownloader", "Failed to fetch media from url: " + str + " due to error: " + a4222, exc222, false, 8, null);
                        cVar.a(new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.e(a4222));
                        return a4222;
                    }
                }
            }
        } catch (Exception e8) {
            e = e8;
        }
    }
}
