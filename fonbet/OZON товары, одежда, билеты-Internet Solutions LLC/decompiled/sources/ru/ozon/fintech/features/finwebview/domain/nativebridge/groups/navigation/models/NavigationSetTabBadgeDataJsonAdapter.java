package ru.ozon.fintech.features.finwebview.domain.nativebridge.groups.navigation.models;

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

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0018R\u001c\u0010\u001b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0018R\u001e\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, d2 = {"Lru/ozon/fintech/features/finwebview/domain/nativebridge/groups/navigation/models/NavigationSetTabBadgeDataJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/fintech/features/finwebview/domain/nativebridge/groups/navigation/models/NavigationSetTabBadgeData;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/fintech/features/finwebview/domain/nativebridge/groups/navigation/models/NavigationSetTabBadgeData;", "Lcom/squareup/moshi/x;", "writer", "value_", "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/fintech/features/finwebview/domain/nativebridge/groups/navigation/models/NavigationSetTabBadgeData;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "stringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "booleanAdapter", "nullableStringAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "finwebview_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class NavigationSetTabBadgeDataJsonAdapter extends JsonAdapter<NavigationSetTabBadgeData> {

    @NotNull
    private final JsonAdapter<Boolean> booleanAdapter;
    private volatile Constructor<NavigationSetTabBadgeData> constructorRef;

    @NotNull
    private final JsonAdapter<String> nullableStringAdapter;

    @NotNull
    private final n.a options;

    @NotNull
    private final JsonAdapter<String> stringAdapter;

    public NavigationSetTabBadgeDataJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        n.a a11 = n.a.C0918a.a("tab", "enabled", "color", "text", "icon_url", "icon_background_url", "animation_type");
        Intrinsics.checkNotNullExpressionValue(a11, "of(...)");
        this.options = a11;
        M m11 = M.f71699a;
        JsonAdapter<String> f7 = moshi.f(String.class, m11, "tab");
        Intrinsics.checkNotNullExpressionValue(f7, "adapter(...)");
        this.stringAdapter = f7;
        JsonAdapter<Boolean> f11 = moshi.f(Boolean.TYPE, m11, "enabled");
        Intrinsics.checkNotNullExpressionValue(f11, "adapter(...)");
        this.booleanAdapter = f11;
        JsonAdapter<String> f12 = moshi.f(String.class, m11, "color");
        Intrinsics.checkNotNullExpressionValue(f12, "adapter(...)");
        this.nullableStringAdapter = f12;
    }

    @NotNull
    public String toString() {
        return b.c(47, "GeneratedJsonAdapter(NavigationSetTabBadgeData)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public NavigationSetTabBadgeData fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        Boolean bool = Boolean.FALSE;
        reader.beginObject();
        int i11 = -1;
        Boolean bool2 = bool;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        while (reader.hasNext()) {
            switch (reader.v(this.options)) {
                case -1:
                    reader.y();
                    reader.skipValue();
                    break;
                case 0:
                    str = this.stringAdapter.fromJson(reader);
                    if (str == null) {
                        throw c.q("tab", "tab", reader);
                    }
                    break;
                case 1:
                    bool2 = this.booleanAdapter.fromJson(reader);
                    if (bool2 == null) {
                        throw c.q("enabled", "enabled", reader);
                    }
                    i11 &= -3;
                    break;
                case 2:
                    str2 = this.nullableStringAdapter.fromJson(reader);
                    break;
                case 3:
                    str3 = this.nullableStringAdapter.fromJson(reader);
                    break;
                case 4:
                    str4 = this.nullableStringAdapter.fromJson(reader);
                    i11 &= -17;
                    break;
                case 5:
                    str5 = this.nullableStringAdapter.fromJson(reader);
                    i11 &= -33;
                    break;
                case 6:
                    str6 = this.nullableStringAdapter.fromJson(reader);
                    i11 &= -65;
                    break;
            }
        }
        reader.endObject();
        if (i11 == -115) {
            String str7 = str5;
            String str8 = str2;
            if (str == null) {
                throw c.j("tab", "tab", reader);
            }
            return new NavigationSetTabBadgeData(str, bool2.booleanValue(), str8, str3, str4, str7, str6);
        }
        String str9 = str4;
        String str10 = str5;
        String str11 = str2;
        Constructor<NavigationSetTabBadgeData> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = NavigationSetTabBadgeData.class.getDeclaredConstructor(String.class, Boolean.TYPE, String.class, String.class, String.class, String.class, String.class, Integer.TYPE, c.f34864d);
            this.constructorRef = constructor;
            Intrinsics.checkNotNullExpressionValue(constructor, "also(...)");
        }
        if (str == null) {
            throw c.j("tab", "tab", reader);
        }
        NavigationSetTabBadgeData newInstance = constructor.newInstance(str, bool2, str11, str3, str9, str10, str6, Integer.valueOf(i11), null);
        Intrinsics.checkNotNullExpressionValue(newInstance, "newInstance(...)");
        return newInstance;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, NavigationSetTabBadgeData value_) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value_ == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("tab");
        this.stringAdapter.mo44toJson(writer, (x) value_.getTab());
        writer.w("enabled");
        this.booleanAdapter.mo44toJson(writer, (x) Boolean.valueOf(value_.getEnabled()));
        writer.w("color");
        this.nullableStringAdapter.mo44toJson(writer, (x) value_.getColor());
        writer.w("text");
        this.nullableStringAdapter.mo44toJson(writer, (x) value_.getText());
        writer.w("icon_url");
        this.nullableStringAdapter.mo44toJson(writer, (x) value_.getIconUrl());
        writer.w("icon_background_url");
        this.nullableStringAdapter.mo44toJson(writer, (x) value_.getIconBackgroundUrl());
        writer.w("animation_type");
        this.nullableStringAdapter.mo44toJson(writer, (x) value_.getAnimationType());
        writer.p();
    }
}
