package defpackage;

import android.content.ContentResolver;
import android.content.UriMatcher;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.provider.ContactsContract;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class ngi extends bib {
    public static final UriMatcher e;

    static {
        UriMatcher uriMatcher = new UriMatcher(-1);
        e = uriMatcher;
        uriMatcher.addURI("com.android.contacts", "contacts/lookup/*/#", 1);
        uriMatcher.addURI("com.android.contacts", "contacts/lookup/*", 1);
        uriMatcher.addURI("com.android.contacts", "contacts/#/photo", 2);
        uriMatcher.addURI("com.android.contacts", "contacts/#", 3);
        uriMatcher.addURI("com.android.contacts", "contacts/#/display_photo", 4);
        uriMatcher.addURI("com.android.contacts", "phone_lookup/*", 5);
    }

    @Override // defpackage.xd4
    public final Class c() {
        return InputStream.class;
    }

    @Override // defpackage.bib
    public final void d(Object obj) {
        ((InputStream) obj).close();
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x005e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005f  */
    @Override // defpackage.bib
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object f(ContentResolver contentResolver, Uri uri) {
        InputStream openContactPhotoInputStream;
        int match = e.match(uri);
        if (match != 1) {
            if (match == 3) {
                openContactPhotoInputStream = ContactsContract.Contacts.openContactPhotoInputStream(contentResolver, uri, true);
            } else if (match != 5) {
                if (this.a && aa.g(uri) && aa.f()) {
                    AssetFileDescriptor h = aa.h(contentResolver, uri);
                    if (h == null) {
                        throw new FileNotFoundException(dmi.m(uri, "FileDescriptor is null for: "));
                    }
                    try {
                        openContactPhotoInputStream = h.createInputStream();
                    } catch (IOException e2) {
                        try {
                            h.close();
                        } catch (Exception unused) {
                        }
                        throw ((FileNotFoundException) new FileNotFoundException("Unable to create stream").initCause(e2));
                    }
                } else {
                    openContactPhotoInputStream = contentResolver.openInputStream(uri);
                }
            }
            if (openContactPhotoInputStream == null) {
                return openContactPhotoInputStream;
            }
            throw new FileNotFoundException(dmi.m(uri, "InputStream is null for "));
        }
        Uri lookupContact = ContactsContract.Contacts.lookupContact(contentResolver, uri);
        if (lookupContact == null) {
            throw new FileNotFoundException("Contact cannot be found");
        }
        openContactPhotoInputStream = ContactsContract.Contacts.openContactPhotoInputStream(contentResolver, lookupContact, true);
        if (openContactPhotoInputStream == null) {
        }
    }
}
