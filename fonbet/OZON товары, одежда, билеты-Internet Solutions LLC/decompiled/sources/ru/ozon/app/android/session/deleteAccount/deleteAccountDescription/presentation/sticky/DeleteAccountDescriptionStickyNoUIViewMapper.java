package ru.ozon.app.android.session.deleteAccount.deleteAccountDescription.presentation.sticky;

import Pc.a;
import android.view.ViewGroup;
import androidx.lifecycle.w0;
import androidx.lifecycle.z0;
import j10.h;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.view.ComposerViewExtensionKt;
import ru.ozon.app.android.composer.widgets.base.view.mapper.overlay.SingleNoUiViewMapper;
import ru.ozon.app.android.session.R$layout;
import ru.ozon.app.android.session.deleteAccount.deleteAccountDescription.data.DeleteAccountDescriptionDTO;
import ru.ozon.composer.ui.widget.l;
import ru.ozon.uni.android.uikit.extensions.view.ViewGroupExtKt;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;

@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0017\b\u0007\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\u000b\u001a\u0004\u0018\u00010\u0003*\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ1\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0010\u0010\u0014\u001a\f\u0012\u0004\u0012\u00020\u00120\u0011j\u0002`\u0013H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J+\u0010\u001a\u001a\u00020\u00152\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\n\u0010\u0019\u001a\u00060\u0012j\u0002`\u0018H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ+\u0010\u001c\u001a\u00020\u00152\u0006\u0010\u000e\u001a\u00020\r2\n\u0010\u0019\u001a\u00060\u0012j\u0002`\u00182\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u001c\u0010\u001dR\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u001eR6\u0010#\u001a\u001e\u0012\u0004\u0012\u00020\u0002\u0012\b\u0012\u00060 j\u0002`!\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\"0\u001f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u0018\u0010(\u001a\u0004\u0018\u00010'8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010)¨\u0006*"}, d2 = {"Lru/ozon/app/android/session/deleteAccount/deleteAccountDescription/presentation/sticky/DeleteAccountDescriptionStickyNoUIViewMapper;", "Lru/ozon/app/android/composer/widgets/base/view/mapper/overlay/SingleNoUiViewMapper;", "Lru/ozon/app/android/session/deleteAccount/deleteAccountDescription/data/DeleteAccountDescriptionDTO;", "Lru/ozon/app/android/session/deleteAccount/deleteAccountDescription/presentation/sticky/DeleteAccountDescriptionStickyVO;", "LPc/a;", "Lru/ozon/app/android/session/deleteAccount/deleteAccountDescription/presentation/sticky/DeleteAccountDescriptionStickyViewModelImpl;", "pViewModel", "<init>", "(LPc/a;)V", "", "stateId", "toStickyVO", "(Lru/ozon/app/android/session/deleteAccount/deleteAccountDescription/data/DeleteAccountDescriptionDTO;Ljava/lang/String;)Lru/ozon/app/android/session/deleteAccount/deleteAccountDescription/presentation/sticky/DeleteAccountDescriptionStickyVO;", "Landroid/view/ViewGroup;", "composerRootView", "Lru/ozon/app/android/composer/ComposerReferences;", "references", "Lj10/h;", "Lru/ozon/composer/ui/widget/l;", "Lru/ozon/app/android/composer/viewmodel/ComposerVoHelper;", "voHelper", "", "constructLayout", "(Landroid/view/ViewGroup;Lru/ozon/app/android/composer/ComposerReferences;Lj10/h;)V", "Lru/ozon/app/android/composer/view/ComposerViewObject;", "viewObject", "removeView", "(Landroid/view/ViewGroup;Lru/ozon/app/android/composer/ComposerReferences;Lru/ozon/composer/ui/widget/l;)V", "bind", "(Landroid/view/ViewGroup;Lru/ozon/composer/ui/widget/l;Lru/ozon/app/android/composer/ComposerReferences;)V", "LPc/a;", "Lkotlin/Function2;", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "", "mapper", "Lkotlin/jvm/functions/Function2;", "getMapper", "()Lkotlin/jvm/functions/Function2;", "Lru/ozon/app/android/session/deleteAccount/deleteAccountDescription/presentation/sticky/DeleteAccountDescriptionStickyBinder;", "binder", "Lru/ozon/app/android/session/deleteAccount/deleteAccountDescription/presentation/sticky/DeleteAccountDescriptionStickyBinder;", "session_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class DeleteAccountDescriptionStickyNoUIViewMapper extends SingleNoUiViewMapper<DeleteAccountDescriptionDTO, DeleteAccountDescriptionStickyVO> {
    private DeleteAccountDescriptionStickyBinder binder;

    @NotNull
    private final Function2<DeleteAccountDescriptionDTO, d, List<DeleteAccountDescriptionStickyVO>> mapper;

    @NotNull
    private final a<DeleteAccountDescriptionStickyViewModelImpl> pViewModel;

    public DeleteAccountDescriptionStickyNoUIViewMapper(@NotNull a<DeleteAccountDescriptionStickyViewModelImpl> pViewModel) {
        Intrinsics.checkNotNullParameter(pViewModel, "pViewModel");
        this.pViewModel = pViewModel;
        this.mapper = new DeleteAccountDescriptionStickyNoUIViewMapper$mapper$1(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final DeleteAccountDescriptionStickyVO toStickyVO(DeleteAccountDescriptionDTO deleteAccountDescriptionDTO, String str) {
        DeleteAccountDescriptionDTO.Reason.Input input;
        String str2 = null;
        if (deleteAccountDescriptionDTO.getStickyButton() == null) {
            return null;
        }
        long a11 = Ih.a.a("DeleteAccountDescriptionStickyVO", str);
        ButtonV3Atom.LargeButton stickyButton = deleteAccountDescriptionDTO.getStickyButton();
        if (stickyButton.getTheme() == null) {
            stickyButton = null;
        }
        if (stickyButton == null) {
            stickyButton = ButtonV3Atom.LargeButton.copy$default(deleteAccountDescriptionDTO.getStickyButton(), null, null, ButtonV3Atom.LargeButton.LargeButtonStyle.STYLE_TYPE_SECONDARY, null, null, null, null, null, null, 507, null);
        }
        DeleteAccountDescriptionDTO.Reason reason = deleteAccountDescriptionDTO.getReason();
        if (reason != null && (input = reason.getInput()) != null) {
            str2 = input.getId();
        }
        if (str2 == null) {
            str2 = "";
        }
        return new DeleteAccountDescriptionStickyVO(a11, stickyButton, new Pair(str2, ""));
    }

    @Override // ru.ozon.app.android.composer.widgets.base.view.mapper.overlay.SingleNoUiViewMapper
    public void bind(@NotNull ViewGroup composerRootView, @NotNull l viewObject, @NotNull ComposerReferences references) {
        Intrinsics.checkNotNullParameter(composerRootView, "composerRootView");
        Intrinsics.checkNotNullParameter(viewObject, "viewObject");
        Intrinsics.checkNotNullParameter(references, "references");
        DeleteAccountDescriptionStickyBinder deleteAccountDescriptionStickyBinder = this.binder;
        if (deleteAccountDescriptionStickyBinder != null) {
            c d11 = viewObject.d();
            Intrinsics.g(d11, "null cannot be cast to non-null type ru.ozon.app.android.session.deleteAccount.deleteAccountDescription.presentation.sticky.DeleteAccountDescriptionStickyVO");
            deleteAccountDescriptionStickyBinder.bind((DeleteAccountDescriptionStickyVO) d11);
        }
    }

    @Override // ru.ozon.app.android.composer.widgets.base.view.mapper.overlay.SingleNoUiViewMapper
    public void constructLayout(@NotNull ViewGroup composerRootView, @NotNull ComposerReferences references, @NotNull h<l> voHelper) {
        Intrinsics.checkNotNullParameter(composerRootView, "composerRootView");
        Intrinsics.checkNotNullParameter(references, "references");
        Intrinsics.checkNotNullParameter(voHelper, "voHelper");
        DeleteAccountDescriptionStickyViewModelImpl deleteAccountDescriptionStickyViewModelImpl = (DeleteAccountDescriptionStickyViewModelImpl) new z0(references.getViewModelOwnerProvider().a(), new z0.c() { // from class: ru.ozon.app.android.session.deleteAccount.deleteAccountDescription.presentation.sticky.DeleteAccountDescriptionStickyNoUIViewMapper$constructLayout$$inlined$createViewModel$1
            @Override // androidx.lifecycle.z0.c, androidx.lifecycle.z0.b
            public <T extends w0> T create(Class<T> modelClass) {
                a aVar;
                Intrinsics.checkNotNullParameter(modelClass, "modelClass");
                aVar = DeleteAccountDescriptionStickyNoUIViewMapper.this.pViewModel;
                DeleteAccountDescriptionStickyViewModelImpl deleteAccountDescriptionStickyViewModelImpl2 = (DeleteAccountDescriptionStickyViewModelImpl) aVar.get();
                Intrinsics.g(deleteAccountDescriptionStickyViewModelImpl2, "null cannot be cast to non-null type T of ru.ozon.app.android.utils.lifecycle.ViewModelExtKt.vmFactory.<no name provided>.create");
                return deleteAccountDescriptionStickyViewModelImpl2;
            }
        }).a(DeleteAccountDescriptionStickyViewModelImpl.class);
        Intrinsics.f(deleteAccountDescriptionStickyViewModelImpl);
        DeleteAccountDescriptionStickyBinder deleteAccountDescriptionStickyBinder = new DeleteAccountDescriptionStickyBinder(deleteAccountDescriptionStickyViewModelImpl, references.getContainer(), references);
        this.binder = deleteAccountDescriptionStickyBinder;
        deleteAccountDescriptionStickyBinder.setView(new DeleteAccountDescriptionStickyView(composerRootView, ViewGroupExtKt.inflate(ComposerViewExtensionKt.composerBottomContainer(composerRootView), R$layout.widget_delete_account_description_sticky, true), references, voHelper));
    }

    @Override // ru.ozon.app.android.composer.widgets.base.view.mapper.overlay.NoUIViewMapper
    @NotNull
    public Function2<DeleteAccountDescriptionDTO, d, List<DeleteAccountDescriptionStickyVO>> getMapper() {
        return this.mapper;
    }

    @Override // ru.ozon.app.android.composer.widgets.base.view.mapper.overlay.SingleNoUiViewMapper
    public void removeView(@NotNull ViewGroup composerRootView, @NotNull ComposerReferences references, @NotNull l viewObject) {
        Intrinsics.checkNotNullParameter(composerRootView, "composerRootView");
        Intrinsics.checkNotNullParameter(references, "references");
        Intrinsics.checkNotNullParameter(viewObject, "viewObject");
        super.removeView(composerRootView, references, viewObject);
        DeleteAccountDescriptionStickyBinder deleteAccountDescriptionStickyBinder = this.binder;
        if (deleteAccountDescriptionStickyBinder == null || deleteAccountDescriptionStickyBinder.onRemove() == null) {
            return;
        }
        this.binder = null;
    }
}
