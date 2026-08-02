package com.facebook.imagepipeline.producers;

import android.content.ContentResolver;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.provider.ContactsContract;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes2.dex */
public final class I extends L {

    /* renamed from: c, reason: collision with root package name */
    public final ContentResolver f30653c;

    /* renamed from: d, reason: collision with root package name */
    public static final a f30652d = new a(null);

    @NotNull
    private static final String[] PROJECTION = {"_id", "_data"};

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public a() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public I(Executor executor, G6.i pooledByteBufferFactory, ContentResolver contentResolver) {
        super(executor, pooledByteBufferFactory);
        Intrinsics.checkNotNullParameter(executor, "executor");
        Intrinsics.checkNotNullParameter(pooledByteBufferFactory, "pooledByteBufferFactory");
        Intrinsics.checkNotNullParameter(contentResolver, "contentResolver");
        this.f30653c = contentResolver;
    }

    @Override // com.facebook.imagepipeline.producers.L
    public H7.k d(com.facebook.imagepipeline.request.b imageRequest) {
        H7.k g10;
        InputStream createInputStream;
        Intrinsics.checkNotNullParameter(imageRequest, "imageRequest");
        Uri sourceUri = imageRequest.getSourceUri();
        Intrinsics.checkNotNullExpressionValue(sourceUri, "getSourceUri(...)");
        if (!com.facebook.common.util.f.l(sourceUri)) {
            if (com.facebook.common.util.f.k(sourceUri) && (g10 = g(sourceUri)) != null) {
                return g10;
            }
            InputStream openInputStream = this.f30653c.openInputStream(sourceUri);
            if (openInputStream != null) {
                return e(openInputStream, -1);
            }
            throw new IllegalStateException("Required value was null.");
        }
        String uri = sourceUri.toString();
        Intrinsics.checkNotNullExpressionValue(uri, "toString(...)");
        if (StringsKt.endsWith$default(uri, "/photo", false, 2, (Object) null)) {
            createInputStream = this.f30653c.openInputStream(sourceUri);
        } else {
            String uri2 = sourceUri.toString();
            Intrinsics.checkNotNullExpressionValue(uri2, "toString(...)");
            if (StringsKt.endsWith$default(uri2, "/display_photo", false, 2, (Object) null)) {
                try {
                    AssetFileDescriptor openAssetFileDescriptor = this.f30653c.openAssetFileDescriptor(sourceUri, "r");
                    if (openAssetFileDescriptor == null) {
                        throw new IllegalStateException("Required value was null.");
                    }
                    createInputStream = openAssetFileDescriptor.createInputStream();
                } catch (IOException unused) {
                    throw new IOException("Contact photo does not exist: " + sourceUri);
                }
            } else {
                InputStream openContactPhotoInputStream = ContactsContract.Contacts.openContactPhotoInputStream(this.f30653c, sourceUri);
                if (openContactPhotoInputStream == null) {
                    throw new IOException("Contact photo does not exist: " + sourceUri);
                }
                createInputStream = openContactPhotoInputStream;
            }
        }
        if (createInputStream != null) {
            return e(createInputStream, -1);
        }
        throw new IllegalStateException("Required value was null.");
    }

    @Override // com.facebook.imagepipeline.producers.L
    public String f() {
        return "LocalContentUriFetchProducer";
    }

    public final H7.k g(Uri uri) {
        try {
            ParcelFileDescriptor openFileDescriptor = this.f30653c.openFileDescriptor(uri, "r");
            if (openFileDescriptor == null) {
                throw new IllegalStateException("Required value was null.");
            }
            H7.k e10 = e(new FileInputStream(openFileDescriptor.getFileDescriptor()), (int) openFileDescriptor.getStatSize());
            Intrinsics.checkNotNullExpressionValue(e10, "getEncodedImage(...)");
            openFileDescriptor.close();
            return e10;
        } catch (FileNotFoundException unused) {
            return null;
        }
    }
}
