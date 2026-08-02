package com.vk.stories.design.view.avatar;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.AttributeSet;
import android.view.View;
import com.unity3d.services.UnityAdsConstants;
import com.vk.api.generated.stories.dto.StoriesDecorationConfigBorderDto;
import com.vk.api.generated.stories.dto.StoriesDecorationConfigDto;
import com.vk.avatar.api.VKAvatarView;
import com.vk.avatar.api.border.AvatarBorderType;
import com.vk.dto.stories.model.DiscoverStoriesContainer;
import com.vk.dto.stories.model.IdeasStoriesContainer;
import com.vk.dto.stories.model.LiveFinishedStoriesContainer;
import com.vk.dto.stories.model.StoriesContainer;
import com.vk.dto.stories.model.StoryEntry;
import com.vk.dto.stories.model.StoryOwner;
import com.vk.imageloader.view.VKImageView;
import com.vk.toggle.d;
import com.vk.toggle.features.StoriesFeatures;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import xsna.abg0;
import xsna.akm0;
import xsna.aq5;
import xsna.b290;
import xsna.bkm0;
import xsna.bqz0;
import xsna.buc0;
import xsna.c5g;
import xsna.ckm0;
import xsna.cq5;
import xsna.dhr0;
import xsna.dyl0;
import xsna.epx;
import xsna.fkm0;
import xsna.fsk;
import xsna.gzs;
import xsna.h2v;
import xsna.hyd0;
import xsna.iah0;
import xsna.icm0;
import xsna.ikf0;
import xsna.j5g;
import xsna.j9r0;
import xsna.k800;
import xsna.k9r0;
import xsna.krv0;
import xsna.mmq0;
import xsna.msy;
import xsna.o9r0;
import xsna.p9r0;
import xsna.pmo;
import xsna.qq2;
import xsna.r9r0;
import xsna.s3q0;
import xsna.su80;
import xsna.swe0;
import xsna.ta50;
import xsna.ts5;
import xsna.u9r0;
import xsna.uvl0;
import xsna.uxl0;
import xsna.xp5;
import xsna.xxl0;

/* compiled from: StoryAvatarView.kt */
/* loaded from: classes6.dex */
public final class StoryAvatarView extends VKAvatarView implements ts5 {
    public static final int G = iah0.a(14);
    public float A;
    public boolean B;
    public boolean C;
    public dyl0 D;
    public final b E;
    public final TreeSet<Integer> F;
    public boolean s;
    public final Object t;
    public final Object u;
    public final Object v;
    public final Object w;
    public final Object x;
    public akm0 y;
    public gzs<s3q0> z;

    /* compiled from: StoryAvatarView.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[StoriesDecorationConfigBorderDto.TypeDto.values().length];
            try {
                iArr[StoriesDecorationConfigBorderDto.TypeDto.CONIC.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[StoriesDecorationConfigBorderDto.TypeDto.LINEAR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[StoriesDecorationConfigBorderDto.TypeDto.RADIAL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[StoriesDecorationConfigBorderDto.TypeDto.SOLID.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* compiled from: StoryAvatarView.kt */
    public final class b implements dyl0 {
        public b() {
        }

        @Override // xsna.dyl0
        public final void a() {
            StoryAvatarView storyAvatarView = StoryAvatarView.this;
            storyAvatarView.invalidate();
            dyl0 dyl0Var = storyAvatarView.D;
            if (dyl0Var != null) {
                dyl0Var.a();
            }
        }

        @Override // xsna.dyl0
        public final void b() {
            dyl0 dyl0Var = StoryAvatarView.this.D;
            if (dyl0Var != null) {
                dyl0Var.b();
            }
        }

        @Override // xsna.dyl0
        public final void onStart() {
            dyl0 dyl0Var = StoryAvatarView.this.D;
            if (dyl0Var != null) {
                dyl0Var.onStart();
            }
        }
    }

    public StoryAvatarView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
    }

    public static void e1(StoryAvatarView storyAvatarView, ValueAnimator valueAnimator) {
        storyAvatarView.setAvatarScale(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    public static xp5 f1(StoryAvatarView storyAvatarView) {
        return storyAvatarView.getStoryFeedNewDesign() ? new uxl0() : storyAvatarView.getAvatarBorderConfigParamsOverride().j;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final aq5 getAvatarBorderRepository() {
        return (aq5) this.t.getValue();
    }

    private final int getPromoBorderColor() {
        return getStoryFeedNewDesign() ? krv0.m(R.attr.vk_ui_stroke_accent, getContext()) : getContext().getColor(R.color.vk_sky_300);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final boolean getSquareFeedAvatar() {
        return ((Boolean) this.w.getValue()).booleanValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final boolean getStoryFeedNewDesign() {
        return ((Boolean) this.v.getValue()).booleanValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final uvl0 getUploadInteractor() {
        return (uvl0) this.u.getValue();
    }

    private final void setAvatarScale(float f) {
        this.A = f;
        invalidate();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setCleanUploadAnimation(boolean z) {
        this.B = z;
        if (z) {
            akm0 akm0Var = this.y;
            if (akm0Var != null) {
                akm0Var.pause();
            }
        } else {
            akm0 akm0Var2 = this.y;
            if (akm0Var2 != null) {
                akm0Var2.resume();
            }
        }
        invalidate();
    }

    public final void E() {
        setCleanUploadAnimation(true);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.85f, 1.0f);
        ofFloat.setDuration(120L);
        ofFloat.addUpdateListener(new pmo(this, 3));
        ofFloat.addListener(new c());
        ofFloat.start();
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        akm0 akm0Var;
        super.draw(canvas);
        akm0 akm0Var2 = this.y;
        if (akm0Var2 == null || !akm0Var2.a() || this.B || (akm0Var = this.y) == null) {
            return;
        }
        akm0Var.draw(canvas);
    }

    public final void e() {
        setCleanUploadAnimation(true);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final xp5 getAvatarBorderColors() {
        return (xp5) this.x.getValue();
    }

    public final boolean getFromProfile() {
        return this.s;
    }

    public final gzs<s3q0> getOnUploadErrorCallback() {
        return this.z;
    }

    @Override // com.vk.avatar.api.VKAvatarView, com.vk.imageloader.view.VKImageView, xsna.zjt, android.widget.ImageView, android.view.View
    public final void onDraw(Canvas canvas) {
        r9r0 r9r0Var;
        u9r0 config = getConfig();
        if (config != null && (r9r0Var = getAvatarBorderRepository().b(getContext(), config, getAvatarBorderConfigParamsOverride().j).c) != null) {
            r9r0Var.b(getContext(), canvas);
        }
        Matrix matrix = new Matrix();
        int save = canvas.save();
        canvas.concat(matrix);
        try {
            float f = this.A;
            canvas.scale(f, f, canvas.getWidth() / 2.0f, canvas.getHeight() / 2.0f);
            super.onDraw(canvas);
        } finally {
            canvas.restoreToCount(save);
        }
    }

    public final void p1(boolean z) {
        if (z && (this.C || (this.y instanceof ckm0))) {
            return;
        }
        this.F.clear();
        akm0 akm0Var = this.y;
        if (akm0Var != null) {
            akm0Var.cancel();
        }
        this.y = null;
        invalidate();
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0030  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final cq5 r1(StoriesContainer storiesContainer, boolean z, boolean z2, boolean z3, boolean z4) {
        boolean z5;
        StoriesDecorationConfigBorderDto d;
        p9r0 dVar;
        boolean Cb = storiesContainer.Cb();
        if (z) {
            return cq5.d.a;
        }
        if (z3) {
            return cq5.c.a;
        }
        if (!Cb) {
            return (Cb || (storiesContainer.Qb() && storiesContainer.g.size() <= 0 && !fsk.x(storiesContainer))) ? (!z4 || Cb) ? cq5.b.a : cq5.n.a : cq5.n.a;
        }
        if (!fsk.B(storiesContainer)) {
            IdeasStoriesContainer ideasStoriesContainer = storiesContainer instanceof IdeasStoriesContainer ? (IdeasStoriesContainer) storiesContainer : null;
            if (ideasStoriesContainer == null || ideasStoriesContainer.r != null) {
                z5 = false;
                StoriesDecorationConfigDto storiesDecorationConfigDto = storiesContainer.c;
                d = storiesDecorationConfigDto != null ? storiesDecorationConfigDto.d() : null;
                if (d != null || z2) {
                    if (!fsk.A(storiesContainer) || (storiesContainer instanceof LiveFinishedStoriesContainer)) {
                        return cq5.g.a;
                    }
                    if (!(storiesContainer instanceof DiscoverStoriesContainer)) {
                        return z5 ? cq5.l.a : z2 ? cq5.o.a : storiesContainer.Db() ? cq5.i.a : cq5.h.a;
                    }
                    StoriesFeatures storiesFeatures = StoriesFeatures.NEW_DISCOVER_ICON;
                    storiesFeatures.getClass();
                    return com.vk.toggle.b.A.a(storiesFeatures) ? new cq5.a(new p9r0.a(180.0f, new String[]{h2v.d(getContext().getColor(R.color.stories_discover_gradient_start)), h2v.d(getContext().getColor(R.color.stories_discover_gradient_end))}, new float[]{UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f})) : cq5.k.a;
                }
                int i = a.$EnumSwitchMapping$0[d.g().ordinal()];
                float f = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                if (i == 1) {
                    Float d2 = d.d();
                    if (d2 != null) {
                        f = d2.floatValue();
                    }
                    String[] strArr = (String[]) d.e().toArray(new String[0]);
                    List<Float> f2 = d.f();
                    dVar = new p9r0.d(f, strArr, f2 != null ? j5g.L0(f2) : new float[0]);
                } else if (i == 2) {
                    Float d3 = d.d();
                    if (d3 != null) {
                        f = d3.floatValue();
                    }
                    String[] strArr2 = (String[]) d.e().toArray(new String[0]);
                    List<Float> f3 = d.f();
                    dVar = new p9r0.a(f, strArr2, f3 != null ? j5g.L0(f3) : new float[0]);
                } else if (i == 3) {
                    String[] strArr3 = (String[]) d.e().toArray(new String[0]);
                    List<Float> f4 = d.f();
                    dVar = new p9r0.b(strArr3, f4 != null ? j5g.L0(f4) : new float[0]);
                } else {
                    if (i != 4) {
                        throw new NoWhenBranchMatchedException();
                    }
                    String str = (String) j5g.a0(d.e());
                    if (str == null) {
                        str = "00000000";
                    }
                    dVar = new p9r0.c(Color.parseColor("#".concat(str)));
                }
                return new cq5.a(dVar);
            }
        }
        z5 = true;
        StoriesDecorationConfigDto storiesDecorationConfigDto2 = storiesContainer.c;
        if (storiesDecorationConfigDto2 != null) {
        }
        if (d != null) {
        }
        if (fsk.A(storiesContainer)) {
        }
        return cq5.g.a;
    }

    public final void release() {
        setCleanUploadAnimation(true);
        this.F.clear();
        akm0 akm0Var = this.y;
        if (akm0Var != null) {
            akm0Var.cancel();
        }
        this.y = null;
        k800 k800Var = this.n;
        if (k800Var != null) {
            k800Var.d();
        }
        k800 k800Var2 = this.n;
        if (k800Var2 != null) {
            k800Var2.c.removeUpdateListener(this.p);
        }
        this.n = null;
    }

    public final void s1(String str, AvatarBorderType avatarBorderType) {
        VKAvatarView.c1(this, avatarBorderType, cq5.b.a, 4);
        load(str);
    }

    public final void setFromProfile(boolean z) {
        this.s = z;
        invalidate();
    }

    public final void setOnUploadErrorCallback(gzs<s3q0> gzsVar) {
        this.z = gzsVar;
    }

    public final void t1(StoriesContainer storiesContainer, boolean z, xxl0 xxl0Var, mmq0 mmq0Var) {
        k9r0 k9r0Var;
        int a2;
        Object obj;
        r9r0 r9r0Var;
        int i;
        int i2 = 1;
        boolean z2 = storiesContainer.Qb() || storiesContainer.Pb();
        this.D = mmq0Var;
        AvatarBorderType avatarBorderType = (this.s || !getSquareFeedAvatar()) ? AvatarBorderType.CIRCLE : AvatarBorderType.SQUARE;
        boolean z3 = z2 && (storiesContainer.Cb() || fsk.A(storiesContainer)) && storiesContainer.Fb() != null;
        if (avatarBorderType == null) {
            StoryOwner storyOwner = storiesContainer.b;
            avatarBorderType = storyOwner != null ? storyOwner.Lb() : storyOwner != null && storyOwner.Lb() ? AvatarBorderType.HEXAGON : AvatarBorderType.CIRCLE;
        }
        AvatarBorderType avatarBorderType2 = avatarBorderType;
        cq5 r1 = r1(storiesContainer, z, z3, storiesContainer.d, xxl0Var.b());
        if (getStoryFeedNewDesign()) {
            if (epx.f(r1, cq5.m.a) || epx.f(r1, cq5.n.a)) {
                xxl0.a e = xxl0Var.e();
                if (e != null) {
                    setAvatarBorderConfigParamsOverride(o9r0.a(getAvatarBorderConfigParamsOverride(), false, null, null, null, Float.valueOf(e.c), Float.valueOf(e.b), Float.valueOf(e.a), null, false, 1599));
                }
            } else {
                xxl0.a h = xxl0Var.h();
                if (h != null) {
                    setAvatarBorderConfigParamsOverride(o9r0.a(getAvatarBorderConfigParamsOverride(), false, null, null, null, Float.valueOf(h.c), Float.valueOf(h.b), Float.valueOf(h.a), null, false, 1599));
                }
            }
        }
        this.m.f(avatarBorderType2, r1, getAvatarBorderConfigParamsOverride().j);
        String str = "stories_square_view_animation_86.json";
        if (r1.equals(cq5.l.a)) {
            int promoBorderColor = getPromoBorderColor();
            if (this.s || !d.P()) {
                StoriesFeatures storiesFeatures = StoriesFeatures.ST_STORY_FEED_NEW_DESIGN;
                storiesFeatures.getClass();
                str = com.vk.toggle.b.A.a(storiesFeatures) ? "promo_stories_circle_animation_86.json" : "stories_animation_64.json";
            }
            k9r0Var = new k9r0(0, Integer.valueOf(promoBorderColor), str);
        } else if (storiesContainer.d) {
            cq5 r12 = r1(storiesContainer, z, z3, false, false);
            if (!storiesContainer.d) {
                a2 = getAvatarBorderRepository().a(getContext(), r12, getConfig(), getAvatarBorderColors());
            } else if (storiesContainer.Db()) {
                Context context = getContext();
                getAvatarBorderColors().getClass();
                a2 = krv0.m(R.attr.vk_ui_stroke_positive, context);
            } else if (storiesContainer.e) {
                a2 = getAvatarBorderRepository().a(getContext(), r12, getConfig(), getAvatarBorderColors());
            } else {
                StoriesFeatures storiesFeatures2 = StoriesFeatures.ST_STORY_FEED_NEW_DESIGN;
                storiesFeatures2.getClass();
                a2 = com.vk.toggle.b.A.a(storiesFeatures2) ? krv0.m(R.attr.vk_ui_separator_primary3x, getContext()) : krv0.m(getAvatarBorderColors().a(), getContext());
            }
            if (this.s || !d.P()) {
                StoriesFeatures storiesFeatures3 = StoriesFeatures.ST_STORY_FEED_NEW_DESIGN;
                storiesFeatures3.getClass();
                str = com.vk.toggle.b.A.a(storiesFeatures3) ? "stories_circle_view_animation_86.json" : "stories_circle_view_animation_82.json";
            }
            k9r0Var = new k9r0(-1, Integer.valueOf(a2), str);
        } else {
            k9r0Var = null;
        }
        a1(avatarBorderType2, r1, k9r0Var);
        if (storiesContainer instanceof DiscoverStoriesContainer) {
            StoriesFeatures storiesFeatures4 = StoriesFeatures.NEW_DISCOVER_ICON;
            storiesFeatures4.getClass();
            com.vk.toggle.b bVar = com.vk.toggle.b.A;
            if (bVar.a(storiesFeatures4)) {
                abg0 abg0Var = dhr0.t;
                Drawable a3 = abg0Var.a(R.drawable.story_discover_icon);
                Drawable a4 = abg0Var.a(R.drawable.vk_icon_hand_wave_sparkles_36);
                if (a4 != null) {
                    a4.setTint(-1);
                } else {
                    a4 = null;
                }
                LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{a3, a4});
                int i3 = G;
                layerDrawable.setLayerInset(1, i3, i3, i3, i3);
                setImageDrawable(layerDrawable);
            } else {
                if (!this.s && getSquareFeedAvatar()) {
                    i = R.drawable.vk_icon_compass_square_fill_purple_72;
                } else {
                    StoriesFeatures storiesFeatures5 = StoriesFeatures.ST_STORY_FEED_NEW_DESIGN;
                    storiesFeatures5.getClass();
                    i = bVar.a(storiesFeatures5) ? R.drawable.vk_icon_compass_circle_fill_purple_72 : R.drawable.vk_icon_compass_circle_fill_purple_56;
                }
                setImageDrawable(dhr0.t.a(i));
            }
        } else {
            String Hb = storiesContainer.Hb(xxl0Var.i());
            if (Hb != null) {
                load(Hb);
            } else {
                clear();
            }
        }
        if (z2 && this.C) {
            this.C = false;
            j9r0 border = getBorder();
            if (border == null || (r9r0Var = (r9r0) j5g.a0(border.d)) == null) {
                return;
            }
            ckm0 ckm0Var = new ckm0(getContext(), r9r0Var, this.E);
            ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 1.05f, 1.0f);
            ofFloat.setInterpolator(qq2.d);
            ofFloat.setDuration(500L);
            r9r0Var.j = swe0.f(1.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f);
            ofFloat.addUpdateListener(new icm0(ckm0Var, 1));
            ofFloat.addListener(new bkm0(ckm0Var));
            ofFloat.start();
            ckm0Var.d = ofFloat;
            this.y = ckm0Var;
            return;
        }
        if (!z2 || z || (!storiesContainer.Cb() && !fsk.A(storiesContainer))) {
            p1(z2);
            return;
        }
        ArrayList Gb = storiesContainer.Gb();
        if (Gb.isEmpty()) {
            p1(true);
            return;
        }
        ArrayList arrayList = new ArrayList(c5g.u(Gb, 10));
        Iterator it = Gb.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(((StoryEntry) it.next()).c));
        }
        TreeSet<Integer> treeSet = this.F;
        if (treeSet.containsAll(arrayList)) {
            return;
        }
        Iterator it2 = Gb.iterator();
        while (true) {
            if (!it2.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it2.next();
                if (((StoryEntry) obj).w0) {
                    break;
                }
            }
        }
        boolean z4 = obj != null;
        p1(true);
        treeSet.addAll(arrayList);
        u9r0 config = getConfig();
        if (config != null) {
            r9r0 r9r0Var2 = (r9r0) j5g.a0(getAvatarBorderRepository().b(getContext(), u9r0.a(config, z4 ? cq5.i.a : cq5.h.a), getAvatarBorderColors()).d);
            if (r9r0Var2 != null) {
                r9r0 r9r0Var3 = new r9r0(r9r0Var2.a, r9r0Var2.b, r9r0Var2.c, r9r0Var2.d);
                fkm0 fkm0Var = new fkm0(getContext(), arrayList, r9r0Var3, getUploadInteractor(), new bqz0(this), this.E);
                r9r0Var3.j = swe0.f(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f);
                ValueAnimator ofFloat2 = ValueAnimator.ofFloat(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 360.0f);
                ofFloat2.setInterpolator(null);
                ofFloat2.setDuration(5000L);
                ofFloat2.setRepeatCount(-1);
                ofFloat2.setRepeatMode(1);
                ofFloat2.addUpdateListener(new ikf0(fkm0Var, i2));
                ofFloat2.start();
                fkm0Var.m = ofFloat2;
                this.y = fkm0Var;
            }
        }
    }

    public StoryAvatarView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, (i & 2) != 0 ? null : attributeSet, 0);
        hyd0 hyd0Var = new hyd0(3);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.t = msy.a(lazyThreadSafetyMode, hyd0Var);
        this.u = msy.a(lazyThreadSafetyMode, new b290(this, 21));
        this.v = msy.a(lazyThreadSafetyMode, new buc0(6));
        this.w = msy.a(lazyThreadSafetyMode, new ta50(7));
        this.x = msy.a(lazyThreadSafetyMode, new su80(this, 27));
        this.A = 1.0f;
        this.E = new b();
        this.F = new TreeSet<>();
    }

    public VKImageView getImageView() {
        return this;
    }

    @Override // xsna.ts5
    public View getView() {
        return this;
    }

    /* compiled from: Animator.kt */
    public static final class c implements Animator.AnimatorListener {
        public c() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            StoryAvatarView.this.setCleanUploadAnimation(false);
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationCancel(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animator) {
        }
    }
}
