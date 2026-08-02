package ru.ozon.app.android.fresh.feature.b2b.widgets.legals.userLegalEntities.data;

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
import ru.ozon.app.android.fresh.feature.b2b.widgets.legals.userLegalEntities.data.Remove;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0019¨\u0006\u001c"}, d2 = {"Lru/ozon/app/android/fresh/feature/b2b/widgets/legals/userLegalEntities/data/RemoveJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/fresh/feature/b2b/widgets/legals/userLegalEntities/data/Remove;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/fresh/feature/b2b/widgets/legals/userLegalEntities/data/Remove;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/fresh/feature/b2b/widgets/legals/userLegalEntities/data/Remove;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallIconButton;", "smallIconButtonAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/fresh/feature/b2b/widgets/legals/userLegalEntities/data/Remove$Confirmation;", "confirmationAdapter", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class RemoveJsonAdapter extends JsonAdapter<Remove> {
    public static final int $stable = 8;

    @NotNull
    private final JsonAdapter<Remove.Confirmation> confirmationAdapter;

    @NotNull
    private final n.a options;

    @NotNull
    private final JsonAdapter<ButtonV3Atom.SmallIconButton> smallIconButtonAdapter;

    public RemoveJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.options = n.a.C0918a.a("button", "confirmation");
        M m11 = M.f71699a;
        this.smallIconButtonAdapter = moshi.f(ButtonV3Atom.SmallIconButton.class, m11, "button");
        this.confirmationAdapter = moshi.f(Remove.Confirmation.class, m11, "confirmation");
    }

    @NotNull
    public String toString() {
        return b.c(28, "GeneratedJsonAdapter(Remove)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public Remove fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        ButtonV3Atom.SmallIconButton smallIconButton = null;
        Remove.Confirmation confirmation = null;
        while (reader.hasNext()) {
            int v11 = reader.v(this.options);
            if (v11 == -1) {
                reader.y();
                reader.skipValue();
            } else if (v11 == 0) {
                smallIconButton = this.smallIconButtonAdapter.fromJson(reader);
                if (smallIconButton == null) {
                    throw c.q("button", "button", reader);
                }
            } else if (v11 == 1 && (confirmation = this.confirmationAdapter.fromJson(reader)) == null) {
                throw c.q("confirmation", "confirmation", reader);
            }
        }
        reader.endObject();
        if (smallIconButton == null) {
            throw c.j("button", "button", reader);
        }
        if (confirmation != null) {
            return new Remove(smallIconButton, confirmation);
        }
        throw c.j("confirmation", "confirmation", reader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, Remove value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("button");
        this.smallIconButtonAdapter.mo44toJson(writer, (x) value.getButton());
        writer.w("confirmation");
        this.confirmationAdapter.mo44toJson(writer, (x) value.getConfirmation());
        writer.p();
    }
}
