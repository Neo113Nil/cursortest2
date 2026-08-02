package com.rt2zz.reactnativecontacts;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import android.provider.ContactsContract;
import android.text.TextUtils;
import android.util.Log;
import androidx.core.app.NotificationCompat;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import com.google.firebase.messaging.Constants;
import expo.modules.contacts.Columns;
import expo.modules.contacts.models.DateModelKt;
import expo.modules.contacts.next.domain.wrappers.RawContactId;
import io.sentry.metrics.MetricsUnit;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes8.dex */
public class ContactsProvider {
    public static final int ID_FOR_PROFILE_CONTACT = -1;
    private final ContentResolver contentResolver;
    private static final List<String> JUST_ME_PROJECTION = new ArrayList<String>() { // from class: com.rt2zz.reactnativecontacts.ContactsProvider.1
        {
            add("_id");
            add("contact_id");
            add(RawContactId.COLUMN_IN_DATA_TABLE);
            add("lookup");
            add(Columns.MIMETYPE);
            add(Columns.DISPLAY_NAME);
            add(Columns.PHOTO_URI);
            add(Columns.DATA);
            add(Columns.TYPE);
            add(Columns.DATA_5);
            add(Columns.LABEL);
            add(Columns.DATA_4);
            add(Columns.DATA_6);
            add(Columns.DATA);
            add(Columns.DATA_4);
            add(Columns.TYPE);
            add(Columns.LABEL);
            add(Columns.DATA);
            add(Columns.DATA);
            add(Columns.TYPE);
            add(Columns.LABEL);
            add(Columns.DATA);
            add(Columns.DATA_4);
            add(Columns.DATA_5);
            add(Columns.DATA);
            add(Columns.TYPE);
            add(Columns.LABEL);
            add(Columns.DATA_4);
            add(Columns.DATA_5);
            add(Columns.DATA_6);
            add(Columns.DATA_7);
            add(Columns.DATA_8);
            add(Columns.DATA_9);
            add(Columns.DATA_10);
            add(Columns.DATA);
            add(Columns.DATA);
            add(Columns.DATA);
            add(Columns.DATA);
            add(Columns.TYPE);
        }
    };
    private static final List<String> FULL_PROJECTION = new ArrayList<String>() { // from class: com.rt2zz.reactnativecontacts.ContactsProvider.2
        {
            addAll(ContactsProvider.JUST_ME_PROJECTION);
        }
    };
    private static final List<String> PHOTO_PROJECTION = new ArrayList<String>() { // from class: com.rt2zz.reactnativecontacts.ContactsProvider.3
        {
            add(Columns.PHOTO_URI);
        }
    };

    public ContactsProvider(ContentResolver contentResolver) {
        this.contentResolver = contentResolver;
    }

    public WritableArray getContactsMatchingString(String str) {
        ContentResolver contentResolver = this.contentResolver;
        Uri uri = ContactsContract.Data.CONTENT_URI;
        List<String> list = FULL_PROJECTION;
        Cursor query = contentResolver.query(uri, (String[]) list.toArray(new String[list.size()]), "display_name LIKE ? OR data1 LIKE ?", new String[]{"%" + str + "%", "%" + str + "%"}, null);
        try {
            Map<String, Contact> loadContactsFrom = loadContactsFrom(query);
            WritableArray createArray = Arguments.createArray();
            Iterator<Contact> it = loadContactsFrom.values().iterator();
            while (it.hasNext()) {
                createArray.pushMap(it.next().toMap());
            }
            return createArray;
        } finally {
            if (query != null) {
                query.close();
            }
        }
    }

    public WritableArray getContactsByPhoneNumber(String str) {
        ContentResolver contentResolver = this.contentResolver;
        Uri uri = ContactsContract.Data.CONTENT_URI;
        List<String> list = FULL_PROJECTION;
        Cursor query = contentResolver.query(uri, (String[]) list.toArray(new String[list.size()]), "data1 LIKE ? OR data4 LIKE ?", new String[]{"%" + str + "%", "%" + str + "%"}, null);
        try {
            Map<String, Contact> loadContactsFrom = loadContactsFrom(query);
            WritableArray createArray = Arguments.createArray();
            Iterator<Contact> it = loadContactsFrom.values().iterator();
            while (it.hasNext()) {
                createArray.pushMap(it.next().toMap());
            }
            return createArray;
        } finally {
            if (query != null) {
                query.close();
            }
        }
    }

    public WritableArray getContactsByEmailAddress(String str) {
        ContentResolver contentResolver = this.contentResolver;
        Uri uri = ContactsContract.Data.CONTENT_URI;
        List<String> list = FULL_PROJECTION;
        Cursor query = contentResolver.query(uri, (String[]) list.toArray(new String[list.size()]), "data1 LIKE ?", new String[]{"%" + str + "%"}, null);
        try {
            Map<String, Contact> loadContactsFrom = loadContactsFrom(query);
            WritableArray createArray = Arguments.createArray();
            Iterator<Contact> it = loadContactsFrom.values().iterator();
            while (it.hasNext()) {
                createArray.pushMap(it.next().toMap());
            }
            return createArray;
        } finally {
            if (query != null) {
                query.close();
            }
        }
    }

    public WritableMap getContactByRawId(String str) {
        int columnIndex;
        Cursor query = this.contentResolver.query(ContactsContract.RawContacts.CONTENT_URI, new String[]{"contact_id"}, "_id= ?", new String[]{str}, null);
        query.getCount();
        String string = (!query.moveToNext() || (columnIndex = query.getColumnIndex("contact_id")) == -1) ? null : query.getString(columnIndex);
        query.close();
        return getContactById(string);
    }

    public WritableMap getContactById(String str) {
        ContentResolver contentResolver = this.contentResolver;
        Uri uri = ContactsContract.Data.CONTENT_URI;
        List<String> list = FULL_PROJECTION;
        Cursor query = contentResolver.query(uri, (String[]) list.toArray(new String[list.size()]), "contact_id = ?", new String[]{str}, null);
        try {
            Map<String, Contact> loadContactsFrom = loadContactsFrom(query);
            if (loadContactsFrom.values().size() > 0) {
                return loadContactsFrom.values().iterator().next().toMap();
            }
            return null;
        } finally {
            if (query != null) {
                query.close();
            }
        }
    }

    public Integer getContactsCount() {
        return Integer.valueOf(this.contentResolver.query(ContactsContract.Contacts.CONTENT_URI, null, null, null, null).getCount());
    }

    public WritableArray getContacts() {
        ContentResolver contentResolver = this.contentResolver;
        Uri withAppendedPath = Uri.withAppendedPath(ContactsContract.Profile.CONTENT_URI, "data");
        List<String> list = JUST_ME_PROJECTION;
        Cursor query = contentResolver.query(withAppendedPath, (String[]) list.toArray(new String[list.size()]), null, null, null);
        try {
            Map<String, Contact> loadContactsFrom = loadContactsFrom(query);
            if (query != null) {
                query.close();
            }
            ContentResolver contentResolver2 = this.contentResolver;
            Uri uri = ContactsContract.Data.CONTENT_URI;
            List<String> list2 = FULL_PROJECTION;
            query = contentResolver2.query(uri, (String[]) list2.toArray(new String[list2.size()]), "mimetype=? OR mimetype=? OR mimetype=? OR mimetype=? OR mimetype=? OR mimetype=? OR mimetype=? OR mimetype=? OR mimetype=?", new String[]{"vnd.android.cursor.item/email_v2", "vnd.android.cursor.item/phone_v2", "vnd.android.cursor.item/name", "vnd.android.cursor.item/organization", "vnd.android.cursor.item/postal-address_v2", "vnd.android.cursor.item/note", "vnd.android.cursor.item/website", "vnd.android.cursor.item/im", "vnd.android.cursor.item/contact_event"}, null);
            try {
                Map<String, Contact> loadContactsFrom2 = loadContactsFrom(query);
                WritableArray createArray = Arguments.createArray();
                Iterator<Contact> it = loadContactsFrom.values().iterator();
                while (it.hasNext()) {
                    createArray.pushMap(it.next().toMap());
                }
                Iterator<Contact> it2 = loadContactsFrom2.values().iterator();
                while (it2.hasNext()) {
                    createArray.pushMap(it2.next().toMap());
                }
                return createArray;
            } finally {
                if (query != null) {
                    query.close();
                }
            }
        } finally {
            if (query != null) {
                query.close();
            }
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    private Map<String, Contact> loadContactsFrom(Cursor cursor) {
        String valueOf;
        String valueOf2;
        String valueOf3;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        while (cursor != null && cursor.moveToNext()) {
            int columnIndex = cursor.getColumnIndex("contact_id");
            int columnIndex2 = cursor.getColumnIndex("_id");
            int columnIndex3 = cursor.getColumnIndex(RawContactId.COLUMN_IN_DATA_TABLE);
            char c = 65535;
            if (columnIndex != -1) {
                valueOf = cursor.getString(columnIndex);
            } else {
                valueOf = String.valueOf(-1);
            }
            if (columnIndex2 != -1) {
                valueOf2 = cursor.getString(columnIndex2);
            } else {
                valueOf2 = String.valueOf(-1);
            }
            if (columnIndex3 != -1) {
                valueOf3 = cursor.getString(columnIndex3);
            } else {
                valueOf3 = String.valueOf(-1);
            }
            if (!linkedHashMap.containsKey(valueOf)) {
                linkedHashMap.put(valueOf, new Contact(valueOf));
            }
            Contact contact = (Contact) linkedHashMap.get(valueOf);
            String string = cursor.getString(cursor.getColumnIndex(Columns.MIMETYPE));
            String string2 = cursor.getString(cursor.getColumnIndex(Columns.DISPLAY_NAME));
            contact.rawContactId = valueOf3;
            if (!TextUtils.isEmpty(string2) && TextUtils.isEmpty(contact.displayName)) {
                contact.displayName = string2;
            }
            if (TextUtils.isEmpty(contact.photoUri)) {
                String string3 = cursor.getString(cursor.getColumnIndex(Columns.PHOTO_URI));
                if (!TextUtils.isEmpty(string3)) {
                    contact.photoUri = string3;
                    contact.hasPhoto = true;
                }
            }
            string.hashCode();
            switch (string.hashCode()) {
                case -1569536764:
                    if (string.equals("vnd.android.cursor.item/email_v2")) {
                        c = 0;
                        break;
                    }
                    break;
                case -1328682538:
                    if (string.equals("vnd.android.cursor.item/contact_event")) {
                        c = 1;
                        break;
                    }
                    break;
                case -1079224304:
                    if (string.equals("vnd.android.cursor.item/name")) {
                        c = 2;
                        break;
                    }
                    break;
                case -601229436:
                    if (string.equals("vnd.android.cursor.item/postal-address_v2")) {
                        c = 3;
                        break;
                    }
                    break;
                case 456415478:
                    if (string.equals("vnd.android.cursor.item/website")) {
                        c = 4;
                        break;
                    }
                    break;
                case 684173810:
                    if (string.equals("vnd.android.cursor.item/phone_v2")) {
                        c = 5;
                        break;
                    }
                    break;
                case 689862072:
                    if (string.equals("vnd.android.cursor.item/organization")) {
                        c = 6;
                        break;
                    }
                    break;
                case 950831081:
                    if (string.equals("vnd.android.cursor.item/im")) {
                        c = 7;
                        break;
                    }
                    break;
            }
            String str = "mobile";
            String str2 = "work";
            String str3 = "other";
            switch (c) {
                case 0:
                    String string4 = cursor.getString(cursor.getColumnIndex(Columns.DATA));
                    int i = cursor.getInt(cursor.getColumnIndex(Columns.TYPE));
                    if (!TextUtils.isEmpty(string4)) {
                        if (i == 0) {
                            str = cursor.getString(cursor.getColumnIndex(Columns.LABEL)) != null ? cursor.getString(cursor.getColumnIndex(Columns.LABEL)).toLowerCase() : "";
                        } else if (i == 1) {
                            str = "home";
                        } else if (i == 2) {
                            str = "work";
                        } else if (i != 4) {
                            str = "other";
                        }
                        contact.emails.add(new Contact.Item(str, string4, valueOf2));
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (cursor.getInt(cursor.getColumnIndex(Columns.TYPE)) != 3) {
                        break;
                    } else {
                        try {
                            List asList = Arrays.asList(cursor.getString(cursor.getColumnIndex(Columns.DATA)).replace("--", "").split("-"));
                            if (asList.size() == 2) {
                                int parseInt = Integer.parseInt((String) asList.get(0));
                                int parseInt2 = Integer.parseInt((String) asList.get(1));
                                if (parseInt >= 1 && parseInt <= 12 && parseInt2 >= 1 && parseInt2 <= 31) {
                                    contact.birthday = new Contact.Birthday(parseInt, parseInt2);
                                    break;
                                }
                            } else if (asList.size() != 3) {
                                break;
                            } else {
                                int parseInt3 = Integer.parseInt((String) asList.get(0));
                                int parseInt4 = Integer.parseInt((String) asList.get(1));
                                int parseInt5 = Integer.parseInt((String) asList.get(2));
                                if (parseInt3 > 0 && parseInt4 >= 1 && parseInt4 <= 12 && parseInt5 >= 1 && parseInt5 <= 31) {
                                    contact.birthday = new Contact.Birthday(parseInt3, parseInt4, parseInt5);
                                    break;
                                }
                            }
                        } catch (ArrayIndexOutOfBoundsException | NullPointerException | NumberFormatException e) {
                            Log.w("ContactsProvider", e.toString());
                            break;
                        }
                    }
                    break;
                case 2:
                    contact.givenName = cursor.getString(cursor.getColumnIndex(Columns.TYPE));
                    if (cursor.getString(cursor.getColumnIndex(Columns.DATA_5)) != null) {
                        contact.middleName = cursor.getString(cursor.getColumnIndex(Columns.DATA_5));
                    } else {
                        contact.middleName = "";
                    }
                    if (cursor.getString(cursor.getColumnIndex(Columns.LABEL)) != null) {
                        contact.familyName = cursor.getString(cursor.getColumnIndex(Columns.LABEL));
                    } else {
                        contact.familyName = "";
                    }
                    contact.prefix = cursor.getString(cursor.getColumnIndex(Columns.DATA_4));
                    contact.suffix = cursor.getString(cursor.getColumnIndex(Columns.DATA_6));
                    break;
                case 3:
                    contact.postalAddresses.add(new Contact.PostalAddressItem(cursor));
                    break;
                case 4:
                    String string5 = cursor.getString(cursor.getColumnIndex(Columns.DATA));
                    int i2 = cursor.getInt(cursor.getColumnIndex(Columns.TYPE));
                    if (!TextUtils.isEmpty(string5)) {
                        switch (i2) {
                            case 0:
                                if (cursor.getString(cursor.getColumnIndex(Columns.LABEL)) == null) {
                                    str2 = "";
                                    break;
                                } else {
                                    str2 = cursor.getString(cursor.getColumnIndex(Columns.LABEL)).toLowerCase();
                                    break;
                                }
                            case 1:
                                str2 = "homepage";
                                break;
                            case 2:
                                str2 = "blog";
                                break;
                            case 3:
                                str2 = "profile";
                                break;
                            case 4:
                                str2 = "home";
                                break;
                            case 5:
                                break;
                            case 6:
                                str2 = "ftp";
                                break;
                            default:
                                str2 = "other";
                                break;
                        }
                        contact.urls.add(new Contact.Item(str2, string5, valueOf2));
                        break;
                    } else {
                        break;
                    }
                case 5:
                    String string6 = cursor.getString(cursor.getColumnIndex(Columns.DATA));
                    int i3 = cursor.getInt(cursor.getColumnIndex(Columns.TYPE));
                    if (!TextUtils.isEmpty(string6)) {
                        if (i3 == 1) {
                            str = "home";
                        } else if (i3 != 2) {
                            str = i3 != 3 ? "other" : "work";
                        }
                        contact.phones.add(new Contact.Item(str, string6, valueOf2));
                        break;
                    } else {
                        break;
                    }
                case 6:
                    contact.company = cursor.getString(cursor.getColumnIndex(Columns.DATA));
                    contact.jobTitle = cursor.getString(cursor.getColumnIndex(Columns.DATA_4));
                    contact.department = cursor.getString(cursor.getColumnIndex(Columns.DATA_5));
                    break;
                case 7:
                    String string7 = cursor.getString(cursor.getColumnIndex(Columns.DATA));
                    int i4 = cursor.getInt(cursor.getColumnIndex(Columns.DATA_5));
                    if (!TextUtils.isEmpty(string7)) {
                        switch (i4) {
                            case -1:
                                if (cursor.getString(cursor.getColumnIndex(Columns.DATA_6)) == null) {
                                    str3 = "";
                                    break;
                                } else {
                                    str3 = cursor.getString(cursor.getColumnIndex(Columns.DATA_6));
                                    break;
                                }
                            case 0:
                                str3 = "AIM";
                                break;
                            case 1:
                                str3 = "MSN";
                                break;
                            case 2:
                                str3 = "Yahoo";
                                break;
                            case 3:
                                str3 = "Skype";
                                break;
                            case 4:
                                str3 = "QQ";
                                break;
                            case 5:
                                str3 = "Google Talk";
                                break;
                            case 6:
                                str3 = "ICQ";
                                break;
                            case 7:
                                str3 = "Jabber";
                                break;
                            case 8:
                                str3 = "NetMeeting";
                                break;
                        }
                        contact.instantMessengers.add(new Contact.Item(str3, string7, valueOf2));
                        break;
                    } else {
                        break;
                    }
            }
        }
        return linkedHashMap;
    }

    public String getPhotoUriFromContactId(String str) {
        ContentResolver contentResolver = this.contentResolver;
        Uri uri = ContactsContract.Data.CONTENT_URI;
        List<String> list = PHOTO_PROJECTION;
        Cursor query = contentResolver.query(uri, (String[]) list.toArray(new String[list.size()]), "contact_id = ?", new String[]{str}, null);
        if (query != null) {
            try {
                if (query.moveToNext()) {
                    String string = query.getString(query.getColumnIndex(Columns.PHOTO_URI));
                    if (!TextUtils.isEmpty(string)) {
                        if (query != null) {
                            query.close();
                        }
                        return string;
                    }
                }
            } finally {
                if (query != null) {
                    query.close();
                }
            }
        }
    }

    private static class Contact {
        private Birthday birthday;
        private String contactId;
        private String displayName;
        private String photoUri;
        private String rawContactId;
        private String givenName = "";
        private String middleName = "";
        private String familyName = "";
        private String prefix = "";
        private String suffix = "";
        private String company = "";
        private String jobTitle = "";
        private String department = "";
        private String note = "";
        private List<Item> urls = new ArrayList();
        private List<Item> instantMessengers = new ArrayList();
        private boolean hasPhoto = false;
        private List<Item> emails = new ArrayList();
        private List<Item> phones = new ArrayList();
        private List<PostalAddressItem> postalAddresses = new ArrayList();

        public Contact(String str) {
            this.contactId = str;
        }

        public WritableMap toMap() {
            WritableMap createMap = Arguments.createMap();
            createMap.putString("recordID", this.contactId);
            createMap.putString("rawContactId", this.rawContactId);
            createMap.putString("givenName", TextUtils.isEmpty(this.givenName) ? this.displayName : this.givenName);
            createMap.putString("displayName", this.displayName);
            createMap.putString("middleName", this.middleName);
            createMap.putString("familyName", this.familyName);
            createMap.putString("prefix", this.prefix);
            createMap.putString("suffix", this.suffix);
            createMap.putString("company", this.company);
            createMap.putString("jobTitle", this.jobTitle);
            createMap.putString("department", this.department);
            createMap.putString("note", this.note);
            createMap.putBoolean("hasThumbnail", this.hasPhoto);
            String str = this.photoUri;
            if (str == null) {
                str = "";
            }
            createMap.putString("thumbnailPath", str);
            WritableArray createArray = Arguments.createArray();
            for (Item item : this.phones) {
                WritableMap createMap2 = Arguments.createMap();
                createMap2.putString("number", item.value);
                createMap2.putString(Constants.ScionAnalytics.PARAM_LABEL, item.label);
                createMap2.putString("id", item.id);
                createArray.pushMap(createMap2);
            }
            createMap.putArray("phoneNumbers", createArray);
            WritableArray createArray2 = Arguments.createArray();
            for (Item item2 : this.urls) {
                WritableMap createMap3 = Arguments.createMap();
                createMap3.putString("url", item2.value);
                createMap3.putString("id", item2.id);
                createArray2.pushMap(createMap3);
            }
            createMap.putArray("urlAddresses", createArray2);
            WritableArray createArray3 = Arguments.createArray();
            for (Item item3 : this.instantMessengers) {
                WritableMap createMap4 = Arguments.createMap();
                createMap4.putString("username", item3.value);
                createMap4.putString(NotificationCompat.CATEGORY_SERVICE, item3.label);
                createArray3.pushMap(createMap4);
            }
            createMap.putArray("imAddresses", createArray3);
            WritableArray createArray4 = Arguments.createArray();
            for (Item item4 : this.emails) {
                WritableMap createMap5 = Arguments.createMap();
                createMap5.putString("email", item4.value);
                createMap5.putString(Constants.ScionAnalytics.PARAM_LABEL, item4.label);
                createMap5.putString("id", item4.id);
                createArray4.pushMap(createMap5);
            }
            createMap.putArray("emailAddresses", createArray4);
            WritableArray createArray5 = Arguments.createArray();
            Iterator<PostalAddressItem> it = this.postalAddresses.iterator();
            while (it.hasNext()) {
                createArray5.pushMap(it.next().map);
            }
            createMap.putArray("postalAddresses", createArray5);
            WritableMap createMap6 = Arguments.createMap();
            Birthday birthday = this.birthday;
            if (birthday != null) {
                if (birthday.year > 0) {
                    createMap6.putInt("year", this.birthday.year);
                }
                createMap6.putInt("month", this.birthday.month);
                createMap6.putInt(MetricsUnit.Duration.DAY, this.birthday.day);
                createMap.putMap(DateModelKt.BIRTHDAY, createMap6);
            }
            return createMap;
        }

        public static class Item {
            public String id;
            public String label;
            public String value;

            public Item(String str, String str2, String str3) {
                this.id = str3;
                this.label = str;
                this.value = str2;
            }

            public Item(String str, String str2) {
                this.label = str;
                this.value = str2;
            }
        }

        public static class Birthday {
            public int day;
            public int month;
            public int year;

            public Birthday(int i, int i2, int i3) {
                this.year = i;
                this.month = i2;
                this.day = i3;
            }

            public Birthday(int i, int i2) {
                this.year = 0;
                this.month = i;
                this.day = i2;
            }
        }

        public static class PostalAddressItem {
            public final WritableMap map;

            public PostalAddressItem(Cursor cursor) {
                WritableMap createMap = Arguments.createMap();
                this.map = createMap;
                createMap.putString(Constants.ScionAnalytics.PARAM_LABEL, getLabel(cursor));
                putString(cursor, "formattedAddress", Columns.DATA);
                putString(cursor, "street", Columns.DATA_4);
                putString(cursor, "pobox", Columns.DATA_5);
                putString(cursor, "neighborhood", Columns.DATA_6);
                putString(cursor, "city", Columns.DATA_7);
                putString(cursor, "region", Columns.DATA_8);
                putString(cursor, "state", Columns.DATA_8);
                putString(cursor, "postCode", Columns.DATA_9);
                putString(cursor, "country", Columns.DATA_10);
            }

            private void putString(Cursor cursor, String str, String str2) {
                String string = cursor.getString(cursor.getColumnIndex(str2));
                if (TextUtils.isEmpty(string)) {
                    return;
                }
                this.map.putString(str, string);
            }

            static String getLabel(Cursor cursor) {
                int i = cursor.getInt(cursor.getColumnIndex(Columns.TYPE));
                if (i == 0) {
                    String string = cursor.getString(cursor.getColumnIndex(Columns.LABEL));
                    return string != null ? string : "";
                }
                if (i == 1) {
                    return "home";
                }
                if (i == 2) {
                    return "work";
                }
                return "other";
            }
        }
    }
}
