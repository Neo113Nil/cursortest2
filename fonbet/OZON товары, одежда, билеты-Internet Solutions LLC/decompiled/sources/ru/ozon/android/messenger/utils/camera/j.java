package ru.ozon.android.messenger.utils.camera;

import android.content.ContentUris;
import android.net.Uri;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ze.C11115c;

/* loaded from: classes10.dex */
final class j extends AbstractC7737t implements Function2<String, Uri, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ e f91854b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    j(e eVar) {
        super(2);
        this.f91854b = eVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(String str, Uri uri) {
        long j11;
        C11115c c11115c;
        Uri mediaStoreUri = uri;
        Intrinsics.checkNotNullParameter(str, "<unused var>");
        Intrinsics.checkNotNullParameter(mediaStoreUri, "mediaStoreUri");
        try {
            j11 = ContentUris.parseId(mediaStoreUri);
        } catch (NumberFormatException | UnsupportedOperationException unused) {
            j11 = -1;
        }
        if (j11 != -1) {
            c11115c = this.f91854b.f91838a;
            c11115c.b(mediaStoreUri);
        }
        return Unit.f71690a;
    }
}
