package expo.modules.contacts.next.mappers;

import androidx.exifinterface.media.ExifInterface;
import expo.modules.contacts.next.domain.model.Appendable;
import expo.modules.contacts.next.domain.model.ExtractableField;
import expo.modules.contacts.next.domain.model.Updatable;
import expo.modules.contacts.next.domain.model.contact.ContactPatch;
import expo.modules.contacts.next.records.NewRecord;
import expo.modules.contacts.next.records.PatchRecord;
import expo.modules.kotlin.types.Either;
import expo.modules.kotlin.types.ValueOrUndefined;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;

/* compiled from: ContactPatchBuilder.kt */
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0006\u0010\u001d\u001a\u00020\u001eJ\u000e\u0010\u001f\u001a\u00020\u00002\u0006\u0010 \u001a\u00020\u0017J\u000e\u0010!\u001a\u00020\u00002\u0006\u0010\"\u001a\u00020\u001bJO\u0010#\u001a\u00020\u0000\"\n\b\u0000\u0010$\u0018\u0001*\u00020%\"\n\b\u0001\u0010&\u0018\u0001*\u00020'2 \u0010(\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H$\u0012\u0004\u0012\u0002H&0+\u0018\u00010*0)2\n\u0010,\u001a\u0006\u0012\u0002\b\u00030\u0012H\u0086\bR\u0013\u0010\u0002\u001a\u00020\u0003¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u00020\u0005¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\r\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u001b\u0010\u0010\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00120\u0011¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001b0\u0016¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0019¨\u0006-"}, d2 = {"Lexpo/modules/contacts/next/mappers/ContactPatchBuilder;", "", "contactId", "Lexpo/modules/contacts/next/domain/wrappers/ContactId;", "rawContactId", "Lexpo/modules/contacts/next/domain/wrappers/RawContactId;", "mapper", "Lexpo/modules/contacts/next/mappers/ContactRecordDomainMapper;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lexpo/modules/contacts/next/mappers/ContactRecordDomainMapper;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "getContactId-S9XCBSM", "()Ljava/lang/String;", "Ljava/lang/String;", "getRawContactId-WW_a-ig", "getMapper", "()Lexpo/modules/contacts/next/mappers/ContactRecordDomainMapper;", "modifiedFields", "", "Lexpo/modules/contacts/next/domain/model/ExtractableField$Data;", "getModifiedFields", "()Ljava/util/Set;", "toUpdate", "", "Lexpo/modules/contacts/next/domain/model/Updatable;", "getToUpdate", "()Ljava/util/List;", "toAppend", "Lexpo/modules/contacts/next/domain/model/Appendable;", "getToAppend", "build", "Lexpo/modules/contacts/next/domain/model/contact/ContactPatch;", "withUpdatable", "updatable", "withAppendable", "appendable", "withListProperty", ExifInterface.GPS_DIRECTION_TRUE, "Lexpo/modules/contacts/next/records/PatchRecord;", "R", "Lexpo/modules/contacts/next/records/NewRecord;", "property", "Lexpo/modules/kotlin/types/ValueOrUndefined;", "", "Lexpo/modules/kotlin/types/Either;", "field", "expo-contacts_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class ContactPatchBuilder {
    private final String contactId;
    private final ContactRecordDomainMapper mapper;
    private final Set<ExtractableField.Data<?>> modifiedFields;
    private final String rawContactId;
    private final List<Appendable> toAppend;
    private final List<Updatable> toUpdate;

    public /* synthetic */ ContactPatchBuilder(String str, String str2, ContactRecordDomainMapper contactRecordDomainMapper, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, contactRecordDomainMapper);
    }

    private ContactPatchBuilder(String contactId, String rawContactId, ContactRecordDomainMapper mapper) {
        Intrinsics.checkNotNullParameter(contactId, "contactId");
        Intrinsics.checkNotNullParameter(rawContactId, "rawContactId");
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        this.contactId = contactId;
        this.rawContactId = rawContactId;
        this.mapper = mapper;
        this.modifiedFields = new LinkedHashSet();
        this.toUpdate = new ArrayList();
        this.toAppend = new ArrayList();
    }

    /* renamed from: getContactId-S9XCBSM, reason: not valid java name and from getter */
    public final String getContactId() {
        return this.contactId;
    }

    /* renamed from: getRawContactId-WW_a-ig, reason: not valid java name and from getter */
    public final String getRawContactId() {
        return this.rawContactId;
    }

    public final ContactRecordDomainMapper getMapper() {
        return this.mapper;
    }

    public final Set<ExtractableField.Data<?>> getModifiedFields() {
        return this.modifiedFields;
    }

    public final List<Updatable> getToUpdate() {
        return this.toUpdate;
    }

    public final List<Appendable> getToAppend() {
        return this.toAppend;
    }

    public final ContactPatch build() {
        return new ContactPatch(this.contactId, this.modifiedFields, this.toAppend, this.toUpdate, null);
    }

    public final ContactPatchBuilder withUpdatable(Updatable updatable) {
        Intrinsics.checkNotNullParameter(updatable, "updatable");
        this.toUpdate.add(updatable);
        return this;
    }

    public final ContactPatchBuilder withAppendable(Appendable appendable) {
        Intrinsics.checkNotNullParameter(appendable, "appendable");
        this.toAppend.add(appendable);
        return this;
    }

    public final /* synthetic */ <T extends PatchRecord, R extends NewRecord> ContactPatchBuilder withListProperty(ValueOrUndefined<List<Either<T, R>>> property, ExtractableField.Data<?> field) {
        Intrinsics.checkNotNullParameter(property, "property");
        Intrinsics.checkNotNullParameter(field, "field");
        if (!property.isUndefined() && property.getOptional() != null) {
            getModifiedFields().add(field);
            List<Either<T, R>> optional = property.getOptional();
            if (optional == null) {
                optional = CollectionsKt.emptyList();
            }
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : optional) {
                Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
                if (((Either) obj).isFirstType(Reflection.getOrCreateKotlinClass(Object.class))) {
                    arrayList.add(obj);
                } else {
                    arrayList2.add(obj);
                }
            }
            Pair pair = new Pair(arrayList, arrayList2);
            List list = (List) pair.component1();
            List list2 = (List) pair.component2();
            List<Either> list3 = list;
            ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list3, 10));
            for (Either either : list3) {
                Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
                arrayList3.add((PatchRecord) either.getFirstType(Reflection.getOrCreateKotlinClass(Object.class)));
            }
            ArrayList arrayList4 = arrayList3;
            ArrayList arrayList5 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList4, 10));
            Iterator it = arrayList4.iterator();
            while (it.hasNext()) {
                arrayList5.add(getMapper().toPatchable((PatchRecord) it.next()));
            }
            Iterator it2 = arrayList5.iterator();
            while (it2.hasNext()) {
                getToUpdate().add((Updatable) it2.next());
            }
            List<Either> list4 = list2;
            ArrayList arrayList6 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list4, 10));
            for (Either either2 : list4) {
                Intrinsics.reifiedOperationMarker(4, "R");
                arrayList6.add((NewRecord) either2.getSecondType(Reflection.getOrCreateKotlinClass(Object.class)));
            }
            ArrayList arrayList7 = arrayList6;
            ArrayList arrayList8 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList7, 10));
            Iterator it3 = arrayList7.iterator();
            while (it3.hasNext()) {
                arrayList8.add(getMapper().m11767toAppendableMYK5hZQ((NewRecord) it3.next(), getRawContactId()));
            }
            Iterator it4 = arrayList8.iterator();
            while (it4.hasNext()) {
                getToAppend().add((Appendable) it4.next());
            }
        }
        return this;
    }
}
