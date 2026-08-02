package com.blaze.blazesdk.follow;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.blaze.blazesdk.follow.models.BlazeFollowEntity;
import com.blaze.blazesdk.follow.models.BlazeFollowEntityType;
import com.blaze.blazesdk.shared.BlazeSDK;
import com.blaze.blazesdk.style.players.moments.BlazeMomentsPlayerFollowEntityAvatarStyle;
import com.blaze.blazesdk.style.players.moments.BlazeMomentsPlayerFollowEntityChipStyle;
import com.blaze.blazesdk.style.players.moments.BlazeMomentsPlayerFollowEntityStateStyle;
import com.blaze.blazesdk.style.players.moments.BlazeMomentsPlayerFollowEntityStyle;
import com.blaze.blazesdk.style.shared.models.BlazeDp;
import com.sofascore.results.R;
import defpackage.bvm;
import defpackage.evl;
import defpackage.glm;
import defpackage.hwl;
import defpackage.j0m;
import defpackage.jsl;
import defpackage.nq8;
import defpackage.ox1;
import defpackage.s0;
import defpackage.tl3;
import defpackage.w1l;
import defpackage.wu2;
import defpackage.y2m;
import defpackage.yhk;
import defpackage.yj1;
import defpackage.zzl;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0017B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, d2 = {"Lcom/blaze/blazesdk/follow/BlazeFollowEntityView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lcom/blaze/blazesdk/style/players/moments/BlazeMomentsPlayerFollowEntityChipStyle;", "chip", "", "setupChipMargins", "(Lcom/blaze/blazesdk/style/players/moments/BlazeMomentsPlayerFollowEntityChipStyle;)V", "", "isCurrentlyFollowed", "setupAccessibility", "(Z)V", "Lj0m;", "data", "setupView", "(Lj0m;)V", "a", "blazesdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class BlazeFollowEntityView extends ConstraintLayout {
    public static final BlazeDp e;
    public static final BlazeDp f;
    public static final BlazeDp g;
    public static final BlazeDp h;
    public final y2m a;
    public BlazeMomentsPlayerFollowEntityStyle b;
    public glm c;
    public Function2 d;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static final class a {
        public a(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    static {
        new a(null);
        e = new BlazeDp(6);
        f = new BlazeDp(4);
        g = new BlazeDp(4);
        h = new BlazeDp(0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BlazeFollowEntityView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        context.getClass();
        View inflate = LayoutInflater.from(context).inflate(R.layout.blaze_layout_follow_entity, (ViewGroup) this, false);
        addView(inflate);
        int i2 = R.id.avatarImageView;
        ImageView imageView = (ImageView) nq8.B(R.id.avatarImageView, inflate);
        if (imageView != null) {
            i2 = R.id.chipImageView;
            ImageView imageView2 = (ImageView) nq8.B(R.id.chipImageView, inflate);
            if (imageView2 != null) {
                this.a = new y2m((ConstraintLayout) inflate, imageView, imageView2);
                return;
            }
        }
        yhk.s("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i2)));
        throw null;
    }

    private final void setupAccessibility(boolean isCurrentlyFollowed) {
        y2m y2mVar = this.a;
        ConstraintLayout constraintLayout = y2mVar.a;
        Context context = getContext();
        int i = isCurrentlyFollowed ? R.string.blaze_accessibility_unfollow_entity : R.string.blaze_accessibility_follow_entity;
        glm glmVar = this.c;
        constraintLayout.setContentDescription(context.getString(i, glmVar != null ? glmVar.d : null));
        y2mVar.a.setImportantForAccessibility(1);
        y2mVar.c.setImportantForAccessibility(2);
        y2mVar.b.setImportantForAccessibility(2);
    }

    private final void setupChipMargins(BlazeMomentsPlayerFollowEntityChipStyle chip) {
        int toPx$blazesdk_release;
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.blaze_follow_entity_chip_base_radius);
        int i = hwl.a[chip.getContentSource().ordinal()];
        if (i == 1) {
            toPx$blazesdk_release = new BlazeDp(0).getToPx$blazesdk_release();
        } else {
            if (i != 2) {
                zzl.b();
                return;
            }
            toPx$blazesdk_release = new BlazeDp(4).getToPx$blazesdk_release();
        }
        int i2 = dimensionPixelSize + toPx$blazesdk_release;
        ImageView imageView = this.a.c;
        imageView.getClass();
        ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
        if (layoutParams == null) {
            yhk.s("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            return;
        }
        tl3 tl3Var = (tl3) layoutParams;
        tl3Var.q = i2;
        imageView.setLayoutParams(tl3Var);
    }

    public final boolean f() {
        jsl followEntitiesInternal$blazesdk_release;
        glm glmVar = this.c;
        if (glmVar == null) {
            return false;
        }
        String str = glmVar.c;
        BlazeMomentsPlayerFollowEntityStyle blazeMomentsPlayerFollowEntityStyle = this.b;
        if (blazeMomentsPlayerFollowEntityStyle != null && (followEntitiesInternal$blazesdk_release = BlazeSDK.INSTANCE.getFollowEntitiesInternal$blazesdk_release()) != null) {
            BlazeFollowEntityType entityType = blazeMomentsPlayerFollowEntityStyle.getEntityType();
            entityType.getClass();
            Set followedEntities = followEntitiesInternal$blazesdk_release.getFollowedEntities();
            if (entityType instanceof BlazeFollowEntityType.FirstAvailable) {
                if (!(followedEntities instanceof Collection) || !followedEntities.isEmpty()) {
                    Iterator it = followedEntities.iterator();
                    while (it.hasNext()) {
                        if (Intrinsics.c(((BlazeFollowEntity) it.next()).getEntityId(), str)) {
                            return true;
                        }
                    }
                }
            } else if (jsl.c(entityType, glmVar.b) && (!(followedEntities instanceof Collection) || !followedEntities.isEmpty())) {
                Iterator it2 = followedEntities.iterator();
                while (it2.hasNext()) {
                    if (Intrinsics.c(((BlazeFollowEntity) it2.next()).getEntityId(), str)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final void setupView(@NotNull j0m data) {
        bvm bvmVar;
        data.getClass();
        BlazeMomentsPlayerFollowEntityStyle blazeMomentsPlayerFollowEntityStyle = data.a;
        this.b = blazeMomentsPlayerFollowEntityStyle;
        this.c = data.b;
        this.d = data.c;
        if (blazeMomentsPlayerFollowEntityStyle == null) {
            return;
        }
        if (blazeMomentsPlayerFollowEntityStyle.isVisible()) {
            setVisibility(0);
        } else {
            setVisibility(8);
        }
        y2m y2mVar = this.a;
        ConstraintLayout constraintLayout = y2mVar.a;
        ImageView imageView = y2mVar.b;
        ImageView imageView2 = y2mVar.c;
        constraintLayout.setOnClickListener(new s0(this, 9));
        BlazeMomentsPlayerFollowEntityChipStyle chip = blazeMomentsPlayerFollowEntityStyle.getFollowState().getChip();
        BlazeMomentsPlayerFollowEntityChipStyle.BlazeMomentsPlayerFollowEntityChipContentSource blazeMomentsPlayerFollowEntityChipContentSource = BlazeMomentsPlayerFollowEntityChipStyle.BlazeMomentsPlayerFollowEntityChipContentSource.ICON;
        setupChipMargins(BlazeMomentsPlayerFollowEntityChipStyle.copy$default(chip, 0, 0, blazeMomentsPlayerFollowEntityChipContentSource, 0, 11, null));
        boolean f2 = f();
        BlazeMomentsPlayerFollowEntityStateStyle followState = f2 ? blazeMomentsPlayerFollowEntityStyle.getFollowState() : blazeMomentsPlayerFollowEntityStyle.getUnfollowState();
        setupAccessibility(f2);
        BlazeMomentsPlayerFollowEntityAvatarStyle avatar = followState.getAvatar();
        yj1 yj1Var = new yj1(this, 6);
        int toPx$blazesdk_release = avatar.getBorderWidth().getToPx$blazesdk_release();
        int borderColor = avatar.getBorderColor();
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(1);
        gradientDrawable.setStroke(toPx$blazesdk_release, borderColor);
        imageView.setForeground(gradientDrawable);
        glm glmVar = this.c;
        String str = (glmVar == null || (bvmVar = glmVar.a) == null) ? null : bvmVar.a;
        ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
        shapeDrawable.setIntrinsicWidth(new BlazeDp(52).getToPx$blazesdk_release());
        shapeDrawable.setIntrinsicHeight(new BlazeDp(52).getToPx$blazesdk_release());
        shapeDrawable.getPaint().setColor(-12303292);
        evl.loadAndCacheImage$default(imageView, str, null, null, shapeDrawable, false, null, kotlin.collections.a.c(new wu2()), new ox1(yj1Var, 3), null, null, null, 1846, null);
        BlazeMomentsPlayerFollowEntityChipStyle chip2 = followState.getChip();
        chip2.updateContentSourceResourceId$blazesdk_release(f2);
        int i = hwl.a[(f2 ? blazeMomentsPlayerFollowEntityChipContentSource : chip2.getContentSource()).ordinal()];
        if (i == 1) {
            int backgroundColor = chip2.getBackgroundColor();
            GradientDrawable gradientDrawable2 = new GradientDrawable();
            gradientDrawable2.setShape(1);
            gradientDrawable2.setColor(backgroundColor);
            imageView2.setBackground(gradientDrawable2);
            imageView2.setImageResource(chip2.getContentSourceResourceId$blazesdk_release());
            int toPx$blazesdk_release2 = g.getToPx$blazesdk_release();
            int toPx$blazesdk_release3 = h.getToPx$blazesdk_release();
            imageView2.setPadding(toPx$blazesdk_release2, toPx$blazesdk_release3, toPx$blazesdk_release2, toPx$blazesdk_release3);
        } else {
            if (i != 2) {
                zzl.b();
                return;
            }
            int backgroundColor2 = chip2.getBackgroundColor();
            GradientDrawable b = w1l.b(0);
            getContext().getClass();
            b.setCornerRadius(evl.a(r0, 16));
            b.setColor(backgroundColor2);
            imageView2.setBackground(b);
            imageView2.setImageResource(chip2.getContentSourceResourceId$blazesdk_release());
            int toPx$blazesdk_release4 = e.getToPx$blazesdk_release();
            int toPx$blazesdk_release5 = f.getToPx$blazesdk_release();
            imageView2.setPadding(toPx$blazesdk_release4, toPx$blazesdk_release5, toPx$blazesdk_release4, toPx$blazesdk_release5);
        }
        imageView2.setColorFilter(chip2.getIconColor(), PorterDuff.Mode.SRC_IN);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BlazeFollowEntityView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        context.getClass();
    }

    public /* synthetic */ BlazeFollowEntityView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BlazeFollowEntityView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        context.getClass();
    }
}
