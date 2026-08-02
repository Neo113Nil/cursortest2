package defpackage;

import androidx.media3.common.b;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class do4 {
    public final dgb a;
    public final ujg b;
    public final int[] c;
    public final int d;
    public final re4 e;
    public final long f;
    public final uoe g;
    public final bo4[] h;
    public nh6 i;
    public zc4 j;
    public int k;
    public xt1 l;
    public boolean m;

    /* JADX WARN: Type inference failed for: r0v0, types: [do4, java.lang.Object] */
    public do4(fjg fjgVar, dgb dgbVar, zc4 zc4Var, ujg ujgVar, int i, int[] iArr, nh6 nh6Var, int i2, re4 re4Var, long j, boolean z, ArrayList arrayList, uoe uoeVar) {
        bo4[] bo4VarArr;
        b bVar;
        ozf ozfVar;
        ll6 er8Var;
        l72 l72Var;
        ?? obj = new Object();
        obj.a = dgbVar;
        obj.j = zc4Var;
        obj.b = ujgVar;
        obj.c = iArr;
        obj.i = nh6Var;
        obj.d = i2;
        obj.e = re4Var;
        obj.k = i;
        obj.f = j;
        uoe uoeVar2 = uoeVar;
        obj.g = uoeVar2;
        long c = zc4Var.c(i);
        ArrayList a = obj.a();
        obj.h = new bo4[nh6Var.length()];
        int i3 = 0;
        int i4 = 0;
        do4 do4Var = obj;
        while (i4 < do4Var.h.length) {
            ozf ozfVar2 = (ozf) a.get(nh6Var.getIndexInTrackGroup(i4));
            o71 d0 = ujgVar.d0(ozfVar2.b);
            bo4[] bo4VarArr2 = do4Var.h;
            o71 o71Var = d0 == null ? (o71) ozfVar2.b.get(i3) : d0;
            b bVar2 = ozfVar2.a;
            String str = bVar2.n;
            if (!sjc.n(str)) {
                if (str != null && (str.startsWith("video/webm") || str.startsWith(MimeTypes.AUDIO_WEBM) || str.startsWith(MimeTypes.APPLICATION_WEBM) || str.startsWith("video/x-matroska") || str.startsWith("audio/x-matroska") || str.startsWith("application/x-matroska"))) {
                    ozfVar = ozfVar2;
                    bVar = bVar2;
                    bo4VarArr = bo4VarArr2;
                    er8Var = new d0c((zic) fjgVar.b, fjgVar.a ? 1 : 3);
                } else if (Objects.equals(str, "image/jpeg")) {
                    er8Var = new xy1(1);
                } else if (Objects.equals(str, "image/png")) {
                    er8Var = new xy1((byte) 0, 1);
                } else {
                    int i5 = z ? 4 : 0;
                    bo4VarArr = bo4VarArr2;
                    bVar = bVar2;
                    ozfVar = ozfVar2;
                    er8Var = new er8((zic) fjgVar.b, (fjgVar.a ? i5 : i5 | 32) | er8.f(3), null, arrayList, uoeVar2);
                }
                l72Var = new l72(er8Var, i2, bVar);
                l72 l72Var2 = l72Var;
                long j2 = c;
                int i6 = i4;
                bo4VarArr[i6] = new bo4(j2, ozfVar, o71Var, l72Var2, 0L, ozfVar.b());
                i4 = i6 + 1;
                do4Var = this;
                uoeVar2 = uoeVar;
                c = j2;
                i3 = 0;
            } else if (fjgVar.a) {
                er8Var = new sli(((zic) fjgVar.b).g(bVar2), bVar2);
            } else {
                l72Var = null;
                ozfVar = ozfVar2;
                bo4VarArr = bo4VarArr2;
                l72 l72Var22 = l72Var;
                long j22 = c;
                int i62 = i4;
                bo4VarArr[i62] = new bo4(j22, ozfVar, o71Var, l72Var22, 0L, ozfVar.b());
                i4 = i62 + 1;
                do4Var = this;
                uoeVar2 = uoeVar;
                c = j22;
                i3 = 0;
            }
            ozfVar = ozfVar2;
            bVar = bVar2;
            bo4VarArr = bo4VarArr2;
            l72Var = new l72(er8Var, i2, bVar);
            l72 l72Var222 = l72Var;
            long j222 = c;
            int i622 = i4;
            bo4VarArr[i622] = new bo4(j222, ozfVar, o71Var, l72Var222, 0L, ozfVar.b());
            i4 = i622 + 1;
            do4Var = this;
            uoeVar2 = uoeVar;
            c = j222;
            i3 = 0;
        }
    }

    public final ArrayList a() {
        List list = this.j.a(this.k).c;
        ArrayList arrayList = new ArrayList();
        for (int i : this.c) {
            arrayList.addAll(((ch) list.get(i)).c);
        }
        return arrayList;
    }

    public final bo4 b(int i) {
        bo4[] bo4VarArr = this.h;
        bo4 bo4Var = bo4VarArr[i];
        o71 d0 = this.b.d0(((ozf) bo4Var.d).b);
        if (d0 == null || d0.equals((o71) bo4Var.e)) {
            return bo4Var;
        }
        bo4 bo4Var2 = new bo4(bo4Var.a, (ozf) bo4Var.d, d0, (l72) bo4Var.c, bo4Var.b, (jd4) bo4Var.f);
        bo4VarArr[i] = bo4Var2;
        return bo4Var2;
    }
}
