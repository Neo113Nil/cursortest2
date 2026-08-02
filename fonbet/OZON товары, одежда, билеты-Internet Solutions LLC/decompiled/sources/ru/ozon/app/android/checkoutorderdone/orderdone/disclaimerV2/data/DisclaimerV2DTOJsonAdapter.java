package ru.ozon.app.android.checkoutorderdone.orderdone.disclaimerV2.data;

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
import ru.ozon.app.android.cart.common.dynamicElement.DynamicElementDTO;
import ru.ozon.app.android.cscore.padding.PaddingCompose;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.TestInfo;
import ru.ozon.uni.atoms.data.disclaimer.DisclaimerDTO;

@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0019R\u001c\u0010\u001d\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001c0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0019R\u001a\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u0019¨\u0006 "}, d2 = {"Lru/ozon/app/android/checkoutorderdone/orderdone/disclaimerV2/data/DisclaimerV2DTOJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/checkoutorderdone/orderdone/disclaimerV2/data/DisclaimerV2DTO;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/checkoutorderdone/orderdone/disclaimerV2/data/DisclaimerV2DTO;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/checkoutorderdone/orderdone/disclaimerV2/data/DisclaimerV2DTO;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "Lru/ozon/app/android/checkoutorderdone/orderdone/disclaimerV2/data/Timer;", "nullableTimerAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/uni/atoms/data/disclaimer/DisclaimerDTO;", "disclaimerDTOAdapter", "Lru/ozon/uni/atoms/data/TestInfo;", "nullableTestInfoAdapter", "Lru/ozon/app/android/cscore/padding/PaddingCompose;", "paddingComposeAdapter", "orderdone_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class DisclaimerV2DTOJsonAdapter extends JsonAdapter<DisclaimerV2DTO> {
    public static final int $stable = 8;

    @NotNull
    private final JsonAdapter<DisclaimerDTO> disclaimerDTOAdapter;

    @NotNull
    private final JsonAdapter<TestInfo> nullableTestInfoAdapter;

    @NotNull
    private final JsonAdapter<Timer> nullableTimerAdapter;

    @NotNull
    private final n.a options;

    @NotNull
    private final JsonAdapter<PaddingCompose> paddingComposeAdapter;

    public DisclaimerV2DTOJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.options = n.a.C0918a.a(DynamicElementDTO.TIMER, SelectionItemFormDTO.DISCLAIMER_FIELD_NAME, "testInfo", "paddings");
        M m11 = M.f71699a;
        this.nullableTimerAdapter = moshi.f(Timer.class, m11, DynamicElementDTO.TIMER);
        this.disclaimerDTOAdapter = moshi.f(DisclaimerDTO.class, m11, SelectionItemFormDTO.DISCLAIMER_FIELD_NAME);
        this.nullableTestInfoAdapter = moshi.f(TestInfo.class, m11, "testInfo");
        this.paddingComposeAdapter = moshi.f(PaddingCompose.class, m11, "paddings");
    }

    @NotNull
    public String toString() {
        return b.c(37, "GeneratedJsonAdapter(DisclaimerV2DTO)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public DisclaimerV2DTO fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        Timer timer = null;
        DisclaimerDTO disclaimerDTO = null;
        TestInfo testInfo = null;
        PaddingCompose paddingCompose = null;
        while (reader.hasNext()) {
            int v11 = reader.v(this.options);
            if (v11 == -1) {
                reader.y();
                reader.skipValue();
            } else if (v11 == 0) {
                timer = this.nullableTimerAdapter.fromJson(reader);
            } else if (v11 == 1) {
                disclaimerDTO = this.disclaimerDTOAdapter.fromJson(reader);
                if (disclaimerDTO == null) {
                    throw c.q(SelectionItemFormDTO.DISCLAIMER_FIELD_NAME, SelectionItemFormDTO.DISCLAIMER_FIELD_NAME, reader);
                }
            } else if (v11 == 2) {
                testInfo = this.nullableTestInfoAdapter.fromJson(reader);
            } else if (v11 == 3 && (paddingCompose = this.paddingComposeAdapter.fromJson(reader)) == null) {
                throw c.q("paddings", "paddings", reader);
            }
        }
        reader.endObject();
        if (disclaimerDTO == null) {
            throw c.j(SelectionItemFormDTO.DISCLAIMER_FIELD_NAME, SelectionItemFormDTO.DISCLAIMER_FIELD_NAME, reader);
        }
        if (paddingCompose != null) {
            return new DisclaimerV2DTO(timer, disclaimerDTO, testInfo, paddingCompose);
        }
        throw c.j("paddings", "paddings", reader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, DisclaimerV2DTO value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w(DynamicElementDTO.TIMER);
        this.nullableTimerAdapter.mo44toJson(writer, (x) value.getTimer());
        writer.w(SelectionItemFormDTO.DISCLAIMER_FIELD_NAME);
        this.disclaimerDTOAdapter.mo44toJson(writer, (x) value.getDisclaimer());
        writer.w("testInfo");
        this.nullableTestInfoAdapter.mo44toJson(writer, (x) value.getTestInfo());
        writer.w("paddings");
        this.paddingComposeAdapter.mo44toJson(writer, (x) value.getPaddings());
        writer.p();
    }
}
