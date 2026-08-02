package com.facebook.imagepipeline.producers;

import android.content.ContentResolver;
import java.io.InputStream;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class i0 extends L {

    /* renamed from: d, reason: collision with root package name */
    public static final a f30781d = new a(null);

    /* renamed from: c, reason: collision with root package name */
    public final ContentResolver f30782c;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public a() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(Executor executor, G6.i pooledByteBufferFactory, ContentResolver contentResolver) {
        super(executor, pooledByteBufferFactory);
        Intrinsics.checkNotNullParameter(executor, "executor");
        Intrinsics.checkNotNullParameter(pooledByteBufferFactory, "pooledByteBufferFactory");
        Intrinsics.checkNotNullParameter(contentResolver, "contentResolver");
        this.f30782c = contentResolver;
    }

    @Override // com.facebook.imagepipeline.producers.L
    public H7.k d(com.facebook.imagepipeline.request.b imageRequest) {
        Intrinsics.checkNotNullParameter(imageRequest, "imageRequest");
        InputStream openInputStream = this.f30782c.openInputStream(imageRequest.getSourceUri());
        if (openInputStream == null) {
            throw new IllegalStateException("ContentResolver returned null InputStream");
        }
        H7.k e10 = e(openInputStream, -1);
        Intrinsics.checkNotNullExpressionValue(e10, "getEncodedImage(...)");
        return e10;
    }

    @Override // com.facebook.imagepipeline.producers.L
    public String f() {
        return "QualifiedResourceFetchProducer";
    }
}
