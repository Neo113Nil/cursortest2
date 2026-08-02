package com.rt2zz.reactnativecontacts;

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
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Parcelable;
import android.provider.ContactsContract;
import androidx.core.app.ActivityCompat;
import androidx.core.app.NotificationCompat;
import com.facebook.react.bridge.ActivityEventListener;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.google.firebase.messaging.Constants;
import expo.modules.contacts.Columns;
import expo.modules.contacts.next.domain.wrappers.RawContactId;
import java.io.ByteArrayOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Hashtable;

/* loaded from: classes8.dex */
public class ContactsManager extends ReactContextBaseJavaModule implements ActivityEventListener {
    private static final String PERMISSION_AUTHORIZED = "authorized";
    private static final String PERMISSION_DENIED = "denied";
    private static final String PERMISSION_READ_CONTACTS = "android.permission.READ_CONTACTS";
    private static final int PERMISSION_REQUEST_CODE = 888;
    private static final int REQUEST_OPEN_CONTACT_FORM = 52941;
    private static final int REQUEST_OPEN_EXISTING_CONTACT = 52942;
    private static Callback requestCallback;
    private static Callback updateContactCallback;

    @ReactMethod
    public void iosEnableNotesUsage(boolean z) {
    }

    @Override // com.facebook.react.bridge.ActivityEventListener
    public void onNewIntent(Intent intent) {
    }

    public ContactsManager(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        reactApplicationContext.addActivityEventListener(this);
    }

    @ReactMethod
    public void getAll(Callback callback) {
        getAllContacts(callback);
    }

    @ReactMethod
    public void getAllWithoutPhotos(Callback callback) {
        getAllContacts(callback);
    }

    private void getAllContacts(final Callback callback) {
        new AsyncTask<Void, Void, Void>() { // from class: com.rt2zz.reactnativecontacts.ContactsManager.1
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // android.os.AsyncTask
            public Void doInBackground(Void... voidArr) {
                callback.invoke(null, new ContactsProvider(ContactsManager.this.getReactApplicationContext().getContentResolver()).getContacts());
                return null;
            }
        }.executeOnExecutor(AsyncTask.SERIAL_EXECUTOR, new Void[0]);
    }

    @ReactMethod
    public void getCount(final Callback callback) {
        new AsyncTask<Void, Void, Void>() { // from class: com.rt2zz.reactnativecontacts.ContactsManager.2
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // android.os.AsyncTask
            public Void doInBackground(Void... voidArr) {
                callback.invoke(new ContactsProvider(ContactsManager.this.getReactApplicationContext().getContentResolver()).getContactsCount());
                return null;
            }
        }.executeOnExecutor(AsyncTask.SERIAL_EXECUTOR, new Void[0]);
    }

    @ReactMethod
    public void getContactsMatchingString(final String str, final Callback callback) {
        new AsyncTask<Void, Void, Void>() { // from class: com.rt2zz.reactnativecontacts.ContactsManager.3
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // android.os.AsyncTask
            public Void doInBackground(Void... voidArr) {
                callback.invoke(null, new ContactsProvider(ContactsManager.this.getReactApplicationContext().getContentResolver()).getContactsMatchingString(str));
                return null;
            }
        }.executeOnExecutor(AsyncTask.SERIAL_EXECUTOR, new Void[0]);
    }

    @ReactMethod
    public void getContactsByPhoneNumber(final String str, final Callback callback) {
        new AsyncTask<Void, Void, Void>() { // from class: com.rt2zz.reactnativecontacts.ContactsManager.4
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // android.os.AsyncTask
            public Void doInBackground(Void... voidArr) {
                callback.invoke(null, new ContactsProvider(ContactsManager.this.getReactApplicationContext().getContentResolver()).getContactsByPhoneNumber(str));
                return null;
            }
        }.executeOnExecutor(AsyncTask.SERIAL_EXECUTOR, new Void[0]);
    }

    @ReactMethod
    public void getContactsByEmailAddress(final String str, final Callback callback) {
        new AsyncTask<Void, Void, Void>() { // from class: com.rt2zz.reactnativecontacts.ContactsManager.5
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // android.os.AsyncTask
            public Void doInBackground(Void... voidArr) {
                callback.invoke(null, new ContactsProvider(ContactsManager.this.getReactApplicationContext().getContentResolver()).getContactsByEmailAddress(str));
                return null;
            }
        }.executeOnExecutor(AsyncTask.SERIAL_EXECUTOR, new Void[0]);
    }

    @ReactMethod
    public void getPhotoForId(final String str, final Callback callback) {
        new AsyncTask<Void, Void, Void>() { // from class: com.rt2zz.reactnativecontacts.ContactsManager.6
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // android.os.AsyncTask
            public Void doInBackground(Void... voidArr) {
                callback.invoke(null, new ContactsProvider(ContactsManager.this.getReactApplicationContext().getContentResolver()).getPhotoUriFromContactId(str));
                return null;
            }
        }.executeOnExecutor(AsyncTask.SERIAL_EXECUTOR, new Void[0]);
    }

    @ReactMethod
    public void getContactById(final String str, final Callback callback) {
        new AsyncTask<Void, Void, Void>() { // from class: com.rt2zz.reactnativecontacts.ContactsManager.7
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // android.os.AsyncTask
            public Void doInBackground(Void... voidArr) {
                callback.invoke(null, new ContactsProvider(ContactsManager.this.getReactApplicationContext().getContentResolver()).getContactById(str));
                return null;
            }
        }.executeOnExecutor(AsyncTask.SERIAL_EXECUTOR, new Void[0]);
    }

    @ReactMethod
    public void writePhotoToPath(final String str, final String str2, final Callback callback) {
        new AsyncTask<Void, Void, Void>() { // from class: com.rt2zz.reactnativecontacts.ContactsManager.8
            /* JADX INFO: Access modifiers changed from: protected */
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r1v1, types: [long] */
            /* JADX WARN: Type inference failed for: r1v3 */
            /* JADX WARN: Type inference failed for: r1v5, types: [java.io.OutputStream] */
            /* JADX WARN: Type inference failed for: r1v8 */
            /* JADX WARN: Type inference failed for: r1v9 */
            @Override // android.os.AsyncTask
            public Void doInBackground(Void... voidArr) {
                FileOutputStream fileOutputStream;
                ContentResolver contentResolver = ContactsManager.this.getReactApplicationContext().getContentResolver();
                Uri uri = ContactsContract.Contacts.CONTENT_URI;
                ?? parseLong = Long.parseLong(str);
                InputStream openContactPhotoInputStream = ContactsContract.Contacts.openContactPhotoInputStream(contentResolver, ContentUris.withAppendedId(uri, parseLong));
                OutputStream outputStream = null;
                try {
                    try {
                        fileOutputStream = new FileOutputStream(str2);
                        try {
                            BitmapFactory.decodeStream(openContactPhotoInputStream).compress(Bitmap.CompressFormat.PNG, 100, fileOutputStream);
                            callback.invoke(null, true);
                            parseLong = fileOutputStream;
                        } catch (FileNotFoundException e) {
                            e = e;
                            callback.invoke(e.toString());
                            parseLong = fileOutputStream;
                            parseLong.close();
                            openContactPhotoInputStream.close();
                            return null;
                        }
                    } catch (Throwable th) {
                        th = th;
                        outputStream = parseLong;
                        try {
                            outputStream.close();
                        } catch (IOException e2) {
                            e2.printStackTrace();
                        }
                        throw th;
                    }
                } catch (FileNotFoundException e3) {
                    e = e3;
                    fileOutputStream = null;
                } catch (Throwable th2) {
                    th = th2;
                    outputStream.close();
                    throw th;
                }
                try {
                    parseLong.close();
                } catch (IOException e4) {
                    e4.printStackTrace();
                }
                try {
                    openContactPhotoInputStream.close();
                } catch (IOException e5) {
                    e5.printStackTrace();
                }
                return null;
            }
        }.executeOnExecutor(AsyncTask.SERIAL_EXECUTOR, new Void[0]);
    }

    private Bitmap getThumbnailBitmap(String str) {
        Bitmap decodeFile = BitmapFactory.decodeFile(str);
        if (decodeFile == null) {
            try {
                InputStream open = getReactApplicationContext().getAssets().open(str);
                decodeFile = BitmapFactory.decodeStream(open);
                open.close();
                return decodeFile;
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return decodeFile;
    }

    @ReactMethod
    public void openContactForm(ReadableMap readableMap, Callback callback) {
        String str;
        int i;
        String[] strArr;
        Integer[] numArr;
        String[] strArr2;
        int i2;
        String[] strArr3;
        String str2;
        int i3;
        String[] strArr4;
        Integer[] numArr2;
        String[] strArr5;
        int i4;
        String[] strArr6;
        String[] strArr7;
        String[] strArr8;
        String[] strArr9;
        String[] strArr10;
        String[] strArr11;
        int i5;
        String[] strArr12;
        String[] strArr13;
        Bitmap thumbnailBitmap;
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
        if (array != null) {
            i = array.size();
            str = string3;
            String[] strArr14 = new String[i];
            numArr = new Integer[i];
            int i6 = 0;
            while (true) {
                int i7 = i;
                if (i6 >= i) {
                    break;
                }
                strArr14[i6] = array.getMap(i6).getString("number");
                numArr[i6] = Integer.valueOf(mapStringToPhoneType(array.getMap(i6).getString(Constants.ScionAnalytics.PARAM_LABEL)));
                i6++;
                i = i7;
                string11 = string11;
            }
            strArr = strArr14;
        } else {
            str = string3;
            i = 0;
            strArr = null;
            numArr = null;
        }
        String str3 = string11;
        ReadableArray array2 = readableMap.hasKey("urlAddresses") ? readableMap.getArray("urlAddresses") : null;
        if (array2 != null) {
            i2 = array2.size();
            strArr2 = strArr;
            String[] strArr15 = new String[i2];
            int i8 = 0;
            while (true) {
                int i9 = i2;
                if (i8 >= i2) {
                    break;
                }
                int i10 = i8;
                strArr15[i10] = array2.getMap(i8).getString("url");
                i8 = i10 + 1;
                i2 = i9;
            }
            strArr3 = strArr15;
        } else {
            strArr2 = strArr;
            i2 = 0;
            strArr3 = null;
        }
        ReadableArray array3 = readableMap.hasKey("emailAddresses") ? readableMap.getArray("emailAddresses") : null;
        String[] strArr16 = strArr3;
        if (array3 != null) {
            i3 = array3.size();
            str2 = string10;
            String[] strArr17 = new String[i3];
            numArr2 = new Integer[i3];
            int i11 = 0;
            while (true) {
                int i12 = i3;
                if (i11 >= i3) {
                    break;
                }
                strArr17[i11] = array3.getMap(i11).getString("email");
                numArr2[i11] = Integer.valueOf(mapStringToEmailType(array3.getMap(i11).getString(Constants.ScionAnalytics.PARAM_LABEL)));
                i11++;
                i3 = i12;
                i = i;
            }
            strArr4 = strArr17;
        } else {
            str2 = string10;
            i3 = 0;
            strArr4 = null;
            numArr2 = null;
        }
        int i13 = i;
        ReadableArray array4 = readableMap.hasKey("postalAddresses") ? readableMap.getArray("postalAddresses") : null;
        if (array4 != null) {
            i4 = array4.size();
            strArr5 = strArr4;
            strArr7 = new String[i4];
            strArr8 = new String[i4];
            String[] strArr18 = new String[i4];
            strArr9 = new String[i4];
            strArr10 = new String[i4];
            String[] strArr19 = new String[i4];
            strArr11 = new String[i4];
            Integer[] numArr3 = new Integer[i4];
            int i14 = 0;
            while (true) {
                int i15 = i4;
                if (i14 >= i4) {
                    break;
                }
                strArr7[i14] = array4.getMap(i14).getString("street");
                strArr8[i14] = array4.getMap(i14).getString("city");
                strArr18[i14] = array4.getMap(i14).getString("state");
                strArr9[i14] = array4.getMap(i14).getString("region");
                strArr10[i14] = array4.getMap(i14).getString("postCode");
                strArr19[i14] = array4.getMap(i14).getString("country");
                strArr11[i14] = array4.getMap(i14).getString("formattedAddress");
                numArr3[i14] = Integer.valueOf(mapStringToPostalAddressType(array4.getMap(i14).getString(Constants.ScionAnalytics.PARAM_LABEL)));
                i14++;
                i4 = i15;
                i3 = i3;
            }
            strArr6 = strArr19;
        } else {
            strArr5 = strArr4;
            i4 = 0;
            strArr6 = null;
            strArr7 = null;
            strArr8 = null;
            strArr9 = null;
            strArr10 = null;
            strArr11 = null;
        }
        int i16 = i3;
        ReadableArray array5 = readableMap.hasKey("imAddresses") ? readableMap.getArray("imAddresses") : null;
        if (array5 != null) {
            i5 = array5.size();
            strArr12 = new String[i5];
            strArr13 = new String[i5];
            int i17 = 0;
            while (true) {
                int i18 = i5;
                if (i17 >= i5) {
                    break;
                }
                strArr13[i17] = array5.getMap(i17).getString("username");
                strArr12[i17] = array5.getMap(i17).getString(NotificationCompat.CATEGORY_SERVICE);
                i17++;
                i5 = i18;
                strArr6 = strArr6;
            }
        } else {
            i5 = 0;
            strArr12 = null;
            strArr13 = null;
        }
        String[] strArr20 = strArr6;
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
        ContentValues contentValues = new ContentValues();
        String[] strArr21 = strArr12;
        contentValues.put(Columns.MIMETYPE, "vnd.android.cursor.item/identity");
        contentValues.put(Columns.TYPE, string);
        contentValues.put(Columns.LABEL, string4);
        contentValues.put(Columns.DATA_5, string2);
        contentValues.put(Columns.DATA_4, string5);
        contentValues.put(Columns.DATA_6, string6);
        arrayList.add(contentValues);
        ContentValues contentValues2 = new ContentValues();
        contentValues2.put(Columns.MIMETYPE, "vnd.android.cursor.item/organization");
        contentValues2.put(Columns.DATA, string7);
        contentValues2.put(Columns.DATA_4, string8);
        contentValues2.put(Columns.DATA_5, string9);
        arrayList.add(contentValues2);
        for (int i19 = 0; i19 < i2; i19++) {
            ContentValues contentValues3 = new ContentValues();
            contentValues3.put(Columns.MIMETYPE, "vnd.android.cursor.item/website");
            contentValues3.put(Columns.DATA, strArr16[i19]);
            arrayList.add(contentValues3);
        }
        for (int i20 = 0; i20 < i16; i20++) {
            ContentValues contentValues4 = new ContentValues();
            contentValues4.put(Columns.MIMETYPE, "vnd.android.cursor.item/email_v2");
            contentValues4.put(Columns.TYPE, numArr2[i20]);
            contentValues4.put(Columns.DATA, strArr5[i20]);
            arrayList.add(contentValues4);
        }
        for (int i21 = 0; i21 < i13; i21++) {
            ContentValues contentValues5 = new ContentValues();
            contentValues5.put(Columns.MIMETYPE, "vnd.android.cursor.item/phone_v2");
            contentValues5.put(Columns.TYPE, numArr[i21]);
            contentValues5.put(Columns.DATA, strArr2[i21]);
            arrayList.add(contentValues5);
        }
        for (int i22 = 0; i22 < i4; i22++) {
            ContentValues contentValues6 = new ContentValues();
            contentValues6.put(Columns.MIMETYPE, "vnd.android.cursor.item/postal-address_v2");
            contentValues6.put(Columns.DATA_4, strArr7[i22]);
            contentValues6.put(Columns.DATA_7, strArr8[i22]);
            contentValues6.put(Columns.DATA_8, strArr9[i22]);
            contentValues6.put(Columns.DATA_10, strArr20[i22]);
            contentValues6.put(Columns.DATA_9, strArr10[i22]);
            contentValues6.put(Columns.DATA, strArr11[i22]);
            arrayList.add(contentValues6);
        }
        for (int i23 = 0; i23 < i5; i23++) {
            ContentValues contentValues7 = new ContentValues();
            contentValues7.put(Columns.MIMETYPE, "vnd.android.cursor.item/im");
            contentValues7.put(Columns.DATA, strArr13[i23]);
            contentValues7.put(Columns.TYPE, (Integer) 1);
            contentValues7.put(Columns.DATA_5, (Integer) (-1));
            contentValues7.put(Columns.DATA_6, strArr21[i23]);
            arrayList.add(contentValues7);
        }
        if (str2 != null) {
            ContentValues contentValues8 = new ContentValues();
            contentValues8.put(Columns.MIMETYPE, "vnd.android.cursor.item/note");
            contentValues8.put(Columns.DATA, str2);
            arrayList.add(contentValues8);
        }
        if (str3 != null && !str3.isEmpty() && (thumbnailBitmap = getThumbnailBitmap(str3)) != null) {
            ContentValues contentValues9 = new ContentValues();
            contentValues9.put(RawContactId.COLUMN_IN_DATA_TABLE, (Integer) 0);
            contentValues9.put("is_super_primary", (Integer) 1);
            contentValues9.put("data15", toByteArray(thumbnailBitmap));
            contentValues9.put(Columns.MIMETYPE, "vnd.android.cursor.item/photo");
            arrayList.add(contentValues9);
        }
        Intent intent = new Intent("android.intent.action.INSERT", ContactsContract.Contacts.CONTENT_URI);
        intent.putExtra("name", str);
        intent.putExtra("finishActivityOnSaveCompleted", true);
        intent.putParcelableArrayListExtra("data", arrayList);
        updateContactCallback = callback;
        getReactApplicationContext().startActivityForResult(intent, REQUEST_OPEN_CONTACT_FORM, Bundle.EMPTY);
    }

    @ReactMethod
    public void openExistingContact(ReadableMap readableMap, Callback callback) {
        try {
            Uri withAppendedPath = Uri.withAppendedPath(ContactsContract.Contacts.CONTENT_URI, readableMap.hasKey("recordID") ? readableMap.getString("recordID") : null);
            Intent intent = new Intent("android.intent.action.EDIT");
            intent.setDataAndType(withAppendedPath, "vnd.android.cursor.item/contact");
            intent.putExtra("finishActivityOnSaveCompleted", true);
            updateContactCallback = callback;
            getReactApplicationContext().startActivityForResult(intent, REQUEST_OPEN_EXISTING_CONTACT, Bundle.EMPTY);
        } catch (Exception e) {
            callback.invoke(e.toString());
        }
    }

    @ReactMethod
    public void editExistingContact(ReadableMap readableMap, Callback callback) {
        int i;
        Integer[] numArr;
        String[] strArr = null;
        try {
            Uri withAppendedPath = Uri.withAppendedPath(ContactsContract.Contacts.CONTENT_URI, readableMap.hasKey("recordID") ? readableMap.getString("recordID") : null);
            ReadableArray array = readableMap.hasKey("phoneNumbers") ? readableMap.getArray("phoneNumbers") : null;
            if (array != null) {
                i = array.size();
                strArr = new String[i];
                numArr = new Integer[i];
                for (int i2 = 0; i2 < i; i2++) {
                    strArr[i2] = array.getMap(i2).getString("number");
                    numArr[i2] = Integer.valueOf(mapStringToPhoneType(array.getMap(i2).getString(Constants.ScionAnalytics.PARAM_LABEL)));
                }
            } else {
                i = 0;
                numArr = null;
            }
            ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
            for (int i3 = 0; i3 < i; i3++) {
                ContentValues contentValues = new ContentValues();
                contentValues.put(Columns.MIMETYPE, "vnd.android.cursor.item/phone_v2");
                contentValues.put(Columns.TYPE, numArr[i3]);
                contentValues.put(Columns.DATA, strArr[i3]);
                arrayList.add(contentValues);
            }
            Intent intent = new Intent("android.intent.action.EDIT");
            intent.setDataAndType(withAppendedPath, "vnd.android.cursor.item/contact");
            intent.putExtra("finishActivityOnSaveCompleted", true);
            intent.putParcelableArrayListExtra("data", arrayList);
            updateContactCallback = callback;
            getReactApplicationContext().startActivityForResult(intent, REQUEST_OPEN_EXISTING_CONTACT, Bundle.EMPTY);
        } catch (Exception e) {
            callback.invoke(e.toString());
        }
    }

    @ReactMethod
    public void addContact(ReadableMap readableMap, Callback callback) {
        String[] strArr;
        int i;
        Integer[] numArr;
        String[] strArr2;
        String[] strArr3;
        String[] strArr4;
        int i2;
        int i3;
        int i4;
        String[] strArr5;
        Integer[] numArr2;
        String[] strArr6;
        String[] strArr7;
        String[] strArr8;
        int i5;
        String[] strArr9;
        Callback callback2;
        Bitmap thumbnailBitmap;
        int i6;
        if (readableMap == null) {
            callback.invoke("New contact cannot be null.");
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
        String str = Constants.ScionAnalytics.PARAM_LABEL;
        if (array != null) {
            i = array.size();
            String[] strArr10 = new String[i];
            numArr = new Integer[i];
            strArr2 = new String[i];
            int i7 = 0;
            while (true) {
                int i8 = i;
                if (i7 >= i) {
                    break;
                }
                strArr10[i7] = array.getMap(i7).getString("number");
                String string11 = array.getMap(i7).getString(Constants.ScionAnalytics.PARAM_LABEL);
                numArr[i7] = Integer.valueOf(mapStringToPhoneType(string11));
                strArr2[i7] = string11;
                i7++;
                i = i8;
                string10 = string10;
            }
            strArr = strArr10;
        } else {
            strArr = null;
            i = 0;
            numArr = null;
            strArr2 = null;
        }
        String str2 = string10;
        ReadableArray array2 = readableMap.hasKey("urlAddresses") ? readableMap.getArray("urlAddresses") : null;
        if (array2 != null) {
            int size = array2.size();
            strArr3 = strArr;
            String[] strArr11 = new String[size];
            int i9 = 0;
            while (true) {
                i6 = size;
                if (i9 >= size) {
                    break;
                }
                int i10 = i9;
                strArr11[i10] = array2.getMap(i9).getString("url");
                i9 = i10 + 1;
                size = i6;
            }
            strArr4 = strArr11;
            i2 = i6;
        } else {
            strArr3 = strArr;
            strArr4 = null;
            i2 = 0;
        }
        ReadableArray array3 = readableMap.hasKey("emailAddresses") ? readableMap.getArray("emailAddresses") : null;
        String[] strArr12 = strArr4;
        if (array3 != null) {
            i4 = array3.size();
            i3 = i2;
            String[] strArr13 = new String[i4];
            numArr2 = new Integer[i4];
            strArr6 = new String[i4];
            int i11 = 0;
            while (true) {
                int i12 = i4;
                if (i11 >= i4) {
                    break;
                }
                strArr13[i11] = array3.getMap(i11).getString("email");
                String string12 = array3.getMap(i11).getString(Constants.ScionAnalytics.PARAM_LABEL);
                numArr2[i11] = Integer.valueOf(mapStringToEmailType(string12));
                strArr6[i11] = string12;
                i11++;
                i4 = i12;
                i = i;
            }
            strArr5 = strArr13;
        } else {
            i3 = i2;
            i4 = 0;
            strArr5 = null;
            numArr2 = null;
            strArr6 = null;
        }
        int i13 = i;
        ReadableArray array4 = readableMap.hasKey("imAddresses") ? readableMap.getArray("imAddresses") : null;
        if (array4 != null) {
            i5 = array4.size();
            strArr7 = strArr5;
            String[] strArr14 = new String[i5];
            strArr9 = new String[i5];
            int i14 = 0;
            while (true) {
                int i15 = i5;
                if (i14 >= i5) {
                    break;
                }
                strArr14[i14] = array4.getMap(i14).getString("username");
                strArr9[i14] = array4.getMap(i14).getString(NotificationCompat.CATEGORY_SERVICE);
                i14++;
                i5 = i15;
                str = str;
            }
            strArr8 = strArr14;
        } else {
            strArr7 = strArr5;
            strArr8 = null;
            i5 = 0;
            strArr9 = null;
        }
        String str3 = str;
        ArrayList<ContentProviderOperation> arrayList = new ArrayList<>();
        String[] strArr15 = strArr8;
        int i16 = i5;
        arrayList.add(ContentProviderOperation.newInsert(ContactsContract.RawContacts.CONTENT_URI).withValue("account_type", null).withValue("account_name", null).build());
        arrayList.add(ContentProviderOperation.newInsert(ContactsContract.Data.CONTENT_URI).withValueBackReference(RawContactId.COLUMN_IN_DATA_TABLE, 0).withValue(Columns.MIMETYPE, "vnd.android.cursor.item/name").withValue(Columns.TYPE, string).withValue(Columns.DATA_5, string2).withValue(Columns.LABEL, string3).withValue(Columns.DATA_4, string4).withValue(Columns.DATA_6, string5).build());
        arrayList.add(ContentProviderOperation.newInsert(ContactsContract.Data.CONTENT_URI).withValueBackReference(RawContactId.COLUMN_IN_DATA_TABLE, 0).withValue(Columns.MIMETYPE, "vnd.android.cursor.item/note").withValue(Columns.DATA, string9).build());
        ContentProviderOperation.Builder withValue = ContentProviderOperation.newInsert(ContactsContract.Data.CONTENT_URI).withValueBackReference(RawContactId.COLUMN_IN_DATA_TABLE, 0).withValue(Columns.MIMETYPE, "vnd.android.cursor.item/organization").withValue(Columns.DATA, string6).withValue(Columns.DATA_4, string7).withValue(Columns.DATA_5, string8);
        arrayList.add(withValue.build());
        int i17 = 1;
        withValue.withYieldAllowed(true);
        for (int i18 = 0; i18 < i13; i18++) {
            arrayList.add(ContentProviderOperation.newInsert(ContactsContract.Data.CONTENT_URI).withValueBackReference(RawContactId.COLUMN_IN_DATA_TABLE, 0).withValue(Columns.MIMETYPE, "vnd.android.cursor.item/phone_v2").withValue(Columns.DATA, strArr3[i18]).withValue(Columns.TYPE, numArr[i18]).withValue(Columns.LABEL, strArr2[i18]).build());
        }
        int i19 = i3;
        for (int i20 = 0; i20 < i19; i20++) {
            arrayList.add(ContentProviderOperation.newInsert(ContactsContract.Data.CONTENT_URI).withValueBackReference(RawContactId.COLUMN_IN_DATA_TABLE, 0).withValue(Columns.MIMETYPE, "vnd.android.cursor.item/website").withValue(Columns.DATA, strArr12[i20]).build());
        }
        for (int i21 = 0; i21 < i4; i21++) {
            arrayList.add(ContentProviderOperation.newInsert(ContactsContract.Data.CONTENT_URI).withValueBackReference(RawContactId.COLUMN_IN_DATA_TABLE, 0).withValue(Columns.MIMETYPE, "vnd.android.cursor.item/email_v2").withValue(Columns.DATA, strArr7[i21]).withValue(Columns.TYPE, numArr2[i21]).withValue(Columns.LABEL, strArr6[i21]).build());
        }
        if (str2 != null && !str2.isEmpty() && (thumbnailBitmap = getThumbnailBitmap(str2)) != null) {
            arrayList.add(ContentProviderOperation.newInsert(ContactsContract.Data.CONTENT_URI).withValueBackReference(RawContactId.COLUMN_IN_DATA_TABLE, 0).withValue(Columns.MIMETYPE, "vnd.android.cursor.item/photo").withValue("data15", toByteArray(thumbnailBitmap)).build());
        }
        ReadableArray array5 = readableMap.hasKey("postalAddresses") ? readableMap.getArray("postalAddresses") : null;
        if (array5 != null) {
            int i22 = 0;
            while (i22 < array5.size()) {
                ReadableMap map = array5.getMap(i22);
                arrayList.add(ContentProviderOperation.newInsert(ContactsContract.Data.CONTENT_URI).withValueBackReference(RawContactId.COLUMN_IN_DATA_TABLE, 0).withValue(Columns.MIMETYPE, "vnd.android.cursor.item/postal-address_v2").withValue(Columns.TYPE, Integer.valueOf(mapStringToPostalAddressType(map.getString(str3)))).withValue(Columns.LABEL, map.getString(str3)).withValue(Columns.DATA_4, map.getString("street")).withValue(Columns.DATA_7, map.getString("city")).withValue(Columns.DATA_8, map.getString("state")).withValue(Columns.DATA_9, map.getString("postCode")).withValue(Columns.DATA_10, map.getString("country")).build());
                i22++;
                i17 = i17;
            }
        }
        int i23 = i17;
        for (int i24 = 0; i24 < i16; i24++) {
            arrayList.add(ContentProviderOperation.newInsert(ContactsContract.Data.CONTENT_URI).withValueBackReference(RawContactId.COLUMN_IN_DATA_TABLE, 0).withValue(Columns.MIMETYPE, "vnd.android.cursor.item/im").withValue(Columns.DATA, strArr15[i24]).withValue(Columns.TYPE, Integer.valueOf(i23)).withValue(Columns.DATA_5, -1).withValue(Columns.DATA_6, strArr9[i24]).build());
        }
        try {
            ContentResolver contentResolver = getReactApplicationContext().getContentResolver();
            ContentProviderResult[] applyBatch = contentResolver.applyBatch("com.android.contacts", arrayList);
            if (applyBatch == null || applyBatch.length <= 0) {
                return;
            }
            Object[] objArr = {null, new ContactsProvider(contentResolver).getContactByRawId(String.valueOf(ContentUris.parseId(applyBatch[0].uri)))};
            callback2 = callback;
            try {
                callback2.invoke(objArr);
            } catch (Exception e) {
                e = e;
                callback2.invoke(e.toString());
            }
        } catch (Exception e2) {
            e = e2;
            callback2 = callback;
        }
    }

    public byte[] toByteArray(Bitmap bitmap) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        bitmap.compress(Bitmap.CompressFormat.JPEG, 80, byteArrayOutputStream);
        return byteArrayOutputStream.toByteArray();
    }

    @ReactMethod
    public void updateContact(ReadableMap readableMap, Callback callback) {
        String str;
        int i;
        String[] strArr;
        Integer[] numArr;
        String[] strArr2;
        String str2;
        String[] strArr3;
        String[] strArr4;
        int i2;
        String[] strArr5;
        int i3;
        int i4;
        String[] strArr6;
        Integer[] numArr2;
        String[] strArr7;
        int i5;
        String[] strArr8;
        String[] strArr9;
        int i6;
        String[] strArr10;
        String[] strArr11;
        String[] strArr12;
        String[] strArr13;
        Integer[] numArr3;
        String[] strArr14;
        int i7;
        String[] strArr15;
        String[] strArr16;
        int i8;
        Callback callback2;
        Bitmap thumbnailBitmap;
        int i9;
        ContentProviderOperation.Builder withValue;
        String string = readableMap.hasKey("recordID") ? readableMap.getString("recordID") : null;
        String string2 = readableMap.hasKey("rawContactId") ? readableMap.getString("rawContactId") : null;
        if (string2 == null || string == null) {
            callback.invoke("Invalid recordId or rawContactId");
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
        String str3 = string2;
        String str4 = Constants.ScionAnalytics.PARAM_LABEL;
        String str5 = string;
        if (array != null) {
            i = array.size();
            str = string12;
            String[] strArr17 = new String[i];
            numArr = new Integer[i];
            strArr2 = new String[i];
            String[] strArr18 = new String[i];
            int i10 = 0;
            while (true) {
                int i11 = i;
                if (i10 >= i) {
                    break;
                }
                ReadableMap map = array.getMap(i10);
                ReadableArray readableArray = array;
                String string13 = map.getString("number");
                String string14 = map.getString(Constants.ScionAnalytics.PARAM_LABEL);
                String string15 = map.hasKey("id") ? map.getString("id") : null;
                strArr17[i10] = string13;
                numArr[i10] = Integer.valueOf(mapStringToPhoneType(string14));
                strArr2[i10] = string14;
                strArr18[i10] = string15;
                i10++;
                i = i11;
                array = readableArray;
            }
            strArr = strArr17;
        } else {
            str = string12;
            i = 0;
            strArr = null;
            numArr = null;
            strArr2 = null;
        }
        ReadableArray readableArray2 = array;
        ReadableArray array2 = readableMap.hasKey("urlAddresses") ? readableMap.getArray("urlAddresses") : null;
        if (array2 != null) {
            strArr3 = strArr;
            i2 = array2.size();
            str2 = string11;
            String[] strArr19 = new String[i2];
            strArr5 = new String[i2];
            int i12 = 0;
            while (true) {
                int i13 = i2;
                if (i12 >= i2) {
                    break;
                }
                ReadableMap map2 = array2.getMap(i12);
                ReadableArray readableArray3 = array2;
                strArr19[i12] = map2.getString("url");
                strArr5[i12] = map2.hasKey("id") ? map2.getString("id") : null;
                i12++;
                i2 = i13;
                array2 = readableArray3;
            }
            strArr4 = strArr19;
        } else {
            str2 = string11;
            strArr3 = strArr;
            strArr4 = null;
            i2 = 0;
            strArr5 = null;
        }
        ReadableArray array3 = readableMap.hasKey("emailAddresses") ? readableMap.getArray("emailAddresses") : null;
        String[] strArr20 = strArr4;
        if (array3 != null) {
            i4 = array3.size();
            i3 = i2;
            String[] strArr21 = new String[i4];
            String[] strArr22 = new String[i4];
            numArr2 = new Integer[i4];
            strArr7 = new String[i4];
            int i14 = 0;
            while (true) {
                int i15 = i4;
                if (i14 >= i4) {
                    break;
                }
                ReadableMap map3 = array3.getMap(i14);
                ReadableArray readableArray4 = array3;
                strArr21[i14] = map3.getString("email");
                String string16 = map3.getString(Constants.ScionAnalytics.PARAM_LABEL);
                numArr2[i14] = Integer.valueOf(mapStringToEmailType(string16));
                strArr7[i14] = string16;
                strArr22[i14] = map3.hasKey("id") ? map3.getString("id") : null;
                i14++;
                i4 = i15;
                array3 = readableArray4;
            }
            strArr6 = strArr21;
        } else {
            i3 = i2;
            i4 = 0;
            strArr6 = null;
            numArr2 = null;
            strArr7 = null;
        }
        ReadableArray readableArray5 = array3;
        ReadableArray array4 = readableMap.hasKey("postalAddresses") ? readableMap.getArray("postalAddresses") : null;
        if (array4 != null) {
            strArr8 = strArr6;
            i6 = array4.size();
            i5 = i4;
            String[] strArr23 = new String[i6];
            strArr10 = new String[i6];
            strArr11 = new String[i6];
            String[] strArr24 = new String[i6];
            strArr12 = new String[i6];
            strArr13 = new String[i6];
            numArr3 = new Integer[i6];
            strArr14 = new String[i6];
            int i16 = 0;
            while (true) {
                int i17 = i6;
                if (i16 >= i6) {
                    break;
                }
                String valueFromKey = getValueFromKey(array4.getMap(i16), str4);
                strArr23[i16] = getValueFromKey(array4.getMap(i16), "street");
                strArr10[i16] = getValueFromKey(array4.getMap(i16), "city");
                strArr11[i16] = getValueFromKey(array4.getMap(i16), "state");
                strArr24[i16] = getValueFromKey(array4.getMap(i16), "region");
                strArr12[i16] = getValueFromKey(array4.getMap(i16), "postCode");
                strArr13[i16] = getValueFromKey(array4.getMap(i16), "country");
                numArr3[i16] = Integer.valueOf(mapStringToPostalAddressType(valueFromKey));
                strArr14[i16] = valueFromKey;
                i16++;
                i6 = i17;
                str4 = str4;
                i = i;
            }
            strArr9 = strArr23;
        } else {
            i5 = i4;
            strArr8 = strArr6;
            strArr9 = null;
            i6 = 0;
            strArr10 = null;
            strArr11 = null;
            strArr12 = null;
            strArr13 = null;
            numArr3 = null;
            strArr14 = null;
        }
        int i18 = i;
        ReadableArray array5 = readableMap.hasKey("imAddresses") ? readableMap.getArray("imAddresses") : null;
        if (array5 != null) {
            i7 = array5.size();
            String[] strArr25 = new String[i7];
            strArr16 = new String[i7];
            String[] strArr26 = new String[i7];
            int i19 = 0;
            while (true) {
                int i20 = i7;
                if (i19 >= i7) {
                    break;
                }
                ReadableMap map4 = array5.getMap(i19);
                ReadableArray readableArray6 = array5;
                strArr25[i19] = map4.getString("username");
                strArr16[i19] = map4.getString(NotificationCompat.CATEGORY_SERVICE);
                strArr26[i19] = map4.hasKey("id") ? map4.getString("id") : null;
                i19++;
                i7 = i20;
                array5 = readableArray6;
            }
            strArr15 = strArr25;
        } else {
            i7 = 0;
            strArr15 = null;
            strArr16 = null;
        }
        ReadableArray readableArray7 = array5;
        ArrayList<ContentProviderOperation> arrayList = new ArrayList<>();
        String[] strArr27 = strArr15;
        ReadableArray readableArray8 = array4;
        arrayList.add(ContentProviderOperation.newUpdate(ContactsContract.Data.CONTENT_URI).withSelection("contact_id=?", new String[]{String.valueOf(str5)}).withValue(Columns.MIMETYPE, "vnd.android.cursor.item/name").withValue(Columns.TYPE, string3).withValue(Columns.DATA_5, string4).withValue(Columns.LABEL, string5).withValue(Columns.DATA_4, string6).withValue(Columns.DATA_6, string7).build());
        ContentProviderOperation.Builder withValue2 = ContentProviderOperation.newUpdate(ContactsContract.Data.CONTENT_URI).withSelection("contact_id=? AND mimetype = ?", new String[]{String.valueOf(str5), "vnd.android.cursor.item/organization"}).withValue(Columns.DATA, string8).withValue(Columns.DATA_4, string9).withValue(Columns.DATA_5, string10);
        arrayList.add(withValue2.build());
        withValue2.withYieldAllowed(true);
        if (readableArray2 != null) {
            i8 = 1;
            arrayList.add(ContentProviderOperation.newDelete(ContactsContract.Data.CONTENT_URI).withSelection("mimetype=? AND raw_contact_id = ?", new String[]{"vnd.android.cursor.item/phone_v2", String.valueOf(str3)}).build());
            int i21 = 0;
            while (i21 < i18) {
                int i22 = i21;
                arrayList.add(ContentProviderOperation.newInsert(ContactsContract.Data.CONTENT_URI).withValue(RawContactId.COLUMN_IN_DATA_TABLE, String.valueOf(str3)).withValue(Columns.MIMETYPE, "vnd.android.cursor.item/phone_v2").withValue(Columns.DATA, strArr3[i22]).withValue(Columns.TYPE, numArr[i22]).withValue(Columns.LABEL, strArr2[i22]).build());
                i21 = i22 + 1;
            }
        } else {
            i8 = 1;
        }
        int i23 = 0;
        while (true) {
            int i24 = i3;
            if (i23 >= i24) {
                break;
            }
            if (strArr5[i23] == null) {
                i9 = i23;
                withValue = ContentProviderOperation.newInsert(ContactsContract.Data.CONTENT_URI).withValue(RawContactId.COLUMN_IN_DATA_TABLE, String.valueOf(str3)).withValue(Columns.MIMETYPE, "vnd.android.cursor.item/website").withValue(Columns.DATA, strArr20[i9]);
                i3 = i24;
            } else {
                i9 = i23;
                i3 = i24;
                withValue = ContentProviderOperation.newUpdate(ContactsContract.Data.CONTENT_URI).withSelection("_id=?", new String[]{String.valueOf(strArr5[i9])}).withValue(Columns.DATA, strArr20[i9]);
            }
            arrayList.add(withValue.build());
            i23 = i9 + 1;
        }
        if (readableArray5 != null) {
            arrayList.add(ContentProviderOperation.newDelete(ContactsContract.Data.CONTENT_URI).withSelection("mimetype=? AND raw_contact_id = ?", new String[]{"vnd.android.cursor.item/email_v2", String.valueOf(str3)}).build());
            int i25 = i5;
            int i26 = 0;
            while (i26 < i25) {
                int i27 = i26;
                arrayList.add(ContentProviderOperation.newInsert(ContactsContract.Data.CONTENT_URI).withValue(RawContactId.COLUMN_IN_DATA_TABLE, String.valueOf(str3)).withValue(Columns.MIMETYPE, "vnd.android.cursor.item/email_v2").withValue(Columns.DATA, strArr8[i27]).withValue(Columns.TYPE, numArr2[i27]).withValue(Columns.LABEL, strArr7[i27]).build());
                i26 = i27 + 1;
            }
        }
        arrayList.add(ContentProviderOperation.newDelete(ContactsContract.Data.CONTENT_URI).withSelection("mimetype=? AND raw_contact_id = ?", new String[]{"vnd.android.cursor.item/note", String.valueOf(str3)}).build());
        if (str2 != null) {
            arrayList.add(ContentProviderOperation.newInsert(ContactsContract.Data.CONTENT_URI).withValue(RawContactId.COLUMN_IN_DATA_TABLE, String.valueOf(str3)).withValue(Columns.MIMETYPE, "vnd.android.cursor.item/note").withValue(Columns.DATA, str2).build());
        }
        if (str != null && !str.isEmpty() && (thumbnailBitmap = getThumbnailBitmap(str)) != null) {
            arrayList.add(ContentProviderOperation.newInsert(ContactsContract.Data.CONTENT_URI).withValueBackReference(RawContactId.COLUMN_IN_DATA_TABLE, 0).withValue(Columns.MIMETYPE, "vnd.android.cursor.item/photo").withValue("data15", toByteArray(thumbnailBitmap)).build());
        }
        if (readableArray8 != null) {
            arrayList.add(ContentProviderOperation.newDelete(ContactsContract.Data.CONTENT_URI).withSelection("mimetype=? AND raw_contact_id = ?", new String[]{"vnd.android.cursor.item/postal-address_v2", String.valueOf(str3)}).build());
            for (int i28 = 0; i28 < i6; i28++) {
                arrayList.add(ContentProviderOperation.newInsert(ContactsContract.Data.CONTENT_URI).withValue(RawContactId.COLUMN_IN_DATA_TABLE, String.valueOf(str3)).withValue(Columns.MIMETYPE, "vnd.android.cursor.item/postal-address_v2").withValue(Columns.TYPE, numArr3[i28]).withValue(Columns.LABEL, strArr14[i28]).withValue(Columns.DATA_4, strArr9[i28]).withValue(Columns.DATA_7, strArr10[i28]).withValue(Columns.DATA_8, strArr11[i28]).withValue(Columns.DATA_9, strArr12[i28]).withValue(Columns.DATA_10, strArr13[i28]).build());
            }
        }
        if (readableArray7 != null) {
            arrayList.add(ContentProviderOperation.newDelete(ContactsContract.Data.CONTENT_URI).withSelection("mimetype=? AND raw_contact_id = ?", new String[]{"vnd.android.cursor.item/im", String.valueOf(str3)}).build());
            for (int i29 = 0; i29 < i7; i29++) {
                arrayList.add(ContentProviderOperation.newInsert(ContactsContract.Data.CONTENT_URI).withValue(RawContactId.COLUMN_IN_DATA_TABLE, String.valueOf(str3)).withValue(Columns.MIMETYPE, "vnd.android.cursor.item/im").withValue(Columns.DATA, strArr27[i29]).withValue(Columns.TYPE, Integer.valueOf(i8)).withValue(Columns.DATA_5, -1).withValue(Columns.DATA_6, strArr16[i29]).build());
            }
        }
        try {
            ContentResolver contentResolver = getReactApplicationContext().getContentResolver();
            ContentProviderResult[] applyBatch = contentResolver.applyBatch("com.android.contacts", arrayList);
            if (applyBatch == null || applyBatch.length <= 0) {
                return;
            }
            callback2 = callback;
            try {
                callback2.invoke(null, new ContactsProvider(contentResolver).getContactById(str5));
            } catch (Exception e) {
                e = e;
                callback2.invoke(e.toString());
            }
        } catch (Exception e2) {
            e = e2;
            callback2 = callback;
        }
    }

    @ReactMethod
    public void deleteContact(ReadableMap readableMap, Callback callback) {
        String string = readableMap.hasKey("recordID") ? readableMap.getString("recordID") : null;
        try {
            if (getReactApplicationContext().getContentResolver().delete(Uri.withAppendedPath(ContactsContract.Contacts.CONTENT_URI, string), null, null) > 0) {
                callback.invoke(null, string);
            } else {
                callback.invoke(null, null);
            }
        } catch (Exception e) {
            callback.invoke(e.toString(), null);
        }
    }

    @ReactMethod
    public void checkPermission(Callback callback) {
        callback.invoke(null, isPermissionGranted());
    }

    @ReactMethod
    public void requestPermission(Callback callback) {
        requestReadContactsPermission(callback);
    }

    private void requestReadContactsPermission(Callback callback) {
        Activity currentActivity = getCurrentActivity();
        if (currentActivity == null) {
            callback.invoke(null, PERMISSION_DENIED);
        } else if (isPermissionGranted().equals(PERMISSION_AUTHORIZED)) {
            callback.invoke(null, PERMISSION_AUTHORIZED);
        } else {
            requestCallback = callback;
            ActivityCompat.requestPermissions(currentActivity, new String[]{PERMISSION_READ_CONTACTS}, PERMISSION_REQUEST_CODE);
        }
    }

    protected static void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        Callback callback = requestCallback;
        if (callback == null) {
            return;
        }
        if (i != PERMISSION_REQUEST_CODE) {
            callback.invoke(null, PERMISSION_DENIED);
            return;
        }
        Hashtable hashtable = new Hashtable();
        for (int i2 = 0; i2 < strArr.length; i2++) {
            hashtable.put(strArr[i2], Boolean.valueOf(iArr[i2] == 0));
        }
        if (!hashtable.containsKey(PERMISSION_READ_CONTACTS) || !((Boolean) hashtable.get(PERMISSION_READ_CONTACTS)).booleanValue()) {
            requestCallback.invoke(null, PERMISSION_DENIED);
        } else {
            requestCallback.invoke(null, PERMISSION_AUTHORIZED);
        }
        requestCallback = null;
    }

    private String getValueFromKey(ReadableMap readableMap, String str) {
        return readableMap.hasKey(str) ? readableMap.getString(str) : "";
    }

    private String isPermissionGranted() {
        return getReactApplicationContext().checkCallingOrSelfPermission(PERMISSION_READ_CONTACTS) == 0 ? PERMISSION_AUTHORIZED : PERMISSION_DENIED;
    }

    private int mapStringToPhoneType(String str) {
        str.hashCode();
        switch (str) {
            case "mobile":
                return 2;
            case "work_pager":
                return 18;
            case "home fax":
                return 5;
            case "work_mobile":
                return 17;
            case "home":
                return 1;
            case "main":
                return 12;
            case "work":
                return 3;
            case "work fax":
                return 4;
            case "pager":
                return 6;
            default:
                return 0;
        }
    }

    private int mapStringToEmailType(String str) {
        str.hashCode();
        switch (str) {
            case "mobile":
                return 4;
            case "home":
                return 1;
            case "work":
                return 2;
            default:
                return 0;
        }
    }

    private int mapStringToPostalAddressType(String str) {
        str.hashCode();
        if (str.equals("home")) {
            return 1;
        }
        return !str.equals("work") ? 0 : 2;
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "Contacts";
    }

    @Override // com.facebook.react.bridge.ActivityEventListener
    public void onActivityResult(Activity activity, int i, int i2, Intent intent) {
        Callback callback;
        Uri data;
        if ((i == REQUEST_OPEN_CONTACT_FORM || i == REQUEST_OPEN_EXISTING_CONTACT) && (callback = updateContactCallback) != null) {
            if (i2 != -1) {
                callback.invoke(null, null);
                updateContactCallback = null;
                return;
            }
            if (intent == null) {
                callback.invoke("Error received activity result with no data!", null);
                updateContactCallback = null;
                return;
            }
            try {
                data = intent.getData();
            } catch (Exception e) {
                updateContactCallback.invoke(e.getMessage(), null);
            }
            if (data == null) {
                updateContactCallback.invoke("Error wrong data. No content uri found!", null);
                updateContactCallback = null;
            } else {
                updateContactCallback.invoke(null, new ContactsProvider(getReactApplicationContext().getContentResolver()).getContactById(data.getLastPathSegment()));
                updateContactCallback = null;
            }
        }
    }
}
