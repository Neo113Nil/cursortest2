package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Insets;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.view.WindowManager;
import android.view.WindowMetrics;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentActivity;
import com.appsflyer.internal.i;
import com.sofascore.model.cuptree.CupTreeBlock;
import com.sofascore.model.cuptree.CupTreeParticipant;
import com.sofascore.model.cuptree.CupTreeRound;
import com.sofascore.results.R;
import com.sofascore.results.dialog.CupTreeDialog;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class v02 implements u02, mal {
    public static final v02 a = new v02();
    public static final v02 b = new v02();
    public static final v02 c = new v02();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:49:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00ca  */
    /* JADX WARN: Type inference failed for: r10v3, types: [android.view.View, androidx.constraintlayout.widget.ConstraintLayout] */
    /* JADX WARN: Type inference failed for: r10v4, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v5 */
    /* JADX WARN: Type inference failed for: r11v6, types: [mm3] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void a(Context context, int i, j84 j84Var, j84 j84Var2, CupTreeBlock cupTreeBlock, List list, j94 j94Var, q8g q8gVar, Integer num) {
        boolean z;
        View inflate;
        List<CupTreeParticipant> participants;
        int s = ao2.s(18, context);
        if (cupTreeBlock != null && (participants = cupTreeBlock.getParticipants()) != null && participants.size() == 2) {
            CupTreeParticipant awayParticipant = cupTreeBlock.getAwayParticipant();
            if (Intrinsics.c(awayParticipant != null ? Boolean.valueOf(awayParticipant.getWinner()) : null, Boolean.TRUE)) {
                z = true;
                LayoutInflater from = LayoutInflater.from(context);
                from.getClass();
                inflate = from.inflate(R.layout.trophy_view, (ViewGroup) null, false);
                int i2 = R.id.icon_bottom;
                if (((ImageView) nq8.B(R.id.icon_bottom, inflate)) != null) {
                    i2 = R.id.icon_top;
                    ImageView imageView = (ImageView) nq8.B(R.id.icon_top, inflate);
                    if (imageView != null) {
                        ?? r10 = (ConstraintLayout) inflate;
                        r10.setLayoutParams(new tl3(i, -2));
                        if (z) {
                            ?? mm3Var = new mm3();
                            mm3Var.e(r10);
                            mm3Var.d(imageView.getId(), 7);
                            mm3Var.f(imageView.getId(), 6, 0, 6);
                            mm3Var.a(r10);
                        }
                        boolean z2 = j94Var instanceof i94;
                        if (z2) {
                            i94 i94Var = (i94) j94Var;
                            ArrayList arrayList = i94Var.a;
                            if (i94Var.c == 1 && arrayList.size() > 1) {
                                j84Var2.e(r8g.d, q8gVar);
                                j84Var2.c((CupTreeBlock) arrayList.get(1), num, new d84(context, num, 1));
                                j84 j84Var3 = !z ? j84Var2 : r10;
                                if (!z) {
                                    r10 = j84Var2;
                                }
                                if (z2) {
                                    j84Var.e(((i94) j94Var).b, q8gVar);
                                }
                                if (cupTreeBlock != null) {
                                    j84Var.c(cupTreeBlock, num, new d84(context, num, 2));
                                }
                                View view = new View(context);
                                view.setLayoutParams(new ViewGroup.LayoutParams(s, -2));
                                View view2 = new View(context);
                                view2.setLayoutParams(new ViewGroup.LayoutParams(s, -2));
                                if (!z) {
                                    list.add(view);
                                }
                                list.add(j84Var3);
                                if (z) {
                                    list.add(view);
                                }
                                list.add(j84Var);
                                if (!z) {
                                    list.add(view2);
                                }
                                list.add(r10);
                                if (z) {
                                    return;
                                }
                                list.add(view2);
                                return;
                            }
                        }
                        j84Var2.setLayoutParams(new ViewGroup.LayoutParams(i, -2));
                        j84Var2.setVisibility(4);
                        if (!z) {
                        }
                        if (!z) {
                        }
                        if (z2) {
                        }
                        if (cupTreeBlock != null) {
                        }
                        View view3 = new View(context);
                        view3.setLayoutParams(new ViewGroup.LayoutParams(s, -2));
                        View view22 = new View(context);
                        view22.setLayoutParams(new ViewGroup.LayoutParams(s, -2));
                        if (!z) {
                        }
                        list.add(j84Var3);
                        if (z) {
                        }
                        list.add(j84Var);
                        if (!z) {
                        }
                        list.add(r10);
                        if (z) {
                        }
                    }
                }
                yhk.s("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i2)));
            }
        }
        z = false;
        LayoutInflater from2 = LayoutInflater.from(context);
        from2.getClass();
        inflate = from2.inflate(R.layout.trophy_view, (ViewGroup) null, false);
        int i22 = R.id.icon_bottom;
        if (((ImageView) nq8.B(R.id.icon_bottom, inflate)) != null) {
        }
        yhk.s("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i22)));
    }

    public static TextView b(int i, Context context) {
        Typeface typeface;
        TextView textView = new TextView(context);
        int s = ao2.s(16, context);
        int s2 = ao2.s(344, context);
        int s3 = ao2.s(360, context);
        try {
            typeface = z1g.a(R.font.sofascore_sans_regular, context);
        } catch (Exception unused) {
            typeface = Typeface.DEFAULT;
        }
        textView.setTypeface(typeface);
        textView.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        textView.setPadding(s, s, s, s);
        textView.setBackground(context.getDrawable(R.drawable.cup_tree_item_background));
        textView.setBackgroundTintList(ColorStateList.valueOf(context.getColor(i)));
        textView.setTextSize(2, 14.0f);
        haa.C(textView);
        textView.setMinWidth(h(s3, context) ? s2 : 0);
        textView.setMaxWidth(s2);
        textView.setMaxLines(2);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setGravity(17);
        textView.setText(context.getString(R.string.next_round_matches_to_be_determined));
        return textView;
    }

    public static String c(int i, Context context) {
        if (i == 1) {
            return context.getString(R.string.final_string);
        }
        if (i == 2) {
            return context.getString(R.string.semifinals);
        }
        if (i == 4) {
            return context.getString(R.string.bracket_round_of_8_quarterfinals_short);
        }
        if (i == 8) {
            return context.getString(R.string.bracket_round_of_16_short);
        }
        if (i == 16) {
            return context.getString(R.string.bracket_round_of_32_short);
        }
        if (i == 32) {
            return context.getString(R.string.bracket_round_of_64_short);
        }
        if (i == 64) {
            return context.getString(R.string.bracket_round_of_128_short);
        }
        if (101 <= i && i < 110) {
            return context.getString(R.string.bracket_round_short, Integer.valueOf(i - 100));
        }
        if (201 > i || i >= 207) {
            return null;
        }
        return context.getString(R.string.bracket_qualification_round_short, Integer.valueOf(i - 200));
    }

    public static String d(Context context, int i, Integer num, String str) {
        context.getClass();
        if (num != null && num.intValue() == 11205) {
            return i != 1 ? i != 2 ? i != 4 ? i != 8 ? c(i, context) : context.getString(R.string.baseball_wild_card) : context.getString(R.string.baseball_division_series) : context.getString(R.string.baseball_league_championship) : context.getString(R.string.baseball_world_series);
        }
        if (num == null || num.intValue() != 132) {
            return (num != null && num.intValue() == 9464) ? i != 1 ? i != 2 ? i != 4 ? i != 8 ? c(i, context) : context.getString(R.string.nfl_playoffs_wild_card) : context.getString(R.string.nfl_playoffs_divisional) : context.getString(R.string.nfl_playoffs_conference) : context.getString(R.string.nfl_playoffs_super_bowl) : c(i, context);
        }
        if (str != null) {
            Locale locale = Locale.US;
            String k = i.k(locale, str, locale);
            if (StringsKt.J(k, "cup", false) || StringsKt.J(k, "tournament", false)) {
                return i != 1 ? i != 2 ? i != 4 ? c(i, context) : context.getString(R.string.quarterfinals) : context.getString(R.string.semifinals) : context.getString(R.string.final_string);
            }
        }
        return i != 1 ? i != 2 ? i != 4 ? i != 8 ? c(i, context) : context.getString(R.string.nba_playoffs_first_round) : context.getString(R.string.nba_playoffs_conference_semifinals) : context.getString(R.string.nba_playoffs_conference_finals) : context.getString(R.string.nba_playoffs_finals);
    }

    public static boolean h(int i, Context context) {
        WindowManager windowManager;
        Display defaultDisplay;
        Rect bounds;
        WindowInsets windowInsets;
        WindowManager windowManager2;
        context.getClass();
        if (Build.VERSION.SDK_INT >= 30) {
            FragmentActivity K = hkg.K(context);
            Insets insets = null;
            WindowMetrics currentWindowMetrics = (K == null || (windowManager2 = K.getWindowManager()) == null) ? null : windowManager2.getCurrentWindowMetrics();
            if (currentWindowMetrics != null && (windowInsets = currentWindowMetrics.getWindowInsets()) != null) {
                insets = windowInsets.getInsetsIgnoringVisibility(WindowInsets.Type.systemBars());
            }
            if ((((currentWindowMetrics == null || (bounds = currentWindowMetrics.getBounds()) == null) ? 0 : bounds.width()) - (insets != null ? insets.left : 0)) - (insets != null ? insets.right : 0) >= i) {
                return true;
            }
        } else {
            DisplayMetrics displayMetrics = new DisplayMetrics();
            FragmentActivity K2 = hkg.K(context);
            if (K2 != null && (windowManager = K2.getWindowManager()) != null && (defaultDisplay = windowManager.getDefaultDisplay()) != null) {
                defaultDisplay.getMetrics(displayMetrics);
            }
            if (displayMetrics.widthPixels >= i) {
                return true;
            }
        }
        return false;
    }

    public static boolean i(List list) {
        int type;
        ArrayList k = me4.k(list);
        for (Object obj : list) {
            if (((CupTreeRound) obj).getType() <= 8) {
                k.add(obj);
            }
        }
        if (!k.isEmpty() && ((type = ((CupTreeRound) k.get(0)).getType()) == 1 || type == 2 || type == 4 || type == 8)) {
            int size = k.size();
            for (int i = 1; i < size; i++) {
                type *= 2;
                if (type > 8) {
                    break;
                }
                if (((CupTreeRound) k.get(i)).getType() == type) {
                }
            }
            return true;
        }
        return false;
    }

    public static void j(ArrayList arrayList) {
        if (arrayList.size() < 2) {
            return;
        }
        CupTreeRound cupTreeRound = (CupTreeRound) arrayList.get(arrayList.size() - 1);
        CupTreeRound cupTreeRound2 = (CupTreeRound) arrayList.get(arrayList.size() - 2);
        if (cupTreeRound.getType() == 0 && cupTreeRound2.getType() == 1) {
            cupTreeRound2.getBlocks().addAll(cupTreeRound.getBlocks());
            arrayList.remove(cupTreeRound);
        }
    }

    public static void l(Context context, List list, Integer num) {
        FragmentActivity O = hkg.O(context);
        if (O != null) {
            CupTreeDialog cupTreeDialog = new CupTreeDialog();
            Bundle bundle = new Bundle();
            bundle.putIntegerArrayList("ID_LIST", (ArrayList) list);
            if (num != null) {
                bundle.putInt("FROM_UNIQUE_TOURNAMENT_ID", num.intValue());
            }
            cupTreeDialog.setArguments(bundle);
            rq3 rq3Var = null;
            AppCompatActivity appCompatActivity = O instanceof AppCompatActivity ? (AppCompatActivity) O : null;
            if (appCompatActivity != null) {
                wca.x(appCompatActivity.getLifecycle()).b(new r1(cupTreeDialog, appCompatActivity, rq3Var, 3));
            }
        }
    }

    public static void m(List list, int i, ArrayList arrayList, ArrayList arrayList2) {
        list.getClass();
        for (int i2 = 0; i2 < i; i2++) {
            Iterator it = list.iterator();
            CupTreeBlock cupTreeBlock = null;
            while (it.hasNext()) {
                CupTreeBlock cupTreeBlock2 = (CupTreeBlock) it.next();
                if (cupTreeBlock2.getOrder() == i2 + 1) {
                    cupTreeBlock = cupTreeBlock2;
                }
            }
            if (cupTreeBlock != null) {
                if (i2 < i / 2) {
                    arrayList.add(cupTreeBlock);
                } else {
                    arrayList2.add(cupTreeBlock);
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x015a, code lost:
    
        if (r4 == r6) goto L76;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:22:0x023f  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01bc A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0031  */
    /* JADX WARN: Type inference failed for: r10v18, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r7v14, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v12, types: [j84, rq3] */
    /* JADX WARN: Type inference failed for: r8v14 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:44:0x015a -> B:24:0x0089). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object e(Context context, j94 j94Var, int i, q8g q8gVar, Integer num, sq3 sq3Var) {
        e84 e84Var;
        lu3 lu3Var;
        int i2;
        ViewGroup.LayoutParams layoutParams;
        Context context2;
        int i3;
        q8g q8gVar2;
        List list;
        j94 j94Var2;
        int i4;
        Integer num2;
        int i5;
        int i6;
        int i7;
        e84 e84Var2;
        ArrayList arrayList;
        Integer num3;
        q8g q8gVar3;
        Integer num4;
        Context context3;
        ArrayList arrayList2;
        j94 j94Var3;
        int i8;
        int i9;
        int i10;
        int i11;
        j84 j84Var;
        i94 i94Var;
        int i12;
        ArrayList arrayList3;
        ArrayList arrayList4;
        Object r;
        int i13;
        List list2;
        j84 j84Var2;
        Integer num5;
        q8g q8gVar4;
        j94 j94Var4;
        Context context4;
        Context context5 = context;
        j94 j94Var5 = j94Var;
        int i14 = i;
        q8g q8gVar5 = q8gVar;
        if (sq3Var instanceof e84) {
            e84Var = (e84) sq3Var;
            int i15 = e84Var.D;
            if ((i15 & Integer.MIN_VALUE) != 0) {
                e84Var.D = i15 - Integer.MIN_VALUE;
                Object obj = e84Var.B;
                lu3Var = lu3.a;
                i2 = e84Var.D;
                ?? r8 = 0;
                if (i2 != 0) {
                    ArrayList u = fc6.u(obj);
                    int v = ao2.v(4, context5);
                    int v2 = ao2.v(8, context5);
                    if (!(j94Var5 instanceof i94)) {
                        if (j94Var5 instanceof h94) {
                            int ordinal = ((h94) j94Var5).a.ordinal();
                            if (ordinal != 0) {
                                if (ordinal == 1) {
                                    View view = new View(context5);
                                    view.setLayoutParams(new ViewGroup.LayoutParams(((i14 + v2) * 2) + v, v));
                                    view.setBackgroundColor(context5.getColor(q8gVar5.a));
                                    u.add(view);
                                    return u;
                                }
                                if (ordinal != 2) {
                                    if (ordinal == 3) {
                                        u.add(b(q8gVar5.a, context5));
                                        return u;
                                    }
                                    if (ordinal == 4) {
                                        u.add(b(q8gVar5.a, context5));
                                        return u;
                                    }
                                    zzl.b();
                                    return null;
                                }
                                e84Var.r = context5;
                                e84Var.s = j94Var5;
                                e84Var.t = q8gVar5;
                                e84Var.u = num;
                                e84Var.v = u;
                                e84Var.x = i14;
                                e84Var.y = v;
                                e84Var.z = v2;
                                e84Var.D = 3;
                                Object r2 = s9a.r(new g84(i14, null, context5), e84Var);
                                if (r2 != lu3Var) {
                                    context2 = context5;
                                    i3 = v2;
                                    q8gVar2 = q8gVar5;
                                    list = u;
                                    obj = r2;
                                    j94Var2 = j94Var5;
                                    i4 = v;
                                    num2 = num;
                                }
                                return lu3Var;
                            }
                            for (int i16 = 0; i16 < 3; i16++) {
                                View view2 = new View(context5);
                                if (i16 != 1) {
                                    view2.setBackgroundColor(context5.getColor(q8gVar5.a));
                                    layoutParams = new ViewGroup.LayoutParams(i14 + v2 + v, v);
                                } else {
                                    layoutParams = new ViewGroup.LayoutParams(i14 - (v2 + v), v);
                                }
                                view2.setLayoutParams(layoutParams);
                                u.add(view2);
                            }
                            Unit unit = Unit.a;
                        }
                        return u;
                    }
                    i5 = v2;
                    i6 = 0;
                    i7 = v;
                    e84Var2 = e84Var;
                    arrayList = u;
                    num3 = num;
                    if (i6 < Math.ceil(((i94) j94Var5).c / 2.0d)) {
                    }
                } else if (i2 == 1) {
                    i11 = e84Var.A;
                    i10 = e84Var.z;
                    i9 = e84Var.y;
                    i8 = e84Var.x;
                    ?? r7 = e84Var.v;
                    Integer num6 = e84Var.u;
                    q8g q8gVar6 = e84Var.t;
                    j94 j94Var6 = e84Var.s;
                    Context context6 = e84Var.r;
                    y6a.M(obj);
                    num4 = num6;
                    j94Var3 = j94Var6;
                    context3 = context6;
                    q8gVar3 = q8gVar6;
                    arrayList2 = r7;
                    j84Var = (j84) obj;
                    i94Var = (i94) j94Var3;
                    i12 = i94Var.c;
                    arrayList3 = i94Var.a;
                    if (i12 == 4) {
                    }
                    arrayList4 = arrayList3;
                    if (i94Var.c != 1) {
                    }
                } else if (i2 == 2) {
                    i11 = e84Var.A;
                    i10 = e84Var.z;
                    i9 = e84Var.y;
                    i8 = e84Var.x;
                    j84Var = e84Var.w;
                    ?? r10 = e84Var.v;
                    num4 = e84Var.u;
                    q8gVar3 = e84Var.t;
                    j94Var3 = e84Var.s;
                    context3 = e84Var.r;
                    y6a.M(obj);
                    ArrayList arrayList5 = r10;
                    q8g q8gVar7 = q8gVar3;
                    Integer num7 = num4;
                    int i17 = i8;
                    j94 j94Var7 = j94Var3;
                    ArrayList arrayList6 = arrayList5;
                    j84 j84Var3 = j84Var;
                    Context context7 = context3;
                    j84 j84Var4 = (j84) obj;
                    i94 i94Var2 = (i94) j94Var7;
                    if (i11 < i94Var2.a.size()) {
                        a(context7, i17, j84Var3, j84Var4, (CupTreeBlock) i94Var2.a.get(i11), arrayList6, j94Var7, q8gVar7, num7);
                    } else {
                        a(context7, i17, j84Var3, j84Var4, null, arrayList6, j94Var7, q8gVar7, num7);
                    }
                    i5 = i10;
                    i7 = i9;
                    context3 = context7;
                    i14 = i17;
                    j94Var5 = j94Var7;
                    q8gVar5 = q8gVar7;
                    num3 = num7;
                    e84Var2 = e84Var;
                    arrayList = arrayList6;
                    Context context8 = context3;
                    i6 = i11 + 1;
                    context5 = context8;
                    r8 = 0;
                    if (i6 < Math.ceil(((i94) j94Var5).c / 2.0d)) {
                        e84Var2.r = context5;
                        e84Var2.s = j94Var5;
                        e84Var2.t = q8gVar5;
                        e84Var2.u = num3;
                        e84Var2.v = arrayList;
                        e84Var2.w = r8;
                        e84Var2.x = i14;
                        e84Var2.y = i7;
                        e84Var2.z = i5;
                        e84Var2.A = i6;
                        e84Var2.D = 1;
                        Object r3 = s9a.r(new g84(i14, r8, context5), e84Var2);
                        if (r3 != lu3Var) {
                            int i18 = i6;
                            context3 = context5;
                            i11 = i18;
                            q8gVar3 = q8gVar5;
                            num4 = num3;
                            obj = r3;
                            i8 = i14;
                            i9 = i7;
                            j94Var3 = j94Var5;
                            i10 = i5;
                            arrayList2 = arrayList;
                            e84Var = e84Var2;
                            j84Var = (j84) obj;
                            i94Var = (i94) j94Var3;
                            i12 = i94Var.c;
                            arrayList3 = i94Var.a;
                            if (i12 == 4 || i11 != 1) {
                                arrayList4 = arrayList3;
                            } else {
                                View view3 = new View(context3);
                                arrayList4 = arrayList3;
                                view3.setLayoutParams(new ViewGroup.LayoutParams(i8, -2));
                                arrayList2.add(view3);
                            }
                            if (i94Var.c != 1) {
                                e84Var.r = context3;
                                e84Var.s = j94Var3;
                                e84Var.t = q8gVar3;
                                e84Var.u = num4;
                                e84Var.v = arrayList2;
                                e84Var.w = j84Var;
                                e84Var.x = i8;
                                e84Var.y = i9;
                                e84Var.z = i10;
                                e84Var.A = i11;
                                e84Var.D = 2;
                                obj = s9a.r(new g84(i8, null, context3), e84Var);
                                arrayList5 = arrayList2;
                            } else {
                                j84Var.e(i94Var.b, q8gVar3);
                                if (i11 < arrayList4.size()) {
                                    j84Var.c((CupTreeBlock) arrayList4.get(i11), num4, new d84(context3, num4, 0));
                                    arrayList2.add(j84Var);
                                    e84Var2 = e84Var;
                                    arrayList = arrayList2;
                                    num3 = num4;
                                    i5 = i10;
                                    j94Var5 = j94Var3;
                                    i7 = i9;
                                    i14 = i8;
                                    q8gVar5 = q8gVar3;
                                } else {
                                    arrayList2.add(j84Var);
                                    e84Var2 = e84Var;
                                    arrayList = arrayList2;
                                    num3 = num4;
                                    i5 = i10;
                                    j94Var5 = j94Var3;
                                    i7 = i9;
                                    i14 = i8;
                                    q8gVar5 = q8gVar3;
                                }
                                Context context82 = context3;
                                i6 = i11 + 1;
                                context5 = context82;
                                r8 = 0;
                                if (i6 < Math.ceil(((i94) j94Var5).c / 2.0d)) {
                                    return arrayList;
                                }
                            }
                        }
                        return lu3Var;
                    }
                } else {
                    if (i2 != 3) {
                        if (i2 != 4) {
                            a70.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        int i19 = e84Var.x;
                        j84 j84Var5 = e84Var.w;
                        List list3 = e84Var.v;
                        Integer num8 = e84Var.u;
                        q8g q8gVar8 = e84Var.t;
                        j94 j94Var8 = e84Var.s;
                        Context context9 = e84Var.r;
                        y6a.M(obj);
                        i13 = i19;
                        j84Var2 = j84Var5;
                        list2 = list3;
                        num5 = num8;
                        context4 = context9;
                        q8gVar4 = q8gVar8;
                        j94Var4 = j94Var8;
                        a(context4, i13, j84Var2, (j84) obj, null, list2, j94Var4, q8gVar4, num5);
                        Unit unit2 = Unit.a;
                        return list2;
                    }
                    i3 = e84Var.z;
                    i4 = e84Var.y;
                    i14 = e84Var.x;
                    list = e84Var.v;
                    num2 = e84Var.u;
                    q8gVar2 = e84Var.t;
                    j94Var2 = e84Var.s;
                    context2 = e84Var.r;
                    y6a.M(obj);
                }
                j84 j84Var6 = (j84) obj;
                e84Var.r = context2;
                e84Var.s = j94Var2;
                e84Var.t = q8gVar2;
                e84Var.u = num2;
                e84Var.v = list;
                e84Var.w = j84Var6;
                e84Var.x = i14;
                e84Var.y = i4;
                e84Var.z = i3;
                e84Var.D = 4;
                r = s9a.r(new g84(i14, null, context2), e84Var);
                if (r != lu3Var) {
                    i13 = i14;
                    list2 = list;
                    j84Var2 = j84Var6;
                    num5 = num2;
                    q8gVar4 = q8gVar2;
                    j94Var4 = j94Var2;
                    context4 = context2;
                    obj = r;
                    a(context4, i13, j84Var2, (j84) obj, null, list2, j94Var4, q8gVar4, num5);
                    Unit unit22 = Unit.a;
                    return list2;
                }
                return lu3Var;
            }
        }
        e84Var = new e84(this, sq3Var);
        Object obj2 = e84Var.B;
        lu3Var = lu3.a;
        i2 = e84Var.D;
        ?? r82 = 0;
        if (i2 != 0) {
        }
        j84 j84Var62 = (j84) obj2;
        e84Var.r = context2;
        e84Var.s = j94Var2;
        e84Var.t = q8gVar2;
        e84Var.u = num2;
        e84Var.v = list;
        e84Var.w = j84Var62;
        e84Var.x = i14;
        e84Var.y = i4;
        e84Var.z = i3;
        e84Var.D = 4;
        r = s9a.r(new g84(i14, null, context2), e84Var);
        if (r != lu3Var) {
        }
        return lu3Var;
    }

    @Override // defpackage.u02
    public Rect f(Activity activity) {
        Rect bounds = ((WindowManager) activity.getSystemService(WindowManager.class)).getCurrentWindowMetrics().getBounds();
        bounds.getClass();
        return bounds;
    }

    @Override // defpackage.mal
    public ial g(Context context, lx4 lx4Var) {
        WindowManager windowManager = (WindowManager) context.getSystemService(WindowManager.class);
        float f = context.getResources().getDisplayMetrics().density;
        Rect bounds = windowManager.getCurrentWindowMetrics().getBounds();
        bounds.getClass();
        return new ial(f, bounds);
    }

    @Override // defpackage.mal
    public ial k(Activity activity, lx4 lx4Var) {
        u02.h7.getClass();
        return new ial(new t02(f8h.q().f(activity)), lx4Var.a(activity));
    }
}
