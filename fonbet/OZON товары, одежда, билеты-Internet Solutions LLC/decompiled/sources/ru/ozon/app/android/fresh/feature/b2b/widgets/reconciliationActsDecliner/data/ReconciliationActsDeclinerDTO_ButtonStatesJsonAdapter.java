package ru.ozon.app.android.fresh.feature.b2b.widgets.reconciliationActsDecliner.data;

import Ak.b;
import Y9.c;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.n;
import com.squareup.moshi.x;
import kotlin.Metadata;
import kotlin.collections.M;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.fresh.feature.b2b.widgets.reconciliationActsDecliner.data.ReconciliationActsDeclinerDTO;
import ru.ozon.uni.atoms.data.controls.button.IconButtonV3DTO;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0019¨\u0006\u001c"}, d2 = {"Lru/ozon/app/android/fresh/feature/b2b/widgets/reconciliationActsDecliner/data/ReconciliationActsDeclinerDTO_ButtonStatesJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/fresh/feature/b2b/widgets/reconciliationActsDecliner/data/ReconciliationActsDeclinerDTO$ButtonStates;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/fresh/feature/b2b/widgets/reconciliationActsDecliner/data/ReconciliationActsDeclinerDTO$ButtonStates;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/fresh/feature/b2b/widgets/reconciliationActsDecliner/data/ReconciliationActsDeclinerDTO$ButtonStates;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "iconButtonV3DTOAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/fresh/feature/b2b/widgets/reconciliationActsDecliner/data/ReconciliationActsDeclinerDTO$ColoredButton;", "coloredButtonAdapter", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ReconciliationActsDeclinerDTO_ButtonStatesJsonAdapter extends JsonAdapter<ReconciliationActsDeclinerDTO.ButtonStates> {
    public static final int $stable = 8;

    @NotNull
    private final JsonAdapter<ReconciliationActsDeclinerDTO.ColoredButton> coloredButtonAdapter;

    @NotNull
    private final JsonAdapter<IconButtonV3DTO> iconButtonV3DTOAdapter;

    @NotNull
    private final n.a options;

    public ReconciliationActsDeclinerDTO_ButtonStatesJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.options = n.a.C0918a.a("defaultState", "successState", "errorState", "loadingState");
        M m11 = M.f71699a;
        this.iconButtonV3DTOAdapter = moshi.f(IconButtonV3DTO.class, m11, "defaultState");
        this.coloredButtonAdapter = moshi.f(ReconciliationActsDeclinerDTO.ColoredButton.class, m11, "loadingState");
    }

    @NotNull
    public String toString() {
        return b.c(64, "GeneratedJsonAdapter(ReconciliationActsDeclinerDTO.ButtonStates)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public ReconciliationActsDeclinerDTO.ButtonStates fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        IconButtonV3DTO iconButtonV3DTO = null;
        IconButtonV3DTO iconButtonV3DTO2 = null;
        IconButtonV3DTO iconButtonV3DTO3 = null;
        ReconciliationActsDeclinerDTO.ColoredButton coloredButton = null;
        while (reader.hasNext()) {
            int v11 = reader.v(this.options);
            if (v11 == -1) {
                reader.y();
                reader.skipValue();
            } else if (v11 == 0) {
                iconButtonV3DTO = this.iconButtonV3DTOAdapter.fromJson(reader);
                if (iconButtonV3DTO == null) {
                    throw c.q("defaultState", "defaultState", reader);
                }
            } else if (v11 == 1) {
                iconButtonV3DTO2 = this.iconButtonV3DTOAdapter.fromJson(reader);
                if (iconButtonV3DTO2 == null) {
                    throw c.q("successState", "successState", reader);
                }
            } else if (v11 == 2) {
                iconButtonV3DTO3 = this.iconButtonV3DTOAdapter.fromJson(reader);
                if (iconButtonV3DTO3 == null) {
                    throw c.q("errorState", "errorState", reader);
                }
            } else if (v11 == 3 && (coloredButton = this.coloredButtonAdapter.fromJson(reader)) == null) {
                throw c.q("loadingState", "loadingState", reader);
            }
        }
        reader.endObject();
        if (iconButtonV3DTO == null) {
            throw c.j("defaultState", "defaultState", reader);
        }
        if (iconButtonV3DTO2 == null) {
            throw c.j("successState", "successState", reader);
        }
        if (iconButtonV3DTO3 == null) {
            throw c.j("errorState", "errorState", reader);
        }
        if (coloredButton != null) {
            return new ReconciliationActsDeclinerDTO.ButtonStates(iconButtonV3DTO, iconButtonV3DTO2, iconButtonV3DTO3, coloredButton);
        }
        throw c.j("loadingState", "loadingState", reader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, ReconciliationActsDeclinerDTO.ButtonStates value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("defaultState");
        this.iconButtonV3DTOAdapter.mo44toJson(writer, (x) value.getDefaultState());
        writer.w("successState");
        this.iconButtonV3DTOAdapter.mo44toJson(writer, (x) value.getSuccessState());
        writer.w("errorState");
        this.iconButtonV3DTOAdapter.mo44toJson(writer, (x) value.getErrorState());
        writer.w("loadingState");
        this.coloredButtonAdapter.mo44toJson(writer, (x) value.getLoadingState());
        writer.p();
    }
}
