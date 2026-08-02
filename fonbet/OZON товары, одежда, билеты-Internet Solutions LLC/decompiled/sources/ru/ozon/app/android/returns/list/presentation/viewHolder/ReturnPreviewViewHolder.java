package ru.ozon.app.android.returns.list.presentation.viewHolder;

import android.view.View;
import androidx.lifecycle.J;
import fd.InterfaceC6512o;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.C7735q;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.returns.common.presentation.viewHolderDelegate.ReturnStatusViewHolderDelegate;
import ru.ozon.app.android.returns.common.presentation.viewHolderDelegate.total.ReturnTotalViewHolderDelegate;
import ru.ozon.app.android.returns.common.presentation.views.ReturnPreviewView;
import ru.ozon.app.android.returns.list.presentation.viewHolder.delegate.ReturnHeaderViewHolderDelegate;
import ru.ozon.app.android.returns.list.presentation.viewObject.ReturnPreviewVO;
import ru.ozon.app.android.returns.list.presentation.views.ReturnTotalView;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.v3.holders.controls.buttonV3.ButtonV3HolderKt;
import ru.ozon.uni.core.UniColors;

@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001BO\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u00126\u0010\u000f\u001a2\u0012\u0004\u0012\u00020\b\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\f\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\u0019\u0010\u0014\u001a\u00020\u000b2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u001b\u001a\u00020\u000b2\u0006\u0010\u0018\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u0019H\u0014¢\u0006\u0004\b\u001b\u0010\u001cR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u001dR\u0014\u0010\u001f\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010\"\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010$\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R \u0010&\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'¨\u0006("}, d2 = {"Lru/ozon/app/android/returns/list/presentation/viewHolder/ReturnPreviewViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/returns/list/presentation/viewObject/ReturnPreviewVO;", "Lru/ozon/app/android/returns/common/presentation/views/ReturnPreviewView;", "previewView", "Lru/ozon/app/android/composer/ComposerReferences;", "composerReferences", "Lkotlin/Function4;", "Lru/ozon/app/android/returns/list/presentation/views/ReturnTotalView;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "Lkotlin/Function0;", "Landroidx/lifecycle/J;", "Lru/ozon/app/android/returns/common/presentation/viewHolderDelegate/total/ReturnTotalViewHolderDelegate;", "totalDelegateProvider", "<init>", "(Lru/ozon/app/android/returns/common/presentation/views/ReturnPreviewView;Lru/ozon/app/android/composer/ComposerReferences;Lfd/o;)V", "", "backgroundColor", "setBackgroundColor", "(Ljava/lang/String;)V", "onClick", "()V", "item", "Ll20/d;", "info", "bind", "(Lru/ozon/app/android/returns/list/presentation/viewObject/ReturnPreviewVO;Ll20/d;)V", "Lru/ozon/app/android/returns/common/presentation/views/ReturnPreviewView;", "Lru/ozon/app/android/returns/common/presentation/viewHolderDelegate/ReturnStatusViewHolderDelegate;", "statusDelegate", "Lru/ozon/app/android/returns/common/presentation/viewHolderDelegate/ReturnStatusViewHolderDelegate;", "Lru/ozon/app/android/returns/list/presentation/viewHolder/delegate/ReturnHeaderViewHolderDelegate;", "headerDelegate", "Lru/ozon/app/android/returns/list/presentation/viewHolder/delegate/ReturnHeaderViewHolderDelegate;", "totalDelegate", "Lru/ozon/app/android/returns/common/presentation/viewHolderDelegate/total/ReturnTotalViewHolderDelegate;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "details_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ReturnPreviewViewHolder extends k<ReturnPreviewVO> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final ReturnHeaderViewHolderDelegate headerDelegate;

    @NotNull
    private final ReturnPreviewView previewView;

    @NotNull
    private final ReturnStatusViewHolderDelegate statusDelegate;

    @NotNull
    private final ReturnTotalViewHolderDelegate totalDelegate;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.returns.list.presentation.viewHolder.ReturnPreviewViewHolder$1, reason: invalid class name */
    /* synthetic */ class AnonymousClass1 extends C7735q implements Function0<Unit> {
        AnonymousClass1(Object obj) {
            super(0, obj, ReturnPreviewViewHolder.class, "onClick", "onClick()V", 0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            ((ReturnPreviewViewHolder) this.receiver).onClick();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.returns.list.presentation.viewHolder.ReturnPreviewViewHolder$2, reason: invalid class name */
    static final class AnonymousClass2 extends AbstractC7737t implements Function1<View, Unit> {
        AnonymousClass2() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(View view) {
            invoke2(view);
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(View it) {
            Intrinsics.checkNotNullParameter(it, "it");
            ReturnPreviewViewHolder.this.onClick();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.returns.list.presentation.viewHolder.ReturnPreviewViewHolder$3, reason: invalid class name */
    static final class AnonymousClass3 extends AbstractC7737t implements Function1<View, Unit> {
        AnonymousClass3() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(View view) {
            invoke2(view);
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(View it) {
            Intrinsics.checkNotNullParameter(it, "it");
            ReturnPreviewViewHolder.this.onClick();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReturnPreviewViewHolder(@NotNull ReturnPreviewView previewView, @NotNull ComposerReferences composerReferences, @NotNull InterfaceC6512o<? super ReturnTotalView, ? super Function1<? super AtomAction, Unit>, ? super Function0<Unit>, ? super J, ReturnTotalViewHolderDelegate> totalDelegateProvider) {
        super(previewView);
        Intrinsics.checkNotNullParameter(previewView, "previewView");
        Intrinsics.checkNotNullParameter(composerReferences, "composerReferences");
        Intrinsics.checkNotNullParameter(totalDelegateProvider, "totalDelegateProvider");
        this.previewView = previewView;
        Function1<AtomAction, Unit> buildHandler = new ActionHandler.Builder(composerReferences, this).buildHandler();
        this.actionHandler = buildHandler;
        this.statusDelegate = new ReturnStatusViewHolderDelegate(previewView.getStatus(), buildHandler);
        this.headerDelegate = new ReturnHeaderViewHolderDelegate(previewView.getHeader());
        this.totalDelegate = totalDelegateProvider.invoke(previewView.getTotal(), buildHandler, new AnonymousClass1(this), this);
        ViewExtKt.setOnClickListenerThrottle$default(previewView, 0L, new AnonymousClass2(), 1, null);
        ViewExtKt.setOnClickListenerThrottle$default(previewView.getStatus().getDescriptionTextAtomView(), 0L, new AnonymousClass3(), 1, null);
        ReturnTotalView total = previewView.getTotal();
        ViewExtKt.setOnClickListenerThrottle$default(total.getTotalTableRecyclerView(), 0L, new ReturnPreviewViewHolder$4$1(this), 1, null);
        ViewExtKt.setOnClickListenerThrottle$default(total.getPhotosRecyclerView(), 0L, new ReturnPreviewViewHolder$4$2(this), 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onClick() {
        AtomAction action;
        ReturnPreviewVO boundData = getBoundData();
        if (boundData == null || (action = boundData.getAction()) == null) {
            return;
        }
        this.actionHandler.invoke(action);
    }

    private final void setBackgroundColor(String backgroundColor) {
        this.previewView.setBackgroundColor(StyleParser.INSTANCE.parseColor(getContext(), backgroundColor, UniColors.LAYER_FLOOR_1.getResId()));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull ReturnPreviewVO item, @NotNull d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        setBackgroundColor(item.getBackgroundColor());
        this.statusDelegate.bind(item.getStatus());
        this.headerDelegate.bind$details_prodGoogleAllVendorsRelease(item.getHeader());
        this.totalDelegate.bind(item.getTotal());
        ButtonV3HolderKt.bindOrGone(this.previewView.getButton(), item.getButton(), this.actionHandler);
    }
}
