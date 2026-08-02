package ru.ozon.android.messenger.blocks.input.attachments.manager;

import android.net.Uri;
import android.webkit.MimeTypeMap;
import java.util.UUID;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import ru.ozon.android.messenger.blocks.input.attachments.presentation.b;

/* loaded from: classes10.dex */
final class c extends AbstractC7737t implements Function1<Uri, ru.ozon.android.messenger.blocks.input.attachments.presentation.b> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ d f85400b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    c(d dVar) {
        super(1);
        this.f85400b = dVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final ru.ozon.android.messenger.blocks.input.attachments.presentation.b invoke(Uri uri) {
        int i11;
        int i12;
        Uri uri2 = uri;
        Intrinsics.checkNotNullParameter(uri2, "uri");
        d dVar = this.f85400b;
        ru.ozon.android.messenger.utils.file.d fileHelper = dVar.f85403c;
        i11 = dVar.f85417q;
        dVar.f85417q = i11 + 1;
        i12 = dVar.f85416p;
        Intrinsics.checkNotNullParameter(uri2, "<this>");
        Intrinsics.checkNotNullParameter(fileHelper, "fileHelper");
        String b11 = fileHelper.b(uri2);
        if (b11 == null) {
            b11 = "";
        }
        String mimeTypeFromExtension = MimeTypeMap.getSingleton().getMimeTypeFromExtension(h.j0('.', b11, ""));
        if (mimeTypeFromExtension == null) {
            mimeTypeFromExtension = "application/octet-stream";
        }
        b.c.C1502b c1502b = b.c.C1502b.f85481a;
        return new b.C1500b(UUID.randomUUID(), null, uri2, mimeTypeFromExtension, c1502b, i11, i12, false, null, null);
    }
}
