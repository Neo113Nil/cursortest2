package ru.ozon.app.android.session.deleteAccount.deleteAccountDescription.presentation.sticky;

import a00.C4911f;
import i10.l;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import l10.InterfaceC7851b;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.ComposerNavigator;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.session.deleteAccount.deleteAccountDescription.presentation.sticky.DeleteAccountDescriptionStickyViewModel;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0007\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001b\u0010\u0006\u001a\u00060\u0004j\u0002`\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0018\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\u001f¨\u0006 "}, d2 = {"Lru/ozon/app/android/session/deleteAccount/deleteAccountDescription/presentation/sticky/DeleteAccountDescriptionStickyBinder;", "", "Lru/ozon/app/android/session/deleteAccount/deleteAccountDescription/presentation/sticky/DeleteAccountDescriptionStickyViewModel;", "viewModel", "La00/f;", "Lru/ozon/app/android/composer/OwnerContainer;", "owner", "Lru/ozon/app/android/composer/ComposerReferences;", "references", "<init>", "(Lru/ozon/app/android/session/deleteAccount/deleteAccountDescription/presentation/sticky/DeleteAccountDescriptionStickyViewModel;La00/f;Lru/ozon/app/android/composer/ComposerReferences;)V", "Lru/ozon/app/android/session/deleteAccount/deleteAccountDescription/presentation/sticky/DeleteAccountDescriptionStickyView;", "view", "", "setView", "(Lru/ozon/app/android/session/deleteAccount/deleteAccountDescription/presentation/sticky/DeleteAccountDescriptionStickyView;)V", "Lru/ozon/app/android/session/deleteAccount/deleteAccountDescription/presentation/sticky/DeleteAccountDescriptionStickyVO;", "vo", "bind", "(Lru/ozon/app/android/session/deleteAccount/deleteAccountDescription/presentation/sticky/DeleteAccountDescriptionStickyVO;)V", "onRemove", "()Lkotlin/Unit;", "Lru/ozon/app/android/session/deleteAccount/deleteAccountDescription/presentation/sticky/DeleteAccountDescriptionStickyViewModel;", "getViewModel", "()Lru/ozon/app/android/session/deleteAccount/deleteAccountDescription/presentation/sticky/DeleteAccountDescriptionStickyViewModel;", "La00/f;", "getOwner", "()La00/f;", "Lru/ozon/app/android/composer/ComposerReferences;", "getReferences", "()Lru/ozon/app/android/composer/ComposerReferences;", "Lru/ozon/app/android/session/deleteAccount/deleteAccountDescription/presentation/sticky/DeleteAccountDescriptionStickyView;", "session_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class DeleteAccountDescriptionStickyBinder {

    @NotNull
    private final C4911f owner;

    @NotNull
    private final ComposerReferences references;
    private DeleteAccountDescriptionStickyView view;

    @NotNull
    private final DeleteAccountDescriptionStickyViewModel viewModel;

    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "action", "Lru/ozon/app/android/session/deleteAccount/deleteAccountDescription/presentation/sticky/DeleteAccountDescriptionStickyViewModel$Action;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.session.deleteAccount.deleteAccountDescription.presentation.sticky.DeleteAccountDescriptionStickyBinder$1, reason: invalid class name */
    static final class AnonymousClass1 extends AbstractC7737t implements Function1<DeleteAccountDescriptionStickyViewModel.Action, Unit> {
        AnonymousClass1() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(DeleteAccountDescriptionStickyViewModel.Action action) {
            invoke2(action);
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(DeleteAccountDescriptionStickyViewModel.Action action) {
            Intrinsics.checkNotNullParameter(action, "action");
            DeleteAccountDescriptionStickyBinder.this.getReferences().getController().hideLoader();
            if (Intrinsics.d(action, DeleteAccountDescriptionStickyViewModel.Action.Loading.INSTANCE)) {
                DeleteAccountDescriptionStickyBinder.this.getReferences().getController().e(new l.a.C1079a(0L, null, 3));
                return;
            }
            if (action instanceof DeleteAccountDescriptionStickyViewModel.Action.Navigate) {
                DeleteAccountDescriptionStickyView deleteAccountDescriptionStickyView = DeleteAccountDescriptionStickyBinder.this.view;
                if (deleteAccountDescriptionStickyView != null) {
                    deleteAccountDescriptionStickyView.hideKeyboard();
                }
                ComposerNavigator.DefaultImpls.openDeeplink$default(DeleteAccountDescriptionStickyBinder.this.getReferences().getNavigator(), ((DeleteAccountDescriptionStickyViewModel.Action.Navigate) action).getDeeplink(), null, 2, null);
                return;
            }
            if (action instanceof DeleteAccountDescriptionStickyViewModel.Action.Restriction) {
                DeleteAccountDescriptionStickyView deleteAccountDescriptionStickyView2 = DeleteAccountDescriptionStickyBinder.this.view;
                if (deleteAccountDescriptionStickyView2 != null) {
                    deleteAccountDescriptionStickyView2.showRestriction(((DeleteAccountDescriptionStickyViewModel.Action.Restriction) action).getMessage());
                    return;
                }
                return;
            }
            if (action instanceof DeleteAccountDescriptionStickyViewModel.Action.Reload) {
                DeleteAccountDescriptionStickyView deleteAccountDescriptionStickyView3 = DeleteAccountDescriptionStickyBinder.this.view;
                if (deleteAccountDescriptionStickyView3 != null) {
                    deleteAccountDescriptionStickyView3.hideKeyboard();
                }
                InterfaceC7851b.a.a(DeleteAccountDescriptionStickyBinder.this.getReferences().getController(), ((DeleteAccountDescriptionStickyViewModel.Action.Reload) action).getDeeplink(), null, null, null, 14);
            }
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "state", "Lru/ozon/app/android/session/deleteAccount/deleteAccountDescription/presentation/sticky/DeleteAccountDescriptionStickyViewModel$State;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.session.deleteAccount.deleteAccountDescription.presentation.sticky.DeleteAccountDescriptionStickyBinder$2, reason: invalid class name */
    static final class AnonymousClass2 extends AbstractC7737t implements Function1<DeleteAccountDescriptionStickyViewModel.State, Unit> {
        AnonymousClass2() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(DeleteAccountDescriptionStickyViewModel.State state) {
            invoke2(state);
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(DeleteAccountDescriptionStickyViewModel.State state) {
            DeleteAccountDescriptionStickyVO data;
            ButtonV3Atom.LargeButton stickyButton;
            DeleteAccountDescriptionStickyView deleteAccountDescriptionStickyView;
            Intrinsics.checkNotNullParameter(state, "state");
            if (state.getIsSilent()) {
                state = null;
            }
            if (state == null || (data = state.getData()) == null || (stickyButton = data.getStickyButton()) == null || (deleteAccountDescriptionStickyView = DeleteAccountDescriptionStickyBinder.this.view) == null) {
                return;
            }
            deleteAccountDescriptionStickyView.bind(stickyButton);
        }
    }

    public DeleteAccountDescriptionStickyBinder(@NotNull DeleteAccountDescriptionStickyViewModel viewModel, @NotNull C4911f owner, @NotNull ComposerReferences references) {
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        Intrinsics.checkNotNullParameter(owner, "owner");
        Intrinsics.checkNotNullParameter(references, "references");
        this.viewModel = viewModel;
        this.owner = owner;
        this.references = references;
        viewModel.getAction().observe(owner.g(), new DeleteAccountDescriptionStickyBinder$sam$androidx_lifecycle_Observer$0(new AnonymousClass1()));
        viewModel.getState().observe(owner.g(), new DeleteAccountDescriptionStickyBinder$sam$androidx_lifecycle_Observer$0(new AnonymousClass2()));
    }

    public final void bind(@NotNull DeleteAccountDescriptionStickyVO vo) {
        Intrinsics.checkNotNullParameter(vo, "vo");
        this.viewModel.bind(vo);
    }

    @NotNull
    public final ComposerReferences getReferences() {
        return this.references;
    }

    public final Unit onRemove() {
        DeleteAccountDescriptionStickyView deleteAccountDescriptionStickyView = this.view;
        if (deleteAccountDescriptionStickyView == null) {
            return null;
        }
        deleteAccountDescriptionStickyView.remove();
        return Unit.f71690a;
    }

    public final void setView(@NotNull DeleteAccountDescriptionStickyView view) {
        Intrinsics.checkNotNullParameter(view, "view");
        this.view = view;
        view.setOnComposerActionClick(new DeleteAccountDescriptionStickyBinder$setView$1(this.viewModel));
    }
}
