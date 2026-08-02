package ru.ozon.app.android.common.navigationblocks.data;

import Ak.b;
import Y9.c;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
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
import ru.ozon.app.android.common.navigationblocks.data.NavigationBlocksV2DTO;

@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0017\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0018R \u0010\u001d\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001c0\u001b0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0018R\u001e\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 ¨\u0006!"}, d2 = {"Lru/ozon/app/android/common/navigationblocks/data/NavigationBlocksV2DTOJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/common/navigationblocks/data/NavigationBlocksV2DTO;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/common/navigationblocks/data/NavigationBlocksV2DTO;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/common/navigationblocks/data/NavigationBlocksV2DTO;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "nullableStringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/common/navigationblocks/data/NavigationBlocksV2DTO$RoundedCorners;", "roundedCornersAdapter", "", "Lru/ozon/app/android/common/navigationblocks/data/NavigationBlockDTO;", "listOfNavigationBlockDTOAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "navigation-blocks_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class NavigationBlocksV2DTOJsonAdapter extends JsonAdapter<NavigationBlocksV2DTO> {
    private volatile Constructor<NavigationBlocksV2DTO> constructorRef;

    @NotNull
    private final JsonAdapter<List<NavigationBlockDTO>> listOfNavigationBlockDTOAdapter;

    @NotNull
    private final JsonAdapter<String> nullableStringAdapter;

    @NotNull
    private final n.a options;

    @NotNull
    private final JsonAdapter<NavigationBlocksV2DTO.RoundedCorners> roundedCornersAdapter;

    public NavigationBlocksV2DTOJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.options = n.a.C0918a.a("outerBackgroundColor", "roundedCorners", "blocks");
        M m11 = M.f71699a;
        this.nullableStringAdapter = moshi.f(String.class, m11, "outerBackgroundColor");
        this.roundedCornersAdapter = moshi.f(NavigationBlocksV2DTO.RoundedCorners.class, m11, "roundedCorners");
        this.listOfNavigationBlockDTOAdapter = moshi.f(D.e(List.class, NavigationBlockDTO.class), m11, "blocks");
    }

    @NotNull
    public String toString() {
        return b.c(43, "GeneratedJsonAdapter(NavigationBlocksV2DTO)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public NavigationBlocksV2DTO fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        String str = null;
        NavigationBlocksV2DTO.RoundedCorners roundedCorners = null;
        List<NavigationBlockDTO> list = null;
        int i11 = -1;
        while (reader.hasNext()) {
            int v11 = reader.v(this.options);
            if (v11 == -1) {
                reader.y();
                reader.skipValue();
            } else if (v11 == 0) {
                str = this.nullableStringAdapter.fromJson(reader);
            } else if (v11 == 1) {
                roundedCorners = this.roundedCornersAdapter.fromJson(reader);
                if (roundedCorners == null) {
                    throw c.q("roundedCorners", "roundedCorners", reader);
                }
                i11 = -3;
            } else if (v11 == 2 && (list = this.listOfNavigationBlockDTOAdapter.fromJson(reader)) == null) {
                throw c.q("blocks", "blocks", reader);
            }
        }
        reader.endObject();
        if (i11 == -3) {
            Intrinsics.g(roundedCorners, "null cannot be cast to non-null type ru.ozon.app.android.common.navigationblocks.data.NavigationBlocksV2DTO.RoundedCorners");
            if (list != null) {
                return new NavigationBlocksV2DTO(str, roundedCorners, list);
            }
            throw c.j("blocks", "blocks", reader);
        }
        Constructor<NavigationBlocksV2DTO> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = NavigationBlocksV2DTO.class.getDeclaredConstructor(String.class, NavigationBlocksV2DTO.RoundedCorners.class, List.class, Integer.TYPE, c.f34864d);
            this.constructorRef = constructor;
            Intrinsics.checkNotNullExpressionValue(constructor, "also(...)");
        }
        if (list == null) {
            throw c.j("blocks", "blocks", reader);
        }
        NavigationBlocksV2DTO newInstance = constructor.newInstance(str, roundedCorners, list, Integer.valueOf(i11), null);
        Intrinsics.checkNotNullExpressionValue(newInstance, "newInstance(...)");
        return newInstance;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, NavigationBlocksV2DTO value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("outerBackgroundColor");
        this.nullableStringAdapter.mo44toJson(writer, (x) value.getOuterBackgroundColor());
        writer.w("roundedCorners");
        this.roundedCornersAdapter.mo44toJson(writer, (x) value.getRoundedCorners());
        writer.w("blocks");
        this.listOfNavigationBlockDTOAdapter.mo44toJson(writer, (x) value.getBlocks());
        writer.p();
    }
}
