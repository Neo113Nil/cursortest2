package expo.modules.contacts.next.domain.model;

import android.database.Cursor;
import androidx.exifinterface.media.ExifInterface;
import expo.modules.contacts.next.domain.model.Extractable;
import expo.modules.contacts.next.domain.model.email.EmailField;
import expo.modules.contacts.next.domain.model.event.EventField;
import expo.modules.contacts.next.domain.model.headers.DisplayNameField;
import expo.modules.contacts.next.domain.model.headers.PhotoThumbnailUriField;
import expo.modules.contacts.next.domain.model.headers.PhotoUriField;
import expo.modules.contacts.next.domain.model.headers.starred.StarredField;
import expo.modules.contacts.next.domain.model.nickname.NicknameField;
import expo.modules.contacts.next.domain.model.note.NoteField;
import expo.modules.contacts.next.domain.model.organization.OrganizationField;
import expo.modules.contacts.next.domain.model.phone.PhoneField;
import expo.modules.contacts.next.domain.model.photo.PhotoField;
import expo.modules.contacts.next.domain.model.relationship.RelationField;
import expo.modules.contacts.next.domain.model.structuredname.StructuredNameField;
import expo.modules.contacts.next.domain.model.structuredpostal.StructuredPostalField;
import expo.modules.contacts.next.domain.model.website.WebsiteField;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.SetsKt;

/* compiled from: ExtractableField.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u0000 \u000f*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0003:\u0003\r\u000e\u000fJ\u0015\u0010\t\u001a\u00028\u00002\u0006\u0010\n\u001a\u00020\u000bH&¢\u0006\u0002\u0010\fR\u0018\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b\u0082\u0001\u0002\u0010\u0011¨\u0006\u0012"}, d2 = {"Lexpo/modules/contacts/next/domain/model/ExtractableField;", ExifInterface.GPS_DIRECTION_TRUE, "Lexpo/modules/contacts/next/domain/model/Extractable;", "", "projection", "", "", "getProjection", "()[Ljava/lang/String;", "extract", "cursor", "Landroid/database/Cursor;", "(Landroid/database/Cursor;)Lexpo/modules/contacts/next/domain/model/Extractable;", "Data", "Contacts", "Companion", "Lexpo/modules/contacts/next/domain/model/ExtractableField$Contacts;", "Lexpo/modules/contacts/next/domain/model/ExtractableField$Data;", "expo-contacts_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public interface ExtractableField<T extends Extractable> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    /* compiled from: ExtractableField.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u0000*\b\b\u0001\u0010\u0001*\u00020\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003¨\u0006\u0004"}, d2 = {"Lexpo/modules/contacts/next/domain/model/ExtractableField$Contacts;", ExifInterface.GPS_DIRECTION_TRUE, "Lexpo/modules/contacts/next/domain/model/Extractable;", "Lexpo/modules/contacts/next/domain/model/ExtractableField;", "expo-contacts_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface Contacts<T extends Extractable> extends ExtractableField<T> {
    }

    /* compiled from: ExtractableField.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\bf\u0018\u0000*\b\b\u0001\u0010\u0001*\u00020\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003R\u0012\u0010\u0004\u001a\u00020\u0005X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lexpo/modules/contacts/next/domain/model/ExtractableField$Data;", ExifInterface.GPS_DIRECTION_TRUE, "Lexpo/modules/contacts/next/domain/model/Extractable$Data;", "Lexpo/modules/contacts/next/domain/model/ExtractableField;", "mimeType", "", "getMimeType", "()Ljava/lang/String;", "expo-contacts_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface Data<T extends Extractable.Data> extends ExtractableField<T> {
        String getMimeType();
    }

    T extract(Cursor cursor);

    String[] getProjection();

    /* compiled from: ExtractableField.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005¨\u0006\u0007"}, d2 = {"Lexpo/modules/contacts/next/domain/model/ExtractableField$Companion;", "", "<init>", "()V", "getAll", "", "Lexpo/modules/contacts/next/domain/model/ExtractableField;", "expo-contacts_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        public final Set<ExtractableField<?>> getAll() {
            return SetsKt.setOf((Object[]) new ExtractableField[]{StarredField.INSTANCE, DisplayNameField.INSTANCE, StructuredNameField.INSTANCE, OrganizationField.INSTANCE, NoteField.INSTANCE, PhotoField.INSTANCE, PhotoThumbnailUriField.INSTANCE, PhotoUriField.INSTANCE, EmailField.INSTANCE, PhoneField.INSTANCE, StructuredPostalField.INSTANCE, EventField.INSTANCE, RelationField.INSTANCE, WebsiteField.INSTANCE, NicknameField.INSTANCE});
        }
    }
}
