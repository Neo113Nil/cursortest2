package com.blaze.blazesdk.style.shared.models;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.blaze.blazesdk.utils.BlazeParcelable;
import com.fyber.inneractive.sdk.external.InneractiveMediationNameConsts;
import com.ironsource.U3;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import defpackage.dmi;
import defpackage.fc6;
import defpackage.lnb;
import defpackage.o6a;
import defpackage.ox1;
import defpackage.zzl;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Keep
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u0000 E2\u00020\u0001:\u0002FGBM\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00060\u0005\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0014\b\u0002\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00060\n¢\u0006\u0004\b\f\u0010\rB-\b\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\f\u0010\u000eJ\u001c\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00060\nHÂ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J#\u0010\u0015\u001a\u00020\u00122\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00060\u0005H\u0000¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u001a\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001d\u001a\u00020\u0012H\u0000¢\u0006\u0004\b\u001b\u0010\u001cJ\u001d\u0010\"\u001a\u00020\u00122\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010!\u001a\u00020 ¢\u0006\u0004\b\"\u0010#J\r\u0010$\u001a\u00020 ¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b&\u0010'J\u0010\u0010(\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b(\u0010'J\u001c\u0010)\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003¢\u0006\u0004\b)\u0010\u0010J\u0012\u0010*\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b*\u0010+J\\\u0010,\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00060\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\u0014\b\u0002\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00060\nHÆ\u0001¢\u0006\u0004\b,\u0010-J\u0010\u0010.\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b.\u0010'J\u0010\u0010/\u001a\u00020 HÖ\u0001¢\u0006\u0004\b/\u0010%J\u001a\u00102\u001a\u0002012\b\u00100\u001a\u0004\u0018\u00010\u0006HÖ\u0003¢\u0006\u0004\b2\u00103R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u00104\u001a\u0004\b5\u0010'\"\u0004\b6\u00107R\"\u0010\u0004\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0004\u00104\u001a\u0004\b8\u0010'\"\u0004\b9\u00107R.\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00060\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010:\u001a\u0004\b;\u0010\u0010\"\u0004\b<\u0010\u0014R$\u0010\t\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010=\u001a\u0004\b>\u0010+\"\u0004\b?\u0010@R\"\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00060\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010:R.\u0010D\u001a\u001c\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0005\u0012\u0004\u0012\u000201\u0018\u00010A8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bB\u0010C¨\u0006H"}, d2 = {"Lcom/blaze/blazesdk/style/shared/models/BlazePlayerCustomActionButtonParams;", "Lcom/blaze/blazesdk/utils/BlazeParcelable;", "", "id", "name", "", "", "appMetadata", "Lcom/blaze/blazesdk/style/shared/models/BlazePlayerCustomActionButtonParams$VisibilityCondition;", "visibilityCondition", "", "sdkMetadata", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Lcom/blaze/blazesdk/style/shared/models/BlazePlayerCustomActionButtonParams$VisibilityCondition;Ljava/util/Map;)V", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V", "component5", "()Ljava/util/Map;", TtmlNode.TAG_METADATA, "", "enrichSDKMetadata$blazesdk_release", "(Ljava/util/Map;)V", "enrichSDKMetadata", U3.i.W, U3.i.X, "updateSDKMetadata$blazesdk_release", "(Ljava/lang/String;Ljava/lang/Object;)V", "updateSDKMetadata", "clearSDKMetadata$blazesdk_release", "()V", "clearSDKMetadata", "Landroid/os/Parcel;", "dest", "", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "()Lcom/blaze/blazesdk/style/shared/models/BlazePlayerCustomActionButtonParams$VisibilityCondition;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Lcom/blaze/blazesdk/style/shared/models/BlazePlayerCustomActionButtonParams$VisibilityCondition;Ljava/util/Map;)Lcom/blaze/blazesdk/style/shared/models/BlazePlayerCustomActionButtonParams;", "toString", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId", "setId", "(Ljava/lang/String;)V", "getName", "setName", "Ljava/util/Map;", "getAppMetadata", "setAppMetadata", "Lcom/blaze/blazesdk/style/shared/models/BlazePlayerCustomActionButtonParams$VisibilityCondition;", "getVisibilityCondition", "setVisibilityCondition", "(Lcom/blaze/blazesdk/style/shared/models/BlazePlayerCustomActionButtonParams$VisibilityCondition;)V", "Lkotlin/Function1;", "getVisibilityEvaluator$blazesdk_release", "()Lkotlin/jvm/functions/Function1;", "visibilityEvaluator", "Companion", "VisibilityCondition", "a", "blazesdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class BlazePlayerCustomActionButtonParams implements BlazeParcelable {

    @NotNull
    private Map<String, ? extends Object> appMetadata;

    @NotNull
    private String id;

    @NotNull
    private String name;

    @NotNull
    private Map<String, Object> sdkMetadata;

    @Nullable
    private VisibilityCondition visibilityCondition;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @NotNull
    public static final Parcelable.Creator<BlazePlayerCustomActionButtonParams> CREATOR = new b();

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    /* renamed from: com.blaze.blazesdk.style.shared.models.BlazePlayerCustomActionButtonParams$a, reason: from kotlin metadata */
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }

        /* JADX WARN: Removed duplicated region for block: B:17:0x01f5 A[RETURN] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static boolean a(VisibilityCondition visibilityCondition, Map map) {
            Double f;
            Double f2;
            Double f3;
            List<Object> values;
            List<Object> values2;
            visibilityCondition.getClass();
            map.getClass();
            if (visibilityCondition instanceof VisibilityCondition.Always) {
                return true;
            }
            if (visibilityCondition instanceof VisibilityCondition.Never) {
                return false;
            }
            if (visibilityCondition instanceof VisibilityCondition.KeyExists) {
                return map.containsKey(((VisibilityCondition.KeyExists) visibilityCondition).getKey());
            }
            if (visibilityCondition instanceof VisibilityCondition.KeyNotExists) {
                return !map.containsKey(((VisibilityCondition.KeyNotExists) visibilityCondition).getKey());
            }
            if (visibilityCondition instanceof VisibilityCondition.KeyEquals) {
                VisibilityCondition.KeyEquals keyEquals = (VisibilityCondition.KeyEquals) visibilityCondition;
                String str = (String) map.get(keyEquals.getKey());
                if (str != null) {
                    return b(keyEquals.getValue(), str);
                }
            } else if (visibilityCondition instanceof VisibilityCondition.KeyNotEquals) {
                VisibilityCondition.KeyNotEquals keyNotEquals = (VisibilityCondition.KeyNotEquals) visibilityCondition;
                String str2 = (String) map.get(keyNotEquals.getKey());
                if (str2 != null && b(keyNotEquals.getValue(), str2)) {
                }
            } else if (visibilityCondition instanceof VisibilityCondition.KeyIn) {
                VisibilityCondition.KeyIn keyIn = (VisibilityCondition.KeyIn) visibilityCondition;
                String str3 = (String) map.get(keyIn.getKey());
                if (str3 != null && ((values2 = keyIn.getValues()) == null || !values2.isEmpty())) {
                    for (Object obj : values2) {
                        BlazePlayerCustomActionButtonParams.INSTANCE.getClass();
                        if (b(obj, str3)) {
                        }
                    }
                }
            } else {
                if (visibilityCondition instanceof VisibilityCondition.KeyNotIn) {
                    VisibilityCondition.KeyNotIn keyNotIn = (VisibilityCondition.KeyNotIn) visibilityCondition;
                    String str4 = (String) map.get(keyNotIn.getKey());
                    if (str4 != null && ((values = keyNotIn.getValues()) == null || !values.isEmpty())) {
                        for (Object obj2 : values) {
                            BlazePlayerCustomActionButtonParams.INSTANCE.getClass();
                            if (b(obj2, str4)) {
                            }
                        }
                    }
                }
                if (visibilityCondition instanceof VisibilityCondition.KeyGreaterThan) {
                    VisibilityCondition.KeyGreaterThan keyGreaterThan = (VisibilityCondition.KeyGreaterThan) visibilityCondition;
                    String str5 = (String) map.get(keyGreaterThan.getKey());
                    if (str5 != null && (f3 = kotlin.text.b.f(str5)) != null && f3.doubleValue() > keyGreaterThan.getThreshold()) {
                    }
                } else if (visibilityCondition instanceof VisibilityCondition.KeyLessThan) {
                    VisibilityCondition.KeyLessThan keyLessThan = (VisibilityCondition.KeyLessThan) visibilityCondition;
                    String str6 = (String) map.get(keyLessThan.getKey());
                    if (str6 != null && (f2 = kotlin.text.b.f(str6)) != null && f2.doubleValue() < keyLessThan.getThreshold()) {
                    }
                } else if (visibilityCondition instanceof VisibilityCondition.KeyBetween) {
                    VisibilityCondition.KeyBetween keyBetween = (VisibilityCondition.KeyBetween) visibilityCondition;
                    String str7 = (String) map.get(keyBetween.getKey());
                    if (str7 != null && (f = kotlin.text.b.f(str7)) != null) {
                        double doubleValue = f.doubleValue();
                        if (doubleValue < keyBetween.getMin() || doubleValue > keyBetween.getMax()) {
                        }
                    }
                } else if (visibilityCondition instanceof VisibilityCondition.KeyContains) {
                    VisibilityCondition.KeyContains keyContains = (VisibilityCondition.KeyContains) visibilityCondition;
                    String str8 = (String) map.get(keyContains.getKey());
                    if (str8 != null) {
                        return StringsKt.J(str8, keyContains.getSubstring(), false);
                    }
                } else {
                    if (visibilityCondition instanceof VisibilityCondition.And) {
                        List<VisibilityCondition> conditions = ((VisibilityCondition.And) visibilityCondition).getConditions();
                        if (conditions == null || !conditions.isEmpty()) {
                            for (VisibilityCondition visibilityCondition2 : conditions) {
                                BlazePlayerCustomActionButtonParams.INSTANCE.getClass();
                                if (!a(visibilityCondition2, map)) {
                                }
                            }
                        }
                    }
                    if (visibilityCondition instanceof VisibilityCondition.Or) {
                        List<VisibilityCondition> conditions2 = ((VisibilityCondition.Or) visibilityCondition).getConditions();
                        if (conditions2 == null || !conditions2.isEmpty()) {
                            for (VisibilityCondition visibilityCondition3 : conditions2) {
                                BlazePlayerCustomActionButtonParams.INSTANCE.getClass();
                                if (a(visibilityCondition3, map)) {
                                }
                            }
                        }
                    } else {
                        if (!(visibilityCondition instanceof VisibilityCondition.Not)) {
                            zzl.b();
                            return false;
                        }
                        if (!a(((VisibilityCondition.Not) visibilityCondition).getCondition(), map)) {
                        }
                    }
                }
            }
        }

        public static boolean b(Object obj, String str) {
            if (obj instanceof String) {
                return str.equals(obj);
            }
            if (obj instanceof Boolean) {
                String lowerCase = str.toLowerCase(Locale.ROOT);
                lowerCase.getClass();
                return Intrinsics.c(StringsKt.j0(lowerCase), obj);
            }
            if (obj instanceof Number) {
                return Intrinsics.a(kotlin.text.b.f(str), ((Number) obj).doubleValue());
            }
            if (obj == null) {
                return false;
            }
            return str.equals(obj.toString());
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static final class b implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            parcel.getClass();
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            int readInt = parcel.readInt();
            LinkedHashMap linkedHashMap = new LinkedHashMap(readInt);
            for (int i = 0; i != readInt; i++) {
                linkedHashMap.put(parcel.readString(), parcel.readValue(BlazePlayerCustomActionButtonParams.class.getClassLoader()));
            }
            VisibilityCondition visibilityCondition = (VisibilityCondition) parcel.readParcelable(BlazePlayerCustomActionButtonParams.class.getClassLoader());
            int readInt2 = parcel.readInt();
            LinkedHashMap linkedHashMap2 = new LinkedHashMap(readInt2);
            for (int i2 = 0; i2 != readInt2; i2++) {
                linkedHashMap2.put(parcel.readString(), parcel.readValue(BlazePlayerCustomActionButtonParams.class.getClassLoader()));
            }
            return new BlazePlayerCustomActionButtonParams(readString, readString2, linkedHashMap, visibilityCondition, linkedHashMap2);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new BlazePlayerCustomActionButtonParams[i];
        }
    }

    public BlazePlayerCustomActionButtonParams(@NotNull String str, @NotNull String str2, @NotNull Map<String, ? extends Object> map, @Nullable VisibilityCondition visibilityCondition, @NotNull Map<String, Object> map2) {
        str.getClass();
        str2.getClass();
        map.getClass();
        map2.getClass();
        this.id = str;
        this.name = str2;
        this.appMetadata = map;
        this.visibilityCondition = visibilityCondition;
        this.sdkMetadata = map2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean _get_visibilityEvaluator_$lambda$1$lambda$0(VisibilityCondition visibilityCondition, Map map) {
        map.getClass();
        INSTANCE.getClass();
        return Companion.a(visibilityCondition, map);
    }

    private final Map<String, Object> component5() {
        return this.sdkMetadata;
    }

    public static /* synthetic */ BlazePlayerCustomActionButtonParams copy$default(BlazePlayerCustomActionButtonParams blazePlayerCustomActionButtonParams, String str, String str2, Map map, VisibilityCondition visibilityCondition, Map map2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = blazePlayerCustomActionButtonParams.id;
        }
        if ((i & 2) != 0) {
            str2 = blazePlayerCustomActionButtonParams.name;
        }
        if ((i & 4) != 0) {
            map = blazePlayerCustomActionButtonParams.appMetadata;
        }
        if ((i & 8) != 0) {
            visibilityCondition = blazePlayerCustomActionButtonParams.visibilityCondition;
        }
        if ((i & 16) != 0) {
            map2 = blazePlayerCustomActionButtonParams.sdkMetadata;
        }
        Map map3 = map2;
        Map map4 = map;
        return blazePlayerCustomActionButtonParams.copy(str, str2, map4, visibilityCondition, map3);
    }

    public final void clearSDKMetadata$blazesdk_release() {
        this.sdkMetadata.clear();
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getName() {
        return this.name;
    }

    @NotNull
    public final Map<String, Object> component3() {
        return this.appMetadata;
    }

    @Nullable
    /* renamed from: component4, reason: from getter */
    public final VisibilityCondition getVisibilityCondition() {
        return this.visibilityCondition;
    }

    @NotNull
    public final BlazePlayerCustomActionButtonParams copy(@NotNull String id, @NotNull String name, @NotNull Map<String, ? extends Object> appMetadata, @Nullable VisibilityCondition visibilityCondition, @NotNull Map<String, Object> sdkMetadata) {
        id.getClass();
        name.getClass();
        appMetadata.getClass();
        sdkMetadata.getClass();
        return new BlazePlayerCustomActionButtonParams(id, name, appMetadata, visibilityCondition, sdkMetadata);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final void enrichSDKMetadata$blazesdk_release(@NotNull Map<String, ? extends Object> metadata) {
        metadata.getClass();
        this.sdkMetadata.putAll(metadata);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BlazePlayerCustomActionButtonParams)) {
            return false;
        }
        BlazePlayerCustomActionButtonParams blazePlayerCustomActionButtonParams = (BlazePlayerCustomActionButtonParams) other;
        return Intrinsics.c(this.id, blazePlayerCustomActionButtonParams.id) && Intrinsics.c(this.name, blazePlayerCustomActionButtonParams.name) && Intrinsics.c(this.appMetadata, blazePlayerCustomActionButtonParams.appMetadata) && Intrinsics.c(this.visibilityCondition, blazePlayerCustomActionButtonParams.visibilityCondition) && Intrinsics.c(this.sdkMetadata, blazePlayerCustomActionButtonParams.sdkMetadata);
    }

    @NotNull
    public final Map<String, Object> getAppMetadata() {
        return this.appMetadata;
    }

    @NotNull
    public final String getId() {
        return this.id;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    @Nullable
    public final VisibilityCondition getVisibilityCondition() {
        return this.visibilityCondition;
    }

    @Nullable
    public final Function1<Map<String, String>, Boolean> getVisibilityEvaluator$blazesdk_release() {
        VisibilityCondition visibilityCondition = this.visibilityCondition;
        if (visibilityCondition != null) {
            return new ox1(visibilityCondition, 6);
        }
        return null;
    }

    public int hashCode() {
        int g = dmi.g(this.appMetadata, o6a.k(this.name, this.id.hashCode() * 31), 31);
        VisibilityCondition visibilityCondition = this.visibilityCondition;
        return this.sdkMetadata.hashCode() + ((g + (visibilityCondition == null ? 0 : visibilityCondition.hashCode())) * 31);
    }

    public final void setAppMetadata(@NotNull Map<String, ? extends Object> map) {
        map.getClass();
        this.appMetadata = map;
    }

    public final void setId(@NotNull String str) {
        str.getClass();
        this.id = str;
    }

    public final void setName(@NotNull String str) {
        str.getClass();
        this.name = str;
    }

    public final void setVisibilityCondition(@Nullable VisibilityCondition visibilityCondition) {
        this.visibilityCondition = visibilityCondition;
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder("BlazePlayerCustomActionButtonParams(id=");
        sb.append(this.id);
        sb.append(", name=");
        sb.append(this.name);
        sb.append(", appMetadata=");
        sb.append(this.appMetadata);
        sb.append(", visibilityCondition=");
        sb.append(this.visibilityCondition);
        sb.append(", sdkMetadata=");
        return dmi.s(sb, this.sdkMetadata, ')');
    }

    public final void updateSDKMetadata$blazesdk_release(@NotNull String key, @NotNull Object value) {
        key.getClass();
        value.getClass();
        this.sdkMetadata.put(key, value);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        dest.getClass();
        dest.writeString(this.id);
        dest.writeString(this.name);
        Map<String, ? extends Object> map = this.appMetadata;
        dest.writeInt(map.size());
        for (Map.Entry<String, ? extends Object> entry : map.entrySet()) {
            dest.writeString(entry.getKey());
            dest.writeValue(entry.getValue());
        }
        dest.writeParcelable(this.visibilityCondition, flags);
        Map<String, Object> map2 = this.sdkMetadata;
        dest.writeInt(map2.size());
        for (Map.Entry<String, Object> entry2 : map2.entrySet()) {
            dest.writeString(entry2.getKey());
            dest.writeValue(entry2.getValue());
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Keep
    @Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u000f\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u000f\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !¨\u0006\""}, d2 = {"Lcom/blaze/blazesdk/style/shared/models/BlazePlayerCustomActionButtonParams$VisibilityCondition;", "Lcom/blaze/blazesdk/utils/BlazeParcelable;", "<init>", "()V", "Always", "Never", "KeyExists", "KeyNotExists", "KeyEquals", "KeyNotEquals", "KeyIn", "KeyNotIn", "KeyGreaterThan", "KeyLessThan", "KeyBetween", "KeyContains", "And", "Or", "Not", "Lcom/blaze/blazesdk/style/shared/models/BlazePlayerCustomActionButtonParams$VisibilityCondition$Always;", "Lcom/blaze/blazesdk/style/shared/models/BlazePlayerCustomActionButtonParams$VisibilityCondition$And;", "Lcom/blaze/blazesdk/style/shared/models/BlazePlayerCustomActionButtonParams$VisibilityCondition$KeyBetween;", "Lcom/blaze/blazesdk/style/shared/models/BlazePlayerCustomActionButtonParams$VisibilityCondition$KeyContains;", "Lcom/blaze/blazesdk/style/shared/models/BlazePlayerCustomActionButtonParams$VisibilityCondition$KeyEquals;", "Lcom/blaze/blazesdk/style/shared/models/BlazePlayerCustomActionButtonParams$VisibilityCondition$KeyExists;", "Lcom/blaze/blazesdk/style/shared/models/BlazePlayerCustomActionButtonParams$VisibilityCondition$KeyGreaterThan;", "Lcom/blaze/blazesdk/style/shared/models/BlazePlayerCustomActionButtonParams$VisibilityCondition$KeyIn;", "Lcom/blaze/blazesdk/style/shared/models/BlazePlayerCustomActionButtonParams$VisibilityCondition$KeyLessThan;", "Lcom/blaze/blazesdk/style/shared/models/BlazePlayerCustomActionButtonParams$VisibilityCondition$KeyNotEquals;", "Lcom/blaze/blazesdk/style/shared/models/BlazePlayerCustomActionButtonParams$VisibilityCondition$KeyNotExists;", "Lcom/blaze/blazesdk/style/shared/models/BlazePlayerCustomActionButtonParams$VisibilityCondition$KeyNotIn;", "Lcom/blaze/blazesdk/style/shared/models/BlazePlayerCustomActionButtonParams$VisibilityCondition$Never;", "Lcom/blaze/blazesdk/style/shared/models/BlazePlayerCustomActionButtonParams$VisibilityCondition$Not;", "Lcom/blaze/blazesdk/style/shared/models/BlazePlayerCustomActionButtonParams$VisibilityCondition$Or;", "blazesdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static abstract class VisibilityCondition implements BlazeParcelable {
        public static final int $stable = 0;

        /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
        @Keep
        @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005J\u0016\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0005¨\u0006\u000b"}, d2 = {"Lcom/blaze/blazesdk/style/shared/models/BlazePlayerCustomActionButtonParams$VisibilityCondition$Always;", "Lcom/blaze/blazesdk/style/shared/models/BlazePlayerCustomActionButtonParams$VisibilityCondition;", "<init>", "()V", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "blazesdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Always extends VisibilityCondition {
            public static final int $stable = 0;

            @NotNull
            public static final Always INSTANCE = new Always();

            @NotNull
            public static final Parcelable.Creator<Always> CREATOR = new a();

            /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    parcel.getClass();
                    parcel.readInt();
                    return Always.INSTANCE;
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new Always[i];
                }
            }

            private Always() {
                super(null);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@NotNull Parcel dest, int flags) {
                dest.getClass();
                dest.writeInt(1);
            }
        }

        /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
        @Keep
        @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00010\u0003HÆ\u0003J\u0019\u0010\t\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0003HÆ\u0001J\u0006\u0010\n\u001a\u00020\u000bJ\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u000bHÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\u0016\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u000bR\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0018"}, d2 = {"Lcom/blaze/blazesdk/style/shared/models/BlazePlayerCustomActionButtonParams$VisibilityCondition$And;", "Lcom/blaze/blazesdk/style/shared/models/BlazePlayerCustomActionButtonParams$VisibilityCondition;", "conditions", "", "<init>", "(Ljava/util/List;)V", "getConditions", "()Ljava/util/List;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "blazesdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class And extends VisibilityCondition {
            public static final int $stable = 8;

            @NotNull
            public static final Parcelable.Creator<And> CREATOR = new a();

            @NotNull
            private final List<VisibilityCondition> conditions;

            /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    parcel.getClass();
                    int readInt = parcel.readInt();
                    ArrayList arrayList = new ArrayList(readInt);
                    for (int i = 0; i != readInt; i++) {
                        arrayList.add(parcel.readParcelable(And.class.getClassLoader()));
                    }
                    return new And(arrayList);
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new And[i];
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public And(@NotNull List<? extends VisibilityCondition> list) {
                super(null);
                list.getClass();
                this.conditions = list;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ And copy$default(And and, List list, int i, Object obj) {
                if ((i & 1) != 0) {
                    list = and.conditions;
                }
                return and.copy(list);
            }

            @NotNull
            public final List<VisibilityCondition> component1() {
                return this.conditions;
            }

            @NotNull
            public final And copy(@NotNull List<? extends VisibilityCondition> conditions) {
                conditions.getClass();
                return new And(conditions);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(@Nullable Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof And) && Intrinsics.c(this.conditions, ((And) other).conditions);
            }

            @NotNull
            public final List<VisibilityCondition> getConditions() {
                return this.conditions;
            }

            public int hashCode() {
                return this.conditions.hashCode();
            }

            @NotNull
            public String toString() {
                return fc6.p(new StringBuilder("And(conditions="), this.conditions, ')');
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@NotNull Parcel dest, int flags) {
                dest.getClass();
                List<VisibilityCondition> list = this.conditions;
                dest.writeInt(list.size());
                Iterator<VisibilityCondition> it = list.iterator();
                while (it.hasNext()) {
                    dest.writeParcelable(it.next(), flags);
                }
            }
        }

        /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
        @Keep
        @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0002\b\r\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\u0006\u0010\u0012\u001a\u00020\u0013J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u0013R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\f¨\u0006\u001f"}, d2 = {"Lcom/blaze/blazesdk/style/shared/models/BlazePlayerCustomActionButtonParams$VisibilityCondition$KeyBetween;", "Lcom/blaze/blazesdk/style/shared/models/BlazePlayerCustomActionButtonParams$VisibilityCondition;", U3.i.W, "", "min", "", InneractiveMediationNameConsts.MAX, "<init>", "(Ljava/lang/String;DD)V", "getKey", "()Ljava/lang/String;", "getMin", "()D", "getMax", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "blazesdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class KeyBetween extends VisibilityCondition {
            public static final int $stable = 0;

            @NotNull
            public static final Parcelable.Creator<KeyBetween> CREATOR = new a();

            @NotNull
            private final String key;
            private final double max;
            private final double min;

            /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    parcel.getClass();
                    return new KeyBetween(parcel.readString(), parcel.readDouble(), parcel.readDouble());
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new KeyBetween[i];
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public KeyBetween(@NotNull String str, double d, double d2) {
                super(null);
                str.getClass();
                this.key = str;
                this.min = d;
                this.max = d2;
            }

            public static /* synthetic */ KeyBetween copy$default(KeyBetween keyBetween, String str, double d, double d2, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = keyBetween.key;
                }
                if ((i & 2) != 0) {
                    d = keyBetween.min;
                }
                if ((i & 4) != 0) {
                    d2 = keyBetween.max;
                }
                return keyBetween.copy(str, d, d2);
            }

            @NotNull
            /* renamed from: component1, reason: from getter */
            public final String getKey() {
                return this.key;
            }

            /* renamed from: component2, reason: from getter */
            public final double getMin() {
                return this.min;
            }

            /* renamed from: component3, reason: from getter */
            public final double getMax() {
                return this.max;
            }

            @NotNull
            public final KeyBetween copy(@NotNull String key, double min, double max) {
                key.getClass();
                return new KeyBetween(key, min, max);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(@Nullable Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof KeyBetween)) {
                    return false;
                }
                KeyBetween keyBetween = (KeyBetween) other;
                return Intrinsics.c(this.key, keyBetween.key) && Double.compare(this.min, keyBetween.min) == 0 && Double.compare(this.max, keyBetween.max) == 0;
            }

            @NotNull
            public final String getKey() {
                return this.key;
            }

            public final double getMax() {
                return this.max;
            }

            public final double getMin() {
                return this.min;
            }

            public int hashCode() {
                return Double.hashCode(this.max) + dmi.b(this.key.hashCode() * 31, 31, this.min);
            }

            @NotNull
            public String toString() {
                return "KeyBetween(key=" + this.key + ", min=" + this.min + ", max=" + this.max + ')';
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@NotNull Parcel dest, int flags) {
                dest.getClass();
                dest.writeString(this.key);
                dest.writeDouble(this.min);
                dest.writeDouble(this.max);
            }
        }

        /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
        @Keep
        @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\r\u001a\u00020\u000eJ\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u000eHÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u000eR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u001a"}, d2 = {"Lcom/blaze/blazesdk/style/shared/models/BlazePlayerCustomActionButtonParams$VisibilityCondition$KeyContains;", "Lcom/blaze/blazesdk/style/shared/models/BlazePlayerCustomActionButtonParams$VisibilityCondition;", U3.i.W, "", "substring", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getKey", "()Ljava/lang/String;", "getSubstring", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "blazesdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class KeyContains extends VisibilityCondition {
            public static final int $stable = 0;

            @NotNull
            public static final Parcelable.Creator<KeyContains> CREATOR = new a();

            @NotNull
            private final String key;

            @NotNull
            private final String substring;

            /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    parcel.getClass();
                    return new KeyContains(parcel.readString(), parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new KeyContains[i];
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public KeyContains(@NotNull String str, @NotNull String str2) {
                super(null);
                str.getClass();
                str2.getClass();
                this.key = str;
                this.substring = str2;
            }

            public static /* synthetic */ KeyContains copy$default(KeyContains keyContains, String str, String str2, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = keyContains.key;
                }
                if ((i & 2) != 0) {
                    str2 = keyContains.substring;
                }
                return keyContains.copy(str, str2);
            }

            @NotNull
            /* renamed from: component1, reason: from getter */
            public final String getKey() {
                return this.key;
            }

            @NotNull
            /* renamed from: component2, reason: from getter */
            public final String getSubstring() {
                return this.substring;
            }

            @NotNull
            public final KeyContains copy(@NotNull String key, @NotNull String substring) {
                key.getClass();
                substring.getClass();
                return new KeyContains(key, substring);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(@Nullable Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof KeyContains)) {
                    return false;
                }
                KeyContains keyContains = (KeyContains) other;
                return Intrinsics.c(this.key, keyContains.key) && Intrinsics.c(this.substring, keyContains.substring);
            }

            @NotNull
            public final String getKey() {
                return this.key;
            }

            @NotNull
            public final String getSubstring() {
                return this.substring;
            }

            public int hashCode() {
                return this.substring.hashCode() + (this.key.hashCode() * 31);
            }

            @NotNull
            public String toString() {
                StringBuilder sb = new StringBuilder("KeyContains(key=");
                sb.append(this.key);
                sb.append(", substring=");
                return lnb.q(sb, this.substring, ')');
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@NotNull Parcel dest, int flags) {
                dest.getClass();
                dest.writeString(this.key);
                dest.writeString(this.substring);
            }
        }

        /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
        @Keep
        @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\n¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J$\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0012J\u0010\u0010\u0018\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0010J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001d\u001a\u0004\b\u001e\u0010\u0012R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001f\u001a\u0004\b \u0010\u0014¨\u0006!"}, d2 = {"Lcom/blaze/blazesdk/style/shared/models/BlazePlayerCustomActionButtonParams$VisibilityCondition$KeyEquals;", "Lcom/blaze/blazesdk/style/shared/models/BlazePlayerCustomActionButtonParams$VisibilityCondition;", "", U3.i.W, "", U3.i.X, "<init>", "(Ljava/lang/String;Ljava/lang/Object;)V", "Landroid/os/Parcel;", "dest", "", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Ljava/lang/String;", "component2", "()Ljava/lang/Object;", "copy", "(Ljava/lang/String;Ljava/lang/Object;)Lcom/blaze/blazesdk/style/shared/models/BlazePlayerCustomActionButtonParams$VisibilityCondition$KeyEquals;", "toString", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getKey", "Ljava/lang/Object;", "getValue", "blazesdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class KeyEquals extends VisibilityCondition {
            public static final int $stable = 8;

            @NotNull
            public static final Parcelable.Creator<KeyEquals> CREATOR = new a();

            @NotNull
            private final String key;

            @NotNull
            private final Object value;

            /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    parcel.getClass();
                    return new KeyEquals(parcel.readString(), parcel.readValue(KeyEquals.class.getClassLoader()));
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new KeyEquals[i];
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public KeyEquals(@NotNull String str, @NotNull Object obj) {
                super(null);
                str.getClass();
                obj.getClass();
                this.key = str;
                this.value = obj;
            }

            public static /* synthetic */ KeyEquals copy$default(KeyEquals keyEquals, String str, Object obj, int i, Object obj2) {
                if ((i & 1) != 0) {
                    str = keyEquals.key;
                }
                if ((i & 2) != 0) {
                    obj = keyEquals.value;
                }
                return keyEquals.copy(str, obj);
            }

            @NotNull
            /* renamed from: component1, reason: from getter */
            public final String getKey() {
                return this.key;
            }

            @NotNull
            /* renamed from: component2, reason: from getter */
            public final Object getValue() {
                return this.value;
            }

            @NotNull
            public final KeyEquals copy(@NotNull String key, @NotNull Object value) {
                key.getClass();
                value.getClass();
                return new KeyEquals(key, value);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(@Nullable Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof KeyEquals)) {
                    return false;
                }
                KeyEquals keyEquals = (KeyEquals) other;
                return Intrinsics.c(this.key, keyEquals.key) && Intrinsics.c(this.value, keyEquals.value);
            }

            @NotNull
            public final String getKey() {
                return this.key;
            }

            @NotNull
            public final Object getValue() {
                return this.value;
            }

            public int hashCode() {
                return this.value.hashCode() + (this.key.hashCode() * 31);
            }

            @NotNull
            public String toString() {
                StringBuilder sb = new StringBuilder("KeyEquals(key=");
                sb.append(this.key);
                sb.append(", value=");
                return lnb.p(sb, this.value, ')');
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@NotNull Parcel dest, int flags) {
                dest.getClass();
                dest.writeString(this.key);
                dest.writeValue(this.value);
            }
        }

        /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
        @Keep
        @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\n\u001a\u00020\u000bJ\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u000bHÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0017"}, d2 = {"Lcom/blaze/blazesdk/style/shared/models/BlazePlayerCustomActionButtonParams$VisibilityCondition$KeyExists;", "Lcom/blaze/blazesdk/style/shared/models/BlazePlayerCustomActionButtonParams$VisibilityCondition;", U3.i.W, "", "<init>", "(Ljava/lang/String;)V", "getKey", "()Ljava/lang/String;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "blazesdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class KeyExists extends VisibilityCondition {
            public static final int $stable = 0;

            @NotNull
            public static final Parcelable.Creator<KeyExists> CREATOR = new a();

            @NotNull
            private final String key;

            /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    parcel.getClass();
                    return new KeyExists(parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new KeyExists[i];
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public KeyExists(@NotNull String str) {
                super(null);
                str.getClass();
                this.key = str;
            }

            public static /* synthetic */ KeyExists copy$default(KeyExists keyExists, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = keyExists.key;
                }
                return keyExists.copy(str);
            }

            @NotNull
            /* renamed from: component1, reason: from getter */
            public final String getKey() {
                return this.key;
            }

            @NotNull
            public final KeyExists copy(@NotNull String key) {
                key.getClass();
                return new KeyExists(key);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(@Nullable Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof KeyExists) && Intrinsics.c(this.key, ((KeyExists) other).key);
            }

            @NotNull
            public final String getKey() {
                return this.key;
            }

            public int hashCode() {
                return this.key.hashCode();
            }

            @NotNull
            public String toString() {
                return lnb.q(new StringBuilder("KeyExists(key="), this.key, ')');
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@NotNull Parcel dest, int flags) {
                dest.getClass();
                dest.writeString(this.key);
            }
        }

        /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
        @Keep
        @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0006\u0010\u000f\u001a\u00020\u0010J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0010R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u001c"}, d2 = {"Lcom/blaze/blazesdk/style/shared/models/BlazePlayerCustomActionButtonParams$VisibilityCondition$KeyGreaterThan;", "Lcom/blaze/blazesdk/style/shared/models/BlazePlayerCustomActionButtonParams$VisibilityCondition;", U3.i.W, "", "threshold", "", "<init>", "(Ljava/lang/String;D)V", "getKey", "()Ljava/lang/String;", "getThreshold", "()D", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "blazesdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class KeyGreaterThan extends VisibilityCondition {
            public static final int $stable = 0;

            @NotNull
            public static final Parcelable.Creator<KeyGreaterThan> CREATOR = new a();

            @NotNull
            private final String key;
            private final double threshold;

            /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    parcel.getClass();
                    return new KeyGreaterThan(parcel.readString(), parcel.readDouble());
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new KeyGreaterThan[i];
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public KeyGreaterThan(@NotNull String str, double d) {
                super(null);
                str.getClass();
                this.key = str;
                this.threshold = d;
            }

            public static /* synthetic */ KeyGreaterThan copy$default(KeyGreaterThan keyGreaterThan, String str, double d, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = keyGreaterThan.key;
                }
                if ((i & 2) != 0) {
                    d = keyGreaterThan.threshold;
                }
                return keyGreaterThan.copy(str, d);
            }

            @NotNull
            /* renamed from: component1, reason: from getter */
            public final String getKey() {
                return this.key;
            }

            /* renamed from: component2, reason: from getter */
            public final double getThreshold() {
                return this.threshold;
            }

            @NotNull
            public final KeyGreaterThan copy(@NotNull String key, double threshold) {
                key.getClass();
                return new KeyGreaterThan(key, threshold);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(@Nullable Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof KeyGreaterThan)) {
                    return false;
                }
                KeyGreaterThan keyGreaterThan = (KeyGreaterThan) other;
                return Intrinsics.c(this.key, keyGreaterThan.key) && Double.compare(this.threshold, keyGreaterThan.threshold) == 0;
            }

            @NotNull
            public final String getKey() {
                return this.key;
            }

            public final double getThreshold() {
                return this.threshold;
            }

            public int hashCode() {
                return Double.hashCode(this.threshold) + (this.key.hashCode() * 31);
            }

            @NotNull
            public String toString() {
                return "KeyGreaterThan(key=" + this.key + ", threshold=" + this.threshold + ')';
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@NotNull Parcel dest, int flags) {
                dest.getClass();
                dest.writeString(this.key);
                dest.writeDouble(this.threshold);
            }
        }

        /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
        @Keep
        @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0010\u001a\u00020\u000b¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0016\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J*\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0013J\u0010\u0010\u0019\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u0019\u0010\u0011J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0005HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001f\u0010\u0013R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010 \u001a\u0004\b!\u0010\u0015¨\u0006\""}, d2 = {"Lcom/blaze/blazesdk/style/shared/models/BlazePlayerCustomActionButtonParams$VisibilityCondition$KeyIn;", "Lcom/blaze/blazesdk/style/shared/models/BlazePlayerCustomActionButtonParams$VisibilityCondition;", "", U3.i.W, "", "", "values", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "Landroid/os/Parcel;", "dest", "", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Ljava/lang/String;", "component2", "()Ljava/util/List;", "copy", "(Ljava/lang/String;Ljava/util/List;)Lcom/blaze/blazesdk/style/shared/models/BlazePlayerCustomActionButtonParams$VisibilityCondition$KeyIn;", "toString", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getKey", "Ljava/util/List;", "getValues", "blazesdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class KeyIn extends VisibilityCondition {
            public static final int $stable = 8;

            @NotNull
            public static final Parcelable.Creator<KeyIn> CREATOR = new a();

            @NotNull
            private final String key;

            @NotNull
            private final List<Object> values;

            /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    parcel.getClass();
                    String readString = parcel.readString();
                    int readInt = parcel.readInt();
                    ArrayList arrayList = new ArrayList(readInt);
                    for (int i = 0; i != readInt; i++) {
                        arrayList.add(parcel.readValue(KeyIn.class.getClassLoader()));
                    }
                    return new KeyIn(readString, arrayList);
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new KeyIn[i];
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public KeyIn(@NotNull String str, @NotNull List<? extends Object> list) {
                super(null);
                str.getClass();
                list.getClass();
                this.key = str;
                this.values = list;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ KeyIn copy$default(KeyIn keyIn, String str, List list, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = keyIn.key;
                }
                if ((i & 2) != 0) {
                    list = keyIn.values;
                }
                return keyIn.copy(str, list);
            }

            @NotNull
            /* renamed from: component1, reason: from getter */
            public final String getKey() {
                return this.key;
            }

            @NotNull
            public final List<Object> component2() {
                return this.values;
            }

            @NotNull
            public final KeyIn copy(@NotNull String key, @NotNull List<? extends Object> values) {
                key.getClass();
                values.getClass();
                return new KeyIn(key, values);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(@Nullable Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof KeyIn)) {
                    return false;
                }
                KeyIn keyIn = (KeyIn) other;
                return Intrinsics.c(this.key, keyIn.key) && Intrinsics.c(this.values, keyIn.values);
            }

            @NotNull
            public final String getKey() {
                return this.key;
            }

            @NotNull
            public final List<Object> getValues() {
                return this.values;
            }

            public int hashCode() {
                return this.values.hashCode() + (this.key.hashCode() * 31);
            }

            @NotNull
            public String toString() {
                StringBuilder sb = new StringBuilder("KeyIn(key=");
                sb.append(this.key);
                sb.append(", values=");
                return fc6.p(sb, this.values, ')');
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@NotNull Parcel dest, int flags) {
                dest.getClass();
                dest.writeString(this.key);
                List<Object> list = this.values;
                dest.writeInt(list.size());
                Iterator<Object> it = list.iterator();
                while (it.hasNext()) {
                    dest.writeValue(it.next());
                }
            }
        }

        /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
        @Keep
        @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0006\u0010\u000f\u001a\u00020\u0010J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0010R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u001c"}, d2 = {"Lcom/blaze/blazesdk/style/shared/models/BlazePlayerCustomActionButtonParams$VisibilityCondition$KeyLessThan;", "Lcom/blaze/blazesdk/style/shared/models/BlazePlayerCustomActionButtonParams$VisibilityCondition;", U3.i.W, "", "threshold", "", "<init>", "(Ljava/lang/String;D)V", "getKey", "()Ljava/lang/String;", "getThreshold", "()D", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "blazesdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class KeyLessThan extends VisibilityCondition {
            public static final int $stable = 0;

            @NotNull
            public static final Parcelable.Creator<KeyLessThan> CREATOR = new a();

            @NotNull
            private final String key;
            private final double threshold;

            /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    parcel.getClass();
                    return new KeyLessThan(parcel.readString(), parcel.readDouble());
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new KeyLessThan[i];
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public KeyLessThan(@NotNull String str, double d) {
                super(null);
                str.getClass();
                this.key = str;
                this.threshold = d;
            }

            public static /* synthetic */ KeyLessThan copy$default(KeyLessThan keyLessThan, String str, double d, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = keyLessThan.key;
                }
                if ((i & 2) != 0) {
                    d = keyLessThan.threshold;
                }
                return keyLessThan.copy(str, d);
            }

            @NotNull
            /* renamed from: component1, reason: from getter */
            public final String getKey() {
                return this.key;
            }

            /* renamed from: component2, reason: from getter */
            public final double getThreshold() {
                return this.threshold;
            }

            @NotNull
            public final KeyLessThan copy(@NotNull String key, double threshold) {
                key.getClass();
                return new KeyLessThan(key, threshold);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(@Nullable Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof KeyLessThan)) {
                    return false;
                }
                KeyLessThan keyLessThan = (KeyLessThan) other;
                return Intrinsics.c(this.key, keyLessThan.key) && Double.compare(this.threshold, keyLessThan.threshold) == 0;
            }

            @NotNull
            public final String getKey() {
                return this.key;
            }

            public final double getThreshold() {
                return this.threshold;
            }

            public int hashCode() {
                return Double.hashCode(this.threshold) + (this.key.hashCode() * 31);
            }

            @NotNull
            public String toString() {
                return "KeyLessThan(key=" + this.key + ", threshold=" + this.threshold + ')';
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@NotNull Parcel dest, int flags) {
                dest.getClass();
                dest.writeString(this.key);
                dest.writeDouble(this.threshold);
            }
        }

        /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
        @Keep
        @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\n¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J$\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0012J\u0010\u0010\u0018\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0010J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001d\u001a\u0004\b\u001e\u0010\u0012R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001f\u001a\u0004\b \u0010\u0014¨\u0006!"}, d2 = {"Lcom/blaze/blazesdk/style/shared/models/BlazePlayerCustomActionButtonParams$VisibilityCondition$KeyNotEquals;", "Lcom/blaze/blazesdk/style/shared/models/BlazePlayerCustomActionButtonParams$VisibilityCondition;", "", U3.i.W, "", U3.i.X, "<init>", "(Ljava/lang/String;Ljava/lang/Object;)V", "Landroid/os/Parcel;", "dest", "", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Ljava/lang/String;", "component2", "()Ljava/lang/Object;", "copy", "(Ljava/lang/String;Ljava/lang/Object;)Lcom/blaze/blazesdk/style/shared/models/BlazePlayerCustomActionButtonParams$VisibilityCondition$KeyNotEquals;", "toString", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getKey", "Ljava/lang/Object;", "getValue", "blazesdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class KeyNotEquals extends VisibilityCondition {
            public static final int $stable = 8;

            @NotNull
            public static final Parcelable.Creator<KeyNotEquals> CREATOR = new a();

            @NotNull
            private final String key;

            @NotNull
            private final Object value;

            /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    parcel.getClass();
                    return new KeyNotEquals(parcel.readString(), parcel.readValue(KeyNotEquals.class.getClassLoader()));
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new KeyNotEquals[i];
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public KeyNotEquals(@NotNull String str, @NotNull Object obj) {
                super(null);
                str.getClass();
                obj.getClass();
                this.key = str;
                this.value = obj;
            }

            public static /* synthetic */ KeyNotEquals copy$default(KeyNotEquals keyNotEquals, String str, Object obj, int i, Object obj2) {
                if ((i & 1) != 0) {
                    str = keyNotEquals.key;
                }
                if ((i & 2) != 0) {
                    obj = keyNotEquals.value;
                }
                return keyNotEquals.copy(str, obj);
            }

            @NotNull
            /* renamed from: component1, reason: from getter */
            public final String getKey() {
                return this.key;
            }

            @NotNull
            /* renamed from: component2, reason: from getter */
            public final Object getValue() {
                return this.value;
            }

            @NotNull
            public final KeyNotEquals copy(@NotNull String key, @NotNull Object value) {
                key.getClass();
                value.getClass();
                return new KeyNotEquals(key, value);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(@Nullable Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof KeyNotEquals)) {
                    return false;
                }
                KeyNotEquals keyNotEquals = (KeyNotEquals) other;
                return Intrinsics.c(this.key, keyNotEquals.key) && Intrinsics.c(this.value, keyNotEquals.value);
            }

            @NotNull
            public final String getKey() {
                return this.key;
            }

            @NotNull
            public final Object getValue() {
                return this.value;
            }

            public int hashCode() {
                return this.value.hashCode() + (this.key.hashCode() * 31);
            }

            @NotNull
            public String toString() {
                StringBuilder sb = new StringBuilder("KeyNotEquals(key=");
                sb.append(this.key);
                sb.append(", value=");
                return lnb.p(sb, this.value, ')');
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@NotNull Parcel dest, int flags) {
                dest.getClass();
                dest.writeString(this.key);
                dest.writeValue(this.value);
            }
        }

        /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
        @Keep
        @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\n\u001a\u00020\u000bJ\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u000bHÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0017"}, d2 = {"Lcom/blaze/blazesdk/style/shared/models/BlazePlayerCustomActionButtonParams$VisibilityCondition$KeyNotExists;", "Lcom/blaze/blazesdk/style/shared/models/BlazePlayerCustomActionButtonParams$VisibilityCondition;", U3.i.W, "", "<init>", "(Ljava/lang/String;)V", "getKey", "()Ljava/lang/String;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "blazesdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class KeyNotExists extends VisibilityCondition {
            public static final int $stable = 0;

            @NotNull
            public static final Parcelable.Creator<KeyNotExists> CREATOR = new a();

            @NotNull
            private final String key;

            /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    parcel.getClass();
                    return new KeyNotExists(parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new KeyNotExists[i];
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public KeyNotExists(@NotNull String str) {
                super(null);
                str.getClass();
                this.key = str;
            }

            public static /* synthetic */ KeyNotExists copy$default(KeyNotExists keyNotExists, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = keyNotExists.key;
                }
                return keyNotExists.copy(str);
            }

            @NotNull
            /* renamed from: component1, reason: from getter */
            public final String getKey() {
                return this.key;
            }

            @NotNull
            public final KeyNotExists copy(@NotNull String key) {
                key.getClass();
                return new KeyNotExists(key);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(@Nullable Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof KeyNotExists) && Intrinsics.c(this.key, ((KeyNotExists) other).key);
            }

            @NotNull
            public final String getKey() {
                return this.key;
            }

            public int hashCode() {
                return this.key.hashCode();
            }

            @NotNull
            public String toString() {
                return lnb.q(new StringBuilder("KeyNotExists(key="), this.key, ')');
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@NotNull Parcel dest, int flags) {
                dest.getClass();
                dest.writeString(this.key);
            }
        }

        /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
        @Keep
        @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0010\u001a\u00020\u000b¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0016\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J*\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0013J\u0010\u0010\u0019\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u0019\u0010\u0011J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0005HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001f\u0010\u0013R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010 \u001a\u0004\b!\u0010\u0015¨\u0006\""}, d2 = {"Lcom/blaze/blazesdk/style/shared/models/BlazePlayerCustomActionButtonParams$VisibilityCondition$KeyNotIn;", "Lcom/blaze/blazesdk/style/shared/models/BlazePlayerCustomActionButtonParams$VisibilityCondition;", "", U3.i.W, "", "", "values", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "Landroid/os/Parcel;", "dest", "", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Ljava/lang/String;", "component2", "()Ljava/util/List;", "copy", "(Ljava/lang/String;Ljava/util/List;)Lcom/blaze/blazesdk/style/shared/models/BlazePlayerCustomActionButtonParams$VisibilityCondition$KeyNotIn;", "toString", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getKey", "Ljava/util/List;", "getValues", "blazesdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class KeyNotIn extends VisibilityCondition {
            public static final int $stable = 8;

            @NotNull
            public static final Parcelable.Creator<KeyNotIn> CREATOR = new a();

            @NotNull
            private final String key;

            @NotNull
            private final List<Object> values;

            /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    parcel.getClass();
                    String readString = parcel.readString();
                    int readInt = parcel.readInt();
                    ArrayList arrayList = new ArrayList(readInt);
                    for (int i = 0; i != readInt; i++) {
                        arrayList.add(parcel.readValue(KeyNotIn.class.getClassLoader()));
                    }
                    return new KeyNotIn(readString, arrayList);
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new KeyNotIn[i];
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public KeyNotIn(@NotNull String str, @NotNull List<? extends Object> list) {
                super(null);
                str.getClass();
                list.getClass();
                this.key = str;
                this.values = list;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ KeyNotIn copy$default(KeyNotIn keyNotIn, String str, List list, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = keyNotIn.key;
                }
                if ((i & 2) != 0) {
                    list = keyNotIn.values;
                }
                return keyNotIn.copy(str, list);
            }

            @NotNull
            /* renamed from: component1, reason: from getter */
            public final String getKey() {
                return this.key;
            }

            @NotNull
            public final List<Object> component2() {
                return this.values;
            }

            @NotNull
            public final KeyNotIn copy(@NotNull String key, @NotNull List<? extends Object> values) {
                key.getClass();
                values.getClass();
                return new KeyNotIn(key, values);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(@Nullable Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof KeyNotIn)) {
                    return false;
                }
                KeyNotIn keyNotIn = (KeyNotIn) other;
                return Intrinsics.c(this.key, keyNotIn.key) && Intrinsics.c(this.values, keyNotIn.values);
            }

            @NotNull
            public final String getKey() {
                return this.key;
            }

            @NotNull
            public final List<Object> getValues() {
                return this.values;
            }

            public int hashCode() {
                return this.values.hashCode() + (this.key.hashCode() * 31);
            }

            @NotNull
            public String toString() {
                StringBuilder sb = new StringBuilder("KeyNotIn(key=");
                sb.append(this.key);
                sb.append(", values=");
                return fc6.p(sb, this.values, ')');
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@NotNull Parcel dest, int flags) {
                dest.getClass();
                dest.writeString(this.key);
                List<Object> list = this.values;
                dest.writeInt(list.size());
                Iterator<Object> it = list.iterator();
                while (it.hasNext()) {
                    dest.writeValue(it.next());
                }
            }
        }

        /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
        @Keep
        @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005J\u0016\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0005¨\u0006\u000b"}, d2 = {"Lcom/blaze/blazesdk/style/shared/models/BlazePlayerCustomActionButtonParams$VisibilityCondition$Never;", "Lcom/blaze/blazesdk/style/shared/models/BlazePlayerCustomActionButtonParams$VisibilityCondition;", "<init>", "()V", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "blazesdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Never extends VisibilityCondition {
            public static final int $stable = 0;

            @NotNull
            public static final Never INSTANCE = new Never();

            @NotNull
            public static final Parcelable.Creator<Never> CREATOR = new a();

            /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    parcel.getClass();
                    parcel.readInt();
                    return Never.INSTANCE;
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new Never[i];
                }
            }

            private Never() {
                super(null);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@NotNull Parcel dest, int flags) {
                dest.getClass();
                dest.writeInt(1);
            }
        }

        /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
        @Keep
        @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0001HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0001HÆ\u0001J\u0006\u0010\t\u001a\u00020\nJ\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eHÖ\u0003J\t\u0010\u000f\u001a\u00020\nHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\u0016\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\nR\u0011\u0010\u0002\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0017"}, d2 = {"Lcom/blaze/blazesdk/style/shared/models/BlazePlayerCustomActionButtonParams$VisibilityCondition$Not;", "Lcom/blaze/blazesdk/style/shared/models/BlazePlayerCustomActionButtonParams$VisibilityCondition;", "condition", "<init>", "(Lcom/blaze/blazesdk/style/shared/models/BlazePlayerCustomActionButtonParams$VisibilityCondition;)V", "getCondition", "()Lcom/blaze/blazesdk/style/shared/models/BlazePlayerCustomActionButtonParams$VisibilityCondition;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "blazesdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Not extends VisibilityCondition {
            public static final int $stable = 0;

            @NotNull
            public static final Parcelable.Creator<Not> CREATOR = new a();

            @NotNull
            private final VisibilityCondition condition;

            /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    parcel.getClass();
                    return new Not((VisibilityCondition) parcel.readParcelable(Not.class.getClassLoader()));
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new Not[i];
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Not(@NotNull VisibilityCondition visibilityCondition) {
                super(null);
                visibilityCondition.getClass();
                this.condition = visibilityCondition;
            }

            public static /* synthetic */ Not copy$default(Not not, VisibilityCondition visibilityCondition, int i, Object obj) {
                if ((i & 1) != 0) {
                    visibilityCondition = not.condition;
                }
                return not.copy(visibilityCondition);
            }

            @NotNull
            /* renamed from: component1, reason: from getter */
            public final VisibilityCondition getCondition() {
                return this.condition;
            }

            @NotNull
            public final Not copy(@NotNull VisibilityCondition condition) {
                condition.getClass();
                return new Not(condition);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(@Nullable Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Not) && Intrinsics.c(this.condition, ((Not) other).condition);
            }

            @NotNull
            public final VisibilityCondition getCondition() {
                return this.condition;
            }

            public int hashCode() {
                return this.condition.hashCode();
            }

            @NotNull
            public String toString() {
                return "Not(condition=" + this.condition + ')';
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@NotNull Parcel dest, int flags) {
                dest.getClass();
                dest.writeParcelable(this.condition, flags);
            }
        }

        /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
        @Keep
        @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00010\u0003HÆ\u0003J\u0019\u0010\t\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0003HÆ\u0001J\u0006\u0010\n\u001a\u00020\u000bJ\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u000bHÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\u0016\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u000bR\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0018"}, d2 = {"Lcom/blaze/blazesdk/style/shared/models/BlazePlayerCustomActionButtonParams$VisibilityCondition$Or;", "Lcom/blaze/blazesdk/style/shared/models/BlazePlayerCustomActionButtonParams$VisibilityCondition;", "conditions", "", "<init>", "(Ljava/util/List;)V", "getConditions", "()Ljava/util/List;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "blazesdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Or extends VisibilityCondition {
            public static final int $stable = 8;

            @NotNull
            public static final Parcelable.Creator<Or> CREATOR = new a();

            @NotNull
            private final List<VisibilityCondition> conditions;

            /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    parcel.getClass();
                    int readInt = parcel.readInt();
                    ArrayList arrayList = new ArrayList(readInt);
                    for (int i = 0; i != readInt; i++) {
                        arrayList.add(parcel.readParcelable(Or.class.getClassLoader()));
                    }
                    return new Or(arrayList);
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new Or[i];
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public Or(@NotNull List<? extends VisibilityCondition> list) {
                super(null);
                list.getClass();
                this.conditions = list;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ Or copy$default(Or or, List list, int i, Object obj) {
                if ((i & 1) != 0) {
                    list = or.conditions;
                }
                return or.copy(list);
            }

            @NotNull
            public final List<VisibilityCondition> component1() {
                return this.conditions;
            }

            @NotNull
            public final Or copy(@NotNull List<? extends VisibilityCondition> conditions) {
                conditions.getClass();
                return new Or(conditions);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(@Nullable Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Or) && Intrinsics.c(this.conditions, ((Or) other).conditions);
            }

            @NotNull
            public final List<VisibilityCondition> getConditions() {
                return this.conditions;
            }

            public int hashCode() {
                return this.conditions.hashCode();
            }

            @NotNull
            public String toString() {
                return fc6.p(new StringBuilder("Or(conditions="), this.conditions, ')');
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@NotNull Parcel dest, int flags) {
                dest.getClass();
                List<VisibilityCondition> list = this.conditions;
                dest.writeInt(list.size());
                Iterator<VisibilityCondition> it = list.iterator();
                while (it.hasNext()) {
                    dest.writeParcelable(it.next(), flags);
                }
            }
        }

        public /* synthetic */ VisibilityCondition(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private VisibilityCondition() {
        }
    }

    public /* synthetic */ BlazePlayerCustomActionButtonParams(String str, String str2, Map map, VisibilityCondition visibilityCondition, Map map2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, map, (i & 8) != 0 ? null : visibilityCondition, (i & 16) != 0 ? new LinkedHashMap() : map2);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @Keep
    public BlazePlayerCustomActionButtonParams(@NotNull String str, @NotNull String str2, @NotNull Map<String, ? extends Object> map) {
        this(str, str2, map, null, new LinkedHashMap());
        str.getClass();
        str2.getClass();
        map.getClass();
    }
}
