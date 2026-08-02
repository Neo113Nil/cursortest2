package ru.ozon.app.android.mediaupload.video;

import K1.G;
import We.C;
import We.K;
import android.content.ContentResolver;
import android.net.Uri;
import java.io.IOException;
import java.io.InputStream;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.mediaupload.video.dto.chunks.SegmentReadInfo;
import sf.InterfaceC9682h;
import sf.M;
import sf.z;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000b\b\u0000\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000f\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0011\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0019R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001aR\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u001bR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\u001c\u001a\u0004\b\u001d\u0010\u0013R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u001e\u001a\u0004\b\u001f\u0010 ¨\u0006!"}, d2 = {"Lru/ozon/app/android/mediaupload/video/InputStreamRequestBody;", "LWe/K;", "Landroid/content/ContentResolver;", "contentResolver", "Landroid/net/Uri;", "uri", "LWe/C;", "contentType", "", "startPosition", "Lru/ozon/app/android/mediaupload/video/dto/chunks/SegmentReadInfo;", "segmentReadInfo", "<init>", "(Landroid/content/ContentResolver;Landroid/net/Uri;LWe/C;JLru/ozon/app/android/mediaupload/video/dto/chunks/SegmentReadInfo;)V", "totalRead", "getByteCount", "(J)J", "()LWe/C;", "contentLength", "()J", "Lsf/h;", "sink", "", "writeTo", "(Lsf/h;)V", "Landroid/content/ContentResolver;", "Landroid/net/Uri;", "LWe/C;", "J", "getStartPosition", "Lru/ozon/app/android/mediaupload/video/dto/chunks/SegmentReadInfo;", "getSegmentReadInfo", "()Lru/ozon/app/android/mediaupload/video/dto/chunks/SegmentReadInfo;", "mediaupload_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class InputStreamRequestBody extends K {

    @NotNull
    private final ContentResolver contentResolver;
    private final C contentType;

    @NotNull
    private final SegmentReadInfo segmentReadInfo;
    private final long startPosition;

    @NotNull
    private final Uri uri;

    public InputStreamRequestBody(@NotNull ContentResolver contentResolver, @NotNull Uri uri, C c11, long j11, @NotNull SegmentReadInfo segmentReadInfo) {
        Intrinsics.checkNotNullParameter(contentResolver, "contentResolver");
        Intrinsics.checkNotNullParameter(uri, "uri");
        Intrinsics.checkNotNullParameter(segmentReadInfo, "segmentReadInfo");
        this.contentResolver = contentResolver;
        this.uri = uri;
        this.contentType = c11;
        this.startPosition = j11;
        this.segmentReadInfo = segmentReadInfo;
    }

    private final long getByteCount(long totalRead) {
        return this.segmentReadInfo.getChunkLength() - totalRead >= this.segmentReadInfo.getSegmentSize() ? this.segmentReadInfo.getSegmentSize() : this.segmentReadInfo.getChunkLength() - totalRead;
    }

    @Override // We.K
    public long contentLength() {
        return this.segmentReadInfo.getChunkLength();
    }

    @Override // We.K
    /* renamed from: contentType, reason: from getter */
    public C getContentType() {
        return this.contentType;
    }

    @NotNull
    public final SegmentReadInfo getSegmentReadInfo() {
        return this.segmentReadInfo;
    }

    public final long getStartPosition() {
        return this.startPosition;
    }

    @Override // We.K
    public void writeTo(@NotNull InterfaceC9682h sink) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        Uri uri = this.uri;
        InputStream openInputStream = this.contentResolver.openInputStream(uri);
        if (openInputStream == null) {
            throw new IOException(G.b(uri, "Can't open "));
        }
        try {
            openInputStream.skip(this.startPosition);
            M k11 = z.k(openInputStream);
            long j11 = 0;
            do {
                try {
                    long read = k11.read(sink.f(), getByteCount(j11));
                    if (read == -1) {
                        break;
                    }
                    j11 += read;
                    sink.flush();
                } finally {
                }
            } while (j11 != this.segmentReadInfo.getChunkLength());
            Unit unit = Unit.f71690a;
            k11.close();
            openInputStream.close();
        } finally {
        }
    }
}
