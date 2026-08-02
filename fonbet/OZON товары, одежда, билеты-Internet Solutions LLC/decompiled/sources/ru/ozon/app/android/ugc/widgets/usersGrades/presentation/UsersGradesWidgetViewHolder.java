package ru.ozon.app.android.ugc.widgets.usersGrades.presentation;

import android.R;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.view.View;
import android.widget.ProgressBar;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.d;
import androidx.core.content.res.g;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import gk0.q;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.R$drawable;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.app.android.ugc.widgets.usersGrades.presentation.UsersGradesVO;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.R$color;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikit.extensions.ConstraintSetExtKt;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.atoms.data.text.TextDTO;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;

@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010!\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u000f\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0013\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J)\u0010\u0018\u001a\u00020\t2\u0006\u0010\u0015\u001a\u00020\u00112\b\u0010\u0017\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u001f\u0010\u001d\u001a\u00020\t2\u0006\u0010\u001a\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u001bH\u0014¢\u0006\u0004\b\u001d\u0010\u001eR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u001fR\u0014\u0010 \u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010\"\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010!R\u0014\u0010#\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010!R\u0018\u0010$\u001a\u0004\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010%R\u0018\u0010&\u001a\u0004\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010%R\u001a\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00110'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u001a\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00110'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010)R\u0014\u0010,\u001a\u00020+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0014\u0010.\u001a\u00020+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010-¨\u0006/"}, d2 = {"Lru/ozon/app/android/ugc/widgets/usersGrades/presentation/UsersGradesWidgetViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/ugc/widgets/usersGrades/presentation/UsersGradesVO;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "containerView", "<init>", "(Landroidx/constraintlayout/widget/ConstraintLayout;)V", "Lru/ozon/uni/atoms/data/text/TextDTO;", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "addHeader", "(Lru/ozon/uni/atoms/data/text/TextDTO;)V", SelectionItemFormDTO.TITLE_FIELD_NAME, "", "isFirstTitle", "addTitle", "(Lru/ozon/uni/atoms/data/text/TextDTO;Z)V", "", "index", "addValue", "(Lru/ozon/uni/atoms/data/text/TextDTO;I)V", "fillPercent", "", "fillLineColor", "addIndicator", "(ILjava/lang/String;I)V", "item", "Ll20/d;", "info", "bind", "(Lru/ozon/app/android/ugc/widgets/usersGrades/presentation/UsersGradesVO;Ll20/d;)V", "Landroidx/constraintlayout/widget/ConstraintLayout;", "progressBarHorizontalMargin", "I", "progressBarHeight", "topMargin", "headerId", "Ljava/lang/Integer;", "previousTitleId", "", "rightBarrierIds", "Ljava/util/List;", "leftBarrierIds", "Landroidx/constraintlayout/widget/Barrier;", "rightBarrier", "Landroidx/constraintlayout/widget/Barrier;", "leftBarrier", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class UsersGradesWidgetViewHolder extends k<UsersGradesVO> {

    @NotNull
    private final ConstraintLayout containerView;
    private Integer headerId;

    @NotNull
    private final Barrier leftBarrier;

    @NotNull
    private final List<Integer> leftBarrierIds;
    private Integer previousTitleId;
    private final int progressBarHeight;
    private final int progressBarHorizontalMargin;

    @NotNull
    private final Barrier rightBarrier;

    @NotNull
    private final List<Integer> rightBarrierIds;
    private final int topMargin;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UsersGradesWidgetViewHolder(@NotNull ConstraintLayout containerView) {
        super(containerView);
        Intrinsics.checkNotNullParameter(containerView, "containerView");
        this.containerView = containerView;
        this.progressBarHorizontalMargin = ResourceExtKt.toPx(16, getContext());
        this.progressBarHeight = ResourceExtKt.toPx(6, getContext());
        this.topMargin = ResourceExtKt.toPx(8, getContext());
        this.rightBarrierIds = new ArrayList();
        this.leftBarrierIds = new ArrayList();
        Barrier barrier = new Barrier(getContext());
        barrier.f(5);
        barrier.setId(View.generateViewId());
        this.rightBarrier = barrier;
        Barrier barrier2 = new Barrier(getContext());
        barrier2.f(6);
        barrier2.setId(View.generateViewId());
        this.leftBarrier = barrier2;
    }

    private final void addHeader(TextDTO value) {
        TextAtomV2View textAtomV2View = (TextAtomV2View) q.f64554a.g(N.b(TextAtomV2View.class), getContext());
        TextHolderKt.bindOrGone$default(textAtomV2View, value, null, 2, null);
        textAtomV2View.setId(View.generateViewId());
        this.containerView.addView(textAtomV2View);
        d dVar = new d();
        dVar.p(this.containerView);
        ConstraintSetExtKt.startToStart$default(dVar, textAtomV2View.getId(), 0, 0, 4, null);
        ConstraintSetExtKt.topToTop$default(dVar, textAtomV2View.getId(), 0, 0, 4, null);
        dVar.f(this.containerView);
        this.headerId = Integer.valueOf(textAtomV2View.getId());
    }

    private final void addIndicator(int fillPercent, String fillLineColor, int index) {
        Integer num = (Integer) C7714v.Q(index, this.leftBarrierIds);
        if (num != null) {
            int intValue = num.intValue();
            ProgressBar progressBar = new ProgressBar(getContext(), null, R.attr.progressBarStyleHorizontal);
            progressBar.setLayoutParams(new ConstraintLayout.b(0, this.progressBarHeight));
            progressBar.setIndeterminate(false);
            progressBar.setMax(100);
            progressBar.setProgressDrawable(g.d(progressBar.getResources(), R$drawable.answers_progress, progressBar.getContext().getTheme()));
            progressBar.setId(View.generateViewId());
            progressBar.setProgress(fillPercent);
            StyleParser styleParser = StyleParser.INSTANCE;
            Context context = progressBar.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            int parseColor = styleParser.parseColor(context, fillLineColor, R$color.graphic_rating);
            Drawable progressDrawable = progressBar.getProgressDrawable();
            Intrinsics.g(progressDrawable, "null cannot be cast to non-null type android.graphics.drawable.LayerDrawable");
            ((LayerDrawable) progressDrawable).findDrawableByLayerId(R.id.progress).setColorFilter(parseColor, PorterDuff.Mode.SRC_IN);
            this.containerView.addView(progressBar);
            d dVar = new d();
            dVar.p(this.containerView);
            ConstraintSetExtKt.startToEnd(dVar, progressBar.getId(), this.leftBarrier.getId(), this.progressBarHorizontalMargin);
            ConstraintSetExtKt.endToStart(dVar, progressBar.getId(), this.rightBarrier.getId(), this.progressBarHorizontalMargin);
            ConstraintSetExtKt.topToTop$default(dVar, progressBar.getId(), intValue, 0, 4, null);
            ConstraintSetExtKt.bottomToBottom$default(dVar, progressBar.getId(), intValue, 0, 4, null);
            dVar.f(this.containerView);
        }
    }

    private final void addTitle(TextDTO title, boolean isFirstTitle) {
        TextAtomV2View textAtomV2View = (TextAtomV2View) q.f64554a.g(N.b(TextAtomV2View.class), getContext());
        textAtomV2View.setId(View.generateViewId());
        this.leftBarrierIds.add(Integer.valueOf(textAtomV2View.getId()));
        TextHolderKt.bind$default(textAtomV2View, title, null, 2, null);
        this.containerView.addView(textAtomV2View);
        d dVar = new d();
        dVar.p(this.containerView);
        ConstraintSetExtKt.startToStart$default(dVar, textAtomV2View.getId(), 0, 0, 4, null);
        int id2 = textAtomV2View.getId();
        Integer num = this.previousTitleId;
        dVar.t(id2, 3, (num == null && (num = this.headerId) == null) ? 0 : num.intValue(), (this.previousTitleId == null && this.headerId == null) ? 3 : 4, isFirstTitle ? 0 : this.topMargin);
        if (this.headerId != null && isFirstTitle) {
            int id3 = textAtomV2View.getId();
            Context context = textAtomV2View.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            dVar.e0(id3, 3, ResourceExtKt.toPx(12, context));
        }
        dVar.Z(textAtomV2View.getId(), 3, 0);
        dVar.f(this.containerView);
        this.previousTitleId = Integer.valueOf(textAtomV2View.getId());
    }

    private final void addValue(TextDTO value, int index) {
        new d();
        Integer num = (Integer) C7714v.Q(index, this.leftBarrierIds);
        if (num != null) {
            int intValue = num.intValue();
            TextAtomV2View textAtomV2View = (TextAtomV2View) q.f64554a.g(N.b(TextAtomV2View.class), getContext());
            textAtomV2View.setId(View.generateViewId());
            TextHolderKt.bind$default(textAtomV2View, value, null, 2, null);
            this.containerView.addView(textAtomV2View);
            d dVar = new d();
            dVar.p(this.containerView);
            ConstraintSetExtKt.endToEnd$default(dVar, textAtomV2View.getId(), 0, 0, 4, null);
            ConstraintSetExtKt.baselineToBaseline$default(dVar, textAtomV2View.getId(), intValue, 0, 4, null);
            dVar.f(this.containerView);
            this.rightBarrierIds.add(Integer.valueOf(textAtomV2View.getId()));
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull UsersGradesVO item, @NotNull l20.d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        ConstraintLayout constraintLayout = this.containerView;
        constraintLayout.removeAllViews();
        addHeader(item.getValue());
        constraintLayout.addView(this.rightBarrier);
        constraintLayout.addView(this.leftBarrier);
        int i11 = 0;
        for (Object obj : item.getAnswers()) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                C7714v.O0();
                throw null;
            }
            UsersGradesVO.AnswerVO answerVO = (UsersGradesVO.AnswerVO) obj;
            addTitle(answerVO.getTitle(), i11 == 0);
            addValue(answerVO.getValue(), i11);
            addIndicator(answerVO.getFillPercent(), answerVO.getFillLineColor(), i11);
            i11 = i12;
        }
        this.leftBarrier.setReferencedIds(C7714v.T0(this.leftBarrierIds));
        this.rightBarrier.setReferencedIds(C7714v.T0(this.rightBarrierIds));
    }
}
