package com.sofascore.results.event.mmastatistics.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.sofascore.model.mvvm.model.Gender;
import com.sofascore.results.R;
import defpackage.drc;
import defpackage.e92;
import defpackage.hrc;
import defpackage.m6;
import defpackage.nq8;
import defpackage.y5;
import defpackage.yhk;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0001\n\u0002\b\r\b\u0007\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00058\u0014X\u0094\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001a\u0010\u0010\u001a\u00020\u000b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0013\u001a\u00020\u000b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010\r\u001a\u0004\b\u0012\u0010\u000fR\u001a\u0010\u0019\u001a\u00020\u00148\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001a\u0010\u001c\u001a\u00020\u00148\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u0016\u001a\u0004\b\u001b\u0010\u0018R\u001c\u0010\u001e\u001a\u0004\u0018\u00010\u001d8\u0014X\u0094\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u001c\u0010\"\u001a\u0004\u0018\u00010\u001d8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\"\u0010\u001f\u001a\u0004\b#\u0010!R\u001c\u0010$\u001a\u0004\u0018\u00010\u001d8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b$\u0010\u001f\u001a\u0004\b%\u0010!R\u001c\u0010&\u001a\u0004\u0018\u00010\u001d8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b&\u0010\u001f\u001a\u0004\b'\u0010!R\u001c\u0010(\u001a\u0004\u0018\u00010\u001d8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b(\u0010\u001f\u001a\u0004\b)\u0010!¨\u0006*"}, d2 = {"Lcom/sofascore/results/event/mmastatistics/view/MmaStatsHeadDualView;", "Ly5;", "", "getLayoutId", "()I", "Landroid/widget/TextView;", "C", "Landroid/widget/TextView;", "getPrimaryLabel", "()Landroid/widget/TextView;", "primaryLabel", "Lhrc;", "D", "Lhrc;", "getPrimaryTextLayoutHome", "()Lhrc;", "primaryTextLayoutHome", "E", "getPrimaryTextLayoutAway", "primaryTextLayoutAway", "Landroid/widget/ImageView;", "F", "Landroid/widget/ImageView;", "getPrimaryBodyPartHome", "()Landroid/widget/ImageView;", "primaryBodyPartHome", "G", "getPrimaryBodyPartAway", "primaryBodyPartAway", "", "secondaryLabel", "Ljava/lang/Void;", "getSecondaryLabel", "()Ljava/lang/Void;", "secondaryTextLayoutHome", "getSecondaryTextLayoutHome", "secondaryTextLayoutAway", "getSecondaryTextLayoutAway", "secondaryBodyPartHome", "getSecondaryBodyPartHome", "secondaryBodyPartAway", "getSecondaryBodyPartAway", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class MmaStatsHeadDualView extends y5 {
    public final drc B;

    /* renamed from: C, reason: from kotlin metadata */
    public final TextView primaryLabel;

    /* renamed from: D, reason: from kotlin metadata */
    public final hrc primaryTextLayoutHome;

    /* renamed from: E, reason: from kotlin metadata */
    public final hrc primaryTextLayoutAway;

    /* renamed from: F, reason: from kotlin metadata */
    public final ImageView primaryBodyPartHome;

    /* renamed from: G, reason: from kotlin metadata */
    public final ImageView primaryBodyPartAway;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public MmaStatsHeadDualView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        attributeSet = (i & 2) != 0 ? null : attributeSet;
        context.getClass();
        View root = getRoot();
        int i2 = R.id.head_away;
        ImageView imageView = (ImageView) nq8.B(R.id.head_away, root);
        if (imageView != null) {
            i2 = R.id.head_away_outline;
            ImageView imageView2 = (ImageView) nq8.B(R.id.head_away_outline, root);
            if (imageView2 != null) {
                i2 = R.id.head_home;
                ImageView imageView3 = (ImageView) nq8.B(R.id.head_home, root);
                if (imageView3 != null) {
                    i2 = R.id.head_home_outline;
                    ImageView imageView4 = (ImageView) nq8.B(R.id.head_home_outline, root);
                    if (imageView4 != null) {
                        i2 = R.id.text_box;
                        View B = nq8.B(R.id.text_box, root);
                        if (B != null) {
                            e92 c = e92.c(B);
                            hrc hrcVar = (hrc) c.c;
                            hrc hrcVar2 = (hrc) c.f;
                            ConstraintLayout constraintLayout = hrcVar2.a;
                            this.B = new drc((ConstraintLayout) root, imageView, imageView2, imageView3, imageView4, c, 1);
                            setupLayoutTransitions(hrcVar.a, constraintLayout);
                            m6.r(constraintLayout, hrcVar2.d.getId());
                            this.primaryLabel = (TextView) c.d;
                            this.primaryTextLayoutHome = hrcVar;
                            this.primaryTextLayoutAway = hrcVar2;
                            this.primaryBodyPartHome = imageView3;
                            this.primaryBodyPartAway = imageView;
                            return;
                        }
                    }
                }
            }
        }
        yhk.s("Missing required view with ID: ".concat(root.getResources().getResourceName(i2)));
        throw null;
    }

    @Override // defpackage.o8
    public int getLayoutId() {
        return R.layout.mma_statistics_head_comparison_view;
    }

    @Override // defpackage.y5
    @NotNull
    public ImageView getPrimaryBodyPartAway() {
        return this.primaryBodyPartAway;
    }

    @Override // defpackage.y5
    @NotNull
    public ImageView getPrimaryBodyPartHome() {
        return this.primaryBodyPartHome;
    }

    @Override // defpackage.m6
    @NotNull
    public TextView getPrimaryLabel() {
        return this.primaryLabel;
    }

    @Override // defpackage.y5
    @NotNull
    public hrc getPrimaryTextLayoutAway() {
        return this.primaryTextLayoutAway;
    }

    @Override // defpackage.y5
    @NotNull
    public hrc getPrimaryTextLayoutHome() {
        return this.primaryTextLayoutHome;
    }

    @Override // defpackage.y5
    public /* bridge */ /* synthetic */ ImageView getSecondaryBodyPartAway() {
        return (ImageView) m691getSecondaryBodyPartAway();
    }

    @Override // defpackage.y5
    public /* bridge */ /* synthetic */ ImageView getSecondaryBodyPartHome() {
        return (ImageView) m692getSecondaryBodyPartHome();
    }

    @Override // defpackage.m6
    public /* bridge */ /* synthetic */ TextView getSecondaryLabel() {
        return (TextView) m693getSecondaryLabel();
    }

    @Override // defpackage.y5
    public /* bridge */ /* synthetic */ hrc getSecondaryTextLayoutAway() {
        return (hrc) m694getSecondaryTextLayoutAway();
    }

    @Override // defpackage.y5
    public /* bridge */ /* synthetic */ hrc getSecondaryTextLayoutHome() {
        return (hrc) m695getSecondaryTextLayoutHome();
    }

    @Override // defpackage.y5
    public final void v() {
        Gender bodyGraphGender = getBodyGraphGender();
        Gender gender = Gender.Male;
        int i = bodyGraphGender == gender ? R.drawable.head_zone_men : R.drawable.head_zone_women;
        int i2 = getBodyGraphGender() == gender ? R.drawable.men_head_outline : R.drawable.women_head_outline;
        drc drcVar = this.B;
        drcVar.d.setImageResource(i2);
        drcVar.c.setImageResource(i2);
        getPrimaryBodyPartHome().setImageResource(i);
        getPrimaryBodyPartAway().setImageResource(i);
    }

    @Nullable
    /* renamed from: getSecondaryBodyPartAway, reason: collision with other method in class */
    public Void m691getSecondaryBodyPartAway() {
        return null;
    }

    @Nullable
    /* renamed from: getSecondaryBodyPartHome, reason: collision with other method in class */
    public Void m692getSecondaryBodyPartHome() {
        return null;
    }

    @Nullable
    /* renamed from: getSecondaryLabel, reason: collision with other method in class */
    public Void m693getSecondaryLabel() {
        return null;
    }

    @Nullable
    /* renamed from: getSecondaryTextLayoutAway, reason: collision with other method in class */
    public Void m694getSecondaryTextLayoutAway() {
        return null;
    }

    @Nullable
    /* renamed from: getSecondaryTextLayoutHome, reason: collision with other method in class */
    public Void m695getSecondaryTextLayoutHome() {
        return null;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MmaStatsHeadDualView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 4);
        context.getClass();
    }
}
