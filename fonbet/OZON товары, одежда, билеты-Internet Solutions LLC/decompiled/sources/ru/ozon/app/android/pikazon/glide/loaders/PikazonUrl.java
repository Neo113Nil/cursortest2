package ru.ozon.app.android.pikazon.glide.loaders;

import T5.f;
import android.net.Uri;
import com.google.android.gms.common.internal.ImagesContract;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000e\u0018\u0000 $2\u00020\u0001:\u0001$B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0011\u001a\u00020\u0002¢\u0006\u0004\b\u0011\u0010\bJ\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0096\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u001a\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001b\u001a\u0004\b\u001c\u0010\bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u001b\u001a\u0004\b\u001d\u0010\bR\u001a\u0010\u001e\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001b\u001a\u0004\b\u001f\u0010\bR\u0018\u0010 \u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010\u001bR\u0018\u0010!\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\"R\u0016\u0010\u0018\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010#¨\u0006%"}, d2 = {"Lru/ozon/app/android/pikazon/glide/loaders/PikazonUrl;", "LT5/f;", "", ImagesContract.URL, "uuid", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getSafeStringUrl", "()Ljava/lang/String;", "", "getCacheKeyBytes", "()[B", "Ljava/security/MessageDigest;", "messageDigest", "", "updateDiskCacheKey", "(Ljava/security/MessageDigest;)V", "toStringUrl", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getUrl", "getUuid", "cacheKey", "getCacheKey$lib_release", "safeStringUrl", "cacheKeyBytes", "[B", "I", "Companion", "lib_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class PikazonUrl implements f {

    @NotNull
    private static final Companion Companion = new Companion(null);

    @NotNull
    private final String cacheKey;
    private volatile byte[] cacheKeyBytes;
    private int hashCode;
    private String safeStringUrl;

    @NotNull
    private final String url;

    @NotNull
    private final String uuid;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/pikazon/glide/loaders/PikazonUrl$Companion;", "", "<init>", "()V", "ALLOWED_URI_CHARS", "", "lib_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public PikazonUrl(@NotNull String url, @NotNull String uuid) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(uuid, "uuid");
        this.url = url;
        this.uuid = uuid;
        this.cacheKey = url;
    }

    private final byte[] getCacheKeyBytes() {
        if (this.cacheKeyBytes == null) {
            String str = this.cacheKey;
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

    private final String getSafeStringUrl() {
        String str = this.safeStringUrl;
        if (str == null || h.K(str)) {
            this.safeStringUrl = Uri.encode(this.url, "@#&=*+-_.,:!?()/~'%;$");
        }
        String str2 = this.safeStringUrl;
        Intrinsics.f(str2);
        return str2;
    }

    @Override // T5.f
    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (other instanceof PikazonUrl) {
            return Intrinsics.d(this.cacheKey, ((PikazonUrl) other).cacheKey);
        }
        return false;
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
        if (this.hashCode == 0) {
            this.hashCode = this.cacheKey.hashCode();
        }
        return this.hashCode;
    }

    @NotNull
    /* renamed from: toString, reason: from getter */
    public String getCacheKey() {
        return this.cacheKey;
    }

    @NotNull
    public final String toStringUrl() {
        return getSafeStringUrl();
    }

    @Override // T5.f
    public void updateDiskCacheKey(@NotNull MessageDigest messageDigest) {
        Intrinsics.checkNotNullParameter(messageDigest, "messageDigest");
        messageDigest.update(getCacheKeyBytes());
    }

    public /* synthetic */ PikazonUrl(String str, String str2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i11 & 2) != 0 ? UUID.randomUUID().toString() : str2);
    }
}
