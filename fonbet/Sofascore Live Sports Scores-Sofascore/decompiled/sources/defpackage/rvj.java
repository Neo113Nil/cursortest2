package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.sofascore.model.mvvm.model.Player;
import com.sofascore.model.mvvm.model.Transfer;
import com.sofascore.results.R;
import com.sofascore.results.redesign.dividers.SofaDivider;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.a;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class rvj extends g7 {
    public final boolean l;
    public final LayoutInflater m;
    public pvj n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rvj(Context context, boolean z) {
        super(context);
        context.getClass();
        this.l = z;
        this.m = LayoutInflater.from(context);
        this.n = pvj.d;
    }

    public final void G(List list) {
        Player player;
        list.getClass();
        xbb b = a.b();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Transfer transfer = (Transfer) it.next();
            lvj lvjVar = (lvj) CollectionsKt.j0(b);
            if (lvjVar != null) {
                Transfer transfer2 = (Transfer) CollectionsKt.firstOrNull(lvjVar.a);
                Integer valueOf = (transfer2 == null || (player = transfer2.getPlayer()) == null) ? null : Integer.valueOf(player.getId());
                Player player2 = transfer.getPlayer();
                if (Intrinsics.c(valueOf, player2 != null ? Integer.valueOf(player2.getId()) : null)) {
                    lvjVar.a = CollectionsKt.x0(lvjVar.a, transfer);
                }
            }
            b.add(new lvj(transfer, this.n));
        }
        F(a.a(b));
    }

    @Override // defpackage.ysk
    public final boolean j(int i, Object obj) {
        return true;
    }

    @Override // defpackage.g7
    public final f3 u(ArrayList arrayList) {
        return null;
    }

    @Override // defpackage.g7
    public final int v(Object obj) {
        ((lvj) obj).getClass();
        return 0;
    }

    @Override // defpackage.g7
    public final p8 z(ViewGroup viewGroup, int i) {
        viewGroup.getClass();
        View inflate = this.m.inflate(R.layout.transfer_row_item, viewGroup, false);
        int i2 = R.id.player_followers;
        TextView textView = (TextView) nq8.B(R.id.player_followers, inflate);
        if (textView != null) {
            i2 = R.id.player_followers_colon;
            if (((TextView) nq8.B(R.id.player_followers_colon, inflate)) != null) {
                i2 = R.id.player_followers_text;
                if (((TextView) nq8.B(R.id.player_followers_text, inflate)) != null) {
                    i2 = R.id.transfer_divider;
                    if (((SofaDivider) nq8.B(R.id.transfer_divider, inflate)) != null) {
                        i2 = R.id.transfer_list;
                        LinearLayout linearLayout = (LinearLayout) nq8.B(R.id.transfer_list, inflate);
                        if (linearLayout != null) {
                            i2 = R.id.transfers_player_image;
                            ImageView imageView = (ImageView) nq8.B(R.id.transfers_player_image, inflate);
                            if (imageView != null) {
                                i2 = R.id.transfers_player_name;
                                TextView textView2 = (TextView) nq8.B(R.id.transfers_player_name, inflate);
                                if (textView2 != null) {
                                    return new exe(new mvj((ConstraintLayout) inflate, textView, linearLayout, imageView, textView2), this.l);
                                }
                            }
                        }
                    }
                }
            }
        }
        yhk.s("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i2)));
        return null;
    }
}
