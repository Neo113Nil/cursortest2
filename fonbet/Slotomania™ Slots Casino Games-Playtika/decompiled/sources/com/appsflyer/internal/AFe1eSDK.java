package com.appsflyer.internal;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import com.appsflyer.AFLogger;
import com.vungle.ads.internal.protos.Sdk;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B+\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0014¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0016\u001a\u0012\u0012\u0004\u0012\u00020\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u0015\u0018\u00010\u0013H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0011\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\fH\u0014¢\u0006\u0004\b\u0011\u0010\u000fJ\u000f\u0010\u0019\u001a\u00020\u0018H\u0014¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u0018H\u0014¢\u0006\u0004\b\u001b\u0010\u001aJ\u0017\u0010\u001d\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u001cH\u0014¢\u0006\u0004\b\u001d\u0010\u001eR\u0014\u0010\u001d\u001a\u00020\u00048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u001fR\u0014\u0010!\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010 "}, d2 = {"Lcom/appsflyer/internal/AFe1eSDK;", "Lcom/appsflyer/internal/AFf1rSDK;", "Lcom/appsflyer/internal/AFi1kSDK;", "p0", "Lcom/appsflyer/internal/AFc1kSDK;", "p1", "Lcom/appsflyer/internal/AFc1fSDK;", "p2", "Lcom/appsflyer/internal/AFh1lSDK;", "p3", "<init>", "(Lcom/appsflyer/internal/AFi1kSDK;Lcom/appsflyer/internal/AFc1kSDK;Lcom/appsflyer/internal/AFc1fSDK;Lcom/appsflyer/internal/AFh1lSDK;)V", "Lcom/appsflyer/internal/AFh1tSDK;", "", "component2", "(Lcom/appsflyer/internal/AFh1tSDK;)V", "", "getRevenue", "()J", "", "", "", "equals", "()Ljava/util/Map;", "", "copydefault", "()Z", "getMonetizationNetwork", "", "getMediationNetwork", "(I)V", "Lcom/appsflyer/internal/AFc1kSDK;", "Lcom/appsflyer/internal/AFi1kSDK;", "AFAdRevenueData"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class AFe1eSDK extends AFf1rSDK {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int AFLogger = 1;
    private static int registerClient;

    /* renamed from: copydefault, reason: from kotlin metadata */
    private final AFi1kSDK AFAdRevenueData;

    /* renamed from: equals, reason: from kotlin metadata */
    private final AFc1kSDK getMediationNetwork;
    private static char[] AFKeystoreWrapper = {45532, 45510, 45531, 45518, 45535, 45513, 45552, 45506, 45514};
    private static char AFInAppEventParameterName = 33846;

    public static /* synthetic */ Object getRevenue(Object[] objArr, int i, int i2, int i3) {
        return getCurrencyIso4217Code(objArr);
    }

    public /* synthetic */ AFe1eSDK(AFi1kSDK aFi1kSDK, AFc1kSDK aFc1kSDK, AFc1fSDK aFc1fSDK, AFh1lSDK aFh1lSDK, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(aFi1kSDK, aFc1kSDK, aFc1fSDK, (i & 8) != 0 ? new AFh1lSDK() : aFh1lSDK);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    private AFe1eSDK(AFi1kSDK aFi1kSDK, AFc1kSDK aFc1kSDK, AFc1fSDK aFc1fSDK, AFh1lSDK aFh1lSDK) {
        super(aFh1lSDK, aFc1fSDK);
        Intrinsics.checkNotNullParameter(aFi1kSDK, "");
        Intrinsics.checkNotNullParameter(aFc1kSDK, "");
        Intrinsics.checkNotNullParameter(aFc1fSDK, "");
        Intrinsics.checkNotNullParameter(aFh1lSDK, "");
        this.AFAdRevenueData = aFi1kSDK;
        this.getMediationNetwork = aFc1kSDK;
        this.AFAdRevenueData.add(AFe1uSDK.CONVERSION);
    }

    @Override // com.appsflyer.internal.AFe1kSDK, com.appsflyer.internal.AFe1tSDK
    public final boolean getMonetizationNetwork() {
        int i = 2 % 2;
        int i2 = AFLogger + 107;
        int i3 = i2 % 128;
        registerClient = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 27;
        AFLogger = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 50 / 0;
        }
        return false;
    }

    @Override // com.appsflyer.internal.AFf1tSDK, com.appsflyer.internal.AFe1kSDK
    protected final boolean copydefault() {
        int i = 2 % 2;
        int i2 = AFLogger;
        int i3 = i2 + Sdk.SDKError.Reason.INVALID_RI_ENDPOINT_VALUE;
        registerClient = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 25;
        registerClient = i5 % 128;
        int i6 = i5 % 2;
        return false;
    }

    @Override // com.appsflyer.internal.AFe1kSDK, com.appsflyer.internal.AFe1tSDK
    public final long getRevenue() {
        int i = 2 % 2;
        int i2 = AFLogger + 57;
        registerClient = i2 % 128;
        int i3 = i2 % 2;
        long millis = TimeUnit.MINUTES.toMillis(1L);
        int i4 = registerClient + 77;
        AFLogger = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 60 / 0;
        }
        return millis;
    }

    private static /* synthetic */ Object getCurrencyIso4217Code(Object[] objArr) {
        AFe1eSDK aFe1eSDK = (AFe1eSDK) objArr[0];
        AFh1tSDK aFh1tSDK = (AFh1tSDK) objArr[1];
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(aFh1tSDK, "");
        Map<String, Object> map = aFh1tSDK.getMonetizationNetwork;
        Intrinsics.checkNotNullExpressionValue(map, "");
        Object[] objArr2 = new Object[1];
        a("\u0004\u0003\b\u0000\u0004\u0001\u0006\u0002\u0000\u0005\u0001\u0007", 12 - Color.blue(0), (byte) (15 - Drawable.resolveOpacity(0, 0)), objArr2);
        map.put(((String) objArr2[0]).intern(), String.valueOf(new Date().getTime()));
        super.getRevenue(aFh1tSDK);
        aFe1eSDK.component2(aFh1tSDK);
        AFg1tSDK aFg1tSDK = ((AFf1tSDK) aFe1eSDK).hashCode;
        Map<String, Object> map2 = aFh1tSDK.getMonetizationNetwork;
        Intrinsics.checkNotNullExpressionValue(map2, "");
        aFg1tSDK.AFAdRevenueData(map2, aFe1eSDK.getMediationNetwork.getRevenue.AFAdRevenueData("appsFlyerCount", 0), aFe1eSDK.getMediationNetwork.getRevenue.AFAdRevenueData("appsFlyerInAppEventCount", 0));
        int i2 = registerClient + 103;
        AFLogger = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            return null;
        }
        obj.hashCode();
        throw null;
    }

    private final void component2(AFh1tSDK p0) {
        int i = 2 % 2;
        int i2 = AFLogger + 19;
        registerClient = i2 % 128;
        int i3 = i2 % 2;
        try {
            Map<String, ?> equals = equals();
            if (equals != null) {
                p0.getCurrencyIso4217Code(equals);
                int i4 = AFLogger + Sdk.SDKError.Reason.INVALID_RI_ENDPOINT_VALUE;
                registerClient = i4 % 128;
                int i5 = i4 % 2;
            }
            if (!(!this.AFAdRevenueData.getCurrencyIso4217Code())) {
                return;
            }
            Map<String, Object> component1 = component1(p0);
            Intrinsics.checkNotNullExpressionValue(component1, "");
            component1.put("pia_disabled", Boolean.TRUE);
        } catch (Throwable th) {
            AFg1gSDK.e$default(AFLogger.INSTANCE, AFh1zSDK.PLAY_INTEGRITY_API, "Error while adding PIA data to payload", th, true, false, false, false, 96, null);
        }
    }

    private final Map<String, Object> equals() {
        int i = 2 % 2;
        AFi1nSDK mediationNetwork = this.AFAdRevenueData.getMediationNetwork();
        if (mediationNetwork == null) {
            return null;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        linkedHashMap2.put("pia_timestamp", Long.valueOf(mediationNetwork.getMonetizationNetwork));
        linkedHashMap2.put("ttr_millis", Long.valueOf(mediationNetwork.getRevenue));
        if (mediationNetwork.AFAdRevenueData != null) {
            int i2 = AFLogger + 11;
            registerClient = i2 % 128;
            if (i2 % 2 == 0) {
                linkedHashMap2.put("pia_token", mediationNetwork.AFAdRevenueData);
            } else {
                linkedHashMap2.put("pia_token", mediationNetwork.AFAdRevenueData);
                throw null;
            }
        }
        if (mediationNetwork.getCurrencyIso4217Code != null) {
            linkedHashMap2.put("error_code", mediationNetwork.getCurrencyIso4217Code);
            int i3 = AFLogger + 73;
            registerClient = i3 % 128;
            int i4 = i3 % 2;
        }
        linkedHashMap.put("pia", linkedHashMap2);
        return linkedHashMap;
    }

    @Override // com.appsflyer.internal.AFf1rSDK
    protected final void getMediationNetwork(int p0) {
        int i = 2 % 2;
        int i2 = registerClient + 21;
        AFLogger = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    private static void a(String str, int i, byte b, Object[] objArr) {
        int i2;
        int i3 = 2 % 2;
        char[] cArr = str;
        if (str != null) {
            int i4 = $10 + 73;
            $11 = i4 % 128;
            int i5 = i4 % 2;
            char[] charArray = str.toCharArray();
            int i6 = $10 + Sdk.SDKError.Reason.INVALID_RI_ENDPOINT_VALUE;
            $11 = i6 % 128;
            int i7 = i6 % 2;
            cArr = charArray;
        }
        char[] cArr2 = cArr;
        AFk1rSDK aFk1rSDK = new AFk1rSDK();
        char[] cArr3 = AFKeystoreWrapper;
        if (cArr3 != null) {
            int length = cArr3.length;
            char[] cArr4 = new char[length];
            int i8 = $11 + 41;
            $10 = i8 % 128;
            int i9 = i8 % 2;
            for (int i10 = 0; i10 < length; i10++) {
                cArr4[i10] = (char) (cArr3[i10] ^ (-2775045471812025291L));
            }
            cArr3 = cArr4;
        }
        char c = (char) ((-2775045471812025291L) ^ AFInAppEventParameterName);
        char[] cArr5 = new char[i];
        if (i % 2 != 0) {
            int i11 = $11 + 63;
            $10 = i11 % 128;
            if (i11 % 2 != 0) {
                i2 = i + 111;
                cArr5[i2] = (char) (cArr2[i2] * b);
            } else {
                i2 = i - 1;
                cArr5[i2] = (char) (cArr2[i2] - b);
            }
        } else {
            i2 = i;
        }
        if (i2 > 1) {
            aFk1rSDK.getRevenue = 0;
            while (aFk1rSDK.getRevenue < i2) {
                aFk1rSDK.AFAdRevenueData = cArr2[aFk1rSDK.getRevenue];
                aFk1rSDK.getMediationNetwork = cArr2[aFk1rSDK.getRevenue + 1];
                if (aFk1rSDK.AFAdRevenueData == aFk1rSDK.getMediationNetwork) {
                    cArr5[aFk1rSDK.getRevenue] = (char) (aFk1rSDK.AFAdRevenueData - b);
                    cArr5[aFk1rSDK.getRevenue + 1] = (char) (aFk1rSDK.getMediationNetwork - b);
                } else {
                    aFk1rSDK.getMonetizationNetwork = aFk1rSDK.AFAdRevenueData / c;
                    aFk1rSDK.component3 = aFk1rSDK.AFAdRevenueData % c;
                    aFk1rSDK.getCurrencyIso4217Code = aFk1rSDK.getMediationNetwork / c;
                    aFk1rSDK.component2 = aFk1rSDK.getMediationNetwork % c;
                    if (aFk1rSDK.component3 == aFk1rSDK.component2) {
                        aFk1rSDK.getMonetizationNetwork = ((aFk1rSDK.getMonetizationNetwork + c) - 1) % c;
                        aFk1rSDK.getCurrencyIso4217Code = ((aFk1rSDK.getCurrencyIso4217Code + c) - 1) % c;
                        int i12 = (aFk1rSDK.getMonetizationNetwork * c) + aFk1rSDK.component3;
                        int i13 = (aFk1rSDK.getCurrencyIso4217Code * c) + aFk1rSDK.component2;
                        cArr5[aFk1rSDK.getRevenue] = cArr3[i12];
                        cArr5[aFk1rSDK.getRevenue + 1] = cArr3[i13];
                    } else if (aFk1rSDK.getMonetizationNetwork == aFk1rSDK.getCurrencyIso4217Code) {
                        aFk1rSDK.component3 = ((aFk1rSDK.component3 + c) - 1) % c;
                        aFk1rSDK.component2 = ((aFk1rSDK.component2 + c) - 1) % c;
                        int i14 = (aFk1rSDK.getMonetizationNetwork * c) + aFk1rSDK.component3;
                        int i15 = (aFk1rSDK.getCurrencyIso4217Code * c) + aFk1rSDK.component2;
                        cArr5[aFk1rSDK.getRevenue] = cArr3[i14];
                        cArr5[aFk1rSDK.getRevenue + 1] = cArr3[i15];
                    } else {
                        int i16 = (aFk1rSDK.getMonetizationNetwork * c) + aFk1rSDK.component2;
                        int i17 = (aFk1rSDK.getCurrencyIso4217Code * c) + aFk1rSDK.component3;
                        cArr5[aFk1rSDK.getRevenue] = cArr3[i16];
                        cArr5[aFk1rSDK.getRevenue + 1] = cArr3[i17];
                    }
                }
                aFk1rSDK.getRevenue += 2;
            }
        }
        for (int i18 = 0; i18 < i; i18++) {
            cArr5[i18] = (char) (cArr5[i18] ^ 13722);
        }
        objArr[0] = new String(cArr5);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AFe1eSDK(AFi1kSDK aFi1kSDK, AFc1kSDK aFc1kSDK, AFc1fSDK aFc1fSDK) {
        this(aFi1kSDK, aFc1kSDK, aFc1fSDK, null, 8, null);
        Intrinsics.checkNotNullParameter(aFi1kSDK, "");
        Intrinsics.checkNotNullParameter(aFc1kSDK, "");
        Intrinsics.checkNotNullParameter(aFc1fSDK, "");
    }

    @Override // com.appsflyer.internal.AFf1rSDK, com.appsflyer.internal.AFf1tSDK
    protected final void getRevenue(AFh1tSDK p0) {
        getRevenue(new Object[]{this, p0}, -1391583709, 1391583709, System.identityHashCode(this));
    }
}
