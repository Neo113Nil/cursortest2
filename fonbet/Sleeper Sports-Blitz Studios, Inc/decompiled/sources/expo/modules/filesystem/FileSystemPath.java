package expo.modules.filesystem;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import expo.modules.filesystem.unifiedfile.AssetFile;
import expo.modules.filesystem.unifiedfile.ContentProviderFile;
import expo.modules.filesystem.unifiedfile.JavaFile;
import expo.modules.filesystem.unifiedfile.SAFDocumentFile;
import expo.modules.filesystem.unifiedfile.UnifiedFileInterface;
import expo.modules.kotlin.AppContext;
import expo.modules.kotlin.exception.Exceptions;
import expo.modules.kotlin.services.FilePermissionService;
import expo.modules.kotlin.sharedobjects.SharedObject;
import java.io.File;
import java.nio.file.CopyOption;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.EnumSet;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.io.FilesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.Dispatchers;

/* compiled from: FileSystemPath.kt */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\b&\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\u0012\u001a\u00020\u0013J\b\u0010\u0014\u001a\u00020\u0013H&J\u000e\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u0016\u001a\u00020\u0000J\u000e\u0010\u0017\u001a\u00020\u00132\u0006\u0010\u0018\u001a\u00020\u0019J\u000e\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u0018\u001a\u00020\u0019J\u000e\u0010\u001c\u001a\u00020\u00132\u0006\u0010\u001d\u001a\u00020\u001eJ\u001e\u0010\u001f\u001a\u00020\u00132\u0006\u0010 \u001a\u00020\u00002\u0006\u0010\u001d\u001a\u00020!H\u0086@¢\u0006\u0002\u0010\"J\u001e\u0010#\u001a\u00020\u00132\u0006\u0010 \u001a\u00020\u00002\u0006\u0010\u001d\u001a\u00020!H\u0086@¢\u0006\u0002\u0010\"J\u000e\u0010$\u001a\u00020\u00132\u0006\u0010%\u001a\u00020&R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\u0005R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u000b\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0011\u0010\u000e\u001a\u00020\u000f8F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010'\u001a\u0004\u0018\u00010(8F¢\u0006\u0006\u001a\u0004\b)\u0010*R\u0013\u0010+\u001a\u0004\u0018\u00010(8F¢\u0006\u0006\u001a\u0004\b,\u0010*¨\u0006-"}, d2 = {"Lexpo/modules/filesystem/FileSystemPath;", "Lexpo/modules/kotlin/sharedobjects/SharedObject;", "uri", "Landroid/net/Uri;", "<init>", "(Landroid/net/Uri;)V", "getUri", "()Landroid/net/Uri;", "setUri", "fileAdapter", "Lexpo/modules/filesystem/unifiedfile/UnifiedFileInterface;", "file", "getFile", "()Lexpo/modules/filesystem/unifiedfile/UnifiedFileInterface;", "javaFile", "Ljava/io/File;", "getJavaFile", "()Ljava/io/File;", "delete", "", "validateType", "getMoveOrCopyPath", "destination", "validatePermission", "permission", "Lexpo/modules/kotlin/services/FilePermissionService$Permission;", "checkPermission", "", "validateCanCreate", "options", "Lexpo/modules/filesystem/CreateOptions;", "copy", "to", "Lexpo/modules/filesystem/RelocationOptions;", "(Lexpo/modules/filesystem/FileSystemPath;Lexpo/modules/filesystem/RelocationOptions;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "move", "rename", "newName", "", "modificationTime", "", "getModificationTime", "()Ljava/lang/Long;", "creationTime", "getCreationTime", "expo-file-system_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public abstract class FileSystemPath extends SharedObject {
    private UnifiedFileInterface fileAdapter;
    private Uri uri;

    public abstract void validateType();

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FileSystemPath(Uri uri) {
        super(null, 1, null);
        Intrinsics.checkNotNullParameter(uri, "uri");
        this.uri = uri;
    }

    public final Uri getUri() {
        return this.uri;
    }

    public final void setUri(Uri uri) {
        Intrinsics.checkNotNullParameter(uri, "<set-?>");
        this.uri = uri;
    }

    public final UnifiedFileInterface getFile() {
        Context reactContext;
        JavaFile assetFile;
        UnifiedFileInterface unifiedFileInterface = this.fileAdapter;
        if (Intrinsics.areEqual(unifiedFileInterface != null ? unifiedFileInterface.getUri() : null, this.uri)) {
            return unifiedFileInterface;
        }
        AppContext appContext = getAppContext();
        if (appContext == null || (reactContext = appContext.getReactContext()) == null) {
            throw new Exceptions.ReactContextLost();
        }
        if (FileSystemPathKt.isSAFUri(this.uri, reactContext)) {
            assetFile = new SAFDocumentFile(reactContext, this.uri);
        } else if (FileSystemPathKt.isContentUri(this.uri)) {
            assetFile = new ContentProviderFile(reactContext, this.uri);
        } else {
            assetFile = FileSystemPathKt.isAssetUri(this.uri) ? new AssetFile(reactContext, this.uri) : new JavaFile(this.uri);
        }
        this.fileAdapter = assetFile;
        return assetFile;
    }

    public final File getJavaFile() {
        if (FileSystemPathKt.isContentUri(this.uri)) {
            throw new Exception("This method cannot be used with content URIs: " + this.uri);
        }
        Object file = getFile();
        Intrinsics.checkNotNull(file, "null cannot be cast to non-null type java.io.File");
        return (File) file;
    }

    public final void delete() {
        if (!getFile().exists()) {
            throw new UnableToDeleteException("uri '" + getFile().getUri() + "' does not exist");
        }
        if (getFile().isDirectory()) {
            if (getFile().deleteRecursively()) {
                return;
            }
            throw new UnableToDeleteException("failed to delete '" + getFile().getUri() + "'");
        }
        if (getFile().delete()) {
            return;
        }
        throw new UnableToDeleteException("failed to delete '" + getFile().getUri() + "'");
    }

    public final File getMoveOrCopyPath(FileSystemPath destination) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        if (destination instanceof FileSystemDirectory) {
            if (this instanceof FileSystemFile) {
                if (!((FileSystemDirectory) destination).getExists()) {
                    throw new DestinationDoesNotExistException();
                }
                return new File(destination.getJavaFile(), getJavaFile().getName());
            }
            if (((FileSystemDirectory) destination).getExists()) {
                return new File(destination.getJavaFile(), getJavaFile().getName());
            }
            File parentFile = destination.getJavaFile().getParentFile();
            if (parentFile == null || !parentFile.exists()) {
                throw new DestinationDoesNotExistException();
            }
            return destination.getJavaFile();
        }
        if (!(this instanceof FileSystemFile)) {
            throw new CopyOrMoveDirectoryToFileException();
        }
        File parentFile2 = destination.getJavaFile().getParentFile();
        if (parentFile2 == null || !parentFile2.exists()) {
            throw new DestinationDoesNotExistException();
        }
        return destination.getJavaFile();
    }

    public final void validatePermission(FilePermissionService.Permission permission) {
        Intrinsics.checkNotNullParameter(permission, "permission");
        if (!checkPermission(permission)) {
            throw new InvalidPermissionException(permission);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0041, code lost:
    
        if (r0 == null) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean checkPermission(FilePermissionService.Permission permission) {
        EnumSet<FilePermissionService.Permission> noneOf;
        FilePermissionService filePermission;
        Context reactContext;
        Intrinsics.checkNotNullParameter(permission, "permission");
        if (FileSystemPathKt.isContentUri(this.uri) || FileSystemPathKt.isAssetUri(this.uri)) {
            return true;
        }
        AppContext appContext = getAppContext();
        if (appContext != null && (filePermission = appContext.getFilePermission()) != null) {
            AppContext appContext2 = getAppContext();
            if (appContext2 != null && (reactContext = appContext2.getReactContext()) != null) {
                String path = getJavaFile().getPath();
                Intrinsics.checkNotNullExpressionValue(path, "getPath(...)");
                noneOf = filePermission.getPathPermissions(reactContext, path);
            } else {
                throw new Exceptions.ReactContextLost();
            }
        }
        noneOf = EnumSet.noneOf(FilePermissionService.Permission.class);
        return noneOf.contains(permission);
    }

    public final void validateCanCreate(CreateOptions options) {
        Intrinsics.checkNotNullParameter(options, "options");
        if (!options.getOverwrite() && getFile().exists()) {
            throw new UnableToCreateException("it already exists");
        }
    }

    public final Object copy(FileSystemPath fileSystemPath, RelocationOptions relocationOptions, Continuation<? super Unit> continuation) {
        validateType();
        fileSystemPath.validateType();
        validatePermission(FilePermissionService.Permission.READ);
        fileSystemPath.validatePermission(FilePermissionService.Permission.WRITE);
        Object withContext = BuildersKt.withContext(Dispatchers.getIO(), new FileSystemPath$copy$2(this, fileSystemPath, relocationOptions, null), continuation);
        return withContext == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? withContext : Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object move(FileSystemPath fileSystemPath, RelocationOptions relocationOptions, Continuation<? super Unit> continuation) {
        FileSystemPath$move$1 fileSystemPath$move$1;
        int i;
        if (continuation instanceof FileSystemPath$move$1) {
            fileSystemPath$move$1 = (FileSystemPath$move$1) continuation;
            if ((fileSystemPath$move$1.label & Integer.MIN_VALUE) != 0) {
                fileSystemPath$move$1.label -= Integer.MIN_VALUE;
                Object obj = fileSystemPath$move$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = fileSystemPath$move$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    validateType();
                    fileSystemPath.validateType();
                    validatePermission(FilePermissionService.Permission.WRITE);
                    fileSystemPath.validatePermission(FilePermissionService.Permission.WRITE);
                    CoroutineDispatcher io2 = Dispatchers.getIO();
                    FileSystemPath$move$finalUri$1 fileSystemPath$move$finalUri$1 = new FileSystemPath$move$finalUri$1(this, fileSystemPath, relocationOptions, null);
                    fileSystemPath$move$1.label = 1;
                    obj = BuildersKt.withContext(io2, fileSystemPath$move$finalUri$1, fileSystemPath$move$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                this.uri = (Uri) obj;
                return Unit.INSTANCE;
            }
        }
        fileSystemPath$move$1 = new FileSystemPath$move$1(this, continuation);
        Object obj2 = fileSystemPath$move$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = fileSystemPath$move$1.label;
        if (i != 0) {
        }
        this.uri = (Uri) obj2;
        return Unit.INSTANCE;
    }

    public final void rename(String newName) {
        Path path;
        Path path2;
        Path move;
        Intrinsics.checkNotNullParameter(newName, "newName");
        validateType();
        validatePermission(FilePermissionService.Permission.WRITE);
        File file = new File(getJavaFile().getParent(), newName);
        if (Build.VERSION.SDK_INT >= 26) {
            path = getJavaFile().toPath();
            Intrinsics.checkNotNullExpressionValue(path, "toPath(...)");
            path2 = file.toPath();
            Intrinsics.checkNotNullExpressionValue(path2, "toPath(...)");
            move = Files.move(path, path2, (CopyOption[]) Arrays.copyOf(new CopyOption[0], 0));
            Intrinsics.checkNotNullExpressionValue(move, "move(...)");
            this.uri = Uri.fromFile(file);
            return;
        }
        FilesKt.copyTo$default(getJavaFile(), file, false, 0, 6, null);
        getJavaFile().delete();
        this.uri = Uri.fromFile(file);
    }

    public final Long getModificationTime() {
        validateType();
        return getFile().lastModified();
    }

    public final Long getCreationTime() {
        return getFile().getCreationTime();
    }
}
