package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import com.sofascore.model.mvvm.model.MissingPlayerData;
import com.sofascore.results.R;
import com.sofascore.results.player.PlayerActivity;
import com.sofascore.results.view.DividerLinearLayout;
import java.util.List;
import java.util.ListIterator;
import kotlin.Pair;
import kotlin.collections.b;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class ykc extends o8 {
    public final dd d;
    public final mqi e;
    public boolean f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ykc(Context context) {
        super(context, null, 0);
        context.getClass();
        View root = getRoot();
        int i = R.id.first_team;
        View B = nq8.B(R.id.first_team, root);
        if (B != null) {
            dd d = dd.d(B);
            View B2 = nq8.B(R.id.missing_players_title, root);
            if (B2 != null) {
                kqb a = kqb.a(B2);
                int i2 = R.id.players_container;
                if (((LinearLayout) nq8.B(R.id.players_container, root)) != null) {
                    i2 = R.id.second_team;
                    View B3 = nq8.B(R.id.second_team, root);
                    if (B3 != null) {
                        this.d = new dd((LinearLayout) root, d, a, dd.d(B3));
                        this.e = ypa.b(new c6(context, 28));
                        setVisibility(8);
                        o8.d(this, 0, 7);
                        a.d.setText(context.getString(R.string.injuries_and_suspensions));
                        return;
                    }
                }
                i = i2;
            } else {
                i = R.id.missing_players_title;
            }
        }
        yhk.s("Missing required view with ID: ".concat(root.getResources().getResourceName(i)));
        throw null;
    }

    private final LayoutInflater getLayoutInflater() {
        Object value = this.e.getValue();
        value.getClass();
        return (LayoutInflater) value;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1, types: [int] */
    /* JADX WARN: Type inference failed for: r7v3 */
    public static void j(ykc ykcVar, List list, List list2, boolean z) {
        int i;
        View inflate;
        int i2;
        int i3;
        xbb xbbVar;
        ListIterator listIterator;
        int i4;
        ConstraintLayout constraintLayout;
        final int i5;
        ykc ykcVar2 = ykcVar;
        dd ddVar = ykcVar2.d;
        if ((list == null && list2 == null) || ykcVar2.f) {
            return;
        }
        ?? r7 = 1;
        ykcVar2.f = true;
        final int i6 = 0;
        ykcVar2.setVisibility(0);
        dd ddVar2 = (dd) ddVar.c;
        final LinearLayout linearLayout = (LinearLayout) ddVar2.c;
        dd ddVar3 = (dd) ddVar.d;
        DividerLinearLayout dividerLinearLayout = (DividerLinearLayout) ddVar3.b;
        ((DividerLinearLayout) ddVar2.b).setVisibility(0);
        dividerLinearLayout.setVisibility(0);
        linearLayout.removeAllViews();
        ((LinearLayout) ddVar3.c).removeAllViews();
        dk2 dk2Var = (dk2) ddVar2.d;
        TextView textView = dk2Var.c;
        LinearLayout linearLayout2 = dk2Var.b;
        textView.setText(ykcVar2.getContext().getString(R.string.missing_players_empty));
        int i7 = 8;
        if (list != null && !list.isEmpty() && list2 != null && !list2.isEmpty()) {
            linearLayout2.setVisibility(8);
            xbb M = yso.M(list, list2);
            ListIterator listIterator2 = M.listIterator(0);
            int i8 = 0;
            while (true) {
                hc9 hc9Var = (hc9) listIterator2;
                if (!hc9Var.hasNext()) {
                    i = i7;
                    break;
                }
                Object next = hc9Var.next();
                int i9 = i8 + 1;
                if (i8 < 0) {
                    b.q();
                    throw null;
                }
                Pair pair = (Pair) next;
                final MissingPlayerData missingPlayerData = (MissingPlayerData) pair.a;
                final MissingPlayerData missingPlayerData2 = (MissingPlayerData) pair.b;
                boolean z2 = (z || i8 == M.size() - r7) ? r7 : false;
                inflate = ykcVar2.getLayoutInflater().inflate(R.layout.missing_player_combined_team, (ViewGroup) linearLayout, false);
                i2 = R.id.bottom_divider;
                View B = nq8.B(R.id.bottom_divider, inflate);
                if (B == null) {
                    break;
                }
                i2 = R.id.click_target_first;
                View B2 = nq8.B(R.id.click_target_first, inflate);
                if (B2 == null) {
                    break;
                }
                i2 = R.id.click_target_second;
                View B3 = nq8.B(R.id.click_target_second, inflate);
                if (B3 == null) {
                    break;
                }
                ConstraintLayout constraintLayout2 = (ConstraintLayout) inflate;
                i3 = R.id.guideline;
                if (((Guideline) nq8.B(R.id.guideline, inflate)) == null) {
                    break;
                }
                i3 = R.id.layout_image_first;
                ImageView imageView = (ImageView) nq8.B(R.id.layout_image_first, inflate);
                if (imageView == null) {
                    break;
                }
                i3 = R.id.layout_image_second;
                ImageView imageView2 = (ImageView) nq8.B(R.id.layout_image_second, inflate);
                if (imageView2 == null) {
                    break;
                }
                i3 = R.id.missing_reason_first;
                TextView textView2 = (TextView) nq8.B(R.id.missing_reason_first, inflate);
                if (textView2 == null) {
                    break;
                }
                i3 = R.id.missing_reason_second;
                TextView textView3 = (TextView) nq8.B(R.id.missing_reason_second, inflate);
                if (textView3 == null) {
                    break;
                }
                i3 = R.id.player_name_first;
                TextView textView4 = (TextView) nq8.B(R.id.player_name_first, inflate);
                if (textView4 == null) {
                    break;
                }
                i3 = R.id.player_name_second;
                TextView textView5 = (TextView) nq8.B(R.id.player_name_second, inflate);
                if (textView5 == null) {
                    break;
                }
                if (missingPlayerData != null) {
                    xbbVar = M;
                    listIterator = listIterator2;
                    constraintLayout = constraintLayout2;
                    ykcVar2.l(missingPlayerData, z2, B, imageView, textView4, textView2);
                    aba.y(B2, 0, 3);
                    B2.setOnClickListener(new View.OnClickListener() { // from class: xkc
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            int i10 = i6;
                            MissingPlayerData missingPlayerData3 = missingPlayerData;
                            LinearLayout linearLayout3 = linearLayout;
                            switch (i10) {
                                case 0:
                                    int i11 = PlayerActivity.Z;
                                    Context context = linearLayout3.getContext();
                                    context.getClass();
                                    jle.q(context, missingPlayerData3.getPlayer().getId(), 0, null, null, false, null, null, PglCryptUtils.BASE64_FAILED);
                                    break;
                                default:
                                    int i12 = PlayerActivity.Z;
                                    Context context2 = linearLayout3.getContext();
                                    context2.getClass();
                                    jle.q(context2, missingPlayerData3.getPlayer().getId(), 0, null, null, false, null, null, PglCryptUtils.BASE64_FAILED);
                                    break;
                            }
                        }
                    });
                    i4 = 8;
                } else {
                    xbbVar = M;
                    listIterator = listIterator2;
                    i4 = 8;
                    constraintLayout = constraintLayout2;
                    imageView.setVisibility(8);
                    textView4.setVisibility(8);
                    textView2.setVisibility(8);
                }
                if (missingPlayerData2 != null) {
                    ykcVar.l(missingPlayerData2, z2, B, imageView2, textView5, textView3);
                    aba.y(B3, 0, 3);
                    i5 = 1;
                    B3.setOnClickListener(new View.OnClickListener() { // from class: xkc
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            int i10 = i5;
                            MissingPlayerData missingPlayerData3 = missingPlayerData2;
                            LinearLayout linearLayout3 = linearLayout;
                            switch (i10) {
                                case 0:
                                    int i11 = PlayerActivity.Z;
                                    Context context = linearLayout3.getContext();
                                    context.getClass();
                                    jle.q(context, missingPlayerData3.getPlayer().getId(), 0, null, null, false, null, null, PglCryptUtils.BASE64_FAILED);
                                    break;
                                default:
                                    int i12 = PlayerActivity.Z;
                                    Context context2 = linearLayout3.getContext();
                                    context2.getClass();
                                    jle.q(context2, missingPlayerData3.getPlayer().getId(), 0, null, null, false, null, null, PglCryptUtils.BASE64_FAILED);
                                    break;
                            }
                        }
                    });
                } else {
                    i5 = 1;
                    imageView2.setVisibility(i4);
                    textView5.setVisibility(i4);
                    textView3.setVisibility(i4);
                }
                linearLayout.addView(constraintLayout);
                ykcVar2 = ykcVar;
                M = xbbVar;
                listIterator2 = listIterator;
                r7 = i5;
                i8 = i9;
                i7 = 8;
            }
            i2 = i3;
            yhk.s("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i2)));
            return;
        }
        linearLayout2.setVisibility(0);
        i = 8;
        dividerLinearLayout.setVisibility(i);
    }

    @Override // defpackage.o8
    public int getLayoutId() {
        return R.layout.missing_players_layout;
    }

    public final void l(MissingPlayerData missingPlayerData, boolean z, View view, ImageView imageView, TextView textView, TextView textView2) {
        BitmapDrawable bitmapDrawable;
        Context context = getRoot().getContext();
        context.getClass();
        String type = missingPlayerData.getType();
        type.getClass();
        int color = context.getColor(type.equals("missing") ? R.color.error : R.color.alert);
        int s = wib.s(missingPlayerData.getReason());
        int t = wib.t(missingPlayerData.getReason(), R.string.injury_status_out, missingPlayerData.getType(), missingPlayerData.getDescription());
        Drawable drawable = getRoot().getContext().getDrawable(s);
        if (drawable != null) {
            if (wib.v(missingPlayerData.getReason())) {
                v9g.K(drawable, color);
            }
            Context context2 = getContext();
            context2.getClass();
            int s2 = ao2.s(16, context2);
            Context context3 = getContext();
            context3.getClass();
            Bitmap U = u6h.U(drawable, s2, ao2.s(16, context3), 4);
            Resources resources = getResources();
            resources.getClass();
            bitmapDrawable = new BitmapDrawable(resources, U);
        } else {
            bitmapDrawable = null;
        }
        view.setVisibility(!z ? 0 : 8);
        as9.l(imageView, missingPlayerData.getPlayer().getId(), null);
        textView.setText(tba.C(missingPlayerData.getPlayer()));
        textView2.setCompoundDrawablesRelativeWithIntrinsicBounds(bitmapDrawable, (Drawable) null, (Drawable) null, (Drawable) null);
        Context context4 = textView2.getContext();
        context4.getClass();
        textView2.setCompoundDrawablePadding(ao2.s(2, context4));
        textView2.setText(t);
        textView2.setTextColor(color);
    }
}
