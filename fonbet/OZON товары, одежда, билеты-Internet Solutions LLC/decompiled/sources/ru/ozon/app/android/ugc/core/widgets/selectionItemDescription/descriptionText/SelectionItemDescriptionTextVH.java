package ru.ozon.app.android.ugc.core.widgets.selectionItemDescription.descriptionText;

import A00.a;
import Ae.C2399j;
import Ae.C2408n0;
import Ae.InterfaceC2395h;
import Ae.InterfaceC2397i;
import Sc.InterfaceC4008j;
import Sc.s;
import WZ.l;
import android.annotation.SuppressLint;
import android.view.MotionEvent;
import android.view.View;
import androidx.lifecycle.K;
import androidx.recyclerview.widget.LinearLayoutManager;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.c;
import kotlin.coroutines.jvm.internal.e;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.pdp.utils.LinkOnlyMovementMethod;
import ru.ozon.app.android.ugc.core.widgets.commentsListV3.data.CommentV3DTO;
import ru.ozon.app.android.ugc.core.widgets.selectionItemDescription.core.SelectionItemDescriptionScrollViewModel;
import ru.ozon.app.android.ugc.core.widgets.selectionItemDescription.core.SelectionItemDescriptionScrollableVH;
import ru.ozon.app.android.ugc.core.widgets.selectionItemDescription.descriptionText.SelectionItemDescriptionTextVH;
import ru.ozon.app.android.utils.LazyUtilsKt;
import ru.ozon.uni.android.atom.text.expandable.ExpandableTextAtomView;
import ru.ozon.uni.atoms.utils.OzonSpannableStringKt;
import ru.ozon.uni.atoms.v3.holders.text.expandable.ExpandableTextHolderKt;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u0000 \u001f2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001fB+\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\u0010\u0007\u001a\u00060\u0005j\u0002`\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0010J\u001f\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u0013H\u0014¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0017R\u0018\u0010\u0007\u001a\u00060\u0005j\u0002`\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0018R\u001b\u0010\u001e\u001a\u00020\u00198BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d¨\u0006 "}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/selectionItemDescription/descriptionText/SelectionItemDescriptionTextVH;", "Lru/ozon/app/android/ugc/core/widgets/selectionItemDescription/core/SelectionItemDescriptionScrollableVH;", "Lru/ozon/app/android/ugc/core/widgets/selectionItemDescription/descriptionText/DescriptionTextVO;", "Lru/ozon/uni/android/atom/text/expandable/ExpandableTextAtomView;", CommentV3DTO.EXPANDABLE_TEXT_FIELD_NAME, "LWZ/l;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedAnalytics;", "tokenizedAnalytics", "Lru/ozon/app/android/composer/ComposerReferences;", "refs", "Lru/ozon/app/android/ugc/core/widgets/selectionItemDescription/core/SelectionItemDescriptionScrollViewModel;", "scrollViewModel", "<init>", "(Lru/ozon/uni/android/atom/text/expandable/ExpandableTextAtomView;LWZ/l;Lru/ozon/app/android/composer/ComposerReferences;Lru/ozon/app/android/ugc/core/widgets/selectionItemDescription/core/SelectionItemDescriptionScrollViewModel;)V", "", "observeRefreshEvent", "()V", "onAttach", "item", "Ll20/d;", "info", "bind", "(Lru/ozon/app/android/ugc/core/widgets/selectionItemDescription/descriptionText/DescriptionTextVO;Ll20/d;)V", "Lru/ozon/uni/android/atom/text/expandable/ExpandableTextAtomView;", "LWZ/l;", "Lru/ozon/app/android/pdp/utils/LinkOnlyMovementMethod;", "linkOnlyMovementMethod$delegate", "LSc/j;", "getLinkOnlyMovementMethod", "()Lru/ozon/app/android/pdp/utils/LinkOnlyMovementMethod;", "linkOnlyMovementMethod", "Companion", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SuppressLint({"ClickableViewAccessibility"})
/* loaded from: classes2.dex */
public final class SelectionItemDescriptionTextVH extends SelectionItemDescriptionScrollableVH<DescriptionTextVO> {

    @NotNull
    private final ExpandableTextAtomView expandableText;

    /* renamed from: linkOnlyMovementMethod$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j linkOnlyMovementMethod;

    @NotNull
    private final l tokenizedAnalytics;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/selectionItemDescription/descriptionText/SelectionItemDescriptionTextVH$Companion;", "", "<init>", "()V", "TITLE_KEY", "", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SelectionItemDescriptionTextVH(@NotNull final ExpandableTextAtomView expandableText, @NotNull l tokenizedAnalytics, @NotNull ComposerReferences refs, @NotNull SelectionItemDescriptionScrollViewModel scrollViewModel) {
        super(expandableText, refs, scrollViewModel);
        Intrinsics.checkNotNullParameter(expandableText, "expandableText");
        Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
        Intrinsics.checkNotNullParameter(refs, "refs");
        Intrinsics.checkNotNullParameter(scrollViewModel, "scrollViewModel");
        this.expandableText = expandableText;
        this.tokenizedAnalytics = tokenizedAnalytics;
        this.linkOnlyMovementMethod = LazyUtilsKt.unsafeLazy(new SelectionItemDescriptionTextVH$linkOnlyMovementMethod$2(this));
        expandableText.setOnTouchListener(new View.OnTouchListener() { // from class: mV.a
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                boolean lambda$1$lambda$0;
                lambda$1$lambda$0 = SelectionItemDescriptionTextVH.lambda$1$lambda$0(SelectionItemDescriptionTextVH.this, expandableText, view, motionEvent);
                return lambda$1$lambda$0;
            }
        });
    }

    private final LinkOnlyMovementMethod getLinkOnlyMovementMethod() {
        return (LinkOnlyMovementMethod) this.linkOnlyMovementMethod.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean lambda$1$lambda$0(SelectionItemDescriptionTextVH selectionItemDescriptionTextVH, ExpandableTextAtomView expandableTextAtomView, View view, MotionEvent motionEvent) {
        LinkOnlyMovementMethod linkOnlyMovementMethod = selectionItemDescriptionTextVH.getLinkOnlyMovementMethod();
        CharSequence text = expandableTextAtomView.getText();
        Intrinsics.checkNotNullExpressionValue(text, "getText(...)");
        return linkOnlyMovementMethod.onTouchEvent(expandableTextAtomView, OzonSpannableStringKt.toOzonSpannableString(text), motionEvent);
    }

    private final void observeRefreshEvent() {
        final InterfaceC2395h<A00.a> eventsFlow = getRefs().getController().getEventsFlow();
        C2399j.C(new C2408n0(new InterfaceC2395h<A00.a>() { // from class: ru.ozon.app.android.ugc.core.widgets.selectionItemDescription.descriptionText.SelectionItemDescriptionTextVH$observeRefreshEvent$$inlined$filter$1

            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            /* renamed from: ru.ozon.app.android.ugc.core.widgets.selectionItemDescription.descriptionText.SelectionItemDescriptionTextVH$observeRefreshEvent$$inlined$filter$1$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements InterfaceC2397i {
                final /* synthetic */ InterfaceC2397i $this_unsafeFlow;

                @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                @e(c = "ru.ozon.app.android.ugc.core.widgets.selectionItemDescription.descriptionText.SelectionItemDescriptionTextVH$observeRefreshEvent$$inlined$filter$1$2", f = "SelectionItemDescriptionTextVH.kt", l = {50}, m = "emit")
                /* renamed from: ru.ozon.app.android.ugc.core.widgets.selectionItemDescription.descriptionText.SelectionItemDescriptionTextVH$observeRefreshEvent$$inlined$filter$1$2$1, reason: invalid class name */
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
                                if (((A00.a) obj) instanceof a.u.c) {
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
            public Object collect(InterfaceC2397i<? super A00.a> interfaceC2397i, d dVar) {
                Object collect = InterfaceC2395h.this.collect(new AnonymousClass2(interfaceC2397i), dVar);
                return collect == Wc.a.COROUTINE_SUSPENDED ? collect : Unit.f71690a;
            }
        }, new SelectionItemDescriptionTextVH$observeRefreshEvent$2(this, null)), K.a(this));
    }

    @Override // ru.ozon.composer.ui.widget.k, jk0.j
    public void onAttach() {
        super.onAttach();
        observeRefreshEvent();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull DescriptionTextVO item, @NotNull l20.d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        ExpandableTextAtomView expandableTextAtomView = this.expandableText;
        ExpandableTextHolderKt.bind$default(expandableTextAtomView, item.getText(), null, 2, null);
        expandableTextAtomView.setOnClickListener(new SelectionItemDescriptionTextVH$bind$1$1(expandableTextAtomView, item, this));
    }
}
