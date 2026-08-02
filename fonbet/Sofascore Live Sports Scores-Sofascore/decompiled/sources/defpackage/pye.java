package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.sofascore.model.mvvm.model.Player;
import com.sofascore.model.mvvm.model.ShirtColor;
import com.sofascore.results.R;
import com.sofascore.results.view.typeheader.SegmentedButtonsView;
import com.unity3d.services.UnityAdsConstants;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.b;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.c;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class pye extends o8 {
    public static final /* synthetic */ int F = 0;
    public boolean A;
    public final joa B;
    public Function1 C;
    public Function0 D;
    public boolean E;
    public final j22 d;
    public gye e;
    public final mqi f;
    public final mqi g;
    public final mqi h;
    public final mqi i;
    public final mqi j;
    public final mqi k;
    public final mqi l;
    public final ArrayList m;
    public final ArrayList n;
    public final LinkedHashMap o;
    public final LinkedHashMap p;
    public final LinkedHashMap q;
    public final LinkedHashMap r;
    public final ArrayList s;
    public final LinkedHashMap t;
    public final LinkedHashMap u;
    public final WeakHashMap v;
    public int w;
    public int x;
    public int y;
    public sle z;

    public pye(Context context) {
        super(context, null, 0);
        View root = getRoot();
        int i = R.id.arrow_layout;
        RelativeLayout relativeLayout = (RelativeLayout) nq8.B(R.id.arrow_layout, root);
        if (relativeLayout != null) {
            i = R.id.average_lineups_checkbox;
            CheckBox checkBox = (CheckBox) nq8.B(R.id.average_lineups_checkbox, root);
            if (checkBox != null) {
                i = R.id.average_lineups_heatmap_container;
                ImageView imageView = (ImageView) nq8.B(R.id.average_lineups_heatmap_container, root);
                if (imageView != null) {
                    i = R.id.average_lineups_lines_container;
                    View B = nq8.B(R.id.average_lineups_lines_container, root);
                    if (B != null) {
                        i = R.id.average_positions_layout;
                        ConstraintLayout constraintLayout = (ConstraintLayout) nq8.B(R.id.average_positions_layout, root);
                        if (constraintLayout != null) {
                            i = R.id.field_icon;
                            if (((ImageView) nq8.B(R.id.field_icon, root)) != null) {
                                i = R.id.player_container;
                                RelativeLayout relativeLayout2 = (RelativeLayout) nq8.B(R.id.player_container, root);
                                if (relativeLayout2 != null) {
                                    i = R.id.positions_not_available_layout;
                                    ConstraintLayout constraintLayout2 = (ConstraintLayout) nq8.B(R.id.positions_not_available_layout, root);
                                    if (constraintLayout2 != null) {
                                        i = R.id.remove_selected_player_image;
                                        if (((ImageView) nq8.B(R.id.remove_selected_player_image, root)) != null) {
                                            i = R.id.selected_player_image;
                                            ImageView imageView2 = (ImageView) nq8.B(R.id.selected_player_image, root);
                                            if (imageView2 != null) {
                                                i = R.id.selected_player_layout;
                                                LinearLayout linearLayout = (LinearLayout) nq8.B(R.id.selected_player_layout, root);
                                                if (linearLayout != null) {
                                                    i = R.id.selected_player_low_or_no_player_involvement;
                                                    TextView textView = (TextView) nq8.B(R.id.selected_player_low_or_no_player_involvement, root);
                                                    if (textView != null) {
                                                        i = R.id.selected_player_name;
                                                        TextView textView2 = (TextView) nq8.B(R.id.selected_player_name, root);
                                                        if (textView2 != null) {
                                                            i = R.id.substitutions_container;
                                                            LinearLayout linearLayout2 = (LinearLayout) nq8.B(R.id.substitutions_container, root);
                                                            if (linearLayout2 != null) {
                                                                i = R.id.substitutions_scrollview;
                                                                HorizontalScrollView horizontalScrollView = (HorizontalScrollView) nq8.B(R.id.substitutions_scrollview, root);
                                                                if (horizontalScrollView != null) {
                                                                    i = R.id.team_selector;
                                                                    SegmentedButtonsView segmentedButtonsView = (SegmentedButtonsView) nq8.B(R.id.team_selector, root);
                                                                    if (segmentedButtonsView != null) {
                                                                        i = R.id.terrain_background_holder;
                                                                        View B2 = nq8.B(R.id.terrain_background_holder, root);
                                                                        if (B2 != null) {
                                                                            i = R.id.text_lower;
                                                                            if (((TextView) nq8.B(R.id.text_lower, root)) != null) {
                                                                                i = R.id.text_upper;
                                                                                if (((TextView) nq8.B(R.id.text_upper, root)) != null) {
                                                                                    i = R.id.title;
                                                                                    if (((TextView) nq8.B(R.id.title, root)) != null) {
                                                                                        this.d = new j22((FrameLayout) root, relativeLayout, checkBox, imageView, B, constraintLayout, relativeLayout2, constraintLayout2, imageView2, linearLayout, textView, textView2, linearLayout2, horizontalScrollView, segmentedButtonsView, B2);
                                                                                        this.f = ypa.b(new nzd(context, 20));
                                                                                        this.g = ypa.b(new nzd(context, 21));
                                                                                        this.h = ypa.b(new nzd(context, 22));
                                                                                        this.i = ypa.b(new nzd(context, 23));
                                                                                        this.j = ypa.b(new nzd(context, 24));
                                                                                        this.k = ypa.b(new nzd(context, 25));
                                                                                        this.l = ypa.b(new nzd(context, 26));
                                                                                        this.m = new ArrayList();
                                                                                        this.n = new ArrayList();
                                                                                        this.o = new LinkedHashMap();
                                                                                        this.p = new LinkedHashMap();
                                                                                        this.q = new LinkedHashMap();
                                                                                        this.r = new LinkedHashMap();
                                                                                        this.s = new ArrayList();
                                                                                        this.t = new LinkedHashMap();
                                                                                        this.u = new LinkedHashMap();
                                                                                        this.v = new WeakHashMap();
                                                                                        this.w = -1;
                                                                                        this.x = -1;
                                                                                        this.y = 1;
                                                                                        this.B = ypa.a(ysa.c, new bxe(11));
                                                                                        this.E = true;
                                                                                        return;
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        yhk.s("Missing required view with ID: ".concat(root.getResources().getResourceName(i)));
        throw null;
    }

    private final int getBitmapHeight() {
        return ((Number) this.i.getValue()).intValue();
    }

    private final int getBitmapWidth() {
        return ((Number) this.j.getValue()).intValue();
    }

    private final int getCircleDiameterPx() {
        return ((Number) this.f.getValue()).intValue();
    }

    private final int getCircleRadiusPx() {
        return ((Number) this.g.getValue()).intValue();
    }

    private final int getDpToPx32() {
        return ((Number) this.l.getValue()).intValue();
    }

    private final int getDpToPx4() {
        return ((Number) this.k.getValue()).intValue();
    }

    private final i99 getHeatmapImageGenerator() {
        return (i99) this.B.getValue();
    }

    private final int getLineThicknessPx() {
        return ((Number) this.h.getValue()).intValue();
    }

    public static boolean o(float f, float f2) {
        return ((double) (f - f2)) > 0.1d;
    }

    @Override // defpackage.o8
    public int getLayoutId() {
        return R.layout.players_average_positions_layout;
    }

    @Nullable
    public final Function1<Integer, Unit> getOnPlayerClick() {
        return this.C;
    }

    @Nullable
    public final Function0<Unit> getOnResetHeatmap() {
        return this.D;
    }

    public final ShirtColor j(sle sleVar, int i) {
        if (sleVar.a.getPosition() == null || !c.o(sleVar.a.getPosition(), "G", false)) {
            gye gyeVar = this.e;
            if (i == 1) {
                if (gyeVar != null) {
                    return gyeVar.h;
                }
                Intrinsics.i("playersAveragePositionsData");
                throw null;
            }
            if (gyeVar != null) {
                return gyeVar.j;
            }
            Intrinsics.i("playersAveragePositionsData");
            throw null;
        }
        gye gyeVar2 = this.e;
        if (i == 1) {
            if (gyeVar2 != null) {
                return gyeVar2.i;
            }
            Intrinsics.i("playersAveragePositionsData");
            throw null;
        }
        if (gyeVar2 != null) {
            return gyeVar2.k;
        }
        Intrinsics.i("playersAveragePositionsData");
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0082  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final TextView l(float f, float f2, sle sleVar, ShirtColor shirtColor) {
        Typeface typeface;
        int i;
        Drawable mutate;
        t4k t4kVar;
        TextView textView = new TextView(getContext());
        Context context = getContext();
        if (context != null) {
            try {
                typeface = z1g.a(R.font.sofascore_sans_bold, context);
            } catch (Exception unused) {
                typeface = Typeface.DEFAULT;
            }
        } else {
            typeface = null;
        }
        textView.setTypeface(typeface);
        textView.setLayoutParams(new RelativeLayout.LayoutParams(getCircleDiameterPx(), getCircleDiameterPx()));
        String fancyNumber = shirtColor.getFancyNumber();
        if (fancyNumber != null) {
            if (fancyNumber.length() <= 0) {
                fancyNumber = null;
            }
            if (fancyNumber != null) {
                i = Color.parseColor(fancyNumber);
                textView.setTextColor(i);
                if (shirtColor.getPrimary() != null && Intrinsics.c(shirtColor.getPrimary(), shirtColor.getFancyNumber())) {
                    textView.setShadowLayer(4.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, Color.parseColor(shirtColor.getOutline()));
                }
                Drawable drawable = getContext().getDrawable(R.drawable.circle);
                mutate = drawable != null ? drawable.mutate() : null;
                if (shirtColor.getPrimary() != null) {
                    v9g.K(mutate, Color.parseColor(shirtColor.getPrimary()));
                }
                t4kVar = sleVar.f;
                if ((t4kVar != t4k.a || t4kVar == t4k.b) && mutate != null) {
                    mutate.setAlpha(Sdk.SDKError.Reason.ASSET_FAILED_MAX_SPACE_EXCEEDED_VALUE);
                }
                ((LinearLayout) this.d.o).setOnClickListener(new jye(0, this));
                textView.setBackground(mutate);
                textView.setText(sleVar.a.getJerseyNumber());
                textView.setTextSize(2, 16.0f);
                textView.setGravity(17);
                textView.setOnClickListener(new iye(this, sleVar, 1));
                ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
                layoutParams.getClass();
                ((RelativeLayout.LayoutParams) layoutParams).setMargins((int) f, (int) f2, 0, 0);
                return textView;
            }
        }
        i = 0;
        textView.setTextColor(i);
        if (shirtColor.getPrimary() != null) {
            textView.setShadowLayer(4.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, Color.parseColor(shirtColor.getOutline()));
        }
        Drawable drawable2 = getContext().getDrawable(R.drawable.circle);
        if (drawable2 != null) {
        }
        if (shirtColor.getPrimary() != null) {
        }
        t4kVar = sleVar.f;
        if (t4kVar != t4k.a) {
        }
        mutate.setAlpha(Sdk.SDKError.Reason.ASSET_FAILED_MAX_SPACE_EXCEEDED_VALUE);
        ((LinearLayout) this.d.o).setOnClickListener(new jye(0, this));
        textView.setBackground(mutate);
        textView.setText(sleVar.a.getJerseyNumber());
        textView.setTextSize(2, 16.0f);
        textView.setGravity(17);
        textView.setOnClickListener(new iye(this, sleVar, 1));
        ViewGroup.LayoutParams layoutParams2 = textView.getLayoutParams();
        layoutParams2.getClass();
        ((RelativeLayout.LayoutParams) layoutParams2).setMargins((int) f, (int) f2, 0, 0);
        return textView;
    }

    public final void n(int i) {
        ArrayList arrayList;
        boolean z;
        float f;
        LinkedHashMap linkedHashMap;
        float f2;
        Player player;
        boolean z2 = true;
        ArrayList<sle> arrayList2 = i == 1 ? this.m : null;
        if (arrayList2 == null) {
            arrayList2 = this.n;
        }
        LinkedHashMap linkedHashMap2 = i == 1 ? this.o : null;
        if (linkedHashMap2 == null) {
            linkedHashMap2 = this.p;
        }
        LinkedHashMap linkedHashMap3 = i == 1 ? this.t : null;
        if (linkedHashMap3 == null) {
            linkedHashMap3 = this.u;
        }
        LinkedHashMap linkedHashMap4 = i == 1 ? this.q : null;
        if (linkedHashMap4 == null) {
            linkedHashMap4 = this.r;
        }
        ArrayList arrayList3 = new ArrayList();
        if (arrayList2.isEmpty()) {
            return;
        }
        Collection values = linkedHashMap3.values();
        ArrayList arrayList4 = new ArrayList(k13.r(values, 10));
        Iterator it = values.iterator();
        while (it.hasNext()) {
            arrayList4.add(Integer.valueOf(((sle) it.next()).a.getId()));
        }
        ArrayList arrayList5 = new ArrayList(k13.r(arrayList2, 10));
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            arrayList5.add(Integer.valueOf(((sle) it2.next()).a.getId()));
        }
        Iterator it3 = CollectionsKt.I0(arrayList4, CollectionsKt.W0(arrayList5)).iterator();
        while (true) {
            boolean hasNext = it3.hasNext();
            arrayList = this.s;
            if (!hasNext) {
                break;
            }
            int intValue = ((Number) it3.next()).intValue();
            TextView textView = (TextView) linkedHashMap2.get(Integer.valueOf(intValue));
            if (textView != null) {
                arrayList.add(textView);
            }
            linkedHashMap3.remove(Integer.valueOf(intValue));
        }
        Collection values2 = linkedHashMap4.values();
        ArrayList arrayList6 = new ArrayList();
        Iterator it4 = values2.iterator();
        while (it4.hasNext()) {
            Object tag = ((TextView) it4.next()).getTag();
            sle sleVar = tag instanceof sle ? (sle) tag : null;
            Integer valueOf = (sleVar == null || (player = sleVar.a) == null) ? null : Integer.valueOf(player.getId());
            if (valueOf != null) {
                arrayList6.add(valueOf);
            }
        }
        ArrayList arrayList7 = new ArrayList(k13.r(arrayList2, 10));
        Iterator it5 = arrayList2.iterator();
        while (it5.hasNext()) {
            arrayList7.add(Integer.valueOf(((sle) it5.next()).a.getId()));
        }
        Iterator it6 = CollectionsKt.I0(arrayList6, CollectionsKt.W0(arrayList7)).iterator();
        while (it6.hasNext()) {
            int intValue2 = ((Number) it6.next()).intValue();
            TextView textView2 = (TextView) linkedHashMap4.get(Integer.valueOf(intValue2));
            if (textView2 != null) {
                arrayList.add(textView2);
            }
            linkedHashMap4.remove(Integer.valueOf(intValue2));
        }
        j22 j22Var = this.d;
        float measuredHeight = ((RelativeLayout) j22Var.g).getMeasuredHeight();
        float measuredWidth = ((RelativeLayout) j22Var.g).getMeasuredWidth();
        ArrayList arrayList8 = new ArrayList();
        for (sle sleVar2 : arrayList2) {
            boolean z3 = sleVar2.d;
            Double d = sleVar2.c;
            Double d2 = sleVar2.b;
            boolean z4 = z2;
            Player player2 = sleVar2.a;
            boolean z5 = sleVar2.e;
            if (!z3 || z5) {
                if ((d2 != null ? Float.valueOf((float) d2.doubleValue()) : null) != null) {
                    if ((d != null ? Float.valueOf((float) d.doubleValue()) : null) != null) {
                        Float valueOf2 = d != null ? Float.valueOf((float) d.doubleValue()) : null;
                        float floatValue = valueOf2 != null ? valueOf2.floatValue() : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                        Float valueOf3 = d2 != null ? Float.valueOf((float) d2.doubleValue()) : null;
                        float floatValue2 = valueOf3 != null ? valueOf3.floatValue() : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                        if (i == 2) {
                            floatValue = 100.0f - floatValue;
                            floatValue2 = 100.0f - floatValue2;
                        }
                        float circleRadiusPx = ((floatValue / 100.0f) * measuredWidth) - getCircleRadiusPx();
                        float circleRadiusPx2 = ((floatValue2 / 100.0f) * measuredHeight) - getCircleRadiusPx();
                        if (circleRadiusPx < getLineThicknessPx()) {
                            circleRadiusPx = getLineThicknessPx();
                        } else if (circleRadiusPx > (measuredWidth - getCircleDiameterPx()) - getLineThicknessPx()) {
                            circleRadiusPx = (measuredWidth - getCircleDiameterPx()) - getLineThicknessPx();
                        }
                        if (circleRadiusPx2 < getLineThicknessPx()) {
                            f2 = getLineThicknessPx();
                        } else {
                            if (circleRadiusPx2 > (measuredHeight - getCircleDiameterPx()) - getLineThicknessPx()) {
                                circleRadiusPx2 = (measuredHeight - getCircleDiameterPx()) - getLineThicknessPx();
                            }
                            f2 = circleRadiusPx2;
                        }
                        wub wubVar = new wub();
                        wubVar.a = circleRadiusPx;
                        wubVar.b = f2;
                        arrayList8.add(wubVar);
                        linkedHashMap3.put(Integer.valueOf(player2.getId()), sleVar2);
                        sle sleVar3 = (sle) linkedHashMap3.get(Integer.valueOf(player2.getId()));
                        if (sleVar3 != null) {
                            sleVar3.g = arrayList8.size() - 1;
                        }
                    }
                }
            }
            if (sleVar2.d && z5) {
                arrayList3.add(sleVar2);
            }
            z2 = z4;
        }
        boolean z6 = z2;
        n13.u(new mye(i, this), arrayList3);
        int i2 = 0;
        while (true) {
            int i3 = i2 + 1;
            if (i3 >= 50) {
                z = false;
            } else {
                int size = arrayList8.size();
                int i4 = 0;
                z = false;
                while (i4 < size) {
                    int i5 = i4 + 1;
                    int size2 = arrayList8.size();
                    int i6 = i5;
                    while (i6 < size2) {
                        Object obj = arrayList8.get(i4);
                        obj.getClass();
                        int i7 = i3;
                        wub wubVar2 = (wub) obj;
                        Object obj2 = arrayList8.get(i6);
                        obj2.getClass();
                        int i8 = i6;
                        wub wubVar3 = (wub) obj2;
                        int i9 = size;
                        float circleDiameterPx = getCircleDiameterPx() * 0.8f;
                        LinkedHashMap linkedHashMap5 = linkedHashMap3;
                        if (o(wubVar3.a, wubVar2.a - circleDiameterPx) && o(wubVar2.a + circleDiameterPx, wubVar3.a) && o(wubVar3.b, wubVar2.b - circleDiameterPx) && o(wubVar2.b + circleDiameterPx, wubVar3.b)) {
                            float f3 = wubVar3.a;
                            float f4 = wubVar2.a;
                            float f5 = f4 - circleDiameterPx;
                            float f6 = (f3 <= f5 || f3 > f4) ? ((f4 + circleDiameterPx) - f3) / 2.0f : (f3 - f5) / 2.0f;
                            float f7 = wubVar3.b;
                            float f8 = wubVar2.b;
                            float f9 = f8 - circleDiameterPx;
                            float min = Math.min(f6, (f7 <= f9 || f7 > f8) ? ((f8 + circleDiameterPx) - f7) / 2.0f : (f7 - f9) / 2.0f);
                            float f10 = wubVar3.a;
                            float f11 = wubVar2.a;
                            if (f10 <= f11 - circleDiameterPx || f10 > f11) {
                                wubVar3.a = f10 + min;
                                f = wubVar2.a - min;
                                wubVar2.a = f;
                            } else {
                                wubVar3.a = f10 - min;
                                f = wubVar2.a + min;
                                wubVar2.a = f;
                            }
                            float f12 = wubVar3.b;
                            float f13 = wubVar2.b;
                            if (f12 <= f13 - circleDiameterPx || f12 > f13) {
                                wubVar3.b = f12 + min;
                                wubVar2.b -= min;
                            } else {
                                wubVar3.b = f12 - min;
                                wubVar2.b += min;
                            }
                            if (f < getLineThicknessPx()) {
                                float lineThicknessPx = getLineThicknessPx();
                                float f14 = wubVar2.a;
                                float f15 = lineThicknessPx - f14;
                                wubVar2.a = f14 + f15;
                                wubVar3.a += f15;
                            } else if (wubVar3.a < getLineThicknessPx()) {
                                float lineThicknessPx2 = getLineThicknessPx() - wubVar3.a;
                                wubVar2.a += lineThicknessPx2;
                                wubVar3.a += lineThicknessPx2;
                            } else if (wubVar2.a > (measuredWidth - getCircleDiameterPx()) - getLineThicknessPx()) {
                                float circleDiameterPx2 = wubVar2.a - ((measuredWidth - getCircleDiameterPx()) - getLineThicknessPx());
                                wubVar2.a -= circleDiameterPx2;
                                wubVar3.a -= circleDiameterPx2;
                            } else if (wubVar3.a > (measuredWidth - getCircleDiameterPx()) - getLineThicknessPx()) {
                                float circleDiameterPx3 = wubVar3.a - ((measuredWidth - getCircleDiameterPx()) - getLineThicknessPx());
                                wubVar3.a = (wubVar3.a - circleDiameterPx3) - circleDiameterPx3;
                            }
                            if (wubVar2.b < getLineThicknessPx()) {
                                float lineThicknessPx3 = getLineThicknessPx();
                                float f16 = wubVar2.b;
                                float f17 = lineThicknessPx3 - f16;
                                wubVar2.b = f16 + f17;
                                wubVar3.b += f17;
                            } else if (wubVar3.b < getLineThicknessPx()) {
                                float lineThicknessPx4 = getLineThicknessPx() - wubVar3.b;
                                wubVar2.b += lineThicknessPx4;
                                wubVar3.b += lineThicknessPx4;
                            } else if (wubVar2.b > (measuredHeight - getCircleDiameterPx()) - getLineThicknessPx()) {
                                float circleDiameterPx4 = wubVar2.b - ((measuredHeight - getCircleDiameterPx()) - getLineThicknessPx());
                                wubVar2.b -= circleDiameterPx4;
                                wubVar3.b -= circleDiameterPx4;
                            } else if (wubVar3.b > (measuredHeight - getCircleDiameterPx()) - getLineThicknessPx()) {
                                float circleDiameterPx5 = wubVar3.b - ((measuredHeight - getCircleDiameterPx()) - getLineThicknessPx());
                                wubVar2.b -= circleDiameterPx5;
                                wubVar3.b -= circleDiameterPx5;
                            }
                            z = z6;
                        }
                        i6 = i8 + 1;
                        size = i9;
                        i3 = i7;
                        linkedHashMap3 = linkedHashMap5;
                    }
                    i4 = i5;
                }
            }
            int i10 = i3;
            linkedHashMap = linkedHashMap3;
            if (!z) {
                break;
            }
            i2 = i10;
            linkedHashMap3 = linkedHashMap;
        }
        for (sle sleVar4 : linkedHashMap.values()) {
            ShirtColor j = j(sleVar4, i);
            if (sleVar4.f != t4k.a) {
                wub wubVar4 = (wub) CollectionsKt.a0(sleVar4.g, arrayList8);
                float f18 = wubVar4 != null ? wubVar4.a : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                wub wubVar5 = (wub) CollectionsKt.a0(sleVar4.g, arrayList8);
                TextView l = l(f18, wubVar5 != null ? wubVar5.b : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, sleVar4, j);
                Integer valueOf4 = Integer.valueOf(sleVar4.a.getId());
                Object obj3 = linkedHashMap2.get(valueOf4);
                if (obj3 == null) {
                    linkedHashMap2.put(valueOf4, l);
                    obj3 = l;
                }
                TextView textView3 = (TextView) obj3;
                textView3.setTag(sleVar4);
                textView3.setLayoutParams(l.getLayoutParams());
            }
        }
        Iterator it7 = arrayList3.iterator();
        while (it7.hasNext()) {
            sle sleVar5 = (sle) it7.next();
            TextView l2 = l(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, sleVar5, j(sleVar5, i));
            Integer valueOf5 = Integer.valueOf(sleVar5.a.getId());
            Object obj4 = linkedHashMap4.get(valueOf5);
            if (obj4 == null) {
                linkedHashMap4.put(valueOf5, l2);
                obj4 = l2;
            }
            TextView textView4 = (TextView) obj4;
            textView4.setTag(sleVar5);
            textView4.setLayoutParams(l2.getLayoutParams());
            textView4.setOnClickListener(new iye(this, sleVar5, 0));
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        if (getParent() == null) {
            WeakHashMap weakHashMap = this.v;
            Collection<yda> values = weakHashMap.values();
            values.getClass();
            for (yda ydaVar : values) {
                if (ydaVar != null) {
                    ydaVar.e(null);
                }
            }
            weakHashMap.clear();
        }
        super.onDetachedFromWindow();
    }

    public final void p(sle sleVar) {
        Player player;
        Player player2 = sleVar.a;
        if (!d7a.D(getContext())) {
            d7a.G(getContext());
            this.A = false;
        }
        sle sleVar2 = this.z;
        if (sleVar2 != null && (player = sleVar2.a) != null && player.getId() == player2.getId()) {
            q();
            return;
        }
        int i = this.y;
        LinkedHashMap linkedHashMap = i == 1 ? this.o : this.p;
        LinkedHashMap linkedHashMap2 = i == 1 ? this.q : this.r;
        if (((TextView) linkedHashMap2.get(Integer.valueOf(player2.getId()))) != null) {
            j22 j22Var = this.d;
            if (!((CheckBox) j22Var.f).isChecked()) {
                ((CheckBox) j22Var.f).performClick();
            }
        }
        Iterator it = CollectionsKt.w0(linkedHashMap2.values(), linkedHashMap.values()).iterator();
        while (it.hasNext()) {
            TextView textView = (TextView) it.next();
            textView.setAlpha(Intrinsics.c(textView.getText().toString(), player2.getJerseyNumber()) ? 1.0f : 0.3f);
        }
        this.z = sleVar;
        if (sleVar.f == t4k.a) {
            r(km5.a, true);
            return;
        }
        Function1 function1 = this.C;
        if (function1 != null) {
            function1.invoke(Integer.valueOf(player2.getId()));
        }
    }

    public final void q() {
        int i = this.y;
        LinkedHashMap linkedHashMap = i == 1 ? this.o : this.p;
        Iterator it = CollectionsKt.w0((i == 1 ? this.q : this.r).values(), linkedHashMap.values()).iterator();
        while (it.hasNext()) {
            ((TextView) it.next()).setAlpha(1.0f);
        }
        r(km5.a, false);
        Function0 function0 = this.D;
        if (function0 != null) {
            function0.invoke();
        }
    }

    public final void r(List list, boolean z) {
        j22 j22Var = this.d;
        if (!z) {
            this.z = null;
            j22Var.m.setVisibility(8);
            if (this.A) {
                return;
            }
            ((LinearLayout) j22Var.o).setVisibility(8);
            return;
        }
        sle sleVar = this.z;
        if (sleVar != null) {
            Player player = sleVar.a;
            t4k t4kVar = sleVar.f;
            int i = kye.a[t4kVar.ordinal()];
            if (i == -1 || i == 1) {
                j22Var.m.setVisibility(8);
                j22Var.d.setVisibility(8);
            } else {
                if (i != 2 && i != 3) {
                    zzl.b();
                    return;
                }
                j22Var.m.setVisibility(0);
                i99 heatmapImageGenerator = getHeatmapImageGenerator();
                Context context = getContext();
                context.getClass();
                Bitmap a = heatmapImageGenerator.a(context, list, 1, false, this.y);
                Matrix matrix = new Matrix();
                matrix.postRotate(90.0f);
                Bitmap createScaledBitmap = Bitmap.createScaledBitmap(a, getBitmapHeight(), getBitmapWidth(), true);
                createScaledBitmap.getClass();
                Bitmap createBitmap = Bitmap.createBitmap(createScaledBitmap, 0, 0, getBitmapHeight(), getBitmapWidth(), matrix, true);
                createBitmap.getClass();
                j22Var.m.setImageBitmap(createBitmap);
                j22Var.d.setVisibility(t4kVar == t4k.b ? 0 : 8);
            }
            as9.l((ImageView) j22Var.i, player.getId(), null);
            j22Var.e.setText(tba.t(player));
            ((LinearLayout) j22Var.o).setVisibility(0);
        }
    }

    public final void s(boolean z, Map map, Map map2) {
        boolean z2;
        Object obj;
        Player player;
        WeakHashMap weakHashMap = this.v;
        j22 j22Var = this.d;
        if (z) {
            ArrayList arrayList = this.s;
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                TextView textView = (TextView) it.next();
                textView.animate().cancel();
                yda ydaVar = (yda) weakHashMap.get(textView);
                if (ydaVar != null) {
                    ydaVar.e(null);
                }
                weakHashMap.remove(textView);
                ((RelativeLayout) j22Var.g).removeView(textView);
                ((LinearLayout) j22Var.j).removeView(textView);
            }
            arrayList.clear();
        } else {
            Collection<yda> values = weakHashMap.values();
            values.getClass();
            for (yda ydaVar2 : values) {
                if (ydaVar2 != null) {
                    ydaVar2.e(null);
                }
            }
            weakHashMap.clear();
            ((RelativeLayout) j22Var.g).removeAllViews();
        }
        Iterator it2 = map.values().iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            sle sleVar = (sle) it2.next();
            Player player2 = sleVar.a;
            boolean z3 = sleVar.d;
            TextView textView2 = (TextView) map2.get(Integer.valueOf(player2.getId()));
            if (textView2 != null) {
                if (z) {
                    c38 c38Var = new c38(i5h.g(new tsk((RelativeLayout) j22Var.g), rg2.w));
                    while (true) {
                        if (!c38Var.hasNext()) {
                            obj = null;
                            break;
                        }
                        obj = c38Var.next();
                        Object tag = ((TextView) obj).getTag();
                        sle sleVar2 = tag instanceof sle ? (sle) tag : null;
                        if (sleVar2 != null && (player = sleVar2.a) != null && player.getId() == sleVar.a.getId()) {
                            break;
                        }
                    }
                    TextView textView3 = (TextView) obj;
                    if (textView3 != null) {
                        textView3.setTag(textView2.getTag());
                        textView3.setLayoutParams(textView2.getLayoutParams());
                    } else {
                        ((RelativeLayout) j22Var.g).addView(textView2);
                        if ((!z3 || !((CheckBox) j22Var.f).isChecked()) && z3) {
                            r3 = 8;
                        }
                        textView2.setVisibility(r3);
                    }
                } else {
                    ((RelativeLayout) j22Var.g).addView(textView2);
                    textView2.setVisibility(z3 ? 8 : 0);
                }
            }
        }
        ((LinearLayout) j22Var.j).removeAllViews();
        int i = this.y;
        gye gyeVar = this.e;
        if (i == 1) {
            if (gyeVar == null) {
                Intrinsics.i("playersAveragePositionsData");
                throw null;
            }
            z2 = gyeVar.e;
        } else {
            if (gyeVar == null) {
                Intrinsics.i("playersAveragePositionsData");
                throw null;
            }
            z2 = gyeVar.f;
        }
        ((CheckBox) j22Var.f).setEnabled(z2);
        int i2 = 0;
        for (Object obj2 : (this.y == 1 ? this.q : this.r).values()) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                b.q();
                throw null;
            }
            TextView textView4 = (TextView) obj2;
            if (i2 != 0) {
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(getDpToPx32(), getDpToPx32());
                layoutParams.setMarginStart(getDpToPx4());
                textView4.setLayoutParams(layoutParams);
            }
            textView4.setVisibility(0);
            ((LinearLayout) j22Var.j).addView(textView4);
            i2 = i3;
        }
        Context context = getContext();
        context.getClass();
        if (!hkg.c0(context) || z) {
            return;
        }
        int i4 = this.y == 1 ? this.w : this.x;
        HorizontalScrollView horizontalScrollView = (HorizontalScrollView) j22Var.k;
        if (i4 == -1) {
            horizontalScrollView.post(new yp8(this, 29));
        } else {
            horizontalScrollView.post(new pn0(this, i4, 13));
        }
    }

    public final void setOnPlayerClick(@Nullable Function1<? super Integer, Unit> function1) {
        this.C = function1;
    }

    public final void setOnResetHeatmap(@Nullable Function0<Unit> function0) {
        this.D = function0;
    }
}
