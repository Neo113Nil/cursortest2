package expo.modules.contacts.next.domain.model.event;

import android.content.ContentValues;
import com.google.firebase.messaging.Constants;
import expo.modules.contacts.Columns;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: EventModel.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\u000eX\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\tR\u0014\u0010\u0010\u001a\u00020\u0011X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lexpo/modules/contacts/next/domain/model/event/EventModel;", "", "startDate", "Lexpo/modules/contacts/next/domain/wrappers/ContactDate;", Constants.ScionAnalytics.PARAM_LABEL, "Lexpo/modules/contacts/next/domain/model/event/EventLabel;", "<init>", "(Ljava/lang/String;Lexpo/modules/contacts/next/domain/model/event/EventLabel;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "getStartDate-GJoJq_E", "()Ljava/lang/String;", "Ljava/lang/String;", "getLabel", "()Lexpo/modules/contacts/next/domain/model/event/EventLabel;", "mimeType", "", "getMimeType", "contentValues", "Landroid/content/ContentValues;", "getContentValues", "()Landroid/content/ContentValues;", "expo-contacts_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public abstract class EventModel {
    private final ContentValues contentValues;
    private final EventLabel label;
    private final String mimeType;
    private final String startDate;

    public /* synthetic */ EventModel(String str, EventLabel eventLabel, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, eventLabel);
    }

    private EventModel(String str, EventLabel label) {
        Intrinsics.checkNotNullParameter(label, "label");
        this.startDate = str;
        this.label = label;
        this.mimeType = "vnd.android.cursor.item/contact_event";
        ContentValues contentValues = new ContentValues();
        contentValues.put(Columns.MIMETYPE, "vnd.android.cursor.item/contact_event");
        contentValues.put(Columns.DATA, str == null ? null : str);
        contentValues.put(Columns.TYPE, Integer.valueOf(label.getType()));
        contentValues.put(Columns.LABEL, label.getLabel());
        this.contentValues = contentValues;
    }

    /* renamed from: getStartDate-GJoJq_E, reason: not valid java name and from getter */
    public final String getStartDate() {
        return this.startDate;
    }

    public final EventLabel getLabel() {
        return this.label;
    }

    public final String getMimeType() {
        return this.mimeType;
    }

    public ContentValues getContentValues() {
        return this.contentValues;
    }
}
