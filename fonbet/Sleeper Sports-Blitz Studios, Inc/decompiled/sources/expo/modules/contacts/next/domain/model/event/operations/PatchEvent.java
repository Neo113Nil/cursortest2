package expo.modules.contacts.next.domain.model.event.operations;

import android.content.ContentProviderOperation;
import android.content.ContentValues;
import com.google.firebase.messaging.Constants;
import expo.modules.contacts.Columns;
import expo.modules.contacts.next.domain.model.Updatable;
import expo.modules.contacts.next.domain.model.event.EventLabel;
import expo.modules.contacts.next.domain.model.event.EventModel;
import expo.modules.contacts.next.domain.wrappers.ContactDate;
import expo.modules.kotlin.types.ValueOrUndefined;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PatchEvent.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B1\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0006¢\u0006\u0004\b\n\u0010\u000bR\u0016\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\f\u0010\rR\u0014\u0010\u000f\u001a\u00020\u0010X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lexpo/modules/contacts/next/domain/model/event/operations/PatchEvent;", "Lexpo/modules/contacts/next/domain/model/event/EventModel;", "Lexpo/modules/contacts/next/domain/model/Updatable$Data;", "dataId", "Lexpo/modules/contacts/next/domain/wrappers/DataId;", "startDate", "Lexpo/modules/kotlin/types/ValueOrUndefined;", "Lexpo/modules/contacts/next/domain/wrappers/ContactDate;", Constants.ScionAnalytics.PARAM_LABEL, "Lexpo/modules/contacts/next/domain/model/event/EventLabel;", "<init>", "(Ljava/lang/String;Lexpo/modules/kotlin/types/ValueOrUndefined;Lexpo/modules/kotlin/types/ValueOrUndefined;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "getDataId-sXKVoX8", "()Ljava/lang/String;", "Ljava/lang/String;", "contentValues", "Landroid/content/ContentValues;", "getContentValues", "()Landroid/content/ContentValues;", "expo-contacts_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class PatchEvent extends EventModel implements Updatable.Data {
    private final ContentValues contentValues;
    private final String dataId;

    public /* synthetic */ PatchEvent(String str, ValueOrUndefined valueOrUndefined, ValueOrUndefined valueOrUndefined2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, valueOrUndefined, valueOrUndefined2);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ PatchEvent(String str, ValueOrUndefined valueOrUndefined, ValueOrUndefined valueOrUndefined2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, valueOrUndefined, valueOrUndefined2, null);
        if ((i & 2) != 0) {
            ValueOrUndefined.Companion companion = ValueOrUndefined.INSTANCE;
            ValueOrUndefined.Undefined undefined = ValueOrUndefined.Undefined.INSTANCE;
            Intrinsics.checkNotNull(undefined, "null cannot be cast to non-null type expo.modules.kotlin.types.ValueOrUndefined<T of expo.modules.kotlin.types.ValueOrUndefined.Companion.getUndefined>");
            valueOrUndefined = undefined;
        }
        if ((i & 4) != 0) {
            ValueOrUndefined.Companion companion2 = ValueOrUndefined.INSTANCE;
            ValueOrUndefined.Undefined undefined2 = ValueOrUndefined.Undefined.INSTANCE;
            Intrinsics.checkNotNull(undefined2, "null cannot be cast to non-null type expo.modules.kotlin.types.ValueOrUndefined<T of expo.modules.kotlin.types.ValueOrUndefined.Companion.getUndefined>");
            valueOrUndefined2 = undefined2;
        }
    }

    @Override // expo.modules.contacts.next.domain.model.Updatable.Data, expo.modules.contacts.next.domain.model.Updatable
    public ContentProviderOperation toUpdateOperation() {
        return Updatable.Data.DefaultImpls.toUpdateOperation(this);
    }

    @Override // expo.modules.contacts.next.domain.model.Updatable.Data, expo.modules.contacts.next.domain.model.Extractable.Data
    /* renamed from: getDataId-sXKVoX8, reason: from getter */
    public String getDataId() {
        return this.dataId;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private PatchEvent(String dataId, ValueOrUndefined<ContactDate> startDate, ValueOrUndefined<EventLabel> label) {
        super(r0, r2 == null ? new EventLabel.Custom("other") : r2, null);
        Intrinsics.checkNotNullParameter(dataId, "dataId");
        Intrinsics.checkNotNullParameter(startDate, "startDate");
        Intrinsics.checkNotNullParameter(label, "label");
        ContactDate optional = startDate.getOptional();
        String m11730unboximpl = optional != null ? optional.m11730unboximpl() : null;
        EventLabel.Custom optional2 = label.getOptional();
        this.dataId = dataId;
        ContentValues contentValues = new ContentValues();
        if (!startDate.isUndefined()) {
            ContactDate optional3 = startDate.getOptional();
            String m11730unboximpl2 = optional3 != null ? optional3.m11730unboximpl() : null;
            contentValues.put(Columns.DATA, m11730unboximpl2 == null ? null : m11730unboximpl2);
        }
        if (!label.isUndefined()) {
            EventLabel optional4 = label.getOptional();
            contentValues.put(Columns.TYPE, optional4 != null ? Integer.valueOf(optional4.getType()) : null);
            EventLabel optional5 = label.getOptional();
            contentValues.put(Columns.LABEL, optional5 != null ? optional5.getLabel() : null);
        }
        this.contentValues = contentValues;
    }

    @Override // expo.modules.contacts.next.domain.model.event.EventModel, expo.modules.contacts.next.domain.model.Updatable
    public ContentValues getContentValues() {
        return this.contentValues;
    }
}
