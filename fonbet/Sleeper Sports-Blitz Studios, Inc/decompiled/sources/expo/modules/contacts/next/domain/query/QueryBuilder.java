package expo.modules.contacts.next.domain.query;

import expo.modules.contacts.Columns;
import expo.modules.contacts.next.domain.model.ExtractableField;
import expo.modules.contacts.next.domain.wrappers.ContactId;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: QueryBuilder.kt */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0019\u0012\u0010\u0010\u0002\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r¢\u0006\u0002\u0010\u000fJ\u0011\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000e0\r¢\u0006\u0002\u0010\u000fJ\u001a\u0010\u0011\u001a\u0004\u0018\u00010\u000e2\u0010\b\u0002\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0003J#\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\u0010\b\u0002\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0003¢\u0006\u0002\u0010\u0015R\u0018\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\t0\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0018\u0010\n\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000b0\bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lexpo/modules/contacts/next/domain/query/QueryBuilder;", "", "extractableFields", "", "Lexpo/modules/contacts/next/domain/model/ExtractableField;", "<init>", "(Ljava/util/Collection;)V", "dataExtractableFields", "", "Lexpo/modules/contacts/next/domain/model/ExtractableField$Data;", "contactsExtractableFields", "Lexpo/modules/contacts/next/domain/model/ExtractableField$Contacts;", "buildContactsProjection", "", "", "()[Ljava/lang/String;", "buildDataProjection", "buildSelection", "contactIds", "Lexpo/modules/contacts/next/domain/wrappers/ContactId;", "buildSelectionArgs", "(Ljava/util/Collection;)[Ljava/lang/String;", "expo-contacts_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class QueryBuilder {
    private final List<ExtractableField.Contacts<?>> contactsExtractableFields;
    private final List<ExtractableField.Data<?>> dataExtractableFields;

    public QueryBuilder(Collection<? extends ExtractableField<?>> extractableFields) {
        Intrinsics.checkNotNullParameter(extractableFields, "extractableFields");
        Collection<? extends ExtractableField<?>> collection = extractableFields;
        ArrayList arrayList = new ArrayList();
        for (Object obj : collection) {
            if (obj instanceof ExtractableField.Data) {
                arrayList.add(obj);
            }
        }
        this.dataExtractableFields = arrayList;
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : collection) {
            if (obj2 instanceof ExtractableField.Contacts) {
                arrayList2.add(obj2);
            }
        }
        this.contactsExtractableFields = arrayList2;
    }

    public final String[] buildContactsProjection() {
        List listOf = CollectionsKt.listOf("_id");
        List<ExtractableField.Contacts<?>> list = this.contactsExtractableFields;
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            CollectionsKt.addAll(arrayList, ArraysKt.toList(((ExtractableField.Contacts) it.next()).getProjection()));
        }
        return (String[]) SetsKt.plus(CollectionsKt.toSet(arrayList), (Iterable) listOf).toArray(new String[0]);
    }

    public final String[] buildDataProjection() {
        List listOf = CollectionsKt.listOf((Object[]) new String[]{"contact_id", "_id", Columns.MIMETYPE});
        List<ExtractableField.Data<?>> list = this.dataExtractableFields;
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            CollectionsKt.addAll(arrayList, ArraysKt.toList(((ExtractableField.Data) it.next()).getProjection()));
        }
        return (String[]) SetsKt.plus(CollectionsKt.toSet(arrayList), (Iterable) listOf).toArray(new String[0]);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ String buildSelection$default(QueryBuilder queryBuilder, Collection collection, int i, Object obj) {
        if ((i & 1) != 0) {
            collection = null;
        }
        return queryBuilder.buildSelection(collection);
    }

    public final String buildSelection(Collection<ContactId> contactIds) {
        ArrayList arrayList = new ArrayList();
        List<ExtractableField.Data<?>> list = this.dataExtractableFields;
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList2.add(((ExtractableField.Data) it.next()).getMimeType());
        }
        Set set = CollectionsKt.toSet(arrayList2);
        if (!set.isEmpty()) {
            arrayList.add("mimetype IN (" + CollectionsKt.joinToString$default(set, ", ", null, null, 0, null, new Function1() { // from class: expo.modules.contacts.next.domain.query.QueryBuilder$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    CharSequence buildSelection$lambda$3;
                    buildSelection$lambda$3 = QueryBuilder.buildSelection$lambda$3((String) obj);
                    return buildSelection$lambda$3;
                }
            }, 30, null) + ")");
        }
        if (contactIds != null) {
            arrayList.add("contact_id IN (" + CollectionsKt.joinToString$default(contactIds, ", ", null, null, 0, null, new Function1<ContactId, CharSequence>() { // from class: expo.modules.contacts.next.domain.query.QueryBuilder$buildSelection$idPlaceholders$1
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ CharSequence invoke(ContactId contactId) {
                    return m11720invokekDnipiQ(contactId.m11737unboximpl());
                }

                /* renamed from: invoke-kDnipiQ, reason: not valid java name */
                public final CharSequence m11720invokekDnipiQ(String it2) {
                    Intrinsics.checkNotNullParameter(it2, "it");
                    return "?";
                }
            }, 30, null) + ")");
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return CollectionsKt.joinToString$default(arrayList, " AND ", null, null, 0, null, new Function1() { // from class: expo.modules.contacts.next.domain.query.QueryBuilder$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                CharSequence buildSelection$lambda$4;
                buildSelection$lambda$4 = QueryBuilder.buildSelection$lambda$4((String) obj);
                return buildSelection$lambda$4;
            }
        }, 30, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence buildSelection$lambda$3(String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return "?";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence buildSelection$lambda$4(String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return "(" + it + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ String[] buildSelectionArgs$default(QueryBuilder queryBuilder, Collection collection, int i, Object obj) {
        if ((i & 1) != 0) {
            collection = null;
        }
        return queryBuilder.buildSelectionArgs(collection);
    }

    public final String[] buildSelectionArgs(Collection<ContactId> contactIds) {
        List<ExtractableField.Data<?>> list = this.dataExtractableFields;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((ExtractableField.Data) it.next()).getMimeType());
        }
        String[] strArr = (String[]) CollectionsKt.toSet(arrayList).toArray(new String[0]);
        if (contactIds == null || contactIds.isEmpty()) {
            return strArr;
        }
        Collection<ContactId> collection = contactIds;
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(collection, 10));
        Iterator<T> it2 = collection.iterator();
        while (it2.hasNext()) {
            arrayList2.add(((ContactId) it2.next()).m11737unboximpl());
        }
        return (String[]) ArraysKt.plus((Object[]) strArr, arrayList2.toArray(new String[0]));
    }
}
