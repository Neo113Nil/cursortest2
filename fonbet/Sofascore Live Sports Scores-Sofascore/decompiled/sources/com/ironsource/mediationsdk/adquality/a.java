package com.ironsource.mediationsdk.adquality;

import com.ironsource.C4055e9;
import com.ironsource.EnumC4310se;
import com.ironsource.L6;
import java.util.LinkedHashSet;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class a {

    @NotNull
    public static final b a = new b(null);

    @NotNull
    private static EnumC1206a b = EnumC1206a.DONT_INITIALIZE;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public /* synthetic */ class c {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[EnumC1206a.values().length];
            try {
                iArr[EnumC1206a.LEVELPLAY_ONLY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC1206a.ALL_MEDIATIONS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC1206a.OTHER_ONLY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            a = iArr;
        }
    }

    public final void a(int i) {
        b = EnumC1206a.b.a(i);
    }

    public final boolean b() {
        EnumC4310se enumC4310se;
        JSONArray optJSONArray = new C4055e9().a().optJSONArray(L6.g0);
        if (optJSONArray == null) {
            return false;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        int length = optJSONArray.length();
        for (int i = 0; i < length; i++) {
            int i2 = optJSONArray.getInt(i);
            EnumC4310se[] values = EnumC4310se.values();
            int length2 = values.length;
            int i3 = 0;
            while (true) {
                if (i3 >= length2) {
                    enumC4310se = null;
                    break;
                }
                enumC4310se = values[i3];
                if (enumC4310se.b() == i2) {
                    break;
                }
                i3++;
            }
            if (enumC4310se != null) {
                linkedHashSet.add(enumC4310se);
            }
        }
        int i4 = c.a[b.ordinal()];
        if (i4 == 1) {
            return linkedHashSet.contains(EnumC4310se.LEVEL_PLAY_INIT);
        }
        if (i4 != 2) {
            if (i4 == 3) {
                return linkedHashSet.contains(EnumC4310se.EXTERNAL_MEDIATION_INIT);
            }
        } else if (linkedHashSet.contains(EnumC4310se.LEVEL_PLAY_INIT) || linkedHashSet.contains(EnumC4310se.EXTERNAL_MEDIATION_INIT)) {
            return true;
        }
        return false;
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    /* renamed from: com.ironsource.mediationsdk.adquality.a$a, reason: collision with other inner class name */
    public enum EnumC1206a {
        DONT_INITIALIZE(0),
        LEVELPLAY_ONLY(1),
        ALL_MEDIATIONS(2),
        OTHER_ONLY(3);


        @NotNull
        public static final C1207a b = new C1207a(null);
        private final int a;

        EnumC1206a(int i) {
            this.a = i;
        }

        public final int b() {
            return this.a;
        }

        /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
        /* renamed from: com.ironsource.mediationsdk.adquality.a$a$a, reason: collision with other inner class name */
        public static final class C1207a {
            public /* synthetic */ C1207a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @NotNull
            public final EnumC1206a a(int i) {
                EnumC1206a enumC1206a;
                EnumC1206a[] values = EnumC1206a.values();
                int length = values.length;
                int i2 = 0;
                while (true) {
                    if (i2 >= length) {
                        enumC1206a = null;
                        break;
                    }
                    enumC1206a = values[i2];
                    if (enumC1206a.b() == i) {
                        break;
                    }
                    i2++;
                }
                return enumC1206a == null ? EnumC1206a.DONT_INITIALIZE : enumC1206a;
            }

            private C1207a() {
            }
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void a(@NotNull EnumC1206a enumC1206a) {
            enumC1206a.getClass();
            a.b = enumC1206a;
        }

        private b() {
        }

        @NotNull
        public final EnumC1206a a() {
            return a.b;
        }
    }
}
