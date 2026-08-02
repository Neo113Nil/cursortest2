package com.vk.feed.design.view.newsfeed.avatar_stack;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.vk.core.view.components.avatar.VkAvatar;
import com.vk.core.view.components.text.VkText;
import com.vk.feed.design.view.newsfeed.reaction.FeedAnimatedView;
import com.vk.rlottie.RLottieDrawable;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.LazyThreadSafetyMode;
import kotlin.collections.builders.ListBuilder;
import xsna.a780;
import xsna.bwt0;
import xsna.cn70;
import xsna.dhr0;
import xsna.e43;
import xsna.epx;
import xsna.ey2;
import xsna.im0;
import xsna.izs;
import xsna.j5g;
import xsna.krv0;
import xsna.msy;
import xsna.p4g;
import xsna.ra;
import xsna.ra0;
import xsna.s3q0;
import xsna.sa0;
import xsna.tlo0;
import xsna.too0;
import xsna.w9r0;

/* compiled from: AvatarAnimatedStack.kt */
/* loaded from: classes18.dex */
public final class AvatarAnimatedStack extends FrameLayout implements too0 {
    public static final /* synthetic */ int q = 0;
    public tlo0 b;
    public final ListBuilder c;
    public final FeedAnimatedView d;
    public final VkText e;
    public final int f;
    public final ArrayList g;
    public String h;
    public final float i;
    public final Object j;
    public final Object k;
    public boolean l;
    public boolean m;
    public boolean n;
    public final Object o;
    public final Object p;

    public AvatarAnimatedStack(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final a getAnimatedViewLoadCallback() {
        return (a) this.o.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final izs<Canvas, s3q0> getAnimationDrawOnBitmapCutout() {
        return (izs) this.j.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final b getAnimationPlayListener() {
        return (b) this.p.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final w9r0 getAvatarCutout() {
        return (w9r0) this.k.getValue();
    }

    @Override // xsna.too0
    public final void Ng() {
        dhr0.M();
    }

    public final void a(String str, List list) {
        String str2;
        ArrayList arrayList = this.g;
        if (list.equals(arrayList) && !epx.f(this.h, str)) {
            return;
        }
        this.n = false;
        this.m = false;
        FeedAnimatedView feedAnimatedView = this.d;
        feedAnimatedView.setAnimating(false);
        p4g.n(arrayList, j5g.H0(list, this.f));
        this.h = str;
        ListBuilder listBuilder = this.c;
        ListIterator listIterator = listBuilder.listIterator(0);
        while (true) {
            ListBuilder.a aVar = (ListBuilder.a) listIterator;
            if (!aVar.hasNext()) {
                break;
            } else {
                bwt0.p0((VkAvatar) aVar.next(), false);
            }
        }
        Iterator it = arrayList.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                boolean z = (this.h == null || arrayList.isEmpty()) ? false : true;
                if (z && (str2 = this.h) != null) {
                    feedAnimatedView.e(str2, false);
                }
                bwt0.p0(feedAnimatedView, z);
                return;
            }
            Object next = it.next();
            int i2 = i + 1;
            if (i < 0) {
                e43.t();
                throw null;
            }
            String str3 = (String) next;
            VkAvatar vkAvatar = (VkAvatar) j5g.b0(i, listBuilder);
            if (vkAvatar != null) {
                bwt0.p0(vkAvatar, true);
            }
            if (vkAvatar != null) {
                vkAvatar.o0(str3, null);
            }
            i = i2;
        }
    }

    public final tlo0 getText() {
        return this.b;
    }

    public final void setText(tlo0 tlo0Var) {
        this.b = tlo0Var;
        VkText vkText = this.e;
        ey2.h(vkText, tlo0Var);
        bwt0.p0(vkText, this.b != null);
    }

    public AvatarAnimatedStack(Context context, AttributeSet attributeSet, int i) {
        super(context, (i & 2) != 0 ? null : attributeSet, 0);
        float a2 = cn70.a() * 25.5f;
        this.i = a2;
        ra0 ra0Var = new ra0(this, 8);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.j = msy.a(lazyThreadSafetyMode, ra0Var);
        int i2 = 8;
        this.k = msy.a(lazyThreadSafetyMode, new sa0(this, i2));
        this.o = msy.a(lazyThreadSafetyMode, new im0(this, i2));
        this.p = msy.a(lazyThreadSafetyMode, new ra(this, 6));
        LayoutInflater.from(context).inflate(R.layout.feed_avatar_animated_stack, (ViewGroup) this, true);
        ListBuilder e = e43.e();
        e.add(findViewById(R.id.animated_stack_avatar_1));
        e.add(findViewById(R.id.animated_stack_avatar_2));
        ListBuilder g = e.g();
        this.c = g;
        int size = g.size();
        this.f = size;
        this.g = new ArrayList(size);
        FeedAnimatedView feedAnimatedView = (FeedAnimatedView) findViewById(R.id.animated_stack_animated_view);
        this.d = feedAnimatedView;
        this.e = (VkText) findViewById(R.id.animated_stack_text);
        feedAnimatedView.setPlayCount(2);
        feedAnimatedView.setDrawOnBitmap(getAnimationDrawOnBitmapCutout());
        feedAnimatedView.setAnimationSize((int) a2);
        feedAnimatedView.setAnimationListener(getAnimationPlayListener());
        feedAnimatedView.setOnLoadAnimationCallback(getAnimatedViewLoadCallback());
        for (int size2 = g.size() - 1; -1 < size2; size2--) {
            VkAvatar vkAvatar = (VkAvatar) g.get(size2);
            vkAvatar.y0(cn70.a() * 0.5f, krv0.m(R.attr.vk_ui_image_border_alpha, getContext()));
            vkAvatar.setPlaceholderImage(R.drawable.ds_internal_avatar_placeholder);
            if (size2 != 0) {
                vkAvatar.setAvatarCutout(getAvatarCutout());
            }
        }
    }

    /* compiled from: AvatarAnimatedStack.kt */
    public static final class a implements a780 {
        public a() {
        }

        @Override // xsna.a780
        public final void onSuccess() {
            AvatarAnimatedStack avatarAnimatedStack = AvatarAnimatedStack.this;
            avatarAnimatedStack.l = true;
            if (avatarAnimatedStack.m) {
                avatarAnimatedStack.d.setAnimating(true);
            }
        }

        @Override // xsna.a780
        public final void a() {
        }
    }

    /* compiled from: AvatarAnimatedStack.kt */
    public static final class b implements RLottieDrawable.a {
        public b() {
        }

        @Override // com.vk.rlottie.RLottieDrawable.a
        public final void b() {
            AvatarAnimatedStack.this.n = true;
        }

        @Override // com.vk.rlottie.RLottieDrawable.a
        public final void a() {
        }
    }
}
