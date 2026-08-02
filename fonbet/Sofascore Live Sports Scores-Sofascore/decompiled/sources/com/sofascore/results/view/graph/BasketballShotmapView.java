package com.sofascore.results.view.graph;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.mbridge.msdk.MBridgeConstans;
import com.sofascore.results.R;
import com.sofascore.results.view.graph.BasketballShotmapView;
import defpackage.ed;
import defpackage.nq8;
import defpackage.se5;
import defpackage.ujf;
import defpackage.yhk;
import defpackage.zve;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.b;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0011\u0010\n\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Lcom/sofascore/results/view/graph/BasketballShotmapView;", "Landroid/widget/FrameLayout;", "Landroid/widget/ImageView;", MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW, "", "setButtonAppearance", "(Landroid/widget/ImageView;)V", "", "getHasEmptyLabels", "()Z", "hasEmptyLabels", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class BasketballShotmapView extends FrameLayout {
    public static final /* synthetic */ int f = 0;
    public final ed a;
    public int b;
    public final List c;
    public zve d;
    public se5 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BasketballShotmapView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        context.getClass();
        final int i = 0;
        View inflate = LayoutInflater.from(context).inflate(R.layout.view_basketball_shotmap, (ViewGroup) this, false);
        addView(inflate);
        int i2 = R.id.buttons;
        LinearLayout linearLayout = (LinearLayout) nq8.B(R.id.buttons, inflate);
        if (linearLayout != null) {
            i2 = R.id.graph;
            BasketballShotmapPlayAreasGraph basketballShotmapPlayAreasGraph = (BasketballShotmapPlayAreasGraph) nq8.B(R.id.graph, inflate);
            if (basketballShotmapPlayAreasGraph != null) {
                i2 = R.id.shot_map_difference_image;
                ImageView imageView = (ImageView) nq8.B(R.id.shot_map_difference_image, inflate);
                if (imageView != null) {
                    i2 = R.id.shot_map_percentage_image;
                    ImageView imageView2 = (ImageView) nq8.B(R.id.shot_map_percentage_image, inflate);
                    if (imageView2 != null) {
                        i2 = R.id.shot_map_total_shots_image;
                        ImageView imageView3 = (ImageView) nq8.B(R.id.shot_map_total_shots_image, inflate);
                        if (imageView3 != null) {
                            this.a = new ed((LinearLayout) inflate, linearLayout, basketballShotmapPlayAreasGraph, imageView, imageView2, imageView3);
                            this.c = b.j(imageView2, imageView, imageView3);
                            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ujf.c, 0, 0);
                            obtainStyledAttributes.getClass();
                            final int i3 = 1;
                            boolean z = obtainStyledAttributes.getBoolean(0, true);
                            obtainStyledAttributes.recycle();
                            linearLayout.setVisibility(z ? 0 : 8);
                            if (z) {
                                basketballShotmapPlayAreasGraph.setOnClickListener(new View.OnClickListener(this) { // from class: gs1
                                    public final /* synthetic */ BasketballShotmapView b;

                                    {
                                        this.b = this;
                                    }

                                    @Override // android.view.View.OnClickListener
                                    public final void onClick(View view) {
                                        int i4 = i;
                                        BasketballShotmapView basketballShotmapView = this.b;
                                        switch (i4) {
                                            case 0:
                                                int i5 = BasketballShotmapView.f;
                                                basketballShotmapView.a(100);
                                                break;
                                            case 1:
                                                int i6 = BasketballShotmapView.f;
                                                basketballShotmapView.a(1);
                                                break;
                                            case 2:
                                                int i7 = BasketballShotmapView.f;
                                                basketballShotmapView.a(2);
                                                break;
                                            default:
                                                int i8 = BasketballShotmapView.f;
                                                basketballShotmapView.a(5);
                                                break;
                                        }
                                    }
                                });
                                imageView2.setOnClickListener(new View.OnClickListener(this) { // from class: gs1
                                    public final /* synthetic */ BasketballShotmapView b;

                                    {
                                        this.b = this;
                                    }

                                    @Override // android.view.View.OnClickListener
                                    public final void onClick(View view) {
                                        int i4 = i3;
                                        BasketballShotmapView basketballShotmapView = this.b;
                                        switch (i4) {
                                            case 0:
                                                int i5 = BasketballShotmapView.f;
                                                basketballShotmapView.a(100);
                                                break;
                                            case 1:
                                                int i6 = BasketballShotmapView.f;
                                                basketballShotmapView.a(1);
                                                break;
                                            case 2:
                                                int i7 = BasketballShotmapView.f;
                                                basketballShotmapView.a(2);
                                                break;
                                            default:
                                                int i8 = BasketballShotmapView.f;
                                                basketballShotmapView.a(5);
                                                break;
                                        }
                                    }
                                });
                                final int i4 = 2;
                                imageView.setOnClickListener(new View.OnClickListener(this) { // from class: gs1
                                    public final /* synthetic */ BasketballShotmapView b;

                                    {
                                        this.b = this;
                                    }

                                    @Override // android.view.View.OnClickListener
                                    public final void onClick(View view) {
                                        int i42 = i4;
                                        BasketballShotmapView basketballShotmapView = this.b;
                                        switch (i42) {
                                            case 0:
                                                int i5 = BasketballShotmapView.f;
                                                basketballShotmapView.a(100);
                                                break;
                                            case 1:
                                                int i6 = BasketballShotmapView.f;
                                                basketballShotmapView.a(1);
                                                break;
                                            case 2:
                                                int i7 = BasketballShotmapView.f;
                                                basketballShotmapView.a(2);
                                                break;
                                            default:
                                                int i8 = BasketballShotmapView.f;
                                                basketballShotmapView.a(5);
                                                break;
                                        }
                                    }
                                });
                                final int i5 = 3;
                                imageView3.setOnClickListener(new View.OnClickListener(this) { // from class: gs1
                                    public final /* synthetic */ BasketballShotmapView b;

                                    {
                                        this.b = this;
                                    }

                                    @Override // android.view.View.OnClickListener
                                    public final void onClick(View view) {
                                        int i42 = i5;
                                        BasketballShotmapView basketballShotmapView = this.b;
                                        switch (i42) {
                                            case 0:
                                                int i52 = BasketballShotmapView.f;
                                                basketballShotmapView.a(100);
                                                break;
                                            case 1:
                                                int i6 = BasketballShotmapView.f;
                                                basketballShotmapView.a(1);
                                                break;
                                            case 2:
                                                int i7 = BasketballShotmapView.f;
                                                basketballShotmapView.a(2);
                                                break;
                                            default:
                                                int i8 = BasketballShotmapView.f;
                                                basketballShotmapView.a(5);
                                                break;
                                        }
                                    }
                                });
                                return;
                            }
                            return;
                        }
                    }
                }
            }
        }
        yhk.s("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i2)));
        throw null;
    }

    private final void setButtonAppearance(ImageView view) {
        Drawable background = view.getBackground();
        boolean isSelected = view.isSelected();
        int i = R.color.n_lv_1;
        background.setTint(isSelected ? getContext().getColor(R.color.n_lv_1) : 0);
        Drawable drawable = view.getDrawable();
        Context context = getContext();
        if (view.isSelected()) {
            i = R.color.surface_1;
        }
        drawable.setTint(context.getColor(i));
    }

    public final void a(int i) {
        se5 se5Var;
        zve zveVar = this.d;
        if (zveVar == null || (se5Var = this.e) == null) {
            return;
        }
        if (i == 100) {
            int i2 = this.b;
            i = i2 != 1 ? i2 != 2 ? 1 : 5 : 2;
        }
        ((BasketballShotmapPlayAreasGraph) this.a.c).c(zveVar, se5Var, i, i != 5);
        this.b = i;
        int i3 = 0;
        for (Object obj : this.c) {
            int i4 = i3 + 1;
            if (i3 < 0) {
                b.q();
                throw null;
            }
            ImageView imageView = (ImageView) obj;
            int i5 = this.b;
            imageView.setSelected(i3 == 0 ? i5 == 1 : !(i3 == 1 ? i5 != 2 : i5 != 5));
            setButtonAppearance(imageView);
            i3 = i4;
        }
    }

    public final boolean getHasEmptyLabels() {
        return ((BasketballShotmapPlayAreasGraph) this.a.c).getHasEmptyLabels();
    }
}
