package ru.ozon.app.android.returns.creation.widgets.photopickerperimagetype.repository;

import Ae.B0;
import Ae.C0;
import Ae.E0;
import Ae.M0;
import Ae.w0;
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
import ru.ozon.app.android.returns.creation.widgets.photoPicker.repository.MediaFile;
import ru.ozon.app.android.returns.creation.widgets.photoPicker.repository.MediaFilesUploader;
import ru.ozon.app.android.returns.creation.widgets.photoPicker.repository.SignedLink;
import ru.ozon.app.android.returns.creation.widgets.photoPicker.repository.UploadingState;
import xe.C10720e0;
import xe.C10727i;
import xe.U;

@Metadata(d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001B/\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u001c\u0010\b\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00020\u0006`\u00070\u0004¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0014\u0010\u0010\u001a\u00020\r*\u00020\u0006H\u0082@¢\u0006\u0004\b\u0010\u0010\u0011J\u001c\u0010\u0014\u001a\u00020\r*\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u0012H\u0082@¢\u0006\u0004\b\u0014\u0010\u0015J\u0014\u0010\u0016\u001a\u00020\r*\u00020\u0006H\u0082@¢\u0006\u0004\b\u0016\u0010\u0011J8\u0010\u0019\u001a\u00020\r*\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00020\u0006`\u00070\u00042\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00060\u0017H\u0082@¢\u0006\u0004\b\u0019\u0010\u001aJj\u0010!\u001a\u00020\r\"\u0004\b\u0000\u0010\u001b\"\u0004\b\u0001\u0010\u001c*\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00028\u00000\u0005j\b\u0012\u0004\u0012\u00028\u0000`\u00070\u000422\u0010 \u001a.\b\u0001\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00028\u00000\u0005j\b\u0012\u0004\u0012\u00028\u0000`\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u001e\u0012\u0006\u0012\u0004\u0018\u00010\u001f0\u001dH\u0082@¢\u0006\u0004\b!\u0010\"J2\u0010$\u001a\u00020\r*\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00020\u0006`\u00070\u00042\u0006\u0010#\u001a\u00020\u0006H\u0082@¢\u0006\u0004\b$\u0010%J\u001e\u0010&\u001a\u00020\r2\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00060\u0017H\u0096@¢\u0006\u0004\b&\u0010'J\u0018\u0010*\u001a\u00020\r2\u0006\u0010)\u001a\u00020(H\u0096@¢\u0006\u0004\b*\u0010+J\u0018\u0010,\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0096@¢\u0006\u0004\b,\u0010-J\u0018\u0010.\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0096@¢\u0006\u0004\b.\u0010-R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010/R*\u0010\b\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00020\u0006`\u00070\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u00100R\u0016\u00101\u001a\u00020(8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u00102R&\u00105\u001a\u0014\u0012\u0004\u0012\u00020\u000b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r04038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106R\u001a\u00108\u001a\b\u0012\u0004\u0012\u00020\r078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00109R&\u0010<\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060;0:8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?R \u0010A\u001a\b\u0012\u0004\u0012\u00020\r0@8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bA\u0010B\u001a\u0004\bC\u0010D¨\u0006E"}, d2 = {"Lru/ozon/app/android/returns/creation/widgets/photopickerperimagetype/repository/ReturnCreationPhotoPickerRepositoryImpl;", "Lru/ozon/app/android/returns/creation/widgets/photopickerperimagetype/repository/ReturnCreationPhotoPickerRepository;", "Lru/ozon/app/android/returns/creation/widgets/photoPicker/repository/MediaFilesUploader;", "mediaFilesUploader", "LAe/x0;", "Ljava/util/HashSet;", "Lru/ozon/app/android/returns/creation/widgets/photoPicker/repository/MediaFile;", "Lkotlin/collections/HashSet;", "mutableMedia", "<init>", "(Lru/ozon/app/android/returns/creation/widgets/photoPicker/repository/MediaFilesUploader;LAe/x0;)V", "", "id", "", "cancelIfUploading", "(J)Lkotlin/Unit;", "mutateToLoading", "(Lru/ozon/app/android/returns/creation/widgets/photoPicker/repository/MediaFile;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Lru/ozon/app/android/returns/creation/widgets/photoPicker/repository/SignedLink;", "signedLink", "mutateToUploaded", "(Lru/ozon/app/android/returns/creation/widgets/photoPicker/repository/MediaFile;Lru/ozon/app/android/returns/creation/widgets/photoPicker/repository/SignedLink;Lkotlin/coroutines/d;)Ljava/lang/Object;", "mutateToError", "", "mediaFiles", "addAllAndEmit", "(LAe/x0;Ljava/util/List;Lkotlin/coroutines/d;)Ljava/lang/Object;", "T", "R", "Lkotlin/Function2;", "Lkotlin/coroutines/d;", "", "mapFunction", "map", "(LAe/x0;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/d;)Ljava/lang/Object;", "mediaFile", "mutateItem", "(LAe/x0;Lru/ozon/app/android/returns/creation/widgets/photoPicker/repository/MediaFile;Lkotlin/coroutines/d;)Ljava/lang/Object;", "addMediaFiles", "(Ljava/util/List;Lkotlin/coroutines/d;)Ljava/lang/Object;", "", "actionName", "uploadMediaFiles", "(Ljava/lang/String;Lkotlin/coroutines/d;)Ljava/lang/Object;", "removeMediaFile", "(JLkotlin/coroutines/d;)Ljava/lang/Object;", "retryLoading", "Lru/ozon/app/android/returns/creation/widgets/photoPicker/repository/MediaFilesUploader;", "LAe/x0;", "lastActionName", "Ljava/lang/String;", "", "Lxe/U;", "mutableDeferred", "Ljava/util/Map;", "LAe/w0;", "mutableError", "LAe/w0;", "LAe/M0;", "", "media", "LAe/M0;", "getMedia", "()LAe/M0;", "LAe/B0;", "error", "LAe/B0;", "getError", "()LAe/B0;", "creation_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ReturnCreationPhotoPickerRepositoryImpl implements ReturnCreationPhotoPickerRepository {

    @NotNull
    private final B0<Unit> error;

    @NotNull
    private String lastActionName;

    @NotNull
    private final M0<Set<MediaFile>> media;

    @NotNull
    private final MediaFilesUploader mediaFilesUploader;

    @NotNull
    private final Map<Long, U<Unit>> mutableDeferred;

    @NotNull
    private final w0<Unit> mutableError;

    @NotNull
    private final x0<HashSet<MediaFile>> mutableMedia;

    public ReturnCreationPhotoPickerRepositoryImpl(@NotNull MediaFilesUploader mediaFilesUploader, @NotNull x0<HashSet<MediaFile>> mutableMedia) {
        Intrinsics.checkNotNullParameter(mediaFilesUploader, "mediaFilesUploader");
        Intrinsics.checkNotNullParameter(mutableMedia, "mutableMedia");
        this.mediaFilesUploader = mediaFilesUploader;
        this.mutableMedia = mutableMedia;
        this.lastActionName = "";
        this.mutableDeferred = new LinkedHashMap();
        C0 b11 = E0.b(0, 0, null, 7);
        this.mutableError = b11;
        this.media = mutableMedia;
        this.error = b11;
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
        xe.E0.e(remove);
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
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0065, code lost:
    
        if (r14.emit(r15, r0) != r1) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mutateToError(MediaFile mediaFile, d<? super Unit> dVar) {
        ReturnCreationPhotoPickerRepositoryImpl$mutateToError$1 returnCreationPhotoPickerRepositoryImpl$mutateToError$1;
        int i11;
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
                    returnCreationPhotoPickerRepositoryImpl$mutateToError$1.label = 1;
                    if (mutateItem(x0Var, copy$default, returnCreationPhotoPickerRepositoryImpl$mutateToError$1) != aVar) {
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
                returnCreationPhotoPickerRepositoryImpl = (ReturnCreationPhotoPickerRepositoryImpl) returnCreationPhotoPickerRepositoryImpl$mutateToError$1.L$0;
                s.b(obj);
                w0<Unit> w0Var = returnCreationPhotoPickerRepositoryImpl.mutableError;
                Unit unit = Unit.f71690a;
                returnCreationPhotoPickerRepositoryImpl$mutateToError$1.L$0 = null;
                returnCreationPhotoPickerRepositoryImpl$mutateToError$1.label = 2;
            }
        }
        returnCreationPhotoPickerRepositoryImpl$mutateToError$1 = new ReturnCreationPhotoPickerRepositoryImpl$mutateToError$1(this, dVar);
        Object obj2 = returnCreationPhotoPickerRepositoryImpl$mutateToError$1.result;
        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
        i11 = returnCreationPhotoPickerRepositoryImpl$mutateToError$1.label;
        if (i11 != 0) {
        }
        w0<Unit> w0Var2 = returnCreationPhotoPickerRepositoryImpl.mutableError;
        Unit unit2 = Unit.f71690a;
        returnCreationPhotoPickerRepositoryImpl$mutateToError$1.L$0 = null;
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

    @Override // ru.ozon.app.android.returns.creation.widgets.photopickerperimagetype.repository.ReturnCreationPhotoPickerRepository
    public Object addMediaFiles(@NotNull List<MediaFile> list, @NotNull d<? super Unit> dVar) {
        Object addAllAndEmit = addAllAndEmit(this.mutableMedia, list, dVar);
        return addAllAndEmit == Wc.a.COROUTINE_SUSPENDED ? addAllAndEmit : Unit.f71690a;
    }

    @Override // ru.ozon.app.android.returns.creation.widgets.photopickerperimagetype.repository.ReturnCreationPhotoPickerRepository
    @NotNull
    public B0<Unit> getError() {
        return this.error;
    }

    @Override // ru.ozon.app.android.returns.creation.widgets.photopickerperimagetype.repository.ReturnCreationPhotoPickerRepository
    @NotNull
    public M0<Set<MediaFile>> getMedia() {
        return this.media;
    }

    @Override // ru.ozon.app.android.returns.creation.widgets.photopickerperimagetype.repository.ReturnCreationPhotoPickerRepository
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
    @Override // ru.ozon.app.android.returns.creation.widgets.photopickerperimagetype.repository.ReturnCreationPhotoPickerRepository
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

    @Override // ru.ozon.app.android.returns.creation.widgets.photopickerperimagetype.repository.ReturnCreationPhotoPickerRepository
    public Object uploadMediaFiles(@NotNull String str, @NotNull d<? super Unit> dVar) {
        this.lastActionName = str;
        C10720e0 c10720e0 = C10720e0.f105451a;
        Object f7 = C10727i.f(b.f10879b, new ReturnCreationPhotoPickerRepositoryImpl$uploadMediaFiles$2(this, str, null), dVar);
        return f7 == Wc.a.COROUTINE_SUSPENDED ? f7 : Unit.f71690a;
    }
}
