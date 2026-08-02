package expo.modules.contacts.next.domain.model.contact;

import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.facebook.internal.AnalyticsEvents;
import expo.modules.contacts.Columns;
import expo.modules.contacts.next.domain.model.email.operations.ExistingEmail;
import expo.modules.contacts.next.domain.model.event.operations.ExistingEvent;
import expo.modules.contacts.next.domain.model.headers.DisplayName;
import expo.modules.contacts.next.domain.model.headers.PhotoThumbnailUri;
import expo.modules.contacts.next.domain.model.headers.PhotoUri;
import expo.modules.contacts.next.domain.model.headers.starred.Starred;
import expo.modules.contacts.next.domain.model.nickname.operations.ExistingNickname;
import expo.modules.contacts.next.domain.model.note.operations.ExistingNote;
import expo.modules.contacts.next.domain.model.organization.operations.ExistingOrganization;
import expo.modules.contacts.next.domain.model.phone.operations.ExistingPhone;
import expo.modules.contacts.next.domain.model.photo.operations.ExistingPhoto;
import expo.modules.contacts.next.domain.model.relationship.operations.ExistingRelation;
import expo.modules.contacts.next.domain.model.structuredname.operations.ExistingStructuredName;
import expo.modules.contacts.next.domain.model.structuredpostal.operations.ExistingStructuredPostal;
import expo.modules.contacts.next.domain.model.website.operations.ExistingWebsite;
import expo.modules.contacts.next.domain.wrappers.ContactId;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ExistingContact.kt */
@Metadata(d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b6\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001Bß\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0013\u0012\u000e\b\u0002\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015\u0012\u000e\b\u0002\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00180\u0015\u0012\u000e\b\u0002\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0015\u0012\u000e\b\u0002\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001c0\u0015\u0012\u000e\b\u0002\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001e0\u0015\u0012\u000e\b\u0002\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020 0\u0015\u0012\u000e\b\u0002\u0010!\u001a\b\u0012\u0004\u0012\u00020\"0\u0015¢\u0006\u0004\b#\u0010$J\u0010\u0010@\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\bA\u0010&J\u0010\u0010B\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\bCJ\u0010\u0010D\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\bEJ\u0010\u0010F\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\bGJ\u0010\u0010H\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0002\bIJ\u000b\u0010J\u001a\u0004\u0018\u00010\rHÆ\u0003J\u000b\u0010K\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\u000b\u0010L\u001a\u0004\u0018\u00010\u0011HÆ\u0003J\u000b\u0010M\u001a\u0004\u0018\u00010\u0013HÆ\u0003J\u000f\u0010N\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015HÆ\u0003J\u000f\u0010O\u001a\b\u0012\u0004\u0012\u00020\u00180\u0015HÆ\u0003J\u000f\u0010P\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0015HÆ\u0003J\u000f\u0010Q\u001a\b\u0012\u0004\u0012\u00020\u001c0\u0015HÆ\u0003J\u000f\u0010R\u001a\b\u0012\u0004\u0012\u00020\u001e0\u0015HÆ\u0003J\u000f\u0010S\u001a\b\u0012\u0004\u0012\u00020 0\u0015HÆ\u0003J\u000f\u0010T\u001a\b\u0012\u0004\u0012\u00020\"0\u0015HÆ\u0003Jê\u0001\u0010U\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00132\u000e\b\u0002\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00160\u00152\u000e\b\u0002\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00180\u00152\u000e\b\u0002\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00152\u000e\b\u0002\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001c0\u00152\u000e\b\u0002\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001e0\u00152\u000e\b\u0002\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020 0\u00152\u000e\b\u0002\u0010!\u001a\b\u0012\u0004\u0012\u00020\"0\u0015HÆ\u0001¢\u0006\u0004\bV\u0010WJ\u0013\u0010X\u001a\u00020Y2\b\u0010Z\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010[\u001a\u00020\\HÖ\u0001J\t\u0010]\u001a\u00020^HÖ\u0001R\u0013\u0010\u0002\u001a\u00020\u0003¢\u0006\n\n\u0002\u0010'\u001a\u0004\b%\u0010&R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b(\u0010)R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b*\u0010+R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b,\u0010-R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b.\u0010/R\u0013\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b0\u00101R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b2\u00103R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\b\n\u0000\u001a\u0004\b4\u00105R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0013¢\u0006\b\n\u0000\u001a\u0004\b6\u00107R\u0017\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015¢\u0006\b\n\u0000\u001a\u0004\b8\u00109R\u0017\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00180\u0015¢\u0006\b\n\u0000\u001a\u0004\b:\u00109R\u0017\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0015¢\u0006\b\n\u0000\u001a\u0004\b;\u00109R\u0017\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001c0\u0015¢\u0006\b\n\u0000\u001a\u0004\b<\u00109R\u0017\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001e0\u0015¢\u0006\b\n\u0000\u001a\u0004\b=\u00109R\u0017\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020 0\u0015¢\u0006\b\n\u0000\u001a\u0004\b>\u00109R\u0017\u0010!\u001a\b\u0012\u0004\u0012\u00020\"0\u0015¢\u0006\b\n\u0000\u001a\u0004\b?\u00109¨\u0006_"}, d2 = {"Lexpo/modules/contacts/next/domain/model/contact/ExistingContact;", "", "contactId", "Lexpo/modules/contacts/next/domain/wrappers/ContactId;", "displayName", "Lexpo/modules/contacts/next/domain/model/headers/DisplayName;", Columns.STARRED, "Lexpo/modules/contacts/next/domain/model/headers/starred/Starred;", "photoUri", "Lexpo/modules/contacts/next/domain/model/headers/PhotoUri;", "photoThumbnailUri", "Lexpo/modules/contacts/next/domain/model/headers/PhotoThumbnailUri;", "structuredName", "Lexpo/modules/contacts/next/domain/model/structuredname/operations/ExistingStructuredName;", "organization", "Lexpo/modules/contacts/next/domain/model/organization/operations/ExistingOrganization;", AnalyticsEvents.PARAMETER_SHARE_DIALOG_CONTENT_PHOTO, "Lexpo/modules/contacts/next/domain/model/photo/operations/ExistingPhoto;", "note", "Lexpo/modules/contacts/next/domain/model/note/operations/ExistingNote;", "emails", "", "Lexpo/modules/contacts/next/domain/model/email/operations/ExistingEmail;", "events", "Lexpo/modules/contacts/next/domain/model/event/operations/ExistingEvent;", "nicknames", "Lexpo/modules/contacts/next/domain/model/nickname/operations/ExistingNickname;", "phones", "Lexpo/modules/contacts/next/domain/model/phone/operations/ExistingPhone;", "relations", "Lexpo/modules/contacts/next/domain/model/relationship/operations/ExistingRelation;", "structuredPostals", "Lexpo/modules/contacts/next/domain/model/structuredpostal/operations/ExistingStructuredPostal;", "websites", "Lexpo/modules/contacts/next/domain/model/website/operations/ExistingWebsite;", "<init>", "(Ljava/lang/String;Lexpo/modules/contacts/next/domain/model/headers/DisplayName;Lexpo/modules/contacts/next/domain/model/headers/starred/Starred;Lexpo/modules/contacts/next/domain/model/headers/PhotoUri;Lexpo/modules/contacts/next/domain/model/headers/PhotoThumbnailUri;Lexpo/modules/contacts/next/domain/model/structuredname/operations/ExistingStructuredName;Lexpo/modules/contacts/next/domain/model/organization/operations/ExistingOrganization;Lexpo/modules/contacts/next/domain/model/photo/operations/ExistingPhoto;Lexpo/modules/contacts/next/domain/model/note/operations/ExistingNote;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "getContactId-S9XCBSM", "()Ljava/lang/String;", "Ljava/lang/String;", "getDisplayName-akshqVY", "()Lexpo/modules/contacts/next/domain/model/headers/DisplayName;", "getStarred-9dN_u_E", "()Lexpo/modules/contacts/next/domain/model/headers/starred/Starred;", "getPhotoUri-zVP6rjE", "()Lexpo/modules/contacts/next/domain/model/headers/PhotoUri;", "getPhotoThumbnailUri-fITejg0", "()Lexpo/modules/contacts/next/domain/model/headers/PhotoThumbnailUri;", "getStructuredName", "()Lexpo/modules/contacts/next/domain/model/structuredname/operations/ExistingStructuredName;", "getOrganization", "()Lexpo/modules/contacts/next/domain/model/organization/operations/ExistingOrganization;", "getPhoto", "()Lexpo/modules/contacts/next/domain/model/photo/operations/ExistingPhoto;", "getNote", "()Lexpo/modules/contacts/next/domain/model/note/operations/ExistingNote;", "getEmails", "()Ljava/util/List;", "getEvents", "getNicknames", "getPhones", "getRelations", "getStructuredPostals", "getWebsites", "component1", "component1-S9XCBSM", "component2", "component2-akshqVY", "component3", "component3-9dN_u_E", "component4", "component4-zVP6rjE", "component5", "component5-fITejg0", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "copy", "copy-ltZXQY0", "(Ljava/lang/String;Lexpo/modules/contacts/next/domain/model/headers/DisplayName;Lexpo/modules/contacts/next/domain/model/headers/starred/Starred;Lexpo/modules/contacts/next/domain/model/headers/PhotoUri;Lexpo/modules/contacts/next/domain/model/headers/PhotoThumbnailUri;Lexpo/modules/contacts/next/domain/model/structuredname/operations/ExistingStructuredName;Lexpo/modules/contacts/next/domain/model/organization/operations/ExistingOrganization;Lexpo/modules/contacts/next/domain/model/photo/operations/ExistingPhoto;Lexpo/modules/contacts/next/domain/model/note/operations/ExistingNote;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;)Lexpo/modules/contacts/next/domain/model/contact/ExistingContact;", "equals", "", "other", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "", "expo-contacts_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class ExistingContact {
    private final String contactId;
    private final DisplayName displayName;
    private final List<ExistingEmail> emails;
    private final List<ExistingEvent> events;
    private final List<ExistingNickname> nicknames;
    private final ExistingNote note;
    private final ExistingOrganization organization;
    private final List<ExistingPhone> phones;
    private final ExistingPhoto photo;
    private final PhotoThumbnailUri photoThumbnailUri;
    private final PhotoUri photoUri;
    private final List<ExistingRelation> relations;
    private final Starred starred;
    private final ExistingStructuredName structuredName;
    private final List<ExistingStructuredPostal> structuredPostals;
    private final List<ExistingWebsite> websites;

    public /* synthetic */ ExistingContact(String str, DisplayName displayName, Starred starred, PhotoUri photoUri, PhotoThumbnailUri photoThumbnailUri, ExistingStructuredName existingStructuredName, ExistingOrganization existingOrganization, ExistingPhoto existingPhoto, ExistingNote existingNote, List list, List list2, List list3, List list4, List list5, List list6, List list7, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, displayName, starred, photoUri, photoThumbnailUri, existingStructuredName, existingOrganization, existingPhoto, existingNote, list, list2, list3, list4, list5, list6, list7);
    }

    /* renamed from: copy-ltZXQY0$default, reason: not valid java name */
    public static /* synthetic */ ExistingContact m11661copyltZXQY0$default(ExistingContact existingContact, String str, DisplayName displayName, Starred starred, PhotoUri photoUri, PhotoThumbnailUri photoThumbnailUri, ExistingStructuredName existingStructuredName, ExistingOrganization existingOrganization, ExistingPhoto existingPhoto, ExistingNote existingNote, List list, List list2, List list3, List list4, List list5, List list6, List list7, int i, Object obj) {
        String str2 = (i & 1) != 0 ? existingContact.contactId : str;
        return existingContact.m11667copyltZXQY0(str2, (i & 2) != 0 ? existingContact.displayName : displayName, (i & 4) != 0 ? existingContact.starred : starred, (i & 8) != 0 ? existingContact.photoUri : photoUri, (i & 16) != 0 ? existingContact.photoThumbnailUri : photoThumbnailUri, (i & 32) != 0 ? existingContact.structuredName : existingStructuredName, (i & 64) != 0 ? existingContact.organization : existingOrganization, (i & 128) != 0 ? existingContact.photo : existingPhoto, (i & 256) != 0 ? existingContact.note : existingNote, (i & 512) != 0 ? existingContact.emails : list, (i & 1024) != 0 ? existingContact.events : list2, (i & 2048) != 0 ? existingContact.nicknames : list3, (i & 4096) != 0 ? existingContact.phones : list4, (i & 8192) != 0 ? existingContact.relations : list5, (i & 16384) != 0 ? existingContact.structuredPostals : list6, (i & 32768) != 0 ? existingContact.websites : list7);
    }

    /* renamed from: component1-S9XCBSM, reason: not valid java name and from getter */
    public final String getContactId() {
        return this.contactId;
    }

    public final List<ExistingEmail> component10() {
        return this.emails;
    }

    public final List<ExistingEvent> component11() {
        return this.events;
    }

    public final List<ExistingNickname> component12() {
        return this.nicknames;
    }

    public final List<ExistingPhone> component13() {
        return this.phones;
    }

    public final List<ExistingRelation> component14() {
        return this.relations;
    }

    public final List<ExistingStructuredPostal> component15() {
        return this.structuredPostals;
    }

    public final List<ExistingWebsite> component16() {
        return this.websites;
    }

    /* renamed from: component2-akshqVY, reason: not valid java name and from getter */
    public final DisplayName getDisplayName() {
        return this.displayName;
    }

    /* renamed from: component3-9dN_u_E, reason: not valid java name and from getter */
    public final Starred getStarred() {
        return this.starred;
    }

    /* renamed from: component4-zVP6rjE, reason: not valid java name and from getter */
    public final PhotoUri getPhotoUri() {
        return this.photoUri;
    }

    /* renamed from: component5-fITejg0, reason: not valid java name and from getter */
    public final PhotoThumbnailUri getPhotoThumbnailUri() {
        return this.photoThumbnailUri;
    }

    /* renamed from: component6, reason: from getter */
    public final ExistingStructuredName getStructuredName() {
        return this.structuredName;
    }

    /* renamed from: component7, reason: from getter */
    public final ExistingOrganization getOrganization() {
        return this.organization;
    }

    /* renamed from: component8, reason: from getter */
    public final ExistingPhoto getPhoto() {
        return this.photo;
    }

    /* renamed from: component9, reason: from getter */
    public final ExistingNote getNote() {
        return this.note;
    }

    /* renamed from: copy-ltZXQY0, reason: not valid java name */
    public final ExistingContact m11667copyltZXQY0(String contactId, DisplayName displayName, Starred starred, PhotoUri photoUri, PhotoThumbnailUri photoThumbnailUri, ExistingStructuredName structuredName, ExistingOrganization organization, ExistingPhoto photo, ExistingNote note, List<ExistingEmail> emails, List<ExistingEvent> events, List<ExistingNickname> nicknames, List<ExistingPhone> phones, List<ExistingRelation> relations, List<ExistingStructuredPostal> structuredPostals, List<ExistingWebsite> websites) {
        Intrinsics.checkNotNullParameter(contactId, "contactId");
        Intrinsics.checkNotNullParameter(emails, "emails");
        Intrinsics.checkNotNullParameter(events, "events");
        Intrinsics.checkNotNullParameter(nicknames, "nicknames");
        Intrinsics.checkNotNullParameter(phones, "phones");
        Intrinsics.checkNotNullParameter(relations, "relations");
        Intrinsics.checkNotNullParameter(structuredPostals, "structuredPostals");
        Intrinsics.checkNotNullParameter(websites, "websites");
        return new ExistingContact(contactId, displayName, starred, photoUri, photoThumbnailUri, structuredName, organization, photo, note, emails, events, nicknames, phones, relations, structuredPostals, websites, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ExistingContact)) {
            return false;
        }
        ExistingContact existingContact = (ExistingContact) other;
        return ContactId.m11734equalsimpl0(this.contactId, existingContact.contactId) && Intrinsics.areEqual(this.displayName, existingContact.displayName) && Intrinsics.areEqual(this.starred, existingContact.starred) && Intrinsics.areEqual(this.photoUri, existingContact.photoUri) && Intrinsics.areEqual(this.photoThumbnailUri, existingContact.photoThumbnailUri) && Intrinsics.areEqual(this.structuredName, existingContact.structuredName) && Intrinsics.areEqual(this.organization, existingContact.organization) && Intrinsics.areEqual(this.photo, existingContact.photo) && Intrinsics.areEqual(this.note, existingContact.note) && Intrinsics.areEqual(this.emails, existingContact.emails) && Intrinsics.areEqual(this.events, existingContact.events) && Intrinsics.areEqual(this.nicknames, existingContact.nicknames) && Intrinsics.areEqual(this.phones, existingContact.phones) && Intrinsics.areEqual(this.relations, existingContact.relations) && Intrinsics.areEqual(this.structuredPostals, existingContact.structuredPostals) && Intrinsics.areEqual(this.websites, existingContact.websites);
    }

    public int hashCode() {
        int m11735hashCodeimpl = ContactId.m11735hashCodeimpl(this.contactId) * 31;
        DisplayName displayName = this.displayName;
        int m11683hashCodeimpl = (m11735hashCodeimpl + (displayName == null ? 0 : DisplayName.m11683hashCodeimpl(displayName.m11685unboximpl()))) * 31;
        Starred starred = this.starred;
        int m11707hashCodeimpl = (m11683hashCodeimpl + (starred == null ? 0 : Starred.m11707hashCodeimpl(starred.m11709unboximpl()))) * 31;
        PhotoUri photoUri = this.photoUri;
        int m11699hashCodeimpl = (m11707hashCodeimpl + (photoUri == null ? 0 : PhotoUri.m11699hashCodeimpl(photoUri.m11701unboximpl()))) * 31;
        PhotoThumbnailUri photoThumbnailUri = this.photoThumbnailUri;
        int m11691hashCodeimpl = (m11699hashCodeimpl + (photoThumbnailUri == null ? 0 : PhotoThumbnailUri.m11691hashCodeimpl(photoThumbnailUri.m11693unboximpl()))) * 31;
        ExistingStructuredName existingStructuredName = this.structuredName;
        int hashCode = (m11691hashCodeimpl + (existingStructuredName == null ? 0 : existingStructuredName.hashCode())) * 31;
        ExistingOrganization existingOrganization = this.organization;
        int hashCode2 = (hashCode + (existingOrganization == null ? 0 : existingOrganization.hashCode())) * 31;
        ExistingPhoto existingPhoto = this.photo;
        int hashCode3 = (hashCode2 + (existingPhoto == null ? 0 : existingPhoto.hashCode())) * 31;
        ExistingNote existingNote = this.note;
        return ((((((((((((((hashCode3 + (existingNote != null ? existingNote.hashCode() : 0)) * 31) + this.emails.hashCode()) * 31) + this.events.hashCode()) * 31) + this.nicknames.hashCode()) * 31) + this.phones.hashCode()) * 31) + this.relations.hashCode()) * 31) + this.structuredPostals.hashCode()) * 31) + this.websites.hashCode();
    }

    public String toString() {
        return "ExistingContact(contactId=" + ContactId.m11736toStringimpl(this.contactId) + ", displayName=" + this.displayName + ", starred=" + this.starred + ", photoUri=" + this.photoUri + ", photoThumbnailUri=" + this.photoThumbnailUri + ", structuredName=" + this.structuredName + ", organization=" + this.organization + ", photo=" + this.photo + ", note=" + this.note + ", emails=" + this.emails + ", events=" + this.events + ", nicknames=" + this.nicknames + ", phones=" + this.phones + ", relations=" + this.relations + ", structuredPostals=" + this.structuredPostals + ", websites=" + this.websites + ")";
    }

    private ExistingContact(String contactId, DisplayName displayName, Starred starred, PhotoUri photoUri, PhotoThumbnailUri photoThumbnailUri, ExistingStructuredName existingStructuredName, ExistingOrganization existingOrganization, ExistingPhoto existingPhoto, ExistingNote existingNote, List<ExistingEmail> emails, List<ExistingEvent> events, List<ExistingNickname> nicknames, List<ExistingPhone> phones, List<ExistingRelation> relations, List<ExistingStructuredPostal> structuredPostals, List<ExistingWebsite> websites) {
        Intrinsics.checkNotNullParameter(contactId, "contactId");
        Intrinsics.checkNotNullParameter(emails, "emails");
        Intrinsics.checkNotNullParameter(events, "events");
        Intrinsics.checkNotNullParameter(nicknames, "nicknames");
        Intrinsics.checkNotNullParameter(phones, "phones");
        Intrinsics.checkNotNullParameter(relations, "relations");
        Intrinsics.checkNotNullParameter(structuredPostals, "structuredPostals");
        Intrinsics.checkNotNullParameter(websites, "websites");
        this.contactId = contactId;
        this.displayName = displayName;
        this.starred = starred;
        this.photoUri = photoUri;
        this.photoThumbnailUri = photoThumbnailUri;
        this.structuredName = existingStructuredName;
        this.organization = existingOrganization;
        this.photo = existingPhoto;
        this.note = existingNote;
        this.emails = emails;
        this.events = events;
        this.nicknames = nicknames;
        this.phones = phones;
        this.relations = relations;
        this.structuredPostals = structuredPostals;
        this.websites = websites;
    }

    /* renamed from: getContactId-S9XCBSM, reason: not valid java name */
    public final String m11668getContactIdS9XCBSM() {
        return this.contactId;
    }

    /* renamed from: getDisplayName-akshqVY, reason: not valid java name */
    public final DisplayName m11669getDisplayNameakshqVY() {
        return this.displayName;
    }

    /* renamed from: getStarred-9dN_u_E, reason: not valid java name */
    public final Starred m11672getStarred9dN_u_E() {
        return this.starred;
    }

    /* renamed from: getPhotoUri-zVP6rjE, reason: not valid java name */
    public final PhotoUri m11671getPhotoUrizVP6rjE() {
        return this.photoUri;
    }

    /* renamed from: getPhotoThumbnailUri-fITejg0, reason: not valid java name */
    public final PhotoThumbnailUri m11670getPhotoThumbnailUrifITejg0() {
        return this.photoThumbnailUri;
    }

    public final ExistingStructuredName getStructuredName() {
        return this.structuredName;
    }

    public final ExistingOrganization getOrganization() {
        return this.organization;
    }

    public final ExistingPhoto getPhoto() {
        return this.photo;
    }

    public final ExistingNote getNote() {
        return this.note;
    }

    public /* synthetic */ ExistingContact(String str, DisplayName displayName, Starred starred, PhotoUri photoUri, PhotoThumbnailUri photoThumbnailUri, ExistingStructuredName existingStructuredName, ExistingOrganization existingOrganization, ExistingPhoto existingPhoto, ExistingNote existingNote, List list, List list2, List list3, List list4, List list5, List list6, List list7, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : displayName, (i & 4) != 0 ? null : starred, (i & 8) != 0 ? null : photoUri, (i & 16) != 0 ? null : photoThumbnailUri, (i & 32) != 0 ? null : existingStructuredName, (i & 64) != 0 ? null : existingOrganization, (i & 128) != 0 ? null : existingPhoto, (i & 256) != 0 ? null : existingNote, (i & 512) != 0 ? CollectionsKt.emptyList() : list, (i & 1024) != 0 ? CollectionsKt.emptyList() : list2, (i & 2048) != 0 ? CollectionsKt.emptyList() : list3, (i & 4096) != 0 ? CollectionsKt.emptyList() : list4, (i & 8192) != 0 ? CollectionsKt.emptyList() : list5, (i & 16384) != 0 ? CollectionsKt.emptyList() : list6, (i & 32768) != 0 ? CollectionsKt.emptyList() : list7, null);
    }

    public final List<ExistingEmail> getEmails() {
        return this.emails;
    }

    public final List<ExistingEvent> getEvents() {
        return this.events;
    }

    public final List<ExistingNickname> getNicknames() {
        return this.nicknames;
    }

    public final List<ExistingPhone> getPhones() {
        return this.phones;
    }

    public final List<ExistingRelation> getRelations() {
        return this.relations;
    }

    public final List<ExistingStructuredPostal> getStructuredPostals() {
        return this.structuredPostals;
    }

    public final List<ExistingWebsite> getWebsites() {
        return this.websites;
    }
}
