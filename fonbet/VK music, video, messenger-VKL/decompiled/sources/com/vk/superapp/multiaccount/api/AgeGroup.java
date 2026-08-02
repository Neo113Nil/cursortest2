package com.vk.superapp.multiaccount.api;

import java.util.Iterator;
import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: AgeGroup.kt */
/* loaded from: classes6.dex */
public final class AgeGroup {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ AgeGroup[] $VALUES;
    public static final a Companion;
    public static final AgeGroup NO_AGE_GROUP;
    public static final AgeGroup SIXTEEN_PLUS;
    public static final AgeGroup SIX_PLUS;
    public static final AgeGroup TWELVE_PLUS;
    public static final AgeGroup ZERO_PLUS;
    private final int age;

    /* compiled from: AgeGroup.kt */
    public static final class a {
        public static AgeGroup a(Integer num) {
            Object obj;
            Iterator<E> it = AgeGroup.i().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                int h = ((AgeGroup) obj).h();
                if (num != null && h == num.intValue()) {
                    break;
                }
            }
            AgeGroup ageGroup = (AgeGroup) obj;
            return ageGroup == null ? AgeGroup.NO_AGE_GROUP : ageGroup;
        }

        public static boolean b(f fVar, AgeGroup ageGroup) {
            AgeGroup ageGroup2 = fVar.a().l;
            AgeGroup ageGroup3 = AgeGroup.NO_AGE_GROUP;
            if (ageGroup2 == ageGroup3 || ageGroup.h() <= fVar.a().l.h()) {
                return ageGroup == ageGroup3 && fVar.a().l != ageGroup3;
            }
            return true;
        }
    }

    static {
        AgeGroup ageGroup = new AgeGroup("ZERO_PLUS", 0, 0);
        ZERO_PLUS = ageGroup;
        AgeGroup ageGroup2 = new AgeGroup("SIX_PLUS", 1, 6);
        SIX_PLUS = ageGroup2;
        AgeGroup ageGroup3 = new AgeGroup("TWELVE_PLUS", 2, 12);
        TWELVE_PLUS = ageGroup3;
        AgeGroup ageGroup4 = new AgeGroup("SIXTEEN_PLUS", 3, 16);
        SIXTEEN_PLUS = ageGroup4;
        AgeGroup ageGroup5 = new AgeGroup("NO_AGE_GROUP", 4, -1);
        NO_AGE_GROUP = ageGroup5;
        AgeGroup[] ageGroupArr = {ageGroup, ageGroup2, ageGroup3, ageGroup4, ageGroup5};
        $VALUES = ageGroupArr;
        $ENTRIES = new asp(ageGroupArr);
        Companion = new a();
    }

    public AgeGroup(String str, int i, int i2) {
        this.age = i2;
    }

    public static zrp<AgeGroup> i() {
        return $ENTRIES;
    }

    public static AgeGroup valueOf(String str) {
        return (AgeGroup) Enum.valueOf(AgeGroup.class, str);
    }

    public static AgeGroup[] values() {
        return (AgeGroup[]) $VALUES.clone();
    }

    public final int h() {
        return this.age;
    }
}
