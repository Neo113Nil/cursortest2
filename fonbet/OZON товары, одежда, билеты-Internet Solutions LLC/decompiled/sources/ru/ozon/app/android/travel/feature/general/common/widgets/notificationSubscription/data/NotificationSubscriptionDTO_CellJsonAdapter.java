package ru.ozon.app.android.travel.feature.general.common.widgets.notificationSubscription.data;

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
import ru.ozon.app.android.travel.feature.general.common.widgets.notificationSubscription.data.NotificationSubscriptionDTO;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.data.selectionControls.checkbox.CheckBoxDTO;

@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0019R\u001a\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0019¨\u0006\u001e"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/notificationSubscription/data/NotificationSubscriptionDTO_CellJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/travel/feature/general/common/widgets/notificationSubscription/data/NotificationSubscriptionDTO$Cell;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/travel/feature/general/common/widgets/notificationSubscription/data/NotificationSubscriptionDTO$Cell;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/travel/feature/general/common/widgets/notificationSubscription/data/NotificationSubscriptionDTO$Cell;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "Lru/ozon/uni/atoms/data/selectionControls/checkbox/CheckBoxDTO;", "checkBoxDTOAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/travel/feature/general/common/widgets/notificationSubscription/data/NotificationSubscriptionDTO$TextWrapper;", "textWrapperAdapter", "Lru/ozon/uni/atoms/data/controls/CommonControlSettings;", "commonControlSettingsAdapter", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class NotificationSubscriptionDTO_CellJsonAdapter extends JsonAdapter<NotificationSubscriptionDTO.Cell> {
    public static final int $stable = 8;

    @NotNull
    private final JsonAdapter<CheckBoxDTO> checkBoxDTOAdapter;

    @NotNull
    private final JsonAdapter<CommonControlSettings> commonControlSettingsAdapter;

    @NotNull
    private final n.a options;

    @NotNull
    private final JsonAdapter<NotificationSubscriptionDTO.TextWrapper> textWrapperAdapter;

    public NotificationSubscriptionDTO_CellJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.options = n.a.C0918a.a("checkbox", "textWrapper", "settings");
        M m11 = M.f71699a;
        this.checkBoxDTOAdapter = moshi.f(CheckBoxDTO.class, m11, "checkbox");
        this.textWrapperAdapter = moshi.f(NotificationSubscriptionDTO.TextWrapper.class, m11, "textWrapper");
        this.commonControlSettingsAdapter = moshi.f(CommonControlSettings.class, m11, "settings");
    }

    @NotNull
    public String toString() {
        return b.c(54, "GeneratedJsonAdapter(NotificationSubscriptionDTO.Cell)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public NotificationSubscriptionDTO.Cell fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        CheckBoxDTO checkBoxDTO = null;
        NotificationSubscriptionDTO.TextWrapper textWrapper = null;
        CommonControlSettings commonControlSettings = null;
        while (reader.hasNext()) {
            int v11 = reader.v(this.options);
            if (v11 == -1) {
                reader.y();
                reader.skipValue();
            } else if (v11 == 0) {
                checkBoxDTO = this.checkBoxDTOAdapter.fromJson(reader);
                if (checkBoxDTO == null) {
                    throw c.q("checkbox", "checkbox", reader);
                }
            } else if (v11 == 1) {
                textWrapper = this.textWrapperAdapter.fromJson(reader);
                if (textWrapper == null) {
                    throw c.q("textWrapper", "textWrapper", reader);
                }
            } else if (v11 == 2 && (commonControlSettings = this.commonControlSettingsAdapter.fromJson(reader)) == null) {
                throw c.q("settings", "settings", reader);
            }
        }
        reader.endObject();
        if (checkBoxDTO == null) {
            throw c.j("checkbox", "checkbox", reader);
        }
        if (textWrapper == null) {
            throw c.j("textWrapper", "textWrapper", reader);
        }
        if (commonControlSettings != null) {
            return new NotificationSubscriptionDTO.Cell(checkBoxDTO, textWrapper, commonControlSettings);
        }
        throw c.j("settings", "settings", reader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, NotificationSubscriptionDTO.Cell value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("checkbox");
        this.checkBoxDTOAdapter.mo44toJson(writer, (x) value.getCheckbox());
        writer.w("textWrapper");
        this.textWrapperAdapter.mo44toJson(writer, (x) value.getTextWrapper());
        writer.w("settings");
        this.commonControlSettingsAdapter.mo44toJson(writer, (x) value.getSettings());
        writer.p();
    }
}
