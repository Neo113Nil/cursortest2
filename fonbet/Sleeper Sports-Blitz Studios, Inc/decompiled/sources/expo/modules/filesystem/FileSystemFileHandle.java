package expo.modules.filesystem;

import android.content.ContentResolver;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import androidx.collection.SieveCacheKt;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.appsflyer.AppsFlyerProperties;
import com.socure.docv.capturesdk.common.analytics.AnalyticsConstantsKt;
import expo.modules.kotlin.exception.Exceptions;
import expo.modules.kotlin.sharedobjects.SharedRef;
import io.sentry.SentryEnvelopeItemHeader;
import io.sentry.rrweb.RRWebVideoEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

/* compiled from: FileSystemFileHandle.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\t\n\u0002\b\f\u0018\u0000 \u001d2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00060\u0003j\u0002`\u0004:\u0001\u001dB\u0019\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\b\u0010\u000b\u001a\u00020\fH\u0002J\b\u0010\r\u001a\u00020\fH\u0016J\b\u0010\u000e\u001a\u00020\fH\u0016J\u000e\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012J\u000e\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\u0010R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0002X\u0082\u0004¢\u0006\u0002\n\u0000R(\u0010\u0016\u001a\u0004\u0018\u00010\u00122\b\u0010\u0015\u001a\u0004\u0018\u00010\u00128F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u0013\u0010\u001b\u001a\u0004\u0018\u00010\u00128F¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u0018¨\u0006\u001e"}, d2 = {"Lexpo/modules/filesystem/FileSystemFileHandle;", "Lexpo/modules/kotlin/sharedobjects/SharedRef;", "Ljava/nio/channels/FileChannel;", "Ljava/lang/AutoCloseable;", "Lkotlin/AutoCloseable;", AppsFlyerProperties.CHANNEL, "mode", "Lexpo/modules/filesystem/FileMode;", "<init>", "(Ljava/nio/channels/FileChannel;Lexpo/modules/filesystem/FileMode;)V", "fileChannel", "ensureIsOpen", "", "sharedObjectDidRelease", AnalyticsConstantsKt.CLOSE_BUTTON, "read", "", SentryEnvelopeItemHeader.JsonKeys.LENGTH, "", "write", "data", "value", TypedValues.CycleType.S_WAVE_OFFSET, "getOffset", "()Ljava/lang/Long;", "setOffset", "(Ljava/lang/Long;)V", RRWebVideoEvent.JsonKeys.SIZE, "getSize", "Companion", "expo-file-system_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class FileSystemFileHandle extends SharedRef<FileChannel> implements AutoCloseable {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final FileChannel fileChannel;
    private final FileMode mode;

    public /* synthetic */ FileSystemFileHandle(FileChannel fileChannel, FileMode fileMode, DefaultConstructorMarker defaultConstructorMarker) {
        this(fileChannel, fileMode);
    }

    /* compiled from: FileSystemFileHandle.kt */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tJ\u001e\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u000e¨\u0006\u000f"}, d2 = {"Lexpo/modules/filesystem/FileSystemFileHandle$Companion;", "", "<init>", "()V", "forJavaFile", "Lexpo/modules/filesystem/FileSystemFileHandle;", "file", "Ljava/io/File;", "mode", "Lexpo/modules/filesystem/FileMode;", "forContentURI", "uri", "Landroid/net/Uri;", "contentResolver", "Landroid/content/ContentResolver;", "expo-file-system_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {

        /* compiled from: FileSystemFileHandle.kt */
        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[FileMode.values().length];
                try {
                    iArr[FileMode.APPEND.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[FileMode.TRUNCATE.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[FileMode.READ.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[FileMode.WRITE.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final FileSystemFileHandle forJavaFile(File file, FileMode mode) {
            Intrinsics.checkNotNullParameter(file, "file");
            Intrinsics.checkNotNullParameter(mode, "mode");
            FileChannel channel = new RandomAccessFile(file, mode.getRafMode()).getChannel();
            int i = WhenMappings.$EnumSwitchMapping$0[mode.ordinal()];
            if (i == 1) {
                channel.position(channel.size());
            } else if (i != 2) {
                Unit unit = Unit.INSTANCE;
            } else {
                channel.truncate(0L);
            }
            Intrinsics.checkNotNull(channel);
            return new FileSystemFileHandle(channel, mode, null);
        }

        public final FileSystemFileHandle forContentURI(Uri uri, FileMode mode, ContentResolver contentResolver) {
            FileChannel channel;
            Intrinsics.checkNotNullParameter(uri, "uri");
            Intrinsics.checkNotNullParameter(mode, "mode");
            Intrinsics.checkNotNullParameter(contentResolver, "contentResolver");
            ParcelFileDescriptor openFileDescriptor = contentResolver.openFileDescriptor(uri, mode.getDescriptor());
            DefaultConstructorMarker defaultConstructorMarker = null;
            if (openFileDescriptor == null) {
                throw new Exceptions.IllegalStateException("Could not open file descriptor for uri: " + uri, null, 2, null);
            }
            int i = WhenMappings.$EnumSwitchMapping$0[mode.ordinal()];
            if (i != 1 && i != 2) {
                if (i == 3) {
                    channel = new FileInputStream(openFileDescriptor.getFileDescriptor()).getChannel();
                    Intrinsics.checkNotNull(channel);
                    return new FileSystemFileHandle(channel, mode, defaultConstructorMarker);
                }
                if (i != 4) {
                    throw new Exceptions.IllegalArgument("Unsupported file mode: '" + mode + "'", null, 2, null);
                }
            }
            channel = new FileOutputStream(openFileDescriptor.getFileDescriptor()).getChannel();
            Intrinsics.checkNotNull(channel);
            return new FileSystemFileHandle(channel, mode, defaultConstructorMarker);
        }
    }

    private FileSystemFileHandle(FileChannel fileChannel, FileMode fileMode) {
        super(fileChannel, null, 2, null);
        this.mode = fileMode;
        this.fileChannel = getRef();
    }

    private final void ensureIsOpen() {
        if (!this.fileChannel.isOpen()) {
            throw new UnableToReadHandleException("file handle is closed");
        }
    }

    @Override // expo.modules.kotlin.sharedobjects.SharedObject
    public void sharedObjectDidRelease() {
        close();
    }

    @Override // java.lang.AutoCloseable
    public void close() {
        this.fileChannel.close();
    }

    public final byte[] read(long length) {
        ensureIsOpen();
        this.mode.ensureCanRead();
        try {
            int coerceAtMost = (int) RangesKt.coerceAtMost(Math.min(length, this.fileChannel.size() - this.fileChannel.position()), SieveCacheKt.NodeLinkMask);
            int i = 0;
            if (coerceAtMost <= 0) {
                return new byte[0];
            }
            ByteBuffer allocate = ByteBuffer.allocate(coerceAtMost);
            while (i < coerceAtMost) {
                int read = this.fileChannel.read(allocate);
                if (read == -1) {
                    break;
                }
                i += read;
            }
            byte[] array = allocate.array();
            Intrinsics.checkNotNullExpressionValue(array, "array(...)");
            return array;
        } catch (Exception e) {
            String message = e.getMessage();
            if (message == null) {
                message = "unknown error";
            }
            throw new UnableToReadHandleException(message);
        }
    }

    public final void write(byte[] data) {
        Intrinsics.checkNotNullParameter(data, "data");
        ensureIsOpen();
        this.mode.ensureCanWrite();
        try {
            ByteBuffer wrap = ByteBuffer.wrap(data);
            while (wrap.hasRemaining()) {
                this.fileChannel.write(wrap);
            }
        } catch (Exception e) {
            String message = e.getMessage();
            if (message == null) {
                message = "unknown error";
            }
            throw new UnableToWriteHandleException(message);
        }
    }

    public final Long getOffset() {
        try {
            return Long.valueOf(this.fileChannel.position());
        } catch (Exception unused) {
            return null;
        }
    }

    public final void setOffset(Long l) {
        if (l == null) {
            return;
        }
        this.fileChannel.position(l.longValue());
    }

    public final Long getSize() {
        try {
            return Long.valueOf(this.fileChannel.size());
        } catch (Exception unused) {
            return null;
        }
    }
}
