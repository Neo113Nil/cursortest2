package com.vk.attachpicker.fragment.gallery;

import android.app.Activity;
import android.content.ContentUris;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.provider.DocumentsContract;
import android.provider.MediaStore;
import android.text.TextUtils;
import android.util.ArrayMap;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import androidx.credentials.exceptions.publickeycredential.DomExceptionUtils;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.PagerAdapter;
import com.ironsource.D1;
import com.ironsource.X3;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import com.unity3d.services.UnityAdsConstants;
import com.vk.attachpicker.ImageFormatRestrictions;
import com.vk.attachpicker.ImageSizeLimits;
import com.vk.attachpicker.PhotoVideoAttachActivity;
import com.vk.attachpicker.adapter.PhotoSmallAdapter;
import com.vk.attachpicker.b;
import com.vk.attachpicker.configuration.GalleryGridSpanStyle;
import com.vk.attachpicker.configuration.GalleryHeaderButtonStyle;
import com.vk.attachpicker.screen.h;
import com.vk.attachpicker.screen.p;
import com.vk.attachpicker.widget.ContextProgressView;
import com.vk.attachpicker.widget.CustomSpinner;
import com.vk.attachpicker.widget.GalleryRecyclerView;
import com.vk.core.apps.BuildInfo;
import com.vk.core.files.ExternalDirType;
import com.vk.core.fragments.FragmentImpl;
import com.vk.core.preference.Preference;
import com.vk.core.simplescreen.ScreenContainer;
import com.vk.core.ui.floating_view.FloatingViewGesturesHelper;
import com.vk.core.view.components.button.VkButton;
import com.vk.core.view.components.button.VkSimpleButton;
import com.vk.dto.common.id.UserId;
import com.vk.dto.stories.entities.StoryCameraMode;
import com.vk.dto.stories.entities.StoryCameraTarget;
import com.vk.gallerypicker.configuration.GalleryPickerSourceConfiguration;
import com.vk.lists.AbstractPaginatedView;
import com.vk.log.L;
import com.vk.media.MediaFilteringStrategy;
import com.vk.mediastore.system.AlbumEntry;
import com.vk.mediastore.system.MediaStoreEntry;
import com.vk.mediastore.system.MediaStoreVideoEntry;
import com.vk.metrics.eventtracking.Event;
import com.vk.movika.sdk.base.ui.q0;
import com.vk.permission.PermissionHelper;
import com.vk.photo.editor.features.collage.model.CollageAspectRatioFormat;
import com.vk.preview.presentation.GalleryPickerInitialData;
import com.vk.stories.analytics.StoryPublishEvent;
import com.vk.story.viewer.api.di.StoryViewerComponent;
import com.vk.storycamera.builder.StoryCameraParams;
import com.vk.superapp.api.dto.story.WebStoryBox;
import com.vk.toggle.Features;
import com.vk.toggle.features.ClipsFeatures;
import com.vkontakte.android.R;
import com.vungle.ads.internal.protos.Sdk;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.reactivex.rxjava3.internal.operators.single.f0;
import io.reactivex.rxjava3.internal.operators.single.m;
import io.reactivex.rxjava3.internal.operators.single.n;
import io.reactivex.rxjava3.internal.operators.single.v;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Ref$ObjectRef;
import org.json.JSONObject;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.a4t;
import xsna.a8v;
import xsna.ab0;
import xsna.akh;
import xsna.amp;
import xsna.arm0;
import xsna.asu0;
import xsna.awt0;
import xsna.b1j;
import xsna.b3t;
import xsna.b470;
import xsna.b4t;
import xsna.b5t;
import xsna.b8k;
import xsna.bc0;
import xsna.bek0;
import xsna.bo8;
import xsna.boe0;
import xsna.bpn0;
import xsna.bw;
import xsna.bwt0;
import xsna.c2g;
import xsna.c3u0;
import xsna.c5g;
import xsna.c5t;
import xsna.c6a0;
import xsna.c9f;
import xsna.cci0;
import xsna.cfl;
import xsna.cnh;
import xsna.cuz;
import xsna.cvh;
import xsna.cvk;
import xsna.cws;
import xsna.d3t;
import xsna.d4t;
import xsna.dgm;
import xsna.dhr0;
import xsna.djm0;
import xsna.dne;
import xsna.dqn0;
import xsna.e3f;
import xsna.e3t;
import xsna.e43;
import xsna.e4p;
import xsna.e4t;
import xsna.e5t;
import xsna.eaa;
import xsna.el3;
import xsna.el6;
import xsna.em6;
import xsna.eoe0;
import xsna.epx;
import xsna.eqf;
import xsna.eqy;
import xsna.es8;
import xsna.f0g;
import xsna.f370;
import xsna.f44;
import xsna.f4m;
import xsna.f4t;
import xsna.fbh;
import xsna.fkq0;
import xsna.fm1;
import xsna.fnj;
import xsna.fpf0;
import xsna.fy90;
import xsna.g2g;
import xsna.g4p;
import xsna.g4t;
import xsna.g760;
import xsna.gea0;
import xsna.gj1;
import xsna.gmj;
import xsna.gy;
import xsna.gz80;
import xsna.gzs;
import xsna.h020;
import xsna.h0g;
import xsna.h1;
import xsna.h2d0;
import xsna.h2k0;
import xsna.h3t;
import xsna.h4t;
import xsna.h9f;
import xsna.hb0;
import xsna.hg1;
import xsna.hne0;
import xsna.hod;
import xsna.hwg0;
import xsna.i4h;
import xsna.i4p;
import xsna.i5f;
import xsna.iah0;
import xsna.ihs;
import xsna.iin0;
import xsna.ik90;
import xsna.ikv0;
import xsna.im1;
import xsna.iwg0;
import xsna.iz10;
import xsna.izs;
import xsna.j05;
import xsna.j34;
import xsna.j3t;
import xsna.j5g;
import xsna.jfl;
import xsna.jgp;
import xsna.jk90;
import xsna.jpf;
import xsna.jz;
import xsna.k41;
import xsna.k5h;
import xsna.k7m;
import xsna.k8m0;
import xsna.kfi0;
import xsna.kv2;
import xsna.kwg0;
import xsna.l5a0;
import xsna.l5t;
import xsna.l6a0;
import xsna.l7s;
import xsna.l7v;
import xsna.l8m0;
import xsna.ldl;
import xsna.ll9;
import xsna.lz;
import xsna.m7m;
import xsna.mag;
import xsna.mak;
import xsna.msy;
import xsna.myh;
import xsna.n2k0;
import xsna.ncg;
import xsna.nef;
import xsna.neu;
import xsna.nf9;
import xsna.nha0;
import xsna.nht;
import xsna.nm3;
import xsna.np1;
import xsna.nwk;
import xsna.o0q0;
import xsna.o4t;
import xsna.ocg;
import xsna.oeu;
import xsna.on00;
import xsna.ozh;
import xsna.ozl;
import xsna.p3h;
import xsna.p3t;
import xsna.p3u0;
import xsna.p70;
import xsna.p870;
import xsna.peu;
import xsna.pla;
import xsna.pn00;
import xsna.pvh;
import xsna.q5f;
import xsna.q7;
import xsna.qaa0;
import xsna.qbj;
import xsna.qeu;
import xsna.qfa0;
import xsna.qv20;
import xsna.r0g;
import xsna.r34;
import xsna.r3t;
import xsna.r3u0;
import xsna.r4p;
import xsna.r5i;
import xsna.r870;
import xsna.rdi;
import xsna.reu;
import xsna.rwi;
import xsna.s3q0;
import xsna.s4p;
import xsna.s4t;
import xsna.sdr;
import xsna.seu;
import xsna.sim;
import xsna.t3h;
import xsna.t4t;
import xsna.t61;
import xsna.t7a0;
import xsna.tax;
import xsna.teu;
import xsna.tme;
import xsna.tul0;
import xsna.tvo;
import xsna.u3p0;
import xsna.ua0;
import xsna.ueu;
import xsna.ujf0;
import xsna.uva;
import xsna.ux00;
import xsna.v3t;
import xsna.veu;
import xsna.vff;
import xsna.vg0;
import xsna.vl0;
import xsna.vsj0;
import xsna.vua0;
import xsna.w0g;
import xsna.w3t;
import xsna.w8i;
import xsna.weu;
import xsna.wje;
import xsna.wjf0;
import xsna.wpg;
import xsna.wzs;
import xsna.x2u0;
import xsna.x3i;
import xsna.x3t;
import xsna.x5i;
import xsna.xa4;
import xsna.xcd;
import xsna.xeu;
import xsna.xn;
import xsna.xne0;
import xsna.xpn0;
import xsna.xqf;
import xsna.xt9;
import xsna.xwq;
import xsna.xy9;
import xsna.y000;
import xsna.y2g;
import xsna.y3i;
import xsna.y3t;
import xsna.y8g0;
import xsna.ya0;
import xsna.yeu;
import xsna.yf7;
import xsna.ysd;
import xsna.yz10;
import xsna.z2t;
import xsna.z3t;
import xsna.z4f;
import xsna.zlw;

/* compiled from: GalleryFragmentImpl.kt */
/* loaded from: classes15.dex */
public class GalleryFragmentImpl extends FragmentImpl implements p3t, iin0, tvo.a, nht, w8i, o0q0 {
    public static final /* synthetic */ int R0 = 0;
    public em6 A0;
    public MediaStoreEntry B0;
    public final Object C0;
    public final HashMap<Uri, Integer> D0;
    public LinkedHashMap E0;
    public final Object F0;
    public final Object G0;
    public final Object H0;
    public final bpn0 I0;
    public StoryCameraParams J0;
    public gzs<s3q0> K0;
    public izs<? super List<? extends MediaStoreEntry>, s3q0> L0;
    public gzs<s3q0> M0;
    public final bpn0 N;
    public gzs<s3q0> N0;
    public final qaa0 O;
    public xwq O0;
    public int P;
    public Bundle P0;
    public com.vk.attachpicker.b Q;
    public final Object Q0;
    public t4t R;
    public final r3t S;
    public xne0 T;
    public final hne0 U;
    public List<? extends r3u0> V;
    public final io.reactivex.rxjava3.disposables.b W;
    public u3p0 X;
    public h Y;
    public ContextProgressView Z;
    public GalleryRecyclerView a0;
    public fm1 b0;
    public PhotoSmallAdapter c0;
    public ujf0 d0;
    public im1 e0;
    public com.vk.lists.c f0;
    public o4t g0;
    public xpn0 h0;
    public dqn0 i0;
    public mak j0;
    public boolean k0;
    public boolean l0;
    public int m0;
    public hb0<nha0> n0;
    public b470 o0;
    public e5t p0;
    public b5t q0;
    public final gmj r0;
    public final Object s0;
    public boolean t0;
    public boolean u0;
    public FastScroller v0;
    public final Pair<Integer, Boolean> w0;
    public final rdi x0;
    public final boolean y0;
    public final boolean z0;

    /* compiled from: GalleryFragmentImpl.kt */
    public final class a {
        public final dqn0 a;

        public a(dqn0 dqn0Var) {
            this.a = dqn0Var;
        }
    }

    /* compiled from: GalleryFragmentImpl.kt */
    public static final class b {
        /* JADX WARN: Multi-variable type inference failed */
        @ozl
        public static void a(Activity activity, Intent intent, gzs gzsVar) {
            Iterable iterable;
            if (activity instanceof h2d0) {
                Uri uri = (Uri) intent.getParcelableExtra("ProcessedImage");
                if (uri != null) {
                    h2d0 h2d0Var = (h2d0) activity;
                    String lastPathSegment = uri.getLastPathSegment();
                    h2d0Var.qm(pn00.i(new Pair(lastPathSegment != null ? lastPathSegment : "", null)));
                    gzsVar.invoke();
                    return;
                }
                Bundle bundleExtra = intent.getBundleExtra("result_attachments");
                if (bundleExtra == null || (iterable = bundleExtra.getParcelableArrayList("result_files")) == null) {
                    iterable = EmptyList.b;
                }
                Iterable iterable2 = iterable;
                ArrayList arrayList = new ArrayList(c5g.u(iterable2, 10));
                Iterator it = iterable2.iterator();
                while (it.hasNext()) {
                    String lastPathSegment2 = ((Uri) it.next()).getLastPathSegment();
                    if (lastPathSegment2 == null) {
                        lastPathSegment2 = "";
                    }
                    arrayList.add(lastPathSegment2);
                }
                HashMap hashMap = new HashMap(arrayList.size());
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    hashMap.put((String) it2.next(), null);
                }
                ((h2d0) activity).qm(hashMap);
                gzsVar.invoke();
            }
        }
    }

    /* compiled from: GalleryFragmentImpl.kt */
    public final class c {
        public final PhotoSmallAdapter a;
        public final fm1 b;

        public c(PhotoSmallAdapter photoSmallAdapter, fm1 fm1Var) {
            this.a = photoSmallAdapter;
            this.b = fm1Var;
        }

        public final void a(List<? extends MediaStoreEntry> list, boolean z) {
            o4t o4tVar;
            p pVar;
            GalleryFragmentImpl galleryFragmentImpl = GalleryFragmentImpl.this;
            o4t o4tVar2 = galleryFragmentImpl.g0;
            if (o4tVar2 == null || !o4tVar2.isShowing() || (o4tVar = galleryFragmentImpl.g0) == null || (pVar = o4tVar.m) == null) {
                return;
            }
            ArrayList<MediaStoreEntry> arrayList = pVar.D;
            PagerAdapter r = pVar.S.r();
            if (r != null) {
                if (z) {
                    arrayList.addAll(list);
                } else {
                    arrayList.addAll(0, list);
                }
                r.notifyDataSetChanged();
            }
        }

        public final void b(List<? extends MediaStoreEntry> list, boolean z, boolean z2) {
            List<MediaStoreEntry> list2;
            List<MediaStoreEntry> list3;
            boolean z3 = false;
            d(false);
            AlbumEntry b = this.b.b();
            List<? extends MediaStoreEntry> list4 = list;
            boolean isEmpty = list4.isEmpty();
            PhotoSmallAdapter photoSmallAdapter = this.a;
            if (!isEmpty) {
                e(photoSmallAdapter, list, z && z2);
            } else if (b != null && (list2 = b.d) != null && (!list2.isEmpty()) && photoSmallAdapter.E0() == 0) {
                e(photoSmallAdapter, list2, z && z2);
            } else if (photoSmallAdapter.I()) {
                photoSmallAdapter.q = true;
                photoSmallAdapter.N0(EmptyList.b);
            } else if (list.isEmpty() && z) {
                photoSmallAdapter.N0(EmptyList.b);
            }
            e5t e5tVar = GalleryFragmentImpl.this.p0;
            if (e5tVar != null) {
                if (!list4.isEmpty() || (b != null && (list3 = b.d) != null && (!list3.isEmpty()))) {
                    z3 = true;
                }
                e5tVar.d = z3;
            }
        }

        public final void c(Throwable th) {
            L.g("Failed to load gallery data", th);
            d(false);
        }

        public final void d(boolean z) {
            GalleryFragmentImpl galleryFragmentImpl = GalleryFragmentImpl.this;
            ContextProgressView contextProgressView = galleryFragmentImpl.Z;
            if (contextProgressView != null) {
                contextProgressView.setVisibility(!z ? 4 : 0);
            }
            GalleryRecyclerView galleryRecyclerView = galleryFragmentImpl.a0;
            if (galleryRecyclerView != null) {
                galleryRecyclerView.setVisibility(z ? 4 : 0);
            }
        }

        public final void e(PhotoSmallAdapter photoSmallAdapter, List<? extends MediaStoreEntry> list, boolean z) {
            int i = GalleryFragmentImpl.R0;
            if (com.vk.toggle.b.A.a(ClipsFeatures.CLIPS_ENABLE_TWO_WAY_PAGINATION)) {
                a(list, z);
            } else {
                a(list, true);
            }
            photoSmallAdapter.q = false;
            if (z) {
                photoSmallAdapter.N0(list);
            } else {
                if (list == null) {
                    return;
                }
                photoSmallAdapter.c.n0(list);
            }
        }
    }

    /* compiled from: GalleryFragmentImpl.kt */
    public static final /* synthetic */ class d {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[PhotoSmallAdapter.PreviewType.values().length];
            try {
                iArr[PhotoSmallAdapter.PreviewType.Long.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PhotoSmallAdapter.PreviewType.Preview15.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[PhotoSmallAdapter.PreviewType.Short.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[PhotoSmallAdapter.PreviewType.Default.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* compiled from: GalleryFragmentImpl.kt */
    public static final class e {
        public e() {
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [xsna.em6, xsna.s4p] */
        public final s4p a() {
            return GalleryFragmentImpl.this.A0;
        }
    }

    /* compiled from: GalleryFragmentImpl.kt */
    public static final class f<O> implements ua0 {
        public final /* synthetic */ b470 b;
        public final /* synthetic */ GalleryFragmentImpl c;

        public f(b470 b470Var, GalleryFragmentImpl galleryFragmentImpl) {
            this.b = b470Var;
            this.c = galleryFragmentImpl;
        }

        @Override // xsna.ua0
        public final void onActivityResult(Object obj) {
            if (obj != null) {
                b470 b470Var = this.b;
                b470Var.a(obj);
                GalleryFragmentImpl galleryFragmentImpl = this.c;
                Intent b = b470Var.b(galleryFragmentImpl.requireContext());
                new Handler(Looper.getMainLooper()).post(new w3t(0, cuz.a(galleryFragmentImpl.kn()), b));
            }
        }
    }

    /* compiled from: GalleryFragmentImpl.kt */
    public static final class g {
        public final /* synthetic */ com.vk.lists.c a;
        public final /* synthetic */ GalleryFragmentImpl b;

        public g(com.vk.lists.c cVar, GalleryFragmentImpl galleryFragmentImpl) {
            this.a = cVar;
            this.b = galleryFragmentImpl;
        }
    }

    public GalleryFragmentImpl() {
        bpn0 bpn0Var = new bpn0(new fbh(this, 19));
        this.N = new bpn0(new qbj(this, 11));
        qaa0 qaa0Var = new qaa0((qfa0.f) bpn0Var.getValue());
        this.O = qaa0Var;
        this.R = t4t.J;
        this.S = new r3t(qaa0Var, ((StoryViewerComponent) ((k7m) m7m.f(this)).a(fpf0.a(StoryViewerComponent.class))).l9());
        this.U = r870.a().d();
        this.W = new io.reactivex.rxjava3.disposables.b();
        boolean z = true;
        this.k0 = true;
        this.q0 = new jfl();
        this.r0 = new gmj(this, 14);
        mag magVar = new mag(this, 24);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.s0 = msy.a(lazyThreadSafetyMode, magVar);
        this.w0 = new Pair<>(-1, Boolean.FALSE);
        this.x0 = new rdi();
        this.y0 = gz80.a(33);
        if (!BuildInfo.t() && !BuildInfo.s()) {
            z = false;
        }
        this.z0 = z;
        this.C0 = msy.a(lazyThreadSafetyMode, new dgm(this, 9));
        this.D0 = new HashMap<>();
        this.F0 = msy.a(lazyThreadSafetyMode, new cfl(this, 10));
        this.G0 = msy.a(lazyThreadSafetyMode, new t61(25));
        this.H0 = msy.a(lazyThreadSafetyMode, new ncg(this, 23));
        this.I0 = new bpn0(new r5i(this, 17));
        this.Q0 = msy.a(lazyThreadSafetyMode, new ocg(this, 25));
    }

    public static final void eo(GalleryFragmentImpl galleryFragmentImpl, Integer num, MediaStoreEntry mediaStoreEntry) {
        galleryFragmentImpl.getClass();
        if (num != null) {
            int intValue = num.intValue();
            PhotoSmallAdapter photoSmallAdapter = galleryFragmentImpl.c0;
            boolean z = false;
            int K0 = intValue - (photoSmallAdapter != null ? photoSmallAdapter.K0() : 0);
            com.vk.attachpicker.b bVar = galleryFragmentImpl.Q;
            if (bVar != null && bVar.q(mediaStoreEntry)) {
                z = true;
            }
            com.vk.attachpicker.b bVar2 = galleryFragmentImpl.Q;
            if (bVar2 != null) {
                bVar2.f(K0, null, mediaStoreEntry);
            }
            if (z) {
                p870.f().c(1);
                PhotoSmallAdapter photoSmallAdapter2 = galleryFragmentImpl.c0;
                if (photoSmallAdapter2 != null) {
                    photoSmallAdapter2.notifyItemChanged(num.intValue());
                }
            }
        }
    }

    @Override // xsna.p3t
    public final void C7(MediaStoreEntry mediaStoreEntry, izs<? super Intent, s3q0> izsVar, izs<? super Long, s3q0> izsVar2) {
        if (mediaStoreEntry instanceof MediaStoreVideoEntry) {
            t4t t4tVar = this.R;
            t4t a2 = t4tVar.E.e ? t4t.a(t4tVar, null, -41) : null;
            o4t o4tVar = this.g0;
            if (o4tVar != null) {
                o4tVar.b(((MediaStoreVideoEntry) mediaStoreEntry).k, new b8k(izsVar, 1), a2, izsVar2);
            }
        }
    }

    @Override // xsna.p3t
    public final void D3(int i) {
        this.P = i;
    }

    @Override // xsna.p3t
    public final void D4(izs<? super List<? extends MediaStoreEntry>, s3q0> izsVar) {
        this.L0 = izsVar;
    }

    @Override // xsna.p3t
    public final void E7() {
        com.vk.attachpicker.b bVar = this.Q;
        if (bVar != null) {
            bVar.clear();
        }
    }

    @Override // xsna.nht
    public final void K0(int i, String[] strArr) {
        this.S.h(requireContext());
        h hVar = this.Y;
        if (hVar == null || hVar.a() == null) {
            return;
        }
        hVar.g.K0(i, strArr);
    }

    @Override // com.vk.core.fragments.FragmentImpl
    public final void Mf(int i, Intent intent) {
        boolean z;
        gzs<s3q0> gzsVar;
        Bundle bundleExtra;
        Bundle bundleExtra2;
        String stringExtra = intent != null ? intent.getStringExtra("SYSTEM_MEDIA_INTERACTOR_TYPE") : null;
        boolean z2 = this.z0 && epx.f(stringExtra, "SystemCameraInteractor");
        if (BuildInfo.t() || BuildInfo.s()) {
            Context context = e43.a;
            if (context == null) {
                context = null;
            }
            z = Preference.g(context).getBoolean("saveProcessedImage", true);
        } else {
            z = true;
        }
        boolean z3 = ((z || z2 || this.R.E.c) || !(intent != null ? intent.getBooleanExtra("ImageWasChanged", false) : false)) && this.R.E.b;
        boolean f2 = epx.f(stringExtra, "SimpleSystemGalleryInteractor");
        Boolean valueOf = (intent == null || (bundleExtra2 = intent.getBundleExtra("result_attachments")) == null) ? null : Boolean.valueOf(bundleExtra2.getBoolean("result_clips_camera"));
        Boolean valueOf2 = (intent == null || (bundleExtra = intent.getBundleExtra("result_attachments")) == null) ? null : Boolean.valueOf(bundleExtra.getBoolean("result_story_camera"));
        if (z3 && intent != null && (!f2 || z2)) {
            ko(intent, null, new xqf(this, 23));
            return;
        }
        Boolean bool = Boolean.TRUE;
        if ((epx.f(valueOf, bool) || epx.f(valueOf2, bool)) && (gzsVar = this.M0) != null) {
            gzsVar.invoke();
        }
        if (this.R.E.i && f2) {
            xwq xwqVar = this.O0;
            if (xwqVar != null) {
                xwqVar.invoke(7321, -1, intent);
            }
            o4t o4tVar = this.g0;
            if (o4tVar != null) {
                o4tVar.d().onDismiss();
                return;
            }
            return;
        }
        j34 a2 = rwi.d().p().a(this);
        if (a2 != null) {
            a2.V2(intent);
            return;
        }
        if (i != -1) {
            super.Mf(i, intent);
            return;
        }
        FragmentActivity activity = getActivity();
        PhotoVideoAttachActivity photoVideoAttachActivity = activity instanceof PhotoVideoAttachActivity ? (PhotoVideoAttachActivity) activity : null;
        if (photoVideoAttachActivity != null) {
            photoVideoAttachActivity.V2(intent);
        } else {
            super.Mf(i, intent);
        }
    }

    @Override // xsna.p3t
    public final void Q7(MediaStoreEntry mediaStoreEntry) {
        this.r0.invoke(mediaStoreEntry);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.p3t
    public final void Qg(int i, Integer num) {
        Window window;
        FragmentActivity kn = kn();
        bpn0 bpn0Var = this.I0;
        if (bpn0Var.isInitialized() && ((com.vk.core.simplescreen.a) bpn0Var.getValue()).isShowing()) {
            window = ((com.vk.core.simplescreen.a) bpn0Var.getValue()).getWindow();
            if (window == null) {
                window = kn.getWindow();
            }
        } else {
            window = kn.getWindow();
        }
        String e2 = y8g0.e(i);
        l7s u = bwt0.u(kn);
        ikv0.a aVar = new ikv0.a(u);
        aVar.u = new ikv0.d(e2, (String) null, (ikv0.d.a) (0 == true ? 1 : 0), 6);
        if (num != null) {
            aVar.s = new ikv0.e.a(Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE, u.getString(num.intValue()), new amp(4));
        }
        aVar.j = false;
        aVar.i = FloatingViewGesturesHelper.SwipeDirection.Horizontal;
        aVar.e = 3000L;
        if (this.P == 0) {
            this.P = this.q0.g();
        }
        aVar.o = Integer.valueOf(this.q0.h() + this.P);
        aVar.p(window);
    }

    @Override // xsna.p3t
    public final void R3(HashMap hashMap, gzs gzsVar) {
        this.E0 = new LinkedHashMap(hashMap);
        no(gzsVar);
    }

    @Override // xsna.p3t
    public final void V8(int i) {
        GalleryRecyclerView galleryRecyclerView = this.a0;
        if (galleryRecyclerView != null) {
            mo(galleryRecyclerView, i);
        }
        FastScroller fastScroller = this.v0;
        if (fastScroller != null) {
            f4m.q(i, fastScroller);
        }
    }

    @Override // xsna.iin0
    public final ViewGroup Wj(Context context) {
        fm1 fm1Var;
        u3p0 u3p0Var = this.X;
        if (u3p0Var == null) {
            GalleryPickerSourceConfiguration galleryPickerSourceConfiguration = this.R.E;
            if (galleryPickerSourceConfiguration.h || galleryPickerSourceConfiguration.i) {
                context = bwt0.u(context);
            }
            Context context2 = context;
            String str = this.R.g;
            dhr0 dhr0Var = dhr0.a;
            l5t i = this.q0.i();
            u3p0 u3p0Var2 = new u3p0(context2, str, dhr0Var, i, new p3h(this, 20), new nwk(this, 9), new cnh(this, 11), new cws(this, 1));
            CustomSpinner customSpinner = u3p0Var2.c;
            if (customSpinner != null && (fm1Var = this.b0) != null) {
                fm1Var.a(customSpinner);
            }
            i.c(u3p0Var2.b);
            this.X = u3p0Var2;
            u3p0Var = u3p0Var2;
        }
        return u3p0Var.b;
    }

    @Override // xsna.p3t
    public final boolean Wm() {
        FragmentActivity kn = kn();
        com.vk.attachpicker.b bVar = this.Q;
        List b2 = bVar != null ? bVar.b() : EmptyList.b;
        t4t t4tVar = this.R;
        return r34.a(kn, b2, t4tVar.d, t4tVar.e);
    }

    @Override // xsna.p3t
    public final void Zk() {
        if (this.l0) {
            return;
        }
        this.l0 = true;
        ho();
    }

    @Override // xsna.p3t
    public final void ef(gzs<s3q0> gzsVar) {
        this.K0 = gzsVar;
    }

    public p.d fo() {
        return null;
    }

    @Override // xsna.o0q0
    public final Fragment getUiTrackingFragment() {
        if (this.R.E.h) {
            return null;
        }
        return this;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final com.vk.core.simplescreen.a go() {
        return (com.vk.core.simplescreen.a) this.C0.getValue();
    }

    public final void ho() {
        h hVar;
        if (!this.k0 || (hVar = this.Y) == null) {
            return;
        }
        boolean z = this.l0;
        y000 y000Var = hVar.b;
        FragmentActivity a2 = hVar.a();
        y000Var.getClass();
        if ((!(a2 instanceof f44) || z) && !hVar.f.a()) {
            hVar.h.post(new hod(hVar, 9));
        }
    }

    @Override // xsna.p3t
    public final void i9(gzs<s3q0> gzsVar) {
        this.N0 = gzsVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:109:0x0208, code lost:
    
        if (r13 != null) goto L144;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:105:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0226  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x025f  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x02d1  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x02e5  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x02fc  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x02f6 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:164:0x02d5  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0205 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v7, types: [xsna.g760] */
    /* JADX WARN: Type inference failed for: r1v9, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r32v2, types: [java.lang.Throwable] */
    @Override // xsna.p3t
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void ij(List<? extends MediaStoreEntry> list, Bundle bundle, wzs<? super MediaStoreEntry, ? super Bundle, s3q0> wzsVar) {
        float i;
        f0g f0gVar;
        Iterator it;
        Iterator it2;
        Object obj;
        CollageAspectRatioFormat collageAspectRatioFormat;
        String D;
        Iterator it3;
        Object obj2;
        String D2;
        Float l;
        String D3;
        Float l2;
        String D4;
        Object obj3;
        com.vk.attachpicker.b bVar;
        MediaStoreEntry l3;
        e3t e3tVar = (e3t) this.Q0.getValue();
        Bundle bundle2 = bundle == null ? this.P0 : bundle;
        e eVar = e3tVar.a;
        GalleryFragmentImpl galleryFragmentImpl = GalleryFragmentImpl.this;
        com.vk.attachpicker.screen.f fVar = null;
        e4p e4pVar = null;
        fVar = null;
        if (eVar.a() == null) {
            MediaStoreEntry mediaStoreEntry = (MediaStoreEntry) j5g.Y(list);
            zlw zlwVar = new zlw(mediaStoreEntry);
            List<? extends MediaStoreEntry> list2 = list;
            int i2 = 0;
            if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                Iterator it4 = list2.iterator();
                while (it4.hasNext()) {
                    if (!h.a.a(new g4p(new zlw((MediaStoreEntry) it4.next()).a()))) {
                        cvk.u(R.string.picker_image_format_invalid, false);
                        break;
                    }
                }
            }
            com.vk.attachpicker.b bVar2 = galleryFragmentImpl.Q;
            if (bVar2 != null && bVar2.u(mediaStoreEntry) && (bVar = galleryFragmentImpl.Q) != null && (l3 = bVar.l(mediaStoreEntry)) != null) {
                mediaStoreEntry = l3;
            }
            com.vk.attachpicker.b bVar3 = galleryFragmentImpl.Q;
            Object g2 = bVar3 != null ? bVar3.g(mediaStoreEntry) : null;
            r4p r4pVar = g2 instanceof r4p ? (r4p) g2 : null;
            if (r4pVar == null) {
                String path = mediaStoreEntry.f().getPath();
                if (path == null) {
                    path = "";
                }
                r4pVar = new r4p(new i4p(new g4p(path), (e4p) null, 6), jgp.b);
            }
            String string = bundle2 != null ? bundle2.getString("COLLAGE_JSON") : null;
            JSONObject jSONObject = string != null ? new JSONObject(string) : null;
            String D5 = jSONObject != null ? f370.D(jSONObject, "grid") : null;
            w0g w0gVar = neu.a;
            if (!epx.f(D5, "Grid1")) {
                w0gVar = peu.a;
                if (!epx.f(D5, "Grid2Vertical")) {
                    w0gVar = oeu.a;
                    if (!epx.f(D5, "Grid2Horizontal")) {
                        w0gVar = veu.a;
                        if (!epx.f(D5, "Grid3Vertical")) {
                            w0gVar = reu.a;
                            if (!epx.f(D5, "Grid3Horizontal")) {
                                w0gVar = teu.a;
                                if (!epx.f(D5, "Grid3Right")) {
                                    w0gVar = seu.a;
                                    if (!epx.f(D5, "Grid3Left")) {
                                        w0gVar = ueu.a;
                                        if (!epx.f(D5, "Grid3Top")) {
                                            w0gVar = qeu.a;
                                            if (!epx.f(D5, "Grid3Bottom")) {
                                                w0gVar = weu.a;
                                                if (!epx.f(D5, "Grid4")) {
                                                    w0gVar = xeu.a;
                                                    if (!epx.f(D5, "Grid4Shift1")) {
                                                        w0gVar = yeu.a;
                                                        if (!epx.f(D5, "Grid4Shift2")) {
                                                            w0gVar = null;
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
                }
            }
            if (w0gVar == null) {
                int size = list.size();
                w0gVar = (size == 1 || size == 2) ? peu.a : size != 3 ? weu.a : reu.a;
            }
            w0g w0gVar2 = w0gVar;
            if (jSONObject != null && (D4 = f370.D(jSONObject, "format")) != null) {
                Iterator it5 = CollageAspectRatioFormat.h().iterator();
                while (true) {
                    if (it5.hasNext()) {
                        obj3 = it5.next();
                        if (epx.f(((CollageAspectRatioFormat) obj3).getId(), D4)) {
                            break;
                        }
                    } else {
                        obj3 = null;
                        break;
                    }
                }
                CollageAspectRatioFormat collageAspectRatioFormat2 = (CollageAspectRatioFormat) obj3;
                if (collageAspectRatioFormat2 != null) {
                    i = collageAspectRatioFormat2.i();
                    float floatValue = (jSONObject != null || (D3 = f370.D(jSONObject, "borderWidth")) == null || (l2 = arm0.l(D3)) == null) ? 0.0f : l2.floatValue();
                    float floatValue2 = (jSONObject != null || (D2 = f370.D(jSONObject, "cornerRadius")) == null || (l = arm0.l(D2)) == null) ? 0.0f : l.floatValue();
                    if (jSONObject != null && (D = f370.D(jSONObject, "borderColor")) != null) {
                        it3 = h0g.a.iterator();
                        while (true) {
                            if (!it3.hasNext()) {
                                obj2 = it3.next();
                                if (epx.f(((f0g) obj2).a, D)) {
                                    break;
                                }
                            } else {
                                obj2 = null;
                                break;
                            }
                        }
                        f0gVar = (f0g) obj2;
                    }
                    f0gVar = f0g.e;
                    f0g f0gVar2 = f0gVar;
                    ArrayList arrayList = new ArrayList(c5g.u(list2, 10));
                    it = list2.iterator();
                    while (it.hasNext()) {
                        String path2 = ((MediaStoreEntry) it.next()).f().getPath();
                        if (path2 == null) {
                            path2 = "";
                        }
                        arrayList.add(new g4p(path2));
                    }
                    List<n2k0> list3 = r0g.a;
                    List H0 = j5g.H0(arrayList, list3.size());
                    ArrayList arrayList2 = new ArrayList(c5g.u(H0, 10));
                    for (Object obj4 : H0) {
                        int i3 = i2 + 1;
                        if (i2 < 0) {
                            ?? r32 = e4pVar;
                            e43.t();
                            throw r32;
                        }
                        e4p e4pVar2 = (e4p) obj4;
                        n2k0 n2k0Var = list3.get(i2);
                        w0g.a aVar = w0gVar2.a().get(n2k0Var);
                        float f2 = aVar != null ? aVar.b : 0.0f;
                        float f3 = aVar != null ? aVar.c : 0.0f;
                        float f4 = 1.0f;
                        e4p e4pVar3 = e4pVar;
                        float f5 = aVar != null ? aVar.d : 1.0f;
                        if (aVar != null) {
                            f4 = aVar.e;
                        }
                        arrayList2.add(new Pair(n2k0Var, new c2g(f2, f3, f5, f4, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, e4pVar2)));
                        e4pVar = e4pVar3;
                        i2 = i3;
                    }
                    e4p e4pVar4 = e4pVar;
                    Map s = pn00.s(arrayList2);
                    c2g c2gVar = (c2g) s.get(h2k0.a);
                    e4p e4pVar5 = c2gVar == null ? c2gVar.i : e4pVar4;
                    it2 = CollageAspectRatioFormat.h().iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            obj = e4pVar4;
                            break;
                        }
                        Object next = it2.next();
                        if (((CollageAspectRatioFormat) next).i() == i) {
                            obj = next;
                            break;
                        }
                    }
                    collageAspectRatioFormat = (CollageAspectRatioFormat) obj;
                    if (collageAspectRatioFormat == null) {
                        collageAspectRatioFormat = CollageAspectRatioFormat.CollageOriginal;
                    }
                    CollageAspectRatioFormat collageAspectRatioFormat3 = collageAspectRatioFormat;
                    fVar = new com.vk.attachpicker.screen.f(zlwVar, new r4p(i4p.a(r4pVar.a, Float.valueOf(collageAspectRatioFormat3.i())), on00.f(new Pair(y2g.a, new bc0(e4pVar5, w0gVar2, collageAspectRatioFormat3, floatValue, floatValue2, f0gVar2, new g2g(s))))), ((c6a0) galleryFragmentImpl.F0.getValue()).a(), new d3t(e3tVar, wzsVar));
                }
            }
            i = CollageAspectRatioFormat.Collage9X16.i();
            if (jSONObject != null) {
            }
            if (jSONObject != null) {
            }
            if (jSONObject != null) {
                it3 = h0g.a.iterator();
                while (true) {
                    if (!it3.hasNext()) {
                    }
                }
                f0gVar = (f0g) obj2;
            }
            f0gVar = f0g.e;
            f0g f0gVar22 = f0gVar;
            ArrayList arrayList3 = new ArrayList(c5g.u(list2, 10));
            it = list2.iterator();
            while (it.hasNext()) {
            }
            List<n2k0> list32 = r0g.a;
            List H02 = j5g.H0(arrayList3, list32.size());
            ArrayList arrayList22 = new ArrayList(c5g.u(H02, 10));
            while (r3.hasNext()) {
            }
            e4p e4pVar42 = e4pVar;
            Map s2 = pn00.s(arrayList22);
            c2g c2gVar2 = (c2g) s2.get(h2k0.a);
            if (c2gVar2 == null) {
            }
            it2 = CollageAspectRatioFormat.h().iterator();
            while (true) {
                if (it2.hasNext()) {
                }
            }
            collageAspectRatioFormat = (CollageAspectRatioFormat) obj;
            if (collageAspectRatioFormat == null) {
            }
            CollageAspectRatioFormat collageAspectRatioFormat32 = collageAspectRatioFormat;
            fVar = new com.vk.attachpicker.screen.f(zlwVar, new r4p(i4p.a(r4pVar.a, Float.valueOf(collageAspectRatioFormat32.i())), on00.f(new Pair(y2g.a, new bc0(e4pVar5, w0gVar2, collageAspectRatioFormat32, floatValue, floatValue2, f0gVar22, new g2g(s2))))), ((c6a0) galleryFragmentImpl.F0.getValue()).a(), new d3t(e3tVar, wzsVar));
        }
        if (fVar != null) {
            this.A0 = fVar;
            this.B0 = (MediaStoreEntry) j5g.Y(list);
            ((g760) this.H0.getValue()).a(kn(), fVar, go(), new jpf(this, 24));
        }
    }

    public final void io() {
        RecyclerView recyclerView;
        PhotoSmallAdapter photoSmallAdapter = this.c0;
        if (photoSmallAdapter != null) {
            photoSmallAdapter.B0(jk90.a);
        }
        GalleryRecyclerView galleryRecyclerView = this.a0;
        if (galleryRecyclerView != null && (recyclerView = galleryRecyclerView.getRecyclerView()) != null) {
            recyclerView.invalidateItemDecorations();
            recyclerView.requestLayout();
        }
        FastScroller fastScroller = this.v0;
        if (fastScroller != null) {
            fastScroller.l.postDelayed(new kv2(fastScroller, 2), 500L);
        }
        im1 im1Var = this.e0;
        if (im1Var != null) {
            im1Var.a();
        }
        com.vk.lists.c cVar = this.f0;
        if (cVar != null) {
            cVar.o();
        }
        com.vk.lists.c cVar2 = this.f0;
        if (cVar2 != null) {
            cVar2.p(false);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0024, code lost:
    
        if (r3 == null) goto L13;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v7, types: [xsna.em6, xsna.s4p] */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r3v9, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [T, java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r5v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void jo(MediaStoreEntry mediaStoreEntry, Integer num) {
        Integer num2;
        List<Object> y0;
        T t;
        if (this.A0 != null) {
            return;
        }
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        ref$ObjectRef.element = mediaStoreEntry;
        com.vk.attachpicker.b bVar = this.Q;
        if (bVar != null && bVar.u(mediaStoreEntry)) {
            com.vk.attachpicker.b bVar2 = this.Q;
            if (bVar2 != null) {
                MediaStoreEntry l = bVar2.l(mediaStoreEntry);
                t = l;
            }
            t = (MediaStoreEntry) ref$ObjectRef.element;
            ref$ObjectRef.element = t;
        }
        com.vk.attachpicker.b bVar3 = this.Q;
        Object g2 = bVar3 != null ? bVar3.g(mediaStoreEntry) : null;
        r4p r4pVar = g2 instanceof r4p ? (r4p) g2 : null;
        if (num == null) {
            PhotoSmallAdapter photoSmallAdapter = this.c0;
            num2 = (photoSmallAdapter == null || (y0 = photoSmallAdapter.y0()) == null) ? null : Integer.valueOf(((ArrayList) y0).indexOf(ref$ObjectRef.element));
        } else {
            num2 = num;
        }
        if (num2 == null || num2.intValue() < 0) {
            num2 = null;
        }
        zlw zlwVar = new zlw((MediaStoreEntry) ref$ObjectRef.element);
        if (!h.a.a(new g4p(zlwVar.a()))) {
            cvk.u(R.string.picker_image_format_invalid, false);
            return;
        }
        Ref$ObjectRef ref$ObjectRef2 = new Ref$ObjectRef();
        com.vk.attachpicker.b bVar4 = this.Q;
        ?? valueOf = bVar4 != null ? Integer.valueOf(bVar4.d((MediaStoreEntry) ref$ObjectRef.element)) : 0;
        ref$ObjectRef2.element = valueOf;
        if (valueOf != 0 && valueOf.intValue() == -1) {
            ref$ObjectRef2.element = null;
        }
        this.A0 = new com.vk.attachpicker.screen.h(zlwVar, r4pVar, new y3t(this, ref$ObjectRef, num2), new x3t(this, ref$ObjectRef2), this.R.l, go(), ((c6a0) this.F0.getValue()).a(), null, null, this.R.E.j, 384);
        MediaStoreEntry mediaStoreEntry2 = (MediaStoreEntry) ref$ObjectRef.element;
        this.B0 = mediaStoreEntry2;
        this.D0.put(mediaStoreEntry2.f(), num2);
        ?? r1 = this.A0;
        if (r1 != 0) {
            ((g760) this.H0.getValue()).a(kn(), r1, go(), new akh(this, 19));
        }
    }

    @Override // xsna.p3t
    public final void k8(boolean z) {
        this.k0 = z;
    }

    public final void ko(Intent intent, Integer num, gzs<s3q0> gzsVar) {
        Iterable iterable;
        Uri uri = (Uri) intent.getParcelableExtra("ProcessedImage");
        if (uri != null) {
            String lastPathSegment = uri.getLastPathSegment();
            R3(pn00.i(new Pair(lastPathSegment != null ? lastPathSegment : "", num)), new vg0(14));
            gzsVar.invoke();
            return;
        }
        Bundle bundleExtra = intent.getBundleExtra("result_attachments");
        if (bundleExtra == null || (iterable = bundleExtra.getParcelableArrayList("result_files")) == null) {
            iterable = EmptyList.b;
        }
        Iterable iterable2 = iterable;
        ArrayList arrayList = new ArrayList(c5g.u(iterable2, 10));
        Iterator it = iterable2.iterator();
        while (it.hasNext()) {
            String lastPathSegment2 = ((Uri) it.next()).getLastPathSegment();
            if (lastPathSegment2 == null) {
                lastPathSegment2 = "";
            }
            arrayList.add(lastPathSegment2);
        }
        HashMap hashMap = new HashMap(arrayList.size());
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            hashMap.put((String) it2.next(), num);
        }
        R3(hashMap, new vg0(14));
        gzsVar.invoke();
    }

    public com.vk.attachpicker.b lo() {
        com.vk.attachpicker.b cVar;
        Integer d2;
        b.InterfaceC0381b e2 = rwi.d().p().e(this);
        if (e2 == null || (cVar = e2.Yd()) == null) {
            cVar = new com.vk.attachpicker.c();
        }
        Bundle arguments = getArguments();
        if (arguments != null && (d2 = bo8.d(arguments, "total_selection_limit")) != null) {
            ((com.vk.attachpicker.c) cVar).a = d2.intValue();
        }
        return cVar;
    }

    public final void mo(GalleryRecyclerView galleryRecyclerView, int i) {
        RecyclerView recyclerView = galleryRecyclerView.getRecyclerView();
        recyclerView.setClipToPadding(false);
        if (recyclerView.getPaddingBottom() != i) {
            awt0.x(recyclerView, 0, 0, 0, i, 7);
            FastScroller fastScroller = this.v0;
            if (fastScroller != null) {
                f4m.q(i, fastScroller);
            }
        }
    }

    public final void no(gzs<s3q0> gzsVar) {
        Uri f2;
        Context mo2getContext = mo2getContext();
        if (mo2getContext == null) {
            return;
        }
        yz10 a2 = iz10.a(mo2getContext);
        com.vk.attachpicker.b bVar = this.Q;
        this.W.b(a2.d(111, -2, 0, 25).m(asu0.a.d()).subscribe(new xn(new eaa(15, this, gzsVar), 23)));
        if (this.E0 != null) {
            ArrayList arrayList = new ArrayList();
            LinkedHashMap linkedHashMap = this.E0;
            if (linkedHashMap != null) {
                Iterator it = linkedHashMap.entrySet().iterator();
                while (it.hasNext()) {
                    String str = (String) ((Map.Entry) it.next()).getKey();
                    MediaStoreEntry mediaStoreEntry = this.B0;
                    if (epx.f(str, (mediaStoreEntry == null || (f2 = mediaStoreEntry.f()) == null) ? null : f2.getLastPathSegment())) {
                        MediaStoreEntry mediaStoreEntry2 = this.B0;
                        Integer num = this.D0.get(mediaStoreEntry2 != null ? mediaStoreEntry2.f() : null);
                        if (num == null) {
                            num = -1;
                        }
                        if (bVar != null) {
                            int intValue = num.intValue();
                            PhotoSmallAdapter photoSmallAdapter = this.c0;
                            bVar.f(intValue - (photoSmallAdapter != null ? photoSmallAdapter.K0() : 0), null, this.B0);
                        }
                        arrayList.add(str);
                    }
                }
            }
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                String str2 = (String) it2.next();
                LinkedHashMap linkedHashMap2 = this.E0;
                if (linkedHashMap2 != null) {
                }
            }
        }
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onActivityResult(int i, int i2, Intent intent) {
        m mVar;
        Uri withAppendedId;
        String[] strArr;
        Intent intent2;
        WebStoryBox webStoryBox;
        super.onActivityResult(i, i2, intent);
        h hVar = this.Y;
        if (hVar != null && hVar.a() != null) {
            hVar.g.onActivityResult(i, i2, intent);
        }
        em6 em6Var = this.A0;
        String str = null;
        if (em6Var == null) {
            em6Var = null;
        }
        if (em6Var != null && !em6Var.c) {
            em6Var.f(i, intent);
        }
        if (i2 != -1) {
            return;
        }
        o4t o4tVar = this.g0;
        if (o4tVar != null) {
            com.vk.attachpicker.screen.h hVar2 = o4tVar.o;
            if (hVar2 != null) {
                hVar2.f(i, intent);
            } else {
                p pVar = o4tVar.m;
                if (pVar != null) {
                    pVar.f(i, intent);
                }
            }
        }
        if (i == 2241) {
            if (this.R.E.i) {
                xwq xwqVar = this.O0;
                if (xwqVar != null) {
                    xwqVar.invoke(Integer.valueOf(i), Integer.valueOf(i2), intent);
                } else {
                    finish();
                }
            } else {
                eqy<bek0> eqyVar = com.vk.toggle.d.a;
                StoryCameraParams storyCameraParams = this.J0;
                if (storyCameraParams == null || (webStoryBox = storyCameraParams.u) == null || !webStoryBox.Db()) {
                    intent2 = intent;
                } else {
                    intent2 = intent == null ? new Intent() : intent;
                    intent2.putExtra("story_template_finish", true);
                }
                Mf(i2, intent2);
            }
        }
        xpn0 xpn0Var = this.h0;
        if (xpn0Var != null && vua0.s(i)) {
            boolean t = vua0.t(i);
            File l = vua0.l(i);
            if (l == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            f0 c2 = com.vk.core.files.b.c(new com.vk.core.files.b(xpn0Var.h.requireContext().getApplicationContext()), l, t ? ExternalDirType.VIDEO : ExternalDirType.IMAGES, 4);
            int i3 = kwg0.a;
            xpn0Var.j.b(c2.subscribe(new iwg0(), new hwg0()));
            xpn0Var.c(l, t);
            return;
        }
        dqn0 dqn0Var = this.i0;
        if (dqn0Var != null) {
            GalleryFragmentImpl galleryFragmentImpl = dqn0Var.h;
            int i4 = 3;
            int i5 = 2;
            if ((i == 2 || i == 3) && intent != null) {
                Uri data = intent.getData();
                if (data != null) {
                    Context requireContext = galleryFragmentImpl.requireContext();
                    requireContext.grantUriPermission(requireContext.getPackageName(), data, 1);
                }
                FragmentActivity kn = galleryFragmentImpl.kn();
                Integer valueOf = Integer.valueOf(R.string.picker_loading);
                Uri data2 = intent.getData();
                try {
                    if (DocumentsContract.isDocumentUri(kn, data2)) {
                        if ("com.android.externalstorage.documents".equals(data2.getAuthority())) {
                            String[] split = DocumentsContract.getDocumentId(data2).split(StringUtils.PROCESS_POSTFIX_DELIMITER);
                            if ("primary".equalsIgnoreCase(split[0])) {
                                str = Environment.getExternalStorageDirectory() + DomExceptionUtils.SEPARATOR + split[1];
                            }
                        } else {
                            String str2 = "_id=?";
                            if ("com.android.providers.downloads.documents".equals(data2.getAuthority())) {
                                String documentId = DocumentsContract.getDocumentId(data2);
                                String[] split2 = documentId.split(StringUtils.PROCESS_POSTFIX_DELIMITER);
                                String str3 = split2[0];
                                if ("raw".equals(str3)) {
                                    str = split2[1];
                                } else {
                                    if ("msf".equals(str3)) {
                                        withAppendedId = MediaStore.Files.getContentUri(D1.e);
                                        strArr = new String[]{split2[1]};
                                    } else {
                                        withAppendedId = ContentUris.withAppendedId(Uri.parse("content://downloads/public_downloads"), Long.parseLong(documentId));
                                        strArr = null;
                                        str2 = null;
                                    }
                                    str = tax.b(kn, withAppendedId, str2, strArr);
                                }
                            } else if ("com.android.providers.media.documents".equals(data2.getAuthority())) {
                                String[] split3 = DocumentsContract.getDocumentId(data2).split(StringUtils.PROCESS_POSTFIX_DELIMITER);
                                String str4 = split3[0];
                                str = tax.b(kn, "image".equals(str4) ? MediaStore.Images.Media.EXTERNAL_CONTENT_URI : "video".equals(str4) ? MediaStore.Video.Media.EXTERNAL_CONTENT_URI : "audio".equals(str4) ? MediaStore.Audio.Media.EXTERNAL_CONTENT_URI : null, "_id=?", new String[]{split3[1]});
                            }
                        }
                    } else if (HandleInvocationsFromAdViewer.KEY_PRIVACY_UPDATE_CONTENT.equalsIgnoreCase(data2.getScheme())) {
                        str = tax.b(kn, data2, null, null);
                    } else if (X3.i.b.equalsIgnoreCase(data2.getScheme())) {
                        str = data2.getPath();
                    }
                } catch (Exception unused) {
                }
                int i6 = 25;
                if (TextUtils.isEmpty(str)) {
                    com.vk.core.view.components.spinner.c e2 = qv20.e(kn, valueOf);
                    mVar = new m(new n(new io.reactivex.rxjava3.internal.operators.single.b(new vff(kn, data2)).q(asu0.a.c()).m(io.reactivex.rxjava3.android.schedulers.a.b()), new vl0(e2, i6)), new np1(e2, i6));
                } else {
                    File file = new File(str);
                    com.vk.core.view.components.spinner.c e3 = qv20.e(kn, valueOf);
                    mVar = new m(new n(io.reactivex.rxjava3.subjects.c.b(asu0.a, new v(new eqf(file, i4))).m(io.reactivex.rxjava3.android.schedulers.a.b()), new el6(e3, 29)), new nm3(e3, 15));
                }
                dqn0Var.i.b(mVar.m(io.reactivex.rxjava3.android.schedulers.a.b()).subscribe(new a8v(new uva(dqn0Var, i, i5), 21), new ux00(new gy(dqn0Var, 17), i6)));
                return;
            }
        }
        mak makVar = this.j0;
        if (makVar == null || i != 200) {
            return;
        }
        makVar.b.b(makVar.c);
        makVar.a.Mf(-1, intent);
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        super.onAttach(context);
        FragmentActivity activity = getActivity();
        PhotoVideoAttachActivity photoVideoAttachActivity = activity instanceof PhotoVideoAttachActivity ? (PhotoVideoAttachActivity) activity : null;
        if (photoVideoAttachActivity != null) {
            photoVideoAttachActivity.Z = this.r0;
        }
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        WebStoryBox webStoryBox;
        StoryCameraParams storyCameraParams;
        Parcelable parcelable;
        Object parcelable2;
        super.onCreate(bundle);
        this.o = false;
        Bundle arguments = getArguments();
        if (arguments != null) {
            t4t t4tVar = t4t.J;
            boolean z = arguments.getBoolean("prevent_styling", t4tVar.a);
            boolean z2 = arguments.getBoolean("prevent_styling_photo", t4tVar.b);
            boolean z3 = arguments.getBoolean("prevent_styling_video", t4tVar.c);
            long j = arguments.getLong("video_min_length_ms", t4tVar.d);
            long j2 = arguments.getLong("video_max_length_ms", t4tVar.e);
            long j3 = arguments.getLong("story_trim_end_position", t4tVar.f);
            String string = arguments.getString("static_header_title", t4tVar.g);
            boolean z4 = arguments.getBoolean("big_previews", t4tVar.h);
            boolean z5 = arguments.getBoolean("camera_enabled", t4tVar.i);
            boolean z6 = arguments.getBoolean("single_mode", t4tVar.j);
            int i = arguments.getInt("media_type", t4tVar.k);
            boolean z7 = arguments.getBoolean("force_thumb", t4tVar.l);
            boolean z8 = arguments.getBoolean("new_thumb_flow", t4tVar.m);
            long j4 = arguments.getLong("peer_id", t4tVar.n);
            boolean z9 = arguments.getBoolean("long_previews", t4tVar.o);
            boolean z10 = arguments.getBoolean("preview_1_5", t4tVar.p);
            boolean z11 = arguments.getBoolean("short_divider", t4tVar.q);
            boolean z12 = arguments.getBoolean("qr_detection", t4tVar.r);
            boolean z13 = arguments.getBoolean("qr_result", t4tVar.s);
            int i2 = arguments.getInt("contentDuration", t4tVar.t);
            Object obj = arguments.get("video_filtering_mode");
            MediaFilteringStrategy mediaFilteringStrategy = obj instanceof MediaFilteringStrategy ? (MediaFilteringStrategy) obj : null;
            if (mediaFilteringStrategy == null) {
                mediaFilteringStrategy = MediaFilteringStrategy.NONE;
            }
            boolean z14 = arguments.getBoolean("attach_limit_hint", t4tVar.v);
            boolean z15 = arguments.getBoolean("is_fullhd", t4tVar.w);
            boolean z16 = arguments.getBoolean("enable_default_album_entries", t4tVar.x);
            boolean z17 = arguments.getBoolean("enable_orientation_locker", t4tVar.y);
            boolean z18 = arguments.getBoolean("show_story_camera", t4tVar.z);
            boolean z19 = arguments.getBoolean("show_clips_camera", t4tVar.A);
            boolean z20 = arguments.getBoolean("short_previews", t4tVar.B);
            ImageSizeLimits imageSizeLimits = (ImageSizeLimits) arguments.getParcelable("image_size_limits");
            if (imageSizeLimits == null) {
                imageSizeLimits = t4tVar.C;
            }
            ImageSizeLimits imageSizeLimits2 = imageSizeLimits;
            ImageFormatRestrictions imageFormatRestrictions = (ImageFormatRestrictions) arguments.getParcelable("image_format_restrictions");
            if (imageFormatRestrictions == null) {
                imageFormatRestrictions = t4tVar.D;
            }
            ImageFormatRestrictions imageFormatRestrictions2 = imageFormatRestrictions;
            GalleryPickerSourceConfiguration galleryPickerSourceConfiguration = (GalleryPickerSourceConfiguration) arguments.getParcelable("gallery_picker_source_configuration");
            if (galleryPickerSourceConfiguration == null) {
                galleryPickerSourceConfiguration = t4tVar.E;
            }
            this.R = new t4t(z, z2, z3, j, j2, j3, string, z4, z5, z6, i, z7, z8, j4, z9, z10, z11, z12, z13, i2, mediaFilteringStrategy, z14, z15, z16, z17, z18, z19, z20, imageSizeLimits2, imageFormatRestrictions2, galleryPickerSourceConfiguration, bo8.d(arguments, "attach_counter_button_color"), bo8.d(arguments, "initial_padding"), arguments.getBoolean("new_photo_editor_collage_context", false), (GalleryPickerInitialData) arguments.getParcelable("initial_data"));
        }
        t4t t4tVar2 = this.R;
        GalleryPickerSourceConfiguration galleryPickerSourceConfiguration2 = t4tVar2.E;
        r3t r3tVar = this.S;
        r3tVar.e = galleryPickerSourceConfiguration2;
        this.u0 = bundle != null ? bundle.getBoolean("SINGLE_MODE_KEY") : t4tVar2.j;
        eqy<bek0> eqyVar = com.vk.toggle.d.a;
        if (com.vk.toggle.b.A.a(Features.Type.FEATURE_CORE_NO_PERMISSION_PHOTO_PICKER) || this.y0) {
            b470 b470Var = new b470(0);
            b470Var.b = this.R;
            this.o0 = b470Var;
        }
        this.O.b = this.R.E.d;
        Intent intent = kn().getIntent();
        StoryCameraParams storyCameraParams2 = (StoryCameraParams) intent.getParcelableExtra("camera_params");
        if (storyCameraParams2 == null) {
            Bundle arguments2 = getArguments();
            if (arguments2 != null) {
                if (Build.VERSION.SDK_INT >= 33) {
                    parcelable2 = arguments2.getParcelable("camera_params", StoryCameraParams.class);
                    parcelable = (Parcelable) parcelable2;
                } else {
                    Parcelable parcelable3 = arguments2.getParcelable("camera_params");
                    if (!(parcelable3 instanceof StoryCameraParams)) {
                        parcelable3 = null;
                    }
                    parcelable = (StoryCameraParams) parcelable3;
                }
                storyCameraParams2 = (StoryCameraParams) parcelable;
            } else {
                storyCameraParams2 = null;
            }
        }
        this.J0 = storyCameraParams2;
        int i3 = 1;
        if (storyCameraParams2 == null) {
            String stringExtra = intent.getStringExtra("ref");
            String stringExtra2 = intent.getStringExtra("entry_point");
            if (stringExtra == null || stringExtra2 == null) {
                storyCameraParams = null;
            } else {
                StoryCameraMode storyCameraMode = StoryCameraMode.STORY;
                ArrayList q = xa4.q();
                EmptyList emptyList = EmptyList.b;
                UserId userId = UserId.d;
                StoryCameraTarget storyCameraTarget = StoryCameraTarget.UNDEFINED;
                ArrayList arrayList = new ArrayList();
                Iterator it = q.iterator();
                while (it.hasNext()) {
                    Object next = it.next();
                    emptyList.getClass();
                    arrayList.add(next);
                }
                storyCameraParams = new StoryCameraParams(stringExtra, stringExtra2, storyCameraMode, arrayList, null, userId, null, null, null, null, false, false, null, storyCameraTarget, null, 0L, null, null, null, null, null, null, null, null, false, false, false, null, false, false, null, null, null, null, null, null, null, null, null, null, false, true, true, true, true, true, true, false, null, null, null, Boolean.valueOf(!fkq0.b(userId)), null, null, null, null, null, null, null, null, false, false, null, null, null, null, false, null, null, null, null, true, true, true, true, true, null, emptyList, false, null, null);
            }
            this.J0 = storyCameraParams;
        }
        StoryCameraParams storyCameraParams3 = this.J0;
        r3tVar.d = storyCameraParams3;
        GalleryPickerSourceConfiguration galleryPickerSourceConfiguration3 = this.R.E;
        boolean z21 = galleryPickerSourceConfiguration3.e;
        this.q0 = (storyCameraParams3 == null || (webStoryBox = storyCameraParams3.u) == null || !webStoryBox.Db()) ? (galleryPickerSourceConfiguration3.i && z21) ? new k8m0() : z21 ? new l8m0() : galleryPickerSourceConfiguration3.b ? galleryPickerSourceConfiguration3.c ? new l6a0() : new t7a0() : galleryPickerSourceConfiguration3.h ? new tme() : (galleryPickerSourceConfiguration3.f || galleryPickerSourceConfiguration3.g) ? new c9f() : new jfl() : new djm0();
        long j5 = this.R.n;
        this.j0 = new mak(this, r3tVar, j5);
        r3tVar.c.getClass();
        l5a0.e = j5 > 0;
        t4t t4tVar3 = this.R;
        this.V = e43.l(new x2u0(t4tVar3.D), new c3u0(t4tVar3.C));
        k5h k5hVar = new k5h(this, 18);
        int i4 = this.R.k;
        j05 j05Var = new j05(k5hVar, i4);
        Context requireContext = requireContext();
        io.reactivex.rxjava3.disposables.b bVar = new io.reactivex.rxjava3.disposables.b();
        b3t b3tVar = new b3t(new sdr(new Ref$ObjectRef(), bVar, j05Var, i3), (Handler) j05Var.c);
        Iterator it2 = (i4 != 111 ? i4 != 222 ? i4 != 333 ? h020.c : h020.b : h020.a : h020.c).iterator();
        while (it2.hasNext()) {
            requireContext.getContentResolver().registerContentObserver((Uri) it2.next(), true, b3tVar);
        }
        bVar.b(new io.reactivex.rxjava3.disposables.a(new z2t(0, requireContext, b3tVar)));
        this.W.b(bVar);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.picker_fragment_gallery, viewGroup, false);
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        this.W.dispose();
        this.e0 = null;
        this.K0 = null;
        this.L0 = null;
        this.M0 = null;
        this.O0 = null;
        ScreenContainer screenContainer = go().b;
        ArrayList<em6> arrayList = screenContainer.e;
        while (!arrayList.isEmpty()) {
            screenContainer.c((em6) xy9.b(1, arrayList));
        }
        screenContainer.c = null;
        go().dismiss();
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public void onDestroyView() {
        CustomSpinner customSpinner;
        fm1 fm1Var;
        super.onDestroyView();
        PhotoSmallAdapter photoSmallAdapter = this.c0;
        if (photoSmallAdapter != null) {
            photoSmallAdapter.clear();
        }
        this.c0 = null;
        this.b0 = null;
        xne0 xne0Var = this.T;
        if (xne0Var != null) {
            io.reactivex.rxjava3.disposables.c cVar = xne0Var.f;
            if (cVar != null) {
                cVar.dispose();
            }
            ikv0 ikv0Var = xne0Var.i;
            if (ikv0Var != null) {
                ikv0Var.a();
            }
        }
        this.T = null;
        this.Q = null;
        u3p0 u3p0Var = this.X;
        if (u3p0Var != null && (customSpinner = u3p0Var.c) != null && (fm1Var = this.b0) != null) {
            gj1 gj1Var = fm1Var.e;
            gj1Var.e = null;
            fm1Var.f.clear();
            if (customSpinner.getAdapter() == gj1Var) {
                customSpinner.setAdapter((SpinnerAdapter) null);
            }
            if (customSpinner.getOnItemSelectedListener() instanceof fm1.a) {
                customSpinner.setOnItemSelectedListener(null);
            }
        }
        this.X = null;
        this.Y = null;
        this.l0 = false;
        this.Z = null;
        com.vk.attachpicker.b bVar = this.Q;
        if (bVar != null) {
            bVar.m(null);
        }
        com.vk.attachpicker.b bVar2 = this.Q;
        if (bVar2 != null) {
            bVar2.p(null);
        }
        this.S.c.getClass();
        HashSet<Uri> hashSet = l5a0.d;
        ArrayMap<Uri, l5a0.b> arrayMap = l5a0.b;
        if (!arrayMap.isEmpty() || l5a0.c != null || !hashSet.isEmpty()) {
            List<String> list = l5a0.f;
            for (l5a0.b bVar3 : arrayMap.values()) {
                com.vk.metrics.eventtracking.b bVar4 = com.vk.metrics.eventtracking.b.a;
                el3 el3Var = Event.b;
                Event.a aVar = new Event.a();
                aVar.g(Event.b.a("UI.PICKER.SELECTION"));
                aVar.a(Boolean.valueOf(l5a0.e), "for_im");
                aVar.b(X3.i.L, Integer.valueOf(bVar3.c));
                aVar.a(Boolean.valueOf(bVar3.a), "full_view");
                aVar.a(Boolean.valueOf(bVar3.b), "quick");
                com.vk.movika.sdk.base.model.n.c(aVar, list, bVar4);
            }
            if (l5a0.c != null) {
                com.vk.metrics.eventtracking.b bVar5 = com.vk.metrics.eventtracking.b.a;
                el3 el3Var2 = Event.b;
                Event.a aVar2 = new Event.a();
                aVar2.g(Event.b.a("UI.PICKER.EDIT"));
                aVar2.a(Boolean.valueOf(l5a0.e), "for_im");
                Boolean bool = Boolean.FALSE;
                aVar2.a(bool, "saved");
                aVar2.a(bool, SignalingProtocol.KEY_CAMERA);
                aVar2.a(bool, "drawing");
                aVar2.a(bool, "stickers");
                aVar2.a(bool, "text");
                aVar2.a(bool, "filters");
                aVar2.a(bool, "auto_enhance");
                com.vk.movika.sdk.base.model.n.c(aVar2, list, bVar5);
            }
            l5a0 l5a0Var = l5a0.a;
            com.vk.metrics.eventtracking.b bVar6 = com.vk.metrics.eventtracking.b.a;
            el3 el3Var3 = Event.b;
            Event.a aVar3 = new Event.a();
            aVar3.g(Event.b.a("UI.PICKER.FULL_VIEW"));
            aVar3.a(Boolean.valueOf(l5a0.e), "for_im");
            aVar3.b("count", Integer.valueOf(hashSet.size()));
            aVar3.j(list);
            bVar6.k(aVar3.e());
            arrayMap.clear();
            hashSet.clear();
            l5a0.c = null;
        }
        com.vk.lists.c cVar2 = this.f0;
        if (cVar2 != null) {
            cVar2.v();
        }
        this.f0 = null;
        this.a0 = null;
        o4t o4tVar = this.g0;
        if (o4tVar != null && o4tVar.b.isInitialized()) {
            ScreenContainer screenContainer = o4tVar.d().b;
            ArrayList<em6> arrayList = screenContainer.e;
            while (!arrayList.isEmpty()) {
                screenContainer.c((em6) xy9.b(1, arrayList));
            }
            screenContainer.c = null;
            o4tVar.d().dismiss();
        }
        this.g0 = null;
        this.p0 = null;
        PhotoSmallAdapter photoSmallAdapter2 = this.c0;
        ujf0 ujf0Var = this.d0;
        if (photoSmallAdapter2 != null && ujf0Var != null) {
            photoSmallAdapter2.unregisterAdapterDataObserver(ujf0Var);
        }
        this.d0 = null;
        if (this.R.E.e) {
            Pair<Integer, Boolean> pair = this.w0;
            if (pair.i().intValue() != -1) {
                nf9 nf9Var = nf9.b;
                Boolean j = pair.j();
                j.getClass();
                int intValue = pair.i().intValue();
                nf9.b(nf9Var, StoryPublishEvent.SCROLL, null, null, null, false, null, Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE).e();
                com.vk.metrics.eventtracking.b bVar7 = com.vk.metrics.eventtracking.b.a;
                el3 el3Var4 = Event.b;
                Event.a aVar4 = new Event.a();
                aVar4.g("SCROLL");
                aVar4.a(j, "by_scrollbar");
                aVar4.b("last_visible_item", Integer.valueOf(intValue));
                bVar7.k(aVar4.e());
            }
        }
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onDetach() {
        super.onDetach();
        this.X = null;
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onPause() {
        em6 currentScreen;
        super.onPause();
        o4t o4tVar = this.g0;
        if (o4tVar != null && o4tVar.b.isInitialized() && (currentScreen = o4tVar.d().b.getCurrentScreen()) != null) {
            currentScreen.i();
        }
        em6 currentScreen2 = go().b.getCurrentScreen();
        if (currentScreen2 != null) {
            currentScreen2.i();
        }
    }

    @Override // androidx.fragment.app.Fragment, xsna.h90.a
    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        super.onRequestPermissionsResult(i, strArr, iArr);
        h hVar = this.Y;
        if (hVar != null) {
            hVar.g.onRequestPermissionsResult(i, strArr, iArr);
        }
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onResume() {
        RecyclerView recyclerView;
        em6 currentScreen;
        super.onResume();
        o4t o4tVar = this.g0;
        if (o4tVar != null && o4tVar.b.isInitialized() && (currentScreen = o4tVar.d().b.getCurrentScreen()) != null && !currentScreen.d) {
            currentScreen.j();
        }
        em6 currentScreen2 = go().b.getCurrentScreen();
        if (currentScreen2 != null && !currentScreen2.d) {
            currentScreen2.j();
        }
        PermissionHelper permissionHelper = PermissionHelper.a;
        Context requireContext = requireContext();
        String[] strArr = PermissionHelper.c;
        permissionHelper.getClass();
        boolean c2 = PermissionHelper.c(requireContext, strArr);
        boolean z = !this.t0 && c2;
        this.t0 = c2;
        if (z) {
            io();
            return;
        }
        Context requireContext2 = requireContext();
        permissionHelper.getClass();
        if (PermissionHelper.c(requireContext2, strArr)) {
            PhotoSmallAdapter photoSmallAdapter = this.c0;
            if (photoSmallAdapter != null) {
                photoSmallAdapter.B0(jk90.a);
            }
            GalleryRecyclerView galleryRecyclerView = this.a0;
            if (galleryRecyclerView != null && (recyclerView = galleryRecyclerView.getRecyclerView()) != null) {
                recyclerView.invalidateItemDecorations();
            }
        }
        PhotoSmallAdapter photoSmallAdapter2 = this.c0;
        if (photoSmallAdapter2 != null && photoSmallAdapter2.E0() == 0 && this.k0) {
            ho();
            return;
        }
        if (this.v0 != null) {
            return;
        }
        im1 im1Var = this.e0;
        if (im1Var != null) {
            im1Var.a();
        }
        com.vk.lists.c cVar = this.f0;
        if (cVar != null) {
            cVar.p(false);
        }
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        ll9.b(bundle);
        bundle.putBoolean("SINGLE_MODE_KEY", this.u0);
        bundle.putBundle("COLLAGE_STATE", this.P0);
    }

    @Override // androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        GalleryPickerSourceConfiguration galleryPickerSourceConfiguration = this.R.E;
        FragmentActivity kn = kn();
        this.x0.getClass();
        if (galleryPickerSourceConfiguration.e) {
            HashSet hashSet = iah0.a;
            kn.setRequestedOrientation(fnj.d(kn) ? 14 : 1);
        } else if (galleryPickerSourceConfiguration.f) {
            kn.setRequestedOrientation(1);
        }
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onStop() {
        GalleryPickerSourceConfiguration galleryPickerSourceConfiguration = this.R.E;
        FragmentActivity kn = kn();
        this.x0.getClass();
        if (galleryPickerSourceConfiguration.e || galleryPickerSourceConfiguration.f) {
            kn.setRequestedOrientation(-1);
        }
        super.onStop();
    }

    /* JADX WARN: Type inference failed for: r0v25, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r11v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public void onViewCreated(final View view, Bundle bundle) {
        dqn0 vsj0Var;
        r3t r3tVar;
        String string;
        com.vk.attachpicker.fragment.gallery.c cVar;
        PhotoSmallAdapter photoSmallAdapter;
        kfi0 p3u0Var;
        kfi0 p3u0Var2;
        o4t o4tVar;
        RecyclerView recyclerView;
        PhotoSmallAdapter photoSmallAdapter2;
        PhotoSmallAdapter photoSmallAdapter3;
        r3t r3tVar2;
        kfi0 p3u0Var3;
        View view2;
        GalleryRecyclerView galleryRecyclerView;
        o4t o4tVar2;
        int i;
        GalleryRecyclerView galleryRecyclerView2;
        com.vk.attachpicker.fragment.gallery.c cVar2;
        r3t r3tVar3;
        kfi0 p3u0Var4;
        com.vk.attachpicker.fragment.gallery.c cVar3;
        GalleryRecyclerView galleryRecyclerView3;
        o4t o4tVar3;
        View view3;
        PhotoSmallAdapter photoSmallAdapter4;
        CustomSpinner customSpinner;
        super.onViewCreated(view, bundle);
        com.vk.attachpicker.b lo = lo();
        this.Q = lo;
        t4t t4tVar = this.R;
        int i2 = 16;
        myh myhVar = new myh(this, i2);
        dne dneVar = new dne(this, 25);
        ?? r11 = this.F0;
        String a2 = ((c6a0) r11.getValue()).a();
        StoryCameraParams storyCameraParams = this.J0;
        if (storyCameraParams != null) {
            String str = storyCameraParams.b;
        }
        r3t r3tVar4 = this.S;
        xpn0 xpn0Var = new xpn0(this, t4tVar, r3tVar4, this.W, myhVar, dneVar, a2);
        this.h0 = xpn0Var;
        final PhotoSmallAdapter photoSmallAdapter5 = new PhotoSmallAdapter(lo, new es8(), this.R.k, xpn0Var, this.q0.m(), new p70(1, this, lo), new ik90(this.R.k, requireContext(), new ldl(this, i2)), new i5f(this, 28));
        if (vua0.r()) {
            t4t t4tVar2 = this.R;
            if (t4tVar2.z) {
                photoSmallAdapter5.o = true;
            }
            if (t4tVar2.A) {
                photoSmallAdapter5.p = true;
            }
            if (t4tVar2.i) {
                int i3 = t4tVar2.k;
                if (i3 == 111) {
                    photoSmallAdapter5.m = true;
                    photoSmallAdapter5.n = true;
                } else if (i3 == 222) {
                    photoSmallAdapter5.m = true;
                } else if (i3 == 333) {
                    photoSmallAdapter5.n = true;
                }
            }
        }
        this.c0 = photoSmallAdapter5;
        xne0 xne0Var = new xne0(this, this.U, this.R.s, photoSmallAdapter5, new x3i(this, 12));
        this.T = xne0Var;
        t4t t4tVar3 = this.R;
        if (t4tVar3.r) {
            vsj0Var = new eoe0(this, t4tVar3, r3tVar4, this.W, xne0Var);
            r3tVar = r3tVar4;
        } else {
            vsj0Var = new vsj0(this, this.W, t4tVar3, r3tVar4, new q5f(this, 24));
            t4tVar3 = t4tVar3;
            r3tVar = r3tVar4;
        }
        this.i0 = vsj0Var;
        Context u = t4tVar3.E.i ? bwt0.u(requireContext()) : requireContext();
        t4t t4tVar4 = this.R;
        fm1 fm1Var = new fm1(u, t4tVar4.k, t4tVar4.x, new a(vsj0Var), this.q0.a());
        u3p0 u3p0Var = this.X;
        if (u3p0Var != null && (customSpinner = u3p0Var.c) != null) {
            fm1Var.a(customSpinner);
        }
        this.b0 = fm1Var;
        boolean z = this.R.E.e;
        Context requireContext = requireContext();
        wje wjeVar = new wje(this, 22);
        int i4 = this.R.k;
        c cVar4 = new c(photoSmallAdapter5, fm1Var);
        v3t v3tVar = new v3t(fm1Var, fm1.class, "currentAlbum", "getCurrentAlbum()Lcom/vk/mediastore/system/AlbumEntry;", 0);
        com.vk.toggle.b bVar = com.vk.toggle.b.A;
        ClipsFeatures clipsFeatures = ClipsFeatures.CLIPS_ENABLE_TWO_WAY_PAGINATION;
        h3t h3tVar = new h3t(requireContext, this.W, wjeVar, i4, cVar4, v3tVar, z, bVar.a(clipsFeatures));
        t4t t4tVar5 = this.R;
        GalleryPickerSourceConfiguration galleryPickerSourceConfiguration = t4tVar5.E;
        int i5 = t4tVar5.k;
        boolean z2 = galleryPickerSourceConfiguration.e;
        int i6 = R.string.picker_all_photos;
        if (z2) {
            if (i5 != 222) {
                i6 = i5 != 333 ? R.string.picker_albums : R.string.picker_all_videos;
            }
            Context context = e43.a;
            if (context == null) {
                context = null;
            }
            string = context.getString(i6);
        } else {
            if (i5 != 222) {
                i6 = i5 != 333 ? R.string.picker_all_photos_videos : R.string.picker_all_videos;
            }
            Context context2 = e43.a;
            if (context2 == null) {
                context2 = null;
            }
            string = context2.getString(i6);
        }
        this.e0 = new im1(requireContext(), this.W, this.R.k, string, new defpackage.m(18, fm1Var, this));
        int i7 = z ? 1073741823 : 100;
        boolean a3 = bVar.a(clipsFeatures);
        GalleryPickerSourceConfiguration galleryPickerSourceConfiguration2 = this.R.E;
        com.vk.lists.c cVar5 = new com.vk.lists.c(h3tVar, null, photoSmallAdapter5, null, true, 5, true, i7, 1073741823, (galleryPickerSourceConfiguration2.c || galleryPickerSourceConfiguration2.d == GalleryPickerSourceConfiguration.EntryPoint.IM) ? (j3t) this.G0.getValue() : null, "0", null, null, null, false, a3, true, true, true);
        this.f0 = cVar5;
        Wj(kn());
        FrameLayout frameLayout = (FrameLayout) view.findViewById(R.id.fl_permission_stub_container);
        bwt0.K(frameLayout);
        u3p0 u3p0Var2 = this.X;
        if (u3p0Var2 != null) {
            u3p0Var2.a.c(u3p0Var2.b);
        }
        this.Y = new h(this, dhr0.a, frameLayout, this.R.k, r870.a().e(), new com.vk.attachpicker.fragment.gallery.b(this), this.R.E, this.h0 != null ? Boolean.valueOf(vua0.r()) : null);
        ContextProgressView contextProgressView = (ContextProgressView) view.findViewById(R.id.cpv_progress);
        contextProgressView.getViewTreeObserver().addOnPreDrawListener(new z3t(contextProgressView, this));
        this.Z = contextProgressView;
        boolean z3 = this.y0;
        if (z3) {
            FrameLayout frameLayout2 = (FrameLayout) bwt0.p(view, R.id.fl_samsung_photopicker_stub_view, null, null, 6);
            fy90 fy90Var = new fy90(bwt0.u(requireContext()));
            bwt0.p0(fy90Var.findViewById(R.id.tv_icon), true);
            TextView textView = (TextView) bwt0.p(fy90Var, R.id.tv_message, null, null, 6);
            textView.setText(textView.getResources().getString(R.string.failed_permission_migration_message));
            textView.setTextColor(dhr0.t.c(R.attr.vk_ui_text_secondary));
            bwt0.p0(textView, true);
            ((TextView) bwt0.p(fy90Var, R.id.tv_grant_permissions, null, null, 6)).setVisibility(8);
            TextView textView2 = (TextView) bwt0.p(fy90Var, R.id.tv_other_permission, null, null, 6);
            textView2.setVisibility(0);
            textView2.setText(R.string.vk_permissions_no_permissions_open_gallery);
            bwt0.i0(textView2, new t3h(this, 22));
            eqy<bek0> eqyVar = com.vk.toggle.d.a;
            if (this.h0 != null && vua0.r()) {
                VkSimpleButton vkSimpleButton = new VkSimpleButton(requireContext(), null, 6);
                vkSimpleButton.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
                vkSimpleButton.setText(R.string.story_open_camera);
                f4m.t(iah0.a(16), vkSimpleButton);
                vkSimpleButton.setAppearance(VkButton.Appearance.Accent);
                vkSimpleButton.setSize(VkButton.Size.Medium);
                vkSimpleButton.setMode(VkButton.Mode.Primary);
                bwt0.i0(vkSimpleButton, new ozh(this, 17));
                ((LinearLayout) fy90Var.findViewById(R.id.root_container_permission)).addView(vkSimpleButton);
            }
            frameLayout2.addView(fy90Var);
            PermissionHelper.a.getClass();
            hg1.a(PermissionHelper.r(PermissionHelper.e).subscribe(new k41(new cvh(frameLayout2, 10), 20)), getViewLifecycleOwner());
            hg1.a(ihs.b.subscribe(new bw(new h1(14, frameLayout2, this), 28)), getViewLifecycleOwner());
        }
        PermissionHelper.a.getClass();
        String[] strArr = PermissionHelper.c;
        hg1.a(PermissionHelper.r(strArr).subscribe(new jz(new wpg(this, 17), 20)), getViewLifecycleOwner());
        this.t0 = PermissionHelper.c(requireContext(), strArr);
        final GalleryRecyclerView galleryRecyclerView4 = (GalleryRecyclerView) view.findViewById(R.id.rv_gallery);
        AbstractPaginatedView.LayoutType layoutType = AbstractPaginatedView.LayoutType.GRID;
        galleryRecyclerView4.getClass();
        new AbstractPaginatedView.d(layoutType, galleryRecyclerView4).a();
        galleryRecyclerView4.setAdapter(photoSmallAdapter5);
        galleryRecyclerView4.setSwipeRefreshEnabled(false);
        galleryRecyclerView4.setUiStateCallbacks(new a4t(this));
        if (this.R.q) {
            galleryRecyclerView4.setDividerSize(iah0.a(3));
        }
        t4t t4tVar6 = this.R;
        galleryRecyclerView4.setColumnWidthResId(t4tVar6.h ? R.dimen.picker_graffiti_size : (t4tVar6.o || t4tVar6.p) ? R.dimen.picker_item_long_size_image : R.dimen.picker_item_size_image);
        Integer num = this.R.G;
        mo(galleryRecyclerView4, num != null ? num.intValue() : this.q0.c(galleryRecyclerView4.getContext(), false));
        galleryRecyclerView4.setSpanCount(3);
        GalleryGridSpanStyle k = this.q0.k();
        GalleryHeaderButtonStyle m = this.q0.m();
        s4t b2 = this.q0.b();
        galleryRecyclerView4.T = k;
        galleryRecyclerView4.U = m;
        galleryRecyclerView4.V = b2;
        RecyclerView recyclerView2 = galleryRecyclerView4.getRecyclerView();
        if (z3) {
            hg1.b(recyclerView2, ihs.b.subscribe(new lz(new xcd(recyclerView2, 23), 15)));
        }
        recyclerView2.setHasFixedSize(true);
        RecyclerView.l itemAnimator = recyclerView2.getItemAnimator();
        if (itemAnimator != null) {
            itemAnimator.t();
        }
        galleryRecyclerView4.getRecyclerView().setClipChildren(this.q0.l());
        this.a0 = galleryRecyclerView4;
        o4t o4tVar4 = new o4t(kn(), this.I0, new gea0(galleryRecyclerView4, photoSmallAdapter5), this.R, this.q0.j(requireContext()), lo, new g(cVar5, this), fo(), this.V, rwi.d().p().a(this), new y3i(cVar5, 12), new x5i(this, 21));
        o4tVar4.p = (c6a0) r11.getValue();
        this.g0 = o4tVar4;
        cVar5.b(galleryRecyclerView4, false, false, 0L, null);
        GalleryPickerSourceConfiguration galleryPickerSourceConfiguration3 = this.R.E;
        int i8 = 5;
        if (galleryPickerSourceConfiguration3.b || galleryPickerSourceConfiguration3.e || galleryPickerSourceConfiguration3.d == GalleryPickerSourceConfiguration.EntryPoint.IM) {
            this.d0 = wjf0.b(photoSmallAdapter5, new xt9(this, photoSmallAdapter5, lo, i8));
        }
        t4t t4tVar7 = this.R;
        z4f z4fVar = new z4f(this, 26);
        b4t b4tVar = new b4t(2, this, GalleryFragmentImpl.class, "showAlertSnackBar", "showAlertSnackBar(ILjava/lang/Integer;)V", 0);
        u3p0 u3p0Var3 = this.X;
        xne0 xne0Var2 = this.T;
        List<? extends r3u0> list = this.V;
        final com.vk.attachpicker.fragment.gallery.c cVar6 = new com.vk.attachpicker.fragment.gallery.c(this, t4tVar7, z4fVar, b4tVar, this.w0, u3p0Var3, xne0Var2, r3tVar, list, this.J0, this.L0);
        GalleryPickerSourceConfiguration galleryPickerSourceConfiguration4 = t4tVar7.E;
        boolean z4 = t4tVar7.r;
        boolean z5 = galleryPickerSourceConfiguration4.e;
        boolean z6 = galleryPickerSourceConfiguration4.h;
        if (z5) {
            d4t d4tVar = new d4t(cVar6, galleryRecyclerView4, view, lo, photoSmallAdapter5);
            com.vk.attachpicker.b bVar2 = lo;
            RecyclerView recyclerView3 = galleryRecyclerView4.getRecyclerView();
            l7v b3 = pla.e().b();
            if (!z4) {
                cVar2 = cVar6;
                r3tVar3 = r3tVar;
                if (z6) {
                    p3u0Var4 = new e3f(recyclerView3, bVar2, t4tVar7, b3, r3tVar3, photoSmallAdapter5);
                    photoSmallAdapter4 = photoSmallAdapter5;
                } else {
                    cVar3 = cVar2;
                    galleryRecyclerView3 = galleryRecyclerView4;
                    o4tVar3 = o4tVar4;
                    view3 = view;
                    p3u0Var4 = new p3u0(o4tVar3, recyclerView3, bVar2, t4tVar7, b3, r3tVar3, list, photoSmallAdapter5, d4tVar);
                    bVar2 = bVar2;
                    r3tVar3 = r3tVar3;
                    photoSmallAdapter4 = photoSmallAdapter5;
                    h4t h4tVar = new h4t(o4tVar3, o4t.class, "isShowing", "isShowing()Z", 0);
                    r3t r3tVar5 = r3tVar3;
                    pvh pvhVar = new pvh(cVar3, 7);
                    yf7 yf7Var = new yf7(photoSmallAdapter4, cVar3, bVar2, 5);
                    com.vk.attachpicker.b bVar3 = bVar2;
                    kfi0 kfi0Var = p3u0Var4;
                    b.c tul0Var = new tul0(bVar3, kfi0Var, r3tVar5, h4tVar, pvhVar, b4tVar, yf7Var);
                    galleryRecyclerView3.getRecyclerView().addOnItemTouchListener(kfi0Var);
                    b.d q7Var = new q7(photoSmallAdapter4, 22);
                    bVar3.m(tul0Var);
                    bVar3.p(q7Var);
                    cVar3.a(view3, galleryRecyclerView3, photoSmallAdapter4);
                    cVar = cVar3;
                }
            } else {
                if (xne0Var2 == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                cVar2 = cVar6;
                r3tVar3 = r3tVar;
                p3u0Var4 = new boe0(recyclerView3, bVar2, t4tVar7, b3, r3tVar3, xne0Var2, photoSmallAdapter5);
                photoSmallAdapter4 = photoSmallAdapter5;
            }
            cVar3 = cVar2;
            o4tVar3 = o4tVar4;
            galleryRecyclerView3 = galleryRecyclerView4;
            view3 = view;
            h4t h4tVar2 = new h4t(o4tVar3, o4t.class, "isShowing", "isShowing()Z", 0);
            r3t r3tVar52 = r3tVar3;
            pvh pvhVar2 = new pvh(cVar3, 7);
            yf7 yf7Var2 = new yf7(photoSmallAdapter4, cVar3, bVar2, 5);
            com.vk.attachpicker.b bVar32 = bVar2;
            kfi0 kfi0Var2 = p3u0Var4;
            b.c tul0Var2 = new tul0(bVar32, kfi0Var2, r3tVar52, h4tVar2, pvhVar2, b4tVar, yf7Var2);
            galleryRecyclerView3.getRecyclerView().addOnItemTouchListener(kfi0Var2);
            b.d q7Var2 = new q7(photoSmallAdapter4, 22);
            bVar32.m(tul0Var2);
            bVar32.p(q7Var2);
            cVar3.a(view3, galleryRecyclerView3, photoSmallAdapter4);
            cVar = cVar3;
        } else {
            final com.vk.attachpicker.b bVar4 = lo;
            int i9 = 4;
            if (z6) {
                wzs wzsVar = new wzs() { // from class: xsna.c4t
                    @Override // xsna.wzs
                    public final Object invoke(Object obj, Object obj2) {
                        int intValue = ((Integer) obj).intValue();
                        MediaStoreEntry mediaStoreEntry = (MediaStoreEntry) obj2;
                        com.vk.attachpicker.fragment.gallery.c cVar7 = com.vk.attachpicker.fragment.gallery.c.this;
                        if (((Boolean) cVar7.c.invoke()).booleanValue() && cVar7.m) {
                            cVar7.c(galleryRecyclerView4, view, intValue, mediaStoreEntry);
                        } else {
                            bVar4.f(intValue - photoSmallAdapter5.K0(), null, mediaStoreEntry);
                        }
                        return s3q0.a;
                    }
                };
                com.vk.attachpicker.b bVar5 = bVar4;
                RecyclerView recyclerView4 = galleryRecyclerView4.getRecyclerView();
                l7v b4 = pla.e().b();
                if (!z4) {
                    photoSmallAdapter3 = photoSmallAdapter5;
                    r3tVar2 = r3tVar;
                    if (z6) {
                        p3u0Var3 = new e3f(recyclerView4, bVar5, t4tVar7, b4, r3tVar2, photoSmallAdapter3);
                        view2 = view;
                    } else {
                        view2 = view;
                        cVar = cVar6;
                        galleryRecyclerView = galleryRecyclerView4;
                        o4tVar2 = o4tVar4;
                        p3u0Var3 = new p3u0(o4tVar2, recyclerView4, bVar5, t4tVar7, b4, r3tVar2, list, photoSmallAdapter3, wzsVar);
                        bVar5 = bVar5;
                        r3tVar2 = r3tVar2;
                        photoSmallAdapter3 = photoSmallAdapter3;
                        b.c cci0Var = new cci0(p3u0Var3, r3tVar2, new f4t(o4tVar2, o4t.class, "isShowing", "isShowing()Z", 0), new ysd(photoSmallAdapter3, cVar, bVar5, i9));
                        galleryRecyclerView.getRecyclerView().addOnItemTouchListener(p3u0Var3);
                        b.d q7Var3 = new q7(photoSmallAdapter3, 22);
                        bVar5.m(cci0Var);
                        bVar5.p(q7Var3);
                        cVar.a(view2, galleryRecyclerView, photoSmallAdapter3);
                    }
                } else {
                    if (xne0Var2 == null) {
                        throw new IllegalArgumentException("Required value was null.");
                    }
                    r3tVar2 = r3tVar;
                    p3u0Var3 = new boe0(recyclerView4, bVar5, t4tVar7, b4, r3tVar2, xne0Var2, photoSmallAdapter5);
                    view2 = view;
                    photoSmallAdapter3 = photoSmallAdapter5;
                }
                cVar = cVar6;
                o4tVar2 = o4tVar4;
                galleryRecyclerView = galleryRecyclerView4;
                b.c cci0Var2 = new cci0(p3u0Var3, r3tVar2, new f4t(o4tVar2, o4t.class, "isShowing", "isShowing()Z", 0), new ysd(photoSmallAdapter3, cVar, bVar5, i9));
                galleryRecyclerView.getRecyclerView().addOnItemTouchListener(p3u0Var3);
                b.d q7Var32 = new q7(photoSmallAdapter3, 22);
                bVar5.m(cci0Var2);
                bVar5.p(q7Var32);
                cVar.a(view2, galleryRecyclerView, photoSmallAdapter3);
            } else {
                cVar = cVar6;
                t4t t4tVar8 = t4tVar7;
                r3t r3tVar6 = r3tVar;
                if (galleryPickerSourceConfiguration4.f) {
                    RecyclerView recyclerView5 = galleryRecyclerView4.getRecyclerView();
                    l7v b5 = pla.e().b();
                    if (z4) {
                        if (xne0Var2 == null) {
                            throw new IllegalArgumentException("Required value was null.");
                        }
                        p3u0Var2 = new boe0(recyclerView5, bVar4, t4tVar8, b5, r3tVar6, xne0Var2, photoSmallAdapter5);
                        recyclerView = recyclerView5;
                        photoSmallAdapter2 = photoSmallAdapter5;
                    } else if (z6) {
                        p3u0Var2 = new e3f(recyclerView5, bVar4, t4tVar8, b5, r3tVar6, photoSmallAdapter5);
                        recyclerView = recyclerView5;
                        photoSmallAdapter2 = photoSmallAdapter5;
                    } else {
                        o4tVar = o4tVar4;
                        p3u0Var2 = new p3u0(o4tVar, recyclerView5, bVar4, t4tVar8, b5, r3tVar6, list, photoSmallAdapter5, null);
                        recyclerView = recyclerView5;
                        bVar4 = bVar4;
                        t4tVar8 = t4tVar8;
                        r3tVar6 = r3tVar6;
                        photoSmallAdapter2 = photoSmallAdapter5;
                        recyclerView.addOnItemTouchListener(p3u0Var2);
                        b.c h9fVar = new h9f(t4tVar8.I, bVar4, p3u0Var2, r3tVar6, new g4t(o4tVar, o4t.class, "isShowing", "isShowing()Z", 0), new i4h(photoSmallAdapter2, 25), new nef(cVar, 12), new sim(cVar, 6));
                        b.d e4tVar = new e4t(photoSmallAdapter2, 0);
                        bVar4.m(h9fVar);
                        bVar4.p(e4tVar);
                    }
                    o4tVar = o4tVar4;
                    recyclerView.addOnItemTouchListener(p3u0Var2);
                    b.c h9fVar2 = new h9f(t4tVar8.I, bVar4, p3u0Var2, r3tVar6, new g4t(o4tVar, o4t.class, "isShowing", "isShowing()Z", 0), new i4h(photoSmallAdapter2, 25), new nef(cVar, 12), new sim(cVar, 6));
                    b.d e4tVar2 = new e4t(photoSmallAdapter2, 0);
                    bVar4.m(h9fVar2);
                    bVar4.p(e4tVar2);
                } else {
                    q0 q0Var = galleryPickerSourceConfiguration4.c ? new q0(cVar, 5) : null;
                    RecyclerView recyclerView6 = galleryRecyclerView4.getRecyclerView();
                    l7v b6 = pla.e().b();
                    if (!z4) {
                        photoSmallAdapter = photoSmallAdapter5;
                        if (z6) {
                            p3u0Var = new e3f(recyclerView6, bVar4, t4tVar8, b6, r3tVar6, photoSmallAdapter);
                        } else {
                            p3u0Var = new p3u0(o4tVar4, recyclerView6, bVar4, t4tVar8, b6, r3tVar6, list, photoSmallAdapter, q0Var);
                            bVar4 = bVar4;
                            r3tVar6 = r3tVar6;
                            photoSmallAdapter = photoSmallAdapter;
                        }
                    } else {
                        if (xne0Var2 == null) {
                            throw new IllegalArgumentException("Required value was null.");
                        }
                        p3u0Var = new boe0(recyclerView6, bVar4, t4tVar8, b6, r3tVar6, xne0Var2, photoSmallAdapter5);
                        photoSmallAdapter = photoSmallAdapter5;
                    }
                    b.c cci0Var3 = new cci0(p3u0Var, r3tVar6, new f4t(o4tVar4, o4t.class, "isShowing", "isShowing()Z", 0), new ysd(photoSmallAdapter, cVar, bVar4, i9));
                    galleryRecyclerView4.getRecyclerView().addOnItemTouchListener(p3u0Var);
                    b.d q7Var4 = new q7(photoSmallAdapter, 22);
                    bVar4.m(cci0Var3);
                    bVar4.p(q7Var4);
                }
            }
        }
        this.v0 = cVar.j;
        ho();
        eqy<bek0> eqyVar2 = com.vk.toggle.d.a;
        if (bVar.a(Features.Type.FEATURE_CORE_NO_PERMISSION_PHOTO_PICKER) || z3) {
            b470 b470Var = this.o0;
            if (b470Var == null) {
                return;
            }
            boolean z7 = b470Var.b.j;
            if (z7) {
                i = 1;
            } else {
                if (z7) {
                    throw new NoWhenBranchMatchedException();
                }
                i = 10;
            }
            this.n0 = registerForActivityResult(i == 1 ? new ab0() : new ya0(i), new f(b470Var, this));
        }
        GalleryPickerSourceConfiguration galleryPickerSourceConfiguration5 = this.R.E;
        if ((galleryPickerSourceConfiguration5.b || galleryPickerSourceConfiguration5.e || galleryPickerSourceConfiguration5.h) && (galleryRecyclerView2 = this.a0) != null) {
            e5t e5tVar = new e5t(galleryRecyclerView2.getSpanCount(), new c5t(new WeakReference(galleryRecyclerView2), new b1j(this, 19)));
            galleryRecyclerView2.b(e5tVar.e);
            this.p0 = e5tVar;
        }
        if (bundle != null) {
            ll9.a(bundle);
            this.P0 = bundle.getBundle("COLLAGE_STATE");
        }
    }

    @Override // xsna.tvo.a
    public final void pc(int i, List<String> list) {
        h hVar = this.Y;
        if (hVar != null) {
            hVar.g.pc(i, list);
        }
    }

    @Override // xsna.p3t
    public final LinearLayout t9() {
        FragmentActivity activity = getActivity();
        if (activity != null) {
            return (LinearLayout) Wj(activity);
        }
        return null;
    }

    @Override // xsna.tvo.a
    public final void wi(int i, List<String> list) {
        h hVar = this.Y;
        if (hVar != null) {
            hVar.g.wi(i, list);
        }
    }

    @Override // xsna.p3t
    public final void yl(gzs<s3q0> gzsVar) {
        this.M0 = gzsVar;
    }

    @Override // xsna.p3t
    public final void zd(xwq xwqVar) {
        this.O0 = xwqVar;
    }
}
