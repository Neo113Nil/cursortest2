package d9;

import android.graphics.Point;
import android.graphics.Rect;
import android.util.SparseArray;
import androidx.recyclerview.widget.LinearLayoutManager;
import c9.C5769a;
import com.google.android.gms.internal.mlkit_vision_text_common.zzbh;
import com.google.android.gms.internal.mlkit_vision_text_common.zzbk;
import com.google.android.gms.internal.mlkit_vision_text_common.zzbu;
import com.google.android.gms.internal.mlkit_vision_text_common.zzcp;
import com.google.android.gms.internal.mlkit_vision_text_common.zzf;
import com.google.android.gms.internal.mlkit_vision_text_common.zzl;
import com.google.android.gms.internal.mlkit_vision_text_common.zzv;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes9.dex */
final class l {

    /* renamed from: a, reason: collision with root package name */
    static final zzv f61357a = zzv.zza("\n");

    /* renamed from: b, reason: collision with root package name */
    private static final C6111i f61358b = new C6111i();

    /* JADX WARN: Code restructure failed: missing block: B:46:0x0200, code lost:
    
        if (com.google.android.gms.internal.mlkit_vision_text_common.zzy.zzb(r1) == false) goto L39;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static C5769a a(zzl[] zzlVarArr) {
        String str;
        SparseArray sparseArray = new SparseArray();
        int i11 = 0;
        for (zzl zzlVar : zzlVarArr) {
            SparseArray sparseArray2 = (SparseArray) sparseArray.get(zzlVar.zzj);
            if (sparseArray2 == null) {
                sparseArray2 = new SparseArray();
                sparseArray.append(zzlVar.zzj, sparseArray2);
            }
            sparseArray2.append(zzlVar.zzk, zzlVar);
        }
        zzbh zzbhVar = new zzbh();
        int i12 = 0;
        while (true) {
            int size = sparseArray.size();
            zzv zzvVar = f61357a;
            if (i12 >= size) {
                zzbk zzb = zzbhVar.zzb();
                zzvVar.zzb(zzbu.zza(zzb, new b7.d()));
                return new C5769a(zzb);
            }
            SparseArray sparseArray3 = (SparseArray) sparseArray.valueAt(i12);
            zzbh zzbhVar2 = new zzbh();
            for (int i13 = i11; i13 < sparseArray3.size(); i13++) {
                zzbhVar2.zza((zzl) sparseArray3.valueAt(i13));
            }
            zzbk zzb2 = zzbhVar2.zzb();
            List zza = zzbu.zza(zzb2, new C6112j());
            zzf zzfVar = ((zzl) zzb2.get(i11)).zzb;
            zzcp listIterator = zzb2.listIterator(i11);
            int i14 = LinearLayoutManager.INVALID_OFFSET;
            int i15 = Integer.MAX_VALUE;
            int i16 = Integer.MAX_VALUE;
            int i17 = Integer.MIN_VALUE;
            while (listIterator.hasNext()) {
                zzf zzfVar2 = ((zzl) listIterator.next()).zzb;
                int i18 = -zzfVar.zza;
                int i19 = i11;
                int i21 = -zzfVar.zzb;
                double sin = Math.sin(Math.toRadians(zzfVar.zze));
                SparseArray sparseArray4 = sparseArray;
                int i22 = i12;
                double cos = Math.cos(Math.toRadians(zzfVar.zze));
                Point[] pointArr = new Point[4];
                Point point = new Point(zzfVar2.zza, zzfVar2.zzb);
                pointArr[i19] = point;
                point.offset(i18, i21);
                Point point2 = pointArr[i19];
                int i23 = point2.x;
                zzcp zzcpVar = listIterator;
                double d11 = point2.y;
                int i24 = (int) ((i23 * cos) + (d11 * sin));
                point2.x = i24;
                int i25 = (int) (((-i23) * sin) + (d11 * cos));
                point2.y = i25;
                pointArr[1] = new Point(zzfVar2.zzc + i24, i25);
                pointArr[2] = new Point(zzfVar2.zzc + i24, zzfVar2.zzd + i25);
                pointArr[3] = new Point(i24, i25 + zzfVar2.zzd);
                for (int i26 = i19; i26 < 4; i26++) {
                    Point point3 = pointArr[i26];
                    i15 = Math.min(i15, point3.x);
                    i14 = Math.max(i14, point3.x);
                    i16 = Math.min(i16, point3.y);
                    i17 = Math.max(i17, point3.y);
                }
                listIterator = zzcpVar;
                i11 = i19;
                sparseArray = sparseArray4;
                i12 = i22;
            }
            SparseArray sparseArray5 = sparseArray;
            int i27 = i12;
            int i28 = i11;
            int i29 = zzfVar.zza;
            int i31 = zzfVar.zzb;
            double sin2 = Math.sin(Math.toRadians(zzfVar.zze));
            double cos2 = Math.cos(Math.toRadians(zzfVar.zze));
            Point[] pointArr2 = {new Point(i15, i16), new Point(i14, i16), new Point(i14, i17), new Point(i15, i17)};
            int i32 = i28;
            while (i32 < 4) {
                Point point4 = pointArr2[i32];
                double d12 = point4.x;
                double d13 = sin2;
                double d14 = point4.y;
                point4.x = (int) ((d12 * cos2) - (d14 * d13));
                point4.y = (int) ((d12 * d13) + (d14 * cos2));
                point4.offset(i29, i31);
                i32++;
                sin2 = d13;
            }
            List asList = Arrays.asList(pointArr2);
            String zzb3 = zzvVar.zzb(zzbu.zza(zza, new com.google.gson.internal.p()));
            Rect a11 = C6106d.a(asList);
            HashMap hashMap = new HashMap();
            Iterator it = zza.iterator();
            while (it.hasNext()) {
                String b11 = ((C5769a.b) it.next()).b();
                hashMap.put(b11, Integer.valueOf((hashMap.containsKey(b11) ? ((Integer) hashMap.get(b11)).intValue() : i28) + 1));
            }
            Set entrySet = hashMap.entrySet();
            if (!entrySet.isEmpty()) {
                str = (String) ((Map.Entry) Collections.max(entrySet, f61358b)).getKey();
            }
            str = "und";
            zzbhVar.zza(new C5769a.e(zzb3, a11, asList, str, zza));
            i12 = i27 + 1;
            i11 = i28;
            sparseArray = sparseArray5;
        }
    }
}
