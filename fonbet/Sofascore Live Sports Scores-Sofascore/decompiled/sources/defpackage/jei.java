package defpackage;

import com.sofascore.model.network.response.EventStatisticsItem;
import java.io.Serializable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public class jei implements Serializable {
    public final String a;
    public final String b;
    public final EventStatisticsItem.SpecialEventStatisticType c;
    public boolean d;

    public jei(String str, String str2, EventStatisticsItem.SpecialEventStatisticType specialEventStatisticType) {
        str.getClass();
        str2.getClass();
        this.a = str;
        this.b = str2;
        this.c = specialEventStatisticType;
    }

    public /* synthetic */ jei(String str, String str2) {
        this(str, str2, null);
    }
}
