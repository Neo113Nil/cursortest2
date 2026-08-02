package com.blaze.blazesdk.widgets.skeletons;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Size;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.cardview.widget.CardView;
import com.blaze.blazesdk.custom_views.BlazeTextView;
import com.blaze.blazesdk.shared.BlazeSDK;
import com.blaze.blazesdk.style.shared.models.BlazeDp;
import com.blaze.blazesdk.style.shared.models.BlazeInsets;
import com.blaze.blazesdk.style.shared.models.BlazeObjectPositioning;
import com.blaze.blazesdk.style.widgets.BlazeViewType;
import com.blaze.blazesdk.style.widgets.BlazeWidgetItemImageContainerBorderStateStyle;
import com.blaze.blazesdk.style.widgets.BlazeWidgetItemImageContainerBorderStyle;
import com.blaze.blazesdk.style.widgets.BlazeWidgetItemImageStyle;
import com.blaze.blazesdk.style.widgets.BlazeWidgetItemStyle;
import com.blaze.blazesdk.style.widgets.BlazeWidgetItemTextStyle;
import com.blaze.blazesdk.style.widgets.BlazeWidgetItemTitleStyle;
import com.blaze.blazesdk.style.widgets.BlazeWidgetLayout;
import defpackage.deh;
import defpackage.evl;
import defpackage.izk;
import defpackage.l8m;
import defpackage.lz;
import defpackage.mqi;
import defpackage.ndd;
import defpackage.tam;
import defpackage.unm;
import defpackage.wzb;
import defpackage.xxl;
import defpackage.ypa;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0015\u0010\u0016R\u001b\u0010\u001c\u001a\u00020\u00178BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001d"}, d2 = {"Lcom/blaze/blazesdk/widgets/skeletons/SkeletonItemCustomView;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Landroid/util/Size;", "containerSize", "", "setContainerBoundaries", "(Landroid/util/Size;)V", "Lcom/blaze/blazesdk/style/shared/models/BlazeInsets;", "padding", "setPaddingAppearance", "(Lcom/blaze/blazesdk/style/shared/models/BlazeInsets;)V", "Lcom/blaze/blazesdk/style/widgets/BlazeWidgetItemImageContainerBorderStyle;", "imageBorder", "setBorderDistance", "(Lcom/blaze/blazesdk/style/widgets/BlazeWidgetItemImageContainerBorderStyle;)V", "Lunm;", "a", "Ljoa;", "getBinding", "()Lunm;", "binding", "blazesdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class SkeletonItemCustomView extends FrameLayout {
    public static final /* synthetic */ int d = 0;
    public final mqi a;
    public BlazeWidgetLayout b;
    public BlazeViewType c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SkeletonItemCustomView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        context.getClass();
        this.a = ypa.b(new deh(3, context, this));
    }

    public static void d(BlazeTextView blazeTextView, BlazeWidgetItemTextStyle blazeWidgetItemTextStyle, BlazeInsets blazeInsets, int i) {
        BlazeDp lineHeight;
        try {
            blazeTextView.setTextSize(blazeWidgetItemTextStyle.getTextSize());
            blazeTextView.setTextColor(blazeWidgetItemTextStyle.getTextColor());
            blazeTextView.setMaxLines(blazeWidgetItemTextStyle.getMaxLines());
            blazeTextView.setGravity(blazeWidgetItemTextStyle.getGravity());
            int toPx$blazesdk_release = blazeInsets.getStart().getToPx$blazesdk_release();
            ViewGroup.LayoutParams layoutParams = blazeTextView.getLayoutParams();
            layoutParams.getClass();
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.setMarginStart(toPx$blazesdk_release);
            blazeTextView.setLayoutParams(marginLayoutParams);
            int toPx$blazesdk_release2 = blazeInsets.getEnd().getToPx$blazesdk_release();
            ViewGroup.LayoutParams layoutParams2 = blazeTextView.getLayoutParams();
            layoutParams2.getClass();
            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
            marginLayoutParams2.setMarginEnd(toPx$blazesdk_release2);
            blazeTextView.setLayoutParams(marginLayoutParams2);
            evl.v(blazeInsets.getTop().getToPx$blazesdk_release(), blazeTextView);
            evl.t(blazeInsets.getBottom().getToPx$blazesdk_release(), blazeTextView);
            Float letterSpacing = blazeWidgetItemTextStyle.getLetterSpacing();
            if (letterSpacing != null) {
                blazeTextView.setLetterSpacing(letterSpacing.floatValue());
            }
            izk.setTypefaceFromResource$default(blazeTextView, blazeWidgetItemTextStyle.getFontResId(), null, null, 6, null);
            if (Build.VERSION.SDK_INT >= 29 && (lineHeight = blazeWidgetItemTextStyle.getLineHeight()) != null) {
                blazeTextView.setLineHeight(lineHeight.getToPx$blazesdk_release());
            }
            blazeTextView.setWidth(Math.min((i - blazeInsets.getStart().getToPx$blazesdk_release()) - blazeInsets.getEnd().getToPx$blazesdk_release(), (int) blazeTextView.getPaint().measureText(blazeTextView.getText().toString())));
        } catch (Throwable th) {
            BlazeSDK.INSTANCE.getGlobalThrowableCatcher$blazesdk_release().invoke(th, null);
        }
    }

    private final unm getBinding() {
        return (unm) this.a.getValue();
    }

    private final void setBorderDistance(BlazeWidgetItemImageContainerBorderStyle imageBorder) {
        try {
            BlazeWidgetItemImageContainerBorderStateStyle unreadState = imageBorder.getUnreadState();
            if (imageBorder.isVisible() && unreadState.isVisible()) {
                CardView cardView = getBinding().e;
                cardView.getClass();
                lz.z(unreadState.getMargin().getToPx$blazesdk_release(), cardView);
                CardView cardView2 = getBinding().e;
                cardView2.getClass();
                lz.v(cardView2, unreadState.getMargin().getToPx$blazesdk_release());
                CardView cardView3 = getBinding().e;
                cardView3.getClass();
                evl.v(unreadState.getMargin().getToPx$blazesdk_release(), cardView3);
                CardView cardView4 = getBinding().e;
                cardView4.getClass();
                evl.t(unreadState.getMargin().getToPx$blazesdk_release(), cardView4);
                return;
            }
            CardView cardView5 = getBinding().e;
            cardView5.getClass();
            lz.z(0, cardView5);
            CardView cardView6 = getBinding().e;
            cardView6.getClass();
            lz.v(cardView6, 0);
            CardView cardView7 = getBinding().e;
            cardView7.getClass();
            evl.v(0, cardView7);
            CardView cardView8 = getBinding().e;
            cardView8.getClass();
            evl.t(0, cardView8);
        } catch (Throwable th) {
            BlazeSDK.INSTANCE.getGlobalThrowableCatcher$blazesdk_release().invoke(th, null);
        }
    }

    private final void setContainerBoundaries(Size containerSize) {
        try {
            BlazeViewType blazeViewType = this.c;
            if (blazeViewType != null) {
                int i = l8m.a[blazeViewType.ordinal()];
                if (i == 1) {
                    if (containerSize.getHeight() > 0) {
                        b(containerSize.getWidth(), containerSize.getHeight());
                    }
                } else {
                    if (i != 2) {
                        throw new ndd();
                    }
                    if (containerSize.getWidth() > 0) {
                        a(containerSize.getWidth());
                    }
                }
            }
        } catch (Throwable th) {
            BlazeSDK.INSTANCE.getGlobalThrowableCatcher$blazesdk_release().invoke(th, null);
        }
    }

    private final void setPaddingAppearance(BlazeInsets padding) {
        try {
            getBinding().a.setPadding(padding.getStart().getToPx$blazesdk_release(), padding.getTop().getToPx$blazesdk_release(), padding.getEnd().getToPx$blazesdk_release(), padding.getBottom().getToPx$blazesdk_release());
        } catch (Throwable th) {
            BlazeSDK.INSTANCE.getGlobalThrowableCatcher$blazesdk_release().invoke(th, null);
        }
    }

    public final void a(int i) {
        int toPx$blazesdk_release;
        try {
            BlazeWidgetLayout blazeWidgetLayout = this.b;
            if (blazeWidgetLayout != null) {
                int updatedColumns = blazeWidgetLayout.getUpdatedColumns();
                if (updatedColumns == 1) {
                    toPx$blazesdk_release = ((i - blazeWidgetLayout.getMargins().getStart().getToPx$blazesdk_release()) - blazeWidgetLayout.getMargins().getEnd().getToPx$blazesdk_release()) / blazeWidgetLayout.getUpdatedColumns();
                } else if (updatedColumns != 2) {
                    toPx$blazesdk_release = (((i - ((blazeWidgetLayout.getUpdatedColumns() - 1) * blazeWidgetLayout.getHorizontalItemsSpacing().getToPx$blazesdk_release())) - blazeWidgetLayout.getMargins().getStart().getToPx$blazesdk_release()) - blazeWidgetLayout.getMargins().getEnd().getToPx$blazesdk_release()) / blazeWidgetLayout.getUpdatedColumns();
                } else {
                    toPx$blazesdk_release = (((i - blazeWidgetLayout.getHorizontalItemsSpacing().getToPx$blazesdk_release()) - blazeWidgetLayout.getMargins().getStart().getToPx$blazesdk_release()) - blazeWidgetLayout.getMargins().getEnd().getToPx$blazesdk_release()) / blazeWidgetLayout.getUpdatedColumns();
                }
                int b = wzb.b(toPx$blazesdk_release / blazeWidgetLayout.getItemRatio());
                ViewGroup.LayoutParams layoutParams = getBinding().a.getLayoutParams();
                layoutParams.height = b;
                layoutParams.width = toPx$blazesdk_release;
                h(toPx$blazesdk_release, b);
                i(blazeWidgetLayout.getWidgetItemStyle(), toPx$blazesdk_release, b);
            }
        } catch (Throwable th) {
            BlazeSDK.INSTANCE.getGlobalThrowableCatcher$blazesdk_release().invoke(th, null);
        }
    }

    public final void b(int i, int i2) {
        try {
            BlazeWidgetLayout blazeWidgetLayout = this.b;
            if (blazeWidgetLayout != null) {
                int toPx$blazesdk_release = (i2 - blazeWidgetLayout.getMargins().getTop().getToPx$blazesdk_release()) - blazeWidgetLayout.getMargins().getBottom().getToPx$blazesdk_release();
                int b = wzb.b(toPx$blazesdk_release * blazeWidgetLayout.getItemRatio());
                ViewGroup.LayoutParams layoutParams = getBinding().a.getLayoutParams();
                layoutParams.height = toPx$blazesdk_release;
                Integer maxDisplayItemsCount = blazeWidgetLayout.getMaxDisplayItemsCount();
                if (maxDisplayItemsCount != null && maxDisplayItemsCount.intValue() == 1) {
                    layoutParams.width = i;
                    h(b, toPx$blazesdk_release);
                    i(blazeWidgetLayout.getWidgetItemStyle(), b, toPx$blazesdk_release);
                }
                i = b;
                layoutParams.width = i;
                h(b, toPx$blazesdk_release);
                i(blazeWidgetLayout.getWidgetItemStyle(), b, toPx$blazesdk_release);
            }
        } catch (Throwable th) {
            BlazeSDK.INSTANCE.getGlobalThrowableCatcher$blazesdk_release().invoke(th, null);
        }
    }

    public final void c(xxl xxlVar, BlazeWidgetLayout blazeWidgetLayout, BlazeViewType blazeViewType) {
        xxlVar.getClass();
        blazeViewType.getClass();
        blazeWidgetLayout.getClass();
        try {
            this.c = blazeViewType;
            this.b = blazeWidgetLayout;
            try {
                View view = (View) xxlVar.a.get();
                Size size = view != null ? new Size(view.getWidth(), view.getHeight()) : null;
                if (size != null) {
                    setContainerBoundaries(size);
                    Unit unit = Unit.a;
                }
            } catch (Throwable th) {
                BlazeSDK.INSTANCE.getGlobalThrowableCatcher$blazesdk_release().invoke(th, null);
                Unit unit2 = Unit.a;
            }
        } catch (Throwable th2) {
            BlazeSDK.INSTANCE.getGlobalThrowableCatcher$blazesdk_release().invoke(th2, null);
        }
    }

    public final void e(BlazeWidgetItemImageStyle blazeWidgetItemImageStyle, float f) {
        try {
            BlazeWidgetItemImageContainerBorderStateStyle unreadState = blazeWidgetItemImageStyle.getBorder().getUnreadState();
            int i = (blazeWidgetItemImageStyle.getBorder().isVisible() && unreadState.isVisible()) ? -7829368 : 0;
            int toPx$blazesdk_release = unreadState.getWidth().getToPx$blazesdk_release();
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setShape(0);
            gradientDrawable.setCornerRadii(new float[]{f, f, f, f, f, f, f, f});
            gradientDrawable.setColor(0);
            gradientDrawable.setStroke(toPx$blazesdk_release, i);
            unm binding = getBinding();
            binding.b.setBackground(gradientDrawable);
            binding.e.setRadius(f);
            binding.c.setRadius(f);
        } catch (Throwable th) {
            BlazeSDK.INSTANCE.getGlobalThrowableCatcher$blazesdk_release().invoke(th, null);
        }
    }

    public final void f(BlazeWidgetItemStyle blazeWidgetItemStyle, int i, int i2) {
        try {
            unm binding = getBinding();
            BlazeDp width = blazeWidgetItemStyle.getImage().getWidth();
            Integer valueOf = width != null ? Integer.valueOf(width.getToPx$blazesdk_release()) : null;
            BlazeDp height = blazeWidgetItemStyle.getImage().getHeight();
            Integer valueOf2 = height != null ? Integer.valueOf(height.getToPx$blazesdk_release()) : null;
            Float ratio = blazeWidgetItemStyle.getImage().getRatio();
            if (valueOf != null) {
                i = Math.min(i, valueOf.intValue());
            }
            if (valueOf2 != null) {
                i2 = Math.min(i2, valueOf2.intValue());
            }
            int toPx$blazesdk_release = i - (blazeWidgetItemStyle.getImage().getMargins().getStart().getToPx$blazesdk_release() + blazeWidgetItemStyle.getImage().getMargins().getEnd().getToPx$blazesdk_release());
            int toPx$blazesdk_release2 = i2 - (blazeWidgetItemStyle.getImage().getMargins().getTop().getToPx$blazesdk_release() + blazeWidgetItemStyle.getImage().getMargins().getBottom().getToPx$blazesdk_release());
            if (valueOf == null || valueOf2 == null) {
                if (valueOf != null && ratio != null) {
                    toPx$blazesdk_release2 = wzb.b(toPx$blazesdk_release / ratio.floatValue());
                } else if (valueOf2 != null && ratio != null) {
                    toPx$blazesdk_release = wzb.b(toPx$blazesdk_release2 * ratio.floatValue());
                } else if (ratio != null) {
                    if (toPx$blazesdk_release > toPx$blazesdk_release2) {
                        toPx$blazesdk_release = (int) Math.floor(toPx$blazesdk_release2 * ratio.floatValue());
                    } else {
                        toPx$blazesdk_release2 = (int) Math.floor(toPx$blazesdk_release / ratio.floatValue());
                    }
                }
            }
            getBinding().c.getLayoutParams().width = toPx$blazesdk_release;
            getBinding().c.getLayoutParams().height = toPx$blazesdk_release2;
            switch (l8m.b[blazeWidgetItemStyle.getImage().getPosition().ordinal()]) {
                case 1:
                    CardView cardView = binding.c;
                    cardView.getClass();
                    int id = binding.a.getId();
                    evl.w(id, cardView);
                    evl.g(cardView, id);
                    break;
                case 2:
                    CardView cardView2 = binding.c;
                    cardView2.getClass();
                    int id2 = binding.a.getId();
                    evl.w(id2, cardView2);
                    evl.p(id2, cardView2);
                    evl.g(cardView2, id2);
                    break;
                case 3:
                    CardView cardView3 = binding.c;
                    cardView3.getClass();
                    int id3 = binding.a.getId();
                    evl.p(id3, cardView3);
                    evl.g(cardView3, id3);
                    break;
                case 4:
                    CardView cardView4 = binding.c;
                    cardView4.getClass();
                    int id4 = binding.a.getId();
                    evl.w(id4, cardView4);
                    evl.p(id4, cardView4);
                    evl.g(cardView4, id4);
                    evl.y(id4, cardView4);
                    break;
                case 5:
                    CardView cardView5 = binding.c;
                    cardView5.getClass();
                    int id5 = binding.a.getId();
                    evl.w(id5, cardView5);
                    evl.g(cardView5, id5);
                    evl.y(id5, cardView5);
                    break;
                case 6:
                    CardView cardView6 = binding.c;
                    cardView6.getClass();
                    int id6 = binding.a.getId();
                    evl.p(id6, cardView6);
                    evl.g(cardView6, id6);
                    evl.y(id6, cardView6);
                    break;
                case 7:
                    CardView cardView7 = binding.c;
                    cardView7.getClass();
                    int id7 = binding.a.getId();
                    evl.w(id7, cardView7);
                    evl.y(id7, cardView7);
                    break;
                case 8:
                    CardView cardView8 = binding.c;
                    cardView8.getClass();
                    int id8 = binding.a.getId();
                    evl.w(id8, cardView8);
                    evl.p(id8, cardView8);
                    evl.y(id8, cardView8);
                    break;
                case 9:
                    View view = binding.b;
                    view.getClass();
                    int id9 = binding.a.getId();
                    evl.p(id9, view);
                    evl.y(id9, view);
                    break;
                default:
                    throw new ndd();
            }
            CardView cardView9 = binding.c;
            cardView9.getClass();
            lz.z(blazeWidgetItemStyle.getImage().getMargins().getStart().getToPx$blazesdk_release(), cardView9);
            cardView9.getClass();
            evl.v(blazeWidgetItemStyle.getImage().getMargins().getTop().getToPx$blazesdk_release(), cardView9);
            lz.v(cardView9, blazeWidgetItemStyle.getImage().getMargins().getEnd().getToPx$blazesdk_release());
            evl.t(blazeWidgetItemStyle.getImage().getMargins().getBottom().getToPx$blazesdk_release(), cardView9);
            BlazeWidgetItemImageStyle image = blazeWidgetItemStyle.getImage();
            image.getClass();
            e(blazeWidgetItemStyle.getImage(), tam.a(image.getCornerRadius(), image.getCornerRadiusRatio(), toPx$blazesdk_release, toPx$blazesdk_release2));
            setBorderDistance(blazeWidgetItemStyle.getImage().getBorder());
        } catch (Throwable th) {
            BlazeSDK.INSTANCE.getGlobalThrowableCatcher$blazesdk_release().invoke(th, null);
        }
    }

    public final void g(BlazeWidgetItemTitleStyle blazeWidgetItemTitleStyle, int i) {
        try {
            unm binding = getBinding();
            BlazeTextView blazeTextView = binding.d;
            blazeTextView.getClass();
            blazeTextView.setVisibility(blazeWidgetItemTitleStyle.isVisible() ? 0 : 8);
            blazeTextView.getClass();
            BlazeObjectPositioning position = blazeWidgetItemTitleStyle.getPosition();
            CardView cardView = binding.c;
            cardView.getClass();
            evl.i(blazeTextView, position, cardView);
            d(blazeTextView, blazeWidgetItemTitleStyle.getUnreadState(), blazeWidgetItemTitleStyle.getMargins(), i);
        } catch (Throwable th) {
            BlazeSDK.INSTANCE.getGlobalThrowableCatcher$blazesdk_release().invoke(th, null);
        }
    }

    public final void h(int i, int i2) {
        BlazeWidgetItemStyle widgetItemStyle;
        try {
            BlazeWidgetLayout blazeWidgetLayout = this.b;
            if (blazeWidgetLayout == null || (widgetItemStyle = blazeWidgetLayout.getWidgetItemStyle()) == null) {
                return;
            }
            getBinding().a.setBackground(tam.drawBorderShape$default(tam.a, 0, 0, tam.a(widgetItemStyle.getCornerRadius(), widgetItemStyle.getCornerRadiusRatio(), i, i2), 0, 8, null));
            getBinding().a.setClipToOutline(true);
        } catch (Throwable th) {
            BlazeSDK.INSTANCE.getGlobalThrowableCatcher$blazesdk_release().invoke(th, null);
        }
    }

    public final void i(BlazeWidgetItemStyle blazeWidgetItemStyle, int i, int i2) {
        try {
            g(blazeWidgetItemStyle.getTitle(), i);
            setPaddingAppearance(blazeWidgetItemStyle.getPadding());
            f(blazeWidgetItemStyle, i, i2);
        } catch (Throwable th) {
            BlazeSDK.INSTANCE.getGlobalThrowableCatcher$blazesdk_release().invoke(th, null);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SkeletonItemCustomView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        context.getClass();
    }

    public /* synthetic */ SkeletonItemCustomView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SkeletonItemCustomView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        context.getClass();
    }
}
