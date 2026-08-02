package ru.ozon.app.android.fresh.main.widgets.addressCommunication.presentation;

import Sc.s;
import Wc.a;
import android.widget.PopupWindow;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.P;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.fresh.main.widgets.addressCommunication.presentation.AddressCommunicationViewHolderFF;
import xe.M;
import xe.Y;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.fresh.main.widgets.addressCommunication.presentation.AddressCommunicationViewHolderFF$showPopup$1", f = "AddressCommunicationViewHolderFF.kt", l = {228}, m = "invokeSuspend")
/* loaded from: classes12.dex */
final class AddressCommunicationViewHolderFF$showPopup$1 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ int $pendingItemHash;
    int label;
    final /* synthetic */ AddressCommunicationViewHolderFF this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AddressCommunicationViewHolderFF$showPopup$1(int i11, AddressCommunicationViewHolderFF addressCommunicationViewHolderFF, d<? super AddressCommunicationViewHolderFF$showPopup$1> dVar) {
        super(2, dVar);
        this.$pendingItemHash = i11;
        this.this$0 = addressCommunicationViewHolderFF;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new AddressCommunicationViewHolderFF$showPopup$1(this.$pendingItemHash, this.this$0, dVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x004b, code lost:
    
        if (r6 == false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00bb, code lost:
    
        if (r6 != false) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00c5, code lost:
    
        r1 = r5.this$0.popup;
     */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        boolean keepOnScroll;
        AddressCommunicationViewModel viewModel;
        AddressCommunicationViewHolderFF.PopupState popupState;
        PopupWindow popupWindow;
        PopupWindow popupWindow2;
        ConstraintLayout appHeader;
        PopupWindow popupWindow3;
        boolean keepOnScroll2;
        P<Boolean> shouldShow;
        boolean z11;
        boolean z12;
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 == 0) {
            s.b(obj);
            this.label = 1;
            if (Y.b(200L, this) == aVar) {
                return aVar;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
        }
        AddressCommunicationVO boundData = this.this$0.getBoundData();
        if (boundData == null || this.$pendingItemHash != boundData.hashCode()) {
            this.this$0.popupState = AddressCommunicationViewHolderFF.PopupState.Hidden.INSTANCE;
            return Unit.f71690a;
        }
        keepOnScroll = this.this$0.getKeepOnScroll();
        if (!keepOnScroll) {
            z11 = this.this$0.isWidgetVisible;
            if (z11) {
                z12 = this.this$0.isAppBarAtTop;
            }
            this.this$0.popupState = AddressCommunicationViewHolderFF.PopupState.Hidden.INSTANCE;
            return Unit.f71690a;
        }
        viewModel = this.this$0.viewModel();
        if (!((viewModel == null || (shouldShow = viewModel.getShouldShow()) == null) ? false : Intrinsics.d(shouldShow.getValue(), Boolean.TRUE))) {
            this.this$0.popupState = AddressCommunicationViewHolderFF.PopupState.Hidden.INSTANCE;
            return Unit.f71690a;
        }
        popupState = this.this$0.popupState;
        if (!(popupState instanceof AddressCommunicationViewHolderFF.PopupState.Pending)) {
            return Unit.f71690a;
        }
        popupWindow = this.this$0.popup;
        if (popupWindow != null && popupWindow.isShowing()) {
            return Unit.f71690a;
        }
        popupWindow2 = this.this$0.popup;
        if (popupWindow2 == null) {
            this.this$0.createPopUp();
        }
        if (!this.this$0.isInVisibleBounds()) {
            keepOnScroll2 = this.this$0.getKeepOnScroll();
        }
        appHeader = this.this$0.getAppHeader();
        if (appHeader != null && popupWindow3 != null) {
            popupWindow3.showAsDropDown(appHeader, -((int) appHeader.getX()), 0, 0);
        }
        this.this$0.popupState = AddressCommunicationViewHolderFF.PopupState.Visible.INSTANCE;
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((AddressCommunicationViewHolderFF$showPopup$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
