package ru.ozon.app.android.ugc.widgets.common.mediaPicker.presentation;

import B90.C2621x;
import Ci.C2779a;
import Ci.b;
import Ci.g;
import Hi.h;
import L3.p;
import Sc.o;
import WZ.l;
import WZ.m;
import WZ.t;
import XV.f;
import a00.C4908c;
import android.content.SharedPreferences;
import android.os.Bundle;
import androidx.fragment.app.ComponentCallbacksC5392m;
import androidx.fragment.app.G;
import androidx.fragment.app.r;
import androidx.lifecycle.W;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.collections.K;
import kotlin.collections.U;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.R;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.domain.gallery.di.GalleryLauncherComponentKt;
import ru.ozon.app.android.mediaupload.attachments.AttachmentVO;
import ru.ozon.app.android.pdp.ui.configurators.analitycs.TokenizedAnalyticsExtKt;
import ru.ozon.app.android.pdp.ui.configurators.ugc.reviewForm.UploadingAttachmentsViewModel;
import ru.ozon.app.android.pdp.ui.configurators.ugc.reviewForm.VideoUpload;
import ru.ozon.app.android.pdp.utils.Dimens;
import ru.ozon.app.android.ugc.R$string;
import ru.ozon.app.android.ugc.widgets.common.mediaPicker.core.MediaUpdateKey;
import ru.ozon.app.android.ugc.widgets.common.mediaPicker.data.MediaPickerDTO;
import ru.ozon.app.android.ugc.widgets.common.mediaPicker.presentation.MediaPickerEvent;
import ru.ozon.app.android.ugc.widgets.common.mediaPicker.presentation.MediaPickerVO;
import ru.ozon.app.android.ugc.widgets.common.mediaPicker.presentation.MediaPickerWidgetVH;
import ru.ozon.app.android.ugc.widgets.common.mediaPicker.presentation.views.MediaPickerView;
import ru.ozon.app.android.uikit.text.StringProvider;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.data.image.ImageDTO;
import ru.ozon.uni.atoms.data.notification.NotificationDTO;
import xi.C10779a;

@Metadata(d1 = {"\u0000¸\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010$\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\b\u0001\u0018\u0000 ^2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001^BG\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0011\u001a\u00020\r¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0017\u0010\u0016J%\u0010\u001c\u001a\u00020\u00142\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u00182\u0006\u0010\u001b\u001a\u00020\rH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u001d\u0010 \u001a\u00020\u00142\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0\u0018H\u0002¢\u0006\u0004\b \u0010!J+\u0010%\u001a\u00020\"*\u00020\"2\b\u0010$\u001a\u0004\u0018\u00010#2\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0\u0018H\u0002¢\u0006\u0004\b%\u0010&J\u000f\u0010'\u001a\u00020\u0014H\u0002¢\u0006\u0004\b'\u0010\u0016J\u0017\u0010*\u001a\u00020\u00142\u0006\u0010)\u001a\u00020(H\u0002¢\u0006\u0004\b*\u0010+J\u001b\u0010.\u001a\u00020\u00142\n\b\u0002\u0010-\u001a\u0004\u0018\u00010,H\u0002¢\u0006\u0004\b.\u0010/J\u000f\u00100\u001a\u00020\u0014H\u0002¢\u0006\u0004\b0\u0010\u0016J\u000f\u00101\u001a\u00020\u0014H\u0002¢\u0006\u0004\b1\u0010\u0016J\u000f\u00102\u001a\u00020\u0014H\u0002¢\u0006\u0004\b2\u0010\u0016J/\u00107\u001a\u00020\u001e*\u00020\u00192\u0006\u00103\u001a\u00020\u00022\u0012\u00106\u001a\u000e\u0012\u0004\u0012\u000205\u0012\u0004\u0012\u00020\u001e04H\u0002¢\u0006\u0004\b7\u00108J\u001f\u0010<\u001a\u00020\u00142\u0006\u00109\u001a\u00020\u00022\u0006\u0010;\u001a\u00020:H\u0014¢\u0006\u0004\b<\u0010=J\u000f\u0010>\u001a\u00020\u0014H\u0016¢\u0006\u0004\b>\u0010\u0016J\u000f\u0010?\u001a\u00020\u0014H\u0016¢\u0006\u0004\b?\u0010\u0016R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010@R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010AR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010BR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010CR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010DR\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010ER\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010FR\u0014\u0010\u0011\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010ER \u0010I\u001a\u000e\u0012\u0004\u0012\u00020H\u0012\u0004\u0012\u00020\u00140G8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bI\u0010JR\u0016\u0010K\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bK\u0010ER\u0016\u0010L\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bL\u0010ER*\u0010O\u001a\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u000205\u0012\u0004\u0012\u00020N0M\u0018\u00010\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bO\u0010PR\u0014\u0010R\u001a\u00020Q8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bR\u0010SR\u001c\u0010V\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010U0T8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bV\u0010WR(\u0010Y\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020(\u0012\u0006\u0012\u0004\u0018\u00010X0M0T8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bY\u0010WR\u001c\u0010Z\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010X0T8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bZ\u0010WR(\u0010[\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020,\u0012\u0006\u0012\u0004\u0018\u00010X0M0T8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b[\u0010WR\u001c\u0010\\\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010X0T8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\\\u0010WR\u001c\u0010]\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010X0T8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b]\u0010W¨\u0006_"}, d2 = {"Lru/ozon/app/android/ugc/widgets/common/mediaPicker/presentation/MediaPickerWidgetVH;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/ugc/widgets/common/mediaPicker/presentation/MediaPickerVO;", "Lru/ozon/app/android/ugc/widgets/common/mediaPicker/presentation/views/MediaPickerView;", "view", "Lru/ozon/app/android/composer/ComposerReferences;", "refs", "Lru/ozon/app/android/ugc/widgets/common/mediaPicker/presentation/MediaPickerViewModelImpl;", "mediaPickerViewModel", "Lru/ozon/app/android/pdp/ui/configurators/ugc/reviewForm/UploadingAttachmentsViewModel;", "uploadViewModel", "LWZ/l;", "tokenizedAnalytics", "", "isSelect", "Landroid/content/SharedPreferences;", "sharedPreferences", "isTeenMode", "<init>", "(Lru/ozon/app/android/ugc/widgets/common/mediaPicker/presentation/views/MediaPickerView;Lru/ozon/app/android/composer/ComposerReferences;Lru/ozon/app/android/ugc/widgets/common/mediaPicker/presentation/MediaPickerViewModelImpl;Lru/ozon/app/android/pdp/ui/configurators/ugc/reviewForm/UploadingAttachmentsViewModel;LWZ/l;ZLandroid/content/SharedPreferences;Z)V", "", "initObservers", "()V", "removeObservers", "", "Lru/ozon/app/android/mediaupload/attachments/AttachmentVO;", "attachments", "clearScroll", "updateAttaches", "(Ljava/util/List;Z)V", "Lru/ozon/app/android/ugc/widgets/common/mediaPicker/presentation/MediaPickerVO$MediaVO;", "medias", "syncMediaToComposer", "(Ljava/util/List;)V", "Lru/ozon/app/android/ugc/widgets/common/mediaPicker/presentation/MediaPickerVO$PickerVO;", "Lru/ozon/app/android/ugc/widgets/common/mediaPicker/data/MediaPickerDTO$PickerItemBadgeDTO$HideCondition;", "hideCondition", "updateBadgeState", "(Lru/ozon/app/android/ugc/widgets/common/mediaPicker/presentation/MediaPickerVO$PickerVO;Lru/ozon/app/android/ugc/widgets/common/mediaPicker/data/MediaPickerDTO$PickerItemBadgeDTO$HideCondition;Ljava/util/List;)Lru/ozon/app/android/ugc/widgets/common/mediaPicker/presentation/MediaPickerVO$PickerVO;", "updateUploadedAttachments", "", "itemsCountLeft", "openMediaPicker", "(I)V", "", "message", "onUploadFailed", "(Ljava/lang/String;)V", "openPickerOrShowOnboarding", "setupOpenGalleryListener", "clearOpenGalleryListener", "vo", "", "", "old", "toMediaVO", "(Lru/ozon/app/android/mediaupload/attachments/AttachmentVO;Lru/ozon/app/android/ugc/widgets/common/mediaPicker/presentation/MediaPickerVO;Ljava/util/Map;)Lru/ozon/app/android/ugc/widgets/common/mediaPicker/presentation/MediaPickerVO$MediaVO;", "item", "Ll20/d;", "info", "bind", "(Lru/ozon/app/android/ugc/widgets/common/mediaPicker/presentation/MediaPickerVO;Ll20/d;)V", "onAttach", "onDetach", "Lru/ozon/app/android/ugc/widgets/common/mediaPicker/presentation/views/MediaPickerView;", "Lru/ozon/app/android/composer/ComposerReferences;", "Lru/ozon/app/android/ugc/widgets/common/mediaPicker/presentation/MediaPickerViewModelImpl;", "Lru/ozon/app/android/pdp/ui/configurators/ugc/reviewForm/UploadingAttachmentsViewModel;", "LWZ/l;", "Z", "Landroid/content/SharedPreferences;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "wasEmpty", "pendingScrollToStart", "Lkotlin/Pair;", "Lru/ozon/app/android/mediaupload/attachments/AttachmentVO$Status;", "lastSyncedMedia", "Ljava/util/List;", "Lru/ozon/app/android/ugc/widgets/common/mediaPicker/presentation/MediaPickerAdapter;", "pickerAdapter", "Lru/ozon/app/android/ugc/widgets/common/mediaPicker/presentation/MediaPickerAdapter;", "Landroidx/lifecycle/W;", "Lru/ozon/app/android/pdp/ui/configurators/ugc/reviewForm/UploadingAttachmentsViewModel$ViewState;", "attachedObserver", "Landroidx/lifecycle/W;", "", "openPickObserver", "commonErrorObserver", "errorsObserver", "uploadEventObserver", "uploadErrorEventObserver", "Companion", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class MediaPickerWidgetVH extends k<MediaPickerVO> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final W<UploadingAttachmentsViewModel.ViewState> attachedObserver;

    @NotNull
    private final W<Object> commonErrorObserver;

    @NotNull
    private final W<Pair<String, Object>> errorsObserver;
    private final boolean isSelect;
    private final boolean isTeenMode;
    private List<? extends Pair<Long, ? extends AttachmentVO.Status>> lastSyncedMedia;

    @NotNull
    private final MediaPickerViewModelImpl mediaPickerViewModel;

    @NotNull
    private final W<Pair<Integer, Object>> openPickObserver;
    private boolean pendingScrollToStart;

    @NotNull
    private final MediaPickerAdapter pickerAdapter;

    @NotNull
    private final ComposerReferences refs;

    @NotNull
    private final SharedPreferences sharedPreferences;

    @NotNull
    private final l tokenizedAnalytics;

    @NotNull
    private final W<Object> uploadErrorEventObserver;

    @NotNull
    private final W<Object> uploadEventObserver;

    @NotNull
    private final UploadingAttachmentsViewModel uploadViewModel;

    @NotNull
    private final MediaPickerView view;
    private boolean wasEmpty;
    public static final int $stable = 8;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[MediaPickerDTO.PickerItemBadgeDTO.HideCondition.values().length];
            try {
                iArr[MediaPickerDTO.PickerItemBadgeDTO.HideCondition.PHOTO.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[MediaPickerDTO.PickerItemBadgeDTO.HideCondition.VIDEO.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[MediaPickerDTO.PickerItemBadgeDTO.HideCondition.ANY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MediaPickerWidgetVH(@NotNull MediaPickerView view, @NotNull ComposerReferences refs, @NotNull MediaPickerViewModelImpl mediaPickerViewModel, @NotNull UploadingAttachmentsViewModel uploadViewModel, @NotNull l tokenizedAnalytics, boolean z11, @NotNull SharedPreferences sharedPreferences, boolean z12) {
        super(view);
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(refs, "refs");
        Intrinsics.checkNotNullParameter(mediaPickerViewModel, "mediaPickerViewModel");
        Intrinsics.checkNotNullParameter(uploadViewModel, "uploadViewModel");
        Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
        Intrinsics.checkNotNullParameter(sharedPreferences, "sharedPreferences");
        this.view = view;
        this.refs = refs;
        this.mediaPickerViewModel = mediaPickerViewModel;
        this.uploadViewModel = uploadViewModel;
        this.tokenizedAnalytics = tokenizedAnalytics;
        this.isSelect = z11;
        this.sharedPreferences = sharedPreferences;
        this.isTeenMode = z12;
        this.actionHandler = new ActionHandler.Builder(refs, this).buildHandler();
        this.wasEmpty = true;
        MediaPickerAdapter mediaPickerAdapter = new MediaPickerAdapter(tokenizedAnalytics, refs.getContainer().g());
        mediaPickerAdapter.setOnAddClick(new MediaPickerWidgetVH$pickerAdapter$1$1(this));
        mediaPickerAdapter.setOnRemoveClick(new MediaPickerWidgetVH$pickerAdapter$1$2(uploadViewModel));
        mediaPickerAdapter.setOnRetryClick(new MediaPickerWidgetVH$pickerAdapter$1$3(uploadViewModel));
        mediaPickerAdapter.setOnCancelClick(new MediaPickerWidgetVH$pickerAdapter$1$4(uploadViewModel));
        this.pickerAdapter = mediaPickerAdapter;
        this.attachedObserver = new W() { // from class: XV.a
            @Override // androidx.lifecycle.W
            public final void onChanged(Object obj) {
                MediaPickerWidgetVH.attachedObserver$lambda$3(MediaPickerWidgetVH.this, (UploadingAttachmentsViewModel.ViewState) obj);
            }
        };
        this.openPickObserver = new W() { // from class: XV.b
            @Override // androidx.lifecycle.W
            public final void onChanged(Object obj) {
                MediaPickerWidgetVH.openPickObserver$lambda$4(MediaPickerWidgetVH.this, (Pair) obj);
            }
        };
        this.commonErrorObserver = new W() { // from class: XV.c
            @Override // androidx.lifecycle.W
            public final void onChanged(Object obj) {
                MediaPickerWidgetVH.onUploadFailed$default(MediaPickerWidgetVH.this, null, 1, null);
            }
        };
        this.errorsObserver = new W() { // from class: XV.d
            @Override // androidx.lifecycle.W
            public final void onChanged(Object obj) {
                MediaPickerWidgetVH.errorsObserver$lambda$6(MediaPickerWidgetVH.this, (Pair) obj);
            }
        };
        this.uploadEventObserver = new W() { // from class: XV.e
            @Override // androidx.lifecycle.W
            public final void onChanged(Object obj) {
                MediaPickerWidgetVH.uploadEventObserver$lambda$7(MediaPickerWidgetVH.this, obj);
            }
        };
        this.uploadErrorEventObserver = new f(this, 0);
        view.setAdapter(mediaPickerAdapter);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void attachedObserver$lambda$3(MediaPickerWidgetVH mediaPickerWidgetVH, UploadingAttachmentsViewModel.ViewState viewState) {
        if (viewState != null) {
            boolean isEmpty = viewState.getAttachments().isEmpty();
            boolean z11 = true;
            mediaPickerWidgetVH.updateAttaches(viewState.getAttachments(), mediaPickerWidgetVH.wasEmpty != isEmpty);
            mediaPickerWidgetVH.wasEmpty = isEmpty;
            mediaPickerWidgetVH.updateUploadedAttachments();
            MediaPickerViewModelImpl mediaPickerViewModelImpl = mediaPickerWidgetVH.mediaPickerViewModel;
            List<AttachmentVO> attachments = viewState.getAttachments();
            if (!(attachments instanceof Collection) || !attachments.isEmpty()) {
                for (AttachmentVO attachmentVO : attachments) {
                    if (Intrinsics.d(attachmentVO.getStatus(), AttachmentVO.Status.UPLOADING.INSTANCE) || Intrinsics.d(attachmentVO.getStatus(), AttachmentVO.Status.RESIZING.INSTANCE)) {
                        break;
                    }
                }
            }
            z11 = false;
            mediaPickerViewModelImpl.onViewIntent(new MediaPickerEvent.UploadingStateUpdated(z11));
        }
    }

    private final void clearOpenGalleryListener() {
        G supportFragmentManager;
        r a11 = this.refs.getContainer().a();
        if (a11 == null || (supportFragmentManager = a11.getSupportFragmentManager()) == null) {
            return;
        }
        supportFragmentManager.s("open_gallery_key");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void errorsObserver$lambda$6(MediaPickerWidgetVH mediaPickerWidgetVH, Pair pair) {
        Intrinsics.checkNotNullParameter(pair, "<destruct>");
        mediaPickerWidgetVH.onUploadFailed((String) pair.a());
    }

    private final void initObservers() {
        UploadingAttachmentsViewModel uploadingAttachmentsViewModel = this.uploadViewModel;
        C4908c g10 = this.refs.getContainer().g();
        uploadingAttachmentsViewModel.getAttached().observe(g10, this.attachedObserver);
        uploadingAttachmentsViewModel.getOpenPickScreen().observe(g10, this.openPickObserver);
        uploadingAttachmentsViewModel.getCommonUploadError().observe(g10, this.commonErrorObserver);
        uploadingAttachmentsViewModel.getErrors().observe(g10, this.errorsObserver);
        uploadingAttachmentsViewModel.getSendUploadEvent().observe(g10, this.uploadEventObserver);
        uploadingAttachmentsViewModel.getSendUploadErrorEvent().observe(g10, this.uploadErrorEventObserver);
    }

    private final void onUploadFailed(String message) {
        this.mediaPickerViewModel.onViewIntent(new MediaPickerEvent.UploadFailed(new NotificationDTO(StringProvider.getString(message == null ? R$string.reviews_media_upload_error_retry_title : R$string.reviews_media_upload_error_common_title), message == null ? this.isTeenMode ? StringProvider.getString(R$string.reviews_media_upload_error_retry_subtitle_teen_mode) : StringProvider.getString(R$string.reviews_media_upload_error_retry_subtitle) : message, null, 3, null, null, null, null, null, NotificationDTO.Preset.NEGATIVE, 468, null)));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void onUploadFailed$default(MediaPickerWidgetVH mediaPickerWidgetVH, String str, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = null;
        }
        mediaPickerWidgetVH.onUploadFailed(str);
    }

    private final void openMediaPicker(int itemsCountLeft) {
        MediaPickerVO boundData = getBoundData();
        boolean z11 = (boundData != null ? boundData.getVideoConfig() : null) != null;
        MediaPickerWidgetVH$openMediaPicker$cameraClickHandler$1 mediaPickerWidgetVH$openMediaPicker$cameraClickHandler$1 = new MediaPickerWidgetVH$openMediaPicker$cameraClickHandler$1(z11);
        Ci.k b11 = C2779a.b();
        Ci.k b12 = Ci.k.b(b11, this.isSelect ? R.style.OzonGallerySelectTheme : R.style.OzonGalleryTheme, !z11 ? h.d.f11018a : null, b.a(b11.d(), g.a(b11.d().f(), mediaPickerWidgetVH$openMediaPicker$cameraClickHandler$1, new MediaPickerWidgetVH$openMediaPicker$config$1$1(mediaPickerWidgetVH$openMediaPicker$cameraClickHandler$1), Ci.l.RESULT_API_ONLY, 19), null, itemsCountLeft, 1918), new C10779a(z11 ? C10779a.b.PHOTO_AND_VIDEO : C10779a.b.PHOTO), 242);
        Bi.k galleryLauncher = GalleryLauncherComponentKt.getGalleryLauncher(this.refs.getComposerWidgetComponentStorage());
        if (galleryLauncher != null) {
            galleryLauncher.b(b12, new MediaPickerWidgetVH$openMediaPicker$1(this.uploadViewModel));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void openPickObserver$lambda$4(MediaPickerWidgetVH mediaPickerWidgetVH, Pair pair) {
        Intrinsics.checkNotNullParameter(pair, "<destruct>");
        mediaPickerWidgetVH.openMediaPicker(((Number) pair.a()).intValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void openPickerOrShowOnboarding() {
        MediaPickerVO.OnBoardingConfigVO onBoardingConfigVO;
        MediaPickerVO.OnBoardingConfigVO onBoardingConfigVO2;
        MediaPickerVO boundData = getBoundData();
        String onBoardingKey = (boundData == null || (onBoardingConfigVO2 = boundData.getOnBoardingConfigVO()) == null) ? null : onBoardingConfigVO2.getOnBoardingKey();
        if (onBoardingKey == null || Intrinsics.d(this.sharedPreferences.getString("media_picker_onboarding_key", null), onBoardingKey)) {
            this.uploadViewModel.attachMedia();
            return;
        }
        SharedPreferences.Editor edit = this.sharedPreferences.edit();
        edit.putString("media_picker_onboarding_key", onBoardingKey);
        edit.apply();
        MediaPickerVO boundData2 = getBoundData();
        if (boundData2 == null || (onBoardingConfigVO = boundData2.getOnBoardingConfigVO()) == null) {
            return;
        }
        setupOpenGalleryListener();
        this.actionHandler.invoke(onBoardingConfigVO.getAction());
        t tokenizedEvent = onBoardingConfigVO.getTokenizedEvent();
        if (tokenizedEvent != null) {
            m.c(this.tokenizedAnalytics, tokenizedEvent, null);
        }
    }

    private final void removeObservers() {
        UploadingAttachmentsViewModel uploadingAttachmentsViewModel = this.uploadViewModel;
        uploadingAttachmentsViewModel.getAttached().removeObserver(this.attachedObserver);
        uploadingAttachmentsViewModel.getOpenPickScreen().removeObserver(this.openPickObserver);
        uploadingAttachmentsViewModel.getCommonUploadError().removeObserver(this.commonErrorObserver);
        uploadingAttachmentsViewModel.getErrors().removeObserver(this.errorsObserver);
        uploadingAttachmentsViewModel.getSendUploadEvent().removeObserver(this.uploadEventObserver);
        uploadingAttachmentsViewModel.getSendUploadErrorEvent().removeObserver(this.uploadErrorEventObserver);
    }

    private final void setupOpenGalleryListener() {
        r a11;
        G supportFragmentManager;
        ComponentCallbacksC5392m c11 = this.refs.getContainer().c();
        if (c11 == null || (a11 = this.refs.getContainer().a()) == null || (supportFragmentManager = a11.getSupportFragmentManager()) == null) {
            return;
        }
        supportFragmentManager.n1("open_gallery_key", c11, new C2621x(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setupOpenGalleryListener$lambda$30(MediaPickerWidgetVH mediaPickerWidgetVH, String str, Bundle bundle) {
        Intrinsics.checkNotNullParameter(str, "<unused var>");
        Intrinsics.checkNotNullParameter(bundle, "<unused var>");
        mediaPickerWidgetVH.uploadViewModel.attachMedia();
    }

    private final void syncMediaToComposer(List<? extends MediaPickerVO.MediaVO> medias) {
        List<? extends MediaPickerVO.MediaVO> list = medias;
        ArrayList arrayList = new ArrayList(C7714v.z(list, 10));
        for (MediaPickerVO.MediaVO mediaVO : list) {
            arrayList.add(new Pair(Long.valueOf(mediaVO.getAttachment().getId()), mediaVO.getAttachment().getStatus()));
        }
        if (arrayList.equals(this.lastSyncedMedia)) {
            return;
        }
        this.lastSyncedMedia = arrayList;
        this.refs.getController().d(new MediaUpdateKey(medias));
    }

    private final MediaPickerVO.MediaVO toMediaVO(AttachmentVO attachmentVO, MediaPickerVO mediaPickerVO, Map<Long, ? extends MediaPickerVO.MediaVO> map) {
        ImageDTO copy;
        MediaPickerVO.VideoVO copy$default;
        ImageDTO copy2;
        MediaPickerVO.PhotoVO copy$default2;
        if (attachmentVO instanceof AttachmentVO.AttachedImageVO) {
            AttachmentVO.AttachedImageVO attachedImageVO = (AttachmentVO.AttachedImageVO) attachmentVO;
            MediaPickerVO.MediaVO mediaVO = map.get(Long.valueOf(attachedImageVO.getId()));
            MediaPickerVO.PhotoVO photoVO = mediaVO instanceof MediaPickerVO.PhotoVO ? (MediaPickerVO.PhotoVO) mediaVO : null;
            if (photoVO != null && (copy$default2 = MediaPickerVO.PhotoVO.copy$default(photoVO, null, null, null, attachedImageVO, null, 23, null)) != null) {
                return copy$default2;
            }
            copy2 = r9.copy((r34 & 1) != 0 ? r9.image : attachedImageVO.getMediaUri().toString(), (r34 & 2) != 0 ? r9.backgroundColor : null, (r34 & 4) != 0 ? r9.aspectRatio : null, (r34 & 8) != 0 ? r9.hasParanja : true, (r34 & 16) != 0 ? r9.layoutPaddingLeft : null, (r34 & 32) != 0 ? r9.layoutPaddingRight : null, (r34 & 64) != 0 ? r9.layoutPaddingTop : null, (r34 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? r9.layoutPaddingBottom : null, (r34 & 256) != 0 ? r9.cornerRadius : null, (r34 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? r9.context : null, (r34 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? r9.testInfo : null, (r34 & 2048) != 0 ? r9.trackingInfo : null, (r34 & 4096) != 0 ? r9.imageWidth : null, (r34 & 8192) != 0 ? r9.imageType : null, (r34 & 16384) != 0 ? r9.fitType : null, (r34 & 32768) != 0 ? mediaPickerVO.getEmptyItem().getImage().customRatio : null);
            return new MediaPickerVO.PhotoVO(copy2, mediaPickerVO.getEmptyItem().getTokenizedEvent(), mediaPickerVO.getEmptyItem().getRemoveIcon(), attachedImageVO, null, 16, null);
        }
        if (!(attachmentVO instanceof AttachmentVO.AttachedVideoVO)) {
            throw new o();
        }
        AttachmentVO.AttachedVideoVO attachedVideoVO = (AttachmentVO.AttachedVideoVO) attachmentVO;
        MediaPickerVO.MediaVO mediaVO2 = map.get(Long.valueOf(attachedVideoVO.getId()));
        MediaPickerVO.VideoVO videoVO = mediaVO2 instanceof MediaPickerVO.VideoVO ? (MediaPickerVO.VideoVO) mediaVO2 : null;
        if (videoVO != null && (copy$default = MediaPickerVO.VideoVO.copy$default(videoVO, null, null, null, attachedVideoVO, null, 23, null)) != null) {
            return copy$default;
        }
        copy = r9.copy((r34 & 1) != 0 ? r9.image : attachedVideoVO.getMediaUri().toString(), (r34 & 2) != 0 ? r9.backgroundColor : null, (r34 & 4) != 0 ? r9.aspectRatio : null, (r34 & 8) != 0 ? r9.hasParanja : true, (r34 & 16) != 0 ? r9.layoutPaddingLeft : null, (r34 & 32) != 0 ? r9.layoutPaddingRight : null, (r34 & 64) != 0 ? r9.layoutPaddingTop : null, (r34 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? r9.layoutPaddingBottom : null, (r34 & 256) != 0 ? r9.cornerRadius : null, (r34 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? r9.context : null, (r34 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? r9.testInfo : null, (r34 & 2048) != 0 ? r9.trackingInfo : null, (r34 & 4096) != 0 ? r9.imageWidth : null, (r34 & 8192) != 0 ? r9.imageType : null, (r34 & 16384) != 0 ? r9.fitType : null, (r34 & 32768) != 0 ? mediaPickerVO.getEmptyItem().getImage().customRatio : null);
        return new MediaPickerVO.VideoVO(copy, mediaPickerVO.getEmptyItem().getTokenizedEvent(), mediaPickerVO.getEmptyItem().getRemoveIcon(), attachedVideoVO, mediaPickerVO.getEmptyItem().getCenterIcon());
    }

    private final void updateAttaches(List<? extends AttachmentVO> attachments, boolean clearScroll) {
        boolean z11 = true;
        this.view.setCanScroll(!attachments.isEmpty());
        MediaPickerVO boundData = getBoundData();
        if (boundData != null) {
            MediaPickerView mediaPickerView = this.view;
            mediaPickerView.setPadding(mediaPickerView.getPaddingLeft(), mediaPickerView.getPaddingTop(), mediaPickerView.getPaddingRight(), (!boundData.getIsModal() || boundData.getIsExpanded()) ? 0 : Dimens.INSTANCE.getDP_8());
            ArrayList arrayList = new ArrayList();
            List<MediaPickerVO.MediaVO> items = boundData.getItems();
            int h11 = U.h(C7714v.z(items, 10));
            if (h11 < 16) {
                h11 = 16;
            }
            Map<Long, ? extends MediaPickerVO.MediaVO> linkedHashMap = new LinkedHashMap<>(h11);
            for (Object obj : items) {
                linkedHashMap.put(Long.valueOf(((MediaPickerVO.MediaVO) obj).getAttachment().getId()), obj);
            }
            List<? extends AttachmentVO> list = attachments;
            ArrayList arrayList2 = new ArrayList(C7714v.z(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList2.add(toMediaVO((AttachmentVO) it.next(), boundData, linkedHashMap));
            }
            if (attachments.size() < boundData.getMaxItemsCount()) {
                if (!boundData.getIsModal() || boundData.getIsExpanded()) {
                    arrayList.add(updateBadgeState(boundData.getPickerItem(), boundData.getHidePickerBadgeCondition(), arrayList2));
                }
                arrayList.addAll(arrayList2);
                int maxItemsCount = boundData.getMaxItemsCount() - arrayList2.size();
                if (maxItemsCount > 0) {
                    for (int i11 = 0; i11 < maxItemsCount; i11++) {
                        arrayList.add(boundData.getEmptyItem());
                    }
                }
            } else {
                arrayList.addAll(C7714v.K0(arrayList2, boundData.getMaxItemsCount()));
            }
            if (arrayList.equals(this.pickerAdapter.getCurrentList())) {
                return;
            }
            List<MediaPickerVO.PickerItemVO> currentList = this.pickerAdapter.getCurrentList();
            Intrinsics.checkNotNullExpressionValue(currentList, "getCurrentList(...)");
            boolean z12 = (C7714v.M(currentList) instanceof MediaPickerVO.PickerVO) != (C7714v.M(arrayList) instanceof MediaPickerVO.PickerVO);
            if (!this.pendingScrollToStart && !clearScroll && !z12) {
                z11 = false;
            }
            this.pendingScrollToStart = z11;
            this.pickerAdapter.submitList(arrayList, new p(this, 1));
            syncMediaToComposer(arrayList2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void updateAttaches$lambda$21$lambda$20(MediaPickerWidgetVH mediaPickerWidgetVH) {
        if (mediaPickerWidgetVH.pendingScrollToStart) {
            mediaPickerWidgetVH.pendingScrollToStart = false;
            mediaPickerWidgetVH.view.scrollToPosition(0);
        }
    }

    private final MediaPickerVO.PickerVO updateBadgeState(MediaPickerVO.PickerVO pickerVO, MediaPickerDTO.PickerItemBadgeDTO.HideCondition hideCondition, List<? extends MediaPickerVO.MediaVO> list) {
        boolean z11;
        List<? extends MediaPickerVO.MediaVO> list2 = list;
        boolean z12 = list2 instanceof Collection;
        boolean z13 = false;
        if (!z12 || !list2.isEmpty()) {
            for (MediaPickerVO.MediaVO mediaVO : list2) {
                if ((mediaVO.getAttachment() instanceof AttachmentVO.AttachedVideoVO) && mediaVO.getAttachment().getStatus().getIsShowRemover()) {
                    z11 = true;
                    break;
                }
            }
        }
        z11 = false;
        if (!z12 || !list2.isEmpty()) {
            Iterator<T> it = list2.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                MediaPickerVO.MediaVO mediaVO2 = (MediaPickerVO.MediaVO) it.next();
                if ((mediaVO2.getAttachment() instanceof AttachmentVO.AttachedImageVO) && mediaVO2.getAttachment().getStatus().getIsShowRemover()) {
                    z13 = true;
                    break;
                }
            }
        }
        int i11 = hideCondition == null ? -1 : WhenMappings.$EnumSwitchMapping$0[hideCondition.ordinal()];
        BadgeDTO badgeDTO = null;
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 != 3) {
                    badgeDTO = pickerVO.getBadge();
                } else if (!z13 && !z11) {
                    badgeDTO = pickerVO.getBadge();
                }
            } else if (!z11) {
                badgeDTO = pickerVO.getBadge();
            }
        } else if (!z13) {
            badgeDTO = pickerVO.getBadge();
        }
        return MediaPickerVO.PickerVO.copy$default(pickerVO, null, null, null, badgeDTO, 7, null);
    }

    private final void updateUploadedAttachments() {
        MediaPickerVO boundData = getBoundData();
        if (boundData != null) {
            MediaPickerViewModelImpl mediaPickerViewModelImpl = this.mediaPickerViewModel;
            String uploadKey = boundData.getPhotoConfig().getUploadKey();
            MediaPickerDTO.VideoConfig videoConfig = boundData.getVideoConfig();
            String uploadKey2 = videoConfig != null ? videoConfig.getUploadKey() : null;
            List<AttachmentVO> medias = this.uploadViewModel.getMedias();
            if (medias == null) {
                medias = K.f71697a;
            }
            mediaPickerViewModelImpl.onViewIntent(new MediaPickerEvent.AttachmentsUpdated(uploadKey, uploadKey2, medias));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void uploadErrorEventObserver$lambda$9(MediaPickerWidgetVH mediaPickerWidgetVH, Object obj) {
        t uploadErrorEvent;
        MediaPickerVO boundData = mediaPickerWidgetVH.getBoundData();
        if (boundData == null || (uploadErrorEvent = boundData.getUploadErrorEvent()) == null) {
            return;
        }
        TokenizedAnalyticsExtKt.processClickEvents(mediaPickerWidgetVH.tokenizedAnalytics, uploadErrorEvent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void uploadEventObserver$lambda$7(MediaPickerWidgetVH mediaPickerWidgetVH, Object obj) {
        t uploadEvent;
        MediaPickerVO boundData = mediaPickerWidgetVH.getBoundData();
        if (boundData == null || (uploadEvent = boundData.getUploadEvent()) == null) {
            return;
        }
        TokenizedAnalyticsExtKt.processClickEvents(mediaPickerWidgetVH.tokenizedAnalytics, uploadEvent);
    }

    @Override // ru.ozon.composer.ui.widget.k, jk0.j
    public void onAttach() {
        super.onAttach();
        initObservers();
    }

    @Override // ru.ozon.composer.ui.widget.k, jk0.j
    public void onDetach() {
        super.onDetach();
        removeObservers();
        clearOpenGalleryListener();
        this.pickerAdapter.submitList(null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull MediaPickerVO item, @NotNull d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        if (!item.getIsModal()) {
            this.view.setItemAnimator(null);
        }
        UploadingAttachmentsViewModel uploadingAttachmentsViewModel = this.uploadViewModel;
        uploadingAttachmentsViewModel.setUploadImageAction(AtomActionMapperKt.toAtomAction(item.getPhotoConfig().getUploadImageAction(), null));
        MediaPickerDTO.VideoConfig videoConfig = item.getVideoConfig();
        if (videoConfig != null) {
            uploadingAttachmentsViewModel.setUploadVideoType(new VideoUpload(videoConfig.getVideoType(), videoConfig.getUploadVideoActionId()));
        }
        List<MediaPickerVO.MediaVO> items = item.getItems();
        ArrayList arrayList = new ArrayList(C7714v.z(items, 10));
        Iterator<T> it = items.iterator();
        while (it.hasNext()) {
            arrayList.add(((MediaPickerVO.MediaVO) it.next()).getAttachment());
        }
        uploadingAttachmentsViewModel.bindMedia(arrayList, item.getMaxItemsCount());
    }
}
