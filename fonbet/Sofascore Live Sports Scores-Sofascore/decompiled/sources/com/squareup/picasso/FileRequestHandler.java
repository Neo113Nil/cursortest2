package com.squareup.picasso;

import android.content.Context;
import android.net.Uri;
import com.ironsource.U3;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.RequestHandler;
import defpackage.ef6;
import defpackage.f6a;
import java.io.IOException;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
class FileRequestHandler extends ContentStreamRequestHandler {
    public FileRequestHandler(Context context) {
        super(context);
    }

    public static int getFileExifRotation(Uri uri) throws IOException {
        return new ef6(uri.getPath()).c();
    }

    @Override // com.squareup.picasso.ContentStreamRequestHandler, com.squareup.picasso.RequestHandler
    public boolean canHandleRequest(Request request) {
        return U3.i.b.equals(request.uri.getScheme());
    }

    @Override // com.squareup.picasso.ContentStreamRequestHandler, com.squareup.picasso.RequestHandler
    public RequestHandler.Result load(Request request, int i) throws IOException {
        return new RequestHandler.Result(null, f6a.I(getInputStream(request)), Picasso.LoadedFrom.DISK, getFileExifRotation(request.uri));
    }
}
