package ru.ozon.fintech.antifraud.internal.domain.data;

import Ak.b;
import C.o0;
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
import ru.ozon.fintech.antifraud.internal.models.DeviceStatus;

@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0018R\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0018R\u001e\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f¨\u0006 "}, d2 = {"Lru/ozon/fintech/antifraud/internal/domain/data/SecurityDevicesStatusJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/fintech/antifraud/internal/domain/data/SecurityDevicesStatus;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/fintech/antifraud/internal/domain/data/SecurityDevicesStatus;", "Lcom/squareup/moshi/x;", "writer", "value_", "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/fintech/antifraud/internal/domain/data/SecurityDevicesStatus;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "stringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "intAdapter", "Lru/ozon/fintech/antifraud/internal/models/DeviceStatus;", "deviceStatusAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "internal_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SecurityDevicesStatusJsonAdapter extends JsonAdapter<SecurityDevicesStatus> {
    private volatile Constructor<SecurityDevicesStatus> constructorRef;

    @NotNull
    private final JsonAdapter<DeviceStatus> deviceStatusAdapter;

    @NotNull
    private final JsonAdapter<Integer> intAdapter;

    @NotNull
    private final n.a options;

    @NotNull
    private final JsonAdapter<String> stringAdapter;

    public SecurityDevicesStatusJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        n.a a11 = n.a.C0918a.a("app", "appver", "os", "ver", "osver", "data");
        Intrinsics.checkNotNullExpressionValue(a11, "of(...)");
        this.options = a11;
        M m11 = M.f71699a;
        JsonAdapter<String> f7 = moshi.f(String.class, m11, "app");
        Intrinsics.checkNotNullExpressionValue(f7, "adapter(...)");
        this.stringAdapter = f7;
        JsonAdapter<Integer> f11 = moshi.f(Integer.TYPE, m11, "jsonVersion");
        Intrinsics.checkNotNullExpressionValue(f11, "adapter(...)");
        this.intAdapter = f11;
        JsonAdapter<DeviceStatus> f12 = moshi.f(DeviceStatus.class, m11, "deviceStatus");
        Intrinsics.checkNotNullExpressionValue(f12, "adapter(...)");
        this.deviceStatusAdapter = f12;
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public SecurityDevicesStatus fromJson(@NotNull n reader) {
        int i11 = -1;
        Integer a11 = o0.a(reader, "reader", 0);
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        DeviceStatus deviceStatus = null;
        while (reader.hasNext()) {
            switch (reader.v(this.options)) {
                case -1:
                    reader.y();
                    reader.skipValue();
                    break;
                case 0:
                    str = this.stringAdapter.fromJson(reader);
                    if (str == null) {
                        throw c.q("app", "app", reader);
                    }
                    break;
                case 1:
                    str2 = this.stringAdapter.fromJson(reader);
                    if (str2 == null) {
                        throw c.q("appVersion", "appver", reader);
                    }
                    break;
                case 2:
                    str3 = this.stringAdapter.fromJson(reader);
                    if (str3 == null) {
                        throw c.q("os", "os", reader);
                    }
                    i11 &= -5;
                    break;
                case 3:
                    a11 = this.intAdapter.fromJson(reader);
                    if (a11 == null) {
                        throw c.q("jsonVersion", "ver", reader);
                    }
                    i11 &= -9;
                    break;
                case 4:
                    str4 = this.stringAdapter.fromJson(reader);
                    if (str4 == null) {
                        throw c.q("osver", "osver", reader);
                    }
                    i11 &= -17;
                    break;
                case 5:
                    deviceStatus = this.deviceStatusAdapter.fromJson(reader);
                    if (deviceStatus == null) {
                        throw c.q("deviceStatus", "data", reader);
                    }
                    break;
            }
        }
        reader.endObject();
        if (i11 == -29) {
            if (str == null) {
                throw c.j("app", "app", reader);
            }
            if (str2 == null) {
                throw c.j("appVersion", "appver", reader);
            }
            Intrinsics.g(str3, "null cannot be cast to non-null type kotlin.String");
            int intValue = a11.intValue();
            Intrinsics.g(str4, "null cannot be cast to non-null type kotlin.String");
            if (deviceStatus != null) {
                return new SecurityDevicesStatus(str, str2, str3, intValue, str4, deviceStatus);
            }
            throw c.j("deviceStatus", "data", reader);
        }
        String str5 = str;
        String str6 = str2;
        Constructor<SecurityDevicesStatus> constructor = this.constructorRef;
        if (constructor == null) {
            Class<?> cls = c.f34864d;
            Class cls2 = Integer.TYPE;
            constructor = SecurityDevicesStatus.class.getDeclaredConstructor(String.class, String.class, String.class, cls2, String.class, DeviceStatus.class, cls2, cls);
            this.constructorRef = constructor;
            Intrinsics.checkNotNullExpressionValue(constructor, "also(...)");
        }
        Constructor<SecurityDevicesStatus> constructor2 = constructor;
        if (str5 == null) {
            throw c.j("app", "app", reader);
        }
        if (str6 == null) {
            throw c.j("appVersion", "appver", reader);
        }
        if (deviceStatus == null) {
            throw c.j("deviceStatus", "data", reader);
        }
        SecurityDevicesStatus newInstance = constructor2.newInstance(str5, str6, str3, a11, str4, deviceStatus, Integer.valueOf(i11), null);
        Intrinsics.checkNotNullExpressionValue(newInstance, "newInstance(...)");
        return newInstance;
    }

    @NotNull
    public String toString() {
        return b.c(43, "GeneratedJsonAdapter(SecurityDevicesStatus)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, SecurityDevicesStatus value_) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value_ == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("app");
        this.stringAdapter.mo44toJson(writer, (x) value_.getApp());
        writer.w("appver");
        this.stringAdapter.mo44toJson(writer, (x) value_.getAppVersion());
        writer.w("os");
        this.stringAdapter.mo44toJson(writer, (x) value_.getOs());
        writer.w("ver");
        this.intAdapter.mo44toJson(writer, (x) Integer.valueOf(value_.getJsonVersion()));
        writer.w("osver");
        this.stringAdapter.mo44toJson(writer, (x) value_.getOsver());
        writer.w("data");
        this.deviceStatusAdapter.mo44toJson(writer, (x) value_.getDeviceStatus());
        writer.p();
    }
}
