package ru.ozon.app.android.seller.molecule.progressLadder.presentation;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.marketing.ui.R$id;
import ru.ozon.app.android.seller.molecule.progressLadder.data.ProgressLadderDTO;
import ru.ozon.app.android.seller.molecule.progressLadder.presentation.view.ladderItem.LadderItemView;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000e\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rJ,\u0010\u000e\u001a\u00020\u000b*\u00020\b2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0014H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\u0006\u001a\u0012\u0012\u0004\u0012\u00020\b0\u0007j\b\u0012\u0004\u0012\u00020\b`\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/seller/molecule/progressLadder/presentation/ProgressLadderView;", "Landroid/widget/LinearLayout;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "ladderItemViewsCache", "Ljava/util/ArrayList;", "Lru/ozon/app/android/seller/molecule/progressLadder/presentation/view/ladderItem/LadderItemView;", "Lkotlin/collections/ArrayList;", "bind", "", "progressLadderDTO", "Lru/ozon/app/android/seller/molecule/progressLadder/data/ProgressLadderDTO;", "bindAndShow", "step", "Lru/ozon/app/android/seller/molecule/progressLadder/data/ProgressLadderDTO$StepDTO;", "isCompact", "", "index", "", "stepsCount", "Companion", "seller_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ProgressLadderView extends LinearLayout {
    private static final int dp4 = UiExtKt.toPx(4);

    @NotNull
    private final Context context;

    @NotNull
    private final ArrayList<LadderItemView> ladderItemViewsCache;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProgressLadderView(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
        this.ladderItemViewsCache = new ArrayList<>(4);
        setId(R$id.progressLadder_Root);
        setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        setOrientation(0);
    }

    private final void bindAndShow(LadderItemView ladderItemView, ProgressLadderDTO.StepDTO stepDTO, boolean z11, int i11, int i12) {
        ViewGroup.LayoutParams layoutParams = ladderItemView.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.setMarginEnd(i11 == i12 + (-1) ? 0 : dp4);
        ladderItemView.setLayoutParams(marginLayoutParams);
        ladderItemView.bind(stepDTO);
        ladderItemView.setProgressCompact(z11);
        ViewExtKt.show(ladderItemView);
    }

    public final void bind(@NotNull ProgressLadderDTO progressLadderDTO) {
        LadderItemView ladderItemView;
        Intrinsics.checkNotNullParameter(progressLadderDTO, "progressLadderDTO");
        List<ProgressLadderDTO.StepDTO> steps = progressLadderDTO.getSteps();
        boolean d11 = Intrinsics.d(progressLadderDTO.isCompact(), Boolean.TRUE);
        int size = steps.size();
        if (size == getChildCount()) {
            int i11 = 0;
            for (Object obj : steps) {
                int i12 = i11 + 1;
                if (i11 < 0) {
                    C7714v.O0();
                    throw null;
                }
                ProgressLadderDTO.StepDTO stepDTO = (ProgressLadderDTO.StepDTO) obj;
                LadderItemView ladderItemView2 = this.ladderItemViewsCache.get(i11);
                Intrinsics.checkNotNullExpressionValue(ladderItemView2, "get(...)");
                bindAndShow(ladderItemView2, stepDTO, d11, i11, size);
                i11 = i12;
            }
            return;
        }
        ProgressLadderView progressLadderView = this;
        if (size < getChildCount()) {
            int i13 = 0;
            for (Object obj2 : progressLadderView.ladderItemViewsCache) {
                int i14 = i13 + 1;
                if (i13 < 0) {
                    C7714v.O0();
                    throw null;
                }
                LadderItemView ladderItemView3 = (LadderItemView) obj2;
                if (i13 < size) {
                    ProgressLadderView progressLadderView2 = progressLadderView;
                    progressLadderView2.bindAndShow(ladderItemView3, steps.get(i13), d11, i13, size);
                    progressLadderView = progressLadderView2;
                } else {
                    ViewExtKt.gone(ladderItemView3);
                }
                i13 = i14;
            }
            return;
        }
        if (size > getChildCount()) {
            int i15 = 0;
            for (Object obj3 : steps) {
                int i16 = i15 + 1;
                if (i15 < 0) {
                    C7714v.O0();
                    throw null;
                }
                ProgressLadderDTO.StepDTO stepDTO2 = (ProgressLadderDTO.StepDTO) obj3;
                ArrayList<LadderItemView> arrayList = progressLadderView.ladderItemViewsCache;
                if (i15 < 0 || i15 >= arrayList.size()) {
                    ladderItemView = new LadderItemView(progressLadderView.context);
                    addView(ladderItemView);
                    progressLadderView.ladderItemViewsCache.add(ladderItemView);
                } else {
                    ladderItemView = arrayList.get(i15);
                }
                progressLadderView.bindAndShow(ladderItemView, stepDTO2, d11, i15, size);
                progressLadderView = this;
                i15 = i16;
            }
        }
    }
}
