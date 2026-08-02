package expo.modules.contacts.next.domain.query;

import android.database.Cursor;
import androidx.exifinterface.media.ExifInterface;
import expo.modules.contacts.Columns;
import expo.modules.contacts.next.domain.model.Extractable;
import expo.modules.contacts.next.domain.model.ExtractableField;
import expo.modules.contacts.next.domain.model.contact.ExistingContact;
import expo.modules.contacts.next.domain.wrappers.ContactId;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

/* compiled from: QueryAggregator.kt */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB\u0019\u0012\u0010\u0010\u0002\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\bJ\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\bJ\u000e\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018J\u000e\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018R\u0018\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\t0\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\n\u001a\u0012\u0012\u0004\u0012\u00020\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\r0\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00100\u000fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001b"}, d2 = {"Lexpo/modules/contacts/next/domain/query/QueryAggregator;", "", "extractableFields", "", "Lexpo/modules/contacts/next/domain/model/ExtractableField;", "<init>", "(Ljava/util/Collection;)V", "contactsExtractableFields", "", "Lexpo/modules/contacts/next/domain/model/ExtractableField$Contacts;", "dataExtractorsByMimeType", "", "", "Lexpo/modules/contacts/next/domain/model/ExtractableField$Data;", "contactBuilders", "", "Lexpo/modules/contacts/next/domain/query/ContactModelBuilder;", "getContactIdsFromBuilders", "Lexpo/modules/contacts/next/domain/wrappers/ContactId;", "buildContacts", "Lexpo/modules/contacts/next/domain/model/contact/ExistingContact;", "aggregateDataRow", "", "cursor", "Landroid/database/Cursor;", "aggregateContactsRow", "Companion", "expo-contacts_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class QueryAggregator {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Map<String, ContactModelBuilder> contactBuilders;
    private final List<ExtractableField.Contacts<?>> contactsExtractableFields;
    private final Map<String, ExtractableField.Data<?>> dataExtractorsByMimeType;

    public QueryAggregator(Collection<? extends ExtractableField<?>> extractableFields) {
        Intrinsics.checkNotNullParameter(extractableFields, "extractableFields");
        Collection<? extends ExtractableField<?>> collection = extractableFields;
        ArrayList arrayList = new ArrayList();
        for (Object obj : collection) {
            if (obj instanceof ExtractableField.Contacts) {
                arrayList.add(obj);
            }
        }
        this.contactsExtractableFields = arrayList;
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : collection) {
            if (obj2 instanceof ExtractableField.Data) {
                arrayList2.add(obj2);
            }
        }
        ArrayList arrayList3 = arrayList2;
        LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(arrayList3, 10)), 16));
        for (Object obj3 : arrayList3) {
            linkedHashMap.put(((ExtractableField.Data) obj3).getMimeType(), obj3);
        }
        this.dataExtractorsByMimeType = linkedHashMap;
        this.contactBuilders = new LinkedHashMap();
    }

    public final List<ContactId> getContactIdsFromBuilders() {
        Set<String> keySet = this.contactBuilders.keySet();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(keySet, 10));
        Iterator<T> it = keySet.iterator();
        while (it.hasNext()) {
            arrayList.add(ContactId.m11731boximpl(ContactId.m11732constructorimpl((String) it.next())));
        }
        return arrayList;
    }

    public final List<ExistingContact> buildContacts() {
        Collection<ContactModelBuilder> values = this.contactBuilders.values();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(values, 10));
        Iterator<T> it = values.iterator();
        while (it.hasNext()) {
            arrayList.add(((ContactModelBuilder) it.next()).build());
        }
        return arrayList;
    }

    public final void aggregateDataRow(Cursor cursor) {
        Intrinsics.checkNotNullParameter(cursor, "cursor");
        String string = cursor.getString(cursor.getColumnIndexOrThrow("contact_id"));
        String string2 = cursor.getString(cursor.getColumnIndexOrThrow(Columns.MIMETYPE));
        Map<String, ContactModelBuilder> map = this.contactBuilders;
        ContactModelBuilder contactModelBuilder = map.get(string);
        if (contactModelBuilder == null) {
            Intrinsics.checkNotNull(string);
            contactModelBuilder = new ContactModelBuilder(ContactId.m11732constructorimpl(string), null);
            map.put(string, contactModelBuilder);
        }
        ContactModelBuilder contactModelBuilder2 = contactModelBuilder;
        ExtractableField.Data<?> data = this.dataExtractorsByMimeType.get(string2);
        Extractable.Data data2 = data != null ? (Extractable.Data) data.extract(cursor) : null;
        if (data2 != null) {
            contactModelBuilder2.addModel(data2);
        }
    }

    public final void aggregateContactsRow(Cursor cursor) {
        Intrinsics.checkNotNullParameter(cursor, "cursor");
        String string = cursor.getString(cursor.getColumnIndexOrThrow("_id"));
        Map<String, ContactModelBuilder> map = this.contactBuilders;
        ContactModelBuilder contactModelBuilder = map.get(string);
        if (contactModelBuilder == null) {
            Intrinsics.checkNotNull(string);
            contactModelBuilder = new ContactModelBuilder(ContactId.m11732constructorimpl(string), null);
            map.put(string, contactModelBuilder);
        }
        ContactModelBuilder contactModelBuilder2 = contactModelBuilder;
        Iterator<T> it = this.contactsExtractableFields.iterator();
        while (it.hasNext()) {
            contactModelBuilder2.addModel(((ExtractableField.Contacts) it.next()).extract(cursor));
        }
    }

    /* compiled from: QueryAggregator.kt */
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J,\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00060\u0005\"\b\b\u0000\u0010\u0006*\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u0002H\u00060\u000bJ-\u0010\f\u001a\u0004\u0018\u0001H\u0006\"\b\b\u0000\u0010\u0006*\u00020\r2\u0006\u0010\b\u001a\u00020\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u0002H\u00060\u000e¢\u0006\u0002\u0010\u000f¨\u0006\u0010"}, d2 = {"Lexpo/modules/contacts/next/domain/query/QueryAggregator$Companion;", "", "<init>", "()V", "aggregateOneField", "", ExifInterface.GPS_DIRECTION_TRUE, "Lexpo/modules/contacts/next/domain/model/Extractable$Data;", "cursor", "Landroid/database/Cursor;", "extractor", "Lexpo/modules/contacts/next/domain/model/ExtractableField$Data;", "aggregateOneFieldFromContacts", "Lexpo/modules/contacts/next/domain/model/Extractable;", "Lexpo/modules/contacts/next/domain/model/ExtractableField$Contacts;", "(Landroid/database/Cursor;Lexpo/modules/contacts/next/domain/model/ExtractableField$Contacts;)Lexpo/modules/contacts/next/domain/model/Extractable;", "expo-contacts_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final <T extends Extractable.Data> List<T> aggregateOneField(Cursor cursor, ExtractableField.Data<T> extractor) {
            Intrinsics.checkNotNullParameter(cursor, "cursor");
            Intrinsics.checkNotNullParameter(extractor, "extractor");
            List createListBuilder = CollectionsKt.createListBuilder();
            while (cursor.moveToNext()) {
                createListBuilder.add(extractor.extract(cursor));
            }
            return CollectionsKt.build(createListBuilder);
        }

        public final <T extends Extractable> T aggregateOneFieldFromContacts(Cursor cursor, ExtractableField.Contacts<T> extractor) {
            Intrinsics.checkNotNullParameter(cursor, "cursor");
            Intrinsics.checkNotNullParameter(extractor, "extractor");
            if (cursor.moveToFirst()) {
                return extractor.extract(cursor);
            }
            return null;
        }
    }
}
