package defpackage;

import androidx.fragment.app.Fragment;
import com.sofascore.results.main.matches.redesign.competitions.CompetitionsFragment;
import com.sofascore.results.main.matches.redesign.datematches.MainMatchesFragment;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class uxb extends wp8 {
    @Override // androidx.recyclerview.widget.l
    public final int getItemCount() {
        return 2;
    }

    @Override // defpackage.wp8, androidx.recyclerview.widget.l
    public final long getItemId(int i) {
        return i;
    }

    @Override // defpackage.wp8
    public final Fragment q(int i) {
        return i == 0 ? new MainMatchesFragment() : new CompetitionsFragment();
    }
}
