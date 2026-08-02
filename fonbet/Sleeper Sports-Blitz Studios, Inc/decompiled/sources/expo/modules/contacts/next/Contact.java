package expo.modules.contacts.next;

import android.content.ContentValues;
import android.net.Uri;
import com.facebook.GraphRequest;
import expo.modules.contacts.next.domain.ContactRepository;
import expo.modules.contacts.next.domain.model.Extractable;
import expo.modules.contacts.next.domain.model.ExtractableField;
import expo.modules.contacts.next.domain.model.contact.ContactPatch;
import expo.modules.contacts.next.domain.model.contact.ExistingContact;
import expo.modules.contacts.next.domain.model.contact.NewContact;
import expo.modules.contacts.next.domain.model.contact.UpdateContact;
import expo.modules.contacts.next.domain.model.email.EmailField;
import expo.modules.contacts.next.domain.model.email.operations.ExistingEmail;
import expo.modules.contacts.next.domain.model.event.EventField;
import expo.modules.contacts.next.domain.model.event.operations.ExistingEvent;
import expo.modules.contacts.next.domain.model.headers.DisplayName;
import expo.modules.contacts.next.domain.model.headers.DisplayNameField;
import expo.modules.contacts.next.domain.model.headers.PhotoThumbnailUri;
import expo.modules.contacts.next.domain.model.headers.PhotoThumbnailUriField;
import expo.modules.contacts.next.domain.model.headers.PhotoUri;
import expo.modules.contacts.next.domain.model.headers.PhotoUriField;
import expo.modules.contacts.next.domain.model.headers.starred.Starred;
import expo.modules.contacts.next.domain.model.headers.starred.StarredField;
import expo.modules.contacts.next.domain.model.nickname.NicknameField;
import expo.modules.contacts.next.domain.model.nickname.operations.ExistingNickname;
import expo.modules.contacts.next.domain.model.note.NoteField;
import expo.modules.contacts.next.domain.model.note.operations.ExistingNote;
import expo.modules.contacts.next.domain.model.organization.OrganizationField;
import expo.modules.contacts.next.domain.model.organization.operations.ExistingOrganization;
import expo.modules.contacts.next.domain.model.phone.PhoneField;
import expo.modules.contacts.next.domain.model.phone.operations.ExistingPhone;
import expo.modules.contacts.next.domain.model.photo.PhotoField;
import expo.modules.contacts.next.domain.model.photo.operations.ExistingPhoto;
import expo.modules.contacts.next.domain.model.relationship.RelationField;
import expo.modules.contacts.next.domain.model.relationship.operations.ExistingRelation;
import expo.modules.contacts.next.domain.model.structuredname.StructuredNameField;
import expo.modules.contacts.next.domain.model.structuredname.operations.ExistingStructuredName;
import expo.modules.contacts.next.domain.model.structuredpostal.StructuredPostalField;
import expo.modules.contacts.next.domain.model.structuredpostal.operations.ExistingStructuredPostal;
import expo.modules.contacts.next.domain.model.website.WebsiteField;
import expo.modules.contacts.next.domain.model.website.operations.ExistingWebsite;
import expo.modules.contacts.next.domain.wrappers.ContactId;
import expo.modules.contacts.next.domain.wrappers.RawContactId;
import expo.modules.contacts.next.intents.ContactIntentDelegate;
import expo.modules.contacts.next.mappers.ContactRecordDomainMapper;
import expo.modules.contacts.next.mappers.domain.contacts.ContactsPropertyMapper;
import expo.modules.contacts.next.mappers.domain.contacts.DisplayNameMapper;
import expo.modules.contacts.next.mappers.domain.contacts.MutableContactsPropertyMapper;
import expo.modules.contacts.next.mappers.domain.contacts.PhotoThumbnailUriMapper;
import expo.modules.contacts.next.mappers.domain.contacts.PhotoUriMapper;
import expo.modules.contacts.next.mappers.domain.contacts.StarredMapper;
import expo.modules.contacts.next.mappers.domain.data.MutableDataPropertyMapper;
import expo.modules.contacts.next.mappers.domain.data.NoteMapper;
import expo.modules.contacts.next.mappers.domain.data.OrganizationPropertyMapper;
import expo.modules.contacts.next.mappers.domain.data.PhotoPropertyMapper;
import expo.modules.contacts.next.mappers.domain.data.StructuredNamePropertyMapper;
import expo.modules.contacts.next.mappers.domain.data.list.EmailMapper;
import expo.modules.contacts.next.mappers.domain.data.list.EventMapper;
import expo.modules.contacts.next.mappers.domain.data.list.ListDataPropertyMapper;
import expo.modules.contacts.next.mappers.domain.data.list.NicknameMapper;
import expo.modules.contacts.next.mappers.domain.data.list.PhoneMapper;
import expo.modules.contacts.next.mappers.domain.data.list.RelationMapper;
import expo.modules.contacts.next.mappers.domain.data.list.StructuredPostalMapper;
import expo.modules.contacts.next.mappers.domain.data.list.WebsiteMapper;
import expo.modules.contacts.next.records.ContactQueryOptions;
import expo.modules.contacts.next.records.ExistingRecord;
import expo.modules.contacts.next.records.NewRecord;
import expo.modules.contacts.next.records.SortOrder;
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
import expo.modules.contacts.next.services.properties.ContactsProperty;
import expo.modules.contacts.next.services.properties.ListDataProperty;
import expo.modules.contacts.next.services.properties.MutableContactsProperty;
import expo.modules.contacts.next.services.properties.MutableDataProperty;
import expo.modules.kotlin.sharedobjects.SharedObject;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.Dispatchers;

/* compiled from: Contact.kt */
@Metadata(d1 = {"\u0000Ò\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u0097\u00012\u00020\u0001:\u0002\u0097\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\u000e\u0010q\u001a\u00020JH\u0086@¢\u0006\u0002\u0010rJ\u0016\u0010s\u001a\u00020J2\u0006\u0010t\u001a\u00020uH\u0086@¢\u0006\u0002\u0010vJ\u0016\u0010w\u001a\u00020J2\u0006\u0010x\u001a\u00020yH\u0086@¢\u0006\u0002\u0010zJ\u001f\u0010{\u001a\u00020|2\u000e\u0010}\u001a\n\u0012\u0004\u0012\u00020\u007f\u0018\u00010~H\u0086@¢\u0006\u0003\u0010\u0080\u0001J\u000f\u0010\u0081\u0001\u001a\u00020JH\u0086@¢\u0006\u0002\u0010rJ\u0010\u0010\u0082\u0001\u001a\u00030\u0083\u0001H\u0082@¢\u0006\u0002\u0010rJR\u0010\u0084\u0001\u001a\u0010\u0012\u0005\u0012\u0003H\u0085\u0001\u0012\u0005\u0012\u0003H\u0086\u00010\u001a\"\n\b\u0000\u0010\u0085\u0001*\u00030\u0087\u0001\"\u0005\b\u0001\u0010\u0086\u00012\u000f\u0010\u0088\u0001\u001a\n\u0012\u0005\u0012\u0003H\u0085\u00010\u0089\u00012\u0015\u0010\u0006\u001a\u0011\u0012\u0005\u0012\u0003H\u0085\u0001\u0012\u0005\u0012\u0003H\u0086\u00010\u008a\u0001H\u0002Jq\u0010\u008b\u0001\u001a\u0017\u0012\u0005\u0012\u0003H\u0085\u0001\u0012\u0005\u0012\u0003H\u008c\u0001\u0012\u0005\u0012\u0003H\u008d\u00010M\"\n\b\u0000\u0010\u0085\u0001*\u00030\u0087\u0001\"\n\b\u0001\u0010\u008c\u0001*\u00030\u008e\u0001\"\n\b\u0002\u0010\u008d\u0001*\u00030\u008f\u00012\u000f\u0010\u0088\u0001\u001a\n\u0012\u0005\u0012\u0003H\u0085\u00010\u0089\u00012\u001c\u0010\u0006\u001a\u0018\u0012\u0005\u0012\u0003H\u0085\u0001\u0012\u0005\u0012\u0003H\u008c\u0001\u0012\u0005\u0012\u0003H\u008d\u00010\u0090\u0001H\u0002JR\u0010\u0091\u0001\u001a\u0010\u0012\u0005\u0012\u0003H\u0085\u0001\u0012\u0005\u0012\u0003H\u0086\u00010=\"\n\b\u0000\u0010\u0085\u0001*\u00030\u0092\u0001\"\u0005\b\u0001\u0010\u0086\u00012\u000f\u0010\u0088\u0001\u001a\n\u0012\u0005\u0012\u0003H\u0085\u00010\u0093\u00012\u0015\u0010\u0006\u001a\u0011\u0012\u0005\u0012\u0003H\u0085\u0001\u0012\u0005\u0012\u0003H\u0086\u00010\u0094\u0001H\u0002JR\u0010\u0095\u0001\u001a\u0010\u0012\u0005\u0012\u0003H\u0085\u0001\u0012\u0005\u0012\u0003H\u0086\u00010H\"\n\b\u0000\u0010\u0085\u0001*\u00030\u0092\u0001\"\u0005\b\u0001\u0010\u0086\u00012\u000f\u0010\u0088\u0001\u001a\n\u0012\u0005\u0012\u0003H\u0085\u00010\u0093\u00012\u0015\u0010\u0006\u001a\u0011\u0012\u0005\u0012\u0003H\u0085\u0001\u0012\u0005\u0012\u0003H\u0086\u00010\u0096\u0001H\u0002R\u0013\u0010\u0002\u001a\u00020\u0003¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u001f\u0010\u0019\u001a\u0010\u0012\u0004\u0012\u00020\u001b\u0012\u0006\u0012\u0004\u0018\u00010\u001c0\u001a¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u001f\u0010\u001f\u001a\u0010\u0012\u0004\u0012\u00020\u001b\u0012\u0006\u0012\u0004\u0018\u00010\u001c0\u001a¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001eR\u001f\u0010!\u001a\u0010\u0012\u0004\u0012\u00020\u001b\u0012\u0006\u0012\u0004\u0018\u00010\u001c0\u001a¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u001eR\u001f\u0010#\u001a\u0010\u0012\u0004\u0012\u00020\u001b\u0012\u0006\u0012\u0004\u0018\u00010\u001c0\u001a¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u001eR\u001f\u0010%\u001a\u0010\u0012\u0004\u0012\u00020\u001b\u0012\u0006\u0012\u0004\u0018\u00010\u001c0\u001a¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u001eR\u001f\u0010'\u001a\u0010\u0012\u0004\u0012\u00020\u001b\u0012\u0006\u0012\u0004\u0018\u00010\u001c0\u001a¢\u0006\b\n\u0000\u001a\u0004\b(\u0010\u001eR\u001f\u0010)\u001a\u0010\u0012\u0004\u0012\u00020\u001b\u0012\u0006\u0012\u0004\u0018\u00010\u001c0\u001a¢\u0006\b\n\u0000\u001a\u0004\b*\u0010\u001eR\u001f\u0010+\u001a\u0010\u0012\u0004\u0012\u00020\u001b\u0012\u0006\u0012\u0004\u0018\u00010\u001c0\u001a¢\u0006\b\n\u0000\u001a\u0004\b,\u0010\u001eR\u001f\u0010-\u001a\u0010\u0012\u0004\u0012\u00020.\u0012\u0006\u0012\u0004\u0018\u00010\u001c0\u001a¢\u0006\b\n\u0000\u001a\u0004\b/\u0010\u001eR\u001f\u00100\u001a\u0010\u0012\u0004\u0012\u00020.\u0012\u0006\u0012\u0004\u0018\u00010\u001c0\u001a¢\u0006\b\n\u0000\u001a\u0004\b1\u0010\u001eR\u001f\u00102\u001a\u0010\u0012\u0004\u0012\u00020.\u0012\u0006\u0012\u0004\u0018\u00010\u001c0\u001a¢\u0006\b\n\u0000\u001a\u0004\b3\u0010\u001eR\u001f\u00104\u001a\u0010\u0012\u0004\u0012\u00020.\u0012\u0006\u0012\u0004\u0018\u00010\u001c0\u001a¢\u0006\b\n\u0000\u001a\u0004\b5\u0010\u001eR\u001f\u00106\u001a\u0010\u0012\u0004\u0012\u000207\u0012\u0006\u0012\u0004\u0018\u00010\u001c0\u001a¢\u0006\b\n\u0000\u001a\u0004\b8\u0010\u001eR\u001f\u00109\u001a\u0010\u0012\u0004\u0012\u00020:\u0012\u0006\u0012\u0004\u0018\u00010\u001c0\u001a¢\u0006\b\n\u0000\u001a\u0004\b;\u0010\u001eR\u001f\u0010<\u001a\u0010\u0012\u0004\u0012\u00020>\u0012\u0006\u0012\u0004\u0018\u00010\u001c0=¢\u0006\b\n\u0000\u001a\u0004\b?\u0010@R\u001f\u0010A\u001a\u0010\u0012\u0004\u0012\u00020B\u0012\u0006\u0012\u0004\u0018\u00010\u001c0=¢\u0006\b\n\u0000\u001a\u0004\bC\u0010@R\u001f\u0010D\u001a\u0010\u0012\u0004\u0012\u00020E\u0012\u0006\u0012\u0004\u0018\u00010\u001c0=¢\u0006\b\n\u0000\u001a\u0004\bF\u0010@R\u001d\u0010G\u001a\u000e\u0012\u0004\u0012\u00020I\u0012\u0004\u0012\u00020J0H¢\u0006\b\n\u0000\u001a\u0004\bG\u0010KR#\u0010L\u001a\u0014\u0012\u0004\u0012\u00020N\u0012\u0004\u0012\u00020O\u0012\u0004\u0012\u00020P0M¢\u0006\b\n\u0000\u001a\u0004\bQ\u0010RR#\u0010S\u001a\u0014\u0012\u0004\u0012\u00020T\u0012\u0004\u0012\u00020U\u0012\u0004\u0012\u00020V0M¢\u0006\b\n\u0000\u001a\u0004\bW\u0010RR#\u0010X\u001a\u0014\u0012\u0004\u0012\u00020Y\u0012\u0004\u0012\u00020Z\u0012\u0004\u0012\u00020[0M¢\u0006\b\n\u0000\u001a\u0004\b\\\u0010RR#\u0010]\u001a\u0014\u0012\u0004\u0012\u00020^\u0012\u0004\u0012\u00020_\u0012\u0004\u0012\u00020`0M¢\u0006\b\n\u0000\u001a\u0004\ba\u0010RR#\u0010b\u001a\u0014\u0012\u0004\u0012\u00020c\u0012\u0004\u0012\u00020d\u0012\u0004\u0012\u00020e0M¢\u0006\b\n\u0000\u001a\u0004\bf\u0010RR#\u0010g\u001a\u0014\u0012\u0004\u0012\u00020h\u0012\u0004\u0012\u00020i\u0012\u0004\u0012\u00020j0M¢\u0006\b\n\u0000\u001a\u0004\bk\u0010RR#\u0010l\u001a\u0014\u0012\u0004\u0012\u00020m\u0012\u0004\u0012\u00020n\u0012\u0004\u0012\u00020o0M¢\u0006\b\n\u0000\u001a\u0004\bp\u0010R¨\u0006\u0098\u0001"}, d2 = {"Lexpo/modules/contacts/next/Contact;", "Lexpo/modules/kotlin/sharedobjects/SharedObject;", "contactId", "Lexpo/modules/contacts/next/domain/wrappers/ContactId;", "repository", "Lexpo/modules/contacts/next/domain/ContactRepository;", "mapper", "Lexpo/modules/contacts/next/mappers/ContactRecordDomainMapper;", "photoPropertyMapper", "Lexpo/modules/contacts/next/mappers/domain/data/PhotoPropertyMapper;", "intentDelegate", "Lexpo/modules/contacts/next/intents/ContactIntentDelegate;", "<init>", "(Ljava/lang/String;Lexpo/modules/contacts/next/domain/ContactRepository;Lexpo/modules/contacts/next/mappers/ContactRecordDomainMapper;Lexpo/modules/contacts/next/mappers/domain/data/PhotoPropertyMapper;Lexpo/modules/contacts/next/intents/ContactIntentDelegate;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "getContactId-S9XCBSM", "()Ljava/lang/String;", "Ljava/lang/String;", "getRepository", "()Lexpo/modules/contacts/next/domain/ContactRepository;", "getMapper", "()Lexpo/modules/contacts/next/mappers/ContactRecordDomainMapper;", "getPhotoPropertyMapper", "()Lexpo/modules/contacts/next/mappers/domain/data/PhotoPropertyMapper;", "getIntentDelegate", "()Lexpo/modules/contacts/next/intents/ContactIntentDelegate;", "givenName", "Lexpo/modules/contacts/next/services/properties/MutableDataProperty;", "Lexpo/modules/contacts/next/domain/model/structuredname/operations/ExistingStructuredName;", "", "getGivenName", "()Lexpo/modules/contacts/next/services/properties/MutableDataProperty;", "familyName", "getFamilyName", "middleName", "getMiddleName", "prefix", "getPrefix", "suffix", "getSuffix", "phoneticGivenName", "getPhoneticGivenName", "phoneticFamilyName", "getPhoneticFamilyName", "phoneticMiddleName", "getPhoneticMiddleName", "company", "Lexpo/modules/contacts/next/domain/model/organization/operations/ExistingOrganization;", "getCompany", "department", "getDepartment", "jobTitle", "getJobTitle", "phoneticCompanyName", "getPhoneticCompanyName", "note", "Lexpo/modules/contacts/next/domain/model/note/operations/ExistingNote;", "getNote", "image", "Lexpo/modules/contacts/next/domain/model/photo/operations/ExistingPhoto;", "getImage", "fullName", "Lexpo/modules/contacts/next/services/properties/ContactsProperty;", "Lexpo/modules/contacts/next/domain/model/headers/DisplayName;", "getFullName", "()Lexpo/modules/contacts/next/services/properties/ContactsProperty;", "thumbnail", "Lexpo/modules/contacts/next/domain/model/headers/PhotoThumbnailUri;", "getThumbnail", "imageUri", "Lexpo/modules/contacts/next/domain/model/headers/PhotoUri;", "getImageUri", "isFavourite", "Lexpo/modules/contacts/next/services/properties/MutableContactsProperty;", "Lexpo/modules/contacts/next/domain/model/headers/starred/Starred;", "", "()Lexpo/modules/contacts/next/services/properties/MutableContactsProperty;", "emails", "Lexpo/modules/contacts/next/services/properties/ListDataProperty;", "Lexpo/modules/contacts/next/domain/model/email/operations/ExistingEmail;", "Lexpo/modules/contacts/next/records/fields/EmailRecord$Existing;", "Lexpo/modules/contacts/next/records/fields/EmailRecord$New;", "getEmails", "()Lexpo/modules/contacts/next/services/properties/ListDataProperty;", "phones", "Lexpo/modules/contacts/next/domain/model/phone/operations/ExistingPhone;", "Lexpo/modules/contacts/next/records/fields/PhoneRecord$Existing;", "Lexpo/modules/contacts/next/records/fields/PhoneRecord$New;", "getPhones", "addresses", "Lexpo/modules/contacts/next/domain/model/structuredpostal/operations/ExistingStructuredPostal;", "Lexpo/modules/contacts/next/records/fields/AddressRecord$Existing;", "Lexpo/modules/contacts/next/records/fields/AddressRecord$New;", "getAddresses", "dates", "Lexpo/modules/contacts/next/domain/model/event/operations/ExistingEvent;", "Lexpo/modules/contacts/next/records/fields/DateRecord$Existing;", "Lexpo/modules/contacts/next/records/fields/DateRecord$New;", "getDates", "urlAddresses", "Lexpo/modules/contacts/next/domain/model/website/operations/ExistingWebsite;", "Lexpo/modules/contacts/next/records/fields/UrlAddressRecord$Existing;", "Lexpo/modules/contacts/next/records/fields/UrlAddressRecord$New;", "getUrlAddresses", "relations", "Lexpo/modules/contacts/next/domain/model/relationship/operations/ExistingRelation;", "Lexpo/modules/contacts/next/records/fields/RelationRecord$Existing;", "Lexpo/modules/contacts/next/records/fields/RelationRecord$New;", "getRelations", "extraNames", "Lexpo/modules/contacts/next/domain/model/nickname/operations/ExistingNickname;", "Lexpo/modules/contacts/next/records/fields/ExtraNameRecord$Existing;", "Lexpo/modules/contacts/next/records/fields/ExtraNameRecord$New;", "getExtraNames", "delete", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "patch", "patchContactRecord", "Lexpo/modules/contacts/next/records/contact/PatchContactRecord;", "(Lexpo/modules/contacts/next/records/contact/PatchContactRecord;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "update", "newContactRecord", "Lexpo/modules/contacts/next/records/contact/CreateContactRecord;", "(Lexpo/modules/contacts/next/records/contact/CreateContactRecord;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getDetails", "Lexpo/modules/contacts/next/records/contact/GetContactDetailsRecord;", GraphRequest.FIELDS_PARAM, "", "Lexpo/modules/contacts/next/records/fields/ContactField;", "(Ljava/util/Set;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "editWithForm", "getLookupKeyUri", "Landroid/net/Uri;", "mutableDataProperty", "TDomain", "TDto", "Lexpo/modules/contacts/next/domain/model/Extractable$Data;", "field", "Lexpo/modules/contacts/next/domain/model/ExtractableField$Data;", "Lexpo/modules/contacts/next/mappers/domain/data/MutableDataPropertyMapper;", "listDataProperty", "TExistingDto", "TNewDto", "Lexpo/modules/contacts/next/records/ExistingRecord;", "Lexpo/modules/contacts/next/records/NewRecord;", "Lexpo/modules/contacts/next/mappers/domain/data/list/ListDataPropertyMapper;", "contactsProperty", "Lexpo/modules/contacts/next/domain/model/Extractable;", "Lexpo/modules/contacts/next/domain/model/ExtractableField$Contacts;", "Lexpo/modules/contacts/next/mappers/domain/contacts/ContactsPropertyMapper;", "mutableContactsProperty", "Lexpo/modules/contacts/next/mappers/domain/contacts/MutableContactsPropertyMapper;", "Companion", "expo-contacts_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class Contact extends SharedObject {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final ListDataProperty<ExistingStructuredPostal, AddressRecord.Existing, AddressRecord.New> addresses;
    private final MutableDataProperty<ExistingOrganization, String> company;
    private final String contactId;
    private final ListDataProperty<ExistingEvent, DateRecord.Existing, DateRecord.New> dates;
    private final MutableDataProperty<ExistingOrganization, String> department;
    private final ListDataProperty<ExistingEmail, EmailRecord.Existing, EmailRecord.New> emails;
    private final ListDataProperty<ExistingNickname, ExtraNameRecord.Existing, ExtraNameRecord.New> extraNames;
    private final MutableDataProperty<ExistingStructuredName, String> familyName;
    private final ContactsProperty<DisplayName, String> fullName;
    private final MutableDataProperty<ExistingStructuredName, String> givenName;
    private final MutableDataProperty<ExistingPhoto, String> image;
    private final ContactsProperty<PhotoUri, String> imageUri;
    private final ContactIntentDelegate intentDelegate;
    private final MutableContactsProperty<Starred, Boolean> isFavourite;
    private final MutableDataProperty<ExistingOrganization, String> jobTitle;
    private final ContactRecordDomainMapper mapper;
    private final MutableDataProperty<ExistingStructuredName, String> middleName;
    private final MutableDataProperty<ExistingNote, String> note;
    private final ListDataProperty<ExistingPhone, PhoneRecord.Existing, PhoneRecord.New> phones;
    private final MutableDataProperty<ExistingOrganization, String> phoneticCompanyName;
    private final MutableDataProperty<ExistingStructuredName, String> phoneticFamilyName;
    private final MutableDataProperty<ExistingStructuredName, String> phoneticGivenName;
    private final MutableDataProperty<ExistingStructuredName, String> phoneticMiddleName;
    private final PhotoPropertyMapper photoPropertyMapper;
    private final MutableDataProperty<ExistingStructuredName, String> prefix;
    private final ListDataProperty<ExistingRelation, RelationRecord.Existing, RelationRecord.New> relations;
    private final ContactRepository repository;
    private final MutableDataProperty<ExistingStructuredName, String> suffix;
    private final ContactsProperty<PhotoThumbnailUri, String> thumbnail;
    private final ListDataProperty<ExistingWebsite, UrlAddressRecord.Existing, UrlAddressRecord.New> urlAddresses;

    public /* synthetic */ Contact(String str, ContactRepository contactRepository, ContactRecordDomainMapper contactRecordDomainMapper, PhotoPropertyMapper photoPropertyMapper, ContactIntentDelegate contactIntentDelegate, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, contactRepository, contactRecordDomainMapper, photoPropertyMapper, contactIntentDelegate);
    }

    /* renamed from: getContactId-S9XCBSM, reason: not valid java name and from getter */
    public final String getContactId() {
        return this.contactId;
    }

    public final ContactRepository getRepository() {
        return this.repository;
    }

    public final ContactRecordDomainMapper getMapper() {
        return this.mapper;
    }

    public final PhotoPropertyMapper getPhotoPropertyMapper() {
        return this.photoPropertyMapper;
    }

    public final ContactIntentDelegate getIntentDelegate() {
        return this.intentDelegate;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    private Contact(String contactId, ContactRepository repository, ContactRecordDomainMapper mapper, PhotoPropertyMapper photoPropertyMapper, ContactIntentDelegate intentDelegate) {
        super(null, 1, null);
        Intrinsics.checkNotNullParameter(contactId, "contactId");
        Intrinsics.checkNotNullParameter(repository, "repository");
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(photoPropertyMapper, "photoPropertyMapper");
        Intrinsics.checkNotNullParameter(intentDelegate, "intentDelegate");
        this.contactId = contactId;
        this.repository = repository;
        this.mapper = mapper;
        this.photoPropertyMapper = photoPropertyMapper;
        this.intentDelegate = intentDelegate;
        this.givenName = mutableDataProperty(StructuredNameField.INSTANCE, StructuredNamePropertyMapper.GivenName.INSTANCE);
        this.familyName = mutableDataProperty(StructuredNameField.INSTANCE, StructuredNamePropertyMapper.FamilyName.INSTANCE);
        this.middleName = mutableDataProperty(StructuredNameField.INSTANCE, StructuredNamePropertyMapper.MiddleName.INSTANCE);
        this.prefix = mutableDataProperty(StructuredNameField.INSTANCE, StructuredNamePropertyMapper.Prefix.INSTANCE);
        this.suffix = mutableDataProperty(StructuredNameField.INSTANCE, StructuredNamePropertyMapper.Suffix.INSTANCE);
        this.phoneticGivenName = mutableDataProperty(StructuredNameField.INSTANCE, StructuredNamePropertyMapper.PhoneticGivenName.INSTANCE);
        this.phoneticFamilyName = mutableDataProperty(StructuredNameField.INSTANCE, StructuredNamePropertyMapper.PhoneticFamilyName.INSTANCE);
        this.phoneticMiddleName = mutableDataProperty(StructuredNameField.INSTANCE, StructuredNamePropertyMapper.PhoneticMiddleName.INSTANCE);
        this.company = mutableDataProperty(OrganizationField.INSTANCE, OrganizationPropertyMapper.Company.INSTANCE);
        this.department = mutableDataProperty(OrganizationField.INSTANCE, OrganizationPropertyMapper.Department.INSTANCE);
        this.jobTitle = mutableDataProperty(OrganizationField.INSTANCE, OrganizationPropertyMapper.JobTitle.INSTANCE);
        this.phoneticCompanyName = mutableDataProperty(OrganizationField.INSTANCE, OrganizationPropertyMapper.PhoneticName.INSTANCE);
        this.note = mutableDataProperty(NoteField.INSTANCE, NoteMapper.INSTANCE);
        this.image = mutableDataProperty(PhotoField.INSTANCE, photoPropertyMapper);
        this.fullName = contactsProperty(DisplayNameField.INSTANCE, DisplayNameMapper.INSTANCE);
        this.thumbnail = contactsProperty(PhotoThumbnailUriField.INSTANCE, PhotoThumbnailUriMapper.INSTANCE);
        this.imageUri = contactsProperty(PhotoUriField.INSTANCE, PhotoUriMapper.INSTANCE);
        this.isFavourite = mutableContactsProperty(StarredField.INSTANCE, StarredMapper.INSTANCE);
        this.emails = listDataProperty(EmailField.INSTANCE, EmailMapper.INSTANCE);
        this.phones = listDataProperty(PhoneField.INSTANCE, PhoneMapper.INSTANCE);
        this.addresses = listDataProperty(StructuredPostalField.INSTANCE, StructuredPostalMapper.INSTANCE);
        this.dates = listDataProperty(EventField.INSTANCE, EventMapper.INSTANCE);
        this.urlAddresses = listDataProperty(WebsiteField.INSTANCE, WebsiteMapper.INSTANCE);
        this.relations = listDataProperty(RelationField.INSTANCE, RelationMapper.INSTANCE);
        this.extraNames = listDataProperty(NicknameField.INSTANCE, NicknameMapper.INSTANCE);
    }

    public final MutableDataProperty<ExistingStructuredName, String> getGivenName() {
        return this.givenName;
    }

    public final MutableDataProperty<ExistingStructuredName, String> getFamilyName() {
        return this.familyName;
    }

    public final MutableDataProperty<ExistingStructuredName, String> getMiddleName() {
        return this.middleName;
    }

    public final MutableDataProperty<ExistingStructuredName, String> getPrefix() {
        return this.prefix;
    }

    public final MutableDataProperty<ExistingStructuredName, String> getSuffix() {
        return this.suffix;
    }

    public final MutableDataProperty<ExistingStructuredName, String> getPhoneticGivenName() {
        return this.phoneticGivenName;
    }

    public final MutableDataProperty<ExistingStructuredName, String> getPhoneticFamilyName() {
        return this.phoneticFamilyName;
    }

    public final MutableDataProperty<ExistingStructuredName, String> getPhoneticMiddleName() {
        return this.phoneticMiddleName;
    }

    public final MutableDataProperty<ExistingOrganization, String> getCompany() {
        return this.company;
    }

    public final MutableDataProperty<ExistingOrganization, String> getDepartment() {
        return this.department;
    }

    public final MutableDataProperty<ExistingOrganization, String> getJobTitle() {
        return this.jobTitle;
    }

    public final MutableDataProperty<ExistingOrganization, String> getPhoneticCompanyName() {
        return this.phoneticCompanyName;
    }

    public final MutableDataProperty<ExistingNote, String> getNote() {
        return this.note;
    }

    public final MutableDataProperty<ExistingPhoto, String> getImage() {
        return this.image;
    }

    public final ContactsProperty<DisplayName, String> getFullName() {
        return this.fullName;
    }

    public final ContactsProperty<PhotoThumbnailUri, String> getThumbnail() {
        return this.thumbnail;
    }

    public final ContactsProperty<PhotoUri, String> getImageUri() {
        return this.imageUri;
    }

    public final MutableContactsProperty<Starred, Boolean> isFavourite() {
        return this.isFavourite;
    }

    public final ListDataProperty<ExistingEmail, EmailRecord.Existing, EmailRecord.New> getEmails() {
        return this.emails;
    }

    public final ListDataProperty<ExistingPhone, PhoneRecord.Existing, PhoneRecord.New> getPhones() {
        return this.phones;
    }

    public final ListDataProperty<ExistingStructuredPostal, AddressRecord.Existing, AddressRecord.New> getAddresses() {
        return this.addresses;
    }

    public final ListDataProperty<ExistingEvent, DateRecord.Existing, DateRecord.New> getDates() {
        return this.dates;
    }

    public final ListDataProperty<ExistingWebsite, UrlAddressRecord.Existing, UrlAddressRecord.New> getUrlAddresses() {
        return this.urlAddresses;
    }

    public final ListDataProperty<ExistingRelation, RelationRecord.Existing, RelationRecord.New> getRelations() {
        return this.relations;
    }

    public final ListDataProperty<ExistingNickname, ExtraNameRecord.Existing, ExtraNameRecord.New> getExtraNames() {
        return this.extraNames;
    }

    public final Object delete(Continuation<? super Boolean> continuation) {
        return this.repository.m11642deleteD2TBaGg(this.contactId, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object patch(PatchContactRecord patchContactRecord, Continuation<? super Boolean> continuation) {
        Contact$patch$1 contact$patch$1;
        int i;
        PatchContactRecord patchContactRecord2;
        ExistingContact existingContact;
        PatchContactRecord patchContactRecord3;
        ExistingContact existingContact2;
        Object obj;
        String str;
        if (continuation instanceof Contact$patch$1) {
            contact$patch$1 = (Contact$patch$1) continuation;
            if ((contact$patch$1.label & Integer.MIN_VALUE) != 0) {
                contact$patch$1.label -= Integer.MIN_VALUE;
                Object obj2 = contact$patch$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = contact$patch$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj2);
                    ContactRepository contactRepository = this.repository;
                    Set<? extends ExtractableField<?>> of = SetsKt.setOf((Object[]) new ExtractableField.Data[]{StructuredNameField.INSTANCE, OrganizationField.INSTANCE, NoteField.INSTANCE, PhotoField.INSTANCE});
                    String str2 = this.contactId;
                    contact$patch$1.L$0 = patchContactRecord;
                    contact$patch$1.label = 1;
                    obj2 = contactRepository.m11644getByIdm7AL99Q(of, str2, contact$patch$1);
                    if (obj2 != coroutine_suspended) {
                        patchContactRecord2 = patchContactRecord;
                    }
                }
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj2);
                        return obj2;
                    }
                    existingContact2 = (ExistingContact) contact$patch$1.L$1;
                    PatchContactRecord patchContactRecord4 = (PatchContactRecord) contact$patch$1.L$0;
                    ResultKt.throwOnFailure(obj2);
                    RawContactId rawContactId = (RawContactId) obj2;
                    if (rawContactId != null) {
                        obj = rawContactId.m11751unboximpl();
                        patchContactRecord3 = patchContactRecord4;
                    } else {
                        patchContactRecord3 = patchContactRecord4;
                        obj = null;
                    }
                    str = (String) obj;
                    if (str != null) {
                        throw new RawContactIdNotFoundException(null, 1, null);
                    }
                    ContactRecordDomainMapper contactRecordDomainMapper = this.mapper;
                    String str3 = this.contactId;
                    ExistingStructuredName structuredName = existingContact2.getStructuredName();
                    String dataId = structuredName != null ? structuredName.getDataId() : null;
                    ExistingOrganization organization = existingContact2.getOrganization();
                    String dataId2 = organization != null ? organization.getDataId() : null;
                    ExistingNote note = existingContact2.getNote();
                    String dataId3 = note != null ? note.getDataId() : null;
                    ExistingPhoto photo = existingContact2.getPhoto();
                    ContactPatch m11768toPatchContactk_3S2wM = contactRecordDomainMapper.m11768toPatchContactk_3S2wM(patchContactRecord3, str, str3, dataId, dataId2, dataId3, photo != null ? photo.getDataId() : null);
                    ContactRepository contactRepository2 = this.repository;
                    contact$patch$1.L$0 = null;
                    contact$patch$1.L$1 = null;
                    contact$patch$1.label = 3;
                    Object patch = contactRepository2.patch(m11768toPatchContactk_3S2wM, contact$patch$1);
                    return patch == coroutine_suspended ? coroutine_suspended : patch;
                }
                patchContactRecord2 = (PatchContactRecord) contact$patch$1.L$0;
                ResultKt.throwOnFailure(obj2);
                existingContact = (ExistingContact) obj2;
                if (existingContact != null) {
                    throw new ContactNotFoundException(null, 1, null);
                }
                ContactRepository contactRepository3 = this.repository;
                String str4 = this.contactId;
                contact$patch$1.L$0 = patchContactRecord2;
                contact$patch$1.L$1 = existingContact;
                contact$patch$1.label = 2;
                Object m11648getRawContactIdK3SHF88 = contactRepository3.m11648getRawContactIdK3SHF88(str4, contact$patch$1);
                if (m11648getRawContactIdK3SHF88 != coroutine_suspended) {
                    patchContactRecord3 = patchContactRecord2;
                    existingContact2 = existingContact;
                    obj = m11648getRawContactIdK3SHF88;
                    str = (String) obj;
                    if (str != null) {
                    }
                }
            }
        }
        contact$patch$1 = new Contact$patch$1(this, continuation);
        Object obj22 = contact$patch$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = contact$patch$1.label;
        if (i != 0) {
        }
        existingContact = (ExistingContact) obj22;
        if (existingContact != null) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0057, code lost:
    
        if (r8 == r1) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object update(CreateContactRecord createContactRecord, Continuation<? super Boolean> continuation) {
        Contact$update$1 contact$update$1;
        int i;
        Object m11648getRawContactIdK3SHF88;
        String str;
        if (continuation instanceof Contact$update$1) {
            contact$update$1 = (Contact$update$1) continuation;
            if ((contact$update$1.label & Integer.MIN_VALUE) != 0) {
                contact$update$1.label -= Integer.MIN_VALUE;
                Object obj = contact$update$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = contact$update$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    ContactRepository contactRepository = this.repository;
                    String str2 = this.contactId;
                    contact$update$1.L$0 = createContactRecord;
                    contact$update$1.label = 1;
                    m11648getRawContactIdK3SHF88 = contactRepository.m11648getRawContactIdK3SHF88(str2, contact$update$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return obj;
                    }
                    createContactRecord = (CreateContactRecord) contact$update$1.L$0;
                    ResultKt.throwOnFailure(obj);
                    RawContactId rawContactId = (RawContactId) obj;
                    m11648getRawContactIdK3SHF88 = rawContactId != null ? rawContactId.m11751unboximpl() : null;
                }
                str = (String) m11648getRawContactIdK3SHF88;
                if (str != null) {
                    throw new RawContactIdNotFoundException(null, 1, null);
                }
                UpdateContact m11769toUpdateContactZoEY38 = this.mapper.m11769toUpdateContactZoEY38(createContactRecord, this.contactId, str);
                ContactRepository contactRepository2 = this.repository;
                contact$update$1.L$0 = null;
                contact$update$1.label = 2;
                Object update = contactRepository2.update(m11769toUpdateContactZoEY38, contact$update$1);
                return update == coroutine_suspended ? coroutine_suspended : update;
            }
        }
        contact$update$1 = new Contact$update$1(this, continuation);
        Object obj2 = contact$update$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = contact$update$1.label;
        if (i != 0) {
        }
        str = (String) m11648getRawContactIdK3SHF88;
        if (str != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object getDetails(Set<? extends ContactField> set, Continuation<? super GetContactDetailsRecord> continuation) {
        Contact$getDetails$1 contact$getDetails$1;
        int i;
        Set<ExtractableField<?>> all;
        ExistingContact existingContact;
        if (continuation instanceof Contact$getDetails$1) {
            contact$getDetails$1 = (Contact$getDetails$1) continuation;
            if ((contact$getDetails$1.label & Integer.MIN_VALUE) != 0) {
                contact$getDetails$1.label -= Integer.MIN_VALUE;
                Object obj = contact$getDetails$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = contact$getDetails$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    if (set == null || (all = CollectionsKt.toSet(this.mapper.toExtractableFields(set))) == null) {
                        all = ExtractableField.INSTANCE.getAll();
                    }
                    ContactRepository contactRepository = this.repository;
                    String str = this.contactId;
                    contact$getDetails$1.label = 1;
                    obj = contactRepository.m11644getByIdm7AL99Q(all, str, contact$getDetails$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                existingContact = (ExistingContact) obj;
                if (existingContact != null) {
                    throw new ContactNotFoundException(null, 1, null);
                }
                return this.mapper.toRecord(existingContact);
            }
        }
        contact$getDetails$1 = new Contact$getDetails$1(this, continuation);
        Object obj2 = contact$getDetails$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = contact$getDetails$1.label;
        if (i != 0) {
        }
        existingContact = (ExistingContact) obj2;
        if (existingContact != null) {
        }
    }

    public final Object editWithForm(Continuation<? super Boolean> continuation) {
        return BuildersKt.withContext(Dispatchers.getIO(), new Contact$editWithForm$2(this, null), continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object getLookupKeyUri(Continuation<? super Uri> continuation) {
        Contact$getLookupKeyUri$1 contact$getLookupKeyUri$1;
        int i;
        if (continuation instanceof Contact$getLookupKeyUri$1) {
            contact$getLookupKeyUri$1 = (Contact$getLookupKeyUri$1) continuation;
            if ((contact$getLookupKeyUri$1.label & Integer.MIN_VALUE) != 0) {
                contact$getLookupKeyUri$1.label -= Integer.MIN_VALUE;
                Object obj = contact$getLookupKeyUri$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = contact$getLookupKeyUri$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    CoroutineDispatcher io2 = Dispatchers.getIO();
                    Contact$getLookupKeyUri$2 contact$getLookupKeyUri$2 = new Contact$getLookupKeyUri$2(this, null);
                    contact$getLookupKeyUri$1.label = 1;
                    obj = BuildersKt.withContext(io2, contact$getLookupKeyUri$2, contact$getLookupKeyUri$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                Intrinsics.checkNotNullExpressionValue(obj, "withContext(...)");
                return obj;
            }
        }
        contact$getLookupKeyUri$1 = new Contact$getLookupKeyUri$1(this, continuation);
        Object obj2 = contact$getLookupKeyUri$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = contact$getLookupKeyUri$1.label;
        if (i != 0) {
        }
        Intrinsics.checkNotNullExpressionValue(obj2, "withContext(...)");
        return obj2;
    }

    private final <TDomain extends Extractable.Data, TDto> MutableDataProperty<TDomain, TDto> mutableDataProperty(ExtractableField.Data<TDomain> field, MutableDataPropertyMapper<TDomain, TDto> mapper) {
        return new MutableDataProperty<>(field, mapper, this.contactId, this.repository, null);
    }

    private final <TDomain extends Extractable.Data, TExistingDto extends ExistingRecord, TNewDto extends NewRecord> ListDataProperty<TDomain, TExistingDto, TNewDto> listDataProperty(ExtractableField.Data<TDomain> field, ListDataPropertyMapper<TDomain, TExistingDto, TNewDto> mapper) {
        return new ListDataProperty<>(field, mapper, this.contactId, this.repository, null);
    }

    private final <TDomain extends Extractable, TDto> ContactsProperty<TDomain, TDto> contactsProperty(ExtractableField.Contacts<TDomain> field, ContactsPropertyMapper<TDomain, TDto> mapper) {
        return new ContactsProperty<>(field, mapper, this.contactId, this.repository, null);
    }

    private final <TDomain extends Extractable, TDto> MutableContactsProperty<TDomain, TDto> mutableContactsProperty(ExtractableField.Contacts<TDomain> field, MutableContactsPropertyMapper<TDomain, TDto> mapper) {
        return new MutableContactsProperty<>(field, mapper, this.contactId, this.repository, null);
    }

    /* compiled from: Contact.kt */
    @Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J.\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0086@¢\u0006\u0002\u0010\u000eJ(\u0010\u000f\u001a\u00020\u00102\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u0012H\u0086@¢\u0006\u0002\u0010\u0013J.\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00050\u00152\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\r2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0086@¢\u0006\u0002\u0010\u0018J<\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00152\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001c2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0086@¢\u0006\u0002\u0010\u001eJ \u0010\u001f\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\f\u001a\u00020\rH\u0086@¢\u0006\u0002\u0010 J\u0016\u0010!\u001a\u00020\u00102\u0006\u0010\b\u001a\u00020\tH\u0086@¢\u0006\u0002\u0010\"J\u0016\u0010#\u001a\u00020$2\u0006\u0010\b\u001a\u00020\tH\u0086@¢\u0006\u0002\u0010\"¨\u0006%"}, d2 = {"Lexpo/modules/contacts/next/Contact$Companion;", "", "<init>", "()V", "create", "Lexpo/modules/contacts/next/Contact;", "createContactRecord", "Lexpo/modules/contacts/next/records/contact/CreateContactRecord;", "contactRepository", "Lexpo/modules/contacts/next/domain/ContactRepository;", "contactMapper", "Lexpo/modules/contacts/next/mappers/ContactRecordDomainMapper;", "contactFactory", "Lexpo/modules/contacts/next/ContactFactory;", "(Lexpo/modules/contacts/next/records/contact/CreateContactRecord;Lexpo/modules/contacts/next/domain/ContactRepository;Lexpo/modules/contacts/next/mappers/ContactRecordDomainMapper;Lexpo/modules/contacts/next/ContactFactory;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "presentCreateForm", "", "contactIntentDelegate", "Lexpo/modules/contacts/next/intents/ContactIntentDelegate;", "(Lexpo/modules/contacts/next/records/contact/CreateContactRecord;Lexpo/modules/contacts/next/mappers/ContactRecordDomainMapper;Lexpo/modules/contacts/next/intents/ContactIntentDelegate;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getAll", "", "contactQueryOptions", "Lexpo/modules/contacts/next/records/ContactQueryOptions;", "(Lexpo/modules/contacts/next/domain/ContactRepository;Lexpo/modules/contacts/next/ContactFactory;Lexpo/modules/contacts/next/records/ContactQueryOptions;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getAllWithDetails", "Lexpo/modules/contacts/next/records/contact/GetContactDetailsRecord;", GraphRequest.FIELDS_PARAM, "", "Lexpo/modules/contacts/next/records/fields/ContactField;", "(Lexpo/modules/contacts/next/domain/ContactRepository;Lexpo/modules/contacts/next/mappers/ContactRecordDomainMapper;Ljava/util/Set;Lexpo/modules/contacts/next/records/ContactQueryOptions;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "presentPicker", "(Lexpo/modules/contacts/next/intents/ContactIntentDelegate;Lexpo/modules/contacts/next/ContactFactory;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "hasAny", "(Lexpo/modules/contacts/next/domain/ContactRepository;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getCount", "", "expo-contacts_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x003d  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object create(CreateContactRecord createContactRecord, ContactRepository contactRepository, ContactRecordDomainMapper contactRecordDomainMapper, ContactFactory contactFactory, Continuation<? super Contact> continuation) {
            Contact$Companion$create$1 contact$Companion$create$1;
            int i;
            Object m11649insertHoartsk;
            if (continuation instanceof Contact$Companion$create$1) {
                contact$Companion$create$1 = (Contact$Companion$create$1) continuation;
                if ((contact$Companion$create$1.label & Integer.MIN_VALUE) != 0) {
                    contact$Companion$create$1.label -= Integer.MIN_VALUE;
                    Object obj = contact$Companion$create$1.result;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = contact$Companion$create$1.label;
                    if (i != 0) {
                        ResultKt.throwOnFailure(obj);
                        NewContact domain = contactRecordDomainMapper.toDomain(createContactRecord);
                        contact$Companion$create$1.L$0 = contactFactory;
                        contact$Companion$create$1.label = 1;
                        m11649insertHoartsk = contactRepository.m11649insertHoartsk(domain, contact$Companion$create$1);
                        if (m11649insertHoartsk == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        contactFactory = (ContactFactory) contact$Companion$create$1.L$0;
                        ResultKt.throwOnFailure(obj);
                        m11649insertHoartsk = ((ContactId) obj).m11737unboximpl();
                    }
                    return contactFactory.m11635createkDnipiQ((String) m11649insertHoartsk);
                }
            }
            contact$Companion$create$1 = new Contact$Companion$create$1(this, continuation);
            Object obj2 = contact$Companion$create$1.result;
            Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            i = contact$Companion$create$1.label;
            if (i != 0) {
            }
            return contactFactory.m11635createkDnipiQ((String) m11649insertHoartsk);
        }

        public final Object presentCreateForm(CreateContactRecord createContactRecord, ContactRecordDomainMapper contactRecordDomainMapper, ContactIntentDelegate contactIntentDelegate, Continuation<? super Boolean> continuation) {
            List<ContentValues> emptyList;
            if (createContactRecord == null || (emptyList = contactRecordDomainMapper.toContentValues(createContactRecord)) == null) {
                emptyList = CollectionsKt.emptyList();
            }
            return contactIntentDelegate.launchAddContact(emptyList, continuation);
        }

        /* JADX WARN: Removed duplicated region for block: B:13:0x0081 A[LOOP:0: B:11:0x007b->B:13:0x0081, LOOP_END] */
        /* JADX WARN: Removed duplicated region for block: B:20:0x0038  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object getAll(ContactRepository contactRepository, ContactFactory contactFactory, ContactQueryOptions contactQueryOptions, Continuation<? super List<Contact>> continuation) {
            Contact$Companion$getAll$1 contact$Companion$getAll$1;
            int i;
            Iterator it;
            if (continuation instanceof Contact$Companion$getAll$1) {
                contact$Companion$getAll$1 = (Contact$Companion$getAll$1) continuation;
                if ((contact$Companion$getAll$1.label & Integer.MIN_VALUE) != 0) {
                    contact$Companion$getAll$1.label -= Integer.MIN_VALUE;
                    Contact$Companion$getAll$1 contact$Companion$getAll$12 = contact$Companion$getAll$1;
                    Object obj = contact$Companion$getAll$12.result;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = contact$Companion$getAll$12.label;
                    if (i != 0) {
                        ResultKt.throwOnFailure(obj);
                        Integer limit = contactQueryOptions != null ? contactQueryOptions.getLimit() : null;
                        Integer offset = contactQueryOptions != null ? contactQueryOptions.getOffset() : null;
                        String name = contactQueryOptions != null ? contactQueryOptions.getName() : null;
                        SortOrder sortOrder = contactQueryOptions != null ? contactQueryOptions.getSortOrder() : null;
                        contact$Companion$getAll$12.L$0 = contactFactory;
                        contact$Companion$getAll$12.label = 1;
                        obj = contactRepository.getAllIds(limit, offset, name, sortOrder, contact$Companion$getAll$12);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        contactFactory = (ContactFactory) contact$Companion$getAll$12.L$0;
                        ResultKt.throwOnFailure(obj);
                    }
                    Iterable iterable = (Iterable) obj;
                    ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable, 10));
                    it = iterable.iterator();
                    while (it.hasNext()) {
                        arrayList.add(contactFactory.m11635createkDnipiQ(((ContactId) it.next()).m11737unboximpl()));
                    }
                    return arrayList;
                }
            }
            contact$Companion$getAll$1 = new Contact$Companion$getAll$1(this, continuation);
            Contact$Companion$getAll$1 contact$Companion$getAll$122 = contact$Companion$getAll$1;
            Object obj2 = contact$Companion$getAll$122.result;
            Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            i = contact$Companion$getAll$122.label;
            if (i != 0) {
            }
            Iterable iterable2 = (Iterable) obj2;
            ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable2, 10));
            it = iterable2.iterator();
            while (it.hasNext()) {
            }
            return arrayList2;
        }

        /* JADX WARN: Removed duplicated region for block: B:13:0x0090 A[LOOP:0: B:11:0x008a->B:13:0x0090, LOOP_END] */
        /* JADX WARN: Removed duplicated region for block: B:20:0x0038  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object getAllWithDetails(ContactRepository contactRepository, ContactRecordDomainMapper contactRecordDomainMapper, Set<? extends ContactField> set, ContactQueryOptions contactQueryOptions, Continuation<? super List<GetContactDetailsRecord>> continuation) {
            Contact$Companion$getAllWithDetails$1 contact$Companion$getAllWithDetails$1;
            int i;
            Iterator it;
            if (continuation instanceof Contact$Companion$getAllWithDetails$1) {
                contact$Companion$getAllWithDetails$1 = (Contact$Companion$getAllWithDetails$1) continuation;
                if ((contact$Companion$getAllWithDetails$1.label & Integer.MIN_VALUE) != 0) {
                    contact$Companion$getAllWithDetails$1.label -= Integer.MIN_VALUE;
                    Contact$Companion$getAllWithDetails$1 contact$Companion$getAllWithDetails$12 = contact$Companion$getAllWithDetails$1;
                    Object obj = contact$Companion$getAllWithDetails$12.result;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = contact$Companion$getAllWithDetails$12.label;
                    if (i != 0) {
                        ResultKt.throwOnFailure(obj);
                        Set<? extends ExtractableField<?>> set2 = CollectionsKt.toSet(contactRecordDomainMapper.toExtractableFields(set));
                        Integer limit = contactQueryOptions != null ? contactQueryOptions.getLimit() : null;
                        Integer offset = contactQueryOptions != null ? contactQueryOptions.getOffset() : null;
                        String name = contactQueryOptions != null ? contactQueryOptions.getName() : null;
                        SortOrder sortOrder = contactQueryOptions != null ? contactQueryOptions.getSortOrder() : null;
                        contact$Companion$getAllWithDetails$12.L$0 = contactRecordDomainMapper;
                        contact$Companion$getAllWithDetails$12.label = 1;
                        obj = contactRepository.getAllPaginated(set2, limit, offset, name, sortOrder, contact$Companion$getAllWithDetails$12);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        contactRecordDomainMapper = (ContactRecordDomainMapper) contact$Companion$getAllWithDetails$12.L$0;
                        ResultKt.throwOnFailure(obj);
                    }
                    Iterable iterable = (Iterable) obj;
                    ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable, 10));
                    it = iterable.iterator();
                    while (it.hasNext()) {
                        arrayList.add(contactRecordDomainMapper.toRecord((ExistingContact) it.next()));
                    }
                    return arrayList;
                }
            }
            contact$Companion$getAllWithDetails$1 = new Contact$Companion$getAllWithDetails$1(this, continuation);
            Contact$Companion$getAllWithDetails$1 contact$Companion$getAllWithDetails$122 = contact$Companion$getAllWithDetails$1;
            Object obj2 = contact$Companion$getAllWithDetails$122.result;
            Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            i = contact$Companion$getAllWithDetails$122.label;
            if (i != 0) {
            }
            Iterable iterable2 = (Iterable) obj2;
            ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable2, 10));
            it = iterable2.iterator();
            while (it.hasNext()) {
            }
            return arrayList2;
        }

        /* JADX WARN: Removed duplicated region for block: B:12:0x004a  */
        /* JADX WARN: Removed duplicated region for block: B:19:0x005c A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:22:0x0037  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object presentPicker(ContactIntentDelegate contactIntentDelegate, ContactFactory contactFactory, Continuation<? super Contact> continuation) {
            Contact$Companion$presentPicker$1 contact$Companion$presentPicker$1;
            int i;
            Uri uri;
            if (continuation instanceof Contact$Companion$presentPicker$1) {
                contact$Companion$presentPicker$1 = (Contact$Companion$presentPicker$1) continuation;
                if ((contact$Companion$presentPicker$1.label & Integer.MIN_VALUE) != 0) {
                    contact$Companion$presentPicker$1.label -= Integer.MIN_VALUE;
                    Object obj = contact$Companion$presentPicker$1.result;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = contact$Companion$presentPicker$1.label;
                    if (i != 0) {
                        ResultKt.throwOnFailure(obj);
                        contact$Companion$presentPicker$1.L$0 = contactFactory;
                        contact$Companion$presentPicker$1.label = 1;
                        obj = contactIntentDelegate.launchPickContact(contact$Companion$presentPicker$1);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        contactFactory = (ContactFactory) contact$Companion$presentPicker$1.L$0;
                        ResultKt.throwOnFailure(obj);
                    }
                    uri = (Uri) obj;
                    if (uri != null) {
                        return null;
                    }
                    String lastPathSegment = uri.getLastPathSegment();
                    if (lastPathSegment == null) {
                        throw new UnableToExtractIdFromUriException(uri, null, 2, null);
                    }
                    return contactFactory.create(lastPathSegment);
                }
            }
            contact$Companion$presentPicker$1 = new Contact$Companion$presentPicker$1(this, continuation);
            Object obj2 = contact$Companion$presentPicker$1.result;
            Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            i = contact$Companion$presentPicker$1.label;
            if (i != 0) {
            }
            uri = (Uri) obj2;
            if (uri != null) {
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:12:0x0047  */
        /* JADX WARN: Removed duplicated region for block: B:18:0x0032  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object hasAny(ContactRepository contactRepository, Continuation<? super Boolean> continuation) {
            Contact$Companion$hasAny$1 contact$Companion$hasAny$1;
            int i;
            if (continuation instanceof Contact$Companion$hasAny$1) {
                contact$Companion$hasAny$1 = (Contact$Companion$hasAny$1) continuation;
                if ((contact$Companion$hasAny$1.label & Integer.MIN_VALUE) != 0) {
                    contact$Companion$hasAny$1.label -= Integer.MIN_VALUE;
                    Object obj = contact$Companion$hasAny$1.result;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = contact$Companion$hasAny$1.label;
                    if (i != 0) {
                        ResultKt.throwOnFailure(obj);
                        contact$Companion$hasAny$1.label = 1;
                        obj = contactRepository.getCount(contact$Companion$hasAny$1);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                    }
                    return Boxing.boxBoolean(((Number) obj).intValue() > 0);
                }
            }
            contact$Companion$hasAny$1 = new Contact$Companion$hasAny$1(this, continuation);
            Object obj2 = contact$Companion$hasAny$1.result;
            Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            i = contact$Companion$hasAny$1.label;
            if (i != 0) {
            }
            return Boxing.boxBoolean(((Number) obj2).intValue() > 0);
        }

        public final Object getCount(ContactRepository contactRepository, Continuation<? super Integer> continuation) {
            return contactRepository.getCount(continuation);
        }
    }
}
