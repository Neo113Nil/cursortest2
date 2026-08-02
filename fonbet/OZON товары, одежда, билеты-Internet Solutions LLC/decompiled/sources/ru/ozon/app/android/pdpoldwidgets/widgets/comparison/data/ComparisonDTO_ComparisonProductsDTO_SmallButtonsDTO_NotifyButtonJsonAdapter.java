package ru.ozon.app.android.pdpoldwidgets.widgets.comparison.data;

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
import ru.ozon.app.android.pdpoldwidgets.widgets.comparison.data.ComparisonDTO;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0019¨\u0006\u001c"}, d2 = {"Lru/ozon/app/android/pdpoldwidgets/widgets/comparison/data/ComparisonDTO_ComparisonProductsDTO_SmallButtonsDTO_NotifyButtonJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/pdpoldwidgets/widgets/comparison/data/ComparisonDTO$ComparisonProductsDTO$SmallButtonsDTO$NotifyButton;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/pdpoldwidgets/widgets/comparison/data/ComparisonDTO$ComparisonProductsDTO$SmallButtonsDTO$NotifyButton;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/pdpoldwidgets/widgets/comparison/data/ComparisonDTO$ComparisonProductsDTO$SmallButtonsDTO$NotifyButton;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "", "booleanAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallIconButton;", "smallIconButtonAdapter", "pdp-old-widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ComparisonDTO_ComparisonProductsDTO_SmallButtonsDTO_NotifyButtonJsonAdapter extends JsonAdapter<ComparisonDTO.ComparisonProductsDTO.SmallButtonsDTO.NotifyButton> {

    @NotNull
    private final JsonAdapter<Boolean> booleanAdapter;

    @NotNull
    private final n.a options;

    @NotNull
    private final JsonAdapter<ButtonV3Atom.SmallIconButton> smallIconButtonAdapter;

    public ComparisonDTO_ComparisonProductsDTO_SmallButtonsDTO_NotifyButtonJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.options = n.a.C0918a.a("isSubscribed", "subscribeButton", "unsubscribeButton");
        M m11 = M.f71699a;
        this.booleanAdapter = moshi.f(Boolean.TYPE, m11, "isSubscribed");
        this.smallIconButtonAdapter = moshi.f(ButtonV3Atom.SmallIconButton.class, m11, "subscribeButton");
    }

    @NotNull
    public String toString() {
        return b.c(86, "GeneratedJsonAdapter(ComparisonDTO.ComparisonProductsDTO.SmallButtonsDTO.NotifyButton)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public ComparisonDTO.ComparisonProductsDTO.SmallButtonsDTO.NotifyButton fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        Boolean bool = null;
        ButtonV3Atom.SmallIconButton smallIconButton = null;
        ButtonV3Atom.SmallIconButton smallIconButton2 = null;
        while (reader.hasNext()) {
            int v11 = reader.v(this.options);
            if (v11 == -1) {
                reader.y();
                reader.skipValue();
            } else if (v11 == 0) {
                bool = this.booleanAdapter.fromJson(reader);
                if (bool == null) {
                    throw c.q("isSubscribed", "isSubscribed", reader);
                }
            } else if (v11 == 1) {
                smallIconButton = this.smallIconButtonAdapter.fromJson(reader);
                if (smallIconButton == null) {
                    throw c.q("subscribeButton", "subscribeButton", reader);
                }
            } else if (v11 == 2 && (smallIconButton2 = this.smallIconButtonAdapter.fromJson(reader)) == null) {
                throw c.q("unsubscribeButton", "unsubscribeButton", reader);
            }
        }
        reader.endObject();
        if (bool == null) {
            throw c.j("isSubscribed", "isSubscribed", reader);
        }
        boolean booleanValue = bool.booleanValue();
        if (smallIconButton == null) {
            throw c.j("subscribeButton", "subscribeButton", reader);
        }
        if (smallIconButton2 != null) {
            return new ComparisonDTO.ComparisonProductsDTO.SmallButtonsDTO.NotifyButton(booleanValue, smallIconButton, smallIconButton2);
        }
        throw c.j("unsubscribeButton", "unsubscribeButton", reader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, ComparisonDTO.ComparisonProductsDTO.SmallButtonsDTO.NotifyButton value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("isSubscribed");
        this.booleanAdapter.mo44toJson(writer, (x) Boolean.valueOf(value.isSubscribed()));
        writer.w("subscribeButton");
        this.smallIconButtonAdapter.mo44toJson(writer, (x) value.getSubscribeButton());
        writer.w("unsubscribeButton");
        this.smallIconButtonAdapter.mo44toJson(writer, (x) value.getUnsubscribeButton());
        writer.p();
    }
}
