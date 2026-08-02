package ru.ozon.app.android.ugc.widgets.selectionItemForm.presentation;

import Ae.w0;
import Sc.o;
import Sc.s;
import Wc.a;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.presentation.SingleEvent;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.presentation.ViewIntent;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "event", "Lru/ozon/app/android/ugc/widgets/selectionItemForm/presentation/ViewIntent;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@e(c = "ru.ozon.app.android.ugc.widgets.selectionItemForm.presentation.SelectionFormViewModel$observeViewIntent$1", f = "SelectionFormViewModel.kt", l = {100, 103, 114, 123}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class SelectionFormViewModel$observeViewIntent$1 extends j implements Function2<ViewIntent, d<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ SelectionFormViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SelectionFormViewModel$observeViewIntent$1(SelectionFormViewModel selectionFormViewModel, d<? super SelectionFormViewModel$observeViewIntent$1> dVar) {
        super(2, dVar);
        this.this$0 = selectionFormViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        SelectionFormViewModel$observeViewIntent$1 selectionFormViewModel$observeViewIntent$1 = new SelectionFormViewModel$observeViewIntent$1(this.this$0, dVar);
        selectionFormViewModel$observeViewIntent$1.L$0 = obj;
        return selectionFormViewModel$observeViewIntent$1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0052, code lost:
    
        if (r7.emit(r1, r6) == r0) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0081, code lost:
    
        if (r7.emit(r1, r6) == r0) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00b3, code lost:
    
        if (r1.emit(r2, r6) == r0) goto L40;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x00d4  */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Map map;
        Map map2;
        Map map3;
        Map map4;
        Map map5;
        Map map6;
        Set set;
        Object isRequiredFilled;
        ViewIntent viewIntent;
        w0 w0Var;
        Map customTrackingInfo;
        w0 w0Var2;
        boolean isAnyInputFilled;
        Object obj2;
        Map customTrackingInfo2;
        boolean z11;
        w0 w0Var3;
        Map customTrackingInfo3;
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 != 0) {
            if (i11 == 1 || i11 == 2 || i11 == 3) {
                s.b(obj);
                return Unit.f71690a;
            }
            if (i11 != 4) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            viewIntent = (ViewIntent) this.L$0;
            s.b(obj);
            if (((Boolean) obj).booleanValue()) {
                return Unit.f71690a;
            }
            this.this$0.processSubmitAction(((ViewIntent.SubmitPressed) viewIntent).getAction());
            return Unit.f71690a;
        }
        s.b(obj);
        ViewIntent viewIntent2 = (ViewIntent) this.L$0;
        if (viewIntent2 instanceof ViewIntent.FormOpened) {
            z11 = this.this$0.isCancelSheetShowing;
            if (z11) {
                w0Var3 = this.this$0._singleEvent;
                customTrackingInfo3 = this.this$0.getCustomTrackingInfo();
                SingleEvent.ShowCancelSheet showCancelSheet = new SingleEvent.ShowCancelSheet(customTrackingInfo3);
                this.label = 1;
            }
            return Unit.f71690a;
        }
        if (viewIntent2 instanceof ViewIntent.BackPressed) {
            w0Var2 = this.this$0._singleEvent;
            isAnyInputFilled = this.this$0.isAnyInputFilled();
            if (isAnyInputFilled) {
                this.this$0.isCancelSheetShowing = true;
                customTrackingInfo2 = this.this$0.getCustomTrackingInfo();
                obj2 = new SingleEvent.ShowCancelSheet(customTrackingInfo2);
            } else {
                obj2 = SingleEvent.CloseForm.INSTANCE;
            }
            this.label = 2;
        } else {
            if (!(viewIntent2 instanceof ViewIntent.SheetAction)) {
                if (viewIntent2 instanceof ViewIntent.SubmitPressed) {
                    SelectionFormViewModel selectionFormViewModel = this.this$0;
                    this.L$0 = viewIntent2;
                    this.label = 4;
                    isRequiredFilled = selectionFormViewModel.isRequiredFilled(this);
                    if (isRequiredFilled != aVar) {
                        viewIntent = viewIntent2;
                        obj = isRequiredFilled;
                        if (((Boolean) obj).booleanValue()) {
                        }
                    }
                    return aVar;
                }
                if (viewIntent2 instanceof ViewIntent.InputUpdated) {
                    map4 = this.this$0.inputData;
                    ViewIntent.InputUpdated inputUpdated = (ViewIntent.InputUpdated) viewIntent2;
                    map4.put(inputUpdated.getUploadKey(), inputUpdated.getValue());
                    if (inputUpdated.getIsRequired()) {
                        set = this.this$0.requiredInputs;
                        set.add(inputUpdated.getUploadKey());
                    }
                    if (inputUpdated.getIsInitialValue()) {
                        map5 = this.this$0.inputInitialData;
                        if (!map5.containsKey(inputUpdated.getUploadKey())) {
                            map6 = this.this$0.inputInitialData;
                            map6.put(inputUpdated.getUploadKey(), inputUpdated.getValue());
                        }
                    }
                } else if (viewIntent2 instanceof ViewIntent.CellUpdated) {
                    ViewIntent.CellUpdated cellUpdated = (ViewIntent.CellUpdated) viewIntent2;
                    String obj3 = cellUpdated.getValue().toString();
                    map = this.this$0.cellData;
                    map.put(cellUpdated.getUploadKey(), obj3);
                    map2 = this.this$0.cellInitialData;
                    if (!map2.containsKey(cellUpdated.getUploadKey())) {
                        map3 = this.this$0.cellInitialData;
                        map3.put(cellUpdated.getUploadKey(), obj3);
                    }
                } else {
                    if (!(viewIntent2 instanceof ViewIntent.ProductsUpdated)) {
                        throw new o();
                    }
                    this.this$0.productIds = ((ViewIntent.ProductsUpdated) viewIntent2).getProductIds();
                }
                return Unit.f71690a;
            }
            ViewIntent.SheetAction sheetAction = (ViewIntent.SheetAction) viewIntent2;
            if (sheetAction.getAction() instanceof ViewIntent.SheetAction.ActionType.Dismiss) {
                this.this$0.isCancelSheetShowing = false;
            }
            w0Var = this.this$0._singleEvent;
            ViewIntent.SheetAction.ActionType action = sheetAction.getAction();
            customTrackingInfo = this.this$0.getCustomTrackingInfo();
            SingleEvent.HandleSheetAction handleSheetAction = new SingleEvent.HandleSheetAction(action, customTrackingInfo);
            this.label = 3;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ViewIntent viewIntent, d<? super Unit> dVar) {
        return ((SelectionFormViewModel$observeViewIntent$1) create(viewIntent, dVar)).invokeSuspend(Unit.f71690a);
    }
}
