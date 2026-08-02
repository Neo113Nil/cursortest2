package com.facebook.react.modules.fresco;

import android.net.Uri;
import android.os.SystemClock;
import com.facebook.imagepipeline.producers.X;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableMapKeySetIterator;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import okhttp3.CacheControl;
import okhttp3.Headers;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import org.jetbrains.annotations.NotNull;
import y7.b;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J'\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t\u0018\u00010\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u0011\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lcom/facebook/react/modules/fresco/ReactOkHttpNetworkFetcher;", "Ly7/b;", "Lokhttp3/OkHttpClient;", "okHttpClient", "<init>", "(Lokhttp3/OkHttpClient;)V", "Lcom/facebook/react/bridge/ReadableMap;", "readableMap", "", "", "getHeaders", "(Lcom/facebook/react/bridge/ReadableMap;)Ljava/util/Map;", "Ly7/b$b;", "fetchState", "Lcom/facebook/imagepipeline/producers/X$a;", "callback", "", "fetch", "(Ly7/b$b;Lcom/facebook/imagepipeline/producers/X$a;)V", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nReactOkHttpNetworkFetcher.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ReactOkHttpNetworkFetcher.kt\ncom/facebook/react/modules/fresco/ReactOkHttpNetworkFetcher\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,74:1\n1#2:75\n*E\n"})
/* loaded from: classes2.dex */
public final class ReactOkHttpNetworkFetcher extends b {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ImageCacheControl.values().length];
            try {
                iArr[ImageCacheControl.RELOAD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ImageCacheControl.FORCE_CACHE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ImageCacheControl.ONLY_IF_CACHED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ImageCacheControl.DEFAULT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReactOkHttpNetworkFetcher(@NotNull OkHttpClient okHttpClient) {
        super(okHttpClient);
        Intrinsics.checkNotNullParameter(okHttpClient, "okHttpClient");
    }

    private final Map<String, String> getHeaders(ReadableMap readableMap) {
        if (readableMap == null) {
            return null;
        }
        ReadableMapKeySetIterator keySetIterator = readableMap.keySetIterator();
        HashMap hashMap = new HashMap();
        while (keySetIterator.hasNextKey()) {
            String nextKey = keySetIterator.nextKey();
            String string = readableMap.getString(nextKey);
            if (string != null) {
                hashMap.put(nextKey, string);
            }
        }
        return hashMap;
    }

    @Override // y7.b, com.facebook.imagepipeline.producers.X
    public void fetch(@NotNull b.C0972b fetchState, @NotNull X.a callback) {
        Map<String, String> map;
        Intrinsics.checkNotNullParameter(fetchState, "fetchState");
        Intrinsics.checkNotNullParameter(callback, "callback");
        fetchState.f68288f = SystemClock.elapsedRealtime();
        Uri g10 = fetchState.g();
        Intrinsics.checkNotNullExpressionValue(g10, "getUri(...)");
        CacheControl.Builder builder = new CacheControl.Builder();
        if (fetchState.b().D0() instanceof ReactNetworkImageRequest) {
            com.facebook.imagepipeline.request.b D02 = fetchState.b().D0();
            Intrinsics.checkNotNull(D02, "null cannot be cast to non-null type com.facebook.react.modules.fresco.ReactNetworkImageRequest");
            ReactNetworkImageRequest reactNetworkImageRequest = (ReactNetworkImageRequest) D02;
            map = getHeaders(reactNetworkImageRequest.getHeaders());
            int i10 = WhenMappings.$EnumSwitchMapping$0[reactNetworkImageRequest.getCacheControl().ordinal()];
            if (i10 == 1) {
                builder.noStore().noCache();
            } else if (i10 == 2) {
                builder.maxStale(Integer.MAX_VALUE, TimeUnit.SECONDS);
            } else if (i10 == 3) {
                builder.onlyIfCached().maxStale(Integer.MAX_VALUE, TimeUnit.SECONDS);
            } else {
                if (i10 != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                builder.noStore();
            }
        } else {
            builder.noStore();
            map = null;
        }
        Headers.Companion companion = Headers.INSTANCE;
        if (map == null) {
            map = MapsKt.emptyMap();
        }
        Request.Builder cacheControl = new Request.Builder().headers(companion.m1668deprecated_of(map)).cacheControl(builder.build());
        String uri = g10.toString();
        Intrinsics.checkNotNullExpressionValue(uri, "toString(...)");
        fetchWithRequest(fetchState, callback, cacheControl.url(uri).get().build());
    }
}
