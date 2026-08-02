package com.ironsource;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.hms.framework.common.BundleUtil;
import com.ironsource.M7;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import java.util.Calendar;
import java.util.TimeZone;

/* renamed from: com.ironsource.kd, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public class C4407kd implements M7, M7.a {
    private static final String a = "CappingManager.IS_DELIVERY_ENABLED";
    private static final String b = "CappingManager.IS_CAPPING_ENABLED";
    private static final String c = "CappingManager.IS_PACING_ENABLED";
    private static final String d = "CappingManager.MAX_NUMBER_OF_SHOWS";
    private static final String e = "CappingManager.CAPPING_TYPE";
    private static final String f = "CappingManager.SECONDS_BETWEEN_SHOWS";
    private static final String g = "CappingManager.CURRENT_NUMBER_OF_SHOWS";
    private static final String h = "CappingManager.CAPPING_TIME_THRESHOLD";
    private static final String i = "CappingManager.TIME_OF_THE_PREVIOUS_SHOW";

    /* renamed from: com.ironsource.kd$a */
    public static /* synthetic */ class a {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[EnumC4425ld.values().length];
            a = iArr;
            try {
                iArr[EnumC4425ld.PER_DAY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[EnumC4425ld.PER_HOUR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* renamed from: com.ironsource.kd$b */
    public enum b {
        CAPPED_PER_DELIVERY,
        CAPPED_PER_COUNT,
        CAPPED_PER_PACE,
        NOT_CAPPED
    }

    @Override // com.ironsource.M7
    public synchronized b a(Context context, AbstractC4451n3 abstractC4451n3, IronSource.a aVar) {
        if (context == null) {
            return b.NOT_CAPPED;
        }
        if (abstractC4451n3 == null) {
            return b.NOT_CAPPED;
        }
        String a2 = a(aVar);
        if (abstractC4451n3.c() == null) {
            return b.NOT_CAPPED;
        }
        if (abstractC4451n3.a() == null) {
            return b.NOT_CAPPED;
        }
        return b(context, a2, abstractC4451n3.c());
    }

    @Override // com.ironsource.M7.a
    public synchronized void b(Context context, AbstractC4451n3 abstractC4451n3, IronSource.a aVar) {
        if (context == null || abstractC4451n3 == null) {
            return;
        }
        C4354hd a2 = abstractC4451n3.a();
        if (a2 == null) {
            return;
        }
        a(context, a(aVar), abstractC4451n3.c(), a2);
    }

    @Override // com.ironsource.M7
    public synchronized boolean c(Context context, AbstractC4451n3 abstractC4451n3, IronSource.a aVar) {
        return a(context, abstractC4451n3, aVar) != b.NOT_CAPPED;
    }

    private b b(Context context, String str, String str2) {
        long currentTimeMillis = System.currentTimeMillis();
        if (!IronSourceUtils.a(context, a(str, a, str2), true)) {
            return b.CAPPED_PER_DELIVERY;
        }
        if (IronSourceUtils.a(context, a(str, c, str2), false)) {
            if (currentTimeMillis - IronSourceUtils.a(context, a(str, i, str2), 0L) < IronSourceUtils.a(context, a(str, f, str2), 0) * 1000) {
                return b.CAPPED_PER_PACE;
            }
        }
        if (IronSourceUtils.a(context, a(str, b, str2), false)) {
            int a2 = IronSourceUtils.a(context, a(str, d, str2), 0);
            String a3 = a(str, g, str2);
            int a4 = IronSourceUtils.a(context, a3, 0);
            String a5 = a(str, h, str2);
            if (currentTimeMillis >= IronSourceUtils.a(context, a5, 0L)) {
                IronSourceUtils.b(context, a3, 0);
                IronSourceUtils.b(context, a5, 0L);
            } else if (a4 >= a2) {
                return b.CAPPED_PER_COUNT;
            }
        }
        return b.NOT_CAPPED;
    }

    @Override // com.ironsource.M7.a
    public synchronized void a(Context context, String str, IronSource.a aVar) {
        if (context == null) {
            return;
        }
        if (str == null) {
            return;
        }
        if (TextUtils.isEmpty(str)) {
            return;
        }
        a(context, a(aVar), str);
    }

    private String a(String str, String str2, String str3) {
        return str + BundleUtil.UNDERLINE_TAG + str2 + BundleUtil.UNDERLINE_TAG + str3;
    }

    private void a(Context context, String str, String str2) {
        EnumC4425ld enumC4425ld;
        int i2 = 0;
        if (IronSourceUtils.a(context, a(str, c, str2), false)) {
            IronSourceUtils.b(context, a(str, i, str2), System.currentTimeMillis());
        }
        if (IronSourceUtils.a(context, a(str, b, str2), false)) {
            String a2 = a(str, g, str2);
            int a3 = IronSourceUtils.a(context, a2, 0);
            if (a3 == 0) {
                String c2 = IronSourceUtils.c(context, a(str, e, str2), EnumC4425ld.PER_DAY.toString());
                EnumC4425ld[] values = EnumC4425ld.values();
                int length = values.length;
                while (true) {
                    if (i2 >= length) {
                        enumC4425ld = null;
                        break;
                    }
                    enumC4425ld = values[i2];
                    if (enumC4425ld.a.equals(c2)) {
                        break;
                    } else {
                        i2++;
                    }
                }
                IronSourceUtils.b(context, a(str, h, str2), a(enumC4425ld));
            }
            IronSourceUtils.b(context, a2, a3 + 1);
        }
    }

    private long a(EnumC4425ld enumC4425ld) {
        Calendar calendar = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
        int i2 = a.a[enumC4425ld.ordinal()];
        if (i2 == 1) {
            calendar.set(14, 0);
            calendar.set(13, 0);
            calendar.set(12, 0);
            calendar.set(11, 0);
            calendar.add(6, 1);
        } else if (i2 == 2) {
            calendar.set(14, 0);
            calendar.set(13, 0);
            calendar.set(12, 0);
            calendar.add(11, 1);
        }
        return calendar.getTimeInMillis();
    }

    private void a(Context context, String str, String str2, C4354hd c4354hd) {
        boolean e2 = c4354hd.e();
        IronSourceUtils.b(context, a(str, a, str2), e2);
        if (e2) {
            boolean d2 = c4354hd.d();
            IronSourceUtils.b(context, a(str, b, str2), d2);
            if (d2) {
                IronSourceUtils.b(context, a(str, d, str2), c4354hd.b());
                IronSourceUtils.f(context, a(str, e, str2), c4354hd.a().toString());
            }
            boolean f2 = c4354hd.f();
            IronSourceUtils.b(context, a(str, c, str2), f2);
            if (f2) {
                IronSourceUtils.b(context, a(str, f, str2), c4354hd.c());
            }
        }
    }

    private String a(IronSource.a aVar) {
        if (aVar == IronSource.a.REWARDED_VIDEO) {
            return IronSourceConstants.REWARDED_VIDEO_AD_UNIT;
        }
        if (aVar == IronSource.a.INTERSTITIAL) {
            return "Interstitial";
        }
        if (aVar == IronSource.a.BANNER) {
            return "Banner";
        }
        if (aVar == IronSource.a.NATIVE_AD) {
            return IronSourceConstants.NATIVE_AD_UNIT;
        }
        return aVar.toString();
    }
}
