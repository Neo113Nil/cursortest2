package defpackage;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.l;
import androidx.recyclerview.widget.u;
import com.sofascore.results.R;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class gne extends l {
    public final /* synthetic */ int a;
    public final String[] b;
    public final float[] c;
    public int d;
    public final /* synthetic */ FrameLayout e;

    public /* synthetic */ gne(FrameLayout frameLayout, String[] strArr, float[] fArr, int i) {
        this.a = i;
        this.e = frameLayout;
        this.b = strArr;
        this.c = fArr;
    }

    @Override // androidx.recyclerview.widget.l
    public final int getItemCount() {
        switch (this.a) {
        }
        return this.b.length;
    }

    @Override // androidx.recyclerview.widget.l
    public final void onBindViewHolder(u uVar, int i) {
        int i2 = this.a;
        String[] strArr = this.b;
        switch (i2) {
            case 0:
                kne kneVar = (kne) uVar;
                if (i < strArr.length) {
                    kneVar.b.setText(strArr[i]);
                }
                if (i == this.d) {
                    kneVar.itemView.setSelected(true);
                    kneVar.c.setVisibility(0);
                } else {
                    kneVar.itemView.setSelected(false);
                    kneVar.c.setVisibility(4);
                }
                kneVar.itemView.setOnClickListener(new l8(this, i, 6));
                break;
            default:
                zii ziiVar = (zii) uVar;
                if (i < strArr.length) {
                    ziiVar.b.setText(strArr[i]);
                }
                if (i == this.d) {
                    ziiVar.itemView.setSelected(true);
                    ziiVar.c.setVisibility(0);
                } else {
                    ziiVar.itemView.setSelected(false);
                    ziiVar.c.setVisibility(4);
                }
                ziiVar.itemView.setOnClickListener(new l8(this, i, 12));
                break;
        }
    }

    @Override // androidx.recyclerview.widget.l
    public final u onCreateViewHolder(ViewGroup viewGroup, int i) {
        int i2 = this.a;
        FrameLayout frameLayout = this.e;
        switch (i2) {
            case 0:
                return new kne(LayoutInflater.from(((one) frameLayout).getContext()).inflate(R.layout.exo_styled_sub_settings_list_item, viewGroup, false));
            default:
                return new zii(LayoutInflater.from(((cji) frameLayout).getContext()).inflate(R.layout.exo_styled_sub_settings_list_item, viewGroup, false));
        }
    }
}
