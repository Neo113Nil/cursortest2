package ru.ozon.app.android.fresh.geo.widgets.geotrackingMap.v2.core;

import Sc.r;
import Sc.s;
import We.E;
import Xc.a;
import Xc.b;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.google.android.gms.common.internal.ImagesContract;
import kotlin.Metadata;
import kotlin.coroutines.d;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import xe.C10720e0;
import xe.C10727i;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0010B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J&\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0086@¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000f¨\u0006\u0011"}, d2 = {"Lru/ozon/app/android/fresh/geo/widgets/geotrackingMap/v2/core/NetworkImageDataLoader;", "", "LWe/E;", "okHttpClient", "<init>", "(LWe/E;)V", "", ImagesContract.URL, "Lru/ozon/app/android/fresh/geo/widgets/geotrackingMap/v2/core/NetworkImageDataLoader$FileFormat;", "fileFormat", "LSc/r;", "", "getBytesFromUrl-0E7RQCE", "(Ljava/lang/String;Lru/ozon/app/android/fresh/geo/widgets/geotrackingMap/v2/core/NetworkImageDataLoader$FileFormat;Lkotlin/coroutines/d;)Ljava/lang/Object;", "getBytesFromUrl", "LWe/E;", "FileFormat", "widgets-geo_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class NetworkImageDataLoader {

    @NotNull
    private final E okHttpClient;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lru/ozon/app/android/fresh/geo/widgets/geotrackingMap/v2/core/NetworkImageDataLoader$FileFormat;", "", "extension", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getExtension", "()Ljava/lang/String;", "PNG", "widgets-geo_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class FileFormat {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ FileFormat[] $VALUES;
        public static final FileFormat PNG = new FileFormat("PNG", 0, ".png");

        @NotNull
        private final String extension;

        private static final /* synthetic */ FileFormat[] $values() {
            return new FileFormat[]{PNG};
        }

        static {
            FileFormat[] $values = $values();
            $VALUES = $values;
            $ENTRIES = b.a($values);
        }

        private FileFormat(String str, int i11, String str2) {
            this.extension = str2;
        }

        public static FileFormat valueOf(String str) {
            return (FileFormat) Enum.valueOf(FileFormat.class, str);
        }

        public static FileFormat[] values() {
            return (FileFormat[]) $VALUES.clone();
        }

        @NotNull
        public final String getExtension() {
            return this.extension;
        }
    }

    public NetworkImageDataLoader(@NotNull E okHttpClient) {
        Intrinsics.checkNotNullParameter(okHttpClient, "okHttpClient");
        this.okHttpClient = okHttpClient;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* renamed from: getBytesFromUrl-0E7RQCE, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m746getBytesFromUrl0E7RQCE(@NotNull String str, @NotNull FileFormat fileFormat, @NotNull d<? super r<byte[]>> dVar) {
        NetworkImageDataLoader$getBytesFromUrl$1 networkImageDataLoader$getBytesFromUrl$1;
        int i11;
        if (dVar instanceof NetworkImageDataLoader$getBytesFromUrl$1) {
            networkImageDataLoader$getBytesFromUrl$1 = (NetworkImageDataLoader$getBytesFromUrl$1) dVar;
            int i12 = networkImageDataLoader$getBytesFromUrl$1.label;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                networkImageDataLoader$getBytesFromUrl$1.label = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = networkImageDataLoader$getBytesFromUrl$1.result;
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                i11 = networkImageDataLoader$getBytesFromUrl$1.label;
                if (i11 != 0) {
                    s.b(obj);
                    C10720e0 c10720e0 = C10720e0.f105451a;
                    He.b bVar = He.b.f10879b;
                    NetworkImageDataLoader$getBytesFromUrl$2 networkImageDataLoader$getBytesFromUrl$2 = new NetworkImageDataLoader$getBytesFromUrl$2(str, fileFormat, this, null);
                    networkImageDataLoader$getBytesFromUrl$1.label = 1;
                    obj = C10727i.f(bVar, networkImageDataLoader$getBytesFromUrl$2, networkImageDataLoader$getBytesFromUrl$1);
                    if (obj == aVar) {
                        return aVar;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    s.b(obj);
                }
                return ((r) obj).getF26106a();
            }
        }
        networkImageDataLoader$getBytesFromUrl$1 = new NetworkImageDataLoader$getBytesFromUrl$1(this, dVar);
        Object obj2 = networkImageDataLoader$getBytesFromUrl$1.result;
        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
        i11 = networkImageDataLoader$getBytesFromUrl$1.label;
        if (i11 != 0) {
        }
        return ((r) obj2).getF26106a();
    }
}
