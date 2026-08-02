package ru.ozon.fintech.features.installedapps.models;

import Ak.b;
import Y9.c;
import com.squareup.moshi.D;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.n;
import com.squareup.moshi.x;
import java.lang.reflect.Constructor;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.M;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001c\u0010\u0019\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u0018R\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0018R\u001a\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0018R\"\u0010\u001f\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u001e0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u0018R\"\u0010!\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020 \u0018\u00010\u001e0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\u0018R\"\u0010#\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\"\u0018\u00010\u001e0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010\u0018R\u001e\u0010%\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010&¨\u0006'"}, d2 = {"Lru/ozon/fintech/features/installedapps/models/AppPackageJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/fintech/features/installedapps/models/AppPackage;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/fintech/features/installedapps/models/AppPackage;", "Lcom/squareup/moshi/x;", "writer", "value_", "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/fintech/features/installedapps/models/AppPackage;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "stringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "nullableStringAdapter", "", "longAdapter", "", "booleanAdapter", "", "nullableListOfStringAdapter", "Lru/ozon/fintech/features/installedapps/models/ServiceInfoCompact;", "nullableListOfServiceInfoCompactAdapter", "Lru/ozon/fintech/features/installedapps/models/ReceiverInfoCompact;", "nullableListOfReceiverInfoCompactAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "installed-apps_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class AppPackageJsonAdapter extends JsonAdapter<AppPackage> {

    @NotNull
    private final JsonAdapter<Boolean> booleanAdapter;
    private volatile Constructor<AppPackage> constructorRef;

    @NotNull
    private final JsonAdapter<Long> longAdapter;

    @NotNull
    private final JsonAdapter<List<ReceiverInfoCompact>> nullableListOfReceiverInfoCompactAdapter;

    @NotNull
    private final JsonAdapter<List<ServiceInfoCompact>> nullableListOfServiceInfoCompactAdapter;

    @NotNull
    private final JsonAdapter<List<String>> nullableListOfStringAdapter;

    @NotNull
    private final JsonAdapter<String> nullableStringAdapter;

    @NotNull
    private final n.a options;

    @NotNull
    private final JsonAdapter<String> stringAdapter;

    public AppPackageJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        n.a a11 = n.a.C0918a.a("appName", "packageName", "versionName", "versionCode", "installTime", "updateTime", "sideLoaded", "isSystemApp", "installerPackage", "permission", "declaredServices", "declaredReceivers");
        Intrinsics.checkNotNullExpressionValue(a11, "of(...)");
        this.options = a11;
        M m11 = M.f71699a;
        JsonAdapter<String> f7 = moshi.f(String.class, m11, "appName");
        Intrinsics.checkNotNullExpressionValue(f7, "adapter(...)");
        this.stringAdapter = f7;
        JsonAdapter<String> f11 = moshi.f(String.class, m11, "versionName");
        Intrinsics.checkNotNullExpressionValue(f11, "adapter(...)");
        this.nullableStringAdapter = f11;
        JsonAdapter<Long> f12 = moshi.f(Long.TYPE, m11, "installTime");
        Intrinsics.checkNotNullExpressionValue(f12, "adapter(...)");
        this.longAdapter = f12;
        JsonAdapter<Boolean> f13 = moshi.f(Boolean.TYPE, m11, "sideLoaded");
        Intrinsics.checkNotNullExpressionValue(f13, "adapter(...)");
        this.booleanAdapter = f13;
        JsonAdapter<List<String>> f14 = moshi.f(D.e(List.class, String.class), m11, "permission");
        Intrinsics.checkNotNullExpressionValue(f14, "adapter(...)");
        this.nullableListOfStringAdapter = f14;
        JsonAdapter<List<ServiceInfoCompact>> f15 = moshi.f(D.e(List.class, ServiceInfoCompact.class), m11, "declaredServices");
        Intrinsics.checkNotNullExpressionValue(f15, "adapter(...)");
        this.nullableListOfServiceInfoCompactAdapter = f15;
        JsonAdapter<List<ReceiverInfoCompact>> f16 = moshi.f(D.e(List.class, ReceiverInfoCompact.class), m11, "declaredReceivers");
        Intrinsics.checkNotNullExpressionValue(f16, "adapter(...)");
        this.nullableListOfReceiverInfoCompactAdapter = f16;
    }

    @NotNull
    public String toString() {
        return b.c(32, "GeneratedJsonAdapter(AppPackage)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public AppPackage fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        int i11 = -1;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        Long l11 = null;
        Long l12 = null;
        Boolean bool = null;
        Boolean bool2 = null;
        List<ServiceInfoCompact> list = null;
        String str5 = null;
        List<String> list2 = null;
        List<ReceiverInfoCompact> list3 = null;
        while (true) {
            String str6 = str;
            String str7 = str2;
            String str8 = str3;
            String str9 = str4;
            Long l13 = l11;
            if (!reader.hasNext()) {
                Long l14 = l12;
                reader.endObject();
                if (i11 == -3585) {
                    if (str6 == null) {
                        throw c.j("appName", "appName", reader);
                    }
                    if (str7 == null) {
                        throw c.j("packageName", "packageName", reader);
                    }
                    if (str9 == null) {
                        throw c.j("versionCode", "versionCode", reader);
                    }
                    if (l13 == null) {
                        throw c.j("installTime", "installTime", reader);
                    }
                    Boolean bool3 = bool;
                    long longValue = l13.longValue();
                    if (l14 == null) {
                        throw c.j("updateTime", "updateTime", reader);
                    }
                    Boolean bool4 = bool2;
                    long longValue2 = l14.longValue();
                    if (bool3 == null) {
                        throw c.j("sideLoaded", "sideLoaded", reader);
                    }
                    boolean booleanValue = bool3.booleanValue();
                    if (bool4 == null) {
                        throw c.j("isSystemApp", "isSystemApp", reader);
                    }
                    List<ServiceInfoCompact> list4 = list;
                    boolean booleanValue2 = bool4.booleanValue();
                    if (str5 != null) {
                        return new AppPackage(str6, str7, str8, str9, longValue, longValue2, booleanValue, booleanValue2, str5, list2, list4, list3);
                    }
                    throw c.j("installerPackage", "installerPackage", reader);
                }
                Boolean bool5 = bool;
                Boolean bool6 = bool2;
                Constructor<AppPackage> constructor = this.constructorRef;
                if (constructor == null) {
                    Class<?> cls = c.f34864d;
                    Class cls2 = Long.TYPE;
                    Class cls3 = Boolean.TYPE;
                    constructor = AppPackage.class.getDeclaredConstructor(String.class, String.class, String.class, String.class, cls2, cls2, cls3, cls3, String.class, List.class, List.class, List.class, Integer.TYPE, cls);
                    this.constructorRef = constructor;
                    Intrinsics.checkNotNullExpressionValue(constructor, "also(...)");
                }
                if (str6 == null) {
                    throw c.j("appName", "appName", reader);
                }
                if (str7 == null) {
                    throw c.j("packageName", "packageName", reader);
                }
                if (str9 == null) {
                    throw c.j("versionCode", "versionCode", reader);
                }
                if (l13 == null) {
                    throw c.j("installTime", "installTime", reader);
                }
                if (l14 == null) {
                    throw c.j("updateTime", "updateTime", reader);
                }
                if (bool5 == null) {
                    throw c.j("sideLoaded", "sideLoaded", reader);
                }
                if (bool6 == null) {
                    throw c.j("isSystemApp", "isSystemApp", reader);
                }
                if (str5 == null) {
                    throw c.j("installerPackage", "installerPackage", reader);
                }
                AppPackage newInstance = constructor.newInstance(str6, str7, str8, str9, l13, l14, bool5, bool6, str5, list2, list, list3, Integer.valueOf(i11), null);
                Intrinsics.checkNotNullExpressionValue(newInstance, "newInstance(...)");
                return newInstance;
            }
            Long l15 = l12;
            switch (reader.v(this.options)) {
                case -1:
                    reader.y();
                    reader.skipValue();
                    l12 = l15;
                    str = str6;
                    str2 = str7;
                    str3 = str8;
                    str4 = str9;
                    l11 = l13;
                case 0:
                    str = this.stringAdapter.fromJson(reader);
                    if (str == null) {
                        throw c.q("appName", "appName", reader);
                    }
                    l12 = l15;
                    str2 = str7;
                    str3 = str8;
                    str4 = str9;
                    l11 = l13;
                case 1:
                    str2 = this.stringAdapter.fromJson(reader);
                    if (str2 == null) {
                        throw c.q("packageName", "packageName", reader);
                    }
                    l12 = l15;
                    str = str6;
                    str3 = str8;
                    str4 = str9;
                    l11 = l13;
                case 2:
                    str3 = this.nullableStringAdapter.fromJson(reader);
                    l12 = l15;
                    str = str6;
                    str2 = str7;
                    str4 = str9;
                    l11 = l13;
                case 3:
                    str4 = this.stringAdapter.fromJson(reader);
                    if (str4 == null) {
                        throw c.q("versionCode", "versionCode", reader);
                    }
                    l12 = l15;
                    str = str6;
                    str2 = str7;
                    str3 = str8;
                    l11 = l13;
                case 4:
                    l11 = this.longAdapter.fromJson(reader);
                    if (l11 == null) {
                        throw c.q("installTime", "installTime", reader);
                    }
                    l12 = l15;
                    str = str6;
                    str2 = str7;
                    str3 = str8;
                    str4 = str9;
                case 5:
                    l12 = this.longAdapter.fromJson(reader);
                    if (l12 == null) {
                        throw c.q("updateTime", "updateTime", reader);
                    }
                    str = str6;
                    str2 = str7;
                    str3 = str8;
                    str4 = str9;
                    l11 = l13;
                case 6:
                    bool = this.booleanAdapter.fromJson(reader);
                    if (bool == null) {
                        throw c.q("sideLoaded", "sideLoaded", reader);
                    }
                    l12 = l15;
                    str = str6;
                    str2 = str7;
                    str3 = str8;
                    str4 = str9;
                    l11 = l13;
                case 7:
                    bool2 = this.booleanAdapter.fromJson(reader);
                    if (bool2 == null) {
                        throw c.q("isSystemApp", "isSystemApp", reader);
                    }
                    l12 = l15;
                    str = str6;
                    str2 = str7;
                    str3 = str8;
                    str4 = str9;
                    l11 = l13;
                case 8:
                    str5 = this.stringAdapter.fromJson(reader);
                    if (str5 == null) {
                        throw c.q("installerPackage", "installerPackage", reader);
                    }
                    l12 = l15;
                    str = str6;
                    str2 = str7;
                    str3 = str8;
                    str4 = str9;
                    l11 = l13;
                case 9:
                    list2 = this.nullableListOfStringAdapter.fromJson(reader);
                    i11 &= -513;
                    l12 = l15;
                    str = str6;
                    str2 = str7;
                    str3 = str8;
                    str4 = str9;
                    l11 = l13;
                case 10:
                    list = this.nullableListOfServiceInfoCompactAdapter.fromJson(reader);
                    i11 &= -1025;
                    l12 = l15;
                    str = str6;
                    str2 = str7;
                    str3 = str8;
                    str4 = str9;
                    l11 = l13;
                case 11:
                    list3 = this.nullableListOfReceiverInfoCompactAdapter.fromJson(reader);
                    i11 &= -2049;
                    l12 = l15;
                    str = str6;
                    str2 = str7;
                    str3 = str8;
                    str4 = str9;
                    l11 = l13;
                default:
                    l12 = l15;
                    str = str6;
                    str2 = str7;
                    str3 = str8;
                    str4 = str9;
                    l11 = l13;
            }
        }
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, AppPackage value_) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value_ == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("appName");
        this.stringAdapter.mo44toJson(writer, (x) value_.getAppName());
        writer.w("packageName");
        this.stringAdapter.mo44toJson(writer, (x) value_.getPackageName());
        writer.w("versionName");
        this.nullableStringAdapter.mo44toJson(writer, (x) value_.getVersionName());
        writer.w("versionCode");
        this.stringAdapter.mo44toJson(writer, (x) value_.getVersionCode());
        writer.w("installTime");
        this.longAdapter.mo44toJson(writer, (x) Long.valueOf(value_.getInstallTime()));
        writer.w("updateTime");
        this.longAdapter.mo44toJson(writer, (x) Long.valueOf(value_.getUpdateTime()));
        writer.w("sideLoaded");
        this.booleanAdapter.mo44toJson(writer, (x) Boolean.valueOf(value_.getSideLoaded()));
        writer.w("isSystemApp");
        this.booleanAdapter.mo44toJson(writer, (x) Boolean.valueOf(value_.isSystemApp()));
        writer.w("installerPackage");
        this.stringAdapter.mo44toJson(writer, (x) value_.getInstallerPackage());
        writer.w("permission");
        this.nullableListOfStringAdapter.mo44toJson(writer, (x) value_.getPermission());
        writer.w("declaredServices");
        this.nullableListOfServiceInfoCompactAdapter.mo44toJson(writer, (x) value_.getDeclaredServices());
        writer.w("declaredReceivers");
        this.nullableListOfReceiverInfoCompactAdapter.mo44toJson(writer, (x) value_.getDeclaredReceivers());
        writer.p();
    }
}
