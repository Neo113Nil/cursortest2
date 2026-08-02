package defpackage;

import android.widget.ImageView;
import androidx.recyclerview.widget.u;
import com.sofascore.results.R;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class dne extends mne {
    public final /* synthetic */ int d;
    public final /* synthetic */ one e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ dne(one oneVar, int i) {
        super(oneVar);
        this.d = i;
        this.e = oneVar;
    }

    @Override // defpackage.mne
    public void o(kne kneVar, int i) {
        switch (this.d) {
            case 1:
                super.o(kneVar, i);
                if (i > 0) {
                    lne lneVar = (lne) this.b.get(i - 1);
                    kneVar.c.setVisibility(lneVar.a.e[lneVar.b] ? 0 : 4);
                    break;
                }
                break;
            default:
                super.o(kneVar, i);
                break;
        }
    }

    @Override // defpackage.mne, androidx.recyclerview.widget.l
    public /* bridge */ /* synthetic */ void onBindViewHolder(u uVar, int i) {
        switch (this.d) {
            case 1:
                o((kne) uVar, i);
                break;
            default:
                super.onBindViewHolder(uVar, i);
                break;
        }
    }

    @Override // defpackage.mne
    public final void q(kne kneVar) {
        boolean z;
        int i = 0;
        switch (this.d) {
            case 0:
                kneVar.b.setText(R.string.exo_track_selection_auto);
                ale aleVar = this.e.q0;
                aleVar.getClass();
                kneVar.c.setVisibility(t(aleVar.o()) ? 4 : 0);
                kneVar.itemView.setOnClickListener(new cne(this, i));
                break;
            default:
                kneVar.b.setText(R.string.exo_track_selection_none);
                int i2 = 0;
                while (true) {
                    if (i2 < this.b.size()) {
                        lne lneVar = (lne) this.b.get(i2);
                        if (lneVar.a.e[lneVar.b]) {
                            z = false;
                        } else {
                            i2++;
                        }
                    } else {
                        z = true;
                    }
                }
                kneVar.c.setVisibility(z ? 0 : 4);
                kneVar.itemView.setOnClickListener(new cne(this, 2));
                break;
        }
    }

    @Override // defpackage.mne
    public final void s(String str) {
        switch (this.d) {
            case 0:
                ((String[]) this.e.m.c)[1] = str;
                break;
        }
    }

    public boolean t(etj etjVar) {
        for (int i = 0; i < this.b.size(); i++) {
            if (etjVar.v.containsKey(((lne) this.b.get(i)).a.b)) {
                return true;
            }
        }
        return false;
    }

    public void u(List list) {
        one oneVar = this.e;
        ImageView imageView = oneVar.D;
        boolean z = false;
        int i = 0;
        while (true) {
            if (i >= ((vvf) list).d) {
                break;
            }
            lne lneVar = (lne) ((vvf) list).get(i);
            if (lneVar.a.e[lneVar.b]) {
                z = true;
                break;
            }
            i++;
        }
        if (imageView != null) {
            imageView.setImageDrawable(z ? oneVar.i0 : oneVar.j0);
            imageView.setContentDescription(z ? oneVar.k0 : oneVar.l0);
        }
        this.b = list;
    }

    private final void v(String str) {
    }
}
