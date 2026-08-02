package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.u;
import com.sofascore.model.mvvm.model.Event;
import com.sofascore.model.mvvm.model.Manager;
import com.sofascore.model.mvvm.model.Player;
import com.sofascore.model.mvvm.model.Referee;
import com.sofascore.model.mvvm.model.Sport;
import com.sofascore.model.mvvm.model.Stage;
import com.sofascore.model.mvvm.model.Team;
import com.sofascore.model.mvvm.model.UniqueStage;
import com.sofascore.model.mvvm.model.UniqueTournament;
import com.sofascore.results.R;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class qwg extends y6 {
    public fvg f;

    @Override // defpackage.ysk
    public final boolean j(int i, Object obj) {
        switch (i) {
            case 1:
                Player player = (Player) obj;
                String sportSlug = player.getSportSlug();
                if (player.getDisabled()) {
                    return false;
                }
                return Intrinsics.c(sportSlug != null ? Boolean.valueOf(dti.e(sportSlug)) : null, Boolean.TRUE);
            case 2:
                return !((Team) obj).getDisabled();
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 10:
            case 11:
            case 12:
                return true;
            case 8:
            case 9:
            default:
                return false;
        }
    }

    @Override // androidx.recyclerview.widget.l
    public final u onCreateViewHolder(ViewGroup viewGroup, int i) {
        viewGroup.getClass();
        LayoutInflater layoutInflater = this.e;
        js2 b = js2.b(layoutInflater, viewGroup);
        int i2 = 1;
        int i3 = R.id.image_4;
        int i4 = 0;
        switch (i) {
            case 1:
                fvg fvgVar = this.f;
                if (fvgVar != null) {
                    return new jwg(b, fvgVar, i2);
                }
                Intrinsics.i("onDeleteClick");
                throw null;
            case 2:
                fvg fvgVar2 = this.f;
                if (fvgVar2 != null) {
                    return new jwg(b, fvgVar2, 5);
                }
                Intrinsics.i("onDeleteClick");
                throw null;
            case 3:
                fvg fvgVar3 = this.f;
                if (fvgVar3 != null) {
                    return new jwg(b, fvgVar3, i4);
                }
                Intrinsics.i("onDeleteClick");
                throw null;
            case 4:
                fvg fvgVar4 = this.f;
                if (fvgVar4 != null) {
                    return new kwg(b, fvgVar4);
                }
                Intrinsics.i("onDeleteClick");
                throw null;
            case 5:
                fvg fvgVar5 = this.f;
                if (fvgVar5 != null) {
                    return new jwg(b, fvgVar5, 2);
                }
                Intrinsics.i("onDeleteClick");
                throw null;
            case 6:
                View inflate = layoutInflater.inflate(R.layout.search_event_layout, viewGroup, false);
                View B = nq8.B(R.id.event_view, inflate);
                if (B != null) {
                    bu1 a = bu1.a(B);
                    ImageView imageView = (ImageView) nq8.B(R.id.image_1, inflate);
                    if (imageView != null) {
                        ImageView imageView2 = (ImageView) nq8.B(R.id.image_4, inflate);
                        if (imageView2 != null) {
                            rfe rfeVar = new rfe(5, imageView, imageView2, (LinearLayout) inflate, a);
                            fvg fvgVar6 = this.f;
                            if (fvgVar6 != null) {
                                return new iwg(rfeVar, fvgVar6);
                            }
                            Intrinsics.i("onDeleteClick");
                            throw null;
                        }
                    } else {
                        i3 = R.id.image_1;
                    }
                } else {
                    i3 = R.id.event_view;
                }
                yhk.s("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i3)));
                return null;
            case 7:
                View inflate2 = layoutInflater.inflate(R.layout.search_event_doubles_layout, viewGroup, false);
                View B2 = nq8.B(R.id.event_view, inflate2);
                if (B2 != null) {
                    bu1 a2 = bu1.a(B2);
                    ImageView imageView3 = (ImageView) nq8.B(R.id.image_1, inflate2);
                    if (imageView3 != null) {
                        int i5 = R.id.image_2;
                        ImageView imageView4 = (ImageView) nq8.B(R.id.image_2, inflate2);
                        if (imageView4 != null) {
                            i5 = R.id.image_3;
                            ImageView imageView5 = (ImageView) nq8.B(R.id.image_3, inflate2);
                            if (imageView5 != null) {
                                ImageView imageView6 = (ImageView) nq8.B(R.id.image_4, inflate2);
                                if (imageView6 != null) {
                                    djf djfVar = new djf((LinearLayout) inflate2, a2, imageView3, imageView4, imageView5, imageView6, 3);
                                    fvg fvgVar7 = this.f;
                                    if (fvgVar7 != null) {
                                        return new iwg(djfVar, fvgVar7);
                                    }
                                    Intrinsics.i("onDeleteClick");
                                    throw null;
                                }
                            }
                        }
                        i3 = i5;
                    } else {
                        i3 = R.id.image_1;
                    }
                } else {
                    i3 = R.id.event_view;
                }
                yhk.s("Missing required view with ID: ".concat(inflate2.getResources().getResourceName(i3)));
                return null;
            case 8:
                View inflate3 = layoutInflater.inflate(R.layout.row_loader, viewGroup, false);
                if (inflate3 != null) {
                    return new r71(13, (LinearLayout) inflate3);
                }
                yhk.s("rootView");
                return null;
            case 9:
                return new b63(dk2.d(layoutInflater, viewGroup), 1);
            case 10:
                fvg fvgVar8 = this.f;
                if (fvgVar8 != null) {
                    return new jwg(b, fvgVar8, 4);
                }
                Intrinsics.i("onDeleteClick");
                throw null;
            case 11:
                fvg fvgVar9 = this.f;
                if (fvgVar9 != null) {
                    return new jwg(b, fvgVar9, 6);
                }
                Intrinsics.i("onDeleteClick");
                throw null;
            case 12:
                fvg fvgVar10 = this.f;
                if (fvgVar10 != null) {
                    return new jwg(b, fvgVar10, 3);
                }
                Intrinsics.i("onDeleteClick");
                throw null;
            case 13:
                return new r71(12, ddd.a(layoutInflater, viewGroup).b);
            default:
                ilg.c();
                return null;
        }
    }

    @Override // defpackage.y6
    public final int q(Object obj) {
        if (Intrinsics.c(obj, 13)) {
            return 13;
        }
        if (obj instanceof Player) {
            return 1;
        }
        if (obj instanceof Team) {
            return 2;
        }
        if (obj instanceof UniqueTournament) {
            return 3;
        }
        if (obj instanceof Manager) {
            return 4;
        }
        if (obj instanceof Referee) {
            return 5;
        }
        if (obj instanceof Event) {
            return ok3.F((Event) obj) ? 7 : 6;
        }
        if (obj instanceof Integer) {
            return 8;
        }
        if (obj instanceof String) {
            return 9;
        }
        if (obj instanceof Stage) {
            return 10;
        }
        if (obj instanceof UniqueStage) {
            return 11;
        }
        if (obj instanceof Sport) {
            return 12;
        }
        ilg.c();
        return 0;
    }
}
