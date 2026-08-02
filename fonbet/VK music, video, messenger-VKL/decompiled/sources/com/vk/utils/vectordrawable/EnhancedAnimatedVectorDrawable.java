package com.vk.utils.vectordrawable;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.XmlResourceParser;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.util.ArrayMap;
import android.util.LruCache;
import androidx.annotation.Keep;
import com.vk.utils.vectordrawable.internal.element.GroupElement;
import com.vk.utils.vectordrawable.internal.element.PathElement;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import org.xmlpull.v1.XmlPullParserException;
import xsna.bpn0;
import xsna.epx;
import xsna.fy2;
import xsna.gm2;
import xsna.j5g;
import xsna.lf2;
import xsna.q5f;
import xsna.wkr0;
import xsna.zr;

/* compiled from: EnhancedAnimatedVectorDrawable.kt */
@Keep
@SuppressLint({"ResourceType"})
/* loaded from: classes6.dex */
public final class EnhancedAnimatedVectorDrawable extends Drawable implements Animatable, wkr0 {
    public static final a Companion = new a();
    private static final boolean SHOULD_IGNORE_INVALID_ANIMATION = true;
    private b animator;
    private AnimatorSet animatorSetFromXml;
    private final ArrayList<Animator> animators;
    private final EnhancedVectorDrawable drawable;
    private final int resId;
    private final ArrayMap<Animator, String> targetNameMap;
    private final d callback = new d();
    private final Lazy animatorListener$delegate = new bpn0(new q5f(this, 16));
    private List<lf2> animationCallbacks = new ArrayList();

    /* compiled from: EnhancedAnimatedVectorDrawable.kt */
    public static final class a {
    }

    /* compiled from: EnhancedAnimatedVectorDrawable.kt */
    public static final class b {
        public final EnhancedAnimatedVectorDrawable a;
        public final AnimatorSet b;
        public final boolean c;

        public b(EnhancedAnimatedVectorDrawable enhancedAnimatedVectorDrawable, AnimatorSet animatorSet) {
            this.a = enhancedAnimatedVectorDrawable;
            AnimatorSet clone = animatorSet.clone();
            this.b = clone;
            this.c = clone.getTotalDuration() == -1;
        }
    }

    /* compiled from: EnhancedAnimatedVectorDrawable.kt */
    public static final class c extends AnimatorListenerAdapter {
        public c() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            EnhancedAnimatedVectorDrawable enhancedAnimatedVectorDrawable = EnhancedAnimatedVectorDrawable.this;
            Iterator it = j5g.O0(enhancedAnimatedVectorDrawable.animationCallbacks).iterator();
            while (it.hasNext()) {
                ((lf2) it.next()).a(enhancedAnimatedVectorDrawable);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animator) {
            EnhancedAnimatedVectorDrawable enhancedAnimatedVectorDrawable = EnhancedAnimatedVectorDrawable.this;
            Iterator it = j5g.O0(enhancedAnimatedVectorDrawable.animationCallbacks).iterator();
            while (it.hasNext()) {
                ((lf2) it.next()).b(enhancedAnimatedVectorDrawable);
            }
        }
    }

    /* compiled from: EnhancedAnimatedVectorDrawable.kt */
    public static final class d implements Drawable.Callback {
        public d() {
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public final void invalidateDrawable(Drawable drawable) {
            EnhancedAnimatedVectorDrawable.this.invalidateSelf();
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
            EnhancedAnimatedVectorDrawable.this.scheduleSelf(runnable, j);
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
            EnhancedAnimatedVectorDrawable.this.unscheduleSelf(runnable);
        }
    }

    public EnhancedAnimatedVectorDrawable(Context context, int i) {
        gm2.a aVar;
        int i2;
        int attributeResourceValue;
        this.resId = i;
        gm2 gm2Var = new gm2(context);
        fy2 fy2Var = gm2.c;
        gm2.a aVar2 = (gm2.a) ((LruCache) fy2Var.b).get(Integer.valueOf(i));
        if (aVar2 != null) {
            ArrayList arrayList = new ArrayList();
            ArrayMap arrayMap = new ArrayMap();
            Iterator<Animator> it = aVar2.b.iterator();
            while (it.hasNext()) {
                Animator next = it.next();
                Animator clone = next.clone();
                arrayList.add(clone);
                arrayMap.put(clone, aVar2.c.get(next));
            }
            aVar = new gm2.a(new EnhancedVectorDrawable(aVar2.a), arrayList, arrayMap);
        } else {
            aVar = null;
        }
        if (aVar == null) {
            XmlResourceParser xml = gm2Var.b.getXml(i);
            int next2 = xml.next();
            while (true) {
                i2 = 2;
                if (next2 == 2 || next2 == 1) {
                    break;
                } else {
                    next2 = xml.next();
                }
            }
            if (next2 != 2) {
                throw new XmlPullParserException("No start tag found");
            }
            ArrayList arrayList2 = new ArrayList();
            ArrayMap arrayMap2 = new ArrayMap();
            try {
                try {
                    int eventType = xml.getEventType();
                    int depth = xml.getDepth();
                    EnhancedVectorDrawable enhancedVectorDrawable = null;
                    while (eventType != 1) {
                        if (xml.getDepth() < depth && eventType == 3) {
                            break;
                        }
                        if (eventType != i2) {
                            eventType = xml.next();
                        } else {
                            String name = xml.getName();
                            if (epx.f(name, "animated-vector")) {
                                EnhancedVectorDrawable b2 = gm2Var.b(xml);
                                b2.getPixelSize();
                                enhancedVectorDrawable = b2;
                            } else if (epx.f(name, "target")) {
                                int attributeCount = xml.getAttributeCount();
                                String str = null;
                                for (int i3 = 0; i3 < attributeCount; i3++) {
                                    String attributeName = xml.getAttributeName(i3);
                                    if (epx.f(attributeName, "name")) {
                                        str = xml.getAttributeValue(i3);
                                    } else if (epx.f(attributeName, "animation") && (attributeResourceValue = xml.getAttributeResourceValue(i3, 0)) != 0) {
                                        Animator loadAnimator = AnimatorInflater.loadAnimator(gm2Var.a, attributeResourceValue);
                                        loadAnimator = gm2.c(loadAnimator) ? gm2Var.a(attributeResourceValue) : loadAnimator;
                                        arrayList2.add(loadAnimator);
                                        arrayMap2.put(loadAnimator, str);
                                    }
                                }
                            }
                            eventType = xml.next();
                            i2 = 2;
                        }
                    }
                    xml.close();
                    if (enhancedVectorDrawable == null) {
                        throw new IllegalArgumentException("VectorDrawable was not found in XML");
                    }
                    aVar = new gm2.a(enhancedVectorDrawable, arrayList2, arrayMap2);
                    ((LruCache) fy2Var.b).put(Integer.valueOf(i), aVar);
                } catch (IOException e) {
                    e.printStackTrace();
                    throw e;
                } catch (XmlPullParserException e2) {
                    e2.printStackTrace();
                    throw e2;
                }
            } catch (Throwable th) {
                xml.close();
                throw th;
            }
        }
        EnhancedVectorDrawable enhancedVectorDrawable2 = aVar.a;
        enhancedVectorDrawable2.setCallback(this.callback);
        this.drawable = enhancedVectorDrawable2;
        this.animators = aVar.b;
        this.targetNameMap = aVar.c;
        AnimatorSet animatorSet = new AnimatorSet();
        prepareLocalAnimators(animatorSet);
        this.animatorSetFromXml = animatorSet;
        this.animator = new b(this, animatorSet);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final c animatorListener_delegate$lambda$0(EnhancedAnimatedVectorDrawable enhancedAnimatedVectorDrawable) {
        return enhancedAnimatedVectorDrawable.new c();
    }

    private final c getAnimatorListener() {
        return (c) this.animatorListener$delegate.getValue();
    }

    private final Animator prepareLocalAnimator(int i) {
        Animator animator = this.animators.get(i);
        Animator clone = animator.clone();
        String str = this.targetNameMap.get(animator);
        AnimationTarget findTarget$rich_vector_release = str != null ? this.drawable.findTarget$rich_vector_release(str) : null;
        if (findTarget$rich_vector_release == null) {
            throw new IllegalStateException(zr.a("Target with the name \"", str, "\" cannot be found in the VectorDrawable to be animated."));
        }
        if ((findTarget$rich_vector_release instanceof GroupElement) || (findTarget$rich_vector_release instanceof PathElement)) {
            clone.setTarget(findTarget$rich_vector_release);
            return clone;
        }
        throw new UnsupportedOperationException("Target should be either GroupElement or PathElement, " + findTarget$rich_vector_release.getClass() + " is not supported");
    }

    private final void prepareLocalAnimators(AnimatorSet animatorSet) {
        int size = this.animators.size();
        if (size > 0) {
            AnimatorSet.Builder play = animatorSet.play(prepareLocalAnimator(0));
            for (int i = 1; i < size; i++) {
                play.with(prepareLocalAnimator(i));
            }
        }
    }

    public void clearAnimationCallbacks() {
        b bVar = this.animator;
        bVar.b.removeListener(getAnimatorListener());
        this.animationCallbacks.clear();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        b bVar = this.animator;
        if (bVar.b.isStarted()) {
            bVar.a.invalidateSelf();
        }
        this.drawable.draw(canvas);
    }

    @Override // xsna.wkr0
    public Animator findAnimations(String str) {
        Integer valueOf = Integer.valueOf(j5g.c0(this.targetNameMap.values(), str));
        if (valueOf.intValue() < 0) {
            valueOf = null;
        }
        if (valueOf == null) {
            return null;
        }
        return this.targetNameMap.keyAt(valueOf.intValue());
    }

    @Override // xsna.qlr0
    public VectorPath findPath(String str) {
        return this.drawable.findPath(str);
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.drawable.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public ColorFilter getColorFilter() {
        return this.drawable.getColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public Rect getDirtyBounds() {
        return this.drawable.getDirtyBounds();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.drawable.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.drawable.getIntrinsicWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumHeight() {
        return this.drawable.getMinimumHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumWidth() {
        return this.drawable.getMinimumWidth();
    }

    public VectorPath getOnlyPath() {
        return this.drawable.getOnlyPath();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // xsna.wkr0
    public void invalidateAnimations() {
        AnimatorSet animatorSet = new AnimatorSet();
        prepareLocalAnimators(animatorSet);
        this.animatorSetFromXml = animatorSet;
        b bVar = this.animator;
        bVar.b.removeListener(getAnimatorListener());
        b bVar2 = new b(this, this.animatorSetFromXml);
        if (this.animationCallbacks.size() != 0) {
            bVar2.b.addListener(getAnimatorListener());
        }
        this.animator = bVar2;
    }

    @Override // xsna.qlr0
    public void invalidatePath() {
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        return this.animator.b.isRunning();
    }

    @Override // android.graphics.drawable.Drawable
    public void jumpToCurrentState() {
        this.animator.b.end();
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.drawable.setBounds(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onLevelChange(int i) {
        return this.drawable.setLevel(i);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        return this.drawable.setState(iArr);
    }

    public void registerAnimationCallback(lf2 lf2Var) {
        if (this.animationCallbacks.size() == 0) {
            b bVar = this.animator;
            bVar.b.addListener(getAnimatorListener());
        }
        if (this.animationCallbacks.contains(lf2Var)) {
            return;
        }
        this.animationCallbacks.add(lf2Var);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        this.drawable.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.drawable.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        this.drawable.setTintList(colorStateList);
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        this.drawable.setTintMode(mode);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z, boolean z2) {
        b bVar = this.animator;
        if (bVar.c && bVar.b.isStarted()) {
            if (z) {
                this.animator.b.resume();
            } else {
                this.animator.b.pause();
            }
        }
        this.drawable.setVisible(z, z2);
        return super.setVisible(z, z2);
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
        b bVar = this.animator;
        AnimatorSet animatorSet = bVar.b;
        if (animatorSet.isStarted()) {
            return;
        }
        animatorSet.start();
        bVar.a.invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
        this.animator.b.end();
    }

    public boolean unregisterAnimationCallback(lf2 lf2Var) {
        boolean remove = this.animationCallbacks.remove(lf2Var);
        if (this.animationCallbacks.size() == 0) {
            b bVar = this.animator;
            bVar.b.removeListener(getAnimatorListener());
        }
        return remove;
    }
}
