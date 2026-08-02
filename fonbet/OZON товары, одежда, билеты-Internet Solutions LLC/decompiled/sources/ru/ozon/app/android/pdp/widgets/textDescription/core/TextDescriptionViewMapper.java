package ru.ozon.app.android.pdp.widgets.textDescription.core;

import A00.a;
import Ae.B0;
import Ae.C2399j;
import Ae.C2408n0;
import Ae.InterfaceC2395h;
import Ae.InterfaceC2397i;
import Sc.s;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.D;
import androidx.lifecycle.K;
import androidx.lifecycle.w0;
import androidx.lifecycle.z0;
import androidx.recyclerview.widget.LinearLayoutManager;
import gk0.q;
import j10.h;
import java.util.ArrayList;
import java.util.List;
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
import ru.ozon.app.android.pdp.ui.configurators.R$layout;
import ru.ozon.app.android.pdp.view.shared.ExpandableWidget$ExpandButton;
import ru.ozon.app.android.pdp.widgets.textDescription.data.TextDescriptionDTO;
import ru.ozon.app.android.pdp.widgets.textDescription.di.TextDescriptionWidgetComponent;
import ru.ozon.app.android.pdp.widgets.textDescription.presentation.BaseTextDescriptionViewHolder;
import ru.ozon.app.android.pdp.widgets.textDescription.presentation.TextDescriptionVO;
import ru.ozon.app.android.pdp.widgets.translateButton.core.TranslateShowLoadingUpdateKey;
import ru.ozon.app.android.pdp.widgets.translateButton.presentation.TranslateViewModel;
import ru.ozon.app.android.utils.AppType;
import ru.ozon.composer.ui.widget.l;

@Metadata(d1 = {"\u0000\u008e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u00017B\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\n\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u000e\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ=\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0011\u001a\u00020\u00102\n\u0010\u0014\u001a\u00060\u0012j\u0002`\u00132\u0006\u0010\u0016\u001a\u00020\u00152\u0010\u0010\u0019\u001a\f\u0012\u0004\u0012\u00020\u00120\u0017j\u0002`\u0018H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ+\u0010\"\u001a\u0012\u0012\u0004\u0012\u00020\u00020 j\b\u0012\u0004\u0012\u00020\u0002`!2\n\u0010\u001f\u001a\u00060\u001dj\u0002`\u001eH\u0016¢\u0006\u0004\b\"\u0010#J\u0019\u0010&\u001a\u0004\u0018\u00010%2\u0006\u0010$\u001a\u00020\u0010H\u0016¢\u0006\u0004\b&\u0010'R,\u0010*\u001a\u0014\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020)0(8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R(\u00100\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00070/0.8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u00103R,\u00106\u001a\u001a\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u000204\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040.0(8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b5\u0010-¨\u00068"}, d2 = {"Lru/ozon/app/android/pdp/widgets/textDescription/core/TextDescriptionViewMapper;", "Lru/ozon/app/android/composer/widgets/v2/WidgetViewMapper2;", "Lru/ozon/app/android/pdp/widgets/textDescription/di/TextDescriptionWidgetComponent;", "Lru/ozon/app/android/pdp/widgets/textDescription/data/TextDescriptionDTO;", "Lru/ozon/app/android/pdp/widgets/textDescription/presentation/TextDescriptionVO;", "<init>", "()V", "LA00/a$J$a;", "update", "oldItem", "handleUpdate", "(LA00/a$J$a;Lru/ozon/app/android/pdp/widgets/textDescription/presentation/TextDescriptionVO;)Lru/ozon/app/android/pdp/widgets/textDescription/presentation/TextDescriptionVO;", "newItem", "", "getPayload", "(Lru/ozon/app/android/pdp/widgets/textDescription/presentation/TextDescriptionVO;Lru/ozon/app/android/pdp/widgets/textDescription/presentation/TextDescriptionVO;)Ljava/lang/Object;", "Landroid/view/ViewGroup;", "composerRootView", "Lru/ozon/composer/ui/widget/l;", "Lru/ozon/app/android/composer/view/ComposerViewObject;", "viewObject", "Lru/ozon/app/android/composer/ComposerReferences;", "references", "Lj10/h;", "Lru/ozon/app/android/composer/viewmodel/ComposerVoHelper;", "viewItemHelper", "", "constructLayout", "(Landroid/view/ViewGroup;Lru/ozon/composer/ui/widget/l;Lru/ozon/app/android/composer/ComposerReferences;Lj10/h;)V", "Lk20/g;", "Lru/ozon/app/android/composer/widgets/v2/di/ComposerWidgetComponentStorage;", "storage", "Lk20/e;", "Lru/ozon/app/android/composer/widgets/v2/di/WidgetComponent;", "widgetComponent", "(Lk20/g;)Lk20/e;", "parent", "Landroid/view/View;", "createView", "(Landroid/view/ViewGroup;)Landroid/view/View;", "Lkotlin/Function2;", "Lru/ozon/app/android/pdp/widgets/textDescription/presentation/BaseTextDescriptionViewHolder;", "holderProducer", "Lkotlin/jvm/functions/Function2;", "getHolderProducer", "()Lkotlin/jvm/functions/Function2;", "", "Ljava/lang/Class;", "supportedUpdates", "Ljava/util/List;", "getSupportedUpdates", "()Ljava/util/List;", "Ll20/d;", "getMapper", "mapper", "TextDescriptionPayload", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class TextDescriptionViewMapper extends WidgetViewMapper2<TextDescriptionWidgetComponent, TextDescriptionDTO, TextDescriptionVO> {

    @NotNull
    private final Function2<View, ComposerReferences, BaseTextDescriptionViewHolder> holderProducer = new TextDescriptionViewMapper$holderProducer$1(this);

    @NotNull
    private final List<Class<? extends a.J.InterfaceC0007a>> supportedUpdates = C7714v.b0(TextDescriptionExpandStateChangedUpdateKey.class, AsyncTextDescriptionUpdateKey.class, TranslateShowLoadingUpdateKey.class);

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\b\t\n\u000b¨\u0006\f"}, d2 = {"Lru/ozon/app/android/pdp/widgets/textDescription/core/TextDescriptionViewMapper$TextDescriptionPayload;", "", "<init>", "()V", "ChangeExpanded", "ChangeExpandedHeight", "ChangeText", "Loading", "Lru/ozon/app/android/pdp/widgets/textDescription/core/TextDescriptionViewMapper$TextDescriptionPayload$ChangeExpanded;", "Lru/ozon/app/android/pdp/widgets/textDescription/core/TextDescriptionViewMapper$TextDescriptionPayload$ChangeExpandedHeight;", "Lru/ozon/app/android/pdp/widgets/textDescription/core/TextDescriptionViewMapper$TextDescriptionPayload$ChangeText;", "Lru/ozon/app/android/pdp/widgets/textDescription/core/TextDescriptionViewMapper$TextDescriptionPayload$Loading;", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes13.dex */
    public static abstract class TextDescriptionPayload {

        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lru/ozon/app/android/pdp/widgets/textDescription/core/TextDescriptionViewMapper$TextDescriptionPayload$ChangeExpanded;", "Lru/ozon/app/android/pdp/widgets/textDescription/core/TextDescriptionViewMapper$TextDescriptionPayload;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class ChangeExpanded extends TextDescriptionPayload {

            @NotNull
            public static final ChangeExpanded INSTANCE = new ChangeExpanded();

            private ChangeExpanded() {
                super(null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof ChangeExpanded);
            }

            public int hashCode() {
                return 1497428421;
            }

            @NotNull
            public String toString() {
                return "ChangeExpanded";
            }
        }

        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lru/ozon/app/android/pdp/widgets/textDescription/core/TextDescriptionViewMapper$TextDescriptionPayload$ChangeExpandedHeight;", "Lru/ozon/app/android/pdp/widgets/textDescription/core/TextDescriptionViewMapper$TextDescriptionPayload;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class ChangeExpandedHeight extends TextDescriptionPayload {

            @NotNull
            public static final ChangeExpandedHeight INSTANCE = new ChangeExpandedHeight();

            private ChangeExpandedHeight() {
                super(null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof ChangeExpandedHeight);
            }

            public int hashCode() {
                return 1557219148;
            }

            @NotNull
            public String toString() {
                return "ChangeExpandedHeight";
            }
        }

        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lru/ozon/app/android/pdp/widgets/textDescription/core/TextDescriptionViewMapper$TextDescriptionPayload$ChangeText;", "Lru/ozon/app/android/pdp/widgets/textDescription/core/TextDescriptionViewMapper$TextDescriptionPayload;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class ChangeText extends TextDescriptionPayload {

            @NotNull
            public static final ChangeText INSTANCE = new ChangeText();

            private ChangeText() {
                super(null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof ChangeText);
            }

            public int hashCode() {
                return -2026901447;
            }

            @NotNull
            public String toString() {
                return "ChangeText";
            }
        }

        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lru/ozon/app/android/pdp/widgets/textDescription/core/TextDescriptionViewMapper$TextDescriptionPayload$Loading;", "Lru/ozon/app/android/pdp/widgets/textDescription/core/TextDescriptionViewMapper$TextDescriptionPayload;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Loading extends TextDescriptionPayload {

            @NotNull
            public static final Loading INSTANCE = new Loading();

            private Loading() {
                super(null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof Loading);
            }

            public int hashCode() {
                return -1327067264;
            }

            @NotNull
            public String toString() {
                return "Loading";
            }
        }

        public /* synthetic */ TextDescriptionPayload(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TextDescriptionPayload() {
        }
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    public void constructLayout(@NotNull ViewGroup composerRootView, @NotNull l viewObject, @NotNull ComposerReferences references, @NotNull h<l> viewItemHelper) {
        Intrinsics.checkNotNullParameter(composerRootView, "composerRootView");
        Intrinsics.checkNotNullParameter(viewObject, "viewObject");
        Intrinsics.checkNotNullParameter(references, "references");
        Intrinsics.checkNotNullParameter(viewItemHelper, "viewItemHelper");
        D a11 = K.a(references.getContainer().g());
        TranslateViewModel translateViewModel = (TranslateViewModel) new z0(references.getViewModelOwnerProvider().b(), new z0.c() { // from class: ru.ozon.app.android.pdp.widgets.textDescription.core.TextDescriptionViewMapper$constructLayout$$inlined$createViewModel$1
            @Override // androidx.lifecycle.z0.c, androidx.lifecycle.z0.b
            public <T extends w0> T create(Class<T> modelClass) {
                Intrinsics.checkNotNullParameter(modelClass, "modelClass");
                TranslateViewModel translateViewModel2 = TextDescriptionViewMapper.this.component().getTranslateViewModel();
                Intrinsics.g(translateViewModel2, "null cannot be cast to non-null type T of ru.ozon.app.android.utils.lifecycle.ViewModelExtKt.vmFactory.<no name provided>.create");
                return translateViewModel2;
            }
        }).a(TranslateViewModel.class);
        C2399j.C(new C2408n0(translateViewModel.getTranslateState(), new TextDescriptionViewMapper$constructLayout$1(viewObject, translateViewModel, null)), a11);
        final B0<Object> widgetUpdate = translateViewModel.getWidgetUpdate();
        C2399j.C(new C2408n0(new InterfaceC2395h<Object>() { // from class: ru.ozon.app.android.pdp.widgets.textDescription.core.TextDescriptionViewMapper$constructLayout$$inlined$filterIsInstance$1

            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            /* renamed from: ru.ozon.app.android.pdp.widgets.textDescription.core.TextDescriptionViewMapper$constructLayout$$inlined$filterIsInstance$1$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements InterfaceC2397i {
                final /* synthetic */ InterfaceC2397i $this_unsafeFlow;

                @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                @e(c = "ru.ozon.app.android.pdp.widgets.textDescription.core.TextDescriptionViewMapper$constructLayout$$inlined$filterIsInstance$1$2", f = "TextDescriptionViewMapper.kt", l = {50}, m = "emit")
                /* renamed from: ru.ozon.app.android.pdp.widgets.textDescription.core.TextDescriptionViewMapper$constructLayout$$inlined$filterIsInstance$1$2$1, reason: invalid class name */
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
                                if (obj instanceof TextDescriptionDTO) {
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
        }, new TextDescriptionViewMapper$constructLayout$2(references, this, viewObject, null)), a11);
    }

    @Override // ru.ozon.composer.ui.widget.g
    public View createView(@NotNull ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        int i11 = component().getAppType() == AppType.SELECT ? R$layout.pdp_select_widget_text_description : R$layout.pdp_widget_text_description;
        View h11 = q.f64554a.h(i11);
        return h11 == null ? LayoutInflater.from(parent.getContext()).inflate(i11, parent, false) : h11;
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    /* renamed from: getHolderProducer */
    public Function2<View, ComposerReferences, BaseTextDescriptionViewHolder> mo614getHolderProducer() {
        return this.holderProducer;
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    public Function2<TextDescriptionDTO, l20.d, List<TextDescriptionVO>> getMapper() {
        return component().getMapper();
    }

    @Override // ru.ozon.composer.ui.widget.g, I00.d
    @NotNull
    public List<Class<? extends a.J.InterfaceC0007a>> getSupportedUpdates() {
        return this.supportedUpdates;
    }

    @Override // ru.ozon.app.android.composer.widgets.v2.ViewMapper2
    @NotNull
    public C7473e<TextDescriptionWidgetComponent> widgetComponent(@NotNull C7475g storage) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        return TextDescriptionWidgetComponent.INSTANCE.getInstance(storage);
    }

    @Override // ru.ozon.composer.ui.widget.g
    @NotNull
    public Object getPayload(@NotNull TextDescriptionVO oldItem, @NotNull TextDescriptionVO newItem) {
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        Intrinsics.checkNotNullParameter(newItem, "newItem");
        ArrayList arrayList = new ArrayList();
        if (oldItem.getIsLoading() != newItem.getIsLoading()) {
            arrayList.add(TextDescriptionPayload.Loading.INSTANCE);
        }
        if (!Intrinsics.d(oldItem.getText(), newItem.getText())) {
            arrayList.add(TextDescriptionPayload.ChangeText.INSTANCE);
        }
        if (oldItem.getIsExpanded() != newItem.getIsExpanded()) {
            arrayList.add(TextDescriptionPayload.ChangeExpanded.INSTANCE);
        }
        if (oldItem.getIsExpanded() && newItem.getIsExpanded()) {
            ExpandableWidget$ExpandButton expandButton = oldItem.getExpandButton();
            Integer expandedContentHeight = expandButton != null ? expandButton.getExpandedContentHeight() : null;
            ExpandableWidget$ExpandButton expandButton2 = newItem.getExpandButton();
            if (!Intrinsics.d(expandedContentHeight, expandButton2 != null ? expandButton2.getExpandedContentHeight() : null)) {
                arrayList.add(TextDescriptionPayload.ChangeExpandedHeight.INSTANCE);
            }
        }
        return arrayList;
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper, ru.ozon.composer.ui.widget.g, I00.d
    @NotNull
    public TextDescriptionVO handleUpdate(@NotNull a.J.InterfaceC0007a update, @NotNull TextDescriptionVO oldItem) {
        Intrinsics.checkNotNullParameter(update, "update");
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        if (!(update instanceof TextDescriptionExpandStateChangedUpdateKey)) {
            if (update instanceof AsyncTextDescriptionUpdateKey) {
                return TextDescriptionVO.copy$default(((AsyncTextDescriptionUpdateKey) update).getVo(), 0L, null, null, oldItem.getIsExpanded(), null, null, null, false, 0, 503, null);
            }
            if (!(update instanceof TranslateShowLoadingUpdateKey)) {
                return oldItem;
            }
            TranslateShowLoadingUpdateKey translateShowLoadingUpdateKey = (TranslateShowLoadingUpdateKey) update;
            return TextDescriptionVO.copy$default(oldItem, 0L, null, null, false, null, null, null, translateShowLoadingUpdateKey.getIsShow(), translateShowLoadingUpdateKey.getLoaderTopPadding(), 127, null);
        }
        TextDescriptionExpandStateChangedUpdateKey textDescriptionExpandStateChangedUpdateKey = (TextDescriptionExpandStateChangedUpdateKey) update;
        boolean isExpanded = textDescriptionExpandStateChangedUpdateKey.getVo().getIsExpanded();
        boolean z11 = !isExpanded;
        TextDescriptionVO vo = textDescriptionExpandStateChangedUpdateKey.getVo();
        ExpandableWidget$ExpandButton expandButton = textDescriptionExpandStateChangedUpdateKey.getVo().getExpandButton();
        if (!isExpanded) {
            expandButton = null;
        }
        return TextDescriptionVO.copy$default(vo, 0L, null, expandButton, z11, null, null, null, false, 0, 499, null);
    }
}
