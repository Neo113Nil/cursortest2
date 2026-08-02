package ru.ozon.app.android.pdp.view.photo360.data;

import G.g;
import N3.C3660k;
import Sc.r;
import Sc.s;
import Wc.a;
import Wc.b;
import android.content.Context;
import android.graphics.drawable.Drawable;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.google.android.gms.common.internal.ImagesContract;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.collections.K;
import kotlin.coroutines.d;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pikazon.callback.PikazonLoaderCallback;
import ru.ozon.app.android.pikazon.extensions.ContextExtKt;
import ru.ozon.app.android.pikazon.glide.loadPriority.LoadPriority;
import ru.ozon.app.android.pikazon.image.ImageSize;
import ru.ozon.app.android.utils.CollectionExtKt;
import ru.ozon.app.android.utils.Result;
import xe.C10737n;
import xe.InterfaceC10733l;
import xe.N;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010#\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001:\u0001%B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J0\u0010\u000e\u001a\u00020\r2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\n\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0082@¢\u0006\u0004\b\u000e\u0010\u000fJ4\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\u0006\u0010\u0010\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\t2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0086@¢\u0006\u0004\b\u0014\u0010\u0015J\u001e\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\u0006\u0010\n\u001a\u00020\tH\u0086@¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0018R0\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00192\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00198\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001d\u0010!\u001a\b\u0012\u0004\u0012\u00020\t0 8\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$¨\u0006&"}, d2 = {"Lru/ozon/app/android/pdp/view/photo360/data/Photo360ImagesDataSet;", "", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "", "", "urls", "", "index", "Lru/ozon/app/android/pikazon/image/ImageSize;", "imageSize", "Landroid/graphics/drawable/Drawable;", "loadImage", "(Ljava/util/List;ILru/ozon/app/android/pikazon/image/ImageSize;Lkotlin/coroutines/d;)Ljava/lang/Object;", "width", "height", "Lru/ozon/app/android/utils/Result;", "", "loadImages", "(IILjava/util/List;Lkotlin/coroutines/d;)Ljava/lang/Object;", "loadImageOriginalSize", "(ILkotlin/coroutines/d;)Ljava/lang/Object;", "Landroid/content/Context;", "", "Lru/ozon/app/android/pdp/view/photo360/data/Photo360ImagesDataSet$PhotoData;", AppMeasurementSdk.ConditionalUserProperty.VALUE, "cachedImages", "Ljava/util/List;", "getCachedImages", "()Ljava/util/List;", "", "currentRequests", "Ljava/util/Set;", "getCurrentRequests", "()Ljava/util/Set;", "PhotoData", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class Photo360ImagesDataSet {

    @NotNull
    private List<PhotoData> cachedImages;

    @NotNull
    private final Context context;

    @NotNull
    private final Set<Integer> currentRequests;

    public Photo360ImagesDataSet(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
        this.cachedImages = new ArrayList();
        this.currentRequests = new LinkedHashSet();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object loadImage(List<String> list, final int i11, ImageSize imageSize, d<? super Drawable> frame) {
        final C10737n c10737n = new C10737n(1, b.b(frame));
        c10737n.o();
        ContextExtKt.load(this.context, list.get(i11), (r15 & 2) != 0 ? K.f71697a : null, (r15 & 4) != 0 ? null : new PikazonLoaderCallback<Drawable>() { // from class: ru.ozon.app.android.pdp.view.photo360.data.Photo360ImagesDataSet$loadImage$2$1
            @Override // ru.ozon.app.android.pikazon.callback.PikazonLoaderCallback
            public void onLoadFailed(Exception e11) {
                Photo360ImagesDataSet.this.getCurrentRequests().remove(Integer.valueOf(i11));
                c10737n.A(e11);
            }

            @Override // ru.ozon.app.android.pikazon.callback.PikazonLoaderCallback
            public void onLoadSuccessful(Drawable resource) {
                Photo360ImagesDataSet.this.getCurrentRequests().remove(Integer.valueOf(i11));
                if (resource != null) {
                    InterfaceC10733l<Drawable> interfaceC10733l = c10737n;
                    r.Companion companion = r.INSTANCE;
                    interfaceC10733l.resumeWith(resource);
                }
            }
        }, (r15 & 8) != 0 ? null : null, (r15 & 16) != 0 ? LoadPriority.NORMAL : null, (r15 & 32) != 0 ? false : false, (r15 & 64) != 0 ? null : imageSize);
        Object n11 = c10737n.n();
        if (n11 == a.COROUTINE_SUSPENDED) {
            Intrinsics.checkNotNullParameter(frame, "frame");
        }
        return n11;
    }

    @NotNull
    public final List<PhotoData> getCachedImages() {
        return this.cachedImages;
    }

    @NotNull
    public final Set<Integer> getCurrentRequests() {
        return this.currentRequests;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object loadImageOriginalSize(int i11, @NotNull d<? super Result<Unit>> dVar) {
        Photo360ImagesDataSet$loadImageOriginalSize$1 photo360ImagesDataSet$loadImageOriginalSize$1;
        int i12;
        PhotoData photoData;
        Photo360ImagesDataSet photo360ImagesDataSet;
        try {
            if (dVar instanceof Photo360ImagesDataSet$loadImageOriginalSize$1) {
                photo360ImagesDataSet$loadImageOriginalSize$1 = (Photo360ImagesDataSet$loadImageOriginalSize$1) dVar;
                int i13 = photo360ImagesDataSet$loadImageOriginalSize$1.label;
                if ((i13 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                    photo360ImagesDataSet$loadImageOriginalSize$1.label = i13 - LinearLayoutManager.INVALID_OFFSET;
                    Object obj = photo360ImagesDataSet$loadImageOriginalSize$1.result;
                    a aVar = a.COROUTINE_SUSPENDED;
                    i12 = photo360ImagesDataSet$loadImageOriginalSize$1.label;
                    if (i12 != 0) {
                        s.b(obj);
                        PhotoData photoData2 = this.cachedImages.get(i11);
                        List<PhotoData> list = this.cachedImages;
                        ArrayList arrayList = new ArrayList(C7714v.z(list, 10));
                        Iterator<T> it = list.iterator();
                        while (it.hasNext()) {
                            arrayList.add(((PhotoData) it.next()).getUrl());
                        }
                        photo360ImagesDataSet$loadImageOriginalSize$1.L$0 = this;
                        photo360ImagesDataSet$loadImageOriginalSize$1.L$1 = photoData2;
                        photo360ImagesDataSet$loadImageOriginalSize$1.label = 1;
                        Object loadImage = loadImage(arrayList, i11, null, photo360ImagesDataSet$loadImageOriginalSize$1);
                        if (loadImage == aVar) {
                            return aVar;
                        }
                        obj = loadImage;
                        photoData = photoData2;
                        photo360ImagesDataSet = this;
                    } else {
                        if (i12 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        photoData = (PhotoData) photo360ImagesDataSet$loadImageOriginalSize$1.L$1;
                        photo360ImagesDataSet = (Photo360ImagesDataSet) photo360ImagesDataSet$loadImageOriginalSize$1.L$0;
                        s.b(obj);
                    }
                    photo360ImagesDataSet.cachedImages = C7714v.W0(CollectionExtKt.replace(photo360ImagesDataSet.cachedImages, new PhotoData(photoData.getUrl(), null, (Drawable) obj, true, 2, null), new Photo360ImagesDataSet$loadImageOriginalSize$2$1(photoData)));
                    return new Result.Success(Unit.f71690a);
                }
            }
            if (i12 != 0) {
            }
            photo360ImagesDataSet.cachedImages = C7714v.W0(CollectionExtKt.replace(photo360ImagesDataSet.cachedImages, new PhotoData(photoData.getUrl(), null, (Drawable) obj, true, 2, null), new Photo360ImagesDataSet$loadImageOriginalSize$2$1(photoData)));
            return new Result.Success(Unit.f71690a);
        } catch (Throwable th2) {
            return new Result.Failure(th2);
        }
        photo360ImagesDataSet$loadImageOriginalSize$1 = new Photo360ImagesDataSet$loadImageOriginalSize$1(this, dVar);
        Object obj2 = photo360ImagesDataSet$loadImageOriginalSize$1.result;
        a aVar2 = a.COROUTINE_SUSPENDED;
        i12 = photo360ImagesDataSet$loadImageOriginalSize$1.label;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object loadImages(int i11, int i12, @NotNull List<String> list, @NotNull d<? super Result<Unit>> dVar) {
        Photo360ImagesDataSet$loadImages$1 photo360ImagesDataSet$loadImages$1;
        int i13;
        try {
            if (dVar instanceof Photo360ImagesDataSet$loadImages$1) {
                photo360ImagesDataSet$loadImages$1 = (Photo360ImagesDataSet$loadImages$1) dVar;
                int i14 = photo360ImagesDataSet$loadImages$1.label;
                if ((i14 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                    photo360ImagesDataSet$loadImages$1.label = i14 - LinearLayoutManager.INVALID_OFFSET;
                    Object obj = photo360ImagesDataSet$loadImages$1.result;
                    a aVar = a.COROUTINE_SUSPENDED;
                    i13 = photo360ImagesDataSet$loadImages$1.label;
                    if (i13 != 0) {
                        s.b(obj);
                        Photo360ImagesDataSet$loadImages$2$1 photo360ImagesDataSet$loadImages$2$1 = new Photo360ImagesDataSet$loadImages$2$1(list, this, i11, i12, null);
                        photo360ImagesDataSet$loadImages$1.label = 1;
                        if (N.d(photo360ImagesDataSet$loadImages$2$1, photo360ImagesDataSet$loadImages$1) == aVar) {
                            return aVar;
                        }
                    } else {
                        if (i13 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        s.b(obj);
                    }
                    return new Result.Success(Unit.f71690a);
                }
            }
            if (i13 != 0) {
            }
            return new Result.Success(Unit.f71690a);
        } catch (Throwable th2) {
            return new Result.Failure(th2);
        }
        photo360ImagesDataSet$loadImages$1 = new Photo360ImagesDataSet$loadImages$1(this, dVar);
        Object obj2 = photo360ImagesDataSet$loadImages$1.result;
        a aVar2 = a.COROUTINE_SUSPENDED;
        i13 = photo360ImagesDataSet$loadImages$1.label;
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0011\u001a\u00020\u00072\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\fR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0013\u001a\u0004\b\u0015\u0010\fR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\u0019\u001a\u0004\b\b\u0010\u001a¨\u0006\u001b"}, d2 = {"Lru/ozon/app/android/pdp/view/photo360/data/Photo360ImagesDataSet$PhotoData;", "", "", ImagesContract.URL, "resizedUrl", "Landroid/graphics/drawable/Drawable;", "drawable", "", "isOriginalSize", "<init>", "(Ljava/lang/String;Ljava/lang/String;Landroid/graphics/drawable/Drawable;Z)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getUrl", "getResizedUrl", "Landroid/graphics/drawable/Drawable;", "getDrawable", "()Landroid/graphics/drawable/Drawable;", "Z", "()Z", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class PhotoData {

        @NotNull
        private final Drawable drawable;
        private final boolean isOriginalSize;

        @NotNull
        private final String resizedUrl;

        @NotNull
        private final String url;

        public PhotoData(@NotNull String url, @NotNull String resizedUrl, @NotNull Drawable drawable, boolean z11) {
            Intrinsics.checkNotNullParameter(url, "url");
            Intrinsics.checkNotNullParameter(resizedUrl, "resizedUrl");
            Intrinsics.checkNotNullParameter(drawable, "drawable");
            this.url = url;
            this.resizedUrl = resizedUrl;
            this.drawable = drawable;
            this.isOriginalSize = z11;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PhotoData)) {
                return false;
            }
            PhotoData photoData = (PhotoData) other;
            return Intrinsics.d(this.url, photoData.url) && Intrinsics.d(this.resizedUrl, photoData.resizedUrl) && Intrinsics.d(this.drawable, photoData.drawable) && this.isOriginalSize == photoData.isOriginalSize;
        }

        @NotNull
        public final Drawable getDrawable() {
            return this.drawable;
        }

        @NotNull
        public final String getUrl() {
            return this.url;
        }

        public int hashCode() {
            return Boolean.hashCode(this.isOriginalSize) + ((this.drawable.hashCode() + g.a(this.url.hashCode() * 31, 31, this.resizedUrl)) * 31);
        }

        /* renamed from: isOriginalSize, reason: from getter */
        public final boolean getIsOriginalSize() {
            return this.isOriginalSize;
        }

        @NotNull
        public String toString() {
            String str = this.url;
            String str2 = this.resizedUrl;
            Drawable drawable = this.drawable;
            boolean z11 = this.isOriginalSize;
            StringBuilder d11 = C3660k.d("PhotoData(url=", str, ", resizedUrl=", str2, ", drawable=");
            d11.append(drawable);
            d11.append(", isOriginalSize=");
            d11.append(z11);
            d11.append(")");
            return d11.toString();
        }

        public /* synthetic */ PhotoData(String str, String str2, Drawable drawable, boolean z11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i11 & 2) != 0 ? "" : str2, drawable, (i11 & 8) != 0 ? false : z11);
        }
    }
}
