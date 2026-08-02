package com.vk.story.viewer.impl.presentation.stories.view.storyview;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.graphics.Color;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.FrameLayout;
import com.unity3d.services.UnityAdsConstants;
import com.vk.dto.common.Peer;
import com.vk.dto.common.im.ImageList;
import com.vk.dto.stories.model.NarrativePublishEventType;
import com.vk.dto.stories.model.StoryEntry;
import com.vk.im.engine.models.contacts.Contact;
import com.vk.im.engine.models.dialogs.ChatSettings;
import com.vk.im.engine.models.dialogs.Dialog;
import com.vk.im.engine.models.emails.Email;
import com.vk.im.engine.models.groups.Group;
import com.vk.im.engine.models.users.User;
import com.vk.im.engine.models.users.UserNameCase;
import com.vk.stat.scheme.MobileOfficialAppsConStoriesStat$ViewEntryPoint;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stat.scheme.MobileOfficialAppsStoriesStat$TypeStoryViewItem;
import com.vk.stories.design.view.viewer.StoryBottomViewGroup;
import com.vkontakte.android.R;
import io.reactivex.rxjava3.core.x;
import kotlin.LazyThreadSafetyMode;
import xsna.a1w;
import xsna.anm0;
import xsna.asu0;
import xsna.cf00;
import xsna.cp50;
import xsna.cxd0;
import xsna.f4m;
import xsna.fo20;
import xsna.gkx0;
import xsna.gzs;
import xsna.i7j0;
import xsna.iah0;
import xsna.j6v;
import xsna.jzl0;
import xsna.l340;
import xsna.msy;
import xsna.o25;
import xsna.o330;
import xsna.pm60;
import xsna.q1w;
import xsna.s3q0;
import xsna.t2m0;
import xsna.u2k0;
import xsna.u8m0;
import xsna.uwi0;
import xsna.vu50;
import xsna.x550;
import xsna.y3l0;
import xsna.zlq;

/* compiled from: StoryFastSharePopupHelper.kt */
/* loaded from: classes6.dex */
public final class b {
    public final StoryBottomViewGroup a;
    public zlq b;
    public FrameLayout c;
    public ValueAnimator d = new ValueAnimator();
    public gzs<s3q0> e = new pm60(10);
    public final io.reactivex.rxjava3.disposables.b f = new io.reactivex.rxjava3.disposables.b();
    public final Object g;
    public final Object h;
    public final Object i;

    /* compiled from: StoryFastSharePopupHelper.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Peer.Type.values().length];
            try {
                iArr[Peer.Type.GROUP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Peer.Type.CHAT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Peer.Type.CONTACT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[Peer.Type.USER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[Peer.Type.EMAIL.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* compiled from: StoryFastSharePopupHelper.kt */
    /* renamed from: com.vk.story.viewer.impl.presentation.stories.view.storyview.b$b, reason: collision with other inner class name */
    public static final class C1843b extends AnimatorListenerAdapter {
        public C1843b() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            b bVar = b.this;
            bVar.f();
            bVar.e.invoke();
        }
    }

    public b(StoryBottomViewGroup storyBottomViewGroup) {
        this.a = storyBottomViewGroup;
        x550 x550Var = new x550(this, 26);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.g = msy.a(lazyThreadSafetyMode, x550Var);
        this.h = msy.a(lazyThreadSafetyMode, new y3l0(this, 3));
        this.i = msy.a(lazyThreadSafetyMode, new cf00(this, 29));
    }

    public static final void a(b bVar, View view, View view2, View view3) {
        bVar.getClass();
        Rect c = f4m.c(view);
        view3.getLocationOnScreen(new int[2]);
        int width = view2.getWidth();
        Integer valueOf = Integer.valueOf(width);
        if (width <= 0) {
            valueOf = null;
        }
        int intValue = valueOf != null ? valueOf.intValue() : view2.getMeasuredWidth();
        int height = view2.getHeight();
        Integer valueOf2 = height > 0 ? Integer.valueOf(height) : null;
        int intValue2 = valueOf2 != null ? valueOf2.intValue() : view2.getMeasuredHeight();
        int i = c.top;
        view2.setTranslationX(((c.right - r4[0]) - iah0.a(32)) - intValue);
        view2.setTranslationY(i);
        view2.setPivotX(intValue);
        view2.setPivotY(intValue2);
    }

    public static final void b(b bVar, final View view, final FrameLayout frameLayout) {
        bVar.getClass();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f);
        ofFloat.setDuration(300L);
        ofFloat.setInterpolator(new AccelerateDecelerateInterpolator());
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: xsna.s2m0
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                View view2 = view;
                view2.setScaleX(floatValue);
                view2.setScaleY(floatValue);
                view2.setAlpha(floatValue);
                frameLayout.setBackgroundColor(Color.argb((int) (floatValue * 0.3f), 0, 0, 0));
            }
        });
        bVar.d = ofFloat;
        ofFloat.start();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static ImageList d(Dialog dialog, i7j0.a aVar) {
        ImageList imageList;
        ImageList imageList2;
        ImageList imageList3;
        ImageList imageList4;
        int i = a.$EnumSwitchMapping$0[dialog.bc().ordinal()];
        if (i == 1) {
            ChatSettings Hb = dialog.Hb();
            if (Hb != null && (imageList = Hb.c) != null) {
                return imageList;
            }
            Group group = (Group) aVar.b.e.e(Long.valueOf(dialog.ac())).b;
            if (group != null) {
                return group.e;
            }
            return null;
        }
        if (i == 3) {
            ChatSettings Hb2 = dialog.Hb();
            if (Hb2 != null && (imageList2 = Hb2.c) != null) {
                return imageList2;
            }
            Contact contact = (Contact) aVar.b.c.e(Long.valueOf(dialog.ac())).b;
            if (contact != null) {
                return contact.h;
            }
            return null;
        }
        if (i == 5) {
            ChatSettings Hb3 = dialog.Hb();
            if (Hb3 != null && (imageList3 = Hb3.c) != null) {
                return imageList3;
            }
            Email email = (Email) aVar.b.d.e(Long.valueOf(dialog.ac())).b;
            if (email != null) {
                return email.C8();
            }
            return null;
        }
        if (dialog.ac() == o25.a().c().b) {
            return null;
        }
        ChatSettings Hb4 = dialog.Hb();
        if (Hb4 != null && (imageList4 = Hb4.c) != null) {
            return imageList4;
        }
        User user = (User) aVar.b.b.e(Long.valueOf(dialog.ac())).b;
        if (user != null) {
            return user.h;
        }
        return null;
    }

    public final void c() {
        ValueAnimator valueAnimator = this.d;
        if (valueAnimator.isRunning()) {
            valueAnimator.cancel();
        }
        valueAnimator.reverse();
        valueAnimator.removeAllListeners();
        valueAnimator.addListener(new C1843b());
        this.f.e();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String e(Dialog dialog, i7j0.a aVar) {
        String str;
        String str2;
        int i = a.$EnumSwitchMapping$0[dialog.bc().ordinal()];
        if (i == 1) {
            Group group = (Group) aVar.b.e.e(Long.valueOf(dialog.ac())).b;
            if (group != null) {
                return group.I9(UserNameCase.NOM);
            }
            return null;
        }
        if (i == 2) {
            ChatSettings Hb = dialog.Hb();
            if (Hb != null && (str = Hb.b) != null) {
                return str;
            }
            Contact contact = (Contact) aVar.b.c.e(Long.valueOf(dialog.ac())).b;
            if (contact != null) {
                return contact.I9(UserNameCase.NOM);
            }
            return null;
        }
        if (i == 3) {
            Contact contact2 = (Contact) aVar.b.c.e(Long.valueOf(dialog.ac())).b;
            if (contact2 != null) {
                return contact2.I9(UserNameCase.NOM);
            }
            return null;
        }
        if (i != 5) {
            if (dialog.ac() == o25.a().c().b) {
                return this.a.getContext().getString(R.string.vkim_dialog_with_self_title);
            }
            User user = (User) aVar.b.b.e(Long.valueOf(dialog.ac())).b;
            if (user != null) {
                return user.Ab(UserNameCase.NOM);
            }
            return null;
        }
        ChatSettings Hb2 = dialog.Hb();
        if (Hb2 != null && (str2 = Hb2.b) != null) {
            return str2;
        }
        Email email = (Email) aVar.b.d.e(Long.valueOf(dialog.ac())).b;
        if (email != null) {
            return email.I9(UserNameCase.NOM);
        }
        return null;
    }

    public final void f() {
        if (this.d.isRunning()) {
            this.d.removeAllListeners();
            this.d.cancel();
        }
        FrameLayout frameLayout = this.c;
        if (frameLayout != null) {
            ViewParent parent = frameLayout.getParent();
            ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
            if (viewGroup != null) {
                viewGroup.removeView(frameLayout);
            }
        }
        this.c = null;
        this.b = null;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, kotlin.Lazy] */
    @SuppressLint({"ClickableViewAccessibility"})
    public final void g(View view, boolean z, StoryEntry storyEntry, jzl0 jzl0Var) {
        x j;
        f();
        view.getParent().requestDisallowInterceptTouchEvent(true);
        if (z) {
            i7j0 i7j0Var = new i7j0(gkx0.e, 4, false, null, null, null);
            a1w a1wVar = q1w.a;
            j = (a1wVar != null ? a1wVar : null).C("StoryHighlightsRedesignDelegate", i7j0Var).l(new l340(new u2k0(this, 6), 15)).q(asu0.a.c());
        } else {
            j = x.j(((vu50) this.g.getValue()).b(4, storyEntry.d, null, true).U(new cxd0(new fo20(22), 6)));
        }
        this.f.b(j.m(asu0.a.d()).subscribe(new o330(new t2m0(this, view, jzl0Var, z, storyEntry), 17), new cp50(new uwi0(2, view, this), 16)));
    }

    /* JADX WARN: Type inference failed for: r8v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r8v4, types: [java.lang.Object, kotlin.Lazy] */
    public final void h(boolean z, MobileOfficialAppsConStoriesStat$ViewEntryPoint mobileOfficialAppsConStoriesStat$ViewEntryPoint, StoryEntry storyEntry, u8m0 u8m0Var) {
        if (z) {
            anm0.d((anm0) this.h.getValue(), MobileOfficialAppsStoriesStat$TypeStoryViewItem.EventType.SHARE_TO_MESSAGE_LONGTAP, MobileOfficialAppsCoreNavStat$EventScreen.STORY_VIEWER, mobileOfficialAppsConStoriesStat$ViewEntryPoint, storyEntry, u8m0Var, 32);
        } else {
            ((j6v) this.i.getValue()).f(NarrativePublishEventType.ADD_STORY_TO_NARRATIVE_LONGTAP, MobileOfficialAppsCoreNavStat$EventScreen.STORY_VIEWER, null);
        }
    }

    /* JADX WARN: Type inference failed for: r8v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r8v4, types: [java.lang.Object, kotlin.Lazy] */
    public final void i(boolean z, MobileOfficialAppsConStoriesStat$ViewEntryPoint mobileOfficialAppsConStoriesStat$ViewEntryPoint, StoryEntry storyEntry, u8m0 u8m0Var) {
        if (z) {
            anm0.d((anm0) this.h.getValue(), MobileOfficialAppsStoriesStat$TypeStoryViewItem.EventType.CLICK_TO_SHARE_LONGTAP, MobileOfficialAppsCoreNavStat$EventScreen.STORY_VIEWER, mobileOfficialAppsConStoriesStat$ViewEntryPoint, storyEntry, u8m0Var, 32);
        } else {
            ((j6v) this.i.getValue()).f(NarrativePublishEventType.CLICK_TO_ADD_TO_NARRATIVE_LONGTAP, MobileOfficialAppsCoreNavStat$EventScreen.STORY_VIEWER, null);
        }
    }
}
