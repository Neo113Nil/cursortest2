package ru.ozon.fintech.settings.models;

import Cm.e;
import K1.G;
import androidx.annotation.Keep;
import com.squareup.moshi.i;
import com.squareup.moshi.j;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

@j(generateAdapter = true)
@Keep
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001BS\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u0018\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0019\u001a\u00020\u0005¢\u0006\u0002\u0010\u001aJ\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0019\u001a\u00020\u0005J\u0015\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\u0006\u0010\u0019\u001a\u00020\u0005¢\u0006\u0002\u0010\u001eJ\u0015\u0010\u001f\u001a\u0004\u0018\u00010 2\u0006\u0010\u0019\u001a\u00020\u0005¢\u0006\u0002\u0010!J\u0015\u0010\"\u001a\u0004\u0018\u00010#2\u0006\u0010\u0019\u001a\u00020\u0005¢\u0006\u0002\u0010$J\t\u0010%\u001a\u00020\u0003HÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0011\u0010'\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0007HÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u0001HÆ\u0003JU\u0010+\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÆ\u0001J\u0013\u0010,\u001a\u00020\u00032\b\u0010-\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010.\u001a\u00020\u001dHÖ\u0001J\t\u0010/\u001a\u00020\u0005HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u000eR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u001e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0010R\u0018\u0010\t\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u00018\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017¨\u00060"}, d2 = {"Lru/ozon/fintech/settings/models/FeatureValue;", "", "isEnabled", "", "urlRegExp", "", "stringArrayData", "", "stringData", "dict", "Lorg/json/JSONObject;", "dictParsed", "<init>", "(ZLjava/lang/String;Ljava/util/List;Ljava/lang/String;Lorg/json/JSONObject;Ljava/lang/Object;)V", "()Z", "getUrlRegExp", "()Ljava/lang/String;", "getStringArrayData", "()Ljava/util/List;", "getStringData", "getDict", "()Lorg/json/JSONObject;", "getDictParsed", "()Ljava/lang/Object;", "getDictBool", "key", "(Ljava/lang/String;)Ljava/lang/Boolean;", "getDictString", "getDictInt", "", "(Ljava/lang/String;)Ljava/lang/Integer;", "getDictLong", "", "(Ljava/lang/String;)Ljava/lang/Long;", "getDictDouble", "", "(Ljava/lang/String;)Ljava/lang/Double;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "hashCode", "toString", "fintech-settings_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class FeatureValue {

    @i(name = "dict")
    private final JSONObject dict;

    @i(name = "dictParsed")
    private final Object dictParsed;

    @i(name = "enabled")
    private final boolean isEnabled;

    @i(name = "stringArrayData")
    private final List<String> stringArrayData;

    @i(name = "stringData")
    private final String stringData;

    @i(name = "urlRegExp")
    private final String urlRegExp;

    public FeatureValue() {
        this(false, null, null, null, null, null, 63, null);
    }

    public static /* synthetic */ FeatureValue copy$default(FeatureValue featureValue, boolean z11, String str, List list, String str2, JSONObject jSONObject, Object obj, int i11, Object obj2) {
        if ((i11 & 1) != 0) {
            z11 = featureValue.isEnabled;
        }
        if ((i11 & 2) != 0) {
            str = featureValue.urlRegExp;
        }
        if ((i11 & 4) != 0) {
            list = featureValue.stringArrayData;
        }
        if ((i11 & 8) != 0) {
            str2 = featureValue.stringData;
        }
        if ((i11 & 16) != 0) {
            jSONObject = featureValue.dict;
        }
        if ((i11 & 32) != 0) {
            obj = featureValue.dictParsed;
        }
        JSONObject jSONObject2 = jSONObject;
        Object obj3 = obj;
        return featureValue.copy(z11, str, list, str2, jSONObject2, obj3);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getIsEnabled() {
        return this.isEnabled;
    }

    /* renamed from: component2, reason: from getter */
    public final String getUrlRegExp() {
        return this.urlRegExp;
    }

    public final List<String> component3() {
        return this.stringArrayData;
    }

    /* renamed from: component4, reason: from getter */
    public final String getStringData() {
        return this.stringData;
    }

    /* renamed from: component5, reason: from getter */
    public final JSONObject getDict() {
        return this.dict;
    }

    /* renamed from: component6, reason: from getter */
    public final Object getDictParsed() {
        return this.dictParsed;
    }

    @NotNull
    public final FeatureValue copy(boolean isEnabled, String urlRegExp, List<String> stringArrayData, String stringData, JSONObject dict, Object dictParsed) {
        return new FeatureValue(isEnabled, urlRegExp, stringArrayData, stringData, dict, dictParsed);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FeatureValue)) {
            return false;
        }
        FeatureValue featureValue = (FeatureValue) other;
        return this.isEnabled == featureValue.isEnabled && Intrinsics.d(this.urlRegExp, featureValue.urlRegExp) && Intrinsics.d(this.stringArrayData, featureValue.stringArrayData) && Intrinsics.d(this.stringData, featureValue.stringData) && Intrinsics.d(this.dict, featureValue.dict) && Intrinsics.d(this.dictParsed, featureValue.dictParsed);
    }

    public final JSONObject getDict() {
        return this.dict;
    }

    public final Boolean getDictBool(@NotNull String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        try {
            JSONObject jSONObject = this.dict;
            if (jSONObject != null) {
                return Boolean.valueOf(jSONObject.getBoolean(key));
            }
        } catch (Exception unused) {
        }
        return null;
    }

    public final Double getDictDouble(@NotNull String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        try {
            JSONObject jSONObject = this.dict;
            if (jSONObject != null) {
                return Double.valueOf(jSONObject.getDouble(key));
            }
        } catch (Exception unused) {
        }
        return null;
    }

    public final Integer getDictInt(@NotNull String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        try {
            JSONObject jSONObject = this.dict;
            if (jSONObject != null) {
                return Integer.valueOf(jSONObject.getInt(key));
            }
        } catch (Exception unused) {
        }
        return null;
    }

    public final Long getDictLong(@NotNull String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        try {
            JSONObject jSONObject = this.dict;
            if (jSONObject != null) {
                return Long.valueOf(jSONObject.getLong(key));
            }
        } catch (Exception unused) {
        }
        return null;
    }

    public final Object getDictParsed() {
        return this.dictParsed;
    }

    public final String getDictString(@NotNull String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        try {
            JSONObject jSONObject = this.dict;
            if (jSONObject != null) {
                return jSONObject.getString(key);
            }
        } catch (Exception unused) {
        }
        return null;
    }

    public final List<String> getStringArrayData() {
        return this.stringArrayData;
    }

    public final String getStringData() {
        return this.stringData;
    }

    public final String getUrlRegExp() {
        return this.urlRegExp;
    }

    public int hashCode() {
        int hashCode = Boolean.hashCode(this.isEnabled) * 31;
        String str = this.urlRegExp;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        List<String> list = this.stringArrayData;
        int hashCode3 = (hashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        String str2 = this.stringData;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        JSONObject jSONObject = this.dict;
        int hashCode5 = (hashCode4 + (jSONObject == null ? 0 : jSONObject.hashCode())) * 31;
        Object obj = this.dictParsed;
        return hashCode5 + (obj != null ? obj.hashCode() : 0);
    }

    public final boolean isEnabled() {
        return this.isEnabled;
    }

    @NotNull
    public String toString() {
        boolean z11 = this.isEnabled;
        String str = this.urlRegExp;
        List<String> list = this.stringArrayData;
        String str2 = this.stringData;
        JSONObject jSONObject = this.dict;
        Object obj = this.dictParsed;
        StringBuilder d11 = G.d("FeatureValue(isEnabled=", ", urlRegExp=", str, ", stringArrayData=", z11);
        e.i(", stringData=", str2, ", dict=", d11, list);
        d11.append(jSONObject);
        d11.append(", dictParsed=");
        d11.append(obj);
        d11.append(")");
        return d11.toString();
    }

    public FeatureValue(boolean z11, String str, List<String> list, String str2, JSONObject jSONObject, Object obj) {
        this.isEnabled = z11;
        this.urlRegExp = str;
        this.stringArrayData = list;
        this.stringData = str2;
        this.dict = jSONObject;
        this.dictParsed = obj;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public /* synthetic */ FeatureValue(boolean r2, java.lang.String r3, java.util.List r4, java.lang.String r5, org.json.JSONObject r6, java.lang.Object r7, int r8, kotlin.jvm.internal.DefaultConstructorMarker r9) {
        /*
            r1 = this;
            r9 = r8 & 1
            if (r9 == 0) goto L5
            r2 = 0
        L5:
            r9 = r8 & 2
            r0 = 0
            if (r9 == 0) goto Lb
            r3 = r0
        Lb:
            r9 = r8 & 4
            if (r9 == 0) goto L10
            r4 = r0
        L10:
            r9 = r8 & 8
            if (r9 == 0) goto L15
            r5 = r0
        L15:
            r9 = r8 & 16
            if (r9 == 0) goto L1a
            r6 = r0
        L1a:
            r8 = r8 & 32
            if (r8 == 0) goto L26
            r9 = r0
            r7 = r5
            r8 = r6
            r5 = r3
            r6 = r4
            r3 = r1
            r4 = r2
            goto L2d
        L26:
            r9 = r7
            r8 = r6
            r6 = r4
            r7 = r5
            r4 = r2
            r5 = r3
            r3 = r1
        L2d:
            r3.<init>(r4, r5, r6, r7, r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.ozon.fintech.settings.models.FeatureValue.<init>(boolean, java.lang.String, java.util.List, java.lang.String, org.json.JSONObject, java.lang.Object, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
