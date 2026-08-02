package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.sofascore.model.mvvm.model.Gender;
import com.sofascore.model.mvvm.model.PlayerKt;
import com.sofascore.results.R;
import java.util.ArrayList;
import java.util.HashMap;
import kotlin.collections.b;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class xue extends BaseAdapter {
    public final Context a;
    public final View b;
    public final mqi c;
    public final ArrayList d;
    public final HashMap e;
    public final mqi f;

    public xue(Context context, View view, Gender gender) {
        context.getClass();
        view.getClass();
        this.a = context;
        this.b = view;
        final int i = 0;
        this.c = ypa.b(new Function0(this) { // from class: wue
            public final /* synthetic */ xue b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                xue xueVar = this.b;
                switch (i2) {
                    case 0:
                        return LayoutInflater.from(xueVar.a);
                    case 1:
                        return Integer.valueOf(xueVar.a.getColor(R.color.forward));
                    case 2:
                        return Integer.valueOf(xueVar.a.getColor(R.color.midfield));
                    default:
                        return Integer.valueOf(xueVar.a.getColor(R.color.defender));
                }
            }
        });
        this.d = b.e(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
        HashMap hashMap = new HashMap();
        this.e = hashMap;
        final int i2 = 1;
        mqi b = ypa.b(new Function0(this) { // from class: wue
            public final /* synthetic */ xue b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                xue xueVar = this.b;
                switch (i22) {
                    case 0:
                        return LayoutInflater.from(xueVar.a);
                    case 1:
                        return Integer.valueOf(xueVar.a.getColor(R.color.forward));
                    case 2:
                        return Integer.valueOf(xueVar.a.getColor(R.color.midfield));
                    default:
                        return Integer.valueOf(xueVar.a.getColor(R.color.defender));
                }
            }
        });
        final int i3 = 2;
        this.f = ypa.b(new Function0(this) { // from class: wue
            public final /* synthetic */ xue b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                xue xueVar = this.b;
                switch (i22) {
                    case 0:
                        return LayoutInflater.from(xueVar.a);
                    case 1:
                        return Integer.valueOf(xueVar.a.getColor(R.color.forward));
                    case 2:
                        return Integer.valueOf(xueVar.a.getColor(R.color.midfield));
                    default:
                        return Integer.valueOf(xueVar.a.getColor(R.color.defender));
                }
            }
        });
        final int i4 = 3;
        mqi b2 = ypa.b(new Function0(this) { // from class: wue
            public final /* synthetic */ xue b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i4;
                xue xueVar = this.b;
                switch (i22) {
                    case 0:
                        return LayoutInflater.from(xueVar.a);
                    case 1:
                        return Integer.valueOf(xueVar.a.getColor(R.color.forward));
                    case 2:
                        return Integer.valueOf(xueVar.a.getColor(R.color.midfield));
                    default:
                        return Integer.valueOf(xueVar.a.getColor(R.color.defender));
                }
            }
        });
        view.setVisibility(8);
        hashMap.put("lw", new j2f("LW", hkg.Q(context, R.string.football_left_winger, gender, new Object[0]), 0, ((Number) b.getValue()).intValue()));
        hashMap.put("st", new j2f("ST", hkg.Q(context, R.string.football_striker, gender, new Object[0]), 1, ((Number) b.getValue()).intValue()));
        hashMap.put("rw", new j2f("RW", hkg.Q(context, R.string.football_right_winger, gender, new Object[0]), 2, ((Number) b.getValue()).intValue()));
        hashMap.put("am", new j2f("AM", hkg.Q(context, R.string.football_attacking_midfielder, gender, new Object[0]), 4, a()));
        hashMap.put("ml", new j2f("ML", hkg.Q(context, R.string.football_left_midfielder, gender, new Object[0]), 6, a()));
        hashMap.put("mc", new j2f("MC", hkg.Q(context, R.string.football_centre_midfielder, gender, new Object[0]), 7, a()));
        hashMap.put("mr", new j2f("MR", hkg.Q(context, R.string.football_right_midfielder, gender, new Object[0]), 8, a()));
        hashMap.put("dm", new j2f("DM", hkg.Q(context, R.string.football_defensive_midfielder, gender, new Object[0]), 10, a()));
        hashMap.put("dl", new j2f(PlayerKt.AMERICAN_FOOTBALL_DEFENSIVE_LINEMAN, hkg.Q(context, R.string.football_left_back, gender, new Object[0]), 12, ((Number) b2.getValue()).intValue()));
        hashMap.put("dc", new j2f("DC", hkg.Q(context, R.string.football_centre_back, gender, new Object[0]), 13, ((Number) b2.getValue()).intValue()));
        hashMap.put(DownloadCommon.DOWNLOAD_REPORT_DOWNLOAD_RATE, new j2f("DR", hkg.Q(context, R.string.football_right_back, gender, new Object[0]), 14, ((Number) b2.getValue()).intValue()));
    }

    public final int a() {
        return ((Number) this.f.getValue()).intValue();
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        return 15;
    }

    @Override // android.widget.Adapter
    public final Object getItem(int i) {
        return null;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return 0L;
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        Object a;
        if (view == null || (a = view.getTag()) == null) {
            a = yue.a(((LayoutInflater) this.c.getValue()).inflate(R.layout.player_position_grid_layout, viewGroup, false));
        }
        yue yueVar = (yue) a;
        TextView textView = yueVar.b;
        LinearLayout linearLayout = yueVar.a;
        if (linearLayout.getTag() == null) {
            linearLayout.setTag(yueVar);
        }
        j2f j2fVar = (j2f) this.d.get(i);
        if (j2fVar == null) {
            textView.setVisibility(8);
            return linearLayout;
        }
        textView.setVisibility(0);
        textView.setText(j2fVar.a);
        textView.setTextColor(j2fVar.d);
        return linearLayout;
    }

    @Override // android.widget.BaseAdapter, android.widget.ListAdapter
    public final boolean isEnabled(int i) {
        return true;
    }
}
