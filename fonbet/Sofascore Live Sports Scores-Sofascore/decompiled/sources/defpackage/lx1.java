package defpackage;

import com.blaze.blazesdk.analytics.enums.ContentType;
import com.blaze.blazesdk.analytics.enums.EventActionName;
import com.blaze.blazesdk.analytics.enums.EventCategoryType;
import com.blaze.blazesdk.analytics.enums.ThumbnailType;
import com.blaze.blazesdk.analytics.enums.WidgetType;
import com.blaze.blazesdk.analytics.props.AnalyticsPropsReferring;
import com.blaze.blazesdk.analytics.props.AnalyticsPropsWidget;
import com.blaze.blazesdk.widgets.ui.BlazeBaseWidget;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final /* synthetic */ class lx1 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ BlazeBaseWidget b;

    public /* synthetic */ lx1(BlazeBaseWidget blazeBaseWidget, int i) {
        this.a = i;
        this.b = blazeBaseWidget;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        final BlazeBaseWidget blazeBaseWidget = this.b;
        switch (i) {
            case 0:
                int i2 = BlazeBaseWidget.q;
                blazeBaseWidget.i();
                return Unit.a;
            case 1:
                int i3 = BlazeBaseWidget.q;
                blazeBaseWidget.getViewModel().l();
                return Unit.a;
            case 2:
                int i4 = BlazeBaseWidget.q;
                blazeBaseWidget.j();
                return new jul(blazeBaseWidget.getContainerSizeProviderForAdapter(), blazeBaseWidget.getWidgetLayout(), blazeBaseWidget.getPerItemStyleOverrides(), new t21(blazeBaseWidget, 27), new ft8() { // from class: kx1
                    @Override // defpackage.ft8
                    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
                        List list;
                        int intValue = ((Integer) obj).intValue();
                        int intValue2 = ((Integer) obj2).intValue();
                        int intValue3 = ((Integer) obj4).intValue();
                        int intValue4 = ((Integer) obj5).intValue();
                        int i5 = BlazeBaseWidget.q;
                        StringBuilder sb = new StringBuilder();
                        sb.append(intValue);
                        sb.append('X');
                        sb.append(intValue2);
                        String sb2 = sb.toString();
                        BlazeBaseWidget blazeBaseWidget2 = BlazeBaseWidget.this;
                        blazeBaseWidget2.thumbnailSize = sb2;
                        blazeBaseWidget2.thumbnailAspectRatio = String.valueOf((Float) obj3);
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(intValue3);
                        sb3.append('X');
                        sb3.append(intValue4);
                        blazeBaseWidget2.widgetSize = sb3.toString();
                        cql viewModel = blazeBaseWidget2.getViewModel();
                        String str = blazeBaseWidget2.thumbnailSize;
                        String str2 = blazeBaseWidget2.thumbnailAspectRatio;
                        ThumbnailType thumbnailType = blazeBaseWidget2.getThumbnailType();
                        String str3 = blazeBaseWidget2.widgetSize;
                        WidgetType widgetType = blazeBaseWidget2.getWidgetType();
                        viewModel.getClass();
                        str.getClass();
                        str2.getClass();
                        thumbnailType.getClass();
                        str3.getClass();
                        widgetType.getClass();
                        if (!viewModel.l) {
                            viewModel.l = true;
                            List u = viewModel.u();
                            int size = u != null ? u.size() : 0;
                            List u2 = viewModel.u();
                            if (u2 == null) {
                                list = km5.a;
                            } else {
                                ArrayList arrayList = new ArrayList(k13.r(u2, 10));
                                Iterator it = u2.iterator();
                                while (it.hasNext()) {
                                    arrayList.add(((ipm) it.next()).a);
                                }
                                list = arrayList;
                            }
                            String w = viewModel.w();
                            ContentType t = viewModel.t();
                            boolean isEnabled = viewModel.x().getWidgetItemStyle().getImage().getAnimatedThumbnail().isEnabled();
                            list.getClass();
                            t.getClass();
                            AnalyticsPropsWidget analyticsPropsWidget = new AnalyticsPropsWidget(w, widgetType, str3, Integer.valueOf(size), null, t, null, str, str2, thumbnailType, list, null, Boolean.valueOf(isEnabled), null, null);
                            EventActionName eventActionName = EventActionName.WIDGET_LOAD;
                            eventActionName.getClass();
                            spm.postEvent$default(cwm.a, eventActionName, EventCategoryType.WIDGET, new AnalyticsPropsReferring(null, null, viewModel.v().getStringRepresentation$blazesdk_release(), 3, null), null, null, null, analyticsPropsWidget, null, null, 440, null);
                        }
                        return Unit.a;
                    }
                }, blazeBaseWidget.getAccessibilityIdentifierPrefix(), blazeBaseWidget.getViewType(), blazeBaseWidget.getViewModel().w());
            default:
                int i5 = BlazeBaseWidget.q;
                blazeBaseWidget.j();
                return new byl(blazeBaseWidget.getContainerSizeProviderForAdapter(), blazeBaseWidget.getWidgetLayout(), blazeBaseWidget.getViewType());
        }
    }
}
