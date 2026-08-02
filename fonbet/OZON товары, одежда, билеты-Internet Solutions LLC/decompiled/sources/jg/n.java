package jg;

import java.io.Serializable;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Locale;
import mg.EnumC8145a;

/* loaded from: classes10.dex */
public final class n extends g implements Serializable {

    /* renamed from: c, reason: collision with root package name */
    static final Locale f70049c = new Locale("ja", "JP", "JP");

    /* renamed from: d, reason: collision with root package name */
    public static final n f70050d = new n();

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f70051a;

        static {
            int[] iArr = new int[EnumC8145a.values().length];
            f70051a = iArr;
            try {
                iArr[EnumC8145a.DAY_OF_MONTH.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f70051a[EnumC8145a.DAY_OF_WEEK.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f70051a[EnumC8145a.MICRO_OF_DAY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f70051a[EnumC8145a.MICRO_OF_SECOND.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f70051a[EnumC8145a.HOUR_OF_DAY.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f70051a[EnumC8145a.HOUR_OF_AMPM.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f70051a[EnumC8145a.MINUTE_OF_DAY.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f70051a[EnumC8145a.MINUTE_OF_HOUR.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f70051a[EnumC8145a.SECOND_OF_DAY.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f70051a[EnumC8145a.SECOND_OF_MINUTE.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f70051a[EnumC8145a.MILLI_OF_DAY.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f70051a[EnumC8145a.MILLI_OF_SECOND.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f70051a[EnumC8145a.NANO_OF_DAY.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f70051a[EnumC8145a.NANO_OF_SECOND.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f70051a[EnumC8145a.CLOCK_HOUR_OF_DAY.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f70051a[EnumC8145a.CLOCK_HOUR_OF_AMPM.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f70051a[EnumC8145a.EPOCH_DAY.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f70051a[EnumC8145a.PROLEPTIC_MONTH.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                f70051a[EnumC8145a.ERA.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                f70051a[EnumC8145a.YEAR.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                f70051a[EnumC8145a.YEAR_OF_ERA.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                f70051a[EnumC8145a.MONTH_OF_YEAR.ordinal()] = 22;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                f70051a[EnumC8145a.DAY_OF_YEAR.ordinal()] = 23;
            } catch (NoSuchFieldError unused23) {
            }
        }
    }

    static {
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        HashMap hashMap3 = new HashMap();
        hashMap.put("en", new String[]{"Unknown", "K", "M", "T", "S", "H"});
        hashMap.put("ja", new String[]{"Unknown", "K", "M", "T", "S", "H"});
        hashMap2.put("en", new String[]{"Unknown", "K", "M", "T", "S", "H"});
        hashMap2.put("ja", new String[]{"Unknown", "慶", "明", "大", "昭", "平"});
        hashMap3.put("en", new String[]{"Unknown", "Keio", "Meiji", "Taisho", "Showa", "Heisei"});
        hashMap3.put("ja", new String[]{"Unknown", "慶応", "明治", "大正", "昭和", "平成"});
    }

    private Object readResolve() {
        return f70050d;
    }

    @Override // jg.g
    public final AbstractC7423b a(mg.e eVar) {
        return eVar instanceof o ? (o) eVar : new o(ig.f.l1(eVar));
    }

    @Override // jg.g
    public final h f(int i11) {
        return p.M0(i11);
    }

    @Override // jg.g
    public final String h() {
        return "japanese";
    }

    @Override // jg.g
    public final String i() {
        return "Japanese";
    }

    public final mg.m n(EnumC8145a enumC8145a) {
        int[] iArr = a.f70051a;
        switch (iArr[enumC8145a.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
                return enumC8145a.d();
            default:
                Calendar calendar = Calendar.getInstance(f70049c);
                int i11 = 0;
                switch (iArr[enumC8145a.ordinal()]) {
                    case 19:
                        p[] W02 = p.W0();
                        return mg.m.h(W02[0].L0(), W02[W02.length - 1].L0());
                    case 20:
                        p[] W03 = p.W0();
                        return mg.m.h(o.f70052e.v1(), W03[W03.length - 1].E0().v1());
                    case 21:
                        p[] W04 = p.W0();
                        int v12 = (W04[W04.length - 1].E0().v1() - W04[W04.length - 1].T0().v1()) + 1;
                        int i12 = Integer.MAX_VALUE;
                        while (i11 < W04.length) {
                            i12 = Math.min(i12, (W04[i11].E0().v1() - W04[i11].T0().v1()) + 1);
                            i11++;
                        }
                        return mg.m.i(1L, 6L, i12, v12);
                    case 22:
                        return mg.m.i(calendar.getMinimum(2) + 1, calendar.getGreatestMinimum(2) + 1, calendar.getLeastMaximum(2) + 1, calendar.getMaximum(2) + 1);
                    case 23:
                        p[] W05 = p.W0();
                        int i13 = 366;
                        while (i11 < W05.length) {
                            i13 = Math.min(i13, ((W05[i11].T0().y1() ? 366 : 365) - W05[i11].T0().t1()) + 1);
                            i11++;
                        }
                        return mg.m.i(1L, 1L, i13, 366L);
                    default:
                        throw new UnsupportedOperationException("Unimplementable field: " + enumC8145a);
                }
        }
    }
}
