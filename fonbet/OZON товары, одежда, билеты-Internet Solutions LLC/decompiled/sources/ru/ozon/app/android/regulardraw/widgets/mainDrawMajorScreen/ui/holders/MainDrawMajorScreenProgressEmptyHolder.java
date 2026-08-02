package ru.ozon.app.android.regulardraw.widgets.mainDrawMajorScreen.ui.holders;

import android.content.Context;
import android.text.TextUtils;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatTextView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.regulardraw.R$color;
import ru.ozon.app.android.regulardraw.R$id;
import ru.ozon.app.android.regulardraw.R$style;
import ru.ozon.app.android.regulardraw.utils.UtilKt;
import ru.ozon.app.android.regulardraw.widgets.mainDrawMajorScreen.data.MainDrawMajorScreenVO;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J+\u0010\u000e\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\nH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J/\u0010\u0019\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u0018\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0011\u0010\u001b\u001a\u0004\u0018\u00010\u0010H\u0016¢\u0006\u0004\b\u001b\u0010\u001cR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001dR\u0014\u0010\u001e\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010 \u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u001fR\u0014\u0010!\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\u001fR\u0014\u0010\"\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010\u001fR\u0016\u0010$\u001a\u00020#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010'\u001a\u00020&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(¨\u0006)"}, d2 = {"Lru/ozon/app/android/regulardraw/widgets/mainDrawMajorScreen/ui/holders/MainDrawMajorScreenProgressEmptyHolder;", "", "Landroid/content/Context;", "context", "Landroid/view/ViewGroup;", "parent", "<init>", "(Landroid/content/Context;Landroid/view/ViewGroup;)V", "Lru/ozon/app/android/regulardraw/widgets/mainDrawMajorScreen/data/MainDrawMajorScreenVO$ProgressBlock;", "item", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "actionHandler", "bind", "(Lru/ozon/app/android/regulardraw/widgets/mainDrawMajorScreen/data/MainDrawMajorScreenVO$ProgressBlock;Lkotlin/jvm/functions/Function1;)V", "", "widthMeasureSpec", "heightMeasureSpec", "onMeasure", "(II)V", "left", "top", "right", "bottom", "onLayout", "(IIII)V", "getMeasuredHeight", "()Ljava/lang/Integer;", "Landroid/view/ViewGroup;", "textMinHeight", "I", "textTranslation", "textHorizontalPadding", "textVerticalPadding", "", "isVisible", "Z", "Landroidx/appcompat/widget/AppCompatTextView;", "emptyText", "Landroidx/appcompat/widget/AppCompatTextView;", "regulardraw_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class MainDrawMajorScreenProgressEmptyHolder {

    @NotNull
    private final AppCompatTextView emptyText;
    private boolean isVisible;

    @NotNull
    private final ViewGroup parent;
    private final int textHorizontalPadding;
    private final int textMinHeight;
    private final int textTranslation;
    private final int textVerticalPadding;

    public MainDrawMajorScreenProgressEmptyHolder(@NotNull Context context, @NotNull ViewGroup parent) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(parent, "parent");
        this.parent = parent;
        int px = ResourceExtKt.toPx(62, context);
        this.textMinHeight = px;
        this.textTranslation = ResourceExtKt.toPx(2, context);
        int px2 = ResourceExtKt.toPx(16, context);
        this.textHorizontalPadding = px2;
        int px3 = ResourceExtKt.toPx(10, context);
        this.textVerticalPadding = px3;
        AppCompatTextView appCompatTextView = new AppCompatTextView(context);
        appCompatTextView.setId(R$id.progressInfoText);
        appCompatTextView.setTextAppearance(context, R$style.Text_Body_Small);
        appCompatTextView.setTextColor(UtilKt.parseColor(R$color.prize_progress_text_empty_color, context));
        appCompatTextView.setEllipsize(TextUtils.TruncateAt.END);
        appCompatTextView.setGravity(17);
        appCompatTextView.setMinHeight(px);
        appCompatTextView.setPadding(px2, px3, px2, px3);
        parent.addView(appCompatTextView);
        this.emptyText = appCompatTextView;
    }

    public void bind(@NotNull MainDrawMajorScreenVO.ProgressBlock item, @NotNull Function1<? super AtomAction, Unit> actionHandler) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        boolean z11 = item instanceof MainDrawMajorScreenVO.ProgressBlock.Empty;
        this.isVisible = z11;
        this.emptyText.setVisibility(z11 ? 0 : 8);
        this.emptyText.setText(item.getCentralText());
    }

    public Integer getMeasuredHeight() {
        if (this.isVisible) {
            return Integer.valueOf(this.emptyText.getMeasuredHeight());
        }
        return null;
    }

    public void onLayout(int left, int top, int right, int bottom) {
        if (this.isVisible) {
            AppCompatTextView appCompatTextView = this.emptyText;
            int i11 = this.textTranslation;
            appCompatTextView.layout(left, top - i11, right, bottom - i11);
        }
    }

    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (this.isVisible) {
            this.emptyText.measure(widthMeasureSpec, heightMeasureSpec);
        }
    }
}
