package ru.ozon.app.android.fresh.unsorted.widgets.imageBadgeList.data;

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
import ru.ozon.app.android.fresh.unsorted.widgets.imageBadgeList.data.ImageBadgeListDTO;
import ru.ozon.uni.atoms.data.common.Paddings;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001e\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"Lru/ozon/app/android/fresh/unsorted/widgets/imageBadgeList/data/ImageBadgeListDTO_PaddingsDTOJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/fresh/unsorted/widgets/imageBadgeList/data/ImageBadgeListDTO$PaddingsDTO;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/fresh/unsorted/widgets/imageBadgeList/data/ImageBadgeListDTO$PaddingsDTO;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/fresh/unsorted/widgets/imageBadgeList/data/ImageBadgeListDTO$PaddingsDTO;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "Lru/ozon/uni/atoms/data/common/Paddings;", "paddingsAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "widgets-unsorted_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ImageBadgeListDTO_PaddingsDTOJsonAdapter extends JsonAdapter<ImageBadgeListDTO.PaddingsDTO> {
    public static final int $stable = 8;
    private volatile Constructor<ImageBadgeListDTO.PaddingsDTO> constructorRef;

    @NotNull
    private final n.a options;

    @NotNull
    private final JsonAdapter<Paddings> paddingsAdapter;

    public ImageBadgeListDTO_PaddingsDTOJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.options = n.a.C0918a.a("top", "bottom", "left", "right", "between");
        this.paddingsAdapter = moshi.f(Paddings.class, M.f71699a, "top");
    }

    @NotNull
    public String toString() {
        return b.c(51, "GeneratedJsonAdapter(ImageBadgeListDTO.PaddingsDTO)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public ImageBadgeListDTO.PaddingsDTO fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        Paddings paddings = null;
        Paddings paddings2 = null;
        Paddings paddings3 = null;
        Paddings paddings4 = null;
        Paddings paddings5 = null;
        int i11 = -1;
        while (reader.hasNext()) {
            int v11 = reader.v(this.options);
            if (v11 == -1) {
                reader.y();
                reader.skipValue();
            } else if (v11 == 0) {
                paddings = this.paddingsAdapter.fromJson(reader);
                if (paddings == null) {
                    throw c.q("top", "top", reader);
                }
                i11 &= -2;
            } else if (v11 == 1) {
                paddings2 = this.paddingsAdapter.fromJson(reader);
                if (paddings2 == null) {
                    throw c.q("bottom", "bottom", reader);
                }
                i11 &= -3;
            } else if (v11 == 2) {
                paddings3 = this.paddingsAdapter.fromJson(reader);
                if (paddings3 == null) {
                    throw c.q("left", "left", reader);
                }
                i11 &= -5;
            } else if (v11 == 3) {
                paddings4 = this.paddingsAdapter.fromJson(reader);
                if (paddings4 == null) {
                    throw c.q("right", "right", reader);
                }
                i11 &= -9;
            } else if (v11 == 4) {
                paddings5 = this.paddingsAdapter.fromJson(reader);
                if (paddings5 == null) {
                    throw c.q("between", "between", reader);
                }
                i11 &= -17;
            } else {
                continue;
            }
        }
        reader.endObject();
        if (i11 != -32) {
            Constructor<ImageBadgeListDTO.PaddingsDTO> constructor = this.constructorRef;
            if (constructor == null) {
                constructor = ImageBadgeListDTO.PaddingsDTO.class.getDeclaredConstructor(Paddings.class, Paddings.class, Paddings.class, Paddings.class, Paddings.class, Integer.TYPE, c.f34864d);
                this.constructorRef = constructor;
                Intrinsics.checkNotNullExpressionValue(constructor, "also(...)");
            }
            ImageBadgeListDTO.PaddingsDTO newInstance = constructor.newInstance(paddings, paddings2, paddings3, paddings4, paddings5, Integer.valueOf(i11), null);
            Intrinsics.checkNotNullExpressionValue(newInstance, "newInstance(...)");
            return newInstance;
        }
        Intrinsics.g(paddings, "null cannot be cast to non-null type ru.ozon.uni.atoms.data.common.Paddings");
        Intrinsics.g(paddings2, "null cannot be cast to non-null type ru.ozon.uni.atoms.data.common.Paddings");
        Intrinsics.g(paddings3, "null cannot be cast to non-null type ru.ozon.uni.atoms.data.common.Paddings");
        Intrinsics.g(paddings4, "null cannot be cast to non-null type ru.ozon.uni.atoms.data.common.Paddings");
        Intrinsics.g(paddings5, "null cannot be cast to non-null type ru.ozon.uni.atoms.data.common.Paddings");
        Paddings paddings6 = paddings5;
        Paddings paddings7 = paddings4;
        return new ImageBadgeListDTO.PaddingsDTO(paddings, paddings2, paddings3, paddings7, paddings6);
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, ImageBadgeListDTO.PaddingsDTO value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("top");
        this.paddingsAdapter.mo44toJson(writer, (x) value.getTop());
        writer.w("bottom");
        this.paddingsAdapter.mo44toJson(writer, (x) value.getBottom());
        writer.w("left");
        this.paddingsAdapter.mo44toJson(writer, (x) value.getLeft());
        writer.w("right");
        this.paddingsAdapter.mo44toJson(writer, (x) value.getRight());
        writer.w("between");
        this.paddingsAdapter.mo44toJson(writer, (x) value.getBetween());
        writer.p();
    }
}
