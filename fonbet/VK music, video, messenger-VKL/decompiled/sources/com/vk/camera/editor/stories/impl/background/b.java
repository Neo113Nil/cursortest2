package com.vk.camera.editor.stories.impl.background;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.vk.camera.editor.stories.impl.background.BackgroundEditorState;
import com.vk.core.view.components.paging.list.VkRecyclerPaginatedView;
import com.vk.core.view.components.tabs.VkTabs;
import com.vk.core.view.components.tabs.d;
import com.vk.dto.stories.entities.stat.BackgroundInfo;
import com.vk.dto.stories.entities.stat.StoryBackgroundType;
import com.vk.dto.stories.model.StoryBackground;
import com.vk.lists.ListDataSet;
import com.vk.lists.c;
import com.vk.lists.f;
import com.vk.media.MediaUtils;
import com.vk.stories.design.view.editor.PipetteColorPicker;
import com.vkontakte.android.R;
import io.reactivex.rxjava3.core.q;
import io.reactivex.rxjava3.internal.operators.observable.g0;
import io.reactivex.rxjava3.internal.operators.single.v;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptyList;
import kotlin.collections.builders.ListBuilder;
import kotlin.random.Random;
import ru.ok.android.webrtc.stat.call.methods.call_stat.OutgoingAudioStatistics;
import xsna.an10;
import xsna.asu0;
import xsna.avj0;
import xsna.azt;
import xsna.bi80;
import xsna.bwg;
import xsna.bwt0;
import xsna.c5g;
import xsna.ca10;
import xsna.dhk0;
import xsna.e43;
import xsna.e4t;
import xsna.epx;
import xsna.eyl0;
import xsna.fw5;
import xsna.g5g;
import xsna.gql0;
import xsna.gyl0;
import xsna.h3e0;
import xsna.hg1;
import xsna.hyl0;
import xsna.iah0;
import xsna.iyl0;
import xsna.j5g;
import xsna.j7l0;
import xsna.kd7;
import xsna.kwg0;
import xsna.kyl0;
import xsna.l8w;
import xsna.lv2;
import xsna.lyl0;
import xsna.mat0;
import xsna.mcr0;
import xsna.ml1;
import xsna.msy;
import xsna.myl0;
import xsna.ni0;
import xsna.nq;
import xsna.nyl0;
import xsna.pqz;
import xsna.qyl0;
import xsna.ryl0;
import xsna.s3q0;
import xsna.s5l0;
import xsna.syl0;
import xsna.t2l0;
import xsna.tam0;
import xsna.u76;
import xsna.wx00;
import xsna.x4a;
import xsna.xpa0;
import xsna.y4;
import xsna.z6f0;
import xsna.zif0;

/* compiled from: StoryBackgroundEditorPresenter.kt */
/* loaded from: classes16.dex */
public final class b implements gyl0, c.l<Map<StoryBackgroundType, ? extends List<? extends StoryBackground>>> {
    public final myl0 b;
    public u76 c;
    public xpa0 d;
    public final Object e = msy.a(LazyThreadSafetyMode.NONE, new bi80(this, 23));
    public final ListDataSet<zif0> f;
    public final LinkedHashMap g;
    public BackgroundEditorState h;
    public tam0 i;
    public final LinkedHashMap j;
    public final LinkedHashMap k;
    public io.reactivex.rxjava3.disposables.c l;
    public io.reactivex.rxjava3.disposables.c m;
    public io.reactivex.rxjava3.disposables.c n;
    public final io.reactivex.rxjava3.disposables.c o;
    public boolean p;
    public fw5 q;
    public io.reactivex.rxjava3.disposables.c r;

    /* compiled from: StoryBackgroundEditorPresenter.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[StoryBackgroundType.values().length];
            try {
                iArr[StoryBackgroundType.ANIMATED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[StoryBackgroundType.BLUR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[StoryBackgroundType.COLOR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[StoryBackgroundType.GRAPHICS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public b(myl0 myl0Var) {
        this.b = myl0Var;
        ListDataSet<zif0> listDataSet = new ListDataSet<>();
        this.f = listDataSet;
        this.g = new LinkedHashMap();
        this.h = new BackgroundEditorState(OutgoingAudioStatistics.AUDIO_LEVEL_MULTIPLIER_FOR_BACKEND, null);
        this.j = new LinkedHashMap();
        this.k = new LinkedHashMap();
        c.h hVar = new c.h(this);
        hVar.p = 100L;
        eyl0 eyl0Var = new eyl0(listDataSet, new lyl0(myl0Var, 0));
        VkRecyclerPaginatedView vkRecyclerPaginatedView = myl0Var.h;
        vkRecyclerPaginatedView.setAdapter(eyl0Var);
        f.a(hVar, vkRecyclerPaginatedView);
        com.vk.core.utils.newtork.b.a.getClass();
        this.o = hg1.h(com.vk.core.utils.newtork.b.f().a0(io.reactivex.rxjava3.android.schedulers.a.b()), new z6f0(this, 13));
    }

    public static /* synthetic */ void Z(b bVar, Bitmap bitmap, boolean z, int i) {
        if ((i & 4) != 0) {
            z = true;
        }
        bVar.z(bitmap, z, false);
    }

    @Override // xsna.gyl0
    public final void A4(u76 u76Var) {
        this.c = u76Var;
    }

    @Override // xsna.gyl0
    public final void B5() {
        this.h = BackgroundEditorState.a(this.h.c(), null, null, null, null, null, null, false, false, null, null, null, null, null, null, 32639);
        g();
    }

    @Override // xsna.gyl0
    public final void G0(mat0 mat0Var) {
        this.h = BackgroundEditorState.a(this.h, null, null, null, null, null, null, false, false, null, null, null, mat0Var, null, null, 28671);
    }

    @Override // xsna.gyl0
    public final void I() {
        boolean z;
        BackgroundEditorState a2 = BackgroundEditorState.a(this.h, null, null, null, null, null, null, false, false, null, null, null, null, null, null, 32759);
        this.h = a2;
        if (!a2.h && a2.f != null) {
            List<syl0> list = a2.b;
            if (!(list instanceof Collection) || !list.isEmpty()) {
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    if (((syl0) it.next()).a == StoryBackgroundType.BLUR) {
                        z = true;
                        break;
                    }
                }
            }
        }
        z = false;
        BackgroundEditorState backgroundEditorState = this.h;
        qyl0 qyl0Var = backgroundEditorState.k;
        if (qyl0Var == null && backgroundEditorState.l == null && backgroundEditorState.m == null && backgroundEditorState.i == null && backgroundEditorState.j == null && z) {
            V1(StoryBackgroundType.BLUR);
        } else if (qyl0Var == null && backgroundEditorState.l == null && backgroundEditorState.m == null) {
            this.h = BackgroundEditorState.a(this.h, null, null, null, null, null, null, false, false, null, backgroundEditorState.b(), null, null, null, null, 31743);
        }
        u76 u76Var = this.c;
        if ((u76Var != null ? u76Var.z() : null) != null) {
            e0();
            return;
        }
        if (this.h.b() != null) {
            Y1(this.h.b(), (r5 & 4) == 0, (r5 & 8) != 0);
        } else if (this.h.a.isEmpty() || this.h.b() != null) {
            this.p = true;
        } else {
            d0();
        }
    }

    @Override // xsna.gyl0
    public final s5l0 J() {
        s5l0 J;
        xpa0 xpa0Var = this.d;
        if (xpa0Var == null || (J = xpa0Var.J()) == null) {
            return null;
        }
        xpa0 xpa0Var2 = this.d;
        Integer valueOf = xpa0Var2 != null ? Integer.valueOf(xpa0Var2.K()) : null;
        xpa0 xpa0Var3 = this.d;
        J.a(valueOf, xpa0Var3 != null ? Integer.valueOf(xpa0Var3.O()) : null);
        return J;
    }

    @Override // xsna.gyl0
    public final void K3(Bitmap bitmap, boolean z) {
        BackgroundEditorState backgroundEditorState = this.h;
        backgroundEditorState.getClass();
        qyl0 qyl0Var = new qyl0(new StoryBackground(StoryBackgroundType.BLUR, null, null, null, null, null, false, null, null, 510, null), false);
        List list = backgroundEditorState.b;
        List list2 = list;
        if (!(list2 instanceof Collection) || !list2.isEmpty()) {
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                if (((syl0) it.next()).a == StoryBackgroundType.BLUR) {
                    break;
                }
            }
        }
        list = j5g.u0(list2, Collections.singletonList(new syl0(StoryBackgroundType.BLUR)));
        qyl0 qyl0Var2 = z ? qyl0Var : null;
        if (qyl0Var2 == null) {
            qyl0Var2 = backgroundEditorState.k;
        }
        BackgroundEditorState a2 = BackgroundEditorState.a(backgroundEditorState, null, list, null, null, null, bitmap, false, false, null, qyl0Var2, null, null, null, null, 31709);
        backgroundEditorState.a.put(StoryBackgroundType.BLUR, Collections.singletonList(qyl0Var));
        this.h = a2;
    }

    @Override // xsna.gyl0
    public final void L5(Bitmap bitmap) {
        this.h = BackgroundEditorState.a(this.h, null, null, null, null, null, null, false, false, null, null, bitmap, null, null, null, 30719);
    }

    @Override // xsna.gyl0
    public final void M1(StoryBackgroundType storyBackgroundType, List<StoryBackground> list) {
        List<StoryBackground> list2 = list;
        ArrayList arrayList = new ArrayList(c5g.u(list2, 10));
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(new qyl0((StoryBackground) it.next(), true));
        }
        this.k.put(storyBackgroundType, arrayList);
    }

    @Override // xsna.gyl0
    public final void S4(tam0 tam0Var) {
        this.i = tam0Var;
        LinkedHashMap linkedHashMap = this.g;
        BackgroundEditorState backgroundEditorState = (BackgroundEditorState) linkedHashMap.get(tam0Var);
        if (backgroundEditorState != null) {
            this.h = backgroundEditorState;
            return;
        }
        BackgroundEditorState backgroundEditorState2 = new BackgroundEditorState(32766, this.j);
        this.h = backgroundEditorState2;
        linkedHashMap.put(tam0Var, backgroundEditorState2);
    }

    @Override // xsna.gyl0
    public final void T3(boolean z) {
        ArrayList arrayList;
        BackgroundEditorState backgroundEditorState = this.h;
        Map<StoryBackgroundType, List<qyl0>> map = backgroundEditorState.a;
        List<qyl0> list = map.get(StoryBackgroundType.GRAPHICS);
        if (list != null) {
            List<qyl0> list2 = list;
            arrayList = new ArrayList(c5g.u(list2, 10));
            for (qyl0 qyl0Var : list2) {
                if (qyl0Var.a.b == StoryBackgroundType.ANIMATED) {
                    qyl0Var = qyl0.c(qyl0Var, null, z, 1);
                }
                arrayList.add(qyl0Var);
            }
        } else {
            arrayList = null;
        }
        List<qyl0> list3 = arrayList;
        if (arrayList == null) {
            list3 = EmptyList.b;
        }
        BackgroundEditorState a2 = BackgroundEditorState.a(backgroundEditorState, null, null, null, null, null, null, z, false, null, null, null, null, null, null, 32703);
        map.put(StoryBackgroundType.GRAPHICS, list3);
        this.h = a2;
        f0(null);
    }

    @Override // xsna.gyl0
    public final void T6(Bitmap bitmap) {
        u76 u76Var;
        BackgroundEditorState a2 = BackgroundEditorState.a(this.h, null, null, null, null, null, null, false, false, bitmap, null, null, null, null, null, 32511);
        this.h = a2;
        if (a2.f != null || bitmap == null || (u76Var = this.c) == null) {
            return;
        }
        u76Var.a6(bitmap);
    }

    @Override // xsna.gyl0
    public final Bitmap U6() {
        return this.h.f;
    }

    @Override // xsna.gyl0
    public final void V1(StoryBackgroundType storyBackgroundType) {
        List<qyl0> list;
        qyl0 qyl0Var;
        this.h = this.h.d(storyBackgroundType);
        f0(storyBackgroundType);
        StoryBackgroundType storyBackgroundType2 = StoryBackgroundType.BLUR;
        if (storyBackgroundType != storyBackgroundType2 || (list = this.h.a.get(storyBackgroundType2)) == null || (qyl0Var = (qyl0) j5g.a0(list)) == null) {
            return;
        }
        Y1(qyl0Var, (r5 & 4) == 0, (r5 & 8) != 0);
    }

    @Override // xsna.gyl0
    public final void Y1(qyl0 qyl0Var, boolean z, boolean z2) {
        StoryBackground storyBackground = qyl0Var.a;
        if (z || !epx.f(this.h.b(), qyl0Var)) {
            this.h = this.h.e(qyl0Var).d(storyBackground.b);
            f0(null);
            x(storyBackground, z2);
        }
    }

    @Override // xsna.gyl0
    public final void Z5(fw5 fw5Var) {
        if (b(fw5Var)) {
            return;
        }
        this.q = fw5Var;
    }

    @Override // xsna.gyl0
    public final boolean a0() {
        cancel();
        return true;
    }

    @Override // xsna.gyl0
    public final void apply() {
        BackgroundEditorState backgroundEditorState = this.h;
        Bitmap bitmap = backgroundEditorState.d;
        if (backgroundEditorState.c == StoryBackgroundType.ANIMATED) {
            bitmap = null;
        }
        u76 u76Var = this.c;
        if (u76Var != null) {
            u76Var.i7(bitmap, (backgroundEditorState.i == null && backgroundEditorState.j == null) ? false : true, new avj0(this, 6));
        }
        g();
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0037, code lost:
    
        if (r3 == null) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean b(fw5 fw5Var) {
        qyl0 qyl0Var;
        Object obj;
        Map<StoryBackgroundType, List<qyl0>> map = this.h.a;
        StoryBackgroundType storyBackgroundType = (StoryBackgroundType) fw5Var.b;
        int i = fw5Var.a;
        List<qyl0> list = map.get(storyBackgroundType);
        Object obj2 = null;
        if (list != null) {
            Iterator<T> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                Integer num = ((qyl0) obj).a.c;
                if (num != null && i == num.intValue()) {
                    break;
                }
            }
            qyl0Var = (qyl0) obj;
        }
        Map<StoryBackgroundType, List<qyl0>> map2 = this.h.a;
        ArrayList arrayList = new ArrayList();
        Iterator<Map.Entry<StoryBackgroundType, List<qyl0>>> it2 = map2.entrySet().iterator();
        while (it2.hasNext()) {
            g5g.y(it2.next().getValue(), arrayList);
        }
        Iterator it3 = arrayList.iterator();
        while (true) {
            if (!it3.hasNext()) {
                break;
            }
            Object next = it3.next();
            Integer num2 = ((qyl0) next).a.c;
            if (num2 != null && i == num2.intValue()) {
                obj2 = next;
                break;
            }
        }
        qyl0Var = (qyl0) obj2;
        if (qyl0Var == null) {
            return false;
        }
        V1((StoryBackgroundType) fw5Var.b);
        Y1(qyl0Var, (r5 & 4) == 0, (r5 & 8) != 0);
        return true;
    }

    @Override // xsna.gyl0
    public final void c1(t2l0 t2l0Var) {
        BackgroundEditorState.StoryBackgroundState storyBackgroundState = BackgroundEditorState.StoryBackgroundState.DEFAULT;
        if (t2l0Var == null) {
            t2l0Var = this.h.o;
        }
        g0(storyBackgroundState, t2l0Var);
    }

    @Override // xsna.gyl0
    public final void c6() {
        Object obj;
        List<qyl0> list = this.h.a.get(StoryBackgroundType.COLOR);
        if (list == null) {
            list = EmptyList.b;
        }
        t2l0 t2l0Var = this.h.o;
        if (t2l0Var != null) {
            int i = t2l0Var.b;
            List<qyl0> list2 = list;
            Iterator<T> it = list2.iterator();
            while (true) {
                if (it.hasNext()) {
                    obj = it.next();
                    if (((qyl0) obj).a.h) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            qyl0 qyl0Var = (qyl0) obj;
            if (qyl0Var == null) {
                return;
            }
            qyl0 c = qyl0.c(qyl0Var, StoryBackground.zb(qyl0Var.a, String.format("#%06X", Arrays.copyOf(new Object[]{Integer.valueOf(i & 16777215)}, 1)), null, 495), false, 2);
            Map<StoryBackgroundType, List<qyl0>> map = this.h.a;
            StoryBackgroundType storyBackgroundType = StoryBackgroundType.COLOR;
            ListBuilder e = e43.e();
            e.add(c);
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : list2) {
                if (!((qyl0) obj2).a.h) {
                    arrayList.add(obj2);
                }
            }
            e.addAll(arrayList);
            map.put(storyBackgroundType, e.g());
            Y1(c, (r5 & 4) == 0, (r5 & 8) != 0);
        }
    }

    @Override // xsna.gyl0
    public final void cancel() {
        qyl0 b = this.h.b();
        BackgroundEditorState backgroundEditorState = this.h;
        BackgroundEditorState.StoryBackgroundState storyBackgroundState = backgroundEditorState.n;
        Bitmap bitmap = backgroundEditorState.f;
        if (storyBackgroundState == BackgroundEditorState.StoryBackgroundState.PIPETTE_PICKER) {
            c1(backgroundEditorState.o);
        } else {
            qyl0 qyl0Var = backgroundEditorState.k;
            if (qyl0Var != null) {
                Y1(qyl0Var, (r5 & 4) == 0, (r5 & 8) != 0);
            } else {
                mat0 mat0Var = backgroundEditorState.m;
                if (mat0Var != null) {
                    u76 u76Var = this.c;
                    if (u76Var != null) {
                        u76Var.h1(Collections.singletonList(mat0Var));
                    }
                } else {
                    Bitmap bitmap2 = backgroundEditorState.l;
                    if (bitmap2 != null) {
                        Z(this, bitmap2, false, 8);
                    } else {
                        Bitmap bitmap3 = backgroundEditorState.i;
                        if (bitmap3 != null && bitmap == null) {
                            z(bitmap3, false, true);
                        } else if (bitmap != null) {
                            z(bitmap, false, true);
                        } else {
                            List<mat0> list = backgroundEditorState.j;
                            if (list != null) {
                                List<mat0> list2 = list;
                                if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                                    Iterator<T> it = list2.iterator();
                                    while (true) {
                                        if (!it.hasNext()) {
                                            break;
                                        }
                                        if (((mat0) it.next()).g) {
                                            u76 u76Var2 = this.c;
                                            if (u76Var2 != null) {
                                                u76Var2.h1(this.h.j);
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
        if (b != null) {
            this.h = this.h.e(b).d(b.a.b);
        }
        u76 u76Var3 = this.c;
        if (u76Var3 != null) {
            u76Var3.r1(!this.h.h);
        }
        g();
    }

    public final void d0() {
        StoryBackgroundType storyBackgroundType;
        List<syl0> list = this.h.b;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((syl0) obj).a != StoryBackgroundType.BLUR) {
                arrayList.add(obj);
            }
        }
        syl0 syl0Var = (syl0) j5g.x0(arrayList, Random.b);
        if (syl0Var == null || (storyBackgroundType = syl0Var.a) == null) {
            return;
        }
        List<qyl0> list2 = this.h.a.get(storyBackgroundType);
        if (list2 != null) {
            ArrayList arrayList2 = new ArrayList();
            for (Object obj2 : list2) {
                if (((qyl0) obj2).b) {
                    arrayList2.add(obj2);
                }
            }
            ArrayList arrayList3 = new ArrayList();
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                Object next = it.next();
                if (!((qyl0) next).a.h) {
                    arrayList3.add(next);
                }
            }
            qyl0 qyl0Var = (qyl0) j5g.x0(arrayList3, Random.b);
            if (qyl0Var != null) {
                Y1(qyl0Var, (r5 & 4) == 0, (r5 & 8) != 0);
                g();
                return;
            }
        }
        this.p = true;
    }

    public final void e0() {
        StoryBackgroundType z;
        List<qyl0> list;
        u76 u76Var = this.c;
        if (u76Var == null || (z = u76Var.z()) == null) {
            return;
        }
        if (this.h.a.containsKey(z)) {
            list = this.h.a.get(z);
        } else {
            List<qyl0> list2 = this.h.a.get(StoryBackgroundType.GRAPHICS);
            if (list2 != null) {
                ArrayList arrayList = new ArrayList();
                for (Object obj : list2) {
                    if (((qyl0) obj).a.b == z) {
                        arrayList.add(obj);
                    }
                }
                list = arrayList;
            } else {
                list = null;
            }
        }
        if (list != null) {
            ArrayList arrayList2 = new ArrayList();
            for (Object obj2 : list) {
                if (((qyl0) obj2).b) {
                    arrayList2.add(obj2);
                }
            }
            ArrayList arrayList3 = new ArrayList();
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                Object next = it.next();
                if (!((qyl0) next).a.h) {
                    arrayList3.add(next);
                }
            }
            qyl0 qyl0Var = (qyl0) j5g.x0(arrayList3, Random.b);
            if (qyl0Var != null) {
                Y1(qyl0Var, (r5 & 4) == 0, (r5 & 8) != 0);
                g();
            }
        }
    }

    @Override // xsna.gyl0
    public final void e2(x4a x4aVar, ni0 ni0Var) {
        xpa0 xpa0Var = this.d;
        final s5l0 J = J();
        xpa0 xpa0Var2 = this.d;
        io.reactivex.rxjava3.disposables.c cVar = null;
        final Bitmap M = xpa0Var2 != null ? xpa0Var2.M() : null;
        if (xpa0Var != null && J != null && M != null) {
            xpa0Var.R();
            v vVar = new v(new Callable() { // from class: xsna.jyl0
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    Bitmap bitmap = M;
                    return s5l0.this.b(bitmap.getWidth(), bitmap.getHeight(), bitmap);
                }
            });
            asu0 asu0Var = asu0.a;
            cVar = io.reactivex.rxjava3.subjects.c.b(asu0Var, vVar).m(asu0Var.d()).subscribe(new wx00(new ml1(28, x4aVar, xpa0Var), 20), kwg0.b());
            this.r = cVar;
        }
        if (cVar == null) {
            ni0Var.invoke();
            s3q0 s3q0Var = s3q0.a;
        }
    }

    public final void f0(StoryBackgroundType storyBackgroundType) {
        ArrayList arrayList;
        StoryBackground storyBackground;
        BackgroundEditorState backgroundEditorState = this.h;
        Map<StoryBackgroundType, List<qyl0>> map = backgroundEditorState.a;
        StoryBackgroundType storyBackgroundType2 = backgroundEditorState.c;
        if (storyBackgroundType2 == StoryBackgroundType.ANIMATED || storyBackgroundType2 == StoryBackgroundType.MARUSIA) {
            storyBackgroundType2 = StoryBackgroundType.GRAPHICS;
        }
        List<qyl0> list = map.get(storyBackgroundType2);
        if (list != null) {
            arrayList = new ArrayList();
            for (Object obj : list) {
                if (((qyl0) obj).b) {
                    arrayList.add(obj);
                }
            }
        } else {
            arrayList = null;
        }
        int size = (arrayList == null ? EmptyList.b : arrayList).size();
        myl0 myl0Var = this.b;
        ryl0 ryl0Var = myl0Var.m;
        int i = ryl0Var.f;
        int i2 = ryl0Var.b;
        int i3 = ryl0Var.a;
        int i4 = size - 1;
        int a2 = ryl0Var.a(an10.b(((i - (i3 * 2)) - (i2 * size)) / i4), size);
        VkRecyclerPaginatedView vkRecyclerPaginatedView = myl0Var.h;
        dhk0 dhk0Var = new dhk0(0, 0, a2, 0);
        dhk0Var.i = false;
        vkRecyclerPaginatedView.setItemDecoration(dhk0Var);
        ViewGroup.LayoutParams layoutParams = vkRecyclerPaginatedView.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        }
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
        int i5 = (i3 * 2) + (i4 * a2) + (i2 * size);
        Integer valueOf = Integer.valueOf(i5);
        if (i5 >= iah0.f().widthPixels) {
            valueOf = null;
        }
        layoutParams2.width = valueOf != null ? valueOf.intValue() : -1;
        vkRecyclerPaginatedView.setLayoutParams(layoutParams2);
        this.f.setItems(arrayList);
        if (storyBackgroundType == null) {
            qyl0 b = this.h.b();
            storyBackgroundType = (b == null || (storyBackground = b.a) == null) ? null : storyBackground.b;
        }
        List<syl0> list2 = this.h.b;
        VkTabs vkTabs = myl0Var.i;
        if (!epx.f(myl0Var.n, list2)) {
            myl0Var.n = list2;
            int i6 = VkTabs.t;
            vkTabs.h(true);
            Iterator<T> it = list2.iterator();
            while (it.hasNext()) {
                int i7 = myl0.a.$EnumSwitchMapping$1[((syl0) it.next()).a.ordinal()];
                if (i7 == 1) {
                    VkTabs.c g = vkTabs.g();
                    d dVar = g.a;
                    d.V4(dVar, Integer.valueOf(R.drawable.bg_editor_blur), 4);
                    dVar.setText(myl0Var.getContext().getString(R.string.story_background_editor_blur));
                    dVar.setTextTint(R.attr.vk_ui_text_primary);
                    dVar.setTag(StoryBackgroundType.BLUR);
                    vkTabs.b(g, true);
                } else if (i7 == 2) {
                    VkTabs.c g2 = vkTabs.g();
                    d dVar2 = g2.a;
                    d.V4(dVar2, Integer.valueOf(R.drawable.bg_editor_color), 4);
                    dVar2.setText(myl0Var.getContext().getString(R.string.story_background_editor_color));
                    dVar2.setTextTint(R.attr.vk_ui_text_primary);
                    dVar2.setTag(StoryBackgroundType.COLOR);
                    vkTabs.b(g2, true);
                } else if (i7 == 3) {
                    VkTabs.c g3 = vkTabs.g();
                    d dVar3 = g3.a;
                    d.V4(dVar3, Integer.valueOf(R.drawable.bg_editor_graphics), 4);
                    dVar3.setText(myl0Var.getContext().getString(R.string.story_background_editor_graphics));
                    dVar3.setTextTint(R.attr.vk_ui_text_primary);
                    dVar3.setTag(StoryBackgroundType.GRAPHICS);
                    vkTabs.b(g3, true);
                }
            }
            vkTabs.e.clear();
            vkTabs.a(new nyl0(myl0Var, list2));
        }
        if (storyBackgroundType == null) {
            return;
        }
        for (VkTabs.c cVar : vkTabs.getTabs()) {
            if (cVar.a.getTag() == storyBackgroundType) {
                VkTabs.k(vkTabs, cVar);
            }
        }
    }

    public final void g() {
        tam0 tam0Var = this.i;
        if (tam0Var != null) {
            this.g.put(tam0Var, this.h);
        }
    }

    public final void g0(BackgroundEditorState.StoryBackgroundState storyBackgroundState, t2l0 t2l0Var) {
        xpa0 m1;
        BackgroundEditorState backgroundEditorState = this.h;
        backgroundEditorState.getClass();
        this.h = BackgroundEditorState.a(backgroundEditorState, null, null, null, null, null, null, false, false, null, null, null, null, storyBackgroundState, t2l0Var, 8191);
        myl0 myl0Var = this.b;
        View view = myl0Var.g;
        View view2 = myl0Var.f;
        int i = myl0.a.$EnumSwitchMapping$0[storyBackgroundState.ordinal()];
        r5 = null;
        s3q0 s3q0Var = null;
        if (i == 1) {
            bwt0.p0(view2, true);
            bwt0.p0(view, true);
            ImageView imageView = myl0Var.e;
            if (imageView == null) {
                imageView = null;
            }
            bwt0.p0(imageView, false);
            PipetteColorPicker pipetteColorPicker = myl0Var.d;
            if (pipetteColorPicker == null) {
                pipetteColorPicker = null;
            }
            bwt0.p0(pipetteColorPicker, false);
            PipetteColorPicker pipetteColorPicker2 = myl0Var.d;
            (pipetteColorPicker2 != null ? pipetteColorPicker2 : null).e();
            return;
        }
        if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        bwt0.p0(view2, false);
        bwt0.p0(view, false);
        gyl0 presenter = myl0Var.getPresenter();
        if (presenter == null || (m1 = presenter.m1()) == null) {
            myl0Var.c(t2l0Var);
            return;
        }
        if (!m1.P()) {
            gyl0 presenter2 = myl0Var.getPresenter();
            if (presenter2 != null) {
                presenter2.e2(new x4a(9, myl0Var, t2l0Var), new ni0(21, myl0Var, t2l0Var));
                return;
            }
            return;
        }
        gyl0 presenter3 = myl0Var.getPresenter();
        xpa0 m12 = presenter3 != null ? presenter3.m1() : null;
        gyl0 presenter4 = myl0Var.getPresenter();
        s5l0 J = presenter4 != null ? presenter4.J() : null;
        if (m12 != null && J != null) {
            int V = m12.V();
            m12.S(V);
            J.c(V, true, new y4(24, myl0Var, t2l0Var), new bwg(myl0Var, t2l0Var, m12, 7));
            s3q0Var = s3q0.a;
        }
        if (s3q0Var == null) {
            myl0Var.c(t2l0Var);
        }
    }

    @Override // com.vk.lists.c.k
    public final q<Map<StoryBackgroundType, List<StoryBackground>>> hj(c cVar, boolean z) {
        return ui(0, cVar);
    }

    @Override // xsna.gyl0
    public final xpa0 m1() {
        return this.d;
    }

    @Override // xsna.gyl0
    public final void m2() {
        g0(BackgroundEditorState.StoryBackgroundState.PIPETTE_PICKER, this.h.o);
    }

    @Override // xsna.gyl0
    public final void o1() {
        qyl0 b = this.h.b();
        if (b == null) {
            b = this.h.k;
        }
        if (b != null) {
            Y1(b, (r5 & 4) == 0, (r5 & 8) != 0);
        }
    }

    @Override // xsna.cc6
    public final void onDestroy() {
        io.reactivex.rxjava3.disposables.c cVar = this.l;
        if (cVar != null) {
            cVar.dispose();
        }
        io.reactivex.rxjava3.disposables.c cVar2 = this.m;
        if (cVar2 != null) {
            cVar2.dispose();
        }
        io.reactivex.rxjava3.disposables.c cVar3 = this.n;
        if (cVar3 != null) {
            cVar3.dispose();
        }
        io.reactivex.rxjava3.disposables.c cVar4 = this.o;
        if (cVar4 != null) {
            cVar4.dispose();
        }
        io.reactivex.rxjava3.disposables.c cVar5 = this.r;
        if (cVar5 != null) {
            cVar5.dispose();
        }
        this.r = null;
        this.h = this.h.c();
        this.c = null;
    }

    @Override // xsna.cc6
    public final void onPause() {
        throw null;
    }

    @Override // xsna.cc6
    public final void onResume() {
        throw null;
    }

    @Override // xsna.gyl0
    public final void r2(List<mat0> list) {
        u76 u76Var;
        mat0 mat0Var = (mat0) j5g.a0(list);
        Bitmap bitmap = mat0Var != null ? mat0Var.h : null;
        if (this.h.f != null || bitmap == null || (u76Var = this.c) == null) {
            return;
        }
        u76Var.a6(bitmap);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.vk.lists.c.l
    public final q<Map<StoryBackgroundType, ? extends List<? extends StoryBackground>>> ui(int i, c cVar) {
        return ((gql0) this.e.getValue()).b.c().a0(io.reactivex.rxjava3.android.schedulers.a.b());
    }

    @Override // com.vk.lists.c.k
    public final void wd(q<Map<StoryBackgroundType, List<StoryBackground>>> qVar, boolean z, c cVar) {
        this.l = qVar.subscribe(new j7l0(new hyl0(this, z, cVar), 2), new l8w(new h3e0(7), 28));
    }

    public final void x(StoryBackground storyBackground, boolean z) {
        u76 u76Var;
        tam0 tam0Var;
        q qVar;
        StoryBackgroundType storyBackgroundType = storyBackground.b;
        File file = storyBackground.j;
        String str = storyBackground.d;
        int i = a.$EnumSwitchMapping$0[storyBackgroundType.ordinal()];
        if (i == 1) {
            List<mat0> list = (file == null || (tam0Var = (tam0) j5g.a0(tam0.a.a(file, true, null, false, false, 28))) == null) ? null : tam0Var.b;
            if (list != null) {
                Z(this, file != null ? MediaUtils.a.k(0L, file.getAbsolutePath()) : null, false, 12);
                if (!this.h.g || (u76Var = this.c) == null) {
                    return;
                }
                u76Var.h1(list);
                return;
            }
            return;
        }
        if (i == 2) {
            Z(this, this.h.f, false, 12);
            return;
        }
        io.reactivex.rxjava3.disposables.c cVar = this.m;
        if (cVar != null) {
            cVar.dispose();
        }
        if (str == null || str.length() == 0) {
            String str2 = storyBackground.f;
            Integer valueOf = str2 != null ? Integer.valueOf(Color.parseColor(str2)) : null;
            Bitmap d = kd7.d(iah0.f().widthPixels, iah0.f().heightPixels);
            if (valueOf == null || d == null) {
                qVar = g0.b;
            } else {
                new Canvas(d).drawColor(valueOf.intValue());
                qVar = q.T(d);
            }
        } else {
            qVar = mcr0.h(Uri.parse(str)).U(new nq(new pqz(27), 26)).U(new e4t(new azt(28), 14));
        }
        asu0.a.getClass();
        this.m = qVar.r0(asu0.r()).a0(io.reactivex.rxjava3.android.schedulers.a.b()).subscribe(new ca10(new lv2(this, z, 5), 23), new iyl0(kyl0.b, 0));
    }

    @Override // xsna.gyl0
    public final void y5(xpa0 xpa0Var) {
        this.d = xpa0Var;
    }

    public final void z(Bitmap bitmap, boolean z, boolean z2) {
        u76 u76Var;
        String str;
        BackgroundEditorState backgroundEditorState = this.h;
        BackgroundEditorState a2 = BackgroundEditorState.a(backgroundEditorState, null, null, null, bitmap, backgroundEditorState.d, null, false, false, null, null, null, null, null, null, 32743);
        this.h = a2;
        if (bitmap == null || (u76Var = this.c) == null) {
            return;
        }
        Bitmap bitmap2 = a2.e;
        BackgroundInfo backgroundInfo = null;
        if (!z) {
            bitmap2 = null;
        }
        if (!z2) {
            qyl0 b = a2.b();
            StoryBackgroundType storyBackgroundType = this.h.c;
            if (b != null) {
                int i = a.$EnumSwitchMapping$0[storyBackgroundType.ordinal()];
                if (i != 2) {
                    str = "color";
                    if (i != 3 && i == 4) {
                        str = "graphics";
                    }
                } else {
                    str = "blur";
                }
                backgroundInfo = new BackgroundInfo(str, storyBackgroundType, b.a.c);
            }
        }
        u76Var.t3(bitmap, bitmap2, backgroundInfo);
    }
}
