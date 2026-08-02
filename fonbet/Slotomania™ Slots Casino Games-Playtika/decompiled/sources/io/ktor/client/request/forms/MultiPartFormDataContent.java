package io.ktor.client.request.forms;

import com.appsflyer.AppsFlyerProperties;
import io.ktor.client.request.forms.PreparedPart;
import io.ktor.http.ContentType;
import io.ktor.http.HttpHeaders;
import io.ktor.http.content.OutgoingContent;
import io.ktor.http.content.PartData;
import io.ktor.sse.ServerSentEventKt;
import io.ktor.utils.io.ByteReadChannel;
import io.ktor.utils.io.ByteReadChannelOperationsKt;
import io.ktor.utils.io.ByteWriteChannel;
import io.ktor.utils.io.ByteWriteChannelOperationsKt;
import io.ktor.utils.io.core.BytePacketBuilderKt;
import io.ktor.utils.io.core.StringsKt;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jdk7.AutoCloseableKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.io.Buffer;
import kotlinx.io.Sink;
import kotlinx.io.Source;
import kotlinx.io.SourcesKt;

/* compiled from: FormDataContent.kt */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0006\u0018\u00002\u00020\u0001B)\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0096@¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\b\u001a\u00020\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0019\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u0018R\u0014\u0010\u001b\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001d\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001cR\u001a\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R(\u0010#\u001a\u0004\u0018\u00010!2\b\u0010\"\u001a\u0004\u0018\u00010!8\u0016@RX\u0096\u000e¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&¨\u0006'"}, d2 = {"Lio/ktor/client/request/forms/MultiPartFormDataContent;", "Lio/ktor/http/content/OutgoingContent$WriteChannelContent;", "", "Lio/ktor/http/content/PartData;", "parts", "", "boundary", "Lio/ktor/http/ContentType;", "contentType", "<init>", "(Ljava/util/List;Ljava/lang/String;Lio/ktor/http/ContentType;)V", "Lio/ktor/utils/io/ByteWriteChannel;", AppsFlyerProperties.CHANNEL, "", "writeTo", "(Lio/ktor/utils/io/ByteWriteChannel;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Ljava/lang/String;", "getBoundary", "()Ljava/lang/String;", "Lio/ktor/http/ContentType;", "getContentType", "()Lio/ktor/http/ContentType;", "", "BOUNDARY_BYTES", "[B", "LAST_BOUNDARY_BYTES", "", "BODY_OVERHEAD_SIZE", "I", "PART_OVERHEAD_SIZE", "Lio/ktor/client/request/forms/PreparedPart;", "rawParts", "Ljava/util/List;", "", "value", "contentLength", "Ljava/lang/Long;", "getContentLength", "()Ljava/lang/Long;", "ktor-client-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class MultiPartFormDataContent extends OutgoingContent.WriteChannelContent {
    private final int BODY_OVERHEAD_SIZE;
    private final byte[] BOUNDARY_BYTES;
    private final byte[] LAST_BOUNDARY_BYTES;
    private final int PART_OVERHEAD_SIZE;
    private final String boundary;
    private Long contentLength;
    private final ContentType contentType;
    private final List<PreparedPart> rawParts;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ MultiPartFormDataContent(List list, String str, ContentType contentType, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, str, (i & 4) != 0 ? ContentType.MultiPart.INSTANCE.getFormData().withParameter("boundary", str) : contentType);
        str = (i & 2) != 0 ? FormDataContentKt.generateBoundary() : str;
    }

    public final String getBoundary() {
        return this.boundary;
    }

    @Override // io.ktor.http.content.OutgoingContent
    public ContentType getContentType() {
        return this.contentType;
    }

    public MultiPartFormDataContent(List<? extends PartData> parts, String boundary, ContentType contentType) {
        byte[] bArr;
        PreparedPart channelPart;
        byte[] bArr2;
        byte[] bArr3;
        Intrinsics.checkNotNullParameter(parts, "parts");
        Intrinsics.checkNotNullParameter(boundary, "boundary");
        Intrinsics.checkNotNullParameter(contentType, "contentType");
        this.boundary = boundary;
        this.contentType = contentType;
        Long l = null;
        byte[] byteArray$default = StringsKt.toByteArray$default("--" + boundary + ServerSentEventKt.END_OF_LINE, null, 1, null);
        this.BOUNDARY_BYTES = byteArray$default;
        byte[] byteArray$default2 = StringsKt.toByteArray$default("--" + boundary + "--\r\n", null, 1, null);
        this.LAST_BOUNDARY_BYTES = byteArray$default2;
        this.BODY_OVERHEAD_SIZE = byteArray$default2.length;
        bArr = FormDataContentKt.RN_BYTES;
        this.PART_OVERHEAD_SIZE = (bArr.length * 2) + byteArray$default.length;
        List<? extends PartData> list = parts;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        for (PartData partData : list) {
            Sink BytePacketBuilder = BytePacketBuilderKt.BytePacketBuilder();
            for (Map.Entry<String, List<String>> entry : partData.getHeaders().entries()) {
                StringsKt.writeText$default(BytePacketBuilder, entry.getKey() + ": " + CollectionsKt.joinToString$default(entry.getValue(), "; ", null, null, 0, null, null, 62, null), 0, 0, (Charset) null, 14, (Object) null);
                bArr3 = FormDataContentKt.RN_BYTES;
                BytePacketBuilderKt.writeFully$default(BytePacketBuilder, bArr3, 0, 0, 6, null);
            }
            String str = partData.getHeaders().get(HttpHeaders.INSTANCE.getContentLength());
            Long valueOf = str != null ? Long.valueOf(Long.parseLong(str)) : null;
            if (partData instanceof PartData.FileItem) {
                channelPart = new PreparedPart.ChannelPart(SourcesKt.readByteArray(BytePacketBuilderKt.build(BytePacketBuilder)), ((PartData.FileItem) partData).getProvider(), valueOf != null ? Long.valueOf(valueOf.longValue() + this.PART_OVERHEAD_SIZE + r6.length) : null);
            } else if (partData instanceof PartData.BinaryItem) {
                channelPart = new PreparedPart.InputPart(SourcesKt.readByteArray(BytePacketBuilderKt.build(BytePacketBuilder)), ((PartData.BinaryItem) partData).getProvider(), valueOf != null ? Long.valueOf(valueOf.longValue() + this.PART_OVERHEAD_SIZE + r6.length) : null);
            } else if (!(partData instanceof PartData.FormItem)) {
                if (!(partData instanceof PartData.BinaryChannelItem)) {
                    throw new NoWhenBranchMatchedException();
                }
                channelPart = new PreparedPart.ChannelPart(SourcesKt.readByteArray(BytePacketBuilderKt.build(BytePacketBuilder)), ((PartData.BinaryChannelItem) partData).getProvider(), valueOf != null ? Long.valueOf(valueOf.longValue() + this.PART_OVERHEAD_SIZE + r6.length) : null);
            } else {
                Buffer buffer = new Buffer();
                StringsKt.writeText$default(buffer, ((PartData.FormItem) partData).getValue(), 0, 0, (Charset) null, 14, (Object) null);
                final byte[] readByteArray = SourcesKt.readByteArray(buffer);
                Function0 function0 = new Function0() { // from class: io.ktor.client.request.forms.MultiPartFormDataContent$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        Source rawParts$lambda$3$lambda$2;
                        rawParts$lambda$3$lambda$2 = MultiPartFormDataContent.rawParts$lambda$3$lambda$2(readByteArray);
                        return rawParts$lambda$3$lambda$2;
                    }
                };
                if (valueOf == null) {
                    StringsKt.writeText$default(BytePacketBuilder, HttpHeaders.INSTANCE.getContentLength() + ": " + readByteArray.length, 0, 0, (Charset) null, 14, (Object) null);
                    bArr2 = FormDataContentKt.RN_BYTES;
                    BytePacketBuilderKt.writeFully$default(BytePacketBuilder, bArr2, 0, 0, 6, null);
                }
                channelPart = new PreparedPart.InputPart(SourcesKt.readByteArray(BytePacketBuilderKt.build(BytePacketBuilder)), function0, Long.valueOf(readByteArray.length + this.PART_OVERHEAD_SIZE + r4.length));
            }
            arrayList.add(channelPart);
        }
        ArrayList arrayList2 = arrayList;
        this.rawParts = arrayList2;
        Long l2 = 0L;
        Iterator it = arrayList2.iterator();
        while (true) {
            if (!it.hasNext()) {
                l = l2;
                break;
            }
            Long size = ((PreparedPart) it.next()).getSize();
            if (size == null) {
                break;
            } else {
                l2 = l2 != null ? Long.valueOf(l2.longValue() + size.longValue()) : null;
            }
        }
        this.contentLength = l != null ? Long.valueOf(l.longValue() + this.BODY_OVERHEAD_SIZE) : l;
    }

    @Override // io.ktor.http.content.OutgoingContent
    public Long getContentLength() {
        return this.contentLength;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:0|1|(2:3|(4:5|6|7|8))|133|6|7|8|(3:(1:79)|(1:84)|(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x00b7, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x0068, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x0069, code lost:
    
        r7 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x01e2, code lost:
    
        if (r4.flushAndClose(r2) != r3) goto L115;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x01fd, code lost:
    
        if (r7.flushAndClose(r2) != r3) goto L115;
     */
    /* JADX WARN: Not initialized variable reg: 6, insn: 0x0069: MOVE (r7 I:??[OBJECT, ARRAY]) = (r6 I:??[OBJECT, ARRAY]), block:B:132:0x0069 */
    /* JADX WARN: Removed duplicated region for block: B:105:0x01c2 A[Catch: all -> 0x01e5, TRY_ENTER, TRY_LEAVE, TryCatch #3 {all -> 0x01e5, blocks: (B:41:0x00c6, B:43:0x00cc, B:105:0x01c2), top: B:40:0x00c6 }] */
    /* JADX WARN: Removed duplicated region for block: B:111:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00cc A[Catch: all -> 0x01e5, TRY_LEAVE, TryCatch #3 {all -> 0x01e5, blocks: (B:41:0x00c6, B:43:0x00cc, B:105:0x01c2), top: B:40:0x00c6 }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0133 A[Catch: all -> 0x00b7, TRY_LEAVE, TryCatch #4 {all -> 0x00b7, blocks: (B:57:0x012f, B:59:0x0133, B:64:0x0156, B:87:0x0167, B:89:0x016b, B:93:0x01ac, B:94:0x01b1, B:117:0x008f, B:119:0x00a0, B:121:0x00b1), top: B:7:0x0026 }] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0167 A[Catch: all -> 0x00b7, TRY_ENTER, TryCatch #4 {all -> 0x00b7, blocks: (B:57:0x012f, B:59:0x0133, B:64:0x0156, B:87:0x0167, B:89:0x016b, B:93:0x01ac, B:94:0x01b1, B:117:0x008f, B:119:0x00a0, B:121:0x00b1), top: B:7:0x0026 }] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0029  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:69:0x01a5 -> B:38:0x0058). Please report as a decompilation issue!!! */
    @Override // io.ktor.http.content.OutgoingContent.WriteChannelContent
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object writeTo(ByteWriteChannel byteWriteChannel, Continuation<? super Unit> continuation) {
        MultiPartFormDataContent$writeTo$1 multiPartFormDataContent$writeTo$1;
        ByteWriteChannel byteWriteChannel2;
        Iterator<PreparedPart> it;
        ByteWriteChannel byteWriteChannel3;
        MultiPartFormDataContent$writeTo$1 multiPartFormDataContent$writeTo$12;
        PreparedPart preparedPart;
        Iterator<PreparedPart> it2;
        MultiPartFormDataContent$writeTo$1 multiPartFormDataContent$writeTo$13;
        ByteWriteChannel byteWriteChannel4;
        Source source;
        Iterator<PreparedPart> it3;
        ByteWriteChannel byteWriteChannel5;
        MultiPartFormDataContent$writeTo$1 multiPartFormDataContent$writeTo$14;
        byte[] bArr;
        Object copyTo;
        byte[] bArr2;
        MultiPartFormDataContent$writeTo$1 multiPartFormDataContent$writeTo$15;
        ByteWriteChannel byteWriteChannel6;
        byte[] headers;
        ByteWriteChannel byteWriteChannel7;
        if (continuation instanceof MultiPartFormDataContent$writeTo$1) {
            multiPartFormDataContent$writeTo$1 = (MultiPartFormDataContent$writeTo$1) continuation;
            if ((multiPartFormDataContent$writeTo$1.label & Integer.MIN_VALUE) != 0) {
                multiPartFormDataContent$writeTo$1.label -= Integer.MIN_VALUE;
                Object obj = multiPartFormDataContent$writeTo$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                switch (multiPartFormDataContent$writeTo$1.label) {
                    case 0:
                        ResultKt.throwOnFailure(obj);
                        try {
                            it = this.rawParts.iterator();
                            byteWriteChannel3 = byteWriteChannel;
                            multiPartFormDataContent$writeTo$12 = multiPartFormDataContent$writeTo$1;
                            try {
                                if (it.hasNext()) {
                                    preparedPart = it.next();
                                    byte[] bArr3 = this.BOUNDARY_BYTES;
                                    multiPartFormDataContent$writeTo$12.L$0 = byteWriteChannel3;
                                    multiPartFormDataContent$writeTo$12.L$1 = it;
                                    multiPartFormDataContent$writeTo$12.L$2 = preparedPart;
                                    multiPartFormDataContent$writeTo$12.label = 1;
                                    if (ByteWriteChannelOperationsKt.writeFully$default(byteWriteChannel3, bArr3, 0, 0, multiPartFormDataContent$writeTo$12, 6, null) != coroutine_suspended) {
                                        byteWriteChannel4 = byteWriteChannel3;
                                        multiPartFormDataContent$writeTo$13 = multiPartFormDataContent$writeTo$12;
                                        it2 = it;
                                        try {
                                            headers = preparedPart.getHeaders();
                                            multiPartFormDataContent$writeTo$13.L$0 = byteWriteChannel4;
                                            multiPartFormDataContent$writeTo$13.L$1 = it2;
                                            multiPartFormDataContent$writeTo$13.L$2 = preparedPart;
                                            multiPartFormDataContent$writeTo$13.label = 2;
                                            if (ByteWriteChannelOperationsKt.writeFully$default(byteWriteChannel4, headers, 0, 0, multiPartFormDataContent$writeTo$13, 6, null) != coroutine_suspended) {
                                                byteWriteChannel2 = byteWriteChannel4;
                                                multiPartFormDataContent$writeTo$1 = multiPartFormDataContent$writeTo$13;
                                                try {
                                                    try {
                                                        bArr2 = FormDataContentKt.RN_BYTES;
                                                        multiPartFormDataContent$writeTo$1.L$0 = byteWriteChannel2;
                                                        multiPartFormDataContent$writeTo$1.L$1 = it2;
                                                        multiPartFormDataContent$writeTo$1.L$2 = preparedPart;
                                                        multiPartFormDataContent$writeTo$1.label = 3;
                                                        if (ByteWriteChannelOperationsKt.writeFully$default(byteWriteChannel6, bArr2, 0, 0, multiPartFormDataContent$writeTo$15, 6, null) != coroutine_suspended) {
                                                            byteWriteChannel2 = byteWriteChannel6;
                                                            multiPartFormDataContent$writeTo$1 = multiPartFormDataContent$writeTo$15;
                                                            if (preparedPart instanceof PreparedPart.InputPart) {
                                                                source = ((PreparedPart.InputPart) preparedPart).getProvider().invoke();
                                                                multiPartFormDataContent$writeTo$1.L$0 = byteWriteChannel2;
                                                                multiPartFormDataContent$writeTo$1.L$1 = it2;
                                                                multiPartFormDataContent$writeTo$1.L$2 = source;
                                                                multiPartFormDataContent$writeTo$1.label = 4;
                                                                copyTo = FormDataContentKt.copyTo(source, byteWriteChannel2, multiPartFormDataContent$writeTo$1);
                                                                if (copyTo == coroutine_suspended) {
                                                                }
                                                                Unit unit = Unit.INSTANCE;
                                                                AutoCloseableKt.closeFinally(source, null);
                                                                Unit unit2 = Unit.INSTANCE;
                                                                it3 = it2;
                                                                multiPartFormDataContent$writeTo$14 = multiPartFormDataContent$writeTo$1;
                                                                bArr = FormDataContentKt.RN_BYTES;
                                                                multiPartFormDataContent$writeTo$14.L$0 = byteWriteChannel2;
                                                                multiPartFormDataContent$writeTo$14.L$1 = it3;
                                                                multiPartFormDataContent$writeTo$14.L$2 = null;
                                                                multiPartFormDataContent$writeTo$14.label = 6;
                                                                if (ByteWriteChannelOperationsKt.writeFully$default(byteWriteChannel2, bArr, 0, 0, multiPartFormDataContent$writeTo$14, 6, null) != coroutine_suspended) {
                                                                }
                                                            } else {
                                                                if (!(preparedPart instanceof PreparedPart.ChannelPart)) {
                                                                    throw new NoWhenBranchMatchedException();
                                                                }
                                                                ByteReadChannel invoke = ((PreparedPart.ChannelPart) preparedPart).getProvider().invoke();
                                                                multiPartFormDataContent$writeTo$1.L$0 = byteWriteChannel2;
                                                                multiPartFormDataContent$writeTo$1.L$1 = it2;
                                                                multiPartFormDataContent$writeTo$1.L$2 = null;
                                                                multiPartFormDataContent$writeTo$1.label = 5;
                                                                if (ByteReadChannelOperationsKt.copyTo(invoke, byteWriteChannel2, multiPartFormDataContent$writeTo$1) != coroutine_suspended) {
                                                                    try {
                                                                        it3 = it2;
                                                                        byteWriteChannel5 = byteWriteChannel2;
                                                                        byteWriteChannel2 = byteWriteChannel5;
                                                                        bArr = FormDataContentKt.RN_BYTES;
                                                                        multiPartFormDataContent$writeTo$14.L$0 = byteWriteChannel2;
                                                                        multiPartFormDataContent$writeTo$14.L$1 = it3;
                                                                        multiPartFormDataContent$writeTo$14.L$2 = null;
                                                                        multiPartFormDataContent$writeTo$14.label = 6;
                                                                        if (ByteWriteChannelOperationsKt.writeFully$default(byteWriteChannel2, bArr, 0, 0, multiPartFormDataContent$writeTo$14, 6, null) != coroutine_suspended) {
                                                                            byteWriteChannel3 = byteWriteChannel2;
                                                                            multiPartFormDataContent$writeTo$12 = multiPartFormDataContent$writeTo$14;
                                                                            it = it3;
                                                                            if (it.hasNext()) {
                                                                                byte[] bArr4 = this.LAST_BOUNDARY_BYTES;
                                                                                multiPartFormDataContent$writeTo$12.L$0 = byteWriteChannel3;
                                                                                multiPartFormDataContent$writeTo$12.L$1 = null;
                                                                                multiPartFormDataContent$writeTo$12.label = 7;
                                                                                if (ByteWriteChannelOperationsKt.writeFully$default(byteWriteChannel3, bArr4, 0, 0, multiPartFormDataContent$writeTo$12, 6, null) != coroutine_suspended) {
                                                                                    byteWriteChannel7 = byteWriteChannel3;
                                                                                    multiPartFormDataContent$writeTo$1 = multiPartFormDataContent$writeTo$12;
                                                                                    multiPartFormDataContent$writeTo$1.L$0 = null;
                                                                                    multiPartFormDataContent$writeTo$1.label = 8;
                                                                                    break;
                                                                                }
                                                                            }
                                                                        }
                                                                    } catch (Throwable th) {
                                                                        th = th;
                                                                        multiPartFormDataContent$writeTo$1 = multiPartFormDataContent$writeTo$14;
                                                                        try {
                                                                            ByteWriteChannelOperationsKt.close(byteWriteChannel2, th);
                                                                            multiPartFormDataContent$writeTo$1.L$0 = null;
                                                                            multiPartFormDataContent$writeTo$1.L$1 = null;
                                                                            multiPartFormDataContent$writeTo$1.L$2 = null;
                                                                            multiPartFormDataContent$writeTo$1.label = 9;
                                                                            break;
                                                                        } catch (Throwable th2) {
                                                                            multiPartFormDataContent$writeTo$1.L$0 = th2;
                                                                            multiPartFormDataContent$writeTo$1.L$1 = null;
                                                                            multiPartFormDataContent$writeTo$1.L$2 = null;
                                                                            multiPartFormDataContent$writeTo$1.label = 10;
                                                                            if (byteWriteChannel2.flushAndClose(multiPartFormDataContent$writeTo$1) != coroutine_suspended) {
                                                                                throw th2;
                                                                            }
                                                                        }
                                                                    }
                                                                    multiPartFormDataContent$writeTo$14 = multiPartFormDataContent$writeTo$1;
                                                                }
                                                            }
                                                        }
                                                    } catch (Throwable th3) {
                                                        th = th3;
                                                        byteWriteChannel2 = byteWriteChannel6;
                                                        multiPartFormDataContent$writeTo$1 = multiPartFormDataContent$writeTo$15;
                                                        ByteWriteChannelOperationsKt.close(byteWriteChannel2, th);
                                                        multiPartFormDataContent$writeTo$1.L$0 = null;
                                                        multiPartFormDataContent$writeTo$1.L$1 = null;
                                                        multiPartFormDataContent$writeTo$1.L$2 = null;
                                                        multiPartFormDataContent$writeTo$1.label = 9;
                                                    }
                                                    multiPartFormDataContent$writeTo$15 = multiPartFormDataContent$writeTo$1;
                                                    byteWriteChannel6 = byteWriteChannel2;
                                                } catch (Throwable th4) {
                                                    th = th4;
                                                }
                                            }
                                        } catch (Throwable th5) {
                                            th = th5;
                                            byteWriteChannel2 = byteWriteChannel4;
                                            multiPartFormDataContent$writeTo$1 = multiPartFormDataContent$writeTo$13;
                                            ByteWriteChannelOperationsKt.close(byteWriteChannel2, th);
                                            multiPartFormDataContent$writeTo$1.L$0 = null;
                                            multiPartFormDataContent$writeTo$1.L$1 = null;
                                            multiPartFormDataContent$writeTo$1.L$2 = null;
                                            multiPartFormDataContent$writeTo$1.label = 9;
                                        }
                                    }
                                }
                            } catch (Throwable th6) {
                                th = th6;
                                byteWriteChannel2 = byteWriteChannel3;
                                multiPartFormDataContent$writeTo$1 = multiPartFormDataContent$writeTo$12;
                                ByteWriteChannelOperationsKt.close(byteWriteChannel2, th);
                                multiPartFormDataContent$writeTo$1.L$0 = null;
                                multiPartFormDataContent$writeTo$1.L$1 = null;
                                multiPartFormDataContent$writeTo$1.L$2 = null;
                                multiPartFormDataContent$writeTo$1.label = 9;
                            }
                        } catch (Throwable th7) {
                            th = th7;
                            byteWriteChannel2 = byteWriteChannel;
                            ByteWriteChannelOperationsKt.close(byteWriteChannel2, th);
                            multiPartFormDataContent$writeTo$1.L$0 = null;
                            multiPartFormDataContent$writeTo$1.L$1 = null;
                            multiPartFormDataContent$writeTo$1.L$2 = null;
                            multiPartFormDataContent$writeTo$1.label = 9;
                        }
                        return coroutine_suspended;
                    case 1:
                        preparedPart = (PreparedPart) multiPartFormDataContent$writeTo$1.L$2;
                        it2 = (Iterator) multiPartFormDataContent$writeTo$1.L$1;
                        ByteWriteChannel byteWriteChannel8 = (ByteWriteChannel) multiPartFormDataContent$writeTo$1.L$0;
                        ResultKt.throwOnFailure(obj);
                        multiPartFormDataContent$writeTo$13 = multiPartFormDataContent$writeTo$1;
                        byteWriteChannel4 = byteWriteChannel8;
                        headers = preparedPart.getHeaders();
                        multiPartFormDataContent$writeTo$13.L$0 = byteWriteChannel4;
                        multiPartFormDataContent$writeTo$13.L$1 = it2;
                        multiPartFormDataContent$writeTo$13.L$2 = preparedPart;
                        multiPartFormDataContent$writeTo$13.label = 2;
                        if (ByteWriteChannelOperationsKt.writeFully$default(byteWriteChannel4, headers, 0, 0, multiPartFormDataContent$writeTo$13, 6, null) != coroutine_suspended) {
                        }
                        return coroutine_suspended;
                    case 2:
                        preparedPart = (PreparedPart) multiPartFormDataContent$writeTo$1.L$2;
                        it2 = (Iterator) multiPartFormDataContent$writeTo$1.L$1;
                        byteWriteChannel2 = (ByteWriteChannel) multiPartFormDataContent$writeTo$1.L$0;
                        ResultKt.throwOnFailure(obj);
                        bArr2 = FormDataContentKt.RN_BYTES;
                        multiPartFormDataContent$writeTo$1.L$0 = byteWriteChannel2;
                        multiPartFormDataContent$writeTo$1.L$1 = it2;
                        multiPartFormDataContent$writeTo$1.L$2 = preparedPart;
                        multiPartFormDataContent$writeTo$1.label = 3;
                        multiPartFormDataContent$writeTo$15 = multiPartFormDataContent$writeTo$1;
                        byteWriteChannel6 = byteWriteChannel2;
                        if (ByteWriteChannelOperationsKt.writeFully$default(byteWriteChannel6, bArr2, 0, 0, multiPartFormDataContent$writeTo$15, 6, null) != coroutine_suspended) {
                        }
                        return coroutine_suspended;
                    case 3:
                        preparedPart = (PreparedPart) multiPartFormDataContent$writeTo$1.L$2;
                        it2 = (Iterator) multiPartFormDataContent$writeTo$1.L$1;
                        byteWriteChannel2 = (ByteWriteChannel) multiPartFormDataContent$writeTo$1.L$0;
                        ResultKt.throwOnFailure(obj);
                        if (preparedPart instanceof PreparedPart.InputPart) {
                        }
                        return coroutine_suspended;
                    case 4:
                        source = (AutoCloseable) multiPartFormDataContent$writeTo$1.L$2;
                        it2 = (Iterator) multiPartFormDataContent$writeTo$1.L$1;
                        byteWriteChannel2 = (ByteWriteChannel) multiPartFormDataContent$writeTo$1.L$0;
                        try {
                            ResultKt.throwOnFailure(obj);
                            Unit unit3 = Unit.INSTANCE;
                            AutoCloseableKt.closeFinally(source, null);
                            Unit unit22 = Unit.INSTANCE;
                            it3 = it2;
                            multiPartFormDataContent$writeTo$14 = multiPartFormDataContent$writeTo$1;
                            bArr = FormDataContentKt.RN_BYTES;
                            multiPartFormDataContent$writeTo$14.L$0 = byteWriteChannel2;
                            multiPartFormDataContent$writeTo$14.L$1 = it3;
                            multiPartFormDataContent$writeTo$14.L$2 = null;
                            multiPartFormDataContent$writeTo$14.label = 6;
                            if (ByteWriteChannelOperationsKt.writeFully$default(byteWriteChannel2, bArr, 0, 0, multiPartFormDataContent$writeTo$14, 6, null) != coroutine_suspended) {
                            }
                            return coroutine_suspended;
                        } catch (Throwable th8) {
                            AutoCloseable autoCloseable = source;
                            MultiPartFormDataContent$writeTo$1 multiPartFormDataContent$writeTo$16 = multiPartFormDataContent$writeTo$1;
                            try {
                                throw th8;
                            } catch (Throwable th9) {
                                try {
                                    AutoCloseableKt.closeFinally(autoCloseable, th8);
                                    throw th9;
                                } catch (Throwable th10) {
                                    th = th10;
                                    multiPartFormDataContent$writeTo$1 = multiPartFormDataContent$writeTo$16;
                                    ByteWriteChannelOperationsKt.close(byteWriteChannel2, th);
                                    multiPartFormDataContent$writeTo$1.L$0 = null;
                                    multiPartFormDataContent$writeTo$1.L$1 = null;
                                    multiPartFormDataContent$writeTo$1.L$2 = null;
                                    multiPartFormDataContent$writeTo$1.label = 9;
                                    break;
                                }
                            }
                        }
                        break;
                    case 5:
                        it3 = (Iterator) multiPartFormDataContent$writeTo$1.L$1;
                        byteWriteChannel5 = (ByteWriteChannel) multiPartFormDataContent$writeTo$1.L$0;
                        ResultKt.throwOnFailure(obj);
                        byteWriteChannel2 = byteWriteChannel5;
                        multiPartFormDataContent$writeTo$14 = multiPartFormDataContent$writeTo$1;
                        bArr = FormDataContentKt.RN_BYTES;
                        multiPartFormDataContent$writeTo$14.L$0 = byteWriteChannel2;
                        multiPartFormDataContent$writeTo$14.L$1 = it3;
                        multiPartFormDataContent$writeTo$14.L$2 = null;
                        multiPartFormDataContent$writeTo$14.label = 6;
                        if (ByteWriteChannelOperationsKt.writeFully$default(byteWriteChannel2, bArr, 0, 0, multiPartFormDataContent$writeTo$14, 6, null) != coroutine_suspended) {
                        }
                        return coroutine_suspended;
                    case 6:
                        it3 = (Iterator) multiPartFormDataContent$writeTo$1.L$1;
                        byteWriteChannel3 = (ByteWriteChannel) multiPartFormDataContent$writeTo$1.L$0;
                        ResultKt.throwOnFailure(obj);
                        multiPartFormDataContent$writeTo$12 = multiPartFormDataContent$writeTo$1;
                        it = it3;
                        if (it.hasNext()) {
                        }
                        return coroutine_suspended;
                    case 7:
                        byteWriteChannel7 = (ByteWriteChannel) multiPartFormDataContent$writeTo$1.L$0;
                        try {
                            ResultKt.throwOnFailure(obj);
                            multiPartFormDataContent$writeTo$1.L$0 = null;
                            multiPartFormDataContent$writeTo$1.label = 8;
                            break;
                        } catch (Throwable th11) {
                            th = th11;
                            byteWriteChannel2 = byteWriteChannel7;
                            ByteWriteChannelOperationsKt.close(byteWriteChannel2, th);
                            multiPartFormDataContent$writeTo$1.L$0 = null;
                            multiPartFormDataContent$writeTo$1.L$1 = null;
                            multiPartFormDataContent$writeTo$1.L$2 = null;
                            multiPartFormDataContent$writeTo$1.label = 9;
                            break;
                        }
                    case 8:
                    case 9:
                        ResultKt.throwOnFailure(obj);
                        return Unit.INSTANCE;
                    case 10:
                        Throwable th12 = (Throwable) multiPartFormDataContent$writeTo$1.L$0;
                        ResultKt.throwOnFailure(obj);
                        throw th12;
                    default:
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }
        multiPartFormDataContent$writeTo$1 = new MultiPartFormDataContent$writeTo$1(this, continuation);
        Object obj2 = multiPartFormDataContent$writeTo$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (multiPartFormDataContent$writeTo$1.label) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Source rawParts$lambda$3$lambda$2(byte[] bArr) {
        Buffer buffer = new Buffer();
        BytePacketBuilderKt.writeFully$default(buffer, bArr, 0, 0, 6, null);
        return buffer;
    }
}
