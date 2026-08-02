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
import ru.ozon.tracker.model.EventEntity;
import ru.ozon.tracker.sendEvent.Namespace;

@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0019R\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0019R\u001c\u0010\u001d\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0019R\u001c\u0010\u001f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001e0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u0019R\u001e\u0010!\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\"¨\u0006#"}, d2 = {"Lru/ozon/tracker/model/EventEntity_AttributesJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/tracker/model/EventEntity$Attributes;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/tracker/model/EventEntity$Attributes;", "Lcom/squareup/moshi/x;", "writer", "value_", "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/tracker/model/EventEntity$Attributes;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "Lru/ozon/tracker/sendEvent/Namespace;", "namespaceAdapter", "Lcom/squareup/moshi/JsonAdapter;", "stringAdapter", "", "intAdapter", "nullableStringAdapter", "", "nullableFloatAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "tracker-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class EventEntity_AttributesJsonAdapter extends JsonAdapter<EventEntity.Attributes> {
    private volatile Constructor<EventEntity.Attributes> constructorRef;

    @NotNull
    private final JsonAdapter<Integer> intAdapter;

    @NotNull
    private final JsonAdapter<Namespace> namespaceAdapter;

    @NotNull
    private final JsonAdapter<Float> nullableFloatAdapter;

    @NotNull
    private final JsonAdapter<String> nullableStringAdapter;

    @NotNull
    private final n.a options;

    @NotNull
    private final JsonAdapter<String> stringAdapter;

    public EventEntity_AttributesJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        n.a a11 = n.a.C0918a.a("namespace", "appVersion", "buildNumber", "screenResolutionX", "screenResolutionY", "domainName", "platform", "deviceType", "osVersion", "deviceModel", "mobileDeviceModel", "platformStore", "theme", "screenDensity", "userAgent");
        Intrinsics.checkNotNullExpressionValue(a11, "of(...)");
        this.options = a11;
        M m11 = M.f71699a;
        JsonAdapter<Namespace> f7 = moshi.f(Namespace.class, m11, "namespace");
        Intrinsics.checkNotNullExpressionValue(f7, "adapter(...)");
        this.namespaceAdapter = f7;
        JsonAdapter<String> f11 = moshi.f(String.class, m11, "appVersion");
        Intrinsics.checkNotNullExpressionValue(f11, "adapter(...)");
        this.stringAdapter = f11;
        JsonAdapter<Integer> f12 = moshi.f(Integer.TYPE, m11, "buildNumber");
        Intrinsics.checkNotNullExpressionValue(f12, "adapter(...)");
        this.intAdapter = f12;
        JsonAdapter<String> f13 = moshi.f(String.class, m11, "platformStore");
        Intrinsics.checkNotNullExpressionValue(f13, "adapter(...)");
        this.nullableStringAdapter = f13;
        JsonAdapter<Float> f14 = moshi.f(Float.class, m11, "screenDensity");
        Intrinsics.checkNotNullExpressionValue(f14, "adapter(...)");
        this.nullableFloatAdapter = f14;
    }

    @NotNull
    public String toString() {
        return b.c(44, "GeneratedJsonAdapter(EventEntity.Attributes)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public EventEntity.Attributes fromJson(@NotNull n reader) {
        Namespace namespace;
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        int i11 = -1;
        Namespace namespace2 = null;
        String str = null;
        Integer num = null;
        Integer num2 = null;
        Integer num3 = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        String str8 = null;
        String str9 = null;
        Float f7 = null;
        String str10 = null;
        while (true) {
            Namespace namespace3 = namespace2;
            String str11 = str;
            Integer num4 = num;
            Integer num5 = num2;
            Integer num6 = num3;
            String str12 = str4;
            String str13 = str5;
            if (!reader.hasNext()) {
                String str14 = str6;
                reader.endObject();
                if (i11 == -30817) {
                    if (namespace3 == null) {
                        throw c.j("namespace", "namespace", reader);
                    }
                    if (str11 == null) {
                        throw c.j("appVersion", "appVersion", reader);
                    }
                    if (num4 == null) {
                        throw c.j("buildNumber", "buildNumber", reader);
                    }
                    int intValue = num4.intValue();
                    if (num5 == null) {
                        throw c.j("screenResolutionX", "screenResolutionX", reader);
                    }
                    int intValue2 = num5.intValue();
                    if (num6 == null) {
                        throw c.j("screenResolutionY", "screenResolutionY", reader);
                    }
                    int intValue3 = num6.intValue();
                    Intrinsics.g(str2, "null cannot be cast to non-null type kotlin.String");
                    Intrinsics.g(str3, "null cannot be cast to non-null type kotlin.String");
                    if (str12 == null) {
                        throw c.j("deviceType", "deviceType", reader);
                    }
                    if (str13 == null) {
                        throw c.j("osVersion", "osVersion", reader);
                    }
                    if (str14 == null) {
                        throw c.j("deviceModel", "deviceModel", reader);
                    }
                    if (str7 == null) {
                        throw c.j("mobileDeviceModel", "mobileDeviceModel", reader);
                    }
                    return new EventEntity.Attributes(namespace3, str11, intValue, intValue2, intValue3, str2, str3, str12, str13, str14, str7, str8, str9, f7, str10);
                }
                int i12 = i11;
                Constructor<EventEntity.Attributes> constructor = this.constructorRef;
                if (constructor == null) {
                    Class<?> cls = c.f34864d;
                    Class cls2 = Integer.TYPE;
                    namespace = namespace3;
                    constructor = EventEntity.Attributes.class.getDeclaredConstructor(Namespace.class, String.class, cls2, cls2, cls2, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, Float.class, String.class, cls2, cls);
                    this.constructorRef = constructor;
                    Intrinsics.checkNotNullExpressionValue(constructor, "also(...)");
                } else {
                    namespace = namespace3;
                }
                if (namespace == null) {
                    throw c.j("namespace", "namespace", reader);
                }
                if (str11 == null) {
                    throw c.j("appVersion", "appVersion", reader);
                }
                if (num4 == null) {
                    throw c.j("buildNumber", "buildNumber", reader);
                }
                if (num5 == null) {
                    throw c.j("screenResolutionX", "screenResolutionX", reader);
                }
                if (num6 == null) {
                    throw c.j("screenResolutionY", "screenResolutionY", reader);
                }
                if (str12 == null) {
                    throw c.j("deviceType", "deviceType", reader);
                }
                if (str13 == null) {
                    throw c.j("osVersion", "osVersion", reader);
                }
                if (str14 == null) {
                    throw c.j("deviceModel", "deviceModel", reader);
                }
                if (str7 == null) {
                    throw c.j("mobileDeviceModel", "mobileDeviceModel", reader);
                }
                EventEntity.Attributes newInstance = constructor.newInstance(namespace, str11, num4, num5, num6, str2, str3, str12, str13, str14, str7, str8, str9, f7, str10, Integer.valueOf(i12), null);
                Intrinsics.checkNotNullExpressionValue(newInstance, "newInstance(...)");
                return newInstance;
            }
            String str15 = str6;
            switch (reader.v(this.options)) {
                case -1:
                    reader.y();
                    reader.skipValue();
                    str6 = str15;
                    namespace2 = namespace3;
                    str = str11;
                    num = num4;
                    num2 = num5;
                    num3 = num6;
                    str4 = str12;
                    str5 = str13;
                case 0:
                    namespace2 = this.namespaceAdapter.fromJson(reader);
                    if (namespace2 == null) {
                        throw c.q("namespace", "namespace", reader);
                    }
                    str6 = str15;
                    str = str11;
                    num = num4;
                    num2 = num5;
                    num3 = num6;
                    str4 = str12;
                    str5 = str13;
                case 1:
                    str = this.stringAdapter.fromJson(reader);
                    if (str == null) {
                        throw c.q("appVersion", "appVersion", reader);
                    }
                    str6 = str15;
                    namespace2 = namespace3;
                    num = num4;
                    num2 = num5;
                    num3 = num6;
                    str4 = str12;
                    str5 = str13;
                case 2:
                    num = this.intAdapter.fromJson(reader);
                    if (num == null) {
                        throw c.q("buildNumber", "buildNumber", reader);
                    }
                    str6 = str15;
                    namespace2 = namespace3;
                    str = str11;
                    num2 = num5;
                    num3 = num6;
                    str4 = str12;
                    str5 = str13;
                case 3:
                    num2 = this.intAdapter.fromJson(reader);
                    if (num2 == null) {
                        throw c.q("screenResolutionX", "screenResolutionX", reader);
                    }
                    str6 = str15;
                    namespace2 = namespace3;
                    str = str11;
                    num = num4;
                    num3 = num6;
                    str4 = str12;
                    str5 = str13;
                case 4:
                    num3 = this.intAdapter.fromJson(reader);
                    if (num3 == null) {
                        throw c.q("screenResolutionY", "screenResolutionY", reader);
                    }
                    str6 = str15;
                    namespace2 = namespace3;
                    str = str11;
                    num = num4;
                    num2 = num5;
                    str4 = str12;
                    str5 = str13;
                case 5:
                    str2 = this.stringAdapter.fromJson(reader);
                    if (str2 == null) {
                        throw c.q("domainName", "domainName", reader);
                    }
                    i11 &= -33;
                    str6 = str15;
                    namespace2 = namespace3;
                    str = str11;
                    num = num4;
                    num2 = num5;
                    num3 = num6;
                    str4 = str12;
                    str5 = str13;
                case 6:
                    str3 = this.stringAdapter.fromJson(reader);
                    if (str3 == null) {
                        throw c.q("platform", "platform", reader);
                    }
                    i11 &= -65;
                    str6 = str15;
                    namespace2 = namespace3;
                    str = str11;
                    num = num4;
                    num2 = num5;
                    num3 = num6;
                    str4 = str12;
                    str5 = str13;
                case 7:
                    str4 = this.stringAdapter.fromJson(reader);
                    if (str4 == null) {
                        throw c.q("deviceType", "deviceType", reader);
                    }
                    str6 = str15;
                    namespace2 = namespace3;
                    str = str11;
                    num = num4;
                    num2 = num5;
                    num3 = num6;
                    str5 = str13;
                case 8:
                    str5 = this.stringAdapter.fromJson(reader);
                    if (str5 == null) {
                        throw c.q("osVersion", "osVersion", reader);
                    }
                    str6 = str15;
                    namespace2 = namespace3;
                    str = str11;
                    num = num4;
                    num2 = num5;
                    num3 = num6;
                    str4 = str12;
                case 9:
                    str6 = this.stringAdapter.fromJson(reader);
                    if (str6 == null) {
                        throw c.q("deviceModel", "deviceModel", reader);
                    }
                    namespace2 = namespace3;
                    str = str11;
                    num = num4;
                    num2 = num5;
                    num3 = num6;
                    str4 = str12;
                    str5 = str13;
                case 10:
                    str7 = this.stringAdapter.fromJson(reader);
                    if (str7 == null) {
                        throw c.q("mobileDeviceModel", "mobileDeviceModel", reader);
                    }
                    str6 = str15;
                    namespace2 = namespace3;
                    str = str11;
                    num = num4;
                    num2 = num5;
                    num3 = num6;
                    str4 = str12;
                    str5 = str13;
                case 11:
                    str8 = this.nullableStringAdapter.fromJson(reader);
                    i11 &= -2049;
                    str6 = str15;
                    namespace2 = namespace3;
                    str = str11;
                    num = num4;
                    num2 = num5;
                    num3 = num6;
                    str4 = str12;
                    str5 = str13;
                case 12:
                    str9 = this.nullableStringAdapter.fromJson(reader);
                    i11 &= -4097;
                    str6 = str15;
                    namespace2 = namespace3;
                    str = str11;
                    num = num4;
                    num2 = num5;
                    num3 = num6;
                    str4 = str12;
                    str5 = str13;
                case 13:
                    f7 = this.nullableFloatAdapter.fromJson(reader);
                    i11 &= -8193;
                    str6 = str15;
                    namespace2 = namespace3;
                    str = str11;
                    num = num4;
                    num2 = num5;
                    num3 = num6;
                    str4 = str12;
                    str5 = str13;
                case 14:
                    str10 = this.nullableStringAdapter.fromJson(reader);
                    i11 &= -16385;
                    str6 = str15;
                    namespace2 = namespace3;
                    str = str11;
                    num = num4;
                    num2 = num5;
                    num3 = num6;
                    str4 = str12;
                    str5 = str13;
                default:
                    str6 = str15;
                    namespace2 = namespace3;
                    str = str11;
                    num = num4;
                    num2 = num5;
                    num3 = num6;
                    str4 = str12;
                    str5 = str13;
            }
        }
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, EventEntity.Attributes value_) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value_ == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("namespace");
        this.namespaceAdapter.mo44toJson(writer, (x) value_.getNamespace());
        writer.w("appVersion");
        this.stringAdapter.mo44toJson(writer, (x) value_.getAppVersion());
        writer.w("buildNumber");
        this.intAdapter.mo44toJson(writer, (x) Integer.valueOf(value_.getBuildNumber()));
        writer.w("screenResolutionX");
        this.intAdapter.mo44toJson(writer, (x) Integer.valueOf(value_.getScreenResolutionX()));
        writer.w("screenResolutionY");
        this.intAdapter.mo44toJson(writer, (x) Integer.valueOf(value_.getScreenResolutionY()));
        writer.w("domainName");
        this.stringAdapter.mo44toJson(writer, (x) value_.getDomainName());
        writer.w("platform");
        this.stringAdapter.mo44toJson(writer, (x) value_.getPlatform());
        writer.w("deviceType");
        this.stringAdapter.mo44toJson(writer, (x) value_.getDeviceType());
        writer.w("osVersion");
        this.stringAdapter.mo44toJson(writer, (x) value_.getOsVersion());
        writer.w("deviceModel");
        this.stringAdapter.mo44toJson(writer, (x) value_.getDeviceModel());
        writer.w("mobileDeviceModel");
        this.stringAdapter.mo44toJson(writer, (x) value_.getMobileDeviceModel());
        writer.w("platformStore");
        this.nullableStringAdapter.mo44toJson(writer, (x) value_.getPlatformStore());
        writer.w("theme");
        this.nullableStringAdapter.mo44toJson(writer, (x) value_.getTheme());
        writer.w("screenDensity");
        this.nullableFloatAdapter.mo44toJson(writer, (x) value_.getScreenDensity());
        writer.w("userAgent");
        this.nullableStringAdapter.mo44toJson(writer, (x) value_.getUserAgent());
        writer.p();
    }
}
