package defpackage;

import android.app.Application;
import com.blaze.blazesdk.data_source.BlazeAdvancedOrderType;
import com.blaze.blazesdk.data_source.BlazeDataSourceType;
import com.blaze.blazesdk.data_source.BlazeOrderType;
import com.blaze.blazesdk.data_source.BlazeRecommendationsType;
import com.blaze.blazesdk.data_source.BlazeWidgetLabel;
import com.blaze.blazesdk.shared.BlazeSDK;
import com.blaze.blazesdk.style.shared.models.BlazeDp;
import com.blaze.blazesdk.style.shared.models.BlazeInsets;
import com.blaze.blazesdk.style.shared.models.BlazeObjectPositioning;
import com.blaze.blazesdk.style.widgets.BlazeWidgetItemBadgeStateStyle;
import com.blaze.blazesdk.style.widgets.BlazeWidgetItemBadgeStyle;
import com.blaze.blazesdk.style.widgets.BlazeWidgetItemImageContainerBorderStateStyle;
import com.blaze.blazesdk.style.widgets.BlazeWidgetItemImageContainerBorderStyle;
import com.blaze.blazesdk.style.widgets.BlazeWidgetItemImageGradientOverlayStyle;
import com.blaze.blazesdk.style.widgets.BlazeWidgetItemImageStyle;
import com.blaze.blazesdk.style.widgets.BlazeWidgetItemStatusIndicatorStateStyle;
import com.blaze.blazesdk.style.widgets.BlazeWidgetItemStatusIndicatorStyle;
import com.blaze.blazesdk.style.widgets.BlazeWidgetItemStyle;
import com.blaze.blazesdk.style.widgets.BlazeWidgetItemTextStyle;
import com.blaze.blazesdk.style.widgets.BlazeWidgetItemTitleStyle;
import com.blaze.blazesdk.style.widgets.BlazeWidgetLayout;
import com.blaze.blazesdk.widgets.models.AdvancedOrderTypeRemoteDto;
import com.blaze.blazesdk.widgets.models.DataSourceRemoteDto;
import com.blaze.blazesdk.widgets.models.IdsDataSourceRemoteDto;
import com.blaze.blazesdk.widgets.models.InsetsRemoteDto;
import com.blaze.blazesdk.widgets.models.LabelsDataSourceRemoteDto;
import com.blaze.blazesdk.widgets.models.ObjectPositioningRemoteDto;
import com.blaze.blazesdk.widgets.models.OrderTypeRemoteDto;
import com.blaze.blazesdk.widgets.models.OverridableValueRemoteDto;
import com.blaze.blazesdk.widgets.models.RecommendationsDataSourceRemoteDto;
import com.blaze.blazesdk.widgets.models.WidgetItemBadgeStateStyleRemoteDto;
import com.blaze.blazesdk.widgets.models.WidgetItemBadgeStyleRemoteDto;
import com.blaze.blazesdk.widgets.models.WidgetItemImageContainerBorderStateStyleRemoteDto;
import com.blaze.blazesdk.widgets.models.WidgetItemImageContainerBorderStyleRemoteDto;
import com.blaze.blazesdk.widgets.models.WidgetItemImageGradientOverlayStyleRemoteDto;
import com.blaze.blazesdk.widgets.models.WidgetItemImageStyleRemoteDto;
import com.blaze.blazesdk.widgets.models.WidgetItemStatusIndicatorStateStyleRemoteDto;
import com.blaze.blazesdk.widgets.models.WidgetItemStatusIndicatorStyleRemoteDto;
import com.blaze.blazesdk.widgets.models.WidgetItemStyleRemoteDto;
import com.blaze.blazesdk.widgets.models.WidgetItemTextStyleRemoteDto;
import com.blaze.blazesdk.widgets.models.WidgetItemTitleStyleRemoteDto;
import com.blaze.blazesdk.widgets.models.WidgetLayoutRemoteDto;
import com.blaze.blazesdk.widgets.models.WidgetRemoteConfigRemoteResponse;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.a;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class k5m {
    public static final k5m a = new k5m();
    public static final HashMap b = new HashMap();

    public static BlazeDataSourceType a(DataSourceRemoteDto dataSourceRemoteDto, BlazeDataSourceType blazeDataSourceType) {
        BlazeOrderType blazeOrderType;
        BlazeOrderType blazeOrderType2;
        BlazeOrderType blazeOrderType3;
        BlazeDataSourceType.Recommendations recommendations;
        if (!(blazeDataSourceType instanceof BlazeDataSourceType.RemoteConfig)) {
            return blazeDataSourceType;
        }
        if (dataSourceRemoteDto != null) {
            BlazeDataSourceType blazeDataSourceType2 = null;
            BlazeAdvancedOrderType.LiveFirst liveFirst = null;
            BlazeAdvancedOrderType.LiveFirst liveFirst2 = null;
            if (dataSourceRemoteDto.getRecommendationsDataSource() != null) {
                RecommendationsDataSourceRemoteDto recommendationsDataSource = dataSourceRemoteDto.getRecommendationsDataSource();
                recommendationsDataSource.getClass();
                int i = mdm.a[recommendationsDataSource.ordinal()];
                if (i == 1) {
                    recommendations = new BlazeDataSourceType.Recommendations(new BlazeRecommendationsType.Trending(null, 1, null));
                } else {
                    if (i != 2) {
                        zzl.b();
                        return null;
                    }
                    recommendations = new BlazeDataSourceType.Recommendations(new BlazeRecommendationsType.ForYou(null, null, 3, null));
                }
                blazeDataSourceType2 = recommendations;
            } else if (dataSourceRemoteDto.getLabelsDataSource() != null) {
                LabelsDataSourceRemoteDto labelsDataSource = dataSourceRemoteDto.getLabelsDataSource();
                labelsDataSource.getClass();
                BlazeWidgetLabel.Companion companion = BlazeWidgetLabel.INSTANCE;
                BlazeWidgetLabel singleLabel = companion.singleLabel(labelsDataSource.getLabelsFilterExpression());
                List c = labelsDataSource.getLabelsPriority() != null ? a.c(companion.singleLabel(iii.D(1, iii.C(1, labelsDataSource.getLabelsPriority())))) : null;
                OrderTypeRemoteDto orderType = labelsDataSource.getOrderType();
                if (orderType != null) {
                    switch (zam.a[orderType.ordinal()]) {
                        case 1:
                            blazeOrderType3 = BlazeOrderType.MANUAL;
                            break;
                        case 2:
                            blazeOrderType3 = BlazeOrderType.RECENTLY_UPDATED_FIRST;
                            break;
                        case 3:
                            blazeOrderType3 = BlazeOrderType.RECENTLY_UPDATED_LAST;
                            break;
                        case 4:
                            blazeOrderType3 = BlazeOrderType.A_TO_Z;
                            break;
                        case 5:
                            blazeOrderType3 = BlazeOrderType.Z_TO_A;
                            break;
                        case 6:
                            blazeOrderType3 = BlazeOrderType.RECENTLY_CREATED_FIRST;
                            break;
                        case 7:
                            blazeOrderType3 = BlazeOrderType.RECENTLY_CREATED_LAST;
                            break;
                        case 8:
                            blazeOrderType3 = BlazeOrderType.RANDOM;
                            break;
                        default:
                            zzl.b();
                            return null;
                    }
                    blazeOrderType2 = blazeOrderType3;
                } else {
                    blazeOrderType2 = null;
                }
                AdvancedOrderTypeRemoteDto advancedOrderType = labelsDataSource.getAdvancedOrderType();
                if (advancedOrderType != null) {
                    if (vpl.a[advancedOrderType.ordinal()] != 1) {
                        zzl.b();
                        return null;
                    }
                    liveFirst = BlazeAdvancedOrderType.LiveFirst.INSTANCE;
                }
                blazeDataSourceType2 = new BlazeDataSourceType.Labels(singleLabel, c, blazeOrderType2, liveFirst, labelsDataSource.getMaxItems(), null, 32, null);
            } else if (dataSourceRemoteDto.getIdsDataSource() != null) {
                IdsDataSourceRemoteDto idsDataSource = dataSourceRemoteDto.getIdsDataSource();
                idsDataSource.getClass();
                List<String> contentIds = idsDataSource.getContentIds();
                OrderTypeRemoteDto orderType2 = idsDataSource.getOrderType();
                if (orderType2 != null) {
                    switch (zam.a[orderType2.ordinal()]) {
                        case 1:
                            blazeOrderType = BlazeOrderType.MANUAL;
                            break;
                        case 2:
                            blazeOrderType = BlazeOrderType.RECENTLY_UPDATED_FIRST;
                            break;
                        case 3:
                            blazeOrderType = BlazeOrderType.RECENTLY_UPDATED_LAST;
                            break;
                        case 4:
                            blazeOrderType = BlazeOrderType.A_TO_Z;
                            break;
                        case 5:
                            blazeOrderType = BlazeOrderType.Z_TO_A;
                            break;
                        case 6:
                            blazeOrderType = BlazeOrderType.RECENTLY_CREATED_FIRST;
                            break;
                        case 7:
                            blazeOrderType = BlazeOrderType.RECENTLY_CREATED_LAST;
                            break;
                        case 8:
                            blazeOrderType = BlazeOrderType.RANDOM;
                            break;
                        default:
                            zzl.b();
                            return null;
                    }
                } else {
                    blazeOrderType = null;
                }
                AdvancedOrderTypeRemoteDto advancedOrderType2 = idsDataSource.getAdvancedOrderType();
                if (advancedOrderType2 != null) {
                    if (vpl.a[advancedOrderType2.ordinal()] != 1) {
                        zzl.b();
                        return null;
                    }
                    liveFirst2 = BlazeAdvancedOrderType.LiveFirst.INSTANCE;
                }
                blazeDataSourceType2 = new BlazeDataSourceType.Ids(contentIds, blazeOrderType, liveFirst2);
            }
            if (blazeDataSourceType2 != null) {
                return blazeDataSourceType2;
            }
        }
        return ((BlazeDataSourceType.RemoteConfig) blazeDataSourceType).getFallbackDataSourceType();
    }

    /* JADX WARN: Removed duplicated region for block: B:153:0x034a  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x036a  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x038d  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0417  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x0380  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01ee  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static BlazeWidgetLayout b(Map map, BlazeWidgetLayout blazeWidgetLayout) {
        WidgetLayoutRemoteDto widgetLayoutRemoteDto;
        BlazeWidgetItemStyle widgetItemStyle;
        BlazeWidgetItemTitleStyle title;
        BlazeWidgetItemStatusIndicatorStyle statusIndicator;
        int backgroundColor;
        InsetsRemoteDto paddings;
        WidgetItemImageStyleRemoteDto image;
        BlazeWidgetItemImageStyle image2;
        WidgetItemBadgeStyleRemoteDto badge;
        BlazeWidgetItemBadgeStyle badge2;
        BlazeWidgetItemImageStyle.BlazeImagePosition position;
        BlazeWidgetItemImageContainerBorderStyle border;
        BlazeWidgetItemImageStyle.BlazeThumbnailType thumbnailType;
        BlazeWidgetItemImageGradientOverlayStyle gradientOverlay;
        int startColor;
        String endColor;
        int endColor2;
        WidgetItemImageGradientOverlayStyleRemoteDto.BlazeGradientPositionDto position2;
        if (map != null && (widgetLayoutRemoteDto = (WidgetLayoutRemoteDto) map.get(WidgetRemoteConfigRemoteResponse.DEFAULT_LAYOUT_KEY)) != null) {
            blazeWidgetLayout.getClass();
            OverridableValueRemoteDto<Integer> maxDisplayItemsCount = widgetLayoutRemoteDto.getMaxDisplayItemsCount();
            if (maxDisplayItemsCount != null) {
                blazeWidgetLayout.setMaxDisplayItemsCount(maxDisplayItemsCount.getValue());
            }
            Integer horizontalItemsSpacing = widgetLayoutRemoteDto.getHorizontalItemsSpacing();
            blazeWidgetLayout.setHorizontalItemsSpacing(horizontalItemsSpacing != null ? new BlazeDp(horizontalItemsSpacing.intValue()) : blazeWidgetLayout.getHorizontalItemsSpacing());
            Integer verticalItemsSpacing = widgetLayoutRemoteDto.getVerticalItemsSpacing();
            blazeWidgetLayout.setVerticalItemsSpacing(verticalItemsSpacing != null ? new BlazeDp(verticalItemsSpacing.intValue()) : blazeWidgetLayout.getVerticalItemsSpacing());
            Float itemRatio = widgetLayoutRemoteDto.getItemRatio();
            blazeWidgetLayout.setItemRatio(itemRatio != null ? itemRatio.floatValue() : blazeWidgetLayout.getItemRatio());
            InsetsRemoteDto margins = widgetLayoutRemoteDto.getMargins();
            BlazeInsets margins2 = blazeWidgetLayout.getMargins();
            if (margins != null) {
                d7a.o(margins, margins2);
            }
            blazeWidgetLayout.setMargins(margins2);
            Integer columns = widgetLayoutRemoteDto.getColumns();
            blazeWidgetLayout.setColumns(columns != null ? columns.intValue() : blazeWidgetLayout.getColumns());
            WidgetItemStyleRemoteDto widgetItemStyle2 = widgetLayoutRemoteDto.getWidgetItemStyle();
            if (widgetItemStyle2 != null) {
                widgetItemStyle = blazeWidgetLayout.getWidgetItemStyle();
                widgetItemStyle.getClass();
                OverridableValueRemoteDto<Float> cornerRadiusRatio = widgetItemStyle2.getCornerRadiusRatio();
                if (cornerRadiusRatio != null) {
                    widgetItemStyle.setCornerRadiusRatio(cornerRadiusRatio.getValue());
                }
                WidgetItemTitleStyleRemoteDto title2 = widgetItemStyle2.getTitle();
                if (title2 != null) {
                    title = widgetItemStyle.getTitle();
                    title.getClass();
                    Boolean isVisible = title2.isVisible();
                    title.setVisible(isVisible != null ? isVisible.booleanValue() : title.isVisible());
                    ObjectPositioningRemoteDto position3 = title2.getPosition();
                    BlazeObjectPositioning position4 = title.getPosition();
                    if (position3 != null) {
                        v8a.h(position3, position4);
                    }
                    title.setPosition(position4);
                    InsetsRemoteDto margins3 = title2.getMargins();
                    BlazeInsets margins4 = title.getMargins();
                    if (margins3 != null) {
                        d7a.o(margins3, margins4);
                    }
                    title.setMargins(margins4);
                    WidgetItemTextStyleRemoteDto unreadState = title2.getUnreadState();
                    BlazeWidgetItemTextStyle unreadState2 = title.getUnreadState();
                    if (unreadState != null) {
                        bea.l(unreadState, unreadState2);
                    }
                    title.setUnreadState(unreadState2);
                    WidgetItemTextStyleRemoteDto readState = title2.getReadState();
                    BlazeWidgetItemTextStyle readState2 = title.getReadState();
                    if (readState != null) {
                        bea.l(readState, readState2);
                    }
                    title.setReadState(readState2);
                } else {
                    title = widgetItemStyle.getTitle();
                }
                widgetItemStyle.setTitle(title);
                WidgetItemStatusIndicatorStyleRemoteDto statusIndicator2 = widgetItemStyle2.getStatusIndicator();
                if (statusIndicator2 != null) {
                    statusIndicator = widgetItemStyle.getStatusIndicator();
                    statusIndicator.getClass();
                    ObjectPositioningRemoteDto position5 = statusIndicator2.getPosition();
                    BlazeObjectPositioning position6 = statusIndicator.getPosition();
                    if (position5 != null) {
                        v8a.h(position5, position6);
                    }
                    statusIndicator.setPosition(position6);
                    Boolean isVisible2 = statusIndicator2.isVisible();
                    statusIndicator.setVisible(isVisible2 != null ? isVisible2.booleanValue() : statusIndicator.isVisible());
                    InsetsRemoteDto margins5 = statusIndicator2.getMargins();
                    BlazeInsets margins6 = statusIndicator.getMargins();
                    if (margins5 != null) {
                        d7a.o(margins5, margins6);
                    }
                    statusIndicator.setMargins(margins6);
                    InsetsRemoteDto statusTitlePadding = statusIndicator2.getStatusTitlePadding();
                    BlazeInsets padding = statusIndicator.getPadding();
                    if (statusTitlePadding != null) {
                        d7a.o(statusTitlePadding, padding);
                    }
                    statusIndicator.setPadding(padding);
                    WidgetItemStatusIndicatorStateStyleRemoteDto liveUnreadState = statusIndicator2.getLiveUnreadState();
                    BlazeWidgetItemStatusIndicatorStateStyle liveUnreadState2 = statusIndicator.getLiveUnreadState();
                    if (liveUnreadState != null) {
                        kda.l(liveUnreadState, liveUnreadState2);
                    }
                    statusIndicator.setLiveUnreadState(liveUnreadState2);
                    WidgetItemStatusIndicatorStateStyleRemoteDto liveReadState = statusIndicator2.getLiveReadState();
                    BlazeWidgetItemStatusIndicatorStateStyle liveReadState2 = statusIndicator.getLiveReadState();
                    if (liveReadState != null) {
                        kda.l(liveReadState, liveReadState2);
                    }
                    statusIndicator.setLiveReadState(liveReadState2);
                    WidgetItemStatusIndicatorStateStyleRemoteDto unreadState3 = statusIndicator2.getUnreadState();
                    BlazeWidgetItemStatusIndicatorStateStyle unreadState4 = statusIndicator.getUnreadState();
                    if (unreadState3 != null) {
                        kda.l(unreadState3, unreadState4);
                    }
                    statusIndicator.setUnreadState(unreadState4);
                    WidgetItemStatusIndicatorStateStyleRemoteDto readState3 = statusIndicator2.getReadState();
                    BlazeWidgetItemStatusIndicatorStateStyle readState4 = statusIndicator.getReadState();
                    if (readState3 != null) {
                        kda.l(readState3, readState4);
                    }
                    statusIndicator.setReadState(readState4);
                } else {
                    statusIndicator = widgetItemStyle.getStatusIndicator();
                }
                widgetItemStyle.setStatusIndicator(statusIndicator);
                String backgroundColor2 = widgetItemStyle2.getBackgroundColor();
                if (backgroundColor2 != null) {
                    Application application$blazesdk_release = BlazeSDK.INSTANCE.getApplication$blazesdk_release();
                    Integer b2 = application$blazesdk_release != null ? cnb.b(application$blazesdk_release, backgroundColor2) : null;
                    if (b2 != null) {
                        backgroundColor = b2.intValue();
                        widgetItemStyle.setBackgroundColor(backgroundColor);
                        paddings = widgetItemStyle2.getPaddings();
                        BlazeInsets padding2 = widgetItemStyle.getPadding();
                        if (paddings != null) {
                            d7a.o(paddings, padding2);
                        }
                        widgetItemStyle.setPadding(padding2);
                        Float cornerRadius = widgetItemStyle2.getCornerRadius();
                        widgetItemStyle.setCornerRadius(cornerRadius == null ? new BlazeDp(wzb.b(cornerRadius.floatValue())) : widgetItemStyle.getCornerRadius());
                        image = widgetItemStyle2.getImage();
                        if (image == null) {
                            image2 = widgetItemStyle.getImage();
                            image2.getClass();
                            OverridableValueRemoteDto<Integer> width = image.getWidth();
                            if (width != null) {
                                Integer value = width.getValue();
                                image2.setWidth(value != null ? new BlazeDp(value.intValue()) : null);
                            }
                            OverridableValueRemoteDto<Integer> height = image.getHeight();
                            if (height != null) {
                                Integer value2 = height.getValue();
                                image2.setHeight(value2 != null ? new BlazeDp(value2.intValue()) : null);
                            }
                            OverridableValueRemoteDto<Float> ratio = image.getRatio();
                            if (ratio != null) {
                                image2.setRatio(ratio.getValue());
                            }
                            OverridableValueRemoteDto<Float> cornerRadiusRatio2 = image.getCornerRadiusRatio();
                            if (cornerRadiusRatio2 != null) {
                                image2.setCornerRadiusRatio(cornerRadiusRatio2.getValue());
                            }
                            WidgetItemImageStyleRemoteDto.BlazeWidgetPositionDto position7 = image.getPosition();
                            if (position7 == null || (position = image.toBlazeImagePosition$blazesdk_release(position7)) == null) {
                                position = image2.getPosition();
                            }
                            image2.setPosition(position);
                            WidgetItemImageContainerBorderStyleRemoteDto border2 = image.getBorder();
                            if (border2 != null) {
                                border = image2.getBorder();
                                border.getClass();
                                Boolean isVisible3 = border2.isVisible();
                                border.setVisible(isVisible3 != null ? isVisible3.booleanValue() : border.isVisible());
                                WidgetItemImageContainerBorderStateStyleRemoteDto liveUnreadState3 = border2.getLiveUnreadState();
                                BlazeWidgetItemImageContainerBorderStateStyle liveUnreadState4 = border.getLiveUnreadState();
                                if (liveUnreadState3 != null) {
                                    tba.g(liveUnreadState3, liveUnreadState4);
                                }
                                border.setLiveUnreadState(liveUnreadState4);
                                WidgetItemImageContainerBorderStateStyleRemoteDto liveReadState3 = border2.getLiveReadState();
                                BlazeWidgetItemImageContainerBorderStateStyle liveReadState4 = border.getLiveReadState();
                                if (liveReadState3 != null) {
                                    tba.g(liveReadState3, liveReadState4);
                                }
                                border.setLiveReadState(liveReadState4);
                                WidgetItemImageContainerBorderStateStyleRemoteDto readState5 = border2.getReadState();
                                BlazeWidgetItemImageContainerBorderStateStyle readState6 = border.getReadState();
                                if (readState5 != null) {
                                    tba.g(readState5, readState6);
                                }
                                border.setReadState(readState6);
                                WidgetItemImageContainerBorderStateStyleRemoteDto unreadState5 = border2.getUnreadState();
                                BlazeWidgetItemImageContainerBorderStateStyle unreadState6 = border.getUnreadState();
                                if (unreadState5 != null) {
                                    tba.g(unreadState5, unreadState6);
                                }
                                border.setUnreadState(unreadState6);
                            } else {
                                border = image2.getBorder();
                            }
                            image2.setBorder(border);
                            WidgetItemImageStyleRemoteDto.BlazeThumbnailTypeDto thumbnailType2 = image.getThumbnailType();
                            if (thumbnailType2 == null || (thumbnailType = image.toBlazeThumbnailType$blazesdk_release(thumbnailType2)) == null) {
                                thumbnailType = image2.getThumbnailType();
                            }
                            image2.setThumbnailType(thumbnailType);
                            Float cornerRadius2 = image.getCornerRadius();
                            image2.setCornerRadius(cornerRadius2 != null ? new BlazeDp(wzb.b(cornerRadius2.floatValue())) : image2.getCornerRadius());
                            InsetsRemoteDto margins7 = image.getMargins();
                            BlazeInsets margins8 = image2.getMargins();
                            if (margins7 != null) {
                                d7a.o(margins7, margins8);
                            }
                            image2.setMargins(margins8);
                            WidgetItemImageGradientOverlayStyleRemoteDto gradientOverlay2 = image.getGradientOverlay();
                            if (gradientOverlay2 != null) {
                                gradientOverlay = image2.getGradientOverlay();
                                gradientOverlay.getClass();
                                Boolean isVisible4 = gradientOverlay2.isVisible();
                                gradientOverlay.setVisible(isVisible4 != null ? isVisible4.booleanValue() : gradientOverlay.isVisible());
                                String startColor2 = gradientOverlay2.getStartColor();
                                if (startColor2 != null) {
                                    Application application$blazesdk_release2 = BlazeSDK.INSTANCE.getApplication$blazesdk_release();
                                    Integer b3 = application$blazesdk_release2 != null ? cnb.b(application$blazesdk_release2, startColor2) : null;
                                    if (b3 != null) {
                                        startColor = b3.intValue();
                                        gradientOverlay.setStartColor(startColor);
                                        endColor = gradientOverlay2.getEndColor();
                                        if (endColor != null) {
                                            Application application$blazesdk_release3 = BlazeSDK.INSTANCE.getApplication$blazesdk_release();
                                            Integer b4 = application$blazesdk_release3 != null ? cnb.b(application$blazesdk_release3, endColor) : null;
                                            if (b4 != null) {
                                                endColor2 = b4.intValue();
                                                gradientOverlay.setEndColor(endColor2);
                                                position2 = gradientOverlay2.getPosition();
                                                if (position2 != null || (r1 = gradientOverlay2.toBlazeGradientPosition$blazesdk_release(position2)) == null) {
                                                    BlazeWidgetItemImageGradientOverlayStyle.BlazeGradientPosition position8 = gradientOverlay.getPosition();
                                                }
                                                gradientOverlay.setPosition(position8);
                                            }
                                        }
                                        endColor2 = gradientOverlay.getEndColor();
                                        gradientOverlay.setEndColor(endColor2);
                                        position2 = gradientOverlay2.getPosition();
                                        if (position2 != null) {
                                        }
                                        BlazeWidgetItemImageGradientOverlayStyle.BlazeGradientPosition position82 = gradientOverlay.getPosition();
                                        gradientOverlay.setPosition(position82);
                                    }
                                }
                                startColor = gradientOverlay.getStartColor();
                                gradientOverlay.setStartColor(startColor);
                                endColor = gradientOverlay2.getEndColor();
                                if (endColor != null) {
                                }
                                endColor2 = gradientOverlay.getEndColor();
                                gradientOverlay.setEndColor(endColor2);
                                position2 = gradientOverlay2.getPosition();
                                if (position2 != null) {
                                }
                                BlazeWidgetItemImageGradientOverlayStyle.BlazeGradientPosition position822 = gradientOverlay.getPosition();
                                gradientOverlay.setPosition(position822);
                            } else {
                                gradientOverlay = image2.getGradientOverlay();
                            }
                            image2.setGradientOverlay(gradientOverlay);
                        } else {
                            image2 = widgetItemStyle.getImage();
                        }
                        widgetItemStyle.setImage(image2);
                        badge = widgetItemStyle2.getBadge();
                        if (badge == null) {
                            badge2 = widgetItemStyle.getBadge();
                            badge2.getClass();
                            Boolean isVisible5 = badge.isVisible();
                            badge2.setVisible(isVisible5 != null ? isVisible5.booleanValue() : badge2.isVisible());
                            ObjectPositioningRemoteDto position9 = badge.getPosition();
                            BlazeObjectPositioning position10 = badge2.getPosition();
                            if (position9 != null) {
                                v8a.h(position9, position10);
                            }
                            badge2.setPosition(position10);
                            InsetsRemoteDto margins9 = badge.getMargins();
                            BlazeInsets margins10 = badge2.getMargins();
                            if (margins9 != null) {
                                d7a.o(margins9, margins10);
                            }
                            badge2.setMargins(margins10);
                            InsetsRemoteDto insets = badge.getInsets();
                            BlazeInsets padding3 = badge2.getPadding();
                            if (insets != null) {
                                d7a.o(insets, padding3);
                            }
                            badge2.setPadding(padding3);
                            WidgetItemBadgeStateStyleRemoteDto liveUnreadState5 = badge.getLiveUnreadState();
                            BlazeWidgetItemBadgeStateStyle liveUnreadState6 = badge2.getLiveUnreadState();
                            if (liveUnreadState5 != null) {
                                aba.s(liveUnreadState5, liveUnreadState6);
                            }
                            badge2.setLiveUnreadState(liveUnreadState6);
                            WidgetItemBadgeStateStyleRemoteDto liveReadState5 = badge.getLiveReadState();
                            BlazeWidgetItemBadgeStateStyle liveReadState6 = badge2.getLiveReadState();
                            if (liveReadState5 != null) {
                                aba.s(liveReadState5, liveReadState6);
                            }
                            badge2.setLiveReadState(liveReadState6);
                            WidgetItemBadgeStateStyleRemoteDto unreadState7 = badge.getUnreadState();
                            BlazeWidgetItemBadgeStateStyle unreadState8 = badge2.getUnreadState();
                            if (unreadState7 != null) {
                                aba.s(unreadState7, unreadState8);
                            }
                            badge2.setUnreadState(unreadState8);
                            WidgetItemBadgeStateStyleRemoteDto readState7 = badge.getReadState();
                            BlazeWidgetItemBadgeStateStyle readState8 = badge2.getReadState();
                            if (readState7 != null) {
                                aba.s(readState7, readState8);
                            }
                            badge2.setReadState(readState8);
                        } else {
                            badge2 = widgetItemStyle.getBadge();
                        }
                        widgetItemStyle.setBadge(badge2);
                    }
                }
                backgroundColor = widgetItemStyle.getBackgroundColor();
                widgetItemStyle.setBackgroundColor(backgroundColor);
                paddings = widgetItemStyle2.getPaddings();
                BlazeInsets padding22 = widgetItemStyle.getPadding();
                if (paddings != null) {
                }
                widgetItemStyle.setPadding(padding22);
                Float cornerRadius3 = widgetItemStyle2.getCornerRadius();
                widgetItemStyle.setCornerRadius(cornerRadius3 == null ? new BlazeDp(wzb.b(cornerRadius3.floatValue())) : widgetItemStyle.getCornerRadius());
                image = widgetItemStyle2.getImage();
                if (image == null) {
                }
                widgetItemStyle.setImage(image2);
                badge = widgetItemStyle2.getBadge();
                if (badge == null) {
                }
                widgetItemStyle.setBadge(badge2);
            } else {
                widgetItemStyle = blazeWidgetLayout.getWidgetItemStyle();
            }
            blazeWidgetLayout.setWidgetItemStyle(widgetItemStyle);
        }
        return blazeWidgetLayout;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(sq3 sq3Var) {
        y1m y1mVar;
        int i;
        Iterator it;
        if (sq3Var instanceof y1m) {
            y1mVar = (y1m) sq3Var;
            int i2 = y1mVar.u;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                y1mVar.u = i2 - Integer.MIN_VALUE;
                y1m y1mVar2 = y1mVar;
                Object obj = y1mVar2.s;
                lu3 lu3Var = lu3.a;
                i = y1mVar2.u;
                if (i != 0) {
                    y6a.M(obj);
                    it = b.entrySet().iterator();
                } else {
                    if (i != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    it = y1mVar2.r;
                    y6a.M(obj);
                }
                while (it.hasNext()) {
                    Map.Entry entry = (Map.Entry) it.next();
                    String str = (String) entry.getKey();
                    String str2 = ((xxm) entry.getValue()).a.a;
                    BlazeWidgetLayout blazeWidgetLayout = ((xxm) entry.getValue()).b.a;
                    BlazeDataSourceType blazeDataSourceType = ((xxm) entry.getValue()).b.b;
                    y1mVar2.r = it;
                    y1mVar2.u = 1;
                    if (a.d(str, str2, blazeWidgetLayout, blazeDataSourceType, y1mVar2) == lu3Var) {
                        return lu3Var;
                    }
                }
                return Unit.a;
            }
        }
        y1mVar = new y1m(this, sq3Var);
        y1m y1mVar22 = y1mVar;
        Object obj2 = y1mVar22.s;
        lu3 lu3Var2 = lu3.a;
        i = y1mVar22.u;
        if (i != 0) {
        }
        while (it.hasNext()) {
        }
        return Unit.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00be A[Catch: all -> 0x0037, TryCatch #0 {all -> 0x0037, blocks: (B:12:0x0032, B:13:0x00b8, B:15:0x00be, B:17:0x00c8, B:19:0x00cf, B:20:0x00d5, B:26:0x00e0, B:33:0x00fc, B:35:0x0100, B:37:0x0122, B:39:0x012e, B:41:0x0146, B:42:0x014b, B:46:0x0044, B:48:0x0048, B:50:0x004c, B:52:0x0052, B:54:0x005c, B:56:0x0063, B:57:0x0069, B:63:0x0074, B:65:0x008f, B:71:0x009b), top: B:8:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00fc A[Catch: all -> 0x0037, TryCatch #0 {all -> 0x0037, blocks: (B:12:0x0032, B:13:0x00b8, B:15:0x00be, B:17:0x00c8, B:19:0x00cf, B:20:0x00d5, B:26:0x00e0, B:33:0x00fc, B:35:0x0100, B:37:0x0122, B:39:0x012e, B:41:0x0146, B:42:0x014b, B:46:0x0044, B:48:0x0048, B:50:0x004c, B:52:0x0052, B:54:0x005c, B:56:0x0063, B:57:0x0069, B:63:0x0074, B:65:0x008f, B:71:0x009b), top: B:8:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0041  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(String str, String str2, BlazeWidgetLayout blazeWidgetLayout, BlazeDataSourceType blazeDataSourceType, sq3 sq3Var) {
        wpl wplVar;
        int i;
        qbm qbmVar;
        uul uulVar;
        a9m a9mVar;
        try {
            if (sq3Var instanceof wpl) {
                wplVar = (wpl) sq3Var;
                int i2 = wplVar.y;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    wplVar.y = i2 - Integer.MIN_VALUE;
                    wpl wplVar2 = wplVar;
                    Object obj = wplVar2.w;
                    lu3 lu3Var = lu3.a;
                    i = wplVar2.y;
                    HashMap hashMap = b;
                    qbm qbmVar2 = null;
                    if (i != 0) {
                        y6a.M(obj);
                        tul tulVar = jdm.d;
                        if (!((tulVar == null || (uulVar = tulVar.a) == null) ? false : uulVar.k)) {
                            evl.m(this);
                            blazeDataSourceType.getClass();
                            BlazeDataSourceType.RemoteConfig remoteConfig = blazeDataSourceType instanceof BlazeDataSourceType.RemoteConfig ? (BlazeDataSourceType.RemoteConfig) blazeDataSourceType : null;
                            BlazeDataSourceType fallbackDataSourceType = remoteConfig != null ? remoteConfig.getFallbackDataSourceType() : null;
                            boolean z = blazeDataSourceType instanceof BlazeDataSourceType.RemoteConfig;
                            if (fallbackDataSourceType == null) {
                                fallbackDataSourceType = !z ? blazeDataSourceType : null;
                            }
                            if (fallbackDataSourceType != null) {
                                xxm xxmVar = new xxm(new qym(str2, blazeDataSourceType), new jzm(blazeWidgetLayout, fallbackDataSourceType));
                                hashMap.put(str, xxmVar);
                                qbmVar = new qbm(xxmVar);
                            } else {
                                qbmVar = null;
                            }
                            return qbmVar == null ? new fym(null, null, null, 7, null) : qbmVar;
                        }
                        rwl rwlVar = rwl.a;
                        ayl aylVar = new ayl(str2, null);
                        wplVar2.r = this;
                        wplVar2.s = str;
                        wplVar2.t = str2;
                        wplVar2.u = blazeWidgetLayout;
                        wplVar2.v = blazeDataSourceType;
                        wplVar2.y = 1;
                        obj = rwl.safeApiCall$default(rwlVar, false, aylVar, wplVar2, 1, null);
                        if (obj == lu3Var) {
                            return lu3Var;
                        }
                    } else {
                        if (i != 1) {
                            a70.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        blazeDataSourceType = wplVar2.v;
                        blazeWidgetLayout = wplVar2.u;
                        str2 = wplVar2.t;
                        str = wplVar2.s;
                        this = wplVar2.r;
                        y6a.M(obj);
                    }
                    a9mVar = (a9m) obj;
                    if (a9mVar instanceof a6m) {
                        if (!(a9mVar instanceof qbm)) {
                            throw new ndd();
                        }
                        Map<String, WidgetLayoutRemoteDto> themeLayoutsMap = ((WidgetRemoteConfigRemoteResponse) ((qbm) a9mVar).a).getThemeLayoutsMap();
                        this.getClass();
                        BlazeWidgetLayout b2 = b(themeLayoutsMap, blazeWidgetLayout);
                        BlazeDataSourceType a2 = a(((WidgetRemoteConfigRemoteResponse) ((qbm) a9mVar).a).getDataSource(), blazeDataSourceType);
                        if (a2 == null) {
                            return new upm(null, "Invalid remote data source and no valid fallback data source found.", null, 5, null);
                        }
                        xxm xxmVar2 = new xxm(new qym(str2, blazeDataSourceType), new jzm(b2, a2));
                        hashMap.put(str, xxmVar2);
                        return new qbm(xxmVar2);
                    }
                    evl.m(this);
                    blazeDataSourceType.getClass();
                    BlazeDataSourceType.RemoteConfig remoteConfig2 = blazeDataSourceType instanceof BlazeDataSourceType.RemoteConfig ? (BlazeDataSourceType.RemoteConfig) blazeDataSourceType : null;
                    BlazeDataSourceType fallbackDataSourceType2 = remoteConfig2 != null ? remoteConfig2.getFallbackDataSourceType() : null;
                    boolean z2 = blazeDataSourceType instanceof BlazeDataSourceType.RemoteConfig;
                    if (fallbackDataSourceType2 == null) {
                        fallbackDataSourceType2 = !z2 ? blazeDataSourceType : null;
                    }
                    if (fallbackDataSourceType2 != null) {
                        xxm xxmVar3 = new xxm(new qym(str2, blazeDataSourceType), new jzm(blazeWidgetLayout, fallbackDataSourceType2));
                        hashMap.put(str, xxmVar3);
                        qbmVar2 = new qbm(xxmVar3);
                    }
                    return qbmVar2 == null ? a9mVar : qbmVar2;
                }
            }
            if (i != 0) {
            }
            a9mVar = (a9m) obj;
            if (a9mVar instanceof a6m) {
            }
        } catch (Throwable th) {
            BlazeSDK.INSTANCE.getGlobalThrowableCatcher$blazesdk_release().invoke(th, null);
            return new bx0(null, null, null, 7, null);
        }
        wplVar = new wpl(this, sq3Var);
        wpl wplVar22 = wplVar;
        Object obj2 = wplVar22.w;
        lu3 lu3Var2 = lu3.a;
        i = wplVar22.y;
        HashMap hashMap2 = b;
        qbm qbmVar22 = null;
    }
}
