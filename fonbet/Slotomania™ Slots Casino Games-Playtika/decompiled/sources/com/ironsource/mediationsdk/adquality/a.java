package com.ironsource.mediationsdk.adquality;

import com.ironsource.C2382d9;
import com.ironsource.EnumC2691ue;
import com.ironsource.M6;
import java.util.LinkedHashSet;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;

/* loaded from: classes3.dex */
public final class a {
    public static final b a = new b(null);
    private static EnumC0214a b = EnumC0214a.DONT_INITIALIZE;

    /* renamed from: com.ironsource.mediationsdk.adquality.a$a, reason: collision with other inner class name */
    public enum EnumC0214a {
        DONT_INITIALIZE(0),
        LEVELPLAY_ONLY(1),
        ALL_MEDIATIONS(2),
        OTHER_ONLY(3);

        public static final C0215a b = new C0215a(null);
        private final int a;

        /* renamed from: com.ironsource.mediationsdk.adquality.a$a$a, reason: collision with other inner class name */
        public static final class C0215a {
            public /* synthetic */ C0215a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final EnumC0214a a(int i) {
                EnumC0214a enumC0214a;
                EnumC0214a[] values = EnumC0214a.values();
                int length = values.length;
                int i2 = 0;
                while (true) {
                    if (i2 >= length) {
                        enumC0214a = null;
                        break;
                    }
                    enumC0214a = values[i2];
                    if (enumC0214a.b() == i) {
                        break;
                    }
                    i2++;
                }
                return enumC0214a == null ? EnumC0214a.DONT_INITIALIZE : enumC0214a;
            }

            private C0215a() {
            }
        }

        EnumC0214a(int i) {
            this.a = i;
        }

        public final int b() {
            return this.a;
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final EnumC0214a a() {
            return a.b;
        }

        private b() {
        }

        public final void a(EnumC0214a enumC0214a) {
            Intrinsics.checkNotNullParameter(enumC0214a, "<set-?>");
            a.b = enumC0214a;
        }
    }

    public /* synthetic */ class c {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[EnumC0214a.values().length];
            try {
                iArr[EnumC0214a.LEVELPLAY_ONLY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC0214a.ALL_MEDIATIONS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC0214a.OTHER_ONLY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            a = iArr;
        }
    }

    public final boolean b() {
        EnumC2691ue enumC2691ue;
        JSONArray optJSONArray = new C2382d9().a().optJSONArray(M6.g0);
        if (optJSONArray == null) {
            return false;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        int length = optJSONArray.length();
        for (int i = 0; i < length; i++) {
            int i2 = optJSONArray.getInt(i);
            EnumC2691ue[] values = EnumC2691ue.values();
            int length2 = values.length;
            int i3 = 0;
            while (true) {
                if (i3 >= length2) {
                    enumC2691ue = null;
                    break;
                }
                enumC2691ue = values[i3];
                if (enumC2691ue.b() == i2) {
                    break;
                }
                i3++;
            }
            if (enumC2691ue != null) {
                linkedHashSet.add(enumC2691ue);
            }
        }
        int i4 = c.a[b.ordinal()];
        if (i4 == 1) {
            return linkedHashSet.contains(EnumC2691ue.LEVEL_PLAY_INIT);
        }
        if (i4 != 2) {
            if (i4 == 3) {
                return linkedHashSet.contains(EnumC2691ue.EXTERNAL_MEDIATION_INIT);
            }
        } else if (linkedHashSet.contains(EnumC2691ue.LEVEL_PLAY_INIT) || linkedHashSet.contains(EnumC2691ue.EXTERNAL_MEDIATION_INIT)) {
            return true;
        }
        return false;
    }

    public final void a(int i) {
        b = EnumC0214a.b.a(i);
    }
}
