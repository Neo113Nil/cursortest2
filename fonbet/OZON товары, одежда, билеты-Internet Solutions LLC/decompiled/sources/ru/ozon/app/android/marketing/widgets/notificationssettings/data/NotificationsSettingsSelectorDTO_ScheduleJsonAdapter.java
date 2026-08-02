package ru.ozon.app.android.marketing.widgets.notificationssettings.data;

import Ak.b;
import Y9.c;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.squareup.moshi.D;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.n;
import com.squareup.moshi.x;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.M;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.marketing.widgets.notificationssettings.data.NotificationsSettingsDTO;
import ru.ozon.app.android.marketing.widgets.notificationssettings.data.NotificationsSettingsSelectorDTO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;

@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0018R\u001c\u0010\u001c\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001b0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0018R \u0010\u001f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001e0\u001d0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u0018¨\u0006 "}, d2 = {"Lru/ozon/app/android/marketing/widgets/notificationssettings/data/NotificationsSettingsSelectorDTO_ScheduleJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/marketing/widgets/notificationssettings/data/NotificationsSettingsSelectorDTO$Schedule;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/marketing/widgets/notificationssettings/data/NotificationsSettingsSelectorDTO$Schedule;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/marketing/widgets/notificationssettings/data/NotificationsSettingsSelectorDTO$Schedule;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "stringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "longAdapter", "Lru/ozon/app/android/marketing/widgets/notificationssettings/data/NotificationsSettingsDTO$NotificationSource$Dialog;", "nullableDialogAdapter", "", "Lru/ozon/app/android/marketing/widgets/notificationssettings/data/NotificationsSettingsSelectorDTO$Schedule$Variant;", "listOfVariantAdapter", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class NotificationsSettingsSelectorDTO_ScheduleJsonAdapter extends JsonAdapter<NotificationsSettingsSelectorDTO.Schedule> {
    public static final int $stable = 8;

    @NotNull
    private final JsonAdapter<List<NotificationsSettingsSelectorDTO.Schedule.Variant>> listOfVariantAdapter;

    @NotNull
    private final JsonAdapter<Long> longAdapter;

    @NotNull
    private final JsonAdapter<NotificationsSettingsDTO.NotificationSource.Dialog> nullableDialogAdapter;

    @NotNull
    private final n.a options;

    @NotNull
    private final JsonAdapter<String> stringAdapter;

    public NotificationsSettingsSelectorDTO_ScheduleJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.options = n.a.C0918a.a(SelectionItemFormDTO.TITLE_FIELD_NAME, "type", "settingId", "commId", "dialog", "variants");
        M m11 = M.f71699a;
        this.stringAdapter = moshi.f(String.class, m11, SelectionItemFormDTO.TITLE_FIELD_NAME);
        this.longAdapter = moshi.f(Long.TYPE, m11, "settingId");
        this.nullableDialogAdapter = moshi.f(NotificationsSettingsDTO.NotificationSource.Dialog.class, m11, "dialog");
        this.listOfVariantAdapter = moshi.f(D.e(List.class, NotificationsSettingsSelectorDTO.Schedule.Variant.class), m11, "variants");
    }

    @NotNull
    public String toString() {
        return b.c(63, "GeneratedJsonAdapter(NotificationsSettingsSelectorDTO.Schedule)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public NotificationsSettingsSelectorDTO.Schedule fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        Long l11 = null;
        Long l12 = null;
        String str = null;
        String str2 = null;
        NotificationsSettingsDTO.NotificationSource.Dialog dialog = null;
        List<NotificationsSettingsSelectorDTO.Schedule.Variant> list = null;
        while (reader.hasNext()) {
            switch (reader.v(this.options)) {
                case -1:
                    reader.y();
                    reader.skipValue();
                    break;
                case 0:
                    str = this.stringAdapter.fromJson(reader);
                    if (str == null) {
                        throw c.q(SelectionItemFormDTO.TITLE_FIELD_NAME, SelectionItemFormDTO.TITLE_FIELD_NAME, reader);
                    }
                    break;
                case 1:
                    str2 = this.stringAdapter.fromJson(reader);
                    if (str2 == null) {
                        throw c.q("type", "type", reader);
                    }
                    break;
                case 2:
                    l11 = this.longAdapter.fromJson(reader);
                    if (l11 == null) {
                        throw c.q("settingId", "settingId", reader);
                    }
                    break;
                case 3:
                    l12 = this.longAdapter.fromJson(reader);
                    if (l12 == null) {
                        throw c.q("commId", "commId", reader);
                    }
                    break;
                case 4:
                    dialog = this.nullableDialogAdapter.fromJson(reader);
                    break;
                case 5:
                    list = this.listOfVariantAdapter.fromJson(reader);
                    if (list == null) {
                        throw c.q("variants", "variants", reader);
                    }
                    break;
            }
        }
        reader.endObject();
        Long l13 = l12;
        if (str == null) {
            throw c.j(SelectionItemFormDTO.TITLE_FIELD_NAME, SelectionItemFormDTO.TITLE_FIELD_NAME, reader);
        }
        if (str2 == null) {
            throw c.j("type", "type", reader);
        }
        if (l11 == null) {
            throw c.j("settingId", "settingId", reader);
        }
        long longValue = l11.longValue();
        if (l13 == null) {
            throw c.j("commId", "commId", reader);
        }
        long longValue2 = l13.longValue();
        if (list != null) {
            return new NotificationsSettingsSelectorDTO.Schedule(str, str2, longValue, longValue2, dialog, list);
        }
        throw c.j("variants", "variants", reader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, NotificationsSettingsSelectorDTO.Schedule value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w(SelectionItemFormDTO.TITLE_FIELD_NAME);
        this.stringAdapter.mo44toJson(writer, (x) value.getTitle());
        writer.w("type");
        this.stringAdapter.mo44toJson(writer, (x) value.getType());
        writer.w("settingId");
        this.longAdapter.mo44toJson(writer, (x) Long.valueOf(value.getSettingId()));
        writer.w("commId");
        this.longAdapter.mo44toJson(writer, (x) Long.valueOf(value.getCommId()));
        writer.w("dialog");
        this.nullableDialogAdapter.mo44toJson(writer, (x) value.getDialog());
        writer.w("variants");
        this.listOfVariantAdapter.mo44toJson(writer, (x) value.getVariants());
        writer.p();
    }
}
