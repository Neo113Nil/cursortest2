package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RelativeLayout;
import android.widget.Spinner;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.checkbox.MaterialCheckBox;
import com.google.android.material.imageview.ShapeableImageView;
import com.google.android.material.textfield.MaterialAutoCompleteTextView;
import com.sofascore.results.R;
import com.sofascore.results.featuredtournament.view.FeaturedTournamentHeaderView;
import com.sofascore.results.view.SofascoreRatingView;
import com.sofascore.results.view.typeheader.TypeHeaderView;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class e92 implements krk {
    public final /* synthetic */ int a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;

    public e92(ConstraintLayout constraintLayout, View view, View view2, TextView textView, TextView textView2, TextView textView3) {
        this.a = 16;
        this.e = constraintLayout;
        this.d = view;
        this.b = view2;
        this.f = textView2;
        this.c = textView3;
    }

    public static e92 a(View view) {
        int i = R.id.close;
        ImageView imageView = (ImageView) nq8.B(R.id.close, view);
        if (imageView != null) {
            i = R.id.replied_message_text;
            TextView textView = (TextView) nq8.B(R.id.replied_message_text, view);
            if (textView != null) {
                i = R.id.reply_thumbnail;
                ShapeableImageView shapeableImageView = (ShapeableImageView) nq8.B(R.id.reply_thumbnail, view);
                if (shapeableImageView != null) {
                    i = R.id.user_name;
                    TextView textView2 = (TextView) nq8.B(R.id.user_name, view);
                    if (textView2 != null) {
                        return new e92((FrameLayout) view, imageView, textView, shapeableImageView, textView2);
                    }
                }
            }
        }
        yhk.s("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
        return null;
    }

    public static e92 b(View view) {
        int i = R.id.label_bottom_divider;
        View B = nq8.B(R.id.label_bottom_divider, view);
        if (B != null) {
            i = R.id.label_link_image;
            ImageView imageView = (ImageView) nq8.B(R.id.label_link_image, view);
            if (imageView != null) {
                i = R.id.label_link_text;
                TextView textView = (TextView) nq8.B(R.id.label_link_text, view);
                if (textView != null) {
                    i = R.id.label_start_text;
                    TextView textView2 = (TextView) nq8.B(R.id.label_start_text, view);
                    if (textView2 != null) {
                        return new e92((ViewGroup) view, B, imageView, textView, textView2, 11);
                    }
                }
            }
        }
        yhk.s("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
        return null;
    }

    public static e92 c(View view) {
        int i = R.id.label;
        TextView textView = (TextView) nq8.B(R.id.label, view);
        if (textView != null) {
            i = R.id.separator;
            View B = nq8.B(R.id.separator, view);
            if (B != null) {
                i = R.id.text_away;
                View B2 = nq8.B(R.id.text_away, view);
                if (B2 != null) {
                    hrc a = hrc.a(B2);
                    i = R.id.text_home;
                    View B3 = nq8.B(R.id.text_home, view);
                    if (B3 != null) {
                        return new e92((LinearLayout) view, textView, B, a, hrc.a(B3), 15);
                    }
                }
            }
        }
        yhk.s("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
        return null;
    }

    public static e92 d(View view) {
        int i = R.id.description;
        TextView textView = (TextView) nq8.B(R.id.description, view);
        if (textView != null) {
            i = R.id.flag;
            ImageView imageView = (ImageView) nq8.B(R.id.flag, view);
            if (imageView != null) {
                i = R.id.grid_item_bottom_layout;
                if (((LinearLayout) nq8.B(R.id.grid_item_bottom_layout, view)) != null) {
                    i = R.id.secondary_text;
                    TextView textView2 = (TextView) nq8.B(R.id.secondary_text, view);
                    if (textView2 != null) {
                        i = R.id.text;
                        TextView textView3 = (TextView) nq8.B(R.id.text, view);
                        if (textView3 != null) {
                            return new e92((ViewGroup) view, (View) textView, imageView, textView2, textView3, 19);
                        }
                    }
                }
            }
        }
        yhk.s("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
        return null;
    }

    public static e92 e(View view) {
        int i = R.id.info;
        TextView textView = (TextView) nq8.B(R.id.info, view);
        if (textView != null) {
            i = R.id.standings_row_type_chooser;
            TypeHeaderView typeHeaderView = (TypeHeaderView) nq8.B(R.id.standings_row_type_chooser, view);
            if (typeHeaderView != null) {
                ConstraintLayout constraintLayout = (ConstraintLayout) view;
                i = R.id.switcher_text;
                LinearLayout linearLayout = (LinearLayout) nq8.B(R.id.switcher_text, view);
                if (linearLayout != null) {
                    i = R.id.title;
                    TextView textView2 = (TextView) nq8.B(R.id.title, view);
                    if (textView2 != null) {
                        return new e92((ViewGroup) constraintLayout, (Object) textView, (Object) typeHeaderView, (Object) linearLayout, (Object) textView2, 22);
                    }
                }
            }
        }
        yhk.s("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
        return null;
    }

    public static e92 f(LayoutInflater layoutInflater) {
        View inflate = layoutInflater.inflate(R.layout.dialog_config, (ViewGroup) null, false);
        int i = R.id.lower_vertical_divider;
        View B = nq8.B(R.id.lower_vertical_divider, inflate);
        if (B != null) {
            i = R.id.recycler_view;
            RecyclerView recyclerView = (RecyclerView) nq8.B(R.id.recycler_view, inflate);
            if (recyclerView != null) {
                i = R.id.spinner_params;
                Spinner spinner = (Spinner) nq8.B(R.id.spinner_params, inflate);
                if (spinner != null) {
                    i = R.id.upper_vertical_divider;
                    View B2 = nq8.B(R.id.upper_vertical_divider, inflate);
                    if (B2 != null) {
                        return new e92((ViewGroup) inflate, (Object) B, (Object) recyclerView, (Object) spinner, (Object) B2, 5);
                    }
                }
            }
        }
        yhk.s("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
        return null;
    }

    public static e92 g(LayoutInflater layoutInflater) {
        View inflate = layoutInflater.inflate(R.layout.dialog_follow, (ViewGroup) null, false);
        int i = R.id.dialog_follow_bell;
        if (((ImageView) nq8.B(R.id.dialog_follow_bell, inflate)) != null) {
            i = R.id.dialog_follow_dont_show_again;
            MaterialCheckBox materialCheckBox = (MaterialCheckBox) nq8.B(R.id.dialog_follow_dont_show_again, inflate);
            if (materialCheckBox != null) {
                i = R.id.dialog_follow_logo;
                ImageView imageView = (ImageView) nq8.B(R.id.dialog_follow_logo, inflate);
                if (imageView != null) {
                    i = R.id.dialog_follow_team_name;
                    TextView textView = (TextView) nq8.B(R.id.dialog_follow_team_name, inflate);
                    if (textView != null) {
                        i = R.id.dialog_follow_text;
                        TextView textView2 = (TextView) nq8.B(R.id.dialog_follow_text, inflate);
                        if (textView2 != null) {
                            i = R.id.dialog_following_text;
                            if (((TextView) nq8.B(R.id.dialog_following_text, inflate)) != null) {
                                return new e92((ViewGroup) inflate, (View) materialCheckBox, imageView, textView, textView2, 6);
                            }
                        }
                    }
                }
            }
        }
        yhk.s("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
        return null;
    }

    public static e92 h(LayoutInflater layoutInflater) {
        View inflate = layoutInflater.inflate(R.layout.favorite_list_popup, (ViewGroup) null, false);
        int i = R.id.divider;
        View B = nq8.B(R.id.divider, inflate);
        if (B != null) {
            i = R.id.mute;
            View B2 = nq8.B(R.id.mute, inflate);
            if (B2 != null) {
                nfc a = nfc.a(B2);
                i = R.id.popup;
                LinearLayout linearLayout = (LinearLayout) nq8.B(R.id.popup, inflate);
                if (linearLayout != null) {
                    i = R.id.remove_event;
                    View B3 = nq8.B(R.id.remove_event, inflate);
                    if (B3 != null) {
                        return new e92((FrameLayout) inflate, (Object) B, a, (Object) linearLayout, (Object) nfc.a(B3), 7);
                    }
                }
            }
        }
        yhk.s("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
        return null;
    }

    public static e92 i(LayoutInflater layoutInflater) {
        View inflate = layoutInflater.inflate(R.layout.menu_panel_label_popup, (ViewGroup) null, false);
        int i = R.id.player_one;
        View B = nq8.B(R.id.player_one, inflate);
        if (B != null) {
            nfc a = nfc.a(B);
            i = R.id.player_three;
            View B2 = nq8.B(R.id.player_three, inflate);
            if (B2 != null) {
                nfc a2 = nfc.a(B2);
                i = R.id.player_two;
                View B3 = nq8.B(R.id.player_two, inflate);
                if (B3 != null) {
                    nfc a3 = nfc.a(B3);
                    i = R.id.popup;
                    LinearLayout linearLayout = (LinearLayout) nq8.B(R.id.popup, inflate);
                    if (linearLayout != null) {
                        return new e92((FrameLayout) inflate, (Object) a, a2, (Object) a3, (Object) linearLayout, 13);
                    }
                }
            }
        }
        yhk.s("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
        return null;
    }

    @Override // defpackage.krk
    public final View getRoot() {
        int i = this.a;
        Object obj = this.b;
        Object obj2 = this.e;
        switch (i) {
            case 0:
                return (ConstraintLayout) obj2;
            case 1:
                return (FrameLayout) obj;
            case 2:
                return (ConstraintLayout) obj2;
            case 3:
                return (ConstraintLayout) obj2;
            case 4:
                return (LinearLayout) obj2;
            case 5:
                return (RelativeLayout) obj2;
            case 6:
                return (ConstraintLayout) obj2;
            case 7:
                return (FrameLayout) obj;
            case 8:
                return (ConstraintLayout) obj2;
            case 9:
                return (LinearLayout) obj2;
            case 10:
                return (ConstraintLayout) obj2;
            case 11:
                return (ConstraintLayout) obj2;
            case 12:
                return (ConstraintLayout) obj2;
            case 13:
                return (FrameLayout) obj;
            case 14:
                return (MaterialCardView) obj2;
            case 15:
                return (LinearLayout) obj2;
            case 16:
                return (ConstraintLayout) obj2;
            case 17:
                return (LinearLayout) obj2;
            case 18:
                return (LinearLayout) obj2;
            case 19:
                return (LinearLayout) obj2;
            case 20:
                return (LinearLayout) obj2;
            case 21:
                return (ConstraintLayout) obj2;
            case 22:
                return (ConstraintLayout) obj2;
            case 23:
                return (ConstraintLayout) obj2;
            case 24:
                return (ConstraintLayout) obj2;
            case 25:
                return (LinearLayout) obj2;
            default:
                return (FeaturedTournamentHeaderView) obj2;
        }
    }

    public /* synthetic */ e92(ViewGroup viewGroup, Object obj, ViewGroup viewGroup2, Object obj2, View view, int i) {
        this.a = i;
        this.e = viewGroup;
        this.d = obj;
        this.b = viewGroup2;
        this.c = obj2;
        this.f = view;
    }

    public /* synthetic */ e92(ViewGroup viewGroup, Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.a = i;
        this.e = viewGroup;
        this.d = obj;
        this.b = obj2;
        this.f = obj3;
        this.c = obj4;
    }

    public /* synthetic */ e92(FrameLayout frameLayout, Object obj, nfc nfcVar, Object obj2, Object obj3, int i) {
        this.a = i;
        this.b = frameLayout;
        this.e = obj;
        this.d = nfcVar;
        this.f = obj2;
        this.c = obj3;
    }

    public e92(FrameLayout frameLayout, ImageView imageView, TextView textView, ShapeableImageView shapeableImageView, TextView textView2) {
        this.a = 1;
        this.b = frameLayout;
        this.c = imageView;
        this.e = textView;
        this.d = shapeableImageView;
        this.f = textView2;
    }

    public /* synthetic */ e92(ViewGroup viewGroup, View view, ImageView imageView, TextView textView, TextView textView2, int i) {
        this.a = i;
        this.e = viewGroup;
        this.d = view;
        this.c = imageView;
        this.b = textView;
        this.f = textView2;
    }

    public e92(LinearLayout linearLayout, MaterialAutoCompleteTextView materialAutoCompleteTextView, MaterialAutoCompleteTextView materialAutoCompleteTextView2, RadioGroup radioGroup, RadioButton radioButton, RadioButton radioButton2) {
        this.a = 17;
        this.e = linearLayout;
        this.d = materialAutoCompleteTextView;
        this.b = materialAutoCompleteTextView2;
        this.f = radioGroup;
        this.c = radioButton2;
    }

    public e92(ConstraintLayout constraintLayout, ImageView imageView, ImageView imageView2, ImageView imageView3, ImageView imageView4, ImageView imageView5, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5, TextView textView6, ImageView imageView6, TextView textView7, SofascoreRatingView sofascoreRatingView) {
        this.a = 21;
        this.e = constraintLayout;
        this.d = textView;
        this.c = imageView6;
        this.b = textView7;
        this.f = sofascoreRatingView;
    }
}
