package defpackage;

import com.blaze.blazesdk.style.widgets.BlazeWidgetItemImageContainerBorderStateStyle;
import com.blaze.blazesdk.style.widgets.BlazeWidgetItemImageContainerBorderStyle;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public abstract class ndm {
    public static final BlazeWidgetItemImageContainerBorderStateStyle a(BlazeWidgetItemImageContainerBorderStyle blazeWidgetItemImageContainerBorderStyle, ipm ipmVar) {
        blazeWidgetItemImageContainerBorderStyle.getClass();
        ipmVar.getClass();
        int ordinal = ipmVar.a().ordinal();
        if (ordinal == 0) {
            return blazeWidgetItemImageContainerBorderStyle.getLiveUnreadState();
        }
        if (ordinal == 1) {
            return blazeWidgetItemImageContainerBorderStyle.getUnreadState();
        }
        if (ordinal == 2) {
            return blazeWidgetItemImageContainerBorderStyle.getLiveReadState();
        }
        if (ordinal == 3) {
            return blazeWidgetItemImageContainerBorderStyle.getReadState();
        }
        zzl.b();
        return null;
    }
}
