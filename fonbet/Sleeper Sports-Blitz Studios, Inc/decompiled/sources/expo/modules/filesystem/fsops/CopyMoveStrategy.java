package expo.modules.filesystem.fsops;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.provider.DocumentsContract;
import androidx.documentfile.provider.DocumentFile;
import expo.modules.filesystem.CopyOrMoveDirectoryToFileException;
import expo.modules.filesystem.DestinationAlreadyExistsException;
import expo.modules.filesystem.DestinationDoesNotExistException;
import expo.modules.filesystem.UnableToMoveException;
import expo.modules.filesystem.fsops.DestinationSink;
import expo.modules.filesystem.unifiedfile.AssetFile;
import expo.modules.filesystem.unifiedfile.ContentProviderFile;
import expo.modules.filesystem.unifiedfile.JavaFile;
import expo.modules.filesystem.unifiedfile.SAFDocumentFile;
import expo.modules.filesystem.unifiedfile.UnifiedFileInterface;
import expo.modules.kotlin.exception.Exceptions;
import java.io.File;
import java.nio.file.Path;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CopyMoveStrategy.kt */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0004\u0015\u0016\u0017\u0018B\u0011\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0016\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0096@¢\u0006\u0002\u0010\fJ\u0016\u0010\r\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\u000bH\u0096@¢\u0006\u0002\u0010\fJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0010\u001a\u00020\u0011H\u0014J\u001d\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000bH ¢\u0006\u0002\b\u0014R\u0014\u0010\u0002\u001a\u00020\u0003X\u0094\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u0082\u0001\u0004\u0019\u001a\u001b\u001c¨\u0006\u001d"}, d2 = {"Lexpo/modules/filesystem/fsops/CopyMoveStrategy;", "", "file", "Lexpo/modules/filesystem/unifiedfile/UnifiedFileInterface;", "<init>", "(Lexpo/modules/filesystem/unifiedfile/UnifiedFileInterface;)V", "getFile", "()Lexpo/modules/filesystem/unifiedfile/UnifiedFileInterface;", "copyTo", "", "spec", "Lexpo/modules/filesystem/fsops/DestinationSpec;", "(Lexpo/modules/filesystem/fsops/DestinationSpec;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "moveTo", "Landroid/net/Uri;", "tryNativeMove", "resolved", "Lexpo/modules/filesystem/fsops/DestinationSink;", "prepareAsDestination", "source", "prepareAsDestination$expo_file_system_release", "LocalFile", "SAF", "ContentProvider", "Asset", "Lexpo/modules/filesystem/fsops/CopyMoveStrategy$Asset;", "Lexpo/modules/filesystem/fsops/CopyMoveStrategy$ContentProvider;", "Lexpo/modules/filesystem/fsops/CopyMoveStrategy$LocalFile;", "Lexpo/modules/filesystem/fsops/CopyMoveStrategy$SAF;", "expo-file-system_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public abstract class CopyMoveStrategy {
    private final UnifiedFileInterface file;

    public /* synthetic */ CopyMoveStrategy(UnifiedFileInterface unifiedFileInterface, DefaultConstructorMarker defaultConstructorMarker) {
        this(unifiedFileInterface);
    }

    public Object copyTo(DestinationSpec destinationSpec, Continuation<? super Unit> continuation) {
        return copyTo$suspendImpl(this, destinationSpec, continuation);
    }

    public Object moveTo(DestinationSpec destinationSpec, Continuation<? super Uri> continuation) {
        return moveTo$suspendImpl(this, destinationSpec, continuation);
    }

    public abstract DestinationSink prepareAsDestination$expo_file_system_release(UnifiedFileInterface source, DestinationSpec spec);

    protected Uri tryNativeMove(DestinationSink resolved) {
        Intrinsics.checkNotNullParameter(resolved, "resolved");
        return null;
    }

    private CopyMoveStrategy(UnifiedFileInterface unifiedFileInterface) {
        this.file = unifiedFileInterface;
    }

    protected UnifiedFileInterface getFile() {
        return this.file;
    }

    static /* synthetic */ Object copyTo$suspendImpl(CopyMoveStrategy copyMoveStrategy, DestinationSpec destinationSpec, Continuation<? super Unit> continuation) {
        Object receiveFrom = destinationSpec.resolve$expo_file_system_release(copyMoveStrategy.getFile()).receiveFrom(copyMoveStrategy.getFile(), continuation);
        return receiveFrom == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? receiveFrom : Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0062 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static /* synthetic */ Object moveTo$suspendImpl(CopyMoveStrategy copyMoveStrategy, DestinationSpec destinationSpec, Continuation<? super Uri> continuation) {
        CopyMoveStrategy$moveTo$1 copyMoveStrategy$moveTo$1;
        int i;
        if (continuation instanceof CopyMoveStrategy$moveTo$1) {
            copyMoveStrategy$moveTo$1 = (CopyMoveStrategy$moveTo$1) continuation;
            if ((copyMoveStrategy$moveTo$1.label & Integer.MIN_VALUE) != 0) {
                copyMoveStrategy$moveTo$1.label -= Integer.MIN_VALUE;
                Object obj = copyMoveStrategy$moveTo$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = copyMoveStrategy$moveTo$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    DestinationSink resolve$expo_file_system_release = destinationSpec.resolve$expo_file_system_release(copyMoveStrategy.getFile());
                    Uri tryNativeMove = copyMoveStrategy.tryNativeMove(resolve$expo_file_system_release);
                    if (tryNativeMove != null) {
                        return tryNativeMove;
                    }
                    UnifiedFileInterface file = copyMoveStrategy.getFile();
                    copyMoveStrategy$moveTo$1.L$0 = copyMoveStrategy;
                    copyMoveStrategy$moveTo$1.label = 1;
                    obj = resolve$expo_file_system_release.receiveFrom(file, copyMoveStrategy$moveTo$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    copyMoveStrategy = (CopyMoveStrategy) copyMoveStrategy$moveTo$1.L$0;
                    ResultKt.throwOnFailure(obj);
                }
                Uri uri = (Uri) obj;
                if (copyMoveStrategy.getFile().deleteRecursively()) {
                    throw new UnableToMoveException("Failed to delete source after move");
                }
                return uri;
            }
        }
        copyMoveStrategy$moveTo$1 = new CopyMoveStrategy$moveTo$1(copyMoveStrategy, continuation);
        Object obj2 = copyMoveStrategy$moveTo$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = copyMoveStrategy$moveTo$1.label;
        if (i != 0) {
        }
        Uri uri2 = (Uri) obj2;
        if (copyMoveStrategy.getFile().deleteRecursively()) {
        }
    }

    /* compiled from: CopyMoveStrategy.kt */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0010¢\u0006\u0002\b\u000eJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0011\u001a\u00020\tH\u0014R\u0014\u0010\u0002\u001a\u00020\u0003X\u0094\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lexpo/modules/filesystem/fsops/CopyMoveStrategy$LocalFile;", "Lexpo/modules/filesystem/fsops/CopyMoveStrategy;", "file", "Lexpo/modules/filesystem/unifiedfile/JavaFile;", "<init>", "(Lexpo/modules/filesystem/unifiedfile/JavaFile;)V", "getFile", "()Lexpo/modules/filesystem/unifiedfile/JavaFile;", "prepareAsDestination", "Lexpo/modules/filesystem/fsops/DestinationSink;", "source", "Lexpo/modules/filesystem/unifiedfile/UnifiedFileInterface;", "spec", "Lexpo/modules/filesystem/fsops/DestinationSpec;", "prepareAsDestination$expo_file_system_release", "tryNativeMove", "Landroid/net/Uri;", "resolved", "expo-file-system_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class LocalFile extends CopyMoveStrategy {
        private final JavaFile file;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public LocalFile(JavaFile file) {
            super(file, null);
            Intrinsics.checkNotNullParameter(file, "file");
            this.file = file;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // expo.modules.filesystem.fsops.CopyMoveStrategy
        public JavaFile getFile() {
            return this.file;
        }

        @Override // expo.modules.filesystem.fsops.CopyMoveStrategy
        public DestinationSink prepareAsDestination$expo_file_system_release(UnifiedFileInterface source, DestinationSpec spec) {
            JavaFile file;
            Intrinsics.checkNotNullParameter(source, "source");
            Intrinsics.checkNotNullParameter(spec, "spec");
            boolean isDirectory = source.isDirectory();
            String fileName = source.getFileName();
            if (fileName == null) {
                throw new IllegalArgumentException("Source has no file name");
            }
            if (isDirectory && !spec.isDirectory()) {
                throw new CopyOrMoveDirectoryToFileException();
            }
            if (isDirectory && spec.isDirectory()) {
                if (getFile().exists()) {
                    file = new JavaFile(Uri.fromFile(new File(getFile(), fileName)));
                } else {
                    UnifiedFileInterface parentFile = getFile().getParentFile();
                    if (parentFile == null || !parentFile.exists()) {
                        throw new DestinationDoesNotExistException();
                    }
                    file = getFile();
                }
            } else if (!isDirectory && spec.isDirectory()) {
                if (!getFile().exists()) {
                    throw new DestinationDoesNotExistException();
                }
                file = new JavaFile(Uri.fromFile(new File(getFile(), fileName)));
            } else {
                UnifiedFileInterface parentFile2 = getFile().getParentFile();
                if (parentFile2 == null || !parentFile2.exists()) {
                    throw new DestinationDoesNotExistException();
                }
                file = getFile();
            }
            JavaFile javaFile = file.exists() ? file : null;
            if (javaFile != null) {
                if (!spec.getOverwrite()) {
                    throw new DestinationAlreadyExistsException();
                }
                javaFile.deleteRecursively();
            }
            return new DestinationSink.LocalFile(spec, file);
        }

        @Override // expo.modules.filesystem.fsops.CopyMoveStrategy
        protected Uri tryNativeMove(DestinationSink resolved) {
            Object m13470constructorimpl;
            Path path;
            Path path2;
            Intrinsics.checkNotNullParameter(resolved, "resolved");
            if (!(resolved instanceof DestinationSink.LocalFile)) {
                return null;
            }
            DestinationSink.LocalFile localFile = (DestinationSink.LocalFile) resolved;
            if (getFile().renameTo(localFile.getTarget())) {
                return localFile.getTarget().getUri();
            }
            if (Build.VERSION.SDK_INT < 26) {
                return null;
            }
            try {
                Result.Companion companion = Result.INSTANCE;
                LocalFile localFile2 = this;
                path = getFile().toPath();
                Intrinsics.checkNotNullExpressionValue(path, "toPath(...)");
                path2 = ((DestinationSink.LocalFile) resolved).getTarget().toPath();
                Intrinsics.checkNotNullExpressionValue(path2, "toPath(...)");
                NioUtilitiesKt.moveFileNio(path, path2);
                m13470constructorimpl = Result.m13470constructorimpl(((DestinationSink.LocalFile) resolved).getTarget().getUri());
            } catch (Throwable th) {
                Result.Companion companion2 = Result.INSTANCE;
                m13470constructorimpl = Result.m13470constructorimpl(ResultKt.createFailure(th));
            }
            return (Uri) (Result.m13476isFailureimpl(m13470constructorimpl) ? null : m13470constructorimpl);
        }
    }

    /* compiled from: CopyMoveStrategy.kt */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0010¢\u0006\u0002\b\u0010J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0013\u001a\u00020\u000bH\u0014R\u0014\u0010\u0002\u001a\u00020\u0003X\u0094\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lexpo/modules/filesystem/fsops/CopyMoveStrategy$SAF;", "Lexpo/modules/filesystem/fsops/CopyMoveStrategy;", "file", "Lexpo/modules/filesystem/unifiedfile/SAFDocumentFile;", "context", "Landroid/content/Context;", "<init>", "(Lexpo/modules/filesystem/unifiedfile/SAFDocumentFile;Landroid/content/Context;)V", "getFile", "()Lexpo/modules/filesystem/unifiedfile/SAFDocumentFile;", "prepareAsDestination", "Lexpo/modules/filesystem/fsops/DestinationSink;", "source", "Lexpo/modules/filesystem/unifiedfile/UnifiedFileInterface;", "spec", "Lexpo/modules/filesystem/fsops/DestinationSpec;", "prepareAsDestination$expo_file_system_release", "tryNativeMove", "Landroid/net/Uri;", "resolved", "expo-file-system_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class SAF extends CopyMoveStrategy {
        private final Context context;
        private final SAFDocumentFile file;

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // expo.modules.filesystem.fsops.CopyMoveStrategy
        public SAFDocumentFile getFile() {
            return this.file;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SAF(SAFDocumentFile file, Context context) {
            super(file, null);
            Intrinsics.checkNotNullParameter(file, "file");
            Intrinsics.checkNotNullParameter(context, "context");
            this.file = file;
            this.context = context;
        }

        @Override // expo.modules.filesystem.fsops.CopyMoveStrategy
        public DestinationSink prepareAsDestination$expo_file_system_release(UnifiedFileInterface source, DestinationSpec spec) {
            Intrinsics.checkNotNullParameter(source, "source");
            Intrinsics.checkNotNullParameter(spec, "spec");
            String fileName = source.getFileName();
            if (fileName == null) {
                throw new Exceptions.IllegalArgument("Source " + source.getUri() + " has no file name", null, 2, null);
            }
            if (!spec.isDirectory()) {
                if (getFile().exists()) {
                    if (!spec.getOverwrite()) {
                        throw new DestinationAlreadyExistsException();
                    }
                    getFile().deleteRecursively();
                }
                return new DestinationSink.SAF(spec, getFile(), false);
            }
            if (!getFile().exists()) {
                if (source.isDirectory()) {
                    UnifiedFileInterface parentFile = getFile().getParentFile();
                    if (parentFile == null || !parentFile.exists()) {
                        throw new DestinationDoesNotExistException();
                    }
                    return new DestinationSink.SAF(spec, getFile(), false);
                }
                throw new DestinationDoesNotExistException();
            }
            SAFDocumentFile findFile = getFile().findFile(fileName);
            if (findFile != null) {
                if (!spec.getOverwrite()) {
                    throw new DestinationAlreadyExistsException();
                }
                findFile.deleteRecursively();
            }
            return new DestinationSink.SAF(spec, getFile(), true);
        }

        @Override // expo.modules.filesystem.fsops.CopyMoveStrategy
        protected Uri tryNativeMove(DestinationSink resolved) {
            DocumentFile parentFile;
            Uri uri;
            DocumentFile documentFile;
            DocumentFile parentFile2;
            Uri uri2;
            Object m13470constructorimpl;
            Intrinsics.checkNotNullParameter(resolved, "resolved");
            if (!(resolved instanceof DestinationSink.SAF)) {
                return null;
            }
            SAFDocumentFile target = ((DestinationSink.SAF) resolved).getTarget();
            DocumentFile documentFile2 = getFile().getDocumentFile();
            if (documentFile2 == null || (parentFile = documentFile2.getParentFile()) == null || (uri = parentFile.getUri()) == null || (documentFile = target.getDocumentFile()) == null || (parentFile2 = documentFile.getParentFile()) == null || (uri2 = parentFile2.getUri()) == null) {
                return null;
            }
            try {
                Result.Companion companion = Result.INSTANCE;
                SAF saf = this;
                m13470constructorimpl = Result.m13470constructorimpl(DocumentsContract.moveDocument(this.context.getContentResolver(), getFile().getUri(), uri, uri2));
            } catch (Throwable th) {
                Result.Companion companion2 = Result.INSTANCE;
                m13470constructorimpl = Result.m13470constructorimpl(ResultKt.createFailure(th));
            }
            return (Uri) (Result.m13476isFailureimpl(m13470constructorimpl) ? null : m13470constructorimpl);
        }
    }

    /* compiled from: CopyMoveStrategy.kt */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0010¢\u0006\u0002\b\u000eJ\u0016\u0010\u000f\u001a\u00020\u00102\u0006\u0010\f\u001a\u00020\rH\u0096@¢\u0006\u0002\u0010\u0011R\u0014\u0010\u0002\u001a\u00020\u0003X\u0094\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lexpo/modules/filesystem/fsops/CopyMoveStrategy$ContentProvider;", "Lexpo/modules/filesystem/fsops/CopyMoveStrategy;", "file", "Lexpo/modules/filesystem/unifiedfile/ContentProviderFile;", "<init>", "(Lexpo/modules/filesystem/unifiedfile/ContentProviderFile;)V", "getFile", "()Lexpo/modules/filesystem/unifiedfile/ContentProviderFile;", "prepareAsDestination", "Lexpo/modules/filesystem/fsops/DestinationSink;", "source", "Lexpo/modules/filesystem/unifiedfile/UnifiedFileInterface;", "spec", "Lexpo/modules/filesystem/fsops/DestinationSpec;", "prepareAsDestination$expo_file_system_release", "moveTo", "Landroid/net/Uri;", "(Lexpo/modules/filesystem/fsops/DestinationSpec;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "expo-file-system_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ContentProvider extends CopyMoveStrategy {
        private final ContentProviderFile file;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ContentProvider(ContentProviderFile file) {
            super(file, null);
            Intrinsics.checkNotNullParameter(file, "file");
            this.file = file;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // expo.modules.filesystem.fsops.CopyMoveStrategy
        public ContentProviderFile getFile() {
            return this.file;
        }

        @Override // expo.modules.filesystem.fsops.CopyMoveStrategy
        public DestinationSink prepareAsDestination$expo_file_system_release(UnifiedFileInterface source, DestinationSpec spec) {
            Intrinsics.checkNotNullParameter(source, "source");
            Intrinsics.checkNotNullParameter(spec, "spec");
            if (!getFile().exists() || spec.getOverwrite()) {
                return new DestinationSink.ContentResource(spec);
            }
            throw new DestinationAlreadyExistsException();
        }

        @Override // expo.modules.filesystem.fsops.CopyMoveStrategy
        public Object moveTo(DestinationSpec destinationSpec, Continuation<? super Uri> continuation) {
            throw new UnableToMoveException("Content provider file cannot be moved (provider-dependent)");
        }
    }

    /* compiled from: CopyMoveStrategy.kt */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0010¢\u0006\u0002\b\u000eJ\u0016\u0010\u000f\u001a\u00020\u00102\u0006\u0010\f\u001a\u00020\rH\u0096@¢\u0006\u0002\u0010\u0011R\u0014\u0010\u0002\u001a\u00020\u0003X\u0094\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lexpo/modules/filesystem/fsops/CopyMoveStrategy$Asset;", "Lexpo/modules/filesystem/fsops/CopyMoveStrategy;", "file", "Lexpo/modules/filesystem/unifiedfile/AssetFile;", "<init>", "(Lexpo/modules/filesystem/unifiedfile/AssetFile;)V", "getFile", "()Lexpo/modules/filesystem/unifiedfile/AssetFile;", "prepareAsDestination", "Lexpo/modules/filesystem/fsops/DestinationSink;", "source", "Lexpo/modules/filesystem/unifiedfile/UnifiedFileInterface;", "spec", "Lexpo/modules/filesystem/fsops/DestinationSpec;", "prepareAsDestination$expo_file_system_release", "moveTo", "Landroid/net/Uri;", "(Lexpo/modules/filesystem/fsops/DestinationSpec;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "expo-file-system_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Asset extends CopyMoveStrategy {
        private final AssetFile file;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Asset(AssetFile file) {
            super(file, null);
            Intrinsics.checkNotNullParameter(file, "file");
            this.file = file;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // expo.modules.filesystem.fsops.CopyMoveStrategy
        public AssetFile getFile() {
            return this.file;
        }

        @Override // expo.modules.filesystem.fsops.CopyMoveStrategy
        public DestinationSink prepareAsDestination$expo_file_system_release(UnifiedFileInterface source, DestinationSpec spec) {
            Intrinsics.checkNotNullParameter(source, "source");
            Intrinsics.checkNotNullParameter(spec, "spec");
            if (!getFile().exists() || spec.getOverwrite()) {
                return new DestinationSink.Asset(spec);
            }
            throw new DestinationAlreadyExistsException();
        }

        @Override // expo.modules.filesystem.fsops.CopyMoveStrategy
        public Object moveTo(DestinationSpec destinationSpec, Continuation<? super Uri> continuation) {
            throw new UnableToMoveException("Assets cannot be moved (provider-dependent)");
        }
    }
}
