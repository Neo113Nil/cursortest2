package vc;

import android.content.ContentResolver;
import android.content.res.Resources;
import android.database.Cursor;
import android.net.Uri;
import android.provider.ContactsContract;
import android.text.TextUtils;
import android.util.Log;
import com.appsflyer.AdRevenueScheme;
import com.facebook.hermes.intl.Constants;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.devsupport.StackTraceHelper;
import com.twilio.voice.EventKeys;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;

/* renamed from: vc.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C6682a {

    /* renamed from: b, reason: collision with root package name */
    public static final List f67134b = new C0941a();

    /* renamed from: c, reason: collision with root package name */
    public static final List f67135c = new b();

    /* renamed from: d, reason: collision with root package name */
    public static final List f67136d = new c();

    /* renamed from: a, reason: collision with root package name */
    public final ContentResolver f67137a;

    /* renamed from: vc.a$a, reason: collision with other inner class name */
    public class C0941a extends ArrayList {
        public C0941a() {
            add("_id");
            add("contact_id");
            add("raw_contact_id");
            add(Constants.LOCALEMATCHER_LOOKUP);
            add("starred");
            add("mimetype");
            add("display_name");
            add("photo_uri");
            add("data1");
            add("data2");
            add("data5");
            add("data3");
            add("data4");
            add("data6");
            add("data1");
            add("data4");
            add("data2");
            add("data3");
            add("data1");
            add("data1");
            add("data2");
            add("data3");
            add("data1");
            add("data4");
            add("data5");
            add("data1");
            add("data2");
            add("data3");
            add("data4");
            add("data5");
            add("data6");
            add("data7");
            add("data8");
            add("data9");
            add("data10");
            add("data1");
            add("data1");
            add("data1");
            add("data1");
            add("data2");
        }
    }

    /* renamed from: vc.a$b */
    public class b extends ArrayList {
        public b() {
            addAll(C6682a.f67134b);
        }
    }

    /* renamed from: vc.a$c */
    public class c extends ArrayList {
        public c() {
            add("photo_uri");
        }
    }

    public C6682a(ContentResolver contentResolver) {
        this.f67137a = contentResolver;
    }

    public final Boolean b(Cursor cursor) {
        try {
            return Boolean.valueOf(cursor.moveToNext());
        } catch (RuntimeException unused) {
            return Boolean.FALSE;
        }
    }

    public WritableMap c(String str) {
        ContentResolver contentResolver = this.f67137a;
        Uri uri = ContactsContract.Data.CONTENT_URI;
        List list = f67135c;
        Cursor query = contentResolver.query(uri, (String[]) list.toArray(new String[list.size()]), "contact_id = ?", new String[]{str}, null);
        try {
            Map k10 = k(query);
            if (k10.values().size() > 0) {
                return ((d) k10.values().iterator().next()).w();
            }
            return null;
        } finally {
            if (query != null) {
                query.close();
            }
        }
    }

    public WritableMap d(String str) {
        int columnIndex;
        Cursor query = this.f67137a.query(ContactsContract.RawContacts.CONTENT_URI, new String[]{"contact_id"}, "_id= ?", new String[]{str}, null);
        query.getCount();
        String string = (!b(query).booleanValue() || (columnIndex = query.getColumnIndex("contact_id")) == -1) ? null : query.getString(columnIndex);
        query.close();
        return c(string);
    }

    public WritableArray e() {
        ContentResolver contentResolver = this.f67137a;
        Uri withAppendedPath = Uri.withAppendedPath(ContactsContract.Profile.CONTENT_URI, EventKeys.DATA);
        List list = f67134b;
        Cursor query = contentResolver.query(withAppendedPath, (String[]) list.toArray(new String[list.size()]), null, null, null);
        try {
            Map k10 = k(query);
            if (query != null) {
                query.close();
            }
            ContentResolver contentResolver2 = this.f67137a;
            Uri uri = ContactsContract.Data.CONTENT_URI;
            List list2 = f67135c;
            query = contentResolver2.query(uri, (String[]) list2.toArray(new String[list2.size()]), "mimetype=? OR mimetype=? OR mimetype=? OR mimetype=? OR mimetype=? OR mimetype=? OR mimetype=? OR mimetype=? OR mimetype=?", new String[]{"vnd.android.cursor.item/email_v2", "vnd.android.cursor.item/phone_v2", "vnd.android.cursor.item/name", "vnd.android.cursor.item/organization", "vnd.android.cursor.item/postal-address_v2", "vnd.android.cursor.item/note", "vnd.android.cursor.item/website", "vnd.android.cursor.item/im", "vnd.android.cursor.item/contact_event"}, null);
            try {
                Map k11 = k(query);
                WritableArray createArray = Arguments.createArray();
                Iterator it = k10.values().iterator();
                while (it.hasNext()) {
                    createArray.pushMap(((d) it.next()).w());
                }
                Iterator it2 = k11.values().iterator();
                while (it2.hasNext()) {
                    createArray.pushMap(((d) it2.next()).w());
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

    public WritableArray f(String str) {
        ContentResolver contentResolver = this.f67137a;
        Uri uri = ContactsContract.Data.CONTENT_URI;
        List list = f67135c;
        Cursor query = contentResolver.query(uri, (String[]) list.toArray(new String[list.size()]), "data1 LIKE ?", new String[]{"%" + str + "%"}, null);
        try {
            Map k10 = k(query);
            WritableArray createArray = Arguments.createArray();
            Iterator it = k10.values().iterator();
            while (it.hasNext()) {
                createArray.pushMap(((d) it.next()).w());
            }
            return createArray;
        } finally {
            if (query != null) {
                query.close();
            }
        }
    }

    public WritableArray g(String str) {
        ContentResolver contentResolver = this.f67137a;
        Uri uri = ContactsContract.Data.CONTENT_URI;
        List list = f67135c;
        Cursor query = contentResolver.query(uri, (String[]) list.toArray(new String[list.size()]), "data1 LIKE ? OR data4 LIKE ?", new String[]{"%" + str + "%", "%" + str + "%"}, null);
        try {
            Map k10 = k(query);
            WritableArray createArray = Arguments.createArray();
            Iterator it = k10.values().iterator();
            while (it.hasNext()) {
                createArray.pushMap(((d) it.next()).w());
            }
            return createArray;
        } finally {
            if (query != null) {
                query.close();
            }
        }
    }

    public Integer h() {
        return Integer.valueOf(this.f67137a.query(ContactsContract.Contacts.CONTENT_URI, null, null, null, null).getCount());
    }

    public WritableArray i(String str) {
        ContentResolver contentResolver = this.f67137a;
        Uri uri = ContactsContract.Data.CONTENT_URI;
        List list = f67135c;
        Cursor query = contentResolver.query(uri, (String[]) list.toArray(new String[list.size()]), "display_name LIKE ? OR data1 LIKE ?", new String[]{"%" + str + "%", "%" + str + "%"}, null);
        try {
            Map k10 = k(query);
            WritableArray createArray = Arguments.createArray();
            Iterator it = k10.values().iterator();
            while (it.hasNext()) {
                createArray.pushMap(((d) it.next()).w());
            }
            return createArray;
        } finally {
            if (query != null) {
                query.close();
            }
        }
    }

    public String j(String str) {
        ContentResolver contentResolver = this.f67137a;
        Uri uri = ContactsContract.Data.CONTENT_URI;
        List list = f67136d;
        Cursor query = contentResolver.query(uri, (String[]) list.toArray(new String[list.size()]), "contact_id = ?", new String[]{str}, null);
        if (query != null) {
            try {
                if (b(query).booleanValue()) {
                    String string = query.getString(query.getColumnIndex("photo_uri"));
                    if (!TextUtils.isEmpty(string)) {
                        return string;
                    }
                }
            } finally {
                query.close();
            }
        }
        return query != null ? null : null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final Map k(Cursor cursor) {
        String str;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        while (cursor != null && b(cursor).booleanValue()) {
            int columnIndex = cursor.getColumnIndex("contact_id");
            int columnIndex2 = cursor.getColumnIndex("_id");
            int columnIndex3 = cursor.getColumnIndex("raw_contact_id");
            char c10 = 65535;
            String string = columnIndex != -1 ? cursor.getString(columnIndex) : String.valueOf(-1);
            String string2 = columnIndex2 != -1 ? cursor.getString(columnIndex2) : String.valueOf(-1);
            String string3 = columnIndex3 != -1 ? cursor.getString(columnIndex3) : String.valueOf(-1);
            if (!linkedHashMap.containsKey(string)) {
                linkedHashMap.put(string, new d(string));
            }
            d dVar = (d) linkedHashMap.get(string);
            String string4 = cursor.getString(cursor.getColumnIndex("mimetype"));
            String string5 = cursor.getString(cursor.getColumnIndex("display_name"));
            boolean z10 = cursor.getInt(cursor.getColumnIndex("starred")) == 1;
            dVar.f67139b = string3;
            if (!TextUtils.isEmpty(string5) && TextUtils.isEmpty(dVar.f67140c)) {
                dVar.f67140c = string5;
            }
            dVar.f67153p = z10;
            if (TextUtils.isEmpty(dVar.f67154q)) {
                String string6 = cursor.getString(cursor.getColumnIndex("photo_uri"));
                if (!TextUtils.isEmpty(string6)) {
                    dVar.f67154q = string6;
                    dVar.f67152o = true;
                }
            }
            string4.getClass();
            switch (string4.hashCode()) {
                case -1569536764:
                    if (string4.equals("vnd.android.cursor.item/email_v2")) {
                        c10 = 0;
                        break;
                    }
                    break;
                case -1328682538:
                    if (string4.equals("vnd.android.cursor.item/contact_event")) {
                        c10 = 1;
                        break;
                    }
                    break;
                case -1079224304:
                    if (string4.equals("vnd.android.cursor.item/name")) {
                        c10 = 2;
                        break;
                    }
                    break;
                case -1079210633:
                    if (string4.equals("vnd.android.cursor.item/note")) {
                        c10 = 3;
                        break;
                    }
                    break;
                case -601229436:
                    if (string4.equals("vnd.android.cursor.item/postal-address_v2")) {
                        c10 = 4;
                        break;
                    }
                    break;
                case 456415478:
                    if (string4.equals("vnd.android.cursor.item/website")) {
                        c10 = 5;
                        break;
                    }
                    break;
                case 684173810:
                    if (string4.equals("vnd.android.cursor.item/phone_v2")) {
                        c10 = 6;
                        break;
                    }
                    break;
                case 689862072:
                    if (string4.equals("vnd.android.cursor.item/organization")) {
                        c10 = 7;
                        break;
                    }
                    break;
                case 950831081:
                    if (string4.equals("vnd.android.cursor.item/im")) {
                        c10 = '\b';
                        break;
                    }
                    break;
            }
            String str2 = "home";
            str = "other";
            String str3 = "";
            switch (c10) {
                case 0:
                    String string7 = cursor.getString(cursor.getColumnIndex("data1"));
                    int i10 = cursor.getInt(cursor.getColumnIndex("data2"));
                    if (!TextUtils.isEmpty(string7)) {
                        if (i10 == 0) {
                            str2 = cursor.getString(cursor.getColumnIndex("data3")) != null ? cursor.getString(cursor.getColumnIndex("data3")).toLowerCase() : "";
                        } else if (i10 != 1) {
                            str2 = i10 != 2 ? (i10 == 3 || i10 != 4) ? "other" : "mobile" : "work";
                        }
                        dVar.f67155r.add(new d.b(str2, string7, string2));
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (cursor.getInt(cursor.getColumnIndex("data2")) == 3) {
                        try {
                            List asList = Arrays.asList(cursor.getString(cursor.getColumnIndex("data1")).replace("--", "").split("-"));
                            if (asList.size() == 2) {
                                int parseInt = Integer.parseInt((String) asList.get(0));
                                int parseInt2 = Integer.parseInt((String) asList.get(1));
                                if (parseInt >= 1 && parseInt <= 12 && parseInt2 >= 1 && parseInt2 <= 31) {
                                    dVar.f67158u = new d.C0942a(parseInt, parseInt2);
                                }
                            } else if (asList.size() == 3) {
                                int parseInt3 = Integer.parseInt((String) asList.get(0));
                                int parseInt4 = Integer.parseInt((String) asList.get(1));
                                int parseInt5 = Integer.parseInt((String) asList.get(2));
                                if (parseInt3 > 0 && parseInt4 >= 1 && parseInt4 <= 12 && parseInt5 >= 1 && parseInt5 <= 31) {
                                    dVar.f67158u = new d.C0942a(parseInt3, parseInt4, parseInt5);
                                }
                            }
                        } catch (ArrayIndexOutOfBoundsException e10) {
                            e = e10;
                            Log.w("ContactsProvider", e.toString());
                        } catch (NullPointerException e11) {
                            e = e11;
                            Log.w("ContactsProvider", e.toString());
                        } catch (NumberFormatException e12) {
                            e = e12;
                            Log.w("ContactsProvider", e.toString());
                        }
                    }
                    break;
                case 2:
                    dVar.f67141d = cursor.getString(cursor.getColumnIndex("data2"));
                    if (cursor.getString(cursor.getColumnIndex("data5")) != null) {
                        dVar.f67142e = cursor.getString(cursor.getColumnIndex("data5"));
                    } else {
                        dVar.f67142e = "";
                    }
                    if (cursor.getString(cursor.getColumnIndex("data3")) != null) {
                        dVar.f67143f = cursor.getString(cursor.getColumnIndex("data3"));
                    } else {
                        dVar.f67143f = "";
                    }
                    dVar.f67144g = cursor.getString(cursor.getColumnIndex("data4"));
                    dVar.f67145h = cursor.getString(cursor.getColumnIndex("data6"));
                    break;
                case 3:
                    dVar.f67149l = cursor.getString(cursor.getColumnIndex("data1"));
                    break;
                case 4:
                    dVar.f67157t.add(new d.c(cursor));
                    break;
                case 5:
                    String string8 = cursor.getString(cursor.getColumnIndex("data1"));
                    int i11 = cursor.getInt(cursor.getColumnIndex("data2"));
                    if (!TextUtils.isEmpty(string8)) {
                        switch (i11) {
                            case 0:
                                if (cursor.getString(cursor.getColumnIndex("data3")) == null) {
                                    str2 = "";
                                    break;
                                } else {
                                    str2 = cursor.getString(cursor.getColumnIndex("data3")).toLowerCase();
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
                                break;
                            case 5:
                                str2 = "work";
                                break;
                            case 6:
                                str2 = "ftp";
                                break;
                            default:
                                str2 = "other";
                                break;
                        }
                        dVar.f67150m.add(new d.b(str2, string8, string2));
                        break;
                    } else {
                        break;
                    }
                case 6:
                    String string9 = cursor.getString(cursor.getColumnIndex("data1"));
                    int i12 = cursor.getInt(cursor.getColumnIndex("data2"));
                    if (!TextUtils.isEmpty(string9)) {
                        int columnIndex4 = cursor.getColumnIndex("data3");
                        dVar.f67156s.add(new d.b(columnIndex4 >= 0 ? ContactsContract.CommonDataKinds.Phone.getTypeLabel(Resources.getSystem(), i12, cursor.getString(columnIndex4)).toString() : "other", string9, string2));
                        break;
                    } else {
                        break;
                    }
                case 7:
                    dVar.f67146i = cursor.getString(cursor.getColumnIndex("data1"));
                    dVar.f67147j = cursor.getString(cursor.getColumnIndex("data4"));
                    dVar.f67148k = cursor.getString(cursor.getColumnIndex("data5"));
                    break;
                case '\b':
                    String string10 = cursor.getString(cursor.getColumnIndex("data1"));
                    int i13 = cursor.getInt(cursor.getColumnIndex("data5"));
                    if (!TextUtils.isEmpty(string10)) {
                        switch (i13) {
                            case -1:
                                if (cursor.getString(cursor.getColumnIndex("data6")) != null) {
                                    str = cursor.getString(cursor.getColumnIndex("data6"));
                                    str3 = str;
                                    break;
                                }
                                break;
                            case 0:
                                str = "AIM";
                                str3 = str;
                                break;
                            case 1:
                                str = "MSN";
                                str3 = str;
                                break;
                            case 2:
                                str = "Yahoo";
                                str3 = str;
                                break;
                            case 3:
                                str = "Skype";
                                str3 = str;
                                break;
                            case 4:
                                str = "QQ";
                                str3 = str;
                                break;
                            case 5:
                                str = "Google Talk";
                                str3 = str;
                                break;
                            case 6:
                                str = "ICQ";
                                str3 = str;
                                break;
                            case 7:
                                str = "Jabber";
                                str3 = str;
                                break;
                            case 8:
                                str = "NetMeeting";
                                str3 = str;
                                break;
                            default:
                                str3 = str;
                                break;
                        }
                        dVar.f67151n.add(new d.b(str3, string10, string2));
                        break;
                    } else {
                        break;
                    }
            }
        }
        return linkedHashMap;
    }

    /* renamed from: vc.a$d */
    public static class d {

        /* renamed from: a, reason: collision with root package name */
        public String f67138a;

        /* renamed from: b, reason: collision with root package name */
        public String f67139b;

        /* renamed from: c, reason: collision with root package name */
        public String f67140c;

        /* renamed from: q, reason: collision with root package name */
        public String f67154q;

        /* renamed from: u, reason: collision with root package name */
        public C0942a f67158u;

        /* renamed from: d, reason: collision with root package name */
        public String f67141d = "";

        /* renamed from: e, reason: collision with root package name */
        public String f67142e = "";

        /* renamed from: f, reason: collision with root package name */
        public String f67143f = "";

        /* renamed from: g, reason: collision with root package name */
        public String f67144g = "";

        /* renamed from: h, reason: collision with root package name */
        public String f67145h = "";

        /* renamed from: i, reason: collision with root package name */
        public String f67146i = "";

        /* renamed from: j, reason: collision with root package name */
        public String f67147j = "";

        /* renamed from: k, reason: collision with root package name */
        public String f67148k = "";

        /* renamed from: l, reason: collision with root package name */
        public String f67149l = "";

        /* renamed from: m, reason: collision with root package name */
        public List f67150m = new ArrayList();

        /* renamed from: n, reason: collision with root package name */
        public List f67151n = new ArrayList();

        /* renamed from: o, reason: collision with root package name */
        public boolean f67152o = false;

        /* renamed from: p, reason: collision with root package name */
        public boolean f67153p = false;

        /* renamed from: r, reason: collision with root package name */
        public List f67155r = new ArrayList();

        /* renamed from: s, reason: collision with root package name */
        public List f67156s = new ArrayList();

        /* renamed from: t, reason: collision with root package name */
        public List f67157t = new ArrayList();

        /* renamed from: vc.a$d$b */
        public static class b {

            /* renamed from: a, reason: collision with root package name */
            public String f67162a;

            /* renamed from: b, reason: collision with root package name */
            public String f67163b;

            /* renamed from: c, reason: collision with root package name */
            public String f67164c;

            public b(String str, String str2, String str3) {
                this.f67164c = str3;
                this.f67162a = str;
                this.f67163b = str2;
            }
        }

        /* renamed from: vc.a$d$c */
        public static class c {

            /* renamed from: a, reason: collision with root package name */
            public final WritableMap f67165a;

            public c(Cursor cursor) {
                WritableMap createMap = Arguments.createMap();
                this.f67165a = createMap;
                createMap.putString(AnnotatedPrivateKey.LABEL, a(cursor));
                b(cursor, "formattedAddress", "data1");
                b(cursor, "street", "data4");
                b(cursor, "pobox", "data5");
                b(cursor, "neighborhood", "data6");
                b(cursor, "city", "data7");
                b(cursor, EventKeys.REGION, "data8");
                b(cursor, "state", "data8");
                b(cursor, "postCode", "data9");
                b(cursor, AdRevenueScheme.COUNTRY, "data10");
            }

            public static String a(Cursor cursor) {
                int i10 = cursor.getInt(cursor.getColumnIndex("data2"));
                if (i10 != 0) {
                    return i10 != 1 ? i10 != 2 ? "other" : "work" : "home";
                }
                String string = cursor.getString(cursor.getColumnIndex("data3"));
                return string != null ? string : "";
            }

            public final void b(Cursor cursor, String str, String str2) {
                String string = cursor.getString(cursor.getColumnIndex(str2));
                if (TextUtils.isEmpty(string)) {
                    return;
                }
                this.f67165a.putString(str, string);
            }
        }

        public d(String str) {
            this.f67138a = str;
        }

        public WritableMap w() {
            WritableMap createMap = Arguments.createMap();
            createMap.putString("recordID", this.f67138a);
            createMap.putString("rawContactId", this.f67139b);
            createMap.putString("givenName", TextUtils.isEmpty(this.f67141d) ? this.f67140c : this.f67141d);
            createMap.putString("displayName", this.f67140c);
            createMap.putString("middleName", this.f67142e);
            createMap.putString("familyName", this.f67143f);
            createMap.putString("prefix", this.f67144g);
            createMap.putString("suffix", this.f67145h);
            createMap.putString("company", this.f67146i);
            createMap.putString("jobTitle", this.f67147j);
            createMap.putString("department", this.f67148k);
            createMap.putString("note", this.f67149l);
            createMap.putBoolean("hasThumbnail", this.f67152o);
            String str = this.f67154q;
            if (str == null) {
                str = "";
            }
            createMap.putString("thumbnailPath", str);
            createMap.putBoolean("isStarred", this.f67153p);
            WritableArray createArray = Arguments.createArray();
            for (b bVar : this.f67156s) {
                WritableMap createMap2 = Arguments.createMap();
                createMap2.putString("number", bVar.f67163b);
                createMap2.putString(AnnotatedPrivateKey.LABEL, bVar.f67162a);
                createMap2.putString(StackTraceHelper.ID_KEY, bVar.f67164c);
                createArray.pushMap(createMap2);
            }
            createMap.putArray("phoneNumbers", createArray);
            WritableArray createArray2 = Arguments.createArray();
            for (b bVar2 : this.f67150m) {
                WritableMap createMap3 = Arguments.createMap();
                createMap3.putString(EventKeys.URL, bVar2.f67163b);
                createMap3.putString(StackTraceHelper.ID_KEY, bVar2.f67164c);
                createArray2.pushMap(createMap3);
            }
            createMap.putArray("urlAddresses", createArray2);
            WritableArray createArray3 = Arguments.createArray();
            for (b bVar3 : this.f67151n) {
                WritableMap createMap4 = Arguments.createMap();
                createMap4.putString("username", bVar3.f67163b);
                createMap4.putString("service", bVar3.f67162a);
                createArray3.pushMap(createMap4);
            }
            createMap.putArray("imAddresses", createArray3);
            WritableArray createArray4 = Arguments.createArray();
            for (b bVar4 : this.f67155r) {
                WritableMap createMap5 = Arguments.createMap();
                createMap5.putString("email", bVar4.f67163b);
                createMap5.putString(AnnotatedPrivateKey.LABEL, bVar4.f67162a);
                createMap5.putString(StackTraceHelper.ID_KEY, bVar4.f67164c);
                createArray4.pushMap(createMap5);
            }
            createMap.putArray("emailAddresses", createArray4);
            WritableArray createArray5 = Arguments.createArray();
            Iterator it = this.f67157t.iterator();
            while (it.hasNext()) {
                createArray5.pushMap(((c) it.next()).f67165a);
            }
            createMap.putArray("postalAddresses", createArray5);
            WritableMap createMap6 = Arguments.createMap();
            C0942a c0942a = this.f67158u;
            if (c0942a != null) {
                int i10 = c0942a.f67159a;
                if (i10 > 0) {
                    createMap6.putInt("year", i10);
                }
                createMap6.putInt("month", this.f67158u.f67160b);
                createMap6.putInt("day", this.f67158u.f67161c);
                createMap.putMap("birthday", createMap6);
            }
            return createMap;
        }

        /* renamed from: vc.a$d$a, reason: collision with other inner class name */
        public static class C0942a {

            /* renamed from: a, reason: collision with root package name */
            public int f67159a;

            /* renamed from: b, reason: collision with root package name */
            public int f67160b;

            /* renamed from: c, reason: collision with root package name */
            public int f67161c;

            public C0942a(int i10, int i11, int i12) {
                this.f67159a = i10;
                this.f67160b = i11;
                this.f67161c = i12;
            }

            public C0942a(int i10, int i11) {
                this.f67159a = 0;
                this.f67160b = i10;
                this.f67161c = i11;
            }
        }
    }
}
