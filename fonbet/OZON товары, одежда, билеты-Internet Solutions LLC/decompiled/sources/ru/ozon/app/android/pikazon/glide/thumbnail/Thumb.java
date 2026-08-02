package ru.ozon.app.android.pikazon.glide.thumbnail;

import Nk.a;
import Sc.InterfaceC4008j;
import Sc.k;
import T5.f;
import com.google.android.gms.common.internal.ImagesContract;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pikazon.glide.loaders.PikazonUrl;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014JK\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u001a\u001a\u00020\b2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0096\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010 \u001a\u0004\b!\u0010\u001fR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010 \u001a\u0004\b\"\u0010\u001fR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010#\u001a\u0004\b$\u0010\u001dR\u0017\u0010\u0007\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010#\u001a\u0004\b%\u0010\u001dR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010&\u001a\u0004\b\t\u0010'R\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010 \u001a\u0004\b(\u0010\u001fR\u001b\u0010.\u001a\u00020)8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R\u0018\u0010/\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u00100R\u0011\u00104\u001a\u0002018F¢\u0006\u0006\u001a\u0004\b2\u00103¨\u00065"}, d2 = {"Lru/ozon/app/android/pikazon/glide/thumbnail/Thumb;", "LT5/f;", "", ImagesContract.URL, "uuid", "", "width", "height", "", "isPending", "cacheKey", "<init>", "(Ljava/lang/String;Ljava/lang/String;IIZLjava/lang/String;)V", "", "getCacheKeyBytes", "()[B", "Ljava/security/MessageDigest;", "messageDigest", "", "updateDiskCacheKey", "(Ljava/security/MessageDigest;)V", "copy$lib_release", "(Ljava/lang/String;Ljava/lang/String;IIZLjava/lang/String;)Lru/ozon/app/android/pikazon/glide/thumbnail/Thumb;", "copy", "", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "()Ljava/lang/String;", "Ljava/lang/String;", "getUrl", "getUuid", "I", "getWidth", "getHeight", "Z", "()Z", "getCacheKey", "Lru/ozon/app/android/pikazon/glide/loaders/PikazonUrl;", "origin$delegate", "LSc/j;", "getOrigin", "()Lru/ozon/app/android/pikazon/glide/loaders/PikazonUrl;", "origin", "cacheKeyBytes", "[B", "", "getArea", "()J", "area", "lib_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class Thumb implements f {

    @NotNull
    private final String cacheKey;
    private volatile byte[] cacheKeyBytes;
    private final int height;
    private final boolean isPending;

    /* renamed from: origin$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j origin;

    @NotNull
    private final String url;

    @NotNull
    private final String uuid;
    private final int width;

    public Thumb(@NotNull String url, @NotNull String uuid, int i11, int i12, boolean z11, @NotNull String cacheKey) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(uuid, "uuid");
        Intrinsics.checkNotNullParameter(cacheKey, "cacheKey");
        this.url = url;
        this.uuid = uuid;
        this.width = i11;
        this.height = i12;
        this.isPending = z11;
        this.cacheKey = cacheKey;
        this.origin = k.b(new Thumb$origin$2(this));
    }

    public static /* synthetic */ Thumb copy$lib_release$default(Thumb thumb, String str, String str2, int i11, int i12, boolean z11, String str3, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = thumb.url;
        }
        if ((i13 & 2) != 0) {
            str2 = thumb.uuid;
        }
        if ((i13 & 4) != 0) {
            i11 = thumb.width;
        }
        if ((i13 & 8) != 0) {
            i12 = thumb.height;
        }
        if ((i13 & 16) != 0) {
            z11 = thumb.isPending;
        }
        if ((i13 & 32) != 0) {
            str3 = thumb.cacheKey;
        }
        boolean z12 = z11;
        String str4 = str3;
        return thumb.copy$lib_release(str, str2, i11, i12, z12, str4);
    }

    private final byte[] getCacheKeyBytes() {
        if (this.cacheKeyBytes == null) {
            String str = this.url;
            Charset CHARSET = f.f26662a;
            Intrinsics.checkNotNullExpressionValue(CHARSET, "CHARSET");
            byte[] bytes = str.getBytes(CHARSET);
            Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
            this.cacheKeyBytes = bytes;
        }
        byte[] bArr = this.cacheKeyBytes;
        Intrinsics.f(bArr);
        return bArr;
    }

    @NotNull
    public final Thumb copy$lib_release(@NotNull String url, @NotNull String uuid, int width, int height, boolean isPending, @NotNull String cacheKey) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(uuid, "uuid");
        Intrinsics.checkNotNullParameter(cacheKey, "cacheKey");
        return new Thumb(url, uuid, width, height, isPending, cacheKey);
    }

    @Override // T5.f
    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (other instanceof Thumb) {
            return Intrinsics.d(this.url, ((Thumb) other).url);
        }
        return false;
    }

    public final long getArea() {
        return this.width * this.height;
    }

    @NotNull
    public final String getCacheKey() {
        return this.cacheKey;
    }

    @NotNull
    public final PikazonUrl getOrigin() {
        return (PikazonUrl) this.origin.getValue();
    }

    @NotNull
    public final String getUrl() {
        return this.url;
    }

    @NotNull
    public final String getUuid() {
        return this.uuid;
    }

    @Override // T5.f
    public int hashCode() {
        return this.url.hashCode();
    }

    /* renamed from: isPending, reason: from getter */
    public final boolean getIsPending() {
        return this.isPending;
    }

    @NotNull
    public String toString() {
        return a.b("thumbnail ", this.cacheKey);
    }

    @Override // T5.f
    public void updateDiskCacheKey(@NotNull MessageDigest messageDigest) {
        Intrinsics.checkNotNullParameter(messageDigest, "messageDigest");
        messageDigest.update(getCacheKeyBytes());
    }
}
