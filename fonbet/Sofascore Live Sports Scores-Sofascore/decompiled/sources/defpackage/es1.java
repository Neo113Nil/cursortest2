package defpackage;

import android.content.Context;
import android.graphics.PointF;
import com.sofascore.model.Sports;
import com.sofascore.model.mvvm.model.Event;
import com.sofascore.model.mvvm.model.Time;
import com.sofascore.model.newNetwork.EventGraphData;
import com.sofascore.model.newNetwork.EventGraphResponse;
import com.sofascore.results.R;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.b;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public class es1 extends q7 {
    public final int n;
    public final String o;
    public int p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public es1(Context context) {
        super(context);
        context.getClass();
        this.n = 20;
        this.o = Sports.BASKETBALL;
    }

    @Override // defpackage.q7
    @NotNull
    public String getCurrentTimeText() {
        Event event = getEvent();
        if (event == null) {
            return "";
        }
        int y = pd0.y(event.getTime(), event.getStatus().getCode());
        if (event.getStatus().getCode() != 30) {
            return event.getStatus().getCode() == 32 ? "Aw. ET" : y != -1 ? rei.k(y, true) : "";
        }
        String string = getContext().getString(R.string.status_break);
        string.getClass();
        return string;
    }

    @Override // defpackage.q7
    public float getCurrentWidth() {
        List<EventGraphData> graphPoints;
        EventGraphData eventGraphData;
        EventGraphResponse eventGraphResponse = getEventGraphResponse();
        return ((eventGraphResponse == null || (graphPoints = eventGraphResponse.getGraphPoints()) == null || (eventGraphData = (EventGraphData) CollectionsKt.h0(graphPoints)) == null) ? UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT : (float) eventGraphData.getMinute()) / this.p;
    }

    @Override // defpackage.q7
    public int getDefaultDiffValue() {
        return this.n;
    }

    @Override // defpackage.q7
    @NotNull
    public List<vde> getPeriodDividerData() {
        EventGraphResponse eventGraphResponse;
        List<EventGraphData> graphPoints;
        EventGraphResponse eventGraphResponse2;
        Integer periodTime;
        Integer periodCount;
        int i;
        int i2;
        float f;
        Integer overtimeLength;
        ArrayList arrayList = new ArrayList();
        Event event = getEvent();
        if (event != null && (eventGraphResponse = getEventGraphResponse()) != null && (graphPoints = eventGraphResponse.getGraphPoints()) != null && (eventGraphResponse2 = getEventGraphResponse()) != null && (periodTime = eventGraphResponse2.getPeriodTime()) != null) {
            int intValue = periodTime.intValue();
            EventGraphResponse eventGraphResponse3 = getEventGraphResponse();
            if (eventGraphResponse3 != null && (periodCount = eventGraphResponse3.getPeriodCount()) != null) {
                int intValue2 = periodCount.intValue();
                int i3 = intValue * intValue2;
                int size = graphPoints.size();
                if (size > i3) {
                    Time time = event.getTime();
                    int intValue3 = ((time == null || (overtimeLength = time.getOvertimeLength()) == null) ? 300 : overtimeLength.intValue()) / 60;
                    i = (((size - i3) - 1) / intValue3) + 1;
                    i2 = (intValue3 * i) + i3;
                    f = ((i2 - i3) / i2) / i;
                } else {
                    i = 0;
                    i2 = i3;
                    f = 0.0f;
                }
                float f2 = (i3 / i2) / intValue2;
                arrayList.add(new vde(f2));
                arrayList.add(new vde(2.0f * f2));
                arrayList.add(new vde(3.0f * f2));
                if (i > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                    float f3 = f2 * 4.0f;
                    arrayList.add(new vde(f3));
                    for (int i4 = 1; i4 < i; i4++) {
                        arrayList.add(new vde((i4 * f) + f3));
                    }
                }
                this.p = i2;
            }
        }
        return arrayList;
    }

    @Override // defpackage.q7
    @NotNull
    public String getSport() {
        return this.o;
    }

    @Override // defpackage.q7
    public final ArrayList n(boolean z, EventGraphData eventGraphData) {
        float f;
        eventGraphData.getClass();
        double minute = eventGraphData.getMinute();
        float f2 = z ? (float) minute : ((float) minute) / this.p;
        if (z) {
            f = (float) eventGraphData.getValue();
        } else {
            double value = eventGraphData.getValue();
            float abs = (((float) Math.abs(value)) / this.g) * 0.5f;
            f = value > 0.0d ? 0.5f - abs : abs + 0.5f;
        }
        return b.e(new PointF(f2, f));
    }
}
