package ru.ozon.app.android.ugc.core.widgets.selectionItemDescription.descriptionTitle;

import A00.a;
import Ae.C2399j;
import Ae.C2408n0;
import Ae.InterfaceC2395h;
import Ae.InterfaceC2397i;
import Sc.s;
import androidx.lifecycle.K;
import androidx.recyclerview.widget.LinearLayoutManager;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.c;
import kotlin.coroutines.jvm.internal.e;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.ugc.core.widgets.selectionItemDescription.core.SelectionItemDescriptionScrollViewModel;
import ru.ozon.app.android.ugc.core.widgets.selectionItemDescription.core.SelectionItemDescriptionScrollableVH;
import ru.ozon.uni.android.atom.text.expandable.ExpandableTextAtomView;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\rJ\u001f\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0010H\u0014¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0014R \u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u000b0\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/selectionItemDescription/descriptionTitle/SelectionItemDescriptionTitleVH;", "Lru/ozon/app/android/ugc/core/widgets/selectionItemDescription/core/SelectionItemDescriptionScrollableVH;", "Lru/ozon/app/android/ugc/core/widgets/selectionItemDescription/descriptionTitle/DescriptionTitleVO;", "Lru/ozon/app/android/ugc/core/widgets/selectionItemDescription/descriptionTitle/SelectionItemDescriptionTitleView;", "descriptionTitleView", "Lru/ozon/app/android/composer/ComposerReferences;", "refs", "Lru/ozon/app/android/ugc/core/widgets/selectionItemDescription/core/SelectionItemDescriptionScrollViewModel;", "scrollViewModel", "<init>", "(Lru/ozon/app/android/ugc/core/widgets/selectionItemDescription/descriptionTitle/SelectionItemDescriptionTitleView;Lru/ozon/app/android/composer/ComposerReferences;Lru/ozon/app/android/ugc/core/widgets/selectionItemDescription/core/SelectionItemDescriptionScrollViewModel;)V", "", "observeRefreshEvent", "()V", "onAttach", "item", "Ll20/d;", "info", "bind", "(Lru/ozon/app/android/ugc/core/widgets/selectionItemDescription/descriptionTitle/DescriptionTitleVO;Ll20/d;)V", "Lru/ozon/app/android/ugc/core/widgets/selectionItemDescription/descriptionTitle/SelectionItemDescriptionTitleView;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class SelectionItemDescriptionTitleVH extends SelectionItemDescriptionScrollableVH<DescriptionTitleVO> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final SelectionItemDescriptionTitleView descriptionTitleView;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SelectionItemDescriptionTitleVH(@NotNull SelectionItemDescriptionTitleView descriptionTitleView, @NotNull ComposerReferences refs, @NotNull SelectionItemDescriptionScrollViewModel scrollViewModel) {
        super(descriptionTitleView, refs, scrollViewModel);
        Intrinsics.checkNotNullParameter(descriptionTitleView, "descriptionTitleView");
        Intrinsics.checkNotNullParameter(refs, "refs");
        Intrinsics.checkNotNullParameter(scrollViewModel, "scrollViewModel");
        this.descriptionTitleView = descriptionTitleView;
        this.actionHandler = new ActionHandler.Builder(refs, this).buildHandler();
    }

    private final void observeRefreshEvent() {
        final InterfaceC2395h<a> eventsFlow = getRefs().getController().getEventsFlow();
        C2399j.C(new C2408n0(new InterfaceC2395h<a>() { // from class: ru.ozon.app.android.ugc.core.widgets.selectionItemDescription.descriptionTitle.SelectionItemDescriptionTitleVH$observeRefreshEvent$$inlined$filter$1

            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            /* renamed from: ru.ozon.app.android.ugc.core.widgets.selectionItemDescription.descriptionTitle.SelectionItemDescriptionTitleVH$observeRefreshEvent$$inlined$filter$1$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements InterfaceC2397i {
                final /* synthetic */ InterfaceC2397i $this_unsafeFlow;

                @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                @e(c = "ru.ozon.app.android.ugc.core.widgets.selectionItemDescription.descriptionTitle.SelectionItemDescriptionTitleVH$observeRefreshEvent$$inlined$filter$1$2", f = "SelectionItemDescriptionTitleVH.kt", l = {50}, m = "emit")
                /* renamed from: ru.ozon.app.android.ugc.core.widgets.selectionItemDescription.descriptionTitle.SelectionItemDescriptionTitleVH$observeRefreshEvent$$inlined$filter$1$2$1, reason: invalid class name */
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
                                if (((a) obj) instanceof a.u.c) {
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
            public Object collect(InterfaceC2397i<? super a> interfaceC2397i, d dVar) {
                Object collect = InterfaceC2395h.this.collect(new AnonymousClass2(interfaceC2397i), dVar);
                return collect == Wc.a.COROUTINE_SUSPENDED ? collect : Unit.f71690a;
            }
        }, new SelectionItemDescriptionTitleVH$observeRefreshEvent$2(this, null)), K.a(this));
    }

    @Override // ru.ozon.composer.ui.widget.k, jk0.j
    public void onAttach() {
        super.onAttach();
        observeRefreshEvent();
        ExpandableTextAtomView titleView = this.descriptionTitleView.getTitleView();
        titleView.setOnClickListener(new SelectionItemDescriptionTitleVH$onAttach$1$1(titleView, this));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull DescriptionTitleVO item, @NotNull l20.d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        this.descriptionTitleView.bind(item, this.actionHandler);
    }
}
