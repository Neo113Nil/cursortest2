package expo.modules.contacts.next.mappers;

import android.net.Uri;
import expo.modules.contacts.next.domain.model.contact.ExistingContact;
import expo.modules.contacts.next.domain.model.email.operations.ExistingEmail;
import expo.modules.contacts.next.domain.model.event.operations.ExistingEvent;
import expo.modules.contacts.next.domain.model.headers.DisplayName;
import expo.modules.contacts.next.domain.model.headers.PhotoThumbnailUri;
import expo.modules.contacts.next.domain.model.headers.PhotoUri;
import expo.modules.contacts.next.domain.model.headers.starred.Starred;
import expo.modules.contacts.next.domain.model.nickname.operations.ExistingNickname;
import expo.modules.contacts.next.domain.model.note.operations.AppendableNote;
import expo.modules.contacts.next.domain.model.note.operations.ExistingNote;
import expo.modules.contacts.next.domain.model.note.operations.NewNote;
import expo.modules.contacts.next.domain.model.note.operations.PatchNote;
import expo.modules.contacts.next.domain.model.organization.operations.AppendableOrganization;
import expo.modules.contacts.next.domain.model.organization.operations.ExistingOrganization;
import expo.modules.contacts.next.domain.model.organization.operations.NewOrganization;
import expo.modules.contacts.next.domain.model.organization.operations.PatchOrganization;
import expo.modules.contacts.next.domain.model.phone.operations.ExistingPhone;
import expo.modules.contacts.next.domain.model.photo.operations.AppendablePhoto;
import expo.modules.contacts.next.domain.model.photo.operations.NewPhoto;
import expo.modules.contacts.next.domain.model.photo.operations.PatchPhoto;
import expo.modules.contacts.next.domain.model.relationship.operations.ExistingRelation;
import expo.modules.contacts.next.domain.model.structuredname.operations.AppendableStructuredName;
import expo.modules.contacts.next.domain.model.structuredname.operations.ExistingStructuredName;
import expo.modules.contacts.next.domain.model.structuredname.operations.NewStructuredName;
import expo.modules.contacts.next.domain.model.structuredname.operations.PatchStructuredName;
import expo.modules.contacts.next.domain.model.structuredpostal.operations.ExistingStructuredPostal;
import expo.modules.contacts.next.domain.model.website.operations.ExistingWebsite;
import expo.modules.contacts.next.mappers.domain.data.list.EmailMapper;
import expo.modules.contacts.next.mappers.domain.data.list.EventMapper;
import expo.modules.contacts.next.mappers.domain.data.list.NicknameMapper;
import expo.modules.contacts.next.mappers.domain.data.list.PhoneMapper;
import expo.modules.contacts.next.mappers.domain.data.list.RelationMapper;
import expo.modules.contacts.next.mappers.domain.data.list.StructuredPostalMapper;
import expo.modules.contacts.next.mappers.domain.data.list.WebsiteMapper;
import expo.modules.contacts.next.records.contact.CreateContactRecord;
import expo.modules.contacts.next.records.contact.GetContactDetailsRecord;
import expo.modules.contacts.next.records.contact.PatchContactRecord;
import expo.modules.contacts.next.services.ImageByteArrayConverter;
import expo.modules.kotlin.types.ValueOrUndefined;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ContactMapper.kt */
@Metadata(d1 = {"\u0000\u008c\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000e\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bJ\u000e\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fJ\u001d\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014¢\u0006\u0004\b\u0015\u0010\u0016J\u001d\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u0014¢\u0006\u0004\b\u0015\u0010\u0017J\u001d\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u000e\u001a\u00020\u00122\u0006\u0010\u001a\u001a\u00020\u001b¢\u0006\u0004\b\u001c\u0010\u001dJ\u000e\u0010\u001e\u001a\u00020\u001f2\u0006\u0010\u000e\u001a\u00020\u000fJ\u001d\u0010 \u001a\u00020!2\u0006\u0010\u000e\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014¢\u0006\u0004\b\"\u0010#J\u001d\u0010 \u001a\u00020!2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u0014¢\u0006\u0004\b\"\u0010$J\u001d\u0010%\u001a\u00020&2\u0006\u0010\u000e\u001a\u00020\u00122\u0006\u0010'\u001a\u00020\u001b¢\u0006\u0004\b(\u0010)J\u001d\u0010*\u001a\u00020+2\u0006\u0010\u000e\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014¢\u0006\u0004\b,\u0010-J\u001d\u0010.\u001a\u00020/2\u0006\u0010\u000e\u001a\u00020\u00122\u0006\u00100\u001a\u00020\u001b¢\u0006\u0004\b1\u00102J\u000e\u00103\u001a\u0002042\u0006\u0010\u000e\u001a\u00020\u000fJ\u001d\u00105\u001a\u0002062\u0006\u0010\u000e\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014¢\u0006\u0004\b7\u00108J\u001d\u00105\u001a\u0002062\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u0014¢\u0006\u0004\b7\u00109J\u001d\u0010:\u001a\u00020;2\u0006\u0010\u000e\u001a\u00020\u00122\u0006\u0010<\u001a\u00020\u001b¢\u0006\u0004\b=\u0010>J\u000e\u0010?\u001a\u00020@2\u0006\u0010\u000e\u001a\u00020\u000fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006A"}, d2 = {"Lexpo/modules/contacts/next/mappers/ContactMapper;", "", "imageByteArrayConverter", "Lexpo/modules/contacts/next/services/ImageByteArrayConverter;", "<init>", "(Lexpo/modules/contacts/next/services/ImageByteArrayConverter;)V", "getImageByteArrayConverter", "()Lexpo/modules/contacts/next/services/ImageByteArrayConverter;", "toRecord", "Lexpo/modules/contacts/next/records/contact/GetContactDetailsRecord;", "existingContact", "Lexpo/modules/contacts/next/domain/model/contact/ExistingContact;", "toNewStructuredName", "Lexpo/modules/contacts/next/domain/model/structuredname/operations/NewStructuredName;", "record", "Lexpo/modules/contacts/next/records/contact/CreateContactRecord;", "toAppendableStructuredName", "Lexpo/modules/contacts/next/domain/model/structuredname/operations/AppendableStructuredName;", "Lexpo/modules/contacts/next/records/contact/PatchContactRecord;", "rawContactId", "Lexpo/modules/contacts/next/domain/wrappers/RawContactId;", "toAppendableStructuredName-MYK5hZQ", "(Lexpo/modules/contacts/next/records/contact/PatchContactRecord;Ljava/lang/String;)Lexpo/modules/contacts/next/domain/model/structuredname/operations/AppendableStructuredName;", "(Lexpo/modules/contacts/next/records/contact/CreateContactRecord;Ljava/lang/String;)Lexpo/modules/contacts/next/domain/model/structuredname/operations/AppendableStructuredName;", "toPatchStructuredName", "Lexpo/modules/contacts/next/domain/model/structuredname/operations/PatchStructuredName;", "structuredNameDataId", "Lexpo/modules/contacts/next/domain/wrappers/DataId;", "toPatchStructuredName-JtfS1E8", "(Lexpo/modules/contacts/next/records/contact/PatchContactRecord;Ljava/lang/String;)Lexpo/modules/contacts/next/domain/model/structuredname/operations/PatchStructuredName;", "toNewOrganization", "Lexpo/modules/contacts/next/domain/model/organization/operations/NewOrganization;", "toAppendableOrganization", "Lexpo/modules/contacts/next/domain/model/organization/operations/AppendableOrganization;", "toAppendableOrganization-MYK5hZQ", "(Lexpo/modules/contacts/next/records/contact/PatchContactRecord;Ljava/lang/String;)Lexpo/modules/contacts/next/domain/model/organization/operations/AppendableOrganization;", "(Lexpo/modules/contacts/next/records/contact/CreateContactRecord;Ljava/lang/String;)Lexpo/modules/contacts/next/domain/model/organization/operations/AppendableOrganization;", "toPatchOrganization", "Lexpo/modules/contacts/next/domain/model/organization/operations/PatchOrganization;", "organizationDataId", "toPatchOrganization-JtfS1E8", "(Lexpo/modules/contacts/next/records/contact/PatchContactRecord;Ljava/lang/String;)Lexpo/modules/contacts/next/domain/model/organization/operations/PatchOrganization;", "toAppendableNote", "Lexpo/modules/contacts/next/domain/model/note/operations/AppendableNote;", "toAppendableNote-MYK5hZQ", "(Lexpo/modules/contacts/next/records/contact/PatchContactRecord;Ljava/lang/String;)Lexpo/modules/contacts/next/domain/model/note/operations/AppendableNote;", "toPatchNote", "Lexpo/modules/contacts/next/domain/model/note/operations/PatchNote;", "noteDataId", "toPatchNote-JtfS1E8", "(Lexpo/modules/contacts/next/records/contact/PatchContactRecord;Ljava/lang/String;)Lexpo/modules/contacts/next/domain/model/note/operations/PatchNote;", "toNewNote", "Lexpo/modules/contacts/next/domain/model/note/operations/NewNote;", "toAppendablePhoto", "Lexpo/modules/contacts/next/domain/model/photo/operations/AppendablePhoto;", "toAppendablePhoto-MYK5hZQ", "(Lexpo/modules/contacts/next/records/contact/PatchContactRecord;Ljava/lang/String;)Lexpo/modules/contacts/next/domain/model/photo/operations/AppendablePhoto;", "(Lexpo/modules/contacts/next/records/contact/CreateContactRecord;Ljava/lang/String;)Lexpo/modules/contacts/next/domain/model/photo/operations/AppendablePhoto;", "toPatchPhoto", "Lexpo/modules/contacts/next/domain/model/photo/operations/PatchPhoto;", "photoDataId", "toPatchPhoto-JtfS1E8", "(Lexpo/modules/contacts/next/records/contact/PatchContactRecord;Ljava/lang/String;)Lexpo/modules/contacts/next/domain/model/photo/operations/PatchPhoto;", "toNewPhoto", "Lexpo/modules/contacts/next/domain/model/photo/operations/NewPhoto;", "expo-contacts_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class ContactMapper {
    private final ImageByteArrayConverter imageByteArrayConverter;

    public ContactMapper(ImageByteArrayConverter imageByteArrayConverter) {
        Intrinsics.checkNotNullParameter(imageByteArrayConverter, "imageByteArrayConverter");
        this.imageByteArrayConverter = imageByteArrayConverter;
    }

    public final ImageByteArrayConverter getImageByteArrayConverter() {
        return this.imageByteArrayConverter;
    }

    public final GetContactDetailsRecord toRecord(ExistingContact existingContact) {
        Boolean bool;
        Intrinsics.checkNotNullParameter(existingContact, "existingContact");
        String m11668getContactIdS9XCBSM = existingContact.m11668getContactIdS9XCBSM();
        DisplayName m11669getDisplayNameakshqVY = existingContact.m11669getDisplayNameakshqVY();
        String m11685unboximpl = m11669getDisplayNameakshqVY != null ? m11669getDisplayNameakshqVY.m11685unboximpl() : null;
        Starred m11672getStarred9dN_u_E = existingContact.m11672getStarred9dN_u_E();
        if (m11672getStarred9dN_u_E != null) {
            bool = Boolean.valueOf(m11672getStarred9dN_u_E.m11709unboximpl() == 1);
        } else {
            bool = null;
        }
        ExistingStructuredName structuredName = existingContact.getStructuredName();
        String givenName = structuredName != null ? structuredName.getGivenName() : null;
        ExistingStructuredName structuredName2 = existingContact.getStructuredName();
        String middleName = structuredName2 != null ? structuredName2.getMiddleName() : null;
        ExistingStructuredName structuredName3 = existingContact.getStructuredName();
        String familyName = structuredName3 != null ? structuredName3.getFamilyName() : null;
        ExistingStructuredName structuredName4 = existingContact.getStructuredName();
        String prefix = structuredName4 != null ? structuredName4.getPrefix() : null;
        ExistingStructuredName structuredName5 = existingContact.getStructuredName();
        String suffix = structuredName5 != null ? structuredName5.getSuffix() : null;
        ExistingStructuredName structuredName6 = existingContact.getStructuredName();
        String phoneticGivenName = structuredName6 != null ? structuredName6.getPhoneticGivenName() : null;
        ExistingStructuredName structuredName7 = existingContact.getStructuredName();
        String phoneticMiddleName = structuredName7 != null ? structuredName7.getPhoneticMiddleName() : null;
        ExistingStructuredName structuredName8 = existingContact.getStructuredName();
        String phoneticFamilyName = structuredName8 != null ? structuredName8.getPhoneticFamilyName() : null;
        ExistingOrganization organization = existingContact.getOrganization();
        String company = organization != null ? organization.getCompany() : null;
        ExistingOrganization organization2 = existingContact.getOrganization();
        String department = organization2 != null ? organization2.getDepartment() : null;
        ExistingOrganization organization3 = existingContact.getOrganization();
        String jobTitle = organization3 != null ? organization3.getJobTitle() : null;
        ExistingOrganization organization4 = existingContact.getOrganization();
        String phoneticName = organization4 != null ? organization4.getPhoneticName() : null;
        ExistingNote note = existingContact.getNote();
        String note2 = note != null ? note.getNote() : null;
        PhotoUri m11671getPhotoUrizVP6rjE = existingContact.m11671getPhotoUrizVP6rjE();
        String m11701unboximpl = m11671getPhotoUrizVP6rjE != null ? m11671getPhotoUrizVP6rjE.m11701unboximpl() : null;
        PhotoThumbnailUri m11670getPhotoThumbnailUrifITejg0 = existingContact.m11670getPhotoThumbnailUrifITejg0();
        String m11693unboximpl = m11670getPhotoThumbnailUrifITejg0 != null ? m11670getPhotoThumbnailUrifITejg0.m11693unboximpl() : null;
        List<ExistingEmail> emails = existingContact.getEmails();
        String str = m11685unboximpl;
        EmailMapper emailMapper = EmailMapper.INSTANCE;
        String str2 = givenName;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(emails, 10));
        Iterator<T> it = emails.iterator();
        while (it.hasNext()) {
            arrayList.add(emailMapper.toDto((ExistingEmail) it.next()));
        }
        ArrayList arrayList2 = arrayList;
        List<ExistingEvent> events = existingContact.getEvents();
        EventMapper eventMapper = EventMapper.INSTANCE;
        ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(events, 10));
        Iterator<T> it2 = events.iterator();
        while (it2.hasNext()) {
            arrayList3.add(eventMapper.toDto((ExistingEvent) it2.next()));
        }
        ArrayList arrayList4 = arrayList3;
        List<ExistingPhone> phones = existingContact.getPhones();
        PhoneMapper phoneMapper = PhoneMapper.INSTANCE;
        ArrayList arrayList5 = new ArrayList(CollectionsKt.collectionSizeOrDefault(phones, 10));
        Iterator<T> it3 = phones.iterator();
        while (it3.hasNext()) {
            arrayList5.add(phoneMapper.toDto((ExistingPhone) it3.next()));
        }
        ArrayList arrayList6 = arrayList5;
        List<ExistingStructuredPostal> structuredPostals = existingContact.getStructuredPostals();
        StructuredPostalMapper structuredPostalMapper = StructuredPostalMapper.INSTANCE;
        ArrayList arrayList7 = new ArrayList(CollectionsKt.collectionSizeOrDefault(structuredPostals, 10));
        Iterator<T> it4 = structuredPostals.iterator();
        while (it4.hasNext()) {
            arrayList7.add(structuredPostalMapper.toDto((ExistingStructuredPostal) it4.next()));
        }
        ArrayList arrayList8 = arrayList7;
        List<ExistingRelation> relations = existingContact.getRelations();
        RelationMapper relationMapper = RelationMapper.INSTANCE;
        ArrayList arrayList9 = new ArrayList(CollectionsKt.collectionSizeOrDefault(relations, 10));
        Iterator<T> it5 = relations.iterator();
        while (it5.hasNext()) {
            arrayList9.add(relationMapper.toDto((ExistingRelation) it5.next()));
        }
        ArrayList arrayList10 = arrayList9;
        List<ExistingWebsite> websites = existingContact.getWebsites();
        WebsiteMapper websiteMapper = WebsiteMapper.INSTANCE;
        ArrayList arrayList11 = new ArrayList(CollectionsKt.collectionSizeOrDefault(websites, 10));
        Iterator<T> it6 = websites.iterator();
        while (it6.hasNext()) {
            arrayList11.add(websiteMapper.toDto((ExistingWebsite) it6.next()));
        }
        ArrayList arrayList12 = arrayList11;
        List<ExistingNickname> nicknames = existingContact.getNicknames();
        NicknameMapper nicknameMapper = NicknameMapper.INSTANCE;
        ArrayList arrayList13 = new ArrayList(CollectionsKt.collectionSizeOrDefault(nicknames, 10));
        Iterator<T> it7 = nicknames.iterator();
        while (it7.hasNext()) {
            arrayList13.add(nicknameMapper.toDto((ExistingNickname) it7.next()));
        }
        return new GetContactDetailsRecord(m11668getContactIdS9XCBSM, str, str2, middleName, familyName, prefix, suffix, phoneticGivenName, phoneticMiddleName, phoneticFamilyName, company, department, jobTitle, phoneticName, note2, m11701unboximpl, m11693unboximpl, bool, arrayList2, arrayList4, arrayList6, arrayList8, arrayList10, arrayList12, arrayList13);
    }

    public final NewStructuredName toNewStructuredName(CreateContactRecord record) {
        Intrinsics.checkNotNullParameter(record, "record");
        return new NewStructuredName(record.getGivenName(), record.getMiddleName(), record.getFamilyName(), record.getPrefix(), record.getSuffix(), record.getPhoneticGivenName(), record.getPhoneticMiddleName(), record.getPhoneticFamilyName());
    }

    /* renamed from: toAppendableStructuredName-MYK5hZQ, reason: not valid java name */
    public final AppendableStructuredName m11760toAppendableStructuredNameMYK5hZQ(PatchContactRecord record, String rawContactId) {
        Intrinsics.checkNotNullParameter(record, "record");
        Intrinsics.checkNotNullParameter(rawContactId, "rawContactId");
        return new AppendableStructuredName(rawContactId, record.getGivenName().getOptional(), record.getMiddleName().getOptional(), record.getFamilyName().getOptional(), record.getPrefix().getOptional(), record.getSuffix().getOptional(), record.getPhoneticGivenName().getOptional(), record.getPhoneticMiddleName().getOptional(), record.getPhoneticFamilyName().getOptional(), null);
    }

    /* renamed from: toAppendableStructuredName-MYK5hZQ, reason: not valid java name */
    public final AppendableStructuredName m11759toAppendableStructuredNameMYK5hZQ(CreateContactRecord record, String rawContactId) {
        Intrinsics.checkNotNullParameter(record, "record");
        Intrinsics.checkNotNullParameter(rawContactId, "rawContactId");
        return new AppendableStructuredName(rawContactId, record.getGivenName(), record.getMiddleName(), record.getFamilyName(), record.getPrefix(), record.getSuffix(), record.getPhoneticGivenName(), record.getPhoneticMiddleName(), record.getPhoneticFamilyName(), null);
    }

    /* renamed from: toPatchStructuredName-JtfS1E8, reason: not valid java name */
    public final PatchStructuredName m11764toPatchStructuredNameJtfS1E8(PatchContactRecord record, String structuredNameDataId) {
        Intrinsics.checkNotNullParameter(record, "record");
        Intrinsics.checkNotNullParameter(structuredNameDataId, "structuredNameDataId");
        return new PatchStructuredName(structuredNameDataId, record.getGivenName(), record.getMiddleName(), record.getFamilyName(), record.getPrefix(), record.getSuffix(), record.getPhoneticGivenName(), record.getPhoneticMiddleName(), record.getPhoneticFamilyName(), null);
    }

    public final NewOrganization toNewOrganization(CreateContactRecord record) {
        Intrinsics.checkNotNullParameter(record, "record");
        return new NewOrganization(record.getCompany(), record.getDepartment(), record.getJobTitle(), record.getPhoneticCompanyName());
    }

    /* renamed from: toAppendableOrganization-MYK5hZQ, reason: not valid java name */
    public final AppendableOrganization m11756toAppendableOrganizationMYK5hZQ(PatchContactRecord record, String rawContactId) {
        Intrinsics.checkNotNullParameter(record, "record");
        Intrinsics.checkNotNullParameter(rawContactId, "rawContactId");
        return new AppendableOrganization(rawContactId, record.getCompany().getOptional(), record.getDepartment().getOptional(), record.getJobTitle().getOptional(), record.getPhoneticCompanyName().getOptional(), null);
    }

    /* renamed from: toAppendableOrganization-MYK5hZQ, reason: not valid java name */
    public final AppendableOrganization m11755toAppendableOrganizationMYK5hZQ(CreateContactRecord record, String rawContactId) {
        Intrinsics.checkNotNullParameter(record, "record");
        Intrinsics.checkNotNullParameter(rawContactId, "rawContactId");
        return new AppendableOrganization(rawContactId, record.getCompany(), record.getDepartment(), record.getJobTitle(), record.getPhoneticCompanyName(), null);
    }

    /* renamed from: toPatchOrganization-JtfS1E8, reason: not valid java name */
    public final PatchOrganization m11762toPatchOrganizationJtfS1E8(PatchContactRecord record, String organizationDataId) {
        Intrinsics.checkNotNullParameter(record, "record");
        Intrinsics.checkNotNullParameter(organizationDataId, "organizationDataId");
        return new PatchOrganization(organizationDataId, record.getCompany(), record.getDepartment(), record.getJobTitle(), record.getPhoneticCompanyName(), null);
    }

    /* renamed from: toAppendableNote-MYK5hZQ, reason: not valid java name */
    public final AppendableNote m11754toAppendableNoteMYK5hZQ(PatchContactRecord record, String rawContactId) {
        Intrinsics.checkNotNullParameter(record, "record");
        Intrinsics.checkNotNullParameter(rawContactId, "rawContactId");
        return new AppendableNote(rawContactId, record.getNote().getOptional(), null);
    }

    /* renamed from: toPatchNote-JtfS1E8, reason: not valid java name */
    public final PatchNote m11761toPatchNoteJtfS1E8(PatchContactRecord record, String noteDataId) {
        Intrinsics.checkNotNullParameter(record, "record");
        Intrinsics.checkNotNullParameter(noteDataId, "noteDataId");
        return new PatchNote(noteDataId, record.getNote(), null);
    }

    public final NewNote toNewNote(CreateContactRecord record) {
        Intrinsics.checkNotNullParameter(record, "record");
        return new NewNote(record.getNote());
    }

    /* renamed from: toAppendablePhoto-MYK5hZQ, reason: not valid java name */
    public final AppendablePhoto m11758toAppendablePhotoMYK5hZQ(PatchContactRecord record, String rawContactId) {
        Intrinsics.checkNotNullParameter(record, "record");
        Intrinsics.checkNotNullParameter(rawContactId, "rawContactId");
        String optional = record.getImage().getOptional();
        return new AppendablePhoto(rawContactId, optional != null ? this.imageByteArrayConverter.toByteArray(Uri.parse(optional)) : null, null);
    }

    /* renamed from: toAppendablePhoto-MYK5hZQ, reason: not valid java name */
    public final AppendablePhoto m11757toAppendablePhotoMYK5hZQ(CreateContactRecord record, String rawContactId) {
        Intrinsics.checkNotNullParameter(record, "record");
        Intrinsics.checkNotNullParameter(rawContactId, "rawContactId");
        String image = record.getImage();
        return new AppendablePhoto(rawContactId, image != null ? this.imageByteArrayConverter.toByteArray(Uri.parse(image)) : null, null);
    }

    /* renamed from: toPatchPhoto-JtfS1E8, reason: not valid java name */
    public final PatchPhoto m11763toPatchPhotoJtfS1E8(PatchContactRecord record, String photoDataId) {
        ValueOrUndefined.Undefined undefined;
        Intrinsics.checkNotNullParameter(record, "record");
        Intrinsics.checkNotNullParameter(photoDataId, "photoDataId");
        ValueOrUndefined<String> image = record.getImage();
        if (image instanceof ValueOrUndefined.Value) {
            String str = (String) ((ValueOrUndefined.Value) image).getValue();
            undefined = new ValueOrUndefined.Value(str != null ? this.imageByteArrayConverter.toByteArray(Uri.parse(str)) : null);
        } else {
            if (!(image instanceof ValueOrUndefined.Undefined)) {
                throw new NoWhenBranchMatchedException();
            }
            ValueOrUndefined.Companion companion = ValueOrUndefined.INSTANCE;
            ValueOrUndefined.Undefined undefined2 = ValueOrUndefined.Undefined.INSTANCE;
            Intrinsics.checkNotNull(undefined2, "null cannot be cast to non-null type expo.modules.kotlin.types.ValueOrUndefined<T of expo.modules.kotlin.types.ValueOrUndefined.Companion.getUndefined>");
            undefined = undefined2;
        }
        return new PatchPhoto(photoDataId, undefined, null);
    }

    public final NewPhoto toNewPhoto(CreateContactRecord record) {
        Intrinsics.checkNotNullParameter(record, "record");
        String image = record.getImage();
        return new NewPhoto(image != null ? this.imageByteArrayConverter.toByteArray(Uri.parse(image)) : null);
    }
}
