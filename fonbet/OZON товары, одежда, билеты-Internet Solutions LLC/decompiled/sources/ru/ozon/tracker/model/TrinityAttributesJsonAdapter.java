package ru.ozon.tracker.model;

import Ak.b;
import Y9.c;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.n;
import com.squareup.moshi.x;
import java.lang.reflect.Constructor;
import kotlin.Metadata;
import kotlin.collections.M;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.tracker.sendEvent.Namespace;

@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0019R\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0019R\u001c\u0010\u001d\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0019R\u001a\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u0019R\u001e\u0010!\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\"¨\u0006#"}, d2 = {"Lru/ozon/tracker/model/TrinityAttributesJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/tracker/model/TrinityAttributes;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/tracker/model/TrinityAttributes;", "Lcom/squareup/moshi/x;", "writer", "value_", "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/tracker/model/TrinityAttributes;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "Lru/ozon/tracker/sendEvent/Namespace;", "namespaceAdapter", "Lcom/squareup/moshi/JsonAdapter;", "stringAdapter", "", "intAdapter", "nullableStringAdapter", "", "floatAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "tracker-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class TrinityAttributesJsonAdapter extends JsonAdapter<TrinityAttributes> {
    private volatile Constructor<TrinityAttributes> constructorRef;

    @NotNull
    private final JsonAdapter<Float> floatAdapter;

    @NotNull
    private final JsonAdapter<Integer> intAdapter;

    @NotNull
    private final JsonAdapter<Namespace> namespaceAdapter;

    @NotNull
    private final JsonAdapter<String> nullableStringAdapter;

    @NotNull
    private final n.a options;

    @NotNull
    private final JsonAdapter<String> stringAdapter;

    public TrinityAttributesJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        n.a a11 = n.a.C0918a.a("namespace", "appVersion", "screenResolutionX", "screenResolutionY", "domainName", "buildNumber", "platformStore", "appsflyerId", "installId", "advertisingId", "osVersion", "deviceModel", "firebaseInstallId", "deviceType", "theme", "screenDensity", "userAgent");
        Intrinsics.checkNotNullExpressionValue(a11, "of(...)");
        this.options = a11;
        M m11 = M.f71699a;
        JsonAdapter<Namespace> f7 = moshi.f(Namespace.class, m11, "namespace");
        Intrinsics.checkNotNullExpressionValue(f7, "adapter(...)");
        this.namespaceAdapter = f7;
        JsonAdapter<String> f11 = moshi.f(String.class, m11, "appVersion");
        Intrinsics.checkNotNullExpressionValue(f11, "adapter(...)");
        this.stringAdapter = f11;
        JsonAdapter<Integer> f12 = moshi.f(Integer.TYPE, m11, "screenResolutionX");
        Intrinsics.checkNotNullExpressionValue(f12, "adapter(...)");
        this.intAdapter = f12;
        JsonAdapter<String> f13 = moshi.f(String.class, m11, "firebaseInstallId");
        Intrinsics.checkNotNullExpressionValue(f13, "adapter(...)");
        this.nullableStringAdapter = f13;
        JsonAdapter<Float> f14 = moshi.f(Float.TYPE, m11, "screenDensity");
        Intrinsics.checkNotNullExpressionValue(f14, "adapter(...)");
        this.floatAdapter = f14;
    }

    @NotNull
    public String toString() {
        return b.c(39, "GeneratedJsonAdapter(TrinityAttributes)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public TrinityAttributes fromJson(@NotNull n reader) {
        String str;
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        Float f7 = null;
        Namespace namespace = null;
        String str2 = null;
        Integer num = null;
        Integer num2 = null;
        String str3 = null;
        Integer num3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        String str8 = null;
        String str9 = null;
        String str10 = null;
        String str11 = null;
        String str12 = null;
        int i11 = -1;
        String str13 = null;
        while (true) {
            Float f11 = f7;
            Namespace namespace2 = namespace;
            String str14 = str2;
            Integer num4 = num;
            Integer num5 = num2;
            Integer num6 = num3;
            String str15 = str4;
            String str16 = str5;
            String str17 = str6;
            String str18 = str7;
            String str19 = str8;
            String str20 = str13;
            String str21 = str3;
            if (!reader.hasNext()) {
                int i12 = i11;
                reader.endObject();
                if (i12 == -65553) {
                    if (namespace2 == null) {
                        throw c.j("namespace", "namespace", reader);
                    }
                    if (str14 == null) {
                        throw c.j("appVersion", "appVersion", reader);
                    }
                    if (num4 == null) {
                        throw c.j("screenResolutionX", "screenResolutionX", reader);
                    }
                    int intValue = num4.intValue();
                    if (num5 == null) {
                        throw c.j("screenResolutionY", "screenResolutionY", reader);
                    }
                    int intValue2 = num5.intValue();
                    Intrinsics.g(str21, "null cannot be cast to non-null type kotlin.String");
                    if (num6 == null) {
                        throw c.j("buildNumber", "buildNumber", reader);
                    }
                    int intValue3 = num6.intValue();
                    if (str15 == null) {
                        throw c.j("platformStore", "platformStore", reader);
                    }
                    if (str16 == null) {
                        throw c.j("appsflyerId", "appsflyerId", reader);
                    }
                    if (str17 == null) {
                        throw c.j("installId", "installId", reader);
                    }
                    if (str18 == null) {
                        throw c.j("advertisingId", "advertisingId", reader);
                    }
                    if (str19 == null) {
                        throw c.j("osVersion", "osVersion", reader);
                    }
                    if (str9 == null) {
                        throw c.j("deviceModel", "deviceModel", reader);
                    }
                    if (str11 == null) {
                        throw c.j("deviceType", "deviceType", reader);
                    }
                    if (f11 == null) {
                        throw c.j("screenDensity", "screenDensity", reader);
                    }
                    float floatValue = f11.floatValue();
                    Intrinsics.g(str20, "null cannot be cast to non-null type kotlin.String");
                    return new TrinityAttributes(namespace2, str14, intValue, intValue2, str21, intValue3, str15, str16, str17, str18, str19, str9, str10, str11, str12, floatValue, str20);
                }
                Constructor<TrinityAttributes> constructor = this.constructorRef;
                if (constructor == null) {
                    Class<?> cls = c.f34864d;
                    Class cls2 = Float.TYPE;
                    Class cls3 = Integer.TYPE;
                    str = "namespace";
                    constructor = TrinityAttributes.class.getDeclaredConstructor(Namespace.class, String.class, cls3, cls3, String.class, cls3, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, cls2, String.class, cls3, cls);
                    this.constructorRef = constructor;
                    Intrinsics.checkNotNullExpressionValue(constructor, "also(...)");
                } else {
                    str = "namespace";
                }
                Constructor<TrinityAttributes> constructor2 = constructor;
                if (namespace2 == null) {
                    String str22 = str;
                    throw c.j(str22, str22, reader);
                }
                if (str14 == null) {
                    throw c.j("appVersion", "appVersion", reader);
                }
                if (num4 == null) {
                    throw c.j("screenResolutionX", "screenResolutionX", reader);
                }
                if (num5 == null) {
                    throw c.j("screenResolutionY", "screenResolutionY", reader);
                }
                if (num6 == null) {
                    throw c.j("buildNumber", "buildNumber", reader);
                }
                if (str15 == null) {
                    throw c.j("platformStore", "platformStore", reader);
                }
                if (str16 == null) {
                    throw c.j("appsflyerId", "appsflyerId", reader);
                }
                if (str17 == null) {
                    throw c.j("installId", "installId", reader);
                }
                if (str18 == null) {
                    throw c.j("advertisingId", "advertisingId", reader);
                }
                if (str19 == null) {
                    throw c.j("osVersion", "osVersion", reader);
                }
                if (str9 == null) {
                    throw c.j("deviceModel", "deviceModel", reader);
                }
                if (str11 == null) {
                    throw c.j("deviceType", "deviceType", reader);
                }
                if (f11 == null) {
                    throw c.j("screenDensity", "screenDensity", reader);
                }
                TrinityAttributes newInstance = constructor2.newInstance(namespace2, str14, num4, num5, str21, num6, str15, str16, str17, str18, str19, str9, str10, str11, str12, f11, str20, Integer.valueOf(i12), null);
                Intrinsics.checkNotNullExpressionValue(newInstance, "newInstance(...)");
                return newInstance;
            }
            int i13 = i11;
            switch (reader.v(this.options)) {
                case -1:
                    reader.y();
                    reader.skipValue();
                    i11 = i13;
                    f7 = f11;
                    namespace = namespace2;
                    str2 = str14;
                    num = num4;
                    num2 = num5;
                    num3 = num6;
                    str4 = str15;
                    str5 = str16;
                    str6 = str17;
                    str7 = str18;
                    str8 = str19;
                    str13 = str20;
                    str3 = str21;
                case 0:
                    namespace = this.namespaceAdapter.fromJson(reader);
                    if (namespace == null) {
                        throw c.q("namespace", "namespace", reader);
                    }
                    i11 = i13;
                    f7 = f11;
                    str2 = str14;
                    num = num4;
                    num2 = num5;
                    num3 = num6;
                    str4 = str15;
                    str5 = str16;
                    str6 = str17;
                    str7 = str18;
                    str8 = str19;
                    str13 = str20;
                    str3 = str21;
                case 1:
                    str2 = this.stringAdapter.fromJson(reader);
                    if (str2 == null) {
                        throw c.q("appVersion", "appVersion", reader);
                    }
                    i11 = i13;
                    f7 = f11;
                    namespace = namespace2;
                    num = num4;
                    num2 = num5;
                    num3 = num6;
                    str4 = str15;
                    str5 = str16;
                    str6 = str17;
                    str7 = str18;
                    str8 = str19;
                    str13 = str20;
                    str3 = str21;
                case 2:
                    num = this.intAdapter.fromJson(reader);
                    if (num == null) {
                        throw c.q("screenResolutionX", "screenResolutionX", reader);
                    }
                    i11 = i13;
                    f7 = f11;
                    namespace = namespace2;
                    str2 = str14;
                    num2 = num5;
                    num3 = num6;
                    str4 = str15;
                    str5 = str16;
                    str6 = str17;
                    str7 = str18;
                    str8 = str19;
                    str13 = str20;
                    str3 = str21;
                case 3:
                    num2 = this.intAdapter.fromJson(reader);
                    if (num2 == null) {
                        throw c.q("screenResolutionY", "screenResolutionY", reader);
                    }
                    i11 = i13;
                    f7 = f11;
                    namespace = namespace2;
                    str2 = str14;
                    num = num4;
                    num3 = num6;
                    str4 = str15;
                    str5 = str16;
                    str6 = str17;
                    str7 = str18;
                    str8 = str19;
                    str13 = str20;
                    str3 = str21;
                case 4:
                    str3 = this.stringAdapter.fromJson(reader);
                    if (str3 == null) {
                        throw c.q("domainName", "domainName", reader);
                    }
                    i11 = i13 & (-17);
                    f7 = f11;
                    namespace = namespace2;
                    str2 = str14;
                    num = num4;
                    num2 = num5;
                    num3 = num6;
                    str4 = str15;
                    str5 = str16;
                    str6 = str17;
                    str7 = str18;
                    str8 = str19;
                    str13 = str20;
                case 5:
                    num3 = this.intAdapter.fromJson(reader);
                    if (num3 == null) {
                        throw c.q("buildNumber", "buildNumber", reader);
                    }
                    i11 = i13;
                    f7 = f11;
                    namespace = namespace2;
                    str2 = str14;
                    num = num4;
                    num2 = num5;
                    str4 = str15;
                    str5 = str16;
                    str6 = str17;
                    str7 = str18;
                    str8 = str19;
                    str13 = str20;
                    str3 = str21;
                case 6:
                    str4 = this.stringAdapter.fromJson(reader);
                    if (str4 == null) {
                        throw c.q("platformStore", "platformStore", reader);
                    }
                    i11 = i13;
                    f7 = f11;
                    namespace = namespace2;
                    str2 = str14;
                    num = num4;
                    num2 = num5;
                    num3 = num6;
                    str5 = str16;
                    str6 = str17;
                    str7 = str18;
                    str8 = str19;
                    str13 = str20;
                    str3 = str21;
                case 7:
                    str5 = this.stringAdapter.fromJson(reader);
                    if (str5 == null) {
                        throw c.q("appsflyerId", "appsflyerId", reader);
                    }
                    i11 = i13;
                    f7 = f11;
                    namespace = namespace2;
                    str2 = str14;
                    num = num4;
                    num2 = num5;
                    num3 = num6;
                    str4 = str15;
                    str6 = str17;
                    str7 = str18;
                    str8 = str19;
                    str13 = str20;
                    str3 = str21;
                case 8:
                    str6 = this.stringAdapter.fromJson(reader);
                    if (str6 == null) {
                        throw c.q("installId", "installId", reader);
                    }
                    i11 = i13;
                    f7 = f11;
                    namespace = namespace2;
                    str2 = str14;
                    num = num4;
                    num2 = num5;
                    num3 = num6;
                    str4 = str15;
                    str5 = str16;
                    str7 = str18;
                    str8 = str19;
                    str13 = str20;
                    str3 = str21;
                case 9:
                    str7 = this.stringAdapter.fromJson(reader);
                    if (str7 == null) {
                        throw c.q("advertisingId", "advertisingId", reader);
                    }
                    i11 = i13;
                    f7 = f11;
                    namespace = namespace2;
                    str2 = str14;
                    num = num4;
                    num2 = num5;
                    num3 = num6;
                    str4 = str15;
                    str5 = str16;
                    str6 = str17;
                    str8 = str19;
                    str13 = str20;
                    str3 = str21;
                case 10:
                    str8 = this.stringAdapter.fromJson(reader);
                    if (str8 == null) {
                        throw c.q("osVersion", "osVersion", reader);
                    }
                    i11 = i13;
                    f7 = f11;
                    namespace = namespace2;
                    str2 = str14;
                    num = num4;
                    num2 = num5;
                    num3 = num6;
                    str4 = str15;
                    str5 = str16;
                    str6 = str17;
                    str7 = str18;
                    str13 = str20;
                    str3 = str21;
                case 11:
                    str9 = this.stringAdapter.fromJson(reader);
                    if (str9 == null) {
                        throw c.q("deviceModel", "deviceModel", reader);
                    }
                    i11 = i13;
                    f7 = f11;
                    namespace = namespace2;
                    str2 = str14;
                    num = num4;
                    num2 = num5;
                    num3 = num6;
                    str4 = str15;
                    str5 = str16;
                    str6 = str17;
                    str7 = str18;
                    str8 = str19;
                    str13 = str20;
                    str3 = str21;
                case 12:
                    str10 = this.nullableStringAdapter.fromJson(reader);
                    i11 = i13;
                    f7 = f11;
                    namespace = namespace2;
                    str2 = str14;
                    num = num4;
                    num2 = num5;
                    num3 = num6;
                    str4 = str15;
                    str5 = str16;
                    str6 = str17;
                    str7 = str18;
                    str8 = str19;
                    str13 = str20;
                    str3 = str21;
                case 13:
                    str11 = this.stringAdapter.fromJson(reader);
                    if (str11 == null) {
                        throw c.q("deviceType", "deviceType", reader);
                    }
                    i11 = i13;
                    f7 = f11;
                    namespace = namespace2;
                    str2 = str14;
                    num = num4;
                    num2 = num5;
                    num3 = num6;
                    str4 = str15;
                    str5 = str16;
                    str6 = str17;
                    str7 = str18;
                    str8 = str19;
                    str13 = str20;
                    str3 = str21;
                case 14:
                    str12 = this.nullableStringAdapter.fromJson(reader);
                    i11 = i13;
                    f7 = f11;
                    namespace = namespace2;
                    str2 = str14;
                    num = num4;
                    num2 = num5;
                    num3 = num6;
                    str4 = str15;
                    str5 = str16;
                    str6 = str17;
                    str7 = str18;
                    str8 = str19;
                    str13 = str20;
                    str3 = str21;
                case 15:
                    f7 = this.floatAdapter.fromJson(reader);
                    if (f7 == null) {
                        throw c.q("screenDensity", "screenDensity", reader);
                    }
                    i11 = i13;
                    namespace = namespace2;
                    str2 = str14;
                    num = num4;
                    num2 = num5;
                    num3 = num6;
                    str4 = str15;
                    str5 = str16;
                    str6 = str17;
                    str7 = str18;
                    str8 = str19;
                    str13 = str20;
                    str3 = str21;
                case 16:
                    str13 = this.stringAdapter.fromJson(reader);
                    if (str13 == null) {
                        throw c.q("userAgent", "userAgent", reader);
                    }
                    i11 = i13 & (-65537);
                    f7 = f11;
                    namespace = namespace2;
                    str2 = str14;
                    num = num4;
                    num2 = num5;
                    num3 = num6;
                    str4 = str15;
                    str5 = str16;
                    str6 = str17;
                    str7 = str18;
                    str8 = str19;
                    str3 = str21;
                default:
                    i11 = i13;
                    f7 = f11;
                    namespace = namespace2;
                    str2 = str14;
                    num = num4;
                    num2 = num5;
                    num3 = num6;
                    str4 = str15;
                    str5 = str16;
                    str6 = str17;
                    str7 = str18;
                    str8 = str19;
                    str13 = str20;
                    str3 = str21;
            }
        }
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, TrinityAttributes value_) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value_ == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("namespace");
        this.namespaceAdapter.mo44toJson(writer, (x) value_.getNamespace());
        writer.w("appVersion");
        this.stringAdapter.mo44toJson(writer, (x) value_.getAppVersion());
        writer.w("screenResolutionX");
        this.intAdapter.mo44toJson(writer, (x) Integer.valueOf(value_.getScreenResolutionX()));
        writer.w("screenResolutionY");
        this.intAdapter.mo44toJson(writer, (x) Integer.valueOf(value_.getScreenResolutionY()));
        writer.w("domainName");
        this.stringAdapter.mo44toJson(writer, (x) value_.getDomainName());
        writer.w("buildNumber");
        this.intAdapter.mo44toJson(writer, (x) Integer.valueOf(value_.getBuildNumber()));
        writer.w("platformStore");
        this.stringAdapter.mo44toJson(writer, (x) value_.getPlatformStore());
        writer.w("appsflyerId");
        this.stringAdapter.mo44toJson(writer, (x) value_.getAppsflyerId());
        writer.w("installId");
        this.stringAdapter.mo44toJson(writer, (x) value_.getInstallId());
        writer.w("advertisingId");
        this.stringAdapter.mo44toJson(writer, (x) value_.getAdvertisingId());
        writer.w("osVersion");
        this.stringAdapter.mo44toJson(writer, (x) value_.getOsVersion());
        writer.w("deviceModel");
        this.stringAdapter.mo44toJson(writer, (x) value_.getDeviceModel());
        writer.w("firebaseInstallId");
        this.nullableStringAdapter.mo44toJson(writer, (x) value_.getFirebaseInstallId());
        writer.w("deviceType");
        this.stringAdapter.mo44toJson(writer, (x) value_.getDeviceType());
        writer.w("theme");
        this.nullableStringAdapter.mo44toJson(writer, (x) value_.getTheme());
        writer.w("screenDensity");
        this.floatAdapter.mo44toJson(writer, (x) Float.valueOf(value_.getScreenDensity()));
        writer.w("userAgent");
        this.stringAdapter.mo44toJson(writer, (x) value_.getUserAgent());
        writer.p();
    }
}
