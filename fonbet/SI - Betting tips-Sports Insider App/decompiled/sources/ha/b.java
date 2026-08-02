package ha;

import d9.e;
import j$.time.Instant;
import j$.time.ZoneId;
import j$.time.ZonedDateTime;
import j$.time.format.DateTimeFormatter;
import kotlin.jvm.internal.Intrinsics;
import nc.f;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class b implements f {

    /* renamed from: a, reason: collision with root package name */
    public final String f10435a;

    /* renamed from: b, reason: collision with root package name */
    public final String f10436b;

    /* renamed from: c, reason: collision with root package name */
    public final String f10437c;

    /* renamed from: d, reason: collision with root package name */
    public final String f10438d;

    /* renamed from: e, reason: collision with root package name */
    public final String f10439e;

    /* renamed from: f, reason: collision with root package name */
    public final String f10440f;

    /* renamed from: g, reason: collision with root package name */
    public final String f10441g;

    /* renamed from: h, reason: collision with root package name */
    public final String f10442h;

    public b(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        this.f10435a = str;
        this.f10436b = str2;
        this.f10437c = str3;
        this.f10438d = str4;
        this.f10439e = str5;
        this.f10440f = str6;
        this.f10441g = str7;
        this.f10442h = str8;
    }

    public static long a() {
        return Instant.now().getEpochSecond();
    }

    @Override // nc.f
    public final long endTimeSecond() {
        String str = this.f10442h;
        if (str == null) {
            return 0L;
        }
        return ZonedDateTime.parse(str, DateTimeFormatter.ISO_DATE_TIME).withZoneSameInstant(ZoneId.systemDefault()).toEpochSecond();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return Intrinsics.areEqual(this.f10435a, bVar.f10435a) && Intrinsics.areEqual(this.f10436b, bVar.f10436b) && Intrinsics.areEqual(this.f10437c, bVar.f10437c) && Intrinsics.areEqual(this.f10438d, bVar.f10438d) && Intrinsics.areEqual(this.f10439e, bVar.f10439e) && Intrinsics.areEqual(this.f10440f, bVar.f10440f) && Intrinsics.areEqual(this.f10441g, bVar.f10441g) && Intrinsics.areEqual(this.f10442h, bVar.f10442h);
    }

    @Override // nc.f
    public final boolean expired() {
        return endTimeSecond() < a();
    }

    @Override // nc.f
    public final String getCurrentOfferId() {
        return this.f10440f;
    }

    @Override // nc.f
    public final String getCurrentPlanId() {
        return this.f10438d;
    }

    @Override // nc.f
    public final String getCurrentPrice() {
        return this.f10436b;
    }

    @Override // nc.f
    public final String getEndTime() {
        return this.f10442h;
    }

    @Override // nc.f
    public final String getStandardOfferId() {
        return this.f10441g;
    }

    @Override // nc.f
    public final String getStandardPlanId() {
        return this.f10439e;
    }

    @Override // nc.f
    public final String getStandardPrice() {
        return this.f10437c;
    }

    @Override // nc.f
    public final String getType() {
        return this.f10435a;
    }

    public final int hashCode() {
        String str = this.f10435a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f10436b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f10437c;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f10438d;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f10439e;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f10440f;
        int hashCode6 = (hashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.f10441g;
        int hashCode7 = (hashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.f10442h;
        return hashCode7 + (str8 != null ? str8.hashCode() : 0);
    }

    @Override // nc.f
    public final String offerId() {
        String str;
        if (this.f10442h != null) {
            String str2 = this.f10435a;
            if ((Intrinsics.areEqual(str2, "upsale") || Intrinsics.areEqual(str2, "discount")) && endTimeSecond() > a() && (str = this.f10440f) != null) {
                return str;
            }
        }
        return this.f10441g;
    }

    @Override // nc.f
    public final String offerIdStrike() {
        if (this.f10442h != null && Intrinsics.areEqual(this.f10435a, "discount") && endTimeSecond() > a() && this.f10440f != null) {
            return this.f10441g;
        }
        return null;
    }

    @Override // nc.f
    public final String planId() {
        String str;
        if (this.f10442h != null) {
            String str2 = this.f10435a;
            if ((Intrinsics.areEqual(str2, "upsale") || Intrinsics.areEqual(str2, "discount")) && endTimeSecond() > a() && (str = this.f10438d) != null) {
                return str;
            }
        }
        return this.f10439e;
    }

    @Override // nc.f
    public final String planIdStrike() {
        if (this.f10442h != null && Intrinsics.areEqual(this.f10435a, "discount") && endTimeSecond() > a() && this.f10438d != null) {
            return this.f10439e;
        }
        return null;
    }

    @Override // nc.f
    public final String productId() {
        String str = this.f10442h;
        String str2 = this.f10437c;
        if (str == null) {
            return str2 == null ? "" : str2;
        }
        String str3 = this.f10435a;
        if (!Intrinsics.areEqual(str3, "upsale") && !Intrinsics.areEqual(str3, "discount")) {
            return str2 == null ? "" : str2;
        }
        if (endTimeSecond() <= a()) {
            return str2 == null ? "" : str2;
        }
        String str4 = this.f10436b;
        return str4 == null ? str2 == null ? "" : str2 : str4;
    }

    @Override // nc.f
    public final String productIdStrike() {
        if (this.f10442h != null && Intrinsics.areEqual(this.f10435a, "discount") && endTimeSecond() > a() && this.f10436b != null) {
            return this.f10437c;
        }
        return null;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("PriceData(type=");
        sb2.append(this.f10435a);
        sb2.append(", currentPrice=");
        sb2.append(this.f10436b);
        sb2.append(", standardPrice=");
        sb2.append(this.f10437c);
        sb2.append(", currentPlanId=");
        sb2.append(this.f10438d);
        sb2.append(", standardPlanId=");
        sb2.append(this.f10439e);
        sb2.append(", currentOfferId=");
        sb2.append(this.f10440f);
        sb2.append(", standardOfferId=");
        sb2.append(this.f10441g);
        sb2.append(", endTime=");
        return e.k(sb2, this.f10442h, ')');
    }
}
