package ru.ozon.app.android.returns.creation.widgets.photoPicker.repository;

import Ae.B0;
import Ae.M0;
import Ae.O0;
import Ae.x0;
import He.b;
import Sc.s;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.returns.creation.widgets.photoPicker.repository.Error;
import ru.ozon.app.android.returns.creation.widgets.photoPicker.repository.UploadingState;
import xe.C10720e0;
import xe.C10727i;
import xe.E0;
import xe.U;

@Metadata(d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0019\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0014\u0010\f\u001a\u00020\b*\u00020\u000bH\u0082@¢\u0006\u0004\b\f\u0010\rJ\u001c\u0010\u0010\u001a\u00020\b*\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000eH\u0082@¢\u0006\u0004\b\u0010\u0010\u0011J\u001e\u0010\u0014\u001a\u00020\b*\u00020\u000b2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0082@¢\u0006\u0004\b\u0014\u0010\u0015J8\u0010\u001b\u001a\u00020\b*\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u000b0\u0017j\b\u0012\u0004\u0012\u00020\u000b`\u00180\u00162\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0019H\u0082@¢\u0006\u0004\b\u001b\u0010\u001cJj\u0010#\u001a\u00020\b\"\u0004\b\u0000\u0010\u001d\"\u0004\b\u0001\u0010\u001e*\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00028\u00000\u0017j\b\u0012\u0004\u0012\u00028\u0000`\u00180\u001622\u0010\"\u001a.\b\u0001\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00028\u00000\u0017j\b\u0012\u0004\u0012\u00028\u0000`\u0018\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010 \u0012\u0006\u0012\u0004\u0018\u00010!0\u001fH\u0082@¢\u0006\u0004\b#\u0010$J2\u0010&\u001a\u00020\b*\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u000b0\u0017j\b\u0012\u0004\u0012\u00020\u000b`\u00180\u00162\u0006\u0010%\u001a\u00020\u000bH\u0082@¢\u0006\u0004\b&\u0010'J\u001e\u0010(\u001a\u00020\b2\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0019H\u0096@¢\u0006\u0004\b(\u0010)J\u0018\u0010+\u001a\u00020\b2\u0006\u0010*\u001a\u00020\u0012H\u0096@¢\u0006\u0004\b+\u0010,J\u0018\u0010/\u001a\u00020\b2\u0006\u0010.\u001a\u00020-H\u0096@¢\u0006\u0004\b/\u00100J\u0018\u00101\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0096@¢\u0006\u0004\b1\u00102J\u0018\u00103\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0096@¢\u0006\u0004\b3\u00102R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u00104R\u0016\u00105\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u00106R*\u00107\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u000b0\u0017j\b\u0012\u0004\u0012\u00020\u000b`\u00180\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108R\u001c\u00109\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010-0\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u00108R&\u0010<\u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0;0:8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010=R&\u0010@\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0?0>8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b@\u0010A\u001a\u0004\bB\u0010CR\"\u0010.\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010-0D8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b.\u0010E\u001a\u0004\bF\u0010G¨\u0006H"}, d2 = {"Lru/ozon/app/android/returns/creation/widgets/photoPicker/repository/ReturnCreationPhotoPickerRepositoryImpl;", "Lru/ozon/app/android/returns/creation/widgets/photoPicker/repository/ReturnCreationPhotoPickerRepository;", "Lru/ozon/app/android/returns/creation/widgets/photoPicker/repository/MediaFilesUploader;", "mediaFilesUploader", "<init>", "(Lru/ozon/app/android/returns/creation/widgets/photoPicker/repository/MediaFilesUploader;)V", "", "id", "", "cancelIfUploading", "(J)Lkotlin/Unit;", "Lru/ozon/app/android/returns/creation/widgets/photoPicker/repository/MediaFile;", "mutateToLoading", "(Lru/ozon/app/android/returns/creation/widgets/photoPicker/repository/MediaFile;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Lru/ozon/app/android/returns/creation/widgets/photoPicker/repository/SignedLink;", "signedLink", "mutateToUploaded", "(Lru/ozon/app/android/returns/creation/widgets/photoPicker/repository/MediaFile;Lru/ozon/app/android/returns/creation/widgets/photoPicker/repository/SignedLink;Lkotlin/coroutines/d;)Ljava/lang/Object;", "", "message", "mutateToError", "(Lru/ozon/app/android/returns/creation/widgets/photoPicker/repository/MediaFile;Ljava/lang/String;Lkotlin/coroutines/d;)Ljava/lang/Object;", "LAe/x0;", "Ljava/util/HashSet;", "Lkotlin/collections/HashSet;", "", "mediaFiles", "addAllAndEmit", "(LAe/x0;Ljava/util/List;Lkotlin/coroutines/d;)Ljava/lang/Object;", "T", "R", "Lkotlin/Function2;", "Lkotlin/coroutines/d;", "", "mapFunction", "map", "(LAe/x0;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/d;)Ljava/lang/Object;", "mediaFile", "mutateItem", "(LAe/x0;Lru/ozon/app/android/returns/creation/widgets/photoPicker/repository/MediaFile;Lkotlin/coroutines/d;)Ljava/lang/Object;", "addMediaFiles", "(Ljava/util/List;Lkotlin/coroutines/d;)Ljava/lang/Object;", "actionName", "uploadMediaFiles", "(Ljava/lang/String;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Lru/ozon/app/android/returns/creation/widgets/photoPicker/repository/Error;", "error", "sendError", "(Lru/ozon/app/android/returns/creation/widgets/photoPicker/repository/Error;Lkotlin/coroutines/d;)Ljava/lang/Object;", "removeMediaFile", "(JLkotlin/coroutines/d;)Ljava/lang/Object;", "retryLoading", "Lru/ozon/app/android/returns/creation/widgets/photoPicker/repository/MediaFilesUploader;", "lastActionName", "Ljava/lang/String;", "mutableMedia", "LAe/x0;", "mutableError", "", "Lxe/U;", "mutableDeferred", "Ljava/util/Map;", "LAe/M0;", "", "media", "LAe/M0;", "getMedia", "()LAe/M0;", "LAe/B0;", "LAe/B0;", "getError", "()LAe/B0;", "creation_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ReturnCreationPhotoPickerRepositoryImpl implements ReturnCreationPhotoPickerRepository {

    @NotNull
    private final B0<Error> error;

    @NotNull
    private String lastActionName;

    @NotNull
    private final M0<Set<MediaFile>> media;

    @NotNull
    private final MediaFilesUploader mediaFilesUploader;

    @NotNull
    private final Map<Long, U<Unit>> mutableDeferred;

    @NotNull
    private final x0<Error> mutableError;

    @NotNull
    private final x0<HashSet<MediaFile>> mutableMedia;

    public ReturnCreationPhotoPickerRepositoryImpl(@NotNull MediaFilesUploader mediaFilesUploader) {
        Intrinsics.checkNotNullParameter(mediaFilesUploader, "mediaFilesUploader");
        this.mediaFilesUploader = mediaFilesUploader;
        this.lastActionName = "";
        x0<HashSet<MediaFile>> a11 = O0.a(new HashSet());
        this.mutableMedia = a11;
        x0<Error> a12 = O0.a(null);
        this.mutableError = a12;
        this.mutableDeferred = new LinkedHashMap();
        this.media = a11;
        this.error = a12;
    }

    private final Object addAllAndEmit(x0<HashSet<MediaFile>> x0Var, List<MediaFile> list, d<? super Unit> dVar) {
        Object map = map(x0Var, new ReturnCreationPhotoPickerRepositoryImpl$addAllAndEmit$2(list, null), dVar);
        return map == Wc.a.COROUTINE_SUSPENDED ? map : Unit.f71690a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Unit cancelIfUploading(long id2) {
        U<Unit> remove = this.mutableDeferred.remove(Long.valueOf(id2));
        if (remove == null) {
            return null;
        }
        E0.e(remove);
        return Unit.f71690a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0069, code lost:
    
        if (r6.emit(r8, r0) != r1) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x006b, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x005b, code lost:
    
        if (r7.invoke(r8, r0) == r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final <T, R> Object map(x0<HashSet<T>> x0Var, Function2<? super HashSet<T>, ? super d<? super R>, ? extends Object> function2, d<? super Unit> dVar) {
        ReturnCreationPhotoPickerRepositoryImpl$map$1 returnCreationPhotoPickerRepositoryImpl$map$1;
        int i11;
        HashSet<T> hashSet;
        if (dVar instanceof ReturnCreationPhotoPickerRepositoryImpl$map$1) {
            returnCreationPhotoPickerRepositoryImpl$map$1 = (ReturnCreationPhotoPickerRepositoryImpl$map$1) dVar;
            int i12 = returnCreationPhotoPickerRepositoryImpl$map$1.label;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                returnCreationPhotoPickerRepositoryImpl$map$1.label = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = returnCreationPhotoPickerRepositoryImpl$map$1.result;
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                i11 = returnCreationPhotoPickerRepositoryImpl$map$1.label;
                if (i11 != 0) {
                    s.b(obj);
                    hashSet = new HashSet<>();
                    hashSet.addAll(x0Var.getValue());
                    returnCreationPhotoPickerRepositoryImpl$map$1.L$0 = x0Var;
                    returnCreationPhotoPickerRepositoryImpl$map$1.L$1 = hashSet;
                    returnCreationPhotoPickerRepositoryImpl$map$1.label = 1;
                } else {
                    if (i11 != 1) {
                        if (i11 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        s.b(obj);
                        return Unit.f71690a;
                    }
                    HashSet<T> hashSet2 = (HashSet) returnCreationPhotoPickerRepositoryImpl$map$1.L$1;
                    x0<HashSet<T>> x0Var2 = (x0) returnCreationPhotoPickerRepositoryImpl$map$1.L$0;
                    s.b(obj);
                    hashSet = hashSet2;
                    x0Var = x0Var2;
                }
                returnCreationPhotoPickerRepositoryImpl$map$1.L$0 = null;
                returnCreationPhotoPickerRepositoryImpl$map$1.L$1 = null;
                returnCreationPhotoPickerRepositoryImpl$map$1.label = 2;
            }
        }
        returnCreationPhotoPickerRepositoryImpl$map$1 = new ReturnCreationPhotoPickerRepositoryImpl$map$1(this, dVar);
        Object obj2 = returnCreationPhotoPickerRepositoryImpl$map$1.result;
        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
        i11 = returnCreationPhotoPickerRepositoryImpl$map$1.label;
        if (i11 != 0) {
        }
        returnCreationPhotoPickerRepositoryImpl$map$1.L$0 = null;
        returnCreationPhotoPickerRepositoryImpl$map$1.L$1 = null;
        returnCreationPhotoPickerRepositoryImpl$map$1.label = 2;
    }

    private final Object mutateItem(x0<HashSet<MediaFile>> x0Var, MediaFile mediaFile, d<? super Unit> dVar) {
        HashSet<MediaFile> value = x0Var.getValue();
        HashSet<MediaFile> hashSet = new HashSet<>();
        for (MediaFile mediaFile2 : value) {
            if (mediaFile2.getId() == mediaFile.getId()) {
                mediaFile2 = mediaFile;
            }
            hashSet.add(mediaFile2);
        }
        Object emit = x0Var.emit(hashSet, dVar);
        return emit == Wc.a.COROUTINE_SUSPENDED ? emit : Unit.f71690a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0084, code lost:
    
        if (r0.emit(r3, r1) != r2) goto L30;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mutateToError(MediaFile mediaFile, String str, d<? super Unit> dVar) {
        ReturnCreationPhotoPickerRepositoryImpl$mutateToError$1 returnCreationPhotoPickerRepositoryImpl$mutateToError$1;
        int i11;
        String str2;
        ReturnCreationPhotoPickerRepositoryImpl returnCreationPhotoPickerRepositoryImpl;
        if (dVar instanceof ReturnCreationPhotoPickerRepositoryImpl$mutateToError$1) {
            returnCreationPhotoPickerRepositoryImpl$mutateToError$1 = (ReturnCreationPhotoPickerRepositoryImpl$mutateToError$1) dVar;
            int i12 = returnCreationPhotoPickerRepositoryImpl$mutateToError$1.label;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                returnCreationPhotoPickerRepositoryImpl$mutateToError$1.label = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = returnCreationPhotoPickerRepositoryImpl$mutateToError$1.result;
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                i11 = returnCreationPhotoPickerRepositoryImpl$mutateToError$1.label;
                if (i11 != 0) {
                    s.b(obj);
                    x0<HashSet<MediaFile>> x0Var = this.mutableMedia;
                    MediaFile copy$default = MediaFile.copy$default(mediaFile, 0L, null, null, UploadingState.Error.INSTANCE, 7, null);
                    returnCreationPhotoPickerRepositoryImpl$mutateToError$1.L$0 = this;
                    returnCreationPhotoPickerRepositoryImpl$mutateToError$1.L$1 = str;
                    returnCreationPhotoPickerRepositoryImpl$mutateToError$1.label = 1;
                    if (mutateItem(x0Var, copy$default, returnCreationPhotoPickerRepositoryImpl$mutateToError$1) != aVar) {
                        str2 = str;
                        returnCreationPhotoPickerRepositoryImpl = this;
                    }
                    return aVar;
                }
                if (i11 != 1) {
                    if (i11 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    s.b(obj);
                    return Unit.f71690a;
                }
                str2 = (String) returnCreationPhotoPickerRepositoryImpl$mutateToError$1.L$1;
                returnCreationPhotoPickerRepositoryImpl = (ReturnCreationPhotoPickerRepositoryImpl) returnCreationPhotoPickerRepositoryImpl$mutateToError$1.L$0;
                s.b(obj);
                x0<Error> x0Var2 = returnCreationPhotoPickerRepositoryImpl.mutableError;
                Error defaultFlashbar = (str2 != null || str2.length() == 0) ? new Error.DefaultFlashbar() : new Error.FlashBar(str2);
                returnCreationPhotoPickerRepositoryImpl$mutateToError$1.L$0 = null;
                returnCreationPhotoPickerRepositoryImpl$mutateToError$1.L$1 = null;
                returnCreationPhotoPickerRepositoryImpl$mutateToError$1.label = 2;
            }
        }
        returnCreationPhotoPickerRepositoryImpl$mutateToError$1 = new ReturnCreationPhotoPickerRepositoryImpl$mutateToError$1(this, dVar);
        Object obj2 = returnCreationPhotoPickerRepositoryImpl$mutateToError$1.result;
        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
        i11 = returnCreationPhotoPickerRepositoryImpl$mutateToError$1.label;
        if (i11 != 0) {
        }
        x0<Error> x0Var22 = returnCreationPhotoPickerRepositoryImpl.mutableError;
        if (str2 != null) {
        }
        returnCreationPhotoPickerRepositoryImpl$mutateToError$1.L$0 = null;
        returnCreationPhotoPickerRepositoryImpl$mutateToError$1.L$1 = null;
        returnCreationPhotoPickerRepositoryImpl$mutateToError$1.label = 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object mutateToLoading(MediaFile mediaFile, d<? super Unit> dVar) {
        Object mutateItem = mutateItem(this.mutableMedia, MediaFile.copy$default(mediaFile, 0L, null, null, UploadingState.Loading.INSTANCE, 7, null), dVar);
        return mutateItem == Wc.a.COROUTINE_SUSPENDED ? mutateItem : Unit.f71690a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object mutateToUploaded(MediaFile mediaFile, SignedLink signedLink, d<? super Unit> dVar) {
        Object mutateItem = mutateItem(this.mutableMedia, MediaFile.copy$default(mediaFile, 0L, null, signedLink, UploadingState.Uploaded.INSTANCE, 3, null), dVar);
        return mutateItem == Wc.a.COROUTINE_SUSPENDED ? mutateItem : Unit.f71690a;
    }

    @Override // ru.ozon.app.android.returns.creation.widgets.photoPicker.repository.ReturnCreationPhotoPickerRepository
    public Object addMediaFiles(@NotNull List<MediaFile> list, @NotNull d<? super Unit> dVar) {
        Object addAllAndEmit = addAllAndEmit(this.mutableMedia, list, dVar);
        return addAllAndEmit == Wc.a.COROUTINE_SUSPENDED ? addAllAndEmit : Unit.f71690a;
    }

    @Override // ru.ozon.app.android.returns.creation.widgets.photoPicker.repository.ReturnCreationPhotoPickerRepository
    @NotNull
    public B0<Error> getError() {
        return this.error;
    }

    @Override // ru.ozon.app.android.returns.creation.widgets.photoPicker.repository.ReturnCreationPhotoPickerRepository
    @NotNull
    public M0<Set<MediaFile>> getMedia() {
        return this.media;
    }

    @Override // ru.ozon.app.android.returns.creation.widgets.photoPicker.repository.ReturnCreationPhotoPickerRepository
    public Object removeMediaFile(long j11, @NotNull d<? super Unit> dVar) {
        Object map = map(this.mutableMedia, new ReturnCreationPhotoPickerRepositoryImpl$removeMediaFile$2(this, j11, null), dVar);
        return map == Wc.a.COROUTINE_SUSPENDED ? map : Unit.f71690a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x009e, code lost:
    
        if (r6.uploadMediaFiles(r1, r4) != r5) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00a0, code lost:
    
        return r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x008d, code lost:
    
        if (mutateItem(r6, r3, r4) == r5) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    @Override // ru.ozon.app.android.returns.creation.widgets.photoPicker.repository.ReturnCreationPhotoPickerRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object retryLoading(long j11, @NotNull d<? super Unit> dVar) {
        ReturnCreationPhotoPickerRepositoryImpl$retryLoading$1 returnCreationPhotoPickerRepositoryImpl$retryLoading$1;
        int i11;
        Object obj;
        ReturnCreationPhotoPickerRepositoryImpl returnCreationPhotoPickerRepositoryImpl;
        long j12 = j11;
        if (dVar instanceof ReturnCreationPhotoPickerRepositoryImpl$retryLoading$1) {
            returnCreationPhotoPickerRepositoryImpl$retryLoading$1 = (ReturnCreationPhotoPickerRepositoryImpl$retryLoading$1) dVar;
            int i12 = returnCreationPhotoPickerRepositoryImpl$retryLoading$1.label;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                returnCreationPhotoPickerRepositoryImpl$retryLoading$1.label = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj2 = returnCreationPhotoPickerRepositoryImpl$retryLoading$1.result;
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                i11 = returnCreationPhotoPickerRepositoryImpl$retryLoading$1.label;
                if (i11 != 0) {
                    s.b(obj2);
                    Iterator<T> it = getMedia().getValue().iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            obj = null;
                            break;
                        }
                        obj = it.next();
                        if (((MediaFile) obj).getId() == j12) {
                            break;
                        }
                    }
                    MediaFile mediaFile = (MediaFile) obj;
                    if (mediaFile != null && (r3 = MediaFile.copy$default(mediaFile, 0L, null, null, UploadingState.Pending.INSTANCE, 7, null)) != null) {
                        x0<HashSet<MediaFile>> x0Var = this.mutableMedia;
                        returnCreationPhotoPickerRepositoryImpl$retryLoading$1.L$0 = this;
                        returnCreationPhotoPickerRepositoryImpl$retryLoading$1.J$0 = j12;
                        returnCreationPhotoPickerRepositoryImpl$retryLoading$1.label = 1;
                    }
                    returnCreationPhotoPickerRepositoryImpl = this;
                } else {
                    if (i11 != 1) {
                        if (i11 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        s.b(obj2);
                        return Unit.f71690a;
                    }
                    j12 = returnCreationPhotoPickerRepositoryImpl$retryLoading$1.J$0;
                    returnCreationPhotoPickerRepositoryImpl = (ReturnCreationPhotoPickerRepositoryImpl) returnCreationPhotoPickerRepositoryImpl$retryLoading$1.L$0;
                    s.b(obj2);
                }
                returnCreationPhotoPickerRepositoryImpl.cancelIfUploading(j12);
                String str = returnCreationPhotoPickerRepositoryImpl.lastActionName;
                returnCreationPhotoPickerRepositoryImpl$retryLoading$1.L$0 = null;
                returnCreationPhotoPickerRepositoryImpl$retryLoading$1.label = 2;
            }
        }
        returnCreationPhotoPickerRepositoryImpl$retryLoading$1 = new ReturnCreationPhotoPickerRepositoryImpl$retryLoading$1(this, dVar);
        Object obj22 = returnCreationPhotoPickerRepositoryImpl$retryLoading$1.result;
        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
        i11 = returnCreationPhotoPickerRepositoryImpl$retryLoading$1.label;
        if (i11 != 0) {
        }
        returnCreationPhotoPickerRepositoryImpl.cancelIfUploading(j12);
        String str2 = returnCreationPhotoPickerRepositoryImpl.lastActionName;
        returnCreationPhotoPickerRepositoryImpl$retryLoading$1.L$0 = null;
        returnCreationPhotoPickerRepositoryImpl$retryLoading$1.label = 2;
    }

    @Override // ru.ozon.app.android.returns.creation.widgets.photoPicker.repository.ReturnCreationPhotoPickerRepository
    public Object sendError(@NotNull Error error, @NotNull d<? super Unit> dVar) {
        Object emit = this.mutableError.emit(error, dVar);
        return emit == Wc.a.COROUTINE_SUSPENDED ? emit : Unit.f71690a;
    }

    @Override // ru.ozon.app.android.returns.creation.widgets.photoPicker.repository.ReturnCreationPhotoPickerRepository
    public Object uploadMediaFiles(@NotNull String str, @NotNull d<? super Unit> dVar) {
        this.lastActionName = str;
        C10720e0 c10720e0 = C10720e0.f105451a;
        Object f7 = C10727i.f(b.f10879b, new ReturnCreationPhotoPickerRepositoryImpl$uploadMediaFiles$2(this, str, null), dVar);
        return f7 == Wc.a.COROUTINE_SUSPENDED ? f7 : Unit.f71690a;
    }
}
