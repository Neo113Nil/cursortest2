package ru.ozon.android.composerCommonViewKit.emptyState.v2.presentation;

import Sc.InterfaceC4008j;
import Sc.k;
import Sc.n;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.K;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import l10.v;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.composerCommonViewKit.emptyState.v2.EmptyStateV2AtomDecorator;
import ru.ozon.uni.R$color;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.af.AtomsAdapter;
import ru.ozon.uni.atoms.af.layout.VerticalAtomsLayout;
import ru.ozon.uni.atoms.data.AtomDTO;

@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0004\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0019\u0010\u000e\u001a\u00020\u00062\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0014R\"\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0015R\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001a\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001d\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u001b\u0010$\u001a\u00020\u001f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#¨\u0006%"}, d2 = {"Lru/ozon/android/composerCommonViewKit/emptyState/v2/presentation/EmptyStateV2ButtonsVerticalViewDelegate;", "", "Landroid/view/View;", "view", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "actionHandler", "Ll10/v;", "viewModelOwnerProvider", "<init>", "(Landroid/view/View;Lkotlin/jvm/functions/Function1;Ll10/v;)V", "", "backgroundColor", "bindBackground", "(Ljava/lang/String;)V", "Lru/ozon/android/composerCommonViewKit/emptyState/v2/presentation/EmptyStateV2ButtonsVO;", "item", "bind", "(Lru/ozon/android/composerCommonViewKit/emptyState/v2/presentation/EmptyStateV2ButtonsVO;)V", "Landroid/view/View;", "Lkotlin/jvm/functions/Function1;", "", "dp16", "I", "Lru/ozon/uni/atoms/af/AtomsAdapter;", "verticalItemsAdapter", "Lru/ozon/uni/atoms/af/AtomsAdapter;", "Lru/ozon/android/composerCommonViewKit/emptyState/v2/presentation/EmptyStateV2ButtonsTimerSupport;", "timerSupport", "Lru/ozon/android/composerCommonViewKit/emptyState/v2/presentation/EmptyStateV2ButtonsTimerSupport;", "Lru/ozon/uni/atoms/af/layout/VerticalAtomsLayout;", "buttonsVAL$delegate", "LSc/j;", "getButtonsVAL", "()Lru/ozon/uni/atoms/af/layout/VerticalAtomsLayout;", "buttonsVAL", "common-view-kit_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class EmptyStateV2ButtonsVerticalViewDelegate {
    private final Function1<AtomAction, Unit> actionHandler;

    /* renamed from: buttonsVAL$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j buttonsVAL;
    private final int dp16;

    @NotNull
    private final EmptyStateV2ButtonsTimerSupport timerSupport;

    @NotNull
    private final AtomsAdapter verticalItemsAdapter;

    @NotNull
    private final View view;

    /* JADX WARN: Multi-variable type inference failed */
    public EmptyStateV2ButtonsVerticalViewDelegate(@NotNull View view, Function1<? super AtomAction, Unit> function1, @NotNull v viewModelOwnerProvider) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(viewModelOwnerProvider, "viewModelOwnerProvider");
        this.view = view;
        this.actionHandler = function1;
        this.dp16 = UiExtKt.toPx(16);
        this.verticalItemsAdapter = new AtomsAdapter(null, null, null, null, 15, null);
        this.timerSupport = new EmptyStateV2ButtonsTimerSupport(view, viewModelOwnerProvider, new EmptyStateV2ButtonsVerticalViewDelegate$timerSupport$1(this));
        this.buttonsVAL = k.a(n.NONE, new EmptyStateV2ButtonsVerticalViewDelegate$buttonsVAL$2(this));
        ViewGroup viewGroup = view instanceof ViewGroup ? (ViewGroup) view : null;
        if (viewGroup != null) {
            viewGroup.addView(getButtonsVAL());
        }
        VerticalAtomsLayout buttonsVAL = getButtonsVAL();
        Context context = view.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        buttonsVAL.setDecorator(new EmptyStateV2AtomDecorator(context));
    }

    private final void bindBackground(String backgroundColor) {
        View view = this.view;
        StyleParser styleParser = StyleParser.INSTANCE;
        Context context = view.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        view.setBackgroundColor(styleParser.parseColor(context, backgroundColor, R$color.transparent));
    }

    private final VerticalAtomsLayout getButtonsVAL() {
        return (VerticalAtomsLayout) this.buttonsVAL.getValue();
    }

    public final void bind(@NotNull EmptyStateV2ButtonsVO item) {
        Intrinsics.checkNotNullParameter(item, "item");
        this.verticalItemsAdapter.setOnAction(new EmptyStateV2ButtonsVerticalViewDelegate$bind$1(this));
        EmptyStateV2ButtonsTimerSupport emptyStateV2ButtonsTimerSupport = this.timerSupport;
        List<AtomDTO> buttons = item.getButtons();
        if (buttons == null) {
            buttons = K.f71697a;
        }
        emptyStateV2ButtonsTimerSupport.bind(buttons);
        bindBackground(item.getBackgroundColor());
    }
}
