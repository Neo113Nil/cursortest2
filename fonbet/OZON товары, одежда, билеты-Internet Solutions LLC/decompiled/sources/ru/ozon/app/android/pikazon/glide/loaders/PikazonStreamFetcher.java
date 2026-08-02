package ru.ozon.app.android.pikazon.glide.loaders;

import Ae.M0;
import T5.a;
import T5.e;
import We.A;
import We.G;
import We.InterfaceC4865g;
import We.InterfaceC4866h;
import We.L;
import We.M;
import android.graphics.BitmapFactory;
import com.bumptech.glide.i;
import com.bumptech.glide.load.data.d;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p6.C8863c;
import ru.ozon.app.android.pikazon.Pikazon;
import ru.ozon.app.android.pikazon.callback.PikazonPerformanceAvailabilityChecker;
import ru.ozon.app.android.pikazon.callback.raw.PikazonRawRequestsListener;
import ru.ozon.app.android.pikazon.callback.raw.RequestData;
import ru.ozon.app.android.pikazon.glide.exception.UntrustedHostException;
import ru.ozon.app.android.pikazon.logging.PikazonLogger;
import ru.ozon.app.android.pikazon.util.CdnChooserUtilsKt;

@Metadata(d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003BK\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e\u0012\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011¢\u0006\u0004\b\u0014\u0010\u0015J'\u0010\u001a\u001a\u00020\u00122\u0006\u0010\u0017\u001a\u00020\u00162\u000e\u0010\u0019\u001a\n\u0012\u0006\b\u0000\u0012\u00020\u00020\u0018H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u001f\u0010 \u001a\u00020\u00122\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0004\b \u0010!J\u001f\u0010$\u001a\u00020\u00122\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010#\u001a\u00020\"H\u0016¢\u0006\u0004\b$\u0010%J\u000f\u0010&\u001a\u00020\u0012H\u0016¢\u0006\u0004\b&\u0010'J\u000f\u0010(\u001a\u00020\u0012H\u0016¢\u0006\u0004\b(\u0010'J\u0015\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00020)H\u0016¢\u0006\u0004\b*\u0010+J\u000f\u0010-\u001a\u00020,H\u0016¢\u0006\u0004\b-\u0010.R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010/R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u00100R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u00101R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u00102R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u00103R\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u00104R\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u00105R\u0018\u0010\u001d\u001a\u0004\u0018\u00010\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u00106R\u0018\u00108\u001a\u0004\u0018\u0001078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b8\u00109R \u0010\u0019\u001a\f\u0012\u0006\b\u0000\u0012\u00020\u0002\u0018\u00010\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010:¨\u0006;"}, d2 = {"Lru/ozon/app/android/pikazon/glide/loaders/PikazonStreamFetcher;", "Lcom/bumptech/glide/load/data/d;", "Ljava/io/InputStream;", "LWe/h;", "Lru/ozon/app/android/pikazon/Pikazon;", "pikazon", "Lru/ozon/app/android/pikazon/glide/loaders/PikazonUrl;", "model", "Lru/ozon/app/android/pikazon/callback/raw/RequestData;", "requestData", "LWe/g$a;", "client", "Lru/ozon/app/android/pikazon/callback/PikazonPerformanceAvailabilityChecker;", "performanceAvailabilityChecker", "", "Lru/ozon/app/android/pikazon/callback/raw/PikazonRawRequestsListener;", "rawRequestsListeners", "Lkotlin/Function0;", "", "onLoadFailed", "<init>", "(Lru/ozon/app/android/pikazon/Pikazon;Lru/ozon/app/android/pikazon/glide/loaders/PikazonUrl;Lru/ozon/app/android/pikazon/callback/raw/RequestData;LWe/g$a;Lru/ozon/app/android/pikazon/callback/PikazonPerformanceAvailabilityChecker;Ljava/util/List;Lkotlin/jvm/functions/Function0;)V", "Lcom/bumptech/glide/i;", "priority", "Lcom/bumptech/glide/load/data/d$a;", "callback", "loadData", "(Lcom/bumptech/glide/i;Lcom/bumptech/glide/load/data/d$a;)V", "LWe/g;", "call", "LWe/L;", "response", "onResponse", "(LWe/g;LWe/L;)V", "Ljava/io/IOException;", "e", "onFailure", "(LWe/g;Ljava/io/IOException;)V", "cancel", "()V", "cleanup", "Ljava/lang/Class;", "getDataClass", "()Ljava/lang/Class;", "LT5/a;", "getDataSource", "()LT5/a;", "Lru/ozon/app/android/pikazon/Pikazon;", "Lru/ozon/app/android/pikazon/glide/loaders/PikazonUrl;", "Lru/ozon/app/android/pikazon/callback/raw/RequestData;", "LWe/g$a;", "Lru/ozon/app/android/pikazon/callback/PikazonPerformanceAvailabilityChecker;", "Ljava/util/List;", "Lkotlin/jvm/functions/Function0;", "LWe/g;", "LWe/M;", "responseBody", "LWe/M;", "Lcom/bumptech/glide/load/data/d$a;", "lib_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class PikazonStreamFetcher implements d<InputStream>, InterfaceC4866h {
    private volatile InterfaceC4865g call;
    private volatile d.a<? super InputStream> callback;

    @NotNull
    private final InterfaceC4865g.a client;

    @NotNull
    private final PikazonUrl model;

    @NotNull
    private final Function0<Unit> onLoadFailed;

    @NotNull
    private final PikazonPerformanceAvailabilityChecker performanceAvailabilityChecker;

    @NotNull
    private final Pikazon pikazon;

    @NotNull
    private final List<PikazonRawRequestsListener> rawRequestsListeners;

    @NotNull
    private final RequestData requestData;
    private volatile M responseBody;

    /* JADX WARN: Multi-variable type inference failed */
    public PikazonStreamFetcher(@NotNull Pikazon pikazon, @NotNull PikazonUrl model, @NotNull RequestData requestData, @NotNull InterfaceC4865g.a client, @NotNull PikazonPerformanceAvailabilityChecker performanceAvailabilityChecker, @NotNull List<? extends PikazonRawRequestsListener> rawRequestsListeners, @NotNull Function0<Unit> onLoadFailed) {
        Intrinsics.checkNotNullParameter(pikazon, "pikazon");
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(requestData, "requestData");
        Intrinsics.checkNotNullParameter(client, "client");
        Intrinsics.checkNotNullParameter(performanceAvailabilityChecker, "performanceAvailabilityChecker");
        Intrinsics.checkNotNullParameter(rawRequestsListeners, "rawRequestsListeners");
        Intrinsics.checkNotNullParameter(onLoadFailed, "onLoadFailed");
        this.pikazon = pikazon;
        this.model = model;
        this.requestData = requestData;
        this.client = client;
        this.performanceAvailabilityChecker = performanceAvailabilityChecker;
        this.rawRequestsListeners = rawRequestsListeners;
        this.onLoadFailed = onLoadFailed;
        Iterator it = rawRequestsListeners.iterator();
        while (it.hasNext()) {
            ((PikazonRawRequestsListener) it.next()).onRequestStarted(this.requestData);
        }
    }

    @Override // com.bumptech.glide.load.data.d
    public void cancel() {
        InterfaceC4865g interfaceC4865g = this.call;
        if (interfaceC4865g != null) {
            interfaceC4865g.cancel();
        }
    }

    @Override // com.bumptech.glide.load.data.d
    public void cleanup() {
        try {
            M m11 = this.responseBody;
            if (m11 != null) {
                m11.close();
            }
        } catch (IOException unused) {
        }
        this.responseBody = null;
        this.callback = null;
    }

    @Override // com.bumptech.glide.load.data.d
    @NotNull
    public Class<InputStream> getDataClass() {
        return InputStream.class;
    }

    @Override // com.bumptech.glide.load.data.d
    @NotNull
    public a getDataSource() {
        return a.REMOTE;
    }

    @Override // com.bumptech.glide.load.data.d
    public void loadData(@NotNull i priority, @NotNull d.a<? super InputStream> callback) {
        Ud0.a value;
        ArrayList c11;
        Intrinsics.checkNotNullParameter(priority, "priority");
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.callback = callback;
        G.a aVar = new G.a();
        aVar.k(this.model.getUrl());
        aVar.i(PikazonUrlUUID.class, new PikazonUrlUUID(this.model.getUuid()));
        InterfaceC4865g a11 = this.client.a(aVar.b());
        M0<Ud0.a> cdnChooserConfigFlow$lib_release = Pikazon.INSTANCE.getInstance().getCdnChooserConfigFlow$lib_release();
        Set<String> imageWhitelist = (cdnChooserConfigFlow$lib_release == null || (value = cdnChooserConfigFlow$lib_release.getValue()) == null || (c11 = value.c()) == null) ? null : CdnChooserUtilsKt.imageWhitelist(c11);
        A.b bVar = A.f33515l;
        String originalUrl = this.requestData.getOriginalUrl();
        bVar.getClass();
        A e11 = A.b.e(originalUrl);
        String h11 = e11 != null ? e11.h() : null;
        if (imageWhitelist == null || h11 == null || CdnChooserUtilsKt.isHostContainsInWhitelist(h11, imageWhitelist)) {
            a11.E0(this);
            this.call = a11;
            return;
        }
        PikazonLogger.INSTANCE.logError("Image download failed! Error: URL not allowed: " + this.requestData.getOriginalUrl(), null);
        onFailure(a11, new UntrustedHostException(Nk.a.b("Untrusted host in original URL: ", this.requestData.getOriginalUrl())));
    }

    @Override // We.InterfaceC4866h
    public void onFailure(@NotNull InterfaceC4865g call, @NotNull IOException e11) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(e11, "e");
        PikazonLogger.INSTANCE.logError("Image download failed! Final URL: " + call.request().j(), e11);
        Iterator<T> it = this.rawRequestsListeners.iterator();
        while (it.hasNext()) {
            ((PikazonRawRequestsListener) it.next()).onRequestFailed(call, e11, this.requestData);
        }
        d.a<? super InputStream> aVar = this.callback;
        if (aVar != null) {
            aVar.onLoadFailed(e11);
        }
        this.onLoadFailed.invoke();
    }

    @Override // We.InterfaceC4866h
    public void onResponse(@NotNull InterfaceC4865g call, @NotNull L response) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(response, "response");
        Iterator<T> it = this.rawRequestsListeners.iterator();
        while (it.hasNext()) {
            ((PikazonRawRequestsListener) it.next()).onResponseReceived(call, response, this.requestData);
        }
        this.responseBody = response.c();
        if (!response.v()) {
            PikazonLogger.INSTANCE.logError("Image download failed! Final URL: " + call.request().j(), null);
            d.a<? super InputStream> aVar = this.callback;
            if (aVar != null) {
                aVar.onLoadFailed(new e(response.w(), response.m()));
                return;
            }
            return;
        }
        G L11 = response.L();
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        try {
            BitmapFactory.decodeStream(response.y(1024L).byteStream(), null, options);
        } catch (StringIndexOutOfBoundsException e11) {
            Lm0.a.f17149a.e(e11, Nk.a.b("StringIndexOutOfBoundsException on url ", this.model.getUrl()), new Object[0]);
        }
        if (this.performanceAvailabilityChecker.isPerformanceAnalyticsEnabled()) {
            PikazonStreamFetcher$onResponse$action$1 pikazonStreamFetcher$onResponse$action$1 = new PikazonStreamFetcher$onResponse$action$1(L11, options);
            Iterator<T> it2 = this.pikazon.getPerformanceListeners$lib_release().iterator();
            while (it2.hasNext()) {
                pikazonStreamFetcher$onResponse$action$1.invoke((PikazonStreamFetcher$onResponse$action$1) it2.next());
            }
        }
        M m11 = this.responseBody;
        if (m11 == null) {
            throw new IllegalStateException("Required value was null.");
        }
        C8863c d11 = C8863c.d(m11.byteStream(), m11.contentLength());
        Intrinsics.checkNotNullExpressionValue(d11, "obtain(...)");
        PikazonLogger.INSTANCE.log("Image download success! Final URL: " + L11.j());
        d.a<? super InputStream> aVar2 = this.callback;
        if (aVar2 != null) {
            aVar2.a(d11);
        }
    }
}
