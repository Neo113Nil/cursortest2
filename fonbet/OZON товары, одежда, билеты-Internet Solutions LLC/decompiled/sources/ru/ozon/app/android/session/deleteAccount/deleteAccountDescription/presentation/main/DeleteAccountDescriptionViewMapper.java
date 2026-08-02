package ru.ozon.app.android.session.deleteAccount.deleteAccountDescription.presentation.main;

import A00.a;
import Pc.a;
import android.view.View;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.atoms.data.list.ListElementAtom;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.widgets.base.WidgetViewMapper;
import ru.ozon.app.android.session.R$layout;
import ru.ozon.app.android.session.deleteAccount.deleteAccountDescription.data.DeleteAccountDescriptionDTO;
import ru.ozon.app.android.session.deleteAccount.deleteAccountDescription.presentation.DeleteAccountDescriptionFieldErrorUpdateEvent;
import ru.ozon.app.android.session.deleteAccount.deleteAccountDescription.presentation.DeleteAccountDescriptionUpdateEvent;
import ru.ozon.app.android.session.deleteAccount.deleteAccountDescription.presentation.main.DeleteAccountDescriptionMainVO;
import ru.ozon.app.android.session.deleteAccount.deleteAccountDescription.presentation.sticky.DeleteAccountDescriptionStickyViewModelImpl;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.atoms.data.deprecated.Annotation;

@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0017\b\u0007\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u001b\u0010\u000b\u001a\u00020\u0003*\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\fR\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\rR6\u0010\u0012\u001a\u001e\u0012\u0004\u0012\u00020\u0002\u0012\b\u0012\u00060\u000fj\u0002`\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00110\u000e8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR,\u0010\u001e\u001a\u0014\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u001d0\u000e8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u0013\u001a\u0004\b\u001f\u0010\u0015R(\u0010\"\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020!0 0\u00118\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R.\u0010&\u001a\u0016\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u000e8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b&\u0010\u0013\u001a\u0004\b'\u0010\u0015¨\u0006("}, d2 = {"Lru/ozon/app/android/session/deleteAccount/deleteAccountDescription/presentation/main/DeleteAccountDescriptionViewMapper;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewMapper;", "Lru/ozon/app/android/session/deleteAccount/deleteAccountDescription/data/DeleteAccountDescriptionDTO;", "Lru/ozon/app/android/session/deleteAccount/deleteAccountDescription/presentation/main/DeleteAccountDescriptionMainVO;", "LPc/a;", "Lru/ozon/app/android/session/deleteAccount/deleteAccountDescription/presentation/sticky/DeleteAccountDescriptionStickyViewModelImpl;", "pViewModel", "<init>", "(LPc/a;)V", "", "stateId", "toVO", "(Lru/ozon/app/android/session/deleteAccount/deleteAccountDescription/data/DeleteAccountDescriptionDTO;Ljava/lang/String;)Lru/ozon/app/android/session/deleteAccount/deleteAccountDescription/presentation/main/DeleteAccountDescriptionMainVO;", "LPc/a;", "Lkotlin/Function2;", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "", "mapper", "Lkotlin/jvm/functions/Function2;", "getMapper", "()Lkotlin/jvm/functions/Function2;", "", "layout", "Ljava/lang/Integer;", "getLayout", "()Ljava/lang/Integer;", "Landroid/view/View;", "Lru/ozon/app/android/composer/ComposerReferences;", "Lru/ozon/app/android/session/deleteAccount/deleteAccountDescription/presentation/main/DeleteAccountDescriptionMainVH;", "holderProducer", "getHolderProducer", "Ljava/lang/Class;", "LA00/a$J$a;", "supportedUpdates", "Ljava/util/List;", "getSupportedUpdates", "()Ljava/util/List;", "updateConsumer", "getUpdateConsumer", "session_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class DeleteAccountDescriptionViewMapper extends WidgetViewMapper<DeleteAccountDescriptionDTO, DeleteAccountDescriptionMainVO> {

    @NotNull
    private final Function2<View, ComposerReferences, DeleteAccountDescriptionMainVH> holderProducer;
    private final Integer layout;

    @NotNull
    private final Function2<DeleteAccountDescriptionDTO, d, List<DeleteAccountDescriptionMainVO>> mapper;

    @NotNull
    private final a<DeleteAccountDescriptionStickyViewModelImpl> pViewModel;

    @NotNull
    private final List<Class<? extends a.J.InterfaceC0007a>> supportedUpdates;

    @NotNull
    private final Function2<a.J.InterfaceC0007a, DeleteAccountDescriptionMainVO, DeleteAccountDescriptionMainVO> updateConsumer;

    public DeleteAccountDescriptionViewMapper(@NotNull Pc.a<DeleteAccountDescriptionStickyViewModelImpl> pViewModel) {
        Intrinsics.checkNotNullParameter(pViewModel, "pViewModel");
        this.pViewModel = pViewModel;
        this.mapper = new DeleteAccountDescriptionViewMapper$mapper$1(this);
        this.layout = Integer.valueOf(R$layout.widget_delete_account_description);
        this.holderProducer = new DeleteAccountDescriptionViewMapper$holderProducer$1(this);
        this.supportedUpdates = C7714v.b0(DeleteAccountDescriptionFieldErrorUpdateEvent.class, DeleteAccountDescriptionUpdateEvent.class);
        this.updateConsumer = DeleteAccountDescriptionViewMapper$updateConsumer$1.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final DeleteAccountDescriptionMainVO toVO(DeleteAccountDescriptionDTO deleteAccountDescriptionDTO, String str) {
        DeleteAccountDescriptionMainVO.Reason reason;
        DeleteAccountDescriptionDTO.Reason.Input input;
        long a11 = Ih.a.a("DeleteAccountDescriptionMainVO", str);
        Annotation restriction = deleteAccountDescriptionDTO.getRestriction();
        DeleteAccountDescriptionDTO.Conditions conditions = deleteAccountDescriptionDTO.getConditions();
        String title = conditions.getTitle();
        List<DeleteAccountDescriptionDTO.Conditions.DescriptionsItem> descriptions = conditions.getDescriptions();
        ArrayList arrayList = new ArrayList(C7714v.z(descriptions, 10));
        for (DeleteAccountDescriptionDTO.Conditions.DescriptionsItem descriptionsItem : descriptions) {
            arrayList.add(new DeleteAccountDescriptionMainVO.Conditions.DescriptionsItem(new ListElementAtom.BulletListElement(descriptionsItem.getText(), null, false, null, null, null, 62, null), descriptionsItem.getButton()));
        }
        DeleteAccountDescriptionMainVO.Conditions conditions2 = new DeleteAccountDescriptionMainVO.Conditions(title, arrayList);
        DeleteAccountDescriptionDTO.Reason reason2 = deleteAccountDescriptionDTO.getReason();
        String str2 = null;
        if (reason2 != null) {
            String title2 = reason2.getTitle();
            DeleteAccountDescriptionDTO.Reason.Input input2 = reason2.getInput();
            reason = new DeleteAccountDescriptionMainVO.Reason(title2, new DeleteAccountDescriptionMainVO.Reason.Input(input2.getHint(), input2.getId(), "", ""), reason2.getSubmitButton());
        } else {
            reason = null;
        }
        DeleteAccountDescriptionDTO.Reason reason3 = deleteAccountDescriptionDTO.getReason();
        if (reason3 != null && (input = reason3.getInput()) != null) {
            str2 = input.getId();
        }
        if (str2 == null) {
            str2 = "";
        }
        return new DeleteAccountDescriptionMainVO(a11, restriction, conditions2, reason, new Pair(str2, ""));
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    /* renamed from: getHolderProducer */
    public Function2<View, ComposerReferences, k<DeleteAccountDescriptionMainVO>> mo614getHolderProducer() {
        return this.holderProducer;
    }

    @Override // ru.ozon.composer.ui.widget.g
    public Integer getLayout() {
        return this.layout;
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    public Function2<DeleteAccountDescriptionDTO, d, List<DeleteAccountDescriptionMainVO>> getMapper() {
        return this.mapper;
    }

    @Override // ru.ozon.composer.ui.widget.g, I00.d
    @NotNull
    public List<Class<? extends a.J.InterfaceC0007a>> getSupportedUpdates() {
        return this.supportedUpdates;
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    public Function2<a.J.InterfaceC0007a, DeleteAccountDescriptionMainVO, DeleteAccountDescriptionMainVO> getUpdateConsumer() {
        return this.updateConsumer;
    }
}
