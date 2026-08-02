package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.SwitchCompat;
import com.sofascore.model.firebase.RemoteConfigParameter;
import com.sofascore.model.mvvm.model.Event;
import com.sofascore.model.mvvm.model.Stage;
import com.sofascore.model.newNetwork.RiskyTopic;
import com.sofascore.model.util.ChatInterface;
import com.sofascore.results.R;
import java.util.ArrayList;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class nm5 extends g7 {
    public final /* synthetic */ int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ nm5(Context context, int i) {
        super(context);
        this.l = i;
    }

    @Override // defpackage.ysk
    public Integer a(int i) {
        switch (this.l) {
            case 1:
                return Integer.valueOf(R.id.background);
            default:
                return super.a(i);
        }
    }

    @Override // defpackage.ysk
    public final boolean j(int i, Object obj) {
        switch (this.l) {
            case 0:
                return false;
            case 1:
                return !((ejf) obj).b;
            case 2:
                return false;
            default:
                return true;
        }
    }

    @Override // defpackage.g7
    public final f3 u(ArrayList arrayList) {
        switch (this.l) {
        }
        return null;
    }

    @Override // defpackage.g7
    public final int v(Object obj) {
        switch (this.l) {
            case 0:
                obj.getClass();
                return 0;
            case 1:
                ((ejf) obj).getClass();
                return 0;
            case 2:
                ((RemoteConfigParameter) obj).getClass();
                return 1;
            default:
                RiskyTopic riskyTopic = (RiskyTopic) obj;
                riskyTopic.getClass();
                ChatInterface chatInterfaceModel = riskyTopic.getChatInterfaceModel();
                if (chatInterfaceModel instanceof Event) {
                    return 1;
                }
                if (chatInterfaceModel instanceof Stage) {
                    return 3;
                }
                ilg.c();
                return 0;
        }
    }

    @Override // defpackage.g7
    public final p8 z(ViewGroup viewGroup, int i) {
        int i2 = this.l;
        Context context = this.b;
        viewGroup.getClass();
        switch (i2) {
            case 0:
                break;
            case 1:
                View inflate = LayoutInflater.from(context).inflate(R.layout.quick_links_item_new, viewGroup, false);
                int i3 = R.id.background;
                View B = nq8.B(R.id.background, inflate);
                if (B != null) {
                    i3 = R.id.beta_flag;
                    ImageView imageView = (ImageView) nq8.B(R.id.beta_flag, inflate);
                    if (imageView != null) {
                        i3 = R.id.icon;
                        ImageView imageView2 = (ImageView) nq8.B(R.id.icon, inflate);
                        if (imageView2 != null) {
                            i3 = R.id.switch_button;
                            SwitchCompat switchCompat = (SwitchCompat) nq8.B(R.id.switch_button, inflate);
                            if (switchCompat != null) {
                                i3 = R.id.title;
                                TextView textView = (TextView) nq8.B(R.id.title, inflate);
                                if (textView != null) {
                                    break;
                                }
                            }
                        }
                    }
                }
                yhk.s("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i3)));
                break;
            case 2:
                if (i != 1) {
                    ilg.c();
                    break;
                } else {
                    View inflate2 = LayoutInflater.from(context).inflate(R.layout.config_parameter_row, (ViewGroup) null, false);
                    int i4 = R.id.parameter_container;
                    LinearLayout linearLayout = (LinearLayout) nq8.B(R.id.parameter_container, inflate2);
                    if (linearLayout != null) {
                        i4 = R.id.upper_vertical_divider;
                        View B2 = nq8.B(R.id.upper_vertical_divider, inflate2);
                        if (B2 != null) {
                            break;
                        }
                    }
                    yhk.s("Missing required view with ID: ".concat(inflate2.getResources().getResourceName(i4)));
                    break;
                }
            default:
                View inflate3 = LayoutInflater.from(context).inflate(R.layout.risky_chat_dialog_row, viewGroup, false);
                int i5 = R.id.away_name;
                TextView textView2 = (TextView) nq8.B(R.id.away_name, inflate3);
                if (textView2 != null) {
                    i5 = R.id.away_red_card_count;
                    if (((TextView) nq8.B(R.id.away_red_card_count, inflate3)) != null) {
                        i5 = R.id.away_red_card_icon;
                        if (((ImageView) nq8.B(R.id.away_red_card_icon, inflate3)) != null) {
                            i5 = R.id.away_row;
                            LinearLayout linearLayout2 = (LinearLayout) nq8.B(R.id.away_row, inflate3);
                            if (linearLayout2 != null) {
                                i5 = R.id.date;
                                TextView textView3 = (TextView) nq8.B(R.id.date, inflate3);
                                if (textView3 != null) {
                                    i5 = R.id.home_name;
                                    TextView textView4 = (TextView) nq8.B(R.id.home_name, inflate3);
                                    if (textView4 != null) {
                                        i5 = R.id.home_red_card_count;
                                        if (((TextView) nq8.B(R.id.home_red_card_count, inflate3)) != null) {
                                            i5 = R.id.home_red_card_icon;
                                            if (((ImageView) nq8.B(R.id.home_red_card_icon, inflate3)) != null) {
                                                i5 = R.id.home_row;
                                                LinearLayout linearLayout3 = (LinearLayout) nq8.B(R.id.home_row, inflate3);
                                                if (linearLayout3 != null) {
                                                    break;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                yhk.s("Missing required view with ID: ".concat(inflate3.getResources().getResourceName(i5)));
                break;
        }
        return null;
    }
}
