package expo.modules.contacts.next.mappers;

import android.content.ContentValues;
import expo.modules.contacts.next.domain.model.Appendable;
import expo.modules.contacts.next.domain.model.Extractable;
import expo.modules.contacts.next.domain.model.ExtractableField;
import expo.modules.contacts.next.domain.model.Updatable;
import expo.modules.contacts.next.domain.model.contact.ContactPatch;
import expo.modules.contacts.next.domain.model.contact.ExistingContact;
import expo.modules.contacts.next.domain.model.contact.NewContact;
import expo.modules.contacts.next.domain.model.contact.UpdateContact;
import expo.modules.contacts.next.domain.model.email.EmailField;
import expo.modules.contacts.next.domain.model.email.operations.ExistingEmail;
import expo.modules.contacts.next.domain.model.event.EventField;
import expo.modules.contacts.next.domain.model.event.operations.ExistingEvent;
import expo.modules.contacts.next.domain.model.headers.DisplayNameField;
import expo.modules.contacts.next.domain.model.headers.PhotoThumbnailUriField;
import expo.modules.contacts.next.domain.model.headers.PhotoUriField;
import expo.modules.contacts.next.domain.model.headers.starred.ExistingStarred;
import expo.modules.contacts.next.domain.model.headers.starred.PatchStarred;
import expo.modules.contacts.next.domain.model.headers.starred.Starred;
import expo.modules.contacts.next.domain.model.headers.starred.StarredField;
import expo.modules.contacts.next.domain.model.nickname.NicknameField;
import expo.modules.contacts.next.domain.model.nickname.operations.ExistingNickname;
import expo.modules.contacts.next.domain.model.note.NoteField;
import expo.modules.contacts.next.domain.model.note.operations.AppendableNote;
import expo.modules.contacts.next.domain.model.note.operations.NewNote;
import expo.modules.contacts.next.domain.model.organization.OrganizationField;
import expo.modules.contacts.next.domain.model.organization.operations.NewOrganization;
import expo.modules.contacts.next.domain.model.phone.PhoneField;
import expo.modules.contacts.next.domain.model.phone.operations.ExistingPhone;
import expo.modules.contacts.next.domain.model.photo.operations.NewPhoto;
import expo.modules.contacts.next.domain.model.relationship.RelationField;
import expo.modules.contacts.next.domain.model.relationship.operations.ExistingRelation;
import expo.modules.contacts.next.domain.model.structuredname.StructuredNameField;
import expo.modules.contacts.next.domain.model.structuredpostal.StructuredPostalField;
import expo.modules.contacts.next.domain.model.structuredpostal.operations.ExistingStructuredPostal;
import expo.modules.contacts.next.domain.model.website.WebsiteField;
import expo.modules.contacts.next.domain.model.website.operations.ExistingWebsite;
import expo.modules.contacts.next.mappers.domain.data.list.EmailMapper;
import expo.modules.contacts.next.mappers.domain.data.list.EventMapper;
import expo.modules.contacts.next.mappers.domain.data.list.NicknameMapper;
import expo.modules.contacts.next.mappers.domain.data.list.PhoneMapper;
import expo.modules.contacts.next.mappers.domain.data.list.RelationMapper;
import expo.modules.contacts.next.mappers.domain.data.list.StructuredPostalMapper;
import expo.modules.contacts.next.mappers.domain.data.list.WebsiteMapper;
import expo.modules.contacts.next.records.ExistingRecord;
import expo.modules.contacts.next.records.NewRecord;
import expo.modules.contacts.next.records.PatchRecord;
import expo.modules.contacts.next.records.contact.CreateContactRecord;
import expo.modules.contacts.next.records.contact.GetContactDetailsRecord;
import expo.modules.contacts.next.records.contact.PatchContactRecord;
import expo.modules.contacts.next.records.fields.AddressRecord;
import expo.modules.contacts.next.records.fields.ContactField;
import expo.modules.contacts.next.records.fields.DateRecord;
import expo.modules.contacts.next.records.fields.EmailRecord;
import expo.modules.contacts.next.records.fields.ExtraNameRecord;
import expo.modules.contacts.next.records.fields.PhoneRecord;
import expo.modules.contacts.next.records.fields.RelationRecord;
import expo.modules.contacts.next.records.fields.UrlAddressRecord;
import expo.modules.contacts.next.services.ImageByteArrayConverter;
import expo.modules.kotlin.types.Either;
import expo.modules.kotlin.types.ValueOrUndefined;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;

/* compiled from: ContactRecordDomainMapper.kt */
@Metadata(d1 = {"\u0000\u0096\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000e\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rJ\u001d\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013¢\u0006\u0004\b\u0014\u0010\u0015J\u000e\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0010\u001a\u00020\u0018J\u000e\u0010\u0019\u001a\u00020\u00172\u0006\u0010\u0010\u001a\u00020\u001aJ\"\u0010\u001b\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u001e0\u001d0\u001c2\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020!0 J'\u0010\n\u001a\u0002H\"\"\b\b\u0000\u0010\"*\u00020\u0018\"\b\b\u0001\u0010#*\u00020\u001e2\u0006\u0010$\u001a\u0002H#¢\u0006\u0002\u0010%J\u000e\u0010&\u001a\u00020'2\u0006\u0010\u0010\u001a\u00020(J%\u0010)\u001a\u00020*2\u0006\u0010\u0010\u001a\u00020(2\u0006\u0010+\u001a\u00020,2\u0006\u0010\u0012\u001a\u00020\u0013¢\u0006\u0004\b-\u0010.JM\u0010/\u001a\u0002002\u0006\u0010\u0010\u001a\u0002012\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010+\u001a\u00020,2\b\u00102\u001a\u0004\u0018\u0001032\b\u00104\u001a\u0004\u0018\u0001032\b\u00105\u001a\u0004\u0018\u0001032\b\u00106\u001a\u0004\u0018\u000103¢\u0006\u0004\b7\u00108J\u0014\u00109\u001a\b\u0012\u0004\u0012\u00020:0\u001c2\u0006\u0010;\u001a\u00020(R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006<"}, d2 = {"Lexpo/modules/contacts/next/mappers/ContactRecordDomainMapper;", "", "imageByteArrayConverter", "Lexpo/modules/contacts/next/services/ImageByteArrayConverter;", "<init>", "(Lexpo/modules/contacts/next/services/ImageByteArrayConverter;)V", "contactMapper", "Lexpo/modules/contacts/next/mappers/ContactMapper;", "getContactMapper", "()Lexpo/modules/contacts/next/mappers/ContactMapper;", "toRecord", "Lexpo/modules/contacts/next/records/contact/GetContactDetailsRecord;", "existingContact", "Lexpo/modules/contacts/next/domain/model/contact/ExistingContact;", "toAppendable", "Lexpo/modules/contacts/next/domain/model/Appendable;", "record", "Lexpo/modules/contacts/next/records/NewRecord;", "rawContactId", "Lexpo/modules/contacts/next/domain/wrappers/RawContactId;", "toAppendable-MYK5hZQ", "(Lexpo/modules/contacts/next/records/NewRecord;Ljava/lang/String;)Lexpo/modules/contacts/next/domain/model/Appendable;", "toUpdatable", "Lexpo/modules/contacts/next/domain/model/Updatable;", "Lexpo/modules/contacts/next/records/ExistingRecord;", "toPatchable", "Lexpo/modules/contacts/next/records/PatchRecord;", "toExtractableFields", "", "Lexpo/modules/contacts/next/domain/model/ExtractableField;", "Lexpo/modules/contacts/next/domain/model/Extractable;", "contactFields", "", "Lexpo/modules/contacts/next/records/fields/ContactField;", "TRecord", "TModel", "model", "(Lexpo/modules/contacts/next/domain/model/Extractable;)Lexpo/modules/contacts/next/records/ExistingRecord;", "toDomain", "Lexpo/modules/contacts/next/domain/model/contact/NewContact;", "Lexpo/modules/contacts/next/records/contact/CreateContactRecord;", "toUpdateContact", "Lexpo/modules/contacts/next/domain/model/contact/UpdateContact;", "contactId", "Lexpo/modules/contacts/next/domain/wrappers/ContactId;", "toUpdateContact-Z-oEY38", "(Lexpo/modules/contacts/next/records/contact/CreateContactRecord;Ljava/lang/String;Ljava/lang/String;)Lexpo/modules/contacts/next/domain/model/contact/UpdateContact;", "toPatchContact", "Lexpo/modules/contacts/next/domain/model/contact/ContactPatch;", "Lexpo/modules/contacts/next/records/contact/PatchContactRecord;", "structuredNameDataId", "Lexpo/modules/contacts/next/domain/wrappers/DataId;", "organizationDataId", "noteDataId", "photoDataId", "toPatchContact-k_3S2wM", "(Lexpo/modules/contacts/next/records/contact/PatchContactRecord;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lexpo/modules/contacts/next/domain/model/contact/ContactPatch;", "toContentValues", "Landroid/content/ContentValues;", "createContactRecord", "expo-contacts_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class ContactRecordDomainMapper {
    private final ContactMapper contactMapper;

    /* compiled from: ContactRecordDomainMapper.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ContactField.values().length];
            try {
                iArr[ContactField.GIVEN_NAME.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ContactField.MIDDLE_NAME.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ContactField.FAMILY_NAME.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ContactField.PREFIX.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[ContactField.SUFFIX.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[ContactField.PHONETIC_GIVEN_NAME.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[ContactField.PHONETIC_MIDDLE_NAME.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[ContactField.PHONETIC_FAMILY_NAME.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[ContactField.COMPANY.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[ContactField.DEPARTMENT.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[ContactField.JOB_TITLE.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[ContactField.PHONETIC_COMPANY_NAME.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[ContactField.EMAILS.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[ContactField.PHONES.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[ContactField.ADDRESSES.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr[ContactField.DATES.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr[ContactField.RELATIONS.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr[ContactField.URL_ADDRESSES.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr[ContactField.EXTRA_NAMES.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr[ContactField.IS_FAVOURITE.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr[ContactField.NOTE.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                iArr[ContactField.IMAGE.ordinal()] = 22;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                iArr[ContactField.THUMBNAIL.ordinal()] = 23;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                iArr[ContactField.FULL_NAME.ordinal()] = 24;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                iArr[ContactField.NICKNAME.ordinal()] = 25;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                iArr[ContactField.MAIDEN_NAME.ordinal()] = 26;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                iArr[ContactField.IM_ADDRESS.ordinal()] = 27;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                iArr[ContactField.SOCIAL_PROFILES.ordinal()] = 28;
            } catch (NoSuchFieldError unused28) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public ContactRecordDomainMapper(ImageByteArrayConverter imageByteArrayConverter) {
        Intrinsics.checkNotNullParameter(imageByteArrayConverter, "imageByteArrayConverter");
        this.contactMapper = new ContactMapper(imageByteArrayConverter);
    }

    public final ContactMapper getContactMapper() {
        return this.contactMapper;
    }

    public final GetContactDetailsRecord toRecord(ExistingContact existingContact) {
        Intrinsics.checkNotNullParameter(existingContact, "existingContact");
        return this.contactMapper.toRecord(existingContact);
    }

    /* renamed from: toAppendable-MYK5hZQ, reason: not valid java name */
    public final Appendable m11767toAppendableMYK5hZQ(NewRecord record, String rawContactId) {
        Intrinsics.checkNotNullParameter(record, "record");
        Intrinsics.checkNotNullParameter(rawContactId, "rawContactId");
        if (record instanceof EmailRecord.New) {
            return EmailMapper.INSTANCE.mo11806toAppendableMYK5hZQ((EmailRecord.New) record, rawContactId);
        }
        if (record instanceof PhoneRecord.New) {
            return PhoneMapper.INSTANCE.mo11806toAppendableMYK5hZQ((PhoneRecord.New) record, rawContactId);
        }
        if (record instanceof DateRecord.New) {
            return EventMapper.INSTANCE.mo11806toAppendableMYK5hZQ((DateRecord.New) record, rawContactId);
        }
        if (record instanceof ExtraNameRecord.New) {
            return NicknameMapper.INSTANCE.mo11806toAppendableMYK5hZQ((ExtraNameRecord.New) record, rawContactId);
        }
        if (record instanceof AddressRecord.New) {
            return StructuredPostalMapper.INSTANCE.mo11806toAppendableMYK5hZQ((AddressRecord.New) record, rawContactId);
        }
        if (record instanceof RelationRecord.New) {
            return RelationMapper.INSTANCE.mo11806toAppendableMYK5hZQ((RelationRecord.New) record, rawContactId);
        }
        if (record instanceof UrlAddressRecord.New) {
            return WebsiteMapper.INSTANCE.mo11806toAppendableMYK5hZQ((UrlAddressRecord.New) record, rawContactId);
        }
        throw new IllegalArgumentException("Unsupported 'NewRecord' type: " + Reflection.getOrCreateKotlinClass(record.getClass()).getSimpleName());
    }

    public final Updatable toUpdatable(ExistingRecord record) {
        Intrinsics.checkNotNullParameter(record, "record");
        if (record instanceof EmailRecord.Existing) {
            return EmailMapper.INSTANCE.toUpdatable((EmailRecord.Existing) record);
        }
        if (record instanceof PhoneRecord.Existing) {
            return PhoneMapper.INSTANCE.toUpdatable((PhoneRecord.Existing) record);
        }
        if (record instanceof DateRecord.Existing) {
            return EventMapper.INSTANCE.toUpdatable((DateRecord.Existing) record);
        }
        if (record instanceof ExtraNameRecord.Existing) {
            return NicknameMapper.INSTANCE.toUpdatable((ExtraNameRecord.Existing) record);
        }
        if (record instanceof AddressRecord.Existing) {
            return StructuredPostalMapper.INSTANCE.toUpdatable((AddressRecord.Existing) record);
        }
        if (record instanceof RelationRecord.Existing) {
            return RelationMapper.INSTANCE.toUpdatable((RelationRecord.Existing) record);
        }
        if (record instanceof UrlAddressRecord.Existing) {
            return WebsiteMapper.INSTANCE.toUpdatable((UrlAddressRecord.Existing) record);
        }
        throw new IllegalArgumentException("Unsupported 'ExistingRecord' type: " + Reflection.getOrCreateKotlinClass(record.getClass()).getSimpleName());
    }

    public final Updatable toPatchable(PatchRecord record) {
        Intrinsics.checkNotNullParameter(record, "record");
        if (record instanceof EmailRecord.Patch) {
            return EmailMapper.INSTANCE.toPatch((EmailRecord.Patch) record);
        }
        if (record instanceof PhoneRecord.Patch) {
            return PhoneMapper.INSTANCE.toPatch((PhoneRecord.Patch) record);
        }
        if (record instanceof DateRecord.Patch) {
            return EventMapper.INSTANCE.toPatch((DateRecord.Patch) record);
        }
        if (record instanceof ExtraNameRecord.Patch) {
            return NicknameMapper.INSTANCE.toPatch((ExtraNameRecord.Patch) record);
        }
        if (record instanceof AddressRecord.Patch) {
            return StructuredPostalMapper.INSTANCE.toPatch((AddressRecord.Patch) record);
        }
        if (record instanceof RelationRecord.Patch) {
            return RelationMapper.INSTANCE.toPatch((RelationRecord.Patch) record);
        }
        if (record instanceof UrlAddressRecord.Patch) {
            return WebsiteMapper.INSTANCE.toPatch((UrlAddressRecord.Patch) record);
        }
        throw new IllegalArgumentException("Unsupported 'PatchRecord' type: " + Reflection.getOrCreateKotlinClass(record.getClass()).getSimpleName());
    }

    public final List<ExtractableField<? extends Extractable>> toExtractableFields(Collection<? extends ContactField> contactFields) {
        ExtractableField extractableField;
        Intrinsics.checkNotNullParameter(contactFields, "contactFields");
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = contactFields.iterator();
        while (it.hasNext()) {
            switch (WhenMappings.$EnumSwitchMapping$0[((ContactField) it.next()).ordinal()]) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                    extractableField = StructuredNameField.INSTANCE;
                    break;
                case 9:
                case 10:
                case 11:
                case 12:
                    extractableField = OrganizationField.INSTANCE;
                    break;
                case 13:
                    extractableField = EmailField.INSTANCE;
                    break;
                case 14:
                    extractableField = PhoneField.INSTANCE;
                    break;
                case 15:
                    extractableField = StructuredPostalField.INSTANCE;
                    break;
                case 16:
                    extractableField = EventField.INSTANCE;
                    break;
                case 17:
                    extractableField = RelationField.INSTANCE;
                    break;
                case 18:
                    extractableField = WebsiteField.INSTANCE;
                    break;
                case 19:
                    extractableField = NicknameField.INSTANCE;
                    break;
                case 20:
                    extractableField = StarredField.INSTANCE;
                    break;
                case 21:
                    extractableField = NoteField.INSTANCE;
                    break;
                case 22:
                    extractableField = PhotoUriField.INSTANCE;
                    break;
                case 23:
                    extractableField = PhotoThumbnailUriField.INSTANCE;
                    break;
                case 24:
                    extractableField = DisplayNameField.INSTANCE;
                    break;
                case 25:
                case 26:
                case 27:
                case 28:
                    extractableField = null;
                    break;
                default:
                    throw new NoWhenBranchMatchedException();
            }
            if (extractableField != null) {
                arrayList.add(extractableField);
            }
        }
        return arrayList;
    }

    public final <TRecord extends ExistingRecord, TModel extends Extractable> TRecord toRecord(TModel model) {
        UrlAddressRecord.Existing dto;
        Intrinsics.checkNotNullParameter(model, "model");
        if (model instanceof ExistingEmail) {
            dto = EmailMapper.INSTANCE.toDto((ExistingEmail) model);
        } else if (model instanceof ExistingPhone) {
            dto = PhoneMapper.INSTANCE.toDto((ExistingPhone) model);
        } else if (model instanceof ExistingEvent) {
            dto = EventMapper.INSTANCE.toDto((ExistingEvent) model);
        } else if (model instanceof ExistingNickname) {
            dto = NicknameMapper.INSTANCE.toDto((ExistingNickname) model);
        } else if (model instanceof ExistingStructuredPostal) {
            dto = StructuredPostalMapper.INSTANCE.toDto((ExistingStructuredPostal) model);
        } else if (model instanceof ExistingRelation) {
            dto = RelationMapper.INSTANCE.toDto((ExistingRelation) model);
        } else {
            if (!(model instanceof ExistingWebsite)) {
                throw new IllegalArgumentException("Unsupported model type for mapping to record");
            }
            dto = WebsiteMapper.INSTANCE.toDto((ExistingWebsite) model);
        }
        Intrinsics.checkNotNull(dto, "null cannot be cast to non-null type TRecord of expo.modules.contacts.next.mappers.ContactRecordDomainMapper.toRecord");
        return dto;
    }

    public final NewContact toDomain(CreateContactRecord record) {
        Intrinsics.checkNotNullParameter(record, "record");
        List createListBuilder = CollectionsKt.createListBuilder();
        createListBuilder.add(this.contactMapper.toNewStructuredName(record));
        createListBuilder.add(this.contactMapper.toNewOrganization(record));
        createListBuilder.add(this.contactMapper.toNewNote(record));
        createListBuilder.add(this.contactMapper.toNewPhoto(record));
        List<EmailRecord.New> emails = record.getEmails();
        if (emails != null) {
            List<EmailRecord.New> list = emails;
            EmailMapper emailMapper = EmailMapper.INSTANCE;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(emailMapper.toNew((EmailRecord.New) it.next()));
            }
            createListBuilder.addAll(arrayList);
        }
        List<PhoneRecord.New> phones = record.getPhones();
        if (phones != null) {
            List<PhoneRecord.New> list2 = phones;
            PhoneMapper phoneMapper = PhoneMapper.INSTANCE;
            ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
            Iterator<T> it2 = list2.iterator();
            while (it2.hasNext()) {
                arrayList2.add(phoneMapper.toNew((PhoneRecord.New) it2.next()));
            }
            createListBuilder.addAll(arrayList2);
        }
        List<DateRecord.New> dates = record.getDates();
        if (dates != null) {
            List<DateRecord.New> list3 = dates;
            EventMapper eventMapper = EventMapper.INSTANCE;
            ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list3, 10));
            Iterator<T> it3 = list3.iterator();
            while (it3.hasNext()) {
                arrayList3.add(eventMapper.toNew((DateRecord.New) it3.next()));
            }
            createListBuilder.addAll(arrayList3);
        }
        List<ExtraNameRecord.New> extraNames = record.getExtraNames();
        if (extraNames != null) {
            List<ExtraNameRecord.New> list4 = extraNames;
            NicknameMapper nicknameMapper = NicknameMapper.INSTANCE;
            ArrayList arrayList4 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list4, 10));
            Iterator<T> it4 = list4.iterator();
            while (it4.hasNext()) {
                arrayList4.add(nicknameMapper.toNew((ExtraNameRecord.New) it4.next()));
            }
            createListBuilder.addAll(arrayList4);
        }
        List<AddressRecord.New> addresses = record.getAddresses();
        if (addresses != null) {
            List<AddressRecord.New> list5 = addresses;
            StructuredPostalMapper structuredPostalMapper = StructuredPostalMapper.INSTANCE;
            ArrayList arrayList5 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list5, 10));
            Iterator<T> it5 = list5.iterator();
            while (it5.hasNext()) {
                arrayList5.add(structuredPostalMapper.toNew((AddressRecord.New) it5.next()));
            }
            createListBuilder.addAll(arrayList5);
        }
        List<RelationRecord.New> relations = record.getRelations();
        if (relations != null) {
            List<RelationRecord.New> list6 = relations;
            RelationMapper relationMapper = RelationMapper.INSTANCE;
            ArrayList arrayList6 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list6, 10));
            Iterator<T> it6 = list6.iterator();
            while (it6.hasNext()) {
                arrayList6.add(relationMapper.toNew((RelationRecord.New) it6.next()));
            }
            createListBuilder.addAll(arrayList6);
        }
        List<UrlAddressRecord.New> urlAddresses = record.getUrlAddresses();
        if (urlAddresses != null) {
            List<UrlAddressRecord.New> list7 = urlAddresses;
            WebsiteMapper websiteMapper = WebsiteMapper.INSTANCE;
            ArrayList arrayList7 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list7, 10));
            Iterator<T> it7 = list7.iterator();
            while (it7.hasNext()) {
                arrayList7.add(websiteMapper.toNew((UrlAddressRecord.New) it7.next()));
            }
            createListBuilder.addAll(arrayList7);
        }
        return new NewContact(Starred.m11704constructorimpl(record.isFavourite() ? 1 : 0), CollectionsKt.build(createListBuilder), null);
    }

    /* renamed from: toUpdateContact-Z-oEY38, reason: not valid java name */
    public final UpdateContact m11769toUpdateContactZoEY38(CreateContactRecord record, String contactId, String rawContactId) {
        Intrinsics.checkNotNullParameter(record, "record");
        Intrinsics.checkNotNullParameter(contactId, "contactId");
        Intrinsics.checkNotNullParameter(rawContactId, "rawContactId");
        List createListBuilder = CollectionsKt.createListBuilder();
        createListBuilder.add(this.contactMapper.m11759toAppendableStructuredNameMYK5hZQ(record, rawContactId));
        createListBuilder.add(this.contactMapper.m11755toAppendableOrganizationMYK5hZQ(record, rawContactId));
        createListBuilder.add(new AppendableNote(rawContactId, record.getNote(), null));
        createListBuilder.add(this.contactMapper.m11757toAppendablePhotoMYK5hZQ(record, rawContactId));
        List<EmailRecord.New> emails = record.getEmails();
        if (emails != null) {
            List<EmailRecord.New> list = emails;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(EmailMapper.INSTANCE.mo11806toAppendableMYK5hZQ((EmailRecord.New) it.next(), rawContactId));
            }
            createListBuilder.addAll(arrayList);
        }
        List<PhoneRecord.New> phones = record.getPhones();
        if (phones != null) {
            List<PhoneRecord.New> list2 = phones;
            ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
            Iterator<T> it2 = list2.iterator();
            while (it2.hasNext()) {
                arrayList2.add(PhoneMapper.INSTANCE.mo11806toAppendableMYK5hZQ((PhoneRecord.New) it2.next(), rawContactId));
            }
            createListBuilder.addAll(arrayList2);
        }
        List<DateRecord.New> dates = record.getDates();
        if (dates != null) {
            List<DateRecord.New> list3 = dates;
            ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list3, 10));
            Iterator<T> it3 = list3.iterator();
            while (it3.hasNext()) {
                arrayList3.add(EventMapper.INSTANCE.mo11806toAppendableMYK5hZQ((DateRecord.New) it3.next(), rawContactId));
            }
            createListBuilder.addAll(arrayList3);
        }
        List<ExtraNameRecord.New> extraNames = record.getExtraNames();
        if (extraNames != null) {
            List<ExtraNameRecord.New> list4 = extraNames;
            ArrayList arrayList4 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list4, 10));
            Iterator<T> it4 = list4.iterator();
            while (it4.hasNext()) {
                arrayList4.add(NicknameMapper.INSTANCE.mo11806toAppendableMYK5hZQ((ExtraNameRecord.New) it4.next(), rawContactId));
            }
            createListBuilder.addAll(arrayList4);
        }
        List<AddressRecord.New> addresses = record.getAddresses();
        if (addresses != null) {
            List<AddressRecord.New> list5 = addresses;
            ArrayList arrayList5 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list5, 10));
            Iterator<T> it5 = list5.iterator();
            while (it5.hasNext()) {
                arrayList5.add(StructuredPostalMapper.INSTANCE.mo11806toAppendableMYK5hZQ((AddressRecord.New) it5.next(), rawContactId));
            }
            createListBuilder.addAll(arrayList5);
        }
        List<RelationRecord.New> relations = record.getRelations();
        if (relations != null) {
            List<RelationRecord.New> list6 = relations;
            ArrayList arrayList6 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list6, 10));
            Iterator<T> it6 = list6.iterator();
            while (it6.hasNext()) {
                arrayList6.add(RelationMapper.INSTANCE.mo11806toAppendableMYK5hZQ((RelationRecord.New) it6.next(), rawContactId));
            }
            createListBuilder.addAll(arrayList6);
        }
        List<UrlAddressRecord.New> urlAddresses = record.getUrlAddresses();
        if (urlAddresses != null) {
            List<UrlAddressRecord.New> list7 = urlAddresses;
            ArrayList arrayList7 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list7, 10));
            Iterator<T> it7 = list7.iterator();
            while (it7.hasNext()) {
                arrayList7.add(WebsiteMapper.INSTANCE.mo11806toAppendableMYK5hZQ((UrlAddressRecord.New) it7.next(), rawContactId));
            }
            createListBuilder.addAll(arrayList7);
        }
        return new UpdateContact(rawContactId, new ExistingStarred(contactId, record.isFavourite(), null), CollectionsKt.build(createListBuilder), null);
    }

    /* renamed from: toPatchContact-k_3S2wM, reason: not valid java name */
    public final ContactPatch m11768toPatchContactk_3S2wM(PatchContactRecord record, String rawContactId, String contactId, String structuredNameDataId, String organizationDataId, String noteDataId, String photoDataId) {
        Intrinsics.checkNotNullParameter(record, "record");
        Intrinsics.checkNotNullParameter(rawContactId, "rawContactId");
        Intrinsics.checkNotNullParameter(contactId, "contactId");
        ContactPatchBuilder contactPatchBuilder = new ContactPatchBuilder(contactId, rawContactId, this, null);
        if (IsChangingAnythingKt.isChangingStructuredName(record)) {
            if (structuredNameDataId != null) {
                contactPatchBuilder.withUpdatable(this.contactMapper.m11764toPatchStructuredNameJtfS1E8(record, structuredNameDataId));
            } else {
                contactPatchBuilder.withAppendable(this.contactMapper.m11760toAppendableStructuredNameMYK5hZQ(record, rawContactId));
            }
        }
        if (IsChangingAnythingKt.isChangingOrganization(record)) {
            if (organizationDataId != null) {
                contactPatchBuilder.withUpdatable(this.contactMapper.m11762toPatchOrganizationJtfS1E8(record, organizationDataId));
            } else {
                contactPatchBuilder.withAppendable(this.contactMapper.m11756toAppendableOrganizationMYK5hZQ(record, rawContactId));
            }
        }
        if (!record.getNote().isUndefined()) {
            if (noteDataId != null) {
                contactPatchBuilder.withUpdatable(this.contactMapper.m11761toPatchNoteJtfS1E8(record, noteDataId));
            } else {
                contactPatchBuilder.withAppendable(this.contactMapper.m11754toAppendableNoteMYK5hZQ(record, rawContactId));
            }
        }
        if (!record.getImage().isUndefined()) {
            if (photoDataId != null) {
                contactPatchBuilder.withUpdatable(this.contactMapper.m11763toPatchPhotoJtfS1E8(record, photoDataId));
            } else {
                contactPatchBuilder.withAppendable(this.contactMapper.m11758toAppendablePhotoMYK5hZQ(record, rawContactId));
            }
        }
        if (!record.isFavourite().isUndefined()) {
            contactPatchBuilder.withUpdatable(new PatchStarred(contactId, record.isFavourite(), null));
        }
        ValueOrUndefined<List<Either<EmailRecord.Patch, EmailRecord.New>>> emails = record.getEmails();
        EmailField emailField = EmailField.INSTANCE;
        if (!emails.isUndefined() && emails.getOptional() != null) {
            contactPatchBuilder.getModifiedFields().add(emailField);
            List<Either<EmailRecord.Patch, EmailRecord.New>> optional = emails.getOptional();
            if (optional == null) {
                optional = CollectionsKt.emptyList();
            }
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : optional) {
                if (((Either) obj).isFirstType(Reflection.getOrCreateKotlinClass(EmailRecord.Patch.class))) {
                    arrayList.add(obj);
                } else {
                    arrayList2.add(obj);
                }
            }
            Pair pair = new Pair(arrayList, arrayList2);
            List list = (List) pair.component1();
            List list2 = (List) pair.component2();
            List list3 = list;
            ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list3, 10));
            Iterator it = list3.iterator();
            while (it.hasNext()) {
                arrayList3.add((PatchRecord) ((Either) it.next()).getFirstType(Reflection.getOrCreateKotlinClass(EmailRecord.Patch.class)));
            }
            ArrayList arrayList4 = arrayList3;
            ArrayList arrayList5 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList4, 10));
            Iterator it2 = arrayList4.iterator();
            while (it2.hasNext()) {
                arrayList5.add(contactPatchBuilder.getMapper().toPatchable((PatchRecord) it2.next()));
            }
            Iterator it3 = arrayList5.iterator();
            while (it3.hasNext()) {
                contactPatchBuilder.getToUpdate().add((Updatable) it3.next());
            }
            List list4 = list2;
            ArrayList arrayList6 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list4, 10));
            Iterator it4 = list4.iterator();
            while (it4.hasNext()) {
                arrayList6.add((NewRecord) ((Either) it4.next()).getSecondType(Reflection.getOrCreateKotlinClass(EmailRecord.New.class)));
            }
            ArrayList arrayList7 = arrayList6;
            ArrayList arrayList8 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList7, 10));
            Iterator it5 = arrayList7.iterator();
            while (it5.hasNext()) {
                arrayList8.add(contactPatchBuilder.getMapper().m11767toAppendableMYK5hZQ((NewRecord) it5.next(), contactPatchBuilder.getRawContactId()));
            }
            Iterator it6 = arrayList8.iterator();
            while (it6.hasNext()) {
                contactPatchBuilder.getToAppend().add((Appendable) it6.next());
            }
            Unit unit = Unit.INSTANCE;
        }
        ValueOrUndefined<List<Either<PhoneRecord.Patch, PhoneRecord.New>>> phones = record.getPhones();
        PhoneField phoneField = PhoneField.INSTANCE;
        if (!phones.isUndefined() && phones.getOptional() != null) {
            contactPatchBuilder.getModifiedFields().add(phoneField);
            List<Either<PhoneRecord.Patch, PhoneRecord.New>> optional2 = phones.getOptional();
            if (optional2 == null) {
                optional2 = CollectionsKt.emptyList();
            }
            ArrayList arrayList9 = new ArrayList();
            ArrayList arrayList10 = new ArrayList();
            for (Object obj2 : optional2) {
                if (((Either) obj2).isFirstType(Reflection.getOrCreateKotlinClass(PhoneRecord.Patch.class))) {
                    arrayList9.add(obj2);
                } else {
                    arrayList10.add(obj2);
                }
            }
            Pair pair2 = new Pair(arrayList9, arrayList10);
            List list5 = (List) pair2.component1();
            List list6 = (List) pair2.component2();
            List list7 = list5;
            ArrayList arrayList11 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list7, 10));
            Iterator it7 = list7.iterator();
            while (it7.hasNext()) {
                arrayList11.add((PatchRecord) ((Either) it7.next()).getFirstType(Reflection.getOrCreateKotlinClass(PhoneRecord.Patch.class)));
            }
            ArrayList arrayList12 = arrayList11;
            ArrayList arrayList13 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList12, 10));
            Iterator it8 = arrayList12.iterator();
            while (it8.hasNext()) {
                arrayList13.add(contactPatchBuilder.getMapper().toPatchable((PatchRecord) it8.next()));
            }
            Iterator it9 = arrayList13.iterator();
            while (it9.hasNext()) {
                contactPatchBuilder.getToUpdate().add((Updatable) it9.next());
            }
            List list8 = list6;
            ArrayList arrayList14 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list8, 10));
            Iterator it10 = list8.iterator();
            while (it10.hasNext()) {
                arrayList14.add((NewRecord) ((Either) it10.next()).getSecondType(Reflection.getOrCreateKotlinClass(PhoneRecord.New.class)));
            }
            ArrayList arrayList15 = arrayList14;
            ArrayList arrayList16 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList15, 10));
            Iterator it11 = arrayList15.iterator();
            while (it11.hasNext()) {
                arrayList16.add(contactPatchBuilder.getMapper().m11767toAppendableMYK5hZQ((NewRecord) it11.next(), contactPatchBuilder.getRawContactId()));
            }
            Iterator it12 = arrayList16.iterator();
            while (it12.hasNext()) {
                contactPatchBuilder.getToAppend().add((Appendable) it12.next());
            }
            Unit unit2 = Unit.INSTANCE;
        }
        ValueOrUndefined<List<Either<DateRecord.Patch, DateRecord.New>>> dates = record.getDates();
        EventField eventField = EventField.INSTANCE;
        if (!dates.isUndefined() && dates.getOptional() != null) {
            contactPatchBuilder.getModifiedFields().add(eventField);
            List<Either<DateRecord.Patch, DateRecord.New>> optional3 = dates.getOptional();
            if (optional3 == null) {
                optional3 = CollectionsKt.emptyList();
            }
            ArrayList arrayList17 = new ArrayList();
            ArrayList arrayList18 = new ArrayList();
            for (Object obj3 : optional3) {
                if (((Either) obj3).isFirstType(Reflection.getOrCreateKotlinClass(DateRecord.Patch.class))) {
                    arrayList17.add(obj3);
                } else {
                    arrayList18.add(obj3);
                }
            }
            Pair pair3 = new Pair(arrayList17, arrayList18);
            List list9 = (List) pair3.component1();
            List list10 = (List) pair3.component2();
            List list11 = list9;
            ArrayList arrayList19 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list11, 10));
            Iterator it13 = list11.iterator();
            while (it13.hasNext()) {
                arrayList19.add((PatchRecord) ((Either) it13.next()).getFirstType(Reflection.getOrCreateKotlinClass(DateRecord.Patch.class)));
            }
            ArrayList arrayList20 = arrayList19;
            ArrayList arrayList21 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList20, 10));
            Iterator it14 = arrayList20.iterator();
            while (it14.hasNext()) {
                arrayList21.add(contactPatchBuilder.getMapper().toPatchable((PatchRecord) it14.next()));
            }
            Iterator it15 = arrayList21.iterator();
            while (it15.hasNext()) {
                contactPatchBuilder.getToUpdate().add((Updatable) it15.next());
            }
            List list12 = list10;
            ArrayList arrayList22 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list12, 10));
            Iterator it16 = list12.iterator();
            while (it16.hasNext()) {
                arrayList22.add((NewRecord) ((Either) it16.next()).getSecondType(Reflection.getOrCreateKotlinClass(DateRecord.New.class)));
            }
            ArrayList arrayList23 = arrayList22;
            ArrayList arrayList24 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList23, 10));
            Iterator it17 = arrayList23.iterator();
            while (it17.hasNext()) {
                arrayList24.add(contactPatchBuilder.getMapper().m11767toAppendableMYK5hZQ((NewRecord) it17.next(), contactPatchBuilder.getRawContactId()));
            }
            Iterator it18 = arrayList24.iterator();
            while (it18.hasNext()) {
                contactPatchBuilder.getToAppend().add((Appendable) it18.next());
            }
            Unit unit3 = Unit.INSTANCE;
        }
        ValueOrUndefined<List<Either<ExtraNameRecord.Patch, ExtraNameRecord.New>>> extraNames = record.getExtraNames();
        NicknameField nicknameField = NicknameField.INSTANCE;
        if (!extraNames.isUndefined() && extraNames.getOptional() != null) {
            contactPatchBuilder.getModifiedFields().add(nicknameField);
            List<Either<ExtraNameRecord.Patch, ExtraNameRecord.New>> optional4 = extraNames.getOptional();
            if (optional4 == null) {
                optional4 = CollectionsKt.emptyList();
            }
            ArrayList arrayList25 = new ArrayList();
            ArrayList arrayList26 = new ArrayList();
            for (Object obj4 : optional4) {
                if (((Either) obj4).isFirstType(Reflection.getOrCreateKotlinClass(ExtraNameRecord.Patch.class))) {
                    arrayList25.add(obj4);
                } else {
                    arrayList26.add(obj4);
                }
            }
            Pair pair4 = new Pair(arrayList25, arrayList26);
            List list13 = (List) pair4.component1();
            List list14 = (List) pair4.component2();
            List list15 = list13;
            ArrayList arrayList27 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list15, 10));
            Iterator it19 = list15.iterator();
            while (it19.hasNext()) {
                arrayList27.add((PatchRecord) ((Either) it19.next()).getFirstType(Reflection.getOrCreateKotlinClass(ExtraNameRecord.Patch.class)));
            }
            ArrayList arrayList28 = arrayList27;
            ArrayList arrayList29 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList28, 10));
            Iterator it20 = arrayList28.iterator();
            while (it20.hasNext()) {
                arrayList29.add(contactPatchBuilder.getMapper().toPatchable((PatchRecord) it20.next()));
            }
            Iterator it21 = arrayList29.iterator();
            while (it21.hasNext()) {
                contactPatchBuilder.getToUpdate().add((Updatable) it21.next());
            }
            List list16 = list14;
            ArrayList arrayList30 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list16, 10));
            Iterator it22 = list16.iterator();
            while (it22.hasNext()) {
                arrayList30.add((NewRecord) ((Either) it22.next()).getSecondType(Reflection.getOrCreateKotlinClass(ExtraNameRecord.New.class)));
            }
            ArrayList arrayList31 = arrayList30;
            ArrayList arrayList32 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList31, 10));
            Iterator it23 = arrayList31.iterator();
            while (it23.hasNext()) {
                arrayList32.add(contactPatchBuilder.getMapper().m11767toAppendableMYK5hZQ((NewRecord) it23.next(), contactPatchBuilder.getRawContactId()));
            }
            Iterator it24 = arrayList32.iterator();
            while (it24.hasNext()) {
                contactPatchBuilder.getToAppend().add((Appendable) it24.next());
            }
            Unit unit4 = Unit.INSTANCE;
        }
        ValueOrUndefined<List<Either<AddressRecord.Patch, AddressRecord.New>>> addresses = record.getAddresses();
        StructuredPostalField structuredPostalField = StructuredPostalField.INSTANCE;
        if (!addresses.isUndefined() && addresses.getOptional() != null) {
            contactPatchBuilder.getModifiedFields().add(structuredPostalField);
            List<Either<AddressRecord.Patch, AddressRecord.New>> optional5 = addresses.getOptional();
            if (optional5 == null) {
                optional5 = CollectionsKt.emptyList();
            }
            ArrayList arrayList33 = new ArrayList();
            ArrayList arrayList34 = new ArrayList();
            for (Object obj5 : optional5) {
                if (((Either) obj5).isFirstType(Reflection.getOrCreateKotlinClass(AddressRecord.Patch.class))) {
                    arrayList33.add(obj5);
                } else {
                    arrayList34.add(obj5);
                }
            }
            Pair pair5 = new Pair(arrayList33, arrayList34);
            List list17 = (List) pair5.component1();
            List list18 = (List) pair5.component2();
            List list19 = list17;
            ArrayList arrayList35 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list19, 10));
            Iterator it25 = list19.iterator();
            while (it25.hasNext()) {
                arrayList35.add((PatchRecord) ((Either) it25.next()).getFirstType(Reflection.getOrCreateKotlinClass(AddressRecord.Patch.class)));
            }
            ArrayList arrayList36 = arrayList35;
            ArrayList arrayList37 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList36, 10));
            Iterator it26 = arrayList36.iterator();
            while (it26.hasNext()) {
                arrayList37.add(contactPatchBuilder.getMapper().toPatchable((PatchRecord) it26.next()));
            }
            Iterator it27 = arrayList37.iterator();
            while (it27.hasNext()) {
                contactPatchBuilder.getToUpdate().add((Updatable) it27.next());
            }
            List list20 = list18;
            ArrayList arrayList38 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list20, 10));
            Iterator it28 = list20.iterator();
            while (it28.hasNext()) {
                arrayList38.add((NewRecord) ((Either) it28.next()).getSecondType(Reflection.getOrCreateKotlinClass(AddressRecord.New.class)));
            }
            ArrayList arrayList39 = arrayList38;
            ArrayList arrayList40 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList39, 10));
            Iterator it29 = arrayList39.iterator();
            while (it29.hasNext()) {
                arrayList40.add(contactPatchBuilder.getMapper().m11767toAppendableMYK5hZQ((NewRecord) it29.next(), contactPatchBuilder.getRawContactId()));
            }
            Iterator it30 = arrayList40.iterator();
            while (it30.hasNext()) {
                contactPatchBuilder.getToAppend().add((Appendable) it30.next());
            }
            Unit unit5 = Unit.INSTANCE;
        }
        ValueOrUndefined<List<Either<RelationRecord.Patch, RelationRecord.New>>> relations = record.getRelations();
        RelationField relationField = RelationField.INSTANCE;
        if (!relations.isUndefined() && relations.getOptional() != null) {
            contactPatchBuilder.getModifiedFields().add(relationField);
            List<Either<RelationRecord.Patch, RelationRecord.New>> optional6 = relations.getOptional();
            if (optional6 == null) {
                optional6 = CollectionsKt.emptyList();
            }
            ArrayList arrayList41 = new ArrayList();
            ArrayList arrayList42 = new ArrayList();
            for (Object obj6 : optional6) {
                if (((Either) obj6).isFirstType(Reflection.getOrCreateKotlinClass(RelationRecord.Patch.class))) {
                    arrayList41.add(obj6);
                } else {
                    arrayList42.add(obj6);
                }
            }
            Pair pair6 = new Pair(arrayList41, arrayList42);
            List list21 = (List) pair6.component1();
            List list22 = (List) pair6.component2();
            List list23 = list21;
            ArrayList arrayList43 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list23, 10));
            Iterator it31 = list23.iterator();
            while (it31.hasNext()) {
                arrayList43.add((PatchRecord) ((Either) it31.next()).getFirstType(Reflection.getOrCreateKotlinClass(RelationRecord.Patch.class)));
            }
            ArrayList arrayList44 = arrayList43;
            ArrayList arrayList45 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList44, 10));
            Iterator it32 = arrayList44.iterator();
            while (it32.hasNext()) {
                arrayList45.add(contactPatchBuilder.getMapper().toPatchable((PatchRecord) it32.next()));
            }
            Iterator it33 = arrayList45.iterator();
            while (it33.hasNext()) {
                contactPatchBuilder.getToUpdate().add((Updatable) it33.next());
            }
            List list24 = list22;
            ArrayList arrayList46 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list24, 10));
            Iterator it34 = list24.iterator();
            while (it34.hasNext()) {
                arrayList46.add((NewRecord) ((Either) it34.next()).getSecondType(Reflection.getOrCreateKotlinClass(RelationRecord.New.class)));
            }
            ArrayList arrayList47 = arrayList46;
            ArrayList arrayList48 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList47, 10));
            Iterator it35 = arrayList47.iterator();
            while (it35.hasNext()) {
                arrayList48.add(contactPatchBuilder.getMapper().m11767toAppendableMYK5hZQ((NewRecord) it35.next(), contactPatchBuilder.getRawContactId()));
            }
            Iterator it36 = arrayList48.iterator();
            while (it36.hasNext()) {
                contactPatchBuilder.getToAppend().add((Appendable) it36.next());
            }
            Unit unit6 = Unit.INSTANCE;
        }
        ValueOrUndefined<List<Either<UrlAddressRecord.Patch, UrlAddressRecord.New>>> urlAddresses = record.getUrlAddresses();
        WebsiteField websiteField = WebsiteField.INSTANCE;
        if (!urlAddresses.isUndefined() && urlAddresses.getOptional() != null) {
            contactPatchBuilder.getModifiedFields().add(websiteField);
            List<Either<UrlAddressRecord.Patch, UrlAddressRecord.New>> optional7 = urlAddresses.getOptional();
            if (optional7 == null) {
                optional7 = CollectionsKt.emptyList();
            }
            ArrayList arrayList49 = new ArrayList();
            ArrayList arrayList50 = new ArrayList();
            for (Object obj7 : optional7) {
                if (((Either) obj7).isFirstType(Reflection.getOrCreateKotlinClass(UrlAddressRecord.Patch.class))) {
                    arrayList49.add(obj7);
                } else {
                    arrayList50.add(obj7);
                }
            }
            Pair pair7 = new Pair(arrayList49, arrayList50);
            List list25 = (List) pair7.component1();
            List list26 = (List) pair7.component2();
            List list27 = list25;
            ArrayList arrayList51 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list27, 10));
            Iterator it37 = list27.iterator();
            while (it37.hasNext()) {
                arrayList51.add((PatchRecord) ((Either) it37.next()).getFirstType(Reflection.getOrCreateKotlinClass(UrlAddressRecord.Patch.class)));
            }
            ArrayList arrayList52 = arrayList51;
            ArrayList arrayList53 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList52, 10));
            Iterator it38 = arrayList52.iterator();
            while (it38.hasNext()) {
                arrayList53.add(contactPatchBuilder.getMapper().toPatchable((PatchRecord) it38.next()));
            }
            Iterator it39 = arrayList53.iterator();
            while (it39.hasNext()) {
                contactPatchBuilder.getToUpdate().add((Updatable) it39.next());
            }
            List list28 = list26;
            ArrayList arrayList54 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list28, 10));
            Iterator it40 = list28.iterator();
            while (it40.hasNext()) {
                arrayList54.add((NewRecord) ((Either) it40.next()).getSecondType(Reflection.getOrCreateKotlinClass(UrlAddressRecord.New.class)));
            }
            ArrayList arrayList55 = arrayList54;
            ArrayList arrayList56 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList55, 10));
            Iterator it41 = arrayList55.iterator();
            while (it41.hasNext()) {
                arrayList56.add(contactPatchBuilder.getMapper().m11767toAppendableMYK5hZQ((NewRecord) it41.next(), contactPatchBuilder.getRawContactId()));
            }
            Iterator it42 = arrayList56.iterator();
            while (it42.hasNext()) {
                contactPatchBuilder.getToAppend().add((Appendable) it42.next());
            }
            Unit unit7 = Unit.INSTANCE;
        }
        return contactPatchBuilder.build();
    }

    public final List<ContentValues> toContentValues(CreateContactRecord createContactRecord) {
        Intrinsics.checkNotNullParameter(createContactRecord, "createContactRecord");
        List createListBuilder = CollectionsKt.createListBuilder();
        createListBuilder.add(this.contactMapper.toNewStructuredName(createContactRecord).getContentValues());
        NewOrganization newOrganization = this.contactMapper.toNewOrganization(createContactRecord);
        if (newOrganization.getCompany() != null || newOrganization.getDepartment() != null || newOrganization.getJobTitle() != null || newOrganization.getPhoneticName() != null) {
            createListBuilder.add(newOrganization.getContentValues());
        }
        NewNote newNote = this.contactMapper.toNewNote(createContactRecord);
        if (newNote.getNote() != null) {
            createListBuilder.add(newNote.getContentValues());
        }
        NewPhoto newPhoto = this.contactMapper.toNewPhoto(createContactRecord);
        if (newPhoto.getPhoto() != null) {
            createListBuilder.add(newPhoto.getContentValues());
        }
        List<EmailRecord.New> emails = createContactRecord.getEmails();
        if (emails != null) {
            List<EmailRecord.New> list = emails;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(EmailMapper.INSTANCE.toNew((EmailRecord.New) it.next()).getContentValues());
            }
            createListBuilder.addAll(arrayList);
        }
        List<PhoneRecord.New> phones = createContactRecord.getPhones();
        if (phones != null) {
            List<PhoneRecord.New> list2 = phones;
            ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
            Iterator<T> it2 = list2.iterator();
            while (it2.hasNext()) {
                arrayList2.add(PhoneMapper.INSTANCE.toNew((PhoneRecord.New) it2.next()).getContentValues());
            }
            createListBuilder.addAll(arrayList2);
        }
        List<DateRecord.New> dates = createContactRecord.getDates();
        if (dates != null) {
            List<DateRecord.New> list3 = dates;
            ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list3, 10));
            Iterator<T> it3 = list3.iterator();
            while (it3.hasNext()) {
                arrayList3.add(EventMapper.INSTANCE.toNew((DateRecord.New) it3.next()).getContentValues());
            }
            createListBuilder.addAll(arrayList3);
        }
        List<AddressRecord.New> addresses = createContactRecord.getAddresses();
        if (addresses != null) {
            List<AddressRecord.New> list4 = addresses;
            ArrayList arrayList4 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list4, 10));
            Iterator<T> it4 = list4.iterator();
            while (it4.hasNext()) {
                arrayList4.add(StructuredPostalMapper.INSTANCE.toNew((AddressRecord.New) it4.next()).getContentValues());
            }
            createListBuilder.addAll(arrayList4);
        }
        List<RelationRecord.New> relations = createContactRecord.getRelations();
        if (relations != null) {
            List<RelationRecord.New> list5 = relations;
            ArrayList arrayList5 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list5, 10));
            Iterator<T> it5 = list5.iterator();
            while (it5.hasNext()) {
                arrayList5.add(RelationMapper.INSTANCE.toNew((RelationRecord.New) it5.next()).getContentValues());
            }
            createListBuilder.addAll(arrayList5);
        }
        List<UrlAddressRecord.New> urlAddresses = createContactRecord.getUrlAddresses();
        if (urlAddresses != null) {
            List<UrlAddressRecord.New> list6 = urlAddresses;
            ArrayList arrayList6 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list6, 10));
            Iterator<T> it6 = list6.iterator();
            while (it6.hasNext()) {
                arrayList6.add(WebsiteMapper.INSTANCE.toNew((UrlAddressRecord.New) it6.next()).getContentValues());
            }
            createListBuilder.addAll(arrayList6);
        }
        List<ExtraNameRecord.New> extraNames = createContactRecord.getExtraNames();
        if (extraNames != null) {
            List<ExtraNameRecord.New> list7 = extraNames;
            ArrayList arrayList7 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list7, 10));
            Iterator<T> it7 = list7.iterator();
            while (it7.hasNext()) {
                arrayList7.add(NicknameMapper.INSTANCE.toNew((ExtraNameRecord.New) it7.next()).getContentValues());
            }
            createListBuilder.addAll(arrayList7);
        }
        return CollectionsKt.build(createListBuilder);
    }
}
