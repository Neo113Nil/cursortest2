package defpackage;

import android.os.SystemClock;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class ov implements v6b {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ov(a7b a7bVar, Object obj, Object obj2, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x006d, code lost:
    
        r7 = (defpackage.rtg) r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x006f, code lost:
    
        if (r7 == null) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0071, code lost:
    
        r9 = r7.a;
        r4 = r7.b;
        r5 = r7.c;
        r1 = r1.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x007b, code lost:
    
        if ((r1 instanceof com.sofascore.results.base.BaseActivity) == false) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x007d, code lost:
    
        r1 = (com.sofascore.results.base.BaseActivity) r1;
        r4.a(r1.x);
        defpackage.nv.U(r1, r9, r2 - r5, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0088, code lost:
    
        r0.remove(r7);
     */
    @Override // defpackage.v6b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a() {
        Object obj;
        int i = this.a;
        Object obj2 = this.b;
        Object obj3 = this.c;
        switch (i) {
            case 0:
                uv uvVar = (uv) obj2;
                String str = (String) obj3;
                uvVar.getClass();
                long elapsedRealtime = SystemClock.elapsedRealtime();
                SnapshotStateList snapshotStateList = uvVar.b;
                int size = snapshotStateList.size() - 1;
                int C = j72.C(snapshotStateList);
                while (true) {
                    if (!(size >= 0)) {
                        obj = null;
                        break;
                    } else if (j72.C(snapshotStateList) != C) {
                        a70.o();
                        break;
                    } else {
                        j72.K(size, snapshotStateList.size());
                        obj = snapshotStateList.get(size);
                        size--;
                        if (((rtg) obj).a.equals(str)) {
                            break;
                        }
                    }
                }
            default:
                boh bohVar = (boh) obj3;
                if (bohVar.h() != 0) {
                    ((Function1) obj2).invoke(Long.valueOf(yaa.v() - bohVar.h()));
                }
                bohVar.i(0L);
                break;
        }
    }
}
