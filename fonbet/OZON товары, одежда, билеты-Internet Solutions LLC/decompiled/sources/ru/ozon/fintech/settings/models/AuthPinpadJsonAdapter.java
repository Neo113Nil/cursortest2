package ru.ozon.fintech.settings.models;

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
import ru.ozon.fintech.settings.models.AuthPinpad;

@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0019R\u001c\u0010\u001b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0019R\u001a\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0019R\u001c\u0010\u001f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001e0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u0019R\u001e\u0010!\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\"¨\u0006#"}, d2 = {"Lru/ozon/fintech/settings/models/AuthPinpadJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/fintech/settings/models/AuthPinpad;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/fintech/settings/models/AuthPinpad;", "Lcom/squareup/moshi/x;", "writer", "value_", "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/fintech/settings/models/AuthPinpad;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "", "booleanAdapter", "Lcom/squareup/moshi/JsonAdapter;", "stringAdapter", "nullableStringAdapter", "Lru/ozon/fintech/settings/models/AuthPinpad$Data;", "dataAdapter", "", "nullableLongAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "fintech-settings_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class AuthPinpadJsonAdapter extends JsonAdapter<AuthPinpad> {

    @NotNull
    private final JsonAdapter<Boolean> booleanAdapter;
    private volatile Constructor<AuthPinpad> constructorRef;

    @NotNull
    private final JsonAdapter<AuthPinpad.Data> dataAdapter;

    @NotNull
    private final JsonAdapter<Long> nullableLongAdapter;

    @NotNull
    private final JsonAdapter<String> nullableStringAdapter;

    @NotNull
    private final n.a options;

    @NotNull
    private final JsonAdapter<String> stringAdapter;

    public AuthPinpadJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        n.a a11 = n.a.C0918a.a("showPinpad", "redirectTo", "logoHidden", "redirectToDeep", "data", "timestamp");
        Intrinsics.checkNotNullExpressionValue(a11, "of(...)");
        this.options = a11;
        M m11 = M.f71699a;
        JsonAdapter<Boolean> f7 = moshi.f(Boolean.TYPE, m11, "showPinpad");
        Intrinsics.checkNotNullExpressionValue(f7, "adapter(...)");
        this.booleanAdapter = f7;
        JsonAdapter<String> f11 = moshi.f(String.class, m11, "redirectTo");
        Intrinsics.checkNotNullExpressionValue(f11, "adapter(...)");
        this.stringAdapter = f11;
        JsonAdapter<String> f12 = moshi.f(String.class, m11, "redirectToDeep");
        Intrinsics.checkNotNullExpressionValue(f12, "adapter(...)");
        this.nullableStringAdapter = f12;
        JsonAdapter<AuthPinpad.Data> f13 = moshi.f(AuthPinpad.Data.class, m11, "data");
        Intrinsics.checkNotNullExpressionValue(f13, "adapter(...)");
        this.dataAdapter = f13;
        JsonAdapter<Long> f14 = moshi.f(Long.class, m11, "timestamp");
        Intrinsics.checkNotNullExpressionValue(f14, "adapter(...)");
        this.nullableLongAdapter = f14;
    }

    @NotNull
    public String toString() {
        return b.c(32, "GeneratedJsonAdapter(AuthPinpad)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public AuthPinpad fromJson(@NotNull n reader) {
        AuthPinpad newInstance;
        Intrinsics.checkNotNullParameter(reader, "reader");
        Boolean bool = Boolean.FALSE;
        reader.beginObject();
        Long l11 = null;
        boolean z11 = false;
        int i11 = -1;
        Boolean bool2 = bool;
        Boolean bool3 = null;
        String str = null;
        String str2 = null;
        AuthPinpad.Data data = null;
        while (reader.hasNext()) {
            switch (reader.v(this.options)) {
                case -1:
                    reader.y();
                    reader.skipValue();
                    break;
                case 0:
                    bool3 = this.booleanAdapter.fromJson(reader);
                    if (bool3 == null) {
                        throw c.q("showPinpad", "showPinpad", reader);
                    }
                    break;
                case 1:
                    str = this.stringAdapter.fromJson(reader);
                    if (str == null) {
                        throw c.q("redirectTo", "redirectTo", reader);
                    }
                    break;
                case 2:
                    bool2 = this.booleanAdapter.fromJson(reader);
                    if (bool2 == null) {
                        throw c.q("logoHidden", "logoHidden", reader);
                    }
                    i11 = -5;
                    break;
                case 3:
                    str2 = this.nullableStringAdapter.fromJson(reader);
                    break;
                case 4:
                    data = this.dataAdapter.fromJson(reader);
                    if (data == null) {
                        throw c.q("data_", "data", reader);
                    }
                    break;
                case 5:
                    l11 = this.nullableLongAdapter.fromJson(reader);
                    z11 = true;
                    break;
            }
        }
        reader.endObject();
        if (i11 == -5) {
            String str3 = str2;
            if (bool3 == null) {
                throw c.j("showPinpad", "showPinpad", reader);
            }
            boolean booleanValue = bool3.booleanValue();
            if (str == null) {
                throw c.j("redirectTo", "redirectTo", reader);
            }
            boolean booleanValue2 = bool2.booleanValue();
            if (data == null) {
                throw c.j("data_", "data", reader);
            }
            newInstance = new AuthPinpad(booleanValue, str, booleanValue2, str3, data);
        } else {
            String str4 = str;
            String str5 = str2;
            Constructor<AuthPinpad> constructor = this.constructorRef;
            if (constructor == null) {
                Class<?> cls = c.f34864d;
                Class cls2 = Boolean.TYPE;
                constructor = AuthPinpad.class.getDeclaredConstructor(cls2, String.class, cls2, String.class, AuthPinpad.Data.class, Integer.TYPE, cls);
                this.constructorRef = constructor;
                Intrinsics.checkNotNullExpressionValue(constructor, "also(...)");
            }
            if (bool3 == null) {
                throw c.j("showPinpad", "showPinpad", reader);
            }
            if (str4 == null) {
                throw c.j("redirectTo", "redirectTo", reader);
            }
            if (data == null) {
                throw c.j("data_", "data", reader);
            }
            newInstance = constructor.newInstance(bool3, str4, bool2, str5, data, Integer.valueOf(i11), null);
        }
        if (z11) {
            newInstance.setTimestamp(l11);
        }
        return newInstance;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, AuthPinpad value_) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value_ == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("showPinpad");
        this.booleanAdapter.mo44toJson(writer, (x) Boolean.valueOf(value_.getShowPinpad()));
        writer.w("redirectTo");
        this.stringAdapter.mo44toJson(writer, (x) value_.getRedirectTo());
        writer.w("logoHidden");
        this.booleanAdapter.mo44toJson(writer, (x) Boolean.valueOf(value_.getLogoHidden()));
        writer.w("redirectToDeep");
        this.nullableStringAdapter.mo44toJson(writer, (x) value_.getRedirectToDeep());
        writer.w("data");
        this.dataAdapter.mo44toJson(writer, (x) value_.getData());
        writer.w("timestamp");
        this.nullableLongAdapter.mo44toJson(writer, (x) value_.getTimestamp());
        writer.p();
    }
}
