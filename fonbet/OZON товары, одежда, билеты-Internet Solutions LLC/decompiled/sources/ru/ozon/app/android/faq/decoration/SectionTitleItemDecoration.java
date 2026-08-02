package ru.ozon.app.android.faq.decoration;

import Sc.o;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import m10.l;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.delivery.common.AppTokensProvider;
import ru.ozon.app.android.faq.data.model.FaqVO$TopicVO$TopicItemVO;
import ru.ozon.app.android.faq.databinding.TitleDecoratorBinding;
import ru.ozon.app.android.faq.decoration.FaqDimens;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.atoms.utils.OzonSpannableString;

@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\"B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J/\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J'\u0010\u001b\u001a\u00020\u00162\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ%\u0010\u001e\u001a\u00020\u00162\u0006\u0010\u001d\u001a\u00020\u00192\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u001e\u0010\u001cR\u0014\u0010 \u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!¨\u0006#"}, d2 = {"Lru/ozon/app/android/faq/decoration/SectionTitleItemDecoration;", "Landroidx/recyclerview/widget/RecyclerView$n;", "Lru/ozon/app/android/faq/decoration/FaqDimens;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroidx/recyclerview/widget/RecyclerView;", "parent", "Landroid/view/View;", "child", "", "getBottomOffset", "(Landroidx/recyclerview/widget/RecyclerView;Landroid/view/View;)I", "Lru/ozon/app/android/faq/decoration/SectionTitleItemDecoration$Validity;", "validateChild", "(Landroidx/recyclerview/widget/RecyclerView;Landroid/view/View;)Lru/ozon/app/android/faq/decoration/SectionTitleItemDecoration$Validity;", "Landroid/graphics/Rect;", "outRect", "view", "Landroidx/recyclerview/widget/RecyclerView$A;", "state", "", "getItemOffsets", "(Landroid/graphics/Rect;Landroid/view/View;Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/RecyclerView$A;)V", "Landroid/graphics/Canvas;", "c", "onDraw", "(Landroid/graphics/Canvas;Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/RecyclerView$A;)V", "canvas", "drawTitle", "Lru/ozon/app/android/faq/databinding/TitleDecoratorBinding;", "binding", "Lru/ozon/app/android/faq/databinding/TitleDecoratorBinding;", "Validity", "faq_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class SectionTitleItemDecoration extends RecyclerView.n implements FaqDimens {

    @NotNull
    private final TitleDecoratorBinding binding;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\br\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/faq/decoration/SectionTitleItemDecoration$Validity;", "", "Invalid", "Valid", "Lru/ozon/app/android/faq/decoration/SectionTitleItemDecoration$Validity$Invalid;", "Lru/ozon/app/android/faq/decoration/SectionTitleItemDecoration$Validity$Valid;", "faq_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private interface Validity {

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/ozon/app/android/faq/decoration/SectionTitleItemDecoration$Validity$Invalid;", "Lru/ozon/app/android/faq/decoration/SectionTitleItemDecoration$Validity;", "<init>", "()V", "faq_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Invalid implements Validity {

            @NotNull
            public static final Invalid INSTANCE = new Invalid();

            private Invalid() {
            }
        }

        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lru/ozon/app/android/faq/decoration/SectionTitleItemDecoration$Validity$Valid;", "Lru/ozon/app/android/faq/decoration/SectionTitleItemDecoration$Validity;", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/utils/OzonSpannableString;", "<init>", "(Lru/ozon/uni/atoms/utils/OzonSpannableString;)V", "getTitle", "()Lru/ozon/uni/atoms/utils/OzonSpannableString;", "faq_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Valid implements Validity {

            @NotNull
            private final OzonSpannableString title;

            public Valid(@NotNull OzonSpannableString title) {
                Intrinsics.checkNotNullParameter(title, "title");
                this.title = title;
            }

            @NotNull
            public final OzonSpannableString getTitle() {
                return this.title;
            }
        }
    }

    public SectionTitleItemDecoration(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        TitleDecoratorBinding inflate = TitleDecoratorBinding.inflate(LayoutInflater.from(context), null, false);
        this.binding = inflate;
        Integer parseColor = StyleParser.INSTANCE.parseColor(context, AppTokensProvider.Colors.INSTANCE.backgroundPageColor(context).getToken());
        if (parseColor != null) {
            inflate.getConstraintLayout().setBackgroundColor(parseColor.intValue());
        }
    }

    private final int getBottomOffset(RecyclerView parent, View child) {
        Validity validateChild = validateChild(parent, child);
        if (validateChild instanceof Validity.Valid) {
            return getDp40();
        }
        if (validateChild instanceof Validity.Invalid) {
            return 0;
        }
        throw new o();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final Validity validateChild(RecyclerView parent, View child) {
        OzonSpannableString topicTitle;
        RecyclerView.g adapter = parent.getAdapter();
        if (adapter == 0) {
            return Validity.Invalid.INSTANCE;
        }
        int childAdapterPosition = parent.getChildAdapterPosition(child);
        if (childAdapterPosition < 0 || childAdapterPosition > adapter.getShimmersCount() - 1) {
            return Validity.Invalid.INSTANCE;
        }
        if (!(adapter instanceof l)) {
            return Validity.Invalid.INSTANCE;
        }
        boolean a11 = ((l) adapter).a(childAdapterPosition);
        l lVar = adapter;
        if (!a11) {
            lVar = null;
        }
        c b11 = lVar != null ? lVar.b(childAdapterPosition) : null;
        if ((b11 instanceof FaqVO$TopicVO$TopicItemVO) && (topicTitle = ((FaqVO$TopicVO$TopicItemVO) b11).getTopicTitle()) != null) {
            return new Validity.Valid(topicTitle);
        }
        return Validity.Invalid.INSTANCE;
    }

    public final void drawTitle(@NotNull Canvas canvas, @NotNull RecyclerView parent, @NotNull RecyclerView.A state) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(state, "state");
        int childCount = parent.getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = parent.getChildAt(i11);
            ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
            Intrinsics.g(layoutParams, "null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView.LayoutParams");
            if (((RecyclerView.p) layoutParams).a() > -1) {
                Validity validateChild = validateChild(parent, childAt);
                if (validateChild instanceof Validity.Valid) {
                    OzonSpannableString title = ((Validity.Valid) validateChild).getTitle();
                    if (title.length() > 0) {
                        this.binding.titleTv.setText(title);
                        this.binding.getConstraintLayout().measure(View.MeasureSpec.makeMeasureSpec(parent.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
                        this.binding.getConstraintLayout().layout(0, 0, this.binding.getConstraintLayout().getMeasuredWidth(), this.binding.getConstraintLayout().getMeasuredHeight());
                        canvas.save();
                        canvas.translate(0.0f, (childAt.getTop() - ((ViewGroup.MarginLayoutParams) r3).topMargin) - getDp40());
                        this.binding.getConstraintLayout().draw(canvas);
                        canvas.restore();
                    }
                }
            }
        }
    }

    public int getDp40() {
        return FaqDimens.DefaultImpls.getDp40(this);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public void getItemOffsets(@NotNull Rect outRect, @NotNull View view, @NotNull RecyclerView parent, @NotNull RecyclerView.A state) {
        Intrinsics.checkNotNullParameter(outRect, "outRect");
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(state, "state");
        outRect.top = getBottomOffset(parent, view);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public void onDraw(@NotNull Canvas c11, @NotNull RecyclerView parent, @NotNull RecyclerView.A state) {
        Intrinsics.checkNotNullParameter(c11, "c");
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(state, "state");
        super.onDrawOver(c11, parent, state);
        drawTitle(c11, parent, state);
    }
}
