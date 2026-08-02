package defpackage;

import android.app.Application;
import com.blaze.blazesdk.extentions.ParcelableExtensionKt;
import com.blaze.blazesdk.features.shared.models.ui_shared.BlazeLiveStreamStatus;
import com.blaze.blazesdk.shared.BlazeSDK;
import com.blaze.blazesdk.style.shared.models.BlazeDp;
import com.blaze.blazesdk.style.shared.models.BlazeInsets;
import com.blaze.blazesdk.style.shared.models.BlazeObjectPositioning;
import com.blaze.blazesdk.style.shared.models.BlazeObjectXPosition;
import com.blaze.blazesdk.style.shared.models.BlazeObjectYPosition;
import com.blaze.blazesdk.style.widgets.BlazeWidgetItemBadgeStateStyle;
import com.blaze.blazesdk.style.widgets.BlazeWidgetItemBadgeStyle;
import com.blaze.blazesdk.style.widgets.BlazeWidgetItemDurationElementStateStyle;
import com.blaze.blazesdk.style.widgets.BlazeWidgetItemDurationElementStyle;
import com.blaze.blazesdk.style.widgets.BlazeWidgetItemEventTimeElementStateStyle;
import com.blaze.blazesdk.style.widgets.BlazeWidgetItemEventTimeElementStreamStatesStyle;
import com.blaze.blazesdk.style.widgets.BlazeWidgetItemEventTimeElementStyle;
import com.blaze.blazesdk.style.widgets.BlazeWidgetItemImageAnimatedThumbnailStyle;
import com.blaze.blazesdk.style.widgets.BlazeWidgetItemImageContainerBorderStateStyle;
import com.blaze.blazesdk.style.widgets.BlazeWidgetItemImageContainerBorderStyle;
import com.blaze.blazesdk.style.widgets.BlazeWidgetItemImageGradientOverlayStyle;
import com.blaze.blazesdk.style.widgets.BlazeWidgetItemImageStyle;
import com.blaze.blazesdk.style.widgets.BlazeWidgetItemStatusIndicatorStateStyle;
import com.blaze.blazesdk.style.widgets.BlazeWidgetItemStatusIndicatorStreamStatesStyle;
import com.blaze.blazesdk.style.widgets.BlazeWidgetItemStatusIndicatorStyle;
import com.blaze.blazesdk.style.widgets.BlazeWidgetItemStyle;
import com.blaze.blazesdk.style.widgets.BlazeWidgetItemTextStyle;
import com.blaze.blazesdk.style.widgets.BlazeWidgetItemTitleStyle;
import com.blaze.blazesdk.style.widgets.BlazeWidgetLayout;
import com.sofascore.results.R;
import com.unity3d.services.UnityAdsConstants;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public abstract class lxl {
    public static BlazeWidgetLayout a() {
        BlazeWidgetLayout b = b();
        b.setItemRatio(1.7777778f);
        BlazeWidgetItemImageStyle image = b.getWidgetItemStyle().getImage();
        image.setRatio(Float.valueOf(1.7777778f));
        image.setThumbnailType(BlazeWidgetItemImageStyle.BlazeThumbnailType.CUSTOM);
        image.setPosition(BlazeWidgetItemImageStyle.BlazeImagePosition.Center);
        return b;
    }

    public static BlazeWidgetLayout b() {
        BlazeWidgetItemImageContainerBorderStateStyle.INSTANCE.getClass();
        BlazeWidgetItemImageContainerBorderStateStyle blazeWidgetItemImageContainerBorderStateStyle = new BlazeWidgetItemImageContainerBorderStateStyle(true, 0, new BlazeDp(4), new BlazeDp(2));
        int i = l1m.d;
        blazeWidgetItemImageContainerBorderStateStyle.setColor(i);
        BlazeWidgetItemImageContainerBorderStateStyle blazeWidgetItemImageContainerBorderStateStyle2 = new BlazeWidgetItemImageContainerBorderStateStyle(true, 0, new BlazeDp(4), new BlazeDp(2));
        int i2 = l1m.b;
        blazeWidgetItemImageContainerBorderStateStyle2.setColor(i2);
        BlazeWidgetItemImageContainerBorderStateStyle blazeWidgetItemImageContainerBorderStateStyle3 = new BlazeWidgetItemImageContainerBorderStateStyle(true, 0, new BlazeDp(4), new BlazeDp(2));
        int i3 = l1m.a;
        blazeWidgetItemImageContainerBorderStateStyle3.setColor(i3);
        BlazeWidgetItemImageContainerBorderStateStyle blazeWidgetItemImageContainerBorderStateStyle4 = new BlazeWidgetItemImageContainerBorderStateStyle(true, 0, new BlazeDp(4), new BlazeDp(2));
        blazeWidgetItemImageContainerBorderStateStyle4.setColor(l1m.e);
        BlazeWidgetItemImageContainerBorderStyle blazeWidgetItemImageContainerBorderStyle = new BlazeWidgetItemImageContainerBorderStyle(false, blazeWidgetItemImageContainerBorderStateStyle2, blazeWidgetItemImageContainerBorderStateStyle, blazeWidgetItemImageContainerBorderStateStyle4, blazeWidgetItemImageContainerBorderStateStyle3);
        BlazeWidgetItemImageStyle.BlazeImagePosition blazeImagePosition = BlazeWidgetItemImageStyle.BlazeImagePosition.TopCenter;
        BlazeDp blazeDp = new BlazeDp(8);
        BlazeInsets blazeInsets = new BlazeInsets(new BlazeDp(2), new BlazeDp(2), new BlazeDp(2), new BlazeDp(2));
        BlazeWidgetItemImageStyle.BlazeThumbnailType blazeThumbnailType = BlazeWidgetItemImageStyle.BlazeThumbnailType.VERTICAL_TWO_BY_THREE;
        BlazeWidgetItemImageGradientOverlayStyle blazeWidgetItemImageGradientOverlayStyle = new BlazeWidgetItemImageGradientOverlayStyle(true, ((int) (llf.b(0.8f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f) * 255.0f)) << 24, 0, BlazeWidgetItemImageGradientOverlayStyle.BlazeGradientPosition.BOTTOM);
        Application application$blazesdk_release = BlazeSDK.INSTANCE.getApplication$blazesdk_release();
        BlazeWidgetItemImageStyle blazeWidgetItemImageStyle = new BlazeWidgetItemImageStyle(blazeImagePosition, null, null, Float.valueOf(0.6666667f), blazeWidgetItemImageContainerBorderStyle, blazeThumbnailType, blazeDp, null, blazeInsets, blazeWidgetItemImageGradientOverlayStyle, new BlazeWidgetItemImageAnimatedThumbnailStyle(false, (application$blazesdk_release == null || !cnb.i(application$blazesdk_release)) ? 0.3f : 0.15f));
        BlazeWidgetItemTextStyle blazeWidgetItemTextStyle = new BlazeWidgetItemTextStyle(null, null, l1m.g, 14.0f, null, 3, 8388611);
        BlazeInsets blazeInsets2 = new BlazeInsets(new BlazeDp(8), new BlazeDp(8), new BlazeDp(8), new BlazeDp(8));
        BlazeWidgetItemTextStyle blazeWidgetItemTextStyle2 = (BlazeWidgetItemTextStyle) ParcelableExtensionKt.blazeDeepCopy(blazeWidgetItemTextStyle);
        BlazeWidgetItemTextStyle blazeWidgetItemTextStyle3 = (BlazeWidgetItemTextStyle) ParcelableExtensionKt.blazeDeepCopy(blazeWidgetItemTextStyle);
        BlazeObjectXPosition blazeObjectXPosition = BlazeObjectXPosition.START_TO_START;
        BlazeWidgetItemTitleStyle blazeWidgetItemTitleStyle = new BlazeWidgetItemTitleStyle(true, new BlazeObjectPositioning(blazeObjectXPosition, BlazeObjectYPosition.BOTTOM_TO_BOTTOM), blazeInsets2, blazeWidgetItemTextStyle3, blazeWidgetItemTextStyle2);
        BlazeObjectYPosition blazeObjectYPosition = BlazeObjectYPosition.TOP_TO_TOP;
        BlazeObjectPositioning blazeObjectPositioning = new BlazeObjectPositioning(blazeObjectXPosition, blazeObjectYPosition);
        BlazeInsets blazeInsets3 = new BlazeInsets(new BlazeDp(8), new BlazeDp(8), new BlazeDp(0), new BlazeDp(0));
        BlazeInsets blazeInsets4 = new BlazeInsets(new BlazeDp(8), new BlazeDp(2), new BlazeDp(8), new BlazeDp(2));
        BlazeWidgetItemStatusIndicatorStateStyle.INSTANCE.getClass();
        BlazeWidgetItemStatusIndicatorStateStyle a = BlazeWidgetItemStatusIndicatorStateStyle.Companion.a();
        a.setBackgroundColor(i3);
        a.setText("NEW");
        BlazeWidgetItemStatusIndicatorStateStyle a2 = BlazeWidgetItemStatusIndicatorStateStyle.Companion.a();
        a2.setBackgroundColor(l1m.h);
        a2.setText("");
        a2.setVisible(false);
        BlazeWidgetItemStatusIndicatorStateStyle a3 = BlazeWidgetItemStatusIndicatorStateStyle.Companion.a();
        a3.setBackgroundColor(i);
        a3.setText("LIVE");
        BlazeWidgetItemStatusIndicatorStateStyle a4 = BlazeWidgetItemStatusIndicatorStateStyle.Companion.a();
        a4.setBackgroundColor(i2);
        a4.setText("LIVE");
        BlazeLiveStreamStatus blazeLiveStreamStatus = BlazeLiveStreamStatus.UPCOMING;
        BlazeWidgetItemStatusIndicatorStateStyle b = BlazeWidgetItemStatusIndicatorStateStyle.Companion.b(blazeLiveStreamStatus);
        BlazeLiveStreamStatus blazeLiveStreamStatus2 = BlazeLiveStreamStatus.LIVE;
        BlazeWidgetItemStatusIndicatorStateStyle b2 = BlazeWidgetItemStatusIndicatorStateStyle.Companion.b(blazeLiveStreamStatus2);
        BlazeLiveStreamStatus blazeLiveStreamStatus3 = BlazeLiveStreamStatus.ENDED;
        BlazeWidgetItemStatusIndicatorStyle blazeWidgetItemStatusIndicatorStyle = new BlazeWidgetItemStatusIndicatorStyle(blazeObjectPositioning, true, blazeInsets3, blazeInsets4, a4, a3, a, a2, new BlazeWidgetItemStatusIndicatorStreamStatesStyle(b, b2, BlazeWidgetItemStatusIndicatorStateStyle.Companion.b(blazeLiveStreamStatus3)));
        BlazeObjectPositioning blazeObjectPositioning2 = new BlazeObjectPositioning(blazeObjectXPosition, blazeObjectYPosition);
        BlazeInsets blazeInsets5 = new BlazeInsets(new BlazeDp(6), new BlazeDp(4), new BlazeDp(6), new BlazeDp(4));
        BlazeInsets blazeInsets6 = new BlazeInsets(new BlazeDp(0), new BlazeDp(0), new BlazeDp(0), new BlazeDp(0));
        BlazeWidgetItemBadgeStateStyle.INSTANCE.getClass();
        BlazeWidgetItemBadgeStyle blazeWidgetItemBadgeStyle = new BlazeWidgetItemBadgeStyle(false, blazeObjectPositioning2, blazeInsets6, blazeInsets5, BlazeWidgetItemBadgeStateStyle.Companion.a(), BlazeWidgetItemBadgeStateStyle.Companion.a(), BlazeWidgetItemBadgeStateStyle.Companion.a(), BlazeWidgetItemBadgeStateStyle.Companion.a());
        BlazeObjectXPosition blazeObjectXPosition2 = BlazeObjectXPosition.END_TO_END;
        BlazeObjectPositioning blazeObjectPositioning3 = new BlazeObjectPositioning(blazeObjectXPosition2, blazeObjectYPosition);
        BlazeInsets blazeInsets7 = new BlazeInsets(new BlazeDp(0), new BlazeDp(8), new BlazeDp(8), new BlazeDp(0));
        BlazeInsets blazeInsets8 = new BlazeInsets(new BlazeDp(8), new BlazeDp(3), new BlazeDp(8), new BlazeDp(3));
        BlazeWidgetItemDurationElementStyle.BlazeWidgetItemDurationElementIconStyle blazeWidgetItemDurationElementIconStyle = new BlazeWidgetItemDurationElementStyle.BlazeWidgetItemDurationElementIconStyle(R.drawable.blaze_drawable_ic_widget_duration, BlazeWidgetItemDurationElementStyle.BlazeWidgetItemDurationElementIconStyle.BlazeIconPositioning.START, null);
        BlazeWidgetItemDurationElementStateStyle.INSTANCE.getClass();
        BlazeWidgetItemDurationElementStyle blazeWidgetItemDurationElementStyle = new BlazeWidgetItemDurationElementStyle(true, blazeObjectPositioning3, blazeInsets7, blazeInsets8, blazeWidgetItemDurationElementIconStyle, BlazeWidgetItemDurationElementStateStyle.Companion.a(), BlazeWidgetItemDurationElementStateStyle.Companion.a(), BlazeWidgetItemDurationElementStateStyle.Companion.a(), BlazeWidgetItemDurationElementStateStyle.Companion.a());
        BlazeObjectPositioning blazeObjectPositioning4 = new BlazeObjectPositioning(blazeObjectXPosition2, blazeObjectYPosition);
        BlazeInsets blazeInsets9 = new BlazeInsets(new BlazeDp(0), new BlazeDp(8), new BlazeDp(8), new BlazeDp(0));
        BlazeInsets blazeInsets10 = new BlazeInsets(new BlazeDp(8), new BlazeDp(3), new BlazeDp(8), new BlazeDp(3));
        BlazeWidgetItemEventTimeElementStateStyle.INSTANCE.getClass();
        return new BlazeWidgetLayout(new BlazeDp(8), new BlazeDp(8), 0.6666667f, new BlazeInsets(new BlazeDp(16), new BlazeDp(0), new BlazeDp(16), new BlazeDp(0)), 0, null, new BlazeWidgetItemStyle(blazeWidgetItemTitleStyle, blazeWidgetItemStatusIndicatorStyle, 0, new BlazeInsets(new BlazeDp(0), new BlazeDp(0), new BlazeDp(0), new BlazeDp(0)), new BlazeDp(5), Float.valueOf(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT), blazeWidgetItemImageStyle, blazeWidgetItemBadgeStyle, blazeWidgetItemDurationElementStyle, new BlazeWidgetItemEventTimeElementStyle(true, blazeObjectPositioning4, blazeInsets9, blazeInsets10, null, new BlazeWidgetItemEventTimeElementStreamStatesStyle(BlazeWidgetItemEventTimeElementStateStyle.Companion.a(blazeLiveStreamStatus), BlazeWidgetItemEventTimeElementStateStyle.Companion.a(blazeLiveStreamStatus2), BlazeWidgetItemEventTimeElementStateStyle.Companion.a(blazeLiveStreamStatus3)))));
    }

    public static BlazeWidgetLayout c() {
        BlazeWidgetLayout a = a();
        a.setMaxDisplayItemsCount(1);
        a.setMargins(new BlazeInsets(new BlazeDp(0), new BlazeDp(0), new BlazeDp(0), new BlazeDp(0)));
        return a;
    }

    public static BlazeWidgetLayout d() {
        BlazeWidgetLayout b = b();
        b.setMaxDisplayItemsCount(1);
        b.setMargins(new BlazeInsets(new BlazeDp(0), new BlazeDp(0), new BlazeDp(0), new BlazeDp(0)));
        return b;
    }
}
