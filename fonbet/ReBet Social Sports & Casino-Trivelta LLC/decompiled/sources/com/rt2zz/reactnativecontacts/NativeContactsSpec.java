package com.rt2zz.reactnativecontacts;

import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;
import h8.InterfaceC4488a;

/* loaded from: classes4.dex */
public abstract class NativeContactsSpec extends ReactContextBaseJavaModule implements TurboModule {
    public static final String NAME = "RCTContacts";

    public NativeContactsSpec(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    @ReactMethod
    @InterfaceC4488a
    public abstract void addContact(ReadableMap readableMap, Promise promise);

    @ReactMethod
    @InterfaceC4488a
    public void addContactsToGroup(String str, ReadableArray readableArray, Promise promise) {
    }

    @ReactMethod
    @InterfaceC4488a
    public void addGroup(ReadableMap readableMap, Promise promise) {
    }

    @ReactMethod
    @InterfaceC4488a
    public abstract void checkPermission(Promise promise);

    @ReactMethod
    @InterfaceC4488a
    public void contactsInGroup(String str, Promise promise) {
    }

    @ReactMethod
    @InterfaceC4488a
    public abstract void deleteContact(ReadableMap readableMap, Promise promise);

    @ReactMethod
    @InterfaceC4488a
    public void deleteGroup(String str, Promise promise) {
    }

    @ReactMethod
    @InterfaceC4488a
    public abstract void editExistingContact(ReadableMap readableMap, Promise promise);

    @ReactMethod
    @InterfaceC4488a
    public abstract void getAll(Promise promise);

    @ReactMethod
    @InterfaceC4488a
    public abstract void getAllWithoutPhotos(Promise promise);

    @ReactMethod
    @InterfaceC4488a
    public abstract void getContactById(String str, Promise promise);

    @ReactMethod
    @InterfaceC4488a
    public abstract void getContactsByEmailAddress(String str, Promise promise);

    @ReactMethod
    @InterfaceC4488a
    public abstract void getContactsByPhoneNumber(String str, Promise promise);

    @ReactMethod
    @InterfaceC4488a
    public abstract void getContactsMatchingString(String str, Promise promise);

    @ReactMethod
    @InterfaceC4488a
    public abstract void getCount(Promise promise);

    @ReactMethod
    @InterfaceC4488a
    public void getGroup(String str, Promise promise) {
    }

    @ReactMethod
    @InterfaceC4488a
    public void getGroups(Promise promise) {
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return NAME;
    }

    @ReactMethod
    @InterfaceC4488a
    public abstract void getPhotoForId(String str, Promise promise);

    @ReactMethod
    @InterfaceC4488a
    public abstract void iosEnableNotesUsage(boolean z10);

    @ReactMethod
    @InterfaceC4488a
    public abstract void openContactForm(ReadableMap readableMap, Promise promise);

    @ReactMethod
    @InterfaceC4488a
    public abstract void openExistingContact(ReadableMap readableMap, Promise promise);

    @ReactMethod
    @InterfaceC4488a
    public void removeContactsFromGroup(String str, ReadableArray readableArray, Promise promise) {
    }

    @ReactMethod
    @InterfaceC4488a
    public abstract void requestPermission(Promise promise);

    @ReactMethod
    @InterfaceC4488a
    public abstract void updateContact(ReadableMap readableMap, Promise promise);

    @ReactMethod
    @InterfaceC4488a
    public void updateGroup(String str, ReadableMap readableMap, Promise promise) {
    }

    @ReactMethod
    @InterfaceC4488a
    public abstract void viewExistingContact(ReadableMap readableMap, Promise promise);

    @ReactMethod
    @InterfaceC4488a
    public abstract void writePhotoToPath(String str, String str2, Promise promise);
}
