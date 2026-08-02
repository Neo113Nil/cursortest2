package ru.ozon.app.android.ugc.core.widgets.singlereview.translateButton;

import A00.a;
import Bi.b;
import G.g;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import k20.C7473e;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.widgets.v2.WidgetViewMapper2;
import ru.ozon.app.android.pdp.ui.configurators.ugc.singleReview.SingleReviewDTO;
import ru.ozon.app.android.ugc.core.widgets.singlereview.translateButton.di.TranslateButtonComponent;
import ru.ozon.app.android.ugc.core.widgets.singlereview.translateButton.presentation.TranslateButtonDecoration;
import ru.ozon.app.android.ugc.core.widgets.singlereview.translateButton.presentation.TranslateButtonVH;
import ru.ozon.app.android.ugc.core.widgets.singlereview.translateButton.presentation.TranslateButtonVO;
import ru.ozon.uni.android.controls.buttonV3.ButtonV3View;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;

@Metadata(d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u00014B\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u000f\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0019\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u001d\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u00182\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ+\u0010!\u001a\u0012\u0012\u0004\u0012\u00020\u00020\u001fj\b\u0012\u0004\u0012\u00020\u0002` 2\n\u0010\u001e\u001a\u00060\u001cj\u0002`\u001dH\u0016¢\u0006\u0004\b!\u0010\"R,\u0010'\u001a\u0014\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020&0#8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R(\u0010,\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\f0+0\u00188\u0016X\u0096\u0004¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/R\u0014\u00103\u001a\u0002008VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b1\u00102¨\u00065"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/singlereview/translateButton/TranslateButtonViewMapper;", "Lru/ozon/app/android/composer/widgets/v2/WidgetViewMapper2;", "Lru/ozon/app/android/ugc/core/widgets/singlereview/translateButton/di/TranslateButtonComponent;", "Lru/ozon/app/android/ugc/core/widgets/singlereview/translateButton/TranslateButtonDO;", "Lru/ozon/app/android/ugc/core/widgets/singlereview/translateButton/presentation/TranslateButtonVO;", "<init>", "()V", "Landroid/view/ViewGroup;", "parent", "Lru/ozon/uni/android/controls/buttonV3/ButtonV3View;", "createView", "(Landroid/view/ViewGroup;)Lru/ozon/uni/android/controls/buttonV3/ButtonV3View;", "LA00/a$J$a;", "update", "oldItem", "handleUpdate", "(LA00/a$J$a;Lru/ozon/app/android/ugc/core/widgets/singlereview/translateButton/presentation/TranslateButtonVO;)Lru/ozon/app/android/ugc/core/widgets/singlereview/translateButton/presentation/TranslateButtonVO;", "", "state", "", "canMap", "(Ljava/lang/Object;)Z", "Landroid/content/Context;", "context", "", "Landroidx/recyclerview/widget/RecyclerView$n;", "getDecorators", "(Landroid/content/Context;)Ljava/util/List;", "Lk20/g;", "Lru/ozon/app/android/composer/widgets/v2/di/ComposerWidgetComponentStorage;", "storage", "Lk20/e;", "Lru/ozon/app/android/composer/widgets/v2/di/WidgetComponent;", "widgetComponent", "(Lk20/g;)Lk20/e;", "Lkotlin/Function2;", "Landroid/view/View;", "Lru/ozon/app/android/composer/ComposerReferences;", "Lru/ozon/app/android/ugc/core/widgets/singlereview/translateButton/presentation/TranslateButtonVH;", "holderProducer", "Lkotlin/jvm/functions/Function2;", "getHolderProducer", "()Lkotlin/jvm/functions/Function2;", "Ljava/lang/Class;", "supportedUpdates", "Ljava/util/List;", "getSupportedUpdates", "()Ljava/util/List;", "Lru/ozon/app/android/ugc/core/widgets/singlereview/translateButton/TranslateButtonMapper;", "getMapper", "()Lru/ozon/app/android/ugc/core/widgets/singlereview/translateButton/TranslateButtonMapper;", "mapper", "TranslatedUpdateKey", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class TranslateButtonViewMapper extends WidgetViewMapper2<TranslateButtonComponent, TranslateButtonDO, TranslateButtonVO> {

    @NotNull
    private final Function2<View, ComposerReferences, TranslateButtonVH> holderProducer = new TranslateButtonViewMapper$holderProducer$1(this);

    @NotNull
    private final List<Class<? extends a.J.InterfaceC0007a>> supportedUpdates = C7714v.b0(TranslatedUpdateKey.class, TranslateShowLoadingUpdateKey.class);

    @Override // ru.ozon.composer.ui.widget.g, m20.InterfaceC8046a
    public boolean canMap(Object state) {
        return (state instanceof TranslateButtonDO) && ((TranslateButtonDO) state).getTranslateButton() != null;
    }

    @Override // ru.ozon.composer.ui.widget.g
    @NotNull
    public List<RecyclerView.n> getDecorators(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return C7714v.a0(new TranslateButtonDecoration(context));
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    /* renamed from: getHolderProducer */
    public Function2<View, ComposerReferences, TranslateButtonVH> mo614getHolderProducer() {
        return this.holderProducer;
    }

    @Override // ru.ozon.composer.ui.widget.g, I00.d
    @NotNull
    public List<Class<? extends a.J.InterfaceC0007a>> getSupportedUpdates() {
        return this.supportedUpdates;
    }

    @Override // ru.ozon.app.android.composer.widgets.v2.ViewMapper2
    @NotNull
    public C7473e<TranslateButtonComponent> widgetComponent(@NotNull C7475g storage) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        return TranslateButtonComponent.INSTANCE.create(storage);
    }

    @Override // ru.ozon.composer.ui.widget.g
    @NotNull
    public ButtonV3View createView(@NotNull ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Context context = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        return new ButtonV3View(context, null, 0, 0, 14, null);
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    public TranslateButtonMapper getMapper() {
        return component().getTranslateButtonMapper();
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper, ru.ozon.composer.ui.widget.g, I00.d
    @NotNull
    public TranslateButtonVO handleUpdate(@NotNull a.J.InterfaceC0007a update, @NotNull TranslateButtonVO oldItem) {
        Intrinsics.checkNotNullParameter(update, "update");
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        if (update instanceof TranslatedUpdateKey) {
            TranslatedUpdateKey translatedUpdateKey = (TranslatedUpdateKey) update;
            if (oldItem.getReviewId() == translatedUpdateKey.getReviewId()) {
                ButtonV3DTO finalButton = translatedUpdateKey.getIsFinal() ? oldItem.getFinalButton() : oldItem.getInitialButton();
                List<SingleReviewDTO.BodySectionDTO> finalAtoms = oldItem.getFinalAtoms();
                if (finalAtoms == null) {
                    finalAtoms = translatedUpdateKey.getAtoms();
                }
                return TranslateButtonVO.copy$default(oldItem, 0L, 0L, null, null, null, finalButton, null, finalAtoms, null, null, 863, null);
            }
        }
        if (update instanceof TranslateShowLoadingUpdateKey) {
            TranslateShowLoadingUpdateKey translateShowLoadingUpdateKey = (TranslateShowLoadingUpdateKey) update;
            if (oldItem.getId() == translateShowLoadingUpdateKey.getId()) {
                return TranslateButtonVO.copy$default(oldItem, 0L, 0L, null, null, null, translateShowLoadingUpdateKey.getIsLoading() ? oldItem.getInProgressButton() : oldItem.getInitialButton(), null, null, null, null, 991, null);
            }
        }
        return oldItem;
    }

    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00072\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\u001b\u001a\u0004\b\b\u0010\u001c¨\u0006\u001d"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/singlereview/translateButton/TranslateButtonViewMapper$TranslatedUpdateKey;", "LA00/a$J$a;", "", "reviewId", "", "Lru/ozon/app/android/pdp/ui/configurators/ugc/singleReview/SingleReviewDTO$BodySectionDTO;", "atoms", "", "isFinal", "<init>", "(JLjava/util/List;Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "J", "getReviewId", "()J", "Ljava/util/List;", "getAtoms", "()Ljava/util/List;", "Z", "()Z", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class TranslatedUpdateKey implements a.J.InterfaceC0007a {

        @NotNull
        private final List<SingleReviewDTO.BodySectionDTO> atoms;
        private final boolean isFinal;
        private final long reviewId;

        public TranslatedUpdateKey(long j11, @NotNull List<SingleReviewDTO.BodySectionDTO> atoms, boolean z11) {
            Intrinsics.checkNotNullParameter(atoms, "atoms");
            this.reviewId = j11;
            this.atoms = atoms;
            this.isFinal = z11;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof TranslatedUpdateKey)) {
                return false;
            }
            TranslatedUpdateKey translatedUpdateKey = (TranslatedUpdateKey) other;
            return this.reviewId == translatedUpdateKey.reviewId && Intrinsics.d(this.atoms, translatedUpdateKey.atoms) && this.isFinal == translatedUpdateKey.isFinal;
        }

        @NotNull
        public final List<SingleReviewDTO.BodySectionDTO> getAtoms() {
            return this.atoms;
        }

        public final long getReviewId() {
            return this.reviewId;
        }

        public int hashCode() {
            return Boolean.hashCode(this.isFinal) + g.b(Long.hashCode(this.reviewId) * 31, 31, this.atoms);
        }

        /* renamed from: isFinal, reason: from getter */
        public final boolean getIsFinal() {
            return this.isFinal;
        }

        @NotNull
        public String toString() {
            long j11 = this.reviewId;
            List<SingleReviewDTO.BodySectionDTO> list = this.atoms;
            return b.f(Lh.b.b(j11, "TranslatedUpdateKey(reviewId=", ", atoms=", list), ", isFinal=", this.isFinal, ")");
        }

        public /* synthetic */ TranslatedUpdateKey(long j11, List list, boolean z11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(j11, list, (i11 & 4) != 0 ? true : z11);
        }
    }
}
