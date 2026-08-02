package ru.ozon.app.android.session.editUserFullName.core;

import A00.a;
import Pc.a;
import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.widgets.base.WidgetViewMapper;
import ru.ozon.app.android.session.R$layout;
import ru.ozon.app.android.session.editUserFullName.core.EditUserFullNameUpdate;
import ru.ozon.app.android.session.editUserFullName.data.EditUserFullNameDTO;
import ru.ozon.app.android.session.editUserFullName.data.EditUserFullNameMapper;
import ru.ozon.app.android.session.editUserFullName.presentation.EditUserFullNameResult;
import ru.ozon.app.android.session.editUserFullName.presentation.EditUserFullNameVO;
import ru.ozon.app.android.session.editUserFullName.presentation.EditUserFullNameViewHolder;
import ru.ozon.app.android.session.editUserFullName.presentation.EditUserFullNameViewModelImpl;
import ru.ozon.app.android.session.editUserFullName.presentation.TextFieldBinder;
import ru.ozon.app.android.session.editUserFullName.presentation.TextFieldFactory;
import ru.ozon.composer.ui.widget.k;

@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B/\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u001aR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u001bR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u001cR\u001a\u0010\u001e\u001a\u00020\u001d8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R,\u0010&\u001a\u0014\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020%0\"8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R(\u0010-\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020,0+0*8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100R,\u00102\u001a\u0014\u0012\u0004\u0012\u000201\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\"8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b2\u0010'\u001a\u0004\b3\u0010)¨\u00064"}, d2 = {"Lru/ozon/app/android/session/editUserFullName/core/EditUserFullNameViewMapper;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewMapper;", "Lru/ozon/app/android/session/editUserFullName/data/EditUserFullNameDTO;", "Lru/ozon/app/android/session/editUserFullName/presentation/EditUserFullNameVO;", "Lru/ozon/app/android/session/editUserFullName/data/EditUserFullNameMapper;", "mapper", "LPc/a;", "Lru/ozon/app/android/session/editUserFullName/presentation/EditUserFullNameViewModelImpl;", "pViewModel", "Lru/ozon/app/android/session/editUserFullName/presentation/TextFieldFactory;", "textFieldFactory", "Lru/ozon/app/android/session/editUserFullName/presentation/TextFieldBinder;", "textFieldBinder", "<init>", "(Lru/ozon/app/android/session/editUserFullName/data/EditUserFullNameMapper;LPc/a;Lru/ozon/app/android/session/editUserFullName/presentation/TextFieldFactory;Lru/ozon/app/android/session/editUserFullName/presentation/TextFieldBinder;)V", "oldVO", "Lru/ozon/app/android/session/editUserFullName/core/EditUserFullNameUpdate$TextChange;", "update", "processTextChange", "(Lru/ozon/app/android/session/editUserFullName/presentation/EditUserFullNameVO;Lru/ozon/app/android/session/editUserFullName/core/EditUserFullNameUpdate$TextChange;)Lru/ozon/app/android/session/editUserFullName/presentation/EditUserFullNameVO;", "Lru/ozon/app/android/session/editUserFullName/core/EditUserFullNameUpdate$Error;", "processError", "(Lru/ozon/app/android/session/editUserFullName/presentation/EditUserFullNameVO;Lru/ozon/app/android/session/editUserFullName/core/EditUserFullNameUpdate$Error;)Lru/ozon/app/android/session/editUserFullName/presentation/EditUserFullNameVO;", "Lru/ozon/app/android/session/editUserFullName/data/EditUserFullNameMapper;", "getMapper", "()Lru/ozon/app/android/session/editUserFullName/data/EditUserFullNameMapper;", "LPc/a;", "Lru/ozon/app/android/session/editUserFullName/presentation/TextFieldFactory;", "Lru/ozon/app/android/session/editUserFullName/presentation/TextFieldBinder;", "", "layout", "I", "getLayout", "()Ljava/lang/Integer;", "Lkotlin/Function2;", "Landroid/view/View;", "Lru/ozon/app/android/composer/ComposerReferences;", "Lru/ozon/app/android/session/editUserFullName/presentation/EditUserFullNameViewHolder;", "holderProducer", "Lkotlin/jvm/functions/Function2;", "getHolderProducer", "()Lkotlin/jvm/functions/Function2;", "", "Ljava/lang/Class;", "Lru/ozon/app/android/session/editUserFullName/core/EditUserFullNameUpdate;", "supportedUpdates", "Ljava/util/List;", "getSupportedUpdates", "()Ljava/util/List;", "LA00/a$J$a;", "updateConsumer", "getUpdateConsumer", "session_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class EditUserFullNameViewMapper extends WidgetViewMapper<EditUserFullNameDTO, EditUserFullNameVO> {

    @NotNull
    private final Function2<View, ComposerReferences, EditUserFullNameViewHolder> holderProducer;
    private final int layout;

    @NotNull
    private final EditUserFullNameMapper mapper;

    @NotNull
    private final a<EditUserFullNameViewModelImpl> pViewModel;

    @NotNull
    private final List<Class<? extends EditUserFullNameUpdate>> supportedUpdates;

    @NotNull
    private final TextFieldBinder textFieldBinder;

    @NotNull
    private final TextFieldFactory textFieldFactory;

    @NotNull
    private final Function2<a.J.InterfaceC0007a, EditUserFullNameVO, EditUserFullNameVO> updateConsumer;

    public EditUserFullNameViewMapper(@NotNull EditUserFullNameMapper mapper, @NotNull Pc.a<EditUserFullNameViewModelImpl> pViewModel, @NotNull TextFieldFactory textFieldFactory, @NotNull TextFieldBinder textFieldBinder) {
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(pViewModel, "pViewModel");
        Intrinsics.checkNotNullParameter(textFieldFactory, "textFieldFactory");
        Intrinsics.checkNotNullParameter(textFieldBinder, "textFieldBinder");
        this.mapper = mapper;
        this.pViewModel = pViewModel;
        this.textFieldFactory = textFieldFactory;
        this.textFieldBinder = textFieldBinder;
        this.layout = R$layout.widget_edit_user_full_name;
        this.holderProducer = new EditUserFullNameViewMapper$holderProducer$1(this);
        this.supportedUpdates = C7714v.b0(EditUserFullNameUpdate.TextChange.class, EditUserFullNameUpdate.Error.class);
        this.updateConsumer = new EditUserFullNameViewMapper$updateConsumer$1(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final EditUserFullNameVO processError(EditUserFullNameVO oldVO, EditUserFullNameUpdate.Error update) {
        Object obj;
        List<EditUserFullNameVO.InputVO> inputs = oldVO.getInputs();
        ArrayList arrayList = new ArrayList(C7714v.z(inputs, 10));
        boolean z11 = true;
        for (EditUserFullNameVO.InputVO inputVO : inputs) {
            Iterator<T> it = update.getFieldsWithErrors().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (Intrinsics.d(((EditUserFullNameResult.Failure.Field) obj).getName(), inputVO.getName())) {
                    break;
                }
            }
            EditUserFullNameResult.Failure.Field field = (EditUserFullNameResult.Failure.Field) obj;
            String message = field != null ? field.getMessage() : null;
            if (message != null) {
                EditUserFullNameVO.InputVO inputVO2 = new EditUserFullNameVO.InputVO(inputVO.getName(), inputVO.getPlaceholder(), false, inputVO.getValue(), inputVO.getImeOptions(), z11, message);
                z11 = false;
                inputVO = inputVO2;
            }
            arrayList.add(inputVO);
        }
        return EditUserFullNameVO.copy$default(oldVO, 0L, null, arrayList, null, null, 27, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final EditUserFullNameVO processTextChange(EditUserFullNameVO oldVO, EditUserFullNameUpdate.TextChange update) {
        List<EditUserFullNameVO.InputVO> inputs = oldVO.getInputs();
        ArrayList arrayList = new ArrayList(C7714v.z(inputs, 10));
        for (EditUserFullNameVO.InputVO inputVO : inputs) {
            arrayList.add(Intrinsics.d(inputVO.getName(), update.getName()) ? new EditUserFullNameVO.InputVO(inputVO.getName(), inputVO.getPlaceholder(), false, update.getText(), inputVO.getImeOptions(), false, null) : EditUserFullNameVO.InputVO.copy$default(inputVO, null, null, false, null, 0, false, null, 95, null));
        }
        return EditUserFullNameVO.copy$default(oldVO, 0L, null, arrayList, null, null, 27, null);
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    /* renamed from: getHolderProducer */
    public Function2<View, ComposerReferences, k<EditUserFullNameVO>> mo614getHolderProducer() {
        return this.holderProducer;
    }

    @Override // ru.ozon.composer.ui.widget.g
    @NotNull
    public Integer getLayout() {
        return Integer.valueOf(this.layout);
    }

    @Override // ru.ozon.composer.ui.widget.g, I00.d
    @NotNull
    public List<Class<? extends EditUserFullNameUpdate>> getSupportedUpdates() {
        return this.supportedUpdates;
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    public Function2<a.J.InterfaceC0007a, EditUserFullNameVO, EditUserFullNameVO> getUpdateConsumer() {
        return this.updateConsumer;
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    public Function2<EditUserFullNameDTO, d, List<EditUserFullNameVO>> getMapper() {
        return this.mapper;
    }
}
