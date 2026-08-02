package ru.ozon.app.android.universalwidgets.messenger.tilescroll.data;

import Ak.b;
import Y9.c;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.n;
import com.squareup.moshi.x;
import java.lang.reflect.Constructor;
import kotlin.Metadata;
import kotlin.collections.M;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.universalwidgets.messenger.tilescroll.data.TileScrollBlockDTO;

@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001c\u0010\u001b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0019R\u001e\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, d2 = {"Lru/ozon/app/android/universalwidgets/messenger/tilescroll/data/TileScrollBlockDTO_Options_TileOptionsJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/universalwidgets/messenger/tilescroll/data/TileScrollBlockDTO$Options$TileOptions;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/universalwidgets/messenger/tilescroll/data/TileScrollBlockDTO$Options$TileOptions;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/universalwidgets/messenger/tilescroll/data/TileScrollBlockDTO$Options$TileOptions;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "", "nullableBooleanAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/universalwidgets/messenger/tilescroll/data/TileScrollBlockDTO$Options$TileOptions$ImageRatio;", "nullableImageRatioAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "universalwidgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class TileScrollBlockDTO_Options_TileOptionsJsonAdapter extends JsonAdapter<TileScrollBlockDTO.Options.TileOptions> {
    private volatile Constructor<TileScrollBlockDTO.Options.TileOptions> constructorRef;

    @NotNull
    private final JsonAdapter<Boolean> nullableBooleanAdapter;

    @NotNull
    private final JsonAdapter<TileScrollBlockDTO.Options.TileOptions.ImageRatio> nullableImageRatioAdapter;

    @NotNull
    private final n.a options;

    public TileScrollBlockDTO_Options_TileOptionsJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.options = n.a.C0918a.a("isCompactFavoriteIcon", "enableParanja", "imageRatio");
        M m11 = M.f71699a;
        this.nullableBooleanAdapter = moshi.f(Boolean.class, m11, "isCompactFavoriteIcon");
        this.nullableImageRatioAdapter = moshi.f(TileScrollBlockDTO.Options.TileOptions.ImageRatio.class, m11, "imageRatio");
    }

    @NotNull
    public String toString() {
        return b.c(60, "GeneratedJsonAdapter(TileScrollBlockDTO.Options.TileOptions)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public TileScrollBlockDTO.Options.TileOptions fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        Boolean bool = null;
        Boolean bool2 = null;
        TileScrollBlockDTO.Options.TileOptions.ImageRatio imageRatio = null;
        int i11 = -1;
        while (reader.hasNext()) {
            int v11 = reader.v(this.options);
            if (v11 == -1) {
                reader.y();
                reader.skipValue();
            } else if (v11 == 0) {
                bool = this.nullableBooleanAdapter.fromJson(reader);
                i11 &= -2;
            } else if (v11 == 1) {
                bool2 = this.nullableBooleanAdapter.fromJson(reader);
                i11 &= -3;
            } else if (v11 == 2) {
                imageRatio = this.nullableImageRatioAdapter.fromJson(reader);
                i11 &= -5;
            }
        }
        reader.endObject();
        if (i11 == -8) {
            return new TileScrollBlockDTO.Options.TileOptions(bool, bool2, imageRatio);
        }
        Constructor<TileScrollBlockDTO.Options.TileOptions> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = TileScrollBlockDTO.Options.TileOptions.class.getDeclaredConstructor(Boolean.class, Boolean.class, TileScrollBlockDTO.Options.TileOptions.ImageRatio.class, Integer.TYPE, c.f34864d);
            this.constructorRef = constructor;
            Intrinsics.checkNotNullExpressionValue(constructor, "also(...)");
        }
        TileScrollBlockDTO.Options.TileOptions newInstance = constructor.newInstance(bool, bool2, imageRatio, Integer.valueOf(i11), null);
        Intrinsics.checkNotNullExpressionValue(newInstance, "newInstance(...)");
        return newInstance;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, TileScrollBlockDTO.Options.TileOptions value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("isCompactFavoriteIcon");
        this.nullableBooleanAdapter.mo44toJson(writer, (x) value.isCompactFavoriteIcon());
        writer.w("enableParanja");
        this.nullableBooleanAdapter.mo44toJson(writer, (x) value.getEnableParanja());
        writer.w("imageRatio");
        this.nullableImageRatioAdapter.mo44toJson(writer, (x) value.getImageRatio());
        writer.p();
    }
}
