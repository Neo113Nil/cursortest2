package com.ironsource;

import defpackage.a70;
import defpackage.ljg;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public interface V2 extends Hb<Integer, Integer> {

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static final class a {

        @NotNull
        public static final a a = new a();
        public static final int b = 3009;
        public static final int c = 3008;

        private a() {
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static final class b {

        @NotNull
        public static final b a = new b();
        public static final int b = 3002;
        public static final int c = 3005;
        public static final int d = 3300;
        public static final int e = 3503;
        public static final int f = 3504;

        private b() {
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static final class d {

        @NotNull
        public static final d a = new d();
        public static final int b = 83500;
        public static final int c = 83510;
        public static final int d = 83300;
        public static final int e = 83302;
        public static final int f = 83004;
        public static final int g = 88002;
        public static final int h = 83301;
        public static final int i = 83302;
        public static final int j = 3305;
        public static final int k = 3306;

        private d() {
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static final class c implements V2 {
        @NotNull
        public Integer a(int i) throws IllegalArgumentException {
            int i2;
            if (i == 206) {
                i2 = b.e;
            } else if (i == 207) {
                i2 = b.f;
            } else if (i == 405) {
                i2 = 3009;
            } else if (i != 406) {
                switch (i) {
                    case 101:
                        i2 = 83500;
                        break;
                    case 102:
                        i2 = 83510;
                        break;
                    case 103:
                        i2 = d.h;
                        break;
                    case 104:
                        i2 = 83300;
                        break;
                    default:
                        switch (i) {
                            case 109:
                                i2 = 88002;
                                break;
                            case 110:
                                i2 = 83004;
                                break;
                            case 111:
                                break;
                            case 112:
                                i2 = 3305;
                                break;
                            case 113:
                                i2 = 3306;
                                break;
                            default:
                                switch (i) {
                                    case 201:
                                        i2 = 3002;
                                        break;
                                    case 202:
                                        i2 = 3005;
                                        break;
                                    case 203:
                                        i2 = 3300;
                                        break;
                                    default:
                                        a70.p(ljg.j(i, "Unknown event code: "));
                                        return null;
                                }
                        }
                    case 105:
                        i2 = 83302;
                        break;
                }
            } else {
                i2 = 3008;
            }
            return Integer.valueOf(i2);
        }

        @Override // com.ironsource.Hb
        public /* bridge */ /* synthetic */ Integer a(Integer num) {
            return a(num.intValue());
        }
    }
}
