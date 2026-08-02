package defpackage;

import android.widget.ImageView;
import androidx.recyclerview.widget.u;
import com.sofascore.results.R;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class uii extends mne {
    public final /* synthetic */ int d;
    public final /* synthetic */ cji e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ uii(cji cjiVar, int i) {
        super(cjiVar);
        this.d = i;
        this.e = cjiVar;
    }

    @Override // defpackage.mne, androidx.recyclerview.widget.l
    public /* bridge */ /* synthetic */ void onBindViewHolder(u uVar, int i) {
        switch (this.d) {
            case 1:
                p((zii) uVar, i);
                break;
            default:
                super.onBindViewHolder(uVar, i);
                break;
        }
    }

    @Override // defpackage.mne
    public void p(zii ziiVar, int i) {
        switch (this.d) {
            case 1:
                super.p(ziiVar, i);
                if (i > 0) {
                    aji ajiVar = (aji) this.b.get(i - 1);
                    ziiVar.c.setVisibility(ajiVar.a.e[ajiVar.b] ? 0 : 4);
                    break;
                }
                break;
            default:
                super.p(ziiVar, i);
                break;
        }
    }

    @Override // defpackage.mne
    public final void r(zii ziiVar) {
        int i = 1;
        switch (this.d) {
            case 0:
                ziiVar.b.setText(R.string.exo_track_selection_auto);
                zke zkeVar = this.e.h0;
                zkeVar.getClass();
                ziiVar.c.setVisibility(t(((ug6) zkeVar).q()) ? 4 : 0);
                ziiVar.itemView.setOnClickListener(new tii(this, i));
                break;
            default:
                ziiVar.b.setText(R.string.exo_track_selection_none);
                int i2 = 0;
                while (true) {
                    if (i2 < this.b.size()) {
                        aji ajiVar = (aji) this.b.get(i2);
                        if (ajiVar.a.e[ajiVar.b]) {
                            i = 0;
                        } else {
                            i2++;
                        }
                    }
                }
                ziiVar.c.setVisibility(i != 0 ? 0 : 4);
                ziiVar.itemView.setOnClickListener(new tii(this, 3));
                break;
        }
    }

    @Override // defpackage.mne
    public final void s(String str) {
        switch (this.d) {
            case 0:
                ((String[]) this.e.f.c)[1] = str;
                break;
        }
    }

    public boolean t(vt4 vt4Var) {
        for (int i = 0; i < this.b.size(); i++) {
            if (vt4Var.y.containsKey(((aji) this.b.get(i)).a.b)) {
                return true;
            }
        }
        return false;
    }

    public void u(List list) {
        cji cjiVar = this.e;
        ImageView imageView = cjiVar.w;
        boolean z = false;
        int i = 0;
        while (true) {
            if (i >= ((vvf) list).d) {
                break;
            }
            aji ajiVar = (aji) ((vvf) list).get(i);
            if (ajiVar.a.e[ajiVar.b]) {
                z = true;
                break;
            }
            i++;
        }
        if (imageView != null) {
            imageView.setImageDrawable(z ? cjiVar.W : cjiVar.a0);
            imageView.setContentDescription(z ? cjiVar.b0 : cjiVar.c0);
        }
        this.b = list;
    }

    private final void v(String str) {
    }
}
