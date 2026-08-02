package com.vk.newsfeed.impl.discover.media;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.Lifecycle;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.core.fragments.FragmentImpl;
import com.vk.core.tool.view.FlowLayout;
import com.vk.core.ui.tracking.UiTracker;
import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vk.core.view.components.picture.VkImage;
import com.vk.dto.common.Image;
import com.vk.dto.common.ImageSize;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.restrictions.PhotoRestriction;
import com.vk.dto.common.restrictions.VideoRestriction;
import com.vk.dto.newsfeed.Owner;
import com.vk.dto.newsfeed.entries.discover.PhotoDiscoverGridItem;
import com.vk.dto.newsfeed.entries.discover.VideoDiscoverGridItem;
import com.vk.feed.core.models.discover.DiscoverGridItem;
import com.vk.feed.core.models.discover.DiscoverMediaBlock;
import com.vk.feed.core.models.news.NewsEntry;
import com.vk.feed.design.view.newsfeed.discover.description.FeedDiscoverDescriptionView;
import com.vk.feed.design.view.newsfeed.discover.photo.FeedPhotoDiscoverItemView;
import com.vk.feed.design.view.newsfeed.discover.video.FeedVideoDiscoverItemView;
import com.vk.feed.design.view.newsfeed.list.FeedRecyclerView;
import com.vk.feed.design.view.newsfeed.restriction.RestrictedBlurredPhotoView;
import com.vk.lists.AbstractPaginatedView;
import com.vk.lists.RecyclerPaginatedView;
import com.vk.metrics.performance.scroll.ScrollScreenType;
import com.vk.newsfeed.common.discover.media.cells.holders.tags.DiscoverTagType;
import com.vk.newsfeed.impl.fragments.EntriesListFragment;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stat.scheme.SchemeStat$EventItem;
import com.vkontakte.android.R;
import com.vkontakte.android.attachments.PhotoAttachment;
import com.vkontakte.android.attachments.VideoAttachment;
import com.vkontakte.android.data.PostInteract;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptyList;
import kotlin.collections.builders.ListBuilder;
import one.video.transform.TransformController;
import xsna.a4r;
import xsna.an10;
import xsna.atv0;
import xsna.avj;
import xsna.baf0;
import xsna.bpn0;
import xsna.c2n;
import xsna.c5g;
import xsna.cn70;
import xsna.cnh;
import xsna.cvk;
import xsna.dhr0;
import xsna.di60;
import xsna.dw60;
import xsna.dz5;
import xsna.e43;
import xsna.ean;
import xsna.epx;
import xsna.f2n;
import xsna.fhl;
import xsna.gfs0;
import xsna.ghl;
import xsna.hai0;
import xsna.hjf0;
import xsna.hux;
import xsna.i6n;
import xsna.ixj0;
import xsna.j5g;
import xsna.j6n;
import xsna.jb80;
import xsna.jqp;
import xsna.jse0;
import xsna.k5n;
import xsna.k6n;
import xsna.krv0;
import xsna.l3n;
import xsna.l6n;
import xsna.lbs;
import xsna.m1q0;
import xsna.mqp;
import xsna.mzp0;
import xsna.n4n;
import xsna.o4n;
import xsna.ow90;
import xsna.oz50;
import xsna.p4n;
import xsna.pvo0;
import xsna.q4n;
import xsna.qhh0;
import xsna.qj4;
import xsna.r4n;
import xsna.rl3;
import xsna.rsx0;
import xsna.s1c0;
import xsna.s200;
import xsna.vev0;
import xsna.vid;
import xsna.wee0;
import xsna.ww50;
import xsna.y8g0;
import xsna.yw90;
import xsna.znk0;
import xsna.zrd0;

/*  JADX ERROR: JadxRuntimeException in pass: ClassModifier
    jadx.core.utils.exceptions.JadxRuntimeException: Direct setArg is forbidden for PHI insn, bindArg must be used
    	at jadx.core.dex.instructions.PhiInsn.setArg(PhiInsn.java:129)
    	at jadx.core.dex.instructions.args.InsnArg.wrapInstruction(InsnArg.java:140)
    	at jadx.core.dex.instructions.args.InsnArg.wrapInstruction(InsnArg.java:101)
    	at jadx.core.dex.visitors.ClassModifier.removeFieldUsageFromConstructor(ClassModifier.java:140)
    	at jadx.core.dex.visitors.ClassModifier.removeSyntheticFields(ClassModifier.java:93)
    	at jadx.core.dex.visitors.ClassModifier.visit(ClassModifier.java:64)
    	at jadx.core.dex.visitors.ClassModifier.visit(ClassModifier.java:58)
    */
/* compiled from: DiscoverMediaTabFragment.kt */
/* loaded from: classes4.dex */
public final class DiscoverMediaTabFragment extends EntriesListFragment<f2n> implements qhh0, hai0, dw60 {
    public static final /* synthetic */ int t0 = 0;
    public c2n q0;
    public c r0;
    public final int n0 = R.layout.discover_media_layout_without_usable;
    public final n4n o0 = new n4n();
    public final e p0 = new e();
    public final bpn0 s0 = new bpn0(new cnh(this, 3));

    /* compiled from: DiscoverMediaTabFragment.kt */
    public static final class a extends oz50 {
    }

    /* compiled from: DiscoverMediaTabFragment.kt */
    public static final class b implements AbstractPaginatedView.e {
        public final mzp0 b;
        public int c = -1;
        public boolean d;

        public b(jse0 jse0Var) {
            this.b = jse0Var;
        }

        @Override // com.vk.lists.AbstractPaginatedView.e
        public final void b(int i) {
            if (this.c != i) {
                this.c = i;
                if (i != 8 || this.d) {
                    return;
                }
                this.d = true;
                mzp0 mzp0Var = this.b;
                if (mzp0Var != null) {
                    mzp0Var.h();
                }
            }
        }
    }

    /* compiled from: DiscoverMediaTabFragment.kt */
    public final class c implements m1q0 {
        public final Class<? extends FragmentImpl> a;
        public boolean b;
        public final /* synthetic */ DiscoverMediaTabFragment c;

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v3, types: [com.vk.core.fragments.FragmentImpl] */
        public c() {
            while (true) {
                Fragment parentFragment = r3.getParentFragment();
                DiscoverMediaTabFragment discoverMediaTabFragment = parentFragment instanceof FragmentImpl ? (FragmentImpl) parentFragment : null;
                if (discoverMediaTabFragment == null) {
                    this.a = r3.getClass();
                    return;
                }
                r3 = discoverMediaTabFragment;
            }
        }

        @Override // xsna.m1q0
        public final void a(UiTrackingScreen uiTrackingScreen, UiTrackingScreen uiTrackingScreen2) {
            Class<? extends FragmentImpl> cls;
            FragmentImpl u;
            DiscoverMediaTabFragment discoverMediaTabFragment = this.c;
            FragmentActivity activity = discoverMediaTabFragment.getActivity();
            ww50 v = activity != null ? s200.v(activity) : null;
            if (v == null || (u = v.u()) == null) {
                cls = null;
            } else {
                while (true) {
                    Fragment parentFragment = u.getParentFragment();
                    FragmentImpl fragmentImpl = parentFragment instanceof FragmentImpl ? (FragmentImpl) parentFragment : null;
                    if (fragmentImpl == null) {
                        break;
                    } else {
                        u = fragmentImpl;
                    }
                }
                cls = v.x(u);
            }
            boolean f = epx.f(this.a, cls);
            boolean z = !f;
            if (this.b != z) {
                this.b = z;
                c2n c2nVar = discoverMediaTabFragment.q0;
                if (c2nVar != null) {
                    if (f) {
                        io.reactivex.rxjava3.disposables.c cVar = c2nVar.d;
                        if (cVar != null) {
                            cVar.dispose();
                        }
                        c2nVar.d = null;
                        c2nVar.e = null;
                        return;
                    }
                    io.reactivex.rxjava3.disposables.c cVar2 = c2nVar.d;
                    if (cVar2 == null || cVar2.h()) {
                        c2nVar.b();
                    }
                }
            }
        }
    }

    /* compiled from: DiscoverMediaTabFragment.kt */
    public final class d extends AbstractPaginatedView.i {
        public final /* synthetic */ DiscoverMediaTabFragment a;

        public d(DiscoverMediaTabFragment discoverMediaTabFragment) {
            this.a = discoverMediaTabFragment;
        }

        @Override // com.vk.lists.AbstractPaginatedView.i
        public final void b() {
            int i = DiscoverMediaTabFragment.t0;
            DiscoverMediaTabFragment discoverMediaTabFragment = this.a;
            jse0 so = discoverMediaTabFragment.so();
            if (so != null) {
                so.d(discoverMediaTabFragment.getView());
            }
            yw90 On = discoverMediaTabFragment.On();
            discoverMediaTabFragment.getView();
            On.a();
        }

        @Override // com.vk.lists.AbstractPaginatedView.i
        public final void c() {
            int i = DiscoverMediaTabFragment.t0;
            this.a.ko().Sa();
        }
    }

    public DiscoverMediaTabFragment() {
    }

    @Override // com.vk.newsfeed.impl.fragments.EntriesListFragment, xsna.fqp
    public final void G5(View view, NewsEntry newsEntry, NewsEntry newsEntry2, int i) {
        if (this.d0.s == null) {
            super.G5(view, newsEntry, newsEntry2, i);
        }
    }

    @Override // com.vk.newsfeed.impl.fragments.EntriesListFragment, xsna.fqp, xsna.pds
    public final void J0() {
        c2n c2nVar = this.q0;
        if (c2nVar != null) {
            c2nVar.a(Lifecycle.Event.ON_PAUSE);
        }
        super.J0();
    }

    @Override // com.vk.newsfeed.impl.fragments.EntriesListFragment, xsna.fqp
    public final s1c0 M0() {
        return (s1c0) this.s0.getValue();
    }

    @Override // xsna.dw60
    public final void Nb(boolean z) {
        ko().Nb(false);
    }

    @Override // xsna.hai0
    public final void c3() {
        jse0 so = so();
        if (so != null) {
            so.g();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:142:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:342:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01f6  */
    /* JADX WARN: Type inference failed for: r0v30, types: [android.view.View, android.view.ViewGroup, android.widget.FrameLayout, com.vk.feed.design.view.newsfeed.discover.photo.FeedPhotoDiscoverItemView] */
    /* JADX WARN: Type inference failed for: r0v32, types: [android.view.View, com.vk.feed.design.view.newsfeed.restriction.RestrictedBlurredPhotoView, com.vk.feed.design.view.newsfeed.restriction.RestrictedPhotoView] */
    /* JADX WARN: Type inference failed for: r13v4, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v29, types: [android.view.LayoutInflater] */
    /* JADX WARN: Type inference failed for: r3v48, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r4v34, types: [com.vk.feed.core.models.news.NewsEntry] */
    /* JADX WARN: Type inference failed for: r8v22, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r8v23 */
    /* JADX WARN: Type inference failed for: r8v26, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r9v0, types: [com.vk.feed.core.models.news.NewsEntry] */
    @Override // com.vk.newsfeed.impl.fragments.EntriesListFragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View io(View view, NewsEntry newsEntry, NewsEntry newsEntry2) {
        Bundle arguments;
        int b2;
        int height;
        Integer valueOf;
        int i;
        DiscoverGridItem Eb;
        Object p4nVar;
        String str;
        String str2;
        Owner G;
        FeedVideoDiscoverItemView feedVideoDiscoverItemView;
        boolean z;
        VideoRestriction O;
        int i2;
        l3n l3nVar;
        ?? r8;
        List list;
        String str3;
        Owner G2;
        int i3;
        baf0 b3;
        l3n l3nVar2;
        String str4;
        boolean z2;
        EmptyList emptyList;
        String str5;
        String str6;
        Owner G3;
        PhotoRestriction photoRestriction;
        DiscoverMediaBlock discoverMediaBlock = newsEntry2 instanceof DiscoverMediaBlock ? (DiscoverMediaBlock) newsEntry2 : null;
        if (discoverMediaBlock != null && (arguments = getArguments()) != null && arguments.getBoolean("show_in_lego_theme", false)) {
            n4n n4nVar = this.o0;
            ((cvk) n4nVar.a).getClass();
            int width = view.getWidth();
            Integer valueOf2 = Integer.valueOf(width);
            if (width <= 0) {
                valueOf2 = null;
            }
            if (valueOf2 == null) {
                int measuredWidth = view.getMeasuredWidth();
                valueOf2 = Integer.valueOf(measuredWidth);
                if (measuredWidth <= 0) {
                    valueOf2 = null;
                }
                if (valueOf2 == null) {
                    b2 = cn70.b(160);
                    height = view.getHeight();
                    valueOf = Integer.valueOf(height);
                    if (height <= 0) {
                        valueOf = null;
                    }
                    if (valueOf == null) {
                        int measuredHeight = view.getMeasuredHeight();
                        valueOf = Integer.valueOf(measuredHeight);
                        if (measuredHeight <= 0) {
                            valueOf = null;
                        }
                        if (valueOf == null) {
                            i = b2;
                            float f = b2;
                            int b4 = an10.b(1.15f * f);
                            o4n o4nVar = new o4n(b4, an10.b((i * b4) / f));
                            Eb = discoverMediaBlock.Eb(newsEntry);
                            if (Eb != null) {
                                vid vidVar = (vid) n4nVar.c;
                                vidVar.getClass();
                                ?? r9 = Eb.c;
                                if (r9.d || (!((z = Eb instanceof PhotoDiscoverGridItem)) ? (Eb instanceof VideoDiscoverGridItem) && (O = ((VideoDiscoverGridItem) Eb).j.k.O()) != null && O.d : !((photoRestriction = ((PhotoDiscoverGridItem) Eb).j.l.L) == null || !photoRestriction.d))) {
                                    ((dz5) vidVar.c).getClass();
                                    boolean z3 = Eb instanceof PhotoDiscoverGridItem;
                                    if (z3) {
                                        str = ixj0.n(((PhotoDiscoverGridItem) Eb).j.l.y.b);
                                    } else if (Eb instanceof VideoDiscoverGridItem) {
                                        Image image = ((VideoDiscoverGridItem) Eb).j.k.getImage();
                                        str = ixj0.n(image.Db() ? image.c : image.b);
                                    } else {
                                        str = null;
                                    }
                                    String F5 = z3 ? ((PhotoDiscoverGridItem) Eb).j.l.P : Eb instanceof VideoDiscoverGridItem ? ((VideoDiscoverGridItem) Eb).j.k.F5() : null;
                                    Context context = e43.a;
                                    if (context == null) {
                                        context = null;
                                    }
                                    Resources resources = context.getResources();
                                    VideoFile videoFile = Eb instanceof VideoDiscoverGridItem ? ((VideoDiscoverGridItem) Eb).j.k : null;
                                    if (videoFile == null || videoFile.b0() <= 0) {
                                        if (r9 instanceof rsx0) {
                                            rsx0 rsx0Var = (rsx0) r9;
                                            if (rsx0Var.D() > 0) {
                                                str2 = pvo0.k(rsx0Var.D(), resources, false);
                                            }
                                        }
                                        str2 = null;
                                    } else {
                                        str2 = pvo0.k(videoFile.b0(), resources, false);
                                    }
                                    Integer u = znk0.u(Eb.f);
                                    String e2 = u != null ? y8g0.e(u.intValue()) : y8g0.e(R.string.accessibility_discover_media_ignored_item);
                                    ListBuilder e3 = e43.e();
                                    e3.add(e2);
                                    wee0 wee0Var = r9 instanceof wee0 ? (wee0) r9 : null;
                                    String str7 = (wee0Var == null || (G = wee0Var.G()) == null) ? null : G.c;
                                    if (str7 != null) {
                                        if (str7.length() <= 0) {
                                            str7 = null;
                                        }
                                        if (str7 != null) {
                                            e3.add(str7);
                                        }
                                    }
                                    if (str2 != null) {
                                        if (str2.length() <= 0) {
                                            str2 = null;
                                        }
                                        if (str2 != null) {
                                            e3.add(str2);
                                        }
                                    }
                                    p4nVar = new p4n(str, F5, j5g.g0(e3.g(), ", ", null, null, 0, null, 62));
                                } else if (z) {
                                    PhotoDiscoverGridItem photoDiscoverGridItem = (PhotoDiscoverGridItem) Eb;
                                    ((j6n) vidVar.a).getClass();
                                    Parcelable parcelable = photoDiscoverGridItem.c;
                                    PhotoAttachment photoAttachment = photoDiscoverGridItem.j;
                                    DiscoverGridItem.a aVar = photoDiscoverGridItem.g;
                                    String str8 = photoDiscoverGridItem.f;
                                    if (str8 != null && str8.length() != 0) {
                                        Context context2 = e43.a;
                                        if (context2 == null) {
                                            context2 = null;
                                        }
                                        Integer r = znk0.r(context2, str8);
                                        if (r != null) {
                                            i3 = r.intValue();
                                            b3 = i3 == 0 ? dhr0.u.b(i3, R.attr.vk_ui_icon_contrast) : null;
                                            if (b3 == null) {
                                                l3n l3nVar3 = new l3n();
                                                l3nVar3.a = b3;
                                                l3nVar2 = l3nVar3;
                                            } else {
                                                l3nVar2 = null;
                                            }
                                            String str9 = aVar.a;
                                            z2 = (str9 == null && str9.length() != 0) || !((str4 = aVar.c) == null || str4.length() == 0);
                                            String str10 = photoAttachment.l.Fb(b4, false).d.d;
                                            String str11 = photoAttachment.l.P;
                                            boolean z4 = photoDiscoverGridItem.e >= 2 || photoDiscoverGridItem.d < 2;
                                            String str12 = aVar.a;
                                            String str13 = aVar.c;
                                            if (z2) {
                                                List<String> list2 = photoDiscoverGridItem.h;
                                                if (list2 != null) {
                                                    List<String> list3 = list2;
                                                    ?? arrayList = new ArrayList(c5g.u(list3, 10));
                                                    Iterator it = list3.iterator();
                                                    while (it.hasNext()) {
                                                        arrayList.add(new ean((String) it.next(), null, 2));
                                                    }
                                                    emptyList = arrayList;
                                                } else {
                                                    emptyList = EmptyList.b;
                                                }
                                            } else {
                                                emptyList = EmptyList.b;
                                            }
                                            EmptyList emptyList2 = emptyList;
                                            if (parcelable instanceof rsx0) {
                                                int D = ((rsx0) parcelable).D();
                                                Integer valueOf3 = Integer.valueOf(D);
                                                if (D <= 0) {
                                                    valueOf3 = null;
                                                }
                                                if (valueOf3 != null) {
                                                    int intValue = valueOf3.intValue();
                                                    Context context3 = e43.a;
                                                    if (context3 == null) {
                                                        context3 = null;
                                                    }
                                                    str5 = pvo0.k(intValue, context3.getResources(), false);
                                                    Integer u2 = znk0.u(str8);
                                                    String e4 = u2 != null ? y8g0.e(u2.intValue()) : y8g0.e(R.string.accessibility_discover_media_photo);
                                                    ListBuilder e5 = e43.e();
                                                    e5.add(e4);
                                                    wee0 wee0Var2 = parcelable instanceof wee0 ? (wee0) parcelable : null;
                                                    str6 = (wee0Var2 != null || (G3 = wee0Var2.G()) == null) ? null : G3.c;
                                                    if (str6 != null) {
                                                        if (str6.length() <= 0) {
                                                            str6 = null;
                                                        }
                                                        if (str6 != null) {
                                                            e5.add(str6);
                                                        }
                                                    }
                                                    if (str5 != null) {
                                                        if (str5.length() <= 0) {
                                                            str5 = null;
                                                        }
                                                        if (str5 != null) {
                                                            e5.add(str5);
                                                        }
                                                    }
                                                    p4nVar = new q4n(str10, str11, l3nVar2, z2, z4, str12, str13, emptyList2, j5g.g0(e5.g(), ", ", null, null, 0, null, 62));
                                                }
                                            }
                                            str5 = null;
                                            Integer u22 = znk0.u(str8);
                                            if (u22 != null) {
                                            }
                                            ListBuilder e52 = e43.e();
                                            e52.add(e4);
                                            if (parcelable instanceof wee0) {
                                            }
                                            if (wee0Var2 != null) {
                                            }
                                            if (str6 != null) {
                                            }
                                            if (str5 != null) {
                                            }
                                            p4nVar = new q4n(str10, str11, l3nVar2, z2, z4, str12, str13, emptyList2, j5g.g0(e52.g(), ", ", null, null, 0, null, 62));
                                        }
                                    }
                                    i3 = 0;
                                    if (i3 == 0) {
                                    }
                                    if (b3 == null) {
                                    }
                                    String str92 = aVar.a;
                                    if (str92 == null) {
                                    }
                                    String str102 = photoAttachment.l.Fb(b4, false).d.d;
                                    String str112 = photoAttachment.l.P;
                                    if (photoDiscoverGridItem.e >= 2) {
                                    }
                                    String str122 = aVar.a;
                                    String str132 = aVar.c;
                                    if (z2) {
                                    }
                                    EmptyList emptyList22 = emptyList;
                                    if (parcelable instanceof rsx0) {
                                    }
                                    str5 = null;
                                    Integer u222 = znk0.u(str8);
                                    if (u222 != null) {
                                    }
                                    ListBuilder e522 = e43.e();
                                    e522.add(e4);
                                    if (parcelable instanceof wee0) {
                                    }
                                    if (wee0Var2 != null) {
                                    }
                                    if (str6 != null) {
                                    }
                                    if (str5 != null) {
                                    }
                                    p4nVar = new q4n(str102, str112, l3nVar2, z2, z4, str122, str132, emptyList22, j5g.g0(e522.g(), ", ", null, null, 0, null, 62));
                                } else if (Eb instanceof VideoDiscoverGridItem) {
                                    l6n l6nVar = (l6n) vidVar.b;
                                    VideoDiscoverGridItem videoDiscoverGridItem = (VideoDiscoverGridItem) Eb;
                                    l6nVar.getClass();
                                    ?? r4 = videoDiscoverGridItem.c;
                                    DiscoverGridItem.a aVar2 = videoDiscoverGridItem.g;
                                    VideoAttachment videoAttachment = videoDiscoverGridItem.j;
                                    String str14 = videoDiscoverGridItem.f;
                                    if (str14 == null || str14.length() == 0) {
                                        i2 = 0;
                                    } else {
                                        Context context4 = e43.a;
                                        if (context4 == null) {
                                            context4 = null;
                                        }
                                        i2 = znk0.v(context4, str14);
                                    }
                                    Drawable a2 = i2 == 0 ? null : (i2 == R.drawable.vk_icon_live_badge_20 || i2 == R.drawable.vk_icon_lego_live_badge_20) ? dhr0.u.a(i2) : dhr0.u.b(i2, R.attr.vk_ui_icon_contrast);
                                    if (a2 != null) {
                                        l3n l3nVar4 = new l3n();
                                        l3nVar4.a = a2;
                                        l3nVar = l3nVar4;
                                    } else {
                                        l3nVar = null;
                                    }
                                    boolean z5 = ((Boolean) l6nVar.a.getValue()).booleanValue() && di60.G(videoAttachment);
                                    String str15 = aVar2.a;
                                    String str16 = aVar2.c;
                                    boolean z6 = ((str15 == null || str15.length() == 0) && (str16 == null || str16.length() == 0)) ? false : true;
                                    Image image2 = videoAttachment.k.getImage();
                                    ImageSize imageSize = (ImageSize) ixj0.c(image2.Db() ? image2.c : image2.b, b4, b4);
                                    String str17 = imageSize != null ? imageSize.d.d : null;
                                    boolean z7 = videoDiscoverGridItem.e < 2 || videoDiscoverGridItem.d < 2;
                                    String str18 = aVar2.a;
                                    String str19 = str16 != null ? str16.toString() : null;
                                    if (!z6 || z5) {
                                        List<String> list4 = videoDiscoverGridItem.h;
                                        if (list4 != null) {
                                            List<String> list5 = list4;
                                            r8 = new ArrayList(c5g.u(list5, 10));
                                            Iterator it2 = list5.iterator();
                                            while (it2.hasNext()) {
                                                r8.add(new ean((String) it2.next(), null, 2));
                                            }
                                        } else {
                                            r8 = EmptyList.b;
                                        }
                                        ArrayList arrayList2 = new ArrayList((Collection) r8);
                                        list = arrayList2;
                                        if (z5) {
                                            arrayList2.add(new ean(null, DiscoverTagType.OZON_BADGE, 1));
                                            list = arrayList2;
                                        }
                                    } else {
                                        list = EmptyList.b;
                                    }
                                    List list6 = list;
                                    Context context5 = e43.a;
                                    if (context5 == null) {
                                        context5 = null;
                                    }
                                    Resources resources2 = context5.getResources();
                                    if (videoAttachment.k.b0() > 0) {
                                        str3 = pvo0.k(videoAttachment.k.b0(), resources2, false);
                                    } else {
                                        if (r4 instanceof rsx0) {
                                            rsx0 rsx0Var2 = (rsx0) r4;
                                            if (rsx0Var2.D() > 0) {
                                                str3 = pvo0.k(rsx0Var2.D(), resources2, false);
                                            }
                                        }
                                        str3 = null;
                                    }
                                    Integer u3 = znk0.u(str14);
                                    String e6 = u3 != null ? y8g0.e(u3.intValue()) : y8g0.e(R.string.accessibility_discover_media_video);
                                    ListBuilder e7 = e43.e();
                                    e7.add(e6);
                                    wee0 wee0Var3 = r4 instanceof wee0 ? (wee0) r4 : null;
                                    String str20 = (wee0Var3 == null || (G2 = wee0Var3.G()) == null) ? null : G2.c;
                                    if (str20 != null) {
                                        if (str20.length() <= 0) {
                                            str20 = null;
                                        }
                                        if (str20 != null) {
                                            e7.add(str20);
                                        }
                                    }
                                    if (str3 != null) {
                                        if (str3.length() <= 0) {
                                            str3 = null;
                                        }
                                        if (str3 != null) {
                                            e7.add(str3);
                                        }
                                    }
                                    String g0 = j5g.g0(e7.g(), ", ", null, null, 0, null, 62);
                                    VideoFile videoFile2 = videoAttachment.k;
                                    String str21 = videoAttachment.l;
                                    PostInteract postInteract = videoAttachment.g;
                                    p4nVar = new r4n(str17, l3nVar, z6, z7, str18, str19, list6, g0, videoFile2, str21, postInteract != null ? postInteract.b : null, r4.Cb().b, videoDiscoverGridItem.k, z5);
                                } else {
                                    p4nVar = null;
                                }
                                if (p4nVar != null) {
                                    atv0 atv0Var = (atv0) n4nVar.b;
                                    Context context6 = view.getContext();
                                    atv0Var.getClass();
                                    boolean z8 = p4nVar instanceof p4n;
                                    int i4 = o4nVar.b;
                                    int i5 = o4nVar.a;
                                    if (z8) {
                                        p4n p4nVar2 = (p4n) p4nVar;
                                        ?? restrictedBlurredPhotoView = new RestrictedBlurredPhotoView(context6, null, 6);
                                        restrictedBlurredPhotoView.setLayoutParams(new ViewGroup.LayoutParams(i5, i4));
                                        restrictedBlurredPhotoView.setDontLoadAgainIfSameResource(true);
                                        restrictedBlurredPhotoView.c(R.drawable.vk_icon_hide_outline_48, context6.getColor(R.color.vk_white), cn70.b(48));
                                        restrictedBlurredPhotoView.h(p4nVar2.a, p4nVar2.b);
                                        restrictedBlurredPhotoView.setContentDescription(p4nVar2.c);
                                        feedVideoDiscoverItemView = restrictedBlurredPhotoView;
                                    } else if (p4nVar instanceof q4n) {
                                        q4n q4nVar = (q4n) p4nVar;
                                        ColorDrawable colorDrawable = new ColorDrawable(krv0.m(R.attr.vk_ui_image_placeholder, context6));
                                        ?? feedPhotoDiscoverItemView = new FeedPhotoDiscoverItemView(context6, null, 0);
                                        feedPhotoDiscoverItemView.b = FeedDiscoverDescriptionView.TextStyle.Medium;
                                        feedPhotoDiscoverItemView.c = 1;
                                        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
                                        feedPhotoDiscoverItemView.d = truncateAt;
                                        feedPhotoDiscoverItemView.e = 2;
                                        feedPhotoDiscoverItemView.f = truncateAt;
                                        feedPhotoDiscoverItemView.k = new FeedPhotoDiscoverItemView.b.a(null, null);
                                        LayoutInflater.from(context6).inflate(R.layout.feed_discover_photo, feedPhotoDiscoverItemView, true);
                                        feedPhotoDiscoverItemView.g = (VkImage) feedPhotoDiscoverItemView.findViewById(R.id.discover_grid_item_image);
                                        feedPhotoDiscoverItemView.setLayoutParams(new ViewGroup.LayoutParams(i5, i4));
                                        feedPhotoDiscoverItemView.setPlaceholder(colorDrawable);
                                        String str22 = q4nVar.a;
                                        List<ean> list7 = q4nVar.h;
                                        feedPhotoDiscoverItemView.setContent(new FeedPhotoDiscoverItemView.b.a(str22, q4nVar.b));
                                        feedPhotoDiscoverItemView.setForeground(q4nVar.c);
                                        if (q4nVar.d) {
                                            feedPhotoDiscoverItemView.setTextStyle(q4nVar.e ? FeedPhotoDiscoverItemView.TextStyle.Small : FeedPhotoDiscoverItemView.TextStyle.Medium);
                                            feedPhotoDiscoverItemView.setBottom(new FeedPhotoDiscoverItemView.a.C1047a(q4nVar.f, q4nVar.g));
                                        } else {
                                            feedPhotoDiscoverItemView.setBottom(null);
                                            if (!list7.isEmpty()) {
                                                k6n k6nVar = new k6n(list7);
                                                FlowLayout flowLayout = feedPhotoDiscoverItemView.j;
                                                if (flowLayout == null) {
                                                    flowLayout = new FlowLayout(feedPhotoDiscoverItemView.getContext());
                                                    flowLayout.setId(R.id.discover_grid_item_tags);
                                                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
                                                    layoutParams.gravity = 8388691;
                                                    layoutParams.leftMargin = cn70.b(8);
                                                    layoutParams.topMargin = cn70.b(2);
                                                    layoutParams.rightMargin = cn70.b(8);
                                                    layoutParams.bottomMargin = cn70.b(2);
                                                    flowLayout.setLayoutParams(layoutParams);
                                                    flowLayout.setRowsStartFromBottom(true);
                                                    feedPhotoDiscoverItemView.j = flowLayout;
                                                    feedPhotoDiscoverItemView.addView(flowLayout);
                                                }
                                                flowLayout.setVisibility(0);
                                                int tagsCount = k6nVar.getTagsCount();
                                                for (int i6 = 0; i6 < tagsCount; i6++) {
                                                    flowLayout.addView(k6nVar.a(i6, flowLayout));
                                                }
                                            }
                                        }
                                        feedPhotoDiscoverItemView.setContentDescription(q4nVar.i);
                                        feedVideoDiscoverItemView = feedPhotoDiscoverItemView;
                                    } else {
                                        if (!(p4nVar instanceof r4n)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        r4n r4nVar = (r4n) p4nVar;
                                        gfs0 gfs0Var = new gfs0(r4nVar, o4nVar);
                                        FeedVideoDiscoverItemView feedVideoDiscoverItemView2 = new FeedVideoDiscoverItemView(context6, null, 6);
                                        feedVideoDiscoverItemView2.setLayoutParams(new ViewGroup.LayoutParams(i5, i4));
                                        gfs0.a aVar3 = new gfs0.a(feedVideoDiscoverItemView2);
                                        feedVideoDiscoverItemView2.setPreviewPlaceholder(new ColorDrawable(krv0.m(R.attr.vk_ui_image_placeholder, feedVideoDiscoverItemView2.getContext())));
                                        feedVideoDiscoverItemView2.h.getTransformController().f(TransformController.ScaleType.CROP, false);
                                        String str23 = r4nVar.a;
                                        List<ean> list8 = r4nVar.g;
                                        feedVideoDiscoverItemView2.g.o0(str23, null);
                                        feedVideoDiscoverItemView2.setForeground(r4nVar.b);
                                        feedVideoDiscoverItemView2.setContentDescription(r4nVar.h);
                                        feedVideoDiscoverItemView2.setPreviewImageVisible(true);
                                        if (!r4nVar.c || r4nVar.n) {
                                            feedVideoDiscoverItemView2.setBottom((FeedVideoDiscoverItemView.a) null);
                                            if (!list8.isEmpty()) {
                                                feedVideoDiscoverItemView2.a(new k6n(list8));
                                            }
                                        } else {
                                            feedVideoDiscoverItemView2.setTextStyle(r4nVar.d ? FeedVideoDiscoverItemView.TextStyle.Small : FeedVideoDiscoverItemView.TextStyle.Medium);
                                            feedVideoDiscoverItemView2.setBottom(new FeedVideoDiscoverItemView.a.C1049a(r4nVar.e, r4nVar.f));
                                        }
                                        if (r4nVar.m) {
                                            gfs0Var.a = new i6n(r4nVar.i, r4nVar.j, r4nVar.k, r4nVar.l, aVar3);
                                            feedVideoDiscoverItemView2.addOnAttachStateChangeListener(gfs0Var.c);
                                        }
                                        feedVideoDiscoverItemView = feedVideoDiscoverItemView2;
                                    }
                                    feedVideoDiscoverItemView.setClipToOutline(true);
                                    feedVideoDiscoverItemView.setOutlineProvider(new avj(vev0.b));
                                    return feedVideoDiscoverItemView;
                                }
                            }
                        }
                    }
                    i = valueOf.intValue();
                    float f2 = b2;
                    int b42 = an10.b(1.15f * f2);
                    o4n o4nVar2 = new o4n(b42, an10.b((i * b42) / f2));
                    Eb = discoverMediaBlock.Eb(newsEntry);
                    if (Eb != null) {
                    }
                }
            }
            b2 = valueOf2.intValue();
            height = view.getHeight();
            valueOf = Integer.valueOf(height);
            if (height <= 0) {
            }
            if (valueOf == null) {
            }
            i = valueOf.intValue();
            float f22 = b2;
            int b422 = an10.b(1.15f * f22);
            o4n o4nVar22 = new o4n(b422, an10.b((i * b422) / f22));
            Eb = discoverMediaBlock.Eb(newsEntry);
            if (Eb != null) {
            }
        }
        return null;
    }

    @Override // com.vk.newsfeed.impl.fragments.EntriesListFragment
    public final void lo(RecyclerView recyclerView, RecyclerPaginatedView recyclerPaginatedView) {
        mqp mqpVar = this.d0;
        a4r a4rVar = mqpVar.y;
        a4r a4rVar2 = mqpVar.y;
        a4rVar.h(recyclerView);
        a4rVar2.f = new ghl(recyclerView, recyclerPaginatedView, new fhl(recyclerView, recyclerPaginatedView, lbs.o(this) ? R.attr.vk_ui_background_content : R.attr.vk_ui_background));
        if (recyclerView instanceof FeedRecyclerView) {
            a4rVar2.g(hux.c.b.a);
        }
    }

    @Override // com.vk.newsfeed.impl.fragments.EntriesListFragment
    public final f2n no() {
        return new k5n(this);
    }

    @Override // com.vk.newsfeed.impl.fragments.EntriesListFragment, xsna.fqp, xsna.pds
    public final void o1() {
        super.o1();
        ko().yg();
        c2n c2nVar = this.q0;
        if (c2nVar != null) {
            c2nVar.a(Lifecycle.Event.ON_RESUME);
        }
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        super.onAttach(context);
        Bundle arguments = getArguments();
        Serializable serializable = arguments != null ? arguments.getSerializable("com.vk.newsfeed.impl.discover.media.UI_MEASURING_UUID_ARG") : null;
        UUID uuid = serializable instanceof UUID ? (UUID) serializable : null;
        if (uuid != null) {
            ko().j(uuid);
        }
        jse0 so = so();
        if (so != null && so.d) {
            so.init();
            so.d = false;
        }
        jse0 so2 = so();
        if (so2 != null) {
            so2.start();
        }
        Bundle arguments2 = getArguments();
        Serializable serializable2 = arguments2 != null ? arguments2.getSerializable("com.vk.newsfeed.impl.discover.media.PRODUCT_SCORE_UUID_ARG") : null;
        UUID uuid2 = serializable2 instanceof UUID ? (UUID) serializable2 : null;
        if (uuid2 != null) {
            zrd0 zrd0Var = zrd0.a;
            this.L = zrd0.e.get(uuid2);
        }
    }

    @Override // com.vk.newsfeed.impl.fragments.EntriesListFragment, com.vk.core.fragments.BaseFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (this.d0.j()) {
            this.g0 = true;
        }
    }

    @Override // com.vk.newsfeed.impl.fragments.EntriesListFragment, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View onCreateView = super.onCreateView(layoutInflater, viewGroup, bundle);
        mqp mqpVar = this.d0;
        mqpVar.y.a(this.p0);
        RecyclerPaginatedView recyclerPaginatedView = mqpVar.h;
        if (recyclerPaginatedView != null) {
            ow90 ow90Var = ow90.a;
            ow90.c(ScrollScreenType.DISCOVER, recyclerPaginatedView.getRecyclerView());
        }
        RecyclerPaginatedView recyclerPaginatedView2 = mqpVar.h;
        if (recyclerPaginatedView2 != null) {
            recyclerPaginatedView2.setLoaderVisibilityChangeListener(new b(so()));
        }
        c cVar = new c();
        UiTracker uiTracker = UiTracker.a;
        UiTracker.a(cVar);
        this.r0 = cVar;
        c2n c2nVar = new c2n(rl3.y0(new MobileOfficialAppsCoreNavStat$EventScreen[]{MobileOfficialAppsCoreNavStat$EventScreen.DISCOVER_MEDIA_SIMILAR_NEWS, MobileOfficialAppsCoreNavStat$EventScreen.CLIPS}), new qj4(this, 11));
        this.q0 = c2nVar;
        c2nVar.a(Lifecycle.Event.ON_CREATE);
        return onCreateView;
    }

    @Override // com.vk.newsfeed.impl.fragments.EntriesListFragment, com.vk.core.fragments.BaseFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        c cVar = this.r0;
        if (cVar != null) {
            UiTracker uiTracker = UiTracker.a;
            UiTracker.g(cVar);
        }
        this.r0 = null;
        c2n c2nVar = this.q0;
        if (c2nVar != null) {
            c2nVar.a(Lifecycle.Event.ON_DESTROY);
        }
        this.q0 = null;
        super.onDestroyView();
    }

    @Override // com.vk.newsfeed.impl.fragments.EntriesListFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        if (bundle == null) {
            jse0 so = so();
            if (so != null) {
                so.e(view);
            }
            On().d3(view);
        }
    }

    @Override // com.vk.newsfeed.impl.fragments.EntriesListFragment
    public final View oo(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(lbs.o(this) ? R.layout.discover_media_layout_v3 : this.n0, viewGroup, false);
    }

    @Override // com.vk.newsfeed.impl.fragments.EntriesListFragment
    public final void po() {
        hjf0 hjf0Var = this.d0.H;
        d dVar = new d(this);
        RecyclerPaginatedView recyclerPaginatedView = ((mqp) hjf0Var.a.c).h;
        if (recyclerPaginatedView != null) {
            recyclerPaginatedView.setUiStateCallbacks(dVar);
        }
    }

    @Override // xsna.hai0
    public final void q1() {
        jse0 so = so();
        if (so != null) {
            so.init();
        }
    }

    @Override // com.vk.newsfeed.impl.fragments.EntriesListFragment
    public final void qo(jqp jqpVar) {
        mqp mqpVar = this.d0;
        mqpVar.y.g(hux.f.a.a);
        mqpVar.a().d(mqpVar.y);
    }

    @Override // xsna.qhh0
    public final boolean s() {
        RecyclerView recyclerView = this.d0.y.c;
        if (recyclerView == null || recyclerView.computeVerticalScrollOffset() == 0) {
            return false;
        }
        recyclerView.scrollToPosition(0);
        return true;
    }

    public final jse0 so() {
        f2n ko = ko();
        k5n k5nVar = ko instanceof k5n ? (k5n) ko : null;
        if (k5nVar != null) {
            return k5nVar.p0;
        }
        return null;
    }

    @Override // com.vk.core.fragments.FragmentImpl, xsna.m0q0
    public final void y(UiTrackingScreen uiTrackingScreen) {
        Bundle arguments = getArguments();
        if (arguments == null || !arguments.containsKey("discover_id")) {
            return;
        }
        SchemeStat$EventItem.Type type = SchemeStat$EventItem.Type.DISCOVER_CATEGORY;
        Bundle arguments2 = getArguments();
        uiTrackingScreen.f = new SchemeStat$EventItem(type, null, null, null, arguments2 != null ? arguments2.getString("track_code") : null, null, 46, null);
    }

    @Override // xsna.dw60
    public final void nd(boolean z) {
    }

    /* compiled from: DiscoverMediaTabFragment.kt */
    public static final class e extends jb80 {
        @Override // androidx.recyclerview.widget.RecyclerView.t
        public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
        }
    }
}
