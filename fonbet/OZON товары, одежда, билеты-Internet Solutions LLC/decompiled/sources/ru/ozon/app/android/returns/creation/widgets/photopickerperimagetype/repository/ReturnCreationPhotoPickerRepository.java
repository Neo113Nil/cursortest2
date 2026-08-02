package ru.ozon.app.android.returns.creation.widgets.photopickerperimagetype.repository;

import Ae.B0;
import Ae.M0;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.returns.creation.widgets.photoPicker.repository.MediaFile;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b`\u0018\u00002\u00020\u0001J\u001e\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H¦@¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\n\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\bH¦@¢\u0006\u0004\b\n\u0010\u000bJ\u0018\u0010\u000e\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\fH¦@¢\u0006\u0004\b\u000e\u0010\u000fJ\u0018\u0010\u0010\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\fH¦@¢\u0006\u0004\b\u0010\u0010\u000fR \u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00120\u00118&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00050\u00168&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001a"}, d2 = {"Lru/ozon/app/android/returns/creation/widgets/photopickerperimagetype/repository/ReturnCreationPhotoPickerRepository;", "", "", "Lru/ozon/app/android/returns/creation/widgets/photoPicker/repository/MediaFile;", "mediaFiles", "", "addMediaFiles", "(Ljava/util/List;Lkotlin/coroutines/d;)Ljava/lang/Object;", "", "actionName", "uploadMediaFiles", "(Ljava/lang/String;Lkotlin/coroutines/d;)Ljava/lang/Object;", "", "id", "removeMediaFile", "(JLkotlin/coroutines/d;)Ljava/lang/Object;", "retryLoading", "LAe/M0;", "", "getMedia", "()LAe/M0;", "media", "LAe/B0;", "getError", "()LAe/B0;", "error", "creation_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public interface ReturnCreationPhotoPickerRepository {
    Object addMediaFiles(@NotNull List<MediaFile> list, @NotNull d<? super Unit> dVar);

    @NotNull
    B0<Unit> getError();

    @NotNull
    M0<Set<MediaFile>> getMedia();

    Object removeMediaFile(long j11, @NotNull d<? super Unit> dVar);

    Object retryLoading(long j11, @NotNull d<? super Unit> dVar);

    Object uploadMediaFiles(@NotNull String str, @NotNull d<? super Unit> dVar);
}
