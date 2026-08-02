package ru.ozon.app.android.pdp.widgets.descriptionAccordion.core;

import A00.a;
import Ae.B0;
import Ae.C2399j;
import Ae.C2408n0;
import Ae.InterfaceC2395h;
import Ae.InterfaceC2397i;
import Sc.s;
import T7.E;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.D;
import androidx.lifecycle.K;
import androidx.lifecycle.w0;
import androidx.lifecycle.z0;
import androidx.recyclerview.widget.LinearLayoutManager;
import j10.h;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import k20.C7473e;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.c;
import kotlin.coroutines.jvm.internal.e;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.widgets.v2.WidgetViewMapper2;
import ru.ozon.app.android.pdp.R$layout;
import ru.ozon.app.android.pdp.widgets.descriptionAccordion.data.DescriptionAccordionDTO;
import ru.ozon.app.android.pdp.widgets.descriptionAccordion.di.DescriptionAccordionWidgetComponent;
import ru.ozon.app.android.pdp.widgets.descriptionAccordion.presentation.DescriptionAccordionVO;
import ru.ozon.app.android.pdp.widgets.descriptionAccordion.presentation.DescriptionAccordionViewHolder;
import ru.ozon.app.android.pdp.widgets.translateButton.core.TranslateShowLoadingUpdateKey;
import ru.ozon.app.android.pdp.widgets.translateButton.presentation.TranslateViewModel;
import ru.ozon.composer.ui.widget.l;

@Metadata(d1 = {"\u0000\u0092\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u0001:B\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\b\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\b\u0010\nJ\u001f\u0010\f\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\f\u0010\nJ+\u0010\u0012\u001a\u0012\u0012\u0004\u0012\u00020\u00020\u0010j\b\u0012\u0004\u0012\u00020\u0002`\u00112\n\u0010\u000f\u001a\u00060\rj\u0002`\u000eH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J=\u0010#\u001a\u00020\"2\u0006\u0010\u0019\u001a\u00020\u00182\n\u0010\u001c\u001a\u00060\u001aj\u0002`\u001b2\u0006\u0010\u001e\u001a\u00020\u001d2\u0010\u0010!\u001a\f\u0012\u0004\u0012\u00020\u001a0\u001fj\u0002` H\u0016¢\u0006\u0004\b#\u0010$R\u001a\u0010&\u001a\u00020%8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R,\u0010-\u001a\u0014\u0012\u0004\u0012\u00020+\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020,0*8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100R(\u00103\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u000702018\u0016X\u0096\u0004¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b5\u00106R,\u00109\u001a\u001a\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u000207\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u0004010*8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b8\u00100¨\u0006;"}, d2 = {"Lru/ozon/app/android/pdp/widgets/descriptionAccordion/core/DescriptionAccordionViewMapper;", "Lru/ozon/app/android/composer/widgets/v2/WidgetViewMapper2;", "Lru/ozon/app/android/pdp/widgets/descriptionAccordion/di/DescriptionAccordionWidgetComponent;", "Lru/ozon/app/android/pdp/widgets/descriptionAccordion/data/DescriptionAccordionDTO;", "Lru/ozon/app/android/pdp/widgets/descriptionAccordion/presentation/DescriptionAccordionVO;", "<init>", "()V", "LA00/a$J$a;", "update", "oldVO", "(LA00/a$J$a;Lru/ozon/app/android/pdp/widgets/descriptionAccordion/presentation/DescriptionAccordionVO;)Lru/ozon/app/android/pdp/widgets/descriptionAccordion/presentation/DescriptionAccordionVO;", "oldItem", "handleUpdate", "Lk20/g;", "Lru/ozon/app/android/composer/widgets/v2/di/ComposerWidgetComponentStorage;", "storage", "Lk20/e;", "Lru/ozon/app/android/composer/widgets/v2/di/WidgetComponent;", "widgetComponent", "(Lk20/g;)Lk20/e;", "newItem", "", "getPayload", "(Lru/ozon/app/android/pdp/widgets/descriptionAccordion/presentation/DescriptionAccordionVO;Lru/ozon/app/android/pdp/widgets/descriptionAccordion/presentation/DescriptionAccordionVO;)Ljava/lang/Object;", "Landroid/view/ViewGroup;", "composerRootView", "Lru/ozon/composer/ui/widget/l;", "Lru/ozon/app/android/composer/view/ComposerViewObject;", "viewObject", "Lru/ozon/app/android/composer/ComposerReferences;", "references", "Lj10/h;", "Lru/ozon/app/android/composer/viewmodel/ComposerVoHelper;", "viewItemHelper", "", "constructLayout", "(Landroid/view/ViewGroup;Lru/ozon/composer/ui/widget/l;Lru/ozon/app/android/composer/ComposerReferences;Lj10/h;)V", "", "layout", "I", "getLayout", "()Ljava/lang/Integer;", "Lkotlin/Function2;", "Landroid/view/View;", "Lru/ozon/app/android/pdp/widgets/descriptionAccordion/presentation/DescriptionAccordionViewHolder;", "holderProducer", "Lkotlin/jvm/functions/Function2;", "getHolderProducer", "()Lkotlin/jvm/functions/Function2;", "", "Ljava/lang/Class;", "supportedUpdates", "Ljava/util/List;", "getSupportedUpdates", "()Ljava/util/List;", "Ll20/d;", "getMapper", "mapper", "DescriptionAccordionPayload", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class DescriptionAccordionViewMapper extends WidgetViewMapper2<DescriptionAccordionWidgetComponent, DescriptionAccordionDTO, DescriptionAccordionVO> {
    private final int layout = R$layout.pdp_widget_description_accordion;

    @NotNull
    private final Function2<View, ComposerReferences, DescriptionAccordionViewHolder> holderProducer = new DescriptionAccordionViewMapper$holderProducer$1(this);

    @NotNull
    private final List<Class<? extends a.J.InterfaceC0007a>> supportedUpdates = C7714v.b0(PdpDescriptionAccordionUpdateKey.class, AsyncDescriptionAccordionUpdateKey.class, TranslateShowLoadingUpdateKey.class);

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\b\t\n\u000b¨\u0006\f"}, d2 = {"Lru/ozon/app/android/pdp/widgets/descriptionAccordion/core/DescriptionAccordionViewMapper$DescriptionAccordionPayload;", "", "<init>", "()V", "ChangeText", "Animation", "Loading", "ChangeHeight", "Lru/ozon/app/android/pdp/widgets/descriptionAccordion/core/DescriptionAccordionViewMapper$DescriptionAccordionPayload$Animation;", "Lru/ozon/app/android/pdp/widgets/descriptionAccordion/core/DescriptionAccordionViewMapper$DescriptionAccordionPayload$ChangeHeight;", "Lru/ozon/app/android/pdp/widgets/descriptionAccordion/core/DescriptionAccordionViewMapper$DescriptionAccordionPayload$ChangeText;", "Lru/ozon/app/android/pdp/widgets/descriptionAccordion/core/DescriptionAccordionViewMapper$DescriptionAccordionPayload$Loading;", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes13.dex */
    public static abstract class DescriptionAccordionPayload {

        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lru/ozon/app/android/pdp/widgets/descriptionAccordion/core/DescriptionAccordionViewMapper$DescriptionAccordionPayload$Animation;", "Lru/ozon/app/android/pdp/widgets/descriptionAccordion/core/DescriptionAccordionViewMapper$DescriptionAccordionPayload;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Animation extends DescriptionAccordionPayload {

            @NotNull
            public static final Animation INSTANCE = new Animation();

            private Animation() {
                super(null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof Animation);
            }

            public int hashCode() {
                return -835489185;
            }

            @NotNull
            public String toString() {
                return "Animation";
            }
        }

        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0011\u0010\n¨\u0006\u0012"}, d2 = {"Lru/ozon/app/android/pdp/widgets/descriptionAccordion/core/DescriptionAccordionViewMapper$DescriptionAccordionPayload$ChangeHeight;", "Lru/ozon/app/android/pdp/widgets/descriptionAccordion/core/DescriptionAccordionViewMapper$DescriptionAccordionPayload;", "", "oldIncreaseHeight", "<init>", "(I)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getOldIncreaseHeight", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class ChangeHeight extends DescriptionAccordionPayload {
            private final int oldIncreaseHeight;

            public ChangeHeight(int i11) {
                super(null);
                this.oldIncreaseHeight = i11;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof ChangeHeight) && this.oldIncreaseHeight == ((ChangeHeight) other).oldIncreaseHeight;
            }

            public final int getOldIncreaseHeight() {
                return this.oldIncreaseHeight;
            }

            public int hashCode() {
                return Integer.hashCode(this.oldIncreaseHeight);
            }

            @NotNull
            public String toString() {
                return E.a(this.oldIncreaseHeight, "ChangeHeight(oldIncreaseHeight=", ")");
            }
        }

        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lru/ozon/app/android/pdp/widgets/descriptionAccordion/core/DescriptionAccordionViewMapper$DescriptionAccordionPayload$ChangeText;", "Lru/ozon/app/android/pdp/widgets/descriptionAccordion/core/DescriptionAccordionViewMapper$DescriptionAccordionPayload;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class ChangeText extends DescriptionAccordionPayload {

            @NotNull
            public static final ChangeText INSTANCE = new ChangeText();

            private ChangeText() {
                super(null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof ChangeText);
            }

            public int hashCode() {
                return 1718614402;
            }

            @NotNull
            public String toString() {
                return "ChangeText";
            }
        }

        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lru/ozon/app/android/pdp/widgets/descriptionAccordion/core/DescriptionAccordionViewMapper$DescriptionAccordionPayload$Loading;", "Lru/ozon/app/android/pdp/widgets/descriptionAccordion/core/DescriptionAccordionViewMapper$DescriptionAccordionPayload;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Loading extends DescriptionAccordionPayload {

            @NotNull
            public static final Loading INSTANCE = new Loading();

            private Loading() {
                super(null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof Loading);
            }

            public int hashCode() {
                return 1005007575;
            }

            @NotNull
            public String toString() {
                return "Loading";
            }
        }

        public /* synthetic */ DescriptionAccordionPayload(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private DescriptionAccordionPayload() {
        }
    }

    private final DescriptionAccordionVO update(a.J.InterfaceC0007a update, DescriptionAccordionVO oldVO) {
        if (update instanceof PdpDescriptionAccordionUpdateKey) {
            PdpDescriptionAccordionUpdateKey pdpDescriptionAccordionUpdateKey = (PdpDescriptionAccordionUpdateKey) update;
            if (pdpDescriptionAccordionUpdateKey.getId() == oldVO.getId()) {
                return DescriptionAccordionVO.copy$default(oldVO, 0L, null, null, DescriptionAccordionVO.Icon.copy$default(oldVO.getIcon(), pdpDescriptionAccordionUpdateKey.getIsExpanded(), null, false, 6, null), null, false, null, null, null, false, 1015, null);
            }
        } else {
            if (update instanceof AsyncDescriptionAccordionUpdateKey) {
                for (DescriptionAccordionVO descriptionAccordionVO : ((AsyncDescriptionAccordionUpdateKey) update).getVo()) {
                    if (descriptionAccordionVO.getId() == oldVO.getId()) {
                        return DescriptionAccordionVO.copy$default(descriptionAccordionVO, 0L, null, null, oldVO.getIcon(), null, false, null, null, null, false, 1015, null);
                    }
                }
                throw new NoSuchElementException("Collection contains no element matching the predicate.");
            }
            if (update instanceof TranslateShowLoadingUpdateKey) {
                return DescriptionAccordionVO.copy$default(oldVO, 0L, null, null, null, null, false, null, null, null, ((TranslateShowLoadingUpdateKey) update).getIsShow(), 511, null);
            }
        }
        return oldVO;
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    public void constructLayout(@NotNull ViewGroup composerRootView, @NotNull l viewObject, @NotNull ComposerReferences references, @NotNull h<l> viewItemHelper) {
        Intrinsics.checkNotNullParameter(composerRootView, "composerRootView");
        Intrinsics.checkNotNullParameter(viewObject, "viewObject");
        Intrinsics.checkNotNullParameter(references, "references");
        Intrinsics.checkNotNullParameter(viewItemHelper, "viewItemHelper");
        D a11 = K.a(references.getContainer().g());
        TranslateViewModel translateViewModel = (TranslateViewModel) new z0(references.getViewModelOwnerProvider().b(), new z0.c() { // from class: ru.ozon.app.android.pdp.widgets.descriptionAccordion.core.DescriptionAccordionViewMapper$constructLayout$$inlined$createViewModel$1
            @Override // androidx.lifecycle.z0.c, androidx.lifecycle.z0.b
            public <T extends w0> T create(Class<T> modelClass) {
                Intrinsics.checkNotNullParameter(modelClass, "modelClass");
                TranslateViewModel translateViewModel2 = DescriptionAccordionViewMapper.this.component().getTranslateViewModel();
                Intrinsics.g(translateViewModel2, "null cannot be cast to non-null type T of ru.ozon.app.android.utils.lifecycle.ViewModelExtKt.vmFactory.<no name provided>.create");
                return translateViewModel2;
            }
        }).a(TranslateViewModel.class);
        C2399j.C(new C2408n0(translateViewModel.getTranslateState(), new DescriptionAccordionViewMapper$constructLayout$1(viewObject, translateViewModel, null)), a11);
        final B0<Object> widgetUpdate = translateViewModel.getWidgetUpdate();
        C2399j.C(new C2408n0(new InterfaceC2395h<Object>() { // from class: ru.ozon.app.android.pdp.widgets.descriptionAccordion.core.DescriptionAccordionViewMapper$constructLayout$$inlined$filterIsInstance$1

            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            /* renamed from: ru.ozon.app.android.pdp.widgets.descriptionAccordion.core.DescriptionAccordionViewMapper$constructLayout$$inlined$filterIsInstance$1$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements InterfaceC2397i {
                final /* synthetic */ InterfaceC2397i $this_unsafeFlow;

                @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                @e(c = "ru.ozon.app.android.pdp.widgets.descriptionAccordion.core.DescriptionAccordionViewMapper$constructLayout$$inlined$filterIsInstance$1$2", f = "DescriptionAccordionViewMapper.kt", l = {50}, m = "emit")
                /* renamed from: ru.ozon.app.android.pdp.widgets.descriptionAccordion.core.DescriptionAccordionViewMapper$constructLayout$$inlined$filterIsInstance$1$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends c {
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(d dVar) {
                        super(dVar);
                    }

                    @Override // kotlin.coroutines.jvm.internal.a
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= LinearLayoutManager.INVALID_OFFSET;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(InterfaceC2397i interfaceC2397i) {
                    this.$this_unsafeFlow = interfaceC2397i;
                }

                /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
                @Override // Ae.InterfaceC2397i
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object emit(Object obj, d dVar) {
                    AnonymousClass1 anonymousClass1;
                    int i11;
                    if (dVar instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) dVar;
                        int i12 = anonymousClass1.label;
                        if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                            anonymousClass1.label = i12 - LinearLayoutManager.INVALID_OFFSET;
                            Object obj2 = anonymousClass1.result;
                            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                            i11 = anonymousClass1.label;
                            if (i11 != 0) {
                                s.b(obj2);
                                InterfaceC2397i interfaceC2397i = this.$this_unsafeFlow;
                                if (obj instanceof DescriptionAccordionDTO) {
                                    anonymousClass1.label = 1;
                                    if (interfaceC2397i.emit(obj, anonymousClass1) == aVar) {
                                        return aVar;
                                    }
                                }
                            } else {
                                if (i11 != 1) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                s.b(obj2);
                            }
                            return Unit.f71690a;
                        }
                    }
                    anonymousClass1 = new AnonymousClass1(dVar);
                    Object obj22 = anonymousClass1.result;
                    Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
                    i11 = anonymousClass1.label;
                    if (i11 != 0) {
                    }
                    return Unit.f71690a;
                }
            }

            @Override // Ae.InterfaceC2395h
            public Object collect(InterfaceC2397i<? super Object> interfaceC2397i, d dVar) {
                Object collect = InterfaceC2395h.this.collect(new AnonymousClass2(interfaceC2397i), dVar);
                return collect == Wc.a.COROUTINE_SUSPENDED ? collect : Unit.f71690a;
            }
        }, new DescriptionAccordionViewMapper$constructLayout$2(references, this, viewObject, null)), a11);
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    /* renamed from: getHolderProducer */
    public Function2<View, ComposerReferences, DescriptionAccordionViewHolder> mo614getHolderProducer() {
        return this.holderProducer;
    }

    @Override // ru.ozon.composer.ui.widget.g
    @NotNull
    public Integer getLayout() {
        return Integer.valueOf(this.layout);
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    public Function2<DescriptionAccordionDTO, l20.d, List<DescriptionAccordionVO>> getMapper() {
        return component().getMapper();
    }

    @Override // ru.ozon.composer.ui.widget.g, I00.d
    @NotNull
    public List<Class<? extends a.J.InterfaceC0007a>> getSupportedUpdates() {
        return this.supportedUpdates;
    }

    @Override // ru.ozon.app.android.composer.widgets.v2.ViewMapper2
    @NotNull
    public C7473e<DescriptionAccordionWidgetComponent> widgetComponent(@NotNull C7475g storage) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        return DescriptionAccordionWidgetComponent.INSTANCE.getInstance(storage);
    }

    @Override // ru.ozon.composer.ui.widget.g
    @NotNull
    public Object getPayload(@NotNull DescriptionAccordionVO oldItem, @NotNull DescriptionAccordionVO newItem) {
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        Intrinsics.checkNotNullParameter(newItem, "newItem");
        ArrayList arrayList = new ArrayList();
        if (oldItem.getIcon().getIsDisclosureOpen() != newItem.getIcon().getIsDisclosureOpen()) {
            arrayList.add(DescriptionAccordionPayload.Animation.INSTANCE);
        }
        if (oldItem.getIsLoading() != newItem.getIsLoading()) {
            arrayList.add(DescriptionAccordionPayload.Loading.INSTANCE);
        }
        if (!Intrinsics.d(oldItem.getTitle(), newItem.getTitle()) || !Intrinsics.d(oldItem.getSubtitle(), newItem.getSubtitle())) {
            arrayList.add(DescriptionAccordionPayload.ChangeText.INSTANCE);
        }
        if (oldItem.getIcon().getIsDisclosureOpen() && newItem.getIcon().getIsDisclosureOpen() && !Intrinsics.d(oldItem.getDisclosureSubtitleHeight(), newItem.getDisclosureSubtitleHeight())) {
            Integer disclosureSubtitleHeight = oldItem.getDisclosureSubtitleHeight();
            arrayList.add(new DescriptionAccordionPayload.ChangeHeight(disclosureSubtitleHeight != null ? disclosureSubtitleHeight.intValue() : 0));
        }
        return arrayList;
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper, ru.ozon.composer.ui.widget.g, I00.d
    @NotNull
    public DescriptionAccordionVO handleUpdate(@NotNull a.J.InterfaceC0007a update, @NotNull DescriptionAccordionVO oldItem) {
        Intrinsics.checkNotNullParameter(update, "update");
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        return update(update, oldItem);
    }
}
