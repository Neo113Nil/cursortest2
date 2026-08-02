package ru.ozon.app.android.travel.feature.general.common.widgets.emptyState.v1.data;

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
import ru.ozon.app.android.travel.feature.general.common.widgets.emptyState.v1.data.EmptyStateWidgetDTO;
import ru.ozon.app.android.travel.molecules.dto.emptyState.v1.EmptyStateDTO;

@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001c\u0010\u001b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0019R\u001a\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0019R\u001e\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 ¨\u0006!"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/emptyState/v1/data/EmptyStateWidgetDTOJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/travel/feature/general/common/widgets/emptyState/v1/data/EmptyStateWidgetDTO;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/travel/feature/general/common/widgets/emptyState/v1/data/EmptyStateWidgetDTO;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/travel/feature/general/common/widgets/emptyState/v1/data/EmptyStateWidgetDTO;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "Lru/ozon/app/android/travel/molecules/dto/emptyState/v1/EmptyStateDTO;", "emptyStateDTOAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/travel/feature/general/common/widgets/emptyState/v1/data/EmptyStateWidgetDTO$ButtonsPosition;", "nullableButtonsPositionAdapter", "Lru/ozon/app/android/travel/feature/general/common/widgets/emptyState/v1/data/EmptyStateWidgetDTO$ViewAppearance;", "viewAppearanceAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class EmptyStateWidgetDTOJsonAdapter extends JsonAdapter<EmptyStateWidgetDTO> {
    public static final int $stable = 8;
    private volatile Constructor<EmptyStateWidgetDTO> constructorRef;

    @NotNull
    private final JsonAdapter<EmptyStateDTO> emptyStateDTOAdapter;

    @NotNull
    private final JsonAdapter<EmptyStateWidgetDTO.ButtonsPosition> nullableButtonsPositionAdapter;

    @NotNull
    private final n.a options;

    @NotNull
    private final JsonAdapter<EmptyStateWidgetDTO.ViewAppearance> viewAppearanceAdapter;

    public EmptyStateWidgetDTOJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.options = n.a.C0918a.a("emptyState", "buttonsPosition", "appearance");
        M m11 = M.f71699a;
        this.emptyStateDTOAdapter = moshi.f(EmptyStateDTO.class, m11, "emptyState");
        this.nullableButtonsPositionAdapter = moshi.f(EmptyStateWidgetDTO.ButtonsPosition.class, m11, "buttonsPosition");
        this.viewAppearanceAdapter = moshi.f(EmptyStateWidgetDTO.ViewAppearance.class, m11, "appearance");
    }

    @NotNull
    public String toString() {
        return b.c(41, "GeneratedJsonAdapter(EmptyStateWidgetDTO)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public EmptyStateWidgetDTO fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        EmptyStateDTO emptyStateDTO = null;
        EmptyStateWidgetDTO.ButtonsPosition buttonsPosition = null;
        EmptyStateWidgetDTO.ViewAppearance viewAppearance = null;
        int i11 = -1;
        while (reader.hasNext()) {
            int v11 = reader.v(this.options);
            if (v11 == -1) {
                reader.y();
                reader.skipValue();
            } else if (v11 == 0) {
                emptyStateDTO = this.emptyStateDTOAdapter.fromJson(reader);
                if (emptyStateDTO == null) {
                    throw c.q("emptyState", "emptyState", reader);
                }
            } else if (v11 == 1) {
                buttonsPosition = this.nullableButtonsPositionAdapter.fromJson(reader);
            } else if (v11 == 2) {
                viewAppearance = this.viewAppearanceAdapter.fromJson(reader);
                if (viewAppearance == null) {
                    throw c.q("appearance", "appearance", reader);
                }
                i11 = -5;
            } else {
                continue;
            }
        }
        reader.endObject();
        if (i11 == -5) {
            if (emptyStateDTO == null) {
                throw c.j("emptyState", "emptyState", reader);
            }
            Intrinsics.g(viewAppearance, "null cannot be cast to non-null type ru.ozon.app.android.travel.feature.general.common.widgets.emptyState.v1.data.EmptyStateWidgetDTO.ViewAppearance");
            return new EmptyStateWidgetDTO(emptyStateDTO, buttonsPosition, viewAppearance);
        }
        Constructor<EmptyStateWidgetDTO> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = EmptyStateWidgetDTO.class.getDeclaredConstructor(EmptyStateDTO.class, EmptyStateWidgetDTO.ButtonsPosition.class, EmptyStateWidgetDTO.ViewAppearance.class, Integer.TYPE, c.f34864d);
            this.constructorRef = constructor;
            Intrinsics.checkNotNullExpressionValue(constructor, "also(...)");
        }
        if (emptyStateDTO == null) {
            throw c.j("emptyState", "emptyState", reader);
        }
        EmptyStateWidgetDTO newInstance = constructor.newInstance(emptyStateDTO, buttonsPosition, viewAppearance, Integer.valueOf(i11), null);
        Intrinsics.checkNotNullExpressionValue(newInstance, "newInstance(...)");
        return newInstance;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, EmptyStateWidgetDTO value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("emptyState");
        this.emptyStateDTOAdapter.mo44toJson(writer, (x) value.getEmptyState());
        writer.w("buttonsPosition");
        this.nullableButtonsPositionAdapter.mo44toJson(writer, (x) value.getButtonsPosition());
        writer.w("appearance");
        this.viewAppearanceAdapter.mo44toJson(writer, (x) value.getAppearance());
        writer.p();
    }
}
