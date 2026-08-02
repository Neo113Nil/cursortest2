package com.vk.media.muxer;

import android.annotation.TargetApi;
import android.media.MediaCodec;
import android.media.MediaFormat;
import android.media.MediaMuxer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.e7b0;

@TargetApi(18)
/* loaded from: classes3.dex */
public final class QueuedMuxer {
    public final MediaMuxer a;
    public MediaFormat b;
    public MediaFormat c;
    public int d;
    public int e;
    public ByteBuffer f;
    public boolean h;
    public int i;
    public int j;
    public ArrayList k;
    public ArrayList l;
    public long n;
    public b m = b.MAYBE_SUPPORTED;
    public final ArrayList g = new ArrayList();

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class SampleType {
        private static final /* synthetic */ SampleType[] $VALUES;
        public static final SampleType AUDIO;
        public static final SampleType VIDEO;

        static {
            SampleType sampleType = new SampleType(SignalingProtocol.MEDIA_OPTION_VIDEO, 0);
            VIDEO = sampleType;
            SampleType sampleType2 = new SampleType(SignalingProtocol.MEDIA_OPTION_AUDIO, 1);
            AUDIO = sampleType2;
            $VALUES = new SampleType[]{sampleType, sampleType2};
        }

        public SampleType() {
            throw null;
        }

        public static SampleType valueOf(String str) {
            return (SampleType) Enum.valueOf(SampleType.class, str);
        }

        public static SampleType[] values() {
            return (SampleType[]) $VALUES.clone();
        }
    }

    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[SampleType.values().length];
            a = iArr;
            try {
                iArr[SampleType.VIDEO.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[SampleType.AUDIO.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class b {
        private static final /* synthetic */ b[] $VALUES;
        public static final b MAYBE_SUPPORTED;
        public static final b NOT_SUPPORTED;

        static {
            b bVar = new b("MAYBE_SUPPORTED", 0);
            MAYBE_SUPPORTED = bVar;
            b bVar2 = new b("NOT_SUPPORTED", 1);
            NOT_SUPPORTED = bVar2;
            $VALUES = new b[]{bVar, bVar2};
        }

        public b() {
            throw null;
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) $VALUES.clone();
        }
    }

    public static class c {
        public final SampleType a;
        public final int b;
        public final long c;
        public final int d;

        public c(SampleType sampleType, int i, MediaCodec.BufferInfo bufferInfo) {
            this.a = sampleType;
            this.b = i;
            this.c = bufferInfo.presentationTimeUs;
            this.d = bufferInfo.flags;
        }
    }

    public QueuedMuxer(MediaMuxer mediaMuxer, Set set, e7b0 e7b0Var) {
        this.a = mediaMuxer;
        this.k = new ArrayList(set);
        this.l = new ArrayList(set);
    }

    public final void a() {
        ArrayList arrayList = this.k;
        if (arrayList == null || this.l == null || !arrayList.isEmpty() || !this.l.isEmpty()) {
            return;
        }
        this.k = null;
        this.l = null;
        MediaFormat mediaFormat = this.b;
        MediaMuxer mediaMuxer = this.a;
        if (mediaFormat != null) {
            this.d = mediaMuxer.addTrack(mediaFormat);
            this.b.getString("mime");
        }
        MediaFormat mediaFormat2 = this.c;
        if (mediaFormat2 != null) {
            this.e = mediaMuxer.addTrack(mediaFormat2);
            this.c.getString("mime");
        }
        mediaMuxer.start();
        this.h = true;
        if (this.f == null) {
            this.f = ByteBuffer.allocate(0);
        }
        this.f.flip();
        ArrayList arrayList2 = this.g;
        arrayList2.size();
        this.f.limit();
        MediaCodec.BufferInfo bufferInfo = new MediaCodec.BufferInfo();
        Iterator it = arrayList2.iterator();
        int i = 0;
        while (it.hasNext()) {
            c cVar = (c) it.next();
            bufferInfo.set(i, cVar.b, cVar.c, cVar.d);
            c(cVar.a, this.f, bufferInfo);
            int i2 = cVar.b;
            i += i2;
            int i3 = this.i + i2;
            this.i = i3;
            if (i3 >= this.j + 16384) {
                this.j = i3;
            }
        }
        arrayList2.clear();
        this.f = null;
    }

    public final void b(SampleType sampleType, ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo) {
        ArrayList arrayList = this.l;
        if (arrayList != null && arrayList.remove(sampleType)) {
            this.n = Math.min(this.n, bufferInfo.presentationTimeUs);
            a();
        }
        if (this.h) {
            c(sampleType, byteBuffer, bufferInfo);
            int i = this.i + bufferInfo.size;
            this.i = i;
            if (i >= this.j + 16384) {
                this.j = i;
                return;
            }
            return;
        }
        byteBuffer.limit(bufferInfo.offset + bufferInfo.size);
        byteBuffer.position(bufferInfo.offset);
        ByteBuffer byteBuffer2 = this.f;
        if (byteBuffer2 == null) {
            this.f = ByteBuffer.allocateDirect(Math.max(65536, bufferInfo.size)).order(ByteOrder.nativeOrder());
        } else if (byteBuffer2.remaining() < bufferInfo.size) {
            ByteBuffer order = ByteBuffer.allocateDirect((bufferInfo.size * 2) + this.f.capacity()).order(ByteOrder.nativeOrder());
            ByteBuffer byteBuffer3 = this.f;
            byteBuffer3.limit(byteBuffer3.position());
            this.f.position(0);
            order.put(this.f);
            this.f = order;
        }
        this.f.put(byteBuffer);
        this.g.add(new c(sampleType, bufferInfo.size, bufferInfo));
    }

    public final void c(SampleType sampleType, ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo) {
        int i;
        if (this.m == b.NOT_SUPPORTED && bufferInfo.size > 0) {
            bufferInfo.presentationTimeUs -= this.n;
        }
        try {
            MediaMuxer mediaMuxer = this.a;
            int i2 = a.a[sampleType.ordinal()];
            if (i2 == 1) {
                i = this.d;
            } else {
                if (i2 != 2) {
                    throw new AssertionError();
                }
                i = this.e;
            }
            mediaMuxer.writeSampleData(i, byteBuffer, bufferInfo);
        } catch (IllegalArgumentException e) {
            String message = e.getMessage();
            if (message == null || !message.endsWith("presentation time") || bufferInfo.presentationTimeUs >= 0) {
                throw e;
            }
            b bVar = this.m;
            b bVar2 = b.NOT_SUPPORTED;
            if (bVar == bVar2) {
                e.addSuppressed(new IllegalStateException("workaround for pts < 0 has failed"));
                throw e;
            }
            this.m = bVar2;
            c(sampleType, byteBuffer, bufferInfo);
        }
    }
}
