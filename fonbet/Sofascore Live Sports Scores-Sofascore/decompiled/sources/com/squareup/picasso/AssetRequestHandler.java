package com.squareup.picasso;

import android.content.Context;
import android.content.res.AssetManager;
import android.net.Uri;
import com.ironsource.U3;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.RequestHandler;
import defpackage.f6a;
import java.io.IOException;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
class AssetRequestHandler extends RequestHandler {
    protected static final String ANDROID_ASSET = "android_asset";
    private static final int ASSET_PREFIX_LENGTH = 22;
    private AssetManager assetManager;
    private final Context context;
    private final Object lock = new Object();

    public AssetRequestHandler(Context context) {
        this.context = context;
    }

    public static String getFilePath(Request request) {
        return request.uri.toString().substring(ASSET_PREFIX_LENGTH);
    }

    @Override // com.squareup.picasso.RequestHandler
    public boolean canHandleRequest(Request request) {
        Uri uri = request.uri;
        return U3.i.b.equals(uri.getScheme()) && !uri.getPathSegments().isEmpty() && ANDROID_ASSET.equals(uri.getPathSegments().get(0));
    }

    @Override // com.squareup.picasso.RequestHandler
    public RequestHandler.Result load(Request request, int i) throws IOException {
        AssetManager assetManager = this.assetManager;
        if (assetManager == null) {
            synchronized (this.lock) {
                try {
                    assetManager = this.assetManager;
                    if (assetManager == null) {
                        assetManager = this.context.getAssets();
                        this.assetManager = assetManager;
                    }
                } finally {
                }
            }
        }
        return new RequestHandler.Result(f6a.I(assetManager.open(getFilePath(request))), Picasso.LoadedFrom.DISK);
    }
}
