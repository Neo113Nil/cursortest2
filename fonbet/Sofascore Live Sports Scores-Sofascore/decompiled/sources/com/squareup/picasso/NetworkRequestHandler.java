package com.squareup.picasso;

import android.net.NetworkInfo;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.RequestHandler;
import defpackage.d2g;
import defpackage.i2g;
import defpackage.je2;
import defpackage.ljg;
import defpackage.pzf;
import defpackage.qzf;
import java.io.IOException;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
class NetworkRequestHandler extends RequestHandler {
    private static final String SCHEME_HTTP = "http";
    private static final String SCHEME_HTTPS = "https";
    private final Downloader downloader;
    private final Stats stats;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static class ContentLengthException extends IOException {
        public ContentLengthException(String str) {
            super(str);
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static final class ResponseException extends IOException {
        final int code;
        final int networkPolicy;

        public ResponseException(int i, int i2) {
            super(ljg.j(i, "HTTP "));
            this.code = i;
            this.networkPolicy = i2;
        }
    }

    public NetworkRequestHandler(Downloader downloader, Stats stats) {
        this.downloader = downloader;
        this.stats = stats;
    }

    private static qzf createRequest(Request request, int i) {
        je2 je2Var = i != 0 ? NetworkPolicy.isOfflineOnly(i) ? je2.o : new je2(!NetworkPolicy.shouldReadFromDiskCache(i), !NetworkPolicy.shouldWriteToDiskCache(i), -1, -1, false, false, false, -1, -1, false, false, false, null) : null;
        pzf pzfVar = new pzf();
        pzfVar.f(request.uri.toString());
        if (je2Var != null) {
            pzfVar.b(je2Var);
        }
        return new qzf(pzfVar);
    }

    @Override // com.squareup.picasso.RequestHandler
    public boolean canHandleRequest(Request request) {
        String scheme = request.uri.getScheme();
        return SCHEME_HTTP.equals(scheme) || "https".equals(scheme);
    }

    @Override // com.squareup.picasso.RequestHandler
    public int getRetryCount() {
        return 2;
    }

    @Override // com.squareup.picasso.RequestHandler
    public RequestHandler.Result load(Request request, int i) throws IOException {
        d2g load = this.downloader.load(createRequest(request, i));
        i2g i2gVar = load.g;
        if (!load.q) {
            i2gVar.close();
            throw new ResponseException(load.d, request.networkPolicy);
        }
        Picasso.LoadedFrom loadedFrom = load.j == null ? Picasso.LoadedFrom.NETWORK : Picasso.LoadedFrom.DISK;
        if (loadedFrom == Picasso.LoadedFrom.DISK && i2gVar.contentLength() == 0) {
            i2gVar.close();
            throw new ContentLengthException("Received response with 0 content-length header.");
        }
        if (loadedFrom == Picasso.LoadedFrom.NETWORK && i2gVar.contentLength() > 0) {
            this.stats.dispatchDownloadFinished(i2gVar.contentLength());
        }
        return new RequestHandler.Result(i2gVar.source(), loadedFrom);
    }

    @Override // com.squareup.picasso.RequestHandler
    public boolean shouldRetry(boolean z, NetworkInfo networkInfo) {
        return networkInfo == null || networkInfo.isConnected();
    }

    @Override // com.squareup.picasso.RequestHandler
    public boolean supportsReplay() {
        return true;
    }
}
