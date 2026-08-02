package com.blaze.blazesdk.ads.models.ui;

import androidx.annotation.Keep;
import androidx.core.app.NotificationCompat;
import com.blaze.blazesdk.app_configurations.models.ads.c;
import defpackage.dmi;
import defpackage.km5;
import defpackage.lm5;
import defpackage.lnb;
import defpackage.o6a;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001Bq\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0012R\u0014\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0012R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0012R \u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/blaze/blazesdk/ads/models/ui/BlazeAdInfoModel;", "", "", "googleAdManagerId", "adUnitId", "formatId", "", "context", "Lcom/blaze/blazesdk/ads/models/ui/AdInfoType;", "type", "tag", "Lcom/blaze/blazesdk/app_configurations/models/ads/c;", "adsConfig", "Lcom/blaze/blazesdk/ads/models/ui/BlazeAdProvider;", "adProvider", "backofficeCampaignData", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Lcom/blaze/blazesdk/ads/models/ui/AdInfoType;Ljava/lang/String;Lcom/blaze/blazesdk/app_configurations/models/ads/c;Lcom/blaze/blazesdk/ads/models/ui/BlazeAdProvider;Ljava/lang/String;)V", "Ljava/lang/String;", "Ljava/util/Map;", "blazesdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class BlazeAdInfoModel {
    public final AdInfoType a;

    @Keep
    @NotNull
    public final String adUnitId;
    public final String b;
    public final c c;

    @Keep
    @NotNull
    public final Map<String, String> context;
    public final BlazeAdProvider d;
    public final String e;

    @Keep
    @NotNull
    public final String formatId;

    @Keep
    @NotNull
    public final String googleAdManagerId;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public BlazeAdInfoModel(String str, String str2, String str3, Map map, AdInfoType adInfoType, String str4, c cVar, BlazeAdProvider blazeAdProvider, String str5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, map, adInfoType, str4, cVar, (i & 128) != 0 ? null : blazeAdProvider, (i & NotificationCompat.FLAG_LOCAL_ONLY) != 0 ? null : str5);
        str = (i & 1) != 0 ? "" : str;
        str2 = (i & 2) != 0 ? "" : str2;
        str3 = (i & 4) != 0 ? "" : str3;
        if ((i & 8) != 0) {
            map = lm5.a;
            map.getClass();
        }
        str4 = (i & 32) != 0 ? null : str4;
        if ((i & 64) != 0) {
            km5 km5Var = km5.a;
            cVar = new c(km5Var, km5Var, km5Var);
        }
    }

    public static BlazeAdInfoModel copy$default(BlazeAdInfoModel blazeAdInfoModel, String str, String str2, String str3, Map map, AdInfoType adInfoType, String str4, c cVar, BlazeAdProvider blazeAdProvider, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = blazeAdInfoModel.googleAdManagerId;
        }
        if ((i & 2) != 0) {
            str2 = blazeAdInfoModel.adUnitId;
        }
        if ((i & 4) != 0) {
            str3 = blazeAdInfoModel.formatId;
        }
        if ((i & 8) != 0) {
            map = blazeAdInfoModel.context;
        }
        if ((i & 16) != 0) {
            adInfoType = blazeAdInfoModel.a;
        }
        if ((i & 32) != 0) {
            str4 = blazeAdInfoModel.b;
        }
        if ((i & 64) != 0) {
            cVar = blazeAdInfoModel.c;
        }
        if ((i & 128) != 0) {
            blazeAdProvider = blazeAdInfoModel.d;
        }
        if ((i & NotificationCompat.FLAG_LOCAL_ONLY) != 0) {
            str5 = blazeAdInfoModel.e;
        }
        String str6 = str5;
        blazeAdInfoModel.getClass();
        str.getClass();
        str2.getClass();
        str3.getClass();
        map.getClass();
        adInfoType.getClass();
        cVar.getClass();
        BlazeAdProvider blazeAdProvider2 = blazeAdProvider;
        String str7 = str4;
        c cVar2 = cVar;
        AdInfoType adInfoType2 = adInfoType;
        String str8 = str3;
        return new BlazeAdInfoModel(str, str2, str8, map, adInfoType2, str7, cVar2, blazeAdProvider2, str6);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BlazeAdInfoModel)) {
            return false;
        }
        BlazeAdInfoModel blazeAdInfoModel = (BlazeAdInfoModel) obj;
        return Intrinsics.c(this.googleAdManagerId, blazeAdInfoModel.googleAdManagerId) && Intrinsics.c(this.adUnitId, blazeAdInfoModel.adUnitId) && Intrinsics.c(this.formatId, blazeAdInfoModel.formatId) && Intrinsics.c(this.context, blazeAdInfoModel.context) && this.a == blazeAdInfoModel.a && Intrinsics.c(this.b, blazeAdInfoModel.b) && Intrinsics.c(this.c, blazeAdInfoModel.c) && this.d == blazeAdInfoModel.d && Intrinsics.c(this.e, blazeAdInfoModel.e);
    }

    public final int hashCode() {
        int hashCode = (this.a.hashCode() + dmi.g(this.context, o6a.k(this.formatId, o6a.k(this.adUnitId, this.googleAdManagerId.hashCode() * 31)), 31)) * 31;
        String str = this.b;
        int hashCode2 = (this.c.hashCode() + ((hashCode + (str == null ? 0 : str.hashCode())) * 31)) * 31;
        BlazeAdProvider blazeAdProvider = this.d;
        int hashCode3 = (hashCode2 + (blazeAdProvider == null ? 0 : blazeAdProvider.hashCode())) * 31;
        String str2 = this.e;
        return hashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BlazeAdInfoModel(googleAdManagerId=");
        sb.append(this.googleAdManagerId);
        sb.append(", adUnitId=");
        sb.append(this.adUnitId);
        sb.append(", formatId=");
        sb.append(this.formatId);
        sb.append(", context=");
        sb.append(this.context);
        sb.append(", type=");
        sb.append(this.a);
        sb.append(", tag=");
        sb.append(this.b);
        sb.append(", adsConfig=");
        sb.append(this.c);
        sb.append(", adProvider=");
        sb.append(this.d);
        sb.append(", backofficeCampaignData=");
        return lnb.q(sb, this.e, ')');
    }

    public BlazeAdInfoModel(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull Map<String, String> map, @NotNull AdInfoType adInfoType, @Nullable String str4, @NotNull c cVar, @Nullable BlazeAdProvider blazeAdProvider, @Nullable String str5) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        map.getClass();
        adInfoType.getClass();
        cVar.getClass();
        this.googleAdManagerId = str;
        this.adUnitId = str2;
        this.formatId = str3;
        this.context = map;
        this.a = adInfoType;
        this.b = str4;
        this.c = cVar;
        this.d = blazeAdProvider;
        this.e = str5;
    }
}
