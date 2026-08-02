package com.blaze.blazesdk.first_time_slide.ui;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.blaze.blazesdk.custom_views.BlazeTextView;
import com.blaze.blazesdk.custom_views.BlazeTextWithIconButton;
import com.blaze.blazesdk.first_time_slide.models.args.a;
import com.blaze.blazesdk.style.players.IPlayerFirstTimeSlideInstructions;
import com.blaze.blazesdk.style.players.moments.BlazeMomentsPlayerFirstTimeSlideInstructionsStyle;
import com.blaze.blazesdk.style.players.stories.BlazeStoryPlayerFirstTimeSlideInstructionsStyle;
import com.blaze.blazesdk.style.shared.models.BlazeDp;
import defpackage.cd5;
import defpackage.i0m;
import defpackage.izk;
import defpackage.jxl;
import defpackage.kkm;
import defpackage.km5;
import defpackage.mqi;
import defpackage.n37;
import defpackage.r4a;
import defpackage.ypa;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.b;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001b\u0010\r\u001a\u00020\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0004\b\r\u0010\u000eR\u001b\u0010\u0014\u001a\u00020\u000f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"Lcom/blaze/blazesdk/first_time_slide/ui/FirstTimeSlideCustomView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lkotlin/Function0;", "", "action", "setOnFirstTimeSlideCtaClicked", "(Lkotlin/jvm/functions/Function0;)V", "Lkkm;", "a", "Ljoa;", "getBinding", "()Lkkm;", "binding", "blazesdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class FirstTimeSlideCustomView extends ConstraintLayout {
    public static final /* synthetic */ int d = 0;
    public final mqi a;
    public Function0 b;
    public i0m c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FirstTimeSlideCustomView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        context.getClass();
        this.a = ypa.b(new n37(28, context, this));
    }

    private final kkm getBinding() {
        return (kkm) this.a.getValue();
    }

    public final void f(a aVar) {
        List list;
        jxl jxlVar = aVar.a;
        IPlayerFirstTimeSlideInstructions instructions = jxlVar != null ? jxlVar.getInstructions() : null;
        kkm binding = getBinding();
        i0m i0mVar = new i0m();
        this.c = i0mVar;
        binding.c.setAdapter(i0mVar);
        RecyclerView recyclerView = binding.c;
        getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager(1, false));
        if (instructions instanceof BlazeStoryPlayerFirstTimeSlideInstructionsStyle) {
            BlazeStoryPlayerFirstTimeSlideInstructionsStyle blazeStoryPlayerFirstTimeSlideInstructionsStyle = (BlazeStoryPlayerFirstTimeSlideInstructionsStyle) instructions;
            list = r4a.q(CollectionsKt.w0(blazeStoryPlayerFirstTimeSlideInstructionsStyle.getCustoms(), b.j(blazeStoryPlayerFirstTimeSlideInstructionsStyle.getForward(), blazeStoryPlayerFirstTimeSlideInstructionsStyle.getPause(), blazeStoryPlayerFirstTimeSlideInstructionsStyle.getBackward(), blazeStoryPlayerFirstTimeSlideInstructionsStyle.getTransition())));
        } else if (instructions instanceof BlazeMomentsPlayerFirstTimeSlideInstructionsStyle) {
            BlazeMomentsPlayerFirstTimeSlideInstructionsStyle blazeMomentsPlayerFirstTimeSlideInstructionsStyle = (BlazeMomentsPlayerFirstTimeSlideInstructionsStyle) instructions;
            list = r4a.q(CollectionsKt.w0(blazeMomentsPlayerFirstTimeSlideInstructionsStyle.getCustoms(), b.j(blazeMomentsPlayerFirstTimeSlideInstructionsStyle.getNext(), blazeMomentsPlayerFirstTimeSlideInstructionsStyle.getPrevious(), blazeMomentsPlayerFirstTimeSlideInstructionsStyle.getPause(), blazeMomentsPlayerFirstTimeSlideInstructionsStyle.getPlay())));
        } else {
            if (instructions != null) {
                throw new RuntimeException("|" + instructions.getClass().getSimpleName() + "| is not a valid type for First Time Slide");
            }
            list = km5.a;
        }
        i0m i0mVar2 = this.c;
        if (i0mVar2 != null) {
            i0mVar2.p(list);
        }
        kkm binding2 = getBinding();
        if (jxlVar != null) {
            ConstraintLayout constraintLayout = binding2.a;
            constraintLayout.setBackgroundColor(constraintLayout.getContext().getColor(jxlVar.getBackgroundColorResId()));
            kkm binding3 = getBinding();
            BlazeTextView blazeTextView = binding3.d;
            BlazeTextView blazeTextView2 = binding3.e;
            ConstraintLayout constraintLayout2 = binding3.a;
            blazeTextView.setText(jxlVar.getMainTitle().getText());
            blazeTextView.setTextSize(jxlVar.getMainTitle().getTextSize());
            blazeTextView2.setText(jxlVar.getSubtitle().getText());
            blazeTextView2.setTextSize(jxlVar.getSubtitle().getTextSize());
            blazeTextView.setTextColor(constraintLayout2.getContext().getColor(jxlVar.getMainTitle().getTextColorResId()));
            blazeTextView2.setTextColor(constraintLayout2.getContext().getColor(jxlVar.getSubtitle().getTextColorResId()));
            BlazeTextView blazeTextView3 = binding3.d;
            blazeTextView3.getClass();
            Integer fontResId = jxlVar.getMainTitle().getFontResId();
            Typeface typeface = Typeface.DEFAULT;
            typeface.getClass();
            izk.setTypefaceFromResource$default(blazeTextView3, fontResId, null, typeface, 2, null);
            blazeTextView2.getClass();
            izk.setTypefaceFromResource$default(blazeTextView2, jxlVar.getSubtitle().getFontResId(), null, typeface, 2, null);
            kkm binding4 = getBinding();
            BlazeTextWithIconButton blazeTextWithIconButton = binding4.b;
            ConstraintLayout constraintLayout3 = binding4.a;
            ViewGroup.LayoutParams layoutParams = blazeTextWithIconButton.getLayoutParams();
            BlazeDp width = jxlVar.getCta().getWidth();
            layoutParams.width = width != null ? width.getToPx$blazesdk_release() : 0;
            layoutParams.height = jxlVar.getCta().getHeight().getToPx$blazesdk_release();
            blazeTextWithIconButton.setText(jxlVar.getCta().getTitle());
            blazeTextWithIconButton.setTextSize(jxlVar.getCta().getTextSize());
            blazeTextWithIconButton.setCardBackgroundColor(constraintLayout3.getContext().getColor(jxlVar.getCta().getBackgroundColor()));
            blazeTextWithIconButton.setTextColor(constraintLayout3.getContext().getColor(jxlVar.getCta().getTextColorResId()));
            blazeTextWithIconButton.setRadius(jxlVar.getCta().getCornerRadius().getToPx$blazesdk_release());
            BlazeTextWithIconButton.setTypefaceFromResource$default(binding4.b, jxlVar.getCta().getFontResId(), null, null, 6, null);
            blazeTextWithIconButton.setOnClickListener(new cd5(this, 9));
        }
    }

    public final void setOnFirstTimeSlideCtaClicked(@NotNull Function0<Unit> action) {
        action.getClass();
        this.b = action;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FirstTimeSlideCustomView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        context.getClass();
    }

    public /* synthetic */ FirstTimeSlideCustomView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FirstTimeSlideCustomView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        context.getClass();
    }
}
