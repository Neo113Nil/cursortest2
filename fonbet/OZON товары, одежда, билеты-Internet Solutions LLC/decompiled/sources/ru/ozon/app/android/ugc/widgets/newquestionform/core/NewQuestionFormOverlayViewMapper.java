package ru.ozon.app.android.ugc.widgets.newquestionform.core;

import A00.a;
import c20.r;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import d20.AbstractC6065b;
import java.util.List;
import k20.C7473e;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import l10.i;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.atoms.data.cells.CellAtom;
import ru.ozon.app.android.composer.widgets.v2.overlay.OverlayWidgetScreenViewItemMapper2;
import ru.ozon.app.android.ugc.widgets.newquestionform.data.NewQuestionFormDTO;
import ru.ozon.app.android.ugc.widgets.newquestionform.di.NewQuestionFormComponent;
import ru.ozon.app.android.ugc.widgets.newquestionform.presentation.NewQuestionFormUpdate;
import ru.ozon.app.android.ugc.widgets.newquestionform.presentation.NewQuestionFormVO;
import ru.ozon.app.android.ugc.widgets.newquestionform.presentation.NewQuestionFormViewModelImpl;
import ru.ozon.app.android.ugc.widgets.newquestionform.presentation.NewQuestionFormWidgetHolder;

@Metadata(d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006J!\u0010\n\u001a\u0004\u0018\u00010\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\n\u0010\u000bJ+\u0010\u0011\u001a\u0012\u0012\u0004\u0012\u00020\u00020\u000fj\b\u0012\u0004\u0012\u00020\u0002`\u00102\n\u0010\u000e\u001a\u00060\fj\u0002`\rH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J)\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00040\u00172\u0006\u0010\u0013\u001a\u00020\u00032\n\u0010\u0016\u001a\u00060\u0014j\u0002`\u0015H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0019\u0010\u001c\u001a\u00020\u001b2\b\u0010\u0013\u001a\u0004\u0018\u00010\u001aH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u001d\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00040 2\u0006\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0004\b!\u0010\"R\u001a\u0010$\u001a\u00020#8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R(\u0010)\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00070(0\u00178\u0016X\u0096\u0004¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R\u0014\u00100\u001a\u00020-8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b.\u0010/R\u001c\u00105\u001a\n 2*\u0004\u0018\u000101018BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b3\u00104¨\u00066"}, d2 = {"Lru/ozon/app/android/ugc/widgets/newquestionform/core/NewQuestionFormOverlayViewMapper;", "Lru/ozon/app/android/composer/widgets/v2/overlay/OverlayWidgetScreenViewItemMapper2;", "Lru/ozon/app/android/ugc/widgets/newquestionform/di/NewQuestionFormComponent;", "Lru/ozon/app/android/ugc/widgets/newquestionform/data/NewQuestionFormDTO;", "Lru/ozon/app/android/ugc/widgets/newquestionform/presentation/NewQuestionFormVO;", "<init>", "()V", "LA00/a$J$a;", "update", "oldItem", "handleUpdate", "(LA00/a$J$a;Lru/ozon/app/android/ugc/widgets/newquestionform/presentation/NewQuestionFormVO;)Lru/ozon/app/android/ugc/widgets/newquestionform/presentation/NewQuestionFormVO;", "Lk20/g;", "Lru/ozon/app/android/composer/widgets/v2/di/ComposerWidgetComponentStorage;", "storage", "Lk20/e;", "Lru/ozon/app/android/composer/widgets/v2/di/WidgetComponent;", "widgetComponent", "(Lk20/g;)Lk20/e;", "state", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "info", "", "map", "(Lru/ozon/app/android/ugc/widgets/newquestionform/data/NewQuestionFormDTO;Ll20/d;)Ljava/util/List;", "", "", "canMap", "(Ljava/lang/Object;)Z", "Ll10/i;", "container", "Ld20/b;", "createHolder", "(Ll10/i;)Ld20/b;", "Lc20/r$a;", "viewType", "Lc20/r$a;", "getViewType", "()Lc20/r$a;", "Ljava/lang/Class;", "supportedUpdates", "Ljava/util/List;", "getSupportedUpdates", "()Ljava/util/List;", "Lru/ozon/app/android/ugc/widgets/newquestionform/core/NewQuestionFormMapper;", "getMapper", "()Lru/ozon/app/android/ugc/widgets/newquestionform/core/NewQuestionFormMapper;", "mapper", "Lru/ozon/app/android/ugc/widgets/newquestionform/presentation/NewQuestionFormViewModelImpl;", "kotlin.jvm.PlatformType", "getViewModel", "()Lru/ozon/app/android/ugc/widgets/newquestionform/presentation/NewQuestionFormViewModelImpl;", "viewModel", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class NewQuestionFormOverlayViewMapper extends OverlayWidgetScreenViewItemMapper2<NewQuestionFormComponent, NewQuestionFormDTO, NewQuestionFormVO> {

    @NotNull
    private final r.a viewType = r.a.SINGLE;

    @NotNull
    private final List<Class<? extends a.J.InterfaceC0007a>> supportedUpdates = C7714v.a0(NewQuestionFormUpdate.class);

    private final NewQuestionFormMapper getMapper() {
        return component().getMapper();
    }

    private final NewQuestionFormViewModelImpl getViewModel() {
        return component().getViewModelProvider().get();
    }

    @Override // c20.r, m20.InterfaceC8046a
    public boolean canMap(Object state) {
        return state instanceof NewQuestionFormDTO;
    }

    @Override // c20.r
    @NotNull
    public AbstractC6065b<NewQuestionFormVO> createHolder(@NotNull i container) {
        Intrinsics.checkNotNullParameter(container, "container");
        NewQuestionFormViewModelImpl viewModel = getViewModel();
        Intrinsics.checkNotNullExpressionValue(viewModel, "<get-viewModel>(...)");
        return new NewQuestionFormWidgetHolder(container, viewModel, component().getHandlersInhibitor());
    }

    @Override // c20.r, I00.d
    @NotNull
    public List<Class<? extends a.J.InterfaceC0007a>> getSupportedUpdates() {
        return this.supportedUpdates;
    }

    @Override // c20.r
    @NotNull
    public r.a getViewType() {
        return this.viewType;
    }

    @Override // ru.ozon.app.android.composer.widgets.v2.ViewMapper2
    @NotNull
    public C7473e<NewQuestionFormComponent> widgetComponent(@NotNull C7475g storage) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        return NewQuestionFormComponent.INSTANCE.getInstance(storage);
    }

    @Override // c20.r, I00.d
    public NewQuestionFormVO handleUpdate(@NotNull a.J.InterfaceC0007a update, @NotNull NewQuestionFormVO oldItem) {
        NewQuestionFormVO copy;
        Intrinsics.checkNotNullParameter(update, "update");
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        if (!(update instanceof NewQuestionFormUpdate)) {
            return null;
        }
        CellAtom.CellAtomWithSubtitle.CellWithSubtitleToggle anonymousCell = oldItem.getAnonymousCell();
        Boolean valueOf = anonymousCell != null ? Boolean.valueOf(!anonymousCell.isSelected()) : null;
        copy = oldItem.copy((r32 & 1) != 0 ? oldItem.id : 0L, (r32 & 2) != 0 ? oldItem.productId : 0L, (r32 & 4) != 0 ? oldItem.questionId : null, (r32 & 8) != 0 ? oldItem.header : null, (r32 & 16) != 0 ? oldItem.secondHeader : null, (r32 & 32) != 0 ? oldItem.inputPlaceholder : null, (r32 & 64) != 0 ? oldItem.inputMinLength : 0, (r32 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? oldItem.inputMaxLength : 0, (r32 & 256) != 0 ? oldItem.invalidLengthError : null, (r32 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? oldItem.anonymousCell : valueOf != null ? CellAtom.CellAtomWithSubtitle.CellWithSubtitleToggle.copy$default(anonymousCell, valueOf.booleanValue(), null, null, null, null, null, null, null, false, false, null, null, null, 8190, null) : null, (r32 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? oldItem.policyRulesButton : null, (r32 & 2048) != 0 ? oldItem.sendButton : null, (r32 & 4096) != 0 ? oldItem.viewEvent : null);
        return copy;
    }

    @Override // m20.InterfaceC8046a
    @NotNull
    public List<NewQuestionFormVO> map(@NotNull NewQuestionFormDTO state, @NotNull d info) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(info, "info");
        return getMapper().invoke(state, info);
    }
}
