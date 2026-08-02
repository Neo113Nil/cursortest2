package ru.ozon.fintech.settings.models;

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
import ru.ozon.app.android.checkoutcomposer.common.splitDynamicElements.data.DynamicElementDTO;

@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R \u0010\u001b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001a0\u00190\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0018R\u001c\u0010\u001d\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001c0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0018R\u001e\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 ¨\u0006!"}, d2 = {"Lru/ozon/fintech/settings/models/AppConfigJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/fintech/settings/models/AppConfig;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/fintech/settings/models/AppConfig;", "Lcom/squareup/moshi/x;", "writer", "value_", "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/fintech/settings/models/AppConfig;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "stringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "Lru/ozon/fintech/settings/models/AppConfigTab;", "listOfAppConfigTabAdapter", "Lru/ozon/fintech/settings/models/AuthPinpad;", "nullableAuthPinpadAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "fintech-settings_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class AppConfigJsonAdapter extends JsonAdapter<AppConfig> {
    private volatile Constructor<AppConfig> constructorRef;

    @NotNull
    private final JsonAdapter<List<AppConfigTab>> listOfAppConfigTabAdapter;

    @NotNull
    private final JsonAdapter<AuthPinpad> nullableAuthPinpadAdapter;

    @NotNull
    private final n.a options;

    @NotNull
    private final JsonAdapter<String> stringAdapter;

    public AppConfigJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        n.a a11 = n.a.C0918a.a("source", DynamicElementDTO.TABS, "authPinpad");
        Intrinsics.checkNotNullExpressionValue(a11, "of(...)");
        this.options = a11;
        M m11 = M.f71699a;
        JsonAdapter<String> f7 = moshi.f(String.class, m11, "source");
        Intrinsics.checkNotNullExpressionValue(f7, "adapter(...)");
        this.stringAdapter = f7;
        JsonAdapter<List<AppConfigTab>> f11 = moshi.f(D.e(List.class, AppConfigTab.class), m11, DynamicElementDTO.TABS);
        Intrinsics.checkNotNullExpressionValue(f11, "adapter(...)");
        this.listOfAppConfigTabAdapter = f11;
        JsonAdapter<AuthPinpad> f12 = moshi.f(AuthPinpad.class, m11, "authPinpad");
        Intrinsics.checkNotNullExpressionValue(f12, "adapter(...)");
        this.nullableAuthPinpadAdapter = f12;
    }

    @NotNull
    public String toString() {
        return b.c(31, "GeneratedJsonAdapter(AppConfig)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public AppConfig fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        String str = null;
        List<AppConfigTab> list = null;
        AuthPinpad authPinpad = null;
        int i11 = -1;
        while (reader.hasNext()) {
            int v11 = reader.v(this.options);
            if (v11 == -1) {
                reader.y();
                reader.skipValue();
            } else if (v11 == 0) {
                str = this.stringAdapter.fromJson(reader);
                if (str == null) {
                    throw c.q("source", "source", reader);
                }
                i11 &= -2;
            } else if (v11 == 1) {
                list = this.listOfAppConfigTabAdapter.fromJson(reader);
                if (list == null) {
                    throw c.q(DynamicElementDTO.TABS, DynamicElementDTO.TABS, reader);
                }
            } else if (v11 == 2) {
                authPinpad = this.nullableAuthPinpadAdapter.fromJson(reader);
                i11 &= -5;
            }
        }
        reader.endObject();
        if (i11 == -6) {
            Intrinsics.g(str, "null cannot be cast to non-null type kotlin.String");
            if (list != null) {
                return new AppConfig(str, list, authPinpad);
            }
            throw c.j(DynamicElementDTO.TABS, DynamicElementDTO.TABS, reader);
        }
        Constructor<AppConfig> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = AppConfig.class.getDeclaredConstructor(String.class, List.class, AuthPinpad.class, Integer.TYPE, c.f34864d);
            this.constructorRef = constructor;
            Intrinsics.checkNotNullExpressionValue(constructor, "also(...)");
        }
        if (list == null) {
            throw c.j(DynamicElementDTO.TABS, DynamicElementDTO.TABS, reader);
        }
        AppConfig newInstance = constructor.newInstance(str, list, authPinpad, Integer.valueOf(i11), null);
        Intrinsics.checkNotNullExpressionValue(newInstance, "newInstance(...)");
        return newInstance;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, AppConfig value_) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value_ == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("source");
        this.stringAdapter.mo44toJson(writer, (x) value_.getSource());
        writer.w(DynamicElementDTO.TABS);
        this.listOfAppConfigTabAdapter.mo44toJson(writer, (x) value_.getTabs());
        writer.w("authPinpad");
        this.nullableAuthPinpadAdapter.mo44toJson(writer, (x) value_.getAuthPinpad());
        writer.p();
    }
}
