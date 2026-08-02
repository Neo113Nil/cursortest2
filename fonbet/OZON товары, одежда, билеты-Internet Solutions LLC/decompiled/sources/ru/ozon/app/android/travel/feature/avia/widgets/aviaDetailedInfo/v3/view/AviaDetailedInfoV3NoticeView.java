package ru.ozon.app.android.travel.feature.avia.widgets.aviaDetailedInfo.v3.view;

import Bi.a;
import android.content.Context;
import android.widget.LinearLayout;
import gk0.q;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.atoms.v3.holders.disclaimer.DisclaimerHolderKt;
import ru.ozon.app.android.atoms.v3.molecules.DisclaimerContainer;
import ru.ozon.app.android.travel.feature.avia.widgets.aviaDetailedInfo.v3.presentation.content.AviaDetailedInfoV3VO;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000e\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eR\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/aviaDetailedInfo/v3/view/AviaDetailedInfoV3NoticeView;", "Landroid/widget/LinearLayout;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "titleTav", "Lru/ozon/uni/android/atom/text/TextAtomV2View;", "subtitleTav", "annotationDc", "Lru/ozon/app/android/atoms/v3/molecules/DisclaimerContainer;", "bind", "", "item", "Lru/ozon/app/android/travel/feature/avia/widgets/aviaDetailedInfo/v3/presentation/content/AviaDetailedInfoV3VO$AviaDetailsContentVO$NoticeVO;", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class AviaDetailedInfoV3NoticeView extends LinearLayout {

    @NotNull
    private final DisclaimerContainer annotationDc;

    @NotNull
    private final TextAtomV2View subtitleTav;

    @NotNull
    private final TextAtomV2View titleTav;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AviaDetailedInfoV3NoticeView(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        q qVar = q.f64554a;
        TextAtomV2View textAtomV2View = (TextAtomV2View) qVar.g(N.b(TextAtomV2View.class), context);
        a.d(-1, -2, textAtomV2View);
        this.titleTav = textAtomV2View;
        TextAtomV2View textAtomV2View2 = (TextAtomV2View) qVar.g(N.b(TextAtomV2View.class), context);
        a.d(-1, -2, textAtomV2View2);
        this.subtitleTav = textAtomV2View2;
        DisclaimerContainer disclaimerContainer = new DisclaimerContainer(context, null, 0, 6, null);
        disclaimerContainer.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        this.annotationDc = disclaimerContainer;
        setOrientation(1);
        addView(textAtomV2View);
        addView(textAtomV2View2);
        addView(disclaimerContainer);
    }

    public final void bind(@NotNull AviaDetailedInfoV3VO.AviaDetailsContentVO.NoticeVO item) {
        Intrinsics.checkNotNullParameter(item, "item");
        TextHolderKt.bindOrGone$default(this.titleTav, item.getNoticeLuggage(), null, 2, null);
        TextHolderKt.bindOrGone$default(this.subtitleTav, item.getNoticeTime(), null, 2, null);
        DisclaimerHolderKt.bindOrGone$default(this.annotationDc, item.getAnnotation(), null, 2, null);
    }
}
