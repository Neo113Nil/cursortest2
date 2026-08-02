package com.vk.story.viewer.impl.presentation.stories;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.PorterDuff;
import android.media.AudioManager;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.viewpager.widget.ViewPager;
import com.huawei.hms.framework.common.BundleUtil;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.vk.dto.common.Attachment;
import com.vk.dto.common.id.UserId;
import com.vk.dto.narratives.Narrative;
import com.vk.dto.stories.model.HighlightStoriesContainer;
import com.vk.dto.stories.model.StoriesContainer;
import com.vk.dto.stories.model.StoryEntry;
import com.vk.dto.stories.model.StoryViewAction;
import com.vk.dto.stories.model.ads.MyTargetAdStoriesContainer;
import com.vk.dto.user.UserProfile;
import com.vk.imageloader.view.VKImageView;
import com.vk.log.L;
import com.vk.stat.scheme.MobileOfficialAppsConStoriesStat$ViewEntryPoint;
import com.vk.stat.scheme.MobileOfficialAppsCoreEncodingStat$TypeStoryVideoItem;
import com.vk.stories.design.view.avatar.StoryAvatarView;
import com.vk.stories.design.view.viewer.VolumeControlView;
import com.vk.story.api.LoadContext;
import com.vk.story.api.di.StoriesComponent;
import com.vk.story.viewer.api.di.StoryViewerComponent;
import com.vk.story.viewer.api.models.PreloadSource;
import com.vk.story.viewer.impl.presentation.stories.b;
import com.vk.story.viewer.impl.presentation.stories.util.audio.RingerStateListener;
import com.vk.story.viewer.impl.presentation.stories.util.audio.StoryAudioHandler;
import com.vk.story.viewer.impl.presentation.stories.util.audio.VolumeChangeListener;
import com.vk.story.viewer.impl.presentation.stories.view.SourceTransitionStory;
import com.vk.story.viewer.impl.presentation.stories.view.StoriesViewPager;
import com.vk.story.viewer.impl.presentation.stories.view.TransferableViewerState;
import com.vk.superapp.navigation.api.data.AppShareType;
import com.vk.toggle.features.StoriesFeatures;
import com.vkontakte.android.R;
import com.vkontakte.android.data.b;
import com.vungle.ads.internal.protos.Sdk;
import io.reactivex.rxjava3.core.q;
import io.reactivex.rxjava3.internal.operators.observable.p1;
import io.reactivex.rxjava3.internal.operators.single.n;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Pair;
import ru.ok.android.api.core.ApiInvocationException;
import xsna.a4c0;
import xsna.ac80;
import xsna.afl0;
import xsna.anj;
import xsna.anm0;
import xsna.asu0;
import xsna.b2n;
import xsna.bd70;
import xsna.bmm0;
import xsna.bpn0;
import xsna.bx80;
import xsna.cqm0;
import xsna.dan;
import xsna.dc80;
import xsna.dlm0;
import xsna.e3m;
import xsna.elm0;
import xsna.ep0;
import xsna.ep50;
import xsna.epj0;
import xsna.etl0;
import xsna.f1m0;
import xsna.f5b0;
import xsna.flm0;
import xsna.fsk;
import xsna.fxi0;
import xsna.g2v;
import xsna.gan;
import xsna.glm0;
import xsna.gmz;
import xsna.gr60;
import xsna.gs00;
import xsna.hcf0;
import xsna.hf8;
import xsna.hlm0;
import xsna.iah0;
import xsna.ikv0;
import xsna.iv1;
import xsna.izt0;
import xsna.j6i;
import xsna.jcf0;
import xsna.jlm0;
import xsna.k7l0;
import xsna.kjs;
import xsna.llm0;
import xsna.lql0;
import xsna.lrl0;
import xsna.m5y;
import xsna.m7m;
import xsna.m9n;
import xsna.mo3;
import xsna.mql0;
import xsna.nbm0;
import xsna.nql0;
import xsna.nr4;
import xsna.osk0;
import xsna.otl0;
import xsna.ow40;
import xsna.p1d0;
import xsna.p870;
import xsna.pkk;
import xsna.po6;
import xsna.ptz;
import xsna.pxo0;
import xsna.q69;
import xsna.q7m0;
import xsna.qlm0;
import xsna.qo6;
import xsna.qpl0;
import xsna.sl30;
import xsna.smm0;
import xsna.syo;
import xsna.tnf;
import xsna.u1u0;
import xsna.u7m0;
import xsna.u8m0;
import xsna.u90;
import xsna.uov;
import xsna.v5m0;
import xsna.vrl0;
import xsna.vu50;
import xsna.w8i;
import xsna.wvl0;
import xsna.wx00;
import xsna.x1e0;
import xsna.xut0;
import xsna.y1q0;
import xsna.yhm0;
import xsna.zjm0;
import xsna.zlm0;

/* compiled from: StoryViewContainer.java */
@SuppressLint({"ViewConstructor"})
/* loaded from: classes6.dex */
public final class b extends FrameLayout implements elm0, syo.a, w8i {
    public static final Handler C0;
    public static final Handler D0;

    @NonNull
    public final MobileOfficialAppsConStoriesStat$ViewEntryPoint A;
    public C1833b A0;

    @NonNull
    public final String B;
    public final c B0;

    @Nullable
    public final String C;

    @NonNull
    public final com.vk.story.api.a D;

    @NonNull
    public final qlm0 E;
    public final SparseArray<String> F;

    @NonNull
    public final io.reactivex.rxjava3.disposables.b G;
    public final bmm0 H;
    public boolean I;
    public boolean J;
    public final HashSet K;
    public final VolumeControlView L;
    public final xut0 M;
    public final dc80 N;
    public final StoriesViewPager O;
    public int P;
    public int Q;
    public boolean R;
    public final m S;
    public final FrameLayout T;
    public final ProgressBar U;
    public final StoryAvatarView V;
    public final TextView W;
    public final VKImageView a0;
    public final pxo0 b;
    public final LinearLayout b0;
    public final pxo0 c;
    public final ImageView c0;
    public final d d;
    public qo6 d0;
    public final e e;
    public final TextView e0;
    public final v5m0 f;
    public final WeakReference<vrl0> f0;
    public final lrl0 g;
    public final float g0;
    public final otl0 h;
    public final anm0 h0;
    public final f i;
    public final jlm0 i0;
    public final g j;
    public UserProfile j0;
    public final hlm0 k;
    public int k0;
    public final lql0 l;
    public Window l0;
    public final mql0 m;
    public io.reactivex.rxjava3.disposables.c m0;
    public final nql0 n;
    public final StoryAudioHandler n0;
    public final yhm0 o;
    public StoryAudioHandler.TransferableState o0;
    public final flm0 p;
    public boolean p0;
    public final glm0 q;
    public TransferableViewerState q0;
    public final h r;
    public boolean r0;
    public final etl0 s;
    public final boolean s0;

    @NonNull
    public final Object t;
    public Boolean t0;
    public final boolean u;
    public Boolean u0;

    @Nullable
    public List<StoriesContainer> v;
    public l v0;
    public boolean w;

    @Nullable
    public Integer w0;

    @NonNull
    public final String x;
    public boolean x0;

    @Nullable
    public final String y;
    public final nbm0 y0;

    @NonNull
    public final MobileOfficialAppsConStoriesStat$ViewEntryPoint z;
    public boolean z0;

    /* compiled from: StoryViewContainer.java */
    public class a implements Runnable {
        public final /* synthetic */ Activity b;

        public a(Activity activity) {
            this.b = activity;
        }

        @Override // java.lang.Runnable
        public final void run() {
            Activity activity = this.b;
            iah0.x(activity, true);
            activity.setRequestedOrientation(7);
        }
    }

    /* compiled from: StoryViewContainer.java */
    /* renamed from: com.vk.story.viewer.impl.presentation.stories.b$b, reason: collision with other inner class name */
    public class C1833b extends BroadcastReceiver {
        public C1833b() {
        }

        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            StoriesViewPager storiesViewPager = b.this.O;
            UserId userId = (UserId) intent.getParcelableExtra("id");
            if (userId == null) {
                return;
            }
            int i = 0;
            int intExtra = intent.getIntExtra("status", 0);
            if ("com.vkontakte.android.ACTION_FRIEND_STATUS_CHANGED".equals(intent.getAction())) {
                while (i < storiesViewPager.getChildCount()) {
                    if (storiesViewPager.getChildAt(i) instanceof qo6) {
                        ((qo6) storiesViewPager.getChildAt(i)).H0(intExtra, userId);
                    }
                    i++;
                }
                return;
            }
            if ("com.vkontakte.android.ACTION_GROUP_STATUS_CHANGED".equals(intent.getAction())) {
                while (i < storiesViewPager.getChildCount()) {
                    if (storiesViewPager.getChildAt(i) instanceof qo6) {
                        ((qo6) storiesViewPager.getChildAt(i)).H(intExtra, userId);
                    }
                    i++;
                }
            }
        }
    }

    /* compiled from: StoryViewContainer.java */
    public class c extends FragmentManager.m {
        public c() {
        }

        @Override // androidx.fragment.app.FragmentManager.m
        public final void b(@NonNull FragmentManager fragmentManager, @NonNull Fragment fragment) {
            b bVar = b.this;
            if (bVar.k0 == 0) {
                bVar.M();
            }
            bVar.k0++;
        }

        @Override // androidx.fragment.app.FragmentManager.m
        public final void c(@NonNull FragmentManager fragmentManager, @NonNull Fragment fragment) {
            b bVar = b.this;
            int i = bVar.k0 - 1;
            bVar.k0 = i;
            if (i == 0) {
                bVar.N();
            }
        }
    }

    /* compiled from: StoryViewContainer.java */
    public class d implements Runnable {
        public d() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            b.this.M.b();
        }
    }

    /* compiled from: StoryViewContainer.java */
    public class e implements Runnable {
        public e() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            b.this.M.a(false);
        }
    }

    /* compiled from: StoryViewContainer.java */
    public class f implements bd70<zjm0> {
        public f() {
        }

        @Override // xsna.bd70
        public final void x0(int i, int i2, zjm0 zjm0Var) {
            StoryEntry storyEntry;
            zjm0 zjm0Var2 = zjm0Var;
            b bVar = b.this;
            bVar.y0.a(102, zjm0Var2);
            StoriesViewPager storiesViewPager = bVar.O;
            for (int i3 = 0; i3 < storiesViewPager.getChildCount(); i3++) {
                if (storiesViewPager.getChildAt(i3) instanceof qo6) {
                    ((qo6) storiesViewPager.getChildAt(i3)).setUploadDone(zjm0Var2);
                }
            }
            List<StoriesContainer> list = bVar.v;
            if (list != null) {
                Iterator<StoriesContainer> it = list.iterator();
                while (it.hasNext()) {
                    Iterator<StoryEntry> it2 = it.next().g.iterator();
                    while (it2.hasNext()) {
                        StoryEntry next = it2.next();
                        if (next.b && next.c == zjm0Var2.a && (storyEntry = zjm0Var2.g) != null) {
                            next.y = zjm0Var2.f;
                            next.Xb(storyEntry);
                            return;
                        }
                    }
                }
            }
        }
    }

    /* compiled from: StoryViewContainer.java */
    public class g implements bd70<zjm0> {
        public g() {
        }

        @Override // xsna.bd70
        public final void x0(int i, int i2, zjm0 zjm0Var) {
            zjm0 zjm0Var2 = zjm0Var;
            b bVar = b.this;
            StoriesViewPager storiesViewPager = bVar.O;
            for (int i3 = 0; i3 < storiesViewPager.getChildCount(); i3++) {
                if (storiesViewPager.getChildAt(i3) instanceof qo6) {
                    ((qo6) storiesViewPager.getChildAt(i3)).setEncodingDone(zjm0Var2);
                }
            }
            List<StoriesContainer> list = bVar.v;
            if (list != null) {
                Iterator<StoriesContainer> it = list.iterator();
                while (it.hasNext()) {
                    Iterator<StoryEntry> it2 = it.next().g.iterator();
                    while (it2.hasNext()) {
                        StoryEntry next = it2.next();
                        if (next.b && next.c == zjm0Var2.a) {
                            next.y = zjm0Var2.f;
                            return;
                        }
                    }
                }
            }
        }
    }

    /* compiled from: StoryViewContainer.java */
    public class h implements bd70<List<StoryEntry>> {
        public h() {
        }

        @Override // xsna.bd70
        public final void x0(int i, int i2, List<StoryEntry> list) {
            List<StoryEntry> list2 = list;
            List<StoriesContainer> list3 = b.this.v;
            if (list3 != null) {
                Iterator<StoriesContainer> it = list3.iterator();
                while (it.hasNext()) {
                    Iterator<StoryEntry> it2 = it.next().g.iterator();
                    while (it2.hasNext()) {
                        StoryEntry next = it2.next();
                        if (list2.contains(next)) {
                            next.h = true;
                        }
                    }
                }
            }
        }
    }

    /* compiled from: StoryViewContainer.java */
    /* loaded from: classes11.dex */
    public interface k {
        void G0(boolean z);

        void finish();

        boolean g1();

        void j(String str);

        void k(Intent intent);

        u90 k1();
    }

    /* compiled from: StoryViewContainer.java */
    public interface l {
    }

    /* compiled from: StoryViewContainer.java */
    public class m extends izt0 {
        public boolean b = false;
        public boolean c = false;
        public boolean d = true;
        public final ac80 e;

        public m(ac80 ac80Var) {
            this.e = ac80Var;
        }

        @Override // xsna.izt0
        public final View b(int i, ViewPager viewPager) {
            boolean z = this.d;
            this.d = false;
            b bVar = b.this;
            String str = bVar.x;
            if (bVar.I()) {
                StoriesContainer storiesContainer = bVar.v.get(i);
                return Objects.equals(storiesContainer.Ob(), str) ? c(i, viewPager, storiesContainer, false, false) : bVar.t0.booleanValue() ? new View(bVar.getContext()) : bVar.z0 ? c(i, viewPager, storiesContainer, true, false) : c(i, viewPager, storiesContainer, false, false);
            }
            StoriesContainer storiesContainer2 = bVar.v.get(i);
            return !bVar.I() ? c(i, viewPager, storiesContainer2, false, z) : Objects.equals(storiesContainer2.Ob(), str) ? c(i, viewPager, storiesContainer2, false, false) : bVar.t0.booleanValue() ? new View(bVar.getContext()) : c(i, viewPager, storiesContainer2, false, false);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final View c(final int i, ViewPager viewPager, StoriesContainer storiesContainer, boolean z, boolean z2) {
            float f;
            Integer num;
            int size = storiesContainer.g.size();
            final b bVar = b.this;
            if (size == 0) {
                List<StoriesContainer> list = bVar.v;
                StoriesContainer storiesContainer2 = list != null ? list.get(i) : null;
                if (storiesContainer2 instanceof HighlightStoriesContainer) {
                    final Narrative narrative = ((HighlightStoriesContainer) storiesContainer2).o;
                    if (!bVar.K.contains(narrative)) {
                        bVar.G.b(new n(((vu50) f1m0.c.getValue()).a(narrative.b, narrative.c, bVar.C).l(new bx80(new fxi0(3), 9)), new gr60(1, bVar, narrative)).m(io.reactivex.rxjava3.android.schedulers.a.b()).subscribe(new io.reactivex.rxjava3.functions.f() { // from class: xsna.ilm0
                            @Override // io.reactivex.rxjava3.functions.f
                            public final void accept(Object obj) {
                                Narrative narrative2 = (Narrative) obj;
                                com.vk.story.viewer.impl.presentation.stories.b bVar2 = com.vk.story.viewer.impl.presentation.stories.b.this;
                                String str = bVar2.y;
                                bVar2.K.remove(narrative);
                                boolean z3 = narrative2.h;
                                cmf0 cmf0Var = cmf0.a;
                                if (z3) {
                                    cmf0Var.c(bVar2.getContext(), bVar2.l0, R.string.narrative_deleted);
                                    bVar2.finish();
                                    return;
                                }
                                if (!narrative2.Ab()) {
                                    cmf0Var.c(bVar2.getContext(), bVar2.l0, R.string.narrative_private);
                                    bVar2.finish();
                                    return;
                                }
                                int parseInt = TextUtils.isEmpty(str) ? 0 : Integer.parseInt(str);
                                HighlightStoriesContainer highlightStoriesContainer = (parseInt == 0 || !narrative2.l.contains(Integer.valueOf(parseInt))) ? new HighlightStoriesContainer(narrative2) : new HighlightStoriesContainer(narrative2, parseInt);
                                ArrayList arrayList = new ArrayList(bVar2.v);
                                arrayList.set(i, highlightStoriesContainer);
                                b.m mVar = bVar2.S;
                                bVar2.v = arrayList;
                                mVar.notifyDataSetChanged();
                            }
                        }, new kjs(bVar, 23)));
                    }
                    return new ptz(bVar.getContext(), storiesContainer, bVar);
                }
            }
            MobileOfficialAppsConStoriesStat$ViewEntryPoint viewEntryPoint = bVar.getViewEntryPoint();
            bVar.D.e = viewEntryPoint;
            if (bVar.w) {
                Integer num2 = storiesContainer.k;
            } else if (viewEntryPoint == MobileOfficialAppsConStoriesStat$ViewEntryPoint.DISCOVER || gan.a.$EnumSwitchMapping$0[viewEntryPoint.ordinal()] != 5) {
            }
            if (bVar.u0.booleanValue()) {
                bVar.u0 = Boolean.FALSE;
                f = bVar.g0;
            } else {
                f = 1.0f;
            }
            dlm0 dlm0Var = new dlm0(bVar.getContext(), storiesContainer, bVar.E, bVar.f0);
            dlm0Var.i = bVar;
            dlm0Var.h = bVar.N;
            dlm0Var.f = viewEntryPoint;
            dlm0Var.g = i;
            dlm0Var.j = bVar.D;
            dlm0Var.k = bVar.l0;
            dlm0Var.l = viewPager;
            dlm0Var.o = z;
            dlm0Var.m = this.e;
            dlm0Var.n = f;
            dlm0Var.q = z2;
            if (!bVar.x0 && (num = bVar.w0) != null) {
                dlm0Var.p = num;
            }
            qo6 a = dlm0Var.a();
            bVar.x0 = true;
            b.w(bVar, a, false);
            if (bVar.d0 == null) {
                bVar.d0 = a;
                b.w(bVar, a, true);
                l lVar = bVar.v0;
                if (lVar != null) {
                    a4c0 a4c0Var = (a4c0) lVar;
                    com.vk.story.viewer.impl.presentation.stories.c cVar = (com.vk.story.viewer.impl.presentation.stories.c) a4c0Var.d;
                    int i2 = a4c0Var.b;
                    int i3 = a4c0Var.c;
                    pkk pkkVar = (pkk) a4c0Var.e;
                    long max = Math.max(320 - (System.currentTimeMillis() - cVar.a0), 100L);
                    ArrayList arrayList = new ArrayList();
                    Animator K0 = a.K0(true, cVar.m, i2, i3);
                    if (K0 != null) {
                        arrayList.add(K0);
                    }
                    Animator P = a.P();
                    if (P != null) {
                        P.setStartDelay(106L);
                        arrayList.add(P);
                    }
                    AnimatorSet animatorSet = new AnimatorSet();
                    animatorSet.playTogether(arrayList);
                    animatorSet.setInterpolator(pkkVar);
                    animatorSet.setDuration(max);
                    animatorSet.setupStartValues();
                    animatorSet.start();
                }
                if (a instanceof dan) {
                    bVar.H.e(bVar.S.getCount(), i, bVar.d0);
                }
            }
            return (View) a;
        }

        public final int d(@Nullable String str) {
            b bVar = b.this;
            List<StoriesContainer> list = bVar.v;
            if (list != null && !list.isEmpty()) {
                for (int i = 0; i < bVar.v.size(); i++) {
                    if (Objects.equals(bVar.v.get(i).f, str) && Objects.equals(str, bVar.d0.getStoriesContainer().f)) {
                        return i;
                    }
                }
            }
            return -2;
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public final int getCount() {
            List<StoriesContainer> list = b.this.v;
            if (list != null) {
                return list.size();
            }
            return 0;
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public final int getItemPosition(@NonNull Object obj) {
            int indexOf;
            if (this.c) {
                if (obj instanceof uov) {
                    return d(((uov) obj).getStoriesContainer().f);
                }
                if (obj instanceof gmz) {
                    return d(((gmz) obj).getStoriesContainer().f);
                }
            }
            if (this.b || !(obj instanceof uov) || (indexOf = b.this.v.indexOf(((uov) obj).getStoriesContainer())) < 0) {
                return -2;
            }
            return indexOf;
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public final void setPrimaryItem(@NonNull ViewGroup viewGroup, int i, @NonNull Object obj) {
            StoryEntry currentStory;
            super.setPrimaryItem(viewGroup, i, obj);
            if (!(obj instanceof po6) || (currentStory = ((po6) obj).getCurrentStory()) == null) {
                return;
            }
            this.e.a(currentStory);
        }
    }

    static {
        iah0.a(40);
        C0 = new Handler(Looper.getMainLooper());
        D0 = new Handler(Looper.getMainLooper());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v5, types: [xsna.bd70, xsna.glm0] */
    /* JADX WARN: Type inference failed for: r11v0, types: [xsna.bd70, xsna.hlm0] */
    /* JADX WARN: Type inference failed for: r2v9, types: [xsna.jlm0] */
    public b(@NonNull Context context, @NonNull MobileOfficialAppsConStoriesStat$ViewEntryPoint mobileOfficialAppsConStoriesStat$ViewEntryPoint, @NonNull MobileOfficialAppsConStoriesStat$ViewEntryPoint mobileOfficialAppsConStoriesStat$ViewEntryPoint2, @NonNull String str, @Nullable String str2, @Nullable String str3, boolean z, @NonNull k kVar, @Nullable List<StoriesContainer> list, @NonNull String str4, @Nullable String str5, @NonNull com.vk.story.api.a aVar, @NonNull y1q0 y1q0Var, @NonNull qlm0 qlm0Var, @NonNull WeakReference<vrl0> weakReference, float f2) {
        super(context);
        int i2;
        this.b = new pxo0(30L);
        this.c = new pxo0(400L);
        this.d = new d();
        this.e = new e();
        this.f = ((StoriesComponent) j6i.b(m7m.f(this), StoriesComponent.class)).u5();
        this.g = ((StoriesComponent) j6i.b(m7m.f(this), StoriesComponent.class)).bf();
        this.h = ((StoriesComponent) j6i.b(m7m.f(this), StoriesComponent.class)).r2();
        f fVar = new f();
        this.i = fVar;
        g gVar = new g();
        this.j = gVar;
        ?? r11 = new bd70() { // from class: xsna.hlm0
            @Override // xsna.bd70
            public final void x0(int i3, int i4, Object obj) {
                zjm0 zjm0Var = (zjm0) obj;
                com.vk.story.viewer.impl.presentation.stories.b bVar = com.vk.story.viewer.impl.presentation.stories.b.this;
                bVar.y0.a(103, zjm0Var);
                StoriesViewPager storiesViewPager = bVar.O;
                for (int i5 = 0; i5 < storiesViewPager.getChildCount(); i5++) {
                    if (storiesViewPager.getChildAt(i5) instanceof qo6) {
                        ((qo6) storiesViewPager.getChildAt(i5)).setUploadProgress(zjm0Var);
                    }
                }
            }
        };
        this.k = r11;
        int i3 = 1;
        lql0 lql0Var = new lql0(this, i3);
        this.l = lql0Var;
        mql0 mql0Var = new mql0(this, i3);
        this.m = mql0Var;
        nql0 nql0Var = new nql0(this, i3);
        this.n = nql0Var;
        yhm0 yhm0Var = new yhm0(this, i3);
        this.o = yhm0Var;
        flm0 flm0Var = new flm0(this, 0);
        this.p = flm0Var;
        ?? r10 = new bd70() { // from class: xsna.glm0
            @Override // xsna.bd70
            public final void x0(int i4, int i5, Object obj) {
                axl0 axl0Var = (axl0) obj;
                StoriesViewPager storiesViewPager = com.vk.story.viewer.impl.presentation.stories.b.this.O;
                for (int i6 = 0; i6 < storiesViewPager.getChildCount(); i6++) {
                    if (storiesViewPager.getChildAt(i6) instanceof qo6) {
                        ((qo6) storiesViewPager.getChildAt(i6)).m0(axl0Var);
                    }
                }
            }
        };
        this.q = r10;
        h hVar = new h();
        this.r = hVar;
        etl0 etl0Var = new etl0(this, 1);
        this.s = etl0Var;
        new ArrayList();
        this.F = new SparseArray<>();
        io.reactivex.rxjava3.disposables.b bVar = new io.reactivex.rxjava3.disposables.b();
        this.G = bVar;
        this.I = true;
        this.J = false;
        this.K = new HashSet();
        this.R = false;
        this.h0 = ((StoryViewerComponent) j6i.b(m7m.f(this), StoryViewerComponent.class)).l9();
        this.k0 = 0;
        this.o0 = null;
        this.p0 = false;
        this.q0 = null;
        this.r0 = false;
        StoriesFeatures storiesFeatures = StoriesFeatures.STORY_VIEWER_OPTIMIZED_INITIAL;
        storiesFeatures.getClass();
        this.s0 = com.vk.toggle.b.A.a(storiesFeatures);
        Boolean bool = Boolean.TRUE;
        this.t0 = bool;
        this.u0 = bool;
        this.v0 = null;
        i iVar = new i();
        j jVar = new j();
        this.w0 = null;
        this.x0 = false;
        this.A0 = new C1833b();
        c cVar = new c();
        this.B0 = cVar;
        MobileOfficialAppsConStoriesStat$ViewEntryPoint mobileOfficialAppsConStoriesStat$ViewEntryPoint3 = MobileOfficialAppsConStoriesStat$ViewEntryPoint.LIST;
        if (mobileOfficialAppsConStoriesStat$ViewEntryPoint == mobileOfficialAppsConStoriesStat$ViewEntryPoint3) {
            qlm0Var.l.e();
        }
        this.H = new bmm0(this, qlm0Var.s);
        this.z = mobileOfficialAppsConStoriesStat$ViewEntryPoint;
        this.A = mobileOfficialAppsConStoriesStat$ViewEntryPoint2;
        this.B = str;
        this.C = str2;
        this.u = z;
        this.t = kVar;
        this.v = list;
        this.x = str4;
        this.y = str5;
        this.D = aVar;
        this.E = qlm0Var;
        this.f0 = weakReference;
        this.g0 = f2;
        weakReference.get().r(new x1e0(this, 14));
        qlm0Var.s.b = this;
        this.y0 = new nbm0(getContext(), qlm0Var.o, new jcf0(this, 10));
        p870 p870Var = qlm0Var.q;
        p870Var.b(103, r11);
        p870Var.b(102, fVar);
        p870Var.b(104, lql0Var);
        p870Var.b(108, mql0Var);
        p870Var.b(110, nql0Var);
        p870Var.b(ApiInvocationException.ErrorCodes.PARAM_SESSION_KEY_CHANGED, yhm0Var);
        p870Var.b(111, flm0Var);
        p870Var.b(Sdk.SDKError.Reason.ASSET_FAILED_STATUS_CODE_VALUE, r10);
        p870Var.b(100, hVar);
        p870Var.b(105, gVar);
        p870Var.b(127, etl0Var);
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.vkontakte.android.ACTION_FRIEND_STATUS_CHANGED");
        intentFilter.addAction("com.vkontakte.android.ACTION_GROUP_STATUS_CHANGED");
        int i4 = 4;
        anj.d(context, this.A0, intentFilter, hf8.a, 4);
        if (getContext() instanceof AppCompatActivity) {
            ((AppCompatActivity) getContext()).getSupportFragmentManager().c0(cVar, false);
        }
        LayoutInflater.from(getContext()).inflate(R.layout.activity_view_story, this);
        dc80 dc80Var = new dc80(getContext(), new com.vk.story.viewer.impl.presentation.stories.a(this));
        this.N = dc80Var;
        dc80Var.l = new llm0(this);
        dc80Var.k.getClass();
        dc80Var.h = iah0.a(40);
        m mVar = new m(new ac80(y1q0Var, str2));
        this.S = mVar;
        StoriesViewPager storiesViewPager = (StoriesViewPager) findViewById(R.id.pager);
        this.O = storiesViewPager;
        storiesViewPager.setAdapter(mVar);
        storiesViewPager.setPageTransformer(false, new u7m0());
        storiesViewPager.setPageMargin(iah0.a(20));
        storiesViewPager.setEdgeCallback(this);
        storiesViewPager.d.d();
        u1u0.e(new ep0(this, 10));
        if (mobileOfficialAppsConStoriesStat$ViewEntryPoint == mobileOfficialAppsConStoriesStat$ViewEntryPoint3) {
            storiesViewPager.addOnPageChangeListener(iVar);
        } else {
            storiesViewPager.addOnPageChangeListener(jVar);
        }
        VolumeControlView volumeControlView = (VolumeControlView) findViewById(R.id.vcv_volume_control_view);
        this.L = volumeControlView;
        this.M = new xut0(volumeControlView);
        FrameLayout frameLayout = (FrameLayout) findViewById(R.id.fl_loading_view);
        this.T = frameLayout;
        this.V = (StoryAvatarView) frameLayout.findViewById(R.id.iv_avatar);
        this.W = (TextView) frameLayout.findViewById(R.id.tv_title);
        this.a0 = (VKImageView) frameLayout.findViewById(R.id.iv_loading_bg);
        LinearLayout linearLayout = (LinearLayout) frameLayout.findViewById(R.id.ll_expired_message);
        this.b0 = linearLayout;
        this.c0 = (ImageView) linearLayout.findViewById(R.id.iv_error_image);
        this.e0 = (TextView) linearLayout.findViewById(R.id.tv_error_text);
        ProgressBar progressBar = (ProgressBar) frameLayout.findViewById(R.id.pb_loading);
        this.U = progressBar;
        progressBar.getIndeterminateDrawable().setColorFilter(-1, PorterDuff.Mode.MULTIPLY);
        findViewById(R.id.iv_close).setOnClickListener(new mo3(this, 17));
        if (list != null) {
            int i5 = 0;
            while (true) {
                if (i5 >= list.size()) {
                    break;
                }
                StoriesContainer storiesContainer = list.get(i5);
                if (storiesContainer != null) {
                    if (storiesContainer.j) {
                        wvl0 wvl0Var = this.E.i;
                        bpn0 bpn0Var = cqm0.a;
                        try {
                            i2 = Integer.parseInt(str4);
                        } catch (Throwable unused) {
                            i2 = 0;
                        }
                        if (wvl0Var.a(storiesContainer, i2) != -1) {
                            storiesViewPager.setCurrentItem(i5, false);
                            this.Q = i5;
                            break;
                        }
                    }
                    if (storiesContainer.Ob().equals(str4)) {
                        storiesViewPager.setCurrentItem(i5, false);
                        this.Q = i5;
                        break;
                    }
                }
                i5++;
            }
        } else if (TextUtils.isEmpty(str5)) {
            finish();
        } else {
            frameLayout.setVisibility(0);
            bVar.b(f1m0.a(str5, aVar.b).subscribe(new sl30(this, 26), new ow40(this, 18)));
        }
        int i6 = 2;
        this.n0 = new StoryAudioHandler(new p1d0(this, 19), new afl0(this, i6));
        this.i0 = new anm0.b() { // from class: xsna.jlm0
            @Override // xsna.anm0.b
            public final void a(b.d dVar) {
                com.vk.story.viewer.impl.presentation.stories.b bVar2 = com.vk.story.viewer.impl.presentation.stories.b.this;
                StoryAudioHandler storyAudioHandler = bVar2.n0;
                Context context2 = bVar2.getContext();
                storyAudioHandler.e.getClass();
                dVar.b(Integer.valueOf(f5b0.a(context2).getRingerMode() == 2 ? 1 : 0), "has_sound");
            }
        };
        qlm0Var.n.getClass();
        bmm0 bmm0Var = this.H;
        if (list != null && !list.isEmpty()) {
            Iterator<StoriesContainer> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                if (it.next().l) {
                    if (str3 != null) {
                        bmm0Var.c = str3;
                    }
                    this.w = true;
                    String str6 = this.C;
                    if (!bmm0Var.d) {
                        bmm0Var.g(true);
                        bmm0Var.e = str6;
                        m9n m9nVar = m9n.b;
                        q a2 = m9n.a(6, str6, str3);
                        asu0 asu0Var = asu0.a;
                        bmm0Var.f = new p1(a2.r0(asu0Var.c()).Z(io.reactivex.rxjava3.core.g.b, asu0Var.d(), true).U(new gs00(new epj0(i4), 12)), new osk0(new zlm0(0), i6)).subscribe(new wx00(new k7l0(bmm0Var, i4), 22), new m5y(new q69(bmm0Var, 13), 28));
                    }
                }
            }
        }
        if (I()) {
            this.O.f = true;
        }
        if (mobileOfficialAppsConStoriesStat$ViewEntryPoint == MobileOfficialAppsConStoriesStat$ViewEntryPoint.LIST) {
            qlm0Var.e.d();
        }
    }

    public static boolean G(Intent intent, String str) {
        return intent != null && intent.hasExtra(str) && intent.getBooleanExtra(str, false);
    }

    public static void t(b bVar) {
        StoriesViewPager storiesViewPager = bVar.O;
        for (int i2 = 0; i2 < storiesViewPager.getChildCount(); i2++) {
            if (storiesViewPager.getChildAt(i2) instanceof qo6) {
                ((qo6) storiesViewPager.getChildAt(i2)).S();
            }
        }
    }

    public static void u(b bVar, int i2, int i3) {
        StoriesViewPager storiesViewPager = bVar.O;
        for (int i4 = 0; i4 < storiesViewPager.getChildCount(); i4++) {
            if (storiesViewPager.getChildAt(i4) instanceof qo6) {
                ((qo6) storiesViewPager.getChildAt(i4)).L(i2, i3);
            }
        }
    }

    public static void v(b bVar, int i2, int i3) {
        qlm0 qlm0Var = bVar.E;
        List<StoriesContainer> list = bVar.v;
        if (list == null || i3 >= list.size()) {
            return;
        }
        StoriesContainer storiesContainer = bVar.v.get(i3);
        qo6 E = bVar.E(i3);
        if (i2 > i3 && E != null) {
            StoryEntry currentStory = E.getCurrentStory();
            CopyOnWriteArrayList<StoryEntry> copyOnWriteArrayList = storiesContainer.g;
            if (fsk.z(storiesContainer)) {
                qlm0Var.b.f(copyOnWriteArrayList);
            } else if (currentStory != null) {
                qlm0Var.b.h(storiesContainer, currentStory);
            } else {
                qlm0Var.b.d(storiesContainer, currentStory);
            }
        }
        bVar.F();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void w(b bVar, qo6 qo6Var, boolean z) {
        int i2 = z ? 1 : 4;
        if (qo6Var instanceof View) {
            ((View) qo6Var).setImportantForAccessibility(i2);
        }
    }

    public static void x(b bVar, int i2, int i3, boolean z) {
        qlm0 qlm0Var = bVar.E;
        if (bVar.O.a() || z) {
            return;
        }
        qo6 E = bVar.E(i3);
        StoryEntry currentStory = E != null ? E.getCurrentStory() : null;
        StoriesContainer storiesContainer = E != null ? E.getStoriesContainer() : null;
        if (currentStory != null) {
            qlm0Var.s.d();
            qlm0Var.s.c(storiesContainer, currentStory, MobileOfficialAppsCoreEncodingStat$TypeStoryVideoItem.TypeNextStory.NEXT_CONTAINER_STORY);
            bVar.h0.t(i3 > i2 ? StoryViewAction.GO_TO_NEXT_AUTHOR : StoryViewAction.GO_TO_PREVIOUS_AUTHOR, bVar.getViewEntryPoint(), currentStory, bVar.B(), bVar.B, null);
        }
    }

    public final boolean A() {
        return this.R;
    }

    public final u8m0 B() {
        qo6 E = E(this.O.getCurrentItem());
        StoryEntry currentStory = E != null ? E.getCurrentStory() : null;
        if (E != null && currentStory != null) {
            long currentTime = E.getCurrentTime();
            StoriesContainer storiesContainer = E.getStoriesContainer();
            Long duration = E.getDuration();
            boolean z = this.D.c;
            if (storiesContainer != null) {
                int indexOf = storiesContainer.g.indexOf(currentStory);
                return new u8m0(currentTime, indexOf, (storiesContainer.g.size() - 1) - indexOf, duration, z);
            }
        }
        return null;
    }

    public final boolean C(KeyEvent keyEvent) {
        int action = keyEvent.getAction();
        int keyCode = keyEvent.getKeyCode();
        if (keyCode != 24 && keyCode != 25) {
            return false;
        }
        L.e("Received volume change key event");
        StoryAudioHandler storyAudioHandler = this.n0;
        Context context = getContext();
        synchronized (storyAudioHandler) {
            if (storyAudioHandler.f) {
                storyAudioHandler.g = true;
                storyAudioHandler.b(context, true);
            }
        }
        try {
            ((AudioManager) getContext().getSystemService("audio")).adjustStreamVolume(3, (keyCode == 24 && action == 0) ? 1 : (keyCode == 25 && action == 0) ? -1 : 0, 0);
            this.L.setVolumeLevel(r4.getStreamVolume(3) / r4.getStreamMaxVolume(3));
            Handler handler = D0;
            handler.removeCallbacksAndMessages(null);
            handler.post(this.d);
            handler.postDelayed(this.e, 2000L);
            StoriesViewPager storiesViewPager = this.O;
            for (int i2 = 0; i2 < storiesViewPager.getChildCount(); i2++) {
                if (storiesViewPager.getChildAt(i2) instanceof qo6) {
                    ((qo6) storiesViewPager.getChildAt(i2)).z();
                }
            }
        } catch (Exception unused) {
        }
        return true;
    }

    public final void D() {
        postDelayed(new iv1(this, 11), this.z == MobileOfficialAppsConStoriesStat$ViewEntryPoint.LIST ? 156L : 0L);
    }

    @Nullable
    public final qo6 E(int i2) {
        StoriesViewPager storiesViewPager = this.O;
        for (int childCount = storiesViewPager.getChildCount() - 1; childCount >= 0; childCount--) {
            if (storiesViewPager.getChildAt(childCount) instanceof qo6) {
                qo6 qo6Var = (qo6) storiesViewPager.getChildAt(childCount);
                if (qo6Var.getPosition() == i2) {
                    return qo6Var;
                }
            }
        }
        return null;
    }

    public final void F() {
        CopyOnWriteArrayList<StoryEntry> copyOnWriteArrayList;
        StoryEntry currentStoryEntry = getCurrentStoryEntry();
        if ((currentStoryEntry != null && currentStoryEntry.F) || (getCurrentStoryView() instanceof dan) || (getCurrentStoryView() instanceof b2n)) {
            return;
        }
        qlm0 qlm0Var = this.E;
        qpl0 qpl0Var = qlm0Var.e;
        qpl0 qpl0Var2 = qlm0Var.e;
        StoriesContainer b = qpl0Var.b(getViewEntryPoint());
        List<StoriesContainer> list = this.v;
        if (b == null || list == null || list.contains(b)) {
            return;
        }
        int currentItem = this.O.getCurrentItem();
        if (currentItem < list.size() - 1) {
            int i2 = currentItem + 1;
            StoriesContainer storiesContainer = list.get(i2);
            if (storiesContainer != null && ((copyOnWriteArrayList = storiesContainer.g) == null || !copyOnWriteArrayList.isEmpty())) {
                Iterator<StoryEntry> it = copyOnWriteArrayList.iterator();
                while (it.hasNext()) {
                    if (it.next().F) {
                        return;
                    }
                }
            }
            list.add(i2, b);
        } else {
            list.add(b);
        }
        qpl0Var2.e();
        this.S.notifyDataSetChanged();
        if (b instanceof MyTargetAdStoriesContainer) {
            qpl0Var2.d();
        }
    }

    public final boolean H() {
        return this.S.getCount() == 1 || this.O.getCurrentItem() == 0;
    }

    public final boolean I() {
        return this.s0 && this.z == MobileOfficialAppsConStoriesStat$ViewEntryPoint.LIST;
    }

    public final boolean J() {
        int currentItem = this.O.getCurrentItem();
        m mVar = this.S;
        if (mVar.getCount() == 1 || currentItem == mVar.getCount() - 1) {
            return this.I;
        }
        return false;
    }

    public final void K(int i2, int i3, Intent intent) {
        StoryEntry currentStoryEntry;
        if (i2 == 77 && i3 == -1) {
            UserProfile userProfile = (UserProfile) intent.getParcelableExtra(CommonConstant.SCOPE.SCOPE_ACCOUNT_PROFILE);
            this.j0 = userProfile;
            if (userProfile == null) {
                nr4.b().k(getContext(), null);
                return;
            } else {
                g2v.c().b().B(getContext(), com.vk.dto.common.a.a(this.j0.c), null, Collections.EMPTY_LIST, "story", null, false);
                return;
            }
        }
        nbm0 nbm0Var = this.y0;
        if (i2 == 9091) {
            if (i3 != -1) {
                if (getCurrentStoryEntry() != null) {
                    V(StoryViewAction.REPLY_CANCEL);
                    return;
                }
                return;
            } else {
                StoryEntry currentStoryEntry2 = getCurrentStoryEntry();
                if (currentStoryEntry2 != null) {
                    nbm0Var.c(new Pair<>(currentStoryEntry2.d, Integer.valueOf(currentStoryEntry2.c)));
                    return;
                }
                return;
            }
        }
        if (i2 == 1234 && i3 == -1) {
            if (G(intent, AppShareType.MESSAGE.h())) {
                V(StoryViewAction.SHARE_TO_MESSAGE);
                return;
            }
            if (G(intent, AppShareType.COPY_LINK.h())) {
                V(StoryViewAction.COPY_LINK);
                return;
            }
            if (G(intent, AppShareType.OTHER.h())) {
                V(StoryViewAction.SHARE_OUTSIDE);
            } else {
                if (!G(intent, AppShareType.STORY.h()) || (currentStoryEntry = getCurrentStoryEntry()) == null) {
                    return;
                }
                nbm0Var.c(new Pair<>(currentStoryEntry.d, Integer.valueOf(currentStoryEntry.c)));
            }
        }
    }

    public final void L() {
        boolean z = this.w;
        List<StoriesContainer> list = this.v;
        qo6 currentStoryView = getCurrentStoryView();
        qlm0 qlm0Var = this.E;
        wvl0 wvl0Var = qlm0Var.i;
        int i2 = 0;
        if (z && currentStoryView != null && list != null) {
            int size = list.size();
            boolean z2 = false;
            for (int indexOf = list.indexOf(currentStoryView.getStoriesContainer()); indexOf < size; indexOf++) {
                StoriesContainer storiesContainer = list.get(indexOf);
                if (storiesContainer.l) {
                    CopyOnWriteArrayList<StoryEntry> copyOnWriteArrayList = storiesContainer.g;
                    if (copyOnWriteArrayList == null || !copyOnWriteArrayList.isEmpty()) {
                        Iterator<StoryEntry> it = copyOnWriteArrayList.iterator();
                        while (it.hasNext()) {
                            if (!it.next().h) {
                                z2 = true;
                                break;
                            }
                        }
                    }
                    z2 = false;
                    if (z2) {
                        break;
                    }
                }
            }
            if (!z2) {
                wvl0Var.d();
            }
        }
        smm0 smm0Var = qlm0Var.t;
        smm0Var.d.dispose();
        smm0Var.e.dispose();
        this.f.cancel();
        io.reactivex.rxjava3.disposables.c cVar = this.H.f;
        if (cVar != null) {
            cVar.dispose();
        }
        qlm0Var.b.c();
        p870 p870Var = qlm0Var.q;
        p870Var.g(this.k);
        p870Var.g(this.i);
        p870Var.g(this.l);
        p870Var.g(this.m);
        p870Var.g(this.n);
        p870Var.g(this.o);
        p870Var.g(this.p);
        p870Var.g(this.q);
        p870Var.g(this.r);
        p870Var.g(this.j);
        p870Var.g(this.s);
        if (this.A0 != null) {
            try {
                getContext().unregisterReceiver(this.A0);
            } catch (IllegalStateException unused) {
            }
            this.A0 = null;
        }
        if (getContext() instanceof AppCompatActivity) {
            ((AppCompatActivity) getContext()).getSupportFragmentManager().r0(this.B0);
        }
        while (true) {
            StoriesViewPager storiesViewPager = this.O;
            if (i2 >= storiesViewPager.getChildCount()) {
                break;
            }
            if (storiesViewPager.getChildAt(i2) instanceof qo6) {
                ((qo6) storiesViewPager.getChildAt(i2)).destroy();
            }
            i2++;
        }
        this.G.e();
        this.K.clear();
        qlm0Var.n.getClass();
        nbm0 nbm0Var = this.y0;
        nbm0Var.e = null;
        ikv0 ikv0Var = nbm0Var.f;
        if (ikv0Var != null) {
            ikv0Var.a();
        }
        nbm0Var.f = null;
        nbm0Var.g = null;
    }

    public final void M() {
        StoryAudioHandler.TransferableState transferableState;
        StoryAudioHandler.TransferableState transferableState2;
        Activity h2 = e3m.h(getContext());
        if (h2 != null) {
            iah0.x(h2, false);
        }
        StoriesViewPager storiesViewPager = this.O;
        for (int i2 = 0; i2 < storiesViewPager.getChildCount(); i2++) {
            if (storiesViewPager.getChildAt(i2) instanceof qo6) {
                ((qo6) storiesViewPager.getChildAt(i2)).onPause();
            }
        }
        this.h0.w(this.i0);
        if (this.p0) {
            return;
        }
        StoryAudioHandler storyAudioHandler = this.n0;
        Context context = getContext();
        synchronized (storyAudioHandler) {
            if (storyAudioHandler.f) {
                synchronized (storyAudioHandler) {
                    transferableState = new StoryAudioHandler.TransferableState(storyAudioHandler.g, storyAudioHandler.c.e);
                    storyAudioHandler.f = false;
                    storyAudioHandler.g = false;
                    storyAudioHandler.c.a(context);
                    RingerStateListener ringerStateListener = storyAudioHandler.e;
                    ringerStateListener.getClass();
                    try {
                        context.unregisterReceiver(ringerStateListener);
                    } catch (Throwable unused) {
                    }
                    VolumeChangeListener volumeChangeListener = storyAudioHandler.d;
                    volumeChangeListener.getClass();
                    try {
                        context.unregisterReceiver(volumeChangeListener);
                    } catch (Throwable unused2) {
                    }
                }
                transferableState2 = transferableState;
            } else {
                transferableState2 = null;
            }
        }
        this.o0 = transferableState2;
        this.p0 = true;
    }

    public final void N() {
        if (this.k0 != 0) {
            return;
        }
        if (this.f0.get() != null) {
            this.f0.get().l();
        }
        Activity h2 = e3m.h(getContext());
        if (h2 != null) {
            C0.post(new a(h2));
        }
        TransferableViewerState transferableViewerState = this.q0;
        StoryAudioHandler.TransferableState transferableState = null;
        if (transferableViewerState != null) {
            StoryAudioHandler.TransferableState transferableState2 = transferableViewerState.b;
            this.q0 = null;
            transferableState = transferableState2;
        }
        StoryAudioHandler storyAudioHandler = this.n0;
        Context context = getContext();
        synchronized (storyAudioHandler) {
            if (!storyAudioHandler.f) {
                RingerStateListener ringerStateListener = storyAudioHandler.e;
                ringerStateListener.getClass();
                ringerStateListener.c = f5b0.a(context).getRingerMode();
                context.registerReceiver(ringerStateListener, ringerStateListener.b);
                VolumeChangeListener volumeChangeListener = storyAudioHandler.d;
                context.registerReceiver(volumeChangeListener, volumeChangeListener.b);
                storyAudioHandler.f = true;
                storyAudioHandler.a(context, transferableState);
            }
        }
        this.h0.C(this.i0);
        StoriesViewPager storiesViewPager = this.O;
        for (int i2 = 0; i2 < storiesViewPager.getChildCount(); i2++) {
            if (storiesViewPager.getChildAt(i2) instanceof qo6) {
                ((qo6) storiesViewPager.getChildAt(i2)).onResume();
            }
        }
    }

    public final void O() {
        qo6 E;
        StoriesViewPager storiesViewPager = this.O;
        if (storiesViewPager == null || (E = E(storiesViewPager.getCurrentItem())) == null) {
            return;
        }
        E.U();
    }

    public final void P() {
        int i2 = 0;
        while (true) {
            StoriesViewPager storiesViewPager = this.O;
            if (i2 >= storiesViewPager.getChildCount()) {
                return;
            }
            if (storiesViewPager.getChildAt(i2) instanceof qo6) {
                ((qo6) storiesViewPager.getChildAt(i2)).pause();
            }
            i2++;
        }
    }

    public final void Q() {
        int i2 = 0;
        while (true) {
            StoriesViewPager storiesViewPager = this.O;
            if (i2 >= storiesViewPager.getChildCount()) {
                return;
            }
            if (storiesViewPager.getChildAt(i2) instanceof qo6) {
                ((qo6) storiesViewPager.getChildAt(i2)).play();
            }
            i2++;
        }
    }

    public final void R() {
        int i2 = 0;
        while (true) {
            StoriesViewPager storiesViewPager = this.O;
            if (i2 >= storiesViewPager.getChildCount()) {
                return;
            }
            if (storiesViewPager.getChildAt(i2) instanceof qo6) {
                ((qo6) storiesViewPager.getChildAt(i2)).D();
            }
            i2++;
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [com.vk.story.viewer.impl.presentation.stories.b$k, java.lang.Object] */
    @Override // xsna.elm0
    public final void R2(Object obj) {
        nr4.b().E(this.t.k1(), 1234, (Attachment) obj, true);
    }

    public final void S(@Nullable ArrayList<StoriesContainer> arrayList, boolean z) {
        this.v = arrayList;
        m mVar = this.S;
        if (!z) {
            mVar.notifyDataSetChanged();
            return;
        }
        mVar.b = true;
        mVar.notifyDataSetChanged();
        mVar.b = false;
    }

    public final void T(boolean z) {
        int i2 = 0;
        while (true) {
            StoriesViewPager storiesViewPager = this.O;
            if (i2 >= storiesViewPager.getChildCount()) {
                return;
            }
            if (storiesViewPager.getChildAt(i2) instanceof qo6) {
                ((qo6) storiesViewPager.getChildAt(i2)).E0(z);
            }
            i2++;
        }
    }

    public final void U(boolean z) {
        int i2 = 0;
        while (true) {
            StoriesViewPager storiesViewPager = this.O;
            if (i2 >= storiesViewPager.getChildCount()) {
                return;
            }
            if (storiesViewPager.getChildAt(i2) instanceof qo6) {
                ((qo6) storiesViewPager.getChildAt(i2)).v0(z, true, true);
            }
            i2++;
        }
    }

    public final void V(StoryViewAction storyViewAction) {
        this.h0.t(storyViewAction, getViewEntryPoint(), getCurrentStoryEntry(), B(), this.B, new hcf0(2, this, storyViewAction));
    }

    @Override // xsna.elm0
    public final boolean a() {
        return !this.n0.c.e;
    }

    @Override // xsna.elm0
    public final void b() {
        StoryAudioHandler storyAudioHandler = this.n0;
        Context context = getContext();
        synchronized (storyAudioHandler) {
            if (storyAudioHandler.f) {
                boolean z = true;
                storyAudioHandler.g = true;
                storyAudioHandler.e.getClass();
                if (f5b0.a(context).getRingerMode() != 2) {
                    z = false;
                }
                storyAudioHandler.b(context, z);
            }
        }
    }

    @Override // xsna.elm0
    public final int c(StoriesContainer storiesContainer) {
        int i2;
        boolean z = this.J;
        com.vk.story.api.a aVar = this.D;
        int i3 = 0;
        if (z) {
            if (aVar.b == LoadContext.All.b) {
                return 0;
            }
            return storiesContainer.Kb();
        }
        this.J = true;
        String str = this.y;
        if (TextUtils.isEmpty(str)) {
            if (!storiesContainer.j) {
                return storiesContainer.Kb();
            }
            wvl0 wvl0Var = this.E.i;
            String str2 = this.x;
            bpn0 bpn0Var = cqm0.a;
            try {
                i3 = Integer.parseInt(str2);
            } catch (Throwable unused) {
            }
            return wvl0Var.a(storiesContainer, i3);
        }
        String[] split = str.split(BundleUtil.UNDERLINE_TAG);
        if (split.length < 2) {
            return storiesContainer.Kb();
        }
        String str3 = split[1];
        bpn0 bpn0Var2 = cqm0.a;
        try {
            i2 = Integer.parseInt(str3);
        } catch (Throwable unused2) {
            i2 = 0;
        }
        LoadContext loadContext = aVar.b;
        if (loadContext == LoadContext.New.b) {
            return storiesContainer.Kb();
        }
        if (loadContext == LoadContext.All.b || (loadContext instanceof LoadContext.StoryList)) {
            return 0;
        }
        if (loadContext != LoadContext.Owner.b && loadContext != LoadContext.AllBySingleStory.b) {
            return storiesContainer.Kb();
        }
        Iterator<StoryEntry> it = storiesContainer.g.iterator();
        int i4 = 0;
        while (true) {
            if (!it.hasNext()) {
                i4 = -1;
                break;
            }
            if (it.next().c == i2) {
                break;
            }
            i4++;
        }
        Integer valueOf = Integer.valueOf(i4);
        if (i4 < 0) {
            valueOf = null;
        }
        if (valueOf != null) {
            return valueOf.intValue();
        }
        return 0;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.vk.story.viewer.impl.presentation.stories.b$k, java.lang.Object] */
    @Override // xsna.elm0
    public final void d(boolean z) {
        this.t.G0(!z);
    }

    @Override // xsna.elm0
    public final void e(SourceTransitionStory sourceTransitionStory) {
        boolean I = I();
        StoriesViewPager storiesViewPager = this.O;
        if (I && storiesViewPager.a()) {
            return;
        }
        qlm0 qlm0Var = this.E;
        qlm0Var.s.d();
        StoryEntry currentStoryEntry = getCurrentStoryEntry();
        if (currentStoryEntry != null && !currentStoryEntry.F) {
            qlm0Var.e.f(currentStoryEntry, getViewEntryPoint());
            F();
        }
        if (storiesViewPager.getCurrentItem() >= this.S.getCount() - 1) {
            if (sourceTransitionStory == SourceTransitionStory.EXPIRED_TIME && currentStoryEntry != null) {
                V(StoryViewAction.CLOSE_AUTO_BY_TIME);
            } else if (sourceTransitionStory == SourceTransitionStory.CLICK && currentStoryEntry != null) {
                V(StoryViewAction.CLOSE_TAP);
            }
            finish();
            return;
        }
        if (sourceTransitionStory == SourceTransitionStory.CLICK && currentStoryEntry != null) {
            V(StoryViewAction.GO_TO_NEXT_STORY_TAP);
        } else if (sourceTransitionStory == SourceTransitionStory.EXPIRED_TIME && currentStoryEntry != null) {
            V(StoryViewAction.GO_TO_NEXT_STORY_AUTO_BY_TIME);
        }
        qo6 E = E(storiesViewPager.getCurrentItem() + 1);
        if (E != null) {
            E.setPreloadSource(PreloadSource.NEXT_AUTHOR);
        }
        storiesViewPager.d.d();
        storiesViewPager.setCurrentItem(storiesViewPager.getCurrentItem() + 1, true);
        if (E instanceof uov) {
            qlm0Var.s.c(E.getStoriesContainer(), E.getCurrentStory(), MobileOfficialAppsCoreEncodingStat$TypeStoryVideoItem.TypeNextStory.NEXT_CONTAINER_STORY);
        }
    }

    @Override // xsna.elm0
    public final boolean f() {
        return this.r0;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [com.vk.story.viewer.impl.presentation.stories.b$k, java.lang.Object] */
    @Override // xsna.elm0
    public final void finish() {
        this.E.e.c();
        this.t.finish();
    }

    @Override // xsna.elm0
    public final boolean g() {
        int i2 = this.P;
        return i2 == 0 || i2 == 2;
    }

    @Override // xsna.elm0
    public int getCurrentIdlePagerPosition() {
        return this.Q;
    }

    public int getCurrentPagerPosition() {
        return this.O.getCurrentItem();
    }

    @Nullable
    public StoryEntry getCurrentStoryEntry() {
        qo6 currentStoryView = getCurrentStoryView();
        if (currentStoryView != null) {
            return currentStoryView.getCurrentStory();
        }
        return null;
    }

    public String getCurrentStoryUniqueId() {
        try {
            StoriesContainer storiesContainer = this.v.get(getCurrentIdlePagerPosition());
            return storiesContainer.j ? String.valueOf(getCurrentStoryView().getCurrentStory().c) : storiesContainer.Ob();
        } catch (Exception unused) {
            return "";
        }
    }

    @Nullable
    public qo6 getCurrentStoryView() {
        StoriesViewPager storiesViewPager = this.O;
        if (storiesViewPager != null) {
            return E(storiesViewPager.getCurrentItem());
        }
        return null;
    }

    @Override // xsna.elm0
    public String getRef() {
        return this.B;
    }

    public qo6 getSelectedStoryView() {
        return this.d0;
    }

    @Nullable
    public List<StoriesContainer> getStoriesContainer() {
        return this.v;
    }

    @Override // xsna.elm0
    public Parcelable getTransferableState() {
        StoryAudioHandler.TransferableState transferableState;
        StoryAudioHandler storyAudioHandler = this.n0;
        synchronized (storyAudioHandler) {
            transferableState = new StoryAudioHandler.TransferableState(storyAudioHandler.g, storyAudioHandler.c.e);
        }
        return new TransferableViewerState(transferableState);
    }

    @NonNull
    public MobileOfficialAppsConStoriesStat$ViewEntryPoint getViewEntryPoint() {
        boolean z = this.w;
        MobileOfficialAppsConStoriesStat$ViewEntryPoint mobileOfficialAppsConStoriesStat$ViewEntryPoint = this.z;
        return (!z || mobileOfficialAppsConStoriesStat$ViewEntryPoint == MobileOfficialAppsConStoriesStat$ViewEntryPoint.DISCOVER_LINK) ? mobileOfficialAppsConStoriesStat$ViewEntryPoint : this.A;
    }

    @Nullable
    public ViewPager getViewPager() {
        return this.O;
    }

    @Override // xsna.elm0
    public final void h() {
        bmm0 bmm0Var = this.H;
        if (bmm0Var.d) {
            return;
        }
        bmm0.d(bmm0Var, 0, 0, 3);
    }

    @Override // xsna.elm0
    public final void i(ArrayList<StoriesContainer> arrayList) {
        List<StoriesContainer> list = this.v;
        if (list != null) {
            list.addAll(arrayList);
            this.S.notifyDataSetChanged();
        }
    }

    @Override // xsna.elm0
    public final void j() {
        StoryEntry currentStoryEntry = getCurrentStoryEntry();
        if (currentStoryEntry == null || currentStoryEntry.F) {
            return;
        }
        F();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.vk.story.viewer.impl.presentation.stories.b$k, java.lang.Object] */
    @Override // xsna.elm0
    public final void k(Intent intent) {
        this.t.k(intent);
    }

    @Override // xsna.elm0
    public final void l() {
        this.n0.a(getContext(), this.o0);
        this.p0 = false;
    }

    @Override // xsna.elm0
    public final void m() {
        this.r0 = true;
    }

    @Override // xsna.elm0
    @Nullable
    public final StoriesContainer n(boolean z) {
        int currentItem;
        if (this.v == null) {
            return null;
        }
        StoriesViewPager storiesViewPager = this.O;
        if (z) {
            currentItem = storiesViewPager.getCurrentItem() + 1;
            if (currentItem >= this.v.size()) {
                return null;
            }
        } else {
            currentItem = storiesViewPager.getCurrentItem() - 1;
            if (currentItem < 0) {
                return null;
            }
        }
        return this.v.get(currentItem);
    }

    @Override // xsna.elm0
    public final void o() {
        boolean I = I();
        StoriesViewPager storiesViewPager = this.O;
        if (I && storiesViewPager.a()) {
            return;
        }
        qlm0 qlm0Var = this.E;
        q7m0 q7m0Var = qlm0Var.s;
        q7m0 q7m0Var2 = qlm0Var.s;
        q7m0Var.d();
        if (storiesViewPager.getCurrentItem() > 0) {
            qo6 E = E(storiesViewPager.getCurrentItem() - 1);
            if (E != null) {
                E.setPreloadSource(PreloadSource.PREVIOUS_AUTHOR);
            }
            storiesViewPager.d.d();
            storiesViewPager.setCurrentItem(storiesViewPager.getCurrentItem() - 1, true);
            if (E != null) {
                q7m0Var2.c(E.getStoriesContainer(), E.getCurrentStory(), MobileOfficialAppsCoreEncodingStat$TypeStoryVideoItem.TypeNextStory.NEXT_CONTAINER_STORY);
                return;
            }
            return;
        }
        if (getCurrentStoryEntry() != null && getCurrentStoryView() != null) {
            q7m0Var2.c(getCurrentStoryView().getStoriesContainer(), getCurrentStoryEntry(), MobileOfficialAppsCoreEncodingStat$TypeStoryVideoItem.TypeNextStory.RESET_STORY);
        }
        for (int i2 = 0; i2 < storiesViewPager.getChildCount(); i2++) {
            if (storiesViewPager.getChildAt(i2) instanceof qo6) {
                ((qo6) storiesViewPager.getChildAt(i2)).R();
            }
        }
    }

    @Override // xsna.elm0
    public final void p(boolean z) {
        this.O.f = z;
        this.R = z;
    }

    @Override // xsna.elm0
    public final void q(StoriesContainer storiesContainer) {
        if (getCurrentStoryView() != null) {
            getCurrentStoryView().pause();
        }
        m mVar = this.S;
        if (mVar.getCount() == 0 || mVar.getCount() == 1) {
            finish();
            return;
        }
        this.v.remove(storiesContainer);
        mVar.b = true;
        mVar.notifyDataSetChanged();
        mVar.b = false;
        C0.post(new tnf(this, 11));
    }

    @Override // xsna.elm0
    public final String r(int i2) {
        return this.F.get(i2);
    }

    @Override // xsna.elm0
    public final void s(int i2, String str) {
        this.F.put(i2, str);
    }

    public void setAvailableSwipeRightClose(boolean z) {
        this.I = z;
    }

    public void setForceLaunchPosition(int i2) {
        this.w0 = Integer.valueOf(i2);
    }

    public void setOpenAnimationCallback(l lVar) {
        this.v0 = lVar;
    }

    public void setWindow(Window window) {
        this.l0 = window;
    }

    public final void y(float f2) {
        int i2 = 0;
        while (true) {
            StoriesViewPager storiesViewPager = this.O;
            if (i2 >= storiesViewPager.getChildCount()) {
                return;
            }
            if (storiesViewPager.getChildAt(i2) instanceof qo6) {
                ((qo6) storiesViewPager.getChildAt(i2)).j0(f2);
            }
            i2++;
        }
    }

    public final void z(@Nullable TransferableViewerState transferableViewerState) {
        this.q0 = transferableViewerState;
    }

    /* compiled from: StoryViewContainer.java */
    public class i implements ViewPager.j {
        public int b;

        public i() {
        }

        public final void a(int i, boolean z) {
            int i2 = this.b;
            b bVar = b.this;
            b.x(bVar, i2, i, z);
            b.u(bVar, i, this.b);
            b.w(bVar, bVar.d0, false);
            this.b = i;
            qo6 currentStoryView = bVar.getCurrentStoryView();
            bVar.d0 = currentStoryView;
            b.w(bVar, currentStoryView, true);
            bVar.H.e(bVar.S.getCount(), i, bVar.d0);
        }

        /* JADX WARN: Type inference failed for: r1v0, types: [com.vk.story.viewer.impl.presentation.stories.b$k, java.lang.Object] */
        @Override // androidx.viewpager.widget.ViewPager.j
        public final void onPageScrollStateChanged(int i) {
            qo6 qo6Var;
            qo6 currentStoryView;
            b bVar = b.this;
            ?? r1 = bVar.t;
            StoriesViewPager storiesViewPager = bVar.O;
            bVar.P = i;
            b.t(bVar);
            if (i == 1) {
                storiesViewPager.setScrollDurationFactor(1.0d);
            } else if (i == 0) {
                storiesViewPager.setScrollDurationFactor(1.5d);
            }
            if (i == 0) {
                int currentItem = storiesViewPager.getCurrentItem();
                r1.j(bVar.getCurrentStoryUniqueId());
                b.v(bVar, currentItem, bVar.Q);
                bVar.Q = storiesViewPager.getCurrentItem();
            }
            if (i != 0 || r1.g1()) {
                bVar.P();
            } else {
                bVar.R();
                bVar.Q();
            }
            if (i == 0 && (currentStoryView = bVar.getCurrentStoryView()) != null) {
                currentStoryView.y0();
            }
            if (i == 0) {
                qo6 currentStoryView2 = bVar.getCurrentStoryView();
                for (int i2 = 0; i2 < storiesViewPager.getChildCount(); i2++) {
                    if ((storiesViewPager.getChildAt(i2) instanceof qo6) && (qo6Var = (qo6) storiesViewPager.getChildAt(i2)) != currentStoryView2 && (qo6Var instanceof ep50)) {
                        ((ep50) qo6Var).v1(false);
                    }
                }
            }
        }

        @Override // androidx.viewpager.widget.ViewPager.j
        public final void onPageSelected(final int i) {
            if (b.this.O.getChildCount() == 0) {
                b.C0.post(new Runnable() { // from class: xsna.mlm0
                    @Override // java.lang.Runnable
                    public final void run() {
                        b.i.this.a(i, true);
                    }
                });
            } else {
                a(i, false);
            }
        }

        @Override // androidx.viewpager.widget.ViewPager.j
        public final void onPageScrolled(int i, float f, int i2) {
        }
    }

    /* compiled from: StoryViewContainer.java */
    public class j implements ViewPager.j {
        public int b;

        public j() {
        }

        public final void a(int i, boolean z) {
            int i2 = this.b;
            b bVar = b.this;
            b.x(bVar, i2, i, z);
            b.u(bVar, i, this.b);
            b.w(bVar, bVar.d0, false);
            this.b = i;
            qo6 currentStoryView = bVar.getCurrentStoryView();
            bVar.d0 = currentStoryView;
            b.w(bVar, currentStoryView, true);
            bVar.H.e(bVar.S.getCount(), i, bVar.d0);
        }

        /* JADX WARN: Type inference failed for: r1v0, types: [com.vk.story.viewer.impl.presentation.stories.b$k, java.lang.Object] */
        @Override // androidx.viewpager.widget.ViewPager.j
        public final void onPageScrollStateChanged(int i) {
            qo6 currentStoryView;
            b bVar = b.this;
            ?? r1 = bVar.t;
            StoriesViewPager storiesViewPager = bVar.O;
            bVar.P = i;
            b.t(bVar);
            if (i == 1) {
                storiesViewPager.setScrollDurationFactor(1.0d);
            } else if (i == 0) {
                storiesViewPager.setScrollDurationFactor(1.5d);
            }
            if (i == 0) {
                int currentItem = storiesViewPager.getCurrentItem();
                r1.j(bVar.getCurrentStoryUniqueId());
                b.v(bVar, currentItem, bVar.Q);
                bVar.Q = storiesViewPager.getCurrentItem();
            }
            if (i != 0 || r1.g1()) {
                bVar.P();
            } else {
                bVar.R();
                bVar.Q();
            }
            if (i != 0 || (currentStoryView = bVar.getCurrentStoryView()) == null) {
                return;
            }
            currentStoryView.y0();
        }

        @Override // androidx.viewpager.widget.ViewPager.j
        public final void onPageSelected(final int i) {
            if (b.this.O.getChildCount() == 0) {
                b.C0.post(new Runnable() { // from class: xsna.nlm0
                    @Override // java.lang.Runnable
                    public final void run() {
                        b.j.this.a(i, true);
                    }
                });
            } else {
                a(i, false);
            }
        }

        @Override // androidx.viewpager.widget.ViewPager.j
        public final void onPageScrolled(int i, float f, int i2) {
        }
    }
}
