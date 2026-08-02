package wc;

import android.app.Activity;
import android.content.ContentProviderOperation;
import android.content.ContentProviderResult;
import android.content.ContentResolver;
import android.content.ContentUris;
import android.content.ContentValues;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.provider.ContactsContract;
import com.appsflyer.AdRevenueScheme;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.devsupport.StackTraceHelper;
import com.twilio.voice.EventKeys;
import java.io.ByteArrayOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import l0.AbstractC5338c;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;
import vc.C6682a;

/* loaded from: classes4.dex */
public class h {

    /* renamed from: c, reason: collision with root package name */
    public static Promise f67565c;

    /* renamed from: d, reason: collision with root package name */
    public static Promise f67566d;

    /* renamed from: a, reason: collision with root package name */
    public final ReactApplicationContext f67567a;

    /* renamed from: b, reason: collision with root package name */
    public Executor f67568b;

    public class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f67569a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Promise f67570b;

        public a(String str, Promise promise) {
            this.f67569a = str;
            this.f67570b = promise;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f67570b.resolve(new C6682a(h.this.w().getContentResolver()).g(this.f67569a));
        }
    }

    public h(ReactApplicationContext reactApplicationContext, boolean z10) {
        this.f67567a = reactApplicationContext;
        this.f67568b = z(z10);
    }

    public final String A() {
        return AbstractC5338c.checkSelfPermission(w(), "android.permission.READ_CONTACTS") == 0 ? "authorized" : "denied";
    }

    public final /* synthetic */ void B(Promise promise) {
        promise.resolve(new C6682a(w().getContentResolver()).e());
    }

    public final /* synthetic */ void C(String str, Promise promise) {
        promise.resolve(new C6682a(w().getContentResolver()).c(str));
    }

    public final /* synthetic */ void D(String str, Promise promise) {
        promise.resolve(new C6682a(w().getContentResolver()).f(str));
    }

    public final /* synthetic */ void E(String str, Promise promise) {
        promise.resolve(new C6682a(w().getContentResolver()).i(str));
    }

    public final /* synthetic */ void F(Promise promise) {
        try {
            promise.resolve(new C6682a(w().getContentResolver()).h());
        } catch (Exception e10) {
            promise.reject(e10);
        }
    }

    public final /* synthetic */ void G(String str, Promise promise) {
        promise.resolve(new C6682a(w().getContentResolver()).j(str));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final /* synthetic */ void H(String str, String str2, Promise promise) {
        FileOutputStream fileOutputStream;
        InputStream openContactPhotoInputStream = ContactsContract.Contacts.openContactPhotoInputStream(w().getContentResolver(), ContentUris.withAppendedId(ContactsContract.Contacts.CONTENT_URI, Long.parseLong(str)));
        FileOutputStream fileOutputStream2 = null;
        fileOutputStream2 = null;
        fileOutputStream2 = null;
        try {
            try {
                try {
                    fileOutputStream = new FileOutputStream(str2);
                } catch (IOException e10) {
                    e10.printStackTrace();
                }
            } catch (FileNotFoundException e11) {
                e = e11;
            }
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            try {
                Bitmap decodeStream = BitmapFactory.decodeStream(openContactPhotoInputStream);
                Bitmap.CompressFormat compressFormat = Bitmap.CompressFormat.PNG;
                decodeStream.compress(compressFormat, 100, fileOutputStream);
                promise.resolve(Boolean.TRUE);
                fileOutputStream.close();
                fileOutputStream2 = compressFormat;
            } catch (FileNotFoundException e12) {
                e = e12;
                fileOutputStream2 = fileOutputStream;
                promise.reject(e.toString());
                if (fileOutputStream2 != null) {
                    fileOutputStream2.close();
                    fileOutputStream2 = fileOutputStream2;
                }
                openContactPhotoInputStream.close();
            } catch (Throwable th3) {
                th = th3;
                fileOutputStream2 = fileOutputStream;
                if (fileOutputStream2 != null) {
                    try {
                        fileOutputStream2.close();
                    } catch (IOException e13) {
                        e13.printStackTrace();
                    }
                }
                throw th;
            }
            openContactPhotoInputStream.close();
        } catch (IOException e14) {
            e14.printStackTrace();
        }
    }

    public final int I(String str) {
        str.getClass();
        switch (str) {
            case "mobile":
                return 4;
            case "home":
                return 1;
            case "work":
                return 2;
            case "other":
                return 3;
            case "personal":
                return 1;
            default:
                return 0;
        }
    }

    public final int J(String str) {
        str.getClass();
        switch (str) {
            case "mobile":
                return 2;
            case "work_pager":
                return 18;
            case "home fax":
                return 5;
            case "work_mobile":
                return 17;
            case "cell":
                return 2;
            case "home":
                return 1;
            case "main":
                return 12;
            case "work":
                return 3;
            case "work fax":
                return 4;
            case "other":
                return 7;
            case "pager":
                return 6;
            default:
                return 0;
        }
    }

    public final int K(String str) {
        str.getClass();
        if (str.equals("home")) {
            return 1;
        }
        return !str.equals("work") ? 0 : 2;
    }

    public void L(Activity activity, int i10, int i11, Intent intent) {
        Promise promise;
        Uri data;
        if ((i10 == 52941 || i10 == 52942) && (promise = f67565c) != null) {
            if (i11 != -1) {
                promise.resolve(null);
                f67565c = null;
                return;
            }
            if (intent == null) {
                promise.reject("Error received activity result with no data!");
                f67565c = null;
                return;
            }
            try {
                data = intent.getData();
            } catch (Exception e10) {
                f67565c.reject(e10.getMessage());
            }
            if (data == null) {
                f67565c.reject("Error wrong data. No content uri found!");
                f67565c = null;
            } else {
                f67565c.resolve(new C6682a(w().getContentResolver()).c(data.getLastPathSegment()));
                f67565c = null;
            }
        }
    }

    public void N(ReadableMap readableMap, Promise promise) {
        String str;
        int i10;
        String[] strArr;
        String[] strArr2;
        Integer[] numArr;
        String[] strArr3;
        int i11;
        String[] strArr4;
        Integer num;
        String[] strArr5;
        int i12;
        String[] strArr6;
        Integer[] numArr2;
        String[] strArr7;
        int i13;
        String[] strArr8;
        String[] strArr9;
        String[] strArr10;
        String[] strArr11;
        String[] strArr12;
        String[] strArr13;
        String[] strArr14;
        Integer[] numArr3;
        String[] strArr15;
        int i14;
        String[] strArr16;
        String[] strArr17;
        Bitmap x10;
        String string = readableMap.hasKey("givenName") ? readableMap.getString("givenName") : null;
        String string2 = readableMap.hasKey("middleName") ? readableMap.getString("middleName") : null;
        String string3 = readableMap.hasKey("displayName") ? readableMap.getString("displayName") : null;
        String string4 = readableMap.hasKey("familyName") ? readableMap.getString("familyName") : null;
        String string5 = readableMap.hasKey("prefix") ? readableMap.getString("prefix") : null;
        String string6 = readableMap.hasKey("suffix") ? readableMap.getString("suffix") : null;
        String string7 = readableMap.hasKey("company") ? readableMap.getString("company") : null;
        String string8 = readableMap.hasKey("jobTitle") ? readableMap.getString("jobTitle") : null;
        String string9 = readableMap.hasKey("department") ? readableMap.getString("department") : null;
        String string10 = readableMap.hasKey("note") ? readableMap.getString("note") : null;
        String string11 = readableMap.hasKey("thumbnailPath") ? readableMap.getString("thumbnailPath") : null;
        ReadableArray array = readableMap.hasKey("phoneNumbers") ? readableMap.getArray("phoneNumbers") : null;
        String str2 = string3;
        if (array != null) {
            i10 = array.size();
            str = string11;
            String[] strArr18 = new String[i10];
            strArr2 = new String[i10];
            numArr = new Integer[i10];
            int i15 = 0;
            while (true) {
                int i16 = i10;
                if (i15 >= i10) {
                    break;
                }
                strArr18[i15] = array.getMap(i15).getString("number");
                String string12 = array.getMap(i15).getString(AnnotatedPrivateKey.LABEL);
                strArr2[i15] = string12;
                numArr[i15] = Integer.valueOf(J(string12));
                i15++;
                i10 = i16;
                string10 = string10;
            }
            strArr = strArr18;
        } else {
            str = string11;
            i10 = 0;
            strArr = null;
            strArr2 = null;
            numArr = null;
        }
        String str3 = string10;
        ReadableArray array2 = readableMap.hasKey("urlAddresses") ? readableMap.getArray("urlAddresses") : null;
        if (array2 != null) {
            i11 = array2.size();
            strArr3 = strArr;
            String[] strArr19 = new String[i11];
            int i17 = 0;
            while (true) {
                int i18 = i11;
                if (i17 >= i11) {
                    break;
                }
                strArr19[i17] = array2.getMap(i17).getString(EventKeys.URL);
                i17++;
                i11 = i18;
                array2 = array2;
            }
            strArr4 = strArr19;
        } else {
            strArr3 = strArr;
            i11 = 0;
            strArr4 = null;
        }
        ReadableArray array3 = readableMap.hasKey("emailAddresses") ? readableMap.getArray("emailAddresses") : null;
        if (array3 != null) {
            strArr5 = strArr4;
            i12 = array3.size();
            num = 1;
            String[] strArr20 = new String[i12];
            numArr2 = new Integer[i12];
            int i19 = 0;
            while (true) {
                int i20 = i12;
                if (i19 >= i12) {
                    break;
                }
                strArr20[i19] = array3.getMap(i19).getString("email");
                numArr2[i19] = Integer.valueOf(I(array3.getMap(i19).getString(AnnotatedPrivateKey.LABEL)));
                i19++;
                i12 = i20;
                i10 = i10;
            }
            strArr6 = strArr20;
        } else {
            num = 1;
            strArr5 = strArr4;
            i12 = 0;
            strArr6 = null;
            numArr2 = null;
        }
        int i21 = i10;
        ReadableArray array4 = readableMap.hasKey("postalAddresses") ? readableMap.getArray("postalAddresses") : null;
        if (array4 != null) {
            i13 = array4.size();
            strArr7 = strArr6;
            strArr9 = new String[i13];
            strArr10 = new String[i13];
            String[] strArr21 = new String[i13];
            strArr11 = new String[i13];
            String[] strArr22 = new String[i13];
            strArr12 = new String[i13];
            strArr13 = new String[i13];
            strArr14 = new String[i13];
            numArr3 = new Integer[i13];
            int i22 = 0;
            while (true) {
                int i23 = i13;
                if (i22 >= i13) {
                    break;
                }
                strArr9[i22] = array4.getMap(i22).getString("street");
                strArr10[i22] = array4.getMap(i22).getString("city");
                strArr21[i22] = array4.getMap(i22).getString("state");
                strArr11[i22] = array4.getMap(i22).getString(EventKeys.REGION);
                strArr22[i22] = array4.getMap(i22).getString("postCode");
                strArr12[i22] = array4.getMap(i22).getString(AdRevenueScheme.COUNTRY);
                strArr13[i22] = array4.getMap(i22).getString("formattedAddress");
                strArr14[i22] = array4.getMap(i22).getString(AnnotatedPrivateKey.LABEL);
                numArr3[i22] = Integer.valueOf(K(array4.getMap(i22).getString(AnnotatedPrivateKey.LABEL)));
                i22++;
                i13 = i23;
                i12 = i12;
            }
            strArr8 = strArr22;
        } else {
            strArr7 = strArr6;
            i13 = 0;
            strArr8 = null;
            strArr9 = null;
            strArr10 = null;
            strArr11 = null;
            strArr12 = null;
            strArr13 = null;
            strArr14 = null;
            numArr3 = null;
        }
        int i24 = i12;
        ReadableArray array5 = readableMap.hasKey("imAddresses") ? readableMap.getArray("imAddresses") : null;
        if (array5 != null) {
            i14 = array5.size();
            strArr16 = new String[i14];
            strArr17 = new String[i14];
            strArr15 = strArr8;
            int i25 = 0;
            while (true) {
                int i26 = i14;
                if (i25 >= i14) {
                    break;
                }
                String[] strArr23 = strArr16;
                strArr23[i25] = array5.getMap(i25).getString("username");
                strArr17[i25] = array5.getMap(i25).getString("service");
                i25++;
                i14 = i26;
                strArr16 = strArr23;
            }
        } else {
            strArr15 = strArr8;
            i14 = 0;
            strArr16 = null;
            strArr17 = null;
        }
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
        ContentValues contentValues = new ContentValues();
        String[] strArr24 = strArr16;
        String[] strArr25 = strArr17;
        contentValues.put("mimetype", "vnd.android.cursor.item/identity");
        contentValues.put("data2", string);
        contentValues.put("data3", string4);
        contentValues.put("data5", string2);
        contentValues.put("data4", string5);
        contentValues.put("data6", string6);
        arrayList.add(contentValues);
        ContentValues contentValues2 = new ContentValues();
        contentValues2.put("mimetype", "vnd.android.cursor.item/organization");
        contentValues2.put("data1", string7);
        contentValues2.put("data4", string8);
        contentValues2.put("data5", string9);
        arrayList.add(contentValues2);
        for (int i27 = 0; i27 < i11; i27++) {
            ContentValues contentValues3 = new ContentValues();
            contentValues3.put("mimetype", "vnd.android.cursor.item/website");
            contentValues3.put("data1", strArr5[i27]);
            arrayList.add(contentValues3);
        }
        for (int i28 = 0; i28 < i24; i28++) {
            ContentValues contentValues4 = new ContentValues();
            contentValues4.put("mimetype", "vnd.android.cursor.item/email_v2");
            contentValues4.put("data2", numArr2[i28]);
            contentValues4.put("data1", strArr7[i28]);
            arrayList.add(contentValues4);
        }
        for (int i29 = 0; i29 < i21; i29++) {
            ContentValues contentValues5 = new ContentValues();
            contentValues5.put("mimetype", "vnd.android.cursor.item/phone_v2");
            contentValues5.put("data2", numArr[i29]);
            contentValues5.put("data3", strArr2[i29]);
            contentValues5.put("data1", strArr3[i29]);
            arrayList.add(contentValues5);
        }
        for (int i30 = 0; i30 < i13; i30++) {
            ContentValues contentValues6 = new ContentValues();
            contentValues6.put("mimetype", "vnd.android.cursor.item/postal-address_v2");
            contentValues6.put("data4", strArr9[i30]);
            contentValues6.put("data7", strArr10[i30]);
            contentValues6.put("data8", strArr11[i30]);
            contentValues6.put("data10", strArr12[i30]);
            contentValues6.put("data9", strArr15[i30]);
            contentValues6.put("data1", strArr13[i30]);
            contentValues6.put("data3", strArr14[i30]);
            contentValues6.put("data2", numArr3[i30]);
            arrayList.add(contentValues6);
        }
        for (int i31 = 0; i31 < i14; i31++) {
            ContentValues contentValues7 = new ContentValues();
            contentValues7.put("mimetype", "vnd.android.cursor.item/im");
            contentValues7.put("data1", strArr24[i31]);
            contentValues7.put("data2", num);
            contentValues7.put("data5", (Integer) (-1));
            contentValues7.put("data6", strArr25[i31]);
            arrayList.add(contentValues7);
        }
        Integer num2 = num;
        if (str3 != null) {
            ContentValues contentValues8 = new ContentValues();
            contentValues8.put("mimetype", "vnd.android.cursor.item/note");
            contentValues8.put("data1", str3);
            arrayList.add(contentValues8);
        }
        if (str != null && !str.isEmpty() && (x10 = x(str)) != null) {
            ContentValues contentValues9 = new ContentValues();
            contentValues9.put("raw_contact_id", (Integer) 0);
            contentValues9.put("is_super_primary", num2);
            contentValues9.put("data15", R(x10));
            contentValues9.put("mimetype", "vnd.android.cursor.item/photo");
            arrayList.add(contentValues9);
        }
        Intent intent = new Intent("android.intent.action.INSERT", ContactsContract.Contacts.CONTENT_URI);
        intent.putExtra("name", str2);
        intent.putExtra("finishActivityOnSaveCompleted", true);
        intent.putParcelableArrayListExtra(EventKeys.DATA, arrayList);
        f67565c = promise;
        w().startActivityForResult(intent, 52941, Bundle.EMPTY);
    }

    public void O(ReadableMap readableMap, Promise promise) {
        try {
            Uri withAppendedPath = Uri.withAppendedPath(ContactsContract.Contacts.CONTENT_URI, readableMap.hasKey("recordID") ? readableMap.getString("recordID") : null);
            Intent intent = new Intent("android.intent.action.EDIT");
            intent.setDataAndType(withAppendedPath, "vnd.android.cursor.item/contact");
            intent.putExtra("finishActivityOnSaveCompleted", true);
            f67565c = promise;
            w().startActivityForResult(intent, 52942, Bundle.EMPTY);
        } catch (Exception e10) {
            promise.reject(e10.toString());
        }
    }

    public void P(Promise promise) {
        Q(promise);
    }

    public final void Q(Promise promise) {
        Activity t10 = t();
        if (t10 == null) {
            promise.reject("denied");
        } else if (A().equals("authorized")) {
            promise.resolve("authorized");
        } else {
            f67566d = promise;
            androidx.core.app.b.f(t10, new String[]{"android.permission.READ_CONTACTS"}, 888);
        }
    }

    public byte[] R(Bitmap bitmap) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        bitmap.compress(Bitmap.CompressFormat.JPEG, 80, byteArrayOutputStream);
        return byteArrayOutputStream.toByteArray();
    }

    public void S(ReadableMap readableMap, Promise promise) {
        String str;
        int i10;
        String[] strArr;
        Integer[] numArr;
        String[] strArr2;
        int i11;
        int i12;
        String[] strArr3;
        String[] strArr4;
        int i13;
        String[] strArr5;
        String[] strArr6;
        int i14;
        Integer[] numArr2;
        String[] strArr7;
        int i15;
        int i16;
        String[] strArr8;
        String[] strArr9;
        String[] strArr10;
        String[] strArr11;
        String[] strArr12;
        Integer[] numArr3;
        String[] strArr13;
        ReadableArray readableArray;
        int i17;
        String[] strArr14;
        String[] strArr15;
        int i18;
        String[] strArr16;
        String str2;
        Uri uri;
        Promise promise2;
        Bitmap x10;
        int i19;
        String str3;
        ContentProviderOperation.Builder withValue;
        String string = readableMap.hasKey("recordID") ? readableMap.getString("recordID") : null;
        String string2 = readableMap.hasKey("rawContactId") ? readableMap.getString("rawContactId") : null;
        if (string2 == null || string == null) {
            promise.reject("Invalid recordId or rawContactId");
            return;
        }
        String string3 = readableMap.hasKey("givenName") ? readableMap.getString("givenName") : null;
        String string4 = readableMap.hasKey("middleName") ? readableMap.getString("middleName") : null;
        String string5 = readableMap.hasKey("familyName") ? readableMap.getString("familyName") : null;
        String string6 = readableMap.hasKey("prefix") ? readableMap.getString("prefix") : null;
        String string7 = readableMap.hasKey("suffix") ? readableMap.getString("suffix") : null;
        String string8 = readableMap.hasKey("company") ? readableMap.getString("company") : null;
        String string9 = readableMap.hasKey("jobTitle") ? readableMap.getString("jobTitle") : null;
        String string10 = readableMap.hasKey("department") ? readableMap.getString("department") : null;
        String string11 = readableMap.hasKey("note") ? readableMap.getString("note") : null;
        String string12 = readableMap.hasKey("thumbnailPath") ? readableMap.getString("thumbnailPath") : null;
        ReadableArray array = readableMap.hasKey("phoneNumbers") ? readableMap.getArray("phoneNumbers") : null;
        String str4 = AnnotatedPrivateKey.LABEL;
        String str5 = string12;
        String str6 = string11;
        if (array != null) {
            i10 = array.size();
            str = string2;
            strArr = new String[i10];
            numArr = new Integer[i10];
            strArr2 = new String[i10];
            String[] strArr17 = new String[i10];
            int i20 = 0;
            while (true) {
                int i21 = i10;
                if (i20 >= i10) {
                    break;
                }
                ReadableMap map = array.getMap(i20);
                int i22 = i20;
                String string13 = map.getString("number");
                String string14 = map.getString(AnnotatedPrivateKey.LABEL);
                String string15 = map.hasKey(StackTraceHelper.ID_KEY) ? map.getString(StackTraceHelper.ID_KEY) : null;
                strArr[i22] = string13;
                numArr[i22] = Integer.valueOf(J(string14));
                strArr2[i22] = string14;
                strArr17[i22] = string15;
                i20 = i22 + 1;
                i10 = i21;
            }
        } else {
            str = string2;
            i10 = 0;
            strArr = null;
            numArr = null;
            strArr2 = null;
        }
        ReadableArray array2 = readableMap.hasKey("urlAddresses") ? readableMap.getArray("urlAddresses") : null;
        ReadableArray readableArray2 = array;
        if (array2 != null) {
            i12 = array2.size();
            i11 = i10;
            String[] strArr18 = new String[i12];
            strArr4 = new String[i12];
            int i23 = 0;
            while (true) {
                int i24 = i12;
                if (i23 >= i12) {
                    break;
                }
                ReadableMap map2 = array2.getMap(i23);
                ReadableArray readableArray3 = array2;
                strArr18[i23] = map2.getString(EventKeys.URL);
                strArr4[i23] = map2.hasKey(StackTraceHelper.ID_KEY) ? map2.getString(StackTraceHelper.ID_KEY) : null;
                i23++;
                i12 = i24;
                array2 = readableArray3;
            }
            strArr3 = strArr18;
        } else {
            i11 = i10;
            i12 = 0;
            strArr3 = null;
            strArr4 = null;
        }
        ReadableArray array3 = readableMap.hasKey("emailAddresses") ? readableMap.getArray("emailAddresses") : null;
        if (array3 != null) {
            strArr5 = strArr3;
            i14 = array3.size();
            i13 = i12;
            String[] strArr19 = new String[i14];
            String[] strArr20 = new String[i14];
            numArr2 = new Integer[i14];
            strArr7 = new String[i14];
            int i25 = 0;
            while (true) {
                int i26 = i14;
                if (i25 >= i14) {
                    break;
                }
                ReadableMap map3 = array3.getMap(i25);
                ReadableArray readableArray4 = array3;
                strArr19[i25] = map3.getString("email");
                String string16 = map3.getString(AnnotatedPrivateKey.LABEL);
                numArr2[i25] = Integer.valueOf(I(string16));
                strArr7[i25] = string16;
                strArr20[i25] = map3.hasKey(StackTraceHelper.ID_KEY) ? map3.getString(StackTraceHelper.ID_KEY) : null;
                i25++;
                i14 = i26;
                array3 = readableArray4;
            }
            strArr6 = strArr19;
        } else {
            i13 = i12;
            strArr5 = strArr3;
            strArr6 = null;
            i14 = 0;
            numArr2 = null;
            strArr7 = null;
        }
        ReadableArray readableArray5 = array3;
        ReadableArray array4 = readableMap.hasKey("postalAddresses") ? readableMap.getArray("postalAddresses") : null;
        String[] strArr21 = strArr6;
        if (array4 != null) {
            i16 = array4.size();
            i15 = i14;
            String[] strArr22 = new String[i16];
            strArr9 = new String[i16];
            strArr10 = new String[i16];
            String[] strArr23 = new String[i16];
            strArr11 = new String[i16];
            strArr12 = new String[i16];
            numArr3 = new Integer[i16];
            strArr13 = new String[i16];
            int i27 = 0;
            while (true) {
                int i28 = i16;
                if (i27 >= i16) {
                    break;
                }
                String y10 = y(array4.getMap(i27), str4);
                strArr22[i27] = y(array4.getMap(i27), "street");
                strArr9[i27] = y(array4.getMap(i27), "city");
                strArr10[i27] = y(array4.getMap(i27), "state");
                strArr23[i27] = y(array4.getMap(i27), EventKeys.REGION);
                strArr11[i27] = y(array4.getMap(i27), "postCode");
                strArr12[i27] = y(array4.getMap(i27), AdRevenueScheme.COUNTRY);
                numArr3[i27] = Integer.valueOf(K(y10));
                strArr13[i27] = y10;
                i27++;
                i16 = i28;
                str4 = str4;
                string10 = string10;
            }
            strArr8 = strArr22;
        } else {
            i15 = i14;
            i16 = 0;
            strArr8 = null;
            strArr9 = null;
            strArr10 = null;
            strArr11 = null;
            strArr12 = null;
            numArr3 = null;
            strArr13 = null;
        }
        String str7 = string10;
        ReadableArray array5 = readableMap.hasKey("imAddresses") ? readableMap.getArray("imAddresses") : null;
        if (array5 != null) {
            i17 = array5.size();
            strArr14 = new String[i17];
            readableArray = array4;
            String[] strArr24 = new String[i17];
            String[] strArr25 = new String[i17];
            int i29 = 0;
            while (true) {
                int i30 = i17;
                if (i29 >= i17) {
                    break;
                }
                ReadableMap map4 = array5.getMap(i29);
                ReadableArray readableArray6 = array5;
                strArr14[i29] = map4.getString("username");
                strArr24[i29] = map4.getString("service");
                strArr25[i29] = map4.hasKey(StackTraceHelper.ID_KEY) ? map4.getString(StackTraceHelper.ID_KEY) : null;
                i29++;
                i17 = i30;
                array5 = readableArray6;
            }
            strArr15 = strArr24;
        } else {
            readableArray = array4;
            i17 = 0;
            strArr14 = null;
            strArr15 = null;
        }
        ReadableArray readableArray7 = array5;
        ArrayList<ContentProviderOperation> arrayList = new ArrayList<>();
        Uri uri2 = ContactsContract.Data.CONTENT_URI;
        String[] strArr26 = strArr14;
        arrayList.add(ContentProviderOperation.newUpdate(uri2).withSelection("contact_id=?", new String[]{string}).withValue("mimetype", "vnd.android.cursor.item/name").withValue("data2", string3).withValue("data5", string4).withValue("data3", string5).withValue("data4", string6).withValue("data6", string7).build());
        ContentProviderOperation.Builder withValue2 = ContentProviderOperation.newUpdate(uri2).withSelection("contact_id=? AND mimetype = ?", new String[]{string, "vnd.android.cursor.item/organization"}).withValue("data1", string8).withValue("data4", string9).withValue("data5", str7);
        arrayList.add(withValue2.build());
        withValue2.withYieldAllowed(true);
        if (readableArray2 != null) {
            i18 = 1;
            strArr16 = strArr8;
            str2 = str;
            arrayList.add(ContentProviderOperation.newDelete(uri2).withSelection("mimetype=? AND raw_contact_id = ?", new String[]{"vnd.android.cursor.item/phone_v2", str2}).build());
            int i31 = 0;
            while (true) {
                int i32 = i11;
                if (i31 >= i32) {
                    break;
                }
                i11 = i32;
                int i33 = i31;
                arrayList.add(ContentProviderOperation.newInsert(ContactsContract.Data.CONTENT_URI).withValue("raw_contact_id", str2).withValue("mimetype", "vnd.android.cursor.item/phone_v2").withValue("data1", strArr[i33]).withValue("data2", numArr[i33]).withValue("data3", strArr2[i33]).build());
                i31 = i33 + 1;
            }
        } else {
            i18 = 1;
            strArr16 = strArr8;
            str2 = str;
        }
        int i34 = 0;
        while (true) {
            int i35 = i13;
            if (i34 >= i35) {
                break;
            }
            if (strArr4[i34] == null) {
                i13 = i35;
                i19 = i34;
                withValue = ContentProviderOperation.newInsert(ContactsContract.Data.CONTENT_URI).withValue("raw_contact_id", str2).withValue("mimetype", "vnd.android.cursor.item/website").withValue("data1", strArr5[i19]);
                str3 = string;
            } else {
                i13 = i35;
                i19 = i34;
                str3 = string;
                withValue = ContentProviderOperation.newUpdate(ContactsContract.Data.CONTENT_URI).withSelection("_id=?", new String[]{String.valueOf(strArr4[i19])}).withValue("data1", strArr5[i19]);
            }
            arrayList.add(withValue.build());
            i34 = i19 + 1;
            string = str3;
        }
        String str8 = string;
        if (readableArray5 != null) {
            arrayList.add(ContentProviderOperation.newDelete(ContactsContract.Data.CONTENT_URI).withSelection("mimetype=? AND raw_contact_id = ?", new String[]{"vnd.android.cursor.item/email_v2", str2}).build());
            int i36 = 0;
            while (true) {
                int i37 = i15;
                if (i36 >= i37) {
                    break;
                }
                i15 = i37;
                arrayList.add(ContentProviderOperation.newInsert(ContactsContract.Data.CONTENT_URI).withValue("raw_contact_id", str2).withValue("mimetype", "vnd.android.cursor.item/email_v2").withValue("data1", strArr21[i36]).withValue("data2", numArr2[i36]).withValue("data3", strArr7[i36]).build());
                i36++;
            }
        }
        Uri uri3 = ContactsContract.Data.CONTENT_URI;
        arrayList.add(ContentProviderOperation.newDelete(uri3).withSelection("mimetype=? AND raw_contact_id = ?", new String[]{"vnd.android.cursor.item/note", str2}).build());
        if (str6 != null) {
            arrayList.add(ContentProviderOperation.newInsert(uri3).withValue("raw_contact_id", str2).withValue("mimetype", "vnd.android.cursor.item/note").withValue("data1", str6).build());
        }
        if (str5 == null || str5.isEmpty() || (x10 = x(str5)) == null) {
            uri = uri3;
        } else {
            uri = uri3;
            arrayList.add(ContentProviderOperation.newInsert(uri3).withValueBackReference("raw_contact_id", 0).withValue("mimetype", "vnd.android.cursor.item/photo").withValue("data15", R(x10)).build());
        }
        if (readableArray != null) {
            arrayList.add(ContentProviderOperation.newDelete(uri).withSelection("mimetype=? AND raw_contact_id = ?", new String[]{"vnd.android.cursor.item/postal-address_v2", str2}).build());
            for (int i38 = 0; i38 < i16; i38++) {
                arrayList.add(ContentProviderOperation.newInsert(ContactsContract.Data.CONTENT_URI).withValue("raw_contact_id", str2).withValue("mimetype", "vnd.android.cursor.item/postal-address_v2").withValue("data2", numArr3[i38]).withValue("data3", strArr13[i38]).withValue("data4", strArr16[i38]).withValue("data7", strArr9[i38]).withValue("data8", strArr10[i38]).withValue("data9", strArr11[i38]).withValue("data10", strArr12[i38]).build());
            }
        }
        if (readableArray7 != null) {
            arrayList.add(ContentProviderOperation.newDelete(ContactsContract.Data.CONTENT_URI).withSelection("mimetype=? AND raw_contact_id = ?", new String[]{"vnd.android.cursor.item/im", str2}).build());
            for (int i39 = 0; i39 < i17; i39++) {
                arrayList.add(ContentProviderOperation.newInsert(ContactsContract.Data.CONTENT_URI).withValue("raw_contact_id", str2).withValue("mimetype", "vnd.android.cursor.item/im").withValue("data1", strArr26[i39]).withValue("data2", Integer.valueOf(i18)).withValue("data5", -1).withValue("data6", strArr15[i39]).build());
            }
        }
        try {
            ContentResolver contentResolver = w().getContentResolver();
            ContentProviderResult[] applyBatch = contentResolver.applyBatch("com.android.contacts", arrayList);
            if (applyBatch == null || applyBatch.length <= 0) {
                return;
            }
            promise2 = promise;
            try {
                promise2.resolve(new C6682a(contentResolver).c(str8));
            } catch (Exception e10) {
                e = e10;
                promise2.reject(e.toString());
            }
        } catch (Exception e11) {
            e = e11;
            promise2 = promise;
        }
    }

    public void T(ReadableMap readableMap, Promise promise) {
        try {
            Uri withAppendedPath = Uri.withAppendedPath(ContactsContract.Contacts.CONTENT_URI, readableMap.hasKey("recordID") ? readableMap.getString("recordID") : null);
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setDataAndType(withAppendedPath, "vnd.android.cursor.item/contact");
            intent.putExtra("finishActivityOnSaveCompleted", true);
            f67565c = promise;
            w().startActivityForResult(intent, 52942, Bundle.EMPTY);
        } catch (Exception e10) {
            promise.reject(e10.toString());
        }
    }

    public void U(final String str, final String str2, final Promise promise) {
        u().execute(new Runnable() { // from class: wc.c
            @Override // java.lang.Runnable
            public final void run() {
                h.this.H(str, str2, promise);
            }
        });
    }

    public void h(ReadableMap readableMap, Promise promise) {
        String[] strArr;
        int i10;
        Integer[] numArr;
        String[] strArr2;
        String[] strArr3;
        String[] strArr4;
        int i11;
        int i12;
        int i13;
        String[] strArr5;
        Integer[] numArr2;
        String[] strArr6;
        String[] strArr7;
        String[] strArr8;
        int i14;
        String[] strArr9;
        Promise promise2;
        Bitmap x10;
        int i15;
        if (readableMap == null) {
            promise.reject("New contact cannot be null.");
            return;
        }
        String string = readableMap.hasKey("givenName") ? readableMap.getString("givenName") : null;
        String string2 = readableMap.hasKey("middleName") ? readableMap.getString("middleName") : null;
        String string3 = readableMap.hasKey("familyName") ? readableMap.getString("familyName") : null;
        String string4 = readableMap.hasKey("prefix") ? readableMap.getString("prefix") : null;
        String string5 = readableMap.hasKey("suffix") ? readableMap.getString("suffix") : null;
        String string6 = readableMap.hasKey("company") ? readableMap.getString("company") : null;
        String string7 = readableMap.hasKey("jobTitle") ? readableMap.getString("jobTitle") : null;
        String string8 = readableMap.hasKey("department") ? readableMap.getString("department") : null;
        String string9 = readableMap.hasKey("note") ? readableMap.getString("note") : null;
        String string10 = readableMap.hasKey("thumbnailPath") ? readableMap.getString("thumbnailPath") : null;
        ReadableArray array = readableMap.hasKey("phoneNumbers") ? readableMap.getArray("phoneNumbers") : null;
        String str = AnnotatedPrivateKey.LABEL;
        if (array != null) {
            i10 = array.size();
            String[] strArr10 = new String[i10];
            numArr = new Integer[i10];
            strArr2 = new String[i10];
            int i16 = 0;
            while (true) {
                int i17 = i10;
                if (i16 >= i10) {
                    break;
                }
                strArr10[i16] = array.getMap(i16).getString("number");
                String string11 = array.getMap(i16).getString(AnnotatedPrivateKey.LABEL);
                numArr[i16] = Integer.valueOf(J(string11));
                strArr2[i16] = string11;
                i16++;
                i10 = i17;
                string10 = string10;
            }
            strArr = strArr10;
        } else {
            strArr = null;
            i10 = 0;
            numArr = null;
            strArr2 = null;
        }
        String str2 = string10;
        ReadableArray array2 = readableMap.hasKey("urlAddresses") ? readableMap.getArray("urlAddresses") : null;
        if (array2 != null) {
            int size = array2.size();
            strArr3 = strArr;
            String[] strArr11 = new String[size];
            int i18 = 0;
            while (true) {
                i15 = size;
                if (i18 >= size) {
                    break;
                }
                int i19 = i18;
                strArr11[i19] = array2.getMap(i18).getString(EventKeys.URL);
                i18 = i19 + 1;
                size = i15;
            }
            strArr4 = strArr11;
            i11 = i15;
        } else {
            strArr3 = strArr;
            strArr4 = null;
            i11 = 0;
        }
        ReadableArray array3 = readableMap.hasKey("emailAddresses") ? readableMap.getArray("emailAddresses") : null;
        String[] strArr12 = strArr4;
        if (array3 != null) {
            i13 = array3.size();
            i12 = i11;
            String[] strArr13 = new String[i13];
            numArr2 = new Integer[i13];
            strArr6 = new String[i13];
            int i20 = 0;
            while (true) {
                int i21 = i13;
                if (i20 >= i13) {
                    break;
                }
                strArr13[i20] = array3.getMap(i20).getString("email");
                String string12 = array3.getMap(i20).getString(AnnotatedPrivateKey.LABEL);
                numArr2[i20] = Integer.valueOf(I(string12));
                strArr6[i20] = string12;
                i20++;
                i13 = i21;
                i10 = i10;
            }
            strArr5 = strArr13;
        } else {
            i12 = i11;
            i13 = 0;
            strArr5 = null;
            numArr2 = null;
            strArr6 = null;
        }
        int i22 = i10;
        ReadableArray array4 = readableMap.hasKey("imAddresses") ? readableMap.getArray("imAddresses") : null;
        if (array4 != null) {
            i14 = array4.size();
            strArr7 = strArr5;
            String[] strArr14 = new String[i14];
            strArr9 = new String[i14];
            int i23 = 0;
            while (true) {
                int i24 = i14;
                if (i23 >= i14) {
                    break;
                }
                strArr14[i23] = array4.getMap(i23).getString("username");
                strArr9[i23] = array4.getMap(i23).getString("service");
                i23++;
                i14 = i24;
                str = str;
            }
            strArr8 = strArr14;
        } else {
            strArr7 = strArr5;
            strArr8 = null;
            i14 = 0;
            strArr9 = null;
        }
        String str3 = str;
        ArrayList<ContentProviderOperation> arrayList = new ArrayList<>();
        String[] strArr15 = strArr8;
        int i25 = i14;
        arrayList.add(ContentProviderOperation.newInsert(ContactsContract.RawContacts.CONTENT_URI).withValue("account_type", null).withValue("account_name", null).build());
        Uri uri = ContactsContract.Data.CONTENT_URI;
        arrayList.add(ContentProviderOperation.newInsert(uri).withValueBackReference("raw_contact_id", 0).withValue("mimetype", "vnd.android.cursor.item/name").withValue("data2", string).withValue("data5", string2).withValue("data3", string3).withValue("data4", string4).withValue("data6", string5).build());
        arrayList.add(ContentProviderOperation.newInsert(uri).withValueBackReference("raw_contact_id", 0).withValue("mimetype", "vnd.android.cursor.item/note").withValue("data1", string9).build());
        ContentProviderOperation.Builder withValue = ContentProviderOperation.newInsert(uri).withValueBackReference("raw_contact_id", 0).withValue("mimetype", "vnd.android.cursor.item/organization").withValue("data1", string6).withValue("data4", string7).withValue("data5", string8);
        arrayList.add(withValue.build());
        int i26 = 1;
        withValue.withYieldAllowed(true);
        for (int i27 = 0; i27 < i22; i27++) {
            arrayList.add(ContentProviderOperation.newInsert(ContactsContract.Data.CONTENT_URI).withValueBackReference("raw_contact_id", 0).withValue("mimetype", "vnd.android.cursor.item/phone_v2").withValue("data1", strArr3[i27]).withValue("data2", numArr[i27]).withValue("data3", strArr2[i27]).build());
        }
        int i28 = i12;
        for (int i29 = 0; i29 < i28; i29++) {
            arrayList.add(ContentProviderOperation.newInsert(ContactsContract.Data.CONTENT_URI).withValueBackReference("raw_contact_id", 0).withValue("mimetype", "vnd.android.cursor.item/website").withValue("data1", strArr12[i29]).build());
        }
        for (int i30 = 0; i30 < i13; i30++) {
            arrayList.add(ContentProviderOperation.newInsert(ContactsContract.Data.CONTENT_URI).withValueBackReference("raw_contact_id", 0).withValue("mimetype", "vnd.android.cursor.item/email_v2").withValue("data1", strArr7[i30]).withValue("data2", numArr2[i30]).withValue("data3", strArr6[i30]).build());
        }
        if (str2 != null && !str2.isEmpty() && (x10 = x(str2)) != null) {
            arrayList.add(ContentProviderOperation.newInsert(ContactsContract.Data.CONTENT_URI).withValueBackReference("raw_contact_id", 0).withValue("mimetype", "vnd.android.cursor.item/photo").withValue("data15", R(x10)).build());
        }
        ReadableArray array5 = readableMap.hasKey("postalAddresses") ? readableMap.getArray("postalAddresses") : null;
        if (array5 != null) {
            int i31 = 0;
            while (i31 < array5.size()) {
                ReadableMap map = array5.getMap(i31);
                arrayList.add(ContentProviderOperation.newInsert(ContactsContract.Data.CONTENT_URI).withValueBackReference("raw_contact_id", 0).withValue("mimetype", "vnd.android.cursor.item/postal-address_v2").withValue("data2", Integer.valueOf(K(map.getString(str3)))).withValue("data3", map.getString(str3)).withValue("data4", map.getString("street")).withValue("data7", map.getString("city")).withValue("data8", map.getString("state")).withValue("data9", map.getString("postCode")).withValue("data10", map.getString(AdRevenueScheme.COUNTRY)).build());
                i31++;
                i26 = i26;
            }
        }
        int i32 = i26;
        for (int i33 = 0; i33 < i25; i33++) {
            arrayList.add(ContentProviderOperation.newInsert(ContactsContract.Data.CONTENT_URI).withValueBackReference("raw_contact_id", 0).withValue("mimetype", "vnd.android.cursor.item/im").withValue("data1", strArr15[i33]).withValue("data2", Integer.valueOf(i32)).withValue("data5", -1).withValue("data6", strArr9[i33]).build());
        }
        try {
            ContentResolver contentResolver = w().getContentResolver();
            ContentProviderResult[] applyBatch = contentResolver.applyBatch("com.android.contacts", arrayList);
            if (applyBatch == null || applyBatch.length <= 0) {
                return;
            }
            WritableMap d10 = new C6682a(contentResolver).d(String.valueOf(ContentUris.parseId(applyBatch[0].uri)));
            promise2 = promise;
            try {
                promise2.resolve(d10);
            } catch (Exception e10) {
                e = e10;
                promise2.reject(e.toString());
            }
        } catch (Exception e11) {
            e = e11;
            promise2 = promise;
        }
    }

    public void i(Promise promise) {
        promise.resolve(A());
    }

    public void j(ReadableMap readableMap, Promise promise) {
        String string = readableMap.hasKey("recordID") ? readableMap.getString("recordID") : null;
        try {
            if (w().getContentResolver().delete(Uri.withAppendedPath(ContactsContract.Contacts.CONTENT_URI, string), null, null) > 0) {
                promise.resolve(string);
            } else {
                promise.resolve(null);
            }
        } catch (Exception e10) {
            promise.reject(e10.toString());
        }
    }

    public void k(ReadableMap readableMap, Promise promise) {
        int i10;
        Integer[] numArr;
        String[] strArr = null;
        try {
            Uri withAppendedPath = Uri.withAppendedPath(ContactsContract.Contacts.CONTENT_URI, readableMap.hasKey("recordID") ? readableMap.getString("recordID") : null);
            ReadableArray array = readableMap.hasKey("phoneNumbers") ? readableMap.getArray("phoneNumbers") : null;
            if (array != null) {
                i10 = array.size();
                strArr = new String[i10];
                numArr = new Integer[i10];
                for (int i11 = 0; i11 < i10; i11++) {
                    strArr[i11] = array.getMap(i11).getString("number");
                    numArr[i11] = Integer.valueOf(J(array.getMap(i11).getString(AnnotatedPrivateKey.LABEL)));
                }
            } else {
                i10 = 0;
                numArr = null;
            }
            ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
            for (int i12 = 0; i12 < i10; i12++) {
                ContentValues contentValues = new ContentValues();
                contentValues.put("mimetype", "vnd.android.cursor.item/phone_v2");
                contentValues.put("data2", numArr[i12]);
                contentValues.put("data1", strArr[i12]);
                arrayList.add(contentValues);
            }
            Intent intent = new Intent("android.intent.action.EDIT");
            intent.setDataAndType(withAppendedPath, "vnd.android.cursor.item/contact");
            intent.putExtra("finishActivityOnSaveCompleted", true);
            intent.putParcelableArrayListExtra(EventKeys.DATA, arrayList);
            f67565c = promise;
            w().startActivityForResult(intent, 52942, Bundle.EMPTY);
        } catch (Exception e10) {
            promise.reject(e10.toString());
        }
    }

    public void l(Promise promise) {
        m(promise);
    }

    public final void m(final Promise promise) {
        u().execute(new Runnable() { // from class: wc.g
            @Override // java.lang.Runnable
            public final void run() {
                h.this.B(promise);
            }
        });
    }

    public void n(Promise promise) {
        m(promise);
    }

    public void o(final String str, final Promise promise) {
        u().execute(new Runnable() { // from class: wc.b
            @Override // java.lang.Runnable
            public final void run() {
                h.this.C(str, promise);
            }
        });
    }

    public void p(final String str, final Promise promise) {
        u().execute(new Runnable() { // from class: wc.a
            @Override // java.lang.Runnable
            public final void run() {
                h.this.D(str, promise);
            }
        });
    }

    public void q(String str, Promise promise) {
        u().execute(new a(str, promise));
    }

    public void r(final String str, final Promise promise) {
        u().execute(new Runnable() { // from class: wc.f
            @Override // java.lang.Runnable
            public final void run() {
                h.this.E(str, promise);
            }
        });
    }

    public void s(final Promise promise) {
        u().execute(new Runnable() { // from class: wc.d
            @Override // java.lang.Runnable
            public final void run() {
                h.this.F(promise);
            }
        });
    }

    public final Activity t() {
        return this.f67567a.getCurrentActivity();
    }

    public Executor u() {
        return this.f67568b;
    }

    public void v(final String str, final Promise promise) {
        u().execute(new Runnable() { // from class: wc.e
            @Override // java.lang.Runnable
            public final void run() {
                h.this.G(str, promise);
            }
        });
    }

    public ReactApplicationContext w() {
        ReactApplicationContext reactApplicationContext = this.f67567a;
        Objects.requireNonNull(reactApplicationContext, "Context not initialized");
        return reactApplicationContext;
    }

    public final Bitmap x(String str) {
        Bitmap decodeFile = BitmapFactory.decodeFile(str);
        if (decodeFile == null) {
            try {
                InputStream open = w().getAssets().open(str);
                decodeFile = BitmapFactory.decodeStream(open);
                open.close();
                return decodeFile;
            } catch (IOException e10) {
                e10.printStackTrace();
            }
        }
        return decodeFile;
    }

    public final String y(ReadableMap readableMap, String str) {
        return readableMap.hasKey(str) ? readableMap.getString(str) : "";
    }

    public final Executor z(boolean z10) {
        return z10 ? Executors.newSingleThreadExecutor() : Executors.newCachedThreadPool();
    }

    public void M(Intent intent) {
    }
}
