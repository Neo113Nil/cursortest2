package ru.ozon.fintech.analytic.models;

import Nh.a;
import com.google.android.gms.common.internal.ImagesContract;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.squareup.moshi.i;
import com.squareup.moshi.j;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@j(generateAdapter = true)
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\b\u001a\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001By\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0016\b\u0002\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0006\u0012\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\r¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0011J\u0017\u0010\u001e\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u0011\u0010$\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\rHÆ\u0003J\u0080\u0001\u0010%\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0016\b\u0002\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00062\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\rHÆ\u0001¢\u0006\u0002\u0010&J\u0013\u0010'\u001a\u00020(2\b\u0010)\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010*\u001a\u00020+HÖ\u0001J\t\u0010,\u001a\u00020\u0006HÖ\u0001R\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0010\u0010\u0011R$\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016R\u0018\u0010\t\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0016R\u0018\u0010\n\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0016R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0016R\u0019\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001c¨\u0006-"}, d2 = {"Lru/ozon/fintech/analytic/models/HealthData;", "", "duration", "", "metadata", "", "", "objectId", "objectType", "parentId", "source", ImagesContract.URL, "nonMaskedFields", "", "<init>", "(Ljava/lang/Long;Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "getDuration", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getMetadata", "()Ljava/util/Map;", "getObjectId", "()Ljava/lang/String;", "getObjectType", "getParentId", "getSource", "getUrl", "getNonMaskedFields", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "(Ljava/lang/Long;Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)Lru/ozon/fintech/analytic/models/HealthData;", "equals", "", "other", "hashCode", "", "toString", "fintech-analytic_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class HealthData {

    @i(name = "duration")
    private final Long duration;

    @i(name = "metadata")
    private final Map<String, Object> metadata;
    private final transient List<String> nonMaskedFields;

    @i(name = "object_id")
    private final String objectId;

    @i(name = "object_type")
    private final String objectType;

    @i(name = "parent_id")
    private final String parentId;

    @i(name = "source")
    private final String source;

    @i(name = ImagesContract.URL)
    private final String url;

    public HealthData() {
        this(null, null, null, null, null, null, null, null, 255, null);
    }

    public static /* synthetic */ HealthData copy$default(HealthData healthData, Long l11, Map map, String str, String str2, String str3, String str4, String str5, List list, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            l11 = healthData.duration;
        }
        if ((i11 & 2) != 0) {
            map = healthData.metadata;
        }
        if ((i11 & 4) != 0) {
            str = healthData.objectId;
        }
        if ((i11 & 8) != 0) {
            str2 = healthData.objectType;
        }
        if ((i11 & 16) != 0) {
            str3 = healthData.parentId;
        }
        if ((i11 & 32) != 0) {
            str4 = healthData.source;
        }
        if ((i11 & 64) != 0) {
            str5 = healthData.url;
        }
        if ((i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
            list = healthData.nonMaskedFields;
        }
        String str6 = str5;
        List list2 = list;
        String str7 = str3;
        String str8 = str4;
        return healthData.copy(l11, map, str, str2, str7, str8, str6, list2);
    }

    /* renamed from: component1, reason: from getter */
    public final Long getDuration() {
        return this.duration;
    }

    public final Map<String, Object> component2() {
        return this.metadata;
    }

    /* renamed from: component3, reason: from getter */
    public final String getObjectId() {
        return this.objectId;
    }

    /* renamed from: component4, reason: from getter */
    public final String getObjectType() {
        return this.objectType;
    }

    /* renamed from: component5, reason: from getter */
    public final String getParentId() {
        return this.parentId;
    }

    /* renamed from: component6, reason: from getter */
    public final String getSource() {
        return this.source;
    }

    /* renamed from: component7, reason: from getter */
    public final String getUrl() {
        return this.url;
    }

    public final List<String> component8() {
        return this.nonMaskedFields;
    }

    @NotNull
    public final HealthData copy(Long duration, Map<String, ? extends Object> metadata, String objectId, String objectType, String parentId, String source, String url, List<String> nonMaskedFields) {
        return new HealthData(duration, metadata, objectId, objectType, parentId, source, url, nonMaskedFields);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HealthData)) {
            return false;
        }
        HealthData healthData = (HealthData) other;
        return Intrinsics.d(this.duration, healthData.duration) && Intrinsics.d(this.metadata, healthData.metadata) && Intrinsics.d(this.objectId, healthData.objectId) && Intrinsics.d(this.objectType, healthData.objectType) && Intrinsics.d(this.parentId, healthData.parentId) && Intrinsics.d(this.source, healthData.source) && Intrinsics.d(this.url, healthData.url) && Intrinsics.d(this.nonMaskedFields, healthData.nonMaskedFields);
    }

    public final Long getDuration() {
        return this.duration;
    }

    public final Map<String, Object> getMetadata() {
        return this.metadata;
    }

    public final List<String> getNonMaskedFields() {
        return this.nonMaskedFields;
    }

    public final String getObjectId() {
        return this.objectId;
    }

    public final String getObjectType() {
        return this.objectType;
    }

    public final String getParentId() {
        return this.parentId;
    }

    public final String getSource() {
        return this.source;
    }

    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        Long l11 = this.duration;
        int hashCode = (l11 == null ? 0 : l11.hashCode()) * 31;
        Map<String, Object> map = this.metadata;
        int hashCode2 = (hashCode + (map == null ? 0 : map.hashCode())) * 31;
        String str = this.objectId;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.objectType;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.parentId;
        int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.source;
        int hashCode6 = (hashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.url;
        int hashCode7 = (hashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
        List<String> list = this.nonMaskedFields;
        return hashCode7 + (list != null ? list.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        Long l11 = this.duration;
        Map<String, Object> map = this.metadata;
        String str = this.objectId;
        String str2 = this.objectType;
        String str3 = this.parentId;
        String str4 = this.source;
        String str5 = this.url;
        List<String> list = this.nonMaskedFields;
        StringBuilder sb2 = new StringBuilder("HealthData(duration=");
        sb2.append(l11);
        sb2.append(", metadata=");
        sb2.append(map);
        sb2.append(", objectId=");
        a.h(sb2, str, ", objectType=", str2, ", parentId=");
        a.h(sb2, str3, ", source=", str4, ", url=");
        sb2.append(str5);
        sb2.append(", nonMaskedFields=");
        sb2.append(list);
        sb2.append(")");
        return sb2.toString();
    }

    public HealthData(Long l11, Map<String, ? extends Object> map, String str, String str2, String str3, String str4, String str5, List<String> list) {
        this.duration = l11;
        this.metadata = map;
        this.objectId = str;
        this.objectType = str2;
        this.parentId = str3;
        this.source = str4;
        this.url = str5;
        this.nonMaskedFields = list;
    }

    public /* synthetic */ HealthData(Long l11, Map map, String str, String str2, String str3, String str4, String str5, List list, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : l11, (i11 & 2) != 0 ? null : map, (i11 & 4) != 0 ? null : str, (i11 & 8) != 0 ? null : str2, (i11 & 16) != 0 ? null : str3, (i11 & 32) != 0 ? null : str4, (i11 & 64) != 0 ? null : str5, (i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? null : list);
    }
}
