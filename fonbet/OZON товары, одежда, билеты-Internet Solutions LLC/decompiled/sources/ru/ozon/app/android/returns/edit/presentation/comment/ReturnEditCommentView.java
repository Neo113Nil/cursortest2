package ru.ozon.app.android.returns.edit.presentation.comment;

import android.content.Context;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import fd.InterfaceC6512o;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.textArea.TextAreaView;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ5\u0010\u000f\u001a\u00020\u000e2&\u0010\r\u001a\"\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\f0\n¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0011\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0013\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0012R\u0014\u0010\u0014\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0012R\u0014\u0010\u0015\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0012R\u0017\u0010\u0017\u001a\u00020\u00168\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u001b\u001a\u00020\u00168\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0018\u001a\u0004\b\u001c\u0010\u001aR\u0017\u0010\u001e\u001a\u00020\u001d8\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!¨\u0006\""}, d2 = {"Lru/ozon/app/android/returns/edit/presentation/comment/ReturnEditCommentView;", "Landroid/widget/LinearLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lkotlin/Function4;", "", "", "action", "Landroid/text/TextWatcher;", "doOnTextChanged", "(Lfd/o;)Landroid/text/TextWatcher;", "marinHorizontal", "I", "titleMarinTop", "titleMarinBottom", "subtitleMarinVertical", "Lru/ozon/uni/android/atom/text/TextAtomV2View;", "titleTAV", "Lru/ozon/uni/android/atom/text/TextAtomV2View;", "getTitleTAV", "()Lru/ozon/uni/android/atom/text/TextAtomV2View;", "subTitleTAV", "getSubTitleTAV", "Lru/ozon/uni/android/textArea/TextAreaView;", "textAreaView", "Lru/ozon/uni/android/textArea/TextAreaView;", "getTextAreaView", "()Lru/ozon/uni/android/textArea/TextAreaView;", "details_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ReturnEditCommentView extends LinearLayout {
    public static final int $stable;
    private final int marinHorizontal;

    @NotNull
    private final TextAtomV2View subTitleTAV;
    private final int subtitleMarinVertical;

    @NotNull
    private final TextAreaView textAreaView;
    private final int titleMarinBottom;
    private final int titleMarinTop;

    @NotNull
    private final TextAtomV2View titleTAV;

    static {
        int i11 = TextAreaView.$stable;
        int i12 = TextAtomV2View.$stable;
        $stable = i11 | i12 | i12;
    }

    public /* synthetic */ ReturnEditCommentView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    @NotNull
    public final TextWatcher doOnTextChanged(@NotNull InterfaceC6512o<? super CharSequence, ? super Integer, ? super Integer, ? super Integer, Unit> action) {
        Intrinsics.checkNotNullParameter(action, "action");
        return TextAreaView.INSTANCE.doOnTextChanged(this.textAreaView, action);
    }

    @NotNull
    public final TextAtomV2View getSubTitleTAV() {
        return this.subTitleTAV;
    }

    @NotNull
    public final TextAreaView getTextAreaView() {
        return this.textAreaView;
    }

    @NotNull
    public final TextAtomV2View getTitleTAV() {
        return this.titleTAV;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReturnEditCommentView(@NotNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        int px = ResourceExtKt.toPx(16, context);
        this.marinHorizontal = px;
        int px2 = ResourceExtKt.toPx(16, context);
        this.titleMarinTop = px2;
        int px3 = ResourceExtKt.toPx(4, context);
        this.titleMarinBottom = px3;
        int px4 = ResourceExtKt.toPx(4, context);
        this.subtitleMarinVertical = px4;
        TextAtomV2View textAtomV2View = new TextAtomV2View(context, null, 0, 6, null);
        textAtomV2View.setId(View.generateViewId());
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-1, -2);
        marginLayoutParams.setMargins(px, px2, px, px3);
        textAtomV2View.setLayoutParams(marginLayoutParams);
        this.titleTAV = textAtomV2View;
        TextAtomV2View textAtomV2View2 = new TextAtomV2View(context, null, 0, 6, null);
        textAtomV2View2.setId(View.generateViewId());
        ViewGroup.MarginLayoutParams marginLayoutParams2 = new ViewGroup.MarginLayoutParams(-1, -2);
        marginLayoutParams2.setMargins(px, px4, px, px4);
        textAtomV2View2.setLayoutParams(marginLayoutParams2);
        this.subTitleTAV = textAtomV2View2;
        TextAreaView textAreaView = new TextAreaView(context, null, 0, 6, null);
        ViewGroup.MarginLayoutParams marginLayoutParams3 = new ViewGroup.MarginLayoutParams(-1, -2);
        marginLayoutParams3.setMargins(px, 0, px, ResourceExtKt.toPx(8, context));
        textAreaView.setLayoutParams(marginLayoutParams3);
        textAreaView.setHasInfoIcon(false);
        textAreaView.setHasActionIcon(true);
        this.textAreaView = textAreaView;
        View.generateViewId();
        setBackgroundColor(ThemeExtKt.themeColor(context, R$attr.layerFloor1));
        setOrientation(1);
        setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        addView(textAtomV2View);
        addView(textAtomV2View2);
        addView(textAreaView);
    }
}
