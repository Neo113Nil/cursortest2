package com.ironsource.mediationsdk.adquality;

import com.ironsource.C4296e9;
import com.ironsource.EnumC4587ue;
import com.ironsource.O6;
import java.util.LinkedHashSet;
import org.json.JSONArray;
import xsna.zcl;

/* loaded from: classes13.dex */
public final class a {
    public static final b a = new b(null);
    private static EnumC0225a b = EnumC0225a.DONT_INITIALIZE;

    /* renamed from: com.ironsource.mediationsdk.adquality.a$a, reason: collision with other inner class name */
    public enum EnumC0225a {
        DONT_INITIALIZE(0),
        LEVELPLAY_ONLY(1),
        ALL_MEDIATIONS(2),
        OTHER_ONLY(3);

        public static final C0226a b = new C0226a(null);
        private final int a;

        /* renamed from: com.ironsource.mediationsdk.adquality.a$a$a, reason: collision with other inner class name */
        public static final class C0226a {
            public /* synthetic */ C0226a(zcl zclVar) {
                this();
            }

            public final EnumC0225a a(int i) {
                EnumC0225a enumC0225a;
                EnumC0225a[] values = EnumC0225a.values();
                int length = values.length;
                int i2 = 0;
                while (true) {
                    if (i2 >= length) {
                        enumC0225a = null;
                        break;
                    }
                    enumC0225a = values[i2];
                    if (enumC0225a.b() == i) {
                        break;
                    }
                    i2++;
                }
                return enumC0225a == null ? EnumC0225a.DONT_INITIALIZE : enumC0225a;
            }

            private C0226a() {
            }
        }

        EnumC0225a(int i) {
            this.a = i;
        }

        public final int b() {
            return this.a;
        }
    }

    public static final class b {
        public /* synthetic */ b(zcl zclVar) {
            this();
        }

        public final EnumC0225a a() {
            return a.b;
        }

        private b() {
        }

        public final void a(EnumC0225a enumC0225a) {
            a.b = enumC0225a;
        }
    }

    public /* synthetic */ class c {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[EnumC0225a.values().length];
            try {
                iArr[EnumC0225a.LEVELPLAY_ONLY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC0225a.ALL_MEDIATIONS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC0225a.OTHER_ONLY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            a = iArr;
        }
    }

    public final boolean b() {
        EnumC4587ue enumC4587ue;
        JSONArray optJSONArray = new C4296e9().a().optJSONArray(O6.g0);
        if (optJSONArray == null) {
            return false;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        int length = optJSONArray.length();
        for (int i = 0; i < length; i++) {
            int i2 = optJSONArray.getInt(i);
            EnumC4587ue[] values = EnumC4587ue.values();
            int length2 = values.length;
            int i3 = 0;
            while (true) {
                if (i3 >= length2) {
                    enumC4587ue = null;
                    break;
                }
                enumC4587ue = values[i3];
                if (enumC4587ue.b() == i2) {
                    break;
                }
                i3++;
            }
            if (enumC4587ue != null) {
                linkedHashSet.add(enumC4587ue);
            }
        }
        int i4 = c.a[b.ordinal()];
        if (i4 == 1) {
            return linkedHashSet.contains(EnumC4587ue.LEVEL_PLAY_INIT);
        }
        if (i4 != 2) {
            if (i4 == 3) {
                return linkedHashSet.contains(EnumC4587ue.EXTERNAL_MEDIATION_INIT);
            }
        } else if (linkedHashSet.contains(EnumC4587ue.LEVEL_PLAY_INIT) || linkedHashSet.contains(EnumC4587ue.EXTERNAL_MEDIATION_INIT)) {
            return true;
        }
        return false;
    }

    public final void a(int i) {
        b = EnumC0225a.b.a(i);
    }
}
