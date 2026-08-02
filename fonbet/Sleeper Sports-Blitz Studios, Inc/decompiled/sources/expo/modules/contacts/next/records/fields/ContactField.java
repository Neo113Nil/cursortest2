package expo.modules.contacts.next.records.fields;

import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.facebook.share.internal.ShareConstants;
import expo.modules.kotlin.types.Enumerable;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ContactField.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b!\b\u0086\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!j\u0002\b\"j\u0002\b#j\u0002\b$¨\u0006%"}, d2 = {"Lexpo/modules/contacts/next/records/fields/ContactField;", "Lexpo/modules/kotlin/types/Enumerable;", "", SDKConstants.PARAM_KEY, "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getKey", "()Ljava/lang/String;", "IS_FAVOURITE", "FULL_NAME", "GIVEN_NAME", "MIDDLE_NAME", "FAMILY_NAME", "PREFIX", "SUFFIX", "PHONETIC_GIVEN_NAME", "PHONETIC_MIDDLE_NAME", "PHONETIC_FAMILY_NAME", "COMPANY", "DEPARTMENT", "JOB_TITLE", "PHONETIC_COMPANY_NAME", "NOTE", ShareConstants.IMAGE_URL, "THUMBNAIL", "EMAILS", "PHONES", "ADDRESSES", "DATES", "RELATIONS", "URL_ADDRESSES", "EXTRA_NAMES", "MAIDEN_NAME", "NICKNAME", "IM_ADDRESS", "SOCIAL_PROFILES", "expo-contacts_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class ContactField implements Enumerable {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ ContactField[] $VALUES;
    private final String key;
    public static final ContactField IS_FAVOURITE = new ContactField("IS_FAVOURITE", 0, "isFavourite");
    public static final ContactField FULL_NAME = new ContactField("FULL_NAME", 1, "fullName");
    public static final ContactField GIVEN_NAME = new ContactField("GIVEN_NAME", 2, "givenName");
    public static final ContactField MIDDLE_NAME = new ContactField("MIDDLE_NAME", 3, "middleName");
    public static final ContactField FAMILY_NAME = new ContactField("FAMILY_NAME", 4, "familyName");
    public static final ContactField PREFIX = new ContactField("PREFIX", 5, "prefix");
    public static final ContactField SUFFIX = new ContactField("SUFFIX", 6, "suffix");
    public static final ContactField PHONETIC_GIVEN_NAME = new ContactField("PHONETIC_GIVEN_NAME", 7, "phoneticGivenName");
    public static final ContactField PHONETIC_MIDDLE_NAME = new ContactField("PHONETIC_MIDDLE_NAME", 8, "phoneticMiddleName");
    public static final ContactField PHONETIC_FAMILY_NAME = new ContactField("PHONETIC_FAMILY_NAME", 9, "phoneticFamilyName");
    public static final ContactField COMPANY = new ContactField("COMPANY", 10, "company");
    public static final ContactField DEPARTMENT = new ContactField("DEPARTMENT", 11, "department");
    public static final ContactField JOB_TITLE = new ContactField("JOB_TITLE", 12, "jobTitle");
    public static final ContactField PHONETIC_COMPANY_NAME = new ContactField("PHONETIC_COMPANY_NAME", 13, "phoneticCompanyName");
    public static final ContactField NOTE = new ContactField("NOTE", 14, "note");
    public static final ContactField IMAGE = new ContactField(ShareConstants.IMAGE_URL, 15, "image");
    public static final ContactField THUMBNAIL = new ContactField("THUMBNAIL", 16, "thumbnail");
    public static final ContactField EMAILS = new ContactField("EMAILS", 17, "emails");
    public static final ContactField PHONES = new ContactField("PHONES", 18, "phones");
    public static final ContactField ADDRESSES = new ContactField("ADDRESSES", 19, "addresses");
    public static final ContactField DATES = new ContactField("DATES", 20, "dates");
    public static final ContactField RELATIONS = new ContactField("RELATIONS", 21, "relations");
    public static final ContactField URL_ADDRESSES = new ContactField("URL_ADDRESSES", 22, "urlAddresses");
    public static final ContactField EXTRA_NAMES = new ContactField("EXTRA_NAMES", 23, "extraNames");
    public static final ContactField MAIDEN_NAME = new ContactField("MAIDEN_NAME", 24, "maidenName");
    public static final ContactField NICKNAME = new ContactField("NICKNAME", 25, "nickname");
    public static final ContactField IM_ADDRESS = new ContactField("IM_ADDRESS", 26, "imAddresses");
    public static final ContactField SOCIAL_PROFILES = new ContactField("SOCIAL_PROFILES", 27, "socialProfiles");

    private static final /* synthetic */ ContactField[] $values() {
        return new ContactField[]{IS_FAVOURITE, FULL_NAME, GIVEN_NAME, MIDDLE_NAME, FAMILY_NAME, PREFIX, SUFFIX, PHONETIC_GIVEN_NAME, PHONETIC_MIDDLE_NAME, PHONETIC_FAMILY_NAME, COMPANY, DEPARTMENT, JOB_TITLE, PHONETIC_COMPANY_NAME, NOTE, IMAGE, THUMBNAIL, EMAILS, PHONES, ADDRESSES, DATES, RELATIONS, URL_ADDRESSES, EXTRA_NAMES, MAIDEN_NAME, NICKNAME, IM_ADDRESS, SOCIAL_PROFILES};
    }

    public static EnumEntries<ContactField> getEntries() {
        return $ENTRIES;
    }

    private ContactField(String str, int i, String str2) {
        this.key = str2;
    }

    public final String getKey() {
        return this.key;
    }

    static {
        ContactField[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }

    public static ContactField valueOf(String str) {
        return (ContactField) Enum.valueOf(ContactField.class, str);
    }

    public static ContactField[] values() {
        return (ContactField[]) $VALUES.clone();
    }
}
