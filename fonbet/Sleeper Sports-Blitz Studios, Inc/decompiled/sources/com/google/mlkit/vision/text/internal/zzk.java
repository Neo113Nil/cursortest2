package com.google.mlkit.vision.text.internal;

import android.graphics.Matrix;
import android.graphics.Point;
import android.graphics.Rect;
import android.util.SparseArray;
import androidx.media3.common.C;
import com.google.android.gms.internal.mlkit_vision_text_common.zzbh;
import com.google.android.gms.internal.mlkit_vision_text_common.zzbk;
import com.google.android.gms.internal.mlkit_vision_text_common.zzbu;
import com.google.android.gms.internal.mlkit_vision_text_common.zzcp;
import com.google.android.gms.internal.mlkit_vision_text_common.zzu;
import com.google.android.gms.internal.mlkit_vision_text_common.zzv;
import com.google.android.gms.internal.mlkit_vision_text_common.zzy;
import com.google.mlkit.vision.text.Text;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-mlkit-text-recognition-common@@19.1.0 */
/* loaded from: classes8.dex */
final class zzk {
    public static final /* synthetic */ int zzb = 0;
    static final zzv zza = zzv.zza("\n");
    private static final Comparator zzc = new Comparator() { // from class: com.google.mlkit.vision.text.internal.zzf
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            int i = zzk.zzb;
            return ((Integer) ((Map.Entry) obj).getValue()).compareTo((Integer) ((Map.Entry) obj2).getValue());
        }
    };

    /* JADX WARN: Multi-variable type inference failed */
    static Text zza(com.google.android.gms.internal.mlkit_vision_text_common.zzl[] zzlVarArr, final Matrix matrix) {
        SparseArray sparseArray = new SparseArray();
        int i = 0;
        for (com.google.android.gms.internal.mlkit_vision_text_common.zzl zzlVar : zzlVarArr) {
            SparseArray sparseArray2 = (SparseArray) sparseArray.get(zzlVar.zzj);
            if (sparseArray2 == null) {
                sparseArray2 = new SparseArray();
                sparseArray.append(zzlVar.zzj, sparseArray2);
            }
            sparseArray2.append(zzlVar.zzk, zzlVar);
        }
        zzbh zzbhVar = new zzbh();
        int i2 = 0;
        while (i2 < sparseArray.size()) {
            SparseArray sparseArray3 = (SparseArray) sparseArray.valueAt(i2);
            zzbh zzbhVar2 = new zzbh();
            for (int i3 = i; i3 < sparseArray3.size(); i3++) {
                zzbhVar2.zza((com.google.android.gms.internal.mlkit_vision_text_common.zzl) sparseArray3.valueAt(i3));
            }
            zzbk zzb2 = zzbhVar2.zzb();
            List zza2 = zzbu.zza(zzb2, new zzu() { // from class: com.google.mlkit.vision.text.internal.zzh
                @Override // com.google.android.gms.internal.mlkit_vision_text_common.zzu
                public final Object zza(Object obj) {
                    com.google.android.gms.internal.mlkit_vision_text_common.zzl zzlVar2 = (com.google.android.gms.internal.mlkit_vision_text_common.zzl) obj;
                    int i4 = zzk.zzb;
                    List zzb3 = zza.zzb(zzlVar2.zzb);
                    String str = zzy.zzb(zzlVar2.zze) ? "" : zzlVar2.zze;
                    Rect zza3 = zza.zza(zzb3);
                    String str2 = zzy.zzb(zzlVar2.zzg) ? C.LANGUAGE_UNDETERMINED : zzlVar2.zzg;
                    final Matrix matrix2 = matrix;
                    return new Text.Line(str, zza3, zzb3, str2, matrix2, zzbu.zza(Arrays.asList(zzlVar2.zza), new zzu() { // from class: com.google.mlkit.vision.text.internal.zzj
                        @Override // com.google.android.gms.internal.mlkit_vision_text_common.zzu
                        public final Object zza(Object obj2) {
                            com.google.android.gms.internal.mlkit_vision_text_common.zzr zzrVar = (com.google.android.gms.internal.mlkit_vision_text_common.zzr) obj2;
                            int i5 = zzk.zzb;
                            List zzb4 = zza.zzb(zzrVar.zzb);
                            return new Text.Element(zzy.zzb(zzrVar.zzd) ? "" : zzrVar.zzd, zza.zza(zzb4), zzb4, zzy.zzb(zzrVar.zzf) ? C.LANGUAGE_UNDETERMINED : zzrVar.zzf, matrix2, zzrVar.zze, zzrVar.zzb.zze, zzbk.zzh());
                        }
                    }), zzlVar2.zzf, zzlVar2.zzb.zze);
                }
            });
            com.google.android.gms.internal.mlkit_vision_text_common.zzf zzfVar = ((com.google.android.gms.internal.mlkit_vision_text_common.zzl) zzb2.get(i)).zzb;
            zzcp listIterator = zzb2.listIterator(i);
            int i4 = Integer.MIN_VALUE;
            int i5 = Integer.MAX_VALUE;
            int i6 = Integer.MAX_VALUE;
            int i7 = Integer.MIN_VALUE;
            while (listIterator.hasNext()) {
                com.google.android.gms.internal.mlkit_vision_text_common.zzf zzfVar2 = ((com.google.android.gms.internal.mlkit_vision_text_common.zzl) listIterator.next()).zzb;
                int i8 = -zzfVar.zza;
                int i9 = -zzfVar.zzb;
                int i10 = i;
                double sin = Math.sin(Math.toRadians(zzfVar.zze));
                SparseArray sparseArray4 = sparseArray;
                int i11 = i2;
                double cos = Math.cos(Math.toRadians(zzfVar.zze));
                Point[] pointArr = new Point[4];
                Point point = new Point(zzfVar2.zza, zzfVar2.zzb);
                pointArr[i10] = point;
                point.offset(i8, i9);
                double d = pointArr[i10].x * cos;
                double d2 = pointArr[i10].y * sin;
                double d3 = (-pointArr[i10].x) * sin;
                double d4 = pointArr[i10].y * cos;
                Point point2 = pointArr[i10];
                int i12 = (int) (d + d2);
                point2.x = i12;
                int i13 = (int) (d3 + d4);
                pointArr[i10].y = i13;
                pointArr[1] = new Point(zzfVar2.zzc + i12, i13);
                pointArr[2] = new Point(zzfVar2.zzc + i12, zzfVar2.zzd + i13);
                pointArr[3] = new Point(i12, i13 + zzfVar2.zzd);
                for (int i14 = i10; i14 < 4; i14++) {
                    Point point3 = pointArr[i14];
                    i5 = Math.min(i5, point3.x);
                    i4 = Math.max(i4, point3.x);
                    i6 = Math.min(i6, point3.y);
                    i7 = Math.max(i7, point3.y);
                }
                i = i10;
                sparseArray = sparseArray4;
                i2 = i11;
            }
            SparseArray sparseArray5 = sparseArray;
            int i15 = i2;
            int i16 = i;
            int i17 = zzfVar.zza;
            int i18 = zzfVar.zzb;
            double sin2 = Math.sin(Math.toRadians(zzfVar.zze));
            double cos2 = Math.cos(Math.toRadians(zzfVar.zze));
            Point[] pointArr2 = {new Point(i5, i6), new Point(i4, i6), new Point(i4, i7), new Point(i5, i7)};
            int i19 = i16;
            while (i19 < 4) {
                pointArr2[i19].x = (int) ((pointArr2[i19].x * cos2) - (pointArr2[i19].y * sin2));
                pointArr2[i19].y = (int) ((pointArr2[i19].x * sin2) + (pointArr2[i19].y * cos2));
                pointArr2[i19].offset(i17, i18);
                i19++;
                sin2 = sin2;
            }
            List asList = Arrays.asList(pointArr2);
            zzbhVar.zza(new Text.TextBlock(zza.zzb(zzbu.zza(zza2, new zzu() { // from class: com.google.mlkit.vision.text.internal.zzi
                @Override // com.google.android.gms.internal.mlkit_vision_text_common.zzu
                public final Object zza(Object obj) {
                    return ((Text.Line) obj).getText();
                }
            })), zza.zza(asList), asList, zzb(zza2), matrix, zza2));
            i2 = i15 + 1;
            i = i16;
            sparseArray = sparseArray5;
        }
        zzbk zzb3 = zzbhVar.zzb();
        return new Text(zza.zzb(zzbu.zza(zzb3, new zzu() { // from class: com.google.mlkit.vision.text.internal.zzg
            @Override // com.google.android.gms.internal.mlkit_vision_text_common.zzu
            public final Object zza(Object obj) {
                return ((Text.TextBlock) obj).getText();
            }
        })), zzb3);
    }

    private static String zzb(List list) {
        HashMap hashMap = new HashMap();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String recognizedLanguage = ((Text.Line) it.next()).getRecognizedLanguage();
            hashMap.put(recognizedLanguage, Integer.valueOf((hashMap.containsKey(recognizedLanguage) ? ((Integer) hashMap.get(recognizedLanguage)).intValue() : 0) + 1));
        }
        Set entrySet = hashMap.entrySet();
        if (entrySet.isEmpty()) {
            return C.LANGUAGE_UNDETERMINED;
        }
        String str = (String) ((Map.Entry) Collections.max(entrySet, zzc)).getKey();
        return !zzy.zzb(str) ? str : C.LANGUAGE_UNDETERMINED;
    }
}
