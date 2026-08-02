package com.facebook.react.devsupport;

import com.twilio.voice.EventKeys;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import ti.C6478h;
import ti.InterfaceC6480j;
import ti.k;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\r\b\u0000\u0018\u0000 !2\u00020\u0001:\u0002\"!B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J#\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\n2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ'\u0010\u0013\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J?\u0010\u0019\u001a\u00020\u00122\u0014\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\n2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0015\u0010\u001b\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u001b\u0010\u001cR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001dR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001eR\u0016\u0010\u001f\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 ¨\u0006#"}, d2 = {"Lcom/facebook/react/devsupport/MultipartStreamReader;", "", "Lti/j;", "source", "", "boundary", "<init>", "(Lti/j;Ljava/lang/String;)V", "Lti/h;", EventKeys.DATA, "", "parseHeaders", "(Lti/h;)Ljava/util/Map;", "chunk", "", "done", "Lcom/facebook/react/devsupport/MultipartStreamReader$ChunkListener;", "listener", "", "emitChunk", "(Lti/h;ZLcom/facebook/react/devsupport/MultipartStreamReader$ChunkListener;)V", "headers", "", "contentLength", "isFinal", "emitProgress", "(Ljava/util/Map;JZLcom/facebook/react/devsupport/MultipartStreamReader$ChunkListener;)V", "readAllParts", "(Lcom/facebook/react/devsupport/MultipartStreamReader$ChunkListener;)Z", "Lti/j;", "Ljava/lang/String;", "lastProgressEvent", "J", "Companion", "ChunkListener", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nMultipartStreamReader.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MultipartStreamReader.kt\ncom/facebook/react/devsupport/MultipartStreamReader\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 4 Strings.kt\nkotlin/text/StringsKt__StringsKt\n*L\n1#1,168:1\n739#2,9:169\n37#3:178\n36#3,3:179\n108#4:182\n80#4,22:183\n108#4:205\n80#4,22:206\n*S KotlinDebug\n*F\n+ 1 MultipartStreamReader.kt\ncom/facebook/react/devsupport/MultipartStreamReader\n*L\n116#1:169,9\n116#1:178\n116#1:179,3\n122#1:182\n122#1:183,22\n123#1:205\n123#1:206,22\n*E\n"})
/* loaded from: classes2.dex */
public final class MultipartStreamReader {

    @NotNull
    private static final String CRLF = "\r\n";

    @NotNull
    private final String boundary;
    private long lastProgressEvent;

    @NotNull
    private final InterfaceC6480j source;

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J3\u0010\n\u001a\u00020\t2\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H&¢\u0006\u0004\b\n\u0010\u000bJ3\u0010\u000f\u001a\u00020\t2\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\fH&¢\u0006\u0004\b\u000f\u0010\u0010ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0011À\u0006\u0001"}, d2 = {"Lcom/facebook/react/devsupport/MultipartStreamReader$ChunkListener;", "", "", "", "headers", "Lti/h;", "body", "", "isLastChunk", "", "onChunkComplete", "(Ljava/util/Map;Lti/h;Z)V", "", "loaded", "total", "onChunkProgress", "(Ljava/util/Map;JJ)V", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface ChunkListener {
        void onChunkComplete(@NotNull Map<String, String> headers, @NotNull C6478h body, boolean isLastChunk);

        void onChunkProgress(@NotNull Map<String, String> headers, long loaded, long total);
    }

    public MultipartStreamReader(@NotNull InterfaceC6480j source, @NotNull String boundary) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(boundary, "boundary");
        this.source = source;
        this.boundary = boundary;
    }

    private final void emitChunk(C6478h chunk, boolean done, ChunkListener listener) {
        long N02 = chunk.N0(ti.k.f65867c.b("\r\n\r\n"));
        if (N02 == -1) {
            listener.onChunkComplete(MapsKt.emptyMap(), chunk, done);
            return;
        }
        C6478h c6478h = new C6478h();
        C6478h c6478h2 = new C6478h();
        chunk.read(c6478h, N02);
        chunk.skip(r0.a());
        chunk.K1(c6478h2);
        listener.onChunkComplete(parseHeaders(c6478h), c6478h2, done);
    }

    private final void emitProgress(Map<String, String> headers, long contentLength, boolean isFinal, ChunkListener listener) {
        if (listener == null || headers == null) {
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - this.lastProgressEvent > 16 || isFinal) {
            this.lastProgressEvent = currentTimeMillis;
            listener.onChunkProgress(headers, contentLength, Long.parseLong(headers.getOrDefault("Content-Length", "0")));
        }
    }

    private final Map<String, String> parseHeaders(C6478h data) {
        List emptyList;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        List<String> split = new Regex(CRLF).split(data.G1(), 0);
        if (!split.isEmpty()) {
            ListIterator<String> listIterator = split.listIterator(split.size());
            while (listIterator.hasPrevious()) {
                if (listIterator.previous().length() != 0) {
                    emptyList = CollectionsKt.take(split, listIterator.nextIndex() + 1);
                    break;
                }
            }
        }
        emptyList = CollectionsKt.emptyList();
        for (String str : (String[]) emptyList.toArray(new String[0])) {
            int indexOf$default = StringsKt.indexOf$default((CharSequence) str, ":", 0, false, 6, (Object) null);
            if (indexOf$default != -1) {
                String substring = str.substring(0, indexOf$default);
                Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
                int length = substring.length() - 1;
                int i10 = 0;
                boolean z10 = false;
                while (i10 <= length) {
                    boolean z11 = Intrinsics.compare((int) substring.charAt(!z10 ? i10 : length), 32) <= 0;
                    if (z10) {
                        if (!z11) {
                            break;
                        }
                        length--;
                    } else if (z11) {
                        i10++;
                    } else {
                        z10 = true;
                    }
                }
                String obj = substring.subSequence(i10, length + 1).toString();
                String substring2 = str.substring(indexOf$default + 1);
                Intrinsics.checkNotNullExpressionValue(substring2, "substring(...)");
                int length2 = substring2.length() - 1;
                int i11 = 0;
                boolean z12 = false;
                while (i11 <= length2) {
                    boolean z13 = Intrinsics.compare((int) substring2.charAt(!z12 ? i11 : length2), 32) <= 0;
                    if (z12) {
                        if (!z13) {
                            break;
                        }
                        length2--;
                    } else if (z13) {
                        i11++;
                    } else {
                        z12 = true;
                    }
                }
                linkedHashMap.put(obj, substring2.subSequence(i11, length2 + 1).toString());
            }
        }
        return linkedHashMap;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00cb A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean readAllParts(@NotNull ChunkListener listener) {
        boolean z10;
        long j10;
        Map<String, String> map;
        ChunkListener listener2 = listener;
        Intrinsics.checkNotNullParameter(listener2, "listener");
        k.a aVar = ti.k.f65867c;
        ti.k b10 = aVar.b("\r\n--" + this.boundary + CRLF);
        ti.k b11 = aVar.b("\r\n--" + this.boundary + "--\r\n");
        ti.k b12 = aVar.b("\r\n\r\n");
        C6478h c6478h = new C6478h();
        Map<String, String> map2 = null;
        long j11 = 0;
        long j12 = 0;
        long j13 = 0;
        while (true) {
            long max = (long) Math.max(j11 - b11.a(), j12);
            long m12 = c6478h.m1(b10, max);
            if (m12 == -1) {
                m12 = c6478h.m1(b11, max);
                z10 = true;
            } else {
                z10 = false;
            }
            if (m12 == -1) {
                long d10 = c6478h.d();
                if (map2 == null) {
                    long m13 = c6478h.m1(b12, max);
                    if (m13 >= 0) {
                        this.source.read(c6478h, m13);
                        C6478h c6478h2 = new C6478h();
                        c6478h.U(c6478h2, max, m13 - max);
                        j13 = b12.a() + c6478h2.d();
                        map2 = parseHeaders(c6478h2);
                        j10 = j12;
                        if (this.source.read(c6478h, 4096) > 0) {
                            return false;
                        }
                        listener2 = listener;
                        j12 = j10;
                        j11 = d10;
                    } else {
                        j10 = j12;
                        map = map2;
                    }
                } else {
                    j10 = j12;
                    map = map2;
                    emitProgress(map, c6478h.d() - j13, false, listener2);
                }
                map2 = map;
                if (this.source.read(c6478h, 4096) > 0) {
                }
            } else {
                long j14 = j12;
                Map<String, String> map3 = map2;
                long j15 = m12 - j14;
                if (j14 > 0) {
                    C6478h c6478h3 = new C6478h();
                    c6478h.skip(j14);
                    c6478h.read(c6478h3, j15);
                    listener2 = listener;
                    emitProgress(map3, c6478h3.d() - j13, true, listener2);
                    emitChunk(c6478h3, z10, listener2);
                    map2 = null;
                    j13 = 0;
                } else {
                    listener2 = listener;
                    c6478h.skip(m12);
                    map2 = map3;
                }
                if (z10) {
                    return true;
                }
                j12 = b10.a();
                j11 = j12;
            }
        }
    }
}
