package expo.modules.contacts.next.domain.query;

import com.facebook.internal.AnalyticsEvents;
import expo.modules.contacts.Columns;
import expo.modules.contacts.next.domain.model.Extractable;
import expo.modules.contacts.next.domain.model.contact.ExistingContact;
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
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: QueryAggregator.kt */
@Metadata(d1 = {"\u0000 \u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010P\u001a\u00020Q2\b\u0010R\u001a\u0004\u0018\u00010SJ\u0006\u0010T\u001a\u00020UR\u0013\u0010\u0002\u001a\u00020\u0003¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u0006\u0010\u0007R\u001c\u0010\t\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u001cX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u001c\u0010!\u001a\u0004\u0018\u00010\"X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\u001c\u0010'\u001a\u0004\u0018\u00010(X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R\u001c\u0010-\u001a\u0004\u0018\u00010.X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b/\u00100\"\u0004\b1\u00102R\u001c\u00103\u001a\u0004\u0018\u000104X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b5\u00106\"\u0004\b7\u00108R\u0017\u00109\u001a\b\u0012\u0004\u0012\u00020;0:¢\u0006\b\n\u0000\u001a\u0004\b<\u0010=R\u0017\u0010>\u001a\b\u0012\u0004\u0012\u00020?0:¢\u0006\b\n\u0000\u001a\u0004\b@\u0010=R\u0017\u0010A\u001a\b\u0012\u0004\u0012\u00020B0:¢\u0006\b\n\u0000\u001a\u0004\bC\u0010=R\u0017\u0010D\u001a\b\u0012\u0004\u0012\u00020E0:¢\u0006\b\n\u0000\u001a\u0004\bF\u0010=R\u0017\u0010G\u001a\b\u0012\u0004\u0012\u00020H0:¢\u0006\b\n\u0000\u001a\u0004\bI\u0010=R\u0017\u0010J\u001a\b\u0012\u0004\u0012\u00020K0:¢\u0006\b\n\u0000\u001a\u0004\bL\u0010=R\u0017\u0010M\u001a\b\u0012\u0004\u0012\u00020N0:¢\u0006\b\n\u0000\u001a\u0004\bO\u0010=¨\u0006V"}, d2 = {"Lexpo/modules/contacts/next/domain/query/ContactModelBuilder;", "", "contactId", "Lexpo/modules/contacts/next/domain/wrappers/ContactId;", "<init>", "(Ljava/lang/String;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "getContactId-S9XCBSM", "()Ljava/lang/String;", "Ljava/lang/String;", "displayName", "Lexpo/modules/contacts/next/domain/model/headers/DisplayName;", "getDisplayName-akshqVY", "()Lexpo/modules/contacts/next/domain/model/headers/DisplayName;", "setDisplayName-WjT8qFk", "(Lexpo/modules/contacts/next/domain/model/headers/DisplayName;)V", Columns.STARRED, "Lexpo/modules/contacts/next/domain/model/headers/starred/Starred;", "getStarred-9dN_u_E", "()Lexpo/modules/contacts/next/domain/model/headers/starred/Starred;", "setStarred-uF3MqA4", "(Lexpo/modules/contacts/next/domain/model/headers/starred/Starred;)V", "photoUri", "Lexpo/modules/contacts/next/domain/model/headers/PhotoUri;", "getPhotoUri-zVP6rjE", "()Lexpo/modules/contacts/next/domain/model/headers/PhotoUri;", "setPhotoUri-Gr8pJqk", "(Lexpo/modules/contacts/next/domain/model/headers/PhotoUri;)V", "photoThumbnailUri", "Lexpo/modules/contacts/next/domain/model/headers/PhotoThumbnailUri;", "getPhotoThumbnailUri-fITejg0", "()Lexpo/modules/contacts/next/domain/model/headers/PhotoThumbnailUri;", "setPhotoThumbnailUri-Go4U3gQ", "(Lexpo/modules/contacts/next/domain/model/headers/PhotoThumbnailUri;)V", "structuredName", "Lexpo/modules/contacts/next/domain/model/structuredname/operations/ExistingStructuredName;", "getStructuredName", "()Lexpo/modules/contacts/next/domain/model/structuredname/operations/ExistingStructuredName;", "setStructuredName", "(Lexpo/modules/contacts/next/domain/model/structuredname/operations/ExistingStructuredName;)V", "organization", "Lexpo/modules/contacts/next/domain/model/organization/operations/ExistingOrganization;", "getOrganization", "()Lexpo/modules/contacts/next/domain/model/organization/operations/ExistingOrganization;", "setOrganization", "(Lexpo/modules/contacts/next/domain/model/organization/operations/ExistingOrganization;)V", "note", "Lexpo/modules/contacts/next/domain/model/note/operations/ExistingNote;", "getNote", "()Lexpo/modules/contacts/next/domain/model/note/operations/ExistingNote;", "setNote", "(Lexpo/modules/contacts/next/domain/model/note/operations/ExistingNote;)V", AnalyticsEvents.PARAMETER_SHARE_DIALOG_CONTENT_PHOTO, "Lexpo/modules/contacts/next/domain/model/photo/operations/ExistingPhoto;", "getPhoto", "()Lexpo/modules/contacts/next/domain/model/photo/operations/ExistingPhoto;", "setPhoto", "(Lexpo/modules/contacts/next/domain/model/photo/operations/ExistingPhoto;)V", "emails", "", "Lexpo/modules/contacts/next/domain/model/email/operations/ExistingEmail;", "getEmails", "()Ljava/util/List;", "events", "Lexpo/modules/contacts/next/domain/model/event/operations/ExistingEvent;", "getEvents", "nicknames", "Lexpo/modules/contacts/next/domain/model/nickname/operations/ExistingNickname;", "getNicknames", "phones", "Lexpo/modules/contacts/next/domain/model/phone/operations/ExistingPhone;", "getPhones", "relations", "Lexpo/modules/contacts/next/domain/model/relationship/operations/ExistingRelation;", "getRelations", "structuredPostals", "Lexpo/modules/contacts/next/domain/model/structuredpostal/operations/ExistingStructuredPostal;", "getStructuredPostals", "websites", "Lexpo/modules/contacts/next/domain/model/website/operations/ExistingWebsite;", "getWebsites", "addModel", "", "extractable", "Lexpo/modules/contacts/next/domain/model/Extractable;", "build", "Lexpo/modules/contacts/next/domain/model/contact/ExistingContact;", "expo-contacts_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class ContactModelBuilder {
    private final String contactId;
    private DisplayName displayName;
    private final List<ExistingEmail> emails;
    private final List<ExistingEvent> events;
    private final List<ExistingNickname> nicknames;
    private ExistingNote note;
    private ExistingOrganization organization;
    private final List<ExistingPhone> phones;
    private ExistingPhoto photo;
    private PhotoThumbnailUri photoThumbnailUri;
    private PhotoUri photoUri;
    private final List<ExistingRelation> relations;
    private Starred starred;
    private ExistingStructuredName structuredName;
    private final List<ExistingStructuredPostal> structuredPostals;
    private final List<ExistingWebsite> websites;

    public /* synthetic */ ContactModelBuilder(String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }

    private ContactModelBuilder(String contactId) {
        Intrinsics.checkNotNullParameter(contactId, "contactId");
        this.contactId = contactId;
        this.emails = new ArrayList();
        this.events = new ArrayList();
        this.nicknames = new ArrayList();
        this.phones = new ArrayList();
        this.relations = new ArrayList();
        this.structuredPostals = new ArrayList();
        this.websites = new ArrayList();
    }

    /* renamed from: getContactId-S9XCBSM, reason: not valid java name and from getter */
    public final String getContactId() {
        return this.contactId;
    }

    /* renamed from: getDisplayName-akshqVY, reason: not valid java name and from getter */
    public final DisplayName getDisplayName() {
        return this.displayName;
    }

    /* renamed from: setDisplayName-WjT8qFk, reason: not valid java name */
    public final void m11716setDisplayNameWjT8qFk(DisplayName displayName) {
        this.displayName = displayName;
    }

    /* renamed from: getStarred-9dN_u_E, reason: not valid java name and from getter */
    public final Starred getStarred() {
        return this.starred;
    }

    /* renamed from: setStarred-uF3MqA4, reason: not valid java name */
    public final void m11719setStarreduF3MqA4(Starred starred) {
        this.starred = starred;
    }

    /* renamed from: getPhotoUri-zVP6rjE, reason: not valid java name and from getter */
    public final PhotoUri getPhotoUri() {
        return this.photoUri;
    }

    /* renamed from: setPhotoUri-Gr8pJqk, reason: not valid java name */
    public final void m11718setPhotoUriGr8pJqk(PhotoUri photoUri) {
        this.photoUri = photoUri;
    }

    /* renamed from: getPhotoThumbnailUri-fITejg0, reason: not valid java name and from getter */
    public final PhotoThumbnailUri getPhotoThumbnailUri() {
        return this.photoThumbnailUri;
    }

    /* renamed from: setPhotoThumbnailUri-Go4U3gQ, reason: not valid java name */
    public final void m11717setPhotoThumbnailUriGo4U3gQ(PhotoThumbnailUri photoThumbnailUri) {
        this.photoThumbnailUri = photoThumbnailUri;
    }

    public final ExistingStructuredName getStructuredName() {
        return this.structuredName;
    }

    public final void setStructuredName(ExistingStructuredName existingStructuredName) {
        this.structuredName = existingStructuredName;
    }

    public final ExistingOrganization getOrganization() {
        return this.organization;
    }

    public final void setOrganization(ExistingOrganization existingOrganization) {
        this.organization = existingOrganization;
    }

    public final ExistingNote getNote() {
        return this.note;
    }

    public final void setNote(ExistingNote existingNote) {
        this.note = existingNote;
    }

    public final ExistingPhoto getPhoto() {
        return this.photo;
    }

    public final void setPhoto(ExistingPhoto existingPhoto) {
        this.photo = existingPhoto;
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

    public final void addModel(Extractable extractable) {
        if (extractable instanceof Starred) {
            this.starred = (Starred) extractable;
            return;
        }
        if (extractable instanceof DisplayName) {
            this.displayName = (DisplayName) extractable;
            return;
        }
        if (extractable instanceof PhotoUri) {
            this.photoUri = (PhotoUri) extractable;
            return;
        }
        if (extractable instanceof PhotoThumbnailUri) {
            this.photoThumbnailUri = (PhotoThumbnailUri) extractable;
            return;
        }
        if (extractable instanceof ExistingStructuredName) {
            this.structuredName = (ExistingStructuredName) extractable;
            return;
        }
        if (extractable instanceof ExistingOrganization) {
            this.organization = (ExistingOrganization) extractable;
            return;
        }
        if (extractable instanceof ExistingNote) {
            this.note = (ExistingNote) extractable;
            return;
        }
        if (extractable instanceof ExistingPhoto) {
            this.photo = (ExistingPhoto) extractable;
            return;
        }
        if (extractable instanceof ExistingEmail) {
            this.emails.add(extractable);
            return;
        }
        if (extractable instanceof ExistingEvent) {
            this.events.add(extractable);
            return;
        }
        if (extractable instanceof ExistingNickname) {
            this.nicknames.add(extractable);
            return;
        }
        if (extractable instanceof ExistingPhone) {
            this.phones.add(extractable);
            return;
        }
        if (extractable instanceof ExistingRelation) {
            this.relations.add(extractable);
        } else if (extractable instanceof ExistingStructuredPostal) {
            this.structuredPostals.add(extractable);
        } else if (extractable instanceof ExistingWebsite) {
            this.websites.add(extractable);
        }
    }

    public final ExistingContact build() {
        return new ExistingContact(this.contactId, this.displayName, this.starred, this.photoUri, this.photoThumbnailUri, this.structuredName, this.organization, this.photo, this.note, this.emails, this.events, this.nicknames, this.phones, this.relations, this.structuredPostals, this.websites, null);
    }
}
