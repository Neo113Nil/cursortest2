package ru.ozon.app.android.pdp.widgets.aspectsV4.size.presentation;

import Z40.a;
import android.annotation.SuppressLint;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pdp.R$id;
import ru.ozon.app.android.pdp.widgets.aspectsV4.size.presentation.AspectsV4SizeVO;
import ru.ozon.uni.android.atom.aspect.AspectView;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.atoms.data.aspect.AspectDTO;
import ru.ozon.uni.atoms.v3.holders.apsect.AspectHolderKt;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b!\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u001e\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00132\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fH\u0016R\u0014\u0010\u0006\u001a\u00020\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u000bX\u0084\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000fX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/pdp/widgets/aspectsV4/size/presentation/AspectsV4SizeBaseViewWrapper;", "Lru/ozon/app/android/pdp/widgets/aspectsV4/size/presentation/AspectsV4SizeViewItem;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "root", "Lru/ozon/uni/android/atom/aspect/AspectView;", "getRoot", "()Lru/ozon/uni/android/atom/aspect/AspectView;", "titleView", "Lru/ozon/uni/android/atom/text/TextAtomV2View;", "getTitleView", "()Lru/ozon/uni/android/atom/text/TextAtomV2View;", "onClick", "Lkotlin/Function0;", "", "bind", "item", "Lru/ozon/app/android/pdp/widgets/aspectsV4/size/presentation/AspectsV4SizeVO$Size;", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SuppressLint({"ClickableViewAccessibility"})
/* loaded from: classes13.dex */
public abstract class AspectsV4SizeBaseViewWrapper implements AspectsV4SizeViewItem {
    private Function0<Unit> onClick;

    @NotNull
    private final AspectView root;

    @NotNull
    private final TextAtomV2View titleView;

    public AspectsV4SizeBaseViewWrapper(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        AspectView aspectView = new AspectView(context, null, 0, 6, null);
        aspectView.setId(R$id.aspectSizeContainer);
        this.root = aspectView;
        TextAtomV2View textAtomV2View = new TextAtomV2View(context, null, 0, 6, null);
        textAtomV2View.setId(R$id.aspectSizeText);
        textAtomV2View.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        this.titleView = textAtomV2View;
        getRoot().setOnTouchListener(new a(this, 1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean _init_$lambda$2(AspectsV4SizeBaseViewWrapper aspectsV4SizeBaseViewWrapper, View view, MotionEvent motionEvent) {
        Function0<Unit> function0;
        if (motionEvent.getAction() != 1 || (function0 = aspectsV4SizeBaseViewWrapper.onClick) == null) {
            return false;
        }
        function0.invoke();
        return false;
    }

    @Override // ru.ozon.app.android.pdp.widgets.aspectsV4.size.presentation.AspectsV4SizeViewItem
    public void bind(@NotNull AspectsV4SizeVO.Size item, @NotNull Function0<Unit> onClick) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        this.onClick = onClick;
        AspectHolderKt.bind$default(getRoot(), item.getAspect(), null, 2, null);
        getRoot().setSelected(item.getAspect().getState() == AspectDTO.AspectState.SELECTED);
        TextHolderKt.bind$default(this.titleView, item.getText(), null, 2, null);
    }

    @NotNull
    protected final TextAtomV2View getTitleView() {
        return this.titleView;
    }

    @Override // ru.ozon.app.android.pdp.widgets.aspectsV4.size.presentation.AspectsV4SizeViewItem
    @NotNull
    public AspectView getRoot() {
        return this.root;
    }
}
