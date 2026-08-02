package ru.ozon.app.android.ugc.core.widgets.singlereview.header.rating;

import Sc.InterfaceC4008j;
import android.annotation.SuppressLint;
import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.view.C5314e0;
import androidx.core.view.C5316f0;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pdp.utils.DelegatesKt;
import ru.ozon.app.android.pdp.utils.Dimens;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.android.atom.rating.RatingView;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.android.uikitsdk.ext.ViewExtKt;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0019\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\r\u001a\u00020\b2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ!\u0010\u000f\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u000f\u0010\u0010R\u001b\u0010\u0016\u001a\u00020\u00118BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001b\u0010\u001b\u001a\u00020\u00178BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0018\u0010\u0013\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001c"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/singlereview/header/rating/SingleReviewHeaderInfoView;", "Landroid/widget/LinearLayout;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "", "ratingValue", "", "setupRating", "(Ljava/lang/Float;)V", "", "date", "setupDate", "(Ljava/lang/String;)V", "bind", "(Ljava/lang/Float;Ljava/lang/String;)V", "Lru/ozon/uni/android/atom/rating/RatingView;", "ratingView$delegate", "LSc/j;", "getRatingView", "()Lru/ozon/uni/android/atom/rating/RatingView;", "ratingView", "Landroidx/appcompat/widget/AppCompatTextView;", "dateTv$delegate", "getDateTv", "()Landroidx/appcompat/widget/AppCompatTextView;", "dateTv", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SuppressLint({"ViewConstructor"})
/* loaded from: classes2.dex */
public final class SingleReviewHeaderInfoView extends LinearLayout {

    /* renamed from: dateTv$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j dateTv;

    /* renamed from: ratingView$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j ratingView;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SingleReviewHeaderInfoView(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.ratingView = DelegatesKt.lazyUnsafe(new SingleReviewHeaderInfoView$special$$inlined$lazyView$1(this, context));
        this.dateTv = DelegatesKt.lazyUnsafe(new SingleReviewHeaderInfoView$special$$inlined$lazyView$2(this, context));
        setOrientation(0);
        setGravity(8388627);
        setBackgroundColor(ThemeExtKt.themeColor(context, R$attr.layerFloor1));
        RecyclerView.p pVar = new RecyclerView.p(-1, -2);
        Dimens dimens = Dimens.INSTANCE;
        setPadding(dimens.getDP_16(), getPaddingTop(), dimens.getDP_16(), getPaddingBottom());
        setLayoutParams(pVar);
    }

    private final AppCompatTextView getDateTv() {
        return (AppCompatTextView) this.dateTv.getValue();
    }

    private final RatingView getRatingView() {
        return (RatingView) this.ratingView.getValue();
    }

    private final void setupDate(String date) {
        if (date == null || h.K(date)) {
            return;
        }
        AppCompatTextView dateTv = getDateTv();
        dateTv.setText(date);
        ViewExtKt.show(dateTv);
    }

    private final void setupRating(Float ratingValue) {
        if (ratingValue != null) {
            RatingView ratingView = getRatingView();
            ratingView.setTotalRating(ratingValue.floatValue());
            ViewExtKt.show(ratingView);
        }
    }

    public final void bind(Float ratingValue, String date) {
        Iterator<View> it = C5316f0.b(this).iterator();
        while (true) {
            C5314e0 c5314e0 = (C5314e0) it;
            if (!c5314e0.hasNext()) {
                setupRating(ratingValue);
                setupDate(date);
                return;
            }
            ViewExtKt.gone((View) c5314e0.next());
        }
    }
}
