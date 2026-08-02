package ru.ozon.app.android.returns.creation.widgets.photoPicker.presentation.buttons.viewModel;

import Ae.B0;
import Ae.InterfaceC2397i;
import Ae.M0;
import B0.A0;
import B0.C2454a;
import HY.b;
import Hi.g;
import Hi.l;
import Kk.C3532b;
import Sc.C4005g;
import Sc.s;
import Wc.a;
import androidx.lifecycle.P;
import androidx.lifecycle.V;
import androidx.lifecycle.w0;
import androidx.lifecycle.x0;
import h3.C6788a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.collections.K;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;
import org.json.JSONObject;
import ru.ozon.app.android.domain.gallery.HandleGalleryResult;
import ru.ozon.app.android.mediaupload.attachments.AttachmentVO;
import ru.ozon.app.android.mediaupload.attachments.PickedAttachmentsMapper;
import ru.ozon.app.android.returns.creation.widgets.photoPicker.data.SignedLinkDTO;
import ru.ozon.app.android.returns.creation.widgets.photoPicker.repository.Error;
import ru.ozon.app.android.returns.creation.widgets.photoPicker.repository.MediaFile;
import ru.ozon.app.android.returns.creation.widgets.photoPicker.repository.ReturnCreationPhotoPickerRepository;
import ru.ozon.app.android.returns.creation.widgets.photoPicker.repository.SignedLink;
import ru.ozon.app.android.returns.creation.widgets.photoPicker.repository.UploadingState;
import ru.ozon.app.android.returns.ui.domain.events.ReturnCreationEventManager;
import ru.ozon.app.android.utils.livedata.SingleLiveEvent;
import xe.C10720e0;
import xe.C10727i;
import xe.M;

@Metadata(d1 = {"\u0000\u008c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\"\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0001\u0018\u0000 O2\u00020\u00012\u00020\u0002:\u0003OPQB)\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0011\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0018\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0019\u0010\u0017J\u001f\u0010\u001c\u001a\u0004\u0018\u00010\u00122\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u000f0\u001aH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u001d\u0010\u001f\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t\u0018\u00010\u001eH\u0002¢\u0006\u0004\b\u001f\u0010 J\u0019\u0010\"\u001a\u00020\u0015*\b\u0012\u0004\u0012\u00020\u000f0!H\u0002¢\u0006\u0004\b\"\u0010#J\u001b\u0010$\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\u001eH\u0002¢\u0006\u0004\b$\u0010 J\u0017\u0010'\u001a\u00020\u00122\u0006\u0010&\u001a\u00020%H\u0016¢\u0006\u0004\b'\u0010(J\r\u0010)\u001a\u00020\u0012¢\u0006\u0004\b)\u0010*J\r\u0010+\u001a\u00020\u0012¢\u0006\u0004\b+\u0010*J\u001d\u0010/\u001a\u00020\u00122\u0006\u0010-\u001a\u00020,2\u0006\u0010.\u001a\u00020,¢\u0006\u0004\b/\u00100R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u00101R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u00102R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u00103R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u00104R\u001c\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u000f0!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u00105R\u0016\u0010.\u001a\u00020,8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u00106R\u0016\u0010-\u001a\u00020,8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u00106R\u001a\u00109\u001a\b\u0012\u0004\u0012\u000208078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010:R\"\u0010>\u001a\u0010\u0012\f\u0012\n =*\u0004\u0018\u00010<0<0;8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010?R\u001d\u0010A\u001a\b\u0012\u0004\u0012\u0002080@8\u0006¢\u0006\f\n\u0004\bA\u0010B\u001a\u0004\bC\u0010DR\u001d\u0010E\u001a\b\u0012\u0004\u0012\u00020<0@8\u0006¢\u0006\f\n\u0004\bE\u0010B\u001a\u0004\bF\u0010DR$\u0010G\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bG\u00104\u001a\u0004\bH\u0010I\"\u0004\bJ\u0010KR\u0014\u0010N\u001a\u00020,8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bL\u0010M¨\u0006R"}, d2 = {"Lru/ozon/app/android/returns/creation/widgets/photoPicker/presentation/buttons/viewModel/ButtonsViewModel;", "Landroidx/lifecycle/w0;", "Lru/ozon/app/android/domain/gallery/HandleGalleryResult;", "Lru/ozon/app/android/returns/creation/widgets/photoPicker/repository/ReturnCreationPhotoPickerRepository;", "repository", "Lru/ozon/app/android/mediaupload/attachments/PickedAttachmentsMapper;", "attachmentsMapper", "Lru/ozon/app/android/returns/ui/domain/events/ReturnCreationEventManager;", "returnCreationEventManager", "", "defaultErrorMessage", "<init>", "(Lru/ozon/app/android/returns/creation/widgets/photoPicker/repository/ReturnCreationPhotoPickerRepository;Lru/ozon/app/android/mediaupload/attachments/PickedAttachmentsMapper;Lru/ozon/app/android/returns/ui/domain/events/ReturnCreationEventManager;Ljava/lang/String;)V", "LHi/l;", "attachment", "Lru/ozon/app/android/returns/creation/widgets/photoPicker/repository/MediaFile;", "mapToMedia", "(LHi/l;)Lru/ozon/app/android/returns/creation/widgets/photoPicker/repository/MediaFile;", "", "mapCountToButtonsState", "()Lkotlin/Unit;", "", "isCanOnlyAddPhoto", "()Z", "isCanContinueAndAddPhoto", "isCanOnlyContinue", "", "medias", "mapToLoadingState", "(Ljava/util/Set;)Lkotlin/Unit;", "", "getLoadParamsForAction", "()Ljava/util/Map;", "", "allLoaded", "(Ljava/util/List;)Z", "emptyParams", "LHi/g;", "galleryLaunchResult", "handleGalleryResult", "(LHi/g;)V", "addPhoto", "()V", "continueClicked", "", "minCount", "maxCount", "setMinMaxCount", "(II)V", "Lru/ozon/app/android/returns/creation/widgets/photoPicker/repository/ReturnCreationPhotoPickerRepository;", "Lru/ozon/app/android/mediaupload/attachments/PickedAttachmentsMapper;", "Lru/ozon/app/android/returns/ui/domain/events/ReturnCreationEventManager;", "Ljava/lang/String;", "Ljava/util/List;", "I", "Lru/ozon/app/android/utils/livedata/SingleLiveEvent;", "Lru/ozon/app/android/returns/creation/widgets/photoPicker/presentation/buttons/viewModel/ButtonsViewModel$Action;", "mutableAction", "Lru/ozon/app/android/utils/livedata/SingleLiveEvent;", "Landroidx/lifecycle/V;", "Lru/ozon/app/android/returns/creation/widgets/photoPicker/presentation/buttons/viewModel/ButtonsViewModel$ButtonState;", "kotlin.jvm.PlatformType", "mutableButtonState", "Landroidx/lifecycle/V;", "Landroidx/lifecycle/P;", "action", "Landroidx/lifecycle/P;", "getAction", "()Landroidx/lifecycle/P;", "buttonState", "getButtonState", "actionName", "getActionName", "()Ljava/lang/String;", "setActionName", "(Ljava/lang/String;)V", "getCount", "()I", "count", "Companion", "ButtonState", "Action", "creation_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ButtonsViewModel extends w0 implements HandleGalleryResult {

    @NotNull
    private final P<Action> action;
    private String actionName;

    @NotNull
    private final PickedAttachmentsMapper attachmentsMapper;

    @NotNull
    private final P<ButtonState> buttonState;

    @NotNull
    private final String defaultErrorMessage;
    private int maxCount;

    @NotNull
    private List<MediaFile> medias;
    private int minCount;

    @NotNull
    private final SingleLiveEvent<Action> mutableAction;

    @NotNull
    private final V<ButtonState> mutableButtonState;

    @NotNull
    private final ReturnCreationPhotoPickerRepository repository;

    @NotNull
    private final ReturnCreationEventManager returnCreationEventManager;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
    @e(c = "ru.ozon.app.android.returns.creation.widgets.photoPicker.presentation.buttons.viewModel.ButtonsViewModel$1", f = "ButtonsViewModel.kt", l = {55}, m = "invokeSuspend")
    /* renamed from: ru.ozon.app.android.returns.creation.widgets.photoPicker.presentation.buttons.viewModel.ButtonsViewModel$1, reason: invalid class name */
    static final class AnonymousClass1 extends j implements Function2<M, d<? super Unit>, Object> {
        int label;

        AnonymousClass1(d<? super AnonymousClass1> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d<Unit> create(Object obj, d<?> dVar) {
            return ButtonsViewModel.this.new AnonymousClass1(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            a aVar = a.COROUTINE_SUSPENDED;
            int i11 = this.label;
            if (i11 == 0) {
                s.b(obj);
                M0<Set<MediaFile>> media = ButtonsViewModel.this.repository.getMedia();
                final ButtonsViewModel buttonsViewModel = ButtonsViewModel.this;
                InterfaceC2397i<? super Set<MediaFile>> interfaceC2397i = new InterfaceC2397i() { // from class: ru.ozon.app.android.returns.creation.widgets.photoPicker.presentation.buttons.viewModel.ButtonsViewModel.1.1
                    @Override // Ae.InterfaceC2397i
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, d dVar) {
                        return emit((Set<MediaFile>) obj2, (d<? super Unit>) dVar);
                    }

                    public final Object emit(Set<MediaFile> set, d<? super Unit> dVar) {
                        ButtonsViewModel.this.medias = C7714v.U0(set);
                        ButtonsViewModel.this.mapCountToButtonsState();
                        ButtonsViewModel.this.mapToLoadingState(set);
                        return Unit.f71690a;
                    }
                };
                this.label = 1;
                if (media.collect(interfaceC2397i, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                s.b(obj);
            }
            throw new C4005g();
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, d<? super Unit> dVar) {
            return ((AnonymousClass1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
    @e(c = "ru.ozon.app.android.returns.creation.widgets.photoPicker.presentation.buttons.viewModel.ButtonsViewModel$2", f = "ButtonsViewModel.kt", l = {62}, m = "invokeSuspend")
    /* renamed from: ru.ozon.app.android.returns.creation.widgets.photoPicker.presentation.buttons.viewModel.ButtonsViewModel$2, reason: invalid class name */
    static final class AnonymousClass2 extends j implements Function2<M, d<? super Unit>, Object> {
        int label;

        AnonymousClass2(d<? super AnonymousClass2> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d<Unit> create(Object obj, d<?> dVar) {
            return ButtonsViewModel.this.new AnonymousClass2(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            a aVar = a.COROUTINE_SUSPENDED;
            int i11 = this.label;
            if (i11 == 0) {
                s.b(obj);
                B0<Error> error = ButtonsViewModel.this.repository.getError();
                final ButtonsViewModel buttonsViewModel = ButtonsViewModel.this;
                InterfaceC2397i<? super Error> interfaceC2397i = new InterfaceC2397i() { // from class: ru.ozon.app.android.returns.creation.widgets.photoPicker.presentation.buttons.viewModel.ButtonsViewModel.2.1
                    @Override // Ae.InterfaceC2397i
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, d dVar) {
                        return emit((Error) obj2, (d<? super Unit>) dVar);
                    }

                    public final Object emit(Error error2, d<? super Unit> dVar) {
                        String message;
                        boolean z11 = error2 instanceof Error.FlashBar;
                        if (z11) {
                            ButtonsViewModel.this.mutableAction.postValue(new Action.Error(((Error.FlashBar) error2).getMessage()));
                        } else if (error2 instanceof Error.DefaultFlashbar) {
                            ButtonsViewModel.this.mutableAction.postValue(new Action.Error(ButtonsViewModel.this.defaultErrorMessage));
                        }
                        Error.FlashBar flashBar = z11 ? (Error.FlashBar) error2 : null;
                        if (flashBar != null && (message = flashBar.getMessage()) != null) {
                            ButtonsViewModel.this.mutableAction.postValue(new Action.Error(message));
                        }
                        return Unit.f71690a;
                    }
                };
                this.label = 1;
                if (error.collect(interfaceC2397i, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                s.b(obj);
            }
            throw new C4005g();
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, d<? super Unit> dVar) {
            return ((AnonymousClass2) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lru/ozon/app/android/returns/creation/widgets/photoPicker/presentation/buttons/viewModel/ButtonsViewModel$Action;", "", "Continue", "OpenMediaPicker", "Error", "Lru/ozon/app/android/returns/creation/widgets/photoPicker/presentation/buttons/viewModel/ButtonsViewModel$Action$Continue;", "Lru/ozon/app/android/returns/creation/widgets/photoPicker/presentation/buttons/viewModel/ButtonsViewModel$Action$Error;", "Lru/ozon/app/android/returns/creation/widgets/photoPicker/presentation/buttons/viewModel/ButtonsViewModel$Action$OpenMediaPicker;", "creation_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface Action {

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R#\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/returns/creation/widgets/photoPicker/presentation/buttons/viewModel/ButtonsViewModel$Action$Continue;", "Lru/ozon/app/android/returns/creation/widgets/photoPicker/presentation/buttons/viewModel/ButtonsViewModel$Action;", "", "", "params", "<init>", "(Ljava/util/Map;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/Map;", "getParams", "()Ljava/util/Map;", "creation_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Continue implements Action {

            @NotNull
            private final Map<String, String> params;

            public Continue(@NotNull Map<String, String> params) {
                Intrinsics.checkNotNullParameter(params, "params");
                this.params = params;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Continue) && Intrinsics.d(this.params, ((Continue) other).params);
            }

            @NotNull
            public final Map<String, String> getParams() {
                return this.params;
            }

            public int hashCode() {
                return this.params.hashCode();
            }

            @NotNull
            public String toString() {
                return b.b("Continue(params=", ")", this.params);
            }
        }

        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0011\u0010\u0007¨\u0006\u0012"}, d2 = {"Lru/ozon/app/android/returns/creation/widgets/photoPicker/presentation/buttons/viewModel/ButtonsViewModel$Action$Error;", "Lru/ozon/app/android/returns/creation/widgets/photoPicker/presentation/buttons/viewModel/ButtonsViewModel$Action;", "", "message", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getMessage", "creation_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Error implements Action {

            @NotNull
            private final String message;

            public Error(@NotNull String message) {
                Intrinsics.checkNotNullParameter(message, "message");
                this.message = message;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Error) && Intrinsics.d(this.message, ((Error) other).message);
            }

            @NotNull
            public final String getMessage() {
                return this.message;
            }

            public int hashCode() {
                return this.message.hashCode();
            }

            @NotNull
            public String toString() {
                return A0.b("Error(message=", this.message, ")");
            }
        }

        @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\fR\u001d\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/returns/creation/widgets/photoPicker/presentation/buttons/viewModel/ButtonsViewModel$Action$OpenMediaPicker;", "Lru/ozon/app/android/returns/creation/widgets/photoPicker/presentation/buttons/viewModel/ButtonsViewModel$Action;", "", "maxCount", "", "selectedIds", "<init>", "(ILjava/util/List;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getMaxCount", "Ljava/util/List;", "getSelectedIds", "()Ljava/util/List;", "creation_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class OpenMediaPicker implements Action {
            private final int maxCount;

            @NotNull
            private final List<Integer> selectedIds;

            public OpenMediaPicker(int i11, @NotNull List<Integer> selectedIds) {
                Intrinsics.checkNotNullParameter(selectedIds, "selectedIds");
                this.maxCount = i11;
                this.selectedIds = selectedIds;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof OpenMediaPicker)) {
                    return false;
                }
                OpenMediaPicker openMediaPicker = (OpenMediaPicker) other;
                return this.maxCount == openMediaPicker.maxCount && Intrinsics.d(this.selectedIds, openMediaPicker.selectedIds);
            }

            public final int getMaxCount() {
                return this.maxCount;
            }

            @NotNull
            public final List<Integer> getSelectedIds() {
                return this.selectedIds;
            }

            public int hashCode() {
                return this.selectedIds.hashCode() + (Integer.hashCode(this.maxCount) * 31);
            }

            @NotNull
            public String toString() {
                return "OpenMediaPicker(maxCount=" + this.maxCount + ", selectedIds=" + this.selectedIds + ")";
            }
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J.\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0011\u001a\u00020\u00022\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0003\u0010\u0014R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0013\u001a\u0004\b\u0015\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0013\u001a\u0004\b\u0016\u0010\u0014¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/returns/creation/widgets/photoPicker/presentation/buttons/viewModel/ButtonsViewModel$ButtonState;", "", "", "isLoading", "canContinue", "canAddPhoto", "<init>", "(ZZZ)V", "copy", "(ZZZ)Lru/ozon/app/android/returns/creation/widgets/photoPicker/presentation/buttons/viewModel/ButtonsViewModel$ButtonState;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "()Z", "getCanContinue", "getCanAddPhoto", "creation_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ButtonState {
        private final boolean canAddPhoto;
        private final boolean canContinue;
        private final boolean isLoading;

        public ButtonState(boolean z11, boolean z12, boolean z13) {
            this.isLoading = z11;
            this.canContinue = z12;
            this.canAddPhoto = z13;
        }

        public static /* synthetic */ ButtonState copy$default(ButtonState buttonState, boolean z11, boolean z12, boolean z13, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                z11 = buttonState.isLoading;
            }
            if ((i11 & 2) != 0) {
                z12 = buttonState.canContinue;
            }
            if ((i11 & 4) != 0) {
                z13 = buttonState.canAddPhoto;
            }
            return buttonState.copy(z11, z12, z13);
        }

        @NotNull
        public final ButtonState copy(boolean isLoading, boolean canContinue, boolean canAddPhoto) {
            return new ButtonState(isLoading, canContinue, canAddPhoto);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ButtonState)) {
                return false;
            }
            ButtonState buttonState = (ButtonState) other;
            return this.isLoading == buttonState.isLoading && this.canContinue == buttonState.canContinue && this.canAddPhoto == buttonState.canAddPhoto;
        }

        public final boolean getCanAddPhoto() {
            return this.canAddPhoto;
        }

        public final boolean getCanContinue() {
            return this.canContinue;
        }

        public int hashCode() {
            return Boolean.hashCode(this.canAddPhoto) + C3532b.a(Boolean.hashCode(this.isLoading) * 31, 31, this.canContinue);
        }

        /* renamed from: isLoading, reason: from getter */
        public final boolean getIsLoading() {
            return this.isLoading;
        }

        @NotNull
        public String toString() {
            boolean z11 = this.isLoading;
            boolean z12 = this.canContinue;
            return Pk0.a.a(")", Lh.a.d("ButtonState(isLoading=", ", canContinue=", ", canAddPhoto=", z11, z12), this.canAddPhoto);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\tX\u0086T¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lru/ozon/app/android/returns/creation/widgets/photoPicker/presentation/buttons/viewModel/ButtonsViewModel$Companion;", "", "<init>", "()V", "IMAGE_LOCATIONS_JSON_PARAM", "", "ARG_BUCKET", "ARG_KEY", "INITIAL_MAX_COUNT", "", "INITIAL_MIN_COUNT", "creation_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public ButtonsViewModel(@NotNull ReturnCreationPhotoPickerRepository repository, @NotNull PickedAttachmentsMapper attachmentsMapper, @NotNull ReturnCreationEventManager returnCreationEventManager, @NotNull String defaultErrorMessage) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        Intrinsics.checkNotNullParameter(attachmentsMapper, "attachmentsMapper");
        Intrinsics.checkNotNullParameter(returnCreationEventManager, "returnCreationEventManager");
        Intrinsics.checkNotNullParameter(defaultErrorMessage, "defaultErrorMessage");
        this.repository = repository;
        this.attachmentsMapper = attachmentsMapper;
        this.returnCreationEventManager = returnCreationEventManager;
        this.defaultErrorMessage = defaultErrorMessage;
        this.medias = K.f71697a;
        this.minCount = -1;
        SingleLiveEvent<Action> singleLiveEvent = new SingleLiveEvent<>();
        this.mutableAction = singleLiveEvent;
        V<ButtonState> v11 = new V<>(new ButtonState(false, false, false));
        this.mutableButtonState = v11;
        this.action = singleLiveEvent;
        this.buttonState = v11;
        C6788a a11 = x0.a(this);
        C10720e0 c10720e0 = C10720e0.f105451a;
        C10727i.c(a11, De.s.f6650a, null, new AnonymousClass1(null), 2);
        C10727i.c(x0.a(this), null, null, new AnonymousClass2(null), 3);
    }

    private final boolean allLoaded(List<MediaFile> list) {
        List<MediaFile> list2 = list;
        if ((list2 instanceof Collection) && list2.isEmpty()) {
            return true;
        }
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            if (!Intrinsics.d(((MediaFile) it.next()).getUploadingState(), UploadingState.Uploaded.INSTANCE)) {
                return false;
            }
        }
        return true;
    }

    private final Map<String, String> emptyParams() {
        return C2454a.b("imageLocations", "[]");
    }

    private final int getCount() {
        return this.medias.size();
    }

    private final Map<String, String> getLoadParamsForAction() {
        List<MediaFile> list = this.medias;
        ArrayList<SignedLinkDTO.ImageLocation> arrayList = new ArrayList();
        Iterator<T> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            SignedLink signedLink = ((MediaFile) it.next()).getSignedLink();
            SignedLinkDTO.ImageLocation imageLocation = signedLink != null ? signedLink.getImageLocation() : null;
            if (imageLocation != null) {
                arrayList.add(imageLocation);
            }
        }
        ArrayList arrayList2 = new ArrayList(C7714v.z(arrayList, 10));
        for (SignedLinkDTO.ImageLocation imageLocation2 : arrayList) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("bucket", imageLocation2.getBucket());
            jSONObject.put("key", imageLocation2.getKey());
            arrayList2.add(jSONObject);
        }
        if (arrayList2.isEmpty()) {
            arrayList2 = null;
        }
        if (arrayList2 != null) {
            return C2454a.b("imageLocations", new JSONArray((Collection) arrayList2).toString());
        }
        return null;
    }

    private final boolean isCanContinueAndAddPhoto() {
        if (this.minCount != 0) {
            int i11 = this.maxCount - 1;
            int count = getCount();
            if (1 > count || count > i11) {
                return false;
            }
        }
        return true;
    }

    private final boolean isCanOnlyAddPhoto() {
        return getCount() == 0 && this.minCount != 0;
    }

    private final boolean isCanOnlyContinue() {
        return getCount() == this.maxCount;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Unit mapCountToButtonsState() {
        ButtonState value;
        if (isCanOnlyAddPhoto()) {
            ButtonState value2 = this.buttonState.getValue();
            if (value2 != null) {
                value = ButtonState.copy$default(value2, false, false, true, 1, null);
            }
            value = null;
        } else if (isCanContinueAndAddPhoto()) {
            ButtonState value3 = this.buttonState.getValue();
            if (value3 != null) {
                value = ButtonState.copy$default(value3, false, true, true, 1, null);
            }
            value = null;
        } else if (isCanOnlyContinue()) {
            ButtonState value4 = this.buttonState.getValue();
            if (value4 != null) {
                value = ButtonState.copy$default(value4, false, true, false, 1, null);
            }
            value = null;
        } else {
            value = this.buttonState.getValue();
        }
        if (value == null) {
            return null;
        }
        this.mutableButtonState.setValue(value);
        return Unit.f71690a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Unit mapToLoadingState(Set<MediaFile> medias) {
        ButtonState value = this.buttonState.getValue();
        if (value == null) {
            return null;
        }
        Set<MediaFile> set = medias;
        boolean z11 = false;
        if (!(set instanceof Collection) || !set.isEmpty()) {
            Iterator<T> it = set.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                if (Intrinsics.d(((MediaFile) it.next()).getUploadingState(), UploadingState.Loading.INSTANCE)) {
                    z11 = true;
                    break;
                }
            }
        }
        ButtonState copy$default = ButtonState.copy$default(value, z11, false, false, 6, null);
        if (copy$default == null) {
            return null;
        }
        this.mutableButtonState.setValue(copy$default);
        return Unit.f71690a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final MediaFile mapToMedia(l attachment) {
        AttachmentVO map = this.attachmentsMapper.map(attachment);
        AttachmentVO.AttachedImageVO attachedImageVO = map instanceof AttachmentVO.AttachedImageVO ? (AttachmentVO.AttachedImageVO) map : null;
        if (attachedImageVO == null) {
            return null;
        }
        return new MediaFile(attachment.getId(), attachedImageVO, null, UploadingState.Pending.INSTANCE);
    }

    public final void addPhoto() {
        SingleLiveEvent<Action> singleLiveEvent = this.mutableAction;
        int count = this.maxCount - getCount();
        List<MediaFile> list = this.medias;
        ArrayList arrayList = new ArrayList(C7714v.z(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf((int) ((MediaFile) it.next()).getId()));
        }
        singleLiveEvent.setValue(new Action.OpenMediaPicker(count, arrayList));
    }

    public final void continueClicked() {
        int i11;
        Map<String, String> loadParamsForAction = getLoadParamsForAction();
        boolean z11 = loadParamsForAction != null;
        List<MediaFile> list = this.medias;
        if ((list instanceof Collection) && list.isEmpty()) {
            i11 = 0;
        } else {
            Iterator<T> it = list.iterator();
            i11 = 0;
            while (it.hasNext()) {
                if (((MediaFile) it.next()).getSignedLink() != null && (i11 = i11 + 1) < 0) {
                    C7714v.N0();
                    throw null;
                }
            }
        }
        boolean z12 = i11 >= this.minCount;
        boolean z13 = getCount() == 0 && this.minCount == 0;
        if (z11 && z12 && allLoaded(this.medias)) {
            if (loadParamsForAction != null) {
                this.mutableAction.setValue(new Action.Continue(loadParamsForAction));
            }
        } else if (z13) {
            this.mutableAction.setValue(new Action.Continue(emptyParams()));
        } else {
            C10727i.c(x0.a(this), null, null, new ButtonsViewModel$continueClicked$3(this, null), 3);
        }
    }

    @NotNull
    public final P<Action> getAction() {
        return this.action;
    }

    public final String getActionName() {
        return this.actionName;
    }

    @NotNull
    public final P<ButtonState> getButtonState() {
        return this.buttonState;
    }

    @Override // ru.ozon.app.android.domain.gallery.HandleGalleryResult
    public void handleGalleryResult(@NotNull g galleryLaunchResult) {
        Intrinsics.checkNotNullParameter(galleryLaunchResult, "galleryLaunchResult");
        C10727i.c(x0.a(this), null, null, new ButtonsViewModel$handleGalleryResult$1(this, galleryLaunchResult, null), 3);
    }

    public final void setActionName(String str) {
        this.actionName = str;
    }

    public final void setMinMaxCount(int minCount, int maxCount) {
        this.minCount = minCount;
        this.maxCount = maxCount;
        mapCountToButtonsState();
    }
}
