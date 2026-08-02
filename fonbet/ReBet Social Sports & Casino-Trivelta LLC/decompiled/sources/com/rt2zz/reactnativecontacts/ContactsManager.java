package com.rt2zz.reactnativecontacts;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.facebook.react.bridge.ActivityEventListener;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import wc.h;

/* loaded from: classes4.dex */
public class ContactsManager extends NativeContactsSpec implements ActivityEventListener {
    private final h contactsManagerImpl;

    public ContactsManager(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        this.contactsManagerImpl = new h(reactApplicationContext, true);
        reactApplicationContext.addActivityEventListener(this);
    }

    private Bitmap getThumbnailBitmap(String str) {
        Bitmap decodeFile = BitmapFactory.decodeFile(str);
        if (decodeFile == null) {
            try {
                InputStream open = getReactApplicationContext().getAssets().open(str);
                decodeFile = BitmapFactory.decodeStream(open);
                open.close();
                return decodeFile;
            } catch (IOException e10) {
                e10.printStackTrace();
            }
        }
        return decodeFile;
    }

    @Override // com.rt2zz.reactnativecontacts.NativeContactsSpec
    public void addContact(ReadableMap readableMap, Promise promise) {
        this.contactsManagerImpl.h(readableMap, promise);
    }

    @Override // com.rt2zz.reactnativecontacts.NativeContactsSpec
    public void addContactsToGroup(String str, ReadableArray readableArray, Promise promise) {
        promise.reject("E_NOT_IMPLEMENTED", "addContactsToGroup not implemented yet");
    }

    @Override // com.rt2zz.reactnativecontacts.NativeContactsSpec
    public void addGroup(ReadableMap readableMap, Promise promise) {
        promise.reject("E_NOT_IMPLEMENTED", "addGroup not implemented yet");
    }

    @Override // com.rt2zz.reactnativecontacts.NativeContactsSpec
    public void checkPermission(Promise promise) {
        this.contactsManagerImpl.i(promise);
    }

    @Override // com.rt2zz.reactnativecontacts.NativeContactsSpec
    public void contactsInGroup(String str, Promise promise) {
        promise.reject("E_NOT_IMPLEMENTED", "contactsInGroup not implemented yet");
    }

    @Override // com.rt2zz.reactnativecontacts.NativeContactsSpec
    public void deleteContact(ReadableMap readableMap, Promise promise) {
        this.contactsManagerImpl.j(readableMap, promise);
    }

    @Override // com.rt2zz.reactnativecontacts.NativeContactsSpec
    public void deleteGroup(String str, Promise promise) {
        promise.reject("E_NOT_IMPLEMENTED", "deleteGroup not implemented yet");
    }

    @Override // com.rt2zz.reactnativecontacts.NativeContactsSpec
    public void editExistingContact(ReadableMap readableMap, Promise promise) {
        this.contactsManagerImpl.k(readableMap, promise);
    }

    @Override // com.rt2zz.reactnativecontacts.NativeContactsSpec
    public void getAll(Promise promise) {
        this.contactsManagerImpl.l(promise);
    }

    @Override // com.rt2zz.reactnativecontacts.NativeContactsSpec
    public void getAllWithoutPhotos(Promise promise) {
        this.contactsManagerImpl.n(promise);
    }

    @Override // com.rt2zz.reactnativecontacts.NativeContactsSpec
    public void getContactById(String str, Promise promise) {
        this.contactsManagerImpl.o(str, promise);
    }

    @Override // com.rt2zz.reactnativecontacts.NativeContactsSpec
    public void getContactsByEmailAddress(String str, Promise promise) {
        this.contactsManagerImpl.p(str, promise);
    }

    @Override // com.rt2zz.reactnativecontacts.NativeContactsSpec
    public void getContactsByPhoneNumber(String str, Promise promise) {
        this.contactsManagerImpl.q(str, promise);
    }

    @Override // com.rt2zz.reactnativecontacts.NativeContactsSpec
    public void getContactsMatchingString(String str, Promise promise) {
        this.contactsManagerImpl.r(str, promise);
    }

    @Override // com.rt2zz.reactnativecontacts.NativeContactsSpec
    public void getCount(Promise promise) {
        this.contactsManagerImpl.s(promise);
    }

    @Override // com.rt2zz.reactnativecontacts.NativeContactsSpec
    public void getGroup(String str, Promise promise) {
        promise.reject("E_NOT_IMPLEMENTED", "getGroup not implemented yet");
    }

    @Override // com.rt2zz.reactnativecontacts.NativeContactsSpec
    public void getGroups(Promise promise) {
        promise.reject("E_NOT_IMPLEMENTED", "getGroups not implemented yet");
    }

    @Override // com.rt2zz.reactnativecontacts.NativeContactsSpec, com.facebook.react.bridge.NativeModule
    public String getName() {
        return NativeContactsSpec.NAME;
    }

    @Override // com.rt2zz.reactnativecontacts.NativeContactsSpec
    public void getPhotoForId(String str, Promise promise) {
        this.contactsManagerImpl.v(str, promise);
    }

    @Override // com.rt2zz.reactnativecontacts.NativeContactsSpec
    public void iosEnableNotesUsage(boolean z10) {
    }

    @Override // com.facebook.react.bridge.ActivityEventListener
    public void onActivityResult(Activity activity, int i10, int i11, Intent intent) {
        this.contactsManagerImpl.L(activity, i10, i11, intent);
    }

    @Override // com.facebook.react.bridge.ActivityEventListener
    public void onNewIntent(Intent intent) {
        this.contactsManagerImpl.M(intent);
    }

    @Override // com.rt2zz.reactnativecontacts.NativeContactsSpec
    public void openContactForm(ReadableMap readableMap, Promise promise) {
        this.contactsManagerImpl.N(readableMap, promise);
    }

    @Override // com.rt2zz.reactnativecontacts.NativeContactsSpec
    public void openExistingContact(ReadableMap readableMap, Promise promise) {
        this.contactsManagerImpl.O(readableMap, promise);
    }

    @Override // com.rt2zz.reactnativecontacts.NativeContactsSpec
    public void removeContactsFromGroup(String str, ReadableArray readableArray, Promise promise) {
        promise.reject("E_NOT_IMPLEMENTED", "removeContactsFromGroup not implemented yet");
    }

    @Override // com.rt2zz.reactnativecontacts.NativeContactsSpec
    public void requestPermission(Promise promise) {
        this.contactsManagerImpl.P(promise);
    }

    public byte[] toByteArray(Bitmap bitmap) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        bitmap.compress(Bitmap.CompressFormat.JPEG, 80, byteArrayOutputStream);
        return byteArrayOutputStream.toByteArray();
    }

    @Override // com.rt2zz.reactnativecontacts.NativeContactsSpec
    public void updateContact(ReadableMap readableMap, Promise promise) {
        this.contactsManagerImpl.S(readableMap, promise);
    }

    @Override // com.rt2zz.reactnativecontacts.NativeContactsSpec
    public void updateGroup(String str, ReadableMap readableMap, Promise promise) {
        promise.reject("E_NOT_IMPLEMENTED", "updateGroup not implemented yet");
    }

    @Override // com.rt2zz.reactnativecontacts.NativeContactsSpec
    public void viewExistingContact(ReadableMap readableMap, Promise promise) {
        this.contactsManagerImpl.T(readableMap, promise);
    }

    @Override // com.rt2zz.reactnativecontacts.NativeContactsSpec
    public void writePhotoToPath(String str, String str2, Promise promise) {
        this.contactsManagerImpl.U(str, str2, promise);
    }
}
