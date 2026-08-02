package com.vk.ml;

import android.content.Context;
import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import com.vk.api.generated.account.dto.AccountModelDto;
import com.vk.log.L;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicInteger;
import xsna.asp;
import xsna.asu0;
import xsna.c5g;
import xsna.ca10;
import xsna.eqq;
import xsna.f2s;
import xsna.go9;
import xsna.j330;
import xsna.j50;
import xsna.k330;
import xsna.l330;
import xsna.m330;
import xsna.n1r;
import xsna.o25;
import xsna.per;
import xsna.rp;
import xsna.s3q0;
import xsna.sj1;
import xsna.wzh;
import xsna.yb00;
import xsna.zrp;

/* compiled from: MLFeatures.kt */
/* loaded from: classes3.dex */
public final class MLFeatures {
    public static final b a = new b();

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MLFeatures.kt */
    public static final class MLFeature {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ MLFeature[] $VALUES;
        public static final MLFeature ANIMOJI;
        public static final MLFeature ANIMOJI_VOWELS;
        public static final MLFeature CATDETECT;
        public static final MLFeature CATLANDMARK_RECURRENT;
        public static final MLFeature FACEDETECT;
        public static final MLFeature FACEDETECT_U;
        public static final MLFeature FACELANDMARK;
        public static final MLFeature FACELANDMARK_U;
        public static final MLFeature FACE_LANDMARK_WITH_ATTENTION;
        public static final MLFeature FACE_MORPH;
        public static final MLFeature FULL_SEGMENTATION;
        public static final MLFeature FULL_SEGMENTATION_U;
        public static final MLFeature HUMAN_SEGMENTATION_RECURRENT_BIG_NO_SMOOTH;
        public static final MLFeature HUMAN_SEGMENTATION_RECURRENT_BIG_NO_SMOOTH_U;
        public static final MLFeature HUMAN_SEGMENTATION_RECURRENT_NO_SMOOTH;
        public static final MLFeature HUMAN_SEGMENTATION_RECURRENT_NO_SMOOTH_U;
        public static final MLFeature MORPHING_BABY;
        public static final MLFeature MORPHING_BEAUTIFIER;
        public static final MLFeature MORPHING_CARTOON;
        public static final MLFeature MORPHING_CUSTOM_1;
        public static final MLFeature MORPHING_CUSTOM_2;
        public static final MLFeature MORPHING_CUSTOM_3;
        public static final MLFeature MORPHING_CUSTOM_4;
        public static final MLFeature MORPHING_CUSTOM_5;
        public static final MLFeature MORPHING_FAT;
        public static final MLFeature MORPHING_OLD;
        public static final MLFeature MORPHING_RETOUCH;
        public static final MLFeature MORPHING_YOUNG;
        public static final MLFeature MULTITASK;
        public static final MLFeature MULTITASK_U;
        public static final MLFeature NS_DF_TINY;
        public static final MLFeature NS_PIPELINE_48K;
        public static final MLFeature NS_PIPELINE_SPLIT;
        public static final MLFeature PALMDETECT;
        public static final MLFeature PALMDETECT_U;
        public static final MLFeature SKY_SEGMENTATION_HMS_256_V7;
        public static final MLFeature UNKNOWN;

        static {
            MLFeature mLFeature = new MLFeature(GrsBaseInfo.CountryCodeSource.UNKNOWN, 0);
            UNKNOWN = mLFeature;
            MLFeature mLFeature2 = new MLFeature("PALMDETECT", 1);
            PALMDETECT = mLFeature2;
            MLFeature mLFeature3 = new MLFeature("MULTITASK", 2);
            MULTITASK = mLFeature3;
            MLFeature mLFeature4 = new MLFeature("FACEDETECT", 3);
            FACEDETECT = mLFeature4;
            MLFeature mLFeature5 = new MLFeature("PALMDETECT_U", 4);
            PALMDETECT_U = mLFeature5;
            MLFeature mLFeature6 = new MLFeature("MULTITASK_U", 5);
            MULTITASK_U = mLFeature6;
            MLFeature mLFeature7 = new MLFeature("FACEDETECT_U", 6);
            FACEDETECT_U = mLFeature7;
            MLFeature mLFeature8 = new MLFeature("FULL_SEGMENTATION", 7);
            FULL_SEGMENTATION = mLFeature8;
            MLFeature mLFeature9 = new MLFeature("FULL_SEGMENTATION_U", 8);
            FULL_SEGMENTATION_U = mLFeature9;
            MLFeature mLFeature10 = new MLFeature("FACELANDMARK", 9);
            FACELANDMARK = mLFeature10;
            MLFeature mLFeature11 = new MLFeature("CATDETECT", 10);
            CATDETECT = mLFeature11;
            MLFeature mLFeature12 = new MLFeature("FACELANDMARK_U", 11);
            FACELANDMARK_U = mLFeature12;
            MLFeature mLFeature13 = new MLFeature("FACE_LANDMARK_WITH_ATTENTION", 12);
            FACE_LANDMARK_WITH_ATTENTION = mLFeature13;
            MLFeature mLFeature14 = new MLFeature("HUMAN_SEGMENTATION_RECURRENT_NO_SMOOTH", 13);
            HUMAN_SEGMENTATION_RECURRENT_NO_SMOOTH = mLFeature14;
            MLFeature mLFeature15 = new MLFeature("HUMAN_SEGMENTATION_RECURRENT_BIG_NO_SMOOTH", 14);
            HUMAN_SEGMENTATION_RECURRENT_BIG_NO_SMOOTH = mLFeature15;
            MLFeature mLFeature16 = new MLFeature("HUMAN_SEGMENTATION_RECURRENT_NO_SMOOTH_U", 15);
            HUMAN_SEGMENTATION_RECURRENT_NO_SMOOTH_U = mLFeature16;
            MLFeature mLFeature17 = new MLFeature("HUMAN_SEGMENTATION_RECURRENT_BIG_NO_SMOOTH_U", 16);
            HUMAN_SEGMENTATION_RECURRENT_BIG_NO_SMOOTH_U = mLFeature17;
            MLFeature mLFeature18 = new MLFeature("CATLANDMARK_RECURRENT", 17);
            CATLANDMARK_RECURRENT = mLFeature18;
            MLFeature mLFeature19 = new MLFeature("NS_PIPELINE_SPLIT", 18);
            NS_PIPELINE_SPLIT = mLFeature19;
            MLFeature mLFeature20 = new MLFeature("FACE_MORPH", 19);
            FACE_MORPH = mLFeature20;
            MLFeature mLFeature21 = new MLFeature("NS_PIPELINE_48K", 20);
            NS_PIPELINE_48K = mLFeature21;
            MLFeature mLFeature22 = new MLFeature("NS_DF_TINY", 21);
            NS_DF_TINY = mLFeature22;
            MLFeature mLFeature23 = new MLFeature("ANIMOJI", 22);
            ANIMOJI = mLFeature23;
            MLFeature mLFeature24 = new MLFeature("ANIMOJI_VOWELS", 23);
            ANIMOJI_VOWELS = mLFeature24;
            MLFeature mLFeature25 = new MLFeature("SKY_SEGMENTATION_HMS_256_V7", 24);
            SKY_SEGMENTATION_HMS_256_V7 = mLFeature25;
            MLFeature mLFeature26 = new MLFeature("MORPHING_BABY", 25);
            MORPHING_BABY = mLFeature26;
            MLFeature mLFeature27 = new MLFeature("MORPHING_BEAUTIFIER", 26);
            MORPHING_BEAUTIFIER = mLFeature27;
            MLFeature mLFeature28 = new MLFeature("MORPHING_OLD", 27);
            MORPHING_OLD = mLFeature28;
            MLFeature mLFeature29 = new MLFeature("MORPHING_YOUNG", 28);
            MORPHING_YOUNG = mLFeature29;
            MLFeature mLFeature30 = new MLFeature("MORPHING_RETOUCH", 29);
            MORPHING_RETOUCH = mLFeature30;
            MLFeature mLFeature31 = new MLFeature("MORPHING_FAT", 30);
            MORPHING_FAT = mLFeature31;
            MLFeature mLFeature32 = new MLFeature("MORPHING_CARTOON", 31);
            MORPHING_CARTOON = mLFeature32;
            MLFeature mLFeature33 = new MLFeature("MORPHING_CUSTOM_1", 32);
            MORPHING_CUSTOM_1 = mLFeature33;
            MLFeature mLFeature34 = new MLFeature("MORPHING_CUSTOM_2", 33);
            MORPHING_CUSTOM_2 = mLFeature34;
            MLFeature mLFeature35 = new MLFeature("MORPHING_CUSTOM_3", 34);
            MORPHING_CUSTOM_3 = mLFeature35;
            MLFeature mLFeature36 = new MLFeature("MORPHING_CUSTOM_4", 35);
            MORPHING_CUSTOM_4 = mLFeature36;
            MLFeature mLFeature37 = new MLFeature("MORPHING_CUSTOM_5", 36);
            MORPHING_CUSTOM_5 = mLFeature37;
            MLFeature[] mLFeatureArr = {mLFeature, mLFeature2, mLFeature3, mLFeature4, mLFeature5, mLFeature6, mLFeature7, mLFeature8, mLFeature9, mLFeature10, mLFeature11, mLFeature12, mLFeature13, mLFeature14, mLFeature15, mLFeature16, mLFeature17, mLFeature18, mLFeature19, mLFeature20, mLFeature21, mLFeature22, mLFeature23, mLFeature24, mLFeature25, mLFeature26, mLFeature27, mLFeature28, mLFeature29, mLFeature30, mLFeature31, mLFeature32, mLFeature33, mLFeature34, mLFeature35, mLFeature36, mLFeature37};
            $VALUES = mLFeatureArr;
            $ENTRIES = new asp(mLFeatureArr);
        }

        public MLFeature() {
            throw null;
        }

        public static zrp<MLFeature> h() {
            return $ENTRIES;
        }

        public static MLFeature valueOf(String str) {
            return (MLFeature) Enum.valueOf(MLFeature.class, str);
        }

        public static MLFeature[] values() {
            return (MLFeature[]) $VALUES.clone();
        }
    }

    public static void a(boolean z) {
        b bVar = a;
        bVar.getClass();
        wzh wzhVar = new wzh(bVar, 23);
        if (z) {
            wzhVar.invoke();
        } else {
            asu0.a.getClass();
            asu0.n().submit(new sj1(wzhVar, 9));
        }
    }

    public static void b(Context context, List list, ArrayList arrayList, List list2, yb00.b bVar) {
        b bVar2 = a;
        bVar2.getClass();
        L.e("ModelsManager", "initStorage");
        if (bVar2.d == null) {
            synchronized (bVar2) {
                try {
                    if (bVar2.d == null) {
                        bVar2.d = new j330(context.getApplicationContext());
                    }
                    s3q0 s3q0Var = s3q0.a;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        L.e("ModelsManager", go9.c("sync features=", list));
        AtomicInteger atomicInteger = bVar2.f;
        int incrementAndGet = atomicInteger.incrementAndGet();
        L.e("ModelsManager", "starting model sync " + atomicInteger.get());
        List list3 = list;
        ArrayList arrayList2 = new ArrayList(c5g.u(list3, 10));
        Iterator it = list3.iterator();
        while (it.hasNext()) {
            arrayList2.add(((MLFeature) it.next()).toString().toLowerCase(Locale.US));
        }
        boolean z = !o25.a().b();
        L.e("ModelsManager", "getModelsRequest modelNames=" + arrayList2 + " isUserAnonymous=" + z);
        bVar2.e(arrayList2, z).subscribe(new n1r(new l330(bVar2, list2, incrementAndGet, bVar, arrayList), 5), new j50(new eqq(bVar, 19), 28));
    }

    public static boolean c() {
        return a.f();
    }

    public static boolean d() {
        return a.f();
    }

    public static void e(ArrayList arrayList, final per perVar) {
        final b bVar = a;
        if (bVar.f()) {
            L.e("ModelsManager", "syncRequiredModel requiredModel=" + arrayList);
            final int i = bVar.f.get();
            LinkedList<AccountModelDto> linkedList = bVar.a;
            final ArrayList arrayList2 = new ArrayList();
            for (Object obj : linkedList) {
                if (arrayList.contains(rp.a((AccountModelDto) obj))) {
                    arrayList2.add(obj);
                }
            }
            if (!arrayList.isEmpty()) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    MLFeature mLFeature = (MLFeature) it.next();
                    if (!arrayList2.isEmpty()) {
                        Iterator it2 = arrayList2.iterator();
                        while (it2.hasNext()) {
                            if (rp.a((AccountModelDto) it2.next()) == mLFeature) {
                                break;
                            }
                        }
                    }
                    ArrayList arrayList3 = new ArrayList(c5g.u(arrayList, 10));
                    Iterator it3 = arrayList.iterator();
                    while (it3.hasNext()) {
                        arrayList3.add(((MLFeature) it3.next()).toString().toLowerCase(Locale.US));
                    }
                    bVar.e(arrayList3, !o25.a().b()).subscribe(new m330(new k330(bVar, i, perVar, 0), 0), new ca10(new f2s(perVar, 25), 1));
                    return;
                }
            }
            asu0.a.getClass();
            asu0.n().submit(new Runnable() { // from class: xsna.s330
                @Override // java.lang.Runnable
                public final void run() {
                    com.vk.ml.b.this.j(arrayList2, i, perVar, null);
                }
            });
        }
    }
}
