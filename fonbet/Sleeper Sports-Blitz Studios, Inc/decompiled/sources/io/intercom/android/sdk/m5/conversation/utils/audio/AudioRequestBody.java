package io.intercom.android.sdk.m5.conversation.utils.audio;

import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.MediaType;
import okhttp3.RequestBody;
import okio.BufferedSink;

/* compiled from: AudioRequestBody.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\n\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0016J\b\u0010\t\u001a\u00020\nH\u0016J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lio/intercom/android/sdk/m5/conversation/utils/audio/AudioRequestBody;", "Lokhttp3/RequestBody;", "audioFile", "Ljava/io/File;", "<init>", "(Ljava/io/File;)V", "fileRequestBody", "contentType", "Lokhttp3/MediaType;", "contentLength", "", "writeTo", "", "sink", "Lokio/BufferedSink;", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class AudioRequestBody extends RequestBody {
    public static final int $stable = 8;
    private final File audioFile;
    private final RequestBody fileRequestBody;

    public AudioRequestBody(File audioFile) {
        Intrinsics.checkNotNullParameter(audioFile, "audioFile");
        this.audioFile = audioFile;
        this.fileRequestBody = RequestBody.INSTANCE.create(audioFile, MediaType.INSTANCE.parse(AudioConstants.AUDIO_MEDIA_TYPE));
    }

    @Override // okhttp3.RequestBody
    /* renamed from: contentType */
    public MediaType getContentType() {
        return this.fileRequestBody.getContentType();
    }

    @Override // okhttp3.RequestBody
    public long contentLength() {
        return this.fileRequestBody.contentLength();
    }

    @Override // okhttp3.RequestBody
    public void writeTo(BufferedSink sink) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        this.fileRequestBody.writeTo(sink);
    }
}
