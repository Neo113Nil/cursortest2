package defpackage;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.l;
import androidx.recyclerview.widget.u;
import com.sofascore.results.R;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public abstract class mne extends l {
    public final /* synthetic */ int a = 1;
    public List b = new ArrayList();
    public final /* synthetic */ FrameLayout c;

    public mne(cji cjiVar) {
        this.c = cjiVar;
    }

    @Override // androidx.recyclerview.widget.l
    public final int getItemCount() {
        switch (this.a) {
            case 0:
                if (!this.b.isEmpty()) {
                    break;
                }
                break;
            default:
                if (!this.b.isEmpty()) {
                    break;
                }
                break;
        }
        return this.b.size() + 1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0033, code lost:
    
        if (r5.a.e[r5.b] != false) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void o(kne kneVar, int i) {
        ale aleVar = ((one) this.c).q0;
        if (aleVar == null) {
            return;
        }
        if (i == 0) {
            q(kneVar);
            return;
        }
        boolean z = true;
        lne lneVar = (lne) this.b.get(i - 1);
        osj osjVar = lneVar.a.b;
        if (aleVar.o().v.get(osjVar) != null) {
        }
        z = false;
        kneVar.b.setText(lneVar.c);
        kneVar.c.setVisibility(z ? 0 : 4);
        kneVar.itemView.setOnClickListener(new r2(this, aleVar, osjVar, lneVar, 1));
    }

    @Override // androidx.recyclerview.widget.l
    public /* bridge */ /* synthetic */ void onBindViewHolder(u uVar, int i) {
        switch (this.a) {
            case 0:
                o((kne) uVar, i);
                break;
            default:
                p((zii) uVar, i);
                break;
        }
    }

    @Override // androidx.recyclerview.widget.l
    public final u onCreateViewHolder(ViewGroup viewGroup, int i) {
        int i2 = this.a;
        FrameLayout frameLayout = this.c;
        switch (i2) {
            case 0:
                return new kne(LayoutInflater.from(((one) frameLayout).getContext()).inflate(R.layout.exo_styled_sub_settings_list_item, viewGroup, false));
            default:
                return new zii(LayoutInflater.from(((cji) frameLayout).getContext()).inflate(R.layout.exo_styled_sub_settings_list_item, viewGroup, false));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0036, code lost:
    
        if (r5.a.e[r5.b] != false) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void p(zii ziiVar, int i) {
        zke zkeVar = ((cji) this.c).h0;
        if (zkeVar == null) {
            return;
        }
        if (i == 0) {
            r(ziiVar);
            return;
        }
        boolean z = true;
        aji ajiVar = (aji) this.b.get(i - 1);
        nsj nsjVar = ajiVar.a.b;
        if (((ug6) zkeVar).q().y.get(nsjVar) != null) {
        }
        z = false;
        ziiVar.b.setText(ajiVar.c);
        ziiVar.c.setVisibility(z ? 0 : 4);
        ziiVar.itemView.setOnClickListener(new r2(this, zkeVar, nsjVar, ajiVar, 5));
    }

    public abstract void q(kne kneVar);

    public abstract void r(zii ziiVar);

    public abstract void s(String str);

    public mne(one oneVar) {
        this.c = oneVar;
    }
}
