package ru.ozon.app.android.regulardraw.widgets.mainDrawMajorScreen.actionhandler;

import Sc.r;
import Sc.s;
import Wc.a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import l10.InterfaceC7851b;
import ru.ozon.app.android.action.custom.CustomActionHandler;
import ru.ozon.app.android.action.v2.ActionV2Repository;
import ru.ozon.app.android.action.v2.models.ActionV2Request;
import ru.ozon.app.android.action.v2.models.ActionV2Response;
import ru.ozon.app.android.regulardraw.widgets.mainDrawMajorScreen.actionhandler.MainDrawMajorScreenProgressUpdateActionHandler;
import ru.ozon.app.android.regulardraw.widgets.mainDrawMajorScreen.core.MainDrawMajorScreenViewMapper;
import ru.ozon.app.android.regulardraw.widgets.mainDrawMajorScreen.presentation.MainDrawMajorScreenViewModel;
import ru.ozon.uni.atoms.af.AtomAction;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.regulardraw.widgets.mainDrawMajorScreen.actionhandler.MainDrawMajorScreenProgressUpdateActionHandler$processAction$1", f = "MainDrawMajorScreenProgressUpdateActionHandler.kt", l = {84}, m = "invokeSuspend")
/* loaded from: classes13.dex */
final class MainDrawMajorScreenProgressUpdateActionHandler$processAction$1 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ AtomAction $action;
    final /* synthetic */ CustomActionHandler.HandlerReferences $handlerRefs;
    final /* synthetic */ MainDrawMajorScreenViewModel $mainDrawMajorScreenViewModel;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ MainDrawMajorScreenProgressUpdateActionHandler this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MainDrawMajorScreenProgressUpdateActionHandler$processAction$1(MainDrawMajorScreenProgressUpdateActionHandler mainDrawMajorScreenProgressUpdateActionHandler, AtomAction atomAction, MainDrawMajorScreenViewModel mainDrawMajorScreenViewModel, CustomActionHandler.HandlerReferences handlerReferences, d<? super MainDrawMajorScreenProgressUpdateActionHandler$processAction$1> dVar) {
        super(2, dVar);
        this.this$0 = mainDrawMajorScreenProgressUpdateActionHandler;
        this.$action = atomAction;
        this.$mainDrawMajorScreenViewModel = mainDrawMajorScreenViewModel;
        this.$handlerRefs = handlerReferences;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        MainDrawMajorScreenProgressUpdateActionHandler$processAction$1 mainDrawMajorScreenProgressUpdateActionHandler$processAction$1 = new MainDrawMajorScreenProgressUpdateActionHandler$processAction$1(this.this$0, this.$action, this.$mainDrawMajorScreenViewModel, this.$handlerRefs, dVar);
        mainDrawMajorScreenProgressUpdateActionHandler$processAction$1.L$0 = obj;
        return mainDrawMajorScreenProgressUpdateActionHandler$processAction$1;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object a11;
        ActionV2Repository actionV2Repository;
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        try {
            if (i11 == 0) {
                s.b(obj);
                MainDrawMajorScreenProgressUpdateActionHandler mainDrawMajorScreenProgressUpdateActionHandler = this.this$0;
                AtomAction atomAction = this.$action;
                r.Companion companion = r.INSTANCE;
                actionV2Repository = mainDrawMajorScreenProgressUpdateActionHandler.actionV2Repository;
                ActionV2Request actionV2Request = new ActionV2Request(((AtomAction.ComposerAction) atomAction).getParams(), ((AtomAction.ComposerAction) atomAction).getActionName(), false, 4, null);
                this.label = 1;
                obj = actionV2Repository.callActionSuspend(actionV2Request, MainDrawMajorScreenProgressUpdateActionHandler.MainDrawMajorScreenDTO.class, this);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                s.b(obj);
            }
            a11 = (ActionV2Response) obj;
            r.Companion companion2 = r.INSTANCE;
        } catch (Throwable th2) {
            r.Companion companion3 = r.INSTANCE;
            a11 = s.a(th2);
        }
        MainDrawMajorScreenViewModel mainDrawMajorScreenViewModel = this.$mainDrawMajorScreenViewModel;
        CustomActionHandler.HandlerReferences handlerReferences = this.$handlerRefs;
        if (!(a11 instanceof r.b)) {
            MainDrawMajorScreenProgressUpdateActionHandler.MainDrawMajorScreenDTO mainDrawMajorScreenDTO = (MainDrawMajorScreenProgressUpdateActionHandler.MainDrawMajorScreenDTO) ((ActionV2Response) a11).getData();
            if (mainDrawMajorScreenDTO == null) {
                mainDrawMajorScreenViewModel.updateAnimationState(MainDrawMajorScreenViewModel.AnimationState.Restart.INSTANCE);
            } else if (mainDrawMajorScreenDTO.getPercent() == 100) {
                InterfaceC7851b.a.a(handlerReferences.getRefs().getController(), null, null, null, null, 15);
                mainDrawMajorScreenViewModel.updateAnimationState(MainDrawMajorScreenViewModel.AnimationState.Empty.INSTANCE);
            } else {
                MainDrawMajorScreenViewModel.AnimationState.Start start = new MainDrawMajorScreenViewModel.AnimationState.Start(mainDrawMajorScreenDTO.getPercent(), mainDrawMajorScreenDTO.getText());
                handlerReferences.getRefs().getController().d(new MainDrawMajorScreenViewMapper.MainDrawMajorScreenUpdateKey(mainDrawMajorScreenDTO.getPercent(), mainDrawMajorScreenDTO.getText()));
                mainDrawMajorScreenViewModel.updateAnimationState(start);
            }
        }
        MainDrawMajorScreenViewModel mainDrawMajorScreenViewModel2 = this.$mainDrawMajorScreenViewModel;
        if (r.b(a11) != null) {
            mainDrawMajorScreenViewModel2.updateAnimationState(MainDrawMajorScreenViewModel.AnimationState.Restart.INSTANCE);
        }
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((MainDrawMajorScreenProgressUpdateActionHandler$processAction$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
