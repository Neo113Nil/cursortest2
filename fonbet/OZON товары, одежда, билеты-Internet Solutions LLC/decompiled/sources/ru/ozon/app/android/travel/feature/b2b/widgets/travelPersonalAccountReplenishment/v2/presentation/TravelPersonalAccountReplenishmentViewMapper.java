package ru.ozon.app.android.travel.feature.b2b.widgets.travelPersonalAccountReplenishment.v2.presentation;

import A00.a;
import android.view.View;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.util.ArrayList;
import java.util.List;
import k20.C7473e;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.h;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.widgets.v2.WidgetViewMapper2;
import ru.ozon.app.android.travel.feature.b2b.R$layout;
import ru.ozon.app.android.travel.feature.b2b.widgets.travelPersonalAccountReplenishment.v2.data.TravelPersonalAccountReplenishmentDTO;
import ru.ozon.app.android.travel.feature.b2b.widgets.travelPersonalAccountReplenishment.v2.di.TravelPersonalAccountReplenishmentComponent;
import ru.ozon.app.android.travel.feature.b2b.widgets.travelPersonalAccountReplenishment.v2.presentation.TravelPersonalAccountReplenishmentVO;
import ru.ozon.uni.atoms.data.tag.TagV3Atom;

@Metadata(d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006J!\u0010\n\u001a\u0004\u0018\u00010\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\n\u0010\u000bJ/\u0010\u0014\u001a\u00020\u00132\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J!\u0010\u0018\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0016\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0018\u0010\u000bJ\u001f\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ!\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00020 2\n\u0010\u001f\u001a\u00060\u001dj\u0002`\u001eH\u0016¢\u0006\u0004\b!\u0010\"R\u001a\u0010#\u001a\u00020\u000f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R,\u0010+\u001a\u0014\u0012\u0004\u0012\u00020(\u0012\u0004\u0012\u00020)\u0012\u0004\u0012\u00020*0'8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.R&\u00102\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u000201000/8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u00105R0\u00109\u001a\u001e\u0012\u0004\u0012\u00020\u0003\u0012\b\u0012\u000606j\u0002`7\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040/0'8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b8\u0010.¨\u0006:"}, d2 = {"Lru/ozon/app/android/travel/feature/b2b/widgets/travelPersonalAccountReplenishment/v2/presentation/TravelPersonalAccountReplenishmentViewMapper;", "Lru/ozon/app/android/composer/widgets/v2/WidgetViewMapper2;", "Lru/ozon/app/android/travel/feature/b2b/widgets/travelPersonalAccountReplenishment/v2/di/TravelPersonalAccountReplenishmentComponent;", "Lru/ozon/app/android/travel/feature/b2b/widgets/travelPersonalAccountReplenishment/v2/data/TravelPersonalAccountReplenishmentDTO;", "Lru/ozon/app/android/travel/feature/b2b/widgets/travelPersonalAccountReplenishment/v2/presentation/TravelPersonalAccountReplenishmentVO;", "<init>", "()V", "LA00/a$J$a;", "key", "oldVo", "updateVo", "(LA00/a$J$a;Lru/ozon/app/android/travel/feature/b2b/widgets/travelPersonalAccountReplenishment/v2/presentation/TravelPersonalAccountReplenishmentVO;)Lru/ozon/app/android/travel/feature/b2b/widgets/travelPersonalAccountReplenishment/v2/presentation/TravelPersonalAccountReplenishmentVO;", "", "Lru/ozon/uni/atoms/data/tag/TagV3Atom$TagAtom;", "tags", "", "position", "", "isSelected", "", "updateTag", "(Ljava/util/List;Ljava/lang/Integer;Z)V", "update", "oldItem", "handleUpdate", "newItem", "", "getPayload", "(Lru/ozon/app/android/travel/feature/b2b/widgets/travelPersonalAccountReplenishment/v2/presentation/TravelPersonalAccountReplenishmentVO;Lru/ozon/app/android/travel/feature/b2b/widgets/travelPersonalAccountReplenishment/v2/presentation/TravelPersonalAccountReplenishmentVO;)Ljava/lang/Object;", "Lk20/g;", "Lru/ozon/app/android/composer/widgets/v2/di/ComposerWidgetComponentStorage;", "storage", "Lk20/e;", "widgetComponent", "(Lk20/g;)Lk20/e;", "layout", "I", "getLayout", "()Ljava/lang/Integer;", "Lkotlin/Function2;", "Landroid/view/View;", "Lru/ozon/app/android/composer/ComposerReferences;", "Lru/ozon/app/android/travel/feature/b2b/widgets/travelPersonalAccountReplenishment/v2/presentation/TravelPersonalAccountReplenishmentWidgetViewHolder;", "holderProducer", "Lkotlin/jvm/functions/Function2;", "getHolderProducer", "()Lkotlin/jvm/functions/Function2;", "", "Ljava/lang/Class;", "Lru/ozon/app/android/travel/feature/b2b/widgets/travelPersonalAccountReplenishment/v2/presentation/AccountReplenishmentTagUpdateKey;", "supportedUpdates", "Ljava/util/List;", "getSupportedUpdates", "()Ljava/util/List;", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "getMapper", "mapper", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class TravelPersonalAccountReplenishmentViewMapper extends WidgetViewMapper2<TravelPersonalAccountReplenishmentComponent, TravelPersonalAccountReplenishmentDTO, TravelPersonalAccountReplenishmentVO> {
    private final int layout = R$layout.widget_personal_account_replenishment;

    @NotNull
    private final Function2<View, ComposerReferences, TravelPersonalAccountReplenishmentWidgetViewHolder> holderProducer = new TravelPersonalAccountReplenishmentViewMapper$holderProducer$1(this);

    @NotNull
    private final List<Class<AccountReplenishmentTagUpdateKey>> supportedUpdates = C7714v.a0(AccountReplenishmentTagUpdateKey.class);

    private final void updateTag(List<TagV3Atom.TagAtom> tags, Integer position, boolean isSelected) {
        if (position == null || !h.o(0, tags.size()).n(position.intValue())) {
            return;
        }
        tags.set(position.intValue(), TagV3Atom.TagAtom.copy$default(tags.get(position.intValue()), null, null, null, null, isSelected, null, null, null, null, null, 1007, null));
    }

    private final TravelPersonalAccountReplenishmentVO updateVo(a.J.InterfaceC0007a key, TravelPersonalAccountReplenishmentVO oldVo) {
        TravelPersonalAccountReplenishmentVO copy;
        TravelPersonalAccountReplenishmentVO copy2;
        if (!(key instanceof AccountReplenishmentTagUpdateKey)) {
            return null;
        }
        AccountReplenishmentTagUpdateKey accountReplenishmentTagUpdateKey = (AccountReplenishmentTagUpdateKey) key;
        if (Intrinsics.d(accountReplenishmentTagUpdateKey.getCurrentPosition(), oldVo.getSelectedTagPosition()) && Intrinsics.d(accountReplenishmentTagUpdateKey.getPreviousPosition(), oldVo.getPreviousSelectedTagPosition())) {
            copy2 = oldVo.copy((r27 & 1) != 0 ? oldVo.id : 0L, (r27 & 2) != 0 ? oldVo.title : null, (r27 & 4) != 0 ? oldVo.inputKey : null, (r27 & 8) != 0 ? oldVo.validateOnlyKey : null, (r27 & 16) != 0 ? oldVo.input : TravelPersonalAccountReplenishmentVO.InputVO.copy$default(oldVo.getInput(), accountReplenishmentTagUpdateKey.getNewInput(), null, false, null, null, null, accountReplenishmentTagUpdateKey.getCursorPosition(), 58, null), (r27 & 32) != 0 ? oldVo.submitButton : null, (r27 & 64) != 0 ? oldVo.description : null, (r27 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? oldVo.agreementText : null, (r27 & 256) != 0 ? oldVo.areInputVariantsVisible : false, (r27 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? oldVo.inputVariants : null, (r27 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? oldVo.previousSelectedTagPosition : null, (r27 & 2048) != 0 ? oldVo.selectedTagPosition : null);
            return copy2;
        }
        ArrayList W02 = C7714v.W0(oldVo.getInputVariants());
        updateTag(W02, accountReplenishmentTagUpdateKey.getPreviousPosition(), false);
        updateTag(W02, accountReplenishmentTagUpdateKey.getCurrentPosition(), true);
        copy = oldVo.copy((r27 & 1) != 0 ? oldVo.id : 0L, (r27 & 2) != 0 ? oldVo.title : null, (r27 & 4) != 0 ? oldVo.inputKey : null, (r27 & 8) != 0 ? oldVo.validateOnlyKey : null, (r27 & 16) != 0 ? oldVo.input : TravelPersonalAccountReplenishmentVO.InputVO.copy$default(oldVo.getInput(), accountReplenishmentTagUpdateKey.getNewInput(), null, false, null, null, null, accountReplenishmentTagUpdateKey.getCursorPosition(), 58, null), (r27 & 32) != 0 ? oldVo.submitButton : null, (r27 & 64) != 0 ? oldVo.description : null, (r27 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? oldVo.agreementText : null, (r27 & 256) != 0 ? oldVo.areInputVariantsVisible : false, (r27 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? oldVo.inputVariants : W02, (r27 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? oldVo.previousSelectedTagPosition : accountReplenishmentTagUpdateKey.getPreviousPosition(), (r27 & 2048) != 0 ? oldVo.selectedTagPosition : accountReplenishmentTagUpdateKey.getCurrentPosition());
        return copy;
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    /* renamed from: getHolderProducer */
    public Function2<View, ComposerReferences, TravelPersonalAccountReplenishmentWidgetViewHolder> mo614getHolderProducer() {
        return this.holderProducer;
    }

    @Override // ru.ozon.composer.ui.widget.g
    @NotNull
    public Integer getLayout() {
        return Integer.valueOf(this.layout);
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    public Function2<TravelPersonalAccountReplenishmentDTO, d, List<TravelPersonalAccountReplenishmentVO>> getMapper() {
        return component().getTravelPersonalAccountReplenishmentMapper();
    }

    @Override // ru.ozon.composer.ui.widget.g, I00.d
    @NotNull
    public List<Class<AccountReplenishmentTagUpdateKey>> getSupportedUpdates() {
        return this.supportedUpdates;
    }

    @Override // ru.ozon.app.android.composer.widgets.v2.ViewMapper2
    @NotNull
    public C7473e<TravelPersonalAccountReplenishmentComponent> widgetComponent(@NotNull C7475g storage) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        return TravelPersonalAccountReplenishmentComponent.INSTANCE.create(storage);
    }

    @Override // ru.ozon.composer.ui.widget.g
    @NotNull
    public Object getPayload(@NotNull TravelPersonalAccountReplenishmentVO oldItem, @NotNull TravelPersonalAccountReplenishmentVO newItem) {
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        Intrinsics.checkNotNullParameter(newItem, "newItem");
        return "AccountReplenishmentPayload";
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper, ru.ozon.composer.ui.widget.g, I00.d
    public TravelPersonalAccountReplenishmentVO handleUpdate(@NotNull a.J.InterfaceC0007a update, @NotNull TravelPersonalAccountReplenishmentVO oldItem) {
        Intrinsics.checkNotNullParameter(update, "update");
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        return updateVo(update, oldItem);
    }
}
