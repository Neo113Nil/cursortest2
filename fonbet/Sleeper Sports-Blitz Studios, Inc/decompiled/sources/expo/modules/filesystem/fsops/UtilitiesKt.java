package expo.modules.filesystem.fsops;

import android.os.ParcelFileDescriptor;
import com.facebook.react.uimanager.ViewProps;
import com.nimbusds.jose.jwk.JWKParameterNames;
import com.socure.docv.capturesdk.common.utils.ApiConstant;
import expo.modules.filesystem.unifiedfile.UnifiedFileInterface;
import expo.modules.kotlin.exception.Exceptions;
import io.sentry.rrweb.RRWebVideoEvent;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.channels.FileChannel;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.io.ByteStreamsKt;
import kotlin.io.CloseableKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScopeKt;

/* compiled from: Utilities.kt */
@Metadata(d1 = {"\u00002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\u001a\u0018\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H\u0000\u001a\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H\u0000\u001aL\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\t26\u0010\n\u001a2\u0012\u0013\u0012\u00110\t¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u000e\u0012\u0013\u0012\u00110\t¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u000f\u0012\u0004\u0012\u00020\t0\u000bH\u0080\bø\u0001\u0000\u001a\u0018\u0010\u0010\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H\u0000\u001a\u0018\u0010\u0011\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H\u0000\u001aD\u0010\u0012\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\u001a\b\u0002\u0010\u0013\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u000b2\b\b\u0002\u0010\u0014\u001a\u00020\u0015H\u0080@¢\u0006\u0002\u0010\u0016\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0017"}, d2 = {"copyFileViaStream", "", "source", "Lexpo/modules/filesystem/unifiedfile/UnifiedFileInterface;", "dest", "copyFileViaChannel", "", "copyChannelContents", RRWebVideoEvent.JsonKeys.SIZE, "", "transferTo", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", ViewProps.POSITION, "count", "copyFileWithChannelFallback", "copyDirectoryViaStream", "copyDirectoryParallel", "copyFile", "parallelism", "", "(Lexpo/modules/filesystem/unifiedfile/UnifiedFileInterface;Lexpo/modules/filesystem/unifiedfile/UnifiedFileInterface;Lkotlin/jvm/functions/Function2;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "expo-file-system_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class UtilitiesKt {
    public static final void copyFileViaStream(UnifiedFileInterface source, UnifiedFileInterface dest) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(dest, "dest");
        if (!source.isFile()) {
            throw new IllegalArgumentException("Source must be a file".toString());
        }
        OutputStream inputStream = source.inputStream();
        try {
            InputStream inputStream2 = inputStream;
            inputStream = UnifiedFileInterface.DefaultImpls.outputStream$default(dest, false, 1, null);
            try {
                ByteStreamsKt.copyTo(inputStream2, inputStream, 65536);
                CloseableKt.closeFinally(inputStream, null);
                CloseableKt.closeFinally(inputStream, null);
            } finally {
            }
        } finally {
        }
    }

    public static final boolean copyFileViaChannel(UnifiedFileInterface source, UnifiedFileInterface dest) {
        Object m13470constructorimpl;
        boolean z;
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(dest, "dest");
        ParcelFileDescriptor openFileDescriptor = source.openFileDescriptor(JWKParameterNames.RSA_OTHER_PRIMES__PRIME_FACTOR);
        if (openFileDescriptor == null) {
            return false;
        }
        FileChannel fileChannel = openFileDescriptor;
        try {
            ParcelFileDescriptor parcelFileDescriptor = fileChannel;
            ParcelFileDescriptor openFileDescriptor2 = dest.openFileDescriptor("w");
            if (openFileDescriptor2 == null) {
                CloseableKt.closeFinally(fileChannel, null);
                return false;
            }
            fileChannel = openFileDescriptor2;
            try {
                ParcelFileDescriptor parcelFileDescriptor2 = fileChannel;
                try {
                    Result.Companion companion = Result.INSTANCE;
                    fileChannel = new FileInputStream(parcelFileDescriptor.getFileDescriptor()).getChannel();
                } catch (Throwable th) {
                    Result.Companion companion2 = Result.INSTANCE;
                    m13470constructorimpl = Result.m13470constructorimpl(ResultKt.createFailure(th));
                }
                try {
                    FileChannel fileChannel2 = fileChannel;
                    fileChannel = new FileOutputStream(parcelFileDescriptor2.getFileDescriptor()).getChannel();
                    try {
                        FileChannel fileChannel3 = fileChannel;
                        long size = fileChannel2.size();
                        long j = 0;
                        while (true) {
                            if (j >= size) {
                                z = true;
                                break;
                            }
                            long transferTo = fileChannel2.transferTo(j, size - j, fileChannel3);
                            if (transferTo <= 0) {
                                z = false;
                                break;
                            }
                            j += transferTo;
                        }
                        CloseableKt.closeFinally(fileChannel, null);
                        CloseableKt.closeFinally(fileChannel, null);
                        m13470constructorimpl = Result.m13470constructorimpl(Boolean.valueOf(z));
                        if (Result.m13473exceptionOrNullimpl(m13470constructorimpl) != null) {
                            m13470constructorimpl = false;
                        }
                        boolean booleanValue = ((Boolean) m13470constructorimpl).booleanValue();
                        CloseableKt.closeFinally(fileChannel, null);
                        CloseableKt.closeFinally(fileChannel, null);
                        return booleanValue;
                    } finally {
                    }
                } finally {
                }
            } finally {
            }
        } finally {
        }
    }

    public static final boolean copyChannelContents(long j, Function2<? super Long, ? super Long, Long> transferTo) {
        Intrinsics.checkNotNullParameter(transferTo, "transferTo");
        long j2 = 0;
        while (j2 < j) {
            long longValue = transferTo.invoke(Long.valueOf(j2), Long.valueOf(j - j2)).longValue();
            if (longValue <= 0) {
                return false;
            }
            j2 += longValue;
        }
        return true;
    }

    public static final void copyFileWithChannelFallback(UnifiedFileInterface source, UnifiedFileInterface dest) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(dest, "dest");
        if (copyFileViaChannel(source, dest)) {
            return;
        }
        copyFileViaStream(source, dest);
    }

    public static final void copyDirectoryViaStream(UnifiedFileInterface source, UnifiedFileInterface dest) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(dest, "dest");
        if (!source.isDirectory()) {
            throw new IllegalArgumentException("Source must be directory".toString());
        }
        if (!dest.isDirectory()) {
            throw new IllegalArgumentException("Dest must be directory".toString());
        }
        for (UnifiedFileInterface unifiedFileInterface : source.listFilesAsUnified()) {
            String fileName = unifiedFileInterface.getFileName();
            if (fileName == null) {
                throw new Exceptions.IllegalArgument("Child has no file name", null, 2, null);
            }
            if (unifiedFileInterface.isDirectory()) {
                UnifiedFileInterface createDirectory = dest.createDirectory(fileName);
                if (createDirectory == null) {
                    throw new Exceptions.IllegalStateException("Failed to create directory: " + fileName, null, 2, null);
                }
                copyDirectoryViaStream(unifiedFileInterface, createDirectory);
            } else {
                String type = unifiedFileInterface.getType();
                if (type == null) {
                    type = ApiConstant.ALL_MEDIA_TYPE;
                }
                UnifiedFileInterface createFile = dest.createFile(type, fileName);
                if (createFile == null) {
                    throw new Exceptions.IllegalStateException("Failed to create file: " + fileName, null, 2, null);
                }
                copyFileWithChannelFallback(unifiedFileInterface, createFile);
            }
        }
    }

    public static /* synthetic */ Object copyDirectoryParallel$default(UnifiedFileInterface unifiedFileInterface, UnifiedFileInterface unifiedFileInterface2, Function2 function2, int i, Continuation continuation, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            function2 = UtilitiesKt$copyDirectoryParallel$2.INSTANCE;
        }
        if ((i2 & 8) != 0) {
            i = 4;
        }
        return copyDirectoryParallel(unifiedFileInterface, unifiedFileInterface2, function2, i, continuation);
    }

    public static final Object copyDirectoryParallel(UnifiedFileInterface unifiedFileInterface, UnifiedFileInterface unifiedFileInterface2, Function2<? super UnifiedFileInterface, ? super UnifiedFileInterface, Unit> function2, int i, Continuation<? super Unit> continuation) {
        Object coroutineScope = CoroutineScopeKt.coroutineScope(new UtilitiesKt$copyDirectoryParallel$3(unifiedFileInterface, unifiedFileInterface2, i, function2, null), continuation);
        return coroutineScope == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? coroutineScope : Unit.INSTANCE;
    }
}
